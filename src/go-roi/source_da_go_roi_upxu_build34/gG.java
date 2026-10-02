/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class gG
extends ei {
    private static int[] cfr_renamed_0;

    static {
        gG.cfr_renamed_3();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        bF.var_ep_if.cfr_renamed_0(cfr_renamed_0[0], n, n2, cfr_renamed_0[1], cfr_renamed_0[2], graphics);
    }

    gG(String string, cp cp2) {
        super(string, cp2);
    }

    private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[3];
        gG.cfr_renamed_0[0] = " ".length();
        gG.cfr_renamed_0[1] = (0xB6 ^ 0xBD ^ (0xF5 ^ 0xBD)) & (0x60 ^ 0x10 ^ (0x5C ^ 0x6F) ^ -" ".length());
        gG.cfr_renamed_0[2] = "   ".length();
    }
}

