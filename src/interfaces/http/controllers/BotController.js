const JavaDetector = require('../../../infrastructure/process/JavaDetector');
const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');
const { BadRequestException, UnauthorizedException, ForbiddenException } = require('../../../domain/errors');
const { sendErrorResponse } = require('../helpers/errorHandler');
const os = require('os');
const path = require('path');
const fs = require('fs');

/**
 * BotController (Interface Layer)
 * Handles execution, lifecycle, logs and status of multi-bot instances.
 * Powered 100% by MySQL Repositories (Database-Driven, zero config.json dependency).
 */
class BotController {
  constructor(multiBotManager, sseEventBus, accountRepo, fileRepo, settingRepo) {
    this.multiBotManager = multiBotManager;
    this.sseEventBus = sseEventBus;
    this.accountRepo = accountRepo;
    this.fileRepo = fileRepo;
    this.settingRepo = settingRepo;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
  }

  async getStatus(req, res, sendJson) {
    const config = await this.settingRepo.getCompleteConfig();
    const javaInfo = JavaDetector.getJavaInfo(config.javaPath);
    const botStatuses = this.multiBotManager.getAllStatuses();

    let currentFileId = (await this.fileRepo.getActiveFileId()) || 'file_1';
    let accounts = await this.accountRepo.findAll();

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

    const activeAccountId = (await this.settingRepo.get('activeAccountId')) || null;

    const payload = {
      bot: {
        running: botStatuses.runningCount > 0,
        runningCount: botStatuses.runningCount,
        runningAccountIds: botStatuses.runningAccountIds,
        instances: botStatuses.instances,
        runningHmCount,
        runningDkCount,
        runningTotal: runningAccsInFile.length
      },
      activeAccountId,
      activeFileId: currentFileId,
      java: javaInfo,
      system: sysInfo,
      files
    };

    const resp = ApiResponse.success(payload, 'Lấy trạng thái hệ thống thành công');
    Object.assign(resp, payload); // Compatibility for frontend accessing top-level fields
    return sendJson(res, 200, resp);
  }

