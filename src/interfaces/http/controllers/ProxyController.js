/**
 * ProxyController (Interface Layer)
 * Handles HTTP requests for Proxy CRUD operations.
 */
class ProxyController {
  constructor(proxyService) {
    this.proxyService = proxyService;
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
      const saved = this.proxyService.saveProxy(body);
      return sendJson(res, 200, {
        success: true,
        message: 'Đã lưu Proxy thành công!',
        proxy: saved
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
      return sendJson(res, 200, {
        success: true,
        message: 'Đã xóa Proxy thành công!'
      });
    } catch (err) {
      return sendJson(res, 400, { success: false, message: err.message });
    }
  }
}

module.exports = ProxyController;
