/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eE
 */
public final class ee_0
extends ha {
    public static byte var_byte_do;
    public static eq_0 var_eq_0_do;
    public static eq_0 cfr_renamed_1;
    public static byte cfr_renamed_12;
    private static int[] mangSoNguyen;
    public static short var_short_do;

    public ee_0(int n, byte by2) {
        super(n, by2);
        cfr_renamed_12 = (byte)(cfr_renamed_12 + 1);
    }

            public final void cfr_renamed_15() {
        if (!(this.cfr_renamed_5) || (this.coKichHoat)) {
            return;
        }
        if ((var_short_do != -1)) {
            this.coKichHoat = 1;
        }
    }

    public final void cfr_renamed_5() {
        super.cfr_renamed_5();
        if ((this.coKichHoat) && ee_0.cfr_renamed_4(gc_0.int_if(ee_0.var_eq_0_do.var_int_if - ((aG)this).cfr_renamed_3), 20) && (gc_0.int_if(ee_0.var_eq_0_do.soLuong - this.var_int_if) < 15)) {
            this.coKichHoat = 0;
            this.cfr_renamed_5 = 0;
            bF.bF_do();
            bF.cfr_renamed_0(var_short_do, ((bk_0)this).cfr_renamed_12);
            }
        this.cfr_renamed_30 = 100 + 50 * (this.cfr_renamed_18 - 50);
    }

        private static void cfr_renamed_12() {
        mangSoNguyen = new int[14];
        0 = (0xD1 ^ 0xC2) & ~(0x7A ^ 0x69);
        5 = 0x94 ^ 0xA4 ^ (0x40 ^ 0x75);
        -1 = -" ".length();
        1 = " ".length();
        48 = 0xA0 ^ 0x90;
        2 = "  ".length();
        6 = 0xB2 ^ 0xB4;
        24 = 0x58 ^ 0x40;
        12 = "   ".length() ^ (0xAA ^ 0xA5);
        18 = 0x36 ^ 0x24;
        20 = 0x9D ^ 0xBA ^ (0x5A ^ 0x69);
        15 = 0x90 ^ 0x9F;
        100 = 0x1D ^ 0x17 ^ (0x17 ^ 0x79);
        50 = 0x6E ^ 0x71 ^ (0x94 ^ 0xB9);
    }

    static {
        ee_0.cfr_renamed_12();
        cfr_renamed_12 = (byte)0;
        var_byte_do = (byte)5;
        var_short_do = (short)-1;
    }

    public final void cfr_renamed_2() {
        this.void_do(bF.var_eq_0_int.var_int_if + 48 + (gc_0.int_do((bF.var_int_case - 2) * 6) << 2), bF.var_eq_0_int.soLuong + 24 + (gc_0.int_do(12) << 2));
    }

    public final void cfr_renamed_3() {
        this.var_eq_0_for = new eq_0();
        if (!(this.coKichHoat)) {
            this.var_eq_0_for = new eq_0(bF.var_eq_0_int.var_int_if + 12 + (gc_0.int_do(bF.var_int_case * 6) << 2), bF.var_eq_0_int.soLuong + 12 + (gc_0.int_do(18) << 2));
            return;
        }
        this.var_eq_0_for = var_eq_0_do;
    }

    public ee_0() {
    }

    }

