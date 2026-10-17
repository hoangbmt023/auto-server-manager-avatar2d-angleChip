# 🏗️ Backend Clean Architecture & System Structure

> Comprehensive technical breakdown of the Clean Architecture, Domain-Driven Design (DDD), and modular folder structure powering the Avatar Multi-Bot Manager.

---

## 🏛️ Architecture Overview

The system strictly adheres to **Clean Architecture** (Robert C. Martin) and **Hexagonal Architecture (Ports and Adapters)**. The fundamental rule is the **Dependency Rule**: *Source code dependencies must point only inward, toward higher-level policies.*

```mermaid
graph TD
    subgraph Interfaces ["4. Interfaces Layer (Driving Adapters)"]
        HTTP["HttpServer & Router"]
        CTRL["REST Controllers"]
        MW["Middlewares (CORS, Auth, BodyParser)"]
    end

    subgraph Application ["3. Application Layer (Use Cases & Orchestration)"]
        DTO["Request & Response DTOs"]
        SRV["Application Services"]
        UC["Atomic Use Cases"]
        MAP["Entity & DTO Mappers"]
    end

    subgraph Domain ["1. Domain Layer (Core Business Entities & Rules)"]
        ENT["Domain Entities (Account, Proxy, BotFile...)"]
        REP_INT["Repository Contracts (Interfaces)"]
        ERR["Hierarchical Domain Exceptions"]
        RULES["Business Rules & Invariants"]
    end

    subgraph Infrastructure ["2. Infrastructure Layer (Driven Adapters)"]
        DB["MySQL Connection Pool & Drizzle ORM"]
        PERSIST["MySql Repositories (Impl)"]
        PROC["Process Spawner (Java/JRE 17)"]
        SEC["Security & Hashers"]
        NET["Network & Socket Proxy Tester"]
    end

    CTRL --> DTO
    CTRL --> SRV
    SRV --> UC
    SRV --> REP_INT
    UC --> ENT
    PERSIST -.->|Implements| REP_INT
    PERSIST --> DB
```

---

## 📁 Complete Folder Structure

```text
test-cpanel-avatar/
├── .env.development            # Development environment configuration
├── .env.production             # Production environment configuration (cPanel)
├── server.js                   # Node.js process entrypoint
├── app.js                      # Startup wrapper for cPanel Setup Node.js App
├── package.json                # Project manifest and scripts
│
├── config/                     # Centralized Configuration & Environment Hub
│   ├── envLoader.js            # Zero-dependency multi-env file reader (.env.<env>)
│   ├── env.js                  # Intermediate Env Layer (type parsing, fallback, guards)
│   ├── index.js                # Immutable domain-grouped config (app, db, security, cors, java)
│   └── drizzle.config.js       # Drizzle ORM CLI config (reads from config.db)
│
├── docs/                       # Technical & Architectural Documentation
│   ├── ARCHITECTURE.md         # Clean Architecture & folder hierarchy (this file)
│   ├── DATABASE.md             # MySQL Database schema & Drizzle ORM engine
│   ├── API_SPECIFICATION.md    # RESTful API endpoints, DTOs & Middlewares
│   ├── CPANEL_DEPLOYMENT.md    # Deployment guide on cPanel Node.js Selector
│   └── DESIGN.md               # Porsche & Apple Liquid Glass UI Design System
│
├── jars/                       # Java Virtual Machine runtime assets
│   ├── emulator/               # MicroEmulator / AngelChip Java emulator jar
│   └── games/                  # Avatar 2D game mod jars (Fish, Farm, Diamond)
│
├── public/                     # High-performance Liquid Glass React Frontend
│   ├── index.html              # Shell HTML with vector icon injection
│   ├── style.css               # Core design tokens and global reset
│   └── src/
│       ├── App.jsx             # Root React Application
│       ├── api/api.js          # Unified Axios-like API Client
│       ├── context/            # AppContext, ModalContext
│       ├── components/         # Modular presentation components
│       └── styles/             # Component-scoped CSS modules
│
└── src/                        # Backend Clean Architecture Engine
    ├── domain/                 # Core Domain (Zero External Dependencies)
    │   ├── entities/           # Account, Proxy, BotFile, User, SystemSetting
    │   ├── errors/             # AppException, ValidationException, NotFoundException...
    │   ├── repositories/       # IAccountRepository, IProxyRepository, IUserRepository...
    │   └── rules/              # AccountLimitRule (Max 3 acc/server/IP)
    │
    ├── application/            # Application Use Cases & Workflows
    │   ├── dtos/               # Request & Response DTOs categorized by domain
    │   ├── mappers/            # Domain <-> DTO <-> Persistence Mappers
    │   ├── services/           # AccountService, ProxyService, AuthService, FileProfileService
    │   └── use-cases/          # StartBotAccountUseCase, StopBotAccountUseCase...
    │
    ├── infrastructure/         # Technical Infrastructure (Driven Adapters)
    │   ├── database/           # MySqlConnectionPool, DrizzleDb, DatabaseMigrator
    │   ├── persistence/mysql/  # MySQL Repository implementations
    │   ├── process/            # MultiBotManager, JavaDetector, JreManager
    │   ├── security/           # PasswordHasher, EncryptionService
    │   ├── logging/            # SseEventBus (Server-Sent Events)
    │   ├── network/            # ProxyTester (SOCKS5/HTTP socket checker)
    │   └── storage/            # RMS binary storage manager
    │
    ├── interfaces/             # Driving Adapters (API & Web Gateways)
    │   └── http/
    │       ├── controllers/    # AccountController, ProxyController, BotController...
    │       ├── routes/         # RESTful route definitions
    │       ├── middlewares/    # corsMiddleware, authMiddleware, bodyParserMiddleware
    │       ├── helpers/        # errorHandler.js (Central 4xx vs 500 handler)
    │       ├── Router.js       # Zero-dependency HTTP router
    │       └── HttpServer.js   # IoC Composition Root & Server bootstrap
    │
    └── shared/                 # Shared Utilities & Helpers
        └── utils/              # Time, string, and formatting utilities
```

