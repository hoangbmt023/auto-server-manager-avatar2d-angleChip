const Account = require('../../../domain/entities/Account');
const Transaction = require('../../../domain/entities/Transaction');
const { BadRequestException } = require('../../../domain/errors');
const { formatMoney } = require('../../../shared/utils/formatters');

/**
 * RentSlotUseCase (Application Layer)
 * Handles rental of a new bot slot by a user:
 * - Validates inputs and duplicate account names.
 * - Computes pricing, duration discount, and voucher savings.
 * - Deducts user balance.
 * - Automatically allocates file, proxy, and server via ResourceAllocationEngine.
 * - Creates Account with rental expiration date.
 * - Records Transaction.
 */
class RentSlotUseCase {
  constructor(userRepo, accountRepo, transactionRepo, voucherRepo, allocationEngine, settingRepo) {
    this.userRepo = userRepo;
    this.accountRepo = accountRepo;
    this.transactionRepo = transactionRepo;
    this.voucherRepo = voucherRepo;
    this.allocationEngine = allocationEngine;
    this.settingRepo = settingRepo;
  }

  async execute({ userId, username, password, plan = 'UPXU', durationMonths = 1, voucherCode = null, note = '' }) {
    if (!userId) {
      throw new BadRequestException('Vui lòng đăng nhập để thuê nick bot!');
    }
    const cleanUsername = String(username || '').trim();
    if (!cleanUsername) {
      throw new BadRequestException('Tên tài khoản game không được để trống!');
    }

    // 1. Check if account with same username already exists
    const allAccounts = await this.accountRepo.findAll();
    const existing = allAccounts.find(a => a.username.toLowerCase() === cleanUsername.toLowerCase());
    if (existing) {
      throw new BadRequestException(`Tài khoản game [${cleanUsername}] đã tồn tại trong hệ thống!`);
    }

    // 2. Fetch User & check status
    const user = await this.userRepo.findById(userId);
    if (!user || user.status === 'BANNED') {
      throw new BadRequestException('Tài khoản người dùng không tồn tại hoặc đã bị khóa!');
    }

    // 3. Compute Pricing & Discounts
    const rules = await this.allocationEngine.getAllocationRules();
    const planKey = String(plan || 'UPXU').toUpperCase();
    const planConfig = rules.plans[planKey] || rules.plans.UPXU;
    const months = Math.max(1, parseInt(durationMonths || 1, 10));

    const baseMonthlyPrice = planConfig.priceMonth || 50000;
    const subtotal = baseMonthlyPrice * months;

    // Duration discount %
    const durationDiscountPercent = (rules.durationDiscounts && rules.durationDiscounts[months]) || 0;
    const durationSavings = Math.floor((subtotal * durationDiscountPercent) / 100);
    const amountAfterDurationDiscount = subtotal - durationSavings;

    // Voucher discount
    let voucherSavings = 0;
    let appliedVoucher = null;
    if (voucherCode) {
      const v = await this.voucherRepo.findByCode(voucherCode);
      if (v && v.isValid()) {
        const userUsage = await this.transactionRepo.countVoucherUsesByUser(userId, v.code);
        if (userUsage >= v.maxUsesPerUser) {
          throw new BadRequestException(`Bạn đã sử dụng mã giảm giá [${v.code}] đạt giới hạn cho phép (${v.maxUsesPerUser} lần/tài khoản)!`);
        }
        voucherSavings = v.calculateDiscount(amountAfterDurationDiscount);
        appliedVoucher = v;
      } else {
        throw new BadRequestException(`Mã giảm giá [${voucherCode}] không tồn tại hoặc đã hết hạn!`);
      }
    }

    const finalPrice = Math.max(0, amountAfterDurationDiscount - voucherSavings);

    // 4. Validate Balance
    if (user.balance < finalPrice) {
      throw new BadRequestException(
        `Số dư của bạn không đủ (${formatMoney(user.balance)}đ < ${formatMoney(finalPrice)}đ). Vui lòng nạp thêm tiền!`
      );
    }

    // 5. Automatic Resource Allocation
    const allocation = await this.allocationEngine.allocateResources(planKey, months);

    // 6. Deduct balance and record Transaction
    const balanceBefore = user.balance;
    const balanceAfter = balanceBefore - finalPrice;
    await this.userRepo.updateBalance(userId, -finalPrice);

    const tx = new Transaction({
      userId,
      type: 'RENTAL',
      amount: -finalPrice,
      balanceBefore,
      balanceAfter,
      description: `Thuê bot ${planConfig.name} (${months} tháng) cho nick [${cleanUsername}]`,
      voucherCode: appliedVoucher ? appliedVoucher.code : null,
      status: 'SUCCESS'
    });
    await this.transactionRepo.save(tx);

    // Increment voucher uses if applied
    if (appliedVoucher) {
      await this.voucherRepo.incrementUsedCount(appliedVoucher.code);
    }

    // 7. Calculate Rental Expiration Date
    // months * 30 days
    const expiresAt = new Date(Date.now() + months * 30 * 24 * 60 * 60 * 1000);

    // 8. Create and Save Account
    const newAccount = new Account({
      userId,
      username: cleanUsername,
      password: password || '',
      serverId: allocation.serverId,
      serverName: allocation.serverName,
      fileId: allocation.fileId,
      proxyId: allocation.proxyId,
      note: note || `Thuê gói ${planConfig.name} (${months}T)`,
      rentalExpiresAt: expiresAt,
      rentalPlan: planKey
    });

    await this.accountRepo.save(newAccount);

    return {
      account: newAccount.toPublicJson(),
      transaction: tx.toPublicJson(),
      remainingBalance: balanceAfter,
      pricing: {
        subtotal,
        durationDiscountPercent,
        durationSavings,
        voucherSavings,
        finalPrice
      }
    };
  }

