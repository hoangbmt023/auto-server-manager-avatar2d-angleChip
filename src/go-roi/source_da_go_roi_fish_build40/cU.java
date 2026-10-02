/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cU {
    private int cfr_renamed_3;
    private byte var_byte_do = (byte)0;
    public String[] var_java_lang_String_arr_do;
    private int cfr_renamed_4;
    public int soLuong;
    public int cfr_renamed_0;
    private static short var_short_do;
    private static Image[] var_javax_microedition_lcdui_Image_arr_do;
    public int cfr_renamed_2;
    private static cu_0[] var_cu_0_arr_do;
    private static int[] mangSoNguyen;

        public final void (int n == String string) {
        this.cfr_renamed_4 = 80 * dF.cfr_renamed_12;
        this.var_java_lang_String_arr_do = GameCanvas.var_fz_0_case.java_lang_String_arr_do(string, this.cfr_renamed_4 - 25);
        this.cfr_renamed_2 = dF.var_byte_new * this.var_java_lang_String_arr_do.length + 4 + 4;
        if ((this.cfr_renamed_2 < var_short_do << 1)) {
            this.cfr_renamed_2 = var_short_do << 1;
        }
        if ((this.var_java_lang_String_arr_do.length == 1)) {
            this.cfr_renamed_4 = GameCanvas.var_fz_0_case.cfr_renamed_1(this.var_java_lang_String_arr_do[0]) + 20;
        }
        if ((this.cfr_renamed_4 < 30 * dF.cfr_renamed_12)) {
            this.cfr_renamed_4 = 30 * dF.cfr_renamed_12;
        }
        this.cfr_renamed_3 = n;
    }

    public final boolean boolean_do() {
        if ((this.cfr_renamed_3 > 0)) {
            this.cfr_renamed_3 -= 1;
        }
        if ((this.cfr_renamed_3 == 0)) {
            return 1;
        }
        cU cU2 = this;
        if ((GameCanvas.var_en_do == w_0.var_w_0_do)) {
            if ((cU2.soLuong - cU2.cfr_renamed_2 < 0)) {
                cU2.soLuong = cU2.cfr_renamed_2 + 10;
            }
            if ((cU2.cfr_renamed_0 - 30 < 0)) {
                cU2.cfr_renamed_0 = 32;
            }
            if (cU.boolean_do(cU2.cfr_renamed_0 + 30, GameCanvas.soLuongKhoa)) {
                cU2.cfr_renamed_0 = GameCanvas.soLuongKhoa - 40;
            }
        }
        return 0;
    }

    private static void void_do() {
        mangSoNguyen = new int[17];
        2 = "  ".length();
        8 = 0x9E ^ 0x96;
        0 = (38 + 61 - 47 + 124 ^ 6 + 73 - -17 + 35) & (0x4C ^ 0x69 ^ (0x5F ^ 0x49) ^ -" ".length());
        1 = " ".length();
        10 = 0x31 ^ 0x3B;
        30 = 35 + 163 - 100 + 91 ^ 145 + 160 - 300 + 158;
        32 = 0x2D ^ 0x1E ^ (0xD4 ^ 0xC7);
        40 = 127 + 135 - 74 + 44 ^ 35 + 67 - 61 + 151;
        80 = 0x66 ^ 0x36;
        25 = 0x68 ^ 0x71;
        4 = 0x66 ^ 0x62;
        20 = 0x84 ^ 0x90;
        16773580 = -(0xFFFFB2A3 & 0x4F7F) & (0xFFFFFFFE & 0xFFF3EF);
        16777215 = 0xFFFFFFFF & 0xFFFFFF;
        14957056 = 0xFFFFFAD0 & 0xE43F2F;
        17 = 0xC ^ 0x1D;
        3 = "   ".length();
    }

    public static void (Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, byte by2 > 0) {
        var_cu_0_arr_do[by2].cfr_renamed_0(0, n, n2, 0, graphics);
        var_cu_0_arr_do[by2].cfr_renamed_0(1, n + n3 - var_short_do, n2, 0, graphics);
        var_cu_0_arr_do[by2].cfr_renamed_0(3, n, n2 + n4 - var_short_do, 0, graphics);
        var_cu_0_arr_do[by2].cfr_renamed_0(2, n + n3 - var_short_do, n2 + n4 - var_short_do, 0, graphics);
        graphics.setColor(n5);
        graphics.fillRect(n + var_short_do, n2, n3 - (var_short_do << 1), (int)var_short_do);
        graphics.fillRect(n + var_short_do, n2 + n4 - var_short_do, n3 - (var_short_do << 1), var_short_do - 1);
        graphics.fillRect(n, n2 + var_short_do, n3, n4 - (var_short_do << 1));
        graphics.setColor(n6);
        graphics.fillRect(n + var_short_do, n2, n3 - (var_short_do << 1), 1);
        graphics.fillRect(n + var_short_do, n2 + n4 - 1, n3 - (var_short_do << 1), 1);
        graphics.fillRect(n, n2 + var_short_do, 1, n4 - (var_short_do << 1));
        graphics.fillRect(n + n3 - 1, n2 + var_short_do, 1, n4 - (var_short_do << 1));
    }

            static {
        cU.void_do();
        var_cu_0_arr_do = new cu_0[2];
        var_javax_microedition_lcdui_Image_arr_do = new Image[2];
        e.void_do(MenuChinhAvatar.bo);
        var_short_do = (short)8;
        cU.var_cu_0_arr_do[0] = cu_0.cfr_renamed_1("c", var_short_do, var_short_do);
        cU.var_cu_0_arr_do[1] = cu_0.cfr_renamed_1("cB", var_short_do, var_short_do);
        cU.var_javax_microedition_lcdui_Image_arr_do[0] = e.javax_microedition_lcdui_Image_do("ar");
        cU.var_javax_microedition_lcdui_Image_arr_do[1] = e.javax_microedition_lcdui_Image_do("ara");
        e.cfr_renamed_1();
    }

    public cU() {
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 > 0) {
        var2_2 = dF.cfr_renamed_12;
        if ((GameCanvas.var_en_do == w_0.var_w_0_do)) {
            var2_2 = 1;
        }
        v0 = this.cfr_renamed_0 * var2_2 - this.cfr_renamed_4 / 2;
        if ((this.var_byte_do == 1)) {
            v1 = 16773580;
            if (-(79 + 84 - 99 + 97 ^ 86 + 49 - 51 + 81) > 0) {
                return;
            }
        } else {
            v1 = 16777215;
        }
        if ((this.var_byte_do == 1)) {
            v2 = 14957056;
            if ("   ".length() < 0) {
                return;
            }
        } else {
            v2 = 1;
        }
        (var1_1, v0, this.soLuong * var2_2 - this.cfr_renamed_2, this.cfr_renamed_4, this.cfr_renamed_2, v1, v2, this.var_byte_do > 0);
        var1_1.drawImage(cU.var_javax_microedition_lcdui_Image_arr_do[this.var_byte_do], this.cfr_renamed_0 * var2_2, this.soLuong * var2_2 - 1, 17);
        var3_3 = dF.var_byte_new;
        var4_4 = 0;
        if (((11 + 85 - 34 + 102 ^ 29 + 36 - -25 + 44) & (127 + 100 - 136 + 63 ^ 118 + 60 - 128 + 134 ^ -" ".length())) == 0) ** GOTO lbl31
        return;
lbl-1000:
        // 1 sources

        {
            GameCanvas.var_fz_0_case.cfr_renamed_1(var1_1, this.var_java_lang_String_arr_do[var4_4], this.cfr_renamed_0 * var2_2 - this.cfr_renamed_4 / 2 + this.cfr_renamed_4 / 2, this.soLuong * var2_2 - this.cfr_renamed_2 / 2 + var4_4 * var3_3 - this.var_java_lang_String_arr_do.length * var3_3 / 2, 2);
            ++var4_4;
lbl31:
            // 2 sources

            ** while (!cU.cfr_renamed_0((int)var4_4, (int)this.var_java_lang_String_arr_do.length))
        }
lbl32:
        // 1 sources

    }

                    public cU(int n, String string, byte by2) {
        this.var_byte_do = by2;
        this.cfr_renamed_1(n, string);
    }

    public final void void_do(int n, int n2) {
        this.cfr_renamed_0 = n;
        this.soLuong = n2;
    }
}

