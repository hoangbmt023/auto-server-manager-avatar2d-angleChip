const IBotFileRepository = require('../../../domain/repositories/IBotFileRepository');
const BotFile = require('../../../domain/entities/BotFile');
const { botFiles, systemSettings } = require('../../database/drizzleSchema');
const { eq, desc, asc } = require('drizzle-orm');
const { BadRequestException } = require('../../../domain/errors');

/**
 * MySqlBotFileRepository (Infrastructure Layer - Adapter)
 * Implements IBotFileRepository powered by Drizzle ORM.
 */
class MySqlBotFileRepository extends IBotFileRepository {
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
    let proxyConfig = {};
    if (row.proxyConfig) {
      proxyConfig = typeof row.proxyConfig === 'object' ? row.proxyConfig : JSON.parse(row.proxyConfig);
    }

    return new BotFile({
      id: row.id,
      name: row.name,
      gameJar: row.gameJar,
      modType: row.modType,
      appId: row.appId,
      maxAccounts: row.maxAccounts,
      proxy: proxyConfig
    });
  }

  async findAll() {
    const db = this._getDb();
    const rows = await db.select().from(botFiles).orderBy(desc(botFiles.isDefault), asc(botFiles.createdAt));
    return rows.map(r => this._mapRowToEntity(r));
  }

  async findById(id) {
    if (!id) return null;
    const db = this._getDb();
    const [row] = await db.select().from(botFiles).where(eq(botFiles.id, id)).limit(1);
    return this._mapRowToEntity(row);
  }

  async save(file, connection = null) {
    const entity = file instanceof BotFile ? file : new BotFile(file);
    entity.validate();

    const db = this._getDb(connection);
    const values = {
      id: entity.id,
      name: entity.name,
      gameJar: entity.gameJar,
      modType: entity.modType,
      appId: entity.appId,
      maxAccounts: entity.maxAccounts,
      proxyConfig: entity.proxy || {}
    };

    await db.insert(botFiles).values(values).onDuplicateKeyUpdate({
      set: values
    });

    return entity;
  }

  async delete(id, connection = null) {
    if (id === 'file_1') {
      throw new BadRequestException('Không thể xóa Profile/File mặc định (file_1)!');
    }
    const db = this._getDb(connection);
    await db.delete(botFiles).where(eq(botFiles.id, id));
    return true;
  }

  async getActiveFileId() {
    const db = this._getDb();
    const [row] = await db.select().from(systemSettings).where(eq(systemSettings.settingKey, 'activeFileId')).limit(1);
    if (row && row.settingValue) {
      try {
        return JSON.parse(row.settingValue);
      } catch (e) {
        return row.settingValue || 'file_1';
      }
    }
    return 'file_1';
  }

  async setActiveFileId(fileId, connection = null) {
    const db = this._getDb(connection);
    const targetId = fileId || 'file_1';
    await db.insert(systemSettings).values({
      settingKey: 'activeFileId',
      settingValue: JSON.stringify(targetId)
    }).onDuplicateKeyUpdate({
      set: { settingValue: JSON.stringify(targetId) }
    });
    return targetId;
  }
}

module.exports = MySqlBotFileRepository;
