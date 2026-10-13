const { DateTimeUtil } = require('../../../shared/utils/dateTime');

/**
 * UserResponseDto (Application Layer - DTO)
 * Formats user entity into safe client response without password exposure.
 * Enums are returned in lowercase. Timestamps are formatted in Universal Coordinated Time (UTC / GMT+0).
 */
class UserResponseDto {
  constructor(user) {
    this.id = user.id;
    this.email = user.email;
    this.phone = user.phone;
    this.role = String(user.role || 'user').toLowerCase();
    this.status = String(user.status || 'active').toLowerCase();
    this.lastLoginAt = user.lastLoginAt ? DateTimeUtil.formatIso(user.lastLoginAt) : null;
    this.createdAt = user.createdAt ? DateTimeUtil.formatIso(user.createdAt) : null;
  }
}

module.exports = UserResponseDto;
