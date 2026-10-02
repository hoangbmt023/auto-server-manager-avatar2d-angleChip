/*
 * Decompiled with CFR 0.152.
 */
public final class av {
    public int soLuong;
    public int var_int_if;
    public int soLuongKhoa;
    public boolean dangChayAuto;
    public int var_int_int;
    private static final int[] mangSoNguyen;
    public int var_int_new = -1;
    public String[] var_java_lang_String_arr_do;
    public int var_int_try;
    private String[] var_java_lang_String_arr_new;
    public int cfr_renamed_15;
    public String[] var_java_lang_String_arr_if;
    public int cfr_renamed_8;
    public byte[] var_byte_arr_do;
    public int cfr_renamed_12;
    public boolean coTrangThai = 0;
    public String[] var_java_lang_String_arr_for;
    public long soXu;
    public int cfr_renamed_11;
    private String[] var_java_lang_String_arr_try;
    public int cfr_renamed_18;
    public String[] var_java_lang_String_arr_int;
    public int cfr_renamed_10;
    public int this;
    public byte[] var_byte_arr_if;
    public int cfr_renamed_16;
    public int cfr_renamed_6;

        static {
        av.cfr_renamed_3();
    }

    public final void cfr_renamed_0() {
        switch (gx.var_int_if) {
            case 0: 
            case 1: {
                this.var_java_lang_String_arr_int = this.var_java_lang_String_arr_try;
                return;
            }
            case 2: {
                this.var_java_lang_String_arr_int = this.var_java_lang_String_arr_do;
                return;
            }
            case 3: {
                this.var_java_lang_String_arr_int = this.var_java_lang_String_arr_new;
            }
        }
    }

                public static void cfr_renamed_1() {
        if ((GameCanvas.cfr_renamed_16 != null)) {
            gx.var_cp_do.void_do();
            return;
        }
        if ((ce.dangChayAuto)) {
            ce.cfr_renamed_0().cfr_renamed_2.cfr_renamed_1();
            return;
        }
        if ((GameCanvas.var_dL_do.cfr_renamed_2 != null) && (GameCanvas.var_dL_do.cfr_renamed_2.chuoiGiaTri.equals(MenuChinhAvatar.d))) {
            GameCanvas.var_dL_do.cfr_renamed_2.var_cp_do.void_do();
        }
    }

