const { TABLES } = require('./CodeFirstSchema');
const { hashPassword } = require('../security/EncryptionService');

/**
 * DatabaseMigrator (Infrastructure Layer - Database)
 * Native Code-First Schema Sync Engine (inspired by EF Core Code-First).
 * Automatically reflects models into MySQL:
 * - Creates missing tables
 * - Adds newly added columns via ALTER TABLE
 * - Adds newly added indexes
 * - Auto-seeds initial data from config.json or defaults
 */
class DatabaseMigrator {
  constructor(dbPool) {
    this.dbPool = dbPool;
  }

  async migrate() {
    console.log('🔄 [Code-First Migrator] Bắt đầu đồng bộ cấu trúc CSDL MySQL...');
    const pool = this.dbPool.getPool();
    const dbName = this.dbPool.config.database;

    try {
      // 1. Đồng bộ từng bảng theo thứ tự (users, bot_files, proxies trước; accounts sau do có FK)
      const tableKeys = ['users', 'bot_files', 'proxies', 'accounts', 'system_settings'];

      for (const key of tableKeys) {
        const schema = TABLES[key];
        await this.syncTable(pool, dbName, schema);
      }

      console.log('✅ [Code-First Migrator] Đồng bộ Schema MySQL thành công!');
    } catch (err) {
      console.error('❌ [Code-First Migrator] Lỗi đồng bộ Schema MySQL:', err.message);
      throw err;
    }
  }

  async syncTable(pool, dbName, schema) {
    const { tableName, columns, indexes, foreignKeys = [] } = schema;

    // Kiểm tra bảng đã tồn tại chưa
    const [existingTables] = await pool.query(
      `SELECT TABLE_NAME FROM information_schema.TABLES WHERE TABLE_SCHEMA = ? AND TABLE_NAME = ?`,
      [dbName, tableName]
    );

    if (existingTables.length === 0) {
      // Tạo bảng mới hoàn toàn
      await this.createTable(pool, schema);
    } else {
      // Bảng đã có -> kiểm tra cột và index mới (ALTER TABLE)
      await this.alterExistingTable(pool, dbName, schema);
    }
  }

  async createTable(pool, schema) {
    const { tableName, columns, indexes = [], foreignKeys = [] } = schema;
    const colDefs = [];
    let pkDef = null;

    for (const [colName, col] of Object.entries(columns)) {
      let def = `\`${colName}\` ${col.type}`;
      if (col.notNull) def += ' NOT NULL';
      if (col.null) def += ' NULL';
      if (col.default !== undefined) def += ` DEFAULT ${col.default}`;
      if (col.autoIncrement) def += ' AUTO_INCREMENT';
      if (col.unique && !col.primaryKey) def += ' UNIQUE';
      if (col.primaryKey) pkDef = `PRIMARY KEY (\`${colName}\`)`;

      colDefs.push(def);
    }

    if (pkDef) colDefs.push(pkDef);

    // Thêm indexes
    for (const idx of indexes) {
      const cols = idx.columns.map(c => `\`${c}\``).join(', ');
      colDefs.push(`INDEX \`${idx.name}\` (${cols})`);
    }

    // Thêm foreign keys
    for (const fk of foreignKeys) {
      colDefs.push(
        `CONSTRAINT \`${fk.name}\` FOREIGN KEY (\`${fk.column}\`) REFERENCES \`${fk.refTable}\`(\`${fk.refColumn}\`) ON DELETE ${fk.onDelete || 'RESTRICT'}`
      );
    }

    const ddl = `CREATE TABLE IF NOT EXISTS \`${tableName}\` (\n  ${colDefs.join(',\n  ')}\n) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;`;
    await pool.query(ddl);
    console.log(`  + Đã tạo bảng Code-First [${tableName}] thành công.`);
  }

