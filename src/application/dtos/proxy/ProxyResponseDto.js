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
    this.externalId = proxy.externalId || null;
    this.provider = proxy.provider || 'PROXY_VN';
    this.proxyCategory = proxy.proxyCategory || 'DatacenterA';
    this.tier = proxy.tier || 'DYNAMIC';
    this.status = proxy.status || 'ACTIVE';
    this.maxSlots = proxy.maxSlots || 6;
    this.expiresAt = proxy.expiresAt ? (proxy.expiresAt instanceof Date ? proxy.expiresAt.toISOString() : proxy.expiresAt) : null;
    this.remainingDays = typeof proxy.getRemainingDays === 'function' ? Math.round(proxy.getRemainingDays() * 10) / 10 : null;
    this.isActive = proxy.isActive;
    this.isExpired = proxy.isExpired;
    this.lastChecked = proxy.lastChecked ? DateTimeUtil.formatIso(proxy.lastChecked) : null;
    this.lastRotatedAt = proxy.lastRotatedAt ? DateTimeUtil.formatIso(proxy.lastRotatedAt) : null;
    this.latencyMs = proxy.latencyMs;
    this.failCount = proxy.failCount;
    this.errorReason = proxy.errorReason || null;
  }
}

module.exports = ProxyResponseDto;
