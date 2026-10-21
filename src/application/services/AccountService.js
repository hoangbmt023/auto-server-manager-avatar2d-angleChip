const Account = require('../../domain/entities/Account');
const ServerLimitRule = require('../../domain/rules/ServerLimitRule');
const RmsWriter = require('../../infrastructure/storage/RmsWriter');
const AccountMapper = require('../mappers/AccountMapper');
const { NotFoundException, BadRequestException } = require('../../domain/errors');

/**
 * AccountService (Application Layer)
 * Manages Account CRUD, validations, and RMS sync.
 * Single-table operations (1 table) -> Bypasses transaction to maximize performance.
 */
class AccountService {
  constructor(accountRepo, fileRepo, proxyRepo, settingRepo, multiBotManager, userRepo = null) {
    this.accountRepo = accountRepo;
    this.fileRepo = fileRepo;
    this.proxyRepo = proxyRepo;
    this.settingRepo = settingRepo;
    this.multiBotManager = multiBotManager;
    this.userRepo = userRepo;
  }

  async _getRentalPlanRules() {
    if (!this.settingRepo) return {};
    try {
      const rules = await this.settingRepo.get('rental_allocation_rules');
      return rules?.plans || {};
    } catch (e) {
      return {};
    }
  }

  _resolvePlanInfo(rentalPlan, plans = {}) {
    if (!rentalPlan) return { allowedFeatures: null, rentalPlanName: null };
    const plan = plans[rentalPlan];
    let allowedFeatures = null;
    let rentalPlanName = plan?.name || null;
    if (plan && Array.isArray(plan.features)) {
      allowedFeatures = plan.features;
    } else if (rentalPlan === 'FULL') {
      allowedFeatures = ['farm', 'fish', 'diamond', 'sellOre', 'upThue'];
    } else if (rentalPlan === 'FISH') {
      allowedFeatures = ['fish', 'upThue'];
    } else {
      allowedFeatures = ['farm', 'upThue'];
    }
    return { allowedFeatures, rentalPlanName };
  }

  async getAccounts(fileId = null) {
    const accounts = await this.accountRepo.findAll();
    const proxies = this.proxyRepo ? await this.proxyRepo.findAll() : [];
    const proxyMap = new Map((proxies || []).map(p => [p.id, p]));
    const runningStatuses = this.multiBotManager ? this.multiBotManager.getAllStatuses() : { instances: {} };
    const plans = await this._getRentalPlanRules();

    let userMap = new Map();
    if (this.userRepo) {
      try {
        const users = await this.userRepo.findAll();
        userMap = new Map((users || []).map(u => [u.id, u.email || u.phone || u.id]));
      } catch (e) {}
    }

    const filtered = fileId ? accounts.filter(a => a.fileId === fileId) : accounts;

    return filtered.map(acc => {
      const runningInfo = runningStatuses.instances[acc.id] || null;
      const proxyObj = acc.proxyId ? (proxyMap.get(acc.proxyId) || null) : null;
      const { allowedFeatures, rentalPlanName } = this._resolvePlanInfo(acc.rentalPlan, plans);
      const rentedBy = acc.userId ? (userMap.get(acc.userId) || acc.userId) : null;
      return AccountMapper.toResponseDto(acc, runningInfo, proxyObj, allowedFeatures, rentalPlanName, rentedBy);
    });
  }

  async getAccountById(id) {
    const account = await this.accountRepo.findById(id);
    if (!account) {
      throw new NotFoundException(`Không tìm thấy tài khoản với ID [${id}]!`);
    }
    const proxy = (account.proxyId && this.proxyRepo) ? await this.proxyRepo.findById(account.proxyId) : null;
    const runningStatuses = this.multiBotManager ? this.multiBotManager.getAllStatuses() : { instances: {} };
    const runningInfo = runningStatuses.instances[account.id] || null;
    const plans = await this._getRentalPlanRules();
    const { allowedFeatures, rentalPlanName } = this._resolvePlanInfo(account.rentalPlan, plans);

    let rentedBy = null;
    if (account.userId && this.userRepo) {
      try {
        const user = await this.userRepo.findById(account.userId);
        if (user) rentedBy = user.email || user.phone || user.id;
      } catch (e) {}
    }

    return AccountMapper.toResponseDto(account, runningInfo, proxy, allowedFeatures, rentalPlanName, rentedBy);
  }

  async getAccount(id) {
    return this.getAccountById(id);
  }

