/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eA
 */
public final class ea_0
extends ha {
    private static int[] mangSoNguyen;
    public static short var_short_do;
    public static byte var_byte_do;
    public static eq_0 var_eq_0_do;

        public final void cfr_renamed_2() {
        this.void_do((bF.var_int_case + 3) * 24 + (gc_0.int_do((ef_0.var_short_if - bF.var_int_if - bF.var_int_case - 5) * 6) << 2), 48 + (gc_0.int_do(30) << 2));
    }

    public final void cfr_renamed_15() {
        if ((var_short_do == -1)) {
            this.coKichHoat = 0;
            return;
        }
        if (!(this.cfr_renamed_5) || (this.coKichHoat)) {
            return;
        }
        this.coKichHoat = 1;
    }

    public final void cfr_renamed_1() {
        if ((this.coKichHoat)) {
            ((bk_0)this).cfr_renamed_18 = 2;
            this.var_eq_0_for = var_eq_0_do;
            return;
        }
        this.var_eq_0_for = new eq_0(288 + (gc_0.int_do(126) << 2), 24 + (gc_0.int_do(36) << 2));
    }

        public final void cfr_renamed_5() {
        if (!(this.coKichHoat) && (gc_0.int_do() == 0)) {
            this.cfr_renamed_30 = 200;
        }
        if ((this.coKichHoat) && ea_0.cfr_renamed_3(gc_0.cfr_renamed_0(ea_0.var_eq_0_do.var_int_if, ea_0.var_eq_0_do.soLuong, ((aG)this).cfr_renamed_3, this.var_int_if), 18)) {
            this.coKichHoat = 0;
            this.cfr_renamed_5 = 0;
            this.cfr_renamed_30 = 200;
            bF.bF_do();
            bF.cfr_renamed_0(var_short_do, this.cfr_renamed_12);
            }
        super.cfr_renamed_5();
    }

        public ea_0(int n, byte by2) {
        super(n, by2);
        var_byte_do = (byte)(var_byte_do + 1);
    }

    static {
        ea_0.cfr_renamed_12();
        var_byte_do = (byte)0;
        var_short_do = (short)-1;
    }

        private static void cfr_renamed_12() {
        mangSoNguyen = new int[15];
        0 = (78 + 15 - 4 + 125 ^ 64 + 77 - 93 + 97) & (0xD3 ^ 0x80 ^ (0xBC ^ 0xA8) ^ -" ".length());
        -1 = -" ".length();
        1 = " ".length();
        3 = "   ".length();
        24 = 0xE1 ^ 0xC5 ^ (0x21 ^ 0x1D);
        5 = 0x1C ^ 4 ^ (0x62 ^ 0x7F);
        6 = 0x23 ^ 0x2C ^ (0xCC ^ 0xC5);
        2 = "  ".length();
        48 = 0x75 ^ 0x45;
        30 = 0x4C ^ 0x52;
        288 = 0xFFFF99B5 & 0x676A;
        126 = 0x4C ^ 0x32;
        36 = 0xBC ^ 0x96 ^ (0x80 ^ 0x8E);
        200 = 115 + 172 - 125 + 38;
        18 = 0xA4 ^ 0xB6;
    }

    public final void cfr_renamed_3() {
        this.var_eq_0_for = new eq_0();
        this.cfr_renamed_1();
    }

    public ea_0() {
    }
}

