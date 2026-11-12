const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');
const { AppException } = require('../../../domain/errors');
const config = require('../../../../config');
const fs = require('fs');
const path = require('path');

const errorLogDir = path.resolve(process.cwd(), 'logs');
const errorLogPath = path.join(errorLogDir, 'http-errors.log');

function writeHttpErrorLog(err) {
  try {
    fs.mkdirSync(errorLogDir, { recursive: true });
    const timestamp = new Date().toISOString();
    const stack = err && err.stack ? err.stack : (err && err.message ? err.message : String(err));
    let causeInfo = '';
    if (err && err.cause) {
      const c = err.cause;
      const meta = [c.code, c.errno, c.sqlState].filter(Boolean).join(' / ');
      causeInfo = `\nCaused by: ${meta ? `[${meta}] ` : ''}${c.stack || c.message || String(c)}`;
    }
    fs.appendFileSync(errorLogPath, `\n[${timestamp}] HTTP 500\n${stack}${causeInfo}\n${'='.repeat(80)}\n`, 'utf8');
  } catch (logErr) {
    console.error('[ErrorFileLogger] Cannot write logs/http-errors.log:', logErr.message);
  }
}

/**
 * Standard HTTP Error Response Handler (Spring Boot ExceptionHandler pattern)
 * Centralizes error formatting across all interface controllers.
 * 
 * - AppException / Domain Validation -> Client Status Code (400, 401, 403, 404, 409) + ErrorResponse.validation / message
 * - Unexpected / Unhandled Error      -> HTTP 500 + ErrorResponse.serverError
 * 
 * @param {object} res - HTTP response object
 * @param {function} sendJson - Helper to serialize JSON and end stream
 * @param {Error} err - Error caught in try/catch
 */
function sendErrorResponse(res, sendJson, err) {
  // 1. Lỗi đã được định nghĩa và bắt chủ động trong ứng dụng (AppException hoặc thông báo nghiệp vụ)
  const isAppEx = err instanceof AppException || (err && err.statusCode && err.statusCode >= 400 && err.statusCode < 500);
  const isOperationalError = err && typeof err.message === 'string' && (
    err.message.startsWith('❌') ||
    err.message.includes('[SECURITY BLOCK]') ||
    err.message.includes('GIỚI HẠN') ||
    err.message.includes('Không tìm thấy')
  );

  if (isAppEx || isOperationalError) {
    const statusCode = err.statusCode || (err.message && err.message.includes('Không tìm thấy') ? 404 : 400);
    if (err.errors && typeof err.errors === 'object') {
      return sendJson(res, statusCode, ErrorResponse.validation(err.errors, err.message || 'Không hợp lệ'));
    }
    return sendJson(res, statusCode, ErrorResponse.message(err.message || 'Yêu cầu không hợp lệ!', err.data));
  }

  // 2. Lỗi nằm ngoài các trường hợp bắt (Uncaught Exception, Crash, DB error, Syntax/TypeError...) -> Trả về HTTP 500
  console.error('[Unhandled Internal Server Error 500]:', err);
  writeHttpErrorLog(err);
  const isDev = config.app.isDev;
  const errorMsg = isDev
    ? `Lỗi hệ thống nội bộ: ${err.message || 'Đã xảy ra lỗi không xác định!'}`
    : 'Lỗi hệ thống nội bộ! Vui lòng thử lại sau.';

  return sendJson(res, 500, ErrorResponse.serverError(errorMsg));
}

module.exports = {
  sendErrorResponse
};
