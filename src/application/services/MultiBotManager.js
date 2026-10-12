const EventEmitter = require('events');
const SingleBotProcess = require('../../infrastructure/process/SingleBotProcess');
const JavaDetector = require('../../infrastructure/process/JavaDetector');
const ServerLimitRule = require('../../domain/rules/ServerLimitRule');
const ProxyChecker = require('../../infrastructure/network/ProxyChecker');
const ProcessRegistry = require('../../infrastructure/process/ProcessRegistry');
const CrossProcessBus = require('../../infrastructure/ipc/CrossProcessBus');
const StartBotAccountUseCase = require('../use-cases/bot/StartBotAccountUseCase');
const StopBotAccountUseCase = require('../use-cases/bot/StopBotAccountUseCase');

/**
 * MultiBotManager (Application Layer)
 * Manages concurrent bot instances across single or multiple cPanel lsnode workers.
 * Features Cross-Worker Process Registry, Shared IPC Bus, and OS PID Liveness Verification.
 */
class MultiBotManager extends EventEmitter {
  constructor(configRepo, sseEventBus) {
    super();
    this.configRepo = configRepo;
    this.sseEventBus = sseEventBus;
    this.runningBots = new Map(); // Local worker Map: accountId -> SingleBotProcess
    this.processRegistry = new ProcessRegistry();
    this.ipcBus = sseEventBus.getIpcBus ? sseEventBus.getIpcBus() : new CrossProcessBus();
    this.startBotUseCase = new StartBotAccountUseCase(this, this.configRepo, this.sseEventBus);
    this.stopBotUseCase = new StopBotAccountUseCase(this, this.configRepo, this.sseEventBus);

    // Listen to remote commands from other workers (e.g. Stop / Auto / Setup dispatched by Phone)
    this.ipcBus.on('remote-command', (cmd) => {
      if (!cmd || !cmd.accountId) return;
      if (this.runningBots.has(cmd.accountId)) {
        const botProcess = this.runningBots.get(cmd.accountId);
        if (cmd.action === 'stop') {
          this.stopAccount(cmd.accountId);
        } else if (cmd.action === 'auto') {
          const { autoType, action } = cmd.payload || {};
          botProcess.triggerAuto(autoType, action);
          try {
            const config = this.configRepo.get();
            const account = (config.accounts || []).find(a => a.id === cmd.accountId);
            if (account) {
              account.lastAutoType = (action === 'start') ? autoType : null;
              this.configRepo.save(config);
            }
          } catch (e) {}
        } else if (cmd.action === 'setup') {
          const { targetCoins, upDays } = cmd.payload || {};
          botProcess.applySetup(targetCoins, upDays);
        } else if (cmd.action === 'farmSettings') {
          botProcess.applyFarmSettings(cmd.payload);
        } else if (cmd.action === 'diamondSettings') {
          botProcess.applyDiamondSettings(cmd.payload);
        } else if (cmd.action === 'fishSettings') {
          botProcess.applyFishSettings(cmd.payload);
        } else if (cmd.action === 'sellOreSettings') {
          botProcess.applySellOreSettings(cmd.payload);
        } else if (cmd.action === 'resetData') {
          botProcess.resetData();
        }
      }
    });
  }

  isAccountRunning(accountId) {
    if (!accountId) return false;
    if (this.runningBots.has(accountId) && this.runningBots.get(accountId).getStatus().running) {
      return true;
    }
    return this.processRegistry.isAccountRunning(accountId);
  }

  getRunningAccounts() {
    const config = this.configRepo.get();
    const accounts = config.accounts || [];
    const activeRegistry = this.processRegistry.getActiveBots();
    const runningList = [];

    for (const acc of accounts) {
      if (this.runningBots.has(acc.id) && this.runningBots.get(acc.id).getStatus().running) {
        runningList.push(acc);
      } else if (activeRegistry[acc.id] && activeRegistry[acc.id].pid && ProcessRegistry.isPidAlive(activeRegistry[acc.id].pid)) {
        runningList.push(acc);
      }
    }
    return runningList;
  }

  getRunningBotsInFile(fileId) {
    return this.getRunningAccounts().filter(a => (a.fileId || 'file_1') === fileId);
  }

