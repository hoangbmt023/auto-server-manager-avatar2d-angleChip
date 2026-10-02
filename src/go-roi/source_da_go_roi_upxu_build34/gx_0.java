/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gX
 */
final class gx_0
implements cp {
    private final int soLuong;
    private static final int[] mangSoNguyen;

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        -1 = -" ".length();
        1 = " ".length();
        0 = (0x4A ^ 0xD) & ~(0x71 ^ 0x36);
        -2 = -"  ".length();
    }

    public final void void_do() {
        if ((this.soLuong == -1)) {
            int n;
            if (!(gz_0.dangChayAuto)) {
                n = 1;
                if ((0xA9 ^ 0xAD) <= "  ".length()) {
                    return;
                }
            } else {
                n = 0;
            }
            gz_0.dangChayAuto = n;
            return;
        }
        if ((this.soLuong == -2)) {
            gz_0.var_java_util_Hashtable_do.clear();
            return;
        }
        eq.eq_do().cfr_renamed_4(this.soLuong);
    }

    public gx_0(int n) {
        this.soLuong = n;
    }

        static {
        gx_0.cfr_renamed_1();
    }
}

