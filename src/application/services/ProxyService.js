const ProxyChecker = require('../../infrastructure/network/ProxyChecker');

/**
 * ProxyService (Application Layer)
 * Manages CRUD operations and Live/Expired Health Checks for the Proxy pool in config.json.
 */
class ProxyService {
  constructor(configRepo, multiBotManager, sseEventBus = null) {
    this.configRepo = configRepo;
    this.multiBotManager = multiBotManager;
    this.sseEventBus = sseEventBus || (multiBotManager ? multiBotManager.sseEventBus : null);
  }

  getProxies() {
    const config = this.configRepo.get();
    const proxies = config.proxies || [];
    const accounts = config.accounts || [];
    const runningStatuses = this.multiBotManager ? this.multiBotManager.getAllStatuses() : { instances: {} };

    return proxies.map(p => {
      const assignedAccounts = accounts.filter(a => a.proxyId === p.id);
      const onlineCount = assignedAccounts.filter(a => {
        const r = runningStatuses.instances[a.id];
        return Boolean(r && r.running);
      }).length;

      return {
        ...p,
        isExpired: Boolean(p.isExpired),
        errorReason: p.errorReason || null,
        lastChecked: p.lastChecked || null,
        latencyMs: p.latencyMs || null,
        totalAssigned: assignedAccounts.length,
        onlineCount,
        maxOnline: 6
      };
    });
  }

  async saveProxy(data) {
    const config = this.configRepo.get();
    if (!config.proxies) config.proxies = [];

    const host = (data.host || '').trim();
    const port = parseInt(data.port, 10);
    if (!host) throw new Error('Vui lòng nhập Host / IP của Proxy!');
    if (!port || isNaN(port) || port < 1 || port > 65535) throw new Error('Cổng Port của Proxy không hợp lệ (1 - 65535)!');

    const id = data.id || `proxy_${Date.now()}_${Math.random().toString(36).substr(2, 4)}`;
    const name = (data.name || '').trim() || `${data.type ? data.type.toUpperCase() : 'SOCKS5'} (${host}:${port})`;
    const type = (data.type || 'socks').toLowerCase() === 'http' ? 'http' : 'socks';

    const existingIdx = config.proxies.findIndex(p => p.id === id);
    const existing = existingIdx !== -1 ? config.proxies[existingIdx] : {};

    const proxyObj = {
      ...existing,
      id,
      name,
      type,
      host,
      port,
      username: (data.username !== undefined ? data.username : (existing.username || '')).trim(),
      password: (data.password !== undefined ? data.password : (existing.password || '')).trim()
    };

    // Live health check upon saving (adding or editing)
    const testResult = await ProxyChecker.testProxy(proxyObj, 3500);
    proxyObj.isExpired = Boolean(testResult.isExpired);
    proxyObj.errorReason = testResult.isExpired ? (testResult.message || 'Không thể kết nối proxy') : null;
    proxyObj.latencyMs = testResult.isExpired ? null : (testResult.latencyMs || null);
    proxyObj.lastChecked = new Date().toISOString();

    if (existingIdx !== -1) {
      config.proxies[existingIdx] = proxyObj;
    } else {
      config.proxies.push(proxyObj);
    }

    this.configRepo.save(config);
    this.broadcastChange();
    return {
      proxy: proxyObj,
      testResult
    };
  }

  deleteProxy(id) {
    const config = this.configRepo.get();
    if (!config.proxies) return false;

    // Check if any running bots are using this proxy -> gracefully stop them
    const runningAccounts = this.multiBotManager ? this.multiBotManager.getRunningAccounts() : [];
    const runningOnProxy = runningAccounts.filter(a => a.proxyId === id);
    if (runningOnProxy.length > 0) {
      for (const acc of runningOnProxy) {
        try {
          this.multiBotManager.stopAccount(acc.id);
        } catch (e) {}
      }
    }

    // Unlink proxy from accounts
    if (config.accounts) {
      for (const acc of config.accounts) {
        if (acc.proxyId === id) {
          acc.proxyId = null;
        }
      }
    }

    config.proxies = config.proxies.filter(p => p.id !== id);
    this.configRepo.save(config);
    this.broadcastChange();
    return true;
  }

  /**
   * Mark a proxy as expired / authentication failed.
   */
  markProxyExpired(id, reason) {
    const config = this.configRepo.get();
    if (!config.proxies) return false;

    const proxy = config.proxies.find(p => p.id === id);
    if (!proxy) return false;

    proxy.isExpired = true;
    proxy.errorReason = reason || 'Proxy đã hết hạn hoặc từ chối xác thực tài khoản';
    proxy.lastChecked = new Date().toISOString();

    this.configRepo.save(config);
    this.broadcastChange();
    return true;
  }

  /**
   * Mark a proxy as active / cleared.
   */
  markProxyActive(id) {
    const config = this.configRepo.get();
    if (!config.proxies) return false;

    const proxy = config.proxies.find(p => p.id === id);
    if (!proxy) return false;

    proxy.isExpired = false;
    proxy.errorReason = null;
    proxy.lastChecked = new Date().toISOString();

    this.configRepo.save(config);
    this.broadcastChange();
    return true;
  }

  /**
   * Test a single proxy and update its health status.
   */
  async testProxy(id) {
    const config = this.configRepo.get();
    const proxy = (config.proxies || []).find(p => p.id === id);
    if (!proxy) {
      throw new Error(`Không tìm thấy Proxy với ID [${id}]!`);
    }

    const result = await ProxyChecker.testProxy(proxy);

    proxy.lastChecked = new Date().toISOString();
    proxy.latencyMs = result.latencyMs;

    if (result.isExpired) {
      proxy.isExpired = true;
      proxy.errorReason = result.message;
    } else {
      proxy.isExpired = false;
      proxy.errorReason = null;
    }

    this.configRepo.save(config);
    this.broadcastChange();

    return {
      success: result.success,
      isExpired: proxy.isExpired,
      message: result.message,
      latencyMs: result.latencyMs,
      proxy
    };
  }

  /**
   * Test all proxies sequentially.
   */
  async testAllProxies() {
    const config = this.configRepo.get();
    const proxies = config.proxies || [];
    const results = [];

    for (const p of proxies) {
      const res = await this.testProxy(p.id).catch(err => ({
        success: false,
        isExpired: true,
        message: err.message,
        proxy: p
      }));
      results.push(res);
    }

    return results;
  }

  broadcastChange() {
    if (this.sseEventBus) {
      try {
        this.sseEventBus.broadcast('bot-status-changed', { timestamp: Date.now() });
      } catch (e) {}
    }
  }
}

module.exports = ProxyService;
