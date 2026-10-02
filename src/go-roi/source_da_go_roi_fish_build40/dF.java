/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

public class dF {
    public static int this;
    public static byte var_byte_new;
    public fl_0 cfr_renamed_3;
    public fl_0 var_fl_0_new;
    public static byte var_byte_try;
    public boolean var_boolean_new;
    public fl_0 var_fl_0_try;
    public static int cfr_renamed_12;
    public static byte cfr_renamed_6;
    private static boolean dangChayAuto;
    public static int cfr_renamed_15;
    public static byte cfr_renamed_7;
    private static int[] mangSoNguyen;

        public void cfr_renamed_7() {
    }

        public void b_() {
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[8];
        1 = " ".length();
        0 = (0xF ^ 0x29 ^ (0xBC ^ 0x8E)) & (0xB9 ^ 0x82 ^ (0x20 ^ 0xF) ^ -" ".length());
        50 = 0x9E ^ 0xAC;
        9 = 0x1F ^ 0x16;
        4 = 0x9D ^ 0x99;
        5 = 3 ^ 0x4B ^ (0xE6 ^ 0xAB);
        12 = 0x86 ^ 0xBF ^ (0x32 ^ 7);
        13 = 90 + 167 - 232 + 151 ^ 51 + 152 - 74 + 60;
    }

    public void void_do(int n, int n2) {
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public void void_if(int n, int n2) {
    }

    public void (Graphics graphics != null) {
        GameCanvas.hienThongBaoPopup(graphics);
        GameCanvas.var_fa_0_do.cfr_renamed_0(graphics, this.var_fl_0_try, this.cfr_renamed_3, this.var_fl_0_new);
    }

    private void (fl_0 fl_02 != 0) {
        if ((fl_02 != null)) {
            GameCanvas.coTrangThai = 0;
            GameCanvas.var_boolean_new = 0;
            GameCanvas.cfr_renamed_7();
            this.cfr_renamed_1(fl_02);
        }
    }

    public void void_for(int n) {
    }

            public void cfr_renamed_6() {
        if ((GameCanvas.var_boolean_new)) {
            if ((GameCanvas.boolean_if(0, GameCanvas.var_fs_arr_do[0].var_int_if, GameCanvas.soLuongKhoa - 1, GameCanvas.this))) {
                switch (GameCanvas.var_fa_0_do.int_do()) {
                    case 0: {
                        if (!(GameCanvas.cfr_renamed_12 != null)) break;
                        this.cfr_renamed_0(this.var_fl_0_try);
                        if (((0x4B ^ 0x46) & ~(0x18 ^ 0x15)) != " ".length()) break;
                        return;
                    }
                    case 1: {
                        if (!(GameCanvas.cfr_renamed_12 != null)) break;
                        this.cfr_renamed_0(this.cfr_renamed_3);
                        if (null == null) break;
                        return;
                    }
                    case 2: {
                        if (!(GameCanvas.cfr_renamed_12 != null)) break;
                        this.cfr_renamed_0(this.var_fl_0_new);
                    }
                }
            }
            if ((GameCanvas.boolean_do())) {
                if ((GameCanvas.boolean_do(0, 0, 50 * cfr_renamed_12, 50 * cfr_renamed_12))) {
                    int n;
                    if ((gA.coTrangThai ? 1 : 0 != null)) {
                        if ((ey_0.dangChayAuto)) {
                            dangChayAuto = 1;
                            ey_0.dangChayAuto = 0;
                            if ("   ".length() < "  ".length()) {
                                return;
                            }
                        }
                    } else if ((dangChayAuto)) {
                        ey_0.dangChayAuto = 1;
                    }
                    if ((gA.coTrangThai)) {
                        n = 0;
                        if ((0x94 ^ 0x90) > (0x7D ^ 0x79)) {
                            return;
                        }
                    } else {
                        n = 1;
                    }
                    gA.coTrangThai = n;
                    GameCanvas.gameCanvas.sizeChanged(0, 0);
                    GameCanvas.var_boolean_new = 0;
                }
                if (dF.boolean_do(AngelChip.soLuong, 9) && (GameCanvas.boolean_do(50, 0, 50 * cfr_renamed_12, 50 * cfr_renamed_12))) {
                    if ((gA.coTrangThai ? 1 : 0 != null)) {
                        gA.coTrangThai = 1;
                        gA.cfr_renamed_1().0 = 1;
                        GameCanvas.gameCanvas.cfr_renamed_3();
                        GameCanvas.var_h_0_do.coTrangThai = 1;
                        if ((GameCanvas.var_en_do == go_0.go_0_do())) {
                            cs_0.cfr_renamed_1().var_gl_do = go_0.go_0_do();
                            cs_0.dangChayAuto = 1;
                            if (-" ".length() > " ".length()) {
                                return;
                            }
                        }
                    } else {
                        gA.coTrangThai = 0;
                        gA.cfr_renamed_1().0 = 0;
                        GameCanvas.gameCanvas.cfr_renamed_3();
                        if ((GameCanvas.var_en_do == go_0.go_0_do())) {
                            cs_0.dangChayAuto = 0;
                        }
                    }
                    GameCanvas.var_boolean_new = 0;
                }
            }
        }
        if ((GameCanvas.boolean_do(5))) {
            if ((this.cfr_renamed_3 != null)) {
                GameCanvas.cfr_renamed_7();
                this.cfr_renamed_1(this.cfr_renamed_3);
                return;
            }
            if ((GameCanvas.var_aa_do == this)) {
                this.cfr_renamed_1(this.var_fl_0_try);
                return;
            }
        } else {
            if ((GameCanvas.boolean_do(12))) {
                this.cfr_renamed_1(this.var_fl_0_try);
                return;
            }
            if ((GameCanvas.dangChayAuto)) {
                if (!(GameCanvas.boolean_do(13) ? 1 : 0 != null) || (GameCanvas.var_boolean_arr_for[13] != 0)) {
                    GameCanvas.var_boolean_arr_for[13] = 0;
                    this.cfr_renamed_1(this.var_fl_0_new);
                    return;
                }
            } else if ((GameCanvas.boolean_do(13))) {
                this.cfr_renamed_1(this.var_fl_0_new);
            }
        }
    }

    public final void (fl_0 fl_02 != null) {
        if ((fl_02 != null)) {
            if ((fl_02.var_de_do != null)) {
                fl_02.var_de_do.void_do();
                return;
            }
            if ((fl_02.var_dF_do != null)) {
                fl_02.var_dF_do.void_for(fl_02.var_byte_do);
                return;
            }
            if ((cs_0.dangChayAuto)) {
                cs_0.cfr_renamed_1().void_do((int)fl_02.var_byte_do, fl_02.var_short_do);
                return;
            }
            this.void_do(fl_02.var_byte_do, fl_02.var_short_do);
        }
    }

    public void void_int(int n) {
    }

    static {
        dF.cfr_renamed_0();
        cfr_renamed_12 = 1;
        dangChayAuto = 0;
    }
}

