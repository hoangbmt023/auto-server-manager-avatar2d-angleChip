const { spawn, execSync } = require('child_process');
const path = require('path');
const fs = require('fs');
const EventEmitter = require('events');
const ProxyChecker = require('../network/ProxyChecker');
const BotIpcProtocol = require('./BotIpcProtocol');

/**
 * SingleBotProcess (Infrastructure Layer)
 * Manages an individual Java process execution for a single Avatar account.
 */
class SingleBotProcess extends EventEmitter {
  constructor(account, fileProfile, globalConfig, proxy = null) {
    super();
    this.account = account;
    this.fileProfile = fileProfile;
    this.globalConfig = globalConfig;
    this.proxy = proxy;
    this.child = null;
    this.startTime = null;
    this.restartAttempts = 0;
    this.isManualStop = false;
    this.loginWatchdogTimer = null;
    this._isCheckingProxy = false;
    this.accountState = {
      state: 'idle',
      message: 'Chưa chạy',
      isError: false,
      isMaintenance: false
    };
    this.playerStats = {
      coins: 0,
      gold: 0,
      lockedGold: 0,
      targetCoins: 0,
      earnedCoins: 0,
      collectedHearts: 0,
      kcx: '+0',
      nhb: '+0',
      farmingTime: '--:--',
      farmingCountdown: '--:--',
      startedAt: '--',
      expiresAt: 'Vĩnh viễn'
    };
    this.autoState = {
      isRunning: false,
      autoType: null,
      status: 'idle',
      message: ''
    };
    this.workspaceRoot = path.resolve(__dirname, '../../../');
    this._stdoutBuffer = '';
    this._stderrBuffer = '';
  }

  resolveJar(jarFilename) {
    if (!jarFilename) return '';
    const candidates = [
      path.resolve(this.workspaceRoot, 'jars/games', jarFilename),
      path.resolve(this.workspaceRoot, 'jars/emulator', jarFilename),
      path.resolve(this.workspaceRoot, 'jars', jarFilename),
      path.resolve(this.workspaceRoot, jarFilename)
    ];
    for (const candidate of candidates) {
      if (fs.existsSync(candidate)) return candidate;
    }
    return path.resolve(this.workspaceRoot, 'jars/games', jarFilename);
  }

