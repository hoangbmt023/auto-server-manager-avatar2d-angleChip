/**
 * ISystemSettingRepository (Domain Layer - Port)
 * Contract for system-wide Key-Value settings persistence.
 */
class ISystemSettingRepository {
  async get(key) { throw new Error('Not implemented'); }
  async getAll() { throw new Error('Not implemented'); }
  async getCompleteConfig() { throw new Error('Not implemented'); }
  async set(key, value, description = null, connection = null) { throw new Error('Not implemented'); }
  async setMany(settingsObj, connection = null) { throw new Error('Not implemented'); }
  async delete(key, connection = null) { throw new Error('Not implemented'); }
}

module.exports = ISystemSettingRepository;
