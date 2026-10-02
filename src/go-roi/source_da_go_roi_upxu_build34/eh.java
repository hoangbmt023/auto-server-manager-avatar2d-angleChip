/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class eh
extends bt_0 {
    private int var_int_if;
    int soLuong;
    private ep var_ep_do;
    private int cfr_renamed_3;
    int[] mangSoNguyen;
    private static int[] var_int_arr_if;
    public static eh var_eh_do;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private int cfr_renamed_15;

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    public final void cfr_renamed_1() {
        block6: {
            eh eh2 = this;
            if (!(eh2.var_ep_do == null)) break block6;
            try {
                int n;
                Image image = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/button.png"));
                if ((bn_0.cfr_renamed_6 == var_int_arr_if[0])) {
                    n = var_int_arr_if[1];
                    if ((0x5F ^ 0x5B) <= ((9 ^ 0x4C) & ~(0x27 ^ 0x62))) {
                        return;
                    }
                } else {
                    n = var_int_arr_if[2];
                }
                eh2.var_ep_do = new ep(image, n, var_int_arr_if[3] * bn_0.cfr_renamed_6);
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if (-" ".length() >= 0) {
                return;
            }
            eh2.cfr_renamed_3 = eh2.var_ep_do.cfr_renamed_3 * var_int_arr_if[4] + var_int_arr_if[5] * bn_0.cfr_renamed_6;
            eh2.var_int_if = eh2.var_ep_do.soLuong * var_int_arr_if[4] + var_int_arr_if[6] * bn_0.cfr_renamed_6;
            eh2.cfr_renamed_4 = (GameCanvas.var_int_byte - eh2.cfr_renamed_3) / var_int_arr_if[0];
            eh2.cfr_renamed_15 = (GameCanvas.var_int_char - eh2.var_int_if) / var_int_arr_if[0];
            eh2.cfr_renamed_2 = eh2.var_int_if / var_int_arr_if[4];
            eh2.cfr_renamed_5 = eh2.cfr_renamed_3 / var_int_arr_if[4];
            int[] nArray = new int[var_int_arr_if[7]];
            nArray[eh.var_int_arr_if[8]] = var_int_arr_if[9];
            nArray[eh.var_int_arr_if[10]] = var_int_arr_if[11];
            nArray[eh.var_int_arr_if[0]] = var_int_arr_if[12];
            nArray[eh.var_int_arr_if[4]] = var_int_arr_if[13];
            nArray[eh.var_int_arr_if[14]] = var_int_arr_if[15];
            nArray[eh.var_int_arr_if[16]] = var_int_arr_if[17];
            nArray[eh.var_int_arr_if[18]] = var_int_arr_if[19];
            nArray[eh.var_int_arr_if[20]] = var_int_arr_if[21];
            nArray[eh.var_int_arr_if[22]] = var_int_arr_if[23];
            eh2.mangSoNguyen = nArray;
            eh2.var_ei_new = new ei(MenuChinhAvatar.dg, var_int_arr_if[8], eh2);
            eh2.var_ei_try = new ei(MenuChinhAvatar.cfr_renamed_7, var_int_arr_if[10], eh2);
        }
        GameCanvas.var_bt_0_do = this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics == null) {
        GameCanvas.var_dL_do.cfr_renamed_1(graphics);
        GameCanvas.cfr_renamed_1(graphics);
        GameCanvas.var_gj_0_do.cfr_renamed_4(graphics, this.cfr_renamed_4, this.cfr_renamed_15, this.cfr_renamed_3, this.var_int_if);
        graphics.translate(this.cfr_renamed_4, this.cfr_renamed_15);
        int n = var_int_arr_if[8];
        while (!eh.boolean_do(n, this.mangSoNguyen.length)) {
            int n2;
            if ((this.soLuong == n)) {
                n2 = var_int_arr_if[10];
                } else {
                n2 = var_int_arr_if[8];
            }
            this.var_ep_do.cfr_renamed_0(n2, this.cfr_renamed_5 / var_int_arr_if[0] + n % var_int_arr_if[4] * this.cfr_renamed_5, this.cfr_renamed_2 / var_int_arr_if[0] + n / var_int_arr_if[4] * this.cfr_renamed_2, var_int_arr_if[8], var_int_arr_if[4], graphics);
            GameCanvas.var_ew_int.cfr_renamed_0(graphics, String.valueOf(this.mangSoNguyen[n]), this.cfr_renamed_5 / var_int_arr_if[0] + n % var_int_arr_if[4] * this.cfr_renamed_5, this.cfr_renamed_2 / var_int_arr_if[0] + n / var_int_arr_if[4] * this.cfr_renamed_2 - bn_0.cfr_renamed_8 / var_int_arr_if[0], var_int_arr_if[0]);
            ++n;
        }
        GameCanvas.cfr_renamed_1(graphics);
        t_0.cfr_renamed_0(graphics, ((bn_0)this).cfr_renamed_4, this.var_ei_new, this.var_ei_try);
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public final void void_for() {
    }

        public final void void_if(int n) {
        switch (n) {
            case 0: {
                GameCanvas.hienThongBaoPopup("Bạn có chắc muốn chuyển tiền không ?", new b_0(this));
                return;
            }
            case 1: {
                GameCanvas.var_bt_0_do = null;
            }
        }
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public static eh cfr_renamed_0() {
        if ((var_eh_do == null)) {
            var_eh_do = new eh();
            return var_eh_do;
        }
        return var_eh_do;
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_15() {
        block15: {
            super.cfr_renamed_15();
            if (eh.boolean_if((int)GameCanvas.boolean_do(eh.var_int_arr_if[0]))) {
                if (eh.boolean_do(this.soLuong / eh.var_int_arr_if[4])) {
                    this.soLuong -= eh.var_int_arr_if[4];
                    if (((84 ^ 99) & ~(60 ^ 11)) == " ".length()) {
                        return;
                    }
                }
            } else if (eh.boolean_if((int)GameCanvas.boolean_do(eh.var_int_arr_if[14]))) {
                if (eh.boolean_do(this.soLuong % eh.var_int_arr_if[4])) {
                    this.soLuong -= eh.var_int_arr_if[10];
                    if ((51 ^ 18 ^ (162 ^ 134)) <= 0) {
                        return;
                    }
                }
            } else if (eh.boolean_if((int)GameCanvas.boolean_do(eh.var_int_arr_if[18]))) {
                if (eh.boolean_if(this.soLuong % eh.var_int_arr_if[4], eh.var_int_arr_if[0])) {
                    this.soLuong += eh.var_int_arr_if[10];
                    if ((62 ^ 67 ^ (119 ^ 14)) < -" ".length()) {
                        return;
                    }
                }
            } else if (eh.boolean_if((int)GameCanvas.boolean_do(eh.var_int_arr_if[22])) && eh.boolean_if(this.soLuong / eh.var_int_arr_if[4], eh.var_int_arr_if[0])) {
                this.soLuong += eh.var_int_arr_if[4];
            }
            if (!eh.boolean_if((int)GameCanvas.coKichHoat)) break block15;
            var1_1 = eh.var_int_arr_if[8];
            if ("  ".length() <= "  ".length()) ** GOTO lbl39
            return;
lbl-1000:
            // 1 sources

            {
                if (eh.boolean_if((int)GameCanvas.boolean_do(this.cfr_renamed_4 + var1_1 % eh.var_int_arr_if[4] * this.cfr_renamed_5, this.cfr_renamed_15 + var1_1 / eh.var_int_arr_if[4] * this.cfr_renamed_2, this.cfr_renamed_5, this.cfr_renamed_2))) {
                    GameCanvas.coKichHoat = eh.var_int_arr_if[8];
                    this.soLuong = var1_1;
                    return;
                }
                ++var1_1;
lbl39:
                // 2 sources

                ** while (!eh.boolean_do((int)var1_1, (int)this.mangSoNguyen.length))
            }
        }
    }

        static {
        eh.cfr_renamed_4();
    }

    private static void cfr_renamed_4() {
        var_int_arr_if = new int[24];
        eh.var_int_arr_if[0] = "  ".length();
        eh.var_int_arr_if[1] = 0xA2 ^ 0x92 ^ (0xC7 ^ 0x87);
        eh.var_int_arr_if[2] = 0xB1 ^ 0xAF ^ (0x35 ^ 0x1F);
        eh.var_int_arr_if[3] = 0x7D ^ 0x38 ^ (0x1F ^ 0x4A);
        eh.var_int_arr_if[4] = "   ".length();
        eh.var_int_arr_if[5] = 0xA8 ^ 0xB6;
        eh.var_int_arr_if[6] = 0xA0 ^ 0x9C;
        eh.var_int_arr_if[7] = 0x1E ^ 0x17;
        eh.var_int_arr_if[8] = (0xF8 ^ 0x95 ^ (0x56 ^ 0x5B)) & (0x9D ^ 0xB1 ^ (0xED ^ 0xA1) ^ -" ".length());
        eh.var_int_arr_if[9] = 0x19 ^ 0x7D;
        eh.var_int_arr_if[10] = " ".length();
        eh.var_int_arr_if[11] = -(0xFFFFEBB7 & 0x745E) & (0xFFFFFFFD & 0x63FF);
        eh.var_int_arr_if[12] = -(0xFFFF9DB6 & 0x72ED) & (0xFFFFB7BB & 0x7FF7);
        eh.var_int_arr_if[13] = -(0xFFFFFDE7 & 0x3A3F) & (0xFFFFFFFE & 0xFB77);
        eh.var_int_arr_if[14] = 0x4C ^ 0x48;
        eh.var_int_arr_if[15] = -(0xFFFF99FD & 0x6E5B) & (0xFFFFDEFC & 0x1AFFB);
        eh.var_int_arr_if[16] = 0x8C ^ 0x89;
        eh.var_int_arr_if[17] = -(0xFFFF9EFD & 0x6FDF) & (0xFFFFAFFF & 0x7FFFC);
        eh.var_int_arr_if[18] = 0x74 ^ 0x72;
        eh.var_int_arr_if[19] = -(0xFFFFFDF7 & 0x172D) & (0xFFFFF7F6 & 0xF5F6D);
        eh.var_int_arr_if[20] = 0x9D ^ 0x9A;
        eh.var_int_arr_if[21] = 0xFFFFFF5E & 0x4C4BE1;
        eh.var_int_arr_if[22] = 173 + 92 - 221 + 156 ^ 70 + 52 - 54 + 124;
        eh.var_int_arr_if[23] = -(0xFFFFAEBF & 0x796B) & (0xFFFFFEFF & 0x98BFAA);
    }
}

