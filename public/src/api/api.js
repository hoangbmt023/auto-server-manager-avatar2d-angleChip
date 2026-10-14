/**
 * ApiClient Facade & Compatibility Layer
 * Delegates all domain operations to modular frontend services:
 * - window.authService
 * - window.accountService
 * - window.botService
 * - window.fileService
 * - window.proxyService
 * - window.systemService
 * - window.rmsService
 * - window.tokenManager (RAM-only token storage, Zero localStorage)
 */
(function (window) {
  window.ApiClient = {
    // RAM Token Accessors
    getAuthToken() {
      return window.tokenManager ? window.tokenManager.getAccessToken() : '';
    },

    setAuthToken(token) {
      if (window.tokenManager) {
        window.tokenManager.setAccessToken(token);
      }
    },

    getRefreshToken() {
      // Refresh token is in HttpOnly Cookie, not accessible or stored in JS
      return '';
    },

    setRefreshToken(_token) {
      // No-op: Refresh token is securely managed via Set-Cookie HttpOnly by the server
    },

    getCurrentUser() {
      // User profile cached in sessionStorage for UI state restoration across page refreshes
      const userStr = sessionStorage.getItem('avatar_bot_user');
      try {
        return userStr ? JSON.parse(userStr) : null;
      } catch (e) {
        return null;
      }
    },

    setCurrentUser(user) {
      if (user) {
        sessionStorage.setItem('avatar_bot_user', JSON.stringify(user));
      } else {
        sessionStorage.removeItem('avatar_bot_user');
      }
    },

    // Auth methods delegated to authService
    async login(email, password) {
      const res = await window.authService.login({ email, password });
      if (res && res.success && res.data) {
        if (res.data.user) this.setCurrentUser(res.data.user);
      }
      return res;
    },

    async register(data) {
      const res = await window.authService.register(data);
      if (res && res.success && res.data && res.data.user) {
        this.setCurrentUser(res.data.user);
      }
      return res;
    },

    async getMe() {
      return await window.authService.getMe();
    },

    async logout() {
      await window.authService.logout();
      this.setCurrentUser(null);
    },

    // Bot & System methods
    getStatus: () => window.botService.getStatus(),
    getConfig: () => window.systemService.getConfig(),
    saveConfig: (p) => window.systemService.saveConfig(p),
    getLogs: () => window.systemService.getLogs(),
    clearLogs: () => window.systemService.clearLogs(),

    // File methods
    getFiles: () => window.fileService.getFiles(),
    saveFile: (p) => window.fileService.saveFile(p),
    deleteFile: (id) => window.fileService.deleteFile(id),
    switchFile: (id) => window.fileService.switchFile(id),

    // Proxy methods
    getProxies: () => window.proxyService.getProxies(),
    saveProxy: (p) => window.proxyService.saveProxy(p),
    deleteProxy: (id) => window.proxyService.deleteProxy(id),
    testProxy: (id) => window.proxyService.testProxy(id),
    testAllProxies: () => window.proxyService.testAllProxies(),

    // Account methods
    getAccounts: () => window.accountService.getAccounts(),
    saveAccount: (p) => window.accountService.saveAccount(p),
    deleteAccount: (id) => window.accountService.deleteAccount(id),
    switchAccountServer: (id, s) => window.accountService.switchAccountServer(id, s),
    updateAccountSetup: (id, p) => window.accountService.updateAccountSetup(id, p),
    resetAccountData: (id) => window.accountService.resetAccountData(id),

    // Bot execution methods
    startAccount: (id) => window.accountService.startAccount(id),
    stopAccount: (id) => window.accountService.stopAccount(id),
    triggerAuto: (id, t, a) => window.accountService.triggerAuto(id, t, a),
    startAllFile: () => window.botService.startAllFile(),
    stopAll: () => window.botService.stopAll(),
    restartAll: () => window.botService.restartAll(),
    getAvailableJars: () => window.botService.getAvailableJars(),
    uploadJar: (f) => window.botService.uploadJar(f),
    installJre: () => window.botService.installJre(),
    getJreProgress: () => window.botService.getJreProgress(),

    // RMS Diagnostics methods
    inspectRms: (id) => window.rmsService.inspectRms(id),
    auditRms: (id) => window.rmsService.auditRms(id),
    fixRms: (id) => window.rmsService.fixRms(id),
    randomTestRms: (id, r) => window.rmsService.randomTestRms(id, r),
    restoreOriginalRms: (id) => window.rmsService.restoreOriginalRms(id)
  };
})(window);
