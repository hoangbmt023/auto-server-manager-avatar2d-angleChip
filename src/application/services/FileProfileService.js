const BotFile = require('../../domain/entities/BotFile');
const BotFileMapper = require('../mappers/BotFileMapper');
const { BadRequestException, NotFoundException } = require('../../domain/errors');

/**
 * FileProfileService (Application Layer)
 * Manages Bot Profiles/Files.
 * Multi-table delete uses MySQL Transaction; Single-table operations bypass transaction.
 */
class FileProfileService {
  constructor(fileRepo, accountRepo, settingRepo, multiBotManager, transactionManager = null) {
    this.fileRepo = fileRepo;
    this.accountRepo = accountRepo;
    this.settingRepo = settingRepo;
    this.multiBotManager = multiBotManager;
    this.transactionManager = transactionManager;
  }

  async getFiles() {
    const files = await this.fileRepo.findAll();
    const accounts = await this.accountRepo.findAll();
    const runningStatuses = this.multiBotManager ? this.multiBotManager.getAllStatuses() : { instances: {} };

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

      const dto = BotFileMapper.toResponseDto(f, {
        totalAccounts: accsInFile.length,
        hmCount,
        dkCount,
        runningCount: runningAccs.length,
        runningHmCount,
        runningDkCount
      });

      return {
        ...dto,
        ipSlots
      };
    });
  }

  async saveFile(data) {
    const file = BotFileMapper.toEntityFromSaveDto(data);
    file.validate();

    // Single table operation (bot_files) -> NO transaction needed
    const saved = await this.fileRepo.save(file);

    const activeFileId = await this.fileRepo.getActiveFileId();
    if (!activeFileId) {
      await this.fileRepo.setActiveFileId(file.id);
    }

    return BotFileMapper.toResponseDto(saved);
  }

  /**
   * Delete BotFile: Modifies >= 2 tables (bot_files, accounts, system_settings)
   * -> MANDATORY TRANSACTION USED
   */
  async deleteFile(fileId) {
    if (fileId === 'file_1') {
      throw new BadRequestException('❌ Không thể xóa File mặc định (file_1)!');
    }

    const allFiles = await this.fileRepo.findAll();
    if (allFiles.length <= 1) {
      throw new BadRequestException('❌ Hệ thống cần giữ lại tối thiểu 1 File!');
    }

    // Stop all running bots belonging to this file first
    const accsInFile = await this.accountRepo.findByFileId(fileId);
    if (this.multiBotManager) {
      accsInFile.forEach(a => this.multiBotManager.stopAccount(a.id));
    }

    // MULTI-TABLE OPERATION -> Use MySQL Transaction
    if (this.transactionManager) {
      return await this.transactionManager.withTransaction(async (conn) => {
        // 1. Delete associated accounts in `accounts` table
        await this.accountRepo.deleteByFileId(fileId, conn);

        // 2. Delete bot file in `bot_files` table
        await this.fileRepo.delete(fileId, conn);

        // 3. Update active file in `system_settings` table if necessary
        const activeFileId = await this.fileRepo.getActiveFileId();
        if (activeFileId === fileId) {
          const remainingFiles = (await this.fileRepo.findAll()).filter(f => f.id !== fileId);
          const fallbackFileId = remainingFiles.length > 0 ? remainingFiles[0].id : 'file_1';
          await this.fileRepo.setActiveFileId(fallbackFileId, conn);

          const fallbackAccs = await this.accountRepo.findByFileId(fallbackFileId);
          await this.settingRepo.set('activeAccountId', fallbackAccs.length > 0 ? fallbackAccs[0].id : null, null, conn);
        }
        return true;
      });
    } else {
      // Fallback if no transaction manager
      await this.accountRepo.deleteByFileId(fileId);
      await this.fileRepo.delete(fileId);
      return true;
    }
  }

  async switchFile(fileId) {
    const targetFile = await this.fileRepo.findById(fileId);
    if (!targetFile) {
      throw new NotFoundException('Không tìm thấy File/Profile!');
    }

    // Single table update (system_settings) -> NO transaction needed
    await this.fileRepo.setActiveFileId(fileId);

    const fileAccs = await this.accountRepo.findByFileId(fileId);
    const activeAccId = await this.settingRepo.get('activeAccountId');
    if (fileAccs.length > 0 && !fileAccs.some(a => a.id === activeAccId)) {
      await this.settingRepo.set('activeAccountId', fileAccs[0].id);
    }

    return BotFileMapper.toResponseDto(targetFile);
  }
}

module.exports = FileProfileService;
