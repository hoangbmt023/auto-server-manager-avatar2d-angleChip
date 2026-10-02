/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from dJ
 */
public final class dj_0
extends dX {
    private static int[] mangSoNguyen;
    private int soLuong;
    private String chuoiGiaTri;
    private int cfr_renamed_1 = 200 + GameCanvas.cfr_renamed_16 * 88;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private gx[] var_gx_arr_do;
    public static dj_0 var_dj_0_do;
    private int cfr_renamed_5;
    private String[][] var_java_lang_String_arr_arr_do;
    private int cfr_renamed_2 = (GameCanvas.var_int_byte - this.cfr_renamed_1) / 2;

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do(int var1_1) {
        var2_2 = 0;
        if ("  ".length() == "  ".length()) ** GOTO lbl12
        return;
lbl-1000:
        // 1 sources

        {
            if (dj_0.boolean_do((int)this.var_gx_arr_do[var2_2].boolean_do())) {
                this.var_gx_arr_do[var2_2].boolean_do(var1_1);
                }
            ++var2_2;
lbl12:
            // 2 sources

            ** while (!dj_0.cfr_renamed_3((int)var2_2, (int)this.var_gx_arr_do.length))
        }
lbl13:
        // 1 sources

        super.void_do(var1_1);
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

        private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                GameCanvas.var_dX_do = null;
                return;
            }
        }
        GameCanvas.var_dL_do.void_do(n, n2);
    }

    public static dj_0 cfr_renamed_0() {
        if ((var_dj_0_do == null)) {
            var_dj_0_do = new dj_0();
            return var_dj_0_do;
        }
        return var_dj_0_do;
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[12];
        200 = 197 + 11 - 82 + 74;
        88 = 0x8C ^ 0x96 ^ (0x6D ^ 0x2F);
        2 = "  ".length();
        0 = (0x49 ^ 0x5F) & ~(0x48 ^ 0x5E);
        1 = " ".length();
        12 = 0xA1 ^ 0xAD;
        50 = 0x6F ^ 0x4A ^ (0x89 ^ 0x9E);
        10 = (3 ^ 0x5A) & ~(0x22 ^ 0x7B) ^ (0x18 ^ 0x12);
        20 = 46 + 33 - -16 + 91 ^ 82 + 33 - 55 + 114;
        8 = 94 + 96 - 61 + 9 ^ 27 + 34 - 56 + 125;
        4 = 170 + 106 - 200 + 115 ^ 23 + 160 - 31 + 35;
        5 = 0x95 ^ 0x90;
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        GameCanvas.cfr_renamed_1(var1_1);
        GameCanvas.var_gj_0_do.cfr_renamed_0(var1_1, this.cfr_renamed_2, this.cfr_renamed_3, this.cfr_renamed_4, this.cfr_renamed_1, 0, 0, k.k_do().cfr_renamed_15, this.cfr_renamed_5, k.var_byte_do, 1, 1, k.k_do().var_int_arr_for, k.k_do().var_int_arr_if, this.chuoiGiaTri);
        var2_2 = 0;
        if (null == null) ** GOTO lbl25
        return;
lbl-1000:
        // 1 sources

        {
            var1_1.setClip(this.cfr_renamed_2 + 4 * bn_0.cfr_renamed_6, this.cfr_renamed_3, this.cfr_renamed_1 - 8 * bn_0.cfr_renamed_6, this.cfr_renamed_4);
            var3_3 = this.var_gx_arr_do[var2_2].var_int_new - GameCanvas.var_ew_try.cfr_renamed_0(this.var_java_lang_String_arr_arr_do[var2_2][0]) - 5;
            if (dj_0.boolean_if(var3_3, this.cfr_renamed_2 + 4 * bn_0.cfr_renamed_6 + 5)) {
                var3_3 = this.cfr_renamed_2 + 4 * bn_0.cfr_renamed_6 + 5;
            }
            var4_4 = 2;
            if (dj_0.boolean_do((int)this.var_java_lang_String_arr_arr_do[var2_2][1].equals(""))) {
                var4_4 = 1;
            }
            var5_5 = 0;
            if (((79 ^ 46 ^ (89 ^ 10)) & (38 + 39 - 30 + 81 ^ 151 + 142 - 173 + 58 ^ -" ".length())) <= "  ".length()) ** GOTO lbl22
            return;
lbl-1000:
            // 1 sources

            {
                GameCanvas.var_ew_try.cfr_renamed_0(var1_1, this.var_java_lang_String_arr_arr_do[var2_2][var5_5], var3_3, this.var_gx_arr_do[var2_2].soLuongKhoa + this.var_gx_arr_do[var2_2].var_int_int / 2 - bn_0.var_byte_new * var4_4 / 2 + bn_0.var_byte_new * var5_5, 0);
                ++var5_5;
lbl22:
                // 2 sources

                ** while (!dj_0.cfr_renamed_3((int)var5_5, (int)var4_4))
            }
lbl23:
            // 1 sources

            this.var_gx_arr_do[var2_2].cfr_renamed_0(var1_1);
            ++var2_2;
lbl25:
            // 2 sources

            ** while (!dj_0.cfr_renamed_3((int)var2_2, (int)this.var_gx_arr_do.length))
        }
lbl26:
        // 1 sources

        super.cfr_renamed_0(var1_1);
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_15() {
        int n = 0;
        while (!(n >= this.var_gx_arr_do.length)) {
            this.var_gx_arr_do[n].cfr_renamed_1();
            ++n;
        }
        n = 0;
        if (dj_0.boolean_do(GameCanvas.boolean_do(2) ? 1 : 0)) {
            this.soLuong -= 1;
            if (dj_0.boolean_if(this.soLuong)) {
                this.soLuong = this.var_gx_arr_do.length - 1;
            }
            n = 1;
            if ((67 + 92 - 99 + 80 ^ 82 + 44 - 4 + 14) == -" ".length()) {
                return;
            }
        } else if (dj_0.boolean_do(GameCanvas.boolean_do(8) ? 1 : 0)) {
            this.soLuong += 1;
            if (dj_0.boolean_if(this.soLuong, this.var_gx_arr_do.length - 1)) {
                this.soLuong = 0;
            }
            n = 1;
        }
        if (dj_0.boolean_do(n)) {
            this.cfr_renamed_5();
        }
        super.cfr_renamed_15();
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_5() {
        var1_1 = 0;
        if ((7 ^ 3) != "   ".length()) ** GOTO lbl8
        return;
lbl-1000:
        // 1 sources

        {
            this.var_gx_arr_do[var1_1].cfr_renamed_0(0);
            ++var1_1;
lbl8:
            // 2 sources

            ** while (!dj_0.cfr_renamed_3((int)var1_1, (int)this.var_gx_arr_do.length))
        }
lbl9:
        // 1 sources

        this.var_gx_arr_do[this.soLuong].cfr_renamed_0(1);
        this.var_ei_try = this.var_gx_arr_do[this.soLuong].ei_do();
    }

        static {
        dj_0.cfr_renamed_4();
    }

    /*
     * Unable to fully structure code
     */
    public final void (gx[] var1_1, String var2_2, String[][] var3_3, ei var4_4 == null) {
        this.cfr_renamed_4 = new ei(MenuChinhAvatar.cfr_renamed_7, 0);
        this.var_ei_new = var4_4;
        this.chuoiGiaTri = var2_2;
        this.var_gx_arr_do = var1_1;
        this.var_java_lang_String_arr_arr_do = var3_3;
        this.cfr_renamed_4 = dL.cfr_renamed_19 + bn_0.cfr_renamed_16 + bn_0.var_byte_new + (var1_1[0].var_int_int << 1) * var1_1.length + GameCanvas.cfr_renamed_16 * 12;
        this.cfr_renamed_3 = (GameCanvas.var_int_char - GameCanvas.var_int_else - this.cfr_renamed_4) / 2;
        var4_5 = 0;
        if ("   ".length() < (9 ^ 77 ^ (38 ^ 102))) ** GOTO lbl17
        return;
lbl-1000:
        // 1 sources

        {
            var1_1[var4_5].cfr_renamed_12 = this.cfr_renamed_1 - 50 * (GameCanvas.cfr_renamed_16 + 1) - GameCanvas.var_ew_try.cfr_renamed_0(var3_3[0][0]);
            var1_1[var4_5].var_int_new = this.cfr_renamed_2 + this.cfr_renamed_1 - var1_1[var4_5].cfr_renamed_12 - 10 * (GameCanvas.cfr_renamed_16 + 1);
            var1_1[var4_5].soLuongKhoa = this.cfr_renamed_3 + k.var_byte_do + bn_0.cfr_renamed_16 + bn_0.var_byte_new + (var1_1[0].var_int_int * var4_5 << 1);
            ++var4_5;
lbl17:
            // 2 sources

            ** while (!dj_0.cfr_renamed_3((int)var4_5, (int)var1_1.length))
        }
lbl18:
        // 1 sources

        this.cfr_renamed_5 = GameCanvas.var_ew_try.cfr_renamed_0(var2_2) + 20 * bn_0.cfr_renamed_6;
        if (dj_0.boolean_do(this.cfr_renamed_5, 50 + 20 * bn_0.cfr_renamed_6)) {
            this.cfr_renamed_5 = 50 + 20 * bn_0.cfr_renamed_6;
        }
        this.cfr_renamed_5();
    }
}

