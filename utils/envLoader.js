/**
 * Legacy Environment Loader wrapper
 * Re-exports the centralized configuration loader in src/config/envLoader.js
 */
const envLoader = require('../src/config/envLoader');
const env = require('../src/config/env');

module.exports = {
  loadEnv: () => envLoader.load(),
  getLoadedEnvFile: () => envLoader.getLoadedFile(),
  getNodeEnv: () => env.nodeEnv
};
