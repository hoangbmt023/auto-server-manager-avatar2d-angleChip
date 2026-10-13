/**
 * CodeFirstSchema (Infrastructure Layer - Database)
 * Declarative Code-First Model Definitions (similar to EF Core / TypeORM Entity metadata).
 * Specifies table structures, column types, default values, indexes, and constraints.
 */
const TABLES = {
  users: {
    tableName: 'users',
    columns: {
      id: { type: 'VARCHAR(50)', primaryKey: true, notNull: true },
      email: { type: 'VARCHAR(150)', unique: true, notNull: true },
      password: { type: 'VARCHAR(255)', notNull: true },
      phone: { type: 'VARCHAR(20)', unique: true, null: true },
      role: { type: "ENUM('USER', 'ADMIN')", notNull: true, default: "'USER'" },
      status: { type: "ENUM('ACTIVE', 'INACTIVE', 'BANNED')", notNull: true, default: "'ACTIVE'" },
      last_login_at: { type: 'DATETIME', null: true },
      created_at: { type: 'TIMESTAMP', default: 'CURRENT_TIMESTAMP' },
      updated_at: { type: 'TIMESTAMP', default: 'CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP' }
    },
    indexes: [
      { name: 'idx_users_email', columns: ['email'] },
      { name: 'idx_users_phone', columns: ['phone'] },
      { name: 'idx_users_role', columns: ['role'] }
    ]
  },

  bot_files: {
    tableName: 'bot_files',
    columns: {
      id: { type: 'VARCHAR(50)', primaryKey: true, notNull: true },
      name: { type: 'VARCHAR(150)', notNull: true },
      game_jar: { type: 'VARCHAR(150)', notNull: true, default: "'avatar_fish_build40.jar'" },
      mod_type: { type: "ENUM('UPXU', 'FISH', 'CHIPMIX')", notNull: true, default: "'UPXU'" },
      app_id: { type: 'VARCHAR(100)', notNull: true },
      max_accounts: { type: 'INT', notNull: true, default: 6 },
      is_default: { type: 'BOOLEAN', notNull: true, default: 0 },
      proxy_config: { type: 'JSON', null: true },
      created_at: { type: 'TIMESTAMP', default: 'CURRENT_TIMESTAMP' },
      updated_at: { type: 'TIMESTAMP', default: 'CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP' }
    },
    indexes: [
      { name: 'idx_bot_files_mod_type', columns: ['mod_type'] },
      { name: 'idx_bot_files_is_default', columns: ['is_default'] }
    ]
  },

  proxies: {
    tableName: 'proxies',
    columns: {
      id: { type: 'VARCHAR(50)', primaryKey: true, notNull: true },
      name: { type: 'VARCHAR(150)', notNull: true },
      host: { type: 'VARCHAR(150)', notNull: true },
      port: { type: 'INT', notNull: true },
      username: { type: 'VARCHAR(100)', notNull: true, default: "''" },
      password: { type: 'VARCHAR(255)', notNull: true, default: "''" },
      type: { type: "ENUM('SOCKS5', 'HTTP')", notNull: true, default: "'SOCKS5'" },
      is_active: { type: 'BOOLEAN', notNull: true, default: 1 },
      is_expired: { type: 'BOOLEAN', notNull: true, default: 0 },
      latency_ms: { type: 'INT', null: true },
      fail_count: { type: 'INT', notNull: true, default: 0 },
      last_checked: { type: 'DATETIME', null: true },
      created_at: { type: 'TIMESTAMP', default: 'CURRENT_TIMESTAMP' },
      updated_at: { type: 'TIMESTAMP', default: 'CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP' }
    },
    indexes: [
      { name: 'idx_proxies_status', columns: ['is_active', 'is_expired'] },
      { name: 'idx_proxies_host_port', columns: ['host', 'port'] }
    ]
  },

  accounts: {
    tableName: 'accounts',
    columns: {
      id: { type: 'VARCHAR(50)', primaryKey: true, notNull: true },
      user_id: { type: 'VARCHAR(50)', null: true },
      username: { type: 'VARCHAR(100)', notNull: true },
      password: { type: 'VARCHAR(255)', notNull: true, default: "''" },
      server_id: { type: 'TINYINT', notNull: true, default: 0 },
      server_name: { type: 'VARCHAR(50)', notNull: true, default: "'Hoàn Mỹ'" },
      file_id: { type: 'VARCHAR(50)', notNull: true },
      proxy_id: { type: 'VARCHAR(50)', null: true },
      note: { type: 'TEXT', null: true },
      ip_slot: { type: 'INT', notNull: true, default: 1 },
      app_id: { type: 'VARCHAR(100)', null: true },
      target_coins: { type: 'BIGINT', notNull: true, default: 0 },
      up_days: { type: 'INT', notNull: true, default: 0 },
      pending_reset: { type: 'BOOLEAN', notNull: true, default: 0 },
      farm_settings: { type: 'JSON', null: true },
      diamond_settings: { type: 'JSON', null: true },
      fish_settings: { type: 'JSON', null: true },
      sell_ore_settings: { type: 'JSON', null: true },
      created_at: { type: 'TIMESTAMP', default: 'CURRENT_TIMESTAMP' },
      updated_at: { type: 'TIMESTAMP', default: 'CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP' }
    },
    indexes: [
      { name: 'idx_accounts_user_id', columns: ['user_id'] },
      { name: 'idx_accounts_file_id', columns: ['file_id'] },
      { name: 'idx_accounts_proxy_id', columns: ['proxy_id'] },
      { name: 'idx_accounts_server_id', columns: ['server_id'] },
      { name: 'idx_accounts_username', columns: ['username'] },
      { name: 'idx_accounts_file_server', columns: ['file_id', 'server_id'] }
    ],
    foreignKeys: [
      { name: 'fk_accounts_user', column: 'user_id', refTable: 'users', refColumn: 'id', onDelete: 'SET NULL' },
      { name: 'fk_accounts_file', column: 'file_id', refTable: 'bot_files', refColumn: 'id', onDelete: 'CASCADE' },
      { name: 'fk_accounts_proxy', column: 'proxy_id', refTable: 'proxies', refColumn: 'id', onDelete: 'SET NULL' }
    ]
  },

  system_settings: {
    tableName: 'system_settings',
    columns: {
      setting_key: { type: 'VARCHAR(100)', primaryKey: true, notNull: true },
      setting_value: { type: 'LONGTEXT', notNull: true },
      description: { type: 'VARCHAR(255)', null: true },
      updated_at: { type: 'TIMESTAMP', default: 'CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP' }
    },
    indexes: []
  }
};

module.exports = {
  TABLES
};
