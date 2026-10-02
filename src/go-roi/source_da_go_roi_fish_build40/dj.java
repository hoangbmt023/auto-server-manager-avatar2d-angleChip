/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class dj
extends fl_0 {
    private final int soLuong;
    private final gk_0 var_gk_0_do;
    private static final int[] mangSoNguyen;

    public final void (Graphics graphics, int n, int n2 != 0) {
        aa_0.cfr_renamed_1(graphics, this.var_gk_0_do.var_short_do, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
    }

        dj(String string, int n, gk_0 gk_02, int n2) {
        super(string, 8, n);
        this.var_gk_0_do = gk_02;
        this.soLuong = n2;
    }

    public final void cfr_renamed_1() {
        if ((this.soLuong == fo.var_int_try - bz.var_fb_0_arr_do.length) && (fo.var_boolean_int)) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1("ID: " + this.var_gk_0_do.var_byte_do);
            fo.cfr_renamed_1(this.var_gk_0_do.tenNhanVat + " (" + this.var_gk_0_do.soLuong + MenuChinhAvatar.var_java_lang_String_this + ")");
            fo.cfr_renamed_1(MenuChinhAvatar.X + GameCanvas.cfr_renamed_1(this.var_gk_0_do.mangSoNguyen[0], this.var_gk_0_do.mangSoNguyen[1], 0));
            fo.cfr_renamed_1(this.var_gk_0_do.chuoiGiaTri);
            fo.cfr_renamed_1(go_0.java_lang_String_do());
        }
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[5];
        8 = 0xAE ^ 0xA6;
        2 = "  ".length();
        3 = "   ".length();
        0 = (62 + 62 - -27 + 88 ^ 186 + 144 - 234 + 97) & (0x23 ^ 0x70 ^ (0x74 ^ 9) ^ -" ".length());
        1 = " ".length();
    }

        static {
        dj.cfr_renamed_2();
    }
}

