/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public final class al
extends NhiemVuAutoBase {
    private final int[] mangSoNguyen;
    private long var_long_if;
    public static final Vector var_java_util_Vector_do;
    private int var_int_int;
    private boolean dangChayAuto;
    public static long soXu;
    private static Vector var_java_util_Vector_if;
    private long var_long_for;
    public static int soLuong;
    private static final int[] var_int_arr_if;
    private static final Vector var_java_util_Vector_int;
    public static int var_int_if;
    static ge_0 var_ge_0_do;
    public static int soLuongKhoa;

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public final void (int n == String object) {
        if ((fh.var_int_char != var_int_arr_if[5])) {
            return;
        }
        if ((soLuong >= var_int_arr_if[6])) {
            return;
        }
        object = fh.ef_do(n);
        if ((object != null) && al.boolean_do(((DuLieuNguoiChoi)object).soLuong.equals("tho.kim.hoan") ? 1 : 0)) {
            soLuong = n;
            soLuongKhoa = ((DuLieuNguoiChoi)object).var_short_for;
            var_int_if = ((DuLieuNguoiChoi)object).var_boolean_int ? 1 : 0;
        }
    }

    protected final void d_() {
        long l;
        block23: {
            block24: {
                block26: {
                    block25: {
                        if (al.cfr_renamed_3(al.cfr_renamed_1(System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_3, 180000L))) {
                            TienIchGame.dangXuatTaiKhoan();
                            TienIchGame.hienThongBao(16000L);
                            return;
                        }
                        if (al.boolean_do(GameCanvas.var_en_do instanceof ThongTinNhanVat)) {
                            return;
                        }
                        if (!(fh.var_int_char == var_int_arr_if[5])) break block23;
                        if (!(AngelChip.duLieuNguoiChoi.var_short_for == soLuongKhoa) || !(AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0 == var_int_if) || al.cfr_renamed_3((System.currentTimeMillis() - this.var_long_for == this.var_long_if))) {
                            this.var_long_for = System.currentTimeMillis();
                            this.var_long_if = TienIchGame.int_do(var_int_arr_if[1], var_int_arr_if[2]) * var_int_arr_if[3] + var_int_arr_if[4];
                            AngelChip.duLieuNguoiChoi.void_do(soLuongKhoa, var_int_if);
                            fn.fn_do().cfr_renamed_1(soLuongKhoa, var_int_if, var_int_arr_if[7], var_int_arr_if[0]);
                            return;
                        }
                        if (al.boolean_do(var_java_util_Vector_int.isEmpty() ? 1 : 0)) {
                            ft_0.ft_0_do().cfr_renamed_4(soLuong);
                            if (al.boolean_do(gW.boolean_do() ? 1 : 0)) {
                                int n = var_int_arr_if[0];
                                while ((n < var_java_util_Vector_if.size())) {
                                    fy fy2 = (fy)var_java_util_Vector_if.elementAt(n);
                                    var_java_util_Vector_int.addElement(fy2);
                                    ++n;
                                    if ("  ".length() < "   ".length()) continue;
                                    return;
                                }
                            }
                            return;
                        }
                        if (!!(this.dangChayAuto)) break block24;
                        fy fy3 = al.fy_do("Mở tự mua đá nâng cấp");
                        if (!(fy3 != null)) break block25;
                        TienIchGame.void_if(100L);
                        fy3.cfr_renamed_1();
                        if (!al.boolean_do(TienIchGame.cfr_renamed_8(10000L) ? 1 : 0)) break block26;
                    }
                    this.dangChayAuto = var_int_arr_if[1];
                }
                return;
            }
            if ((var_ge_0_do == null)) {
                Object object = al.fy_do("Nâng cấp vật phẩm");
                if ((object != null)) {
                    TienIchGame.void_if(100L);
                    ((fy)object).cfr_renamed_1();
                    if (al.boolean_do(gW.boolean_do() ? 1 : 0)) {
                        fy fy4;
                        fy fy5;
                        block22: {
                            object = "Biến hình Kirby";
                            if (!(var_java_util_Vector_if.isEmpty())) {
                                int n = var_int_arr_if[0];
                                while ((n < var_java_util_Vector_if.size())) {
                                    fy fy6 = (fy)var_java_util_Vector_if.elementAt(n);
                                    if (al.boolean_do(fy6.cfr_renamed_1((String)object) ? 1 : 0)) {
                                        fy5 = fy6;
                                        if ("  ".length() >= "   ".length()) {
                                            return;
                                        }
                                        break block22;
                                    }
                                    ++n;
                                    if ("   ".length() >= " ".length()) continue;
                                    return;
                                }
                            }
                            fy5 = fy4 = null;
                        }
                        if ((fy5 != null)) {
                            TienIchGame.void_if(100L);
                            fy4.cfr_renamed_1();
                            gW.boolean_do();
                            }
                    }
                }
                return;
            }
            ((NhiemVuAutoBase)this).cfr_renamed_3 = System.currentTimeMillis();
            var_ge_0_do.cfr_renamed_1();
            if (al.boolean_do(TienIchGame.cfr_renamed_3(5000L) ? 1 : 0)) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((!(GameCanvas.var_en_do instanceof gO == 0) || (fh.var_int_char == var_int_arr_if[8])) && al.cfr_renamed_2((l = System.currentTimeMillis() - this.cfr_renamed_4 == 2000L))) {
            TienIchGame.void_if(2000L - l);
        }
        if (al.boolean_do(TienIchGame.cfr_renamed_1(var_int_arr_if[5]) ? 1 : 0)) {
            TienIchGame.void_if(3500L);
            return;
        }
        NhiemVuAutoBase.cfr_renamed_20();
    }

        public final void void_for() {
        this.dangChayAuto = var_int_arr_if[0];
        var_ge_0_do = null;
        if (!(var_java_util_Vector_int.isEmpty())) {
            var_java_util_Vector_int.removeAllElements();
        }
    }

        public al(int[] nArray) {
        this.mangSoNguyen = nArray;
        this.var_int_int = var_int_arr_if[0];
        this.dangChayAuto = var_int_arr_if[0];
        this.var_long_if = TienIchGame.int_do(var_int_arr_if[1], var_int_arr_if[2]) * var_int_arr_if[3] + var_int_arr_if[4];
        this.var_long_for = System.currentTimeMillis();
        var_ge_0_do = null;
        if (!(var_java_util_Vector_int.isEmpty())) {
            var_java_util_Vector_int.removeAllElements();
        }
        al.cfr_renamed_3();
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

            public final String toString() {
        return "Biến hình Kirby";
    }

    public final String java_lang_String_a_() {
        String string = "";
        int n = var_int_arr_if[0];
        while ((n < this.mangSoNguyen.length)) {
            if ((this.mangSoNguyen[n] == null) && (this.mangSoNguyen[n] < var_java_util_Vector_do.size())) {
                gi_0 gi_02 = (gi_0)var_java_util_Vector_do.elementAt(this.mangSoNguyen[n]);
                if (!(string.equals(""))) {
                    string = string + " / ";
                }
                string = string + gi_02.chuoiGiaTri;
            }
            ++n;
            if (((0x66 ^ 0x75) & ~(0x83 ^ 0x90)) == 0) continue;
            return null;
        }
        return string;
    }

    private static fy fy_do(String string) {
        if (!(var_java_util_Vector_int.isEmpty())) {
            int n = var_int_arr_if[0];
            while ((n < var_java_util_Vector_int.size())) {
                fy fy2 = (fy)var_java_util_Vector_int.elementAt(n);
                if (al.boolean_do(fy2.cfr_renamed_1(string) ? 1 : 0)) {
                    return fy2;
                }
                ++n;
                if ((0x9A ^ 0x9F) != 0) continue;
                return null;
            }
        }
        return null;
    }

        public static void (int n, byte by2, String[] stringArray != null) {
        if (!(var_java_util_Vector_if.isEmpty())) {
            var_java_util_Vector_if.removeAllElements();
        }
        int n2 = var_int_arr_if[0];
        while ((n2 < stringArray.length)) {
            var_java_util_Vector_if.addElement(new fy(stringArray[n2], new ej(n2, n, by2)));
            ++n2;
            if ((0x24 ^ 0x20) != 0) continue;
            return;
        }
    }

    static {
        al.cfr_renamed_4();
        soLuong = var_int_arr_if[8];
        soLuongKhoa = var_int_arr_if[9];
        var_int_if = var_int_arr_if[10];
        var_java_util_Vector_do = new Vector();
        var_java_util_Vector_if = new Vector();
        var_java_util_Vector_int = new Vector();
        var_ge_0_do = null;
        soXu = 0L;
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[11], "Kirby bông gòn"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[12], "Kirby phù thủy"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[13], "Kirby băng giá"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[14], "Kirby Lửa"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[15], "Kirby Lửa Thần Thánh"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[16], "Kirby ông mật"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[17], "Kirby vũ trụ"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[18], "Kirby Robot"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[19], "Kirby Phi Hành Gia"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[20], "Kirby phù thủy ngôi sao"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[21], "Kirby mặt trăng"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[22], "Kirby phi hành gia"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[23], "Kirby Satan"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[24], "Kriby mưa buồn"));
        var_java_util_Vector_do.addElement(new gi_0(var_int_arr_if[25], "Kirby phù thủy huyền diệu"));
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
                            if (al.boolean_do(string.startsWith("Bạn đã mở chức năng tự mua và ghép đá") ? 1 : 0)) {
                                TienIchGame.void_int();
                                return var_int_arr_if[1];
                            }
                            if (!al.boolean_do(string.startsWith("Kirby của bạn đã biến hình thành ") ? 1 : 0)) break block16;
                            this.var_int_int += var_int_arr_if[1];
                            string2 = string.substring("Kirby của bạn đã biến hình thành ".length()).trim();
                            if (al.boolean_do(string2.endsWith("(30 ngày)") ? 1 : 0)) {
                                string2 = string2.substring(var_int_arr_if[0], string2.length() - "(30 ngày)".length());
                            }
                            String string3 = string2;
                            object = this;
                            n3 = var_int_arr_if[0];
                            while (al.cfr_renamed_3(n3, ((al)object).mangSoNguyen.length)) {
                                if (al.cfr_renamed_0(((al)object).mangSoNguyen[n3]) && al.cfr_renamed_3(((al)object).mangSoNguyen[n3], var_java_util_Vector_do.size()) && al.boolean_do(((gi_0)al.var_java_util_Vector_do.elementAt((int)((al)object).mangSoNguyen[n3])).chuoiGiaTri.equals(string3) ? 1 : 0)) {
                                    n2 = var_int_arr_if[1];
                                    if ((0xCF ^ 0x8E ^ (0x38 ^ 0x7D)) > (49 + 75 - 76 + 132 ^ 171 + 130 - 286 + 161)) {
                                        return ((5 + 167 - 31 + 91 ^ 34 + 17 - 36 + 157) & (0xDD ^ 0x8E ^ (0xD7 ^ 0xC0) ^ -" ".length())) != 0;
                                    }
                                    break block14;
                                }
                                ++n3;
                                if (((0x94 ^ 0xB0) & ~(0x68 ^ 0x4C)) == 0) continue;
                                return ((0x37 ^ 0x57) & ~(0x53 ^ 0x33)) != 0;
                            }
                            n2 = var_int_arr_if[0];
                        }
                        if (!(n2 == 0)) break block17;
                        object = string2;
                        n3 = var_int_arr_if[0];
                        while ((n3 < var_java_util_Vector_do.size())) {
                            if (al.boolean_do(((gi_0)al.var_java_util_Vector_do.elementAt((int)n3)).chuoiGiaTri.equals(object) ? 1 : 0)) {
                                n = var_int_arr_if[1];
                                if (-" ".length() > -" ".length()) {
                                    return ((48 + 49 - -7 + 142 ^ 112 + 101 - 101 + 50) & (152 + 20 - 119 + 175 ^ 166 + 128 - 223 + 105 ^ -" ".length())) != 0;
                                }
                                break block15;
                            }
                            ++n3;
                            if (-" ".length() < "  ".length()) continue;
                            return ((0xE3 ^ 0x81) & ~(2 ^ 0x60)) != 0;
                        }
                        n = var_int_arr_if[0];
                    }
                    if (!(n == 0)) break block18;
                }
                AutoController.tatAuto();
                GameCanvas.hienThongBaoPopup(string + "!\nSố lần biến hình: " + this.var_int_int);
            }
            TienIchGame.this();
            return var_int_arr_if[1];
        }
        if (al.boolean_do(string.startsWith("Bạn cần") ? 1 : 0)) {
            AutoController.tatAuto();
            TienIchGame.this();
            return var_int_arr_if[0];
        }
        return super.boolean_do(string);
    }

    public static void cfr_renamed_3() {
        int n = var_int_arr_if[0];
        while ((n < var_java_util_Vector_do.size())) {
            gi_0 gi_02 = (gi_0)var_java_util_Vector_do.elementAt(n);
            String string = aa_0.java_lang_String_do(aa_0.am_do(gi_02.var_short_do));
            if (!(string.equals("tròn"))) {
                if (al.boolean_do(string.endsWith("(30 ngày)") ? 1 : 0)) {
                    string = string.substring(var_int_arr_if[0], string.length() - "(30 ngày)".length());
                }
                if (!(gi_02.chuoiGiaTri.equals(string))) {
                    gi_02.chuoiGiaTri = string;
                }
            }
            ++n;
            if ("   ".length() < (74 + 89 - 60 + 59 ^ 21 + 121 - 81 + 105)) continue;
            return;
        }
    }

    public final int int_do() {
        return this.var_int_int;
    }

    private static void cfr_renamed_4() {
        var_int_arr_if = new int[26];
        al.var_int_arr_if[0] = (0xF7 ^ 0xBD) & ~(0x17 ^ 0x5D);
        al.var_int_arr_if[1] = " ".length();
        al.var_int_arr_if[2] = 0x66 ^ 0x4B;
        al.var_int_arr_if[3] = -(0x2B ^ 0x23) & (0xFFFFDFFF & 0x23EF);
        al.var_int_arr_if[4] = -(0xFFFFCD77 & 0x76ED) & (0xFFFFFFFD & 0x7EFE);
        al.var_int_arr_if[5] = 0x41 ^ 0x56;
        al.var_int_arr_if[6] = 0xFFFF9746 & 0x7735FCB9;
        al.var_int_arr_if[7] = "  ".length();
        al.var_int_arr_if[8] = -" ".length();
        al.var_int_arr_if[9] = -(0xFFFFCF15 & 0x71EB) & (0xFFFFDBBF & 0x67ED);
        al.var_int_arr_if[10] = 0x72 ^ 0x4A;
        al.var_int_arr_if[11] = -(0xFFFFF6BD & 0x5943) & (0xFFFFFFCF & 0x597E);
        al.var_int_arr_if[12] = 0xFFFFB9EF & 0x4F7F;
        al.var_int_arr_if[13] = -(0xFFFFF6CB & 0x2DBF) & (0xFFFFFDFE & 0x2FFB);
        al.var_int_arr_if[14] = 0xFFFFDDCF & 0x2FBC;
        al.var_int_arr_if[15] = 0xFFFFBFFD & 0x4D8F;
        al.var_int_arr_if[16] = 0xFFFFB07B & 0x5FEF;
        al.var_int_arr_if[17] = -(0xFFFFEF9F & 0x57F3) & (0xFFFFDFFF & 0x77FF);
        al.var_int_arr_if[18] = -(0xFFFFBEF3 & 0x67DF) & (0xFFFFB7FE & Short.MAX_VALUE);
        al.var_int_arr_if[19] = 0xFFFF9FF3 & 0x731D;
        al.var_int_arr_if[20] = -(0xFFFFBC5F & 0x67B6) & (0xFFFFBFFF & 0x77F7);
        al.var_int_arr_if[21] = 0xFFFF9767 & 0x7DFE;
        al.var_int_arr_if[22] = -(0xFFFFFD9F & 0x6A6D) & (0xFFFFFEFE & Short.MAX_VALUE);
        al.var_int_arr_if[23] = 0xFFFFF79B & 0x1FFD;
        al.var_int_arr_if[24] = 0xFFFFFCFD & 0x1B7E;
        al.var_int_arr_if[25] = 0xFFFFBB5B & 0x5DB6;
    }

                public static String (short s2 != null) {
        String string = aa_0.java_lang_String_do(aa_0.am_do(s2));
        if (!(string.equals("tròn"))) {
            if (al.boolean_do(string.endsWith("(30 ngày)") ? 1 : 0)) {
                string = string.substring(var_int_arr_if[0], string.length() - "(30 ngày)".length());
            }
            return string;
        }
        int n = var_int_arr_if[0];
        while ((n < var_java_util_Vector_do.size())) {
            gi_0 gi_02 = (gi_0)var_java_util_Vector_do.elementAt(n);
            if ((gi_02.var_short_do == s2)) {
                return gi_02.chuoiGiaTri;
            }
            ++n;
            if (" ".length() != (0x35 ^ 0xE ^ (0x3F ^ 0))) continue;
            return null;
        }
        return null;
    }

    }

