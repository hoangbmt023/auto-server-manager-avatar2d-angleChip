/**
 * AccountController (Interface Layer)
 * Handles HTTP requests related to Avatar accounts.
 */
class AccountController {
  constructor(accountService, configRepo) {
    this.accountService = accountService;
    this.configRepo = configRepo;
  }

  async getAccounts(req, res, sendJson) {
    const config = this.configRepo.get();
    const accounts = this.accountService.getAccounts();
    const currentFileId = config.activeFileId || 'file_1';

    const currentFileAccs = accounts.filter(a => a.fileId === currentFileId);
    const hmCount = currentFileAccs.filter(a => a.serverId === 0).length;
    const dkCount = currentFileAccs.filter(a => a.serverId === 1).length;

    const runningHmCount = currentFileAccs.filter(a => a.serverId === 0 && a.isRunning).length;
    const runningDkCount = currentFileAccs.filter(a => a.serverId === 1 && a.isRunning).length;
    const runningTotal = currentFileAccs.filter(a => a.isRunning).length;

    return sendJson(res, 200, {
      success: true,
      activeAccountId: config.activeAccountId,
      activeFileId: currentFileId,
      accounts,
      servers: config.servers || [
        { id: 0, name: 'Hoàn Mỹ' },
        { id: 1, name: 'Diệu Kỳ' }
      ],
      fileStats: {
        fileId: currentFileId,
        totalAccounts: currentFileAccs.length,
        hmCount,
        dkCount,
        runningHmCount,
        runningDkCount,
        runningTotal,
        maxTotal: 6,
        maxPerServer: 3
      }
    });
  }

  async saveAccount(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const saved = this.accountService.saveAccount(body);
      return sendJson(res, 200, {
        success: true,
        message: 'Đã lưu tài khoản thành công!',
        account: saved
      });
    } catch (err) {
      return sendJson(res, 400, {
        success: false,
        message: err.message
      });
    }
  }

  async deleteAccount(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body.id) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID tài khoản!' });
      }
      this.accountService.deleteAccount(body.id);
      return sendJson(res, 200, { success: true, message: 'Đã xóa tài khoản.' });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async switchServer(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body.id) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID tài khoản!' });
      }
      const updated = this.accountService.switchServer(body.id, body.newServerId);
      return sendJson(res, 200, {
        success: true,
        message: `Đã chuyển tài khoản [${updated.username}] sang Server [${updated.serverName}]!`,
        account: updated
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async updateSetup(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body.id) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID tài khoản!' });
      }
      const updated = this.accountService.updateSetup(body.id, {
        targetCoins: body.targetCoins,
        upDays: body.upDays,
        farmSettings: body.farmSettings,
        diamondSettings: body.diamondSettings,
        fishSettings: body.fishSettings,
        sellOreSettings: body.sellOreSettings
      });
      return sendJson(res, 200, {
        success: true,
        message: `Đã cập nhật cài đặt cho [${updated.username}]!`,
        account: updated
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async resetData(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body.id) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID tài khoản!' });
      }
      const result = this.accountService.resetData(body.id);
      return sendJson(res, 200, result);
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }
}

module.exports = AccountController;
