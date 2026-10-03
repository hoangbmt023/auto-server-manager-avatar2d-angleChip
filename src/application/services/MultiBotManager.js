const EventEmitter = require('events');
const SingleBotProcess = require('../../infrastructure/process/SingleBotProcess');
const JavaDetector = require('../../infrastructure/process/JavaDetector');
const ServerLimitRule = require('../../domain/rules/ServerLimitRule');
const ProxyChecker = require('../../infrastructure/network/ProxyChecker');

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
    this.startActiveProxyMonitor(60000);
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

  async startAccount(accountId) {
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

    // Check limits for running bots on the same proxy (Max 6 online per proxy) & Real-time Health Check
    if (account.proxyId) {
      const proxy = (config.proxies || []).find(p => p.id === account.proxyId);
      if (proxy) {
        if (proxy.isExpired) {
          throw new Error(`❌ Proxy [${proxy.name || proxy.host}] gán cho nick [${account.username}] ĐÃ BỊ ĐÁNH DẤU HẾT HẠN! Vui lòng đổi proxy khác.`);
        }

        // Live Health Test before spawning process
        const testRes = await ProxyChecker.testProxy(proxy, 3500);
        if (testRes.isExpired) {
          this.markProxyExpired(account.proxyId, testRes.message, account.id);
          throw new Error(`❌ Proxy [${proxy.name || proxy.host}] của nick [${account.username}] ĐÃ HẾT HẠN hoặc LỖI KẾT NỐI (${testRes.message})! Đã tự động đánh dấu cờ.`);
        }
      }
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

    botProcess.on('proxy-expired', ({ proxyId, reason }) => {
      this.markProxyExpired(proxyId, reason, accountId);
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
        await this.startAccount(accId);
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

  startActiveProxyMonitor(intervalMs = 60000) {
    if (this._proxyMonitorTimer) return;
    this._proxyMonitorTimer = setInterval(async () => {
      try {
        const runningAccounts = this.getRunningAccounts();
        const activeProxyIds = [...new Set(runningAccounts.map(a => a.proxyId).filter(Boolean))];
        if (activeProxyIds.length === 0) return;

        const config = this.configRepo.get();
        for (const proxyId of activeProxyIds) {
          const proxy = (config.proxies || []).find(p => p.id === proxyId);
          if (!proxy) continue;

          const testRes = await ProxyChecker.testProxy(proxy, 3500);
          if (testRes.isExpired) {
            this.markProxyExpired(proxyId, testRes.message);
            for (const [accId, botProcess] of this.runningBots.entries()) {
              if (botProcess.account && botProcess.account.proxyId === proxyId) {
                botProcess.accountState = {
                  state: 'proxy_expired',
                  message: testRes.message,
                  isError: true,
                  isMaintenance: false
                };
                botProcess.emitLog('error', `🛑 [${botProcess.account.username}] PROXY ĐÃ HẾT HẠN TRONG KHI ĐANG TREO! Đang dừng tài khoản để bảo vệ an toàn.`);
                botProcess.stop();
                this.runningBots.delete(accId);
              }
            }
          }
        }
      } catch (e) {
        // silent monitor error
      }
    }, intervalMs);

    if (this._proxyMonitorTimer.unref) {
      this._proxyMonitorTimer.unref();
    }
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
