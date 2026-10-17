# 🔌 RESTful API & Middleware Specification

> Complete reference for HTTP REST APIs, Request/Response DTO contracts, Java-style Error responses, and Security Middlewares.

---

## 📐 Response Standards

All responses conform to modern Java-style DTO structures (`ApiResponse` and `ErrorResponse`).

### 1. Success Response (`ApiResponse`)
```json
{
  "success": true,
  "message": "Account created successfully!",
  "data": { ... },
  "pagination": null
}
```

### 2. Validation Error Response (HTTP 400 - `ErrorResponse.validation`)
Returned when boundary DTO validation fails on specific input fields:
```json
{
  "success": false,
  "message": "Invalid request parameters",
  "errors": {
    "username": "Username cannot be empty!",
    "serverId": "Invalid server ID (0: Hoan My, 1: Dieu Ky)!",
    "ipSlot": "IP Slot must be an integer >= 1!"
  }
}
```

### 3. Business / General Error Response (HTTP 4xx - `ErrorResponse.message`)
Returned when an entity is not found, unauthorized, or conflicts:
```json
{
  "success": false,
  "message": "Account not found on system!",
  "errors": null
}
```

### 4. Uncaught Internal Server Error (HTTP 500 - `ErrorResponse.serverError`)
Returned when an unexpected runtime crash or database exception occurs:
```json
{
  "success": false,
  "message": "Internal server error. Please try again later.",
  "errors": null
}
```

---

## 🛡️ Security Middlewares Pipeline

All incoming HTTP requests pass through three dedicated modular middlewares in `src/interfaces/http/middlewares/`:

```
Incoming Request
       │
       ▼
┌─────────────────────────┐
│ 1. corsMiddleware       │ ──> Validates Origin against CORS_ALLOWED_ORIGINS (.env)
└─────────────────────────┘     Handles OPTIONS preflight (204 or 403 Forbidden)
       │
       ▼
┌─────────────────────────┐
│ 2. authMiddleware       │ ──> Verifies system password via X-Dashboard-Auth / Bearer token
└─────────────────────────┘     Timing-Attack immune using crypto.timingSafeEqual
       │
       ▼
┌─────────────────────────┐
│ 3. bodyParserMiddleware │ ──> Aggregates streams up to MAX_PAYLOAD_SIZE_MB (Anti-DoS)
└─────────────────────────┘     Sanitizes Object keys to prevent Prototype Pollution
       │
       ▼
┌─────────────────────────┐
│ Router & Controllers    │ ──> DTO Validation & Execution
└─────────────────────────┘
```

---

## 📋 API Endpoints Index

### 1. Authentication (`/api/auth`)
* `POST /api/auth/register` - Create account (`email`, `phone`, `password`, `fullName`).
* `POST /api/auth/login` - Authenticate user credentials.
* `POST /api/auth/verify` - Verify dashboard access password.

### 2. Account Management (`/api/accounts`)
* `GET /api/accounts` - Retrieve all accounts grouped by active bot file profile.
* `POST /api/accounts` - Create or update Avatar account (`SaveAccountRequestDto`).
* `DELETE /api/accounts/:id` - Delete an account.
* `POST /api/accounts/switch-server` - Toggle server between Hoàn Mỹ (0) and Diệu Kỳ (1).
* `POST /api/accounts/setup` - Configure Bot automation (`farm`, `fish`, `diamond`, `upCoins`).
* `POST /api/accounts/reset-data` - Reset automation progress and counters.

### 3. Bot Execution & Lifecycle (`/api/bots`)
* `POST /api/bots/start` - Spawn Java VM instance for an account (`StartBotAccountUseCase`).
* `POST /api/bots/stop` - Terminate running bot process.
* `POST /api/bots/restart-all` - Gracefully restart all active bots.
* `GET /api/status` - Realtime hardware, CPU, RAM and bot count status.
* `GET /api/events` - Server-Sent Events (SSE) live game log stream.

