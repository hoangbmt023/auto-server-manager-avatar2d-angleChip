const crypto = require('crypto');
const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');
const { defaultJwtService } = require('../../../infrastructure/security/JwtService');

/**
 * Timing-safe string comparison to prevent Timing Attacks
 * @param {string} a
 * @param {string} b
 * @returns {boolean}
 */
function safeCompare(a, b) {
  if (typeof a !== 'string' || typeof b !== 'string') return false;
  const bufA = Buffer.from(a, 'utf8');
  const bufB = Buffer.from(b, 'utf8');
  if (bufA.length !== bufB.length) return false;
  return crypto.timingSafeEqual(bufA, bufB);
}

/**
 * Auth Middleware (Interface Layer)
 * Supports both JWT Bearer Authentication and legacy Dashboard Password.
 * Sets req.user when a valid JWT token is presented.
 */
function createAuthMiddleware(settingRepo, sendJson, userRepo = null) {
  return async function authMiddleware(req, res) {
    const authHeader = req.headers['authorization'] || req.headers['x-dashboard-auth'];

    if (authHeader) {
      const token = authHeader.replace(/^Bearer\s+/i, '').trim();

      // 1. Try JWT Bearer Token validation
      try {
        const decoded = defaultJwtService.verifyAccessToken(token);

        // Security check: Verify user is not BANNED or INACTIVE
        if (userRepo && decoded.sub) {
          const user = await userRepo.findById(decoded.sub);
          if (!user || user.status === 'BANNED') {
            sendJson(res, 403, ErrorResponse.message('Tài khoản của bạn đã bị khóa bởi quản trị viên!'));
            return false;
          }
          if (user.status === 'INACTIVE') {
            sendJson(res, 403, ErrorResponse.message('Tài khoản chưa được kích hoạt!'));
            return false;
          }
        }

        req.user = decoded;
        return true;
      } catch (jwtErr) {
        // If token format is clearly a JWT (3 dot-separated base64 chunks), reject with 401
        if (token.split('.').length === 3) {
          sendJson(res, 401, ErrorResponse.message(jwtErr.message));
          return false;
        }
      }


      // 2. Fallback to system password check (Timing-safe)
      let password = '';
      if (settingRepo) {
        try {
          password = (await settingRepo.get('password')) || '';
        } catch (e) {}
      }
      if (password && safeCompare(token, password)) {
        return true;
      }
    }

    // 3. If password protection is configured in system settings
    let password = '';
    if (settingRepo) {
      try {
        password = (await settingRepo.get('password')) || '';
      } catch (e) {}
    }

    // If no password protection configured in system, allow guest access
    if (!password) {
      return true;
    }

    // 4. Return 401 Unauthorized
    const errorBody = ErrorResponse.message('Vui lòng đăng nhập để tiếp tục!');
    errorBody.requiresAuth = true;

    sendJson(res, 401, errorBody);
    return false;
  };
}

module.exports = createAuthMiddleware;
