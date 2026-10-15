const Router = require('../Router');

/**
 * Billing Routes (Application Interfaces)
 */
module.exports = function createBillingRoutes(billingController) {
  const router = new Router();

  router.get('/api/billing/balance', (req, res, { sendJson }) => {
    return billingController.getBalance(req, res, sendJson);
  });

  router.get('/api/billing/transactions', (req, res, { sendJson }) => {
    return billingController.getTransactions(req, res, sendJson);
  });

  router.post('/api/billing/topup', (req, res, { sendJson, parseJsonBody }) => {
    return billingController.topup(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/billing/check-voucher', (req, res, { sendJson, parseJsonBody }) => {
    return billingController.checkVoucher(req, res, sendJson, parseJsonBody);
  });

  return router;
};
