/*
 * Decompiled with CFR 0.152.
 */
final class ff
implements de {
    private static int[] cfr_renamed_1;

    /*
     * Unable to fully structure code
     */
    public final void void_do() {
        var1_1 = new ey_0[ff.cfr_renamed_1[0]];
        var2_2 = ff.cfr_renamed_1[1];
        if ("  ".length() > 0) ** GOTO lbl9
        return;
lbl-1000:
        // 1 sources

        {
            var1_1[var2_2] = new ey_0();
            ++var2_2;
lbl9:
            // 2 sources

            ** while (!ff.cfr_renamed_1((int)var2_2, (int)ff.cfr_renamed_1[0]))
        }
lbl10:
        // 1 sources

        var1_1[ff.cfr_renamed_1[1]].void_do(ff.cfr_renamed_1[1]);
        var1_1[ff.cfr_renamed_1[2]].void_do(ff.cfr_renamed_1[3]);
        var1_1[ff.cfr_renamed_1[3]].void_do(ff.cfr_renamed_1[3]);
        var1_1[ff.cfr_renamed_1[4]].void_do(ff.cfr_renamed_1[1]);
        v0 = new String[ff.cfr_renamed_1[0]][];
        v1 = new String[ff.cfr_renamed_1[3]];
        v1[ff.cfr_renamed_1[1]] = "Tên:";
        v1[ff.cfr_renamed_1[2]] = "";
        v0[ff.cfr_renamed_1[1]] = v1;
        v2 = new String[ff.cfr_renamed_1[3]];
        v2[ff.cfr_renamed_1[1]] = "Mật khẩu:";
        v2[ff.cfr_renamed_1[2]] = "";
        v0[ff.cfr_renamed_1[2]] = v2;
        v3 = new String[ff.cfr_renamed_1[3]];
        v3[ff.cfr_renamed_1[1]] = "Nhập lại";
        v3[ff.cfr_renamed_1[2]] = "mật khẩu:";
        v0[ff.cfr_renamed_1[3]] = v3;
        v4 = new String[ff.cfr_renamed_1[3]];
        v4[ff.cfr_renamed_1[1]] = "Số di động";
        v4[ff.cfr_renamed_1[2]] = "hoặc email:";
        v0[ff.cfr_renamed_1[4]] = v4;
        var2_3 = v0;
        el.cfr_renamed_1().cfr_renamed_1(var1_1, "Đăng Ký", var2_3, new fl_0(MenuChinhAvatar.aC, new ap_0(var1_1)));
        GameCanvas.var_ez_do = el.cfr_renamed_1();
    }

        static {
        ff.cfr_renamed_0();
    }

    ff() {
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[5];
        ff.cfr_renamed_1[0] = 0x80 ^ 0x84;
        ff.cfr_renamed_1[1] = (0x39 ^ 0x24) & ~(0x8D ^ 0x90);
        ff.cfr_renamed_1[2] = " ".length();
        ff.cfr_renamed_1[3] = "  ".length();
        ff.cfr_renamed_1[4] = "   ".length();
    }
}

