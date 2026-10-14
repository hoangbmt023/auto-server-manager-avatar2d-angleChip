const AppException = require('./AppException');

/**
 * TooManyRequestsException (Domain Layer - Error)
 * HTTP 429 - Raised when rate limits, cooldowns, or abuse quotas are exceeded.
 */
class TooManyRequestsException extends AppException {
  constructor(message = 'Quá nhiều yêu cầu được gửi! Vui lòng thử lại sau.') {
    super(message, 429);
  }
}

module.exports = TooManyRequestsException;
