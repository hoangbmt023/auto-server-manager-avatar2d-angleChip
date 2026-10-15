const Router = require('../Router');

/**
 * Account Management Routes (RESTful Standard)
 */
module.exports = function createAccountRoutes(accountController) {
  const router = new Router();

  // 1. Standard RESTful routes
  router.get('/api/accounts', (req, res, { sendJson }) => {
    return accountController.getAccounts(req, res, sendJson);
  });

  router.post('/api/accounts', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.saveAccount(req, res, sendJson, parseJsonBody);
  });

  router.put('/api/accounts/:id', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.saveAccount(req, res, sendJson, parseJsonBody);
  });

  router.delete('/api/accounts/:id', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.deleteAccount(req, res, sendJson, parseJsonBody);
  });

  router.delete('/api/accounts', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.deleteAccount(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/accounts/:id/switch-server', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.switchServer(req, res, sendJson, parseJsonBody);
  });

  router.put('/api/accounts/:id/setup', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.updateSetup(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/accounts/:id/reset', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.resetData(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/accounts/:id/reset-data', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.resetData(req, res, sendJson, parseJsonBody);
  });

  // 2. Backward-compatible aliases
  router.post('/api/accounts/delete', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.deleteAccount(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/accounts/switch-server', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.switchServer(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/accounts/setup', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.updateSetup(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/accounts/reset-data', (req, res, { sendJson, parseJsonBody }) => {
    return accountController.resetData(req, res, sendJson, parseJsonBody);
  });

  // 3. RMS Diagnostic endpoints (Admin Only)
  const { requireRole } = require('../middlewares/roleMiddleware');
  const adminOnly = requireRole('ADMIN');

  router.get('/api/accounts/inspect-rms', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return accountController.inspectRms(req, res, helpers.sendJson);
  });

  router.get('/api/accounts/audit-rms', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return accountController.auditRms(req, res, helpers.sendJson);
  });

  router.post('/api/accounts/fix-rms', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return accountController.fixRms(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/accounts/random-test-rms', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return accountController.randomTestRms(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/accounts/restore-original-rms', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return accountController.restoreOriginalRms(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  return router;
};
