# Production Deployment & Environment Guide

> Step-by-step operations manual for deploying Avatar Multi-Bot Manager across cPanel Hosting, Linux VPS (Ubuntu/Debian), and Windows local development.

---

## 1. Platform Comparison & Architecture

| Platform | Process Manager | Java Runtime | Persistence Mechanism | Typical Use Case |
| :--- | :--- | :--- | :--- | :--- |
| **cPanel Shared/Cloud** | Phusion Passenger | Portable OpenJDK 17 (No root) | Continuous HTTP Listener | Low-cost 24/7 web hosting |
| **Linux VPS (Ubuntu/Debian)** | Systemd / PM2 | System OpenJDK 17 | Native System Daemon | Enterprise multi-bot farm |
| **Windows Workstation** | Node CLI / Terminal | Installed JDK 17 | Developer Terminal | Local mod testing & development |

---

## 2. Deploying on cPanel via "Setup Node.js App"

cPanel's **Setup Node.js App** (powered by CloudLinux and Phusion Passenger) allows hosting Node.js applications on shared and reseller hosting without root privileges.

### Step 1: Upload Source Code
1. Exclude `node_modules/`, `.git/`, and local temporary files.
2. Compress the project folder into a `.zip` archive (e.g. `avatar-bot.zip`).
3. In cPanel $\rightarrow$ Open **File Manager** $\rightarrow$ Upload and extract into your application directory (e.g., `/home/username/avatar-bot`).

### Step 2: Configure Application in cPanel
1. Navigate to **Software** $\rightarrow$ **Setup Node.js App**.
2. Click **Create Application**:
   * **Node.js version**: Select `18.x`, `20.x`, or higher.
   * **Application mode**: `Production`.
   * **Application root**: `avatar-bot`.
   * **Application URL**: Select your domain or subdomain (e.g., `bot.yourdomain.com`).
   * **Application startup file**: `app.js` *(Crucial: Phusion Passenger loads `app.js`)*.
3. Click **Create**.

### Step 3: Install Dependencies
Click **Run NPM Install** in the cPanel Node.js interface, or enter the virtual environment via SSH:
```bash
source /home/username/nodevenv/avatar-bot/20/bin/activate
cd /home/username/avatar-bot
npm install --omit=dev
```

### Step 4: Portable OpenJDK 17 Setup (Zero Root Required)
If the hosting server does not have Java 17 installed globally, install a standalone user-space OpenJDK:

```bash
# In your project root on cPanel terminal:
mkdir -p .jre && cd .jre
wget https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.10%2B7/OpenJDK17U-jre_x64_linux_hotspot_17.0.10_7.tar.gz
tar -xzf OpenJDK17U-jre_x64_linux_hotspot_17.0.10_7.tar.gz --strip-components=1
rm OpenJDK17U-jre_x64_linux_hotspot_17.0.10_7.tar.gz
```

Set the path in `.env.production`:
```env
JAVA_HOME=/home/username/avatar-bot/.jre
```

---

## 3. Deploying on Linux VPS (Ubuntu 22.04 / Debian 12)

### Step 1: System Prerequisites
```bash
sudo apt update && sudo apt install -y curl git openjdk-17-jre-headless xvfb
curl -fsSL https://deb.nodesource.com/setup_20.x | sudo -E bash -
sudo apt install -y nodejs
```

### Step 2: Clone & Configure
```bash
cd /opt
git clone https://github.com/hoangbmt023/auto-server-manager-avatar2d-angleChip.git avatar-bot
cd avatar-bot
npm install --omit=dev
cp .env.example .env.production
nano .env.production
```

### Step 3: Systemd Daemon Configuration
Create a service definition at `/etc/systemd/system/avatar-bot.service`:

```ini
[Unit]
Description=Avatar Multi-Bot Manager & Automation Platform
After=network.target mysql.service

[Service]
Type=simple
User=www-data
WorkingDirectory=/opt/avatar-bot
Environment=NODE_ENV=production
ExecStart=/usr/bin/node server.js
Restart=always
RestartSec=5
LimitNOFILE=65535
LimitNPROC=4096

[Install]
WantedBy=multi-user.target
```

Enable and start the service:
```bash
sudo systemctl daemon-reload
sudo systemctl enable avatar-bot
sudo systemctl start avatar-bot
sudo systemctl status avatar-bot
```

---

## 4. JVM Memory & Process Tuning for Constrained Environments

When running dozens of Java processes under CloudLinux LVE or VPS memory limits, untuned JVM instances will quickly consume all physical RAM and trigger the OS killer or `spawn EAGAIN` errors.

