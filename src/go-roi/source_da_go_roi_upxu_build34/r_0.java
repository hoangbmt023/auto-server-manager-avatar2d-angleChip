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

/*
 * Renamed from r
 */
public final class r_0
extends dL {
    private int soLuong;
    private int var_int_if;
    public static r_0 var_r_0_do;
    private int soLuongKhoa;
    private int cfr_renamed_4;
    private static int[] mangSoNguyen;
    private ei var_ei_do;
    private Image var_javax_microedition_lcdui_Image_do;
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private ei var_ei_if;
    private int cfr_renamed_15;
    private int cfr_renamed_8;
    private Vector var_java_util_Vector_do;
    private int cfr_renamed_12 = 0;
    private ei var_ei_for;
    private dL var_dL_do;

    public final void a_() {
        ((bn_0)this).cfr_renamed_4 = this.var_ei_do = new ei(MenuChinhAvatar.var_java_lang_String_arr_goto[0], 1);
        this.var_ei_new = this.var_ei_if = new ei(MenuChinhAvatar.dg, 2);
        this.var_ei_try = this.var_ei_for = new ei(MenuChinhAvatar.cfr_renamed_7, 0);
    }

    private void cfr_renamed_4() {
        String string;
        if ((this.cfr_renamed_5 == 0)) {
            this.cfr_renamed_5 = 1;
            ((bn_0)this).cfr_renamed_4 = null;
            string = MenuChinhAvatar.var_java_lang_String_arr_goto[2];
            } else {
            if (r_0.boolean_do(this.cfr_renamed_12, 1)) {
                string = MenuChinhAvatar.var_java_lang_String_arr_goto[1];
                } else {
                string = MenuChinhAvatar.var_java_lang_String_arr_goto[0];
            }
            this.cfr_renamed_5 = 0;
        }
        k.k_do().cfr_renamed_0(string, this.cfr_renamed_5);
    }

    public final void (Graphics graphics == null) {
        b(graphics != null);
        if (r_0.boolean_do(t_0.dangChayAuto ? 1 : 0)) {
            GameCanvas.var_gj_0_do.cfr_renamed_1(graphics);
            GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, MenuChinhAvatar.E.toUpperCase(), String.valueOf(AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) + MenuChinhAvatar.cU, String.valueOf(AngelChip.duLieuNguoiChoi.mangSoNguyen[2]) + MenuChinhAvatar.dh);
            if (((11 + 166 - 64 + 133 ^ 24 + 166 - 178 + 164) & (179 + 120 - 134 + 79 ^ 96 + 1 - -6 + 75 ^ -" ".length())) < 0) {
                return;
            }
        } else if ((this.var_dL_do != null)) {
            this.var_dL_do.cfr_renamed_1(graphics);
        }
        if ((dj_0.var_dj_0_do != null) && (GameCanvas.var_dX_do == dj_0.var_dj_0_do)) {
            return;
        }
        if (!(t_0.dangChayAuto)) {
            k.k_do().cfr_renamed_0(graphics);
            graphics.translate(0, this.cfr_renamed_15 + k.var_byte_do + bn_0.cfr_renamed_16);
            graphics.setClip(this.soLuongKhoa + 5, 0, this.cfr_renamed_2 - 10, k.k_do().var_int_int - k.var_byte_do - 2 * bn_0.cfr_renamed_16);
            } else {
            graphics.translate(0, this.cfr_renamed_15);
            graphics.setClip(this.soLuongKhoa + 5, 0, this.cfr_renamed_2 - 10, this.cfr_renamed_8);
        }
        if (r_0.boolean_do(this.cfr_renamed_5, 1)) {
            int n = (this.cfr_renamed_8 - k.var_byte_do + (bn_0.cfr_renamed_16 << 1)) / 6;
            GameCanvas.var_ew_case.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.bm) + AngelChip.duLieuNguoiChoi.chuoiGiaTri, this.soLuongKhoa + this.cfr_renamed_2 / 2, n / 2, 2);
            if (!(bF.coTrangThai)) {
                GameCanvas.var_ew_case.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.cfr_renamed_31) + ": " + AngelChip.duLieuNguoiChoi.var_java_lang_String_int, this.soLuongKhoa + this.cfr_renamed_2 / 2, n / 2 + n, 2);
            }
            GameCanvas.var_ew_case.cfr_renamed_0(graphics, String.valueOf(AngelChip.duLieuNguoiChoi.mangSoNguyen[2]) + MenuChinhAvatar.dh, this.soLuongKhoa + this.cfr_renamed_2 / 2, n / 2 + (n << 1), 2);
            if (r_0.boolean_do(bF.coTrangThai ? 1 : 0)) {
                GameCanvas.var_ew_case.cfr_renamed_0(graphics, fe_0.java_lang_String_do(), this.soLuongKhoa + this.cfr_renamed_2 / 2, n / 2 + n * 3, 2);
                }
        } else {
            graphics.translate(0, -ex.cfr_renamed_18);
            if ((this.cfr_renamed_12 == 0)) {
                this.cfr_renamed_4(graphics);
                if ((0x12 ^ 0x16) != (4 ^ 0)) {
                    return;
                }
            } else {
                this.cfr_renamed_3(graphics);
            }
        }
        if (!(GameCanvas.var_et_0_do != null) || !(et_0.coTrangThai)) {
            super.cfr_renamed_0(graphics);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void (Graphics var1_1 == 0) {
        var2_2 = 0;
        if ("   ".length() > 0) ** GOTO lbl20
        return;
lbl-1000:
        // 1 sources

        {
            if (r_0.cfr_renamed_3((int)this.var_boolean_new) && r_0.boolean_do(var2_2, this.cfr_renamed_17)) {
                GameCanvas.var_gj_0_do.cfr_renamed_1(var1_1, this.soLuongKhoa + 3 * bn_0.cfr_renamed_6, var2_2 * this.soLuong + 5, this.cfr_renamed_2 - 6 * bn_0.cfr_renamed_6, this.soLuong);
            }
            v0 = MenuChinhAvatar.var_java_lang_String_arr_if[var2_2];
            v1 = this.soLuongKhoa + 10;
            if (r_0.boolean_do(this.cfr_renamed_17, var2_2)) {
                v2 = this.var_int_if;
                if (((80 ^ 11 ^ (157 ^ 147)) & (51 + 242 - 257 + 211 ^ 93 + 70 - 150 + 149 ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                v2 = 0;
            }
            GameCanvas.var_ew_try.cfr_renamed_0(var1_1, v0, v1 + v2, var2_2 * this.soLuong + 5 + this.soLuong / 2 - bn_0.var_byte_new / 2, 0);
            ++var2_2;
lbl20:
            // 2 sources

            ** while (!r_0.boolean_if((int)var2_2, (int)2))
        }
lbl21:
        // 1 sources

    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

        static {
        r_0.cfr_renamed_11();
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

        public final void cfr_renamed_15() {
        super.cfr_renamed_15();
        if (!(t_0.dangChayAuto)) {
            if (!(GameCanvas.var_boolean_arr_do[4] == 0) || r_0.boolean_do(GameCanvas.var_boolean_arr_do[6])) {
                this.cfr_renamed_4();
            }
            if (r_0.boolean_do(GameCanvas.coKichHoat ? 1 : 0) && r_0.boolean_do(GameCanvas.boolean_if(0, k.k_do().soLuong, GameCanvas.var_int_byte, k.var_byte_do) ? 1 : 0)) {
                GameCanvas.coKichHoat = 0;
                this.cfr_renamed_4();
            }
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

        public final void (int n == boolean bl) {
        if (r_0.boolean_do(bl ? 1 : 0) && r_0.boolean_do(this.cfr_renamed_17, n)) {
            if ((this.var_ei_new != null)) {
                this.var_ei_new.cfr_renamed_1();
                if (-(0x91 ^ 0x94) >= 0) {
                    return;
                }
            } else if (r_0.cfr_renamed_1(((bn_0)this).cfr_renamed_4)) {
                ((bn_0)this).cfr_renamed_4.cfr_renamed_1();
            }
        }
        super.cfr_renamed_0(n, bl);
    }

    private void cfr_renamed_5() {
        int n;
        if ((this.var_java_util_Vector_do == null)) {
            return;
        }
        this.var_java_util_Vector_do.size();
        int n2 = this.var_java_util_Vector_do.size() * this.soLuong;
        int n3 = this.var_java_util_Vector_do.size();
        if (r_0.boolean_do(ef_0.soLuong, 25)) {
            n2 = this.soLuong << 1;
            n3 = 2;
        }
        if (!(t_0.dangChayAuto)) {
            n = k.var_byte_do + bn_0.cfr_renamed_16;
            if (((0x18 ^ 0x56) & ~(0x72 ^ 0x3C)) != 0) {
                return;
            }
        } else {
            n = 0;
        }
        GameCanvas.var_ex_do.cfr_renamed_0(this.soLuongKhoa, this.cfr_renamed_15 + n, this.cfr_renamed_2, this.soLuong, this.cfr_renamed_2, n2, this.cfr_renamed_2, this.cfr_renamed_8 - (k.var_byte_do + 2 * bn_0.cfr_renamed_16) - bn_0.cfr_renamed_16, n3);
    }

        private void cfr_renamed_12() {
        if (r_0.boolean_do(t_0.dangChayAuto ? 1 : 0)) {
            this.cfr_renamed_2 = GameCanvas.var_int_byte + 8;
            this.cfr_renamed_8 = GameCanvas.var_int_char - 25 - dL.cfr_renamed_13 + (bn_0.cfr_renamed_16 << 1);
            if ("  ".length() == -" ".length()) {
                return;
            }
        } else {
            this.cfr_renamed_2 = ThongTinNhanVat.cfr_renamed_0().var_int_byte;
            this.cfr_renamed_8 = ThongTinNhanVat.cfr_renamed_0().soLuongKhoa;
        }
        this.soLuong = dL.cfr_renamed_20;
        this.soLuongKhoa = GameCanvas.var_int_int - this.cfr_renamed_2 / 2;
    }

        /*
     * Unable to fully structure code
     */
    private void cfr_renamed_4(Graphics var1_1) {
        var2_2 = this.var_javax_microedition_lcdui_Image_do.getWidth() + 14;
        var3_3 = this.var_java_util_Vector_do.size();
        var4_4 = 0;
        if (null == null) ** GOTO lbl20
        return;
lbl-1000:
        // 1 sources

        {
            if (r_0.boolean_do(var4_4, this.cfr_renamed_17) && r_0.cfr_renamed_3((int)this.var_boolean_new)) {
                if (r_0.boolean_do((int)t_0.dangChayAuto)) {
                    var1_1.setColor(14328855);
                    var1_1.fillRect(this.soLuongKhoa, var4_4 * this.soLuong, this.cfr_renamed_2 - 3 * bn_0.cfr_renamed_6, this.soLuong);
                    if (((53 ^ 67 ^ (91 ^ 13)) & (127 ^ 88 ^ (154 ^ 157) ^ -" ".length())) > ((95 ^ 25 ^ (14 ^ 9)) & (41 ^ 34 ^ (210 ^ 152) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    GameCanvas.var_gj_0_do.cfr_renamed_1(var1_1, this.soLuongKhoa + 6, var4_4 * this.soLuong, this.cfr_renamed_2 - 6 * bn_0.cfr_renamed_6, this.soLuong);
                }
            }
            var1_1.drawImage(this.var_javax_microedition_lcdui_Image_do, this.soLuongKhoa + var2_2 / 2, var4_4 * this.soLuong + this.soLuong / 2, 3);
            ++var4_4;
lbl20:
            // 2 sources

            ** while (!r_0.boolean_if((int)var4_4, (int)var3_3))
        }
lbl21:
        // 1 sources

        var4_4 = 0;
        if (" ".length() <= (135 ^ 167 ^ (77 ^ 105))) ** GOTO lbl40
        return;
lbl-1000:
        // 1 sources

        {
            var5_5 = (bz)this.var_java_util_Vector_do.elementAt(var4_4);
            v0 = this.soLuongKhoa + var2_2 - 3;
            v1 = this.cfr_renamed_2 - var2_2 - 2;
            if (r_0.cfr_renamed_3((int)t_0.dangChayAuto)) {
                v2 = k.var_byte_do + 2 * bn_0.cfr_renamed_16;
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                v2 = 0;
            }
            var1_1.setClip(v0, ex.cfr_renamed_18, v1, this.cfr_renamed_8 - v2);
            GameCanvas.var_ew_try.cfr_renamed_0(var1_1, var5_5.cfr_renamed_0, this.soLuongKhoa + var2_2, var4_4 * this.soLuong + this.soLuong / 2 - bn_0.var_byte_new / 2, 0);
            ++var4_4;
lbl40:
            // 2 sources

            ** while (!r_0.boolean_if((int)var4_4, (int)var3_3))
        }
lbl41:
        // 1 sources

    }

    public final void void_do(int n) {
    }

    public r_0() {
        this.cfr_renamed_5 = 0;
        new eq_0(0, 1);
        this.var_int_if = 0;
        this.cfr_renamed_4 = -1;
    }

    public final void void_do(dL dL2) {
        this.cfr_renamed_1();
        this.cfr_renamed_5 = 0;
        this.cfr_renamed_17 = 0;
        this.var_dL_do = dL2;
        this.a_();
        super.cfr_renamed_8();
    }

    public final void void_for() {
        int n;
        if ((this.var_dL_do != null)) {
            this.var_dL_do.void_for();
        }
        if ((this.cfr_renamed_12 == 0)) {
            bz bz2 = (bz)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_17);
            n = GameCanvas.var_ew_try.cfr_renamed_0(bz2.cfr_renamed_0);
            if (" ".length() == -" ".length()) {
                return;
            }
        } else {
            n = GameCanvas.var_ew_try.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_arr_if[this.cfr_renamed_17]);
        }
        if ((n > this.cfr_renamed_2 - 20)) {
            this.var_int_if += this.cfr_renamed_4;
            if (r_0.cfr_renamed_3(this.var_int_if, -(n - (this.cfr_renamed_2 - 30)))) {
                this.cfr_renamed_4 = 1;
            }
            if (r_0.boolean_if(this.var_int_if)) {
                this.cfr_renamed_4 = -1;
                if (" ".length() <= -" ".length()) {
                    return;
                }
            }
        } else {
            this.var_int_if = 0;
        }
        if ((this.cfr_renamed_5 == 0)) {
            if ((ef_0.soLuong != 25)) {
                ((bn_0)this).cfr_renamed_4 = this.var_ei_do;
                this.var_ei_new = null;
                return;
            }
            ((bn_0)this).cfr_renamed_4 = null;
            this.var_ei_new = this.var_ei_if;
            return;
        }
        ((bn_0)this).cfr_renamed_4 = null;
        this.var_ei_new = null;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                GameCanvas.var_ex_do.coTrangThai = 0;
                this.var_dL_do.cfr_renamed_8();
                this.var_javax_microedition_lcdui_Image_do = null;
                return;
            }
            case 1: 
            case 2: {
                if ((this.cfr_renamed_12 == 0)) {
                    Object object = this;
                    Object object2 = (bz)((r_0)object).var_java_util_Vector_do.elementAt(((dL)object).cfr_renamed_17);
                    if (r_0.cfr_renamed_5(((bz)object2).cfr_renamed_1.indexOf(MenuChinhAvatar.ct), -1)) {
                        String string = GameCanvas.var_ew_try.cfr_renamed_0(((bz)object2).cfr_renamed_1, MenuChinhAvatar.tenNhanVat, AngelChip.duLieuNguoiChoi.chuoiGiaTri);
                        b(MenuChinhAvatar.cfr_renamed_32 == new dW(string));
                        return;
                    }
                    if (r_0.cfr_renamed_5(((bz)object2).cfr_renamed_1.indexOf("napthe:"), -1)) {
                        String string = ((bz)object2).cfr_renamed_1.substring(0, ((bz)object2).cfr_renamed_1.indexOf("napthe:") + "napthe:".length());
                        String string2 = string = GameCanvas.var_ew_try.cfr_renamed_0(((bz)object2).cfr_renamed_1, string, "");
                        string = ((bz)object2).cfr_renamed_0;
                        object2 = string2;
                        gx[] gxArray = new gx[2];
                        gx[] gxArray2 = gxArray;
                        gxArray[0] = new gx();
                        gxArray2[1] = new gx();
                        gxArray2[0].void_do(0);
                        gxArray2[1].void_do(1);
                        dj_0.cfr_renamed_0().cfr_renamed_0(gxArray2, string, MenuChinhAvatar.var_java_lang_String_arr_arr_for, new ei(MenuChinhAvatar.ck, new dU((r_0)object, (String)object2, gxArray2)));
                        GameCanvas.var_dX_do = dj_0.cfr_renamed_0();
                        return;
                    }
                    if (r_0.cfr_renamed_5(((bz)object2).cfr_renamed_1.indexOf("ServerNap:"), -1)) {
                        String string = ((bz)object2).cfr_renamed_1.substring(0, ((bz)object2).cfr_renamed_1.indexOf("ServerNap:") + "ServerNap:".length());
                        string = GameCanvas.var_ew_try.cfr_renamed_0(((bz)object2).cfr_renamed_1, string, "");
                        object2 = string;
                        object = db_0.db_0_do();
                        ((ax_0)object).cfr_renamed_0(-76);
                        ((ax_0)object).cfr_renamed_0((String)object2);
                        ((ax_0)object).cfr_renamed_1();
                        GameCanvas.cfr_renamed_5();
                        return;
                    }
                    GameCanvas.cfr_renamed_5();
                    object2 = ((bz)object2).cfr_renamed_3;
                    object = eq.eq_do();
                    ((ax_0)object).cfr_renamed_0(-91);
                    ((ax_0)object).cfr_renamed_0((String)object2);
                    ((ax_0)object).cfr_renamed_1();
                    return;
                }
                GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.bH, 100, 1);
                return;
            }
            case 100: {
                try {
                    int n3;
                    if (r_0.boolean_do(GameCanvas.var_dZ_do.cfr_renamed_0().equals("") ? 1 : 0)) {
                        return;
                    }
                    n = Integer.parseInt(GameCanvas.var_dZ_do.cfr_renamed_0());
                    dh_0 dh_02 = dh_0.dh_0_do();
                    if ((this.cfr_renamed_17 == 0)) {
                        n3 = 1;
                        if (((83 + 100 - 165 + 166 ^ 130 + 0 - 79 + 117) & (68 + 87 - 34 + 21 ^ 27 + 46 - 47 + 132 ^ -" ".length())) < 0) {
                            return;
                        }
                    } else {
                        n3 = 0;
                    }
                    dh_02.cfr_renamed_4(n, n3);
                    GameCanvas.cfr_renamed_5();
                    return;
                }
                catch (Exception exception) {
                    }
            }
        }
    }

    public final void (Vector vector == null) {
        this.cfr_renamed_12();
        this.var_java_util_Vector_do = vector;
        this.cfr_renamed_5();
        this.var_int_if = 0;
    }

        private static void cfr_renamed_11() {
        mangSoNguyen = new int[18];
        0 = (47 + 108 - 14 + 0 ^ 107 + 37 - -17 + 6) & (0x4C ^ 0x7B ^ (0xB0 ^ 0xAD) ^ -" ".length());
        25 = 0x8F ^ 0x96;
        1 = " ".length();
        2 = "  ".length();
        -1 = -" ".length();
        -76 = -("   ".length() ^ (0x29 ^ 0x66));
        -91 = -(0x2D ^ 0x48 ^ (0x14 ^ 0x2A));
        100 = 0x9A ^ 0x84 ^ (0x42 ^ 0x38);
        5 = 0xD4 ^ 0xB1 ^ (0x34 ^ 0x54);
        10 = 0x9C ^ 0x96;
        6 = 0xB9 ^ 0xBF;
        3 = "   ".length();
        8 = 0xA8 ^ 0xA0;
        14 = 72 + 3 - -17 + 41 ^ 27 + 2 - -18 + 92;
        14328855 = -(0xFFFFB2E1 & 0x4FFF) & (0xFFFFBEF7 & 0xDAE7FF);
        4 = 0xBE ^ 0xBA;
        20 = 101 + 83 - 166 + 153 ^ 51 + 97 - -11 + 32;
        30 = 0xE ^ 0x10;
    }

    public final void cfr_renamed_1() {
        String string;
        if ((this.var_javax_microedition_lcdui_Image_do == null)) {
            ap.void_do(MenuChinhAvatar.ar);
            this.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("coin");
            ap.cfr_renamed_0();
        }
        if (r_0.boolean_do(ef_0.soLuong, 25)) {
            this.cfr_renamed_12 = 1;
            string = MenuChinhAvatar.var_java_lang_String_arr_goto[1];
            dh_0.dh_0_do().cfr_renamed_4(0, 0);
            GameCanvas.cfr_renamed_5();
            if (((0xAA ^ 0xA3 ^ (0xE0 ^ 0xA0)) & (75 + 90 - 59 + 31 ^ 132 + 32 - 124 + 152 ^ -" ".length())) != 0) {
                return;
            }
        } else {
            string = MenuChinhAvatar.var_java_lang_String_arr_goto[0];
            this.cfr_renamed_12 = 0;
        }
        this.cfr_renamed_12();
        k.k_do().cfr_renamed_0(string, this.cfr_renamed_2, this.cfr_renamed_8, 2);
        if (r_0.boolean_do(t_0.dangChayAuto ? 1 : 0)) {
            k.k_do().soLuong = 25 + dL.cfr_renamed_13 + 1;
        }
        this.cfr_renamed_15 = k.k_do().soLuong;
        this.cfr_renamed_5();
    }

    public static r_0 cfr_renamed_0() {
        if ((var_r_0_do == null)) {
            var_r_0_do = new r_0();
        }
        return var_r_0_do;
    }

    }

