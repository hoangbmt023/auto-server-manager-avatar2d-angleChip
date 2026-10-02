/*
 * Decompiled with CFR 0.152.
 */
final class ci
implements Runnable {
    private static final int[] mangSoNguyen;
    private String chuoiGiaTri;
    private final af_0 var_af_0_do;

        public ci(af_0 af_02, String string) {
        this.var_af_0_do = af_02;
        this.chuoiGiaTri = string;
    }

    public final void run() {
        if ((af_0.soLuong != null)) {
            TienIchGame.void_if((long)af_0.soLuong);
        }
        if ((af_0.cfr_renamed_1(this.var_af_0_do) == 0)) {
            if (!(af_0.var_java_util_Vector_if.isEmpty())) {
                int n = 0;
                while ((n < af_0.var_java_util_Vector_if.size())) {
                    ad ad2 = (ad)af_0.var_java_util_Vector_if.elementAt(n);
                    if ((ad2 != null) && (this.chuoiGiaTri.equals(ad2.var_java_lang_String_arr_do[0]))) {
                        fn.fn_do().cfr_renamed_2(ad2.chuoiGiaTri);
                        return;
                    }
                    ++n;
                    if (" ".length() <= "  ".length()) continue;
                    return;
                }
            }
            return;
        }
        if ((af_0.cfr_renamed_1(this.var_af_0_do) == 1) && !(af_0.var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n < af_0.var_java_util_Vector_do.size())) {
                ad ad3 = (ad)af_0.var_java_util_Vector_do.elementAt(n);
                if ((ad3 != null) && (this.chuoiGiaTri.startsWith(ad3.var_java_lang_String_arr_do[0])) && (this.chuoiGiaTri.endsWith(ad3.var_java_lang_String_arr_do[1]))) {
                    fn.fn_do().cfr_renamed_2(ad3.chuoiGiaTri);
                    return;
                }
                ++n;
                if (" ".length() != 0) continue;
                return;
            }
        }
    }

                    static {
        ci.cfr_renamed_0();
    }

    public final void cfr_renamed_1() {
        new Thread(this).start();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        0 = (80 + 26 - 102 + 139 ^ 84 + 174 - 126 + 55) & (138 + 82 - 140 + 94 ^ 123 + 11 - 66 + 86 ^ -" ".length());
        1 = " ".length();
    }

    }

