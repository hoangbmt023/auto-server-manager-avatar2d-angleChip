/**
 * BotFileResponseDto (Application Layer - DTO)
 * Enums are returned in lowercase for response.
 */
class BotFileResponseDto {
  constructor(botFile, stats = {}) {
    const totalIps = Math.max(1, Math.ceil(botFile.maxAccounts / 6));
    const maxPerServer = totalIps * 3;

    this.id = botFile.id;
    this.name = botFile.name;
    this.gameJar = botFile.gameJar;
    this.modType = String(botFile.modType || 'upxu').toLowerCase(); // lowercase for response
    this.appId = botFile.appId;
    this.proxy = botFile.proxy;
    this.maxAccounts = botFile.maxAccounts;
    this.totalIps = totalIps;
    this.totalAccounts = stats.totalAccounts || 0;
    this.hmCount = stats.hmCount || 0;
    this.dkCount = stats.dkCount || 0;
    this.runningCount = stats.runningCount || 0;
    this.runningHmCount = stats.runningHmCount || 0;
    this.runningDkCount = stats.runningDkCount || 0;
    this.maxTotal = botFile.maxAccounts;
    this.maxPerServer = maxPerServer;
  }
}

module.exports = BotFileResponseDto;
