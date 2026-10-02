/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gV
 */
final class gv_0
implements cp {
    private static final int[] mangSoNguyen;
    private final gd var_gd_do;

    static {
        gv_0.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        0 = (101 + 55 - 34 + 27 ^ 24 + 19 - -7 + 102) & (0x63 ^ 0x20 ^ (0xD2 ^ 0x9C) ^ -" ".length());
        2 = "  ".length();
        1 = " ".length();
    }

    public gv_0(gd gd2) {
        this.var_gd_do = gd2;
    }

        public final void void_do() {
        GameCanvas.var_boolean_byte = 0;
        GameCanvas.var_et_0_do = null;
        GameCanvas.cfr_renamed_8();
        gx[] gxArray = new gx[2];
        int n = 0;
        while ((n < 2)) {
            gxArray[n] = new gx();
            gxArray[n].void_do(1);
            ++n;
            if (" ".length() != 0) continue;
            return;
        }
        gxArray[0].cfr_renamed_0(1);
        ei ei2 = new ei(MenuChinhAvatar.ck, new aw_0(gxArray, this.var_gd_do));
        dj_0.cfr_renamed_0().cfr_renamed_0(gxArray, this.var_gd_do.chuoiGiaTri, AutoFarm.var_java_lang_String_arr_arr_do, ei2);
        GameCanvas.var_dX_do = dj_0.cfr_renamed_0();
    }
}

