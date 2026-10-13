const { drizzle } = require('drizzle-orm/mysql2');
const schema = require('./drizzleSchema');

/**
 * DrizzleDb (Infrastructure Layer - Database)
 * Factory for creating and managing Drizzle ORM instance over MySqlConnectionPool.
 */
class DrizzleDb {
  constructor(mySqlConnectionPool) {
    this.mySqlConnectionPool = mySqlConnectionPool;
    this._drizzle = null;
  }

  getDb(connection = null) {
    const pool = connection || this.mySqlConnectionPool.getPool();
    if (connection) {
      // Ephemeral transaction connection wrapper
      return drizzle(connection, { schema, mode: 'default' });
    }
    if (!this._drizzle) {
      this._drizzle = drizzle(pool, { schema, mode: 'default' });
    }
    return this._drizzle;
  }
}

module.exports = DrizzleDb;
