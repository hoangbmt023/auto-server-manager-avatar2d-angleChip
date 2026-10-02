/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class F
extends gK {
    private Vector var_java_util_Vector_do;
    private static final int[] mangSoNguyen;

        static {
        F.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        0 = (0xEE ^ 0xBE) & ~(0xEB ^ 0xBB);
        30 = 0x36 ^ 0x26 ^ (0x34 ^ 0x3A);
        40 = 64 + 62 - 17 + 40 ^ 4 + 122 - 119 + 182;
    }

    private void (Vector vector != null) {
        Vector<cg> vector2 = new Vector<cg>();
        int n = 0;
        while ((n < this.var_java_util_Vector_do.size())) {
            cg cg2 = (cg)this.var_java_util_Vector_do.elementAt(n);
            am am2 = aa_0.am_do(cg2.var_short_do);
            if ((am2 != null) && (am2.var_byte_if != 30) && (am2.var_byte_if != 40)) {
                vector2.addElement(cg2);
            }
            ++n;
            if ("   ".length() > " ".length()) continue;
            return;
        }
        if ((fo.var_int_try < vector2.size())) {
            cg cg3 = (cg)vector2.elementAt(fo.var_int_try);
            if (!(dy_0.cfr_renamed_0(cg3.var_short_do)) && !(dy_0.cfr_renamed_1(cg3.var_short_do))) {
                vector.addElement(new fl_0("Thêm vào d.s tự dùng", new ei(cg3.var_short_do)));
                if ((0xE ^ 0xA) != (0x92 ^ 0x96)) {
                    return;
                }
            } else if ((dy_0.cfr_renamed_0(cg3.var_short_do) ? 1 : 0 != null)) {
                vector.addElement(new fl_0("Xóa khỏi d.s tự dùng", new ei(cg3.var_short_do)));
            }
            if (!(dy_0.cfr_renamed_1(cg3.var_short_do)) && !(dy_0.cfr_renamed_0(cg3.var_short_do))) {
                vector.addElement(new fl_0("Thêm vào d.s tự bỏ", new ai_0(cg3.var_short_do)));
                return;
            }
            if ((dy_0.cfr_renamed_1(cg3.var_short_do) ? 1 : 0 != null)) {
                vector.addElement(new fl_0("Xóa khỏi d.s tự bỏ", new ai_0(cg3.var_short_do)));
            }
        }
    }

            public final void void_do() {
        Vector<Object> vector = new Vector<Object>();
        vector.addElement(this.var_java_util_Vector_do);
        this.cfr_renamed_1(vector);
        vector.addElement(new fl_0(MenuChinhAvatar.bj, new gj_0()));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

            public F(fl_0 fl_02, Vector vector) {
        super(fl_02);
        this.var_java_util_Vector_do = vector;
    }
}