  buildArgs(javaBin) {
    const args = [];
    const memoryMb = parseInt(this.globalConfig.maxMemoryMb || 64, 10);

    args.push(`-Xmx${memoryMb}M`);
    args.push(`-Xms24M`);
    args.push('-Xss256k');
    args.push('-XX:+UseSerialGC');
    args.push('-XX:TieredStopAtLevel=1');
    args.push('-XX:CICompilerCount=1');
    args.push('-XX:ReservedCodeCacheSize=16M');
    args.push('-Djava.awt.headless=true');
    args.push('-Dfile.encoding=UTF-8');
    args.push('-Dsun.stdout.encoding=UTF-8');
    args.push('-Dsun.stderr.encoding=UTF-8');
    args.push('-Dstdout.encoding=UTF-8');
    args.push('-Dstderr.encoding=UTF-8');
    args.push(`-Duser.home=${this.workspaceRoot}`);

    // Pass account-specific properties
    if (this.account.username) args.push(`-Davatar.user=${this.account.username}`);
    if (this.account.password) args.push(`-Davatar.pass=${this.account.password}`);
    args.push(`-Davatar.server=${this.account.serverId !== undefined ? this.account.serverId : 0}`);
    args.push(`-Davatar.serverName=${this.account.serverName || (this.account.serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ')}`);

    if (this.account.targetCoins) args.push(`-Davatar.targetCoins=${this.account.targetCoins}`);
    if (this.account.upDays) args.push(`-Davatar.upDays=${this.account.upDays}`);
    if (this.account.pendingReset) {
      args.push('-Davatar.resetOnStart=true');
      this.account.pendingReset = false;
    }
    if (this.account.farmSettings) {
      const jsonStr = JSON.stringify(this.account.farmSettings);
      const b64 = Buffer.from(jsonStr, 'utf8').toString('base64');
      args.push(`-Davatar.farmSettingsB64=${b64}`);
    }
    if (this.account.diamondSettings) {
      const jsonStr = JSON.stringify(this.account.diamondSettings);
      const b64 = Buffer.from(jsonStr, 'utf8').toString('base64');
      args.push(`-Davatar.diamondSettingsB64=${b64}`);
    }
    if (this.account.fishSettings) {
      const jsonStr = JSON.stringify(this.account.fishSettings);
      const b64 = Buffer.from(jsonStr, 'utf8').toString('base64');
      args.push(`-Davatar.fishSettingsB64=${b64}`);
    }
    if (this.account.sellOreSettings) {
      const jsonStr = JSON.stringify(this.account.sellOreSettings);
      const b64 = Buffer.from(jsonStr, 'utf8').toString('base64');
      args.push(`-Davatar.sellOreSettingsB64=${b64}`);
    }

    const safeAppId = `avatar_${this.account.username || this.account.id}_${this.fileProfile ? this.fileProfile.id : 'def'}`;
    args.push(`-Davatar.appId=${safeAppId}`);

    const autoToStart = (this.autoState && this.autoState.isRunning && this.autoState.autoType)
      ? this.autoState.autoType
      : (this.account && (this.account.lastAutoType || this.account.defaultAutoType));
    if (autoToStart) {
      args.push(`-Davatar.autoStartType=${autoToStart}`);
      if (!this.autoState || !this.autoState.isRunning) {
        this.autoState = {
          isRunning: true,
          autoType: autoToStart,
          status: 'running',
          message: `Khôi phục ${this.getFriendlyName(autoToStart)}...`
        };
      }
    }

    // Proxy configuration (Directly injected Proxy, Account-specific Proxy, File Profile Proxy, or Global Proxy)
    let proxy = this.proxy;
    if (!proxy && this.account.proxyId && Array.isArray(this.globalConfig.proxies)) {
      proxy = this.globalConfig.proxies.find(p => p.id === this.account.proxyId) || null;
    } else if (!proxy && this.fileProfile && this.fileProfile.proxy && this.fileProfile.proxy.enabled && this.fileProfile.proxy.host) {
      proxy = this.fileProfile.proxy;
    } else if (!proxy && this.globalConfig.proxy && this.globalConfig.proxy.enabled && this.globalConfig.proxy.host) {
      proxy = this.globalConfig.proxy;
    }

    // FAIL-CLOSED SECURITY GUARD:
    // 1. Tài khoản thuê của khách hàng (có userId hoặc có hạn thuê rentalExpiresAt):
    //    -> BẮT BUỘC phải có Proxy hợp lệ để bảo vệ 100% IP máy chủ.
    // 2. Tài khoản quản trị nội bộ của Admin (không gắn userId / không có hạn thuê):
    //    -> Cho phép chạy bằng IP Mặc định (Direct IP máy chủ) nếu Admin không gán Proxy.
    const isCustomerRental = Boolean(this.account && (this.account.userId || this.account.rentalExpiresAt));
    if (isCustomerRental && (!proxy || !proxy.host || !proxy.port)) {
      const errText = `[SECURITY BLOCK] Không tìm thấy cấu hình Proxy hợp lệ cho tài khoản thuê [${this.account.username || this.account.id}]. Đã chặn đứng tiến trình bot để bảo vệ 100% IP máy chủ!`;
      this.emitLog('error', `🚨 ${errText}`);
      throw new Error(errText);
    }
    this.proxy = proxy;

    if (proxy && proxy.host && proxy.port) {
      const type = (proxy.type || 'socks').toLowerCase();
      if (type === 'socks' || type === 'socks5' || type === 'socks4') {
        args.push(`-DsocksProxyHost=${proxy.host}`);
        args.push(`-DsocksProxyPort=${proxy.port}`);
        args.push('-DsocksProxyVersion=5');
        if (proxy.username) {
          args.push(`-Djava.net.socks.username=${proxy.username}`);
          args.push(`-Davatar.proxyUser=${proxy.username}`);
        }
        if (proxy.password) {
          args.push(`-Djava.net.socks.password=${proxy.password}`);
          args.push(`-Davatar.proxyPass=${proxy.password}`);
        }
      } else {
        args.push(`-Dhttp.proxyHost=${proxy.host}`);
        args.push(`-Dhttp.proxyPort=${proxy.port}`);
        args.push(`-Dhttps.proxyHost=${proxy.host}`);
        args.push(`-Dhttps.proxyPort=${proxy.port}`);
        if (proxy.username) {
          args.push(`-Dhttp.proxyUser=${proxy.username}`);
          args.push(`-Davatar.proxyUser=${proxy.username}`);
        }
        if (proxy.password) {
          args.push(`-Dhttp.proxyPassword=${proxy.password}`);
          args.push(`-Davatar.proxyPass=${proxy.password}`);
        }
      }
      args.push('-Djava.net.useSystemProxies=true');
      args.push('-Dhttp.nonProxyHosts=angelchip.net|*.angelchip.net');
      args.push('-Dhttps.nonProxyHosts=angelchip.net|*.angelchip.net');
      args.push('-Djdk.http.auth.tunneling.disabledSchemes=');
      args.push(`-Davatar.proxyHost=${proxy.host}`);
      args.push(`-Davatar.proxyPort=${proxy.port}`);
      args.push(`-Davatar.proxyType=${type}`);
    } else {
      this.emitLog('info', `🌐 [${this.account.username}] Đang chạy bằng IP Mặc định (Direct IP của máy chủ).`);
    }

    // Emulator JAR & Classpath
    const emulatorName = this.globalConfig.emulatorJar || 'AngelChipEmulator_V2Proxy.jar';
    const emulatorJar = this.resolveJar(emulatorName);
    const javaEngineBin = path.resolve(this.workspaceRoot, 'java-engine/bin');
    const cpSeparator = process.platform === 'win32' ? ';' : ':';
    args.push('-cp', `${emulatorJar}${cpSeparator}${javaEngineBin}${cpSeparator}${this.workspaceRoot}`);
    args.push('AvatarHeadlessLauncher');

    // Headless args
    args.push('--headless');
    args.push('--rms', this.globalConfig.rmsMode === 'memory' ? 'memory' : 'file');
    args.push('--appid', safeAppId);

    // Target game JAR with Auto Integrity Verification & Recovery
    let gameJar = (this.fileProfile && this.fileProfile.gameJar) ? this.fileProfile.gameJar : (this.globalConfig.gameJar || 'avatar_upxu_build34.jar');
    let gameJarPath = this.resolveJar(gameJar);

    if (!fs.existsSync(gameJarPath)) {
      this.emitLog('warn', `⚠️ [${this.account.username}] Không tìm thấy file game [${gameJar}], đang tìm file thay thế trong jars/...`);
      const fallbackList = ['avatar_upxu_build34.jar', 'avatar_fish_build40.jar', 'avatar_upxu_build32.jar'];
      for (const alt of fallbackList) {
        const altPath = this.resolveJar(alt);
        if (fs.existsSync(altPath)) {
          gameJarPath = altPath;
          this.emitLog('info', `✅ [${this.account.username}] Sử dụng file game có sẵn: [${alt}]`);
          break;
        }
      }
    }
    args.push(gameJarPath);

    return args;
  }

