const Proxy = require('../../domain/entities/Proxy');
const ProxyResponseDto = require('../dtos/proxy/ProxyResponseDto');

/**
 * ProxyMapper (Application Layer - Mapper)
 */
class ProxyMapper {
  static toEntityFromSaveDto(dto, existing = null) {
    let password = dto.password;
    if (!password || password === '******') {
      password = existing ? existing.password : '';
    }

    return new Proxy({
      id: dto.id,
      name: dto.name,
      host: dto.host,
      port: dto.port,
      username: dto.username,
      password: password,
      type: dto.type,
      // Bảo tồn trọn vẹn trạng thái & metadata hệ thống nếu đang sửa proxy có sẵn
      externalId: existing ? existing.externalId : (dto.externalId || null),
      provider: existing ? existing.provider : (dto.provider || 'MANUAL'),
      proxyCategory: existing ? existing.proxyCategory : (dto.proxyCategory || 'DatacenterA'),
      tier: existing ? existing.tier : (dto.tier || 'CORE'),
      status: existing ? existing.status : (dto.status || 'ACTIVE'),
      maxSlots: existing ? existing.maxSlots : (dto.maxSlots || 6),
      expiresAt: existing ? existing.expiresAt : (dto.expiresAt || null),
      lastRotatedAt: existing ? existing.lastRotatedAt : null,
      failCount: existing ? existing.failCount : 0
    });
  }

  static toResponseDto(entity) {
    if (!entity) return null;
    return new ProxyResponseDto(entity);
  }
}

module.exports = ProxyMapper;
