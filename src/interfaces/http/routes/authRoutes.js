const Router = require('../Router');

/**
 * Authentication and User Management Routes
 */
module.exports = function createAuthRoutes(authController) {
  const router = new Router();

  router.post('/api/auth/register', (req, res, { sendJson, parseJsonBody }) => {
    return authController.register(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/auth/send-otp', (req, res, { sendJson, parseJsonBody }) => {
    return authController.sendOtp(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/auth/activate', (req, res, { sendJson, parseJsonBody }) => {
    return authController.activate(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/auth/login', (req, res, { sendJson, parseJsonBody }) => {
    return authController.login(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/auth/refresh', (req, res, { sendJson, parseJsonBody }) => {
    return authController.refresh(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/auth/logout', (req, res, { sendJson }) => {
    return authController.logout(req, res, sendJson);
  });

  router.post('/api/auth/forgot-password', (req, res, { sendJson, parseJsonBody }) => {
    return authController.forgotPassword(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/auth/verify-forgot-password', (req, res, { sendJson, parseJsonBody }) => {
    return authController.verifyForgotPassword(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/auth/reset-password', (req, res, { sendJson, parseJsonBody }) => {
    return authController.resetPassword(req, res, sendJson, parseJsonBody);
  });

  router.get('/api/auth/me', (req, res, { sendJson }) => {
    return authController.me(req, res, sendJson);
  });

  router.get('/api/users', (req, res, { sendJson }) => {
    return authController.getUsers(req, res, sendJson);
  });

  return router;
};
