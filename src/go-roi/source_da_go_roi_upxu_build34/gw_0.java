/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from gw
 */
final class gw_0
extends ei {
    private static int[] cfr_renamed_0;

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ak_0.cfr_renamed_0(graphics, cfr_renamed_0[1], n, n2, cfr_renamed_0[2]);
    }

    private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[3];
        gw_0.cfr_renamed_0[0] = 0xCE ^ 0xC2;
        gw_0.cfr_renamed_0[1] = 107 + 158 - 229 + 127 ^ 62 + 101 - 36 + 30;
        gw_0.cfr_renamed_0[2] = "   ".length();
    }

    static {
        gw_0.cfr_renamed_3();
    }

    gw_0(String string) {
        super(string, cfr_renamed_0[0]);
    }
}

