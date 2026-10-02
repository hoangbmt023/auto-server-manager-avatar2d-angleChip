/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aP
 */
final class ap_0
implements de {
    private static int[] mangSoNguyen;
    private final ey_0[] var_ey_0_arr_do;

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        0 = (0x75 ^ 0x4D) & ~(0x11 ^ 0x29);
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
    }

        static {
        ap_0.cfr_renamed_0();
    }

    public final void void_do() {
        if (ap_0.cfr_renamed_1(this.var_ey_0_arr_do[0].java_lang_String_do().equals("") ? 1 : 0)) {
            GameCanvas.cfr_renamed_1("Bạn chưa nhập tên");
            return;
        }
        if (!ap_0.cfr_renamed_0(this.var_ey_0_arr_do[1].java_lang_String_do().equals("") ? 1 : 0) || ap_0.cfr_renamed_1(this.var_ey_0_arr_do[2].java_lang_String_do().equals("") ? 1 : 0)) {
            GameCanvas.cfr_renamed_1("Bạn chưa nhập mật khẩu");
            return;
        }
        if (ap_0.cfr_renamed_0(this.var_ey_0_arr_do[1].java_lang_String_do().equals(this.var_ey_0_arr_do[2].java_lang_String_do()) ? 1 : 0)) {
            GameCanvas.cfr_renamed_1("Hai mật khẩu không giống nhau");
            return;
        }
        GameCanvas.var_ez_do = null;
        ft_0.ft_0_do().cfr_renamed_2(this.var_ey_0_arr_do[0].java_lang_String_do().toLowerCase(), this.var_ey_0_arr_do[1].java_lang_String_do().toLowerCase(), this.var_ey_0_arr_do[3].java_lang_String_do());
    }

    ap_0(ey_0[] ey_0Array) {
        this.var_ey_0_arr_do = ey_0Array;
    }
}

