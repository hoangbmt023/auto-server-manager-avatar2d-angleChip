/**
 * IAccountRepository (Domain Layer - Port)
 * Contract for account data operations.
 */
class IAccountRepository {
  async findAll() { throw new Error('Not implemented'); }
  async findById(id) { throw new Error('Not implemented'); }
  async findByFileId(fileId) { throw new Error('Not implemented'); }
  async save(account) { throw new Error('Not implemented'); }
  async delete(id) { throw new Error('Not implemented'); }
}

module.exports = IAccountRepository;
