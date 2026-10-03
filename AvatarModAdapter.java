import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.midlet.MIDlet;
import org.microemu.MIDletBridge;

/**
 * AvatarModAdapter (Unified Adapter Layer)
 * 
 * Toàn bộ các chức năng đăng nhập, kết nối, đọc thông số, cài đặt farm / kim cương / up thuê,
 * và điều khiển Auto đều được thực thi thông qua biến cấu hình DUY NHẤT ModSchema.
 * 
 * Khi game mod đổi cách làm rối (obfuscate), BẠN CHỈ CẦN UPDATE FILE ModSchema.java.
 * Toàn bộ logic nghiệp vụ trong file này giữ nguyên 100% không đổi.
 */
public class AvatarModAdapter {

    public static class PlayerStats {
        public long coins = 0;
        public int gold = 0;
        public int lockedGold = 0;
        public String playerName = "";
        public int targetCoins = 0;
        public int earnedCoins = 0;
        public int collectedHearts = 0;
        public int kcx = 0;
        public int nhb = 0;
        public int fishCaught = 0;
        public int sharkCaught = 0;
        public int fishKcx = 0;
        public boolean isFishMod = false;
        public String modType = "up_xu";
        public boolean isAutoRunning = false;
        public String autoType = "";
        public String farmingCountdown = "--:--";
        public String sellOreTime = "--:--";
        public int currentZone = 0;
        public String startedAt = "";
        public String expiresAt = "Vĩnh viễn";
        public long startedTs = 0;
        public long upDays = 0;
        public long expiresAtTimestamp = 0;
        public boolean isTargetReached = false;

        public String toJson(long lastLoginTime) {
            String startStr = (startedAt != null && !startedAt.isEmpty() && !startedAt.contains("1970")) ? startedAt : 
                new SimpleDateFormat("dd/MM/yyyy").format(new Date(lastLoginTime > 1000000000000L ? lastLoginTime : System.currentTimeMillis()));
            String expStr = (expiresAt != null && !expiresAt.trim().isEmpty() && !expiresAt.contains("1970")) ? expiresAt : "Vĩnh viễn";

            return "{\"coins\":" + coins + ",\"gold\":" + gold + ",\"lockedGold\":" + lockedGold + 
                   ",\"targetCoins\":" + targetCoins + ",\"earnedCoins\":" + earnedCoins + 
                   ",\"collectedHearts\":" + collectedHearts + ",\"kcx\":\"+" + kcx + "\",\"nhb\":\"+" + nhb + 
                   "\",\"fishCaught\":" + fishCaught + ",\"sharkCaught\":" + sharkCaught + ",\"fishKcx\":\"+" + fishKcx + 
                   "\",\"isFishMod\":" + isFishMod + ",\"modType\":\"" + modType + 
                   "\",\"isAutoRunning\":" + isAutoRunning + ",\"autoType\":\"" + autoType + 
                   "\",\"sellOreTime\":\"" + sellOreTime + "\",\"currentZone\":" + currentZone + 
                   ",\"farmingTime\":\"" + farmingCountdown + "\",\"farmingCountdown\":\"" + farmingCountdown + 
                   "\",\"startedAt\":\"" + startStr + "\",\"expiresAt\":\"" + expStr + 
                   "\",\"isTargetReached\":" + isTargetReached + ",\"startedTs\":" + startedTs + ",\"expiresAtTimestamp\":" + expiresAtTimestamp + "}";
        }
    }

    public static class AutoTaskInfo {
        public Object taskInstance;
        public String className = "";
        public String friendlyName = "";
        public String autoType = "farm"; // farm, diamond, fish

        public AutoTaskInfo(Object inst, String cls, String friendly, String type) {
            this.taskInstance = inst;
            this.className = cls;
            this.friendlyName = friendly;
            this.autoType = type;
        }
    }

    private static ClassLoader getClassLoader() {
        MIDlet midlet = MIDletBridge.getCurrentMIDlet();
        return midlet != null ? midlet.getClass().getClassLoader() : null;
    }

    /**
     * Tự động nhận diện ModType dựa theo định nghĩa trong ModSchema
     */
    public static ModSchema.ModType detectModType() {
        ClassLoader cl = getClassLoader();
        if (cl == null) return ModSchema.ModType.UNKNOWN;

        try {
            Class<?> mainCls = cl.loadClass(ModSchema.UP_XU.mainIdentifierClass);
            if (mainCls.getSuperclass() != null && mainCls.getSuperclass().getName().equals(ModSchema.UP_XU.superIdentifierClass)) {
                return ModSchema.ModType.UP_XU;
            }
        } catch (Throwable ignored) {}

        try {
            Class<?> mainCls = cl.loadClass(ModSchema.FISH.mainIdentifierClass);
            if (mainCls.getSuperclass() != null && mainCls.getSuperclass().getName().equals(ModSchema.FISH.superIdentifierClass)) {
                return ModSchema.ModType.FISH;
            }
        } catch (Throwable ignored) {}

        return ModSchema.ModType.UP_XU; // Mặc định
    }

    /**
     * Lấy schema hiện tại
     */
    public static ModSchema getCurrentSchema() {
        return ModSchema.getSchema(detectModType());
    }

    // =========================================================================
    // 1. ĐĂNG NHẬP (LOGIN)
    // =========================================================================

