/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dw
 */
final class dw_0
implements de {
    private static final int[] mangSoNguyen;
    private final ey_0[] var_ey_0_arr_do;

    static {
        dw_0.cfr_renamed_0();
    }

        public final void void_do() {
        String string = this.var_ey_0_arr_do[0].java_lang_String_do().trim();
        String string2 = this.var_ey_0_arr_do[1].java_lang_String_do().trim();
        if ((string.equals("")) && (string2.equals(""))) {
            GameCanvas.var_ez_do = null;
            new AutoFarm(-2, new co(0, 0)).void_do();
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
            if (-"  ".length() > 0) {
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
            if (((25 + 84 - -66 + 64 ^ 35 + 81 - 39 + 100) & (0x10 ^ 0x30 ^ (0x6B ^ 0x15) ^ -" ".length())) != 0) {
                return;
            }
        }
        if ((n >= 0) && (n2 >= 0)) {
            if ((n2 < n)) {
                n2 = 0;
            }
            GameCanvas.var_ez_do = null;
            new AutoFarm(-2, new co(n, n2)).void_do();
            return;
        }
        GameCanvas.hienThongBaoPopup("Vui lòng nhập đúng hoặc để trống để cuốc hết!");
    }

                public dw_0(ey_0[] ey_0Array) {
        this.var_ey_0_arr_do = ey_0Array;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        0 = (154 + 8 - 113 + 137 ^ 13 + 63 - 3 + 109) & (128 + 132 - 162 + 55 ^ 47 + 84 - 8 + 26 ^ -" ".length());
        1 = " ".length();
        -2 = -"  ".length();
        -1 = -" ".length();
    }
}

