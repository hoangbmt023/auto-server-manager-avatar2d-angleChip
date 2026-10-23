const Account = require('../../domain/entities/Account');
const AccountResponseDto = require('../dtos/account/AccountResponseDto');

/**
 * AccountMapper (Application Layer - Mapper)
 */
class AccountMapper {
  static toEntityFromSaveDto(dto, existing = null) {
    const isExistingEntity = existing && typeof existing === 'object';
    let existingPassword = isExistingEntity ? existing.password : existing;

    let password = dto.password;
    if (!password || password === '******') {
      password = existingPassword || '';
    }

    return new Account({
      id: dto.id || (isExistingEntity ? existing.id : null),
      userId: isExistingEntity ? (existing.userId || dto.userId || null) : (dto.userId || null),
      username: dto.username || (isExistingEntity ? existing.username : ''),
      password: password,
      serverId: dto.serverId !== undefined ? dto.serverId : (isExistingEntity ? existing.serverId : 0),
      fileId: dto.fileId || (isExistingEntity ? existing.fileId : 'file_1'),
      proxyId: dto.proxyId !== undefined ? dto.proxyId : (isExistingEntity ? existing.proxyId : null),
      note: dto.note !== undefined ? dto.note : (isExistingEntity ? existing.note : ''),
      ipSlot: dto.ipSlot !== undefined ? dto.ipSlot : (isExistingEntity ? existing.ipSlot : 1),
      isEmergencySlot: isExistingEntity ? existing.isEmergencySlot : false,
      targetCoins: dto.targetCoins !== undefined && dto.targetCoins !== null ? dto.targetCoins : (isExistingEntity ? existing.targetCoins : 0),
      upDays: dto.upDays !== undefined && dto.upDays !== null ? dto.upDays : (isExistingEntity ? existing.upDays : 0),
      pendingReset: isExistingEntity ? existing.pendingReset : false,
      rentalExpiresAt: isExistingEntity ? existing.rentalExpiresAt : (dto.rentalExpiresAt || null),
      rentalPlan: isExistingEntity ? existing.rentalPlan : (dto.rentalPlan || null),
      effectivePriceMonth: isExistingEntity ? (existing.effectivePriceMonth || dto.effectivePriceMonth || null) : (dto.effectivePriceMonth || null),
      deletedAt: isExistingEntity ? (existing.deletedAt || dto.deletedAt || null) : (dto.deletedAt || null),
      createdAt: isExistingEntity ? (existing.createdAt || dto.createdAt || null) : (dto.createdAt || null),
      updatedAt: isExistingEntity ? (existing.updatedAt || dto.updatedAt || null) : (dto.updatedAt || null),
      farmSettings: dto.farmSettings !== undefined && dto.farmSettings !== null ? dto.farmSettings : (isExistingEntity ? existing.farmSettings : null),
      diamondSettings: dto.diamondSettings !== undefined && dto.diamondSettings !== null ? dto.diamondSettings : (isExistingEntity ? existing.diamondSettings : null),
      fishSettings: dto.fishSettings !== undefined && dto.fishSettings !== null ? dto.fishSettings : (isExistingEntity ? existing.fishSettings : null),
      sellOreSettings: dto.sellOreSettings !== undefined && dto.sellOreSettings !== null ? dto.sellOreSettings : (isExistingEntity ? existing.sellOreSettings : null)
    });
  }

  static toResponseDto(entity, runtimeInfo = null, proxyOrName = null, allowedFeatures = null, rentalPlanName = null, rentedBy = null) {
    if (!entity) return null;
    let proxyName = null;
    let proxyExpiresAt = null;
    if (proxyOrName && typeof proxyOrName === 'object') {
      proxyName = proxyOrName.name || null;
      proxyExpiresAt = proxyOrName.expiresAt || null;
    } else if (typeof proxyOrName === 'string') {
      proxyName = proxyOrName;
    }
    return new AccountResponseDto(entity, runtimeInfo, proxyName, proxyExpiresAt, allowedFeatures, rentalPlanName, rentedBy);
  }
}

module.exports = AccountMapper;
