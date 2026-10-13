const { ValidationException } = require('../../../domain/errors');

/**
 * RegisterUserRequestDto (Application Layer - DTO)
 * Sanitizes and validates user registration payloads.
 */
class RegisterUserRequestDto {
  constructor({ email, password, phone = null, role = 'user' } = {}) {
    this.email = (email || '').trim().toLowerCase();
    this.password = String(password || '');
    this.phone = phone ? String(phone).trim() : null;
    this.role = (role || 'user').toLowerCase() === 'admin' ? 'admin' : 'user';
  }

  validate() {
    const errors = {};
    if (!this.email) {
      errors.email = 'Email không được để trống!';
    } else {
      const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      if (!emailRegex.test(this.email)) {
        errors.email = `Email [${this.email}] không đúng định dạng!`;
      }
    }

    if (!this.password || this.password.length < 6) {
      errors.password = 'Mật khẩu phải có tối thiểu 6 ký tự!';
    }

    if (this.phone) {
      const phoneRegex = /^[0-9+() -]{9,15}$/;
      if (!phoneRegex.test(this.phone)) {
        errors.phone = `Số điện thoại [${this.phone}] không đúng định dạng!`;
      }
    }

    if (Object.keys(errors).length > 0) {
      throw new ValidationException(errors, 'Không hợp lệ');
    }
  }
}

module.exports = RegisterUserRequestDto;
