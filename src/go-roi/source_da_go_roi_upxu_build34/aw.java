/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

final class aw
extends ei {
    private final int soLuong;
    private static int[] mangSoNguyen;
    private final gd var_gd_do;

    aw(String string, cp cp2, gd gd2, int n) {
        super(string, cp2);
        this.var_gd_do = gd2;
        this.soLuong = n;
    }

    public final void cfr_renamed_0() {
        if (!(this.soLuong != em_0.var_int_if) || (em_0.dangChayAuto)) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0(this.var_gd_do.chuoiGiaTri);
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.var_java_lang_String_char) + this.var_gd_do.mangSoNguyen[0] + MenuChinhAvatar.cl);
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.cb) + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) + MenuChinhAvatar.cl);
        }
    }

    public final void (Graphics graphics, int n, int n2 != 0) {
        ci_0.var_bH_arr_do[this.var_gd_do.var_short_if].cfr_renamed_0(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
    }

        static {
        aw.cfr_renamed_3();
    }

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[3];
        2 = "  ".length();
        3 = "   ".length();
        0 = (0x1D ^ 9) & ~(0x94 ^ 0x80);
    }
}

