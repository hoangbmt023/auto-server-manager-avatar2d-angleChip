/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class fq
implements cp {
    private static final int[] cfr_renamed_0;

    fq() {
    }

    static {
        fq.cfr_renamed_1();
    }

    public final void void_do() {
        Vector<bd_0> vector = new Vector<bd_0>();
        vector.addElement(new bd_0("choan.png", "Cho ăn", new ac(cfr_renamed_0[0])));
        vector.addElement(new bd_0("cum.png", "Thuốc cúm", new ac(cfr_renamed_0[1])));
        vector.addElement(new bd_0("tieuchay.png", "Thuốc tiêu chảy", new ac(cfr_renamed_0[2])));
        vector.addElement(new bd_0("thuocbo.png", "Thuốc bổ", new ac(cfr_renamed_0[3])));
        bF.cfr_renamed_0(vector);
    }

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[4];
        fq.cfr_renamed_0[0] = 8 ^ 0x7A ^ (0xE5 ^ 0x90);
        fq.cfr_renamed_0[1] = 0x41 ^ 0x4F;
        fq.cfr_renamed_0[2] = 0x41 ^ 0x4E;
        fq.cfr_renamed_0[3] = 0x10 ^ 0x6D ^ (0xC2 ^ 0xB6);
    }
}

