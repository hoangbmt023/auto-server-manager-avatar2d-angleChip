const fs = require('fs');
const path = require('path');

/**
 * Lightweight Zero-Dependency Environment Loader
 * Loads .env.<NODE_ENV> or .env into process.env automatically.
 */
function loadEnv() {
  const rootDir = path.resolve(__dirname, '../');
  const nodeEnv = process.env.NODE_ENV || 'development';

  const envFiles = [
    path.join(rootDir, `.env.${nodeEnv}`),
    path.join(rootDir, '.env.local'),
    path.join(rootDir, '.env')
  ];

  for (const file of envFiles) {
    if (fs.existsSync(file)) {
      try {
        const content = fs.readFileSync(file, 'utf8');
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
      } catch (err) {
        console.warn(`⚠️ Không thể nạp file env [${file}]:`, err.message);
      }
    }
  }
}

loadEnv();

module.exports = { loadEnv };
