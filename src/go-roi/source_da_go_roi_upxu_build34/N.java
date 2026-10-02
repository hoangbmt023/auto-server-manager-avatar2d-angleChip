/*
 * Decompiled with CFR 0.152.
 */
final class N
implements cp {
    private static final int[] mangSoNguyen;
    private final int soLuong;
    private final String chuoiGiaTri;

        public final void void_do() {
        TienIchGame.cfr_renamed_0("Bạn có chắc muốn bán " + this.chuoiGiaTri + "?", new ei("Bán đã lớn", new ck(this.soLuong, 0)), new ei("Bán hết", new ck(this.soLuong, 1)));
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        -1 = -" ".length();
        -2 = -"  ".length();
        0 = (75 + 91 - 53 + 40 ^ 107 + 19 - 120 + 144) & (0xF6 ^ 0xB6 ^ (0x69 ^ 0x26) ^ -" ".length());
        1 = " ".length();
    }

    static {
        N.cfr_renamed_1();
    }

    public N(int n) {
        String string;
        N n2;
        this.soLuong = n;
        if ((this.soLuong == -1)) {
            n2 = this;
            string = "tất cả vật nuôi xu";
            if (((0x73 ^ 0x19 ^ (0xB6 ^ 0x80)) & (70 + 201 - 70 + 43 ^ 136 + 68 - 81 + 45 ^ -" ".length())) != 0) {
                throw null;
            }
        } else if ((this.soLuong == -2)) {
            n2 = this;
            string = "tất cả vật nuôi lượng";
            if (" ".length() >= "   ".length()) {
                throw null;
            }
        } else {
            fc_0 fc_02 = ak_0.fc_0_do(this.soLuong);
            n2 = this;
            if ((fc_02 != null)) {
                string = fc_02.tenNhanVat;
                if (("   ".length() & ("   ".length() ^ -" ".length())) >= " ".length()) {
                    throw null;
                }
            } else {
                string = null;
            }
        }
        n2.chuoiGiaTri = string;
    }
}

