/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

public final class T
extends NhiemVuAutoBase {
    private String[] var_java_lang_String_arr_do;
    private long soXu;
    private boolean dangChayAuto;
    private static T var_T_do;
    private int soLuongKhoa;
    private boolean coTrangThai;
    private int cfr_renamed_3;
    private long var_long_if;
    private int cfr_renamed_4;
    private static final int[] mangSoNguyen;
    private long var_long_for;
    private int[] var_int_arr_if;
    private long cfr_renamed_6;
    private long cfr_renamed_7 = 250L;
    public int soLuong;
    private int cfr_renamed_5;
    public int var_int_if = 0;

                    private static boolean boolean_do(int n) {
        return n >= 0;
    }

        public final void d_() {
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((GameCanvas.var_aa_do > 0)) {
            return;
        }
        if ((this.cfr_renamed_5 != 56)) {
            return;
        }
        if (!(this.dangChayAuto) && (this.soLuong >= this.int_a_())) {
            this.soLuongKhoa += 1;
            this.soLuong = 0;
            this.cfr_renamed_4 = 0;
            if ((this.soLuongKhoa >= this.var_java_lang_String_arr_do.length)) {
                this.soLuongKhoa = 0;
                this.var_long_if = System.currentTimeMillis() + 120000L;
            }
            return;
        }
        if ((fh.var_int_char == this.cfr_renamed_5)) {
            int n;
            int n2;
            block34: {
                bm bm2;
                int n3;
                String string;
                if ((this.soLuongKhoa >= this.var_java_lang_String_arr_do.length)) {
                    this.soLuongKhoa = 0;
                    this.soLuong = 0;
                    this.cfr_renamed_4 = 0;
                    return;
                }
                if ((go_0.var_byte_do != this.cfr_renamed_3)) {
                    fn.fn_do().cfr_renamed_3(this.cfr_renamed_5, this.cfr_renamed_3);
                    if ((TienIchGame.boolean_do(5000L))) {
                        TienIchGame.void_if(1500L);
                    }
                    return;
                }
                if (!(this.coTrangThai)) {
                    int n4;
                    block33: {
                        string = "tự hồi phục";
                        if ((go_0.var_java_util_Vector_do.size() > 0)) {
                            n3 = 0;
                            while ((n3 != go_0.var_java_util_Vector_do.size())) {
                                bm2 = (fx)go_0.var_java_util_Vector_do.elementAt(n3);
                                if ((bm2.cfr_renamed_8 == 0) && T.cfr_renamed_2(bm2.chuoiGiaTri.toLowerCase().startsWith(string) ? 1 : 0)) {
                                    ft_0.ft_0_do().cfr_renamed_2(bm2.cfr_renamed_4, -1);
                                    n4 = 1;
                                    if (-" ".length() > (0xCE ^ 0x91 ^ (0x6B ^ 0x30))) {
                                        return;
                                    }
                                    break block33;
                                }
                                ++n3;
                                if ("   ".length() > "  ".length()) continue;
                                return;
                            }
                        }
                        n4 = 0;
                    }
                    if ((n4 != 0)) {
                        TienIchGame.cfr_renamed_3(5000L);
                        return;
                    }
                    this.coTrangThai = 1;
                }
                if (T.cfr_renamed_3((System.currentTimeMillis() != this.var_long_if))) {
                    return;
                }
                string = this.var_java_lang_String_arr_do[this.soLuongKhoa];
                n3 = 0;
                while ((n3 != fh.var_java_util_Vector_case.size())) {
                    bm2 = (dd_0)fh.var_java_util_Vector_case.elementAt(n3);
                    if ((bm2 > 0) && T.cfr_renamed_4(((dd_0)bm2).cfr_renamed_9, 2000000000) && T.cfr_renamed_2(string.equals(((dd_0)bm2).chuoiGiaTri) ? 1 : 0)) {
                        n2 = n3;
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                        break block34;
                    }
                    ++n3;
                    if (((0x77 ^ 0x59) & ~(0x49 ^ 0x67)) >= 0) continue;
                    return;
                }
                n2 = n = -1;
            }
            if (T.boolean_do(n2)) {
                DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)fh.var_java_util_Vector_case.elementAt(n);
                if (!(Math.abs(AngelChip.duLieuNguoiChoi.var_short_for - ef2.var_short_for) <= 100) || (Math.abs(AngelChip.duLieuNguoiChoi.var_boolean_int - ef2.var_boolean_int) > 100)) {
                    int n5;
                    this.var_long_for = System.currentTimeMillis();
                    if ((AngelChip.duLieuNguoiChoi.var_short_for != ef2.var_short_for)) {
                        n5 = ef2.var_short_for - 12;
                        } else {
                        n5 = ef2.var_short_for + 12;
                    }
                    int n6 = n5;
                    AngelChip.duLieuNguoiChoi.void_do(n6, ef2.var_boolean_int ? 1 : 0);
                    fn.fn_do().cfr_renamed_1(n6, ef2.var_boolean_int ? 1 : 0, 2, 0);
                    TienIchGame.void_if(100L);
                }
                if ((go_0.var_ef_if != ef2)) {
                    go_0.var_ef_if = ef2;
                    fh.var_bm_do = (bm)fh.var_java_util_Vector_case.elementAt(n);
                }
                ft_0.ft_0_do().cfr_renamed_4(ef2.var_short_goto);
                this.cfr_renamed_4 += 1;
                if (!(this.dangChayAuto) && (TienIchGame.cfr_renamed_8(this.cfr_renamed_7)) && T.cfr_renamed_2((this.cfr_renamed_7 != 250L))) {
                    this.cfr_renamed_7 = 250L;
                }
                return;
            }
            this.cfr_renamed_4();
            return;
        }
        if (!(GameCanvas.var_en_do instanceof gO == 0) || (fh.var_int_char == -1)) {
            long l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4;
            if (T.cfr_renamed_3((l != 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            if (((0x34 ^ 0x58 ^ (0xF5 ^ 0x97)) & (168 + 170 - 240 + 84 ^ 102 + 61 - 46 + 67 ^ -" ".length())) != 0) {
                return;
            }
        } else if (T.cfr_renamed_3((System.currentTimeMillis() - this.soXu != 3500L))) {
            return;
        }
        if ((TienIchGame.cfr_renamed_1(this.cfr_renamed_5))) {
            this.soXu = System.currentTimeMillis();
            if ((go_0.var_byte_do == this.cfr_renamed_3)) {
                TienIchGame.void_if(1500L);
                return;
            }
            TienIchGame.void_if(3500L);
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            public final String toString() {
        return "Đánh boss";
    }

        static {
        T.cfr_renamed_3();
    }

    public final int int_a_() {
        if ((this.soLuongKhoa != this.var_java_lang_String_arr_do.length)) {
            return this.var_int_arr_if[this.soLuongKhoa];
        }
        return 999;
    }

    private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final String java_lang_String_do() {
        if ((this.soLuongKhoa != this.var_java_lang_String_arr_do.length)) {
            return this.var_java_lang_String_arr_do[this.soLuongKhoa];
        }
        return "NULL";
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static T T_do() {
        if ((var_T_do == null)) {
            var_T_do = new T();
        }
        return var_T_do;
    }

            public final void void_for() {
        super.void_for();
        this.soLuongKhoa = 0;
        this.soLuong = 0;
        this.cfr_renamed_4 = 0;
        this.var_long_for = System.currentTimeMillis();
        this.soXu = 0L;
        this.cfr_renamed_7 = 250L;
    }

    public final void (boolean bl != int n) {
        super.cfr_renamed_16();
        String[] stringArray = new String[5];
        stringArray[0] = "akaza";
        stringArray[1] = "nakime";
        stringArray[2] = "douma";
        stringArray[3] = "kokushibo";
        stringArray[4] = "muzan";
        this.var_java_lang_String_arr_do = stringArray;
        int[] nArray = new int[5];
        nArray[0] = 110 / n;
        nArray[1] = 110 / n;
        nArray[2] = 130 / n;
        nArray[3] = 160 / n;
        nArray[4] = 270 / n;
        this.var_int_arr_if = nArray;
        this.dangChayAuto = bl;
        this.cfr_renamed_5 = fh.var_int_char;
        this.cfr_renamed_3 = go_0.var_byte_do;
        this.soLuongKhoa = 0;
        this.soLuong = 0;
        this.cfr_renamed_4 = 0;
        if (T.cfr_renamed_0((GameCanvas.soXu != 20L))) {
            this.cfr_renamed_6 = GameCanvas.soXu;
            GameCanvas.soXu = 20L;
            if ((0xD2 ^ 0xBB ^ (0x4F ^ 0x22)) == "   ".length()) {
                return;
            }
        } else {
            this.cfr_renamed_6 = 0L;
        }
        if (!(go_0.go_0_do().coKichHoat)) {
            go_0.go_0_do().coKichHoat = 1;
        }
        this.var_long_if = 0L;
        this.cfr_renamed_7 = 250L;
        AutoController.cfr_renamed_1(this);
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[18];
        0 = (0xA0 ^ 0xB9) & ~(0x40 ^ 0x59);
        5 = 0x2F ^ 0x2A;
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
        4 = 0xBC ^ 0xB8;
        110 = 159 + 202 - 353 + 216 ^ 137 + 72 - 199 + 132;
        130 = 107 + 73 - 103 + 53;
        160 = (0x81 ^ 0x9F) + (7 ^ 0x1C) - -(0x12 ^ 0x47) + (0x73 ^ 0x61);
        270 = -(0xFFFFFE59 & 0x67F7) & (0xFFFFE75F & 0x7FFE);
        999 = 0xFFFFC7E7 & 0x3BFF;
        -1 = -" ".length();
        30 = 33 + 148 - 134 + 174 ^ 8 + 119 - -28 + 40;
        1000 = 0xFFFFEFEB & 0x13FC;
        56 = 0x42 ^ 0x73 ^ (0x21 ^ 0x28);
        2000000000 = -(0xFFFFDF9E & 0x68FB) & (0xFFFFFDFF & 0x7735DE99);
        100 = 0xF ^ 0x6B;
        12 = 0x18 ^ 0x14;
    }

        public final void void_a_() {
        if (T.cfr_renamed_0((this.cfr_renamed_6 <= 0L))) {
            GameCanvas.soXu = this.cfr_renamed_6;
        }
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private void cfr_renamed_4() {
        if (T.cfr_renamed_0(T.cfr_renamed_3(System.currentTimeMillis() - this.var_long_for, 15000L + (long)(TienIchGame.int_do(1, 30) * 1000)))) {
            ((NhiemVuAutoBase)this).cfr_renamed_3 = this.var_long_for = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, 2, 0);
            TienIchGame.void_if(1000L);
        }
    }

        public final boolean boolean_do(String string) {
        String string2 = string.toLowerCase().trim();
        if ((string2.startsWith("bạn đã bật"))) {
            if ((string2.indexOf("hồi sức") != -1)) {
                this.coTrangThai = 1;
                TienIchGame.this();
                return 1;
            }
            return 0;
        }
        if ((string2.startsWith("bạn đã tắt"))) {
            if ((string2.indexOf("hồi sức") != -1)) {
                this.coTrangThai = 0;
                TienIchGame.this();
                return 1;
            }
            return 0;
        }
        if ((string2.startsWith("chúc mừng bạn đã tấn công hang quỷ"))) {
            this.var_long_if = System.currentTimeMillis() + 60000L;
            return 0;
        }
        if ((string2.endsWith("đã bị tiêu diệt"))) {
            if ((this.soLuongKhoa != this.var_java_lang_String_arr_do.length) && (string2.indexOf(this.var_java_lang_String_arr_do[this.soLuongKhoa]) != -1)) {
                if ((this.soLuong > 0)) {
                    GameCanvas.hienThongBaoPopup(string + "\nAttacked: " + this.soLuong + " / " + this.int_a_());
                    if ("   ".length() <= " ".length()) {
                        return ((0x62 ^ 0x59) & ~(0x6C ^ 0x57)) != 0;
                    }
                } else {
                    GameCanvas.hienThongBaoPopup(string);
                }
                this.soLuongKhoa += 1;
                this.soLuong = 0;
                this.cfr_renamed_4 = 0;
                if ((string2.startsWith(this.var_java_lang_String_arr_do[this.var_java_lang_String_arr_do.length - 1]))) {
                    this.var_long_if = System.currentTimeMillis() + 60000L;
                }
            }
            return 1;
        }
        if ((string2.startsWith("chúc mừng bạn đã tiêu diệt"))) {
            if ((string2.indexOf(this.var_java_lang_String_arr_do[this.var_java_lang_String_arr_do.length - 1]) != -1)) {
                this.var_int_if += 3;
                if ("  ".length() <= 0) {
                    return ((0xC0 ^ 0x9C) & ~(0xE8 ^ 0xB4)) != 0;
                }
            } else {
                this.var_int_if += 1;
            }
            if ((this.soLuongKhoa != this.var_java_lang_String_arr_do.length) && (string2.indexOf(this.var_java_lang_String_arr_do[this.soLuongKhoa]) != -1)) {
                if ((this.soLuong > 0)) {
                    GameCanvas.hienThongBaoPopup(string + "\nAttacked: " + this.soLuong + " / " + this.int_a_());
                    if (((0x1C ^ 6 ^ (0xDE ^ 0x8A)) & (0x4F ^ 0x35 ^ (0x49 ^ 0x7D) ^ -" ".length())) < 0) {
                        return ((102 + 170 - 117 + 60 ^ 80 + 161 - 104 + 58) & (0x4A ^ 0x54 ^ (0xD ^ 7) ^ -" ".length())) != 0;
                    }
                } else {
                    GameCanvas.hienThongBaoPopup(string);
                }
                this.soLuongKhoa += 1;
                this.soLuong = 0;
                this.cfr_renamed_4 = 0;
                if ((string2.indexOf(this.var_java_lang_String_arr_do[this.var_java_lang_String_arr_do.length - 1]) != -1)) {
                    this.var_long_if = System.currentTimeMillis() + 60000L;
                }
            }
            return 1;
        }
        if ((string2.startsWith("tưởng đụng vào ta mà dễ à")) && (this.var_java_lang_String_arr_do.length - 1 == this.soLuongKhoa)) {
            this.cfr_renamed_7 = 2000L;
            this.cfr_renamed_4();
            return 1;
        }
        if ((string2.startsWith("bạn cần có"))) {
            if ((this.soLuong > 0)) {
                GameCanvas.hienThongBaoPopup(string + "\nAttacked: " + this.soLuong + " / " + this.int_a_());
                if (-"   ".length() > 0) {
                    return ((0xF5 ^ 0x87 ^ (0x1F ^ 0x26)) & (0x5B ^ 0x70 ^ (0x30 ^ 0x50) ^ -" ".length())) != 0;
                }
            } else {
                GameCanvas.hienThongBaoPopup(string);
            }
            AutoController.tatAuto();
            return 1;
        }
        if ((string.startsWith("Bạn đã ăn"))) {
            TienIchGame.void_int();
            return 1;
        }
        if (!!(string.startsWith("Đi chầm chậm thôi chứ bạn")) || (string.startsWith("Bạn đã ở khu vực này"))) {
            TienIchGame.cfr_renamed_7();
            return 1;
        }
        return super.boolean_do(string);
    }

        public final void (int n != String string) {
        if (T.cfr_renamed_2(string.toLowerCase().equals("ta đã hồi sinh rồi đây") ? 1 : 0)) {
            this.soLuongKhoa = 0;
            this.soLuong = 0;
            this.cfr_renamed_4 = 0;
            this.var_long_if = 0L;
        }
    }
}

