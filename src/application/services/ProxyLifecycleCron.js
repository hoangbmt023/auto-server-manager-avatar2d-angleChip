const AsyncMutex = require('../../shared/utils/AsyncMutex');
const { uuidv7 } = require('../../shared/utils/uuid');
const Proxy = require('../../domain/entities/Proxy');
const ProxyChecker = require('../../infrastructure/network/ProxyChecker');

/**
 * ProxyLifecycleCron (Application Layer - Domain Service)
 * Autonomous 3-Phase Proxy Lifecycle & Waterfall Migration Engine.
 *
 * Runs periodically (default: every 30 minutes) wrapped in an AsyncMutex:
 * - Phase 1: Release expired bot rental contracts and free slots.
 * - Phase 2: Synchronize ACTIVE / DRAINING status badges in MySQL.
 * - Phase 3: 2-Hour Final Decision:
 *     - Waterfall Migration strictly preserving Server (HM stays HM, DK stays DK)
 *     - Maximum strict limit: 6 bots/proxy (3 HM + 3 DK)
 *     - If stuck bots remaining (even 1 bot) -> Auto-Renewal via proxy.vn
 *     - If renewal fails on expired proxy -> Fallback auto-purchase new 30-day proxy
 *     - If empty -> Mark EXPIRED and let proxy.vn auto-terminate (0 VND cost)
 */
class ProxyLifecycleCron {
  constructor({ proxyRepo, accountRepo, multiBotManager, proxyVnApiClient = null, sseEventBus = null, dbPool = null, mutex = null, settingRepo = null }) {
    this.proxyRepo = proxyRepo;
    this.accountRepo = accountRepo;
    this.multiBotManager = multiBotManager;
    this.proxyVnApiClient = proxyVnApiClient;
    this.sseEventBus = sseEventBus;
    this.dbPool = dbPool;
    this.mutex = mutex || AsyncMutex.globalAllocationMutex || new AsyncMutex('proxy-lifecycle-cron');
    this.settingRepo = settingRepo;
    this.timer = null;
    this.isRunning = false;
  }

  setProxyVnApiClient(client) {
    this.proxyVnApiClient = client;
  }

  start(intervalMs = 30 * 60 * 1000) {
    if (this.timer) {
      clearInterval(this.timer);
    }
    // Run an initial check after 5 seconds
    setTimeout(() => {
      this.runCycle().catch(err => console.error('❌ [ProxyLifecycleCron] Lỗi vòng quét ban đầu:', err.message));
    }, 5000);

    this.timer = setInterval(() => {
      this.runCycle().catch(err => console.error('❌ [ProxyLifecycleCron] Lỗi chu kỳ định kỳ:', err.message));
    }, intervalMs);

    console.log(`⏱️ [ProxyLifecycleCron] Đã kích hoạt Cronjob kiểm soát vòng đời Proxy & Waterfall Migration (Chu kỳ: ${Math.round(intervalMs / 60000)} phút).`);
  }

  stop() {
    if (this.timer) {
      clearInterval(this.timer);
      this.timer = null;
    }
  }

  async runCycle() {
    return this.mutex.runExclusive(async () => {
      const startTime = Date.now();
      try {
        await this._phase1ReleaseExpiredBots();
        await this._phase2SyncDrainingStatus();
        await this._phase3WaterfallMigrationAndRenewal();
        await this._phase4ReclaimDirectIpBots();
      } catch (err) {
        console.error('❌ [ProxyLifecycleCron] Ngoại lệ trong vòng quét:', err.message);
      } finally {
        const duration = Date.now() - startTime;
        // Broadcast SSE if bus available
        if (this.sseEventBus) {
          this.sseEventBus.broadcast('proxy-status-changed', { timestamp: Date.now() });
        }
      }
    });
  }

  // ===========================================================================
  // PHA 1: GIẢI PHÓNG HỢP ĐỒNG KHÁCH HÀNG HẾT HẠN
  // ===========================================================================
  async _phase1ReleaseExpiredBots() {
    const allAccounts = await this.accountRepo.findAll();
    const now = Date.now();

    for (const acc of allAccounts) {
      if (acc.rentalExpiresAt && new Date(acc.rentalExpiresAt).getTime() <= now) {
        // Stop bot process if running
        if (this.multiBotManager && this.multiBotManager.isAccountRunning(acc.id)) {
          console.log(`⏳ [ProxyLifecycleCron] Dừng bot hết hạn thuê [${acc.username}]...`);
          try {
            await this.multiBotManager.stopAccount(acc.id);
          } catch (e) {}
        }

        // Gỡ bỏ proxyId để giải phóng hẳn ghế trống trên Proxy cho khách mới
        if (acc.proxyId) {
          console.log(`🧹 [ProxyLifecycleCron] Thu hồi slot trên Proxy [${acc.proxyId}] của nick hết hạn [${acc.username}] để giải phóng ghế.`);
          acc.proxyId = null;
          await this.accountRepo.save(acc);
        }
      }
    }
  }

