const Account = require('../../../domain/entities/Account');
const Transaction = require('../../../domain/entities/Transaction');
const { BadRequestException } = require('../../../domain/errors');
const { formatMoney } = require('../../../shared/utils/formatters');
const AsyncMutex = require('../../../shared/utils/AsyncMutex');

/**
 * RentSlotUseCase (Application Layer)
 * Handles rental and renewal of bot slots:
 * - Validates inputs and duplicate account names.
 * - Computes pricing, duration discount, and voucher savings.
 * - Deducts user balance with safe rollback guarantee.
 * - Enforces Zero Direct IP policy (100% bots require active proxy).
 * - Sequential execution via shared AsyncMutex to eliminate race conditions.
 * - Automatically evacuates accounts from Emergency 7th slots or dying proxies upon renewal.
 */
class RentSlotUseCase {
  constructor(
    userRepo,
    accountRepo,
    transactionRepo,
    voucherRepo,
    allocationEngine,
    settingRepo,
    mutex = null,
    multiBotManager = null,
    proxyRepo = null
  ) {
    this.userRepo = userRepo;
    this.accountRepo = accountRepo;
    this.transactionRepo = transactionRepo;
    this.voucherRepo = voucherRepo;
    this.allocationEngine = allocationEngine;
    this.settingRepo = settingRepo;
    this.mutex = mutex || AsyncMutex.globalAllocationMutex || new AsyncMutex('rent-slot-use-case');
    this.multiBotManager = multiBotManager;
    this.proxyRepo = proxyRepo;
  }

  async execute(params) {
    return this.mutex.runExclusive(async () => {
      return this._executeInternal(params);
    });
  }

  async _executeInternal({ userId, username, password, plan = 'UPXU', durationMonths = 1, voucherCode = null, note = '' }) {
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

    // 5. Automatic Resource Allocation (BEFORE deducting user balance)
    let allocation = null;
    try {
      allocation = await this.allocationEngine.allocateResources(planKey, months);
    } catch (allocErr) {
      console.error('❌ [RentSlotUseCase] Cấp phát Proxy/File thất bại:', allocErr.message);
      throw new BadRequestException(
        'Hệ thống đang khởi tạo thêm máy chủ, vui lòng thử lại sau ít phút hoặc liên hệ Admin để được hỗ trợ!'
      );
    }

    if (!allocation || !allocation.proxyId) {
      throw new BadRequestException(
        'Không thể phân bổ Proxy khả dụng (Chính sách bảo vệ IP 100%). Vui lòng thử lại sau ít phút!'
      );
    }

    // 6. Deduct balance and record Transaction with Rollback Safety
    let balanceDeducted = false;
    const balanceBefore = user.balance;
    const balanceAfter = balanceBefore - finalPrice;

    try {
      await this.userRepo.updateBalance(userId, -finalPrice);
      balanceDeducted = true;

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

      // 7. Calculate Rental Expiration Date (months * 30 days)
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
        rentalPlan: planKey,
        isEmergencySlot: false
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
    } catch (saveErr) {
      if (balanceDeducted) {
        // Rollback balance if anything fails after deduction
        try {
          await this.userRepo.updateBalance(userId, finalPrice);
          console.log(`↩️ [RentSlotUseCase] Đã hoàn lại ${finalPrice}đ cho user [${userId}] sau lỗi tạo nick: ${saveErr.message}`);
        } catch (rbErr) {
          console.error(`🚨 [RentSlotUseCase] Rollback tiền thất bại cho user [${userId}]:`, rbErr.message);
        }
      }
      throw saveErr;
    }
  }

  async renewSlot(params) {
    return this.mutex.runExclusive(async () => {
      return this._renewSlotInternal(params);
    });
  }

  async _renewSlotInternal({ userId, accountId, durationMonths = 1, voucherCode = null }) {
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

    // Evacuate account if it was sitting on an Emergency 7th Slot or on a Dying Proxy
    await this._evacuateAccountIfNeeded(account);

    return {
      account: account.toPublicJson(),
      transaction: tx.toPublicJson(),
      remainingBalance: balanceAfter
    };
  }

  /**
   * If renewed account was in an emergency slot or is on a dying/draining proxy,
   * move it to a healthy standard slot (< 6 bots) and restart bot process.
   */
  async _evacuateAccountIfNeeded(account) {
    if (!this.proxyRepo) return;
    try {
      const currentProxy = account.proxyId ? await this.proxyRepo.findById(account.proxyId) : null;
      const now = Date.now();
      const isExpiringSoon = currentProxy && currentProxy.expiresAt && (new Date(currentProxy.expiresAt).getTime() <= now + 2 * 3600 * 1000);
      const isDraining = currentProxy && currentProxy.status === 'DRAINING';
      const isEmergency = Boolean(account.isEmergencySlot);

      if (isEmergency || isExpiringSoon || isDraining) {
        const allProxies = await this.proxyRepo.findAll();
        const allAccounts = await this.accountRepo.findAll();

        const healthyCandidate = allProxies.find(p => {
          if (p.id === account.proxyId) return false;
          if (p.status !== 'ACTIVE' || p.isExpired) return false;
          if (p.expiresAt && new Date(p.expiresAt).getTime() <= now + 24 * 3600 * 1000) return false;
          const currentBots = allAccounts.filter(a => a.proxyId === p.id);
          return currentBots.length < 6;
        });

        if (healthyCandidate) {
          const oldProxyId = account.proxyId;
          console.log(`🚀 [RentSlotUseCase] Tự động di tản nick [${account.username}] sau gia hạn sang Proxy chuẩn [${healthyCandidate.id}]...`);

          account.proxyId = healthyCandidate.id;
          account.isEmergencySlot = false;

          // Check server balance on candidate
          const botsOnCand = allAccounts.filter(a => a.proxyId === healthyCandidate.id);
          const countHM = botsOnCand.filter(a => parseInt(a.serverId, 10) === 0).length;
          const countDK = botsOnCand.filter(a => parseInt(a.serverId, 10) === 1).length;

          if (parseInt(account.serverId, 10) === 0 && countHM >= 3) {
            account.flipServer();
          } else if (parseInt(account.serverId, 10) === 1 && countDK >= 3) {
            account.flipServer();
          }

          await this.accountRepo.save(account);

          // Reset maxSlots on old proxy if no emergency bots left
          if (oldProxyId) {
            const oldP = await this.proxyRepo.findById(oldProxyId);
            if (oldP && oldP.maxSlots > 6) {
              const remainingEmergency = allAccounts.filter(a => a.proxyId === oldProxyId && a.id !== account.id && a.isEmergencySlot);
              if (remainingEmergency.length === 0) {
                oldP.maxSlots = 6;
                await this.proxyRepo.save(oldP);
              }
            }
          }

          // Restart bot process if running
          if (this.multiBotManager && this.multiBotManager.isAccountRunning(account.id)) {
            try {
              if (typeof this.multiBotManager.restartAccount === 'function') {
                await this.multiBotManager.restartAccount(account.id);
              } else {
                await this.multiBotManager.stopAccount(account.id);
                await this.multiBotManager.startAccount(account.id);
              }
            } catch (e) {
              console.error(`[RentSlotUseCase] Lỗi restart bot [${account.username}] sau di tản gia hạn:`, e.message);
            }
          }
        }
      }
    } catch (e) {
      console.warn('Lỗi kiểm tra di tản sau gia hạn:', e.message);
    }
  }
}

module.exports = RentSlotUseCase;
