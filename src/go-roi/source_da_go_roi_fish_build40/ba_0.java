/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bA
 */
final class ba_0
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
            }
        if ((n > 0)) {
            al.soXu = n;
            if ("   ".length() < 0) {
                return;
            }
        } else {
            al.soXu = 0L;
        }
        go_0.go_0_do().cfr_renamed_13();
    }

        static {
        ba_0.cfr_renamed_0();
    }

    ba_0() {
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[1];
        ba_0.cfr_renamed_1[0] = (0x95 ^ 0xC1) & ~(0x56 ^ 2);
    }
}

