/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from bG
 */
final class bg_0
implements de {
    private static final int[] cfr_renamed_1;

    public final void void_do() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new dz_0("Tưới nước", new cb(cfr_renamed_1[0]), cfr_renamed_1[1]));
        vector.addElement(new bj_0("sau.png", "Diệt sâu", new cb(cfr_renamed_1[2])));
        vector.addElement(new bj_0("co.png", "Diệt cỏ", new cb(cfr_renamed_1[3])));
        vector.addElement(new bj_0("bonphan.png", "Bón phân", new cb(cfr_renamed_1[4])));
        vector.addElement(new bj_0("gieohat.png", "Gieo hạt", new B()));
        dR.cfr_renamed_1(vector);
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[5];
        bg_0.cfr_renamed_1[0] = " ".length();
        bg_0.cfr_renamed_1[1] = (0xF7 ^ 0x9B ^ (0x14 ^ 0x38)) & (0x3B ^ 0x5B ^ (0x1B ^ 0x3B) ^ -" ".length());
        bg_0.cfr_renamed_1[2] = 27 + 41 - 34 + 111 ^ 12 + 137 - 112 + 120;
        bg_0.cfr_renamed_1[3] = 0xBD ^ 0xB0;
        bg_0.cfr_renamed_1[4] = 23 + 62 - 61 + 117 ^ 28 + 132 - 102 + 79;
    }

    static {
        bg_0.cfr_renamed_0();
    }

    bg_0() {
    }
}

