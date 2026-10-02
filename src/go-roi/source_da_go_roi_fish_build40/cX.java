/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cX
extends am {
    public byte cfr_renamed_2;
    public byte cfr_renamed_3;
    public byte[] var_byte_arr_do;
    private static int[] var_int_arr_if;
    public byte[] var_byte_arr_if;
    public short[] var_short_arr_do;

        public final void cfr_renamed_1(Graphics graphics, int n, int n2, int n3, int n4) {
        if (cX.cfr_renamed_0(((am)this).cfr_renamed_3, var_int_arr_if[0])) {
            if (cX.cfr_renamed_2(((am)this).cfr_renamed_3, var_int_arr_if[1])) {
                d_0 d_02 = aa_0.d_0_do(this.var_short_arr_do[n]);
                if ((d_02.soLuong != var_int_arr_if[0])) {
                    int n5;
                    Image image = d_02.var_javax_microedition_lcdui_Image_do;
                    int n6 = var_int_arr_if[2];
                    int n7 = var_int_arr_if[2];
                    short s2 = d_02.var_short_do;
                    short s3 = d_02.cfr_renamed_0;
                    int n8 = n2 + this.var_byte_arr_if[n] * dF.cfr_renamed_12;
                    if ((n4 == dd_0.var_byte_try)) {
                        n5 = (this.var_byte_arr_if[n] * dF.cfr_renamed_12 << var_int_arr_if[3]) + d_02.var_short_do;
                        if ("  ".length() == (7 + 93 - -3 + 25 ^ 131 + 102 - 214 + 113)) {
                            return;
                        }
                    } else {
                        n5 = var_int_arr_if[2];
                    }
                    graphics.drawRegion(image, n6, n7, (int)s2, (int)s3, n4, n8 - n5, n3 + this.var_byte_arr_do[n] * dF.cfr_renamed_12, var_int_arr_if[2]);
                    return;
                }
            } else {
                int n9;
                k_0 k_02 = aa_0.var_k_0_arr_do[this.var_short_arr_do[n]];
                short s4 = k_02.cfr_renamed_3;
                short s5 = k_02.var_short_do;
                short s6 = k_02.cfr_renamed_0;
                short s7 = k_02.cfr_renamed_4;
                short s8 = k_02.cfr_renamed_5;
                int n10 = n2 + this.var_byte_arr_if[n] * dF.cfr_renamed_12;
                if ((n4 == dd_0.var_byte_try)) {
                    n9 = (this.var_byte_arr_if[n] * dF.cfr_renamed_12 << var_int_arr_if[3]) + k_02.cfr_renamed_4 * dF.cfr_renamed_12;
                    if (((1 ^ 0x1B ^ (0x9C ^ 0x8F)) & (92 + 93 - 40 + 3 ^ 1 + 4 - -6 + 146 ^ -" ".length())) > " ".length()) {
                        return;
                    }
                } else {
                    n9 = var_int_arr_if[2];
                }
                aa_0.cfr_renamed_1(graphics, s4, s5, s6, s7, s8, n10 - n9, n3 + this.var_byte_arr_do[n] * dF.cfr_renamed_12, n4);
            }
        }
    }

            static {
        cX.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        var_int_arr_if = new int[4];
        cX.var_int_arr_if[0] = -" ".length();
        cX.var_int_arr_if[1] = -(0xFFFFD44F & 0x6BBE) & (0xFFFFE7DF & 0x5FFD);
        cX.var_int_arr_if[2] = (0x35 ^ 7) & ~(0xB4 ^ 0x86);
        cX.var_int_arr_if[3] = " ".length();
    }
}

