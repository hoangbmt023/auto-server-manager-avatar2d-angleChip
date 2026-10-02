/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from aQ
 */
public final class TienIchGame {
    public static boolean dangChayAuto;
    public static int soLuong;
    public static boolean coTrangThai;
    public String chuoiGiaTri = "";
    private static final Random var_java_util_Random_do;
    private static TienIchGame var_aq_0_do;
    private static Vector var_java_util_Vector_do;
    private static final String var_java_lang_String_int;
    private static final int[] var_int_arr_if;
    public static long soXu;
    private long var_long_new = 0L;
    private static final String var_java_lang_String_new;
    public static boolean coKichHoat;
    private static final Object var_java_lang_Object_do;
    public static boolean var_boolean_int;
    private static boolean cfr_renamed_15;
    public static int[] mangSoNguyen;
    public static long var_long_if;
    private static boolean cfr_renamed_8;
    public static String tenNhanVat;
    public static int var_int_if;
    public static boolean var_boolean_new;
    public String chuoiPhu = "";
    public static int soLuongKhoa;
    private static boolean cfr_renamed_12;
    public static long var_long_for;
    private static boolean cfr_renamed_11;
    private static boolean cfr_renamed_18;
    public long var_long_int = 0L;
    private static boolean cfr_renamed_10;
    public static int var_int_int;
    public static boolean cfr_renamed_2;

