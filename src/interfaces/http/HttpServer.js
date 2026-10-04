const http = require('http');
const url = require('url');
const path = require('path');
const fs = require('fs');

const ConfigRepository = require('../../infrastructure/persistence/ConfigRepository');
const SseEventBus = require('../../infrastructure/logging/SseEventBus');
const MultiBotManager = require('../../application/services/MultiBotManager');
const AccountService = require('../../application/services/AccountService');
const FileProfileService = require('../../application/services/FileProfileService');
const ProxyService = require('../../application/services/ProxyService');

const AccountController = require('./controllers/AccountController');
const BotController = require('./controllers/BotController');
const FileController = require('./controllers/FileController');
const ProxyController = require('./controllers/ProxyController');
const SystemController = require('./controllers/SystemController');

const MIME_TYPES = {
  '.html': 'text/html; charset=utf-8',
  '.css': 'text/css; charset=utf-8',
  '.js': 'application/javascript; charset=utf-8',
  '.jsx': 'text/babel; charset=utf-8',
  '.mjs': 'application/javascript; charset=utf-8',
  '.json': 'application/json; charset=utf-8',
  '.png': 'image/png',
  '.jpg': 'image/jpeg',
  '.gif': 'image/gif',
  '.svg': 'image/svg+xml',
  '.ico': 'image/x-icon',
  '.jar': 'application/java-archive'
};

class HttpServer {
  constructor() {
    this.configRepo = new ConfigRepository();
    this.sseEventBus = new SseEventBus();
    this.multiBotManager = new MultiBotManager(this.configRepo, this.sseEventBus);
    this.accountService = new AccountService(this.configRepo, this.multiBotManager);
    this.fileProfileService = new FileProfileService(this.configRepo, this.multiBotManager);
    this.proxyService = new ProxyService(this.configRepo, this.multiBotManager, this.sseEventBus);

    this.accountController = new AccountController(this.accountService, this.configRepo, this.sseEventBus);
    this.botController = new BotController(this.multiBotManager, this.configRepo, this.sseEventBus);
    this.fileController = new FileController(this.fileProfileService, this.configRepo, this.sseEventBus);
    this.proxyController = new ProxyController(this.proxyService, this.sseEventBus);
    this.systemController = new SystemController(this.configRepo, this.sseEventBus);

    this.publicDir = path.resolve(__dirname, '../../../public');
    this.server = null;
  }

  sendJson(res, statusCode, data) {
    res.writeHead(statusCode, {
      'Content-Type': 'application/json; charset=utf-8',
      'Cache-Control': 'no-store, no-cache, must-revalidate, proxy-revalidate, max-age=0',
      'Pragma': 'no-cache',
      'Expires': '0',
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Headers': 'Content-Type, Authorization, X-Dashboard-Auth, x-filename',
      'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE, OPTIONS'
    });
    res.end(JSON.stringify(data));
  }

  parseJsonBody(req) {
    return new Promise((resolve, reject) => {
      let body = '';
      req.on('data', chunk => {
        body += chunk.toString('utf8');
        if (body.length > 2 * 1024 * 1024) { // 2MB limit
          reject(new Error('Payload too large'));
        }
      });
      req.on('end', () => {
        if (!body.trim()) return resolve({});
        try {
          resolve(JSON.parse(body));
        } catch (e) {
          reject(new Error('JSON không hợp lệ: ' + e.message));
        }
      });
      req.on('error', reject);
    });
  }

  checkAuth(req, res) {
    const config = this.configRepo.get();
    if (!config.password) return true;

    const authHeader = req.headers['authorization'] || req.headers['x-dashboard-auth'];
    if (authHeader) {
      if (authHeader.startsWith('Bearer ')) {
        const token = authHeader.slice(7).trim();
        if (token === config.password) return true;
      } else if (authHeader === config.password) {
        return true;
      }
    }

    this.sendJson(res, 401, {
      success: false,
      requireAuth: true,
      message: 'Vui lòng nhập mật khẩu để truy cập!'
    });
    return false;
  }

