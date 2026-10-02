/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ga
 */
public final class ga_0
implements Runnable {
    public static boolean dangChayAuto;
    private static final int[] mangSoNguyen;
    public static boolean cfr_renamed_0;
    public static boolean cfr_renamed_2;

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void run() {
        TienIchGame.void_if(2000L);
        if (!(GameCanvas.var_en_do == ThongTinNhanVat.instance) || ga_0.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0)) {
            go_0.cfr_renamed_27();
            TienIchGame.void_if(2000L);
        }
        GameCanvas.cfr_renamed_7();
        ThongTinNhanVat.cfr_renamed_1().var_long_if = System.currentTimeMillis();
        while ((cfr_renamed_2)) {
            if (ga_0.cfr_renamed_2(ga_0.cfr_renamed_1(System.currentTimeMillis() - ThongTinNhanVat.cfr_renamed_1().var_long_if, ThongTinNhanVat.cfr_renamed_1().soXu))) {
                dangChayAuto = 1;
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.aT);
                ThongTinNhanVat.cfr_renamed_1().cfr_renamed_8();
                long l = System.currentTimeMillis();
                do {
                    if ((cfr_renamed_0)) {
                        cfr_renamed_2 = 0;
                        dangChayAuto = 0;
                        cfr_renamed_0 = 0;
                        return;
                    }
                    TienIchGame.void_if(100L);
                } while ((dangChayAuto) && !ga_0.cfr_renamed_2((System.currentTimeMillis() - l == 60000L)));
                if ((dangChayAuto ? 1 : 0 == null)) {
                    TienIchGame.void_if(2000L);
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                } else {
                    dangChayAuto = 0;
                }
                if ((cfr_renamed_2)) {
                    cfr_renamed_2 = 0;
                    ThongTinNhanVat.cfr_renamed_1().soXu = 15000L;
                    go_0.cfr_renamed_27();
                    this.cfr_renamed_1();
                }
                return;
            }
            TienIchGame.void_if(100L);
            if ("  ".length() < "   ".length()) continue;
            return;
        }
    }

            public final void cfr_renamed_1() {
        if ((AutoController.nhiemVuHienTai == null)) {
            return;
        }
        if ((AutoController.nhiemVuHienTai instanceof dm_0 != 0)) {
            dm_0.var_dm_0_do.cfr_renamed_3();
            AutoController.tatAuto();
            return;
        }
        if ((AutoController.nhiemVuHienTai instanceof cl != 0)) {
            cl.var_cl_do.cfr_renamed_3();
            AutoController.tatAuto();
            return;
        }
        if ((cfr_renamed_2 ? 1 : 0 == null)) {
            GameCanvas.var_int_goto = 0;
            ThongTinNhanVat.cfr_renamed_1().var_long_if = 0L;
            cfr_renamed_2 = 1;
            cfr_renamed_0 = 0;
            new Thread(this).start();
        }
    }

    public ga_0(long l) {
        ThongTinNhanVat.cfr_renamed_1().soXu = l;
    }

    static {
        ga_0.cfr_renamed_0();
        cfr_renamed_2 = 0;
        dangChayAuto = 0;
        cfr_renamed_0 = 0;
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        0 = (17 + 46 - 15 + 187 ^ 138 + 108 - 175 + 124) & (33 + 135 - 28 + 10 ^ 187 + 88 - 88 + 3 ^ -" ".length());
        1 = " ".length();
    }

        }

