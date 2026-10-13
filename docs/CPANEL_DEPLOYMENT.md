# 🚀 Deploying Avatar Multi-Bot Manager on cPanel (Node.js)

> Step-by-step production deployment guide for running 24/7 background bots on shared or VPS cPanel hosting via Setup Node.js App.

---

## 🌟 Overview

This application functions as a **Node.js Web Wrapper & Clean Architecture Engine**. It wraps the AngelChip MicroEmulator (`.jar`) and Avatar 2D mod binaries into a persistent background web service. By binding an HTTP server to the assigned cPanel port, **Phusion Passenger** keeps the Node.js process alive 24/7 without being killed by idle worker timeouts.

---

## ✨ Key Capabilities on cPanel

1. **24/7 Background Persistence**: Continuous HTTP listener prevents Passenger from recycling or terminating background bots.
2. **Real-time Live Terminal (SSE)**: Stream real-time in-game logs, coin metrics, uptime, CPU, and RAM via Server-Sent Events.
3. **Auto-Recovery on Server Reboot**: Automatically re-launches all previously running bots on server start (`autoStart` & `autoRestart`).
4. **1-Click Portable OpenJDK 17 (Linux x64)**: Download and extract a fully self-contained Java 17 runtime directly inside your user directory without requiring root / sudo access.
5. **Proxy Pool with 3-Attempt Retry**: Eliminate false-positive offline alerts with built-in SOCKS5 and HTTP proxy validation.
6. **Zero External Runtime Dependencies**: Built with 100% native Node.js core libraries; no complex native build tools required.

---

## 🛠️ Step-by-Step Deployment Instructions

### Step 1: Prepare Source Code Archive
1. Exclude `node_modules/`, `.git/`, and local log files.
2. Compress the project folder into a `.zip` archive (e.g., `avatar-bot-cpanel.zip`).

---

### Step 2: Upload to cPanel & Extract
1. Log in to your cPanel control panel $\rightarrow$ Open **File Manager**.
2. Navigate to your desired application directory (e.g., `/home/username/avatar-bot`).
3. Click **Upload** and upload `avatar-bot-cpanel.zip`.
4. Right-click the uploaded `.zip` and select **Extract**.

---

### Step 3: Create Application in "Setup Node.js App"
1. In cPanel, navigate to **Software** $\rightarrow$ **Setup Node.js App**.
2. Click **Create Application**:
   - **Node.js version**: Select `18.x`, `20.x`, or higher.
   - **Application mode**: Select `Production`.
   - **Application root**: Enter the folder path where files were extracted (e.g., `avatar-bot`).
   - **Application URL**: Select your domain or subdomain (e.g., `bot.yourdomain.com`).
   - **Application startup file**: Enter `app.js` *(Crucial: cPanel Passenger expects `app.js`)*.
3. Click **Create**.

---

### Step 4: Configure Database & Environment (`.env.production`)
1. Create a MySQL database and user in cPanel via **MySQL Databases**.
2. Open **File Manager**, locate `.env.production` in your application root, and configure your database credentials:
   ```env
   NODE_ENV=production
   PORT=3001
   APP_SECRET=your_super_secret_32_character_key

   DB_HOST=localhost
   DB_PORT=3306
   DB_USER=cpanel_db_user
   DB_PASSWORD=cpanel_db_password
   DB_NAME=cpanel_avatar_bot_manager

   CORS_ALLOWED_ORIGINS=https://bot.yourdomain.com
   MAX_PAYLOAD_SIZE_MB=5
   ```

---

### Step 5: Install Dependencies & Run Database Migrations
1. In **Setup Node.js App**, copy the virtual environment enter command shown at the top (e.g., `source /home/username/nodevenv/avatar-bot/20/bin/activate`).
2. Open **Terminal** in cPanel (or connect via SSH), paste the command, and run:
   ```bash
   npm install --production
   ```
3. Restart the application by clicking **Restart** in the Node.js App manager.
4. On startup, the built-in **Code-First Database Migrator** will automatically create all necessary MySQL tables (`users`, `accounts`, `proxies`, `bot_files`, `system_settings`) and seed initial defaults.

---

### Step 6: Install Portable Java 17 (No Root Required)
If your cPanel hosting does not have Java installed:
1. Open your Dashboard URL in your browser: `https://bot.yourdomain.com`.
2. Open **Settings** $\rightarrow$ Click **⚡ Install Portable OpenJDK 17**.
3. The system will automatically download, unpack, and set up `OpenJDK 17 (Linux x64)` inside the `jars/` directory.

---

### Step 7: Add Accounts & Start 24/7 Automation!
1. Click **+ Add Account** to configure your username, server (Hoan My / Dieu Ky), and proxy.
2. Customize features (Auto Fishing, Auto Farm, Diamond Mining, Gemstone Selling).
3. Click **Start** to spawn the bot instance. Monitor real-time logs directly in the Live Terminal.

---

## 🔒 Security Best Practices

* **Strong Password**: Set a dashboard access password in Settings to protect your endpoints.
* **Keep Secrets Safe**: Ensure `.env.production` file permissions are set to `600` (readable only by your user).
* **Environment Protection**: Never commit production credentials to public version control repositories.
