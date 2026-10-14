const config = require('../../../../config');

/**
 * Cookie Helper for native Node.js HTTP Server
 */
const cookieHelper = {
  /**
   * Parses the Cookie header from an incoming HTTP request
   * @param {import('http').IncomingMessage} req
   * @returns {Record<string, string>}
   */
  parseCookies(req) {
    const list = {};
    const cookieHeader = req.headers && req.headers.cookie;

    if (!cookieHeader) return list;

    cookieHeader.split(';').forEach(cookie => {
      const parts = cookie.split('=');
      const name = parts.shift().trim();
      if (!name) return;
      const value = decodeURIComponent(parts.join('=').trim());
      list[name] = value;
    });

    return list;
  },

  /**
   * Appends a Set-Cookie header to the outgoing HTTP response
   * @param {import('http').ServerResponse} res
   * @param {string} name
   * @param {string} value
   * @param {object} [options]
   */
  setCookie(res, name, value, options = {}) {
    const isProd = config.app.isProd;
    const rememberDays = (config.security && config.security.cookieRememberDays) || 7;
    const defaults = {
      httpOnly: true,
      secure: isProd,
      sameSite: 'Lax',
      path: '/',
      maxAge: rememberDays * 24 * 60 * 60 // Configured days in seconds
    };

    const opts = { ...defaults, ...options };
    let cookieStr = `${encodeURIComponent(name)}=${encodeURIComponent(value)}`;

    if (opts.path) cookieStr += `; Path=${opts.path}`;
    if (opts.maxAge !== undefined && opts.maxAge !== null) cookieStr += `; Max-Age=${opts.maxAge}`;
    if (opts.expires) cookieStr += `; Expires=${opts.expires.toUTCString()}`;
    if (opts.domain) cookieStr += `; Domain=${opts.domain}`;
    if (opts.sameSite) cookieStr += `; SameSite=${opts.sameSite}`;
    if (opts.secure) cookieStr += `; Secure`;
    if (opts.httpOnly) cookieStr += `; HttpOnly`;

    // Append to existing Set-Cookie header if present
    const existing = res.getHeader('Set-Cookie');
    if (!existing) {
      res.setHeader('Set-Cookie', cookieStr);
    } else if (Array.isArray(existing)) {
      res.setHeader('Set-Cookie', [...existing, cookieStr]);
    } else {
      res.setHeader('Set-Cookie', [existing, cookieStr]);
    }
  },

  /**
   * Clears a cookie by expiring it immediately
   * @param {import('http').ServerResponse} res
   * @param {string} name
   * @param {object} [options]
   */
  clearCookie(res, name, options = {}) {
    this.setCookie(res, name, '', {
      ...options,
      maxAge: 0,
      expires: new Date(0)
    });
  }
};

module.exports = cookieHelper;
