/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from O
 */
public final class o_0
extends am {
    private static int[] cfr_renamed_0;
    public short cfr_renamed_1;

    public final void cfr_renamed_1(Graphics graphics, int n, int n2, int n3) {
        Object object = (cX)aa_0.am_do(this.cfr_renamed_2);
        if (o_0.cfr_renamed_1(this.var_short_if, ((cX)object).var_short_arr_do[cfr_renamed_0[0]])) {
            object = aa_0.var_k_0_arr_do[((cX)object).var_short_arr_do[cfr_renamed_0[0]]];
            graphics.drawRegion(aa_0.hr_do((int)this.cfr_renamed_1).var_javax_microedition_lcdui_Image_do, ((k_0)object).var_short_do * dF.cfr_renamed_12, ((k_0)object).cfr_renamed_0 * dF.cfr_renamed_12, ((k_0)object).cfr_renamed_4 * dF.cfr_renamed_12, ((k_0)object).cfr_renamed_5 * dF.cfr_renamed_12, cfr_renamed_0[0], n, n2, n3);
            return;
        }
        ((am)object).cfr_renamed_0(graphics, n, n2, n3);
    }

        public final void cfr_renamed_1(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5;
        cX cX2 = (cX)aa_0.am_do(this.cfr_renamed_2);
        k_0 k_02 = aa_0.var_k_0_arr_do[cX2.var_short_arr_do[n]];
        short s2 = k_02.var_short_do;
        short s3 = k_02.cfr_renamed_0;
        short s4 = k_02.cfr_renamed_4;
        short s5 = k_02.cfr_renamed_5;
        int n6 = n2 + cX2.var_byte_arr_if[n] * dF.cfr_renamed_12;
        if ((n4 == dd_0.var_byte_try)) {
            n5 = (cX2.var_byte_arr_if[n] * dF.cfr_renamed_12 << cfr_renamed_0[1]) + k_02.cfr_renamed_4 * dF.cfr_renamed_12;
            if (-"  ".length() >= 0) {
                return;
            }
        } else {
            n5 = cfr_renamed_0[0];
        }
        aa_0.cfr_renamed_1(graphics, this.cfr_renamed_1, s2, s3, s4, s5, n6 - n5, n3 + cX2.var_byte_arr_do[n] * dF.cfr_renamed_12, n4);
    }

    static {
        o_0.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[2];
        o_0.cfr_renamed_0[0] = "   ".length() & ~"   ".length();
        o_0.cfr_renamed_0[1] = " ".length();
    }
}

