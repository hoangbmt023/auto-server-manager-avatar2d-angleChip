const { hashPassword, verifyPassword } = require('../../infrastructure/security/EncryptionService');
const UserMapper = require('../mappers/UserMapper');
const { ConflictException, UnauthorizedException, ForbiddenException, NotFoundException } = require('../../domain/errors');
const { DateTimeUtil } = require('../../shared/utils/dateTime');

/**
 * AuthService (Application Layer)
 * Manages user registration, login authentication, and profile checks.
 * Uses Custom Exceptions for standard error responses.
 */
class AuthService {
  constructor(userRepo) {
    this.userRepo = userRepo;
  }

  async register(registerDto) {
    registerDto.validate();

    // Check if email already exists
    const existingEmail = await this.userRepo.findByEmail(registerDto.email);
    if (existingEmail) {
      throw new ConflictException(`Email [${registerDto.email}] đã được sử dụng!`);
    }

    // Check if phone already exists (if provided)
    if (registerDto.phone) {
      const existingPhone = await this.userRepo.findByPhone(registerDto.phone);
      if (existingPhone) {
        throw new ConflictException(`Số điện thoại [${registerDto.phone}] đã được sử dụng!`);
      }
    }

    // Hash password with APP_SECRET and scrypt
    const hashedPassword = hashPassword(registerDto.password);
    const userEntity = UserMapper.toEntityFromRegisterDto(registerDto, hashedPassword);

    // Save to database (Single table: users -> NO transaction needed)
    const saved = await this.userRepo.save(userEntity);
    return UserMapper.toResponseDto(saved);
  }

  async login(loginDto) {
    loginDto.validate();

    let user = null;
    if (loginDto.email) {
      user = await this.userRepo.findByEmail(loginDto.email);
    } else if (loginDto.phone) {
      user = await this.userRepo.findByPhone(loginDto.phone);
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

    return UserMapper.toResponseDto(user);
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
