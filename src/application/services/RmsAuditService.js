const fs = require('fs');
const path = require('path');
const RmsWriter = require('../../infrastructure/storage/RmsWriter');

/**
 * RmsAuditService
 * Tự động kiểm tra, so sánh dữ liệu Web Settings và Binary RecordStore (.rs),
 * và tự động lưu lại lịch sử lỗi vào logs/rms-audit-errors.json để phân tích và khắc phục.
 */
class RmsAuditService {
  constructor(configRepo) {
    this.configRepo = configRepo;
    this.logsDir = path.resolve(process.cwd(), 'logs');
    this.errorLogPath = path.join(this.logsDir, 'rms-audit-errors.json');
    this.historyLogPath = path.join(this.logsDir, 'rms-audit-history.log');
    this.ensureLogDir();
  }

  ensureLogDir() {
    if (!fs.existsSync(this.logsDir)) {
      try {
        fs.mkdirSync(this.logsDir, { recursive: true });
      } catch (e) {}
    }
  }

  auditAccount(account) {
    const config = this.configRepo.get();
    const targetFileId = account.fileId || config.activeFileId || 'file_1';
    const targetFile = (config.botFiles || []).find(f => f.id === targetFileId);

    const rmsInfo = RmsWriter.inspectRms(account, targetFileId);
    const decoded = rmsInfo.decoded || {};
    const mismatches = [];

    const checkField = (category, fieldName, label, webVal, rmsVal) => {
      if (webVal === undefined || webVal === null) return;
      const strWeb = String(webVal).trim();
      const strRms = String(rmsVal ?? '').trim();

      if (rmsVal === undefined || rmsVal === null) {
        mismatches.push({
          category,
          field: fieldName,
          label,
          webValue: webVal,
          rmsValue: null,
          status: 'MISSING_IN_RMS',
          statusText: 'Chưa nạp vô RMS',
          message: `Trường [${label}] chưa tồn tại trong file RMS của game!`
        });
      } else if (typeof webVal === 'boolean' && typeof rmsVal === 'boolean' && webVal !== rmsVal) {
        mismatches.push({
          category,
          field: fieldName,
          label,
          webValue: webVal,
          rmsValue: rmsVal,
          status: 'BOOLEAN_INVERTED',
          statusText: 'BỊ NẠP NGƯỢC (ĐẢO CỜ)',
          message: `Trường [${label}] bị nạp ngược logic: Web=${webVal} nhưng Game đọc ra là ${rmsVal}!`
        });
      } else if (strWeb !== strRms) {
        mismatches.push({
          category,
          field: fieldName,
          label,
          webValue: webVal,
          rmsValue: rmsVal,
          status: 'VALUE_MISMATCH',
          statusText: 'Lệch giá trị',
          message: `Lệch giá trị: Web=${strWeb} vs Game=${strRms}`
        });
      }
    };

    // 1. Audit Farm Settings
    const wf = account.farmSettings || {};
    const rf = decoded.farm || {};
    checkField('farm', 'mode', 'Cơ chế Farm', wf.mode, rf.mode);
    checkField('farm', 'backupDishes', 'Món ăn phụ', wf.backupDishes, rf.backupDishes);
    checkField('farm', 'backupSeeds', 'Cây dự bị', wf.backupSeeds, rf.backupSeeds);
    checkField('farm', 'replaceSeedThreshold', 'Ngưỡng mua hạt dự bị', wf.replaceSeedThreshold, rf.replaceSeedThreshold);
    checkField('farm', 'fish', 'Nuôi cá', wf.fish, rf.fish);
    checkField('farm', 'animal', 'Nuôi gia súc', wf.animal, rf.animal);
    checkField('farm', 'sellProducts', 'Tự bán nông sản', wf.sellProducts, rf.sellProducts);
    checkField('farm', 'sellThreshold', 'Ngưỡng bán nông sản', wf.sellThreshold, rf.sellThreshold);
    checkField('farm', 'sellQuantity', 'Số lượng bán mỗi lần', wf.sellQuantity, rf.sellQuantity);
    checkField('farm', 'maxStarfruitLevel', 'Cấp khế tối đa', wf.maxStarfruitLevel, rf.maxStarfruitLevel);
    checkField('farm', 'dailyAttendance', 'Điểm danh hàng ngày', wf.dailyAttendance !== false, rf.dailyAttendance);
    checkField('farm', 'upgradeStarfruit', 'Nâng cấp cây khế', Boolean(wf.upgradeStarfruit), rf.upgradeStarfruit);
    checkField('farm', 'harvestHearts', 'Thu hoạch tim', wf.harvestHearts !== false, rf.harvestHearts);

    checkField('farm', 'feedBaby', 'Cho ăn baby', Boolean(wf.feedBaby), rf.feedBaby);
    checkField('farm', 'buyMilkWithGold', 'Mua sữa vàng', Boolean(wf.buyMilkWithGold), rf.buyMilkWithGold);
    checkField('farm', 'upgradeBaby', 'Nâng cấp baby', Boolean(wf.upgradeBaby), rf.upgradeBaby);
    checkField('farm', 'hatchDragon', 'Ấp rồng', Boolean(wf.hatchDragon), rf.hatchDragon);
    checkField('farm', 'trainDragon', 'Luyện rồng', Boolean(wf.trainDragon), rf.trainDragon);
    checkField('farm', 'deliverOrders', 'Giao đơn hàng', Boolean(wf.deliverOrders), rf.deliverOrders);
    checkField('farm', 'noBuyWithGold', 'Không mua bằng vàng', wf.noBuyWithGold !== false, rf.noBuyWithGold);

    // 2. Audit Diamond Settings
    const wd = account.diamondSettings || {};
    const rd = decoded.diamond || {};
    checkField('diamond', 'sellOreOnFull', 'Bán đá khi rương đầy', wd.sellOreOnFull !== false, rd.sellOreOnFull);
    checkField('diamond', 'autoFarm', 'Tự về chăm Farm', wd.autoFarm !== false, rd.autoFarm);
    checkField('diamond', 'farmIntervalMinutes', 'Thời gian về farm', wd.farmIntervalMinutes || 60, rd.farmIntervalMinutes);
    checkField('diamond', 'harvestOnTime', 'Thu hoạch farm đúng giờ', wd.harvestOnTime !== false, rd.harvestOnTime);
    checkField('diamond', 'priorityOrder', 'Thứ tự ưu tiên', wd.priorityOrder !== undefined ? wd.priorityOrder : 6, rd.priorityOrder);
    checkField('diamond', 'autoDropKcx', 'Tự bỏ Kim Cương Xanh', Boolean(wd.autoDropKcx), rd.autoDropKcx);
    checkField('diamond', 'autoDropNhb', 'Tự bỏ Nham Thạch', Boolean(wd.autoDropNhb), rd.autoDropNhb);

    // 3. Audit Sell Ore Settings
    const ws = account.sellOreSettings || {};
    const rs = decoded.sellOre || {};
    checkField('sellOre', 'sellIntervalMinutes', 'Giãn cách bán đá', ws.sellIntervalMinutes || 15, rs.sellIntervalMinutes);
    checkField('sellOre', 'delayMs', 'Quãng nghỉ delay', ws.delayMs || 100, rs.delayMs);
    checkField('sellOre', 'zoneFrom', 'Khu bán từ', ws.zoneFrom !== undefined ? ws.zoneFrom : 20, rs.zoneFrom);
    checkField('sellOre', 'zoneTo', 'Khu bán đến', ws.zoneTo !== undefined ? ws.zoneTo : 79, rs.zoneTo);
    checkField('sellOre', 'resetTimeOnNhb', 'Reset time khi bán dc NHB', ws.resetTimeOnNhb !== false, rs.resetTimeOnNhb);
    checkField('sellOre', 'resetTimeOnKcx', 'Reset time khi bán dc KCX', Boolean(ws.resetTimeOnKcx), rs.resetTimeOnKcx);
    checkField('sellOre', 'dropNhbIfFailed', 'Bỏ NHB nếu ko bán dc', ws.dropNhbIfFailed !== false, rs.dropNhbIfFailed);
    checkField('sellOre', 'dropKcxIfFailed', 'Bỏ KCX nếu ko bán dc', ws.dropKcxIfFailed !== false, rs.dropKcxIfFailed);

    // 4. Audit Fish Settings
    const wfi = account.fishSettings || {};
    const rfi = decoded.fish || {};
    checkField('fish', 'mapType', 'Khu câu', wfi.mapType !== undefined ? wfi.mapType : 0, rfi.mapType);
    checkField('fish', 'sellFishType', 'Cách bán cá', wfi.sellFishType !== undefined ? wfi.sellFishType : 0, rfi.sellFishType);
    checkField('fish', 'autoBuyTicket', 'Tự mua vé câu', wfi.autoBuyTicket !== false, rfi.autoBuyTicket);
    checkField('fish', 'sellKcx', 'Bán KCX khi câu', Boolean(wfi.sellKcx), rfi.sellKcx);
    checkField('fish', 'rodType', 'Loại cần câu', wfi.rodType !== undefined ? wfi.rodType : 0, rfi.rodType);
    checkField('fish', 'backToFarm', 'Tự về Farm chăm cây', wfi.backToFarm !== false, rfi.backToFarm);
    checkField('fish', 'farmIntervalMinutes', 'Thời gian về Farm', wfi.farmIntervalMinutes || 30, rfi.farmIntervalMinutes);
    checkField('fish', 'sellKcxThreshold', 'Ngưỡng bán KCX', wfi.sellKcxThreshold || 5, rfi.sellKcxThreshold);
    checkField('fish', 'harvestOnTime', 'Thu hoạch farm đúng giờ', wfi.harvestOnTime !== false, rfi.harvestOnTime);

    const isSynced = mismatches.length === 0;

    const report = {
      timestamp: new Date().toISOString(),
      timestampFormatted: new Date().toLocaleString('vi-VN'),
      account: {
        id: account.id,
        username: account.username,
        serverId: account.serverId,
        fileId: targetFileId,
        gameJar: targetFile?.gameJar || config.gameJar || 'avatar_upxu_build34.jar'
      },
      rmsDir: rmsInfo.dirPath,
      hasLoginRms: rmsInfo.hasLoginRms,
      totalFiles: rmsInfo.files ? rmsInfo.files.length : 0,
      isSynced,
      mismatchCount: mismatches.length,
      mismatches,
      decoded
    };

    // Tự động ghi lại lỗi nếu có sai lệch
    if (!isSynced) {
      this.recordError(report);
    }

    return report;
  }

