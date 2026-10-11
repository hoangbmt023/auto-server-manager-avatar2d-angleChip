const Router = require('../Router');

/**
 * Bot Management Routes
 */
module.exports = function createBotRoutes(botController) {
  const router = new Router();

  router.get('/api/status', (req, res, { sendJson }) => {
    return botController.getStatus(req, res, sendJson);
  });

  router.post('/api/start', (req, res, { sendJson }) => {
    return botController.startAll(req, res, sendJson);
  });

  router.post('/api/stop', (req, res, { sendJson }) => {
    return botController.stopAll(req, res, sendJson);
  });

  router.post('/api/restart', (req, res, { sendJson }) => {
    return botController.restartAll(req, res, sendJson);
  });

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

  router.get('/api/logs', (req, res, { sendJson }) => {
    return botController.getLogs(req, res, sendJson);
  });

  router.post('/api/clear-logs', (req, res, { sendJson }) => {
    return botController.clearLogs(req, res, sendJson);
  });

  return router;
};
