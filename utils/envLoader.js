const fs = require('fs');
const path = require('path');

/**
 * Lightweight Zero-Dependency Environment Loader
 * Loads .env.<NODE_ENV> or .env into process.env automatically.
 */
let loadedEnvFile = null;

function loadEnv() {
  const rootDir = path.resolve(__dirname, '../');
  const nodeEnv = process.env.NODE_ENV || 'development';
  process.env.NODE_ENV = nodeEnv;

  const envFiles = [
    { path: path.join(rootDir, `.env.${nodeEnv}`), name: `.env.${nodeEnv}` },
    { path: path.join(rootDir, '.env.local'), name: '.env.local' },
    { path: path.join(rootDir, '.env'), name: '.env' }
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
        if (!loadedEnvFile) {
          loadedEnvFile = envItem.name;
        }
      } catch (err) {
        console.warn(`⚠️ Không thể nạp file env [${envItem.name}]:`, err.message);
      }
    }
  }
}

loadEnv();

module.exports = {
  loadEnv,
  getLoadedEnvFile: () => loadedEnvFile || 'Mặc định (System Env)',
  getNodeEnv: () => process.env.NODE_ENV || 'development'
};
