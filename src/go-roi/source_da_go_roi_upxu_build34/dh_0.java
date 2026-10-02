/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from dh
 */
public final class dh_0
extends ax_0 {
    private static final int[] mangSoNguyen;
    private static dh_0 var_dh_0_do;

    public final void void_do() {
        this.cfr_renamed_0(56);
        this.cfr_renamed_1();
        GameCanvas.cfr_renamed_4(MenuChinhAvatar.n);
    }

    public final void void_do(int n, int n2) {
        this.cfr_renamed_0(70);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (Exception exception) {
            }
        if (((0xC7 ^ 0x96 ^ (0x18 ^ 0x71)) & (62 + 0 - 19 + 84 ^ (0x18 ^ 0x5F) ^ -" ".length())) > 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (int n, byte by2 == null) {
        this.cfr_renamed_0(73);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            }
        catch (Exception exception) {
            }
        if (" ".length() <= ((0x2D ^ 0x25) & ~(0x8D ^ 0x85))) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_1(int n, int n2) {
        this.cfr_renamed_0(72);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (Exception exception) {
            }
        if (" ".length() >= "   ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_4(int n) {
        this.cfr_renamed_0(86);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(int n, int n2) {
        this.cfr_renamed_0(66);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (IOException iOException) {
            }
        if ((0x88 ^ 0x8D) == 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_4(int n, int n2) {
        this.cfr_renamed_0(75);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (Exception exception) {
            }
        if (-(0xB2 ^ 0x9B ^ (0x15 ^ 0x38)) >= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (short s2 == null) {
        this.cfr_renamed_0(82);
        this.void_if((int)s2);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_1(short s2) {
        this.cfr_renamed_0(54);
        this.void_if((int)s2);
        this.cfr_renamed_1();
        GameCanvas.cfr_renamed_4(MenuChinhAvatar.n);
    }

        private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public final void cfr_renamed_5(int n, int n2) {
        this.cfr_renamed_0(80);
        this.void_for(n);
        if (dh_0.boolean_do(n, 1)) {
            this.void_for(n2);
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3() {
        this.cfr_renamed_0(96);
        this.void_for(0);
        this.cfr_renamed_1();
    }

    public final void (fc_0 fc_02, int n == null) {
        GameCanvas.cfr_renamed_8();
        this.cfr_renamed_0(71);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(fc_02.var_byte_do);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            }
        catch (Exception exception) {
            }
        if (((0x28 ^ 0x67 ^ (0x4A ^ 0x5B)) & (0x44 ^ 0x63 ^ (0x61 ^ 0x18) ^ -" ".length())) > "   ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    static {
        dh_0.cfr_renamed_2();
    }

    public final void cfr_renamed_4() {
        this.cfr_renamed_0(55);
        this.cfr_renamed_1();
        GameCanvas.cfr_renamed_4(MenuChinhAvatar.n);
    }

    public final void cfr_renamed_2(int n, int n2) {
        this.cfr_renamed_0(94);
        this.void_for(n);
        if (dh_0.boolean_do(n, 1)) {
            this.void_for(n2);
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(short s2) {
        this.cfr_renamed_0(63);
        this.void_if((int)s2);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_5(int n) {
        this.cfr_renamed_0(84);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_15(int n, int n2) {
        this.cfr_renamed_0(81);
        this.void_for(n);
        if (dh_0.boolean_do(n, 1)) {
            this.void_for(n2);
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_5() {
        this.cfr_renamed_0(60);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_2(int n) {
        this.cfr_renamed_0(69);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    public static dh_0 dh_0_do() {
        if ((var_dh_0_do == null)) {
            var_dh_0_do = new dh_0();
        }
        return var_dh_0_do;
    }

    public final void (int n, int n2, int n3 == null) {
        this.cfr_renamed_0(64);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n3);
            }
        catch (IOException iOException) {
            }
        if (((0xC2 ^ 0x93) & ~(0x6C ^ 0x3D)) >= "  ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_15(int n) {
        this.cfr_renamed_0(61);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[29];
        54 = 130 + 166 - 167 + 53 ^ 58 + 1 - -43 + 26;
        55 = 0x2F ^ 0x18;
        56 = 72 + 67 - -1 + 10 ^ 84 + 125 - 187 + 152;
        60 = 0xAA ^ 0x96;
        61 = 0x7A ^ 0x6E ^ (0xB ^ 0x22);
        62 = 0x5B ^ 0x65;
        63 = 0x80 ^ 0xBF;
        64 = 0x79 ^ 0x1B ^ (0x23 ^ 1);
        65 = 0xF1 ^ 0xB0;
        66 = 0xCB ^ 0x89;
        70 = 0x65 ^ 0x56 ^ (0x78 ^ 0xD);
        69 = 0x34 ^ 0x20 ^ (0x17 ^ 0x46);
        74 = 0x31 ^ 0x7B;
        73 = 0x21 ^ 0x66 ^ (0xA9 ^ 0xA7);
        71 = 0x1A ^ 0x5D;
        72 = 0xCE ^ 0x86;
        75 = 0xC0 ^ 0x8B;
        80 = 0x6C ^ 0x5A ^ (0x41 ^ 0x27);
        1 = " ".length();
        81 = 0x90 ^ 0xC1;
        82 = 0x4C ^ 0x1E;
        84 = 0xAA ^ 0x98 ^ (0xDF ^ 0xB9);
        86 = 4 ^ 0x2F ^ (0x6F ^ 0x12);
        90 = 122 + 11 - 55 + 175 ^ 45 + 32 - 32 + 122;
        94 = 0xDB ^ 0x85;
        91 = 0xE8 ^ 0xB3;
        93 = 4 ^ 0x59;
        96 = 0x6F ^ 0x2E ^ (0xA0 ^ 0x81);
        0 = (0x3E ^ 0x64) & ~(0x57 ^ 0xD);
    }

    public final void cfr_renamed_4(short s2) {
        GameCanvas.cfr_renamed_5();
        this.cfr_renamed_0(91);
        this.void_if((int)s2);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_8(int n, int n2) {
        this.cfr_renamed_0(74);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (Exception exception) {
            }
        if ("   ".length() <= " ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_1(int n, int n2, int n3) {
        this.cfr_renamed_0(65);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n3);
            }
        catch (IOException iOException) {
            }
        if (-(0x21 ^ 0x25) >= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (short s2, byte by2, int n == null) {
        this.cfr_renamed_0(62);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(s2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            }
        catch (IOException iOException) {
            }
        this.cfr_renamed_1();
        GameCanvas.cfr_renamed_8();
    }

    public final void cfr_renamed_12(int n, int n2) {
        this.cfr_renamed_0(90);
        this.void_for(n);
        if (dh_0.boolean_do(n, 1)) {
            this.void_for(n2);
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_8(int n) {
        this.cfr_renamed_0(93);
        this.void_for(n);
        this.cfr_renamed_1();
    }
}

