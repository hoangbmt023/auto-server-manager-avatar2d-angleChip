/*
 * Decompiled with CFR 0.152.
 */
final class dU
implements cp {
    private final String chuoiGiaTri;
    private static int[] mangSoNguyen;
    private r_0 var_r_0_do;
    private final gx[] var_gx_arr_do;

    public final void void_do() {
        String string = this.var_gx_arr_do[1].java_lang_String_do();
        String string2 = this.var_gx_arr_do[0].java_lang_String_do();
        String string3 = this.chuoiGiaTri;
        r_0 r_02 = this.var_r_0_do;
        if ((string2.equals(""))) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_else[0]);
            return;
        }
        if ((string.equals(""))) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_else[1]);
            return;
        }
        eq.eq_do().cfr_renamed_3(string3, string2, string);
        r_02.void_do((int)((bn_0)r_02).cfr_renamed_4.var_byte_do, ((bn_0)r_02).cfr_renamed_4.var_short_do);
        GameCanvas.cfr_renamed_5();
    }

    static {
        dU.cfr_renamed_1();
    }

        dU(r_0 r_02, String string, gx[] gxArray) {
        this.var_r_0_do = r_02;
        this.chuoiGiaTri = string;
        this.var_gx_arr_do = gxArray;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        0 = (0xD1 ^ 0x8C) & ~(0xEC ^ 0xB1);
        1 = " ".length();
    }
}

