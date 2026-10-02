/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class a
extends fl_0 {
    private final dg_0 var_dg_0_do;
    private static final int[] mangSoNguyen;
    private final int soLuong;

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[3];
        9 = 147 + 86 - 160 + 130 ^ 25 + 51 - -52 + 66;
        2 = "  ".length();
        0 = (0x8D ^ 0xA3) & ~(0x98 ^ 0xB6);
    }

    public final void cfr_renamed_1() {
        if ((this.soLuong == fo.var_int_try)) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1("ID: " + this.var_dg_0_do.var_short_do);
            fo.cfr_renamed_1(this.var_dg_0_do.chuoiGiaTri);
            fo.cfr_renamed_1(MenuChinhAvatar.X + GameCanvas.cfr_renamed_1(this.var_dg_0_do.var_int_if, this.var_dg_0_do.soLuong, 0));
        }
    }

    a(String string, int n, dg_0 dg_02, int n2) {
        super(string, 9, n);
        this.var_dg_0_do = dg_02;
        this.soLuong = n2;
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        this.var_dg_0_do.cfr_renamed_1(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2);
    }

    static {
        a.cfr_renamed_2();
    }
}

