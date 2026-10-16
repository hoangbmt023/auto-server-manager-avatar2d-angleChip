const ApiResponse = require('../../../application/dtos/common/ApiResponse');
const { sendErrorResponse } = require('../helpers/errorHandler');

/**
 * AdminAllocationController (Interface Layer)
 * Handles Admin configuration for bot plans, resource distribution policies, and vouchers.
 */
class AdminAllocationController {
  constructor(manageAllocationUseCase) {
    this.manageAllocationUseCase = manageAllocationUseCase;
  }

  _sendError(res, sendJson, err) {
    return sendErrorResponse(res, sendJson, err);
  }

  async getConfig(req, res, sendJson) {
    try {
      const data = await this.manageAllocationUseCase.getAllocationConfig();
      return sendJson(res, 200, ApiResponse.success(data, 'Lấy cấu hình phân bổ thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async updateRules(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const data = await this.manageAllocationUseCase.updateAllocationRules(body);
      return sendJson(res, 200, ApiResponse.success(data, 'Cập nhật cấu hình phân bổ thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async createVoucher(req, res, sendJson, parseJsonBody) {
    try {
      const body = await parseJsonBody(req);
      const data = await this.manageAllocationUseCase.createVoucher(body);
      return sendJson(res, 201, ApiResponse.success(data, 'Tạo mã voucher thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async updateVoucher(req, res, sendJson, parseJsonBody) {
    try {
      const code = req.params?.code;
      const body = await parseJsonBody(req);
      const data = await this.manageAllocationUseCase.updateVoucher(code, body);
      return sendJson(res, 200, ApiResponse.success(data ? (data.toPublicJson ? data.toPublicJson() : data) : null, 'Cập nhật mã voucher thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }

  async deleteVoucher(req, res, sendJson) {
    try {
      const code = req.params?.code;
      await this.manageAllocationUseCase.deleteVoucher(code);
      return sendJson(res, 200, ApiResponse.success(null, 'Xóa mã voucher thành công!'));
    } catch (err) {
      return this._sendError(res, sendJson, err);
    }
  }
}

module.exports = AdminAllocationController;
