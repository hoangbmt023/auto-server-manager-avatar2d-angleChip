const net = require('net');

/**
 * ProxyChecker (Infrastructure Layer)
 * Tests SOCKS5 and HTTP/HTTPS proxies using pure native Node.js net sockets.
 * Features 3-attempt resilient retry check to prevent false-positive errors on temporary network hiccups.
 * Accurately detects Authentication Failures (Expired proxy credentials), Closed Ports, and Timeouts.
 */
class ProxyChecker {
  /**
   * Resilient proxy check with multi-attempt retry (default: 3 attempts).
   * If any attempt succeeds, returns success immediately without unnecessary delays.
   * If an attempt fails due to temporary network glitch, waits briefly and retries.
   *
   * @param {Object} proxy - { host, port, type, username, password }
   * @param {number} timeoutMs - Timeout per attempt in milliseconds (default: 3500ms)
   * @param {number} maxRetries - Maximum number of check attempts (default: 3)
   * @param {number} retryDelayMs - Delay between failed retries in milliseconds (default: 500ms)
   * @returns {Promise<{ success: boolean, isExpired: boolean, latencyMs: number, message: string, attempts: number }>}
   */
  static async testProxy(proxy, timeoutMs = 2500, maxRetries = 1, retryDelayMs = 200) {
    if (!proxy) {
      return {
        success: false,
        isExpired: true,
        latencyMs: 0,
        message: 'Dữ liệu Proxy không tồn tại!',
        attempts: 1
      };
    }

    const host = (proxy.host || '').trim();
    const port = parseInt(proxy.port, 10);
    if (!host || !port || isNaN(port) || port < 1 || port > 65535) {
      return {
        success: false,
        isExpired: false,
        latencyMs: 0,
        message: 'Địa chỉ Host hoặc Cổng Port không hợp lệ (1 - 65535)!',
        attempts: 1
      };
    }

    let lastResult = null;

    for (let attempt = 1; attempt <= maxRetries; attempt++) {
      lastResult = await this.testSingleAttempt(proxy, timeoutMs);

      // Nếu thành công (Live / Hoạt động tốt) -> Trả về ngay lập tức
      if (lastResult.success && !lastResult.isExpired) {
        return {
          ...lastResult,
          attempts: attempt
        };
      }

      // Các lỗi dứt khoát (cổng đóng, sai host, sai pass, proxy từ chối) -> Trả về ngay, không retry lãng phí thời gian
      if (
        lastResult.isFatal ||
        (lastResult.message && (
          lastResult.message.includes('từ chối kết nối') ||
          lastResult.message.includes('không hợp lệ') ||
          lastResult.message.includes('sai Tài khoản') ||
          lastResult.message.includes('từ chối phương thức') ||
          lastResult.message.includes('Không thể kết nối đến máy chủ Proxy')
        ))
      ) {
        return {
          ...lastResult,
          attempts: attempt
        };
      }

      // Nếu còn lượt thử tiếp theo do timeout, nghỉ ngắn retryDelayMs rồi thử lại
      if (attempt < maxRetries) {
        await new Promise(resolve => setTimeout(resolve, retryDelayMs));
      }
    }

    return {
      ...lastResult,
      attempts: maxRetries,
      message: maxRetries > 1 ? `${lastResult.message || 'Lỗi kết nối proxy'} (Đã kiểm tra ${maxRetries} lần)` : (lastResult.message || 'Lỗi kết nối proxy')
    };
  }