  recordError(report) {
    try {
      this.ensureLogDir();
      let errorHistory = [];
      if (fs.existsSync(this.errorLogPath)) {
        try {
          const raw = fs.readFileSync(this.errorLogPath, 'utf8');
          errorHistory = JSON.parse(raw);
          if (!Array.isArray(errorHistory)) errorHistory = [];
        } catch (e) {
          errorHistory = [];
        }
      }

      // Giữ tối đa 50 bản ghi lỗi gần nhất
      errorHistory.unshift(report);
      if (errorHistory.length > 50) errorHistory = errorHistory.slice(0, 50);

      fs.writeFileSync(this.errorLogPath, JSON.stringify(errorHistory, null, 2), 'utf8');

      // Ghi text log tóm tắt
      const line = `[${report.timestampFormatted}] [ACC: ${report.account.username}] Phát hiện ${report.mismatchCount} lỗi lệch RMS:\n` +
        report.mismatches.map(m => `  -> [${m.category}] ${m.label} (${m.field}): Web='${m.webValue}' vs RMS='${m.rmsValue}'`).join('\n') + '\n\n';
      fs.appendFileSync(this.historyLogPath, line, 'utf8');
    } catch (err) {
      console.error('[RmsAuditService] Lỗi khi ghi log lỗi RMS:', err.message);
    }
  }

