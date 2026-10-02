/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from eY
 */
public final class ey_0 {
    private static int this;
    public static int soLuong;
    public int var_int_if;
    public static int soLuongKhoa;
    public String chuoiGiaTri = "";
    public int var_int_int;
    private static String chuoiPhu;
    private String var_java_lang_String_int = "";
    private String var_java_lang_String_new = "";
    private static int cfr_renamed_12;
    private static int[][] var_int_arr_arr_do;
    public static boolean dangChayAuto;
    public int var_int_new;
    private int cfr_renamed_15;
    public static int cfr_renamed_5;
    private static String[] var_java_lang_String_arr_if;
    private boolean coKichHoat;
    private int cfr_renamed_21;
    public int cfr_renamed_6;
    public int cfr_renamed_7;
    private long soXu = 0L;
    private static int[] mangSoNguyen;
    public int cfr_renamed_8;
    private static int cfr_renamed_10;
    public int cfr_renamed_13;
    public int cfr_renamed_9;
    private boolean var_boolean_int;
    private static String[] var_java_lang_String_arr_for;
    public String tenNhanVat = "";
    private static Canvas var_javax_microedition_lcdui_Canvas_do;
    private int cfr_renamed_18;
    private fl_0 var_fl_0_do;
    public static cu_0 var_cu_0_do;
    private static int[] var_int_arr_if;
    private static int cfr_renamed_30;
    private int cfr_renamed_20;
    public static de var_de_do;
    private static String[] var_java_lang_String_arr_int;
    public static final String[] var_java_lang_String_arr_do;
    private int cfr_renamed_16;
    private int cfr_renamed_23;
    public int cfr_renamed_14;
    public boolean coTrangThai = 1;

    private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void void_do() {
        if (ey_0.boolean_int(this.cfr_renamed_13) && ey_0.boolean_int(this.var_java_lang_String_new.length())) {
            this.var_java_lang_String_new = String.valueOf(this.var_java_lang_String_new.substring(0, this.cfr_renamed_13 - 1)) + this.var_java_lang_String_new.substring(this.cfr_renamed_13, this.var_java_lang_String_new.length());
            this.cfr_renamed_13 -= 1;
            this.void_for(0);
            this.cfr_renamed_4();
        }
    }

    public static void cfr_renamed_0() {
        if ((soLuongKhoa += 1 > 3)) {
            soLuongKhoa = 0;
        }
        ey_0.cfr_renamed_10 = cfr_renamed_30;
        cfr_renamed_5 = GameCanvas.int_do();
    }

        /*
     * Unable to fully structure code
     */
    private void cfr_renamed_4() {
        block2: {
            if (!(this.cfr_renamed_18 == 2)) break block2;
            this.var_java_lang_String_int = "";
            var1_1 = 0;
            if (" ".length() >= 0) ** GOTO lbl10
            return;
lbl-1000:
            // 1 sources

            {
                this.var_java_lang_String_int = String.valueOf(this.var_java_lang_String_int) + "*";
                ++var1_1;
lbl10:
                // 2 sources

                ** while (!ey_0.cfr_renamed_5((int)var1_1, (int)this.var_java_lang_String_new.length()))
            }
lbl11:
            // 1 sources

            if (ey_0.boolean_int(this.cfr_renamed_6) && ey_0.boolean_int(this.cfr_renamed_13)) {
                this.var_java_lang_String_int = String.valueOf(this.var_java_lang_String_int.substring(0, this.cfr_renamed_13 - 1)) + this.var_java_lang_String_new.charAt(this.cfr_renamed_13 - 1) + this.var_java_lang_String_int.substring(this.cfr_renamed_13, this.var_java_lang_String_int.length());
            }
        }
    }

