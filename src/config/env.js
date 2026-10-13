const envLoader = require('./envLoader');

/**
 * Intermediate Environment Access Layer (Env Proxy / Encapsulation)
 * Acts as the single source of truth for all environment variables.
 * Provides type-safe parsing, validation, fallback handling, and prevents direct process.env coupling.
 */
class Env {
  constructor() {
    this.raw = process.env;
  }

  /**
   * Get raw string environment variable with optional default
   * @param {string} key
   * @param {string} [defaultValue='']
   * @returns {string}
   */
  get(key, defaultValue = '') {
    const val = this.raw[key];
    if (val === undefined || val === null || val === '') {
      return defaultValue;
    }
    return String(val).trim();
  }

  /**
   * Get environment variable as number
   * @param {string} key
   * @param {number} [defaultValue=0]
   * @returns {number}
   */
  getNumber(key, defaultValue = 0) {
    const val = this.raw[key];
    if (val === undefined || val === null || val === '') {
      return defaultValue;
    }
    const num = Number(val);
    return Number.isNaN(num) ? defaultValue : num;
  }

  /**
   * Get environment variable as boolean
   * Accepts 'true', '1', 'yes', 'on' as true
   * @param {string} key
   * @param {boolean} [defaultValue=false]
   * @returns {boolean}
   */
  getBoolean(key, defaultValue = false) {
    const val = this.raw[key];
    if (val === undefined || val === null || val === '') {
      return defaultValue;
    }
    const lower = String(val).trim().toLowerCase();
    return lower === 'true' || lower === '1' || lower === 'yes' || lower === 'on';
  }

  /**
   * Get environment variable as array of strings
   * @param {string} key
   * @param {string[]} [defaultValue=[]]
   * @param {string} [delimiter=',']
   * @returns {string[]}
   */
  getArray(key, defaultValue = [], delimiter = ',') {
    const val = this.raw[key];
    if (val === undefined || val === null || val === '') {
      return defaultValue;
    }
    return String(val)
      .split(delimiter)
      .map(item => item.trim())
      .filter(Boolean);
  }

  /**
   * Ensures environment variable exists or throws an error
   * @param {string} key
   * @param {string} [customMessage]
   * @returns {string}
   */
  getOrThrow(key, customMessage = null) {
    const val = this.get(key);
    if (!val) {
      throw new Error(customMessage || `[Env Error] Biến môi trường bắt buộc [${key}] chưa được cấu hình!`);
    }
    return val;
  }

  /**
   * Check if an environment variable exists and is not empty
   * @param {string} key
   * @returns {boolean}
   */
  has(key) {
    const val = this.raw[key];
    return val !== undefined && val !== null && String(val).trim() !== '';
  }

  /**
   * Current Node.js environment
   * @returns {string} 'development' | 'production' | 'test'
   */
  get nodeEnv() {
    return this.get('NODE_ENV', 'development').toLowerCase();
  }

  /**
   * True if running in development mode
   * @returns {boolean}
   */
  get isDev() {
    return this.nodeEnv === 'development';
  }

  /**
   * True if running in production mode
   * @returns {boolean}
   */
  get isProd() {
    return this.nodeEnv === 'production';
  }

  /**
   * Name of loaded environment file
   * @returns {string}
   */
  get loadedEnvFile() {
    return envLoader.getLoadedFile();
  }

  /**
   * Returns a copy of all environment variables for child process spawning
   * @returns {Record<string, string>}
   */
  toObject() {
    return { ...this.raw };
  }
}

const envInstance = new Env();

module.exports = envInstance;
