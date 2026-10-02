/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from gX
 */
final class gx_0
extends fl_0 {
    private static int[] cfr_renamed_1;

    static {
        gx_0.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[3];
        gx_0.cfr_renamed_1[0] = " ".length();
        gx_0.cfr_renamed_1[1] = (0xAF ^ 0x9B) & ~(0x4B ^ 0x7F);
        gx_0.cfr_renamed_1[2] = "   ".length();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        dR.var_cu_0_try.cfr_renamed_1(cfr_renamed_1[0], n, n2, cfr_renamed_1[1], cfr_renamed_1[2], graphics);
    }

    gx_0(String string, de de2) {
        super(string, de2);
    }
}

