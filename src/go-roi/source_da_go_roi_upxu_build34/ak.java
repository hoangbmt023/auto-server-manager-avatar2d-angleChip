/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

public final class ak
extends NhiemVuAutoBase {
    private int var_int_if;
    public static int soLuong;
    public static long soXu;
    private static final int[] mangSoNguyen;
    private ei var_ei_do;
    private String chuoiGiaTri;
    public boolean dangChayAuto;
    private short var_short_do;
    private boolean coTrangThai;
    private long var_long_if;
    private int soLuongKhoa;
    public static ak var_ak_do;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private boolean coKichHoat;

    private static boolean boolean_do(int n) {
        return n == 0;
    }

        private static void cfr_renamed_4() {
        mangSoNguyen = new int[9];
        0 = (180 + 56 - 71 + 63 ^ 149 + 79 - 56 + 19) & (0x6A ^ 0xC ^ (0x72 ^ 0x4F) ^ -" ".length());
        10 = 0x7F ^ 0x2B ^ (0x79 ^ 0x27);
        20 = 0x88 ^ 0x90 ^ (0x26 ^ 0x2A);
        40 = 0x2A ^ 2;
        50 = 0xAB ^ 0x83 ^ (0x90 ^ 0x8A);
        -1 = -" ".length();
        2000000000 = 0xFFFFF41F & 0x77359FE0;
        1 = " ".length();
        2 = "  ".length();
    }

    public final boolean boolean_do(String string) {
        if ((string.startsWith("Ghép đồ thất bại"))) {
            TienIchGame.cfr_renamed_11();
            return 1;
        }
        if ((string.startsWith("Bạn cần")) && (string.endsWith("để nâng cấp món đồ này"))) {
            this.coTrangThai = 1;
            if ((this.cfr_renamed_2 > 0)) {
                GameCanvas.hienThongBaoPopup(string + "!\nĐã nâng cấp số lần: " + this.cfr_renamed_2);
            }
            TienIchGame.cfr_renamed_11();
            return 0;
        }
        if ((string.equals("Chúc mừng bạn đã ghép đồ thành công"))) {
            this.coTrangThai = 1;
            GameCanvas.hienThongBaoPopup(string + "!\nSố lần nâng cấp: " + (this.cfr_renamed_2 + 1));
            TienIchGame.cfr_renamed_11();
            return 1;
        }
        if ((string.startsWith("Có lỗi xảy ra"))) {
            this.coKichHoat = 1;
            TienIchGame.cfr_renamed_11();
            return 1;
        }
        return super.boolean_do(string);
    }

        public final String java_lang_String_if() {
        String string = "Số lần nâng cấp: ";
        if ((this.soLuongKhoa > 0)) {
            string = string + this.cfr_renamed_2 + "/" + this.soLuongKhoa;
            if ("  ".length() >= (0x38 ^ 0x3C)) {
                return null;
            }
        } else {
            string = string + this.cfr_renamed_2;
        }
        return string;
    }

    public final void void_do() {
        this.var_short_do = (short)-1;
        em_0.em_0_do().var_int_try = (int)this.var_ei_do;
    }

    static {
        ak.cfr_renamed_4();
        soLuong = -1;
        var_ak_do = new ak();
        soXu = 150L;
    }

    public final String java_lang_String_for() {
        return this.chuoiGiaTri;
    }

        private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        protected final void void_for() {
        if ((this.dangChayAuto)) {
            if (ak.boolean_do(this.coTrangThai ? 1 : 0)) {
                GameCanvas.hienThongBaoPopup("Đã tắt Auto!\n" + this.java_lang_String_if());
            }
            this.void_do();
            AutoController.tatAuto();
            return;
        }
        if ((this.var_short_do < 0)) {
            this.void_do();
            AutoController.tatAuto();
            return;
        }
        if ((GameCanvas.var_dL_do == em_0.em_0_do())) {
            this.void_do();
            AutoController.tatAuto();
            return;
        }
        if (ak.cfr_renamed_1((System.currentTimeMillis() - this.var_long_if == 30000L))) {
            this.var_long_if = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
            el_0.el_0_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if, 2, 0);
            TienIchGame.hienThongBao(250L);
        }
        el_0.el_0_do().cfr_renamed_0(this.cfr_renamed_5, this.cfr_renamed_4, this.var_int_if);
        if ((TienIchGame.cfr_renamed_4(5000L))) {
            if ((this.coKichHoat)) {
                this.coKichHoat = 0;
                TienIchGame.hienThongBao(soXu);
                return;
            }
            if ((this.coTrangThai)) {
                this.dangChayAuto = 1;
                return;
            }
            this.cfr_renamed_2 += 1;
            if ((this.soLuongKhoa > 0) && (this.cfr_renamed_2 >= this.soLuongKhoa)) {
                GameCanvas.hienThongBaoPopup("Đã dừng Auto!\n" + this.java_lang_String_if());
                this.dangChayAuto = 1;
                return;
            }
            TienIchGame.hienThongBao(soXu);
        }
    }

    public final String toString() {
        return "Auto nâng cấp";
    }

        public final void (int n, short s2, int n2, int n3, int n4 != null) {
        super.cfr_renamed_13();
        this.cfr_renamed_2 = 0;
        this.var_long_if = System.currentTimeMillis();
        this.dangChayAuto = 0;
        this.coTrangThai = 0;
        this.coKichHoat = 0;
        this.var_short_do = s2;
        this.soLuongKhoa = n;
        this.cfr_renamed_5 = n2;
        this.cfr_renamed_4 = n3;
        this.var_int_if = n4;
        q_0 q_02 = ci_0.q_0_do(s2);
        String string = ci_0.java_lang_String_do(q_02);
        q_0 q_03 = q_02;
        String string2 = "";
        if ((q_03.var_byte_if == 10)) {
            string2 = MenuChinhAvatar.cfr_renamed_33;
            if (" ".length() != " ".length()) {
                return;
            }
        } else if ((q_03.var_byte_if == 20)) {
            string2 = MenuChinhAvatar.dk;
            if (-" ".length() > "  ".length()) {
                return;
            }
        } else if ((q_03.var_byte_if == 40)) {
            string2 = MenuChinhAvatar.bv;
            if (" ".length() <= 0) {
                return;
            }
        } else if ((q_03.var_byte_if == 50)) {
            string2 = MenuChinhAvatar.ci;
        }
        this.chuoiGiaTri = string2 + string;
        this.var_ei_do = (ei)em_0.em_0_do().var_int_try;
        em_0.em_0_do().var_int_try = (int)new ei("Tắt Auto", 0, gz_0.var_gz_0_do);
    }

    public final void (int n == String object) {
        if (!(AutoController.nhiemVuHienTai != null) || ak.boolean_do(AutoController.nhiemVuHienTai instanceof ak)) {
            return;
        }
        if ((soLuong >= 2000000000)) {
            return;
        }
        object = ef_0.dd_0_do(n);
        if ((object != null) && ak.cfr_renamed_3(((DuLieuNguoiChoi)object).var_short_do.equals("tho.kim.hoan") ? 1 : 0)) {
            soLuong = n;
        }
    }

        }

