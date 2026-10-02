/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bN
extends q_0 {
    public short cfr_renamed_4;
    private static int[] cfr_renamed_1;

    public final void cfr_renamed_1(Graphics graphics, int n, int n2, int n3) {
        Object object = (ci)ci_0.q_0_do(this.cfr_renamed_3);
        if (bN.cfr_renamed_0(this.var_short_if, ((ci)object).var_short_arr_do[cfr_renamed_1[0]])) {
            object = ci_0.var_bH_arr_do[((ci)object).var_short_arr_do[cfr_renamed_1[0]]];
            graphics.drawRegion(ci_0.gy_0_do((int)this.cfr_renamed_4).var_javax_microedition_lcdui_Image_do, ((bH)object).cfr_renamed_4 * bn_0.cfr_renamed_6, ((bH)object).cfr_renamed_2 * bn_0.cfr_renamed_6, ((bH)object).cfr_renamed_5 * bn_0.cfr_renamed_6, ((bH)object).cfr_renamed_3 * bn_0.cfr_renamed_6, cfr_renamed_1[0], n, n2, n3);
            return;
        }
        ((q_0)object).cfr_renamed_0(graphics, n, n2, n3);
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[2];
        bN.cfr_renamed_1[0] = (0x49 ^ 0x59 ^ (0x39 ^ 0x7B)) & (0x2A ^ 0x32 ^ (0xD6 ^ 0x9C) ^ -" ".length());
        bN.cfr_renamed_1[1] = " ".length();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5;
        ci ci2 = (ci)ci_0.q_0_do(this.cfr_renamed_3);
        bH bH2 = ci_0.var_bH_arr_do[ci2.var_short_arr_do[n]];
        short s2 = bH2.cfr_renamed_4;
        short s3 = bH2.cfr_renamed_2;
        short s4 = bH2.cfr_renamed_5;
        short s5 = bH2.cfr_renamed_3;
        int n6 = n2 + ci2.var_byte_arr_if[n] * bn_0.cfr_renamed_6;
        if ((n4 == bk_0.var_byte_case)) {
            n5 = (ci2.var_byte_arr_if[n] * bn_0.cfr_renamed_6 << cfr_renamed_1[1]) + bH2.cfr_renamed_5 * bn_0.cfr_renamed_6;
            if ("   ".length() < ((0x42 ^ 0x6B) & ~(0x15 ^ 0x3C))) {
                return;
            }
        } else {
            n5 = cfr_renamed_1[0];
        }
        ci_0.cfr_renamed_0(graphics, this.cfr_renamed_4, s2, s3, s4, s5, n6 - n5, n3 + ci2.var_byte_arr_do[n] * bn_0.cfr_renamed_6, n4);
    }

        static {
        bN.cfr_renamed_0();
    }
}

