const BotFile = require('../../domain/entities/BotFile');

/**
 * JsonBotFileRepository (Infrastructure Layer - Adapter)
 * Manages Bot Profile files and active file switching.
 */
class JsonBotFileRepository {
  constructor(configRepo) {
    this.configRepo = configRepo;
  }

  findAll() {
    const config = this.configRepo.get();
    return (config.botFiles || []).map(data => new BotFile(data));
  }

  findById(id) {
    if (!id) return null;
    const config = this.configRepo.get();
    const data = (config.botFiles || []).find(f => f.id === id);
    return data ? new BotFile(data) : null;
  }

  getActiveFileId() {
    const config = this.configRepo.get();
    return config.activeFileId || 'file_1';
  }

  setActiveFileId(fileId) {
    const config = this.configRepo.get();
    config.activeFileId = fileId;
    this.configRepo.save(config);
    return fileId;
  }

  save(file) {
    const botFileEntity = file instanceof BotFile ? file : new BotFile(file);
    botFileEntity.validate();

    const config = this.configRepo.get();
    config.botFiles = config.botFiles || [];

    const index = config.botFiles.findIndex(f => f.id === botFileEntity.id);
    if (index >= 0) {
      config.botFiles[index] = botFileEntity.toJSON();
    } else {
      config.botFiles.push(botFileEntity.toJSON());
    }

    this.configRepo.save(config);
    return botFileEntity;
  }

  delete(id) {
    const config = this.configRepo.get();
    if (id === 'file_1') {
      throw new Error('Không thể xóa File mặc định (file_1)!');
    }

    config.botFiles = (config.botFiles || []).filter(f => f.id !== id);
    if (config.activeFileId === id) {
      config.activeFileId = 'file_1';
    }

    // Delete accounts belonging to this file
    if (Array.isArray(config.accounts)) {
      config.accounts = config.accounts.filter(a => a.fileId !== id);
    }

    this.configRepo.save(config);
    return true;
  }
}

module.exports = JsonBotFileRepository;
