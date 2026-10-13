/**
 * IBotFileRepository (Domain Layer - Port)
 * Contract for Bot Profiles and Jar file settings persistence.
 */
class IBotFileRepository {
  async findAll() { throw new Error('Not implemented'); }
  async findById(id) { throw new Error('Not implemented'); }
  async save(file, connection = null) { throw new Error('Not implemented'); }
  async delete(id, connection = null) { throw new Error('Not implemented'); }
  async getActiveFileId() { throw new Error('Not implemented'); }
  async setActiveFileId(fileId, connection = null) { throw new Error('Not implemented'); }
}

module.exports = IBotFileRepository;
