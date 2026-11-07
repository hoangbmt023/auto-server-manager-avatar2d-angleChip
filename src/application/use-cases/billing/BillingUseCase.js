const Transaction = require('../../../domain/entities/Transaction');
const { BadRequestException, ForbiddenException, NotFoundException } = require('../../../domain/errors');
const { formatMoney } = require('../../../shared/utils/formatters');
const config = require('../../../../config');

/**
 * BillingUseCase (Application Layer)
 * Manages user balance, bonus top-up tiers, payOS payments, combined transaction history, and vouchers.
 */
class BillingUseCase {
  constructor(userRepo, transactionRepo, voucherRepo, settingRepo = null, payOsService = null, sseEventBus = null) {
    this.userRepo = userRepo;
    this.transactionRepo = transactionRepo;
    this.voucherRepo = voucherRepo;
    this.settingRepo = settingRepo;
    this.payOsService = payOsService;
    this.sseEventBus = sseEventBus;
  }

  async getCombinedHistory(userId, options = {}) {
    if (!userId) throw new BadRequestException('Vui lòng đăng nhập!');

    let page = 1;
    let limit = 15;
    let typeFilter = 'ALL';

    if (typeof options === 'number') {
      limit = options || 15;
      const offset = arguments[2] || 0;
      page = Math.floor(offset / limit) + 1;
    } else if (typeof options === 'object' && options !== null) {
      page = Math.max(1, parseInt(options.page || '1', 10));
      limit = Math.max(1, Math.min(100, parseInt(options.limit || '15', 10)));
      typeFilter = String(options.type || 'ALL').toUpperCase();
    }

    let types = null;
    if (typeFilter === 'TOPUP') {
      types = ['TOPUP'];
    } else if (typeFilter === 'RENTAL') {
      types = ['RENTAL', 'RENEWAL'];
    }

    const offset = (page - 1) * limit;

    const [txs, total] = await Promise.all([
      this.transactionRepo.findByUserId(userId, { limit, offset, types }),
      this.transactionRepo.countByUserId(userId, types)
    ]);

    const totalPages = Math.ceil(total / limit) || 1;
    const hasMore = page < totalPages;

    return {
      items: txs.map(t => t.toPublicJson()),
      pagination: {
        page,
        limit,
        total,
        totalPages,
        hasMore
      }
    };
  }

  async getTopupPolicy() {
    let topupSettings = null;
    let rules = null;
    try {
      if (this.settingRepo) {
        topupSettings = await this.settingRepo.get('topup_settings');
        rules = await this.settingRepo.get('rental_allocation_rules');
      }
    } catch (e) {}

    const bonusTiers = topupSettings?.bonusTiers || rules?.topupBonusTiers || [
      { minAmount: 50000, bonusPercent: 5, desc: 'Nạp từ 50.000đ tặng 5%' },
      { minAmount: 200000, bonusPercent: 10, desc: 'Nạp từ 200.000đ tặng 10%' },
      { minAmount: 500000, bonusPercent: 15, desc: 'Nạp từ 500.000đ tặng 15%' },
      { minAmount: 1000000, bonusPercent: 20, desc: 'Nạp từ 1.000.000đ tặng 20%' }
    ];

    const topupPresets = topupSettings?.presets || rules?.topupPresets || [10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000];
    const minAmount = topupSettings?.minAmount || 10000;

    const payosCfg = config.payos || {};
    const paymentCfg = config.payment || {};
    const isPayosEnabled = Boolean(payosCfg.enabled && payosCfg.clientId && payosCfg.apiKey && payosCfg.checksumKey);

    return {
      bonusTiers,
      topupPresets,
      minAmount,
      payos: {
        enabled: isPayosEnabled,
        bankAccount: payosCfg.bankAccount || paymentCfg.bankAccount || '',
        bankName: payosCfg.bankName || paymentCfg.bankName || '',
        accountName: payosCfg.accountName || paymentCfg.accountName || ''
      },
      bank: {
        bankName: paymentCfg.bankName || 'MBBank',
        bankAccount: paymentCfg.bankAccount || '',
        accountName: paymentCfg.accountName || ''
      }
    };
  }

