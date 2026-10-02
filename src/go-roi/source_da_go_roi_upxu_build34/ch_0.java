/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cH
 */
final class ch_0
implements cp {
    private static int[] mangSoNguyen;
    private final gx[] var_gx_arr_do;

    ch_0(gx[] gxArray) {
        this.var_gx_arr_do = gxArray;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        0 = (0x42 ^ 0x48) & ~(0x78 ^ 0x72);
        1 = " ".length();
    }

        public final void void_do() {
        if ((fe_0.cfr_renamed_0(this.var_gx_arr_do))) {
            eq.eq_do().cfr_renamed_0(this.var_gx_arr_do[0].java_lang_String_do(), this.var_gx_arr_do[1].java_lang_String_do());
            GameCanvas.cfr_renamed_5();
            dj_0.cfr_renamed_0();
            GameCanvas.var_dX_do = null;
        }
    }

    static {
        ch_0.cfr_renamed_1();
    }
}

