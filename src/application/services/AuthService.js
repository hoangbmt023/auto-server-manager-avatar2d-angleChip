const { hashPassword, verifyPassword } = require('../../infrastructure/security/EncryptionService');
const { defaultJwtService } = require('../../infrastructure/security/JwtService');
const { defaultOtpCache } = require('../../infrastructure/cache/OtpCache');
const { defaultEmailService } = require('../../infrastructure/email/EmailService');
const MySqlRefreshTokenRepository = require('../../infrastructure/persistence/mysql/MySqlRefreshTokenRepository');
const config = require('../../../config');
const UserMapper = require('../mappers/UserMapper');
const { validatePassword } = require('../../domain/validation/passwordPolicy');
const {
  BadRequestException,
  ConflictException,
  UnauthorizedException,
  ForbiddenException,
  NotFoundException,
  TooManyRequestsException
} = require('../../domain/errors');
const { DateTimeUtil } = require('../../shared/utils/dateTime');

/**
 * AuthService (Application Layer)
 * Manages user registration with Email OTP verification, login authentication,
 * HttpOnly Cookie token refresh with DB Session Rotation, and password recovery.
 */
class AuthService {
  constructor(
    userRepo,
    jwtService = defaultJwtService,
    otpCache = defaultOtpCache,
    emailService = defaultEmailService,
    refreshTokenRepo = null
  ) {
    this.userRepo = userRepo;
    this.jwtService = jwtService;
    this.otpCache = otpCache;
    this.emailService = emailService;
    this.refreshTokenRepo = refreshTokenRepo;

    // In-memory brute-force protection: Tracks failed logins per email/phone
    this.failedLoginAttempts = new Map();
  }

  /**
   * Helper to check brute force login attempts
   */
  _checkBruteForce(identifier) {
    const key = String(identifier || '').trim().toLowerCase();
    const entry = this.failedLoginAttempts.get(key);
    if (!entry) return;

    const now = Date.now();
    // 15-minute lock window
    if (now - entry.firstFailedAt < 15 * 60 * 1000) {
      if (entry.attempts >= 5) {
        const remainingMin = Math.ceil((15 * 60 * 1000 - (now - entry.firstFailedAt)) / 60000);
        throw new TooManyRequestsException(
          `Bạn đã nhập sai mật khẩu quá 5 lần. Vui lòng thử lại sau ${remainingMin} phút để bảo vệ tài khoản!`
        );
      }
    } else {
      // Window expired -> reset
      this.failedLoginAttempts.delete(key);
    }
  }

  /**
   * Helper to record failed login attempt
   */
  _recordFailedLogin(identifier) {
    const key = String(identifier || '').trim().toLowerCase();
    const now = Date.now();
    const entry = this.failedLoginAttempts.get(key);

    if (!entry || (now - entry.firstFailedAt >= 15 * 60 * 1000)) {
      this.failedLoginAttempts.set(key, { attempts: 1, firstFailedAt: now });
    } else {
      entry.attempts += 1;
    }
  }

  /**
   * Helper to clear failed login attempts upon successful authentication
   */
  _clearFailedLogin(identifier) {
    const key = String(identifier || '').trim().toLowerCase();
    this.failedLoginAttempts.delete(key);
  }

  /**
   * Issues a signed refresh token and persists its SHA-256 hash in MySQL
   */
  async _issueRefreshToken(user, enforceLimit = true) {
    const refreshToken = this.jwtService.generateRefreshToken(user);

    if (this.refreshTokenRepo) {
      try {
        if (enforceLimit && typeof this.refreshTokenRepo.enforceDeviceLimit === 'function') {
          const maxDevices = config.security.maxActiveDevices || 5;
          const evictedCount = await this.refreshTokenRepo.enforceDeviceLimit(user.id, maxDevices);
          if (evictedCount > 0) {
            console.log(`ℹ️ [AuthService] Người dùng [${user.email || user.id}] đã vượt quá ${maxDevices} thiết bị. Đã thu hồi ${evictedCount} phiên cũ nhất (FIFO).`);
          }
        }

        const tokenHash = MySqlRefreshTokenRepository.hashToken(refreshToken);
        const expiresAt = new Date(Date.now() + 7 * 24 * 60 * 60 * 1000); // 7 days

        await this.refreshTokenRepo.save({
          userId: user.id,
          tokenHash,
          expiresAt
        });
      } catch (err) {
        console.warn('⚠️ [AuthService] Không thể lưu refresh token vào CSDL:', err.message);
      }
    }

    return refreshToken;
  }

