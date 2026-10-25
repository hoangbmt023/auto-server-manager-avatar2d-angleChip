const RegisterUserRequestDto = require('../../../application/dtos/auth/RegisterUserRequestDto');
const LoginUserRequestDto = require('../../../application/dtos/auth/LoginUserRequestDto');
const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const { UnauthorizedException, TooManyRequestsException } = require('../../../domain/errors');
const { sendErrorResponse } = require('../helpers/errorHandler');
const cookieHelper = require('../helpers/cookieHelper');
const { defaultRateLimiter } = require('../../../infrastructure/security/RateLimiter');

/**
 * AuthController (Interface Layer)
 * Handles user registration, activation, login, token refresh via HttpOnly cookies,
 * password recovery, and profile queries.
 */
class AuthController {
  constructor(authService) {
    this.authService = authService;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
  }

  _getClientIp(req) {
    return req.headers['x-forwarded-for']?.split(',')[0]?.trim() || req.socket?.remoteAddress || 'unknown';
  }

  async register(req, res, sendJson, parseJsonBody) {
    try {
      const clientIp = this._getClientIp(req);
      const rateLimit = defaultRateLimiter.consume(`register:${clientIp}`, 5, 60000); // 5 lần/phút/IP
      if (!rateLimit.isAllowed) {
        throw new TooManyRequestsException(`Bạn thao tác quá nhanh! Vui lòng thử lại sau ${rateLimit.retryAfterSeconds} giây.`);
      }

      const body = await parseJsonBody(req);
      const dto = new RegisterUserRequestDto(body);
      const result = await this.authService.register(dto);

      return sendJson(res, 201, ApiResponse.success(result, result.message || 'Đăng ký tài khoản thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async sendOtp(req, res, sendJson, parseJsonBody) {
    try {
      const clientIp = this._getClientIp(req);
      const rateLimit = defaultRateLimiter.consume(`send-otp:${clientIp}`, 5, 60000); // 5 lần/phút/IP
      if (!rateLimit.isAllowed) {
        throw new TooManyRequestsException(`Bạn gửi yêu cầu nhận mã OTP quá nhanh! Vui lòng thử lại sau ${rateLimit.retryAfterSeconds} giây.`);
      }

      const body = await parseJsonBody(req);
      const result = await this.authService.sendOtp(body);

      return sendJson(res, 200, ApiResponse.success(result, result.message || 'Gửi mã OTP thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async activate(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const result = await this.authService.activateAccount(body);

      // Set HttpOnly refresh token cookie
      if (result.refreshToken) {
        cookieHelper.setCookie(res, 'refreshToken', result.refreshToken);
      }

      return sendJson(res, 200, ApiResponse.success({
        user: result.user,
        accessToken: result.accessToken
      }, result.message || 'Kích hoạt tài khoản thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async login(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const dto = new LoginUserRequestDto(body);
      const result = await this.authService.login(dto);

      // Set HttpOnly refresh token cookie (Persistent vs Session cookie based on remember checkbox)
      if (result.refreshToken) {
        const config = require('../../../../config');
        const rememberDays = (config.security && config.security.cookieRememberDays) || 7;
        const cookieOpts = dto.remember ? { maxAge: rememberDays * 24 * 60 * 60 } : { maxAge: null };
        cookieHelper.setCookie(res, 'refreshToken', result.refreshToken, cookieOpts);
      }

      return sendJson(res, 200, ApiResponse.success({
        user: result.user,
        accessToken: result.accessToken
      }, 'Đăng nhập thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async refresh(req, res, sendJson, parseJsonBody) {
    try {
      const cookies = cookieHelper.parseCookies(req);
      let refreshToken = cookies.refreshToken;

      // Fallback to body refreshToken if cookie not sent (e.g. non-browser API clients)
      if (!refreshToken) {
        const body = await parseJsonBody(req).catch(() => ({}));
        refreshToken = body?.refreshToken || '';
      }

      const result = await this.authService.refresh(refreshToken);

      // Token rotation: Set newly issued refresh token in HttpOnly cookie
      if (result.refreshToken) {
        cookieHelper.setCookie(res, 'refreshToken', result.refreshToken);
      }

      return sendJson(res, 200, ApiResponse.success(result, 'Làm mới token thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async logout(req, res, sendJson) {
    try {
      const cookies = cookieHelper.parseCookies(req);
      if (cookies.refreshToken) {
        await this.authService.logout(cookies.refreshToken);
      }
      cookieHelper.clearCookie(res, 'refreshToken');
      return sendJson(res, 200, ApiResponse.success(null, 'Đăng xuất thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }


  async forgotPassword(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const result = await this.authService.forgotPassword(body);

      return sendJson(res, 200, ApiResponse.success(result, result.message || 'Mã xác thực đã được gửi!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async verifyForgotPassword(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const result = await this.authService.verifyForgotPassword(body);

      return sendJson(res, 200, ApiResponse.success(result, result.message || 'Mã xác thực OTP hợp lệ!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async resetPassword(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const result = await this.authService.resetPassword(body);

      return sendJson(res, 200, ApiResponse.success(result, result.message || 'Đặt lại mật khẩu thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async me(req, res, sendJson) {
    try {
      if (!req.user || !req.user.sub) {
        throw new UnauthorizedException('Bạn chưa đăng nhập!');
      }
      const user = await this.authService.getUserById(req.user.sub);
      return sendJson(res, 200, ApiResponse.success(user, 'Lấy thông tin người dùng thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async getUsers(req, res, sendJson) {
    try {
      const users = await this.authService.getAllUsers();
      return sendJson(res, 200, ApiResponse.success(users, 'Lấy danh sách người dùng thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }
}

module.exports = AuthController;
