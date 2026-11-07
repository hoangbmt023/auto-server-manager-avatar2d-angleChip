const User = require('../../domain/entities/User');
const UserResponseDto = require('../dtos/auth/UserResponseDto');

/**
 * UserMapper (Application Layer - Mapper)
 * Converts between User entities, DTOs, and raw persistence records.
 */
class UserMapper {
  static toEntityFromRegisterDto(dto, hashedPassword) {
    return new User({
      email: dto.email,
      password: hashedPassword,
      phone: dto.phone,
      role: dto.role,
      status: dto.status || 'INACTIVE'
    });
  }

  static toResponseDto(entity) {
    if (!entity) return null;
    return new UserResponseDto(entity);
  }
}

module.exports = UserMapper;
