/**
 * ProxyService (Frontend - Service Layer)
 * Manages HTTP/SOCKS5 proxy lists and connection latency testing.
 */
(function (window) {
  const http = () => window.httpClient;

  const proxyService = {
    getProxies() {
      return http().get('/api/proxies');
    },

    saveProxy(payload) {
      if (payload && payload.id) {
        return http().put(`/api/proxies/${encodeURIComponent(payload.id)}`, payload);
      }
      return http().post('/api/proxies', payload);
    },

    deleteProxy(id) {
      return http().delete(`/api/proxies/${encodeURIComponent(id)}`);
    },

    testProxy(id) {
      return http().post(`/api/proxies/${encodeURIComponent(id)}/test`, {});
    },

    testAllProxies() {
      return http().post('/api/proxies/test-all', {});
    }
  };

  window.proxyService = proxyService;
})(window);
