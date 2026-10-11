# 🐟 HƯỚNG DẪN TREO BOT AVATAR TRÊN CPANEL QUA NODE.JS

Ứng dụng này được thiết kế theo mô hình **Node.js Web Wrapper**, giúp biến 2 file JAR (`AngelChipEmulator_V2Proxy.jar` và `avatar_fish_build40.jar`) thành một ứng dụng Web chạy ngầm liên tục trên **cPanel** (thông qua mục **"Cài đặt Node.js ứng dụng"**), kèm theo giao diện Web Dashboard quản lý trực quan.

---

## 🚀 TÍNH NĂNG NỔI BẬT

1. **Chạy ngầm 24/7 trên cPanel**: Tạo Web Server lắng nghe HTTP để Passenger trên cPanel không kill tiến trình.
2. **Web Dashboard thời gian thực (Live Terminal)**: Xem trực tiếp nhật ký log của emulator, trạng thái kết nối, PID, thời gian treo (Uptime).
3. **Bộ điều khiển bot**: Bắt đầu (Start), Dừng (Stop), Khởi động lại (Restart), Tự động bật lại khi bot crash (`autoRestart`).
4. **Tự động cài đặt Portable Java (Linux x64)**: Tải và giải nén OpenJDK 17 Portable trực tiếp vào hosting chỉ với 1 click mà không cần quyền root server.
5. **Lưu phiên đăng nhập RMS**: Hỗ trợ lưu trữ RMS ra file theo từng `--appid` để giữ nick và cài đặt trong game.
6. **Hỗ trợ Proxy**: Tùy chỉnh SOCKS5 / HTTP Proxy trực tiếp trên giao diện Dashboard.
7. **Bảo mật**: Tùy chọn đặt mật khẩu PIN bảo vệ Web Dashboard.
8. **Không cần npm install**: Viết bằng 100% thư viện chuẩn của Node.js, không phụ thuộc package ngoài.

---

## 📦 CẤU TRÚC THƯ MỤC CHUẨN KIẾN TRÚC

```text
cpanel-avatar-bot-manager/
├── app.js                          (Entrypoint khởi động cho cPanel Node.js)
├── server.js                       (Server Bootstrap nạp HTTP Server)
├── config.json                     (Cấu hình bot, proxy, RMS, mật khẩu)
├── package.json                    (Thông tin ứng dụng Node.js & script build Java)
├── jars/                           (Thư mục chứa JAR giả lập & JAR game mod)
│   ├── emulator/
│   │   └── AngelChipEmulator_V2Proxy.jar
│   └── games/
│       ├── avatar_upxu_build34.jar
│       ├── avatar_fish_build40.jar
│       └── Avatar_ChipMix_Full_build13.jar
├── java-engine/                    (Module Java Engine Native)
│   ├── src/                        (Mã nguồn Java Headless Launcher & Schemas)
│   └── bin/                        (Bytecode .class đã biên dịch)
├── src/                            (Backend Clean Architecture - Node.js Core)
│   ├── domain/                     (Entities, Repositories, Rules)
│   ├── application/                (Services, Use Cases)
│   ├── infrastructure/             (Process, Persistence, Network, Logging)
│   └── interfaces/                 (HTTP Server, Controllers, Declarative Routes)
├── public/                         (Frontend React Clean Architecture)
│   ├── index.html
│   ├── style.css
│   └── src/                        (Contexts, Hooks, Components, Pages)
└── utils/                          (Tương thích ngược & bootstrap)
```

---

## 🛠 CÁC BƯỚC TRIỂN KHAI LÊN CPANEL

### 🔹 Bước 0: Đăng nhập & Lưu cấu hình nick trên Windows
Vì trên server Linux cPanel chạy ở chế độ **không màn hình (Headless)**, bạn cần lưu thông tin đăng nhập và cài đặt auto 1 lần trên máy tính:

1. Chạy file `login_on_windows.bat` trên máy tính.
2. Giả lập sẽ hiện lên: Bạn tiến hành **nhập tài khoản, mật khẩu, tích chọn "Nhớ mật khẩu" / "Tự động đăng nhập"**, và cài đặt các tính năng auto câu cá / nông trại.
3. Tắt giả lập đi: Toàn bộ thông tin nick và cài đặt sẽ tự động lưu vào thư mục `.microemulator/` ngay trong thư mục này.

---

### 🔹 Bước 1: Nén toàn bộ thư mục thành file ZIP
Nén toàn bộ các file trong thư mục này (bao gồm cả thư mục `.microemulator` vừa tạo) thành `bot-avatar.zip`.

### 🔹 Bước 2: Tải lên cPanel & Giải nén
1. Đăng nhập vào cPanel $\rightarrow$ Mở mục **Trình quản lý tệp** (File Manager).
2. Tải file `bot-avatar.zip` lên thư mục gốc của bạn (ví dụ `/home/username/bot-avatar`).
3. Giải nén (Extract) ra thư mục `bot-avatar`.

### 🔹 Bước 3: Tạo ứng dụng Node.js trong cPanel
1. Trong cPanel, tìm mục **"Cài đặt Node.js ứng dụng"** (Setup Node.js App).
2. Nhấn nút **Create Application** (Tạo ứng dụng):
   - **Node.js version:** Chọn bản `18.x` hoặc `20.x` (bản nào có sẵn đều được).
   - **Application mode:** `Production`.
   - **Application root:** Nhập tên thư mục bạn vừa giải nén: `bot-avatar`.
   - **Application URL:** Chọn domain hoặc subdomain bạn muốn truy cập Dashboard.
   - **Application startup file:** Nhập `app.js`.
3. Bấm **Create**.

### 🔹 Bước 4: Mở Web Dashboard & Kích hoạt Bot
1. Nhấp vào đường dẫn **Application URL** vừa tạo để mở Web Dashboard.
2. **Nếu server chưa có Java**: Trên màn hình sẽ hiện thông báo màu vàng kèm nút:
   👉 **`⚡ Tự động cài Portable Java ngay`**
   *(Nhấn vào nút này, hệ thống sẽ tự động tải và giải nén bản OpenJDK 17 Linux x64 về hosting trong khoảng 1-2 phút)*.
3. Sau khi Java đã sẵn sàng, nhấn **`▶ Bắt Đầu Bot`** để bot câu cá bắt đầu hoạt động!
4. Theo dõi màn hình **Nhật Ký Hoạt Động (Live Terminal)** để xem kết quả chạy.

---

## ⚙️ CÁCH CHỈNH SỬA CẤU HÌNH (SETTINGS)

Nhấp vào biểu tượng ⚙️ ở góc phải trên cùng của Dashboard để:
* **Đổi tên Profile (App ID):** Đặt tên nick khác nhau để lưu các tài khoản khác nhau.
* **Cài đặt Proxy:** Điền IP:Port của Socks5/HTTP Proxy để fake IP khi treo nhiều acc.
* **Tự động chạy lại:** Tự bật bot khi server restart hoặc khi bot bị ngắt kết nối.
* **Đặt mật khẩu Web:** Đặt mật khẩu để người ngoài không thể bấm tắt/bật bot của bạn.
