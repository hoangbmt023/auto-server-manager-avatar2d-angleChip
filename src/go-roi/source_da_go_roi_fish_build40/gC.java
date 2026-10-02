/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class gC
implements de {
    private final int soLuong;
    final go_0 var_go_0_do;
    private final int cfr_renamed_0;
    private static int[] mangSoNguyen;
    private final Vector var_java_util_Vector_do;

                private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        0 = (8 + 81 - -35 + 24 ^ 96 + 70 - 34 + 0) & (0x4D ^ 2 ^ (0x3D ^ 0x62) ^ -" ".length());
        30 = 0x9F ^ 0xB7 ^ (0x48 ^ 0x7E);
        40 = 0x8D ^ 0xA5;
        1 = " ".length();
    }

    static {
        gC.cfr_renamed_0();
    }

        /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = new Vector<Object>();
        var2_2 = 0;
        if ((84 ^ 123 ^ (26 ^ 49)) >= ((105 + 39 - -10 + 53 ^ 17 + 39 - -48 + 24) & (126 + 135 - 129 + 98 ^ 97 + 27 - -36 + 9 ^ -" ".length()))) ** GOTO lbl12
        return;
lbl-1000:
        // 1 sources

        {
            var3_4 = (cg)this.var_java_util_Vector_do.elementAt(var2_2);
            var4_5 = aa_0.am_do(var3_4.var_short_do);
            if ((var4_5 != 0) && (var4_5.var_byte_if != 30) && (var4_5.var_byte_if != 40)) {
                var1_1.addElement(var3_4);
            }
            ++var2_2;
lbl12:
            // 2 sources

            ** while (!gC.cfr_renamed_0((int)var2_2, (int)this.var_java_util_Vector_do.size()))
        }
lbl13:
        // 1 sources

        if ((fo.var_int_try >= var1_1.size())) {
            return;
        }
        var2_3 = (cg)var1_1.elementAt(fo.var_int_try);
        var3_4 = aa_0.am_do(var2_3.var_short_do);
        if (!gC.cfr_renamed_1((int)aa_0.boolean_do((int)var3_4.var_byte_if)) || (this.cfr_renamed_0 == 1)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.br, new gn_0(this, (am)var3_4, this.cfr_renamed_0, var1_1, this.var_java_util_Vector_do, var2_3, this.soLuong));
        }
    }

        gC(go_0 go_02, Vector vector, int n, int n2) {
        this.var_go_0_do = go_02;
        this.var_java_util_Vector_do = vector;
        this.cfr_renamed_0 = n;
        this.soLuong = n2;
    }
}

