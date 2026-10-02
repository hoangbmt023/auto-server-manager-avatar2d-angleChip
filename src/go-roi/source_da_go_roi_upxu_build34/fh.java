/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class fh
extends ei {
    private final short cfr_renamed_1;
    private static int[] cfr_renamed_0;

    private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[1];
        fh.cfr_renamed_0[0] = "   ".length();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ci_0.cfr_renamed_0(graphics, this.cfr_renamed_1, n, n2, cfr_renamed_0[0]);
    }

    fh(String string, cp cp2, short s2) {
        super(string, cp2);
        this.cfr_renamed_1 = s2;
    }

    static {
        fh.cfr_renamed_3();
    }
}

