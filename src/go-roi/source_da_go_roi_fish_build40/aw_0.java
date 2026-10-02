/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aW
 */
final class aw_0
implements de {
    private final ee_0 var_ee_0_do;
    private static final int[] mangSoNguyen;
    private final ey_0[] var_ey_0_arr_do;

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        0 = (77 + 134 - 56 + 49 ^ 73 + 79 - -42 + 0) & (0x74 ^ 0x6C ^ (9 ^ 0x1F) ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        -1 = -" ".length();
    }

        public aw_0(ey_0[] ey_0Array, ee_0 ee_02) {
        this.var_ey_0_arr_do = ey_0Array;
        this.var_ee_0_do = ee_02;
    }

    static {
        aw_0.cfr_renamed_0();
    }

        public final void void_do() {
        Object object = this.var_ey_0_arr_do[0].java_lang_String_do().trim();
        String string = this.var_ey_0_arr_do[1].java_lang_String_do().trim();
        if (aw_0.cfr_renamed_2(((String)object).equals("") ? 1 : 0) && (string.equals(""))) {
            GameCanvas.var_ez_do = null;
            AutoFarm bq_02 = new AutoFarm(3, new co(0, 0, this.var_ee_0_do.var_short_if));
            bq_02.cfr_renamed_16();
            AutoController.cfr_renamed_1(bq_02);
            return;
        }
        int n = 0;
        int n2 = 0;
        if (aw_0.cfr_renamed_0(((String)object).equals("") ? 1 : 0)) {
            try {
                n = Integer.parseInt((String)object);
            }
            catch (NumberFormatException numberFormatException) {
                n = -1;
            }
            if ("  ".length() < -" ".length()) {
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
            if (-"   ".length() > 0) {
                return;
            }
        }
        if ((n >= 0) && (n2 >= 0)) {
            if ((n2 < n)) {
                n2 = 0;
            }
            GameCanvas.var_ez_do = null;
            object = new AutoFarm(3, new co(n, n2, this.var_ee_0_do.var_short_if));
            ((NhiemVuAutoBase)object).cfr_renamed_16();
            AutoController.cfr_renamed_1((NhiemVuAutoBase)object);
            return;
        }
        GameCanvas.hienThongBaoPopup("Vui lòng nhập đúng hoặc để trống để gieo hạt hết ô đất trống!");
    }

    }

