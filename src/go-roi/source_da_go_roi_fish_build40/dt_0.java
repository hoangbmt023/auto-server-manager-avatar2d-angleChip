/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Vector;

/*
 * Renamed from dt
 */
public final class dt_0
extends bE {
    private static int[] mangSoNguyen;
    private static dt_0 var_dt_0_do;

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void (byte by2, byte by3 == null) {
        try {
            this.cfr_renamed_2(65);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by3);
            }
        catch (Exception exception) {
            }
        this.cfr_renamed_0();
    }

    public final void (byte by2, byte by3, String string == null) {
        this.cfr_renamed_1(8);
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by3);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if (" ".length() < 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public static dt_0 dt_0_do() {
        if ((var_dt_0_do == null)) {
            var_dt_0_do = new dt_0();
        }
        return var_dt_0_do;
    }

    public final void void_do() {
        try {
            this.cfr_renamed_2(24);
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if ("   ".length() < 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_3(int n) {
        try {
            this.cfr_renamed_2(19);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            }
        catch (IOException iOException) {
            }
        if (-" ".length() > 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_4(int n) {
        try {
            this.cfr_renamed_2(56);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n);
            }
        catch (Exception exception) {
            }
        if (((0x63 ^ 0x24 ^ 36 + 68 - -15 + 8) & (69 + 28 - -26 + 17 ^ 154 + 29 - 165 + 162 ^ -" ".length())) < ((84 + 16 - -24 + 115 ^ 137 + 118 - 140 + 50) & (0x32 ^ 7 ^ 78 + 79 - 99 + 69 ^ -" ".length()))) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2() {
        this.cfr_renamed_1(-18);
        this.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (int[] nArray == null) {
        try {
            this.cfr_renamed_2(67);
            int n = 0;
            if (-" ".length() >= "  ".length()) {
                return;
            }
            while (true) {
                if (dt_0.boolean_do(n, nArray.length)) {
                    break;
                }
                if ((nArray[n] != -1)) {
                    this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(nArray[n]);
                }
                ++n;
            }
        }
        catch (Exception exception) {
            }
        this.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (byte[] byArray == null) {
        block6: {
            try {
                this.cfr_renamed_2(21);
                this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(byArray.length);
                int n = 0;
                while (true) {
                    if (dt_0.boolean_do(n, byArray.length)) {
                        break;
                    }
                    this.var_bj_do.var_java_io_DataOutputStream_do.write(byArray[n]);
                    ++n;
                }
            }
            catch (Exception exception) {
                break block6;
            }
            if ("   ".length() == 0) {
                return;
            }
        }
        this.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (dC[] dCArray == null) {
        try {
            this.cfr_renamed_2(65);
            int n = -1;
            int n2 = 0;
            while (true) {
                if (dt_0.boolean_do(n2, 10)) {
                    break;
                }
                if (dt_0.boolean_do(dCArray[n2].var_byte_if)) {
                    if ((dCArray[n2].var_byte_if != n) && (n != -1)) {
                        this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(-1);
                    }
                    n = dCArray[n2].var_byte_if;
                    this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(dCArray[n2].var_byte_do);
                    } else if ((n != -1)) {
                    this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(-1);
                    n = -1;
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_0(byte by2) {
        try {
            this.cfr_renamed_2(21);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
            }
        catch (Exception exception) {
            }
        if ((126 + 80 - 204 + 129 ^ 17 + 20 - 4 + 101) <= 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_5(int n) {
        try {
            this.cfr_renamed_2(11);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            }
        catch (IOException iOException) {
            }
        if (-" ".length() > "   ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2(byte by2) {
        super.cfr_renamed_1(by2);
        this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(w_0.var_byte_for);
        this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(w_0.var_byte_int);
    }

    public final void cfr_renamed_0(String string) {
        try {
            this.cfr_renamed_2(9);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if ((0x3C ^ 0x38) <= -" ".length()) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_3() {
        this.cfr_renamed_1(28);
        this.cfr_renamed_0();
    }

        private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    public final void cfr_renamed_4() {
        try {
            this.cfr_renamed_2(49);
            }
        catch (Exception exception) {
            }
        if (-" ".length() > (0x5A ^ 0x5E)) {
            return;
        }
        this.cfr_renamed_0();
    }

    public final void void_do(int n, int n2) {
        try {
            this.cfr_renamed_2(21);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n2);
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if ("   ".length() <= ((0x61 ^ 0x64 ^ (7 ^ 0x16)) & (153 + 139 - 226 + 142 ^ 142 + 79 - 89 + 64 ^ -" ".length()))) {
            return;
        }
        this.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (gb_0[][] gb_0Array == null) {
        try {
            this.cfr_renamed_2(64);
            int n = 0;
            block2: while (true) {
                if (dt_0.boolean_do(n, 8)) {
                    break;
                }
                int n2 = 0;
                if ("  ".length() < 0) {
                    return;
                }
                while (true) {
                    if (dt_0.boolean_do(n2, 8)) {
                        ++n;
                        continue block2;
                    }
                    if (dt_0.boolean_do(gb_0Array[n][n2].dangChayAuto ? 1 : 0)) {
                        gb_0Array[n][n2].dangChayAuto = 0;
                        this.var_bj_do.var_java_io_DataOutputStream_do.writeByte((n << 3) + n2);
                    }
                    ++n2;
                }
                break;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_5() {
        this.cfr_renamed_1(6);
        this.cfr_renamed_0();
    }

    static {
        dt_0.cfr_renamed_7();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (Vector vector == null) {
        block6: {
            try {
                this.cfr_renamed_2(21);
                if (!dt_0.boolean_if(vector.size())) break block6;
                int n = 0;
                if ((0xCB ^ 0x84 ^ (0x72 ^ 0x39)) == " ".length()) {
                    return;
                }
                while (true) {
                    if (dt_0.boolean_do(n, vector.size())) {
                        break;
                    }
                    bK bK2 = (bK)vector.elementAt(n);
                    this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(bK2.cfr_renamed_0);
                    bK2.cfr_renamed_0 = 0;
                    ++n;
                }
            }
            catch (Exception exception) {
                break block6;
            }
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_2(String string) {
        try {
            this.cfr_renamed_2(18);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            }
        catch (IOException iOException) {
            }
        if ((55 + 0 - -38 + 67 ^ 31 + 118 - 70 + 85) <= 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    private static void cfr_renamed_7() {
        mangSoNguyen = new int[23];
        6 = 0xCB ^ 0xC3 ^ (0x44 ^ 0x4A);
        7 = 0x6F ^ 0x68;
        56 = 0x4E ^ 0x76;
        8 = 0x30 ^ 0x72 ^ (0x63 ^ 0x29);
        28 = 0x42 ^ 0x5E;
        -18 = -(" ".length() ^ (0x78 ^ 0x6B));
        21 = 0x48 ^ 0x5D;
        0 = "  ".length() & ("  ".length() ^ -" ".length());
        49 = 0x8E ^ 0xBF;
        64 = 0x10 ^ 0x50;
        65 = 114 + 9 - 34 + 38 ^ (0x75 ^ 0x4B);
        -1 = -" ".length();
        10 = 0x1D ^ 0x17;
        67 = 0xD0 ^ 0x93;
        68 = 3 ^ 0x47;
        5 = 9 ^ 0x49 ^ (0xCE ^ 0x8B);
        9 = 0xB ^ 0x3C ^ (0x1C ^ 0x22);
        16 = 0x94 ^ 0x8E ^ (0xB5 ^ 0xBF);
        19 = 0x94 ^ 0x87;
        18 = 90 + 74 - 18 + 7 ^ 45 + 8 - -28 + 58;
        11 = 0x8E ^ 0x85;
        3 = "   ".length();
        24 = 0x8C ^ 0xC3 ^ (0x40 ^ 0x17);
    }

        public final void cfr_renamed_3(byte by2) {
        this.cfr_renamed_1(7);
        this.void_for((int)by2);
        this.cfr_renamed_0();
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    public final void cfr_renamed_6() {
        try {
            this.cfr_renamed_2(49);
            }
        catch (Exception exception) {
            }
        if (((2 ^ 0x49 ^ (0x71 ^ 0x2A)) & (0x2D ^ 0x7C ^ (0xD1 ^ 0x90) ^ -" ".length())) != 0) {
            return;
        }
        this.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (int[] nArray, byte by2 == null) {
        block7: {
            try {
                this.cfr_renamed_2(64);
                int n = 0;
                if (" ".length() >= (0xBC ^ 0xB8)) {
                    return;
                }
                while (true) {
                    if (dt_0.boolean_do(n, nArray.length)) {
                        this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(by2);
                        break;
                    }
                    this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(nArray[n]);
                    ++n;
                }
            }
            catch (Exception exception) {
                break block7;
            }
            if (-"  ".length() >= 0) {
                return;
            }
        }
        this.cfr_renamed_0();
    }

    public final void (boolean bl == null) {
        try {
            this.cfr_renamed_2(16);
            this.var_bj_do.var_java_io_DataOutputStream_do.writeBoolean(bl);
            }
        catch (IOException iOException) {
            }
        if (" ".length() >= (0xC7 ^ 0xC3)) {
            return;
        }
        this.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void (int[] nArray, int n == null) {
        block8: {
            try {
                this.cfr_renamed_2(68);
                this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n);
                n = 0;
                if (-"  ".length() > 0) {
                    return;
                }
                while (true) {
                    if (dt_0.boolean_do(n, 5)) {
                        break;
                    }
                    if ((nArray[n] != -1)) {
                        this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(nArray[n]);
                        ++n;
                        continue;
                    }
                    break block8;
                    break;
                }
            }
            catch (Exception exception) {
                break block8;
            }
            if (" ".length() != " ".length()) {
                return;
            }
        }
        this.cfr_renamed_0();
    }
}

