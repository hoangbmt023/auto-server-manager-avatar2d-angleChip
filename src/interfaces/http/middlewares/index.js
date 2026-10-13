const corsMiddleware = require('./corsMiddleware');
const createAuthMiddleware = require('./authMiddleware');
const { parseJsonBody } = require('./bodyParserMiddleware');

module.exports = {
  corsMiddleware,
  createAuthMiddleware,
  parseJsonBody
};
