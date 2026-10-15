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
    minOrder = 0,
    maxUses = 100,
    usedCount = 0,
    expiresAt = null,
    isActive = true,
    createdAt = null
  }) {
    this.id = id || uuidv7();
    this.code = String(code || '').trim().toUpperCase();
    this.discountPercent = Math.min(100, Math.max(0, parseInt(discountPercent || 0, 10)));
    this.discountAmount = Math.max(0, parseInt(discountAmount || 0, 10));
    this.minOrder = Math.max(0, parseInt(minOrder || 0, 10));
    this.maxUses = Math.max(1, parseInt(maxUses || 100, 10));
    this.usedCount = Math.max(0, parseInt(usedCount || 0, 10));
    this.expiresAt = expiresAt ? new Date(expiresAt) : null;
    this.isActive = Boolean(isActive);
    this.createdAt = createdAt ? new Date(createdAt) : new Date();
  }

  validate() {
    if (!this.code) {
      throw new BadRequestException('Mã voucher không được để trống!');
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
      min_order: this.minOrder,
      max_uses: this.maxUses,
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
      minOrder: this.minOrder,
      maxUses: this.maxUses,
      usedCount: this.usedCount,
      expiresAt: this.expiresAt ? this.expiresAt.toISOString() : null,
      isActive: this.isActive
    };
  }
}

module.exports = Voucher;
