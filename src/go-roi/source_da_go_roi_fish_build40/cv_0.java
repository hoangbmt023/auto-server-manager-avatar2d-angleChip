/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cv
 */
final class cv_0
implements de {
    private static int[] mangSoNguyen;
    private dR var_dR_do;
    private final hs var_hs_do;

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[5];
        0 = "  ".length() & ~"  ".length();
        121 = 0xFA ^ 0x96 ^ (0x70 ^ 0x65);
        1 = " ".length();
        8 = 0xB6 ^ 0xAC ^ (0x3E ^ 0x2C);
        -1 = -" ".length();
    }

        cv_0(dR dR2, hs hs2) {
        this.var_dR_do = dR2;
        this.var_hs_do = hs2;
    }

    static {
        cv_0.cfr_renamed_0();
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = 0;
        var2_3 = 0;
        if ("  ".length() > (" ".length() & ~" ".length())) ** GOTO lbl17
        return;
lbl-1000:
        // 1 sources

        {
            var3_4 = (ee_0)dR.var_java_util_Vector_try.elementAt(var2_3);
            if ((var3_4.var_short_if == 121)) {
                var1_2 = dR.dg_0_do(var3_4.var_short_if);
                dR.cfr_renamed_1(this.var_dR_do, var1_2, var3_4.var_short_if, this.var_hs_do);
                var1_1 = 1;
                if (null == null) break;
                return;
            }
            ++var2_3;
lbl17:
            // 2 sources

            ** while (!cv_0.cfr_renamed_1((int)var2_3, (int)dR.var_java_util_Vector_try.size()))
        }
lbl18:
        // 2 sources

        if ((var1_1 == 0)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_float);
            dR.dR_do().void_do(8, -1);
        }
    }

    }

