/*
 * Decompiled with CFR 0.152.
 */
public final class fg
extends hs {
    public static byte var_byte_do;
    public static byte cfr_renamed_8;
    public static fs var_fs_do;
    private static int[] mangSoNguyen;
    public static short var_short_do;
    public static fs cfr_renamed_0;

        static {
        fg.cfr_renamed_8();
        var_byte_do = (byte)0;
        cfr_renamed_8 = (byte)5;
        var_short_do = (short)-1;
    }

    public final void cfr_renamed_5() {
        if (!(this.coKichHoat) || (this.cfr_renamed_4)) {
            return;
        }
        if ((var_short_do != -1)) {
            this.cfr_renamed_4 = 1;
        }
    }

    public final void cfr_renamed_2() {
        super.cfr_renamed_2();
        if ((this.cfr_renamed_4) && fg.cfr_renamed_3(hg.int_do(fg.cfr_renamed_0.soLuong - ((bm)this).cfr_renamed_2), 20) && fg.cfr_renamed_3(hg.int_do(fg.cfr_renamed_0.var_int_if - ((bm)this).cfr_renamed_3), 15)) {
            this.cfr_renamed_4 = 0;
            this.coKichHoat = 0;
            dR.dR_do();
            dR.cfr_renamed_1(var_short_do, ((dd_0)this).cfr_renamed_9);
            }
        this.cfr_renamed_18 = 100 + 50 * (this.cfr_renamed_9 - 50);
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[14];
        0 = (0x1B ^ 0xE) & ~(0x6D ^ 0x78);
        5 = 0x30 ^ 0x35;
        -1 = -" ".length();
        1 = " ".length();
        48 = 0x19 ^ 0x22 ^ (0x84 ^ 0x8F);
        2 = "  ".length();
        6 = 0x8A ^ 0xA0 ^ (0xEE ^ 0xC2);
        24 = 0x85 ^ 0x81 ^ (0xBF ^ 0xA3);
        12 = 8 + 54 - 10 + 113 ^ 62 + 24 - -1 + 82;
        18 = 18 + 164 - 73 + 56 ^ 174 + 125 - 225 + 109;
        20 = 0x2F ^ 0x3B;
        15 = 103 + 55 - 78 + 69 ^ 18 + 120 - 52 + 68;
        100 = 0x79 ^ 0x51 ^ (0xE9 ^ 0xA5);
        50 = 108 + 12 - 6 + 14 ^ 54 + 91 - 78 + 111;
    }

    public final void cfr_renamed_0() {
        this.var_fs_for = new fs();
        if (!(this.cfr_renamed_4)) {
            this.var_fs_for = new fs(dR.var_fs_for.soLuong + 12 + (hg.int_new(dR.var_int_char * 6) << 2), dR.var_fs_for.var_int_if + 12 + (hg.int_new(18) << 2));
            return;
        }
        this.var_fs_for = cfr_renamed_0;
    }

    public fg() {
    }

        public final void cfr_renamed_6() {
        this.void_do(dR.var_fs_for.soLuong + 48 + (hg.int_new((dR.var_int_char - 2) * 6) << 2), dR.var_fs_for.var_int_if + 24 + (hg.int_new(12) << 2));
    }

            public fg(int n, byte by2) {
        super(n, by2);
        var_byte_do = (byte)(var_byte_do + 1);
    }
}