  // ===========================================================================
  // PHA 2: ĐỒNG BỘ NHÃN ACTIVE / DRAINING
  // ===========================================================================
  async _phase2SyncDrainingStatus() {
    const allProxies = await this.proxyRepo.findAll();
    const allAccounts = await this.accountRepo.findAll();
    const now = Date.now();

    for (const p of allProxies) {
      if (p.status === 'EXPIRED' || p.isExpired) continue;

      const pExpiresMs = p.expiresAt ? new Date(p.expiresAt).getTime() : (now + 30 * 86400 * 1000);
      const remainingHours = (pExpiresMs - now) / (3600 * 1000);

      const botsOnProxy = allAccounts.filter(a => a.proxyId === p.id && !a.isRentalExpired());
      const overflowBots = botsOnProxy.filter(a => {
        if (!a.rentalExpiresAt) return false;
        return new Date(a.rentalExpiresAt).getTime() > pExpiresMs;
      }).length;

      // Proxy chỉ bị coi là DRAINING (chờ dọn) khi KHÔNG phải CORE tier, và sắp hết hạn (<= 72 giờ) với ít/không có overflow bots
      const isExpiringSoon = remainingHours <= 72;
      const isDraining = (p.tier !== 'CORE') && isExpiringSoon && (overflowBots <= 2);

      const targetStatus = isDraining ? 'DRAINING' : 'ACTIVE';
      if (p.status !== targetStatus) {
        p.status = targetStatus;
        await this.proxyRepo.updateLifecycle(p.id, { status: targetStatus });
      }
    }
  }

