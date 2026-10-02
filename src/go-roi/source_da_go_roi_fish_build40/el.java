/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class el
extends ez {
    private static int[] mangSoNguyen;
    private String[][] var_java_lang_String_arr_arr_do;
    private int soLuong;
    private int cfr_renamed_0;
    public static el var_el_do;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private ey_0[] var_ey_0_arr_do;
    private String chuoiGiaTri;
    private int cfr_renamed_4;
    private int cfr_renamed_5 = 200 + GameCanvas.cfr_renamed_12 * 88;

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_0() {
        var1_1 = 0;
        if (((138 + 23 - 80 + 59 ^ 90 + 67 - 48 + 40) & (160 + 14 - 26 + 69 ^ 130 + 99 - 108 + 71 ^ -" ".length())) == 0) ** GOTO lbl8
        return;
lbl-1000:
        // 1 sources

        {
            this.var_ey_0_arr_do[var1_1].cfr_renamed_0(0);
            ++var1_1;
lbl8:
            // 2 sources

            ** while (!el.boolean_do((int)var1_1, (int)this.var_ey_0_arr_do.length))
        }
lbl9:
        // 1 sources

        this.var_ey_0_arr_do[this.soLuong].cfr_renamed_0(1);
        this.var_fl_0_new = this.var_ey_0_arr_do[this.soLuong].fl_0_do();
    }

        private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

        private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

    public static el cfr_renamed_1() {
        if ((var_el_do == null)) {
            var_el_do = new el();
            return var_el_do;
        }
        return var_el_do;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_6() {
        int n = 0;
        while (!el.boolean_do(n, this.var_ey_0_arr_do.length)) {
            this.var_ey_0_arr_do[n].cfr_renamed_2();
            ++n;
        }
        n = 0;
        if ((GameCanvas.boolean_do(2) ? 1 : 0 == null)) {
            this.soLuong -= 1;
            if ((this.soLuong < 0)) {
                this.soLuong = this.var_ey_0_arr_do.length - 1;
            }
            n = 1;
            if ("   ".length() == 0) {
                return;
            }
        } else if ((GameCanvas.boolean_do(8) ? 1 : 0 == null)) {
            this.soLuong += 1;
            if (el.boolean_if(this.soLuong, this.var_ey_0_arr_do.length - 1)) {
                this.soLuong = 0;
            }
            n = 1;
        }
        if ((n == null)) {
            this.cfr_renamed_0();
        }
        super.cfr_renamed_6();
    }

    static {
        el.cfr_renamed_3();
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        GameCanvas.hienThongBaoPopup(var1_1);
        GameCanvas.var_fa_0_do.cfr_renamed_1(var1_1, this.cfr_renamed_4, this.cfr_renamed_2, this.cfr_renamed_3, this.cfr_renamed_5, 0, 0, v_0.v_0_do().var_int_int, this.cfr_renamed_0, v_0.var_byte_do, 1, 1, v_0.v_0_do().mangSoNguyen, v_0.v_0_do().var_int_arr_if, this.chuoiGiaTri);
        var2_2 = 0;
        if (((105 + 88 - 163 + 110 ^ 94 + 66 - 22 + 21) & (151 + 60 - 139 + 114 ^ 12 + 1 - -93 + 63 ^ -" ".length())) == 0) ** GOTO lbl25
        return;
lbl-1000:
        // 1 sources

        {
            var1_1.setClip(this.cfr_renamed_4 + 4 * dF.cfr_renamed_12, this.cfr_renamed_2, this.cfr_renamed_5 - 8 * dF.cfr_renamed_12, this.cfr_renamed_3);
            var3_3 = this.var_ey_0_arr_do[var2_2].var_int_if - GameCanvas.var_fz_0_try.cfr_renamed_1(this.var_java_lang_String_arr_arr_do[var2_2][0]) - 5;
            if (el.boolean_if(var3_3, this.cfr_renamed_4 + 4 * dF.cfr_renamed_12 + 5)) {
                var3_3 = this.cfr_renamed_4 + 4 * dF.cfr_renamed_12 + 5;
            }
            var4_4 = 2;
            if (el.cfr_renamed_1((int)this.var_java_lang_String_arr_arr_do[var2_2][1].equals(""))) {
                var4_4 = 1;
            }
            var5_5 = 0;
            if ("   ".length() > 0) ** GOTO lbl22
            return;
lbl-1000:
            // 1 sources

            {
                GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, this.var_java_lang_String_arr_arr_do[var2_2][var5_5], var3_3, this.var_ey_0_arr_do[var2_2].cfr_renamed_14 + this.var_ey_0_arr_do[var2_2].var_int_new / 2 - dF.var_byte_try * var4_4 / 2 + dF.var_byte_try * var5_5, 0);
                ++var5_5;
lbl22:
                // 2 sources

                ** while (!el.boolean_do((int)var5_5, (int)var4_4))
            }
lbl23:
            // 1 sources

            this.var_ey_0_arr_do[var2_2].cfr_renamed_1(var1_1);
            ++var2_2;
lbl25:
            // 2 sources

            ** while (!el.boolean_do((int)var2_2, (int)this.var_ey_0_arr_do.length))
        }
lbl26:
        // 1 sources

        super.cfr_renamed_1(var1_1);
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                GameCanvas.var_ez_do = null;
                return;
            }
        }
        GameCanvas.var_en_do.void_do(n, n2);
    }

    /*
     * Unable to fully structure code
     */
    public final void (ey_0[] var1_1, String var2_2, String[][] var3_3, fl_0 var4_4 == null) {
        this.var_fl_0_try = new fl_0(MenuChinhAvatar.by, 0);
        this.cfr_renamed_3 = var4_4;
        this.chuoiGiaTri = var2_2;
        this.var_ey_0_arr_do = var1_1;
        this.var_java_lang_String_arr_arr_do = var3_3;
        this.cfr_renamed_3 = en.cfr_renamed_10 + dF.cfr_renamed_15 + dF.var_byte_try + (var1_1[0].var_int_new << 1) * var1_1.length + GameCanvas.cfr_renamed_12 * 12;
        this.cfr_renamed_2 = (GameCanvas.var_int_case - GameCanvas.this - this.cfr_renamed_3) / 2;
        var4_5 = 0;
        if (-" ".length() == -" ".length()) ** GOTO lbl17
        return;
lbl-1000:
        // 1 sources

        {
            var1_1[var4_5].cfr_renamed_9 = this.cfr_renamed_5 - 50 * (GameCanvas.cfr_renamed_12 + 1) - GameCanvas.var_fz_0_try.cfr_renamed_1(var3_3[0][0]);
            var1_1[var4_5].var_int_if = this.cfr_renamed_4 + this.cfr_renamed_5 - var1_1[var4_5].cfr_renamed_9 - 10 * (GameCanvas.cfr_renamed_12 + 1);
            var1_1[var4_5].cfr_renamed_14 = this.cfr_renamed_2 + v_0.var_byte_do + dF.cfr_renamed_15 + dF.var_byte_try + (var1_1[0].var_int_new * var4_5 << 1);
            ++var4_5;
lbl17:
            // 2 sources

            ** while (!el.boolean_do((int)var4_5, (int)var1_1.length))
        }
lbl18:
        // 1 sources

        this.cfr_renamed_0 = GameCanvas.var_fz_0_try.cfr_renamed_1(var2_2) + 20 * dF.cfr_renamed_12;
        if ((this.cfr_renamed_0 < 50 + 20 * dF.cfr_renamed_12)) {
            this.cfr_renamed_0 = 50 + 20 * dF.cfr_renamed_12;
        }
        this.cfr_renamed_0();
    }

            private static void cfr_renamed_3() {
        mangSoNguyen = new int[12];
        200 = 181 + 103 - 273 + 189;
        88 = 0x21 ^ 0x79;
        2 = "  ".length();
        0 = (0x41 ^ 0x6B) & ~(0x95 ^ 0xBF);
        1 = " ".length();
        12 = 0x47 ^ 0x4B;
        50 = 0xDB ^ 0xBA ^ (0x90 ^ 0xC3);
        10 = 0x4E ^ 0x36 ^ (0x29 ^ 0x5B);
        20 = 0x37 ^ 0x23;
        8 = 0x2B ^ 0x23;
        4 = 64 + 114 - 38 + 4 ^ 63 + 85 - 16 + 16;
        5 = 0x8A ^ 0x8F;
    }

    public el() {
        this.cfr_renamed_4 = (GameCanvas.soLuongKhoa - this.cfr_renamed_5) / 2;
    }

    /*
     * Unable to fully structure code
     */
    public final void void_int(int var1_1) {
        var2_2 = 0;
        if (((124 ^ 44) & ~(1 ^ 81)) != " ".length()) ** GOTO lbl12
        return;
lbl-1000:
        // 1 sources

        {
            if (el.cfr_renamed_1((int)this.var_ey_0_arr_do[var2_2].boolean_do())) {
                this.var_ey_0_arr_do[var2_2].boolean_do(var1_1);
                }
            ++var2_2;
lbl12:
            // 2 sources

            ** while (!el.boolean_do((int)var2_2, (int)this.var_ey_0_arr_do.length))
        }
lbl13:
        // 1 sources

        super.void_int(var1_1);
    }
}

