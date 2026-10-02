/*
 * Decompiled with CFR 0.152.
 */
final class cC
implements de {
    private static final int[] cfr_renamed_1;

    static {
        cC.cfr_renamed_0();
    }

        private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[3];
        cC.cfr_renamed_1[0] = (0x7A ^ 0x61 ^ (0xF7 ^ 0xBB)) & (84 + 20 - -50 + 84 ^ 143 + 61 - 34 + 15 ^ -" ".length());
        cC.cfr_renamed_1[1] = -" ".length();
        cC.cfr_renamed_1[2] = 0x48 ^ 0x5C ^ (0x41 ^ 0x38);
    }

        cC() {
    }

    public final void void_do() {
        int n = cfr_renamed_1[0];
        String string = GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do().trim();
        if ((string.length() > 0)) {
            try {
                n = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                n = cfr_renamed_1[1];
            }
            }
        if ((n >= 0)) {
            az_0.var_int_if = n;
            AutoController.cfr_renamed_1(new az_0());
            return;
        }
        TienIchGame.cfr_renamed_1("Nhập số lần farm hoặc để trống để farm không giới hạn!", new fl_0("OK", cfr_renamed_1[2], go_0.go_0_do()));
    }
}

