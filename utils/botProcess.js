/**
 * Backward compatibility wrapper for utils/botProcess.js
 * Delegates to new MultiBotManager and SingleBotProcess in src/
 */
const SingleBotProcess = require('../src/infrastructure/process/SingleBotProcess');
const MultiBotManager = require('../src/application/services/MultiBotManager');

module.exports = {
  BotProcessManager: SingleBotProcess,
  SingleBotProcess,
  MultiBotManager
};
