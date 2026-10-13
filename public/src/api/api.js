/**
 * API Client Service (Frontend) - RESTful & Axios Engine
 * Centralizes all RESTful API interactions using Axios with interceptors,
 * authentication token injection, and unified ApiResponse error unwrapping.
 */
(function (window) {
  // 1. Khởi tạo Axios Instance
  const axiosInstance = (window.axios ? window.axios.create : null) ? window.axios.create({
    baseURL: '',
    timeout: 15000,
    headers: {
      'Content-Type': 'application/json'
    }
  }) : null;

  // 2. Request Interceptor: Tự động đính kèm Bearer Token nếu có
  if (axiosInstance) {
    axiosInstance.interceptors.request.use(
      (config) => {
        const token = localStorage.getItem('avatar_bot_token');
        if (token) {
          config.headers = config.headers || {};
          config.headers['Authorization'] = `Bearer ${token}`;
        }
        return config;
      },
      (error) => Promise.reject(error)
    );

    // 3. Response Interceptor: Tự động unwrap response và chuẩn hóa lỗi theo ApiResponse format
    axiosInstance.interceptors.response.use(
      (response) => {
        // Trả về data trực tiếp từ ApiResponse { success, message, data, ... }
        return response.data;
      },
      (error) => {
        // Bắt lỗi HTTP 4xx, 5xx: Giữ nguyên cấu trúc ErrorResponse từ Backend
        if (error.response && error.response.data) {
          const errData = error.response.data;
          // Nếu có lỗi validation theo trường (errors: { field: msg }), format message trực quan cho UI
          if (errData.errors && typeof errData.errors === 'object') {
            const fieldMsgs = Object.values(errData.errors);
            if (fieldMsgs.length > 0 && (!errData.message || errData.message === 'Không hợp lệ')) {
              errData.message = fieldMsgs.join('; ');
            }
          }
          return Promise.resolve(errData);
        }
        // Lỗi timeout hoặc network không thể kết nối server
        return Promise.resolve({
          success: false,
          message: error.message || 'Không thể kết nối đến máy chủ bot!',
          errors: null
        });
      }
    );
  }

  // 4. API Client Object
  window.ApiClient = {
    axiosInstance,

    getAuthToken() {
      return localStorage.getItem('avatar_bot_token') || '';
    },

    setAuthToken(token) {
      if (token) {
        localStorage.setItem('avatar_bot_token', token);
      } else {
        localStorage.removeItem('avatar_bot_token');
      }
    },

    getRefreshToken() {
      return localStorage.getItem('avatar_bot_refresh_token') || '';
    },

    setRefreshToken(token) {
      if (token) {
        localStorage.setItem('avatar_bot_refresh_token', token);
      } else {
        localStorage.removeItem('avatar_bot_refresh_token');
      }
    },

    getCurrentUser() {
      const userStr = localStorage.getItem('avatar_bot_user');
      try {
        return userStr ? JSON.parse(userStr) : null;
      } catch (e) {
        return null;
      }
    },

    setCurrentUser(user) {
      if (user) {
        localStorage.setItem('avatar_bot_user', JSON.stringify(user));
      } else {
        localStorage.removeItem('avatar_bot_user');
      }
    },

    async login(email, password) {
      const res = await this.request('/api/auth/login', {
        method: 'POST',
        data: { email, password }
      });
      if (res && res.success && res.data) {
        if (res.data.accessToken) this.setAuthToken(res.data.accessToken);
        if (res.data.refreshToken) this.setRefreshToken(res.data.refreshToken);
        if (res.data.user) this.setCurrentUser(res.data.user);
      }
      return res;
    },

    async register(data) {
      const res = await this.request('/api/auth/register', {
        method: 'POST',
        data
      });
      if (res && res.success && res.data) {
        if (res.data.accessToken) this.setAuthToken(res.data.accessToken);
        if (res.data.refreshToken) this.setRefreshToken(res.data.refreshToken);
        if (res.data.user) this.setCurrentUser(res.data.user);
      }
      return res;
    },

    async getMe() {
      return this.request('/api/auth/me', { method: 'GET' });
    },

    logout() {
      this.setAuthToken(null);
      this.setRefreshToken(null);
      this.setCurrentUser(null);
    },

    getHeaders() {
      const headers = { 'Content-Type': 'application/json' };
      const token = this.getAuthToken();
      if (token) headers['Authorization'] = `Bearer ${token}`;
      return headers;
    },

    // Hàm gọi tổng quát (sử dụng Axios với fallback Fetch an toàn)
    async request(url, config = {}) {
      if (axiosInstance) {
        return axiosInstance({ url, ...config });
      }
      // Fallback nếu vì lý do nào đó Axios CDN chưa tải xong
      try {
        const headers = { ...this.getHeaders(), ...(config.headers || {}) };
        const res = await fetch(url, {
          method: config.method || 'GET',
          headers,
          body: config.data ? JSON.stringify(config.data) : undefined
        });
        return await res.json();
      } catch (err) {
        return { success: false, message: err.message || 'Lỗi mạng' };
      }
    },

    // ==========================================
    // 1. SYSTEM & BOT STATUS
    // ==========================================
    getStatus() {
      return this.request('/api/status', { method: 'GET' });
    },

    getConfig() {
      return this.request('/api/config', { method: 'GET' });
    },

    saveConfig(payload) {
      return this.request('/api/config', { method: 'PUT', data: payload });
    },

    getLogs() {
      return this.request('/api/logs', { method: 'GET' });
    },

    clearLogs() {
      return this.request('/api/clear-logs', { method: 'POST' });
    },

    // ==========================================
    // 2. FILE & PROFILE MANAGEMENT (RESTful)
    // ==========================================
    getFiles() {
      return this.request('/api/files', { method: 'GET' });
    },

    saveFile(payload) {
      if (payload && payload.id) {
        return this.request(`/api/files/${encodeURIComponent(payload.id)}`, { method: 'PUT', data: payload });
      }
      return this.request('/api/files', { method: 'POST', data: payload });
    },

    deleteFile(id) {
      return this.request(`/api/files/${encodeURIComponent(id)}`, { method: 'DELETE' });
    },

    switchFile(id) {
      return this.request(`/api/files/${encodeURIComponent(id)}/switch`, { method: 'POST' });
    },

    // ==========================================
    // 3. PROXY MANAGEMENT (RESTful)
    // ==========================================
    getProxies() {
      return this.request('/api/proxies', { method: 'GET' });
    },

    saveProxy(payload) {
      if (payload && payload.id) {
        return this.request(`/api/proxies/${encodeURIComponent(payload.id)}`, { method: 'PUT', data: payload });
      }
      return this.request('/api/proxies', { method: 'POST', data: payload });
    },

    deleteProxy(id) {
      return this.request(`/api/proxies/${encodeURIComponent(id)}`, { method: 'DELETE' });
    },

    testProxy(id) {
      return this.request(`/api/proxies/${encodeURIComponent(id)}/test`, { method: 'POST' });
    },

    testAllProxies() {
      return this.request('/api/proxies/test-all', { method: 'POST' });
    },

    // ==========================================
    // 4. ACCOUNT MANAGEMENT (RESTful)
    // ==========================================
    getAccounts() {
      return this.request('/api/accounts', { method: 'GET' });
    },

    saveAccount(payload) {
      if (payload && payload.id) {
        return this.request(`/api/accounts/${encodeURIComponent(payload.id)}`, { method: 'PUT', data: payload });
      }
      return this.request('/api/accounts', { method: 'POST', data: payload });
    },

    deleteAccount(id) {
      return this.request(`/api/accounts/${encodeURIComponent(id)}`, { method: 'DELETE' });
    },

    switchAccountServer(id, newServerId) {
      return this.request(`/api/accounts/${encodeURIComponent(id)}/switch-server`, {
        method: 'POST',
        data: { newServerId }
      });
    },

    updateAccountSetup(id, payload = {}) {
      return this.request(`/api/accounts/${encodeURIComponent(id)}/setup`, {
        method: 'PUT',
        data: payload
      });
    },

    resetAccountData(id) {
      return this.request(`/api/accounts/${encodeURIComponent(id)}/reset-data`, {
        method: 'POST'
      });
    },

    // ==========================================
    // 5. BOT EXECUTION & AUTOMATION (RESTful)
    // ==========================================
    startAccount(id) {
      return this.request(`/api/accounts/${encodeURIComponent(id)}/start`, {
        method: 'POST'
      });
    },

    stopAccount(id) {
      return this.request(`/api/accounts/${encodeURIComponent(id)}/stop`, {
        method: 'POST'
      });
    },

    triggerAuto(id, autoType = 'farm', action = 'start') {
      return this.request(`/api/accounts/${encodeURIComponent(id)}/auto`, {
        method: 'POST',
        data: { autoType, action }
      });
    },

    startAllFile() {
      return this.request('/api/start', { method: 'POST' });
    },

    stopAll() {
      return this.request('/api/stop', { method: 'POST' });
    },

    restartAll() {
      return this.request('/api/restart', { method: 'POST' });
    },

    // ==========================================
    // 6. JAR FILES & RUNTIME
    // ==========================================
    getAvailableJars() {
      return this.request('/api/available-jars', { method: 'GET' });
    },

    async uploadJar(file) {
      if (axiosInstance) {
        return axiosInstance.post('/api/upload-jar', file, {
          headers: {
            'x-filename': encodeURIComponent(file.name),
            'Content-Type': 'application/octet-stream'
          }
        });
      }
      return fetch('/api/upload-jar', {
        method: 'POST',
        headers: {
          ...this.getHeaders(),
          'x-filename': encodeURIComponent(file.name),
          'Content-Type': 'application/octet-stream'
        },
        body: file
      }).then(r => r.json());
    },

    installJre() {
      return this.request('/api/jre/install', { method: 'POST' });
    },

    getJreProgress() {
      return this.request('/api/jre/progress', { method: 'GET' });
    },

    // ==========================================
    // 7. RMS DIAGNOSTICS & AUDITING
    // ==========================================
    inspectRms(accountId) {
      return this.request(`/api/accounts/inspect-rms?id=${encodeURIComponent(accountId)}`, { method: 'GET' });
    },

    auditRms(accountId) {
      return this.request(`/api/accounts/audit-rms?id=${encodeURIComponent(accountId)}`, { method: 'GET' });
    },

    fixRms(accountId) {
      return this.request('/api/accounts/fix-rms', {
        method: 'POST',
        data: { id: accountId }
      });
    },

    randomTestRms(accountId, rounds = 5) {
      return this.request('/api/accounts/random-test-rms', {
        method: 'POST',
        data: { id: accountId, rounds }
      });
    },

    restoreOriginalRms(accountId) {
      return this.request('/api/accounts/restore-original-rms', {
        method: 'POST',
        data: { id: accountId }
      });
    }
  };
})(window);
