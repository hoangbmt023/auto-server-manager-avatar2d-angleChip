const AsyncMutex = require('../../shared/utils/AsyncMutex');
const Proxy = require('../../domain/entities/Proxy');

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

    return rules || {
      plans: {
        UPXU: { name: 'Auto Up Xu Nông Trại', priceMonth: 50000, modType: 'UPXU', defaultFileId: 'file_1' },
        FULL: { name: 'Full Chức Năng ChipMix', priceMonth: 90000, modType: 'CHIPMIX', defaultFileId: 'file_1' },
        FISH: { name: 'Auto Câu Cá Chuyên Nghiệp', priceMonth: 60000, modType: 'FISH', defaultFileId: 'file_1' }
      },
      durationDiscounts: { 1: 0, 3: 10, 6: 20, 12: 30 },
      proxyStrategy: 'dynamic_best_fit',
      serverBalanceStrategy: 'auto_balance'
    };
  }

  /**
   * Determine best bot file, proxy and server for a new rental inside sequential mutex
   * @param {string} plan - UPXU | FULL | FISH
   * @param {number} durationMonths - Number of rental months (default: 1)
   * @returns {Promise<{ fileId: string, proxyId: string, serverId: number, serverName: string }>}
   */
  async allocateResources(plan = 'UPXU', durationMonths = 1) {
    return this.mutex.runExclusive(async () => {
      return this._allocateResourcesInternal(plan, durationMonths);
    });
  }

  async _allocateResourcesInternal(plan, durationMonths) {
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
    // 1. CHOOSE BOT FILE
    // =========================================================================
    const matchingFiles = (allFiles || []).filter(f => {
      const m = String(f.modType || '').toUpperCase();
      return m === targetModType;
    });

    let selectedFile = null;
    let minAccs = Infinity;

    for (const f of matchingFiles) {
      const count = allAccounts.filter(a => a.fileId === f.id).length;
      const maxAccs = f.maxAccounts || 6;
      if (count < maxAccs && count < minAccs) {
        minAccs = count;
        selectedFile = f;
      }
    }

    if (!selectedFile) {
      selectedFile = matchingFiles[0] ||
        (allFiles || []).find(f => f.id === planConfig.defaultFileId) ||
        (allFiles || []).find(f => f.isDefault) ||
        (allFiles && allFiles[0]);
    }

    const fileId = selectedFile ? selectedFile.id : 'file_1';

    // =========================================================================
    // 2. CHOOSE PROXY (Dynamic Priority Scoring & Best-Fit Decreasing)
    // =========================================================================
    let selectedProxy = await this._selectOptimalProxy({
      allProxies: allProxies || [],
      allAccounts: allAccounts || [],
      botExpiresAt
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
    // 3. CHOOSE SERVER (Auto-Balance HM / DK on selected proxy)
    // =========================================================================
    const { serverId, serverName } = this._pickOptimalServer(selectedProxy, allAccounts);

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
  async _selectOptimalProxy({ allProxies, allAccounts, botExpiresAt }) {
    const now = Date.now();
    const candidateProxies = [];

    for (const p of allProxies) {
      // Bỏ qua các proxy đã hết hạn hoặc chết hoàn toàn
      if (p.status === 'EXPIRED' || p.isExpired) continue;
      if (p.expiresAt && new Date(p.expiresAt).getTime() <= now + 2 * 3600 * 1000) continue; // Còn <= 2 giờ xem như sắp chết

      // Đếm số lượng nick đang gắn vào proxy này
      const botsOnProxy = allAccounts.filter(a => a.proxyId === p.id);
      const totalBots = botsOnProxy.length;
      const maxCapacity = p.maxSlots || 6;

      // Nếu đã đầy đủ 6 nick (hoặc 7 nick nếu là slot khẩn cấp) -> Bỏ qua
      if (totalBots >= maxCapacity) continue;

      const countHM = botsOnProxy.filter(a => parseInt(a.serverId, 10) === 0).length;
      const countDK = botsOnProxy.filter(a => parseInt(a.serverId, 10) === 1).length;

      // Phải còn ít nhất 1 slot server trống (HM < 3 hoặc DK < 3)
      if (countHM >= 3 && countDK >= 3) continue;

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
      console.log('🛒 [ResourceAllocationEngine] Toàn bộ Proxy hiện tại đã đầy kín (6/6). Đang tự động gọi API proxy.vn để mua Proxy mới 30 ngày...');
      const buyResult = await this.proxyVnApiClient.buyProxy({
        category: 'DatacenterA',
        days: 30,
        type: 'SOCKS5'
      });

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
      console.log(`✅ [ResourceAllocationEngine] Đã mua thành công Proxy mới [${newProxy.host}:${newProxy.port}] (ID: ${newProxy.externalId}). Hạn dùng: ${buyResult.expiresAt.toISOString()}`);
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
    const botsOnProxy = allAccounts.filter(a => a.proxyId === targetProxy.id);
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
    const globalHM = allAccounts.filter(a => parseInt(a.serverId, 10) === 0).length;
    const globalDK = allAccounts.filter(a => parseInt(a.serverId, 10) === 1).length;

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
}

module.exports = ResourceAllocationEngine;
