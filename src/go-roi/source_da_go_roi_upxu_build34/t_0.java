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
 * Renamed from t
 */
public final class t_0
extends dL {
    private int var_int_if;
    private int soLuongKhoa;
    private int cfr_renamed_4 = 0;
    private int cfr_renamed_5;
    public static t_0 var_t_0_do;
    private int cfr_renamed_2;
    private int cfr_renamed_15;
    private static int cfr_renamed_8;
    private int cfr_renamed_12;
    private int cfr_renamed_11 = 0;
    private int cfr_renamed_18;
    private static int cfr_renamed_10;
    private ei var_ei_do;
    private boolean coTrangThai = 0;
    private static ep var_ep_do;
    private static boolean coKichHoat;
    private int cfr_renamed_14;
    private static Image var_javax_microedition_lcdui_Image_do;
    public static boolean dangChayAuto;
    private int cfr_renamed_23;
    private int cfr_renamed_24;
    private int cfr_renamed_25;
    private int cfr_renamed_27;
    private int cfr_renamed_26;
    private static int cfr_renamed_21;
    private static int cfr_renamed_29;
    public static int soLuong;
    private static int cfr_renamed_9;
    private int cfr_renamed_28;
    private int cfr_renamed_34;
    private static final int[] mangSoNguyen;
    private int cfr_renamed_31;
    private int cfr_renamed_33;

    private static boolean boolean_do(int n) {
        return n >= 0;
    }

    public final void cfr_renamed_2() {
        this.void_do(1, -1);
    }

    private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    public final void void_for() {
        if (t_0.boolean_if(this.cfr_renamed_14)) {
            this.cfr_renamed_14 -= 1;
            if ((this.cfr_renamed_14 == 0) && (GameCanvas.var_dL_do != em_0.var_em_0_do)) {
                this.cfr_renamed_11();
            }
        }
        if ((this.cfr_renamed_28 != 0)) {
            if (!t_0.boolean_do(cfr_renamed_10) || (cfr_renamed_10 > cfr_renamed_21)) {
                if ((this.cfr_renamed_28 > 500)) {
                    this.cfr_renamed_28 = 500;
                    if ("   ".length() == ((0x16 ^ 0x5B ^ (0xB ^ 0x13)) & (218 + 153 - 296 + 165 ^ 9 + 95 - -22 + 39 ^ -" ".length()))) {
                        return;
                    }
                } else if ((this.cfr_renamed_28 < -500)) {
                    this.cfr_renamed_28 = -500;
                }
                this.cfr_renamed_28 -= this.cfr_renamed_28 / 5;
                if (t_0.boolean_do(gc_0.int_if(this.cfr_renamed_28 / 10), 10)) {
                    this.cfr_renamed_28 = 0;
                }
            }
            cfr_renamed_9 = cfr_renamed_10 += this.cfr_renamed_28 / 15;
            this.cfr_renamed_28 -= this.cfr_renamed_28 / 20;
            if (-" ".length() >= " ".length()) {
                return;
            }
        } else if ((cfr_renamed_10 < 0)) {
            cfr_renamed_9 = 0;
            if (("  ".length() ^ (0x66 ^ 0x61)) == 0) {
                return;
            }
        } else if ((cfr_renamed_10 > cfr_renamed_21)) {
            cfr_renamed_9 = cfr_renamed_21;
        }
        if ((cfr_renamed_10 != cfr_renamed_9)) {
            cfr_renamed_29 = cfr_renamed_9 - cfr_renamed_10 << 2;
            cfr_renamed_10 += (cfr_renamed_8 += cfr_renamed_29) >> 4;
            cfr_renamed_8 &= 15;
        }
        if (t_0.boolean_do(this.cfr_renamed_34)) {
            this.cfr_renamed_2 += this.cfr_renamed_18 * this.cfr_renamed_34;
            this.cfr_renamed_34 += this.cfr_renamed_18 * this.soLuongKhoa;
            if ((this.cfr_renamed_34 <= 0)) {
                this.cfr_renamed_18 = -this.cfr_renamed_18;
            }
            if (t_0.boolean_if(this.cfr_renamed_2)) {
                this.cfr_renamed_18 = -this.cfr_renamed_18;
                this.cfr_renamed_34 -= 2 * this.soLuongKhoa;
            }
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

            public final void (Graphics graphics != null) {
        GameCanvas.cfr_renamed_1(graphics);
        this.cfr_renamed_1(graphics);
        t_0.cfr_renamed_0(graphics, (ei)((dL)this).cfr_renamed_4, (ei)((dL)this).cfr_renamed_5, (ei)((dL)this).cfr_renamed_2);
        GameCanvas.cfr_renamed_1(graphics);
    }

        public static void (Graphics graphics, ei ei2, ei ei3, ei ei4 != null) {
        GameCanvas.cfr_renamed_1(graphics);
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics);
        if ((GameCanvas.var_e_0_do == null) && (!(GameCanvas.var_bt_0_do != null) || (GameCanvas.var_bt_0_do == eh.var_eh_do))) {
            GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, ei2, ei3, ei4);
        }
    }

    public static void cfr_renamed_1() {
        var_ep_do = null;
        var_javax_microedition_lcdui_Image_do = null;
        bK.var_javax_microedition_lcdui_Image_do = null;
    }

    private static void cfr_renamed_12() {
        GameCanvas.var_int_else = dL.cfr_renamed_20;
        if ((GameCanvas.cfr_renamed_16 == 0)) {
            GameCanvas.var_int_else = bn_0.var_byte_try + 5;
        }
        GameCanvas.var_int_char = GameCanvas.gameCanvas.getHeight() - GameCanvas.var_int_else;
        int n = 0;
        while ((n < 3)) {
            GameCanvas.var_eq_0_arr_do[n].soLuong = GameCanvas.this - GameCanvas.var_int_else;
            ++n;
            return;
        }
    }

                private void cfr_renamed_11() {
        coKichHoat = 1;
        this.var_ei_do.cfr_renamed_1();
    }

    public final void cfr_renamed_8() {
        this.cfr_renamed_17 = 2;
        GameCanvas.var_e_0_do = null;
        GameCanvas.cfr_renamed_8();
        if ((var_ep_do == null)) {
            ap.void_do(MenuChinhAvatar.cfr_renamed_27);
            ep.cfr_renamed_0("up", 13 * bn_0.cfr_renamed_6, 11 * bn_0.cfr_renamed_6);
            ap.cfr_renamed_0();
            try {
                int n = 70 * bn_0.cfr_renamed_6;
                if ((GameCanvas.cfr_renamed_16 == 0)) {
                    n = 40;
                }
                var_ep_do = new ep(Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/on/iconGame0.on")), n, n);
                var_javax_microedition_lcdui_Image_do = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/on/select.on"));
                if ((bK.var_javax_microedition_lcdui_Image_do == null)) {
                    bK.var_javax_microedition_lcdui_Image_do = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/on/logo.on"));
                }
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
        super.cfr_renamed_8();
        this.cfr_renamed_5 = GameCanvas.var_int_char / 2 - bn_0.var_byte_new;
        this.cfr_renamed_23 = 4;
        this.cfr_renamed_27 = 70 * bn_0.cfr_renamed_6;
        if ((GameCanvas.cfr_renamed_16 == 0)) {
            this.cfr_renamed_27 = 40;
        }
        this.cfr_renamed_26 = GameCanvas.var_int_byte / this.cfr_renamed_23;
        if ((this.cfr_renamed_26 > 100 * bn_0.cfr_renamed_6)) {
            this.cfr_renamed_26 = 100 * bn_0.cfr_renamed_6;
        }
        this.cfr_renamed_15 = t_0.var_ep_do.soLuong + bn_0.var_byte_new + 5 * bn_0.cfr_renamed_6;
        this.var_int_if = (GameCanvas.var_int_byte - this.cfr_renamed_23 * this.cfr_renamed_26) / 2 + this.cfr_renamed_26 / 2;
        cfr_renamed_21 = this.cfr_renamed_23 * this.cfr_renamed_26 - GameCanvas.var_int_byte;
        if ((cfr_renamed_21 < 0)) {
            cfr_renamed_21 = 0;
        }
        t_0.cfr_renamed_12();
        if ((GameCanvas.cfr_renamed_6 == 0)) {
            GameCanvas.cfr_renamed_6 = 1;
        }
        coKichHoat = 1;
        dangChayAuto = 1;
        AutoKimCuong.var_byte_do = (byte)0;
        TienIchGame.this();
        TienIchGame.cfr_renamed_8();
    }

                public final void cfr_renamed_15() {
        int n;
        this.cfr_renamed_25 += 1;
        if ((GameCanvas.boolean_do(4))) {
            if (t_0.boolean_if(this.cfr_renamed_4 % this.cfr_renamed_23)) {
                this.cfr_renamed_4 -= 1;
                if (-"  ".length() > 0) {
                    return;
                }
            }
        } else if ((GameCanvas.boolean_do(6))) {
            if ((this.cfr_renamed_4 < t_0.var_ep_do.cfr_renamed_1 - 1) && (this.cfr_renamed_4 % this.cfr_renamed_23 < this.cfr_renamed_23 - 1)) {
                this.cfr_renamed_4 += 1;
                if (" ".length() == 0) {
                    return;
                }
            }
        } else if ((GameCanvas.boolean_do(2))) {
            if (t_0.boolean_if(this.cfr_renamed_4 / this.cfr_renamed_23)) {
                this.cfr_renamed_4 -= this.cfr_renamed_23;
                if ((7 ^ 3) < " ".length()) {
                    return;
                }
            }
        } else if ((GameCanvas.boolean_do(8)) && (this.cfr_renamed_4 / this.cfr_renamed_23 < t_0.var_ep_do.cfr_renamed_1 / this.cfr_renamed_23) && (this.cfr_renamed_4 + this.cfr_renamed_23 < t_0.var_ep_do.cfr_renamed_1)) {
            this.cfr_renamed_4 += this.cfr_renamed_23;
        }
        if ((GameCanvas.coKichHoat)) {
            n = 0;
            while ((n < MenuChinhAvatar.var_java_lang_String_arr_int.length)) {
                if ((GameCanvas.boolean_do(this.var_int_if + n % this.cfr_renamed_23 * this.cfr_renamed_26 - this.cfr_renamed_27 / 2, this.cfr_renamed_5 + n / this.cfr_renamed_23 * this.cfr_renamed_15 - this.cfr_renamed_27 / 2, this.cfr_renamed_27, this.cfr_renamed_27 + bn_0.var_byte_new + 10))) {
                    this.cfr_renamed_24 = GameCanvas.var_int_case;
                    this.cfr_renamed_12 = this.cfr_renamed_25;
                    this.cfr_renamed_11 = cfr_renamed_10;
                    this.cfr_renamed_28 = 0;
                    GameCanvas.coKichHoat = 0;
                    this.coTrangThai = 1;
                    if (((33 + 9 - -16 + 118 ^ 60 + 27 - -26 + 44) & (6 + 76 - 61 + 170 ^ 100 + 105 - 158 + 99 ^ -" ".length())) <= "   ".length()) break;
                    return;
                }
                ++n;
                if (-"   ".length() <= 0) continue;
                return;
            }
        }
        if ((this.coTrangThai)) {
            int n2;
            n = this.cfr_renamed_25 - this.cfr_renamed_12;
            int n3 = this.cfr_renamed_24 - GameCanvas.soLuongKhoa;
            this.cfr_renamed_24 = GameCanvas.soLuongKhoa;
            if ((GameCanvas.var_boolean_try)) {
                if ((this.cfr_renamed_25 % 2 == 0)) {
                    this.cfr_renamed_33 = GameCanvas.soLuongKhoa;
                    this.cfr_renamed_31 = this.cfr_renamed_25;
                }
                this.cfr_renamed_28 = 0;
                if (t_0.boolean_if(cfr_renamed_9) && (cfr_renamed_9 < cfr_renamed_21)) {
                    this.cfr_renamed_11 = cfr_renamed_9 = this.cfr_renamed_11 + n3;
                    if (-" ".length() > " ".length()) {
                        return;
                    }
                } else {
                    cfr_renamed_9 = this.cfr_renamed_11 + GameCanvas.int_do() / 2;
                }
                cfr_renamed_10 = cfr_renamed_9;
                if ((n < 20)) {
                    n3 = (cfr_renamed_9 + GameCanvas.soLuongKhoa - (this.var_int_if - this.cfr_renamed_26 / 2)) / this.cfr_renamed_26;
                    n2 = (GameCanvas.var_int_if - (this.cfr_renamed_5 - this.cfr_renamed_26 / 2)) / this.cfr_renamed_15;
                    this.cfr_renamed_4 = n2 * this.cfr_renamed_23 + n3;
                    if ((this.cfr_renamed_4 < 0)) {
                        this.cfr_renamed_4 = 0;
                    }
                    if (t_0.boolean_if(this.cfr_renamed_4, MenuChinhAvatar.var_java_lang_String_arr_int.length)) {
                        this.cfr_renamed_4 = MenuChinhAvatar.var_java_lang_String_arr_int.length - 1;
                    }
                }
                if (t_0.cfr_renamed_4(gc_0.int_if(GameCanvas.int_for()), 10 * bn_0.cfr_renamed_6) && t_0.cfr_renamed_4(gc_0.int_if(GameCanvas.int_do()), 10 * bn_0.cfr_renamed_6)) {
                    if ((n > 3) && (n < 8)) {
                        coKichHoat = 0;
                        if (((48 + 204 - 213 + 194 ^ 69 + 82 - 117 + 142) & (0x2B ^ 3 ^ (0xFA ^ 0x8B) ^ -" ".length())) == (0x98 ^ 0xBA ^ (0x19 ^ 0x3F))) {
                            return;
                        }
                    }
                } else {
                    coKichHoat = 1;
                }
            }
            if ((GameCanvas.var_boolean_new)) {
                n3 = this.cfr_renamed_33 - GameCanvas.soLuongKhoa;
                n2 = this.cfr_renamed_25 - this.cfr_renamed_31;
                if ((gc_0.int_if(n3) > 40) && (n2 < 20) && t_0.boolean_if(cfr_renamed_9) && (cfr_renamed_9 < cfr_renamed_21)) {
                    this.cfr_renamed_28 = n3 / n2 * 10;
                }
                this.cfr_renamed_31 = -1;
                if (t_0.cfr_renamed_4(gc_0.int_if(GameCanvas.int_for()), 10 * bn_0.cfr_renamed_6) && t_0.cfr_renamed_4(gc_0.int_if(GameCanvas.int_do()), 10 * bn_0.cfr_renamed_6)) {
                    if (t_0.boolean_do(n, 4)) {
                        this.cfr_renamed_14 = 5;
                        coKichHoat = 0;
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    } else if (!(coKichHoat)) {
                        this.cfr_renamed_11();
                    }
                }
                this.coTrangThai = 0;
                GameCanvas.var_boolean_new = 0;
            }
        }
        if ((GameCanvas.cfr_renamed_16 != 0)) {
            GameCanvas.var_gj_0_do.void_do((ei)((dL)this).cfr_renamed_4, (ei)((dL)this).cfr_renamed_5, (ei)((dL)this).cfr_renamed_2);
            return;
        }
        super.cfr_renamed_15();
    }

    public final void cfr_renamed_4() {
        GameCanvas.cfr_renamed_5();
        this.cfr_renamed_4 = 2;
        eq.eq_do().cfr_renamed_17(3);
        fe_0.var_byte_if = (byte)2;
    }

        public final void (Graphics graphics == null) {
        GameCanvas.var_gj_0_do.cfr_renamed_1(graphics);
        if ((GameCanvas.soLuong != 2)) {
            GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, GameCanvas.var_int_int, (this.cfr_renamed_5 - t_0.var_ep_do.soLuong / 2) / 2);
        }
        graphics.translate(this.var_int_if, this.cfr_renamed_5);
        graphics.translate(-cfr_renamed_10, 0);
        int n = 0;
        while ((n < MenuChinhAvatar.var_java_lang_String_arr_int.length)) {
            var_ep_do.cfr_renamed_0(n, n % this.cfr_renamed_23 * this.cfr_renamed_26, n / this.cfr_renamed_23 * this.cfr_renamed_15, 0, 3, graphics);
            GameCanvas.var_ew_if.cfr_renamed_0(graphics, MenuChinhAvatar.var_java_lang_String_arr_int[n], n % this.cfr_renamed_23 * this.cfr_renamed_26, n / this.cfr_renamed_23 * this.cfr_renamed_15 + t_0.var_ep_do.soLuong / 2 + 5, 2);
            if ((this.cfr_renamed_4 == n) && (!(GameCanvas.coTrangThai) || !(coKichHoat))) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_do, n % this.cfr_renamed_23 * this.cfr_renamed_26, n / this.cfr_renamed_23 * this.cfr_renamed_15, 3);
            }
            ++n;
            if (((0xBE ^ 0x89) & ~(0x2E ^ 0x19)) >= -" ".length()) continue;
            return;
        }
    }

    private static void cfr_renamed_18() {
        mangSoNguyen = new int[21];
        2 = "  ".length();
        13 = 0x59 ^ 0x54;
        11 = 109 + 133 - 112 + 58 ^ 32 + 115 - 142 + 178;
        70 = 0xDA ^ 0x9C;
        40 = 0x97 ^ 0xC6 ^ (0x23 ^ 0x5A);
        4 = 0x1C ^ 0x18;
        100 = 0x3E ^ 0x11 ^ (0x1C ^ 0x57);
        5 = 0x96 ^ 0x93;
        0 = (0x94 ^ 0xA1) & ~(0x66 ^ 0x53);
        1 = " ".length();
        3 = "   ".length();
        -96 = -(0x76 ^ 0x40 ^ (0xE8 ^ 0xBE));
        -40 = -(0x29 ^ 0x41 ^ (0x5A ^ 0x1A));
        -1 = -" ".length();
        500 = -(0xFFFFD7B2 & 0x7A4F) & (0xFFFFFFFF & 0x53F5);
        -500 = -(0xFFFFDBFD & 0x25F6);
        10 = 47 + 98 - 6 + 16 ^ 67 + 59 - 67 + 86;
        15 = 0x9E ^ 0x91;
        20 = 0x62 ^ 0x76;
        6 = 0x51 ^ 0x57;
        8 = 156 + 97 - 89 + 1 ^ 41 + 76 - 48 + 104;
    }

    public static t_0 cfr_renamed_0() {
        if ((var_t_0_do == null)) {
            var_t_0_do = new t_0();
        }
        return var_t_0_do;
    }

    static {
        t_0.cfr_renamed_18();
        dangChayAuto = 1;
        soLuong = 0;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                switch (this.cfr_renamed_4) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: {
                        n = this.cfr_renamed_4;
                        GameCanvas.cfr_renamed_5();
                        eq.eq_do().cfr_renamed_17(3);
                        fe_0.var_byte_if = (byte)n;
                        return;
                    }
                    case 4: {
                        eh.cfr_renamed_0().cfr_renamed_1();
                    }
                }
                return;
            }
            case 1: {
                soLuong = 1;
                GameCanvas.var_ex_do.coTrangThai = 0;
                eq eq2 = eq.eq_do();
                eq2.cfr_renamed_0(-96);
                eq2.cfr_renamed_1();
                GameCanvas.cfr_renamed_5();
                return;
            }
            case 2: {
                eq.eq_do().cfr_renamed_4(1);
                GameCanvas.cfr_renamed_5();
                return;
            }
            case 3: {
                this.cfr_renamed_11();
            }
        }
    }

    public t_0() {
        this.soLuongKhoa = 2;
        this.cfr_renamed_34 = 0;
        this.cfr_renamed_2 = -40;
        this.cfr_renamed_18 = 1;
        this.var_ei_do = new ei(MenuChinhAvatar.dg, 0);
        ((dL)this).cfr_renamed_2 = new ei(MenuChinhAvatar.aY, 1);
        ((dL)this).cfr_renamed_4 = new ei("Top", 2);
        if ((GameCanvas.cfr_renamed_16 == 0)) {
            ((dL)this).cfr_renamed_5 = new ei(MenuChinhAvatar.dg, 3);
        }
    }

        public static void cfr_renamed_5() {
        if ((dangChayAuto) && (ey_0.dangChayAuto)) {
            ey_0.dangChayAuto = 0;
            ey_0.cfr_renamed_0().mangSoNguyen[4] = 0;
            GameCanvas.gameCanvas.void_do();
            t_0.cfr_renamed_12();
        }
    }

    }

