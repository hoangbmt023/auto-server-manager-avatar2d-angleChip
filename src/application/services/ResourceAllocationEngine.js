const AsyncMutex = require('../../shared/utils/AsyncMutex');
const Proxy = require('../../domain/entities/Proxy');
const ProxyChecker = require('../../infrastructure/network/ProxyChecker');

/**
 * ResourceAllocationEngine (Application Layer - Domain Service)
 * Automatically distributes and assigns bot files, proxies, and game servers/cities
 * when users rent or renew a bot slot.
 *
 * Implements:
 * 1. Async Mutex Concurrency Guard (triệt tiêu 100% lỗi race condition mua đúp proxy).
 * 2. Dynamic Priority Scoring (overflow_bots, Group 1/2/3, Best-Fit Decreasing 5/6 before 4/6).
 * 3. Auto-Balancing and Auto-Server selection (HM/DK) based on local and global load.
 * 4. Zero Direct IP policy (100% bot runs on SOCKS5/HTTP Proxy).
 * 5. On-Demand Auto-Purchase from proxy.vn when all proxies are full (>= 6 bots).
 */
class ResourceAllocationEngine {
  constructor(fileRepo, proxyRepo, accountRepo, settingRepo, proxyVnApiClient = null, mutex = null) {
    this.fileRepo = fileRepo;
    this.proxyRepo = proxyRepo;
    this.accountRepo = accountRepo;
    this.settingRepo = settingRepo;
    this.proxyVnApiClient = proxyVnApiClient;
    this.mutex = mutex || AsyncMutex.globalAllocationMutex || new AsyncMutex('resource-allocation');
  }

  setProxyVnApiClient(client) {
    this.proxyVnApiClient = client;
  }

  async getAllocationRules() {
    let rules = null;
    try {
      rules = await this.settingRepo.get('rental_allocation_rules');
    } catch (e) {}

    const defaultRules = {
      plans: {
        UPXU: { name: 'Auto Up Xu Nông Trại', priceMonth: 50000, modType: 'UPXU', defaultFileId: 'file_1' },
        FULL: { name: 'Auto Full chức năng', priceMonth: 90000, modType: 'CHIPMIX', defaultFileId: 'file_1' },
        FISH: { name: 'Auto Câu Cá Chuyên Nghiệp', priceMonth: 60000, modType: 'FISH', defaultFileId: 'file_1' }
      },
      durationDiscounts: { 1: 0, 3: 10, 6: 20, 12: 30 },
      cancellationFeePercent: 10,
      minHoldHours: 1,
      proxyStrategy: 'dynamic_best_fit',
      serverBalanceStrategy: 'auto_balance'
    };

    if (!rules) return defaultRules;
    return {
      ...defaultRules,
      ...rules,
      cancellationFeePercent: rules.cancellationFeePercent !== undefined ? rules.cancellationFeePercent : 10,
      minHoldHours: rules.minHoldHours !== undefined ? rules.minHoldHours : 1
    };
  }

  /**
   * Determine best bot file, proxy and server for a new rental inside sequential mutex
   * @param {string} plan - UPXU | FULL | FISH
   * @param {number} durationMonths - Number of rental months (default: 1)
   * @param {number|null} requiredServerId - 0 (HM) | 1 (DK) | null (Auto-balance)
   * @returns {Promise<{ fileId: string, proxyId: string, serverId: number, serverName: string }>}
   */
  async allocateResources(plan = 'UPXU', durationMonths = 1, requiredServerId = null) {
    return this.mutex.runExclusive(async () => {
      return this._allocateResourcesInternal(plan, durationMonths, requiredServerId);
    });
  }

