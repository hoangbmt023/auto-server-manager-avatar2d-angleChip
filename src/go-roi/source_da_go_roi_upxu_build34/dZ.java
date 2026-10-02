/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class dZ
extends bt_0 {
    private int soLuong;
    private cp var_cp_do;
    private String[] var_java_lang_String_arr_do;
    private static final int[] mangSoNguyen;
    gx var_gx_do = new gx();
    private Image var_javax_microedition_lcdui_Image_do;
    private int cfr_renamed_1;

    public final void cfr_renamed_15() {
        this.var_gx_do.cfr_renamed_1();
        if (dZ.boolean_do(this.var_gx_do.boolean_do() ? 1 : 0)) {
            this.cfr_renamed_2 = this.var_gx_do.ei_do();
        }
        if (dZ.boolean_do(t_0.dangChayAuto ? 1 : 0) && dZ.boolean_do(GameCanvas.cfr_renamed_16)) {
            GameCanvas.var_gj_0_do.void_do(this.cfr_renamed_4, this.cfr_renamed_5, this.cfr_renamed_2);
            return;
        }
        super.cfr_renamed_15();
    }

    public final void (Graphics graphics != null) {
        GameCanvas.cfr_renamed_1(graphics);
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, GameCanvas.var_int_int - this.soLuong / 2, GameCanvas.var_int_char - this.cfr_renamed_1 - (GameCanvas.var_int_char - GameCanvas.var_eq_0_arr_do[0].soLuong + 5), this.soLuong, this.cfr_renamed_1, 0);
        int n = GameCanvas.var_int_char - this.cfr_renamed_1 - (GameCanvas.var_int_char - GameCanvas.var_eq_0_arr_do[0].soLuong + 5) + (this.cfr_renamed_1 - this.var_gx_do.var_int_int - 8) / 2 - (this.var_java_lang_String_arr_do.length >> 1) * bn_0.var_byte_new - bn_0.var_byte_new / 2;
        if ((this.var_javax_microedition_lcdui_Image_do != null)) {
            graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, GameCanvas.var_int_int, this.var_gx_do.soLuongKhoa - this.var_javax_microedition_lcdui_Image_do.getHeight() / 2 - 5 * bn_0.cfr_renamed_6, 3);
            n -= this.var_javax_microedition_lcdui_Image_do.getHeight() / 2;
        }
        int n2 = 0;
        while (dZ.boolean_do(n2, this.var_java_lang_String_arr_do.length)) {
            GameCanvas.var_ew_try.cfr_renamed_0(graphics, this.var_java_lang_String_arr_do[n2], GameCanvas.var_int_int, n, 2);
            ++n2;
            n += bn_0.var_byte_new;
            if (((0x64 ^ 0x44 ^ (0xCE ^ 0xBB)) & (0x29 ^ 0x69 ^ (0xF ^ 0x1A) ^ -" ".length())) != " ".length()) continue;
            return;
        }
        this.var_gx_do.cfr_renamed_0(graphics);
        if (dZ.boolean_do(t_0.dangChayAuto ? 1 : 0)) {
            GameCanvas.cfr_renamed_1(graphics);
            GameCanvas.var_gj_0_do.cfr_renamed_0(graphics);
            GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.cfr_renamed_4, this.cfr_renamed_5, this.cfr_renamed_2);
            return;
        }
        super.cfr_renamed_0(graphics);
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void (Image image != null) {
        this.var_javax_microedition_lcdui_Image_do = image;
        this.cfr_renamed_1 += image.getHeight();
        this.cfr_renamed_1();
    }

    public final void (String string != null) {
        this.var_gx_do.cfr_renamed_0(string);
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[11];
        0 = (0x7D ^ 0x74 ^ (0x70 ^ 0x61)) & (0x80 ^ 0xBB ^ (0xA8 ^ 0x8B) ^ -" ".length());
        2 = "  ".length();
        5 = 0xB ^ 0x2A ^ (0x5F ^ 0x7B);
        8 = 0x2A ^ 0x22;
        1 = " ".length();
        40 = 0x83 ^ 0xAB;
        70 = 0xC ^ 0x4A;
        20 = 0x38 ^ 0x2C;
        10 = 0x52 ^ 0x58;
        120 = 0xEE ^ 0xAA ^ (0x9E ^ 0xA2);
        3 = "   ".length();
    }

    public final String cfr_renamed_0() {
        return this.var_gx_do.java_lang_String_do();
    }

    public final void (String string, int n, int n2 != null) {
        this.cfr_renamed_0(string, n2);
        this.cfr_renamed_5 = new ei(MenuChinhAvatar.c, n);
        GameCanvas.var_bt_0_do = this;
        this.var_gx_do.cfr_renamed_0(1);
    }

    public dZ() {
        this.var_gx_do.coTrangThai = 0;
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    private void (String string, int n != null) {
        this.var_javax_microedition_lcdui_Image_do = null;
        this.soLuong = GameCanvas.var_int_byte - 40;
        this.cfr_renamed_1 = 70 * bn_0.cfr_renamed_6;
        if (dZ.boolean_do(GameCanvas.var_ew_try.cfr_renamed_0(string) + 20, this.soLuong)) {
            this.soLuong = GameCanvas.var_ew_try.cfr_renamed_0(string) + 20;
        }
        if (dZ.boolean_do(this.soLuong, GameCanvas.var_int_byte / 2)) {
            this.soLuong = GameCanvas.var_int_byte / 2;
        }
        this.var_java_lang_String_arr_do = GameCanvas.var_ew_try.java_lang_String_arr_do(string, this.soLuong - 20);
        this.var_gx_do = new gx();
        this.var_gx_do.coTrangThai = 0;
        this.var_gx_do.cfr_renamed_12 = this.soLuong - 10;
        this.cfr_renamed_1();
        this.var_gx_do.cfr_renamed_0("");
        this.var_gx_do.void_do(n);
        this.cfr_renamed_4 = new ei(MenuChinhAvatar.cfr_renamed_7, 120);
        GameCanvas.var_bt_0_do = this;
    }

    static {
        dZ.cfr_renamed_4();
    }

        public final void (String string, cp cp2, int n != null) {
        this.cfr_renamed_0(string, n);
        this.var_cp_do = cp2;
        this.cfr_renamed_5 = new ei(MenuChinhAvatar.c, this.var_cp_do);
        GameCanvas.var_bt_0_do = this;
    }

    public final void cfr_renamed_1() {
        this.var_gx_do.var_int_new = GameCanvas.var_int_int - this.var_gx_do.cfr_renamed_12 / 2;
        this.var_gx_do.soLuongKhoa = GameCanvas.var_int_char - (GameCanvas.var_int_char - GameCanvas.var_eq_0_arr_do[0].soLuong + 5) - this.var_gx_do.var_int_int - 8;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 120: {
                GameCanvas.var_bt_0_do = null;
                return;
            }
        }
        GameCanvas.var_dL_do.void_do(n, n2);
    }

    public final void void_do(int n) {
        this.var_gx_do.boolean_do(n);
        }
}

