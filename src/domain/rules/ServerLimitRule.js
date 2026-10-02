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
   */
  static validateAccountAddition(accountsInFile, targetServerId, editingAccountId = null) {
    const existing = accountsInFile.filter(a => a.id !== editingAccountId);

    if (existing.length >= this.MAX_PER_FILE) {
      throw new Error(`❌ GIỚI HẠN FILE: File này đã đạt tối đa ${this.MAX_PER_FILE} tài khoản (3 Hoàn Mỹ + 3 Diệu Kỳ)! Vui lòng thêm File mới hoặc xóa bớt.`);
    }

    const sId = parseInt(targetServerId, 10) === 1 ? 1 : 0;
    const serverName = sId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    const serverCount = existing.filter(a => parseInt(a.serverId, 10) === sId).length;

    if (serverCount >= this.MAX_PER_SERVER) {
      throw new Error(`❌ GIỚI HẠN SERVER: File này đã đủ ${this.MAX_PER_SERVER} tài khoản Server [${serverName}] (Tối đa ${this.MAX_PER_SERVER} nick/server)! Vui lòng chọn server khác hoặc tạo File mới.`);
    }
  }

  /**
   * Validates if an account can start running based on current running bots in the file.
   */
  static validateCanRun(runningAccountsInFile, targetAccount) {
    const sId = parseInt(targetAccount.serverId, 10) === 1 ? 1 : 0;
    const serverName = sId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';

    const runningInServer = runningAccountsInFile.filter(a => parseInt(a.serverId, 10) === sId).length;
    if (runningInServer >= this.MAX_PER_SERVER) {
      throw new Error(`❌ GIỚI HẠN TREO: Server [${serverName}] trong File này đang chạy tối đa ${this.MAX_PER_SERVER} nick! Vui lòng dừng 1 nick trước khi treo tiếp.`);
    }

    if (runningAccountsInFile.length >= this.MAX_PER_FILE) {
      throw new Error(`❌ GIỚI HẠN TREO: File này đang chạy tối đa ${this.MAX_PER_FILE} nick cùng lúc!`);
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
