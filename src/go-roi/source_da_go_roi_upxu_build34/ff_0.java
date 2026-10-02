/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fF
 */
final class ff_0
implements cp {
    private final String chuoiGiaTri;
    private final fi_0 var_fi_0_do;
    private fe var_fe_do;
    private static int[] mangSoNguyen;

    static {
        ff_0.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        2 = "  ".length();
        24 = 0x8E ^ 0xB2 ^ (0x54 ^ 0x70);
        1 = " ".length();
    }

    public final void void_do() {
        aU aU2 = new aU(2, fe.int_if(this.var_fe_do) * 24, fe.int_do(this.var_fe_do) * 24, 1, this.var_fi_0_do.cfr_renamed_3);
        db_0.db_0_do().cfr_renamed_0(aU2);
        fe.cfr_renamed_0(this.var_fe_do, this.chuoiGiaTri);
    }

    ff_0(fe fe2, fi_0 fi_02, String string) {
        this.var_fe_do = fe2;
        this.var_fi_0_do = fi_02;
        this.chuoiGiaTri = string;
    }
}

