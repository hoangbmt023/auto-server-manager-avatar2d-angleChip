const Router = require('../Router');

/**
 * Proxy Management Routes
 */
module.exports = function createProxyRoutes(proxyController) {
  const router = new Router();

  router.get('/api/proxies', (req, res, { sendJson }) => {
    return proxyController.getProxies(req, res, sendJson);
  });

  router.post('/api/proxies', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.saveProxy(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/proxies/delete', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.deleteProxy(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/proxies/test', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.testProxy(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/proxies/test-all', (req, res, { sendJson }) => {
    return proxyController.testAllProxies(req, res, sendJson);
  });

  return router;
};
