# 🌟 Avatar Multi-Bot Manager & Web Dashboard (cPanel Node.js)

Hệ thống quản lý, điều khiển và giám sát đa tài khoản **Bot Avatar 2D (AngelChip Emulator & Mod)** chạy ngầm 24/7 trên môi trường Hosting **cPanel (Node.js)** hoặc VPS/Server (Windows / Linux).

Ứng dụng được thiết kế theo mô hình **Clean Architecture / DDD**, tích hợp bảo mật mã hóa **AES-256-CBC**, cơ chế quản lý biến môi trường động (`.env`), kiểm tra Proxy 3 lần dự phòng (`3-Attempt Retry`), trích xuất ảnh Avatar đồ họa kép sắc nét (**Dual-Canvas Differential Engine**) và giao diện **Web Dashboard React** trực quan thời gian thực.

---

## 📚 Tài Liệu Hướng Dẫn Chi Tiết (Documentation)

| Tài liệu | Mô tả | Đường dẫn |
| :--- | :--- | :--- |
| 🚀 **Hướng Dẫn Cài Đặt cPanel** | Hướng dẫn từng bước triển khai trên cPanel Hosting qua Setup Node.js App | [CPANEL_DEPLOYMENT.md](docs/CPANEL_DEPLOYMENT.md) |
| 🎨 **Hệ Thống Thiết Kế UI/UX** | Porsche Minimalist Liquid Glass UI (v3.0), Design Tokens & Iconography | [DESIGN.md](docs/DESIGN.md) |

---

## 🚀 Tính Năng Nổi Bật

- 🤖 **Quản lý đa tài khoản (Multi-Account & Multi-Bot)**:
  - Treo đồng thời nhiều tài khoản Avatar với các bản Mod độc lập.
  - Tự động phân luồng Server (Hoàn Mỹ / Diệu Kỳ) và kiểm soát giới hạn tài khoản an toàn (`ServerLimitRule`: tối đa 3 acc/server/IP).
  - Tự động phục hồi trạng thái treo bot khi khởi động lại server (`autoRestart` & `autoStart`).

- 🎮 **Hỗ trợ đầy đủ các bản Mod & Tính năng Auto**:
  - 🐟 **Auto Up Câu Cá**: Tự động quăng cần, giật cá, chọn loại mồi, loại cần, khu câu, bán cá, rút xu.
  - 🌾 **Auto Farm**: Tự động chăm sóc cây trồng, tưới nước, bắt sâu, thu hoạch, chăm sóc thú nuôi, ấp rồng, nâng cấp cây khế, tự động trả order đơn hàng nông trại.
  - 💎 **Auto Up Kim Cương (Đào Mỏ)**: Tự động đào mỏ theo chu kỳ, đổi vé, bán quặng khi đầy rương, về farm chăm sóc.
  - 🪨 **Auto Bán Đá & Ngọc (Thợ Kim Hoàn)**: Tự động di chuyển bán KCX / NHB theo khu vực, thời gian cấu hình và quãng nghỉ.
  - 💰 **Cài Đặt Up Thuê**: Cấu hình mục tiêu xu cần up, số ngày up thuê, tự động dừng hoặc reset khi đạt mốc.

- 🖼️ **Dual-Canvas Character Avatar Engine**:
  - Tự động trích xuất đồ họa nhân vật thời gian thực từ game Avatar 2D.
  - Xử lý nền trong suốt bằng thuật toán lọc màu vi sai (**Dual-Canvas Differential Keying**), loại bỏ viền màu tím/hồng, bảo toàn màu trắng `#FFFFFF` (mắt, cánh, trang phục) và màu đen `#000000` ở cả chế độ Sáng (Light Mode) và Tối (Dark Mode).

- 🌐 **Web Dashboard Real-time (Live Terminal & SSE)**:
  - Xem trực tiếp nhật ký log game của từng bot theo thời gian thực qua Server-Sent Events (SSE).
  - Thống kê tài sản (Xu, Lượng, Lượng khóa), xu kiếm được, tim thu hoạch, thời gian online (Uptime), CPU & RAM.
  - Thiết kế sang trọng theo phong cách Porsche & Apple Liquid Glass, hỗ trợ 100% Vector Icons và Responsive toàn diện.

- 🔌 **Proxy Pool & 3-Attempt Resilient Checking**:
  - Tích hợp công cụ kiểm tra Proxy 3 lần liên tiếp có độ trễ (`ProxyChecker.js`), tránh phán đoán sai khi mạng chập chờn.
  - Hỗ trợ cả Proxy SOCKS5 và HTTP, gán riêng cho từng tài khoản hoặc từng tệp cấu hình bot.

- 🛡️ **Bảo Mật & Quản Lý Môi Trường**:
  - Mã hóa mật khẩu tài khoản và mật khẩu bảng điều khiển bằng thuật toán **AES-256-CBC** trong [config.json](config.json).
  - Quản lý cấu hình nhạy cảm qua file môi trường `.env.development` và `.env.production`.
  - Phân quyền bảo vệ Web Dashboard bằng mã PIN/mật khẩu an toàn.

- ⚡ **Zero-Dependency Core & Portable JRE 17**:
  - Không cần cài đặt các thư viện npm nặng nề, sử dụng 100% Core API Node.js chuẩn.
  - Tích hợp công cụ tải và cài đặt **Portable OpenJDK 17 Linux x64** tự động trên cPanel chỉ với 1 click không cần quyền root.

---

## 📁 Cấu Trúc Dự Án (Clean Architecture)

