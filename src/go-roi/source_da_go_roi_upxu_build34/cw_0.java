/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from cW
 */
final class cw_0
extends ei {
    private static final int[] mangSoNguyen;
    private final int soLuong;
    private final gd var_gd_do;
    private final ff var_ff_do;

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        11 = 0x30 ^ 0x3B;
        2 = "  ".length();
    }

        public final void (Graphics graphics, int n, int n2 > 0) {
        this.var_ff_do.cfr_renamed_0(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2);
    }

    static {
        cw_0.cfr_renamed_3();
    }

        cw_0(String string, int n, ff ff2, int n2, gd gd2) {
        super(string, 11, n);
        this.var_ff_do = ff2;
        this.soLuong = n2;
        this.var_gd_do = gd2;
    }

    public final void cfr_renamed_0() {
        if ((em_0.var_boolean_int) && (this.soLuong == em_0.var_int_if - bF.var_java_util_Vector_for.size())) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0("ID: " + this.var_gd_do.var_short_do);
            em_0.cfr_renamed_0(this.var_ff_do.chuoiGiaTri);
            em_0.cfr_renamed_0(MenuChinhAvatar.bH + this.var_gd_do.soLuong);
            if ((this.var_ff_do.soLuong > 0)) {
                em_0.cfr_renamed_0(MenuChinhAvatar.aj + GameCanvas.java_lang_String_do(this.var_gd_do.soLuong * this.var_ff_do.soLuong) + MenuChinhAvatar.cl);
                if ("   ".length() < 0) {
                    return;
                }
            } else if ((this.var_ff_do.var_int_if > 0)) {
                em_0.cfr_renamed_0(MenuChinhAvatar.aj + GameCanvas.java_lang_String_do(this.var_gd_do.soLuong * this.var_ff_do.var_int_if) + MenuChinhAvatar.cl);
            }
            em_0.cfr_renamed_0(fe_0.java_lang_String_do());
        }
    }

    }

