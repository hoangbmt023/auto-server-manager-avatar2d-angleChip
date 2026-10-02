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
    private static boolean cfr_renamed_8;
    private static boolean cfr_renamed_13;
    public static int soLuong;
    private static final Object var_java_lang_Object_do;
    private static boolean cfr_renamed_9;
    public long soXu = 0L;
    public static boolean dangChayAuto;
    public static boolean coTrangThai;
    public static boolean coKichHoat;
    public static long var_long_if;
    private static final Random var_java_util_Random_do;
    public static boolean var_boolean_int;
    private static boolean cfr_renamed_14;
    public static int var_int_if;
    public static String chuoiGiaTri;
    public static long var_long_for;
    private static final int[] var_int_arr_if;
    public static boolean var_boolean_new;
    private static Vector var_java_util_Vector_do;
    public static int soLuongKhoa;
    public static long var_long_int;
    private long var_long_new = 0L;
    public static boolean cfr_renamed_5;
    public static byte var_byte_do;
    private static boolean this;
    private static boolean cfr_renamed_12;
    public String tenNhanVat = "";
    public static int var_int_int;
    public static boolean cfr_renamed_6;
    public String chuoiPhu = "";
    private static final String var_java_lang_String_int;
    public static boolean cfr_renamed_7;
    private static final String var_java_lang_String_new;
    private static TienIchGame var_aq_0_do;
    public static int[] mangSoNguyen;

    static {
        TienIchGame.cfr_renamed_18();
        cfr_renamed_6 = var_int_arr_if[3];
        this = var_int_arr_if[3];
        cfr_renamed_13 = var_int_arr_if[3];
        coTrangThai = var_int_arr_if[3];
        cfr_renamed_14 = var_int_arr_if[3];
        cfr_renamed_5 = var_int_arr_if[3];
        cfr_renamed_9 = var_int_arr_if[3];
        var_boolean_new = var_int_arr_if[3];
        cfr_renamed_12 = var_int_arr_if[3];
        var_boolean_int = var_int_arr_if[3];
        coKichHoat = var_int_arr_if[3];
        cfr_renamed_8 = var_int_arr_if[3];
        dangChayAuto = var_int_arr_if[3];
        var_java_lang_Object_do = new Object();
        var_java_util_Random_do = new Random();
        var_java_util_Vector_do = null;
        var_int_int = var_int_arr_if[3];
        soLuong = var_int_arr_if[3];
        var_long_for = 0L;
        var_long_int = 0L;
        var_long_if = 0L;
        var_int_if = var_int_arr_if[3];
        soLuongKhoa = var_int_arr_if[3];
        cfr_renamed_7 = var_int_arr_if[3];
        int[] nArray = new int[var_int_arr_if[40]];
        nArray[TienIchGame.var_int_arr_if[3]] = var_int_arr_if[22];
        nArray[TienIchGame.var_int_arr_if[2]] = var_int_arr_if[56];
        nArray[TienIchGame.var_int_arr_if[1]] = var_int_arr_if[57];
        nArray[TienIchGame.var_int_arr_if[19]] = var_int_arr_if[56];
        nArray[TienIchGame.var_int_arr_if[18]] = var_int_arr_if[58];
        nArray[TienIchGame.var_int_arr_if[0]] = var_int_arr_if[59];
        nArray[TienIchGame.var_int_arr_if[25]] = var_int_arr_if[60];
        nArray[TienIchGame.var_int_arr_if[10]] = var_int_arr_if[61];
        nArray[TienIchGame.var_int_arr_if[28]] = var_int_arr_if[58];
        nArray[TienIchGame.var_int_arr_if[20]] = var_int_arr_if[62];
        nArray[TienIchGame.var_int_arr_if[46]] = var_int_arr_if[59];
        nArray[TienIchGame.var_int_arr_if[4]] = var_int_arr_if[60];
        nArray[TienIchGame.var_int_arr_if[5]] = var_int_arr_if[61];
        nArray[TienIchGame.var_int_arr_if[6]] = var_int_arr_if[63];
        nArray[TienIchGame.var_int_arr_if[45]] = var_int_arr_if[64];
        nArray[TienIchGame.var_int_arr_if[15]] = var_int_arr_if[64];
        nArray[TienIchGame.var_int_arr_if[9]] = var_int_arr_if[65];
        nArray[TienIchGame.var_int_arr_if[51]] = var_int_arr_if[60];
        nArray[TienIchGame.var_int_arr_if[32]] = var_int_arr_if[66];
        nArray[TienIchGame.var_int_arr_if[55]] = var_int_arr_if[66];
        nArray[TienIchGame.var_int_arr_if[17]] = var_int_arr_if[10];
        var_java_lang_String_int = (nArray == null);
        int[] nArray2 = new int[var_int_arr_if[0]];
        nArray2[TienIchGame.var_int_arr_if[3]] = var_int_arr_if[67];
        nArray2[TienIchGame.var_int_arr_if[2]] = var_int_arr_if[68];
        nArray2[TienIchGame.var_int_arr_if[1]] = var_int_arr_if[69];
        nArray2[TienIchGame.var_int_arr_if[19]] = var_int_arr_if[70];
        nArray2[TienIchGame.var_int_arr_if[18]] = var_int_arr_if[19];
        var_java_lang_String_new = (nArray2 == null);
        var_byte_do = (byte)var_int_arr_if[3];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_do() {
        if ((dangChayAuto)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            dangChayAuto = var_int_arr_if[3];
        }
    }

    public static void void_do(String string) {
        if (TienIchGame.cfr_renamed_0((Object)string) && TienIchGame.cfr_renamed_10(string.trim().equals("") ? 1 : 0)) {
            ab_0.var_ab_0_do = null;
            ab_0.cfr_renamed_1().cfr_renamed_1(new Hashtable(), "Nội dung cập nhật", string, var_int_arr_if[8]);
            GameCanvas.var_ez_do = ab_0.cfr_renamed_1();
        }
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_if() {
        if ((cfr_renamed_14)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            cfr_renamed_14 = var_int_arr_if[3];
        }
    }

        public static void void_for() {
        chuoiGiaTri = null;
        AutoCauCa.var_int_arr_arr_arr_arr_do = new int[var_int_arr_if[18]][][][];
        ax.var_java_lang_String_arr_do = new String[var_int_arr_if[19]];
        fm_0.var_int_arr_arr_do = new int[var_int_arr_if[18]][];
        AngelChip.var_java_lang_String_arr_arr_arr_do = null;
        AngelChip.var_java_lang_String_arr_arr_arr_if = null;
        AngelChip.var_int_arr_arr_arr_do = null;
        if (!(af_0.var_java_util_Vector_if.isEmpty())) {
            af_0.var_java_util_Vector_if.removeAllElements();
        }
        if (!(af_0.var_java_util_Vector_do.isEmpty())) {
            af_0.var_java_util_Vector_do.removeAllElements();
        }
        AutoController.tatAuto();
        br_0.var_java_util_Hashtable_do.clear();
        br_0.cfr_renamed_1();
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat == 0) && (GameCanvas.var_en_do instanceof aU == 0)) {
            TienIchGame.dangXuatTaiKhoan();
        }
        int[] nArray = new int[var_int_arr_if[20]];
        nArray[TienIchGame.var_int_arr_if[3]] = var_int_arr_if[21];
        nArray[TienIchGame.var_int_arr_if[2]] = var_int_arr_if[22];
        nArray[TienIchGame.var_int_arr_if[1]] = var_int_arr_if[21];
        nArray[TienIchGame.var_int_arr_if[19]] = var_int_arr_if[23];
        nArray[TienIchGame.var_int_arr_if[18]] = var_int_arr_if[21];
        nArray[TienIchGame.var_int_arr_if[0]] = var_int_arr_if[24];
        nArray[TienIchGame.var_int_arr_if[25]] = var_int_arr_if[26];
        nArray[TienIchGame.var_int_arr_if[10]] = var_int_arr_if[27];
        nArray[TienIchGame.var_int_arr_if[28]] = var_int_arr_if[3];
        aa_0.void_do((nArray == null));
    }

    public static boolean (int n == null) {
        if ((GameCanvas.var_en_do instanceof ep != 0)) {
            ep.cfr_renamed_1().cfr_renamed_3();
        }
        if ((GameCanvas.var_en_do instanceof fo != 0)) {
            fo.fo_do().void_if();
        }
        if ((GameCanvas.var_en_do instanceof fv_0 != 0)) {
            fv_0.cfr_renamed_1().var_en_do.cfr_renamed_4();
        }
        if ((GameCanvas.var_en_do instanceof u_0 != 0)) {
            u_0.cfr_renamed_1().void_do(var_int_arr_if[1], var_int_arr_if[3]);
            TienIchGame.void_if(1000L);
        }
        if (!(GameCanvas.var_en_do instanceof gI == 0) || (GameCanvas.var_en_do instanceof w_0 != 0)) {
            w_0.var_w_0_do.void_for(var_int_arr_if[3]);
            if ((TienIchGame.boolean_do(30000L))) {
                TienIchGame.void_if(2000L);
            }
        }
        if ((GameCanvas.var_en_do instanceof p_0 != 0)) {
            GameCanvas.var_cg_0_do.coTrangThai = var_int_arr_if[3];
            dt_0.dt_0_do().cfr_renamed_5();
            if ((TienIchGame.boolean_do(30000L))) {
                TienIchGame.void_if(2000L);
            }
        }
        if ((GameCanvas.var_en_do instanceof fm_0 != 0)) {
            ft_0.ft_0_do().cfr_renamed_12(var_int_arr_if[20]);
            if ((TienIchGame.boolean_do(30000L))) {
                TienIchGame.void_if(2000L);
            }
        }
        if ((GameCanvas.var_en_do instanceof al_0 != 0)) {
            fh.cfr_renamed_9 = var_int_arr_if[47];
            fh.var_int_try = var_int_arr_if[48];
            al_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[8]);
            if ((TienIchGame.boolean_do(30000L))) {
                TienIchGame.void_if(3500L);
            }
        }
        return TienIchGame.cfr_renamed_5(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_int() {
        if ((var_boolean_int)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            var_boolean_int = var_int_arr_if[3];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_new() {
        if ((coTrangThai)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            coTrangThai = var_int_arr_if[3];
        }
    }

    private static boolean cfr_renamed_7(int n) {
        if ((n >= var_int_arr_if[34]) && (n <= var_int_arr_if[35])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    public final void cfr_renamed_5() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(var_long_int));
        this.chuoiPhu = calendar.get(var_int_arr_if[0]) + "/" + (calendar.get(var_int_arr_if[1]) + var_int_arr_if[2]) + "/" + calendar.get(var_int_arr_if[2]);
        if (TienIchGame.this((var_long_for == 0L))) {
            this.soXu = var_long_if + var_long_for * 86400000L;
            this.var_long_new = var_long_int + var_long_for * 86400000L;
            calendar.setTime(new Date(this.var_long_new));
            this.tenNhanVat = calendar.get(var_int_arr_if[0]) + "/" + (calendar.get(var_int_arr_if[1]) + var_int_arr_if[2]) + "/" + calendar.get(var_int_arr_if[2]);
            return;
        }
        this.var_long_new = 0L;
        this.soXu = 0L;
    }

        private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

        public static void void_do(long l) {
        if ((ga_0.dangChayAuto)) {
            ga_0.dangChayAuto = var_int_arr_if[3];
            return;
        }
        new ga_0(l).cfr_renamed_1();
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
            cfr_renamed_6 = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if ((0x71 ^ 0x25 ^ (0x5D ^ 0xD)) < "   ".length()) {
                    return ((172 + 202 - 182 + 62 ^ 106 + 190 - 105 + 7) & (0xA ^ 0x60 ^ (0xD6 ^ 0x84) ^ -" ".length())) != 0;
                }
            }
        }
        if ("   ".length() != "   ".length()) {
            return ((0x9C ^ 0x99) & ~(0x90 ^ 0x95)) != 0;
        }
        if (TienIchGame.cfr_renamed_8(TienIchGame.cfr_renamed_7(System.currentTimeMillis() - l2, l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    public static void (String string, fl_0 fl_02, fl_0 fl_03 == null) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(fl_02);
        vector.addElement(fl_03);
        GameCanvas.cfr_renamed_1(string, vector);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean boolean_if(long l) {
        cfr_renamed_12 = var_int_arr_if[2];
        long l2 = System.currentTimeMillis();
        Object object = var_java_lang_Object_do;
        synchronized (object) {
            try {
                var_java_lang_Object_do.wait(l);
                }
            catch (InterruptedException interruptedException) {
                }
        }
        if (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l2, l <= 0))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_2(long l) {
        long l2;
        block7: {
            cfr_renamed_5 = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (-" ".length() >= "   ".length()) {
                    return ((0xC6 ^ 0xB2 ^ (0x30 ^ 9)) & (0x48 ^ 0x34 ^ (0x6C ^ 0x5D) ^ -" ".length())) != 0;
                }
            }
        }
        if (-"   ".length() >= 0) {
            return ((0xAB ^ 0xC5 ^ (0x10 ^ 0x64)) & (0x88 ^ 0x86 ^ (0x32 ^ 0x26) ^ -" ".length())) != 0;
        }
        if (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l2, l >= 0))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

        public static boolean (int n != null) {
        if ((n >= 0) && !(n > var_int_arr_if[32]) || (n == var_int_arr_if[33])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
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
            cfr_renamed_9 = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if ("   ".length() <= 0) {
                    return (" ".length() & ~" ".length()) != 0;
                }
            }
        }
        if (-" ".length() > 0) {
            return ((" ".length() ^ (0x44 ^ 0x26)) & (0x7F ^ 0x66 ^ (8 ^ 0x72) ^ -" ".length())) != 0;
        }
        if (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l2, l == 0))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

                /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_6() {
        if ((this)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if ("   ".length() != "   ".length()) {
                return;
            }
            this = var_int_arr_if[3];
        }
    }

    private static boolean cfr_renamed_14(int n) {
        if ((n >= var_int_arr_if[38]) && (n <= var_int_arr_if[12])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7() {
        if ((cfr_renamed_6)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if ("   ".length() != "   ".length()) {
                return;
            }
            cfr_renamed_6 = var_int_arr_if[3];
        }
    }

    private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_8() {
        if ((cfr_renamed_8)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if ("   ".length() == " ".length()) {
                return;
            }
            cfr_renamed_8 = var_int_arr_if[3];
        }
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static String java_lang_String_do(String string) {
        String string2 = "";
        int n = var_int_arr_if[3];
        while ((n < string.length())) {
            char c2 = string.charAt(n);
            if ((c2 >= var_int_arr_if[13]) && (c2 <= var_int_arr_if[14])) {
                string2 = string2 + c2;
            }
            ++n;
            if ((0x5B ^ 9 ^ (0x16 ^ 0x40)) > -" ".length()) continue;
            return null;
        }
        return string2;
    }

    public static int int_do() {
        if ((mangSoNguyen != null) && TienIchGame.this(mangSoNguyen.length)) {
            return mangSoNguyen.length - var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    public static String (int[] nArray == null) {
        int n = nArray.length - var_int_arr_if[2];
        int n2 = var_int_arr_if[3];
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = var_int_arr_if[3];
        while ((n3 < n)) {
            n2 += nArray[n3];
            stringBuffer.append((char)(nArray[n3] - n));
            ++n3;
            if (((0x8D ^ 0xAD) & ~(0x93 ^ 0xB3)) == 0) continue;
            return null;
        }
        if (TienIchGame.cfr_renamed_10((n2 - nArray[n]) % n)) {
            return stringBuffer.toString();
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_4(long l) {
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
                if ("  ".length() == (88 + 28 - 27 + 93 ^ 107 + 154 - 150 + 67)) {
                    return ((63 + 249 - 138 + 79 ^ 150 + 67 - 188 + 130) & (0xF ^ 0xB ^ (0x13 ^ 0x75) ^ -" ".length())) != 0;
                }
            }
        }
        if (" ".length() <= ((0x35 ^ 0x1B) & ~(0x51 ^ 0x7F))) {
            return ((0xBE ^ 0x8C) & ~(0xAB ^ 0x99)) != 0;
        }
        if (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l2 == l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean boolean_do() {
        dangChayAuto = var_int_arr_if[2];
        long l = System.currentTimeMillis();
        Object object = var_java_lang_Object_do;
        synchronized (object) {
            try {
                var_java_lang_Object_do.wait(15000L);
                }
            catch (InterruptedException interruptedException) {
                }
        }
        if (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l, 15000L < 0))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    private static boolean this(int n) {
        return n > 0;
    }

    private static int cfr_renamed_6(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static String[] java_lang_String_arr_do(String objectArray, String string) {
        int n;
        if (!TienIchGame.cfr_renamed_0((Object)string) || (string.equals(""))) {
            String[] stringArray = new String[var_int_arr_if[2]];
            stringArray[TienIchGame.var_int_arr_if[3]] = objectArray;
            return stringArray;
        }
        Vector<String> vector = new Vector<String>();
        if (!(objectArray.endsWith(string))) {
            objectArray = (String)objectArray + string;
        }
        int n2 = var_int_arr_if[3];
        while (TienIchGame.boolean_do(n = objectArray.indexOf(string, n2), var_int_arr_if[8])) {
            vector.addElement(objectArray.substring(n2, n));
            n2 = n + string.length();
            if (((0x73 ^ 0x63 ^ (0x33 ^ 0x69)) & (0x65 ^ 0x69 ^ (0xC8 ^ 0x8E) ^ -" ".length())) < "   ".length()) continue;
            return null;
        }
        objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    public static boolean cfr_renamed_2(int n) {
        if (!(TienIchGame.cfr_renamed_10n != null && !(TienIchGame.cfr_renamed_18(n)) && !(TienIchGame.cfr_renamed_20(n)) && !(TienIchGame.cfr_renamed_7(n)) && !(TienIchGame.cfr_renamed_15(n)) && !(TienIchGame.cfr_renamed_14(n)) && !(TienIchGame.cfr_renamed_12(n)) && !(TienIchGame.cfr_renamed_30(n)))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_13() {
        if ((cfr_renamed_12)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if (" ".length() < -" ".length()) {
                return;
            }
            cfr_renamed_12 = var_int_arr_if[3];
        }
    }

    private static void cfr_renamed_18() {
        var_int_arr_if = new int[71];
        TienIchGame.var_int_arr_if[0] = 84 + 11 - 42 + 138 ^ 27 + 109 - 24 + 74;
        TienIchGame.var_int_arr_if[1] = "  ".length();
        TienIchGame.var_int_arr_if[2] = " ".length();
        TienIchGame.var_int_arr_if[3] = (23 + 105 - 9 + 80 ^ 23 + 110 - 80 + 83) & (0x7F ^ 0x33 ^ "   ".length() ^ -" ".length());
        TienIchGame.var_int_arr_if[4] = 0xBF ^ 0xB4;
        TienIchGame.var_int_arr_if[5] = 45 + 98 - 129 + 176 ^ 4 + 77 - -12 + 85;
        TienIchGame.var_int_arr_if[6] = 0x39 ^ 0x34;
        TienIchGame.var_int_arr_if[7] = 0xB2 ^ 0x89 ^ (0x4D ^ 0x5E);
        TienIchGame.var_int_arr_if[8] = -" ".length();
        TienIchGame.var_int_arr_if[9] = 0xA0 ^ 0xB8 ^ (0x67 ^ 0x6F);
        TienIchGame.var_int_arr_if[10] = 0x38 ^ 0x3F;
        TienIchGame.var_int_arr_if[11] = 0x1B ^ 0x34;
        TienIchGame.var_int_arr_if[12] = 0x52 ^ 0x68;
        TienIchGame.var_int_arr_if[13] = 16 + 5 - -150 + 0 ^ 40 + 39 - -13 + 63;
        TienIchGame.var_int_arr_if[14] = 0x23 ^ 0x1A;
        TienIchGame.var_int_arr_if[15] = 0x15 ^ 0x1A;
        TienIchGame.var_int_arr_if[16] = 5 + 82 - 83 + 128 ^ 121 + 142 - 204 + 108;
        TienIchGame.var_int_arr_if[17] = 0x43 ^ 0x57;
        TienIchGame.var_int_arr_if[18] = 0x3B ^ 0x56 ^ (0x30 ^ 0x59);
        TienIchGame.var_int_arr_if[19] = "   ".length();
        TienIchGame.var_int_arr_if[20] = 0x31 ^ 0x38;
        TienIchGame.var_int_arr_if[21] = 4 ^ 0x6D;
        TienIchGame.var_int_arr_if[22] = 0xCE ^ 0xBB ^ (0xBE ^ 0xB5);
        TienIchGame.var_int_arr_if[23] = 115 + 137 - 244 + 179 ^ 25 + 159 - 47 + 62;
        TienIchGame.var_int_arr_if[24] = 0xC9 ^ 0xB3;
        TienIchGame.var_int_arr_if[25] = 0x6E ^ 0x2E ^ (0x3B ^ 0x7D);
        TienIchGame.var_int_arr_if[26] = 0xBE ^ 0x8B ^ (0xCF ^ 0xA1);
        TienIchGame.var_int_arr_if[27] = 0x1E ^ 0x40;
        TienIchGame.var_int_arr_if[28] = 0x4E ^ 0x46;
        TienIchGame.var_int_arr_if[29] = 0x60 ^ 0x1B ^ (0x2A ^ 0x6A);
        TienIchGame.var_int_arr_if[30] = 0x7C ^ 0x50;
        TienIchGame.var_int_arr_if[31] = 0xFFFF877C & 0x79AF;
        TienIchGame.var_int_arr_if[32] = 56 + 92 - 147 + 141 ^ 104 + 115 - 193 + 130;
        TienIchGame.var_int_arr_if[33] = 0xD0 ^ 0xC7;
        TienIchGame.var_int_arr_if[34] = 0xB6 ^ 0xAD;
        TienIchGame.var_int_arr_if[35] = 0x4D ^ 0x53;
        TienIchGame.var_int_arr_if[36] = 0xB1 ^ 0x90;
        TienIchGame.var_int_arr_if[37] = 146 + 125 - 209 + 101 ^ 50 + 69 - 36 + 46;
        TienIchGame.var_int_arr_if[38] = 4 + 46 - -90 + 31 ^ 112 + 83 - 41 + 2;
        TienIchGame.var_int_arr_if[39] = 0x43 ^ 0x5A;
        TienIchGame.var_int_arr_if[40] = 0x10 ^ 5;
        TienIchGame.var_int_arr_if[41] = 58 + 16 - 51 + 194 ^ 137 + 100 - 123 + 43;
        TienIchGame.var_int_arr_if[42] = 0x7E ^ 0x3B;
        TienIchGame.var_int_arr_if[43] = 0x6A ^ 9 ^ (0x5A ^ 0x7F);
        TienIchGame.var_int_arr_if[44] = 0x2A ^ 0x44;
        TienIchGame.var_int_arr_if[45] = 0x68 ^ 0x66;
        TienIchGame.var_int_arr_if[46] = 18 + 25 - -1 + 91 ^ 46 + 37 - 6 + 64;
        TienIchGame.var_int_arr_if[47] = 0xFFFFC1E3 & 0x3F1E;
        TienIchGame.var_int_arr_if[48] = (3 ^ 0x2B) + (131 + 36 - 144 + 122) - (0xCC ^ 0xB4) + (0xEC ^ 0xB7);
        TienIchGame.var_int_arr_if[49] = 0x5F ^ 5 ^ (0xFC ^ 0xBE);
        TienIchGame.var_int_arr_if[50] = 0xF7 ^ 0xBA ^ (0x25 ^ 0x5D);
        TienIchGame.var_int_arr_if[51] = 8 ^ 0x3F ^ (0xF ^ 0x29);
        TienIchGame.var_int_arr_if[52] = 0xF ^ 0x13;
        TienIchGame.var_int_arr_if[53] = 0x62 ^ 0x34 ^ (0x54 ^ 0x3A);
        TienIchGame.var_int_arr_if[54] = 57 + 27 - 57 + 124 ^ 124 + 24 - 121 + 111;
        TienIchGame.var_int_arr_if[55] = 0x95 ^ 0x86;
        TienIchGame.var_int_arr_if[56] = 164 + 172 - 161 + 24 ^ 146 + 151 - 131 + 12;
        TienIchGame.var_int_arr_if[57] = (0xF4 ^ 0xBA) + (0x74 ^ 9) - (59 + 10 - -22 + 84) + (0x13 ^ 0x7D);
        TienIchGame.var_int_arr_if[58] = 0x60 ^ 0x22;
        TienIchGame.var_int_arr_if[59] = 26 + 77 - 23 + 50;
        TienIchGame.var_int_arr_if[60] = 32 + 132 - 57 + 130 ^ 73 + 137 - 151 + 89;
        TienIchGame.var_int_arr_if[61] = 105 + 28 - 86 + 89;
        TienIchGame.var_int_arr_if[62] = 132 + 188 - 269 + 165 ^ 63 + 75 - 90 + 85;
        TienIchGame.var_int_arr_if[63] = 31 + 43 - 22 + 202 ^ 69 + 115 - 79 + 66;
        TienIchGame.var_int_arr_if[64] = 0x6F ^ 0x17;
        TienIchGame.var_int_arr_if[65] = 101 + 7 - 51 + 77;
        TienIchGame.var_int_arr_if[66] = 29 + 24 - -69 + 13;
        TienIchGame.var_int_arr_if[67] = 192 + 106 - 95 + 3 ^ 149 + 122 - 230 + 125;
        TienIchGame.var_int_arr_if[68] = 0x6A ^ 0x18;
        TienIchGame.var_int_arr_if[69] = 0x55 ^ 0x73 ^ (0x35 ^ 0x64);
        TienIchGame.var_int_arr_if[70] = 0x65 ^ 0 ^ (0x30 ^ 0x67);
    }

        private static boolean cfr_renamed_12(int n) {
        if ((n == var_int_arr_if[39])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    private static int cfr_renamed_7(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean cfr_renamed_15(int n) {
        if (!TienIchGame.boolean_do(n, var_int_arr_if[36]) || (n == var_int_arr_if[37])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
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
    public static boolean boolean_if() {
        long l;
        block7: {
            cfr_renamed_13 = var_int_arr_if[2];
            l = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(5000L);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (" ".length() == 0) {
                    return ((0x57 ^ 0x18 ^ (0x78 ^ 0x23)) & (48 + 97 - 17 + 9 ^ 84 + 97 - 34 + 10 ^ -" ".length())) != 0;
                }
            }
        }
        if (" ".length() == -" ".length()) {
            return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
        }
        if (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l >= 5000L))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    public static void void_if(long l) {
        if ((TienIchGame.cfr_renamed_18(l, 0L) <= 0)) {
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

    public static void (String string, fl_0 fl_02, fl_0 fl_03 != null) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(fl_02);
        vector.addElement(fl_03);
        vector.addElement(GameCanvas.var_fl_0_do);
        GameCanvas.cfr_renamed_1(string, vector);
    }

    private static int (long l, long l2 != 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
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
            this = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (" ".length() == 0) {
                    return ((0x2C ^ 0xC) & ~(0x6D ^ 0x4D)) != 0;
                }
            }
        }
        if (((43 + 17 - 33 + 215 ^ 163 + 39 - 24 + 13) & (163 + 21 - 0 + 66 ^ 101 + 81 - 58 + 59 ^ -" ".length())) < ((0x7C ^ 0x1C ^ (0x79 ^ 0x43)) & (0x5C ^ 0x63 ^ (0x50 ^ 0x35) ^ -" ".length()))) {
            return ((0xAF ^ 0xB8 ^ (0xDE ^ 0xC1)) & (0xC8 ^ 0x90 ^ (1 ^ 0x51) ^ -" ".length())) != 0;
        }
        if (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l2 < l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

        private static int (long l, long l2 >= 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static boolean cfr_renamed_3(int n) {
        cfr_renamed_6 = var_int_arr_if[2];
        long l = System.currentTimeMillis();
        while (TienIchGame.cfr_renamed_8(TienIchGame.cfr_renamed_6(System.currentTimeMillis() - l, 30000L))) {
            if (!(cfr_renamed_6)) {
                return var_int_arr_if[3];
            }
            if ((fh.var_int_char == n)) {
                cfr_renamed_6 = var_int_arr_if[3];
                return var_int_arr_if[2];
            }
            TienIchGame.void_if(100L);
            return (" ".length() & (" ".length() ^ -" ".length())) != 0;
        }
        cfr_renamed_6 = var_int_arr_if[3];
        return var_int_arr_if[3];
    }

    public static boolean cfr_renamed_4(int n) {
        if (!!(TienIchGame.cfr_renamed_6(n)) || (n == var_int_arr_if[44])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    private static int cfr_renamed_14(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void cfr_renamed_9() {
        TienIchGame.this();
        TienIchGame.cfr_renamed_12();
        TienIchGame.cfr_renamed_13();
        TienIchGame.void_int();
        TienIchGame.cfr_renamed_7();
        TienIchGame.cfr_renamed_6();
        TienIchGame.cfr_renamed_14();
        TienIchGame.void_new();
        TienIchGame.void_if();
        TienIchGame.cfr_renamed_15();
        TienIchGame.cfr_renamed_21();
        TienIchGame.cfr_renamed_8();
        TienIchGame.hienThongBao();
        gW.void_do();
        af_0.cfr_renamed_3();
    }

        private static int this(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static String java_lang_String_if(String string) {
        try {
            Class.forName(var_java_lang_String_int);
            }
        catch (ClassNotFoundException classNotFoundException) {
            return string;
        }
        if (((11 + 118 - -5 + 5 ^ 56 + 122 - 117 + 117) & (0xE2 ^ 0xB4 ^ (0xF4 ^ 0x9B) ^ -" ".length())) != ((163 + 15 - 28 + 37 ^ 110 + 9 - 34 + 78) & (11 + 120 - 114 + 129 ^ 84 + 1 - 59 + 112 ^ -" ".length()))) {
            return null;
        }
        try {
            String string2 = string.substring(var_int_arr_if[10]);
            string2 = InetAddress.getByName(var_java_lang_String_new + string2.substring(var_int_arr_if[3], string2.indexOf(var_int_arr_if[11]))).getHostAddress();
            String string3 = br_0.java_lang_String_do(br_0.soLuong + var_int_arr_if[10]);
            if (TienIchGame.cfr_renamed_13(string2.equals(TienIchGame.cfr_renamed_3(string3)) ? 1 : 0)) {
                return string;
            }
            if (TienIchGame.cfr_renamed_13(TienIchGame.cfr_renamed_4(string2).toUpperCase().endsWith(string3.toUpperCase()) ? 1 : 0)) {
                return string;
            }
            }
        catch (Exception exception) {
            }
        if ((0x72 ^ 0x6E ^ (0x14 ^ 0xC)) <= "  ".length()) {
            return null;
        }
        return null;
    }

    public static void void_do(String string, String string2) {
        int n;
        int n2;
        if ((string.equals("admin")) && TienIchGame.boolean_do(n2 = string2.indexOf("Tài khoản của bạn bị khóa trong "), var_int_arr_if[8]) && TienIchGame.boolean_do(n = string2.indexOf(" phút"), var_int_arr_if[8])) {
            string = string2.substring(n2 + "Tài khoản của bạn bị khóa trong ".length(), n);
            try {
                fu_0.soXu = (long)(Integer.parseInt(string) + var_int_arr_if[2]) * 60000L;
                return;
            }
            catch (NumberFormatException numberFormatException) {
                fu_0.soXu = 0L;
                return;
            }
        }
        if ((AutoController.nhiemVuHienTai != null) && (AutoController.dangChayAuto)) {
            AutoController.nhiemVuHienTai.cfr_renamed_1(string, string2);
        }
    }

    private static int cfr_renamed_12(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int cfr_renamed_15(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static boolean boolean_do(String string) {
        if ((AutoController.nhiemVuHienTai != null) && (AutoController.dangChayAuto)) {
            return AutoController.nhiemVuHienTai.boolean_do(string);
        }
        return var_int_arr_if[3];
    }

    public static boolean cfr_renamed_5(int n) {
        if ((fh.var_int_char == n)) {
            return var_int_arr_if[2];
        }
        if ((n == var_int_arr_if[44])) {
            if (!(TienIchGame.cfr_renamed_30(fh.var_int_char))) {
                if (!(TienIchGame.cfr_renamed_5(var_int_arr_if[40]))) {
                    return var_int_arr_if[3];
                }
                TienIchGame.void_if(3500L);
            }
            if ((TienIchGame.cfr_renamed_30(fh.var_int_char))) {
                ep_0.ep_0_do().cfr_renamed_8(AngelChip.duLieuNguoiChoi.var_short_goto);
                TienIchGame.boolean_do(30000L);
                }
            if ((fh.var_int_char == var_int_arr_if[44])) {
                return var_int_arr_if[2];
            }
            return var_int_arr_if[3];
        }
        if (!(n >= 0) || !(n <= var_int_arr_if[12]) || !(ba.var_int_arr_arr_do != null) || (ba.var_int_arr_arr_do[n][var_int_arr_if[3]] == 0) && (ba.var_int_arr_arr_do[n][var_int_arr_if[2]] == 0)) {
            return var_int_arr_if[3];
        }
        if ((TienIchGame.cfr_renamed_20(fh.var_int_char)) && (!TienIchGame.boolean_do((int)AngelChip.duLieuNguoiChoi.var_short_for, var_int_arr_if[1]) || (AngelChip.duLieuNguoiChoi.var_short_for == var_int_arr_if[6]))) {
            u_0.cfr_renamed_1().void_do(var_int_arr_if[1], var_int_arr_if[3]);
            TienIchGame.void_if(1000L);
        }
        if (((n != null))) {
            if (!(!!(TienIchGame.boolean_new()) || !(TienIchGame.cfr_renamed_12(fh.var_int_char)) && !(TienIchGame.cfr_renamed_30(fh.var_int_char)) && !(TienIchGame.cfr_renamed_14(fh.var_int_char)) && !(TienIchGame.cfr_renamed_7(fh.var_int_char)) && !(TienIchGame.cfr_renamed_15(fh.var_int_char)) && !TienIchGame.cfr_renamed_10fh.var_int_char != null)) {
                go_0.go_0_do().cfr_renamed_11();
                if (!(TienIchGame.boolean_new())) {
                    return var_int_arr_if[3];
                }
                TienIchGame.void_if(1000L);
            }
            if ((TienIchGame.boolean_new())) {
                if ((n == var_int_arr_if[6])) {
                    gO.cfr_renamed_1().soLuong = var_int_arr_if[2];
                    if (-((0xDC ^ 0x8B) & ~(0x7A ^ 0x2D) ^ (0x2C ^ 0x28)) >= 0) {
                        return ((117 + 136 - 205 + 193 ^ 139 + 118 - 188 + 78) & (6 + 168 - 109 + 189 ^ 141 + 4 - 58 + 69 ^ -" ".length())) != 0;
                    }
                } else if ((n == var_int_arr_if[20])) {
                    gO.cfr_renamed_1().soLuong = var_int_arr_if[19];
                    if (((0x3C ^ 0x72) & ~(0x44 ^ 0xA)) >= "   ".length()) {
                        return ((0xAE ^ 0xB3) & ~(0x3C ^ 0x21)) != 0;
                    }
                } else if ((n == var_int_arr_if[33])) {
                    gO.cfr_renamed_1().soLuong = var_int_arr_if[18];
                    if (-"   ".length() >= 0) {
                        return ((0xE7 ^ 0xC7) & ~(0x86 ^ 0xA6)) != 0;
                    }
                } else if ((TienIchGame.cfr_renamed_18(n))) {
                    gO.cfr_renamed_1().soLuong = var_int_arr_if[0];
                    if (" ".length() <= 0) {
                        return ((0xF5 ^ 0xA5 ^ (0x69 ^ 0x2E)) & (0x62 ^ 0x13 ^ (0x52 ^ 0x34) ^ -" ".length())) != 0;
                    }
                } else {
                    gO.cfr_renamed_1().soLuong = var_int_arr_if[25];
                }
                ft_0.ft_0_do().cfr_renamed_12(var_int_arr_if[20]);
                if (!(TienIchGame.boolean_do(30000L))) {
                    return var_int_arr_if[3];
                }
                if ((n == fh.var_int_char)) {
                    return var_int_arr_if[2];
                }
                TienIchGame.void_if(3500L);
            }
            if (TienIchGame.boolean_do(n, fh.var_int_char)) {
                fh.cfr_renamed_9 = ba.var_int_arr_arr_do[n][var_int_arr_if[3]];
                fh.var_int_try = ba.var_int_arr_arr_do[n][var_int_arr_if[2]];
                fn.fn_do().cfr_renamed_3(n, var_int_arr_if[8]);
                if (!(TienIchGame.boolean_do(30000L))) {
                    return var_int_arr_if[3];
                }
            }
            return var_int_arr_if[2];
        }
        if ((TienIchGame.cfr_renamed_12(n))) {
            if (!TienIchGame.boolean_do(fh.var_int_char, var_int_arr_if[49]) || (fh.var_int_char == var_int_arr_if[50])) {
                dR.dR_do().cfr_renamed_14();
                if (!(TienIchGame.boolean_do(30000L))) {
                    return var_int_arr_if[3];
                }
                if ((fh.var_int_char == var_int_arr_if[39])) {
                    return var_int_arr_if[2];
                }
            }
            if (!(TienIchGame.boolean_new())) {
                go_0.go_0_do().cfr_renamed_11();
                if (!(TienIchGame.boolean_new())) {
                    return var_int_arr_if[3];
                }
                TienIchGame.void_if(1000L);
            }
            if ((GameCanvas.var_dj_0_do != null)) {
                GameCanvas.cfr_renamed_7();
            }
            if ((TienIchGame.boolean_new())) {
                GameCanvas.cfr_renamed_2(MenuChinhAvatar.bv);
                gO.cfr_renamed_1().soLuong = var_int_arr_if[10];
                ft_0.ft_0_do().cfr_renamed_12(var_int_arr_if[46]);
                if (!(TienIchGame.boolean_do(60000L))) {
                    GameCanvas.cfr_renamed_7();
                    return var_int_arr_if[3];
                }
            }
            GameCanvas.cfr_renamed_7();
            return var_int_arr_if[2];
        }
        if ((TienIchGame.cfr_renamed_30(n))) {
            if (!(TienIchGame.boolean_new())) {
                go_0.go_0_do().cfr_renamed_11();
                if (!(TienIchGame.boolean_new())) {
                    return var_int_arr_if[3];
                }
                TienIchGame.void_if(1000L);
            }
            if ((TienIchGame.boolean_new())) {
                gO.cfr_renamed_1().soLuong = var_int_arr_if[3];
                ft_0.ft_0_do().cfr_renamed_12(var_int_arr_if[4]);
                if (!(TienIchGame.boolean_do(30000L))) {
                    return var_int_arr_if[3];
                }
            }
            return var_int_arr_if[2];
        }
        if (!!(TienIchGame.cfr_renamed_7(n)) || !!(TienIchGame.cfr_renamed_15(n)) || (TienIchGame.cfr_renamed_14(n))) {
            if ((TienIchGame.cfr_renamed_7(n)) && !!(TienIchGame.cfr_renamed_7(fh.var_int_char)) || (TienIchGame.cfr_renamed_15(n)) && !!(TienIchGame.cfr_renamed_15(fh.var_int_char)) || (TienIchGame.cfr_renamed_14(n)) && (TienIchGame.cfr_renamed_14(fh.var_int_char))) {
                fh.cfr_renamed_9 = ba.var_int_arr_arr_do[n][var_int_arr_if[3]];
                fh.var_int_try = ba.var_int_arr_arr_do[n][var_int_arr_if[2]];
                if (!TienIchGame.boolean_do(n, var_int_arr_if[34]) || !TienIchGame.boolean_do(n, var_int_arr_if[36]) || (n == var_int_arr_if[38])) {
                    ft_0.ft_0_do().cfr_renamed_2(var_int_arr_if[51]);
                    if (-"  ".length() >= 0) {
                        return ((0x48 ^ 0x52) & ~(0x2E ^ 0x34)) != 0;
                    }
                } else if (!TienIchGame.boolean_do(n, var_int_arr_if[52]) || !TienIchGame.boolean_do(n, var_int_arr_if[37]) || (n == var_int_arr_if[53])) {
                    ft_0.ft_0_do().cfr_renamed_2(var_int_arr_if[32]);
                    if ((105 + 121 - 91 + 27 ^ 47 + 93 - 104 + 130) < 0) {
                        return ((76 + 77 - 81 + 161 ^ 174 + 121 - 103 + 4) & (0x3F ^ 0x1B ^ (0x53 ^ 0x5A) ^ -" ".length())) != 0;
                    }
                } else if (!TienIchGame.boolean_do(n, var_int_arr_if[54]) || (n == var_int_arr_if[14])) {
                    ft_0.ft_0_do().cfr_renamed_2(var_int_arr_if[55]);
                    if ((0x79 ^ 0x7D) <= " ".length()) {
                        return ((0x6D ^ 0x41) & ~(0x56 ^ 0x7A)) != 0;
                    }
                } else if (!TienIchGame.boolean_do(n, var_int_arr_if[35]) || (n == var_int_arr_if[12])) {
                    ft_0.ft_0_do().cfr_renamed_2(var_int_arr_if[17]);
                }
                if (!(TienIchGame.boolean_do(30000L))) {
                    return var_int_arr_if[3];
                }
                return var_int_arr_if[2];
            }
            if (!(TienIchGame.boolean_new())) {
                go_0.go_0_do().cfr_renamed_11();
                if (!(TienIchGame.boolean_new())) {
                    return var_int_arr_if[3];
                }
                TienIchGame.void_if(1000L);
            }
            if ((TienIchGame.boolean_new())) {
                gO.cfr_renamed_1().soLuong = var_int_arr_if[1];
                ft_0.ft_0_do().cfr_renamed_12(var_int_arr_if[20]);
                if (!(TienIchGame.boolean_do(30000L))) {
                    return var_int_arr_if[3];
                }
                TienIchGame.void_if(500L);
                if ((TienIchGame.cfr_renamed_7(n))) {
                    ft_0.ft_0_do().cfr_renamed_1(var_int_arr_if[0], var_int_arr_if[3], var_int_arr_if[3]);
                    if (" ".length() == 0) {
                        return ((27 + 145 - -61 + 2 ^ 53 + 133 - 117 + 102) & (0x13 ^ 0x47 ^ (0x38 ^ 0x2C) ^ -" ".length())) != 0;
                    }
                } else if ((TienIchGame.cfr_renamed_15(n))) {
                    ft_0.ft_0_do().cfr_renamed_1(var_int_arr_if[0], var_int_arr_if[3], var_int_arr_if[2]);
                    if ("   ".length() == 0) {
                        return ((0x1A ^ 0x5D ^ " ".length()) & (146 + 174 - 153 + 48 ^ 119 + 69 - 75 + 32 ^ -" ".length())) != 0;
                    }
                } else if ((TienIchGame.cfr_renamed_14(n))) {
                    ft_0.ft_0_do().cfr_renamed_1(var_int_arr_if[0], var_int_arr_if[3], var_int_arr_if[1]);
                }
                if (!(TienIchGame.boolean_do(30000L))) {
                    return var_int_arr_if[3];
                }
                if ((n == fh.var_int_char)) {
                    return var_int_arr_if[2];
                }
                TienIchGame.void_if(4000L);
            }
            if (TienIchGame.boolean_do(n, fh.var_int_char)) {
                fh.cfr_renamed_9 = ba.var_int_arr_arr_do[n][var_int_arr_if[3]];
                fh.var_int_try = ba.var_int_arr_arr_do[n][var_int_arr_if[2]];
                if (!TienIchGame.boolean_do(n, var_int_arr_if[34]) || !TienIchGame.boolean_do(n, var_int_arr_if[36]) || (n == var_int_arr_if[38])) {
                    ft_0.ft_0_do().cfr_renamed_2(var_int_arr_if[51]);
                    if (" ".length() != " ".length()) {
                        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                    }
                } else if (!TienIchGame.boolean_do(n, var_int_arr_if[52]) || !TienIchGame.boolean_do(n, var_int_arr_if[37]) || (n == var_int_arr_if[53])) {
                    ft_0.ft_0_do().cfr_renamed_2(var_int_arr_if[32]);
                    if ((0x94 ^ 0x90) == 0) {
                        return ((0xE8 ^ 0x89) & ~(0xC9 ^ 0xA8)) != 0;
                    }
                } else if (!TienIchGame.boolean_do(n, var_int_arr_if[54]) || (n == var_int_arr_if[14])) {
                    ft_0.ft_0_do().cfr_renamed_2(var_int_arr_if[55]);
                    if ((0xB0 ^ 0xB4) < 0) {
                        return ((0x42 ^ 0x45) & ~(0x86 ^ 0x81)) != 0;
                    }
                } else if (!TienIchGame.boolean_do(n, var_int_arr_if[35]) || (n == var_int_arr_if[12])) {
                    ft_0.ft_0_do().cfr_renamed_2(var_int_arr_if[17]);
                }
                if (!(TienIchGame.boolean_do(30000L))) {
                    return var_int_arr_if[3];
                }
            }
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    public static String cfr_renamed_2(String object) {
        String string;
        block17: {
            string = "";
            if (!TienIchGame.this(object.length())) break block17;
            if (TienIchGame.boolean_do(object.indexOf(var_int_arr_if[29]), var_int_arr_if[8])) {
                object = object.replace(var_int_arr_if[29], var_int_arr_if[30]);
            }
            object = TienIchGame.java_lang_String_arr_do((String)object, ",");
            int[] nArray = new int[((String[])object).length];
            int n = var_int_arr_if[3];
            while (TienIchGame.cfr_renamed_5(n, ((String[])object).length)) {
                try {
                    nArray[n] = Integer.parseInt(object[n].trim());
                }
                catch (NumberFormatException numberFormatException) {
                    nArray[n] = var_int_arr_if[8];
                }
                if ("   ".length() != "   ".length()) {
                    return null;
                }
                ++n;
                if (" ".length() < (0x3D ^ 0x39)) continue;
                return null;
            }
            n = var_int_arr_if[3];
            while ((n < nArray.length)) {
                if (TienIchGame.this(n)) {
                    if (TienIchGame.boolean_do(nArray[n], var_int_arr_if[8])) {
                        int n2 = var_int_arr_if[3];
                        int n3 = var_int_arr_if[3];
                        while ((n3 < n)) {
                            if (TienIchGame.boolean_do(nArray[n3], var_int_arr_if[8]) && (nArray[n] == nArray[n3])) {
                                n2 = var_int_arr_if[2];
                                if (" ".length() < (0x26 ^ 0x23 ^ " ".length())) break;
                                return null;
                            }
                            ++n3;
                            if ("   ".length() != 0) continue;
                            return null;
                        }
                        if ((n2 == 0)) {
                            String string2;
                            StringBuffer stringBuffer = new StringBuffer().append(string);
                            if (TienIchGame.this(string.length())) {
                                string2 = ",";
                                if (-"  ".length() > 0) {
                                    return null;
                                }
                            } else {
                                string2 = "";
                            }
                            string = stringBuffer.append(string2).append(nArray[n]).toString();
                        }
                        if ("   ".length() == 0) {
                            return null;
                        }
                    }
                } else if (TienIchGame.boolean_do(nArray[n], var_int_arr_if[8])) {
                    string = string + nArray[n];
                }
                ++n;
                if ((0x2C ^ 0x68 ^ (0xC0 ^ 0x81)) > 0) continue;
                return null;
            }
        }
        return string;
    }

    public static TienIchGame aq_0_do() {
        if ((var_aq_0_do == null)) {
            var_aq_0_do = new TienIchGame();
        }
        return var_aq_0_do;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_14() {
        if ((cfr_renamed_13)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if (-" ".length() >= (0xE ^ 0x69 ^ (7 ^ 0x64))) {
                return;
            }
            cfr_renamed_13 = var_int_arr_if[3];
        }
    }

    public static String java_lang_String_do() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        return "Bây giờ là " + calendar.get(var_int_arr_if[4]) + ":" + calendar.get(var_int_arr_if[5]) + ":" + calendar.get(var_int_arr_if[6]);
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

    public static boolean boolean_if(String string) {
        if ((var_java_util_Vector_do == null)) {
            var_java_util_Vector_do = new Vector();
            String[] stringArray = br_0.java_lang_String_do(br_0.soLuong + var_int_arr_if[1]);
            if ((stringArray != null) && !(stringArray.equals(""))) {
                stringArray = TienIchGame.java_lang_String_arr_do((String)stringArray, ";");
                int n = var_int_arr_if[3];
                while ((n < stringArray.length)) {
                    var_java_util_Vector_do.addElement(stringArray[n].trim().toLowerCase());
                    ++n;
                    if (-" ".length() != (0x6C ^ 0x3B ^ (0x3B ^ 0x68))) continue;
                    return ((0x46 ^ 0x55 ^ (0x76 ^ 0x61)) & (0x9F ^ 0xBE ^ (0x9E ^ 0xBB) ^ -" ".length())) != 0;
                }
            }
        }
        if (!(var_java_util_Vector_do.isEmpty()) && TienIchGame.cfr_renamed_13(var_java_util_Vector_do.contains(string.toLowerCase()) ? 1 : 0)) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    private static String cfr_renamed_3(String string) {
        String string2 = "";
        int n = var_int_arr_if[3];
        while ((n < string.length())) {
            if (TienIchGame.this(n)) {
                string2 = string2 + ".";
            }
            string2 = string2 + Integer.parseInt(string.substring(n, n + var_int_arr_if[1]), var_int_arr_if[9]);
            n += 2;
            if ("  ".length() >= 0) continue;
            return null;
        }
        return string2;
    }

            private static boolean cfr_renamed_18(int n) {
        if ((n >= 0) && !(n > var_int_arr_if[28]) || !TienIchGame.boolean_do(n, var_int_arr_if[46]) || (n == var_int_arr_if[4])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    private static int (long l, long l2 <= 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l, long l2 == 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_6(long l) {
        long l2;
        block7: {
            cfr_renamed_14 = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if ("  ".length() < 0) {
                    return ((0xB2 ^ 0x9F ^ "  ".length()) & (130 + 108 - 121 + 43 ^ 110 + 1 - 89 + 121 ^ -" ".length())) != 0;
                }
            }
        }
        if (" ".length() == "   ".length()) {
            return ((0xB9 ^ 0xAF) & ~(0xBF ^ 0xA9)) != 0;
        }
        if (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l2 <= l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    private static boolean cfr_renamed_30(int n) {
        if ((n == var_int_arr_if[40])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    public static void void_if(String string) {
        AngelChip.duLieuNguoiChoi.soLuong = (int)null;
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(var_int_arr_if[31], string, var_int_arr_if[2]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_7(long l) {
        long l2;
        block6: {
            coKichHoat = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block6;
                }
                if (((129 + 86 - 173 + 146 ^ 132 + 152 - 142 + 17) & (46 + 74 - 79 + 140 ^ 148 + 105 - 165 + 62 ^ -" ".length())) != 0) {
                    return ((0x37 ^ 0x6D ^ (0x4B ^ 4)) & (0x7B ^ 0x12 ^ (0xE9 ^ 0x95) ^ -" ".length())) != 0;
                }
            }
        }
        if (TienIchGame.cfr_renamed_8(TienIchGame.cfr_renamed_15(System.currentTimeMillis() - l2, l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean (long l < 0) {
        long l2;
        block6: {
            var_boolean_int = var_int_arr_if[2];
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block6;
                }
                if ("  ".length() <= 0) {
                    return ((0x1E ^ 0x13 ^ (0x22 ^ 0x6E)) & (0xA ^ 0x55 ^ (0x5E ^ 0x40) ^ -" ".length())) != 0;
                }
            }
        }
        if (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l2 > l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    public static boolean cfr_renamed_6(int n) {
        if (!TienIchGame.boolean_do(n, var_int_arr_if[41]) || !TienIchGame.boolean_do(n, var_int_arr_if[42]) || (n == var_int_arr_if[43])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void this() {
        if ((cfr_renamed_9)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if ("   ".length() < "   ".length()) {
                return;
            }
            cfr_renamed_9 = var_int_arr_if[3];
        }
    }

    public static void (int n == String string) {
        AngelChip.duLieuNguoiChoi.soLuong = (int)null;
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(n, string, var_int_arr_if[2]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_12() {
        if ((var_boolean_new)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            var_boolean_new = var_int_arr_if[3];
        }
    }

    public static boolean (en en2 == null) {
        long l = System.currentTimeMillis();
        while (TienIchGame.cfr_renamed_8((System.currentTimeMillis() - l, 30000L != 0))) {
            if ((GameCanvas.var_en_do == en2)) {
                return var_int_arr_if[2];
            }
            TienIchGame.void_if(100L);
            if ("  ".length() <= "   ".length()) continue;
            return ((45 + 27 - -148 + 20 ^ 181 + 68 - 205 + 148) & (0x2E ^ 0x46 ^ (0x63 ^ 0x3B) ^ -" ".length())) != 0;
        }
        return var_int_arr_if[3];
    }

    public static dd_0 dd_0_do(String string) {
        int n = var_int_arr_if[3];
        while ((n < fh.var_java_util_Vector_case.size())) {
            dd_0 dd_02 = (dd_0)fh.var_java_util_Vector_case.elementAt(n);
            if ((dd_02 != null) && TienIchGame.cfr_renamed_13(dd_02.chuoiGiaTri.toLowerCase().equals(string) ? 1 : 0)) {
                return dd_02;
            }
            ++n;
            if (-" ".length() <= 0) continue;
            return null;
        }
        return null;
    }

    private static boolean cfr_renamed_20(int n) {
        if (!TienIchGame.boolean_do(n, var_int_arr_if[45]) || !TienIchGame.boolean_do(n, var_int_arr_if[15]) || (n == var_int_arr_if[9])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

        public static void (String string == fl_0 fl_02) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(fl_02);
        GameCanvas.cfr_renamed_1(string, vector);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean boolean_for() {
        long l;
        block7: {
            cfr_renamed_8 = var_int_arr_if[2];
            l = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(15000L);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if ("  ".length() < " ".length()) {
                    return ((0x59 ^ 0x77) & ~(0x23 ^ 0xD)) != 0;
                }
            }
        }
        if (((0x14 ^ 0x77) & ~(0xE3 ^ 0x80)) >= "   ".length()) {
            return ("  ".length() & ~"  ".length()) != 0;
        }
        if (TienIchGame.cfr_renamed_8(TienIchGame.this(System.currentTimeMillis() - l, 15000L))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_15() {
        if ((cfr_renamed_5)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            cfr_renamed_5 = var_int_arr_if[3];
        }
    }

    public static void (String string, String string2, de de2 == null) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(string, de2));
        vector.addElement(GameCanvas.var_fl_0_do);
        GameCanvas.cfr_renamed_1(string2, vector);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_21() {
        if ((coKichHoat)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            coKichHoat = var_int_arr_if[3];
        }
    }

    private static int cfr_renamed_18(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void (Graphics graphics == null) {
        int n;
        int n2;
        if ((GameCanvas.var_en_do instanceof gI != 0)) {
            n2 = var_int_arr_if[15];
            if (-"  ".length() > 0) {
                return;
            }
        } else {
            n2 = n = var_int_arr_if[16];
        }
        if ((AutoController.nhiemVuHienTai != null) && TienIchGame.this(AutoController.nhiemVuHienTai.toString().length()) && (GameCanvas.var_en_do instanceof gI == 0)) {
            if ((GameCanvas.var_int_goto % var_int_arr_if[17] < var_int_arr_if[15])) {
                GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "( " + AutoController.nhiemVuHienTai.toString() + " )", GameCanvas.soLuongKhoa / var_int_arr_if[1], var_int_arr_if[15], var_int_arr_if[1]);
                if (-" ".length() != -" ".length()) {
                    return;
                }
            } else {
                GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, "( " + AutoController.nhiemVuHienTai.toString() + " )", GameCanvas.soLuongKhoa / var_int_arr_if[1], var_int_arr_if[15], var_int_arr_if[1]);
            }
        }
        if (!(cfr_renamed_7)) {
            String string;
            String string2;
            String string3;
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "ID: " + (String)AngelChip.duLieuNguoiChoi.soLuong + " - LV: " + AutoController.controllerInstance.chuoiGiaTri, var_int_arr_if[18], n, var_int_arr_if[3]);
            n += 14;
            StringBuffer stringBuffer = new StringBuffer().append("TK: ").append(GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[3]])).append("xu");
            if (TienIchGame.this(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[1]])) {
                string3 = " - " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[1]]) + "L";
                if (((0x1B ^ 0x3A) & ~(3 ^ 0x22)) != 0) {
                    return;
                }
            } else {
                string3 = "";
            }
            StringBuffer stringBuffer2 = stringBuffer.append(string3);
            if (TienIchGame.this(AngelChip.duLieuNguoiChoi.soLuong)) {
                string2 = " - " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.soLuong) + "LK";
                if (-"   ".length() >= 0) {
                    return;
                }
            } else {
                string2 = "";
            }
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, stringBuffer2.append(string2).toString(), var_int_arr_if[18], n, var_int_arr_if[3]);
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Ngày up: " + TienIchGame.aq_0_do().chuoiPhu, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
            if (TienIchGame.this(TienIchGame.cfr_renamed_14(var_long_for, 0L))) {
                GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Ngày hết hạn: " + TienIchGame.aq_0_do().tenNhanVat, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
            }
            if (TienIchGame.this(var_int_int)) {
                GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Xu cần up: " + GameCanvas.java_lang_String_do(var_int_int), var_int_arr_if[18], n += 14, var_int_arr_if[3]);
            }
            n += 14;
            StringBuffer stringBuffer3 = new StringBuffer().append("Xu up được: ");
            if (TienIchGame.this(var_int_if)) {
                string = GameCanvas.java_lang_String_do(var_int_if);
                if ("  ".length() <= 0) {
                    return;
                }
            } else if ((var_int_if < 0)) {
                string = "-" + GameCanvas.java_lang_String_do(Math.abs(var_int_if));
                if (-"  ".length() > 0) {
                    return;
                }
            } else {
                string = "0";
            }
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, stringBuffer3.append(string).toString(), var_int_arr_if[18], n, var_int_arr_if[3]);
            if (TienIchGame.boolean_do((int)AngelChip.duLieuNguoiChoi.cfr_renamed_23, var_int_arr_if[8]) && (bp_0.cfr_renamed_5)) {
                String string4;
                n += 14;
                StringBuffer stringBuffer4 = new StringBuffer().append("Tim thu được: ");
                if (TienIchGame.this(soLuongKhoa)) {
                    string4 = GameCanvas.java_lang_String_do(soLuongKhoa);
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                } else {
                    string4 = "0";
                }
                GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, stringBuffer4.append(string4).toString(), var_int_arr_if[18], n, var_int_arr_if[3]);
            }
            n += 20;
            if ((AutoController.nhiemVuHienTai != null)) {
                if ((AutoController.nhiemVuHienTai instanceof AutoCauCa != 0)) {
                    if ((AutoCauCa.coTrangThai)) {
                        String string5;
                        int n3 = (int)((AutoCauCa.bs_0_do().var_long_if - System.currentTimeMillis()) / 1000L);
                        StringBuffer stringBuffer5 = new StringBuffer().append("Farming: ");
                        if (TienIchGame.this(n3)) {
                            ThongTinNhanVat.cfr_renamed_1();
                            string5 = ThongTinNhanVat.java_lang_String_do(n3);
                            if (" ".length() == 0) {
                                return;
                            }
                        } else {
                            string5 = "xin chờ...";
                        }
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, stringBuffer5.append(string5).toString(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        n += 20;
                    }
                    GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Cá câu được: " + AutoCauCa.cfr_renamed_5, var_int_arr_if[18], n, var_int_arr_if[3]);
                    GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Cá mập: " + AutoCauCa.soLuongKhoa, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                    if ((AutoCauCa.var_boolean_int)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "KCX: +" + AutoCauCa.cfr_renamed_4, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        return;
                    }
                } else if ((AutoController.nhiemVuHienTai instanceof N != 0)) {
                    GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Khu hiện tại: " + go_0.var_byte_do, var_int_arr_if[18], n, var_int_arr_if[3]);
                    if (TienIchGame.boolean_do(N.var_int_int, var_int_arr_if[8]) && TienIchGame.boolean_do(N.var_int_if, var_int_arr_if[8])) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Số lượng: " + N.var_int_int + "/" + N.var_int_if, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        return;
                    }
                } else {
                    if ((AutoController.nhiemVuHienTai instanceof c != 0) && TienIchGame.this(TienIchGame.cfr_renamed_14(c.var_long_for, 0L))) {
                        int n4 = (int)((c.var_long_if - c.var_long_for) / 1000L);
                        StringBuffer stringBuffer6 = new StringBuffer().append("Thời gian: ");
                        ThongTinNhanVat.cfr_renamed_1();
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, stringBuffer6.append(ThongTinNhanVat.java_lang_String_do(n4)).toString(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Khu hiện tại: " + go_0.var_byte_do, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof af_0 != 0)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Trả lời win: " + AutoController.nhiemVuHienTai.int_do(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Khu hiện tại: " + go_0.var_byte_do, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof aj != 0) && (aj.cfr_renamed_5)) {
                        String string6;
                        int n5 = (int)((aj.aj_do().soXu - System.currentTimeMillis()) / 1000L);
                        StringBuffer stringBuffer7 = new StringBuffer().append("Farming: ");
                        if (TienIchGame.this(n5)) {
                            ThongTinNhanVat.cfr_renamed_1();
                            string6 = ThongTinNhanVat.java_lang_String_do(n5);
                            } else {
                            string6 = "xin chờ...";
                        }
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, stringBuffer7.append(string6).toString(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof dm_0 != 0)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, dm_0.var_dm_0_do.java_lang_String_for(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, dm_0.var_dm_0_do.cfr_renamed_0(), var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof cl != 0)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, cl.var_cl_do.cfr_renamed_0(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, cl.var_cl_do.java_lang_String_for(), var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof ex_0 != 0)) {
                        String string7;
                        int n6 = (int)((ex_0.ex_0_do().soXu - System.currentTimeMillis()) / 1000L);
                        StringBuffer stringBuffer8 = new StringBuffer().append("Farming: ");
                        if (TienIchGame.this(n6)) {
                            ThongTinNhanVat.cfr_renamed_1();
                            string7 = ThongTinNhanVat.java_lang_String_do(n6);
                            if ("  ".length() < -" ".length()) {
                                return;
                            }
                        } else {
                            string7 = "xin chờ...";
                        }
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, stringBuffer8.append(string7).toString(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof fu_0 != 0) && TienIchGame.this(TienIchGame.cfr_renamed_14(fu_0.soXu, 0L))) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Ra tù sau: " + fu_0.cfr_renamed_0(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof gr_0 != 0)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, gr_0.gr_0_do().cfr_renamed_0(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Khu hiện tại: " + go_0.var_byte_do, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof gh_0 != 0)) {
                        String string8;
                        StringBuffer stringBuffer9 = new StringBuffer().append("Số lần farm: ").append(gh_0.var_int_if).append(" / ");
                        if (TienIchGame.this(gh_0.cfr_renamed_1)) {
                            string8 = String.valueOf(gh_0.cfr_renamed_1);
                            } else {
                            string8 = "KGH";
                        }
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, stringBuffer9.append(string8).toString(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof bL != 0)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Đã hôn: " + bL.soLuong + " lần", var_int_arr_if[18], n, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof L != 0)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Đã đánh: " + L.soLuong + " lần", var_int_arr_if[18], n, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof az_0 != 0)) {
                        String string9;
                        if ((GameCanvas.var_en_do instanceof dR != 0)) {
                            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Friend: " + dR.dR_do().chuoiGiaTri, var_int_arr_if[18], n, var_int_arr_if[3]);
                            n += 20;
                        }
                        StringBuffer stringBuffer10 = new StringBuffer().append("Số lần farm: ").append(az_0.var_int_int).append(" / ");
                        if (TienIchGame.this(az_0.var_int_if)) {
                            string9 = String.valueOf(az_0.var_int_if);
                            } else {
                            string9 = "KGH";
                        }
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, stringBuffer10.append(string9).toString(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Cỏ đã diệt: " + az_0.soLuongKhoa, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Sâu đã diệt: " + az_0.soLuong, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof cl_0 != 0)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Số lần HPHV: " + AutoController.nhiemVuHienTai.int_do(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof al != 0)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Biến hình: " + AutoController.nhiemVuHienTai.java_lang_String_a_(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Số lần: " + AutoController.nhiemVuHienTai.int_do(), var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        return;
                    }
                    if ((AutoController.nhiemVuHienTai instanceof T != 0)) {
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Focus: " + T.T_do().java_lang_String_do(), var_int_arr_if[18], n, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Success: " + T.T_do().soLuong + " / " + T.T_do().int_a_(), var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Point: " + T.T_do().var_int_if, var_int_arr_if[18], n += 14, var_int_arr_if[3]);
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String java_lang_String_if() {
        StringBuffer stringBuffer;
        block26: {
            InputStreamReader inputStreamReader;
            block28: {
                if (!(TienIchGame.boolean_int())) {
                    return null;
                }
                InputStream inputStream = null;
                inputStreamReader = null;
                stringBuffer = new StringBuffer();
                try {
                    int n;
                    inputStream = this.getClass().getResourceAsStream("/version.txt");
                    inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                    while (TienIchGame.boolean_do(n = inputStreamReader.read(), var_int_arr_if[8])) {
                        stringBuffer.append((char)n);
                        if ("   ".length() != "  ".length()) continue;
                        return null;
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
                        }
                    catch (IOException iOException) {
                        if ("   ".length() == ((0x52 ^ 0x72) & ~(0xAD ^ 0x8D))) {
                            return null;
                        }
                        break block26;
                    }
                    if (" ".length() < 0) {
                        return null;
                    }
                    break block26;
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
                            if (((0x72 ^ 0x25 ^ (0xCD ^ 0xAD)) & (0xF0 ^ 0xB6 ^ (0xDC ^ 0xAD) ^ -" ".length())) == "   ".length()) {
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
                    if (" ".length() > ((0x80 ^ 0xBF) & ~(0xA0 ^ 0x9F))) throw throwable;
                    return null;
                }
                if ((inputStream != null)) {
                    try {
                        inputStream.close();
                        }
                    catch (IOException iOException) {
                        break block28;
                    }
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
            }
            try {
                inputStreamReader.close();
                }
            catch (IOException iOException) {
                break block26;
            }
            if (-" ".length() > "  ".length()) {
                return null;
            }
        }
        QuanLyRMS.docDuLieu("BuildVersion", var_int_arr_if[7]);
        return stringBuffer.toString();
    }

    public static boolean boolean_int() {
        if (TienIchGame.boolean_do(var_int_arr_if[7], QuanLyRMS.int_do("BuildVersion"))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    public static void cfr_renamed_10() {
        AutoController.controllerInstance.cfr_renamed_0();
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat == 0)) {
            go_0.cfr_renamed_27();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean (long l != 0) {
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
        if (((0xD6 ^ 0xBA ^ (0xE9 ^ 0x9D)) & (0xA2 ^ 0xC3 ^ (0x6A ^ 0x13) ^ -" ".length())) != 0) {
            return ((9 + 48 - 34 + 145 ^ 63 + 31 - 9 + 56) & (174 + 9 - 39 + 33 ^ 36 + 105 - 30 + 37 ^ -" ".length())) != 0;
        }
        if (TienIchGame.cfr_renamed_8(TienIchGame.cfr_renamed_12(System.currentTimeMillis() - l2, l))) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    public static boolean boolean_new() {
        if (!(GameCanvas.var_en_do instanceof gO == 0) || (fh.var_int_char == var_int_arr_if[8])) {
            return var_int_arr_if[2];
        }
        return var_int_arr_if[3];
    }

    private static String cfr_renamed_4(String string) {
        if (TienIchGame.boolean_do(string.indexOf(var_int_arr_if[12]), var_int_arr_if[8])) {
            StringBuffer stringBuffer = new StringBuffer();
            int n = var_int_arr_if[3];
            while ((n < string.length())) {
                char c2 = string.charAt(n);
                if (TienIchGame.boolean_do((int)c2, var_int_arr_if[12])) {
                    stringBuffer.append(c2);
                    }
                ++n;
                return null;
            }
            return stringBuffer.toString();
        }
        return string;
    }
}

