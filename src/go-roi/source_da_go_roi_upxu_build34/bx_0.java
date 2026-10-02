/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from bX
 */
final class bx_0
implements cp {
    private static final int[] cfr_renamed_0;

            private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[1];
        bx_0.cfr_renamed_0[0] = (58 + 121 - 111 + 111 ^ 107 + 75 - 31 + 34) & (" ".length() ^ (0xB8 ^ 0xB3) ^ -" ".length());
    }

    bx_0() {
    }

    static {
        bx_0.cfr_renamed_1();
    }

    public final void void_do() {
        Vector<fr_0> vector = new Vector<fr_0>();
        Vector vector2 = bF.java_util_Vector_do();
        int n = vector2.size();
        int n2 = cfr_renamed_0[0];
        while ((n2 < n)) {
            gd gd2 = (gd)vector2.elementAt(n2);
            vector.addElement(new fr_0(gd2.chuoiGiaTri + "(" + gd2.soLuong + ")", new eo(gd2.var_short_do), gd2));
            ++n2;
            if ("   ".length() >= ((0xC6 ^ 0x9F ^ (0xB4 ^ 0xAD)) & (0xDC ^ 0xBD ^ (0x7E ^ 0x5F) ^ -" ".length()))) continue;
            return;
        }
        if ((vector.size() > 0)) {
            bF.cfr_renamed_0(vector);
            return;
        }
        TienIchGame.cfr_renamed_0("Có", "Kho đã hết giống!\nVào cửa hàng mua thêm?", new bo_0());
    }
}

