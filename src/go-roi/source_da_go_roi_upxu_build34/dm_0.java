/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from dM
 */
final class dm_0
extends ei {
    private static int[] cfr_renamed_0;

    private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[3];
        dm_0.cfr_renamed_0[0] = " ".length();
        dm_0.cfr_renamed_0[1] = (0x42 ^ 0x5C) & ~(0x53 ^ 0x4D);
        dm_0.cfr_renamed_0[2] = "   ".length();
    }

    dm_0(String string, cp cp2) {
        super(string, cp2);
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        bF.var_ep_if.cfr_renamed_0(cfr_renamed_0[0], n, n2, cfr_renamed_0[1], cfr_renamed_0[2], graphics);
    }

    static {
        dm_0.cfr_renamed_3();
    }
}

