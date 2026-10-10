/**
 * Account Entity (Domain Layer)
 * Represents an Avatar Game Account with business validation.
 */
class Account {
  constructor({
    id,
    username,
    password = '',
    serverId = 0,
    serverName = 'Hoàn Mỹ',
    fileId = 'file_1',
    proxyId = null,
    note = '',
    appId = null,
    targetCoins = 0,
    upDays = 0,
    pendingReset = false,
    farmSettings = null,
    diamondSettings = null,
    fishSettings = null,
    sellOreSettings = null,
    ipSlot = 1
  }) {
    this.id = id || `acc_${Date.now()}_${Math.random().toString(36).substr(2, 4)}`;
    this.username = (username || '').trim();
    this.password = password || '';
    this.serverId = parseInt(serverId !== undefined ? serverId : 0, 10) === 1 ? 1 : 0;
    this.serverName = this.serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    this.fileId = fileId || 'file_1';
    this.proxyId = proxyId || null;
    this.note = (note || '').trim();
    this.ipSlot = Math.max(1, parseInt(ipSlot || 1, 10));
    this.appId = appId || `avatar_${this.username || this.id}`;
    this.targetCoins = parseInt(targetCoins || 0, 10);
    this.upDays = parseInt(upDays || 0, 10);
    this.pendingReset = Boolean(pendingReset);
    this.farmSettings = farmSettings || {
      mode: 0,
      animal: 3,
      fish: 2,
      harvestHearts: true,
      dailyAttendance: true,
      deliverOrders: true,
      hatchDragon: true,
      trainDragon: true,
      noBuyWithGold: true,
      buyMilkWithGold: false,
      upgradeStarfruit: true,
      feedBaby: false,
      upgradeBaby: false,
      maxStarfruitLevel: 10,
      sellProducts: '-1',
      sellThreshold: 100,
      sellQuantity: 50,
      backupSeeds: '',
      replaceSeedThreshold: 0,
      backupDishes: ''
    };
    this.diamondSettings = diamondSettings || {
      sellOreOnFull: true,
      autoFarm: true,
      autoDropKcx: false,
      autoDropNhb: false,
      farmIntervalMinutes: 60,
      harvestOnTime: true,
      priorityOrder: 6
    };
    this.fishSettings = fishSettings || {
      mapType: 0,
      rodType: 0,
      sellFishType: 0,
      autoBuyTicket: true,
      backToFarm: true,
      farmIntervalMinutes: 30,
      harvestOnTime: true,
      sellKcx: false,
      sellKcxThreshold: 5,
      excludeFish: ''
    };
    this.sellOreSettings = sellOreSettings || {
      sellIntervalMinutes: 15,
      delayMs: 100,
      zoneFrom: 20,
      zoneTo: 79,
      resetTimeOnNhb: true,
      resetTimeOnKcx: false,
      dropNhbIfFailed: true,
      dropKcxIfFailed: true
    };
  }

  validate() {
    if (!this.username) {
      throw new Error('Tên tài khoản không được để trống!');
    }
    if (this.serverId !== 0 && this.serverId !== 1) {
      throw new Error('Server không hợp lệ (0: Hoàn Mỹ, 1: Diệu Kỳ)!');
    }
  }

  toPublicJson() {
    return {
      id: this.id,
      username: this.username,
      password: this.password ? '******' : '',
      serverId: this.serverId,
      serverName: this.serverName,
      fileId: this.fileId,
      proxyId: this.proxyId,
      note: this.note,
      ipSlot: this.ipSlot,
      appId: this.appId,
      targetCoins: this.targetCoins,
      upDays: this.upDays,
      pendingReset: this.pendingReset,
      farmSettings: this.farmSettings,
      diamondSettings: this.diamondSettings,
      fishSettings: this.fishSettings,
      sellOreSettings: this.sellOreSettings
    };
  }

  toPersistenceJson() {
    return {
      id: this.id,
      username: this.username,
      password: this.password,
      serverId: this.serverId,
      fileId: this.fileId,
      proxyId: this.proxyId,
      note: this.note,
      ipSlot: this.ipSlot,
      appId: this.appId,
      targetCoins: this.targetCoins,
      upDays: this.upDays,
      pendingReset: this.pendingReset,
      farmSettings: this.farmSettings,
      diamondSettings: this.diamondSettings,
      fishSettings: this.fishSettings,
      sellOreSettings: this.sellOreSettings
    };
  }
}

module.exports = Account;

