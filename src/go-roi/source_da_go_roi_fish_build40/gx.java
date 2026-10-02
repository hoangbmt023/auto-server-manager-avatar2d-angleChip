/*
 * Decompiled with CFR 0.152.
 */
final class gx
implements de {
    private static int[] mangSoNguyen;
    private ThongTinNhanVat instance;

    static {
        gx.cfr_renamed_0();
    }

    public final void void_do() {
        ThongTinNhanVat.coTrangThai = 0;
        this.instance.var_fl_0_try = new fl_0("Đóng", new ds_0(this.instance));
        ((dF)this.instance).cfr_renamed_3 = this.instance.var_fl_0_if;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0xC9 ^ 0x9E) & ~(0xDB ^ 0x8C);
    }

    gx(ThongTinNhanVat fk_02) {
        this.instance = fk_02;
    }
}

