const { BadRequestException } = require('../errors');
const { uuidv7 } = require('../../shared/utils/uuid');

/**
 * User Entity (Domain Layer)
 * Represents a registered user/admin in the system with business validations.
 * Enums stored in SQL as UPPERCASE ('USER', 'ADMIN', 'ACTIVE'), output to client as lowercase.
 */
class User {
  constructor({
    id,
    email,
    password,
    phone = null,
    role = 'USER',
    status = 'ACTIVE',
    lastLoginAt = null,
    createdAt = null,
    updatedAt = null
  }) {
    this.id = id || uuidv7();
    this.email = (email || '').trim().toLowerCase();
    this.password = password || '';
    this.phone = phone ? String(phone).trim() : null;

    const rUpper = String(role || 'USER').toUpperCase();
    this.role = rUpper === 'ADMIN' ? 'ADMIN' : 'USER';

    const sUpper = String(status || 'ACTIVE').toUpperCase();
    this.status = ['ACTIVE', 'INACTIVE', 'BANNED'].includes(sUpper) ? sUpper : 'ACTIVE';

    this.lastLoginAt = lastLoginAt || null;
    this.createdAt = createdAt || null;
    this.updatedAt = updatedAt || null;
  }

  validate() {
    if (!this.email) {
      throw new BadRequestException('Email không được để trống!');
    }
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(this.email)) {
      throw new BadRequestException(`Email [${this.email}] không đúng định dạng!`);
    }

    if (!this.password) {
      throw new BadRequestException('Mật khẩu không được để trống!');
    }

    if (this.phone) {
      const phoneRegex = /^[0-9+() -]{9,15}$/;
      if (!phoneRegex.test(this.phone)) {
        throw new BadRequestException(`Số điện thoại [${this.phone}] không đúng định dạng!`);
      }
    }
  }

  isAdmin() {
    return this.role === 'ADMIN';
  }

  isActive() {
    return this.status === 'ACTIVE';
  }

  toPersistenceJson() {
    return {
      id: this.id,
      email: this.email,
      password: this.password,
      phone: this.phone,
      role: this.role, // UPPERCASE for SQL
      status: this.status, // UPPERCASE for SQL
      lastLoginAt: this.lastLoginAt
    };
  }

  toPublicJson() {
    return {
      id: this.id,
      email: this.email,
      phone: this.phone,
      role: this.role.toLowerCase(), // lowercase for response
      status: this.status.toLowerCase(), // lowercase for response
      lastLoginAt: this.lastLoginAt,
      createdAt: this.createdAt,
      updatedAt: this.updatedAt
    };
  }
}

module.exports = User;
