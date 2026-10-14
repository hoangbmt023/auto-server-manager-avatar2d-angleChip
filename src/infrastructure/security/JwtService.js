const jwt = require('jsonwebtoken');
const config = require('../../../config');
const { UnauthorizedException } = require('../../domain/errors');

/**
 * JwtService (Infrastructure Layer - Security)
 * Manages JWT generation and verification for authenticated users.
 */
class JwtService {
  constructor() {
    this.secret = config.security.jwtSecret;
    this.expiresIn = config.security.jwtExpiresIn || '24h';
    this.refreshExpiresIn = config.security.jwtRefreshExpiresIn || '7d';
  }

  /**
   * Generates a signed Access Token
   * @param {object} user - User entity or DTO with id, email, role
   * @returns {string}
   */
  generateAccessToken(user) {
    return jwt.sign(
      {
        sub: String(user.id),
        email: user.email,
        role: user.role || 'USER'
      },
      this.secret,
      {
        expiresIn: this.expiresIn
      }
    );
  }

  /**
   * Generates a signed Refresh Token
   * @param {object} user
   * @returns {string}
   */
  generateRefreshToken(user) {
    return jwt.sign(
      {
        sub: String(user.id),
        type: 'refresh'
      },
      this.secret,
      {
        expiresIn: this.refreshExpiresIn
      }
    );
  }

  /**
   * Verifies an Access Token
   * @param {string} token
   * @returns {object} Decoded token payload
   */
  verifyAccessToken(token) {
    try {
      return jwt.verify(token, this.secret);
    } catch (err) {
      if (err.name === 'TokenExpiredError') {
        throw new UnauthorizedException('Phiên đăng nhập đã hết hạn, vui lòng đăng nhập lại!');
      }
      throw new UnauthorizedException('Token xác thực không hợp lệ!');
    }
  }

  /**
   * Verifies a Refresh Token
   * @param {string} token
   * @returns {object} Decoded token payload
   */
  verifyRefreshToken(token) {
    try {
      const decoded = jwt.verify(token, this.secret);
      if (decoded.type !== 'refresh') {
        throw new UnauthorizedException('Token làm mới không hợp lệ!');
      }
      return decoded;
    } catch (err) {
      if (err.name === 'TokenExpiredError') {
        throw new UnauthorizedException('Phiên làm mới đã hết hạn, vui lòng đăng nhập lại!');
      }
      throw new UnauthorizedException('Token làm mới không hợp lệ!');
    }
  }
}

const defaultJwtService = new JwtService();

module.exports = {
  JwtService,
  defaultJwtService
};