  // ===========================================================================
  // PHA 3: QUYẾT ĐỊNH SINH TỬ Ở 2 GIỜ CUỐI CÙNG (WATERFALL MIGRATION & RENEWAL)
  // ===========================================================================
  async _phase3WaterfallMigrationAndRenewal() {
    const allProxies = await this.proxyRepo.findAll();
    const allAccounts = await this.accountRepo.findAll();
    const now = Date.now();

    // Lọc các proxy còn <= 2 giờ là hết hạn và chưa gắn cờ EXPIRED
    const dyingProxies = allProxies.filter(p => {
      if (p.status === 'EXPIRED' || p.isExpired) return false;
      if (!p.expiresAt) return false;
      const msLeft = new Date(p.expiresAt).getTime() - now;
      return msLeft <= 2 * 3600 * 1000;
    });

    if (dyingProxies.length === 0) return;

    for (const dyingProxy of dyingProxies) {
      // 1. Lấy danh sách nick còn hạn trên dyingProxy, ưu tiên nick có hạn dài nhất xử lý trước
      const livingBots = allAccounts
        .filter(a => a.proxyId === dyingProxy.id && !a.isRentalExpired())
        .sort((a, b) => {
          const tA = a.rentalExpiresAt ? new Date(a.rentalExpiresAt).getTime() : 0;
          const tB = b.rentalExpiresAt ? new Date(b.rentalExpiresAt).getTime() : 0;
          return tB - tA;
        });

      // 2. Tìm các Proxy đích khỏe (expires_at > now + 6h) có totalBots < 6
      const healthyTargetProxies = allProxies.filter(p => {
        if (p.id === dyingProxy.id) return false;
        if (p.status === 'EXPIRED' || p.isExpired) return false;
        if (p.expiresAt && new Date(p.expiresAt).getTime() <= now + 6 * 3600 * 1000) return false;
        const count = allAccounts.filter(a => a.proxyId === p.id && !a.isRentalExpired()).length;
        return count < 6;
      });

      // Thực hiện Dồn Phòng Thác Nước - CỐ ĐỊNH SERVER (KHÔNG lật Server của nick đang chạy)
      for (const bot of [...livingBots]) {
        let migrated = false;
        const botServer = parseInt(bot.serverId, 10) === 1 ? 1 : 0;

        for (const targetP of healthyTargetProxies) {
          const targetBots = allAccounts.filter(a => a.proxyId === targetP.id && !a.isRentalExpired());
          if (targetBots.length >= 6) continue;

          const countSameServer = targetBots.filter(a => (parseInt(a.serverId, 10) === 1 ? 1 : 0) === botServer).length;

          // Chỉ di tản nếu Proxy đích còn trống slot của ĐÚNG server hiện tại
          if (countSameServer < 3) {
            await this._migrateBotToProxy(bot, targetP, `Dồn phòng thác nước (Server ${botServer === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ'})`);
            
            // CẬP NHẬT ĐỘNG BỘ NHỚ RAM ĐỂ TRÁNH TRÀN QUOTA Ở CÁC VÒNG LẶP TIẾP THEO
            bot.proxyId = targetP.id;
            const inMem = allAccounts.find(a => a.id === bot.id);
            if (inMem) inMem.proxyId = targetP.id;

            migrated = true;
            break;
          }
        }
      }

      // 3. Đếm lại số lượng nick còn kẹt lại (stuck_bots)
      // CHỐNG THẤT THOÁT TIỀN: Chỉ gia hạn Proxy nếu còn bất kỳ nick nào có hạn thuê
      // sống lâu hơn hạn của Proxy hiện tại (account.rentalExpiresAt > dyingProxy.expiresAt)
      const refreshedAccounts = await this.accountRepo.findAll();
      const dyingProxyExpiresMs = dyingProxy.expiresAt ? new Date(dyingProxy.expiresAt).getTime() : now;
      const stuckBots = refreshedAccounts.filter(a => {
        if (a.proxyId !== dyingProxy.id) return false;
        if (typeof a.isDeleted === 'function' && a.isDeleted()) return false;
        if (typeof a.isRentalExpired === 'function' && a.isRentalExpired()) return false;
        // Bỏ qua các nick sẽ hết hạn trước hoặc cùng lúc với Proxy
        if (a.rentalExpiresAt && new Date(a.rentalExpiresAt).getTime() <= dyingProxyExpiresMs) return false;
        return true;
      });

      // TRƯỜNG HỢP A: stuck_bots == 0 (Đã dồn sạch 100% hoặc các nick còn lại sắp hết hạn tự nhiên)
      if (stuckBots.length === 0) {
        console.log(`✅ [ProxyLifecycleCron] Proxy [${dyingProxy.name || dyingProxy.id}] không còn nick kẹt hạn dài. Cho tự hủy trên proxy.vn (Chi phí = 0đ).`);
        await this.proxyRepo.updateLifecycle(dyingProxy.id, {
          status: 'EXPIRED',
          isActive: false,
          isExpired: true
        });
        continue;
      }

      // TRƯỜNG HỢP B: Vẫn còn nick kẹt lại -> Gia hạn Proxy để duy trì bot của khách
      let renewed = false;
      if (this.proxyVnApiClient && dyingProxy.externalId) {
        try {
          let renewDays = 30;
          if (this.settingRepo) {
            try {
              const configuredPeriod = await this.settingRepo.get('proxy_vn_default_period');
              if (configuredPeriod) {
                const parsed = parseInt(configuredPeriod, 10);
                if (!isNaN(parsed) && parsed >= 1) renewDays = Math.min(365, parsed);
              }
            } catch (e) {}
          }

          console.log(`💰 [ProxyLifecycleCron] Gia hạn Proxy [${dyingProxy.name}] (externalId: ${dyingProxy.externalId}) thêm ${renewDays} ngày vì còn ${stuckBots.length} nick cần duy trì.`);
          const renewRes = await this.proxyVnApiClient.renewProxy({
            externalId: dyingProxy.externalId,
            category: dyingProxy.proxyCategory || 'DatacenterA',
            days: renewDays
          });

          await this.proxyRepo.updateLifecycle(dyingProxy.id, {
            status: 'ACTIVE',
            isActive: true,
            isExpired: false,
            expiresAt: renewRes.expiresAt
          });
          console.log(`✅ [ProxyLifecycleCron] Gia hạn thành công Proxy [${dyingProxy.name}], hạn mới: ${renewRes.expiresAt.toISOString()}`);
          renewed = true;
        } catch (renewErr) {
          console.error(`❌ [ProxyLifecycleCron] Lỗi khi gọi API gia hạn Proxy [${dyingProxy.id}]:`, renewErr.message);
        }
      }

      // FALLBACK BỔ SUNG: Nếu gia hạn thất bại (ví hết tiền, hoặc quá hạn bị hủy ID trên proxy.vn)
      // Tự động mua Proxy mới 30 ngày và di tản toàn bộ bot bị kẹt sang đó!
      if (!renewed && this.proxyVnApiClient) {
        console.warn(`🚨 [ProxyLifecycleCron] Gia hạn thất bại cho Proxy [${dyingProxy.name || dyingProxy.id}]. Đang kích hoạt Fallback mua Proxy mới thay thế...`);
        try {
          const newProxy = await this._autoPurchaseReplacementProxy(dyingProxy);
          if (newProxy) {
            for (const sBot of stuckBots) {
              await this._migrateBotToProxy(sBot, newProxy, 'Di tản khẩn cấp sang Proxy mới thay thế do Proxy cũ quá hạn');
              sBot.proxyId = newProxy.id;
              const inMem = allAccounts.find(a => a.id === sBot.id);
              if (inMem) inMem.proxyId = newProxy.id;
            }
            await this.proxyRepo.updateLifecycle(dyingProxy.id, {
              status: 'EXPIRED',
              isActive: false,
              isExpired: true
            });
            console.log(`✅ [ProxyLifecycleCron] Đã di tản an toàn ${stuckBots.length} nick sang Proxy mới [${newProxy.host}:${newProxy.port}] và đánh dấu đóng Proxy cũ.`);
          }
        } catch (fbErr) {
          console.error(`❌ [ProxyLifecycleCron] Lỗi Fallback mua proxy mới:`, fbErr.message);
        }
      }
    }
  }

