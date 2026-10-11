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

const Router = require('./Router');
const createBotRoutes = require('./routes/botRoutes');
const createAccountRoutes = require('./routes/accountRoutes');
const createFileRoutes = require('./routes/fileRoutes');
const createProxyRoutes = require('./routes/proxyRoutes');
const createSystemRoutes = require('./routes/systemRoutes');

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

/**
 * HttpServer (Interface Adapters Layer)
 * Manages HTTP server lifecycle, middleware authentication, declarative routing and static asset serving.
 */
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
    this.router = this.initRouter();
  }

  initRouter() {
    const router = new Router();
    const subRouters = [
      createBotRoutes(this.botController),
      createAccountRoutes(this.accountController),
      createFileRoutes(this.fileController),
      createProxyRoutes(this.proxyController),
      createSystemRoutes(this.systemController)
    ];

    for (const sub of subRouters) {
      for (const route of sub.routes) {
        router.routes.push(route);
      }
    }
    return router;
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
        if (body.length > 2 * 1024 * 1024) reject(new Error('Payload too large'));
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

  serveStaticFile(pathname, res) {
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
  }

  initServer() {
    const helpers = {
      sendJson: this.sendJson.bind(this),
      parseJsonBody: this.parseJsonBody.bind(this)
    };

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

        const handled = await this.router.handle(req, res, parsedUrl, helpers);
        if (!handled) {
          this.sendJson(res, 404, { success: false, message: 'API endpoint not found' });
        }
        return;
      }

      // Static Files Serving
      this.serveStaticFile(pathname, res);
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

      this.multiBotManager.resumePreviousRunningBots();
    });

    return this.server;
  }
}

module.exports = HttpServer;