  initServer() {
    this.server = http.createServer(async (req, res) => {
      const parsedUrl = url.parse(req.url, true);
      const pathname = parsedUrl.pathname;

      // Handle CORS Preflight
      if (req.method === 'OPTIONS') {
        res.writeHead(204, {
          'Access-Control-Allow-Origin': '*',
          'Access-Control-Allow-Headers': 'Content-Type, Authorization, X-Dashboard-Auth, x-filename',
          'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE, OPTIONS'
        });
        return res.end();
      }

      // SSE Endpoint
      if (pathname === '/api/events') {
        return this.sseEventBus.addClient(res);
      }

      // Public API check auth endpoint
      if (pathname === '/api/auth/verify' && req.method === 'POST') {
        const config = this.configRepo.get();
        try {
          const body = await this.parseJsonBody(req);
          if (!config.password || body.password === config.password) {
            return this.sendJson(res, 200, { success: true, message: 'Xác thực thành công!' });
          }
          return this.sendJson(res, 401, { success: false, message: 'Sai mật khẩu truy cập!' });
        } catch (e) {
          return this.sendJson(res, 400, { success: false, message: e.message });
        }
      }

      // API Endpoints Routing
      if (pathname.startsWith('/api/')) {
        if (!this.checkAuth(req, res)) return;

        // Bot Management APIs
        if (pathname === '/api/status' && req.method === 'GET') {
          return this.botController.getStatus(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/start' && req.method === 'POST') {
          return this.botController.startAll(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/stop' && req.method === 'POST') {
          return this.botController.stopAll(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/restart' && req.method === 'POST') {
          return this.botController.restartAll(req, res, this.sendJson.bind(this));
        }
        if ((pathname === '/api/bot/start-account' || pathname === '/api/accounts/switch') && req.method === 'POST') {
          return this.botController.startAccount(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/bot/stop-account' && req.method === 'POST') {
          return this.botController.stopAccount(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/bot/auto' && req.method === 'POST') {
          return this.botController.triggerAuto(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/logs' && req.method === 'GET') {
          return this.botController.getLogs(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/clear-logs' && req.method === 'POST') {
          return this.botController.clearLogs(req, res, this.sendJson.bind(this));
        }

        // Accounts APIs
        if (pathname === '/api/accounts' && req.method === 'GET') {
          return this.accountController.getAccounts(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/accounts' && req.method === 'POST') {
          return this.accountController.saveAccount(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname.startsWith('/api/accounts/delete') && req.method === 'POST') {
          return this.accountController.deleteAccount(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/accounts/switch-server' && req.method === 'POST') {
          return this.accountController.switchServer(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/accounts/setup' && req.method === 'POST') {
          return this.accountController.updateSetup(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/accounts/reset-data' && req.method === 'POST') {
          return this.accountController.resetData(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }

        // Files & JAR Profiles APIs
        if (pathname === '/api/files' && req.method === 'GET') {
          return this.fileController.getFiles(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/files' && req.method === 'POST') {
          return this.fileController.saveFile(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/files/delete' && req.method === 'POST') {
          return this.fileController.deleteFile(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/files/switch' && req.method === 'POST') {
          return this.fileController.switchFile(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/available-jars' && req.method === 'GET') {
          return this.fileController.getAvailableJars(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/upload-jar' && req.method === 'POST') {
          return this.fileController.uploadJar(req, res, this.sendJson.bind(this));
        }

        // Proxies Management APIs
        if (pathname === '/api/proxies' && req.method === 'GET') {
          return this.proxyController.getProxies(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/proxies' && req.method === 'POST') {
          return this.proxyController.saveProxy(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/proxies/delete' && req.method === 'POST') {
          return this.proxyController.deleteProxy(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/proxies/test' && req.method === 'POST') {
          return this.proxyController.testProxy(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/proxies/test-all' && req.method === 'POST') {
          return this.proxyController.testAllProxies(req, res, this.sendJson.bind(this));
        }

        // System & JRE APIs
        if (pathname === '/api/config' && req.method === 'GET') {
          return this.systemController.getConfig(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/config' && req.method === 'POST') {
          return this.systemController.saveConfig(req, res, this.sendJson.bind(this), this.parseJsonBody.bind(this));
        }
        if (pathname === '/api/jre/install' && req.method === 'POST') {
          return this.systemController.installJre(req, res, this.sendJson.bind(this));
        }
        if (pathname === '/api/jre/progress' && req.method === 'GET') {
          return this.systemController.getJreProgress(req, res, this.sendJson.bind(this));
        }

        return this.sendJson(res, 404, { success: false, message: 'API endpoint not found' });
      }

      // Static Files Serving
      let relativePath = pathname === '/' ? 'index.html' : pathname.replace(/^\//, '');
      const filePath = path.join(this.publicDir, relativePath);

      if (!filePath.startsWith(this.publicDir)) {
        res.writeHead(403);
        return res.end('Forbidden');
      }

      fs.stat(filePath, (err, stats) => {
        if (err || !stats.isFile()) {
          const indexPath = path.join(this.publicDir, 'index.html');
          fs.readFile(indexPath, (err2, content) => {
            if (err2) {
              res.writeHead(404);
              return res.end('Not Found');
            }
            res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
            res.end(content);
          });
          return;
        }

        const ext = path.extname(filePath).toLowerCase();
        const contentType = MIME_TYPES[ext] || 'application/octet-stream';
        fs.readFile(filePath, (err3, content) => {
          if (err3) {
            res.writeHead(500);
            return res.end('Internal Server Error');
          }
          res.writeHead(200, { 'Content-Type': contentType });
          res.end(content);
        });
      });
    });
  }

  start(port = null) {
    this.initServer();
    const config = this.configRepo.get();
    const targetPort = port || process.env.PORT || config.port || 3001;

    this.server.listen(targetPort, () => {
      const { getNodeEnv, getLoadedEnvFile } = require('../../../utils/envLoader');
      console.log('=======================================================');
      console.log('🚀 Avatar Multi-Bot Manager & Web Dashboard Clean Architecture');
      console.log(`🌱 Môi trường (NODE_ENV) : ${getNodeEnv().toUpperCase()}`);
      console.log(`📄 File biến môi trường  : ${getLoadedEnvFile()}`);
      console.log(`🌐 Dashboard URL         : http://localhost:${targetPort}`);
      console.log(`📁 Nền tảng hệ thống     : ${process.platform} (${process.arch})`);
      console.log('=======================================================');

      // Resume previously running bots if any
      this.multiBotManager.resumePreviousRunningBots();
    });

    return this.server;
  }
}

module.exports = HttpServer;
