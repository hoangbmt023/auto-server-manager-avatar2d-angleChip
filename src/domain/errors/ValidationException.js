const AppException = require('./AppException');

/**
 * ValidationException (Domain / Application Layer - Exception)
 * HTTP 400 - Chặn ngay tầng đầu tiên (DTO / Controller) khi dữ liệu yêu cầu không hợp lệ.
 * Mang mã lỗi cụ thể (errorCode) phản ánh chính xác trường dữ liệu bị vi phạm.
 */
class ValidationException extends AppException {
  constructor(errorsOrMessage = 'Không hợp lệ', message = 'Không hợp lệ') {
    if (typeof errorsOrMessage === 'object' && errorsOrMessage !== null) {
      super(message, 400);
      this.errors = errorsOrMessage;
    } else {
      super(errorsOrMessage, 400);
      this.errors = null;
    }
  }
}

module.exports = ValidationException;
