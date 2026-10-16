# 🎨 Design System: Porsche & Apple Minimalist Liquid Glass UI (v3.0)

> **OpenDesign Specification**  
> Luxury Minimalism inspired by Porsche Design & Apple Liquid Glass (visionOS & macOS). Precision 2-Column Split-Layout with Lucide Vector Iconography.

---

## 1. Visual Theme Archetype

* **Aesthetic**: Porsche Luxury Precision Engineering meets Apple Liquid Glass (visionOS & macOS).
* **Layout Paradigm**: **2-Column Split Layout**:
  - **Left Sidebar Hub (`320px`)**: Profile selector cards, quick management controls (Add Account, Manage Profiles, Manage Proxies), and real-time Server Capacity Monitor.
  - **Right Main Console**: Active profile header & Server 1 (Hoan My) / Server 2 (Dieu Ky) bot grids.
* **Iconography**: **100% Precision Vector Icons** (`<window.Icon name="..." />`), replacing all raw emojis for high-DPI crystal-clear rendering.
* **Character Avatar Rendering**: **Dual-Canvas Differential Alpha Extraction** (Pure transparent background with zero color-fringing, true `#FFFFFF` and `#000000` preservation in both Light and Dark themes).

---

## 2. Color Tokens

### 🌙 Dark Theme (`[data-theme="dark"]`):
* **Background**: `#06080d` with ambient subtle liquid mesh.
* **Surfaces**: `rgba(14, 18, 28, 0.65)` with specular sheen `1px` edge highlight.
* **Borders**: `rgba(255, 255, 255, 0.09)`.
* **Text**: Primary `#f8fafc`, Secondary `#94a3b8`, Muted `#64748b`.

### ☀️ Light Theme (`[data-theme="light"]`):
* **Background**: `#f2f4f8` with luminous liquid ambient mesh.
* **Surfaces**: `rgba(255, 255, 255, 0.72)` with specular edge highlight.
* **Borders**: `rgba(0, 0, 0, 0.08)`.
* **Text**: Primary `#1d1d1f`, Secondary `#515154`, Muted `#86868b`.

### Porsche & Apple Accents:
* **Porsche Racing Red / Apple Red**: `#d5001c` / `#ff453a` (Stop / Danger / Delete)
* **Electric Cyan / Apple Blue**: `#0071e3` / `#0a84ff` (Primary actions / Active tabs)
* **Porsche Speed Gold**: `#e0a526` / `#ffd60a` (In-game Coins)
* **Status Green**: `#30d158` (Online bots)
* **Status Purple**: `#bf5af2` (Server Dieu Ky / Diamond mod)

---

## 3. UI Component Specifications

### 3.1. AccountCard (6-Metric Matrix & Capsule Action Bar)
- **AvatarChibiView**: Crystal clear transparent pixel-art avatar rendering.
- **6-Metric Cells**:
  1. `<Icon name="coins" />` Current Coins
  2. `<Icon name="trending" />` Earned Coins
  3. `<Icon name="target" />` Target Coins
  4. `<Icon name="heart" />` Harvest Hearts
  5. `<Icon name="calendar" />` Start Date
  6. `<Icon name="clock" />` Expiration
- **Action Capsule**: Play/Stop Pill, `<Icon name="zap" /> Auto` Dropdown, `<Icon name="settings" />` Dropdown, `<Icon name="more" />` More Menu.

### 3.2. Left Sidebar Control Hub
- Profile selector with individual bot count and capacity indicators.
- Instant Server Capacity Monitor (Hoan My x/3, Dieu Ky y/3, Total z/6).
- Quick Action Buttons (Add Account, Manage Profiles, Manage Proxies).

### 3.3. User Rental & Billing Portal
- **Mobile Bottom Navigation Dock**: Floating iPhone-style liquid glass pill dock (`MobileBottomNav.jsx`) with safe-area bottom insets and high-DPI vector icons (`bot`, `zap`, `user`).
- **Billing & Topup Card**: Instant VietQR / payOS checkout integration with dynamic bonus calculations and visual state feedback.
- **On-Demand Transaction History**: Infinite scroll modal with reusable `CircularSpinner`, automatic race condition guard, and transaction type filters (`ALL`, `TOPUP`, `RENTAL`).

---

## 4. Vector Iconography Standard (`Icons.jsx`)

All icons across both Admin and User interfaces strictly use `<window.Icon name="..." size={...} color={...} />`.
- **Zero Raw Emojis**: Replaces emojis (`👁️`, `⚠️`, etc.) with crystal-clear vector glyphs (`eye`, `alert-triangle`).
- **Zero Hardcoded SVGs**: All icons are centralized in `public/src/components/Icons.jsx`.
- **Mobile Browser Protection**: All SVG elements omit `xmlns="http://www.w3.org/2000/svg"` to eliminate mobile browser URL preview popups during tap or long-press.
- **Standard Registry**: Over 50+ optimized Lucide glyphs: `bot`, `zap`, `user`, `users`, `coins`, `clock`, `eye`, `shield`, `alert-triangle`, `log-out`, `arrow-left`, `search`, etc.