  async topupBalance({ userId, amount, method = 'BANK_TRANSFER', description = '' }) {
    if (!userId) throw new BadRequestException('Vui lòng đăng nhập!');
    const rawAmount = parseInt(amount, 10);
    if (!rawAmount || rawAmount <= 0) {
      throw new BadRequestException('Số tiền nạp phải lớn hơn 0!');
    }

    const user = await this.userRepo.findById(userId);
    if (!user) throw new BadRequestException('Người dùng không tồn tại!');

    // 1. Calculate top-up bonus percent based on policy in DB
    let bonusPercent = 0;
    try {
      const policy = await this.getTopupPolicy();
      const eligibleTiers = (policy.bonusTiers || [])
        .filter(t => rawAmount >= t.minAmount)
        .sort((a, b) => b.minAmount - a.minAmount);
      if (eligibleTiers.length > 0) {
        bonusPercent = eligibleTiers[0].bonusPercent;
      }
    } catch (e) {}

    const bonusAmount = bonusPercent > 0 ? Math.round(rawAmount * (bonusPercent / 100)) : 0;
    const finalCredit = rawAmount + bonusAmount;

    const balanceBefore = user.balance;
    const balanceAfter = balanceBefore + finalCredit;

    await this.userRepo.updateBalance(userId, finalCredit);

    const desc = description || 'NAP AVATAR2D AUTO';

    const tx = new Transaction({
      userId,
      type: 'TOPUP',
      amount: finalCredit,
      balanceBefore,
      balanceAfter,
      description: desc,
      status: 'SUCCESS'
    });

    await this.transactionRepo.save(tx);

    if (this.sseEventBus) {
      try {
        this.sseEventBus.broadcast('balance-updated', { userId, newBalance: balanceAfter });
      } catch (e) {}
    }

    return {
      transaction: tx.toPublicJson(),
      balance: balanceAfter,
      bonusAmount,
      bonusPercent
    };
  }

  async createPayOsOrder({ userId, amount }) {
    if (!userId) throw new BadRequestException('Vui lòng đăng nhập!');
    if (!this.payOsService) throw new BadRequestException('Dịch vụ thanh toán payOS chưa khởi tạo!');

    const rawAmount = parseInt(amount, 10);
    if (!rawAmount || isNaN(rawAmount) || rawAmount < 10000) {
      throw new BadRequestException('Số tiền nạp tối thiểu qua payOS là 10.000 VNĐ!');
    }
    const MAX_TOPUP_AMOUNT = 50000000; // Giới hạn tối đa 50.000.000 VNĐ / giao dịch chống overflow
    if (rawAmount > MAX_TOPUP_AMOUNT) {
      throw new BadRequestException('Số tiền nạp tối đa mỗi giao dịch là 50.000.000 VNĐ!');
    }

    const user = await this.userRepo.findById(userId);
    if (!user) throw new BadRequestException('Người dùng không tồn tại!');

    // Calculate top-up bonus according to policy
    let bonusPercent = 0;
    try {
      const policy = await this.getTopupPolicy();
      const eligibleTiers = (policy.bonusTiers || [])
        .filter(t => rawAmount >= t.minAmount)
        .sort((a, b) => b.minAmount - a.minAmount);
      if (eligibleTiers.length > 0) {
        bonusPercent = eligibleTiers[0].bonusPercent;
      }
    } catch (e) {}

    const bonusAmount = bonusPercent > 0 ? Math.round(rawAmount * (bonusPercent / 100)) : 0;
    const finalCredit = rawAmount + bonusAmount;

    // Order code: unique integer
    const orderCode = Number(String(Date.now()).slice(-6) + Math.floor(Math.random() * 89 + 10));
    const description = `A2A ${orderCode}`;

    const host = config.payment?.publicAppUrl || process.env.PUBLIC_APP_URL || 'http://localhost:3001';
    const paymentData = await this.payOsService.createPaymentLink({
      orderCode,
      amount: rawAmount,
      description,
      cancelUrl: `${host}/?tab=topup&payos_status=CANCELLED`,
      returnUrl: `${host}/?tab=topup&payos_status=PAID`
    });

    // Save pending transaction with full credit amount (including bonus) and status 'PENDING'
    const pendingTx = new Transaction({
      userId,
      orderCode,
      type: 'TOPUP',
      amount: finalCredit,
      balanceBefore: user.balance,
      balanceAfter: user.balance,
      description,
      status: 'PENDING'
    });
    await this.transactionRepo.save(pendingTx);

    return {
      orderCode,
      amount: rawAmount,
      finalCredit,
      bonusAmount,
      bonusPercent,
      checkoutUrl: paymentData.checkoutUrl,
      qrCode: paymentData.qrCode,
      accountNumber: paymentData.accountNumber,
      accountName: paymentData.accountName,
      bin: paymentData.bin
    };
  }

