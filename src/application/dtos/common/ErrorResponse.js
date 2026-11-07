/**
 * ErrorResponse (Common DTO)
 * JavaScript equivalent of Java record ErrorResponse(boolean success, String message, Map<String, String> errors)
 * Used for standard API error responses and input validation errors.
 */
class ErrorResponse {
  constructor({ success = false, message = 'Không hợp lệ', errors = null } = {}) {
    this.success = Boolean(success);
    this.message = message || 'Không hợp lệ';
    this.errors = errors || null;
  }

  /**
   * General error message with errors = null
   * Java: public static ErrorResponse message(String msg)
   * @param {string} msg
   */
  static message(msg, data = null) {
    const res = {
      success: false,
      message: msg || 'Đã xảy ra lỗi!',
      errors: null
    };
    if (data) res.data = data;
    return res;
  }

  /**
   * Field-level validation error with errors = { fieldName: errorMessage }
   * Java: public static ErrorResponse validation(Map<String, String> errors)
   * @param {Record<string, string>} errors
   * @param {string} [msg]
   */
  static validation(errors, msg = 'Không hợp lệ') {
    return {
      success: false,
      message: msg,
      errors: errors && typeof errors === 'object' ? errors : null
    };
  }

  /**
   * System / Internal Server Error with errors = null (HTTP 500)
   * Java: public static ErrorResponse serverError(String msg)
   * @param {string} [msg]
   */
  static serverError(msg = 'Lỗi hệ thống nội bộ!') {
    return {
      success: false,
      message: msg || 'Lỗi hệ thống nội bộ!',
      errors: null
    };
  }
}

module.exports = ErrorResponse;
