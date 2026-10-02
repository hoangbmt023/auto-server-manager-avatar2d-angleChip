/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from fO
 */
final class fo_0
extends fl_0 {
    private static int[] cfr_renamed_1;

    static {
        fo_0.cfr_renamed_2();
    }

    fo_0(String string) {
        super(string, cfr_renamed_1[0]);
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        dR.var_cu_0_try.cfr_renamed_1(cfr_renamed_1[1], n, n2, cfr_renamed_1[1], cfr_renamed_1[2], graphics);
    }

    private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[3];
        fo_0.cfr_renamed_1[0] = " ".length();
        fo_0.cfr_renamed_1[1] = (0x6C ^ 0x2E) & ~(0x18 ^ 0x5A);
        fo_0.cfr_renamed_1[2] = "   ".length();
    }
}

