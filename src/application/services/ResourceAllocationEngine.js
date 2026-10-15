/**
 * ResourceAllocationEngine (Application Layer - Domain Service)
 * Automatically distributes and assigns bot files, proxies, and game servers/cities
 * when users rent a bot slot.
 */
class ResourceAllocationEngine {
  constructor(fileRepo, proxyRepo, accountRepo, settingRepo) {
    this.fileRepo = fileRepo;
    this.proxyRepo = proxyRepo;
    this.accountRepo = accountRepo;
    this.settingRepo = settingRepo;
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
      proxyStrategy: 'least_loaded',
      serverBalanceStrategy: 'auto_balance'
    };
  }

  /**
   * Determine best bot file, proxy and server for a new rental
   * @param {string} plan - UPXU | FULL | FISH
   * @returns {Promise<{ fileId: string, proxyId: string|null, serverId: number, serverName: string }>}
   */
  async allocateResources(plan = 'UPXU') {
    const rules = await this.getAllocationRules();
    const planKey = String(plan || 'UPXU').toUpperCase();
    const planConfig = rules.plans[planKey] || rules.plans.UPXU;
    const targetModType = planConfig.modType || 'UPXU';

    const [allFiles, allAccounts, allProxies] = await Promise.all([
      this.fileRepo.findAll(),
      this.accountRepo.findAll(),
      this.proxyRepo.findAll()
    ]);

    // 1. Choose Bot File
    // Find files matching the target modType with available account slots
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

    // Fallback: If no matching file with slots, pick default or first file
    if (!selectedFile) {
      selectedFile = matchingFiles[0] ||
        (allFiles || []).find(f => f.id === planConfig.defaultFileId) ||
        (allFiles || []).find(f => f.isDefault) ||
        (allFiles && allFiles[0]);
    }

    const fileId = selectedFile ? selectedFile.id : 'file_1';

    // 2. Choose Proxy
    let proxyId = null;
    const activeProxies = (allProxies || []).filter(p => p.isActive && !p.isExpired);

    if (rules.proxyStrategy !== 'none' && activeProxies.length > 0) {
      if (rules.proxyStrategy === 'least_loaded') {
        // Pick active proxy with least accounts assigned across the server
        let minProxyAccs = Infinity;
        let bestProxy = activeProxies[0];

        for (const p of activeProxies) {
          const pCount = allAccounts.filter(a => a.proxyId === p.id).length;
          if (pCount < minProxyAccs) {
            minProxyAccs = pCount;
            bestProxy = p;
          }
        }
        proxyId = bestProxy ? bestProxy.id : null;
      } else if (rules.proxyStrategy === 'round_robin') {
        const idx = Math.floor(Math.random() * activeProxies.length);
        proxyId = activeProxies[idx].id;
      }
    }

    // 3. Choose Server / City (Auto-balance between Hoàn Mỹ - 0 and Diệu Kỳ - 1)
    let serverId = 0;
    if (rules.serverBalanceStrategy === 'prefer_hoan_my') {
      serverId = 0;
    } else if (rules.serverBalanceStrategy === 'prefer_dieu_ky') {
      serverId = 1;
    } else {
      // auto_balance: check current distribution in the selected file
      const hmCount = allAccounts.filter(a => a.fileId === fileId && (a.serverId === 0 || a.serverId === null)).length;
      const dkCount = allAccounts.filter(a => a.fileId === fileId && a.serverId === 1).length;
      serverId = hmCount <= dkCount ? 0 : 1;
    }

    const serverName = serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';

    return {
      fileId,
      proxyId,
      serverId,
      serverName
    };
  }
}

module.exports = ResourceAllocationEngine;
