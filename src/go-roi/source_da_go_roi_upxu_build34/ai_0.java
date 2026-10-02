/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ai
 */
final class ai_0
implements Runnable {
    private static final int[] mangSoNguyen;
    private final T var_T_do;
    private String chuoiGiaTri;

    public final void cfr_renamed_0() {
        new Thread(this).start();
    }

    public final void run() {
        if ((T.soLuong > 0)) {
            TienIchGame.hienThongBao((long)T.soLuong);
        }
        if ((T.cfr_renamed_0(this.var_T_do) == 0)) {
            if (!(T.var_java_util_Vector_if.isEmpty())) {
                int n = 0;
                while ((n < T.var_java_util_Vector_if.size())) {
                    R r = (R)T.var_java_util_Vector_if.elementAt(n);
                    if ((r != null) && (this.chuoiGiaTri.equals(r.var_java_lang_String_arr_do[0]) ? 1 : 0 != null)) {
                        el_0.el_0_do().cfr_renamed_1(r.chuoiGiaTri);
                        return;
                    }
                    ++n;
                    if (-"  ".length() <= 0) continue;
                    return;
                }
            }
            return;
        }
        if ((T.cfr_renamed_0(this.var_T_do) == 1) && !(T.var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n < T.var_java_util_Vector_do.size())) {
                R r = (R)T.var_java_util_Vector_do.elementAt(n);
                if ((r != null) && (this.chuoiGiaTri.startsWith(r.var_java_lang_String_arr_do[0]) ? 1 : 0 != null) && (this.chuoiGiaTri.endsWith(r.var_java_lang_String_arr_do[1]) ? 1 : 0 != null)) {
                    el_0.el_0_do().cfr_renamed_1(r.chuoiGiaTri);
                    return;
                }
                ++n;
                if (-" ".length() <= "   ".length()) continue;
                return;
            }
        }
    }

    static {
        ai_0.cfr_renamed_1();
    }

        public ai_0(T t, String string) {
        this.var_T_do = t;
        this.chuoiGiaTri = string;
    }

            private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        0 = (0x8B ^ 0xB9) & ~(0x12 ^ 0x20);
        1 = " ".length();
    }

            }

