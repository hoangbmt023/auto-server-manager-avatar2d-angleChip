const { ValidationException } = require('../../../domain/errors');

/**
 * UpdateAccountSetupRequestDto (Application Layer - DTO)
 * Validates account bot configurations (Rental, Farm, Fish, Diamond, SellOre).
 */
class UpdateAccountSetupRequestDto {
  constructor({
    targetCoins = undefined,
    upDays = undefined,
    farmSettings = undefined,
    diamondSettings = undefined,
    fishSettings = undefined,
    sellOreSettings = undefined
  } = {}) {
    this.targetCoins = targetCoins !== undefined ? Number(targetCoins) : undefined;
    this.upDays = upDays !== undefined ? Number(upDays) : undefined;
    this.farmSettings = farmSettings;
    this.diamondSettings = diamondSettings;
    this.fishSettings = fishSettings;
    this.sellOreSettings = sellOreSettings;
  }

  validate() {
    const errors = {};

    if (this.targetCoins !== undefined) {
      if (isNaN(this.targetCoins) || this.targetCoins < 0) {
        errors.targetCoins = 'Mục tiêu xu phải là số nguyên >= 0!';
      }
    }

    if (this.upDays !== undefined) {
      if (isNaN(this.upDays) || this.upDays < 0) {
        errors.upDays = 'Số ngày thuê phải là số nguyên >= 0!';
      }
    }

    if (this.farmSettings && typeof this.farmSettings === 'object') {
      if (this.farmSettings.sellThreshold !== undefined && Number(this.farmSettings.sellThreshold) < 0) {
        errors.sellThreshold = 'Ngưỡng bán nông sản phải >= 0!';
      }
      if (this.farmSettings.sellQuantity !== undefined && Number(this.farmSettings.sellQuantity) < 1) {
        errors.sellQuantity = 'Số lượng bán mỗi lần phải >= 1!';
      }
    }

    if (this.sellOreSettings && typeof this.sellOreSettings === 'object') {
      if (this.sellOreSettings.sellIntervalMinutes !== undefined && Number(this.sellOreSettings.sellIntervalMinutes) < 1) {
        errors.sellIntervalMinutes = 'Thời gian giãn cách bán đá phải >= 1 phút!';
      }
    }

    if (this.diamondSettings && typeof this.diamondSettings === 'object') {
      if (this.diamondSettings.farmIntervalMinutes !== undefined && Number(this.diamondSettings.farmIntervalMinutes) < 1) {
        errors.farmIntervalMinutes = 'Thời gian kiểm tra nông trại phải >= 1 phút!';
      }
    }

    if (Object.keys(errors).length > 0) {
      throw new ValidationException(errors, 'Không hợp lệ');
    }
  }
}

module.exports = UpdateAccountSetupRequestDto;