  auditAllAccounts() {
    const config = this.configRepo.get();
    const accounts = config.accounts || [];
    return accounts.map(acc => this.auditAccount(acc));
  }

  randomTestAccount(account, rounds = 1) {
    const config = this.configRepo.get();
    const targetFileId = account.fileId || config.activeFileId || 'file_1';
    const totalRounds = Math.max(1, Math.min(10, parseInt(rounds, 10) || 1));

    let lastReport = null;
    let accumulatedMismatches = [];
    let lastRandomValues = null;

    for (let round = 1; round <= totalRounds; round++) {
      // 1. Sinh ngẫu nhiên toàn diện dữ liệu test cho từng vòng
      const randomFarm = {
        mode: Math.random() > 0.5 ? 1 : 0,
        backupDishes: String(Math.floor(Math.random() * 50) + 1),
        backupSeeds: String(Math.floor(Math.random() * 50) + 1),
        replaceSeedThreshold: Math.floor(Math.random() * 10),
        fish: Math.floor(Math.random() * 4),
        animal: Math.floor(Math.random() * 4),
        sellProducts: String(Math.floor(Math.random() * 50) + 1),
        sellThreshold: Math.floor(Math.random() * 200) + 5,
        sellQuantity: Math.floor(Math.random() * 80) + 10,
        maxStarfruitLevel: Math.floor(Math.random() * 15) + 1,
        dailyAttendance: Math.random() > 0.5,
        upgradeStarfruit: Math.random() > 0.5,
        harvestHearts: Math.random() > 0.5,
        feedBaby: Math.random() > 0.5,
        buyMilkWithGold: Math.random() > 0.5,
        upgradeBaby: Math.random() > 0.5,
        hatchDragon: Math.random() > 0.5,
        trainDragon: Math.random() > 0.5,
        deliverOrders: Math.random() > 0.5,
        noBuyWithGold: Math.random() > 0.5
      };

      const randomDiamond = {
        sellOreOnFull: Math.random() > 0.5,
        autoDropKcx: Math.random() > 0.5,
        autoDropNhb: Math.random() > 0.5,
        autoFarm: Math.random() > 0.5,
        farmIntervalMinutes: Math.floor(Math.random() * 90) + 10,
        harvestOnTime: Math.random() > 0.5,
        priorityOrder: Math.floor(Math.random() * 6) + 1
      };

      const randomSellOre = {
        sellIntervalMinutes: Math.floor(Math.random() * 50) + 5,
        delayMs: Math.floor(Math.random() * 400) + 80,
        zoneFrom: Math.floor(Math.random() * 25) + 1,
        zoneTo: Math.floor(Math.random() * 40) + 40,
        resetTimeOnNhb: Math.random() > 0.5,
        resetTimeOnKcx: Math.random() > 0.5,
        dropNhbIfFailed: Math.random() > 0.5,
        dropKcxIfFailed: Math.random() > 0.5
      };

      const randomFish = {
        mapType: Math.floor(Math.random() * 3),
        sellFishType: Math.floor(Math.random() * 3),
        autoBuyTicket: Math.random() > 0.5,
        sellKcx: Math.random() > 0.5,
        excludeFish: '',
        rodType: Math.floor(Math.random() * 4),
        backToFarm: Math.random() > 0.5,
        farmIntervalMinutes: Math.floor(Math.random() * 45) + 5,
        sellKcxThreshold: Math.floor(Math.random() * 10) + 1,
        harvestOnTime: Math.random() > 0.5
      };

      const testAccount = {
        ...account,
        farmSettings: randomFarm,
        diamondSettings: randomDiamond,
        sellOreSettings: randomSellOre,
        fishSettings: randomFish
      };

      // 2. Ghi trực tiếp xuống file RMS trên ổ cứng
      RmsWriter.writeFarmRms(testAccount, randomFarm, targetFileId);
      RmsWriter.writeDiamondRms(testAccount, randomDiamond, targetFileId);
      RmsWriter.writeFishRms(testAccount, randomFish, targetFileId);
      RmsWriter.writeSellOreRms(testAccount, randomSellOre, targetFileId);

      // 3. Chạy audit giải mã đối chiếu lại từ đĩa
      const report = this.auditAccount(testAccount);
      lastReport = report;
      lastRandomValues = {
        farm: randomFarm,
        diamond: randomDiamond,
        sellOre: randomSellOre,
        fish: randomFish
      };

      if (!report.isSynced) {
        accumulatedMismatches.push(...report.mismatches.map(m => ({ ...m, round })));
        report.testType = 'RANDOM_STRESS_TEST';
        this.recordError(report);
        break; // Dừng ngay nếu phát hiện vòng nào bị lỗi để dev dễ xem
      }
    }

    const hasFailed = accumulatedMismatches.length > 0 || !lastReport?.isSynced;
    const finalMismatches = hasFailed ? (accumulatedMismatches.length > 0 ? accumulatedMismatches : lastReport?.mismatches || []) : [];

    return {
      success: true,
      testType: 'RANDOM_STRESS_TEST',
      roundsTested: totalRounds,
      testedFieldsCount: 36 * totalRounds,
      isSynced: !hasFailed,
      mismatchCount: finalMismatches.length,
      mismatches: finalMismatches,
      randomValues: lastRandomValues,
      decoded: lastReport?.decoded,
      message: !hasFailed
        ? `✅ Stress Test ${totalRounds} vòng thành công! Toàn bộ các trường dữ liệu ngẫu nhiên nạp vào RMS đều khớp 100% với game đọc ra!`
        : `⚠️ Phát hiện ${finalMismatches.length} lỗi lệch/ngược khi chạy Stress Test!`
    };
  }

