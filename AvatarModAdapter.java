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

    private static long lastLoggedCropRemainingSec = -1L;
    private static long lastSmartFarmLogTs = 0L;
    private static long lastDiagnosticLogTs = 0L;
    private static boolean wasInFarmDiamond = false;
    private static boolean wasInFarmFish = false;
    private static long lastKnownDiamondTargetMs = 0L;
    private static long lastKnownFishTargetMs = 0L;

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

        // 3. Fallback kiểm tra qua Network class
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

        // Nếu không có player và không có kết nối socket xác thực -> Chưa kết nối
        return false;
    }

    public static String checkActiveGameDialog() {
        ClassLoader cl = getClassLoader();
        if (cl == null) return null;

        ModSchema schema = getCurrentSchema();
        String pointerType = (schema.dialogPointerType != null && !schema.dialogPointerType.isEmpty()) ? schema.dialogPointerType : "bt";

        try {
            Class<?> containerCls = cl.loadClass(schema.dialogContainerClass);

            // 1. Kiểm tra đối tượng active dialog trong container
            // Trong Up Xu (br.class): public static bt do là con trỏ dialog đang mở (h extends bt).
            // Trong Fish (bx.class): public static dJ do là con trỏ dialog đang mở (s extends dJ).
            // CHÚ Ý: Biến h do và s do là instance tái sử dụng (luôn != null và giữ nội dung cũ).
            // CHỈ DUY NHẤT biến kiểu bt (hoặc dJ) là con trỏ dialog thực: khi đóng = null, khi mở != null!
            for (Field f : containerCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    String fTypeName = f.getType().getSimpleName();
                    if (fTypeName.equals(pointerType) || fTypeName.equals("bt") || fTypeName.equals("dJ")) {
                        f.setAccessible(true);
                        Object dObj = f.get(null);
                        // Khi dialog đóng (sau br.case() hoặc chưa mở), con trỏ này bằng null 100%!
                        if (dObj == null) {
                            return null;
                        }
                        // Khi có dialog mở, trích xuất chuỗi thông báo từ dialog đó
                        String msg = extractDialogText(dObj);
                        if (msg != null && !msg.trim().isEmpty() && msg.length() > 2) {
                            String buttons = extractDialogButtons(dObj);
                            if (buttons != null && !buttons.trim().isEmpty()) {
                                String trimmedButtons = buttons.trim();
                                if (!msg.contains("(" + trimmedButtons + ")") && !msg.equalsIgnoreCase(trimmedButtons)) {
                                    return msg.trim() + " (" + trimmedButtons + ")";
                                }
                            }
                            return msg.trim();
                        }
                    }
                }
            }
        } catch (Throwable ignored) {}

        return null;
    }

    public static String extractDialogButtons(Object obj) {
        if (obj == null) return null;
        java.util.LinkedHashSet<String> buttons = new java.util.LinkedHashSet<String>();
        Class<?> cls = obj.getClass();
        while (cls != null && !cls.equals(Object.class)) {
            for (Field f : cls.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    try {
                        f.setAccessible(true);
                        Object val = f.get(obj);
                        if (val == null) continue;

                        if (val instanceof java.util.Vector) {
                            java.util.Vector<?> vec = (java.util.Vector<?>) val;
                            for (int i = 0; i < vec.size(); i++) {
                                Object item = vec.elementAt(i);
                                String bText = extractButtonLabel(item);
                                if (bText != null && !bText.isEmpty()) {
                                    buttons.add(bText);
                                }
                            }
                        } else {
                            String bText = extractButtonLabel(val);
                            if (bText != null && !bText.isEmpty()) {
                                buttons.add(bText);
                            }
                        }
                    } catch (Throwable ignored) {}
                }
            }
            cls = cls.getSuperclass();
        }
        if (buttons.isEmpty()) return null;
        StringBuilder sb = new StringBuilder();
        for (String b : buttons) {
            if (sb.length() > 0) sb.append(", ");
            sb.append(b);
        }
        return sb.toString();
    }

    private static String extractButtonLabel(Object item) {
        if (item == null) return null;
        if (item instanceof String) return null; // Tuyệt đối không lấy String thông thường làm nút bấm

        Class<?> cCls = item.getClass();
        String sName = cCls.getSimpleName();
        // Chỉ chấp nhận Command / Button object chính thức của Avatar Mod:
        // "ei" trong Avatar Up Xu (build 34)
        // "fL" trong Avatar Fish (build 40)
        if (!sName.equals("ei") && !sName.equals("fL")) {
            return null;
        }

        for (Field f : cCls.getDeclaredFields()) {
            if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(String.class)) {
                try {
                    f.setAccessible(true);
                    String s = (String) f.get(item);
                    if (s != null) {
                        s = s.trim();
                        if (isValidButtonLabel(s)) {
                            return s;
                        }
                    }
                } catch (Throwable ignored) {}
            }
        }
        return null;
    }

    private static boolean isValidButtonLabel(String s) {
        if (s == null) return false;
        String trimmed = s.trim();
        if (trimmed.isEmpty() || trimmed.length() > 30) return false;
        if (trimmed.contains("0123456789") || trimmed.contains("abcdefghijklmnopqrstuvwxyz") || 
            trimmed.startsWith("http") || trimmed.endsWith(".png") || trimmed.endsWith(".av") || 
            trimmed.endsWith(".on") || trimmed.endsWith(".mid") || trimmed.contains("/")) {
            return false;
        }
        return true;
    }

    private static String extractDialogText(Object obj) {
        if (obj == null) return null;
        Class<?> cls = obj.getClass();
        while (cls != null && !cls.equals(Object.class)) {
            for (Field f : cls.getDeclaredFields()) {
                if (f.getType().equals(String.class)) {
                    try {
                        f.setAccessible(true);
                        String s = (String) f.get(obj);
                        if (s != null && !s.trim().isEmpty() && s.length() > 2) {
                            // Loại trừ link, file extension và bảng mã ký tự font
                            if (s.contains("0123456789") || s.contains("abcdefghijklmnopqrstuvwxyz") || 
                                s.startsWith("http") || s.endsWith(".png") || s.endsWith(".av") || s.endsWith(".on")) {
                                continue;
                            }
                            return s.trim();
                        }
                    } catch (Throwable ignored) {}
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static void dismissStartupPopups() {
        String activeDlg = checkActiveGameDialog();
        if (activeDlg != null && !activeDlg.trim().isEmpty()) {
            dismissCurrentDialog();
        }
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

                        // 2. Nhấn xác nhận (Center key -5, Left Softkey -6, Enter 10)
                        int[] confirmKeys = new int[] { -5, -6, 10 };
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
        ClassLoader cl = getClassLoader();
        if (cl != null) {
            ModSchema schema = getCurrentSchema();
            if (schema.dialogContainerClass != null) {
                try {
                    Class<?> containerCls = cl.loadClass(schema.dialogContainerClass);
                    Method caseM = containerCls.getMethod("case");
                    caseM.invoke(null);
                } catch (Throwable ignored) {}
            }
        }
        selectDialogOptionLeftAndConfirm();
    }

    // =========================================================================
    // 3. TRÍCH XUẤT THÔNG SỐ TÀI KHOẢN (PLAYER STATS)
    private static long lastKnownCoins = 0;
    private static int lastKnownGold = 0;
    private static int lastKnownLockedGold = 0;

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
                                    if (stats.coins > 0) lastKnownCoins = stats.coins;
                                    if (moneyArr.length > 1 && moneyArr[1] > 0) {
                                        stats.gold = moneyArr[1];
                                        lastKnownGold = stats.gold;
                                    }
                                    if (moneyArr.length > 2 && moneyArr[2] > 0) {
                                        stats.gold = moneyArr[2];
                                        lastKnownGold = stats.gold;
                                    }
                                }
                            }

                            // Lượng khóa (int)
                            if (!isStatic && f.getName().equals(schema.playerLockedGoldField) && f.getType().equals(int.class)) {
                                stats.lockedGold = f.getInt(playerObj);
                                if (stats.lockedGold > 0) lastKnownLockedGold = stats.lockedGold;
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

        if (stats.coins == 0 && lastKnownCoins > 0) stats.coins = lastKnownCoins;
        if (stats.gold == 0 && lastKnownGold > 0) stats.gold = lastKnownGold;
        if (stats.lockedGold == 0 && lastKnownLockedGold > 0) stats.lockedGold = lastKnownLockedGold;

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

    /**
     * Kích hoạt cơ chế tính giờ thu hoạch nông sản thông minh của Mod.
     * Up Xu: aC.goto() -> tính l0 = aC.do() (thời gian cây chín). Nếu có cây (l0 > 0 && l0 < X.if) thì X.do().do = now + l0 + 60000L.
     * Fish mod: bq.byte() cho Kim Cương (aj.do), bq.break() cho Câu Cá (bS.if).
     */
    public static boolean updateSmartCropTimer(ClassLoader cl, ModSchema schema, boolean isDiamond) {
        return updateSmartCropTimer(cl, schema, isDiamond, false);
    }

    public static boolean updateSmartCropTimer(ClassLoader cl, ModSchema schema, boolean isDiamond, boolean forceLog) {
        if (cl == null || schema == null) return false;
        try {
            if (schema.farmClassName != null && !schema.farmClassName.isEmpty()) {
                Class<?> farmCls = cl.loadClass(schema.farmClassName);

                // 0. Kiểm tra an toàn: nếu mảng ô đất nông sản trong RAM chưa nạp (chưa vào farm lần nào) -> bỏ qua
                try {
                    Class<?> bFCls = cl.loadClass("bF");
                    Field intF = bFCls.getDeclaredField("int");
                    intF.setAccessible(true);
                    Object plots = intF.get(null);
                    if (plots == null) {
                        return false;
                    }
                } catch (Throwable ignored) {}

                // 1. Kiểm tra thời gian còn lại của cây trồng trong RAM (hàm static long do() của aC / bq)
                long remainingCropMs = -1L;
                try {
                    for (Method m : farmCls.getDeclaredMethods()) {
                        if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && 
                            m.getParameterCount() == 0 && 
                            m.getReturnType().equals(long.class) && 
                            m.getName().equals("do")) {
                            m.setAccessible(true);
                            remainingCropMs = (long) m.invoke(null);
                            break;
                        }
                    }
                } catch (Throwable ignored) {}

                // 2. Kích hoạt hàm tính giờ của Mod:
                String methodName;
                if ("aC".equals(schema.farmClassName)) {
                    methodName = "goto";
                } else {
                    methodName = isDiamond ? "byte" : "break";
                }

                Method farmTimerMethod = farmCls.getDeclaredMethod(methodName);
                farmTimerMethod.setAccessible(true);
                farmTimerMethod.invoke(null);

                long remainingSec = remainingCropMs > 0 ? (remainingCropMs / 1000L) : 0L;
                long nowTs = System.currentTimeMillis();

                // Chống spam log: chỉ in khi forceLog = true hoặc qua chu kỳ mới (chênh lệch >= 300s & cách lần in trước >= 60s)
                boolean shouldLog = forceLog || (lastLoggedCropRemainingSec == -1L) ||
                                    (Math.abs(remainingSec - lastLoggedCropRemainingSec) >= 300L && (nowTs - lastSmartFarmLogTs >= 60000L));

                // Nếu 2 luồng gọi gần như đồng thời (trong 3s) với cùng số giây còn lại thì bỏ qua log lặp lại
                if (nowTs - lastSmartFarmLogTs < 3000L && Math.abs(remainingSec - lastLoggedCropRemainingSec) < 5L) {
                    shouldLog = false;
                }

                if (shouldLog) {
                    if (remainingCropMs > 0) {
                        long mins = (remainingCropMs + 60000L) / 60000L;
                        System.out.println("🌾 [FARM THÔNG MINH]: Cây trồng trong farm sẽ chín sau " + mins + " phút (" + remainingSec + "s). Đã tự động hẹn giờ về thu hoạch đúng giờ!");
                    } else if (remainingCropMs == 0) {
                        System.out.println("🌾 [FARM THÔNG MINH]: Nông sản đã chín! Đang hẹn giờ về thu hoạch ngay...");
                    }
                    lastLoggedCropRemainingSec = remainingSec;
                    lastSmartFarmLogTs = nowTs;
                }
                return true;
            }
        } catch (Throwable ignored) {}
        return false;
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
                boolean isCurrentlyInFarmFromAuto = false;

                // Nếu bot đang về chăm farm từ Auto Kim Cương (activeTask.autoType là farm, và parent task là kim cương)
                if (activeTask != null && "farm".equalsIgnoreCase(activeTask.autoType) && activeTask.taskInstance != null) {
                    try {
                        Class<?> taskBaseCls = activeTask.taskInstance.getClass();
                        while (taskBaseCls != null && !taskBaseCls.equals(Object.class)) {
                            for (Field f : taskBaseCls.getDeclaredFields()) {
                                if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && (f.getName().equals("do") || f.getType().getName().equals(diamCls.getName()))) {
                                    f.setAccessible(true);
                                    Object parent = f.get(activeTask.taskInstance);
                                    if (parent != null && diamCls.isInstance(parent)) {
                                        isDiamondActive = true;
                                        isCurrentlyInFarmFromAuto = true;
                                        if (diamInst == null) diamInst = parent;
                                        break;
                                    }
                                }
                            }
                            if (isCurrentlyInFarmFromAuto) break;
                            taskBaseCls = taskBaseCls.getSuperclass();
                        }
                    } catch (Throwable ignored) {}
                }

                if (diamInst == null && activeTask != null && activeTask.taskInstance != null && diamCls.isInstance(activeTask.taskInstance)) {
                    diamInst = activeTask.taskInstance;
                }

                long now = System.currentTimeMillis();
                long targetMs = 0;

                // Đọc trạng thái BẬT/TẮT "Thu hoạch đúng giờ" (harvestOnTime) từ Mod
                boolean harvestOnTimeEnabled = false;
                for (Field f : diamCls.getDeclaredFields()) {
                    if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(boolean.class)) {
                        if (f.getName().equals(schema.diamondHarvestOnTimeField)) {
                            try {
                                f.setAccessible(true);
                                harvestOnTimeEnabled = f.getBoolean(null);
                            } catch (Throwable ignored) {}
                            break;
                        }
                    }
                }

                // Xử lý khi bot về chăm farm từ Auto Kim Cương:
                // Trong code Mod gốc (X.class), biến đếm lùi thời gian về farm (this.do) được gán mốc tương lai ngay trước khi rời sang Farm.
                // Do thời gian làm nông trại có thể kéo dài 1-2 phút, khi vừa quay lại Kim Cương thì targetMs đã bị quá hạn hoặc sắp hết.
                // Vì vậy, khi hoàn thành chu kỳ chăm farm và quay lại Kim Cương (wasInFarmDiamond -> false):
                // - Nếu BẬT "Thu hoạch đúng giờ": kích hoạt hàm tính giờ cây chín (aC.goto() trên Up Xu hoặc bq.byte() trên Fish)
                // - Nếu TẮT: gia hạn targetMs = now + intervalMs (ví dụ 2 phút tính từ lúc xong farm).
                if (isCurrentlyInFarmFromAuto) {
                    wasInFarmDiamond = true;
                } else if (wasInFarmDiamond) {
                    wasInFarmDiamond = false;
                    try {
                        if (diamInst != null && autoFarmEnabled) {
                            if (harvestOnTimeEnabled) {
                                updateSmartCropTimer(cl, schema, true, true);
                            } else {
                                long intervalMs = 0;
                                Field targetField = null;
                                for (Field f : diamCls.getDeclaredFields()) {
                                    if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(long.class)) {
                                        f.setAccessible(true);
                                        if (f.getName().equals(schema.diamondAbsTargetMsField)) {
                                            targetField = f;
                                        } else if (f.getName().equals(schema.diamondIntervalField) || f.getName().equals(schema.diamondTargetMsField)) {
                                            long val = f.getLong(diamInst);
                                            if (val > 0) intervalMs = val;
                                        }
                                    }
                                }
                                if (intervalMs <= 0) {
                                    for (Field f : diamCls.getDeclaredFields()) {
                                        if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(int.class)) {
                                            if (f.getName().equals(schema.diamondIntervalField)) {
                                                f.setAccessible(true);
                                                int mins = f.getInt(null);
                                                if (mins > 0) intervalMs = (long) mins * 60000L;
                                            }
                                        }
                                    }
                                }
                                if (targetField != null && intervalMs > 0) {
                                    targetField.setLong(diamInst, now + intervalMs);
                                    targetMs = now + intervalMs;
                                }
                            }
                        }
                    } catch (Throwable ignored) {}
                }

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
                    stats.farmingCountdown = formatCountdownWithMod(cl, diffSec);
                    lastKnownDiamondTargetMs = targetMs;
                } else if (isCurrentlyInFarmFromAuto) {
                    stats.farmingCountdown = "Đang trong farm...";
                } else if (isDiamondActive && autoFarmEnabled) {
                    // Trùng khớp hoàn toàn cơ chế HUD aQ.class của Chip: khi targetMs hết hạn thì hiển thị "xin chờ..."
                    stats.farmingCountdown = "Xin chờ...";
                } else if (isDiamondActive && !autoFarmEnabled) {
                    stats.farmingCountdown = "Không hẹn giờ";
                } else if (lastKnownDiamondTargetMs > now && (isDiamondActive || activeTask == null)) {
                    // Giữ lại countdown khi bot đang đổi map hoặc reconnect trong chốc lát
                    int diffSec = (int) ((lastKnownDiamondTargetMs - now) / 1000L);
                    stats.farmingCountdown = formatCountdownWithMod(cl, diffSec);
                } else if (stats.farmingCountdown == null || stats.farmingCountdown.isEmpty()) {
                    stats.farmingCountdown = "--:--";
                }

                long nowTs = System.currentTimeMillis();
                if (isDiamondActive || activeTask != null || targetMs > 0) {
                    if (nowTs - lastDiagnosticLogTs >= 5000L) {
                        lastDiagnosticLogTs = nowTs;
                        System.out.println(String.format(
                            "🔍 [DIAGNOSTIC_KC]: Mod=[%s] | ActiveTask=[%s] | isDiamActive=%b | autoFarm=%b | diamInst=%s | targetMs=%d | now=%d | diffSec=%d | ResultCountdown=[%s]",
                            schema.name,
                            (activeTask != null ? activeTask.className : "NULL"),
                            isDiamondActive,
                            autoFarmEnabled,
                            (diamInst != null ? "OK" : "NULL"),
                            targetMs,
                            now,
                            (targetMs > now ? (int)((targetMs - now) / 1000L) : -1),
                            stats.farmingCountdown
                        ));
                    }
                }
            } catch (Throwable ignored) {}
        } catch (Throwable ignored) {}
    }

    private static String formatCountdownWithMod(ClassLoader cl, int diffSec) {
        if (diffSec <= 0) return "00:00";
        int s = diffSec % 60;
        int m = (diffSec / 60) % 60;
        int h = (diffSec / 3600) % 24;
        if (h > 0) {
            return String.format("%02d:%02d:%02d", h, m, s);
        } else {
            return String.format("%02d:%02d", m, s);
        }
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
            boolean isCurrentlyInFarmFromFish = false;

            // Kiểm tra nếu bot đang về chăm farm từ Auto Câu Cá
            if (activeTask != null && "farm".equalsIgnoreCase(activeTask.autoType) && activeTask.taskInstance != null) {
                try {
                    Class<?> taskBaseCls = activeTask.taskInstance.getClass();
                    while (taskBaseCls != null && !taskBaseCls.equals(Object.class)) {
                        for (Field f : taskBaseCls.getDeclaredFields()) {
                            if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && (f.getName().equals("do") || f.getType().getName().equals(fishCls.getName()))) {
                                f.setAccessible(true);
                                Object parent = f.get(activeTask.taskInstance);
                                if (parent != null && fishCls.isInstance(parent)) {
                                    isFishActive = true;
                                    isCurrentlyInFarmFromFish = true;
                                    break;
                                }
                            }
                        }
                        if (isCurrentlyInFarmFromFish) break;
                        taskBaseCls = taskBaseCls.getSuperclass();
                    }
                } catch (Throwable ignored) {}
            }

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

            // Đọc cài đặt "Thu hoạch đúng giờ" (fishHarvestOnTimeField) từ Mod
            boolean fishHarvestOnTime = false;
            for (Field f : fishCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(boolean.class)) {
                    if (f.getName().equals(schema.fishHarvestOnTimeField)) {
                        try {
                            f.setAccessible(true);
                            fishHarvestOnTime = f.getBoolean(null);
                        } catch (Throwable ignored) {}
                        break;
                    }
                }
            }

            // Xử lý khi bot về chăm farm từ Auto Câu Cá:
            if (isCurrentlyInFarmFromFish) {
                wasInFarmFish = true;
            } else if (wasInFarmFish) {
                wasInFarmFish = false;
                try {
                    if (fishInst != null && backToFarmEnabled) {
                        if (fishHarvestOnTime) {
                            updateSmartCropTimer(cl, schema, false, true);
                        } else {
                            long intervalMs = 0;
                            Field targetField = null;
                            for (Field f : fishCls.getDeclaredFields()) {
                                if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(long.class)) {
                                    f.setAccessible(true);
                                    if (f.getName().equals(schema.fishTargetMsField)) {
                                        targetField = f;
                                    }
                                } else if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(int.class)) {
                                    if (f.getName().equals(schema.fishFarmIntervalField)) {
                                        f.setAccessible(true);
                                        int mins = f.getInt(null);
                                        if (mins > 0) intervalMs = (long) mins * 60000L;
                                    }
                                }
                            }
                            if (targetField != null && intervalMs > 0) {
                                targetField.setLong(fishInst, now + intervalMs);
                            }
                        }
                    }
                } catch (Throwable ignored) {}
            }

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
                stats.farmingCountdown = formatCountdownWithMod(cl, diffSec);
                lastKnownFishTargetMs = targetMs;
            } else if (isCurrentlyInFarmFromFish) {
                stats.farmingCountdown = "Đang trong farm...";
            } else if (isFishActive && backToFarmEnabled) {
                stats.farmingCountdown = "Xin chờ...";
            } else if (isFishActive && !backToFarmEnabled) {
                stats.farmingCountdown = "Không hẹn giờ";
            } else if (lastKnownFishTargetMs > now && (isFishActive || activeTask == null)) {
                int diffSec = (int) ((lastKnownFishTargetMs - now) / 1000L);
                stats.farmingCountdown = formatCountdownWithMod(cl, diffSec);
            } else if (stats.farmingCountdown == null || stats.farmingCountdown.isEmpty()) {
                stats.farmingCountdown = "--:--";
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
        if (!autoFarm) {
            harvestOnTime = false;
        }
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
                if (autoFarm) {
                    long newIntervalMs = (long) farmIntervalMinutes * 60000L;
                    setField(activeTask.taskInstance, schema.diamondTargetMsField, newIntervalMs, long.class);
                    if (harvestOnTime) {
                        boolean updated = updateSmartCropTimer(cl, schema, true, true);
                        if (!updated) {
                            setField(activeTask.taskInstance, schema.diamondAbsTargetMsField, System.currentTimeMillis() + newIntervalMs, long.class);
                        }
                    } else {
                        setField(activeTask.taskInstance, schema.diamondAbsTargetMsField, System.currentTimeMillis() + newIntervalMs, long.class);
                    }
                } else {
                    setField(activeTask.taskInstance, schema.diamondAbsTargetMsField, 0L, long.class);
                }
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
        if (!backToFarm) {
            harvestOnTime = false;
        }
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
                if (backToFarm) {
                    long newIntervalMs = (long) farmIntervalMinutes * 60000L;
                    setField(activeTask.taskInstance, "do", newIntervalMs, long.class);
                    if (harvestOnTime) {
                        boolean updated = updateSmartCropTimer(cl, schema, false, true);
                        if (!updated) {
                            setField(activeTask.taskInstance, schema.fishTargetMsField, System.currentTimeMillis() + newIntervalMs, long.class);
                        }
                    } else {
                        setField(activeTask.taskInstance, schema.fishTargetMsField, System.currentTimeMillis() + newIntervalMs, long.class);
                    }
                } else {
                    setField(activeTask.taskInstance, schema.fishTargetMsField, 0L, long.class);
                }
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
                // 1. Thử gọi lệnh chat native của Mod "kc" (giống hệt người chơi gõ phím 'kc' trong game)
                boolean triggeredViaCmd = false;
                try {
                    Method cmdMethod = taskCtrlCls.getMethod("do", String.class);
                    Object res = cmdMethod.invoke(null, "kc");
                    triggeredViaCmd = (res instanceof Boolean) ? ((Boolean) res).booleanValue() : true;
                } catch (Throwable ignored) {}

                Class<?> diamCls = cl.loadClass(schema.diamondClassName);
                taskObj = null;
                try {
                    Method getInst = diamCls.getMethod(schema.diamondSingletonMethod);
                    taskObj = getInst.invoke(null);
                } catch (Throwable ignored) {}
                if (taskObj == null) {
                    try { taskObj = diamCls.newInstance(); } catch (Throwable ignored) {}
                }

                if (taskObj != null) {
                    // Khởi tạo phương thức void do() hoặc new() của task kim cương
                    for (Method m : diamCls.getDeclaredMethods()) {
                        if (m.getParameterCount() == 0 && m.getReturnType().equals(void.class) && 
                            (m.getName().equals("do") || m.getName().equals("new"))) {
                            try {
                                m.setAccessible(true);
                                m.invoke(taskObj);
                                break;
                            } catch (Throwable ignored) {}
                        }
                    }

                    // QUAN TRỌNG: Cập nhật biến watchdog int:J (tránh mod hiểu nhầm bị đứng 10 phút rồi gọi aQ.void() đăng xuất!)
                    try {
                        Field intF = taskObj.getClass().getField("int");
                        intF.setAccessible(true);
                        intF.setLong(taskObj, System.currentTimeMillis());
                    } catch (Throwable t) {
                        try {
                            Field intF = taskObj.getClass().getSuperclass().getDeclaredField("int");
                            intF.setAccessible(true);
                            intF.setLong(taskObj, System.currentTimeMillis());
                        } catch (Throwable ignored) {}
                    }

                    // Đặt thời gian hẹn giờ về farm (soXu = now + intervalMs) để không bị lập tức nhảy về nông trại
                    long intervalMs = 60 * 60000L;
                    try {
                        Integer minsObj = (Integer) getStaticField(diamCls, schema.diamondIntervalField, int.class);
                        if (minsObj != null && minsObj.intValue() > 0) {
                            intervalMs = (long) minsObj.intValue() * 60000L;
                        }
                    } catch (Throwable ignored) {}

                    boolean autoFarmOn = true;
                    try {
                        Boolean af = (Boolean) getStaticField(diamCls, schema.diamondAutoFarmField, boolean.class);
                        if (af != null) autoFarmOn = af.booleanValue();
                    } catch (Throwable ignored) {}

                    boolean harvestOnTimeOn = false;
                    try {
                        Boolean ht = (Boolean) getStaticField(diamCls, schema.diamondHarvestOnTimeField, boolean.class);
                        if (ht != null) harvestOnTimeOn = ht.booleanValue();
                    } catch (Throwable ignored) {}

                    setField(taskObj, schema.diamondTargetMsField, intervalMs, long.class);
                    if (autoFarmOn) {
                        if (harvestOnTimeOn) {
                            boolean updated = updateSmartCropTimer(cl, schema, true, true);
                            if (!updated) {
                                setField(taskObj, schema.diamondAbsTargetMsField, System.currentTimeMillis() + intervalMs, long.class);
                            }
                        } else {
                            setField(taskObj, schema.diamondAbsTargetMsField, System.currentTimeMillis() + intervalMs, long.class);
                        }
                    } else {
                        setField(taskObj, schema.diamondAbsTargetMsField, 0L, long.class);
                    }

                    if (!triggeredViaCmd) {
                        Method doMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls);
                        doMethod.invoke(null, taskObj);
                    }

                    System.out.println("🔍 [DIAGNOSTIC_START_KC]: triggeredViaCmd=" + triggeredViaCmd + " | taskObj=" + taskObj.getClass().getName() + " | intervalMs=" + intervalMs + " | autoFarm=" + autoFarmOn + " | harvestOnTime=" + harvestOnTimeOn + " | targetMs=" + getFieldValue(taskObj, schema.diamondAbsTargetMsField));
                }

                // Đảm bảo thread worker của taskController đang chạy
                try {
                    Object ctrlInst = getStaticField(taskCtrlCls, "do", taskCtrlCls);
                    if (ctrlInst != null) {
                        Method startRunner = taskCtrlCls.getMethod("do");
                        startRunner.invoke(ctrlInst);
                    }
                } catch (Throwable ignored) {}

                System.out.println("💎 [BẬT AUTO KIM CƯƠNG]: Đã kích hoạt Auto Đào Kim Cương [" + schema.name + "]!");
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

                        boolean backToFarmOn = true;
                        try {
                            Boolean bf = (Boolean) getStaticField(fishCls, schema.fishBackToFarmField, boolean.class);
                            if (bf != null) backToFarmOn = bf.booleanValue();
                        } catch (Throwable ignored) {}

                        boolean harvestOnTimeOn = false;
                        try {
                            Boolean ht = (Boolean) getStaticField(fishCls, schema.fishHarvestOnTimeField, boolean.class);
                            if (ht != null) harvestOnTimeOn = ht.booleanValue();
                        } catch (Throwable ignored) {}

                        setField(taskObj, "do", intervalMs, long.class);
                        if (backToFarmOn) {
                            if (harvestOnTimeOn) {
                                boolean updated = updateSmartCropTimer(cl, schema, false, true);
                                if (!updated) {
                                    setField(taskObj, schema.fishTargetMsField, System.currentTimeMillis() + intervalMs, long.class);
                                }
                            } else {
                                setField(taskObj, schema.fishTargetMsField, System.currentTimeMillis() + intervalMs, long.class);
                            }
                        } else {
                            setField(taskObj, schema.fishTargetMsField, 0L, long.class);
                        }

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

        AutoTaskInfo beforeTask = getActiveAutoTask();
        System.out.println("🔍 [DIAGNOSTIC_STOP]: stopAuto() invoked | activeTaskBefore=" + (beforeTask != null ? beforeTask.className : "null"));

        try {
            Class<?> taskCtrlCls = cl.loadClass(schema.taskControllerClassName);
            Method stopMethod = taskCtrlCls.getMethod(schema.taskStopMethod);
            stopMethod.invoke(null);
        } catch (Throwable ignored) {}

        lastKnownDiamondTargetMs = 0L;
        lastKnownFishTargetMs = 0L;
        wasInFarmDiamond = false;
        wasInFarmFish = false;

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

    public static Object getFieldValue(Object obj, String fieldName) {
        if (obj == null || fieldName == null) return null;
        try {
            Class<?> c = obj.getClass();
            while (c != null) {
                for (Field f : c.getDeclaredFields()) {
                    if (f.getName().equals(fieldName)) {
                        f.setAccessible(true);
                        return f.get(obj);
                    }
                }
                c = c.getSuperclass();
            }
        } catch (Throwable ignored) {}
        return null;
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
