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
    return (config.accounts || []).map(data => new Account(data));
  }

  findById(id) {
    if (!id) return null;
    const config = this.configRepo.get();
    const data = (config.accounts || []).find(a => a.id === id);
    return data ? new Account(data) : null;
  }

  findByFileId(fileId) {
    const config = this.configRepo.get();
    return (config.accounts || [])
      .filter(a => (a.fileId || 'file_1') === fileId)
      .map(data => new Account(data));
  }

  save(account) {
    const accountEntity = account instanceof Account ? account : new Account(account);
    accountEntity.validate();

    const config = this.configRepo.get();
    config.accounts = config.accounts || [];

    const index = config.accounts.findIndex(a => a.id === accountEntity.id);
    if (index >= 0) {
      config.accounts[index] = accountEntity.toJSON();
    } else {
      config.accounts.push(accountEntity.toJSON());
    }

    this.configRepo.save(config);
    return accountEntity;
  }

  delete(id) {
    const config = this.configRepo.get();
    const originalLength = (config.accounts || []).length;
    config.accounts = (config.accounts || []).filter(a => a.id !== id);

    if (config.accounts.length !== originalLength) {
      this.configRepo.save(config);
      return true;
    }
    return false;
  }
}

module.exports = JsonAccountRepository;
