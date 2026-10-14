/**
 * SystemService (Frontend - Service Layer)
 * Handles system settings, logs, and configuration state.
 */
(function (window) {
  const http = () => window.httpClient;

  const systemService = {
    getConfig() {
      return http().get('/api/config');
    },

    saveConfig(payload) {
      return http().put('/api/config', payload);
    },

    getLogs() {
      return http().get('/api/logs');
    },

    clearLogs() {
      return http().post('/api/clear-logs', {});
    }
  };

  window.systemService = systemService;
})(window);
