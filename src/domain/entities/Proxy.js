/**
 * Proxy Entity (Domain Layer)
 * Represents a Network Proxy instance with validation and status rules.
 */
class Proxy {
  constructor({
    id,
    name,
    host,
    port,
    username = '',
    password = '',
    type = 'socks5',
    isActive = true,
    isExpired = false,
    lastChecked = null,
    latencyMs = null,
    failCount = 0
  }) {
    this.id = id || `proxy_${Date.now()}_${Math.random().toString(36).substr(2, 4)}`;
    this.name = (name || '').trim() || `${host}:${port}`;
    this.host = (host || '').trim();
    this.port = parseInt(port, 10);
    this.username = (username || '').trim();
    this.password = (password || '').trim();
    this.type = (type || 'socks5').toLowerCase() === 'http' ? 'http' : 'socks5';
    this.isActive = Boolean(isActive);
    this.isExpired = Boolean(isExpired);
    this.lastChecked = lastChecked || null;
    this.latencyMs = latencyMs !== null ? parseInt(latencyMs, 10) : null;
    this.failCount = parseInt(failCount || 0, 10);
  }

  validate() {
    if (!this.host) {
      throw new Error('Địa chỉ IP / Host của Proxy không được để trống!');
    }
    if (isNaN(this.port) || this.port < 1 || this.port > 65535) {
      throw new Error(`Cổng Port [${this.port}] không hợp lệ (1-65535)!`);
    }
  }

  markActive(latencyMs = null) {
    this.isActive = true;
    this.isExpired = false;
    this.failCount = 0;
    this.latencyMs = latencyMs;
    this.lastChecked = new Date().toISOString();
  }

  markFailed() {
    this.failCount += 1;
    this.lastChecked = new Date().toISOString();
    if (this.failCount >= 3) {
      this.isExpired = true;
      this.isActive = false;
    }
  }

  toJSON() {
    return {
      id: this.id,
      name: this.name,
      host: this.host,
      port: this.port,
      username: this.username,
      password: this.password,
      type: this.type,
      isActive: this.isActive,
      isExpired: this.isExpired,
      lastChecked: this.lastChecked,
      latencyMs: this.latencyMs,
      failCount: this.failCount
    };
  }
}

module.exports = Proxy;