        public av() {
        this.dangChayAuto = 0;
        String[] stringArray = new String[4];
        stringArray[0] = "Top";
        stringArray[1] = "Down";
        stringArray[2] = "Left";
        stringArray[3] = "Right";
        this.var_java_lang_String_arr_for = stringArray;
        byte[] byArray = new byte[4];
        byArray[0] = 4;
        byArray[1] = 7;
        byArray[2] = 0;
        byArray[3] = 2;
        this.var_byte_arr_if = byArray;
        if ((GameCanvas.var_int_char >= GameCanvas.var_int_byte)) {
            GameCanvas.dangChayAuto = 0;
            this.cfr_renamed_12 = GameCanvas.var_int_char / 6 << 1;
            this.soLuong = 0;
            this.soLuongKhoa = (GameCanvas.var_int_char -= this.cfr_renamed_12) + 4;
            this.cfr_renamed_12 -= 4;
            this.var_int_int = GameCanvas.var_int_byte;
            this.cfr_renamed_8 = this.var_int_int / 4;
            this.var_int_try = this.cfr_renamed_12 / 2;
            this.cfr_renamed_15 = this.soLuong;
            this.cfr_renamed_18 = this.soLuongKhoa;
            this.cfr_renamed_16 = this.cfr_renamed_12 / 3;
            this.this = this.var_int_int / 4;
            this.cfr_renamed_10 = 4;
            this.cfr_renamed_6 = 2;
            this.cfr_renamed_11 = 4;
            this.var_int_if = 3;
            String[] stringArray2 = new String[8];
            stringArray2[0] = "-";
            stringArray2[1] = "Top";
            stringArray2[2] = "ABC";
            stringArray2[3] = "-";
            stringArray2[4] = "Left";
            stringArray2[5] = "Down";
            stringArray2[6] = "Right";
            stringArray2[7] = "OK";
            this.var_java_lang_String_arr_if = stringArray2;
            String[] stringArray3 = new String[12];
            stringArray3[0] = ".,?!1";
            stringArray3[1] = "abc2";
            stringArray3[2] = "def3";
            stringArray3[3] = MenuChinhAvatar.d;
            stringArray3[4] = "ghi4";
            stringArray3[5] = "jkl5";
            stringArray3[6] = "mno6";
            stringArray3[7] = MenuChinhAvatar.ck;
            stringArray3[8] = "pqrs7";
            stringArray3[9] = "tuv8";
            stringArray3[10] = "wxyz9";
            stringArray3[11] = "0";
            this.var_java_lang_String_arr_try = stringArray3;
            this.var_java_lang_String_arr_do = new String[12];
            int n = 0;
            while ((n < 12)) {
                this.var_java_lang_String_arr_do[n] = this.var_java_lang_String_arr_try[n].toUpperCase();
                ++n;
                if ((103 + 64 - 112 + 126 ^ 70 + 63 - -43 + 1) >= 0) continue;
                throw null;
            }
            this.var_java_lang_String_arr_do[3] = this.var_java_lang_String_arr_try[3];
            String[] stringArray4 = new String[12];
            stringArray4[0] = "1";
            stringArray4[1] = "2";
            stringArray4[2] = "3";
            stringArray4[3] = MenuChinhAvatar.d;
            stringArray4[4] = "4";
            stringArray4[5] = "5";
            stringArray4[6] = "6";
            stringArray4[7] = MenuChinhAvatar.ck;
            stringArray4[8] = "7";
            stringArray4[9] = "8";
            stringArray4[10] = "9";
            stringArray4[11] = "0";
            this.var_java_lang_String_arr_new = stringArray4;
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
            if (((0x4D ^ 0x61) & ~(0x1E ^ 0x32)) != ((0xCE ^ 0x95) & ~(0x4A ^ 0x11))) {
                throw null;
            }
        } else {
            GameCanvas.dangChayAuto = 1;
            this.var_int_int = GameCanvas.var_int_byte / 6 << 1;
            this.soLuongKhoa = 1;
            this.cfr_renamed_12 = GameCanvas.gameCanvas.getHeight();
            this.soLuong = (GameCanvas.var_int_byte -= this.var_int_int + 1) + 4;
            this.var_int_int -= 4;
            this.cfr_renamed_8 = this.var_int_int / 2;
            this.var_int_try = this.cfr_renamed_12 / 4;
            this.cfr_renamed_15 = this.soLuong;
            this.cfr_renamed_18 = this.soLuongKhoa;
            this.cfr_renamed_16 = this.cfr_renamed_12 / 4;
            this.this = this.var_int_int / 3;
            this.cfr_renamed_10 = 2;
            this.cfr_renamed_6 = 4;
            this.cfr_renamed_11 = 3;
            this.var_int_if = 4;
            String[] stringArray5 = new String[8];
            stringArray5[0] = "-";
            stringArray5[1] = "OK";
            stringArray5[2] = "ABC";
            stringArray5[3] = "Top";
            stringArray5[4] = "Left";
            stringArray5[5] = "Right";
            stringArray5[6] = "-";
            stringArray5[7] = "Down";
            this.var_java_lang_String_arr_if = stringArray5;
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
            stringArray6[9] = MenuChinhAvatar.ck;
            stringArray6[10] = "0";
            stringArray6[11] = MenuChinhAvatar.d;
            this.var_java_lang_String_arr_try = stringArray6;
            this.var_java_lang_String_arr_do = new String[12];
            int n = 0;
            while ((n < 11)) {
                this.var_java_lang_String_arr_do[n] = this.var_java_lang_String_arr_try[n].toUpperCase();
                ++n;
                if ("   ".length() != ((0xDF ^ 0x81) & ~(0x9C ^ 0xC2) ^ (0x68 ^ 0x6C))) continue;
                throw null;
            }
            this.var_java_lang_String_arr_do[11] = this.var_java_lang_String_arr_try[11];
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
            stringArray7[9] = MenuChinhAvatar.ck;
            stringArray7[10] = "0";
            stringArray7[11] = MenuChinhAvatar.d;
            this.var_java_lang_String_arr_new = stringArray7;
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

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[20];
        -1 = -" ".length();
        0 = (0xF0 ^ 0xBE ^ (0xA ^ 0x55)) & ("  ".length() ^ (0xA8 ^ 0xBB) ^ -" ".length());
        4 = 0x77 ^ 0x24 ^ (0x11 ^ 0x46);
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
        7 = 0x3F ^ 0x2A ^ (0x11 ^ 3);
        6 = 0x5F ^ 0x40 ^ (0x52 ^ 0x4B);
        8 = 0x32 ^ 0x3A;
        5 = 0xE3 ^ 0x8E ^ (0x77 ^ 0x1F);
        12 = 0x36 ^ 0x66 ^ (0x56 ^ 0xA);
        9 = 78 + 59 - 50 + 89 ^ 145 + 123 - 129 + 46;
        10 = 0x1D ^ 0x17;
        11 = 152 + 194 - 146 + 5 ^ 79 + 17 - 61 + 163;
        -6 = -(69 + 51 - 68 + 96 ^ 19 + 88 - -22 + 17);
        -7 = -(0x1B ^ 0x1C);
        -3 = -"   ".length();
        -2 = -"  ".length();
        -4 = -(0xC0 ^ 0xAC ^ (0xD8 ^ 0xB0));
        -5 = -(0x7C ^ 2 ^ (0x60 ^ 0x1B));
    }
}

