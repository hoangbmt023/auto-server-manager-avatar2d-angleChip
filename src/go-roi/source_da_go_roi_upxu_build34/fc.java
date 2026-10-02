/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class fc
implements cp {
    private final Vector var_java_util_Vector_do;
    private final int soLuong;
    private final int cfr_renamed_1;
    private static int[] mangSoNguyen;
    final fe_0 var_fe_0_do;

                private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        0 = (0x3C ^ 0x6A) & ~(0x21 ^ 0x77);
        30 = 0x4F ^ 0x51;
        40 = 0x41 ^ 5 ^ (0x45 ^ 0x29);
        1 = " ".length();
    }

    fc(fe_0 fe_02, Vector vector, int n, int n2) {
        this.var_fe_0_do = fe_02;
        this.var_java_util_Vector_do = vector;
        this.cfr_renamed_1 = n;
        this.soLuong = n2;
    }

    static {
        fc.cfr_renamed_1();
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = new Vector<Object>();
        var2_2 = 0;
        if ("   ".length() != " ".length()) ** GOTO lbl12
        return;
lbl-1000:
        // 1 sources

        {
            var3_4 = (ef)this.var_java_util_Vector_do.elementAt(var2_2);
            var4_5 = ci_0.q_0_do(var3_4.var_short_do);
            if ((var4_5 != null) && (var4_5.var_byte_if != 30) && (var4_5.var_byte_if != 40)) {
                var1_1.addElement(var3_4);
            }
            ++var2_2;
lbl12:
            // 2 sources

            ** while (!fc.cfr_renamed_1((int)var2_2, (int)this.var_java_util_Vector_do.size()))
        }
lbl13:
        // 1 sources

        if ((em_0.var_int_if >= var1_1.size())) {
            return;
        }
        var2_3 = (ef)var1_1.elementAt(em_0.var_int_if);
        var3_4 = ci_0.q_0_do(var2_3.var_short_do);
        if (!fc.cfr_renamed_0((int)ci_0.boolean_do((int)var3_4.var_byte_if)) || (this.cfr_renamed_1 == 1)) {
            GameCanvas.hienThongBaoPopup(MenuChinhAvatar.bc, new fu(this, (q_0)var3_4, this.cfr_renamed_1, var1_1, this.var_java_util_Vector_do, var2_3, this.soLuong));
        }
    }

        }

