/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

public final class fl
extends NhiemVuAutoBase {
    public boolean dangChayAuto;
    public int soLuong;
    public static fl var_fl_do;
    private long soXu;
    private static final int[] mangSoNguyen;
    public static int var_int_if;
    public String chuoiGiaTri;
    private int soLuongKhoa;
    private boolean coTrangThai;
    private static final int[] var_int_arr_if;
    private boolean coKichHoat;
    private short var_short_do;

        static {
        fl.cfr_renamed_4();
        var_int_if = -1;
        var_int_arr_if = new int[60];
        var_fl_do = new fl();
        int n = 0;
        int n2 = 3;
        while ((n2 <= 180)) {
            if ((n < 60)) {
                fl.var_int_arr_if[n] = n2;
            }
            ++n;
            n2 += 3;
            break;
        }
    }

    private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final String java_lang_String_if() {
        String string = "Số lần quay: ";
        if ((this.soLuongKhoa > 0)) {
            string = string + this.soLuong + "/" + this.soLuongKhoa;
            if (("   ".length() & ("   ".length() ^ -" ".length())) > 0) {
                return null;
            }
        } else {
            string = string + this.soLuong;
        }
        return string;
    }

    public final String toString() {
        return "Auto quay số";
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[14];
        0 = (0xA2 ^ 0x80 ^ (0x87 ^ 0x92)) & (86 + 161 - 160 + 76 ^ 81 + 141 - 198 + 124 ^ -" ".length());
        10 = 0xB5 ^ 0xBF;
        20 = 0xC8 ^ 0xAD ^ (0xE7 ^ 0x96);
        40 = 0x20 ^ 4 ^ (0x9E ^ 0x92);
        50 = 6 ^ 0x34;
        2000000000 = 0xFFFFF57B & 0x77359E84;
        1 = " ".length();
        -1 = -" ".length();
        2 = "  ".length();
        59 = 34 + 177 - 51 + 24 ^ 22 + 40 - -9 + 60;
        90 = 0x5B ^ 0x1A ^ (0x51 ^ 0x4A);
        60 = 0x5D ^ 0x5A ^ (0xA1 ^ 0x9A);
        3 = "   ".length();
        180 = 40 + 20 - -114 + 6;
    }

    public final void void_do() {
        this.var_short_do = (short)-1;
    }

    public final boolean boolean_do(String string) {
        if ((string.startsWith("Bạn không đủ"))) {
            this.coKichHoat = 1;
            GameCanvas.hienThongBaoPopup("Đã hết tiền!\nSố lần quay: " + this.soLuong);
            TienIchGame.cfr_renamed_11();
            return 1;
        }
        if ((string.startsWith("Bạn cần thẻ quay số miễn phí"))) {
            this.coKichHoat = 1;
            GameCanvas.hienThongBaoPopup("Đã hết vé quay số!\nSố lần quay: " + this.soLuong);
            TienIchGame.cfr_renamed_11();
            return 1;
        }
        if ((string.startsWith("Bạn phải có ít nhất 3 ô trống"))) {
            this.coKichHoat = 1;
            GameCanvas.hienThongBaoPopup("Rương đồ đã đầy!\nSố lần quay: " + this.soLuong);
            TienIchGame.cfr_renamed_11();
            return 1;
        }
        if ((string.startsWith("Quay từ từ thôi"))) {
            this.coTrangThai = 1;
            TienIchGame.cfr_renamed_11();
            return 1;
        }
        return super.boolean_do(string);
    }

        public final short short_do() {
        return this.var_short_do;
    }

        private static boolean boolean_do(int n) {
        return n < 0;
    }

            public final void (int n <= String object) {
        if (!(AutoController.nhiemVuHienTai != null) || (AutoController.nhiemVuHienTai instanceof fl == 0)) {
            return;
        }
        if ((var_int_if >= 2000000000)) {
            return;
        }
        object = ef_0.dd_0_do(n);
        if ((object != null) && (!fl.cfr_renamed_4(((DuLieuNguoiChoi)object).var_short_do.equals("quay số") ? 1 : 0) || !fl.cfr_renamed_4(((DuLieuNguoiChoi)object).var_short_do.equals("quay.so") ? 1 : 0) || fl.cfr_renamed_3(((DuLieuNguoiChoi)object).var_short_do.equals("nguoi.bi.an") ? 1 : 0))) {
            var_int_if = n;
        }
    }

            protected final void void_for() {
        if ((this.dangChayAuto)) {
            this.var_short_do = (short)-1;
            AutoController.tatAuto();
            ed.cfr_renamed_0().cfr_renamed_1();
            return;
        }
        if ((GameCanvas.var_dL_do instanceof ed == 0)) {
            this.var_short_do = (short)-1;
            AutoController.tatAuto();
            return;
        }
        if (fl.boolean_do(this.var_short_do)) {
            this.var_short_do = (short)-1;
            AutoController.tatAuto();
            ((dL)ed.cfr_renamed_0()).cfr_renamed_5 = ed.cfr_renamed_0().var_ei_if;
            return;
        }
        if (fl.cfr_renamed_1((System.currentTimeMillis() - this.soXu <= 30000L))) {
            this.soXu = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
            el_0.el_0_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if, 2, 0);
            TienIchGame.hienThongBao(1000L);
        }
        int n = var_int_arr_if[TienIchGame.int_do(0, 59)];
        ed ed2 = ed.cfr_renamed_0();
        ed.cfr_renamed_0().var_int_if = ed.cfr_renamed_0().soLuong = n + 90;
        ed2.dangChayAuto = 0;
        eq.eq_do().cfr_renamed_0(this.var_short_do, n);
        if ((TienIchGame.cfr_renamed_4(15000L))) {
            if ((this.coTrangThai)) {
                this.coTrangThai = 0;
                TienIchGame.hienThongBao(1000L);
                return;
            }
            if ((this.coKichHoat)) {
                this.dangChayAuto = 1;
                return;
            }
            this.soLuong += 1;
            if ((this.soLuongKhoa > 0) && (this.soLuong >= this.soLuongKhoa)) {
                GameCanvas.hienThongBaoPopup("Đã dừng Auto!\n" + this.java_lang_String_if());
                this.dangChayAuto = 1;
                return;
            }
            TienIchGame.hienThongBao(1000L);
        }
    }

    public final void (short s2 <= int n) {
        super.cfr_renamed_13();
        this.soLuong = 0;
        this.soXu = System.currentTimeMillis();
        this.dangChayAuto = 0;
        this.coKichHoat = 0;
        this.coTrangThai = 0;
        this.var_short_do = s2;
        this.soLuongKhoa = n;
        q_0 q_02 = ci_0.q_0_do(s2);
        String string = ci_0.java_lang_String_do(q_02);
        q_0 q_03 = q_02;
        String string2 = "";
        if ((q_03.var_byte_if == 10)) {
            string2 = MenuChinhAvatar.cfr_renamed_33;
            if (-"   ".length() > 0) {
                return;
            }
        } else if ((q_03.var_byte_if == 20)) {
            string2 = MenuChinhAvatar.dk;
            if ((0x2B ^ 0x2F) != (0xAD ^ 0xA9)) {
                return;
            }
        } else if ((q_03.var_byte_if == 40)) {
            string2 = MenuChinhAvatar.bv;
            if (" ".length() == 0) {
                return;
            }
        } else if ((q_03.var_byte_if == 50)) {
            string2 = MenuChinhAvatar.ci;
        }
        this.chuoiGiaTri = string2 + string;
        ((dL)ed.cfr_renamed_0()).cfr_renamed_5 = ed.cfr_renamed_0().var_ei_do;
    }

    public final String java_lang_String_for() {
        return "Đang quay: " + this.chuoiGiaTri;
    }

    }

