const Proxy = require('../../domain/entities/Proxy');
const ProxyResponseDto = require('../dtos/proxy/ProxyResponseDto');

/**
 * ProxyMapper (Application Layer - Mapper)
 */
class ProxyMapper {
  static toEntityFromSaveDto(dto, existingPassword = null) {
    let password = dto.password;
    if (!password || password === '******') {
      password = existingPassword || '';
    }

    return new Proxy({
      id: dto.id,
      name: dto.name,
      host: dto.host,
      port: dto.port,
      username: dto.username,
      password: password,
      type: dto.type
    });
  }

  static toResponseDto(entity) {
    if (!entity) return null;
    return new ProxyResponseDto(entity);
  }
}

module.exports = ProxyMapper;
