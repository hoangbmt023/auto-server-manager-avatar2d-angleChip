# 🎨 Design System: Porsche & Apple Minimalist Liquid Glass UI (v3.0)

> **OpenDesign Specification**  
> Luxury Minimalism inspired by Porsche Design & Apple Liquid Glass (visionOS & macOS). Precision 2-Column Split-Layout with Lucide Vector Iconography.

---

## 1. Visual Theme Archetype
* **Aesthetic**: Porsche Luxury Precision Engineering meets Apple Liquid Glass (visionOS & macOS).
* **Layout Paradigm**: **2-Column Split Layout**:
  - **Left Sidebar Hub (`320px`)**: File selector cards, quick management controls (Thêm Nick, Quản Lý File, Quản Lý Proxy), and real-time Server Capacity Monitor.
  - **Right Main Console**: Active profile header & Server 1 (Hoàn Mỹ) / Server 2 (Diệu Kỳ) bot grids.
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
* **Porsche Speed Gold**: `#e0a526` / `#ffd60a` (Xu in-game currency)
* **Status Green**: `#30d158` (Online bots)
* **Status Purple**: `#bf5af2` (Server Diệu Kỳ / Kim Cương mod)

---

## 3. UI Component Specifications

### 3.1. AccountCard (6-Metric Matrix & Capsule Action Bar)
- **AvatarChibiView**: Crystal clear transparent pixel-art avatar rendering.
- **6-Metric Cells**:
  1. `<Icon name="coins" />` Xu Có
  2. `<Icon name="trending" />` Xu Up Được
  3. `<Icon name="target" />` Mục Tiêu
  4. `<Icon name="heart" />` Tim Thu
  5. `<Icon name="calendar" />` Bắt Đầu
  6. `<Icon name="clock" />` Hạn Up
- **Action Capsule**: Play/Stop Pill, `<Icon name="zap" /> Auto` Dropdown, `<Icon name="settings" />` Dropdown, `<Icon name="more" />` More Menu.

### 3.2. Left Sidebar Control Hub
- Profile selector with individual bot count and capacity.
- Instant Server Capacity Monitor (Hoàn Mỹ x/3, Diệu Kỳ y/3, Tổng z/6).
- Quick Action Buttons (Thêm tài khoản, Quản lý File, Quản lý Proxy).
