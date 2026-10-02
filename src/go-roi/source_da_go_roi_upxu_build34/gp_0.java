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
 * Renamed from gP
 */
public final class gp_0
extends dL {
    private Vector var_java_util_Vector_do;
    private ei var_ei_do;
    private int soLuong;
    public static String chuoiGiaTri;
    public static ep var_ep_do;
    private ei var_ei_if;
    public static int[][] var_int_arr_arr_do;
    private int var_int_if;
    public static gp_0 var_gp_0_do;
    private static final int[] mangSoNguyen;
    private int cfr_renamed_3 = 0;
    private int cfr_renamed_4 = -1;

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public static void (Graphics graphics, String string == null) {
        GameCanvas.var_gj_0_do.cfr_renamed_1(graphics);
        if ((GameCanvas.var_int_byte > 200)) {
            GameCanvas.var_gj_0_do.cfr_renamed_3(graphics, GameCanvas.var_int_int - 100 * bn_0.cfr_renamed_6, 5 * bn_0.cfr_renamed_6 - ex.cfr_renamed_18, 200 * bn_0.cfr_renamed_6, 44 * bn_0.cfr_renamed_6);
            ew ew2 = GameCanvas.var_ew_new;
            if (gp_0.boolean_if(GameCanvas.cfr_renamed_16)) {
                ew2 = GameCanvas.var_ew_byte;
            }
            ew2.cfr_renamed_0(graphics, string, GameCanvas.var_int_int, 5 * bn_0.cfr_renamed_6 - ex.cfr_renamed_18 + 22 * bn_0.cfr_renamed_6 - ew2.int_do() / 2, 2);
        }
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                GameCanvas.cfr_renamed_5();
                cd_0.cd_0_do().cfr_renamed_4();
                return;
            }
            case 2: {
                GameCanvas.cfr_renamed_5();
                cd_0.cd_0_do().cfr_renamed_3();
                return;
            }
            case 3: {
                GameCanvas.cfr_renamed_5();
                eq.eq_do().cfr_renamed_11(AngelChip.duLieuNguoiChoi.var_short_char);
            }
        }
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

    public final void (int n, boolean bl == null) {
        if ((bl) && gp_0.boolean_do(this.soLuong, n)) {
            this.cfr_renamed_5();
        }
        if (gp_0.boolean_if(GameCanvas.cfr_renamed_16)) {
            if ((this.soLuong > 0) && (this.soLuong < this.var_java_util_Vector_do.size())) {
                ej_0 ej_02 = (ej_0)this.var_java_util_Vector_do.elementAt(n);
                if ((ej_02.cfr_renamed_1 != -1) && (ej_02.cfr_renamed_1 != -1)) {
                    if ((n >= 0) && (n < this.var_java_util_Vector_do.size())) {
                        this.soLuong = n;
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    }
                } else if ((n > this.soLuong)) {
                    this.soLuong = n + this.cfr_renamed_3;
                    if ((63 + 81 - 68 + 54 ^ 61 + 55 - 42 + 61) <= 0) {
                        return;
                    }
                } else {
                    this.soLuong = n - this.cfr_renamed_3;
                }
                GameCanvas.var_ex_do.void_do(this.soLuong);
                if ((this.soLuong <= 0)) {
                    this.soLuong = this.var_java_util_Vector_do.size() - 1;
                    GameCanvas.var_ex_do.void_do(this.soLuong);
                    return;
                }
                return;
            }
        } else {
            this.soLuong = n;
        }
    }

    private boolean boolean_do() {
        int n = 0;
        while ((n < this.var_java_util_Vector_do.size())) {
            ej_0 ej_02 = (ej_0)this.var_java_util_Vector_do.elementAt(n);
            if (gp_0.boolean_do((int)ej_02.cfr_renamed_1, -1)) {
                int n2;
                int n3 = this.cfr_renamed_3 - n % this.cfr_renamed_3;
                if ((n3 != this.cfr_renamed_3)) {
                    n2 = 0;
                    while ((n2 < n3)) {
                        this.var_java_util_Vector_do.insertElementAt(new ej_0(-2, ej_02.cfr_renamed_3), n);
                        ++n2;
                        if (((0x1C ^ 0xC ^ (0xD9 ^ 0x83)) & (0x89 ^ 0xA6 ^ (0x31 ^ 0x54) ^ -" ".length())) == 0) continue;
                        return ((172 + 77 - 83 + 33 ^ 110 + 15 - 104 + 138) & (154 + 74 - 37 + 57 ^ 128 + 53 - 149 + 128 ^ -" ".length())) != 0;
                    }
                    n += n3;
                }
                n2 = 0;
                while ((n2 < this.cfr_renamed_3 - 1)) {
                    this.var_java_util_Vector_do.insertElementAt(new ej_0(-2, ej_02.cfr_renamed_3), n + 1);
                    ++n2;
                    if (((131 + 15 - -3 + 47 ^ 30 + 82 - 77 + 115) & (0x88 ^ 0x87 ^ (0x4B ^ 0x16) ^ -" ".length())) < (0x14 ^ 0x4E ^ (0xE5 ^ 0xBB))) continue;
                    return ((0x1F ^ 0x53 ^ (0x11 ^ 0x42)) & (126 + 2 - 88 + 120 ^ 131 + 35 - -3 + 22 ^ -" ".length())) != 0;
                }
                n += this.cfr_renamed_3;
            }
            ++n;
            if (-"  ".length() <= 0) continue;
            return ((0x99 ^ 0xA5 ^ (0xFB ^ 0x81)) & (0xB6 ^ 0x82 ^ (0x4E ^ 0x3C) ^ -" ".length())) != 0;
        }
        return 0;
    }

    public gp_0() {
        this.cfr_renamed_1();
        this.a_();
    }

    static {
        gp_0.cfr_renamed_12();
        var_int_arr_arr_do = new int[4][];
    }

    public final void void_for() {
    }

    public static gp_0 gp_0_do() {
        if ((var_gp_0_do == null)) {
            var_gp_0_do = new gp_0();
        }
        return var_gp_0_do;
    }

    public static void (int n, a_0 a_02 == null) {
        if (gp_0.boolean_if(t_0.dangChayAuto ? 1 : 0)) {
            chuoiGiaTri = MenuChinhAvatar.var_java_lang_String_arr_try[n];
            if (("  ".length() & ("  ".length() ^ -" ".length())) > 0) {
                return;
            }
        } else {
            chuoiGiaTri = MenuChinhAvatar.var_java_lang_String_arr_int[n];
        }
        al_0.var_a_0_do = a_02;
    }

    public final void a_() {
        this.var_ei_do = new ei(MenuChinhAvatar.Z, 0);
        this.var_ei_if = new ei(MenuChinhAvatar.cfr_renamed_7, 2);
        ((dL)this).cfr_renamed_4 = this.var_ei_do;
        this.cfr_renamed_2 = this.var_ei_if;
    }

    public final void cfr_renamed_1() {
        if (gp_0.boolean_if(GameCanvas.cfr_renamed_16)) {
            this.var_int_if = 50;
            this.cfr_renamed_3 = 1;
            if ((0x4F ^ 0x2D ^ (0xD2 ^ 0xB4)) <= ((0x7F ^ 0x1C ^ (5 ^ 0x71)) & (166 + 166 - 242 + 121 ^ 118 + 0 - -71 + 7 ^ -" ".length()))) {
                return;
            }
        } else {
            if (gp_0.boolean_do(GameCanvas.cfr_renamed_16, 1)) {
                this.var_int_if = 80;
                if ("  ".length() < -" ".length()) {
                    return;
                }
            } else if (gp_0.boolean_do(GameCanvas.cfr_renamed_16, 2)) {
                this.var_int_if = 150;
            }
            this.cfr_renamed_3 = GameCanvas.var_int_byte / this.var_int_if;
        }
        if ((this.var_java_util_Vector_do != null) && (this.var_int_if != 0)) {
            if (gp_0.boolean_if(GameCanvas.cfr_renamed_16)) {
                int n;
                int n2;
                int n3 = 0;
                if ((GameCanvas.var_int_byte < 200)) {
                    n2 = this.var_int_if / 2;
                    if ((0x91 ^ 0x95) > (3 ^ 7)) {
                        return;
                    }
                } else {
                    n2 = 50;
                }
                int n4 = this.var_java_util_Vector_do.size() * this.var_int_if;
                if ((GameCanvas.var_int_byte < 200)) {
                    n = this.var_int_if / 2;
                    if ("   ".length() <= ((0x76 ^ 0x51) & ~(0xE3 ^ 0xC4))) {
                        return;
                    }
                } else {
                    n = 50;
                }
                GameCanvas.var_ex_do.cfr_renamed_0(n3, n2, GameCanvas.var_int_byte, this.var_int_if, GameCanvas.var_int_byte, n4, GameCanvas.var_int_byte, GameCanvas.var_int_char - n - 4, this.var_java_util_Vector_do.size());
                if (-" ".length() > " ".length()) {
                    return;
                }
            } else {
                GameCanvas.var_ex_do.cfr_renamed_0((GameCanvas.var_int_byte - this.var_int_if * this.cfr_renamed_3) / 2, 50 * bn_0.cfr_renamed_6, this.var_int_if, this.var_int_if, GameCanvas.var_int_byte, (this.var_java_util_Vector_do.size() / this.cfr_renamed_3 + 2) * this.var_int_if, GameCanvas.var_int_byte, GameCanvas.var_int_char - 50 * bn_0.cfr_renamed_6 - 4, this.var_java_util_Vector_do.size());
            }
            GameCanvas.var_ex_do.void_do(this.soLuong);
        }
    }

    private void cfr_renamed_5() {
        byte by2 = ((ej_0)this.var_java_util_Vector_do.elementAt((int)this.soLuong)).cfr_renamed_1;
        if ((by2 != -1)) {
            cd_0.cd_0_do().cfr_renamed_1(by2);
            GameCanvas.cfr_renamed_5();
        }
    }

                    private static void cfr_renamed_12() {
        mangSoNguyen = new int[16];
        3 = "   ".length();
        1 = " ".length();
        0 = (85 + 108 - 142 + 76 ^ (0x6B ^ 0x5A)) & (0x5B ^ 3 ^ (0xBC ^ 0xAA) ^ -" ".length());
        -1 = -" ".length();
        2 = "  ".length();
        9 = 149 + 94 - 180 + 89 ^ 47 + 138 - 154 + 114;
        50 = 0x7D ^ 0x4F;
        80 = 0xE8 ^ 0x81 ^ (0xB3 ^ 0x8A);
        150 = 28 + 9 - -52 + 61;
        200 = 69 + 13 - 24 + 121 + (0xB6 ^ 0x8B) - (118 + 47 - 137 + 152) + (86 + 12 - 73 + 115);
        4 = 0xB4 ^ 0xB0;
        100 = 0x22 ^ 0x4C ^ (0x1F ^ 0x15);
        5 = 0x9C ^ 0x99;
        44 = 0xA ^ 0x78 ^ (0x7B ^ 0x25);
        22 = 0x3F ^ 0x29;
        -2 = -"  ".length();
    }

            public final void (Graphics graphics != null) {
        GameCanvas.var_gj_0_do.cfr_renamed_1(graphics);
        (graphics, "Phòng " + chuoiGiaTri == null);
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.var_java_util_Vector_do, this.var_int_if, this.soLuong);
    }

    public final void (Graphics graphics == null) {
        this.cfr_renamed_1(graphics);
        t_0.cfr_renamed_0(graphics, (ei)((dL)this).cfr_renamed_4, (ei)this.cfr_renamed_5, (ei)this.cfr_renamed_2);
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei(MenuChinhAvatar.cG, 1));
                vector.addElement(new ei(MenuChinhAvatar.bE, 2));
                if (gp_0.boolean_if(GameCanvas.cfr_renamed_16)) {
                    vector.addElement(fe_0.fe_0_do().var_ei_for);
                }
                vector.addElement(new ei(MenuChinhAvatar.var_java_lang_String_float, 3));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 1: {
                this.cfr_renamed_5();
                return;
            }
            case 2: {
                eq.eq_do().cfr_renamed_17(9);
                GameCanvas.cfr_renamed_5();
                return;
            }
            case 3: {
                this.cfr_renamed_5();
            }
        }
    }

    private static boolean (byte by2, int[] nArray == null) {
        if ((nArray != null) && (nArray.length > 1) && gp_0.boolean_if(AngelChip.duLieuNguoiChoi.mangSoNguyen[2], nArray[0])) {
            int n = 1;
            while ((n < nArray.length)) {
                if (gp_0.boolean_do((int)by2, (byte)nArray[n])) {
                    return 1;
                }
                ++n;
                if (((43 + 76 - 65 + 118 ^ 9 + 106 - 65 + 120) & (0x40 ^ 0 ^ (0xD8 ^ 0x9E) ^ -" ".length())) >= 0) continue;
                return (("   ".length() ^ (0x6D ^ 0x22)) & ("   ".length() ^ (0xF9 ^ 0xB6) ^ -" ".length())) != 0;
            }
        }
        return 0;
    }

    public final void (Vector vector == null) {
        int n = 0;
        while ((n < vector.size())) {
            ej_0 ej_02 = (ej_0)vector.elementAt(n);
            int n2 = n;
            while ((n2 < vector.size())) {
                ej_0 ej_03 = (ej_0)vector.elementAt(n2);
                if ((ej_03.cfr_renamed_3 < ej_02.cfr_renamed_3)) {
                    vector.setElementAt(ej_02, n2);
                    vector.setElementAt(ej_03, n);
                    ej_02 = ej_03;
                }
                ++n2;
                if (-" ".length() <= ((0x1F ^ 0x61 ^ (0xF7 ^ 0xBC)) & (9 + 146 - 13 + 41 ^ 16 + 127 - 24 + 11 ^ -" ".length()))) continue;
                return;
            }
            ++n;
            if (-" ".length() < 0) continue;
            return;
        }
        this.var_java_util_Vector_do = new Vector();
        n = -1;
        int n3 = 0;
        while ((n3 < vector.size())) {
            ej_0 ej_04 = (ej_0)vector.elementAt(n3);
            if (!(n != -1) || (ej_04.cfr_renamed_3 != n)) {
                this.var_java_util_Vector_do.addElement(new ej_0(-1, ej_04.cfr_renamed_3));
            }
            this.var_java_util_Vector_do.addElement(ej_04);
            n = ej_04.cfr_renamed_3;
            ++n3;
            if (((0x10 ^ 0x4C) & ~(0x5D ^ 1)) == 0) continue;
            return;
        }
        if ((GameCanvas.cfr_renamed_16 != 0)) {
            this.boolean_do();
            }
        this.soLuong = 1;
        this.cfr_renamed_1();
    }

        public final void cfr_renamed_15() {
        if ((GameCanvas.cfr_renamed_16 != 0)) {
            GameCanvas.var_gj_0_do.void_do((ei)((dL)this).cfr_renamed_4, (ei)this.cfr_renamed_5, (ei)this.cfr_renamed_2);
            return;
        }
        super.cfr_renamed_15();
    }

    public final void cfr_renamed_4() {
        if (gp_0.boolean_do(this.cfr_renamed_4)) {
            GameCanvas.cfr_renamed_5();
            cd_0.cd_0_do().cfr_renamed_3();
            if ((TienIchGame.cfr_renamed_2(15000L))) {
                TienIchGame.hienThongBao(1500L);
            }
            return;
        }
        ej_0 ej_02 = (ej_0)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_4);
        if (!((ej_02.var_byte_do != 1) && !gp_0.boolean_do((int)ej_02.var_byte_do, 2) || gp_0.boolean_ifej_02.cfr_renamed_1, var_int_arr_arr_do[0] == null && gp_0.boolean_ifej_02.cfr_renamed_1, var_int_arr_arr_do[1] == null && gp_0.boolean_ifej_02.cfr_renamed_1, var_int_arr_arr_do[2] == null && !gp_0.cfr_renamed_4ej_02.cfr_renamed_1, var_int_arr_arr_do[3] == null)) {
            GameCanvas.cfr_renamed_5();
            cd_0.cd_0_do().cfr_renamed_1(ej_02.cfr_renamed_1);
            if ((TienIchGame.cfr_renamed_2(5000L))) {
                TienIchGame.hienThongBao(1500L);
            }
        }
        this.cfr_renamed_4 -= 1;
    }

    public final void cfr_renamed_8() {
        GameCanvas.var_gj_0_do.void_do();
        super.cfr_renamed_8();
        this.cfr_renamed_2 = this.var_ei_if;
        if (gp_0.boolean_if(GameCanvas.cfr_renamed_16)) {
            this.cfr_renamed_5 = new ei(MenuChinhAvatar.dg, 3);
            if ((0xAD ^ 0xA8) == 0) {
                return;
            }
        } else {
            this.cfr_renamed_5 = new ei(MenuChinhAvatar.cG, 1);
        }
        this.cfr_renamed_5 = (Image)1;
        this.cfr_renamed_1();
        t_0.cfr_renamed_1();
        this.soLuong = this.cfr_renamed_3;
        GameCanvas.var_ex_do.void_do(this.soLuong);
        if ((this.var_java_util_Vector_do != null) && (!(this.cfr_renamed_4 >= 0) || gp_0.boolean_if(this.cfr_renamed_4, this.var_java_util_Vector_do.size()))) {
            this.cfr_renamed_4 = this.var_java_util_Vector_do.size() - 1;
        }
        TienIchGame.cfr_renamed_8();
    }

        }

