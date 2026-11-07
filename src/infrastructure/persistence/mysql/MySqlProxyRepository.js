const IProxyRepository = require('../../../domain/repositories/IProxyRepository');
const Proxy = require('../../../domain/entities/Proxy');
const { proxies } = require('../../database/drizzleSchema');
const { eq, desc } = require('drizzle-orm');
const { DateTimeUtil } = require('../../../shared/utils/dateTime');

/**
 * MySqlProxyRepository (Infrastructure Layer - Adapter)
 * Implements IProxyRepository powered by Drizzle ORM.
 */
class MySqlProxyRepository extends IProxyRepository {
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
    return new Proxy({
      id: row.id,
      externalId: row.externalId,
      provider: row.provider,
      proxyCategory: row.proxyCategory,
      name: row.name,
      host: row.host,
      port: row.port,
      username: row.username,
      password: row.password,
      type: row.type,
      tier: row.tier,
      status: row.status,
      maxSlots: row.maxSlots,
      expiresAt: row.expiresAt,
      isActive: Boolean(row.isActive),
      isExpired: Boolean(row.isExpired),
      latencyMs: row.latencyMs,
      failCount: row.failCount,
      lastChecked: row.lastChecked ? DateTimeUtil.formatIso(row.lastChecked) : null,
      lastRotatedAt: row.lastRotatedAt ? DateTimeUtil.formatIso(row.lastRotatedAt) : null
    });
  }

  async findAll() {
    const db = this._getDb();
    const rows = await db.select().from(proxies).orderBy(desc(proxies.createdAt));
    return rows.map(r => this._mapRowToEntity(r));
  }

  async findById(id) {
    if (!id) return null;
    const db = this._getDb();
    const [row] = await db.select().from(proxies).where(eq(proxies.id, id)).limit(1);
    return this._mapRowToEntity(row);
  }

  async findByExternalId(externalId) {
    if (!externalId) return null;
    const db = this._getDb();
    const [row] = await db.select().from(proxies).where(eq(proxies.externalId, String(externalId))).limit(1);
    return this._mapRowToEntity(row);
  }

  async save(proxy, connection = null) {
    const entity = proxy instanceof Proxy ? proxy : new Proxy(proxy);
    entity.validate();

    const db = this._getDb(connection);
    const values = {
      id: entity.id,
      externalId: entity.externalId,
      provider: entity.provider,
      proxyCategory: entity.proxyCategory,
      name: entity.name,
      host: entity.host,
      port: entity.port,
      username: entity.username,
      password: entity.password,
      type: entity.type,
      tier: entity.tier,
      status: entity.status,
      maxSlots: entity.maxSlots,
      expiresAt: entity.expiresAt ? new Date(entity.expiresAt) : null,
      isActive: Boolean(entity.isActive),
      isExpired: Boolean(entity.isExpired),
      latencyMs: entity.latencyMs,
      failCount: entity.failCount,
      lastChecked: entity.lastChecked ? new Date(entity.lastChecked) : null,
      lastRotatedAt: entity.lastRotatedAt ? new Date(entity.lastRotatedAt) : null
    };

    await db.insert(proxies).values(values).onDuplicateKeyUpdate({
      set: values
    });

    return entity;
  }

  async delete(id, connection = null) {
    const db = this._getDb(connection);
    await db.delete(proxies).where(eq(proxies.id, id));
    return true;
  }

  async updateStatus(id, isActive, isExpired, latencyMs = null, connection = null) {
    const db = this._getDb(connection);
    const updatePayload = {
      isActive: Boolean(isActive),
      isExpired: Boolean(isExpired),
      latencyMs,
      lastChecked: DateTimeUtil.toDate()
    };
    if (isExpired) {
      updatePayload.status = 'EXPIRED';
    }
    await db.update(proxies).set(updatePayload).where(eq(proxies.id, id));
    return true;
  }

  async updateLifecycle(id, updates = {}, connection = null) {
    const db = this._getDb(connection);
    const setPayload = {};
    if (updates.status !== undefined) setPayload.status = updates.status;
    if (updates.maxSlots !== undefined) setPayload.maxSlots = updates.maxSlots;
    if (updates.expiresAt !== undefined) setPayload.expiresAt = updates.expiresAt ? new Date(updates.expiresAt) : null;
    if (updates.lastRotatedAt !== undefined) setPayload.lastRotatedAt = updates.lastRotatedAt ? new Date(updates.lastRotatedAt) : null;
    if (updates.isActive !== undefined) setPayload.isActive = Boolean(updates.isActive);
    if (updates.isExpired !== undefined) setPayload.isExpired = Boolean(updates.isExpired);
    if (updates.tier !== undefined) setPayload.tier = updates.tier;

    if (Object.keys(setPayload).length > 0) {
      await db.update(proxies).set(setPayload).where(eq(proxies.id, id));
    }
    return true;
  }
}

module.exports = MySqlProxyRepository;
