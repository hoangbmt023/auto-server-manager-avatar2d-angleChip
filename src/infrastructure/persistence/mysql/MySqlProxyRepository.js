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
      name: row.name,
      host: row.host,
      port: row.port,
      username: row.username,
      password: row.password,
      type: row.type,
      isActive: Boolean(row.isActive),
      isExpired: Boolean(row.isExpired),
      latencyMs: row.latencyMs,
      failCount: row.failCount,
      lastChecked: row.lastChecked ? DateTimeUtil.formatIso(row.lastChecked) : null
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

  async save(proxy, connection = null) {
    const entity = proxy instanceof Proxy ? proxy : new Proxy(proxy);
    entity.validate();

    const db = this._getDb(connection);
    const values = {
      id: entity.id,
      name: entity.name,
      host: entity.host,
      port: entity.port,
      username: entity.username,
      password: entity.password,
      type: entity.type,
      isActive: Boolean(entity.isActive),
      isExpired: Boolean(entity.isExpired),
      latencyMs: entity.latencyMs,
      failCount: entity.failCount,
      lastChecked: entity.lastChecked ? new Date(entity.lastChecked) : null
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
    await db.update(proxies).set({
      isActive: Boolean(isActive),
      isExpired: Boolean(isExpired),
      latencyMs,
      lastChecked: DateTimeUtil.toDate()
    }).where(eq(proxies.id, id));
    return true;
  }
}

module.exports = MySqlProxyRepository;
