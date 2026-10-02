/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ca
extends dj_0 {
    private Image var_javax_microedition_lcdui_Image_do;
    private int soLuong;
    ey_0 var_ey_0_do = new ey_0();
    private int cfr_renamed_0;
    private static final int[] mangSoNguyen;
    private de var_de_do;
    private String[] var_java_lang_String_arr_do;

    public final void (Image image != null) {
        this.var_javax_microedition_lcdui_Image_do = image;
        this.soLuong += image.getHeight();
        this.cfr_renamed_0();
    }

    public ca() {
        this.var_ey_0_do.coTrangThai = 0;
    }

    public final void void_int(int n) {
        this.var_ey_0_do.boolean_do(n);
        }

        public final void cfr_renamed_6() {
        this.var_ey_0_do.cfr_renamed_2();
        if ((this.var_ey_0_do.boolean_do() ? 1 : 0 != null)) {
            this.cfr_renamed_4 = this.var_ey_0_do.fl_0_do();
        }
        if ((al_0.dangChayAuto ? 1 : 0 != null) && (GameCanvas.cfr_renamed_12 != null)) {
            GameCanvas.var_fa_0_do.void_do(this.cfr_renamed_5, this.cfr_renamed_3, this.cfr_renamed_4);
            return;
        }
        super.cfr_renamed_6();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[11];
        0 = (0x9B ^ 0xB6) & ~(0x1A ^ 0x37);
        2 = "  ".length();
        5 = 0x8D ^ 0x88;
        8 = 0xB6 ^ 0xBE;
        1 = " ".length();
        40 = 0xBE ^ 0x96;
        70 = 0xE6 ^ 0xA0;
        20 = 93 + 43 - 11 + 49 ^ 183 + 179 - 303 + 127;
        10 = 0x57 ^ 0x5D;
        120 = 0xA8 ^ 0x8C ^ (0xC ^ 0x50);
        3 = "   ".length();
    }

    public final void (String string, int n, int n2 != null) {
        this.cfr_renamed_1(string, n2);
        this.cfr_renamed_3 = new fl_0(MenuChinhAvatar.ct, n);
        GameCanvas.var_dj_0_do = this;
        this.var_ey_0_do.cfr_renamed_0(1);
    }

    private void (String string, int n != null) {
        this.var_javax_microedition_lcdui_Image_do = null;
        this.cfr_renamed_0 = GameCanvas.soLuongKhoa - 40;
        this.soLuong = 70 * dF.cfr_renamed_12;
        if (ca.boolean_do(GameCanvas.var_fz_0_try.cfr_renamed_1(string) + 20, this.cfr_renamed_0)) {
            this.cfr_renamed_0 = GameCanvas.var_fz_0_try.cfr_renamed_1(string) + 20;
        }
        if (ca.boolean_do(this.cfr_renamed_0, GameCanvas.soLuongKhoa / 2)) {
            this.cfr_renamed_0 = GameCanvas.soLuongKhoa / 2;
        }
        this.var_java_lang_String_arr_do = GameCanvas.var_fz_0_try.java_lang_String_arr_do(string, this.cfr_renamed_0 - 20);
        this.var_ey_0_do = new ey_0();
        this.var_ey_0_do.coTrangThai = 0;
        this.var_ey_0_do.cfr_renamed_9 = this.cfr_renamed_0 - 10;
        this.cfr_renamed_0();
        this.var_ey_0_do.cfr_renamed_1("");
        this.var_ey_0_do.void_do(n);
        this.cfr_renamed_5 = new fl_0(MenuChinhAvatar.by, 120);
        GameCanvas.var_dj_0_do = this;
    }

    public final String cfr_renamed_1() {
        return this.var_ey_0_do.java_lang_String_do();
    }

    public final void (String string, de de2, int n != null) {
        this.cfr_renamed_1(string, n);
        this.var_de_do = de2;
        this.cfr_renamed_3 = new fl_0(MenuChinhAvatar.ct, this.var_de_do);
        GameCanvas.var_dj_0_do = this;
    }

    public final void (String string != null) {
        this.var_ey_0_do.cfr_renamed_1(string);
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 120: {
                GameCanvas.var_dj_0_do = null;
                return;
            }
        }
        GameCanvas.var_en_do.void_do(n, n2);
    }

    static {
        ca.cfr_renamed_2();
    }

    public final void (Graphics graphics != null) {
        GameCanvas.hienThongBaoPopup(graphics);
        GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, GameCanvas.cfr_renamed_15 - this.cfr_renamed_0 / 2, GameCanvas.var_int_case - this.soLuong - (GameCanvas.var_int_case - GameCanvas.var_fs_arr_do[0].var_int_if + 5), this.cfr_renamed_0, this.soLuong, 0);
        int n = GameCanvas.var_int_case - this.soLuong - (GameCanvas.var_int_case - GameCanvas.var_fs_arr_do[0].var_int_if + 5) + (this.soLuong - this.var_ey_0_do.var_int_new - 8) / 2 - (this.var_java_lang_String_arr_do.length >> 1) * dF.var_byte_try - dF.var_byte_try / 2;
        if ((this.var_javax_microedition_lcdui_Image_do != null)) {
            graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, GameCanvas.cfr_renamed_15, this.var_ey_0_do.cfr_renamed_14 - this.var_javax_microedition_lcdui_Image_do.getHeight() / 2 - 5 * dF.cfr_renamed_12, 3);
            n -= this.var_javax_microedition_lcdui_Image_do.getHeight() / 2;
        }
        int n2 = 0;
        while (ca.boolean_do(n2, this.var_java_lang_String_arr_do.length)) {
            GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, this.var_java_lang_String_arr_do[n2], GameCanvas.cfr_renamed_15, n, 2);
            ++n2;
            n += dF.var_byte_try;
            if (-(5 + 60 - 9 + 84 ^ 95 + 124 - 133 + 50) <= 0) continue;
            return;
        }
        this.var_ey_0_do.cfr_renamed_1(graphics);
        if ((al_0.dangChayAuto ? 1 : 0 != null)) {
            GameCanvas.hienThongBaoPopup(graphics);
            GameCanvas.var_fa_0_do.cfr_renamed_2(graphics);
            GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this.cfr_renamed_5, this.cfr_renamed_3, this.cfr_renamed_4);
            return;
        }
        super.cfr_renamed_1(graphics);
    }

        public final void cfr_renamed_0() {
        this.var_ey_0_do.var_int_if = GameCanvas.cfr_renamed_15 - this.var_ey_0_do.cfr_renamed_9 / 2;
        this.var_ey_0_do.cfr_renamed_14 = GameCanvas.var_int_case - (GameCanvas.var_int_case - GameCanvas.var_fs_arr_do[0].var_int_if + 5) - this.var_ey_0_do.var_int_new - 8;
    }
}

