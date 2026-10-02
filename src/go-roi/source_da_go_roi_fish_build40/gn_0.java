/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from gN
 */
final class gn_0
implements de {
    private final Vector var_java_util_Vector_do;
    private static final int[] mangSoNguyen;
    private final Vector var_java_util_Vector_if;
    private final int soLuong;
    private final am var_am_do;
    private final int var_int_if;
    private gC var_gC_do;
    private final cg var_cg_do;

    public final void void_do() {
        ft_0.ft_0_do().void_do((int)this.var_am_do.cfr_renamed_3, this.soLuong);
        this.var_java_util_Vector_do.removeElementAt(fo.var_int_try);
        this.var_java_util_Vector_if.removeElement(this.var_cg_do);
        if ((this.var_int_if == 0)) {
            int n = fo.var_int_if;
            int n2 = fo.var_int_try;
            fo.fo_do().void_if();
            if ((ff_0.cfr_renamed_1().dangChayAuto)) {
                ff_0.cfr_renamed_1();
                ff_0.cfr_renamed_2();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            } else {
                this.var_gC_do.var_go_0_do.cfr_renamed_23();
            }
            fo.var_int_if = n;
            fo.fo_do().cfr_renamed_13();
            n = fo.fo_do().var_java_util_Vector_arr_do[n].size();
            if ((n2 >= n)) {
                if ((n > 0)) {
                    n2 = n - 1;
                    if (((0x73 ^ 0x50) & ~(0x68 ^ 0x4B)) != ((0x78 ^ 0x37) & ~(0xA ^ 0x45))) {
                        return;
                    }
                } else {
                    n2 = 0;
                }
            }
            fo.var_int_try = n2;
            fo.fo_do().cfr_renamed_8();
            GameCanvas.var_cg_0_do.void_do(fo.var_int_try);
            return;
        }
        gd_0.gd_0_do().cfr_renamed_2();
    }

        static {
        gn_0.cfr_renamed_0();
    }

        gn_0(gC gC2, am am2, int n, Vector vector, Vector vector2, cg cg2, int n2) {
        this.var_gC_do = gC2;
        this.var_am_do = am2;
        this.soLuong = n;
        this.var_java_util_Vector_do = vector;
        this.var_java_util_Vector_if = vector2;
        this.var_cg_do = cg2;
        this.var_int_if = n2;
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        1 = " ".length();
        0 = (0x6E ^ 0x71 ^ (0x73 ^ 0x38)) & (0xA3 ^ 0xA8 ^ (0xC0 ^ 0x9F) ^ -" ".length());
    }

    }