  async alterExistingTable(pool, dbName, schema) {
    const { tableName, columns, indexes = [] } = schema;

    // Lấy danh sách cột hiện tại trong DB
    const [existingCols] = await pool.query(
      `SELECT COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_SCHEMA = ? AND TABLE_NAME = ?`,
      [dbName, tableName]
    );
    const existingColNames = new Set(existingCols.map(c => c.COLUMN_NAME));

    // Thêm các cột mới chưa có
    for (const [colName, col] of Object.entries(columns)) {
      if (!existingColNames.has(colName)) {
        let def = `\`${colName}\` ${col.type}`;
        if (col.notNull) def += ' NOT NULL';
        if (col.null) def += ' NULL';
        if (col.default !== undefined) def += ` DEFAULT ${col.default}`;
        if (col.unique) def += ' UNIQUE';

        const alterSql = `ALTER TABLE \`${tableName}\` ADD COLUMN ${def}`;
        await pool.query(alterSql);
        console.log(`  + [ALTER TABLE] Đã thêm cột [${colName}] vào bảng [${tableName}].`);
      }
    }

    // Kiểm tra và bổ sung indexes nếu thiếu
    const [existingIndexes] = await pool.query(
      `SELECT DISTINCT INDEX_NAME FROM information_schema.STATISTICS WHERE TABLE_SCHEMA = ? AND TABLE_NAME = ?`,
      [dbName, tableName]
    );
    const existingIndexNames = new Set(existingIndexes.map(i => i.INDEX_NAME));

    for (const idx of indexes) {
      if (!existingIndexNames.has(idx.name)) {
        const cols = idx.columns.map(c => `\`${c}\``).join(', ');
        const addIdxSql = `CREATE INDEX \`${idx.name}\` ON \`${tableName}\` (${cols})`;
        await pool.query(addIdxSql);
        console.log(`  + [CREATE INDEX] Đã tạo index [${idx.name}] trên bảng [${tableName}].`);
      }
    }
  }

