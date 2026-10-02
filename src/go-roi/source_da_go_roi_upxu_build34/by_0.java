/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from bY
 */
final class by_0
implements cp {
    private static final int[] cfr_renamed_0;

    public final void void_do() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new dz_0("Tưới nước", new AutoFarm(cfr_renamed_0[0], null), cfr_renamed_0[1]));
        vector.addElement(new dz_0("Làm đất", new AutoFarm(cfr_renamed_0[2], null), cfr_renamed_0[0]));
        vector.addElement(new bd_0("gieohat.png", "Gieo hạt", new dx_0()));
        vector.addElement(new bd_0("sauco.png", "Diệt sâu cỏ", new AutoFarm(cfr_renamed_0[3], null)));
        vector.addElement(new bd_0("bonphan.png", "Bón phân", new y_0()));
        vector.addElement(new bd_0("thuhoach.png", "Thu hoạch", new AutoFarm(cfr_renamed_0[4], null)));
        bF.cfr_renamed_0(vector);
    }

    by_0() {
    }

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[5];
        by_0.cfr_renamed_0[0] = " ".length();
        by_0.cfr_renamed_0[1] = (0x32 ^ 0x26) & ~(0x4E ^ 0x5A);
        by_0.cfr_renamed_0[2] = -"  ".length();
        by_0.cfr_renamed_0[3] = 0xA8 ^ 0xC4 ^ (0xE ^ 0x67);
        by_0.cfr_renamed_0[4] = 0xA1 ^ 0x83 ^ (0x59 ^ 0x7D);
    }

    static {
        by_0.cfr_renamed_1();
    }
}

