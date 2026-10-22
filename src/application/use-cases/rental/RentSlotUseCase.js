const Account = require('../../../domain/entities/Account');
const Proxy = require('../../../domain/entities/Proxy');
const Transaction = require('../../../domain/entities/Transaction');
const { BadRequestException } = require('../../../domain/errors');
const { formatMoney } = require('../../../shared/utils/formatters');
const AsyncMutex = require('../../../shared/utils/AsyncMutex');
const RmsWriter = require('../../../infrastructure/storage/RmsWriter');

/**
 * RentSlotUseCase (Application Layer)
 * Handles rental, automatic recovery, plan upgrade, and renewal of bot slots:
 * - Validates inputs and handles soft-deleted accounts / 3-day grace period.
 * - Automatic silent recovery for original owner with 100% config preserved.
 * - Safe plan switching: converts remaining active time based on price ratio.
 * - Clean ownership transfer with full reset when transferred to new user.
 * - Financial Safety Guard: Deducts user balance FIRST; refunds 100% immediately if allocation/save fails.
 * - Sequential execution via shared AsyncMutex to eliminate race conditions without deadlocks.
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

    // 1. Kiểm tra tài khoản trong hệ thống (bao gồm cả tài khoản đã xóa mềm)
    const existing = await this.accountRepo.findByUsername(cleanUsername, true);
    let isReactivation = false;
    let isTransferToNewUser = false;

    if (existing) {
      const isDeleted = existing.isDeleted();
      const isExpired = existing.isRentalExpired();
      const daysExpired = existing.getDaysExpired();

      // TRƯỜNG HỢP 1: Nick đang hoạt động (chưa xóa) và VẪN CÒN HẠN
      if (!isDeleted && !isExpired) {
        if (existing.userId === userId) {
          throw new BadRequestException(
            `Tài khoản bot [${cleanUsername}] đang hoạt động bình thường trên hệ thống. Vui lòng vào danh sách tài khoản để bấm "Gia hạn" thay vì thuê mới!`
          );
        } else {
          throw new BadRequestException(`Tài khoản game [${cleanUsername}] đang có người khác thuê và đang hoạt động!`);
        }
      }

      // TRƯỜNG HỢP 2: Nick chưa bấm xóa nhưng mới hết hạn DƯỚI 3 NGÀY (Thời gian ân hạn)
      if (!isDeleted && isExpired && daysExpired < 3) {
        if (existing.userId !== userId) {
          throw new BadRequestException(
            `Tài khoản [${cleanUsername}] đang trong 3 ngày chờ chủ cũ gia hạn. Nếu bạn là chủ mới của nick, vui lòng nhắn chủ cũ bấm "Xóa nick" trên web để thuê ngay!`
          );
        }
        isReactivation = true;
      }

      // TRƯỜNG HỢP 3: Nick ĐÃ BẤM XÓA HOẶC ĐÃ HẾT HẠN >= 3 NGÀY
      if (isDeleted || (isExpired && daysExpired >= 3)) {
        if (existing.userId === userId) {
          isReactivation = true;
        } else {
          isTransferToNewUser = true;
        }
      }
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
      // BƯỚC 2: SAU KHI ĐÃ TRỪ TIỀN THÀNH CÔNG, CẤP PHÁT TÀI NGUYÊN PROXY / FILE JAR
      // (Nếu tài khoản đã có serverId thì giữ nguyên serverId đó)
      // =======================================================================
      let allocation = null;
      try {
        const targetServerId = existing ? existing.serverId : null;
        allocation = await this.allocationEngine.allocateResources(planKey, months, targetServerId);
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
      // BƯỚC 3: GHI NHẬN GIAO DỊCH & TÍNH THỜI HẠN AN TOÀN TÀI CHÍNH
      // =======================================================================
      const tx = new Transaction({
        userId,
        type: 'RENTAL',
        amount: -finalPrice,
        balanceBefore,
        balanceAfter,
        description: isReactivation
          ? `Khôi phục/Thuê lại bot ${planConfig.name} (${months} tháng) cho nick [${cleanUsername}]`
          : (isTransferToNewUser
            ? `Chuyển chủ & Thuê mới bot ${planConfig.name} (${months} tháng) cho nick [${cleanUsername}]`
            : `Thuê bot ${planConfig.name} (${months} tháng) cho nick [${cleanUsername}]`),
        voucherCode: appliedVoucher ? appliedVoucher.code : null,
        status: 'SUCCESS'
      });
      await this.transactionRepo.save(tx);

      if (appliedVoucher) {
        await this.voucherRepo.incrementUsedCount(appliedVoucher.code);
      }

      const now = Date.now();
      let expiresAt;
      let accountResult = null;
      let newEffectivePriceMonth;

      if (isReactivation && existing) {
        // CHÍNH CHỦ CŨ KHÔI PHỤC LẠI NICK
        const oldPlanKey = existing.rentalPlan || 'UPXU';
        const newPlanKey = planKey;
        const currentExpiryMs = existing.rentalExpiresAt ? new Date(existing.rentalExpiresAt).getTime() : 0;
        const remainingMs = Math.max(0, currentExpiryMs - now);

        if (remainingMs > 0 && oldPlanKey !== newPlanKey) {
          // VÁ LỖ HỔNG TÀI CHÍNH: Quy đổi thời gian còn lại theo đơn giá thực tế đã thanh toán
          const oldPlanConfig = rules.plans[oldPlanKey] || rules.plans.UPXU;
          const oldEffectivePrice = existing.effectivePriceMonth || oldPlanConfig.priceMonth || 50000;
          const newMonthlyPrice = planConfig.priceMonth || 50000;

          const remainingTimeAfterConvert = Math.floor(remainingMs * (oldEffectivePrice / newMonthlyPrice));
          expiresAt = new Date(now + remainingTimeAfterConvert + months * 30 * 24 * 60 * 60 * 1000);

          const oldRemainingValue = (remainingMs / (30 * 86400000)) * oldEffectivePrice;
          const totalNewMs = remainingTimeAfterConvert + months * 30 * 86400000;
          newEffectivePriceMonth = Math.round((oldRemainingValue + finalPrice) / (totalNewMs / (30 * 86400000)));

          console.log(`🔄 [RentSlotUseCase] Khôi phục đổi gói [${oldPlanKey} -> ${newPlanKey}] cho [${cleanUsername}]. Đơn giá thực tế cũ: ${oldEffectivePrice}đ/tháng. Thời gian dư quy đổi: ${Math.round(remainingTimeAfterConvert / 86400000)} ngày.`);
        } else if (remainingMs > 0) {
          // Giữ nguyên gói cũ: cộng dồn vào thời hạn còn lại trên lịch thực
          expiresAt = new Date(currentExpiryMs + months * 30 * 24 * 60 * 60 * 1000);
          const oldPlanConfig = rules.plans[oldPlanKey] || rules.plans.UPXU;
          const oldEffectivePrice = existing.effectivePriceMonth || oldPlanConfig.priceMonth || 50000;
          const oldRemainingValue = (remainingMs / (30 * 86400000)) * oldEffectivePrice;
          const totalNewMs = remainingMs + months * 30 * 86400000;
          newEffectivePriceMonth = Math.round((oldRemainingValue + finalPrice) / (totalNewMs / (30 * 86400000)));
        } else {
          // Đã hết hạn: tính từ thời điểm hiện tại
          expiresAt = new Date(now + months * 30 * 24 * 60 * 60 * 1000);
          newEffectivePriceMonth = Math.round(finalPrice / months);
        }

        existing.deletedAt = null;
        existing.userId = userId;
        existing.rentalPlan = newPlanKey;
        existing.rentalExpiresAt = expiresAt;
        existing.effectivePriceMonth = newEffectivePriceMonth;
        existing.proxyId = allocation.proxyId;
        if (allocation.fileId) existing.fileId = allocation.fileId;
        if (password) existing.password = password;
        if (note) existing.note = note;
        // BẢO LƯU NGUYÊN VẸN 100% farmSettings, diamondSettings, fishSettings, sellOreSettings!

        await this.accountRepo.save(existing);
        accountResult = existing;
      } else if (isTransferToNewUser && existing) {
        // SANG TÊN ĐỔI CHỦ CHO USER MỚI (Sau khi chủ cũ bấm Xóa hoặc quá 3 ngày ân hạn)
        if (this.multiBotManager) {
          try { await this.multiBotManager.stopAccount(existing.id); } catch (e) {}
        }
        try { RmsWriter.cleanAccountRmsDirs(existing); } catch (e) {}

        expiresAt = new Date(now + months * 30 * 24 * 60 * 60 * 1000);
        newEffectivePriceMonth = Math.round(finalPrice / months);

        existing.userId = userId;
        existing.deletedAt = null;
        existing.password = password || '';
        existing.rentalPlan = planKey;
        existing.rentalExpiresAt = expiresAt;
        existing.effectivePriceMonth = newEffectivePriceMonth;
        existing.proxyId = allocation.proxyId;
        if (allocation.fileId) existing.fileId = allocation.fileId;
        existing.resetBotConfigurations(); // Reset sạch 100% settings, note, cờ auto về mặc định
        if (note) existing.note = note;

        await this.accountRepo.save(existing);
        accountResult = existing;
      } else {
        // TẠO NICK MỚI HOÀN TOÀN
        expiresAt = new Date(now + months * 30 * 24 * 60 * 60 * 1000);
        newEffectivePriceMonth = Math.round(finalPrice / months);
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
          effectivePriceMonth: newEffectivePriceMonth,
          isEmergencySlot: false
        });

        await this.accountRepo.save(newAccount);
        accountResult = newAccount;
      }

      return {
        account: accountResult.toPublicJson(),
        transaction: tx.toPublicJson(),
        remainingBalance: balanceAfter,
        isReactivated: isReactivation,
        isTransferred: isTransferToNewUser,
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

  async _renewSlotInternal({ userId, accountId, durationMonths = 1, voucherCode = null, newPlan = null }) {
    if (!userId) throw new BadRequestException('Vui lòng đăng nhập!');
    const account = await this.accountRepo.findById(accountId);
    if (!account) throw new BadRequestException('Tài khoản bot không tồn tại!');
    if (account.userId !== userId) throw new BadRequestException('Bạn không có quyền thao tác trên tài khoản này!');

    const user = await this.userRepo.findById(userId);
    if (!user || user.status === 'BANNED') throw new BadRequestException('Tài khoản bị khóa!');

    const rules = await this.allocationEngine.getAllocationRules();
    const currentPlanKey = account.rentalPlan || 'UPXU';
    const targetPlanKey = String(newPlan || currentPlanKey).toUpperCase();
    const planConfig = rules.plans[targetPlanKey] || rules.plans.UPXU;
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

    try {
      // 1. Tính toán thời hạn gia hạn an toàn tài chính (Vá lỗ hổng khi đổi gói)
      const now = Date.now();
      const currentExpiry = account.rentalExpiresAt ? new Date(account.rentalExpiresAt).getTime() : 0;
      const remainingMs = Math.max(0, currentExpiry - now);
      let newExpiresAt;
      let newEffectivePriceMonth;

      if (remainingMs > 0 && targetPlanKey !== currentPlanKey) {
        const oldPlanConfig = rules.plans[currentPlanKey] || rules.plans.UPXU;
        const oldEffectivePrice = account.effectivePriceMonth || oldPlanConfig.priceMonth || 50000;
        const newMonthlyPrice = planConfig.priceMonth || 50000;

        const convertedRemainingMs = Math.floor(remainingMs * (oldEffectivePrice / newMonthlyPrice));
        newExpiresAt = new Date(now + convertedRemainingMs + months * 30 * 24 * 60 * 60 * 1000);

        const oldRemainingValue = (remainingMs / (30 * 86400000)) * oldEffectivePrice;
        const totalNewMs = convertedRemainingMs + months * 30 * 86400000;
        newEffectivePriceMonth = Math.round((oldRemainingValue + finalPrice) / (totalNewMs / (30 * 86400000)));

        console.log(`🔄 [RentSlotUseCase] Gia hạn đổi gói [${currentPlanKey} -> ${targetPlanKey}] cho nick [${account.username}]. Đơn giá thực tế cũ: ${oldEffectivePrice}đ/tháng. Ngày dư quy đổi: ${Math.round(convertedRemainingMs / 86400000)} ngày.`);
      } else if (remainingMs > 0) {
        newExpiresAt = new Date(currentExpiry + months * 30 * 24 * 60 * 60 * 1000);
        const oldPlanConfig = rules.plans[currentPlanKey] || rules.plans.UPXU;
        const oldEffectivePrice = account.effectivePriceMonth || oldPlanConfig.priceMonth || 50000;
        const oldRemainingValue = (remainingMs / (30 * 86400000)) * oldEffectivePrice;
        const totalNewMs = remainingMs + months * 30 * 86400000;
        newEffectivePriceMonth = Math.round((oldRemainingValue + finalPrice) / (totalNewMs / (30 * 86400000)));
      } else {
        newExpiresAt = new Date(now + months * 30 * 24 * 60 * 60 * 1000);
        newEffectivePriceMonth = Math.round(finalPrice / months);
      }

      account.rentalPlan = targetPlanKey;
      account.rentalExpiresAt = newExpiresAt;
      account.effectivePriceMonth = newEffectivePriceMonth;

      // 2. Cấp phát lại Proxy / File bot nếu đổi gói hoặc mất ghế
      let needsNewAllocation = (targetPlanKey !== currentPlanKey);
      let currentProxy = account.proxyId ? await this.proxyRepo.findById(account.proxyId) : null;

      if (!currentProxy || currentProxy.status === 'EXPIRED' || currentProxy.isExpired) {
        needsNewAllocation = true;
      } else if (!needsNewAllocation) {
        const allAccounts = await this.accountRepo.findAll();
        const otherLivingOnProxy = allAccounts.filter(a => a.proxyId === currentProxy.id && a.id !== account.id && !a.isRentalExpired());
        const targetSId = parseInt(account.serverId, 10) === 1 ? 1 : 0;
        const sameServerOnProxy = otherLivingOnProxy.filter(a => (parseInt(a.serverId, 10) === 1 ? 1 : 0) === targetSId).length;

        if (otherLivingOnProxy.length >= 6 || sameServerOnProxy >= 3) {
          needsNewAllocation = true;
        }
      }

      if (needsNewAllocation) {
        console.log(`🔀 [RentSlotUseCase] Cấp phát lại tài nguyên cho [${account.username}] (Đổi gói hoặc đổi Proxy)...`);
        const allocation = await this.allocationEngine.allocateResources(targetPlanKey, months, account.serverId);
        account.proxyId = allocation.proxyId;
        if (allocation.fileId) account.fileId = allocation.fileId;
        if (this.multiBotManager && this.multiBotManager.isAccountRunning(account.id)) {
          try {
            await this.multiBotManager.restartAccount(account.id);
          } catch (e) {}
        }
      } else {
        await this._evacuateAccountIfNeeded(account, months);
      }

      const tx = new Transaction({
        userId,
        type: 'RENEWAL',
        amount: -finalPrice,
        balanceBefore,
        balanceAfter,
        description: targetPlanKey !== currentPlanKey
          ? `Đổi sang gói ${planConfig.name} & Gia hạn (${months} tháng) cho nick [${account.username}]`
          : `Gia hạn bot ${planConfig.name} (${months} tháng) cho nick [${account.username}]`,
        voucherCode: appliedVoucher ? appliedVoucher.code : null,
        status: 'SUCCESS'
      });
      await this.transactionRepo.save(tx);

      if (appliedVoucher) {
        await this.voucherRepo.incrementUsedCount(appliedVoucher.code);
      }

      await this.accountRepo.save(account);

      return {
        account: account.toPublicJson(),
        transaction: tx.toPublicJson(),
        remainingBalance: balanceAfter
      };
    } catch (err) {
      // Rollback tiền ví nếu cấp phát hoặc xử lý gia hạn thất bại
      try {
        await this.userRepo.updateBalance(userId, finalPrice);
        console.log(`↩️ [RentSlotUseCase] ĐÃ HOÀN TRẢ LẠI ${finalPrice}đ CHO USER [${userId}] do lỗi gia hạn: ${err.message}`);
      } catch (rbErr) {
        console.error(`🚨 [RentSlotUseCase] Lỗi rollback tiền cho user [${userId}]:`, rbErr.message);
      }
      throw err;
    }
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
