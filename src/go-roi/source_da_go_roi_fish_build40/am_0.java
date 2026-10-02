/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aM
 */
final class am_0
implements de {
    private static final int[] mangSoNguyen;
    private final byte var_byte_do;
    private final int soLuong;
    private final String chuoiGiaTri;
    private final short var_short_do;
    private final int cfr_renamed_0;
    private final int cfr_renamed_2;

    static {
        am_0.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        3 = "   ".length();
        1 = " ".length();
        -1 = -" ".length();
    }

    public am_0(int n, short s2, String string, int n2, int n3, int n4) {
        this.var_byte_do = (byte)n;
        this.var_short_do = s2;
        this.chuoiGiaTri = string;
        this.soLuong = n2;
        this.cfr_renamed_2 = n3;
        this.cfr_renamed_0 = n4;
    }

    public final void void_do() {
        switch (this.var_byte_do) {
            case 1: {
                GameCanvas.var_ca_do.cfr_renamed_1("Số lần nâng cấp:", new am_0(3, this.var_short_do, this.chuoiGiaTri, this.soLuong, this.cfr_renamed_2, this.cfr_renamed_0), 1);
                return;
            }
            case 2: {
                go_0.go_0_do();
                GameCanvas.cfr_renamed_1(this.chuoiGiaTri, new fg_0(this.soLuong, this.cfr_renamed_2, this.cfr_renamed_0));
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
                    if ("   ".length() == 0) {
                        return;
                    }
                }
                cl.var_cl_do.cfr_renamed_1(n, this.var_short_do, this.soLuong, this.cfr_renamed_2, this.cfr_renamed_0);
                AutoController.cfr_renamed_1(cl.var_cl_do);
            }
        }
    }

    }

