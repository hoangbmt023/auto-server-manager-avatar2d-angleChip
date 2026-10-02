/*
 * Decompiled with CFR 0.152.
 */
public final class fc
extends hs {
    private static int[] mangSoNguyen;
    public static fs var_fs_do;
    public static short var_short_do;
    public static byte var_byte_do;

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[15];
        0 = (0xD0 ^ 0xC7) & ~(0x69 ^ 0x7E);
        -1 = -" ".length();
        1 = " ".length();
        3 = "   ".length();
        24 = 0x88 ^ 0x90;
        5 = 52 + 32 - 37 + 86 ^ 54 + 116 - 51 + 9;
        6 = 0x92 ^ 0x94;
        2 = "  ".length();
        48 = 0x25 ^ 0x15;
        30 = 0x4C ^ 0x52;
        288 = -(0xFFFFFFFE & 0x3E57) & (0xFFFFBF7F & 0x7FF5);
        126 = 0xF0 ^ 0x8E;
        36 = 5 ^ 0x21;
        200 = (0x76 ^ 0x68) + (0x5A ^ 0x4E) - (0xCB ^ 0xC2) + (103 + 73 - 87 + 70);
        18 = 0x2A ^ 0x38;
    }

    public fc(int n, byte by2) {
        super(n, by2);
        var_byte_do = (byte)(var_byte_do + 1);
    }

    public fc() {
    }

        public final void cfr_renamed_5() {
        if ((var_short_do == -1)) {
            this.cfr_renamed_4 = 0;
            return;
        }
        if (!(this.coKichHoat) || (this.cfr_renamed_4)) {
            return;
        }
        this.cfr_renamed_4 = 1;
    }

    static {
        fc.cfr_renamed_8();
        var_byte_do = (byte)0;
        var_short_do = (short)-1;
    }

    public final void cfr_renamed_0() {
        this.var_fs_for = new fs();
        this.cfr_renamed_3();
    }

    public final void cfr_renamed_3() {
        if ((this.cfr_renamed_4)) {
            this.var_int_case = 2;
            this.var_fs_for = var_fs_do;
            return;
        }
        this.var_fs_for = new fs(288 + (hg.int_new(126) << 2), 24 + (hg.int_new(36) << 2));
    }

    public final void cfr_renamed_6() {
        this.void_do((dR.var_int_char + 3) * 24 + (hg.int_new((fh.var_short_if - dR.var_int_byte - dR.var_int_char - 5) * 6) << 2), 48 + (hg.int_new(30) << 2));
    }

                public final void cfr_renamed_2() {
        if (!(this.cfr_renamed_4) && (hg.int_do() == 0)) {
            this.cfr_renamed_18 = 200;
        }
        if ((this.cfr_renamed_4) && fc.cfr_renamed_3(hg.cfr_renamed_1(fc.var_fs_do.soLuong, fc.var_fs_do.var_int_if, ((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3), 18)) {
            this.cfr_renamed_4 = 0;
            this.coKichHoat = 0;
            this.cfr_renamed_18 = 200;
            dR.dR_do();
            dR.cfr_renamed_1(var_short_do, ((dd_0)this).cfr_renamed_9);
            }
        super.cfr_renamed_2();
    }
}

