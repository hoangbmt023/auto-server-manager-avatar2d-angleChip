/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import java.io.IOException;
import javax.microedition.rms.RecordStore;
import main.AngelChip;

public final class eq
extends ax_0 {
    private static eq var_eq_do;
    private static final int[] mangSoNguyen;

    public final void cfr_renamed_4(int n) {
        this.cfr_renamed_0(-61);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    public final void (short s2 != null) {
        this.cfr_renamed_0(-97);
        this.void_if((int)s2);
        this.cfr_renamed_1();
    }

        public final void cfr_renamed_5(int n) {
        this.cfr_renamed_0(-106);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int int_do() {
        long l;
        block14: {
            l = 0L;
            RecordStore recordStore = null;
            try {
                recordStore = RecordStore.openRecordStore((String)"textrms", (boolean)1);
                l = recordStore.getSizeAvailable() + recordStore.getSize();
            }
            catch (Exception exception) {
                try {
                    if ((recordStore != null)) {
                        recordStore.closeRecordStore();
                    }
                    RecordStore.deleteRecordStore((String)"textrms");
                    }
                catch (Exception exception2) {
                    break block14;
                }
                if (" ".length() < 0) {
                    return (0x9A ^ 0x8E ^ (0x4B ^ 0x6B)) & (29 + 11 - 28 + 133 ^ 111 + 24 - 75 + 105 ^ -" ".length());
                }
                break block14;
            }
            catch (Throwable throwable) {
                try {
                    if ((recordStore != null)) {
                        recordStore.closeRecordStore();
                    }
                    RecordStore.deleteRecordStore((String)"textrms");
                    throw throwable;
                }
                catch (Exception exception) {
                    throw throwable;
                }
            }
            try {
                if ((recordStore != null)) {
                    recordStore.closeRecordStore();
                }
                RecordStore.deleteRecordStore((String)"textrms");
                }
            catch (Exception exception) {
                break block14;
            }
            if (((0x15 ^ 0x48 ^ (0x86 ^ 0x91)) & (0xE8 ^ 0x93 ^ (0xF2 ^ 0xC3) ^ -" ".length())) != ((0x77 ^ 0x7F ^ (0x1F ^ 0xA)) & (0x6A ^ 0x5E ^ (0x60 ^ 0x49) ^ -" ".length()))) {
                return (221 + 239 - 229 + 24 ^ 165 + 60 - 165 + 136) & (15 + 40 - -55 + 53 ^ 9 + 85 - 34 + 92 ^ -" ".length());
            }
        }
        if (!eq.boolean_do((l, 0L != null))) return (int)l;
        l /= 1024L;
        return (int)l;
    }

    public final void cfr_renamed_2(int n) {
        this.cfr_renamed_0(61);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    static {
        eq.cfr_renamed_4();
    }

    public final void (byte by2, short s2 != null) {
        this.cfr_renamed_0(-107);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(s2);
            this.cfr_renamed_1();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void cfr_renamed_15(int n) {
        this.cfr_renamed_0(2);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    public final void (String string, String string2 != null) {
        this.cfr_renamed_0(-62);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string2);
            }
        catch (IOException iOException) {
            }
        this.cfr_renamed_1();
    }

    public final void (byte by2 == null) {
        this.cfr_renamed_0(-94);
        this.void_for((int)by2);
        this.cfr_renamed_1();
    }

    public final void (short s2, byte by2 != null) {
        this.cfr_renamed_0(-48);
        this.var_ad_0_do = new ad_0(-48);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(s2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            }
        catch (IOException iOException) {
            }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(byte by2) {
        this.cfr_renamed_0(-51);
        this.void_for((int)by2);
        this.cfr_renamed_1();
    }

    public final void (int n, int n2, short s2 != null) {
        this.cfr_renamed_0(-89);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(s2);
            }
        catch (Exception exception) {
            }
        if (-(0x45 ^ 0x40 ^ (0xB2 ^ 0x86) & ~(0x1E ^ 0x2A)) >= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public static eq eq_do() {
        if ((var_eq_do == null)) {
            var_eq_do = new eq();
        }
        return var_eq_do;
    }

    public final void cfr_renamed_8(int n) {
        this.cfr_renamed_0(-49);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    public final void void_do() {
        this.cfr_renamed_0(-35);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(AngelChip.duLieuNguoiChoi.var_byte_void);
            int n = AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.size();
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            int n2 = 0;
            while (eq.boolean_if(n2, n)) {
                ef ef2 = (ef)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.elementAt(n2);
                this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(ef2.var_short_do);
                ++n2;
                if (((0x45 ^ 0x68) & ~(0xB9 ^ 0x94)) == 0) continue;
                return;
            }
            }
        catch (IOException iOException) {
            }
        if ("   ".length() < 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public final void (String string == null) {
        this.cfr_renamed_0(-88);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(0);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (Exception exception) {
            }
        if (" ".length() < 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3() {
        this.cfr_renamed_0(-1);
        this.void_for(AngelChip.var_int_if);
        this.cfr_renamed_1();
        this.cfr_renamed_0(-17);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(AngelChip.var_byte_do);
            Object object = Runtime.getRuntime();
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt((int)(((Runtime)object).totalMemory() / 1024L));
            object = System.getProperty("microedition.platform");
            if ((object == null)) {
                object = "null";
            }
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF((String)object);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(eq.int_do());
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(GameCanvas.var_int_byte);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(GameCanvas.var_int_char);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeBoolean(GameCanvas.coTrangThai);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(bn_0.cfr_renamed_6 - 1);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF("2.5.8");
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(em_0.chuoiGiaTri);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(fw.chuoiGiaTri);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(fe_0.chuoiGiaTri);
            }
        catch (IOException iOException) {
            }
        if (" ".length() <= -" ".length()) {
            return;
        }
        this.cfr_renamed_1();
        this.cfr_renamed_0(-79);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(AngelChip.cfr_renamed_3);
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (" ".length() <= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (short s2, int n != null) {
        this.cfr_renamed_0(-64);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(s2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n);
            }
        catch (Exception exception) {
            }
        if (((109 + 137 - 167 + 59 ^ 59 + 50 - -46 + 0) & (6 + 48 - -110 + 8 ^ 46 + 99 - 79 + 123 ^ -" ".length())) != 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (byte by2, String string != null) {
        if ((string == null)) {
            string = "";
        }
        this.cfr_renamed_0(-55);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if ((0x87 ^ 0xBC ^ (0x9A ^ 0xA5)) < -" ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (String string, String string2 == null) {
        this.cfr_renamed_0(-88);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(1);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string2);
            }
        catch (Exception exception) {
            }
        if (" ".length() < -" ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void void_do(int n, int n2) {
        this.cfr_renamed_0(-83);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n2);
            }
        catch (IOException iOException) {
            }
        if ((0x5F ^ 0x5A) <= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_12(int n) {
        this.cfr_renamed_0(-90);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_11(int n) {
        this.cfr_renamed_0(34);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    public final void (short s2 == null) {
        this.cfr_renamed_0(-95);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(fe_0.var_byte_char);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(0);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(s2);
            }
        catch (Exception exception) {
            }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_18(int n) {
        this.cfr_renamed_0(-47);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[43];
        -55 = -(9 + 94 - 26 + 50 ^ (0x2B ^ 0x63));
        -1 = -" ".length();
        -17 = -(0xAC ^ 0x9B ^ (0xB5 ^ 0x93));
        1 = " ".length();
        -79 = -(0x40 ^ 0xF);
        34 = 109 + 91 - 107 + 74 ^ 100 + 128 - 144 + 49;
        -2 = -"  ".length();
        61 = 0x3D ^ 0;
        -6 = -(0x5A ^ 0x77 ^ (0x3A ^ 0x11));
        -35 = -(0x68 ^ 0x4B);
        0 = (0x63 ^ 0x36) & ~(0xE9 ^ 0xBC);
        -36 = -(23 + 129 - 107 + 92 ^ 51 + 67 - 66 + 121);
        -47 = -(0xB8 ^ 0x97);
        -48 = -(0x8E ^ 0xBE);
        -51 = -(6 ^ 0x7A ^ (0xFF ^ 0xB0));
        -49 = -(0xCD ^ 0x99 ^ (9 ^ 0x6C));
        -52 = -(0x39 ^ 0xD);
        -53 = -(0x27 ^ 0x12);
        -59 = -(0x3D ^ 6);
        -60 = -(0x23 ^ 0x29 ^ (0x29 ^ 0x1F));
        -61 = -(0x20 ^ 0x3C ^ (0x23 ^ 2));
        -56 = -(0x15 ^ 0x2D);
        -62 = -(0x2F ^ 0x11);
        -64 = -(195 + 50 - 69 + 68 ^ 29 + 109 - 29 + 71);
        -72 = -(0xDB ^ 0x93);
        -81 = -(0x77 ^ 0x26);
        -83 = -(0 ^ 0x53);
        -58 = -(0x87 ^ 0xBD);
        -88 = -(0x3D ^ 0x18 ^ (0x27 ^ 0x5A));
        -90 = -(0xDA ^ 0x80);
        -89 = -(199 + 153 - 291 + 162 ^ 9 + 122 - 8 + 11);
        -92 = -(0x51 ^ 0x37 ^ (0xB6 ^ 0x8C));
        -94 = -(0x91 ^ 0x9D ^ (0xCA ^ 0x98));
        -95 = -(0x7F ^ 0x20);
        -97 = -(0x1B ^ 0x61 ^ (0x75 ^ 0x6E));
        -98 = -(0xCC ^ 0xAE);
        -99 = -(0xE2 ^ 0x81);
        5 = 3 + 24 - -109 + 45 ^ 160 + 41 - 76 + 51;
        2 = "  ".length();
        -102 = -(0x9D ^ 0xB7 ^ (0x70 ^ 0x3C));
        -106 = -(0x71 ^ 0x1B);
        -107 = -(0x31 ^ 0x5A);
        -25 = -(44 + 138 - 151 + 159 ^ 102 + 111 - 150 + 104);
    }

    public final void cfr_renamed_10(int n) {
        GameCanvas.cfr_renamed_5();
        this.cfr_renamed_0(-99);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    public final void this(int n) {
        this.cfr_renamed_0(-53);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public final void (String string, String string2, String string3 != null) {
        this.cfr_renamed_0(-25);
        try {
            this.cfr_renamed_0(string);
            this.cfr_renamed_0(string2);
            this.cfr_renamed_0(string3);
            this.void_for(0);
            this.cfr_renamed_1();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void (int n, byte by2, String string != null) {
        this.cfr_renamed_0(-60);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if (-" ".length() < -" ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void void_if(int n, int n2) {
        this.cfr_renamed_0(-36);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (IOException iOException) {
            }
        if (-(0x34 ^ 0x31) >= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (int n, byte by2, int n2, byte by3 != null) {
        this.cfr_renamed_0(-81);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by3);
            }
        catch (Exception exception) {
            }
        if ("  ".length() < 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_4(byte by2) {
        this.cfr_renamed_0(-92);
        if (eq.boolean_do(by2, -1)) {
            this.void_for((int)by2);
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(short s2) {
        this.cfr_renamed_0(-98);
        this.void_if((int)s2);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_16(int n) {
        this.cfr_renamed_0(-52);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    public final void (int n, byte by2, int n2 != null) {
        this.cfr_renamed_0(-59);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (IOException iOException) {
            }
        if (-(0x9D ^ 0x99) > 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_5(byte by2) {
        this.cfr_renamed_0(-58);
        this.void_for((int)by2);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_6(int n) {
        this.cfr_renamed_0(-102);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(int n, int n2) {
        GameCanvas.cfr_renamed_5();
        this.cfr_renamed_0(5);
        this.void_for(n);
        this.void_do(n2);
        this.cfr_renamed_1();
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void cfr_renamed_17(int n) {
        this.cfr_renamed_0(-1);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    public final void (int n, String string != null) {
        this.cfr_renamed_0(-72);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (Exception exception) {
            }
        if (((0xB4 ^ 0x82) & ~(0xAF ^ 0x99)) == -" ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (int n, String string == null) {
        this.cfr_renamed_0(-6);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if ((0xB1 ^ 0xB4) <= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

        public final void (String string, String string2, String string3 == null) {
        this.cfr_renamed_0(-2);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string3);
            }
        catch (IOException iOException) {
            }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(String string, String string2, String string3) {
        this.cfr_renamed_0(-56);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string3);
            }
        catch (IOException iOException) {
            }
        if ("   ".length() == 0) {
            return;
        }
        this.cfr_renamed_1();
    }
}

