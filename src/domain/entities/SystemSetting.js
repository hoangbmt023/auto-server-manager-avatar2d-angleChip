/**
 * SystemSetting Entity (Domain Layer)
 * Key-Value configuration record stored in MySQL database.
 */
class SystemSetting {
  constructor({ key, value, description = null, updatedAt = null }) {
    this.key = (key || '').trim();
    this.value = value;
    this.description = description || null;
    this.updatedAt = updatedAt || null;
  }

  validate() {
    if (!this.key) {
      throw new Error('Key cấu hình không được để trống!');
    }
  }

  getParsedValue() {
    if (typeof this.value === 'string') {
      try {
        return JSON.parse(this.value);
      } catch (e) {
        return this.value;
      }
    }
    return this.value;
  }
}

module.exports = SystemSetting;
