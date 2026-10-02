const path = require('path');
const fs = require('fs');

/**
 * FileController (Interface Layer)
 * Handles bot profiles/files and custom JAR file uploads.
 */
class FileController {
  constructor(fileProfileService, configRepo) {
    this.fileProfileService = fileProfileService;
    this.configRepo = configRepo;
    this.workspaceRoot = path.resolve(__dirname, '../../../../');
  }

  async getFiles(req, res, sendJson) {
    const config = this.configRepo.get();
    const files = this.fileProfileService.getFiles();
    return sendJson(res, 200, {
      success: true,
      activeFileId: config.activeFileId || 'file_1',
      files
    });
  }

  async saveFile(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const saved = this.fileProfileService.saveFile(body);
      return sendJson(res, 200, {
        success: true,
        message: `Đã lưu File [${saved.name}] thành công!`,
        file: saved
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async deleteFile(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body.id) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID File!' });
      }
      this.fileProfileService.deleteFile(body.id);
      return sendJson(res, 200, { success: true, message: 'Đã xóa File thành công.' });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async switchFile(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body.id) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID File!' });
      }
      const switched = this.fileProfileService.switchFile(body.id);
      return sendJson(res, 200, {
        success: true,
        message: `Đã chuyển sang [${switched.name}]!`,
        file: switched
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
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

      const gamesDir = this.getJarsDirectory();
      const targetPath = path.join(gamesDir, decodedFilename);
      const writeStream = fs.createWriteStream(targetPath);

      req.pipe(writeStream);

      writeStream.on('finish', () => {
        return sendJson(res, 200, {
          success: true,
          message: `Đã tải lên tệp [${decodedFilename}] vào thư mục jars/games/ thành công!`,
          filename: decodedFilename
        });
      });

      writeStream.on('error', (err) => {
        return sendJson(res, 500, { success: false, message: 'Lỗi ghi file: ' + err.message });
      });
    } catch (err) {
      return sendJson(res, 500, { success: false, message: 'Lỗi tải lên: ' + err.message });
    }
  }
}

module.exports = FileController;
