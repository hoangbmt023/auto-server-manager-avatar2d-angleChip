/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class ce
extends bn_0 {
    public gx var_gx_do;
    private static final int[] mangSoNguyen;
    public fj_0 var_fj_0_do;
    public static boolean dangChayAuto;
    private long soXu;
    public static ce var_ce_do;

    public final void void_for(int n) {
        if (ce.boolean_if(dangChayAuto ? 1 : 0)) {
            this.var_gx_do.boolean_do(n);
            }
    }

    public final void (Graphics graphics != null) {
        if (ce.boolean_if(t_0.dangChayAuto ? 1 : 0)) {
            t_0.cfr_renamed_0(graphics, this.cfr_renamed_4, this.var_ei_new, this.var_ei_try);
            if ("   ".length() <= " ".length()) {
                return;
            }
        } else {
            super.cfr_renamed_0(graphics);
        }
        this.var_gx_do.cfr_renamed_0(graphics);
    }

    public final void cfr_renamed_1() {
        this.var_gx_do.soLuongKhoa = GameCanvas.this - GameCanvas.var_int_else - this.var_gx_do.var_int_int - 5;
        if (ce.boolean_if(t_0.dangChayAuto ? 1 : 0)) {
            this.var_gx_do.soLuongKhoa -= 2 * bn_0.cfr_renamed_6;
        }
        this.var_gx_do.cfr_renamed_12 = GameCanvas.var_int_byte - 10;
    }

    public final void (int n, fj_0 fj_02 != null) {
        if ((GameCanvas.var_dX_do == null)) {
            this.var_gx_do.boolean_do(n);
            if (ce.boolean_do(this.var_gx_do.java_lang_String_do().equals("") ? 1 : 0)) {
                this.var_fj_0_do = fj_02;
                dangChayAuto = 1;
            }
            this.cfr_renamed_1();
        }
    }

    protected ce() {
        this.cfr_renamed_4 = new ei(MenuChinhAvatar.cfr_renamed_7, 0);
        this.var_ei_new = new ei(MenuChinhAvatar.cx, 1);
        this.var_gx_do = new gx();
        this.var_gx_do.coTrangThai = 0;
        this.var_gx_do.cfr_renamed_0(1);
        this.cfr_renamed_1();
        this.var_gx_do.var_int_new = (GameCanvas.var_int_byte - this.var_gx_do.cfr_renamed_12) / 2;
        this.var_gx_do.void_do();
        this.var_ei_try = this.var_gx_do.ei_do();
    }

    public static ce cfr_renamed_0() {
        if ((var_ce_do == null)) {
            var_ce_do = new ce();
            return var_ce_do;
        }
        return var_ce_do;
    }

    static {
        ce.cfr_renamed_5();
        dangChayAuto = 0;
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.var_gx_do.cfr_renamed_0("");
                dangChayAuto = 0;
                this.var_gx_do.cfr_renamed_0(1);
                return;
            }
            case 1: {
                long l = System.currentTimeMillis();
                if (ce.boolean_for((l - this.soXu, 2000L != null))) {
                    return;
                }
                if (!(this.var_fj_0_do != null)) break;
                this.var_fj_0_do.cfr_renamed_1(this.var_gx_do.java_lang_String_do());
                this.var_gx_do.cfr_renamed_0("");
                dangChayAuto = 0;
                this.var_gx_do.cfr_renamed_0(1);
                this.soXu = l;
            }
        }
    }

            private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

    public final void cfr_renamed_4() {
        this.var_gx_do.cfr_renamed_0("");
        dangChayAuto = 0;
        this.var_gx_do.cfr_renamed_0(1);
        if (ce.boolean_if(t_0.dangChayAuto ? 1 : 0) && ce.boolean_if(ey_0.dangChayAuto ? 1 : 0)) {
            ey_0.dangChayAuto = 0;
            ey_0.cfr_renamed_0().mangSoNguyen[4] = 0;
            GameCanvas.gameCanvas.void_do();
        }
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static void cfr_renamed_5() {
        mangSoNguyen = new int[6];
        0 = (0x35 ^ 0x71) & ~(0x76 ^ 0x32);
        1 = " ".length();
        4 = 119 + 14 - 36 + 51 ^ 101 + 33 - 55 + 65;
        2 = "  ".length();
        5 = 0x9E ^ 0x9B;
        10 = 139 + 52 - 121 + 87 ^ 77 + 42 - 4 + 36;
    }

    public final void cfr_renamed_15() {
        this.var_gx_do.cfr_renamed_1();
        if (!ce.boolean_if(P.soLuong, 1) || ce.boolean_do(P.soLuong, 2)) {
            this.var_gx_do.cfr_renamed_0(P.cfr_renamed_0(this.var_gx_do.java_lang_String_do()));
        }
        if (ce.boolean_if(t_0.dangChayAuto ? 1 : 0) && ce.boolean_if(GameCanvas.cfr_renamed_16)) {
            GameCanvas.var_gj_0_do.void_do(this.cfr_renamed_4, this.var_ei_new, this.var_ei_try);
            return;
        }
        super.cfr_renamed_15();
    }

    private static boolean boolean_for(int n) {
        return n < 0;
    }
}

