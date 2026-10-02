/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from f
 */
final class f_0
extends fl_0 {
    private static int[] mangSoNguyen;
    private final ee_0 var_ee_0_do;
    private final int soLuong;

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[4];
        12 = 132 + 69 - 159 + 99 ^ 98 + 47 - 143 + 127;
        7 = 19 + 160 - 168 + 171 ^ 158 + 173 - 242 + 88;
        2 = "  ".length();
        3 = "   ".length();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        bz.fb_0_if(this.var_ee_0_do.var_short_if).cfr_renamed_1(graphics, 7, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
    }

        static {
        f_0.cfr_renamed_2();
    }

    public final void cfr_renamed_1() {
        if ((this.soLuong == fo.var_int_try)) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1(this.var_ee_0_do.chuoiGiaTri);
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.bJ) + this.var_ee_0_do.soLuong);
        }
    }

    f_0(String string, int n, ee_0 ee_02, int n2) {
        super(string, 12, n);
        this.var_ee_0_do = ee_02;
        this.soLuong = n2;
    }
}

