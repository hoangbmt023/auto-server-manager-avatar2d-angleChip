/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import java.io.IOException;
import javax.microedition.rms.RecordStore;
import main.AngelChip;

/*
 * Renamed from fT
 */
public final class ft_0
extends bE {
    private static final int[] mangSoNguyen;
    private static ft_0 var_ft_0_do;

    public final void (short s2 == null) {
        this.cfr_renamed_1(-98);
        this.void_if((int)s2);
        this.cfr_renamed_0();
    }

    public final void (String string, String string2, String string3 == null) {
        this.cfr_renamed_1(-2);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string3);
            }
        catch (IOException iOException) {
            }
        if (-" ".length() > -" ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void (int n, byte by2, int n2 == null) {
        this.cfr_renamed_1(-59);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (IOException iOException) {
            }
        if ("  ".length() >= "   ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    public final void cfr_renamed_3(int n) {
        this.cfr_renamed_1(-52);
        this.void_do(n);
        this.cfr_renamed_0();
    }

    public final void (byte by2, short s2 == null) {
        this.cfr_renamed_1(-107);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(s2);
            this.cfr_renamed_0();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void cfr_renamed_4(int n) {
        this.cfr_renamed_1(-61);
        this.void_do(n);
        this.cfr_renamed_0();
    }

    public static ft_0 ft_0_do() {
        if ((var_ft_0_do == null)) {
            var_ft_0_do = new ft_0();
        }
        return var_ft_0_do;
    }

    static {
        ft_0.cfr_renamed_3();
    }

    public final void cfr_renamed_5(int n) {
        this.cfr_renamed_1(-53);
        this.void_for(n);
        this.cfr_renamed_0();
    }

    public final void (short s2 != null) {
        this.cfr_renamed_1(-97);
        this.void_if((int)s2);
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_6(int n) {
        this.cfr_renamed_1(-49);
        this.void_for(n);
        this.cfr_renamed_0();
    }

    public final void (byte by2 != null) {
        this.cfr_renamed_1(-94);
        this.void_for((int)by2);
        this.cfr_renamed_0();
    }

    public final void void_do(int n, int n2) {
        this.cfr_renamed_1(-36);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (IOException iOException) {
            }
        if (((0x93 ^ 0x88) & ~(0x18 ^ 3)) != 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int int_do() {
        long l;
        block15: {
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
                    break block15;
                }
                if (-"   ".length() > 0) {
                    return (0x77 ^ 0x41) & ~(0x8D ^ 0xBB);
                }
                break block15;
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
                if (((0x3F ^ 0x43 ^ (0xC4 ^ 0x84)) & (0x29 ^ 0x53 ^ (6 ^ 0x40) ^ -" ".length())) != 0) {
                    return (0x4E ^ 0x12 ^ (0xA ^ 0xD)) & (143 + 210 - 160 + 38 ^ 183 + 162 - 223 + 66 ^ -" ".length());
                }
                break block15;
            }
            if ("  ".length() <= 0) {
                return (0x70 ^ 0x53) & ~(0xA2 ^ 0x81);
            }
        }
        if (!ft_0.boolean_do((l, 0L == null))) return (int)l;
        l /= 1024L;
        return (int)l;
    }

    public final void void_do() {
        this.cfr_renamed_1(-35);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(AngelChip.duLieuNguoiChoi.var_byte_do);
            int n = AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.size();
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n);
            int n2 = 0;
            while (ft_0.boolean_if(n2, n)) {
                cg cg2 = (cg)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.elementAt(n2);
                this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(cg2.var_short_do);
                ++n2;
                if (((76 + 90 - 130 + 116 ^ 116 + 155 - 115 + 1) & (0xDF ^ 0x95 ^ (0xE1 ^ 0xAE) ^ -" ".length())) == 0) continue;
                return;
            }
            }
        catch (IOException iOException) {
            }
        if (-" ".length() > (100 + 69 - 50 + 45 ^ 91 + 26 - 41 + 84)) {
            return;
        }
        this.cfr_renamed_0();
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public final void cfr_renamed_7(int n) {
        this.cfr_renamed_1(-102);
        this.void_do(n);
        this.cfr_renamed_0();
    }

    public final void void_if(int n, int n2) {
        GameCanvas.cfr_renamed_8();
        this.cfr_renamed_1(5);
        this.void_for(n);
        this.void_do(n2);
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2(byte by2) {
        this.cfr_renamed_1(-58);
        this.void_for((int)by2);
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_8(int n) {
        this.cfr_renamed_1(-90);
        this.void_for(n);
        this.cfr_renamed_0();
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public final void (byte by2, String string == null) {
        if ((string == null)) {
            string = "";
        }
        this.cfr_renamed_1(-55);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if ("   ".length() > "   ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2(short s2) {
        this.cfr_renamed_1(-95);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(go_0.var_byte_if);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(0);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(s2);
            }
        catch (Exception exception) {
            }
        if ("   ".length() != "   ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void (String string != null) {
        this.cfr_renamed_1(-88);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(0);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (Exception exception) {
            }
        this.cfr_renamed_0();
    }

    public final void (String string, String string2, String string3 != null) {
        this.cfr_renamed_1(-56);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string3);
            }
        catch (IOException iOException) {
            }
        if ("   ".length() != "   ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_3(byte by2) {
        this.cfr_renamed_1(-51);
        this.void_for((int)by2);
        this.cfr_renamed_0();
    }

        public final void cfr_renamed_4(byte by2) {
        this.cfr_renamed_1(-92);
        if (ft_0.boolean_do(by2, -1)) {
            this.void_for((int)by2);
        }
        this.cfr_renamed_0();
    }

    public final void (String string, String string2 == null) {
        this.cfr_renamed_1(-62);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string2);
            }
        catch (IOException iOException) {
            }
        if ("   ".length() <= 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void (short s2, int n == null) {
        this.cfr_renamed_1(-64);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(s2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n);
            }
        catch (Exception exception) {
            }
        if (-" ".length() != -" ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void (short s2, byte by2 == null) {
        this.cfr_renamed_1(-48);
        this.var_bj_do = new bj(-48);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(s2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
            }
        catch (IOException iOException) {
            }
        if ("  ".length() <= 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void (int n, byte by2, String string == null) {
        this.cfr_renamed_1(-60);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if ((0xED ^ 0x89 ^ (0x66 ^ 7)) == 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_13(int n) {
        this.cfr_renamed_1(61);
        this.void_for(n);
        this.cfr_renamed_0();
    }

    public final void (int n, byte by2, int n2, byte by3 == null) {
        this.cfr_renamed_1(-81);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by3);
            }
        catch (Exception exception) {
            }
        if (-"   ".length() > 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2(String string, String string2, String string3) {
        this.cfr_renamed_1(-25);
        try {
            this.cfr_renamed_1(string);
            this.cfr_renamed_1(string2);
            this.cfr_renamed_1(string3);
            this.void_for(0);
            this.cfr_renamed_0();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void cfr_renamed_2() {
        this.cfr_renamed_1(-1);
        this.void_for(AngelChip.soLuong);
        this.cfr_renamed_0();
        this.cfr_renamed_1(-17);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(AngelChip.var_byte_do);
            Object object = Runtime.getRuntime();
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt((int)(((Runtime)object).totalMemory() / 1024L));
            object = System.getProperty("microedition.platform");
            if ((object == null)) {
                object = "null";
            }
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF((String)object);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(ft_0.int_do());
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(GameCanvas.soLuongKhoa);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(GameCanvas.var_int_case);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeBoolean(GameCanvas.var_boolean_try);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(dF.cfr_renamed_12 - 1);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF("2.5.8");
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(fo.chuoiGiaTri);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(gO.chuoiGiaTri);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(go_0.chuoiGiaTri);
            }
        catch (IOException iOException) {
            }
        if (-" ".length() > 0) {
            return;
        }
        this.cfr_renamed_0();
        this.cfr_renamed_1(-79);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(AngelChip.cfr_renamed_2);
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if ((0xB3 ^ 0xB7) < 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void (int n, String string == null) {
        this.cfr_renamed_1(-6);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if ((8 ^ 0xC) < -" ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_9(int n) {
        this.cfr_renamed_1(34);
        this.void_do(n);
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2(int n, int n2) {
        this.cfr_renamed_1(-83);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n2);
            }
        catch (IOException iOException) {
            }
        if (-(40 + 106 - 34 + 31 ^ 61 + 105 - 34 + 7) >= 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[43];
        -55 = -(0xBC ^ 0xB2 ^ (0x75 ^ 0x4C));
        -1 = -" ".length();
        -17 = -(0x7A ^ 0x1F ^ (0xCD ^ 0xB9));
        1 = " ".length();
        -79 = -(9 ^ 0x46);
        34 = 0xB ^ 0x2A ^ "   ".length();
        -2 = -"  ".length();
        61 = 0xB4 ^ 0xB3 ^ (0x57 ^ 0x6D);
        -6 = -(0x20 ^ 1 ^ (0x60 ^ 0x47));
        -35 = -(0x9D ^ 0xC5 ^ (0xC1 ^ 0xBA));
        0 = (0xFD ^ 0xC7) & ~(0x4F ^ 0x75);
        -36 = -(0x70 ^ 0x54);
        -47 = -(0x22 ^ 0xD);
        -48 = -(33 + 158 - 30 + 16 ^ 49 + 112 - 56 + 24);
        -51 = -(0x76 ^ 0x45);
        -49 = -(0x3B ^ 0xA);
        -52 = -(157 + 124 - 141 + 21 ^ 129 + 64 - 92 + 48);
        -53 = -(0xB4 ^ 0x81);
        -59 = -(0xB8 ^ 0x83);
        -60 = -(0x74 ^ 0x1B ^ (0x6D ^ 0x3E));
        -61 = -(31 + 8 - -67 + 55 ^ 71 + 148 - 168 + 105);
        -56 = -(142 + 33 - 32 + 2 ^ 69 + 96 - 96 + 100);
        -62 = -(0x28 ^ 0x16);
        -64 = -(0x43 ^ 3);
        -72 = -(0x1F ^ 0x57);
        -81 = -(0x2F ^ 0x33 ^ (0xC4 ^ 0x89));
        -83 = -(0x20 ^ 0x73);
        -58 = -(0x40 ^ 0x7A);
        -88 = -(0x15 ^ 0x4D);
        -90 = -(0xD8 ^ 0xB1 ^ (0xA9 ^ 0x9A));
        -89 = -(0x36 ^ 0x6F);
        -92 = -(0x77 ^ 0x23 ^ (0x5F ^ 0x57));
        -94 = -(0x5C ^ 0x15 ^ (0x78 ^ 0x6F));
        -95 = -(0x2C ^ 0x73);
        -97 = -(0x75 ^ 0x14);
        -98 = -(0xE5 ^ 0x94 ^ (0xD7 ^ 0xC4));
        -99 = -(0x16 ^ 0x75);
        5 = 99 + 33 - 10 + 30 ^ 47 + 140 - 96 + 66;
        2 = "  ".length();
        -102 = -(0xE2 ^ 0x84);
        -106 = -(0xF9 ^ 0x93);
        -107 = -(0xC6 ^ 0xAD);
        -25 = -(0x49 ^ 7 ^ (0x59 ^ 0xE));
    }

    public final void cfr_renamed_14(int n) {
        this.cfr_renamed_1(-106);
        this.void_for(n);
        this.cfr_renamed_0();
    }

    public final void this(int n) {
        GameCanvas.cfr_renamed_8();
        this.cfr_renamed_1(-99);
        this.void_for(n);
        this.cfr_renamed_0();
    }

        public final void cfr_renamed_12(int n) {
        this.cfr_renamed_1(-1);
        this.void_for(n);
        this.cfr_renamed_0();
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void (int n, String string != null) {
        this.cfr_renamed_1(-72);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (Exception exception) {
            }
        if (" ".length() >= "  ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_15(int n) {
        this.cfr_renamed_1(-47);
        this.void_do(n);
        this.cfr_renamed_0();
    }

    public final void (String string, String string2 != null) {
        this.cfr_renamed_1(-88);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(1);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string2);
            }
        catch (Exception exception) {
            }
        if (-" ".length() >= " ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void (int n, int n2, short s2 == null) {
        this.cfr_renamed_1(-89);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(s2);
            }
        catch (Exception exception) {
            }
        if ("  ".length() < 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_21(int n) {
        this.cfr_renamed_1(2);
        this.void_for(n);
        this.cfr_renamed_0();
    }
}

