/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class eo
extends fl_0 {
    private static int[] cfr_renamed_1;

    static {
        eo.cfr_renamed_2();
    }

    eo(String string, de de2) {
        super(string, de2);
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        dR.var_cu_0_try.cfr_renamed_1(cfr_renamed_1[0], n, n2, cfr_renamed_1[1], cfr_renamed_1[2], graphics);
    }

    private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[3];
        eo.cfr_renamed_1[0] = " ".length();
        eo.cfr_renamed_1[1] = (0x89 ^ 0x8C) & ~(0x1A ^ 0x1F);
        eo.cfr_renamed_1[2] = "   ".length();
    }
}

