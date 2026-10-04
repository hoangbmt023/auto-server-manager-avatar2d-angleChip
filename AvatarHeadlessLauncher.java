import javax.microedition.midlet.MIDlet;
import org.microemu.MIDletBridge;

/**
 * AvatarHeadlessLauncher
 * 
 * Chương trình khởi chạy và giám sát tự động Headless MicroEmulator cho Avatar.
 * Toàn bộ logic giao tiếp và thích ứng với các bản mod (Mod Up Xu, Mod Fish)
 * được ủy quyền xử lý qua lớp trung gian AvatarModAdapter.
 */
public class AvatarHeadlessLauncher {

    private static volatile boolean hasPermanentError = false;
    private static volatile long lastLoginAttemptTime = 0;
    private static volatile String activeJarPath = "";

    public static boolean checkAndRestoreGameJar(String jarPath) {
        if (jarPath == null || jarPath.trim().isEmpty()) jarPath = activeJarPath;
        if (jarPath == null || jarPath.trim().isEmpty()) jarPath = "avatar_upxu_build34.jar";

        try {
            java.io.File targetFile = new java.io.File(jarPath);
            if (targetFile.exists() && targetFile.length() > 200000L) {
                System.out.println("✅ [KIỂM TRA FILE JAR]: File game [" + targetFile.getName() + "] tồn tại nguyên vẹn (" + (targetFile.length() / 1024) + " KB).");
                return true;
            }

            System.err.println("⚠️ [CẢNH BÁO MẤT/LỖI FILE]: File game [" + jarPath + "] không tồn tại hoặc bị hỏng. Đang tự động nạp lại từ bản gốc...");
            java.io.File parentDir = targetFile.getParentFile() != null ? targetFile.getParentFile() : new java.io.File(".");
            String[] fallbackJars = new String[] { "avatar_upxu_build34.jar", "avatar_fish_build40.jar" };

            for (String fb : fallbackJars) {
                java.io.File fbFile = new java.io.File(parentDir, fb);
                if (!fbFile.exists()) fbFile = new java.io.File(fb);

                if (fbFile.exists() && fbFile.length() > 200000L && !fbFile.getAbsolutePath().equalsIgnoreCase(targetFile.getAbsolutePath())) {
                    java.nio.file.Files.copy(fbFile.toPath(), targetFile.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("✅ [NẠP LẠI THÀNH CÔNG]: Đã tự động khôi phục và nạp lại file [" + targetFile.getName() + "] từ [" + fbFile.getName() + "]!");
                    return true;
                }
            }
        } catch (Throwable t) {
            System.err.println("❌ [LỖI NẠP FILE JAR]: " + t.getMessage());
        }
        return false;
    }

    public static void setupProxyAuthenticator() {
        try {
            final String socksHost = System.getProperty("socksProxyHost");
            final String socksPort = System.getProperty("socksProxyPort");
            final String httpHost = System.getProperty("http.proxyHost");
            final String httpPort = System.getProperty("http.proxyPort");

            final String avatarHost = System.getProperty("avatar.proxyHost");
            final String avatarPort = System.getProperty("avatar.proxyPort");
            final String avatarType = System.getProperty("avatar.proxyType");

            final String socksUser = System.getProperty("java.net.socks.username");
            final String socksPass = System.getProperty("java.net.socks.password");
            final String httpUser = System.getProperty("http.proxyUser");
            final String httpPass = System.getProperty("http.proxyPassword");

            final String avatarUser = System.getProperty("avatar.proxyUser");
            final String avatarPass = System.getProperty("avatar.proxyPass");

            final String finalUser = (avatarUser != null && !avatarUser.isEmpty()) ? avatarUser : 
                                    ((socksUser != null && !socksUser.isEmpty()) ? socksUser : httpUser);
            final String finalPass = (avatarPass != null && !avatarPass.isEmpty()) ? avatarPass : 
                                    ((socksPass != null && !socksPass.isEmpty()) ? socksPass : httpPass);

            String proxyHost = (avatarHost != null && !avatarHost.isEmpty()) ? avatarHost :
                               ((socksHost != null && !socksHost.isEmpty()) ? socksHost : httpHost);
            String proxyPort = (avatarPort != null && !avatarPort.isEmpty()) ? avatarPort :
                               ((socksPort != null && !socksPort.isEmpty()) ? socksPort : httpPort);

            if (proxyHost != null && !proxyHost.isEmpty()) {
                int pPort = 1080;
                try { pPort = Integer.parseInt(proxyPort); } catch (Exception ignored) {}
                String typeStr = (avatarType != null && !avatarType.isEmpty()) ? avatarType.toUpperCase() : "SOCKS";
                String nonProxyHosts = "angelchip.net|*.angelchip.net";

                // 1. Áp dụng các thuộc tính JVM chuẩn của AngelChip Emulator
                System.setProperty("java.net.useSystemProxies", "true");
                System.setProperty("http.nonProxyHosts", nonProxyHosts);
                System.setProperty("https.nonProxyHosts", nonProxyHosts);
                System.setProperty("socksProxyHost", proxyHost);
                System.setProperty("socksProxyPort", String.valueOf(pPort));

                // 2. Ghi trực tiếp cấu hình vào Config của bản giả lập MicroEmulator (angelchip_config2.xml)
                try {
                    org.microemu.app.Config.setProxy(true, proxyHost, pPort, finalUser != null ? finalUser : "", finalPass != null ? finalPass : "", nonProxyHosts);
                    System.out.println("💾 [GIẢ LẬP ANGELCHIP]: Đã đồng bộ cấu hình Proxy vào Config giả lập!");
                } catch (Throwable t) {
                    System.err.println("⚠️ [CONFIG PROXY ERR]: " + t.getMessage());
                }

                // 3. Khởi tạo Authenticator
                if (finalUser != null && !finalUser.isEmpty()) {
                    System.out.println("🌐 [PROXY SETUP]: Đang kích hoạt Proxy [" + typeStr + "://" + proxyHost + ":" + pPort + "] với tài khoản [" + finalUser + "]...");
                    System.setProperty("java.net.socks.username", finalUser);
                    System.setProperty("java.net.socks.password", finalPass != null ? finalPass : "");

                    boolean akSuccess = false;
                    try {
                        Class<?> akCls = Class.forName("ak");
                        java.lang.reflect.Constructor<?> ctor = akCls.getConstructor(String[].class);
                        String[] proxyArr = new String[] { proxyHost, String.valueOf(pPort), finalUser, finalPass != null ? finalPass : "", nonProxyHosts, "true" };
                        java.net.Authenticator.setDefault((java.net.Authenticator) ctor.newInstance((Object) proxyArr));
                        akSuccess = true;
                        System.out.println("✅ [PROXY SETUP]: Đã cài đặt Authenticator bản quyền của AngelChip (class ak) thành công!");
                    } catch (Throwable t) {
                        // Fallback
                    }

                    if (!akSuccess) {
                        java.net.Authenticator.setDefault(new java.net.Authenticator() {
                            @Override
                            protected java.net.PasswordAuthentication getPasswordAuthentication() {
                                return new java.net.PasswordAuthentication(finalUser, (finalPass != null ? finalPass : "").toCharArray());
                            }
                        });
                        System.out.println("✅ [PROXY SETUP]: Đã cài đặt Authenticator mặc định thành công!");
                    }
                } else {
                    System.out.println("🌐 [PROXY SETUP]: Đang sử dụng Proxy [" + typeStr + "://" + proxyHost + ":" + pPort + "] (Không mật khẩu)");
                }
            }
        } catch (Throwable t) {
            System.err.println("⚠️ [PROXY AUTH ERR]: " + t.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
            System.setErr(new java.io.PrintStream(System.err, true, "UTF-8"));
        } catch (Exception ignored) {}

        // Thiết lập Authenticator cho Proxy trước khi khởi động bất kỳ kết nối mạng nào
        setupProxyAuthenticator();

        if (args != null && args.length > 0) {
            activeJarPath = args[args.length - 1];
        }

        // Tự động kiểm tra file game ngay khi khởi động
        checkAndRestoreGameJar(activeJarPath);

        System.out.println("=================================================");
        System.out.println("🚀 AVATAR HEADLESS AUTO-LOGIN & ACCOUNT MANAGER");
        System.out.println("=================================================");

        String customUser = System.getProperty("avatar.user");
        String customPass = System.getProperty("avatar.pass");
        String customServer = System.getProperty("avatar.server");
        String[] defaultServers = new String[] { "Hoàn Mỹ", "Diệu Kỳ", "Huyền Diệu", "Thần Tiên", "Mộng Mơ", "Song Tử", "Bạch Dương" };
        String resolvedServerName = System.getProperty("avatar.serverName");

        int serverId = 0;
        if (customServer != null && !customServer.isEmpty()) {
            try {
                int sId = Integer.parseInt(customServer);
                serverId = sId;
                if (sId >= 0 && sId < defaultServers.length) {
                    resolvedServerName = defaultServers[sId];
                }
            } catch (Exception ignored) {}
        }

        final int finalServerId = serverId;
        final String finalServerName = (resolvedServerName != null && !resolvedServerName.isEmpty()) ? resolvedServerName : "Hoàn Mỹ";

        if (customUser != null && !customUser.isEmpty()) {
            System.out.println("-------------------------------------------------");
            System.out.println("  👤 TÀI KHOẢN (WEB): " + customUser);
            System.out.println("  🌐 SERVER   (WEB): " + finalServerName + (customServer != null ? " (ID: " + customServer + ")" : ""));
            System.out.println("  🔒 MẬT KHẨU (WEB): " + (customPass != null && !customPass.isEmpty() ? "****** (" + customPass.length() + " ký tự)" : "(Dùng mật khẩu đã lưu)"));
            String prxHost = System.getProperty("avatar.proxyHost");
            if (prxHost != null && !prxHost.isEmpty()) {
                System.out.println("  🛡️ PROXY    (NET): " + prxHost + ":" + System.getProperty("avatar.proxyPort") + " (" + System.getProperty("avatar.proxyType", "socks").toUpperCase() + ")");
            }
            System.out.println("-------------------------------------------------");
        }

        // 1. Thread nhận lệnh điều khiển thời gian thực từ Node.js (SETUP, RESET_DATA, START_AUTO, STOP_AUTO, ...)
        Thread stdinThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in, "UTF-8"));
                    String cmdLine;
                    while ((cmdLine = reader.readLine()) != null) {
                        cmdLine = cmdLine.trim();
                        if (cmdLine.startsWith("SETUP ")) {
                            String[] parts = cmdLine.split("\\s+");
                            int targetCoins = parts.length > 1 ? Integer.parseInt(parts[1]) : 0;
                            int upDays = parts.length > 2 ? Integer.parseInt(parts[2]) : 0;
                            AvatarModAdapter.applyUpThueSetup(targetCoins, upDays);
                        } else if (cmdLine.startsWith("FARM_SETTINGS ")) {
                            String jsonStr = cmdLine.substring(14).trim();
                            AvatarModAdapter.applyFarmSetup(jsonStr);
                        } else if (cmdLine.startsWith("DIAMOND_SETTINGS ")) {
                            String jsonStr = cmdLine.substring(17).trim();
                            AvatarModAdapter.applyDiamondSetup(jsonStr);
                        } else if (cmdLine.startsWith("FISH_SETTINGS ")) {
                            String jsonStr = cmdLine.substring(14).trim();
                            AvatarModAdapter.applyFishSetup(jsonStr);
                        } else if (cmdLine.startsWith("SELL_ORE_SETTINGS ") || cmdLine.startsWith("STONE_SETTINGS ")) {
                            String jsonStr = cmdLine.substring(cmdLine.indexOf(' ') + 1).trim();
                            AvatarModAdapter.applySellOreSetup(jsonStr);
                        } else if (cmdLine.startsWith("START_AUTO")) {
                            String[] parts = cmdLine.split("\\s+");
                            String autoType = parts.length > 1 ? parts[1] : "farm";
                            AvatarModAdapter.startAuto(autoType);
                        } else if (cmdLine.equals("STOP_AUTO") || cmdLine.startsWith("STOP_AUTO")) {
                            AvatarModAdapter.stopAuto();
                        } else if (cmdLine.equals("RESET_DATA") || cmdLine.equals("RESET")) {
                            AvatarModAdapter.resetUpThueData();
                        }
                    }
                } catch (Throwable ignored) {}
            }
        });
        stdinThread.setDaemon(true);
        stdinThread.start();

        // 2. Thread giám sát và tự động đăng nhập / tự động kết nối lại 24/7
        Thread supervisorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("[QUY TRÌNH] 1. Đang khởi động giả lập Avatar (chờ 8 giây)...");
                    Thread.sleep(8000);

                    // Nạp cấu hình Farm, Diamond, Fish, SellOre vào game & RMS ngay khi giả lập tải xong
                    String initFarmB64 = System.getProperty("avatar.farmSettingsB64");
                    if (initFarmB64 != null && !initFarmB64.isEmpty()) {
                        try {
                            byte[] decoded = java.util.Base64.getDecoder().decode(initFarmB64);
                            AvatarModAdapter.applyFarmSetup(new String(decoded, "UTF-8"));
                        } catch (Throwable ignored) {}
                    }

                    String initDiamondB64 = System.getProperty("avatar.diamondSettingsB64");
                    if (initDiamondB64 != null && !initDiamondB64.isEmpty()) {
                        try {
                            byte[] decoded = java.util.Base64.getDecoder().decode(initDiamondB64);
                            AvatarModAdapter.applyDiamondSetup(new String(decoded, "UTF-8"));
                        } catch (Throwable ignored) {}
                    }

                    String initFishB64 = System.getProperty("avatar.fishSettingsB64");
                    if (initFishB64 != null && !initFishB64.isEmpty()) {
                        try {
                            byte[] decoded = java.util.Base64.getDecoder().decode(initFishB64);
                            AvatarModAdapter.applyFishSetup(new String(decoded, "UTF-8"));
                        } catch (Throwable ignored) {}
                    }

                    String initSellOreB64 = System.getProperty("avatar.sellOreSettingsB64");
                    if (initSellOreB64 != null && !initSellOreB64.isEmpty()) {
                        try {
                            byte[] decoded = java.util.Base64.getDecoder().decode(initSellOreB64);
                            AvatarModAdapter.applySellOreSetup(new String(decoded, "UTF-8"));
                        } catch (Throwable ignored) {}
                    }

                    System.out.println("[QUY TRÌNH] 2. Bắt đầu kết nối & đăng nhập tài khoản...");
                    lastLoginAttemptTime = System.currentTimeMillis();
                    AvatarModAdapter.login(customUser, customPass, finalServerId, finalServerName);

                    boolean initialSetupApplied = false;
                    boolean isCurrentlyOnline = false;
                    AvatarModAdapter.AutoTaskInfo lastAutoTask = null;
                    String lastHandledDialog = "";

                    // Vòng lặp giám sát liên tục 24/7
                    while (true) {
                        Thread.sleep(2500);

                        if (hasPermanentError) {
                            Thread.sleep(5000);
                            continue;
                        }

                        // 2.0. Kiểm tra hoàn thành mục tiêu trực tiếp từ số liệu Mod trong RAM
                        if (AvatarModAdapter.isTargetReached()) {
                            isCurrentlyOnline = false;
                            AvatarModAdapter.PlayerStats s = AvatarModAdapter.extractPlayerStats();
                            System.out.println("🎉 [HOÀN THÀNH MỤC TIÊU]: Đã đạt mục tiêu up xu (" + s.earnedCoins + "/" + s.targetCoins + " xu, Số dư: " + s.coins + " xu)!");
                            System.out.println("[ACCOUNT_STATUS]: {\"state\":\"target_reached\",\"message\":\"Đã đạt yêu cầu up xu theo cài đặt!\",\"isTargetReached\":true,\"isCompleted\":true}");
                            AvatarModAdapter.dismissCurrentDialog();
                            AvatarModAdapter.stopModAuto();
                            Thread.sleep(2000);
                            System.exit(0);
                            return;
                        }

                        // 2.1. Kiểm tra thông báo từ Server / Mod (Popup Dialog)
                        String currentDialog = AvatarModAdapter.checkActiveGameDialog();
                        if (currentDialog != null && !currentDialog.trim().isEmpty() && !currentDialog.equals(lastHandledDialog)) {
                            lastHandledDialog = currentDialog;
                            System.out.println("[THÔNG BÁO TỪ GAME]: " + currentDialog);

                            String lower = currentDialog.toLowerCase();

                            // 0. Kiểm tra hoàn thành mục tiêu Up Xu / Hết hạn ngày Up từ Popup Mod
                            if (lower.contains("đạt yêu cầu") || lower.contains("up xup theo") || lower.contains("up xu theo")) {
                                isCurrentlyOnline = false;
                                System.out.println("🎉 [HOÀN THÀNH MỤC TIÊU TỪ MOD]: " + currentDialog);
                                System.out.println("[ACCOUNT_STATUS]: {\"state\":\"target_reached\",\"message\":\"" + currentDialog + "\",\"isTargetReached\":true,\"isCompleted\":true}");
                                AvatarModAdapter.dismissCurrentDialog();
                                AvatarModAdapter.stopModAuto();
                                Thread.sleep(2000);
                                System.exit(0);
                                return;
                            }

                            // 1. Kiểm tra lỗi xác thực tài khoản (Sai pass, tài khoản không đúng)
                            if (lower.contains("sai") || lower.contains("mật khẩu") || lower.contains("không đúng") || 
                                lower.contains("không tồn tại") || lower.contains("không chính xác")) {
                                isCurrentlyOnline = false;
                                System.err.println("❌ [LỖI XÁC THỰC TỪ SERVER]: " + currentDialog);
                                System.out.println("[ACCOUNT_STATUS]: {\"state\":\"auth_error\",\"message\":\"" + currentDialog + "\",\"isError\":true}");
                                hasPermanentError = true;
                                continue;
                            }

                            // 2. Tài khoản bị khóa
                            if (lower.contains("khóa") || lower.contains("khoá")) {
                                isCurrentlyOnline = false;
                                System.err.println("❌ [TÀI KHOẢN BỊ KHÓA]: " + currentDialog);
                                System.out.println("[ACCOUNT_STATUS]: {\"state\":\"account_locked\",\"message\":\"" + currentDialog + "\",\"isError\":true}");
                                hasPermanentError = true;
                                continue;
                            }

                            // 3. Server bảo trì
                            if (lower.contains("bảo trì") || lower.contains("máy chủ bảo trì") || lower.contains("đang bảo trì")) {
                                isCurrentlyOnline = false;
                                System.out.println("🛠️ [SERVER BẢO TRÌ]: " + currentDialog);
                                System.out.println("[ACCOUNT_STATUS]: {\"state\":\"maintenance\",\"message\":\"" + currentDialog + "\",\"isMaintenance\":true}");
                                Thread.sleep(30000);
                                lastLoginAttemptTime = System.currentTimeMillis();
                                AvatarModAdapter.login(customUser, customPass, finalServerId, finalServerName);
                                continue;
                            }

                            // 4. Tài khoản đang online ở nơi khác
                            if (lower.contains("nơi khác") || lower.contains("khác đăng nhập") || lower.contains("đang online")) {
                                isCurrentlyOnline = false;
                                System.out.println("🔄 [TỰ ĐỘNG THỬ LẠI]: " + currentDialog);
                                System.out.println("[ACCOUNT_STATUS]: {\"state\":\"other_login\",\"message\":\"" + currentDialog + "\"}");
                                Thread.sleep(15000);
                                lastLoginAttemptTime = System.currentTimeMillis();
                                AvatarModAdapter.login(customUser, customPass, finalServerId, finalServerName);
                                continue;
                            }

                            // 5. TOÀN BỘ CÁC POPUP NGOÀI MÀN HÌNH LOGIN
                            if (!isCurrentlyOnline) {
                                // Các thông báo nạp game bình thường (đang lấy dữ liệu nông trại, đang tải, xin chờ...) -> Bỏ qua, chờ game nạp xong
                                if (lower.contains("đang lấy dữ liệu") || lower.contains("đang kết nối") || lower.contains("đang tải") || lower.contains("xin chờ")) {
                                    continue;
                                }

                                // Nếu là Popup có chữ Thoát -> Bấm Thoát, kiểm tra xem file có mất/hỏng không, nếu mất thì nạp lại rồi restart
                                if (lower.contains("thoát") && !lower.contains("đối thủ") && !lower.contains("bỏ cuộc") && !lower.contains("để sau")) {
                                    System.err.println("⚠️ [PHÁT HIỆN POPUP CÓ NÚT THOÁT]: \"" + currentDialog + "\" -> Bấm Thoát & Kiểm tra file game...");
                                    AvatarModAdapter.dismissCurrentDialog();
                                    checkAndRestoreGameJar(activeJarPath);
                                    Thread.sleep(1500);
                                    System.exit(1);
                                    return;
                                }

                                // Các popup thông báo khác ở login (Captcha, Bản cập nhật, Để sau, Thông báo,...) -> Tự động bỏ qua và tiếp tục đăng nhập
                                System.out.println("ℹ️ [TỰ ĐỘNG BỎ QUA POPUP LOGIN]: \"" + currentDialog + "\" -> Đóng thông báo và tiếp tục...");
                                AvatarModAdapter.selectDialogOptionLeftAndConfirm();
                                Thread.sleep(1000);
                                AvatarModAdapter.login(customUser, customPass, finalServerId, finalServerName);
                                continue;
                            }

                            // 6. Các Popup thông báo thường khi đã vào trong game -> Tự bấm OK/Đóng
                            AvatarModAdapter.dismissCurrentDialog();
                        }

                        // 2.2. Kiểm tra trạng thái người chơi & kết nối mạng
                        MIDlet activeMidlet = MIDletBridge.getCurrentMIDlet();
                        Object ef = AvatarModAdapter.getActivePlayerInstance(activeMidlet != null ? activeMidlet.getClass().getClassLoader() : null);
                        boolean connected = AvatarModAdapter.isNetworkConnected();
                        long now = System.currentTimeMillis();
                        AvatarModAdapter.AutoTaskInfo currentTask = AvatarModAdapter.getActiveAutoTask();
                        boolean isAutoRunning = (currentTask != null && currentTask.taskInstance != null);
                        long reconnectGracePeriod = isAutoRunning ? 40000L : 30000L;

                        // 2.2.0. Phát hiện nhân vật bị ĐĂNG XUẤT hoặc MẤT KẾT NỐI (khi trước đó đang online nhưng nay ef == null)
                        if (isCurrentlyOnline && ef == null) {
                            isCurrentlyOnline = false;
                            System.out.println("⚠️ [ĐĂNG XUẤT]: Game đã đóng phiên hoặc gọi lệnh đăng xuất tài khoản!");
                            System.out.println("[ACCOUNT_STATUS]: {\"state\":\"disconnected\",\"message\":\"Đã đăng xuất / Mất kết nối, đang đăng nhập lại...\"}");
                            lastLoginAttemptTime = System.currentTimeMillis();
                            Thread.sleep(6000);
                            System.out.println("🔄 [TỰ ĐỘNG ĐĂNG NHẬP LẠI]: Đang kết nối lại máy chủ...");
                            AvatarModAdapter.login(customUser, customPass, finalServerId, finalServerName);
                            continue;
                        }

                        // Chỉ coi là mất kết nối khi: Không kết nối VÀ Không tìm thấy player trong RAM VÀ Đã quá thời gian ân hạn
                        if (!connected && ef == null && (now - lastLoginAttemptTime > reconnectGracePeriod)) {
                            // Trước khi cố kết nối lại, kiểm tra xem có phải bot đã hoàn thành mục tiêu không!
                            if (AvatarModAdapter.isTargetReached()) {
                                isCurrentlyOnline = false;
                                AvatarModAdapter.PlayerStats s = AvatarModAdapter.extractPlayerStats();
                                System.out.println("🎉 [HOÀN THÀNH MỤC TIÊU]: Đã đạt mục tiêu up xu (" + s.earnedCoins + "/" + s.targetCoins + " xu, Số dư: " + s.coins + " xu)!");
                                System.out.println("[ACCOUNT_STATUS]: {\"state\":\"target_reached\",\"message\":\"Đã đạt yêu cầu up xu theo cài đặt!\",\"isTargetReached\":true,\"isCompleted\":true}");
                                AvatarModAdapter.stopModAuto();
                                Thread.sleep(2000);
                                System.exit(0);
                                return;
                            }

                            isCurrentlyOnline = false;
                            System.out.println("⚠️ [MẤT KẾT NỐI]: Mạng game bị ngắt. Đang tự động kết nối lại sau 15 giây...");
                            System.out.println("[ACCOUNT_STATUS]: {\"state\":\"disconnected\",\"message\":\"Mạng game bị ngắt\"}");
                            Thread.sleep(15000);
                            lastLoginAttemptTime = System.currentTimeMillis();
                            AvatarModAdapter.login(customUser, customPass, finalServerId, finalServerName);
                        }

                        // 2.3. Áp dụng cấu hình ban đầu sau khi đăng nhập thành công
                        if (connected && ef != null) {
                            if (!isCurrentlyOnline) {
                                isCurrentlyOnline = true;
                                System.out.println("[ACCOUNT_STATUS]: {\"state\":\"online\",\"message\":\"Đang Treo Online\",\"isError\":false,\"isMaintenance\":false}");
                            }

                            if (!initialSetupApplied) {
                                initialSetupApplied = true;
                                String resetOnStart = System.getProperty("avatar.resetOnStart");
                                if ("true".equalsIgnoreCase(resetOnStart)) {
                                    AvatarModAdapter.resetUpThueData();
                                }

                                String initTarget = System.getProperty("avatar.targetCoins");
                                String initDays = System.getProperty("avatar.upDays");
                                if ((initTarget != null && !initTarget.isEmpty()) || (initDays != null && !initDays.isEmpty())) {
                                    int tCoins = 0;
                                    int uDays = 0;
                                    try { if (initTarget != null) tCoins = Integer.parseInt(initTarget); } catch (Exception ignored) {}
                                    try { if (initDays != null) uDays = Integer.parseInt(initDays); } catch (Exception ignored) {}
                                    AvatarModAdapter.applyUpThueSetup(tCoins, uDays);
                                }

                                initFarmB64 = System.getProperty("avatar.farmSettingsB64");
                                if (initFarmB64 != null && !initFarmB64.isEmpty()) {
                                    try {
                                        byte[] decoded = java.util.Base64.getDecoder().decode(initFarmB64);
                                        AvatarModAdapter.applyFarmSetup(new String(decoded, "UTF-8"));
                                    } catch (Throwable ignored) {}
                                }

                                initDiamondB64 = System.getProperty("avatar.diamondSettingsB64");
                                if (initDiamondB64 != null && !initDiamondB64.isEmpty()) {
                                    try {
                                        byte[] decoded = java.util.Base64.getDecoder().decode(initDiamondB64);
                                        AvatarModAdapter.applyDiamondSetup(new String(decoded, "UTF-8"));
                                    } catch (Throwable ignored) {}
                                }
                            }
                        }

                        // 2.4. Trích xuất thông tin tài khoản (Số xu, Số lượng, Xu cần up, Tim, Đếm ngược cày...)
                        AvatarModAdapter.PlayerStats stats = AvatarModAdapter.extractPlayerStats();
                        System.out.println("[PLAYER_STATS]: " + stats.toJson(lastLoginAttemptTime));

                        // 2.4.1. Kiểm tra trực tiếp biến số liệu nội bộ của Mod xem đã hoàn tất mục tiêu chưa
                        if (stats.isTargetReached) {
                            isCurrentlyOnline = false;
                            System.out.println("🎉 [HOÀN THÀNH MỤC TIÊU TỪ SỐ LIỆU MOD]: Đã đạt mục tiêu up xu (" + stats.earnedCoins + "/" + stats.targetCoins + " xu)!");
                            System.out.println("[ACCOUNT_STATUS]: {\"state\":\"target_reached\",\"message\":\"Đã đạt yêu cầu up xu theo cài đặt!\",\"isTargetReached\":true,\"isCompleted\":true}");
                            AvatarModAdapter.stopModAuto();
                            Thread.sleep(2000);
                            System.exit(0);
                            return;
                        }

                        // 2.5. Giám sát trạng thái tiến trình Auto (Auto Farm, Auto Diamond, Auto Fish)
                        try {
                            AvatarModAdapter.AutoTaskInfo curAutoTask = AvatarModAdapter.getActiveAutoTask();

                            if (lastAutoTask != null && curAutoTask == null) {
                                System.out.println("✅ [AUTO HOÀN THÀNH]: " + lastAutoTask.friendlyName + " đã hoàn tất toàn bộ công việc!");
                                System.out.println("[AUTO_STATUS]: {\"isRunning\":false,\"status\":\"finished\",\"finished\":true,\"autoType\":\"" + lastAutoTask.autoType + "\",\"message\":\"Đã hoàn tất " + lastAutoTask.friendlyName + "!\"}");
                            } else if (lastAutoTask == null && curAutoTask != null) {
                                System.out.println("🌾 [BẮT ĐẦU CHẠY]: " + curAutoTask.friendlyName);
                                System.out.println("[AUTO_STATUS]: {\"isRunning\":true,\"status\":\"running\",\"autoType\":\"" + curAutoTask.autoType + "\",\"message\":\"Đang chạy " + curAutoTask.friendlyName + "...\"}");
                            }
                            lastAutoTask = curAutoTask;
                        } catch (Throwable ignored) {}
                    }
                } catch (Exception e) {
                    System.err.println("[GIÁM SÁT LỖI]: " + e.getMessage());
                }
            }
        });
        supervisorThread.setDaemon(true);
        supervisorThread.start();

        // Khởi chạy MicroEmulator Headless
        org.microemu.app.Headless.main(args);
    }
}
