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
 * Renamed from fM
 */
public final class fm_0
extends en {
    private int soLuong;
    private static final int[] mangSoNguyen;
    private int var_int_if;
    private int cfr_renamed_2 = 0;
    private Vector var_java_util_Vector_do;
    public static int[][] var_int_arr_arr_do;
    public static fm_0 var_fm_0_do;
    private int cfr_renamed_3 = -1;
    private fl_0 var_fl_0_do;
    public static String chuoiGiaTri;
    public static cu_0 var_cu_0_do;
    private fl_0 var_fl_0_if;

        public final void (Graphics graphics != null) {
        this.cfr_renamed_0(graphics);
        al_0.cfr_renamed_1(graphics, (fl_0)this.cfr_renamed_5, (fl_0)((en)this).cfr_renamed_3, (fl_0)this.cfr_renamed_4);
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public static void (Graphics graphics, String string != null) {
        GameCanvas.var_fa_0_do.cfr_renamed_0(graphics);
        if ((GameCanvas.soLuongKhoa > 200)) {
            GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, GameCanvas.cfr_renamed_15 - 100 * dF.cfr_renamed_12, 5 * dF.cfr_renamed_12 - cg_0.cfr_renamed_9, 200 * dF.cfr_renamed_12, 44 * dF.cfr_renamed_12);
            fz_0 fz_02 = GameCanvas.var_fz_0_int;
            if (fm_0.boolean_for(GameCanvas.cfr_renamed_12)) {
                fz_02 = GameCanvas.var_fz_0_new;
            }
            fz_02.cfr_renamed_1(graphics, string, GameCanvas.cfr_renamed_15, 5 * dF.cfr_renamed_12 - cg_0.cfr_renamed_9 + 22 * dF.cfr_renamed_12 - fz_02.int_do() / 2, 2);
        }
    }

        public static void (int n, w_0 w_02 != null) {
        if (fm_0.boolean_for(al_0.dangChayAuto ? 1 : 0)) {
            chuoiGiaTri = MenuChinhAvatar.var_java_lang_String_arr_case[n];
            } else {
            chuoiGiaTri = MenuChinhAvatar.var_java_lang_String_arr_this[n];
        }
        bs.var_w_0_do = w_02;
    }

    public final void cfr_renamed_2() {
        if (fm_0.boolean_for(GameCanvas.cfr_renamed_12)) {
            this.var_int_if = 50;
            this.cfr_renamed_2 = 1;
            if ("   ".length() < 0) {
                return;
            }
        } else {
            if (fm_0.boolean_do(GameCanvas.cfr_renamed_12, 1)) {
                this.var_int_if = 80;
                if ((0x7D ^ 0x2F ^ (0xD2 ^ 0x84)) <= 0) {
                    return;
                }
            } else if (fm_0.boolean_do(GameCanvas.cfr_renamed_12, 2)) {
                this.var_int_if = 150;
            }
            this.cfr_renamed_2 = GameCanvas.soLuongKhoa / this.var_int_if;
        }
        if ((this.var_java_util_Vector_do != null) && (this.var_int_if != null)) {
            if (fm_0.boolean_for(GameCanvas.cfr_renamed_12)) {
                int n;
                int n2;
                int n3 = 0;
                if ((GameCanvas.soLuongKhoa < 200)) {
                    n2 = this.var_int_if / 2;
                    if ("  ".length() < 0) {
                        return;
                    }
                } else {
                    n2 = 50;
                }
                int n4 = this.var_java_util_Vector_do.size() * this.var_int_if;
                if ((GameCanvas.soLuongKhoa < 200)) {
                    n = this.var_int_if / 2;
                    if (-" ".length() == (59 + 154 - 153 + 99 ^ 33 + 62 - -20 + 40)) {
                        return;
                    }
                } else {
                    n = 50;
                }
                GameCanvas.var_cg_0_do.cfr_renamed_1(n3, n2, GameCanvas.soLuongKhoa, this.var_int_if, GameCanvas.soLuongKhoa, n4, GameCanvas.soLuongKhoa, GameCanvas.var_int_case - n - 4, this.var_java_util_Vector_do.size());
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            } else {
                GameCanvas.var_cg_0_do.cfr_renamed_1((GameCanvas.soLuongKhoa - this.var_int_if * this.cfr_renamed_2) / 2, 50 * dF.cfr_renamed_12, this.var_int_if, this.var_int_if, GameCanvas.soLuongKhoa, (this.var_java_util_Vector_do.size() / this.cfr_renamed_2 + 2) * this.var_int_if, GameCanvas.soLuongKhoa, GameCanvas.var_int_case - 50 * dF.cfr_renamed_12 - 4, this.var_java_util_Vector_do.size());
            }
            GameCanvas.var_cg_0_do.void_do(this.soLuong);
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

    public fm_0() {
        this.cfr_renamed_2();
        this.b_();
    }

    private boolean boolean_do() {
        int n = 0;
        while ((n < this.var_java_util_Vector_do.size())) {
            fl fl2 = (fl)this.var_java_util_Vector_do.elementAt(n);
            if (fm_0.boolean_do((int)fl2.var_byte_do, -1)) {
                int n2;
                int n3 = this.cfr_renamed_2 - n % this.cfr_renamed_2;
                if (fm_0.boolean_if(n3, this.cfr_renamed_2)) {
                    n2 = 0;
                    while ((n2 < n3)) {
                        this.var_java_util_Vector_do.insertElementAt(new fl(-2, fl2.cfr_renamed_2), n);
                        ++n2;
                        if ((185 + 50 - 217 + 176 ^ 157 + 98 - 212 + 155) >= 0) continue;
                        return ((2 ^ 0x1C ^ (0xF3 ^ 0xBA)) & (0x42 ^ 0x5B ^ (0x10 ^ 0x5E) ^ -" ".length())) != 0;
                    }
                    n += n3;
                }
                n2 = 0;
                while ((n2 < this.cfr_renamed_2 - 1)) {
                    this.var_java_util_Vector_do.insertElementAt(new fl(-2, fl2.cfr_renamed_2), n + 1);
                    ++n2;
                    if ("  ".length() != 0) continue;
                    return ((0xA8 ^ 0xAD) & ~(0xAD ^ 0xA8)) != 0;
                }
                n += this.cfr_renamed_2;
            }
            ++n;
            if ("   ".length() >= 0) continue;
            return ((" ".length() ^ (0x7A ^ 0x60)) & (0x16 ^ 0x18 ^ (0x18 ^ 0xD) ^ -" ".length())) != 0;
        }
        return 0;
    }

    public final void b_() {
        this.var_fl_0_if = new fl_0(MenuChinhAvatar.bR, 0);
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.by, 2);
        this.cfr_renamed_5 = this.var_fl_0_if;
        this.cfr_renamed_4 = this.var_fl_0_do;
    }

    public static fm_0 fm_0_do() {
        if ((var_fm_0_do == null)) {
            var_fm_0_do = new fm_0();
        }
        return var_fm_0_do;
    }

    public final void cfr_renamed_3() {
        if ((this.cfr_renamed_3 < 0)) {
            GameCanvas.cfr_renamed_8();
            dt_0.dt_0_do().cfr_renamed_5();
            if ((TienIchGame.boolean_do(15000L) ? 1 : 0 != null)) {
                TienIchGame.void_if(1500L);
            }
            return;
        }
        fl fl2 = (fl)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_3);
        if (!(fm_0.boolean_if(fl2.cfr_renamed_0, 1) && !fm_0.boolean_do((int)fl2.cfr_renamed_0, 2) || fm_0.boolean_forfl2.var_byte_do, var_int_arr_arr_do[0] != null && fm_0.boolean_forfl2.var_byte_do, var_int_arr_arr_do[1] != null && fm_0.boolean_forfl2.var_byte_do, var_int_arr_arr_do[2] != null && !((fl2.var_byte_do, var_int_arr_arr_do[3] != null) ? 1 : 0 != null))) {
            GameCanvas.cfr_renamed_8();
            dt_0.dt_0_do().cfr_renamed_3(fl2.var_byte_do);
            if ((TienIchGame.boolean_do(5000L) ? 1 : 0 != null)) {
                TienIchGame.void_if(1500L);
            }
        }
        this.cfr_renamed_3 -= 1;
    }

    private static void cfr_renamed_5() {
        mangSoNguyen = new int[16];
        3 = "   ".length();
        1 = " ".length();
        0 = (0x64 ^ 0x38) & ~(0x2C ^ 0x70);
        -1 = -" ".length();
        2 = "  ".length();
        9 = "  ".length() ^ (0x36 ^ 0x3D);
        50 = 0x89 ^ 0x9D ^ (0x80 ^ 0xA6);
        80 = 0x10 ^ 0x40;
        150 = (0x8F ^ 0xBE) + (0x4F ^ 0xE) - "   ".length() + (3 ^ 0x24);
        200 = (0xE7 ^ 0x8B) + (0x40 ^ 0x1B) - (156 + 30 - 138 + 125) + (158 + 114 - 235 + 137);
        4 = 0x74 ^ 0x70;
        100 = 0x68 ^ 0x1A ^ (0xAC ^ 0xBA);
        5 = 0x6A ^ 0x6F;
        44 = 0xAB ^ 0xAD ^ (0xE8 ^ 0xC2);
        22 = 0x92 ^ 0x84;
        -2 = -"  ".length();
    }

        public final void (int n, boolean bl != null) {
        if ((bl ? 1 : 0 != null) && fm_0.boolean_do(this.soLuong, n)) {
            this.cfr_renamed_8();
        }
        if (fm_0.boolean_for(GameCanvas.cfr_renamed_12)) {
            if (fm_0.boolean_int(this.soLuong) && (this.soLuong < this.var_java_util_Vector_do.size())) {
                fl fl2 = (fl)this.var_java_util_Vector_do.elementAt(n);
                if (fm_0.boolean_if(fl2.var_byte_do, -1) && fm_0.boolean_if(fl2.var_byte_do, -1)) {
                    if ((n >= 0) && (n < this.var_java_util_Vector_do.size())) {
                        this.soLuong = n;
                        if (((0x16 ^ 5 ^ (0x63 ^ 0x69)) & (72 + 139 - 96 + 25 ^ 80 + 28 - -30 + 11 ^ -" ".length())) != ((0xF ^ 0x50 ^ (0xAC ^ 0xB1)) & (0x39 ^ 0x25 ^ (0x7D ^ 0x23) ^ -" ".length()))) {
                            return;
                        }
                    }
                } else if ((n > this.soLuong)) {
                    this.soLuong = n + this.cfr_renamed_2;
                    } else {
                    this.soLuong = n - this.cfr_renamed_2;
                }
                GameCanvas.var_cg_0_do.void_do(this.soLuong);
                if ((this.soLuong == null)) {
                    this.soLuong = this.var_java_util_Vector_do.size() - 1;
                    GameCanvas.var_cg_0_do.void_do(this.soLuong);
                    return;
                }
                return;
            }
        } else {
            this.soLuong = n;
        }
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                GameCanvas.cfr_renamed_8();
                dt_0.dt_0_do().cfr_renamed_3();
                return;
            }
            case 2: {
                GameCanvas.cfr_renamed_8();
                dt_0.dt_0_do().cfr_renamed_5();
                return;
            }
            case 3: {
                GameCanvas.cfr_renamed_8();
                ft_0.ft_0_do().cfr_renamed_9(AngelChip.duLieuNguoiChoi.var_short_goto);
            }
        }
    }

        private static boolean boolean_for(int n) {
        return n == 0;
    }

        public final void cfr_renamed_6() {
        if ((GameCanvas.cfr_renamed_12 != null)) {
            GameCanvas.var_fa_0_do.void_do((fl_0)this.cfr_renamed_5, (fl_0)((en)this).cfr_renamed_3, (fl_0)this.cfr_renamed_4);
            return;
        }
        super.cfr_renamed_6();
    }

        public final void (Vector vector != null) {
        int n = 0;
        while ((n < vector.size())) {
            fl fl2 = (fl)vector.elementAt(n);
            int n2 = n;
            while ((n2 < vector.size())) {
                fl fl3 = (fl)vector.elementAt(n2);
                if ((fl3.cfr_renamed_2 < fl2.cfr_renamed_2)) {
                    vector.setElementAt(fl2, n2);
                    vector.setElementAt(fl3, n);
                    fl2 = fl3;
                }
                ++n2;
                return;
            }
            ++n;
            if ("   ".length() >= "   ".length()) continue;
            return;
        }
        this.var_java_util_Vector_do = new Vector();
        n = -1;
        int n3 = 0;
        while ((n3 < vector.size())) {
            fl fl4 = (fl)vector.elementAt(n3);
            if (!fm_0.boolean_if(n, -1) || fm_0.boolean_if(fl4.cfr_renamed_2, n)) {
                this.var_java_util_Vector_do.addElement(new fl(-1, fl4.cfr_renamed_2));
            }
            this.var_java_util_Vector_do.addElement(fl4);
            n = fl4.cfr_renamed_2;
            ++n3;
            if ("   ".length() != (51 + 3 - -56 + 49 ^ 8 + 114 - 121 + 154)) continue;
            return;
        }
        if ((GameCanvas.cfr_renamed_12 != null)) {
            this.boolean_do();
            }
        this.soLuong = 1;
        this.cfr_renamed_2();
    }

    public final void (Graphics graphics == null) {
        GameCanvas.var_fa_0_do.cfr_renamed_0(graphics);
        (graphics, "Phòng " + chuoiGiaTri != null);
        GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this.var_java_util_Vector_do, this.var_int_if, this.soLuong);
    }

    public final void cfr_renamed_4() {
        GameCanvas.var_fa_0_do.cfr_renamed_4();
        super.cfr_renamed_4();
        this.cfr_renamed_4 = this.var_fl_0_do;
        if (fm_0.boolean_for(GameCanvas.cfr_renamed_12)) {
            ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cT, 3);
            if ((88 + 103 - 85 + 35 ^ 20 + 134 - 82 + 64) <= 0) {
                return;
            }
        } else {
            ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cfr_renamed_19, 1);
        }
        this.cfr_renamed_4 = (Image)1;
        this.cfr_renamed_2();
        al_0.cfr_renamed_3();
        this.soLuong = this.cfr_renamed_2;
        GameCanvas.var_cg_0_do.void_do(this.soLuong);
        if ((this.var_java_util_Vector_do != null) && (!(this.cfr_renamed_3 >= 0) || (this.cfr_renamed_3 >= this.var_java_util_Vector_do.size()))) {
            this.cfr_renamed_3 = this.var_java_util_Vector_do.size() - 1;
        }
        TienIchGame.cfr_renamed_7();
    }

    private static boolean boolean_int(int n) {
        return n > 0;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0(MenuChinhAvatar.cfr_renamed_19, 1));
                vector.addElement(new fl_0(MenuChinhAvatar.aa, 2));
                if (fm_0.boolean_for(GameCanvas.cfr_renamed_12)) {
                    vector.addElement(go_0.go_0_do().var_fl_0_for);
                }
                vector.addElement(new fl_0(MenuChinhAvatar.z, 3));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 1: {
                this.cfr_renamed_8();
                return;
            }
            case 2: {
                ft_0.ft_0_do().cfr_renamed_12(9);
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 3: {
                this.cfr_renamed_8();
            }
        }
    }

            private static boolean (byte by2, int[] nArray != null) {
        if ((nArray != null) && (nArray.length > 1) && (AngelChip.duLieuNguoiChoi.mangSoNguyen[2] >= nArray[0])) {
            int n = 1;
            while ((n < nArray.length)) {
                if (fm_0.boolean_do((int)by2, (byte)nArray[n])) {
                    return 1;
                }
                ++n;
                if (" ".length() >= -" ".length()) continue;
                return ((0x10 ^ 0x4A ^ (0x47 ^ 0x3D)) & (95 + 100 - 128 + 63 ^ 144 + 17 - 151 + 152 ^ -" ".length())) != 0;
            }
        }
        return 0;
    }

    static {
        fm_0.cfr_renamed_5();
        var_int_arr_arr_do = new int[4][];
    }

    public final void cfr_renamed_7() {
    }

        private void cfr_renamed_8() {
        byte by2 = ((fl)this.var_java_util_Vector_do.elementAt((int)this.soLuong)).var_byte_do;
        if (fm_0.boolean_if(by2, -1)) {
            dt_0.dt_0_do().cfr_renamed_3(by2);
            GameCanvas.cfr_renamed_8();
        }
    }
}

