const EventEmitter = require('events');
const SingleBotProcess = require('../../infrastructure/process/SingleBotProcess');
const JavaDetector = require('../../infrastructure/process/JavaDetector');
const ServerLimitRule = require('../../domain/rules/ServerLimitRule');

/**
 * MultiBotManager (Application Layer)
 * Manages concurrent bot instances for multiple Avatar accounts.
 */
class MultiBotManager extends EventEmitter {
  constructor(configRepo, sseEventBus) {
    super();
    this.configRepo = configRepo;
    this.sseEventBus = sseEventBus;
    this.runningBots = new Map(); // accountId -> SingleBotProcess
  }

  getRunningAccounts() {
    const config = this.configRepo.get();
    const accounts = config.accounts || [];
    const runningList = [];
    for (const [accId, botProcess] of this.runningBots.entries()) {
      const acc = accounts.find(a => a.id === accId);
      if (acc && botProcess.getStatus().running) {
        runningList.push(acc);
      }
    }
    return runningList;
  }

  getRunningBotsInFile(fileId) {
    const config = this.configRepo.get();
    const accounts = config.accounts || [];
    return this.getRunningAccounts().filter(a => (a.fileId || 'file_1') === fileId);
  }

  startAccount(accountId) {
    const config = this.configRepo.get();
    const account = (config.accounts || []).find(a => a.id === accountId);
    if (!account) {
      throw new Error(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    const fileId = account.fileId || 'file_1';
    const fileProfile = (config.botFiles || []).find(f => f.id === fileId);
    if (!fileProfile) {
      throw new Error(`Không tìm thấy cấu hình File/Profile cho tài khoản này!`);
    }

    // Check if already running
    if (this.runningBots.has(accountId) && this.runningBots.get(accountId).getStatus().running) {
      return { success: true, message: `Tài khoản [${account.username}] đang chạy rồi.` };
    }

    // Check limits for running bots in this file
    const currentlyRunningInFile = this.getRunningBotsInFile(fileId).filter(a => a.id !== accountId);
    ServerLimitRule.validateCanRun(currentlyRunningInFile, account);

    // Check limits for running bots on the same proxy (Max 6 online per proxy)
    if (account.proxyId) {
      const proxy = (config.proxies || []).find(p => p.id === account.proxyId);
      const allRunning = this.getRunningAccounts().filter(a => a.id !== accountId);
      ServerLimitRule.validateProxyLimit(allRunning, account, proxy);
    }

    // Find Java runtime
    const javaBin = JavaDetector.findJavaExecutable(config.javaPath);
    if (!javaBin) {
      throw new Error('Không tìm thấy Java runtime. Vui lòng cài đặt Java hoặc Portable JRE!');
    }

    // Create process
    const botProcess = new SingleBotProcess(account, fileProfile, config);
    botProcess.on('log', (entry) => {
      this.sseEventBus.addLog(entry);
    });

    botProcess.on('stats', (data) => {
      this.sseEventBus.broadcast('bot-stats', data);
    });

    botProcess.on('account-status', (data) => {
      this.sseEventBus.broadcast('bot-account-status', data);
    });

    botProcess.on('auto-status', (data) => {
      this.sseEventBus.broadcast('bot-auto-status', data);
    });

    botProcess.on('stopped', ({ accountId: stoppedId, wasManual }) => {
      if (wasManual) {
        this.runningBots.delete(stoppedId);
        this.persistRunningState();
      }
      this.sseEventBus.broadcast('bot-status-changed', {
        accountId: stoppedId,
        running: false,
        runningCount: this.getRunningAccounts().length
      });
    });

    const started = botProcess.start(javaBin);
    if (started) {
      this.runningBots.set(accountId, botProcess);
      this.persistRunningState();
      this.sseEventBus.broadcast('bot-status-changed', {
        accountId,
        running: true,
        runningCount: this.getRunningAccounts().length
      });
    }

    return {
      success: started,
      message: started ? `Đã bắt đầu treo tài khoản [${account.username}]!` : 'Không thể khởi chạy bot.'
    };
  }

  stopAccount(accountId) {
    const config = this.configRepo.get();
    const account = (config.accounts || []).find(a => a.id === accountId);
    const username = account ? account.username : accountId;

    if (!this.runningBots.has(accountId)) {
      // Clean up runningAccountIds if stale
      this.persistRunningState();
      return { success: true, message: `Tài khoản [${username}] hiện không chạy.` };
    }

    const botProcess = this.runningBots.get(accountId);
    botProcess.stop();
    this.runningBots.delete(accountId);
    this.persistRunningState();

    this.sseEventBus.addLog({
      type: 'warn',
      accountId,
      username,
      text: `⏹️ [${username}] Đã dừng treo tài khoản.`
    });

    this.sseEventBus.broadcast('bot-status-changed', {
      accountId,
      running: false,
      runningCount: this.getRunningAccounts().length
    });

    return { success: true, message: `Đã dừng treo tài khoản [${username}].` };
  }

  stopAll() {
    for (const [accId, botProcess] of this.runningBots.entries()) {
      botProcess.stop();
    }
    this.runningBots.clear();
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
    const runningIds = Array.from(this.runningBots.keys());
    config.runningAccountIds = runningIds;
    config.botRunningState = runningIds.length > 0;
    this.configRepo.save(config);
  }

  resumePreviousRunningBots() {
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
        this.startAccount(accId);
      } catch (err) {
        console.error(`❌ Không thể khôi phục tài khoản [${accId}]:`, err.message);
      }
    }
  }

  applySetupToBot(accountId, targetCoins, upDays) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applySetup(targetCoins, upDays);
    }
    return false;
  }

  applyFarmSettingsToBot(accountId, farmSettings) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applyFarmSettings(farmSettings);
    }
    return false;
  }

  applyDiamondSettingsToBot(accountId, diamondSettings) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applyDiamondSettings(diamondSettings);
    }
    return false;
  }

  applyFishSettingsToBot(accountId, fishSettings) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applyFishSettings(fishSettings);
    }
    return false;
  }

  applySellOreSettingsToBot(accountId, sellOreSettings) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.applySellOreSettings(sellOreSettings);
    }
    return false;
  }

  triggerAuto(accountId, autoType = 'farm', action = 'start') {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      const ok = botProcess.triggerAuto(autoType, action);
      
      let friendlyName = 'Auto Farm';
      if (autoType === 'diamond' || autoType === 'kc') friendlyName = 'Auto Kim Cương';
      else if (autoType === 'fish') friendlyName = 'Auto Câu Cá';
      else if (autoType === 'sell_ore' || autoType === 'banda' || autoType === 'stone') friendlyName = 'Auto Bán Đá';

      return {
        success: ok,
        message: ok 
          ? (action === 'start' ? `Đã gửi lệnh bật [${friendlyName}]` : `Đã gửi lệnh dừng Auto`)
          : `Không thể gửi lệnh Auto đến bot.`
      };
    }
    return {
      success: false,
      message: 'Tài khoản chưa được bật (Hãy Treo Bot trước khi kích hoạt Auto)!'
    };
  }

  resetBotData(accountId) {
    if (this.runningBots.has(accountId)) {
      const botProcess = this.runningBots.get(accountId);
      return botProcess.resetData();
    }
    return false;
  }

  getAllStatuses() {
    const statuses = {};
    for (const [accId, botProcess] of this.runningBots.entries()) {
      statuses[accId] = botProcess.getStatus();
    }
    return {
      runningCount: this.runningBots.size,
      runningAccountIds: Array.from(this.runningBots.keys()),
      instances: statuses
    };
  }
}

module.exports = MultiBotManager;
