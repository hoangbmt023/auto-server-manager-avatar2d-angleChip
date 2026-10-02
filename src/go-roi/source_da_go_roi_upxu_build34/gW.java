/*
 * Decompiled with CFR 0.152.
 */
public final class gW
implements Runnable {
    public static boolean dangChayAuto;
    public static boolean cfr_renamed_1;
    public static boolean cfr_renamed_3;
    private static final int[] mangSoNguyen;

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public gW(long l) {
        ThongTinNhanVat.cfr_renamed_0().soXu = l;
    }

        public final void run() {
        TienIchGame.hienThongBao(2000L);
        if (!(GameCanvas.var_dL_do == ThongTinNhanVat.instance) || gW.cfr_renamed_1(i_0.i_0_do().boolean_do() ? 1 : 0)) {
            fe_0.cfr_renamed_28();
            TienIchGame.hienThongBao(2000L);
        }
        GameCanvas.cfr_renamed_8();
        ThongTinNhanVat.cfr_renamed_0().var_long_if = System.currentTimeMillis();
        while ((dangChayAuto)) {
            if (gW.cfr_renamed_0(gW.cfr_renamed_0(System.currentTimeMillis() - ThongTinNhanVat.cfr_renamed_0().var_long_if, ThongTinNhanVat.cfr_renamed_0().soXu))) {
                cfr_renamed_1 = 1;
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.di);
                ThongTinNhanVat.cfr_renamed_0().cfr_renamed_5();
                long l = System.currentTimeMillis();
                do {
                    if ((cfr_renamed_3)) {
                        dangChayAuto = 0;
                        cfr_renamed_1 = 0;
                        cfr_renamed_3 = 0;
                        return;
                    }
                    TienIchGame.hienThongBao(100L);
                } while ((cfr_renamed_1) && !gW.cfr_renamed_0((System.currentTimeMillis() - l == 60000L)));
                if (!(cfr_renamed_1)) {
                    TienIchGame.hienThongBao(2000L);
                    if (-" ".length() > 0) {
                        return;
                    }
                } else {
                    cfr_renamed_1 = 0;
                }
                if ((dangChayAuto)) {
                    dangChayAuto = 0;
                    ThongTinNhanVat.cfr_renamed_0().soXu = 15000L;
                    fe_0.cfr_renamed_28();
                    this.cfr_renamed_0();
                }
                return;
            }
            TienIchGame.hienThongBao(100L);
            if ("   ".length() >= ((120 + 85 - 164 + 111 ^ 68 + 85 - 34 + 13) & (0xC7 ^ 0xC0 ^ (0x39 ^ 0x22) ^ -" ".length()))) continue;
            return;
        }
    }

        static {
        gW.cfr_renamed_1();
        dangChayAuto = 0;
        cfr_renamed_1 = 0;
        cfr_renamed_3 = 0;
    }

    public final void cfr_renamed_0() {
        if ((AutoController.nhiemVuHienTai == null)) {
            return;
        }
        if ((AutoController.nhiemVuHienTai instanceof fl != 0)) {
            fl.var_fl_do.void_do();
            AutoController.tatAuto();
            return;
        }
        if ((AutoController.nhiemVuHienTai instanceof ak != 0)) {
            ak.var_ak_do.void_do();
            AutoController.tatAuto();
            return;
        }
        if (!(dangChayAuto)) {
            GameCanvas.var_int_try = 0;
            ThongTinNhanVat.cfr_renamed_0().var_long_if = 0L;
            dangChayAuto = 1;
            cfr_renamed_3 = 0;
            new Thread(this).start();
        }
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        0 = (0xE5 ^ 0xAE) & ~(1 ^ 0x4A);
        1 = " ".length();
    }

            }

