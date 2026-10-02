/*
 * Decompiled with CFR 0.152.
 */
final class J
implements cp {
    private static final int[] cfr_renamed_0;

        J() {
    }

    public final void void_do() {
        int n = cfr_renamed_0[0];
        String string = GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do().trim();
        if ((string.length() > 0)) {
            try {
                n = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                n = cfr_renamed_0[1];
            }
            if (((0xF0 ^ 0x8E ^ (0x2C ^ 9)) & (49 + 75 - 30 + 33 ^ (0x69 ^ 0x4D) ^ -" ".length())) == -" ".length()) {
                return;
            }
        }
        if ((n >= 0)) {
            gb_0.gb_0_do().void_do(n);
            return;
        }
        TienIchGame.cfr_renamed_0("Nhập số lần cho hoặc để trống để cho không giới hạn!", new ei("OK", cfr_renamed_0[2], fe_0.fe_0_do()));
    }

        static {
        J.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[3];
        J.cfr_renamed_0[0] = (67 + 50 - 17 + 62 ^ 138 + 136 - 184 + 56) & (0x1C ^ 0x6E ^ (0x5E ^ 0x1C) ^ -" ".length());
        J.cfr_renamed_0[1] = -" ".length();
        J.cfr_renamed_0[2] = 0x25 ^ 0x2C ^ (0x8A ^ 0xC6);
    }
}

