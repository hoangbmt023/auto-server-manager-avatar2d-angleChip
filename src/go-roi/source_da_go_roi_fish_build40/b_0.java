/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from b
 */
final class b_0
extends fl_0 {
    private final am var_am_do;
    private final byte cfr_renamed_0;
    private static int[] mangSoNguyen;

    static {
        b_0.cfr_renamed_2();
    }

    public final void cfr_renamed_1() {
        if ((this.cfr_renamed_0 == fo.var_int_try)) {
            fo.cfr_renamed_5();
            go_0.cfr_renamed_1(this.var_am_do);
            String string = "";
            if ((this.var_am_do.var_byte_if == 20)) {
                string = MenuChinhAvatar.cu;
                if ((0x67 ^ 0x50 ^ (0x93 ^ 0xA0)) < (0xCE ^ 0x92 ^ (0x1B ^ 0x43))) {
                    return;
                }
            } else if ((this.var_am_do.var_byte_if == 10)) {
                string = MenuChinhAvatar.chuoiGiaTri;
                if ("  ".length() < 0) {
                    return;
                }
            } else if ((this.var_am_do.var_byte_if == 40)) {
                string = MenuChinhAvatar.bK;
                if ((0x5F ^ 0x54 ^ (0x10 ^ 0x1F)) != (0xCD ^ 0x83 ^ (0x26 ^ 0x6C))) {
                    return;
                }
            } else if ((this.var_am_do.var_byte_if == 50)) {
                string = MenuChinhAvatar.var_java_lang_String_const;
            }
            fo.cfr_renamed_1(String.valueOf(string) + aa_0.java_lang_String_do(this.var_am_do));
            fo.cfr_renamed_1(GameCanvas.cfr_renamed_1(this.var_am_do.mangSoNguyen[0], this.var_am_do.mangSoNguyen[1], 1));
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.cU) + aa_0.int_do(this.var_am_do));
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_new[0]) + go_0.duLieuNguoiChoi.var_short_char);
        }
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[8];
        2 = "  ".length();
        3 = "   ".length();
        20 = 0x57 ^ 0x43;
        10 = 0x11 ^ 0x69 ^ (0x41 ^ 0x33);
        40 = 0x21 ^ 9;
        50 = 0x3C ^ 0xE ^ (5 ^ 0x22) & ~(0x9A ^ 0xBD);
        0 = (0xAE ^ 0x9C) & ~(0x8E ^ 0xBC);
        1 = " ".length();
    }

    b_0(String string, de de2, am am2, byte by2) {
        super(string, de2);
        this.var_am_do = am2;
        this.cfr_renamed_0 = by2;
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        this.var_am_do.cfr_renamed_1(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
    }

    }

