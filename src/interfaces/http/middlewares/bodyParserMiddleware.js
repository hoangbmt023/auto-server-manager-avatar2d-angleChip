const { BadRequestException } = require('../../../domain/errors');
const config = require('../../../../config');

/**
 * Sanitizes object keys to prevent Prototype Pollution attacks
 * @param {any} obj
 * @returns {any}
 */
function sanitizeObject(obj) {
  if (!obj || typeof obj !== 'object') return obj;

  if (Array.isArray(obj)) {
    return obj.map(sanitizeObject);
  }

  const clean = Object.create(null);
  for (const [key, value] of Object.entries(obj)) {
    if (key === '__proto__' || key === 'constructor' || key === 'prototype') {
      continue; // Strip dangerous prototype pollution keys
    }
    clean[key] = sanitizeObject(value);
  }
  return clean;
}

/**
 * JSON Body Parser Middleware (Interface Layer)
 * Production-ready request stream aggregator & secure JSON parser.
 * Features:
 * - Configurable payload size limit (Anti-DoS)
 * - Prototype Pollution defense
 * - Throws BadRequestException for automatic 400 error response
 */
function parseJsonBody(req, customMaxSizeBytes = null) {
  const maxMb = config.security.maxPayloadSizeMb;
  const maxSizeBytes = customMaxSizeBytes || (maxMb * 1024 * 1024);

  return new Promise((resolve, reject) => {
    let body = '';
    let size = 0;

    req.on('data', chunk => {
      size += chunk.length;
      if (size > maxSizeBytes) {
        req.destroy(new BadRequestException(`Dung lượng gửi lên quá lớn (Tối đa ${envMb}MB)!`));
        return;
      }
      body += chunk.toString('utf8');
    });

    req.on('end', () => {
      if (!body.trim()) return resolve({});
      try {
        const parsed = JSON.parse(body);
        resolve(sanitizeObject(parsed));
      } catch (e) {
        reject(new BadRequestException('JSON Payload không hợp lệ: ' + e.message));
      }
    });

    req.on('error', err => {
      if (err instanceof BadRequestException) {
        reject(err);
      } else {
        reject(new BadRequestException('Lỗi đọc luồng dữ liệu: ' + err.message));
      }
    });
  });
}

module.exports = {
  parseJsonBody
};
