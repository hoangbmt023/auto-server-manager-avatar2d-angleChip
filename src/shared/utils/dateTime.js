const dayjs = require('dayjs');
const utc = require('dayjs/plugin/utc');

dayjs.extend(utc);

/**
 * DateTime Utility (Shared Layer)
 * Standardizes Universal Coordinated Time (UTC / GMT+0) across Database & API Responses.
 */
class DateTimeUtil {
  /**
   * Get current UTC dayjs object
   */
  static now() {
    return dayjs.utc();
  }

  /**
   * Format date to UTC string (YYYY-MM-DD HH:mm:ss)
   * Suitable for MySQL DATETIME columns in UTC.
   */
  static formatDb(date = null) {
    const d = date ? dayjs.utc(date) : dayjs.utc();
    return d.format('YYYY-MM-DD HH:mm:ss');
  }

  /**
   * Format date to ISO-8601 string in UTC (ending with 'Z').
   * Suitable for API Response DTOs.
   * Example: "2026-10-12T05:55:10.000Z"
   */
  static formatIso(date = null) {
    if (!date) return null;
    return dayjs.utc(date).toISOString();
  }

  /**
   * Parse any input date to Date object in UTC
   */
  static toDate(date = null) {
    const d = date ? dayjs.utc(date) : dayjs.utc();
    return d.toDate();
  }
}

module.exports = {
  dayjs,
  DateTimeUtil
};
