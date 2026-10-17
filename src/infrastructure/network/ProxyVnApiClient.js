/**
 * ProxyVnApiClient (Infrastructure Layer - Network)
 * HTTP Client connecting directly with CÔNG TY TNHH PROXY VN API v2 (https://proxy.vn/?home=apiv2).
 * Handles:
 * - muaproxy.php: On-Demand purchasing of static IPv4 proxies
 * - giahanproxy.php: Extending proxy lease duration
 * - doiproxy.php: Rotating malfunctioning proxy IP
 * - listproxy.php: Fetching active purchased proxies and expirations
 */
class ProxyVnApiClient {
  constructor(config = {}) {
    this.apiKey = config.apiKey || process.env.PROXY_VN_API_KEY || '';
    this.baseUrl = (config.baseUrl || process.env.PROXY_VN_BASE_URL || 'https://proxy.vn/apiv2').replace(/\/+$/, '');
    this.defaultCategory = config.defaultCategory || process.env.PROXY_VN_DEFAULT_CATEGORY || 'DatacenterA';
    this.defaultType = (config.defaultType || process.env.PROXY_VN_DEFAULT_TYPE || 'SOCKS5').toUpperCase();
    this.timeoutMs = parseInt(config.timeoutMs || 15000, 10);
    this.enabled = config.enabled !== undefined ? Boolean(config.enabled) : (process.env.PROXY_VN_ENABLED !== 'false');
  }

  _ensureEnabled() {
    if (!this.enabled) {
      throw new Error('Proxy.vn API integration is currently disabled (PROXY_VN_ENABLED=false)!');
    }
    if (!this.apiKey) {
      throw new Error('Thiếu cấu hình PROXY_VN_API_KEY trong hệ thống!');
    }
  }

  async _fetchWithTimeout(url, options = {}) {
    const controller = new AbortController();
    const timeout = setTimeout(() => controller.abort(), this.timeoutMs);

    try {
      const response = await fetch(url, {
        ...options,
        signal: controller.signal,
        headers: {
          'Accept': 'application/json',
          'User-Agent': 'AvatarBotManager/2.0',
          ...(options.headers || {})
        }
      });
      clearTimeout(timeout);

      const text = await response.text();
      let data = null;
      try {
        data = JSON.parse(text);
      } catch (err) {
        throw new Error(`Proxy.vn trả về phản hồi không phải JSON: ${text.substring(0, 150)}`);
      }
      return data;
    } catch (err) {
      clearTimeout(timeout);
      if (err.name === 'AbortError') {
        throw new Error(`Timeout (${this.timeoutMs}ms) khi kết nối đến API proxy.vn`);
      }
      throw err;
    }
  }

  /**
   * Buy a new static IPv4 proxy from proxy.vn
   * @param {Object} options
   * @param {string} options.category - DatacenterA, Viettel, VNPT, FPT, etc.
   * @param {number} options.days - Number of days (default: 30)
   * @param {string} options.type - SOCKS5 or HTTP
   * @returns {Promise<{ externalId: string, ip: string, port: number, username: string, password: string, type: string, expiresAt: Date, category: string }>}
   */
  async buyProxy({ category = null, days = 30, type = null } = {}) {
    this._ensureEnabled();
    const cat = category || this.defaultCategory;
    const pType = (type || this.defaultType).toUpperCase();
    const numDays = Math.max(1, parseInt(days || 30, 10));

    const params = new URLSearchParams({
      loaiproxy: cat,
      key: this.apiKey,
      soluong: '1',
      ngay: String(numDays),
      type: pType,
      user: 'random',
      password: 'random'
    });

    const url = `${this.baseUrl}/muaproxy.php?${params.toString()}`;
    const data = await this._fetchWithTimeout(url);

    // proxy.vn can return single object or array of objects with status
    const resultObj = Array.isArray(data) ? data[0] : data;

    if (!resultObj || resultObj.status !== 100) {
      const errCode = resultObj?.status || 'UNKNOWN';
      const errMsgMap = {
        101: 'API Key proxy.vn không tồn tại hoặc sai!',
        102: 'Số dư tài khoản trên proxy.vn không đủ tiền để mua proxy!',
        103: `Loại proxy [${cat}] trên proxy.vn hiện đang hết hàng!`,
        104: 'Lỗi không xác định từ máy chủ proxy.vn',
        201: 'Mua thành công nhưng không đủ số lượng yêu cầu'
      };
      const msg = errMsgMap[errCode] || `Lỗi mua proxy (Code: ${errCode})`;
      throw new Error(msg);
    }

    const expiresAt = resultObj.time ? new Date(resultObj.time * 1000) : new Date(Date.now() + numDays * 86400 * 1000);

    return {
      externalId: String(resultObj.idproxy || ''),
      ip: String(resultObj.ip || '').trim(),
      port: parseInt(resultObj.port, 10),
      username: String(resultObj.user || '').trim(),
      password: String(resultObj.password || '').trim(),
      type: pType,
      category: cat,
      expiresAt
    };
  }

