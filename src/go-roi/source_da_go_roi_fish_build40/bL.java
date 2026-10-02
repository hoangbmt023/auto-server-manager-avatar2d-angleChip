/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public final class bL
extends NhiemVuAutoBase {
    public static int soLuong;
    public static long soXu;
    private final int var_int_if;
    private final int soLuongKhoa;
    private final Vector var_java_util_Vector_do;
    private long var_long_if;
    private final int cfr_renamed_3;
    private static final int[] mangSoNguyen;
    private final Vector var_java_util_Vector_if;
    private final int cfr_renamed_4;
    private String chuoiGiaTri;
    private final int cfr_renamed_5;
    private long var_long_for;

            static {
        bL.cfr_renamed_4();
        soXu = 0L;
        soLuong = 0;
    }

    private static boolean boolean_do(int n) {
        return n >= 0;
    }

    public bL(int n) {
        this.var_int_if = n;
        this.var_java_util_Vector_if = new Vector();
        this.var_java_util_Vector_do = new Vector();
        this.cfr_renamed_4 = fh.var_int_char;
        this.cfr_renamed_5 = go_0.var_byte_do;
        this.soLuongKhoa = AngelChip.duLieuNguoiChoi.var_short_for;
        this.cfr_renamed_3 = AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0;
        this.chuoiGiaTri = null;
        soLuong = 0;
        this.cfr_renamed_6();
    }

    public final void d_() {
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((fh.var_int_char == this.cfr_renamed_4)) {
            long l;
            if ((go_0.var_byte_do != this.cfr_renamed_5)) {
                fh.cfr_renamed_9 = this.soLuongKhoa;
                fh.var_int_try = this.cfr_renamed_3;
                fn.fn_do().cfr_renamed_3(this.cfr_renamed_4, this.cfr_renamed_5);
                if ((TienIchGame.boolean_do(5000L))) {
                    TienIchGame.void_if(1500L);
                }
                return;
            }
            long l2 = System.currentTimeMillis() - soXu;
            if ((TienIchGame.cfr_renamed_4(fh.var_int_char))) {
                l = 2000L;
                if (((0xBE ^ 0xB2) & ~(0x8F ^ 0x83)) != ((0x69 ^ 0x7A) & ~(0xA0 ^ 0xB3))) {
                    return;
                }
            } else {
                l = 6000L;
            }
            if (bL.cfr_renamed_2((l2 < l))) {
                Object object;
                int n;
                bL bL2;
                block30: {
                    bL2 = this;
                    n = 0;
                    while ((n < fh.var_java_util_Vector_case.size())) {
                        bm bm2 = (bm)fh.var_java_util_Vector_case.elementAt(n);
                        if ((bm2 != null) && (bm2.var_byte_if == 0) && bL.cfr_renamed_4(((DuLieuNguoiChoi)bm2).soLuong) && bL.cfr_renamed_1(bm2 = (DuLieuNguoiChoi)fh.var_java_util_Vector_case.elementAt(n)) && bL.cfr_renamed_4(((DuLieuNguoiChoi)bm2).var_int_class) && bL.cfr_renamed_3(((DuLieuNguoiChoi)bm2).var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto) && bL.cfr_renamed_1(((DuLieuNguoiChoi)bm2).var_short_goto, 2000000000) && bL.cfr_renamed_4(bL2.var_java_util_Vector_if.contains(((DuLieuNguoiChoi)bm2).soLuong) ? 1 : 0) && bL.cfr_renamed_4(bL2.var_java_util_Vector_do.contains(((DuLieuNguoiChoi)bm2).soLuong) ? 1 : 0) && (!(bL2.var_int_if != -1) || bL.cfr_renamed_0(bL2.var_int_if, ((DuLieuNguoiChoi)bm2).var_short_goto))) {
                            object = bm2;
                            if (-" ".length() >= 0) {
                                return;
                            }
                            break block30;
                        }
                        ++n;
                        if ("   ".length() != 0) continue;
                        return;
                    }
                    object = bL2 = null;
                }
                if ((object != null)) {
                    if ((this.var_int_if == -1) && bL.cfr_renamed_4(this.var_java_util_Vector_if.contains(((DuLieuNguoiChoi)((Object)bL2)).soLuong) ? 1 : 0)) {
                        this.var_java_util_Vector_if.addElement(((DuLieuNguoiChoi)((Object)bL2)).soLuong);
                    }
                    if (!bL.cfr_renamed_2(Math.abs(AngelChip.duLieuNguoiChoi.var_short_for - ((DuLieuNguoiChoi)((Object)bL2)).var_short_for), 100) || bL.cfr_renamed_4(Math.abs(AngelChip.duLieuNguoiChoi.var_boolean_int - ((DuLieuNguoiChoi)((Object)bL2)).var_boolean_int), 100)) {
                        int n2;
                        this.var_long_if = System.currentTimeMillis();
                        if (bL.cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, ((DuLieuNguoiChoi)((Object)bL2)).var_short_for)) {
                            n2 = ((DuLieuNguoiChoi)((Object)bL2)).var_short_for - 12;
                            } else {
                            n2 = ((DuLieuNguoiChoi)((Object)bL2)).var_short_for + 12;
                        }
                        n = n2;
                        AngelChip.duLieuNguoiChoi.void_do(n, ((DuLieuNguoiChoi)((Object)bL2)).var_boolean_int ? 1 : 0);
                        fn.fn_do().cfr_renamed_1(n, ((DuLieuNguoiChoi)((Object)bL2)).var_boolean_int ? 1 : 0, 2, 0);
                        TienIchGame.void_if(100L);
                    }
                    soXu = System.currentTimeMillis();
                    this.chuoiGiaTri = (String)((DuLieuNguoiChoi)((Object)bL2)).soLuong;
                    fn.fn_do().void_if(((DuLieuNguoiChoi)((Object)bL2)).var_short_goto, 101);
                    if ((TienIchGame.cfr_renamed_13(5000L))) {
                        ((NhiemVuAutoBase)this).cfr_renamed_3 = this.var_long_if = System.currentTimeMillis();
                        return;
                    }
                } else {
                    if (!(this.var_java_util_Vector_if.isEmpty())) {
                        this.var_java_util_Vector_if.removeAllElements();
                    }
                    if (bL.cfr_renamed_2(bL.cfr_renamed_1(System.currentTimeMillis() - this.var_long_if, 15000L + (long)(TienIchGame.int_do(1, 30) * 1000)))) {
                        ((NhiemVuAutoBase)this).cfr_renamed_3 = this.var_long_if = System.currentTimeMillis();
                        AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
                        fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, 2, 0);
                        TienIchGame.void_if(1000L);
                    }
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
            if (bL.cfr_renamed_0((l < 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            if (" ".length() <= 0) {
                return;
            }
        } else if (bL.cfr_renamed_0((System.currentTimeMillis() - this.var_long_for < 3000L))) {
            return;
        }
        if (!(this.var_java_util_Vector_if.isEmpty())) {
            this.var_java_util_Vector_if.removeAllElements();
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

    public final void cfr_renamed_3() {
        if (!(TienIchGame.cfr_renamed_4(this.cfr_renamed_4)) && (!bL.boolean_do(this.cfr_renamed_4) || !(this.cfr_renamed_4 != 25) || !(this.cfr_renamed_4 <= 58) || !(ba.var_int_arr_arr_do != null) || (ba.var_int_arr_arr_do[this.cfr_renamed_4][0] == 0) && (ba.var_int_arr_arr_do[this.cfr_renamed_4][1] == 0))) {
            GameCanvas.hienThongBaoPopup("Không thể auto hôn ở map này!");
            return;
        }
        AutoController.cfr_renamed_1(this);
        TienIchGame.void_if("Bật auto hôn");
    }

            private static int (long l < long l2) {
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
            TienIchGame.cfr_renamed_12();
            return 1;
        }
        if ((string.startsWith("Không được hôn người đồng giới"))) {
            if ((this.chuoiGiaTri != null)) {
                if (!(this.var_java_util_Vector_do.contains(this.chuoiGiaTri))) {
                    this.var_java_util_Vector_do.addElement(this.chuoiGiaTri);
                }
                this.chuoiGiaTri = null;
            }
            TienIchGame.cfr_renamed_12();
            return 1;
        }
        if (!!(string.startsWith("Khu vực đã đầy")) || !!(string.startsWith("Đi chầm chậm thôi chứ bạn")) || (string.startsWith("Bạn đã ở khu vực này"))) {
            return 1;
        }
        return super.boolean_do(string);
    }

    public final void void_for() {
        super.void_for();
        this.cfr_renamed_6();
    }

            private static void cfr_renamed_4() {
        mangSoNguyen = new int[12];
        0 = (0x30 ^ 8 ^ (0x26 ^ 0x15)) & (9 ^ 0x3C ^ (0x34 ^ 0xA) ^ -" ".length());
        25 = 0x9A ^ 0x83;
        58 = 0x14 ^ 0x4E ^ (0x39 ^ 0x59);
        1 = " ".length();
        -1 = -" ".length();
        2000000000 = 0xFFFFB69B & 0x7735DD64;
        100 = 179 + 114 - 109 + 11 ^ 53 + 78 - -24 + 12;
        12 = 59 + 134 - 174 + 139 ^ 122 + 77 - 190 + 137;
        2 = "  ".length();
        101 = 0x74 ^ 0x11;
        30 = 0xB6 ^ 0xA8;
        1000 = 0xFFFF9BEE & 0x67F9;
    }

    private void cfr_renamed_6() {
        this.var_long_for = 0L;
        this.var_long_if = System.currentTimeMillis();
        if (!(this.var_java_util_Vector_if.isEmpty())) {
            this.var_java_util_Vector_if.removeAllElements();
        }
    }

    public final String toString() {
        return "Auto Kiss";
    }

        }