  async _migrateBotToProxy(bot, targetProxy, reason = '') {
    const fromProxyId = bot.proxyId;
    const fromServerId = bot.serverId;

    bot.proxyId = targetProxy.id;
    bot.isEmergencySlot = false;
    await this.accountRepo.save(bot);

    await this._logMigration({
      accountId: bot.id,
      fromProxyId,
      toProxyId: targetProxy.id,
      fromServerId,
      toServerId: bot.serverId,
      isEmergency: false,
      reason
    });

    // Restart process if running
    if (this.multiBotManager && this.multiBotManager.isAccountRunning(bot.id)) {
      try {
        if (typeof this.multiBotManager.restartAccount === 'function') {
          await this.multiBotManager.restartAccount(bot.id);
        } else {
          await this.multiBotManager.stopAccount(bot.id);
          await this.multiBotManager.startAccount(bot.id);
        }
      } catch (e) {
        console.error(`[ProxyLifecycleCron] Lỗi restart bot [${bot.username}] sau migration:`, e.message);
      }
    }
  }

  async _logMigration({ accountId, fromProxyId, toProxyId, fromServerId, toServerId, isEmergency = false, reason = '' }) {
    if (!this.dbPool) return;
    try {
      const pool = this.dbPool.getPool ? this.dbPool.getPool() : this.dbPool;
      const id = uuidv7();
      await pool.query(
        `INSERT INTO \`proxy_migration_logs\` (\`id\`, \`account_id\`, \`from_proxy_id\`, \`to_proxy_id\`, \`from_server_id\`, \`to_server_id\`, \`is_emergency\`, \`reason\`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)`,
        [id, accountId, fromProxyId || '', toProxyId || '', fromServerId, toServerId, isEmergency ? 1 : 0, reason]
      );
    } catch (e) {
      console.warn('Could not insert migration log:', e.message);
    }
  }

  async _autoPurchaseReplacementProxy(dyingProxy) {
    if (!this.proxyVnApiClient) return null;
    let category = dyingProxy.proxyCategory || 'DatacenterA';
    let type = dyingProxy.type || 'SOCKS5';
    let periodDays = 30;

    if (this.settingRepo) {
      try {
        const cat = await this.settingRepo.get('proxy_vn_category');
        if (cat) category = cat;
        const period = await this.settingRepo.get('proxy_vn_default_period');
        if (period) {
          const p = parseInt(period, 10);
          if (!isNaN(p) && p >= 1) periodDays = Math.min(365, p);
        }
        const pType = await this.settingRepo.get('proxy_vn_default_type');
        if (pType) type = pType.toUpperCase();
      } catch (e) {}
    }

    const buyResult = await this.proxyVnApiClient.buyProxy({
      category,
      days: periodDays,
      type
    });

    const newProxy = new Proxy({
      externalId: buyResult.externalId,
      provider: 'PROXY_VN',
      proxyCategory: buyResult.category || category,
      name: `ProxyVN_${buyResult.ip.replace(/\./g, '_')}`,
      host: buyResult.ip,
      port: buyResult.port,
      username: buyResult.username,
      password: buyResult.password,
      type: buyResult.type,
      tier: 'DYNAMIC',
      status: 'ACTIVE',
      maxSlots: 6,
      expiresAt: buyResult.expiresAt,
      isActive: true,
      isExpired: false
    });

    await this.proxyRepo.save(newProxy);
    console.log(`🛒 [ProxyLifecycleCron] Đã mua thành công Proxy thay thế [${newProxy.host}:${newProxy.port}] (ID: ${newProxy.externalId}).`);
    return newProxy;
  }