  /**
   * Verify payOS order status upon client return and credit balance if paid
   */
  async verifyAndCompletePayOsOrder({ orderCode, userId }) {
    if (!orderCode) throw new BadRequestException('Mã đơn hàng không hợp lệ!');
    if (!userId) throw new BadRequestException('Vui lòng đăng nhập!');
    if (!this.payOsService) throw new BadRequestException('Dịch vụ payOS chưa khởi tạo!');

    // 1. Kiểm tra sự tồn tại và quyền sở hữu đơn hàng (Chống IDOR / Chiếm đoạt mã đơn)
    const tx = await this.transactionRepo.findByOrderCode ? await this.transactionRepo.findByOrderCode(orderCode) : null;
    if (!tx) {
      throw new NotFoundException('Không tìm thấy thông tin đơn hàng này trong hệ thống!');
    }
    if (tx.userId !== userId) {
      throw new ForbiddenException('Bạn không có quyền xác nhận đơn hàng này!');
    }

    const orderData = await this.payOsService.getPaymentLinkInformation(orderCode);
    const user = await this.userRepo.findById(userId);
    if (!user) throw new BadRequestException('Người dùng không tồn tại!');

    let isNewCredit = false;
    const rawAmount = orderData ? orderData.amount : tx.amount;

    let bonusAmount = 0;
    let bonusPercent = 0;

    // Xác định chính sách thưởng nạp từ transaction hoặc từ policy
    if (tx.amount && rawAmount > 0 && tx.amount > rawAmount) {
      bonusAmount = tx.amount - rawAmount;
      bonusPercent = Math.round((bonusAmount / rawAmount) * 100);
    } else {
      try {
        const policy = await this.getTopupPolicy();
        const eligibleTiers = (policy.bonusTiers || [])
          .filter(t => rawAmount >= t.minAmount)
          .sort((a, b) => b.minAmount - a.minAmount);
        if (eligibleTiers.length > 0) {
          bonusPercent = eligibleTiers[0].bonusPercent;
          bonusAmount = Math.round(rawAmount * (bonusPercent / 100));
        }
      } catch (e) {}
    }

    const finalCredit = rawAmount + bonusAmount;

    if (orderData && orderData.status === 'PAID') {
      // 2. Chống Race Condition: Sử dụng claimPendingTransaction mang tính nguyên tử (Atomic Update)
      // Chỉ tiến hành cộng tiền nếu chính tiến trình này chuyển đổi thành công từ PENDING sang SUCCESS
      const balanceBefore = user.balance;
      const balanceAfter = balanceBefore + finalCredit;

      let claimed = false;
      if (this.transactionRepo.claimPendingTransaction) {
        claimed = await this.transactionRepo.claimPendingTransaction(tx.id, {
          status: 'SUCCESS',
          amount: finalCredit,
          balanceBefore,
          balanceAfter,
          description: tx.description || `A2A ${orderCode}`
        });
      } else if (tx.status === 'PENDING') {
        claimed = true;
        await this.transactionRepo.update(tx.id, {
          status: 'SUCCESS',
          amount: finalCredit,
          balanceBefore,
          balanceAfter,
          description: tx.description || `A2A ${orderCode}`
        });
      }

      if (claimed) {
        await this.userRepo.updateBalance(userId, finalCredit);
        isNewCredit = true;
        if (this.sseEventBus) {
          try {
            this.sseEventBus.broadcast('balance-updated', { userId, newBalance: balanceAfter });
          } catch (e) {}
        }
      }
    } else if (orderData && (orderData.status === 'CANCELLED' || orderData.status === 'FAILED')) {
      if (this.transactionRepo.claimPendingTransaction) {
        await this.transactionRepo.claimPendingTransaction(tx.id, { status: 'CANCELLED' });
      } else if (tx.status === 'PENDING') {
        await this.transactionRepo.update(tx.id, { status: 'CANCELLED' });
      }
    }

    const updatedUser = await this.userRepo.findById(userId);

    return {
      orderCode: orderData.orderCode || orderCode,
      status: orderData.status,
      amount: rawAmount,
      isNewCredit,
      bonusAmount,
      bonusPercent,
      finalCredit,
      balance: updatedUser ? updatedUser.balance : user.balance
    };
  }

