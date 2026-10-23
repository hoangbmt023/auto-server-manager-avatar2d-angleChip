const Transaction = require('../../../domain/entities/Transaction');
const { BadRequestException, NotFoundException, ForbiddenException } = require('../../../domain/errors');
const RmsWriter = require('../../../infrastructure/storage/RmsWriter');
const AsyncMutex = require('../../../shared/utils/AsyncMutex');

/**
 * CancelSlotUseCase (Application Layer - Use Case)
 * Handles cancellation of a rental slot, releases the proxy seat,
 * purges bot RMS cache safely, computes pro-rata financial refund based on
 * effectivePriceMonth (voucher/discount safe) minus cancellation fee,
 * credits wallet balance atomically within a database transaction,
 * and records a REFUND transaction.
 */
class CancelSlotUseCase {
  constructor({ accountRepo, userRepo, transactionRepo, settingRepo = null, multiBotManager = null, sseEventBus = null, mutex = null, transactionManager = null }) {
    this.accountRepo = accountRepo;
    this.userRepo = userRepo;
    this.transactionRepo = transactionRepo;
    this.settingRepo = settingRepo;
    this.multiBotManager = multiBotManager;
    this.sseEventBus = sseEventBus;
    this.mutex = mutex || new AsyncMutex('cancel-slot-mutex');
    this.transactionManager = transactionManager;
  }

