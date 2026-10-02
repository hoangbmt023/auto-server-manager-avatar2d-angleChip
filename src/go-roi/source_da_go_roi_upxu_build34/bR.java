/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bR
extends dL {
    private static final int[] var_int_arr_if;
    private dL var_dL_do;
    int soLuong;
    public int[] mangSoNguyen;
    public static bR var_bR_do;
    int var_int_if;
    int cfr_renamed_3 = var_int_arr_if[1];

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    private static void cfr_renamed_1() {
        var_int_arr_if = new int[10];
        bR.var_int_arr_if[0] = (0x67 ^ 0x70 ^ (0x8D ^ 0xB5)) & (0x90 ^ 0x8B ^ (0xAE ^ 0x9A) ^ -" ".length());
        bR.var_int_arr_if[1] = 81 + 94 - 109 + 124 ^ 101 + 134 - 53 + 5;
        bR.var_int_arr_if[2] = 0x2F ^ 0x28;
        bR.var_int_arr_if[3] = " ".length();
        bR.var_int_arr_if[4] = 0xB6 ^ 0xA2;
        bR.var_int_arr_if[5] = 0xAC ^ 0xB2;
        bR.var_int_arr_if[6] = 9 + 102 - 94 + 159;
        bR.var_int_arr_if[7] = 109 + 4 - -85 + 9 ^ 123 + 103 - 118 + 84;
        bR.var_int_arr_if[8] = 0x3D ^ 0x37;
        bR.var_int_arr_if[9] = "  ".length();
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

        public bR() {
        this.var_int_if = var_int_arr_if[2];
        this.cfr_renamed_2 = new ei(MenuChinhAvatar.cfr_renamed_7, var_int_arr_if[0]);
        this.cfr_renamed_5 = new ei(MenuChinhAvatar.dg, var_int_arr_if[3]);
        this.soLuong = var_int_arr_if[4];
        if (bR.boolean_if(GameCanvas.cfr_renamed_16)) {
            this.soLuong = GameCanvas.cfr_renamed_16 * var_int_arr_if[5];
        }
        if ((GameCanvas.var_int_byte < var_int_arr_if[6])) {
            this.soLuong = var_int_arr_if[7];
        }
        if (bR.boolean_if(this.var_int_if * this.soLuong, GameCanvas.var_int_char - GameCanvas.var_int_else)) {
            this.var_int_if = (GameCanvas.var_int_char - GameCanvas.var_int_else) / this.soLuong;
        }
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    static {
        bR.cfr_renamed_1();
    }

    public final void void_for() {
        this.var_dL_do.void_for();
    }

    public final void (int n, boolean bl == null) {
        if (bR.boolean_do(bl ? 1 : 0) && bR.boolean_do(this.cfr_renamed_17, n) && (this.cfr_renamed_5 != null)) {
            this.cfr_renamed_5.cfr_renamed_1();
        }
        super.cfr_renamed_0(n, bl);
    }

    public static bR cfr_renamed_0() {
        if ((var_bR_do == null)) {
            var_bR_do = new bR();
        }
        return var_bR_do;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                GameCanvas.var_ex_do.coTrangThai = var_int_arr_if[0];
                this.var_dL_do.cfr_renamed_8();
                return;
            }
            case 1: {
                GameCanvas.var_ex_do.coTrangThai = var_int_arr_if[0];
                this.var_dL_do.cfr_renamed_8();
                el_0.el_0_do().cfr_renamed_4(fe_0.var_byte_int, this.cfr_renamed_17);
            }
        }
    }

    public final void (Graphics graphics == null) {
        graphics.translate(var_int_arr_if[0], var_int_arr_if[0]);
        graphics.setClip(var_int_arr_if[0], var_int_arr_if[0], GameCanvas.var_int_byte, GameCanvas.var_int_char);
        this.var_dL_do.cfr_renamed_1(graphics);
        GameCanvas.var_gj_0_do.cfr_renamed_5(graphics, GameCanvas.var_int_int - (this.soLuong * this.cfr_renamed_3 + var_int_arr_if[8]) / var_int_arr_if[9], GameCanvas.var_int_long - this.soLuong * this.var_int_if / var_int_arr_if[9], this.soLuong * this.cfr_renamed_3 + var_int_arr_if[8], this.soLuong * this.var_int_if);
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.soLuong, this.cfr_renamed_3, this.var_int_if, (boolean)this.cfr_renamed_5, this.cfr_renamed_17, this.mangSoNguyen);
        super.cfr_renamed_0(graphics);
    }

        public final void cfr_renamed_15() {
        super.cfr_renamed_15();
    }

        public final void void_do(dL dL2) {
        super.cfr_renamed_8();
        this.var_dL_do = dL2;
        this.cfr_renamed_17 = var_int_arr_if[0];
    }
}