  async saveAccount(data) {
    // 1. Validation & Mapping
    const existing = data.id ? await this.accountRepo.findById(data.id) : null;
    const account = AccountMapper.toEntityFromSaveDto(data, existing);
    account.validate();

    const activeFileId = await this.fileRepo.getActiveFileId();
    const targetFileId = account.fileId || activeFileId || 'file_1';
    account.fileId = targetFileId;

    // 2. Validate account limits within the file and IP/Proxy across entire system
    const targetFile = await this.fileRepo.findById(targetFileId);
    const maxAccounts = targetFile ? (targetFile.maxAccounts || 6) : 6;
    const accountsInFile = await this.accountRepo.findByFileId(targetFileId);
    const allAccountsInSystem = await this.accountRepo.findAll();

    const proxyObj = account.proxyId ? await this.proxyRepo.findById(account.proxyId) : null;
    const proxyName = proxyObj ? proxyObj.name : '';
    ServerLimitRule.validateAccountAddition(
      accountsInFile,
      account.serverId,
      data.id || null,
      account.proxyId || null,
      maxAccounts,
      proxyName,
      allAccountsInSystem
    );

    // 3. Save to database (Single table: accounts -> NO transaction needed)
    const saved = await this.accountRepo.save(account);

    // Update activeAccountId if none set
    const currentActiveAcc = await this.settingRepo.get('activeAccountId');
    if (!currentActiveAcc) {
      await this.settingRepo.set('activeAccountId', saved.id);
    }

    // 4. Auto-restart bot process if running
    if (this.multiBotManager && this.multiBotManager.isAccountRunning(saved.id)) {
      this.multiBotManager.stopAccount(saved.id);
      setTimeout(async () => {
        try {
          await this.multiBotManager.startAccount(saved.id);
        } catch (e) {}
      }, 1200);
    }

    const plans = await this._getRentalPlanRules();
    const { allowedFeatures, rentalPlanName } = this._resolvePlanInfo(saved.rentalPlan, plans);
    let rentedBy = null;
    if (saved.userId && this.userRepo) {
      try {
        const u = await this.userRepo.findById(saved.userId);
        if (u) rentedBy = u.email || u.phone || u.id;
      } catch (e) {}
    }
    return AccountMapper.toResponseDto(saved, null, null, allowedFeatures, rentalPlanName, rentedBy);
  }

  async deleteAccount(accountId) {
    let targetAccount = null;
    if (this.accountRepo) {
      try {
        targetAccount = await this.accountRepo.findById(accountId);
      } catch (e) {}
    }

    // Stop bot if running
    if (this.multiBotManager) {
      this.multiBotManager.stopAccount(accountId);
    }

    // Single table deletion (accounts) -> NO transaction needed
    const deleted = await this.accountRepo.delete(accountId);

    // Reset activeAccountId if it was this account
    const activeAccId = await this.settingRepo.get('activeAccountId');
    if (activeAccId === accountId) {
      const remaining = await this.accountRepo.findAll();
      await this.settingRepo.set('activeAccountId', remaining.length > 0 ? remaining[0].id : null);
    }

    // Clean up MicroEmulator RMS suites on disk
    if (targetAccount) {
      RmsWriter.cleanAccountRmsDirs(targetAccount);
    }

    return deleted;
  }

