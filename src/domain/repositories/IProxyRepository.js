/**
 * IProxyRepository (Domain Layer - Port)
 * Contract for Proxy persistence operations.
 */
class IProxyRepository {
  async findAll() { throw new Error('Not implemented'); }
  async findById(id) { throw new Error('Not implemented'); }
  async save(proxy, connection = null) { throw new Error('Not implemented'); }
  async delete(id, connection = null) { throw new Error('Not implemented'); }
  async updateStatus(id, isActive, isExpired, latencyMs, connection = null) { throw new Error('Not implemented'); }
}

module.exports = IProxyRepository;
