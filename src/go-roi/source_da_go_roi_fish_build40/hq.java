/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class hq
extends fl_0 {
    private static int[] cfr_renamed_1;

    static {
        hq.cfr_renamed_2();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        bz.cfr_renamed_1(graphics, cfr_renamed_1[1], n, n2, cfr_renamed_1[2]);
    }

    private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[3];
        hq.cfr_renamed_1[0] = 0x62 ^ 0x6E;
        hq.cfr_renamed_1[1] = 1 ^ 0x76 ^ (0x4E ^ 7);
        hq.cfr_renamed_1[2] = "   ".length();
    }

    hq(String string) {
        super(string, cfr_renamed_1[0]);
    }
}