  async _allocateResourcesInternal(plan, durationMonths, requiredServerId = null) {
    const rules = await this.getAllocationRules();
    const planKey = String(plan || 'UPXU').toUpperCase();
    const planConfig = rules.plans[planKey] || rules.plans.UPXU;
    const targetModType = planConfig.modType || 'UPXU';
    const months = Math.max(1, parseInt(durationMonths || 1, 10));
    const botExpiresAt = new Date(Date.now() + months * 30 * 86400 * 1000);

    const [allFiles, allAccounts, allProxies] = await Promise.all([
      this.fileRepo.findAll(),
      this.accountRepo.findAll(),
      this.proxyRepo.findAll()
    ]);

    // =========================================================================
    // 1. CHOOSE BOT FILE (Do Admin toàn quyền chỉ định & quản lý theo từng gói)
    // =========================================================================
    let selectedFile = null;

    // 1.1. Ưu tiên hàng đầu: Lấy chính xác File bot mà Admin đã chỉ định cho gói thuê này
    if (planConfig && planConfig.defaultFileId) {
      selectedFile = (allFiles || []).find(f => f.id === planConfig.defaultFileId);
    }

    // 1.2. Fallback nếu file chỉ định bị xoá hoặc không tồn tại
    if (!selectedFile) {
      const matchingFiles = (allFiles || []).filter(f => {
        const m = String(f.modType || '').toUpperCase();
        return m === targetModType;
      });

      selectedFile = matchingFiles[0] ||
        (allFiles || []).find(f => f.isDefault) ||
        (allFiles && allFiles[0]);
    }

    const fileId = selectedFile ? selectedFile.id : (planConfig?.defaultFileId || 'file_1');

    // =========================================================================
    // 2. CHOOSE PROXY (Dynamic Priority Scoring & Best-Fit Decreasing)
    // =========================================================================
    let selectedProxy = await this._selectOptimalProxy({
      allProxies: allProxies || [],
      allAccounts: allAccounts || [],
      botExpiresAt,
      requiredServerId
    });

    // If no proxy has available slots (< 6 bots), trigger On-Demand Purchase from proxy.vn
    if (!selectedProxy) {
      selectedProxy = await this._autoPurchaseNewProxy();
    }

    if (!selectedProxy) {
      throw new Error('Hệ thống hiện tại đã hết Proxy khả dụng và không thể mua thêm tự động. Vui lòng liên hệ Admin!');
    }

    const proxyId = selectedProxy.id;

    // =========================================================================
    // 3. CHOOSE SERVER (Auto-Balance HM / DK hoặc Giữ nguyên server theo yêu cầu)
    // =========================================================================
    const { serverId, serverName } = (requiredServerId !== null && requiredServerId !== undefined)
      ? {
          serverId: parseInt(requiredServerId, 10) === 1 ? 1 : 0,
          serverName: parseInt(requiredServerId, 10) === 1 ? 'Diệu Kỳ' : 'Hoàn Mỹ'
        }
      : this._pickOptimalServer(selectedProxy, allAccounts);

    return {
      fileId,
      proxyId,
      serverId,
      serverName
    };
  }

