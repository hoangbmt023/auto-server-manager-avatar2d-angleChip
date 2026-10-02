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
    private static final int[] mangSoNguyen;
    public static final Vector var_java_util_Vector_do;
    public static final Vector cfr_renamed_1;

    public static void void_do() {
        String string = "";
        if (!(var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n < var_java_util_Vector_do.size())) {
                short s2 = (Short)var_java_util_Vector_do.elementAt(n);
                if (dy_0.cfr_renamed_1((int)s2)) {
                    if (!(string.equals(""))) {
                        string = string + ",";
                    }
                    string = string + s2;
                }
                ++n;
                if ("  ".length() != ((165 + 163 - 244 + 130 ^ 105 + 149 - 147 + 85) & (160 + 112 - 171 + 78 ^ 68 + 29 - 80 + 148 ^ -" ".length()))) continue;
                return;
            }
        }
        if (!(string.equals(""))) {
            QuanLyRMS.docDuLieu("delItemLists", string);
            return;
        }
        QuanLyRMS.docDuLieu("delItemLists", "-1");
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public static boolean (short s2 != null) {
        if (!(var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n < var_java_util_Vector_do.size())) {
                if (dy_0.cfr_renamed_4(((Short)var_java_util_Vector_do.elementAt(n)).shortValue(), s2)) {
                    return 1;
                }
                ++n;
                if (" ".length() > 0) continue;
                return ((0x28 ^ 0x37) & ~(0xB2 ^ 0xAD)) != 0;
            }
        }
        return 0;
    }

    static {
        block3: {
            block4: {
                String string;
                block2: {
                    block1: {
                        dy_0.cfr_renamed_5();
                        cfr_renamed_1 = new Vector();
                        var_java_util_Vector_do = new Vector();
                        string = QuanLyRMS.docDuLieu("useItemLists");
                        if (!(string != null) || !(string.length() > 0)) break block1;
                        if (!!(string.equals("-1"))) break block2;
                        (string == null);
                        if ("  ".length() != 0) break block2;
                        break block3;
                    }
                    cfr_renamed_1.addElement(new Short(3958));
                    cfr_renamed_1.addElement(new Short(4620));
                }
                if (!(string = QuanLyRMS.docDuLieu("delItemLists") != null) || !(string.length() > 0)) break block4;
                if (!!(string.equals("-1"))) break block3;
                (string < 0);
                break block3;
            }
            int n = 5965;
            while ((n <= 5970)) {
                var_java_util_Vector_do.addElement(new Short((short)n));
                ++n;
                if (((0x68 ^ 0x43 ^ (0x7D ^ 0x60)) & (0xDA ^ 0x81 ^ (0x53 ^ 0x3E) ^ -" ".length())) != "   ".length()) continue;
                break;
            }
        }
    }

            public static boolean (short s2 == null) {
        if (!(cfr_renamed_1.isEmpty())) {
            int n = 0;
            while ((n < cfr_renamed_1.size())) {
                if (dy_0.cfr_renamed_4(((Short)cfr_renamed_1.elementAt(n)).shortValue(), s2)) {
                    return 1;
                }
                ++n;
                if (" ".length() > 0) continue;
                return ((0x26 ^ 0x23) & ~(0xB1 ^ 0xB4)) != 0;
            }
        }
        return 0;
    }

    public final synchronized void void_for() {
        if (dy_0.boolean_do(cfr_renamed_1.isEmpty() ? 1 : 0) && dy_0.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
            if ((this.nhiemVuHienTai != null)) {
                AutoController.cfr_renamed_2();
                return;
            }
            AutoController.tatAuto();
            GameCanvas.hienThongBaoPopup("Không có item nào trong danh sách cài đặt!");
            return;
        }
        if (dy_0.cfr_renamed_4((System.currentTimeMillis() - this.cfr_renamed_4 != 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        if (dy_0.boolean_do(GameCanvas.var_dL_do instanceof ThongTinNhanVat)) {
            return;
        }
        if (dy_0.boolean_do(GameCanvas.var_dL_do instanceof fw)) {
            long l = System.currentTimeMillis() - this.cfr_renamed_2;
            if (dy_0.cfr_renamed_3((l != 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
            }
            if (dy_0.boolean_do(TienIchGame.cfr_renamed_4(23) ? 1 : 0)) {
                TienIchGame.hienThongBao(3000L);
                this.soXu = System.currentTimeMillis();
            }
            return;
        }
        if (dy_0.cfr_renamed_4((System.currentTimeMillis() - this.soXu != 30000L))) {
            this.soXu = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
            el_0.el_0_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if, 2, 0);
            TienIchGame.hienThongBao(1000L);
        }
        if ((this.cfr_renamed_3 == null)) {
            eq.eq_do().cfr_renamed_18(AngelChip.duLieuNguoiChoi.var_short_char);
            TienIchGame.cfr_renamed_15(5000L);
            return;
        }
        if ((this.cfr_renamed_3 != null)) {
            ef ef2;
            short s2 = -1;
            int n = 0;
            while ((n < this.cfr_renamed_3.size())) {
                ef2 = (ef)this.cfr_renamed_3.elementAt(n);
                if ((ef2 != null) && dy_0.boolean_doef2.var_short_do == null) {
                    s2 = ef2.var_short_do;
                    if (((138 + 135 - 90 + 7 ^ 120 + 18 - 105 + 151) & (0x45 ^ 0x20 ^ (0x4A ^ 0x29) ^ -" ".length())) <= "  ".length()) break;
                    return;
                }
                ++n;
                if ("   ".length() >= 0) continue;
                return;
            }
            n = 0;
            while ((n < this.cfr_renamed_3.size())) {
                ef2 = (ef)this.cfr_renamed_3.elementAt(n);
                if ((ef2 != null) && dy_0.boolean_doef2.var_short_do != null) {
                    eq.eq_do().void_if((int)ef2.var_short_do, 1);
                    TienIchGame.hienThongBao(100L);
                }
                ++n;
                if (-" ".length() != "   ".length()) continue;
                return;
            }
            if ((s2 != -1)) {
                this.dangChayAuto = 0;
                eq.eq_do().cfr_renamed_0(s2, 1);
                if (!(TienIchGame.cfr_renamed_3(5000L))) {
                    return;
                }
                if (dy_0.boolean_do(this.dangChayAuto ? 1 : 0)) {
                    cfr_renamed_1.removeElement(new Short(s2));
                    }
                TienIchGame.hienThongBao(100L);
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

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final boolean boolean_do(String string) {
        String string2 = string.trim().toLowerCase();
        if ((string2.indexOf("nhận được") != -1)) {
            TienIchGame.hienThongBao();
            return 1;
        }
        if (dy_0.boolean_do(string2.startsWith("không tìm thấy vật phẩm") ? 1 : 0)) {
            this.cfr_renamed_3 = null;
            TienIchGame.hienThongBao();
            return 1;
        }
        if (!!(string2.startsWith("không thể sử dụng")) || !!(string2.startsWith("số lượng")) || dy_0.boolean_do(string2.equals("trên người và trong rương bạn đã có vật phẩm giống nhau") ? 1 : 0)) {
            this.dangChayAuto = 1;
            TienIchGame.hienThongBao();
            return 1;
        }
        return super.boolean_do(string);
    }

            public static void (String stringArray == null) {
        block5: {
            if (!(cfr_renamed_1.isEmpty())) {
                cfr_renamed_1.removeAllElements();
            }
            if (!dy_0.cfr_renamed_0(stringArray = TienIchGame.cfr_renamed_3((String)stringArray)) || !(stringArray.length() > 0)) break block5;
            stringArray = TienIchGame.java_lang_String_arr_do((String)stringArray, ",");
            int n = 0;
            while ((n < stringArray.length)) {
                try {
                    cfr_renamed_1.addElement(new Short(Short.parseShort(stringArray[n])));
                }
                catch (NumberFormatException numberFormatException) {
                    cfr_renamed_1.addElement(new Short(-1));
                }
                if ((0xA6 ^ 0xC3 ^ (8 ^ 0x69)) < "  ".length()) {
                    return;
                }
                ++n;
                if ((40 + 23 - -18 + 50 ^ 15 + 93 - 62 + 89) != " ".length()) continue;
                return;
            }
        }
    }

    public static void cfr_renamed_4() {
        String string = "";
        if (!(cfr_renamed_1.isEmpty())) {
            int n = 0;
            while ((n < cfr_renamed_1.size())) {
                short s2 = (Short)cfr_renamed_1.elementAt(n);
                if (dy_0.cfr_renamed_1((int)s2)) {
                    if (!(string.equals(""))) {
                        string = string + ",";
                    }
                    string = string + s2;
                }
                ++n;
                return;
            }
        }
        if (!(string.equals(""))) {
            QuanLyRMS.docDuLieu("useItemLists", string);
            return;
        }
        QuanLyRMS.docDuLieu("useItemLists", "-1");
    }

                public final String toString() {
        return "Auto dùng vật phẩm";
    }

        private static void cfr_renamed_5() {
        mangSoNguyen = new int[9];
        0 = (89 + 118 - 181 + 101 ^ (0x10 ^ 0x54)) & (0x66 ^ 0x30 ^ (0xCB ^ 0xA6) ^ -" ".length());
        -1 = -" ".length();
        1 = " ".length();
        23 = 0x18 ^ 0xF;
        2 = "  ".length();
        3958 = -(30 + 19 - 43 + 123) & (0xFFFF9FFF & 0x6FF6);
        4620 = 0xFFFFDEAF & 0x335C;
        5965 = 0xFFFFF7FF & 0x1F4D;
        5970 = -(0xFFFF8B3E & 0x7CCF) & (0xFFFFBFDF & 0x5F7F);
    }

        public static void (String stringArray < 0) {
        block5: {
            if (!(var_java_util_Vector_do.isEmpty())) {
                var_java_util_Vector_do.removeAllElements();
            }
            if (!dy_0.cfr_renamed_0(stringArray = TienIchGame.cfr_renamed_3((String)stringArray)) || !(stringArray.length() > 0)) break block5;
            stringArray = TienIchGame.java_lang_String_arr_do((String)stringArray, ",");
            int n = 0;
            while ((n < stringArray.length)) {
                try {
                    var_java_util_Vector_do.addElement(new Short(Short.parseShort(stringArray[n])));
                }
                catch (NumberFormatException numberFormatException) {
                    var_java_util_Vector_do.addElement(new Short(-1));
                }
                if (-" ".length() > 0) {
                    return;
                }
                ++n;
                if (-"  ".length() < 0) continue;
                return;
            }
        }
    }

    public final void void_if() {
        super.void_if();
        this.cfr_renamed_3 = null;
    }

    public dy_0() {
        dy_0 dy_02 = this;
        dy_02.soXu = System.currentTimeMillis();
        dy_02.cfr_renamed_3 = null;
    }
}