  /**
   * Renew an existing proxy
   * @param {Object} options
   * @param {string|number} options.externalId - idproxy on proxy.vn
   * @param {string} options.category - Category passed during purchase
   * @param {number} options.days - Number of days to renew (default: 30)
   * @returns {Promise<{ success: boolean, externalId: string, expiresAt: Date }>}
   */
  async renewProxy({ externalId, category = null, days = 30 }) {
    this._ensureEnabled();
    if (!externalId) {
      throw new Error('Thiếu externalId (idproxy) để gia hạn proxy trên proxy.vn!');
    }
    const cat = category || this.defaultCategory;
    const numDays = Math.max(1, parseInt(days || 30, 10));

    const params = new URLSearchParams({
      loaiproxy: cat,
      key: this.apiKey,
      ngay: String(numDays),
      idproxy: String(externalId)
    });

    const url = `${this.baseUrl}/giahanproxy.php?${params.toString()}`;
    const data = await this._fetchWithTimeout(url);
    const resultObj = Array.isArray(data) ? data[0] : data;

    if (!resultObj || resultObj.status !== 100) {
      const errCode = resultObj?.status || 'UNKNOWN';
      const errMsgMap = {
        101: 'API Key proxy.vn không tồn tại!',
        102: 'Số dư tài khoản trên proxy.vn không đủ tiền để gia hạn!',
        104: 'Lỗi không xác định khi gia hạn proxy'
      };
      const msg = errMsgMap[errCode] || `Lỗi gia hạn proxy ID [${externalId}] (Code: ${errCode})`;
      throw new Error(msg);
    }

    const expiresAt = resultObj.time ? new Date(resultObj.time * 1000) : new Date(Date.now() + numDays * 86400 * 1000);

    return {
      success: true,
      externalId: String(resultObj.idproxy || externalId),
      expiresAt
    };
  }

  /**
   * Rotate a malfunctioning proxy IP
   * @param {Object} options
   * @param {string|number} options.externalId - idproxy on proxy.vn
   * @param {string} options.category - Category of proxy
   * @param {string} options.type - SOCKS5 or HTTP
   * @returns {Promise<{ externalId: string, ip: string, port: number, username: string, password: string, type: string }>}
   */
  async rotateProxyIp({ externalId, category = null, type = null }) {
    this._ensureEnabled();
    if (!externalId) {
      throw new Error('Thiếu externalId (idproxy) để đổi IP proxy trên proxy.vn!');
    }
    const cat = category || this.defaultCategory;
    const pType = (type || this.defaultType).toUpperCase();

    const params = new URLSearchParams({
      loaiproxy: cat,
      loaiproxynhan: cat,
      key: this.apiKey,
      type: pType,
      user: 'random',
      password: 'random',
      idproxy: String(externalId)
    });

    const url = `${this.baseUrl}/doiproxy.php?${params.toString()}`;
    const data = await this._fetchWithTimeout(url);
    const resultObj = Array.isArray(data) ? data[0] : data;

    if (!resultObj || resultObj.status !== 100) {
      const errCode = resultObj?.status || 'UNKNOWN';
      const errMsgMap = {
        101: 'API Key proxy.vn không tồn tại!',
        102: 'Không đủ tiền để đổi proxy!',
        103: 'Loại proxy này hiện đang hết hàng để đổi!',
        104: 'Lỗi không xác định khi đổi proxy'
      };
      const msg = errMsgMap[errCode] || `Lỗi đổi IP proxy ID [${externalId}] (Code: ${errCode})`;
      throw new Error(msg);
    }

    return {
      externalId: String(resultObj.idproxy || externalId),
      ip: String(resultObj.ip || '').trim(),
      port: parseInt(resultObj.port, 10),
      username: String(resultObj.user || '').trim(),
      password: String(resultObj.password || '').trim(),
      type: pType
    };
  }

  /**
   * List purchased proxies from proxy.vn
   * @param {string} category
   * @param {string} idproxy - 'all' or specific ID
   * @returns {Promise<Array>}
   */
  async getProxyList({ category = null, idproxy = 'all' } = {}) {
    this._ensureEnabled();
    const cat = category || this.defaultCategory;

    const params = new URLSearchParams({
      loaiproxy: cat,
      key: this.apiKey,
      idproxy: String(idproxy || 'all')
    });

    const url = `${this.baseUrl}/listproxy.php?${params.toString()}`;
    const data = await this._fetchWithTimeout(url);

    if (Array.isArray(data)) {
      return data.filter(item => item && item.status === 100);
    } else if (data && data.status === 100) {
      return [data];
    }
    return [];
  }
}

module.exports = ProxyVnApiClient;
