/*
 * Decompiled with CFR 0.152.
 */
final class V
implements de {
    private final short var_short_do;
    private final byte var_byte_do;
    private static final int[] mangSoNguyen;
    private final byte cfr_renamed_0;

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        3 = "   ".length();
        1 = " ".length();
        -1 = -" ".length();
    }

    static {
        V.cfr_renamed_0();
    }

    public V(int n, short s2, int n2) {
        this.cfr_renamed_0 = (byte)n;
        this.var_short_do = s2;
        this.var_byte_do = (byte)n2;
    }

    public final void void_do() {
        switch (this.cfr_renamed_0) {
            case 1: {
                GameCanvas.var_ca_do.cfr_renamed_1("Số lần quay:", new V(3, this.var_short_do, this.var_byte_do), 1);
                return;
            }
            case 2: {
                fo.fo_do().void_if();
                ce.cfr_renamed_1().cfr_renamed_1(GameCanvas.var_en_do, this.var_short_do);
                return;
            }
            case 3: {
                int n = -1;
                String string = TienIchGame.java_lang_String_do(GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do());
                if ((string.length() > 0)) {
                    try {
                        n = Integer.parseInt(string);
                    }
                    catch (NumberFormatException numberFormatException) {
                        n = -1;
                    }
                    if ("   ".length() <= "  ".length()) {
                        return;
                    }
                }
                fo.fo_do().void_if();
                ce.cfr_renamed_1().cfr_renamed_1(GameCanvas.var_en_do, this.var_short_do);
                dm_0.var_dm_0_do.cfr_renamed_1(this.var_short_do, n, this.var_byte_do);
                AutoController.cfr_renamed_1(dm_0.var_dm_0_do);
            }
        }
    }
}

