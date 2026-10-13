const Router = require('../Router');

/**
 * Proxy Management Routes (RESTful Standard)
 */
module.exports = function createProxyRoutes(proxyController) {
  const router = new Router();

  // 1. Standard RESTful endpoints
  router.get('/api/proxies', (req, res, { sendJson }) => {
    return proxyController.getProxies(req, res, sendJson);
  });

  router.get('/api/proxies/:id', (req, res, { sendJson }) => {
    return proxyController.getProxy(req, res, sendJson);
  });

  router.post('/api/proxies', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.saveProxy(req, res, sendJson, parseJsonBody);
  });

  router.put('/api/proxies/:id', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.saveProxy(req, res, sendJson, parseJsonBody);
  });

  router.delete('/api/proxies/:id', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.deleteProxy(req, res, sendJson, parseJsonBody);
  });

  router.delete('/api/proxies', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.deleteProxy(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/proxies/:id/test', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.testProxy(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/proxies/test-all', (req, res, { sendJson }) => {
    return proxyController.testAllProxies(req, res, sendJson);
  });

  // 2. Backward-compatible aliases
  router.post('/api/proxies/delete', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.deleteProxy(req, res, sendJson, parseJsonBody);
  });

  router.delete('/api/proxies/delete', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.deleteProxy(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/proxies/test', (req, res, { sendJson, parseJsonBody }) => {
    return proxyController.testProxy(req, res, sendJson, parseJsonBody);
  });

  return router;
};
