/*
 * Decompiled with CFR 0.152.
 */
final class cq
implements de {
    private final ee_0 var_ee_0_do;
    private dR var_dR_do;
    private final dg_0 var_dg_0_do;
    private static int[] mangSoNguyen;

    static {
        cq.cfr_renamed_0();
    }

        cq(dR dR2, dg_0 dg_02, ee_0 ee_02) {
        this.var_dR_do = dR2;
        this.var_dg_0_do = dg_02;
        this.var_ee_0_do = ee_02;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        4 = 0x9F ^ 0xAB ^ (0x3E ^ 0xE);
        1 = " ".length();
    }

    public final void void_do() {
        if ((fh.var_bm_do != null)) {
            if ((this.var_dg_0_do.var_byte_if == 4)) {
                dR.cfr_renamed_1(this.var_dR_do, 4, (int)this.var_ee_0_do.var_short_if);
                this.var_dR_do.var_hs_do = (hs)fh.var_bm_do;
                this.var_dR_do.var_hs_do.cfr_renamed_3 = 1;
                this.var_dR_do.var_hs_do.cfr_renamed_20 = GameCanvas.int_do();
            }
            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, ((dd_0)fh.var_bm_do).cfr_renamed_9, (int)this.var_ee_0_do.var_short_if);
        }
    }

    }

