/**
 * BillingService (Frontend - Service Layer)
 * Manages balance queries, combined transaction history, topup, and voucher validation.
 */
(function (window) {
  const http = () => window.httpClient;

  const billingService = {
    getBalance() {
      return http().get('/api/billing/balance');
    },

    getTransactions() {
      return http().get('/api/billing/transactions');
    },

    topup(payload) {
      return http().post('/api/billing/topup', payload);
    },

    checkVoucher(code, orderAmount = 0) {
      return http().post('/api/billing/check-voucher', { code, orderAmount });
    }
  };

  window.billingService = billingService;
})(window);
