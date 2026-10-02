/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class cq
extends ei {
    private static int[] cfr_renamed_0;

    cq(String string) {
        super(string, cfr_renamed_0[0]);
    }

    static {
        cq.cfr_renamed_3();
    }

    private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[2];
        cq.cfr_renamed_0[0] = "  ".length();
        cq.cfr_renamed_0[1] = "   ".length();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        graphics.drawImage(bF.var_javax_microedition_lcdui_Image_if, n, n2, cfr_renamed_0[1]);
    }
}

