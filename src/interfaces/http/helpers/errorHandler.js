const ErrorResponse = require('../../../application/dtos/common/ErrorResponse');
const { AppException } = require('../../../domain/errors');
const config = require('../../../../config');

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
  // 1. Lỗi đã được định nghĩa và bắt chủ động trong ứng dụng (AppException)
  if (err instanceof AppException || (err && err.statusCode && err.statusCode >= 400 && err.statusCode < 500)) {
    const statusCode = err.statusCode || 400;
    if (err.errors && typeof err.errors === 'object') {
      return sendJson(res, statusCode, ErrorResponse.validation(err.errors, err.message || 'Không hợp lệ'));
    }
    return sendJson(res, statusCode, ErrorResponse.message(err.message || 'Yêu cầu không hợp lệ!', err.data));
  }

  // 2. Lỗi nằm ngoài các trường hợp bắt (Uncaught Exception, Crash, DB error, Syntax/TypeError...) -> Trả về HTTP 500
  console.error('[Unhandled Internal Server Error 500]:', err);
  const isDev = config.app.isDev;
  const errorMsg = isDev
    ? `Lỗi hệ thống nội bộ: ${err.message || 'Đã xảy ra lỗi không xác định!'}`
    : 'Lỗi hệ thống nội bộ! Vui lòng thử lại sau.';

  return sendJson(res, 500, ErrorResponse.serverError(errorMsg));
}

module.exports = {
  sendErrorResponse
};
