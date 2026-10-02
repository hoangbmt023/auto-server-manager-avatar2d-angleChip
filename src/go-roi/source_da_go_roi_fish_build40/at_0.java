/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aT
 */
final class at_0
implements de {
    private static final int[] cfr_renamed_1;

    public final void void_do() {
        block6: {
            block4: {
                String string = TienIchGame.java_lang_String_do(GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do());
                if (!(string.length() > 0)) break block4;
                try {
                    cb.cfr_renamed_1 = Integer.parseInt(string);
                }
                catch (NumberFormatException numberFormatException) {
                    }
                if (" ".length() <= 0) {
                    return;
                }
                if ((cb.cfr_renamed_1 > 0)) {
                    AutoController.cfr_renamed_1(new cb(cfr_renamed_1[1]));
                    return;
                }
                break block6;
            }
            cb.cfr_renamed_1 = dR.var_java_util_Vector_int.size();
            AutoController.cfr_renamed_1(new cb(cfr_renamed_1[1]));
        }
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[2];
        at_0.cfr_renamed_1[0] = (153 + 46 - 194 + 166 ^ 25 + 51 - -64 + 2) & (18 + 71 - 27 + 126 ^ 3 + 71 - 62 + 141 ^ -" ".length());
        at_0.cfr_renamed_1[1] = "   ".length();
    }

    public at_0(short s2) {
        cb.var_int_if = s2;
        cb.cfr_renamed_1 = cfr_renamed_1[0];
    }

        static {
        at_0.cfr_renamed_0();
    }
}

