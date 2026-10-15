const {
  mysqlTable,
  varchar,
  text,
  int,
  tinyint,
  bigint,
  boolean,
  timestamp,
  datetime,
  mysqlEnum,
  json,
  index
} = require('drizzle-orm/mysql-core');
const { relations } = require('drizzle-orm');

/**
 * Drizzle ORM Schema (Code-First Table Definitions)
 * True Code-First Entity definitions for MySQL database.
 * Auto-synced with Drizzle Kit push and type-safe query builders.
 */

// 1. Users Table
const users = mysqlTable('users', {
  id: varchar('id', { length: 50 }).primaryKey(),
  email: varchar('email', { length: 150 }).notNull().unique(),
  password: varchar('password', { length: 255 }).notNull(),
  phone: varchar('phone', { length: 20 }),
  role: mysqlEnum('role', ['USER', 'ADMIN']).notNull().default('USER'),
  status: mysqlEnum('status', ['ACTIVE', 'INACTIVE', 'BANNED']).notNull().default('ACTIVE'),
  balance: bigint('balance', { mode: 'number' }).notNull().default(0),
  lastLoginAt: datetime('last_login_at'),
  createdAt: timestamp('created_at').defaultNow().notNull(),
  updatedAt: timestamp('updated_at').defaultNow().onUpdateNow()
}, (table) => [
  index('idx_users_email').on(table.email),
  index('idx_users_phone').on(table.phone),
  index('idx_users_role').on(table.role)
]);

// 2. Bot Files Table
const botFiles = mysqlTable('bot_files', {
  id: varchar('id', { length: 50 }).primaryKey(),
  name: varchar('name', { length: 150 }).notNull(),
  gameJar: varchar('game_jar', { length: 150 }).notNull().default('avatar_fish_build40.jar'),
  modType: mysqlEnum('mod_type', ['UPXU', 'FISH', 'CHIPMIX']).notNull().default('UPXU'),
  appId: varchar('app_id', { length: 100 }).notNull(),
  maxAccounts: int('max_accounts').notNull().default(6),
  isDefault: boolean('is_default').notNull().default(false),
  proxyConfig: json('proxy_config'),
  createdAt: timestamp('created_at').defaultNow().notNull(),
  updatedAt: timestamp('updated_at').defaultNow().onUpdateNow()
}, (table) => [
  index('idx_bot_files_mod_type').on(table.modType),
  index('idx_bot_files_is_default').on(table.isDefault)
]);

// 3. Proxies Table
const proxies = mysqlTable('proxies', {
  id: varchar('id', { length: 50 }).primaryKey(),
  name: varchar('name', { length: 150 }).notNull(),
  host: varchar('host', { length: 150 }).notNull(),
  port: int('port').notNull(),
  username: varchar('username', { length: 100 }).notNull().default(''),
  password: varchar('password', { length: 255 }).notNull().default(''),
  type: mysqlEnum('type', ['SOCKS5', 'HTTP']).notNull().default('SOCKS5'),
  isActive: boolean('is_active').notNull().default(true),
  isExpired: boolean('is_expired').notNull().default(false),
  latencyMs: int('latency_ms'),
  failCount: int('fail_count').notNull().default(0),
  lastChecked: datetime('last_checked'),
  createdAt: timestamp('created_at').defaultNow().notNull(),
  updatedAt: timestamp('updated_at').defaultNow().onUpdateNow()
}, (table) => [
  index('idx_proxies_status').on(table.isActive, table.isExpired),
  index('idx_proxies_host_port').on(table.host, table.port)
]);

// 4. Accounts Table
const accounts = mysqlTable('accounts', {
  id: varchar('id', { length: 50 }).primaryKey(),
  userId: varchar('user_id', { length: 50 }),
  username: varchar('username', { length: 100 }).notNull(),
  password: varchar('password', { length: 255 }).notNull().default(''),
  serverId: tinyint('server_id').notNull().default(0),
  serverName: varchar('server_name', { length: 50 }).notNull().default('Hoàn Mỹ'),
  fileId: varchar('file_id', { length: 50 }).notNull(),
  proxyId: varchar('proxy_id', { length: 50 }),
  note: text('note'),
  ipSlot: int('ip_slot').notNull().default(1),
  appId: varchar('app_id', { length: 100 }),
  targetCoins: bigint('target_coins', { mode: 'number' }).notNull().default(0),
  upDays: int('up_days').notNull().default(0),
  pendingReset: boolean('pending_reset').notNull().default(false),
  rentalExpiresAt: datetime('rental_expires_at'),
  rentalPlan: varchar('rental_plan', { length: 50 }).notNull().default('UPXU'),
  farmSettings: json('farm_settings'),
  diamondSettings: json('diamond_settings'),
  fishSettings: json('fish_settings'),
  sellOreSettings: json('sell_ore_settings'),
  createdAt: timestamp('created_at').defaultNow().notNull(),
  updatedAt: timestamp('updated_at').defaultNow().onUpdateNow()
}, (table) => [
  index('idx_accounts_user_id').on(table.userId),
  index('idx_accounts_file_id').on(table.fileId),
  index('idx_accounts_proxy_id').on(table.proxyId),
  index('idx_accounts_server_id').on(table.serverId),
  index('idx_accounts_username').on(table.username),
  index('idx_accounts_file_server').on(table.fileId, table.serverId),
  index('idx_accounts_rental_expires').on(table.rentalExpiresAt)
]);

