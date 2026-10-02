/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fC
 */
final class fc_0
implements de {
    private final hs var_hs_do;
    private static int[] mangSoNguyen;
    private dR var_dR_do;
    private final dg_0 var_dg_0_do;
    private final short var_short_do;

    fc_0(dR dR2, dg_0 dg_02, short s2, hs hs2) {
        this.var_dR_do = dR2;
        this.var_dg_0_do = dg_02;
        this.var_short_do = s2;
        this.var_hs_do = hs2;
    }

        static {
        fc_0.cfr_renamed_0();
    }

    public final void void_do() {
        if ((this.var_dg_0_do.var_byte_if == 4)) {
            dR.cfr_renamed_1(this.var_dR_do, 4, (int)this.var_short_do);
            fh.var_bm_do = this.var_hs_do;
            this.var_dR_do.var_hs_do = (hs)fh.var_bm_do;
            this.var_dR_do.var_hs_do.cfr_renamed_3 = 1;
            this.var_dR_do.var_hs_do.cfr_renamed_20 = GameCanvas.int_do();
        }
        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, ((dd_0)this.var_hs_do).cfr_renamed_9, (int)this.var_short_do);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        4 = 0x45 ^ 0x41;
        1 = " ".length();
    }
}

