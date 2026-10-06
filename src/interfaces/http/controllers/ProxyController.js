/**
 * ProxyController (Interface Layer)
 * Handles HTTP requests for Proxy CRUD operations and Health Testing.
 */
class ProxyController {
  constructor(proxyService, sseEventBus = null) {
    this.proxyService = proxyService;
    this.sseEventBus = sseEventBus;
  }

  broadcastChange() {
    if (this.sseEventBus) {
      try {
        this.sseEventBus.broadcast('proxy-status-changed', { timestamp: Date.now() });
        this.sseEventBus.broadcast('bot-status-changed', { timestamp: Date.now() });
      } catch (e) {}
    }
  }

  async getProxies(req, res, sendJson) {
    try {
      const proxies = this.proxyService.getProxies();
      return sendJson(res, 200, {
        success: true,
        proxies
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async saveProxy(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const { proxy, testResult } = await this.proxyService.saveProxy(body);
      const message = testResult && testResult.isExpired
        ? `⚠️ Đã lưu Proxy nhưng kiểm tra kết nối THẤT BẠI: ${testResult.message}. Đã tự động đánh dấu HẾT HẠN!`
        : `✅ Đã lưu Proxy và kiểm tra kết nối thành công (${testResult?.latencyMs || 0}ms)!`;
      this.broadcastChange();
      return sendJson(res, 200, {
        success: true,
        message,
        proxy,
        testResult
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async deleteProxy(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body.id) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID Proxy!' });
      }
      this.proxyService.deleteProxy(body.id);
      this.broadcastChange();
      return sendJson(res, 200, {
        success: true,
        message: 'Đã xóa Proxy thành công!'
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async testProxy(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (!body.id) {
        return sendJson(res, 400, { success: false, message: 'Thiếu ID Proxy!' });
      }
      const result = await this.proxyService.testProxy(body.id);
      return sendJson(res, 200, {
        success: true,
        ...result
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }

  async testAllProxies(req, res, sendJson) {
    try {
      const results = await this.proxyService.testAllProxies();
      return sendJson(res, 200, {
        success: true,
        results
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }
}

module.exports = ProxyController;
