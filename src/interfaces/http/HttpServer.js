const http = require('http');
const url = require('url');
const path = require('path');
const fs = require('fs');
const config = require('../../../config');

// Infrastructure & Persistence
const SseEventBus = require('../../infrastructure/logging/SseEventBus');
const { defaultPool } = require('../../infrastructure/database/MySqlConnectionPool');
const TransactionManager = require('../../infrastructure/database/TransactionManager');
const DatabaseMigrator = require('../../infrastructure/database/DatabaseMigrator');
const DrizzleDb = require('../../infrastructure/database/DrizzleDb');

const MySqlUserRepository = require('../../infrastructure/persistence/mysql/MySqlUserRepository');
const MySqlAccountRepository = require('../../infrastructure/persistence/mysql/MySqlAccountRepository');
const MySqlBotFileRepository = require('../../infrastructure/persistence/mysql/MySqlBotFileRepository');
const MySqlProxyRepository = require('../../infrastructure/persistence/mysql/MySqlProxyRepository');
const MySqlSystemSettingRepository = require('../../infrastructure/persistence/mysql/MySqlSystemSettingRepository');
const MySqlRefreshTokenRepository = require('../../infrastructure/persistence/mysql/MySqlRefreshTokenRepository');
const MySqlTransactionRepository = require('../../infrastructure/persistence/mysql/MySqlTransactionRepository');
const MySqlVoucherRepository = require('../../infrastructure/persistence/mysql/MySqlVoucherRepository');
const PayOsService = require('../../infrastructure/payment/PayOsService');

// Application Services
const MultiBotManager = require('../../application/services/MultiBotManager');
const AuthService = require('../../application/services/AuthService');
const AccountService = require('../../application/services/AccountService');
const FileProfileService = require('../../application/services/FileProfileService');
const ProxyService = require('../../application/services/ProxyService');
const ResourceAllocationEngine = require('../../application/services/ResourceAllocationEngine');
const ProxyLifecycleCron = require('../../application/services/ProxyLifecycleCron');
const ProxyVnApiClient = require('../../infrastructure/network/ProxyVnApiClient');
const AsyncMutex = require('../../shared/utils/AsyncMutex');

// Use Cases
const RentSlotUseCase = require('../../application/use-cases/rental/RentSlotUseCase');
const BillingUseCase = require('../../application/use-cases/billing/BillingUseCase');
const ManageRentalAllocationsUseCase = require('../../application/use-cases/admin/ManageRentalAllocationsUseCase');

// Interface Controllers
const AuthController = require('./controllers/AuthController');
const AccountController = require('./controllers/AccountController');
const BotController = require('./controllers/BotController');
const FileController = require('./controllers/FileController');
const ProxyController = require('./controllers/ProxyController');
const SystemController = require('./controllers/SystemController');
const RentalController = require('./controllers/RentalController');
const BillingController = require('./controllers/BillingController');
const AdminAllocationController = require('./controllers/AdminAllocationController');

// Routes & Middlewares
const Router = require('./Router');
const createAuthRoutes = require('./routes/authRoutes');
const createBotRoutes = require('./routes/botRoutes');
const createAccountRoutes = require('./routes/accountRoutes');
const createFileRoutes = require('./routes/fileRoutes');
const createProxyRoutes = require('./routes/proxyRoutes');
const createSystemRoutes = require('./routes/systemRoutes');
const createRentalRoutes = require('./routes/rentalRoutes');
const createBillingRoutes = require('./routes/billingRoutes');
const createAdminAllocationRoutes = require('./routes/adminAllocationRoutes');
const { corsMiddleware, createAuthMiddleware, parseJsonBody } = require('./middlewares');

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
 * Dependency Injection root, bootstraps Code-First MySQL engine, routing, and HTTP server.
 * Powered 100% by MySQL Repositories (Database-Driven, zero config.json dependency).
 */
