/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Vector;

/*
 * Renamed from cD
 */
public final class cd_0
extends ax_0 {
    private static cd_0 var_cd_0_do;
    private static int[] mangSoNguyen;

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[23];
        6 = (0x27 ^ 0x1E) & ~(0xFB ^ 0xC2) ^ (0x4C ^ 0x4A);
        7 = 0x33 ^ 0x6A ^ (0x68 ^ 0x36);
        56 = 0x98 ^ 0xA0;
        8 = 0x4B ^ 0x5C ^ (0x23 ^ 0x3C);
        28 = 0x5C ^ 0x40;
        -18 = -(3 + 127 - 125 + 127 ^ 126 + 71 - 123 + 76);
        21 = 35 + 131 - 108 + 84 ^ 48 + 20 - -84 + 3;
        0 = (0x88 ^ 0x82 ^ (0xC9 ^ 0x9A)) & (0x81 ^ 0xB7 ^ (0x1B ^ 0x74) ^ -" ".length());
        49 = 0xBD ^ 0x8C;
        64 = 0x82 ^ 0xC2;
        65 = 51 + 7 - -5 + 65 ^ 0 + 175 - -16 + 2;
        -1 = -" ".length();
        10 = 0x13 ^ 0x19;
        67 = 0xA8 ^ 0x92 ^ (0x76 ^ 0xF);
        68 = 0xD7 ^ 0xBB ^ (0xD ^ 0x25);
        5 = 0x19 ^ 0x1C;
        9 = 0xAB ^ 0xA2;
        16 = 203 + 120 - 308 + 197 ^ 128 + 184 - 242 + 126;
        19 = 0x50 ^ 0x43;
        18 = 0x37 ^ 0x5F ^ (0x51 ^ 0x2B);
        11 = 0x87 ^ 0x8C;
        3 = "   ".length();
        24 = 0x5A ^ 0x42;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (fb[] fbArray == null) {
        block12: {
            try {
                this.cfr_renamed_4(65);
                int n = -1;
                int n2 = 0;
                if ("  ".length() <= 0) {
                    return;
                }
                while (true) {
                    if (cd_0.boolean_do(n2, 10)) {
                        break;
                    }
                    if (cd_0.boolean_if(fbArray[n2].var_byte_do)) {
                        if ((fbArray[n2].var_byte_do != n) && (n != -1)) {
                            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(-1);
                        }
                        n = fbArray[n2].var_byte_do;
                        this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(fbArray[n2].var_byte_if);
                        if ((0x5D ^ 0x59) == -" ".length()) {
                            return;
                        }
                    } else if ((n != -1)) {
                        this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(-1);
                        n = -1;
                    }
                    ++n2;
                }
            }
            catch (Exception exception) {
                break block12;
            }
            if ((0x50 ^ 0x54) <= -" ".length()) {
                return;
            }
        }
        this.cfr_renamed_1();
    }

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (int[] nArray, int n == null) {
        try {
            this.cfr_renamed_4(68);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            n = 0;
            if ("  ".length() > (0x4E ^ 0x4A)) {
                return;
            }
            while (true) {
                if (cd_0.boolean_do(n, 5)) {
                    } else if ((nArray[n] != -1)) {
                    this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(nArray[n]);
                    ++n;
                    continue;
                }
                break;
            }
        }
        catch (Exception exception) {
            }
        this.cfr_renamed_1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (fa[][] faArray == null) {
        block10: {
            try {
                this.cfr_renamed_4(64);
                int n = 0;
                block2: while (true) {
                    if (cd_0.boolean_do(n, 8)) {
                        break;
                    }
                    int n2 = 0;
                    if (" ".length() <= 0) {
                        return;
                    }
                    while (true) {
                        if (cd_0.boolean_do(n2, 8)) {
                            ++n;
                            continue block2;
                        }
                        if (cd_0.boolean_if(faArray[n][n2].dangChayAuto ? 1 : 0)) {
                            faArray[n][n2].dangChayAuto = 0;
                            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte((n << 3) + n2);
                        }
                        ++n2;
                    }
                    break;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                break block10;
            }
            if ("  ".length() < 0) {
                return;
            }
        }
        this.cfr_renamed_1();
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

    public final void cfr_renamed_1(String string) {
        try {
            this.cfr_renamed_4(9);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if (" ".length() < 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (boolean bl == null) {
        try {
            this.cfr_renamed_4(16);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeBoolean(bl);
            }
        catch (IOException iOException) {
            }
        if ("   ".length() >= (0x6C ^ 0x44 ^ (0xE ^ 0x22))) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void void_do() {
        try {
            this.cfr_renamed_4(49);
            }
        catch (Exception exception) {
            }
        this.cfr_renamed_1();
    }

    static {
        cd_0.cfr_renamed_8();
    }

    public final void cfr_renamed_1(byte by2) {
        this.cfr_renamed_0(7);
        this.void_for((int)by2);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_4(int n) {
        try {
            this.cfr_renamed_4(56);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            }
        catch (Exception exception) {
            }
        if (-" ".length() > 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3() {
        this.cfr_renamed_0(6);
        this.cfr_renamed_1();
    }

    public static cd_0 cd_0_do() {
        if ((var_cd_0_do == null)) {
            var_cd_0_do = new cd_0();
        }
        return var_cd_0_do;
    }

    public final void cfr_renamed_3(String string) {
        try {
            this.cfr_renamed_4(18);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if (((78 + 170 - 133 + 96 ^ 156 + 7 - 88 + 121) & (0x7A ^ 0x7E ^ (0x26 ^ 0x35) ^ -" ".length())) < 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_4() {
        this.cfr_renamed_0(28);
        this.cfr_renamed_1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (byte[] byArray == null) {
        block6: {
            try {
                this.cfr_renamed_4(21);
                this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(byArray.length);
                int n = 0;
                while (true) {
                    if (cd_0.boolean_do(n, byArray.length)) {
                        break;
                    }
                    this.var_ad_0_do.var_java_io_DataOutputStream_do.write(byArray[n]);
                    ++n;
                }
            }
            catch (Exception exception) {
                break block6;
            }
            if ("  ".length() == 0) {
                return;
            }
        }
        this.cfr_renamed_1();
    }

        public final void cfr_renamed_5() {
        try {
            this.cfr_renamed_4(49);
            }
        catch (Exception exception) {
            }
        if (((0x6B ^ 0x65 ^ (0x65 ^ 0x32)) & (0x7E ^ 0x2C ^ (0x40 ^ 0x4B) ^ -" ".length())) != 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void void_do(int n, int n2) {
        try {
            this.cfr_renamed_4(21);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.cfr_renamed_1();
    }

    public final void (byte by2, byte by3, String string == null) {
        this.cfr_renamed_0(8);
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by3);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if ("   ".length() <= 0) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_3(byte by2) {
        try {
            this.cfr_renamed_4(21);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            }
        catch (Exception exception) {
            }
        if (-" ".length() > "   ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (Vector vector == null) {
        block5: {
            try {
                this.cfr_renamed_4(21);
                if (!cd_0.boolean_do(vector.size())) break block5;
                int n = 0;
                while (true) {
                    if (cd_0.boolean_do(n, vector.size())) {
                        break;
                    }
                    bd bd2 = (bd)vector.elementAt(n);
                    this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(bd2.cfr_renamed_3);
                    bd2.cfr_renamed_3 = 0;
                    ++n;
                }
            }
            catch (Exception exception) {
                break block5;
            }
            if ("  ".length() == 0) {
                return;
            }
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_5(int n) {
        try {
            this.cfr_renamed_4(11);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            }
        catch (IOException iOException) {
            }
        if ((0xA5 ^ 0xA1) < "   ".length()) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void (byte by2, byte by3 == null) {
        try {
            this.cfr_renamed_4(65);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by3);
            }
        catch (Exception exception) {
            }
        if (" ".length() == (0x43 ^ 0x47)) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_2(int n) {
        try {
            this.cfr_renamed_4(19);
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            }
        catch (IOException iOException) {
            }
        if ((0x8A ^ 0x8E) < (0xBE ^ 0xBA)) {
            return;
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_2() {
        this.cfr_renamed_0(-18);
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_4(byte by2) {
        super.cfr_renamed_0(by2);
        this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(a_0.var_byte_for);
        this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(a_0.var_byte_int);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (int[] nArray == null) {
        block8: {
            try {
                this.cfr_renamed_4(67);
                int n = 0;
                if (" ".length() < " ".length()) {
                    return;
                }
                while (true) {
                    if (cd_0.boolean_do(n, nArray.length)) {
                        break;
                    }
                    if ((nArray[n] != -1)) {
                        this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(nArray[n]);
                    }
                    ++n;
                }
            }
            catch (Exception exception) {
                break block8;
            }
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        this.cfr_renamed_1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (int[] nArray, byte by2 == null) {
        block7: {
            try {
                this.cfr_renamed_4(64);
                int n = 0;
                if (-"   ".length() > 0) {
                    return;
                }
                while (true) {
                    if (cd_0.boolean_do(n, nArray.length)) {
                        this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(by2);
                        break;
                    }
                    this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(nArray[n]);
                    ++n;
                }
            }
            catch (Exception exception) {
                break block7;
            }
            if (((0xCF ^ 0xB2 ^ (3 ^ 0x7A)) & (152 + 38 - 176 + 158 ^ 142 + 135 - 233 + 124 ^ -" ".length())) > "   ".length()) {
                return;
            }
        }
        this.cfr_renamed_1();
    }

    public final void cfr_renamed_15() {
        try {
            this.cfr_renamed_4(24);
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.cfr_renamed_1();
    }
}

