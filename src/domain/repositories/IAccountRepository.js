/**
 * IAccountRepository (Domain Layer - Port)
 * Contract for account data operations.
 */
class IAccountRepository {
  async findAll() { throw new Error('Not implemented'); }
  async findById(id) { throw new Error('Not implemented'); }
  async findByFileId(fileId) { throw new Error('Not implemented'); }
  async findByUserId(userId) { throw new Error('Not implemented'); }
  async save(account, connection = null) { throw new Error('Not implemented'); }
  async delete(id, connection = null) { throw new Error('Not implemented'); }
  async unlinkProxy(proxyId, connection = null) { throw new Error('Not implemented'); }
  async deleteByFileId(fileId, connection = null) { throw new Error('Not implemented'); }
}

module.exports = IAccountRepository;
