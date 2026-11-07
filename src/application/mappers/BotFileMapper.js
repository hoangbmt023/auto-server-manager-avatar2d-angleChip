const BotFile = require('../../domain/entities/BotFile');
const BotFileResponseDto = require('../dtos/file/BotFileResponseDto');

/**
 * BotFileMapper (Application Layer - Mapper)
 */
class BotFileMapper {
  static toEntityFromSaveDto(dto) {
    return new BotFile({
      id: dto.id,
      name: dto.name,
      gameJar: dto.gameJar,
      modType: dto.modType,
      appId: dto.appId,
      maxAccounts: dto.maxAccounts,
      proxy: dto.proxy
    });
  }

  static toResponseDto(entity, stats = {}) {
    if (!entity) return null;
    return new BotFileResponseDto(entity, stats);
  }
}

module.exports = BotFileMapper;
