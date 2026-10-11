const SingleBotProcess = require('../../../infrastructure/process/SingleBotProcess');
const JavaDetector = require('../../../infrastructure/process/JavaDetector');
const ServerLimitRule = require('../../../domain/rules/ServerLimitRule');
const ProxyChecker = require('../../../infrastructure/network/ProxyChecker');

/**
 * StartBotAccountUseCase (Application Layer - Use Case)
 * Encapsulates validation, quota checking, proxy testing, and instantiation
 * of a bot process for a single game account.
 */
class StartBotAccountUseCase {
  constructor(multiBotManager, configRepo, sseEventBus) {
    this.multiBotManager = multiBotManager;
    this.configRepo = configRepo;
    this.sseEventBus = sseEventBus;
  }

  async execute(accountId) {
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

    // Cross-worker check: if already running in local RAM or on OS, return idempotent success
    if (this.multiBotManager.isAccountRunning(accountId)) {
      return { success: true, message: `Tài khoản [${account.username}] đang chạy rồi.` };
    }

    // Check server / file limits
    const allRunning = this.multiBotManager.getRunningAccounts().filter(a => a.id !== accountId);
    const proxy = account.proxyId ? (config.proxies || []).find(p => p.id === account.proxyId) : null;
    ServerLimitRule.validateCanRun(allRunning, account, proxy, fileProfile?.maxAccounts || 6);

    // Check proxy limits and liveness
    if (account.proxyId && proxy) {
      if (proxy.isExpired) {
        throw new Error(`❌ Proxy [${proxy.name || proxy.host}] gán cho nick [${account.username}] ĐÃ BỊ ĐÁNH DẤU HẾT HẠN! Vui lòng đổi proxy khác.`);
      }

      // Live Health Test before spawning process
      const testRes = await ProxyChecker.testProxy(proxy, 3500);
      if (testRes.isExpired) {
        this.multiBotManager.markProxyExpired(account.proxyId, testRes.message, account.id);
        throw new Error(`❌ Proxy [${proxy.name || proxy.host}] của nick [${account.username}] ĐÃ HẾT HẠN hoặc LỖI KẾT NỐI (${testRes.message})! Đã tự động đánh dấu cờ.`);
      }

      ServerLimitRule.validateProxyLimit(allRunning, account, proxy);
    }

    // Locate Java runtime
    const javaBin = JavaDetector.findJavaExecutable(config.javaPath);
    if (!javaBin) {
      throw new Error('Không tìm thấy Java runtime. Vui lòng cài đặt Java hoặc Portable JRE!');
    }

    // Instantiate SingleBotProcess
    const botProcess = new SingleBotProcess(account, fileProfile, config);

    botProcess.on('log', (entry) => {
      this.sseEventBus.addLog(entry);
    });

    botProcess.on('stats', (data) => {
      this.multiBotManager.processRegistry.update(accountId, { stats: data.stats });
      this.sseEventBus.broadcast('bot-stats', data);
    });

    botProcess.on('account-status', (data) => {
      this.multiBotManager.processRegistry.update(accountId, { accountState: data.state });
      this.sseEventBus.broadcast('bot-account-status', data);
    });

    botProcess.on('auto-status', (data) => {
      this.multiBotManager.processRegistry.update(accountId, { autoState: data.autoState });
      this.sseEventBus.broadcast('bot-auto-status', data);
    });

    botProcess.on('proxy-expired', ({ proxyId, reason }) => {
      this.multiBotManager.markProxyExpired(proxyId, reason, accountId);
    });

    botProcess.on('stopped', ({ accountId: stoppedId, wasManual }) => {
      this.multiBotManager.processRegistry.unregister(stoppedId);
      if (wasManual) {
        this.multiBotManager.runningBots.delete(stoppedId);
        this.multiBotManager.persistRunningState();
      }
      this.sseEventBus.broadcast('bot-status-changed', {
        accountId: stoppedId,
        running: false,
        runningCount: this.multiBotManager.getRunningAccounts().length
      });
    });

    const started = botProcess.start(javaBin);
    if (started && botProcess.child && botProcess.child.pid) {
      this.multiBotManager.runningBots.set(accountId, botProcess);

      // Register with Shared Process Registry on disk
      this.multiBotManager.processRegistry.register(accountId, {
        username: account.username,
        serverId: account.serverId !== undefined ? account.serverId : 0,
        serverName: account.serverName || '',
        fileId: fileId,
        pid: botProcess.child.pid,
        startTime: botProcess.startTime || Date.now(),
        stats: botProcess.playerStats,
        accountState: botProcess.accountState,
        autoState: botProcess.autoState
      });

      this.multiBotManager.persistRunningState();
      this.sseEventBus.broadcast('bot-status-changed', {
        accountId,
        running: true,
        runningCount: this.multiBotManager.getRunningAccounts().length
      });
    }

    return {
      success: started,
      message: started ? `Đã bắt đầu treo tài khoản [${account.username}]!` : 'Không thể khởi chạy bot.'
    };
  }
}

module.exports = StartBotAccountUseCase;
