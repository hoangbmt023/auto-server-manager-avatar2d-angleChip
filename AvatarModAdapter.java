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
 * Toàn bộ các chức năng đăng nhập, kết nối, đọc thông số, cài đặt farm / kim
 * cương / up thuê,
 * và điều khiển Auto đều được thực thi thông qua biến cấu hình DUY NHẤT
 * ModSchema.
 * 
 * Khi game mod đổi cách làm rối (obfuscate), BẠN CHỈ CẦN UPDATE FILE
 * ModSchema.java.
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
        public String avatarBase64 = null;

        public String toJson(long lastLoginTime) {
            String startStr = (startedAt != null && !startedAt.isEmpty() && !startedAt.contains("1970")) ? startedAt
                    : new SimpleDateFormat("dd/MM/yyyy").format(
                            new Date(lastLoginTime > 1000000000000L ? lastLoginTime : System.currentTimeMillis()));
            String expStr = (expiresAt != null && !expiresAt.trim().isEmpty() && !expiresAt.contains("1970"))
                    ? expiresAt
                    : "Vĩnh viễn";
            String avatarJson = (avatarBase64 != null && !avatarBase64.isEmpty())
                    ? ",\"avatarUrl\":\"" + avatarBase64 + "\""
                    : "";

            return "{\"coins\":" + coins + ",\"gold\":" + gold + ",\"lockedGold\":" + lockedGold +
                    ",\"targetCoins\":" + targetCoins + ",\"earnedCoins\":" + earnedCoins +
                    ",\"collectedHearts\":" + collectedHearts + ",\"kcx\":\"+" + kcx + "\",\"nhb\":\"+" + nhb +
                    "\",\"fishCaught\":" + fishCaught + ",\"sharkCaught\":" + sharkCaught + ",\"fishKcx\":\"+" + fishKcx
                    +
                    "\",\"isFishMod\":" + isFishMod + ",\"modType\":\"" + modType +
                    "\",\"isAutoRunning\":" + isAutoRunning + ",\"autoType\":\"" + autoType +
                    "\",\"sellOreTime\":\"" + sellOreTime + "\",\"currentZone\":" + currentZone +
                    ",\"farmingTime\":\"" + farmingCountdown + "\",\"farmingCountdown\":\"" + farmingCountdown +
                    "\",\"startedAt\":\"" + startStr + "\",\"expiresAt\":\"" + expStr +
                    "\",\"isTargetReached\":" + isTargetReached + ",\"startedTs\":" + startedTs
                    + ",\"expiresAtTimestamp\":" + expiresAtTimestamp + avatarJson + "}";
        }
    }

    public static class AutoTaskInfo {
        public Object taskInstance;
        public String className = "";
        public String friendlyName = "";
        public String autoType = "farm"; // farm, diamond, fish, sell_ore, baby, tai_xiu, upgrade
        public String parentAutoType = null;
        public boolean isSubTask = false;

        public AutoTaskInfo(Object inst, String cls, String friendly, String type) {
            this(inst, cls, friendly, type, null, false);
        }

        public AutoTaskInfo(Object inst, String cls, String friendly, String type, String parentType, boolean isSub) {
            this.taskInstance = inst;
            this.className = cls;
            this.friendlyName = friendly;
            this.autoType = type;
            this.parentAutoType = parentType;
            this.isSubTask = isSub;
        }
    }

    private static long lastLoggedCropRemainingSec = -1L;
    private static long lastSmartFarmLogTs = 0L;
    private static long lastDiagnosticLogTs = 0L;
    private static boolean wasInFarmDiamond = false;
    private static boolean wasInFarmFish = false;
    private static long lastKnownDiamondTargetMs = 0L;
    private static long lastKnownFishTargetMs = 0L;
    private static Object cachedDiamondInstance = null;
    private static Object cachedFishInstance = null;
    private static String cachedAvatarBase64 = null;
    private static String cachedEquipSignature = "";
    private static long lastAvatarExtractTime = 0;
    private static boolean avatarStabilized = false;
    private static int avatarExtractCount = 0;

    private static ClassLoader getClassLoader() {
        MIDlet midlet = MIDletBridge.getCurrentMIDlet();
        return midlet != null ? midlet.getClass().getClassLoader() : null;
    }

    /**
     * Tự động nhận diện ModType dựa theo định nghĩa trong ModSchema
     */
    public static ModSchema.ModType detectModType() {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return ModSchema.ModType.UNKNOWN;

        // 1. Nhận diện Bản ChipMix Full (build13)
        try {
            Class<?> chipCls = cl.loadClass(ModSchema.CHIP_MIX.mainIdentifierClass);
            if (chipCls != null) {
                return ModSchema.ModType.CHIP_MIX;
            }
        } catch (Throwable ignored) {
        }

        // 2. Nhận diện Bản Câu Cá (build40)
        try {
            Class<?> mainCls = cl.loadClass(ModSchema.FISH.mainIdentifierClass);
            if (mainCls.getSuperclass() != null
                    && mainCls.getSuperclass().getName().equals(ModSchema.FISH.superIdentifierClass)) {
                return ModSchema.ModType.FISH;
            }
        } catch (Throwable ignored) {
        }

        // 3. Nhận diện Bản Up Xu (build34)
        try {
            Class<?> mainCls = cl.loadClass(ModSchema.UP_XU.mainIdentifierClass);
            if (mainCls.getSuperclass() != null
                    && mainCls.getSuperclass().getName().equals(ModSchema.UP_XU.superIdentifierClass)) {
                return ModSchema.ModType.UP_XU;
            }
        } catch (Throwable ignored) {
        }

        return ModSchema.ModType.CHIP_MIX; // Mặc định ChipMix nếu không xác định
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
        if (cl == null)
            return false;

        String finalUser = (username != null && !username.isEmpty()) ? username : "";
        String finalPass = (password != null && !password.isEmpty()) ? password : "";
        if (finalPass.isEmpty() || finalUser.isEmpty()) {
            String[] rmsCreds = readCredentialsFromRms(System.getProperty("avatar.appId"));
            if (rmsCreds != null) {
                if (finalUser.isEmpty() && rmsCreds[0] != null)
                    finalUser = rmsCreds[0];
                if (finalPass.isEmpty() && rmsCreds[1] != null)
                    finalPass = rmsCreds[1];
            }
        }

        dismissStartupPopups();

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> loginCls = cl.loadClass(schema.loginClassName);
            Object loginInstance = null;
            try {
                Method getInstMethod = loginCls.getMethod(schema.loginSingletonMethod);
                loginInstance = getInstMethod.invoke(null);
            } catch (Throwable ignored) {
            }

            if (loginInstance == null) {
                try {
                    loginInstance = getStaticField(loginCls, schema.loginSingletonMethod, loginCls);
                } catch (Throwable ignored) {
                }
            }
            if (loginInstance == null) {
                try {
                    loginInstance = loginCls.newInstance();
                } catch (Throwable ignored) {
                }
            }

            // Gán thông tin Server lên static field và instance field nếu có
            if (schema.loginServerIdField != null && !schema.loginServerIdField.isEmpty()) {
                setStaticField(loginCls, schema.loginServerIdField, int.class, serverId);
                if (loginInstance != null) {
                    setField(loginInstance, schema.loginServerIdField, serverId, int.class);
                }
            }
            if (schema.loginServerNameField != null && !schema.loginServerNameField.isEmpty()) {
                setStaticField(loginCls, schema.loginServerNameField, String.class, serverName);
                if (loginInstance != null) {
                    setField(loginInstance, schema.loginServerNameField, serverName, String.class);
                }
            }

            // Xử lý class phụ trợ gV nếu có
            if (schema.loginExtraGvClass != null) {
                try {
                    Class<?> gvCls = cl.loadClass(schema.loginExtraGvClass);
                    Method getGvMethod = gvCls.getMethod(schema.loginSingletonMethod);
                    Object gvInst = getGvMethod.invoke(null);
                    if (gvInst != null) {
                        setField(gvInst, schema.loginServerIdField, serverId, int.class);
                    }
                } catch (Throwable ignored) {
                }
            }

            if (loginInstance != null) {
                if (schema.loginHasConstServerId) {
                    setField(loginInstance, "case", true, boolean.class);
                    try {
                        Method gotoMethod = loginCls.getMethod("goto");
                        gotoMethod.invoke(loginInstance);
                    } catch (Throwable ignored) {
                    }
                }

                if (!finalUser.isEmpty() && !finalPass.isEmpty()) {
                    System.out.println("[QUY TRÌNH] -> [" + schema.name + "] Đang kết nối tới Server [" + serverName
                            + "] & đăng nhập nick [" + finalUser + "]...");
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

            // Fallback trực tiếp qua Network Controller (fV / network class) nếu loginInstance không tìm thấy method
            if (!finalUser.isEmpty() && !finalPass.isEmpty()) {
                try {
                    Class<?> fvCls = cl.loadClass("fV");
                    Method fvInstM = fvCls.getMethod("do");
                    Object fvInst = fvInstM.invoke(null);
                    if (fvInst != null) {
                        for (Method m : fvCls.getDeclaredMethods()) {
                            if (m.getName().equals("do") && m.getParameterCount() == 2) {
                                Class<?>[] pts = m.getParameterTypes();
                                if (pts[0].equals(String.class) && pts[1].equals(String.class)) {
                                    m.setAccessible(true);
                                    m.invoke(fvInst, finalUser, finalPass);
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Throwable ignored) {
                }
            }
        } catch (Throwable t) {
            Throwable cause = (t instanceof java.lang.reflect.InvocationTargetException && t.getCause() != null)
                    ? t.getCause()
                    : t;
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
        if (cl == null)
            return false;

        // 1. Nếu nhân vật đã hiện diện trong RAM (duLieuNguoiChoi / player instance !=
        // null), bot chắc chắn 100% đang online kết nối Server
        Object player = getActivePlayerInstance(cl);
        if (player != null) {
            // Kiểm tra xem có popup thông báo đè lên báo mất kết nối không
            String dialog = checkActiveGameDialog();
            if (dialog != null && !dialog.trim().isEmpty()) {
                String lower = dialog.toLowerCase();
                if (lower.contains("mất kết nối") || lower.contains("kết nối thất bại")
                        || lower.contains("mạng game bị ngắt")) {
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
            if (lower.contains("mất kết nối") || lower.contains("kết nối thất bại")
                    || lower.contains("mạng game bị ngắt")) {
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
                                    !java.lang.reflect.Modifier.isStatic(dm.getModifiers())
                                    && dm.getReturnType().equals(boolean.class)) {
                                dm.setAccessible(true);
                                return (boolean) dm.invoke(netInst);
                            }
                        }
                    }
                }
            }
        } catch (Throwable ignored) {
        }

        // Nếu không có player và không có kết nối socket xác thực -> Chưa kết nối
        return false;
    }

    public static String checkActiveGameDialog() {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return null;

        ModSchema schema = getCurrentSchema();
        String pointerType = (schema.dialogPointerType != null && !schema.dialogPointerType.isEmpty())
                ? schema.dialogPointerType
                : "bt";

        try {
            Class<?> containerCls = cl.loadClass(schema.dialogContainerClass);

            // 1. Kiểm tra đối tượng active dialog trong container
            // Trong Up Xu (br.class): public static bt do là con trỏ dialog đang mở (h
            // extends bt).
            // Trong Fish (bx.class): public static dJ do là con trỏ dialog đang mở (s
            // extends dJ).
            // CHÚ Ý: Biến h do và s do là instance tái sử dụng (luôn != null và giữ nội
            // dung cũ).
            // CHỈ DUY NHẤT biến kiểu bt (hoặc dJ) là con trỏ dialog thực: khi đóng = null,
            // khi mở != null!
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
                                if (!msg.contains("(" + trimmedButtons + ")")
                                        && !msg.equalsIgnoreCase(trimmedButtons)) {
                                    return msg.trim() + " (" + trimmedButtons + ")";
                                }
                            }
                            return msg.trim();
                        }
                    }
                }
            }
        } catch (Throwable ignored) {
        }

        return null;
    }

    public static String extractDialogButtons(Object obj) {
        if (obj == null)
            return null;
        java.util.LinkedHashSet<String> buttons = new java.util.LinkedHashSet<String>();
        Class<?> cls = obj.getClass();
        while (cls != null && !cls.equals(Object.class)) {
            for (Field f : cls.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    try {
                        f.setAccessible(true);
                        Object val = f.get(obj);
                        if (val == null)
                            continue;

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
                    } catch (Throwable ignored) {
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        if (buttons.isEmpty())
            return null;
        StringBuilder sb = new StringBuilder();
        for (String b : buttons) {
            if (sb.length() > 0)
                sb.append(", ");
            sb.append(b);
        }
        return sb.toString();
    }

    private static String extractButtonLabel(Object item) {
        if (item == null)
            return null;
        if (item instanceof String)
            return null; // Tuyệt đối không lấy String thông thường làm nút bấm

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
                } catch (Throwable ignored) {
                }
            }
        }
        return null;
    }

    private static boolean isValidButtonLabel(String s) {
        if (s == null)
            return false;
        String trimmed = s.trim();
        if (trimmed.isEmpty() || trimmed.length() > 30)
            return false;
        if (trimmed.contains("0123456789") || trimmed.contains("abcdefghijklmnopqrstuvwxyz") ||
                trimmed.startsWith("http") || trimmed.endsWith(".png") || trimmed.endsWith(".av") ||
                trimmed.endsWith(".on") || trimmed.endsWith(".mid") || trimmed.contains("/")) {
            return false;
        }
        return true;
    }

    private static String extractDialogText(Object obj) {
        if (obj == null)
            return null;
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
                                    s.startsWith("http") || s.endsWith(".png") || s.endsWith(".av")
                                    || s.endsWith(".on")) {
                                continue;
                            }
                            return s.trim();
                        }
                    } catch (Throwable ignored) {
                    }
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
        if (cl == null)
            return;

        ModSchema schema = getCurrentSchema();
        if (schema.canvasClasses == null)
            return;

        for (String cn : schema.canvasClasses) {
            try {
                Class<?> cls = cl.loadClass(cn);
                Object inst = null;
                try {
                    Method m = cls.getMethod("do");
                    inst = m.invoke(null);
                } catch (Throwable ignored) {
                }

                if (inst == null) {
                    for (Field f : cls.getDeclaredFields()) {
                        if (f.getName().equals("do") && java.lang.reflect.Modifier.isStatic(f.getModifiers())
                                && cls.isAssignableFrom(f.getType())) {
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
                        if (kr != null)
                            kr.invoke(inst, -3);

                        try {
                            Thread.sleep(80);
                        } catch (Throwable ignored) {
                        }

                        // 2. Nhấn xác nhận (Center key -5, Left Softkey -6, Enter 10)
                        int[] confirmKeys = new int[] { -5, -6, 10 };
                        for (int k : confirmKeys) {
                            try {
                                kp.invoke(inst, k);
                                if (kr != null)
                                    kr.invoke(inst, k);
                            } catch (Throwable ignored) {
                            }
                        }
                    } catch (Throwable ignored) {
                    }
                }
            } catch (Throwable ignored) {
            }
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
                } catch (Throwable ignored) {
                }
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
        if (cl == null)
            return stats;

        ModSchema.ModType currentModType = detectModType();
        stats.isFishMod = (currentModType == ModSchema.ModType.FISH);
        if (currentModType == ModSchema.ModType.CHIP_MIX) {
            stats.modType = "chipmix";
        } else if (currentModType == ModSchema.ModType.FISH) {
            stats.modType = "fish";
        } else {
            stats.modType = "up_xu";
        }

        ModSchema schema = getCurrentSchema();

        // 3.0. Vùng/Khu hiện tại trong game (Current Zone)
        if (schema.zoneClassName != null) {
            try {
                Class<?> zCls = cl.loadClass(schema.zoneClassName);
                for (Field f : zCls.getDeclaredFields()) {
                    if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) &&
                            (f.getType().equals(byte.class) || f.getType().equals(int.class)
                                    || f.getType().equals(short.class))) {
                        if (schema.zoneField == null || schema.zoneField.isEmpty()
                                || f.getName().equals(schema.zoneField)) {
                            f.setAccessible(true);
                            stats.currentZone = f.getInt(null);
                            break;
                        }
                    }
                }
            } catch (Throwable ignored) {
            }
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
                            if (!isStatic && (f.getName().equals(schema.playerCoinsArrayField) || f.getType().equals(int[].class))) {
                                if (f.getType().equals(int[].class)) {
                                    int[] moneyArr = (int[]) f.get(playerObj);
                                    if (moneyArr != null && moneyArr.length > 0) {
                                        stats.coins = moneyArr[0];
                                        if (stats.coins > 0)
                                            lastKnownCoins = stats.coins;
                                        if (moneyArr.length > 1 && moneyArr[1] >= 0) {
                                            stats.gold = moneyArr[1];
                                            if (stats.gold > 0)
                                                lastKnownGold = stats.gold;
                                        }
                                        if (moneyArr.length > 2 && moneyArr[2] >= 0) {
                                            stats.lockedGold = moneyArr[2];
                                            if (stats.lockedGold > 0)
                                                lastKnownLockedGold = stats.lockedGold;
                                        }
                                    }
                                }
                            }

                            // Lượng khóa (int) nếu nằm riêng field
                            if (!isStatic && schema.playerLockedGoldField != null
                                    && f.getName().equals(schema.playerLockedGoldField)
                                    && f.getType().equals(int.class)) {
                                int lg = f.getInt(playerObj);
                                if (lg > 0) {
                                    stats.lockedGold = lg;
                                    lastKnownLockedGold = stats.lockedGold;
                                }
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
                        } catch (Throwable ignored) {
                        }
                    }
                    pCls = pCls.getSuperclass();
                }
            }

            // Fallback giữ giá trị tiền đã đọc được gần nhất nếu bot đang chuyển map/khu
            if (stats.coins == 0 && lastKnownCoins > 0) {
                stats.coins = lastKnownCoins;
            }
            if (stats.gold == 0 && lastKnownGold > 0) {
                stats.gold = lastKnownGold;
            }
            if (stats.lockedGold == 0 && lastKnownLockedGold > 0) {
                stats.lockedGold = lastKnownLockedGold;
            }

            // Fallback tên nhân vật từ tài khoản đăng nhập RMS nếu trong RAM chưa kịp nạp tên
            if (stats.playerName.isEmpty()) {
                String[] rmsCreds = readCredentialsFromRms(System.getProperty("avatar.appId"));
                if (rmsCreds != null && rmsCreds[0] != null && !rmsCreds[0].isEmpty()) {
                    stats.playerName = rmsCreds[0];
                }
            }
        } catch (Throwable ignored) {
        }

        // 3.1.1 Trích xuất Avatar nhân vật trực tiếp từ Canvas / Sprite Model (Cache theo Item IDs & Trang bị)
        try {
            Object playerObj = getActivePlayerInstance(cl, schema);
            if (playerObj != null) {
                String currentSig = getEquipSignature(playerObj);
                boolean equipChanged = !currentSig.isEmpty() && !currentSig.equals(cachedEquipSignature);
                if (equipChanged) {
                    cachedAvatarBase64 = null;
                    cachedEquipSignature = currentSig;
                    avatarStabilized = false;
                    avatarExtractCount = 0;
                }

                long now = System.currentTimeMillis();
                if (cachedAvatarBase64 == null) {
                    cachedAvatarBase64 = exportPlayerAvatarBase64();
                    cachedEquipSignature = currentSig;
                    lastAvatarExtractTime = now;
                    avatarExtractCount = 1;
                } else if (!avatarStabilized) {
                    // Tự động tái trích xuất 1-2 lần trong 10-15s đầu (sau khi toàn bộ Sprite/RMS hiệu ứng nạp đầy đủ vào RAM)
                    if (now - lastAvatarExtractTime > 4000) {
                        String newExtracted = exportPlayerAvatarBase64();
                        if (newExtracted != null && !newExtracted.isEmpty()) {
                            cachedAvatarBase64 = newExtracted;
                        }
                        lastAvatarExtractTime = now;
                        avatarExtractCount++;
                        if (avatarExtractCount >= 3 || stats.isAutoRunning) {
                            avatarStabilized = true;
                        }
                    }
                }
            }
            stats.avatarBase64 = cachedAvatarBase64;
        } catch (Throwable ignored) {
        }

        if (stats.coins == 0 && lastKnownCoins > 0)
            stats.coins = lastKnownCoins;
        if (stats.gold == 0 && lastKnownGold > 0)
            stats.gold = lastKnownGold;
        if (stats.lockedGold == 0 && lastKnownLockedGold > 0)
            stats.lockedGold = lastKnownLockedGold;

        // 3.2. Thông số Up Thuê
        try {
            Class<?> aQCls = cl.loadClass(schema.upThueClassName);
            long startedTs = 0;
            long upDays = 0;

            for (Field f : aQCls.getDeclaredFields()) {
                try {
                    f.setAccessible(true);
                    if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                        if (f.getName().equals(schema.targetCoinsField) && f.getType().equals(int.class))
                            stats.targetCoins = f.getInt(null);
                        if (f.getName().equals(schema.earnedCoinsField) && f.getType().equals(int.class))
                            stats.earnedCoins = f.getInt(null);
                        if (f.getName().equals(schema.collectedHeartsField) && f.getType().equals(int.class))
                            stats.collectedHearts = f.getInt(null);
                        if (f.getName().equals(schema.upDaysField) && f.getType().equals(long.class))
                            upDays = f.getLong(null);
                        if (f.getName().equals(schema.startedTsField) && f.getType().equals(long.class))
                            startedTs = f.getLong(null);
                    }
                } catch (Throwable ignored) {
                }
            }

            // Lấy instance và cập nhật chuỗi hiển thị ngày tháng
            Object aQInstance = null;
            for (Field f : aQCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(aQCls)) {
                    f.setAccessible(true);
                    try {
                        aQInstance = f.get(null);
                    } catch (Throwable ignored) {
                    }
                    if (aQInstance != null)
                        break;
                }
            }
            if (aQInstance == null) {
                for (Method m : aQCls.getDeclaredMethods()) {
                    if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && m.getParameterCount() == 0
                            && m.getReturnType().equals(aQCls)) {
                        m.setAccessible(true);
                        try {
                            aQInstance = m.invoke(null);
                        } catch (Throwable ignored) {
                        }
                        if (aQInstance != null)
                            break;
                    }
                }
            }

            if (aQInstance != null) {
                try {
                    Method m = aQCls.getMethod(schema.upThueFormatDateMethod);
                    m.setAccessible(true);
                    m.invoke(aQInstance);
                } catch (Throwable ignored) {
                }

                for (Field f : aQCls.getDeclaredFields()) {
                    try {
                        f.setAccessible(true);
                        if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())
                                && f.getType().equals(String.class)) {
                            Object val = f.get(aQInstance);
                            if (val != null) {
                                String str = val.toString().trim();
                                if (!str.isEmpty() && !str.contains("1970")
                                        && (str.contains("/") || str.equalsIgnoreCase("Vĩnh viễn"))) {
                                    if (f.getName().equals(schema.startedAtStringField)) {
                                        stats.startedAt = str;
                                    } else if (f.getName().equals(schema.expiresAtStringField)) {
                                        stats.expiresAt = str;
                                    }
                                }
                            }
                        }
                    } catch (Throwable ignored) {
                    }
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
            if (stats.startedAt == null || stats.startedAt.isEmpty() || stats.startedAt.contains("1970")
                    || stats.startedAt.equals("--")) {
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
            } else if (stats.expiresAt == null || stats.expiresAt.isEmpty() || stats.expiresAt.contains("1970")
                    || stats.expiresAt.equals("--")) {
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
        } catch (Throwable ignored) {
        }

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
     * Kiểm tra trực tiếp từ hàm & biến nội bộ của Mod xem tài khoản đã đạt mục tiêu
     * chưa
     */
    public static boolean isTargetReached() {
        try {
            PlayerStats stats = extractPlayerStats();
            return stats != null && stats.isTargetReached;
        } catch (Throwable ignored) {
        }
        return false;
    }

    /**
     * Tắt toàn bộ trạng thái auto bên trong Mod bằng cách gọi hàm reset của Mod
     * (aQ.class / aQ.void / aQ.byte)
     */
    public static void stopModAuto() {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return;
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
                } catch (Throwable ignored) {
                }
            }
        } catch (Throwable ignored) {
        }
    }

    /**
     * Kích hoạt cơ chế tính giờ thu hoạch nông sản thông minh của Mod.
     * Up Xu: aC.goto() -> tính l0 = aC.do() (thời gian cây chín). Nếu có cây (l0 >
     * 0 && l0 < X.if) thì X.do().do = now + l0 + 60000L.
     * Fish mod: bq.byte() cho Kim Cương (aj.do), bq.break() cho Câu Cá (bS.if).
     */
    public static boolean updateSmartCropTimer(ClassLoader cl, ModSchema schema, boolean isDiamond) {
        return updateSmartCropTimer(cl, schema, isDiamond, false);
    }

    public static boolean updateSmartCropTimer(ClassLoader cl, ModSchema schema, boolean isDiamond, boolean forceLog) {
        if (cl == null || schema == null)
            return false;
        try {
            if (schema.farmClassName != null && !schema.farmClassName.isEmpty()) {
                Class<?> farmCls = cl.loadClass(schema.farmClassName);

                // 0. Kiểm tra an toàn: nếu mảng ô đất nông sản trong RAM chưa nạp (chưa vào
                // farm lần nào) -> bỏ qua
                try {
                    Class<?> bFCls = cl.loadClass("bF");
                    Field intF = bFCls.getDeclaredField("int");
                    intF.setAccessible(true);
                    Object plots = intF.get(null);
                    if (plots == null) {
                        return false;
                    }
                } catch (Throwable ignored) {
                }

                // 1. Kiểm tra thời gian còn lại của cây trồng trong RAM (hàm static long do()
                // của aC / bq)
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
                } catch (Throwable ignored) {
                }

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

                // Chống spam log: chỉ in khi forceLog = true hoặc qua chu kỳ mới (chênh lệch >=
                // 300s & cách lần in trước >= 60s)
                boolean shouldLog = forceLog || (lastLoggedCropRemainingSec == -1L) ||
                        (Math.abs(remainingSec - lastLoggedCropRemainingSec) >= 300L
                                && (nowTs - lastSmartFarmLogTs >= 60000L));

                // Nếu 2 luồng gọi gần như đồng thời (trong 3s) với cùng số giây còn lại thì bỏ
                // qua log lặp lại
                if (nowTs - lastSmartFarmLogTs < 3000L && Math.abs(remainingSec - lastLoggedCropRemainingSec) < 5L) {
                    shouldLog = false;
                }

                if (shouldLog) {
                    if (remainingCropMs > 0) {
                        long mins = (remainingCropMs + 60000L) / 60000L;
                        System.out.println("🌾 [FARM THÔNG MINH]: Cây trồng trong farm sẽ chín sau " + mins + " phút ("
                                + remainingSec + "s). Đã tự động hẹn giờ về thu hoạch đúng giờ!");
                    } else if (remainingCropMs == 0) {
                        System.out.println("🌾 [FARM THÔNG MINH]: Nông sản đã chín! Đang hẹn giờ về thu hoạch ngay...");
                    }
                    lastLoggedCropRemainingSec = remainingSec;
                    lastSmartFarmLogTs = nowTs;
                }
                return true;
            }
        } catch (Throwable ignored) {
        }
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
                        if (f.getName().equals(schema.kcxCountField))
                            kcxVal = f.getInt(null);
                        else if (f.getName().equals(schema.nhbCountField))
                            nhbVal = f.getInt(null);
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
                            if (diamInst != null)
                                break;
                        }
                    }
                }

                // 3. Nếu chưa có, lấy từ Task đang chạy trong AutoController
                AutoTaskInfo activeTask = getActiveAutoTask();
                boolean isDiamondActive = (activeTask != null && "diamond".equalsIgnoreCase(activeTask.autoType));
                boolean isCurrentlyInFarmFromAuto = false;
                boolean isCurrentlyInSellOreFromAuto = false;

                // Nếu bot đang về chăm farm từ Auto Kim Cương
                if (activeTask != null && "farm".equalsIgnoreCase(activeTask.autoType)) {
                    if ("diamond".equalsIgnoreCase(activeTask.parentAutoType)) {
                        isDiamondActive = true;
                        isCurrentlyInFarmFromAuto = true;
                    } else if (activeTask.taskInstance != null) {
                        try {
                            Class<?> taskBaseCls = activeTask.taskInstance.getClass();
                            while (taskBaseCls != null && !taskBaseCls.equals(Object.class)) {
                                for (Field f : taskBaseCls.getDeclaredFields()) {
                                    if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())
                                            && (f.getName().equals("do")
                                                    || f.getType().getName().equals(diamCls.getName()))) {
                                        f.setAccessible(true);
                                        Object parent = f.get(activeTask.taskInstance);
                                        if (parent != null && diamCls.isInstance(parent)) {
                                            isDiamondActive = true;
                                            isCurrentlyInFarmFromAuto = true;
                                            if (diamInst == null)
                                                diamInst = parent;
                                            break;
                                        }
                                    }
                                }
                                if (isCurrentlyInFarmFromAuto)
                                    break;
                                taskBaseCls = taskBaseCls.getSuperclass();
                            }
                        } catch (Throwable ignored) {
                        }
                    }
                } else if (activeTask != null && ("sell_ore".equalsIgnoreCase(activeTask.autoType)
                        || "banda".equalsIgnoreCase(activeTask.autoType)
                        || "baby".equalsIgnoreCase(activeTask.autoType))) {
                    // Nếu bot đang đi bán đá hoặc chăm baby từ Auto Kim Cương
                    if ("diamond".equalsIgnoreCase(activeTask.parentAutoType) || (activeTask.isSubTask && cachedDiamondInstance != null)) {
                        isDiamondActive = true;
                        if ("sell_ore".equalsIgnoreCase(activeTask.autoType)
                                || "banda".equalsIgnoreCase(activeTask.autoType)) {
                            isCurrentlyInSellOreFromAuto = true;
                        }
                    }
                }

                if (diamInst == null && activeTask != null && activeTask.taskInstance != null
                        && diamCls.isInstance(activeTask.taskInstance)) {
                    diamInst = activeTask.taskInstance;
                }
                if (diamInst != null) {
                    cachedDiamondInstance = diamInst;
                } else if (cachedDiamondInstance != null && isDiamondActive) {
                    diamInst = cachedDiamondInstance;
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
                            } catch (Throwable ignored) {
                            }
                            break;
                        }
                    }
                }

                // Xử lý khi bot về chăm farm từ Auto Kim Cương:
                // Trong code Mod gốc (X.class), biến đếm lùi thời gian về farm (this.do) được
                // gán mốc tương lai ngay trước khi rời sang Farm.
                // Do thời gian làm nông trại có thể kéo dài 1-2 phút, khi vừa quay lại Kim
                // Cương thì targetMs đã bị quá hạn hoặc sắp hết.
                // Vì vậy, khi hoàn thành chu kỳ chăm farm và quay lại Kim Cương
                // (wasInFarmDiamond -> false):
                // - Nếu BẬT "Thu hoạch đúng giờ": kích hoạt hàm tính giờ cây chín (aC.goto()
                // trên Up Xu hoặc bq.byte() trên Fish)
                // - Nếu TẮT: gia hạn targetMs = now + intervalMs (ví dụ 2 phút tính từ lúc xong
                // farm).
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
                                    if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())
                                            && f.getType().equals(long.class)) {
                                        f.setAccessible(true);
                                        if (f.getName().equals(schema.diamondAbsTargetMsField)) {
                                            targetField = f;
                                        } else if (f.getName().equals(schema.diamondIntervalField)
                                                || f.getName().equals(schema.diamondTargetMsField)) {
                                            long val = f.getLong(diamInst);
                                            if (val > 0)
                                                intervalMs = val;
                                        }
                                    }
                                }
                                if (intervalMs <= 0) {
                                    for (Field f : diamCls.getDeclaredFields()) {
                                        if (java.lang.reflect.Modifier.isStatic(f.getModifiers())
                                                && f.getType().equals(int.class)) {
                                            if (f.getName().equals(schema.diamondIntervalField)) {
                                                f.setAccessible(true);
                                                int mins = f.getInt(null);
                                                if (mins > 0)
                                                    intervalMs = (long) mins * 60000L;
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
                    } catch (Throwable ignored) {
                    }
                }

                if (diamInst != null) {
                    // Duyệt tất cả các instance field kiểu long để đọc chính xác trường soXu (do:
                    // long)
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
                if (targetMs <= now && activeTask != null && activeTask.taskInstance != null
                        && diamCls.isInstance(activeTask.taskInstance)) {
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

                if (isDiamondActive) {
                    if (isCurrentlyInFarmFromAuto) {
                        stats.farmingCountdown = "Đang trong farm...";
                    } else if (targetMs > now && autoFarmEnabled) {
                        int diffSec = (int) ((targetMs - now) / 1000L);
                        stats.farmingCountdown = formatCountdownWithMod(cl, diffSec);
                        lastKnownDiamondTargetMs = targetMs;
                    } else if (autoFarmEnabled) {
                        stats.farmingCountdown = "Xin chờ...";
                    } else {
                        stats.farmingCountdown = "Không hẹn giờ";
                    }
                } else {
                    stats.farmingCountdown = "--:--";
                }
            } catch (Throwable ignored) {
            }
        } catch (Throwable ignored) {
        }
    }

    private static String formatCountdownWithMod(ClassLoader cl, int diffSec) {
        if (diffSec <= 0)
            return "00:00";
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
        if (schema.fishClassName == null || schema.fishClassName.isEmpty())
            return;
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
                        if (stats.kcx == 0)
                            stats.kcx = stats.fishKcx;
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
            if (activeTask != null && "farm".equalsIgnoreCase(activeTask.autoType)) {
                if ("fish".equalsIgnoreCase(activeTask.parentAutoType)) {
                    isFishActive = true;
                    isCurrentlyInFarmFromFish = true;
                } else if (activeTask.taskInstance != null) {
                    try {
                        Class<?> taskBaseCls = activeTask.taskInstance.getClass();
                        while (taskBaseCls != null && !taskBaseCls.equals(Object.class)) {
                            for (Field f : taskBaseCls.getDeclaredFields()) {
                                if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && (f.getName().equals("do")
                                        || f.getType().getName().equals(fishCls.getName()))) {
                                    f.setAccessible(true);
                                    Object parent = f.get(activeTask.taskInstance);
                                    if (parent != null && fishCls.isInstance(parent)) {
                                        isFishActive = true;
                                        isCurrentlyInFarmFromFish = true;
                                        break;
                                    }
                                }
                            }
                            if (isCurrentlyInFarmFromFish)
                                break;
                            taskBaseCls = taskBaseCls.getSuperclass();
                        }
                    } catch (Throwable ignored) {
                    }
                }
            } else if (activeTask != null && ("sell_ore".equalsIgnoreCase(activeTask.autoType)
                    || "banda".equalsIgnoreCase(activeTask.autoType))) {
                if ("fish".equalsIgnoreCase(activeTask.parentAutoType) || (activeTask.isSubTask && cachedFishInstance != null)) {
                    isFishActive = true;
                }
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
                    if (fishInst != null)
                        break;
                }
            }
            // 2. Nếu chưa có, tìm field static kiểu fishCls
            if (fishInst == null) {
                for (Field f : fishCls.getDeclaredFields()) {
                    if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(fishCls)) {
                        f.setAccessible(true);
                        fishInst = f.get(null);
                        if (fishInst != null)
                            break;
                    }
                }
            }
            // 3. Nếu chưa có, lấy từ activeTask
            if (fishInst == null && activeTask != null && activeTask.taskInstance != null
                    && fishCls.isInstance(activeTask.taskInstance)) {
                fishInst = activeTask.taskInstance;
            }
            if (fishInst != null) {
                cachedFishInstance = fishInst;
            } else if (cachedFishInstance != null && isFishActive) {
                fishInst = cachedFishInstance;
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
                        } catch (Throwable ignored) {
                        }
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
                                if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())
                                        && f.getType().equals(long.class)) {
                                    f.setAccessible(true);
                                    if (f.getName().equals(schema.fishTargetMsField)) {
                                        targetField = f;
                                    }
                                } else if (java.lang.reflect.Modifier.isStatic(f.getModifiers())
                                        && f.getType().equals(int.class)) {
                                    if (f.getName().equals(schema.fishFarmIntervalField)) {
                                        f.setAccessible(true);
                                        int mins = f.getInt(null);
                                        if (mins > 0)
                                            intervalMs = (long) mins * 60000L;
                                    }
                                }
                            }
                            if (targetField != null && intervalMs > 0) {
                                targetField.setLong(fishInst, now + intervalMs);
                            }
                        }
                    }
                } catch (Throwable ignored) {
                }
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

            if (targetMs <= now && activeTask != null && activeTask.taskInstance != null
                    && fishCls.isInstance(activeTask.taskInstance)) {
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

            if (isFishActive) {
                if (isCurrentlyInFarmFromFish) {
                    stats.farmingCountdown = "Đang trong farm...";
                } else if (targetMs > now && backToFarmEnabled) {
                    int diffSec = (int) ((targetMs - now) / 1000L);
                    stats.farmingCountdown = formatCountdownWithMod(cl, diffSec);
                    lastKnownFishTargetMs = targetMs;
                } else if (backToFarmEnabled) {
                    stats.farmingCountdown = "Xin chờ...";
                } else {
                    stats.farmingCountdown = "Không hẹn giờ";
                }
            } else if (stats.farmingCountdown == null || stats.farmingCountdown.isEmpty()) {
                stats.farmingCountdown = "--:--";
            }
        } catch (Throwable ignored) {
        }
    }

    private static void extractSellOreStats(ClassLoader cl, ModSchema schema, PlayerStats stats) {
        if (schema.sellOreClassName == null || schema.sellOreClassName.isEmpty())
            return;
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
        } catch (Throwable ignored) {
        }
    }

    public static Object getActivePlayerInstance(ClassLoader cl) {
        return getActivePlayerInstance(cl, getCurrentSchema());
    }

    public static Object getActivePlayerInstance(ClassLoader cl, ModSchema schema) {
        if (cl == null || schema == null)
            return null;
        for (String containerName : schema.playerContainerClasses) {
            try {
                Class<?> containerCls = cl.loadClass(containerName);
                for (Field f : containerCls.getDeclaredFields()) {
                    if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                        f.setAccessible(true);
                        // 1. Kiểm tra chính xác theo tên lớp trong schema
                        if (schema.playerClassName != null && f.getType().getName().equals(schema.playerClassName)) {
                            Object candidate = f.get(null);
                            if (candidate != null)
                                return candidate;
                        }
                        // 2. Fallback kiểm tra bất kỳ class nhân vật nào kế thừa từ dF hoặc bp
                        try {
                            Class<?> dfCls = cl.loadClass("dF");
                            if (dfCls.isAssignableFrom(f.getType())) {
                                Object candidate = f.get(null);
                                if (candidate != null)
                                    return candidate;
                            }
                        } catch (Throwable ignored) {
                        }
                        try {
                            Class<?> bpCls = cl.loadClass("bp");
                            if (bpCls.isAssignableFrom(f.getType())) {
                                Object candidate = f.get(null);
                                if (candidate != null)
                                    return candidate;
                            }
                        } catch (Throwable ignored) {
                        }
                    }
                }
            } catch (Throwable ignored) {
            }
        }
        return null;
    }

    public static String getEquipSignature(Object playerObj) {
        if (playerObj == null)
            return "";
        StringBuilder sb = new StringBuilder();
        try {
            Class<?> cls = playerObj.getClass();
            while (cls != null && !cls.equals(Object.class)) {
                for (Field f : cls.getDeclaredFields()) {
                    f.setAccessible(true);
                    if (f.getType().equals(short[].class)) {
                        short[] arr = (short[]) f.get(playerObj);
                        if (arr != null) {
                            sb.append(f.getName()).append(":");
                            for (short s : arr)
                                sb.append(s).append(",");
                        }
                    } else if (f.getType().equals(int[].class)) {
                        int[] arr = (int[]) f.get(playerObj);
                        if (arr != null) {
                            sb.append(f.getName()).append(":");
                            for (int val : arr)
                                sb.append(val).append(",");
                        }
                    } else if (f.getType().equals(java.util.Vector.class)) {
                        // Vector chứa các đối tượng vật phẩm trang bị cg (cánh, phụ kiện, nón...)
                        java.util.Vector<?> vec = (java.util.Vector<?>) f.get(playerObj);
                        if (vec != null && !vec.isEmpty()) {
                            sb.append(f.getName()).append(":[");
                            for (int i = 0; i < vec.size(); i++) {
                                Object item = vec.elementAt(i);
                                if (item != null) {
                                    for (Field itemField : item.getClass().getDeclaredFields()) {
                                        if (itemField.getType().equals(short.class) || itemField.getType().equals(int.class)) {
                                            itemField.setAccessible(true);
                                            sb.append(itemField.get(item)).append(",");
                                        }
                                    }
                                }
                            }
                            sb.append("];");
                        }
                    }
                }
                cls = cls.getSuperclass();
            }
        } catch (Throwable ignored) {
        }
        return sb.toString();
    }

    /**
     * Trích xuất trực tiếp Model / Sprite nhân vật Avatar sang Base64 PNG / Animated GIF
     * Phản ánh chuẩn xác 100% diện mạo và hiệu ứng trang bị (cánh, hào quang) của nhân vật trong game
     * KHÔNG can thiệp/làm sai lệch tư thế tự nhiên hay trạng thái di chuyển/câu cá của nhân vật.
     */
    public static String exportPlayerAvatarBase64() {
        try {
            ClassLoader cl = getClassLoader();
            if (cl == null)
                return null;
            Object playerObj = getActivePlayerInstance(cl);
            if (playerObj == null)
                return null;

            int w = 46;
            int h = 56;
            int footY = 48;
            int centerX = w / 2;

            // 1. Warm-up pre-paint để kích hoạt nạp lười (lazy-load) mọi sprite/part item từ RMS hoặc Server
            try {
                javax.microedition.lcdui.Image warmImg = javax.microedition.lcdui.Image.createImage(w, h);
                if (warmImg != null) {
                    invokePlayerPaint(playerObj, warmImg.getGraphics(), centerX, footY);
                }
                Thread.sleep(150); // Cho phép luồng nạp RMS / Image nạp kịp vào bộ nhớ
            } catch (Throwable ignored) {}

            java.util.List<int[]> frames = new java.util.ArrayList<int[]>();
            int[] pixelCounts = new int[4];
            int maxPixels = 0;

            for (int f = 0; f < 4; f++) {
                int[] rgb = captureCleanFrame(playerObj, w, h, centerX, footY);
                if (rgb == null) break;

                int count = 0;
                for (int c : rgb) {
                    if ((c & 0xFF000000) != 0) count++;
                }
                frames.add(rgb);
                pixelCounts[f] = count;
                if (count > maxPixels) maxPixels = count;

                if (f < 3) {
                    try {
                        Thread.sleep(90);
                    } catch (Throwable ignored) {
                    }
                }
            }

            // Kiểm tra tính toàn vẹn của các khung hình: nếu có frame bị thiếu bộ phận do nạp trễ (pixel count < 75% maxPixels),
            // tiến hành chụp lại 4 frame hoàn chỉnh một lần nữa khi các asset đã nạp 100%.
            if (maxPixels > 0 && frames.size() == 4) {
                boolean hasIncompleteFrame = false;
                for (int count : pixelCounts) {
                    if (count < maxPixels * 0.75) {
                        hasIncompleteFrame = true;
                        break;
                    }
                }
                if (hasIncompleteFrame) {
                    frames.clear();
                    for (int f = 0; f < 4; f++) {
                        int[] rgb = captureCleanFrame(playerObj, w, h, centerX, footY);
                        if (rgb == null) break;
                        frames.add(rgb);
                        if (f < 3) {
                            try { Thread.sleep(90); } catch (Throwable ignored) {}
                        }
                    }
                }
            }

            if (maxPixels < 120) {
                // Chỉ có bóng nhân vật dưới chân (chưa nạp xong part áo/quần/tóc/cánh sau khi reconnect/GC), bỏ qua không ghi đè avatar
                return null;
            }

            if (!frames.isEmpty()) {
                boolean hasDiff = false;
                if (frames.size() > 1) {
                    int[] f0 = frames.get(0);
                    for (int f = 1; f < frames.size(); f++) {
                        int[] curr = frames.get(f);
                        for (int i = 0; i < curr.length; i++) {
                            if (curr[i] != f0[i]) {
                                hasDiff = true;
                                break;
                            }
                        }
                        if (hasDiff) break;
                    }
                }

                if (hasDiff && frames.size() > 1) {
                    byte[] gifBytes = encodeMultiFrameGif(frames, w, h, 14); // 140ms / frame loop
                    if (gifBytes != null && gifBytes.length > 0) {
                        return "data:image/gif;base64," + java.util.Base64.getEncoder().encodeToString(gifBytes);
                    }
                }

                // Ảnh PNG tĩnh sắc nét nếu nhân vật không mặc đồ có hiệu ứng động
                int[] f0 = frames.get(0);
                java.awt.image.BufferedImage staticImg = new java.awt.image.BufferedImage(w, h, java.awt.image.BufferedImage.TYPE_INT_ARGB);
                staticImg.setRGB(0, 0, w, h, f0, 0, w);
                java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
                javax.imageio.ImageIO.write(staticImg, "png", baos);
                byte[] bytes = baos.toByteArray();
                return "data:image/png;base64," + java.util.Base64.getEncoder().encodeToString(bytes);
            }
        } catch (Throwable ignored) {
        }
        return null;
    }

    /**
     * Bóc tách nền trong suốt chính xác tuyệt đối bằng Dual-Canvas Differential Keying.
     * Render trên nền Đen và nền Trắng để loại bỏ 100% viền màu tím/hồng (Magenta fringing),
     * đồng thời bảo toàn hoàn hảo màu trắng (#FFFFFF), màu đen và bóng bán trong suốt của nhân vật.
     */
    private static int[] captureCleanFrame(Object playerObj, int w, int h, int centerX, int footY) {
        try {
            // 1. Render trên nền Đen (0x000000)
            javax.microedition.lcdui.Image imgB = javax.microedition.lcdui.Image.createImage(w, h);
            if (imgB == null) return null;
            javax.microedition.lcdui.Graphics gB = imgB.getGraphics();
            gB.setColor(0x00000000);
            gB.fillRect(0, 0, w, h);
            if (!invokePlayerPaint(playerObj, gB, centerX, footY)) return null;

            // 2. Render trên nền Trắng (0xFFFFFF)
            javax.microedition.lcdui.Image imgW = javax.microedition.lcdui.Image.createImage(w, h);
            if (imgW == null) return null;
            javax.microedition.lcdui.Graphics gW = imgW.getGraphics();
            gW.setColor(0x00FFFFFF);
            gW.fillRect(0, 0, w, h);
            if (!invokePlayerPaint(playerObj, gW, centerX, footY)) return null;

            int[] rgbB = new int[w * h];
            int[] rgbW = new int[w * h];
            imgB.getRGB(rgbB, 0, w, 0, 0, w, h);
            imgW.getRGB(rgbW, 0, w, 0, 0, w, h);

            int[] out = new int[w * h];
            for (int i = 0; i < out.length; i++) {
                int cB = rgbB[i];
                int cW = rgbW[i];

                int rB = (cB >> 16) & 0xFF, greenB = (cB >> 8) & 0xFF, bB = cB & 0xFF;
                int rW = (cW >> 16) & 0xFF, greenW = (cW >> 8) & 0xFF, bW = cW & 0xFF;

                int diffR = rW - rB;
                int diffG = greenW - greenB;
                int diffB = bW - bB;
                int avgDiff = (diffR + diffG + diffB) / 3;

                int alpha = 255 - avgDiff;
                if (alpha <= 12) {
                    out[i] = 0x00000000;
                } else if (alpha >= 240) {
                    out[i] = 0xFF000000 | (rB << 16) | (greenB << 8) | bB;
                } else {
                    int r = Math.min(255, Math.max(0, (rB * 255) / alpha));
                    int g = Math.min(255, Math.max(0, (greenB * 255) / alpha));
                    int b = Math.min(255, Math.max(0, (bB * 255) / alpha));
                    out[i] = (alpha << 24) | (r << 16) | (g << 8) | b;
                }
            }
            return out;
        } catch (Throwable ignored) {
            return null;
        }
    }

    private static boolean invokePlayerPaint(Object playerObj, javax.microedition.lcdui.Graphics g, int centerX, int footY) {
        if (playerObj == null || g == null) return false;
        try {
            for (Method m : playerObj.getClass().getMethods()) {
                Class<?>[] pTypes = m.getParameterTypes();
                if (pTypes.length == 4 && pTypes[0].getName().contains("Graphics") && pTypes[1] == int.class
                        && pTypes[2] == int.class && pTypes[3] == boolean.class) {
                    m.setAccessible(true);
                    m.invoke(playerObj, g, centerX, footY, false);
                    return true;
                }
            }
            for (Method m : playerObj.getClass().getMethods()) {
                Class<?>[] pTypes = m.getParameterTypes();
                if (pTypes.length == 3 && pTypes[0].getName().contains("Graphics") && pTypes[1] == int.class
                        && pTypes[2] == int.class) {
                    m.setAccessible(true);
                    m.invoke(playerObj, g, centerX, footY);
                    return true;
                }
            }
            for (Method m : playerObj.getClass().getMethods()) {
                Class<?>[] pTypes = m.getParameterTypes();
                if (pTypes.length == 1 && pTypes[0].getName().contains("Graphics")) {
                    m.setAccessible(true);
                    m.invoke(playerObj, g);
                    return true;
                }
            }
        } catch (Throwable ignored) {}
        return false;
    }

    /**
     * Thuật toán nén chuẩn GIF89a đa khung hình (Multi-Frame Animated GIF) trong suốt không cần thư viện ngoài
     */
    public static byte[] encodeMultiFrameGif(java.util.List<int[]> frames, int width, int height,
            int delayHundredths) {
        try {
            java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();

            // 1. Thu thập bảng màu Palette hợp nhất (Transparent index = 0)
            java.util.LinkedHashMap<Integer, Integer> colorMap = new java.util.LinkedHashMap<Integer, Integer>();
            colorMap.put(0x00000000, 0);

            for (int[] frameRgb : frames) {
                for (int c : frameRgb) {
                    if ((c & 0xFF000000) != 0 && !colorMap.containsKey(c & 0x00FFFFFF)) {
                        if (colorMap.size() < 256)
                            colorMap.put(c & 0x00FFFFFF, colorMap.size());
                    }
                }
            }

            int paletteSize = Math.max(4, 1 << (32 - Integer.numberOfLeadingZeros(Math.max(2, colorMap.size() - 1))));
            if (paletteSize > 256)
                paletteSize = 256;
            int colorBits = Integer.numberOfTrailingZeros(paletteSize);

            // GIF89a Header
            baos.write("GIF89a".getBytes("US-ASCII"));
            writeShort(baos, width);
            writeShort(baos, height);
            baos.write(0x80 | ((colorBits - 1) << 4) | (colorBits - 1)); // Global Color Table Flag
            baos.write(0); // Background color index
            baos.write(0); // Pixel aspect ratio

            // Global Color Table
            int[][] palette = new int[paletteSize][3];
            for (java.util.Map.Entry<Integer, Integer> entry : colorMap.entrySet()) {
                int idx = entry.getValue();
                if (idx < paletteSize) {
                    int rgb = entry.getKey();
                    palette[idx][0] = (rgb >> 16) & 0xFF;
                    palette[idx][1] = (rgb >> 8) & 0xFF;
                    palette[idx][2] = rgb & 0xFF;
                }
            }
            for (int i = 0; i < paletteSize; i++) {
                baos.write(palette[i][0]);
                baos.write(palette[i][1]);
                baos.write(palette[i][2]);
            }

            // Netscape Application Extension for infinite loop
            baos.write(0x21);
            baos.write(0xFF);
            baos.write(11);
            baos.write("NETSCAPE2.0".getBytes("US-ASCII"));
            baos.write(3);
            baos.write(1);
            writeShort(baos, 0); // Loop forever
            baos.write(0);

            // Write all frames in sequence
            for (int[] frameRgb : frames) {
                writeGifFrame(baos, width, height, frameRgb, colorMap, delayHundredths);
            }

            // GIF Trailer
            baos.write(0x3B);
            return baos.toByteArray();
        } catch (Throwable t) {
            return null;
        }
    }

    private static void writeShort(java.io.OutputStream os, int val) throws java.io.IOException {
        os.write(val & 0xFF);
        os.write((val >> 8) & 0xFF);
    }

    private static void writeGifFrame(java.io.ByteArrayOutputStream baos, int width, int height, int[] rgb,
            java.util.Map<Integer, Integer> colorMap, int delay) throws java.io.IOException {
        // Graphic Control Extension (Transparent + Restore to bg)
        baos.write(0x21);
        baos.write(0xF9);
        baos.write(4);
        baos.write(0x09); // Disposal Method = 2 (Restore to background), Transparent color = 1
        writeShort(baos, delay);
        baos.write(0); // Transparent color index = 0
        baos.write(0);

        // Image Descriptor
        baos.write(0x2C);
        writeShort(baos, 0);
        writeShort(baos, 0);
        writeShort(baos, width);
        writeShort(baos, height);
        baos.write(0); // No local color table

        // Indexed pixels
        byte[] indexed = new byte[width * height];
        for (int i = 0; i < indexed.length; i++) {
            int c = rgb[i];
            if ((c & 0xFF000000) == 0) {
                indexed[i] = 0;
            } else {
                Integer idx = colorMap.get(c & 0x00FFFFFF);
                indexed[i] = (byte) (idx != null ? idx.intValue() : 0);
            }
        }

        int initCodeSize = 8;
        baos.write(initCodeSize);
        byte[] lzwData = lzwCompress(indexed, initCodeSize);

        int offset = 0;
        while (offset < lzwData.length) {
            int blockSize = Math.min(255, lzwData.length - offset);
            baos.write(blockSize);
            baos.write(lzwData, offset, blockSize);
            offset += blockSize;
        }
        baos.write(0);
    }

    private static byte[] lzwCompress(byte[] pixels, int codeSize) {
        int clearCode = 1 << codeSize;
        int eoiCode = clearCode + 1;
        int nextCode = clearCode + 2;
        int curCodeSize = codeSize + 1;
        int maxCode = 1 << curCodeSize;

        java.util.Map<String, Integer> dict = new java.util.HashMap<String, Integer>();
        for (int i = 0; i < clearCode; i++) {
            dict.put("" + (char) i, i);
        }

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        BitOutputStream bitOut = new BitOutputStream(out);
        bitOut.write(clearCode, curCodeSize);

        String prefix = "";
        for (byte b : pixels) {
            int c = b & 0xFF;
            String entry = prefix + (char) c;
            if (dict.containsKey(entry)) {
                prefix = entry;
            } else {
                bitOut.write(dict.get(prefix), curCodeSize);
                if (nextCode < 4096) {
                    dict.put(entry, nextCode++);
                    if (nextCode > maxCode && curCodeSize < 12) {
                        curCodeSize++;
                        maxCode = 1 << curCodeSize;
                    }
                } else {
                    bitOut.write(clearCode, curCodeSize);
                    dict.clear();
                    for (int i = 0; i < clearCode; i++) {
                        dict.put("" + (char) i, i);
                    }
                    nextCode = clearCode + 2;
                    curCodeSize = codeSize + 1;
                    maxCode = 1 << curCodeSize;
                }
                prefix = "" + (char) c;
            }
        }
        if (!prefix.isEmpty()) {
            bitOut.write(dict.get(prefix), curCodeSize);
        }
        bitOut.write(eoiCode, curCodeSize);
        bitOut.flush();

        return out.toByteArray();
    }

    private static class BitOutputStream {
        private final java.io.OutputStream os;
        private int curByte = 0;
        private int curBit = 0;

        public BitOutputStream(java.io.OutputStream os) {
            this.os = os;
        }

        public void write(int value, int bits) {
            for (int i = 0; i < bits; i++) {
                int bit = (value >> i) & 1;
                curByte |= (bit << curBit);
                curBit++;
                if (curBit == 8) {
                    try {
                        os.write(curByte);
                    } catch (java.io.IOException e) {
                        throw new RuntimeException(e);
                    }
                    curByte = 0;
                    curBit = 0;
                }
            }
        }

        public void flush() {
            if (curBit > 0) {
                try {
                    os.write(curByte);
                } catch (java.io.IOException e) {
                    throw new RuntimeException(e);
                }
                curByte = 0;
                curBit = 0;
            }
        }
    }

    // =========================================================================
    // 4. CÀI ĐẶT AUTO FARM, KIM CƯƠNG & UP THUÊ (SETTINGS VIA SCHEMA)
    // =========================================================================

    public static void applyFarmSetup(String jsonStr) {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return;

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
            } catch (Throwable ignored) {
            }

            try {
                Method saveM = farmCls.getMethod(schema.farmSaveMethod);
                saveM.invoke(null);
            } catch (Throwable ignored) {
            }

            String animalStr = (animal == 0 ? "Gà" : (animal == 1 ? "Vịt" : (animal == 2 ? "Heo" : "Không")));
            String fishStr = (fish == 0 ? "Cá" : (fish == 1 ? "Rùa" : "Không"));
            System.out.println("🌾 [CÀI ĐẶT AUTO FARM]: Đã nạp thành công (" + schema.name + ") | Cơ chế: "
                    + (mode == 0 ? "Lái buôn hỗ trợ" : "Farm thường") + " | Món ăn: " + backupDishes + " | Cây dự bị: "
                    + backupSeeds + " (>=" + replaceSeedThreshold + ") | Bán NS: " + sellProducts + " (>="
                    + sellThreshold + ", sl:" + sellQuantity + ") | Nuôi: " + animalStr + " | Cá: " + fishStr
                    + " | Cấp khế: " + maxStarfruitLevel);
        } catch (Throwable t) {
            System.err.println("[FARM SETUP ERR]: " + t.getMessage());
        }
    }

    public static void applyDiamondSetup(String jsonStr) {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return;

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
            } catch (Throwable ignored) {
            }

            String[] priorityNames = new String[] { "Vàng", "Trắng", "Đỏ", "Xanh lam", "Xanh lá", "Tím", "Mặc định" };
            String pName = (priorityOrder >= 0 && priorityOrder < priorityNames.length) ? priorityNames[priorityOrder]
                    : "Mặc định";

            // Cập nhật ngay lập tức nếu Auto Kim Cương đang chạy
            AutoTaskInfo activeTask = getActiveAutoTask();
            if (activeTask != null && "diamond".equalsIgnoreCase(activeTask.autoType)
                    && activeTask.taskInstance != null) {
                if (autoFarm) {
                    long newIntervalMs = (long) farmIntervalMinutes * 60000L;
                    setField(activeTask.taskInstance, schema.diamondTargetMsField, newIntervalMs, long.class);
                    if (harvestOnTime) {
                        boolean updated = updateSmartCropTimer(cl, schema, true, true);
                        if (!updated) {
                            setField(activeTask.taskInstance, schema.diamondAbsTargetMsField,
                                    System.currentTimeMillis() + newIntervalMs, long.class);
                        }
                    } else {
                        setField(activeTask.taskInstance, schema.diamondAbsTargetMsField,
                                System.currentTimeMillis() + newIntervalMs, long.class);
                    }
                } else {
                    setField(activeTask.taskInstance, schema.diamondAbsTargetMsField, 0L, long.class);
                }
            }

            System.out.println("💎 [CÀI ĐẶT AUTO KIM CƯƠNG]: Đã nạp thành công (" + schema.name
                    + ") | Bán đá đầy rương: " + sellOreOnFull + " | Tự về farm: " + autoFarm + " ("
                    + farmIntervalMinutes + " phút) | Thu hoạch đúng giờ: " + harvestOnTime + " | Thứ tự ưu tiên: "
                    + pName + " | Tự bỏ KCX: " + autoDropKcx + " | Tự bỏ NHB: " + autoDropNhb);
        } catch (Throwable t) {
            System.err.println("[DIAMOND SETUP ERR]: " + t.getMessage());
        }
    }

    public static void applyFishSetup(String jsonStr) {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return;

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
                } catch (Throwable ignored) {
                }
            }

            String[] mapNames = new String[] { "Map 1 (Cá rô, chép vàng)", "Map 2 (Cá lóc, nóc, cua)",
                    "Map 3 (Cá mập, chim, đuối, ngựa)" };
            String mName = (mapType >= 0 && mapType < mapNames.length) ? mapNames[mapType] : ("Map " + mapType);
            String[] rodNames = new String[] { "Không mua", "Cần VIP", "Cần Sắt", "Cần Tre" };
            String rName = (rodType >= 0 && rodType < rodNames.length) ? rodNames[rodType] : "Không mua";
            String[] sellNames = new String[] { "Bán tại chỗ", "Bán KST", "Bỏ cá" };
            String sName = (sellFishType >= 0 && sellFishType < sellNames.length) ? sellNames[sellFishType]
                    : "Bán tại chỗ";

            // Cập nhật ngay lập tức nếu Auto Câu Cá đang chạy
            AutoTaskInfo activeTask = getActiveAutoTask();
            if (activeTask != null && "fish".equalsIgnoreCase(activeTask.autoType) && activeTask.taskInstance != null) {
                if (backToFarm) {
                    long newIntervalMs = (long) farmIntervalMinutes * 60000L;
                    setField(activeTask.taskInstance, "do", newIntervalMs, long.class);
                    if (harvestOnTime) {
                        boolean updated = updateSmartCropTimer(cl, schema, false, true);
                        if (!updated) {
                            setField(activeTask.taskInstance, schema.fishTargetMsField,
                                    System.currentTimeMillis() + newIntervalMs, long.class);
                        }
                    } else {
                        setField(activeTask.taskInstance, schema.fishTargetMsField,
                                System.currentTimeMillis() + newIntervalMs, long.class);
                    }
                } else {
                    setField(activeTask.taskInstance, schema.fishTargetMsField, Long.MAX_VALUE, long.class);
                }
            }

            System.out.println("🎣 [CÀI ĐẶT AUTO CÂU CÁ]: Đã nạp thành công (" + schema.name + ") | Map: " + mName
                    + " | Cần câu: " + rName + " | Bán cá: " + sName + " | Tự mua vé: " + autoBuyTicket + " | Về farm: "
                    + backToFarm + " (" + farmIntervalMinutes + "p) | Bán KCX: " + sellKcx + " (SL: " + sellKcxThreshold
                    + ") | Ngoại trừ: " + excludeFish);
        } catch (Throwable t) {
            System.err.println("[FISH SETUP ERR]: " + t.getMessage());
        }
    }

    public static void applySellOreSetup(String jsonStr) {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return;

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
                } catch (Throwable ignored) {
                }
            }

            System.out.println("🪨 [CÀI ĐẶT AUTO BÁN ĐÁ]: Đã nạp thành công (" + schema.name + ") | Thời gian: "
                    + sellIntervalMinutes + " phút | Quãng nghỉ: " + delayMs + "ms | Khu bán: " + zoneFrom + " -> "
                    + zoneTo + " | Reset NHB: " + resetTimeOnNhb + " | Reset KCX: " + resetTimeOnKcx + " | Bỏ NHB: "
                    + dropNhbIfFailed + " | Bỏ KCX: " + dropKcxIfFailed);
        } catch (Throwable t) {
            System.err.println("[SELL ORE SETUP ERR]: " + t.getMessage());
        }
    }

    public static void applyUpThueSetup(int targetCoins, int upDays) {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return;

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> aQCls = cl.loadClass(schema.upThueClassName);
            setStaticField(aQCls, schema.targetCoinsField, int.class, targetCoins);
            setStaticField(aQCls, schema.upDaysField, long.class, (long) upDays);
            setStaticField(aQCls, schema.startedTsField, long.class, System.currentTimeMillis());

            // Lưu RMS thông qua schema nếu có
            if (schema.upThueSaveRmsClass != null && !schema.upThueSaveRmsClass.isEmpty()) {
                try {
                    Class<?> saveCls = cl.loadClass(schema.upThueSaveRmsClass);
                    Method saveMethod = saveCls.getMethod(schema.upThueSaveRmsMethod);
                    saveMethod.invoke(null);
                } catch (Throwable ignored) {
                }
            }

            // Gọi các hàm lưu RMS trên aQ nếu có
            for (String mName : new String[] { "save", "do", "if", "for", "byte", "try", "new" }) {
                try {
                    Method m = aQCls.getDeclaredMethod(mName);
                    if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && m.getParameterCount() == 0
                            && m.getReturnType().equals(void.class)) {
                        m.setAccessible(true);
                        m.invoke(null);
                    }
                } catch (Throwable ignored) {
                }
            }

            // Cập nhật UI chuỗi ngày tháng thông qua schema
            try {
                Object aQInstance = null;
                if (schema.upThueSingletonMethod != null && !schema.upThueSingletonMethod.isEmpty()) {
                    try {
                        Method aQDoMethod = aQCls.getMethod(schema.upThueSingletonMethod);
                        aQInstance = aQDoMethod.invoke(null);
                    } catch (Throwable ignored) {
                    }
                }
                if (aQInstance == null) {
                    for (Field f : aQCls.getDeclaredFields()) {
                        if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(aQCls)) {
                            f.setAccessible(true);
                            aQInstance = f.get(null);
                            if (aQInstance != null)
                                break;
                        }
                    }
                }
                if (aQInstance != null && schema.upThueFormatDateMethod != null) {
                    try {
                        Method fmtMethod = aQCls.getMethod(schema.upThueFormatDateMethod);
                        fmtMethod.invoke(aQInstance);
                    } catch (Throwable ignored) {
                    }
                }
            } catch (Throwable ignored) {
            }

            System.out.println("✅ [CÀI ĐẶT UP THUÊ]: Đã cập nhật -> Mục tiêu: "
                    + (targetCoins > 0 ? (targetCoins + " Xu") : "Không giới hạn") + ", Thời gian: "
                    + (upDays > 0 ? (upDays + " Ngày") : "Vĩnh viễn"));
        } catch (Throwable t) {
            System.err.println("[UP THUÊ SETUP ERR]: " + t.getMessage());
        }
    }

    public static void resetUpThueData() {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return;

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> aQCls = cl.loadClass(schema.upThueClassName);
            setStaticField(aQCls, schema.targetCoinsField, int.class, 0);
            setStaticField(aQCls, schema.earnedCoinsField, int.class, 0);
            setStaticField(aQCls, schema.collectedHeartsField, int.class, 0);
            setStaticField(aQCls, schema.upDaysField, long.class, 0L);
            setStaticField(aQCls, schema.startedTsField, long.class, System.currentTimeMillis());

            if (schema.upThueSaveRmsClass != null && !schema.upThueSaveRmsClass.isEmpty()) {
                try {
                    Class<?> saveCls = cl.loadClass(schema.upThueSaveRmsClass);
                    Method resetMethod = saveCls.getMethod(schema.upThueResetRmsMethod);
                    resetMethod.invoke(null);
                } catch (Throwable ignored) {
                }
            }

            // Gọi các hàm lưu RMS trên aQ nếu có
            for (String mName : new String[] { "save", "do", "if", "for", "byte", "try", "new" }) {
                try {
                    Method m = aQCls.getDeclaredMethod(mName);
                    if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && m.getParameterCount() == 0
                            && m.getReturnType().equals(void.class)) {
                        m.setAccessible(true);
                        m.invoke(null);
                    }
                } catch (Throwable ignored) {
                }
            }

            try {
                Object aQInstance = null;
                if (schema.upThueSingletonMethod != null && !schema.upThueSingletonMethod.isEmpty()) {
                    try {
                        Method aQDoMethod = aQCls.getMethod(schema.upThueSingletonMethod);
                        aQInstance = aQDoMethod.invoke(null);
                    } catch (Throwable ignored) {
                    }
                }
                if (aQInstance == null) {
                    for (Field f : aQCls.getDeclaredFields()) {
                        if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType().equals(aQCls)) {
                            f.setAccessible(true);
                            aQInstance = f.get(null);
                            if (aQInstance != null)
                                break;
                        }
                    }
                }
                if (aQInstance != null) {
                    if (schema.expiresAtStringField != null) {
                        setField(aQInstance, schema.expiresAtStringField, "Vĩnh viễn", String.class);
                    }
                    if (schema.upThueFormatDateMethod != null) {
                        try {
                            Method fmtMethod = aQCls.getMethod(schema.upThueFormatDateMethod);
                            fmtMethod.invoke(aQInstance);
                        } catch (Throwable ignored) {
                        }
                    }
                }
            } catch (Throwable ignored) {
            }

            System.out.println(
                    "🔄 [RESET DỮ LIỆU]: Đã reset toàn bộ thông số cày xu, tim và ngày up về hiện tại (Vĩnh viễn)!");
        } catch (Throwable t) {
            System.err.println("[RESET ERR]: " + t.getMessage());
        }
    }

    // =========================================================================
    // 5. ĐIỀU KHIỂN TIẾN TRÌNH AUTO (START / STOP / MONITOR VIA SCHEMA)
    // =========================================================================

    public static boolean startAuto(String autoType) {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return false;

        AutoTaskInfo curTaskBefore = getActiveAutoTask();
        boolean isSellOreSubTask = false;
        if (("sell_ore".equalsIgnoreCase(autoType) || "banda".equalsIgnoreCase(autoType)
                || "stone".equalsIgnoreCase(autoType) || "bd".equalsIgnoreCase(autoType))
                && curTaskBefore != null
                && ("diamond".equalsIgnoreCase(curTaskBefore.autoType) || "fish".equalsIgnoreCase(curTaskBefore.autoType))) {
            isSellOreSubTask = true;
        }

        if (!isSellOreSubTask) {
            stopAuto();
            try {
                Thread.sleep(350);
            } catch (InterruptedException ignored) {
            }
        }

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> taskCtrlCls = cl.loadClass(schema.taskControllerClassName);
            Class<?> taskArgCls = cl.loadClass(schema.taskArgClassName);

            Object taskObj = null;

            if ("farm".equalsIgnoreCase(autoType)) {
                boolean triggeredViaCmd = false;
                try {
                    Method cmdMethod = taskCtrlCls.getMethod("do", String.class);
                    Object res = cmdMethod.invoke(null, "af");
                    triggeredViaCmd = (res instanceof Boolean) ? ((Boolean) res).booleanValue() : true;
                } catch (Throwable ignored) {
                }

                if (!triggeredViaCmd) {
                    if (schema.farmTraderTaskClassName != null && !schema.farmTraderTaskClassName.isEmpty()) {
                        try {
                            Class<?> farmCls = cl.loadClass(schema.farmClassName);
                            Byte modeObj = (Byte) getStaticField(farmCls, schema.farmModeField, byte.class);
                            byte mode = (modeObj != null) ? modeObj.byteValue() : 0;
                            taskObj = (mode == 0) ? cl.loadClass(schema.farmTraderTaskClassName).newInstance()
                                    : farmCls.newInstance();
                        } catch (Throwable t) {
                            taskObj = cl.loadClass(schema.farmTaskClassName).newInstance();
                        }
                    } else {
                        taskObj = cl.loadClass(schema.farmTaskClassName).newInstance();
                    }
                    Method doMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls);
                    doMethod.invoke(null, taskObj);
                }
                System.out.println("🌾 [BẬT AUTO FARM]: Đã kích hoạt Auto Farm [" + schema.name + "]!");
                System.out.println(
                        "[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"farm\",\"status\":\"running\",\"message\":\"Đang chạy Auto Farm...\"}");
                return true;
            } else if ("diamond".equalsIgnoreCase(autoType) || "kc".equalsIgnoreCase(autoType)) {
                // 1. Thử gọi lệnh chat native của Mod "kc" (giống hệt người chơi gõ phím 'kc'
                // trong game)
                boolean triggeredViaCmd = false;
                try {
                    Method cmdMethod = taskCtrlCls.getMethod("do", String.class);
                    Object res = cmdMethod.invoke(null, "kc");
                    triggeredViaCmd = (res instanceof Boolean) ? ((Boolean) res).booleanValue() : true;
                } catch (Throwable ignored) {
                }

                Class<?> diamCls = cl.loadClass(schema.diamondClassName);
                taskObj = null;
                try {
                    Method getInst = diamCls.getMethod(schema.diamondSingletonMethod);
                    taskObj = getInst.invoke(null);
                } catch (Throwable ignored) {
                }
                if (taskObj == null) {
                    try {
                        taskObj = diamCls.newInstance();
                    } catch (Throwable ignored) {
                    }
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
                            } catch (Throwable ignored) {
                            }
                        }
                    }

                    // QUAN TRỌNG: Cập nhật biến watchdog int:J (tránh mod hiểu nhầm bị đứng 10 phút
                    // rồi gọi aQ.void() đăng xuất!)
                    try {
                        Field intF = taskObj.getClass().getField("int");
                        intF.setAccessible(true);
                        intF.setLong(taskObj, System.currentTimeMillis());
                    } catch (Throwable t) {
                        try {
                            Field intF = taskObj.getClass().getSuperclass().getDeclaredField("int");
                            intF.setAccessible(true);
                            intF.setLong(taskObj, System.currentTimeMillis());
                        } catch (Throwable ignored) {
                        }
                    }

                    // Đặt thời gian hẹn giờ về farm (soXu = now + intervalMs) để không bị lập tức
                    // nhảy về nông trại
                    long intervalMs = 60 * 60000L;
                    try {
                        Integer minsObj = (Integer) getStaticField(diamCls, schema.diamondIntervalField, int.class);
                        if (minsObj != null && minsObj.intValue() > 0) {
                            intervalMs = (long) minsObj.intValue() * 60000L;
                        }
                    } catch (Throwable ignored) {
                    }

                    boolean autoFarmOn = true;
                    try {
                        Boolean af = (Boolean) getStaticField(diamCls, schema.diamondAutoFarmField, boolean.class);
                        if (af != null)
                            autoFarmOn = af.booleanValue();
                    } catch (Throwable ignored) {
                    }

                    boolean harvestOnTimeOn = false;
                    try {
                        Boolean ht = (Boolean) getStaticField(diamCls, schema.diamondHarvestOnTimeField, boolean.class);
                        if (ht != null)
                            harvestOnTimeOn = ht.booleanValue();
                    } catch (Throwable ignored) {
                    }

                    setField(taskObj, schema.diamondTargetMsField, intervalMs, long.class);
                    if (autoFarmOn) {
                        if (harvestOnTimeOn) {
                            boolean updated = updateSmartCropTimer(cl, schema, true, true);
                            if (!updated) {
                                setField(taskObj, schema.diamondAbsTargetMsField,
                                        System.currentTimeMillis() + intervalMs, long.class);
                            }
                        } else {
                            setField(taskObj, schema.diamondAbsTargetMsField, System.currentTimeMillis() + intervalMs,
                                    long.class);
                        }
                    } else {
                        setField(taskObj, schema.diamondAbsTargetMsField, 0L, long.class);
                    }

                    if (!triggeredViaCmd) {
                        Method doMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls);
                        doMethod.invoke(null, taskObj);
                    }
                }

                // Đảm bảo thread worker của taskController đang chạy
                try {
                    Object ctrlInst = getStaticField(taskCtrlCls, "do", taskCtrlCls);
                    if (ctrlInst != null) {
                        Method startRunner = taskCtrlCls.getMethod("do");
                        startRunner.invoke(ctrlInst);
                    }
                } catch (Throwable ignored) {
                }

                System.out.println("💎 [BẬT AUTO KIM CƯƠNG]: Đã kích hoạt Auto Đào Kim Cương [" + schema.name + "]!");
                System.out.println(
                        "[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"diamond\",\"status\":\"running\",\"message\":\"Đang chạy Auto Đào Kim Cương...\"}");
                return true;
            } else if ("fish".equalsIgnoreCase(autoType) || "cau_ca".equalsIgnoreCase(autoType)
                    || "cc".equalsIgnoreCase(autoType)) {
                if (schema.fishTaskClassName != null && !schema.fishTaskClassName.isEmpty()) {
                    Class<?> fishCls = cl.loadClass(schema.fishTaskClassName);
                    try {
                        String sMethod = (schema.fishSingletonMethod != null && !schema.fishSingletonMethod.isEmpty())
                                ? schema.fishSingletonMethod
                                : "do";
                        Method instM = fishCls.getMethod(sMethod);
                        taskObj = instM.invoke(null);
                    } catch (Throwable ignored) {
                        try {
                            taskObj = fishCls.newInstance();
                        } catch (Throwable ignored2) {
                        }
                    }
                    if (taskObj != null) {
                        // Gọi hàm new() để bS khởi tạo Map ID và trạng thái câu cá
                        try {
                            Method newM = fishCls.getMethod("new");
                            newM.invoke(taskObj);
                        } catch (Throwable ignored) {
                        }

                        // Khởi tạo thời gian về farm
                        long intervalMs = 30 * 60000L;
                        try {
                            Integer minsObj = (Integer) getStaticField(fishCls, schema.fishFarmIntervalField,
                                    int.class);
                            if (minsObj != null && minsObj.intValue() > 0) {
                                intervalMs = (long) minsObj.intValue() * 60000L;
                            }
                        } catch (Throwable ignored) {
                        }

                        boolean backToFarmOn = true;
                        try {
                            Boolean bf = (Boolean) getStaticField(fishCls, schema.fishBackToFarmField, boolean.class);
                            if (bf != null)
                                backToFarmOn = bf.booleanValue();
                        } catch (Throwable ignored) {
                        }

                        boolean harvestOnTimeOn = false;
                        try {
                            Boolean ht = (Boolean) getStaticField(fishCls, schema.fishHarvestOnTimeField,
                                    boolean.class);
                            if (ht != null)
                                harvestOnTimeOn = ht.booleanValue();
                        } catch (Throwable ignored) {
                        }

                        setField(taskObj, "do", intervalMs, long.class);
                        if (backToFarmOn) {
                            if (harvestOnTimeOn) {
                                boolean updated = updateSmartCropTimer(cl, schema, false, true);
                                if (!updated) {
                                    setField(taskObj, schema.fishTargetMsField, System.currentTimeMillis() + intervalMs,
                                            long.class);
                                }
                            } else {
                                setField(taskObj, schema.fishTargetMsField, System.currentTimeMillis() + intervalMs,
                                        long.class);
                            }
                        } else {
                            setField(taskObj, schema.fishTargetMsField, Long.MAX_VALUE, long.class);
                        }

                        Method doMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls);
                        doMethod.invoke(null, taskObj);
                        System.out.println("🎣 [BẬT AUTO FISH]: Đã kích hoạt Auto Câu Cá [" + schema.name
                                + "] (Hẹn về farm: " + (intervalMs / 60000) + " phút)!");
                        System.out.println(
                                "[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"fish\",\"status\":\"running\",\"message\":\"Đang chạy Auto Câu Cá...\"}");
                        return true;
                    }
                } else {
                    System.err.println("⚠️ [KHÔNG HỖ TRỢ]: Bản mod đang chạy [" + schema.name
                            + "] không có Auto Câu Cá. Vui lòng đổi sang [avatar_fish_build40.jar] trong Quản Lý File!");
                    System.out.println(
                            "[AUTO_STATUS]: {\"isRunning\":false,\"status\":\"error\",\"message\":\"Bản mod hiện tại không hỗ trợ Auto Câu Cá. Hãy chọn file avatar_fish_build40.jar!\"}");
                }
            } else if ("sell_ore".equalsIgnoreCase(autoType) || "banda".equalsIgnoreCase(autoType)
                    || "stone".equalsIgnoreCase(autoType) || "bd".equalsIgnoreCase(autoType)) {
                if (schema.sellOreTaskClassName != null && !schema.sellOreTaskClassName.isEmpty()) {
                    Class<?> sellCls = cl.loadClass(schema.sellOreTaskClassName);
                    taskObj = sellCls.newInstance();

                    if (isSellOreSubTask && curTaskBefore != null && curTaskBefore.taskInstance != null) {
                        try {
                            Method subDoMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls, taskArgCls);
                            subDoMethod.invoke(null, taskObj, curTaskBefore.taskInstance);
                            System.out.println("🪨 [BẬT AUTO BÁN ĐÁ]: Tạm chuyển sang Auto Bán Đá (từ " + curTaskBefore.friendlyName + ")!");
                            System.out.println(
                                    "[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"sell_ore\",\"parentAutoType\":\"" + curTaskBefore.autoType + "\",\"subTask\":true,\"status\":\"running\",\"message\":\"Đang đi bán đá (từ " + curTaskBefore.friendlyName + ")...\"}");
                            return true;
                        } catch (Throwable ignored) {
                        }
                    }

                    Method doMethod = taskCtrlCls.getMethod(schema.taskStartMethod, taskArgCls);
                    doMethod.invoke(null, taskObj);
                    System.out.println("🪨 [BẬT AUTO BÁN ĐÁ]: Đã kích hoạt Auto Bán Đá [" + schema.name + "]!");
                    System.out.println(
                            "[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"sell_ore\",\"status\":\"running\",\"message\":\"Đang chạy Auto Bán Đá...\"}");
                    return true;
                }
            } else if ("event".equalsIgnoreCase(autoType) || "sk".equalsIgnoreCase(autoType)) {
                try {
                    Class<?> skCls = cl.loadClass("SkRunner");
                    Method bootM = skCls.getMethod("boot");
                    bootM.invoke(null);
                    System.out.println("🎉 [BẬT AUTO SỰ KIỆN]: Đã kích hoạt Auto Sự Kiện (SkRunner) [" + schema.name + "]!");
                    System.out.println(
                            "[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"event\",\"status\":\"running\",\"message\":\"Đang chạy Auto Sự Kiện...\"}");
                    return true;
                } catch (Throwable t) {
                    System.err.println("[SKRUNNER ERR]: " + t.getMessage());
                }
            } else if ("lich".equalsIgnoreCase(autoType)) {
                try {
                    Class<?> lichCls = cl.loadClass("LichRunner");
                    Method bootM = lichCls.getMethod("boot");
                    bootM.invoke(null);
                    System.out.println("⏰ [BẬT AUTO LỊCH]: Đã kích hoạt Auto Hẹn Giờ Theo Lịch (LichRunner) [" + schema.name + "]!");
                    System.out.println(
                            "[AUTO_STATUS]: {\"isRunning\":true,\"autoType\":\"lich\",\"status\":\"running\",\"message\":\"Đang chạy Auto Theo Lịch...\"}");
                    return true;
                } catch (Throwable t) {
                    System.err.println("[LICHRUNNER ERR]: " + t.getMessage());
                }
            }
        } catch (Throwable t) {
            System.err.println("[START_AUTO ERR]: " + t.getMessage());
        }

        return false;
    }

    public static void stopAuto() {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return;

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> taskCtrlCls = cl.loadClass(schema.taskControllerClassName);
            Method stopMethod = taskCtrlCls.getMethod(schema.taskStopMethod);
            stopMethod.invoke(null);
        } catch (Throwable ignored) {
        }

        try {
            Class<?> skCls = cl.loadClass("SkRunner");
            Method stopM = skCls.getDeclaredMethod("stopAuto");
            stopM.setAccessible(true);
            stopM.invoke(null);
        } catch (Throwable ignored) {
        }

        try {
            Class<?> lichCls = cl.loadClass("LichRunner");
            Method stopM = lichCls.getDeclaredMethod("onManualStop");
            stopM.setAccessible(true);
            stopM.invoke(null);
        } catch (Throwable ignored) {
        }

        cachedDiamondInstance = null;
        cachedFishInstance = null;
        lastKnownDiamondTargetMs = 0L;
        lastKnownFishTargetMs = 0L;
        wasInFarmDiamond = false;
        wasInFarmFish = false;

        System.out.println("⏹️ [DỪNG AUTO]: Đã dừng tiến trình Auto.");
        System.out.println("[AUTO_STATUS]: {\"isRunning\":false,\"status\":\"stopped\",\"message\":\"Đã dừng Auto\"}");
    }

    public static AutoTaskInfo getActiveAutoTask() {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return null;

        ModSchema schema = getCurrentSchema();

        try {
            Class<?> taskCtrlCls = cl.loadClass(schema.taskControllerClassName);
            Class<?> taskArgCls = (schema.taskArgClassName != null && !schema.taskArgClassName.isEmpty())
                    ? cl.loadClass(schema.taskArgClassName)
                    : null;

            for (Field f : taskCtrlCls.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    if (taskArgCls != null && taskArgCls.isAssignableFrom(f.getType())) {
                        f.setAccessible(true);
                        Object task = f.get(null);
                        if (task != null && taskArgCls.isInstance(task)) {
                            String clsName = task.getClass().getSimpleName();
                            String friendly = null;
                            String type = null;

                            if (clsName.equals(schema.farmTaskClassName) || "AutoFarm".equals(clsName)
                                    || "aC".equals(clsName) || "bq".equals(clsName) || "hp".equals(clsName)
                                    || "bt".equals(clsName)) {
                                friendly = "Auto Farm (Nông trại)";
                                type = "farm";
                            } else if (schema.farmTraderTaskClassName != null && !schema.farmTraderTaskClassName.isEmpty()
                                    && (clsName.equals(schema.farmTraderTaskClassName) || "AutoLaiBuon".equals(clsName)
                                    || "hn".equals(clsName))) {
                                friendly = "Auto Farm (Lái buôn hỗ trợ)";
                                type = "farm";
                            } else if (clsName.equals(schema.diamondTaskClassName) || "AutoKimCuong".equals(clsName)
                                    || "X".equals(clsName) || "aj".equals(clsName) || "dy".equals(clsName)) {
                                friendly = "Auto Đào Kim Cương";
                                type = "diamond";
                            } else if (clsName.equals(schema.fishTaskClassName) || "AutoCauCa".equals(clsName)
                                    || "bS".equals(clsName)) {
                                friendly = "Auto Câu Cá";
                                type = "fish";
                            } else if (clsName.equals(schema.sellOreTaskClassName) || "AutoBanDa".equals(clsName)
                                    || "al".equals(clsName) || "c".equals(clsName) || "d".equals(clsName)) {
                                friendly = "Auto Bán Đá";
                                type = "sell_ore";
                            } else if ("AutoChamEmBe".equals(clsName) || "bJ".equals(clsName) || "bP".equals(clsName)
                                    || "dm_0".equals(clsName) || "F".equals(clsName)) {
                                friendly = "Auto Chăm Em Bé";
                                type = "baby";
                            } else if ("AutoTaiXiu".equals(clsName) || "av_0".equals(clsName)
                                    || "cl_0".equals(clsName) || "TxMenu".equals(clsName) || "dC".equals(clsName)) {
                                friendly = "Auto Tài Xỉu";
                                type = "tai_xiu";
                            } else if ("SkRunner".equals(clsName) || "SkFarm".equals(clsName)) {
                                friendly = "Auto Sự Kiện";
                                type = "event";
                            } else if ("LichRunner".equals(clsName)) {
                                friendly = "Auto Theo Lịch";
                                type = "lich";
                            } else if ("NvMenu".equals(clsName) || "gT".equals(clsName)) {
                                friendly = "Auto Nhiệm Vụ";
                                type = "mission";
                            } else if ("ak".equals(clsName) || "gr".equals(clsName) || "eZ".equals(clsName)) {
                                friendly = "Auto Nâng Cấp / Luyện Đá";
                                type = "upgrade";
                            } else if ("fY".equals(clsName)) {
                                friendly = "Auto Ngồi Tù";
                                type = "prison";
                            } else {
                                friendly = "Auto (" + clsName + ")";
                                type = "auto";
                            }

                            // Tự động nhận diện parent task (ví dụ: bot đang ở AutoFarm hay AutoBanDa nhưng
                            // parent là AutoKimCuong)
                            String parentType = null;
                            boolean isSub = false;
                            try {
                                Class<?> tCls = task.getClass();
                                while (tCls != null && !tCls.equals(Object.class)) {
                                    for (Field tf : tCls.getDeclaredFields()) {
                                        if (!java.lang.reflect.Modifier.isStatic(tf.getModifiers())
                                                && taskArgCls.isAssignableFrom(tf.getType())) {
                                            tf.setAccessible(true);
                                            Object parentObj = tf.get(task);
                                            if (parentObj != null) {
                                                String pName = parentObj.getClass().getSimpleName();
                                                if (pName.equals(schema.diamondTaskClassName)
                                                        || "AutoKimCuong".equals(pName) || "X".equals(pName)
                                                        || "aj".equals(pName)) {
                                                    parentType = "diamond";
                                                    isSub = true;
                                                    break;
                                                } else if (pName.equals(schema.fishTaskClassName)
                                                        || "AutoCauCa".equals(pName) || "bS".equals(pName)) {
                                                    parentType = "fish";
                                                    isSub = true;
                                                    break;
                                                } else if (pName.equals(schema.farmTaskClassName)
                                                        || "AutoFarm".equals(pName) || "aC".equals(pName)
                                                        || "bq".equals(pName)) {
                                                    parentType = "farm";
                                                    isSub = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (parentType != null)
                                        break;
                                    tCls = tCls.getSuperclass();
                                }
                            } catch (Throwable ignored) {
                            }

                            return new AutoTaskInfo(task, clsName, friendly, type, parentType, isSub);
                        }
                    }
                }
            }
        } catch (Throwable ignored) {
        }

        return null;
    }

    // =========================================================================
    // 6. HELPER REFLECTION & RMS UTILITIES
    // =========================================================================

    public static void setField(Object obj, String fieldName, Object val, Class<?> expectedType) {
        if (obj == null)
            return;
        try {
            Class<?> c = obj.getClass();
            while (c != null) {
                for (Field f : c.getDeclaredFields()) {
                    if (f.getName().equals(fieldName)
                            && (expectedType == null || expectedType.isAssignableFrom(f.getType()))) {
                        f.setAccessible(true);
                        f.set(obj, val);
                        return;
                    }
                }
                c = c.getSuperclass();
            }
        } catch (Throwable ignored) {
        }
    }

    public static void setStaticField(Class<?> cls, String name, Class<?> type, Object value) {
        if (cls == null || name == null)
            return;
        try {
            for (Field f : cls.getDeclaredFields()) {
                if (f.getName().equals(name) && f.getType().equals(type)
                        && java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    f.setAccessible(true);
                    f.set(null, value);
                    return;
                }
            }
        } catch (Throwable ignored) {
        }
    }

    public static Object getFieldValue(Object obj, String fieldName) {
        if (obj == null || fieldName == null)
            return null;
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
        } catch (Throwable ignored) {
        }
        return null;
    }

    public static Object getStaticField(Class<?> cls, String name, Class<?> type) {
        if (cls == null || name == null)
            return null;
        try {
            for (Field f : cls.getDeclaredFields()) {
                if (f.getName().equals(name) && f.getType().equals(type)
                        && java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    f.setAccessible(true);
                    return f.get(null);
                }
            }
        } catch (Throwable ignored) {
        }
        return null;
    }

    public static String[] readCredentialsFromRms(String appId) {
        try {
            if (appId == null || appId.isEmpty())
                appId = "avatar_main";
            File rmsDir = new File("./.microemulator/suite-" + appId);
            File loginRms = new File(rmsDir, "2.5.8avlogin.rs");
            if (!loginRms.exists())
                return null;

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
            } catch (Throwable ignored) {
            }

            String finalU = (user2 != null && !user2.isEmpty()) ? user2 : user1;
            String finalP = (pass2 != null && !pass2.isEmpty()) ? pass2 : pass1;
            return new String[] { finalU, finalP };
        } catch (Throwable ignored) {
        }
        return null;
    }

    public static String extractJsonString(String json, String key, String defVal) {
        try {
            Pattern p = Pattern.compile("\"" + key + "\"\\s*:\\s*\"([^\"]*)\"");
            Matcher m = p.matcher(json);
            if (m.find())
                return m.group(1);

            Pattern p2 = Pattern.compile("\"" + key + "\"\\s*:\\s*([^,}\\]\\s]+)");
            Matcher m2 = p2.matcher(json);
            if (m2.find())
                return m2.group(1).replace("\"", "").trim();
        } catch (Throwable ignored) {
        }
        return defVal;
    }

    public static int extractJsonInt(String json, String key, int defVal) {
        try {
            Pattern p = Pattern.compile("\"" + key + "\"\\s*:\\s*\"?(-?\\d+)\"?");
            Matcher m = p.matcher(json);
            if (m.find())
                return Integer.parseInt(m.group(1));
        } catch (Throwable ignored) {
        }
        return defVal;
    }

    public static boolean extractJsonBool(String json, String key, boolean defVal) {
        try {
            Pattern p = Pattern.compile("\"" + key + "\"\\s*:\\s*(true|false)");
            Matcher m = p.matcher(json);
            if (m.find())
                return Boolean.parseBoolean(m.group(1));
        } catch (Throwable ignored) {
        }
        return defVal;
    }
}
