/**
 * TransactionManager (Infrastructure Layer - Database)
 * Orchestrates ACID transactions for multi-table business operations.
 * Non-transactional single-table queries bypass this to avoid overhead.
 */
class TransactionManager {
  constructor(dbPool) {
    this.dbPool = dbPool;
  }

  /**
   * Executes a callback within a managed MySQL Transaction.
   * Automatically commits on success and rolls back on failure.
   *
   * @param {Function} callback async (connection) => Promise<any>
   * @returns {Promise<any>}
   */
  async withTransaction(callback) {
    const connection = await this.dbPool.getConnection();
    try {
      await connection.beginTransaction();
      const result = await callback(connection);
      await connection.commit();
      return result;
    } catch (error) {
      try {
        await connection.rollback();
      } catch (rollbackErr) {
        console.error('⚠️ [TransactionManager] Lỗi khi rollback transaction:', rollbackErr.message);
      }
      throw error;
    } finally {
      connection.release();
    }
  }
}

module.exports = TransactionManager;
