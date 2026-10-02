/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gT
 */
public final class gt_0
extends fj {
    public static int soLuong;
    public static fs var_fs_do;
    private static int[] mangSoNguyen;

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[9];
        0 = (0x66 ^ 0x3C) & ~(0xF6 ^ 0xAC);
        1 = " ".length();
        3 = "   ".length();
        24 = 0x2B ^ 0x33;
        72 = 0x18 ^ 0x50;
        2 = "  ".length();
        5 = 0x52 ^ 0x57;
        6 = 0x69 ^ 0x6F;
        48 = 0xDD ^ 0xAE ^ (0x15 ^ 0x56);
    }

        public final void (fs fs2 == 0) {
        this.var_fs_for = new fs(fs2.soLuong - 48 + gt_0.int_do(), fs2.var_int_if - 48 + (hg.int_new(24) << 2));
    }

    static {
        gt_0.cfr_renamed_8();
        soLuong = 0;
    }

    private static int int_do() {
        return hg.int_new((fh.var_short_if - dR.var_int_byte - dR.var_int_char - 5) * 6) << 2;
    }

    public final void cfr_renamed_6() {
        this.var_fs_for = new fs();
        if (gt_0.cfr_renamed_2(this.cfr_renamed_14, ((dd_0)this).cfr_renamed_9)) {
            this.cfr_renamed_8 = this.var_fs_for.soLuong = (dR.var_int_char + 3) * 24 + gt_0.int_do();
            ((bm)this).cfr_renamed_2 = this.var_fs_for.soLuong;
            this.var_int_try = this.var_fs_for.var_int_if = 72 + (hg.int_new(24) << 2);
            ((bm)this).cfr_renamed_3 = this.var_fs_for.var_int_if;
            return;
        }
        this.cfr_renamed_0();
        if (gt_0.cfr_renamed_1(fh.boolean_do(((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3) ? 1 : 0)) {
            this.var_fs_for = new fs((dR.var_int_char + 3) * 24 + gt_0.int_do(), 72 + (hg.int_new(24) << 2));
        }
        ((bm)this).cfr_renamed_2 = this.cfr_renamed_8 = this.var_fs_for.soLuong;
        ((bm)this).cfr_renamed_3 = this.var_int_try = this.var_fs_for.var_int_if;
    }

        public gt_0(int n, byte by2) {
        super(n, by2);
        this.cfr_renamed_14 = 0;
        this.var_byte_do = (byte)0;
        soLuong += 1;
    }

    public final void cfr_renamed_3() {
        super.cfr_renamed_3();
    }
}

