/*
 * Decompiled with CFR 0.152.
 */
final class hp
implements de {
    private final ex var_ex_do;
    private static int[] mangSoNguyen;

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[5];
        0 = (0x5E ^ 0x6F) & ~(0xBC ^ 0x8D);
        100 = 0x1B ^ 0x7F;
        50 = 0x9F ^ 0xB7 ^ (0x78 ^ 0x62);
        1 = " ".length();
        2 = "  ".length();
    }

        hp(ex ex2) {
        this.var_ex_do = ex2;
    }

        /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = 0;
        if (" ".length() > 0) ** GOTO lbl36
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = "";
            if ((this.var_ex_do.var_short_arr_if[var1_1] < 100)) {
                var3_3 = dR.ee_0_if(this.var_ex_do.var_short_arr_if[var1_1]);
                if ((this.var_ex_do.var_short_arr_if[var1_1] < 50)) {
                    var2_2 = bz.fb_0_if((int)this.var_ex_do.var_short_arr_if[var1_1]).tenNhanVat;
                    if (((165 ^ 142) & ~(79 ^ 100)) != 0) {
                        return;
                    }
                } else if (hp.cfr_renamed_0(bz.gk_0_do((int)this.var_ex_do.var_short_arr_if[var1_1]).var_byte_if, 1)) {
                    var2_2 = String.valueOf(MenuChinhAvatar.cfr_renamed_11) + " " + bz.gk_0_do((int)this.var_ex_do.var_short_arr_if[var1_1]).tenNhanVat;
                    if (-" ".length() >= 0) {
                        return;
                    }
                } else if (hp.cfr_renamed_0(bz.gk_0_do((int)this.var_ex_do.var_short_arr_if[var1_1]).var_byte_if, 2)) {
                    var2_2 = String.valueOf(MenuChinhAvatar.ac) + " " + bz.gk_0_do((int)this.var_ex_do.var_short_arr_if[var1_1]).tenNhanVat;
                    if (-" ".length() > 0) {
                        return;
                    }
                }
            } else {
                var3_3 = dR.ee_0_do(this.var_ex_do.var_short_arr_if[var1_1]);
                var2_2 = dR.dg_0_do((int)this.var_ex_do.var_short_arr_if[var1_1]).chuoiGiaTri;
            }
            if (!(var3_3 != null) || (var3_3.soLuong < this.var_ex_do.var_short_arr_do[var1_1])) {
                GameCanvas.cfr_renamed_1(String.valueOf(MenuChinhAvatar.cH) + var2_2);
                return;
            }
            ++var1_1;
lbl36:
            // 2 sources

            ** while (!hp.cfr_renamed_1((int)var1_1, (int)this.var_ex_do.var_short_arr_if.length))
        }
lbl37:
        // 1 sources

        et_0.et_0_do().cfr_renamed_2(this.var_ex_do.cfr_renamed_2);
        fo.fo_do().void_if();
    }

    static {
        hp.cfr_renamed_0();
    }
}

