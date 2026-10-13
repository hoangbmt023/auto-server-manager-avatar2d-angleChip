const { ValidationException } = require('../../../domain/errors');

/**
  * SaveSystemConfigRequestDto (Application Layer - DTO)
  * Validates system configuration inputs from Settings form.
  */
class SaveSystemConfigRequestDto {
  constructor({
    appId = 'avatar_main',
    port = 3001,
    rmsMode = 'file',
    maxMemoryMb = 256,
    autoRestart = true,
    autoStart = true,
    password = '',
    gameJar = '',
    emulatorJar = '',
    javaPath = ''
  } = {}) {
    this.appId = (appId || '').trim();
    this.port = parseInt(port, 10);
    this.rmsMode = (rmsMode || 'file').trim();
    this.maxMemoryMb = parseInt(maxMemoryMb, 10);
    this.autoRestart = Boolean(autoRestart);
    this.autoStart = Boolean(autoStart);
    this.password = typeof password === 'string' ? password : '';
    this.gameJar = (gameJar || '').trim();
    this.emulatorJar = (emulatorJar || '').trim();
    this.javaPath = (javaPath || '').trim();
  }

  validate() {
    const errors = {};

    if (!this.appId) {
      errors.appId = 'Tên Hồ Sơ / App ID không được để trống!';
    }

    if (isNaN(this.port) || this.port < 1 || this.port > 65535) {
      errors.port = `Cổng Port [${this.port}] không hợp lệ (1 - 65535)!`;
    }

    if (isNaN(this.maxMemoryMb) || this.maxMemoryMb < 64) {
      errors.maxMemory = 'Bộ nhớ RAM tối đa phải là số nguyên từ 64MB trở lên!';
    }

    if (this.password && this.password.length < 4) {
      errors.password = 'Mật khẩu bảo vệ hệ thống phải từ 4 ký tự trở lên!';
    }

    if (Object.keys(errors).length > 0) {
      throw new ValidationException(errors, 'Không hợp lệ');
    }
  }
}

module.exports = SaveSystemConfigRequestDto;
