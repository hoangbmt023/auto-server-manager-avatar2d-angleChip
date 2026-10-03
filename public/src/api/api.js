/**
 * API Client Service (Frontend)
 * Centralizes all REST API calls with error handling & auth token management.
 */
window.ApiClient = {
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

  getHeaders() {
    const headers = { 'Content-Type': 'application/json' };
    const token = this.getAuthToken();
    if (token) headers['Authorization'] = `Bearer ${token}`;
    return headers;
  },

  async request(endpoint, options = {}) {
    const headers = { ...this.getHeaders(), ...(options.headers || {}) };
    const res = await fetch(endpoint, { ...options, headers });
    const data = await res.json();
    return data;
  },

  getStatus() {
    return this.request('/api/status');
  },

  getFiles() {
    return this.request('/api/files');
  },

  saveFile(payload) {
    return this.request('/api/files', { method: 'POST', body: JSON.stringify(payload) });
  },

  deleteFile(id) {
    return this.request('/api/files/delete', { method: 'POST', body: JSON.stringify({ id }) });
  },

  switchFile(id) {
    return this.request('/api/files/switch', { method: 'POST', body: JSON.stringify({ id }) });
  },

  getProxies() {
    return this.request('/api/proxies');
  },

  saveProxy(payload) {
    return this.request('/api/proxies', { method: 'POST', body: JSON.stringify(payload) });
  },

  deleteProxy(id) {
    return this.request('/api/proxies/delete', { method: 'POST', body: JSON.stringify({ id }) });
  },

  testProxy(id) {
    return this.request('/api/proxies/test', { method: 'POST', body: JSON.stringify({ id }) });
  },

  testAllProxies() {
    return this.request('/api/proxies/test-all', { method: 'POST' });
  },

  getAccounts() {
    return this.request('/api/accounts');
  },

  saveAccount(payload) {
    return this.request('/api/accounts', { method: 'POST', body: JSON.stringify(payload) });
  },

  deleteAccount(id) {
    return this.request('/api/accounts/delete', { method: 'POST', body: JSON.stringify({ id }) });
  },

  switchAccountServer(id, newServerId) {
    return this.request('/api/accounts/switch-server', { method: 'POST', body: JSON.stringify({ id, newServerId }) });
  },

  updateAccountSetup(id, payload = {}) {
    return this.request('/api/accounts/setup', { method: 'POST', body: JSON.stringify({ id, ...payload }) });
  },

  resetAccountData(id) {
    return this.request('/api/accounts/reset-data', { method: 'POST', body: JSON.stringify({ id }) });
  },

  startAccount(id) {
    return this.request('/api/bot/start-account', { method: 'POST', body: JSON.stringify({ id }) });
  },

  stopAccount(id) {
    return this.request('/api/bot/stop-account', { method: 'POST', body: JSON.stringify({ id }) });
  },

  triggerAuto(id, autoType = 'farm', action = 'start') {
    return this.request('/api/bot/auto', { method: 'POST', body: JSON.stringify({ id, autoType, action }) });
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

  getLogs() {
    return this.request('/api/logs');
  },

  clearLogs() {
    return this.request('/api/clear-logs', { method: 'POST' });
  },

  getConfig() {
    return this.request('/api/config');
  },

  saveConfig(payload) {
    return this.request('/api/config', { method: 'POST', body: JSON.stringify(payload) });
  },

  getAvailableJars() {
    return this.request('/api/available-jars');
  },

  uploadJar(file) {
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
  }
};
