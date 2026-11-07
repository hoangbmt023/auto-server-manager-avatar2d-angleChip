const Voucher = require('../../../domain/entities/Voucher');
const { vouchers } = require('../../database/drizzleSchema');
const { eq, desc, sql } = require('drizzle-orm');

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
      discountPercent: row.discountPercent !== undefined ? row.discountPercent : row.discount_percent,
      discountAmount: row.discountAmount !== undefined ? row.discountAmount : row.discount_amount,
      maxDiscountAmount: row.maxDiscountAmount !== undefined ? row.maxDiscountAmount : (row.max_discount_amount || 0),
      minOrder: row.minOrder !== undefined ? row.minOrder : row.min_order,
      maxUses: row.maxUses !== undefined ? row.maxUses : row.max_uses,
      maxUsesPerUser: row.maxUsesPerUser !== undefined ? row.maxUsesPerUser : (row.max_uses_per_user || 1),
      usedCount: row.usedCount !== undefined ? row.usedCount : row.used_count,
      expiresAt: row.expiresAt !== undefined ? row.expiresAt : row.expires_at,
      isActive: Boolean(row.isActive !== undefined ? row.isActive : row.is_active),
      createdAt: row.createdAt !== undefined ? row.createdAt : row.created_at
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
    const cleanCode = String(code).trim().toUpperCase();
    const db = this._getDb(connection);
    await db
      .update(vouchers)
      .set({
        usedCount: sql`${vouchers.usedCount} + 1`
      })
      .where(eq(vouchers.code, cleanCode));
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
      maxDiscountAmount: entity.maxDiscountAmount,
      minOrder: entity.minOrder,
      maxUses: entity.maxUses,
      maxUsesPerUser: entity.maxUsesPerUser,
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
