/*
 * Decompiled with CFR 0.152.
 */
final class ew
implements de {
    private aG var_aG_do;
    private final ey_0[] var_ey_0_arr_do;
    private final String chuoiGiaTri;
    private static int[] mangSoNguyen;

    ew(aG aG2, String string, ey_0[] ey_0Array) {
        this.var_aG_do = aG2;
        this.chuoiGiaTri = string;
        this.var_ey_0_arr_do = ey_0Array;
    }

    public final void void_do() {
        String string = this.var_ey_0_arr_do[1].java_lang_String_do();
        String string2 = this.var_ey_0_arr_do[0].java_lang_String_do();
        String string3 = this.chuoiGiaTri;
        aG aG2 = this.var_aG_do;
        if ((string2.equals(""))) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_catch[0]);
            return;
        }
        if ((string.equals(""))) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_catch[1]);
            return;
        }
        ft_0.ft_0_do().cfr_renamed_0(string3, string2, string);
        aG2.void_do((int)aG2.var_fl_0_try.var_byte_do, aG2.var_fl_0_try.var_short_do);
        GameCanvas.cfr_renamed_8();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        0 = (103 + 119 - 221 + 149 ^ 172 + 35 - 168 + 158) & (0x3C ^ 0x5E ^ (0x46 ^ 0x77) ^ -" ".length());
        1 = " ".length();
    }

        static {
        ew.cfr_renamed_0();
    }
}

