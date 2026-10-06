const fs = require('fs');
const path = require('path');
const { execSync } = require('child_process');

/**
 * ProcessRegistry (Infrastructure Layer)
 * Central shared process & PID registry stored on disk (data/runtime/pids.json).
 * Provides cross-worker process discovery, OS-level liveness verification,
 * duplicate execution locking, and cross-worker process termination.
 */
class ProcessRegistry {
  constructor(runtimeDir = null) {
    this.workspaceRoot = path.resolve(__dirname, '../../../');
    this.runtimeDir = runtimeDir || path.resolve(this.workspaceRoot, 'data/runtime');
    this.pidsFile = path.resolve(this.runtimeDir, 'pids.json');
    this.ensureDir();
  }

  ensureDir() {
    try {
      if (!fs.existsSync(this.runtimeDir)) {
        fs.mkdirSync(this.runtimeDir, { recursive: true });
      }
    } catch (e) {
      console.error('[ProcessRegistry] Error ensuring runtime dir:', e.message);
    }
  }

  /**
   * Check if a PID is alive on the operating system
   * Works on Linux (cPanel) and Windows
   */
  static isPidAlive(pid) {
    if (!pid || typeof pid !== 'number' || pid <= 0) return false;
    try {
      // process.kill with signal 0 checks for process existence without killing it
      process.kill(pid, 0);
      return true;
    } catch (err) {
      // ESRCH: No such process
      // EPERM: Process exists but user has no permission to signal it (it is still alive!)
      return err.code === 'EPERM';
    }
  }

  /**
   * Terminate a process by PID across workers
   */
  static killPid(pid, force = false) {
    if (!pid || !ProcessRegistry.isPidAlive(pid)) return true;
    try {
      if (process.platform === 'win32') {
        execSync(`taskkill /PID ${pid} /T /F`, { stdio: 'ignore' });
      } else {
        process.kill(pid, force ? 'SIGKILL' : 'SIGTERM');
        // Give it a brief grace period, then SIGKILL if still alive
        setTimeout(() => {
          if (ProcessRegistry.isPidAlive(pid)) {
            try {
              process.kill(pid, 'SIGKILL');
            } catch (e) {}
          }
        }, 1500);
      }
      return true;
    } catch (e) {
      try {
        if (process.platform !== 'win32') {
          process.kill(pid, 'SIGKILL');
        }
      } catch (e2) {}
      return !ProcessRegistry.isPidAlive(pid);
    }
  }

  readRegistry() {
    this.ensureDir();
    try {
      if (!fs.existsSync(this.pidsFile)) {
        return {};
      }
      const raw = fs.readFileSync(this.pidsFile, 'utf8');
      if (!raw.trim()) return {};
      return JSON.parse(raw);
    } catch (e) {
      return {};
    }
  }

  writeRegistry(data) {
    this.ensureDir();
    try {
      const tempFile = `${this.pidsFile}.${process.pid}.${Date.now()}.tmp`;
      fs.writeFileSync(tempFile, JSON.stringify(data, null, 2), 'utf8');
      fs.renameSync(tempFile, this.pidsFile);
      return true;
    } catch (e) {
      try {
        fs.writeFileSync(this.pidsFile, JSON.stringify(data, null, 2), 'utf8');
        return true;
      } catch (e2) {
        console.error('[ProcessRegistry] Error writing registry:', e2.message);
        return false;
      }
    }
  }

  /**
   * Cleans up any dead PIDs from the registry and returns active records
   */
  getActiveBots() {
    const data = this.readRegistry();
    let modified = false;
    const active = {};

    for (const [accId, record] of Object.entries(data)) {
      if (record && record.pid && ProcessRegistry.isPidAlive(record.pid)) {
        active[accId] = record;
      } else {
        modified = true;
      }
    }

    if (modified) {
      this.writeRegistry(active);
    }

    return active;
  }

  isAccountRunning(accountId) {
    if (!accountId) return false;
    const active = this.getActiveBots();
    return Boolean(active[accountId] && active[accountId].pid && ProcessRegistry.isPidAlive(active[accountId].pid));
  }

  getBot(accountId) {
    const active = this.getActiveBots();
    return active[accountId] || null;
  }

  register(accountId, info) {
    if (!accountId || !info || !info.pid) return;
    const data = this.readRegistry();
    data[accountId] = {
      accountId,
      username: info.username || '',
      serverId: info.serverId !== undefined ? info.serverId : 0,
      serverName: info.serverName || '',
      fileId: info.fileId || 'file_1',
      pid: info.pid,
      workerPid: process.pid,
      startTime: info.startTime || Date.now(),
      running: true,
      stats: info.stats || {},
      accountState: info.accountState || { state: 'idle', message: 'Đang khởi chạy...' },
      autoState: info.autoState || { isRunning: false, autoType: null, status: 'idle', message: '' },
      lastUpdate: Date.now()
    };
    this.writeRegistry(data);
  }

  update(accountId, updates) {
    if (!accountId) return;
    const data = this.readRegistry();
    if (!data[accountId]) return;
    data[accountId] = {
      ...data[accountId],
      ...updates,
      lastUpdate: Date.now()
    };
    this.writeRegistry(data);
  }

  unregister(accountId) {
    if (!accountId) return;
    const data = this.readRegistry();
    if (data[accountId]) {
      delete data[accountId];
      this.writeRegistry(data);
    }
  }

  killAccount(accountId, force = false) {
    const bot = this.getBot(accountId);
    if (!bot || !bot.pid) {
      this.unregister(accountId);
      return true;
    }
    const killed = ProcessRegistry.killPid(bot.pid, force);
    this.unregister(accountId);
    return killed;
  }
}

module.exports = ProcessRegistry;
