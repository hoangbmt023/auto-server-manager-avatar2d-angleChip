const fs = require('fs');
const path = require('path');

/**
 * RmsWriter
 * Directly creates and updates MicroEmulator RecordStore (.rs) binary files
 * for Up Thue Settings, Farm Settings, Diamond (KC) Settings, etc.
 * Formatted strictly according to MicroEmulator FileSystemRecordStore binary structure.
 */
class RmsWriter {
  /**
   * Builds valid MicroEmulator binary RecordStore file (.rs) containing 1 record
   */
  static buildRecordStore(recordStoreName, payload) {
    const nameBuf = Buffer.from(recordStoreName, 'utf-8');
    const headerLen = 2 + nameBuf.length + 4 + 8 + 4 + 4 + 4;
    const header = Buffer.alloc(headerLen);
    let off = 0;

    header.writeUInt16BE(nameBuf.length, off); off += 2;
    nameBuf.copy(header, off); off += nameBuf.length;
    header.writeInt32BE(1, off); off += 4; // version = 1
    header.writeBigInt64BE(BigInt(Date.now()), off); off += 8; // lastModified timestamp
    header.writeInt32BE(2, off); off += 4; // nextRecordId = 2
    header.writeInt32BE(1, off); off += 4; // numRecords = 1
    header.writeInt32BE(payload.length, off); off += 4; // record 1 size

    return Buffer.concat([header, payload]);
  }

  static getSuiteDirs(account, fileId = 'file_1') {
    const fId = account.fileId || fileId || 'file_1';
    const cleanUser = String(account.username || account.id).replace(/[^a-zA-Z0-9_-]/g, '_');
    const dirs = new Set();

    dirs.add(path.join(process.cwd(), '.microemulator', `suite-avatar_${cleanUser}_${fId}`));
    dirs.add(path.join(process.cwd(), '.microemulator', `suite-avatar_${cleanUser}`));
    dirs.add(path.join(process.cwd(), '.microemulator', 'suite-avatar_main'));
    if (account.appId) {
      dirs.add(path.join(process.cwd(), '.microemulator', `suite-${account.appId.replace(/[^a-zA-Z0-9_-]/g, '_')}`));
    }
    return Array.from(dirs);
  }

  /**
   * Writes Up Thue data (chip_<user>Data.rs, chip_Data.rs)
   * 28-byte payload: xuBanDau(int32), startedTs(int64), upDays(int32), targetCoins(int32), lastUpdateTs(int64)
   */
  static writeUpThueRms(account, { targetCoins, upDays }, fileId = 'file_1') {
    try {
      const suiteDirs = this.getSuiteDirs(account, fileId);
      const cleanUser = String(account.username || account.id);

      for (const suiteDir of suiteDirs) {
        if (!fs.existsSync(suiteDir)) {
          fs.mkdirSync(suiteDir, { recursive: true });
        }

        const dataFileUser = path.join(suiteDir, `chip_${cleanUser}Data.rs`);
        let xuBanDau = 0;
        let startedTs = BigInt(Date.now());
        let curUpDays = upDays !== undefined && upDays !== null ? parseInt(upDays, 10) : 0;
        let curTargetCoins = targetCoins !== undefined && targetCoins !== null ? parseInt(targetCoins, 10) : 0;
        let lastUpdateTs = BigInt(Date.now());

        // Preserve existing starting coins / timestamps if file already exists
        if (fs.existsSync(dataFileUser)) {
          try {
            const buf = fs.readFileSync(dataFileUser);
            // Parse existing payload
            if (buf.length >= 2) {
              const nLen = buf.readUInt16BE(0);
              const payloadOffset = 2 + nLen + 20 + 4;
              if (buf.length >= payloadOffset + 28) {
                xuBanDau = buf.readInt32BE(payloadOffset);
                startedTs = buf.readBigInt64BE(payloadOffset + 4);
                if (upDays === undefined) curUpDays = buf.readInt32BE(payloadOffset + 12);
                if (targetCoins === undefined) curTargetCoins = buf.readInt32BE(payloadOffset + 16);
              }
            }
          } catch (e) {}
        }

        const payload = Buffer.alloc(28);
        payload.writeInt32BE(xuBanDau, 0);
        payload.writeBigInt64BE(startedTs, 4);
        payload.writeInt32BE(curUpDays, 12);
        payload.writeInt32BE(curTargetCoins, 16);
        payload.writeBigInt64BE(lastUpdateTs, 20);

        // Write both user-specific and generic fallback RMS files
        const userBuf = this.buildRecordStore(`chip_${cleanUser}Data`, payload);
        fs.writeFileSync(dataFileUser, userBuf);

        const genericBuf = this.buildRecordStore('chip_Data', payload);
        fs.writeFileSync(path.join(suiteDir, 'chip_Data.rs'), genericBuf);
      }
    } catch (err) {
      console.error(`[RmsWriter] Lỗi ghi RMS Up Thuê cho ${account.username}:`, err.message);
    }
  }

