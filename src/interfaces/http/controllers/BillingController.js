const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const { sendErrorResponse } = require('../helpers/errorHandler');

/**
 * BillingController (Interface Layer)
 * Handles combined transaction history, wallet topup, and voucher validation.
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
      const txs = await this.billingUseCase.getCombinedHistory(userId);
      return sendJson(res, 200, ApiResponse.success(txs, 'Lấy lịch sử giao dịch thành công!'));
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

  async checkVoucher(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const result = await this.billingUseCase.checkVoucher({
        code: body.code,
        orderAmount: body.orderAmount
      });

      return sendJson(res, 200, ApiResponse.success(result, 'Mã giảm giá hợp lệ!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }
}

module.exports = BillingController;