  /**
   * Explicitly cancel a pending payOS order and mark transaction CANCELLED
   */
  async cancelPayOsOrder({ orderCode, userId }) {
    if (!orderCode) throw new BadRequestException('Mã đơn hàng không hợp lệ!');
    if (!userId) throw new BadRequestException('Vui lòng đăng nhập!');

    const tx = await this.transactionRepo.findByOrderCode ? await this.transactionRepo.findByOrderCode(orderCode) : null;
    if (!tx) {
      throw new NotFoundException('Không tìm thấy thông tin đơn hàng này trong hệ thống!');
    }
    if (tx.userId !== userId) {
      throw new ForbiddenException('Bạn không có quyền thao tác trên đơn hàng này!');
    }

    if (tx.status === 'PENDING') {
      if (this.transactionRepo.claimPendingTransaction) {
        await this.transactionRepo.claimPendingTransaction(tx.id, { status: 'CANCELLED' });
      } else {
        await this.transactionRepo.update(tx.id, { status: 'CANCELLED' });
      }

      try {
        if (this.payOsService && this.payOsService.cancelPaymentLink) {
          await this.payOsService.cancelPaymentLink(orderCode, 'Người dùng hủy thanh toán');
        }
      } catch (e) {}
    }

    return {
      orderCode,
      status: 'CANCELLED',
      message: 'Giao dịch đã được hủy thành công!'
    };
  }

  async handlePayOsWebhook(webhookPayload) {
    if (!this.payOsService) return { success: false, message: 'No payOS service' };

    const isValid = await this.payOsService.verifyWebhookSignature(webhookPayload);
    if (!isValid) {
      throw new BadRequestException('Chữ ký webhook payOS không hợp lệ!');
    }

    const data = webhookPayload.data;
    if (webhookPayload.code !== '00' || !data) {
      return { success: true, message: 'Bỏ qua thanh toán không thành công' };
    }

    const { orderCode, amount } = data;

    // Locate the transaction directly by orderCode column
    const matchedTx = await this.transactionRepo.findByOrderCode ? await this.transactionRepo.findByOrderCode(orderCode) : null;
    const targetUserId = matchedTx ? matchedTx.userId : null;

    if (!targetUserId) {
      console.warn(`[payOS Webhook] Không tìm thấy transaction cho orderCode ${orderCode}`);
      return { success: false, message: 'Transaction not found' };
    }

    if (matchedTx.status === 'SUCCESS') {
      return { success: true, message: 'Đơn hàng đã được xử lý trước đó' };
    }

    const targetUser = await this.userRepo.findById(targetUserId);
    if (!targetUser) {
      return { success: false, message: 'User not found' };
    }

    let bonusPercent = 0;
    try {
      const policy = await this.getTopupPolicy();
      const eligibleTiers = (policy.bonusTiers || [])
        .filter(t => amount >= t.minAmount)
        .sort((a, b) => b.minAmount - a.minAmount);
      if (eligibleTiers.length > 0) {
        bonusPercent = eligibleTiers[0].bonusPercent;
      }
    } catch (e) {}

    const bonusAmount = bonusPercent > 0 ? Math.round(amount * (bonusPercent / 100)) : 0;
    const finalCredit = amount + bonusAmount;
    const balanceBefore = targetUser.balance;
    const balanceAfter = balanceBefore + finalCredit;

    // Chống Race Condition: Atomic claim transaction from PENDING to SUCCESS
    let claimed = false;
    if (this.transactionRepo.claimPendingTransaction) {
      claimed = await this.transactionRepo.claimPendingTransaction(matchedTx.id, {
        status: 'SUCCESS',
        amount: finalCredit,
        balanceBefore,
        balanceAfter,
        description: matchedTx.description || `A2A ${orderCode}`
      });
    } else {
      claimed = true;
      await this.transactionRepo.update(matchedTx.id, {
        status: 'SUCCESS',
        amount: finalCredit,
        balanceBefore,
        balanceAfter,
        description: matchedTx.description || `A2A ${orderCode}`
      });
    }

    if (!claimed) {
      return { success: true, message: 'Đơn hàng đã được xử lý bởi tiến trình khác!' };
    }

    await this.userRepo.updateBalance(targetUserId, finalCredit);

    if (this.sseEventBus) {
      try {
        this.sseEventBus.broadcast('balance-updated', { userId: targetUserId, newBalance: balanceAfter });
      } catch (e) {}
    }

    return { success: true, message: 'Đã cộng tiền tự động thành công!' };
  }

