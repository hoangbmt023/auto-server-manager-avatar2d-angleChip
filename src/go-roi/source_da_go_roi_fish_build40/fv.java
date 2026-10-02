/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class fv
extends dF {
    private String[][] var_java_lang_String_arr_arr_do;
    private static byte[] var_byte_arr_do;
    private int var_int_int;
    private int var_int_new;
    private int var_int_try;
    private static int var_int_byte;
    private static short[] var_short_arr_do;
    public static boolean dangChayAuto;
    private String[][] var_java_lang_String_arr_arr_if;
    public static int soLuong;
    public static int var_int_if;
    public byte var_byte_do = (byte)0;
    private String[][] var_java_lang_String_arr_arr_for;
    private static int var_int_case;
    public static int soLuongKhoa;
    private String[][] var_java_lang_String_arr_arr_int;
    private static short[] var_short_arr_if;
    public static boolean coTrangThai;
    private static en var_en_do;
    private String[][] var_java_lang_String_arr_arr_new;
    private String[][] var_java_lang_String_arr_arr_try;
    private static int var_int_char;
    private static int[] mangSoNguyen;
    private String[][] var_java_lang_String_arr_arr_byte;
    private static byte[] var_byte_arr_if;
    private String[][] var_java_lang_String_arr_arr_case;
    private int cfr_renamed_13;
    private static int cfr_renamed_9;
    private String[][] var_java_lang_String_arr_arr_char;
    private static int cfr_renamed_14;

    public final void cfr_renamed_0() {
        if ((this.var_java_lang_String_arr_arr_for == null)) {
            this.var_java_lang_String_arr_arr_for = MenuChinhAvatar.cfr_renamed_3();
        }
        GameCanvas.var_fv_do.cfr_renamed_1(this.var_java_lang_String_arr_arr_for[var_int_char]);
        var_int_char += 1;
    }

    /*
     * Unable to fully structure code
     */
    private static void cfr_renamed_9() {
        var0 = 0;
        if (" ".length() >= 0) ** GOTO lbl14
        return;
lbl-1000:
        // 1 sources

        {
            var1_1 = (bm)fh.var_java_util_Vector_char.elementAt(var0);
            if (fv.boolean_for(var1_1.var_byte_if, 1) && fv.boolean_for(((fd_0)var1_1).cfr_renamed_8, -9)) {
                fh.var_java_util_Vector_char.removeElement(var1_1);
                --var0;
            }
            ++var0;
lbl14:
            // 2 sources

            ** while (!fv.cfr_renamed_3((int)var0, (int)fh.var_java_util_Vector_char.size()))
        }
lbl15:
        // 1 sources

    }

    private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

        public final void cfr_renamed_2() {
        if ((this.var_java_lang_String_arr_arr_byte == null)) {
            this.var_java_lang_String_arr_arr_byte = MenuChinhAvatar.cfr_renamed_4();
        }
        var_en_do = go_0.var_go_0_do;
        short[] sArray = new short[3];
        var_short_arr_if = sArray;
        sArray[0] = 180;
        fv.var_short_arr_if[1] = 312;
        fv.var_short_arr_if[2] = 720;
        byte[] byArray = new byte[3];
        byArray[0] = 108;
        byArray[1] = 100;
        byArray[2] = 107;
        var_byte_arr_if = byArray;
        if (fv.boolean_for(soLuongKhoa)) {
            if (fv.boolean_for(soLuongKhoa, var_short_arr_if.length)) {
                this.void_for(288, 150);
                return;
            }
            fm.fm_do().void_do(var_short_arr_if[soLuongKhoa] * dF.cfr_renamed_12, 20 * dF.cfr_renamed_12);
            fm.dangChayAuto = 1;
        }
        if (fv.boolean_for(soLuongKhoa)) {
            fd_0 fd_02 = new fd_0(-9, var_short_arr_if[soLuongKhoa], 50, 20);
            fh.var_java_util_Vector_char.addElement(fd_02);
            fh.cfr_renamed_1(fh.var_java_util_Vector_char);
            }
        GameCanvas.var_fv_do.cfr_renamed_1(this.var_java_lang_String_arr_arr_byte[soLuongKhoa]);
        soLuongKhoa += 1;
    }

    public final void cfr_renamed_7() {
    }

    public final void cfr_renamed_3() {
        if ((this.var_java_lang_String_arr_arr_do == null)) {
            this.var_java_lang_String_arr_arr_do = MenuChinhAvatar.java_lang_String_arr_arr_for();
        }
        var_en_do = go_0.var_go_0_do;
        if ((var_int_if != null)) {
            byte[] byArray = new byte[1];
            byArray[0] = 56;
            var_byte_arr_if = byArray;
            if ((0xC6 ^ 0xC2) <= 0) {
                return;
            }
        } else {
            if (fv.boolean_for(var_int_if, this.var_java_lang_String_arr_arr_do.length)) {
                this.void_for(170, 170);
                return;
            }
            if (fv.boolean_if(var_int_if, 4)) {
                short[] sArray = new short[3];
                sArray[0] = 12;
                sArray[1] = 480;
                sArray[2] = 230;
                var_short_arr_if = sArray;
                short[] sArray2 = new short[3];
                sArray2[0] = 110;
                sArray2[1] = 110;
                sArray2[2] = 12;
                var_short_arr_do = sArray2;
                fm.fm_do().void_do(var_short_arr_if[var_int_if - 1] * dF.cfr_renamed_12, var_short_arr_do[var_int_if - 1] * dF.cfr_renamed_12);
                fm.dangChayAuto = 1;
                fd_0 fd_02 = new fd_0(-9, var_short_arr_if[var_int_if - 1], var_short_arr_do[var_int_if - 1], 20);
                fh.var_java_util_Vector_char.addElement(fd_02);
                fh.cfr_renamed_1(fh.var_java_util_Vector_char);
                if (((0x56 ^ 9 ^ (2 ^ 0x49)) & (0x21 ^ 0x75 ^ (0xEB ^ 0xAB) ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                fm.dangChayAuto = 0;
            }
        }
        GameCanvas.var_fv_do.cfr_renamed_1(this.var_java_lang_String_arr_arr_do[var_int_if]);
        var_int_if += 1;
    }

    private void void_for(int n, int n2) {
        this.var_int_try = 0;
        coTrangThai = 1;
        fv.cfr_renamed_9();
        fd_0 fd_02 = new fd_0(-9, n, n2, 20);
        fh.var_java_util_Vector_char.addElement(fd_02);
        fh.cfr_renamed_1(fh.var_java_util_Vector_char);
        fm.fm_do().void_do(n * dF.cfr_renamed_12, n2 * dF.cfr_renamed_12);
        fm.dangChayAuto = 1;
        String[] stringArray = MenuChinhAvatar.java_lang_String_arr_do();
        GameCanvas.var_fv_do.cfr_renamed_1(stringArray);
    }

    public static boolean (int n == null) {
        if (fv.boolean_for(coTrangThai ? 1 : 0)) {
            return 1;
        }
        switch (fh.var_int_char) {
            case 23: {
                if (!fv.boolean_if(var_int_case - 1, var_byte_arr_if.length) || !fv.boolean_for(n, var_byte_arr_if[var_int_case - 1])) break;
                return 1;
            }
            case 9: {
                if (!fv.boolean_if(soLuongKhoa - 1, var_byte_arr_if.length) || !fv.boolean_for(n, var_byte_arr_if[soLuongKhoa - 1])) break;
                return 1;
            }
            case 25: {
                if (!fv.boolean_do(soLuong, var_byte_arr_if.length) || !fv.boolean_for(n, var_byte_arr_if[soLuong - 1])) break;
                return 1;
            }
            case 57: {
                if (!fv.boolean_do(var_int_byte, var_byte_arr_if.length) || !fv.boolean_for(n, var_byte_arr_if[var_int_byte - 1])) break;
                return 1;
            }
        }
        return 0;
    }

    private void cfr_renamed_14() {
        this.var_int_int = this.var_java_lang_String_arr_arr_try[this.var_int_try].length * dF.var_byte_new + (dF.cfr_renamed_15 << 1);
        if (fv.boolean_if(this.var_int_int, (dF.var_byte_new << 1) + (dF.cfr_renamed_15 << 1))) {
            this.var_int_int = (dF.var_byte_new << 1) + (dF.cfr_renamed_15 << 1);
        }
        this.var_int_new = 5;
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    public final void (en object == null) {
        if ((this.var_java_lang_String_arr_arr_int == null)) {
            this.var_java_lang_String_arr_arr_int = MenuChinhAvatar.cfr_renamed_7();
        }
        var_en_do = object;
        if ((var_int_byte != null)) {
            short[] sArray = new short[1];
            sArray[0] = 192;
            var_short_arr_if = sArray;
            byte[] byArray = new byte[1];
            byArray[0] = 56;
            var_byte_arr_if = byArray;
            object = new fd_0(-9, var_short_arr_if[var_int_byte] + 12, 135, 20);
            fh.var_java_util_Vector_char.addElement(object);
            fh.cfr_renamed_1(fh.var_java_util_Vector_char);
            fm.fm_do().void_do(var_short_arr_if[var_int_byte] + 12, 130 * dF.cfr_renamed_12);
            if (" ".length() != " ".length()) {
                return;
            }
        } else {
            if (fv.boolean_for(var_int_byte, this.var_java_lang_String_arr_arr_int.length)) {
                this.void_for(180, 240);
                return;
            }
            fm.dangChayAuto = 1;
        }
        GameCanvas.var_fv_do.cfr_renamed_1(this.var_java_lang_String_arr_arr_int[var_int_byte]);
        var_int_byte += 1;
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    /*
     * Unable to fully structure code
     */
    private void (String[] var1_1 == null) {
        this.var_java_lang_String_arr_arr_try = new String[var1_1.length][];
        var2_2 = 0;
        if ("   ".length() >= ((32 ^ 39) & ~(46 ^ 41))) ** GOTO lbl9
        return;
lbl-1000:
        // 1 sources

        {
            this.var_java_lang_String_arr_arr_try[var2_2] = GameCanvas.var_fz_0_case.java_lang_String_arr_do(var1_1[var2_2], GameCanvas.soLuongKhoa - (this.cfr_renamed_13 << 1) - 35 * dF.cfr_renamed_12);
            ++var2_2;
lbl9:
            // 2 sources

            ** while (!fv.cfr_renamed_3((int)var2_2, (int)this.var_java_lang_String_arr_arr_try.length))
        }
lbl10:
        // 1 sources

        this.cfr_renamed_14();
        fv.dangChayAuto = 1;
    }

    public static void cfr_renamed_4() {
        int n = cfr_renamed_14;
        if (fv.boolean_if(n, 3)) {
            n = 0;
            } else if (fv.boolean_for(n, 3)) {
            n = 1;
            } else if (fv.boolean_for(n, 4)) {
            n = 2;
        }
        if (fv.boolean_if(n, var_short_arr_if.length)) {
            GameCanvas.var_fv_do = new fv();
            GameCanvas.var_fv_do.cfr_renamed_12();
        }
    }

    private static boolean boolean_for(int n, int n2) {
        return n == n2;
    }

            public final void cfr_renamed_5() {
        if ((this.var_java_lang_String_arr_arr_char == null)) {
            this.var_java_lang_String_arr_arr_char = MenuChinhAvatar.java_lang_String_arr_arr_do();
        }
        var_en_do = go_0.var_go_0_do;
        short[] sArray = new short[3];
        var_short_arr_if = sArray;
        sArray[0] = 865;
        fv.var_short_arr_if[1] = 445;
        fv.var_short_arr_if[2] = 95;
        byte[] byArray = new byte[5];
        byArray[0] = 57;
        byArray[1] = 104;
        byArray[2] = 58;
        byArray[3] = 100;
        byArray[4] = 107;
        var_byte_arr_if = byArray;
        if (fv.boolean_for(var_int_case)) {
            if (fv.boolean_for(var_int_case, var_short_arr_if.length)) {
                this.void_for(640, 150);
                return;
            }
            fm.fm_do().void_do(var_short_arr_if[var_int_case] * dF.cfr_renamed_12, 20 * dF.cfr_renamed_12);
            fm.dangChayAuto = 1;
            fd_0 fd_02 = new fd_0(-9, var_short_arr_if[var_int_case], 50, 20);
            fh.var_java_util_Vector_char.addElement(fd_02);
            fh.cfr_renamed_1(fh.var_java_util_Vector_char);
            }
        GameCanvas.var_fv_do.cfr_renamed_1(this.var_java_lang_String_arr_arr_char[var_int_case]);
        var_int_case += 1;
    }

    public final void (en object != null) {
        if ((this.var_java_lang_String_arr_arr_new == null)) {
            this.var_java_lang_String_arr_arr_new = MenuChinhAvatar.cfr_renamed_6();
        }
        var_en_do = object;
        if ((soLuong != null)) {
            short[] sArray = new short[4];
            sArray[0] = 372;
            sArray[1] = -1;
            sArray[2] = -1;
            sArray[3] = 220;
            var_short_arr_if = sArray;
            short[] sArray2 = new short[4];
            sArray2[0] = 25;
            sArray2[1] = -1;
            sArray2[2] = -1;
            sArray2[3] = 25;
            var_short_arr_do = sArray2;
            byte[] byArray = new byte[4];
            byArray[0] = 52;
            byArray[1] = -1;
            byArray[2] = -1;
            byArray[3] = 24;
            var_byte_arr_if = byArray;
            if ("   ".length() <= ((0xFB ^ 0xB4 ^ (0xD3 ^ 0x97)) & (39 + 86 - 24 + 26 ^ (0xC ^ 0x78) ^ -" ".length()))) {
                return;
            }
        } else if (fv.boolean_for(soLuong, this.var_java_lang_String_arr_arr_new.length)) {
            this.void_for(170, 150);
            return;
        }
        if (fv.boolean_for(soLuong, 1)) {
            fv.cfr_renamed_9();
        }
        object = new fd_0(-9, var_short_arr_if[soLuong], var_short_arr_do[soLuong], 20);
        fh.var_java_util_Vector_char.addElement(object);
        fh.cfr_renamed_1(fh.var_java_util_Vector_char);
        fm.fm_do().void_do(var_short_arr_if[soLuong] * dF.cfr_renamed_12, 20 * dF.cfr_renamed_12);
        fm.dangChayAuto = 1;
        GameCanvas.var_fv_do.cfr_renamed_1(this.var_java_lang_String_arr_arr_new[soLuong]);
        soLuong += 1;
    }

    public static void cfr_renamed_8() {
        GameCanvas.coKichHoat = 1;
        cfr_renamed_14 = 0;
        soLuong = 0;
        var_int_if = 0;
        soLuongKhoa = 0;
        cfr_renamed_9 = 0;
        var_int_byte = 0;
        coTrangThai = 0;
        dangChayAuto = 0;
    }

    private static void this() {
        mangSoNguyen = new int[53];
        0 = (0x7B ^ 0x18 ^ (0x72 ^ 0x5B)) & (0x3A ^ 0x6D ^ (0x4A ^ 0x57) ^ -" ".length());
        5 = " ".length() ^ (0xE ^ 0xA);
        3 = "   ".length();
        1 = " ".length();
        7 = 68 + 120 - 173 + 115 ^ 118 + 84 - 77 + 8;
        2 = "  ".length();
        4 = 58 + 109 - 151 + 142 ^ 12 + 116 - 1 + 27;
        10 = 0x8B ^ 0x81;
        6 = 0x71 ^ 0xA ^ (0x5E ^ 0x23);
        8 = 0x8B ^ 0x83;
        20 = 0xB6 ^ 0xA2;
        16777215 = -" ".length() & (0xFFFFFFFF & 0xFFFFFF);
        35 = 0x12 ^ 0x31;
        180 = 74 + 142 - 49 + 13;
        312 = 0xFFFFFD7D & 0x3BA;
        720 = 0xFFFF8AD5 & 0x77FA;
        108 = 0x68 ^ 4;
        100 = 0xF3 ^ 0x97;
        107 = 0x31 ^ 0x5A;
        288 = 0xFFFF87A3 & 0x797C;
        150 = 123 + 106 - 217 + 138;
        -9 = -(0x7F ^ 0x72 ^ (0x5B ^ 0x5F));
        50 = 0xEB ^ 0x92 ^ (0x64 ^ 0x2F);
        865 = 0xFFFFFBE5 & 0x77B;
        445 = -(0xFFFFDA4F & 0x75B1) & (0xFFFFDBFD & 0x75BF);
        95 = 100 + 140 - 11 + 7 ^ 161 + 17 - 45 + 46;
        57 = 0x6B ^ 0x52;
        104 = 149 + 46 - 113 + 114 ^ 105 + 111 - 173 + 129;
        58 = 0xA6 ^ 0x9C;
        640 = -(0xFFFFDDCE & 0x3B37) & (0xFFFFBFA5 & 0x5BDF);
        372 = 0xFFFF81FF & 0x7F74;
        -1 = -" ".length();
        220 = (0xE4 ^ 0xAF) + (0xA0 ^ 0x8A) - (0x1C ^ 0x70) + (70 + 191 - 184 + 134);
        25 = 0xAD ^ 0x87 ^ (0xAE ^ 0x9D);
        52 = 0x7E ^ 0x4A;
        24 = 0xD8 ^ 0xC0;
        170 = 49 + 74 - 31 + 78;
        12 = 0x73 ^ 0xD ^ (0xF6 ^ 0x84);
        36 = 0xD6 ^ 0x90 ^ (0x37 ^ 0x55);
        15 = 0xBD ^ 0xB2;
        192 = 183 + 0 - 114 + 123;
        56 = 0xA2 ^ 0x9A;
        135 = (0xD5 ^ 0xBB) + (0xB8 ^ 0x94) - (0x88 ^ 0xBD) + (0x14 ^ 0x36);
        130 = (0x27 ^ 0x3E) + (0x63 ^ 0x59) - (0xDF ^ 0x96) + (0x61 ^ 0x19);
        240 = 112 + 18 - 123 + 230 + (0xB ^ 0xF) - (0x58 ^ 0x71) + (0x7F ^ 0x57);
        480 = -(0xFFFFF75F & 0x58A6) & (0xFFFFDBEF & 0x75F5);
        230 = (5 ^ 0x68) + (86 + 159 - 74 + 33) - (128 + 149 - 187 + 91) + (0xE7 ^ 0x85);
        110 = 0x69 ^ 7;
        23 = 0x64 ^ 0x2E ^ (0x6A ^ 0x37);
        9 = 57 + 64 - 44 + 98 ^ 97 + 31 - 101 + 139;
        470 = -(0xFFFFFE0B & 0x7BFD) & (0xFFFFFFFF & 0x7BDE);
        168 = (0x66 ^ 0x1A) + (0x44 ^ 0x69) - (0x20 ^ 0x30) + (0x4E ^ 0x41);
        13 = 0x74 ^ 0x1F ^ (0x50 ^ 0x36);
    }

                static {
        fv.this();
        var_int_if = 0;
        var_int_byte = 0;
        dangChayAuto = 0;
        cfr_renamed_9 = 0;
        soLuongKhoa = 0;
        var_int_case = 0;
        soLuong = 0;
        var_int_char = 0;
        cfr_renamed_14 = 0;
        coTrangThai = 0;
        byte[] byArray = new byte[5];
        byArray[0] = 3;
        byArray[1] = 7;
        byArray[2] = 4;
        byArray[3] = 1;
        byArray[4] = 5;
        var_byte_arr_do = byArray;
    }

    private static boolean boolean_int(int n) {
        return n > 0;
    }

        static void (fv object == null) {
        if (fv.boolean_if(((fv)object).var_int_try, ((fv)object).var_java_lang_String_arr_arr_try.length - 1)) {
            ((fv)object).var_int_try += 1;
            dangChayAuto = 1;
            ((fv)object).cfr_renamed_14();
            if (fv.boolean_for(fh.var_int_char, 23)) {
                if (fv.boolean_for(var_int_case, 1) && fv.boolean_for(((fv)object).var_int_try, ((fv)object).var_java_lang_String_arr_arr_try.length - 1)) {
                    fm.fm_do().void_do(var_short_arr_if[0], 20);
                    fm.dangChayAuto = 1;
                    object = new fd_0(-9, var_short_arr_if[var_int_case - 1], 50, 20);
                    fh.var_java_util_Vector_char.addElement(object);
                    fh.cfr_renamed_1(fh.var_java_util_Vector_char);
                    return;
                }
            } else if (fv.boolean_for(fh.var_int_char, 9) && fv.boolean_for(soLuongKhoa, 1) && fv.boolean_for(((fv)object).var_int_try, ((fv)object).var_java_lang_String_arr_arr_try.length - 1)) {
                ((fv)object).cfr_renamed_2();
                return;
            }
        } else if (fv.boolean_for(((fv)object).var_int_try, ((fv)object).var_java_lang_String_arr_arr_try.length - 1)) {
            fm.dangChayAuto = 0;
            if (fv.boolean_for(100, fh.var_int_char)) {
                GameCanvas.var_fv_do = null;
                return;
            }
            if ((GameCanvas.var_en_do == gO.instance) && fv.cfr_renamed_0(((fv)object).var_java_lang_String_arr_arr_if) && fv.boolean_for(cfr_renamed_9, ((fv)object).var_java_lang_String_arr_arr_if.length)) {
                ((fv)object).cfr_renamed_13();
                return;
            }
            if (fv.boolean_for(fh.var_int_char, 24)) {
                if (!(cfr_renamed_14 != 3) || !(cfr_renamed_14 != 4) || !(cfr_renamed_14 != 5) || fv.boolean_for(cfr_renamed_14, 6)) {
                    fv.cfr_renamed_9();
                    GameCanvas.var_fv_do = new fv();
                    GameCanvas.var_fv_do.cfr_renamed_12();
                    dangChayAuto = 1;
                    return;
                }
                if (fv.boolean_for(cfr_renamed_14, 7) && fv.boolean_for(dangChayAuto ? 1 : 0) && (coTrangThai ? 1 : 0 != null)) {
                    ((fv)object).void_for(470, 168);
                    return;
                }
            } else if (fv.boolean_for(fh.var_int_char, 25)) {
                if (fv.boolean_for(soLuong, ((fv)object).var_java_lang_String_arr_arr_new.length - 1)) {
                    GameCanvas.var_fv_do = null;
                    }
            } else if (fv.boolean_for(fh.var_int_char, 13)) {
                ((fv)object).var_int_try = 0;
                if ((coTrangThai ? 1 : 0 != null)) {
                    ((fv)object).cfr_renamed_3();
                    return;
                }
            }
            ((fv)object).var_int_new = 5;
            dangChayAuto = 0;
        }
    }

    public final void cfr_renamed_13() {
        if (fv.boolean_for(cfr_renamed_9, var_byte_arr_do.length + 1)) {
            GameCanvas.var_fv_do = null;
            GameCanvas.coKichHoat = 0;
            return;
        }
        if ((this.var_java_lang_String_arr_arr_if == null)) {
            this.var_java_lang_String_arr_arr_if = MenuChinhAvatar.cfr_renamed_5();
        }
        var_en_do = gO.instance;
        dangChayAuto = 1;
        if (fv.boolean_if(cfr_renamed_9, var_byte_arr_do.length)) {
            gO.cfr_renamed_1().soLuong = var_byte_arr_do[cfr_renamed_9];
        }
        GameCanvas.var_fv_do.cfr_renamed_1(this.var_java_lang_String_arr_arr_if[cfr_renamed_9]);
        cfr_renamed_9 += 1;
    }

    public final void cfr_renamed_6() {
        if (fv.boolean_for(dangChayAuto ? 1 : 0)) {
            super.cfr_renamed_6();
        }
        if (fv.boolean_for(dangChayAuto ? 1 : 0) && (var_en_do == GameCanvas.var_en_do) && (GameCanvas.var_aa_do == null) && (GameCanvas.var_dj_0_do == null)) {
            if ((this.var_java_lang_String_arr_arr_try != null)) {
                int n = 0;
                GameCanvas.var_boolean_arr_if[8] = n;
                GameCanvas.var_boolean_arr_if[6] = n;
                GameCanvas.var_boolean_arr_if[4] = n;
                GameCanvas.var_boolean_arr_if[2] = n;
            }
            if ((this.var_java_lang_String_arr_arr_try != null) && fv.boolean_if(this.var_int_try, this.var_java_lang_String_arr_arr_try.length - 1) && (GameCanvas.var_en_do != fo.fo_do())) {
                GameCanvas.var_boolean_case = GameCanvas.var_boolean_new = 0;
                GameCanvas.coTrangThai = GameCanvas.var_boolean_new;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics == null) {
        if ((var_en_do == GameCanvas.var_en_do) && (GameCanvas.var_aa_do == null) && (GameCanvas.var_dj_0_do == null)) {
            GameCanvas.hienThongBaoPopup(graphics);
            graphics.translate(0, (int)GameCanvas.var_byte_do);
            if (!(dangChayAuto ? 1 : 0 != null) || (GameCanvas.var_int_goto % 20 > 2)) {
                cU.cfr_renamed_1(graphics, this.cfr_renamed_13, this.var_int_new, GameCanvas.soLuongKhoa - (this.cfr_renamed_13 << 1), this.var_int_int, 16777215, 1, 0);
                if ((this.var_java_lang_String_arr_arr_try != null) && (this.var_java_lang_String_arr_arr_try[this.var_int_try] != null)) {
                    int n = 0;
                    if (fv.boolean_for(this.var_java_lang_String_arr_arr_try[this.var_int_try].length, 1)) {
                        n = 2;
                    }
                    int n2 = 0;
                    while (!(n2 >= this.var_java_lang_String_arr_arr_try[this.var_int_try].length)) {
                        GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, this.var_java_lang_String_arr_arr_try[this.var_int_try][n2], this.cfr_renamed_13 + (GameCanvas.soLuongKhoa - (this.cfr_renamed_13 << 1)) / 2, this.var_int_new + this.var_int_int / 2 - this.var_java_lang_String_arr_arr_try[this.var_int_try].length * dF.var_byte_new / 2 + n2 * dF.var_byte_new - n, 2);
                        ++n2;
                    }
                    this.var_byte_do = (byte)(this.var_byte_do + 1);
                    if ((this.var_byte_do >= 8)) {
                        this.var_byte_do = (byte)0;
                    }
                    if ((GameCanvas.var_en_do == gO.instance)) {
                        graphics.translate(-gO.soLuongKhoa + gO.cfr_renamed_1().cfr_renamed_4, -gO.var_int_if + gO.cfr_renamed_1().var_int_int);
                        if (((0xE ^ 0x49 ^ (0x37 ^ 0x3E)) & (70 + 152 - 92 + 68 ^ 48 + 37 - 63 + 114 ^ -" ".length())) != 0) {
                            return;
                        }
                    } else {
                        graphics.translate(-fm.fm_do().cfr_renamed_3, -fm.fm_do().cfr_renamed_2);
                    }
                }
            }
            if (fv.boolean_for(dangChayAuto ? 1 : 0)) {
                super.cfr_renamed_1(graphics);
                if (!fv.boolean_do(GameCanvas.var_int_goto % 10, 5) || fv.boolean_int(GameCanvas.cfr_renamed_12)) {
                    fz_0 fz_02 = GameCanvas.var_fz_0_new;
                    if (fv.boolean_int(GameCanvas.cfr_renamed_12)) {
                        fz_02 = GameCanvas.var_fz_0_if;
                    }
                    fz_02.cfr_renamed_1(graphics, MenuChinhAvatar.cW, GameCanvas.var_fs_arr_do[1].soLuong + en.cfr_renamed_20 / 2, GameCanvas.var_fs_arr_do[1].var_int_if + GameCanvas.this / 2 - dF.cfr_renamed_6 / 2, 2);
                }
            }
        }
    }

    private void cfr_renamed_12() {
        int n;
        if ((this.var_java_lang_String_arr_arr_case == null)) {
            this.var_java_lang_String_arr_arr_case = MenuChinhAvatar.java_lang_String_arr_arr_if();
        }
        var_en_do = dR.var_dR_do;
        if ((cfr_renamed_14 != null)) {
            short[] sArray = new short[5];
            sArray[0] = (short)(dR.dR_do().var_fs_arr_do[0].soLuong * fh.var_int_int + 12);
            sArray[1] = (short)(dR.var_fs_for.soLuong + 12);
            sArray[2] = (short)dR.var_int_try;
            sArray[3] = (short)((bm)dR.var_e_0_do).cfr_renamed_2;
            sArray[4] = (short)(dR.var_fs_do.soLuong + 12);
            var_short_arr_if = sArray;
            short[] sArray2 = new short[5];
            sArray2[0] = 36;
            sArray2[1] = 36;
            sArray2[2] = (short)(dR.var_int_else + 15);
            sArray2[3] = 36;
            sArray2[4] = 36;
            var_short_arr_do = sArray2;
        }
        if (fv.boolean_if(n = cfr_renamed_14, 3)) {
            n = 0;
            if ("  ".length() == 0) {
                return;
            }
        } else if (fv.boolean_for(n, 3)) {
            n = 1;
            if (" ".length() <= ((25 + 133 - 99 + 118 ^ 32 + 5 - -27 + 86) & (81 + 34 - -43 + 26 ^ 10 + 30 - -116 + 3 ^ -" ".length()))) {
                return;
            }
        } else if (fv.boolean_for(n, 4)) {
            n = 2;
            } else if (fv.boolean_for(n, 5)) {
            n = 3;
            if ((0x16 ^ 0x12) == 0) {
                return;
            }
        } else if (fv.boolean_for(n, 6)) {
            n = 4;
        }
        if (!(cfr_renamed_14 >= 3) || !(cfr_renamed_14 != 4) || fv.boolean_for(cfr_renamed_14, 5)) {
            fd_0 fd_02 = new fd_0(-9, var_short_arr_if[n], var_short_arr_do[n], 20);
            fh.var_java_util_Vector_char.addElement(fd_02);
            fh.cfr_renamed_1(fh.var_java_util_Vector_char);
            }
        fm.fm_do().void_do(var_short_arr_if[n] * dF.cfr_renamed_12, 36 * dF.cfr_renamed_12);
        fm.dangChayAuto = 1;
        GameCanvas.var_fv_do.cfr_renamed_1(this.var_java_lang_String_arr_arr_case[cfr_renamed_14]);
        cfr_renamed_14 += 1;
        dR.dR_do().var_fl_0_try = null;
    }

    public fv() {
        coTrangThai = 0;
        dangChayAuto = 1;
        this.cfr_renamed_13 = 10;
        this.var_int_try = 0;
        ((dF)this).cfr_renamed_3 = new fl_0("", new fu(this));
        this.var_fl_0_try = new fl_0(MenuChinhAvatar.ae, new ec_0());
    }

    }

