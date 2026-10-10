const Account = require('../../domain/entities/Account');
const ServerLimitRule = require('../../domain/rules/ServerLimitRule');
const RmsWriter = require('../../infrastructure/storage/RmsWriter');

/**
 * AccountService (Application Layer)
 * Manages Account CRUD and business logic validation.
 */
class AccountService {
  constructor(configRepo, multiBotManager) {
    this.configRepo = configRepo;
    this.multiBotManager = multiBotManager;
  }

  getAccounts(fileId = null) {
    const config = this.configRepo.get();
    const accounts = (config.accounts || []).map(a => new Account(a).toPublicJson());
    const runningStatuses = this.multiBotManager.getAllStatuses();

    return accounts.map(acc => {
      const runningInfo = runningStatuses.instances[acc.id] || null;
      return {
        ...acc,
        isRunning: Boolean(runningInfo && runningInfo.running),
        runningPid: runningInfo ? runningInfo.pid : null,
        uptimeSeconds: runningInfo ? runningInfo.uptimeSeconds : 0,
        accountState: runningInfo ? (runningInfo.accountState || { state: 'online', message: 'Đang Treo Online', isError: false }) : { state: 'offline', message: 'Đang tắt', isError: false },
        autoState: runningInfo ? (runningInfo.autoState || { isRunning: false, autoType: null, status: 'idle', message: '' }) : { isRunning: false, autoType: null, status: 'idle', message: '' },
        stats: runningInfo ? runningInfo.stats : {
          coins: 0,
          gold: 0,
          lockedGold: 0,
          targetCoins: 0,
          earnedCoins: 0,
          collectedHearts: 0,
          startedAt: '--',
          expiresAt: 'Vĩnh viễn'
        }
      };
    });
  }

  saveAccount(data) {
    const config = this.configRepo.get();
    if (!config.accounts) config.accounts = [];

    const account = new Account(data);
    account.validate();

    const targetFileId = account.fileId || config.activeFileId || 'file_1';
    account.fileId = targetFileId;

    // Validate account limits within the file and IP/Proxy
    const targetFile = (config.botFiles || []).find(f => f.id === targetFileId);
    const maxAccounts = targetFile ? (targetFile.maxAccounts || 6) : 6;
    const accountsInFile = config.accounts.filter(a => a.fileId === targetFileId);
    const proxyObj = account.proxyId ? (config.proxies || []).find(p => p.id === account.proxyId) : null;
    const proxyName = proxyObj ? proxyObj.name : '';
    ServerLimitRule.validateAccountAddition(accountsInFile, account.serverId, data.id || null, account.proxyId || null, maxAccounts, proxyName);

    const existingIndex = config.accounts.findIndex(a => a.id === account.id);
    if (existingIndex !== -1) {
      // Keep existing password if not updated
      if (!data.password || data.password === '******') {
        account.password = config.accounts[existingIndex].password;
      }
      config.accounts[existingIndex] = account.toPersistenceJson();
    } else {
      config.accounts.push(account.toPersistenceJson());
    }

    if (!config.activeAccountId) {
      config.activeAccountId = account.id;
    }

    this.configRepo.save(config);

    // If account was already running online, automatically restart with new configuration
    const wasRunning = this.multiBotManager.isAccountRunning(account.id);
    if (wasRunning) {
      this.multiBotManager.stopAccount(account.id);
      setTimeout(async () => {
        try {
          await this.multiBotManager.startAccount(account.id);
        } catch (e) {}
      }, 1200);
    }

    return account.toPublicJson();
  }

  deleteAccount(accountId) {
    const config = this.configRepo.get();
    if (!config.accounts) return false;

    // Stop bot if running
    this.multiBotManager.stopAccount(accountId);

    config.accounts = config.accounts.filter(a => a.id !== accountId);
    if (config.activeAccountId === accountId) {
      config.activeAccountId = config.accounts.length > 0 ? config.accounts[0].id : null;
    }

    this.configRepo.save(config);
    return true;
  }

