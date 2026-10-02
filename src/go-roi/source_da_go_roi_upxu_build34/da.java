/*
 * Decompiled with CFR 0.152.
 */
final class da
implements cp {
    private static int[] mangSoNguyen;
    private final gx[] var_gx_arr_do;

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        0 = (0xED ^ 0xA3 ^ (0x15 ^ 0x11)) & (0x25 ^ 0x39 ^ (0xC5 ^ 0x93) ^ -" ".length());
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
    }

    static {
        da.cfr_renamed_1();
    }

    public final void void_do() {
        if (da.cfr_renamed_1(this.var_gx_arr_do[0].java_lang_String_do().equals("") ? 1 : 0)) {
            GameCanvas.cfr_renamed_1("Bạn chưa nhập tên");
            return;
        }
        if (!da.cfr_renamed_0(this.var_gx_arr_do[1].java_lang_String_do().equals("") ? 1 : 0) || da.cfr_renamed_1(this.var_gx_arr_do[2].java_lang_String_do().equals("") ? 1 : 0)) {
            GameCanvas.cfr_renamed_1("Bạn chưa nhập mật khẩu");
            return;
        }
        if (da.cfr_renamed_0(this.var_gx_arr_do[1].java_lang_String_do().equals(this.var_gx_arr_do[2].java_lang_String_do()) ? 1 : 0)) {
            GameCanvas.cfr_renamed_1("Hai mật khẩu không giống nhau");
            return;
        }
        GameCanvas.var_dX_do = null;
        eq.eq_do().cfr_renamed_0(this.var_gx_arr_do[0].java_lang_String_do().toLowerCase(), this.var_gx_arr_do[1].java_lang_String_do().toLowerCase(), this.var_gx_arr_do[3].java_lang_String_do());
    }

        da(gx[] gxArray) {
        this.var_gx_arr_do = gxArray;
    }
}

