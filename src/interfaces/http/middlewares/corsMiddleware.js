const config = require('../../../../config');

/**
 * CORS Middleware (Interface Layer)
 * Production-ready Cross-Origin Resource Sharing handler.
 * Dynamically whitelists origins based on CORS_ALLOWED_ORIGINS via config.
 */
function corsMiddleware(req, res) {
  const allowedOrigins = config.cors.allowedOrigins || ['*'];
  const requestOrigin = req.headers.origin;

  let isAllowed = false;
  let originToSet = '';
  let allowCredentials = false;

  if (!requestOrigin) {
    // Same-origin request (direct browser navigation, curl, server-to-server)
    isAllowed = true;
  } else if (allowedOrigins.includes(requestOrigin)) {
    isAllowed = true;
    originToSet = requestOrigin;
    allowCredentials = true;
  } else if (
    // Allow local development addresses automatically
    /^https?:\/\/(localhost|127\.0\.0\.1)(:[0-9]+)?$/.test(requestOrigin)
  ) {
    isAllowed = true;
    originToSet = requestOrigin;
    allowCredentials = true;
  } else if (allowedOrigins.includes('*')) {
    isAllowed = true;
    originToSet = '*';
    allowCredentials = false; // Wildcard cannot be used with credentials
  }

  if (isAllowed && originToSet) {
    res.setHeader('Access-Control-Allow-Origin', originToSet);
    if (allowCredentials) {
      res.setHeader('Access-Control-Allow-Credentials', 'true');
    }
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
