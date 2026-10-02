/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import main.AngelChip;

public final class fn
extends bE {
    private static final int[] mangSoNguyen;
    private static fn var_fn_do;

    public final void (short s2 == null) {
        this.cfr_renamed_1(-38);
        this.void_if(s2);
        this.cfr_renamed_0();
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    public final void void_do(int n, int n2) {
        this.cfr_renamed_1(93);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (-"   ".length() >= 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void void_do() {
        this.cfr_renamed_1(85);
        this.cfr_renamed_0();
    }

    public final void (byte[] byArray == null) {
        this.cfr_renamed_1(84);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeBoolean(1);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(byArray.length);
            int n = 0;
            while (fn.boolean_do(n, byArray.length)) {
                this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(byArray[n]);
                ++n;
                if ("  ".length() == "  ".length()) continue;
                return;
            }
            }
        catch (Exception exception) {
            }
        if ((0x1C ^ 4 ^ (0x38 ^ 0x24)) <= " ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void (int n, boolean bl == null) {
        this.cfr_renamed_1(-19);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeBoolean(bl);
            }
        catch (IOException iOException) {
            }
        if ("   ".length() <= 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void void_if(int n, int n2) {
        this.cfr_renamed_1(59);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n2);
            }
        catch (IOException iOException) {
            }
        if (" ".length() == -" ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public static fn fn_do() {
        if ((var_fn_do == null)) {
            var_fn_do = new fn();
        }
        return var_fn_do;
    }

    public final void cfr_renamed_0(String string) {
        if (fn.boolean_do(AutoController.cfr_renamed_1(string) ? 1 : 0)) {
            return;
        }
        this.cfr_renamed_2(string);
    }

    public final void cfr_renamed_3(int n) {
        this.cfr_renamed_1(89);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(0);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            }
        catch (Exception exception) {
            }
        this.cfr_renamed_0();
    }

    static {
        fn.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[21];
        50 = 0x91 ^ 0xA5 ^ (0x94 ^ 0x92);
        54 = 0xB ^ 0x3D;
        10 = 0x1D ^ 0x17;
        77 = 28 + 13 - -125 + 37 ^ 113 + 74 - 99 + 46;
        55 = 0xF7 ^ 0x82 ^ (0x43 ^ 1);
        -21 = -(0x14 ^ 0x72 ^ (0x66 ^ 0x15));
        -19 = -(0x7E ^ 0x6D);
        58 = 0xFF ^ 0xA2 ^ (6 ^ 0x61);
        59 = 0xFF ^ 0xA2 ^ (0x21 ^ 0x47);
        -22 = -(0x3D ^ 0x2B);
        60 = 0x16 ^ 0x2A;
        -38 = -(68 + 66 - 67 + 75 ^ 13 + 78 - -74 + 3);
        84 = 0x14 ^ 0x40;
        1 = " ".length();
        0 = (0x18 ^ 0x40) & ~(0xEA ^ 0xB2);
        85 = 0x3E ^ 0x6B;
        -68 = -(0x17 ^ 0x53);
        -77 = -(0xA ^ 0x47);
        -78 = -(81 + 61 - 98 + 185 ^ 128 + 117 - 187 + 113);
        89 = 0x25 ^ 0x35 ^ (0x7B ^ 0x32);
        93 = 4 ^ 0x4F ^ (0x39 ^ 0x2F);
    }

    public final void cfr_renamed_0(byte by2) {
        this.cfr_renamed_1(60);
        this.void_for(by2);
        this.cfr_renamed_0();
    }

    public final void (int n, int n2, int n3, int n4 == null) {
        if (fn.boolean_do(go_0.go_0_do().boolean_do() ? 1 : 0)) {
            go_0.go_0_do().soXu = System.currentTimeMillis();
        }
        this.cfr_renamed_1(54);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n3);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n4);
            }
        catch (IOException iOException) {
            }
        if (-" ".length() > ((0xDC ^ 0x95) & ~(0x64 ^ 0x2D))) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void (int n, int n2, int n3 == null) {
        this.cfr_renamed_1(-78);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n3);
            }
        catch (Exception exception) {
            }
        if ("  ".length() > "  ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2(int n, int n2) {
        this.cfr_renamed_1(-68);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n2);
            }
        catch (Exception exception) {
            }
        if ((0xD7 ^ 0xAD ^ 35 + 98 - 9 + 3) <= 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2(String string) {
        if (fn.boolean_do(go_0.go_0_do().boolean_do() ? 1 : 0)) {
            go_0.go_0_do().soXu = System.currentTimeMillis();
        }
        if (fn.boolean_if(AngelChip.soLuong, 10)) {
            this.cfr_renamed_1(77);
            if (((2 ^ 0x3B) & ~(0x86 ^ 0xBF)) < ((0x30 ^ 0x13) & ~(0x4C ^ 0x6F))) {
                return;
            }
        } else {
            this.cfr_renamed_1(55);
        }
        this.cfr_renamed_1(string);
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_4(int n) {
        this.cfr_renamed_1(-21);
        this.void_do(n);
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_0(int n, int n2, int n3) {
        this.cfr_renamed_1(-77);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n3);
            }
        catch (Exception exception) {
            }
        if (((0x26 ^ 0x68) & ~(0x3E ^ 0x70)) < 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

    public final void cfr_renamed_3(int n, int n2) {
        if (fn.boolean_if(al_0.soLuong)) {
            GameCanvas.cfr_renamed_8();
        }
        this.cfr_renamed_1(50);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(fh.cfr_renamed_9);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(fh.var_int_try);
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if ("   ".length() < " ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2(int n, int n2, int n3) {
        this.cfr_renamed_1(58);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n3);
            }
        catch (IOException iOException) {
            }
        if ("  ".length() <= 0) {
            return;
        }
        this.cfr_renamed_0();
    }

        public final void cfr_renamed_5(int n) {
        this.cfr_renamed_1(-22);
        this.void_do(n);
        this.cfr_renamed_0();
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }
}

