const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const { sendErrorResponse } = require('../helpers/errorHandler');

/**
 * RentalController (Interface Layer)
 * Handles bot slot rental checkout, pricing discovery, and renewals.
 */
class RentalController {
  constructor(rentSlotUseCase, allocationEngine) {
    this.rentSlotUseCase = rentSlotUseCase;
    this.allocationEngine = allocationEngine;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
  }

  async getPlans(req, res, sendJson) {
    try {
      const rules = await this.allocationEngine.getAllocationRules();
      return sendJson(res, 200, ApiResponse.success({
        plans: rules.plans,
        durationDiscounts: rules.durationDiscounts
      }, 'Lấy danh sách gói thuê thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async checkout(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const userId = req.user?.sub;
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
      const body = await parseJsonBody(req);
      const userId = req.user?.sub;
      const accountId = req.params?.id || body.accountId;

      const result = await this.rentSlotUseCase.renewSlot({
        userId,
        accountId,
        durationMonths: body.durationMonths,
        voucherCode: body.voucherCode
      });

      return sendJson(res, 200, ApiResponse.success(result, 'Gia hạn bot thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }
}

module.exports = RentalController;
