/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from aC
 */
final class ac_0
implements de {
    private static int[] mangSoNguyen;
    private final es var_es_do;
    private dR var_dR_do;

    static {
        ac_0.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0x62 ^ 0x48) & ~(0xA1 ^ 0x8B);
    }

    ac_0(dR dR2, es es2) {
        this.var_dR_do = dR2;
        this.var_es_do = es2;
    }

    public final void void_do() {
        ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_2 = (byte)0;
        dR.var_fs_if.soLuong = ((bm)this.var_es_do).cfr_renamed_2 / fh.var_int_int;
        dR.var_fs_if.var_int_if = ((bm)this.var_es_do).cfr_renamed_3 / fh.var_int_int;
        dR.cfr_renamed_1(this.var_dR_do, this.var_es_do);
    }
}

