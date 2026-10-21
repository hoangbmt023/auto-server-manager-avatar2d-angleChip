const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const { sendErrorResponse } = require('../helpers/errorHandler');
const { TooManyRequestsException, UnauthorizedException } = require('../../../domain/errors');
const { defaultRateLimiter } = require('../../../infrastructure/security/RateLimiter');

/**
 * BillingController (Interface Layer)
 * Handles combined transaction history, wallet topup, payOS integration, and voucher validation.
 */
class BillingController {
  constructor(billingUseCase, userRepo) {
    this.billingUseCase = billingUseCase;
    this.userRepo = userRepo;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
  }

  async getBalance(req, res, sendJson) {
    try {
      const userId = req.user?.sub;
      if (!userId) {
        throw new UnauthorizedException('Vui lòng đăng nhập để xem số dư!');
      }
      const user = await this.userRepo.findById(userId);
      return sendJson(res, 200, ApiResponse.success({
        balance: user?.balance || 0
      }, 'Lấy số dư thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async getTransactions(req, res, sendJson) {
    try {
      const userId = req.user?.sub;
      if (!userId) {
        throw new UnauthorizedException('Vui lòng đăng nhập để xem lịch sử giao dịch!');
      }
      const query = req.query || {};
      const page = Math.max(1, parseInt(query.page || '1', 10));
      const limit = Math.max(1, Math.min(100, parseInt(query.limit || '15', 10)));
      const type = (query.type || 'ALL').toUpperCase();

      const result = await this.billingUseCase.getCombinedHistory(userId, { page, limit, type });
      return sendJson(res, 200, ApiResponse.success(result, 'Lấy lịch sử giao dịch thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async getPolicy(req, res, sendJson) {
    try {
      const policy = await this.billingUseCase.getTopupPolicy();
      return sendJson(res, 200, ApiResponse.success(policy, 'Lấy chính sách nạp tiền thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async topup(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const userId = req.user?.sub;
      const result = await this.billingUseCase.topupBalance({
        userId,
        amount: body.amount,
        method: body.method,
        description: body.description
      });

      return sendJson(res, 200, ApiResponse.success(result, 'Nạp tiền vào tài khoản thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async createPayOsOrder(req, res, sendJson, parseJsonBody) {
    try {
      const userId = req.user?.sub;
      if (!userId) {
        throw new UnauthorizedException('Vui lòng đăng nhập để tạo đơn nạp tiền!');
      }

      const rateKey = `create-order:${userId}`;
      const rateResult = defaultRateLimiter.consume(rateKey, 6, 60000); // 6 lần/phút
      if (!rateResult.isAllowed) {
        throw new TooManyRequestsException(`Bạn thao tác tạo đơn quá nhanh! Vui lòng thử lại sau ${rateResult.retryAfterSeconds} giây.`);
      }

      const body = await parseJsonBody(req);
      const result = await this.billingUseCase.createPayOsOrder({
        userId,
        amount: body.amount
      });
      return sendJson(res, 200, ApiResponse.success(result, 'Tạo mã thanh toán payOS thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async verifyPayOsOrder(req, res, sendJson, params) {
    try {
      const userId = req.user?.sub;
      if (!userId) {
        throw new UnauthorizedException('Vui lòng đăng nhập!');
      }

      const rateKey = `verify-order:${userId}`;
      const rateResult = defaultRateLimiter.consume(rateKey, 20, 60000); // 20 lần/phút
      if (!rateResult.isAllowed) {
        throw new TooManyRequestsException(`Bạn thao tác kiểm tra đơn quá nhanh! Vui lòng thử lại sau ${rateResult.retryAfterSeconds} giây.`);
      }

      const orderCode = params?.orderCode;
      const result = await this.billingUseCase.verifyAndCompletePayOsOrder({
        orderCode,
        userId
      });
      return sendJson(res, 200, ApiResponse.success(result, 'Kiểm tra trạng thái đơn payOS thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async cancelPayOsOrder(req, res, sendJson, params) {
    try {
      const userId = req.user?.sub;
      if (!userId) {
        throw new UnauthorizedException('Vui lòng đăng nhập!');
      }

      const orderCode = params?.orderCode;
      const result = await this.billingUseCase.cancelPayOsOrder({
        orderCode,
        userId
      });
      return sendJson(res, 200, ApiResponse.success(result, 'Hủy đơn hàng thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async handlePayOsWebhook(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const result = await this.billingUseCase.handlePayOsWebhook(body);
      return sendJson(res, 200, result);
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async checkVoucher(req, res, sendJson, parseJsonBody) {
    try {
      const userId = req.user?.sub;
      if (!userId) {
        throw new UnauthorizedException('Vui lòng đăng nhập để kiểm tra mã giảm giá!');
      }

      const rateKey = `check-voucher:${userId}`;
      const rateResult = defaultRateLimiter.consume(rateKey, 10, 60000); // 10 lần/phút
      if (!rateResult.isAllowed) {
        throw new TooManyRequestsException(`Bạn thử mã giảm giá quá nhiều lần! Vui lòng thử lại sau ${rateResult.retryAfterSeconds} giây.`);
      }

      const body = await parseJsonBody(req);
      const result = await this.billingUseCase.checkVoucher({
        code: body.code,
        orderAmount: body.orderAmount,
        userId
      });
      return sendJson(res, 200, ApiResponse.success(result, 'Áp dụng mã giảm giá thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async adminAdjustBalance(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const result = await this.billingUseCase.adminAdjustBalance({
        adminUserId: req.user?.sub,
        targetUserId: body.userId,
        amount: body.amount,
        reason: body.reason
      });
      return sendJson(res, 200, ApiResponse.success(result, 'Điều chỉnh số dư thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async updateTopupSettings(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const result = await this.billingUseCase.updateTopupSettings(body);
      return sendJson(res, 200, ApiResponse.success(result, 'Cập nhật cấu hình nạp tiền thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }
}

module.exports = BillingController;
