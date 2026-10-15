const Transaction = require('../../../domain/entities/Transaction');
const { transactions } = require('../../database/drizzleSchema');
const { eq, desc } = require('drizzle-orm');

/**
 * MySqlTransactionRepository (Infrastructure Layer - Adapter)
 * Persists and retrieves transactions from MySQL.
 */
class MySqlTransactionRepository {
  constructor(dbPool, drizzleDb = null) {
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

  _mapRowToEntity(row) {
    if (!row) return null;
    return new Transaction({
      id: row.id,
      userId: row.userId,
      type: row.type,
      amount: row.amount,
      balanceBefore: row.balanceBefore,
      balanceAfter: row.balanceAfter,
      description: row.description,
      voucherCode: row.voucherCode,
      status: row.status,
      createdAt: row.createdAt
    });
  }

  async save(tx, connection = null) {
    const entity = tx instanceof Transaction ? tx : new Transaction(tx);
    entity.validate();

    const db = this._getDb(connection);
    const values = {
      id: entity.id,
      userId: entity.userId,
      type: entity.type,
      amount: entity.amount,
      balanceBefore: entity.balanceBefore,
      balanceAfter: entity.balanceAfter,
      description: entity.description,
      voucherCode: entity.voucherCode,
      status: entity.status
    };

    await db.insert(transactions).values(values);
    return entity;
  }

  async findByUserId(userId, limit = 50, offset = 0) {
    if (!userId) return [];
    const db = this._getDb();
    const rows = await db
      .select()
      .from(transactions)
      .where(eq(transactions.userId, userId))
      .orderBy(desc(transactions.createdAt))
      .limit(limit)
      .offset(offset);

    return rows.map(r => this._mapRowToEntity(r));
  }

  async findAll(limit = 100, offset = 0) {
    const db = this._getDb();
    const rows = await db
      .select()
      .from(transactions)
      .orderBy(desc(transactions.createdAt))
      .limit(limit)
      .offset(offset);

    return rows.map(r => this._mapRowToEntity(r));
  }
}

module.exports = MySqlTransactionRepository;
