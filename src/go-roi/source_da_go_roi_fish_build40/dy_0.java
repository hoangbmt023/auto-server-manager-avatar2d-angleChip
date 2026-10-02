/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from dy
 */
public final class dy_0
extends NhiemVuAutoBase {
    private long soXu;
    private boolean dangChayAuto = 0;
    public static final Vector var_java_util_Vector_do;
    public static final Vector cfr_renamed_0;
    private static final int[] mangSoNguyen;

        public final synchronized void d_() {
        if ((cfr_renamed_0.isEmpty()) && (var_java_util_Vector_do.isEmpty())) {
            if ((this.nhiemVuHienTai != null)) {
                AutoController.cfr_renamed_2();
                return;
            }
            AutoController.tatAuto();
            GameCanvas.hienThongBaoPopup("Không có item nào trong danh sách cài đặt!");
            return;
        }
        if (dy_0.cfr_renamed_4((System.currentTimeMillis() - this.cfr_renamed_3 < 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((GameCanvas.var_en_do instanceof ep != 0) && (fh.var_int_char == -1)) {
            ep.cfr_renamed_1().cfr_renamed_3();
            return;
        }
        if ((GameCanvas.var_en_do instanceof gO != 0)) {
            long l = System.currentTimeMillis() - this.cfr_renamed_4;
            if (dy_0.cfr_renamed_0((l < 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            if ((TienIchGame.cfr_renamed_5(23))) {
                TienIchGame.void_if(3000L);
                this.soXu = System.currentTimeMillis();
            }
            return;
        }
        if (dy_0.cfr_renamed_4((System.currentTimeMillis() - this.soXu < 30000L))) {
            this.soXu = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, 2, 0);
            TienIchGame.void_if(1000L);
        }
        if ((this.cfr_renamed_2 == null)) {
            ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
            TienIchGame.cfr_renamed_4(5000L);
            return;
        }
        if ((this.cfr_renamed_2 != null)) {
            cg cg2;
            short s2 = -1;
            int n = 0;
            while ((n < this.cfr_renamed_2.size())) {
                cg2 = (cg)this.cfr_renamed_2.elementAt(n);
                if ((cg2 != null) && dy_0.cfr_renamed_3cg2.var_short_do == null) {
                    s2 = cg2.var_short_do;
                    if (((0x23 ^ 0x2D) & ~(0xA8 ^ 0xA6)) < (0x22 ^ 0x26)) break;
                    return;
                }
                ++n;
                if ((91 + 116 - 101 + 69 ^ 9 + 57 - 9 + 113) != 0) continue;
                return;
            }
            n = 0;
            while ((n < this.cfr_renamed_2.size())) {
                cg2 = (cg)this.cfr_renamed_2.elementAt(n);
                if ((cg2 != null) && dy_0.cfr_renamed_3cg2.var_short_do != null) {
                    ft_0.ft_0_do().void_do((int)cg2.var_short_do, 1);
                    TienIchGame.void_if(100L);
                }
                ++n;
                if ("   ".length() >= ((0x41 ^ 0x47) & ~(0x63 ^ 0x65))) continue;
                return;
            }
            if ((s2 != -1)) {
                this.dangChayAuto = 0;
                ft_0.ft_0_do().cfr_renamed_1(s2, 1);
                if (dy_0.boolean_do(TienIchGame.cfr_renamed_7(5000L) ? 1 : 0)) {
                    this.cfr_renamed_2 = null;
                    return;
                }
                if ((this.dangChayAuto)) {
                    cfr_renamed_0.removeElement(new Short(s2));
                    }
                TienIchGame.void_if(100L);
                return;
            }
            if ((this.nhiemVuHienTai != null)) {
                AutoController.cfr_renamed_2();
                return;
            }
            AutoController.tatAuto();
            GameCanvas.hienThongBaoPopup("Đã xong việc!");
        }
    }

        public final void void_for() {
        super.void_for();
        this.cfr_renamed_2 = null;
    }

    static {
        block3: {
            block4: {
                String string;
                block2: {
                    block1: {
                        dy_0.cfr_renamed_6();
                        cfr_renamed_0 = new Vector();
                        var_java_util_Vector_do = new Vector();
                        string = QuanLyRMS.luuDuLieu("useItemLists");
                        if (!(string != null) || !(string.length() > 0)) break block1;
                        if (!dy_0.boolean_do(string.equals("-1") ? 1 : 0)) break block2;
                        (string == null);
                        if ("   ".length() != -" ".length()) break block2;
                        break block3;
                    }
                    cfr_renamed_0.addElement(new Short(3958));
                    cfr_renamed_0.addElement(new Short(4620));
                }
                if (!(string = QuanLyRMS.luuDuLieu("delItemLists") != null) || !(string.length() > 0)) break block4;
                if (!dy_0.boolean_do(string.equals("-1") ? 1 : 0)) break block3;
                (string >= 0);
                break block3;
            }
            int n = 5965;
            while ((n <= 5970)) {
                var_java_util_Vector_do.addElement(new Short((short)n));
                ++n;
                if ("  ".length() != 0) continue;
                break;
            }
        }
    }

    private static void cfr_renamed_6() {
        mangSoNguyen = new int[9];
        0 = (0x11 ^ 0x36) & ~(0x45 ^ 0x62);
        -1 = -" ".length();
        1 = " ".length();
        23 = 42 + 206 - 103 + 67 ^ 143 + 155 - 215 + 112;
        2 = "  ".length();
        3958 = 0xFFFFEFF7 & 0x1F7E;
        4620 = -(0xFFFFFDF5 & 0x6EDB) & (0xFFFFFEFE & 0x7FDD);
        5965 = -(0xFFFFF2B3 & 0x6D4F) & (0xFFFFF7FF & 0x7F4F);
        5970 = 0xFFFFB7F6 & 0x5F5B;
    }

        public static boolean (short s2 != null) {
        if (dy_0.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
            int n = 0;
            while ((n < var_java_util_Vector_do.size())) {
                if (dy_0.cfr_renamed_2(((Short)var_java_util_Vector_do.elementAt(n)).shortValue(), s2)) {
                    return 1;
                }
                ++n;
                if ("   ".length() == "   ".length()) continue;
                return ((133 + 117 - 150 + 38 ^ 80 + 149 - 59 + 23) & (0x64 ^ 0x60 ^ (0x3F ^ 0x70) ^ -" ".length())) != 0;
            }
        }
        return 0;
    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    public static boolean (short s2 == null) {
        if (dy_0.boolean_do(cfr_renamed_0.isEmpty() ? 1 : 0)) {
            int n = 0;
            while ((n < cfr_renamed_0.size())) {
                if (dy_0.cfr_renamed_2(((Short)cfr_renamed_0.elementAt(n)).shortValue(), s2)) {
                    return 1;
                }
                ++n;
                if (" ".length() >= -" ".length()) continue;
                return ((0x10 ^ 0xC) & ~(0x75 ^ 0x69)) != 0;
            }
        }
        return 0;
    }

        public final boolean boolean_do(String string) {
        String string2 = string.trim().toLowerCase();
        if (!(string2.indexOf("nhận được") == -1) || (string2.indexOf(". số lượng") != -1)) {
            TienIchGame.cfr_renamed_21();
            return 1;
        }
        if ((string2.startsWith("không tìm thấy vật phẩm"))) {
            this.cfr_renamed_2 = null;
            TienIchGame.cfr_renamed_21();
            return 1;
        }
        if (!dy_0.boolean_do(string2.startsWith("không thể sử dụng") ? 1 : 0) || !dy_0.boolean_do(string2.startsWith("số lượng") ? 1 : 0) || (string2.equals("trên người và trong rương bạn đã có vật phẩm giống nhau"))) {
            this.dangChayAuto = 1;
            TienIchGame.cfr_renamed_21();
            return 1;
        }
        return super.boolean_do(string);
    }

    public dy_0() {
        dy_0 dy_02 = this;
        dy_02.soXu = System.currentTimeMillis();
        dy_02.cfr_renamed_2 = null;
    }

    public final String toString() {
        return "Auto dùng vật phẩm";
    }

            public static void (String stringArray == null) {
        block5: {
            if (dy_0.boolean_do(cfr_renamed_0.isEmpty() ? 1 : 0)) {
                cfr_renamed_0.removeAllElements();
            }
            if (!dy_0.cfr_renamed_1(stringArray = TienIchGame.cfr_renamed_2((String)stringArray)) || !(stringArray.length() > 0)) break block5;
            stringArray = TienIchGame.java_lang_String_arr_do((String)stringArray, ",");
            int n = 0;
            while ((n < stringArray.length)) {
                try {
                    cfr_renamed_0.addElement(new Short(Short.parseShort(stringArray[n])));
                }
                catch (NumberFormatException numberFormatException) {
                    cfr_renamed_0.addElement(new Short(-1));
                }
                if (-" ".length() != -" ".length()) {
                    return;
                }
                ++n;
                if ("  ".length() != "   ".length()) continue;
                return;
            }
        }
    }

        public static void (String stringArray >= 0) {
        block5: {
            if (dy_0.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
                var_java_util_Vector_do.removeAllElements();
            }
            if (!dy_0.cfr_renamed_1(stringArray = TienIchGame.cfr_renamed_2((String)stringArray)) || !(stringArray.length() > 0)) break block5;
            stringArray = TienIchGame.java_lang_String_arr_do((String)stringArray, ",");
            int n = 0;
            while ((n < stringArray.length)) {
                try {
                    var_java_util_Vector_do.addElement(new Short(Short.parseShort(stringArray[n])));
                }
                catch (NumberFormatException numberFormatException) {
                    var_java_util_Vector_do.addElement(new Short(-1));
                }
                if (-"  ".length() > 0) {
                    return;
                }
                ++n;
                if (((159 + 19 - 160 + 155 ^ 95 + 123 - 189 + 122) & (0xE9 ^ 0x8E ^ (0x4C ^ 0x11) ^ -" ".length())) < " ".length()) continue;
                return;
            }
        }
    }

            public static void cfr_renamed_3() {
        String string = "";
        if (dy_0.boolean_do(cfr_renamed_0.isEmpty() ? 1 : 0)) {
            int n = 0;
            while ((n < cfr_renamed_0.size())) {
                short s2 = (Short)cfr_renamed_0.elementAt(n);
                if ((s2 >= 0)) {
                    if (dy_0.boolean_do(string.equals("") ? 1 : 0)) {
                        string = string + ",";
                    }
                    string = string + s2;
                }
                ++n;
                if (-"  ".length() <= 0) continue;
                return;
            }
        }
        if (dy_0.boolean_do(string.equals("") ? 1 : 0)) {
            QuanLyRMS.luuDuLieu("useItemLists", string);
            return;
        }
        QuanLyRMS.luuDuLieu("useItemLists", "-1");
    }

        public static void cfr_renamed_4() {
        String string = "";
        if (dy_0.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
            int n = 0;
            while ((n < var_java_util_Vector_do.size())) {
                short s2 = (Short)var_java_util_Vector_do.elementAt(n);
                if ((s2 >= 0)) {
                    if (dy_0.boolean_do(string.equals("") ? 1 : 0)) {
                        string = string + ",";
                    }
                    string = string + s2;
                }
                ++n;
                if ((0xEF ^ 0x99 ^ (0x79 ^ 0xA)) > 0) continue;
                return;
            }
        }
        if (dy_0.boolean_do(string.equals("") ? 1 : 0)) {
            QuanLyRMS.luuDuLieu("delItemLists", string);
            return;
        }
        QuanLyRMS.luuDuLieu("delItemLists", "-1");
    }
}

