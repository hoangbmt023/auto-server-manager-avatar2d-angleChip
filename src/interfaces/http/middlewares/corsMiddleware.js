const config = require('../../../config');

/**
 * CORS Middleware (Interface Layer)
 * Production-ready Cross-Origin Resource Sharing handler.
 * Dynamically whitelists origins based on CORS_ALLOWED_ORIGINS via config.
 */
function corsMiddleware(req, res) {
  const allowedOrigins = config.cors.allowedOrigins;
  const requestOrigin = req.headers.origin;

  let isAllowed = false;
  let originToSet = '';

  if (allowedOrigins.includes('*')) {
    isAllowed = true;
    originToSet = requestOrigin || '*';
  } else if (requestOrigin && allowedOrigins.includes(requestOrigin)) {
    isAllowed = true;
    originToSet = requestOrigin;
  } else if (!requestOrigin) {
    // Same-origin request (direct browser navigation, curl, server-to-server)
    isAllowed = true;
  }

  if (isAllowed && originToSet) {
    res.setHeader('Access-Control-Allow-Origin', originToSet);
    res.setHeader('Access-Control-Allow-Credentials', 'true');
    res.setHeader('Vary', 'Origin');
  }

  res.setHeader('Access-Control-Allow-Headers', 'Content-Type, Authorization, X-Dashboard-Auth, x-filename');
  res.setHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS');
  res.setHeader('Access-Control-Max-Age', '86400'); // Cache preflight response for 24h

  // Handle CORS Preflight request
  if (req.method === 'OPTIONS') {
    if (!isAllowed) {
      res.writeHead(403, { 'Content-Type': 'application/json; charset=utf-8' });
      res.end(JSON.stringify({ success: false, message: 'CORS policy: Origin này không được phép truy cập!' }));
      return true;
    }
    res.writeHead(204);
    res.end();
    return true; // Preflight handled
  }

  return false;
}

module.exports = corsMiddleware;
