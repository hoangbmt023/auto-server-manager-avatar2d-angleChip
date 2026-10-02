/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class dp
extends fl_0 {
    private final int soLuong;
    private static final int[] mangSoNguyen;

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[5];
        7 = 103 + 82 - 21 + 0 ^ 152 + 58 - 129 + 82;
        2 = "  ".length();
        3 = "   ".length();
        0 = (0x6D ^ 0x34) & ~(0x9D ^ 0xC4);
        1 = " ".length();
    }

    public final void cfr_renamed_1() {
        if ((this.soLuong == fo.var_int_try) && (fo.var_boolean_int)) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1("ID: " + bz.var_fb_0_arr_do[this.soLuong].cfr_renamed_4);
            fo.cfr_renamed_1(bz.var_fb_0_arr_do[this.soLuong].chuoiGiaTri + " (" + bz.var_fb_0_arr_do[this.soLuong].cfr_renamed_5 + MenuChinhAvatar.var_java_lang_String_this + ")");
            fo.cfr_renamed_1(MenuChinhAvatar.X + GameCanvas.cfr_renamed_1((int)bz.var_fb_0_arr_do[this.soLuong].var_short_arr_do[0], (int)bz.var_fb_0_arr_do[this.soLuong].var_short_arr_do[1], 0));
            fo.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_new[2] + ": " + bz.var_fb_0_arr_do[this.soLuong].var_byte_do);
            if ((bz.var_fb_0_arr_do[this.soLuong].dangChayAuto)) {
                dg_0 dg_02 = dR.dg_0_do(bz.var_fb_0_arr_do[this.soLuong].cfr_renamed_2);
                fo.cfr_renamed_1(MenuChinhAvatar.m + ": " + dg_02.chuoiGiaTri);
            }
            fo.cfr_renamed_1(MenuChinhAvatar.dm + ": " + GameCanvas.java_lang_String_do(bz.var_fb_0_arr_do[this.soLuong].cfr_renamed_3));
            fo.cfr_renamed_1(go_0.java_lang_String_do());
        }
    }

        public final void (Graphics graphics, int n, int n2 != 0) {
        bz.var_fb_0_arr_do[this.soLuong].cfr_renamed_1(graphics, 7, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
    }

        static {
        dp.cfr_renamed_2();
    }

    dp(String string, int n, int n2) {
        super(string, 7, n);
        this.soLuong = n2;
    }
}

