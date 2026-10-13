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
    name,
    host,
    port,
    username = '',
    password = '',
    type = 'SOCKS5',
    isActive = true,
    isExpired = false,
    lastChecked = null,
    latencyMs = null,
    failCount = 0
  }) {
    this.id = id || uuidv7();
    this.name = (name || '').trim() || `${host}:${port}`;
    this.host = (host || '').trim();
    this.port = parseInt(port, 10);
    this.username = (username || '').trim();
    this.password = (password || '').trim();
    this.type = String(type || 'SOCKS5').toUpperCase() === 'HTTP' ? 'HTTP' : 'SOCKS5';
    this.isActive = Boolean(isActive);
    this.isExpired = Boolean(isExpired);
    this.lastChecked = lastChecked || null;
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

  markActive(latencyMs = null) {
    this.isActive = true;
    this.isExpired = false;
    this.failCount = 0;
    this.latencyMs = latencyMs;
    this.lastChecked = DateTimeUtil.formatIso();
  }

  markFailed() {
    this.failCount += 1;
    this.lastChecked = DateTimeUtil.formatIso();
    if (this.failCount >= 3) {
      this.isExpired = true;
      this.isActive = false;
    }
  }

  toPersistenceJson() {
    return {
      id: this.id,
      name: this.name,
      host: this.host,
      port: this.port,
      username: this.username,
      password: this.password,
      type: this.type, // UPPERCASE for SQL
      isActive: this.isActive,
      isExpired: this.isExpired,
      lastChecked: this.lastChecked,
      latencyMs: this.latencyMs,
      failCount: this.failCount
    };
  }

  toJSON() {
    return {
      id: this.id,
      name: this.name,
      host: this.host,
      port: this.port,
      username: this.username,
      password: this.password,
      type: this.type.toLowerCase(), // lowercase for client response
      isActive: this.isActive,
      isExpired: this.isExpired,
      lastChecked: this.lastChecked,
      latencyMs: this.latencyMs,
      failCount: this.failCount
    };
  }
}

module.exports = Proxy;
