const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');

/**
 * Role-Based Access Control (RBAC) Middleware (Interface Layer)
 * Restricts route access to specific roles ('ADMIN', 'USER').
 *
 * @param {string|string[]} roles - Allowed role(s)
 * @returns {Function} Middleware handler
 */
function requireRole(roles) {
  const allowed = (Array.isArray(roles) ? roles : [roles]).map(r => String(r).toUpperCase());

  return function roleMiddleware(req, res, { sendJson }) {
    if (!req.user || !req.user.role) {
      sendJson(res, 401, ErrorResponse.message('Vui lòng đăng nhập để tiếp tục!'));
      return false;
    }

    const userRole = String(req.user.role).toUpperCase();
    if (!allowed.includes(userRole)) {
      sendJson(res, 403, ErrorResponse.message('Bạn không có quyền truy cập tài nguyên này (Yêu cầu quyền Quản trị viên)!'));
      return false;
    }

    return true;
  };
}

/**
 * Authenticated Only Middleware
 */
function requireAuth(req, res, { sendJson }) {
  if (!req.user || !req.user.sub) {
    sendJson(res, 401, ErrorResponse.message('Vui lòng đăng nhập để tiếp tục!'));
    return false;
  }
  return true;
}

module.exports = {
  requireRole,
  requireAuth
};