  /**
   * User Registration with Email OTP requirement & Anti-Spam protection
   */
  async register(registerDto) {
    registerDto.validate();

    const normalizedEmail = registerDto.email.trim().toLowerCase();

    // Check anti-spam cooldown and hourly quota
    this.otpCache.assertCanSend(normalizedEmail);

    // Check if email already exists
    const existingUser = await this.userRepo.findByEmail(normalizedEmail);
    if (existingUser) {
      if (existingUser.status === 'ACTIVE') {
        throw new ConflictException(`Email [${registerDto.email}] đã được sử dụng!`);
      }
      // If user exists but is INACTIVE, resend activation OTP
      const otpCode = this.otpCache.generateCode();
      this.otpCache.set(`activate:${normalizedEmail}`, otpCode, { userId: existingUser.id });
      await this.emailService.sendActivationOtp(normalizedEmail, otpCode);

      return {
        message: 'Tài khoản đã tạo nhưng chưa kích hoạt. Mã OTP kích hoạt mới đã được gửi tới email của bạn.',
        email: normalizedEmail,
        requireOtp: true
      };
    }

    // Check if phone already exists (if provided)
    if (registerDto.phone) {
      const existingPhone = await this.userRepo.findByPhone(registerDto.phone.trim());
      if (existingPhone) {
        throw new ConflictException(`Số điện thoại [${registerDto.phone}] đã được sử dụng!`);
      }
    }

    // Hash password with bcrypt
    const hashedPassword = hashPassword(registerDto.password);
    const userEntity = UserMapper.toEntityFromRegisterDto(
      { ...registerDto, email: normalizedEmail, status: 'INACTIVE' },
      hashedPassword
    );

    // Save user with INACTIVE status
    const saved = await this.userRepo.save(userEntity);

    // Generate & send activation OTP
    const otpCode = this.otpCache.generateCode();
    this.otpCache.set(`activate:${normalizedEmail}`, otpCode, { userId: saved.id });
    await this.emailService.sendActivationOtp(normalizedEmail, otpCode);

    return {
      message: 'Đăng ký tài khoản thành công! Vui lòng nhập mã OTP đã gửi tới email để kích hoạt.',
      email: normalizedEmail,
      requireOtp: true
    };
  }

  /**
   * Resend OTP for either activation or password reset with Anti-Spam check
   */
  async sendOtp({ email, type = 'activate' }) {
    if (!email) {
      throw new BadRequestException('Email không được để trống!');
    }
    const normalizedEmail = email.trim().toLowerCase();
    const user = await this.userRepo.findByEmail(normalizedEmail);

    if (!user) {
      throw new NotFoundException(`Không tìm thấy tài khoản với email [${email}]!`);
    }

    // Check anti-spam cooldown and quota
    this.otpCache.assertCanSend(normalizedEmail);

    const otpCode = this.otpCache.generateCode();

    if (type === 'activate') {
      if (user.status === 'ACTIVE') {
        throw new BadRequestException('Tài khoản này đã được kích hoạt trước đó rồi!');
      }
      this.otpCache.set(`activate:${normalizedEmail}`, otpCode, { userId: user.id });
      await this.emailService.sendActivationOtp(normalizedEmail, otpCode);
      return { message: 'Mã xác thực kích hoạt mới đã được gửi tới email của bạn.' };
    }

    if (type === 'forgot_password' || type === 'reset_password') {
      if (user.status === 'BANNED') {
        throw new ForbiddenException('Tài khoản của bạn đã bị khóa bởi quản trị viên, không thể gửi mã!');
      }
      this.otpCache.set(`reset:${normalizedEmail}`, otpCode, { userId: user.id });
      await this.emailService.sendPasswordResetOtp(normalizedEmail, otpCode);
      return { message: 'Mã xác thực đặt lại mật khẩu đã được gửi tới email của bạn.' };
    }

    throw new BadRequestException(`Loại yêu cầu OTP không hợp lệ [${type}]!`);
  }

