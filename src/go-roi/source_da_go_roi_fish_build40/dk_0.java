/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from dK
 */
final class dk_0
extends fl_0 {
    private static int[] cfr_renamed_1;

    private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[3];
        dk_0.cfr_renamed_1[0] = 0x7B ^ 0x6A ^ (0x1E ^ 4);
        dk_0.cfr_renamed_1[1] = 0xCE ^ 0x8F;
        dk_0.cfr_renamed_1[2] = "   ".length();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        bz.cfr_renamed_1(graphics, cfr_renamed_1[1], n, n2, cfr_renamed_1[2]);
    }

    dk_0(String string) {
        super(string, cfr_renamed_1[0]);
    }

    static {
        dk_0.cfr_renamed_2();
    }
}