  /**
   * Performs a single low-level socket handshake attempt to test SOCKS5 or HTTP proxy.
   * @param {Object} proxy - { host, port, type, username, password }
   * @param {number} timeoutMs - Timeout in milliseconds (default: 3500ms)
   * @returns {Promise<{ success: boolean, isExpired: boolean, latencyMs: number, message: string }>}
   */
  static testSingleAttempt(proxy, timeoutMs = 3500) {
    return new Promise((resolve) => {
      const startTime = Date.now();
      const type = (proxy.type || 'socks').toLowerCase();
      const host = (proxy.host || '').trim();
      const port = parseInt(proxy.port, 10);
      const username = (proxy.username || '').trim();
      const password = (proxy.password || '').trim();

      if (!host || !port || isNaN(port) || port < 1 || port > 65535) {
        return resolve({
          success: false,
          isExpired: false,
          latencyMs: 0,
          message: 'Địa chỉ Host hoặc Cổng Port không hợp lệ!'
        });
      }

      const socket = new net.Socket();
      let resolved = false;

      const finish = (result) => {
        if (resolved) return;
        resolved = true;
        try {
          socket.removeAllListeners();
          socket.destroy();
        } catch (e) {}
        resolve(result);
      };

      socket.setTimeout(timeoutMs);

      socket.on('timeout', () => {
        finish({
          success: false,
          isExpired: true,
          latencyMs: Date.now() - startTime,
          message: 'Timeout: Máy chủ Proxy không phản hồi (Đã đóng cổng / Chết / Hết hạn)'
        });
      });

      socket.on('error', (err) => {
        const msg = err.message || '';
        let isExpired = false;
        let isFatal = false;
        let userMsg = `Lỗi kết nối: ${msg}`;

        if (err.code === 'ECONNREFUSED') {
          isExpired = true;
          isFatal = true;
          userMsg = 'Máy chủ Proxy từ chối kết nối (Port đóng hoặc gói proxy đã hết hạn)';
        } else if (err.code === 'ETIMEDOUT' || err.code === 'EHOSTUNREACH' || err.code === 'ENOTFOUND') {
          isExpired = true;
          isFatal = true;
          userMsg = 'Không thể kết nối đến máy chủ Proxy (Host không phản hồi hoặc sai IP)';
        }

        finish({
          success: false,
          isExpired,
          isFatal,
          latencyMs: Date.now() - startTime,
          message: userMsg
        });
      });

      if (type.startsWith('sock')) {
        // SOCKS5 Handshake
        socket.connect(port, host, () => {
          // Client Greeting: Version 5, 2 Methods: 0x00 (No Auth), 0x02 (User/Pass Auth)
          socket.write(Buffer.from([0x05, 0x02, 0x00, 0x02]));
        });

        let stage = 'greeting';

        socket.on('data', (data) => {
          try {
            if (stage === 'greeting') {
              if (data.length < 2 || data[0] !== 0x05) {
                return finish({
                  success: false,
                  isExpired: false,
                  latencyMs: Date.now() - startTime,
                  message: 'Máy chủ phản hồi không đúng giao thức SOCKS5'
                });
              }

              const selectedMethod = data[1];

              // 0xFF means No Acceptable Methods -> Rejected
              if (selectedMethod === 0xFF) {
                return finish({
                  success: false,
                  isExpired: true,
                  latencyMs: Date.now() - startTime,
                  message: 'Proxy từ chối phương thức xác thực (Gói proxy hết hạn hoặc sai cấu hình)'
                });
              }

              // 0x02: Username/Password authentication requested
              if (selectedMethod === 0x02) {
                if (!username) {
                  return finish({
                    success: false,
                    isExpired: true,
                    latencyMs: Date.now() - startTime,
                    message: 'Proxy yêu cầu User/Password nhưng bạn chưa cấu hình'
                  });
                }
                stage = 'auth';
                const uBuf = Buffer.from(username, 'utf8');
                const pBuf = Buffer.from(password, 'utf8');
                // RFC 1929 Auth Request: [0x01, ulen, ...username, plen, ...password]
                const authReq = Buffer.concat([
                  Buffer.from([0x01, uBuf.length]),
                  uBuf,
                  Buffer.from([pBuf.length]),
                  pBuf
                ]);
                socket.write(authReq);
                return;
              }

              // 0x00: No authentication required
              if (selectedMethod === 0x00) {
                const latency = Date.now() - startTime;
                return finish({
                  success: true,
                  isExpired: false,
                  latencyMs: latency,
                  message: `SOCKS5 Hoạt động tốt (Live, Ping: ${latency}ms - Không mật khẩu)`
                });
              }
            } else if (stage === 'auth') {
              // RFC 1929 Auth Response: [0x01, status]
              // Status 0x00 = Success, anything else = Failure
              if (data.length >= 2 && data[1] === 0x00) {
                const latency = Date.now() - startTime;
                return finish({
                  success: true,
                  isExpired: false,
                  latencyMs: latency,
                  message: `SOCKS5 Xác thực thành công (Live, Ping: ${latency}ms)`
                });
              } else {
                return finish({
                  success: false,
                  isExpired: true,
                  latencyMs: Date.now() - startTime,
                  message: 'Proxy hết hạn hoặc sai Tài khoản / Mật khẩu (SOCKS5 Auth Failed)'
                });
              }
            }
          } catch (err) {
            finish({
              success: false,
              isExpired: false,
              latencyMs: Date.now() - startTime,
              message: 'Lỗi xử lý phản hồi SOCKS: ' + err.message
            });
          }
        });
      } else {
        // HTTP / HTTPS Proxy Handshake (CONNECT tunnel to neutral endpoint)
        socket.connect(port, host, () => {
          let req = `CONNECT 1.1.1.1:80 HTTP/1.1\r\nHost: 1.1.1.1:80\r\n`;
          if (username) {
            const auth = Buffer.from(`${username}:${password}`).toString('base64');
            req += `Proxy-Authorization: Basic ${auth}\r\n`;
          }
          req += `User-Agent: ProxyChecker/2.0\r\nConnection: close\r\n\r\n`;
          socket.write(req);
        });

        socket.on('data', (data) => {
          const resp = data.toString('utf8');
          const firstLine = resp.split('\r\n')[0] || '';
          const latency = Date.now() - startTime;

          if (resp.includes('200 Connection established') || resp.includes('200 OK')) {
            finish({
              success: true,
              isExpired: false,
              latencyMs: latency,
              message: `HTTP Proxy Hoạt động tốt (Live, Ping: ${latency}ms)`
            });
          } else if (resp.includes('407 Proxy Authentication Required') || resp.includes('407')) {
            finish({
              success: false,
              isExpired: true,
              latencyMs: latency,
              message: 'Proxy hết hạn hoặc sai Tài khoản / Mật khẩu (HTTP 407 Auth Required)'
            });
          } else if (resp.includes('502') || resp.includes('504') || resp.includes('503')) {
            finish({
              success: false,
              isExpired: true,
              latencyMs: latency,
              message: `Proxy lỗi Gateway (${firstLine})`
            });
          } else {
            finish({
              success: true,
              isExpired: false,
              latencyMs: latency,
              message: `HTTP Proxy phản hồi (${firstLine})`
            });
          }
        });
      }
    });
  }

