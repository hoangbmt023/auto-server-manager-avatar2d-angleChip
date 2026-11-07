/**
 * BotIpcProtocol (Infrastructure Layer - Process IPC)
 * Encapsulates serialization and deserialization of commands, status packets,
 * and stdout/stderr stream messages communicated between Node.js and the headless Java process.
 */
class BotIpcProtocol {
  /**
   * Get user-friendly display name for an auto activity.
   */
  static getFriendlyName(type) {
    if (!type) return 'Auto';
    const t = String(type).toLowerCase();
    if (t === 'diamond' || t === 'kc') return 'Auto Kim Cương';
    if (t === 'fish' || t === 'cc') return 'Auto Câu Cá';
    if (t === 'farm') return 'Auto Farm';
    if (t === 'sell_ore' || t === 'banda' || t === 'stone' || t === 'bd') return 'Auto Bán Đá';
    if (t === 'tai_xiu') return 'Auto Tài Xỉu';
    if (t === 'baby') return 'Auto Chăm Em Bé';
    if (t === 'event' || t === 'sk') return 'Auto Sự Kiện';
    return `Auto (${type})`;
  }

  /**
   * Serialize commands to send to Java process stdin.
   */
  static serializeCommand(commandType, payload = null) {
    switch (commandType) {
      case 'START_AUTO':
        return `START_AUTO ${payload}\n`;
      case 'STOP_AUTO':
        return payload ? `STOP_AUTO ${payload}\n` : 'STOP_AUTO\n';
      case 'SETUP':
        return `SETUP ${payload.targetCoins || 0} ${payload.upDays || 0}\n`;
      case 'FARM_SETTINGS':
        return `FARM_SETTINGS ${JSON.stringify(payload)}\n`;
      case 'DIAMOND_SETTINGS':
        return `DIAMOND_SETTINGS ${JSON.stringify(payload)}\n`;
      case 'FISH_SETTINGS':
        return `FISH_SETTINGS ${JSON.stringify(payload)}\n`;
      case 'SELL_ORE_SETTINGS':
        return `SELL_ORE_SETTINGS ${JSON.stringify(payload)}\n`;
      case 'RESET_DATA':
        return 'RESET_DATA\n';
      default:
        return `${commandType} ${payload ? JSON.stringify(payload) : ''}\n`;
    }
  }

