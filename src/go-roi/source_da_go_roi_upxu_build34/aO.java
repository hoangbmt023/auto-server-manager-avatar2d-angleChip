/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class aO
extends ei {
    private gd var_gd_do;
    private int soLuong = 0;
    private static final int[] mangSoNguyen;

    public aO(String string, cp cp2, int n, gd gd2) {
        super(string, cp2);
        this.soLuong = n;
        this.var_gd_do = gd2;
    }

    static {
        aO.cfr_renamed_3();
    }

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[5];
        0 = (0x73 ^ 0x49) & ~(0x81 ^ 0xBB);
        50 = 0x97 ^ 0xA5;
        7 = 0x1F ^ 0x18;
        2 = "  ".length();
        3 = "   ".length();
    }

        public final void cfr_renamed_0() {
        if ((this.soLuong == em_0.var_int_if)) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0("ID: " + this.var_gd_do.var_short_do);
            em_0.cfr_renamed_0(this.var_gd_do.chuoiGiaTri);
            em_0.cfr_renamed_0(MenuChinhAvatar.bH + this.var_gd_do.soLuong);
            em_0.cfr_renamed_0(MenuChinhAvatar.aj + GameCanvas.java_lang_String_do(this.var_gd_do.mangSoNguyen[0] * this.var_gd_do.soLuong) + MenuChinhAvatar.cl);
            em_0.cfr_renamed_0(fe_0.java_lang_String_do());
        }
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        if ((this.var_gd_do.var_short_do < 50)) {
            ak_0.dY_do((int)this.var_gd_do.var_short_do).cfr_renamed_0(graphics, 7, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
            return;
        }
        ci_0.cfr_renamed_0(graphics, ak_0.fc_0_do((int)this.var_gd_do.var_short_do).cfr_renamed_4, n += em_0.var_int_try / 2, n2 += em_0.var_int_try / 2, 3);
    }
}

