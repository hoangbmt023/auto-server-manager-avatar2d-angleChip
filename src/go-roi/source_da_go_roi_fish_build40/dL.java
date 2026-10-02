/*
 * Decompiled with CFR 0.152.
 */
final class dL
implements de {
    private static final int[] mangSoNguyen;
    private int soLuong;
    private short var_short_do;
    private String chuoiGiaTri;
    private int cfr_renamed_0;
    private am var_am_do;
    private int cfr_renamed_2;

        static {
        dL.cfr_renamed_0();
    }

        public dL(am am2, short s2, int n, String string, int n2, int n3) {
        this.var_am_do = am2;
        this.var_short_do = s2;
        this.cfr_renamed_0 = n;
        this.chuoiGiaTri = string;
        this.soLuong = n2;
        this.cfr_renamed_2 = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void void_do() {
        if ((this.cfr_renamed_0 == 100)) {
            gg_0.cfr_renamed_1(this.var_short_do);
            return;
        }
        if ((this.cfr_renamed_0 == 26)) {
            GameCanvas.cfr_renamed_7();
            go_0.go_0_do();
            go_0.void_do(this.var_short_do);
            fo.fo_do().void_if();
            return;
        }
        am am2 = this.var_am_do;
        if ((this.var_am_do.cfr_renamed_3 == -1)) {
            am2 = aa_0.am_do(this.var_short_do);
        }
        if ((this.soLuong != -1) && (this.cfr_renamed_0 != 17) && (this.cfr_renamed_0 != 18)) {
            if ((this.soLuong == cl.soLuong)) {
                if ((AutoController.nhiemVuHienTai != null) && !(AutoController.nhiemVuHienTai instanceof cl != null)) return;
                gg_0.cfr_renamed_1(this.var_short_do, this.chuoiGiaTri, this.soLuong, this.cfr_renamed_0, this.cfr_renamed_2);
                return;
            }
            GameCanvas.cfr_renamed_1(this.chuoiGiaTri, new fg_0(this.soLuong, this.cfr_renamed_0, this.cfr_renamed_2));
            return;
        }
        go_0.cfr_renamed_0(am2);
    }

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[5];
        100 = 0x5B ^ 0x3F;
        26 = 0x5E ^ 0x44;
        -1 = -" ".length();
        17 = 63 + 11 - -28 + 37 ^ 98 + 118 - 157 + 95;
        18 = 0x4C ^ 0x5E;
    }
}

