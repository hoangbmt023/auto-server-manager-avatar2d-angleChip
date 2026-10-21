/**
 * AccountResponseDto (Application Layer - DTO)
 * Formats account entity and runtime states into clean response payload.
 * Password is NEVER exposed as plain text.
 */
class AccountResponseDto {
  constructor(account, runtimeInfo = null, proxyName = null, proxyExpiresAt = null, allowedFeatures = null, rentalPlanName = null, rentedBy = null) {
    this.id = account.id;
    this.userId = account.userId || null;
    this.rentedBy = rentedBy || account.rentedBy || null;
    this.username = account.username;
    this.password = account.password ? '******' : '';
    this.serverId = account.serverId;
    this.serverName = account.serverName;
    this.fileId = account.fileId;
    this.proxyId = account.proxyId;
    this.proxyName = proxyName || account.proxyName || null;
    this.proxyExpiresAt = proxyExpiresAt ? (proxyExpiresAt.toISOString ? proxyExpiresAt.toISOString() : proxyExpiresAt) : (account.proxyExpiresAt || null);

    const isRented = Boolean(account.userId || account.rentalExpiresAt);
    this.rentalPlan = isRented ? (account.rentalPlan || null) : null;
    this.rentalPlanName = isRented ? (rentalPlanName || (account.rentalPlan === 'FULL' ? 'Gói Full' : (account.rentalPlan === 'FISH' ? 'Gói Câu Cá' : (account.rentalPlan === 'UPXU' ? 'Gói Up Xu' : (account.rentalPlan ? `Gói ${account.rentalPlan}` : null))))) : null;
    this.rentalExpiresAt = account.rentalExpiresAt ? (account.rentalExpiresAt.toISOString ? account.rentalExpiresAt.toISOString() : account.rentalExpiresAt) : null;
    this.allowedFeatures = isRented ? (allowedFeatures || (Array.isArray(account.allowedFeatures) ? account.allowedFeatures : (
      account.rentalPlan === 'FULL'
        ? ['farm', 'fish', 'diamond', 'sellOre', 'upThue']
        : (account.rentalPlan === 'FISH' ? ['fish', 'upThue'] : (account.rentalPlan ? ['farm', 'upThue'] : null))
    ))) : null;
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