  /**
   * Activates user account with 6-digit OTP and generates initial tokens
   */
  async activateAccount({ email, otp }) {
    if (!email || !otp) {
      throw new BadRequestException('Email và mã OTP không được để trống!');
    }
    const normalizedEmail = email.trim().toLowerCase();
    const user = await this.userRepo.findByEmail(normalizedEmail);

    if (!user) {
      throw new NotFoundException(`Không tìm thấy tài khoản với email [${email}]!`);
    }

    const result = this.otpCache.verify(`activate:${normalizedEmail}`, otp);
    if (!result.valid) {
      throw new BadRequestException(result.message || 'Mã OTP không hợp lệ hoặc đã hết hạn!');
    }

    // Activate user
    user.status = 'ACTIVE';
    await this.userRepo.save(user);

    // Update last login
    await this.userRepo.updateLastLogin(user.id);
    user.lastLoginAt = DateTimeUtil.formatIso();

    const userDto = UserMapper.toResponseDto(user);
    const accessToken = this.jwtService.generateAccessToken(user);
    const refreshToken = await this._issueRefreshToken(user);

    return {
      message: 'Kích hoạt tài khoản thành công! Đăng nhập thành công.',
      user: userDto,
      accessToken,
      refreshToken
    };
  }

  /**
   * User login with brute-force protection & active status check
   */
  async login(loginDto) {
    loginDto.validate();

    const loginKey = loginDto.email || loginDto.phone;
    this._checkBruteForce(loginKey);

    let user = null;
    if (loginDto.email) {
      user = await this.userRepo.findByEmail(loginDto.email.trim().toLowerCase());
    } else if (loginDto.phone) {
      user = await this.userRepo.findByPhone(loginDto.phone.trim());
    }

    if (!user) {
      this._recordFailedLogin(loginKey);
      throw new UnauthorizedException('Tài khoản hoặc mật khẩu không chính xác!');
    }

    const isMatch = verifyPassword(loginDto.password, user.password);
    if (!isMatch) {
      this._recordFailedLogin(loginKey);
      throw new UnauthorizedException('Tài khoản hoặc mật khẩu không chính xác!');
    }

    // Success -> clear failed login attempts
    this._clearFailedLogin(loginKey);

    if (user.status === 'INACTIVE') {
      // Trigger new OTP if not currently under cooldown
      try {
        this.otpCache.assertCanSend(user.email);
        const otpCode = this.otpCache.generateCode();
        this.otpCache.set(`activate:${user.email}`, otpCode, { userId: user.id });
        await this.emailService.sendActivationOtp(user.email, otpCode);
      } catch (cooldownErr) {
        // Cooldown active -> already sent recently, don't spam duplicate email
      }

      const err = new ForbiddenException('Tài khoản chưa được kích hoạt! Vui lòng nhập mã OTP để kích hoạt tài khoản.');
      err.data = { email: user.email, requireOtp: true };
      throw err;
    }

    if (!user.isActive()) {
      throw new ForbiddenException('Tài khoản của bạn đã bị khóa hoặc vô hiệu hóa!');
    }

    // Update last login timestamp
    await this.userRepo.updateLastLogin(user.id);
    user.lastLoginAt = DateTimeUtil.formatIso();

    const userDto = UserMapper.toResponseDto(user);
    const accessToken = this.jwtService.generateAccessToken(user);
    const refreshToken = await this._issueRefreshToken(user);

    return {
      user: userDto,
      accessToken,
      refreshToken
    };
  }

  /**
   * Forgot password OTP request with Anti-Spam protection
   */
  async forgotPassword({ email }) {
    if (!email) {
      throw new BadRequestException('Email không được để trống!');
    }
    const normalizedEmail = email.trim().toLowerCase();
    const user = await this.userRepo.findByEmail(normalizedEmail);

    if (!user) {
      throw new NotFoundException(`Không tìm thấy người dùng với email [${email}]!`);
    }

    if (user.status === 'BANNED') {
      throw new ForbiddenException('Tài khoản của bạn đã bị khóa bởi quản trị viên, không thể khôi phục mật khẩu!');
    }

    // Check anti-spam cooldown and hourly limit
    this.otpCache.assertCanSend(normalizedEmail);

    const otpCode = this.otpCache.generateCode();
    this.otpCache.set(`reset:${normalizedEmail}`, otpCode, { userId: user.id });
    await this.emailService.sendPasswordResetOtp(normalizedEmail, otpCode);

    return {
      message: 'Mã xác nhận đặt lại mật khẩu đã được gửi đến email của bạn.',
      email: normalizedEmail
    };
  }

  /**
   * Verifies OTP for forgot password without consuming the OTP
   */
  async verifyForgotPassword({ email, otp }) {
    if (!email || !otp) {
      throw new BadRequestException('Email và mã OTP không được để trống!');
    }
    const normalizedEmail = email.trim().toLowerCase();
    const user = await this.userRepo.findByEmail(normalizedEmail);
    if (!user) {
      throw new NotFoundException(`Không tìm thấy tài khoản với email [${email}]!`);
    }

    if (user.status === 'BANNED') {
      throw new ForbiddenException('Tài khoản đã bị khóa bởi quản trị viên!');
    }

    // Verify OTP WITHOUT consuming it (consume = false)
    const result = this.otpCache.verify(`reset:${normalizedEmail}`, otp, false);
    if (!result.valid) {
      throw new BadRequestException(result.message || 'Mã OTP không hợp lệ hoặc đã hết hạn!');
    }

    return {
      valid: true,
      email: normalizedEmail,
      message: 'Mã xác thực OTP chính xác! Vui lòng tạo mật khẩu mới.'
    };
  }

