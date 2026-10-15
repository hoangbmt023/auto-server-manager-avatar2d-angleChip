const Router = require('../Router');
const { requireRole } = require('../middlewares/roleMiddleware');

/**
 * Proxy Management Routes (RESTful Standard - Admin Only)
 */
module.exports = function createProxyRoutes(proxyController) {
  const router = new Router();
  const adminOnly = requireRole('ADMIN');

  // 1. Standard RESTful endpoints
  router.get('/api/proxies', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.getProxies(req, res, helpers.sendJson);
  });

  router.get('/api/proxies/:id', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.getProxy(req, res, helpers.sendJson);
  });

  router.post('/api/proxies', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.saveProxy(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.put('/api/proxies/:id', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.saveProxy(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.delete('/api/proxies/:id', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.deleteProxy(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.delete('/api/proxies', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.deleteProxy(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/proxies/:id/test', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.testProxy(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/proxies/test-all', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.testAllProxies(req, res, helpers.sendJson);
  });

  // 2. Backward-compatible aliases
  router.post('/api/proxies/delete', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.deleteProxy(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.delete('/api/proxies/delete', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.deleteProxy(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/proxies/test', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return proxyController.testProxy(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  return router;
};
