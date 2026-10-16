<div align="center">

# 🌟 Avatar Multi-Bot Manager

**Production-grade 24/7 Multi-Bot Automation & Liquid Glass Web Dashboard for Avatar 2D.**  
Built with **Clean Architecture**, **MySQL / Drizzle ORM**, and **Zero-Dependency Native Runtime**.

[![Node.js](https://img.shields.io/badge/Node.js-18%20|%2020%2B-339933?style=flat-square&logo=node.js&logoColor=white)](https://nodejs.org/)
[![Database](https://img.shields.io/badge/Database-MySQL%20%7C%20Drizzle%20ORM-00758F?style=flat-square&logo=mysql&logoColor=white)](https://orm.drizzle.team/)
[![Architecture](https://img.shields.io/badge/Architecture-Clean%20%2F%20DDD-6366F1?style=flat-square)](docs/ARCHITECTURE.md)
[![Platform](https://img.shields.io/badge/Platform-cPanel%20%7C%20Linux%20%7C%20Windows-FF6C37?style=flat-square)](docs/CPANEL_DEPLOYMENT.md)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)

[Quickstart](#-quickstart) • [Features](#-features) • [Documentation Hub](#-documentation-hub) • [Deployment](#-deployment)

</div>

---

## ⚡ Highlights

* 🤖 **Multi-Bot Engine**: Run dozens of Avatar 2D bot accounts simultaneously across multiple profile tabs with auto-reconnect and crash recovery.
* 🎮 **Full Game Mod Suite**: Built-in support for Auto Fishing, Auto Farm (Starfruit, Orders), Auto Diamond Mining, and Gemstone Selling.
* 💳 **Automated payOS & VietQR Billing**: Instant 24/7 wallet top-ups with dynamic bonus tiers, double-crediting prevention, timing-attack immunity, and real-time SSE balance synchronization.
* 🛡️ **Clean Architecture & DDD**: Strict separation of concerns (Domain, Application, Infrastructure, Interfaces) with fail-fast DTO validation.
* 🗄️ **100% MySQL Persistence**: Zero `config.json` file locks. Full ACID transactions, connection pooling, and code-first schema migrations.
* 🌐 **Liquid Glass Dashboard & Mobile Dock**: Porsche & Apple minimalist UI with live Server-Sent Events (SSE) terminal logs, dual-canvas graphic rendering, and iPhone-style floating bottom dock.
* 🔌 **Resilient Proxy Networking**: Integrated SOCKS5 / HTTP proxy manager with 3-attempt socket health verification and latency tracking.
* ☁️ **1-Click cPanel Ready**: Deploy seamlessly to cPanel Node.js Selector with automatic portable OpenJDK 17 installation (no root required).

---

## 🚀 Quickstart

### 1. Clone & Configure

```bash
git clone https://github.com/hoangbmt023/auto-server-manager-avatar2d-angleChip.git
cd auto-server-manager-avatar2d-angleChip
```

Copy the environment template:

```bash
cp .env.example .env.development
```

Edit `.env.development` with your MySQL credentials:

```env
DB_HOST=localhost
DB_USER=root
DB_PASSWORD=
DB_NAME=avatar_2d_bot_manager
PORT=3001
```

### 2. Run the Application

```bash
# Development (with Code-First Auto-Migration)
npm run dev

# Production
npm run prod
```

Open your browser at **`http://localhost:3001`**.

---

## 📚 Documentation Hub

Deep-dive technical documentation is organized in the [`docs/`](docs/) directory:

| Document | Description |
| :--- | :--- |
| 🏗️ [**Architecture & Folder Structure**](docs/ARCHITECTURE.md) | Clean Architecture layers, Domain-Driven Design, dependency rules, and folder hierarchy |
| 🗄️ [**Database & Schema Reference**](docs/DATABASE.md) | MySQL schema ERD, Drizzle ORM models, connection pooling, and auto-seeding |
| 🔌 [**API & Middleware Specification**](docs/API_SPECIFICATION.md) | RESTful API endpoints, Request/Response DTO contracts, and Security Middlewares |
| 🚀 [**cPanel Deployment Guide**](docs/CPANEL_DEPLOYMENT.md) | Step-by-step setup on cPanel Hosting via Setup Node.js App & Portable JRE 17 |
| 🎨 [**UI/UX Design Engine**](docs/DESIGN.md) | Porsche Minimalist Liquid Glass design tokens, color palette, and vector iconography |

---

## 🛠️ Security Middlewares Pipeline

All incoming HTTP requests pass through three dedicated modular boundary guards:

* **CORS Whitelisting** (`corsMiddleware.js`): Strict origin validation dynamically managed via `CORS_ALLOWED_ORIGINS` in `.env`.
* **Timing-Attack Immune Auth** (`authMiddleware.js`): Constant-time string comparison (`crypto.timingSafeEqual`) for dashboard protection.
* **Payload Protection** (`bodyParserMiddleware.js`): Memory overflow prevention (Anti-DoS) and Prototype Pollution sanitization.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
