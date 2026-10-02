/*
 * Decompiled with CFR 0.152.
 */
final class bF
implements de {
    private final int soLuong;
    private final cg var_cg_do;
    private final int cfr_renamed_0;
    private static int[] mangSoNguyen;

        public final void void_do() {
        if ((this.cfr_renamed_0 == 2)) {
            ft_0.ft_0_do().cfr_renamed_1(1, this.soLuong, this.var_cg_do.var_short_do);
            if (-" ".length() > "  ".length()) {
                return;
            }
        } else if ((this.cfr_renamed_0 == 3)) {
            ft_0.ft_0_do().cfr_renamed_1(0, this.soLuong, this.var_cg_do.var_short_do);
            if (((0x1F ^ 0x59) & ~(0x6C ^ 0x2A)) < 0) {
                return;
            }
        } else {
            ft_0.ft_0_do().cfr_renamed_1(this.var_cg_do.var_short_do, (byte)this.cfr_renamed_0);
        }
        GameCanvas.cfr_renamed_8();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        2 = "  ".length();
        1 = " ".length();
        3 = "   ".length();
        0 = (0x66 ^ 0x3F ^ (0x6C ^ 0x76)) & (0x57 ^ 0x30 ^ (0x9C ^ 0xB8) ^ -" ".length());
    }

    bF(int n, int n2, cg cg2) {
        this.cfr_renamed_0 = n;
        this.soLuong = n2;
        this.var_cg_do = cg2;
    }

    static {
        bF.cfr_renamed_0();
    }
}

