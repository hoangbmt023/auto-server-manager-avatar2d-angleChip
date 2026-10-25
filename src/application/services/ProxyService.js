const ProxyChecker = require('../../infrastructure/network/ProxyChecker');
const ProxyMapper = require('../mappers/ProxyMapper');
const ServerLimitRule = require('../../domain/rules/ServerLimitRule');
const { NotFoundException, BadRequestException } = require('../../domain/errors');

/**
 * ProxyService (Application Layer)
 * Manages CRUD operations and Live/Expired Health Checks for Proxies.
 * Multi-table delete uses MySQL Transaction; Single-table operations bypass transaction.
 */
class ProxyService {
  constructor(proxyRepo, accountRepo, multiBotManager, sseEventBus = null, transactionManager = null) {
    this.proxyRepo = proxyRepo;
    this.accountRepo = accountRepo;
    this.multiBotManager = multiBotManager;
    this.sseEventBus = sseEventBus || (multiBotManager ? multiBotManager.sseEventBus : null);
    this.transactionManager = transactionManager;
  }

  broadcastChange() {
    if (this.sseEventBus) {
      try {
        this.sseEventBus.broadcast('proxy-status-changed', { timestamp: Date.now() });
      } catch (e) {}
    }
  }

  async getProxies() {
    const proxies = await this.proxyRepo.findAll();
    const accounts = await this.accountRepo.findAll();
    const runningStatuses = this.multiBotManager ? this.multiBotManager.getAllStatuses() : { instances: {} };

    return proxies.map(p => {
      const assignedAccounts = accounts.filter(a => a.proxyId === p.id);
      const onlineCount = assignedAccounts.filter(a => {
        const r = runningStatuses.instances[a.id];
        return Boolean(r && r.running);
      }).length;
      const countHM = assignedAccounts.filter(a => parseInt(a.serverId, 10) === 0).length;
      const countDK = assignedAccounts.filter(a => parseInt(a.serverId, 10) === 1).length;

      const dto = ProxyMapper.toResponseDto(p);
      return {
        ...dto,
        totalAssigned: assignedAccounts.length,
        onlineCount,
        countHM,
        countDK,
        maxOnline: p.maxSlots || 6
      };
    });
  }

  async getProxyById(id) {
    const proxy = await this.proxyRepo.findById(id);
    if (!proxy) {
      throw new NotFoundException(`Không tìm thấy Proxy với ID [${id}]!`);
    }
    const accounts = await this.accountRepo.findAll();
    const runningStatuses = this.multiBotManager ? this.multiBotManager.getAllStatuses() : { instances: {} };
    const assignedAccounts = accounts.filter(a => a.proxyId === proxy.id);
    const onlineCount = assignedAccounts.filter(a => {
      const r = runningStatuses.instances[a.id];
      return Boolean(r && r.running);
    }).length;

    const dto = ProxyMapper.toResponseDto(proxy);
    return {
      ...dto,
      totalAssigned: assignedAccounts.length,
      onlineCount,
      maxOnline: 6
    };
  }

  async saveProxy(data) {
    const existing = data.id ? await this.proxyRepo.findById(data.id) : null;
    const proxyEntity = ProxyMapper.toEntityFromSaveDto(data, existing);
    proxyEntity.validate();

    // Live health check before saving
    const testResult = await ProxyChecker.testProxy(proxyEntity.toJSON(), 3500);
    if (testResult.isExpired) {
      throw new BadRequestException(
        `Không thể lưu Proxy: Kiểm tra kết nối thất bại (${testResult.message || 'Proxy không phản hồi, từ chối hoặc hết hạn'})!`,
        'PROXY_CONNECTION_FAILED'
      );
    }
    proxyEntity.markActive(testResult.latencyMs);

    // Single table operation (proxies) -> NO transaction needed
    const saved = await this.proxyRepo.save(proxyEntity);
    this.broadcastChange();

    // Tự động khởi động lại tất cả bot đang chạy trên proxy này nếu IP hoặc Port bị thay đổi
    if (existing && (existing.host !== saved.host || existing.port !== saved.port)) {
      await ProxyChecker.restartBotsOnProxy({
        proxy: saved,
        multiBotManager: this.multiBotManager,
        accountRepo: this.accountRepo
      });
    }

    return {
      proxy: ProxyMapper.toResponseDto(saved),
      testResult
    };
  }

