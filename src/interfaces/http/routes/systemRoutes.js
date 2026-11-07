const Router = require('../Router');
const { requireRole } = require('../middlewares/roleMiddleware');

/**
 * System & JRE Management Routes (Admin Only)
 */
module.exports = function createSystemRoutes(systemController) {
  const router = new Router();
  const adminOnly = requireRole('ADMIN');

  router.get('/api/config', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return systemController.getConfig(req, res, helpers.sendJson);
  });

  router.post('/api/config', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return systemController.saveConfig(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.put('/api/config', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return systemController.saveConfig(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/jre/install', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return systemController.installJre(req, res, helpers.sendJson);
  });

  router.get('/api/jre/progress', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return systemController.getJreProgress(req, res, helpers.sendJson);
  });

  return router;
};
