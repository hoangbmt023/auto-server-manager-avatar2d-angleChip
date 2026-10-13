const { hashPassword, verifyPassword } = require('../../infrastructure/security/EncryptionService');
const { defaultJwtService } = require('../../infrastructure/security/JwtService');
const UserMapper = require('../mappers/UserMapper');
const { ConflictException, UnauthorizedException, ForbiddenException, NotFoundException } = require('../../domain/errors');
const { DateTimeUtil } = require('../../shared/utils/dateTime');

/**
 * AuthService (Application Layer)
 * Manages user registration, login authentication, token refresh, and profile checks.
 * Uses Custom Exceptions for standard error responses and JWT for stateless authentication.
 */
class AuthService {
  constructor(userRepo, jwtService = defaultJwtService) {
    this.userRepo = userRepo;
    this.jwtService = jwtService;
  }

  async register(registerDto) {
    registerDto.validate();

    const normalizedEmail = registerDto.email.trim().toLowerCase();

    // Check if email already exists
    const existingEmail = await this.userRepo.findByEmail(normalizedEmail);
    if (existingEmail) {
      throw new ConflictException(`Email [${registerDto.email}] đã được sử dụng!`);
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
      { ...registerDto, email: normalizedEmail },
      hashedPassword
    );

    // Save to database
    const saved = await this.userRepo.save(userEntity);
    const userDto = UserMapper.toResponseDto(saved);

    // Generate JWT Tokens
    const accessToken = this.jwtService.generateAccessToken(saved);
    const refreshToken = this.jwtService.generateRefreshToken(saved);

    return {
      user: userDto,
      accessToken,
      refreshToken
    };
  }

  async login(loginDto) {
    loginDto.validate();

    let user = null;
    if (loginDto.email) {
      user = await this.userRepo.findByEmail(loginDto.email.trim().toLowerCase());
    } else if (loginDto.phone) {
      user = await this.userRepo.findByPhone(loginDto.phone.trim());
    }

    if (!user) {
      throw new UnauthorizedException('Tài khoản hoặc mật khẩu không chính xác!');
    }

    if (!user.isActive()) {
      throw new ForbiddenException('Tài khoản của bạn đã bị khóa hoặc chưa kích hoạt!');
    }

    const isMatch = verifyPassword(loginDto.password, user.password);
    if (!isMatch) {
      throw new UnauthorizedException('Tài khoản hoặc mật khẩu không chính xác!');
    }

    // Update last login timestamp
    await this.userRepo.updateLastLogin(user.id);
    user.lastLoginAt = DateTimeUtil.formatIso();

    const userDto = UserMapper.toResponseDto(user);

    // Generate JWT Tokens
    const accessToken = this.jwtService.generateAccessToken(user);
    const refreshToken = this.jwtService.generateRefreshToken(user);

    return {
      user: userDto,
      accessToken,
      refreshToken
    };
  }

  async refresh(refreshTokenStr) {
    if (!refreshTokenStr) {
      throw new UnauthorizedException('Refresh token không được để trống!');
    }

    const decoded = this.jwtService.verifyRefreshToken(refreshTokenStr);
    const user = await this.userRepo.findById(decoded.sub);

    if (!user) {
      throw new UnauthorizedException('Người dùng không tồn tại!');
    }

    if (!user.isActive()) {
      throw new ForbiddenException('Tài khoản của bạn đã bị khóa hoặc chưa kích hoạt!');
    }

    const newAccessToken = this.jwtService.generateAccessToken(user);
    return {
      accessToken: newAccessToken
    };
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
