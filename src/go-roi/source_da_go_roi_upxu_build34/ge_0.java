/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from ge
 */
final class ge_0
extends ei {
    private static int[] cfr_renamed_0;

    public final void (Graphics graphics, int n, int n2 > 0) {
        int n3;
        if ((bF.var_by_do.soLuong > 0)) {
            n3 = cfr_renamed_0[1];
            if (((10 + 90 - 45 + 98 ^ 12 + 40 - -54 + 23) & (0x2D ^ 0x1F ^ (0x2D ^ 7) ^ -" ".length())) < 0) {
                return;
            }
        } else {
            n3 = cfr_renamed_0[2];
        }
        ak_0.cfr_renamed_0(graphics, n3, n, n2, cfr_renamed_0[3]);
    }

        private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[4];
        ge_0.cfr_renamed_0[0] = 0xC3 ^ 0xB7 ^ (0xCD ^ 0xB4);
        ge_0.cfr_renamed_0[1] = 0xC9 ^ 0x89;
        ge_0.cfr_renamed_0[2] = 0xA ^ 0x35;
        ge_0.cfr_renamed_0[3] = "   ".length();
    }

    static {
        ge_0.cfr_renamed_3();
    }

    ge_0(String string) {
        super(string, cfr_renamed_0[0]);
    }
}