### 4. Proxy Networking & Automation (`/api/proxies`)
* `GET /api/proxies` - List all SOCKS5/HTTP proxies with enriched capacity & lifecycle metadata (`tier`, `status`, `expiresAt`, `remainingDays`, `externalId`, `countHM`, `countDK`, `totalAssigned`, `isDraining`).
* `POST /api/proxies` - Add or update proxy (preserves `DYNAMIC` tier and `externalId`; triggers graceful bot auto-restart if host/port changed).
* `DELETE /api/proxies/:id` - Remove proxy from pool.
* `POST /api/proxies/test` - Perform ping test on single proxy (auto-rotates dynamic IP if dead).
* `POST /api/proxies/test-all` - Batch test entire proxy pool.
* `POST /api/proxies/rotate` - Rotate dynamic IP via Proxy.vn API with `listproxy.php` pre-check and bot auto-restart (`RotateProxyRequestDto`).
* `GET /api/proxies/system-config` - Retrieve Proxy.vn automation configuration (API key status, strategy, default category, and protocol).
* `POST /api/proxies/system-config` - Update Proxy.vn automation configuration (`SaveProxySystemConfigRequestDto`).

### 5. File Profiles (`/api/files`)
* `GET /api/files` - List bot profiles and assigned account counts.
* `POST /api/files` - Create / Update bot profile (`SaveBotFileRequestDto`).
* `DELETE /api/files/:id` - Delete file and its associated bot accounts.
* `POST /api/files/switch` - Change active file tab.

### 6. System Settings (`/api/settings`)
* `GET /api/settings/config` - Get safe system configuration.
* `POST /api/settings/config` - Update memory, port, and security tokens (`SaveSystemConfigRequestDto`).
* `POST /api/system/install-jre` - 1-Click download and extract Portable OpenJDK 17 on Linux.

### 7. Authentication & JWT (`/api/auth`)
* `POST /api/auth/register` - Register new user account with bcrypt password hashing and issue JWT tokens (`RegisterUserRequestDto`).
* `POST /api/auth/login` - Authenticate credentials and return signed access & refresh JWT tokens (`LoginUserRequestDto`).
* `POST /api/auth/refresh` - Issue a fresh access token using a valid refresh token.
* `GET /api/auth/me` - Retrieve user profile for the authenticated bearer token (`UserResponseDto`).

### 8. Billing & Automated payOS Top-Up Gateway (`/api/billing`)
* `GET /api/billing/balance` - Retrieve real-time wallet balance for the authenticated user.
* `GET /api/billing/policy` - Retrieve dynamic top-up presets, tiered bonus percentages, and banking metadata.
* `GET /api/billing/transactions` - Paginated transaction history with cursor/offset pagination (`page`, `limit`, `type`: `ALL` | `TOPUP` | `RENTAL`).
* `POST /api/billing/payos-order` - Create a payOS VietQR checkout session (Rate limited: 6 req/min, min 10.000đ, max 50.000.000đ).
* `GET /api/billing/payos-order/:orderCode/verify` - Verify payment status with payOS upon return and atomically credit wallet (`claimPendingTransaction`). Protected by IDOR checks and rate limiting (20 req/min).
* `POST /api/billing/payos-order/:orderCode/cancel` - Explicitly cancel a pending payment order and mark transaction `CANCELLED`.
* `POST /api/billing/payos-webhook` - **Public Webhook** for payOS IPN notifications. Verified with HMAC-SHA256 (`crypto.timingSafeEqual`) and atomic concurrency locks against double crediting.
* `POST /api/billing/check-voucher` - Validate voucher codes, calculate discount values, and enforce usage limits per account.
* `POST /api/billing/topup` - *(Admin Only - RBAC)* Internal direct balance topup for administrative testing.
* `POST /api/billing/admin/adjust-balance` - *(Admin Only - RBAC)* Credit/debit user balance with reason and audit trail.
* `PUT /api/billing/admin/topup-settings` - *(Admin Only - RBAC)* Update system-wide deposit presets, bonus tiers, and thresholds.


