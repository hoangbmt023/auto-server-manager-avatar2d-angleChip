/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

final class dv
implements cp {
    private final int soLuong;
    private final int cfr_renamed_1;
    private final int cfr_renamed_3;
    private final ef duLieuNguoiChoi;

    dv(ef ef2, int n, int n2, int n3) {
        this.duLieuNguoiChoi = ef2;
        this.cfr_renamed_1 = n;
        this.soLuong = n2;
        this.cfr_renamed_3 = n3;
    }

        public final void void_do() {
        q_0 q_02 = ci_0.q_0_do(this.duLieuNguoiChoi.var_short_do);
        if (dv.cfr_renamed_0(this.cfr_renamed_1, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12) && (!dv.cfr_renamed_0(ci_0.boolean_do((int)q_02.var_byte_if) ? 1 : 0) || (this.soLuong != 0))) {
            GameCanvas.hienThongBaoPopup(MenuChinhAvatar.var_java_lang_String_arr_catch[this.soLuong], new ap_0(this.soLuong, this.cfr_renamed_3, this.duLieuNguoiChoi));
        }
    }

    }

