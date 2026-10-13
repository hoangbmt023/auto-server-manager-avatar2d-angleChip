const { defineConfig } = require('drizzle-kit');
const config = require('./index');

/**
 * Drizzle ORM CLI Configuration
 * Located in config/ directory.
 * Used by: npm run db:push, npm run db:generate, npm run db:studio
 */
module.exports = defineConfig({
  schema: './src/infrastructure/database/drizzleSchema.js',
  out: './drizzle',
  dialect: 'mysql',
  dbCredentials: {
    host: config.db.host,
    port: config.db.port,
    user: config.db.user,
    password: config.db.password,
    database: config.db.database
  }
});
