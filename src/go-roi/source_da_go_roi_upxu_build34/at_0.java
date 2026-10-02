/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aT
 */
final class at_0
implements cp {
    private static final int[] cfr_renamed_0;

    public at_0(short s2) {
        ac.cfr_renamed_0 = s2;
        ac.var_int_if = cfr_renamed_0[0];
    }

    static {
        at_0.cfr_renamed_1();
    }

        public final void void_do() {
        block6: {
            block4: {
                String string = TienIchGame.java_lang_String_if(GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do());
                if (!(string.length() > 0)) break block4;
                try {
                    ac.var_int_if = Integer.parseInt(string);
                }
                catch (NumberFormatException numberFormatException) {
                    }
                if (" ".length() > (107 + 156 - 248 + 155 ^ 143 + 170 - 200 + 61)) {
                    return;
                }
                if ((ac.var_int_if > 0)) {
                    AutoController.batAuto(new ac(cfr_renamed_0[1]));
                    return;
                }
                break block6;
            }
            ac.var_int_if = bF.var_java_util_Vector_int.size();
            AutoController.batAuto(new ac(cfr_renamed_0[1]));
        }
    }

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[2];
        at_0.cfr_renamed_0[0] = (0xF8 ^ 0xC0) & ~(0xB9 ^ 0x81);
        at_0.cfr_renamed_0[1] = "   ".length();
    }
}

