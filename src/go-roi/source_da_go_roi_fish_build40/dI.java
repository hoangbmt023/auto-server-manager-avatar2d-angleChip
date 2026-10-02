/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class dI
extends fl_0 {
    private final short cfr_renamed_0;
    private static int[] cfr_renamed_1;

    private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[1];
        dI.cfr_renamed_1[0] = "   ".length();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        aa_0.cfr_renamed_1(graphics, this.cfr_renamed_0, n, n2, cfr_renamed_1[0]);
    }

    dI(String string, de de2, short s2) {
        super(string, de2);
        this.cfr_renamed_0 = s2;
    }

    static {
        dI.cfr_renamed_2();
    }
}

