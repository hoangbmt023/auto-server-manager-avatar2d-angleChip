const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');
const SaveProxyRequestDto = require('../../../application/dtos/proxy/SaveProxyRequestDto');
const { BadRequestException } = require('../../../domain/errors');
const { sendErrorResponse } = require('../helpers/errorHandler');

/**
 * ProxyController (Interface Layer)
 * Handles HTTP requests for Proxy CRUD operations and Health Testing.
 * Automatically wraps responses with standard ApiResponse and maps Custom Exceptions.
 */
class ProxyController {
  constructor(proxyService, sseEventBus = null) {
    this.proxyService = proxyService;
    this.sseEventBus = sseEventBus;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
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
      const proxies = await this.proxyService.getProxies();
      const resp = ApiResponse.success(proxies, 'Lấy danh sách Proxy thành công!');
      resp.proxies = proxies; // Backward compatibility
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async getProxy(req, res, sendJson) {
    try {
      const proxyId = req.params?.id || (new URL(req.url, 'http://localhost')).searchParams.get('id');
      if (!proxyId) {
        throw new BadRequestException('Thiếu ID Proxy!', 'MISSING_PROXY_ID');
      }
      const proxy = await this.proxyService.getProxyById(proxyId);
      return sendJson(res, 200, ApiResponse.success(proxy, 'Lấy thông tin Proxy thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async saveProxy(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      if (req.params && req.params.id && !body.id) {
        body.id = req.params.id;
      }
      const dto = new SaveProxyRequestDto(body);
      dto.validate(); // Chặn ngay tầng đầu tiên

      const { proxy, testResult } = await this.proxyService.saveProxy(dto);
      const message = testResult && testResult.isExpired
        ? `Đã lưu Proxy nhưng kiểm tra kết nối THẤT BẠI: ${testResult.message}. Đã tự động đánh dấu HẾT HẠN!`
        : `Đã lưu Proxy và kiểm tra kết nối thành công (${testResult?.latencyMs || 0}ms)!`;
      this.broadcastChange();

      const payload = { proxy, testResult };
      const resp = ApiResponse.success(payload, message);
      Object.assign(resp, payload); // Backward compatibility
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async deleteProxy(req, res, sendJson, parseJsonBody) {
    try {
      let proxyId = req.params?.id || null;
      if (!proxyId) {
        try {
          const body = await parseJsonBody(req);
          proxyId = body?.id || null;
        } catch (e) {}
      }

      if (!proxyId) {
        const urlObj = new URL(req.url, 'http://localhost');
        proxyId = urlObj.searchParams.get('id');
      }

      if (!proxyId) {
        throw new BadRequestException('Thiếu ID Proxy!', 'MISSING_PROXY_ID');
      }

      await this.proxyService.deleteProxy(proxyId);
      this.broadcastChange();
      return sendJson(res, 200, ApiResponse.success(null, 'Đã xóa Proxy thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async testProxy(req, res, sendJson, parseJsonBody) {
    try {
      let proxyId = req.params?.id || null;
      if (!proxyId) {
        try {
          const body = await parseJsonBody(req);
          proxyId = body?.id || null;
        } catch (e) {}
      }
      if (!proxyId) {
        const urlObj = new URL(req.url, 'http://localhost');
        proxyId = urlObj.searchParams.get('id');
      }
      if (!proxyId) {
        throw new BadRequestException('Thiếu ID Proxy!', 'MISSING_PROXY_ID');
      }
      const result = await this.proxyService.testProxy(proxyId);
      const resp = ApiResponse.success(result, 'Kiểm tra Proxy thành công!');
      Object.assign(resp, result); // Backward compatibility
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async testAllProxies(req, res, sendJson) {
    try {
      const results = await this.proxyService.testAllProxies();
      const resp = ApiResponse.success(results, 'Kiểm tra toàn bộ Proxy thành công!');
      resp.results = results; // Backward compatibility
      return sendJson(res, 200, resp);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }
}

module.exports = ProxyController;
