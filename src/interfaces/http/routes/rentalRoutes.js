const Router = require('../Router');

/**
 * Rental Routes (Application Interfaces)
 */
module.exports = function createRentalRoutes(rentalController) {
  const router = new Router();

  router.get('/api/rental/plans', (req, res, { sendJson }) => {
    return rentalController.getPlans(req, res, sendJson);
  });

  router.post('/api/rental/checkout', (req, res, { sendJson, parseJsonBody }) => {
    return rentalController.checkout(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/rental/renew/:id', (req, res, { sendJson, parseJsonBody }) => {
    return rentalController.renew(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/rental/renew', (req, res, { sendJson, parseJsonBody }) => {
    return rentalController.renew(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/rental/cancel/:id', (req, res, { sendJson }) => {
    return rentalController.cancelSlot(req, res, sendJson);
  });

  return router;
};
