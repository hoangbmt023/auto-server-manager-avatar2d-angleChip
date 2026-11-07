const fs = require('fs');
const path = require('path');
const RmsWriter = require('../../infrastructure/storage/RmsWriter');

/**
 * RmsAuditService
 * Tự động kiểm tra, so sánh dữ liệu Web Settings và Binary RecordStore (.rs),
 * và tự động lưu lại lịch sử lỗi vào logs/rms-audit-errors.json để phân tích và khắc phục.
 * Powered 100% by MySQL Repositories (Database-Driven, zero config.json dependency).
 */
class RmsAuditService {
  constructor(settingRepo = null, fileRepo = null) {
    this.settingRepo = settingRepo;
    this.fileRepo = fileRepo;
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
    const targetFileId = account.fileId || 'file_1';
    const rmsInfo = RmsWriter.inspectRms(account, targetFileId);
    const decoded = rmsInfo.decoded || {};
    const mismatches = [];

    const checkField = (category, fieldName, label, webVal, rmsVal) => {
      if (webVal === undefined || webVal === null) return;
      const strWeb = String(webVal).trim();
      const strRms = String(rmsVal ?? '').trim();

      if (strWeb !== strRms) {
        mismatches.push({
          category,
          field: fieldName,
          label,
          webValue: webVal,
          rmsValue: rmsVal ?? null,
          severity: 'error'
        });
      }
    };

    // 1. Kiểm tra Up Thue (.c)
    if (account.targetCoins !== undefined) {
      checkField('Up Thuê', 'targetCoins', 'Mục tiêu Xu', account.targetCoins, decoded.targetCoins);
    }
    if (account.upDays !== undefined) {
      checkField('Up Thuê', 'upDays', 'Số ngày Up', account.upDays, decoded.upDays);
    }

    // 2. Kiểm tra Farm (.f)
    if (account.farmSettings) {
      const f = account.farmSettings;
      checkField('Farm', 'mode', 'Chế độ Farm', f.mode, decoded.farm?.mode);
      checkField('Farm', 'fish', 'Chăm Cá', f.fish, decoded.farm?.fish);
      checkField('Farm', 'animal', 'Chăm Pet/Gia súc', f.animal, decoded.farm?.animal);
      checkField('Farm', 'harvestHearts', 'Thu hoạch Tim', f.harvestHearts, decoded.farm?.harvestHearts);
      checkField('Farm', 'dailyAttendance', 'Điểm danh hằng ngày', f.dailyAttendance, decoded.farm?.dailyAttendance);
      checkField('Farm', 'deliverOrders', 'Giao Đơn Hàng', f.deliverOrders, decoded.farm?.deliverOrders);
      checkField('Farm', 'hatchDragon', 'Nuôi Rồng', f.hatchDragon, decoded.farm?.hatchDragon);
      checkField('Farm', 'trainDragon', 'Luyện Rồng', f.trainDragon, decoded.farm?.trainDragon);
      checkField('Farm', 'noBuyWithGold', 'Không mua hạt bằng Lượng', f.noBuyWithGold, decoded.farm?.noBuyWithGold);
      checkField('Farm', 'upgradeStarfruit', 'Nâng cấp Khế', f.upgradeStarfruit, decoded.farm?.upgradeStarfruit);
      checkField('Farm', 'maxStarfruitLevel', 'Cấp Khế tối đa', f.maxStarfruitLevel, decoded.farm?.maxStarfruitLevel);
      checkField('Farm', 'sellProducts', 'Bán nông sản ID', f.sellProducts, decoded.farm?.sellProducts);
      checkField('Farm', 'sellThreshold', 'Ngưỡng bán nông sản', f.sellThreshold, decoded.farm?.sellThreshold);
      checkField('Farm', 'sellQuantity', 'Số lượng bán', f.sellQuantity, decoded.farm?.sellQuantity);
      checkField('Farm', 'backupSeeds', 'Hạt giống dự phòng', f.backupSeeds, decoded.farm?.backupSeeds);
      checkField('Farm', 'replaceSeedThreshold', 'Ngưỡng đổi hạt', f.replaceSeedThreshold, decoded.farm?.replaceSeedThreshold);
      checkField('Farm', 'backupDishes', 'Món ăn nấu dự phòng', f.backupDishes, decoded.farm?.backupDishes);
    }

    // 3. Kiểm tra Diamond (.d)
    if (account.diamondSettings) {
      const d = account.diamondSettings;
      checkField('Kim Cương', 'enabled', 'Bật Auto KC', d.enabled, decoded.diamond?.enabled);
      checkField('Kim Cương', 'minCoins', 'Xu tối thiểu để chơi', d.minCoins, decoded.diamond?.minCoins);
      checkField('Kim Cương', 'betAmount', 'Mức cược Xu', d.betAmount, decoded.diamond?.betAmount);
    }

    // 4. Kiểm tra Fish (.s)
    if (account.fishSettings) {
      const s = account.fishSettings;
      checkField('Câu Cá', 'enabled', 'Bật Auto Câu Cá', s.enabled, decoded.fish?.enabled);
      checkField('Câu Cá', 'location', 'Khu vực câu', s.location, decoded.fish?.location);
      checkField('Câu Cá', 'rodType', 'Loại cần câu', s.rodType, decoded.fish?.rodType);
      checkField('Câu Cá', 'baitType', 'Loại mồi câu', s.baitType, decoded.fish?.baitType);
    }

    // 5. Kiểm tra Sell Ore (.o)
    if (account.sellOreSettings) {
      const o = account.sellOreSettings;
      checkField('Bán Đá', 'enabled', 'Bật Bán Đá/Quặng', o.enabled, decoded.sellOre?.enabled);
      checkField('Bán Đá', 'ores', 'Danh sách quặng bán', o.ores, decoded.sellOre?.ores);
    }

    const report = {
      accountId: account.id,
      username: account.username,
      fileId: targetFileId,
      timestamp: new Date().toISOString(),
      isConsistent: mismatches.length === 0,
      totalMismatches: mismatches.length,
      mismatches,
      rawRms: rmsInfo
    };

    if (mismatches.length > 0) {
      this.logAuditError(report);
    }

    return report;
  }

