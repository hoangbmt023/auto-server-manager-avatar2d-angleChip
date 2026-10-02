/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from gL
 */
final class gl_0
implements de {
    private static final int[] cfr_renamed_1;

    public final void void_do() {
        Vector<bj_0> vector = new Vector<bj_0>();
        vector.addElement(new bj_0("choan.png", "Cho ăn", new cb(cfr_renamed_1[0])));
        vector.addElement(new bj_0("cum.png", "Thuốc cúm", new cb(cfr_renamed_1[1])));
        vector.addElement(new bj_0("tieuchay.png", "Thuốc tiêu chảy", new cb(cfr_renamed_1[2])));
        vector.addElement(new bj_0("thuocbo.png", "Thuốc bổ", new cb(cfr_renamed_1[3])));
        dR.cfr_renamed_1(vector);
    }

    static {
        gl_0.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[4];
        gl_0.cfr_renamed_1[0] = 0x73 ^ 0x74;
        gl_0.cfr_renamed_1[1] = 0x73 ^ 0x7D;
        gl_0.cfr_renamed_1[2] = 0xBB ^ 0xB4;
        gl_0.cfr_renamed_1[3] = 0x32 ^ 0x75 ^ (0x7F ^ 0x31);
    }

    gl_0() {
    }
}

