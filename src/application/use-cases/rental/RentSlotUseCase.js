const Account = require('../../../domain/entities/Account');
const Proxy = require('../../../domain/entities/Proxy');
const Transaction = require('../../../domain/entities/Transaction');
const { BadRequestException } = require('../../../domain/errors');
const { formatMoney } = require('../../../shared/utils/formatters');
const AsyncMutex = require('../../../shared/utils/AsyncMutex');

/**
 * RentSlotUseCase (Application Layer)
 * Handles rental and renewal of bot slots:
 * - Validates inputs and duplicate account names.
 * - Computes pricing, duration discount, and voucher savings.
 * - Financial Safety Guard: Deducts user balance FIRST; refunds 100% immediately if allocation/save fails.
 * - Enforces Zero Direct IP policy (100% bots require active proxy).
 * - Sequential execution via shared AsyncMutex to eliminate race conditions without deadlocks.
 * - Economically optimized renewal evacuation: Evacuates ONLY if existing free slots (< 6) exist for the same server in ACTIVE proxies, zero wasteful purchase.
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

    // =========================================================================
    // BƯỚC 1: KIỂM TRA SỐ DƯ & TRỪ TIỀN VÍ KHÁCH TRƯỚC (CHẶNG CỬA AN TOÀN)
    // TUYỆT ĐỐI không gọi allocateResources/buyProxy khi ví khách không đủ tiền!
    // =========================================================================
    if (user.balance < finalPrice) {
      throw new BadRequestException(
        `Số dư của bạn không đủ (${formatMoney(user.balance)}đ < ${formatMoney(finalPrice)}đ). Vui lòng nạp thêm tiền!`
      );
    }

    let balanceDeducted = false;
    const balanceBefore = user.balance;
    const balanceAfter = balanceBefore - finalPrice;

    // Trừ tiền ví của khách trước
    await this.userRepo.updateBalance(userId, -finalPrice);
    balanceDeducted = true;

    try {
      // =======================================================================
      // BƯỚC 2: SAU KHI ĐÃ TRỪ TIỀN THÀNH CÔNG, MỚI TIẾN HÀNH CẤP PHÁT TÀI NGUYÊN
      // (Tìm slot hoặc gọi proxy.vn mua Proxy mới 30 ngày)
      // =======================================================================
      let allocation = null;
      try {
        allocation = await this.allocationEngine.allocateResources(planKey, months);
      } catch (allocErr) {
        console.error('❌ [RentSlotUseCase] Cấp phát Proxy/File thất bại:', allocErr.message);
        throw new BadRequestException(
          `Hệ thống đang khởi tạo thêm máy chủ, vui lòng thử lại sau ít phút hoặc liên hệ Admin! (Chi tiết: ${allocErr.message})`
        );
      }

      if (!allocation || !allocation.proxyId) {
        throw new BadRequestException(
          'Không thể phân bổ Proxy khả dụng (Chính sách bảo vệ IP 100%). Vui lòng thử lại sau ít phút!'
        );
      }

      // =======================================================================
      // BƯỚC 3: GHI NHẬN GIAO DỊCH & TẠO TÀI KHOẢN BOT
      // =======================================================================
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

      if (appliedVoucher) {
        await this.voucherRepo.incrementUsedCount(appliedVoucher.code);
      }

      // Thời hạn thuê: months * 30 ngày
      const expiresAt = new Date(Date.now() + months * 30 * 24 * 60 * 60 * 1000);

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
    } catch (err) {
      // =======================================================================
      // BƯỚC 4: ROLLBACK HOÀN TIỀN 100% NẾU CẤP PHÁT HOẶC LƯU DỮ LIỆU THẤT BẠI
      // =======================================================================
      if (balanceDeducted) {
        try {
          await this.userRepo.updateBalance(userId, finalPrice);
          console.log(`↩️ [RentSlotUseCase] ĐÃ HOÀN TRẢ LẠI ${finalPrice}đ CHO USER [${userId}] do lỗi: ${err.message}`);
        } catch (rbErr) {
          console.error(`🚨 [RentSlotUseCase] NGUY HIỂM: Rollback tiền thất bại cho user [${userId}]:`, rbErr.message);
        }
      }
      throw err;
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

    // =========================================================================
    // XỬ LÝ DI TẢN NICK SAU KHI GIA HẠN
    // =========================================================================
    await this._evacuateAccountIfNeeded(account, months);

    return {
      account: account.toPublicJson(),
      transaction: tx.toPublicJson(),
      remainingBalance: balanceAfter
    };
  }

  /**
   * Evaluates evacuation after renewal:
   * Evacuates to an ACTIVE proxy ONLY if existing free slots (< 6) exist for the same server.
   * Never calls buyProxy (zero cost waste; lets bot run free until 2-hour final cycle).
   */
  async _evacuateAccountIfNeeded(account, durationMonths = 1) {
    if (!this.proxyRepo) return;
    try {
      const currentProxy = account.proxyId ? await this.proxyRepo.findById(account.proxyId) : null;
      const now = Date.now();
      const isExpiringSoon = currentProxy && currentProxy.expiresAt && (new Date(currentProxy.expiresAt).getTime() <= now + 2 * 3600 * 1000);
      const isDraining = currentProxy && currentProxy.status === 'DRAINING';

      // DI TẢN GIA HẠN: NICK Ở SLOT CHUẨN TRÊN PROXY DRAINING / SẮP HẾT HẠN
      // CHỈ DI TẢN NẾU CÓ SLOT TRỐNG MIỄN PHÍ (< 6) TRÊN PROXY ACTIVE KHÁC
      // TUYỆT ĐỐI KHÔNG mua mới (buyProxy) tốn 10k!
      if (isDraining || isExpiringSoon) {
        const allProxies = await this.proxyRepo.findAll();
        const allAccounts = await this.accountRepo.findAll();

        const targetServer = parseInt(account.serverId, 10) === 1 ? 1 : 0;
        const freeCandidate = allProxies.find(p => {
          if (p.id === account.proxyId) return false;
          if (p.status !== 'ACTIVE' || p.isExpired) return false;
          if (p.expiresAt && new Date(p.expiresAt).getTime() <= now + 24 * 3600 * 1000) return false;
          const currentBots = allAccounts.filter(a => a.proxyId === p.id);
          if (currentBots.length >= 6) return false;
          const countSameServer = currentBots.filter(a => (parseInt(a.serverId, 10) === 1 ? 1 : 0) === targetServer).length;
          return countSameServer < 3;
        });

        if (freeCandidate) {
          console.log(`🚀 [RentSlotUseCase] Tận dụng slot trống miễn phí trên Proxy [${freeCandidate.id}], chuyển nick [${account.username}] từ Proxy DRAINING sang...`);
          await this._moveAccountToProxy(account, freeCandidate, 'Chuyển sang slot trống miễn phí từ Proxy DRAINING (Giữ nguyên Server)');
        } else {
          console.log(`ℹ️ [RentSlotUseCase] Mọi Proxy ACTIVE khác đã kín 6/6 hoặc kín slot Server. Giữ nguyên nick [${account.username}] trên Proxy [${account.proxyId}] để tiết kiệm chi phí mua mới.`);
        }
      }
    } catch (e) {
      console.warn('Lỗi kiểm tra di tản sau gia hạn:', e.message);
    }
  }

  async _moveAccountToProxy(account, targetProxy, reason = '') {
    account.proxyId = targetProxy.id;
    account.isEmergencySlot = false;

    // Giữ nguyên Server gốc của tài khoản, lưu DB
    await this.accountRepo.save(account);

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
        console.error(`[RentSlotUseCase] Lỗi restart bot [${account.username}] sau di tản:`, e.message);
      }
    }
  }
}

module.exports = RentSlotUseCase;
