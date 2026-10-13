const Router = require('../Router');

/**
 * Authentication and User Management Routes
 */
module.exports = function createAuthRoutes(authController) {
  const router = new Router();

  router.post('/api/auth/register', (req, res, { sendJson, parseJsonBody }) => {
    return authController.register(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/auth/login', (req, res, { sendJson, parseJsonBody }) => {
    return authController.login(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/auth/refresh', (req, res, { sendJson, parseJsonBody }) => {
    return authController.refresh(req, res, sendJson, parseJsonBody);
  });

  router.get('/api/auth/me', (req, res, { sendJson }) => {
    return authController.me(req, res, sendJson);
  });

  router.get('/api/users', (req, res, { sendJson }) => {
    return authController.getUsers(req, res, sendJson);
  });

  return router;
};
