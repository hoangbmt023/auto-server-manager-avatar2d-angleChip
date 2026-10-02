/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from dx
 */
final class dx_0
implements cp {
    private static final int[] cfr_renamed_0;

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[1];
        dx_0.cfr_renamed_0[0] = (0x40 ^ 0x6E) & ~(0x5A ^ 0x74);
    }

        public final void void_do() {
        Vector<fr_0> vector = new Vector<fr_0>();
        Vector vector2 = bF.java_util_Vector_do();
        int n = vector2.size();
        int n2 = cfr_renamed_0[0];
        while ((n2 < n)) {
            gd gd2 = (gd)vector2.elementAt(n2);
            vector.addElement(new fr_0(gd2.chuoiGiaTri + "(" + gd2.soLuong + ")", new gv_0(gd2), gd2));
            ++n2;
            if (" ".length() > -" ".length()) continue;
            return;
        }
        if ((vector.size() > 0)) {
            bF.cfr_renamed_0(vector);
            return;
        }
        TienIchGame.cfr_renamed_0("Có", "Kho đã hết giống!\nVào cửa hàng mua thêm?", new bo_0());
    }

    static {
        dx_0.cfr_renamed_1();
    }

        dx_0() {
    }
}

