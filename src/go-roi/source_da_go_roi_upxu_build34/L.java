/*
 * Decompiled with CFR 0.152.
 */
final class L
implements cp {
    private final short var_short_do;
    private final byte var_byte_do;
    private static final int[] mangSoNguyen;

    public final void void_do() {
        switch (this.var_byte_do) {
            case 1: {
                GameCanvas.var_dZ_do.cfr_renamed_0("Số lần quay:", new L(3, this.var_short_do), 1);
                return;
            }
            case 2: {
                em_0.em_0_do().cfr_renamed_2();
                ed.cfr_renamed_0().cfr_renamed_0(GameCanvas.var_dL_do, this.var_short_do);
                return;
            }
            case 3: {
                int n = -1;
                String string = TienIchGame.java_lang_String_if(GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do());
                if ((string.length() > 0)) {
                    try {
                        n = Integer.parseInt(string);
                    }
                    catch (NumberFormatException numberFormatException) {
                        n = -1;
                    }
                    if ((0x57 ^ 0x53) != (0x21 ^ 0x25)) {
                        return;
                    }
                }
                em_0.em_0_do().cfr_renamed_2();
                ed.cfr_renamed_0().cfr_renamed_0(GameCanvas.var_dL_do, this.var_short_do);
                fl.var_fl_do.cfr_renamed_0(this.var_short_do, n);
                AutoController.cfr_renamed_0(fl.var_fl_do);
            }
        }
    }

    static {
        L.cfr_renamed_1();
    }

    public L(int n, short s2) {
        this.var_byte_do = (byte)n;
        this.var_short_do = s2;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        3 = "   ".length();
        1 = " ".length();
        -1 = -" ".length();
    }

    }

