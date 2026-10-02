/*
 * Decompiled with CFR 0.152.
 */
public final class gC
extends eh_0 {
    public static eq_0 var_eq_0_do;
    private static int[] mangSoNguyen;
    public static int soLuong;

    private static void cfr_renamed_12() {
        mangSoNguyen = new int[9];
        0 = (0x3F ^ 0x77 ^ (0xDB ^ 0xB2)) & (0x54 ^ 0x7E ^ (0x8C ^ 0x87) ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        24 = 0x94 ^ 0x9E ^ (0x30 ^ 0x22);
        72 = 0xCB ^ 0x83;
        2 = "  ".length();
        5 = 0x4A ^ 0 ^ (0x8D ^ 0xC2);
        6 = 0x34 ^ 0x32;
        48 = 0xDA ^ 0x85 ^ (0x4B ^ 0x24);
    }

    public final void (eq_0 eq_02 == 0) {
        this.var_eq_0_for = new eq_0(eq_02.var_int_if - 48 + gC.int_do(), eq_02.soLuong - 48 + (gc_0.int_do(24) << 2));
    }

        public final void cfr_renamed_1() {
        super.cfr_renamed_1();
    }

    static {
        gC.cfr_renamed_12();
        soLuong = 0;
    }

    public gC(int n, byte by2) {
        super(n, by2);
        this.cfr_renamed_10 = 0;
        this.var_byte_do = (byte)0;
        soLuong += 1;
    }

    public final void cfr_renamed_2() {
        this.var_eq_0_for = new eq_0();
        if ((this.cfr_renamed_10 == this.cfr_renamed_12)) {
            ((bk_0)this).cfr_renamed_11 = this.var_eq_0_for.var_int_if = (bF.var_int_case + 3) * 24 + gC.int_do();
            ((aG)this).cfr_renamed_3 = this.var_eq_0_for.var_int_if;
            this.var_int_new = this.var_eq_0_for.soLuong = 72 + (gc_0.int_do(24) << 2);
            this.var_int_if = this.var_eq_0_for.soLuong;
            return;
        }
        this.cfr_renamed_3();
        if (gC.cfr_renamed_0(ef_0.boolean_if(((aG)this).cfr_renamed_3, this.var_int_if) ? 1 : 0)) {
            this.var_eq_0_for = new eq_0((bF.var_int_case + 3) * 24 + gC.int_do(), 72 + (gc_0.int_do(24) << 2));
        }
        ((aG)this).cfr_renamed_3 = ((bk_0)this).cfr_renamed_11 = this.var_eq_0_for.var_int_if;
        this.var_int_if = this.var_int_new = this.var_eq_0_for.soLuong;
    }

        private static int int_do() {
        return gc_0.int_do((ef_0.var_short_if - bF.var_int_if - bF.var_int_case - 5) * 6) << 2;
    }
}