  start(javaBin) {
    if (this.child && !this.child.killed) {
      return false;
    }

    this.isManualStop = false;
    if (this.restartTimer) {
      clearTimeout(this.restartTimer);
      this.restartTimer = null;
    }

    const args = this.buildArgs(javaBin);
    const serverName = this.account.serverName || (this.account.serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ');
    this.emitLog('system', `🚀 [${this.account.username}] Khởi chạy tiến trình bot trên Server [${serverName}]...`);

    try {
      this.child = spawn(javaBin, args, {
        cwd: this.workspaceRoot,
        env: {
          ...process.env,
          JAVA_TOOL_OPTIONS: '-Dfile.encoding=UTF-8 -Dsun.jnu.encoding=UTF-8'
        }
      });

      this.startTime = Date.now();
      const pid = this.child.pid;
      this.emitLog('info', `✅ [${this.account.username}] Bot đang chạy (PID: ${pid})`);
      this.emit('started', { accountId: this.account.id, pid });

      // Reset stream buffers
      this._stdoutBuffer = '';
      this._stderrBuffer = '';

      // Handle STDOUT with stream line buffering
      this.child.stdout.on('data', (chunk) => {
        this._stdoutBuffer += chunk.toString('utf8');
        const lines = this._stdoutBuffer.split('\n');
        this._stdoutBuffer = lines.pop(); // Keep incomplete trailing fragment
        for (const line of lines) {
          this.processLogOutput(line, 'stdout');
        }
      });

      // Handle STDERR with stream line buffering
      this.child.stderr.on('data', (chunk) => {
        this._stderrBuffer += chunk.toString('utf8');
        const lines = this._stderrBuffer.split('\n');
        this._stderrBuffer = lines.pop();
        for (const line of lines) {
          this.processLogOutput(line, 'stderr');
        }
      });

      // Handle Exit
      this.child.on('close', (code, signal) => {
        if (this._stdoutBuffer && this._stdoutBuffer.trim()) {
          this.processLogOutput(this._stdoutBuffer, 'stdout');
          this._stdoutBuffer = '';
        }
        if (this._stderrBuffer && this._stderrBuffer.trim()) {
          this.processLogOutput(this._stderrBuffer, 'stderr');
          this._stderrBuffer = '';
        }
        this.emitLog('warn', `⚠️ [${this.account.username}] Tiến trình bot dừng với mã thoát: ${code || signal || '0'}`);
        const wasManual = this.isManualStop;
        this.child = null;
        this.startTime = null;
        this.emit('stopped', { accountId: this.account.id, code, wasManual });

        if (!wasManual && this.globalConfig.autoRestart) {
          this.scheduleRestart(javaBin);
        }
      });

      this.child.on('error', (err) => {
        this.emitLog('error', `❌ [${this.account.username}] Lỗi tiến trình bot: ${err.message}`);
        this.emit('error', { accountId: this.account.id, error: err });
      });

      return true;
    } catch (err) {
      this.emitLog('error', `❌ [${this.account.username}] Không thể khởi chạy: ${err.message}`);
      return false;
    }
  }

  processLogOutput(rawText, streamType) {
    const lines = rawText.split('\n');
    for (const rawLine of lines) {
      const line = rawLine.trimEnd();
      if (!line) continue;

      const parsed = BotIpcProtocol.parseLine(line, streamType, {
        username: this.account.username,
        accountState: this.accountState,
        autoState: this.autoState,
        playerStats: this.playerStats,
        proxyId: this.account.proxyId
      });

      if (parsed.accountStatusUpdate) {
        this.accountState = {
          ...this.accountState,
          ...parsed.accountStatusUpdate
        };
        this.emit('account-status', { accountId: this.account.id, state: this.accountState });
      }

      if (parsed.isTargetReached) {
        this.isManualStop = true;
        this.accountState = {
          state: 'target_reached',
          message: parsed.accountStatusUpdate && parsed.accountStatusUpdate.message ? parsed.accountStatusUpdate.message : 'Đã đạt yêu cầu up xu theo cài đặt!',
          isCompleted: true,
          isError: false,
          isMaintenance: false
        };
        this.emit('account-status', { accountId: this.account.id, state: this.accountState });
        this.emitLog('success', `🏆 [${this.account.username}] 🎉 HOÀN THÀNH MỤC TIÊU: ${this.accountState.message}`);
        setTimeout(() => this.stop(), 1000);
      }

      if (parsed.autoStatusUpdate) {
        this.autoState = {
          ...this.autoState,
          ...parsed.autoStatusUpdate
        };
        this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });

        if (!this.autoState.isRunning && (this.autoState.status === 'finished' || this.autoState.finished)) {
          if (this.autoResetTimer) clearTimeout(this.autoResetTimer);
          this.autoResetTimer = setTimeout(() => {
            this.autoState = {
              isRunning: false,
              autoType: null,
              subTask: null,
              status: 'idle',
              message: ''
            };
            this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });
          }, 5000);
        }
      }

      if (parsed.statsUpdate) {
        this.playerStats = {
          ...this.playerStats,
          ...parsed.statsUpdate
        };
        this.emit('stats', { accountId: this.account.id, stats: this.playerStats });
      }

      if (parsed.proxyExpiredReason) {
        this.emit('proxy-expired', {
          proxyId: this.account.proxyId,
          reason: parsed.proxyExpiredReason
        });
      }

      if (parsed.shouldCheckProxyHealth) {
        this.triggerProxyHealthCheck('Mất kết nối mạng / Socket Timeout qua Proxy');
      }

      if (parsed.loginWatchdogAction === 'clear') {
        if (this.loginWatchdogTimer) {
          clearTimeout(this.loginWatchdogTimer);
          this.loginWatchdogTimer = null;
        }
      } else if (parsed.loginWatchdogAction === 'reset') {
        if (this.loginWatchdogTimer) clearTimeout(this.loginWatchdogTimer);
        this.loginWatchdogTimer = setTimeout(() => {
          if (this.accountState.state !== 'online' && (!this.playerStats || this.playerStats.coins <= 0)) {
            this.triggerProxyHealthCheck('Quá thời gian chờ kết nối game (Login Timeout qua Proxy)');
          }
        }, 18000);
      }

      if (parsed.formattedText && !parsed.handledSpecialPacket) {
        this.emitLog(parsed.logType, parsed.formattedText);
      }
    }
  }

  emitLog(type, text) {
    const timestamp = new Date().toLocaleTimeString('vi-VN', { hour12: false });
    const logEntry = {
      timestamp,
      type,
      accountId: this.account.id,
      username: this.account.username,
      text: text.trimEnd()
    };
    this.emit('log', logEntry);
  }

  scheduleRestart(javaBin) {
    if (this.accountState && this.accountState.state === 'proxy_expired') {
      this.emitLog('error', `🛑 [${this.account.username}] Dừng tự động kết nối lại vì Proxy đã HẾT HẠN! Vui lòng đổi Proxy trong Quản Lý Proxy.`);
      return;
    }

    this.restartAttempts++;
    const delay = Math.min(10000 + (this.restartAttempts * 2000), 30000);
    this.emitLog('warn', `🔄 [${this.account.username}] Tự động khởi động lại sau ${delay / 1000}s (Lần ${this.restartAttempts})...`);

    this.restartTimer = setTimeout(() => {
      if (!this.isManualStop) {
        this.start(javaBin);
      }
    }, delay);
  }

  triggerProxyHealthCheck(reason = '') {
    if (this._isCheckingProxy || this.isManualStop) return;
    const proxy = this.proxy || (this.globalConfig.proxies || []).find(p => p.id === this.account.proxyId);
    if (!proxy) return;

    this._isCheckingProxy = true;
    ProxyChecker.testProxy(proxy, 3500).then(result => {
      this._isCheckingProxy = false;
      if (result.isExpired) {
        this.accountState = {
          state: 'proxy_expired',
          message: 'Proxy đã hết hạn hoặc mất kết nối!',
          isError: true,
          isMaintenance: false
        };
        this.emit('proxy-expired', {
          proxyId: this.account.proxyId,
          reason: result.message
        });
        this.emit('account-status', { accountId: this.account.id, state: this.accountState });
        this.emitLog('error', `🛑 [${this.account.username}] PHÁT HIỆN PROXY ĐÃ HẾT HẠN / MẤT KẾT NỐI (${result.message})! Đã đánh cờ hết hạn và dừng bot.`);
        this.stop();
      }
    }).catch(() => {
      this._isCheckingProxy = false;
    });
  }

  stop() {
    this.isManualStop = true;
    if (this.restartTimer) {
      clearTimeout(this.restartTimer);
      this.restartTimer = null;
    }
    if (this.loginWatchdogTimer) {
      clearTimeout(this.loginWatchdogTimer);
      this.loginWatchdogTimer = null;
    }

    if (!this.child) {
      return true;
    }

    const pid = this.child.pid;
    this.emitLog('system', `⏹️ [${this.account.username}] Đang dừng tiến trình bot (PID: ${pid})...`);

    try {
      if (process.platform === 'win32' && pid) {
        execSync(`taskkill /pid ${pid} /T /F`, { stdio: 'ignore' });
      } else if (pid) {
        process.kill(-pid, 'SIGKILL');
      }
    } catch (e) {
      try {
        this.child.kill('SIGKILL');
      } catch (err) { }
    }

    this.child = null;
    this.startTime = null;
    if (this.account) {
      this.account.lastAutoType = null;
    }
    this.autoState = { isRunning: false, autoType: null, subTask: null, status: 'stopped', message: '' };
    this.accountState = { state: 'idle', message: 'Đã dừng', isError: false, isMaintenance: false };
    return true;
  }

  getStatus() {
    const isRunning = Boolean(this.child && !this.child.killed && this.child.exitCode === null);
    let uptimeSeconds = 0;
    if (isRunning && this.startTime) {
      uptimeSeconds = Math.floor((Date.now() - this.startTime) / 1000);
    }

    return {
      accountId: this.account.id,
      username: this.account.username,
      serverId: this.account.serverId,
      serverName: this.account.serverName,
      fileId: this.account.fileId,
      running: isRunning,
      pid: this.child ? this.child.pid : null,
      startTime: this.startTime,
      uptimeSeconds,
      restartAttempts: this.restartAttempts,
      accountState: isRunning ? this.accountState : { state: 'offline', message: 'Đang tắt', isError: false, isMaintenance: false },
      autoState: isRunning ? this.autoState : { isRunning: false, autoType: null, status: 'idle', message: '' },
      stats: this.playerStats || {
        coins: 0,
        gold: 0,
        lockedGold: 0,
        targetCoins: 0,
        earnedCoins: 0,
        collectedHearts: 0,
        startedAt: '--',
        expiresAt: 'Vĩnh viễn'
      }
    };
  }

  getFriendlyName(type) {
    if (type === 'diamond' || type === 'kc') return 'Auto Kim Cương';
    if (type === 'fish' || type === 'cc') return 'Auto Câu Cá';
    if (type === 'farm') return 'Auto Farm';
    if (type === 'sell_ore' || type === 'banda' || type === 'stone' || type === 'bd') return 'Auto Bán Đá';
    if (type === 'tai_xiu') return 'Auto Tài Xỉu';
    if (type === 'baby') return 'Auto Chăm Em Bé';
    if (type === 'event' || type === 'sk') return 'Auto Sự Kiện';
    return 'Auto';
  }

  triggerAuto(autoType = 'farm', action = 'start') {
    if (this.child && this.child.stdin && !this.child.stdin.destroyed) {
      try {
        const validAutoTypes = ['farm', 'diamond', 'kc', 'fish', 'cau_ca', 'cc', 'sell_ore', 'banda', 'stone', 'bd', 'event', 'sk', 'all'];
        if (!validAutoTypes.includes(autoType) && validAutoTypes.includes(action)) {
          autoType = action;
          action = 'start';
        }

        if (action === 'start') {
          // Kiểm tra xem có phải bật Subtask (Farm / Bán Đá) khi Auto lớn (KC / Câu Cá) đang chạy không
          const isParentRunning = this.autoState && this.autoState.isRunning && (this.autoState.autoType === 'diamond' || this.autoState.autoType === 'kc' || this.autoState.autoType === 'fish');
          const isTargetSubTask = (autoType === 'farm' || autoType === 'sell_ore' || autoType === 'banda' || autoType === 'stone' || autoType === 'bd');

          if (autoType === 'farm' && this.account.farmSettings) {
            const jsonStr = JSON.stringify(this.account.farmSettings);
            this.child.stdin.write(`FARM_SETTINGS ${jsonStr}\n`);
          } else if (autoType === 'diamond' && this.account.diamondSettings) {
            const jsonStr = JSON.stringify(this.account.diamondSettings);
            this.child.stdin.write(`DIAMOND_SETTINGS ${jsonStr}\n`);
          } else if (autoType === 'fish' && this.account.fishSettings) {
            const jsonStr = JSON.stringify(this.account.fishSettings);
            this.child.stdin.write(`FISH_SETTINGS ${jsonStr}\n`);
          } else if ((autoType === 'sell_ore' || autoType === 'banda' || autoType === 'stone') && this.account.sellOreSettings) {
            const jsonStr = JSON.stringify(this.account.sellOreSettings);
            this.child.stdin.write(`SELL_ORE_SETTINGS ${jsonStr}\n`);
          }
          this.child.stdin.write(`START_AUTO ${autoType}\n`);

          const friendlyName = this.getFriendlyName(autoType);

          if (isParentRunning && isTargetSubTask) {
            this.autoState = {
              ...this.autoState,
              subTask: autoType,
              status: 'running',
              message: `Đang tạm chuyển sang ${friendlyName} (từ ${this.getFriendlyName(this.autoState.autoType)})...`
            };
          } else {
            this.account.lastAutoType = autoType;
            this.autoState = {
              isRunning: true,
              autoType,
              subTask: null,
              status: 'running',
              message: `Đang chạy ${friendlyName}...`
            };
          }
        } else if (action === 'stop') {
          this.child.stdin.write(`STOP_AUTO ${autoType}\n`);

          // Nếu chỉ dừng subtask khi auto lớn đang chạy -> quay lại auto lớn, không tắt tiến trình auto!
          if (this.autoState && this.autoState.isRunning && this.autoState.subTask &&
            (this.autoState.subTask === autoType || (autoType === 'farm' && this.autoState.subTask === 'farm') ||
              ((autoType === 'sell_ore' || autoType === 'banda' || autoType === 'stone' || autoType === 'bd') &&
                (this.autoState.subTask === 'sell_ore' || this.autoState.subTask === 'banda' || this.autoState.subTask === 'stone' || this.autoState.subTask === 'bd')))) {
            this.autoState.subTask = null;
            this.autoState.message = `Đang tiếp tục chạy ${this.getFriendlyName(this.autoState.autoType)}...`;
            this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });
            return true;
          }

          // Dừng toàn bộ
          this.account.lastAutoType = null;
          this.autoState = {
            isRunning: false,
            autoType: null,
            subTask: null,
            status: 'stopped',
            message: 'Đã dừng Auto'
          };
          if (this.autoResetTimer) clearTimeout(this.autoResetTimer);
          this.autoResetTimer = setTimeout(() => {
            this.autoState = {
              isRunning: false,
              autoType: null,
              subTask: null,
              status: 'idle',
              message: ''
            };
            this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });
          }, 4000);
        }
        this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });
        return true;
      } catch (e) {
        return false;
      }
    }
    return false;
  }

  applySetup(targetCoins, upDays) {
    this.account.targetCoins = targetCoins;
    this.account.upDays = upDays;
    if (this.child && this.child.stdin && !this.child.stdin.destroyed) {
      try {
        this.child.stdin.write(`SETUP ${targetCoins || 0} ${upDays || 0}\n`);
        return true;
      } catch (e) {
        return false;
      }
    }
    return false;
  }

  applyFarmSettings(farmSettings) {
    if (!farmSettings) return false;
    this.account.farmSettings = {
      ...(this.account.farmSettings || {}),
      ...farmSettings
    };
    if (this.child && this.child.stdin && !this.child.stdin.destroyed) {
      try {
        const jsonStr = JSON.stringify(this.account.farmSettings);
        this.child.stdin.write(`FARM_SETTINGS ${jsonStr}\n`);
        return true;
      } catch (e) {
        return false;
      }
    }
    return false;
  }

  applyDiamondSettings(diamondSettings) {
    if (!diamondSettings) return false;
    this.account.diamondSettings = {
      ...(this.account.diamondSettings || {}),
      ...diamondSettings
    };
    if (this.child && this.child.stdin && !this.child.stdin.destroyed) {
      try {
        const jsonStr = JSON.stringify(this.account.diamondSettings);
        this.child.stdin.write(`DIAMOND_SETTINGS ${jsonStr}\n`);
        return true;
      } catch (e) {
        return false;
      }
    }
    return false;
  }

  applyFishSettings(fishSettings) {
    if (!fishSettings) return false;
    this.account.fishSettings = {
      ...(this.account.fishSettings || {}),
      ...fishSettings
    };
    if (this.child && this.child.stdin && !this.child.stdin.destroyed) {
      try {
        const jsonStr = JSON.stringify(this.account.fishSettings);
        this.child.stdin.write(`FISH_SETTINGS ${jsonStr}\n`);
        return true;
      } catch (e) {
        return false;
      }
    }
    return false;
  }

  applySellOreSettings(sellOreSettings) {
    if (!sellOreSettings) return false;
    this.account.sellOreSettings = {
      ...(this.account.sellOreSettings || {}),
      ...sellOreSettings
    };
    if (this.child && this.child.stdin && !this.child.stdin.destroyed) {
      try {
        const jsonStr = JSON.stringify(this.account.sellOreSettings);
        this.child.stdin.write(`SELL_ORE_SETTINGS ${jsonStr}\n`);
        return true;
      } catch (e) {
        return false;
      }
    }
    return false;
  }

  resetData() {
    this.account.targetCoins = 0;
    this.account.upDays = 0;
    this.playerStats.targetCoins = 0;
    this.playerStats.earnedCoins = 0;
    this.playerStats.collectedHearts = 0;
    this.playerStats.expiresAt = 'Vĩnh viễn';

    if (this.child && this.child.stdin && !this.child.stdin.destroyed) {
      try {
        this.child.stdin.write('RESET_DATA\n');
      } catch (e) { }
    }
    this.emit('stats', { accountId: this.account.id, stats: this.playerStats });
    return true;
  }
}

module.exports = SingleBotProcess;