  /**
   * Parse a single line of log/output from the child process.
   * Returns a structured inspection result.
   */
  static parseLine(rawLine, streamType, context = {}) {
    const line = rawLine.trimEnd();
    const result = {
      handledSpecialPacket: false,
      accountStatusUpdate: null,
      autoStatusUpdate: null,
      statsUpdate: null,
      proxyExpiredReason: null,
      shouldCheckProxyHealth: false,
      loginWatchdogAction: null, // 'reset', 'clear', or null
      isTargetReached: false,
      logType: streamType === 'stderr' ? 'error' : 'stdout',
      formattedText: ''
    };

    if (!line) return result;

    const username = context.username || '';
    const currentAccountState = context.accountState || {};
    const currentAutoState = context.autoState || {};
    const currentStats = context.playerStats || {};
    const hasProxy = Boolean(context.proxyId);
    // 0. Filter out internal proxy setup, sensitive connection logs, settings loading, and emulator bootstrap
    if (
      line.includes('[PROXY SETUP]') ||
      line.includes('[GIẢ LẬP ANGELCHIP]') ||
      line.includes('PROXY    (NET):') ||
      line.includes('PROXY (NET):') ||
      line.includes('TÀI KHOẢN (WEB):') ||
      line.includes('MẬT KHẨU (WEB):') ||
      line.includes('SERVER   (WEB):') ||
      line.includes('SERVER (WEB):') ||
      line.includes('[CÀI ĐẶT AUTO') ||
      line.includes('[KIỂM TRA FILE JAR]') ||
      line.includes('AVATAR HEADLESS AUTO-LOGIN') ||
      line.includes('Picked up JAVA_TOOL_OPTIONS') ||
      line.includes('headless arguments') ||
      line.includes('openJar') ||
      line.includes('loadJar') ||
      /^[=\-─_]{8,}/.test(line)
    ) {
      result.handledSpecialPacket = true;
      return result;
    }

    // 1. Account Status Packet
    if (line.includes('[ACCOUNT_STATUS]:')) {
      result.handledSpecialPacket = true;
      try {
        const jsonPart = line.substring(line.indexOf('[ACCOUNT_STATUS]:') + 17).trim();
        const parsed = JSON.parse(jsonPart);
        result.accountStatusUpdate = parsed;

        if (parsed.isTargetReached || parsed.isCompleted || parsed.state === 'target_reached') {
          result.isTargetReached = true;
        }
      } catch (e) {}
      return result;
    }

    // 2. Auto Status Packet
    if (line.includes('[AUTO_STATUS]:')) {
      result.handledSpecialPacket = true;
      try {
        const jsonPart = line.substring(line.indexOf('[AUTO_STATUS]:') + 14).trim();
        const parsed = JSON.parse(jsonPart);

        let primaryType = parsed.autoType;
        let subTask = parsed.subTask ? parsed.autoType : null;
        if (parsed.parentAutoType) {
          primaryType = parsed.parentAutoType;
          subTask = parsed.autoType;
        }

        result.autoStatusUpdate = {
          ...parsed,
          autoType: primaryType,
          subTask: subTask
        };
      } catch (e) {}
      return result;
    }

    // 3. Farm Finished Text Line
    if ((line.includes('Đã chăm sóc xong') || line.includes('Đã xong việc') || line.includes('Nông trại bạn đã được chăm sóc')) &&
        (!currentAutoState || currentAutoState.autoType === 'farm')) {
      result.autoStatusUpdate = {
        isRunning: false,
        autoType: 'farm',
        subTask: null,
        status: 'finished',
        finished: true,
        message: 'Đã farm xong!'
      };
    }

    // 4. Player Stats Packet
    if (line.includes('[PLAYER_STATS]:')) {
      result.handledSpecialPacket = true;
      try {
        const jsonPart = line.substring(line.indexOf('[PLAYER_STATS]:') + 15).trim();
        const parsed = JSON.parse(jsonPart);

        if (parsed.farmingTime !== undefined && parsed.farmingCountdown === undefined) {
          parsed.farmingCountdown = parsed.farmingTime;
        } else if (parsed.farmingCountdown !== undefined && parsed.farmingTime === undefined) {
          parsed.farmingTime = parsed.farmingCountdown;
        }
        if (parsed.coins === 0 && currentStats.coins > 0) {
          delete parsed.coins;
          delete parsed.gold;
          delete parsed.lockedGold;
        }
        if ((!parsed.farmingCountdown || parsed.farmingCountdown === '--:--') &&
            (currentStats.farmingCountdown && currentStats.farmingCountdown !== '--:--') &&
            currentAutoState && currentAutoState.isRunning &&
            (currentAutoState.autoType === 'diamond' || currentAutoState.autoType === 'kc' || currentAutoState.autoType === 'fish')) {
          delete parsed.farmingCountdown;
          delete parsed.farmingTime;
        }

        result.statsUpdate = parsed;

        // Auto State Synchronization from Live Game
        if (parsed.isAutoRunning !== undefined) {
          if (parsed.isAutoRunning && parsed.autoType) {
            let primaryType = parsed.autoType;
            let subTask = null;

            if ((parsed.autoType === 'farm' || parsed.autoType === 'sell_ore' || parsed.autoType === 'banda' || parsed.autoType === 'stone' || parsed.autoType === 'baby') &&
                currentAutoState && (currentAutoState.autoType === 'diamond' || currentAutoState.autoType === 'fish' || currentAutoState.autoType === 'kc')) {
              primaryType = currentAutoState.autoType;
              subTask = parsed.autoType;
            }

            const friendly = BotIpcProtocol.getFriendlyName(primaryType);
            let statusMsg = `Đang chạy ${friendly}...`;
            if (subTask === 'farm') {
              statusMsg = `Đang về chăm farm (từ ${friendly})...`;
            } else if (subTask === 'sell_ore' || subTask === 'banda' || subTask === 'stone') {
              statusMsg = `Đang bán đá (từ ${friendly})...`;
            } else if (subTask === 'baby') {
              statusMsg = `Đang chăm em bé (từ ${friendly})...`;
            }

            result.autoStatusUpdate = {
              isRunning: true,
              autoType: primaryType,
              subTask: subTask,
              status: 'running',
              message: statusMsg
            };
          } else if (!parsed.isAutoRunning && currentAutoState && currentAutoState.isRunning) {
            result.autoStatusUpdate = {
              isRunning: false,
              autoType: null,
              subTask: null,
              status: 'idle',
              message: ''
            };
          }
        }

        // Coins detected -> verify online
        if ((parsed.coins > 0 || currentStats.coins > 0) && !currentAccountState.isError && currentAccountState.state !== 'online') {
          result.accountStatusUpdate = {
            state: 'online',
            message: 'Đang Treo Online',
            isError: false,
            isMaintenance: false
          };
        }
      } catch (e) {}
      return result;
    }

    // 5. Standard Log Classification & Error Detection
    let type = streamType === 'stderr' ? 'error' : 'stdout';
    if (line.includes('✅') || line.includes('THÀNH CÔNG')) {
      type = 'success';
    } else if (line.includes('❌') || line.includes('LỖI')) {
      type = 'error';
      if (line.includes('LỖI XÁC THỰC') || line.includes('MẬT KHẨU')) {
        result.accountStatusUpdate = {
          state: 'auth_error',
          message: 'Sai tài khoản hoặc mật khẩu!',
          isError: true,
          isMaintenance: false
        };
      }
    }

    // 6. Proxy Failure Checks
    if (hasProxy) {
      const lower = line.toLowerCase();
      if (
        lower.includes('socks: authentication failed') ||
        lower.includes('407 proxy authentication') ||
        lower.includes('proxy authentication required') ||
        lower.includes('[proxy auth err]') ||
        lower.includes('malformed reply from socks') ||
        lower.includes('lỗi xác thực proxy')
      ) {
        type = 'error';
        result.proxyExpiredReason = 'Proxy từ chối xác thực (Hết hạn hoặc sai User/Pass)';
        result.accountStatusUpdate = {
          state: 'proxy_expired',
          message: 'Proxy đã hết hạn hoặc sai xác thực!',
          isError: true,
          isMaintenance: false
        };
      } else if (line.includes('MẤT KẾT NỐI') || line.includes('[LOGIN ERR]') || line.includes('ConnectException') || line.includes('SocketTimeoutException')) {
        result.shouldCheckProxyHealth = true;
      } else if (line.includes('2. Bắt đầu kết nối & đăng nhập') || line.includes('Đang kết nối tới Server')) {
        result.loginWatchdogAction = 'reset';
      }
    }

    // Watchdog clearance on success
    if (currentStats.coins > 0 || line.includes('Đang Treo Online') || line.includes('BẮT ĐẦU CHẠY')) {
      result.loginWatchdogAction = 'clear';
    } else if (line.includes('⚠️') || line.includes('CẢNH BÁO') || line.includes('MẤT KẾT NỐI')) {
      type = 'warn';
    } else if (line.includes('🛠️') || line.includes('BẢO TRÌ')) {
      type = 'warn';
      result.accountStatusUpdate = {
        state: 'maintenance',
        message: 'Server đang bảo trì',
        isError: false,
        isMaintenance: true
      };
    } else if (line.includes('🚀') || line.includes('QUY TRÌNH') || line.includes('Đang kết nối')) {
      type = 'info';
    }

    result.logType = type;
    result.formattedText = username ? (line.includes(`[${username}]`) ? line : `[${username}] ${line}`) : line;
    return result;
  }
}

module.exports = BotIpcProtocol;
