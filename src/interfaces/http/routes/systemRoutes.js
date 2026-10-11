const Router = require('../Router');

/**
 * System & JRE Management Routes
 */
module.exports = function createSystemRoutes(systemController) {
  const router = new Router();

  router.get('/api/config', (req, res, { sendJson }) => {
    return systemController.getConfig(req, res, sendJson);
  });

  router.post('/api/config', (req, res, { sendJson, parseJsonBody }) => {
    return systemController.saveConfig(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/jre/install', (req, res, { sendJson }) => {
    return systemController.installJre(req, res, sendJson);
  });

  router.get('/api/jre/progress', (req, res, { sendJson }) => {
    return systemController.getJreProgress(req, res, sendJson);
  });

  return router;
};
