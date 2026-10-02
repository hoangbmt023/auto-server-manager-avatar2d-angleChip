/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aP
 */
final class ap_0
implements cp {
    private final int soLuong;
    private final int cfr_renamed_1;
    private final ef duLieuNguoiChoi;
    private static int[] mangSoNguyen;

        static {
        ap_0.cfr_renamed_1();
    }

    public final void void_do() {
        if ((this.soLuong == 2)) {
            eq.eq_do().cfr_renamed_0(1, this.cfr_renamed_1, this.duLieuNguoiChoi.var_short_do);
            if (" ".length() <= -" ".length()) {
                return;
            }
        } else if ((this.soLuong == 3)) {
            eq.eq_do().cfr_renamed_0(0, this.cfr_renamed_1, this.duLieuNguoiChoi.var_short_do);
            if ((0x1C ^ 0x18) != (0x50 ^ 0x54)) {
                return;
            }
        } else {
            eq.eq_do().cfr_renamed_0(this.duLieuNguoiChoi.var_short_do, (byte)this.soLuong);
        }
        GameCanvas.cfr_renamed_5();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        2 = "  ".length();
        1 = " ".length();
        3 = "   ".length();
        0 = (0x65 ^ 0x3E) & ~(0xD9 ^ 0x82);
    }

    ap_0(int n, int n2, ef ef2) {
        this.soLuong = n;
        this.cfr_renamed_1 = n2;
        this.duLieuNguoiChoi = ef2;
    }
}