  /**
   * Resets password with strong password policy & session invalidation
   */
  async resetPassword({ email, otp, newPassword }) {
    if (!email || !otp || !newPassword) {
      throw new BadRequestException('Email, mã OTP và mật khẩu mới không được để trống!');
    }

    // Enforce strong password complexity (8 chars, Upper, Lower, Number, Special)
    const passwordCheck = validatePassword(newPassword);
    if (!passwordCheck.isValid) {
      throw new BadRequestException(passwordCheck.message);
    }

    const normalizedEmail = email.trim().toLowerCase();
    const user = await this.userRepo.findByEmail(normalizedEmail);

    if (!user) {
      throw new NotFoundException(`Không tìm thấy tài khoản người dùng!`);
    }

    if (user.status === 'BANNED') {
      throw new ForbiddenException('Tài khoản đã bị khóa bởi quản trị viên!');
    }

    const result = this.otpCache.verify(`reset:${normalizedEmail}`, otp);
    if (!result.valid) {
      throw new BadRequestException(result.message || 'Mã OTP không hợp lệ hoặc đã hết hạn!');
    }

    // Update password
    user.password = hashPassword(newPassword);
    if (user.status === 'INACTIVE') {
      user.status = 'ACTIVE';
    }
    await this.userRepo.save(user);

    // Invalidate all existing sessions for this user in DB
    if (this.refreshTokenRepo) {
      await this.refreshTokenRepo.revokeAllForUser(user.id);
    }

    return {
      message: 'Đặt lại mật khẩu thành công! Bạn có thể đăng nhập ngay bây giờ.'
    };
  }

  /**
   * Refresh Token rotation with database verification
   */
  async refresh(refreshTokenStr) {
    if (!refreshTokenStr) {
      throw new UnauthorizedException('Refresh token không được để trống!');
    }

    // 1. Verify cryptographic JWT signature
    const decoded = this.jwtService.verifyRefreshToken(refreshTokenStr);

    // 2. Check token in MySQL session store if repository is wired
    if (this.refreshTokenRepo) {
      const tokenHash = MySqlRefreshTokenRepository.hashToken(refreshTokenStr);
      const tokenRecord = await this.refreshTokenRepo.findByTokenHash(tokenHash);

      if (!tokenRecord) {
        throw new UnauthorizedException('Phiên đăng nhập không hợp lệ hoặc đã bị thu hồi!');
      }

      // Token rotation: Invalidate old token immediately
      await this.refreshTokenRepo.revokeByTokenHash(tokenHash);
    }

    const user = await this.userRepo.findById(decoded.sub);
    if (!user) {
      throw new UnauthorizedException('Người dùng không tồn tại!');
    }

    if (!user.isActive()) {
      throw new ForbiddenException('Tài khoản của bạn đã bị khóa hoặc chưa kích hoạt!');
    }

    const newAccessToken = this.jwtService.generateAccessToken(user);
    const newRefreshToken = await this._issueRefreshToken(user, false);

    return {
      accessToken: newAccessToken,
      refreshToken: newRefreshToken,
      user: UserMapper.toResponseDto(user)
    };
  }

  /**
   * Revokes refresh token in database upon logout
   */
  async logout(refreshTokenStr) {
    if (refreshTokenStr && this.refreshTokenRepo) {
      try {
        const tokenHash = MySqlRefreshTokenRepository.hashToken(refreshTokenStr);
        await this.refreshTokenRepo.revokeByTokenHash(tokenHash);
      } catch (e) {
        // Ignore DB error during logout
      }
    }
    return { success: true, message: 'Đăng xuất thành công!' };
  }

  async getUserById(id) {
    const user = await this.userRepo.findById(id);
    if (!user) {
      throw new NotFoundException(`Không tìm thấy người dùng với ID [${id}]!`);
    }
    return UserMapper.toResponseDto(user);
  }

  async getAllUsers() {
    const users = await this.userRepo.findAll();
    return users.map(u => UserMapper.toResponseDto(u));
  }
}

module.exports = AuthService;
