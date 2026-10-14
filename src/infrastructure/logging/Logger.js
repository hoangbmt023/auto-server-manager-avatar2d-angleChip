/**
 * Logger (Infrastructure Layer - Logging)
 * Centralized logging utility with timestamps and log levels.
 */
class Logger {
  constructor(context = 'App') {
    this.context = context;
  }

  _format(level, message, ...args) {
    const timestamp = new Date().toISOString();
    return [`[${timestamp}] [${level}] [${this.context}] ${message}`, ...args];
  }

  info(message, ...args) {
    console.log(...this._format('INFO', message, ...args));
  }

  warn(message, ...args) {
    console.warn(...this._format('WARN', message, ...args));
  }

  error(message, ...args) {
    console.error(...this._format('ERROR', message, ...args));
  }

  debug(message, ...args) {
    if (process.env.NODE_ENV !== 'production') {
      console.debug(...this._format('DEBUG', message, ...args));
    }
  }
}

const defaultLogger = new Logger('App');

module.exports = {
  Logger,
  logger: defaultLogger
};