  /**
   * Resets Up Thue stats (earned coins, collected hearts)
   * 8-byte payload: earnedCoins(int32) = 0, collectedHearts(int32) = 0
   */
  static resetUpThueRms(account, fileId = 'file_1') {
    try {
      const suiteDirs = this.getSuiteDirs(account, fileId);
      const cleanUser = String(account.username || account.id);

      for (const suiteDir of suiteDirs) {
        if (!fs.existsSync(suiteDir)) {
          fs.mkdirSync(suiteDir, { recursive: true });
        }

        const coinPayload = Buffer.alloc(8);
        coinPayload.writeInt32BE(0, 0);
        coinPayload.writeInt32BE(0, 4);

        const userCoinBuf = this.buildRecordStore(`chip_${cleanUser}Coin`, coinPayload);
        fs.writeFileSync(path.join(suiteDir, `chip_${cleanUser}Coin.rs`), userCoinBuf);

        const genericCoinBuf = this.buildRecordStore('chip_Coin', coinPayload);
        fs.writeFileSync(path.join(suiteDir, 'chip_Coin.rs'), genericCoinBuf);

        // Reset Data timestamps to now
        const dataFileUser = path.join(suiteDir, `chip_${cleanUser}Data.rs`);
        if (fs.existsSync(dataFileUser)) {
          try {
            const buf = fs.readFileSync(dataFileUser);
            if (buf.length >= 2) {
              const nLen = buf.readUInt16BE(0);
              const payloadOffset = 2 + nLen + 20 + 4;
              if (buf.length >= payloadOffset + 28) {
                const now = BigInt(Date.now());
                buf.writeBigInt64BE(now, payloadOffset + 4); // startedTs
                buf.writeBigInt64BE(now, payloadOffset + 20); // lastUpdateTs
                fs.writeFileSync(dataFileUser, buf);
              }
            }
          } catch (e) {}
        }
      }
    } catch (err) {
      console.error(`[RmsWriter] Lỗi reset RMS Up Thuê cho ${account.username}:`, err.message);
    }
  }

  /**
   * Writes Diamond Settings RMS
   */
  static writeDiamondRms(account, diamondSettings, fileId = 'file_1') {
    if (!diamondSettings) return;
    try {
      const suiteDirs = this.getSuiteDirs(account, fileId);
      for (const suiteDir of suiteDirs) {
        if (!fs.existsSync(suiteDir)) {
          fs.mkdirSync(suiteDir, { recursive: true });
        }

        const payload = Buffer.alloc(10);
        let offset = 0;
        payload.writeInt8(diamondSettings.sellOreOnFull !== false ? 1 : 0, offset++);
        payload.writeInt8(diamondSettings.autoDropKcx ? 1 : 0, offset++);
        payload.writeInt8(diamondSettings.autoDropNhb ? 1 : 0, offset++);
        const autoFarm = diamondSettings.autoFarm !== false ? 1 : 0;
        payload.writeInt8(autoFarm, offset++);
        payload.writeInt32BE(Math.max(1, parseInt(diamondSettings.farmIntervalMinutes, 10) || 60), offset);
        offset += 4;
        payload.writeInt8(autoFarm && diamondSettings.harvestOnTime !== false ? 1 : 0, offset++);
        payload.writeInt8(parseInt(diamondSettings.priorityOrder, 10) >= 0 ? parseInt(diamondSettings.priorityOrder, 10) : 6, offset++);

        const dBuf1 = this.buildRecordStore('DiamondSettings', payload);
        const dBuf2 = this.buildRecordStore('chip_DiamondSettings', payload);

        fs.writeFileSync(path.join(suiteDir, 'DiamondSettings.rs'), dBuf1);
        fs.writeFileSync(path.join(suiteDir, 'chip_DiamondSettings.rs'), dBuf2);
      }
    } catch (err) {
      console.error(`[RmsWriter] Lỗi ghi RMS Kim Cương cho ${account.username}:`, err.message);
    }
  }

