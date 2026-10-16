/**
 * BillingService (Frontend - Service Layer)
 * Manages balance queries, combined transaction history, topup, payOS orders, and voucher validation.
 */
(function (window) {
  const http = () => window.httpClient;

  const billingService = {
    getBalance() {
      return http().get('/api/billing/balance');
    },

    getTransactions(params = {}) {
      const searchParams = new URLSearchParams();
      if (params.page) searchParams.set('page', params.page);
      if (params.limit) searchParams.set('limit', params.limit);
      if (params.type && params.type !== 'ALL') searchParams.set('type', params.type);
      const qs = searchParams.toString();
      return http().get(`/api/billing/transactions${qs ? '?' + qs : ''}`);
    },

    getPolicy() {
      return http().get('/api/billing/policy');
    },

    topup(payload) {
      return http().post('/api/billing/topup', payload);
    },

    createPayOsOrder(amount) {
      return http().post('/api/billing/payos-order', { amount });
    },

    verifyPayOsOrder(orderCode) {
      return http().get(`/api/billing/payos-order/${encodeURIComponent(orderCode)}/verify`);
    },

    cancelPayOsOrder(orderCode) {
      return http().post(`/api/billing/payos-order/${encodeURIComponent(orderCode)}/cancel`);
    },

    checkVoucher(code, orderAmount = 0) {
      return http().post('/api/billing/check-voucher', { code, orderAmount });
    }
  };

  window.billingService = billingService;
})(window);