  async renewSlot({ userId, accountId, durationMonths = 1, voucherCode = null }) {
    if (!userId) throw new BadRequestException('Vui lòng đăng nhập!');
    const account = await this.accountRepo.findById(accountId);
    if (!account) throw new BadRequestException('Tài khoản bot không tồn tại!');
    if (account.userId !== userId) throw new BadRequestException('Bạn không có quyền thao tác trên tài khoản này!');

    const user = await this.userRepo.findById(userId);
    if (!user || user.status === 'BANNED') throw new BadRequestException('Tài khoản bị khóa!');

    const rules = await this.allocationEngine.getAllocationRules();
    const planKey = account.rentalPlan || 'UPXU';
    const planConfig = rules.plans[planKey] || rules.plans.UPXU;
    const months = Math.max(1, parseInt(durationMonths || 1, 10));

    const subtotal = (planConfig.priceMonth || 50000) * months;
    const durationDiscountPercent = (rules.durationDiscounts && rules.durationDiscounts[months]) || 0;
    const durationSavings = Math.floor((subtotal * durationDiscountPercent) / 100);
    const amountAfterDurationDiscount = subtotal - durationSavings;

    let voucherSavings = 0;
    let appliedVoucher = null;
    if (voucherCode) {
      const v = await this.voucherRepo.findByCode(voucherCode);
      if (v && v.isValid()) {
        const userUsage = await this.transactionRepo.countVoucherUsesByUser(userId, v.code);
        if (userUsage >= v.maxUsesPerUser) {
          throw new BadRequestException(`Bạn đã sử dụng mã giảm giá [${v.code}] đạt giới hạn cho phép (${v.maxUsesPerUser} lần/tài khoản)!`);
        }
        voucherSavings = v.calculateDiscount(amountAfterDurationDiscount);
        appliedVoucher = v;
      } else {
        throw new BadRequestException(`Mã giảm giá [${voucherCode}] không tồn tại hoặc đã hết hạn!`);
      }
    }

    const finalPrice = Math.max(0, amountAfterDurationDiscount - voucherSavings);
    if (user.balance < finalPrice) {
      throw new BadRequestException(`Số dư không đủ (${formatMoney(user.balance)}đ < ${formatMoney(finalPrice)}đ)!`);
    }

    const balanceBefore = user.balance;
    const balanceAfter = balanceBefore - finalPrice;
    await this.userRepo.updateBalance(userId, -finalPrice);

    const tx = new Transaction({
      userId,
      type: 'RENEWAL',
      amount: -finalPrice,
      balanceBefore,
      balanceAfter,
      description: `Gia hạn bot ${planConfig.name} (${months} tháng) cho nick [${account.username}]`,
      voucherCode: appliedVoucher ? appliedVoucher.code : null,
      status: 'SUCCESS'
    });
    await this.transactionRepo.save(tx);

    if (appliedVoucher) {
      await this.voucherRepo.incrementUsedCount(appliedVoucher.code);
    }

    // Extend expiration: if already expired, start from now; otherwise add to current expiration
    const currentExpiry = account.rentalExpiresAt ? new Date(account.rentalExpiresAt).getTime() : Date.now();
    const baseTime = currentExpiry > Date.now() ? currentExpiry : Date.now();
    const newExpiresAt = new Date(baseTime + months * 30 * 24 * 60 * 60 * 1000);

    account.rentalExpiresAt = newExpiresAt;
    await this.accountRepo.save(account);

    return {
      account: account.toPublicJson(),
      transaction: tx.toPublicJson(),
      remainingBalance: balanceAfter
    };
  }
}

module.exports = RentSlotUseCase;
