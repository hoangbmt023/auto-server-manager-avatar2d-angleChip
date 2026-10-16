const mysql = require('mysql2/promise');
const config = require('../../../config');

/**
 * MySqlConnectionPool (Infrastructure Layer - Database)
 * Manages connection pooling, query executions, and connection health checks.
 */
class MySqlConnectionPool {
  constructor(customConfig = {}) {
    this.config = {
      host: customConfig.host || config.db.host,
      port: parseInt(customConfig.port || config.db.port, 10),
      user: customConfig.user || config.db.user,
      password: customConfig.password !== undefined ? customConfig.password : config.db.password,
      database: customConfig.database || config.db.database,
      connectionLimit: parseInt(customConfig.connectionLimit || config.db.connectionLimit, 10),
      waitForConnections: true,
      queueLimit: 0,
      charset: 'utf8mb4',
      timezone: customConfig.timezone || config.db.timezone || 'Z'
    };
    this.pool = null;
  }

  getPool() {
    if (!this.pool) {
      this.pool = mysql.createPool(this.config);
    }
    return this.pool;
  }

  async getConnection() {
    return await this.getPool().getConnection();
  }

  /**
   * Direct pool query execution (for single-table operations)
   */
  async query(sql, params = []) {
    const pool = this.getPool();
    const [rows, fields] = await pool.query(sql, params);
    return rows;
  }

  /**
   * Direct pool execute (prepared statement execution)
   */
  async execute(sql, params = []) {
    const pool = this.getPool();
    const [result] = await pool.execute(sql, params);
    return result;
  }

  /**
   * Health check / Connection test
   */
  async testConnection() {
    try {
      const conn = await this.getConnection();
      await conn.query('SELECT 1');
      conn.release();
      return { success: true, message: 'Kết nối MySQL thành công!' };
    } catch (err) {
      return { success: false, message: `Lỗi kết nối MySQL: ${err.message}` };
    }
  }

  async close() {
    if (this.pool) {
      await this.pool.end();
      this.pool = null;
    }
  }
}

// Default singleton instance
const defaultPool = new MySqlConnectionPool();

module.exports = {
  MySqlConnectionPool,
  defaultPool
};
