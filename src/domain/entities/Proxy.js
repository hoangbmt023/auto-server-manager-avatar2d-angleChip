const { BadRequestException } = require('../errors');
const { uuidv7 } = require('../../shared/utils/uuid');
const { DateTimeUtil } = require('../../shared/utils/dateTime');

/**
 * Proxy Entity (Domain Layer)
 * Represents a Network Proxy instance with validation and status rules.
 * Enums stored in SQL as UPPERCASE ('SOCKS5', 'HTTP'), response to client as lowercase.
 */
class Proxy {
  constructor({
    id,
    externalId = null,
    provider = 'PROXY_VN',
    proxyCategory = 'DatacenterA',
    name,
    host,
    port,
    username = '',
    password = '',
    type = 'SOCKS5',
    tier = 'DYNAMIC',
    status = 'ACTIVE',
    maxSlots = 6,
    expiresAt = null,
    isActive = true,
    isExpired = false,
    lastChecked = null,
    lastRotatedAt = null,
    latencyMs = null,
    failCount = 0
  }) {
    this.id = id || uuidv7();
    this.externalId = externalId || null;
    this.provider = String(provider || 'PROXY_VN').toUpperCase() === 'MANUAL' ? 'MANUAL' : 'PROXY_VN';
    this.proxyCategory = proxyCategory || 'DatacenterA';
    this.name = (name || '').trim() || `${host}:${port}`;
    this.host = (host || '').trim();
    this.port = parseInt(port, 10);
    this.username = (username || '').trim();
    this.password = (password || '').trim();
    this.type = String(type || 'SOCKS5').toUpperCase() === 'HTTP' ? 'HTTP' : 'SOCKS5';
    this.tier = String(tier || 'DYNAMIC').toUpperCase() === 'CORE' ? 'CORE' : 'DYNAMIC';
    
    // Status: ACTIVE | DRAINING | EXPIRED
    const sUpper = String(status || 'ACTIVE').toUpperCase();
    this.status = ['ACTIVE', 'DRAINING', 'EXPIRED'].includes(sUpper) ? sUpper : 'ACTIVE';
    
    this.maxSlots = Math.max(6, parseInt(maxSlots || 6, 10));
    this.expiresAt = expiresAt ? new Date(expiresAt) : null;
    this.isActive = Boolean(isActive && this.status !== 'EXPIRED');
    this.isExpired = Boolean(isExpired || this.status === 'EXPIRED');
    this.lastChecked = lastChecked || null;
    this.lastRotatedAt = lastRotatedAt ? new Date(lastRotatedAt) : null;
    this.latencyMs = latencyMs !== null ? parseInt(latencyMs, 10) : null;
    this.failCount = parseInt(failCount || 0, 10);
  }

  validate() {
    if (!this.host) {
      throw new BadRequestException('Địa chỉ IP / Host của Proxy không được để trống!');
    }
    if (isNaN(this.port) || this.port < 1 || this.port > 65535) {
      throw new BadRequestException(`Cổng Port [${this.port}] không hợp lệ (1-65535)!`);
    }
  }

  isDraining() {
    return this.status === 'DRAINING';
  }

  isExpiredOrDying(withinHours = 2) {
    if (this.status === 'EXPIRED' || this.isExpired) return true;
    if (!this.expiresAt) return false;
    return this.expiresAt.getTime() <= Date.now() + withinHours * 3600 * 1000;
  }

  getRemainingDays() {
    if (!this.expiresAt) return 999;
    return Math.max(0, (this.expiresAt.getTime() - Date.now()) / (1000 * 3600 * 24));
  }

  markActive(latencyMs = null) {
    this.isActive = true;
    this.isExpired = false;
    this.status = 'ACTIVE';
    this.failCount = 0;
    this.latencyMs = latencyMs;
    this.lastChecked = DateTimeUtil.formatIso();
  }

  markFailed(force = false, errorReason = null) {
    this.failCount += 1;
    this.lastChecked = DateTimeUtil.formatIso();
    if (errorReason) {
      this.errorReason = errorReason;
    }
    if (force || this.failCount >= 3) {
      this.isExpired = true;
      this.isActive = false;
      this.status = 'EXPIRED';
      this.latencyMs = null;
    }
  }

  markDraining() {
    this.status = 'DRAINING';
  }

  setRotated() {
    this.lastRotatedAt = new Date();
  }

  isRotationCoolingDown(cooldownMinutes = 10) {
    if (!this.lastRotatedAt) return false;
    const diffMs = Date.now() - new Date(this.lastRotatedAt).getTime();
    return diffMs < cooldownMinutes * 60 * 1000;
  }

  toPersistenceJson() {
    return {
      id: this.id,
      externalId: this.externalId,
      provider: this.provider,
      proxyCategory: this.proxyCategory,
      name: this.name,
      host: this.host,
      port: this.port,
      username: this.username,
      password: this.password,
      type: this.type, // UPPERCASE for SQL
      tier: this.tier,
      status: this.status,
      maxSlots: this.maxSlots,
      expiresAt: this.expiresAt,
      isActive: this.isActive,
      isExpired: this.isExpired,
      lastChecked: this.lastChecked ? new Date(this.lastChecked) : null,
      lastRotatedAt: this.lastRotatedAt ? new Date(this.lastRotatedAt) : null,
      latencyMs: this.latencyMs,
      failCount: this.failCount
    };
  }

  toJSON() {
    return {
      id: this.id,
      externalId: this.externalId,
      provider: this.provider,
      proxyCategory: this.proxyCategory,
      name: this.name,
      host: this.host,
      port: this.port,
      username: this.username,
      password: this.password,
      type: this.type.toLowerCase(), // lowercase for client response
      tier: this.tier,
      status: this.status,
      maxSlots: this.maxSlots,
      expiresAt: this.expiresAt ? this.expiresAt.toISOString() : null,
      remainingDays: Math.round(this.getRemainingDays() * 10) / 10,
      isActive: this.isActive,
      isExpired: this.isExpired,
      lastChecked: this.lastChecked,
      lastRotatedAt: this.lastRotatedAt ? this.lastRotatedAt.toISOString() : null,
      latencyMs: this.latencyMs,
      failCount: this.failCount
    };
  }
}

module.exports = Proxy;