  logAuditError(report) {
    try {
      let existingErrors = [];
      if (fs.existsSync(this.errorLogPath)) {
        try {
          existingErrors = JSON.parse(fs.readFileSync(this.errorLogPath, 'utf8'));
          if (!Array.isArray(existingErrors)) existingErrors = [];
        } catch (e) {
          existingErrors = [];
        }
      }

      const cleanMismatches = report.mismatches.map(m => ({
        category: m.category,
        field: m.field,
        label: m.label,
        webValue: m.webValue,
        rmsValue: m.rmsValue
      }));

      const errorEntry = {
        timestamp: report.timestamp,
        accountId: report.accountId,
        username: report.username,
        fileId: report.fileId,
        mismatchesCount: report.totalMismatches,
        mismatches: cleanMismatches
      };

      existingErrors.unshift(errorEntry);
      if (existingErrors.length > 100) {
        existingErrors = existingErrors.slice(0, 100);
      }

      fs.writeFileSync(this.errorLogPath, JSON.stringify(existingErrors, null, 2), 'utf8');

      const line = `[${report.timestamp}] [${report.username}] (File: ${report.fileId}) => Phát hiện ${report.totalMismatches} lỗi sai lệch: ` +
        cleanMismatches.map(m => `${m.label} (Web: ${m.webValue} != RMS: ${m.rmsValue})`).join(', ') + '\n';
      fs.appendFileSync(this.historyLogPath, line, 'utf8');
    } catch (err) {
      console.error('[RmsAuditService] Lỗi khi ghi log lỗi RMS:', err.message);
    }
  }

  getAuditErrors(limit = 50) {
    if (!fs.existsSync(this.errorLogPath)) return [];
    try {
      const data = JSON.parse(fs.readFileSync(this.errorLogPath, 'utf8'));
      return Array.isArray(data) ? data.slice(0, limit) : [];
    } catch (e) {
      return [];
    }
  }

  clearAuditErrors() {
    try {
      if (fs.existsSync(this.errorLogPath)) fs.unlinkSync(this.errorLogPath);
      return true;
    } catch (e) {
      return false;
    }
  }
}

module.exports = RmsAuditService;
