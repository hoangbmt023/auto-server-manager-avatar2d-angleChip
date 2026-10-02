/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gu
 */
final class gu_0
implements cp {
    private static int[] mangSoNguyen;
    private final dv_0 var_dv_0_do;

    /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = 0;
        if ("   ".length() != 0) ** GOTO lbl36
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = "";
            if ((this.var_dv_0_do.var_short_arr_do[var1_1] < 100)) {
                var3_3 = bF.gd_if(this.var_dv_0_do.var_short_arr_do[var1_1]);
                if ((this.var_dv_0_do.var_short_arr_do[var1_1] < 50)) {
                    var2_2 = ak_0.dY_do((int)this.var_dv_0_do.var_short_arr_do[var1_1]).chuoiGiaTri;
                    if ("  ".length() == 0) {
                        return;
                    }
                } else if (gu_0.cfr_renamed_3(ak_0.fc_0_do((int)this.var_dv_0_do.var_short_arr_do[var1_1]).var_byte_if, 1)) {
                    var2_2 = String.valueOf(MenuChinhAvatar.bU) + " " + ak_0.fc_0_do((int)this.var_dv_0_do.var_short_arr_do[var1_1]).tenNhanVat;
                    if ((21 ^ 17) <= 0) {
                        return;
                    }
                } else if (gu_0.cfr_renamed_3(ak_0.fc_0_do((int)this.var_dv_0_do.var_short_arr_do[var1_1]).var_byte_if, 2)) {
                    var2_2 = String.valueOf(MenuChinhAvatar.bn) + " " + ak_0.fc_0_do((int)this.var_dv_0_do.var_short_arr_do[var1_1]).tenNhanVat;
                    if ("   ".length() < ((52 ^ 101) & ~(96 ^ 49))) {
                        return;
                    }
                }
            } else {
                var3_3 = bF.gd_do(this.var_dv_0_do.var_short_arr_do[var1_1]);
                var2_2 = bF.ff_do((int)this.var_dv_0_do.var_short_arr_do[var1_1]).chuoiGiaTri;
            }
            if (!(var3_3 != null) || (var3_3.soLuong < this.var_dv_0_do.var_short_arr_if[var1_1])) {
                GameCanvas.cfr_renamed_1(String.valueOf(MenuChinhAvatar.v) + var2_2);
                return;
            }
            ++var1_1;
lbl36:
            // 2 sources

            ** while (!gu_0.cfr_renamed_1((int)var1_1, (int)this.var_dv_0_do.var_short_arr_do.length))
        }
lbl37:
        // 1 sources

        dh_0.dh_0_do().cfr_renamed_4(this.var_dv_0_do.cfr_renamed_3);
        em_0.em_0_do().cfr_renamed_2();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[5];
        0 = (0xE ^ 0x4B ^ (0xE2 ^ 0xBC)) & (86 + 48 - 65 + 79 ^ 76 + 128 - 132 + 71 ^ -" ".length());
        100 = 1 ^ 0x65;
        50 = 0x99 ^ 0xAB;
        1 = " ".length();
        2 = "  ".length();
    }

            static {
        gu_0.cfr_renamed_1();
    }

            gu_0(dv_0 dv_02) {
        this.var_dv_0_do = dv_02;
    }
}