// 5. Transactions Table
const transactions = mysqlTable('transactions', {
  id: varchar('id', { length: 50 }).primaryKey(),
  userId: varchar('user_id', { length: 50 }).notNull(),
  type: mysqlEnum('type', ['TOPUP', 'RENTAL', 'RENEWAL', 'REFUND']).notNull().default('TOPUP'),
  amount: bigint('amount', { mode: 'number' }).notNull().default(0),
  balanceBefore: bigint('balance_before', { mode: 'number' }).notNull().default(0),
  balanceAfter: bigint('balance_after', { mode: 'number' }).notNull().default(0),
  description: text('description'),
  voucherCode: varchar('voucher_code', { length: 50 }),
  status: mysqlEnum('status', ['SUCCESS', 'PENDING', 'FAILED']).notNull().default('SUCCESS'),
  createdAt: timestamp('created_at').defaultNow().notNull()
}, (table) => [
  index('idx_transactions_user_id').on(table.userId),
  index('idx_transactions_type').on(table.type),
  index('idx_transactions_created_at').on(table.createdAt)
]);

// 6. Vouchers Table
const vouchers = mysqlTable('vouchers', {
  id: varchar('id', { length: 50 }).primaryKey(),
  code: varchar('code', { length: 50 }).notNull().unique(),
  discountPercent: int('discount_percent').notNull().default(0),
  discountAmount: bigint('discount_amount', { mode: 'number' }).notNull().default(0),
  minOrder: bigint('min_order', { mode: 'number' }).notNull().default(0),
  maxUses: int('max_uses').notNull().default(100),
  usedCount: int('used_count').notNull().default(0),
  expiresAt: datetime('expires_at'),
  isActive: boolean('is_active').notNull().default(true),
  createdAt: timestamp('created_at').defaultNow().notNull()
}, (table) => [
  index('idx_vouchers_code').on(table.code),
  index('idx_vouchers_active').on(table.isActive)
]);

// 7. System Settings Table
const systemSettings = mysqlTable('system_settings', {
  settingKey: varchar('setting_key', { length: 100 }).primaryKey(),
  settingValue: text('setting_value').notNull(),
  description: varchar('description', { length: 255 }),
  updatedAt: timestamp('updated_at').defaultNow().onUpdateNow()
});

// 8. Refresh Tokens Table (Secure Session & Token Rotation Store)
const refreshTokens = mysqlTable('refresh_tokens', {
  id: varchar('id', { length: 50 }).primaryKey(),
  userId: varchar('user_id', { length: 50 }).notNull(),
  tokenHash: varchar('token_hash', { length: 64 }).notNull(),
  expiresAt: datetime('expires_at').notNull(),
  revokedAt: datetime('revoked_at'),
  createdAt: timestamp('created_at').defaultNow().notNull()
}, (table) => [
  index('idx_refresh_tokens_user_id').on(table.userId),
  index('idx_refresh_tokens_token_hash').on(table.tokenHash)
]);

// Relations Definitions
const usersRelations = relations(users, ({ many }) => ({
  accounts: many(accounts),
  transactions: many(transactions),
  refreshTokens: many(refreshTokens)
}));

const transactionsRelations = relations(transactions, ({ one }) => ({
  user: one(users, {
    fields: [transactions.userId],
    references: [users.id]
  })
}));

const refreshTokensRelations = relations(refreshTokens, ({ one }) => ({
  user: one(users, {
    fields: [refreshTokens.userId],
    references: [users.id]
  })
}));

const botFilesRelations = relations(botFiles, ({ many }) => ({
  accounts: many(accounts)
}));

const proxiesRelations = relations(proxies, ({ many }) => ({
  accounts: many(accounts)
}));

const accountsRelations = relations(accounts, ({ one }) => ({
  user: one(users, {
    fields: [accounts.userId],
    references: [users.id]
  }),
  botFile: one(botFiles, {
    fields: [accounts.fileId],
    references: [botFiles.id]
  }),
  proxy: one(proxies, {
    fields: [accounts.proxyId],
    references: [proxies.id]
  })
}));

module.exports = {
  users,
  botFiles,
  proxies,
  accounts,
  transactions,
  vouchers,
  systemSettings,
  refreshTokens,
  usersRelations,
  transactionsRelations,
  refreshTokensRelations,
  botFilesRelations,
  proxiesRelations,
  accountsRelations
};

