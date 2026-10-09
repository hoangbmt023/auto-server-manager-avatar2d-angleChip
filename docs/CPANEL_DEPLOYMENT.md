# 🐟 HƯỚNG DẪN TRIỂN KHAI TREO BOT AVATAR TRÊN HOSTING CPANEL (NODE.JS)

Hệ thống được thiết kế theo mô hình **Node.js Web Wrapper & Clean Architecture**, biến giả lập AngelChip MicroEmulator và các bản Mod Avatar 2D (`avatar_fish_build40.jar`, `avatar_upxu_build34.jar`...) thành ứng dụng Web chạy ngầm liên tục 24/7 trên Hosting **cPanel (thông qua mục "Setup Node.js App")** kèm theo bảng điều khiển trực quan thời gian thực.

---

## 🚀 TÍNH NĂNG NỔI BẬT

1. **Chạy ngầm 24/7 trên cPanel**: Web Server Node.js lắng nghe HTTP liên tục để Phusion Passenger trên cPanel không kill tiến trình.
2. **Web Dashboard thời gian thực (Live Terminal)**: Xem trực tiếp log game từng bot, số dư Xu/Lượng, Uptime, CPU & RAM qua Server-Sent Events (SSE).
3. **Cơ chế Phục hồi tự động**: Tự động khôi phục toàn bộ các nick đang treo khi server restart (`autoStart` & `autoRestart`).
4. **Tự động cài đặt Portable OpenJDK 17 Linux x64**: Tải và giải nén Java 17 trực tiếp vào hosting chỉ với 1 click mà không cần quyền root server.
5. **Hệ thống Proxy Pool với 3-Attempt Retry**: Kiểm tra tự động 3 lần hạn chế báo lỗi giả, chống trùng IP, hỗ trợ cả SOCKS5 và HTTP Proxy.
6. **Bảo mật AES-256-CBC**: Mã hóa mật khẩu nick và mật khẩu bảo vệ Dashboard an toàn.
7. **Không cần npm install**: 100% Core Node.js thuần, không phát sinh lỗi dependency khi tải lên cPanel.

---

## 📦 CẤU TRÚC THƯ MỤC DỰ ÁN

```text
cpanel-avatar-bot/
├── app.js                          # Entrypoint cho cPanel Setup Node.js App
├── server.js                       # HTTP Server & API Clean Architecture
├── package.json                    # Metadata ứng dụng Node.js
├── config.example.json             # File mẫu cấu hình ban đầu
├── .env.example                    # File mẫu cấu hình biến môi trường
│
├── jars/                           # Quản lý file Java thực thi
│   ├── emulator/                   # Giả lập AngelChip (AngelChipEmulator_V2Proxy.jar)
│   └── games/                      # Bản Mod game (avatar_fish_build40.jar, avatar_upxu_build34.jar)
│
├── AvatarHeadlessLauncher.java     # Bộ điều phối chạy game không đầu (Headless)
├── AvatarModAdapter.java           # Adapter giao tiếp phản chiếu Mod game
├── ModSchema.java                  # Bảng ánh xạ Schema động cho từng bản Mod
│
├── src/                            # Kiến trúc Clean Architecture
│   ├── domain/                     # Domain Entities & Business Rules (ServerLimitRule)
│   ├── application/                # Use Cases & Services (MultiBotManager, ProxyService)
│   ├── infrastructure/             # Process, Security, Storage (RmsWriter, ProxyChecker)
│   └── interfaces/                 # HTTP Server & API Controllers
│
├── public/                         # Giao diện Web Dashboard (React + CSS Glassmorphism)
└── utils/                          # Tiện ích môi trường & JRE Portable Manager
```

---

## 🛠 CÁC BƯỚC TRIỂN KHAI LÊN CPANEL CHI TIẾT

### 🔹 Bước 1: Chuẩn bị tệp mã nguồn
1. Đảm bảo toàn bộ các file Java (`AvatarHeadlessLauncher.java`, `AvatarModAdapter.java`, `ModSchema.java`) đã được biên dịch sang `.class`.
2. Nén toàn bộ mã nguồn thư mục dự án thành file `.zip` (ví dụ `bot-avatar-cpanel.zip`).
   *(Lưu ý: Không nén file `config.json` chứa mật khẩu cá nhân lên git/kho lưu trữ chung)*.

---

### 🔹 Bước 2: Tải lên cPanel & Giải nén
1. Đăng nhập vào tài khoản cPanel của bạn $\rightarrow$ Mở mục **Trình quản lý tệp (File Manager)**.
2. Điều hướng đến thư mục muốn chạy bot (ví dụ `/home/username/bot-avatar`).
3. Tải file `.zip` lên và chọn **Extract (Giải nén)**.

---

### 🔹 Bước 3: Tạo ứng dụng Node.js trong cPanel
1. Trên trang chủ cPanel, tìm và nhấp vào mục **Setup Node.js App** (hoặc *Cài đặt ứng dụng Node.js*).
2. Nhấn **Create Application** (Tạo ứng dụng):
   - **Node.js version:** Chọn phiên bản `18.x`, `20.x` hoặc `22.x` (khuyến nghị `20.x`).
   - **Application mode:** Chọn `Production`.
   - **Application root:** Nhập tên thư mục bạn vừa giải nén: `bot-avatar`.
   - **Application URL:** Chọn tên miền hoặc subdomain để truy cập Web Dashboard.
   - **Application startup file:** Nhập `app.js`.
3. Nhấn nút **Create** ở góc phải trên cùng.

---

### 🔹 Bước 4: Cài đặt Java 17 & Bắt đầu Treo Bot
1. Nhấp vào đường dẫn **Application URL** để mở giao diện Web Dashboard trên trình duyệt.
2. **Nếu hosting chưa có Java**: Dashboard sẽ hiển thị cảnh báo kèm nút:
   👉 **`⚡ Tự động tải & cài đặt Portable Java 17 (Linux x64)`**
   *(Hệ thống sẽ tự động tải OpenJDK 17 về hosting trong 30–60 giây)*.
3. Thêm tài khoản game, gán File cấu hình và Proxy (nếu có).
4. Nhấn nút **`▶ Treo Nick`** để bot bắt đầu đăng nhập và chạy 24/7!

---

## ⚙️ CÁC CÀI ĐẶT NÂNG CAO TRÊN DASHBOARD

* **Quản Lý Proxy Pool**: Thêm danh sách Proxy SOCKS5/HTTP để treo nhiều nick khác dải IP an toàn (mỗi Proxy tối đa 6 nick).
* **Tự Khôi Phục (`autoStart`)**: Tích chọn trong phần Cài đặt để bot tự động khôi phục toàn bộ tài khoản khi server khởi động lại.
* **Mật Khẩu Bảng Điều Khiển (PIN)**: Thiết lập mã khóa bảo vệ để ngăn chặn người ngoài truy cập Dashboard.
