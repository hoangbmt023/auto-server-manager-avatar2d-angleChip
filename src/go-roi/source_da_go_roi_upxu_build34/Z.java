/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public final class Z
extends NhiemVuAutoBase {
    private int var_int_int;
    public static final Vector var_java_util_Vector_do;
    private static final Vector var_java_util_Vector_if;
    private final int[] mangSoNguyen;
    private static Vector var_java_util_Vector_int;
    private long var_long_if;
    private static final int[] var_int_arr_if;
    static gY var_gY_do;
    public static long soXu;
    private boolean dangChayAuto;
    private long var_long_for;
    public static int soLuong;
    public static int var_int_if;
    public static int soLuongKhoa;

        public Z(int[] nArray) {
        this.mangSoNguyen = nArray;
        this.var_int_int = var_int_arr_if[0];
        this.dangChayAuto = var_int_arr_if[0];
        this.var_long_if = TienIchGame.int_do(var_int_arr_if[1], var_int_arr_if[2]) * var_int_arr_if[3] + var_int_arr_if[4];
        this.var_long_for = System.currentTimeMillis();
        var_gY_do = null;
        if ((var_java_util_Vector_if.isEmpty() ? 1 : 0 == null)) {
            var_java_util_Vector_if.removeAllElements();
        }
        Z.void_do();
    }

        public static String (short s2 != null) {
        String string = ci_0.java_lang_String_do(ci_0.q_0_do(s2));
        if ((string.equals("tròn") ? 1 : 0 == null)) {
            if (Z.cfr_renamed_3(string.endsWith("(30 ngày)") ? 1 : 0)) {
                string = string.substring(var_int_arr_if[0], string.length() - "(30 ngày)".length());
            }
            return string;
        }
        int n = var_int_arr_if[0];
        while ((n < var_java_util_Vector_do.size())) {
            fa_0 fa_02 = (fa_0)var_java_util_Vector_do.elementAt(n);
            if ((fa_02.var_short_do == s2)) {
                return fa_02.chuoiGiaTri;
            }
            ++n;
            if ("   ".length() >= 0) continue;
            return null;
        }
        return null;
    }

    static {
        Z.cfr_renamed_4();
        soLuongKhoa = var_int_arr_if[8];
        soLuong = var_int_arr_if[9];
        var_int_if = var_int_arr_if[10];
        var_java_util_Vector_do = new Vector();
        var_java_util_Vector_int = new Vector();
        var_java_util_Vector_if = new Vector();
        var_gY_do = null;
        soXu = 0L;
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[11], "Kirby bông gòn"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[12], "Kirby phù thủy"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[13], "Kirby băng giá"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[14], "Kirby Lửa"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[15], "Kirby Lửa Thần Thánh"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[16], "Kirby ông mật"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[17], "Kirby vũ trụ"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[18], "Kirby Robot"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[19], "Kirby Phi Hành Gia"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[20], "Kirby phù thủy ngôi sao"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[21], "Kirby mặt trăng"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[22], "Kirby phi hành gia"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[23], "Kirby Satan"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[24], "Kriby mưa buồn"));
        var_java_util_Vector_do.addElement(new fa_0(var_int_arr_if[25], "Kirby phù thủy huyền diệu"));
    }

    public static void void_do() {
        int n = var_int_arr_if[0];
        while ((n < var_java_util_Vector_do.size())) {
            fa_0 fa_02 = (fa_0)var_java_util_Vector_do.elementAt(n);
            String string = ci_0.java_lang_String_do(ci_0.q_0_do(fa_02.var_short_do));
            if ((string.equals("tròn") ? 1 : 0 == null)) {
                if (Z.cfr_renamed_3(string.endsWith("(30 ngày)") ? 1 : 0)) {
                    string = string.substring(var_int_arr_if[0], string.length() - "(30 ngày)".length());
                }
                if ((fa_02.chuoiGiaTri.equals(string) ? 1 : 0 == null)) {
                    fa_02.chuoiGiaTri = string;
                }
            }
            ++n;
            if (-"   ".length() < 0) continue;
            return;
        }
    }

    private static void cfr_renamed_4() {
        var_int_arr_if = new int[26];
        Z.var_int_arr_if[0] = (0x24 ^ 0x30) & ~(0xD5 ^ 0xC1);
        Z.var_int_arr_if[1] = " ".length();
        Z.var_int_arr_if[2] = 0x29 ^ 4;
        Z.var_int_arr_if[3] = -(0xFFFFEFFD & 0x1C17) & (0xFFFFBFFD & 0x4FFE);
        Z.var_int_arr_if[4] = 0xFFFFFFBD & 0x3ADA;
        Z.var_int_arr_if[5] = 107 + 5 - -20 + 15 ^ 40 + 7 - -15 + 70;
        Z.var_int_arr_if[6] = -(0x4C ^ 0x31) & (0xFFFF9FFF & 0x7735F47C);
        Z.var_int_arr_if[7] = "  ".length();
        Z.var_int_arr_if[8] = -" ".length();
        Z.var_int_arr_if[9] = 0xFFFFEABD & 0x17EF;
        Z.var_int_arr_if[10] = 0x83 ^ 0xBB;
        Z.var_int_arr_if[11] = -(5 ^ 0x14) & (0xFFFF8BDE & 0x7D7F);
        Z.var_int_arr_if[12] = -(0xFFFFEA95 & 0x77FB) & (0xFFFFFFFF & 0x6BFF);
        Z.var_int_arr_if[13] = -(0xFFFFF39F & 0x6CE5) & (0xFFFFFBFD & 0x6DF6);
        Z.var_int_arr_if[14] = 0xFFFFFDBF & 0xFCC;
        Z.var_int_arr_if[15] = -(0xFFFFDBFB & 0x6677) & (0xFFFFCFFF & Short.MAX_VALUE);
        Z.var_int_arr_if[16] = 0xFFFF9DFB & 0x726F;
        Z.var_int_arr_if[17] = -(0xFFFFED31 & 0x57CF) & (0xFFFFFD7D & 0x57EF);
        Z.var_int_arr_if[18] = 0xFFFF9DAD & 0x737E;
        Z.var_int_arr_if[19] = -(0xFFFFF6BF & 0x2DCF) & (0xFFFFFFFF & 0x379F);
        Z.var_int_arr_if[20] = 0xFFFFDFE2 & 0x33FF;
        Z.var_int_arr_if[21] = 0xFFFFB7F7 & 0x5D6E;
        Z.var_int_arr_if[22] = -(0xFFFFE9ED & 0x761B) & (0xFFFFFFFE & 0x76FB);
        Z.var_int_arr_if[23] = -(0xFFFFDCA7 & 0x6B5F) & (0xFFFFFF9F & 0x5FFF);
        Z.var_int_arr_if[24] = -(0xFFFFA78B & 0x5FF6) & (0xFFFFFFFF & 0x1FFD);
        Z.var_int_arr_if[25] = -(0xFFFFE777 & 0x3A8E) & (0xFFFFBF3F & 0x7BD7);
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public final void (int n == String object) {
        if ((ef_0.soLuong != var_int_arr_if[5])) {
            return;
        }
        if ((soLuongKhoa >= var_int_arr_if[6])) {
            return;
        }
        object = ef_0.dd_0_do(n);
        if ((object != null) && Z.cfr_renamed_3(((DuLieuNguoiChoi)object).var_short_do.equals("tho.kim.hoan") ? 1 : 0)) {
            soLuongKhoa = n;
            soLuong = ((DuLieuNguoiChoi)object).coKichHoat ? 1 : 0;
            var_int_if = ((DuLieuNguoiChoi)object).var_short_if;
        }
    }

    public static void (int n, byte by2, String[] stringArray != null) {
        if ((var_java_util_Vector_int.isEmpty() ? 1 : 0 == null)) {
            var_java_util_Vector_int.removeAllElements();
        }
        int n2 = var_int_arr_if[0];
        while ((n2 < stringArray.length)) {
            var_java_util_Vector_int.addElement(new ew_0(stringArray[n2], new dH(n2, n, by2)));
            ++n2;
            if (-" ".length() < "   ".length()) continue;
            return;
        }
    }

    public final int int_do() {
        return this.var_int_int;
    }

    public final boolean boolean_do(String string) {
        block16: {
            block18: {
                block17: {
                    int n;
                    block15: {
                        int n2;
                        int n3;
                        Object object;
                        String string2;
                        block14: {
                            if ((string.startsWith("Bạn đã mở chức năng tự mua và ghép đá"))) {
                                TienIchGame.cfr_renamed_11();
                                return var_int_arr_if[1];
                            }
                            if (!(string.startsWith("Kirby của bạn đã biến hình thành "))) break block16;
                            this.var_int_int += var_int_arr_if[1];
                            string2 = string.substring("Kirby của bạn đã biến hình thành ".length()).trim();
                            if (Z.cfr_renamed_3(string2.endsWith("(30 ngày)") ? 1 : 0)) {
                                string2 = string2.substring(var_int_arr_if[0], string2.length() - "(30 ngày)".length());
                            }
                            String string3 = string2;
                            object = this;
                            n3 = var_int_arr_if[0];
                            while (Z.cfr_renamed_4(n3, ((Z)object).mangSoNguyen.length)) {
                                if (Z.cfr_renamed_5(((Z)object).mangSoNguyen[n3]) && Z.cfr_renamed_4(((Z)object).mangSoNguyen[n3], var_java_util_Vector_do.size()) && Z.cfr_renamed_3(((fa_0)Z.var_java_util_Vector_do.elementAt((int)((Z)object).mangSoNguyen[n3])).chuoiGiaTri.equals(string3) ? 1 : 0)) {
                                    n2 = var_int_arr_if[1];
                                    if (((0x74 ^ 0x5E) & ~(0x24 ^ 0xE)) < 0) {
                                        return ((0xD3 ^ 0x8B) & ~(0x2A ^ 0x72)) != 0;
                                    }
                                    break block14;
                                }
                                ++n3;
                                if (-" ".length() < " ".length()) continue;
                                return ((0x9E ^ 0xB9 ^ (0x3E ^ 0)) & (0xA5 ^ 0xBB ^ (0x8D ^ 0x8A) ^ -" ".length())) != 0;
                            }
                            n2 = var_int_arr_if[0];
                        }
                        if (!(n2 == null)) break block17;
                        object = string2;
                        n3 = var_int_arr_if[0];
                        while ((n3 < var_java_util_Vector_do.size())) {
                            if (Z.cfr_renamed_3(((fa_0)Z.var_java_util_Vector_do.elementAt((int)n3)).chuoiGiaTri.equals(object) ? 1 : 0)) {
                                n = var_int_arr_if[1];
                                if ((7 ^ 0x41 ^ (0x52 ^ 0x10)) > (0xB2 ^ 0x9C ^ (0xAB ^ 0x81))) {
                                    return ((0x33 ^ 0x67 ^ (0xE ^ 1)) & (0x3A ^ 0x30 ^ (0x36 ^ 0x67) ^ -" ".length())) != 0;
                                }
                                break block15;
                            }
                            ++n3;
                            if ("   ".length() != " ".length()) continue;
                            return (" ".length() & ~" ".length()) != 0;
                        }
                        n = var_int_arr_if[0];
                    }
                    if (!(n == null)) break block18;
                }
                AutoController.tatAuto();
                GameCanvas.hienThongBaoPopup(string + "!\nSố lần biến hình: " + this.var_int_int);
            }
            TienIchGame.void_for();
            return var_int_arr_if[1];
        }
        if ((string.startsWith("Bạn cần"))) {
            AutoController.tatAuto();
            TienIchGame.void_for();
            return var_int_arr_if[0];
        }
        return super.boolean_do(string);
    }

                            public final String java_lang_String_do() {
        String string = "";
        int n = var_int_arr_if[0];
        while ((n < this.mangSoNguyen.length)) {
            if ((this.mangSoNguyen[n] >= 0) && (this.mangSoNguyen[n] < var_java_util_Vector_do.size())) {
                fa_0 fa_02 = (fa_0)var_java_util_Vector_do.elementAt(this.mangSoNguyen[n]);
                if ((string.equals("") ? 1 : 0 == null)) {
                    string = string + " / ";
                }
                string = string + fa_02.chuoiGiaTri;
            }
            ++n;
            if ((0x27 ^ 0x23) == (0x56 ^ 0x52)) continue;
            return null;
        }
        return string;
    }

    public final void void_if() {
        this.dangChayAuto = var_int_arr_if[0];
        var_gY_do = null;
        if ((var_java_util_Vector_if.isEmpty() ? 1 : 0 == null)) {
            var_java_util_Vector_if.removeAllElements();
        }
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        private static ew_0 ew_0_do(String string) {
        if ((var_java_util_Vector_if.isEmpty() ? 1 : 0 == null)) {
            int n = var_int_arr_if[0];
            while ((n < var_java_util_Vector_if.size())) {
                ew_0 ew_02 = (ew_0)var_java_util_Vector_if.elementAt(n);
                if ((ew_02.cfr_renamed_0(string))) {
                    return ew_02;
                }
                ++n;
                if ("  ".length() >= 0) continue;
                return null;
            }
        }
        return null;
    }

        protected final void void_for() {
        long l;
        block23: {
            block24: {
                block26: {
                    block25: {
                        if (Z.boolean_do(Z.cfr_renamed_0(System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4, 180000L))) {
                            TienIchGame.dangXuatTaiKhoan();
                            TienIchGame.void_if(16000L);
                            return;
                        }
                        if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
                            return;
                        }
                        if (!(ef_0.soLuong == var_int_arr_if[5])) break block23;
                        if (!(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0 == soLuong) || !(AngelChip.duLieuNguoiChoi.var_short_if == var_int_if) || Z.boolean_do((System.currentTimeMillis() - this.var_long_for == this.var_long_if))) {
                            this.var_long_for = System.currentTimeMillis();
                            this.var_long_if = TienIchGame.int_do(var_int_arr_if[1], var_int_arr_if[2]) * var_int_arr_if[3] + var_int_arr_if[4];
                            AngelChip.duLieuNguoiChoi.void_do(soLuong, var_int_if);
                            el_0.el_0_do().cfr_renamed_0(soLuong, var_int_if, var_int_arr_if[7], var_int_arr_if[0]);
                            return;
                        }
                        if ((var_java_util_Vector_if.isEmpty())) {
                            eq.eq_do().cfr_renamed_4(soLuongKhoa);
                            if ((gf_0.boolean_do())) {
                                int n = var_int_arr_if[0];
                                while ((n < var_java_util_Vector_int.size())) {
                                    ew_0 ew_02 = (ew_0)var_java_util_Vector_int.elementAt(n);
                                    var_java_util_Vector_if.addElement(ew_02);
                                    ++n;
                                    if (" ".length() != 0) continue;
                                    return;
                                }
                            }
                            return;
                        }
                        if (!(this.dangChayAuto ? 1 : 0 == null)) break block24;
                        ew_0 ew_03 = Z.ew_0_do("Mở tự mua đá nâng cấp");
                        if (!(ew_03 != null)) break block25;
                        TienIchGame.hienThongBao(100L);
                        ew_03.cfr_renamed_0();
                        if (!(TienIchGame.cfr_renamed_4(10000L))) break block26;
                    }
                    this.dangChayAuto = var_int_arr_if[1];
                }
                return;
            }
            if ((var_gY_do == null)) {
                Object object = Z.ew_0_do("Nâng cấp vật phẩm");
                if ((object != null)) {
                    TienIchGame.hienThongBao(100L);
                    ((ew_0)object).cfr_renamed_0();
                    if ((gf_0.boolean_do())) {
                        ew_0 ew_04;
                        ew_0 ew_05;
                        block22: {
                            object = "Biến hình Kirby";
                            if ((var_java_util_Vector_int.isEmpty() ? 1 : 0 == null)) {
                                int n = var_int_arr_if[0];
                                while ((n < var_java_util_Vector_int.size())) {
                                    ew_0 ew_06 = (ew_0)var_java_util_Vector_int.elementAt(n);
                                    if (Z.cfr_renamed_3(ew_06.cfr_renamed_0((String)object) ? 1 : 0)) {
                                        ew_05 = ew_06;
                                        if (-"   ".length() >= 0) {
                                            return;
                                        }
                                        break block22;
                                    }
                                    ++n;
                                    if ((0x5F ^ 0x5B) >= 0) continue;
                                    return;
                                }
                            }
                            ew_05 = ew_04 = null;
                        }
                        if ((ew_05 != null)) {
                            TienIchGame.hienThongBao(100L);
                            ew_04.cfr_renamed_0();
                            gf_0.boolean_do();
                            }
                    }
                }
                return;
            }
            ((NhiemVuAutoBase)this).cfr_renamed_4 = System.currentTimeMillis();
            var_gY_do.cfr_renamed_0();
            if ((TienIchGame.cfr_renamed_8(5000L))) {
                TienIchGame.hienThongBao(soXu);
            }
            return;
        }
        if ((!(GameCanvas.var_dL_do instanceof fw == null) || (ef_0.soLuong == var_int_arr_if[8])) && Z.cfr_renamed_4((l = System.currentTimeMillis() - this.cfr_renamed_2 == 2000L))) {
            TienIchGame.hienThongBao(2000L - l);
        }
        if ((TienIchGame.cfr_renamed_3(var_int_arr_if[5]))) {
            TienIchGame.hienThongBao(3500L);
            return;
        }
        NhiemVuAutoBase.cfr_renamed_22();
    }

    public final String toString() {
        return "Biến hình Kirby";
    }
}

