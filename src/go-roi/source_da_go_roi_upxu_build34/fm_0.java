/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fM
 */
final class fm_0
implements cp {
    private final ha nhiemVuHienTai;
    private bF var_bF_do;
    private static int[] mangSoNguyen;

        /*
     * Enabled aggressive block sorting
     */
    public final void void_do() {
        int n = 0;
        fc_0 fc_02 = ak_0.fc_0_do((int)this.nhiemVuHienTai.cfr_renamed_18);
        int n2 = 0;
        while (!(n2 >= bF.var_java_util_Vector_do.size())) {
            gd gd2 = (gd)bF.var_java_util_Vector_do.elementAt(n2);
            ff ff2 = bF.ff_do(gd2.var_short_do);
            if ((ff2.var_byte_do == fc_02.var_byte_if) && (ff2.var_byte_if == 5) && (gd2.soLuong > 0)) {
                n = 1;
                this.nhiemVuHienTai.cfr_renamed_5 = 0;
                bF.bF_do();
                bF.cfr_renamed_0(ff2.var_short_do, this.nhiemVuHienTai.cfr_renamed_12);
                this.var_bF_do.void_if(10, -1);
            }
            ++n2;
        }
        if ((n == 0)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.aR);
            this.var_bF_do.void_do(8, -1);
        }
    }

    fm_0(bF bF2, ha ha2) {
        this.var_bF_do = bF2;
        this.nhiemVuHienTai = ha2;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[6];
        0 = (0xE0 ^ 0xBD) & ~(0xEE ^ 0xB3);
        5 = 0x33 ^ 0x69 ^ (0x39 ^ 0x66);
        1 = " ".length();
        10 = 39 + 107 - 71 + 69 ^ 131 + 17 - 44 + 50;
        -1 = -" ".length();
        8 = 0xE7 ^ 0x96 ^ (0x45 ^ 0x3C);
    }

        static {
        fm_0.cfr_renamed_1();
    }

        }

