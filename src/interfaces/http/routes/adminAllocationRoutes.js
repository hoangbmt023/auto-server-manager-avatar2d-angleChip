const Router = require('../Router');
const { requireRole } = require('../middlewares/roleMiddleware');

/**
 * Admin Allocation & Pricing Routes (Admin Only)
 */
module.exports = function createAdminAllocationRoutes(adminAllocationController) {
  const router = new Router();
  const adminOnly = requireRole('ADMIN');

  router.get('/api/admin/rental-allocations', async (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return adminAllocationController.getConfig(req, res, helpers.sendJson);
  });

  router.put('/api/admin/rental-allocations', async (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return adminAllocationController.updateRules(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/admin/vouchers', async (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return adminAllocationController.createVoucher(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.delete('/api/admin/vouchers/:code', async (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return adminAllocationController.deleteVoucher(req, res, helpers.sendJson);
  });

  return router;
};
