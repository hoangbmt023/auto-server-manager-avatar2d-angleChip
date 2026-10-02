/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class eg
extends fl_0 {
    private static int[] cfr_renamed_1;

    eg(String string) {
        super(string, cfr_renamed_1[0]);
    }

    private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[3];
        eg.cfr_renamed_1[0] = 0x46 ^ 0x4D;
        eg.cfr_renamed_1[1] = 0x83 ^ 0xC2;
        eg.cfr_renamed_1[2] = "   ".length();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        bz.cfr_renamed_1(graphics, cfr_renamed_1[1], n, n2, cfr_renamed_1[2]);
    }

    static {
        eg.cfr_renamed_2();
    }
}

