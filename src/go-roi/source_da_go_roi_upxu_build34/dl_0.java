/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dl
 */
final class dl_0
implements cp {
    private final ha nhiemVuHienTai;
    private static int[] mangSoNguyen;
    private bF var_bF_do;

    /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = 0;
        var2_2 = 0;
        if ("  ".length() > -" ".length()) ** GOTO lbl17
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (gd)bF.var_java_util_Vector_do.elementAt(var2_2);
            var4_4 = bF.ff_do(var3_3.var_short_do);
            if ((var3_3.var_short_do == 120)) {
                bF.cfr_renamed_0(this.var_bF_do, var4_4, var3_3.var_short_do, this.nhiemVuHienTai);
                var1_1 = 1;
                if ((14 ^ 81 ^ (229 ^ 190)) == (104 + 52 - 101 + 74 ^ 129 + 80 - 186 + 110)) break;
                return;
            }
            ++var2_2;
lbl17:
            // 2 sources

            ** while (!dl_0.cfr_renamed_1((int)var2_2, (int)bF.var_java_util_Vector_do.size()))
        }
lbl18:
        // 2 sources

        if ((var1_1 == 0)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.f);
            bF.bF_do().void_do(8, -1);
        }
    }

    dl_0(bF bF2, ha ha2) {
        this.var_bF_do = bF2;
        this.nhiemVuHienTai = ha2;
    }

        static {
        dl_0.cfr_renamed_1();
    }

            private static void cfr_renamed_1() {
        mangSoNguyen = new int[5];
        0 = (0xE4 ^ 0xBE) & ~(0xF ^ 0x55);
        120 = 0x46 ^ 0x7A ^ (0x72 ^ 0x36);
        1 = " ".length();
        8 = 0xCE ^ 0xC6;
        -1 = -" ".length();
    }
}

