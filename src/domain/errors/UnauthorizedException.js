const AppException = require('./AppException');

/**
 * UnauthorizedException (Domain Layer - Exception)
 * HTTP 401 - Sai mật khẩu, chưa đăng nhập, hoặc token không hợp lệ.
 */
class UnauthorizedException extends AppException {
  constructor(message = 'Chưa xác thực hoặc thông tin đăng nhập không chính xác!') {
    super(message, 401, 'UNAUTHORIZED');
  }
}

module.exports = UnauthorizedException;
