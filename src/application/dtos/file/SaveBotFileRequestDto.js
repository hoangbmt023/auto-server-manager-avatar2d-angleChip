const { ValidationException } = require('../../../domain/errors');

/**
 * SaveBotFileRequestDto (Application Layer - DTO)
 */
class SaveBotFileRequestDto {
  constructor({
    id = null,
    name = '',
    gameJar = 'avatar_fish_build40.jar',
    modType = null,
    appId = null,
    maxAccounts = 6,
    proxy = null
  } = {}) {
    this.id = id;
    this.name = (name || '').trim();
    this.gameJar = (gameJar || 'avatar_fish_build40.jar').trim();
    this.modType = modType;
    this.appId = appId;
    this.maxAccounts = maxAccounts;
    this.proxy = proxy || {};
  }

  validate() {
    const errors = {};
    if (!this.name) {
      errors.name = 'Tên Profile/File không được để trống!';
    }
    const maxAcc = parseInt(this.maxAccounts, 10);
    if (isNaN(maxAcc) || maxAcc < 6) {
      errors.maxAccounts = 'Số nick tối đa phải là số nguyên từ 6 trở lên!';
    }
    if (Object.keys(errors).length > 0) {
      throw new ValidationException(errors, 'Không hợp lệ');
    }
  }
}

module.exports = SaveBotFileRequestDto;
