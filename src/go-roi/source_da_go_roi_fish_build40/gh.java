/*
 * Decompiled with CFR 0.152.
 */
final class gh
implements de {
    private final String chuoiGiaTri;
    private static int[] mangSoNguyen;
    private gd_0 var_gd_0_do;
    private final gs_0 var_gs_0_do;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        2 = "  ".length();
        24 = 9 + 19 - -28 + 85 ^ 109 + 127 - 184 + 97;
        1 = " ".length();
    }

    gh(gd_0 gd_02, gs_0 gs_02, String string) {
        this.var_gd_0_do = gd_02;
        this.var_gs_0_do = gs_02;
        this.chuoiGiaTri = string;
    }

    public final void void_do() {
        bB bB2 = new bB(2, gd_0.int_if(this.var_gd_0_do) * 24, gd_0.int_int(this.var_gd_0_do) * 24, 1, this.var_gs_0_do.cfr_renamed_4);
        ep_0.ep_0_do().cfr_renamed_1(bB2);
        gd_0.cfr_renamed_1(this.var_gd_0_do, this.chuoiGiaTri);
    }

    static {
        gh.cfr_renamed_0();
    }
}

