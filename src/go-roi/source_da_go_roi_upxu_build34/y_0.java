/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from Y
 */
final class y_0
implements cp {
    private static final int[] cfr_renamed_0;

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[4];
        y_0.cfr_renamed_0[0] = (41 + 71 - 26 + 134 ^ 119 + 48 - 163 + 127) & (233 + 115 - 166 + 64 ^ 2 + 151 - -11 + 5 ^ -" ".length());
        y_0.cfr_renamed_0[1] = 0xFF ^ 0x90;
        y_0.cfr_renamed_0[2] = 0xEF ^ 0x9F;
        y_0.cfr_renamed_0[3] = 0x74 ^ 0x70;
    }

    public final void void_do() {
        Vector<dF> vector = new Vector<dF>();
        Vector vector2 = bF.var_java_util_Vector_do;
        int n = cfr_renamed_0[0];
        while ((n < vector2.size())) {
            gd gd2 = (gd)vector2.elementAt(n);
            if (!(gd2.var_short_do != cfr_renamed_0[1]) || (gd2.var_short_do == cfr_renamed_0[2])) {
                ff ff2 = bF.ff_do(gd2.var_short_do);
                vector.addElement(new dF(ff2.chuoiGiaTri + "(" + gd2.soLuong + ")", new AutoFarm(cfr_renamed_0[3], gd2), ff2));
            }
            ++n;
            if (-" ".length() < "  ".length()) continue;
            return;
        }
        if ((vector.size() > 0)) {
            bF.cfr_renamed_0(vector);
            return;
        }
        TienIchGame.cfr_renamed_0("Có", "Kho đã hết phân bón\nBạn có muốn mua thêm?", new bo_0());
    }

    static {
        y_0.cfr_renamed_1();
    }

                    y_0() {
    }
}

