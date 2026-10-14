/**
 * RmsService (Frontend - Service Layer)
 * Handles MicroEmulator RMS binary storage auditing, diagnostics, and repairs.
 */
(function (window) {
  const http = () => window.httpClient;

  const rmsService = {
    inspectRms(accountId) {
      return http().get(`/api/accounts/inspect-rms?id=${encodeURIComponent(accountId)}`);
    },

    auditRms(accountId) {
      return http().get(`/api/accounts/audit-rms?id=${encodeURIComponent(accountId)}`);
    },

    fixRms(accountId) {
      return http().post('/api/accounts/fix-rms', { id: accountId });
    },

    randomTestRms(accountId, rounds = 5) {
      return http().post('/api/accounts/random-test-rms', { id: accountId, rounds });
    },

    restoreOriginalRms(accountId) {
      return http().post('/api/accounts/restore-original-rms', { id: accountId });
    }
  };

  window.rmsService = rmsService;
})(window);
