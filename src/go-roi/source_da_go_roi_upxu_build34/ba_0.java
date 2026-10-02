/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from bA
 */
final class ba_0
implements cp {
    private static final int[] cfr_renamed_0;

    static {
        ba_0.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[5];
        ba_0.cfr_renamed_0[0] = " ".length();
        ba_0.cfr_renamed_0[1] = (0x71 ^ 0x4D ^ (0x8A ^ 0x90)) & (56 + 102 - 91 + 107 ^ 131 + 131 - 243 + 117 ^ -" ".length());
        ba_0.cfr_renamed_0[2] = 0x44 ^ 0x48;
        ba_0.cfr_renamed_0[3] = 0x32 ^ 0x3F;
        ba_0.cfr_renamed_0[4] = 129 + 22 - 49 + 61 ^ 56 + 80 - 30 + 61;
    }

    ba_0() {
    }

    public final void void_do() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new dz_0("Tưới nước", new ac(cfr_renamed_0[0]), cfr_renamed_0[1]));
        vector.addElement(new bd_0("sau.png", "Diệt sâu", new ac(cfr_renamed_0[2])));
        vector.addElement(new bd_0("co.png", "Diệt cỏ", new ac(cfr_renamed_0[3])));
        vector.addElement(new bd_0("bonphan.png", "Bón phân", new ac(cfr_renamed_0[4])));
        vector.addElement(new bd_0("gieohat.png", "Gieo hạt", new bx_0()));
        bF.cfr_renamed_0(vector);
    }
}

