/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from dx
 */
final class dx_0
implements de {
    private static final int[] cfr_renamed_1;

        private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[1];
        dx_0.cfr_renamed_1[0] = (0x42 ^ 0x69 ^ (8 ^ 0x7C)) & (0x13 ^ 0x72 ^ (1 ^ 0x3F) ^ -" ".length());
    }

    dx_0() {
    }

    public final void void_do() {
        Vector<gt> vector = new Vector<gt>();
        Vector vector2 = dR.java_util_Vector_do();
        int n = vector2.size();
        int n2 = cfr_renamed_1[0];
        while ((n2 < n)) {
            ee_0 ee_02 = (ee_0)vector2.elementAt(n2);
            vector.addElement(new gt(ee_02.chuoiGiaTri + "(" + ee_02.soLuong + ")", new fy_0(ee_02), ee_02));
            ++n2;
            if (((0x9D ^ 0xAF ^ (0x7C ^ 0x6F)) & (0x45 ^ 0x21 ^ (0xE8 ^ 0xAD) ^ -" ".length())) == 0) continue;
            return;
        }
        if ((vector.size() > 0)) {
            dR.cfr_renamed_1(vector);
            return;
        }
        TienIchGame.cfr_renamed_1("Có", "Kho đã hết giống!\nVào cửa hàng mua thêm?", new bu_0());
    }

        static {
        dx_0.cfr_renamed_0();
    }
}

