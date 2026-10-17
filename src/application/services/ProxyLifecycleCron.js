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
  constructor({ proxyRepo, accountRepo, multiBotManager, proxyVnApiClient = null, sseEventBus = null, dbPool = null }) {
    this.proxyRepo = proxyRepo;
    this.accountRepo = accountRepo;
    this.multiBotManager = multiBotManager;
    this.proxyVnApiClient = proxyVnApiClient;
    this.sseEventBus = sseEventBus;
    this.dbPool = dbPool;
    this.mutex = new AsyncMutex('proxy-lifecycle-cron');
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
        await this._phase2OffloadEmergencySlots();
        await this._phase3SyncDrainingStatus();
        await this._phase4WaterfallMigrationAndRenewal();
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

        // Reset emergency slot flag if applicable
        if (acc.isEmergencySlot) {
          acc.isEmergencySlot = false;
          if (acc.proxyId) {
            const p = await this.proxyRepo.findById(acc.proxyId);
            if (p && p.maxSlots > 6) {
              p.maxSlots = 6;
              await this.proxyRepo.save(p);
            }
          }
          await this.accountRepo.save(acc);
        }
      }
    }
  }

  // ===========================================================================
  // PHA 2: HẠ TẢI CÁC NICK ĐANG NGỒI Ở SLOT KHẨN CẤP THỨ 7
  // ===========================================================================
  async _phase2OffloadEmergencySlots() {
    const allAccounts = await this.accountRepo.findAll();
    const emergencyBots = allAccounts.filter(a => a.isEmergencySlot && !a.isRentalExpired());

    if (emergencyBots.length === 0) return;

    const allProxies = await this.proxyRepo.findAll();
    const now = Date.now();

    for (const bot of emergencyBots) {
      // Tìm proxy Active lành lặn (expires_at > now + 24h) có totalBots < 6
      const candidate = allProxies.find(p => {
        if (p.status !== 'ACTIVE' || p.isExpired) return false;
        if (p.expiresAt && new Date(p.expiresAt).getTime() <= now + 24 * 3600 * 1000) return false;
        const currentBots = allAccounts.filter(a => a.proxyId === p.id);
        return currentBots.length < 6;
      });

      if (candidate) {
        const oldProxyId = bot.proxyId;
        console.log(`🔄 [ProxyLifecycleCron] Hạ tải nick khẩn cấp [${bot.username}] từ Proxy [${oldProxyId}] về Proxy chuẩn [${candidate.id}]...`);

        // Check server capacity on candidate
        const botsOnCand = allAccounts.filter(a => a.proxyId === candidate.id);
        const countHM = botsOnCand.filter(a => a.serverId === 0).length;
        const countDK = botsOnCand.filter(a => a.serverId === 1).length;

        const fromServerId = bot.serverId;
        if (bot.serverId === 0 && countHM >= 3) {
          bot.flipServer();
        } else if (bot.serverId === 1 && countDK >= 3) {
          bot.flipServer();
        }

        bot.proxyId = candidate.id;
        bot.isEmergencySlot = false;
        await this.accountRepo.save(bot);

        // Lower maxSlots on old proxy back to 6
        if (oldProxyId) {
          const oldP = await this.proxyRepo.findById(oldProxyId);
          if (oldP && oldP.maxSlots > 6) {
            oldP.maxSlots = 6;
            await this.proxyRepo.save(oldP);
          }
        }

        await this._logMigration({
          accountId: bot.id,
          fromProxyId: oldProxyId,
          toProxyId: candidate.id,
          fromServerId,
          toServerId: bot.serverId,
          isEmergency: false,
          reason: 'Hạ tải từ slot khẩn cấp thứ 7 về slot chuẩn'
        });

        // Restart bot if it was running
        if (this.multiBotManager && this.multiBotManager.isAccountRunning(bot.id)) {
          try {
            await this.multiBotManager.stopAccount(bot.id);
            await this.multiBotManager.startAccount(bot.id);
          } catch (e) {}
        }
      }
    }
  }

  // ===========================================================================
  // PHA 3: ĐỒNG BỘ NHÃN ACTIVE / DRAINING
  // ===========================================================================
  async _phase3SyncDrainingStatus() {
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
  // PHA 4: QUYẾT ĐỊNH SINH TỬ Ở 2 GIỜ CUỐI CÙNG (WATERFALL MIGRATION & RENEWAL)
  // ===========================================================================
  async _phase4WaterfallMigrationAndRenewal() {
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
        return count < (p.maxSlots || 6);
      });

      // Thực hiện Dồn Phòng Thác Nước kèm Tự Động Lật Server (Auto-Flip HM <-> DK)
      for (const bot of [...livingBots]) {
        let migrated = false;

        for (const targetP of healthyTargetProxies) {
          const targetBots = allAccounts.filter(a => a.proxyId === targetP.id && !a.isRentalExpired());
          if (targetBots.length >= (targetP.maxSlots || 6)) continue;

          const countHM = targetBots.filter(a => a.serverId === 0).length;
          const countDK = targetBots.filter(a => a.serverId === 1).length;

          // Ưu tiên 1: Giữ nguyên Server (Soft Affinity)
          if ((bot.serverId === 0 && countHM < 3) || (bot.serverId === 1 && countDK < 3)) {
            await this._migrateBotToProxy(bot, targetP, false, 'Dồn phòng thác nước (Giữ nguyên Server)');
            migrated = true;
            break;
          }

          // Ưu tiên 2: Tự động Lật Server (Auto-Flip HM <-> DK)
          if (bot.serverId === 0 && countHM >= 3 && countDK < 3) {
            const oldServer = bot.serverId;
            bot.flipServer();
            await this._migrateBotToProxy(bot, targetP, false, `Dồn phòng thác nước (Auto-Flip ${oldServer === 0 ? 'HM->DK' : 'DK->HM'})`);
            migrated = true;
            break;
          } else if (bot.serverId === 1 && countDK >= 3 && countHM < 3) {
            const oldServer = bot.serverId;
            bot.flipServer();
            await this._migrateBotToProxy(bot, targetP, false, `Dồn phòng thác nước (Auto-Flip ${oldServer === 0 ? 'HM->DK' : 'DK->HM'})`);
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

      // TRƯỜNG HỢP B: stuck_bots == 1 VÀ nick duy nhất đó chỉ còn hạn <= 72 giờ
      const loneBot = stuckBots[0];
      const loneBotRemainingHours = loneBot.rentalExpiresAt
        ? (new Date(loneBot.rentalExpiresAt).getTime() - now) / (3600 * 1000)
        : 0;

      if (stuckBots.length === 1 && loneBotRemainingHours <= 72) {
        // Tìm 1 Proxy ACTIVE khỏe nhất (expires_at > now + 5 days) đang có đúng 6/6 nick (chưa gánh slot khẩn cấp nào)
        const emergencyCandidate = allProxies.find(p => {
          if (p.id === dyingProxy.id) return false;
          if (p.status !== 'ACTIVE' || p.isExpired) return false;
          if (p.expiresAt && new Date(p.expiresAt).getTime() <= now + 5 * 86400 * 1000) return false;
          if (p.maxSlots > 6) return false; // Đang gánh slot khẩn cấp rồi
          const count = refreshedAccounts.filter(a => a.proxyId === p.id && !a.isRentalExpired()).length;
          return count === 6;
        });

        if (emergencyCandidate) {
          console.log(`🚨 [ProxyLifecycleCron] Kích hoạt "Slot Khẩn Cấp Thứ 7" trên Proxy [${emergencyCandidate.name}] để cứu nick [${loneBot.username}] (Còn ${Math.round(loneBotRemainingHours)}h). Tiết kiệm 10.000đ gia hạn!`);
          emergencyCandidate.maxSlots = 7;
          await this.proxyRepo.save(emergencyCandidate);

          await this._migrateBotToProxy(loneBot, emergencyCandidate, true, 'Kích hoạt Slot khẩn cấp thứ 7');

          // Đánh dấu dyingProxy hết hạn
          await this.proxyRepo.updateLifecycle(dyingProxy.id, {
            status: 'EXPIRED',
            isActive: false,
            isExpired: true
          });
          continue;
        }
      }

      // TRƯỜNG HỢP C: stuck_bots >= 2 HOẶC còn 1 nick nhưng hạn > 72 giờ
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

  async _migrateBotToProxy(bot, targetProxy, isEmergency = false, reason = '') {
    const fromProxyId = bot.proxyId;
    const fromServerId = bot.serverId;

    bot.proxyId = targetProxy.id;
    bot.isEmergencySlot = Boolean(isEmergency);
    await this.accountRepo.save(bot);

    await this._logMigration({
      accountId: bot.id,
      fromProxyId,
      toProxyId: targetProxy.id,
      fromServerId,
      toServerId: bot.serverId,
      isEmergency,
      reason
    });

    // Restart process if running
    if (this.multiBotManager && this.multiBotManager.isAccountRunning(bot.id)) {
      try {
        await this.multiBotManager.stopAccount(bot.id);
        await this.multiBotManager.startAccount(bot.id);
      } catch (e) {
        console.error(`Lỗi restart bot [${bot.username}] sau migration:`, e.message);
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
