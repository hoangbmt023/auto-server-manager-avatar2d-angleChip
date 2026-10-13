/**
 * StopBotAccountUseCase (Application Layer - Use Case)
 * Handles stopping a bot instance cleanly, across both local worker memory
 * and distributed cross-worker process registry via IPC.
 * Powered 100% by MySQL Repositories (Database-Driven, zero config.json dependency).
 */
class StopBotAccountUseCase {
  constructor(multiBotManager, accountRepo, sseEventBus) {
    this.multiBotManager = multiBotManager;
    this.accountRepo = accountRepo;
    this.sseEventBus = sseEventBus;
  }

  async execute(accountId) {
    let username = accountId;
    if (this.accountRepo) {
      try {
        const account = await this.accountRepo.findById(accountId);
        if (account) username = account.username;
      } catch (e) {}
    }

    let stopped = false;

    // 1. Local worker process stop
    if (this.multiBotManager.runningBots.has(accountId)) {
      const botProcess = this.multiBotManager.runningBots.get(accountId);
      botProcess.stop();
      this.multiBotManager.runningBots.delete(accountId);
      this.multiBotManager.processRegistry.unregister(accountId);
      stopped = true;
    }

    // 2. Cross-worker stop (Remote OS PID kill & IPC signal)
    if (this.multiBotManager.processRegistry.isAccountRunning(accountId)) {
      this.multiBotManager.ipcBus.sendCommand(accountId, 'stop');
      this.multiBotManager.processRegistry.killAccount(accountId);
      stopped = true;
    }

    await this.multiBotManager.persistRunningState();

    this.sseEventBus.addLog({
      type: 'warn',
      accountId,
      username,
      text: `⏹️ [${username}] Đã dừng treo tài khoản.`
    });

    const runningCount = (await this.multiBotManager.getRunningAccounts()).length;
    this.sseEventBus.broadcast('bot-status-changed', {
      accountId,
      running: false,
      runningCount
    });

    return { success: true, message: `Đã dừng treo tài khoản [${username}].` };
  }
}

module.exports = StopBotAccountUseCase;
