const env = require('./env');

/**
 * Deep freezes an object to ensure immutability at runtime
 * @param {object} obj
 * @returns {object}
 */
function deepFreeze(obj) {
  if (!obj || typeof obj !== 'object' || obj === process.env) {
    return obj;
  }
  Object.keys(obj).forEach(prop => {
    if (prop === 'env') return; // Không can thiệp instance Env
    const val = obj[prop];
    if (val && typeof val === 'object' && val !== process.env && !Object.isFrozen(val)) {
      deepFreeze(val);
    }
  });
  return Object.freeze(obj);
}

/**
 * Centralized Application Configuration (Config Module)
 * Groups all configuration domains into strongly-typed, immutable objects.
 * Uses the intermediate `env` layer exclusively instead of accessing `process.env` directly.
 */
const config = {
  app: {
    name: 'cpanel-avatar-bot-manager',
    port: env.getNumber('PORT', 3001),
    env: env.nodeEnv,
    isDev: env.isDev,
    isProd: env.isProd,
    appId: env.get('DEFAULT_APP_ID', 'avatar_main'),
    rmsMode: env.get('DEFAULT_RMS_MODE', 'file'),
    maxMemoryMb: env.getNumber('DEFAULT_MAX_MEMORY', 256),
    loadedEnvFile: env.loadedEnvFile
  },

  db: {
    host: env.get('DB_HOST', 'localhost'),
    port: env.getNumber('DB_PORT', 3306),
    user: env.get('DB_USER', 'root'),
    password: env.get('DB_PASSWORD', ''),
    database: env.get('DB_NAME', 'avatar_2d_bot_manager'),
    connectionLimit: env.getNumber('DB_CONNECTION_LIMIT', 10),
    waitForConnections: true,
    queueLimit: 0,
    charset: 'utf8mb4',
    timezone: env.get('DB_TIMEZONE', 'Z')
  },

  security: {
    appSecret: env.get('APP_SECRET', env.get('ENCRYPTION_KEY', 'avatar_bot_cpanel_default_secret_key_2026')),
    jwtSecret: env.get('JWT_SECRET', env.get('APP_SECRET', 'avatar_jwt_super_secret_key_2026')),
    jwtExpiresIn: env.get('JWT_EXPIRES_IN', '24h'),
    jwtRefreshExpiresIn: env.get('JWT_REFRESH_EXPIRES_IN', '7d'),
    cookieRememberDays: env.getNumber('COOKIE_REMEMBER_DAYS', 7),
    maxPayloadSizeMb: env.getNumber('MAX_PAYLOAD_SIZE_MB', 5),
    maxActiveDevices: env.getNumber('MAX_ACTIVE_DEVICES', 5)
  },

  cors: {
    allowedOrigins: (() => {
      const origins = env.getArray('CORS_ALLOWED_ORIGINS');
      if (origins.length > 0) return origins;
      return env.isProd ? [] : ['*'];
    })()
  },

  java: {
    javaHome: env.get('JAVA_HOME', null)
  },

  email: {
    host: env.get('SMTP_HOST', ''),
    port: env.getNumber('SMTP_PORT', 587),
    user: env.get('SMTP_USER', ''),
    pass: env.get('SMTP_PASS', ''),
    from: env.get('SMTP_FROM', 'Avatar Bot Manager <noreply@avatarbot.com>'),
    logoUrl: env.get('EMAIL_LOGO_URL', '')
  },

  payos: {
    enabled: env.getBoolean('PAYOS_ENABLED', false),
    clientId: env.get('PAYOS_CLIENT_ID', ''),
    apiKey: env.get('PAYOS_API_KEY', ''),
    checksumKey: env.get('PAYOS_CHECKSUM_KEY', ''),
    bankAccount: env.get('BANK_ACCOUNT_NUMBER', env.get('PAYOS_BANK_ACCOUNT', '')),
    bankName: env.get('BANK_NAME', env.get('PAYOS_BANK_NAME', 'MBBank')),
    accountName: env.get('BANK_ACCOUNT_NAME', env.get('PAYOS_ACCOUNT_NAME', ''))
  },

  payment: {
    publicAppUrl: env.get('PUBLIC_APP_URL', 'http://localhost:3001'),
    bankName: env.get('BANK_NAME', 'MBBank'),
    bankAccount: env.get('BANK_ACCOUNT_NUMBER', ''),
    accountName: env.get('BANK_ACCOUNT_NAME', '')
  },

  // Export intermediate Env helper for dynamic queries
  env
};

module.exports = deepFreeze(config);
