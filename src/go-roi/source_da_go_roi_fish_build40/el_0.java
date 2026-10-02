/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eL
 */
public final class el_0
implements de {
    private final byte cfr_renamed_1;

    public final void void_do() {
        switch (this.cfr_renamed_1) {
            case 1: {
                try {
                    TienIchGame.var_int_int = Integer.parseInt(GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do());
                    QuanLyRMS.luuDuLieu();
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    return;
                }
            }
            case 2: {
                try {
                    TienIchGame.var_long_for = Integer.parseInt(GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do());
                    QuanLyRMS.luuDuLieu();
                    TienIchGame.aq_0_do().cfr_renamed_5();
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    }
            }
        }
    }

    public el_0(byte by2) {
        this.cfr_renamed_1 = by2;
    }
}