  /**
   * Delete Proxy: Modifies 2 tables (accounts, proxies)
   * Tự động di tản (Evacuate) các nick còn hạn sang Proxy ACTIVE khác.
   * Nếu không đủ chỗ dồn thì CHẶN ĐỨNG lệnh xóa để bảo vệ tài khoản của khách.
   */
  async deleteProxy(id) {
    const allAccounts = await this.accountRepo.findAll();
    const accountsOnProxy = allAccounts.filter(a => a.proxyId === id);
    const livingBots = accountsOnProxy.filter(a => !a.isRentalExpired());

    // 1. Thử tự động di tản các nick còn hạn sang các Proxy ACTIVE khác
    if (livingBots.length > 0) {
      const allProxies = await this.proxyRepo.findAll();
      const now = Date.now();
      const availableProxies = allProxies.filter(p => {
        if (p.id === id || p.status !== 'ACTIVE' || p.isExpired) return false;
        if (p.expiresAt && new Date(p.expiresAt).getTime() <= now + 2 * 3600 * 1000) return false;
        return true;
      });

      const stuckBots = [];
      const currentGlobalAccounts = [...allAccounts];

      let deleteEvacuateStaggerMs = 0;
      for (const bot of livingBots) {
        const sId = parseInt(bot.serverId, 10) === 1 ? 1 : 0;
        const targetProxy = availableProxies.find(p => {
          const botsOnP = currentGlobalAccounts.filter(a => a.proxyId === p.id && !a.isRentalExpired());
          if (botsOnP.length >= ServerLimitRule.MAX_PER_PROXY) return false;
          const sameServer = botsOnP.filter(a => (parseInt(a.serverId, 10) === 1 ? 1 : 0) === sId).length;
          return sameServer < ServerLimitRule.MAX_PER_SERVER;
        });

        if (targetProxy) {
          console.log(`🚀 [deleteProxy Evacuate] Di tản nick [${bot.username}] từ Proxy [${id}] sang Proxy [${targetProxy.id}]...`);
          bot.proxyId = targetProxy.id;
          await this.accountRepo.save(bot);

          // Cập nhật mảng local để nick kế tiếp tính chính xác
          const idx = currentGlobalAccounts.findIndex(a => a.id === bot.id);
          if (idx !== -1) currentGlobalAccounts[idx] = bot;

          // Nếu bot đang chạy, khởi động lại trên Proxy mới có giãn cách Staggered Delay
          if (this.multiBotManager && this.multiBotManager.isAccountRunning(bot.id)) {
            const thisDelay = deleteEvacuateStaggerMs;
            deleteEvacuateStaggerMs += 3500;
            setTimeout(async () => {
              try {
                if (typeof this.multiBotManager.restartAccount === 'function') {
                  await this.multiBotManager.restartAccount(bot.id);
                } else {
                  await this.multiBotManager.stopAccount(bot.id);
                  await this.multiBotManager.startAccount(bot.id);
                }
              } catch (e) {}
            }, thisDelay);
          }
        } else {
          stuckBots.push(bot);
        }
      }

      // Nếu còn bất kỳ nick nào không thể di tản do thiếu chỗ trống trên các Proxy khác
      if (stuckBots.length > 0) {
        throw new BadRequestException(
          `❌ Không thể xóa Proxy này! Hiện còn ${stuckBots.length} tài khoản thuê còn hạn hoạt động nhưng các Proxy ACTIVE khác không đủ slot trống để di tản (Tối đa 6 nick/proxy, 3 nick/server). Vui lòng thêm Proxy mới trước khi xóa!`
        );
      }
    }

    // 2. Dừng các nick đã hết hạn còn sót lại trên proxy này nếu đang chạy
    const runningAccounts = this.multiBotManager ? await this.multiBotManager.getRunningAccounts() : [];
    const runningOnProxy = runningAccounts.filter(a => a.proxyId === id);
    for (const acc of runningOnProxy) {
      try {
        await this.multiBotManager.stopAccount(acc.id);
      } catch (e) {}
    }

    // 3. MULTI-TABLE OPERATION (2 tables) -> Use MySQL Transaction
    if (this.transactionManager) {
      const result = await this.transactionManager.withTransaction(async (conn) => {
        // Table 1: Unlink proxy from accounts (chỉ còn các nick đã hết hạn hoặc không thuê)
        await this.accountRepo.unlinkProxy(id, conn);

        // Table 2: Delete proxy record
        const deleted = await this.proxyRepo.delete(id, conn);
        return deleted;
      });

      this.broadcastChange();
      return result;
    } else {
      await this.accountRepo.unlinkProxy(id);
      const deleted = await this.proxyRepo.delete(id);
      this.broadcastChange();
      return deleted;
    }
  }

  async testProxy(id) {
    const proxy = await this.proxyRepo.findById(id);
    if (!proxy) {
      throw new NotFoundException(`Không tìm thấy Proxy với ID [${id}]!`);
    }

    const result = await ProxyChecker.testProxy(proxy.toJSON(), 2500, 3, 200);
    if (result.isExpired) {
      proxy.markFailed(true, result.message || 'Kiểm tra kết nối thất bại!');
    } else {
      proxy.markActive(result.latencyMs);
    }

    // Single table update (proxies) -> NO transaction needed
    await this.proxyRepo.save(proxy);
    this.broadcastChange();

    return result;
  }

  async testAllProxies() {
    const proxies = await this.proxyRepo.findAll();

    const results = await Promise.all(proxies.map(async (p) => {
      try {
        const res = await ProxyChecker.testProxy(p.toJSON(), 2500, 3, 200);
        if (res.isExpired) {
          p.markFailed(true, res.message || 'Không thể kết nối!');
        } else {
          p.markActive(res.latencyMs);
        }
        await this.proxyRepo.save(p);
        return { id: p.id, name: p.name, ...res };
      } catch (e) {
        p.markFailed(true, e.message || 'Lỗi kiểm tra!');
        await this.proxyRepo.save(p);
        return { id: p.id, name: p.name, isExpired: true, message: e.message };
      }
    }));

    this.broadcastChange();
    return results;
  }

  async rotateProxy(id, proxyVnApiClient) {
    const proxy = await this.proxyRepo.findById(id);
    if (!proxy) {
      throw new NotFoundException(`Không tìm thấy Proxy với ID [${id}]!`);
    }
    const res = await ProxyChecker.rotateProxyWithCooldown({
      proxy,
      proxyVnApiClient,
      proxyRepo: this.proxyRepo,
      multiBotManager: this.multiBotManager,
      accountRepo: this.accountRepo
    });
    this.broadcastChange();
    return res;
  }
}

module.exports = ProxyService;
