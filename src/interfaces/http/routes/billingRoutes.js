const Router = require('../Router');
const { requireRole } = require('../middlewares/roleMiddleware');

/**
 * Billing Routes (Application Interfaces)
 */
module.exports = function createBillingRoutes(billingController) {
  const router = new Router();
  const adminOnly = requireRole('ADMIN');

  router.get('/api/billing/balance', (req, res, { sendJson }) => {
    return billingController.getBalance(req, res, sendJson);
  });

  router.get('/api/billing/policy', (req, res, { sendJson }) => {
    return billingController.getPolicy(req, res, sendJson);
  });

  router.get('/api/billing/transactions', (req, res, { sendJson }) => {
    return billingController.getTransactions(req, res, sendJson);
  });

  // Admin-only direct balance topup (prevents unauthenticated/user self-credit)
  router.post('/api/billing/topup', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return billingController.topup(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/billing/payos-order', (req, res, { sendJson, parseJsonBody }) => {
    return billingController.createPayOsOrder(req, res, sendJson, parseJsonBody);
  });

  router.get('/api/billing/payos-order/:orderCode/verify', (req, res, { sendJson }) => {
    return billingController.verifyPayOsOrder(req, res, sendJson, req.params);
  });

  router.post('/api/billing/payos-order/:orderCode/cancel', (req, res, { sendJson }) => {
    return billingController.cancelPayOsOrder(req, res, sendJson, req.params);
  });

  // Public Webhook for payOS Server callback
  router.post('/api/billing/payos-webhook', (req, res, { sendJson, parseJsonBody }) => {
    return billingController.handlePayOsWebhook(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/billing/check-voucher', (req, res, { sendJson, parseJsonBody }) => {
    return billingController.checkVoucher(req, res, sendJson, parseJsonBody);
  });

  // Admin endpoints: adjust balance & update topup presets/policy
  router.post('/api/billing/admin/adjust-balance', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return billingController.adminAdjustBalance(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.put('/api/billing/admin/topup-settings', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return billingController.updateTopupSettings(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  return router;
};
