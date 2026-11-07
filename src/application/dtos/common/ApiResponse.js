/**
 * ApiResponse (Shared DTO - Standard Response Envelope)
 * JavaScript equivalent of Java ApiResponse<T>
 */
class ApiResponse {
  constructor({
    success = true,
    message = 'Success',
    data = null,
    pagination = null,
    errors = null
  } = {}) {
    this.success = Boolean(success);
    this.message = message || (success ? 'Success' : 'Không hợp lệ');
    if (this.success) {
      this.data = data !== undefined ? data : null;
      if (pagination) this.pagination = pagination;
    } else {
      this.errors = errors || null;
    }
  }

  /**
   * Static factory: Success with data
   * @param {any} data
   * @param {string} [message]
   */
  static success(data, message = 'Success') {
    if (typeof data === 'string' && arguments.length === 1) {
      return new ApiResponse({
        success: true,
        message: data,
        data: null
      });
    }
    return new ApiResponse({
      success: true,
      message,
      data
    });
  }

  /**
   * Static factory: Paginated success
   * @param {object} pageResponse - { data: [], currentPage, pageSize, totalElements, totalPages, last }
   * @param {string} [message]
   */
  static paginatedSuccess(pageResponse, message = 'Success') {
    const meta = {
      currentPage: pageResponse.currentPage || 1,
      pageSize: pageResponse.pageSize || (pageResponse.data ? pageResponse.data.length : 0),
      totalElements: pageResponse.totalElements || (pageResponse.data ? pageResponse.data.length : 0),
      totalPages: pageResponse.totalPages || 1,
      last: Boolean(pageResponse.last !== undefined ? pageResponse.last : true)
    };

    return new ApiResponse({
      success: true,
      message,
      data: pageResponse.data || [],
      pagination: meta
    });
  }

  /**
   * Static factory: Failure / Error (errors luôn là null)
   * @param {string} message
   */
  static fail(message = 'Đã xảy ra lỗi!') {
    return new ApiResponse({
      success: false,
      message,
      data: null,
      pagination: null,
      errors: null
    });
  }

  /**
   * Alias cho fail()
   * @param {string} message
   */
  static error(message = 'Đã xảy ra lỗi!') {
    return ApiResponse.fail(message);
  }
}

module.exports = ApiResponse;
