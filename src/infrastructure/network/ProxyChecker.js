const net = require('net');

/**
 * ProxyChecker (Infrastructure Layer)
 * Tests SOCKS5 and HTTP/HTTPS proxies using pure native Node.js net sockets.
 * Accurately detects Authentication Failures (Expired proxy credentials), Closed Ports, and Timeouts.
 */
class ProxyChecker {
  /**
   * Test a proxy connection and authentication.
   * @param {Object} proxy - { host, port, type, username, password }
   * @param {number} timeoutMs - Timeout in milliseconds (default: 6000ms)
   * @returns {Promise<{ success: boolean, isExpired: boolean, latencyMs: number, message: string }>}
   */
  static testProxy(proxy, timeoutMs = 6000) {
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
        let userMsg = `Lỗi kết nối: ${msg}`;

        if (err.code === 'ECONNREFUSED') {
          isExpired = true;
          userMsg = 'Máy chủ Proxy từ chối kết nối (Port đóng hoặc gói proxy đã hết hạn)';
        } else if (err.code === 'ETIMEDOUT' || err.code === 'EHOSTUNREACH') {
          isExpired = true;
          userMsg = 'Không thể kết nối đến máy chủ Proxy (Host không phản hồi)';
        }

        finish({
          success: false,
          isExpired,
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
        // HTTP / HTTPS Proxy Handshake (CONNECT tunnel)
        socket.connect(port, host, () => {
          let req = `CONNECT avatar-hm.teamobi.com:19128 HTTP/1.1\r\nHost: avatar-hm.teamobi.com:19128\r\n`;
          if (username) {
            const auth = Buffer.from(`${username}:${password}`).toString('base64');
            req += `Proxy-Authorization: Basic ${auth}\r\n`;
          }
          req += `User-Agent: AvatarFishBot/1.0\r\nConnection: close\r\n\r\n`;
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
}

module.exports = ProxyChecker;
