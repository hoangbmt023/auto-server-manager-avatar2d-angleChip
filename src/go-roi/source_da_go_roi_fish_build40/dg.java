/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class dg
extends fl_0 {
    private static int[] cfr_renamed_1;

    private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[2];
        dg.cfr_renamed_1[0] = "  ".length();
        dg.cfr_renamed_1[1] = "   ".length();
    }

    dg(String string) {
        super(string, cfr_renamed_1[0]);
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        graphics.drawImage(dR.var_javax_microedition_lcdui_Image_for, n, n2, cfr_renamed_1[1]);
    }

    static {
        dg.cfr_renamed_2();
    }
}

