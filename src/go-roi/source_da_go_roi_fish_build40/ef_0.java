/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from eF
 */
final class ef_0
implements de {
    private final int soLuong;
    private final String chuoiGiaTri;
    private final byte[] var_byte_arr_do;
    private final byte var_byte_do;
    private static int[] mangSoNguyen;
    final fv_0 var_fv_0_do;
    private final String[] var_java_lang_String_arr_do;

    /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = new Vector<fl_0>();
        if (ef_0.cfr_renamed_0((int)fv_0.cfr_renamed_1(this.var_fv_0_do)) && ef_0.cfr_renamed_1((int)this.chuoiGiaTri.equals(fv_0.chuoiGiaTri))) {
            var1_1.addElement(new fl_0(MenuChinhAvatar.aa, 50));
        }
        var2_2 = 0;
        if (" ".length() != 0) ** GOTO lbl12
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = var2_2;
            var1_1.addElement(new fl_0(this.var_java_lang_String_arr_do[var2_2], new eh_0(this, this.soLuong, this.var_byte_do, this.var_byte_arr_do, var3_3)));
            ++var2_2;
lbl12:
            // 2 sources

            ** while (!ef_0.cfr_renamed_1((int)var2_2, (int)this.var_java_lang_String_arr_do.length))
        }
lbl13:
        // 1 sources

        aq.cfr_renamed_1().cfr_renamed_1(var1_1, 0);
    }

        static {
        ef_0.cfr_renamed_0();
    }

        ef_0(fv_0 fv_02, String string, String[] stringArray, int n, byte by2, byte[] byArray) {
        this.var_fv_0_do = fv_02;
        this.chuoiGiaTri = string;
        this.var_java_lang_String_arr_do = stringArray;
        this.soLuong = n;
        this.var_byte_do = by2;
        this.var_byte_arr_do = byArray;
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        50 = 0x4E ^ 0x7C;
        0 = (1 ^ 0x5C ^ (0x2E ^ 0x21)) & (32 + 158 - 149 + 186 ^ 15 + 21 - 2 + 143 ^ -" ".length());
    }
}

