/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from cL
 */
final class cl_0
implements cp {
    private bF var_bF_do;
    private static int[] mangSoNguyen;
    private final dq_0 var_dq_0_do;

    static {
        cl_0.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        0 = (0xF4 ^ 0x81 ^ (0x91 ^ 0xB2)) & (0x67 ^ 0x23 ^ (0xAD ^ 0xBF) ^ -" ".length());
    }

    cl_0(bF bF2, dq_0 dq_02) {
        this.var_bF_do = bF2;
        this.var_dq_0_do = dq_02;
    }

    public final void void_do() {
        ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_4 = (byte)0;
        bF.var_eq_0_if.var_int_if = ((aG)this.var_dq_0_do).cfr_renamed_3 / ef_0.var_int_if;
        bF.var_eq_0_if.soLuong = this.var_dq_0_do.var_int_if / ef_0.var_int_if;
        bF.cfr_renamed_0(this.var_bF_do, this.var_dq_0_do);
    }
}

