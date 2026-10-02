/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class bv
extends fl_0 {
    private int soLuong = 0;
    private ee_0 var_ee_0_do;
    private static final int[] mangSoNguyen;

        static {
        bv.cfr_renamed_2();
    }

    public final void cfr_renamed_1() {
        if ((this.soLuong == fo.var_int_try)) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1("ID: " + this.var_ee_0_do.var_short_if);
            fo.cfr_renamed_1(this.var_ee_0_do.chuoiGiaTri);
            fo.cfr_renamed_1(MenuChinhAvatar.bJ + this.var_ee_0_do.soLuong);
            fo.cfr_renamed_1(MenuChinhAvatar.cA + GameCanvas.java_lang_String_do(this.var_ee_0_do.mangSoNguyen[0] * this.var_ee_0_do.soLuong) + MenuChinhAvatar.cb);
            fo.cfr_renamed_1(go_0.java_lang_String_do());
        }
    }

        public bv(String string, de de2, int n, ee_0 ee_02) {
        super(string, de2);
        this.soLuong = n;
        this.var_ee_0_do = ee_02;
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        if ((this.var_ee_0_do.var_short_if < 50)) {
            bz.fb_0_if(this.var_ee_0_do.var_short_if).cfr_renamed_1(graphics, 7, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
            return;
        }
        aa_0.cfr_renamed_1(graphics, bz.gk_0_do((int)this.var_ee_0_do.var_short_if).var_short_for, n += fo.soLuongKhoa / 2, n2 += fo.soLuongKhoa / 2, 3);
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[5];
        0 = (0xEB ^ 0xA1) & ~(0x61 ^ 0x2B);
        50 = 0xA3 ^ 0xBA ^ (0x65 ^ 0x4E);
        7 = 0xD6 ^ 0xAF ^ (0x62 ^ 0x1C);
        2 = "  ".length();
        3 = "   ".length();
    }
}

