const IRefreshTokenRepository = require('../../../domain/repositories/IRefreshTokenRepository');
const { refreshTokens } = require('../../database/drizzleSchema');
const { eq, and, isNull, gt, lt, inArray, asc } = require('drizzle-orm');
const crypto = require('crypto');

/**
 * MySqlRefreshTokenRepository (Infrastructure Layer - Adapter)
 * Persists, looks up, and revokes refresh tokens via MySQL / Drizzle ORM.
 * Tokens are stored as SHA-256 hashes to prevent plaintext exposure if DB is compromised.
 */
class MySqlRefreshTokenRepository extends IRefreshTokenRepository {
  constructor(dbPool, drizzleDb = null) {
    super();
    this.dbPool = dbPool;
    this.drizzleDb = drizzleDb;
  }

  _getDb(connection = null) {
    if (this.drizzleDb) {
      return this.drizzleDb.getDb(connection);
    }
    const { drizzle } = require('drizzle-orm/mysql2');
    const schema = require('../../database/drizzleSchema');
    return drizzle(connection || this.dbPool.getPool(), { schema, mode: 'default' });
  }

  /**
   * Hashes a raw refresh token using SHA-256
   * @param {string} rawToken
   * @returns {string} 64-char hex string
   */
  static hashToken(rawToken) {
    if (!rawToken || typeof rawToken !== 'string') return '';
    return crypto.createHash('sha256').update(rawToken.trim()).digest('hex');
  }

  /**
   * Saves a new refresh token record
   * @param {object} param0
   */
  async save({ id = null, userId, tokenHash, expiresAt }) {
    const db = this._getDb();
    const tokenId = id || crypto.randomUUID();

    await db.insert(refreshTokens).values({
      id: tokenId,
      userId,
      tokenHash,
      expiresAt: new Date(expiresAt),
      revokedAt: null
    });

    return { id: tokenId, userId, tokenHash, expiresAt };
  }

  /**
   * Finds an active (not revoked, not expired) refresh token by its SHA-256 hash
   * @param {string} tokenHash
   * @returns {object|null}
   */
  async findByTokenHash(tokenHash) {
    if (!tokenHash) return null;
    const db = this._getDb();

    const [record] = await db
      .select()
      .from(refreshTokens)
      .where(
        and(
          eq(refreshTokens.tokenHash, tokenHash),
          isNull(refreshTokens.revokedAt),
          gt(refreshTokens.expiresAt, new Date())
        )
      )
      .limit(1);

    return record || null;
  }

  /**
   * Revokes a specific refresh token by its hash
   * @param {string} tokenHash
   */
  async revokeByTokenHash(tokenHash) {
    if (!tokenHash) return false;
    const db = this._getDb();

    const result = await db
      .update(refreshTokens)
      .set({ revokedAt: new Date() })
      .where(and(eq(refreshTokens.tokenHash, tokenHash), isNull(refreshTokens.revokedAt)));

    return true;
  }

  /**
   * Revokes all active refresh tokens for a user (e.g. on password reset or account ban)
   * @param {string} userId
   */
  async revokeAllForUser(userId) {
    if (!userId) return false;
    const db = this._getDb();

    await db
      .update(refreshTokens)
      .set({ revokedAt: new Date() })
      .where(and(eq(refreshTokens.userId, userId), isNull(refreshTokens.revokedAt)));

    return true;
  }

  /**
   * Enforces max active device/session limit per user account (FIFO Eviction)
   * Revokes the oldest active refresh tokens if the count reaches or exceeds maxDevices.
   * @param {string} userId
   * @param {number} maxDevices
   */
  async enforceDeviceLimit(userId, maxDevices = 5) {
    if (!userId || !maxDevices || maxDevices <= 0) return 0;
    const db = this._getDb();

    // Query active tokens ordered by createdAt ASC (oldest first)
    const activeTokens = await db
      .select({ id: refreshTokens.id, tokenHash: refreshTokens.tokenHash, createdAt: refreshTokens.createdAt })
      .from(refreshTokens)
      .where(
        and(
          eq(refreshTokens.userId, userId),
          isNull(refreshTokens.revokedAt),
          gt(refreshTokens.expiresAt, new Date())
        )
      )
      .orderBy(asc(refreshTokens.createdAt));

    // When a new token is about to be saved, total will be activeTokens.length + 1.
    // If that exceeds maxDevices, we must revoke the oldest overflowCount tokens.
    const overflowCount = (activeTokens.length + 1) - maxDevices;
    if (overflowCount > 0) {
      const tokensToRevoke = activeTokens.slice(0, overflowCount);
      const idsToRevoke = tokensToRevoke.map(t => t.id);

      await db
        .update(refreshTokens)
        .set({ revokedAt: new Date() })
        .where(inArray(refreshTokens.id, idsToRevoke));

      return tokensToRevoke.length;
    }

    return 0;
  }

  /**
   * Deletes expired or revoked tokens older than 30 days
   */
  async cleanupExpired() {
    const db = this._getDb();
    const cutoff = new Date(Date.now() - 30 * 24 * 60 * 60 * 1000);

    await db
      .delete(refreshTokens)
      .where(lt(refreshTokens.expiresAt, cutoff));
  }
}

module.exports = MySqlRefreshTokenRepository;
