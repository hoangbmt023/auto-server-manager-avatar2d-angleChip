const AppException = require('./AppException');

/**
 * InternalServerErrorException (Domain Layer - Exception)
 * HTTP 500 - Lỗi máy chủ hoặc xử lý nội bộ.
 */
class InternalServerErrorException extends AppException {
  constructor(message = 'Lỗi máy chủ nội bộ!') {
    super(message, 500, 'INTERNAL_SERVER_ERROR');
  }
}

module.exports = InternalServerErrorException;
