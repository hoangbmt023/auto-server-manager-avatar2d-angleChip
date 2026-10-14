/**
 * IRefreshTokenRepository (Domain Layer - Port)
 * Interface contract for persisting and revoking Refresh Tokens.
 */
class IRefreshTokenRepository {
  async save({ id, userId, tokenHash, expiresAt }) {
    throw new Error('Not implemented');
  }

  async findByTokenHash(tokenHash) {
    throw new Error('Not implemented');
  }

  async revokeByTokenHash(tokenHash) {
    throw new Error('Not implemented');
  }

  async revokeAllForUser(userId) {
    throw new Error('Not implemented');
  }

  async enforceDeviceLimit(userId, maxDevices) {
    throw new Error('Not implemented');
  }

  async cleanupExpired() {
    throw new Error('Not implemented');
  }
}

module.exports = IRefreshTokenRepository;