  /**
   * Helper to format a proxy URL or display string safely.
   */
  static formatProxyDisplay(proxy) {
    if (!proxy) return '';
    const type = (proxy.type || 'socks5').toUpperCase();
    const auth = proxy.username ? `${proxy.username}:***@` : '';
    return `${type}://${auth}${proxy.host}:${proxy.port}`;
  }

  /**
   * Singleflight in-memory lock map for proxy rotation to prevent simultaneous rotation calls.
   */
  static _rotationLocks = new Map();

  /**
   * Safe rotation with 10-minute cooldown and Singleflight lock.
   * If rotated within cooldown, reloads existing proxy data instead of calling API.
   * @param {Object} options
   * @param {Proxy} options.proxy
   * @param {ProxyVnApiClient} options.proxyVnApiClient
   * @param {IProxyRepository} options.proxyRepo
   * @returns {Promise<{ rotated: boolean, proxy: Proxy, message: string }>}
   */
  static async rotateProxyWithCooldown({ proxy, proxyVnApiClient, proxyRepo, multiBotManager = null, accountRepo = null }) {
    if (!proxy || !proxy.id) {
      throw new Error('Dữ liệu proxy không hợp lệ để thực hiện đổi IP!');
    }
    if (!proxy.externalId) {
      return { rotated: false, proxy, message: 'Proxy không có externalId trên proxy.vn, không thể đổi tự động.' };
    }

    // Check Singleflight lock (đang có tiến trình khác gọi đổi IP cho con proxy này)
    if (this._rotationLocks.has(proxy.id)) {
      await this._rotationLocks.get(proxy.id);
      const reloaded = await proxyRepo.findById(proxy.id);
      return { rotated: true, proxy: reloaded, message: 'Đã đợi tiến trình đổi IP trước đó hoàn tất.' };
    }

    // Check Cooldown 10 phút
    if (proxy.isRotationCoolingDown && proxy.isRotationCoolingDown(10)) {
      return {
        rotated: false,
        proxy,
        message: 'Proxy vừa được đổi IP trong vòng 10 phút qua. Đang trong thời gian giãn cách (Cooldown)!'
      };
    }

    let releaseLock;
    const lockPromise = new Promise((resolve) => { releaseLock = resolve; });
    this._rotationLocks.set(proxy.id, lockPromise);

    try {
      const rotatedResult = await proxyVnApiClient.rotateProxyIp({
        externalId: proxy.externalId,
        category: proxy.proxyCategory || 'DatacenterA',
        type: proxy.type || 'SOCKS5'
      });

      proxy.host = rotatedResult.ip;
      proxy.port = rotatedResult.port;
      proxy.username = rotatedResult.username;
      proxy.password = rotatedResult.password;
      proxy.setRotated();
      proxy.markActive();

      await proxyRepo.save(proxy);

      // Auto-restart all running bots attached to this rotated proxy
      if (multiBotManager && accountRepo) {
        try {
          const accounts = await accountRepo.findAll();
          const affected = accounts.filter(a => a.proxyId === proxy.id);
          for (const acc of affected) {
            if (multiBotManager.isAccountRunning(acc.id)) {
              console.log(`🔄 [ProxyChecker] Khởi động lại bot [${acc.username}] với IP Proxy mới (${rotatedResult.ip}:${rotatedResult.port})...`);
              if (typeof multiBotManager.restartAccount === 'function') {
                await multiBotManager.restartAccount(acc.id);
              } else {
                await multiBotManager.stopAccount(acc.id);
                await multiBotManager.startAccount(acc.id);
              }
            }
          }
        } catch (e) {
          console.error(`[ProxyChecker] Lỗi restart bot sau khi đổi IP proxy [${proxy.id}]:`, e.message);
        }
      }

      return {
        rotated: true,
        proxy,
        message: `Đổi IP Proxy [${proxy.name}] thành công -> IP mới: ${rotatedResult.ip}:${rotatedResult.port}`
      };
    } finally {
      this._rotationLocks.delete(proxy.id);
      if (releaseLock) releaseLock();
    }
  }
}

module.exports = ProxyChecker;
