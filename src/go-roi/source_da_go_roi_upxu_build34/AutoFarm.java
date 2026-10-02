/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.TimeZone;
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from aC
 */
public class AutoFarm
extends NhiemVuAutoBase
implements cp {
    public static int[] mangSoNguyen;
    public static byte var_byte_do;
    public static boolean dangChayAuto;
    private static short[] var_short_arr_do;
    private static int[] var_int_arr_if;
    public static boolean coTrangThai;
    public static int soLuongKhoa;
    protected int var_int_int;
    public static int var_int_new;
    public static boolean coKichHoat;
    private final Object var_java_lang_Object_do;
    static gY var_gY_do;
    private boolean var_boolean_byte;
    private boolean var_boolean_case;
    public static final String[][] var_java_lang_String_arr_arr_do;
    public static final Vector var_java_util_Vector_do;
    private static final int[] var_int_arr_for;
    public static Hashtable var_java_util_Hashtable_do;
    private int soLuong;
    protected static Vector var_java_util_Vector_if;
    public static boolean var_boolean_int;
    private static Hashtable var_java_util_Hashtable_int;
    static gY var_gY_if;
    public static boolean var_boolean_new;
    public static byte var_byte_if;
    public static String chuoiGiaTri;
    private static int[] var_int_arr_int;
    private boolean var_boolean_char;
    public static int var_int_try;
    public static int var_int_byte;
    private static Vector var_java_util_Vector_int;
    private final int var_int_if;
    private static short[] var_short_arr_if;
    public static byte var_byte_for;
    protected int var_int_case;
    public static int var_int_char;
    private boolean var_boolean_else;
    public static Hashtable var_java_util_Hashtable_if;
    public static int var_int_else;
    public static String tenNhanVat;
    public static String chuoiPhu;
    public static Hashtable var_java_util_Hashtable_for;
    public static boolean var_boolean_try;

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    public void void_do() {
        if ((this.var_int_if != 0) && (AutoController.nhiemVuHienTai != null)) {
            return;
        }
        if ((this.var_int_if == var_int_arr_for[5])) {
            if ((this.var_java_lang_Object_do != null)) {
                Object object = (am)this.var_java_lang_Object_do;
                if (AutoFarm.boolean_do(((am)object).cfr_renamed_1) && AutoFarm.boolean_do(((am)object).cfr_renamed_3)) {
                    object = "cuốc hết đất";
                    } else if (AutoFarm.cfr_renamed_3(((am)object).cfr_renamed_1) && AutoFarm.boolean_do(((am)object).cfr_renamed_3)) {
                    object = "làm đất từ ô " + ((am)object).cfr_renamed_1 + " đến hết";
                    if (" ".length() == 0) {
                        return;
                    }
                } else if (AutoFarm.boolean_do(((am)object).cfr_renamed_1) && AutoFarm.cfr_renamed_3(((am)object).cfr_renamed_3)) {
                    object = "làm đất từ ô 1 đến ô " + ((am)object).cfr_renamed_3;
                    } else {
                    object = "làm đất từ ô " + ((am)object).cfr_renamed_1 + " đến ô " + ((am)object).cfr_renamed_3;
                }
                TienIchGame.cfr_renamed_0("Đồng ý", "Bạn có chắc muốn " + (String)object + "?\n(Cây cũ sẽ bị phá nếu có)", new AutoFarm(var_int_arr_for[6], this.var_java_lang_Object_do));
                return;
            }
            AutoFarm.cfr_renamed_23();
            return;
        }
        if ((this.var_int_if == var_int_arr_for[7]) && (this.var_java_lang_Object_do != null)) {
            byte by2 = (Byte)this.var_java_lang_Object_do;
            if ((by2 == var_int_arr_for[8])) {
                TienIchGame.cfr_renamed_0("Đồng ý", "Bạn có chắc muốn bán hết Bò, Cừu và Dê không?", new AutoFarm(var_int_arr_for[7], new Byte(var_int_arr_for[5])));
                return;
            }
            if ((by2 == var_int_arr_for[9])) {
                TienIchGame.cfr_renamed_0("Đồng ý", "Bạn có chắc muốn bán hết Bò không?", new AutoFarm(var_int_arr_for[7], new Byte(var_int_arr_for[10])));
                return;
            }
            if ((by2 == var_int_arr_for[11])) {
                TienIchGame.cfr_renamed_0("Đồng ý", "Bạn có chắc muốn bán hết Cừu không?", new AutoFarm(var_int_arr_for[7], new Byte(var_int_arr_for[12])));
                return;
            }
            if ((by2 == var_int_arr_for[13])) {
                TienIchGame.cfr_renamed_0("Đồng ý", "Bạn có chắc muốn bán hết Dê không?", new AutoFarm(var_int_arr_for[7], new Byte(var_int_arr_for[14])));
                return;
            }
        }
        this.cfr_renamed_16();
        AutoController.cfr_renamed_0(this);
    }

    protected static void cfr_renamed_4() {
        block12: {
            if ((var_int_arr_int != null)) {
                return;
            }
            if (!AutoFarm.boolean_do(chuoiPhu.equals("") ? 1 : 0)) break block12;
            String[] stringArray = TienIchGame.java_lang_String_arr_do(chuoiPhu, ",");
            var_int_arr_int = new int[stringArray.length];
            String string = "";
            int n = var_int_arr_for[0];
            while ((n < stringArray.length)) {
                block11: {
                    try {
                        int n2 = Integer.parseInt(stringArray[n].trim());
                        if ((n2 != null) && (n2 < var_int_arr_for[32]) && (ak_0.dY_if(n2) != null)) {
                            String string2;
                            AutoFarm.var_int_arr_int[n] = n2;
                            StringBuffer stringBuffer = new StringBuffer().append(string);
                            if (AutoFarm.boolean_do(string.equals("") ? 1 : 0)) {
                                string2 = ",";
                                } else {
                                string2 = "";
                            }
                            string = stringBuffer.append(string2).append(var_int_arr_int[n]).toString();
                            if (((0xEF ^ 0xC2) & ~(0x4E ^ 0x63)) != 0) {
                                return;
                            }
                            break block11;
                        }
                        AutoFarm.var_int_arr_int[n] = var_int_arr_for[1];
                    }
                    catch (NumberFormatException numberFormatException) {
                        AutoFarm.var_int_arr_int[n] = var_int_arr_for[1];
                    }
                    if ("  ".length() < -" ".length()) {
                        return;
                    }
                }
                ++n;
                if (" ".length() > 0) continue;
                return;
            }
            if (AutoFarm.boolean_do(chuoiPhu.equals(string) ? 1 : 0)) {
                chuoiPhu = string;
                AutoFarm.cfr_renamed_11();
            }
        }
    }

    protected static void cfr_renamed_5() {
        if ((coKichHoat)) {
            int n;
            int n2;
            Integer n3;
            Object object = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
            int n4 = ((Calendar)object).get(var_int_arr_for[15]);
            if (AutoFarm.boolean_do(var_java_util_Hashtable_int.isEmpty() ? 1 : 0) && AutoFarm.cfr_renamed_2(var_java_util_Hashtable_int.containsKey(n3 = new Integer(AngelChip.duLieuNguoiChoi.var_short_char)) ? 1 : 0)) {
                n2 = (Integer)var_java_util_Hashtable_int.get(n3);
                if ("  ".length() <= 0) {
                    return;
                }
            } else {
                n2 = n = var_int_arr_for[1];
            }
            if ((var_int_new != var_int_arr_for[1]) && (!(n != var_int_arr_for[1]) || (n != n4) && AutoFarm.boolean_do(((Calendar)object).get(var_int_arr_for[7]), var_int_arr_for[15]))) {
                TienIchGame.hienThongBao("Báo danh hàng ngày");
                AutoFarm.cfr_renamed_2();
                if (AutoFarm.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
                    object = AutoFarm.ew_0_do("Báo danh hàng ngày");
                    var_java_util_Vector_do.removeAllElements();
                    if ((object != null)) {
                        TienIchGame.hienThongBao(100L);
                        ((ew_0)object).cfr_renamed_0();
                        if ((gf_0.boolean_do())) {
                            object = AutoFarm.ew_0_do("Báo danh hàng ngày");
                            var_java_util_Vector_do.removeAllElements();
                            if ((object != null)) {
                                ((ew_0)object).cfr_renamed_0();
                                if ((TienIchGame.cfr_renamed_4(10000L))) {
                                    var_java_util_Hashtable_int.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n4));
                                    }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void cfr_renamed_19() {
        int n = var_int_arr_for[0];
        int n2 = var_int_arr_for[0];
        AutoFarm.void_do(var_int_arr_for[18], var_int_arr_for[2]);
        int n3 = var_int_arr_for[0];
        while ((n3 < bF.var_java_util_Vector_if.size())) {
            ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n3);
            if ((ha2.cfr_renamed_6 < var_int_arr_for[22])) {
                int n4 = var_int_arr_for[0];
                while ((ha2.cfr_renamed_6 < var_int_arr_for[22]) && (n4 < var_int_arr_for[27])) {
                    ++n4;
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, var_int_arr_for[18]);
                    if (AutoFarm.boolean_do(TienIchGame.boolean_do(5000L) ? 1 : 0)) {
                        ++n2;
                        if (-"   ".length() < 0) break;
                        return;
                    }
                    TienIchGame.hienThongBao(500L);
                    if ("  ".length() > 0) continue;
                    return;
                }
                ++n;
            }
            ++n3;
            if (" ".length() == " ".length()) continue;
            return;
        }
        if ((n2 > 0)) {
            TienIchGame.cfr_renamed_0("Có", "Có lỗi xảy ra! Chưa bơm thuốc bổ xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[59], null));
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã bơm thuốc bổ xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Tất cả đều khỏe không cần thuốc bổ!");
    }

    protected static void cfr_renamed_2() {
        ew_0 ew_02;
        int n;
        if (AutoFarm.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
            var_java_util_Vector_do.removeAllElements();
        }
        if (AutoFarm.boolean_do(var_java_util_Vector_if.isEmpty() ? 1 : 0)) {
            n = var_int_arr_for[0];
            while ((n < var_java_util_Vector_if.size())) {
                ew_02 = (ew_0)var_java_util_Vector_if.elementAt(n);
                var_java_util_Vector_do.addElement(ew_02);
                ++n;
                if (((96 + 46 - 26 + 20 ^ 47 + 40 - -24 + 49) & (79 + 102 - 149 + 105 ^ 124 + 82 - 47 + 2 ^ -" ".length())) <= "   ".length()) continue;
                return;
            }
        }
        if ((var_java_util_Vector_do.isEmpty())) {
            eq.eq_do().cfr_renamed_4(var_int_new);
            if ((gf_0.boolean_do())) {
                var_java_util_Vector_if.removeAllElements();
                n = var_int_arr_for[0];
                while ((n < var_java_util_Vector_do.size())) {
                    ew_02 = (ew_0)var_java_util_Vector_do.elementAt(n);
                    var_java_util_Vector_if.addElement(ew_02);
                    ++n;
                    if (-" ".length() < 0) continue;
                    return;
                }
            }
        }
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    protected static int (Vector object, int n == null) {
        if (AutoFarm.cfr_renamed_1(object = gd.cfr_renamed_0((Vector)object, n))) {
            return ((gd)object).soLuong;
        }
        return var_int_arr_for[0];
    }

    public final void void_if() {
        super.void_if();
        this.var_int_int = var_int_arr_for[1];
        this.var_int_case = var_int_arr_for[1];
        this.var_boolean_char = var_int_arr_for[0];
    }

    protected static void cfr_renamed_15() {
        if ((bF.var_short_do > 0)) {
            bF.bF_do().void_if();
            if (AutoFarm.cfr_renamed_2(TienIchGame.cfr_renamed_0(em_0.em_0_do()) ? 1 : 0)) {
                TienIchGame.hienThongBao(1500L);
            }
            if (AutoFarm.boolean_do(bF.var_int_char)) {
                short s2 = bF.var_short_do;
                bF.bF_do().void_if(var_int_arr_for[6]);
                if ((TienIchGame.boolean_if(15000L))) {
                    AutoFarm.void_do(s2);
                    if (-" ".length() >= 0) {
                        return;
                    }
                } else {
                    TienIchGame.hienThongBao("Lỗi hoàn thành món ăn!");
                }
            }
            em_0.em_0_do().cfr_renamed_2();
            return;
        }
        if (AutoFarm.boolean_do(chuoiGiaTri.equals("") ? 1 : 0)) {
            bF.bF_do().void_if();
            if (AutoFarm.cfr_renamed_2(TienIchGame.cfr_renamed_0(em_0.em_0_do()) ? 1 : 0)) {
                TienIchGame.hienThongBao(1500L);
            }
            AutoFarm.void_do(var_int_arr_for[1]);
            em_0.em_0_do().cfr_renamed_2();
        }
    }

    protected static void cfr_renamed_8() {
        if ((dn_0.dangChayAuto)) {
            long l = AutoFarm.long_do();
            if (AutoFarm.cfr_renamed_3((l != 0L)) && AutoFarm.cfr_renamed_5((l != dn_0.dn_0_do().soXu))) {
                dn_0.dn_0_do().var_long_if = System.currentTimeMillis() + l + 60000L;
                return;
            }
            dn_0.dn_0_do().var_long_if = System.currentTimeMillis() + dn_0.dn_0_do().soXu;
            return;
        }
        dn_0.dn_0_do().var_long_if = System.currentTimeMillis() + dn_0.dn_0_do().soXu;
    }

        protected static void cfr_renamed_12() {
        if ((AngelChip.duLieuNguoiChoi.var_short_char != bF.soLuong)) {
            return;
        }
        if ((var_int_byte <= 0)) {
            return;
        }
        if ((var_short_arr_do != null) && (var_short_arr_do.length > 0)) {
            int n = var_int_arr_for[0];
            while ((n < var_short_arr_do.length)) {
                block20: {
                    gd gd2;
                    short s2 = var_short_arr_do[n];
                    int n2 = var_int_arr_for[0];
                    while ((n2 < bF.var_java_util_Vector_for.size())) {
                        gd2 = (gd)bF.var_java_util_Vector_for.elementAt(n2);
                        if ((gd2 != null) && (!(s2 != var_int_arr_for[1]) || (gd2.var_short_do == s2)) && (gd2.soLuong > 0) && (gd2.soLuong >= soLuongKhoa) && (!(gd2.var_short_do < var_int_arr_for[32]) || AutoFarm.cfr_renamed_1(ak_0.dY_do((int)gd2.var_short_do)))) {
                            dh_0.dh_0_do().cfr_renamed_3(gd2.var_short_do);
                            if ((TienIchGame.cfr_renamed_12(15000L))) {
                                int n3;
                                TienIchGame.hienThongBao(500L);
                                eq eq2 = eq.eq_do();
                                int n4 = var_int_arr_for[55];
                                byte by2 = var_int_arr_for[0];
                                if (AutoFarm.boolean_do(var_int_byte, gd2.soLuong)) {
                                    n3 = gd2.soLuong;
                                    if ((8 ^ 0x25 ^ (0x18 ^ 0x31)) <= ((6 + 164 - 80 + 82 ^ 124 + 23 - 20 + 5) & (82 + 129 - 159 + 84 ^ 137 + 104 - 172 + 91 ^ -" ".length()))) {
                                        return;
                                    }
                                } else {
                                    n3 = var_int_byte;
                                }
                                eq2.cfr_renamed_0(n4, by2, String.valueOf(n3));
                                if ((TienIchGame.boolean_if(5000L))) {
                                    TienIchGame.hienThongBao(500L);
                                }
                            }
                            if (!AutoFarm.cfr_renamed_2(i_0.i_0_do().boolean_do() ? 1 : 0)) break block20;
                        }
                        ++n2;
                        if (((0x6C ^ 0x3A ^ (0xE ^ 0x69)) & (0x66 ^ 0x22 ^ (0x5E ^ 0x2B) ^ -" ".length())) < (108 + 125 - 61 + 3 ^ 13 + 128 - -28 + 2)) continue;
                        return;
                    }
                    n2 = var_int_arr_for[0];
                    while ((n2 < bF.var_java_util_Vector_try.size())) {
                        gd2 = (gd)bF.var_java_util_Vector_try.elementAt(n2);
                        if ((gd2 != null) && (!(s2 != var_int_arr_for[1]) || (gd2.var_short_do == s2)) && (gd2.soLuong > 0) && (gd2.soLuong >= soLuongKhoa) && (bF.ff_do(gd2.var_short_do) != null)) {
                            dh_0.dh_0_do().cfr_renamed_3(gd2.var_short_do);
                            if ((TienIchGame.cfr_renamed_12(15000L))) {
                                int n5;
                                TienIchGame.hienThongBao(500L);
                                eq eq3 = eq.eq_do();
                                int n6 = var_int_arr_for[55];
                                byte by3 = var_int_arr_for[0];
                                if (AutoFarm.boolean_do(var_int_byte, gd2.soLuong)) {
                                    n5 = gd2.soLuong;
                                    if (" ".length() < " ".length()) {
                                        return;
                                    }
                                } else {
                                    n5 = var_int_byte;
                                }
                                eq3.cfr_renamed_0(n6, by3, String.valueOf(n5));
                                if ((TienIchGame.boolean_if(5000L))) {
                                    TienIchGame.hienThongBao(500L);
                                }
                            }
                            if (!AutoFarm.cfr_renamed_2(i_0.i_0_do().boolean_do() ? 1 : 0)) break;
                        }
                        ++n2;
                        return;
                    }
                }
                ++n;
                if ("   ".length() == "   ".length()) continue;
                return;
            }
        }
    }

    public AutoFarm(byte by2, Object object) {
        this.var_int_if = by2;
        this.var_java_lang_Object_do = object;
    }

    public void void_do(String string) {
        if ((string.startsWith("Nông trại bạn đã được chăm sóc"))) {
            this.var_boolean_char = var_int_arr_for[2];
            TienIchGame.void_for();
            TienIchGame.cfr_renamed_15();
            if (AutoFarm.boolean_do(this.var_int_if) && (this.mangSoNguyen != null)) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.void_if(16000L);
                return;
            }
            AutoController.tatAuto();
            TienIchGame.cfr_renamed_1("Bạn cài đặt chế độ Farm thường nhưng Lái buôn đang được kích hoạt cần phải đăng xuất để áp dụng!", new ei("Đăng xuất", var_int_arr_for[4], fe_0.fe_0_do()), GameCanvas.var_ei_do);
        }
    }

    protected static int[] int_arr_do() {
        int[] nArray = new int[var_int_arr_for[32]];
        int n = var_int_arr_for[0];
        while ((n < var_int_arr_for[32])) {
            Object object = ak_0.dY_do(n);
            if ((object != null) && AutoFarm.cfr_renamed_2(((dY)object).dangChayAuto ? 1 : 0)) {
                if ((bF.var_java_util_Vector_try != null)) {
                    object = bF.gd_do(((dY)object).cfr_renamed_3);
                    if ((object != null)) {
                        nArray[n] = ((gd)object).soLuong;
                    }
                    if (((72 + 179 - 164 + 115 ^ 59 + 81 - 79 + 79) & (26 + 87 - 106 + 222 ^ 78 + 140 - 61 + 6 ^ -" ".length())) > (8 + 129 - 63 + 83 ^ 78 + 24 - 4 + 55)) {
                        return null;
                    }
                }
            } else if ((bF.var_java_util_Vector_for != null) && (object = bF.gd_if(n) != null)) {
                nArray[n] = ((gd)object).soLuong;
            }
            ++n;
            if ("  ".length() == "  ".length()) continue;
            return null;
        }
        return nArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void void_do(short var0) {
        block34: {
            block35: {
                if (!AutoFarm.boolean_do((int)AutoFarm.chuoiGiaTri.equals(""))) break block34;
                if ((AutoFarm.var_short_arr_if != null) && !(AutoFarm.var_int_arr_if == null)) break block35;
                var1_5 = "";
                var2_7 /* !! */  = TienIchGame.java_lang_String_arr_do(AutoFarm.chuoiGiaTri, ",");
                AutoFarm.var_short_arr_if = new short[var2_7 /* !! */ .length];
                AutoFarm.var_int_arr_if = new int[var2_7 /* !! */ .length];
                var3_8 = AutoFarm.var_int_arr_for[0];
                while ((var3_8 < var2_7 /* !! */ .length)) {
                    block33: {
                        var4_9 = var2_7 /* !! */ [var3_8].trim();
                        try {
                            if ((var4_9.indexOf(AutoFarm.var_int_arr_for[39]) != AutoFarm.var_int_arr_for[1])) {
                                var5_12 = TienIchGame.java_lang_String_arr_do(var4_9, ":");
                                var4_10 = Short.parseShort(var5_12[AutoFarm.var_int_arr_for[0]].trim());
                                var5_11 = Integer.parseInt(var5_12[AutoFarm.var_int_arr_for[2]].trim());
                                if (-"   ".length() > 0) {
                                    return;
                                }
                            } else {
                                var4_10 = Short.parseShort(var4_9);
                                var5_11 = AutoFarm.var_int_arr_for[1];
                            }
                            AutoFarm.var_int_arr_if[var3_8] = var5_11;
                            if ((var4_10 != null) && (ak_0.dv_0_do(var4_10) != null)) {
                                AutoFarm.var_short_arr_if[var3_8] = var4_10;
                                v0 = new StringBuffer().append(var1_5);
                                if (AutoFarm.boolean_do((int)var1_5.equals(""))) {
                                    v1 = ",";
                                    if (((27 ^ 34) & ~(86 ^ 111)) == " ".length()) {
                                        return;
                                    }
                                } else {
                                    v1 = "";
                                }
                                v2 = v0.append(v1).append(AutoFarm.var_short_arr_if[var3_8]);
                                if ((AutoFarm.var_int_arr_if[var3_8] != null)) {
                                    v3 = ":" + AutoFarm.var_int_arr_if[var3_8];
                                    if (-" ".length() >= "  ".length()) {
                                        return;
                                    }
                                } else {
                                    v3 = "";
                                }
                                var1_5 = v2.append(v3).toString();
                                break block33;
                            }
                            AutoFarm.var_short_arr_if[var3_8] = AutoFarm.var_int_arr_for[1];
                        }
                        catch (NumberFormatException v4) {
                            AutoFarm.var_short_arr_if[var3_8] = AutoFarm.var_int_arr_for[1];
                            AutoFarm.var_int_arr_if[var3_8] = AutoFarm.var_int_arr_for[1];
                        }
                        }
                    ++var3_8;
                    if (-(121 + 105 - 109 + 37 ^ 6 + 32 - -25 + 95) < 0) continue;
                    return;
                }
                if (AutoFarm.boolean_do((int)AutoFarm.chuoiGiaTri.equals(var1_5))) {
                    AutoFarm.chuoiGiaTri = var1_5;
                    AutoFarm.cfr_renamed_11();
                }
            }
            if (!(AutoFarm.var_short_arr_if != null) || !(AutoFarm.var_short_arr_if.length > 0)) break block34;
            var1_6 = AutoFarm.var_int_arr_for[0];
            while ((var1_6 < AutoFarm.var_short_arr_if.length)) {
                block36: {
                    block37: {
                        block43: {
                            block38: {
                                block44: {
                                    block45: {
                                        block39: {
                                            block41: {
                                                block40: {
                                                    block42: {
                                                        if (!(AutoFarm.var_short_arr_if[var1_6] != null) || !AutoFarm.cfr_renamed_2((int)AutoFarm.boolean_do(AutoFarm.var_short_arr_if[var1_6]))) break block36;
                                                        if (!(AutoFarm.var_int_arr_if[var1_6] != null)) break block37;
                                                        var0_1 = ak_0.dv_0_do(AutoFarm.var_short_arr_if[var1_6]);
                                                        if (!(var0_1 != null)) break block38;
                                                        var0_2 = var0_1.var_short_do;
                                                        if (!(var0_2 < AutoFarm.var_int_arr_for[32])) break block39;
                                                        var2_7 /* !! */  = ak_0.dY_do((int)var0_2);
                                                        if (!(var2_7 /* !! */ != null) || !AutoFarm.cfr_renamed_2((int)var2_7 /* !! */ .dangChayAuto)) break block40;
                                                        if (!(bF.var_java_util_Vector_try != null)) break block41;
                                                        var0_3 = bF.gd_do(var2_7 /* !! */ .cfr_renamed_3);
                                                        if (!(var0_3 != null)) break block42;
                                                        v5 = var0_3.soLuong;
                                                        if ("   ".length() <= " ".length()) {
                                                            return;
                                                        }
                                                        break block43;
                                                    }
                                                    if (((117 + 29 - 24 + 115 ^ 19 + 95 - 80 + 146) & (34 + 33 - -92 + 39 ^ 47 + 76 - 56 + 92 ^ -" ".length())) != 0) {
                                                        return;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                if (!(bF.var_java_util_Vector_for != null) || !(var0_4 = bF.gd_if(var0_2) != null)) break block41;
                                                v5 = var0_4.soLuong;
                                                if (" ".length() < ((169 ^ 154) & ~(27 ^ 40))) {
                                                    return;
                                                }
                                                break block43;
                                            }
                                            if ((20 ^ 19 ^ "   ".length()) <= -" ".length()) {
                                                return;
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        if (!(var0_2 < AutoFarm.var_int_arr_for[22])) break block44;
                                        if (!(bF.var_java_util_Vector_for != null)) ** GOTO lbl-1000
                                        var2_7 /* !! */  = bF.gd_if(var0_2);
                                        if (!(var2_7 /* !! */ != null)) break block45;
                                        v5 = var2_7 /* !! */ .soLuong;
                                        break block43;
                                    }
                                    if (-"   ".length() > 0) {
                                        return;
                                    }
                                    ** GOTO lbl-1000
                                }
                                if ((bF.var_java_util_Vector_try != null) && (var2_7 /* !! */  = bF.gd_do(var0_2) != null)) {
                                    v5 = var2_7 /* !! */ .soLuong;
                                    if (" ".length() < -" ".length()) {
                                        return;
                                    }
                                } else lbl-1000:
                                // 5 sources

                                {
                                    v5 = AutoFarm.var_int_arr_for[0];
                                    if (("  ".length() & ~"  ".length()) != 0) {
                                        return;
                                    }
                                }
                                break block43;
                            }
                            v5 = AutoFarm.var_int_arr_for[0];
                        }
                        if (!(v5 < AutoFarm.var_int_arr_if[var1_6])) break block36;
                    }
                    dh_0.dh_0_do().cfr_renamed_4(AutoFarm.var_short_arr_if[var1_6]);
                    return;
                }
                ++var1_6;
                if (-"   ".length() <= 0) continue;
                return;
            }
            return;
        }
        if ((var0 != AutoFarm.var_int_arr_for[1]) && AutoFarm.cfr_renamed_2((int)AutoFarm.boolean_do(var0))) {
            dh_0.dh_0_do().cfr_renamed_4(var0);
            return;
        }
        TienIchGame.hienThongBao("Thiếu nguyên liệu nấu ăn!");
    }

    public AutoFarm() {
        this.cfr_renamed_16();
        this.var_int_if = var_int_arr_for[0];
        this.var_java_lang_Object_do = null;
    }

    public static void void_do(int n) {
        if (AutoFarm.boolean_do(i_0.i_0_do().boolean_do() ? 1 : 0)) {
            return;
        }
        fc_0 fc_02 = ak_0.fc_0_do(n);
        if ((fc_02 != null)) {
            if ((fc_02.mangSoNguyen[var_int_arr_for[0]] > 0)) {
                if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[0]] >= fc_02.mangSoNguyen[var_int_arr_for[0]])) {
                    dh_0.dh_0_do().cfr_renamed_0(fc_02, var_int_arr_for[2]);
                    if ((TienIchGame.boolean_do(5000L))) {
                        TienIchGame.hienThongBao(500L);
                        return;
                    }
                }
            } else if ((fc_02.mangSoNguyen[var_int_arr_for[2]] > 0) && AutoFarm.boolean_do(var_boolean_int ? 1 : 0) && (!(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[6]] < fc_02.mangSoNguyen[var_int_arr_for[2]]) || (AngelChip.duLieuNguoiChoi.soLuong >= fc_02.mangSoNguyen[var_int_arr_for[2]]))) {
                dh_0.dh_0_do().cfr_renamed_0(fc_02, var_int_arr_for[6]);
                if ((TienIchGame.boolean_do(5000L))) {
                    TienIchGame.hienThongBao(500L);
                }
            }
        }
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static long long_do() {
        long l = -1L;
        int n = var_int_arr_for[0];
        while ((n < bF.var_java_util_Vector_int.size())) {
            dq_0 dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n);
            if ((dq_02 != null) && (dq_02.cfr_renamed_8 != var_int_arr_for[1]) && (dq_02.soLuong < var_int_arr_for[25])) {
                long l2 = (long)(ak_0.dY_do((int)dq_02.cfr_renamed_8).var_short_do * var_int_arr_for[14] * var_int_arr_for[14] * var_int_arr_for[60]) - dq_02.soXu * 1000L;
                if (!AutoFarm.cfr_renamed_2((l, -1L == null)) || ((l2, l == null) < 0)) {
                    l = l2;
                }
            }
            ++n;
            return 0L;
        }
        return l;
    }

    public static void void_do(int n, int n2) {
        switch (n2) {
            case 1: {
                ff ff2;
                n2 = (bF.var_java_util_Vector_do, n == null);
                if (!(n2 < var_int_arr_for[62]) || !(ff2 = bF.ff_do(n) != null)) break;
                n2 = var_int_arr_for[62] - n2;
                if ((ff2.var_int_if > 0)) {
                    if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[0]] >= ff2.var_int_if * n2)) {
                        dh_0.dh_0_do().cfr_renamed_0((short)n, (byte)n2, var_int_arr_for[2]);
                        if ((TienIchGame.cfr_renamed_8(5000L))) {
                            TienIchGame.hienThongBao(500L);
                            return;
                        }
                    }
                } else if ((ff2.soLuong > 0) && (!(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[6]] < ff2.soLuong * n2) || (AngelChip.duLieuNguoiChoi.soLuong >= ff2.soLuong * n2))) {
                    dh_0.dh_0_do().cfr_renamed_0((short)n, (byte)n2, var_int_arr_for[6]);
                    if ((TienIchGame.cfr_renamed_8(5000L))) {
                        TienIchGame.hienThongBao(500L);
                    }
                }
                return;
            }
            case 2: {
                dY dY2;
                n2 = (bF.java_util_Vector_do(), n == null);
                if (!(n2 < var_int_arr_for[62]) || !(dY2 = ak_0.dY_if(n) != null)) break;
                n2 = var_int_arr_for[62] - n2;
                if ((dY2.var_short_arr_if[var_int_arr_for[0]] > 0)) {
                    if (!(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[0]] >= dY2.var_short_arr_if[var_int_arr_for[0]] * n2)) break;
                    dh_0.dh_0_do().cfr_renamed_0((short)n, (byte)n2, var_int_arr_for[2]);
                    if (!(TienIchGame.cfr_renamed_8(5000L))) break;
                    TienIchGame.hienThongBao(500L);
                    return;
                }
                if (!(dY2.var_short_arr_if[var_int_arr_for[2]] > 0) || !AutoFarm.boolean_do(var_boolean_int ? 1 : 0) || (AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[6]] < dY2.var_short_arr_if[var_int_arr_for[2]] * n2) && !(AngelChip.duLieuNguoiChoi.soLuong >= dY2.var_short_arr_if[var_int_arr_for[2]] * n2)) break;
                dh_0.dh_0_do().cfr_renamed_0((short)n, (byte)n2, var_int_arr_for[6]);
                if (!(TienIchGame.cfr_renamed_8(5000L))) break;
                TienIchGame.hienThongBao(500L);
            }
        }
    }

    private static void cfr_renamed_20() {
        block5: {
            if (!AutoFarm.boolean_do(tenNhanVat.equals("") ? 1 : 0)) break block5;
            if ((tenNhanVat.equals("-1"))) {
                short[] sArray = new short[var_int_arr_for[2]];
                sArray[AutoFarm.var_int_arr_for[0]] = var_int_arr_for[1];
                var_short_arr_do = sArray;
                return;
            }
            String[] stringArray = TienIchGame.java_lang_String_arr_do(tenNhanVat, ",");
            var_short_arr_do = new short[stringArray.length];
            int n = var_int_arr_for[0];
            while ((n < stringArray.length)) {
                try {
                    AutoFarm.var_short_arr_do[n] = Short.parseShort(stringArray[n].trim());
                }
                catch (NumberFormatException numberFormatException) {
                    AutoFarm.var_short_arr_do[n] = var_int_arr_for[5];
                }
                if ((0x4A ^ 0x41 ^ (0x6D ^ 0x62)) != (0x6F ^ 0x5A ^ (0x39 ^ 8))) {
                    return;
                }
                ++n;
                return;
            }
            return;
        }
        var_short_arr_do = null;
    }

    public boolean boolean_do(String string) {
        block28: {
            block26: {
                block25: {
                    String[] stringArray;
                    block27: {
                        if (!(string.startsWith("Nông trại của bạn hiện tại đang có "))) break block26;
                        stringArray = TienIchGame.java_lang_String_arr_do(string, "Nông trại của bạn hiện tại đang có ");
                        if (!(string.indexOf(" đơn vị cá") != var_int_arr_for[1])) break block27;
                        String[] stringArray2 = TienIchGame.java_lang_String_arr_do(stringArray[var_int_arr_for[2]], " đơn vị cá");
                        try {
                            this.var_int_int = Integer.parseInt(stringArray2[var_int_arr_for[0]]);
                        }
                        catch (NumberFormatException numberFormatException) {
                            this.var_int_int = var_int_arr_for[1];
                            if ("   ".length() < " ".length()) {
                                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                            }
                            break block25;
                        }
                        if (-" ".length() < -" ".length()) {
                            return ((0x96 ^ 0xC1 ^ (0x4A ^ 0xA)) & (33 + 18 - 29 + 113 ^ 46 + 36 - 21 + 83 ^ -" ".length())) != 0;
                        }
                        break block25;
                    }
                    if ((string.indexOf(" đơn vị vật nuôi") != var_int_arr_for[1])) {
                        String[] stringArray3 = TienIchGame.java_lang_String_arr_do(stringArray[var_int_arr_for[2]], " đơn vị vật nuôi");
                        try {
                            this.var_int_case = Integer.parseInt(stringArray3[var_int_arr_for[0]]);
                        }
                        catch (NumberFormatException numberFormatException) {
                            this.var_int_case = var_int_arr_for[1];
                        }
                        if (-(0x24 ^ 0x5E ^ (0x66 ^ 0x18)) >= 0) {
                            return ((0xCD ^ 0x88 ^ (0x43 ^ 0x50)) & (79 + 49 - 81 + 80 ^ (0xEB ^ 0xC2) ^ -" ".length())) != 0;
                        }
                    }
                }
                TienIchGame.cfr_renamed_11();
                return var_int_arr_for[2];
            }
            if (!(string.startsWith("Bạn có muốn nâng cấp cây khế"))) break block28;
            int n = string.indexOf(" với ");
            int n2 = string.indexOf(" xu");
            string = string.substring(n + " với ".length(), n2);
            try {
                this.soLuong = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                this.soLuong = var_int_arr_for[0];
            }
            if ((13 + 169 - 98 + 112 ^ 110 + 132 - 52 + 2) <= " ".length()) {
                return ((0x63 ^ 0x28 ^ (0x54 ^ 0x5B)) & (0x18 ^ 0x28 ^ (0x17 ^ 0x63) ^ -" ".length())) != 0;
            }
            TienIchGame.dangXuatTaiKhoan();
            return var_int_arr_for[2];
        }
        if (!AutoFarm.boolean_do(string.startsWith("Bạn chỉ có thể mua tối đa") ? 1 : 0) || (string.startsWith("Bạn đã mua vật phẩm thành công"))) {
            TienIchGame.void_for();
            return var_int_arr_for[2];
        }
        if (!AutoFarm.boolean_do(string.startsWith("Bạn không thể mua thêm") ? 1 : 0) || (string.equals("Hồ cá đã đầy"))) {
            TienIchGame.cfr_renamed_15();
            return var_int_arr_for[2];
        }
        if ((string.startsWith("Chúc mừng bạn đã bán")) && (string.indexOf("Bạn còn lại") != var_int_arr_for[1])) {
            TienIchGame.void_int();
            return var_int_arr_for[2];
        }
        if ((dangChayAuto) && (ef_0.soLuong == var_int_arr_for[3])) {
            if ((gf_0.dangChayAuto) && (string.startsWith("Bạn cần có điểm luyện rồng để luyện rồng"))) {
                gf_0.void_do();
                return var_int_arr_for[2];
            }
            if ((string.equals("Chúc mừng bạn đã hoàn thành nhiệm vụ này"))) {
                this.var_boolean_else = var_int_arr_for[2];
                TienIchGame.cfr_renamed_11();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("Luyện rồng thành công"))) {
                this.var_boolean_case = var_int_arr_for[2];
                TienIchGame.cfr_renamed_11();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("Luyện rồng thất bại"))) {
                this.var_boolean_case = var_int_arr_for[0];
                TienIchGame.cfr_renamed_11();
                return var_int_arr_for[2];
            }
        }
        if ((var_boolean_try) && (ef_0.soLuong == var_int_arr_for[3])) {
            if ((gf_0.dangChayAuto) && (string.startsWith("Chức năng chỉ dành cho nông trại đã đủ"))) {
                gf_0.void_do();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("Chúc mừng bạn đã giao thành công đơn hàng"))) {
                TienIchGame.cfr_renamed_11();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("đơn hàng này đã giao xong"))) {
                TienIchGame.cfr_renamed_11();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("Bạn không đủ nguyên liệu"))) {
                this.var_boolean_byte = var_int_arr_for[2];
                TienIchGame.cfr_renamed_11();
                return var_int_arr_for[2];
            }
        }
        if (!(string.indexOf("điểm chuyên cần") == var_int_arr_for[1]) || !AutoFarm.boolean_do(string.startsWith("Bạn đã nhận quà báo danh") ? 1 : 0) || (string.indexOf("hoàn thành") != var_int_arr_for[1])) {
            TienIchGame.cfr_renamed_11();
            return var_int_arr_for[2];
        }
        return super.boolean_do(string);
    }

        private static void cfr_renamed_14() {
        int n = var_int_arr_for[0];
        int n2 = var_int_arr_for[0];
        AutoFarm.void_do(var_int_arr_for[45], var_int_arr_for[2]);
        AutoFarm.void_do(var_int_arr_for[23], var_int_arr_for[2]);
        int n3 = var_int_arr_for[0];
        while ((n3 < bF.var_java_util_Vector_if.size())) {
            ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n3);
            String string = "";
            if ((ha2.var_boolean_arr_do[var_int_arr_for[0]] != 0)) {
                dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, var_int_arr_for[45]);
                if ((TienIchGame.boolean_do(5000L))) {
                    ++n;
                    string = "Khỏi tiêu chảy";
                    TienIchGame.hienThongBao(500L);
                    if (((0xB9 ^ 0x97) & ~(0xB5 ^ 0x9B)) >= "   ".length()) {
                        return;
                    }
                } else {
                    ++n2;
                }
            }
            if ((ha2.var_boolean_arr_do[var_int_arr_for[2]] != 0)) {
                dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, var_int_arr_for[23]);
                if ((TienIchGame.boolean_do(5000L))) {
                    ++n;
                    if (AutoFarm.boolean_do(string.equals("") ? 1 : 0)) {
                        string = string + ", ";
                    }
                    string = string + "Khỏi cúm";
                    TienIchGame.hienThongBao(500L);
                    if (" ".length() < 0) {
                        return;
                    }
                } else {
                    ++n2;
                }
            }
            if (AutoFarm.boolean_do(string.equals("") ? 1 : 0)) {
                (ha2, string == null);
            }
            ++n3;
            if (-"  ".length() < 0) continue;
            return;
        }
        if ((n2 > 0)) {
            TienIchGame.cfr_renamed_0("Có", "Có lỗi xảy ra! Chưa chữa bênh xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[58], null));
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã chữa bênh xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Tất cả đều khỏe!");
    }

    public String toString() {
        String string = "";
        switch (this.var_int_if) {
            case 0: {
                string = "Auto farm";
                if ("  ".length() >= 0) break;
                return null;
            }
            case 4: {
                string = "Bón phân";
                if (-"   ".length() < 0) break;
                return null;
            }
            case 5: {
                string = "Diệt sâu cỏ";
                if (-" ".length() < (0x1F ^ 0x1B)) break;
                return null;
            }
            case 7: {
                string = "Cho vật nuôi ăn";
                if (-"   ".length() <= 0) break;
                return null;
            }
            case 9: {
                string = "Bơm thuốc bổ";
                if (("   ".length() & ~"   ".length()) == ((0x3D ^ 0xF) & ~(0x2F ^ 0x1D))) break;
                return null;
            }
            case 8: {
                string = "Chữa bệnh";
                if (" ".length() != ((0x6C ^ 0x7C) & ~(0x81 ^ 0x91))) break;
                return null;
            }
            case 11: {
                string = "Bán vật nuôi";
                if ((0x8A ^ 0x8E) > "  ".length()) break;
                return null;
            }
            case 1: {
                string = "Đang tưới nước";
            }
        }
        return string;
    }

    private static void cfr_renamed_23() {
        GameCanvas.var_boolean_byte = var_int_arr_for[0];
        GameCanvas.var_et_0_do = null;
        GameCanvas.cfr_renamed_8();
        gx[] gxArray = new gx[var_int_arr_for[6]];
        int n = var_int_arr_for[0];
        while ((n < var_int_arr_for[6])) {
            gxArray[n] = new gx();
            gxArray[n].void_do(var_int_arr_for[2]);
            ++n;
            if (-(0x97 ^ 0x92) < 0) continue;
            return;
        }
        gxArray[var_int_arr_for[0]].cfr_renamed_0(var_int_arr_for[2]);
        ei ei2 = new ei(MenuChinhAvatar.ck, new dw_0(gxArray));
        dj_0.cfr_renamed_0().cfr_renamed_0(gxArray, MenuChinhAvatar.var_java_lang_String_const, var_java_lang_String_arr_arr_do, ei2);
        GameCanvas.var_dX_do = dj_0.cfr_renamed_0();
    }

    /*
     * WARNING - void declaration
     */
    protected static void (boolean bl == null) {
        while ((var_boolean_new)) {
            void ew_02;
            int n;
            int n2;
            Object object;
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
            int n3 = calendar.get(var_int_arr_for[15]);
            int n4 = calendar.get(var_int_arr_for[7]);
            if (AutoFarm.boolean_do(var_java_util_Hashtable_do.isEmpty() ? 1 : 0) && AutoFarm.cfr_renamed_2(var_java_util_Hashtable_do.containsKey(object = new Integer(AngelChip.duLieuNguoiChoi.var_short_char)) ? 1 : 0)) {
                n2 = (Integer)var_java_util_Hashtable_do.get(object);
                if (((0x98 ^ 0xB0) & ~(0xBD ^ 0x95)) < 0) {
                    return;
                }
            } else {
                n2 = n = var_int_arr_for[1];
            }
            if (!(var_int_new != var_int_arr_for[1]) || (n != var_int_arr_for[1]) && (!(n != n3) || !AutoFarm.boolean_do(n4, var_int_arr_for[15]))) break;
            if (AutoFarm.cfr_renamed_2((int)ew_02)) {
                TienIchGame.hienThongBao("Nhiệm vụ ấp trứng rồng");
            }
            AutoFarm.cfr_renamed_2();
            if (!AutoFarm.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) break;
            object = AutoFarm.ew_0_do("Rồng Ngũ Hành");
            var_java_util_Vector_do.removeAllElements();
            if (!(object != null)) break;
            TienIchGame.hienThongBao(100L);
            ((ew_0)object).cfr_renamed_0();
            if (!(gf_0.boolean_do())) break;
            object = AutoFarm.ew_0_do("Chức năng ấp rồng");
            var_java_util_Vector_do.removeAllElements();
            if (!(object != null)) break;
            TienIchGame.hienThongBao(100L);
            ((ew_0)object).cfr_renamed_0();
            if (!(gf_0.boolean_do())) break;
            object = AutoFarm.ew_0_do("Nhận điểm ấp trứng");
            if ((object != null)) {
                var_java_util_Vector_do.removeAllElements();
                ((ew_0)object).cfr_renamed_0();
                if ((TienIchGame.cfr_renamed_4(10000L))) {
                    var_java_util_Hashtable_do.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n3));
                    }
                return;
            }
            if (AutoFarm.boolean_do((int)ew_02)) {
                var_java_util_Vector_do.removeAllElements();
                return;
            }
            ew_0 ew_03 = AutoFarm.ew_0_do("Làm nhiệm vụ ấp trứng");
            var_java_util_Vector_do.removeAllElements();
            if ((ew_03 != null)) {
                void var0_4;
                TienIchGame.hienThongBao(100L);
                ew_03.cfr_renamed_0();
                if (!(gf_0.boolean_do())) break;
                int n5 = var_int_arr_for[0];
                n4 = var_int_arr_for[0];
                while ((n4 < var_java_util_Vector_do.size())) {
                    ew_0 ew_04 = (ew_0)var_java_util_Vector_do.elementAt(n4);
                    if ((ew_04 != null) && AutoFarm.boolean_do(ew_04.chuoiGiaTri.toLowerCase().trim().endsWith("xong") ? 1 : 0)) {
                        ew_04.cfr_renamed_0();
                        if (AutoFarm.boolean_do(TienIchGame.cfr_renamed_4(7000L) ? 1 : 0)) {
                            ++var0_4;
                        }
                    }
                    ++n4;
                    if (((0x92 ^ 0x80 ^ (0x76 ^ 0x53)) & (0xEC ^ 0xA9 ^ (0xE5 ^ 0x97) ^ -" ".length())) >= -" ".length()) continue;
                    return;
                }
                if (AutoFarm.boolean_do((int)var0_4)) {
                    int n6 = var_int_arr_for[0];
                    return;
                }
                return;
            }
            if (AutoFarm.boolean_do(n4, var_int_arr_for[15])) {
                var_java_util_Hashtable_do.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n3));
                return;
            }
            var_java_util_Hashtable_do.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n3 - var_int_arr_for[2]));
            break;
        }
    }

    private static void cfr_renamed_24() {
        int n = bF.soLuong;
        int n2 = var_int_arr_for[0];
        mangSoNguyen = new int[bF.var_java_util_Vector_int.size()];
        int n3 = var_int_arr_for[0];
        while ((n3 < bF.var_java_util_Vector_int.size())) {
            dq_0 dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n3);
            AutoFarm.mangSoNguyen[n3] = dq_02.cfr_renamed_8;
            if ((dq_02.soLuong == var_int_arr_for[15])) {
                dh_0.dh_0_do().cfr_renamed_3(n, n3);
                ++n2;
            }
            ++n3;
            if (((0xB6 ^ 0x94) & ~(0xA0 ^ 0x82)) == 0) continue;
            return;
        }
        if ((n2 > 0)) {
            if (AutoFarm.boolean_do(TienIchGame.cfr_renamed_8(5000L) ? 1 : 0)) {
                TienIchGame.cfr_renamed_0("Có", "Có lỗi xảy ra! Chưa thu hoạch xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[25], null));
                if (((0x5F ^ 0x77) & ~(0x14 ^ 0x3C)) == "  ".length()) {
                    return;
                }
            } else {
                TienIchGame.cfr_renamed_1("Đã thu hoạch xong!\nGieo hạt luôn không?", new ei("Gieo lại", new AutoFarm(var_int_arr_for[16], null)), new ei("Gieo mới", new dx_0()));
                }
        } else {
            GameCanvas.hienThongBaoPopup("Không có trồng nào được thu hoạch!");
        }
        if ((AngelChip.duLieuNguoiChoi.var_short_char == bF.soLuong) && (bF.var_by_do.var_short_new > 0)) {
            el_0.el_0_do().void_do();
            TienIchGame.boolean_if(5000L);
            }
    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_11() {
        block11: {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeByte(var_byte_if);
                dataOutputStream.writeUTF(chuoiGiaTri);
                dataOutputStream.writeUTF(chuoiPhu);
                dataOutputStream.writeInt(var_int_char);
                dataOutputStream.writeByte(var_byte_for);
                dataOutputStream.writeByte(var_byte_do);
                dataOutputStream.writeBoolean(coKichHoat);
                dataOutputStream.writeBoolean(AutoChamEmBe.var_boolean_new);
                dataOutputStream.writeUTF(tenNhanVat);
                dataOutputStream.writeInt(soLuongKhoa);
                dataOutputStream.writeBoolean(coTrangThai);
                dataOutputStream.writeInt(var_int_try);
                dataOutputStream.writeInt(var_int_byte);
                dataOutputStream.writeBoolean(AutoChamEmBe.coKichHoat);
                dataOutputStream.writeBoolean(AutoChamEmBe.dangChayAuto);
                dataOutputStream.writeBoolean(AutoChamEmBe.coTrangThai);
                dataOutputStream.writeBoolean(var_boolean_new);
                dataOutputStream.writeBoolean(dangChayAuto);
                dataOutputStream.writeBoolean(var_boolean_try);
                dataOutputStream.writeBoolean(var_boolean_int);
                dataOutputStream.flush();
                byteArrayOutputStream.flush();
                QuanLyRMS.luuDuLieu("FarmSettings", byteArrayOutputStream.toByteArray());
            }
            catch (IOException iOException) {
                try {
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                    break block11;
                }
                catch (IOException iOException2) {
                    if (" ".length() <= ((0xA0 ^ 0xB3 ^ (0x55 ^ 0x1E)) & (0x2B ^ 0x24 ^ (0x3E ^ 0x69) ^ -" ".length()))) {
                        return;
                    }
                    break block11;
                }
            }
            catch (Throwable throwable) {
                try {
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                    }
                catch (IOException iOException) {
                    throw throwable;
                }
                if (((116 + 15 - 124 + 167 ^ 106 + 66 - 116 + 79) & (73 + 120 - 77 + 11 ^ (0x54 ^ 2) ^ -" ".length())) <= ((64 + 42 - 0 + 21 ^ (0x86 ^ 0xB6)) & (7 + 149 - -67 + 27 ^ 6 + 157 - 123 + 141 ^ -" ".length()))) throw throwable;
                return;
            }
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                }
            catch (IOException iOException) {
                }
        }
        var_short_arr_if = null;
        var_int_arr_if = null;
        var_int_arr_int = null;
        AutoFarm.cfr_renamed_20();
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    protected static void cfr_renamed_18() {
        if ((AutoKimCuong.cfr_renamed_2)) {
            long l = AutoFarm.long_do();
            if (AutoFarm.cfr_renamed_3((l == 0L)) && AutoFarm.cfr_renamed_5((l == AutoKimCuong.X_do().var_long_if))) {
                AutoKimCuong.X_do().soXu = System.currentTimeMillis() + l + 60000L;
                return;
            }
            AutoKimCuong.X_do().soXu = System.currentTimeMillis() + AutoKimCuong.X_do().var_long_if;
            return;
        }
        AutoKimCuong.X_do().soXu = System.currentTimeMillis() + AutoKimCuong.X_do().var_long_if;
    }

    private void cfr_renamed_25() {
        ha ha2;
        byte by2 = (Byte)this.var_java_lang_Object_do;
        Vector<ha> vector = new Vector<ha>();
        int n = var_int_arr_for[0];
        while ((n < bF.var_java_util_Vector_if.size())) {
            ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n);
            if (!((ha2.cfr_renamed_18 != by2) && ((ha2.cfr_renamed_18 != var_int_arr_for[32]) && (ha2.cfr_renamed_18 != var_int_arr_for[37]) && (ha2.cfr_renamed_18 != var_int_arr_for[38]) && (ha2.cfr_renamed_18 != var_int_arr_for[47]) && (ha2.cfr_renamed_18 != var_int_arr_for[39]) && (ha2.cfr_renamed_18 != var_int_arr_for[40]) && !(ha2.cfr_renamed_18 == var_int_arr_for[41]) || (by2 != var_int_arr_for[1])) && ((ha2.cfr_renamed_18 != var_int_arr_for[10]) && (ha2.cfr_renamed_18 != var_int_arr_for[12]) && !(ha2.cfr_renamed_18 == var_int_arr_for[14]) || !(by2 == var_int_arr_for[5])))) {
                if (AutoFarm.cfr_renamed_3(ha2.this, ak_0.fc_0_do((int)ha2.cfr_renamed_18).soLuong * var_int_arr_for[14])) {
                    (ha2, "Em còn nhỏ" == null);
                    if (-"  ".length() >= 0) {
                        return;
                    }
                } else if ((ha2.cfr_renamed_6 < var_int_arr_for[34])) {
                    (ha2, "Bơm thuốc bổ đã" == null);
                    if (-(0x67 ^ 0xF ^ (0xFD ^ 0x90)) >= 0) {
                        return;
                    }
                } else {
                    vector.addElement(ha2);
                }
            }
            ++n;
            if ((0x36 ^ 0x32) > " ".length()) continue;
            return;
        }
        if (AutoFarm.boolean_do(vector.isEmpty() ? 1 : 0)) {
            n = var_int_arr_for[0];
            while ((n < vector.size())) {
                ha2 = (ha)vector.elementAt(n);
                dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, (byte)ha2.cfr_renamed_12);
                if ((TienIchGame.boolean_do(5000L))) {
                    (ha2, "Bye bye T.T" == null);
                    TienIchGame.hienThongBao(500L);
                }
                ++n;
                if ((107 + 57 - 85 + 75 ^ 147 + 45 - 128 + 95) != 0) continue;
                return;
            }
            return;
        }
        GameCanvas.hienThongBaoPopup("Không có gì để bán!");
    }

        protected final void cfr_renamed_10() {
        if (AutoFarm.boolean_do(i_0.i_0_do().boolean_do() ? 1 : 0)) {
            return;
        }
        if ((coTrangThai) && (bF.var_by_do.var_short_if < var_int_try) && (bF.var_by_do.var_short_if < var_int_arr_for[32]) && (bF.var_by_do.soLuong <= 0)) {
            this.soLuong = var_int_arr_for[0];
            dh_0.dh_0_do().cfr_renamed_5(var_int_arr_for[0]);
            if ((TienIchGame.boolean_if()) && (this.soLuong > 0) && AutoFarm.boolean_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[0]], this.soLuong + var_int_arr_for[56])) {
                dh_0.dh_0_do().cfr_renamed_5(var_int_arr_for[2]);
                if ((TienIchGame.cfr_renamed_4(15000L))) {
                    TienIchGame.hienThongBao(1000L);
                }
            }
        }
    }

            public static void (int n, byte by2, String[] stringArray == null) {
        if (AutoFarm.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
            var_java_util_Vector_do.removeAllElements();
        }
        int n2 = var_int_arr_for[0];
        while ((n2 < stringArray.length)) {
            var_java_util_Vector_do.addElement(new ew_0(stringArray[n2], new dH(n2, n, by2)));
            ++n2;
            if (((74 + 189 - 196 + 142 ^ 78 + 117 - 175 + 119) & ("  ".length() ^ (0xE1 ^ 0xB9) ^ -" ".length())) >= -" ".length()) continue;
            return;
        }
    }

        private static boolean boolean_do(short s2) {
        dv_0 dv_02 = ak_0.dv_0_do(s2);
        if ((dv_02 != null)) {
            int n = var_int_arr_for[0];
            while ((n < dv_02.var_short_arr_do.length)) {
                gd gd2;
                if ((dv_02.var_short_arr_do[n] < var_int_arr_for[22])) {
                    gd2 = bF.gd_if(dv_02.var_short_arr_do[n]);
                    if (-"  ".length() > 0) {
                        return ((49 + 38 - 41 + 160 ^ 28 + 136 - 62 + 49) & (0x3C ^ 0x20 ^ (0xF3 ^ 0xB6) ^ -" ".length())) != 0;
                    }
                } else {
                    gd2 = bF.gd_do(dv_02.var_short_arr_do[n]);
                }
                if (!(gd2 != null) || (gd2.soLuong < dv_02.var_short_arr_if[n])) {
                    return var_int_arr_for[0];
                }
                ++n;
                if ("   ".length() <= "   ".length()) continue;
                return ((0x46 ^ 0x65) & ~(0x16 ^ 0x35)) != 0;
            }
            return var_int_arr_for[2];
        }
        return var_int_arr_for[0];
    }

        private static void cfr_renamed_27() {
        int n = var_int_arr_for[0];
        int n2 = var_int_arr_for[0];
        while ((n2 < bF.var_java_util_Vector_if.size())) {
            ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n2);
            if (!(!(ha2.cfr_renamed_19 > 0) || (ha2.cfr_renamed_18 != var_int_arr_for[32]) && (ha2.cfr_renamed_18 != var_int_arr_for[10]) && (ha2.cfr_renamed_18 != var_int_arr_for[12]) && (ha2.cfr_renamed_18 != var_int_arr_for[47]) && !(ha2.cfr_renamed_18 == var_int_arr_for[14]))) {
                ha2.cfr_renamed_19 = var_int_arr_for[0];
                if (!(ha2.cfr_renamed_18 != var_int_arr_for[10]) || !(ha2.cfr_renamed_18 != var_int_arr_for[12]) || (ha2.cfr_renamed_18 == var_int_arr_for[14])) {
                    dh_0.dh_0_do().cfr_renamed_8(bF.soLuong, ha2.cfr_renamed_12);
                    bF.void_int(var_int_arr_for[48]);
                    ++n;
                }
                if (!(ha2.cfr_renamed_18 != var_int_arr_for[32]) || (ha2.cfr_renamed_18 == var_int_arr_for[47])) {
                    dh_0.dh_0_do().cfr_renamed_8(bF.soLuong, ha2.cfr_renamed_12);
                    bF.void_int(var_int_arr_for[9]);
                    ++n;
                }
            }
            ++n2;
            return;
        }
        if (AutoFarm.boolean_do(n)) {
            GameCanvas.hienThongBaoPopup("Không có gì để thu hoạch!");
        }
    }

            protected static int (int n, int[] nArray == null) {
        if ((n >= var_int_arr_for[32])) {
            return n;
        }
        if ((n != null)) {
            if (!(var_int_arr_int != null) || (nArray[n] < var_int_char)) {
                return n;
            }
            if ((nArray[n] >= var_int_char) && (var_int_arr_int != null) && (var_int_arr_int.length > 0)) {
                int n2 = var_int_arr_for[0];
                while ((n2 < var_int_arr_int.length)) {
                    if ((var_int_arr_int[n2] != null) && (var_int_arr_int[n2] != n) && (nArray[var_int_arr_int[n2]] < var_int_char)) {
                        return var_int_arr_int[n2];
                    }
                    ++n2;
                    if (((0x2A ^ 0x78) & ~(0x7D ^ 0x2F)) == 0) continue;
                    return (0x6B ^ 0x3F) & ~(0x95 ^ 0xC1);
                }
                if ((0x1F ^ 0x56 ^ (0xC4 ^ 0x89)) <= "  ".length()) {
                    return (0xC ^ 0x69 ^ (0x74 ^ 0x73)) & (88 + 77 - 133 + 166 ^ 8 + 86 - -70 + 0 ^ -" ".length());
                }
            }
        } else if ((var_int_arr_int != null) && (var_int_arr_int.length > 0)) {
            int n3 = var_int_arr_for[1];
            n = var_int_arr_for[0];
            while ((n < var_int_arr_int.length)) {
                if ((var_int_arr_int[n] != null)) {
                    if ((n3 == var_int_arr_for[1])) {
                        n3 = var_int_arr_int[n];
                    }
                    if ((nArray[var_int_arr_int[n]] < var_int_char)) {
                        return var_int_arr_int[n];
                    }
                }
                ++n;
                if ("   ".length() > 0) continue;
                return " ".length() & ~" ".length();
            }
            return n3;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized void void_for() {
        try {
            if (AutoFarm.cfr_renamed_3((System.currentTimeMillis() - this.var_int_int < 320000L))) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.void_if(16000L);
                return;
            }
            if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
                return;
            }
            if ((ef_0.soLuong != var_int_arr_for[17])) {
                if ((ef_0.soLuong != var_int_arr_for[3])) {
                    long l;
                    if ((GameCanvas.var_dL_do instanceof fw != 0) && AutoFarm.cfr_renamed_5((l = System.currentTimeMillis() - this.var_int_try < 2000L))) {
                        TienIchGame.hienThongBao(2000L - l);
                    }
                    if ((TienIchGame.cfr_renamed_3(var_int_arr_for[3]))) {
                        TienIchGame.hienThongBao(3000L);
                    }
                    return;
                }
                if (AutoFarm.boolean_do(var_java_util_Vector_if.isEmpty() ? 1 : 0)) {
                    var_java_util_Vector_if.removeAllElements();
                }
                AutoFarm.cfr_renamed_5();
                (var_int_arr_for[2] == null);
                this.cfr_renamed_1(var_int_arr_for[2]);
                this.cfr_renamed_17();
                if (!(bF.var_java_util_Vector_int != null) || (bF.soLuong != AngelChip.duLieuNguoiChoi.var_short_char)) {
                    GameCanvas.cfr_renamed_5();
                    bF.bF_do().cfr_renamed_1((int)AngelChip.duLieuNguoiChoi.var_short_char, var_int_arr_for[2]);
                    if (" ".length() <= ((9 ^ 0x5A ^ (0x6D ^ 0x75)) & (0x2A ^ 0xE ^ (7 ^ 0x68) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    bF.bF_do().cfr_renamed_0(bF.soLuong, bF.var_java_util_Vector_int, bF.var_java_util_Vector_if, bF.var_byte_if, bF.var_byte_do, bF.var_short_do, bF.var_int_char);
                }
                if ((GameCanvas.var_bt_0_do == null)) {
                    GameCanvas.cfr_renamed_4(MenuChinhAvatar.n);
                }
                if ((TienIchGame.cfr_renamed_1(var_int_arr_for[17]))) {
                    TienIchGame.hienThongBao(1000L);
                }
                return;
            }
            GameCanvas.cfr_renamed_8();
            TienIchGame.hienThongBao("Hãy chờ đến khi farm xong");
            AutoFarm.cfr_renamed_6();
            switch (this.var_int_if) {
                case 0: {
                    this.cfr_renamed_26();
                    return;
                }
                case 1: {
                    dq_0 dq_02;
                    int n = var_int_arr_for[0];
                    while ((n < bF.var_java_util_Vector_int.size())) {
                        dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n);
                        if ((dq_02 != null) && (dq_02.soLuong < var_int_arr_for[15]) && (dq_02.cfr_renamed_8 != var_int_arr_for[1])) {
                            if ((dq_02.var_byte_int == var_int_arr_for[6])) {
                                dq_02.var_byte_new = (byte)var_int_arr_for[18];
                                } else {
                                dq_02.var_byte_new = (byte)var_int_arr_for[19];
                            }
                            ef_0.var_short_arr_do[dq_02.var_int_new * ef_0.var_short_if + dq_02.cfr_renamed_2] = dq_02.var_byte_new;
                        }
                        ++n;
                        if (-"  ".length() < 0) continue;
                        return;
                    }
                    n = var_int_arr_for[0];
                    while ((n < bF.var_java_util_Vector_int.size())) {
                        dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n);
                        if ((dq_02 != null) && (dq_02.soLuong < var_int_arr_for[15]) && (dq_02.cfr_renamed_8 != var_int_arr_for[1])) {
                            if ((dq_02.var_byte_int == var_int_arr_for[6])) {
                                dq_02.var_byte_new = (byte)var_int_arr_for[18];
                                } else {
                                dq_02.var_byte_new = (byte)var_int_arr_for[19];
                            }
                            ef_0.var_short_arr_do[dq_02.var_int_new * ef_0.var_short_if + dq_02.cfr_renamed_2] = dq_02.var_byte_new;
                        }
                        ++n;
                        }
                    n = var_int_arr_for[0];
                    while ((n < bF.var_java_util_Vector_int.size())) {
                        dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n);
                        if ((dq_02 != null) && (dq_02.cfr_renamed_8 != var_int_arr_for[1]) && (dq_02.soLuong < var_int_arr_for[15])) {
                            if ((dq_02.var_byte_int == var_int_arr_for[6])) {
                                dq_02.var_byte_new = (byte)var_int_arr_for[20];
                                } else {
                                dq_02.var_byte_new = (byte)var_int_arr_for[21];
                            }
                            dq_02.coTrangThai = var_int_arr_for[0];
                            ef_0.var_short_arr_do[dq_02.var_int_new * ef_0.var_short_if + dq_02.cfr_renamed_2] = dq_02.var_byte_new;
                            dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n, var_int_arr_for[22]);
                            if ((TienIchGame.cfr_renamed_8(5000L))) {
                                TienIchGame.hienThongBao(500L);
                            }
                        }
                        ++n;
                        if ("   ".length() >= 0) continue;
                        return;
                    }
                    GameCanvas.hienThongBaoPopup("Đã tưới nước xong!");
                    if (" ".length() == " ".length()) break;
                    return;
                }
                case 2: {
                    am am2 = (am)this.var_java_lang_Object_do;
                    int n = am2.cfr_renamed_3;
                    int n2 = am2.cfr_renamed_1;
                    int n3 = bF.soLuong;
                    Vector vector = bF.var_java_util_Vector_int;
                    int n4 = bF.var_java_util_Vector_int.size();
                    if ((n2 <= n4)) {
                        int n5;
                        int n6;
                        int n7;
                        if ((n2 <= 0)) {
                            n7 = var_int_arr_for[2];
                            if (-"  ".length() >= 0) {
                                return;
                            }
                        } else {
                            n7 = n6 = n2;
                        }
                        if (!(n > 0) || (n >= n4)) {
                            n5 = n4;
                            } else {
                            n5 = n;
                        }
                        int n8 = n5;
                        n = n6 - var_int_arr_for[2];
                        while ((n < n8)) {
                            dq_0 dq_03 = (dq_0)vector.elementAt(n);
                            if ((dq_03.var_byte_int == var_int_arr_for[6])) {
                                dq_03.var_byte_new = (byte)var_int_arr_for[23];
                                if ("  ".length() <= 0) {
                                    return;
                                }
                            } else {
                                dq_03.var_byte_new = (byte)var_int_arr_for[24];
                            }
                            ef_0.var_short_arr_do[dq_03.var_int_new * ef_0.var_short_if + dq_03.cfr_renamed_2] = dq_03.var_byte_new;
                            if ((dq_03.cfr_renamed_8 != var_int_arr_for[1])) {
                                dh_0.dh_0_do().cfr_renamed_0(n3, n, var_int_arr_for[1]);
                            }
                            dq_03.cfr_renamed_8 = var_int_arr_for[1];
                            ++n;
                            }
                        TienIchGame.cfr_renamed_0("Đồng ý", "Đã làm đất xong! Gieo hạt luôn?", new dx_0());
                    }
                    if (-"   ".length() <= 0) break;
                    return;
                }
                case 3: {
                    AutoFarm ac_02 = this;
                    int n = var_int_arr_for[0];
                    if ((ac_02.var_java_lang_Object_do != null)) {
                        am am3 = (am)ac_02.var_java_lang_Object_do;
                        if ((am3 != null) && (am3.soLuong != var_int_arr_for[1])) {
                            AutoFarm.void_do(am3.soLuong, var_int_arr_for[6]);
                            int n9 = am3.cfr_renamed_3;
                            int n10 = am3.cfr_renamed_1;
                            int n11 = am3.soLuong;
                            int n12 = var_int_arr_for[0];
                            n = bF.var_java_util_Vector_int.size();
                            if ((n10 <= n)) {
                                int n13;
                                int n14;
                                int n15;
                                if ((n10 <= 0)) {
                                    n15 = var_int_arr_for[2];
                                    if ("   ".length() == "  ".length()) {
                                        return;
                                    }
                                } else {
                                    n15 = n14 = n10;
                                }
                                if (!(n9 > 0) || (n9 >= n)) {
                                    n13 = n;
                                    } else {
                                    n13 = n9;
                                }
                                n = n13;
                                --n14;
                                while ((n14 < n)) {
                                    dq_0 dq_04 = (dq_0)bF.var_java_util_Vector_int.elementAt(n14);
                                    if (!(dq_04.soLuong < var_int_arr_for[25]) || (dq_04.cfr_renamed_8 == var_int_arr_for[1])) {
                                        if ((dq_04.var_byte_int == var_int_arr_for[6])) {
                                            dq_04.var_byte_new = (byte)var_int_arr_for[23];
                                            if ("   ".length() <= 0) {
                                                return;
                                            }
                                        } else {
                                            dq_04.var_byte_new = (byte)var_int_arr_for[24];
                                        }
                                        ef_0.var_short_arr_do[dq_04.var_int_new * ef_0.var_short_if + dq_04.cfr_renamed_2] = dq_04.var_byte_new;
                                        if ((dq_04.cfr_renamed_8 != var_int_arr_for[1])) {
                                            dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n14, var_int_arr_for[1]);
                                        }
                                        dq_04.cfr_renamed_8 = var_int_arr_for[1];
                                        dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n14, n11);
                                        ++n12;
                                    }
                                    ++n14;
                                    if (" ".length() > 0) continue;
                                    return;
                                }
                            }
                            n = n12;
                        }
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                    } else if ((mangSoNguyen != null) && (mangSoNguyen.length >= bF.var_java_util_Vector_int.size())) {
                        int n16 = var_int_arr_for[0];
                        while ((n16 < mangSoNguyen.length)) {
                            if ((mangSoNguyen[n16] != var_int_arr_for[1])) {
                                AutoFarm.void_do(mangSoNguyen[n16], var_int_arr_for[6]);
                            }
                            ++n16;
                            if (-" ".length() <= " ".length()) continue;
                            return;
                        }
                        n16 = var_int_arr_for[0];
                        while ((n16 < bF.var_java_util_Vector_int.size())) {
                            dq_0 dq_05 = (dq_0)bF.var_java_util_Vector_int.elementAt(n16);
                            if ((mangSoNguyen[n16] != var_int_arr_for[1]) && (!(dq_05.soLuong < var_int_arr_for[25]) || (dq_05.cfr_renamed_8 == var_int_arr_for[1]))) {
                                if ((dq_05.var_byte_int == var_int_arr_for[6])) {
                                    dq_05.var_byte_new = (byte)var_int_arr_for[23];
                                    if ("  ".length() > "   ".length()) {
                                        return;
                                    }
                                } else {
                                    dq_05.var_byte_new = (byte)var_int_arr_for[24];
                                }
                                ef_0.var_short_arr_do[dq_05.var_int_new * ef_0.var_short_if + dq_05.cfr_renamed_2] = dq_05.var_byte_new;
                                if ((dq_05.cfr_renamed_8 != var_int_arr_for[1])) {
                                    dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n16, var_int_arr_for[1]);
                                }
                                dq_05.cfr_renamed_8 = var_int_arr_for[1];
                                dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n16, mangSoNguyen[n16]);
                                ++n;
                            }
                            ++n16;
                            }
                    }
                    if ((n > 0)) {
                        if (AutoFarm.boolean_do(TienIchGame.cfr_renamed_8(5000L) ? 1 : 0)) {
                            TienIchGame.cfr_renamed_0("Có", "Có lỗi xảy ra! Chưa gieo hạt xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[16], ac_02.var_java_lang_Object_do));
                            if ("   ".length() >= "   ".length()) break;
                            return;
                        }
                        mangSoNguyen = null;
                        GameCanvas.hienThongBaoPopup("Đã gieo hạt xong!");
                        if ("  ".length() < "   ".length()) break;
                        return;
                    }
                    mangSoNguyen = null;
                    GameCanvas.hienThongBaoPopup("Các ô đất đã có cây!");
                    if (" ".length() == " ".length()) break;
                    return;
                }
                case 4: {
                    AutoFarm ac_03 = this;
                    int n = var_int_arr_for[0];
                    int n17 = var_int_arr_for[0];
                    int n18 = bF.soLuong;
                    int n19 = bF.var_java_util_Vector_int.size();
                    short s2 = ((gd)ac_03.var_java_lang_Object_do).var_short_do;
                    AutoFarm.void_do((int)s2, var_int_arr_for[2]);
                    int n20 = var_int_arr_for[0];
                    while ((n20 < n19)) {
                        dq_0 dq_06 = (dq_0)bF.var_java_util_Vector_int.elementAt(n20);
                        if ((dq_06.soLuong < var_int_arr_for[25]) && (dq_06.cfr_renamed_8 != var_int_arr_for[1]) && (!(dq_06.soLuong == var_int_arr_for[15]) || AutoFarm.cfr_renamed_3(dq_06.var_short_do, ak_0.dY_do((int)dq_06.cfr_renamed_8).var_short_do * var_int_arr_for[14] + var_int_arr_for[26])) && (dq_06.var_byte_for > 0) && (dq_06.var_byte_for < var_int_arr_for[22])) {
                            int n21 = var_int_arr_for[0];
                            while ((dq_06.var_byte_for < var_int_arr_for[22]) && (n21 < var_int_arr_for[27])) {
                                ++n21;
                                dh_0.dh_0_do().cfr_renamed_1(n18, n20, s2);
                                if (AutoFarm.boolean_do(TienIchGame.cfr_renamed_8(5000L) ? 1 : 0)) {
                                    ++n17;
                                    if ("  ".length() >= ((0xBC ^ 0xA0) & ~(0x45 ^ 0x59))) break;
                                    return;
                                }
                                TienIchGame.hienThongBao(500L);
                                if (" ".length() >= 0) continue;
                                return;
                            }
                            ++n;
                        }
                        ++n20;
                        }
                    if ((n17 > 0)) {
                        TienIchGame.cfr_renamed_0("Có", "Có lỗi xảy ra! Chưa bón phân xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[28], ac_03.var_java_lang_Object_do));
                        break;
                    }
                    if ((n > 0)) {
                        GameCanvas.hienThongBaoPopup("Đã bón phân xong!");
                        if ("   ".length() >= -" ".length()) break;
                        return;
                    }
                    GameCanvas.hienThongBaoPopup("Không có việc gì để làm!");
                    if ("  ".length() >= " ".length()) break;
                    return;
                }
                case 5: {
                    int n = var_int_arr_for[0];
                    int n22 = var_int_arr_for[0];
                    int n23 = var_int_arr_for[0];
                    int n24 = bF.soLuong;
                    Vector vector = bF.var_java_util_Vector_int;
                    AutoFarm.void_do(var_int_arr_for[20], var_int_arr_for[2]);
                    AutoFarm.void_do(var_int_arr_for[29], var_int_arr_for[2]);
                    int n25 = var_int_arr_for[0];
                    while ((n25 < vector.size())) {
                        dq_0 dq_07 = (dq_0)vector.elementAt(n25);
                        if ((dq_07.soLuong < var_int_arr_for[25])) {
                            if ((dq_07.soLuong == var_int_arr_for[15])) {
                                n = var_int_arr_for[2];
                                } else {
                                if ((dq_07.var_boolean_int)) {
                                    dh_0.dh_0_do().cfr_renamed_1(n24, n25, var_int_arr_for[20]);
                                    if (AutoFarm.boolean_do(TienIchGame.cfr_renamed_8(5000L) ? 1 : 0)) {
                                        ++n22;
                                        } else {
                                        TienIchGame.hienThongBao(500L);
                                    }
                                    ++n23;
                                }
                                if ((dq_07.coKichHoat)) {
                                    dh_0.dh_0_do().cfr_renamed_1(n24, n25, var_int_arr_for[29]);
                                    if (AutoFarm.boolean_do(TienIchGame.cfr_renamed_8(5000L) ? 1 : 0)) {
                                        ++n22;
                                        } else {
                                        TienIchGame.hienThongBao(500L);
                                    }
                                    ++n23;
                                }
                            }
                        }
                        ++n25;
                        }
                    if ((n != 0)) {
                        TienIchGame.cfr_renamed_0("Có", "Có cây đã đến giờ thu hoạch!\nThu hoạch ngay không?", new AutoFarm(var_int_arr_for[25], null));
                        break;
                    }
                    if ((n22 > 0)) {
                        TienIchGame.cfr_renamed_0("Có", "Có lỗi xảy ra! Chưa diệt hết sâu cỏ. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[15], null));
                        if (((0x12 ^ 0x74 ^ (0xAC ^ 0x9A)) & (0x51 ^ 0x36 ^ (0x1A ^ 0x2D) ^ -" ".length())) == 0) break;
                        return;
                    }
                    if ((n23 > 0)) {
                        GameCanvas.hienThongBaoPopup("Đã diệt sâu cỏ xong!");
                        if (((114 + 70 - 62 + 45 ^ 159 + 154 - 207 + 84) & (0xDA ^ 0x82 ^ (0xFB ^ 0xBA) ^ -" ".length())) == 0) break;
                        return;
                    }
                    GameCanvas.hienThongBaoPopup("Không có việc gì để làm!");
                    if (-" ".length() == -" ".length()) break;
                    return;
                }
                case 6: {
                    AutoFarm.cfr_renamed_24();
                    break;
                }
                case 7: {
                    AutoFarm.cfr_renamed_21();
                    if (" ".length() >= 0) break;
                    return;
                }
                case 8: {
                    AutoFarm.cfr_renamed_14();
                    if (-"  ".length() <= 0) break;
                    return;
                }
                case 9: {
                    AutoFarm.cfr_renamed_19();
                    if (((0xF ^ 0x6E ^ (0x34 ^ 0x5B)) & (0x7A ^ 0xF ^ (0x54 ^ 0x2F) ^ -" ".length())) == 0) break;
                    return;
                }
                case 10: {
                    AutoFarm.cfr_renamed_27();
                    if ("  ".length() == "  ".length()) break;
                    return;
                }
                case 11: {
                    this.cfr_renamed_25();
                }
                default: {
                    break;
                }
            }
        }
        catch (Exception exception) {
            }
        AutoController.tatAuto();
        if (AutoFarm.boolean_do(i_0.i_0_do().boolean_do() ? 1 : 0)) {
            return;
        }
        TienIchGame.hienThongBao("Đã xong việc");
    }

    private void cfr_renamed_26() {
        try {
            int n;
            int n2;
            AutoFarm.cfr_renamed_4();
            AutoFarm.void_do(var_int_arr_for[30], var_int_arr_for[2]);
            int n3 = var_int_arr_for[31];
            while ((n3 <= var_int_arr_for[29])) {
                AutoFarm.void_do(n3, var_int_arr_for[2]);
                ++n3;
                return;
            }
            Object object = new boolean[var_int_arr_for[32]];
            int n4 = var_int_arr_for[0];
            while ((n4 < bF.var_java_util_Vector_int.size())) {
                dq_0 dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n4);
                if ((dq_02 != null) && (dq_02.cfr_renamed_8 != null) && (dq_02.cfr_renamed_8 < var_int_arr_for[32]) && AutoFarm.boolean_do(object[dq_02.cfr_renamed_8])) {
                    object[dq_02.cfr_renamed_8] = var_int_arr_for[2];
                    AutoFarm.void_do(dq_02.cfr_renamed_8, var_int_arr_for[6]);
                }
                ++n4;
                if ((0xA6 ^ 0xB8 ^ (0xA6 ^ 0xBC)) > 0) continue;
                return;
            }
            if ((var_int_arr_int != null) && (var_int_arr_int.length > 0)) {
                n4 = var_int_arr_for[0];
                while ((n4 < var_int_arr_int.length)) {
                    if ((var_int_arr_int[n4] != null) && (var_int_arr_int[n4] < var_int_arr_for[32]) && AutoFarm.boolean_do(object[var_int_arr_int[n4]])) {
                        object[AutoFarm.var_int_arr_int[n4]] = var_int_arr_for[2];
                        AutoFarm.void_do(var_int_arr_int[n4], var_int_arr_for[6]);
                    }
                    ++n4;
                    if ("   ".length() >= "  ".length()) continue;
                    return;
                }
            }
            n4 = var_int_arr_for[0];
            int n5 = var_int_arr_for[0];
            while ((n5 < bF.var_java_util_Vector_int.size()) && AutoFarm.boolean_do(this.var_boolean_char ? 1 : 0)) {
                dq_0 dq_03 = (dq_0)bF.var_java_util_Vector_int.elementAt(n5);
                object = dq_03;
                if ((dq_03.soLuong < var_int_arr_for[25]) && (object.cfr_renamed_8 != var_int_arr_for[1])) {
                    if ((n4 < var_int_arr_for[16]) && (object.var_byte_for > 0) && AutoFarm.cfr_renamed_3(object.var_short_do, ak_0.dY_do((int)object.cfr_renamed_8).var_short_do * var_int_arr_for[14] + var_int_arr_for[27]) && (!AutoFarm.boolean_do((int)object.var_byte_for, var_int_arr_for[33]) || AutoFarm.cfr_renamed_3(ak_0.dY_do((int)object.cfr_renamed_8).var_short_do * var_int_arr_for[14] - var_int_arr_for[26], object.var_short_do) && (object.var_byte_for < var_int_arr_for[34]))) {
                        n2 = var_int_arr_for[0];
                        while ((object.var_byte_for < var_int_arr_for[22]) && (n2 < var_int_arr_for[27]) && AutoFarm.boolean_do(this.var_boolean_char ? 1 : 0)) {
                            ++n2;
                            dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n5, var_int_arr_for[30]);
                            if (AutoFarm.boolean_do(TienIchGame.cfr_renamed_8(10000L) ? 1 : 0)) {
                                ++n4;
                                if (!AutoFarm.cfr_renamed_2(i_0.i_0_do().boolean_do() ? 1 : 0) || !((bF.var_java_util_Vector_do, var_int_arr_for[30] == null) <= 0)) break;
                                if ((n5 > 0)) {
                                    --n5;
                                }
                                AutoFarm.void_do(var_int_arr_for[30], var_int_arr_for[2]);
                                if (-(129 + 41 - 67 + 70 ^ 125 + 26 - 104 + 121) < 0) break;
                                return;
                            }
                            TienIchGame.hienThongBao(500L);
                            if ("  ".length() > 0) continue;
                            return;
                        }
                    }
                    if ((object.soLuong != var_int_arr_for[15])) {
                        if ((object.var_boolean_int)) {
                            dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n5, var_int_arr_for[20]);
                            if ((TienIchGame.cfr_renamed_8(15000L))) {
                                TienIchGame.hienThongBao(500L);
                            }
                        }
                        if ((object.coKichHoat)) {
                            dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n5, var_int_arr_for[29]);
                            if ((TienIchGame.cfr_renamed_8(15000L))) {
                                TienIchGame.hienThongBao(500L);
                            }
                        }
                    }
                }
                ++n5;
                return;
            }
            if ((this.var_boolean_char)) {
                return;
            }
            var_int_else = var_int_arr_for[0];
            n5 = var_int_arr_for[0];
            object = new int[bF.var_java_util_Vector_int.size()];
            n2 = var_int_arr_for[0];
            while ((n2 < bF.var_java_util_Vector_int.size())) {
                dq_0 dq_04 = (dq_0)bF.var_java_util_Vector_int.elementAt(n2);
                object[n2] = dq_04.cfr_renamed_8;
                if (!(dq_04.cfr_renamed_8 != var_int_arr_for[1]) || (dq_04.soLuong >= var_int_arr_for[15])) {
                    ++n5;
                    if ((dq_04.soLuong == var_int_arr_for[15])) {
                        dh_0.dh_0_do().cfr_renamed_3(bF.soLuong, n2);
                        var_int_else += var_int_arr_for[2];
                    }
                }
                ++n2;
                if ("   ".length() >= " ".length()) continue;
                return;
            }
            if ((n5 > 0)) {
                if ((var_int_else > 0) && (TienIchGame.cfr_renamed_8(10000L))) {
                    AutoFarm.this();
                }
                int[] nArray = AutoFarm.int_arr_do();
                n4 = var_int_arr_for[0];
                n5 = var_int_arr_for[0];
                while ((n5 < bF.var_java_util_Vector_int.size())) {
                    dq_0 dq_05 = (dq_0)bF.var_java_util_Vector_int.elementAt(n5);
                    n = (object[n5], nArray == null);
                    if ((!(dq_05.soLuong < var_int_arr_for[25]) || (dq_05.cfr_renamed_8 == var_int_arr_for[1])) && (n != var_int_arr_for[1])) {
                        if ((dq_05.var_byte_int == var_int_arr_for[6])) {
                            dq_05.var_byte_new = (byte)var_int_arr_for[23];
                            if (-" ".length() < -" ".length()) {
                                return;
                            }
                        } else {
                            dq_05.var_byte_new = (byte)var_int_arr_for[24];
                        }
                        ef_0.var_short_arr_do[dq_05.var_int_new * ef_0.var_short_if + dq_05.cfr_renamed_2] = dq_05.var_byte_new;
                        if ((dq_05.cfr_renamed_8 != var_int_arr_for[1])) {
                            dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n5, var_int_arr_for[1]);
                        }
                        dq_05.cfr_renamed_8 = var_int_arr_for[1];
                        dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n5, n);
                        ++n4;
                    }
                    ++n5;
                    if ("   ".length() != " ".length()) continue;
                    return;
                }
                if ((n4 > 0) && (TienIchGame.cfr_renamed_8(5000L))) {
                    TienIchGame.hienThongBao(1000L);
                }
            }
            int n6 = var_int_arr_for[0];
            while ((n6 < bF.var_java_util_Vector_int.size())) {
                dq_0 dq_06 = (dq_0)bF.var_java_util_Vector_int.elementAt(n6);
                if ((dq_06 != null) && (dq_06.cfr_renamed_8 != var_int_arr_for[1]) && (dq_06.soLuong < var_int_arr_for[15]) && (dq_06.var_byte_new != var_int_arr_for[21]) && (dq_06.var_byte_new != var_int_arr_for[20])) {
                    if ((dq_06.var_byte_int == var_int_arr_for[6])) {
                        dq_06.var_byte_new = (byte)var_int_arr_for[20];
                        if ("  ".length() == ((0xC4 ^ 0x81) & ~(0x75 ^ 0x30))) {
                            return;
                        }
                    } else {
                        dq_06.var_byte_new = (byte)var_int_arr_for[21];
                    }
                    dq_06.coTrangThai = var_int_arr_for[0];
                    ef_0.var_short_arr_do[dq_06.var_int_new * ef_0.var_short_if + dq_06.cfr_renamed_2] = dq_06.var_byte_new;
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n6, var_int_arr_for[22]);
                    if ((TienIchGame.cfr_renamed_8(2000L))) {
                        TienIchGame.hienThongBao(500L);
                    }
                }
                ++n6;
                if (" ".length() <= (0x10 ^ 0x14)) continue;
                return;
            }
            if ((this.var_boolean_char)) {
                return;
            }
            Vector<ha> vector = new Vector<ha>();
            n4 = var_int_arr_for[0];
            n5 = var_int_arr_for[0];
            int n7 = var_int_arr_for[0];
            n = var_int_arr_for[0];
            int n8 = var_int_arr_for[0];
            int n9 = var_int_arr_for[0];
            int n10 = var_int_arr_for[0];
            int n11 = var_int_arr_for[0];
            int n12 = var_int_arr_for[0];
            int n13 = var_int_arr_for[0];
            int n14 = var_int_arr_for[0];
            while ((n14 < bF.var_java_util_Vector_if.size()) && AutoFarm.boolean_do(this.var_boolean_char ? 1 : 0)) {
                ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n14);
                if (!AutoFarm.boolean_do(ha2.cfr_renamed_6, var_int_arr_for[35]) || AutoFarm.cfr_renamed_2(ha2.this, ak_0.fc_0_do((int)ha2.cfr_renamed_18).soLuong * var_int_arr_for[14] - var_int_arr_for[36]) && (ha2.cfr_renamed_6 < var_int_arr_for[34])) {
                    int n15 = var_int_arr_for[0];
                    while ((ha2.cfr_renamed_6 < var_int_arr_for[22]) && (n15 < var_int_arr_for[27]) && AutoFarm.boolean_do(this.var_boolean_char ? 1 : 0)) {
                        ++n15;
                        dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, var_int_arr_for[18]);
                        if (AutoFarm.boolean_do(TienIchGame.boolean_do(15000L) ? 1 : 0)) {
                            if (!AutoFarm.cfr_renamed_2(i_0.i_0_do().boolean_do() ? 1 : 0) || !((bF.var_java_util_Vector_do, var_int_arr_for[18] == null) <= 0)) break;
                            if ((n14 > 0)) {
                                --n14;
                            }
                            AutoFarm.void_do(var_int_arr_for[18], var_int_arr_for[2]);
                            if (" ".length() != 0) break;
                            return;
                        }
                        TienIchGame.hienThongBao(500L);
                        if (((0x69 ^ 0x7D) & ~(0x61 ^ 0x75)) == 0) continue;
                        return;
                    }
                }
                if (!((ha2.cfr_renamed_18 != var_int_arr_for[37]) && (ha2.cfr_renamed_18 != var_int_arr_for[38]) && (ha2.cfr_renamed_18 != var_int_arr_for[39]) && (ha2.cfr_renamed_18 != var_int_arr_for[40]) && !(ha2.cfr_renamed_18 == var_int_arr_for[41]) || !AutoFarm.boolean_do(ha2.this, ak_0.fc_0_do((int)ha2.cfr_renamed_18).soLuong * var_int_arr_for[14]))) {
                    vector.addElement(ha2);
                    if ((ha2.cfr_renamed_18 == var_int_arr_for[37])) {
                        ++n4;
                        if (" ".length() >= "  ".length()) {
                            return;
                        }
                    } else if ((ha2.cfr_renamed_18 == var_int_arr_for[38])) {
                        ++n5;
                        } else if ((ha2.cfr_renamed_18 == var_int_arr_for[39])) {
                        ++n9;
                        if (((0x90 ^ 0xAF ^ (0x44 ^ 0x18)) & (0x1F ^ 0x49 ^ (0x4A ^ 0x7F) ^ -" ".length())) >= "   ".length()) {
                            return;
                        }
                    } else if ((ha2.cfr_renamed_18 == var_int_arr_for[40])) {
                        ++n8;
                        } else if ((ha2.cfr_renamed_18 == var_int_arr_for[41])) {
                        ++n13;
                    }
                }
                String string = "";
                if ((ha2.cfr_renamed_5)) {
                    int n16;
                    switch (ha2.cfr_renamed_18) {
                        case 54: 
                        case 59: {
                            n16 = var_int_arr_for[31];
                            if (-"   ".length() < 0) break;
                            return;
                        }
                        case 50: 
                        case 56: {
                            n16 = var_int_arr_for[42];
                            if (-"  ".length() <= 0) break;
                            return;
                        }
                        case 51: 
                        case 52: 
                        case 55: 
                        case 58: 
                        case 60: 
                        case 61: {
                            n16 = var_int_arr_for[43];
                            if (((80 + 156 - 185 + 131 ^ 87 + 145 - 201 + 148) & (135 + 42 - 86 + 45 ^ 73 + 6 - 66 + 128 ^ -" ".length())) == 0) break;
                            return;
                        }
                        case 53: {
                            n16 = var_int_arr_for[44];
                            if ("  ".length() <= "  ".length()) break;
                            return;
                        }
                        default: {
                            n16 = var_int_arr_for[1];
                        }
                    }
                    if ((n16 != var_int_arr_for[1])) {
                        dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, n16);
                        if ((TienIchGame.boolean_do(5000L))) {
                            string = string + "No bụng";
                            TienIchGame.hienThongBao(500L);
                        }
                    }
                }
                if ((ha2.var_boolean_arr_do[var_int_arr_for[0]] != 0)) {
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, var_int_arr_for[45]);
                    if ((TienIchGame.boolean_do(15000L))) {
                        if (AutoFarm.boolean_do(string.equals("") ? 1 : 0)) {
                            string = string + ", ";
                        }
                        string = string + "khỏi tiêu chảy";
                        TienIchGame.hienThongBao(500L);
                    }
                }
                if ((ha2.var_boolean_arr_do[var_int_arr_for[2]] != 0)) {
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, var_int_arr_for[23]);
                    if ((TienIchGame.boolean_do(15000L))) {
                        if (AutoFarm.boolean_do(string.equals("") ? 1 : 0)) {
                            string = string + ", ";
                        }
                        string = string + "khỏi cúm";
                        TienIchGame.hienThongBao(500L);
                    }
                }
                if (AutoFarm.boolean_do(string.equals("") ? 1 : 0)) {
                    (ha2, string == null);
                }
                ++n14;
                if (((130 + 65 - 178 + 118 ^ 122 + 124 - 181 + 128) & (0xBD ^ 0xA3 ^ (0xE7 ^ 0xBF) ^ -" ".length())) == ((0x65 ^ 0x44 ^ (0x9C ^ 0xA8)) & (115 + 156 - 122 + 14 ^ 153 + 104 - 157 + 82 ^ -" ".length()))) continue;
                return;
            }
            if ((this.var_boolean_char)) {
                return;
            }
            if ((AngelChip.duLieuNguoiChoi.var_short_char == bF.soLuong)) {
                n14 = var_int_arr_for[0];
                int n17 = var_int_arr_for[0];
                int n18 = var_int_arr_for[0];
                while ((n18 < bF.var_java_util_Vector_if.size())) {
                    ha ha3 = (ha)bF.var_java_util_Vector_if.elementAt(n18);
                    if (!(ha3.cfr_renamed_18 != var_int_arr_for[32]) || !(ha3.cfr_renamed_18 != var_int_arr_for[46]) || !(ha3.cfr_renamed_18 != var_int_arr_for[47]) || (ha3.cfr_renamed_18 == var_int_arr_for[41])) {
                        ++n14;
                        } else if (!(ha3.cfr_renamed_18 != var_int_arr_for[37]) || !(ha3.cfr_renamed_18 != var_int_arr_for[39]) || (ha3.cfr_renamed_18 == var_int_arr_for[14])) {
                        n14 += 2;
                        if (-(0x35 ^ 0x4F ^ 67 + 49 - 68 + 79) >= 0) {
                            return;
                        }
                    } else if (!(ha3.cfr_renamed_18 != var_int_arr_for[10]) || (ha3.cfr_renamed_18 == var_int_arr_for[12])) {
                        n14 += 3;
                        if ("   ".length() <= "  ".length()) {
                            return;
                        }
                    } else if (!(ha3.cfr_renamed_18 != var_int_arr_for[38]) || (ha3.cfr_renamed_18 == var_int_arr_for[40])) {
                        ++n17;
                    }
                    if (!(!(ha3.cfr_renamed_19 > 0) || (ha3.cfr_renamed_18 != var_int_arr_for[32]) && (ha3.cfr_renamed_18 != var_int_arr_for[10]) && (ha3.cfr_renamed_18 != var_int_arr_for[12]) && (ha3.cfr_renamed_18 != var_int_arr_for[47]) && !(ha3.cfr_renamed_18 == var_int_arr_for[14]))) {
                        ha3.cfr_renamed_19 = var_int_arr_for[0];
                        int n19 = var_int_arr_for[0];
                        if ((this.mangSoNguyen != null)) {
                            if ((this.mangSoNguyen instanceof AutoKimCuong != 0)) {
                                n19 = AutoKimCuong.var_int_if;
                                if ((0x5E ^ 0x5A) == ((0x1B ^ 0x41) & ~(0x9A ^ 0xC0))) {
                                    return;
                                }
                            } else if ((this.mangSoNguyen instanceof dn_0 != 0)) {
                                n19 = dn_0.soLuong;
                            }
                        }
                        if (!(ha3.cfr_renamed_18 != var_int_arr_for[10]) || !(ha3.cfr_renamed_18 != var_int_arr_for[12]) || (ha3.cfr_renamed_18 == var_int_arr_for[14])) {
                            dh_0.dh_0_do().cfr_renamed_8(bF.soLuong, ha3.cfr_renamed_12);
                            bF.void_int(var_int_arr_for[48]);
                            if ((ha3.cfr_renamed_18 == var_int_arr_for[10]) && (var_int_arr_for[49] - ha3.this < n19 + var_int_arr_for[50])) {
                                vector.addElement(ha3);
                                ++n10;
                                if (" ".length() != " ".length()) {
                                    return;
                                }
                            } else if ((ha3.cfr_renamed_18 == var_int_arr_for[12]) && (var_int_arr_for[51] - ha3.this < n19 + var_int_arr_for[52])) {
                                vector.addElement(ha3);
                                ++n11;
                                if (((0xD1 ^ 0x88) & ~(0x3C ^ 0x65)) != (" ".length() & ~" ".length())) {
                                    return;
                                }
                            } else if ((ha3.cfr_renamed_18 == var_int_arr_for[14]) && (var_int_arr_for[51] - ha3.this < n19 + var_int_arr_for[53])) {
                                vector.addElement(ha3);
                                ++n12;
                            }
                        }
                        if (!(ha3.cfr_renamed_18 != var_int_arr_for[32]) || (ha3.cfr_renamed_18 == var_int_arr_for[47])) {
                            dh_0.dh_0_do().cfr_renamed_8(bF.soLuong, ha3.cfr_renamed_12);
                            bF.void_int(var_int_arr_for[9]);
                            if ((var_int_arr_for[54] - ha3.this <= n19 + var_int_arr_for[50])) {
                                vector.addElement(ha3);
                                if ((ha3.cfr_renamed_18 == var_int_arr_for[32])) {
                                    ++n7;
                                }
                                if ((ha3.cfr_renamed_18 == var_int_arr_for[47])) {
                                    ++n;
                                }
                            }
                        }
                    }
                    ++n18;
                    if (((0x88 ^ 0x98) & ~(0xB9 ^ 0xA9)) <= ((0x24 ^ 0x2C) & ~(0x76 ^ 0x7E))) continue;
                    return;
                }
                AutoFarm.cfr_renamed_15();
                if ((bF.var_by_do.var_short_new > 0)) {
                    el_0.el_0_do().void_do();
                    TienIchGame.boolean_if(5000L);
                    }
                if ((this.mangSoNguyen != null)) {
                    if ((this.mangSoNguyen instanceof AutoKimCuong != 0)) {
                        AutoFarm.cfr_renamed_18();
                        if (((4 ^ 0x20) & ~(0x6A ^ 0x4E)) != ((0xB9 ^ 0x93) & ~(0x88 ^ 0xA2))) {
                            return;
                        }
                    } else if ((this.mangSoNguyen instanceof dn_0 != 0)) {
                        AutoFarm.cfr_renamed_8();
                    }
                }
                if (AutoFarm.boolean_do(vector.isEmpty() ? 1 : 0)) {
                    n18 = var_int_arr_for[0];
                    while ((n18 < vector.size())) {
                        ha ha4 = (ha)vector.elementAt(n18);
                        dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, (byte)ha4.cfr_renamed_12);
                        if ((TienIchGame.boolean_do(15000L))) {
                            (ha4, "Bye bye T.T" == null);
                            TienIchGame.hienThongBao(500L);
                        }
                        ++n18;
                        return;
                    }
                }
                AutoFarm.cfr_renamed_12();
                this.cfr_renamed_10();
                if ((n14 < this.var_int_case)) {
                    n18 = this.var_int_case - n14;
                    switch (var_byte_do) {
                        case 0: {
                            n7 += n18;
                            if (null == null) break;
                            return;
                        }
                        case 1: {
                            n += n18;
                            if ((0xA3 ^ 0xA7) == (0xBF ^ 0xBB)) break;
                            return;
                        }
                        case 2: {
                            if (!(n18 >= var_int_arr_for[6])) break;
                            n4 += n18 / var_int_arr_for[6];
                        }
                    }
                }
                if ((n17 < this.var_int_int)) {
                    n18 = this.var_int_int - n17;
                    if (AutoFarm.boolean_do((int)var_byte_for)) {
                        n5 += n18;
                        } else if ((var_byte_for == var_int_arr_for[2])) {
                        n8 += n18;
                    }
                }
                if (!((n4 <= 0) && (n5 <= 0) && (n7 <= 0) && (n <= 0) && (n8 <= 0) && (n9 <= 0) && (n10 <= 0) && (n11 <= 0) && (n12 <= 0) && !(n13 > 0))) {
                    TienIchGame.hienThongBao(1000L);
                    bF.bF_do().cfr_renamed_18();
                    TienIchGame.cfr_renamed_2(15000L);
                    if ((ef_0.soLuong == var_int_arr_for[3])) {
                        if ((n4 > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n4)) {
                                AutoFarm.void_do(var_int_arr_for[37]);
                                ++n18;
                                if (-(0x5C ^ 0x59) < 0) continue;
                                return;
                            }
                        }
                        if ((n5 > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n5)) {
                                AutoFarm.void_do(var_int_arr_for[38]);
                                ++n18;
                                return;
                            }
                        }
                        if ((n7 > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n7)) {
                                AutoFarm.void_do(var_int_arr_for[32]);
                                ++n18;
                                return;
                            }
                        }
                        if ((n > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n)) {
                                AutoFarm.void_do(var_int_arr_for[47]);
                                ++n18;
                                if ((0xBF ^ 0xBA) > 0) continue;
                                return;
                            }
                        }
                        if ((n8 > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n8)) {
                                AutoFarm.void_do(var_int_arr_for[40]);
                                ++n18;
                                if ((0xE8 ^ 0xA6 ^ (0x50 ^ 0x1B)) != 0) continue;
                                return;
                            }
                        }
                        if ((n9 > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n9)) {
                                AutoFarm.void_do(var_int_arr_for[39]);
                                ++n18;
                                if (((0x74 ^ 0x62 ^ (0x74 ^ 0x4B)) & (0x41 ^ 0x16 ^ (0xF0 ^ 0x8E) ^ -" ".length())) < "  ".length()) continue;
                                return;
                            }
                        }
                        if ((n10 > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n10)) {
                                AutoFarm.void_do(var_int_arr_for[10]);
                                ++n18;
                                if (-"  ".length() <= 0) continue;
                                return;
                            }
                        }
                        if ((n11 > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n11)) {
                                AutoFarm.void_do(var_int_arr_for[12]);
                                ++n18;
                                if ((0x19 ^ 0x1D) > 0) continue;
                                return;
                            }
                        }
                        if ((n12 > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n12)) {
                                AutoFarm.void_do(var_int_arr_for[14]);
                                ++n18;
                                if (((0x69 ^ 0x4A) & ~(0x39 ^ 0x1A)) == 0) continue;
                                return;
                            }
                        }
                        if ((n13 > 0)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n13)) {
                                AutoFarm.void_do(var_int_arr_for[41]);
                                ++n18;
                                if (((0xB ^ 0x4E) & ~(0x43 ^ 6)) <= "   ".length()) continue;
                                return;
                            }
                        }
                    }
                }
                if ((AngelChip.duLieuNguoiChoi.var_short_byte != var_int_arr_for[1]) && (!AutoFarm.boolean_do(AutoChamEmBe.var_boolean_new ? 1 : 0) || !AutoFarm.boolean_do(AutoChamEmBe.coKichHoat ? 1 : 0) || (AutoChamEmBe.coTrangThai))) {
                    TienIchGame.hienThongBao(1000L);
                    AutoController.batAuto(new AutoChamEmBe(), (NhiemVuAutoBase)this.mangSoNguyen);
                    return;
                }
            }
            }
        catch (Exception exception) {
            }
        if ((0x59 ^ 0x5D) == "  ".length()) {
            return;
        }
        if (AutoFarm.boolean_do(i_0.i_0_do().boolean_do() ? 1 : 0)) {
            return;
        }
        if ((this.mangSoNguyen != null)) {
            TienIchGame.hienThongBao(1000L);
            AutoController.cfr_renamed_2();
            return;
        }
        AutoController.tatAuto();
        GameCanvas.hienThongBaoPopup("Đã chăm sóc xong!");
        TienIchGame.hienThongBao("Đã xong việc");
    }

    static ew_0 ew_0_do(String string) {
        if (AutoFarm.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
            int n = var_int_arr_for[0];
            while ((n < var_java_util_Vector_do.size())) {
                ew_0 ew_02 = (ew_0)var_java_util_Vector_do.elementAt(n);
                if ((ew_02.cfr_renamed_0(string))) {
                    return ew_02;
                }
                ++n;
                if (-" ".length() <= "  ".length()) continue;
                return null;
            }
        }
        return null;
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    protected static void (ha ha2, String string == null) {
        if ((ha2 != null) && (string != null) && AutoFarm.boolean_do(string.equals("") ? 1 : 0)) {
            ha2.var_boolean_arr_do = (boolean[])new cf(var_int_arr_for[32], string, var_int_arr_for[0]);
            ha2.var_boolean_arr_do.void_do(ha2.coKichHoat ? 1 : 0, ha2.cfr_renamed_1 - var_int_arr_for[61]);
        }
    }

    public static void this() {
        long l = System.currentTimeMillis();
        while (AutoFarm.cfr_renamed_5((System.currentTimeMillis() - l <= 10000L))) {
            if ((var_int_else <= 0)) {
                TienIchGame.hienThongBao(500L);
                return;
            }
            TienIchGame.hienThongBao(50L);
            if ((0x33 ^ 0x60 ^ (0x2A ^ 0x7D)) != 0) continue;
            return;
        }
    }

        protected final void cfr_renamed_16() {
        super.cfr_renamed_13();
        this.var_int_int = var_int_arr_for[1];
        this.var_int_case = var_int_arr_for[1];
        this.var_boolean_char = var_int_arr_for[0];
        this.var_boolean_case = this.var_boolean_byte = var_int_arr_for[0];
        this.var_boolean_else = this.var_boolean_byte;
        if (AutoFarm.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
            var_java_util_Vector_do.removeAllElements();
        }
    }

    private static void cfr_renamed_21() {
        int n = var_int_arr_for[31];
        while ((n <= var_int_arr_for[44])) {
            AutoFarm.void_do(n, var_int_arr_for[2]);
            ++n;
            if ("  ".length() >= 0) continue;
            return;
        }
        n = var_int_arr_for[0];
        int n2 = var_int_arr_for[0];
        int n3 = var_int_arr_for[0];
        while ((n3 < bF.var_java_util_Vector_if.size())) {
            ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n3);
            if ((ha2.cfr_renamed_5)) {
                int n4;
                switch (ha2.cfr_renamed_18) {
                    case 54: 
                    case 59: {
                        n4 = var_int_arr_for[31];
                        if ((46 + 79 - -22 + 0 ^ 110 + 16 - 116 + 140) != 0) break;
                        return;
                    }
                    case 50: 
                    case 56: {
                        n4 = var_int_arr_for[42];
                        if (-" ".length() != "  ".length()) break;
                        return;
                    }
                    case 51: 
                    case 52: 
                    case 55: 
                    case 58: 
                    case 60: 
                    case 61: {
                        n4 = var_int_arr_for[43];
                        if (((0xA3 ^ 0xC1 ^ (0xE9 ^ 0xB8)) & (68 + 14 - 21 + 89 ^ 87 + 2 - 72 + 148 ^ -" ".length())) >= 0) break;
                        return;
                    }
                    case 53: {
                        n4 = var_int_arr_for[44];
                        if (-" ".length() != (0x9D ^ 0x99)) break;
                        return;
                    }
                    default: {
                        n4 = var_int_arr_for[1];
                    }
                }
                if ((n4 != var_int_arr_for[1])) {
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, n4);
                    if ((TienIchGame.boolean_do(5000L))) {
                        ++n;
                        (ha2, "No bụng" == null);
                        TienIchGame.hienThongBao(500L);
                        if ("   ".length() == 0) {
                            return;
                        }
                    } else {
                        ++n2;
                        if ((122 + 18 - 26 + 15 ^ 122 + 121 - 224 + 114) <= 0) {
                            return;
                        }
                    }
                } else {
                    (ha2, "Chưa hỗ trợ" == null);
                    if (-" ".length() > 0) {
                        return;
                    }
                }
            } else {
                (ha2, "Không đói" == null);
            }
            ++n3;
            if (-(0x3A ^ 7 ^ (0x15 ^ 0x2C)) < 0) continue;
            return;
        }
        if ((n2 > 0)) {
            TienIchGame.cfr_renamed_0("Có", "Có lỗi xảy ra! Chưa cho ăn xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[57], null));
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã cho ăn xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Không con nào đói!");
    }

    private static void cfr_renamed_29() {
        var_int_arr_for = new int[65];
        AutoFarm.var_int_arr_for[0] = (0x35 ^ 9) & ~(0x3E ^ 2);
        AutoFarm.var_int_arr_for[1] = -" ".length();
        AutoFarm.var_int_arr_for[2] = " ".length();
        AutoFarm.var_int_arr_for[3] = 0xF ^ 0x16;
        AutoFarm.var_int_arr_for[4] = 0x40 ^ 0x69;
        AutoFarm.var_int_arr_for[5] = -"  ".length();
        AutoFarm.var_int_arr_for[6] = "  ".length();
        AutoFarm.var_int_arr_for[7] = 0x18 ^ 0x13;
        AutoFarm.var_int_arr_for[8] = -"   ".length();
        AutoFarm.var_int_arr_for[9] = -(0x20 ^ 0x36 ^ (0xA1 ^ 0x84));
        AutoFarm.var_int_arr_for[10] = 0x8C ^ 0xBF;
        AutoFarm.var_int_arr_for[11] = -(0x8E ^ 0xBC ^ (0x12 ^ 0x17));
        AutoFarm.var_int_arr_for[12] = 97 + 99 - 78 + 24 ^ 110 + 114 - 186 + 147;
        AutoFarm.var_int_arr_for[13] = -(0x7E ^ 0x1A ^ (0x98 ^ 0xC0));
        AutoFarm.var_int_arr_for[14] = 0x5F ^ 0x34 ^ (0xEF ^ 0xB8);
        AutoFarm.var_int_arr_for[15] = 0x72 ^ 0x77;
        AutoFarm.var_int_arr_for[16] = "   ".length();
        AutoFarm.var_int_arr_for[17] = 0x2B ^ 0x3C ^ (0x1C ^ 0x13);
        AutoFarm.var_int_arr_for[18] = 2 ^ 0x78 ^ (0x8A ^ 0xA8) & ~(0x65 ^ 0x47);
        AutoFarm.var_int_arr_for[19] = 0x43 ^ 0x67;
        AutoFarm.var_int_arr_for[20] = 0xA7 ^ 0xB6 ^ (0xFA ^ 0x90);
        AutoFarm.var_int_arr_for[21] = 0x55 ^ 0x70;
        AutoFarm.var_int_arr_for[22] = 0x18 ^ 0x7C;
        AutoFarm.var_int_arr_for[23] = 0x14 ^ 0x6C;
        AutoFarm.var_int_arr_for[24] = 32 + 26 - 21 + 136 ^ 114 + 104 - 108 + 33;
        AutoFarm.var_int_arr_for[25] = 0x35 ^ 0x60 ^ (0x30 ^ 0x63);
        AutoFarm.var_int_arr_for[26] = 14 + 40 - -2 + 110 ^ 79 + 108 - 109 + 91;
        AutoFarm.var_int_arr_for[27] = 0x95 ^ 0x9F;
        AutoFarm.var_int_arr_for[28] = 9 ^ 0x22 ^ (0xA6 ^ 0x89);
        AutoFarm.var_int_arr_for[29] = 78 + 159 - 224 + 229 ^ 58 + 17 - 4 + 71;
        AutoFarm.var_int_arr_for[30] = 0x6E ^ 1;
        AutoFarm.var_int_arr_for[31] = 69 + 16 - -40 + 100 ^ 92 + 46 - 136 + 147;
        AutoFarm.var_int_arr_for[32] = 0x7E ^ 0xA ^ (0xF7 ^ 0xB1);
        AutoFarm.var_int_arr_for[33] = 108 + 64 - 38 + 59 ^ 85 + 33 - 117 + 144;
        AutoFarm.var_int_arr_for[34] = 172 + 47 - 146 + 152 ^ 40 + 123 - 90 + 117;
        AutoFarm.var_int_arr_for[35] = 0x26 ^ 0x73;
        AutoFarm.var_int_arr_for[36] = 0x93 ^ 0x8D;
        AutoFarm.var_int_arr_for[37] = 0xE ^ 0x7C ^ (0x35 ^ 0x73);
        AutoFarm.var_int_arr_for[38] = 0x78 ^ 0x31 ^ 34 + 97 - 38 + 34;
        AutoFarm.var_int_arr_for[39] = 0x8A ^ 0xB0;
        AutoFarm.var_int_arr_for[40] = 0x87 ^ 0xAA ^ (0xD4 ^ 0xC2);
        AutoFarm.var_int_arr_for[41] = 0x9D ^ 0xAB ^ (0x83 ^ 0x88);
        AutoFarm.var_int_arr_for[42] = 0x69 ^ 0x1C;
        AutoFarm.var_int_arr_for[43] = 59 + 115 - 36 + 63 ^ 113 + 103 - 108 + 83;
        AutoFarm.var_int_arr_for[44] = 97 + 152 - 247 + 200 ^ 151 + 89 - 51 + 0;
        AutoFarm.var_int_arr_for[45] = 94 + 15 - 87 + 203 ^ 147 + 92 - 159 + 72;
        AutoFarm.var_int_arr_for[46] = 0xF ^ 0x66 ^ (0x73 ^ 0x2F);
        AutoFarm.var_int_arr_for[47] = 4 + 135 - -24 + 7 ^ 35 + 139 - 45 + 17;
        AutoFarm.var_int_arr_for[48] = -(1 ^ 0x10 ^ (0x3C ^ 0x1F));
        AutoFarm.var_int_arr_for[49] = 0xFFFFAEC9 & 0xF9F6;
        AutoFarm.var_int_arr_for[50] = 0xFFFF936E & 0x6DF9;
        AutoFarm.var_int_arr_for[51] = -(3 + 93 - 80 + 115) & (0xFFFFFEEE & 0x39D3);
        AutoFarm.var_int_arr_for[52] = -(0xFFFF8D76 & 0x77AF) & (0xFFFFC7F5 & 0x3FFF);
        AutoFarm.var_int_arr_for[53] = 72 + 221 - 269 + 216;
        AutoFarm.var_int_arr_for[54] = -(0xFFFFE7CD & 0x58BB) & (0xFFFFEFE8 & 0x77FF);
        AutoFarm.var_int_arr_for[55] = 6 ^ 0x1A;
        AutoFarm.var_int_arr_for[56] = 0xFFFFFFF0 & 0x271F;
        AutoFarm.var_int_arr_for[57] = 0x24 ^ 0x23;
        AutoFarm.var_int_arr_for[58] = 0x45 ^ 0x4D;
        AutoFarm.var_int_arr_for[59] = 0xAC ^ 0xA5;
        AutoFarm.var_int_arr_for[60] = 0xFFFFE3FA & 0x1FED;
        AutoFarm.var_int_arr_for[61] = 0xFF ^ 0xB2 ^ (0xCF ^ 0xAF);
        AutoFarm.var_int_arr_for[62] = 0xED ^ 0x8E;
        AutoFarm.var_int_arr_for[63] = 0xFFFFF5BD & 0x7F72;
        AutoFarm.var_int_arr_for[64] = -(0xEE ^ 0x8A) & (0xFFFFFD73 & 0x7FEF);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        block13: {
            AutoFarm.cfr_renamed_29();
            String[][] stringArrayArray = new String[var_int_arr_for[6]][];
            String[] stringArray = new String[var_int_arr_for[6]];
            stringArray[AutoFarm.var_int_arr_for[0]] = "Từ ô:";
            stringArray[AutoFarm.var_int_arr_for[2]] = "";
            stringArrayArray[AutoFarm.var_int_arr_for[0]] = stringArray;
            String[] stringArray2 = new String[var_int_arr_for[6]];
            stringArray2[AutoFarm.var_int_arr_for[0]] = "Đến ô:";
            stringArray2[AutoFarm.var_int_arr_for[2]] = "";
            stringArrayArray[AutoFarm.var_int_arr_for[2]] = stringArray2;
            var_java_lang_String_arr_arr_do = stringArrayArray;
            var_int_new = var_int_arr_for[1];
            coKichHoat = var_int_arr_for[2];
            var_java_util_Hashtable_int = new Hashtable();
            chuoiPhu = "";
            var_int_char = var_int_arr_for[63];
            var_byte_for = (byte)var_int_arr_for[6];
            var_byte_do = (byte)var_int_arr_for[16];
            chuoiGiaTri = "";
            var_java_util_Vector_do = new Vector();
            var_boolean_new = var_int_arr_for[0];
            var_java_util_Hashtable_do = new Hashtable();
            var_java_util_Vector_if = new Vector();
            dangChayAuto = var_int_arr_for[0];
            var_java_util_Hashtable_for = new Hashtable();
            var_java_util_Vector_int = new Vector();
            var_gY_do = null;
            var_boolean_try = var_int_arr_for[0];
            var_java_util_Hashtable_if = new Hashtable();
            var_gY_if = null;
            var_boolean_int = var_int_arr_for[0];
            var_byte_if = (byte)var_int_arr_for[0];
            var_short_arr_if = null;
            var_int_arr_if = null;
            var_int_arr_int = null;
            tenNhanVat = "";
            soLuongKhoa = var_int_arr_for[64];
            var_int_byte = var_int_arr_for[0];
            coTrangThai = var_int_arr_for[0];
            var_int_try = var_int_arr_for[32];
            var_int_else = var_int_arr_for[0];
            Object object = QuanLyRMS.byte_arr_do("FarmSettings");
            if ((object != null)) {
                object = new ByteArrayInputStream((byte[])object);
                DataInputStream dataInputStream = new DataInputStream((InputStream)object);
                try {
                    var_byte_if = dataInputStream.readByte();
                    chuoiGiaTri = dataInputStream.readUTF();
                    chuoiPhu = dataInputStream.readUTF();
                    var_int_char = dataInputStream.readInt();
                    var_byte_for = dataInputStream.readByte();
                    var_byte_do = dataInputStream.readByte();
                    coKichHoat = dataInputStream.readBoolean();
                    AutoChamEmBe.var_boolean_new = dataInputStream.readBoolean();
                    tenNhanVat = dataInputStream.readUTF();
                    soLuongKhoa = dataInputStream.readInt();
                    coTrangThai = dataInputStream.readBoolean();
                    var_int_try = dataInputStream.readInt();
                    var_int_byte = dataInputStream.readInt();
                    AutoChamEmBe.coKichHoat = dataInputStream.readBoolean();
                    AutoChamEmBe.dangChayAuto = dataInputStream.readBoolean();
                    AutoChamEmBe.coTrangThai = dataInputStream.readBoolean();
                    var_boolean_new = dataInputStream.readBoolean();
                    dangChayAuto = dataInputStream.readBoolean();
                    var_boolean_try = dataInputStream.readBoolean();
                    var_boolean_int = dataInputStream.readBoolean();
                }
                catch (IOException iOException) {
                    try {
                        dataInputStream.close();
                        ((ByteArrayInputStream)object).close();
                        }
                    catch (IOException iOException2) {
                        if (((0xAE ^ 0x93 ^ (0x37 ^ 5)) & (0xB ^ 0xE ^ (3 ^ 9) ^ -" ".length())) != 0) {
                            return;
                        }
                        break block13;
                    }
                    if (-"  ".length() >= 0) {
                        return;
                    }
                    break block13;
                }
                catch (Throwable throwable) {
                    try {
                        dataInputStream.close();
                        ((ByteArrayInputStream)object).close();
                        }
                    catch (IOException iOException) {
                        throw throwable;
                    }
                    if (" ".length() < (0x79 ^ 0x7D)) throw throwable;
                    return;
                }
                try {
                    dataInputStream.close();
                    ((ByteArrayInputStream)object).close();
                    }
                catch (IOException iOException) {
                    if (-" ".length() != (0x80 ^ 0xA4 ^ (0x3C ^ 0x1C))) break block13;
                    return;
                }
            }
        }
        AutoFarm.cfr_renamed_20();
    }

    /*
     * WARNING - void declaration
     */
    protected final void (boolean bl != null) {
        block0: while ((dangChayAuto)) {
            void ew_02;
            int n;
            int n2;
            Integer n3;
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
            int n4 = calendar.get(var_int_arr_for[15]);
            int n5 = calendar.get(var_int_arr_for[7]);
            if (AutoFarm.boolean_do(var_java_util_Hashtable_for.isEmpty() ? 1 : 0) && AutoFarm.cfr_renamed_2(var_java_util_Hashtable_for.containsKey(n3 = new Integer(AngelChip.duLieuNguoiChoi.var_short_char)) ? 1 : 0)) {
                n2 = (Integer)var_java_util_Hashtable_for.get(n3);
                if (((17 + 63 - -36 + 18 ^ 14 + 48 - 24 + 136) & (0x88 ^ 0xA2 ^ "  ".length() ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                n2 = n = var_int_arr_for[1];
            }
            if (!(var_int_new != var_int_arr_for[1]) || (n != var_int_arr_for[1]) && (!(n != n4) || !AutoFarm.boolean_do(n5, var_int_arr_for[15]))) break;
            if (AutoFarm.cfr_renamed_2((int)ew_02)) {
                TienIchGame.hienThongBao("Nhiệm vụ luyện rồng");
            }
            AutoFarm.cfr_renamed_2();
            if (!AutoFarm.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) break;
            ew_0 ew_03 = AutoFarm.ew_0_do("Rồng Ngũ Hành");
            var_java_util_Vector_do.removeAllElements();
            if (!(ew_03 != null)) break;
            TienIchGame.hienThongBao(100L);
            ew_03.cfr_renamed_0();
            if (!(gf_0.boolean_do())) break;
            ew_0 ew_04 = AutoFarm.ew_0_do("Chức năng luyện rồng");
            var_java_util_Vector_do.removeAllElements();
            if (!(ew_04 != null)) break;
            TienIchGame.hienThongBao(100L);
            ew_04.cfr_renamed_0();
            if (!(gf_0.boolean_do())) break;
            ew_0 ew_05 = AutoFarm.ew_0_do("Luyện rồng");
            var_gY_do = null;
            if ((ew_05 != null)) {
                ew_05.cfr_renamed_0();
                if ((gf_0.boolean_do()) && (var_gY_do != null)) {
                    this.var_boolean_case = var_int_arr_for[0];
                    var_gY_do.cfr_renamed_0();
                    if ((TienIchGame.cfr_renamed_4(10000L)) && (this.var_boolean_case)) {
                        var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n4));
                        var_java_util_Vector_do.removeAllElements();
                        TienIchGame.hienThongBao("Luyện rồng thành công");
                        return;
                    }
                }
            }
            ew_0 ew_06 = AutoFarm.ew_0_do("Làm nhiệm vụ luyện rồng");
            var_java_util_Vector_do.removeAllElements();
            if ((ew_06 != null)) {
                void var1_10;
                void var1_8;
                TienIchGame.hienThongBao(100L);
                ew_06.cfr_renamed_0();
                if (!(gf_0.boolean_do())) break;
                if (AutoFarm.boolean_do(var_java_util_Vector_int.isEmpty() ? 1 : 0)) {
                    var_java_util_Vector_int.removeAllElements();
                }
                int n6 = var_int_arr_for[0];
                while (AutoFarm.cfr_renamed_1((int)var1_8, var_java_util_Vector_do.size())) {
                    ew_0 ew_07 = (ew_0)var_java_util_Vector_do.elementAt((int)var1_8);
                    if ((ew_07 != null) && AutoFarm.boolean_do(ew_07.chuoiGiaTri.toLowerCase().trim().endsWith("xong") ? 1 : 0)) {
                        var_java_util_Vector_int.addElement(ew_07);
                    }
                    ++var1_8;
                    if (" ".length() > 0) continue;
                    return;
                }
                if ((var_java_util_Vector_int.isEmpty())) {
                    if (!AutoFarm.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0) || !(var_gY_do == null)) break;
                    if (AutoFarm.boolean_do(n5, var_int_arr_for[15])) {
                        var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n4));
                        return;
                    }
                    var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n4 - var_int_arr_for[2]));
                    return;
                }
                int n7 = var_int_arr_for[0];
                while (AutoFarm.cfr_renamed_1((int)var1_10, var_java_util_Vector_int.size())) {
                    var_java_util_Vector_do.removeAllElements();
                    ((ew_0)var_java_util_Vector_int.elementAt((int)var1_10)).cfr_renamed_0();
                    if ((gf_0.boolean_do())) {
                        n5 = var_int_arr_for[0];
                        n4 = var_int_arr_for[0];
                        while ((n4 < var_java_util_Vector_do.size())) {
                            ew_0 ew_08 = (ew_0)var_java_util_Vector_do.elementAt(n4);
                            if ((ew_08 != null)) {
                                if (AutoFarm.cfr_renamed_2(ew_08.chuoiGiaTri.toLowerCase().trim().endsWith("xong") ? 1 : 0)) {
                                    ++n5;
                                    if (((0x5A ^ 0xC) & ~(0x28 ^ 0x7E)) == -" ".length()) {
                                        return;
                                    }
                                } else {
                                    this.var_boolean_else = var_int_arr_for[0];
                                    ew_08.cfr_renamed_0();
                                    if ((TienIchGame.cfr_renamed_4(7000L)) && (this.var_boolean_else)) {
                                        ++n5;
                                    }
                                }
                            }
                            ++n4;
                            if ("  ".length() != 0) continue;
                            return;
                        }
                        if ((n5 >= var_int_arr_for[16])) {
                            int n8 = var_int_arr_for[0];
                            if ((135 + 104 - 153 + 90 ^ 125 + 9 - -34 + 12) >= 0) continue block0;
                            return;
                        }
                    }
                    ++var1_10;
                    if ((0x75 ^ 0x70) != 0) continue;
                    return;
                }
                return;
            }
            if (AutoFarm.boolean_do(n5, var_int_arr_for[15])) {
                var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n4));
                return;
            }
            var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n4 - var_int_arr_for[2]));
            break;
        }
    }

        protected static void cfr_renamed_6() {
        dh_0.dh_0_do().cfr_renamed_5(var_int_arr_for[0], var_int_arr_for[0]);
        TienIchGame.cfr_renamed_4(10000L);
        dh_0.dh_0_do().cfr_renamed_15(var_int_arr_for[0], var_int_arr_for[0]);
        TienIchGame.cfr_renamed_4(10000L);
        }

        protected final void cfr_renamed_17() {
        block8: {
            int n;
            int n2;
            block9: {
                int n3;
                int n4;
                Integer n5;
                if (!(var_boolean_try)) break block8;
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
                n2 = calendar.get(var_int_arr_for[15]);
                n = calendar.get(var_int_arr_for[7]);
                if (AutoFarm.boolean_do(var_java_util_Hashtable_if.isEmpty() ? 1 : 0) && AutoFarm.cfr_renamed_2(var_java_util_Hashtable_if.containsKey(n5 = new Integer(AngelChip.duLieuNguoiChoi.var_short_char)) ? 1 : 0)) {
                    n4 = (Integer)var_java_util_Hashtable_if.get(n5);
                    if (-"  ".length() > 0) {
                        return;
                    }
                } else {
                    n4 = n3 = var_int_arr_for[1];
                }
                if (!(var_int_new != var_int_arr_for[1]) || (n3 != var_int_arr_for[1]) && (!(n3 != n2) || !AutoFarm.boolean_do(n, var_int_arr_for[15]))) break block8;
                TienIchGame.hienThongBao("Giao đơn hàng");
                AutoFarm.cfr_renamed_2();
                if (!AutoFarm.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) break block8;
                ew_0 ew_02 = AutoFarm.ew_0_do("Đơn hàng từ thành phố");
                var_java_util_Vector_do.removeAllElements();
                if (!(ew_02 != null)) break block8;
                TienIchGame.hienThongBao(100L);
                ew_02.cfr_renamed_0();
                if (!(gf_0.boolean_do())) break block8;
                ew_02 = AutoFarm.ew_0_do("Giao Hàng");
                var_java_util_Vector_do.removeAllElements();
                if (!(ew_02 != null)) break block9;
                TienIchGame.hienThongBao(100L);
                ew_02.cfr_renamed_0();
                if (!(gf_0.boolean_do())) break block8;
                n = var_int_arr_for[0];
                int n6 = var_int_arr_for[0];
                while ((n6 < var_java_util_Vector_do.size())) {
                    block10: {
                        block11: {
                            block12: {
                                ew_0 ew_03 = (ew_0)var_java_util_Vector_do.elementAt(n6);
                                if (!(ew_03 != null) || !AutoFarm.boolean_do(ew_03.chuoiGiaTri.toLowerCase().trim().endsWith("xong") ? 1 : 0)) break block10;
                                var_gY_if = null;
                                ew_03.cfr_renamed_0();
                                if (!(gf_0.boolean_do())) break block11;
                                if (!(var_gY_if != null)) break block10;
                                this.var_boolean_byte = var_int_arr_for[0];
                                var_gY_if.cfr_renamed_0();
                                if (!(TienIchGame.cfr_renamed_4(7000L))) break block12;
                                if (!(this.var_boolean_byte)) break block10;
                                if (" ".length() != " ".length()) {
                                    return;
                                }
                                break block11;
                            }
                            ++n;
                            if (((0x1C ^ 0x12) & ~(0x8A ^ 0x84)) > " ".length()) {
                                return;
                            }
                            break block10;
                        }
                        ++n;
                    }
                    ++n6;
                    if (((97 + 90 - 92 + 55 ^ 1 + 167 - 158 + 176) & (0x54 ^ 0x63 ^ (0x64 ^ 0x7F) ^ -" ".length())) == 0) continue;
                    return;
                }
                if (AutoFarm.boolean_do(n)) {
                    var_java_util_Hashtable_if.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n2));
                    var_java_util_Vector_do.removeAllElements();
                }
                return;
            }
            if (AutoFarm.boolean_do(n, var_int_arr_for[15])) {
                var_java_util_Hashtable_if.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n2));
                return;
            }
            var_java_util_Hashtable_if.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_char), new Integer(n2 - var_int_arr_for[2]));
            }
    }
}

