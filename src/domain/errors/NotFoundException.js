const AppException = require('./AppException');

/**
 * NotFoundException (Domain Layer - Exception)
 * HTTP 404 - Tài nguyên không tồn tại.
 */
class NotFoundException extends AppException {
  constructor(message = 'Không tìm thấy dữ liệu yêu cầu!') {
    super(message, 404, null);
  }
}

module.exports = NotFoundException;
