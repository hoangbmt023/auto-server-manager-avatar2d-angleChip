const IUserRepository = require('../../../domain/repositories/IUserRepository');
const User = require('../../../domain/entities/User');
const { users } = require('../../database/drizzleSchema');
const { eq, desc, sql } = require('drizzle-orm');
const { DateTimeUtil } = require('../../../shared/utils/dateTime');

/**
 * MySqlUserRepository (Infrastructure Layer - Adapter)
 * Implements IUserRepository powered by Drizzle ORM.
 */
class MySqlUserRepository extends IUserRepository {
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

  _mapRowToEntity(row) {
    if (!row) return null;
    return new User({
      id: row.id,
      email: row.email,
      password: row.password,
      phone: row.phone,
      role: row.role,
      status: row.status,
      balance: row.balance,
      lastLoginAt: row.lastLoginAt ? DateTimeUtil.formatIso(row.lastLoginAt) : null,
      createdAt: row.createdAt ? DateTimeUtil.formatIso(row.createdAt) : null,
      updatedAt: row.updatedAt ? DateTimeUtil.formatIso(row.updatedAt) : null
    });
  }

  async findById(id) {
    if (!id) return null;
    const db = this._getDb();
    const [row] = await db.select().from(users).where(eq(users.id, id)).limit(1);
    return this._mapRowToEntity(row);
  }

  async findByEmail(email) {
    if (!email) return null;
    const db = this._getDb();
    const [row] = await db.select().from(users).where(eq(users.email, email.trim().toLowerCase())).limit(1);
    return this._mapRowToEntity(row);
  }

  async findByPhone(phone) {
    if (!phone) return null;
    const db = this._getDb();
    const [row] = await db.select().from(users).where(eq(users.phone, phone.trim())).limit(1);
    return this._mapRowToEntity(row);
  }

  async findAll() {
    const db = this._getDb();
    const rows = await db.select().from(users).orderBy(desc(users.createdAt));
    return rows.map(r => this._mapRowToEntity(r));
  }

  async save(user, connection = null) {
    const entity = user instanceof User ? user : new User(user);
    entity.validate();

    const db = this._getDb(connection);
    const values = {
      id: entity.id,
      email: entity.email,
      password: entity.password,
      phone: entity.phone,
      role: entity.role,
      status: entity.status,
      balance: entity.balance,
      lastLoginAt: entity.lastLoginAt ? new Date(entity.lastLoginAt) : null
    };

    await db.insert(users).values(values).onDuplicateKeyUpdate({
      set: values
    });

    return entity;
  }

  async updateBalance(id, amountChange, connection = null) {
    const db = this._getDb(connection);
    await db
      .update(users)
      .set({
        balance: sql`GREATEST(0, ${users.balance} + ${amountChange})`
      })
      .where(eq(users.id, id));
    return this.findById(id, connection);
  }

  async delete(id, connection = null) {
    const db = this._getDb(connection);
    await db.delete(users).where(eq(users.id, id));
    return true;
  }

  async updateLastLogin(id, connection = null) {
    const db = this._getDb(connection);
    await db.update(users).set({ lastLoginAt: DateTimeUtil.toDate() }).where(eq(users.id, id));
    return true;
  }
}

module.exports = MySqlUserRepository;
