const { BadRequestException } = require('../errors');

/**
 * ServerLimitRule (Domain Layer)
 * Enforces business rules on account counts and running constraints.
 */
class ServerLimitRule {
  static MAX_PER_FILE = 6;
  static MAX_PER_SERVER = 3;
  static MAX_PER_PROXY = 6;

  /**
   * Validates if a new/updated account can be added to a file based on server limits.
   * Each IP (Direct IP or specific Proxy) allows max 6 accounts (3 Hoàn Mỹ + 3 Diệu Kỳ).
   */
  static validateAccountAddition(accountsInFile, targetServerId, editingAccountId = null, targetProxyId = null, maxAccounts = 6, proxyName = '', allAccountsInSystem = null) {
    const existingInFile = accountsInFile.filter(a => a.id !== editingAccountId);
    const effectiveMax = Math.max(6, parseInt(maxAccounts || 6, 10));

    if (existingInFile.length >= effectiveMax) {
      throw new BadRequestException(`❌ GIỚI HẠN FILE: File này đã đạt tối đa ${effectiveMax} tài khoản! Vui lòng tăng giới hạn số nick cho File hoặc tạo File mới.`);
    }

    const sId = parseInt(targetServerId, 10) === 1 ? 1 : 0;
    const serverName = sId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    const targetKey = targetProxyId || 'direct';
    const ipDisplayName = targetKey === 'direct' ? 'IP Mặc định' : (proxyName ? `Proxy [${proxyName}]` : `Proxy [${targetKey}]`);

    const poolToCheck = allAccountsInSystem || accountsInFile;
    const existingInIp = poolToCheck.filter(a => a.id !== editingAccountId && (a.proxyId || 'direct') === targetKey);
    const serverCountInIp = existingInIp.filter(a => parseInt(a.serverId, 10) === sId).length;

    const maxPerServer = this.MAX_PER_SERVER;
    const maxPerIp = this.MAX_PER_PROXY;

    if (serverCountInIp >= maxPerServer) {
      throw new BadRequestException(`❌ GIỚI HẠN IP [${ipDisplayName}]: Đã đủ ${maxPerServer} tài khoản Server [${serverName}] trên toàn hệ thống (Tối đa ${maxPerServer} nick/server cho mỗi IP/Proxy)! Vui lòng chọn IP/Proxy khác.`);
    }

    if (existingInIp.length >= maxPerIp) {
      throw new BadRequestException(`❌ GIỚI HẠN IP [${ipDisplayName}]: Đã đạt tối đa ${maxPerIp} tài khoản trên toàn hệ thống! Vui lòng chọn IP/Proxy khác.`);
    }
  }

  /**
   * Validates if an account can start running based on current running bots system-wide on the same IP / Proxy.
   * Enforces strictly 6 bots max per IP (3 Hoàn Mỹ + 3 Diệu Kỳ).
   */
  static validateCanRun(allRunningAccounts, targetAccount, proxy = null, maxAccountsInFile = 6) {
    const sId = parseInt(targetAccount.serverId, 10) === 1 ? 1 : 0;
    const serverName = sId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    const targetKey = targetAccount.proxyId || 'direct';
    const ipDisplayName = targetKey === 'direct' ? 'IP Mặc định' : (proxy?.name ? `Proxy [${proxy.name}]` : `Proxy [${targetKey}]`);

    const maxPerServer = this.MAX_PER_SERVER;
    const maxPerProxy = this.MAX_PER_PROXY;

    // 1. Validate System-Wide IP concurrency
    const runningInSameIp = allRunningAccounts.filter(a => (a.proxyId || 'direct') === targetKey);
    const runningInServerIp = runningInSameIp.filter(a => parseInt(a.serverId, 10) === sId).length;

    if (runningInServerIp >= maxPerServer) {
      throw new BadRequestException(`❌ GIỚI HẠN IP [${ipDisplayName}]: Server [${serverName}] trên IP này đã đạt tối đa ${maxPerServer} nick online trên toàn hệ thống! Vui lòng dừng bớt 1 nick trước khi treo tiếp.`);
    }

    if (runningInSameIp.length >= maxPerProxy) {
      throw new BadRequestException(`❌ GIỚI HẠN IP [${ipDisplayName}]: IP này đã đạt tối đa ${maxPerProxy} nick online cùng lúc trên toàn hệ thống!`);
    }

    // 2. Validate File Profile running limit
    const runningInSameFile = allRunningAccounts.filter(a => a.fileId === targetAccount.fileId);
    if (runningInSameFile.length >= maxAccountsInFile) {
      throw new BadRequestException(`❌ GIỚI HẠN FILE: File này đã đạt tối đa ${maxAccountsInFile} nick online cùng lúc!`);
    }
  }

  /**
   * Validates if an account can start running based on current running bots on the same proxy.
   */
  static validateProxyLimit(allRunningAccounts, targetAccount, proxy) {
    if (!targetAccount.proxyId || !proxy) return;
    const limit = this.MAX_PER_PROXY;
    const runningWithProxy = allRunningAccounts.filter(a => a.id !== targetAccount.id && a.proxyId === targetAccount.proxyId);
    if (runningWithProxy.length >= limit) {
      throw new BadRequestException(`❌ GIỚI HẠN PROXY: Proxy [${proxy.name || proxy.host}] đã đạt tối đa ${limit} tài khoản online cùng lúc! Vui lòng chọn Proxy khác hoặc dừng 1 nick.`);
    }
  }
}

module.exports = ServerLimitRule;
