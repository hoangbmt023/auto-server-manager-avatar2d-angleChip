const Transaction = require('../../../domain/entities/Transaction');
const { BadRequestException } = require('../../../domain/errors');

/**
 * BillingUseCase (Application Layer)
 * Manages user balance, combined transaction & topup history, and voucher checks.
 */
class BillingUseCase {
  constructor(userRepo, transactionRepo, voucherRepo) {
    this.userRepo = userRepo;
    this.transactionRepo = transactionRepo;
    this.voucherRepo = voucherRepo;
  }

  async getCombinedHistory(userId, limit = 50, offset = 0) {
    if (!userId) throw new BadRequestException('Vui lòng đăng nhập!');
    const txs = await this.transactionRepo.findByUserId(userId, limit, offset);
    return txs.map(t => t.toPublicJson());
  }

  async topupBalance({ userId, amount, method = 'BANK_TRANSFER', description = '' }) {
    if (!userId) throw new BadRequestException('Vui lòng đăng nhập!');
    const addVal = parseInt(amount, 10);
    if (!addVal || addVal <= 0) {
      throw new BadRequestException('Số tiền nạp phải lớn hơn 0!');
    }

    const user = await this.userRepo.findById(userId);
    if (!user) throw new BadRequestException('Người dùng không tồn tại!');

    const balanceBefore = user.balance;
    const balanceAfter = balanceBefore + addVal;

    await this.userRepo.updateBalance(userId, addVal);

    const tx = new Transaction({
      userId,
      type: 'TOPUP',
      amount: addVal,
      balanceBefore,
      balanceAfter,
      description: description || `Nạp tiền tài khoản qua ${method}`,
      status: 'SUCCESS'
    });

    await this.transactionRepo.save(tx);

    return {
      transaction: tx.toPublicJson(),
      balance: balanceAfter
    };
  }

  async checkVoucher({ code, orderAmount = 0 }) {
    if (!code) throw new BadRequestException('Vui lòng nhập mã voucher!');
    const v = await this.voucherRepo.findByCode(code);
    if (!v) {
      throw new BadRequestException(`Mã voucher [${code.toUpperCase()}] không tồn tại!`);
    }
    if (!v.isValid()) {
      throw new BadRequestException(`Mã voucher [${code.toUpperCase()}] đã hết hạn hoặc hết lượt sử dụng!`);
    }
    const amount = Math.max(0, parseInt(orderAmount || 0, 10));
    if (amount > 0 && amount < v.minOrder) {
      throw new BadRequestException(`Đơn hàng tối thiểu để áp dụng mã này là ${v.minOrder.toLocaleString()}đ!`);
    }

    const discount = v.calculateDiscount(amount);
    return {
      code: v.code,
      discountPercent: v.discountPercent,
      discountAmount: v.discountAmount,
      minOrder: v.minOrder,
      calculatedDiscount: discount,
      isValid: true
    };
  }
}

module.exports = BillingUseCase;
