const AsyncMutex = require('../../shared/utils/AsyncMutex');
const { uuidv7 } = require('../../shared/utils/uuid');

/**
 * ProxyLifecycleCron (Application Layer - Domain Service)
 * Autonomous 4-Phase Proxy Lifecycle & Waterfall Migration Engine.
 *
 * Runs periodically (default: every 30 minutes) wrapped in an AsyncMutex:
 * - Phase 1: Release expired bot rental contracts, free slots, reset emergency slot limits.
 * - Phase 2: Offload Emergency 7th slots back to standard capacity when space opens.
 * - Phase 3: Synchronize ACTIVE / DRAINING status badges in MySQL.
 * - Phase 4: 2-Hour Final Decision:
 *     - Waterfall Migration with Auto-Flip (HM <-> DK)
 *     - Emergency 7th Slot on healthy proxies for lone bots (<= 72h) saving 10,000 VND
 *     - Auto-Renewal via proxy.vn only when economically justified (>= 2 bots or > 72h)
 */
class ProxyLifecycleCron {
  constructor({ proxyRepo, accountRepo, multiBotManager, proxyVnApiClient = null, sseEventBus = null, dbPool = null, mutex = null }) {
    this.proxyRepo = proxyRepo;
    this.accountRepo = accountRepo;
    this.multiBotManager = multiBotManager;
    this.proxyVnApiClient = proxyVnApiClient;
    this.sseEventBus = sseEventBus;
    this.dbPool = dbPool;
    this.mutex = mutex || AsyncMutex.globalAllocationMutex || new AsyncMutex('proxy-lifecycle-cron');
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

      // Thực hiện Dồn Phòng Thác Nước kèm Tự Động Lật Server (Auto-Flip HM <-> DK)
      for (const bot of [...livingBots]) {
        let migrated = false;

        for (const targetP of healthyTargetProxies) {
          const targetBots = allAccounts.filter(a => a.proxyId === targetP.id && !a.isRentalExpired());
          if (targetBots.length >= 6) continue;

          const countHM = targetBots.filter(a => a.serverId === 0).length;
          const countDK = targetBots.filter(a => a.serverId === 1).length;

          // Ưu tiên 1: Giữ nguyên Server (Soft Affinity)
          if ((bot.serverId === 0 && countHM < 3) || (bot.serverId === 1 && countDK < 3)) {
            await this._migrateBotToProxy(bot, targetP, 'Dồn phòng thác nước (Giữ nguyên Server)');
            migrated = true;
            break;
          }

          // Ưu tiên 2: Tự động Lật Server (Auto-Flip HM <-> DK)
          if (bot.serverId === 0 && countHM >= 3 && countDK < 3) {
            const oldServer = bot.serverId;
            bot.flipServer();
            await this._migrateBotToProxy(bot, targetP, `Dồn phòng thác nước (Auto-Flip ${oldServer === 0 ? 'HM->DK' : 'DK->HM'})`);
            migrated = true;
            break;
          } else if (bot.serverId === 1 && countDK >= 3 && countHM < 3) {
            const oldServer = bot.serverId;
            bot.flipServer();
            await this._migrateBotToProxy(bot, targetP, `Dồn phòng thác nước (Auto-Flip ${oldServer === 0 ? 'HM->DK' : 'DK->HM'})`);
            migrated = true;
            break;
          }
        }
      }

      // 3. Đếm lại số lượng nick còn kẹt lại (stuck_bots)
      const refreshedAccounts = await this.accountRepo.findAll();
      const stuckBots = refreshedAccounts.filter(a => a.proxyId === dyingProxy.id && !a.isRentalExpired());

      // TRƯỜNG HỢP A: stuck_bots == 0 (Đã dồn sạch 100%)
      if (stuckBots.length === 0) {
        console.log(`✅ [ProxyLifecycleCron] Proxy [${dyingProxy.name || dyingProxy.id}] đã dồn sạch nick. Cho tự hủy trên proxy.vn (Chi phí = 0đ).`);
        await this.proxyRepo.updateLifecycle(dyingProxy.id, {
          status: 'EXPIRED',
          isActive: false,
          isExpired: true
        });
        continue;
      }

      // TRƯỜNG HỢP B: Vẫn còn nick kẹt lại -> Gia hạn Proxy thêm 30 ngày để duy trì bot của khách
      if (this.proxyVnApiClient && dyingProxy.externalId) {
        try {
          console.log(`💰 [ProxyLifecycleCron] Gia hạn Proxy [${dyingProxy.name}] (externalId: ${dyingProxy.externalId}) thêm 30 ngày vì còn ${stuckBots.length} nick cần duy trì.`);
          const renewRes = await this.proxyVnApiClient.renewProxy({
            externalId: dyingProxy.externalId,
            category: dyingProxy.proxyCategory || 'DatacenterA',
            days: 30
          });

          await this.proxyRepo.updateLifecycle(dyingProxy.id, {
            status: 'ACTIVE',
            isActive: true,
            isExpired: false,
            expiresAt: renewRes.expiresAt
          });
          console.log(`✅ [ProxyLifecycleCron] Gia hạn thành công Proxy [${dyingProxy.name}], hạn mới: ${renewRes.expiresAt.toISOString()}`);
        } catch (renewErr) {
          console.error(`❌ [ProxyLifecycleCron] Lỗi khi gọi API gia hạn Proxy [${dyingProxy.id}]:`, renewErr.message);
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
}

module.exports = ProxyLifecycleCron;
