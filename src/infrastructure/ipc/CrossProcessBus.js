const fs = require('fs');
const path = require('path');
const EventEmitter = require('events');

/**
 * CrossProcessBus (Infrastructure / IPC Layer)
 * Manages atomic inter-process messaging between multiple cPanel lsnode workers.
 * Synchronizes SSE events, Terminal logs, and remote bot commands across processes.
 */
class CrossProcessBus extends EventEmitter {
  constructor(runtimeDir = null) {
    super();
    this.workspaceRoot = path.resolve(__dirname, '../../../');
    this.runtimeDir = runtimeDir || path.resolve(this.workspaceRoot, 'data/runtime');
    this.eventsFile = path.resolve(this.runtimeDir, 'events.jsonl');
    this.commandsFile = path.resolve(this.runtimeDir, 'commands.jsonl');
    this.logsFile = path.resolve(this.runtimeDir, 'logs.jsonl');

    this.workerPid = process.pid;
    this.lastEventOffset = 0;
    this.lastCommandOffset = 0;
    this.pollInterval = null;
    this.seenEventIds = new Set();
    this.seenCommandIds = new Set();
    this.maxMemoryLogs = 500;
    this.localLogCache = [];

    this.ensureDir();
    this.initOffsets();
    this.startWatcher();
  }

  ensureDir() {
    try {
      if (!fs.existsSync(this.runtimeDir)) {
        fs.mkdirSync(this.runtimeDir, { recursive: true });
      }
    } catch (e) {}
  }

  initOffsets() {
    try {
      if (fs.existsSync(this.eventsFile)) {
        this.lastEventOffset = fs.statSync(this.eventsFile).size;
      }
      if (fs.existsSync(this.commandsFile)) {
        this.lastCommandOffset = fs.statSync(this.commandsFile).size;
      }
      // Preload recent logs from logsFile if exists
      if (fs.existsSync(this.logsFile)) {
        const lines = fs.readFileSync(this.logsFile, 'utf8').trim().split('\n');
        for (const line of lines.slice(-this.maxMemoryLogs)) {
          if (!line) continue;
          try {
            this.localLogCache.push(JSON.parse(line));
          } catch (e) {}
        }
      }
    } catch (e) {}
  }

  startWatcher() {
    // High-frequency polling (100ms) guarantees near-instant (<0.15s) UI sync across devices/workers
    this.pollInterval = setInterval(() => {
      this.pollNewEvents();
      this.pollNewCommands();
    }, 120);

    // Also watch via fs.watch for instant triggers when OS supports it
    try {
      if (fs.existsSync(this.eventsFile)) {
        fs.watch(this.eventsFile, () => this.pollNewEvents());
      }
    } catch (e) {}
  }

  stopWatcher() {
    if (this.pollInterval) {
      clearInterval(this.pollInterval);
      this.pollInterval = null;
    }
  }

  /**
   * Publish an event to all workers
   */
  publishEvent(eventType, data) {
    this.ensureDir();
    const eventId = `${Date.now()}_${this.workerPid}_${Math.random().toString(36).substr(2, 6)}`;
    const eventRecord = {
      id: eventId,
      workerPid: this.workerPid,
      timestamp: Date.now(),
      eventType,
      data
    };

    this.seenEventIds.add(eventId);
    if (this.seenEventIds.size > 2000) {
      const arr = Array.from(this.seenEventIds);
      this.seenEventIds = new Set(arr.slice(-1000));
    }

    try {
      fs.appendFileSync(this.eventsFile, JSON.stringify(eventRecord) + '\n', 'utf8');
      this.checkRotateEventsFile();
    } catch (err) {
      console.error('[CrossProcessBus] Error publishing event:', err.message);
    }
  }

  /**
   * Append a log entry to the shared log file and publish to bus
   */
  publishLog(logEntry) {
    this.ensureDir();
    const formatted = {
      timestamp: logEntry.timestamp || new Date().toLocaleTimeString('vi-VN', { hour12: false }),
      type: logEntry.type || 'stdout',
      accountId: logEntry.accountId || null,
      username: logEntry.username || null,
      text: (logEntry.text || '').trimEnd()
    };

    this.localLogCache.push(formatted);
    if (this.localLogCache.length > this.maxMemoryLogs) {
      this.localLogCache.shift();
    }

    try {
      fs.appendFileSync(this.logsFile, JSON.stringify(formatted) + '\n', 'utf8');
      this.checkRotateLogsFile();
    } catch (e) {}

    this.publishEvent('log', formatted);
  }

  getLogs() {
    return [...this.localLogCache];
  }

  clearLogs() {
    this.localLogCache = [];
    try {
      if (fs.existsSync(this.logsFile)) {
        fs.writeFileSync(this.logsFile, '', 'utf8');
      }
    } catch (e) {}
    this.publishEvent('clear-logs', { success: true });
  }

