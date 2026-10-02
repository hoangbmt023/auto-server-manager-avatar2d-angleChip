/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aW
 */
final class aw_0
implements cp {
    private final gd var_gd_do;
    private final gx[] var_gx_arr_do;
    private static final int[] mangSoNguyen;

            public aw_0(gx[] gxArray, gd gd2) {
        this.var_gx_arr_do = gxArray;
        this.var_gd_do = gd2;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        0 = (0xB ^ 0) & ~(0x63 ^ 0x68);
        1 = " ".length();
        3 = "   ".length();
        -1 = -" ".length();
    }

    public final void void_do() {
        Object object = this.var_gx_arr_do[0].java_lang_String_do().trim();
        String string = this.var_gx_arr_do[1].java_lang_String_do().trim();
        if (aw_0.cfr_renamed_3(((String)object).equals("") ? 1 : 0) && (string.equals(""))) {
            GameCanvas.var_dX_do = null;
            AutoFarm ac_02 = new AutoFarm(3, new am(0, 0, this.var_gd_do.var_short_do));
            ac_02.cfr_renamed_13();
            AutoController.cfr_renamed_0(ac_02);
            return;
        }
        int n = 0;
        int n2 = 0;
        if (aw_0.cfr_renamed_1(((String)object).equals("") ? 1 : 0)) {
            try {
                n = Integer.parseInt((String)object);
            }
            catch (NumberFormatException numberFormatException) {
                n = -1;
            }
            if (" ".length() < ((0x2D ^ 0x63) & ~(0x8E ^ 0xC0))) {
                return;
            }
        }
        if (!(string.equals(""))) {
            try {
                n2 = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                n2 = -1;
            }
            if (" ".length() < 0) {
                return;
            }
        }
        if ((n >= 0) && (n2 >= 0)) {
            if ((n2 < n)) {
                n2 = 0;
            }
            GameCanvas.var_dX_do = null;
            object = new AutoFarm(3, new am(n, n2, this.var_gd_do.var_short_do));
            ((NhiemVuAutoBase)object).cfr_renamed_13();
            AutoController.cfr_renamed_0((NhiemVuAutoBase)object);
            return;
        }
        GameCanvas.hienThongBaoPopup("Vui lòng nhập đúng hoặc để trống để gieo hạt hết ô đất trống!");
    }

            static {
        aw_0.cfr_renamed_1();
    }
}

