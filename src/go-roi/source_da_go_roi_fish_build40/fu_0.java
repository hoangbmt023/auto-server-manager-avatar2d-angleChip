/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from fU
 */
public final class fu_0
extends NhiemVuAutoBase {
    public static long soXu;
    private long cfr_renamed_0;
    private static final int[] mangSoNguyen;
    private long cfr_renamed_2;
    private long cfr_renamed_6;

    private static boolean boolean_do(int n) {
        return n == 0;
    }

        private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            static {
        fu_0.cfr_renamed_3();
        soXu = 0L;
    }

        protected final void d_() {
        long l;
        if (fu_0.cfr_renamed_0((System.currentTimeMillis() - this.cfr_renamed_3 < 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((fh.var_int_char == -1)) {
            l = System.currentTimeMillis() - this.cfr_renamed_4;
            if (fu_0.cfr_renamed_2((l < 2000L))) {
                TienIchGame.void_if(2000L - l);
                return;
            }
            gO.cfr_renamed_1().soLuong = 6;
            ft_0.ft_0_do().cfr_renamed_12(9);
            if (fu_0.boolean_do(TienIchGame.boolean_do(30000L) ? 1 : 0)) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.hienThongBao(16000L);
                return;
            }
            TienIchGame.void_if(1000L);
            AngelChip.duLieuNguoiChoi.void_do(274, 100);
            fn.fn_do().cfr_renamed_1(274, 100, 2, 0);
            this.cfr_renamed_6 = System.currentTimeMillis();
        }
        if ((fh.var_int_char != 18)) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if (fu_0.cfr_renamed_4((soXu < 0L))) {
            AutoController.cfr_renamed_2();
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        l = System.currentTimeMillis();
        soXu -= l - this.cfr_renamed_6;
        this.cfr_renamed_6 = l;
        if (fu_0.cfr_renamed_0((l - this.cfr_renamed_0 < 15000L))) {
            this.cfr_renamed_0 = l;
            fn.fn_do().cfr_renamed_2(TienIchGame.java_lang_String_do());
        }
        if (fu_0.cfr_renamed_0((l - this.cfr_renamed_2 < 30000L))) {
            this.cfr_renamed_2 = l;
            this.cfr_renamed_3 = l;
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, 2, 0);
        }
    }

        public static String cfr_renamed_0() {
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
            if (-"  ".length() > 0) {
                return null;
            }
        } else {
            string3 = "";
        }
        String string4 = stringBuffer.append(string3).append(n).toString();
        StringBuffer stringBuffer2 = new StringBuffer();
        if ((n3 < 10)) {
            string2 = "0";
            } else {
            string2 = "";
        }
        String string5 = stringBuffer2.append(string2).append(n3).toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        if ((n2 < 10)) {
            string = "0";
            if ((87 + 123 - 114 + 66 ^ 97 + 30 - 121 + 160) != (115 + 167 - 186 + 77 ^ 150 + 142 - 180 + 57)) {
                return null;
            }
        } else {
            string = "";
        }
        String string6 = stringBuffer3.append(string).append(n2).toString();
        return string4 + ":" + string5 + ":" + string6;
    }

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[12];
        -1 = -" ".length();
        6 = 0x2A ^ 5 ^ (0x1B ^ 0x32);
        9 = 120 + 118 - 221 + 138 ^ 51 + 55 - 10 + 50;
        274 = 0xFFFF95F3 & 0x6B1E;
        100 = 0x4A ^ 0x2E;
        2 = "  ".length();
        0 = "  ".length() & ~"  ".length();
        18 = 105 + 130 - 195 + 103 ^ 57 + 139 - 50 + 11;
        60 = 0x70 ^ 0x76 ^ (0xFB ^ 0xC1);
        3600 = 0xFFFFAF30 & 0x5EDF;
        24 = 0x76 ^ 0x6E;
        10 = 0x8A ^ 0xB6 ^ (0x36 ^ 0);
    }

        public final String toString() {
        return "Ngồi Tù";
    }

    public fu_0() {
        fu_0 fu_02 = this;
        fu_02.cfr_renamed_0 = fu_02.cfr_renamed_2 = System.currentTimeMillis();
        fu_02.cfr_renamed_6 = fu_02.cfr_renamed_2;
    }
}