> [!TIP]
> **Recommended Production JVM Flags:**  
> The system automatically applies low-footprint JVM flags via `SingleBotProcess.js`:
> ```bash
> -Xms32m -Xmx64m -XX:+UseSerialGC -Djava.awt.headless=true
> ```
> * `-Xms32m -Xmx64m`: Restricts heap allocation to 64MB maximum (Avatar 2D client requires less than 28MB heap).
> * `-XX:+UseSerialGC`: Minimizes garbage collector thread overhead, reducing host CPU usage by over 40% compared to G1GC when running multiple concurrent bots.
> * `-Djava.awt.headless=true`: Prevents Java from loading unnecessary X11 graphic libraries into host memory.

---

## 5. Reverse Proxy Configuration for Real-time SSE

When running behind Nginx or LiteSpeed, you must disable response buffering for the Server-Sent Events stream. Otherwise, terminal logs and payment alerts will be held in proxy buffers and never reach the browser in real time.

### Nginx Configuration

```nginx
server {
    server_name bot.yourdomain.com;

    location / {
        proxy_pass http://127.0.0.1:3001;
        proxy_http_version 1.1;
        proxy_set_header Upgrade $http_upgrade;
        proxy_set_header Connection 'upgrade';
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
    }

    # Dedicated SSE Route: Disable all buffering
    location /api/bot/logs/stream {
        proxy_pass http://127.0.0.1:3001;
        proxy_http_version 1.1;
        proxy_set_header Connection '';
        proxy_buffering off;
        proxy_cache off;
        chunked_transfer_encoding off;
        proxy_read_timeout 86400s;
        proxy_send_timeout 86400s;
    }
}
```

### LiteSpeed / cPanel `.htaccess`

On cPanel hosting with LiteSpeed Web Server, add the following to your public root `.htaccess`:

```apache
<IfModule mod_rewrite.c>
    RewriteEngine On
    # Disable LiteSpeed output buffering on SSE stream
    RewriteRule ^api/bot/logs/stream$ - [E=no-gzip:1]
</IfModule>
```

---

## 6. Comprehensive Environment Variable Matrix (`.env`)

| Variable | Type | Default Value | Required | Description |
| :--- | :--- | :--- | :--- | :--- |
| `NODE_ENV` | `string` | `development` | Yes | Runtime environment (`development` / `production`) |
| `PORT` | `number` | `3001` | Yes | HTTP port listener |
| `DB_HOST` | `string` | `localhost` | Yes | MySQL server hostname or IP |
| `DB_PORT` | `number` | `3306` | Yes | MySQL port |
| `DB_USER` | `string` | `root` | Yes | MySQL username |
| `DB_PASSWORD` | `string` | `""` | Yes | MySQL password |
| `DB_NAME` | `string` | `avatar_2d_bot_manager` | Yes | Target database name |
| `DB_CONNECTION_LIMIT` | `number` | `10` | No | Connection pool capacity |
| `APP_SECRET` | `string` | Random 32 chars | Yes | Secret encryption key for tokens & sessions |
| `JWT_SECRET` | `string` | Random 32 chars | Yes | Secret key for signing JWT authorization tokens |
| `JWT_EXPIRES_IN` | `string` | `24h` | No | JWT access token lifespan |
| `JAVA_HOME` | `string` | System Path | No | Custom path to standalone JRE / JDK installation |
| `PAYOS_ENABLED` | `boolean` | `false` | No | Enable payOS 24/7 bank transfer integration |
| `PAYOS_CLIENT_ID` | `string` | `""` | Optional | payOS merchant client identifier |
| `PAYOS_API_KEY` | `string` | `""` | Optional | payOS merchant API key |
| `PAYOS_CHECKSUM_KEY` | `string` | `""` | Optional | payOS HMAC-SHA256 checksum verification key |
| `BANK_NAME` | `string` | `MBBank` | Optional | Beneficiary bank name displayed on payment QR |
| `BANK_ACCOUNT_NUMBER`| `string` | `""` | Optional | Beneficiary bank account number |
| `BANK_ACCOUNT_NAME` | `string` | `""` | Optional | Beneficiary account holder name |
| `PROXY_VN_ENABLED` | `boolean` | `true` | No | Enable on-demand proxy auto-purchase via proxy.vn |
| `PROXY_VN_API_KEY` | `string` | `""` | Optional | API key for authenticating with proxy.vn |
| `CORS_ALLOWED_ORIGINS`| `string` | `*` (Dev) | No | Comma-separated list of allowed origins |
