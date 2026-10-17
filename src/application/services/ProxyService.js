const ProxyChecker = require('../../infrastructure/network/ProxyChecker');
const ProxyMapper = require('../mappers/ProxyMapper');
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
    const proxyEntity = ProxyMapper.toEntityFromSaveDto(data, existing ? existing.password : null);
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

    return {
      proxy: ProxyMapper.toResponseDto(saved),
      testResult
    };
  }

  /**
   * Delete Proxy: Modifies 2 tables (accounts, proxies)
   * -> MANDATORY TRANSACTION USED
   */
  async deleteProxy(id) {
    // 1. Stop any bots running with this proxy
    const runningAccounts = this.multiBotManager ? await this.multiBotManager.getRunningAccounts() : [];
    const runningOnProxy = runningAccounts.filter(a => a.proxyId === id);
    for (const acc of runningOnProxy) {
      try {
        await this.multiBotManager.stopAccount(acc.id);
      } catch (e) {}
    }

    // MULTI-TABLE OPERATION (2 tables) -> Use MySQL Transaction
    if (this.transactionManager) {
      const result = await this.transactionManager.withTransaction(async (conn) => {
        // Table 1: Unlink proxy from accounts
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

    const result = await ProxyChecker.testProxy(proxy.toJSON(), 5000);
    if (result.isExpired) {
      proxy.markFailed();
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
    const results = [];

    for (const p of proxies) {
      try {
        const res = await ProxyChecker.testProxy(p.toJSON(), 3000);
        if (res.isExpired) {
          p.markFailed();
        } else {
          p.markActive(res.latencyMs);
        }
        await this.proxyRepo.save(p);
        results.push({ id: p.id, name: p.name, ...res });
      } catch (e) {
        p.markFailed();
        await this.proxyRepo.save(p);
        results.push({ id: p.id, name: p.name, isExpired: true, message: e.message });
      }
    }

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
