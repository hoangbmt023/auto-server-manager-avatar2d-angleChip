/*
 * Decompiled with CFR 0.152.
 */
public final class cV
implements cp {
    private final byte cfr_renamed_0;

    public final void void_do() {
        switch (this.cfr_renamed_0) {
            case 1: {
                try {
                    TienIchGame.soLuongKhoa = Integer.parseInt(GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do());
                    QuanLyRMS.docDuLieu();
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    return;
                }
            }
            case 2: {
                try {
                    TienIchGame.soXu = Integer.parseInt(GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do());
                    QuanLyRMS.docDuLieu();
                    TienIchGame.aq_0_do().cfr_renamed_18();
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    }
            }
        }
    }

    public cV(byte by2) {
        this.cfr_renamed_0 = by2;
    }
}