  /**
   * Admin adjusts balance for a user in database
   */
  async adminAdjustBalance({ adminUserId, targetUserId, amount, reason = '' }) {
    if (!targetUserId) throw new BadRequestException('Vui lòng chọn người dùng cần nạp/trừ tiền!');
    const diff = parseInt(amount, 10);
    if (!diff || diff === 0) throw new BadRequestException('Số tiền điều chỉnh phải khác 0!');

    const targetUser = await this.userRepo.findById(targetUserId);
    if (!targetUser) throw new BadRequestException('Người dùng không tồn tại trong hệ thống!');

    const balanceBefore = targetUser.balance;
    const balanceAfter = Math.max(0, balanceBefore + diff);

    await this.userRepo.updateBalance(targetUserId, diff);

    const desc = reason ? `Admin điều chỉnh: ${reason}` : (diff > 0 ? 'Admin cộng tiền vào tài khoản' : 'Admin trừ tiền tài khoản');
    const tx = new Transaction({
      userId: targetUserId,
      type: diff >= 0 ? 'TOPUP' : 'REFUND',
      amount: diff,
      balanceBefore,
      balanceAfter,
      description: desc,
      status: 'SUCCESS'
    });
    await this.transactionRepo.save(tx);

    if (this.sseEventBus) {
      try {
        this.sseEventBus.broadcast('balance-updated', { userId: targetUserId, newBalance: balanceAfter });
      } catch (e) {}
    }

    return {
      userId: targetUserId,
      balance: balanceAfter,
      adjustedAmount: diff,
      transaction: tx.toPublicJson()
    };
  }

  /**
   * Admin updates topup settings (presets, bonus tiers) in DB
   */
  async updateTopupSettings(settings) {
    if (!this.settingRepo) throw new BadRequestException('Setting repository chưa được cấu hình!');
    const current = (await this.settingRepo.get('topup_settings')) || {};
    const updated = {
      ...current,
      presets: Array.isArray(settings.presets) ? settings.presets.map(Number) : current.presets || [10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000],
      bonusTiers: Array.isArray(settings.bonusTiers) ? settings.bonusTiers : current.bonusTiers || [],
      minAmount: Number(settings.minAmount || current.minAmount || 10000)
    };
    await this.settingRepo.set('topup_settings', updated, 'Cấu hình mệnh giá nạp tiền và tỷ lệ thưởng nạp');
    return updated;
  }

  async checkVoucher({ code, orderAmount = 0, userId = null }) {
    if (!code) throw new BadRequestException('Vui lòng nhập mã voucher!');
    const v = await this.voucherRepo.findByCode(code);
    if (!v) {
      throw new BadRequestException(`Mã voucher [${code.toUpperCase()}] không tồn tại!`);
    }
    if (!v.isValid()) {
      throw new BadRequestException(`Mã voucher [${code.toUpperCase()}] đã hết hạn hoặc hết lượt sử dụng!`);
    }

    if (userId && this.transactionRepo) {
      const userUsage = await this.transactionRepo.countVoucherUsesByUser(userId, v.code);
      if (userUsage >= v.maxUsesPerUser) {
        throw new BadRequestException(`Bạn đã sử dụng mã [${v.code}] đạt giới hạn cho phép (${v.maxUsesPerUser} lần/tài khoản)!`);
      }
    }

    const amount = Math.max(0, parseInt(orderAmount || 0, 10));
    if (amount > 0 && amount < v.minOrder) {
      throw new BadRequestException(`Đơn hàng tối thiểu để áp dụng mã này là ${formatMoney(v.minOrder)}đ!`);
    }

    const discount = v.calculateDiscount(amount);
    return {
      code: v.code,
      discountPercent: v.discountPercent,
      discountAmount: v.discountAmount,
      maxDiscountAmount: v.maxDiscountAmount,
      minOrder: v.minOrder,
      maxUsesPerUser: v.maxUsesPerUser,
      calculatedDiscount: discount,
      isValid: true
    };
  }
}

module.exports = BillingUseCase;
