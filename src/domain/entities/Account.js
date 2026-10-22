const { BadRequestException } = require('../errors');
const { uuidv7 } = require('../../shared/utils/uuid');

/**
 * Account Entity (Domain Layer)
 * Represents an Avatar Game Account with business validation.
 */
class Account {
  constructor({
    id,
    userId = null,
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
    ipSlot = 1,
    isEmergencySlot = false,
    rentalExpiresAt = null,
    rentalPlan = null,
    effectivePriceMonth = null,
    effective_price_month = null,
    deletedAt = null,
    deleted_at = null
  }) {
    this.id = id || uuidv7();
    this.userId = userId || null;
    this.username = (username || '').trim();
    this.password = password || '';
    this.serverId = parseInt(serverId !== undefined ? serverId : 0, 10) === 1 ? 1 : 0;
    this.serverName = this.serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    this.fileId = fileId || 'file_1';
    this.proxyId = proxyId || null;
    this.note = (note || '').trim();
    this.ipSlot = Math.max(1, parseInt(ipSlot || 1, 10));
    this.isEmergencySlot = Boolean(isEmergencySlot);
    this.appId = appId || `avatar_${this.username || this.id}`;
    this.targetCoins = parseInt(targetCoins || 0, 10);
    this.upDays = parseInt(upDays || 0, 10);
    this.pendingReset = Boolean(pendingReset);
    this.rentalExpiresAt = rentalExpiresAt ? new Date(rentalExpiresAt) : null;
    this.rentalPlan = rentalPlan ? String(rentalPlan).toUpperCase() : null;
    const rawPrice = effectivePriceMonth !== null && effectivePriceMonth !== undefined ? effectivePriceMonth : effective_price_month;
    this.effectivePriceMonth = rawPrice !== null && rawPrice !== undefined ? parseInt(rawPrice, 10) : null;
    const rawDeletedAt = deletedAt || deleted_at;
    this.deletedAt = rawDeletedAt ? new Date(rawDeletedAt) : null;
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
      throw new BadRequestException('Tên tài khoản không được để trống!');
    }
    if (this.serverId !== 0 && this.serverId !== 1) {
      throw new BadRequestException('Server không hợp lệ (0: Hoàn Mỹ, 1: Diệu Kỳ)!');
    }
  }

  isDeleted() {
    return Boolean(this.deletedAt);
  }

  isRentalExpired() {
    if (!this.rentalExpiresAt) return false;
    return this.rentalExpiresAt.getTime() < Date.now();
  }

  getDaysExpired() {
    if (!this.rentalExpiresAt) return 0;
    const diffMs = Date.now() - this.rentalExpiresAt.getTime();
    if (diffMs <= 0) return 0;
    return Math.floor(diffMs / (24 * 60 * 60 * 1000));
  }

  canTransferToNewUser() {
    return this.isDeleted() || (this.isRentalExpired() && this.getDaysExpired() >= 3);
  }

  getRentalRemainingMs() {
    if (!this.rentalExpiresAt) return null;
    return Math.max(0, this.rentalExpiresAt.getTime() - Date.now());
  }

  flipServer() {
    this.serverId = this.serverId === 0 ? 1 : 0;
    this.serverName = this.serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    return this.serverId;
  }

  resetBotConfigurations() {
    this.note = '';
    this.targetCoins = 0;
    this.upDays = 0;
    this.pendingReset = false;
    this.farmSettings = {
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
    this.diamondSettings = {
      sellOreOnFull: true,
      autoFarm: true,
      autoDropKcx: false,
      autoDropNhb: false,
      farmIntervalMinutes: 60,
      harvestOnTime: true,
      priorityOrder: 6
    };
    this.fishSettings = {
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
    this.sellOreSettings = {
      sellIntervalMinutes: 15,
      delayMs: 100,
      zoneFrom: 20,
      zoneTo: 79,
      resetTimeOnNhb: true,
      resetTimeOnKcx: false,
      dropNhbIfFailed: true,
      dropKcxIfFailed: true
    };
    this.effectivePriceMonth = null;
  }

  toPublicJson() {
    return {
      id: this.id,
      userId: this.userId,
      username: this.username,
      password: this.password ? '******' : '',
      serverId: this.serverId,
      serverName: this.serverName,
      fileId: this.fileId,
      proxyId: this.proxyId,
      note: this.note,
      ipSlot: this.ipSlot,
      isEmergencySlot: this.isEmergencySlot,
      appId: this.appId,
      targetCoins: this.targetCoins,
      upDays: this.upDays,
      pendingReset: this.pendingReset,
      rentalExpiresAt: this.rentalExpiresAt ? this.rentalExpiresAt.toISOString() : null,
      rentalPlan: this.rentalPlan,
      effectivePriceMonth: this.effectivePriceMonth,
      deletedAt: this.deletedAt ? this.deletedAt.toISOString() : null,
      isDeleted: this.isDeleted(),
      isExpired: this.isRentalExpired(),
      remainingMs: this.getRentalRemainingMs(),
      farmSettings: this.farmSettings,
      diamondSettings: this.diamondSettings,
      fishSettings: this.fishSettings,
      sellOreSettings: this.sellOreSettings
    };
  }

  toPersistenceJson() {
    return {
      id: this.id,
      userId: this.userId,
      username: this.username,
      password: this.password,
      serverId: this.serverId,
      server_name: this.serverName,
      fileId: this.fileId,
      proxyId: this.proxyId,
      note: this.note,
      ipSlot: this.ipSlot,
      is_emergency_slot: this.isEmergencySlot ? 1 : 0,
      appId: this.appId,
      targetCoins: this.targetCoins,
      upDays: this.upDays,
      pendingReset: this.pendingReset,
      rental_expires_at: this.rentalExpiresAt,
      rental_plan: this.rentalPlan,
      effective_price_month: this.effectivePriceMonth,
      deleted_at: this.deletedAt,
      farmSettings: this.farmSettings,
      diamondSettings: this.diamondSettings,
      fishSettings: this.fishSettings,
      sellOreSettings: this.sellOreSettings
    };
  }
}

module.exports = Account;

