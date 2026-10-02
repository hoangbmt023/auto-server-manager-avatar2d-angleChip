/*
 * Decompiled with CFR 0.152.
 */
final class dW
implements de {
    private final int soLuong;
    private final dg_0 var_dg_0_do;
    private dR var_dR_do;
    private static int[] mangSoNguyen;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        3 = "   ".length();
    }

    dW(dR dR2, dg_0 dg_02, int n) {
        this.var_dR_do = dR2;
        this.var_dg_0_do = dg_02;
        this.soLuong = n;
    }

    static {
        dW.cfr_renamed_0();
    }

    public final void void_do() {
        dR.cfr_renamed_1(this.var_dR_do, 3, (int)this.var_dg_0_do.var_short_do);
        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, this.soLuong, (int)this.var_dg_0_do.var_short_do);
    }
}

