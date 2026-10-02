/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from au
 */
final class au_0
implements de {
    private static final int[] cfr_renamed_1;

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[4];
        au_0.cfr_renamed_1[0] = (0x29 ^ 0x1D ^ (0x17 ^ 0x75)) & ((0x67 ^ 0x31) & ~(0xDB ^ 0x8D) ^ (0xF6 ^ 0xA0) ^ -" ".length());
        au_0.cfr_renamed_1[1] = 0x5F ^ 0xA ^ (0xB5 ^ 0x8F);
        au_0.cfr_renamed_1[2] = 183 + 196 - 256 + 118 ^ 61 + 20 - -42 + 6;
        au_0.cfr_renamed_1[3] = 0x8F ^ 0x8B;
    }

        public final void void_do() {
        Vector<eh> vector = new Vector<eh>();
        Vector vector2 = dR.var_java_util_Vector_try;
        int n = cfr_renamed_1[0];
        while ((n < vector2.size())) {
            ee_0 ee_02 = (ee_0)vector2.elementAt(n);
            if (!(ee_02.var_short_if != cfr_renamed_1[1]) || (ee_02.var_short_if == cfr_renamed_1[2])) {
                dg_0 dg_02 = dR.dg_0_do(ee_02.var_short_if);
                vector.addElement(new eh(dg_02.chuoiGiaTri + "(" + ee_02.soLuong + ")", new AutoFarm(cfr_renamed_1[3], ee_02), dg_02));
            }
            ++n;
            return;
        }
        if ((vector.size() > 0)) {
            dR.cfr_renamed_1(vector);
            return;
        }
        TienIchGame.cfr_renamed_1("Có", "Kho đã hết phân bón\nBạn có muốn mua thêm?", new bu_0());
    }

                static {
        au_0.cfr_renamed_0();
    }

    au_0() {
    }
}