  /**
   * Evaluates each living proxy and scores it using the 3 Group System and Best-Fit Decreasing formula.
   */
  async _selectOptimalProxy({ allProxies, allAccounts, botExpiresAt, requiredServerId = null }) {
    const now = Date.now();
    const candidateProxies = [];

    for (const p of allProxies) {
      // Bỏ qua các proxy đã hết hạn hoặc chết hoàn toàn
      if (p.status === 'EXPIRED' || p.isExpired) continue;
      if (p.expiresAt && new Date(p.expiresAt).getTime() <= now + 2 * 3600 * 1000) continue; // Còn <= 2 giờ xem như sắp chết

      // Đếm số lượng nick đang gắn vào proxy này (CHỈ ĐẾM NICK CHƯA HỦY VÀ CÒN HẠN THUÊ HỢP ĐỒNG)
      const botsOnProxy = allAccounts.filter(a => {
        if (a.proxyId !== p.id) return false;
        if (typeof a.isDeleted === 'function' && a.isDeleted()) return false;
        if (typeof a.isRentalExpired === 'function' && a.isRentalExpired()) return false;
        return true;
      });
      const totalBots = botsOnProxy.length;
      const maxCapacity = p.maxSlots || 6;

      // Nếu đã đầy đủ 6 nick -> Bỏ qua
      if (totalBots >= maxCapacity) continue;

      const countHM = botsOnProxy.filter(a => parseInt(a.serverId, 10) === 0).length;
      const countDK = botsOnProxy.filter(a => parseInt(a.serverId, 10) === 1).length;

      // Phải còn ít nhất 1 slot server trống (HM < 3 hoặc DK < 3)
      if (countHM >= 3 && countDK >= 3) continue;

      // Nếu có yêu cầu server cụ thể (ví dụ gia hạn nick cũ), phải còn slot cho server đó
      if (requiredServerId !== null && requiredServerId !== undefined) {
        const targetSId = parseInt(requiredServerId, 10) === 1 ? 1 : 0;
        const countTarget = targetSId === 0 ? countHM : countDK;
        if (countTarget >= 3) continue;
      }

      // Tính overflow_bots: Số nick sống vượt quá hạn của Proxy
      const pExpiresMs = p.expiresAt ? new Date(p.expiresAt).getTime() : (now + 30 * 86400 * 1000);
      const overflowBots = botsOnProxy.filter(a => {
        if (!a.rentalExpiresAt) return false;
        return new Date(a.rentalExpiresAt).getTime() > pExpiresMs;
      }).length;

      const remainingHours = (pExpiresMs - now) / (3600 * 1000);
      const remainingDays = Math.max(0, remainingHours / 24);

      // Phân nhóm Điểm Cơ Sở (Group Score)
      let groupScore = 0;
      if (p.tier === 'CORE' || overflowBots >= 3 || (totalBots === 0 && remainingDays >= 25)) {
        // Nhóm 1: Chắc chắn gia hạn hoặc mới mua tinh khôi
        groupScore = 10000;
      } else if (remainingHours > 72) {
        // Nhóm 2: Đang sống khỏe (> 72h)
        groupScore = 5000;
      } else {
        // Nhóm 3: Sắp hết hạn (<= 72h) và ít overflow bots -> Chờ tự hủy (hoặc xe đi nhờ cuối giờ nếu nhóm 1 & 2 đã kín)
        groupScore = 0;
      }

      // Best-Fit Decreasing: Ưu tiên thùng có nhiều nick hơn (5/6 trước 4/6) để lấp kín từng thùng nhanh nhất
      const totalScore = groupScore + (totalBots * 100) + remainingDays;

      candidateProxies.push({
        proxy: p,
        totalBots,
        countHM,
        countDK,
        totalScore
      });
    }

    if (candidateProxies.length === 0) {
      return null;
    }

    // Sắp xếp theo totalScore GIẢM DẦN
    candidateProxies.sort((a, b) => b.totalScore - a.totalScore);

    return candidateProxies[0].proxy;
  }

