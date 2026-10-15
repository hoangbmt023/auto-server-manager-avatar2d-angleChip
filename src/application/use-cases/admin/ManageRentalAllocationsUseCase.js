const Voucher = require('../../../domain/entities/Voucher');
const { BadRequestException } = require('../../../domain/errors');

/**
 * ManageRentalAllocationsUseCase (Application Layer)
 * Allows Admin to configure bot rental plans, resource allocation policies, and vouchers.
 */
class ManageRentalAllocationsUseCase {
  constructor(settingRepo, voucherRepo, fileRepo, proxyRepo) {
    this.settingRepo = settingRepo;
    this.voucherRepo = voucherRepo;
    this.fileRepo = fileRepo;
    this.proxyRepo = proxyRepo;
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

    return {
      rules: rules || {
        plans: {
          UPXU: { name: 'Auto Up Xu Nông Trại', priceMonth: 50000, modType: 'UPXU', defaultFileId: 'file_1', desc: 'Chăm farm, thu hoạch, giao đơn hàng, bán nông sản' },
          FULL: { name: 'Full Chức Năng ChipMix', priceMonth: 90000, modType: 'CHIPMIX', defaultFileId: 'file_1', desc: 'Đầy đủ Farm + Câu cá + Đập đá + Bán quặng' },
          FISH: { name: 'Auto Câu Cá Chuyên Nghiệp', priceMonth: 60000, modType: 'FISH', defaultFileId: 'file_1', desc: 'Auto câu các map, tự mua vé & bán cá thông minh' }
        },
        durationDiscounts: { 1: 0, 3: 10, 6: 20, 12: 30 },
        proxyStrategy: 'least_loaded',
        serverBalanceStrategy: 'auto_balance'
      },
      availableFiles: files.map(f => ({ id: f.id, name: f.name, modType: f.modType })),
      availableProxies: proxies.map(p => ({ id: p.id, name: p.name, host: p.host })),
      vouchers: vouchers.map(v => v.toPublicJson())
    };
  }

  async updateAllocationRules(newRules) {
    if (!newRules || typeof newRules !== 'object') {
      throw new BadRequestException('Dữ liệu cấu hình không hợp lệ!');
    }
    await this.settingRepo.set('rental_allocation_rules', newRules);
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

  async deleteVoucher(code) {
    return this.voucherRepo.delete(code);
  }
}

module.exports = ManageRentalAllocationsUseCase;