  /**
   * Tự động nạp dữ liệu ban đầu từ config.json hoặc mặc định nếu MySQL chưa có dữ liệu
   */
  async seedInitialData(configRepo = null) {
    const pool = this.dbPool.getPool();

    try {
      // 1. Seed tài khoản Admin mặc định nếu bảng users trống
      const [userRows] = await pool.query('SELECT COUNT(*) as count FROM users');
      if (userRows[0].count === 0) {
        const defaultAdminPassword = hashPassword('Admin@123456');
        await pool.query(
          `INSERT INTO users (id, email, password, phone, role, status) VALUES (?, ?, ?, ?, ?, ?)`,
          ['usr_admin', 'admin@gmail.com', defaultAdminPassword, '0999999999', 'ADMIN', 'ACTIVE']
        );
        console.log('  🌱 [Seed] Đã tạo tài khoản Admin mặc định: admin@gmail.com / Admin@123456 (Role: admin)');
      }

      // Đọc config.json nếu có
      let config = null;
      if (configRepo && typeof configRepo.get === 'function') {
        config = configRepo.get();
      }

      // 2. Seed BotFiles nếu trống
      const [botFileRows] = await pool.query('SELECT COUNT(*) as count FROM bot_files');
      if (botFileRows[0].count === 0) {
        const defaultFiles = config && Array.isArray(config.botFiles) && config.botFiles.length > 0
          ? config.botFiles
          : [
            {
              id: 'file_1',
              name: 'Auto up kim cương - Mặc định (IP Server)',
              gameJar: 'avatar_upxu_build34.jar',
              modType: 'UPXU',
              appId: 'avatar_file_1',
              maxAccounts: 6,
              isDefault: true,
              proxy: {}
            },
            {
              id: 'file_2',
              name: 'Auto up câu cá - Mặc định (IP Server)',
              gameJar: 'avatar_fish_build40.jar',
              modType: 'FISH',
              appId: 'avatar_file_2',
              maxAccounts: 6,
              isDefault: false,
              proxy: {}
            }
          ];

        for (const file of defaultFiles) {
          const modTypeUpper = String(file.modType || 'UPXU').toUpperCase();
          await pool.query(
            `INSERT INTO bot_files (id, name, game_jar, mod_type, app_id, max_accounts, is_default, proxy_config)
             VALUES (?, ?, ?, ?, ?, ?, ?, ?)`,
            [
              file.id,
              file.name,
              file.gameJar || 'avatar_fish_build40.jar',
              ['UPXU', 'FISH', 'CHIPMIX'].includes(modTypeUpper) ? modTypeUpper : 'UPXU',
              file.appId || `avatar_${file.id}`,
              file.maxAccounts || 6,
              file.isDefault ? 1 : 0,
              JSON.stringify(file.proxy || {})
            ]
          );
        }
        console.log(`  🌱 [Seed] Đã nạp ${defaultFiles.length} Profile/File bot mẫu vào MySQL.`);
      }

      // 3. Seed Proxies nếu trống
      const [proxyRows] = await pool.query('SELECT COUNT(*) as count FROM proxies');
      if (proxyRows[0].count === 0 && config && Array.isArray(config.proxies) && config.proxies.length > 0) {
        for (const p of config.proxies) {
          const typeUpper = String(p.type || 'SOCKS5').toUpperCase();
          await pool.query(
            `INSERT INTO proxies (id, name, host, port, username, password, type, is_active, is_expired)
             VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)`,
            [
              p.id,
              p.name || `${p.host}:${p.port}`,
              p.host,
              p.port,
              p.username || '',
              p.password || '',
              typeUpper === 'HTTP' ? 'HTTP' : 'SOCKS5',
              p.isActive !== false ? 1 : 0,
              p.isExpired ? 1 : 0
            ]
          );
        }
        console.log(`  🌱 [Seed] Đã di chuyển ${config.proxies.length} proxy từ config.json vào MySQL.`);
      }

      // 4. Seed Accounts nếu trống
      const [accRows] = await pool.query('SELECT COUNT(*) as count FROM accounts');
      if (accRows[0].count === 0 && config && Array.isArray(config.accounts) && config.accounts.length > 0) {
        for (const a of config.accounts) {
          await pool.query(
            `INSERT INTO accounts (id, username, password, server_id, server_name, file_id, proxy_id, note, ip_slot, app_id, target_coins, up_days, pending_reset, farm_settings, diamond_settings, fish_settings, sell_ore_settings)
             VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)`,
            [
              a.id,
              a.username,
              a.password || '',
              a.serverId !== undefined ? a.serverId : 0,
              a.serverName || (a.serverId === 1 ? 'Diệu Kỳ' : 'Hoàn Mỹ'),
              a.fileId || 'file_1',
              a.proxyId || null,
              a.note || '',
              a.ipSlot || 1,
              a.appId || `avatar_${a.username}`,
              a.targetCoins || 0,
              a.upDays || 0,
              a.pendingReset ? 1 : 0,
              JSON.stringify(a.farmSettings || {}),
              JSON.stringify(a.diamondSettings || {}),
              JSON.stringify(a.fishSettings || {}),
              JSON.stringify(a.sellOreSettings || {})
            ]
          );
        }
        console.log(`  🌱 [Seed] Đã di chuyển ${config.accounts.length} tài khoản từ config.json vào MySQL.`);
      }

      // 5. Seed System Settings nếu trống
      const [settingRows] = await pool.query('SELECT COUNT(*) as count FROM system_settings');
      if (settingRows[0].count === 0) {
        const initialSettings = {
          port: config?.port || 3001,
          javaPath: config?.javaPath || '',
          rmsMode: config?.rmsMode || 'file',
          appId: config?.appId || 'avatar_main',
          activeAccountId: config?.activeAccountId || null,
          activeFileId: config?.activeFileId || 'file_1',
          autoRestart: config?.autoRestart !== false,
          autoStart: config?.autoStart !== false,
          maxMemoryMb: config?.maxMemoryMb || 256
        };

        for (const [k, v] of Object.entries(initialSettings)) {
          await pool.query(
            `INSERT INTO system_settings (setting_key, setting_value) VALUES (?, ?)`,
            [k, JSON.stringify(v)]
          );
        }
        console.log('  🌱 [Seed] Đã nạp cài đặt hệ thống vào bảng system_settings.');
      }
    } catch (seedErr) {
      console.warn('⚠️ [Code-First Migrator] Cảnh báo khi seed dữ liệu ban đầu:', seedErr.message);
    }
  }
}

module.exports = DatabaseMigrator;
