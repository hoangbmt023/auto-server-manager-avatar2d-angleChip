/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ci
extends q_0 {
    public byte cfr_renamed_3;
    private static int[] var_int_arr_if;
    public byte cfr_renamed_4;
    public byte[] var_byte_arr_do;
    public byte[] var_byte_arr_if;
    public short[] var_short_arr_do;

        public final void cfr_renamed_0(Graphics graphics, int n, int n2, int n3, int n4) {
        if ((this.var_short_do != var_int_arr_if[0])) {
            if ((this.var_short_do >= var_int_arr_if[1])) {
                an an2 = ci_0.an_do(this.var_short_arr_do[n]);
                if ((an2.soLuong != var_int_arr_if[0])) {
                    int n5;
                    Image image = an2.var_javax_microedition_lcdui_Image_do;
                    int n6 = var_int_arr_if[2];
                    int n7 = var_int_arr_if[2];
                    short s2 = an2.cfr_renamed_1;
                    short s3 = an2.var_short_do;
                    int n8 = n2 + this.var_byte_arr_if[n] * bn_0.cfr_renamed_6;
                    if ((n4 == bk_0.var_byte_case)) {
                        n5 = (this.var_byte_arr_if[n] * bn_0.cfr_renamed_6 << var_int_arr_if[3]) + an2.cfr_renamed_1;
                        if (" ".length() >= "  ".length()) {
                            return;
                        }
                    } else {
                        n5 = var_int_arr_if[2];
                    }
                    graphics.drawRegion(image, n6, n7, (int)s2, (int)s3, n4, n8 - n5, n3 + this.var_byte_arr_do[n] * bn_0.cfr_renamed_6, var_int_arr_if[2]);
                    return;
                }
            } else {
                int n9;
                bH bH2 = ci_0.var_bH_arr_do[this.var_short_arr_do[n]];
                short s4 = bH2.cfr_renamed_1;
                short s5 = bH2.cfr_renamed_4;
                short s6 = bH2.cfr_renamed_2;
                short s7 = bH2.cfr_renamed_5;
                short s8 = bH2.cfr_renamed_3;
                int n10 = n2 + this.var_byte_arr_if[n] * bn_0.cfr_renamed_6;
                if ((n4 == bk_0.var_byte_case)) {
                    n9 = (this.var_byte_arr_if[n] * bn_0.cfr_renamed_6 << var_int_arr_if[3]) + bH2.cfr_renamed_5 * bn_0.cfr_renamed_6;
                    if (((0x7B ^ 0x35) & ~(0x1F ^ 0x51)) == "  ".length()) {
                        return;
                    }
                } else {
                    n9 = var_int_arr_if[2];
                }
                ci_0.cfr_renamed_0(graphics, s4, s5, s6, s7, s8, n10 - n9, n3 + this.var_byte_arr_do[n] * bn_0.cfr_renamed_6, n4);
            }
        }
    }

        static {
        ci.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        var_int_arr_if = new int[4];
        ci.var_int_arr_if[0] = -" ".length();
        ci.var_int_arr_if[1] = 0xFFFFEFD7 & 0x17F8;
        ci.var_int_arr_if[2] = (0xCE ^ 0x87) & ~(0x70 ^ 0x39);
        ci.var_int_arr_if[3] = " ".length();
    }

    }

