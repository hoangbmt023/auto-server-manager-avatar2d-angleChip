const { spawn, execSync } = require('child_process');
const path = require('path');
const fs = require('fs');
const EventEmitter = require('events');

/**
 * SingleBotProcess (Infrastructure Layer)
 * Manages an individual Java process execution for a single Avatar account.
 */
class SingleBotProcess extends EventEmitter {
  constructor(account, fileProfile, globalConfig) {
    super();
    this.account = account;
    this.fileProfile = fileProfile;
    this.globalConfig = globalConfig;
    this.child = null;
    this.startTime = null;
    this.restartAttempts = 0;
    this.isManualStop = false;
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

    // Proxy configuration (Account-specific Proxy from Proxy Pool, File Profile Proxy, or Global Proxy)
    let proxy = null;
    if (this.account.proxyId && Array.isArray(this.globalConfig.proxies)) {
      proxy = this.globalConfig.proxies.find(p => p.id === this.account.proxyId) || null;
    } else if (this.fileProfile && this.fileProfile.proxy && this.fileProfile.proxy.enabled && this.fileProfile.proxy.host) {
      proxy = this.fileProfile.proxy;
    } else if (this.globalConfig.proxy && this.globalConfig.proxy.enabled && this.globalConfig.proxy.host) {
      proxy = this.globalConfig.proxy;
    }

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
    }

    // Emulator JAR & Classpath
    const emulatorName = this.globalConfig.emulatorJar || 'AngelChipEmulator_V2Proxy.jar';
    const emulatorJar = this.resolveJar(emulatorName);
    const cpSeparator = process.platform === 'win32' ? ';' : ':';
    args.push('-cp', `${emulatorJar}${cpSeparator}${this.workspaceRoot}`);
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

      // Handle STDOUT
      this.child.stdout.on('data', (chunk) => {
        const text = chunk.toString('utf8');
        this.processLogOutput(text, 'stdout');
      });

      // Handle STDERR
      this.child.stderr.on('data', (chunk) => {
        const text = chunk.toString('utf8');
        this.processLogOutput(text, 'stderr');
      });

