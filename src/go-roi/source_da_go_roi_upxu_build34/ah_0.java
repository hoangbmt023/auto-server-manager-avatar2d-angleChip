/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from aH
 */
final class ah_0
implements cp {
    private final int soLuong;
    final fe var_fe_do;
    private final String chuoiGiaTri;
    private static int[] mangSoNguyen;

    static {
        ah_0.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        -1 = -" ".length();
        24 = 0x62 ^ 0x54 ^ (0x71 ^ 0x5F);
        1 = " ".length();
    }

    ah_0(fe fe2, int n, String string) {
        this.var_fe_do = fe2;
        this.soLuong = n;
        this.chuoiGiaTri = string;
    }

        public final void void_do() {
        fe.void_do(this.var_fe_do);
        if ((fe.int_int(this.var_fe_do) != -1)) {
            fe.cfr_renamed_3(this.var_fe_do, fe.int_int(this.var_fe_do));
            fe.cfr_renamed_4(this.var_fe_do, fe.int_for(this.var_fe_do));
            ((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = fe.int_int(this.var_fe_do) * 24;
            AngelChip.duLieuNguoiChoi.var_int_if = fe.int_for(this.var_fe_do) * 24;
            ek_0.ek_0_do().void_do(((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3 * bn_0.cfr_renamed_6, AngelChip.duLieuNguoiChoi.var_int_if * bn_0.cfr_renamed_6);
        }
        fe.dangChayAuto = 1;
        fe.coTrangThai = 1;
        fe.cfr_renamed_1(this.var_fe_do, this.soLuong);
        this.var_fe_do.var_ei_new = new ei(MenuChinhAvatar.bW, new ae_0(this, this.soLuong, this.chuoiGiaTri));
        ((bn_0)this.var_fe_do).cfr_renamed_4 = null;
        this.var_fe_do.var_ei_try = null;
    }
}

