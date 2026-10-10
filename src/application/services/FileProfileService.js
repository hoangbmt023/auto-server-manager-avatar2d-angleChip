const BotFile = require('../../domain/entities/BotFile');

/**
 * FileProfileService (Application Layer)
 * Manages Bot Profiles/Files and their JAR configurations.
 */
class FileProfileService {
  constructor(configRepo, multiBotManager) {
    this.configRepo = configRepo;
    this.multiBotManager = multiBotManager;
  }

  getFiles() {
    const config = this.configRepo.get();
    const files = config.botFiles || [];
    const accounts = config.accounts || [];
    const runningStatuses = this.multiBotManager.getAllStatuses();

    return files.map((f) => {
      const accsInFile = accounts.filter(a => a.fileId === f.id);
      const hmCount = accsInFile.filter(a => parseInt(a.serverId, 10) === 0).length;
      const dkCount = accsInFile.filter(a => parseInt(a.serverId, 10) === 1).length;

      const runningAccs = accsInFile.filter(a => runningStatuses.instances[a.id] && runningStatuses.instances[a.id].running);
      const runningHmCount = runningAccs.filter(a => parseInt(a.serverId, 10) === 0).length;
      const runningDkCount = runningAccs.filter(a => parseInt(a.serverId, 10) === 1).length;

      const totalIps = Math.max(1, Math.ceil((f.maxAccounts || 6) / 6));
      const ipSlots = [];
      for (let i = 1; i <= totalIps; i++) {
        const inSlot = accsInFile.filter(a => Math.max(1, parseInt(a.ipSlot || 1, 10)) === i);
        const slotHm = inSlot.filter(a => parseInt(a.serverId, 10) === 0).length;
        const slotDk = inSlot.filter(a => parseInt(a.serverId, 10) === 1).length;
        const slotRunning = inSlot.filter(a => runningStatuses.instances[a.id] && runningStatuses.instances[a.id].running).length;
        ipSlots.push({
          slot: i,
          total: inSlot.length,
          hmCount: slotHm,
          dkCount: slotDk,
          runningCount: slotRunning
        });
      }

      const entity = new BotFile(f);
      return {
        ...entity.toPublicJson({
          totalAccounts: accsInFile.length,
          hmCount,
          dkCount,
          runningCount: runningAccs.length,
          runningHmCount,
          runningDkCount
        }),
        ipSlots
      };
    });
  }

  saveFile(data) {
    const config = this.configRepo.get();
    if (!config.botFiles) config.botFiles = [];

    const file = new BotFile(data);
    file.validate();

    const existingIdx = config.botFiles.findIndex(f => f.id === file.id);
    if (existingIdx !== -1) {
      config.botFiles[existingIdx] = file.toPersistenceJson();
    } else {
      config.botFiles.push(file.toPersistenceJson());
    }

    if (!config.activeFileId) {
      config.activeFileId = file.id;
    }

    this.configRepo.save(config);
    return file.toPublicJson();
  }

  deleteFile(fileId) {
    const config = this.configRepo.get();
    if (!config.botFiles || config.botFiles.length <= 1) {
      throw new Error('❌ Hệ thống cần giữ lại tối thiểu 1 File!');
    }

    // Stop all bots in this file
    const accsInFile = (config.accounts || []).filter(a => a.fileId === fileId);
    accsInFile.forEach(a => this.multiBotManager.stopAccount(a.id));

    config.botFiles = config.botFiles.filter(f => f.id !== fileId);
    config.accounts = (config.accounts || []).filter(a => a.fileId !== fileId);

    if (config.activeFileId === fileId) {
      config.activeFileId = config.botFiles[0].id;
      const remainingAccs = config.accounts.filter(a => a.fileId === config.activeFileId);
      config.activeAccountId = remainingAccs.length > 0 ? remainingAccs[0].id : null;
    }

    this.configRepo.save(config);
    return true;
  }

  switchFile(fileId) {
    const config = this.configRepo.get();
    const targetFile = (config.botFiles || []).find(f => f.id === fileId);
    if (!targetFile) {
      throw new Error('Không tìm thấy File/Profile!');
    }

    config.activeFileId = fileId;
    const fileAccs = (config.accounts || []).filter(a => a.fileId === fileId);
    if (fileAccs.length > 0 && !fileAccs.some(a => a.id === config.activeAccountId)) {
      config.activeAccountId = fileAccs[0].id;
    }

    this.configRepo.save(config);
    return targetFile;
  }
}

module.exports = FileProfileService;
