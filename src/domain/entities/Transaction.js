const { BadRequestException } = require('../errors');
const { uuidv7 } = require('../../shared/utils/uuid');

/**
 * Transaction Entity (Domain Layer)
 * Tracks all balance changes (Top-up, Slot Rental, Renewal, Refund).
 */
class Transaction {
  constructor({
    id,
    userId,
    type = 'TOPUP',
    amount = 0,
    balanceBefore = 0,
    balanceAfter = 0,
    description = '',
    voucherCode = null,
    orderCode = null,
    status = 'SUCCESS',
    createdAt = null
  }) {
    this.id = id || uuidv7();
    this.userId = userId;
    this.orderCode = orderCode ? Number(orderCode) : null;
    const tUpper = String(type || 'TOPUP').toUpperCase();
    this.type = ['TOPUP', 'RENTAL', 'RENEWAL', 'REFUND'].includes(tUpper) ? tUpper : 'TOPUP';
    this.amount = parseInt(amount || 0, 10);
    this.balanceBefore = Math.max(0, parseInt(balanceBefore || 0, 10));
    this.balanceAfter = Math.max(0, parseInt(balanceAfter || 0, 10));
    this.description = String(description || '').trim();
    this.voucherCode = voucherCode ? String(voucherCode).trim().toUpperCase() : null;
    const sUpper = String(status || 'SUCCESS').toUpperCase();
    this.status = ['SUCCESS', 'PENDING', 'FAILED', 'CANCELLED'].includes(sUpper) ? sUpper : 'SUCCESS';
    this.createdAt = createdAt ? new Date(createdAt) : new Date();
  }

  validate() {
    if (!this.userId) {
      throw new BadRequestException('userId không được để trống trong giao dịch!');
    }
  }

  toPersistenceJson() {
    return {
      id: this.id,
      user_id: this.userId,
      order_code: this.orderCode,
      type: this.type,
      amount: this.amount,
      balance_before: this.balanceBefore,
      balance_after: this.balanceAfter,
      description: this.description,
      voucher_code: this.voucherCode,
      status: this.status,
      created_at: this.createdAt
    };
  }

  toPublicJson() {
    return {
      id: this.id,
      userId: this.userId,
      orderCode: this.orderCode,
      type: this.type,
      amount: this.amount,
      balanceBefore: this.balanceBefore,
      balanceAfter: this.balanceAfter,
      description: this.description,
      voucherCode: this.voucherCode,
      status: this.status,
      createdAt: this.createdAt ? this.createdAt.toISOString() : null
    };
  }
}

module.exports = Transaction;
