# UI/UX Design System: Liquid Glass & Porsche Minimalist Interface

> Visual design engine, design tokens, dual-canvas differential rendering, and vector iconography specification for the Avatar Multi-Bot Manager dashboard.

---

## 1. Visual Theme Archetype

* **Design Language**: Porsche Luxury Precision Engineering integrated with Apple Liquid Glass (visionOS & macOS).
* **Layout Paradigm**: **2-Column Split Console**:
  - **Left Sidebar Hub (`320px`)**: Profile selector cards, quick management controls (Add Account, Manage Profiles, Manage Proxies), and real-time Server Capacity Monitor.
  - **Right Main Console**: Active profile header & Server 1 (Hoan My) / Server 2 (Dieu Ky) bot grids.
* **Vector Iconography**: **100% Precision SVG Vector Icons** (`<window.Icon name="..." />`), completely replacing all raw OS emojis for crisp rendering across high-DPI displays.
* **Character Avatar Rendering**: **Dual-Canvas Differential Alpha Extraction** (Pure transparent background with zero color-fringing, true `#FFFFFF` and `#000000` preservation in both Light and Dark themes).

---

## 2. Color Tokens

### Dark Theme (`[data-theme="dark"]`)
* **Background**: `#06080d` with ambient subtle liquid mesh.
* **Surfaces**: `rgba(14, 18, 28, 0.65)` with specular sheen `1px` edge highlight.
* **Borders**: `rgba(255, 255, 255, 0.09)`.
* **Text**: Primary `#f8fafc`, Secondary `#94a3b8`, Muted `#64748b`.

### Light Theme (`[data-theme="light"]`)
* **Background**: `#f2f4f8` with luminous liquid ambient mesh.
* **Surfaces**: `rgba(255, 255, 255, 0.72)` with specular edge highlight.
* **Borders**: `rgba(0, 0, 0, 0.08)`.
* **Text**: Primary `#1d1d1f`, Secondary `#515154`, Muted `#86868b`.

### Brand & Status Accents
* **Porsche Racing Red / Apple Red**: `#d5001c` / `#ff453a` (Stop / Danger / Delete)
* **Electric Cyan / Apple Blue**: `#0071e3` / `#0a84ff` (Primary actions / Active tabs)
* **Porsche Speed Gold**: `#e0a526` / `#ffd60a` (In-game currency / Coins)
* **Status Green**: `#30d158` (Online bots / Successful payments)
* **Status Purple**: `#bf5af2` (Server Dieu Ky / Diamond mining mod)

---

## 3. UI Component Specifications

### 3.1. AccountCard (6-Metric Matrix & Capsule Action Bar)
* **AvatarChibiView**: Crystal clear transparent pixel-art avatar rendering extracted dynamically from game sprite frames.
* **6-Metric Cells**:
  1. `coins`: Current In-Game Coins
  2. `trending`: Earned Coins this session
  3. `target`: Target Coin Quota
  4. `heart`: Harvested Hearts
  5. `calendar`: Start Timestamp
  6. `clock`: Contract Expiration Countdown
* **Action Capsule**: Play/Stop Pill, Auto Routine Dropdown, Settings Dropdown, Context Menu.

### 3.2. Left Sidebar Control Hub
* Profile selector with individual bot count and capacity indicators.
* Instant Server Capacity Monitor (Hoan My x/3, Dieu Ky y/3, Total z/6).
* Quick Action Buttons (Add Account, Manage Profiles, Manage Proxies).

### 3.3. User Rental & Billing Portal
* **Slot Rental Card**: Dynamic pricing selector (UPXU / FISH / FULL) with duration discounts (1, 3, 6, 12 months) and voucher validation.
* **VietQR & payOS Modal**: Instant NAPAS transfer QR code generation with dynamic amount verification and live balance crediting via Server-Sent Events (SSE).
* **Slot Cancellation Dialogue**: Displays exact remaining duration, effective monthly price, cancellation fee breakdown, and net wallet refund before confirmation.