  /**
   * Writes Farm Settings RMS
   */
  static writeFarmRms(account, farmSettings, fileId = 'file_1') {
    if (!farmSettings) return;
    try {
      const suiteDirs = this.getSuiteDirs(account, fileId);

      const mode = parseInt(farmSettings.mode, 10) || 0;
      const backupDishes = String(farmSettings.backupDishes || '');
      const backupSeeds = String(farmSettings.backupSeeds || '');
      const replaceSeedThreshold = parseInt(farmSettings.replaceSeedThreshold, 10) || 0;
      const fish = parseInt(farmSettings.fish, 10) !== undefined ? parseInt(farmSettings.fish, 10) : 2;
      const animal = parseInt(farmSettings.animal, 10) !== undefined ? parseInt(farmSettings.animal, 10) : 3;
      const dailyAttendance = farmSettings.dailyAttendance !== false ? 1 : 0;
      const harvestHearts = farmSettings.harvestHearts !== false ? 1 : 0;
      const sellProducts = String(farmSettings.sellProducts || '');
      const sellThreshold = parseInt(farmSettings.sellThreshold, 10) || 0;
      const upgradeStarfruit = farmSettings.upgradeStarfruit ? 1 : 0;
      const maxStarfruitLevel = parseInt(farmSettings.maxStarfruitLevel, 10) || 12;
      const sellQuantity = parseInt(farmSettings.sellQuantity, 10) || 0;
      const feedBaby = farmSettings.feedBaby ? 1 : 0;
      const buyMilkWithGold = farmSettings.buyMilkWithGold ? 1 : 0;
      const upgradeBaby = farmSettings.upgradeBaby ? 1 : 0;
      const hatchDragon = farmSettings.hatchDragon ? 1 : 0;
      const trainDragon = farmSettings.trainDragon ? 1 : 0;
      const deliverOrders = farmSettings.deliverOrders ? 1 : 0;
      const noBuyWithGold = farmSettings.noBuyWithGold !== false ? 1 : 0;

      const encUtf = (str) => {
        const b = Buffer.from(str, 'utf-8');
        const res = Buffer.alloc(2 + b.length);
        res.writeUInt16BE(b.length, 0);
        b.copy(res, 2);
        return res;
      };

      const bDishes = encUtf(backupDishes);
      const bSeeds = encUtf(backupSeeds);
      const sProds = encUtf(sellProducts);

      const payloadParts = [];
      const b1 = Buffer.alloc(1); b1.writeInt8(mode, 0); payloadParts.push(b1);
      payloadParts.push(bDishes);
      payloadParts.push(bSeeds);
      const b2 = Buffer.alloc(4); b2.writeInt32BE(replaceSeedThreshold, 0); payloadParts.push(b2);
      const b3 = Buffer.alloc(4);
      b3.writeInt8(fish, 0);
      b3.writeInt8(animal, 1);
      b3.writeInt8(dailyAttendance, 2);
      b3.writeInt8(harvestHearts, 3);
      payloadParts.push(b3);
      payloadParts.push(sProds);
      const b4 = Buffer.alloc(13);
      b4.writeInt32BE(sellThreshold, 0);
      b4.writeInt8(upgradeStarfruit, 4);
      b4.writeInt32BE(maxStarfruitLevel, 5);
      b4.writeInt32BE(sellQuantity, 9);
      payloadParts.push(b4);
      const b5 = Buffer.alloc(7);
      b5.writeInt8(feedBaby, 0);
      b5.writeInt8(buyMilkWithGold, 1);
      b5.writeInt8(upgradeBaby, 2);
      b5.writeInt8(hatchDragon, 3);
      b5.writeInt8(trainDragon, 4);
      b5.writeInt8(deliverOrders, 5);
      b5.writeInt8(noBuyWithGold, 6);
      payloadParts.push(b5);

      const payload = Buffer.concat(payloadParts);

      for (const suiteDir of suiteDirs) {
        if (!fs.existsSync(suiteDir)) {
          fs.mkdirSync(suiteDir, { recursive: true });
        }
        const farmBuf1 = this.buildRecordStore('chipFarmSettings', payload);
        const farmBuf2 = this.buildRecordStore('chip_chipFarmSettings', payload);
        fs.writeFileSync(path.join(suiteDir, 'chipFarmSettings.rs'), farmBuf1);
        fs.writeFileSync(path.join(suiteDir, 'chip_chipFarmSettings.rs'), farmBuf2);
      }
    } catch (err) {
      console.error(`[RmsWriter] Lỗi ghi RMS Farm cho ${account.username}:`, err.message);
    }
  }

