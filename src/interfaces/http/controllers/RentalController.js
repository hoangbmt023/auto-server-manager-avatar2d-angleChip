const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const { sendErrorResponse } = require('../helpers/errorHandler');
const { UnauthorizedException } = require('../../../domain/errors');

/**
 * RentalController (Interface Layer)
 * Handles bot slot rental checkout, pricing discovery, renewals,
 * slot cancellation with wallet refund, and game account switching/detaching.
 */
class RentalController {
  constructor(rentSlotUseCase, allocationEngine, cancelSlotUseCase = null) {
    this.rentSlotUseCase = rentSlotUseCase;
    this.allocationEngine = allocationEngine;
    this.cancelSlotUseCase = cancelSlotUseCase;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
  }

  async getPlans(req, res, sendJson) {
    try {
      const rules = await this.allocationEngine.getAllocationRules();
      return sendJson(res, 200, ApiResponse.success({
        plans: rules.plans,
        durationDiscounts: rules.durationDiscounts,
        cancellationFeePercent: rules.cancellationFeePercent !== undefined ? rules.cancellationFeePercent : 10,
        minHoldHours: rules.minHoldHours !== undefined ? rules.minHoldHours : 1
      }, 'Lấy danh sách gói thuê thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async checkout(req, res, sendJson, parseJsonBody) {
    try {
      const userId = req.user?.sub;
      if (!userId) {
        throw new UnauthorizedException('Vui lòng đăng nhập để thuê nick bot!');
      }

      const body = await parseJsonBody(req);
      const result = await this.rentSlotUseCase.execute({
        userId,
        username: body.username,
        password: body.password,
        plan: body.plan,
        durationMonths: body.durationMonths,
        voucherCode: body.voucherCode,
        note: body.note
      });

      return sendJson(res, 201, ApiResponse.success(result, 'Thuê tài khoản bot thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async renew(req, res, sendJson, parseJsonBody) {
    try {
      const userId = req.user?.sub;
      if (!userId) {
        throw new UnauthorizedException('Vui lòng đăng nhập để gia hạn nick bot!');
      }

      const body = await parseJsonBody(req);
      const accountId = req.params?.id || body.accountId;

      const userRole = req.user?.role || 'USER';
      const result = await this.rentSlotUseCase.renewSlot({
        userId,
        userRole,
        accountId,
        durationMonths: body.durationMonths,
        voucherCode: body.voucherCode,
        newPlan: body.plan || body.newPlan
      });

      return sendJson(res, 200, ApiResponse.success(result, 'Gia hạn bot thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async cancelSlot(req, res, sendJson) {
    try {
      const userId = req.user?.sub;
      const userRole = req.user?.role || 'USER';
      if (!userId) {
        throw new UnauthorizedException('Vui lòng đăng nhập để thực hiện thao tác!');
      }

      const slotId = req.params?.id;
      if (!this.cancelSlotUseCase) {
        throw new Error('CancelSlotUseCase chưa được khởi tạo!');
      }

      const result = await this.cancelSlotUseCase.execute(slotId, userId, userRole);
      return sendJson(res, 200, ApiResponse.success(result, result.message));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }
}

module.exports = RentalController;
