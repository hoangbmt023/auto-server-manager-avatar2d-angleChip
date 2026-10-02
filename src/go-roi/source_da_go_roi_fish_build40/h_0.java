/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from h
 */
public final class h_0 {
    public int soLuong;
    public String[] var_java_lang_String_arr_do;
    public String[] var_java_lang_String_arr_if;
    public long soXu;
    public int var_int_if;
    public int soLuongKhoa;
    public byte[] var_byte_arr_do;
    public int var_int_int;
    private String[] var_java_lang_String_arr_new;
    public int var_int_new;
    public int var_int_try;
    public int cfr_renamed_6;
    public int cfr_renamed_7;
    private String[] var_java_lang_String_arr_try;
    public boolean dangChayAuto;
    public int cfr_renamed_8;
    public int cfr_renamed_13;
    public int cfr_renamed_9;
    public int cfr_renamed_14;
    public boolean coTrangThai;
    public int this;
    public int cfr_renamed_12 = -1;
    private static final int[] mangSoNguyen;
    public int cfr_renamed_15;
    public String[] var_java_lang_String_arr_for;
    public byte[] var_byte_arr_if;
    public String[] var_java_lang_String_arr_int;

            public static void cfr_renamed_1() {
        if ((GameCanvas.cfr_renamed_12 != null)) {
            ey_0.var_de_do.void_do();
            return;
        }
        if ((cs_0.dangChayAuto)) {
            cs_0.cfr_renamed_1().cfr_renamed_4.cfr_renamed_0();
            return;
        }
        if ((GameCanvas.var_en_do.cfr_renamed_4 != null) && (GameCanvas.var_en_do.cfr_renamed_4.chuoiGiaTri.equals(MenuChinhAvatar.cR))) {
            GameCanvas.var_en_do.cfr_renamed_4.var_de_do.void_do();
        }
    }