  /**
   * Writes Fish Settings RMS (_fish_settings.rs & chip__fish_settings.rs)
   * Exact structure from AutoCauCa.java (cfr_renamed_6):
   * 1. mapType (byte)
   * 2. sellFishType (byte) (0: Bán tại chỗ, 1: Bán KST, 2: Bỏ cá)
   * 3. autoBuyTicket (bool)
   * 4. sellKcx (bool)
   * 5. excludeFish (UTF)
   * 6. rodType (byte) (0: Không mua, 1: VIP, 2: Sắt, 3: Tre)
   * 7. backToFarm (bool)
   * 8. farmIntervalMinutes (int32)
   * 9. sellKcxThreshold (int32)
   * 10. harvestOnTime (bool)
   */
  static writeFishRms(account, fishSettings, fileId = 'file_1') {
    if (!fishSettings) return;
    try {
      const suiteDirs = this.getSuiteDirs(account, fileId);

      const mapType = parseInt(fishSettings.mapType, 10) || 0;
      const sellFishType = parseInt(fishSettings.sellFishType !== undefined ? fishSettings.sellFishType : (fishSettings.sellType || 0), 10) || 0;
      const autoBuyTicket = fishSettings.autoBuyTicket !== false ? 1 : 0;
      const sellKcx = fishSettings.sellKcx ? 1 : 0;
      const excludeFish = String(fishSettings.excludeFish || '');
      const rodType = parseInt(fishSettings.rodType, 10) || 0;
      const backToFarm = fishSettings.backToFarm !== false ? 1 : 0;
      const farmIntervalMinutes = Math.max(1, parseInt(fishSettings.farmIntervalMinutes, 10) || 30);
      const sellKcxThreshold = Math.max(1, parseInt(fishSettings.sellKcxThreshold, 10) || 5);
      const harvestOnTime = (backToFarm && fishSettings.harvestOnTime !== false) ? 1 : 0;

      const encUtf = (str) => {
        const b = Buffer.from(str, 'utf-8');
        const res = Buffer.alloc(2 + b.length);
        res.writeUInt16BE(b.length, 0);
        b.copy(res, 2);
        return res;
      };

      const bExclude = encUtf(excludeFish);

      const payloadParts = [];
      const b1 = Buffer.alloc(4);
      b1.writeInt8(mapType, 0);
      b1.writeInt8(sellFishType, 1);
      b1.writeInt8(autoBuyTicket, 2);
      b1.writeInt8(sellKcx, 3);
      payloadParts.push(b1);

      payloadParts.push(bExclude);

      const b2 = Buffer.alloc(11);
      b2.writeInt8(rodType, 0);
      b2.writeInt8(backToFarm, 1);
      b2.writeInt32BE(farmIntervalMinutes, 2);
      b2.writeInt32BE(sellKcxThreshold, 6);
      b2.writeInt8(harvestOnTime, 10);
      payloadParts.push(b2);

      const payload = Buffer.concat(payloadParts);

      for (const suiteDir of suiteDirs) {
        if (!fs.existsSync(suiteDir)) {
          fs.mkdirSync(suiteDir, { recursive: true });
        }
        const fBuf1 = this.buildRecordStore('_fish_settings', payload);
        const fBuf2 = this.buildRecordStore('chip__fish_settings', payload);
        const fBuf3 = this.buildRecordStore('chip_fish_settings', payload);
        const fBuf4 = this.buildRecordStore('Fish', payload);
        const fBuf5 = this.buildRecordStore('chip_Fish', payload);
        const fBuf6 = this.buildRecordStore('chipFish', payload);
        fs.writeFileSync(path.join(suiteDir, '_fish_settings.rs'), fBuf1);
        fs.writeFileSync(path.join(suiteDir, 'chip__fish_settings.rs'), fBuf2);
        fs.writeFileSync(path.join(suiteDir, 'chip_fish_settings.rs'), fBuf3);
        fs.writeFileSync(path.join(suiteDir, 'Fish.rs'), fBuf4);
        fs.writeFileSync(path.join(suiteDir, 'chip_Fish.rs'), fBuf5);
        fs.writeFileSync(path.join(suiteDir, 'chipFish.rs'), fBuf6);
      }
    } catch (err) {
      console.error(`[RmsWriter] Lỗi ghi RMS Fish cho ${account.username}:`, err.message);
    }
  }