class HttpServer {
  constructor() {
    this.sseEventBus = new SseEventBus();

    // MySQL Database & Transaction Infrastructure
    this.dbPool = defaultPool;
    this.drizzleDb = new DrizzleDb(this.dbPool);
    this.transactionManager = new TransactionManager(this.dbPool);
    this.migrator = new DatabaseMigrator(this.dbPool);

    // Repositories (Data Access Layer - Powered by Drizzle ORM)
    this.userRepo = new MySqlUserRepository(this.dbPool, this.drizzleDb);
    this.accountRepo = new MySqlAccountRepository(this.dbPool, this.drizzleDb);
    this.fileRepo = new MySqlBotFileRepository(this.dbPool, this.drizzleDb);
    this.proxyRepo = new MySqlProxyRepository(this.dbPool, this.drizzleDb);
    this.settingRepo = new MySqlSystemSettingRepository(this.dbPool, this.drizzleDb);
    this.refreshTokenRepo = new MySqlRefreshTokenRepository(this.dbPool, this.drizzleDb);
    this.transactionRepo = new MySqlTransactionRepository(this.dbPool, this.drizzleDb);
    this.voucherRepo = new MySqlVoucherRepository(this.dbPool, this.drizzleDb);

    // Application Services (100% Database-Driven)
    this.multiBotManager = new MultiBotManager(
      this.accountRepo,
      this.fileRepo,
      this.proxyRepo,
      this.settingRepo,
      this.sseEventBus
    );
    this.authService = new AuthService(this.userRepo, undefined, undefined, undefined, this.refreshTokenRepo);
    this.accountService = new AccountService(
      this.accountRepo,
      this.fileRepo,
      this.proxyRepo,
      this.settingRepo,
      this.multiBotManager
    );
    this.fileProfileService = new FileProfileService(
      this.fileRepo,
      this.accountRepo,
      this.settingRepo,
      this.multiBotManager,
      this.transactionManager
    );
    this.proxyService = new ProxyService(
      this.proxyRepo,
      this.accountRepo,
      this.multiBotManager,
      this.sseEventBus,
      this.transactionManager
    );
    this.allocationMutex = AsyncMutex.globalAllocationMutex;
    this.proxyVnApiClient = new ProxyVnApiClient(config.proxyVn);
    this.allocationEngine = new ResourceAllocationEngine(
      this.fileRepo,
      this.proxyRepo,
      this.accountRepo,
      this.settingRepo,
      this.proxyVnApiClient,
      this.allocationMutex
    );
    this.proxyLifecycleCron = new ProxyLifecycleCron({
      proxyRepo: this.proxyRepo,
      accountRepo: this.accountRepo,
      multiBotManager: this.multiBotManager,
      proxyVnApiClient: this.proxyVnApiClient,
      sseEventBus: this.sseEventBus,
      dbPool: this.dbPool,
      mutex: this.allocationMutex
    });

    // Use Cases
    this.rentSlotUseCase = new RentSlotUseCase(
      this.userRepo,
      this.accountRepo,
      this.transactionRepo,
      this.voucherRepo,
      this.allocationEngine,
      this.settingRepo,
      this.allocationMutex,
      this.multiBotManager,
      this.proxyRepo
    );
    this.payOsService = new PayOsService(this.settingRepo);
    this.billingUseCase = new BillingUseCase(
      this.userRepo,
      this.transactionRepo,
      this.voucherRepo,
      this.settingRepo,
      this.payOsService,
      this.sseEventBus
    );
    this.manageAllocationUseCase = new ManageRentalAllocationsUseCase(
      this.settingRepo,
      this.voucherRepo,
      this.fileRepo,
      this.proxyRepo
    );

    // Interface Controllers
    this.authController = new AuthController(this.authService);
    this.accountController = new AccountController(this.accountService, this.settingRepo, this.fileRepo, this.sseEventBus);
    this.botController = new BotController(this.multiBotManager, this.sseEventBus, this.accountRepo, this.fileRepo, this.settingRepo);
    this.fileController = new FileController(this.fileProfileService, this.fileRepo, this.sseEventBus);
    this.proxyController = new ProxyController(this.proxyService, this.sseEventBus);
    this.systemController = new SystemController(this.settingRepo, this.sseEventBus);
    this.rentalController = new RentalController(this.rentSlotUseCase, this.allocationEngine);
    this.billingController = new BillingController(this.billingUseCase, this.userRepo);
    this.adminAllocationController = new AdminAllocationController(this.manageAllocationUseCase);

    this.publicDir = path.resolve(__dirname, '../../../public');
    this.server = null;
    this.router = this.initRouter();
    this.authMiddleware = createAuthMiddleware(this.settingRepo, this.sendJson.bind(this), this.userRepo);
    this.parseJsonBody = parseJsonBody;
  }

