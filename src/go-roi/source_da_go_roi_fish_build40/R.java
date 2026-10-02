/*
 * Decompiled with CFR 0.152.
 */
final class R
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
                n = cfr_renamed_1[1];
            }
            if (((0xE8 ^ 0x8B) & ~(0xCA ^ 0xA9)) >= "  ".length()) {
                return;
            }
        }
        if ((n >= 0)) {
            gr_0.gr_0_do().void_do(n);
            return;
        }
        TienIchGame.cfr_renamed_1("Nhập số lần cho hoặc để trống để cho không giới hạn!", new fl_0("OK", cfr_renamed_1[2], go_0.go_0_do()));
    }

        R() {
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[3];
        R.cfr_renamed_1[0] = (39 + 72 - 81 + 111 ^ 97 + 151 - 57 + 5) & (102 + 58 - 13 + 67 ^ 32 + 144 - 56 + 39 ^ -" ".length());
        R.cfr_renamed_1[1] = -" ".length();
        R.cfr_renamed_1[2] = 175 + 25 - 38 + 84 ^ 62 + 67 - -17 + 33;
    }

        static {
        R.cfr_renamed_0();
    }
}

