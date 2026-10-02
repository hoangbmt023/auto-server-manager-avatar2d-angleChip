/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Renamed from aL
 */
public final class al_0
extends en {
    private static cu_0 var_cu_0_do;
    private static int var_int_if;
    private int soLuongKhoa;
    private static int cfr_renamed_3;
    private int cfr_renamed_4;
    public static al_0 var_al_0_do;
    private int cfr_renamed_5 = 0;
    private int cfr_renamed_6;
    private int cfr_renamed_7;
    private fl_0 var_fl_0_do;
    private static int cfr_renamed_8;
    private int cfr_renamed_13;
    private int cfr_renamed_9;
    private int cfr_renamed_14;
    private static Image var_javax_microedition_lcdui_Image_do;
    private int cfr_renamed_23;
    private int cfr_renamed_24;
    private boolean coTrangThai;
    private int cfr_renamed_22;
    private int cfr_renamed_17;
    private int cfr_renamed_29;
    private int cfr_renamed_26;
    private int cfr_renamed_27;
    private static int cfr_renamed_25;
    private int cfr_renamed_28 = 0;
    private static int cfr_renamed_31;
    private int cfr_renamed_11;
    public static int soLuong;
    private static final int[] mangSoNguyen;
    private int cfr_renamed_32;
    public static boolean dangChayAuto;
    private int cfr_renamed_33;
    private static boolean coKichHoat;

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

        public final void void_if() {
        this.void_do(1, -1);
    }

    public final void cfr_renamed_2() {
        GameCanvas.cfr_renamed_8();
        this.cfr_renamed_5 = 2;
        ft_0.ft_0_do().cfr_renamed_12(3);
        go_0.var_byte_int = (byte)2;
    }

            public al_0() {
        this.coTrangThai = 0;
        this.cfr_renamed_22 = 2;
        this.cfr_renamed_26 = 0;
        this.soLuongKhoa = -40;
        this.cfr_renamed_24 = 1;
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.cT, 0);
        ((en)this).cfr_renamed_4 = new fl_0(MenuChinhAvatar.cfr_renamed_34, 1);
        ((en)this).cfr_renamed_5 = new fl_0("Top", 2);
        if ((GameCanvas.cfr_renamed_12 == 0)) {
            ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cT, 3);
        }
    }

    public final void (Graphics graphics == null) {
        GameCanvas.var_fa_0_do.cfr_renamed_0(graphics);
        if ((GameCanvas.var_int_new != 2)) {
            GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, GameCanvas.cfr_renamed_15, (this.cfr_renamed_6 - al_0.var_cu_0_do.cfr_renamed_2 / 2) / 2);
        }
        graphics.translate(this.cfr_renamed_32, this.cfr_renamed_6);
        graphics.translate(-var_int_if, 0);
        int n = 0;
        while (al_0.boolean_do(n, MenuChinhAvatar.var_java_lang_String_arr_this.length)) {
            var_cu_0_do.cfr_renamed_1(n, n % this.cfr_renamed_4 * this.cfr_renamed_27, n / this.cfr_renamed_4 * this.cfr_renamed_13, 0, 3, graphics);
            GameCanvas.var_fz_0_if.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_arr_this[n], n % this.cfr_renamed_4 * this.cfr_renamed_27, n / this.cfr_renamed_4 * this.cfr_renamed_13 + al_0.var_cu_0_do.cfr_renamed_2 / 2 + 5, 2);
            if ((this.cfr_renamed_5 == n) && (!al_0.boolean_for(GameCanvas.var_boolean_try ? 1 : 0) || !(coKichHoat))) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_do, n % this.cfr_renamed_4 * this.cfr_renamed_27, n / this.cfr_renamed_4 * this.cfr_renamed_13, 3);
            }
            ++n;
            if ((0xC9 ^ 0x8B ^ (0x70 ^ 0x36)) > ((120 + 106 - 195 + 96 ^ (0x2E ^ 0x78)) & (86 + 146 - 231 + 176 ^ 85 + 89 - 85 + 63 ^ -" ".length()))) continue;
            return;
        }
    }

        private static void cfr_renamed_8() {
        mangSoNguyen = new int[21];
        2 = "  ".length();
        13 = 0x72 ^ 0x2C ^ (0x78 ^ 0x2B);
        11 = 0xB ^ 0x4D ^ (0x60 ^ 0x2D);
        70 = 0x98 ^ 0x83 ^ (0x44 ^ 0x19);
        40 = 0x99 ^ 0xB1;
        4 = 0x26 ^ 0x22;
        100 = 0x14 ^ 0x70;
        5 = 0x2C ^ 0x28 ^ " ".length();
        0 = (0xB0 ^ 0x94) & ~(0x8A ^ 0xAE);
        1 = " ".length();
        3 = "   ".length();
        -96 = -(0xC8 ^ 0xA8);
        -40 = -(0xA0 ^ 0x88);
        -1 = -" ".length();
        500 = -(0xFFFFF696 & 0x1F6D) & (0xFFFFFFF7 & 0x17FF);
        -500 = -(-(0xFFFFBFBA & 0x7847) & (0xFFFFFDFD & 0x3BF7));
        10 = 0x45 ^ 0x4F;
        15 = 0x67 ^ 0x5F ^ (0x2A ^ 0x1D);
        20 = 0xA6 ^ 0xB2;
        6 = 0x66 ^ 0x5D ^ (0x3D ^ 0);
        8 = 0x99 ^ 0x91;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                switch (this.cfr_renamed_5) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: {
                        n = this.cfr_renamed_5;
                        GameCanvas.cfr_renamed_8();
                        ft_0.ft_0_do().cfr_renamed_12(3);
                        go_0.var_byte_int = (byte)n;
                        return;
                    }
                    case 4: {
                        cj.cfr_renamed_1().cfr_renamed_0();
                    }
                }
                return;
            }
            case 1: {
                soLuong = 1;
                GameCanvas.var_cg_0_do.coTrangThai = 0;
                ft_0 ft_02 = ft_0.ft_0_do();
                ft_02.cfr_renamed_1(-96);
                ft_02.cfr_renamed_0();
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 2: {
                ft_0.ft_0_do().cfr_renamed_4(1);
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 3: {
                this.cfr_renamed_9();
            }
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

    public final void cfr_renamed_4() {
        this.cfr_renamed_18 = 2;
        GameCanvas.var_aa_do = null;
        GameCanvas.cfr_renamed_7();
        if ((var_cu_0_do == null)) {
            e.void_do(MenuChinhAvatar.bo);
            cu_0.cfr_renamed_1("up", 13 * dF.cfr_renamed_12, 11 * dF.cfr_renamed_12);
            e.cfr_renamed_1();
            try {
                int n = 70 * dF.cfr_renamed_12;
                if ((GameCanvas.cfr_renamed_12 == 0)) {
                    n = 40;
                }
                var_cu_0_do = new cu_0(Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/on/iconGame0.on")), n, n);
                var_javax_microedition_lcdui_Image_do = Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/on/select.on"));
                if ((m_0.var_javax_microedition_lcdui_Image_do == null)) {
                    m_0.var_javax_microedition_lcdui_Image_do = Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/on/logo.on"));
                }
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if (-" ".length() >= 0) {
                return;
            }
        }
        super.cfr_renamed_4();
        this.cfr_renamed_6 = GameCanvas.var_int_case / 2 - dF.var_byte_try;
        this.cfr_renamed_4 = 4;
        this.cfr_renamed_9 = 70 * dF.cfr_renamed_12;
        if ((GameCanvas.cfr_renamed_12 == 0)) {
            this.cfr_renamed_9 = 40;
        }
        this.cfr_renamed_27 = GameCanvas.soLuongKhoa / this.cfr_renamed_4;
        if (al_0.boolean_if(this.cfr_renamed_27, 100 * dF.cfr_renamed_12)) {
            this.cfr_renamed_27 = 100 * dF.cfr_renamed_12;
        }
        this.cfr_renamed_13 = al_0.var_cu_0_do.cfr_renamed_2 + dF.var_byte_try + 5 * dF.cfr_renamed_12;
        this.cfr_renamed_32 = (GameCanvas.soLuongKhoa - this.cfr_renamed_4 * this.cfr_renamed_27) / 2 + this.cfr_renamed_27 / 2;
        cfr_renamed_31 = this.cfr_renamed_4 * this.cfr_renamed_27 - GameCanvas.soLuongKhoa;
        if ((cfr_renamed_31 < 0)) {
            cfr_renamed_31 = 0;
        }
        al_0.cfr_renamed_13();
        if ((GameCanvas.var_int_byte == 0)) {
            GameCanvas.var_int_byte = 1;
        }
        coKichHoat = 1;
        dangChayAuto = 1;
        aj.var_byte_do = (byte)0;
        TienIchGame.void_if();
        TienIchGame.cfr_renamed_7();
    }

        public static void cfr_renamed_3() {
        var_cu_0_do = null;
        var_javax_microedition_lcdui_Image_do = null;
        m_0.var_javax_microedition_lcdui_Image_do = null;
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

        public final void cfr_renamed_6() {
        int n;
        this.cfr_renamed_11 += 1;
        if (al_0.boolean_for(GameCanvas.boolean_do(4) ? 1 : 0)) {
            if ((this.cfr_renamed_5 % this.cfr_renamed_4 == null)) {
                this.cfr_renamed_5 -= 1;
                if (((0xA ^ 0x2F) & ~(0x99 ^ 0xBC)) < ((0xDA ^ 0x80) & ~(0xF3 ^ 0xA9))) {
                    return;
                }
            }
        } else if (al_0.boolean_for(GameCanvas.boolean_do(6) ? 1 : 0)) {
            if (al_0.boolean_do(this.cfr_renamed_5, al_0.var_cu_0_do.cfr_renamed_0 - 1) && al_0.boolean_do(this.cfr_renamed_5 % this.cfr_renamed_4, this.cfr_renamed_4 - 1)) {
                this.cfr_renamed_5 += 1;
                if (" ".length() < 0) {
                    return;
                }
            }
        } else if (al_0.boolean_for(GameCanvas.boolean_do(2) ? 1 : 0)) {
            if ((this.cfr_renamed_5 / this.cfr_renamed_4 == null)) {
                this.cfr_renamed_5 -= this.cfr_renamed_4;
                if ((122 + 67 - 22 + 17 ^ 73 + 16 - 29 + 128) < 0) {
                    return;
                }
            }
        } else if (al_0.boolean_for(GameCanvas.boolean_do(8) ? 1 : 0) && al_0.boolean_do(this.cfr_renamed_5 / this.cfr_renamed_4, al_0.var_cu_0_do.cfr_renamed_0 / this.cfr_renamed_4) && al_0.boolean_do(this.cfr_renamed_5 + this.cfr_renamed_4, al_0.var_cu_0_do.cfr_renamed_0)) {
            this.cfr_renamed_5 += this.cfr_renamed_4;
        }
        if (al_0.boolean_for(GameCanvas.coTrangThai ? 1 : 0)) {
            n = 0;
            while (al_0.boolean_do(n, MenuChinhAvatar.var_java_lang_String_arr_this.length)) {
                if (al_0.boolean_for(GameCanvas.boolean_if(this.cfr_renamed_32 + n % this.cfr_renamed_4 * this.cfr_renamed_27 - this.cfr_renamed_9 / 2, this.cfr_renamed_6 + n / this.cfr_renamed_4 * this.cfr_renamed_13 - this.cfr_renamed_9 / 2, this.cfr_renamed_9, this.cfr_renamed_9 + dF.var_byte_try + 10) ? 1 : 0)) {
                    this.cfr_renamed_17 = GameCanvas.var_int_else;
                    this.cfr_renamed_29 = this.cfr_renamed_11;
                    this.cfr_renamed_28 = var_int_if;
                    this.cfr_renamed_33 = 0;
                    GameCanvas.coTrangThai = 0;
                    this.coTrangThai = 1;
                    if (((0x6F ^ 9 ^ (0x59 ^ 0x15)) & (153 + 65 - 85 + 33 ^ 9 + 81 - -18 + 32 ^ -" ".length())) <= 0) break;
                    return;
                }
                ++n;
                if (((0xF7 ^ 0xC4) & ~(0xF3 ^ 0xC0)) <= " ".length()) continue;
                return;
            }
        }
        if (al_0.boolean_for(this.coTrangThai ? 1 : 0)) {
            int n2;
            n = this.cfr_renamed_11 - this.cfr_renamed_29;
            int n3 = this.cfr_renamed_17 - GameCanvas.var_int_try;
            this.cfr_renamed_17 = GameCanvas.var_int_try;
            if (al_0.boolean_for(GameCanvas.var_boolean_case ? 1 : 0)) {
                if ((this.cfr_renamed_11 % 2 == 0)) {
                    this.cfr_renamed_23 = GameCanvas.var_int_try;
                    this.cfr_renamed_7 = this.cfr_renamed_11;
                }
                this.cfr_renamed_33 = 0;
                if ((cfr_renamed_8 == null) && al_0.boolean_do(cfr_renamed_8, cfr_renamed_31)) {
                    this.cfr_renamed_28 = cfr_renamed_8 = this.cfr_renamed_28 + n3;
                    if (-"  ".length() >= 0) {
                        return;
                    }
                } else {
                    cfr_renamed_8 = this.cfr_renamed_28 + GameCanvas.int_if() / 2;
                }
                var_int_if = cfr_renamed_8;
                if (al_0.boolean_do(n, 20)) {
                    n3 = (cfr_renamed_8 + GameCanvas.var_int_try - (this.cfr_renamed_32 - this.cfr_renamed_27 / 2)) / this.cfr_renamed_27;
                    n2 = (GameCanvas.soLuong - (this.cfr_renamed_6 - this.cfr_renamed_27 / 2)) / this.cfr_renamed_13;
                    this.cfr_renamed_5 = n2 * this.cfr_renamed_4 + n3;
                    if ((this.cfr_renamed_5 < 0)) {
                        this.cfr_renamed_5 = 0;
                    }
                    if ((this.cfr_renamed_5 >= MenuChinhAvatar.var_java_lang_String_arr_this.length)) {
                        this.cfr_renamed_5 = MenuChinhAvatar.var_java_lang_String_arr_this.length - 1;
                    }
                }
                if (al_0.boolean_do(hg.int_do(GameCanvas.int_for()), 10 * dF.cfr_renamed_12) && al_0.boolean_do(hg.int_do(GameCanvas.int_if()), 10 * dF.cfr_renamed_12)) {
                    if (al_0.boolean_if(n, 3) && al_0.boolean_do(n, 8)) {
                        coKichHoat = 0;
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    }
                } else {
                    coKichHoat = 1;
                }
            }
            if (al_0.boolean_for(GameCanvas.var_boolean_new ? 1 : 0)) {
                n3 = this.cfr_renamed_23 - GameCanvas.var_int_try;
                n2 = this.cfr_renamed_11 - this.cfr_renamed_7;
                if (al_0.boolean_if(hg.int_do(n3), 40) && al_0.boolean_do(n2, 20) && (cfr_renamed_8 == null) && al_0.boolean_do(cfr_renamed_8, cfr_renamed_31)) {
                    this.cfr_renamed_33 = n3 / n2 * 10;
                }
                this.cfr_renamed_7 = -1;
                if (al_0.boolean_do(hg.int_do(GameCanvas.int_for()), 10 * dF.cfr_renamed_12) && al_0.boolean_do(hg.int_do(GameCanvas.int_if()), 10 * dF.cfr_renamed_12)) {
                    if ((n <= 4)) {
                        this.cfr_renamed_14 = 5;
                        coKichHoat = 0;
                        if ((0x3C ^ 0x38) == 0) {
                            return;
                        }
                    } else if (!(coKichHoat)) {
                        this.cfr_renamed_9();
                    }
                }
                this.coTrangThai = 0;
                GameCanvas.var_boolean_new = 0;
            }
        }
        if (al_0.boolean_for(GameCanvas.cfr_renamed_12)) {
            GameCanvas.var_fa_0_do.void_do((fl_0)((en)this).cfr_renamed_5, (fl_0)((en)this).cfr_renamed_3, (fl_0)((en)this).cfr_renamed_4);
            return;
        }
        super.cfr_renamed_6();
    }

        public final void (Graphics graphics == 0) {
        GameCanvas.hienThongBaoPopup(graphics);
        this.cfr_renamed_0(graphics);
        al_0.cfr_renamed_1(graphics, (fl_0)((en)this).cfr_renamed_5, (fl_0)((en)this).cfr_renamed_3, (fl_0)((en)this).cfr_renamed_4);
        GameCanvas.hienThongBaoPopup(graphics);
    }

        public final void cfr_renamed_7() {
        if ((this.cfr_renamed_14 == null)) {
            this.cfr_renamed_14 -= 1;
            if ((this.cfr_renamed_14 == 0) && (GameCanvas.var_en_do != fo.var_fo_do)) {
                this.cfr_renamed_9();
            }
        }
        if (al_0.boolean_for(this.cfr_renamed_33)) {
            if (!(var_int_if >= 0) || al_0.boolean_if(var_int_if, cfr_renamed_31)) {
                if (al_0.boolean_if(this.cfr_renamed_33, 500)) {
                    this.cfr_renamed_33 = 500;
                    if (((3 ^ 0x38) & ~(0x3B ^ 0)) > 0) {
                        return;
                    }
                } else if (al_0.boolean_do(this.cfr_renamed_33, -500)) {
                    this.cfr_renamed_33 = -500;
                }
                this.cfr_renamed_33 -= this.cfr_renamed_33 / 5;
                if ((hg.int_do(this.cfr_renamed_33 / 10) <= 10)) {
                    this.cfr_renamed_33 = 0;
                }
            }
            cfr_renamed_8 = var_int_if += this.cfr_renamed_33 / 15;
            this.cfr_renamed_33 -= this.cfr_renamed_33 / 20;
            } else if ((var_int_if < 0)) {
            cfr_renamed_8 = 0;
            if (((0x6B ^ 0x21 ^ (0x76 ^ 0x1D)) & (0x7A ^ 0x59 ^ "  ".length() ^ -" ".length())) != ((193 + 147 - 311 + 182 ^ 85 + 59 - 52 + 62) & (26 + 204 - 147 + 130 ^ 27 + 135 - 25 + 19 ^ -" ".length()))) {
                return;
            }
        } else if (al_0.boolean_if(var_int_if, cfr_renamed_31)) {
            cfr_renamed_8 = cfr_renamed_31;
        }
        if ((var_int_if != cfr_renamed_8)) {
            cfr_renamed_3 = cfr_renamed_8 - var_int_if << 2;
            var_int_if += (cfr_renamed_25 += cfr_renamed_3) >> 4;
            cfr_renamed_25 &= 15;
        }
        if ((this.cfr_renamed_26 >= 0)) {
            this.soLuongKhoa += this.cfr_renamed_24 * this.cfr_renamed_26;
            this.cfr_renamed_26 += this.cfr_renamed_24 * this.cfr_renamed_22;
            if (al_0.boolean_int(this.cfr_renamed_26)) {
                this.cfr_renamed_24 = -this.cfr_renamed_24;
            }
            if ((this.soLuongKhoa == null)) {
                this.cfr_renamed_24 = -this.cfr_renamed_24;
                this.cfr_renamed_26 -= 2 * this.cfr_renamed_22;
            }
        }
    }

    private static void cfr_renamed_13() {
        GameCanvas.this = en.cfr_renamed_21;
        if ((GameCanvas.cfr_renamed_12 == 0)) {
            GameCanvas.this = dF.cfr_renamed_6 + 5;
        }
        GameCanvas.var_int_case = GameCanvas.gameCanvas.getHeight() - GameCanvas.this;
        int n = 0;
        while (al_0.boolean_do(n, 3)) {
            GameCanvas.var_fs_arr_do[n].var_int_if = GameCanvas.var_int_int - GameCanvas.this;
            ++n;
            if ("  ".length() > -" ".length()) continue;
            return;
        }
    }

    private static boolean boolean_int(int n) {
        return n <= 0;
    }

    static {
        al_0.cfr_renamed_8();
        dangChayAuto = 1;
        soLuong = 0;
    }

    private void cfr_renamed_9() {
        coKichHoat = 1;
        this.var_fl_0_do.cfr_renamed_0();
    }

            public static void cfr_renamed_5() {
        if (al_0.boolean_for(dangChayAuto ? 1 : 0) && al_0.boolean_for(gA.coTrangThai ? 1 : 0)) {
            gA.coTrangThai = 0;
            gA.cfr_renamed_1().0 = 0;
            GameCanvas.gameCanvas.cfr_renamed_3();
            al_0.cfr_renamed_13();
        }
    }

    public static al_0 cfr_renamed_1() {
        if ((var_al_0_do == null)) {
            var_al_0_do = new al_0();
        }
        return var_al_0_do;
    }

            public static void (Graphics graphics, fl_0 fl_02, fl_0 fl_03, fl_0 fl_04 == 0) {
        GameCanvas.hienThongBaoPopup(graphics);
        GameCanvas.var_fa_0_do.cfr_renamed_2(graphics);
        if ((GameCanvas.var_aa_do == null) && (!(GameCanvas.var_dj_0_do == 0) || (GameCanvas.var_dj_0_do == cj.var_cj_do))) {
            GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, fl_02, fl_03, fl_04);
        }
    }
}

