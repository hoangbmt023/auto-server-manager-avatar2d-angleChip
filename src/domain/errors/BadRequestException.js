const AppException = require('./AppException');

/**
 * BadRequestException (Domain Layer - Exception)
 * HTTP 400 - Dữ liệu yêu cầu không hợp lệ hoặc vi phạm ràng buộc nghiệp vụ.
 */
class BadRequestException extends AppException {
  constructor(message = 'Dữ liệu không hợp lệ!', errors = null) {
    super(message, 400, errors);
  }
}

module.exports = BadRequestException;
