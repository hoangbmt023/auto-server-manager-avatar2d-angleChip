/**
 * AccountResponseDto (Application Layer - DTO)
 * Formats account entity and runtime states into clean response payload.
 * Password is NEVER exposed as plain text.
 */
class AccountResponseDto {
  constructor(account, runtimeInfo = null) {
    this.id = account.id;
    this.userId = account.userId || null;
    this.username = account.username;
    this.password = account.password ? '******' : '';
    this.serverId = account.serverId;
    this.serverName = account.serverName;
    this.fileId = account.fileId;
    this.proxyId = account.proxyId;
    this.note = account.note;
    this.ipSlot = account.ipSlot;
    this.appId = account.appId;
    this.targetCoins = account.targetCoins;
    this.upDays = account.upDays;
    this.pendingReset = account.pendingReset;
    this.farmSettings = account.farmSettings;
    this.diamondSettings = account.diamondSettings;
    this.fishSettings = account.fishSettings;
    this.sellOreSettings = account.sellOreSettings;

    // Runtime states
    this.isRunning = Boolean(runtimeInfo && runtimeInfo.running);
    this.runningPid = runtimeInfo ? runtimeInfo.pid : null;
    this.uptimeSeconds = runtimeInfo ? runtimeInfo.uptimeSeconds : 0;
    this.accountState = runtimeInfo
      ? (runtimeInfo.accountState || { state: 'online', message: 'Đang Treo Online', isError: false })
      : { state: 'offline', message: 'Đang tắt', isError: false };
    this.autoState = runtimeInfo
      ? (runtimeInfo.autoState || { isRunning: false, autoType: null, status: 'idle', message: '' })
      : { isRunning: false, autoType: null, status: 'idle', message: '' };
    this.stats = runtimeInfo ? runtimeInfo.stats : {
      coins: 0,
      gold: 0,
      lockedGold: 0,
      targetCoins: 0,
      earnedCoins: 0,
      collectedHearts: 0,
      startedAt: '--',
      expiresAt: 'Vĩnh viễn'
    };
  }
}

module.exports = AccountResponseDto;
