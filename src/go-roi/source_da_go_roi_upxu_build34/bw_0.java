/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bw
 */
final class bw_0
implements cp {
    private int soLuong;
    private String chuoiGiaTri;
    private q_0 var_q_0_do;
    private int cfr_renamed_1;
    private short var_short_do;
    private int cfr_renamed_3;
    private static final int[] mangSoNguyen;

        static {
        bw_0.cfr_renamed_1();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void void_do() {
        if ((this.cfr_renamed_1 == 100)) {
            gz_0.cfr_renamed_0(this.var_short_do);
            return;
        }
        if ((this.cfr_renamed_1 == 26)) {
            GameCanvas.cfr_renamed_8();
            fe_0.fe_0_do();
            fe_0.void_for(this.var_short_do);
            em_0.em_0_do().cfr_renamed_2();
            return;
        }
        q_0 q_02 = this.var_q_0_do;
        if ((this.var_q_0_do.var_short_do == -1)) {
            q_02 = ci_0.q_0_do(this.var_short_do);
        }
        if ((this.cfr_renamed_3 != -1) && (this.cfr_renamed_1 != 17) && (this.cfr_renamed_1 != 18)) {
            if ((this.cfr_renamed_3 == ak.soLuong)) {
                if ((AutoController.nhiemVuHienTai == 0) && !(AutoController.nhiemVuHienTai instanceof ak == 0)) return;
                gz_0.cfr_renamed_0(this.var_short_do, this.chuoiGiaTri, this.cfr_renamed_3, this.cfr_renamed_1, this.soLuong);
                return;
            }
            GameCanvas.hienThongBaoPopup(this.chuoiGiaTri, new gM(this.cfr_renamed_3, this.cfr_renamed_1, this.soLuong));
            return;
        }
        fe_0.cfr_renamed_1(q_02);
    }

            private static void cfr_renamed_1() {
        mangSoNguyen = new int[5];
        100 = 0x5F ^ 0x3B;
        26 = 0x22 ^ 0x5F ^ (0x3F ^ 0x58);
        -1 = -" ".length();
        17 = 0xA2 ^ 0x8F ^ (0x7A ^ 0x46);
        18 = 0x7B ^ 0x60 ^ (0x10 ^ 0x19);
    }

    public bw_0(q_0 q_02, short s2, int n, String string, int n2, int n3) {
        this.var_q_0_do = q_02;
        this.var_short_do = s2;
        this.cfr_renamed_1 = n;
        this.chuoiGiaTri = string;
        this.cfr_renamed_3 = n2;
        this.soLuong = n3;
    }

    }

