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
  static validateAccountAddition(accountsInFile, targetServerId, editingAccountId = null, targetProxyId = null, maxAccounts = 6, proxyName = '') {
    const existing = accountsInFile.filter(a => a.id !== editingAccountId);
    const effectiveMax = Math.max(6, parseInt(maxAccounts || 6, 10));

    if (existing.length >= effectiveMax) {
      throw new Error(`❌ GIỚI HẠN FILE: File này đã đạt tối đa ${effectiveMax} tài khoản! Vui lòng tăng giới hạn số nick cho File hoặc tạo File mới.`);
    }

    const sId = parseInt(targetServerId, 10) === 1 ? 1 : 0;
    const serverName = sId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    const targetKey = targetProxyId || 'direct';
    const ipDisplayName = targetKey === 'direct' ? 'IP Mặc định' : (proxyName ? `Proxy [${proxyName}]` : `Proxy [${targetKey}]`);

    const existingInIp = existing.filter(a => (a.proxyId || 'direct') === targetKey);
    const serverCountInIp = existingInIp.filter(a => parseInt(a.serverId, 10) === sId).length;

    if (serverCountInIp >= this.MAX_PER_SERVER) {
      throw new Error(`❌ GIỚI HẠN IP [${ipDisplayName}]: Đã đủ ${this.MAX_PER_SERVER} tài khoản Server [${serverName}] (Tối đa ${this.MAX_PER_SERVER} nick/server cho mỗi IP/Proxy)! Vui lòng chọn IP/Proxy khác.`);
    }

    if (existingInIp.length >= this.MAX_PER_FILE) {
      throw new Error(`❌ GIỚI HẠN IP [${ipDisplayName}]: Đã đạt tối đa ${this.MAX_PER_FILE} tài khoản (3 Hoàn Mỹ + 3 Diệu Kỳ)! Vui lòng chọn IP/Proxy khác.`);
    }
  }

  /**
   * Validates if an account can start running based on current running bots system-wide on the same IP / Proxy.
   */
  static validateCanRun(allRunningAccounts, targetAccount, proxy = null, maxAccountsInFile = 6) {
    const sId = parseInt(targetAccount.serverId, 10) === 1 ? 1 : 0;
    const serverName = sId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    const targetKey = targetAccount.proxyId || 'direct';
    const ipDisplayName = targetKey === 'direct' ? 'IP Mặc định' : (proxy?.name ? `Proxy [${proxy.name}]` : `Proxy [${targetKey}]`);

    // 1. Validate System-Wide IP concurrency (Max 3 HM + 3 DK = 6 per IP across all files)
    const runningInSameIp = allRunningAccounts.filter(a => (a.proxyId || 'direct') === targetKey);
    const runningInServerIp = runningInSameIp.filter(a => parseInt(a.serverId, 10) === sId).length;

    if (runningInServerIp >= this.MAX_PER_SERVER) {
      throw new Error(`❌ GIỚI HẠN IP [${ipDisplayName}]: Server [${serverName}] trên IP này đã đạt tối đa ${this.MAX_PER_SERVER} nick online trên toàn hệ thống! Vui lòng dừng bớt 1 nick trước khi treo tiếp.`);
    }

    if (runningInSameIp.length >= this.MAX_PER_FILE) {
      throw new Error(`❌ GIỚI HẠN IP [${ipDisplayName}]: IP này đã đạt tối đa ${this.MAX_PER_FILE} nick online cùng lúc (3 HM + 3 DK) trên toàn hệ thống!`);
    }

    // 2. Validate File Profile running limit
    const runningInSameFile = allRunningAccounts.filter(a => a.fileId === targetAccount.fileId);
    if (runningInSameFile.length >= maxAccountsInFile) {
      throw new Error(`❌ GIỚI HẠN FILE: File này đã đạt tối đa ${maxAccountsInFile} nick online cùng lúc!`);
    }
  }

  /**
   * Validates if an account can start running based on current running bots on the same proxy.
   */
  static validateProxyLimit(allRunningAccounts, targetAccount, proxy) {
    if (!targetAccount.proxyId || !proxy) return;
    const runningWithProxy = allRunningAccounts.filter(a => a.id !== targetAccount.id && a.proxyId === targetAccount.proxyId);
    if (runningWithProxy.length >= this.MAX_PER_PROXY) {
      throw new Error(`❌ GIỚI HẠN PROXY: Proxy [${proxy.name || proxy.host}] đã đạt tối đa ${this.MAX_PER_PROXY} tài khoản online cùng lúc! Vui lòng chọn Proxy khác hoặc dừng 1 nick.`);
    }
  }
}

module.exports = ServerLimitRule;
