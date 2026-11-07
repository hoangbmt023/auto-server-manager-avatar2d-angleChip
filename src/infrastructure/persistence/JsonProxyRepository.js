const Proxy = require('../../domain/entities/Proxy');

/**
 * JsonProxyRepository (Infrastructure Layer - Adapter)
 * Manages CRUD operations and health verification for Proxies.
 */
class JsonProxyRepository {
  constructor(configRepo) {
    this.configRepo = configRepo;
  }

  findAll() {
    const config = this.configRepo.get();
    return (config.proxies || []).map(data => new Proxy(data));
  }

  findById(id) {
    if (!id) return null;
    const config = this.configRepo.get();
    const data = (config.proxies || []).find(p => p.id === id);
    return data ? new Proxy(data) : null;
  }

  save(proxy) {
    const proxyEntity = proxy instanceof Proxy ? proxy : new Proxy(proxy);
    proxyEntity.validate();

    const config = this.configRepo.get();
    config.proxies = config.proxies || [];

    const index = config.proxies.findIndex(p => p.id === proxyEntity.id);
    if (index >= 0) {
      config.proxies[index] = proxyEntity.toJSON();
    } else {
      config.proxies.push(proxyEntity.toJSON());
    }

    this.configRepo.save(config);
    return proxyEntity;
  }

  delete(id) {
    const config = this.configRepo.get();
    const originalLength = (config.proxies || []).length;
    config.proxies = (config.proxies || []).filter(p => p.id !== id);

    if (config.proxies.length !== originalLength) {
      // Unlink proxy from accounts
      if (Array.isArray(config.accounts)) {
        config.accounts.forEach(acc => {
          if (acc.proxyId === id) acc.proxyId = null;
        });
      }
      this.configRepo.save(config);
      return true;
    }
    return false;
  }
}

module.exports = JsonProxyRepository;
