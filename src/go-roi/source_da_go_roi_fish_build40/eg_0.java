/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from eG
 */
final class eg_0
implements de {
    private static int[] cfr_renamed_1;

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[3];
        eg_0.cfr_renamed_1[0] = 0xFA ^ 0x8E ^ (0xF6 ^ 0x8C);
        eg_0.cfr_renamed_1[1] = 0x1E ^ 0x11;
        eg_0.cfr_renamed_1[2] = (0x83 ^ 0xBE) & ~(0xA6 ^ 0x9B);
    }

    eg_0() {
    }

    public final void void_do() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(MenuChinhAvatar.bj, cfr_renamed_1[0]));
        vector.addElement(new fl_0(MenuChinhAvatar.bs, cfr_renamed_1[1]));
        aq.cfr_renamed_1().cfr_renamed_1(vector, cfr_renamed_1[2]);
    }

    static {
        eg_0.cfr_renamed_0();
    }
}

