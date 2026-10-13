const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');
const SaveAccountRequestDto = require('../../../application/dtos/account/SaveAccountRequestDto');
const SwitchServerRequestDto = require('../../../application/dtos/account/SwitchServerRequestDto');
const UpdateAccountSetupRequestDto = require('../../../application/dtos/account/UpdateAccountSetupRequestDto');
const { BadRequestException } = require('../../../domain/errors');
const { sendErrorResponse } = require('../helpers/errorHandler');

/**
 * AccountController (Interface Layer)
 * Handles HTTP requests related to Avatar accounts with DTOs and clean architecture.
 * Automatically wraps responses with standard ApiResponse and maps Custom Exceptions.
 */
class AccountController {
  constructor(accountService, settingRepo, fileRepo, sseEventBus = null) {
    this.accountService = accountService;
    this.settingRepo = settingRepo;
    this.fileRepo = fileRepo;
    this.sseEventBus = sseEventBus;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
  }

  broadcastChange() {
    if (this.sseEventBus) {
      try {
        this.sseEventBus.broadcast('bot-status-changed', { timestamp: Date.now() });
      } catch (e) {}
    }
  }

  async getAccounts(req, res, sendJson) {
    try {
      const activeFileId = (await this.fileRepo.getActiveFileId()) || 'file_1';
      const activeAccountId = await this.settingRepo.get('activeAccountId');
      const accounts = await this.accountService.getAccounts();

      const currentFileAccs = accounts.filter(a => a.fileId === activeFileId);
      const hmCount = currentFileAccs.filter(a => a.serverId === 0).length;
      const dkCount = currentFileAccs.filter(a => a.serverId === 1).length;

      const runningHmCount = currentFileAccs.filter(a => a.serverId === 0 && a.isRunning).length;
      const runningDkCount = currentFileAccs.filter(a => a.serverId === 1 && a.isRunning).length;
      const runningTotal = currentFileAccs.filter(a => a.isRunning).length;

      const payload = {
        activeAccountId,
        activeFileId,
        accounts,
        servers: [
          { id: 0, name: 'Hoàn Mỹ' },
          { id: 1, name: 'Diệu Kỳ' }
        ],
        fileStats: {
          fileId: activeFileId,
          totalAccounts: currentFileAccs.length,
          hmCount,
          dkCount,
          runningHmCount,
          runningDkCount,
          runningTotal,
          maxTotal: 6,
          maxPerServer: 3
        }
      };

      const resp = ApiResponse.success(payload, 'Lấy danh sách tài khoản thành công!');
      Object.assign(resp, payload); // Ensure backward compatibility with legacy frontend
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async saveAccount(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (req.params && req.params.id && !body.id) {
        body.id = req.params.id;
      }
      const dto = new SaveAccountRequestDto(body);
      dto.validate(); // Chặn ngay tầng đầu tiên (Validation layer)

      const saved = await this.accountService.saveAccount(dto);
      this.broadcastChange();
      const resp = ApiResponse.success(saved, 'Đã lưu tài khoản thành công!');
      resp.account = saved;
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async deleteAccount(req, res, sendJson, parseJsonBody) {
    try {
      let accountId = req.params?.id || null;
      if (!accountId) {
        try {
          const body = await parseJsonBody(req);
          accountId = body?.id || null;
        } catch (e) {}
      }
      if (!accountId) {
        const urlObj = new URL(req.url, 'http://localhost');
        accountId = urlObj.searchParams.get('id');
      }
      if (!accountId) {
        throw new BadRequestException('Thiếu ID tài khoản!', 'MISSING_ACCOUNT_ID');
      }
      await this.accountService.deleteAccount(accountId);
      this.broadcastChange();
      return sendJson(res, 200, ApiResponse.success(null, 'Đã xóa tài khoản.'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async switchServer(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (req.params && req.params.id && !body.id) {
        body.id = req.params.id;
      }
      const dto = new SwitchServerRequestDto(body);
      dto.validate(); // Chặn ngay tầng đầu tiên

      const updated = await this.accountService.switchServer(dto.id, dto.newServerId);
      this.broadcastChange();
      const resp = ApiResponse.success(updated, `Đã chuyển tài khoản [${updated.username}] sang Server [${updated.serverName}]!`);
      resp.account = updated;
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async updateSetup(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const accountId = req.params?.id || body?.id;
      if (!accountId) {
        throw new BadRequestException('Thiếu ID tài khoản!');
      }

      const dto = new UpdateAccountSetupRequestDto(body);
      dto.validate(); // Chặn lỗi ngay tầng đầu tiên

      const updated = await this.accountService.updateSetup(accountId, {
        targetCoins: dto.targetCoins,
        upDays: dto.upDays,
        farmSettings: dto.farmSettings,
        diamondSettings: dto.diamondSettings,
        fishSettings: dto.fishSettings,
        sellOreSettings: dto.sellOreSettings
      });
      this.broadcastChange();
      const resp = ApiResponse.success(updated, `Đã cập nhật cài đặt cho [${updated.username}]!`);
      resp.account = updated;
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async resetData(req, res, sendJson, parseJsonBody) {
    try {
      let body = {};
      try {
        body = await parseJsonBody(req);
      } catch (e) {}

      const accountId = req.params?.id || body?.id;
      if (!accountId) {
        throw new BadRequestException('Thiếu ID tài khoản!');
      }
      const result = await this.accountService.resetData(accountId);
      this.broadcastChange();
      return sendJson(res, 200, ApiResponse.success(result, 'Đã reset dữ liệu tài khoản!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async randomTestRms(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body || !body.id) {
        throw new BadRequestException('Thiếu ID tài khoản!');
      }
      const result = await this.accountService.randomTestRms(body.id, body.rounds || 1);
      return sendJson(res, 200, ApiResponse.success(result, 'Kiểm thử RMS thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async restoreOriginalRms(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body || !body.id) {
        throw new BadRequestException('Thiếu ID tài khoản!');
      }
      const result = await this.accountService.restoreOriginalRms(body.id);
      return sendJson(res, 200, ApiResponse.success(result, 'Đã khôi phục RMS gốc thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async inspectRms(req, res, sendJson) {
    try {
      const url = new URL(req.url, 'http://localhost');
      const id = url.searchParams.get('id');
      if (!id) {
        throw new BadRequestException('Thiếu ID tài khoản!');
      }
      const result = await this.accountService.inspectRms(id);
      return sendJson(res, 200, ApiResponse.success(result, 'Kiểm tra RMS thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async auditRms(req, res, sendJson) {
    try {
      const url = new URL(req.url, 'http://localhost');
      const id = url.searchParams.get('id');
      if (!id) {
        throw new BadRequestException('Thiếu ID tài khoản!');
      }
      const result = await this.accountService.auditRms(id);
      return sendJson(res, 200, ApiResponse.success(result, 'Audit RMS hoàn tất!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async fixRms(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body || !body.id) {
        throw new BadRequestException('Thiếu ID tài khoản!');
      }
      const result = await this.accountService.fixAndSyncRms(body.id);
      this.broadcastChange();
      return sendJson(res, 200, ApiResponse.success(result, 'Sửa RMS và đồng bộ hoàn tất!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }
}

module.exports = AccountController;