    public static boolean login(String username, String password, int serverId, String serverName) {
        ClassLoader cl = getClassLoader();
        if (cl == null) return false;

        String finalUser = (username != null && !username.isEmpty()) ? username : "";
        String finalPass = (password != null && !password.isEmpty()) ? password : "";
        if (finalPass.isEmpty() || finalUser.isEmpty()) {
            String[] rmsCreds = readCredentialsFromRms(System.getProperty("avatar.appId"));
            if (rmsCreds != null) {
                if (finalUser.isEmpty() && rmsCreds[0] != null) finalUser = rmsCreds[0];
                if (finalPass.isEmpty() && rmsCreds[1] != null) finalPass = rmsCreds[1];
            }
        }

        dismissStartupPopups();

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> loginCls = cl.loadClass(schema.loginClassName);
            Method getInstMethod = loginCls.getMethod(schema.loginSingletonMethod);
            Object loginInstance = getInstMethod.invoke(null);

            if (loginInstance != null) {
                // Xử lý class phụ trợ gV nếu có
                if (schema.loginExtraGvClass != null) {
                    try {
                        Class<?> gvCls = cl.loadClass(schema.loginExtraGvClass);
                        Method getGvMethod = gvCls.getMethod(schema.loginSingletonMethod);
                        Object gvInst = getGvMethod.invoke(null);
                        if (gvInst != null) {
                            setField(gvInst, schema.loginServerIdField, serverId, int.class);
                        }
                    } catch (Throwable ignored) {}
                }

                setField(loginInstance, schema.loginServerIdField, serverId, int.class);
                setField(loginInstance, schema.loginServerNameField, serverName, String.class);

                if (schema.loginHasConstServerId) {
                    setField(loginInstance, "case", true, boolean.class);
                    try {
                        Method gotoMethod = loginCls.getMethod("goto");
                        gotoMethod.invoke(loginInstance);
                    } catch (Throwable ignored) {}
                }

                if (!finalUser.isEmpty() && !finalPass.isEmpty()) {
                    System.out.println("[QUY TRÌNH] -> [" + schema.name + "] Đang kết nối tới Server [" + serverName + "] & đăng nhập nick [" + finalUser + "]...");
                    for (Method m : loginCls.getDeclaredMethods()) {
                        if (m.getName().equals(schema.loginMethodName) && m.getParameterCount() == 2) {
                            Class<?>[] pts = m.getParameterTypes();
                            if (pts[0].equals(String.class) && pts[1].equals(String.class)) {
                                m.setAccessible(true);
                                m.invoke(loginInstance, finalUser, finalPass);
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (Throwable t) {
            Throwable cause = (t instanceof java.lang.reflect.InvocationTargetException && t.getCause() != null) ? t.getCause() : t;
            String msg = cause.getMessage();
            if (msg == null || msg.trim().isEmpty()) {
                msg = cause.getClass().getSimpleName();
            }
            System.err.println("[LOGIN ERR]: " + msg);
            if (System.getProperty("avatar.debug") != null) {
                cause.printStackTrace();
            }
        }

        return false;
    }

    // =========================================================================
    // 2. KIỂM TRA MẠNG & POPUP THÔNG BÁO (NETWORK & DIALOGS)
    // =========================================================================

    public static boolean isNetworkConnected() {
        ClassLoader cl = getClassLoader();
        if (cl == null) return false;

        // 1. Nếu nhân vật đã hiện diện trong RAM (duLieuNguoiChoi / player instance != null), bot chắc chắn 100% đang online kết nối Server
        Object player = getActivePlayerInstance(cl);
        if (player != null) {
            // Kiểm tra xem có popup thông báo đè lên báo mất kết nối không
            String dialog = checkActiveGameDialog();
            if (dialog != null && !dialog.trim().isEmpty()) {
                String lower = dialog.toLowerCase();
                if (lower.contains("mất kết nối") || lower.contains("kết nối thất bại") || lower.contains("mạng game bị ngắt")) {
                    return false;
                }
            }
            return true;
        }

        // 2. Nếu chưa vào map (đang ở màn hình đăng nhập hoặc đang bắt tay):
        // Kiểm tra xem có popup thông báo lỗi mạng không
        String dialog = checkActiveGameDialog();
        if (dialog != null && !dialog.trim().isEmpty()) {
            String lower = dialog.toLowerCase();
            if (lower.contains("mất kết nối") || lower.contains("kết nối thất bại") || lower.contains("mạng game bị ngắt")) {
                return false;
            }
        }

        // 3. Fallback kiểm tra qua Network class (nếu reflective call khả dụng và không bị lỗi classloader)
        ModSchema schema = getCurrentSchema();
        try {
            Class<?> netCls = cl.loadClass(schema.networkClassName);
            for (Method m : netCls.getDeclaredMethods()) {
                if (m.getName().equals(schema.networkSingletonMethod) && m.getParameterCount() == 0 && 
                    java.lang.reflect.Modifier.isStatic(m.getModifiers()) && m.getReturnType().equals(netCls)) {
                    Object netInst = m.invoke(null);
                    if (netInst != null) {
                        for (Method dm : netCls.getDeclaredMethods()) {
                            if (dm.getName().equals(schema.networkConnectedMethod) && dm.getParameterCount() == 0 && 
                                !java.lang.reflect.Modifier.isStatic(dm.getModifiers()) && dm.getReturnType().equals(boolean.class)) {
                                dm.setAccessible(true);
                                return (boolean) dm.invoke(netInst);
                            }
                        }
                    }
                }
            }
        } catch (Throwable ignored) {}

        // Nếu không có popup lỗi mạng, coi như socket vẫn đang duy trì
        return true;
    }

    public static String checkActiveGameDialog() {
        ClassLoader cl = getClassLoader();
        if (cl == null) return null;

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> containerCls = cl.loadClass(schema.dialogContainerClass);
            Class<?> dialogCls = cl.loadClass(schema.dialogClass);

            for (Field f : containerCls.getDeclaredFields()) {
                if (f.getType().equals(dialogCls)) {
                    f.setAccessible(true);
                    Object dObj = f.get(null);
                    if (dObj != null) {
                        // Kiểm tra trạng thái hiển thị
                        for (Field sf : dialogCls.getDeclaredFields()) {
                            if (sf.getType().equals(boolean.class)) {
                                sf.setAccessible(true);
                                if (sf.getBoolean(dObj)) {
                                    for (Field msgF : dialogCls.getDeclaredFields()) {
                                        if (msgF.getType().equals(String.class)) {
                                            msgF.setAccessible(true);
                                            String msg = (String) msgF.get(dObj);
                                            if (msg != null && !msg.trim().isEmpty() && msg.length() > 2) {
                                                return msg.trim();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // Kiểm tra Alert Dialog phụ nếu có (như fA trong Mod Fish)
            if (schema.alertDialogClass != null) {
                Class<?> alertCls = cl.loadClass(schema.alertDialogClass);
                for (Field f : containerCls.getDeclaredFields()) {
                    if (f.getType().equals(alertCls)) {
                        f.setAccessible(true);
                        Object alertObj = f.get(null);
                        if (alertObj != null) {
                            for (Field af : alertCls.getDeclaredFields()) {
                                if (af.getType().equals(String.class)) {
                                    af.setAccessible(true);
                                    String msg = (String) af.get(alertObj);
                                    if (msg != null && !msg.trim().isEmpty() && msg.length() > 2) {
                                        return msg.trim();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable ignored) {}

        return null;
    }

    public static void dismissStartupPopups() {
        selectDialogOptionLeftAndConfirm();
    }

    public static void selectDialogOptionLeftAndConfirm() {
        ClassLoader cl = getClassLoader();
        if (cl == null) return;

        ModSchema schema = getCurrentSchema();
        if (schema.canvasClasses == null) return;

        for (String cn : schema.canvasClasses) {
            try {
                Class<?> cls = cl.loadClass(cn);
                Object inst = null;
                try {
                    Method m = cls.getMethod("do");
                    inst = m.invoke(null);
                } catch (Throwable ignored) {}

                if (inst == null) {
                    for (Field f : cls.getDeclaredFields()) {
                        if (f.getName().equals("do") && java.lang.reflect.Modifier.isStatic(f.getModifiers()) && cls.isAssignableFrom(f.getType())) {
                            f.setAccessible(true);
                            inst = f.get(null);
                            break;
                        }
                    }
                }

                if (inst != null) {
                    try {
                        Method kp = inst.getClass().getMethod("keyPressed", int.class);
                        Method kr = inst.getClass().getMethod("keyReleased", int.class);

                        // 1. Nhấn phím Mũi Tên Trái (Key code -3) để chuyển lựa chọn sang "< Để sau >"
                        kp.invoke(inst, -3);
                        if (kr != null) kr.invoke(inst, -3);

                        try { Thread.sleep(80); } catch (Throwable ignored) {}

                        // 2. Nhấn xác nhận (Center key -5, Left Softkey -6, Enter 10, Phím 5 53)
                        int[] confirmKeys = new int[] { -5, -6, 10, 53 };
                        for (int k : confirmKeys) {
                            try {
                                kp.invoke(inst, k);
                                if (kr != null) kr.invoke(inst, k);
                            } catch (Throwable ignored) {}
                        }
                    } catch (Throwable ignored) {}
                }
            } catch (Throwable ignored) {}
        }
    }

    public static void dismissCurrentDialog() {
        selectDialogOptionLeftAndConfirm();
    }

    // =========================================================================
    // 3. TRÍCH XUẤT THÔNG SỐ TÀI KHOẢN (PLAYER STATS)
    // =========================================================================

    public static PlayerStats extractPlayerStats() {
        PlayerStats stats = new PlayerStats();
        ClassLoader cl = getClassLoader();
        if (cl == null) return stats;

        ModSchema.ModType currentModType = detectModType();
        stats.isFishMod = (currentModType == ModSchema.ModType.FISH);
        stats.modType = (currentModType == ModSchema.ModType.FISH) ? "fish" : "up_xu";

        ModSchema schema = getCurrentSchema();

        // 3.0. Vùng/Khu hiện tại trong game (Current Zone)
        if (schema.zoneClassName != null) {
            try {
                Class<?> zCls = cl.loadClass(schema.zoneClassName);
                for (Field f : zCls.getDeclaredFields()) {
                    if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && 
                        (f.getType().equals(byte.class) || f.getType().equals(int.class) || f.getType().equals(short.class))) {
                        if (schema.zoneField == null || schema.zoneField.isEmpty() || f.getName().equals(schema.zoneField)) {
                            f.setAccessible(true);
                            stats.currentZone = f.getInt(null);
                            break;
                        }
                    }
                }
            } catch (Throwable ignored) {}
        }

        // 3.1. Nhân vật & Tiền tệ (Coins, Gold, LockedGold, Name)
        try {
            Object playerObj = getActivePlayerInstance(cl, schema);
            if (playerObj != null) {
                Class<?> pCls = playerObj.getClass();
                while (pCls != null && !pCls.equals(Object.class)) {
                    for (Field f : pCls.getDeclaredFields()) {
                        try {
                            f.setAccessible(true);
                            boolean isStatic = java.lang.reflect.Modifier.isStatic(f.getModifiers());

                            // Mảng tiền xu / lượng (int[])
                            if (!isStatic && f.getName().equals(schema.playerCoinsArrayField) && f.getType().equals(int[].class)) {
                                int[] moneyArr = (int[]) f.get(playerObj);
                                if (moneyArr != null && moneyArr.length > 0) {
                                    stats.coins = moneyArr[0];
                                    if (moneyArr.length > 1 && moneyArr[1] > 0) stats.gold = moneyArr[1];
                                    if (moneyArr.length > 2 && moneyArr[2] > 0) stats.gold = moneyArr[2];
                                }
                            }

                            // Lượng khóa (int)
                            if (!isStatic && f.getName().equals(schema.playerLockedGoldField) && f.getType().equals(int.class)) {
                                stats.lockedGold = f.getInt(playerObj);
                            }

                            // Tên nhân vật (String)
                            if (f.getType().equals(String.class)) {
                                for (String nameFld : schema.playerNameFields) {
                                    if (f.getName().equals(nameFld)) {
                                        Object nameObj = f.get(isStatic ? null : playerObj);
                                        if (nameObj != null && !nameObj.toString().trim().isEmpty()) {
                                            String n = nameObj.toString().trim();
                                            if (!n.isEmpty() && stats.playerName.isEmpty()) {
                                                stats.playerName = n;
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable ignored) {}
                    }
                    pCls = pCls.getSuperclass();
                }
            }
        } catch (Throwable ignored) {}

        // 3.2. Thông số Up Thuê
        try {
            Class<?> aQCls = cl.loadClass(schema.upThueClassName);
            long startedTs = 0;
            long upDays = 0;

            for (Field f : aQCls.getDeclaredFields()) {
                try {
                    f.setAccessible(true);
                    if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                        if (f.getName().equals(schema.targetCoinsField) && f.getType().equals(int.class)) stats.targetCoins = f.getInt(null);
                        if (f.getName().equals(schema.earnedCoinsField) && f.getType().equals(int.class)) stats.earnedCoins = f.getInt(null);
                        if (f.getName().equals(schema.collectedHeartsField) && f.getType().equals(int.class)) stats.collectedHearts = f.getInt(null);
                        if (f.getName().equals(schema.upDaysField) && f.getType().equals(long.class)) upDays = f.getLong(null);
                        if (f.getName().equals(schema.startedTsField) && f.getType().equals(long.class)) startedTs = f.getLong(null);
                    }
                } catch (Throwable ignored) {}
            }

            // Lấy instance và cập nhật chuỗi hiển thị ngày tháng
            Object aQInstance = null;
            for (Field f : aQCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(aQCls)) {
                    f.setAccessible(true);
                    try { aQInstance = f.get(null); } catch (Throwable ignored) {}
                    if (aQInstance != null) break;
                }
            }
            if (aQInstance == null) {
                for (Method m : aQCls.getDeclaredMethods()) {
                    if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && m.getParameterCount() == 0 && m.getReturnType().equals(aQCls)) {
                        m.setAccessible(true);
                        try { aQInstance = m.invoke(null); } catch (Throwable ignored) {}
                        if (aQInstance != null) break;
                    }
                }
            }

            if (aQInstance != null) {
                try {
                    Method m = aQCls.getMethod(schema.upThueFormatDateMethod);
                    m.setAccessible(true);
                    m.invoke(aQInstance);
                } catch (Throwable ignored) {}

                for (Field f : aQCls.getDeclaredFields()) {
                    try {
                        f.setAccessible(true);
                        if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(String.class)) {
                            Object val = f.get(aQInstance);
                            if (val != null) {
                                String str = val.toString().trim();
                                if (!str.isEmpty() && !str.contains("1970") && (str.contains("/") || str.equalsIgnoreCase("Vĩnh viễn"))) {
                                    if (f.getName().equals(schema.startedAtStringField)) {
                                        stats.startedAt = str;
                                    } else if (f.getName().equals(schema.expiresAtStringField)) {
                                        stats.expiresAt = str;
                                    }
                                }
                            }
                        }
                    } catch (Throwable ignored) {}
                }
            }

            stats.startedTs = startedTs;
            stats.upDays = upDays;
            if (upDays > 0) {
                long baseTs = (startedTs > 1000000000000L) ? startedTs : System.currentTimeMillis();
                stats.expiresAtTimestamp = baseTs + upDays * 86400000L;
            } else {
                stats.expiresAtTimestamp = 0;
            }

            // Tính toán fallback ngày tháng nếu chuỗi chưa render kịp hoặc dính 1970
            if (stats.startedAt == null || stats.startedAt.isEmpty() || stats.startedAt.contains("1970") || stats.startedAt.equals("--")) {
                if (startedTs > 1000000000000L) {
                    SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
                    stats.startedAt = sdf.format(new Date(startedTs));
                } else {
                    SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
                    stats.startedAt = sdf.format(new Date());
                }
            }
            if (upDays <= 0) {
                stats.expiresAt = "Vĩnh viễn";
            } else if (stats.expiresAt == null || stats.expiresAt.isEmpty() || stats.expiresAt.contains("1970") || stats.expiresAt.equals("--")) {
                long baseTs = (startedTs > 1000000000000L) ? startedTs : System.currentTimeMillis();
                SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
                stats.expiresAt = sdf.format(new Date(baseTs + upDays * 86400000L));
            }

            // Kiểm tra trạng thái hoàn thành mục tiêu trực tiếp từ số liệu Mod trong RAM
            if (stats.targetCoins > 0 && (stats.earnedCoins >= stats.targetCoins || stats.coins >= stats.targetCoins)) {
                stats.isTargetReached = true;
            } else if (stats.expiresAtTimestamp > 0 && System.currentTimeMillis() >= stats.expiresAtTimestamp) {
                stats.isTargetReached = true;
            }
        } catch (Throwable ignored) {}

        // 3.3. Thông số Kim Cương, Câu Cá, Bán Đá & Đếm ngược Farming
        extractDiamondStats(cl, schema, stats);
        extractFishStats(cl, schema, stats);
        extractSellOreStats(cl, schema, stats);

        // 3.4. Trạng thái Auto đang chạy
        AutoTaskInfo activeAuto = getActiveAutoTask();
        if (activeAuto != null) {
            stats.isAutoRunning = true;
            stats.autoType = activeAuto.autoType;
        }

        return stats;
    }

    /**
     * Kiểm tra trực tiếp từ hàm & biến nội bộ của Mod xem tài khoản đã đạt mục tiêu chưa
     */
    public static boolean isTargetReached() {
        try {
            PlayerStats stats = extractPlayerStats();
            return stats != null && stats.isTargetReached;
        } catch (Throwable ignored) {}
        return false;
    }

    /**
     * Tắt toàn bộ trạng thái auto bên trong Mod bằng cách gọi hàm reset của Mod (aQ.class / aQ.void / aQ.byte)
     */
    public static void stopModAuto() {
        ClassLoader cl = getClassLoader();
        if (cl == null) return;
        ModSchema schema = getCurrentSchema();
        try {
            Class<?> aQCls = cl.loadClass(schema.upThueClassName);
            for (String mName : new String[] { "class", "void", "byte" }) {
                try {
                    Method m = aQCls.getDeclaredMethod(mName);
                    if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && m.getParameterCount() == 0) {
                        m.setAccessible(true);
                        m.invoke(null);
                        break;
                    }
                } catch (Throwable ignored) {}
            }
        } catch (Throwable ignored) {}
    }

    private static void extractDiamondStats(ClassLoader cl, ModSchema schema, PlayerStats stats) {
        try {
            Class<?> diamCls = cl.loadClass(schema.diamondClassName);
            int kcxVal = 0;
            int nhbVal = 0;
            boolean autoFarmEnabled = false;

            // Đọc trực tiếp biến đếm tĩnh từ Mod (X.for/do trên Up Xu, aj.do/for trên Fish)
            for (Field f : diamCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    f.setAccessible(true);
                    if (f.getType().equals(int.class)) {
                        if (f.getName().equals(schema.kcxCountField)) kcxVal = f.getInt(null);
                        else if (f.getName().equals(schema.nhbCountField)) nhbVal = f.getInt(null);
                    } else if (f.getType().equals(boolean.class)) {
                        if (f.getName().equals(schema.diamondAutoFarmField)) {
                            autoFarmEnabled = f.getBoolean(null);
                        }
                    }
                }
            }

            stats.kcx = kcxVal;
            stats.nhb = nhbVal;

            try {
                Object diamInst = null;
                // 1. Tìm hàm static singleton method (ví dụ: static X do() trả về kiểu X.class)
                for (Method m : diamCls.getDeclaredMethods()) {
                    if (m.getName().equals(schema.diamondSingletonMethod) && 
                        m.getParameterCount() == 0 && 
                        java.lang.reflect.Modifier.isStatic(m.getModifiers()) && 
                        diamCls.isAssignableFrom(m.getReturnType())) {
                        m.setAccessible(true);
                        diamInst = m.invoke(null);
                        break;
                    }
                }

                // 2. Nếu chưa có, lấy từ field static có kiểu diamCls
                if (diamInst == null) {
                    for (Field f : diamCls.getDeclaredFields()) {
                        if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(diamCls)) {
                            f.setAccessible(true);
                            diamInst = f.get(null);
                            if (diamInst != null) break;
                        }
                    }
                }

                // 3. Nếu chưa có, lấy từ Task đang chạy trong AutoController
                AutoTaskInfo activeTask = getActiveAutoTask();
                boolean isDiamondActive = (activeTask != null && "diamond".equalsIgnoreCase(activeTask.autoType));
                if (diamInst == null && activeTask != null && activeTask.taskInstance != null && diamCls.isInstance(activeTask.taskInstance)) {
                    diamInst = activeTask.taskInstance;
                }

                long now = System.currentTimeMillis();
                long targetMs = 0;

                if (diamInst != null) {
                    // Duyệt tất cả các instance field kiểu long để đọc chính xác trường soXu (do: long)
                    for (Field f : diamCls.getDeclaredFields()) {
                        if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(long.class)) {
                            f.setAccessible(true);
                            long val = f.getLong(diamInst);
                            if (f.getName().equals(schema.diamondAbsTargetMsField) && val > 0) {
                                targetMs = val;
                                break;
                            } else if (val > now) {
                                targetMs = val;
                            }
                        }
                    }
                }

                // Kiểm tra thêm từ task đang chạy thực tế nếu instance tĩnh chưa cập nhật
                if (targetMs <= now && activeTask != null && activeTask.taskInstance != null && diamCls.isInstance(activeTask.taskInstance)) {
                    for (Field f : diamCls.getDeclaredFields()) {
                        if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(long.class)) {
                            f.setAccessible(true);
                            long val = f.getLong(activeTask.taskInstance);
                            if (val > now) {
                                targetMs = val;
                                break;
                            }
                        }
                    }
                }

                if (targetMs > now) {
                    int diffSec = (int) ((targetMs - now) / 1000L);
                    int s = diffSec % 60;
                    int m = (diffSec / 60) % 60;
                    int h = (diffSec / 3600) % 24;
                    if (h > 0) {
                        stats.farmingCountdown = String.format("%02d:%02d:%02d", h, m, s);
                    } else {
                        stats.farmingCountdown = String.format("%02d:%02d", m, s);
                    }
                } else if (targetMs > 0) {
                    stats.farmingCountdown = "Đang về farm...";
                } else if (isDiamondActive && autoFarmEnabled) {
                    stats.farmingCountdown = "Xin chờ...";
                } else if (isDiamondActive) {
                    stats.farmingCountdown = "Không hẹn giờ";
                } else {
                    stats.farmingCountdown = "--:--";
                }
            } catch (Throwable ignored) {}
        } catch (Throwable ignored) {}
    }

    private static void extractFishStats(ClassLoader cl, ModSchema schema, PlayerStats stats) {
        if (schema.fishClassName == null || schema.fishClassName.isEmpty()) return;
        try {
            Class<?> fishCls = cl.loadClass(schema.fishClassName);
            
            // 1. Đọc số cá câu được (bS.try), cá mập (bS.for), KCX (bS.new)
            for (Field f : fishCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(int.class)) {
                    f.setAccessible(true);
                    if (f.getName().equals(schema.fishCaughtField)) {
                        stats.fishCaught = f.getInt(null);
                    } else if (f.getName().equals(schema.fishSharkCountField)) {
                        stats.sharkCaught = f.getInt(null);
                    } else if (f.getName().equals(schema.fishKcxCountField)) {
                        stats.fishKcx = f.getInt(null);
                        if (stats.kcx == 0) stats.kcx = stats.fishKcx;
                    }
                }
            }

            // Đọc cấu hình bật về chăm farm (AutoCauCa.coTrangThai -> static boolean 'if')
            boolean backToFarmEnabled = false;
            for (Field f : fishCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(boolean.class)) {
                    f.setAccessible(true);
                    if (f.getName().equals(schema.fishBackToFarmField)) {
                        backToFarmEnabled = f.getBoolean(null);
                    }
                }
            }

            // 2. Đọc đếm ngược thời gian về Farm (Farming: MM:SS)
            AutoTaskInfo activeTask = getActiveAutoTask();
            boolean isFishActive = (activeTask != null && "fish".equalsIgnoreCase(activeTask.autoType));

            // Tìm instance AutoCauCa (bS)
            Object fishInst = null;
            // 1. Tìm hàm static trả về fishCls
            for (Method m : fishCls.getDeclaredMethods()) {
                if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) &&
                    m.getParameterTypes().length == 0 &&
                    fishCls.isAssignableFrom(m.getReturnType())) {
                    m.setAccessible(true);
                    fishInst = m.invoke(null);
                    if (fishInst != null) break;
                }
            }
            // 2. Nếu chưa có, tìm field static kiểu fishCls
            if (fishInst == null) {
                for (Field f : fishCls.getDeclaredFields()) {
                    if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(fishCls)) {
                        f.setAccessible(true);
                        fishInst = f.get(null);
                        if (fishInst != null) break;
                    }
                }
            }
            // 3. Nếu chưa có, lấy từ activeTask
            if (fishInst == null && activeTask != null && activeTask.taskInstance != null && fishCls.isInstance(activeTask.taskInstance)) {
                fishInst = activeTask.taskInstance;
            }

            long targetMs = 0;
            long now = System.currentTimeMillis();

            if (fishInst != null) {
                for (Field f : fishCls.getDeclaredFields()) {
                    if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(long.class)) {
                        f.setAccessible(true);
                        long val = f.getLong(fishInst);
                        if (f.getName().equals(schema.fishTargetMsField) && val > 0) {
                            targetMs = val;
                            break;
                        } else if (val > now) {
                            targetMs = val;
                        }
                    }
                }
            }

            if (targetMs <= now && activeTask != null && activeTask.taskInstance != null && fishCls.isInstance(activeTask.taskInstance)) {
                for (Field f : fishCls.getDeclaredFields()) {
                    if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(long.class)) {
                        f.setAccessible(true);
                        long val = f.getLong(activeTask.taskInstance);
                        if (val > now) {
                            targetMs = val;
                            break;
                        }
                    }
                }
            }

            if (targetMs > now) {
                int diffSec = (int) ((targetMs - now) / 1000L);
                int s = diffSec % 60;
                int m = (diffSec / 60) % 60;
                int h = (diffSec / 3600) % 24;
                if (h > 0) {
                    stats.farmingCountdown = String.format("%02d:%02d:%02d", h, m, s);
                } else {
                    stats.farmingCountdown = String.format("%02d:%02d", m, s);
                }
            } else if (targetMs > 0) {
                stats.farmingCountdown = "Đang về farm...";
            } else if (isFishActive && backToFarmEnabled) {
                stats.farmingCountdown = "Xin chờ...";
            } else if (isFishActive) {
                stats.farmingCountdown = "Không hẹn giờ";
            }
        } catch (Throwable ignored) {}
    }

    private static void extractSellOreStats(ClassLoader cl, ModSchema schema, PlayerStats stats) {
        if (schema.sellOreClassName == null || schema.sellOreClassName.isEmpty()) return;
        try {
            Class<?> sellCls = cl.loadClass(schema.sellOreClassName);
            long targetMs = 0;
            long elapsedMs = 0;

            for (Field f : sellCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(long.class)) {
                    f.setAccessible(true);
                    if (f.getName().equals(schema.sellOreTargetMsField)) {
                        targetMs = f.getLong(null);
                    } else if (f.getName().equals(schema.sellOreStartMsField)) {
                        elapsedMs = f.getLong(null);
                    }
                }
            }

            long diffMs = targetMs - elapsedMs;
            if (diffMs > 0) {
                int diffSec = (int) (diffMs / 1000L);
                int s = diffSec % 60;
                int m = (diffSec / 60) % 60;
                int h = (diffSec / 3600) % 24;
                if (h > 0) {
                    stats.sellOreTime = String.format("%02d:%02d:%02d", h, m, s);
                } else {
                    stats.sellOreTime = String.format("%02d:%02d", m, s);
                }
                stats.farmingCountdown = stats.sellOreTime;
            } else if (targetMs > 0) {
                stats.sellOreTime = "00:00";
            }
        } catch (Throwable ignored) {}
    }

    public static Object getActivePlayerInstance(ClassLoader cl) {
        return getActivePlayerInstance(cl, getCurrentSchema());
    }

    public static Object getActivePlayerInstance(ClassLoader cl, ModSchema schema) {
        if (cl == null || schema == null) return null;
        for (String containerName : schema.playerContainerClasses) {
            try {
                Class<?> containerCls = cl.loadClass(containerName);
                for (Field f : containerCls.getDeclaredFields()) {
                    if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                        if (f.getType().getName().equals(schema.playerClassName)) {
                            f.setAccessible(true);
                            Object candidate = f.get(null);
                            if (candidate != null) return candidate;
                        }
                    }
                }
            } catch (Throwable ignored) {}
        }
        return null;
    }

    // =========================================================================
    // 4. CÀI ĐẶT AUTO FARM, KIM CƯƠNG & UP THUÊ (SETTINGS VIA SCHEMA)
    // =========================================================================

    public static void applyFarmSetup(String jsonStr) {
        ClassLoader cl = getClassLoader();
        if (cl == null) return;

        ModSchema schema = getCurrentSchema();

        int mode = extractJsonInt(jsonStr, "mode", 0);
        int animal = extractJsonInt(jsonStr, "animal", 3);
        int fish = extractJsonInt(jsonStr, "fish", 2);
        boolean harvestHearts = extractJsonBool(jsonStr, "harvestHearts", true);
        boolean dailyAttendance = extractJsonBool(jsonStr, "dailyAttendance", true);
        boolean deliverOrders = extractJsonBool(jsonStr, "deliverOrders", true);
        boolean hatchDragon = extractJsonBool(jsonStr, "hatchDragon", true);
        boolean trainDragon = extractJsonBool(jsonStr, "trainDragon", true);
        boolean noBuyWithGold = extractJsonBool(jsonStr, "noBuyWithGold", true);
        boolean buyMilkWithGold = extractJsonBool(jsonStr, "buyMilkWithGold", false);
        boolean upgradeStarfruit = extractJsonBool(jsonStr, "upgradeStarfruit", true);
        boolean feedBaby = extractJsonBool(jsonStr, "feedBaby", false);
        boolean upgradeBaby = extractJsonBool(jsonStr, "upgradeBaby", false);

        String sellProducts = extractJsonString(jsonStr, "sellProducts", "43");
        String backupSeeds = extractJsonString(jsonStr, "backupSeeds", "43");
        String backupDishes = extractJsonString(jsonStr, "backupDishes", "33");
        int sellThreshold = extractJsonInt(jsonStr, "sellThreshold", 30000);
        int sellQuantity = extractJsonInt(jsonStr, "sellQuantity", 10000);
        int replaceSeedThreshold = extractJsonInt(jsonStr, "replaceSeedThreshold", 32000);
        int maxStarfruitLevel = extractJsonInt(jsonStr, "maxStarfruitLevel", 12);

        try {
            Class<?> farmCls = cl.loadClass(schema.farmClassName);
            setStaticField(farmCls, schema.farmModeField, byte.class, (byte) mode);
            setStaticField(farmCls, schema.farmAnimalField, byte.class, (byte) animal);
            setStaticField(farmCls, schema.farmFishField, byte.class, (byte) fish);

            setStaticField(farmCls, schema.farmBackupDishesField, String.class, backupDishes);
            setStaticField(farmCls, schema.farmBackupSeedsField, String.class, backupSeeds);
            setStaticField(farmCls, schema.farmReplaceSeedThresholdField, int.class, replaceSeedThreshold);
            setStaticField(farmCls, schema.farmSellProductsField, String.class, sellProducts);
            setStaticField(farmCls, schema.farmSellThresholdField, int.class, sellThreshold);
            setStaticField(farmCls, schema.farmSellQuantityField, int.class, sellQuantity);
            setStaticField(farmCls, schema.farmMaxStarfruitLevelField, int.class, maxStarfruitLevel);

            setStaticField(farmCls, schema.farmDailyAttendanceField, boolean.class, dailyAttendance);
            setStaticField(farmCls, schema.farmUpgradeStarfruitField, boolean.class, upgradeStarfruit);
            setStaticField(farmCls, schema.farmHatchDragonField, boolean.class, hatchDragon);
            setStaticField(farmCls, schema.farmTrainDragonField, boolean.class, trainDragon);
            setStaticField(farmCls, schema.farmDeliverOrdersField, boolean.class, deliverOrders);
            setStaticField(farmCls, schema.farmNoBuyWithGoldField, boolean.class, noBuyWithGold);

            try {
                Class<?> babyCls = cl.loadClass(schema.farmBabyClassName);
                setStaticField(babyCls, schema.farmHarvestHeartsField, boolean.class, harvestHearts);
                setStaticField(babyCls, schema.farmFeedBabyField, boolean.class, feedBaby);
                setStaticField(babyCls, schema.farmBuyMilkWithGoldField, boolean.class, buyMilkWithGold);
                setStaticField(babyCls, schema.farmUpgradeBabyField, boolean.class, upgradeBaby);
            } catch (Throwable ignored) {}

            try {
                Method saveM = farmCls.getMethod(schema.farmSaveMethod);
                saveM.invoke(null);
            } catch (Throwable ignored) {}

            String animalStr = (animal == 0 ? "Gà" : (animal == 1 ? "Vịt" : (animal == 2 ? "Heo" : "Không")));
            String fishStr = (fish == 0 ? "Cá" : (fish == 1 ? "Rùa" : "Không"));
            System.out.println("🌾 [CÀI ĐẶT AUTO FARM]: Đã nạp thành công (" + schema.name + ") | Cơ chế: " + (mode == 0 ? "Lái buôn hỗ trợ" : "Farm thường") + " | Món ăn: " + backupDishes + " | Cây dự bị: " + backupSeeds + " (>=" + replaceSeedThreshold + ") | Bán NS: " + sellProducts + " (>=" + sellThreshold + ", sl:" + sellQuantity + ") | Nuôi: " + animalStr + " | Cá: " + fishStr + " | Cấp khế: " + maxStarfruitLevel);
        } catch (Throwable t) {
            System.err.println("[FARM SETUP ERR]: " + t.getMessage());
        }
    }

    public static void applyDiamondSetup(String jsonStr) {
        ClassLoader cl = getClassLoader();
        if (cl == null) return;

        ModSchema schema = getCurrentSchema();

        boolean sellOreOnFull = extractJsonBool(jsonStr, "sellOreOnFull", true);
        boolean autoFarm = extractJsonBool(jsonStr, "autoFarm", true);
        boolean autoDropKcx = extractJsonBool(jsonStr, "autoDropKcx", false);
        boolean autoDropNhb = extractJsonBool(jsonStr, "autoDropNhb", false);
        int farmIntervalMinutes = extractJsonInt(jsonStr, "farmIntervalMinutes", 60);
        boolean harvestOnTime = extractJsonBool(jsonStr, "harvestOnTime", true);
        int priorityOrder = extractJsonInt(jsonStr, "priorityOrder", 6);

        try {
            Class<?> diamCls = cl.loadClass(schema.diamondClassName);
            setStaticField(diamCls, schema.diamondSellOreOnFullField, boolean.class, sellOreOnFull);
            setStaticField(diamCls, schema.diamondAutoDropKcxField, boolean.class, autoDropKcx);
            setStaticField(diamCls, schema.diamondAutoDropNhbField, boolean.class, autoDropNhb);
            setStaticField(diamCls, schema.diamondAutoFarmField, boolean.class, autoFarm);
            setStaticField(diamCls, schema.diamondIntervalField, int.class, farmIntervalMinutes);
            setStaticField(diamCls, schema.diamondHarvestOnTimeField, boolean.class, harvestOnTime);
            setStaticField(diamCls, schema.diamondPriorityOrderField, byte.class, (byte) priorityOrder);

            try {
                Method saveM = diamCls.getMethod(schema.diamondSaveMethod);
                saveM.invoke(null);
            } catch (Throwable ignored) {}

            String[] priorityNames = new String[] { "Vàng", "Trắng", "Đỏ", "Xanh lam", "Xanh lá", "Tím", "Mặc định" };
            String pName = (priorityOrder >= 0 && priorityOrder < priorityNames.length) ? priorityNames[priorityOrder] : "Mặc định";

            // Cập nhật ngay lập tức nếu Auto Kim Cương đang chạy
            AutoTaskInfo activeTask = getActiveAutoTask();
            if (activeTask != null && "diamond".equalsIgnoreCase(activeTask.autoType) && activeTask.taskInstance != null) {
                long newIntervalMs = (long) farmIntervalMinutes * 60000L;
                setField(activeTask.taskInstance, schema.diamondTargetMsField, newIntervalMs, long.class);
                setField(activeTask.taskInstance, schema.diamondAbsTargetMsField, System.currentTimeMillis() + newIntervalMs, long.class);
            }

            System.out.println("💎 [CÀI ĐẶT AUTO KIM CƯƠNG]: Đã nạp thành công (" + schema.name + ") | Bán đá đầy rương: " + sellOreOnFull + " | Tự về farm: " + autoFarm + " (" + farmIntervalMinutes + " phút) | Thu hoạch đúng giờ: " + harvestOnTime + " | Thứ tự ưu tiên: " + pName + " | Tự bỏ KCX: " + autoDropKcx + " | Tự bỏ NHB: " + autoDropNhb);
        } catch (Throwable t) {
            System.err.println("[DIAMOND SETUP ERR]: " + t.getMessage());
        }
    }

    public static void applyFishSetup(String jsonStr) {
        ClassLoader cl = getClassLoader();
        if (cl == null) return;

        ModSchema schema = getCurrentSchema();

        int mapType = extractJsonInt(jsonStr, "mapType", 0);
        int rodType = extractJsonInt(jsonStr, "rodType", 0);
        int sellFishType = extractJsonInt(jsonStr, "sellFishType", 0);
        String excludeFish = extractJsonString(jsonStr, "excludeFish", "");
        boolean autoBuyTicket = extractJsonBool(jsonStr, "autoBuyTicket", true);
        boolean backToFarm = extractJsonBool(jsonStr, "backToFarm", true);
        int farmIntervalMinutes = extractJsonInt(jsonStr, "farmIntervalMinutes", 30);
        boolean harvestOnTime = extractJsonBool(jsonStr, "harvestOnTime", true);
        boolean sellKcx = extractJsonBool(jsonStr, "sellKcx", false);
        int sellKcxThreshold = extractJsonInt(jsonStr, "sellKcxThreshold", 5);

        try {
            if (schema.fishClassName != null && !schema.fishClassName.isEmpty()) {
                Class<?> fishCls = cl.loadClass(schema.fishClassName);
                setStaticField(fishCls, schema.fishMapField, byte.class, (byte) mapType);
                setStaticField(fishCls, schema.fishRodField, byte.class, (byte) rodType);
                setStaticField(fishCls, schema.fishSellTypeField, byte.class, (byte) sellFishType);
                setStaticField(fishCls, schema.fishExcludeField, String.class, excludeFish);
                setStaticField(fishCls, schema.fishAutoBuyTicketField, boolean.class, autoBuyTicket);
                setStaticField(fishCls, schema.fishBackToFarmField, boolean.class, backToFarm);
                setStaticField(fishCls, schema.fishFarmIntervalField, int.class, farmIntervalMinutes);
                setStaticField(fishCls, schema.fishHarvestOnTimeField, boolean.class, harvestOnTime);
                setStaticField(fishCls, schema.fishSellKcxField, boolean.class, sellKcx);
                setStaticField(fishCls, schema.fishSellKcxThresholdField, int.class, sellKcxThreshold);

                try {
                    Method saveM = fishCls.getMethod(schema.fishSaveMethod);
                    saveM.invoke(null);
                } catch (Throwable ignored) {}
            }

            String[] mapNames = new String[] { "Map 1 (Cá rô, chép vàng)", "Map 2 (Cá lóc, nóc, cua)", "Map 3 (Cá mập, chim, đuối, ngựa)" };
            String mName = (mapType >= 0 && mapType < mapNames.length) ? mapNames[mapType] : ("Map " + mapType);
            String[] rodNames = new String[] { "Không mua", "Cần VIP", "Cần Sắt", "Cần Tre" };
            String rName = (rodType >= 0 && rodType < rodNames.length) ? rodNames[rodType] : "Không mua";
            String[] sellNames = new String[] { "Bán tại chỗ", "Bán KST", "Bỏ cá" };
            String sName = (sellFishType >= 0 && sellFishType < sellNames.length) ? sellNames[sellFishType] : "Bán tại chỗ";

            // Cập nhật ngay lập tức nếu Auto Câu Cá đang chạy
            AutoTaskInfo activeTask = getActiveAutoTask();
            if (activeTask != null && "fish".equalsIgnoreCase(activeTask.autoType) && activeTask.taskInstance != null) {
                long newIntervalMs = (long) farmIntervalMinutes * 60000L;
                setField(activeTask.taskInstance, "do", newIntervalMs, long.class);
                setField(activeTask.taskInstance, schema.fishTargetMsField, System.currentTimeMillis() + newIntervalMs, long.class);
            }

            System.out.println("🎣 [CÀI ĐẶT AUTO CÂU CÁ]: Đã nạp thành công (" + schema.name + ") | Map: " + mName + " | Cần câu: " + rName + " | Bán cá: " + sName + " | Tự mua vé: " + autoBuyTicket + " | Về farm: " + backToFarm + " (" + farmIntervalMinutes + "p) | Bán KCX: " + sellKcx + " (SL: " + sellKcxThreshold + ") | Ngoại trừ: " + excludeFish);
        } catch (Throwable t) {
            System.err.println("[FISH SETUP ERR]: " + t.getMessage());
        }
    }

    public static void applySellOreSetup(String jsonStr) {
        ClassLoader cl = getClassLoader();
        if (cl == null) return;

        ModSchema schema = getCurrentSchema();

        int sellIntervalMinutes = extractJsonInt(jsonStr, "sellIntervalMinutes", 15);
        int delayMs = extractJsonInt(jsonStr, "delayMs", 100);
        int zoneFrom = extractJsonInt(jsonStr, "zoneFrom", 20);
        int zoneTo = extractJsonInt(jsonStr, "zoneTo", 79);
        boolean resetTimeOnNhb = extractJsonBool(jsonStr, "resetTimeOnNhb", true);
        boolean resetTimeOnKcx = extractJsonBool(jsonStr, "resetTimeOnKcx", false);
        boolean dropNhbIfFailed = extractJsonBool(jsonStr, "dropNhbIfFailed", true);
        boolean dropKcxIfFailed = extractJsonBool(jsonStr, "dropKcxIfFailed", true);

        try {
            if (schema.sellOreClassName != null && !schema.sellOreClassName.isEmpty()) {
                Class<?> sellCls = cl.loadClass(schema.sellOreClassName);
                setStaticField(sellCls, schema.sellOreIntervalField, int.class, sellIntervalMinutes);
                setStaticField(sellCls, schema.sellOreDelayMsField, long.class, (long) delayMs);
                setStaticField(sellCls, schema.sellOreZoneFromField, int.class, zoneFrom);
                setStaticField(sellCls, schema.sellOreZoneToField, int.class, zoneTo);
                setStaticField(sellCls, schema.sellOreResetNhbField, boolean.class, resetTimeOnNhb);
                setStaticField(sellCls, schema.sellOreResetKcxField, boolean.class, resetTimeOnKcx);
                setStaticField(sellCls, schema.sellOreDropNhbField, boolean.class, dropNhbIfFailed);
                setStaticField(sellCls, schema.sellOreDropKcxField, boolean.class, dropKcxIfFailed);

                try {
                    Method saveM = sellCls.getMethod(schema.sellOreSaveMethod);
                    saveM.invoke(null);
                } catch (Throwable ignored) {}
            }

            System.out.println("🪨 [CÀI ĐẶT AUTO BÁN ĐÁ]: Đã nạp thành công (" + schema.name + ") | Thời gian: " + sellIntervalMinutes + " phút | Quãng nghỉ: " + delayMs + "ms | Khu bán: " + zoneFrom + " -> " + zoneTo + " | Reset NHB: " + resetTimeOnNhb + " | Reset KCX: " + resetTimeOnKcx + " | Bỏ NHB: " + dropNhbIfFailed + " | Bỏ KCX: " + dropKcxIfFailed);
        } catch (Throwable t) {
            System.err.println("[SELL ORE SETUP ERR]: " + t.getMessage());
        }
    }

    public static void applyUpThueSetup(int targetCoins, int upDays) {
        ClassLoader cl = getClassLoader();
        if (cl == null) return;

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> aQCls = cl.loadClass(schema.upThueClassName);
            setStaticField(aQCls, schema.targetCoinsField, int.class, targetCoins);
            setStaticField(aQCls, schema.upDaysField, long.class, (long) upDays);
            setStaticField(aQCls, schema.startedTsField, long.class, System.currentTimeMillis());

            // Lưu RMS thông qua schema
            try {
                Class<?> saveCls = cl.loadClass(schema.upThueSaveRmsClass);
                Method saveMethod = saveCls.getMethod(schema.upThueSaveRmsMethod);
                saveMethod.invoke(null);
            } catch (Throwable ignored) {}

            // Cập nhật UI thông qua schema
            try {
                Method aQDoMethod = aQCls.getMethod(schema.upThueSingletonMethod);
                Object aQInstance = aQDoMethod.invoke(null);
                if (aQInstance != null) {
                    Method fmtMethod = aQCls.getMethod(schema.upThueFormatDateMethod);
                    fmtMethod.invoke(aQInstance);
                }
            } catch (Throwable ignored) {}

            System.out.println("✅ [CÀI ĐẶT UP THUÊ]: Đã cập nhật -> Mục tiêu: " + (targetCoins > 0 ? (targetCoins + " Xu") : "Không giới hạn") + ", Thời gian: " + (upDays > 0 ? (upDays + " Ngày") : "Vĩnh viễn"));
        } catch (Throwable t) {
            System.err.println("[UP THUÊ SETUP ERR]: " + t.getMessage());
        }
    }

    public static void resetUpThueData() {
        ClassLoader cl = getClassLoader();
        if (cl == null) return;

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> aQCls = cl.loadClass(schema.upThueClassName);
            setStaticField(aQCls, schema.targetCoinsField, int.class, 0);
            setStaticField(aQCls, schema.earnedCoinsField, int.class, 0);
            setStaticField(aQCls, schema.collectedHeartsField, int.class, 0);
            setStaticField(aQCls, schema.upDaysField, long.class, 0L);
            setStaticField(aQCls, schema.startedTsField, long.class, System.currentTimeMillis());

            try {
                Class<?> saveCls = cl.loadClass(schema.upThueSaveRmsClass);
                Method resetMethod = saveCls.getMethod(schema.upThueResetRmsMethod);
                resetMethod.invoke(null);
            } catch (Throwable ignored) {}

            try {
                Method aQDoMethod = aQCls.getMethod(schema.upThueSingletonMethod);
                Object aQInstance = aQDoMethod.invoke(null);
                if (aQInstance != null) {
                    setField(aQInstance, schema.expiresAtStringField, "Vĩnh viễn", String.class);
                    Method fmtMethod = aQCls.getMethod(schema.upThueFormatDateMethod);
                    fmtMethod.invoke(aQInstance);
                }
            } catch (Throwable ignored) {}

            System.out.println("🔄 [RESET DỮ LIỆU]: Đã reset toàn bộ thông số cày xu, tim và ngày up về hiện tại (Vĩnh viễn)!");
        } catch (Throwable t) {
            System.err.println("[RESET ERR]: " + t.getMessage());
        }
    }

    // =========================================================================
    // 5. ĐIỀU KHIỂN TIẾN TRÌNH AUTO (START / STOP / MONITOR VIA SCHEMA)
    // =========================================================================

    public static boolean startAuto(String autoType) {
        ClassLoader cl = getClassLoader();
        if (cl == null) return false;

        stopAuto();
        try { Thread.sleep(350); } catch (InterruptedException ignored) {}

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> taskCtrlCls = cl.loadClass(schema.taskControllerClassName);
            Class<?> taskArgCls = cl.loadClass(schema.taskArgClassName);

            Object taskObj = null;

            if ("farm".equalsIgnoreCase(autoType)) {
                if (schema.farmTraderTaskClassName != null && !schema.farmTraderTaskClassName.isEmpty()) {
                    Class<?> farmCls = cl.loadClass(schema.farmClassName);
                    Byte modeObj = (Byte) getStaticField(farmCls, schema.farmModeField, byte.class);
                    byte mode = (modeObj != null) ? modeObj.byteValue() : 0;
                    taskObj = (mode == 0) ? cl.loadClass(schema.farmTraderTaskClassName).newInstance() : farmCls.newInstance();
                } else {
                    taskObj = cl.loadClass(schema.farmTaskClassName).newInstance();
                }
                Method doMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls);
                doMethod.invoke(null, taskObj);
                System.out.println("🌾 [BẬT AUTO FARM]: Đã kích hoạt Auto Farm [" + schema.name + "]!");
                System.out.println("[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"farm\",\"status\":\"running\",\"message\":\"Đang chạy Auto Farm...\"}");
                return true;
            } else if ("diamond".equalsIgnoreCase(autoType) || "kc".equalsIgnoreCase(autoType)) {
                Class<?> diamCls = cl.loadClass(schema.diamondClassName);
                taskObj = null;
                try {
                    Method getInst = diamCls.getMethod(schema.diamondSingletonMethod);
                    taskObj = getInst.invoke(null);
                } catch (Throwable ignored) {}
                if (taskObj == null) {
                    taskObj = diamCls.newInstance();
                }

                // Khởi tạo phương thức reset/init của Mod (void_do() / do() trong X)
                try {
                    Method initM = diamCls.getMethod("do");
                    initM.invoke(taskObj);
                } catch (Throwable ignored) {}

                // Đặt thời gian hẹn giờ về farm (soXu = now + intervalMs) để không bị lập tức nhảy về nông trại
                long intervalMs = 60 * 60000L;
                try {
                    Integer minsObj = (Integer) getStaticField(diamCls, schema.diamondIntervalField, int.class);
                    if (minsObj != null && minsObj.intValue() > 0) {
                        intervalMs = (long) minsObj.intValue() * 60000L;
                    }
                } catch (Throwable ignored) {}

                setField(taskObj, schema.diamondTargetMsField, intervalMs, long.class);
                setField(taskObj, schema.diamondAbsTargetMsField, System.currentTimeMillis() + intervalMs, long.class);

                Method doMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls);
                doMethod.invoke(null, taskObj);
                System.out.println("💎 [BẬT AUTO KIM CƯƠNG]: Đã kích hoạt Auto Đào Kim Cương [" + schema.name + "] (Hẹn về farm: " + (intervalMs / 60000) + " phút)!");
                System.out.println("[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"diamond\",\"status\":\"running\",\"message\":\"Đang chạy Auto Đào Kim Cương...\"}");
                return true;
            } else if ("fish".equalsIgnoreCase(autoType) || "cau_ca".equalsIgnoreCase(autoType) || "cc".equalsIgnoreCase(autoType)) {
                if (schema.fishTaskClassName != null && !schema.fishTaskClassName.isEmpty()) {
                    Class<?> fishCls = cl.loadClass(schema.fishTaskClassName);
                    try {
                        String sMethod = (schema.fishSingletonMethod != null && !schema.fishSingletonMethod.isEmpty()) ? schema.fishSingletonMethod : "do";
                        Method instM = fishCls.getMethod(sMethod);
                        taskObj = instM.invoke(null);
                    } catch (Throwable ignored) {
                        try {
                            taskObj = fishCls.newInstance();
                        } catch (Throwable ignored2) {}
                    }
                    if (taskObj != null) {
                        // Gọi hàm new() để bS khởi tạo Map ID và trạng thái câu cá
                        try {
                            Method newM = fishCls.getMethod("new");
                            newM.invoke(taskObj);
                        } catch (Throwable ignored) {}

                        // Khởi tạo thời gian về farm
                        long intervalMs = 30 * 60000L;
                        try {
                            Integer minsObj = (Integer) getStaticField(fishCls, schema.fishFarmIntervalField, int.class);
                            if (minsObj != null && minsObj.intValue() > 0) {
                                intervalMs = (long) minsObj.intValue() * 60000L;
                            }
                        } catch (Throwable ignored) {}

                        setField(taskObj, "do", intervalMs, long.class);
                        setField(taskObj, schema.fishTargetMsField, System.currentTimeMillis() + intervalMs, long.class);

                        Method doMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls);
                        doMethod.invoke(null, taskObj);
                        System.out.println("🎣 [BẬT AUTO FISH]: Đã kích hoạt Auto Câu Cá [" + schema.name + "] (Hẹn về farm: " + (intervalMs / 60000) + " phút)!");
                        System.out.println("[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"fish\",\"status\":\"running\",\"message\":\"Đang chạy Auto Câu Cá...\"}");
                        return true;
                    }
                } else {
                    System.err.println("⚠️ [KHÔNG HỖ TRỢ]: Bản mod đang chạy [" + schema.name + "] không có Auto Câu Cá. Vui lòng đổi sang [avatar_fish_build40.jar] trong Quản Lý File!");
                    System.out.println("[AUTO_STATUS]: {\"isRunning\":false,\"status\":\"error\",\"message\":\"Bản mod hiện tại không hỗ trợ Auto Câu Cá. Hãy chọn file avatar_fish_build40.jar!\"}");
                }
            } else if ("sell_ore".equalsIgnoreCase(autoType) || "banda".equalsIgnoreCase(autoType) || "stone".equalsIgnoreCase(autoType) || "bd".equalsIgnoreCase(autoType)) {
                if (schema.sellOreTaskClassName != null && !schema.sellOreTaskClassName.isEmpty()) {
                    Class<?> sellCls = cl.loadClass(schema.sellOreTaskClassName);
                    taskObj = sellCls.newInstance();
                    Method doMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls);
                    doMethod.invoke(null, taskObj);
                    System.out.println("🪨 [BẬT AUTO BÁN ĐÁ]: Đã kích hoạt Auto Bán Đá [" + schema.name + "]!");
                    System.out.println("[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"sell_ore\",\"status\":\"running\",\"message\":\"Đang chạy Auto Bán Đá...\"}");
                    return true;
                }
            }
        } catch (Throwable t) {
            System.err.println("[START_AUTO ERR]: " + t.getMessage());
        }

