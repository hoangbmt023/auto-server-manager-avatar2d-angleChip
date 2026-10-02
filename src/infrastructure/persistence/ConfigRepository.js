const fs = require('fs');
const path = require('path');
const { encrypt, decrypt } = require('../security/EncryptionService');

/**
 * ConfigRepository (Infrastructure Layer)
 * Manages atomic loading and saving of the system configuration.
 * Encrypts sensitive fields (passwords) on disk and auto-generates config.json from template if missing.
 */
class ConfigRepository {
  constructor(configFilePath = null) {
    this.workspaceRoot = path.resolve(__dirname, '../../../');
    this.configPath = configFilePath || path.resolve(this.workspaceRoot, 'config.json');
    this.exampleConfigPath = path.resolve(this.workspaceRoot, 'config.example.json');
    this._cachedConfig = null;
  }

  getDefaultConfig() {
    return {
      port: parseInt(process.env.PORT, 10) || 3001,
      password: '',
      emulatorJar: 'AngelChipEmulator_V2Proxy.jar',
      gameJar: 'avatar_fish_build40.jar',
      javaPath: '',
      rmsMode: process.env.DEFAULT_RMS_MODE || 'file',
      appId: process.env.DEFAULT_APP_ID || 'avatar_main',
      activeAccountId: null,
      runningAccountIds: [],
      autoRestart: true,
      autoStart: true,
      maxMemoryMb: parseInt(process.env.DEFAULT_MAX_MEMORY, 10) || 256,
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
          name: 'Auto up kim cương - Mặc định (IP Server)',
          gameJar: 'avatar_upxu_build34.jar',
          appId: 'avatar_file_1',
          isDefault: true,
          modType: 'upxu',
          proxy: {
            enabled: false,
            type: 'socks',
            host: '',
            port: '',
            username: '',
            password: ''
          }
        },
        {
          id: 'file_2',
          name: 'Auto up câu cá - Mặc định (IP Server)',
          gameJar: 'avatar_fish_build40.jar',
          appId: 'avatar_file_2',
          isDefault: false,
          modType: 'fish',
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
      activeFileId: 'file_1',
      proxies: []
    };
  }

  load() {
    try {
      if (fs.existsSync(this.configPath)) {
        const raw = fs.readFileSync(this.configPath, 'utf8');
        const parsed = JSON.parse(raw);
        this._cachedConfig = Object.assign(this.getDefaultConfig(), parsed);
      } else if (fs.existsSync(this.exampleConfigPath)) {
        // Auto-generate config.json from config.example.json template
        const rawExample = fs.readFileSync(this.exampleConfigPath, 'utf8');
        const parsedExample = JSON.parse(rawExample);
        this._cachedConfig = Object.assign(this.getDefaultConfig(), parsedExample);
        this.save(this._cachedConfig);
      } else {
        // Auto-generate fresh default config.json
        this._cachedConfig = this.getDefaultConfig();
        this.save(this._cachedConfig);
      }

      // Decrypt passwords in memory
      if (this._cachedConfig.password) {
        this._cachedConfig.password = decrypt(this._cachedConfig.password);
      }
      if (Array.isArray(this._cachedConfig.accounts)) {
        for (const acc of this._cachedConfig.accounts) {
          if (acc && acc.password) {
            acc.password = decrypt(acc.password);
          }
        }
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
      // Deep clone config to encrypt before persisting to disk
      const diskConfig = JSON.parse(JSON.stringify(this._cachedConfig));

      // Encrypt system password
      if (diskConfig.password) {
        diskConfig.password = encrypt(diskConfig.password);
      }

      // Encrypt account passwords
      if (Array.isArray(diskConfig.accounts)) {
        for (const acc of diskConfig.accounts) {
          if (acc && acc.password) {
            acc.password = encrypt(acc.password);
          }
        }
      }

      const data = JSON.stringify(diskConfig, null, 2);
      fs.writeFileSync(this.configPath, data, 'utf8');
      return true;
    } catch (err) {
      console.error('❌ [ConfigRepository] Không thể lưu config.json:', err.message);
      return false;
    }
  }
}

module.exports = ConfigRepository;
