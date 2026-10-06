const JavaDetector = require('../../../infrastructure/process/JavaDetector');
const os = require('os');
const path = require('path');
const fs = require('fs');

/**
 * BotController (Interface Layer)
 * Handles execution, lifecycle, logs and status of multi-bot instances.
 */
class BotController {
  constructor(multiBotManager, configRepo, sseEventBus) {
    this.multiBotManager = multiBotManager;
    this.configRepo = configRepo;
    this.sseEventBus = sseEventBus;
  }

  async getStatus(req, res, sendJson) {
    const config = this.configRepo.get();
    const javaInfo = JavaDetector.getJavaInfo(config.javaPath);
    const botStatuses = this.multiBotManager.getAllStatuses();

    const currentFileId = config.activeFileId || 'file_1';
    const accounts = config.accounts || [];
    const currentFileAccs = accounts.filter(a => a.fileId === currentFileId);

    const runningAccsInFile = currentFileAccs.filter(a => botStatuses.instances[a.id] && botStatuses.instances[a.id].running);
    const runningHmCount = runningAccsInFile.filter(a => parseInt(a.serverId, 10) === 0).length;
    const runningDkCount = runningAccsInFile.filter(a => parseInt(a.serverId, 10) === 1).length;

    const nodeMemMb = Math.round(process.memoryUsage().rss / (1024 * 1024));
    const runningBotsCount = botStatuses.runningCount || 0;
    const estimatedBotMemMb = nodeMemMb + (runningBotsCount * 45);

    const sysInfo = {
      platform: process.platform,
      arch: process.arch,
      nodeVersion: process.version,
      botMemMb: estimatedBotMemMb,
      freeMemMb: Math.round(os.freemem() / (1024 * 1024)),
      totalMemMb: Math.round(os.totalmem() / (1024 * 1024)),
      cpuCount: os.cpus().length,
      hasPassword: Boolean(config.password)
    };

    const workspaceRoot = path.resolve(__dirname, '../../../../');
    const resolveJarExists = (jarName, defaultSubdir) => {
      if (!jarName) return false;
      return fs.existsSync(path.join(workspaceRoot, 'jars', defaultSubdir, jarName)) ||
             fs.existsSync(path.join(workspaceRoot, 'jars', jarName)) ||
             fs.existsSync(path.join(workspaceRoot, jarName));
    };
    const files = {
      emulator: resolveJarExists(config.emulatorJar || 'AngelChipEmulator_V2Proxy.jar', 'emulator'),
      game: resolveJarExists(config.gameJar || 'avatar_fish_build40.jar', 'games')
    };

    return sendJson(res, 200, {
      success: true,
      bot: {
        running: botStatuses.runningCount > 0,
        runningCount: botStatuses.runningCount,
        runningAccountIds: botStatuses.runningAccountIds,
        instances: botStatuses.instances,
        runningHmCount,
        runningDkCount,
        runningTotal: runningAccsInFile.length
      },
      activeAccountId: config.activeAccountId,
      activeFileId: currentFileId,
      java: javaInfo,
      system: sysInfo,
      files
    });
  }

  async startAccount(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const accountId = body.id || body.accountId;
      if (!accountId) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID tài khoản cần treo!' });
      }

      const config = this.configRepo.get();
      config.activeAccountId = accountId;
      this.configRepo.save(config);

      const result = await this.multiBotManager.startAccount(accountId);
      return sendJson(res, result.success ? 200 : 400, result);
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async stopAccount(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const accountId = body.id || body.accountId;
      if (!accountId) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID tài khoản cần dừng!' });
      }

      const result = this.multiBotManager.stopAccount(accountId);
      return sendJson(res, 200, result);
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async triggerAuto(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const accountId = body.id || body.accountId;
      const autoType = body.autoType || 'farm';
      const action = body.action || 'start'; // 'start' | 'stop'

      if (!accountId) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID tài khoản!' });
      }

      const result = this.multiBotManager.triggerAuto(accountId, autoType, action);
      return sendJson(res, 200, result);
    } catch (err) {
      return sendJson(res, 200, { success: false, message: err.message });
    }
  }

  async startAll(req, res, sendJson) {
    try {
      const config = this.configRepo.get();
      const currentFileId = config.activeFileId || 'file_1';
      const fileAccounts = (config.accounts || []).filter(a => (a.fileId || 'file_1') === currentFileId);

      if (fileAccounts.length === 0) {
        return sendJson(res, 400, { success: false, message: 'File này chưa có tài khoản nào để treo!' });
      }

      let startedCount = 0;
      const errors = [];

      for (const acc of fileAccounts) {
        try {
          const res = await this.multiBotManager.startAccount(acc.id);
          if (res.success) startedCount++;
        } catch (err) {
          errors.push(`[${acc.username}]: ${err.message}`);
        }
      }

      return sendJson(res, 200, {
        success: startedCount > 0,
        message: `Đã khởi chạy ${startedCount}/${fileAccounts.length} tài khoản trong File này.` + (errors.length > 0 ? ` (Lỗi: ${errors.join('; ')})` : '')
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async stopAll(req, res, sendJson) {
    const result = this.multiBotManager.stopAll();
    return sendJson(res, 200, result);
  }

  async restartAll(req, res, sendJson) {
    const runningAccs = this.multiBotManager.getRunningAccounts();
    const runningIds = runningAccs.map(a => a.id);
    this.multiBotManager.stopAll();

    setTimeout(async () => {
      for (const id of runningIds) {
        try {
          await this.multiBotManager.startAccount(id);
        } catch (e) {}
      }
    }, 1500);

    return sendJson(res, 200, {
      success: true,
      message: `Đang khởi động lại ${runningIds.length} tài khoản...`
    });
  }

  async getLogs(req, res, sendJson) {
    const logs = this.sseEventBus.getLogs ? this.sseEventBus.getLogs() : (this.sseEventBus.logs || []);
    return sendJson(res, 200, {
      success: true,
      logs
    });
  }

  async clearLogs(req, res, sendJson) {
    this.sseEventBus.clearLogs();
    return sendJson(res, 200, { success: true, message: 'Đã xóa nhật ký hiển thị.' });
  }
}

module.exports = BotController;
