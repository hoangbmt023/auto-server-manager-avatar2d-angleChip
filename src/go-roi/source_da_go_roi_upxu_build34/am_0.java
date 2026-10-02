/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aM
 */
final class am_0
implements cp {
    private final String chuoiGiaTri;
    private static final int[] mangSoNguyen;
    private final short var_short_do;
    private final byte var_byte_do;
    private final int soLuong;
    private final int cfr_renamed_1;
    private final int cfr_renamed_3;

    public final void void_do() {
        switch (this.var_byte_do) {
            case 1: {
                GameCanvas.var_dZ_do.cfr_renamed_0("Số lần nâng cấp:", new am_0(3, this.var_short_do, this.chuoiGiaTri, this.soLuong, this.cfr_renamed_3, this.cfr_renamed_1), 1);
                return;
            }
            case 2: {
                fe_0.fe_0_do();
                GameCanvas.hienThongBaoPopup(this.chuoiGiaTri, new gM(this.soLuong, this.cfr_renamed_3, this.cfr_renamed_1));
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
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                ak.var_ak_do.cfr_renamed_0(n, this.var_short_do, this.soLuong, this.cfr_renamed_3, this.cfr_renamed_1);
                AutoController.cfr_renamed_0(ak.var_ak_do);
            }
        }
    }

        public am_0(int n, short s2, String string, int n2, int n3, int n4) {
        this.var_byte_do = (byte)n;
        this.var_short_do = s2;
        this.chuoiGiaTri = string;
        this.soLuong = n2;
        this.cfr_renamed_3 = n3;
        this.cfr_renamed_1 = n4;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        3 = "   ".length();
        1 = " ".length();
        -1 = -" ".length();
    }

    static {
        am_0.cfr_renamed_1();
    }
}

