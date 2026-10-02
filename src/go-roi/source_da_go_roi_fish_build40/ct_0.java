/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from cT
 */
final class ct_0
extends fl_0 {
    private final byte cfr_renamed_0;
    private static int[] mangSoNguyen;
    private final am var_am_do;

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        this.var_am_do.cfr_renamed_1(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
    }

    public final void cfr_renamed_1() {
        if ((this.cfr_renamed_0 == fo.var_int_try)) {
            go_0.cfr_renamed_1(this.var_am_do);
            fo.cfr_renamed_5();
            String string = "";
            fo.cfr_renamed_1(String.valueOf(string) + aa_0.java_lang_String_do(this.var_am_do));
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.X) + GameCanvas.cfr_renamed_1(this.var_am_do.mangSoNguyen[0], this.var_am_do.mangSoNguyen[1], 0));
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.cU) + aa_0.int_do(this.var_am_do));
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_new[0]) + go_0.duLieuNguoiChoi.var_short_char);
        }
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[4];
        2 = "  ".length();
        3 = "   ".length();
        0 = (0x1E ^ 0x49) & ~(0x64 ^ 0x33);
        1 = " ".length();
    }

    ct_0(String string, de de2, am am2, byte by2) {
        super(string, de2);
        this.var_am_do = am2;
        this.cfr_renamed_0 = by2;
    }

        static {
        ct_0.cfr_renamed_2();
    }
}

