/**
 * Universal Presentation Formatters (Utils Layer)
 * Centralized formatting for Currency, Numbers, Dates, Times, and Expirations.
 * Guarantees strict dot (.) thousands separators across all browsers and locales.
 */
(function(window) {
  'use strict';

  /**
   * Format number or money with dot (.) thousands separator
   * @param {number|string} val
   * @param {boolean} withSuffix - If true, appends " đ"
   * @returns {string} e.g. "50.000" or "50.000 đ"
   */
  function formatMoney(val, withSuffix = false) {
    if (val === null || val === undefined || isNaN(Number(val))) {
      return withSuffix ? '0 đ' : '0';
    }
    const num = Math.floor(Number(val));
    const isNegative = num < 0;
    const absStr = String(Math.abs(num)).replace(/\B(?=(\d{3})+(?!\d))/g, '.');
    const res = (isNegative ? '-' : '') + absStr;
    return withSuffix ? `${res} đ` : res;
  }

  /**
   * Format raw numbers with dot (.) thousands separator
   * @param {number|string} val
   * @returns {string} e.g. "1.250.000"
   */
  function formatNumber(val) {
    if (val === null || val === undefined || isNaN(Number(val))) return '0';
    const num = Math.floor(Number(val));
    const isNegative = num < 0;
    const absStr = String(Math.abs(num)).replace(/\B(?=(\d{3})+(?!\d))/g, '.');
    return (isNegative ? '-' : '') + absStr;
  }

  /**
   * Parse UTC date input and extract Vietnam Time (UTC+7, Asia/Ho_Chi_Minh) parts
   */
  function getVnParts(dateInput) {
    if (!dateInput) return null;
    let d;
    if (dateInput instanceof Date) {
      d = dateInput;
    } else if (typeof dateInput === 'number') {
      d = new Date(dateInput);
    } else {
      let str = String(dateInput).trim();
      if (!str) return null;
      str = str.replace(' ', 'T');
      if (!str.endsWith('Z') && !/[+-]\d{2}(:?\d{2})?$/.test(str)) {
        str += 'Z';
      }
      d = new Date(str);
    }
    if (isNaN(d.getTime())) return null;

    try {
      const formatter = new Intl.DateTimeFormat('en-GB', {
        timeZone: 'Asia/Ho_Chi_Minh',
        year: 'numeric',
        month: '2-digit',
        day: '2-digit',
        hour: '2-digit',
        minute: '2-digit',
        second: '2-digit',
        hour12: false
      });
      const parts = formatter.formatToParts(d);
      const map = {};
      for (const p of parts) {
        map[p.type] = p.value;
      }
      return map;
    } catch (e) {
      const utcMs = d.getTime();
      const vnDate = new Date(utcMs + 7 * 3600 * 1000);
      return {
        day: String(vnDate.getUTCDate()).padStart(2, '0'),
        month: String(vnDate.getUTCMonth() + 1).padStart(2, '0'),
        year: String(vnDate.getUTCFullYear()),
        hour: String(vnDate.getUTCHours()).padStart(2, '0'),
        minute: String(vnDate.getUTCMinutes()).padStart(2, '0'),
        second: String(vnDate.getUTCSeconds()).padStart(2, '0')
      };
    }
  }

  /**
   * Format a date into DD/MM/YYYY (Vietnam Time UTC+7)
   * @param {Date|string|number} dateInput
   * @returns {string} e.g. "16/10/2026"
   */
  function formatDate(dateInput) {
    const parts = getVnParts(dateInput);
    if (!parts) return '—';
    return `${parts.day}/${parts.month}/${parts.year}`;
  }

  /**
   * Format a date into HH:mm:ss (Vietnam Time UTC+7)
   * @param {Date|string|number} dateInput
   * @returns {string} e.g. "14:35:08"
   */
  function formatTime(dateInput) {
    const parts = getVnParts(dateInput);
    if (!parts) return '—';
    return `${parts.hour}:${parts.minute}:${parts.second}`;
  }

  /**
   * Format a date into HH:mm:ss DD/MM/YYYY (Vietnam Time UTC+7)
   * @param {Date|string|number} dateInput
   * @returns {string} e.g. "14:35:08 16/10/2026"
   */
  function formatDateTime(dateInput) {
    const parts = getVnParts(dateInput);
    if (!parts) return '—';
    return `${parts.hour}:${parts.minute}:${parts.second} ${parts.day}/${parts.month}/${parts.year}`;
  }

  /**
   * Format relative time (e.g. "vừa xong", "5 phút trước", "2 ngày trước")
   * @param {Date|string|number} dateInput
   * @returns {string}
   */
  function formatRelativeTime(dateInput) {
    if (!dateInput) return '—';
    const d = new Date(dateInput);
    if (isNaN(d.getTime())) return '—';
    const diffMs = Date.now() - d.getTime();
    const diffSec = Math.floor(diffMs / 1000);
    if (diffSec < 60) return 'Vừa xong';
    const diffMin = Math.floor(diffSec / 60);
    if (diffMin < 60) return `${diffMin} phút trước`;
    const diffHour = Math.floor(diffMin / 60);
    if (diffHour < 24) return `${diffHour} giờ trước`;
    const diffDay = Math.floor(diffHour / 24);
    if (diffDay < 30) return `${diffDay} ngày trước`;
    return formatDate(d);
  }

  /**
   * Format rental expiration or countdown
   * @param {Date|string|number} dateInput
   * @returns {{ text: string, isExpired: boolean, remainingDays: number }}
   */
  function formatExpiration(dateInput) {
    if (!dateInput) return { text: 'Chưa kích hoạt', isExpired: false, remainingDays: 0 };
    const d = new Date(dateInput);
    if (isNaN(d.getTime())) return { text: 'Không hợp lệ', isExpired: true, remainingDays: 0 };
    const diffMs = d.getTime() - Date.now();
    if (diffMs <= 0) {
      return { text: 'Đã hết hạn', isExpired: true, remainingDays: 0 };
    }
    const days = Math.ceil(diffMs / (24 * 60 * 60 * 1000));
    return {
      text: `Còn ${days} ngày (đến ${formatDate(d)})`,
      isExpired: false,
      remainingDays: days
    };
  }

  /**
   * Format voucher discount description
   * @param {Object} voucher
   * @returns {string} e.g. "20% (Tối đa 50.000 đ)" or "50.000 đ"
   */
  function formatVoucherDiscount(voucher) {
    if (!voucher) return '—';
    if (voucher.discountPercent > 0) {
      if (voucher.maxDiscountAmount > 0) {
        return `${voucher.discountPercent}% (Tối đa ${formatMoney(voucher.maxDiscountAmount, true)})`;
      }
      return `${voucher.discountPercent}%`;
    }
    if (voucher.discountAmount > 0) {
      return formatMoney(voucher.discountAmount, true);
    }
    return '0 đ';
  }

  const formatters = {
    formatMoney,
    formatNumber,
    formatDate,
    formatTime,
    formatDateTime,
    formatRelativeTime,
    formatExpiration,
    formatCountdown,
    formatVoucherDiscount
  };

  /**
   * Format real-time expiration countdown (days, hours, minutes, seconds)
   * @param {Date|string|number} dateInput
   * @param {number} currentNowMs - Optional current timestamp in ms (for real-time re-renders)
   * @returns {{ text: string, shortText: string, isExpired: boolean, isUrgent: boolean, isWarning: boolean, days: number, hours: number, minutes: number, seconds: number, diffMs: number }}
   */
  function formatCountdown(dateInput, currentNowMs = null) {
    if (!dateInput) return { text: 'Không thời hạn', shortText: 'Vĩnh viễn', isExpired: false, isUrgent: false, isWarning: false, days: 0, hours: 0, minutes: 0, seconds: 0, diffMs: 0 };
    const d = new Date(dateInput);
    if (isNaN(d.getTime())) return { text: 'Không hợp lệ', shortText: 'Lỗi hạn', isExpired: true, isUrgent: true, isWarning: false, days: 0, hours: 0, minutes: 0, seconds: 0, diffMs: 0 };
    
    const now = typeof currentNowMs === 'number' ? currentNowMs : Date.now();
    const diffMs = d.getTime() - now;
    
    if (diffMs <= 0) {
      return {
        text: 'Đã hết hạn',
        shortText: 'Hết hạn',
        compactText: 'Hết hạn',
        isExpired: true,
        isUrgent: true,
        isWarning: false,
        days: 0,
        hours: 0,
        minutes: 0,
        seconds: 0,
        diffMs: 0
      };
    }

    const totalSeconds = Math.floor(diffMs / 1000);
    const days = Math.floor(totalSeconds / 86400);
    const hours = Math.floor((totalSeconds % 86400) / 3600);
    const minutes = Math.floor((totalSeconds % 3600) / 60);
    const seconds = totalSeconds % 60;

    let text = '';
    let shortText = '';
    let compactText = '';

    if (days >= 1) {
      text = `Còn ${days} ngày ${hours}h ${minutes}p`;
      shortText = `${days}d ${hours}h ${minutes}p`;
      compactText = `${days}d ${hours}h`;
    } else if (hours >= 1) {
      text = `Còn ${hours}h ${minutes}p ${seconds}s`;
      shortText = `${hours}h ${minutes}p ${seconds}s`;
      compactText = `${hours}h ${minutes}m`;
    } else if (minutes >= 1) {
      text = `Còn ${minutes}p ${seconds}s`;
      shortText = `${minutes}p ${seconds}s`;
      compactText = `${minutes}m ${seconds}s`;
    } else {
      text = `Còn ${seconds}s`;
      shortText = `${seconds}s`;
      compactText = `${seconds}s`;
    }

    const isUrgent = diffMs < 24 * 3600 * 1000; // < 1 ngày
    const isWarning = !isUrgent && diffMs < 3 * 24 * 3600 * 1000; // < 3 ngày

    return {
      text,
      shortText,
      compactText,
      isExpired: false,
      isUrgent,
      isWarning,
      days,
      hours,
      minutes,
      seconds,
      diffMs
    };
  }

  // Expose both as namespace and root helpers on window
  window.formatters = formatters;
  window.formatMoney = formatMoney;
  window.formatNumber = formatNumber;
  window.formatDate = formatDate;
  window.formatTime = formatTime;
  window.formatDateTime = formatDateTime;
  window.formatRelativeTime = formatRelativeTime;
  window.formatExpiration = formatExpiration;
  window.formatCountdown = formatCountdown;
  window.formatVoucherDiscount = formatVoucherDiscount;

})(typeof window !== 'undefined' ? window : global);
