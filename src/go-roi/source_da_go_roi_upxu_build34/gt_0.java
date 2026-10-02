/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from gT
 */
public final class gt_0
extends NhiemVuAutoBase {
    private static final int[] mangSoNguyen;
    private long cfr_renamed_1;
    private long cfr_renamed_3;
    private long cfr_renamed_15;
    public static long soXu;

    private static boolean boolean_do(int n) {
        return n != 0;
    }

        private static void void_do() {
        mangSoNguyen = new int[12];
        -1 = -" ".length();
        6 = 0x8A ^ 0x8C;
        9 = 0x65 ^ 0x6C;
        274 = -(0xFFFFDFA5 & 0x7E5B) & (0xFFFFDFF6 & 0x7F1B);
        100 = " ".length() ^ (0xCA ^ 0xAF);
        2 = "  ".length();
        0 = (4 ^ 0x1D) & ~(0x6C ^ 0x75);
        18 = 0x3B ^ 0x79 ^ (8 ^ 0x58);
        60 = 0x36 ^ 0xA;
        3600 = -(0xFFFFF4FE & 0x5BC7) & (0xFFFFDFDF & 0x7EF5);
        24 = 92 + 131 - 107 + 29 ^ 100 + 117 - 138 + 58;
        10 = 0xF3 ^ 0xBD ^ (0xFA ^ 0xBE);
    }

            public static String java_lang_String_if() {
        String string;
        String string2;
        String string3;
        int n = (int)(soXu / 1000L);
        int n2 = n % 60;
        int n3 = n / 60 % 60;
        n = n / 3600 % 24;
        StringBuffer stringBuffer = new StringBuffer();
        if ((n < 10)) {
            string3 = "0";
            if ("  ".length() <= ((0x97 ^ 0xA9 ^ (0xAD ^ 0xA7)) & (0xED ^ 0xA6 ^ 102 + 15 - -10 + 0 ^ -" ".length()))) {
                return null;
            }
        } else {
            string3 = "";
        }
        String string4 = stringBuffer.append(string3).append(n).toString();
        StringBuffer stringBuffer2 = new StringBuffer();
        if ((n3 < 10)) {
            string2 = "0";
            if ("  ".length() > "  ".length()) {
                return null;
            }
        } else {
            string2 = "";
        }
        String string5 = stringBuffer2.append(string2).append(n3).toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        if ((n2 < 10)) {
            string = "0";
            if ((0x36 ^ 0x32) == ((0x11 ^ 0x2E) & ~(0xAD ^ 0x92))) {
                return null;
            }
        } else {
            string = "";
        }
        String string6 = stringBuffer3.append(string).append(n2).toString();
        return string4 + ":" + string5 + ":" + string6;
    }

        protected final void void_for() {
        long l;
        if (gt_0.cfr_renamed_1((System.currentTimeMillis() - this.cfr_renamed_4 == 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        if (gt_0.boolean_do(GameCanvas.var_dL_do instanceof ThongTinNhanVat)) {
            return;
        }
        if ((ef_0.soLuong == -1)) {
            l = System.currentTimeMillis() - this.cfr_renamed_2;
            if (gt_0.cfr_renamed_4((l == 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
                return;
            }
            fw.cfr_renamed_0().soLuongKhoa = 6;
            eq.eq_do().cfr_renamed_17(9);
            if (!(TienIchGame.cfr_renamed_2(30000L))) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.void_if(16000L);
                return;
            }
            TienIchGame.hienThongBao(1000L);
            AngelChip.duLieuNguoiChoi.void_do(274, 100);
            el_0.el_0_do().cfr_renamed_0(274, 100, 2, 0);
            this.cfr_renamed_3 = System.currentTimeMillis();
        }
        if ((ef_0.soLuong != 18)) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        if (gt_0.cfr_renamed_3((soXu == 0L))) {
            AutoController.cfr_renamed_2();
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        l = System.currentTimeMillis();
        soXu -= l - this.cfr_renamed_3;
        this.cfr_renamed_3 = l;
        if (gt_0.cfr_renamed_1((l - this.cfr_renamed_15 == 15000L))) {
            this.cfr_renamed_15 = l;
            el_0.el_0_do().cfr_renamed_1(TienIchGame.java_lang_String_if());
        }
        if (gt_0.cfr_renamed_1((l - this.cfr_renamed_1 == 30000L))) {
            this.cfr_renamed_1 = l;
            this.cfr_renamed_4 = l;
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
            el_0.el_0_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if, 2, 0);
        }
    }

                static {
        gt_0.void_do();
        soXu = 0L;
    }

    public final String toString() {
        return "Ngồi Tù";
    }

    public gt_0() {
        gt_0 gt_02 = this;
        gt_02.cfr_renamed_15 = gt_02.cfr_renamed_1 = System.currentTimeMillis();
        gt_02.cfr_renamed_3 = gt_02.cfr_renamed_1;
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