      // Handle Exit
      this.child.on('close', (code, signal) => {
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
    for (let line of lines) {
      line = line.trimEnd();
      if (!line) continue;

      if (line.includes('[ACCOUNT_STATUS]:')) {
        try {
          const jsonPart = line.substring(line.indexOf('[ACCOUNT_STATUS]:') + 17).trim();
          const parsed = JSON.parse(jsonPart);
          this.accountState = {
            ...this.accountState,
            ...parsed
          };
          this.emit('account-status', { accountId: this.account.id, state: this.accountState });

          // If target is reached / completed, mark as manual stop to prevent reconnect and stop gracefully
          if (parsed.isTargetReached || parsed.isCompleted || parsed.state === 'target_reached') {
            this.isManualStop = true;
            this.accountState = {
              state: 'target_reached',
              message: parsed.message || 'Đã đạt yêu cầu up xu theo cài đặt!',
              isCompleted: true,
              isError: false,
              isMaintenance: false
            };
            this.emit('account-status', { accountId: this.account.id, state: this.accountState });
            this.emitLog('success', `🏆 [${this.account.username}] 🎉 HOÀN THÀNH MỤC TIÊU: ${parsed.message || 'Đã đạt yêu cầu up xu theo cài đặt!'}`);
            setTimeout(() => {
              this.stop();
            }, 1000);
          }
          continue;
        } catch (e) {}
      }

      if (line.includes('[AUTO_STATUS]:')) {
        try {
          const jsonPart = line.substring(line.indexOf('[AUTO_STATUS]:') + 14).trim();
          const parsed = JSON.parse(jsonPart);
          this.autoState = {
            ...this.autoState,
            ...parsed
          };
          this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });

          if (!this.autoState.isRunning && (this.autoState.status === 'finished' || this.autoState.finished)) {
            if (this.autoResetTimer) clearTimeout(this.autoResetTimer);
            this.autoResetTimer = setTimeout(() => {
              this.autoState = {
                isRunning: false,
                autoType: null,
                status: 'idle',
                message: ''
              };
              this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });
            }, 5000);
          }
          continue;
        } catch (e) {}
      }

      if (line.includes('Đã chăm sóc xong') || line.includes('Đã xong việc') || line.includes('chăm sóc xong') || line.includes('Nông trại bạn đã được chăm sóc') || line.includes('AUTO HOÀN THÀNH')) {
        this.autoState = {
          isRunning: false,
          autoType: 'farm',
          status: 'finished',
          finished: true,
          message: 'Đã farm xong!'
        };
        this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });

        if (this.autoResetTimer) clearTimeout(this.autoResetTimer);
        this.autoResetTimer = setTimeout(() => {
          this.autoState = {
            isRunning: false,
            autoType: null,
            status: 'idle',
            message: ''
          };
          this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });
        }, 5000);
      }

      if (line.includes('[PLAYER_STATS]:')) {
        try {
          const jsonPart = line.substring(line.indexOf('[PLAYER_STATS]:') + 15).trim();
          const parsed = JSON.parse(jsonPart);
          if (parsed.farmingTime !== undefined && parsed.farmingCountdown === undefined) {
            parsed.farmingCountdown = parsed.farmingTime;
          } else if (parsed.farmingCountdown !== undefined && parsed.farmingTime === undefined) {
            parsed.farmingTime = parsed.farmingCountdown;
          }
          this.playerStats = {
            ...this.playerStats,
            ...parsed
          };

          // Synchronize autoState directly from live in-game active auto task
          if (parsed.isAutoRunning !== undefined) {
            if (parsed.isAutoRunning && parsed.autoType) {
              let friendly = 'Auto';
              if (parsed.autoType === 'fish') friendly = 'Auto Câu Cá';
              else if (parsed.autoType === 'diamond' || parsed.autoType === 'kc') friendly = 'Auto Kim Cương';
              else if (parsed.autoType === 'farm') friendly = 'Auto Farm';
              else if (parsed.autoType === 'sell_ore' || parsed.autoType === 'banda') friendly = 'Auto Bán Đá';

              this.autoState = {
                isRunning: true,
                autoType: parsed.autoType,
                status: 'running',
                message: `Đang chạy ${friendly}...`
              };
              this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });
            } else if (!parsed.isAutoRunning && this.autoState && this.autoState.isRunning) {
              this.autoState = {
                isRunning: false,
                autoType: null,
                status: 'idle',
                message: ''
              };
              this.emit('auto-status', { accountId: this.account.id, autoState: this.autoState });
            }
          }

          // If coins detected, confirm online state if not in permanent error
          if (this.playerStats.coins > 0 && !this.accountState.isError && this.accountState.state !== 'online') {
            this.accountState = {
              state: 'online',
              message: 'Đang Treo Online',
              isError: false,
              isMaintenance: false
            };
            this.emit('account-status', { accountId: this.account.id, state: this.accountState });
          }
          this.emit('stats', { accountId: this.account.id, stats: this.playerStats });
        } catch (e) {}
        continue; // Always skip raw PLAYER_STATS from terminal logs
      }

      let type = streamType === 'stderr' ? 'error' : 'stdout';
      if (line.includes('✅') || line.includes('THÀNH CÔNG')) type = 'success';
      else if (line.includes('❌') || line.includes('LỖI')) {
        type = 'error';
        if (line.includes('LỖI XÁC THỰC') || line.includes('MẬT KHẨU')) {
          this.accountState = {
            state: 'auth_error',
            message: 'Sai tài khoản hoặc mật khẩu!',
            isError: true,
            isMaintenance: false
          };
        }
      }
      else if (line.includes('⚠️') || line.includes('CẢNH BÁO') || line.includes('MẤT KẾT NỐI')) type = 'warn';
      else if (line.includes('🛠️') || line.includes('BẢO TRÌ')) {
        type = 'warn';
        this.accountState = {
          state: 'maintenance',
          message: 'Server đang bảo trì',
          isError: false,
          isMaintenance: true
        };
      }
      else if (line.includes('🚀') || line.includes('QUY TRÌNH') || line.includes('Đang kết nối')) type = 'info';

      // Prepend username tag if not present
      const formatted = line.includes(`[${this.account.username}]`) ? line : `[${this.account.username}] ${line}`;
      this.emitLog(type, formatted);
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
    this.restartAttempts++;
    const delay = Math.min(10000 + (this.restartAttempts * 2000), 30000);
    this.emitLog('warn', `🔄 [${this.account.username}] Tự động khởi động lại sau ${delay / 1000}s (Lần ${this.restartAttempts})...`);

    this.restartTimer = setTimeout(() => {
      if (!this.isManualStop) {
        this.start(javaBin);
      }
    }, delay);
  }

  stop() {
    this.isManualStop = true;
    if (this.restartTimer) {
      clearTimeout(this.restartTimer);
      this.restartTimer = null;
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
      } catch (err) {}
    }

    this.child = null;
    this.startTime = null;
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

  triggerAuto(autoType = 'farm', action = 'start') {
    if (this.child && this.child.stdin && !this.child.stdin.destroyed) {
      try {
        if (action === 'start') {
          // Nếu đang có tiến trình auto khác chạy, gửi lệnh dừng trước để chuyển đổi tuần tự
          if (this.autoState && this.autoState.isRunning) {
            this.child.stdin.write('STOP_AUTO\n');
          }

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
          
          let friendlyName = 'Auto Farm';
          if (autoType === 'diamond' || autoType === 'kc') friendlyName = 'Auto Kim Cương';
          else if (autoType === 'fish') friendlyName = 'Auto Câu Cá';
          else if (autoType === 'sell_ore' || autoType === 'banda' || autoType === 'stone') friendlyName = 'Auto Bán Đá';

          this.autoState = {
            isRunning: true,
            autoType,
            status: 'running',
            message: `Đang chạy ${friendlyName}...`
          };
        } else {
          this.child.stdin.write('STOP_AUTO\n');
          this.autoState = {
            isRunning: false,
            autoType: null,
            status: 'stopped',
            message: 'Đã dừng Auto'
          };
          if (this.autoResetTimer) clearTimeout(this.autoResetTimer);
          this.autoResetTimer = setTimeout(() => {
            this.autoState = {
              isRunning: false,
              autoType: null,
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
      } catch (e) {}
    }
    this.emit('stats', { accountId: this.account.id, stats: this.playerStats });
    return true;
  }
}

module.exports = SingleBotProcess;
