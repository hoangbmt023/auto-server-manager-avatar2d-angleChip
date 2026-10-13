const crypto = require('crypto');

/**
 * UUIDv7 Generator (RFC 9562)
 * High-performance, time-ordered 36-character UUIDv7 generator.
 * Combines 48-bit millisecond timestamp + 74 random bits.
 * Perfectly suited for MySQL primary keys with B-Tree index locality.
 */
function uuidv7() {
  const bytes = crypto.randomBytes(16);
  const now = Date.now();

  bytes[0] = (now / 0x10000000000) & 0xff;
  bytes[1] = (now / 0x100000000) & 0xff;
  bytes[2] = (now / 0x1000000) & 0xff;
  bytes[3] = (now / 0x10000) & 0xff;
  bytes[4] = (now / 0x100) & 0xff;
  bytes[5] = now & 0xff;

  bytes[6] = 0x70 | (bytes[6] & 0x0f);
  bytes[8] = 0x80 | (bytes[8] & 0x3f);

  const hex = bytes.toString('hex');
  return `${hex.slice(0, 8)}-${hex.slice(8, 12)}-${hex.slice(12, 16)}-${hex.slice(16, 20)}-${hex.slice(20, 32)}`;
}

module.exports = {
  uuidv7,
  generateUuidV7: uuidv7
};