---

## 🛡️ Architectural Principles & Guarantees

1. **Separation of Concerns (SoC)**: Business logic lives exclusively within Domain and Application layers. The HTTP framework, database drivers, and operating system calls are strictly isolated in Infrastructure and Interfaces.
2. **Dependency Inversion Principle (DIP)**: Application Services depend only on Repository Interfaces (`IAccountRepository`), never on MySQL, Drizzle, or file drivers directly.
3. **Fail-Fast DTO Validation**: Every HTTP request is sanitized and validated at the boundary before executing use cases.
4. **Single Responsibility (SRP)**: Controllers only parse incoming HTTP data, delegate to services, and serialize JSON responses.

---

## ⚡ Smart Proxy Allocation & Automation Engine (Proxy.vn Integration)

### 1. Domain Constraints & Invariants (`ServerLimitRule`)
* **Hard Concurrency Limit**: 1 IP / Proxy strictly accommodates a maximum of **6 accounts** (3 Hoàn Mỹ + 3 Diệu Kỳ).
* **Seat Reservation (Chỗ ngồi đặt trước)**: Accounts with active rentals hold their assigned Server and Proxy slot permanently throughout the rental duration, **regardless of Online/Offline status**. This prevents race conditions and TeaMobi server disconnects (> 3 accounts per server per IP causes socket termination).
* **Zero Emergency Over-allocation**: The legacy "Emergency 7th Slot" mechanism is completely eliminated to guarantee 100% stability against game bans.

### 2. High-Concurrency Safety & Financial Integrity (`RentSlotUseCase` & `ResourceAllocationEngine`)
* **Reentrant Async Mutex (`AsyncMutex.globalAllocationMutex`)**: Prevents race conditions during concurrent account rentals, while safely allowing nested lock acquisitions without deadlocking.
* **Zero-Balance Guard**: Verifies customer wallet balance and deducts funds **before** calling external vendor APIs (`proxy.vn`).
* **100% Refund Rollback**: If Proxy purchase or resource allocation fails, the customer's balance is automatically and immediately refunded in full.

### 3. Automated Proxy Lifecycle (`ProxyLifecycleCron`)
A background cron job runs automatically every 15 minutes across 3 stages:
* **Stage 1 (Health & IP Rotation)**: Tests active proxies. If a dynamic proxy fails, it queries Proxy.vn's `listproxy.php` to detect external IP changes before calling `doiproxy.php`. When IP rotates, all running bots on that proxy are automatically restarted with the new endpoint.
* **Stage 2 (Draining Transition)**: Flags proxies expiring within 24 hours as `DRAINING`, locking them from receiving new account allocations.
* **Stage 3 (Auto-Migration & Renewal)**: Migrates bots on expiring proxies to available free slots ($\le 6$) on active proxies. If no slots are available, it automatically purchases a 30-day renewal on Proxy.vn to keep user bots running uninterrupted.

### 4. Hot Proxy IP Switching & Bot Auto-Restart (`ProxyService` & `ProxyChecker`)
* Updating proxy host/port manually in the dashboard or via Proxy.vn automatic rotation automatically triggers `restartBotsOnProxy`, ensuring zero manual intervention for bot managers.
