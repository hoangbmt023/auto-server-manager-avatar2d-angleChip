/*
 * Decompiled with CFR 0.152.
 */
final class gS
implements de {
    private static final int[] cfr_renamed_1;

    public final void void_do() {
        int n = cfr_renamed_1[0];
        String string = GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do().trim();
        if ((string.length() > 0)) {
            try {
                n = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                }
            if ("   ".length() <= 0) {
                return;
            }
        }
        if ((n > 0)) {
            cl_0.soLuong = n;
            AutoController.cfr_renamed_1(new cl_0());
            return;
        }
        TienIchGame.cfr_renamed_1("Vui lòng nhập số lượng!", new fl_0("OK", cfr_renamed_1[1], go_0.go_0_do()));
    }

    static {
        gS.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[2];
        gS.cfr_renamed_1[0] = (10 + 76 - -67 + 55 ^ 2 + 107 - 43 + 71) & (7 ^ 0x31 ^ (2 ^ 0x6D) ^ -" ".length());
        gS.cfr_renamed_1[1] = 0x3A ^ 0x49;
    }

        gS() {
    }
}