```text
test-cpanel-avatar/
├── .env.development            # Cấu hình biến môi trường Development
├── .env.production             # Cấu hình biến môi trường Production
├── .env.example                # Mẫu khai báo biến môi trường
├── config.example.json         # Cấu hình mẫu mặc định (dùng để tự sinh config.json)
├── config.json                 # Cấu hình bot thực tế (được mã hóa tự động, nằm trong .gitignore)
├── package.json                # Scripts & thông tin dự án
├── server.js                   # Điểm khởi chạy chính (Server Entrypoint)
├── app.js                      # Wrapper khởi động dành riêng cho cPanel Setup Node.js App
│
├── docs/                       # Tài liệu hướng dẫn & thiết kế
│   ├── CPANEL_DEPLOYMENT.md    # Hướng dẫn chi tiết triển khai lên cPanel Hosting
│   └── DESIGN.md               # Đặc tả thiết kế giao diện Porsche & Apple Liquid Glass
│
├── data/                       # Thư mục lưu trữ dữ liệu người dùng & bot
│   ├── rms/                    # Lưu trữ RMS của từng tài khoản theo RMS Mode
│   └── cache/                  # Bộ nhớ tạm & log hệ thống
│
├── jars/                       # Quản lý các tệp thực thi Java
│   ├── emulator/               # Chứa giả lập AngelChip (AngelChipEmulator_V2Proxy.jar)
│   └── games/                  # Chứa các bản mod game Avatar (avatar_fish_build40.jar, ...)
│
├── src/                        # Kiến trúc phân tầng Clean Architecture
│   ├── domain/                 # Domain Entities & Quy tắc nghiệp vụ (Rules)
│   │   ├── entities/           # Account, BotProfile, Proxy
│   │   └── rules/              # ServerLimitRule
│   │
│   ├── application/            # Use Cases & Application Services
│   │   └── services/           # MultiBotManager, ProxyService, FileProfileService
│   │
│   ├── infrastructure/         # Tầng hạ tầng, xử lý I/O, tiến trình và bảo mật
│   │   ├── logging/            # SseEventBus (Server-Sent Events)
│   │   ├── persistence/        # ConfigRepository (Mã hóa & lưu trữ atomic)
│   │   ├── process/            # JavaDetector, SingleBotProcess
│   │   ├── network/            # ProxyChecker (3-Attempt Retry)
│   │   ├── security/           # EncryptionService (AES-256-CBC)
│   │   └── storage/            # RmsWriter (Đồng bộ tài khoản & cài đặt mod vào RMS)
│   │
│   └── interfaces/             # Tầng giao diện điều khiển API & HTTP Server
│       └── http/
│           ├── HttpServer.js   # HTTP Server định tuyến không phụ thuộc framework
│           └── controllers/    # BotController, AccountController, FileController, ProxyController, SystemController
│
├── public/                     # Giao diện Web Dashboard (Frontend React + Vanilla CSS)
│   ├── index.html              # HTML Shell nạp tài nguyên
│   ├── style.css               # CSS chính
│   └── src/
│       ├── App.jsx             # Root React Component
│       ├── api/api.js          # API Client giao tiếp backend
│       ├── components/         # Header, BotSection, AccountCard, Terminal, Modals...
│       └── styles/             # Modular CSS từng thành phần (accounts.css, terminal.css, ...)
│
└── utils/                      # Tiện ích môi trường & trình quản lý JRE
    ├── envLoader.js            # Trình nạp biến môi trường nhẹ không phụ thuộc dotenv
    └── jreManager.js           # Trình tải và giải nén Portable JRE 17
```

---

## 🛠️ Hướng Dẫn Cài Đặt & Chạy Cục Bộ (Localhost)

### 1. Yêu cầu hệ thống
- **Node.js**: Phiên bản `>= 18.x` hoặc `>= 20.x`.
- **Java**: Đã cài đặt JDK / JRE 8 trở lên (khuyến nghị Java 17 hoặc 21).

### 2. Khởi chạy ứng dụng
```bash
# Chạy ở môi trường Development (.env.development)
npm run dev

# Chạy ở môi trường Production (.env.production)
npm run prod

# Hoặc chạy thông thường
npm start
```

Mở trình duyệt tại: **`http://localhost:3001`** (hoặc port cấu hình trong file `.env`).

---

## 🌐 Triển Khai Lên cPanel Hosting

Xem hướng dẫn chi tiết từng bước tại [docs/CPANEL_DEPLOYMENT.md](docs/CPANEL_DEPLOYMENT.md).

Tóm tắt các bước:
1. Nén thư mục dự án thành file `.zip` (trừ `node_modules`, `config.json`, `.git`).
2. Tải lên cPanel qua **File Manager** và giải nén.
3. Vào **Setup Node.js App** $\rightarrow$ Tạo ứng dụng mới với Startup file là `app.js`.
4. Mở URL Web Dashboard $\rightarrow$ Nhấn **`⚡ Tự động tải & cài đặt Portable Java 17`** (nếu máy chủ chưa có Java).
5. Thêm tài khoản và bắt đầu treo 24/7!

---

## 🔐 Bảo Mật & Quản Lý Mật Khẩu

- **Khóa bí mật (`APP_SECRET`)**: Được đặt trong file `.env.development` và `.env.production`. Tuyệt đối không chia sẻ chuỗi này.
- **Tự động mã hóa**: Khi thêm tài khoản mới hoặc lưu cấu hình từ Web Dashboard, mật khẩu tài khoản và mã PIN sẽ tự động được mã hóa dưới dạng `enc:<iv>:<ciphertext>` trước khi ghi xuống `config.json`.
- **An toàn mã nguồn**: File `config.json` và các file `.env` đã được cấu hình trong `.gitignore` để tránh rò rỉ thông tin nhạy cảm khi đẩy lên Git.

---

## 📜 Giấy Phép (License)

Dự án được phân phối dưới giấy phép [MIT License](LICENSE).
