/*
 * Decompiled with CFR 0.152.
 */
final class fv
implements cp {
    private final int soLuong;
    private static int[] mangSoNguyen;
    private final ff var_ff_do;
    private bF var_bF_do;

    fv(bF bF2, ff ff2, int n) {
        this.var_bF_do = bF2;
        this.var_ff_do = ff2;
        this.soLuong = n;
    }

    static {
        fv.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        3 = "   ".length();
    }

    public final void void_do() {
        bF.cfr_renamed_0(this.var_bF_do, 3, (int)this.var_ff_do.var_short_do);
        dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, this.soLuong, this.var_ff_do.var_short_do);
    }
}

