const { ValidationException } = require('../../../domain/errors');

/**
 * SaveAccountRequestDto (Application Layer - DTO)
 * Sanitizes and validates account create/update payload at entry layer.
 */
class SaveAccountRequestDto {
  constructor({
    id = null,
    userId = null,
    username = '',
    password = '',
    serverId = 0,
    fileId = 'file_1',
    proxyId = null,
    note = '',
    ipSlot = 1,
    targetCoins = 0,
    upDays = 0,
    farmSettings = null,
    diamondSettings = null,
    fishSettings = null,
    sellOreSettings = null
  } = {}) {
    this.id = id;
    this.userId = userId || null;
    this.username = (username || '').trim();
    this.password = password || '';
    this.serverId = parseInt(serverId !== undefined ? serverId : 0, 10);
    this.fileId = (fileId || 'file_1').trim();
    this.proxyId = proxyId || null;
    this.note = (note || '').trim();
    this.ipSlot = parseInt(ipSlot !== undefined ? ipSlot : 1, 10);
    this.targetCoins = parseInt(targetCoins || 0, 10);
    this.upDays = parseInt(upDays || 0, 10);
    this.farmSettings = farmSettings;
    this.diamondSettings = diamondSettings;
    this.fishSettings = fishSettings;
    this.sellOreSettings = sellOreSettings;
  }

  validate() {
    const errors = {};
    if (!this.username) {
      errors.username = 'Tên tài khoản không được để trống!';
    }
    if (!this.id && !this.password) {
      errors.password = 'Mật khẩu tài khoản không được để trống!';
    }
    if (this.serverId !== 0 && this.serverId !== 1) {
      errors.serverId = 'Server không hợp lệ (0: Hoàn Mỹ, 1: Diệu Kỳ)!';
    }
    if (!this.fileId) {
      errors.fileId = 'Vui lòng chọn File hồ sơ cho tài khoản!';
    }
    if (isNaN(this.ipSlot) || this.ipSlot < 1) {
      errors.ipSlot = 'Vị trí IP Slot phải là số nguyên >= 1!';
    }
    if (Object.keys(errors).length > 0) {
      throw new ValidationException(errors, 'Không hợp lệ');
    }
  }
}

module.exports = SaveAccountRequestDto;
