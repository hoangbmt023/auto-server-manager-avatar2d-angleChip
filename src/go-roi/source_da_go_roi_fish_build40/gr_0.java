/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from gR
 */
public final class gr_0
extends NhiemVuAutoBase {
    private int soLuong;
    private int cfr_renamed_0;
    private static final int[] mangSoNguyen;
    private long soXu;
    private static gr_0 var_gr_0_do;

    public final String cfr_renamed_0() {
        String string;
        StringBuffer stringBuffer = new StringBuffer().append("Số lần cho: ").append(this.soLuong).append(" / ");
        if (gr_0.boolean_do(this.cfr_renamed_0)) {
            string = String.valueOf(this.cfr_renamed_0);
            } else {
            string = "KGH";
        }
        return stringBuffer.append(string).toString();
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

        public final String toString() {
        return "Auto cho ăn xin";
    }

        private static dd_0 dd_0_do() {
        int n = 0;
        while ((n < fh.var_java_util_Vector_case.size())) {
            dd_0 dd_02 = (dd_0)fh.var_java_util_Vector_case.elementAt(n);
            if ((dd_02 != null) && gr_0.cfr_renamed_3(dd_02.chuoiGiaTri.toLowerCase().equals("an.xin") ? 1 : 0)) {
                return dd_02;
            }
            ++n;
            if ("  ".length() <= "  ".length()) continue;
            return null;
        }
        return null;
    }

                    private static void cfr_renamed_3() {
        mangSoNguyen = new int[8];
        0 = (98 + 130 - 107 + 40 ^ 123 + 64 - 159 + 120) & (4 ^ 0x27 ^ (0x31 ^ 0x27) ^ -" ".length());
        1 = " ".length();
        9 = 0x6D ^ 0x52 ^ (0xA2 ^ 0x94);
        23 = 0xAD ^ 0xBA;
        15 = 112 + 126 - 124 + 18 ^ 3 + 138 - 82 + 80;
        2 = "  ".length();
        100 = 0x78 ^ 0x1C;
        -1 = -" ".length();
    }

        public final void d_() {
        long l;
        if (gr_0.boolean_do(this.cfr_renamed_0) && (this.soLuong >= this.cfr_renamed_0)) {
            AutoController.tatAuto();
            TienIchGame.void_if(1500L);
            GameCanvas.hienThongBaoPopup("Đã cho ăn xin: " + this.soLuong + " / " + this.cfr_renamed_0 + " lần!");
            return;
        }
        if (gr_0.boolean_do((System.currentTimeMillis() - this.cfr_renamed_3 == 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] < 100)) {
            String string;
            AutoController.tatAuto();
            TienIchGame.void_if(1500L);
            StringBuffer stringBuffer = new StringBuffer().append("Không đủ xu!\nSố lẫn đã cho: ").append(this.soLuong).append(" / ");
            if (gr_0.boolean_do(this.cfr_renamed_0)) {
                string = String.valueOf(this.cfr_renamed_0);
                if (-(0x7B ^ 0x27 ^ (0x75 ^ 0x2C)) >= 0) {
                    return;
                }
            } else {
                string = "KGH";
            }
            GameCanvas.hienThongBaoPopup(stringBuffer.append(string).append(" lần!").toString());
            return;
        }
        if ((fh.var_int_char == 23)) {
            if (gr_0.boolean_do((System.currentTimeMillis() == this.soXu))) {
                this.soXu = System.currentTimeMillis() + 5000L;
                if ((gr_0.dd_0_do() != null)) {
                    fn.fn_do().cfr_renamed_2("cho");
                    if ((TienIchGame.cfr_renamed_13(5000L))) {
                        this.soLuong += 1;
                        this.soXu = System.currentTimeMillis() + 5000L;
                        this.cfr_renamed_3 = System.currentTimeMillis();
                        return;
                    }
                    TienIchGame.cfr_renamed_12();
                    this.cfr_renamed_4();
                }
            }
            return;
        }
        if ((!(GameCanvas.var_en_do instanceof gO == null) || (fh.var_int_char == -1)) && gr_0.cfr_renamed_2((l = System.currentTimeMillis() - this.cfr_renamed_4 == 2000L))) {
            TienIchGame.void_if(2000L - l);
        }
        if ((TienIchGame.cfr_renamed_1(23))) {
            TienIchGame.void_if(3500L);
            dd_0 dd_02 = gr_0.dd_0_do();
            if ((dd_02 != null)) {
                AngelChip.duLieuNguoiChoi.void_do(dd_02.cfr_renamed_2 + 15, dd_02.var_byte_int);
                fn.fn_do().cfr_renamed_1(dd_02.cfr_renamed_2 + 15, dd_02.var_byte_int, 2, 0);
                TienIchGame.void_if(1000L);
            }
        }
    }

    private void cfr_renamed_4() {
        int n = go_0.var_byte_do + 1;
        if ((n > 9)) {
            n = 0;
        }
        fn.fn_do().cfr_renamed_3(23, n);
        if ((TienIchGame.boolean_do(5000L))) {
            TienIchGame.void_if(3500L);
            dd_0 dd_02 = gr_0.dd_0_do();
            if ((dd_02 != null)) {
                this.cfr_renamed_3 = System.currentTimeMillis();
                AngelChip.duLieuNguoiChoi.void_do(dd_02.cfr_renamed_2 + 15, dd_02.var_byte_int);
                fn.fn_do().cfr_renamed_1(dd_02.cfr_renamed_2 + 15, dd_02.var_byte_int, 2, 0);
                TienIchGame.void_if(1000L);
            }
        }
    }

    public static gr_0 gr_0_do() {
        if ((var_gr_0_do == null)) {
            var_gr_0_do = new gr_0();
        }
        return var_gr_0_do;
    }

    public final void void_do(int n) {
        super.cfr_renamed_16();
        this.cfr_renamed_0 = n;
        this.soLuong = 0;
        this.soXu = 0L;
        AutoController.cfr_renamed_1(this);
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        static {
        gr_0.cfr_renamed_3();
    }

    }

