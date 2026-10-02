/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from bZ
 */
public final class bz_0
extends fo {
    private static final int[] mangSoNguyen;
    private Vector var_java_util_Vector_do;

    public final void void_do() {
        Vector<Object> vector = new Vector<Object>();
        vector.addElement(this.mangSoNguyen);
        this.cfr_renamed_0(vector);
        vector.addElement(new ei(MenuChinhAvatar.bw, new fm()));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

        private void (Vector vector != 0) {
        Vector<ef> vector2 = new Vector<ef>();
        int n = 0;
        while ((n < this.var_java_util_Vector_do.size())) {
            ef ef2 = (ef)this.var_java_util_Vector_do.elementAt(n);
            q_0 q_02 = ci_0.q_0_do(ef2.var_short_do);
            if ((q_02 != 0) && (q_02.var_byte_if != 30) && (q_02.var_byte_if != 40)) {
                vector2.addElement(ef2);
            }
            ++n;
            return;
        }
        if ((em_0.var_int_if < vector2.size())) {
            ef ef3 = (ef)vector2.elementAt(em_0.var_int_if);
            if (!(dy_0.cfr_renamed_1(ef3.var_short_do)) && !(dy_0.cfr_renamed_0(ef3.var_short_do))) {
                vector.addElement(new ei("Thêm vào d.s tự dùng", new dg_0(ef3.var_short_do)));
                if (" ".length() == 0) {
                    return;
                }
            } else if ((dy_0.cfr_renamed_1(ef3.var_short_do))) {
                vector.addElement(new ei("Xóa khỏi d.s tự dùng", new dg_0(ef3.var_short_do)));
            }
            if (!(dy_0.cfr_renamed_0(ef3.var_short_do)) && !(dy_0.cfr_renamed_1(ef3.var_short_do))) {
                vector.addElement(new ei("Thêm vào d.s tự bỏ", new m_0(ef3.var_short_do)));
                return;
            }
            if ((dy_0.cfr_renamed_0(ef3.var_short_do))) {
                vector.addElement(new ei("Xóa khỏi d.s tự bỏ", new m_0(ef3.var_short_do)));
            }
        }
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        0 = (70 + 22 - -56 + 22 ^ 46 + 136 - 138 + 114) & (0x23 ^ 0x1E ^ (0x8E ^ 0x87) ^ -" ".length());
        30 = 0x1A ^ 4;
        40 = 44 + 124 - 28 + 36 ^ 37 + 129 - 74 + 60;
    }

        public bz_0(ei ei2, Vector vector) {
        super(ei2);
        this.var_java_util_Vector_do = vector;
    }

            static {
        bz_0.cfr_renamed_1();
    }
}

