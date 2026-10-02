/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class aG
extends en {
    private int soLuong;
    private int var_int_if;
    private int soLuongKhoa;
    private en var_en_do;
    private fl_0 var_fl_0_do;
    private int cfr_renamed_3;
    private fl_0 var_fl_0_if;
    private Vector var_java_util_Vector_do;
    private fl_0 var_fl_0_for;
    private int cfr_renamed_4;
    private Image var_javax_microedition_lcdui_Image_do;
    public static aG var_aG_do;
    private static int[] mangSoNguyen;
    private int cfr_renamed_5;
    private int cfr_renamed_6;
    private int cfr_renamed_7 = 0;
    private int cfr_renamed_8 = 0;

                private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

            public final void (Graphics graphics != 0) {
        GameCanvas.hienThongBaoPopup(graphics);
        if ((al_0.dangChayAuto)) {
            GameCanvas.var_fa_0_do.cfr_renamed_0(graphics);
            GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_break.toUpperCase(), String.valueOf(AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) + MenuChinhAvatar.da, String.valueOf(AngelChip.duLieuNguoiChoi.mangSoNguyen[2]) + MenuChinhAvatar.cq);
            if (((0x45 ^ 0x1C ^ (0x38 ^ 0x2C)) & (0x40 ^ 0x33 ^ (0xB7 ^ 0x89) ^ -" ".length())) != 0) {
                return;
            }
        } else if ((this.var_en_do != 0)) {
            this.var_en_do.cfr_renamed_0(graphics);
        }
        if ((el.var_el_do != 0) && (GameCanvas.var_ez_do == el.var_el_do)) {
            return;
        }
        if (!(al_0.dangChayAuto)) {
            v_0.v_0_do().cfr_renamed_1(graphics);
            graphics.translate(0, this.var_int_if + v_0.var_byte_do + dF.cfr_renamed_15);
            graphics.setClip(this.cfr_renamed_3 + 5, 0, this.cfr_renamed_5 - 10, v_0.v_0_do().var_int_if - v_0.var_byte_do - 2 * dF.cfr_renamed_15);
            if (-" ".length() > ((0x95 ^ 0x93 ^ (0x74 ^ 0x33)) & (0x73 ^ 0x5B ^ (0x5A ^ 0x33) ^ -" ".length()))) {
                return;
            }
        } else {
            graphics.translate(0, this.var_int_if);
            graphics.setClip(this.cfr_renamed_3 + 5, 0, this.cfr_renamed_5 - 10, this.soLuongKhoa);
        }
        if (aG.boolean_do(this.cfr_renamed_8, 1)) {
            int n = (this.soLuongKhoa - v_0.var_byte_do + (dF.cfr_renamed_15 << 1)) / 6;
            GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.bI) + AngelChip.duLieuNguoiChoi.chuoiGiaTri, this.cfr_renamed_3 + this.cfr_renamed_5 / 2, n / 2, 2);
            if (!(dR.coTrangThai)) {
                GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.db) + ": " + AngelChip.duLieuNguoiChoi.chuoiPhu, this.cfr_renamed_3 + this.cfr_renamed_5 / 2, n / 2 + n, 2);
            }
            GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, String.valueOf(AngelChip.duLieuNguoiChoi.mangSoNguyen[2]) + MenuChinhAvatar.cq, this.cfr_renamed_3 + this.cfr_renamed_5 / 2, n / 2 + (n << 1), 2);
            if ((dR.coTrangThai)) {
                GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, go_0.java_lang_String_do(), this.cfr_renamed_3 + this.cfr_renamed_5 / 2, n / 2 + n * 3, 2);
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            }
        } else {
            graphics.translate(0, -cg_0.cfr_renamed_9);
            if ((this.cfr_renamed_7 == 0)) {
                this.cfr_renamed_2(graphics);
                if ("   ".length() == 0) {
                    return;
                }
            } else {
                this.cfr_renamed_3(graphics);
            }
        }
        if (!(GameCanvas.var_fv_do != 0) || !(fv.dangChayAuto)) {
            super.cfr_renamed_1(graphics);
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

        private void cfr_renamed_3() {
        int n;
        if ((this.var_java_util_Vector_do == 0)) {
            return;
        }
        this.var_java_util_Vector_do.size();
        int n2 = this.var_java_util_Vector_do.size() * this.cfr_renamed_6;
        int n3 = this.var_java_util_Vector_do.size();
        if (aG.boolean_do(fh.var_int_char, 25)) {
            n2 = this.cfr_renamed_6 << 1;
            n3 = 2;
        }
        if (!(al_0.dangChayAuto)) {
            n = v_0.var_byte_do + dF.cfr_renamed_15;
            if ("   ".length() > (0x7E ^ 0x5D ^ (0x10 ^ 0x37))) {
                return;
            }
        } else {
            n = 0;
        }
        GameCanvas.var_cg_0_do.cfr_renamed_1(this.cfr_renamed_3, this.var_int_if + n, this.cfr_renamed_5, this.cfr_renamed_6, this.cfr_renamed_5, n2, this.cfr_renamed_5, this.soLuongKhoa - (v_0.var_byte_do + 2 * dF.cfr_renamed_15) - dF.cfr_renamed_15, n3);
    }

    public final void cfr_renamed_7() {
        int n;
        if ((this.var_en_do != 0)) {
            this.var_en_do.cfr_renamed_7();
        }
        if ((this.cfr_renamed_7 == 0)) {
            dN dN2 = (dN)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_18);
            n = GameCanvas.var_fz_0_try.cfr_renamed_1(dN2.cfr_renamed_0);
            if (-" ".length() > "   ".length()) {
                return;
            }
        } else {
            n = GameCanvas.var_fz_0_try.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_float[this.cfr_renamed_18]);
        }
        if (aG.boolean_if(n, this.cfr_renamed_5 - 20)) {
            this.cfr_renamed_4 += this.soLuong;
            if (aG.cfr_renamed_3(this.cfr_renamed_4, -(n - (this.cfr_renamed_5 - 30)))) {
                this.soLuong = 1;
            }
            if (aG.boolean_for(this.cfr_renamed_4)) {
                this.soLuong = -1;
                if (((0x61 ^ 0x57 ^ (0x2B ^ 0x36)) & (" ".length() ^ (0x62 ^ 0x48) ^ -" ".length())) != 0) {
                    return;
                }
            }
        } else {
            this.cfr_renamed_4 = 0;
        }
        if ((this.cfr_renamed_8 == 0)) {
            if ((fh.var_int_char != 25)) {
                this.var_fl_0_try = this.var_fl_0_do;
                ((dF)this).cfr_renamed_3 = null;
                return;
            }
            this.var_fl_0_try = null;
            ((dF)this).cfr_renamed_3 = this.var_fl_0_if;
            return;
        }
        this.var_fl_0_try = null;
        ((dF)this).cfr_renamed_3 = null;
    }

    static {
        aG.cfr_renamed_13();
    }

    public final void cfr_renamed_2() {
        String string;
        if ((this.var_javax_microedition_lcdui_Image_do == 0)) {
            e.void_do(MenuChinhAvatar.de);
            this.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("coin");
            e.cfr_renamed_1();
        }
        if (aG.boolean_do(fh.var_int_char, 25)) {
            this.cfr_renamed_7 = 1;
            string = MenuChinhAvatar.var_java_lang_String_arr_goto[1];
            et_0.et_0_do().cfr_renamed_6(0, 0);
            GameCanvas.cfr_renamed_8();
            if (-" ".length() > -" ".length()) {
                return;
            }
        } else {
            string = MenuChinhAvatar.var_java_lang_String_arr_goto[0];
            this.cfr_renamed_7 = 0;
        }
        this.cfr_renamed_5();
        v_0.v_0_do().cfr_renamed_1(string, this.cfr_renamed_5, this.soLuongKhoa, 2);
        if ((al_0.dangChayAuto)) {
            v_0.v_0_do().cfr_renamed_6 = 25 + en.cfr_renamed_16 + 1;
        }
        this.var_int_if = v_0.v_0_do().cfr_renamed_6;
        this.cfr_renamed_3();
    }

        public final void (int n == boolean bl) {
        if ((bl) && aG.boolean_do(this.cfr_renamed_18, n)) {
            if (aG.cfr_renamed_1(((dF)this).cfr_renamed_3)) {
                ((dF)this).cfr_renamed_3.cfr_renamed_0();
                if ("   ".length() == 0) {
                    return;
                }
            } else if ((this.var_fl_0_try != 0)) {
                this.var_fl_0_try.cfr_renamed_0();
            }
        }
        super.cfr_renamed_1(n, bl);
    }

    public final void b_() {
        this.var_fl_0_try = this.var_fl_0_do = new fl_0(MenuChinhAvatar.var_java_lang_String_arr_goto[0], 1);
        ((dF)this).cfr_renamed_3 = this.var_fl_0_if = new fl_0(MenuChinhAvatar.cT, 2);
        this.var_fl_0_new = this.var_fl_0_for = new fl_0(MenuChinhAvatar.by, 0);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_2(Graphics var1_1) {
        var2_2 = this.var_javax_microedition_lcdui_Image_do.getWidth() + 14;
        var3_3 = this.var_java_util_Vector_do.size();
        var4_4 = 0;
        if ("  ".length() < (73 ^ 118 ^ (3 ^ 56))) ** GOTO lbl20
        return;
lbl-1000:
        // 1 sources

        {
            if (aG.boolean_do(var4_4, this.cfr_renamed_18) && aG.cfr_renamed_0((int)this.var_boolean_new)) {
                if (aG.cfr_renamed_1((int)al_0.dangChayAuto)) {
                    var1_1.setColor(14328855);
                    var1_1.fillRect(this.cfr_renamed_3, var4_4 * this.cfr_renamed_6, this.cfr_renamed_5 - 3 * dF.cfr_renamed_12, this.cfr_renamed_6);
                    if (((89 ^ 11) & ~(210 ^ 128)) == -" ".length()) {
                        return;
                    }
                } else {
                    GameCanvas.var_fa_0_do.cfr_renamed_3(var1_1, this.cfr_renamed_3 + 6, var4_4 * this.cfr_renamed_6, this.cfr_renamed_5 - 6 * dF.cfr_renamed_12, this.cfr_renamed_6);
                }
            }
            var1_1.drawImage(this.var_javax_microedition_lcdui_Image_do, this.cfr_renamed_3 + var2_2 / 2, var4_4 * this.cfr_renamed_6 + this.cfr_renamed_6 / 2, 3);
            ++var4_4;
lbl20:
            // 2 sources

            ** while (!aG.cfr_renamed_2((int)var4_4, (int)var3_3))
        }
lbl21:
        // 1 sources

        var4_4 = 0;
        if (" ".length() == " ".length()) ** GOTO lbl40
        return;
lbl-1000:
        // 1 sources

        {
            var5_5 = (dN)this.var_java_util_Vector_do.elementAt(var4_4);
            v0 = this.cfr_renamed_3 + var2_2 - 3;
            v1 = this.cfr_renamed_5 - var2_2 - 2;
            if (aG.cfr_renamed_0((int)al_0.dangChayAuto)) {
                v2 = v_0.var_byte_do + 2 * dF.cfr_renamed_15;
                if (" ".length() <= 0) {
                    return;
                }
            } else {
                v2 = 0;
            }
            var1_1.setClip(v0, cg_0.cfr_renamed_9, v1, this.soLuongKhoa - v2);
            GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, var5_5.cfr_renamed_0, this.cfr_renamed_3 + var2_2, var4_4 * this.cfr_renamed_6 + this.cfr_renamed_6 / 2 - dF.var_byte_try / 2, 0);
            ++var4_4;
lbl40:
            // 2 sources

            ** while (!aG.cfr_renamed_2((int)var4_4, (int)var3_3))
        }
lbl41:
        // 1 sources

    }

    public static aG cfr_renamed_1() {
        if ((var_aG_do == 0)) {
            var_aG_do = new aG();
        }
        return var_aG_do;
    }

    private void cfr_renamed_5() {
        if ((al_0.dangChayAuto)) {
            this.cfr_renamed_5 = GameCanvas.soLuongKhoa + 8;
            this.soLuongKhoa = GameCanvas.var_int_case - 25 - en.cfr_renamed_16 + (dF.cfr_renamed_15 << 1);
            if (-"   ".length() > 0) {
                return;
            }
        } else {
            this.cfr_renamed_5 = ThongTinNhanVat.cfr_renamed_1().cfr_renamed_9;
            this.soLuongKhoa = ThongTinNhanVat.cfr_renamed_1().var_int_if;
        }
        this.cfr_renamed_6 = en.cfr_renamed_21;
        this.cfr_renamed_3 = GameCanvas.cfr_renamed_15 - this.cfr_renamed_5 / 2;
    }

        private static boolean boolean_for(int n) {
        return n > 0;
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_3(Graphics var1_1) {
        var2_2 = 0;
        if ("   ".length() > -" ".length()) ** GOTO lbl20
        return;
lbl-1000:
        // 1 sources

        {
            if (aG.cfr_renamed_0((int)this.var_boolean_new) && aG.boolean_do(var2_2, this.cfr_renamed_18)) {
                GameCanvas.var_fa_0_do.cfr_renamed_3(var1_1, this.cfr_renamed_3 + 3 * dF.cfr_renamed_12, var2_2 * this.cfr_renamed_6 + 5, this.cfr_renamed_5 - 6 * dF.cfr_renamed_12, this.cfr_renamed_6);
            }
            v0 = MenuChinhAvatar.var_java_lang_String_arr_float[var2_2];
            v1 = this.cfr_renamed_3 + 10;
            if (aG.boolean_do(this.cfr_renamed_18, var2_2)) {
                v2 = this.cfr_renamed_4;
                if ((2 ^ 101 ^ (61 ^ 94)) < -" ".length()) {
                    return;
                }
            } else {
                v2 = 0;
            }
            GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, v0, v1 + v2, var2_2 * this.cfr_renamed_6 + 5 + this.cfr_renamed_6 / 2 - dF.var_byte_try / 2, 0);
            ++var2_2;
lbl20:
            // 2 sources

            ** while (!aG.cfr_renamed_2((int)var2_2, (int)2))
        }
lbl21:
        // 1 sources

    }

    public aG() {
        new fs(0, 1);
        this.cfr_renamed_4 = 0;
        this.soLuong = -1;
    }

    private void cfr_renamed_8() {
        String string;
        if ((this.cfr_renamed_8 == 0)) {
            this.cfr_renamed_8 = 1;
            this.var_fl_0_try = null;
            string = MenuChinhAvatar.var_java_lang_String_arr_goto[2];
            if ("   ".length() < 0) {
                return;
            }
        } else {
            if (aG.boolean_do(this.cfr_renamed_7, 1)) {
                string = MenuChinhAvatar.var_java_lang_String_arr_goto[1];
                if (((0xCE ^ 0x96) & ~(0x9D ^ 0xC5)) < 0) {
                    return;
                }
            } else {
                string = MenuChinhAvatar.var_java_lang_String_arr_goto[0];
            }
            this.cfr_renamed_8 = 0;
        }
        v_0.v_0_do().cfr_renamed_1(string, this.cfr_renamed_8);
    }

    private static void cfr_renamed_13() {
        mangSoNguyen = new int[18];
        0 = (0xFF ^ 0xC6) & ~(0x76 ^ 0x4F);
        25 = 0x8E ^ 0x97;
        1 = " ".length();
        2 = "  ".length();
        -1 = -" ".length();
        -76 = -(0x6C ^ 0x1B ^ (0x65 ^ 0x5E));
        -91 = -(217 + 75 - 132 + 90 ^ 113 + 147 - 235 + 136);
        100 = 234 + 140 - 148 + 26 ^ 139 + 117 - 246 + 142;
        5 = 0x64 ^ 0x5C ^ (6 ^ 0x3B);
        10 = 0xA2 ^ 0xBC ^ (0xB5 ^ 0xA1);
        6 = 5 ^ 0x4A ^ (0x6A ^ 0x23);
        3 = "   ".length();
        8 = 82 + 163 - 134 + 89 ^ 99 + 141 - 118 + 70;
        14 = 0xCD ^ 0xC3;
        14328855 = -(0xFFFFCDDF & 0x7BE9) & (0xFFFFEDFF & 0xDAFFDF);
        4 = 0xB2 ^ 0xB6;
        20 = 0xA5 ^ 0xB1;
        30 = 0x4F ^ 0x51;
    }

    public final void cfr_renamed_6() {
        super.cfr_renamed_6();
        if (!(al_0.dangChayAuto)) {
            if (!(GameCanvas.var_boolean_arr_do[4] == 0) || (GameCanvas.var_boolean_arr_do[6] != 0)) {
                this.cfr_renamed_8();
            }
            if ((GameCanvas.coTrangThai) && aG.cfr_renamed_1(GameCanvas.boolean_do(0, v_0.v_0_do().cfr_renamed_6, GameCanvas.soLuongKhoa, v_0.var_byte_do) ? 1 : 0)) {
                GameCanvas.coTrangThai = 0;
                this.cfr_renamed_8();
            }
        }
    }

    public final void void_do(en en2) {
        this.cfr_renamed_2();
        this.cfr_renamed_8 = 0;
        this.cfr_renamed_18 = 0;
        this.var_en_do = en2;
        this.b_();
        super.cfr_renamed_4();
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                GameCanvas.var_cg_0_do.coTrangThai = 0;
                this.var_en_do.cfr_renamed_4();
                this.var_javax_microedition_lcdui_Image_do = null;
                return;
            }
            case 1: 
            case 2: {
                if ((this.cfr_renamed_7 == 0)) {
                    Object object = this;
                    Object object2 = (dN)((aG)object).var_java_util_Vector_do.elementAt(((en)object).cfr_renamed_18);
                    if (aG.cfr_renamed_4(((dN)object2).cfr_renamed_2.indexOf(MenuChinhAvatar.var_java_lang_String_else), -1)) {
                        String string = GameCanvas.var_fz_0_try.cfr_renamed_1(((dN)object2).cfr_renamed_2, MenuChinhAvatar.O, AngelChip.duLieuNguoiChoi.chuoiGiaTri);
                        GameCanvas.cfr_renamed_1(MenuChinhAvatar.aK, new ey(string));
                        return;
                    }
                    if (aG.cfr_renamed_4(((dN)object2).cfr_renamed_2.indexOf("napthe:"), -1)) {
                        String string = ((dN)object2).cfr_renamed_2.substring(0, ((dN)object2).cfr_renamed_2.indexOf("napthe:") + "napthe:".length());
                        String string2 = string = GameCanvas.var_fz_0_try.cfr_renamed_1(((dN)object2).cfr_renamed_2, string, "");
                        string = ((dN)object2).cfr_renamed_0;
                        object2 = string2;
                        ey_0[] ey_0Array = new ey_0[2];
                        ey_0[] ey_0Array2 = ey_0Array;
                        ey_0Array[0] = new ey_0();
                        ey_0Array2[1] = new ey_0();
                        ey_0Array2[0].void_do(0);
                        ey_0Array2[1].void_do(1);
                        el.cfr_renamed_1().cfr_renamed_1(ey_0Array2, string, MenuChinhAvatar.var_java_lang_String_arr_arr_do, new fl_0(MenuChinhAvatar.aC, new ew((aG)object, (String)object2, ey_0Array2)));
                        GameCanvas.var_ez_do = el.cfr_renamed_1();
                        return;
                    }
                    if (aG.cfr_renamed_4(((dN)object2).cfr_renamed_2.indexOf("ServerNap:"), -1)) {
                        String string = ((dN)object2).cfr_renamed_2.substring(0, ((dN)object2).cfr_renamed_2.indexOf("ServerNap:") + "ServerNap:".length());
                        string = GameCanvas.var_fz_0_try.cfr_renamed_1(((dN)object2).cfr_renamed_2, string, "");
                        object2 = string;
                        object = ep_0.ep_0_do();
                        ((bE)object).cfr_renamed_1(-76);
                        ((bE)object).cfr_renamed_1((String)object2);
                        ((bE)object).cfr_renamed_0();
                        GameCanvas.cfr_renamed_8();
                        return;
                    }
                    GameCanvas.cfr_renamed_8();
                    object2 = ((dN)object2).cfr_renamed_1;
                    object = ft_0.ft_0_do();
                    ((bE)object).cfr_renamed_1(-91);
                    ((bE)object).cfr_renamed_1((String)object2);
                    ((bE)object).cfr_renamed_0();
                    return;
                }
                GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.bJ, 100, 1);
                return;
            }
            case 100: {
                try {
                    int n3;
                    if (aG.cfr_renamed_1(GameCanvas.var_ca_do.cfr_renamed_1().equals("") ? 1 : 0)) {
                        return;
                    }
                    n = Integer.parseInt(GameCanvas.var_ca_do.cfr_renamed_1());
                    et_0 et_02 = et_0.et_0_do();
                    if ((this.cfr_renamed_18 == 0)) {
                        n3 = 1;
                        if (-(0x9F ^ 0x9B) > 0) {
                            return;
                        }
                    } else {
                        n3 = 0;
                    }
                    et_02.cfr_renamed_6(n, n3);
                    GameCanvas.cfr_renamed_8();
                    return;
                }
                catch (Exception exception) {
                    }
            }
        }
    }

    public final void void_int(int n) {
    }

    public final void (Vector vector != 0) {
        this.cfr_renamed_5();
        this.var_java_util_Vector_do = vector;
        this.cfr_renamed_3();
        this.cfr_renamed_4 = 0;
    }
}

