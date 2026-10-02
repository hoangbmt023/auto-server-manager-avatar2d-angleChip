/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from gB
 */
public final class gb_0
extends NhiemVuAutoBase {
    private static final int[] mangSoNguyen;
    private long soXu;
    private int soLuong;
    private int cfr_renamed_1;
    private static gb_0 var_gb_0_do;

    private static boolean boolean_do(int n) {
        return n != 0;
    }

        public final String toString() {
        return "Auto cho ăn xin";
    }

    private static bk_0 bk_0_do() {
        int n = 0;
        while ((n < ef_0.var_java_util_Vector_do.size())) {
            bk_0 bk_02 = (bk_0)ef_0.var_java_util_Vector_do.elementAt(n);
            if ((bk_02 != null) && gb_0.boolean_do(bk_02.chuoiGiaTri.toLowerCase().equals("an.xin") ? 1 : 0)) {
                return bk_02;
            }
            ++n;
            if (((0x28 ^ 0x77 ^ (0x55 ^ 0x46)) & (0x1E ^ 0x37 ^ (0xA5 ^ 0xC0) ^ -" ".length())) == 0) continue;
            return null;
        }
        return null;
    }

    public final void void_for() {
        if ((this.cfr_renamed_1 > 0) && (this.soLuong >= this.cfr_renamed_1)) {
            AutoController.tatAuto();
            TienIchGame.hienThongBao(1500L);
            GameCanvas.hienThongBaoPopup("Đã cho ăn xin: " + this.soLuong + " / " + this.cfr_renamed_1 + " lần!");
            return;
        }
        if (gb_0.cfr_renamed_4((System.currentTimeMillis() - this.cfr_renamed_4 > 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        if (gb_0.boolean_do(GameCanvas.var_dL_do instanceof ThongTinNhanVat)) {
            return;
        }
        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] < 100)) {
            String string;
            AutoController.tatAuto();
            TienIchGame.hienThongBao(1500L);
            StringBuffer stringBuffer = new StringBuffer().append("Không đủ xu!\nSố lẫn đã cho: ").append(this.soLuong).append(" / ");
            if ((this.cfr_renamed_1 > 0)) {
                string = String.valueOf(this.cfr_renamed_1);
                if ((0x4A ^ 0x4F) <= 0) {
                    return;
                }
            } else {
                string = "KGH";
            }
            GameCanvas.hienThongBaoPopup(stringBuffer.append(string).append(" lần!").toString());
            return;
        }
        if ((!(GameCanvas.var_dL_do instanceof fe_0 == 0) || gb_0.boolean_do(GameCanvas.var_dL_do.boolean_do(fe_0.fe_0_do()) ? 1 : 0)) && (ef_0.soLuong == 23)) {
            if (gb_0.cfr_renamed_4((System.currentTimeMillis() > this.soXu))) {
                this.soXu = System.currentTimeMillis() + 5000L;
                if ((gb_0.bk_0_do() != null)) {
                    el_0.el_0_do().cfr_renamed_1("cho");
                    if (gb_0.boolean_do(TienIchGame.boolean_if(5000L) ? 1 : 0)) {
                        this.soLuong += 1;
                        this.soXu = System.currentTimeMillis() + 5000L;
                        this.cfr_renamed_4 = System.currentTimeMillis();
                        return;
                    }
                    TienIchGame.void_int();
                    this.cfr_renamed_4();
                }
            }
            return;
        }
        if ((ef_0.soLuong != 23)) {
            long l;
            if ((!(GameCanvas.var_dL_do instanceof fw == 0) || (ef_0.soLuong == -1)) && gb_0.cfr_renamed_1((l = System.currentTimeMillis() - this.cfr_renamed_2 > 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
            }
            if (gb_0.boolean_do(TienIchGame.cfr_renamed_3(23) ? 1 : 0)) {
                TienIchGame.hienThongBao(3500L);
                bk_0 bk_02 = gb_0.bk_0_do();
                if ((bk_02 != null)) {
                    AngelChip.duLieuNguoiChoi.void_do(bk_02.cfr_renamed_3 + 15, bk_02.cfr_renamed_1 ? 1 : 0);
                    el_0.el_0_do().cfr_renamed_0(bk_02.cfr_renamed_3 + 15, bk_02.cfr_renamed_1 ? 1 : 0, 2, 0);
                    TienIchGame.hienThongBao(1000L);
                }
            }
            return;
        }
        NhiemVuAutoBase.cfr_renamed_22();
    }

        static {
        gb_0.void_do();
    }

    private static void void_do() {
        mangSoNguyen = new int[8];
        0 = (0x70 ^ 0x2F ^ (0xCE ^ 0xA8)) & (11 + 15 - -56 + 78 ^ 139 + 87 - 158 + 85 ^ -" ".length());
        1 = " ".length();
        9 = 0x34 ^ 0x71 ^ (0x3C ^ 0x70);
        23 = 0x6C ^ 0x7B;
        15 = 154 + 136 - 289 + 154 ^ 79 + 110 - 61 + 20;
        2 = "  ".length();
        100 = 0x18 ^ 0x7C;
        -1 = -" ".length();
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void void_do(int n) {
        super.cfr_renamed_13();
        this.cfr_renamed_1 = n;
        this.soLuong = 0;
        this.soXu = 0L;
        AutoController.cfr_renamed_0(this);
    }

        public final String java_lang_String_if() {
        String string;
        StringBuffer stringBuffer = new StringBuffer().append("Số lần cho: ").append(this.soLuong).append(" / ");
        if ((this.cfr_renamed_1 > 0)) {
            string = String.valueOf(this.cfr_renamed_1);
            if (-"  ".length() > 0) {
                return null;
            }
        } else {
            string = "KGH";
        }
        return stringBuffer.append(string).toString();
    }

                public static gb_0 gb_0_do() {
        if ((var_gb_0_do == null)) {
            var_gb_0_do = new gb_0();
        }
        return var_gb_0_do;
    }

    private void cfr_renamed_4() {
        int n = fe_0.var_byte_for + 1;
        if ((n > 9)) {
            n = 0;
        }
        el_0.el_0_do().cfr_renamed_4(23, n);
        if (gb_0.boolean_do(TienIchGame.cfr_renamed_2(5000L) ? 1 : 0)) {
            TienIchGame.hienThongBao(3500L);
            bk_0 bk_02 = gb_0.bk_0_do();
            if ((bk_02 != null)) {
                this.cfr_renamed_4 = System.currentTimeMillis();
                AngelChip.duLieuNguoiChoi.void_do(bk_02.cfr_renamed_3 + 15, bk_02.cfr_renamed_1 ? 1 : 0);
                el_0.el_0_do().cfr_renamed_0(bk_02.cfr_renamed_3 + 15, bk_02.cfr_renamed_1 ? 1 : 0, 2, 0);
                TienIchGame.hienThongBao(1000L);
            }
        }
    }

                }

