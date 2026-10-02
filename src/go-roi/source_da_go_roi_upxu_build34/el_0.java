/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import main.AngelChip;

/*
 * Renamed from eL
 */
public final class el_0
extends ax_0 {
    private static el_0 var_el_0_do;
    private static final int[] mangSoNguyen;

    public final void cfr_renamed_1(String string) {
        if (el_0.boolean_do(fe_0.fe_0_do().boolean_do() ? 1 : 0)) {
            fe_0.fe_0_do().soXu = System.currentTimeMillis();
        }
        if (el_0.boolean_do(AngelChip.var_int_if, 10)) {
            this.cfr_renamed_0(77);
            if (" ".length() <= ((75 + 101 - 111 + 66 ^ 57 + 20 - 10 + 66) & (0xB3 ^ 0x82 ^ (0x8A ^ 0xBD) ^ -" ".length()))) {
                return;
            }
        } else {
            this.cfr_renamed_0(55);
        }
        this.cfr_renamed_0(string);
        this.cfr_renamed_1();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[21];
        50 = 0xF4 ^ 0xC6;
        54 = 0x9F ^ 0xA9;
        10 = 0xE ^ 4;
        77 = 0xDA ^ 0x97;
        55 = 0x48 ^ 0x7D ^ "  ".length();
        -21 = -(0x29 ^ 0xC ^ (0xA4 ^ 0x94));
        -19 = -(69 + 35 - 45 + 79 ^ 133 + 24 - 145 + 141);
        58 = 0x6B ^ 1 ^ (0xE5 ^ 0xB5);
        59 = 0x3B ^ 0;
        -22 = -(157 + 22 - 121 + 114 ^ 4 + 46 - -9 + 127);
        60 = 0x4A ^ 0x76;
        -38 = -(49 + 75 - 16 + 32 ^ 29 + 78 - 95 + 158);
        84 = 42 + 128 - -41 + 18 ^ 63 + 39 - 55 + 130;
        1 = " ".length();
        0 = (0x1C ^ 0x4C) & ~(0x75 ^ 0x25);
        85 = 0xE8 ^ 0xBD;
        -68 = -(0xC2 ^ 0x86);
        -77 = -(0x66 ^ 0x5E ^ (6 ^ 0x73));
        -78 = -(0x55 ^ 0x1B);
        89 = 0x29 ^ 0x35 ^ (0x20 ^ 0x65);
        93 = 193 + 218 - 338 + 177 ^ 126 + 86 - 76 + 31;
    }

    public final void cfr_renamed_1(byte by2) {
        this.cfr_renamed_0(60);
        this.void_for(by2);
        this.cfr_renamed_1();
    }

    static {
        el_0.cfr_renamed_3();
    }

    public static el_0 el_0_do() {
        if ((var_el_0_do == null)) {
            var_el_0_do = new el_0();
        }
        return var_el_0_do;
    }

    public final void (int n, int n2, int n3 == null) {
        this.cfr_renamed_0(-78);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n3);
            }
        catch (Exception exception) {
            }
        this.cfr_renamed_1();
    }

    public final void void_do() {
        this.cfr_renamed_0(85);
        this.cfr_renamed_1();
    }

    public final void void_do(int n, int n2) {
        this.cfr_renamed_0(93);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if ("  ".length() >= (0xD ^ 0x42 ^ (0x69 ^ 0x22))) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (byte[] byArray == null) {
        this.cfr_renamed_0(84);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeBoolean(1);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(byArray.length);
            int n = 0;
            while (el_0.boolean_if(n, byArray.length)) {
                this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(byArray[n]);
                ++n;
                if (-" ".length() == -" ".length()) continue;
                return;
            }
            }
        catch (Exception exception) {
            }
        if ("  ".length() >= "   ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void (int n, boolean bl == null) {
        this.cfr_renamed_0(-19);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeBoolean(bl);
            }
        catch (IOException iOException) {
            }
        if (-(9 ^ 0x48 ^ (0xFF ^ 0xBA)) >= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

        public final void cfr_renamed_1(int n, int n2, int n3) {
        this.cfr_renamed_0(-77);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n3);
            }
        catch (Exception exception) {
            }
        if ((0xA9 ^ 0xAD) != (0x2B ^ 0x2F)) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (int n, int n2, int n3, int n4 == null) {
        if (el_0.boolean_do(fe_0.fe_0_do().boolean_do() ? 1 : 0)) {
            fe_0.fe_0_do().soXu = System.currentTimeMillis();
        }
        this.cfr_renamed_0(54);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n3);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n4);
            }
        catch (IOException iOException) {
            }
        if (((0xD ^ 0x1B) & ~(9 ^ 0x1F)) < 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void void_if(int n, int n2) {
        this.cfr_renamed_0(59);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n2);
            }
        catch (IOException iOException) {
            }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(String string) {
        if (el_0.boolean_do(AutoController.cfr_renamed_0(string) ? 1 : 0)) {
            return;
        }
        this.cfr_renamed_1(string);
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public final void cfr_renamed_4(int n) {
        this.cfr_renamed_0(-22);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(int n, int n2) {
        this.cfr_renamed_0(-68);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n2);
            }
        catch (Exception exception) {
            }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_5(int n) {
        this.cfr_renamed_0(-21);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    public final void (short s2 == null) {
        this.cfr_renamed_0(-38);
        this.void_if(s2);
        this.cfr_renamed_1();
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public final void cfr_renamed_2(int n) {
        this.cfr_renamed_0(89);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(0);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            }
        catch (Exception exception) {
            }
        if ("  ".length() == -" ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_4(int n, int n2) {
        if (el_0.boolean_if(t_0.soLuong)) {
            GameCanvas.cfr_renamed_5();
        }
        this.cfr_renamed_0(50);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(ef_0.var_int_char);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(ef_0.var_int_new);
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (" ".length() <= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(int n, int n2, int n3) {
        this.cfr_renamed_0(58);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n3);
            }
        catch (IOException iOException) {
            }
        if (" ".length() == 0) {
            return;
        }
        this.cfr_renamed_1();
    }
}

