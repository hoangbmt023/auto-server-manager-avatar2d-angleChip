/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gw
 */
final class gw_0
implements de {
    private final hs var_hs_do;
    private dR var_dR_do;
    private static int[] mangSoNguyen;

        gw_0(dR dR2, hs hs2) {
        this.var_dR_do = dR2;
        this.var_hs_do = hs2;
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[6];
        0 = (130 + 142 - 248 + 120 ^ 105 + 82 - 138 + 84) & (1 + 130 - 4 + 14 ^ 109 + 103 - 182 + 122 ^ -" ".length());
        5 = 0xA7 ^ 0x8D ^ (0xA1 ^ 0x8E);
        1 = " ".length();
        10 = 0x45 ^ 0x4F;
        -1 = -" ".length();
        8 = 0xB9 ^ 0xB1;
    }

    static {
        gw_0.cfr_renamed_0();
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = 0;
        var2_2 = bz.gk_0_do((int)this.var_hs_do.cfr_renamed_9);
        var3_3 = 0;
        if (((98 + 66 - 24 + 36 ^ 104 + 57 - 23 + 7) & (254 ^ 190 ^ (192 ^ 161) ^ -" ".length())) >= -" ".length()) ** GOTO lbl23
        return;
lbl-1000:
        // 1 sources

        {
            var4_4 = (ee_0)dR.var_java_util_Vector_try.elementAt(var3_3);
            var5_5 = dR.dg_0_do(var4_4.var_short_if);
            if ((var5_5.var_byte_do == var2_2.var_byte_if) && (var5_5.var_byte_if == 5) && (var4_4.soLuong > 0)) {
                var1_1 = 1;
                this.var_hs_do.coKichHoat = 0;
                dR.dR_do();
                dR.cfr_renamed_1(var5_5.var_short_do, this.var_hs_do.cfr_renamed_9);
                this.var_dR_do.void_if(10, -1);
            }
            ++var3_3;
lbl23:
            // 2 sources

            ** while (!gw_0.cfr_renamed_0((int)var3_3, (int)dR.var_java_util_Vector_try.size()))
        }
lbl24:
        // 1 sources

        if ((var1_1 == 0)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.di);
            this.var_dR_do.void_do(8, -1);
        }
    }

        }

