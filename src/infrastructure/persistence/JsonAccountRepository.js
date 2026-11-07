const IAccountRepository = require('../../domain/repositories/IAccountRepository');
const Account = require('../../domain/entities/Account');

/**
 * JsonAccountRepository (Infrastructure Layer - Adapter)
 * Implements IAccountRepository backed by json persistence store.
 */
class JsonAccountRepository extends IAccountRepository {
  constructor(configRepo) {
    super();
    this.configRepo = configRepo;
  }

  findAll() {
    const config = this.configRepo.get();
    return (config.accounts || [])
      .filter(a => !a.deletedAt && !a.deleted_at)
      .map(data => new Account(data));
  }

  findById(id) {
    if (!id) return null;
    const config = this.configRepo.get();
    const data = (config.accounts || []).find(a => a.id === id && !a.deletedAt && !a.deleted_at);
    return data ? new Account(data) : null;
  }

  findByFileId(fileId) {
    const config = this.configRepo.get();
    return (config.accounts || [])
      .filter(a => (a.fileId || 'file_1') === fileId && !a.deletedAt && !a.deleted_at)
      .map(data => new Account(data));
  }

  findByUserId(userId) {
    if (!userId) return [];
    const config = this.configRepo.get();
    return (config.accounts || [])
      .filter(a => a.userId === userId && !a.deletedAt && !a.deleted_at)
      .map(data => new Account(data));
  }

  findByUsername(username, includeDeleted = false) {
    if (!username) return null;
    const cleanName = String(username).trim().toLowerCase();
    const config = this.configRepo.get();
    const data = (config.accounts || []).find(a => {
      const matchName = String(a.username || '').trim().toLowerCase() === cleanName;
      if (!matchName) return false;
      if (!includeDeleted && (a.deletedAt || a.deleted_at)) return false;
      return true;
    });
    return data ? new Account(data) : null;
  }

  save(account) {
    const accountEntity = account instanceof Account ? account : new Account(account);
    accountEntity.validate();

    const config = this.configRepo.get();
    config.accounts = config.accounts || [];

    const index = config.accounts.findIndex(a => a.id === accountEntity.id);
    const data = accountEntity.toPersistenceJson ? accountEntity.toPersistenceJson() : accountEntity.toJSON();
    if (index >= 0) {
      config.accounts[index] = data;
    } else {
      config.accounts.push(data);
    }

    this.configRepo.save(config);
    return accountEntity;
  }

  delete(id) {
    const config = this.configRepo.get();
    const target = (config.accounts || []).find(a => a.id === id);
    if (target) {
      target.deleted_at = new Date();
      target.proxyId = null;
      target.proxy_id = null;
      this.configRepo.save(config);
      return true;
    }
    return false;
  }
}

module.exports = JsonAccountRepository;