  /**
   * Automatically purchases a new 30-day SOCKS5 static proxy via ProxyVnApiClient
   */
  async _autoPurchaseNewProxy() {
    if (!this.proxyVnApiClient) {
      console.warn('⚠️ [ResourceAllocationEngine] Chưa cấu hình ProxyVnApiClient, không thể mua proxy tự động.');
      return null;
    }

    try {
      let category = 'DatacenterA';
      let periodDays = 30;
      let protocol = 'SOCKS5';

      if (this.settingRepo) {
        try {
          const cat = await this.settingRepo.get('proxy_vn_category');
          if (cat) category = cat;
          const period = await this.settingRepo.get('proxy_vn_default_period');
          if (period) {
            const p = parseInt(period, 10);
            if (!isNaN(p) && p >= 1) periodDays = Math.min(365, p);
          }
          const type = await this.settingRepo.get('proxy_vn_default_type');
          if (type) protocol = type.toUpperCase();
        } catch (e) {}
      }

      console.log(`🛒 [ResourceAllocationEngine] Toàn bộ Proxy hiện tại đã đầy kín (6/6). Đang tự động gọi API proxy.vn để mua Proxy mới ${periodDays} ngày (Gói: ${category}, Giao thức: ${protocol})...`);
      const buyResult = await this.proxyVnApiClient.buyProxy({
        category,
        days: periodDays,
        type: protocol
      });

      // BƯỚC 1: BẮT BUỘC LƯU NGAY VÀO DATABASE ĐỂ KHÔNG BỊ MẤT 10.000Đ ĐÃ TRỪ TRÊN PROXY.VN
      const newProxy = new Proxy({
        externalId: buyResult.externalId,
        provider: 'PROXY_VN',
        proxyCategory: buyResult.category || 'DatacenterA',
        name: `ProxyVN_${buyResult.ip.replace(/\./g, '_')}`,
        host: buyResult.ip,
        port: buyResult.port,
        username: buyResult.username,
        password: buyResult.password,
        type: buyResult.type,
        tier: 'DYNAMIC',
        status: 'ACTIVE',
        maxSlots: 6,
        expiresAt: buyResult.expiresAt,
        isActive: true,
        isExpired: false
      });

      await this.proxyRepo.save(newProxy);
      console.log(`✅ [ResourceAllocationEngine] ĐÃ LƯU DB AN TOÀN Proxy mới [${newProxy.host}:${newProxy.port}] (ID: ${newProxy.externalId}). Hạn dùng: ${buyResult.expiresAt.toISOString()}`);

      // BƯỚC 2: KIỂM TRA SƠ BỘ KẾT NỐI (TUYỆT ĐỐI KHÔNG THROW ERROR ĐỂ TRÁNH ROLLBACK TIỀN KHÁCH)
      try {
        const testResult = await ProxyChecker.testProxy(newProxy.toJSON(), 3500);
        if (!testResult.isExpired && testResult.latencyMs > 0) {
          newProxy.markActive(testResult.latencyMs);
          await this.proxyRepo.save(newProxy);
          console.log(`⚡ [ResourceAllocationEngine] Proxy [${newProxy.host}:${newProxy.port}] đã mở cổng SOCKS5 thành công (Latency: ${testResult.latencyMs}ms).`);
        } else {
          console.warn(`⏳ [ResourceAllocationEngine] Proxy [${newProxy.host}:${newProxy.port}] vừa mua đang đợi nhà mạng mở cổng SOCKS5. Đã lưu DB an toàn, tiếp tục phân bổ cho khách.`);
        }
      } catch (testErr) {
        console.warn(`⏳ [ResourceAllocationEngine] Kiểm tra kết nối ban đầu chưa phản hồi (${testErr.message}). Đã lưu DB an toàn, không hủy giao dịch.`);
      }

      return newProxy;
    } catch (err) {
      console.error('❌ [ResourceAllocationEngine] Lỗi khi tự động mua Proxy từ proxy.vn:', err.message);
      throw new Error(`Không thể khởi tạo Proxy mới từ proxy.vn: ${err.message}`);
    }
  }

  /**
   * Picks optimal server (HM = 0 or DK = 1) for the account on the target proxy
   */
  _pickOptimalServer(targetProxy, allAccounts) {
    const livingAccounts = allAccounts.filter(a => {
      if (typeof a.isDeleted === 'function' && a.isDeleted()) return false;
      if (typeof a.isRentalExpired === 'function' && a.isRentalExpired()) return false;
      return true;
    });

    const botsOnProxy = livingAccounts.filter(a => a.proxyId === targetProxy.id);
    const countHM = botsOnProxy.filter(a => parseInt(a.serverId, 10) === 0).length;
    const countDK = botsOnProxy.filter(a => parseInt(a.serverId, 10) === 1).length;

    // 1. Cân bằng nội bộ trên con proxy này
    if (countHM < countDK && countHM < 3) {
      return { serverId: 0, serverName: 'Hoàn Mỹ' };
    }
    if (countDK < countHM && countDK < 3) {
      return { serverId: 1, serverName: 'Diệu Kỳ' };
    }

    // 2. Nếu hòa nhau (0-0, 1-1, 2-2) -> Cân bằng theo tổng tải toàn hệ thống
    const globalHM = livingAccounts.filter(a => parseInt(a.serverId, 10) === 0).length;
    const globalDK = livingAccounts.filter(a => parseInt(a.serverId, 10) === 1).length;

    if (globalHM <= globalDK && countHM < 3) {
      return { serverId: 0, serverName: 'Hoàn Mỹ' };
    }
    if (countDK < 3) {
      return { serverId: 1, serverName: 'Diệu Kỳ' };
    }

    // Fallback nếu 1 bên đã đạt 3
    if (countHM < 3) return { serverId: 0, serverName: 'Hoàn Mỹ' };
    return { serverId: 1, serverName: 'Diệu Kỳ' };
  }

