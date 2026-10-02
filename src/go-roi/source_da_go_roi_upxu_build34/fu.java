/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class fu
implements cp {
    private final q_0 var_q_0_do;
    private fc var_fc_do;
    private final Vector var_java_util_Vector_do;
    private final int soLuong;
    private static final int[] mangSoNguyen;
    private final ef duLieuNguoiChoi;
    private final int var_int_if;
    private final Vector var_java_util_Vector_if;

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        1 = " ".length();
        0 = (0x22 ^ 0x50 ^ (0x5B ^ 0x23)) & (5 ^ 0x73 ^ (0x14 ^ 0x68) ^ -" ".length());
    }

    public final void void_do() {
        eq.eq_do().void_if((int)this.var_q_0_do.var_short_do, this.soLuong);
        this.var_java_util_Vector_if.removeElementAt(em_0.var_int_if);
        this.var_java_util_Vector_do.removeElement(this.duLieuNguoiChoi);
        if ((this.var_int_if == 0)) {
            int n = em_0.soLuongKhoa;
            int n2 = em_0.var_int_if;
            em_0.em_0_do().cfr_renamed_2();
            if ((ec.cfr_renamed_0().dangChayAuto)) {
                ec.cfr_renamed_0();
                ec.cfr_renamed_1();
                } else {
                this.var_fc_do.var_fe_0_do.cfr_renamed_24();
            }
            em_0.soLuongKhoa = n;
            em_0.em_0_do().cfr_renamed_5();
            n = em_0.em_0_do().var_java_util_Vector_arr_do[n].size();
            if ((n2 >= n)) {
                if ((n > 0)) {
                    n2 = n - 1;
                    if ((0x4F ^ 0x76 ^ (0x58 ^ 0x65)) <= "  ".length()) {
                        return;
                    }
                } else {
                    n2 = 0;
                }
            }
            em_0.var_int_if = n2;
            em_0.em_0_do().cfr_renamed_18();
            GameCanvas.var_ex_do.void_do(em_0.var_int_if);
            return;
        }
        fe.fe_do().cfr_renamed_12();
    }

        static {
        fu.cfr_renamed_1();
    }

            fu(fc fc2, q_0 q_02, int n, Vector vector, Vector vector2, ef ef2, int n2) {
        this.var_fc_do = fc2;
        this.var_q_0_do = q_02;
        this.soLuong = n;
        this.var_java_util_Vector_if = vector;
        this.var_java_util_Vector_do = vector2;
        this.duLieuNguoiChoi = ef2;
        this.var_int_if = n2;
    }
}

