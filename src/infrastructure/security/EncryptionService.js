const crypto = require('crypto');
try {
  require('../../../utils/envLoader');
} catch (e) {}

/**
 * EncryptionService (Infrastructure Layer - Security)
 * Provides AES-256-CBC encryption and decryption for sensitive data (passwords, auth tokens).
 * Automatically detects already-encrypted strings prefixed with 'enc:'.
 */
class EncryptionService {
  constructor(secretKey = null) {
    this.customSecret = secretKey;
    this.algorithm = 'aes-256-cbc';
    this.prefix = 'enc:';
  }

  getKey() {
    const rawSecret = this.customSecret || process.env.APP_SECRET || process.env.ENCRYPTION_KEY || 'avatar_bot_cpanel_default_secret_key_2026';
    return crypto.createHash('sha256').update(String(rawSecret)).digest();
  }

  /**
   * Encrypt plain text into 'enc:<iv_hex>:<ciphertext_hex>'
   */
  encrypt(plainText) {
    if (!plainText || typeof plainText !== 'string') return plainText;
    if (plainText.startsWith(this.prefix)) return plainText; // Already encrypted

    try {
      const iv = crypto.randomBytes(16);
      const cipher = crypto.createCipheriv(this.algorithm, this.getKey(), iv);
      let encrypted = cipher.update(plainText, 'utf8', 'hex');
      encrypted += cipher.final('hex');
      return `${this.prefix}${iv.toString('hex')}:${encrypted}`;
    } catch (err) {
      console.error('⚠️ [EncryptionService] Lỗi mã hóa:', err.message);
      return plainText;
    }
  }

  /**
   * Decrypt 'enc:<iv_hex>:<ciphertext_hex>' into plain text
   */
  decrypt(cipherText) {
    if (!cipherText || typeof cipherText !== 'string') return cipherText;
    if (!cipherText.startsWith(this.prefix)) return cipherText; // Plain text

    try {
      const parts = cipherText.slice(this.prefix.length).split(':');
      if (parts.length !== 2) return cipherText;

      const iv = Buffer.from(parts[0], 'hex');
      const encryptedData = parts[1];
      const decipher = crypto.createDecipheriv(this.algorithm, this.getKey(), iv);
      let decrypted = decipher.update(encryptedData, 'hex', 'utf8');
      decrypted += decipher.final('utf8');
      return decrypted;
    } catch (err) {
      console.error('⚠️ [EncryptionService] Lỗi giải mã (sai secret key hoặc dữ liệu bị sửa đổi):', err.message);
      return cipherText;
    }
  }

  /**
   * Check if a string is encrypted
   */
  isEncrypted(text) {
    return typeof text === 'string' && text.startsWith(this.prefix);
  }
}

// Singleton instance
const defaultEncryptionService = new EncryptionService();

module.exports = {
  EncryptionService,
  defaultEncryptionService,
  encrypt: (t) => defaultEncryptionService.encrypt(t),
  decrypt: (t) => defaultEncryptionService.decrypt(t)
};
