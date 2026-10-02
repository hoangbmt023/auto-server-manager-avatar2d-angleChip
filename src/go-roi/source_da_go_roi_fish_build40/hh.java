/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class hh
extends fl_0 {
    private static int[] cfr_renamed_1;

    static {
        hh.cfr_renamed_2();
    }

    hh(String string) {
        super(string, cfr_renamed_1[0]);
    }

    private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[4];
        hh.cfr_renamed_1[0] = 0xC7 ^ 0x9D ^ (0xFC ^ 0xAB);
        hh.cfr_renamed_1[1] = 0x61 ^ 0x5E ^ 67 + 68 - 67 + 59;
        hh.cfr_renamed_1[2] = 4 ^ 0 ^ (0x56 ^ 0x6D);
        hh.cfr_renamed_1[3] = "   ".length();
    }

        public final void (Graphics graphics, int n, int n2 > 0) {
        int n3;
        if ((dR.var_e_0_do.soLuong > 0)) {
            n3 = cfr_renamed_1[1];
            if (-"  ".length() > 0) {
                return;
            }
        } else {
            n3 = cfr_renamed_1[2];
        }
        bz.cfr_renamed_1(graphics, n3, n, n2, cfr_renamed_1[3]);
    }
}