  // ===========================================================================
  // PHA 4: TỰ ĐỘNG THU HỒI NICK CHẠY TẠM DIRECT IP VỀ PROXY ĐÃ CÀI ĐẶT
  // ===========================================================================
  /**
   * Tôn trọng cài đặt của Admin & Khôi phục luồng an toàn:
   * - Các nick có proxyId === null trong DB: do Admin chủ đích cho chạy Direct IP -> Giữ nguyên, không tự ý gán Proxy.
   * - Chỉ quét những nick ĐANG CHẠY mà trong DB CÓ proxyId !== null (được thiết lập dùng Proxy),
   *   nhưng trên RAM tiến trình SingleBotProcess đang phải fallback chạy Direct IP (usingDirectIp === true).
   * - Khi Proxy của nick (acc.proxyId) đã phục hồi hoặc sống khỏe (testProxy thành công)
   *   -> Gọi restartAccount với Staggered Delay (giãn cách 3.5s) để đưa bot trở lại Proxy an toàn.
   */
  async _phase4ReclaimDirectIpBots() {
    if (!this.multiBotManager || !this.accountRepo || !this.proxyRepo) return;

    try {
      const allAccounts = await this.accountRepo.findAll();
      const allProxies = await this.proxyRepo.findAll();
      const runningStatuses = this.multiBotManager.getAllStatuses ? this.multiBotManager.getAllStatuses() : { instances: {} };
      const instances = runningStatuses.instances || {};

      let reclaimStaggerMs = 0;

      for (const acc of allAccounts) {
        // 1. Tôn trọng cấu hình Admin: Nếu trong DB proxyId === null -> Bỏ qua hoàn toàn
        if (!acc.proxyId) continue;

        // 2. Kiểm tra xem bot có đang chạy thực tế hay không
        const inst = instances[acc.id];
        if (!inst || !inst.running) continue;

        // 3. Chỉ xử lý nick đang phải chạy tạm Direct IP trên RAM
        if (!inst.usingDirectIp) continue;

        // 4. Tìm Proxy được gắn trong DB của nick
        const targetProxy = allProxies.find(p => p.id === acc.proxyId);
        if (!targetProxy || targetProxy.status === 'EXPIRED' || targetProxy.isExpired) continue;

        // 5. Kiểm tra xem Proxy này đã sống khỏe trở lại chưa
        const testResult = await ProxyChecker.testProxy(targetProxy.toJSON ? targetProxy.toJSON() : targetProxy, 2500, 2, 200);
        if (!testResult.isExpired && testResult.latencyMs > 0) {
          console.log(`🛡️ [Direct-IP Reclaim] Proxy [${targetProxy.name || targetProxy.host}] của nick [${acc.username}] đã hoạt động trở lại (${testResult.latencyMs}ms). Lên lịch chuyển về Proxy an toàn sau +${reclaimStaggerMs}ms...`);

          const delay = reclaimStaggerMs;
          reclaimStaggerMs += 3500; // Giãn cách 3.5s giữa các lần restart bot

          setTimeout(async () => {
            try {
              console.log(`🔄 [Direct-IP Reclaim Exec] Khởi động lại bot [${acc.username}] để đưa về Proxy [${targetProxy.host}:${targetProxy.port}]...`);
              if (typeof this.multiBotManager.restartAccount === 'function') {
                await this.multiBotManager.restartAccount(acc.id);
              } else {
                await this.multiBotManager.stopAccount(acc.id);
                await this.multiBotManager.startAccount(acc.id);
              }
            } catch (reclaimErr) {
              console.error(`[Direct-IP Reclaim] Lỗi khi restart bot [${acc.username}] về Proxy:`, reclaimErr.message);
            }
          }, delay);
        }
      }
    } catch (err) {
      console.warn(`[ProxyLifecycleCron] Lỗi trong Pha 4 Reclaim Direct IP:`, err.message);
    }
  }
}

module.exports = ProxyLifecycleCron;
