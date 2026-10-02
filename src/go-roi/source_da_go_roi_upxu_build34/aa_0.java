/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aA
 */
final class aa_0
implements cp {
    private final gx[] var_gx_arr_do;
    private static int[] mangSoNguyen;

    aa_0(gx[] gxArray) {
        this.var_gx_arr_do = gxArray;
    }

    static {
        aa_0.cfr_renamed_1();
    }

    public final void void_do() {
        fe_0.fe_0_do();
        if ((fe_0.cfr_renamed_0(this.var_gx_arr_do))) {
            eq.eq_do().cfr_renamed_1(this.var_gx_arr_do[0].java_lang_String_do(), this.var_gx_arr_do[1].java_lang_String_do());
            GameCanvas.cfr_renamed_5();
            dj_0.cfr_renamed_0();
            GameCanvas.var_dX_do = null;
        }
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        0 = (0x97 ^ 0xA0 ^ (0x7B ^ 2)) & (132 + 116 - 150 + 143 ^ 108 + 5 - 61 + 139 ^ -" ".length());
        1 = " ".length();
    }
}

