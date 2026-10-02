/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import main.AngelChip;

/*
 * Renamed from db
 */
public final class db_0
extends ax_0 {
    private static db_0 var_db_0_do;
    private static int[] mangSoNguyen;

    public final void (aU aU2 == null) {
        System.out.println("doBuyItemHouse; " + aU2.cfr_renamed_1);
        this.cfr_renamed_0(-74);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(aU2.cfr_renamed_1);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(aU2.cfr_renamed_3 / 24);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(aU2.var_int_if / 24);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(aU2.cfr_renamed_12);
            }
        catch (IOException iOException) {
            }
        if ((139 + 170 - 215 + 97 ^ 186 + 125 - 210 + 86) == "  ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_4(int n) {
        this.cfr_renamed_0(-104);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[26];
        -11 = -(0x3F ^ 0 ^ (0x74 ^ 0x40));
        -14 = -(0xEE ^ 0x9A ^ (0xBE ^ 0xC4));
        -15 = -(0x3B ^ 0x34);
        -16 = -(0x2D ^ 0x3D);
        -37 = -(119 + 59 - 73 + 43 ^ 129 + 164 - 232 + 116);
        -40 = -(0x99 ^ 0xB4 ^ (0xC5 ^ 0xC0));
        -41 = -(0x17 ^ 0x3E);
        9 = 154 + 179 - 263 + 112 ^ 57 + 11 - 23 + 146;
        11 = 0x13 ^ 0x18;
        57 = 0x90 ^ 0xA9;
        -24 = -(0x86 ^ 0xB6 ^ (0xAB ^ 0x83));
        -46 = -(0x1B ^ 0x35);
        0 = (47 + 221 - 183 + 162 ^ 149 + 12 - 10 + 33) & (0x8D ^ 0x85 ^ (0x4A ^ 0xD) ^ -" ".length());
        -74 = -(135 + 137 - 157 + 101 ^ 145 + 125 - 263 + 139);
        24 = 0x1E ^ 6;
        -65 = -(0x56 ^ 0x17);
        -66 = -(0x11 ^ 0x53);
        -67 = -(0x22 ^ 0x76 ^ (0xD0 ^ 0xC7));
        -69 = -(0x58 ^ 0x1D);
        -70 = -(86 + 40 - 38 + 113 ^ 60 + 110 - 117 + 90);
        -71 = -(0x79 ^ 0x3E);
        -75 = -(243 + 101 - 324 + 234 ^ 156 + 98 - 121 + 48);
        1 = " ".length();
        -80 = -(226 + 96 - 102 + 11 ^ 34 + 70 - -54 + 25);
        -84 = -(0x3A ^ 0x5F ^ (0x46 ^ 0x77));
        -104 = -(0xC4 ^ 0xAC);
    }

    public final void cfr_renamed_1(aU aU2) {
        this.cfr_renamed_0(-66);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(aU2.cfr_renamed_1);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(aU2.cfr_renamed_3 / 24);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(aU2.var_int_if / 24);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(aU2.var_byte_do);
            }
        catch (Exception exception) {
            }
        if ("   ".length() <= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

        public final void (String string, int n, int n2 == null) {
        block3: {
            this.cfr_renamed_0(-75);
            try {
                this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
                this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
                if (!(n2 == 1)) break block3;
                this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
                }
            catch (IOException iOException) {
                }
            if ((0xC7 ^ 0xC3) < (0 ^ 4)) {
                return;
            }
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_5(int n) {
        this.cfr_renamed_0(-69);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_2(int n) {
        this.cfr_renamed_0(-70);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_15(int n) {
        this.cfr_renamed_0(-67);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    public final void void_do() {
        this.cfr_renamed_0(-40);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3() {
        this.cfr_renamed_0(-41);
        this.cfr_renamed_1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (short[] sArray, int n == null) {
        block7: {
            this.cfr_renamed_0(-46);
            try {
                this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n);
                this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(sArray.length);
                n = 0;
                if ("  ".length() >= "   ".length()) {
                    return;
                }
                while (true) {
                    if (db_0.boolean_do(n, sArray.length)) {
                        this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(0);
                        break;
                    }
                    this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(sArray[n]);
                    ++n;
                }
            }
            catch (Exception exception) {
                break block7;
            }
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        this.cfr_renamed_1();
    }

    public final void (short s2 == null) {
        this.cfr_renamed_0(-80);
        this.void_if((int)s2);
        this.cfr_renamed_1();
    }

    public final void (int n, int n2, int n3, int n4, int n5, int n6 == null) {
        this.cfr_renamed_0(-71);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n3);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n4);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n5);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n6);
            }
        catch (IOException iOException) {
            }
        if (-" ".length() > 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_4() {
        this.cfr_renamed_0(-37);
        this.cfr_renamed_1();
        GameCanvas.cfr_renamed_4(MenuChinhAvatar.co);
    }

    public final void void_do(int n, int n2) {
        this.cfr_renamed_0(-24);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (Exception exception) {
            }
        if (-" ".length() >= "   ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public static db_0 db_0_do() {
        if ((var_db_0_do == null)) {
            var_db_0_do = new db_0();
        }
        return var_db_0_do;
    }

    public final void cfr_renamed_8(int n) {
        GameCanvas.cfr_renamed_5();
        this.cfr_renamed_0(-65);
        this.void_do(n);
        this.cfr_renamed_1();
    }

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

        public final void cfr_renamed_1(short s2) {
        this.cfr_renamed_0(-84);
        this.void_for((int)s2);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_12(int n) {
        if ((AngelChip.var_int_if != 9) && (AngelChip.var_int_if != 11)) {
            return;
        }
        this.cfr_renamed_0(57);
        this.void_for(n);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_5() {
        this.cfr_renamed_0(-16);
        this.cfr_renamed_1();
        GameCanvas.cfr_renamed_4(MenuChinhAvatar.co);
    }

    public final void cfr_renamed_2() {
        this.cfr_renamed_0(-15);
        this.cfr_renamed_1();
        GameCanvas.cfr_renamed_4(MenuChinhAvatar.co);
    }

        static {
        db_0.cfr_renamed_8();
    }

    public final void cfr_renamed_3(short s2) {
        this.cfr_renamed_0(-14);
        this.void_if((int)s2);
        this.cfr_renamed_1();
        GameCanvas.cfr_renamed_4(MenuChinhAvatar.co);
    }

    public final void cfr_renamed_15() {
        this.cfr_renamed_0(-11);
        this.void_do(ThongTinNhanVat.var_int_if);
        this.cfr_renamed_1();
    }
}

