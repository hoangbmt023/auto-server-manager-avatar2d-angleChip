/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class gf
implements cp {
    private static int[] cfr_renamed_0;

    public final void void_do() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.bw, cfr_renamed_0[0]));
        vector.addElement(new ei(MenuChinhAvatar.b, cfr_renamed_0[1]));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, cfr_renamed_0[2]);
    }

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[3];
        gf.cfr_renamed_0[0] = 0xCB ^ 0x84 ^ (0xC ^ 0x4D);
        gf.cfr_renamed_0[1] = 6 ^ 0x33 ^ (0x9A ^ 0xA0);
        gf.cfr_renamed_0[2] = (0xC6 ^ 0x94) & ~(0x56 ^ 4);
    }

    static {
        gf.cfr_renamed_1();
    }

    gf() {
    }
}

