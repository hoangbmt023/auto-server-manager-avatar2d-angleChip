const { ValidationException } = require('../../../domain/errors');

/**
 * SaveProxyRequestDto (Application Layer - DTO)
 */
class SaveProxyRequestDto {
  constructor({
    id = null,
    name = '',
    host = '',
    port = '',
    username = '',
    password = '',
    type = 'socks5'
  } = {}) {
    this.id = id;
    this.name = (name || '').trim();
    this.host = (host || '').trim();
    this.port = parseInt(port, 10);
    this.username = (username || '').trim();
    this.password = (password || '').trim();
    this.type = (type || 'socks5').toLowerCase() === 'http' ? 'http' : 'socks5';
  }

  validate() {
    const errors = {};
    if (!this.host) {
      errors.host = 'Địa chỉ IP / Host của Proxy không được để trống!';
    }
    if (isNaN(this.port) || this.port < 1 || this.port > 65535) {
      errors.port = `Cổng Port [${this.port}] không hợp lệ (1-65535)!`;
    }
    if (Object.keys(errors).length > 0) {
      throw new ValidationException(errors, 'Không hợp lệ');
    }
  }
}

module.exports = SaveProxyRequestDto;
