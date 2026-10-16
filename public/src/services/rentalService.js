/**
 * RentalService (Frontend - Service Layer)
 * Communicates with backend rental & auto-allocation endpoints.
 */
(function (window) {
  const http = () => window.httpClient;

  const rentalService = {
    getPlans() {
      return http().get('/api/rental/plans');
    },

    checkout(payload) {
      return http().post('/api/rental/checkout', payload);
    },

    renew(accountId, payload = {}) {
      return http().post(`/api/rental/renew/${encodeURIComponent(accountId)}`, payload);
    },

    // Admin APIs
    getAdminAllocations() {
      return http().get('/api/admin/rental-allocations');
    },

    updateAdminAllocations(rules) {
      return http().put('/api/admin/rental-allocations', rules);
    },

    createVoucher(voucher) {
      return http().post('/api/admin/vouchers', voucher);
    },

    updateVoucher(code, voucher) {
      return http().put(`/api/admin/vouchers/${encodeURIComponent(code)}`, voucher);
    },

    deleteVoucher(code) {
      return http().delete(`/api/admin/vouchers/${encodeURIComponent(code)}`);
    }
  };

  window.rentalService = rentalService;
})(window);
