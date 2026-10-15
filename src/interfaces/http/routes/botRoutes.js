const Router = require('../Router');
const { requireRole } = require('../middlewares/roleMiddleware');

/**
 * Bot Management Routes (RBAC Protected)
 */
module.exports = function createBotRoutes(botController) {
  const router = new Router();
  const adminOnly = requireRole('ADMIN');

  router.get('/api/status', (req, res, { sendJson }) => {
    return botController.getStatus(req, res, sendJson);
  });

  router.post('/api/start', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return botController.startAll(req, res, helpers.sendJson);
  });

  router.post('/api/stop', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return botController.stopAll(req, res, helpers.sendJson);
  });

  router.post('/api/restart', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return botController.restartAll(req, res, helpers.sendJson);
  });

  // RESTful Account Execution Routes (User & Admin with ownership check)
  router.post('/api/accounts/:id/start', (req, res, { sendJson, parseJsonBody }) => {
    return botController.startAccount(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/accounts/:id/stop', (req, res, { sendJson, parseJsonBody }) => {
    return botController.stopAccount(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/accounts/:id/auto', (req, res, { sendJson, parseJsonBody }) => {
    return botController.triggerAuto(req, res, sendJson, parseJsonBody);
  });

  // Legacy Bot Action Routes
  router.post('/api/bot/start-account', (req, res, { sendJson, parseJsonBody }) => {
    return botController.startAccount(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/accounts/switch', (req, res, { sendJson, parseJsonBody }) => {
    return botController.startAccount(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/bot/stop-account', (req, res, { sendJson, parseJsonBody }) => {
    return botController.stopAccount(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/bot/auto', (req, res, { sendJson, parseJsonBody }) => {
    return botController.triggerAuto(req, res, sendJson, parseJsonBody);
  });

  router.get('/api/logs', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return botController.getLogs(req, res, helpers.sendJson);
  });

  router.post('/api/clear-logs', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return botController.clearLogs(req, res, helpers.sendJson);
  });

  return router;
};
