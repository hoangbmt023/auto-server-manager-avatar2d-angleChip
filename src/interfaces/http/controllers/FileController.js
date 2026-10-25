const path = require('path');
const fs = require('fs');
const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');
const SaveBotFileRequestDto = require('../../../application/dtos/file/SaveBotFileRequestDto');
const { BadRequestException } = require('../../../domain/errors');
const { sendErrorResponse } = require('../helpers/errorHandler');

/**
 * FileController (Interface Layer)
 * Handles bot profiles/files and custom JAR file uploads.
 * Automatically wraps responses with standard ApiResponse and maps Custom Exceptions.
 */
class FileController {
  constructor(fileProfileService, fileRepo, sseEventBus = null, settingRepo = null) {
    this.fileProfileService = fileProfileService;
    this.fileRepo = fileRepo;
    this.sseEventBus = sseEventBus;
    this.settingRepo = settingRepo;
    this.workspaceRoot = path.resolve(__dirname, '../../../../');
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

  async getFiles(req, res, sendJson) {
    try {
      const activeFileId = (await this.fileRepo.getActiveFileId()) || 'file_1';
      const files = await this.fileProfileService.getFiles();
      const payload = {
        activeFileId,
        files
      };
      const resp = ApiResponse.success(payload, 'Lấy danh sách file thành công!');
      Object.assign(resp, payload); // Compatibility for legacy UI
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async saveFile(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (req.params && req.params.id && !body.id) {
        body.id = req.params.id;
      }
      const dto = new SaveBotFileRequestDto(body);
      dto.validate(); // Chặn ngay tầng đầu tiên

      const saved = await this.fileProfileService.saveFile(dto);
      this.broadcastChange();
      const resp = ApiResponse.success(saved, `Đã lưu File [${saved.name}] thành công!`);
      resp.file = saved;
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async deleteFile(req, res, sendJson, parseJsonBody) {
    try {
      let fileId = req.params?.id || null;
      if (!fileId) {
        try {
          const body = await parseJsonBody(req);
          fileId = body?.id || null;
        } catch (e) {}
      }
      if (!fileId) {
        const urlObj = new URL(req.url, 'http://localhost');
        fileId = urlObj.searchParams.get('id');
      }
      if (!fileId) {
        throw new BadRequestException('Thiếu ID File!', 'MISSING_FILE_ID');
      }
      await this.fileProfileService.deleteFile(fileId);
      this.broadcastChange();
      return sendJson(res, 200, ApiResponse.success(null, 'Đã xóa File thành công.'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async switchFile(req, res, sendJson, parseJsonBody) {
    try {
      let fileId = req.params?.id || null;
      if (!fileId) {
        try {
          const body = await parseJsonBody(req);
          fileId = body?.id || null;
        } catch (e) {}
      }
      if (!fileId) {
        const urlObj = new URL(req.url, 'http://localhost');
        fileId = urlObj.searchParams.get('id');
      }
      if (!fileId) {
        throw new BadRequestException('Thiếu ID File!', 'MISSING_FILE_ID');
      }
      const switched = await this.fileProfileService.switchFile(fileId);
      this.broadcastChange();
      const resp = ApiResponse.success(switched, `Đã chuyển sang [${switched.name}]!`);
      resp.file = switched;
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  getJarsDirectory() {
    const gamesDir = path.resolve(this.workspaceRoot, 'jars/games');
    if (!fs.existsSync(gamesDir)) {
      fs.mkdirSync(gamesDir, { recursive: true });
    }
    return gamesDir;
  }

  async getAvailableJars(req, res, sendJson) {
    try {
      const gamesDir = this.getJarsDirectory();
      const jarsRoot = path.resolve(this.workspaceRoot, 'jars');
      let items = fs.existsSync(gamesDir) ? fs.readdirSync(gamesDir) : [];
      if (fs.existsSync(jarsRoot)) {
        const rootItems = fs.readdirSync(jarsRoot).filter(f => !['emulator', 'games'].includes(f));
        items = items.concat(rootItems);
      }
      const jars = Array.from(new Set(items)).filter(f => f.toLowerCase().endsWith('.jar') && !f.toLowerCase().includes('emulator'));
      if (!jars.includes('avatar_fish_build40.jar') && fs.existsSync(path.join(gamesDir, 'avatar_fish_build40.jar'))) {
        jars.unshift('avatar_fish_build40.jar');
      }
      return sendJson(res, 200, { success: true, jars });
    } catch (err) {
      return sendJson(res, 200, { success: true, jars: ['avatar_fish_build40.jar', 'avatar_upxu_build34.jar'] });
    }
  }

  async uploadJar(req, res, sendJson) {
    try {
      const rawHeaderName = req.headers['x-filename'] || 'custom_game.jar';
      let decodedFilename = decodeURIComponent(rawHeaderName);
      decodedFilename = path.basename(decodedFilename).replace(/[^a-zA-Z0-9._-]/g, '_');

      if (!decodedFilename.toLowerCase().endsWith('.jar')) {
        return sendJson(res, 400, { success: false, message: 'Chỉ chấp nhận file có đuôi .jar!' });
      }

      let maxMb = 10;
      if (this.settingRepo) {
        try {
          const cfgMb = await this.settingRepo.get('maxUploadJarSizeMb');
          if (cfgMb && !isNaN(parseInt(cfgMb, 10)) && parseInt(cfgMb, 10) > 0) {
            maxMb = parseInt(cfgMb, 10);
          }
        } catch (e) {}
      }
      const MAX_JAR_SIZE = maxMb * 1024 * 1024;
      const rawContentLength = req.headers['content-length'];
      if (rawContentLength && parseInt(rawContentLength, 10) > MAX_JAR_SIZE) {
        return sendJson(res, 413, { success: false, message: `Dung lượng tệp vượt quá giới hạn cho phép (tối đa ${maxMb}MB)!` });
      }

      const gamesDir = this.getJarsDirectory();
      const targetPath = path.join(gamesDir, decodedFilename);
      const writeStream = fs.createWriteStream(targetPath);
      let uploadedBytes = 0;
      let limitExceeded = false;

      req.on('data', chunk => {
        uploadedBytes += chunk.length;
        if (uploadedBytes > MAX_JAR_SIZE && !limitExceeded) {
          limitExceeded = true;
          req.unpipe(writeStream);
          writeStream.destroy();
          try {
            if (fs.existsSync(targetPath)) fs.unlinkSync(targetPath);
          } catch (e) {}
          return sendJson(res, 413, { success: false, message: `Tệp tải lên quá lớn, đã bị hủy (tối đa ${maxMb}MB)!` });
        }
      });

      req.pipe(writeStream);

      writeStream.on('finish', () => {
        if (limitExceeded) return;
        return sendJson(res, 200, {
          success: true,
          message: `Đã tải lên tệp [${decodedFilename}] vào thư mục jars/games/ thành công!`,
          filename: decodedFilename
        });
      });

      writeStream.on('error', (err) => {
        if (limitExceeded) return;
        return sendJson(res, 500, { success: false, message: 'Lỗi ghi file: ' + err.message });
      });
    } catch (err) {
      return sendJson(res, 500, { success: false, message: 'Lỗi tải lên: ' + err.message });
    }
  }
}

module.exports = FileController;
