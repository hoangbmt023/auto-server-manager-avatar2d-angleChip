const jreManager = require('../../../../utils/jreManager');

/**
 * SystemController (Interface Layer)
 * Handles global configuration, JRE downloads, and system maintenance.
 */
class SystemController {
  constructor(configRepo) {
    this.configRepo = configRepo;
  }

  async getConfig(req, res, sendJson) {
    const cfg = this.configRepo.get();
    return sendJson(res, 200, {
      success: true,
      config: {
        ...cfg,
        password: cfg.password ? '******' : ''
      }
    });
  }

  async saveConfig(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const current = this.configRepo.get();

      if (body.password !== undefined && body.password !== '******') {
        current.password = body.password;
      }
      if (body.port !== undefined) current.port = parseInt(body.port, 10) || current.port;
      if (body.javaPath !== undefined) current.javaPath = body.javaPath.trim();
      if (body.appId !== undefined) current.appId = body.appId.trim();
      if (body.rmsMode !== undefined) current.rmsMode = body.rmsMode;
      if (body.autoRestart !== undefined) current.autoRestart = Boolean(body.autoRestart);
      if (body.autoStart !== undefined) current.autoStart = Boolean(body.autoStart);
      if (body.maxMemoryMb !== undefined) current.maxMemoryMb = parseInt(body.maxMemoryMb, 10) || 256;
      if (body.proxy !== undefined) current.proxy = body.proxy;

      this.configRepo.save(current);
      return sendJson(res, 200, { success: true, message: 'Đã lưu cấu hình thành công!' });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async installJre(req, res, sendJson) {
    if (jreManager.isInstalling) {
      return sendJson(res, 400, { success: false, message: 'Đang trong quá trình tải và cài đặt JRE...' });
    }

    // Start background installation
    jreManager.downloadAndInstallJRE().then(result => {
      console.log('JRE Install result:', result);
    }).catch(err => {
      console.error('JRE Install error:', err);
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