  switchServer(accountId, newServerId) {
    const config = this.configRepo.get();
    const targetAcc = (config.accounts || []).find(a => a.id === accountId);
    if (!targetAcc) {
      throw new Error(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    const sId = parseInt(newServerId !== undefined ? newServerId : (targetAcc.serverId === 0 ? 1 : 0), 10) === 1 ? 1 : 0;
    const serverName = sId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';

    const targetFileId = targetAcc.fileId || config.activeFileId || 'file_1';
    const otherAccsInFile = (config.accounts || []).filter(a => a.fileId === targetFileId && a.id !== accountId);
    const serverCount = otherAccsInFile.filter(a => parseInt(a.serverId, 10) === sId).length;

    if (serverCount >= ServerLimitRule.MAX_PER_SERVER) {
      throw new Error(`❌ Server [${serverName}] trong file này đã đủ ${ServerLimitRule.MAX_PER_SERVER} tài khoản!`);
    }

    targetAcc.serverId = sId;
    targetAcc.serverName = serverName;
    this.configRepo.save(config);

    // If running, restart the bot with the new server
    const wasRunning = this.multiBotManager.isAccountRunning(accountId);
    if (wasRunning) {
      this.multiBotManager.stopAccount(accountId);
      setTimeout(async () => {
        try {
          await this.multiBotManager.startAccount(accountId);
        } catch (e) {}
      }, 1500);
    }

    return targetAcc;
  }

  updateSetup(accountId, { targetCoins, upDays, farmSettings, diamondSettings, fishSettings, sellOreSettings }) {
    const config = this.configRepo.get();
    const targetAcc = (config.accounts || []).find(a => a.id === accountId);
    if (!targetAcc) {
      throw new Error(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    if (targetCoins !== undefined && targetCoins !== null && targetCoins !== '') {
      targetAcc.targetCoins = Math.max(0, parseInt(targetCoins, 10) || 0);
    }
    if (upDays !== undefined && upDays !== null && upDays !== '') {
      targetAcc.upDays = Math.max(0, parseInt(upDays, 10) || 0);
    }
    if (farmSettings !== undefined && farmSettings !== null && typeof farmSettings === 'object') {
      targetAcc.farmSettings = {
        ...(targetAcc.farmSettings || {}),
        ...farmSettings
      };
    }
    if (diamondSettings !== undefined && diamondSettings !== null && typeof diamondSettings === 'object') {
      targetAcc.diamondSettings = {
        ...(targetAcc.diamondSettings || {}),
        ...diamondSettings
      };
    }
    if (fishSettings !== undefined && fishSettings !== null && typeof fishSettings === 'object') {
      targetAcc.fishSettings = {
        ...(targetAcc.fishSettings || {}),
        ...fishSettings
      };
    }
    if (sellOreSettings !== undefined && sellOreSettings !== null && typeof sellOreSettings === 'object') {
      targetAcc.sellOreSettings = {
        ...(targetAcc.sellOreSettings || {}),
        ...sellOreSettings
      };
    }
    this.configRepo.save(config);

    // Immediate synchronization to disk RMS files
    if (targetCoins !== undefined || upDays !== undefined) {
      RmsWriter.writeUpThueRms(targetAcc, { targetCoins: targetAcc.targetCoins, upDays: targetAcc.upDays }, targetAcc.fileId || config.activeFileId);
    }
    if (farmSettings !== undefined) {
      RmsWriter.writeFarmRms(targetAcc, targetAcc.farmSettings, targetAcc.fileId || config.activeFileId);
    }
    if (diamondSettings !== undefined) {
      RmsWriter.writeDiamondRms(targetAcc, targetAcc.diamondSettings, targetAcc.fileId || config.activeFileId);
    }
    if (fishSettings !== undefined) {
      RmsWriter.writeFishRms(targetAcc, targetAcc.fishSettings, targetAcc.fileId || config.activeFileId);
    }
    if (sellOreSettings !== undefined) {
      RmsWriter.writeSellOreRms(targetAcc, targetAcc.sellOreSettings, targetAcc.fileId || config.activeFileId);
    }

    // Apply directly to running bot process if active
    if (targetCoins !== undefined || upDays !== undefined) {
      this.multiBotManager.applySetupToBot(accountId, targetAcc.targetCoins || 0, targetAcc.upDays || 0);
    }
    if (farmSettings !== undefined) {
      this.multiBotManager.applyFarmSettingsToBot(accountId, targetAcc.farmSettings);
    }
    if (diamondSettings !== undefined) {
      this.multiBotManager.applyDiamondSettingsToBot(accountId, targetAcc.diamondSettings);
    }
    if (fishSettings !== undefined) {
      this.multiBotManager.applyFishSettingsToBot(accountId, targetAcc.fishSettings);
    }
    if (sellOreSettings !== undefined) {
      this.multiBotManager.applySellOreSettingsToBot(accountId, targetAcc.sellOreSettings);
    }

    return targetAcc;
  }

  resetData(accountId) {
    const config = this.configRepo.get();
    const targetAcc = (config.accounts || []).find(a => a.id === accountId);
    if (!targetAcc) {
      throw new Error(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    // Mark pending reset for next startup if offline
    targetAcc.pendingReset = true;
    targetAcc.targetCoins = 0;
    targetAcc.upDays = 0;
    this.configRepo.save(config);

    // Sync reset to RMS files
    RmsWriter.resetUpThueRms(targetAcc, targetAcc.fileId || config.activeFileId);

    // If bot process is currently running, send live reset command
    const isRunning = this.multiBotManager.isAccountRunning(accountId);
    if (isRunning) {
      this.multiBotManager.resetBotData(accountId);
    } else {
      // Offline: delete cached Data/Coin RMS files directly
      try {
        const fs = require('fs');
        const path = require('path');
        const safeAppId = `avatar_${targetAcc.username || targetAcc.id}_${targetAcc.fileId || 'def'}`;
        const rmsDir = path.resolve(__dirname, '../../../.microemulator', `suite-${safeAppId}`);
        if (fs.existsSync(rmsDir)) {
          const files = fs.readdirSync(rmsDir);
          for (const file of files) {
            if (file.toLowerCase().includes('data') || file.toLowerCase().includes('coin')) {
              try { fs.unlinkSync(path.join(rmsDir, file)); } catch (e) {}
            }
          }
        }
      } catch (e) {}
    }

    return { success: true, message: `Đã reset dữ liệu up thuê cho tài khoản [${targetAcc.username}].` };
  }
}

module.exports = AccountService;
