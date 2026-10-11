/**
 * StopBotAccountUseCase (Application Layer - Use Case)
 * Handles stopping a bot instance cleanly, across both local worker memory
 * and distributed cross-worker process registry via IPC.
 */
class StopBotAccountUseCase {
  constructor(multiBotManager, configRepo, sseEventBus) {
    this.multiBotManager = multiBotManager;
    this.configRepo = configRepo;
    this.sseEventBus = sseEventBus;
  }

  execute(accountId) {
    const config = this.configRepo.get();
    const account = (config.accounts || []).find(a => a.id === accountId);
    const username = account ? account.username : accountId;

    let stopped = false;

    // 1. Local worker process stop
    if (this.multiBotManager.runningBots.has(accountId)) {
      const botProcess = this.multiBotManager.runningBots.get(accountId);
      if (botProcess && botProcess.autoState && botProcess.autoState.isRunning && botProcess.autoState.autoType) {
        if (account) {
          account.lastAutoType = botProcess.autoState.autoType;
          this.configRepo.save(config);
        }
      }
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

    this.multiBotManager.persistRunningState();

    this.sseEventBus.addLog({
      type: 'warn',
      accountId,
      username,
      text: `⏹️ [${username}] Đã dừng treo tài khoản.`
    });

    this.sseEventBus.broadcast('bot-status-changed', {
      accountId,
      running: false,
      runningCount: this.multiBotManager.getRunningAccounts().length
    });

    return { success: true, message: `Đã dừng treo tài khoản [${username}].` };
  }
}

module.exports = StopBotAccountUseCase;
