/**
 * RateLimiter (Infrastructure / Security Layer)
 * Lightweight, in-memory rate limiter to mitigate DoS, brute-force, and API spam.
 */
class RateLimiter {
  constructor() {
    this.hits = new Map();

    // Auto prune expired records every 2 minutes
    this.cleanupInterval = setInterval(() => {
      const now = Date.now();
      for (const [key, entry] of this.hits.entries()) {
        if (now > entry.resetTime) {
          this.hits.delete(key);
        }
      }
    }, 120000);

    if (this.cleanupInterval.unref) {
      this.cleanupInterval.unref();
    }
  }

  /**
   * Check if a request exceeds rate limit.
   * @param {string} key Identifier (e.g., `topup:${userId}` or `verify:${ip}`)
   * @param {number} maxRequests Maximum allowed requests within window
   * @param {number} windowMs Time window in milliseconds
   * @returns {{ isAllowed: boolean, remaining: number, retryAfterSeconds: number }}
   */
  consume(key, maxRequests = 10, windowMs = 60000) {
    const now = Date.now();
    let entry = this.hits.get(key);

    if (!entry || now > entry.resetTime) {
      entry = { count: 1, resetTime: now + windowMs };
      this.hits.set(key, entry);
      return { isAllowed: true, remaining: maxRequests - 1, retryAfterSeconds: 0 };
    }

    if (entry.count >= maxRequests) {
      const retryAfterSeconds = Math.ceil((entry.resetTime - now) / 1000);
      return { isAllowed: false, remaining: 0, retryAfterSeconds };
    }

    entry.count += 1;
    return { isAllowed: true, remaining: maxRequests - entry.count, retryAfterSeconds: 0 };
  }
}

const defaultRateLimiter = new RateLimiter();

module.exports = {
  RateLimiter,
  defaultRateLimiter
};
