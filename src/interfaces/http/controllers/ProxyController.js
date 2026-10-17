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
  constructor(proxyService, sseEventBus = null, proxyVnApiClient = null, settingRepo = null) {
    this.proxyService = proxyService;
    this.sseEventBus = sseEventBus;
    this.proxyVnApiClient = proxyVnApiClient;
    this.settingRepo = settingRepo;
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

  async rotateProxy(req, res, sendJson) {
    try {
      const proxyId = req.params?.id || (new URL(req.url, 'http://localhost')).searchParams.get('id');
      if (!proxyId) {
        throw new BadRequestException('Thiếu ID Proxy!', 'MISSING_PROXY_ID');
      }
      const result = await this.proxyService.rotateProxy(proxyId, this.proxyVnApiClient);
      return sendJson(res, 200, ApiResponse.success(result, result.message || 'Đổi IP Proxy thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async getSystemConfig(req, res, sendJson) {
    try {
      let dbSettings = {};
      if (this.settingRepo) {
        dbSettings = await this.settingRepo.getCompleteConfig();
      }

      const isEnabled = dbSettings.proxy_vn_enabled !== undefined
        ? (dbSettings.proxy_vn_enabled === 'true' || dbSettings.proxy_vn_enabled === true)
        : Boolean(this.proxyVnApiClient && this.proxyVnApiClient.enabled);

      const apiKey = dbSettings.proxy_vn_api_key !== undefined
        ? dbSettings.proxy_vn_api_key
        : (this.proxyVnApiClient?.apiKey || '');

      const defaultCategory = dbSettings.proxy_vn_category || this.proxyVnApiClient?.defaultCategory || 'DatacenterA';
      const defaultType = dbSettings.proxy_vn_default_type || this.proxyVnApiClient?.defaultType || 'SOCKS5';
      const defaultPeriod = parseInt(dbSettings.proxy_vn_default_period || '30', 10);
      const emergencySlotEnabled = dbSettings.proxy_emergency_slot_enabled !== undefined
        ? (dbSettings.proxy_emergency_slot_enabled === 'true' || dbSettings.proxy_emergency_slot_enabled === true)
        : true;

      const config = {
        proxyVnEnabled: isEnabled,
        apiKey: apiKey ? '******' : '',
        hasApiKey: Boolean(apiKey),
        defaultCategory,
        defaultType,
        defaultPeriod,
        emergencySlotEnabled,
        maxSlotsPerIp: 6,
        emergencySlotLimit: 7,
        allocationStrategy: emergencySlotEnabled
          ? 'Best-Fit Waterfall 6/6 (Tối đa 4 HM + 3 DK, Slot 7 khẩn cấp)'
          : 'Best-Fit Waterfall 6/6 (Cố định 6 slot)'
      };
      return sendJson(res, 200, ApiResponse.success(config, 'Lấy cấu hình hệ thống Proxy thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async saveSystemConfig(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const updates = {};

      if (body.proxyVnEnabled !== undefined) {
        updates.proxy_vn_enabled = String(Boolean(body.proxyVnEnabled));
      }
      if (body.apiKey !== undefined && body.apiKey !== '******' && body.apiKey !== '') {
        updates.proxy_vn_api_key = body.apiKey.trim();
      }
      if (body.defaultCategory) {
        updates.proxy_vn_category = body.defaultCategory.trim();
      }
      if (body.defaultType) {
        updates.proxy_vn_default_type = body.defaultType.trim().toUpperCase();
      }
      if (body.defaultPeriod !== undefined && body.defaultPeriod !== null) {
        const periodNum = parseInt(body.defaultPeriod, 10);
        const validPeriod = Math.min(365, Math.max(1, isNaN(periodNum) ? 30 : periodNum));
        updates.proxy_vn_default_period = String(validPeriod);
      }
      if (body.emergencySlotEnabled !== undefined) {
        updates.proxy_emergency_slot_enabled = String(Boolean(body.emergencySlotEnabled));
      }

      if (this.settingRepo && Object.keys(updates).length > 0) {
        await this.settingRepo.setMany(updates);
      }

      // Hot-reload runtime client
      if (this.proxyVnApiClient) {
        if (updates.proxy_vn_enabled !== undefined) {
          this.proxyVnApiClient.enabled = updates.proxy_vn_enabled === 'true';
        }
        if (updates.proxy_vn_api_key) {
          this.proxyVnApiClient.apiKey = updates.proxy_vn_api_key;
        }
        if (updates.proxy_vn_category) {
          this.proxyVnApiClient.defaultCategory = updates.proxy_vn_category;
        }
        if (updates.proxy_vn_default_type) {
          this.proxyVnApiClient.defaultType = updates.proxy_vn_default_type;
        }
      }

      this.broadcastChange();
      return sendJson(res, 200, ApiResponse.success(null, 'Cập nhật cấu hình Proxy Hệ Thống thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }
}

module.exports = ProxyController;
