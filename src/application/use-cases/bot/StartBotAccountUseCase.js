const SingleBotProcess = require('../../../infrastructure/process/SingleBotProcess');
const JavaDetector = require('../../../infrastructure/process/JavaDetector');
const ServerLimitRule = require('../../../domain/rules/ServerLimitRule');
const ProxyChecker = require('../../../infrastructure/network/ProxyChecker');

/**
 * StartBotAccountUseCase (Application Layer - Use Case)
 * Encapsulates validation, quota checking, proxy testing, and instantiation
 * of a bot process for a single game account.
 * Powered 100% by MySQL Repositories (Database-Driven, zero config.json dependency).
 */
class StartBotAccountUseCase {
  constructor(multiBotManager, accountRepo, fileRepo, proxyRepo, settingRepo, sseEventBus) {
    this.multiBotManager = multiBotManager;
    this.accountRepo = accountRepo;
    this.fileRepo = fileRepo;
    this.proxyRepo = proxyRepo;
    this.settingRepo = settingRepo;
    this.sseEventBus = sseEventBus;
  }

  async execute(accountId) {
    // 1. Fetch Account directly from MySQL
    const account = await this.accountRepo.findById(accountId);
    if (!account) {
      throw new Error(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    // 2. Fetch File Profile directly from MySQL
    const fileId = account.fileId || (await this.fileRepo.getActiveFileId()) || 'file_1';
    const fileProfile = await this.fileRepo.findById(fileId);
    if (!fileProfile) {
      throw new Error(`Không tìm thấy cấu hình File/Profile cho tài khoản này!`);
    }

    // 3. Cross-worker check: if already running in local RAM or on OS, return idempotent success
    if (this.multiBotManager.isAccountRunning(accountId)) {
      return { success: true, message: `Tài khoản [${account.username}] đang chạy rồi.` };
    }

    // 4. Check server / file limits
    const allRunning = await this.multiBotManager.getRunningAccounts();
    const otherRunning = allRunning.filter(a => a.id !== accountId);
    const proxy = account.proxyId ? await this.proxyRepo.findById(account.proxyId) : null;
    ServerLimitRule.validateCanRun(otherRunning, account, proxy, fileProfile?.maxAccounts || 6);

    // 5. Check proxy limits and liveness
    const isCustomerRental = Boolean(account.userId || account.rentalExpiresAt);
    if (isCustomerRental && (!account.proxyId || !proxy)) {
      throw new Error(`[SECURITY BLOCK] Tài khoản thuê của khách [${account.username}] bắt buộc phải có Proxy khả dụng để bảo vệ IP máy chủ!`);
    }

    if (account.proxyId && proxy) {
      if (proxy.isExpired) {
        throw new Error(`❌ Proxy [${proxy.name || proxy.host}] gán cho nick [${account.username}] ĐÃ BỊ ĐÁNH DẤU HẾT HẠN! Vui lòng đổi proxy khác.`);
      }

      // Live Health Test before spawning process
      const testRes = await ProxyChecker.testProxy(proxy, 3500);
      if (testRes.isExpired) {
        await this.multiBotManager.markProxyExpired(account.proxyId, testRes.message, account.id);
        throw new Error(`❌ Proxy [${proxy.name || proxy.host}] của nick [${account.username}] ĐÃ HẾT HẠN hoặc LỖI KẾT NỐI (${testRes.message})! Đã tự động đánh dấu cờ.`);
      }

      ServerLimitRule.validateProxyLimit(otherRunning, account, proxy);
    }

    // 6. Fetch Global System Settings from MySQL
    const config = await this.settingRepo.getCompleteConfig();

    // 7. Locate Java runtime
    const javaBin = JavaDetector.findJavaExecutable(config.javaPath);
    if (!javaBin) {
      throw new Error('Không tìm thấy Java runtime. Vui lòng cài đặt Java hoặc Portable JRE!');
    }

    // 8. Instantiate SingleBotProcess with injected Proxy entity
    const botProcess = new SingleBotProcess(account, fileProfile, config, proxy);

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

    botProcess.on('proxy-expired', async ({ proxyId, reason }) => {
      await this.multiBotManager.markProxyExpired(proxyId, reason, accountId);
    });

    botProcess.on('stopped', async ({ accountId: stoppedId, wasManual }) => {
      this.multiBotManager.processRegistry.unregister(stoppedId);
      if (wasManual) {
        this.multiBotManager.runningBots.delete(stoppedId);
        await this.multiBotManager.persistRunningState();
      }
      const runningCount = (await this.multiBotManager.getRunningAccounts()).length;
      this.sseEventBus.broadcast('bot-status-changed', {
        accountId: stoppedId,
        running: false,
        runningCount
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

      await this.multiBotManager.persistRunningState();
      const runningCount = (await this.multiBotManager.getRunningAccounts()).length;
      this.sseEventBus.broadcast('bot-status-changed', {
        accountId,
        running: true,
        runningCount
      });
    }

    return {
      success: started,
      message: started ? `Đã bắt đầu treo tài khoản [${account.username}]!` : 'Không thể khởi chạy bot.'
    };
  }
}

module.exports = StartBotAccountUseCase;
