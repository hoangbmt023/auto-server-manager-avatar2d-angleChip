/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class fj
extends ei {
    private static int[] cfr_renamed_0;

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ak_0.cfr_renamed_0(graphics, cfr_renamed_0[1], n, n2, cfr_renamed_0[2]);
    }

    fj(String string) {
        super(string, cfr_renamed_0[0]);
    }

    private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[3];
        fj.cfr_renamed_0[0] = 0x64 ^ 0x6F;
        fj.cfr_renamed_0[1] = 150 + 60 - 83 + 67 ^ 90 + 52 - 121 + 110;
        fj.cfr_renamed_0[2] = "   ".length();
    }

    static {
        fj.cfr_renamed_3();
    }
}

