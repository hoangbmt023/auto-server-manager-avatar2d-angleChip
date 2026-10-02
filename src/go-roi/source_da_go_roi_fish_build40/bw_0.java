/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from bw
 */
final class bw_0
implements de {
    private final int soLuong;
    final gd_0 var_gd_0_do;
    private final String chuoiGiaTri;
    private static int[] mangSoNguyen;

    bw_0(gd_0 gd_02, int n, String string) {
        this.var_gd_0_do = gd_02;
        this.soLuong = n;
        this.chuoiGiaTri = string;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        -1 = -" ".length();
        24 = 0x4A ^ 0x52;
        1 = " ".length();
    }

    static {
        bw_0.cfr_renamed_0();
    }

    public final void void_do() {
        gd_0.void_int(this.var_gd_0_do);
        if ((gd_0.int_for(this.var_gd_0_do) != -1)) {
            gd_0.cfr_renamed_4(this.var_gd_0_do, gd_0.int_for(this.var_gd_0_do));
            gd_0.cfr_renamed_1(this.var_gd_0_do, gd_0.int_do(this.var_gd_0_do));
            ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_2 = gd_0.int_for(this.var_gd_0_do) * 24;
            ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = gd_0.int_do(this.var_gd_0_do) * 24;
            fm.fm_do().void_do(((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_2 * dF.cfr_renamed_12, ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_3 * dF.cfr_renamed_12);
        }
        gd_0.coTrangThai = 1;
        gd_0.dangChayAuto = 1;
        gd_0.cfr_renamed_0(this.var_gd_0_do, this.soLuong);
        ((dF)this.var_gd_0_do).cfr_renamed_3 = new fl_0(MenuChinhAvatar.bV, new bt_0(this, this.soLuong, this.chuoiGiaTri));
        this.var_gd_0_do.var_fl_0_try = null;
        this.var_gd_0_do.var_fl_0_new = null;
    }

    }

