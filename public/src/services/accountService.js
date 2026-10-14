/**
 * AccountService (Frontend - Service Layer)
 * Manages game account data, configurations, and bot triggers.
 */
(function (window) {
  const http = () => window.httpClient;

  const accountService = {
    getAccounts() {
      return http().get('/api/accounts');
    },

    saveAccount(payload) {
      if (payload && payload.id) {
        return http().put(`/api/accounts/${encodeURIComponent(payload.id)}`, payload);
      }
      return http().post('/api/accounts', payload);
    },

    deleteAccount(id) {
      return http().delete(`/api/accounts/${encodeURIComponent(id)}`);
    },

    switchAccountServer(id, newServerId) {
      return http().post(`/api/accounts/${encodeURIComponent(id)}/switch-server`, { newServerId });
    },

    updateAccountSetup(id, payload = {}) {
      return http().put(`/api/accounts/${encodeURIComponent(id)}/setup`, payload);
    },

    resetAccountData(id) {
      return http().post(`/api/accounts/${encodeURIComponent(id)}/reset-data`, {});
    },

    startAccount(id) {
      return http().post(`/api/accounts/${encodeURIComponent(id)}/start`, {});
    },

    stopAccount(id) {
      return http().post(`/api/accounts/${encodeURIComponent(id)}/stop`, {});
    },

    triggerAuto(id, autoType = 'farm', action = 'start') {
      return http().post(`/api/accounts/${encodeURIComponent(id)}/auto`, { autoType, action });
    }
  };

  window.accountService = accountService;
})(window);