  async startAccount(accountId) {
    return this.startBotUseCase.execute(accountId);
  }

  stopAccount(accountId) {
    return this.stopBotUseCase.execute(accountId);
  }

  stopAll() {
    const config = this.configRepo.get();

    // 1. Stop all local processes
    for (const [accId, botProcess] of this.runningBots.entries()) {
      const acc = (config.accounts || []).find(a => a.id === accId);
      if (acc) acc.lastAutoType = null;
      botProcess.stop();
      this.processRegistry.unregister(accId);
    }
    this.runningBots.clear();

    // 2. Stop all remote processes in registry
    const activeBots = this.processRegistry.getActiveBots();
    for (const [accId, rec] of Object.entries(activeBots)) {
      const acc = (config.accounts || []).find(a => a.id === accId);
      if (acc) acc.lastAutoType = null;
      this.ipcBus.sendCommand(accId, 'stop');
      if (rec.pid) {
        ProcessRegistry.killPid(rec.pid, true);
      }
      this.processRegistry.unregister(accId);
    }

    this.configRepo.save(config);
    this.persistRunningState();

    this.sseEventBus.addLog({
      type: 'warn',
      text: '⏹️ Đã dừng tất cả các tiến trình bot đang chạy.'
    });

    this.sseEventBus.broadcast('bot-status-changed', {
      runningCount: 0
    });

    return { success: true, message: 'Đã dừng tất cả bot.' };
  }

  persistRunningState() {
    const config = this.configRepo.get();
    const runningAccs = this.getRunningAccounts();
    const runningIds = runningAccs.map(a => a.id);
    config.runningAccountIds = runningIds;
    config.botRunningState = runningIds.length > 0;
    this.configRepo.save(config);
  }

  async resumePreviousRunningBots() {
    const config = this.configRepo.get();
    if (!config.autoStart) return;

    const savedRunningIds = Array.isArray(config.runningAccountIds) ? config.runningAccountIds : [];
    if (savedRunningIds.length === 0 && config.activeAccountId && config.botRunningState) {
      savedRunningIds.push(config.activeAccountId);
    }

    if (savedRunningIds.length === 0) {
      console.log('⏹️ Không có nick nào đang ở trạng thái treo trước đó.');
      return;
    }

    console.log(`🤖 Tự động khôi phục treo ${savedRunningIds.length} tài khoản Avatar...`);
    for (const accId of savedRunningIds) {
      try {
        if (!this.isAccountRunning(accId)) {
          await this.startAccount(accId);
        }
      } catch (err) {
        console.error(`❌ Không thể khôi phục tài khoản [${accId}]:`, err.message);
      }
    }
  }

