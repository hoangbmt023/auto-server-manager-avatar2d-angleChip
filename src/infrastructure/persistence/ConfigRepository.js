const fs = require('fs');
const path = require('path');

/**
 * ConfigRepository (Infrastructure Layer)
 * Manages atomic loading and saving of the system configuration.
 */
class ConfigRepository {
  constructor(configFilePath = null) {
    this.configPath = configFilePath || path.resolve(__dirname, '../../../config.json');
    this._cachedConfig = null;
  }

  getDefaultConfig() {
    return {
      port: 3001,
      password: '',
      emulatorJar: 'AngelChipEmulator_V2Proxy.jar',
      gameJar: 'avatar_fish_build40.jar',
      javaPath: '',
      rmsMode: 'file',
      appId: 'avatar_main',
      activeAccountId: null,
      runningAccountIds: [],
      autoRestart: true,
      autoStart: true,
      maxMemoryMb: 256,
      extraArgs: [],
      servers: [
        { id: 0, name: 'Hoàn Mỹ' },
        { id: 1, name: 'Diệu Kỳ' }
      ],
      accounts: [],
      proxy: {
        enabled: false,
        type: 'socks',
        host: '',
        port: ''
      },
      botFiles: [
        {
          id: 'file_1',
          name: 'fish - Mặc định (IP Server)',
          gameJar: 'avatar_fish_build40.jar',
          appId: 'avatar_file_1',
          isDefault: true,
          proxy: {
            enabled: false,
            type: 'socks',
            host: '',
            port: '',
            username: '',
            password: ''
          }
        }
      ],
      activeFileId: 'file_1'
    };
  }

  load() {
    try {
      if (fs.existsSync(this.configPath)) {
        const raw = fs.readFileSync(this.configPath, 'utf8');
        const parsed = JSON.parse(raw);
        this._cachedConfig = Object.assign(this.getDefaultConfig(), parsed);
      } else {
        this._cachedConfig = this.getDefaultConfig();
        this.save(this._cachedConfig);
      }
    } catch (err) {
      console.error('⚠️ [ConfigRepository] Lỗi đọc config.json, dùng cấu hình mặc định:', err.message);
      this._cachedConfig = this.getDefaultConfig();
    }
    return this._cachedConfig;
  }

  get() {
    if (!this._cachedConfig) {
      return this.load();
    }
    return this._cachedConfig;
  }

  save(newConfig = null) {
    if (newConfig) {
      this._cachedConfig = newConfig;
    }
    try {
      const data = JSON.stringify(this._cachedConfig, null, 2);
      fs.writeFileSync(this.configPath, data, 'utf8');
      return true;
    } catch (err) {
      console.error('❌ [ConfigRepository] Không thể lưu config.json:', err.message);
      return false;
    }
  }
}

module.exports = ConfigRepository;
