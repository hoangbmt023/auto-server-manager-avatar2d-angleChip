/*
 * Decompiled with CFR 0.152.
 */
final class dO
implements de {
    private dr_0 var_dr_0_do;
    private static int[] mangSoNguyen;

    static {
        dO.cfr_renamed_0();
    }

    dO(dr_0 dr_02) {
        this.var_dr_0_do = dr_02;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0x3B ^ 0x1F) & ~(0x1F ^ 0x3B);
    }

    public final void void_do() {
        this.var_dr_0_do.soLuong = 0;
    }
}

