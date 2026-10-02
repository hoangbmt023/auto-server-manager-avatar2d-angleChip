/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public final class F
extends NhiemVuAutoBase {
    private final int var_int_if;
    private final int soLuongKhoa;
    private int cfr_renamed_4;
    private final int cfr_renamed_5;
    private String chuoiGiaTri;
    private final Vector var_java_util_Vector_do;
    private final Vector var_java_util_Vector_if;
    private static final int[] mangSoNguyen;
    private final int cfr_renamed_2;
    private long var_long_if;
    public static int soLuong;
    public static long soXu;
    private final int cfr_renamed_15;
    private long var_long_for;

        static {
        F.cfr_renamed_2();
        soLuong = 0;
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private void cfr_renamed_4() {
        this.cfr_renamed_4 = 100;
        this.var_long_if = 0L;
        this.var_long_for = System.currentTimeMillis();
        if (!(this.var_java_util_Vector_if.isEmpty())) {
            this.var_java_util_Vector_if.removeAllElements();
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void void_do() {
        if (!(TienIchGame.cfr_renamed_5(this.cfr_renamed_5)) && (!(this.cfr_renamed_5 >= 0) || !(this.cfr_renamed_5 != 25) || !(this.cfr_renamed_5 <= 58) || !(y.var_int_arr_arr_do != null) || (y.var_int_arr_arr_do[this.cfr_renamed_5][0] == 0) && (y.var_int_arr_arr_do[this.cfr_renamed_5][1] == 0))) {
            GameCanvas.hienThongBaoPopup("Không thể auto đánh nhau ở map này!");
            return;
        }
        AutoController.cfr_renamed_0(this);
        if ((AngelChip.fontRenderer.cfr_renamed_3 <= 80)) {
            TienIchGame.hienThongBao("Bật auto đánh");
        }
    }

        public final String toString() {
        return "Auto Attack";
    }

                public F(int n) {
        this.soLuongKhoa = n;
        this.var_java_util_Vector_if = new Vector();
        this.var_java_util_Vector_do = new Vector();
        this.cfr_renamed_5 = ef_0.soLuong;
        this.cfr_renamed_2 = fe_0.var_byte_for;
        this.cfr_renamed_15 = AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0;
        this.var_int_if = AngelChip.duLieuNguoiChoi.var_short_if;
        this.chuoiGiaTri = null;
        soLuong = 0;
        this.cfr_renamed_4();
    }

    private void cfr_renamed_5() {
        if (F.boolean_do(F.cfr_renamed_1(System.currentTimeMillis() - this.var_long_for, 15000L + (long)(TienIchGame.int_do(1, 30) * 1000)))) {
            ((NhiemVuAutoBase)this).cfr_renamed_4 = this.var_long_for = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
            el_0.el_0_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if, 2, 0);
            TienIchGame.hienThongBao(1000L);
        }
    }

        public final void void_if() {
        super.void_if();
        this.cfr_renamed_4();
    }

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[19];
        0 = (0x30 ^ 0x66) & ~(0xE5 ^ 0xB3);
        25 = 14 + 45 - -76 + 15 ^ 90 + 43 - 98 + 108;
        58 = 0xF4 ^ 0x98 ^ (0x54 ^ 2);
        1 = " ".length();
        80 = 0x6A ^ 0x3A;
        100 = 0x74 ^ 0x10;
        -1 = -" ".length();
        30 = 0x43 ^ 0x6B ^ (0x68 ^ 0x5E);
        1000 = -(0xFFFFFC96 & 0x1F7B) & (0xFFFFDFFD & 0x3FFB);
        2 = "  ".length();
        5 = 0x9B ^ 0x9E;
        2000 = 0xFFFFE7F4 & 0x1FDB;
        480 = -(0xFFFFF77E & 0x2E95) & (0xFFFFA7FB & 0x7FF7);
        49 = 0x8F ^ 0xBE;
        8 = 0x1B ^ 0x74 ^ (1 ^ 0x66);
        10 = 8 + 58 - 13 + 80 ^ 4 + 71 - 70 + 138;
        101 = 0xB ^ 0x6E;
        2000000000 = -(0xFFFFEEFF & 0x3BFB) & (0xFFFFFFFA & 0x7735BEFF);
        12 = 34 + 21 - -74 + 14 ^ 24 + 86 - 55 + 76;
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final boolean boolean_do(String string) {
        if ((string.indexOf("đã chặn tương tác") != -1)) {
            if ((this.chuoiGiaTri != null)) {
                if (!(this.var_java_util_Vector_do.contains(this.chuoiGiaTri))) {
                    this.var_java_util_Vector_do.addElement(this.chuoiGiaTri);
                }
                this.chuoiGiaTri = null;
            }
            TienIchGame.void_int();
            return 1;
        }
        if ((string.startsWith("Bạn đã ăn"))) {
            TienIchGame.cfr_renamed_11();
            return 1;
        }
        if ((string.startsWith("Bạn không thể đánh nhau"))) {
            if ((string.indexOf("sức khỏe nhỏ hơn") != -1)) {
                AngelChip.fontRenderer.cfr_renamed_5 = (byte)0;
                return 1;
            }
            if ((string.indexOf("gây rối lớn hơn") != -1)) {
                AngelChip.fontRenderer.cfr_renamed_3 = (byte)100;
                return 1;
            }
        }
        if (!!(string.startsWith("Khu vực đã đầy")) || !!(string.startsWith("Đi chầm chậm thôi chứ bạn")) || (string.startsWith("Bạn đã ở khu vực này"))) {
            return 1;
        }
        return super.boolean_do(string);
    }

    public final void void_for() {
        block48: {
            block51: {
                F f;
                block50: {
                    block49: {
                        if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
                            return;
                        }
                        if (!(AngelChip.fontRenderer.cfr_renamed_5 <= 5)) break block48;
                        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] < 2000)) {
                            AutoController.tatAuto();
                            GameCanvas.hienThongBaoPopup("Không đủ xu mua bánh mỳ");
                            return;
                        }
                        if ((TienIchGame.cfr_renamed_0(this.cfr_renamed_5))) {
                            AutoController.tatAuto();
                            GameCanvas.hienThongBaoPopup("Sức khỏe quá thấp. Hãy ăn bánh mỳ!");
                            return;
                        }
                        f = this;
                        if ((ef_0.soLuong == 0)) {
                            if ((AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0 != 480) && (AngelChip.duLieuNguoiChoi.var_short_if != 49)) {
                                AngelChip.duLieuNguoiChoi.void_do(480, 49);
                                el_0.el_0_do().cfr_renamed_0(480, 49, 2, 0);
                                TienIchGame.hienThongBao(1000L);
                            }
                            el_0.el_0_do().cfr_renamed_0(8);
                            if ((TienIchGame.cfr_renamed_4(15000L))) {
                                f.var_long_for = System.currentTimeMillis();
                                TienIchGame.hienThongBao(1500L);
                            }
                            return;
                        }
                        if ((GameCanvas.var_dL_do instanceof fw == 0) && !(ef_0.soLuong == -1)) break block49;
                        long l = System.currentTimeMillis() - ((NhiemVuAutoBase)f).cfr_renamed_2;
                        if (F.cfr_renamed_1((l != 2000L))) {
                            TienIchGame.hienThongBao(2000L - l);
                        }
                        if (-" ".length() >= (46 + 179 - 142 + 113 ^ 145 + 27 - 161 + 181)) {
                            return;
                        }
                        break block50;
                    }
                    if (!F.cfr_renamed_3((System.currentTimeMillis() - f.var_long_if != 3500L))) break block51;
                }
                if ((TienIchGame.cfr_renamed_3(0))) {
                    f.var_long_if = f.var_long_for = System.currentTimeMillis();
                    TienIchGame.hienThongBao(1000L);
                }
            }
            return;
        }
        if ((ef_0.soLuong == this.cfr_renamed_5)) {
            long l;
            if ((fe_0.var_byte_for != this.cfr_renamed_2)) {
                ef_0.var_int_char = this.cfr_renamed_15;
                ef_0.var_int_new = this.var_int_if;
                el_0.el_0_do().cfr_renamed_4(this.cfr_renamed_5, this.cfr_renamed_2);
                if ((TienIchGame.cfr_renamed_2(5000L))) {
                    TienIchGame.hienThongBao(1500L);
                }
                return;
            }
            long l2 = System.currentTimeMillis() - soXu;
            if ((TienIchGame.cfr_renamed_5(ef_0.soLuong))) {
                l = 2000L;
                if ("  ".length() <= ((0x10 ^ 0x28) & ~(0x1A ^ 0x22))) {
                    return;
                }
            } else {
                l = 6000L;
            }
            if (F.boolean_do((l2 != l))) {
                Object object;
                F f;
                block47: {
                    if ((this.cfr_renamed_4 != 100) && (AngelChip.fontRenderer.cfr_renamed_3 <= 10)) {
                        this.cfr_renamed_4 = 100;
                        if (-" ".length() > 0) {
                            return;
                        }
                    } else if ((this.cfr_renamed_4 != 101) && (AngelChip.fontRenderer.cfr_renamed_3 > 80)) {
                        this.cfr_renamed_4 = 101;
                    }
                    if ((this.cfr_renamed_4 == 101)) {
                        soXu = System.currentTimeMillis();
                        TienIchGame.cfr_renamed_0(100, "Điểm gây rối quá cao cần được hôn!");
                        this.cfr_renamed_5();
                        return;
                    }
                    f = this;
                    int n = 0;
                    while ((n < ef_0.var_java_util_Vector_do.size())) {
                        DuLieuNguoiChoi dd_02;
                        aG aG2 = (aG)ef_0.var_java_util_Vector_do.elementAt(n);
                        if ((aG2 != null) && (aG2.var_byte_if == 0) && F.cfr_renamed_5(((DuLieuNguoiChoi)aG2).var_short_do) && F.cfr_renamed_0(dd_02 = (DuLieuNguoiChoi)ef_0.var_java_util_Vector_do.elementAt(n)) && (dd_02.var_int_break == 0) && (dd_02.var_short_char != AngelChip.duLieuNguoiChoi.var_short_char) && (dd_02.var_short_char < 2000000000) && !(f.var_java_util_Vector_if.contains(dd_02.var_short_do)) && !(f.var_java_util_Vector_do.contains(dd_02.var_short_do)) && (!(f.soLuongKhoa != -1) || (f.soLuongKhoa == dd_02.var_short_char))) {
                            object = dd_02;
                            if (-" ".length() >= 0) {
                                return;
                            }
                            break block47;
                        }
                        ++n;
                        if (" ".length() == " ".length()) continue;
                        return;
                    }
                    object = f = null;
                }
                if ((object != null)) {
                    if ((this.soLuongKhoa == -1) && F.cfr_renamed_5(this.var_java_util_Vector_if.contains(((DuLieuNguoiChoi)((Object)f)).var_short_do) ? 1 : 0)) {
                        this.var_java_util_Vector_if.addElement(((DuLieuNguoiChoi)((Object)f)).var_short_do);
                    }
                    if (!F.cfr_renamed_4(Math.abs(AngelChip.duLieuNguoiChoi.coKichHoat - ((DuLieuNguoiChoi)((Object)f)).coKichHoat), 100) || F.cfr_renamed_1(Math.abs(AngelChip.duLieuNguoiChoi.var_short_if - ((DuLieuNguoiChoi)((Object)f)).var_short_if), 100)) {
                        int n;
                        this.var_long_for = System.currentTimeMillis();
                        if (F.cfr_renamed_3(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, ((DuLieuNguoiChoi)((Object)f)).coKichHoat ? 1 : 0)) {
                            n = ((DuLieuNguoiChoi)((Object)f)).coKichHoat - 12;
                            if (-" ".length() >= (0x80 ^ 0x84)) {
                                return;
                            }
                        } else {
                            n = ((DuLieuNguoiChoi)((Object)f)).coKichHoat + 12;
                        }
                        int n2 = n;
                        AngelChip.duLieuNguoiChoi.void_do(n2, ((DuLieuNguoiChoi)((Object)f)).var_short_if);
                        el_0.el_0_do().cfr_renamed_0(n2, ((DuLieuNguoiChoi)((Object)f)).var_short_if, 2, 0);
                        TienIchGame.hienThongBao(100L);
                    }
                    soXu = System.currentTimeMillis();
                    this.chuoiGiaTri = (String)((DuLieuNguoiChoi)((Object)f)).var_short_do;
                    el_0.el_0_do().void_if(((DuLieuNguoiChoi)((Object)f)).var_short_char, 100);
                    if ((TienIchGame.boolean_if(5000L))) {
                        ((NhiemVuAutoBase)this).cfr_renamed_4 = this.var_long_for = System.currentTimeMillis();
                        return;
                    }
                } else {
                    if (!(this.var_java_util_Vector_if.isEmpty())) {
                        this.var_java_util_Vector_if.removeAllElements();
                    }
                    this.cfr_renamed_5();
                }
            }
            return;
        }
        if ((TienIchGame.cfr_renamed_0(this.cfr_renamed_5))) {
            AutoController.tatAuto();
            return;
        }
        if (!(GameCanvas.var_dL_do instanceof fw == 0) || (ef_0.soLuong == -1)) {
            long l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_2;
            if (F.cfr_renamed_1((l != 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
            }
            if (-" ".length() == (0x97 ^ 0x93)) {
                return;
            }
        } else if (F.cfr_renamed_1((System.currentTimeMillis() - this.var_long_if != 3500L))) {
            return;
        }
        if (!(this.var_java_util_Vector_if.isEmpty())) {
            this.var_java_util_Vector_if.removeAllElements();
        }
        if ((TienIchGame.cfr_renamed_3(this.cfr_renamed_5))) {
            this.var_long_if = System.currentTimeMillis();
            if ((fe_0.var_byte_for == this.cfr_renamed_2)) {
                TienIchGame.hienThongBao(1500L);
                return;
            }
            TienIchGame.hienThongBao(3500L);
        }
    }

            }

