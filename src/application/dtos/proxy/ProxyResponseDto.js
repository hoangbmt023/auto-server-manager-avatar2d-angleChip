const { DateTimeUtil } = require('../../../shared/utils/dateTime');

/**
 * ProxyResponseDto (Application Layer - DTO)
 * Hides raw password of proxy or masks it.
 * Enums are returned in lowercase. Timestamps are formatted in Universal Coordinated Time (UTC / GMT+0).
 */
class ProxyResponseDto {
  constructor(proxy) {
    this.id = proxy.id;
    this.name = proxy.name;
    this.host = proxy.host;
    this.port = proxy.port;
    this.username = proxy.username;
    this.password = proxy.password ? '******' : '';
    this.type = String(proxy.type || 'socks5').toLowerCase(); // lowercase for response
    this.isActive = proxy.isActive;
    this.isExpired = proxy.isExpired;
    this.lastChecked = proxy.lastChecked ? DateTimeUtil.formatIso(proxy.lastChecked) : null;
    this.latencyMs = proxy.latencyMs;
    this.failCount = proxy.failCount;
  }
}

module.exports = ProxyResponseDto;
