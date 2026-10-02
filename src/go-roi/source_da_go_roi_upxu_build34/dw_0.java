/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dw
 */
final class dw_0
implements cp {
    private final gx[] var_gx_arr_do;
    private static final int[] mangSoNguyen;

        public dw_0(gx[] gxArray) {
        this.var_gx_arr_do = gxArray;
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        0 = (78 + 18 - 48 + 112 ^ 51 + 48 - -3 + 36) & (5 + 108 - -45 + 27 ^ 61 + 75 - 4 + 15 ^ -" ".length());
        1 = " ".length();
        -2 = -"  ".length();
        -1 = -" ".length();
    }

    static {
        dw_0.cfr_renamed_1();
    }

            public final void void_do() {
        String string = this.var_gx_arr_do[0].java_lang_String_do().trim();
        String string2 = this.var_gx_arr_do[1].java_lang_String_do().trim();
        if ((string.equals("")) && (string2.equals(""))) {
            GameCanvas.var_dX_do = null;
            new AutoFarm(-2, new am(0, 0)).void_do();
            return;
        }
        int n = 0;
        int n2 = 0;
        if (!(string.equals(""))) {
            try {
                n = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                n = -1;
            }
            if (-" ".length() > ((0x28 ^ 0x25) & ~(0x10 ^ 0x1D))) {
                return;
            }
        }
        if (!(string2.equals(""))) {
            try {
                n2 = Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                n2 = -1;
            }
            if (((0x34 ^ 0xD) & ~(0xA ^ 0x33)) > " ".length()) {
                return;
            }
        }
        if ((n >= 0) && (n2 >= 0)) {
            if ((n2 < n)) {
                n2 = 0;
            }
            GameCanvas.var_dX_do = null;
            new AutoFarm(-2, new am(n, n2)).void_do();
            return;
        }
        GameCanvas.hienThongBaoPopup("Vui lòng nhập đúng hoặc để trống để cuốc hết!");
    }
}

