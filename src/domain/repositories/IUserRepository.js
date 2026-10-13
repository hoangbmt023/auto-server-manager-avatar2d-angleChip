/**
 * IUserRepository (Domain Layer - Port)
 * Contract for User management and authentication persistence.
 */
class IUserRepository {
  async findById(id) { throw new Error('Not implemented'); }
  async findByEmail(email) { throw new Error('Not implemented'); }
  async findByPhone(phone) { throw new Error('Not implemented'); }
  async findAll() { throw new Error('Not implemented'); }
  async save(user, connection = null) { throw new Error('Not implemented'); }
  async delete(id, connection = null) { throw new Error('Not implemented'); }
  async updateLastLogin(id, connection = null) { throw new Error('Not implemented'); }
}

module.exports = IUserRepository;
