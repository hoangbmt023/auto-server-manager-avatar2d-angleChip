/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class B
implements de {
    private static final int[] cfr_renamed_1;

    public final void void_do() {
        Vector<gt> vector = new Vector<gt>();
        Vector vector2 = dR.java_util_Vector_do();
        int n = vector2.size();
        int n2 = cfr_renamed_1[0];
        while ((n2 < n)) {
            ee_0 ee_02 = (ee_0)vector2.elementAt(n2);
            vector.addElement(new gt(ee_02.chuoiGiaTri + "(" + ee_02.soLuong + ")", new fr_0(ee_02.var_short_if), ee_02));
            ++n2;
            if (-"  ".length() < 0) continue;
            return;
        }
        if ((vector.size() > 0)) {
            dR.cfr_renamed_1(vector);
            return;
        }
        TienIchGame.cfr_renamed_1("Có", "Kho đã hết giống!\nVào cửa hàng mua thêm?", new bu_0());
    }

    static {
        B.cfr_renamed_0();
    }

    B() {
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[1];
        B.cfr_renamed_1[0] = (0xBD ^ 0x9F) & ~(0x32 ^ 0x10);
    }

        }

