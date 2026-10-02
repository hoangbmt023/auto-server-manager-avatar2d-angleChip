/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eD
 */
final class ed_0
implements cp {
    private static int[] cfr_renamed_0;

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[5];
        ed_0.cfr_renamed_0[0] = 0xAE ^ 0xAA;
        ed_0.cfr_renamed_0[1] = (0x83 ^ 0xA8 ^ (4 ^ 0x68)) & (34 + 30 - -16 + 173 ^ 60 + 44 - 48 + 130 ^ -" ".length());
        ed_0.cfr_renamed_0[2] = " ".length();
        ed_0.cfr_renamed_0[3] = "  ".length();
        ed_0.cfr_renamed_0[4] = "   ".length();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void void_do() {
        gx[] gxArray = new gx[cfr_renamed_0[0]];
        int n = cfr_renamed_0[1];
        while (!(n >= cfr_renamed_0[0])) {
            gxArray[n] = new gx();
            ++n;
        }
        gxArray[cfr_renamed_0[1]].void_do(cfr_renamed_0[1]);
        gxArray[cfr_renamed_0[2]].void_do(cfr_renamed_0[3]);
        gxArray[cfr_renamed_0[3]].void_do(cfr_renamed_0[3]);
        gxArray[cfr_renamed_0[4]].void_do(cfr_renamed_0[1]);
        String[][] stringArray = new String[cfr_renamed_0[0]][];
        String[] stringArray2 = new String[cfr_renamed_0[3]];
        stringArray2[ed_0.cfr_renamed_0[1]] = "Tên:";
        stringArray2[ed_0.cfr_renamed_0[2]] = "";
        stringArray[ed_0.cfr_renamed_0[1]] = stringArray2;
        String[] stringArray3 = new String[cfr_renamed_0[3]];
        stringArray3[ed_0.cfr_renamed_0[1]] = "Mật khẩu:";
        stringArray3[ed_0.cfr_renamed_0[2]] = "";
        stringArray[ed_0.cfr_renamed_0[2]] = stringArray3;
        String[] stringArray4 = new String[cfr_renamed_0[3]];
        stringArray4[ed_0.cfr_renamed_0[1]] = "Nhập lại";
        stringArray4[ed_0.cfr_renamed_0[2]] = "mật khẩu:";
        stringArray[ed_0.cfr_renamed_0[3]] = stringArray4;
        String[] stringArray5 = new String[cfr_renamed_0[3]];
        stringArray5[ed_0.cfr_renamed_0[1]] = "Số di động";
        stringArray5[ed_0.cfr_renamed_0[2]] = "hoặc email:";
        stringArray[ed_0.cfr_renamed_0[4]] = stringArray5;
        String[][] stringArray6 = stringArray;
        dj_0.cfr_renamed_0().cfr_renamed_0(gxArray, "Đăng Ký", stringArray6, new ei(MenuChinhAvatar.ck, new da(gxArray)));
        GameCanvas.var_dX_do = dj_0.cfr_renamed_0();
    }

    static {
        ed_0.cfr_renamed_1();
    }

        ed_0() {
    }
}

