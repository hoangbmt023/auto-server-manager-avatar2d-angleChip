const Transaction = require('../../../domain/entities/Transaction');
const { transactions } = require('../../database/drizzleSchema');
const { eq, desc, and, sql, inArray } = require('drizzle-orm');

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
      orderCode: row.orderCode,
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
      orderCode: entity.orderCode,
      type: entity.type,
      amount: entity.amount,
      balanceBefore: entity.balanceBefore,
      balanceAfter: entity.balanceAfter,
      description: entity.description,
      voucherCode: entity.voucherCode,
      status: entity.status,
      createdAt: entity.createdAt || new Date()
    };

    await db.insert(transactions).values(values);
    return entity;
  }

  async findByOrderCode(orderCode) {
    if (!orderCode) return null;
    const db = this._getDb();
    const rows = await db
      .select()
      .from(transactions)
      .where(eq(transactions.orderCode, Number(orderCode)))
      .limit(1);

    return rows.length > 0 ? this._mapRowToEntity(rows[0]) : null;
  }

  async update(id, updates = {}, connection = null) {
    if (!id) return;
    const db = this._getDb(connection);
    const updateValues = {};
    if (updates.status !== undefined) updateValues.status = updates.status;
    if (updates.amount !== undefined) updateValues.amount = updates.amount;
    if (updates.balanceBefore !== undefined) updateValues.balanceBefore = updates.balanceBefore;
    if (updates.balanceAfter !== undefined) updateValues.balanceAfter = updates.balanceAfter;
    if (updates.description !== undefined) updateValues.description = updates.description;
    if (updates.orderCode !== undefined) updateValues.orderCode = updates.orderCode;

    await db.update(transactions).set(updateValues).where(eq(transactions.id, id));
  }

  /**
   * Atomically claim a pending transaction and transition it to SUCCESS or CANCELLED.
   * Prevents race conditions and double crediting between Webhook and Redirect Verify.
   * Returns true if this operation successfully transitioned the transaction, false if already claimed.
   */
  /**
   * Atomically claim a pending transaction and transition it to SUCCESS or CANCELLED.
   * Prevents race conditions and double crediting between Webhook and Redirect Verify.
   * Returns true if this operation successfully transitioned the transaction, false if already claimed.
   */
  async claimPendingTransaction(id, { status = 'SUCCESS', amount, balanceBefore, balanceAfter, description }) {
    if (!id) return false;
    const db = this._getDb();

    const updateValues = { status };
    if (amount !== undefined) updateValues.amount = amount;
    if (balanceBefore !== undefined) updateValues.balanceBefore = balanceBefore;
    if (balanceAfter !== undefined) updateValues.balanceAfter = balanceAfter;
    if (description !== undefined) updateValues.description = description;

    const [result] = await db
      .update(transactions)
      .set(updateValues)
      .where(and(eq(transactions.id, id), eq(transactions.status, 'PENDING')));

    return Boolean(result && result.affectedRows > 0);
  }

  async findByUserId(userId, optionsOrLimit = 15, offset = 0) {
    if (!userId) return [];
    const db = this._getDb();

    let limit = 15;
    let finalOffset = 0;
    let types = null;

    if (typeof optionsOrLimit === 'object' && optionsOrLimit !== null) {
      limit = Math.max(1, parseInt(optionsOrLimit.limit || '15', 10));
      finalOffset = Math.max(0, parseInt(optionsOrLimit.offset || '0', 10));
      types = optionsOrLimit.types;
    } else {
      limit = Math.max(1, parseInt(optionsOrLimit || '15', 10));
      finalOffset = Math.max(0, parseInt(offset || '0', 10));
    }

    const conditions = [eq(transactions.userId, userId)];
    if (Array.isArray(types) && types.length > 0) {
      conditions.push(inArray(transactions.type, types));
    }

    const rows = await db
      .select()
      .from(transactions)
      .where(and(...conditions))
      .orderBy(desc(transactions.createdAt))
      .limit(limit)
      .offset(finalOffset);

    return rows.map(r => this._mapRowToEntity(r));
  }

  async countByUserId(userId, types = null) {
    if (!userId) return 0;
    const db = this._getDb();

    const conditions = [eq(transactions.userId, userId)];
    if (Array.isArray(types) && types.length > 0) {
      conditions.push(inArray(transactions.type, types));
    }

    const [row] = await db
      .select({ total: sql`COUNT(*)` })
      .from(transactions)
      .where(and(...conditions));

    return row ? Number(row.total) : 0;
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

  async countVoucherUsesByUser(userId, voucherCode) {
    if (!userId || !voucherCode) return 0;
    const cleanCode = String(voucherCode).trim().toUpperCase();
    const db = this._getDb();
    const [row] = await db
      .select({ count: sql`COUNT(*)` })
      .from(transactions)
      .where(
        and(
          eq(transactions.userId, userId),
          sql`UPPER(${transactions.voucherCode}) = ${cleanCode}`,
          eq(transactions.status, 'SUCCESS')
        )
      );
    return row ? Number(row.count) : 0;
  }
}

module.exports = MySqlTransactionRepository;