  applySetupToBot(accountId, targetCoins, upDays) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applySetup(targetCoins, upDays);
    } else if (this.processRegistry.isAccountRunning(accountId)) {
      return this.ipcBus.sendCommand(accountId, 'setup', { targetCoins, upDays });
    }
    return false;
  }

  applyFarmSettingsToBot(accountId, farmSettings) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applyFarmSettings(farmSettings);
    } else if (this.processRegistry.isAccountRunning(accountId)) {
      return this.ipcBus.sendCommand(accountId, 'farmSettings', farmSettings);
    }
    return false;
  }

  applyDiamondSettingsToBot(accountId, diamondSettings) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applyDiamondSettings(diamondSettings);
    } else if (this.processRegistry.isAccountRunning(accountId)) {
      return this.ipcBus.sendCommand(accountId, 'diamondSettings', diamondSettings);
    }
    return false;
  }

  applyFishSettingsToBot(accountId, fishSettings) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applyFishSettings(fishSettings);
    } else if (this.processRegistry.isAccountRunning(accountId)) {
      return this.ipcBus.sendCommand(accountId, 'fishSettings', fishSettings);
    }
    return false;
  }

  applySellOreSettingsToBot(accountId, sellOreSettings) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applySellOreSettings(sellOreSettings);
    } else if (this.processRegistry.isAccountRunning(accountId)) {
      return this.ipcBus.sendCommand(accountId, 'sellOreSettings', sellOreSettings);
    }
    return false;
  }

  triggerAuto(accountId, autoType = 'farm', action = 'start') {
    let friendlyName = 'Auto Farm';
    if (autoType === 'diamond' || autoType === 'kc') friendlyName = 'Auto Kim Cương';
    else if (autoType === 'fish') friendlyName = 'Auto Câu Cá';
    else if (autoType === 'sell_ore' || autoType === 'banda' || autoType === 'stone') friendlyName = 'Auto Bán Đá';

    let ok = false;
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      ok = botProcess.triggerAuto(autoType, action);
    } else if (this.processRegistry.isAccountRunning(accountId)) {
      ok = this.ipcBus.sendCommand(accountId, 'auto', { autoType, action });
    } else {
      return {
        success: false,
        message: 'Tài khoản chưa được bật (Hãy Treo Bot trước khi kích hoạt Auto)!'
      };
    }

    if (ok) {
      try {
        const config = this.configRepo.get();
        const account = (config.accounts || []).find(a => a.id === accountId);
        if (account) {
          let normType = autoType;
          if (autoType === 'kc') normType = 'diamond';
          else if (autoType === 'cc' || autoType === 'cau_ca') normType = 'fish';
          else if (autoType === 'banda' || autoType === 'stone' || autoType === 'bd') normType = 'sell_ore';

          account.lastAutoType = (action === 'start') ? normType : null;
          this.configRepo.save(config);
        }
      } catch (err) {
        console.error('Error saving lastAutoType:', err);
      }
    }

    return {
      success: ok,
      message: ok 
        ? (action === 'start' ? `Đã gửi lệnh bật [${friendlyName}]` : `Đã gửi lệnh dừng Auto`)
        : `Không thể gửi lệnh Auto đến bot.`
    };
  }

  resetBotData(accountId) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.resetData();
    } else if (this.processRegistry.isAccountRunning(accountId)) {
      return this.ipcBus.sendCommand(accountId, 'resetData');
    }
    return false;
  }

  markProxyExpired(proxyId, reason, accountId = null) {
    if (!proxyId) return;
    const config = this.configRepo.get();
    const proxy = (config.proxies || []).find(p => p.id === proxyId);
    if (!proxy) return;

    proxy.isExpired = true;
    proxy.errorReason = reason || 'Proxy đã hết hạn hoặc từ chối xác thực';
    proxy.lastChecked = new Date().toISOString();
    this.configRepo.save(config);

    if (this.sseEventBus) {
      this.sseEventBus.broadcast('bot-status-changed', {
        type: 'proxy-expired',
        proxyId,
        reason
      });
      const username = accountId ? ((config.accounts || []).find(a => a.id === accountId)?.username || '') : '';
      this.sseEventBus.addLog({
        timestamp: new Date().toLocaleTimeString('vi-VN', { hour12: false }),
        type: 'error',
        accountId: accountId,
        username,
        text: `🛑 [PROXY ALERT]: Phát hiện Proxy [${proxy.name}] (${proxy.host}:${proxy.port}) HẾT HẠN hoặc LỖI XÁC THỰC! Đã đánh dấu cờ hết hạn.`
      });
    }
  }

  getAllStatuses() {
    const statuses = {};
    const activeBots = this.processRegistry.getActiveBots();

    // 1. Fill from active process registry
    for (const [accId, rec] of Object.entries(activeBots)) {
      const uptimeSec = rec.startTime ? Math.floor((Date.now() - rec.startTime) / 1000) : 0;
      statuses[accId] = {
        running: true,
        pid: rec.pid,
        workerPid: rec.workerPid,
        uptimeSeconds: uptimeSec,
        accountState: rec.accountState || { state: 'online', message: 'Đang Treo Online', isError: false },
        autoState: rec.autoState || { isRunning: false, autoType: null, status: 'idle', message: '' },
        stats: rec.stats || {
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
    }

    // 2. Overlay live local instances if any
    for (const [accId, botProcess] of this.runningBots.entries()) {
      statuses[accId] = botProcess.getStatus();
    }

    const runningAccountIds = Object.keys(statuses).filter(id => statuses[id].running);

    return {
      runningCount: runningAccountIds.length,
      runningAccountIds,
      instances: statuses
    };
  }
}

module.exports = MultiBotManager;
