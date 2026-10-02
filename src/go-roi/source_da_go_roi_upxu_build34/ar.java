/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class ar
extends ei {
    private final gd var_gd_do;
    private final int soLuong;
    private static int[] mangSoNguyen;

    ar(String string, int n, gd gd2, int n2) {
        super(string, 12, n);
        this.var_gd_do = gd2;
        this.soLuong = n2;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[4];
        12 = 0x98 ^ 0x94;
        7 = 0xBE ^ 0xB9;
        2 = "  ".length();
        3 = "   ".length();
    }

    public final void cfr_renamed_0() {
        if ((this.soLuong == em_0.var_int_if)) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0(this.var_gd_do.chuoiGiaTri);
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.bH) + this.var_gd_do.soLuong);
        }
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ak_0.dY_do((int)this.var_gd_do.var_short_do).cfr_renamed_0(graphics, 7, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
    }

        static {
        ar.cfr_renamed_3();
    }
}

