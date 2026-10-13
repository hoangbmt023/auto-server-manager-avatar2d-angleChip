const jreManager = require('../../../infrastructure/process/JreManager');
const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');
const SaveSystemConfigRequestDto = require('../../../application/dtos/system/SaveSystemConfigRequestDto');
const { BadRequestException } = require('../../../domain/errors');
const { sendErrorResponse } = require('../helpers/errorHandler');

/**
 * SystemController (Interface Layer)
 * Handles global configuration, JRE downloads, and system maintenance.
 * Powered 100% by MySQL System Settings (Database-Driven, zero config.json dependency).
 */
class SystemController {
  constructor(settingRepo, sseEventBus = null) {
    this.settingRepo = settingRepo;
    this.sseEventBus = sseEventBus;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
  }

  async getConfig(req, res, sendJson) {
    try {
      const cfg = await this.settingRepo.getCompleteConfig();
      const safeConfig = {
        ...cfg,
        password: cfg.password ? '******' : ''
      };
      const resp = ApiResponse.success(safeConfig, 'Lấy cấu hình thành công!');
      resp.config = safeConfig; // Backward compatibility
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async saveConfig(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const dto = new SaveSystemConfigRequestDto(body);
      dto.validate(); // Chặn lỗi ngay tầng đầu tiên

      const updates = {
        appId: dto.appId,
        port: dto.port,
        rmsMode: dto.rmsMode,
        maxMemoryMb: dto.maxMemoryMb,
        autoRestart: dto.autoRestart,
        autoStart: dto.autoStart
      };

      if (body.password !== undefined && body.password !== '******' && body.password !== '') {
        updates.password = dto.password;
      }
      if (dto.javaPath) updates.javaPath = dto.javaPath;
      if (dto.emulatorJar) updates.emulatorJar = dto.emulatorJar;
      if (dto.gameJar) updates.gameJar = dto.gameJar;

      await this.settingRepo.setMany(updates);

      return sendJson(res, 200, ApiResponse.success(null, 'Đã lưu cấu hình thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async installJre(req, res, sendJson) {
    if (jreManager.isInstalling) {
      throw new BadRequestException('Đang trong quá trình tải và cài đặt JRE...');
    }

    // Start background installation with real-time SSE progress broadcast
    jreManager.downloadAndInstallJRE((progress) => {
      if (this.sseEventBus) {
        this.sseEventBus.broadcast('jre_progress', progress);
      }
    }, this.settingRepo).then(async (result) => {
      console.log('✅ JRE Install completed successfully:', result);
      if (result && result.javaPath) {
        await this.settingRepo.set('javaPath', result.javaPath);
      }
      if (this.sseEventBus) {
        this.sseEventBus.broadcast('jre_progress', { percent: 100, message: 'Đã hoàn tất cài đặt JRE!', ready: true });
      }
    }).catch(err => {
      console.error('❌ JRE Install error:', err.message);
      if (this.sseEventBus) {
        this.sseEventBus.broadcast('jre_progress', { percent: 0, message: `Lỗi: ${err.message}`, ready: false });
      }
    });

    return sendJson(res, 200, {
      success: true,
      message: 'Đã bắt đầu quá trình tải Portable OpenJDK 17. Vui lòng theo dõi tiến trình.'
    });
  }

  async getJreProgress(req, res, sendJson) {
    return sendJson(res, 200, {
      success: true,
      ...jreManager.progress
    });
  }
}

module.exports = SystemController;
