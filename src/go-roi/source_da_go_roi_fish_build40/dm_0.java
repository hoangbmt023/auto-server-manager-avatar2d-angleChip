/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from dM
 */
public final class dm_0
extends NhiemVuAutoBase {
    private byte var_byte_if;
    private short var_short_do;
    private boolean coTrangThai;
    public static dm_0 var_dm_0_do;
    public boolean dangChayAuto;
    private boolean coKichHoat;
    private boolean var_boolean_int;
    private static final int[] mangSoNguyen;
    public byte var_byte_do;
    public int soLuong = var_int_arr_if[0];
    private long soXu;
    public static int var_int_if;
    private int var_int_int;
    private static final int[] var_int_arr_if;
    public int soLuongKhoa;
    public String chuoiGiaTri;

        private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        static {
        dm_0.cfr_renamed_4();
        var_int_if = var_int_arr_if[0];
        mangSoNguyen = new int[var_int_arr_if[13]];
        var_dm_0_do = new dm_0();
        int n = var_int_arr_if[1];
        int n2 = var_int_arr_if[14];
        while ((n2 <= var_int_arr_if[15])) {
            if ((n < var_int_arr_if[13])) {
                dm_0.mangSoNguyen[n] = n2;
            }
            ++n;
            n2 += 3;
            if (-" ".length() <= 0) continue;
            break;
        }
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    public final short short_do() {
        return this.var_short_do;
    }

    private static void cfr_renamed_4() {
        var_int_arr_if = new int[16];
        dm_0.var_int_arr_if[0] = -" ".length();
        dm_0.var_int_arr_if[1] = (0x1D ^ 0x27) & ~(0x84 ^ 0xBE);
        dm_0.var_int_arr_if[2] = 0x1F ^ 0x6E ^ (0x27 ^ 0x5C);
        dm_0.var_int_arr_if[3] = 0x15 ^ 1;
        dm_0.var_int_arr_if[4] = 0x29 ^ 0x17 ^ (0x35 ^ 0x23);
        dm_0.var_int_arr_if[5] = 0x78 ^ 0x11 ^ (0x99 ^ 0xC2);
        dm_0.var_int_arr_if[6] = 0xFFFFB556 & 0x7735DEA9;
        dm_0.var_int_arr_if[7] = " ".length();
        dm_0.var_int_arr_if[8] = "  ".length();
        dm_0.var_int_arr_if[9] = 0x9D ^ 0x85 ^ (0x46 ^ 0x67);
        dm_0.var_int_arr_if[10] = 0x5C ^ 0x6C;
        dm_0.var_int_arr_if[11] = 0xFB ^ 0xC0;
        dm_0.var_int_arr_if[12] = 177 + 78 - 179 + 127 ^ 23 + 111 - 112 + 123;
        dm_0.var_int_arr_if[13] = 0xBC ^ 0x80;
        dm_0.var_int_arr_if[14] = "   ".length();
        dm_0.var_int_arr_if[15] = (0x75 ^ 0x5B) + (0xC3 ^ 0xC6) - -(0x1A ^ 0x75) + (0xB9 ^ 0xAB);
    }

        public final String cfr_renamed_0() {
        String string = "Số lần quay: ";
        if ((this.var_int_int > 0)) {
            string = string + this.soLuongKhoa + "/" + this.var_int_int;
            } else {
            string = string + this.soLuongKhoa;
        }
        return string;
    }

    public final void (short s2, int n, byte by2 != null) {
        this.dangChayAuto = var_int_arr_if[1];
        this.soLuong = var_int_arr_if[0];
        this.var_byte_if = (byte)var_int_arr_if[0];
        super.cfr_renamed_16();
        this.var_byte_do = by2;
        this.soLuongKhoa = var_int_arr_if[1];
        this.soXu = System.currentTimeMillis();
        this.var_boolean_int = var_int_arr_if[1];
        this.coKichHoat = var_int_arr_if[1];
        this.coTrangThai = var_int_arr_if[1];
        this.var_short_do = s2;
        this.var_int_int = n;
        am am2 = aa_0.am_do(s2);
        String string = aa_0.java_lang_String_do(am2);
        am am3 = am2;
        String string2 = "";
        if ((am3.var_byte_if == var_int_arr_if[2])) {
            string2 = MenuChinhAvatar.chuoiGiaTri;
            if ((0x53 ^ 0x18 ^ (0xFB ^ 0xB4)) < 0) {
                return;
            }
        } else if ((am3.var_byte_if == var_int_arr_if[3])) {
            string2 = MenuChinhAvatar.cu;
            if ("   ".length() <= ((3 ^ 7 ^ (0x11 ^ 0x5F)) & (0x14 ^ 0x6D ^ (0x5E ^ 0x6D) ^ -" ".length()))) {
                return;
            }
        } else if ((am3.var_byte_if == var_int_arr_if[4])) {
            string2 = MenuChinhAvatar.bK;
            if ("  ".length() != "  ".length()) {
                return;
            }
        } else if ((am3.var_byte_if == var_int_arr_if[5])) {
            string2 = MenuChinhAvatar.var_java_lang_String_const;
        }
        this.chuoiGiaTri = string2 + string;
        ((en)ce.cfr_renamed_1()).cfr_renamed_3 = ce.cfr_renamed_1().var_fl_0_do;
    }

    public final boolean boolean_do(String string) {
        if ((string.startsWith("Bạn không đủ"))) {
            this.coKichHoat = var_int_arr_if[7];
            GameCanvas.hienThongBaoPopup("Đã hết tiền!\nSố lần quay: " + this.soLuongKhoa);
            TienIchGame.void_int();
            return var_int_arr_if[7];
        }
        if ((string.startsWith("Bạn cần thẻ quay số miễn phí"))) {
            this.coKichHoat = var_int_arr_if[7];
            GameCanvas.hienThongBaoPopup("Đã hết vé quay số!\nSố lần quay: " + this.soLuongKhoa);
            TienIchGame.void_int();
            return var_int_arr_if[7];
        }
        if ((string.startsWith("Bạn phải có ít nhất 3 ô trống"))) {
            this.coKichHoat = var_int_arr_if[7];
            GameCanvas.hienThongBaoPopup("Rương đồ đã đầy!\nSố lần quay: " + this.soLuongKhoa);
            TienIchGame.void_int();
            return var_int_arr_if[7];
        }
        if ((string.startsWith("Quay từ từ thôi"))) {
            this.coTrangThai = var_int_arr_if[7];
            TienIchGame.void_int();
            return var_int_arr_if[7];
        }
        if ((string.startsWith("Bạn đã bật chức năng không nhận đồ ngày khi quay số"))) {
            this.var_byte_if = (byte)var_int_arr_if[7];
            TienIchGame.this();
            return var_int_arr_if[7];
        }
        if ((string.startsWith("Bạn đã tắt chức năng không nhận đồ ngày khi quay số"))) {
            this.var_byte_if = (byte)var_int_arr_if[8];
            TienIchGame.this();
            return var_int_arr_if[7];
        }
        return super.boolean_do(string);
    }

    public final void cfr_renamed_3() {
        this.var_short_do = (short)var_int_arr_if[0];
    }

    public final void (int n == String object) {
        if ((var_int_if >= var_int_arr_if[6])) {
            return;
        }
        object = fh.ef_do(n);
        if ((object != null) && (!dm_0.cfr_renamed_2(((DuLieuNguoiChoi)object).soLuong.equals("quay số") ? 1 : 0) || !dm_0.cfr_renamed_2(((DuLieuNguoiChoi)object).soLuong.equals("quay.so") ? 1 : 0) || dm_0.cfr_renamed_0(((DuLieuNguoiChoi)object).soLuong.equals("nguoi.bi.an") ? 1 : 0))) {
            var_int_if = n;
        }
    }

    public final String toString() {
        return "Auto quay số";
    }

    public final String java_lang_String_for() {
        return "Đang quay: " + this.chuoiGiaTri;
    }

                    protected final void d_() {
        int n;
        if (!!(this.var_boolean_int) || (this.dangChayAuto)) {
            this.var_short_do = (short)var_int_arr_if[0];
            AutoController.tatAuto();
            ce.cfr_renamed_1().cfr_renamed_2();
            if ((this.dangChayAuto)) {
                if ((this.var_byte_do == 0)) {
                    TienIchGame.void_if(2000L);
                }
                GameCanvas.hienThongBaoPopup("Đã quay được " + dm_0.var_dm_0_do.chuoiGiaTri + " vĩnh viễn!\nSố lần quay: " + dm_0.var_dm_0_do.soLuongKhoa);
            }
            return;
        }
        if ((GameCanvas.var_en_do instanceof ce == 0)) {
            this.var_short_do = (short)var_int_arr_if[0];
            AutoController.tatAuto();
            return;
        }
        if (dm_0.boolean_do(this.var_short_do)) {
            this.var_short_do = (short)var_int_arr_if[0];
            AutoController.tatAuto();
            ((en)ce.cfr_renamed_1()).cfr_renamed_3 = ce.cfr_renamed_1().var_fl_0_if;
            return;
        }
        if (dm_0.cfr_renamed_3((System.currentTimeMillis() - this.soXu == 30000L))) {
            this.soXu = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, var_int_arr_if[8], var_int_arr_if[1]);
            TienIchGame.void_if(1000L);
        }
        if ((this.soLuong == var_int_arr_if[0])) {
            GameCanvas.cfr_renamed_8();
            if ((fh.var_int_char == var_int_arr_if[9])) {
                ft_0.ft_0_do().cfr_renamed_4(var_int_if);
                if ((0x1A ^ 0x1E) < " ".length()) {
                    return;
                }
            } else {
                ft_0.ft_0_do().cfr_renamed_1(var_int_if, var_int_arr_if[1], var_int_arr_if[1]);
            }
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(1000L);
                GameCanvas.cfr_renamed_7();
            }
            return;
        }
        Object object = this;
        switch (((dm_0)object).var_byte_do) {
            case 1: {
                if (dm_0.cfr_renamed_1(((dm_0)object).var_byte_if, var_int_arr_if[7])) {
                    n = var_int_arr_if[7];
                    if ((0x46 ^ 0x5A ^ (0xA3 ^ 0xBA)) != 0) break;
                    return;
                }
                n = var_int_arr_if[1];
                if ((88 + 1 - 57 + 102 ^ 127 + 92 - 119 + 30) == (0x1F ^ 0x17 ^ (0xB8 ^ 0xB4))) break;
                return;
            }
            default: {
                if (dm_0.cfr_renamed_1(((dm_0)object).var_byte_if, var_int_arr_if[8])) {
                    n = var_int_arr_if[7];
                    if (-" ".length() < 0) break;
                    return;
                }
                n = var_int_arr_if[1];
            }
        }
        if ((n == 0)) {
            GameCanvas.cfr_renamed_8();
            if ((fh.var_int_char == var_int_arr_if[9])) {
                ft_0.ft_0_do().cfr_renamed_1(var_int_arr_if[10], var_int_arr_if[1], this.soLuong);
                if (((0x76 ^ 0x58) & ~(0x28 ^ 6)) < 0) {
                    return;
                }
            } else {
                ft_0.ft_0_do().cfr_renamed_1(var_int_if, var_int_arr_if[7], this.soLuong);
            }
            if ((TienIchGame.cfr_renamed_3(15000L))) {
                TienIchGame.void_if(1000L);
                GameCanvas.cfr_renamed_7();
            }
            return;
        }
        int n2 = mangSoNguyen[TienIchGame.int_do(var_int_arr_if[1], var_int_arr_if[11])];
        object = ce.cfr_renamed_1();
        ce.cfr_renamed_1().var_int_if = ce.cfr_renamed_1().soLuong = n2 + var_int_arr_if[12];
        ((ce)object).dangChayAuto = var_int_arr_if[1];
        ft_0.ft_0_do().cfr_renamed_1(this.var_short_do, n2);
        if ((TienIchGame.cfr_renamed_8(15000L))) {
            if ((this.coTrangThai)) {
                this.coTrangThai = var_int_arr_if[1];
                TienIchGame.void_if(1000L);
                return;
            }
            if ((this.coKichHoat)) {
                this.var_boolean_int = var_int_arr_if[7];
                return;
            }
            this.soLuongKhoa += var_int_arr_if[7];
            if ((this.var_int_int > 0) && (this.soLuongKhoa >= this.var_int_int)) {
                GameCanvas.hienThongBaoPopup("Đã dừng Auto!\n" + this.cfr_renamed_0());
                this.var_boolean_int = var_int_arr_if[7];
                return;
            }
            TienIchGame.void_if(1000L);
        }
    }

        public dm_0() {
        this.var_byte_if = (byte)var_int_arr_if[0];
    }
}

