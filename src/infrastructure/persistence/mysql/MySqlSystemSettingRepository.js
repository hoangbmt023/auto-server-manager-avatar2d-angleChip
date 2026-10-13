const ISystemSettingRepository = require('../../../domain/repositories/ISystemSettingRepository');
const { systemSettings } = require('../../database/drizzleSchema');
const { eq } = require('drizzle-orm');
const config = require('../../../../config');

/**
 * MySqlSystemSettingRepository (Infrastructure Layer - Adapter)
 * Implements ISystemSettingRepository powered by Drizzle ORM.
 */
class MySqlSystemSettingRepository extends ISystemSettingRepository {
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

  async get(key) {
    if (!key) return null;
    const db = this._getDb();
    const [row] = await db.select().from(systemSettings).where(eq(systemSettings.settingKey, key)).limit(1);
    if (!row) return null;

    let parsedVal = row.settingValue;
    try {
      parsedVal = JSON.parse(row.settingValue);
    } catch (e) {}

    return parsedVal;
  }

  async getAll() {
    const db = this._getDb();
    const rows = await db.select().from(systemSettings);
    const result = {};
    for (const r of rows) {
      try {
        result[r.settingKey] = JSON.parse(r.settingValue);
      } catch (e) {
        result[r.settingKey] = r.settingValue;
      }
    }
    return result;
  }

  async getCompleteConfig() {
    const dbSettings = await this.getAll();
    const defaults = {
      port: config.app.port,
      password: '',
      emulatorJar: 'AngelChipEmulator_V2Proxy.jar',
      gameJar: 'avatar_fish_build40.jar',
      javaPath: '',
      rmsMode: config.app.rmsMode,
      appId: config.app.appId,
      activeAccountId: null,
      runningAccountIds: [],
      autoRestart: true,
      autoStart: true,
      maxMemoryMb: config.app.maxMemoryMb,
      extraArgs: [],
      servers: [
        { id: 0, name: 'Hoàn Mỹ' },
        { id: 1, name: 'Diệu Kỳ' }
      ]
    };
    return { ...defaults, ...dbSettings };
  }

  async set(key, value, description = null, connection = null) {
    const db = this._getDb(connection);
    const serialized = typeof value === 'string' ? value : JSON.stringify(value);

    await db.insert(systemSettings).values({
      settingKey: key,
      settingValue: serialized,
      description
    }).onDuplicateKeyUpdate({
      set: {
        settingValue: serialized,
        description
      }
    });

    return value;
  }

  async setMany(settingsObj, connection = null) {
    for (const [k, v] of Object.entries(settingsObj)) {
      await this.set(k, v, null, connection);
    }
    return settingsObj;
  }

  async delete(key, connection = null) {
    const db = this._getDb(connection);
    await db.delete(systemSettings).where(eq(systemSettings.settingKey, key));
    return true;
  }
}

module.exports = MySqlSystemSettingRepository;
