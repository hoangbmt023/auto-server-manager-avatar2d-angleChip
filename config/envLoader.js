const fs = require('fs');
const path = require('path');

/**
 * Environment File Loader (Zero-Dependency)
 * Discovers and loads the appropriate .env file based on NODE_ENV.
 * Priority: .env.<NODE_ENV> -> .env.local -> .env
 */
class EnvLoader {
  constructor() {
    this.loadedEnvFile = null;
    this.rootDir = path.resolve(__dirname, '../');
  }

  load() {
    const nodeEnv = process.env.NODE_ENV || 'development';
    process.env.NODE_ENV = nodeEnv;

    const envFiles = [
      { path: path.join(this.rootDir, `.env.${nodeEnv}`), name: `.env.${nodeEnv}` },
      { path: path.join(this.rootDir, '.env.local'), name: '.env.local' },
      { path: path.join(this.rootDir, '.env'), name: '.env' }
    ];

    for (const envItem of envFiles) {
      if (fs.existsSync(envItem.path)) {
        try {
          const content = fs.readFileSync(envItem.path, 'utf8');
          const lines = content.split(/\r?\n/);

          for (const line of lines) {
            const trimmed = line.trim();
            if (!trimmed || trimmed.startsWith('#')) continue;

            const eqIdx = trimmed.indexOf('=');
            if (eqIdx <= 0) continue;

            const key = trimmed.slice(0, eqIdx).trim();
            let val = trimmed.slice(eqIdx + 1).trim();

            // Strip surrounding quotes
            if ((val.startsWith('"') && val.endsWith('"')) || (val.startsWith("'") && val.endsWith("'"))) {
              val = val.slice(1, -1);
            }

            if (process.env[key] === undefined) {
              process.env[key] = val;
            }
          }

          if (!this.loadedEnvFile) {
            this.loadedEnvFile = envItem.name;
          }
        } catch (err) {
          console.warn(`⚠️ [EnvLoader] Không thể nạp file env [${envItem.name}]:`, err.message);
        }
      }
    }

    return this.loadedEnvFile || 'System Environment';
  }

  getLoadedFile() {
    return this.loadedEnvFile || 'System Environment';
  }
}

const envLoaderInstance = new EnvLoader();
envLoaderInstance.load();

module.exports = envLoaderInstance;