  /**
   * Poll newly appended events from events.jsonl
   */
  pollNewEvents() {
    try {
      if (!fs.existsSync(this.eventsFile)) return;
      const stat = fs.statSync(this.eventsFile);
      if (stat.size < this.lastEventOffset) {
        // File was truncated/rotated
        this.lastEventOffset = 0;
      }
      if (stat.size === this.lastEventOffset) return;

      const fd = fs.openSync(this.eventsFile, 'r');
      const bytesToRead = stat.size - this.lastEventOffset;
      const buffer = Buffer.alloc(bytesToRead);
      fs.readSync(fd, buffer, 0, bytesToRead, this.lastEventOffset);
      fs.closeSync(fd);

      this.lastEventOffset = stat.size;
      const chunk = buffer.toString('utf8');
      const lines = chunk.split('\n');

      for (const line of lines) {
        if (!line.trim()) continue;
        try {
          const ev = JSON.parse(line);
          if (ev && ev.id && !this.seenEventIds.has(ev.id)) {
            this.seenEventIds.add(ev.id);
            // Only handle events originating from OTHER workers
            if (ev.workerPid !== this.workerPid) {
              if (ev.eventType === 'log' && ev.data) {
                this.localLogCache.push(ev.data);
                if (this.localLogCache.length > this.maxMemoryLogs) {
                  this.localLogCache.shift();
                }
              } else if (ev.eventType === 'clear-logs') {
                this.localLogCache = [];
              }
              this.emit('remote-event', ev);
            }
          }
        } catch (e) {}
      }
    } catch (err) {}
  }

  /**
   * Send a command to the worker owning a specific account
   */
  sendCommand(accountId, action, payload = {}) {
    this.ensureDir();
    const cmdId = `${Date.now()}_${this.workerPid}_${Math.random().toString(36).substr(2, 6)}`;
    const record = {
      id: cmdId,
      senderPid: this.workerPid,
      accountId,
      action,
      payload,
      timestamp: Date.now()
    };

    this.seenCommandIds.add(cmdId);
    try {
      fs.appendFileSync(this.commandsFile, JSON.stringify(record) + '\n', 'utf8');
      return true;
    } catch (e) {
      return false;
    }
  }

  /**
   * Poll newly appended commands from commands.jsonl
   */
  pollNewCommands() {
    try {
      if (!fs.existsSync(this.commandsFile)) return;
      const stat = fs.statSync(this.commandsFile);
      if (stat.size < this.lastCommandOffset) {
        this.lastCommandOffset = 0;
      }
      if (stat.size === this.lastCommandOffset) return;

      const fd = fs.openSync(this.commandsFile, 'r');
      const bytesToRead = stat.size - this.lastCommandOffset;
      const buffer = Buffer.alloc(bytesToRead);
      fs.readSync(fd, buffer, 0, bytesToRead, this.lastCommandOffset);
      fs.closeSync(fd);

      this.lastCommandOffset = stat.size;
      const chunk = buffer.toString('utf8');
      const lines = chunk.split('\n');

      for (const line of lines) {
        if (!line.trim()) continue;
        try {
          const cmd = JSON.parse(line);
          if (cmd && cmd.id && !this.seenCommandIds.has(cmd.id)) {
            this.seenCommandIds.add(cmd.id);
            if (cmd.senderPid !== this.workerPid) {
              this.emit('remote-command', cmd);
            }
          }
        } catch (e) {}
      }
    } catch (e) {}
  }

  checkRotateEventsFile() {
    try {
      if (!fs.existsSync(this.eventsFile)) return;
      const stat = fs.statSync(this.eventsFile);
      if (stat.size > 500 * 1024) { // 500KB
        const content = fs.readFileSync(this.eventsFile, 'utf8');
        const lines = content.trim().split('\n');
        const keptLines = lines.slice(-200);
        fs.writeFileSync(this.eventsFile, keptLines.join('\n') + '\n', 'utf8');
        this.lastEventOffset = fs.statSync(this.eventsFile).size;
      }
    } catch (e) {}
  }

  checkRotateLogsFile() {
    try {
      if (!fs.existsSync(this.logsFile)) return;
      const stat = fs.statSync(this.logsFile);
      if (stat.size > 1024 * 1024) { // 1MB
        const content = fs.readFileSync(this.logsFile, 'utf8');
        const lines = content.trim().split('\n');
        const keptLines = lines.slice(-500);
        fs.writeFileSync(this.logsFile, keptLines.join('\n') + '\n', 'utf8');
      }
    } catch (e) {}
  }
}

module.exports = CrossProcessBus;
