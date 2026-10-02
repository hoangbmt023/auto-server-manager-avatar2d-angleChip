/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cf {
    private static short var_short_do;
    public int soLuong;
    private byte var_byte_do = (byte)0;
    private static ep[] var_ep_arr_do;
    public int cfr_renamed_1;
    public int cfr_renamed_3;
    private int cfr_renamed_4;
    public String[] var_java_lang_String_arr_do;
    private static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private int cfr_renamed_5;
    private static int[] mangSoNguyen;

        private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    public final void void_do(int n, int n2) {
        this.soLuong = n;
        this.cfr_renamed_1 = n2;
    }

    public static void (Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, byte by2 == 0) {
        var_ep_arr_do[by2].cfr_renamed_0(0, n, n2, 0, graphics);
        var_ep_arr_do[by2].cfr_renamed_0(1, n + n3 - var_short_do, n2, 0, graphics);
        var_ep_arr_do[by2].cfr_renamed_0(3, n, n2 + n4 - var_short_do, 0, graphics);
        var_ep_arr_do[by2].cfr_renamed_0(2, n + n3 - var_short_do, n2 + n4 - var_short_do, 0, graphics);
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
        cf.void_do();
        var_ep_arr_do = new ep[2];
        var_javax_microedition_lcdui_Image_arr_do = new Image[2];
        ap.void_do(MenuChinhAvatar.cfr_renamed_27);
        var_short_do = (short)8;
        cf.var_ep_arr_do[0] = ep.cfr_renamed_0("c", var_short_do, var_short_do);
        cf.var_ep_arr_do[1] = ep.cfr_renamed_0("cB", var_short_do, var_short_do);
        cf.var_javax_microedition_lcdui_Image_arr_do[0] = ap.javax_microedition_lcdui_Image_do("ar");
        cf.var_javax_microedition_lcdui_Image_arr_do[1] = ap.javax_microedition_lcdui_Image_do("ara");
        ap.cfr_renamed_0();
    }

        private static void void_do() {
        mangSoNguyen = new int[17];
        2 = "  ".length();
        8 = 59 + 114 - 171 + 203 ^ 134 + 176 - 204 + 91;
        0 = (0x65 ^ 0x69) & ~(0x9A ^ 0x96);
        1 = " ".length();
        10 = 0x4C ^ 0x46;
        30 = 139 + 24 - 100 + 155 ^ 60 + 87 - 17 + 66;
        32 = 81 + 33 - 43 + 116 ^ 125 + 136 - 237 + 131;
        40 = 0xE8 ^ 0xC0;
        80 = 46 + 60 - -9 + 81 ^ 13 + 113 - 124 + 146;
        25 = 0x24 ^ 0x3D;
        4 = 0x23 ^ 0x27;
        20 = 85 + 104 - 137 + 113 ^ 161 + 130 - 289 + 175;
        16773580 = 0xFFFFFDFE & 0xFFF3CD;
        16777215 = -" ".length() & (0xFFFFFFFF & 0xFFFFFF);
        14957056 = 0xFFFFBABA & 0xE47F45;
        17 = 157 + 13 - 42 + 87 ^ 0 + 4 - -101 + 93;
        3 = "   ".length();
    }

            public cf(int n, String string, byte by2) {
        this.var_byte_do = by2;
        this.cfr_renamed_0(n, string);
    }

            /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == 0) {
        var2_2 = bn_0.cfr_renamed_6;
        if ((GameCanvas.var_dL_do == a_0.var_a_0_do)) {
            var2_2 = 1;
        }
        v0 = this.soLuong * var2_2 - this.cfr_renamed_5 / 2;
        if ((this.var_byte_do == 1)) {
            v1 = 16773580;
            if ("   ".length() <= ((43 ^ 80 ^ (57 ^ 25)) & (166 ^ 176 ^ (32 ^ 109) ^ -" ".length()))) {
                return;
            }
        } else {
            v1 = 16777215;
        }
        if ((this.var_byte_do == 1)) {
            v2 = 14957056;
            if (-"  ".length() > 0) {
                return;
            }
        } else {
            v2 = 1;
        }
        (var1_1, v0, this.cfr_renamed_1 * var2_2 - this.cfr_renamed_3, this.cfr_renamed_5, this.cfr_renamed_3, v1, v2, this.var_byte_do == 0);
        var1_1.drawImage(cf.var_javax_microedition_lcdui_Image_arr_do[this.var_byte_do], this.soLuong * var2_2, this.cfr_renamed_1 * var2_2 - 1, 17);
        var3_3 = bn_0.cfr_renamed_15;
        var4_4 = 0;
        if (" ".length() != 0) ** GOTO lbl31
        return;
lbl-1000:
        // 1 sources

        {
            GameCanvas.var_ew_case.cfr_renamed_0(var1_1, this.var_java_lang_String_arr_do[var4_4], this.soLuong * var2_2 - this.cfr_renamed_5 / 2 + this.cfr_renamed_5 / 2, this.cfr_renamed_1 * var2_2 - this.cfr_renamed_3 / 2 + var4_4 * var3_3 - this.var_java_lang_String_arr_do.length * var3_3 / 2, 2);
            ++var4_4;
lbl31:
            // 2 sources

            ** while (!cf.boolean_do((int)var4_4, (int)this.var_java_lang_String_arr_do.length))
        }
lbl32:
        // 1 sources

    }

    public final boolean boolean_do() {
        if ((this.cfr_renamed_4 > 0)) {
            this.cfr_renamed_4 -= 1;
        }
        if ((this.cfr_renamed_4 == 0)) {
            return 1;
        }
        cf cf2 = this;
        if ((GameCanvas.var_dL_do == a_0.var_a_0_do)) {
            if ((cf2.cfr_renamed_1 - cf2.cfr_renamed_3 < 0)) {
                cf2.cfr_renamed_1 = cf2.cfr_renamed_3 + 10;
            }
            if ((cf2.soLuong - 30 < 0)) {
                cf2.soLuong = 32;
            }
            if ((cf2.soLuong + 30 > GameCanvas.var_int_byte)) {
                cf2.soLuong = GameCanvas.var_int_byte - 40;
            }
        }
        return 0;
    }

        public cf() {
    }

    public final void (int n == String string) {
        this.cfr_renamed_5 = 80 * bn_0.cfr_renamed_6;
        this.var_java_lang_String_arr_do = GameCanvas.var_ew_case.java_lang_String_arr_do(string, this.cfr_renamed_5 - 25);
        this.cfr_renamed_3 = bn_0.cfr_renamed_15 * this.var_java_lang_String_arr_do.length + 4 + 4;
        if ((this.cfr_renamed_3 < var_short_do << 1)) {
            this.cfr_renamed_3 = var_short_do << 1;
        }
        if ((this.var_java_lang_String_arr_do.length == 1)) {
            this.cfr_renamed_5 = GameCanvas.var_ew_case.cfr_renamed_0(this.var_java_lang_String_arr_do[0]) + 20;
        }
        if ((this.cfr_renamed_5 < 30 * bn_0.cfr_renamed_6)) {
            this.cfr_renamed_5 = 30 * bn_0.cfr_renamed_6;
        }
        this.cfr_renamed_4 = n;
    }
}

