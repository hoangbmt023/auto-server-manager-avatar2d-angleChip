const { TooManyRequestsException } = require('../../domain/errors');

/**
 * OtpCache (Infrastructure Layer - Cache)
 * In-memory TTL cache for One-Time Passwords (OTP).
 * Supports expiration, verification, cooldown enforcement, and spam prevention.
 */
class OtpCache {
  constructor(defaultTtlMs = 5 * 60 * 1000) {
    this.cache = new Map();
    this.sendRateLimits = new Map(); // Tracks send cooldowns and quotas per key
    this.defaultTtlMs = defaultTtlMs;

    // Periodic sweep every 2 minutes
    this.sweepInterval = setInterval(() => this._cleanupExpired(), 2 * 60 * 1000);
    if (this.sweepInterval.unref) {
      this.sweepInterval.unref();
    }
  }

  /**
   * Generates a 6-digit numeric OTP code
   * @returns {string}
   */
  generateCode() {
    return Math.floor(100000 + Math.random() * 900000).toString();
  }

  /**
   * Extracts clean target identifier (e.g. email) from prefixed keys like `activate:user@example.com`
   */
  _extractRateLimitKey(key) {
    if (!key) return '';
    const str = String(key).toLowerCase().trim();
    if (str.includes(':')) {
      return str.split(':').slice(1).join(':').trim();
    }
    return str;
  }

  /**
   * Validates whether an email/key is allowed to receive a new OTP.
   * Enforces 60-second cooldown and maximum 5 OTPs per 60 minutes.
   * @param {string} key
   * @param {number} [cooldownSec=60]
   * @param {number} [maxPerHour=5]
   */
  assertCanSend(key, cooldownSec = 60, maxPerHour = 5) {
    const rateLimitKey = this._extractRateLimitKey(key);
    if (!rateLimitKey) return;

    const now = Date.now();
    const rateInfo = this.sendRateLimits.get(rateLimitKey);

    if (rateInfo) {
      // 1. Check cooldown (e.g. 60 seconds)
      const elapsedMs = now - rateInfo.lastSentAt;
      if (elapsedMs < cooldownSec * 1000) {
        const remainingSec = Math.ceil((cooldownSec * 1000 - elapsedMs) / 1000);
        throw new TooManyRequestsException(`Vui lòng đợi ${remainingSec} giây trước khi yêu cầu gửi lại mã OTP!`);
      }

      // 2. Check 1-hour window quota (maxPerHour)
      if (now - rateInfo.windowStart < 60 * 60 * 1000) {
        if (rateInfo.count >= maxPerHour) {
          const remainingMinutes = Math.ceil((60 * 60 * 1000 - (now - rateInfo.windowStart)) / 60000);
          throw new TooManyRequestsException(`Bạn đã vượt quá giới hạn gửi mã OTP (${maxPerHour} lần/giờ). Vui lòng thử lại sau ${remainingMinutes} phút!`);
        }
      }
    }
  }

  /**
   * Sets an OTP code for a specific key and records send timestamp for anti-spam.
   * @param {string} key
   * @param {string} code
   * @param {object} metadata - Extra payload such as hashedPassword or email
   * @param {number} [ttlMs]
   */
  set(key, code, metadata = {}, ttlMs = this.defaultTtlMs) {
    const normKey = key.toLowerCase();
    const rateLimitKey = this._extractRateLimitKey(key);
    const now = Date.now();
    const expiresAt = now + ttlMs;

    this.cache.set(normKey, {
      code: String(code).trim(),
      metadata,
      expiresAt,
      attempts: 0
    });

    // Record rate limit stats against clean email target
    if (rateLimitKey) {
      const rateInfo = this.sendRateLimits.get(rateLimitKey);
      if (!rateInfo || (now - rateInfo.windowStart >= 60 * 60 * 1000)) {
        this.sendRateLimits.set(rateLimitKey, {
          lastSentAt: now,
          windowStart: now,
          count: 1
        });
      } else {
        rateInfo.lastSentAt = now;
        rateInfo.count += 1;
      }
    }
  }



  /**
   * Retrieves entry if not expired
   * @param {string} key
   * @returns {object|null}
   */
  get(key) {
    const entry = this.cache.get(key.toLowerCase());
    if (!entry) return null;
    if (Date.now() > entry.expiresAt) {
      this.cache.delete(key.toLowerCase());
      return null;
    }
    return entry;
  }

  /**
   * Verifies an OTP code against stored entry.
   * If valid, deletes the entry and returns { valid: true, metadata }.
   * If invalid, increments attempt counter (max 5) and returns { valid: false }.
   * @param {string} key
   * @param {string} inputCode
   * @returns {{ valid: boolean, metadata?: object, message?: string }}
   */
  verify(key, inputCode, consume = true) {
    const entry = this.get(key);
    if (!entry) {
      return { valid: false, message: 'Mã xác nhận không tồn tại hoặc đã hết hạn.' };
    }

    if (entry.attempts >= 5) {
      this.cache.delete(key.toLowerCase());
      return { valid: false, message: 'Mã xác nhận đã bị vô hiệu do nhập sai quá nhiều lần.' };
    }

    if (entry.code !== String(inputCode).trim()) {
      entry.attempts += 1;
      return { valid: false, message: `Mã OTP không chính xác (${5 - entry.attempts} lần thử lại).` };
    }

    // Success -> consume OTP only if requested
    if (consume) {
      this.cache.delete(key.toLowerCase());
    }
    return { valid: true, metadata: entry.metadata };
  }

  /**
   * Deletes an entry manually
   * @param {string} key
   */
  delete(key) {
    this.cache.delete(key.toLowerCase());
  }

  /**
   * Internal cleaner
   */
  _cleanupExpired() {
    const now = Date.now();
    for (const [key, entry] of this.cache.entries()) {
      if (now > entry.expiresAt) {
        this.cache.delete(key);
      }
    }
  }
}

const defaultOtpCache = new OtpCache();

module.exports = {
  OtpCache,
  defaultOtpCache
};
