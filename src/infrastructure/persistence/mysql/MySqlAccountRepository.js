const IAccountRepository = require('../../../domain/repositories/IAccountRepository');
const Account = require('../../../domain/entities/Account');
const { accounts } = require('../../database/drizzleSchema');
const { eq, asc, isNull, and } = require('drizzle-orm');

/**
 * MySqlAccountRepository (Infrastructure Layer - Adapter)
 * Implements IAccountRepository powered by Drizzle ORM.
 */
class MySqlAccountRepository extends IAccountRepository {
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

  _parseJsonField(val, defaultVal = {}) {
    if (!val) return defaultVal;
    if (typeof val === 'object') return val;
    try {
      return JSON.parse(val);
    } catch (e) {
      return defaultVal;
    }
  }

  _mapRowToEntity(row) {
    if (!row) return null;
    return new Account({
      id: row.id,
      userId: row.userId || null,
      username: row.username,
      password: row.password,
      serverId: row.serverId,
      serverName: row.serverName,
      fileId: row.fileId,
      proxyId: row.proxyId,
      note: row.note,
      ipSlot: row.ipSlot,
      isEmergencySlot: Boolean(row.isEmergencySlot),
      appId: row.appId,
      targetCoins: row.targetCoins,
      upDays: row.upDays,
      pendingReset: Boolean(row.pendingReset),
      rentalExpiresAt: row.rentalExpiresAt ? new Date(row.rentalExpiresAt) : null,
      rentalPlan: row.rentalPlan || null,
      effectivePriceMonth: row.effectivePriceMonth !== null && row.effectivePriceMonth !== undefined ? parseInt(row.effectivePriceMonth, 10) : null,
      deletedAt: row.deletedAt ? new Date(row.deletedAt) : null,
      farmSettings: this._parseJsonField(row.farmSettings),
      diamondSettings: this._parseJsonField(row.diamondSettings),
      fishSettings: this._parseJsonField(row.fishSettings),
      sellOreSettings: this._parseJsonField(row.sellOreSettings),
      createdAt: row.createdAt ? new Date(row.createdAt) : null,
      updatedAt: row.updatedAt ? new Date(row.updatedAt) : null
    });
  }

  async findAll() {
    const db = this._getDb();
    const rows = await db.select().from(accounts)
      .where(isNull(accounts.deletedAt))
      .orderBy(asc(accounts.serverId), asc(accounts.username));
    return rows.map(r => this._mapRowToEntity(r));
  }

  async findById(id) {
    if (!id) return null;
    const db = this._getDb();
    const [row] = await db.select().from(accounts)
      .where(and(eq(accounts.id, id), isNull(accounts.deletedAt)))
      .limit(1);
    return this._mapRowToEntity(row);
  }

  async findByFileId(fileId) {
    const db = this._getDb();
    const rows = await db.select().from(accounts)
      .where(and(eq(accounts.fileId, fileId), isNull(accounts.deletedAt)))
      .orderBy(asc(accounts.ipSlot), asc(accounts.id));
    return rows.map(r => this._mapRowToEntity(r));
  }

  async findByUserId(userId) {
    if (!userId) return [];
    const db = this._getDb();
    const rows = await db.select().from(accounts)
      .where(and(eq(accounts.userId, userId), isNull(accounts.deletedAt)))
      .orderBy(asc(accounts.id));
    return rows.map(r => this._mapRowToEntity(r));
  }

  async findByUsername(username, includeDeleted = false) {
    if (!username) return null;
    const cleanName = String(username).trim();
    const db = this._getDb();
    const conditions = [eq(accounts.username, cleanName)];
    if (!includeDeleted) {
      conditions.push(isNull(accounts.deletedAt));
    }
    const [row] = await db.select().from(accounts)
      .where(and(...conditions))
      .limit(1);
    return this._mapRowToEntity(row);
  }

  async save(account, connection = null) {
    const entity = account instanceof Account ? account : new Account(account);
    entity.validate();

    const db = this._getDb(connection);
    const values = {
      id: entity.id,
      userId: entity.userId || null,
      username: entity.username,
      password: entity.password,
      serverId: entity.serverId,
      serverName: entity.serverName,
      fileId: entity.fileId,
      proxyId: entity.proxyId || null,
      note: entity.note,
      ipSlot: entity.ipSlot,
      isEmergencySlot: Boolean(entity.isEmergencySlot),
      appId: entity.appId,
      targetCoins: entity.targetCoins,
      upDays: entity.upDays,
      pendingReset: Boolean(entity.pendingReset),
      rentalExpiresAt: entity.rentalExpiresAt ? new Date(entity.rentalExpiresAt) : null,
      rentalPlan: entity.rentalPlan || null,
      effectivePriceMonth: entity.effectivePriceMonth !== null && entity.effectivePriceMonth !== undefined ? parseInt(entity.effectivePriceMonth, 10) : null,
      deletedAt: entity.deletedAt ? new Date(entity.deletedAt) : null,
      farmSettings: entity.farmSettings || {},
      diamondSettings: entity.diamondSettings || {},
      fishSettings: entity.fishSettings || {},
      sellOreSettings: entity.sellOreSettings || {}
    };

    await db.insert(accounts).values(values).onDuplicateKeyUpdate({
      set: values
    });

    return entity;
  }

  async delete(id, connection = null) {
    const db = this._getDb(connection);
    // Soft delete: Đánh dấu ngày xóa và đồng thời giải phóng ghế Proxy ngay lập tức
    await db.update(accounts)
      .set({
        deletedAt: new Date(),
        proxyId: null
      })
      .where(eq(accounts.id, id));
    return true;
  }

  async unlinkProxy(proxyId, connection = null) {
    const db = this._getDb(connection);
    await db.update(accounts).set({ proxyId: null }).where(eq(accounts.proxyId, proxyId));
    return true;
  }

  async deleteByFileId(fileId, connection = null) {
    const db = this._getDb(connection);
    await db.update(accounts).set({ deletedAt: new Date(), proxyId: null }).where(eq(accounts.fileId, fileId));
    return true;
  }
}

module.exports = MySqlAccountRepository;
