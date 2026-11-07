const crypto = require('crypto');
const config = require('../../../config');

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
    const rawSecret = this.customSecret || config.security.appSecret;
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

  /**
   * Securely hash a user password using industry-standard bcrypt
   */
  hashPassword(password) {
    if (!password || typeof password !== 'string') {
      throw new Error('Mật khẩu không được để trống!');
    }
    const bcrypt = require('bcryptjs');
    return bcrypt.hashSync(password, 10);
  }

  /**
   * Verify a password against its hashed value (supports bcrypt & legacy scrypt)
   */
  verifyPassword(password, storedHash) {
    if (!password || !storedHash || typeof storedHash !== 'string') return false;

    // 1. Industry standard bcrypt hashes ($2a$, $2b$, $2y$)
    if (storedHash.startsWith('$2')) {
      const bcrypt = require('bcryptjs');
      return bcrypt.compareSync(password, storedHash);
    }

    // 2. Legacy scrypt hashes (backward compatibility)
    if (storedHash.startsWith('hash:')) {
      const parts = storedHash.split(':');
      if (parts.length !== 3) return false;

      const salt = parts[1];
      const originalHash = parts[2];
      const secret = config.security.appSecret;
      const combinedSalt = `${salt}:${secret}`;
      const verifyHash = crypto.scryptSync(password, combinedSalt, 64).toString('hex');

      return crypto.timingSafeEqual(Buffer.from(verifyHash, 'hex'), Buffer.from(originalHash, 'hex'));
    }

    return false;
  }
}

// Singleton instance
const defaultEncryptionService = new EncryptionService();

module.exports = {
  EncryptionService,
  defaultEncryptionService,
  encrypt: (t) => defaultEncryptionService.encrypt(t),
  decrypt: (t) => defaultEncryptionService.decrypt(t),
  hashPassword: (p) => defaultEncryptionService.hashPassword(p),
  verifyPassword: (p, h) => defaultEncryptionService.verifyPassword(p, h)
};
