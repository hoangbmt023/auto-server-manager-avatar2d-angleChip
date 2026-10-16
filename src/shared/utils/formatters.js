/**
 * Universal Presentation Formatters (Shared Domain/Application Layer)
 * Centralized formatting for Currency, Numbers, Dates, Times, and Expirations.
 * Guarantees strict dot (.) thousands separators across all Node.js environments.
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

function formatNumber(val) {
  if (val === null || val === undefined || isNaN(Number(val))) return '0';
  const num = Math.floor(Number(val));
  const isNegative = num < 0;
  const absStr = String(Math.abs(num)).replace(/\B(?=(\d{3})+(?!\d))/g, '.');
  return (isNegative ? '-' : '') + absStr;
}

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

function formatDate(dateInput) {
  const parts = getVnParts(dateInput);
  if (!parts) return '—';
  return `${parts.day}/${parts.month}/${parts.year}`;
}

function formatTime(dateInput) {
  const parts = getVnParts(dateInput);
  if (!parts) return '—';
  return `${parts.hour}:${parts.minute}:${parts.second}`;
}

function formatDateTime(dateInput) {
  const parts = getVnParts(dateInput);
  if (!parts) return '—';
  return `${parts.hour}:${parts.minute}:${parts.second} ${parts.day}/${parts.month}/${parts.year}`;
}

module.exports = {
  formatMoney,
  formatNumber,
  formatDate,
  formatTime,
  formatDateTime
};
