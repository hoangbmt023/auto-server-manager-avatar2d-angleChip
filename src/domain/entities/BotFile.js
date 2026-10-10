/**
 * BotFile Entity (Domain Layer)
 * Represents a Bot Profile/File with JAR configuration.
 */
class BotFile {
  constructor({
    id,
    name,
    gameJar = 'avatar_fish_build40.jar',
    modType = null,
    appId = null,
    proxy = {},
    maxAccounts = 6
  }) {
    this.id = id || `file_${Date.now()}`;
    this.name = (name || '').trim();
    this.gameJar = gameJar || 'avatar_fish_build40.jar';
    this.maxAccounts = Math.max(6, parseInt(maxAccounts || 6, 10));
    if (modType === 'chipmix' || modType === 'fish' || modType === 'upxu') {
      this.modType = modType;
    } else {
      const jLower = (this.gameJar || '').toLowerCase();
      if (jLower.includes('chip') || jLower.includes('mix')) {
        this.modType = 'chipmix';
      } else if (jLower.includes('fish') || jLower.includes('cauca') || jLower.includes('cau_ca')) {
        this.modType = 'fish';
      } else {
        this.modType = 'upxu';
      }
    }
    this.appId = appId || `avatar_${this.id}`;
    this.proxy = {
      enabled: Boolean(proxy && proxy.enabled),
      type: (proxy && proxy.type === 'http') ? 'http' : 'socks',
      host: (proxy && proxy.host ? String(proxy.host).trim() : ''),
      port: (proxy && proxy.port ? String(proxy.port).trim() : ''),
      username: (proxy && proxy.username ? String(proxy.username).trim() : ''),
      password: (proxy && proxy.password ? String(proxy.password).trim() : '')
    };
  }

  validate() {
    if (!this.name) {
      throw new Error('Tên File/Profile không được để trống!');
    }
  }

  toPublicJson(stats = {}) {
    const totalIps = Math.max(1, Math.ceil(this.maxAccounts / 6));
    const maxPerServer = totalIps * 3;

    return {
      id: this.id,
      name: this.name,
      gameJar: this.gameJar,
      modType: this.modType,
      appId: this.appId,
      proxy: this.proxy,
      maxAccounts: this.maxAccounts,
      totalIps: totalIps,
      totalAccounts: stats.totalAccounts || 0,
      hmCount: stats.hmCount || 0,
      dkCount: stats.dkCount || 0,
      runningCount: stats.runningCount || 0,
      runningHmCount: stats.runningHmCount || 0,
      runningDkCount: stats.runningDkCount || 0,
      maxTotal: this.maxAccounts,
      maxPerServer: maxPerServer
    };
  }

  toPersistenceJson() {
    return {
      id: this.id,
      name: this.name,
      gameJar: this.gameJar,
      modType: this.modType,
      appId: this.appId,
      proxy: this.proxy,
      maxAccounts: this.maxAccounts
    };
  }
}

module.exports = BotFile;