    static {
        ey_0.cfr_renamed_6();
        this = 1;
        int[] nArray = new int[7];
        nArray[0] = 18;
        nArray[1] = 14;
        nArray[2] = 11;
        nArray[3] = 9;
        nArray[4] = 6;
        nArray[5] = 4;
        nArray[6] = 2;
        var_int_arr_if = nArray;
        soLuong = 0;
        String[] stringArray = new String[12];
        stringArray[0] = " 0";
        stringArray[1] = ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1";
        stringArray[2] = "abc2âă";
        stringArray[3] = "def3đê";
        stringArray[4] = "ghi4";
        stringArray[5] = "jkl5";
        stringArray[6] = "mno6ôơ";
        stringArray[7] = "pqrs7";
        stringArray[8] = "tuv8ư";
        stringArray[9] = "wxyz9";
        stringArray[10] = "*";
        stringArray[11] = "#";
        var_java_lang_String_arr_for = stringArray;
        String[] stringArray2 = new String[12];
        stringArray2[0] = "0";
        stringArray2[1] = "1";
        stringArray2[2] = "abc2";
        stringArray2[3] = "def3";
        stringArray2[4] = "ghi4";
        stringArray2[5] = "jkl5";
        stringArray2[6] = "mno6";
        stringArray2[7] = "pqrs7";
        stringArray2[8] = "tuv8";
        stringArray2[9] = "wxyz9";
        stringArray2[10] = "0";
        stringArray2[11] = "0";
        var_java_lang_String_arr_int = stringArray2;
        String[] stringArray3 = new String[17];
        stringArray3[0] = " 0";
        stringArray3[1] = "er1";
        stringArray3[2] = "ty2";
        stringArray3[3] = "ui3";
        stringArray3[4] = "df4";
        stringArray3[5] = "gh5";
        stringArray3[6] = "jk6";
        stringArray3[7] = "cv7";
        stringArray3[8] = "bn8";
        stringArray3[9] = "m9";
        stringArray3[10] = "0";
        stringArray3[11] = "0";
        stringArray3[12] = "qw!";
        stringArray3[13] = "as?";
        stringArray3[14] = "zx";
        stringArray3[15] = "op.";
        stringArray3[16] = "l,";
        var_java_lang_String_arr_if = stringArray3;
        ey_0.cfr_renamed_10 = -1984;
        soLuongKhoa = 0;
        String[] stringArray4 = new String[4];
        stringArray4[0] = "abc";
        stringArray4[1] = "Abc";
        stringArray4[2] = "ABC";
        stringArray4[3] = "123";
        var_java_lang_String_arr_do = stringArray4;
        cfr_renamed_30 = 11;
        chuoiPhu = "aáàảãạâấầẩẫậăắằẳẵặeéèẻẽẹêếềểễệiíìỉĩịoóòỏõọôốồổỗộơớờởỡợuúùủũụưứừửữựyýỳỷỹỵ";
        int[][] nArrayArray = new int[17][];
        int[] nArray2 = new int[2];
        nArray2[0] = 32;
        nArray2[1] = 48;
        nArrayArray[0] = nArray2;
        int[] nArray3 = new int[2];
        nArray3[0] = 49;
        nArray3[1] = 69;
        nArrayArray[1] = nArray3;
        int[] nArray4 = new int[2];
        nArray4[0] = 50;
        nArray4[1] = 84;
        nArrayArray[2] = nArray4;
        int[] nArray5 = new int[2];
        nArray5[0] = 51;
        nArray5[1] = 85;
        nArrayArray[3] = nArray5;
        int[] nArray6 = new int[2];
        nArray6[0] = 52;
        nArray6[1] = 68;
        nArrayArray[4] = nArray6;
        int[] nArray7 = new int[2];
        nArray7[0] = 53;
        nArray7[1] = 71;
        nArrayArray[5] = nArray7;
        int[] nArray8 = new int[2];
        nArray8[0] = 54;
        nArray8[1] = 74;
        nArrayArray[6] = nArray8;
        int[] nArray9 = new int[2];
        nArray9[0] = 55;
        nArray9[1] = 67;
        nArrayArray[7] = nArray9;
        int[] nArray10 = new int[2];
        nArray10[0] = 56;
        nArray10[1] = 66;
        nArrayArray[8] = nArray10;
        int[] nArray11 = new int[2];
        nArray11[0] = 57;
        nArray11[1] = 77;
        nArrayArray[9] = nArray11;
        int[] nArray12 = new int[2];
        nArray12[0] = 42;
        nArray12[1] = 128;
        nArrayArray[10] = nArray12;
        int[] nArray13 = new int[2];
        nArray13[0] = 35;
        nArray13[1] = 137;
        nArrayArray[11] = nArray13;
        int[] nArray14 = new int[2];
        nArray14[0] = 33;
        nArray14[1] = 113;
        nArrayArray[12] = nArray14;
        int[] nArray15 = new int[2];
        nArray15[0] = 63;
        nArray15[1] = 97;
        nArrayArray[13] = nArray15;
        int[] nArray16 = new int[3];
        nArray16[0] = 64;
        nArray16[1] = 121;
        nArray16[2] = 122;
        nArrayArray[14] = nArray16;
        int[] nArray17 = new int[2];
        nArray17[0] = 46;
        nArray17[1] = 111;
        nArrayArray[15] = nArray17;
        int[] nArray18 = new int[2];
        nArray18[0] = 44;
        nArray18[1] = 108;
        nArrayArray[16] = nArray18;
        var_int_arr_arr_do = nArrayArray;
    }

    public static void (boolean bl == null) {
        dangChayAuto = bl;
        GameCanvas.var_fz_0_if.cfr_renamed_1("ABC");
        }

    private static boolean boolean_if(int n) {
        return n <= 0;
    }

    static boolean (ey_0 ey_02 == null) {
        return ey_02.var_boolean_int;
    }

