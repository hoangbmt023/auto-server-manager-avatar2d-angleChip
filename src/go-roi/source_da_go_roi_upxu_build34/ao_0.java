/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ao
 */
final class ao_0
implements cp {
    private final gd var_gd_do;
    private static int[] mangSoNguyen;
    private final ff var_ff_do;
    private bF var_bF_do;

    static {
        ao_0.cfr_renamed_1();
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        4 = 0xC0 ^ 0xC4;
        1 = " ".length();
    }

    public final void void_do() {
        if ((ef_0.var_aG_do != null)) {
            if ((this.var_ff_do.var_byte_if == 4)) {
                bF.cfr_renamed_0(this.var_bF_do, 4, (int)this.var_gd_do.var_short_do);
                this.var_bF_do.nhiemVuHienTai = (ha)ef_0.var_aG_do;
                this.var_bF_do.nhiemVuHienTai.cfr_renamed_4 = 1;
                this.var_bF_do.nhiemVuHienTai.cfr_renamed_17 = GameCanvas.int_if();
            }
            dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ((bk_0)ef_0.var_aG_do).cfr_renamed_12, this.var_gd_do.var_short_do);
        }
    }

        ao_0(bF bF2, ff ff2, gd gd2) {
        this.var_bF_do = bF2;
        this.var_ff_do = ff2;
        this.var_gd_do = gd2;
    }
}