  async execute(slotId, userId, userRole = 'USER') {
    if (!slotId) {
      throw new BadRequestException('Mã Slot không được để trống!');
    }
    if (!userId) {
      throw new BadRequestException('Vui lòng đăng nhập để thực hiện thao tác!');
    }

    // Mutex execution to eliminate race conditions / double-refund exploits
    return this.mutex.runExclusive(async () => {
      const account = await this.accountRepo.findById(slotId);
      if (!account || account.isDeleted()) {
        throw new NotFoundException(`Không tìm thấy Slot bot hoặc Slot đã bị hủy trước đó!`);
      }

      const isActualAdmin = String(userRole || '').toUpperCase() === 'ADMIN';
      if (!isActualAdmin && account.userId !== userId) {
        throw new ForbiddenException('Bạn không có quyền thao tác trên Slot bot này!');
      }

      if (!account.rentalPlan) {
        throw new BadRequestException('Tài khoản này không phải là Slot bot thuê!');
      }

      const now = Date.now();

      // 1. CHỐNG SPAM THUÊ / HỦY LIÊN TỤC & LỢI DỤNG THUÊ THEO GIỜ
      let minHoldHours = 1; // Phải thuê tối thiểu 1 giờ mới được hủy
      let cancelFeePercent = 10; // Phí hủy slot mặc định 10%
      if (this.settingRepo) {
        try {
          const rules = await this.settingRepo.get('rental_allocation_rules');
          if (rules) {
            if (rules.cancellationFeePercent !== undefined && rules.cancellationFeePercent !== null) {
              const f = parseInt(rules.cancellationFeePercent, 10);
              if (!isNaN(f) && f >= 0 && f <= 100) cancelFeePercent = f;
            }
            if (rules.minHoldHours !== undefined && rules.minHoldHours !== null) {
              const m = parseInt(rules.minHoldHours, 10);
              if (!isNaN(m) && m >= 0) minHoldHours = m;
            }
          }
          const feeCfg = await this.settingRepo.get('rental_cancel_fee_percent');
          if (feeCfg !== null && feeCfg !== undefined) {
            const f = parseInt(feeCfg, 10);
            if (!isNaN(f) && f >= 0 && f <= 100) cancelFeePercent = f;
          }
          const minHoldCfg = await this.settingRepo.get('rental_min_hold_hours');
          if (minHoldCfg !== null && minHoldCfg !== undefined) {
            const m = parseInt(minHoldCfg, 10);
            if (!isNaN(m) && m >= 0) minHoldHours = m;
          }
        } catch (e) {}
      }

      const currentExpiryMs = account.rentalExpiresAt ? new Date(account.rentalExpiresAt).getTime() : 0;
      const remainingMs = Math.max(0, currentExpiryMs - now);

      // 1. CHỐNG SPAM THUÊ / HỦY LIÊN TỤC (CHỈ ÁP DỤNG KHI SLOT CÒN HẠN > 0)
      const createdAtMs = account.createdAt ? new Date(account.createdAt).getTime() : 0;
      if (remainingMs > 0 && createdAtMs > 0 && minHoldHours > 0 && !isActualAdmin) {
        const ageHours = (now - createdAtMs) / (3600 * 1000);
        if (ageHours < minHoldHours) {
          const waitMinutes = Math.ceil((minHoldHours * 3600 * 1000 - (now - createdAtMs)) / 60000);
          throw new BadRequestException(
            `Để tránh spam đổi Proxy và giữ ổn định hệ thống, Slot vừa thuê phải hoạt động tối thiểu ${minHoldHours} giờ mới có thể hủy hoàn tiền (vui lòng đợi thêm ${waitMinutes} phút)!`
          );
        }
      }

      // 2. TÍNH TIỀN HOÀN: Làm tròn theo giây để tránh lệch 1đ do chênh lệch mili-giây
      const remainingSeconds = Math.round(remainingMs / 1000);
      const totalMonthSeconds = 30 * 86400;
      const effectivePrice = account.effectivePriceMonth || 50000;
      const grossRefund = remainingSeconds > 0
        ? Math.floor((remainingSeconds / totalMonthSeconds) * effectivePrice)
        : 0;
      const cancelFee = Math.floor((grossRefund * cancelFeePercent) / 100);
      const refundAmount = Math.max(0, grossRefund - cancelFee);

      const remainingDays = Math.floor(remainingMs / 86400000);
      const remainingHours = Math.floor((remainingMs % 86400000) / 3600000);
      const durationStr = remainingDays > 0 ? `${remainingDays} ngày ${remainingHours} giờ` : `${remainingHours} giờ`;

      // 3. CHUẨN BỊ ENTITIES & GIAO DỊCH DATABASE ATOMIC
      const user = await this.userRepo.findById(account.userId || userId);
      if (!user) {
        throw new BadRequestException('Tài khoản người dùng không tồn tại để hoàn tiền!');
      }

      const balanceBefore = user.balance;
      const balanceAfter = balanceBefore + refundAmount;

      const tx = new Transaction({
        userId: user.id,
        type: 'REFUND',
        amount: refundAmount,
        balanceBefore,
        balanceAfter,
        description: cancelFeePercent > 0
          ? `Hoàn tiền hủy Slot bot [${account.username || account.id}] (Còn ${durationStr}, đơn giá ${effectivePrice.toLocaleString('vi-VN')}đ/tháng, trừ ${cancelFeePercent}% phí hủy: ${cancelFee.toLocaleString('vi-VN')}đ)`
          : `Hoàn tiền hủy Slot bot [${account.username || account.id}] (Còn ${durationStr}, đơn giá ${effectivePrice.toLocaleString('vi-VN')}đ/tháng)`,
        status: 'SUCCESS'
      });

      // Đánh dấu slot đã xóa và giải phóng ghế proxy
      account.deletedAt = new Date(now);
      account.proxyId = null;

      // 4. DATABASE TRANSACTION: Thực thi trọn gói tất cả các thao tác DB
      if (this.transactionManager) {
        await this.transactionManager.withTransaction(async (conn) => {
          await this.accountRepo.save(account);
          if (refundAmount > 0) {
            await this.userRepo.updateBalance(user.id, refundAmount);
            await this.transactionRepo.save(tx);
          }
        });
      } else {
        await this.accountRepo.save(account);
        if (refundAmount > 0) {
          await this.userRepo.updateBalance(user.id, refundAmount);
          await this.transactionRepo.save(tx);
        }
      }

      console.log(`💰 [CancelSlotUseCase] DB transaction hoàn tất! Đã hoàn ${refundAmount.toLocaleString('vi-VN')}đ vào ví cho user [${user.id}]. Số dư mới: ${balanceAfter.toLocaleString('vi-VN')}đ.`);

      // 5. CHỈ KHI DATABASE ĐÃ COMMIT THÀNH CÔNG 100%, MỚI DỪNG BOT VÀ DỌN RMS NGOÀI DISK
      if (this.multiBotManager) {
        try {
          await this.multiBotManager.stopAccount(account.id);
        } catch (e) {
          console.warn(`[CancelSlotUseCase] Cảnh báo dừng bot [${account.id}]:`, e.message);
        }
      }

      // Tuyệt đối chỉ xóa RMS khi có tên nick cụ thể (không phải slot trống)
      // Và chỉ xóa nếu không còn Slot nào khác trên hệ thống đang dùng chung tên nick này
      if (account.username && account.username.trim()) {
        try {
          const allAccounts = await this.accountRepo.findAll();
          RmsWriter.cleanAccountRmsDirs(account, allAccounts);
        } catch (e) {
          console.warn(`[CancelSlotUseCase] Cảnh báo dọn RMS [${account.id}]:`, e.message);
        }
      }

      if (this.sseEventBus) {
        try {
          this.sseEventBus.broadcast('bot-status-changed', { timestamp: Date.now() });
        } catch (e) {}
      }

      return {
        success: true,
        slotId: account.id,
        grossRefund,
        cancelFee,
        cancelFeePercent,
        refundAmount,
        remainingDurationStr: durationStr,
        newBalance: balanceAfter,
        message: refundAmount > 0
          ? `Đã hủy Slot thành công và hoàn trả ${refundAmount.toLocaleString('vi-VN')}đ vào số dư ví (đã trừ ${cancelFeePercent}% phí hủy)!`
          : `Đã hủy Slot bot thành công!`
      };
    });
  }
}

module.exports = CancelSlotUseCase;