        public h_0() {
        this.coTrangThai = 0;
        this.dangChayAuto = 0;
        String[] stringArray = new String[4];
        stringArray[0] = "Top";
        stringArray[1] = "Down";
        stringArray[2] = "Left";
        stringArray[3] = "Right";
        this.var_java_lang_String_arr_do = stringArray;
        byte[] byArray = new byte[4];
        byArray[0] = 4;
        byArray[1] = 7;
        byArray[2] = 0;
        byArray[3] = 2;
        this.var_byte_arr_if = byArray;
        if ((GameCanvas.var_int_case >= GameCanvas.soLuongKhoa)) {
            GameCanvas.var_boolean_byte = 0;
            this.cfr_renamed_9 = GameCanvas.var_int_case / 6 << 1;
            this.cfr_renamed_7 = 0;
            this.var_int_new = (GameCanvas.var_int_case -= this.cfr_renamed_9) + 4;
            this.cfr_renamed_9 -= 4;
            this.var_int_if = GameCanvas.soLuongKhoa;
            this.soLuongKhoa = this.var_int_if / 4;
            this.cfr_renamed_13 = this.cfr_renamed_9 / 2;
            this.cfr_renamed_8 = this.cfr_renamed_7;
            this.var_int_int = this.var_int_new;
            this.cfr_renamed_6 = this.cfr_renamed_9 / 3;
            this.this = this.var_int_if / 4;
            this.var_int_try = 4;
            this.soLuong = 2;
            this.cfr_renamed_14 = 4;
            this.cfr_renamed_15 = 3;
            String[] stringArray2 = new String[8];
            stringArray2[0] = "-";
            stringArray2[1] = "Top";
            stringArray2[2] = "ABC";
            stringArray2[3] = "-";
            stringArray2[4] = "Left";
            stringArray2[5] = "Down";
            stringArray2[6] = "Right";
            stringArray2[7] = "OK";
            this.var_java_lang_String_arr_for = stringArray2;
            String[] stringArray3 = new String[12];
            stringArray3[0] = ".,?!1";
            stringArray3[1] = "abc2";
            stringArray3[2] = "def3";
            stringArray3[3] = MenuChinhAvatar.cR;
            stringArray3[4] = "ghi4";
            stringArray3[5] = "jkl5";
            stringArray3[6] = "mno6";
            stringArray3[7] = MenuChinhAvatar.aC;
            stringArray3[8] = "pqrs7";
            stringArray3[9] = "tuv8";
            stringArray3[10] = "wxyz9";
            stringArray3[11] = "0";
            this.var_java_lang_String_arr_new = stringArray3;
            this.var_java_lang_String_arr_if = new String[12];
            int n = 0;
            while ((n < 12)) {
                this.var_java_lang_String_arr_if[n] = this.var_java_lang_String_arr_new[n].toUpperCase();
                ++n;
                throw null;
            }
            this.var_java_lang_String_arr_if[3] = this.var_java_lang_String_arr_new[3];
            String[] stringArray4 = new String[12];
            stringArray4[0] = "1";
            stringArray4[1] = "2";
            stringArray4[2] = "3";
            stringArray4[3] = MenuChinhAvatar.cR;
            stringArray4[4] = "4";
            stringArray4[5] = "5";
            stringArray4[6] = "6";
            stringArray4[7] = MenuChinhAvatar.aC;
            stringArray4[8] = "7";
            stringArray4[9] = "8";
            stringArray4[10] = "9";
            stringArray4[11] = "0";
            this.var_java_lang_String_arr_try = stringArray4;
            byte[] byArray2 = new byte[8];
            byArray2[0] = -6;
            byArray2[1] = -1;
            byArray2[2] = 0;
            byArray2[3] = -7;
            byArray2[4] = -3;
            byArray2[5] = -2;
            byArray2[6] = -4;
            byArray2[7] = -5;
            this.var_byte_arr_do = byArray2;
            if (((32 + 63 - 21 + 84 ^ 20 + 12 - -88 + 64) & (127 + 210 - 122 + 10 ^ 51 + 13 - -133 + 2 ^ -" ".length())) != 0) {
                throw null;
            }
        } else {
            GameCanvas.var_boolean_byte = 1;
            this.var_int_if = GameCanvas.soLuongKhoa / 6 << 1;
            this.var_int_new = 1;
            this.cfr_renamed_9 = GameCanvas.gameCanvas.getHeight();
            this.cfr_renamed_7 = (GameCanvas.soLuongKhoa -= this.var_int_if + 1) + 4;
            this.var_int_if -= 4;
            this.soLuongKhoa = this.var_int_if / 2;
            this.cfr_renamed_13 = this.cfr_renamed_9 / 4;
            this.cfr_renamed_8 = this.cfr_renamed_7;
            this.var_int_int = this.var_int_new;
            this.cfr_renamed_6 = this.cfr_renamed_9 / 4;
            this.this = this.var_int_if / 3;
            this.var_int_try = 2;
            this.soLuong = 4;
            this.cfr_renamed_14 = 3;
            this.cfr_renamed_15 = 4;
            String[] stringArray5 = new String[8];
            stringArray5[0] = "-";
            stringArray5[1] = "OK";
            stringArray5[2] = "ABC";
            stringArray5[3] = "Top";
            stringArray5[4] = "Left";
            stringArray5[5] = "Right";
            stringArray5[6] = "-";
            stringArray5[7] = "Down";
            this.var_java_lang_String_arr_for = stringArray5;
            String[] stringArray6 = new String[12];
            stringArray6[0] = ".,?!1";
            stringArray6[1] = "abc2";
            stringArray6[2] = "def3";
            stringArray6[3] = "ghi4";
            stringArray6[4] = "jkl5";
            stringArray6[5] = "mno6";
            stringArray6[6] = "pqrs7";
            stringArray6[7] = "tuv8";
            stringArray6[8] = "wxyz9";
            stringArray6[9] = MenuChinhAvatar.aC;
            stringArray6[10] = "0";
            stringArray6[11] = MenuChinhAvatar.cR;
            this.var_java_lang_String_arr_new = stringArray6;
            this.var_java_lang_String_arr_if = new String[12];
            int n = 0;
            while ((n < 11)) {
                this.var_java_lang_String_arr_if[n] = this.var_java_lang_String_arr_new[n].toUpperCase();
                ++n;
                if ((154 + 28 - 176 + 162 ^ 70 + 116 - 178 + 164) >= " ".length()) continue;
                throw null;
            }
            this.var_java_lang_String_arr_if[11] = this.var_java_lang_String_arr_new[11];
            String[] stringArray7 = new String[12];
            stringArray7[0] = "1";
            stringArray7[1] = "2";
            stringArray7[2] = "3";
            stringArray7[3] = "4";
            stringArray7[4] = "5";
            stringArray7[5] = "6";
            stringArray7[6] = "7";
            stringArray7[7] = "8";
            stringArray7[8] = "9";
            stringArray7[9] = MenuChinhAvatar.aC;
            stringArray7[10] = "0";
            stringArray7[11] = MenuChinhAvatar.cR;
            this.var_java_lang_String_arr_try = stringArray7;
            byte[] byArray3 = new byte[8];
            byArray3[0] = -7;
            byArray3[1] = -5;
            byArray3[2] = 0;
            byArray3[3] = -1;
            byArray3[4] = -3;
            byArray3[5] = -4;
            byArray3[6] = -6;
            byArray3[7] = -2;
            this.var_byte_arr_do = byArray3;
        }
        this.soXu = -1L;
        this.cfr_renamed_0();
    }

    public final void cfr_renamed_0() {
        switch (ey_0.soLuongKhoa) {
            case 0: 
            case 1: {
                this.var_java_lang_String_arr_int = this.var_java_lang_String_arr_new;
                return;
            }
            case 2: {
                this.var_java_lang_String_arr_int = this.var_java_lang_String_arr_if;
                return;
            }
            case 3: {
                this.var_java_lang_String_arr_int = this.var_java_lang_String_arr_try;
            }
        }
    }

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[20];
        -1 = -" ".length();
        0 = (0x3D ^ 0x11) & ~(0x17 ^ 0x3B);
        4 = 146 + 81 - 74 + 3 ^ 101 + 3 - 89 + 137;
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
        7 = 153 + 95 - 83 + 7 ^ 73 + 49 - -26 + 23;
        6 = 0x30 ^ 0x36;
        8 = 0xA3 ^ 0xAB;
        5 = 0xB9 ^ 0xBC;
        12 = 0x30 ^ 4 ^ (0x3D ^ 5);
        9 = 0xDF ^ 0x9E ^ (0x6B ^ 0x23);
        10 = 35 + 61 - 12 + 73 ^ 132 + 124 - 223 + 118;
        11 = 9 ^ 0x2F ^ (0x7B ^ 0x56);
        -6 = -(0x77 ^ 0x71);
        -7 = -(0x83 ^ 0x84);
        -3 = -"   ".length();
        -2 = -"  ".length();
        -4 = -(0x85 ^ 0xBB ^ (0x9B ^ 0xA1));
        -5 = -(0xB4 ^ 0xB1);
    }

    static {
        h_0.cfr_renamed_2();
    }

    }

