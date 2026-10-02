/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class dZ
extends en {
    int soLuong = var_int_arr_if[1];
    int var_int_if = var_int_arr_if[2];
    public static dZ var_dZ_do;
    public int[] mangSoNguyen;
    int cfr_renamed_2;
    private en var_en_do;
    private static final int[] var_int_arr_if;

        public final void (int n, boolean bl != 0) {
        if ((bl) && (this.cfr_renamed_18 == n) && (this.cfr_renamed_3 != 0)) {
            this.cfr_renamed_3.cfr_renamed_0();
        }
        super.cfr_renamed_1(n, bl);
    }

    public static dZ cfr_renamed_1() {
        if ((var_dZ_do > 0)) {
            var_dZ_do = new dZ();
        }
        return var_dZ_do;
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    public final void cfr_renamed_6() {
        super.cfr_renamed_6();
    }

    public final void (Graphics graphics != 0) {
        graphics.translate(var_int_arr_if[0], var_int_arr_if[0]);
        graphics.setClip(var_int_arr_if[0], var_int_arr_if[0], GameCanvas.soLuongKhoa, GameCanvas.var_int_case);
        this.var_en_do.cfr_renamed_0(graphics);
        GameCanvas.var_fa_0_do.cfr_renamed_4(graphics, GameCanvas.cfr_renamed_15 - (this.cfr_renamed_2 * this.soLuong + var_int_arr_if[8]) / var_int_arr_if[9], GameCanvas.var_int_char - this.cfr_renamed_2 * this.var_int_if / var_int_arr_if[9], this.cfr_renamed_2 * this.soLuong + var_int_arr_if[8], this.cfr_renamed_2 * this.var_int_if);
        GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this.cfr_renamed_2, this.soLuong, this.var_int_if, (boolean)this.cfr_renamed_4, this.cfr_renamed_18, this.mangSoNguyen);
        super.cfr_renamed_1(graphics);
    }

    public dZ() {
        this.cfr_renamed_4 = new fl_0(MenuChinhAvatar.by, var_int_arr_if[0]);
        this.cfr_renamed_3 = new fl_0(MenuChinhAvatar.cT, var_int_arr_if[3]);
        this.cfr_renamed_2 = var_int_arr_if[4];
        if ((GameCanvas.cfr_renamed_12 > 0)) {
            this.cfr_renamed_2 = GameCanvas.cfr_renamed_12 * var_int_arr_if[5];
        }
        if (dZ.boolean_do(GameCanvas.soLuongKhoa, var_int_arr_if[6])) {
            this.cfr_renamed_2 = var_int_arr_if[7];
        }
        if (dZ.boolean_if(this.var_int_if * this.cfr_renamed_2, GameCanvas.var_int_case - GameCanvas.this)) {
            this.var_int_if = (GameCanvas.var_int_case - GameCanvas.this) / this.cfr_renamed_2;
        }
    }

    static {
        dZ.cfr_renamed_2();
    }

        private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

    public final void cfr_renamed_7() {
        this.var_en_do.cfr_renamed_7();
    }

    public final void void_do(en en2) {
        super.cfr_renamed_4();
        this.var_en_do = en2;
        this.cfr_renamed_18 = var_int_arr_if[0];
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                GameCanvas.var_cg_0_do.coTrangThai = var_int_arr_if[0];
                this.var_en_do.cfr_renamed_4();
                return;
            }
            case 1: {
                GameCanvas.var_cg_0_do.coTrangThai = var_int_arr_if[0];
                this.var_en_do.cfr_renamed_4();
                fn.fn_do().cfr_renamed_3(go_0.var_byte_for, this.cfr_renamed_18);
            }
        }
    }

                private static void cfr_renamed_2() {
        var_int_arr_if = new int[10];
        dZ.var_int_arr_if[0] = (0x92 ^ 0x8D) & ~(0x88 ^ 0x97);
        dZ.var_int_arr_if[1] = 106 + 106 - 108 + 27 ^ 1 + 110 - 13 + 36;
        dZ.var_int_arr_if[2] = 0x9C ^ 0x9B;
        dZ.var_int_arr_if[3] = " ".length();
        dZ.var_int_arr_if[4] = 0xB7 ^ 0xA3;
        dZ.var_int_arr_if[5] = 0x16 ^ 8;
        dZ.var_int_arr_if[6] = 64 + 14 - -86 + 12;
        dZ.var_int_arr_if[7] = 0x66 ^ 0x69;
        dZ.var_int_arr_if[8] = 0x84 ^ 0x8E;
        dZ.var_int_arr_if[9] = "  ".length();
    }
}

