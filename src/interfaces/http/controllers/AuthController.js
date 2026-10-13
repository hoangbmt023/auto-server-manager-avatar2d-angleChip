const RegisterUserRequestDto = require('../../../application/dtos/auth/RegisterUserRequestDto');
const LoginUserRequestDto = require('../../../application/dtos/auth/LoginUserRequestDto');
const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const { UnauthorizedException } = require('../../../domain/errors');
const { sendErrorResponse } = require('../helpers/errorHandler');

/**
 * AuthController (Interface Layer)
 * Handles user registration, login, token refresh, and profile requests.
 * Automatically wraps responses with standard ApiResponse and maps Custom Exceptions.
 */
class AuthController {
  constructor(authService) {
    this.authService = authService;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
  }

  async register(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const dto = new RegisterUserRequestDto(body);
      const result = await this.authService.register(dto);

      return sendJson(res, 201, ApiResponse.success(result, 'Đăng ký tài khoản thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async login(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const dto = new LoginUserRequestDto(body);
      const result = await this.authService.login(dto);

      return sendJson(res, 200, ApiResponse.success(result, 'Đăng nhập thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async refresh(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const refreshToken = body?.refreshToken || '';
      const result = await this.authService.refresh(refreshToken);

      return sendJson(res, 200, ApiResponse.success(result, 'Làm mới token thành công!'));
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