  /**
   * Đảm bảo tài khoản bot có Proxy sống khả dụng trước khi chạy:
   * 1. Được bọc trong mutex tuần tự toàn hệ thống để chống Race Condition mua trùng Proxy.
   * 2. Kiểm tra ngày hết hạn hợp đồng của Proxy hiện tại.
   * 3. Nếu Proxy chết/hết hạn: Quét kho DB tìm Proxy khác còn sống & còn chỗ (< 6 bot).
   * 4. Nếu kho DB hết sạch: Tự động mua mới 30 ngày qua proxy.vn và chờ mở cổng (waitForProxyReady).
   *
   * @param {Object} account - Entity Account cần chạy bot
   * @param {Array<Object>} otherRunning - Danh sách bot đang chạy
   * @returns {Promise<{ proxy: Object, changed: boolean, reason?: string, waitMessage?: string, error?: string }>}
   */
  async ensureHealthyProxyForBot(account, otherRunning = []) {
    return this.mutex.runExclusive(async () => {
      return this._ensureHealthyProxyForBotInternal(account, otherRunning);
    });
  }

  async _ensureHealthyProxyForBotInternal(account, otherRunning = []) {
    let proxy = account.proxyId ? await this.proxyRepo.findById(account.proxyId) : null;
    const now = Date.now();
    const hasExpiryDate = Boolean(proxy && proxy.expiresAt);
    const isCalendarExpired = hasExpiryDate && new Date(proxy.expiresAt).getTime() <= now;
    const isMarkedDead = Boolean(proxy && (proxy.isExpired || proxy.status === 'EXPIRED'));

    // Proxy được coi là THỰC SỰ HẾT HẠN khi:
    // 1. Chưa có proxy, hoặc
    // 2. Ngày hết hạn theo lịch đã trôi qua (expiresAt <= now), hoặc
    // 3. Không có ngày hết hạn nhưng đã bị đánh dấu cờ EXPIRED
    const isTrulyExpired = !proxy || isCalendarExpired || (!hasExpiryDate && isMarkedDead);

    if (isTrulyExpired) {
      // BƯỚC 1: Tìm proxy có sẵn trong kho DB còn sống & còn slot (< 6)
      const allProxies = await this.proxyRepo.findAll();
      const allAccounts = await this.accountRepo.findAll();
      let fallback = await this._selectOptimalProxy({
        allProxies,
        allAccounts,
        botExpiresAt: account.rentalExpiresAt || new Date(now + 30 * 86400 * 1000),
        requiredServerId: account.serverId
      });

      // BƯỚC 2: Nếu kho DB HẾT SẠCH Proxy sống -> Kích hoạt mua Proxy mới qua proxy.vn
      if (!fallback) {
        try {
          const newProxy = await this._autoPurchaseNewProxy();
          if (newProxy) {
            account.proxyId = newProxy.id;
            await this.accountRepo.save(account);

            // Chờ kích hoạt mở cổng kết nối từ nhà mạng (thử tối đa 15s)
            const waitResult = await ProxyChecker.waitForProxyReady(
              newProxy.toJSON ? newProxy.toJSON() : newProxy,
              15000,
              2500
            );

            if (waitResult.ready) {
              newProxy.markActive(waitResult.latencyMs);
              await this.proxyRepo.save(newProxy);
              return {
                proxy: newProxy,
                changed: true,
                reason: `Đã tự động mua Proxy mới [${newProxy.name || newProxy.host}] và kích hoạt thành công!`
              };
            } else {
              return {
                proxy: newProxy,
                changed: true,
                waitMessage: `🛒 Hệ thống đã tự động mua Proxy mới cho bạn! Proxy đang được nhà mạng kích hoạt mở cổng (mất khoảng 30s - 1 phút). Vui lòng đợi 30 giây rồi bấm Treo lại!`
              };
            }
          }
        } catch (buyErr) {
          return {
            proxy: null,
            error: `❌ Proxy của nick đã hết hạn và hệ thống gặp lỗi khi mua Proxy mới: ${buyErr.message}`
          };
        }
        return {
          proxy: null,
          error: `❌ Proxy của nick đã hết hạn và hệ thống hiện không còn Proxy dự phòng nào khả dụng. Vui lòng liên hệ Admin bổ sung Proxy!`
        };
      }

      // Đã tìm thấy fallback sống trong kho
      account.proxyId = fallback.id;
      await this.accountRepo.save(account);
      return {
        proxy: fallback,
        changed: true,
        reason: `Proxy cũ bị hết hạn. Hệ thống đã tự động di tản nick sang Proxy mới [${fallback.name || fallback.host}]!`
      };
    }

    // TH2: Proxy VẪN CÒN HẠN HỢP ĐỒNG THEO LỊCH (expiresAt > now)
    // Kiểm tra xem có phải proxy mới mua trong vòng 60 giây không
    const isNewlyCreated = proxy.createdAt && (now - new Date(proxy.createdAt).getTime() < 60000);
    if (isNewlyCreated) {
      const waitRes = await ProxyChecker.waitForProxyReady(proxy.toJSON ? proxy.toJSON() : proxy, 10000, 2000);
      if (!waitRes.ready) {
        return {
          proxy,
          waitMessage: `⏳ Proxy [${proxy.name || proxy.host}] vừa mua đang được nhà mạng mở cổng SOCKS5. Vui lòng thử lại sau 30 giây!`
        };
      }
    }

    // Live Health Test trước khi khởi chạy
    const testRes = await ProxyChecker.testProxy(proxy, 3500);
    if (testRes.isExpired) {
      // Hạn ngày vẫn còn -> LỖI MẠNG TẠM THỜI, KHÔNG ĐÁNH DẤU EXPIRED
      proxy.failCount = (proxy.failCount || 0) + 1;
      await this.proxyRepo.save(proxy);

      // Thử tìm proxy sống khác trong kho để chạy tạm
      const allProxies = await this.proxyRepo.findAll();
      const allAccounts = await this.accountRepo.findAll();
      const fallback = await this._selectOptimalProxy({
        allProxies,
        allAccounts,
        botExpiresAt: account.rentalExpiresAt || new Date(now + 30 * 86400 * 1000),
        requiredServerId: account.serverId
      });

      if (fallback && fallback.id !== proxy.id) {
        account.proxyId = fallback.id;
        await this.accountRepo.save(account);
        return {
          proxy: fallback,
          changed: true,
          reason: `Proxy [${proxy.name}] đang gặp sự cố mạng tạm thời (${testRes.message}). Đã tự động đổi sang Proxy [${fallback.name}]!`
        };
      }

      return {
        proxy,
        error: `⚠️ Proxy [${proxy.name || proxy.host}] đang gặp sự cố mạng tạm thời (${testRes.message}). Proxy vẫn còn hạn dùng, vui lòng thử lại sau ít phút!`
      };
    }

    return { proxy, changed: false };
  }
}

module.exports = ResourceAllocationEngine;
