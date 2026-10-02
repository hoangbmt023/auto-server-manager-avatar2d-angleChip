/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dl
 */
final class dl_0
implements de {
    private final hs var_hs_do;
    private static int[] mangSoNguyen;
    private dR var_dR_do;

    static {
        dl_0.cfr_renamed_0();
    }

        /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = 0;
        var2_2 = 0;
        if (-"   ".length() < 0) ** GOTO lbl17
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (ee_0)dR.var_java_util_Vector_try.elementAt(var2_2);
            var4_4 = dR.dg_0_do(var3_3.var_short_if);
            if ((var3_3.var_short_if == 120)) {
                dR.cfr_renamed_1(this.var_dR_do, var4_4, var3_3.var_short_if, this.var_hs_do);
                var1_1 = 1;
                if (null == null) break;
                return;
            }
            ++var2_2;
lbl17:
            // 2 sources

            ** while (!dl_0.cfr_renamed_1((int)var2_2, (int)dR.var_java_util_Vector_try.size()))
        }
lbl18:
        // 2 sources

        if ((var1_1 == 0)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.ao);
            dR.dR_do().void_do(8, -1);
        }
    }

    dl_0(dR dR2, hs hs2) {
        this.var_dR_do = dR2;
        this.var_hs_do = hs2;
    }

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[5];
        0 = (27 + 4 - -140 + 3 ^ 57 + 137 - 157 + 111) & (5 ^ 0x66 ^ (0x5E ^ 7) ^ -" ".length());
        120 = 0xC6 ^ 0xBE;
        1 = " ".length();
        8 = 166 + 4 - 4 + 39 ^ 194 + 150 - 202 + 55;
        -1 = -" ".length();
    }
}

