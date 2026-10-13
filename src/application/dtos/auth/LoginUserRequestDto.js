const { ValidationException } = require('../../../domain/errors');

/**
 * LoginUserRequestDto (Application Layer - DTO)
 * Sanitizes and validates user login credentials.
 */
class LoginUserRequestDto {
  constructor({ email = '', phone = '', password = '' } = {}) {
    this.email = (email || '').trim().toLowerCase();
    this.phone = (phone || '').trim();
    this.password = String(password || '');
  }

  validate() {
    const errors = {};
    if (!this.email && !this.phone) {
      errors.email = 'Vui lòng nhập Email hoặc Số điện thoại để đăng nhập!';
    }
    if (!this.password) {
      errors.password = 'Vui lòng nhập mật khẩu!';
    }
    if (Object.keys(errors).length > 0) {
      throw new ValidationException(errors, 'Không hợp lệ');
    }
  }
}

module.exports = LoginUserRequestDto;
