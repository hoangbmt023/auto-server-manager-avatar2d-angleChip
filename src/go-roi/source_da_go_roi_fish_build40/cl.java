/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

public final class cl
extends NhiemVuAutoBase {
    private int var_int_if;
    private int soLuongKhoa;
    private boolean coTrangThai;
    public static int soLuong;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    public boolean dangChayAuto;
    private boolean coKichHoat;
    private int cfr_renamed_5;
    private short var_short_do;
    private static final int[] mangSoNguyen;
    public static long soXu;
    private String chuoiGiaTri;
    public static cl var_cl_do;
    private long var_long_if;
    private fl_0 var_fl_0_do;

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    static {
        cl.cfr_renamed_4();
        soLuong = -1;
        var_cl_do = new cl();
        soXu = 150L;
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[9];
        0 = (0x4E ^ 0xF ^ (2 ^ 0x69)) & (8 ^ 0x55 ^ (0x51 ^ 0x26) ^ -" ".length());
        10 = 95 + 42 - 35 + 37 ^ 116 + 63 - 171 + 121;
        20 = 0x8F ^ 0x9B;
        40 = 0x1F ^ 0x37;
        50 = 3 + 82 - 3 + 49 ^ 89 + 90 - 169 + 167;
        -1 = -" ".length();
        2000000000 = -(0xFFFFAABF & 0x7751) & (0xFFFFFE94 & 0x7735B77B);
        1 = " ".length();
        2 = "  ".length();
    }

        private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public final void (int n, short s2, int n2, int n3, int n4 != null) {
        super.cfr_renamed_16();
        this.soLuongKhoa = 0;
        this.var_long_if = System.currentTimeMillis();
        this.dangChayAuto = 0;
        this.coKichHoat = 0;
        this.coTrangThai = 0;
        this.var_short_do = s2;
        this.var_int_if = n;
        this.cfr_renamed_5 = n2;
        this.cfr_renamed_4 = n3;
        this.cfr_renamed_3 = n4;
        am am2 = aa_0.am_do(s2);
        String string = aa_0.java_lang_String_do(am2);
        am am3 = am2;
        String string2 = "";
        if ((am3.var_byte_if != 10)) {
            string2 = MenuChinhAvatar.chuoiGiaTri;
            if ("   ".length() == ("  ".length() & ("  ".length() ^ -" ".length()))) {
                return;
            }
        } else if ((am3.var_byte_if != 20)) {
            string2 = MenuChinhAvatar.cu;
            if (((0x6D ^ 0x3E) & ~(0xC1 ^ 0x92)) >= "   ".length()) {
                return;
            }
        } else if ((am3.var_byte_if != 40)) {
            string2 = MenuChinhAvatar.bK;
            } else if ((am3.var_byte_if != 50)) {
            string2 = MenuChinhAvatar.var_java_lang_String_const;
        }
        this.chuoiGiaTri = string2 + string;
        this.var_fl_0_do = (fl_0)fo.fo_do().cfr_renamed_4;
        fo.fo_do().cfr_renamed_4 = (int)new fl_0("Tắt Auto", 0, gg_0.var_gg_0_do);
    }

    public final String cfr_renamed_0() {
        return this.chuoiGiaTri;
    }

            public final String java_lang_String_for() {
        String string = "Số lần nâng cấp: ";
        if (cl.boolean_do(this.var_int_if)) {
            string = string + this.soLuongKhoa + "/" + this.var_int_if;
            if ((0x23 ^ 0x27) > (0x28 ^ 0x2C)) {
                return null;
            }
        } else {
            string = string + this.soLuongKhoa;
        }
        return string;
    }

    public final void (int n != String object) {
        if ((soLuong >= 2000000000)) {
            return;
        }
        object = fh.ef_do(n);
        if ((object != null) && cl.cfr_renamed_0(((DuLieuNguoiChoi)object).soLuong.equals("tho.kim.hoan") ? 1 : 0)) {
            soLuong = n;
        }
    }

    protected final void d_() {
        if ((this.dangChayAuto)) {
            if (!(this.coKichHoat)) {
                GameCanvas.hienThongBaoPopup("Đã tắt Auto!\n" + this.java_lang_String_for());
            }
            this.cfr_renamed_3();
            AutoController.tatAuto();
            return;
        }
        if ((this.var_short_do < 0)) {
            this.cfr_renamed_3();
            AutoController.tatAuto();
            return;
        }
        if ((GameCanvas.var_en_do != fo.fo_do())) {
            this.cfr_renamed_3();
            AutoController.tatAuto();
            return;
        }
        if (cl.boolean_do((System.currentTimeMillis() - this.var_long_if != 30000L))) {
            this.var_long_if = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, 2, 0);
            TienIchGame.void_if(250L);
        }
        fn.fn_do().cfr_renamed_1(this.cfr_renamed_5, this.cfr_renamed_4, this.cfr_renamed_3);
        if ((TienIchGame.cfr_renamed_8(5000L))) {
            if ((this.coTrangThai)) {
                this.coTrangThai = 0;
                TienIchGame.void_if(soXu);
                return;
            }
            if ((this.coKichHoat)) {
                this.dangChayAuto = 1;
                return;
            }
            this.soLuongKhoa += 1;
            if (cl.boolean_do(this.var_int_if) && (this.soLuongKhoa >= this.var_int_if)) {
                GameCanvas.hienThongBaoPopup("Đã dừng Auto!\n" + this.java_lang_String_for());
                this.dangChayAuto = 1;
                return;
            }
            TienIchGame.void_if(soXu);
        }
    }

        public final void cfr_renamed_3() {
        this.var_short_do = (short)-1;
        fo.fo_do().cfr_renamed_4 = (int)this.var_fl_0_do;
    }

    public final String toString() {
        return "Auto nâng cấp";
    }

            public final boolean boolean_do(String string) {
        if ((string.startsWith("Ghép đồ thất bại"))) {
            TienIchGame.void_int();
            return 1;
        }
        if ((string.startsWith("Bạn cần")) && (string.endsWith("để nâng cấp món đồ này"))) {
            this.coKichHoat = 1;
            if (cl.boolean_do(this.soLuongKhoa)) {
                GameCanvas.hienThongBaoPopup(string + "!\nĐã nâng cấp số lần: " + this.soLuongKhoa);
            }
            TienIchGame.void_int();
            return 0;
        }
        if ((string.equals("Chúc mừng bạn đã ghép đồ thành công"))) {
            this.coKichHoat = 1;
            GameCanvas.hienThongBaoPopup(string + "!\nSố lần nâng cấp: " + (this.soLuongKhoa + 1));
            TienIchGame.void_int();
            return 1;
        }
        if ((string.startsWith("Có lỗi xảy ra"))) {
            this.coTrangThai = 1;
            TienIchGame.void_int();
            return 1;
        }
        return super.boolean_do(string);
    }
}

