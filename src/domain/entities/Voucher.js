const { BadRequestException } = require('../errors');
const { uuidv7 } = require('../../shared/utils/uuid');

/**
 * Voucher Entity (Domain Layer)
 * Validates discount codes and computes promotional discount amounts.
 */
class Voucher {
  constructor({
    id,
    code,
    discountPercent = 0,
    discountAmount = 0,
    maxDiscountAmount = 0,
    minOrder = 0,
    maxUses = 100,
    maxUsesPerUser = 1,
    usedCount = 0,
    expiresAt = null,
    isActive = true,
    createdAt = null
  }) {
    this.id = id || uuidv7();
    this.code = String(code || '').trim().toUpperCase();
    this.discountPercent = Math.min(100, Math.max(0, parseInt(discountPercent || 0, 10)));
    this.discountAmount = Math.max(0, parseInt(discountAmount || 0, 10));
    this.maxDiscountAmount = Math.max(0, parseInt(maxDiscountAmount || 0, 10));
    this.minOrder = Math.max(0, parseInt(minOrder || 0, 10));
    this.maxUses = Math.max(1, parseInt(maxUses || 100, 10));
    this.maxUsesPerUser = Math.max(1, parseInt(maxUsesPerUser || 1, 10));
    this.usedCount = Math.max(0, parseInt(usedCount || 0, 10));
    this.expiresAt = expiresAt ? new Date(expiresAt) : null;
    this.isActive = Boolean(isActive);
    this.createdAt = createdAt ? new Date(createdAt) : new Date();
  }

  validate() {
    if (!this.code) {
      throw new BadRequestException('Mã voucher không được để trống!');
    }
    if (this.discountPercent <= 0 && this.discountAmount <= 0) {
      throw new BadRequestException('Voucher phải có mức giảm giá theo % (> 0%) hoặc số tiền thực tế (> 0đ)!');
    }
    if (this.maxUsesPerUser < 1) {
      throw new BadRequestException('Số lượt dùng mỗi tài khoản phải từ 1 trở lên!');
    }
  }

  isValid() {
    if (!this.isActive) return false;
    if (this.usedCount >= this.maxUses) return false;
    if (this.expiresAt && this.expiresAt.getTime() < Date.now()) return false;
    return true;
  }

  calculateDiscount(orderAmount) {
    if (!this.isValid()) return 0;
    const amount = Math.max(0, parseInt(orderAmount || 0, 10));
    if (amount < this.minOrder) return 0;

    let discount = 0;
    if (this.discountPercent > 0) {
      discount = Math.floor((amount * this.discountPercent) / 100);
      if (this.maxDiscountAmount > 0) {
        discount = Math.min(discount, this.maxDiscountAmount);
      }
    } else if (this.discountAmount > 0) {
      discount = Math.min(amount, this.discountAmount);
    }
    return discount;
  }

  toPersistenceJson() {
    return {
      id: this.id,
      code: this.code,
      discount_percent: this.discountPercent,
      discount_amount: this.discountAmount,
      max_discount_amount: this.maxDiscountAmount,
      min_order: this.minOrder,
      max_uses: this.maxUses,
      max_uses_per_user: this.maxUsesPerUser,
      used_count: this.usedCount,
      expires_at: this.expiresAt,
      is_active: this.isActive ? 1 : 0
    };
  }

  toPublicJson() {
    return {
      id: this.id,
      code: this.code,
      discountPercent: this.discountPercent,
      discountAmount: this.discountAmount,
      maxDiscountAmount: this.maxDiscountAmount,
      minOrder: this.minOrder,
      maxUses: this.maxUses,
      maxUsesPerUser: this.maxUsesPerUser,
      usedCount: this.usedCount,
      expiresAt: this.expiresAt ? this.expiresAt.toISOString() : null,
      isActive: this.isActive
    };
  }
}

module.exports = Voucher;
