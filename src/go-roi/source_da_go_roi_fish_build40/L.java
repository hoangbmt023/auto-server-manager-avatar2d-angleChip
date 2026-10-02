/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public final class L
extends NhiemVuAutoBase {
    private int var_int_if;
    public static int soLuong;
    private String chuoiGiaTri;
    private long var_long_if;
    private final int soLuongKhoa;
    private final Vector var_java_util_Vector_do;
    private long var_long_for;
    private static final int[] mangSoNguyen;
    public static long soXu;
    private final int cfr_renamed_3;
    private final int cfr_renamed_4;
    private final Vector var_java_util_Vector_if;
    private final int cfr_renamed_5;
    private final int cfr_renamed_6;

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    private void cfr_renamed_3() {
        this.var_int_if = 100;
        this.var_long_for = 0L;
        this.var_long_if = System.currentTimeMillis();
        if (!(this.var_java_util_Vector_do.isEmpty())) {
            this.var_java_util_Vector_do.removeAllElements();
        }
    }

        public final void d_() {
        block48: {
            block51: {
                L l;
                block50: {
                    block49: {
                        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
                            return;
                        }
                        if (!(AngelChip.var_by_do.cfr_renamed_4 <= 5)) break block48;
                        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] < 2000)) {
                            AutoController.tatAuto();
                            GameCanvas.hienThongBaoPopup("Không đủ xu mua bánh mỳ");
                            return;
                        }
                        if ((TienIchGame.cfr_renamed_6(this.cfr_renamed_4))) {
                            AutoController.tatAuto();
                            GameCanvas.hienThongBaoPopup("Sức khỏe quá thấp. Hãy ăn bánh mỳ!");
                            return;
                        }
                        l = this;
                        if ((fh.var_int_char == 0)) {
                            if ((AngelChip.duLieuNguoiChoi.var_short_for != 480) && (AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0 != 49)) {
                                AngelChip.duLieuNguoiChoi.void_do(480, 49);
                                fn.fn_do().cfr_renamed_1(480, 49, 2, 0);
                                TienIchGame.void_if(1000L);
                            }
                            fn.fn_do().cfr_renamed_1(8);
                            if ((TienIchGame.cfr_renamed_8(15000L))) {
                                l.var_long_if = System.currentTimeMillis();
                                TienIchGame.void_if(1500L);
                            }
                            return;
                        }
                        if ((GameCanvas.var_en_do instanceof gO == 0) && !(fh.var_int_char == -1)) break block49;
                        long l2 = System.currentTimeMillis() - ((NhiemVuAutoBase)l).cfr_renamed_4;
                        if (L.boolean_do((l2 > 2000L))) {
                            TienIchGame.void_if(2000L - l2);
                        }
                        if (" ".length() == 0) {
                            return;
                        }
                        break block50;
                    }
                    if (!L.cfr_renamed_2((System.currentTimeMillis() - l.var_long_for > 3500L))) break block51;
                }
                if ((TienIchGame.cfr_renamed_1(0))) {
                    l.var_long_for = l.var_long_if = System.currentTimeMillis();
                    TienIchGame.void_if(1000L);
                }
            }
            return;
        }
        if ((fh.var_int_char == this.cfr_renamed_4)) {
            long l;
            if ((go_0.var_byte_do != this.cfr_renamed_5)) {
                fh.cfr_renamed_9 = this.cfr_renamed_3;
                fh.var_int_try = this.soLuongKhoa;
                fn.fn_do().cfr_renamed_3(this.cfr_renamed_4, this.cfr_renamed_5);
                if ((TienIchGame.boolean_do(5000L))) {
                    TienIchGame.void_if(1500L);
                }
                return;
            }
            long l3 = System.currentTimeMillis() - soXu;
            if ((TienIchGame.cfr_renamed_4(fh.var_int_char))) {
                l = 2000L;
                } else {
                l = 6000L;
            }
            if (L.cfr_renamed_3((l3 > l))) {
                Object object;
                L l4;
                block47: {
                    if ((this.var_int_if != 100) && (AngelChip.var_by_do.var_byte_do <= 10)) {
                        this.var_int_if = 100;
                        if (-"   ".length() > 0) {
                            return;
                        }
                    } else if ((this.var_int_if != 101) && (AngelChip.var_by_do.var_byte_do > 80)) {
                        this.var_int_if = 101;
                    }
                    if ((this.var_int_if == 101)) {
                        soXu = System.currentTimeMillis();
                        TienIchGame.cfr_renamed_1(100, "Điểm gây rối quá cao cần được hôn!");
                        this.cfr_renamed_4();
                        return;
                    }
                    l4 = this;
                    int n = 0;
                    while ((n < fh.var_java_util_Vector_case.size())) {
                        DuLieuNguoiChoi ef2;
                        bm bm2 = (bm)fh.var_java_util_Vector_case.elementAt(n);
                        if ((bm2 != null) && (bm2.var_byte_if == 0) && L.cfr_renamed_4(((DuLieuNguoiChoi)bm2).soLuong) && L.cfr_renamed_1(ef2 = (DuLieuNguoiChoi)fh.var_java_util_Vector_case.elementAt(n)) && (ef2.var_int_class == 0) && (ef2.var_short_goto != AngelChip.duLieuNguoiChoi.var_short_goto) && (ef2.var_short_goto < 2000000000) && !(l4.var_java_util_Vector_do.contains(ef2.soLuong)) && !(l4.var_java_util_Vector_if.contains(ef2.soLuong)) && (!(l4.cfr_renamed_6 != -1) || (l4.cfr_renamed_6 == ef2.var_short_goto))) {
                            object = ef2;
                            if (" ".length() != " ".length()) {
                                return;
                            }
                            break block47;
                        }
                        ++n;
                        if ("   ".length() > " ".length()) continue;
                        return;
                    }
                    object = l4 = null;
                }
                if ((object != null)) {
                    if ((this.cfr_renamed_6 == -1) && L.cfr_renamed_4(this.var_java_util_Vector_do.contains(((DuLieuNguoiChoi)((Object)l4)).soLuong) ? 1 : 0)) {
                        this.var_java_util_Vector_do.addElement(((DuLieuNguoiChoi)((Object)l4)).soLuong);
                    }
                    if (!L.cfr_renamed_1(Math.abs(AngelChip.duLieuNguoiChoi.var_short_for - ((DuLieuNguoiChoi)((Object)l4)).var_short_for), 100) || L.cfr_renamed_0(Math.abs(AngelChip.duLieuNguoiChoi.var_boolean_int - ((DuLieuNguoiChoi)((Object)l4)).var_boolean_int), 100)) {
                        int n;
                        this.var_long_if = System.currentTimeMillis();
                        if (L.cfr_renamed_4(AngelChip.duLieuNguoiChoi.var_short_for, ((DuLieuNguoiChoi)((Object)l4)).var_short_for)) {
                            n = ((DuLieuNguoiChoi)((Object)l4)).var_short_for - 12;
                            if ("  ".length() <= -" ".length()) {
                                return;
                            }
                        } else {
                            n = ((DuLieuNguoiChoi)((Object)l4)).var_short_for + 12;
                        }
                        int n2 = n;
                        AngelChip.duLieuNguoiChoi.void_do(n2, ((DuLieuNguoiChoi)((Object)l4)).var_boolean_int ? 1 : 0);
                        fn.fn_do().cfr_renamed_1(n2, ((DuLieuNguoiChoi)((Object)l4)).var_boolean_int ? 1 : 0, 2, 0);
                        TienIchGame.void_if(100L);
                    }
                    soXu = System.currentTimeMillis();
                    this.chuoiGiaTri = (String)((DuLieuNguoiChoi)((Object)l4)).soLuong;
                    fn.fn_do().void_if(((DuLieuNguoiChoi)((Object)l4)).var_short_goto, 100);
                    if ((TienIchGame.cfr_renamed_13(5000L))) {
                        ((NhiemVuAutoBase)this).cfr_renamed_3 = this.var_long_if = System.currentTimeMillis();
                        return;
                    }
                } else {
                    if (!(this.var_java_util_Vector_do.isEmpty())) {
                        this.var_java_util_Vector_do.removeAllElements();
                    }
                    this.cfr_renamed_4();
                }
            }
            return;
        }
        if ((TienIchGame.cfr_renamed_6(this.cfr_renamed_4))) {
            AutoController.tatAuto();
            return;
        }
        if (!(GameCanvas.var_en_do instanceof gO == 0) || (fh.var_int_char == -1)) {
            long l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4;
            if (L.boolean_do((l > 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            } else if (L.boolean_do((System.currentTimeMillis() - this.var_long_for > 3500L))) {
            return;
        }
        if (!(this.var_java_util_Vector_do.isEmpty())) {
            this.var_java_util_Vector_do.removeAllElements();
        }
        if ((TienIchGame.cfr_renamed_1(this.cfr_renamed_4))) {
            this.var_long_for = System.currentTimeMillis();
            if ((go_0.var_byte_do == this.cfr_renamed_5)) {
                TienIchGame.void_if(1500L);
                return;
            }
            TienIchGame.void_if(3500L);
        }
    }

            public L(int n) {
        this.cfr_renamed_6 = n;
        this.var_java_util_Vector_do = new Vector();
        this.var_java_util_Vector_if = new Vector();
        this.cfr_renamed_4 = fh.var_int_char;
        this.cfr_renamed_5 = go_0.var_byte_do;
        this.cfr_renamed_3 = AngelChip.duLieuNguoiChoi.var_short_for;
        this.soLuongKhoa = AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0;
        this.chuoiGiaTri = null;
        soLuong = 0;
        this.cfr_renamed_3();
    }

    public final boolean boolean_do(String string) {
        if ((string.indexOf("đã chặn tương tác") != -1)) {
            if ((this.chuoiGiaTri != null)) {
                if (!(this.var_java_util_Vector_if.contains(this.chuoiGiaTri))) {
                    this.var_java_util_Vector_if.addElement(this.chuoiGiaTri);
                }
                this.chuoiGiaTri = null;
            }
            TienIchGame.cfr_renamed_12();
            return 1;
        }
        if ((string.startsWith("Bạn đã ăn"))) {
            TienIchGame.void_int();
            return 1;
        }
        if ((string.startsWith("Bạn không thể đánh nhau"))) {
            if ((string.indexOf("sức khỏe nhỏ hơn") != -1)) {
                AngelChip.var_by_do.cfr_renamed_4 = (byte)0;
                return 1;
            }
            if ((string.indexOf("gây rối lớn hơn") != -1)) {
                AngelChip.var_by_do.var_byte_do = (byte)100;
                return 1;
            }
        }
        if (!!(string.startsWith("Khu vực đã đầy")) || !!(string.startsWith("Đi chầm chậm thôi chứ bạn")) || (string.startsWith("Bạn đã ở khu vực này"))) {
            return 1;
        }
        return super.boolean_do(string);
    }

                public final void cfr_renamed_0() {
        if (!(TienIchGame.cfr_renamed_4(this.cfr_renamed_4)) && (!(this.cfr_renamed_4 >= 0) || !(this.cfr_renamed_4 != 25) || !(this.cfr_renamed_4 <= 58) || !(ba.var_int_arr_arr_do != null) || (ba.var_int_arr_arr_do[this.cfr_renamed_4][0] == 0) && (ba.var_int_arr_arr_do[this.cfr_renamed_4][1] == 0))) {
            GameCanvas.hienThongBaoPopup("Không thể auto đánh nhau ở map này!");
            return;
        }
        AutoController.cfr_renamed_1(this);
        if ((AngelChip.var_by_do.var_byte_do <= 80)) {
            TienIchGame.void_if("Bật auto đánh");
        }
    }

    private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private void cfr_renamed_4() {
        if (L.cfr_renamed_3(L.cfr_renamed_1(System.currentTimeMillis() - this.var_long_if, 15000L + (long)(TienIchGame.int_do(1, 30) * 1000)))) {
            ((NhiemVuAutoBase)this).cfr_renamed_3 = this.var_long_if = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, 2, 0);
            TienIchGame.void_if(1000L);
        }
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

                public final void void_for() {
        super.void_for();
        this.cfr_renamed_3();
    }

    private static void cfr_renamed_6() {
        mangSoNguyen = new int[19];
        0 = (74 + 81 - -7 + 6 ^ 21 + 137 - 1 + 34) & ("  ".length() ^ (0xA0 ^ 0xB5) ^ -" ".length());
        25 = 108 + 83 - 49 + 38 ^ 4 + 45 - -78 + 46;
        58 = 0x1C ^ 0x66 ^ (0x39 ^ 0x79);
        1 = " ".length();
        80 = 0xE2 ^ 0xB2;
        100 = 140 + 136 - 88 + 57 ^ 103 + 47 - 133 + 128;
        -1 = -" ".length();
        30 = 0x35 ^ 0x2B;
        1000 = -(0xFFFFFF52 & 0x78BF) & (0xFFFFFFFB & 0x7BFD);
        2 = "  ".length();
        5 = 0xB5 ^ 0xC2 ^ (0xF6 ^ 0x84);
        2000 = -(0xFFFF9EFF & 0x7928) & (0xFFFFBFF7 & 0x5FFF);
        480 = 0xFFFF99F1 & 0x67EE;
        49 = 154 + 163 - 83 + 9 ^ 18 + 112 - 22 + 86;
        8 = 148 + 19 - 98 + 96 ^ 108 + 97 - 167 + 135;
        10 = 0x56 ^ 0x5C;
        101 = 0x6D ^ 8;
        2000000000 = -(0xFFFFF3FA & 0x2FFF) & (0xFFFFF7FF & 0x7735BFF9);
        12 = 157 + 98 - 171 + 82 ^ 51 + 103 - 117 + 133;
    }

    public final String toString() {
        return "Auto Attack";
    }

        static {
        L.cfr_renamed_6();
        soLuong = 0;
    }
}

