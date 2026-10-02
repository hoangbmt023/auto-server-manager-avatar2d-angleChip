/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bn
 */
final class bn_0
implements de {
    private final ey_0[] var_ey_0_arr_do;
    private static int[] mangSoNguyen;

    public final void void_do() {
        go_0.go_0_do();
        if ((go_0.cfr_renamed_1(this.var_ey_0_arr_do))) {
            ft_0.ft_0_do().cfr_renamed_0(this.var_ey_0_arr_do[0].java_lang_String_do(), this.var_ey_0_arr_do[1].java_lang_String_do());
            GameCanvas.cfr_renamed_8();
            el.cfr_renamed_1();
            GameCanvas.var_ez_do = null;
        }
    }

        static {
        bn_0.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        0 = (0xD ^ 3) & ~(0x45 ^ 0x4B);
        1 = " ".length();
    }

    bn_0(ey_0[] ey_0Array) {
        this.var_ey_0_arr_do = ey_0Array;
    }
}

