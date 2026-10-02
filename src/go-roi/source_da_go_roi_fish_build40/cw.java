/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class cw
extends fl_0 {
    private final by var_by_do;
    private static int[] mangSoNguyen;

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[7];
        2 = "  ".length();
        7 = 0x40 ^ 0x47;
        1 = " ".length();
        0 = (38 + 30 - -37 + 99 ^ 32 + 115 - 119 + 103) & (0xF8 ^ 0xC5 ^ (0xB0 ^ 0xC2) ^ -" ".length());
        3 = "   ".length();
        4 = 0x1C ^ 0x69 ^ (0xB2 ^ 0xC3);
        5 = 0x82 ^ 0x87;
    }

    static {
        cw.cfr_renamed_2();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        n = fo.cfr_renamed_7 / 2 + 7;
        n2 = (fo.soLuong - en.cfr_renamed_10 - (dF.cfr_renamed_15 << 1)) / 7;
        int n3 = n2 / 2 - go_0.var_javax_microedition_lcdui_Image_do.getHeight() / 2;
        go_0.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_const[0]) + this.var_by_do.var_short_do, n, n3, (int)this.var_by_do.cfr_renamed_5);
        go_0.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[1], n, n3 += n2, (int)this.var_by_do.cfr_renamed_2);
        go_0.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[2], n, n3 += n2, (int)this.var_by_do.var_byte_do);
        go_0.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[3], n, n3 += n2, (int)this.var_by_do.cfr_renamed_3);
        go_0.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[4], n, n3 += n2, (int)this.var_by_do.cfr_renamed_0);
        go_0.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[5], n, n3 + n2, (int)this.var_by_do.cfr_renamed_4);
    }

    cw(by by2) {
        super(null, null);
        this.var_by_do = by2;
    }
}

