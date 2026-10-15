const Voucher = require('../../../domain/entities/Voucher');
const { vouchers } = require('../../database/drizzleSchema');
const { eq, desc } = require('drizzle-orm');

/**
 * MySqlVoucherRepository (Infrastructure Layer - Adapter)
 * Persists and validates promotional vouchers in MySQL.
 */
class MySqlVoucherRepository {
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
    return new Voucher({
      id: row.id,
      code: row.code,
      discountPercent: row.discountPercent,
      discountAmount: row.discountAmount,
      minOrder: row.minOrder,
      maxUses: row.maxUses,
      usedCount: row.usedCount,
      expiresAt: row.expiresAt,
      isActive: Boolean(row.isActive),
      createdAt: row.createdAt
    });
  }

  async findByCode(code) {
    if (!code) return null;
    const cleanCode = String(code).trim().toUpperCase();
    const db = this._getDb();
    const [row] = await db.select().from(vouchers).where(eq(vouchers.code, cleanCode)).limit(1);
    return this._mapRowToEntity(row);
  }

  async incrementUsedCount(code, connection = null) {
    const pool = connection || this.dbPool.getPool();
    const cleanCode = String(code).trim().toUpperCase();
    await pool.query(
      `UPDATE vouchers SET used_count = used_count + 1 WHERE code = ?`,
      [cleanCode]
    );
    return true;
  }

  async findAll() {
    const db = this._getDb();
    const rows = await db.select().from(vouchers).orderBy(desc(vouchers.createdAt));
    return rows.map(r => this._mapRowToEntity(r));
  }

  async save(voucher, connection = null) {
    const entity = voucher instanceof Voucher ? voucher : new Voucher(voucher);
    entity.validate();

    const db = this._getDb(connection);
    const values = {
      id: entity.id,
      code: entity.code,
      discountPercent: entity.discountPercent,
      discountAmount: entity.discountAmount,
      minOrder: entity.minOrder,
      maxUses: entity.maxUses,
      usedCount: entity.usedCount,
      expiresAt: entity.expiresAt ? new Date(entity.expiresAt) : null,
      isActive: entity.isActive
    };

    await db.insert(vouchers).values(values).onDuplicateKeyUpdate({
      set: values
    });

    return entity;
  }

  async delete(code, connection = null) {
    const cleanCode = String(code).trim().toUpperCase();
    const db = this._getDb(connection);
    await db.delete(vouchers).where(eq(vouchers.code, cleanCode));
    return true;
  }
}

module.exports = MySqlVoucherRepository;