    public final boolean boolean_do() {
        return this.var_boolean_int;
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_5() {
        block4: {
            this.soXu = System.currentTimeMillis() / 100L;
            if (!(this.cfr_renamed_16 == -1)) break block4;
            var1_1 = this.cfr_renamed_13;
            if (" ".length() <= "  ".length()) ** GOTO lbl23
            return;
lbl-1000:
            // 1 sources

            {
                var2_3 = this.var_java_lang_String_new.charAt(var1_1 - 1);
                var3_5 = 0;
                if (-" ".length() == -" ".length()) ** GOTO lbl21
                return;
lbl-1000:
                // 1 sources

                {
                    var4_7 = ey_0.chuoiPhu.charAt(var3_5);
                    if ((var2_3 == var4_7)) {
                        this.cfr_renamed_15 = var3_5;
                        this.cfr_renamed_20 = 0;
                        this.cfr_renamed_16 = var1_1 - 1;
                        return;
                    }
                    ++var3_5;
lbl21:
                    // 2 sources

                    ** while (!ey_0.cfr_renamed_5((int)var3_5, (int)ey_0.chuoiPhu.length()))
                }
lbl22:
                // 1 sources

                --var1_1;
lbl23:
                // 2 sources

                ** while (!ey_0.boolean_if((int)var1_1))
            }
lbl24:
            // 1 sources

            this.cfr_renamed_16 = -1;
            return;
        }
        this.cfr_renamed_20 += 1;
        if ((this.cfr_renamed_20 >= 6)) {
            this.cfr_renamed_20 = 0;
        }
        var1_2 = this.var_java_lang_String_new.substring(0, this.cfr_renamed_16);
        var2_4 = this.var_java_lang_String_new.substring(this.cfr_renamed_16 + 1);
        var3_6 = ey_0.chuoiPhu.substring(this.cfr_renamed_15 + this.cfr_renamed_20, this.cfr_renamed_15 + this.cfr_renamed_20 + 1);
        this.var_java_lang_String_new = String.valueOf(var1_2) + var3_6 + var2_4;
    }

    public final void (String string == null) {
        if ((string == null)) {
            return;
        }
        ey_0.cfr_renamed_10 = -1984;
        this.cfr_renamed_6 = 0;
        this.cfr_renamed_21 = 0;
        this.var_java_lang_String_new = string;
        this.tenNhanVat = string;
        this.cfr_renamed_4();
        this.cfr_renamed_13 = string.length();
        this.void_for(0);
    }

    private void void_for(int n) {
        if ((this.cfr_renamed_18 == 2)) {
            this.tenNhanVat = this.var_java_lang_String_int;
            if ("  ".length() >= "   ".length()) {
                return;
            }
        } else {
            this.tenNhanVat = this.var_java_lang_String_new;
        }
        int n2 = GameCanvas.var_fz_0_if.cfr_renamed_1(this.tenNhanVat.substring(0, this.cfr_renamed_13));
        if ((n == -1)) {
            if ((n2 + this.cfr_renamed_7 < 15) && ey_0.boolean_int(this.cfr_renamed_13) && (this.cfr_renamed_13 < this.tenNhanVat.length())) {
                this.cfr_renamed_7 += GameCanvas.var_fz_0_if.cfr_renamed_1(this.tenNhanVat.substring(this.cfr_renamed_13, this.cfr_renamed_13 + 1));
                }
        } else if ((n == 1)) {
            if ((n2 + this.cfr_renamed_7 > this.cfr_renamed_9 - 25) && (this.cfr_renamed_13 < this.tenNhanVat.length()) && ey_0.boolean_int(this.cfr_renamed_13)) {
                this.cfr_renamed_7 -= GameCanvas.var_fz_0_if.cfr_renamed_1(this.tenNhanVat.substring(this.cfr_renamed_13 - 1, this.cfr_renamed_13));
                if ("   ".length() == "  ".length()) {
                    return;
                }
            }
        } else {
            this.cfr_renamed_7 = -(n2 - (this.cfr_renamed_9 - 12));
        }
        if (ey_0.boolean_int(this.cfr_renamed_7)) {
            this.cfr_renamed_7 = 0;
            return;
        }
        if ((this.cfr_renamed_7 < 0) && ey_0.cfr_renamed_3(this.cfr_renamed_7, -(n = GameCanvas.var_fz_0_if.cfr_renamed_1(this.tenNhanVat) - (this.cfr_renamed_9 - 12)))) {
            this.cfr_renamed_7 = -n;
        }
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

        private static boolean boolean_int(int n) {
        return n > 0;
    }

    private static void cfr_renamed_6() {
        mangSoNguyen = new int[71];
        1 = " ".length();
        7 = 0x7B ^ 0x2B ^ (0xD9 ^ 0x8E);
        0 = (0x5F ^ 0x77 ^ (0xE3 ^ 0x97)) & (0xA8 ^ 0xAD ^ (0x7B ^ 0x22) ^ -" ".length());
        18 = 0xC0 ^ 0xA8 ^ (0x72 ^ 8);
        14 = 0xC9 ^ 0xC7;
        2 = "  ".length();
        11 = 0x53 ^ 0x58;
        3 = "   ".length();
        9 = 0x4A ^ 0x68 ^ (0x83 ^ 0xA8);
        4 = 82 + 83 - 114 + 134 ^ 165 + 149 - 223 + 98;
        6 = 0x61 ^ 0x5E ^ (0xFF ^ 0xC6);
        5 = 0x6F ^ 0x6A;
        12 = 0x51 ^ 0x5D;
        8 = " ".length() ^ (0x21 ^ 0x28);
        10 = 0x6E ^ 0x3A ^ (0x5F ^ 1);
        17 = 0xD3 ^ 0xC2;
        13 = 0x58 ^ 0x69 ^ (1 ^ 0x3D);
        15 = 138 + 56 - 34 + 26 ^ 131 + 149 - 205 + 106;
        16 = 0x9D ^ 0x8D;
        -1984 = -(-(0xFFFFFCEB & 0x7B3C) & (0xFFFFFFFF & 0x7FE7));
        32 = 0xB0 ^ 0x90;
        48 = 167 + 155 - 202 + 50 ^ 49 + 151 - 125 + 79;
        49 = 0xB6 ^ 0x87;
        69 = 163 + 37 - 171 + 183 ^ 74 + 132 - 70 + 9;
        50 = 0x6A ^ 0x58;
        84 = 0xC1 ^ 0x95;
        51 = 103 + 90 - 94 + 39 ^ 6 + 151 - 30 + 58;
        85 = 0x52 ^ 7;
        52 = 61 + 119 - 130 + 194 ^ 190 + 27 - 139 + 114;
        68 = 0x1F ^ 0x5B;
        53 = 15 + 85 - -31 + 0 ^ 144 + 49 - 184 + 173;
        71 = 71 + 175 - 70 + 27 ^ 15 + 30 - -7 + 88;
        54 = 63 + 63 - 77 + 110 ^ 114 + 82 - 176 + 149;
        74 = 0xD1 ^ 0xC3 ^ (0x68 ^ 0x30);
        55 = 0xE3 ^ 0xBC ^ (0x64 ^ 0xC);
        67 = 48 + 61 - 27 + 138 ^ 77 + 90 - 84 + 76;
        56 = 0x50 ^ 0x14 ^ (0x1E ^ 0x62);
        66 = 0x5F ^ 0x60 ^ (0x29 ^ 0x54);
        57 = 0x89 ^ 0xB0;
        77 = 0x5A ^ 0x56 ^ (0x6E ^ 0x2F);
        42 = 0xD ^ 0x27;
        128 = 102 + 33 - 75 + 68;
        35 = 196 + 176 - 266 + 122 ^ 27 + 164 - 30 + 38;
        137 = 65 + 99 - 159 + 132;
        33 = 0xA7 ^ 0x94 ^ (0x72 ^ 0x60);
        113 = 0x3D ^ 0x6E ^ (0x97 ^ 0xB5);
        63 = 0x8D ^ 0xB2;
        97 = 0x4C ^ 0x3F ^ (0xB2 ^ 0xA0);
        64 = 0xB4 ^ 0x86 ^ (0x6C ^ 0x1E);
        121 = 242 + 180 - 320 + 149 ^ 69 + 77 - 56 + 40;
        122 = 0x5A ^ 0x20;
        46 = 0xAE ^ 0x80;
        111 = 0x1E ^ 0x71;
        44 = 0x73 ^ 0x34 ^ (0x7E ^ 0x15);
        108 = 0x2B ^ 0x37 ^ (0xE5 ^ 0x95);
        500 = 0xFFFFADFF & 0x53F4;
        -1 = -" ".length();
        25 = 0x93 ^ 0xA0 ^ (0xB5 ^ 0x9F);
        65 = 0x2D ^ 0xD ^ (0xC3 ^ 0xA2);
        90 = 221 + 26 - 82 + 68 ^ 125 + 116 - 83 + 21;
        127 = 53 + 111 - 150 + 113;
        -8 = -(0x7E ^ 0x25 ^ (0x1C ^ 0x4F));
        204 = (0x9A ^ 0xAF) + (0x11 ^ 0x15) - -(24 + 70 - 59 + 105) + (5 ^ 2);
        45 = 6 + 30 - -82 + 11 ^ 14 + 137 - 87 + 108;
        95 = 0xD ^ 0x30 ^ (0xF4 ^ 0x96);
        58 = 0x70 ^ 0x1F ^ (0x10 ^ 0x45);
        59 = 0x18 ^ 0x23;
        19 = 0x2F ^ 0x6B ^ (0x18 ^ 0x4F);
        20 = 0x18 ^ 0xC;
        7829367 = -(0xFFFFF8DF & 0xFA9) & (0xFFFFFFFF & 0x777FFF);
        40 = 0x7A ^ 0x52;
    }

            public final void void_do(int n) {
        this.cfr_renamed_18 = n;
    }

    private void void_int(int n) {
        if (!((this.cfr_renamed_18 != 2) && !(this.cfr_renamed_18 == 3) || (n >= 48) && !(n > 57) || (n >= 65) && !(n > 90) || (n >= 97) && !(n > 122))) {
            return;
        }
        if ((this.var_java_lang_String_new.length() < this.cfr_renamed_23)) {
            String string = String.valueOf(this.var_java_lang_String_new.substring(0, this.cfr_renamed_13)) + (char)n;
            if ((this.cfr_renamed_13 < this.var_java_lang_String_new.length())) {
                string = String.valueOf(string) + this.var_java_lang_String_new.substring(this.cfr_renamed_13, this.var_java_lang_String_new.length());
            }
            this.var_java_lang_String_new = string;
            this.cfr_renamed_13 += 1;
            this.cfr_renamed_4();
            this.void_for(0);
        }
    }

    public final fl_0 fl_0_do() {
        var_de_do = this.var_fl_0_do.var_de_do;
        if (ey_0.boolean_new(GameCanvas.cfr_renamed_12)) {
            return this.var_fl_0_do;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void void_new(int var1_1) {
        block41: {
            block43: {
                block42: {
                    block40: {
                        if (ey_0.boolean_for(this.cfr_renamed_18) && (this.cfr_renamed_18 != 2) && !(this.cfr_renamed_18 == 3)) break block41;
                        var2_3 = var1_1;
                        var1_2 = this;
                        if (ey_0.boolean_for((int)GameCanvas.dangChayAuto)) {
                            var3_4 /* !! */  = ey_0.var_java_lang_String_arr_if;
                            if (((188 ^ 130 ^ (98 ^ 28)) & (5 + 126 - 56 + 57 ^ 89 + 47 - 94 + 154 ^ -" ".length())) >= "   ".length()) {
                                return;
                            }
                        } else if (!(var1_2.cfr_renamed_18 != 2) || (var1_2.cfr_renamed_18 == 3)) {
                            var3_4 /* !! */  = ey_0.var_java_lang_String_arr_int;
                            } else {
                            var3_4 /* !! */  = ey_0.var_java_lang_String_arr_for;
                        }
                        if (!ey_0.boolean_for((int)GameCanvas.dangChayAuto)) break block42;
                        var4_5 = 0;
                        if (((190 ^ 167) & ~(110 ^ 119)) == 0) ** GOTO lbl40
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var5_6 = 0;
                            if (-" ".length() < 0) ** GOTO lbl38
                            return;
lbl-1000:
                            // 1 sources

                            {
                                if ((ey_0.var_int_arr_arr_do[var4_5][var5_6] == var2_3)) {
                                    v0 = var4_5 + 48;
                                    if (-"   ".length() >= 0) {
                                        return;
                                    }
                                    break block40;
                                }
                                ++var5_6;
lbl38:
                                // 2 sources

                                ** while (!ey_0.cfr_renamed_5((int)var5_6, (int)ey_0.var_int_arr_arr_do[var4_5].length))
                            }
lbl39:
                            // 1 sources

                            ++var4_5;
lbl40:
                            // 2 sources

                            ** while (!ey_0.cfr_renamed_5((int)var4_5, (int)ey_0.var_int_arr_arr_do.length))
                        }
lbl41:
                        // 1 sources

                        v0 = var2_3 = -1;
                    }
                    if (!(v0 != -1)) break block43;
                }
                if ((var2_3 == ey_0.cfr_renamed_10)) {
                    var1_2.cfr_renamed_21 = (var1_2.cfr_renamed_21 + 1) % var3_4 /* !! */ [var2_3 - 48].length();
                    var4_5 = var3_4 /* !! */ [var2_3 - 48].charAt(var1_2.cfr_renamed_21);
                    if (ey_0.boolean_new(ey_0.soLuongKhoa)) {
                        var4_5 = Character.toLowerCase(var4_5);
                        if ((28 ^ 24) == 0) {
                            return;
                        }
                    } else if ((ey_0.soLuongKhoa == 1)) {
                        var4_5 = Character.toUpperCase(var4_5);
                        if (-"   ".length() > 0) {
                            return;
                        }
                    } else if ((ey_0.soLuongKhoa == 2)) {
                        var4_5 = Character.toUpperCase(var4_5);
                        if (-(17 ^ 21) > 0) {
                            return;
                        }
                    } else {
                        var4_5 = var3_4 /* !! */ [var2_3 - 48].charAt(var3_4 /* !! */ [var2_3 - 48].length() - 1);
                    }
                    var3_4 /* !! */  = String.valueOf(var1_2.var_java_lang_String_new.substring(0, var1_2.cfr_renamed_13 - 1)) + var4_5;
                    if ((var1_2.cfr_renamed_13 < var1_2.var_java_lang_String_new.length())) {
                        var3_4 /* !! */  = String.valueOf(var3_4 /* !! */ ) + var1_2.var_java_lang_String_new.substring(var1_2.cfr_renamed_13, var1_2.var_java_lang_String_new.length());
                    }
                    var1_2.var_java_lang_String_new = var3_4 /* !! */ ;
                    var1_2.cfr_renamed_6 = ey_0.var_int_arr_if[ey_0.this];
                    var1_2.cfr_renamed_4();
                    if ("  ".length() <= ((5 + 68 - 39 + 130 ^ 43 + 131 - 141 + 113) & (79 ^ 15 ^ (228 ^ 146) ^ -" ".length()))) {
                        return;
                    }
                } else if ((var1_2.var_java_lang_String_new.length() < var1_2.cfr_renamed_23)) {
                    if ((ey_0.soLuongKhoa == 1) && (ey_0.cfr_renamed_10 != -1984)) {
                        ey_0.soLuongKhoa = 0;
                    }
                    var1_2.cfr_renamed_21 = 0;
                    var4_5 = var3_4 /* !! */ [var2_3 - 48].charAt(var1_2.cfr_renamed_21);
                    if (ey_0.boolean_new(ey_0.soLuongKhoa)) {
                        var4_5 = Character.toLowerCase(var4_5);
                        if (((121 ^ 38) & ~(23 ^ 72)) != ((59 ^ 127) & ~(116 ^ 48))) {
                            return;
                        }
                    } else if ((ey_0.soLuongKhoa == 1)) {
                        var4_5 = Character.toUpperCase(var4_5);
                        if (" ".length() == "   ".length()) {
                            return;
                        }
                    } else if ((ey_0.soLuongKhoa == 2)) {
                        var4_5 = Character.toUpperCase(var4_5);
                        if ((26 ^ 31) == 0) {
                            return;
                        }
                    } else {
                        var4_5 = var3_4 /* !! */ [var2_3 - 48].charAt(var3_4 /* !! */ [var2_3 - 48].length() - 1);
                    }
                    var3_4 /* !! */  = String.valueOf(var1_2.var_java_lang_String_new.substring(0, var1_2.cfr_renamed_13)) + var4_5;
                    if ((var1_2.cfr_renamed_13 < var1_2.var_java_lang_String_new.length())) {
                        var3_4 /* !! */  = String.valueOf(var3_4 /* !! */ ) + var1_2.var_java_lang_String_new.substring(var1_2.cfr_renamed_13, var1_2.var_java_lang_String_new.length());
                    }
                    var1_2.var_java_lang_String_new = var3_4 /* !! */ ;
                    var1_2.cfr_renamed_6 = ey_0.var_int_arr_if[ey_0.this];
                    var1_2.cfr_renamed_13 += 1;
                    var1_2.cfr_renamed_4();
                    var1_2.void_for(0);
                }
                ey_0.cfr_renamed_10 = var2_3;
            }
            return;
        }
        if ((this.cfr_renamed_18 == 1)) {
            this.void_int(var1_1);
            this.cfr_renamed_6 = 1;
        }
    }

    public final String java_lang_String_do() {
        return this.var_java_lang_String_new;
    }

            public final void cfr_renamed_2() {
        this.var_int_int += 1;
        if (ey_0.boolean_int(this.cfr_renamed_6)) {
            this.cfr_renamed_6 -= 1;
            if (!ey_0.boolean_for(this.cfr_renamed_6) || (soLuongKhoa > 2)) {
                this.cfr_renamed_21 = 0;
                if (ey_0.boolean_for(this.var_boolean_int ? 1 : 0) && (soLuongKhoa == 1) && (ey_0.cfr_renamed_10 != cfr_renamed_30)) {
                    soLuongKhoa = 0;
                }
                ey_0.cfr_renamed_10 = -1984;
                this.cfr_renamed_4();
            }
        }
        if (ey_0.boolean_int(this.cfr_renamed_8)) {
            this.cfr_renamed_8 -= 1;
        }
        if (ey_0.boolean_for(GameCanvas.coTrangThai ? 1 : 0) && (GameCanvas.var_aa_do == null)) {
            ey_0 ey_02 = this;
            if (ey_0.boolean_for(GameCanvas.coTrangThai ? 1 : 0) && ey_0.boolean_for(GameCanvas.boolean_do(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_case - GameCanvas.this / 2) ? 1 : 0)) {
                if (ey_0.boolean_for(GameCanvas.boolean_do(ey_02.var_int_if, ey_02.cfr_renamed_14 - 6, ey_02.cfr_renamed_9, ey_02.var_int_new + 12) ? 1 : 0)) {
                    if (ey_0.boolean_new(ey_02.var_boolean_int ? 1 : 0)) {
                        ey_02.var_boolean_int = 1;
                        if (-" ".length() >= "   ".length()) {
                            return;
                        }
                    } else {
                        if (ey_0.boolean_new(gA.coTrangThai ? 1 : 0)) {
                            ey_02.coKichHoat = 1;
                            gA.coTrangThai = 1;
                            GameCanvas.gameCanvas.cfr_renamed_3();
                        }
                        GameCanvas.var_h_0_do.coTrangThai = 1;
                        if (" ".length() < -" ".length()) {
                            return;
                        }
                    }
                } else {
                    if (ey_0.boolean_for(ey_02.coKichHoat ? 1 : 0)) {
                        gA.coTrangThai = 0;
                        GameCanvas.gameCanvas.cfr_renamed_3();
                        ey_02.coKichHoat = 0;
                    }
                    if (ey_0.boolean_for(ey_02.coTrangThai ? 1 : 0)) {
                        ey_02.var_boolean_int = 0;
                    }
                }
            }
        }
        if ((this.cfr_renamed_16 != -1) && ey_0.boolean_int((System.currentTimeMillis() / 100L - this.soXu <= 5L))) {
            this.cfr_renamed_16 = -1;
        }
        if (ey_0.boolean_for(this.var_boolean_int ? 1 : 0) && (GameCanvas.var_dj_0_do == null)) {
            if (ey_0.boolean_for(GameCanvas.var_boolean_arr_do[4])) {
                if ((this.cfr_renamed_18 != 2)) {
                    this.cfr_renamed_13 -= 1;
                    if ((this.cfr_renamed_13 < 0)) {
                        this.cfr_renamed_13 = 0;
                    }
                    this.void_for(-1);
                }
                GameCanvas.var_boolean_arr_do[4] = 0;
                return;
            }
            if (ey_0.boolean_for(GameCanvas.var_boolean_arr_do[6])) {
                if ((this.cfr_renamed_18 != 2)) {
                    this.cfr_renamed_13 += 1;
                    if ((this.cfr_renamed_13 > this.var_java_lang_String_new.length())) {
                        this.cfr_renamed_13 = this.var_java_lang_String_new.length();
                    }
                    this.void_for(1);
                }
                GameCanvas.var_boolean_arr_do[6] = 0;
            }
        }
    }

    public final boolean boolean_do(int n) {
        if (ey_0.boolean_for(GameCanvas.dangChayAuto ? 1 : 0)) {
            if (!(n != 8) || (n == 127)) {
                this.void_do();
                if (-" ".length() < -" ".length()) {
                    return ((0xA4 ^ 0x8C) & ~(0x1A ^ 0x32)) != 0;
                }
            }
        } else if (!(n != 8) || !(n != -8) || (n == 204)) {
            this.void_do();
            return 1;
        }
        if (ey_0.boolean_new(GameCanvas.dangChayAuto ? 1 : 0) && (n >= 65) && (n <= 122)) {
            dangChayAuto = 1;
        }
        if (ey_0.boolean_for(dangChayAuto ? 1 : 0) && ey_0.boolean_new(GameCanvas.dangChayAuto ? 1 : 0)) {
            if ((n == 45)) {
                if ((n == ey_0.cfr_renamed_10) && (this.cfr_renamed_6 < var_int_arr_if[this])) {
                    this.tenNhanVat = this.var_java_lang_String_new = String.valueOf(this.var_java_lang_String_new.substring(0, this.cfr_renamed_13 - 1)) + 95;
                    this.cfr_renamed_4();
                    this.void_for(0);
                    ey_0.cfr_renamed_10 = -1984;
                    return 0;
                }
                ey_0.cfr_renamed_10 = 45;
            }
            if ((n >= 32)) {
                this.void_int(n);
                return 0;
            }
        }
        if (ey_0.boolean_new(dangChayAuto ? 1 : 0) && (n == cfr_renamed_30)) {
            ey_0.cfr_renamed_0();
            this.cfr_renamed_6 = 1;
            ey_0.cfr_renamed_10 = n;
            return 0;
        }
        if ((n == cfr_renamed_12) && ey_0.boolean_new(this.cfr_renamed_18)) {
            this.cfr_renamed_5();
            return 0;
        }
        if ((n == 42)) {
            n = 58;
        }
        if ((n == 35)) {
            n = 59;
        }
        if (ey_0.boolean_for(GameCanvas.dangChayAuto ? 1 : 0) && (n >= 48)) {
            if (ey_0.boolean_for(dangChayAuto ? 1 : 0)) {
                this.void_int(n);
                this.cfr_renamed_6 = 1;
                if (" ".length() <= ((0xF3 ^ 0xBD) & ~(9 ^ 0x47))) {
                    return ((0x51 ^ 0x56) & ~(0x5C ^ 0x5B)) != 0;
                }
            } else {
                this.void_new(n);
                if ((0x99 ^ 0x96 ^ (0x63 ^ 0x69)) == 0) {
                    return ((109 + 141 - 226 + 172 ^ 76 + 19 - 50 + 114) & (0x4E ^ 0x77 ^ (0x26 ^ 0x44) ^ -" ".length())) != 0;
                }
            }
        } else if ((n >= 48) && (n <= 59)) {
            this.void_new(n);
            if ("   ".length() == 0) {
                return ((0x4D ^ 0x51 ^ (0x25 ^ 0x70)) & (122 + 70 - 132 + 82 ^ 71 + 89 - 11 + 50 ^ -" ".length())) != 0;
            }
        } else {
            this.cfr_renamed_21 = 0;
            ey_0.cfr_renamed_10 = -1984;
            if ((n == 14)) {
                if (ey_0.boolean_int(this.cfr_renamed_13)) {
                    this.cfr_renamed_13 -= 1;
                    this.void_for(0);
                    this.cfr_renamed_8 = 10;
                    return 0;
                }
            } else if ((n == 15)) {
                if ((this.cfr_renamed_13 < this.var_java_lang_String_new.length())) {
                    this.cfr_renamed_13 += 1;
                    this.void_for(0);
                    this.cfr_renamed_8 = 10;
                    return 0;
                }
            } else {
                if ((n == 19)) {
                    this.void_do();
                    return 0;
                }
                ey_0.cfr_renamed_10 = n;
            }
        }
        return 1;
    }

        public final void cfr_renamed_3() {
        this.cfr_renamed_23 = 40;
    }

    public final void (Graphics graphics == null) {
        boolean bl = this.var_boolean_int;
        if ((this.cfr_renamed_18 == 2)) {
            this.tenNhanVat = this.var_java_lang_String_int;
            if ((0xEA ^ 0xC3 ^ (0x63 ^ 0x4E)) <= 0) {
                return;
            }
        } else {
            this.tenNhanVat = this.var_java_lang_String_new;
        }
        graphics.setClip(0, 0, GameCanvas.soLuongKhoa + 20, GameCanvas.var_int_case);
        graphics.setColor(7829367);
        GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this.var_int_if, this.cfr_renamed_14, this.cfr_renamed_9, this.var_int_new, this, bl);
    }

    public ey_0() {
        this.cfr_renamed_13 = 0;
        this.var_int_int = 0;
        this.cfr_renamed_23 = 500;
        this.cfr_renamed_7 = 0;
        this.cfr_renamed_6 = 0;
        this.cfr_renamed_21 = 0;
        this.cfr_renamed_8 = 10;
        this.cfr_renamed_18 = 0;
        this.cfr_renamed_16 = -1;
        this.cfr_renamed_15 = 0;
        this.cfr_renamed_20 = 0;
        this.coKichHoat = 0;
        ey_0 ey_02 = this;
        soLuong = dF.var_byte_new + 1;
        ey_02.var_fl_0_do = new fl_0(MenuChinhAvatar.cR, new ax_0(ey_02));
        if ((var_javax_microedition_lcdui_Canvas_do == null)) {
            var_javax_microedition_lcdui_Canvas_do = GameCanvas.gameCanvas;
        }
        this.cfr_renamed_0(0);
        this.var_int_new = ey_0.var_cu_0_do.cfr_renamed_2;
    }

    public static void void_if(int n) {
        if ((n == 1)) {
            ey_0.var_java_lang_String_arr_for[0] = "0";
            ey_0.var_java_lang_String_arr_for[10] = " *";
            ey_0.var_java_lang_String_arr_for[11] = "#";
            cfr_renamed_30 = 35;
            cfr_renamed_12 = 42;
            return;
        }
        if (ey_0.boolean_new(n)) {
            ey_0.var_java_lang_String_arr_for[0] = " 0";
            ey_0.var_java_lang_String_arr_for[10] = "*";
            ey_0.var_java_lang_String_arr_for[11] = "#";
            cfr_renamed_30 = 35;
            cfr_renamed_12 = 42;
            return;
        }
        if ((n == 2)) {
            ey_0.var_java_lang_String_arr_for[0] = "0";
            ey_0.var_java_lang_String_arr_for[10] = "*";
            ey_0.var_java_lang_String_arr_for[11] = " #";
            cfr_renamed_30 = 42;
            cfr_renamed_12 = 35;
        }
    }

    private static boolean boolean_new(int n) {
        return n == 0;
    }

    public final void cfr_renamed_0(boolean bl) {
        if ((this.var_boolean_int ? 1 : 0 != bl ? 1 : 0)) {
            soLuongKhoa = 0;
        }
        ey_0.cfr_renamed_10 = -1984;
        cfr_renamed_5 = GameCanvas.int_do();
        this.var_boolean_int = bl;
    }

    }

