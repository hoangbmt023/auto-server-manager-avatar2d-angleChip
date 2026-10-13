const crypto = require('crypto');
const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');

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
 * Production-grade dashboard access control.
 * Verifies system protection password via X-Dashboard-Auth or Authorization Bearer header.
 */
function createAuthMiddleware(settingRepo, sendJson) {
  return async function authMiddleware(req, res) {
    let password = '';
    if (settingRepo) {
      try {
        password = (await settingRepo.get('password')) || '';
      } catch (e) {}
    }

    // Không bật bảo vệ mật khẩu -> Cho phép truy cập tự do
    if (!password) {
      return true;
    }

    const authHeader = req.headers['x-dashboard-auth'] || req.headers['authorization'];
    if (authHeader) {
      const cleanToken = authHeader.replace(/^Bearer\s+/i, '').trim();
      if (safeCompare(cleanToken, password)) {
        return true;
      }
    }

    // Trả về lỗi 401 Unauthorized theo chuẩn ErrorResponse
    const errorBody = ErrorResponse.message('Yêu cầu mật khẩu truy cập Dashboard!');
    errorBody.requiresAuth = true;

    sendJson(res, 401, errorBody);
    return false;
  };
}

module.exports = createAuthMiddleware;
