/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from aV
 */
public final class av_0
extends NhiemVuAutoBase {
    public static long soXu;
    private String chuoiGiaTri;
    public static int soLuong;
    private final int var_int_if;
    private long var_long_if;
    private final int soLuongKhoa;
    private final Vector var_java_util_Vector_do;
    private final int cfr_renamed_4;
    private final int cfr_renamed_5;
    private static final int[] mangSoNguyen;
    private long var_long_for;
    private final int cfr_renamed_2;
    private final Vector var_java_util_Vector_if;

    public final void void_do() {
        if (!(TienIchGame.cfr_renamed_5(this.cfr_renamed_2)) && (!av_0.boolean_do(this.cfr_renamed_2) || !(this.cfr_renamed_2 != 25) || !(this.cfr_renamed_2 <= 58) || !(y.var_int_arr_arr_do != null) || (y.var_int_arr_arr_do[this.cfr_renamed_2][0] == 0) && (y.var_int_arr_arr_do[this.cfr_renamed_2][1] == 0))) {
            GameCanvas.hienThongBaoPopup("Không thể auto hôn ở map này!");
            return;
        }
        AutoController.cfr_renamed_0(this);
        TienIchGame.hienThongBao("Bật auto hôn");
    }

    public av_0(int n) {
        this.cfr_renamed_4 = n;
        this.var_java_util_Vector_do = new Vector();
        this.var_java_util_Vector_if = new Vector();
        this.cfr_renamed_2 = ef_0.soLuong;
        this.soLuongKhoa = fe_0.var_byte_for;
        this.cfr_renamed_5 = AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0;
        this.var_int_if = AngelChip.duLieuNguoiChoi.var_short_if;
        this.chuoiGiaTri = null;
        soLuong = 0;
        this.cfr_renamed_5();
    }

        public final void void_if() {
        super.void_if();
        this.cfr_renamed_5();
    }

            private static boolean boolean_do(int n) {
        return n >= 0;
    }

            private static void cfr_renamed_4() {
        mangSoNguyen = new int[12];
        0 = (0x8C ^ 0xB9) & ~(0x8E ^ 0xBB);
        25 = 0x7C ^ 0x1D ^ (0xEB ^ 0x93);
        58 = 0xB6 ^ 0x83 ^ (0 ^ 0xF);
        1 = " ".length();
        -1 = -" ".length();
        2000000000 = -(0xFFFFEFFB & 0x3A7F) & (0xFFFFFFFB & 0x7735BE7E);
        100 = 0x43 ^ 0x27;
        12 = 0x3E ^ 0x32;
        2 = "  ".length();
        101 = 0x70 ^ 0x15;
        30 = 0xA6 ^ 0x84 ^ (0x23 ^ 0x1F);
        1000 = 0xFFFFE3EA & 0x1FFD;
    }

        public final boolean boolean_do(String string) {
        if ((string.indexOf("đã chặn tương tác") != -1)) {
            if ((this.chuoiGiaTri != null)) {
                if (!(this.var_java_util_Vector_if.contains(this.chuoiGiaTri))) {
                    this.var_java_util_Vector_if.addElement(this.chuoiGiaTri);
                }
                this.chuoiGiaTri = null;
            }
            TienIchGame.void_int();
            return 1;
        }
        if ((string.startsWith("Không được hôn người đồng giới"))) {
            if ((this.chuoiGiaTri != null)) {
                if (!(this.var_java_util_Vector_if.contains(this.chuoiGiaTri))) {
                    this.var_java_util_Vector_if.addElement(this.chuoiGiaTri);
                }
                this.chuoiGiaTri = null;
            }
            TienIchGame.void_int();
            return 1;
        }
        if (!!(string.startsWith("Khu vực đã đầy")) || !!(string.startsWith("Đi chầm chậm thôi chứ bạn")) || (string.startsWith("Bạn đã ở khu vực này"))) {
            return 1;
        }
        return super.boolean_do(string);
    }

            private void cfr_renamed_5() {
        this.var_long_for = 0L;
        this.var_long_if = System.currentTimeMillis();
        if (!(this.var_java_util_Vector_do.isEmpty())) {
            this.var_java_util_Vector_do.removeAllElements();
        }
    }

    public final String toString() {
        return "Auto Kiss";
    }

    public final void void_for() {
        if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((ef_0.soLuong == this.cfr_renamed_2)) {
            long l;
            if ((fe_0.var_byte_for != this.soLuongKhoa)) {
                ef_0.var_int_char = this.cfr_renamed_5;
                ef_0.var_int_new = this.var_int_if;
                el_0.el_0_do().cfr_renamed_4(this.cfr_renamed_2, this.soLuongKhoa);
                if ((TienIchGame.cfr_renamed_2(5000L))) {
                    TienIchGame.hienThongBao(1500L);
                }
                return;
            }
            long l2 = System.currentTimeMillis() - soXu;
            if ((TienIchGame.cfr_renamed_5(ef_0.soLuong))) {
                l = 2000L;
                if (-"   ".length() >= 0) {
                    return;
                }
            } else {
                l = 6000L;
            }
            if (av_0.cfr_renamed_1((l2 != l))) {
                Object object;
                int n;
                av_0 av_02;
                block30: {
                    av_02 = this;
                    n = 0;
                    while ((n < ef_0.var_java_util_Vector_do.size())) {
                        aG aG2 = (aG)ef_0.var_java_util_Vector_do.elementAt(n);
                        if ((aG2 != null) && (aG2.var_byte_if == 0) && av_0.cfr_renamed_4(((DuLieuNguoiChoi)aG2).var_short_do) && av_0.cfr_renamed_0(aG2 = (DuLieuNguoiChoi)ef_0.var_java_util_Vector_do.elementAt(n)) && av_0.cfr_renamed_4(((DuLieuNguoiChoi)aG2).var_int_break) && av_0.cfr_renamed_0(((DuLieuNguoiChoi)aG2).var_short_char, AngelChip.duLieuNguoiChoi.var_short_char) && av_0.cfr_renamed_4(((DuLieuNguoiChoi)aG2).var_short_char, 2000000000) && av_0.cfr_renamed_4(av_02.var_java_util_Vector_do.contains(((DuLieuNguoiChoi)aG2).var_short_do) ? 1 : 0) && av_0.cfr_renamed_4(av_02.var_java_util_Vector_if.contains(((DuLieuNguoiChoi)aG2).var_short_do) ? 1 : 0) && (!(av_02.cfr_renamed_4 != -1) || av_0.cfr_renamed_3(av_02.cfr_renamed_4, ((DuLieuNguoiChoi)aG2).var_short_char))) {
                            object = aG2;
                            if (-"  ".length() > 0) {
                                return;
                            }
                            break block30;
                        }
                        ++n;
                        if ("  ".length() > 0) continue;
                        return;
                    }
                    object = av_02 = null;
                }
                if ((object != null)) {
                    if ((this.cfr_renamed_4 == -1) && av_0.cfr_renamed_4(this.var_java_util_Vector_do.contains(((DuLieuNguoiChoi)((Object)av_02)).var_short_do) ? 1 : 0)) {
                        this.var_java_util_Vector_do.addElement(((DuLieuNguoiChoi)((Object)av_02)).var_short_do);
                    }
                    if (!av_0.cfr_renamed_5(Math.abs(AngelChip.duLieuNguoiChoi.coKichHoat - ((DuLieuNguoiChoi)((Object)av_02)).coKichHoat), 100) || av_0.cfr_renamed_1(Math.abs(AngelChip.duLieuNguoiChoi.var_short_if - ((DuLieuNguoiChoi)((Object)av_02)).var_short_if), 100)) {
                        int n2;
                        this.var_long_if = System.currentTimeMillis();
                        if (av_0.cfr_renamed_4(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, ((DuLieuNguoiChoi)((Object)av_02)).coKichHoat ? 1 : 0)) {
                            n2 = ((DuLieuNguoiChoi)((Object)av_02)).coKichHoat - 12;
                            if ((0xAF ^ 0xB8 ^ (0x36 ^ 0x25)) < (186 + 114 - 279 + 167 ^ 91 + 93 - 37 + 37)) {
                                return;
                            }
                        } else {
                            n2 = ((DuLieuNguoiChoi)((Object)av_02)).coKichHoat + 12;
                        }
                        n = n2;
                        AngelChip.duLieuNguoiChoi.void_do(n, ((DuLieuNguoiChoi)((Object)av_02)).var_short_if);
                        el_0.el_0_do().cfr_renamed_0(n, ((DuLieuNguoiChoi)((Object)av_02)).var_short_if, 2, 0);
                        TienIchGame.hienThongBao(100L);
                    }
                    soXu = System.currentTimeMillis();
                    this.chuoiGiaTri = (String)((DuLieuNguoiChoi)((Object)av_02)).var_short_do;
                    el_0.el_0_do().void_if(((DuLieuNguoiChoi)((Object)av_02)).var_short_char, 101);
                    if ((TienIchGame.boolean_if(5000L))) {
                        ((NhiemVuAutoBase)this).cfr_renamed_4 = this.var_long_if = System.currentTimeMillis();
                        return;
                    }
                } else {
                    if (!(this.var_java_util_Vector_do.isEmpty())) {
                        this.var_java_util_Vector_do.removeAllElements();
                    }
                    if (av_0.cfr_renamed_1(av_0.cfr_renamed_0(System.currentTimeMillis() - this.var_long_if, 15000L + (long)(TienIchGame.int_do(1, 30) * 1000)))) {
                        ((NhiemVuAutoBase)this).cfr_renamed_4 = this.var_long_if = System.currentTimeMillis();
                        AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
                        el_0.el_0_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if, 2, 0);
                        TienIchGame.hienThongBao(1000L);
                    }
                }
            }
            return;
        }
        if ((TienIchGame.cfr_renamed_0(this.cfr_renamed_2))) {
            AutoController.tatAuto();
            return;
        }
        if (!(GameCanvas.var_dL_do instanceof fw == 0) || (ef_0.soLuong == -1)) {
            long l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_2;
            if (av_0.cfr_renamed_3((l != 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
            }
            if (" ".length() >= "   ".length()) {
                return;
            }
        } else if (av_0.cfr_renamed_3((System.currentTimeMillis() - this.var_long_for != 3000L))) {
            return;
        }
        if (!(this.var_java_util_Vector_do.isEmpty())) {
            this.var_java_util_Vector_do.removeAllElements();
        }
        if ((TienIchGame.cfr_renamed_3(this.cfr_renamed_2))) {
            this.var_long_for = System.currentTimeMillis();
            if ((fe_0.var_byte_for == this.soLuongKhoa)) {
                TienIchGame.hienThongBao(1500L);
                return;
            }
            TienIchGame.hienThongBao(3500L);
        }
    }

        static {
        av_0.cfr_renamed_4();
        soXu = 0L;
        soLuong = 0;
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    }