  restoreOriginalAccount(account) {
    const config = this.configRepo.get();
    const targetFileId = account.fileId || config.activeFileId || 'file_1';

    // 1. Ghi lại cài đặt gốc của tài khoản trên Web xuống file RMS
    if (account.farmSettings) RmsWriter.writeFarmRms(account, account.farmSettings, targetFileId);
    if (account.diamondSettings) RmsWriter.writeDiamondRms(account, account.diamondSettings, targetFileId);
    if (account.fishSettings) RmsWriter.writeFishRms(account, account.fishSettings, targetFileId);
    if (account.sellOreSettings) RmsWriter.writeSellOreRms(account, account.sellOreSettings, targetFileId);
    RmsWriter.writeUpThueRms(account, { targetCoins: account.targetCoins, upDays: account.upDays }, targetFileId);

    // 2. Chạy audit lại để đối chiếu
    const report = this.auditAccount(account);
    return {
      success: true,
      message: `Đã nạp lại thành công RMS gốc từ Cài Đặt Web cho nick [${account.username}]!`,
      ...report
    };
  }

  getErrorLogs() {
    if (fs.existsSync(this.errorLogPath)) {
      try {
        return JSON.parse(fs.readFileSync(this.errorLogPath, 'utf8'));
      } catch (e) {
        return [];
      }
    }
    return [];
  }
}

module.exports = RmsAuditService;
