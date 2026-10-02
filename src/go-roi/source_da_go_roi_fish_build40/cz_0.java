/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZ
 */
final class cz_0
implements de {
    private dR var_dR_do;
    private final hs var_hs_do;
    private static int[] mangSoNguyen;

        static {
        cz_0.cfr_renamed_0();
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[6];
        0 = (111 + 86 - 170 + 138 ^ 79 + 6 - -34 + 14) & (12 + 127 - 48 + 37 ^ 150 + 79 - 154 + 85 ^ -" ".length());
        6 = 0x17 ^ 0x2D ^ (0xF ^ 0x33);
        1 = " ".length();
        10 = 0x86 ^ 0x8C;
        -1 = -" ".length();
        8 = 0x1B ^ 3 ^ (0x13 ^ 3);
    }

        /*
     * Enabled aggressive block sorting
     */
    public final void void_do() {
        int n = 0;
        int n2 = 0;
        while (!(n2 >= dR.var_java_util_Vector_try.size())) {
            ee_0 ee_02 = (ee_0)dR.var_java_util_Vector_try.elementAt(n2);
            if (cz_0.cfr_renamed_1(dR.dg_0_do((int)ee_02.var_short_if).var_byte_if, 6)) {
                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, ((dd_0)this.var_hs_do).cfr_renamed_9, (int)ee_02.var_short_if);
                n = 1;
                this.var_dR_do.void_if(10, -1);
                if (" ".length() >= 0) break;
                return;
            }
            ++n2;
        }
        if ((n == 0)) {
            dR.dR_do().void_do(8, -1);
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cv);
        }
    }

    cz_0(dR dR2, hs hs2) {
        this.var_dR_do = dR2;
        this.var_hs_do = hs2;
    }
}