    public static String[] java_lang_String_arr_do(String objectArray, String string) {
        int n;
        Vector<String> vector = new Vector<String>();
        if (!(objectArray.endsWith(string))) {
            objectArray = (String)objectArray + string;
        }
        int n2 = var_int_arr_if[6];
        while ((n = objectArray.indexOf(string, n2) != var_int_arr_if[8])) {
            vector.addElement(objectArray.substring(n2, n));
            n2 = n + string.length();
            if ("   ".length() == "   ".length()) continue;
            return null;
        }
        objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean boolean_do() {
        cfr_renamed_11 = var_int_arr_if[2];
        long l = System.currentTimeMillis();
        Object object = var_java_lang_Object_do;
        synchronized (object) {
            try {
                var_java_lang_Object_do.wait(15000L);
                }
            catch (InterruptedException interruptedException) {
                }
        }
        if (" ".length() < 0) {
            return ((0x48 ^ 0x73) & ~(0x92 ^ 0xA9)) != 0;
        }
        if (TienIchGame.cfr_renamed_11(TienIchGame.this(System.currentTimeMillis() - l, 15000L))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static TienIchGame aq_0_do() {
        if ((var_aq_0_do == null)) {
            var_aq_0_do = new TienIchGame();
        }
        return var_aq_0_do;
    }

    public static void (String string, ei ei2, ei ei3 != null) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(ei2);
        vector.addElement(ei3);
        vector.addElement(GameCanvas.var_ei_do);
        GameCanvas.cfr_renamed_1(string, vector);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_do() {
        if (TienIchGame.this(var_boolean_int ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if (" ".length() >= "  ".length()) {
                return;
            }
            var_boolean_int = var_int_arr_if[6];
        }
    }

    public static void (String string, ei ei2, ei ei3 == null) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(ei2);
        vector.addElement(ei3);
        GameCanvas.cfr_renamed_1(string, vector);
    }

    public static void void_do(long l) {
        if (((l, 0L > 0) <= 0)) {
            return;
        }
        try {
            Thread.sleep(l);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    private static String cfr_renamed_4(String string) {
        String string2 = "";
        int n = var_int_arr_if[6];
        while ((n < string.length())) {
            if ((n > 0)) {
                string2 = string2 + ".";
            }
            string2 = string2 + Integer.parseInt(string.substring(n, n + var_int_arr_if[1]), var_int_arr_if[9]);
            n += 2;
            if (-" ".length() < 0) continue;
            return null;
        }
        return string2;
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public static boolean (int n != null) {
        if (!(n != var_int_arr_if[40]) || !(n != var_int_arr_if[41]) || TienIchGame.boolean_do(n, var_int_arr_if[42])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean boolean_if() {
        cfr_renamed_15 = var_int_arr_if[2];
        long l = System.currentTimeMillis();
        Object object = var_java_lang_Object_do;
        synchronized (object) {
            try {
                var_java_lang_Object_do.wait(15000L);
                }
            catch (InterruptedException interruptedException) {
                }
        }
        if (TienIchGame.cfr_renamed_11((System.currentTimeMillis() - l, 15000L < 0))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    static {
        TienIchGame.cfr_renamed_6();
        cfr_renamed_8 = var_int_arr_if[6];
        coKichHoat = var_int_arr_if[6];
        cfr_renamed_12 = var_int_arr_if[6];
        cfr_renamed_2 = var_int_arr_if[6];
        cfr_renamed_10 = var_int_arr_if[6];
        coTrangThai = var_int_arr_if[6];
        cfr_renamed_18 = var_int_arr_if[6];
        var_boolean_new = var_int_arr_if[6];
        var_boolean_int = var_int_arr_if[6];
        cfr_renamed_15 = var_int_arr_if[6];
        cfr_renamed_11 = var_int_arr_if[6];
        var_java_lang_Object_do = new Object();
        var_java_util_Random_do = new Random();
        var_java_util_Vector_do = null;
        soLuongKhoa = var_int_arr_if[6];
        var_int_int = var_int_arr_if[6];
        soXu = 0L;
        var_long_if = 0L;
        var_long_for = 0L;
        soLuong = var_int_arr_if[6];
        var_int_if = var_int_arr_if[6];
        dangChayAuto = var_int_arr_if[6];
        int[] nArray = new int[var_int_arr_if[39]];
        nArray[TienIchGame.var_int_arr_if[6]] = var_int_arr_if[22];
        nArray[TienIchGame.var_int_arr_if[2]] = var_int_arr_if[55];
        nArray[TienIchGame.var_int_arr_if[1]] = var_int_arr_if[56];
        nArray[TienIchGame.var_int_arr_if[19]] = var_int_arr_if[55];
        nArray[TienIchGame.var_int_arr_if[18]] = var_int_arr_if[57];
        nArray[TienIchGame.var_int_arr_if[0]] = var_int_arr_if[58];
        nArray[TienIchGame.var_int_arr_if[25]] = var_int_arr_if[59];
        nArray[TienIchGame.var_int_arr_if[10]] = var_int_arr_if[60];
        nArray[TienIchGame.var_int_arr_if[28]] = var_int_arr_if[57];
        nArray[TienIchGame.var_int_arr_if[20]] = var_int_arr_if[61];
        nArray[TienIchGame.var_int_arr_if[45]] = var_int_arr_if[58];
        nArray[TienIchGame.var_int_arr_if[3]] = var_int_arr_if[59];
        nArray[TienIchGame.var_int_arr_if[4]] = var_int_arr_if[60];
        nArray[TienIchGame.var_int_arr_if[5]] = var_int_arr_if[62];
        nArray[TienIchGame.var_int_arr_if[44]] = var_int_arr_if[63];
        nArray[TienIchGame.var_int_arr_if[15]] = var_int_arr_if[63];
        nArray[TienIchGame.var_int_arr_if[9]] = var_int_arr_if[64];
        nArray[TienIchGame.var_int_arr_if[50]] = var_int_arr_if[59];
        nArray[TienIchGame.var_int_arr_if[32]] = var_int_arr_if[65];
        nArray[TienIchGame.var_int_arr_if[54]] = var_int_arr_if[65];
        nArray[TienIchGame.var_int_arr_if[17]] = var_int_arr_if[10];
        var_java_lang_String_int = (nArray != null);
        int[] nArray2 = new int[var_int_arr_if[0]];
        nArray2[TienIchGame.var_int_arr_if[6]] = var_int_arr_if[66];
        nArray2[TienIchGame.var_int_arr_if[2]] = var_int_arr_if[67];
        nArray2[TienIchGame.var_int_arr_if[1]] = var_int_arr_if[68];
        nArray2[TienIchGame.var_int_arr_if[19]] = var_int_arr_if[69];
        nArray2[TienIchGame.var_int_arr_if[18]] = var_int_arr_if[19];
        var_java_lang_String_new = (nArray2 != null);
    }

    public static int int_do() {
        if (TienIchGame.cfr_renamed_0((Object)mangSoNguyen) && (mangSoNguyen.length > 0)) {
            return mangSoNguyen.length - var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    public static boolean boolean_do(String string) {
        if ((var_java_util_Vector_do == null)) {
            var_java_util_Vector_do = new Vector();
            String[] stringArray = bl_0.java_lang_String_do(bl_0.soLuong + var_int_arr_if[1]);
            if ((stringArray != null) && !(stringArray.equals(""))) {
                stringArray = TienIchGame.java_lang_String_arr_do((String)stringArray, ";");
                int n = var_int_arr_if[6];
                while ((n < stringArray.length)) {
                    var_java_util_Vector_do.addElement(stringArray[n].trim().toLowerCase());
                    ++n;
                    return ((0x77 ^ 0x42) & ~(0x8B ^ 0xBE)) != 0;
                }
            }
        }
        if (!(var_java_util_Vector_do.isEmpty()) && TienIchGame.this(var_java_util_Vector_do.contains(string.toLowerCase()) ? 1 : 0)) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean boolean_do(long l) {
        long l2;
        block7: {
            cfr_renamed_18 = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if ("  ".length() >= "   ".length()) {
                    return ((79 + 51 - 59 + 67 ^ 2 + 11 - -101 + 39) & (126 + 9 - 8 + 18 ^ 58 + 103 - 63 + 32 ^ -" ".length())) != 0;
                }
            }
        }
        if (-" ".length() > 0) {
            return ((0x13 ^ 0x25) & ~(0x56 ^ 0x60)) != 0;
        }
        if (TienIchGame.cfr_renamed_11(TienIchGame.cfr_renamed_18(System.currentTimeMillis() - l2, l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    public static void void_if() {
        tenNhanVat = null;
        ad.var_java_lang_String_arr_do = new String[var_int_arr_if[19]];
        gp_0.var_int_arr_arr_do = new int[var_int_arr_if[18]][];
        AngelChip.var_java_lang_String_arr_arr_arr_if = null;
        AngelChip.var_java_lang_String_arr_arr_arr_do = null;
        AngelChip.var_int_arr_arr_arr_do = null;
        if (!(T.var_java_util_Vector_if.isEmpty())) {
            T.var_java_util_Vector_if.removeAllElements();
        }
        if (!(T.var_java_util_Vector_do.isEmpty())) {
            T.var_java_util_Vector_do.removeAllElements();
        }
        AutoController.tatAuto();
        bl_0.var_java_util_Hashtable_do.clear();
        bl_0.cfr_renamed_0();
        if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat == 0) && (GameCanvas.var_dL_do instanceof w == 0)) {
            TienIchGame.dangXuatTaiKhoan();
        }
        int[] nArray = new int[var_int_arr_if[20]];
        nArray[TienIchGame.var_int_arr_if[6]] = var_int_arr_if[21];
        nArray[TienIchGame.var_int_arr_if[2]] = var_int_arr_if[22];
        nArray[TienIchGame.var_int_arr_if[1]] = var_int_arr_if[21];
        nArray[TienIchGame.var_int_arr_if[19]] = var_int_arr_if[23];
        nArray[TienIchGame.var_int_arr_if[18]] = var_int_arr_if[21];
        nArray[TienIchGame.var_int_arr_if[0]] = var_int_arr_if[24];
        nArray[TienIchGame.var_int_arr_if[25]] = var_int_arr_if[26];
        nArray[TienIchGame.var_int_arr_if[10]] = var_int_arr_if[27];
        nArray[TienIchGame.var_int_arr_if[28]] = var_int_arr_if[6];
        ci_0.void_do((nArray != null));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean boolean_if(long l) {
        long l2;
        block7: {
            coTrangThai = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (" ".length() > "   ".length()) {
                    return ((0xD5 ^ 0x88) & ~(0x21 ^ 0x7C)) != 0;
                }
            }
        }
        if ((0x85 ^ 0x81) < " ".length()) {
            return ((0xA6 ^ 0xC5) & ~(0xF6 ^ 0x95)) != 0;
        }
        if (TienIchGame.cfr_renamed_11((System.currentTimeMillis() - l2 < l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    private static boolean cfr_renamed_8(int n) {
        if ((n >= 0) && !(n > var_int_arr_if[28]) || !(n != var_int_arr_if[45]) || TienIchGame.boolean_do(n, var_int_arr_if[3])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

        private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public static void void_do(String string) {
        AngelChip.duLieuNguoiChoi.var_short_do = (short)null;
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(var_int_arr_if[31], string, var_int_arr_if[2]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_for() {
        if (TienIchGame.this(cfr_renamed_10 ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            cfr_renamed_10 = var_int_arr_if[6];
        }
    }

    public static void void_if(String string) {
        if (TienIchGame.cfr_renamed_0((Object)string) && !(string.equals(""))) {
            p_0.var_p_0_do = null;
            p_0.p_0_do().cfr_renamed_0(new Hashtable(), "Nội dung cập nhật", string, var_int_arr_if[8]);
            GameCanvas.var_dX_do = p_0.p_0_do();
        }
    }

        private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean cfr_renamed_18(int n) {
        if (TienIchGame.boolean_do(n, var_int_arr_if[38])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_int() {
        if (TienIchGame.this(coTrangThai ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            coTrangThai = var_int_arr_if[6];
        }
    }

    public static void (String string == ei ei2) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(ei2);
        GameCanvas.cfr_renamed_1(string, vector);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_3(long l) {
        long l2;
        block7: {
            var_boolean_int = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if ("  ".length() <= 0) {
                    return ((0xB3 ^ 0x9C) & ~(0xBA ^ 0x95)) != 0;
                }
            }
        }
        if (" ".length() <= 0) {
            return ((0x39 ^ 6) & ~(0x97 ^ 0xA8)) != 0;
        }
        if (TienIchGame.cfr_renamed_11((System.currentTimeMillis() - l2, l <= 0))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

        public static boolean boolean_for() {
        if (!(GameCanvas.var_dL_do instanceof fw == 0) || TienIchGame.boolean_do(ef_0.soLuong, var_int_arr_if[8])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_4(long l) {
        var_boolean_new = var_int_arr_if[2];
        long l2 = System.currentTimeMillis();
        Object object = var_java_lang_Object_do;
        synchronized (object) {
            try {
                var_java_lang_Object_do.wait(l);
                }
            catch (InterruptedException interruptedException) {
                }
        }
        if (TienIchGame.cfr_renamed_11(TienIchGame.cfr_renamed_8(System.currentTimeMillis() - l2, l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

        /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_5() {
        TienIchGame.void_for();
        TienIchGame.void_int();
        TienIchGame.cfr_renamed_15();
        TienIchGame.cfr_renamed_11();
        TienIchGame.cfr_renamed_8();
        TienIchGame.cfr_renamed_12();
        TienIchGame.this();
        TienIchGame.cfr_renamed_2();
        TienIchGame.hienThongBao();
        TienIchGame.dangXuatTaiKhoan();
        if (TienIchGame.this(cfr_renamed_11 ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            cfr_renamed_11 = var_int_arr_if[6];
        }
        gf_0.void_do();
        T.void_do();
    }

        public static void void_do(String string, String string2) {
        int n;
        int n2;
        if (TienIchGame.this(string.equals("admin") ? 1 : 0) && (n2 = string2.indexOf("Tài khoản của bạn bị khóa trong ") != var_int_arr_if[8]) && (n = string2.indexOf(" phút") != var_int_arr_if[8])) {
            string = string2.substring(n2 + "Tài khoản của bạn bị khóa trong ".length(), n);
            try {
                gt_0.soXu = (long)(Integer.parseInt(string) + var_int_arr_if[2]) * 60000L;
                return;
            }
            catch (NumberFormatException numberFormatException) {
                gt_0.soXu = 0L;
                return;
            }
        }
        if ((AutoController.nhiemVuHienTai != null) && TienIchGame.this(AutoController.dangChayAuto ? 1 : 0)) {
            AutoController.nhiemVuHienTai.cfr_renamed_0(string, string2);
        }
    }

    private static boolean this(int n) {
        return n != 0;
    }

    private static void cfr_renamed_6() {
        var_int_arr_if = new int[70];
        TienIchGame.var_int_arr_if[0] = 0x57 ^ 0x52;
        TienIchGame.var_int_arr_if[1] = "  ".length();
        TienIchGame.var_int_arr_if[2] = " ".length();
        TienIchGame.var_int_arr_if[3] = 32 + 114 - 50 + 41 ^ 58 + 87 - 29 + 14;
        TienIchGame.var_int_arr_if[4] = 0x2E ^ 0x22;
        TienIchGame.var_int_arr_if[5] = 0x42 ^ 0x47 ^ (0x90 ^ 0x98);
        TienIchGame.var_int_arr_if[6] = (0x2C ^ 0x69) & ~(0xE2 ^ 0xA7);
        TienIchGame.var_int_arr_if[7] = 0 ^ 0x22;
        TienIchGame.var_int_arr_if[8] = -" ".length();
        TienIchGame.var_int_arr_if[9] = 0x22 ^ 0x5C ^ (0xD9 ^ 0xB7);
        TienIchGame.var_int_arr_if[10] = 0xA4 ^ 0xA3;
        TienIchGame.var_int_arr_if[11] = 0x8A ^ 0xA5;
        TienIchGame.var_int_arr_if[12] = 0x8C ^ 0xB6;
        TienIchGame.var_int_arr_if[13] = 0x19 ^ 0x29;
        TienIchGame.var_int_arr_if[14] = 1 ^ 0x38;
        TienIchGame.var_int_arr_if[15] = " ".length() ^ (0x80 ^ 0x8E);
        TienIchGame.var_int_arr_if[16] = 0x9A ^ 0xB9;
        TienIchGame.var_int_arr_if[17] = 0x1A ^ 0xE;
        TienIchGame.var_int_arr_if[18] = 0x98 ^ 0x9C;
        TienIchGame.var_int_arr_if[19] = "   ".length();
        TienIchGame.var_int_arr_if[20] = 0x7A ^ 0x3A ^ (0xEB ^ 0xA2);
        TienIchGame.var_int_arr_if[21] = 178 + 88 - 243 + 220 ^ 149 + 91 - 90 + 4;
        TienIchGame.var_int_arr_if[22] = 0x54 ^ 0x2A;
        TienIchGame.var_int_arr_if[23] = 0xFB ^ 0x87;
        TienIchGame.var_int_arr_if[24] = 0x4B ^ 0x29 ^ (0x7C ^ 0x64);
        TienIchGame.var_int_arr_if[25] = 0x57 ^ 0x51;
        TienIchGame.var_int_arr_if[26] = 0xA ^ 0x33 ^ (0x68 ^ 0xA);
        TienIchGame.var_int_arr_if[27] = 0x23 ^ 0x7D;
        TienIchGame.var_int_arr_if[28] = 0xF8 ^ 0xAF ^ (3 ^ 0x5C);
        TienIchGame.var_int_arr_if[29] = 0xAA ^ 0xA5 ^ (0x97 ^ 0xA3);
        TienIchGame.var_int_arr_if[30] = 0x60 ^ 0x2F ^ (0xDB ^ 0xB8);
        TienIchGame.var_int_arr_if[31] = -(0xFFFFE7BB & 0x7AC7) & (0xFFFFE7EE & 0x7BBF);
        TienIchGame.var_int_arr_if[32] = 120 + 25 - 25 + 22 ^ 91 + 22 - 19 + 62;
        TienIchGame.var_int_arr_if[33] = 5 ^ 0xC ^ (0xC ^ 0x12);
        TienIchGame.var_int_arr_if[34] = 0x9F ^ 0x84;
        TienIchGame.var_int_arr_if[35] = 0x49 ^ 0x7A ^ (0xAA ^ 0x87);
        TienIchGame.var_int_arr_if[36] = 49 + 3 - -52 + 40 ^ 173 + 50 - 183 + 137;
        TienIchGame.var_int_arr_if[37] = 1 ^ 0x71 ^ (0x1C ^ 0x5B);
        TienIchGame.var_int_arr_if[38] = 0xAB ^ 0xB2;
        TienIchGame.var_int_arr_if[39] = 0xB1 ^ 0xA4;
        TienIchGame.var_int_arr_if[40] = 118 + 114 - 180 + 157 ^ 121 + 28 - 136 + 136;
        TienIchGame.var_int_arr_if[41] = 0x44 ^ 1;
        TienIchGame.var_int_arr_if[42] = 0xE4 ^ 0xA2;
        TienIchGame.var_int_arr_if[43] = 82 + 87 - 130 + 136 ^ 64 + 164 - 99 + 64;
        TienIchGame.var_int_arr_if[44] = 0x12 ^ 0xF ^ (0x8E ^ 0x9D);
        TienIchGame.var_int_arr_if[45] = 0xF3 ^ 0xAA ^ (0x7D ^ 0x2E);
        TienIchGame.var_int_arr_if[46] = -(0xFFFFDE9F & 0x2B7D) & (0xFFFFAF9F & 0x5B7E);
        TienIchGame.var_int_arr_if[47] = 150 + 81 - 76 + 1;
        TienIchGame.var_int_arr_if[48] = 0x9E ^ 0xC2 ^ (0x40 ^ 4);
        TienIchGame.var_int_arr_if[49] = 0x42 ^ 0x77;
        TienIchGame.var_int_arr_if[50] = 0xB1 ^ 0xA0;
        TienIchGame.var_int_arr_if[51] = 61 + 35 - -36 + 19 ^ 24 + 10 - -59 + 46;
        TienIchGame.var_int_arr_if[52] = 0x5A ^ 0x62;
        TienIchGame.var_int_arr_if[53] = 0x14 ^ 0x5F ^ (0x4D ^ 0x1B);
        TienIchGame.var_int_arr_if[54] = 20 + 133 - 117 + 102 ^ 58 + 19 - -60 + 16;
        TienIchGame.var_int_arr_if[55] = 163 + 96 - 48 + 34 ^ 15 + 58 - -41 + 14;
        TienIchGame.var_int_arr_if[56] = (0x9C ^ 0xA5) + " ".length() - (0x86 ^ 0x9E) + (0xE7 ^ 0x8F);
        TienIchGame.var_int_arr_if[57] = 0x1D ^ 0x5F;
        TienIchGame.var_int_arr_if[58] = (0x5D ^ 0x40) + (60 + 4 - -40 + 24) - (0x53 ^ 0x67) + (0x71 ^ 0x68);
        TienIchGame.var_int_arr_if[59] = 0x31 ^ 0x53 ^ (0x36 ^ 0x2D);
        TienIchGame.var_int_arr_if[60] = 80 + 87 - 157 + 126;
        TienIchGame.var_int_arr_if[61] = 0x9E ^ 0xC3;
        TienIchGame.var_int_arr_if[62] = 0x85 ^ 0xA6 ^ (0x15 ^ 0x63);
        TienIchGame.var_int_arr_if[63] = 0x3B ^ 0x43;
        TienIchGame.var_int_arr_if[64] = (0x2B ^ 0x4A) + (0x96 ^ 0xA3) - (42 + 60 - 26 + 59) + (0xE4 ^ 0x93);
        TienIchGame.var_int_arr_if[65] = (0x32 ^ 0x74) + (0xAC ^ 0x8A) - (0xE ^ 0x26) + (4 ^ 0x47);
        TienIchGame.var_int_arr_if[66] = 0x73 ^ 0x28 ^ (0x11 ^ 0x22);
        TienIchGame.var_int_arr_if[67] = 0x49 ^ 0x29 ^ (0x1B ^ 9);
        TienIchGame.var_int_arr_if[68] = 109 + 219 - 111 + 16 ^ 44 + 23 - 4 + 95;
        TienIchGame.var_int_arr_if[69] = 0x42 ^ 0x70;
    }

    private static boolean cfr_renamed_16(int n) {
        if (!(n != var_int_arr_if[44]) || !(n != var_int_arr_if[15]) || TienIchGame.boolean_do(n, var_int_arr_if[9])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    public static void (Graphics graphics != null) {
        int n;
        int n2;
        if (TienIchGame.this(GameCanvas.var_dL_do instanceof fk)) {
            n2 = var_int_arr_if[15];
            } else {
            n2 = n = var_int_arr_if[16];
        }
        if ((AutoController.nhiemVuHienTai != null) && TienIchGame.cfr_renamed_10(AutoController.nhiemVuHienTai.toString().length()) && (GameCanvas.var_dL_do instanceof fk == 0)) {
            if ((GameCanvas.var_int_try % var_int_arr_if[17] < var_int_arr_if[15])) {
                GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "( " + AutoController.nhiemVuHienTai.toString() + " )", GameCanvas.var_int_byte / var_int_arr_if[1], var_int_arr_if[15], var_int_arr_if[1]);
                if ((0x2E ^ 0x2A) < 0) {
                    return;
                }
            } else {
                GameCanvas.var_ew_try.cfr_renamed_0(graphics, "( " + AutoController.nhiemVuHienTai.toString() + " )", GameCanvas.var_int_byte / var_int_arr_if[1], var_int_arr_if[15], var_int_arr_if[1]);
            }
        }
        if (!(dangChayAuto)) {
            String string;
            String string2;
            String string3;
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "ID: " + (String)AngelChip.duLieuNguoiChoi.var_short_do + " - LV: " + AutoController.controllerInstance.chuoiGiaTri, var_int_arr_if[18], n, var_int_arr_if[6]);
            n += 14;
            StringBuffer stringBuffer = new StringBuffer().append("TK: ").append(GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[6]])).append("xu");
            if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[1]] > 0)) {
                string3 = " - " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[1]]) + "L";
                if (" ".length() == 0) {
                    return;
                }
            } else {
                string3 = "";
            }
            StringBuffer stringBuffer2 = stringBuffer.append(string3);
            if ((AngelChip.duLieuNguoiChoi.soLuong > 0)) {
                string2 = " - " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.soLuong) + "LK";
                } else {
                string2 = "";
            }
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, stringBuffer2.append(string2).toString(), var_int_arr_if[18], n, var_int_arr_if[6]);
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Ngày up: " + TienIchGame.aq_0_do().chuoiPhu, var_int_arr_if[18], n += 14, var_int_arr_if[6]);
            if (((soXu, 0L >= 0) > 0)) {
                GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Ngày hết hạn: " + TienIchGame.aq_0_do().chuoiGiaTri, var_int_arr_if[18], n += 14, var_int_arr_if[6]);
            }
            if ((soLuongKhoa > 0)) {
                GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Xu cần up: " + GameCanvas.java_lang_String_do(soLuongKhoa), var_int_arr_if[18], n += 14, var_int_arr_if[6]);
            }
            n += 14;
            StringBuffer stringBuffer3 = new StringBuffer().append("Xu up được: ");
            if ((soLuong > 0)) {
                string = GameCanvas.java_lang_String_do(soLuong);
                if ((0xD1 ^ 0xA6 ^ (0x2C ^ 0x5F)) <= 0) {
                    return;
                }
            } else if ((soLuong < 0)) {
                string = "-" + GameCanvas.java_lang_String_do(Math.abs(soLuong));
                if (" ".length() == 0) {
                    return;
                }
            } else {
                string = "0";
            }
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, stringBuffer3.append(string).toString(), var_int_arr_if[18], n, var_int_arr_if[6]);
            if ((AngelChip.duLieuNguoiChoi.var_short_byte != var_int_arr_if[8]) && TienIchGame.this(AutoChamEmBe.var_boolean_new ? 1 : 0)) {
                String string4;
                n += 14;
                StringBuffer stringBuffer4 = new StringBuffer().append("Tim thu được: ");
                if ((var_int_if > 0)) {
                    string4 = GameCanvas.java_lang_String_do(var_int_if);
                    if ("  ".length() == 0) {
                        return;
                    }
                } else {
                    string4 = "0";
                }
                GameCanvas.var_ew_byte.cfr_renamed_0(graphics, stringBuffer4.append(string4).toString(), var_int_arr_if[18], n, var_int_arr_if[6]);
            }
            n += 20;
            if ((AutoController.nhiemVuHienTai != null)) {
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof AutoBanDa) && ((AutoBanDa.soXu, 0L >= 0) > 0)) {
                    int n3 = (int)((AutoBanDa.var_long_if - AutoBanDa.soXu) / 1000L);
                    StringBuffer stringBuffer5 = new StringBuffer().append("Thời gian: ");
                    ThongTinNhanVat.cfr_renamed_0();
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, stringBuffer5.append(ThongTinNhanVat.java_lang_String_do(n3)).toString(), var_int_arr_if[18], n, var_int_arr_if[6]);
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Khu hiện tại: " + fe_0.var_byte_for, var_int_arr_if[18], n += 14, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof T)) {
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Trả lời win: " + AutoController.nhiemVuHienTai.int_do(), var_int_arr_if[18], n, var_int_arr_if[6]);
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Khu hiện tại: " + fe_0.var_byte_for, var_int_arr_if[18], n += 14, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof AutoKimCuong) && TienIchGame.this(AutoKimCuong.cfr_renamed_5 ? 1 : 0)) {
                    String string5;
                    int n4 = (int)((AutoKimCuong.X_do().soXu - System.currentTimeMillis()) / 1000L);
                    StringBuffer stringBuffer6 = new StringBuffer().append("Farming: ");
                    if ((n4 > 0)) {
                        ThongTinNhanVat.cfr_renamed_0();
                        string5 = ThongTinNhanVat.java_lang_String_do(n4);
                        } else {
                        string5 = "xin chờ...";
                    }
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, stringBuffer6.append(string5).toString(), var_int_arr_if[18], n, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof fl)) {
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, fl.var_fl_do.java_lang_String_for(), var_int_arr_if[18], n, var_int_arr_if[6]);
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, fl.var_fl_do.java_lang_String_if(), var_int_arr_if[18], n += 14, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof ak)) {
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, ak.var_ak_do.java_lang_String_for(), var_int_arr_if[18], n, var_int_arr_if[6]);
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, ak.var_ak_do.java_lang_String_if(), var_int_arr_if[18], n += 14, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof gt_0) && ((gt_0.soXu, 0L >= 0) > 0)) {
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Ra tù sau: " + gt_0.java_lang_String_if(), var_int_arr_if[18], n, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof dn_0)) {
                    String string6;
                    int n5 = (int)((dn_0.dn_0_do().var_long_if - System.currentTimeMillis()) / 1000L);
                    StringBuffer stringBuffer7 = new StringBuffer().append("Farming: ");
                    if ((n5 > 0)) {
                        ThongTinNhanVat.cfr_renamed_0();
                        string6 = ThongTinNhanVat.java_lang_String_do(n5);
                        if ("   ".length() == (0xC3 ^ 0xC7)) {
                            return;
                        }
                    } else {
                        string6 = "xin chờ...";
                    }
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, stringBuffer7.append(string6).toString(), var_int_arr_if[18], n, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof gb_0)) {
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, gb_0.gb_0_do().java_lang_String_if(), var_int_arr_if[18], n, var_int_arr_if[6]);
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Khu hiện tại: " + fe_0.var_byte_for, var_int_arr_if[18], n += 14, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof av_0)) {
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Đã hôn: " + av_0.soLuong + " lần", var_int_arr_if[18], n, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof F)) {
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Đã đánh: " + F.soLuong + " lần", var_int_arr_if[18], n, var_int_arr_if[6]);
                    return;
                }
                if (TienIchGame.this(AutoController.nhiemVuHienTai instanceof Z)) {
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Biến hình: " + AutoController.nhiemVuHienTai.java_lang_String_do(), var_int_arr_if[18], n, var_int_arr_if[6]);
                    GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Số lần: " + AutoController.nhiemVuHienTai.int_do(), var_int_arr_if[18], n += 14, var_int_arr_if[6]);
                }
            }
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void (int n == String string) {
        AngelChip.duLieuNguoiChoi.var_short_do = (short)null;
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(n, string, var_int_arr_if[2]);
    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static boolean (int n == null) {
        long l = System.currentTimeMillis();
        while (TienIchGame.cfr_renamed_11((System.currentTimeMillis() - l != 45000L))) {
            if (TienIchGame.boolean_do(ef_0.soLuong, n)) {
                return var_int_arr_if[2];
            }
            TienIchGame.hienThongBao(100L);
            if (((0x9C ^ 0xB3) & ~(0x9D ^ 0xB2)) < (0x76 ^ 0x72)) continue;
            return ((0x96 ^ 0x98) & ~(0x46 ^ 0x48)) != 0;
        }
        return var_int_arr_if[6];
    }

    public static int int_do(int n, int n2) {
        if ((n < n2)) {
            return n + var_java_util_Random_do.nextInt(n2 - n + var_int_arr_if[2]);
        }
        if ((n > n2)) {
            return n2 + var_java_util_Random_do.nextInt(n - n2 + var_int_arr_if[2]);
        }
        return n;
    }

    private static String cfr_renamed_5(String string) {
        if ((string.indexOf(var_int_arr_if[12]) != var_int_arr_if[8])) {
            StringBuffer stringBuffer = new StringBuffer();
            int n = var_int_arr_if[6];
            while ((n < string.length())) {
                char c2 = string.charAt(n);
                if ((c2 != var_int_arr_if[12])) {
                    stringBuffer.append(c2);
                    }
                ++n;
                if ("  ".length() >= -" ".length()) continue;
                return null;
            }
            return stringBuffer.toString();
        }
        return string;
    }

    private static int cfr_renamed_15(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void void_if(long l) {
        if (TienIchGame.this(gW.cfr_renamed_1 ? 1 : 0)) {
            gW.cfr_renamed_1 = var_int_arr_if[6];
            return;
        }
        new gW(l).cfr_renamed_0();
    }

                    public static boolean cfr_renamed_3(int n) {
        if (TienIchGame.this(GameCanvas.var_dL_do instanceof dN)) {
            dN.cfr_renamed_0().cfr_renamed_1();
        }
        if (TienIchGame.this(GameCanvas.var_dL_do instanceof em_0)) {
            em_0.em_0_do().cfr_renamed_2();
        }
        if (TienIchGame.this(GameCanvas.var_dL_do instanceof es)) {
            es.cfr_renamed_0().var_dL_do.cfr_renamed_8();
        }
        if (TienIchGame.this(GameCanvas.var_dL_do instanceof bW)) {
            bW.cfr_renamed_0().void_do(var_int_arr_if[1], var_int_arr_if[6]);
            TienIchGame.hienThongBao(1000L);
        }
        if (!(GameCanvas.var_dL_do instanceof fk == 0) || TienIchGame.this(GameCanvas.var_dL_do instanceof a_0)) {
            a_0.var_a_0_do.void_if(var_int_arr_if[6]);
            if (TienIchGame.this(TienIchGame.cfr_renamed_2(30000L) ? 1 : 0)) {
                TienIchGame.hienThongBao(2000L);
            }
        }
        if (TienIchGame.this(GameCanvas.var_dL_do instanceof e)) {
            GameCanvas.var_ex_do.coTrangThai = var_int_arr_if[6];
            cd_0.cd_0_do().cfr_renamed_3();
            if (TienIchGame.this(TienIchGame.cfr_renamed_2(30000L) ? 1 : 0)) {
                TienIchGame.hienThongBao(2000L);
            }
        }
        if (TienIchGame.this(GameCanvas.var_dL_do instanceof gp_0)) {
            eq.eq_do().cfr_renamed_17(var_int_arr_if[20]);
            if (TienIchGame.this(TienIchGame.cfr_renamed_2(30000L) ? 1 : 0)) {
                TienIchGame.hienThongBao(2000L);
            }
        }
        if (TienIchGame.this(GameCanvas.var_dL_do instanceof t_0)) {
            ef_0.var_int_char = var_int_arr_if[46];
            ef_0.var_int_new = var_int_arr_if[47];
            t_0.cfr_renamed_0().void_do(var_int_arr_if[2], var_int_arr_if[8]);
            if (TienIchGame.this(TienIchGame.cfr_renamed_2(30000L) ? 1 : 0)) {
                TienIchGame.hienThongBao(3500L);
            }
        }
        return TienIchGame.cfr_renamed_4(n);
    }

    public static String (int[] nArray != null) {
        int n = nArray.length - var_int_arr_if[2];
        int n2 = var_int_arr_if[6];
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = var_int_arr_if[6];
        while ((n3 < n)) {
            n2 += nArray[n3];
            stringBuffer.append((char)(nArray[n3] - n));
            ++n3;
            if ((0x4E ^ 0x65 ^ (0x57 ^ 0x78)) != 0) continue;
            return null;
        }
        if (TienIchGame.cfr_renamed_17((n2 - nArray[n]) % n)) {
            return stringBuffer.toString();
        }
        return null;
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String java_lang_String_do() {
        StringBuffer stringBuffer;
        block26: {
            InputStreamReader inputStreamReader;
            block28: {
                if (!TienIchGame.this(TienIchGame.boolean_int() ? 1 : 0)) {
                    return null;
                }
                InputStream inputStream = null;
                inputStreamReader = null;
                stringBuffer = new StringBuffer();
                try {
                    int n;
                    inputStream = this.getClass().getResourceAsStream("/version.txt");
                    inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                    while ((n = inputStreamReader.read() != var_int_arr_if[8])) {
                        stringBuffer.append((char)n);
                        }
                }
                catch (Exception exception) {
                    if ((inputStream != null)) {
                        try {
                            inputStream.close();
                            }
                        catch (IOException iOException) {
                            }
                    }
                    if (!(inputStreamReader != null)) break block26;
                    try {
                        inputStreamReader.close();
                        break block26;
                    }
                    catch (IOException iOException) {
                        if (-" ".length() > 0) {
                            return null;
                        }
                        break block26;
                    }
                }
                catch (Throwable throwable) {
                    block27: {
                        if ((inputStream != null)) {
                            try {
                                inputStream.close();
                                }
                            catch (IOException iOException) {
                                break block27;
                            }
                            if (-" ".length() >= "   ".length()) {
                                return null;
                            }
                        }
                    }
                    if (!(inputStreamReader != null)) throw throwable;
                    try {
                        inputStreamReader.close();
                        }
                    catch (IOException iOException) {
                        throw throwable;
                    }
                    if ("  ".length() <= "   ".length()) throw throwable;
                    return null;
                }
                if ((inputStream != null)) {
                    try {
                        inputStream.close();
                        }
                    catch (IOException iOException) {
                        break block28;
                    }
                    if (-" ".length() > (1 ^ 5)) {
                        return null;
                    }
                }
            }
            try {
                inputStreamReader.close();
                }
            catch (IOException iOException) {
                if (((0x7F ^ 0x2E ^ (0xFD ^ 0x93)) & (105 + 0 - -38 + 12 ^ 115 + 131 - 108 + 26 ^ -" ".length())) != 0) {
                    return null;
                }
                break block26;
            }
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        QuanLyRMS.luuDuLieu("BuildVersion", var_int_arr_if[7]);
        return stringBuffer.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2() {
        if (TienIchGame.this(cfr_renamed_2 ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            cfr_renamed_2 = var_int_arr_if[6];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_5(long l) {
        long l2;
        block7: {
            cfr_renamed_2 = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (-" ".length() > " ".length()) {
                    return ((0xDA ^ 0x90 ^ (0xC8 ^ 0xAF)) & (0xF6 ^ 0xAD ^ (0xB4 ^ 0xC2) ^ -" ".length())) != 0;
                }
            }
        }
        if ((0xC5 ^ 0xC1) < "  ".length()) {
            return ((0x73 ^ 0x7C) & ~(0xCE ^ 0xC1)) != 0;
        }
        if (TienIchGame.cfr_renamed_11(TienIchGame.cfr_renamed_16(System.currentTimeMillis() - l2, l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    private static int cfr_renamed_8(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l, long l2 <= 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l, long l2 < 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_2(long l) {
        cfr_renamed_8 = var_int_arr_if[2];
        long l2 = System.currentTimeMillis();
        Object object = var_java_lang_Object_do;
        synchronized (object) {
            try {
                var_java_lang_Object_do.wait(l);
                }
            catch (InterruptedException interruptedException) {
                }
        }
        if (TienIchGame.cfr_renamed_11(TienIchGame.cfr_renamed_15(System.currentTimeMillis() - l2, l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_15() {
        if (TienIchGame.this(cfr_renamed_18 ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            cfr_renamed_18 = var_int_arr_if[6];
        }
    }

    public static boolean (dL dL2 != null) {
        long l = System.currentTimeMillis();
        while (TienIchGame.cfr_renamed_11((System.currentTimeMillis() - l <= 30000L))) {
            if ((GameCanvas.var_dL_do == dL2)) {
                return var_int_arr_if[2];
            }
            TienIchGame.hienThongBao(100L);
            return ((0xA0 ^ 0x9B) & ~(0x3D ^ 6)) != 0;
        }
        return var_int_arr_if[6];
    }

    private static boolean cfr_renamed_13(int n) {
        if ((n >= var_int_arr_if[37]) && (n <= var_int_arr_if[12])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    public static boolean cfr_renamed_4(int n) {
        if (TienIchGame.boolean_do(ef_0.soLuong, n)) {
            return var_int_arr_if[2];
        }
        if (TienIchGame.boolean_do(n, var_int_arr_if[43])) {
            if (!(TienIchGame.cfr_renamed_30(ef_0.soLuong))) {
                if (!(TienIchGame.cfr_renamed_4(var_int_arr_if[39]))) {
                    return var_int_arr_if[6];
                }
                TienIchGame.hienThongBao(3500L);
            }
            if (TienIchGame.this(TienIchGame.cfr_renamed_30(ef_0.soLuong) ? 1 : 0)) {
                db_0.db_0_do().cfr_renamed_4(AngelChip.duLieuNguoiChoi.var_short_char);
                TienIchGame.cfr_renamed_2(30000L);
                }
            if (TienIchGame.boolean_do(ef_0.soLuong, var_int_arr_if[43])) {
                return var_int_arr_if[2];
            }
            return var_int_arr_if[6];
        }
        if (!(n >= 0) || !(n <= var_int_arr_if[12]) || !(y.var_int_arr_arr_do != null) || (y.var_int_arr_arr_do[n][var_int_arr_if[6]] == 0) && (y.var_int_arr_arr_do[n][var_int_arr_if[2]] == 0)) {
            return var_int_arr_if[6];
        }
        if (TienIchGame.this(TienIchGame.cfr_renamed_16(ef_0.soLuong) ? 1 : 0) && (!(AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0 != var_int_arr_if[1]) || TienIchGame.boolean_do(AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, var_int_arr_if[5]))) {
            bW.cfr_renamed_0().void_do(var_int_arr_if[1], var_int_arr_if[6]);
            TienIchGame.hienThongBao(1000L);
        }
        if (TienIchGame.this(TienIchGame.cfr_renamed_15(n) ? 1 : 0)) {
            if (!(!!(TienIchGame.boolean_for()) || !(TienIchGame.cfr_renamed_18(ef_0.soLuong)) && !(TienIchGame.cfr_renamed_30(ef_0.soLuong)) && !(TienIchGame.cfr_renamed_13(ef_0.soLuong)) && !(TienIchGame.cfr_renamed_19(ef_0.soLuong)) && !(TienIchGame.cfr_renamed_22(ef_0.soLuong)) && !!(TienIchGame.cfr_renamed_15(ef_0.soLuong)))) {
                fe_0.fe_0_do().cfr_renamed_21();
                if (!(TienIchGame.boolean_for())) {
                    return var_int_arr_if[6];
                }
                TienIchGame.hienThongBao(1000L);
            }
            if (TienIchGame.this(TienIchGame.boolean_for() ? 1 : 0)) {
                if (TienIchGame.boolean_do(n, var_int_arr_if[5])) {
                    fw.cfr_renamed_0().soLuongKhoa = var_int_arr_if[2];
                    if (-" ".length() > 0) {
                        return ((0xE9 ^ 0x93 ^ (0xA ^ 0x5E)) & (0x94 ^ 0x81 ^ (0xAA ^ 0x91) ^ -" ".length())) != 0;
                    }
                } else if (TienIchGame.boolean_do(n, var_int_arr_if[20])) {
                    fw.cfr_renamed_0().soLuongKhoa = var_int_arr_if[19];
                    if (-(0xD3 ^ 0x96 ^ (0xDD ^ 0x9C)) >= 0) {
                        return ((0xD4 ^ 0xB4 ^ (0x62 ^ 0xE)) & (32 + 18 - -102 + 29 ^ 184 + 148 - 195 + 48 ^ -" ".length())) != 0;
                    }
                } else if (TienIchGame.boolean_do(n, var_int_arr_if[33])) {
                    fw.cfr_renamed_0().soLuongKhoa = var_int_arr_if[18];
                    if ((0x1C ^ 0x19) <= 0) {
                        return ((0x8D ^ 0xB7) & ~(0x78 ^ 0x42)) != 0;
                    }
                } else if (TienIchGame.this(TienIchGame.cfr_renamed_8(n) ? 1 : 0)) {
                    fw.cfr_renamed_0().soLuongKhoa = var_int_arr_if[0];
                    } else {
                    fw.cfr_renamed_0().soLuongKhoa = var_int_arr_if[25];
                }
                eq.eq_do().cfr_renamed_17(var_int_arr_if[20]);
                if (!(TienIchGame.cfr_renamed_2(30000L))) {
                    return var_int_arr_if[6];
                }
                if (TienIchGame.boolean_do(n, ef_0.soLuong)) {
                    return var_int_arr_if[2];
                }
                TienIchGame.hienThongBao(3500L);
            }
            if ((n != ef_0.soLuong)) {
                ef_0.var_int_char = y.var_int_arr_arr_do[n][var_int_arr_if[6]];
                ef_0.var_int_new = y.var_int_arr_arr_do[n][var_int_arr_if[2]];
                el_0.el_0_do().cfr_renamed_4(n, var_int_arr_if[8]);
                if (!(TienIchGame.cfr_renamed_2(30000L))) {
                    return var_int_arr_if[6];
                }
            }
            return var_int_arr_if[2];
        }
        if (TienIchGame.this(TienIchGame.cfr_renamed_18(n) ? 1 : 0)) {
            if (!(ef_0.soLuong != var_int_arr_if[48]) || TienIchGame.boolean_do(ef_0.soLuong, var_int_arr_if[49])) {
                bF.bF_do().cfr_renamed_18();
                if (!(TienIchGame.cfr_renamed_2(30000L))) {
                    return var_int_arr_if[6];
                }
                if (TienIchGame.boolean_do(ef_0.soLuong, var_int_arr_if[38])) {
                    return var_int_arr_if[2];
                }
            }
            if (!(TienIchGame.boolean_for())) {
                fe_0.fe_0_do().cfr_renamed_21();
                if (!(TienIchGame.boolean_for())) {
                    return var_int_arr_if[6];
                }
                TienIchGame.hienThongBao(1000L);
            }
            if (TienIchGame.this(TienIchGame.boolean_for() ? 1 : 0)) {
                GameCanvas.cfr_renamed_4(MenuChinhAvatar.n);
                fw.cfr_renamed_0().soLuongKhoa = var_int_arr_if[10];
                eq.eq_do().cfr_renamed_17(var_int_arr_if[45]);
                if (!(TienIchGame.cfr_renamed_2(65000L))) {
                    GameCanvas.cfr_renamed_8();
                    return var_int_arr_if[6];
                }
            }
            GameCanvas.cfr_renamed_8();
            return var_int_arr_if[2];
        }
        if (TienIchGame.this(TienIchGame.cfr_renamed_30(n) ? 1 : 0)) {
            if (!(TienIchGame.boolean_for())) {
                fe_0.fe_0_do().cfr_renamed_21();
                if (!(TienIchGame.boolean_for())) {
                    return var_int_arr_if[6];
                }
                TienIchGame.hienThongBao(1000L);
            }
            if (TienIchGame.this(TienIchGame.boolean_for() ? 1 : 0)) {
                fw.cfr_renamed_0().soLuongKhoa = var_int_arr_if[6];
                eq.eq_do().cfr_renamed_17(var_int_arr_if[3]);
                if (!(TienIchGame.cfr_renamed_2(30000L))) {
                    return var_int_arr_if[6];
                }
            }
            return var_int_arr_if[2];
        }
        if (!!(TienIchGame.cfr_renamed_19(n)) || !!(TienIchGame.cfr_renamed_22(n)) || TienIchGame.this(TienIchGame.cfr_renamed_13(n) ? 1 : 0)) {
            if (TienIchGame.this(TienIchGame.cfr_renamed_19(n) ? 1 : 0) && !!(TienIchGame.cfr_renamed_19(ef_0.soLuong)) || TienIchGame.this(TienIchGame.cfr_renamed_22(n) ? 1 : 0) && !!(TienIchGame.cfr_renamed_22(ef_0.soLuong)) || TienIchGame.this(TienIchGame.cfr_renamed_13(n) ? 1 : 0) && TienIchGame.this(TienIchGame.cfr_renamed_13(ef_0.soLuong) ? 1 : 0)) {
                ef_0.var_int_char = y.var_int_arr_arr_do[n][var_int_arr_if[6]];
                ef_0.var_int_new = y.var_int_arr_arr_do[n][var_int_arr_if[2]];
                if (!(n != var_int_arr_if[34]) || !(n != var_int_arr_if[36]) || TienIchGame.boolean_do(n, var_int_arr_if[37])) {
                    eq.eq_do().cfr_renamed_1(var_int_arr_if[50]);
                    if ("  ".length() < ((220 + 53 - 181 + 131 ^ 187 + 65 - 83 + 25) & (0x21 ^ 0x4D ^ (0x45 ^ 0x34) ^ -" ".length()))) {
                        return ((0x27 ^ 0x4E ^ (0xC6 ^ 0x8A)) & (0x7F ^ 8 ^ (0xEC ^ 0xBE) ^ -" ".length())) != 0;
                    }
                } else if (!(n != var_int_arr_if[51]) || !(n != var_int_arr_if[7]) || TienIchGame.boolean_do(n, var_int_arr_if[52])) {
                    eq.eq_do().cfr_renamed_1(var_int_arr_if[32]);
                    if (-" ".length() > ((0x82 ^ 0xB9) & ~(0x3F ^ 4))) {
                        return ((0xAE ^ 0x90) & ~(0x7E ^ 0x40)) != 0;
                    }
                } else if (!(n != var_int_arr_if[53]) || TienIchGame.boolean_do(n, var_int_arr_if[14])) {
                    eq.eq_do().cfr_renamed_1(var_int_arr_if[54]);
                    } else if (!(n != var_int_arr_if[35]) || TienIchGame.boolean_do(n, var_int_arr_if[12])) {
                    eq.eq_do().cfr_renamed_1(var_int_arr_if[17]);
                }
                if (!(TienIchGame.cfr_renamed_2(30000L))) {
                    return var_int_arr_if[6];
                }
                return var_int_arr_if[2];
            }
            if (!(TienIchGame.boolean_for())) {
                fe_0.fe_0_do().cfr_renamed_21();
                if (!(TienIchGame.boolean_for())) {
                    return var_int_arr_if[6];
                }
                TienIchGame.hienThongBao(1000L);
            }
            if (TienIchGame.this(TienIchGame.boolean_for() ? 1 : 0)) {
                fw.cfr_renamed_0().soLuongKhoa = var_int_arr_if[1];
                eq.eq_do().cfr_renamed_17(var_int_arr_if[20]);
                if (!(TienIchGame.cfr_renamed_2(30000L))) {
                    return var_int_arr_if[6];
                }
                TienIchGame.hienThongBao(500L);
                if (TienIchGame.this(TienIchGame.cfr_renamed_19(n) ? 1 : 0)) {
                    eq.eq_do().cfr_renamed_0(var_int_arr_if[0], var_int_arr_if[6], var_int_arr_if[6]);
                    } else if (TienIchGame.this(TienIchGame.cfr_renamed_22(n) ? 1 : 0)) {
                    eq.eq_do().cfr_renamed_0(var_int_arr_if[0], var_int_arr_if[6], var_int_arr_if[2]);
                    if (-" ".length() > "  ".length()) {
                        return ((26 + 100 - 78 + 104 ^ 97 + 18 - 51 + 125) & (0x57 ^ 0x64 ^ (0x19 ^ 0xF) ^ -" ".length())) != 0;
                    }
                } else if (TienIchGame.this(TienIchGame.cfr_renamed_13(n) ? 1 : 0)) {
                    eq.eq_do().cfr_renamed_0(var_int_arr_if[0], var_int_arr_if[6], var_int_arr_if[1]);
                }
                if (!(TienIchGame.cfr_renamed_2(30000L))) {
                    return var_int_arr_if[6];
                }
                if (TienIchGame.boolean_do(n, ef_0.soLuong)) {
                    return var_int_arr_if[2];
                }
                TienIchGame.hienThongBao(4000L);
            }
            if ((n != ef_0.soLuong)) {
                ef_0.var_int_char = y.var_int_arr_arr_do[n][var_int_arr_if[6]];
                ef_0.var_int_new = y.var_int_arr_arr_do[n][var_int_arr_if[2]];
                if (!(n != var_int_arr_if[34]) || !(n != var_int_arr_if[36]) || TienIchGame.boolean_do(n, var_int_arr_if[37])) {
                    eq.eq_do().cfr_renamed_1(var_int_arr_if[50]);
                    if ((0x9B ^ 0x9F) < 0) {
                        return ((0x4C ^ 0x2F) & ~(0x23 ^ 0x40)) != 0;
                    }
                } else if (!(n != var_int_arr_if[51]) || !(n != var_int_arr_if[7]) || TienIchGame.boolean_do(n, var_int_arr_if[52])) {
                    eq.eq_do().cfr_renamed_1(var_int_arr_if[32]);
                    if (-" ".length() >= "   ".length()) {
                        return ((0xBB ^ 0x81 ^ (0 ^ 0x76)) & (0xB1 ^ 0xA3 ^ (0x33 ^ 0x6D) ^ -" ".length())) != 0;
                    }
                } else if (!(n != var_int_arr_if[53]) || TienIchGame.boolean_do(n, var_int_arr_if[14])) {
                    eq.eq_do().cfr_renamed_1(var_int_arr_if[54]);
                    if (" ".length() <= 0) {
                        return ((0x69 ^ 0x2E) & ~(0xD4 ^ 0x93)) != 0;
                    }
                } else if (!(n != var_int_arr_if[35]) || TienIchGame.boolean_do(n, var_int_arr_if[12])) {
                    eq.eq_do().cfr_renamed_1(var_int_arr_if[17]);
                }
                if (!(TienIchGame.cfr_renamed_2(30000L))) {
                    return var_int_arr_if[6];
                }
            }
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    private static int cfr_renamed_18(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static String java_lang_String_do(String string) {
        try {
            Class.forName(var_java_lang_String_int);
            }
        catch (ClassNotFoundException classNotFoundException) {
            return string;
        }
        try {
            String string2 = string.substring(var_int_arr_if[10]);
            string2 = InetAddress.getByName(var_java_lang_String_new + string2.substring(var_int_arr_if[6], string2.indexOf(var_int_arr_if[11]))).getHostAddress();
            String string3 = bl_0.java_lang_String_do(bl_0.soLuong + var_int_arr_if[0]);
            if (TienIchGame.this(string2.equals(TienIchGame.cfr_renamed_4(string3)) ? 1 : 0)) {
                return string;
            }
            if (TienIchGame.this(TienIchGame.cfr_renamed_5(string2).toUpperCase().endsWith(string3.toUpperCase()) ? 1 : 0)) {
                return string;
            }
            }
        catch (Exception exception) {
            }
        if (-"   ".length() > 0) {
            return null;
        }
        return null;
    }

    public static boolean cfr_renamed_5(int n) {
        if (!TienIchGame.cfr_renamed_17n != null || TienIchGame.boolean_do(n, var_int_arr_if[43])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    public static String java_lang_String_if() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        return "Bây giờ là " + calendar.get(var_int_arr_if[3]) + ":" + calendar.get(var_int_arr_if[4]) + ":" + calendar.get(var_int_arr_if[5]);
    }

    private static boolean cfr_renamed_30(int n) {
        if (TienIchGame.boolean_do(n, var_int_arr_if[39])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_15(long l) {
        coKichHoat = var_int_arr_if[2];
        long l2 = System.currentTimeMillis();
        Object object = var_java_lang_Object_do;
        synchronized (object) {
            try {
                var_java_lang_Object_do.wait(l);
                }
            catch (InterruptedException interruptedException) {
                }
        }
        if (TienIchGame.cfr_renamed_11((System.currentTimeMillis() - l2, l == 0))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_8(long l) {
        long l2;
        block7: {
            cfr_renamed_10 = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (((0x69 ^ 0x4B ^ (0x66 ^ 0x4F)) & (26 + 17 - -111 + 33 ^ 21 + 164 - 49 + 40 ^ -" ".length())) != 0) {
                    return ((174 + 37 - 131 + 123 ^ 17 + 62 - 63 + 136) & (0x2B ^ 6 ^ (0 ^ 0x7E) ^ -" ".length())) != 0;
                }
            }
        }
        if (-"  ".length() > 0) {
            return ((0xD6 ^ 0xB7) & ~(0x67 ^ 6)) != 0;
        }
        if (TienIchGame.cfr_renamed_11((System.currentTimeMillis() - l2 == l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_8() {
        if (TienIchGame.this(cfr_renamed_8 ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if ("  ".length() > "   ".length()) {
                return;
            }
            cfr_renamed_8 = var_int_arr_if[6];
        }
    }

        public static boolean boolean_int() {
        if ((var_int_arr_if[7] != QuanLyRMS.int_do("BuildVersion"))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_12() {
        if (TienIchGame.this(coKichHoat ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            coKichHoat = var_int_arr_if[6];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_11() {
        if (TienIchGame.this(var_boolean_new ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            var_boolean_new = var_int_arr_if[6];
        }
    }

    private static int (long l, long l2 > 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static boolean cfr_renamed_2(int n) {
        if (!(!(TienIchGame.cfr_renamed_15(n)) && !(TienIchGame.cfr_renamed_8(n)) && !(TienIchGame.cfr_renamed_16(n)) && !(TienIchGame.cfr_renamed_19(n)) && !(TienIchGame.cfr_renamed_22(n)) && !(TienIchGame.cfr_renamed_13(n)) && !(TienIchGame.cfr_renamed_18(n)) && !TienIchGame.this(TienIchGame.cfr_renamed_30(n) ? 1 : 0))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    public final void cfr_renamed_18() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(var_long_if));
        this.chuoiPhu = calendar.get(var_int_arr_if[0]) + "/" + (calendar.get(var_int_arr_if[1]) + var_int_arr_if[2]) + "/" + calendar.get(var_int_arr_if[2]);
        if (TienIchGame.cfr_renamed_10((soXu >= 0L))) {
            this.var_long_int = var_long_for + soXu * 86400000L;
            this.var_long_new = var_long_if + soXu * 86400000L;
            calendar.setTime(new Date(this.var_long_new));
            this.chuoiGiaTri = calendar.get(var_int_arr_if[0]) + "/" + (calendar.get(var_int_arr_if[1]) + var_int_arr_if[2]) + "/" + calendar.get(var_int_arr_if[2]);
            return;
        }
        this.var_long_new = 0L;
        this.var_long_int = 0L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_10() {
        if (TienIchGame.this(cfr_renamed_15 ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if (("   ".length() & ("   ".length() ^ -" ".length())) >= "  ".length()) {
                return;
            }
            cfr_renamed_15 = var_int_arr_if[6];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean (long l <= 0) {
        long l2;
        block6: {
            cfr_renamed_12 = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block6;
                }
                if (-"  ".length() >= 0) {
                    return ((0x1A ^ 0x2D) & ~(0x63 ^ 0x54)) != 0;
                }
            }
        }
        if (TienIchGame.cfr_renamed_11((System.currentTimeMillis() - l2 > l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    private static boolean cfr_renamed_22(int n) {
        if (!(n != var_int_arr_if[36]) || TienIchGame.boolean_do(n, var_int_arr_if[7])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    private static int this(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void this() {
        if (TienIchGame.this(cfr_renamed_12 ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            cfr_renamed_12 = var_int_arr_if[6];
        }
    }

        public static String java_lang_String_if(String string) {
        String string2 = "";
        int n = var_int_arr_if[6];
        while ((n < string.length())) {
            char c2 = string.charAt(n);
            if ((c2 >= var_int_arr_if[13]) && (c2 <= var_int_arr_if[14])) {
                string2 = string2 + c2;
            }
            ++n;
            if (((0xAF ^ 0xC6 ^ (0x42 ^ 0x64)) & (0x37 ^ 0x62 ^ (0x69 ^ 0x73) ^ -" ".length())) == 0) continue;
            return null;
        }
        return string2;
    }

    public static boolean boolean_if(String string) {
        if ((AutoController.nhiemVuHienTai != null) && TienIchGame.this(AutoController.dangChayAuto ? 1 : 0)) {
            return AutoController.nhiemVuHienTai.boolean_do(string);
        }
        return var_int_arr_if[6];
    }

    private static int cfr_renamed_16(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l, long l2 >= 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static boolean cfr_renamed_15(int n) {
        if ((n >= 0) && !(n > var_int_arr_if[32]) || TienIchGame.boolean_do(n, var_int_arr_if[33])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    public static void cfr_renamed_16() {
        AutoController.controllerInstance.cfr_renamed_5();
        if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat == 0)) {
            fe_0.cfr_renamed_28();
        }
    }

    public static String cfr_renamed_3(String object) {
        String string;
        block17: {
            string = "";
            if (!(object.length() > 0)) break block17;
            if ((object.indexOf(var_int_arr_if[29]) != var_int_arr_if[8])) {
                object = object.replace(var_int_arr_if[29], var_int_arr_if[30]);
            }
            object = TienIchGame.java_lang_String_arr_do((String)object, ",");
            int[] nArray = new int[((String[])object).length];
            int n = var_int_arr_if[6];
            while (TienIchGame.cfr_renamed_2(n, ((String[])object).length)) {
                try {
                    nArray[n] = Integer.parseInt(object[n].trim());
                }
                catch (NumberFormatException numberFormatException) {
                    nArray[n] = var_int_arr_if[8];
                }
                if ("   ".length() <= 0) {
                    return null;
                }
                ++n;
                if ((0x23 ^ 0x4B ^ (0x57 ^ 0x3B)) >= 0) continue;
                return null;
            }
            n = var_int_arr_if[6];
            while ((n < nArray.length)) {
                if ((n > 0)) {
                    if ((nArray[n] != var_int_arr_if[8])) {
                        int n2 = var_int_arr_if[6];
                        int n3 = var_int_arr_if[6];
                        while ((n3 < n)) {
                            if ((nArray[n3] != var_int_arr_if[8]) && TienIchGame.boolean_do(nArray[n], nArray[n3])) {
                                n2 = var_int_arr_if[2];
                                if ((0x61 ^ 0x64) != 0) break;
                                return null;
                            }
                            ++n3;
                            if ("  ".length() != ((170 + 83 - 97 + 16 ^ 75 + 133 - 187 + 114) & (0x5D ^ 0x79 ^ (0xCE ^ 0xC1) ^ -" ".length()))) continue;
                            return null;
                        }
                        if ((n2 == 0)) {
                            String string2;
                            StringBuffer stringBuffer = new StringBuffer().append(string);
                            if ((string.length() > 0)) {
                                string2 = ",";
                                if (-"  ".length() >= 0) {
                                    return null;
                                }
                            } else {
                                string2 = "";
                            }
                            string = stringBuffer.append(string2).append(nArray[n]).toString();
                        }
                        if (((0xE9 ^ 0xA5) & ~(0x76 ^ 0x3A)) != 0) {
                            return null;
                        }
                    }
                } else if ((nArray[n] != var_int_arr_if[8])) {
                    string = string + nArray[n];
                }
                ++n;
                if ("   ".length() >= 0) continue;
                return null;
            }
        }
        return string;
    }

    private static int (long l, long l2 == 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean cfr_renamed_19(int n) {
        if ((n >= var_int_arr_if[34]) && (n <= var_int_arr_if[35])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[6];
    }

    public static void (String string, String string2, cp cp2 != null) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(string, cp2));
        vector.addElement(GameCanvas.var_ei_do);
        GameCanvas.cfr_renamed_1(string2, vector);
    }
}

