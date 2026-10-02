/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class gQ
extends ei {
    private static int[] cfr_renamed_0;

    private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[3];
        gQ.cfr_renamed_0[0] = " ".length();
        gQ.cfr_renamed_0[1] = (95 + 34 - -37 + 74 ^ 49 + 95 - 49 + 49) & (106 + 16 - 80 + 85 ^ (0xB4 ^ 0xAB) ^ -" ".length());
        gQ.cfr_renamed_0[2] = "   ".length();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        bF.var_ep_if.cfr_renamed_0(cfr_renamed_0[1], n, n2, cfr_renamed_0[1], cfr_renamed_0[2], graphics);
    }

    gQ(String string) {
        super(string, cfr_renamed_0[0]);
    }

    static {
        gQ.cfr_renamed_3();
    }
}

