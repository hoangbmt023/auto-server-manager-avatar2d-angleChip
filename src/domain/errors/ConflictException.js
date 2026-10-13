const AppException = require('./AppException');

/**
 * ConflictException (Domain Layer - Exception)
 * HTTP 409 - Dữ liệu bị trùng lặp (Email/Phone đã tồn tại, tài nguyên đang bị xung đột).
 */
class ConflictException extends AppException {
  constructor(message = 'Dữ liệu đã tồn tại hoặc xảy ra xung đột!') {
    super(message, 409, 'CONFLICT');
  }
}

module.exports = ConflictException;