  initRouter() {
    const router = new Router();
    const subRouters = [
      createAuthRoutes(this.authController),
      createBotRoutes(this.botController),
      createAccountRoutes(this.accountController),
      createFileRoutes(this.fileController),
      createProxyRoutes(this.proxyController),
      createSystemRoutes(this.systemController),
      createRentalRoutes(this.rentalController),
      createBillingRoutes(this.billingController),
      createAdminAllocationRoutes(this.adminAllocationController)
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
      'Expires': '0'
    });
    res.end(JSON.stringify(data));
  }

  serveStaticFile(pathname, res) {
    let safePath = pathname;
    if (safePath === '/' || !safePath) safePath = '/index.html';

    const normalized = path.normalize(safePath).replace(/^(\.\.[\/\\])+/, '');
    const filePath = path.join(this.publicDir, normalized);

    if (!filePath.startsWith(this.publicDir)) {
      res.writeHead(403);
      return res.end('Forbidden');
    }

    fs.stat(filePath, (err, stats) => {
      if (err || !stats.isFile()) {
        const fallback = path.join(this.publicDir, 'index.html');
        fs.readFile(fallback, (err2, content) => {
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

      // 1. CORS Preflight & Headers Middleware
      if (corsMiddleware(req, res)) {
        return;
      }

      // 2. SSE Endpoint
      if (pathname === '/api/events') {
        return this.sseEventBus.addClient(res);
      }

      // 3. Public API check auth endpoint
      if (pathname === '/api/auth/verify' && req.method === 'POST') {
        const password = (await this.settingRepo.get('password')) || '';
        try {
          const body = await this.parseJsonBody(req);
          if (!password || body.password === password) {
            return this.sendJson(res, 200, { success: true, message: 'Xác thực thành công!' });
          }
          return this.sendJson(res, 401, { success: false, message: 'Sai mật khẩu truy cập!' });
        } catch (e) {
          return this.sendJson(res, 400, { success: false, message: e.message });
        }
      }

      // 4. Public User Authentication & OTP endpoints & Webhooks
      const publicAuthEndpoints = [
        '/api/auth/register',
        '/api/auth/send-otp',
        '/api/auth/activate',
        '/api/auth/login',
        '/api/auth/refresh',
        '/api/auth/logout',
        '/api/auth/forgot-password',
        '/api/auth/verify-forgot-password',
        '/api/auth/reset-password',
        '/api/billing/payos-webhook'
      ];
      if (publicAuthEndpoints.includes(pathname)) {
        const handled = await this.router.handle(req, res, parsedUrl, helpers);
        if (handled) return;
      }

      // 5. API Endpoints Routing (Protected by authMiddleware)
      if (pathname.startsWith('/api/')) {
        const isAuth = await this.authMiddleware(req, res);
        if (!isAuth) return;

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

  async start(port = null) {
    // 1. Run Code-First Schema Migration and Auto-Seeding
    try {
      await this.migrator.migrate();
      await this.migrator.seedInitialData();
    } catch (migErr) {
      console.warn('⚠️ [Code-First Migrator] Không thể kết nối hoặc đồng bộ CSDL MySQL (Vui lòng kiểm tra lại cấu hình DB trong file .env):', migErr.message);
    }

    // 2. Start HTTP server
    this.initServer();
    const dbPort = await this.settingRepo.get('port');
    const targetPort = port || dbPort || config.app.port || 3001;

    this.server.listen(targetPort, () => {
      console.log('=======================================================');
      console.log('🚀 Avatar Multi-Bot Manager & Web Dashboard Clean Architecture (MySQL)');
      console.log(`🌱 Môi trường (NODE_ENV) : ${config.app.env.toUpperCase()}`);
      console.log(`📄 File biến môi trường  : ${config.app.loadedEnvFile}`);
      console.log(`🌐 Dashboard URL         : http://localhost:${targetPort}`);
      console.log(`📁 Nền tảng hệ thống     : ${process.platform} (${process.arch})`);
      console.log('=======================================================');

      this.multiBotManager.resumePreviousRunningBots();

      // 3. Start Proxy Lifecycle & Waterfall Migration Cron
      this.proxyLifecycleCron.start(30 * 60 * 1000);

      // 4. Rental Expiration Watchdog (Kiểm tra và ngắt an toàn bot hết hạn thuê)
      setInterval(async () => {
        try {
          const allAccs = await this.accountRepo.findAll();
          for (const acc of allAccs) {
            if (acc.isRentalExpired()) {
              const isRunning = this.multiBotManager.isAccountRunning(acc.id);
              if (isRunning) {
                console.log(`⏳ [Rental Watchdog] Tài khoản [${acc.username}] đã hết hạn thuê. Đang tự động ngắt kết nối an toàn...`);
                await this.multiBotManager.stopAccount(acc.id);
                this.accountController.broadcastChange();
              }
            }
          }
        } catch (e) {}
      }, 60000);
    });

    return this.server;
  }
}

module.exports = HttpServer;
