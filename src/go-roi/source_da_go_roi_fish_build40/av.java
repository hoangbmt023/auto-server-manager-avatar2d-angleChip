/*
 * Decompiled with CFR 0.152.
 */
final class av
implements de {
    private static final int[] cfr_renamed_1;

        private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[3];
        av.cfr_renamed_1[0] = (0x50 ^ 0x1D) & ~(0x76 ^ 0x3B);
        av.cfr_renamed_1[1] = -" ".length();
        av.cfr_renamed_1[2] = 0x4D ^ 0x6A ^ (0xF7 ^ 0xBA);
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
            if ("   ".length() < 0) {
                return;
            }
        }
        if ((n >= 0)) {
            gh_0.cfr_renamed_1 = n;
            AutoController.cfr_renamed_1(new gh_0());
            return;
        }
        TienIchGame.cfr_renamed_1("Nhập số lần farm hoặc để trống để farm không giới hạn!", new fl_0("OK", cfr_renamed_1[2], go_0.go_0_do()));
    }

        av() {
    }

    static {
        av.cfr_renamed_0();
    }
}

