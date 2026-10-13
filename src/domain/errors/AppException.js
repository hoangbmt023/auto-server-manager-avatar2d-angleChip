/**
 * AppException (Domain Layer - Core Exception)
 * Base application exception containing HTTP status code and standard error formatting.
 */
class AppException extends Error {
  constructor(message = 'Đã xảy ra lỗi!', statusCode = 500, errors = null) {
    super(message);
    this.name = this.constructor.name;
    this.statusCode = statusCode;
    this.errors = errors || null;
    Error.captureStackTrace(this, this.constructor);
  }
}

module.exports = AppException;
