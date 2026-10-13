const Account = require('../../domain/entities/Account');
const AccountResponseDto = require('../dtos/account/AccountResponseDto');

/**
 * AccountMapper (Application Layer - Mapper)
 */
class AccountMapper {
  static toEntityFromSaveDto(dto, existingPassword = null) {
    let password = dto.password;
    if (!password || password === '******') {
      password = existingPassword || '';
    }

    return new Account({
      id: dto.id,
      userId: dto.userId || null,
      username: dto.username,
      password: password,
      serverId: dto.serverId,
      fileId: dto.fileId,
      proxyId: dto.proxyId,
      note: dto.note,
      ipSlot: dto.ipSlot,
      targetCoins: dto.targetCoins,
      upDays: dto.upDays,
      farmSettings: dto.farmSettings,
      diamondSettings: dto.diamondSettings,
      fishSettings: dto.fishSettings,
      sellOreSettings: dto.sellOreSettings
    });
  }

  static toResponseDto(entity, runtimeInfo = null) {
    if (!entity) return null;
    return new AccountResponseDto(entity, runtimeInfo);
  }
}

module.exports = AccountMapper;