  /**
   * Writes Sell Ore (Jewel) Settings RMS (JewelSettings.rs & chip_JewelSettings.rs)
   */
  static writeSellOreRms(account, sellOreSettings, fileId = 'file_1') {
    if (!sellOreSettings) return;
    try {
      const suiteDirs = this.getSuiteDirs(account, fileId);

      const sellIntervalMinutes = Math.max(1, parseInt(sellOreSettings.sellIntervalMinutes, 10) || 15);
      const delayMs = Math.max(1, parseInt(sellOreSettings.delayMs, 10) || 100);
      const zoneFrom = Math.max(0, parseInt(sellOreSettings.zoneFrom, 10) || 20);
      const zoneTo = Math.max(zoneFrom, parseInt(sellOreSettings.zoneTo, 10) || 79);
      const dropKcxIfFailed = sellOreSettings.dropKcxIfFailed !== false ? 1 : 0;
      const dropNhbIfFailed = sellOreSettings.dropNhbIfFailed !== false ? 1 : 0;
      const resetTimeOnKcx = sellOreSettings.resetTimeOnKcx ? 1 : 0;
      const resetTimeOnNhb = sellOreSettings.resetTimeOnNhb !== false ? 1 : 0;

      const payload = Buffer.alloc(20);
      let off = 0;
      payload.writeInt32BE(sellIntervalMinutes, off); off += 4;
      payload.writeInt32BE(delayMs, off); off += 4;
      payload.writeInt32BE(zoneFrom, off); off += 4;
      payload.writeInt32BE(zoneTo, off); off += 4;
      payload.writeInt8(dropKcxIfFailed, off++);
      payload.writeInt8(dropNhbIfFailed, off++);
      payload.writeInt8(resetTimeOnKcx, off++);
      payload.writeInt8(resetTimeOnNhb, off++);

      for (const suiteDir of suiteDirs) {
        if (!fs.existsSync(suiteDir)) {
          fs.mkdirSync(suiteDir, { recursive: true });
        }
        const sBuf1 = this.buildRecordStore('JewelSettings', payload);
        const sBuf2 = this.buildRecordStore('chip_JewelSettings', payload);
        const sBuf3 = this.buildRecordStore('chipJewelSettings', payload);
        fs.writeFileSync(path.join(suiteDir, 'JewelSettings.rs'), sBuf1);
        fs.writeFileSync(path.join(suiteDir, 'chip_JewelSettings.rs'), sBuf2);
        fs.writeFileSync(path.join(suiteDir, 'chipJewelSettings.rs'), sBuf3);
      }
    } catch (err) {
      console.error(`[RmsWriter] Lỗi ghi RMS Bán Đá cho ${account.username}:`, err.message);
    }
  }
}

module.exports = RmsWriter;