        return false;
    }

    public static void stopAuto() {
        ClassLoader cl = getClassLoader();
        if (cl == null) return;

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> taskCtrlCls = cl.loadClass(schema.taskControllerClassName);
            Method stopMethod = taskCtrlCls.getMethod(schema.taskStopMethod);
            stopMethod.invoke(null);
        } catch (Throwable ignored) {}

        System.out.println("⏹️ [DỪNG AUTO]: Đã dừng tiến trình Auto.");
        System.out.println("[AUTO_STATUS]: {\"isRunning\":false,\"status\":\"stopped\",\"message\":\"Đã dừng Auto\"}");
    }

    public static AutoTaskInfo getActiveAutoTask() {
        ClassLoader cl = getClassLoader();
        if (cl == null) return null;

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> taskCtrlCls = cl.loadClass(schema.taskControllerClassName);
            Class<?> taskArgCls = (schema.taskArgClassName != null && !schema.taskArgClassName.isEmpty()) 
                                    ? cl.loadClass(schema.taskArgClassName) : null;

            for (Field f : taskCtrlCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    if (taskArgCls != null && taskArgCls.isAssignableFrom(f.getType())) {
                        f.setAccessible(true);
                        Object task = f.get(null);
                        if (task != null && taskArgCls.isInstance(task)) {
                            String clsName = task.getClass().getSimpleName();
                            String friendly = null;
                            String type = null;

                            if (clsName.equals(schema.farmTaskClassName)) {
                                friendly = "Auto Farm (Nông trại)";
                                type = "farm";
                            } else if (clsName.equals(schema.farmTraderTaskClassName)) {
                                friendly = "Auto Farm (Lái buôn hỗ trợ)";
                                type = "farm";
                            } else if (clsName.equals(schema.diamondTaskClassName)) {
                                friendly = "Auto Đào Kim Cương";
                                type = "diamond";
                            } else if (clsName.equals(schema.fishTaskClassName) || "AutoCauCa".equals(clsName) || "bS".equals(clsName)) {
                                friendly = "Auto Câu Cá";
                                type = "fish";
                            } else if (clsName.equals(schema.sellOreTaskClassName) || "AutoBanDa".equals(clsName) || "al".equals(clsName) || "c".equals(clsName)) {
                                friendly = "Auto Bán Đá";
                                type = "sell_ore";
                            }

                            if (type != null) {
                                return new AutoTaskInfo(task, clsName, friendly, type);
                            }
                        }
                    }
                }
            }
        } catch (Throwable ignored) {}

        return null;
    }

    // =========================================================================
    // 6. HELPER REFLECTION & RMS UTILITIES
    // =========================================================================

    public static void setField(Object obj, String fieldName, Object val, Class<?> expectedType) {
        if (obj == null) return;
        try {
            Class<?> c = obj.getClass();
            while (c != null) {
                for (Field f : c.getDeclaredFields()) {
                    if (f.getName().equals(fieldName) && (expectedType == null || expectedType.isAssignableFrom(f.getType()))) {
                        f.setAccessible(true);
                        f.set(obj, val);
                        return;
                    }
                }
                c = c.getSuperclass();
            }
        } catch (Throwable ignored) {}
    }

    public static void setStaticField(Class<?> cls, String name, Class<?> type, Object value) {
        if (cls == null || name == null) return;
        try {
            for (Field f : cls.getDeclaredFields()) {
                if (f.getName().equals(name) && f.getType().equals(type) && java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    f.setAccessible(true);
                    f.set(null, value);
                    return;
                }
            }
        } catch (Throwable ignored) {}
    }

    public static Object getStaticField(Class<?> cls, String name, Class<?> type) {
        if (cls == null || name == null) return null;
        try {
            for (Field f : cls.getDeclaredFields()) {
                if (f.getName().equals(name) && f.getType().equals(type) && java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    f.setAccessible(true);
                    return f.get(null);
                }
            }
        } catch (Throwable ignored) {}
        return null;
    }

    public static String[] readCredentialsFromRms(String appId) {
        try {
            if (appId == null || appId.isEmpty()) appId = "avatar_main";
            File rmsDir = new File("./.microemulator/suite-" + appId);
            File loginRms = new File(rmsDir, "2.5.8avlogin.rs");
            if (!loginRms.exists()) return null;

            DataInputStream dis = new DataInputStream(new FileInputStream(loginRms));
            dis.readUTF();
            dis.readInt();
            dis.readLong();
            dis.readInt();

            int recId = dis.readInt();
            int dataLen = dis.readInt();
            byte[] rawData = new byte[dataLen];
            dis.readFully(rawData);
            dis.close();

            byte[] dec = new byte[dataLen];
            for (int i = 0; i < dataLen; i++) {
                dec[i] = (byte) (~rawData[i]);
            }

            DataInputStream dataIn = new DataInputStream(new ByteArrayInputStream(dec));
            dataIn.readUTF();
            dataIn.readByte();
            dataIn.readUTF();
            String user1 = dataIn.readUTF();
            String pass1 = dataIn.readUTF();
            String user2 = "";
            String pass2 = "";
            try {
                user2 = dataIn.readUTF();
                pass2 = dataIn.readUTF();
            } catch (Throwable ignored) {}

            String finalU = (user2 != null && !user2.isEmpty()) ? user2 : user1;
            String finalP = (pass2 != null && !pass2.isEmpty()) ? pass2 : pass1;
            return new String[] { finalU, finalP };
        } catch (Throwable ignored) {}
        return null;
    }

    public static String extractJsonString(String json, String key, String defVal) {
        try {
            Pattern p = Pattern.compile("\"" + key + "\"\\s*:\\s*\"([^\"]*)\"");
            Matcher m = p.matcher(json);
            if (m.find()) return m.group(1);

            Pattern p2 = Pattern.compile("\"" + key + "\"\\s*:\\s*([^,}\\]\\s]+)");
            Matcher m2 = p2.matcher(json);
            if (m2.find()) return m2.group(1).replace("\"", "").trim();
        } catch (Throwable ignored) {}
        return defVal;
    }

    public static int extractJsonInt(String json, String key, int defVal) {
        try {
            Pattern p = Pattern.compile("\"" + key + "\"\\s*:\\s*\"?(-?\\d+)\"?");
            Matcher m = p.matcher(json);
            if (m.find()) return Integer.parseInt(m.group(1));
        } catch (Throwable ignored) {}
        return defVal;
    }

    public static boolean extractJsonBool(String json, String key, boolean defVal) {
        try {
            Pattern p = Pattern.compile("\"" + key + "\"\\s*:\\s*(true|false)");
            Matcher m = p.matcher(json);
            if (m.find()) return Boolean.parseBoolean(m.group(1));
        } catch (Throwable ignored) {}
        return defVal;
    }
}
