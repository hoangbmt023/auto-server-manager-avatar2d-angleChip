/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class D
implements de {
    private static final int[] cfr_renamed_1;

    public final void void_do() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new dz_0("Tưới nước", new AutoFarm(cfr_renamed_1[0], null), cfr_renamed_1[1]));
        vector.addElement(new dz_0("Làm đất", new AutoFarm(cfr_renamed_1[2], null), cfr_renamed_1[0]));
        vector.addElement(new bj_0("gieohat.png", "Gieo hạt", new dx_0()));
        vector.addElement(new bj_0("sauco.png", "Diệt sâu cỏ", new AutoFarm(cfr_renamed_1[3], null)));
        vector.addElement(new bj_0("bonphan.png", "Bón phân", new au_0()));
        vector.addElement(new bj_0("thuhoach.png", "Thu hoạch", new AutoFarm(cfr_renamed_1[4], null)));
        dR.cfr_renamed_1(vector);
    }

    static {
        D.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[5];
        D.cfr_renamed_1[0] = " ".length();
        D.cfr_renamed_1[1] = (0x8F ^ 0xA1) & ~(0xAD ^ 0x83);
        D.cfr_renamed_1[2] = -"  ".length();
        D.cfr_renamed_1[3] = 0xBB ^ 0xBE;
        D.cfr_renamed_1[4] = 0x13 ^ 0x6A ^ 21 + 117 - 63 + 52;
    }

    D() {
    }
}

