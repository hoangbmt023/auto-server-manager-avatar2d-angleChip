/**
 * ProxyService (Application Layer)
 * Manages CRUD operations for the Proxy pool in config.json.
 */
class ProxyService {
  constructor(configRepo, multiBotManager) {
    this.configRepo = configRepo;
    this.multiBotManager = multiBotManager;
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
        totalAssigned: assignedAccounts.length,
        onlineCount,
        maxOnline: 6
      };
    });
  }

  saveProxy(data) {
    const config = this.configRepo.get();
    if (!config.proxies) config.proxies = [];

    const host = (data.host || '').trim();
    const port = parseInt(data.port, 10);
    if (!host) throw new Error('Vui lòng nhập Host / IP của Proxy!');
    if (!port || isNaN(port) || port < 1 || port > 65535) throw new Error('Cổng Port của Proxy không hợp lệ (1 - 65535)!');

    const id = data.id || `proxy_${Date.now()}_${Math.random().toString(36).substr(2, 4)}`;
    const name = (data.name || '').trim() || `${data.type ? data.type.toUpperCase() : 'SOCKS5'} (${host}:${port})`;
    const type = (data.type || 'socks').toLowerCase() === 'http' ? 'http' : 'socks';

    const proxyObj = {
      id,
      name,
      type,
      host,
      port,
      username: (data.username || '').trim(),
      password: (data.password || '').trim()
    };

    const existingIdx = config.proxies.findIndex(p => p.id === id);
    if (existingIdx !== -1) {
      config.proxies[existingIdx] = proxyObj;
    } else {
      config.proxies.push(proxyObj);
    }

    this.configRepo.save(config);
    return proxyObj;
  }

  deleteProxy(id) {
    const config = this.configRepo.get();
    if (!config.proxies) return false;

    // Check if any running bots are using this proxy
    const runningAccounts = this.multiBotManager ? this.multiBotManager.getRunningAccounts() : [];
    const runningOnProxy = runningAccounts.filter(a => a.proxyId === id);
    if (runningOnProxy.length > 0) {
      throw new Error(`❌ Không thể xóa proxy này vì đang có ${runningOnProxy.length} nick đang online qua proxy! Vui lòng dừng các nick trước.`);
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
    return true;
  }
}

module.exports = ProxyService;
