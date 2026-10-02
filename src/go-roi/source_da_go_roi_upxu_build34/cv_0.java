/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cv
 */
final class cv_0
implements cp {
    private static int[] mangSoNguyen;
    private final ha nhiemVuHienTai;
    private bF var_bF_do;

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[5];
        0 = (0x6F ^ 0x23) & ~(0x1C ^ 0x50);
        121 = 0xA6 ^ 0xBF ^ (0x20 ^ 0x40);
        1 = " ".length();
        8 = 47 + 0 - 36 + 121 ^ 19 + 8 - -46 + 67;
        -1 = -" ".length();
    }

        static {
        cv_0.cfr_renamed_1();
    }

        /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = 0;
        var2_3 = 0;
        if (-"  ".length() <= 0) ** GOTO lbl17
        return;
lbl-1000:
        // 1 sources

        {
            var3_4 = (gd)bF.var_java_util_Vector_do.elementAt(var2_3);
            if ((var3_4.var_short_do == 121)) {
                var1_2 = bF.ff_do(var3_4.var_short_do);
                bF.cfr_renamed_0(this.var_bF_do, var1_2, var3_4.var_short_do, this.nhiemVuHienTai);
                var1_1 = 1;
                if ("   ".length() > -" ".length()) break;
                return;
            }
            ++var2_3;
lbl17:
            // 2 sources

            ** while (!cv_0.cfr_renamed_1((int)var2_3, (int)bF.var_java_util_Vector_do.size()))
        }
lbl18:
        // 2 sources

        if ((var1_1 == 0)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.ce);
            bF.bF_do().void_do(8, -1);
        }
    }

    cv_0(bF bF2, ha ha2) {
        this.var_bF_do = bF2;
        this.nhiemVuHienTai = ha2;
    }
}

