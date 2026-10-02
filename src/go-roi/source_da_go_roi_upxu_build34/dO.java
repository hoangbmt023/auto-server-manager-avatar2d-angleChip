/*
 * Decompiled with CFR 0.152.
 */
final class dO
implements cp {
    private dr_0 var_dr_0_do;
    private final byte var_byte_do;
    private static int[] mangSoNguyen;

    public final void void_do() {
        int n = dr_0.var_dr_0_do.cfr_renamed_0("" + this.var_byte_do);
        if ((n == -1)) {
            eq.eq_do().cfr_renamed_3(this.var_byte_do);
            if (" ".length() <= 0) {
                return;
            }
        } else {
            dr_0.var_dr_0_do.cfr_renamed_0((byte[])dr_0.cfr_renamed_0(this.var_dr_0_do).elementAt(n));
        }
        this.var_dr_0_do.soLuong = 1;
    }

    dO(dr_0 dr_02, byte by2) {
        this.var_dr_0_do = dr_02;
        this.var_byte_do = by2;
    }

    static {
        dO.cfr_renamed_1();
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        -1 = -" ".length();
        1 = " ".length();
    }
}

