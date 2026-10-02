/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from bk
 */
final class bk_0
implements de {
    private final int soLuong;
    private final cg var_cg_do;
    private final int cfr_renamed_0;
    private final int cfr_renamed_2;

    public final void void_do() {
        am am2 = aa_0.am_do(this.var_cg_do.var_short_do);
        if (bk_0.cfr_renamed_1(this.soLuong, ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9) && (!bk_0.cfr_renamed_1(aa_0.boolean_do((int)am2.var_byte_if) ? 1 : 0) || (this.cfr_renamed_0 != 0))) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_if[this.cfr_renamed_0], new bF(this.cfr_renamed_0, this.cfr_renamed_2, this.var_cg_do));
        }
    }

            bk_0(cg cg2, int n, int n2, int n3) {
        this.var_cg_do = cg2;
        this.soLuong = n;
        this.cfr_renamed_0 = n2;
        this.cfr_renamed_2 = n3;
    }
}

