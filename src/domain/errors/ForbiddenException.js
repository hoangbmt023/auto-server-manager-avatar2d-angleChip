const AppException = require('./AppException');

/**
 * ForbiddenException (Domain Layer - Exception)
 * HTTP 403 - Không có quyền truy cập.
 */
class ForbiddenException extends AppException {
  constructor(message = 'Bạn không có quyền thực hiện hành động này!') {
    super(message, 403, 'FORBIDDEN');
  }
}

module.exports = ForbiddenException;