  async startAccount(req, res, sendJson, parseJsonBody) {
    try {
      let accountId = req.params?.id || null;
      if (!accountId) {
        try {
          const body = await parseJsonBody(req);
          accountId = body?.id || body?.accountId;
        } catch (e) {}
      }
      if (!accountId) {
        throw new BadRequestException('Thiếu ID tài khoản cần treo!');
      }

      const isActualAdmin = Boolean(req.user && String(req.user.role || '').toUpperCase() === 'ADMIN');
      if (!isActualAdmin) {
        if (!req.user || !req.user.sub) {
          throw new UnauthorizedException('Vui lòng đăng nhập để thực hiện thao tác!');
        }
        const acc = await this.accountRepo.findById(accountId);
        if (!acc || acc.userId !== req.user.sub) {
          throw new ForbiddenException('Bạn không có quyền thao tác trên tài khoản này!');
        }
        if (acc.isRentalExpired()) {
          throw new BadRequestException('Tài khoản bot này đã hết hạn thuê! Vui lòng gia hạn để tiếp tục chạy.');
        }
      }

      await this.settingRepo.set('activeAccountId', accountId);

      const result = await this.multiBotManager.startAccount(accountId);
      const resp = ApiResponse.success(result, result.message || 'Khởi động tài khoản thành công!');
      Object.assign(resp, result);
      return sendJson(res, result.success ? 200 : 400, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async stopAccount(req, res, sendJson, parseJsonBody) {
    try {
      let accountId = req.params?.id || null;
      if (!accountId) {
        try {
          const body = await parseJsonBody(req);
          accountId = body?.id || body?.accountId;
        } catch (e) {}
      }
      if (!accountId) {
        throw new BadRequestException('Thiếu ID tài khoản cần dừng!');
      }

      const isActualAdmin = Boolean(req.user && String(req.user.role || '').toUpperCase() === 'ADMIN');
      if (!isActualAdmin) {
        if (!req.user || !req.user.sub) {
          throw new UnauthorizedException('Vui lòng đăng nhập để thực hiện thao tác!');
        }
        const acc = await this.accountRepo.findById(accountId);
        if (!acc || acc.userId !== req.user.sub) {
          throw new ForbiddenException('Bạn không có quyền thao tác trên tài khoản này!');
        }
      }

      const result = await this.multiBotManager.stopAccount(accountId);
      const resp = ApiResponse.success(result, result.message || 'Dừng tài khoản thành công!');
      Object.assign(resp, result);
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async triggerAuto(req, res, sendJson, parseJsonBody) {
    try {
      let body = {};
      try {
        body = await parseJsonBody(req);
      } catch (e) {}

      const accountId = req.params?.id || body?.id || body?.accountId;
      let autoType = body?.autoType || 'farm';
      let action = body?.action || 'start'; // 'start' | 'stop'

      const validAutoTypes = ['farm', 'diamond', 'kc', 'fish', 'cau_ca', 'cc', 'sell_ore', 'banda', 'stone', 'bd', 'event', 'sk', 'all'];
      if (!validAutoTypes.includes(autoType) && validAutoTypes.includes(action)) {
        autoType = body.action;
        action = 'start';
      }

      if (!accountId) {
        throw new BadRequestException('Thiếu ID tài khoản!');
      }

      const isActualAdmin = Boolean(req.user && String(req.user.role || '').toUpperCase() === 'ADMIN');
      if (!isActualAdmin) {
        if (!req.user || !req.user.sub) {
          throw new UnauthorizedException('Vui lòng đăng nhập để thực hiện thao tác!');
        }
        const acc = await this.accountRepo.findById(accountId);
        if (!acc || acc.userId !== req.user.sub) {
          throw new ForbiddenException('Bạn không có quyền thao tác trên tài khoản này!');
        }
        if (action === 'start' && acc.isRentalExpired()) {
          throw new BadRequestException('Tài khoản bot này đã hết hạn thuê! Vui lòng gia hạn để tiếp tục chạy.');
        }
        if (action === 'start' && acc.rentalPlan) {
          let allowedFeatures = null;
          if (this.settingRepo) {
            try {
              const rules = await this.settingRepo.get('rental_allocation_rules');
              const plan = rules?.plans?.[acc.rentalPlan];
              if (plan && Array.isArray(plan.features)) allowedFeatures = plan.features;
            } catch (e) {}
          }
          if (!allowedFeatures) {
            if (acc.rentalPlan === 'FULL') allowedFeatures = ['farm', 'fish', 'diamond', 'sellOre', 'upThue'];
            else if (acc.rentalPlan === 'FISH') allowedFeatures = ['fish', 'upThue'];
            else allowedFeatures = ['farm', 'upThue'];
          }
          const featMap = {
            farm: 'farm',
            diamond: 'diamond', kc: 'diamond',
            fish: 'fish', cau_ca: 'fish', cc: 'fish',
            sell_ore: 'sellOre', banda: 'sellOre', stone: 'sellOre', bd: 'sellOre'
          };

          if (autoType === 'all') {
            if (!allowedFeatures.includes('farm') || !allowedFeatures.includes('fish') || !allowedFeatures.includes('diamond')) {
              throw new ForbiddenException(`Gói [${acc.rentalPlan}] không hỗ trợ tính năng chạy toàn bộ auto (All Auto)!`);
            }
          } else if (autoType === 'event' || autoType === 'sk') {
            if (!allowedFeatures.includes('diamond') && acc.rentalPlan !== 'FULL') {
              throw new ForbiddenException(`Gói [${acc.rentalPlan}] không hỗ trợ tính năng Auto Sự Kiện!`);
            }
          } else {
            const neededFeat = featMap[autoType];
            if (neededFeat && !allowedFeatures.includes(neededFeat)) {
              throw new ForbiddenException(`Gói [${acc.rentalPlan}] không hỗ trợ tính năng này!`);
            }
          }
        }
      }

      const result = this.multiBotManager.triggerAuto(accountId, autoType, action);
      const resp = ApiResponse.success(result, result.message || 'Thực thi auto thành công!');
      Object.assign(resp, result);
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async startAll(req, res, sendJson) {
    try {
      const currentFileId = (await this.fileRepo.getActiveFileId()) || 'file_1';
      const allAccs = await this.accountRepo.findAll();
      const fileAccounts = allAccs.filter(a => (a.fileId || 'file_1') === currentFileId);

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
    const result = await this.multiBotManager.stopAll();
    return sendJson(res, 200, result);
  }

  async restartAll(req, res, sendJson) {
    const runningAccs = await this.multiBotManager.getRunningAccounts();
    const runningIds = runningAccs.map(a => a.id);
    await this.multiBotManager.stopAll();

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
