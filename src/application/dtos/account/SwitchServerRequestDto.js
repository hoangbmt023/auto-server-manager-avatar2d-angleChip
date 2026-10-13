const { ValidationException } = require('../../../domain/errors');

/**
 * SwitchServerRequestDto (Application Layer - DTO)
 */
class SwitchServerRequestDto {
  constructor({ id = '', newServerId = 0 } = {}) {
    this.id = (id || '').trim();
    this.newServerId = parseInt(newServerId, 10);
  }

  validate() {
    const errors = {};
    if (!this.id) {
      errors.id = 'Thiếu ID tài khoản cần chuyển server!';
    }
    if (this.newServerId !== 0 && this.newServerId !== 1) {
      errors.newServerId = 'Server mới không hợp lệ (0: Hoàn Mỹ, 1: Diệu Kỳ)!';
    }
    if (Object.keys(errors).length > 0) {
      throw new ValidationException(errors, 'Không hợp lệ');
    }
  }
}

module.exports = SwitchServerRequestDto;
