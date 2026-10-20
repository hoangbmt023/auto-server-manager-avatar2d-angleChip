const Voucher = require('../../../domain/entities/Voucher');
const { BadRequestException } = require('../../../domain/errors');
const config = require('../../../../config');
const AsyncMutex = require('../../../shared/utils/AsyncMutex');

/**
 * ManageRentalAllocationsUseCase (Application Layer)
 * Allows Admin to configure bot rental plans, resource allocation policies, and vouchers.
 */
class ManageRentalAllocationsUseCase {
  constructor(settingRepo, voucherRepo, fileRepo, proxyRepo, mutex = null) {
    this.settingRepo = settingRepo;
    this.voucherRepo = voucherRepo;
    this.fileRepo = fileRepo;
    this.proxyRepo = proxyRepo;
    this.mutex = mutex || AsyncMutex.globalAllocationMutex || new AsyncMutex('manage-rental-allocations');
  }

  async getAllocationConfig() {
    let rules = null;
    try {
      rules = await this.settingRepo.get('rental_allocation_rules');
    } catch (e) {}

    const [files, proxies, vouchers] = await Promise.all([
      this.fileRepo.findAll(),
      this.proxyRepo.findAll(),
      this.voucherRepo.findAll()
    ]);

    const defaultRules = {
      plans: {
        UPXU: {
          name: 'Auto Up Xu Nông Trại',
          priceMonth: 50000,
          modType: 'UPXU',
          defaultFileId: 'file_1',
          desc: 'Gói cày xu cơ bản tiết kiệm chi phí cho tài khoản nông dân',
          features: ['farm', 'upThue']
        },
        FULL: {
          name: 'Auto Full chức năng',
          priceMonth: 90000,
          modType: 'CHIPMIX',
          defaultFileId: 'file_1',
          desc: 'Gói toàn năng hỗ trợ đầy đủ mọi hoạt động kiếm xu và ngọc tự động',
          features: ['farm', 'fish', 'diamond', 'sellOre', 'upThue']
        },
        FISH: {
          name: 'Auto Câu Cá Chuyên Nghiệp',
          priceMonth: 60000,
          modType: 'FISH',
          defaultFileId: 'file_1',
          desc: 'Gói chuyên biệt cho cần thủ, tối ưu hoá thời gian và lợi nhuận câu cá',
          features: ['fish', 'upThue']
        }
      },
      durationDiscounts: { 1: 0, 3: 10, 6: 20, 12: 30 },
      topupBonusTiers: [
        { minAmount: 50000, bonusPercent: 5, desc: 'Nạp từ 50.000đ tặng 5%' },
        { minAmount: 200000, bonusPercent: 10, desc: 'Nạp từ 200.000đ tặng 10%' },
        { minAmount: 500000, bonusPercent: 15, desc: 'Nạp từ 500.000đ tặng 15%' },
        { minAmount: 1000000, bonusPercent: 20, desc: 'Nạp từ 1.000.000đ tặng 20%' }
      ],
      topupPresets: [10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000],
      minTopupAmount: 10000,
      payosConfig: {
        enabled: false,
        clientId: '',
        apiKey: '',
        checksumKey: '',
        bankAccount: '',
        bankName: ''
      },
      proxyStrategy: 'dynamic_best_fit',
      serverBalanceStrategy: 'auto_balance'
    };

    let topupDb = null;
    try {
      topupDb = await this.settingRepo.get('topup_settings');
    } catch (e) {}

    const plansMerged = { ...defaultRules.plans, ...(rules?.plans || {}) };
    for (const [key, plan] of Object.entries(plansMerged)) {
      if (!Array.isArray(plan.features)) {
        if (key === 'FULL') plan.features = ['farm', 'fish', 'diamond', 'sellOre', 'upThue'];
        else if (key === 'FISH') plan.features = ['fish', 'upThue'];
        else plan.features = ['farm', 'upThue'];
      }
    }

    const mergedRules = {
      ...defaultRules,
      ...(rules || {}),
      plans: plansMerged,
      durationDiscounts: rules?.durationDiscounts || defaultRules.durationDiscounts,
      topupBonusTiers: topupDb?.bonusTiers || rules?.topupBonusTiers || defaultRules.topupBonusTiers,
      topupPresets: topupDb?.presets || rules?.topupPresets || defaultRules.topupPresets,
      minTopupAmount: topupDb?.minAmount || rules?.minTopupAmount || defaultRules.minTopupAmount,
      payosConfig: { ...defaultRules.payosConfig, ...(rules?.payosConfig || {}) },
      proxyStrategy: 'dynamic_best_fit',
      serverBalanceStrategy: 'auto_balance'
    };

    return {
      rules: mergedRules,
      payosEnv: {
        configuredInEnv: Boolean(config.payos?.clientId && config.payos?.apiKey && config.payos?.checksumKey),
        enabled: Boolean(config.payos?.enabled),
        clientIdMasked: config.payos?.clientId ? `${config.payos.clientId.substring(0, 6)}******` : '',
        bankName: config.payos?.bankName || config.payment?.bankName || 'MBBank',
        bankAccount: config.payos?.bankAccount || config.payment?.bankAccount || '',
        accountName: config.payos?.accountName || config.payment?.accountName || '',
        webhookUrl: `${config.payment?.publicAppUrl || 'http://localhost:3001'}/api/billing/payos-webhook`
      },
      proxyVnEnv: {
        configuredInEnv: Boolean(config.proxyVn?.apiKey),
        enabled: Boolean(config.proxyVn?.enabled),
        baseUrl: config.proxyVn?.baseUrl || 'https://proxy.vn/apiv2',
        defaultCategory: config.proxyVn?.defaultCategory || 'DatacenterA',
        defaultType: config.proxyVn?.defaultType || 'SOCKS5'
      },
      availableFiles: files.map(f => ({ id: f.id, name: f.name, modType: f.modType })),
      availableProxies: proxies.map(p => ({ id: p.id, name: p.name, host: p.host })),
      vouchers: vouchers.map(v => v.toPublicJson())
    };
  }

