/*
 * Decompiled with CFR 0.152.
 */
final class Z
implements de {
    private final String chuoiGiaTri;
    private final int soLuong;
    private static final int[] mangSoNguyen;

    static {
        Z.cfr_renamed_0();
    }

    public final void void_do() {
        TienIchGame.cfr_renamed_0("Bạn có chắc muốn bán " + this.chuoiGiaTri + "?", new fl_0("Bán đã lớn", new ck(this.soLuong, 0)), new fl_0("Bán hết", new ck(this.soLuong, 1)));
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        -1 = -" ".length();
        -2 = -"  ".length();
        0 = (0x65 ^ 0x25) & ~(0x76 ^ 0x36);
        1 = " ".length();
    }

    public Z(int n) {
        String string;
        Z z;
        this.soLuong = n;
        if ((this.soLuong == -1)) {
            z = this;
            string = "tất cả vật nuôi xu";
            if (-" ".length() >= 0) {
                throw null;
            }
        } else if ((this.soLuong == -2)) {
            z = this;
            string = "tất cả vật nuôi lượng";
            } else {
            gk_0 gk_02 = bz.gk_0_do(this.soLuong);
            z = this;
            if ((gk_02 != null)) {
                string = gk_02.tenNhanVat;
                if (((66 + 108 - 161 + 200 ^ 52 + 40 - 25 + 73) & (22 + 151 - -39 + 7 ^ 40 + 117 - 123 + 96 ^ -" ".length())) != ((0x74 ^ 0x25 ^ (0x1B ^ 0x52)) & (0x41 ^ 0x62 ^ (0x1F ^ 0x24) ^ -" ".length()))) {
                    throw null;
                }
            } else {
                string = null;
            }
        }
        z.chuoiGiaTri = string;
    }

    }