  async switchServer(accountId, newServerId) {
    const targetAcc = await this.accountRepo.findById(accountId);
    if (!targetAcc) {
      throw new NotFoundException(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    const sId = parseInt(newServerId !== undefined ? newServerId : (targetAcc.serverId === 0 ? 1 : 0), 10) === 1 ? 1 : 0;
    const serverName = sId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';

    // 1. Nếu tài khoản đã được gán Proxy
    if (targetAcc.proxyId && this.proxyRepo) {
      const allAccounts = await this.accountRepo.findAll();
      const livingOnSameProxy = allAccounts.filter(a => a.proxyId === targetAcc.proxyId && a.id !== accountId && !a.isRentalExpired());
      const countNewServerOnProxy = livingOnSameProxy.filter(a => parseInt(a.serverId, 10) === sId).length;

      if (countNewServerOnProxy >= ServerLimitRule.MAX_PER_SERVER) {
        // Proxy hiện tại đã đầy 3/3 ở Server mới -> Tìm Proxy ACTIVE khác còn slot trống để tự động di tản
        const allProxies = await this.proxyRepo.findAll();
        const now = Date.now();
        const candidateProxy = allProxies.find(p => {
          if (p.id === targetAcc.proxyId || p.status !== 'ACTIVE' || p.isExpired) return false;
          if (p.expiresAt && new Date(p.expiresAt).getTime() <= now + 2 * 3600 * 1000) return false;
          const livingBots = allAccounts.filter(a => a.proxyId === p.id && !a.isRentalExpired());
          if (livingBots.length >= ServerLimitRule.MAX_PER_PROXY) return false;
          const sameServerBots = livingBots.filter(a => parseInt(a.serverId, 10) === sId).length;
          return sameServerBots < ServerLimitRule.MAX_PER_SERVER;
        });

        if (!candidateProxy) {
          throw new BadRequestException(
            `❌ Proxy hiện tại đã đủ ${ServerLimitRule.MAX_PER_SERVER} nick Server [${serverName}] và toàn bộ các Proxy ACTIVE khác đều không còn slot trống cho Server này! Vui lòng thêm Proxy mới.`
          );
        }

        console.log(`🔀 [Admin switchServer] Tự động di tản nick [${targetAcc.username}] từ Proxy [${targetAcc.proxyId}] sang Proxy [${candidateProxy.id}] để đổi sang Server [${serverName}].`);
        targetAcc.proxyId = candidateProxy.id;
      }
    } else {
      // 2. Tài khoản không dùng Proxy (Nick Admin chạy IP Direct)
      const allAccounts = await this.accountRepo.findAll();
      const livingOnDirect = allAccounts.filter(a => !a.proxyId && a.id !== accountId && !a.isRentalExpired());
      const countNewServerOnDirect = livingOnDirect.filter(a => parseInt(a.serverId, 10) === sId).length;

      if (countNewServerOnDirect >= ServerLimitRule.MAX_PER_SERVER) {
        throw new BadRequestException(`❌ IP Direct máy chủ đã đủ ${ServerLimitRule.MAX_PER_SERVER} tài khoản Server [${serverName}]! Vui lòng gán Proxy cho tài khoản.`);
      }
      if (livingOnDirect.length >= ServerLimitRule.MAX_PER_PROXY) {
        throw new BadRequestException(`❌ IP Direct máy chủ đã đạt tối đa ${ServerLimitRule.MAX_PER_PROXY} tài khoản! Vui lòng gán Proxy cho tài khoản.`);
      }
    }

    targetAcc.serverId = sId;
    targetAcc.serverName = serverName;

    // Single table update (accounts) -> NO transaction needed
    await this.accountRepo.save(targetAcc);

    // If running, restart the bot with the new server
    if (this.multiBotManager && this.multiBotManager.isAccountRunning(accountId)) {
      this.multiBotManager.stopAccount(accountId);
      setTimeout(async () => {
        try {
          await this.multiBotManager.startAccount(accountId);
        } catch (e) {}
      }, 1500);
    }

    return AccountMapper.toResponseDto(targetAcc);
  }

  async updateSetup(accountId, { targetCoins, upDays, farmSettings, diamondSettings, fishSettings, sellOreSettings }) {
    const targetAcc = await this.accountRepo.findById(accountId);
    if (!targetAcc) {
      throw new NotFoundException(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    // =========================================================================
    // BẢO MẬT TẦNG 1: KIỂM SOÁT QUYỀN TÍNH NĂNG THEO GÓI THUÊ (ANTI-TAMPERING)
    // =========================================================================
    if (targetAcc.rentalPlan) {
      let allowedFeatures = ['farm', 'upThue'];
      let planName = targetAcc.rentalPlan;

      if (this.settingRepo) {
        try {
          const rules = await this.settingRepo.get('rental_allocation_rules');
          const plan = rules?.plans?.[targetAcc.rentalPlan];
          if (plan) {
            if (plan.name) planName = plan.name;
            if (Array.isArray(plan.features)) allowedFeatures = plan.features;
          } else {
            if (targetAcc.rentalPlan === 'FULL') allowedFeatures = ['farm', 'fish', 'diamond', 'sellOre', 'upThue'];
            else if (targetAcc.rentalPlan === 'FISH') allowedFeatures = ['fish', 'upThue'];
            else allowedFeatures = ['farm', 'upThue'];
          }
        } catch (e) {}
      }

      if (farmSettings !== undefined && farmSettings !== null && !allowedFeatures.includes('farm')) {
        throw new BadRequestException(`❌ Gói [${planName}] không hỗ trợ tính năng Auto Farm! Vui lòng nâng cấp gói để sử dụng.`);
      }
      if (fishSettings !== undefined && fishSettings !== null && !allowedFeatures.includes('fish')) {
        throw new BadRequestException(`❌ Gói [${planName}] không hỗ trợ tính năng Auto Câu cá! Vui lòng nâng cấp gói để sử dụng.`);
      }
      if (diamondSettings !== undefined && diamondSettings !== null && !allowedFeatures.includes('diamond')) {
        throw new BadRequestException(`❌ Gói [${planName}] không hỗ trợ tính năng Auto KC! Vui lòng nâng cấp gói để sử dụng.`);
      }
      if (sellOreSettings !== undefined && sellOreSettings !== null && !allowedFeatures.includes('sellOre')) {
        throw new BadRequestException(`❌ Gói [${planName}] không hỗ trợ tính năng Auto Bán đá! Vui lòng nâng cấp gói để sử dụng.`);
      }
      if ((targetCoins !== undefined || upDays !== undefined) && !allowedFeatures.includes('upThue')) {
        throw new BadRequestException(`❌ Gói [${planName}] không hỗ trợ tính năng Cài đặt Úp thuê! Vui lòng nâng cấp gói để sử dụng.`);
      }
    }

    if (targetCoins !== undefined && targetCoins !== null && targetCoins !== '') {
      targetAcc.targetCoins = Math.max(0, parseInt(targetCoins, 10) || 0);
    }
    if (upDays !== undefined && upDays !== null && upDays !== '') {
      targetAcc.upDays = Math.max(0, parseInt(upDays, 10) || 0);
    }
    if (farmSettings !== undefined && farmSettings !== null && typeof farmSettings === 'object') {
      targetAcc.farmSettings = { ...(targetAcc.farmSettings || {}), ...farmSettings };
    }
    if (diamondSettings !== undefined && diamondSettings !== null && typeof diamondSettings === 'object') {
      targetAcc.diamondSettings = { ...(targetAcc.diamondSettings || {}), ...diamondSettings };
    }
    if (fishSettings !== undefined && fishSettings !== null && typeof fishSettings === 'object') {
      targetAcc.fishSettings = { ...(targetAcc.fishSettings || {}), ...fishSettings };
    }
    if (sellOreSettings !== undefined && sellOreSettings !== null && typeof sellOreSettings === 'object') {
      targetAcc.sellOreSettings = { ...(targetAcc.sellOreSettings || {}), ...sellOreSettings };
    }

    // Single table update -> NO transaction needed
    await this.accountRepo.save(targetAcc);

    // Sync to disk RMS files
    const activeFileId = targetAcc.fileId || (await this.fileRepo.getActiveFileId());
    if (targetCoins !== undefined || upDays !== undefined) {
      RmsWriter.writeUpThueRms(targetAcc, { targetCoins: targetAcc.targetCoins, upDays: targetAcc.upDays }, activeFileId);
    }
    if (farmSettings !== undefined) {
      RmsWriter.writeFarmRms(targetAcc, targetAcc.farmSettings, activeFileId);
    }
    if (diamondSettings !== undefined) {
      RmsWriter.writeDiamondRms(targetAcc, targetAcc.diamondSettings, activeFileId);
    }
    if (fishSettings !== undefined) {
      RmsWriter.writeFishRms(targetAcc, targetAcc.fishSettings, activeFileId);
    }
    if (sellOreSettings !== undefined) {
      RmsWriter.writeSellOreRms(targetAcc, targetAcc.sellOreSettings, activeFileId);
    }

    // Apply to running bot process if active
    if (this.multiBotManager) {
      if (targetCoins !== undefined || upDays !== undefined) {
        this.multiBotManager.applySetupToBot(accountId, targetAcc.targetCoins || 0, targetAcc.upDays || 0);
      }
      if (farmSettings !== undefined) {
        this.multiBotManager.applyFarmSettingsToBot(accountId, targetAcc.farmSettings);
      }
      if (diamondSettings !== undefined) {
        this.multiBotManager.applyDiamondSettingsToBot(accountId, targetAcc.diamondSettings);
      }
      if (fishSettings !== undefined) {
        this.multiBotManager.applyFishSettingsToBot(accountId, targetAcc.fishSettings);
      }
      if (sellOreSettings !== undefined) {
        this.multiBotManager.applySellOreSettingsToBot(accountId, targetAcc.sellOreSettings);
      }
    }

    const plans = await this._getRentalPlanRules();
    const { allowedFeatures, rentalPlanName } = this._resolvePlanInfo(targetAcc.rentalPlan, plans);
    return AccountMapper.toResponseDto(targetAcc, null, null, allowedFeatures, rentalPlanName);
  }

  async resetData(accountId) {
    const targetAcc = await this.accountRepo.findById(accountId);
    if (!targetAcc) {
      throw new NotFoundException(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    targetAcc.pendingReset = true;
    targetAcc.targetCoins = 0;
    targetAcc.upDays = 0;

    await this.accountRepo.save(targetAcc);

    const activeFileId = targetAcc.fileId || (await this.fileRepo.getActiveFileId());
    RmsWriter.resetUpThueRms(targetAcc, activeFileId);

    if (this.multiBotManager && this.multiBotManager.isAccountRunning(accountId)) {
      this.multiBotManager.resetBotData(accountId);
    } else {
      try {
        const fs = require('fs');
        const path = require('path');
        const safeAppId = `avatar_${targetAcc.username || targetAcc.id}_${activeFileId || 'def'}`;
        const rmsDir = path.resolve(__dirname, '../../../.microemulator', `suite-${safeAppId}`);
        if (fs.existsSync(rmsDir)) {
          const files = fs.readdirSync(rmsDir);
          for (const file of files) {
            if (file.toLowerCase().includes('data') || file.toLowerCase().includes('coin')) {
              try { fs.unlinkSync(path.join(rmsDir, file)); } catch (e) {}
            }
          }
        }
      } catch (e) {}
    }

    return { success: true, message: `Đã reset dữ liệu up thuê cho tài khoản [${targetAcc.username}].` };
  }

  async inspectRms(accountId) {
    const targetAcc = await this.accountRepo.findById(accountId);
    if (!targetAcc) {
      throw new NotFoundException(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    const activeFileId = targetAcc.fileId || (await this.fileRepo.getActiveFileId()) || 'file_1';
    const targetFile = await this.fileRepo.findById(activeFileId);
    const rmsInfo = RmsWriter.inspectRms(targetAcc, activeFileId);

    return {
      account: {
        id: targetAcc.id,
        username: targetAcc.username,
        serverId: targetAcc.serverId,
        fileId: activeFileId,
        fileName: targetFile?.name || activeFileId,
        gameJar: targetFile?.gameJar || 'avatar_upxu_build34.jar',
        modType: targetFile?.modType ? targetFile.modType.toLowerCase() : 'upxu',
        webSettings: {
          farmSettings: targetAcc.farmSettings || {},
          diamondSettings: targetAcc.diamondSettings || {},
          fishSettings: targetAcc.fishSettings || {},
          sellOreSettings: targetAcc.sellOreSettings || {},
          targetCoins: targetAcc.targetCoins || 0,
          upDays: targetAcc.upDays || 0
        }
      },
      rms: rmsInfo
    };
  }

  async auditRms(accountId) {
    const targetAcc = await this.accountRepo.findById(accountId);
    if (!targetAcc) {
      throw new NotFoundException(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }
    const RmsAuditService = require('./RmsAuditService');
    const auditor = new RmsAuditService(this.settingRepo, this.fileRepo);
    return auditor.auditAccount(targetAcc);
  }

  async fixAndSyncRms(accountId) {
    const targetAcc = await this.accountRepo.findById(accountId);
    if (!targetAcc) {
      throw new NotFoundException(`Không tìm thấy tài khoản với ID [${accountId}]!`);
    }

    const activeFileId = targetAcc.fileId || (await this.fileRepo.getActiveFileId()) || 'file_1';
    RmsWriter.writeUpThueRms(targetAcc, { targetCoins: targetAcc.targetCoins, upDays: targetAcc.upDays }, activeFileId);
    if (targetAcc.farmSettings) RmsWriter.writeFarmRms(targetAcc, targetAcc.farmSettings, activeFileId);
    if (targetAcc.diamondSettings) RmsWriter.writeDiamondRms(targetAcc, targetAcc.diamondSettings, activeFileId);
    if (targetAcc.fishSettings) RmsWriter.writeFishRms(targetAcc, targetAcc.fishSettings, activeFileId);
    if (targetAcc.sellOreSettings) RmsWriter.writeSellOreRms(targetAcc, targetAcc.sellOreSettings, activeFileId);

    if (this.multiBotManager) {
      if (targetAcc.farmSettings) this.multiBotManager.applyFarmSettingsToBot(accountId, targetAcc.farmSettings);
      if (targetAcc.diamondSettings) this.multiBotManager.applyDiamondSettingsToBot(accountId, targetAcc.diamondSettings);
      if (targetAcc.fishSettings) this.multiBotManager.applyFishSettingsToBot(accountId, targetAcc.fishSettings);
      if (targetAcc.sellOreSettings) this.multiBotManager.applySellOreSettingsToBot(accountId, targetAcc.sellOreSettings);
    }

    const RmsAuditService = require('./RmsAuditService');
    const auditor = new RmsAuditService(this.settingRepo, this.fileRepo);
    const auditReport = auditor.auditAccount(targetAcc);

    return {
      success: true,
      message: `Đã tự động sửa và đồng bộ toàn bộ file RMS cho [${targetAcc.username}]!`,
      audit: auditReport
    };
  }
}

module.exports = AccountService;