  async updateAllocationRules(newRules) {
    if (this.mutex) {
      return this.mutex.runExclusive(async () => {
        return this._updateAllocationRulesInternal(newRules);
      });
    }
    return this._updateAllocationRulesInternal(newRules);
  }

  async _updateAllocationRulesInternal(newRules) {
    if (!newRules || typeof newRules !== 'object') {
      throw new BadRequestException('Dữ liệu cấu hình không hợp lệ!');
    }
    await this.settingRepo.set('rental_allocation_rules', newRules, 'Cấu hình bảng giá và quy tắc phân bổ bot tự động');

    // Đồng bộ cấu hình topup_settings vào DB
    if (newRules.topupPresets || newRules.topupBonusTiers || newRules.minTopupAmount) {
      const topupSettings = {
        presets: Array.isArray(newRules.topupPresets) ? newRules.topupPresets.map(Number) : [10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000],
        bonusTiers: Array.isArray(newRules.topupBonusTiers) ? newRules.topupBonusTiers : [],
        minAmount: Number(newRules.minTopupAmount || 10000)
      };
      await this.settingRepo.set('topup_settings', topupSettings, 'Cấu hình mệnh giá nạp tiền và tỷ lệ thưởng nạp');
    }

    return newRules;
  }

  async createVoucher(voucherData) {
    const v = new Voucher(voucherData);
    v.validate();
    const existing = await this.voucherRepo.findByCode(v.code);
    if (existing) {
      throw new BadRequestException(`Mã voucher [${v.code}] đã tồn tại!`);
    }
    return this.voucherRepo.save(v);
  }

  async updateVoucher(code, voucherData) {
    if (!code) throw new BadRequestException('Mã voucher không hợp lệ!');
    const existing = await this.voucherRepo.findByCode(code);
    if (!existing) {
      throw new BadRequestException(`Mã voucher [${code}] không tồn tại!`);
    }

    if (voucherData.discountPercent !== undefined) {
      existing.discountPercent = Math.min(100, Math.max(0, parseInt(voucherData.discountPercent || 0, 10)));
    }
    if (voucherData.discountAmount !== undefined) {
      existing.discountAmount = Math.max(0, parseInt(voucherData.discountAmount || 0, 10));
    }
    if (voucherData.maxDiscountAmount !== undefined) {
      existing.maxDiscountAmount = Math.max(0, parseInt(voucherData.maxDiscountAmount || 0, 10));
    }
    if (voucherData.minOrder !== undefined) {
      existing.minOrder = Math.max(0, parseInt(voucherData.minOrder || 0, 10));
    }
    if (voucherData.maxUses !== undefined) {
      existing.maxUses = Math.max(1, parseInt(voucherData.maxUses || 100, 10));
    }
    if (voucherData.maxUsesPerUser !== undefined) {
      existing.maxUsesPerUser = Math.max(1, parseInt(voucherData.maxUsesPerUser || 1, 10));
    }
    if (voucherData.isActive !== undefined) {
      existing.isActive = Boolean(voucherData.isActive);
    }
    if (voucherData.expiresAt !== undefined) {
      existing.expiresAt = voucherData.expiresAt ? new Date(voucherData.expiresAt) : null;
    }

    existing.validate();
    return this.voucherRepo.save(existing);
  }

  async deleteVoucher(code) {
    return this.voucherRepo.delete(code);
  }
}

module.exports = ManageRentalAllocationsUseCase;
