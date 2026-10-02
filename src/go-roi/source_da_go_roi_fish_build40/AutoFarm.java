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
 * Renamed from bq
 */
public class AutoFarm
extends NhiemVuAutoBase
implements de {
    private static short[] var_short_arr_do;
    public static Hashtable var_java_util_Hashtable_do;
    public static String chuoiGiaTri;
    private static int[] var_int_arr_if;
    private boolean dangChayAuto;
    public static int cfr_renamed_4;
    public static String tenNhanVat;
    private static short[] var_short_arr_if;
    static ge_0 var_ge_0_do;
    private boolean coTrangThai;
    private static final int[] var_int_arr_for;
    public static boolean var_boolean_char;
    private static Hashtable var_java_util_Hashtable_int;
    public static int[] mangSoNguyen;
    private static int[] var_int_arr_int;
    protected int cfr_renamed_5;
    private boolean coKichHoat;
    public static Hashtable var_java_util_Hashtable_if;
    public static int cfr_renamed_6;
    public static final String[][] var_java_lang_String_arr_arr_do;
    private final int soLuong;
    public static int cfr_renamed_7;
    private int var_int_if;
    public static byte var_byte_do;
    public static int var_int_char;
    public static int var_int_else;
    public static int var_int_goto;
    public static String chuoiPhu;
    protected static Vector var_java_util_Vector_do;
    public static boolean var_boolean_else;
    private final Object var_java_lang_Object_do;
    public static boolean var_boolean_goto;
    public static Hashtable var_java_util_Hashtable_for;
    public static byte var_byte_if;
    private static Vector var_java_util_Vector_int;
    public static final Vector var_java_util_Vector_if;
    protected int var_int_long;
    public static boolean var_boolean_long;
    public static boolean this;
    public static boolean cfr_renamed_12;
    private boolean var_boolean_int;
    static ge_0 var_ge_0_if;
    public static byte var_byte_for;

    protected static void cfr_renamed_4() {
        if ((this ? 1 : 0 != null)) {
            int n;
            int n2;
            Integer n3;
            Object object = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
            int n4 = ((Calendar)object).get(var_int_arr_for[15]);
            if (!(var_java_util_Hashtable_int.isEmpty()) && AutoFarm.cfr_renamed_0(var_java_util_Hashtable_int.containsKey(n3 = new Integer(AngelChip.duLieuNguoiChoi.var_short_goto)) ? 1 : 0)) {
                n2 = (Integer)var_java_util_Hashtable_int.get(n3);
                if (-"   ".length() > 0) {
                    return;
                }
            } else {
                n2 = n = var_int_arr_for[1];
            }
            if ((cfr_renamed_7 != var_int_arr_for[1]) && (!(n != var_int_arr_for[1]) || (n != n4) && AutoFarm.cfr_renamed_0(((Calendar)object).get(var_int_arr_for[7]), var_int_arr_for[15]))) {
                TienIchGame.void_if("Báo danh hàng ngày");
                AutoFarm.this();
                if (!(var_java_util_Vector_if.isEmpty())) {
                    object = AutoFarm.fy_do("Báo danh hàng ngày");
                    var_java_util_Vector_if.removeAllElements();
                    if ((object != null)) {
                        TienIchGame.void_if(100L);
                        ((fy)object).cfr_renamed_1();
                        if ((gW.boolean_do() ? 1 : 0 != null)) {
                            object = AutoFarm.fy_do("Báo danh hàng ngày");
                            var_java_util_Vector_if.removeAllElements();
                            if ((object != null)) {
                                ((fy)object).cfr_renamed_1();
                                if ((TienIchGame.cfr_renamed_8(10000L) ? 1 : 0 != null)) {
                                    var_java_util_Hashtable_int.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n4));
                                    }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void cfr_renamed_3() {
        int n = var_int_arr_for[0];
        int n2 = var_int_arr_for[0];
        AutoFarm.void_do(var_int_arr_for[46], var_int_arr_for[2]);
        AutoFarm.void_do(var_int_arr_for[23], var_int_arr_for[2]);
        int n3 = var_int_arr_for[0];
        while ((n3 < dR.var_java_util_Vector_byte.size())) {
            hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n3);
            if ((hs2 != null)) {
                String string = "";
                if ((hs2.var_boolean_arr_do[var_int_arr_for[0]] != null)) {
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, var_int_arr_for[46]);
                    if ((TienIchGame.boolean_if(5000L) ? 1 : 0 != null)) {
                        ++n;
                        string = "Khỏi tiêu chảy";
                        TienIchGame.void_if(500L);
                        if ("  ".length() <= 0) {
                            return;
                        }
                    } else {
                        ++n2;
                    }
                }
                if ((hs2.var_boolean_arr_do[var_int_arr_for[2]] != null)) {
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, var_int_arr_for[23]);
                    if ((TienIchGame.boolean_if(5000L) ? 1 : 0 != null)) {
                        ++n;
                        if (!(string.equals(""))) {
                            string = string + ", ";
                        }
                        string = string + "Khỏi cúm";
                        TienIchGame.void_if(500L);
                        if (" ".length() > (0x6E ^ 0x6A)) {
                            return;
                        }
                    } else {
                        ++n2;
                    }
                }
                if (!(string.equals(""))) {
                    (hs2, string == null);
                }
            }
            ++n3;
            return;
        }
        if (AutoFarm.boolean_do(n2)) {
            TienIchGame.cfr_renamed_1("Có", "Có lỗi xảy ra! Chưa chữa bênh xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[60], null));
            return;
        }
        if (AutoFarm.boolean_do(n)) {
            GameCanvas.hienThongBaoPopup("Đã chữa bênh xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Tất cả đều khỏe!");
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static final void e_() {
        long l = System.currentTimeMillis();
        while (AutoFarm.cfr_renamed_5((System.currentTimeMillis() - l < 10000L))) {
            if ((cfr_renamed_4 <= 0)) {
                TienIchGame.void_if(500L);
                return;
            }
            TienIchGame.void_if(50L);
            if (((0x11 ^ 0x34) & ~(0xC ^ 0x29)) == 0) continue;
            return;
        }
    }

    protected static int (int n, int[] nArray == null) {
        if ((n >= var_int_arr_for[33])) {
            return n;
        }
        if ((n >= 0)) {
            if (!(var_int_arr_int != null) || (nArray[n] < var_int_char)) {
                return n;
            }
            if ((nArray[n] >= var_int_char) && (var_int_arr_int != null) && AutoFarm.boolean_do(var_int_arr_int.length)) {
                int n2 = var_int_arr_for[0];
                while ((n2 < var_int_arr_int.length)) {
                    if ((var_int_arr_int[n2] >= 0) && (var_int_arr_int[n2] != n) && (nArray[var_int_arr_int[n2]] < var_int_char)) {
                        return var_int_arr_int[n2];
                    }
                    ++n2;
                    if (-"   ".length() <= 0) continue;
                    return (0x17 ^ 0x5E ^ (0xD7 ^ 0xA0)) & (0x37 ^ 0x3B ^ (0x21 ^ 0x13) ^ -" ".length());
                }
                if ("  ".length() <= ((0x2E ^ 0x67) & ~(0x14 ^ 0x5D))) {
                    return (0x7A ^ 0x6D) & ~(4 ^ 0x13);
                }
            }
        } else if ((var_int_arr_int != null) && AutoFarm.boolean_do(var_int_arr_int.length)) {
            int n3 = var_int_arr_for[1];
            n = var_int_arr_for[0];
            while ((n < var_int_arr_int.length)) {
                if ((var_int_arr_int[n] >= 0)) {
                    if ((n3 == var_int_arr_for[1])) {
                        n3 = var_int_arr_int[n];
                    }
                    if ((nArray[var_int_arr_int[n]] < var_int_char)) {
                        return var_int_arr_int[n];
                    }
                }
                ++n;
                if ("  ".length() != 0) continue;
                return (234 + 99 - 159 + 71 ^ 39 + 154 - 62 + 63) & (110 + 9 - -27 + 42 ^ 126 + 26 - 134 + 121 ^ -" ".length());
            }
            return n3;
        }
        return n;
    }

    protected static void cfr_renamed_6() {
        if ((aj.coKichHoat ? 1 : 0 != null)) {
            long l = AutoFarm.long_do();
            if (AutoFarm.boolean_do((l > 0L)) && AutoFarm.cfr_renamed_5((l > aj.aj_do().var_long_if))) {
                aj.aj_do().soXu = System.currentTimeMillis() + l + 60000L;
                return;
            }
            aj.aj_do().soXu = System.currentTimeMillis() + aj.aj_do().var_long_if;
            return;
        }
        aj.aj_do().soXu = System.currentTimeMillis() + aj.aj_do().var_long_if;
    }

    private static long long_do() {
        long l = -1L;
        int n = var_int_arr_for[0];
        while ((n < dR.var_java_util_Vector_int.size())) {
            es es2 = (es)dR.var_java_util_Vector_int.elementAt(n);
            if ((es2 != null) && (es2.cfr_renamed_6 != var_int_arr_for[1]) && (es2.cfr_renamed_5 < var_int_arr_for[25])) {
                long l2 = (long)(bz.fb_0_if((int)es2.cfr_renamed_6).cfr_renamed_5 * var_int_arr_for[14] * var_int_arr_for[14] * var_int_arr_for[58]) - es2.soXu * 1000L;
                if (!AutoFarm.cfr_renamed_0((l == -1L)) || AutoFarm.cfr_renamed_5((l2 == l))) {
                    l = l2;
                }
            }
            ++n;
            if ((0x2D ^ 0x68 ^ (0xD7 ^ 0x96)) > 0) continue;
            return 0L;
        }
        return l;
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized void d_() {
        block123: {
            try {
                if (AutoFarm.boolean_do((System.currentTimeMillis() - this.var_java_util_Hashtable_int != 180000L))) {
                    TienIchGame.dangXuatTaiKhoan();
                    TienIchGame.hienThongBao(16000L);
                    return;
                }
                if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != null)) {
                    return;
                }
                if ((fh.var_int_char != var_int_arr_for[17])) {
                    if ((fh.var_int_char != var_int_arr_for[3])) {
                        long l;
                        if ((GameCanvas.var_en_do instanceof gO != null) && AutoFarm.cfr_renamed_5((l = System.currentTimeMillis() - this.cfr_renamed_4 != 2000L))) {
                            TienIchGame.void_if(2000L - l);
                        }
                        if ((TienIchGame.cfr_renamed_1(var_int_arr_for[3]) ? 1 : 0 != null)) {
                            TienIchGame.void_if(3000L);
                        }
                        return;
                    }
                    if (!(var_java_util_Vector_do.isEmpty())) {
                        var_java_util_Vector_do.removeAllElements();
                    }
                    AutoFarm.cfr_renamed_4();
                    (var_int_arr_for[2] == null);
                    this.cfr_renamed_0(var_int_arr_for[2]);
                    this.cfr_renamed_18();
                    if (!(dR.var_java_util_Vector_int != null) || (dR.var_int_goto != AngelChip.duLieuNguoiChoi.var_short_goto)) {
                        GameCanvas.cfr_renamed_8();
                        dR.dR_do().cfr_renamed_0((int)AngelChip.duLieuNguoiChoi.var_short_goto, var_int_arr_for[2]);
                        if ("   ".length() == 0) {
                            return;
                        }
                    } else {
                        dR.dR_do().cfr_renamed_1(dR.var_int_goto, dR.var_java_util_Vector_int, dR.var_java_util_Vector_byte, dR.var_byte_if, dR.var_byte_do, dR.var_short_do, dR.soLuongKhoa);
                    }
                    if ((GameCanvas.var_dj_0_do == null)) {
                        GameCanvas.cfr_renamed_2(MenuChinhAvatar.bv);
                    }
                    if ((TienIchGame.cfr_renamed_3(var_int_arr_for[17]) ? 1 : 0 != null)) {
                        TienIchGame.void_if(1000L);
                    }
                    return;
                }
                GameCanvas.cfr_renamed_7();
                TienIchGame.void_if("Hãy chờ đến khi farm xong");
                AutoFarm.cfr_renamed_13();
                switch (this.soLuong) {
                    case 0: {
                        this.cfr_renamed_17();
                        return;
                    }
                    case 1: {
                        es es2;
                        int n = var_int_arr_for[0];
                        while ((n < dR.var_java_util_Vector_int.size())) {
                            es2 = (es)dR.var_java_util_Vector_int.elementAt(n);
                            if ((es2 != null) && (es2.cfr_renamed_5 < var_int_arr_for[15]) && (es2.cfr_renamed_6 != var_int_arr_for[1])) {
                                if ((es2.var_byte_for == var_int_arr_for[6])) {
                                    es2.var_byte_int = (byte)var_int_arr_for[18];
                                    if (((3 ^ 0x29) & ~(0x1E ^ 0x34)) >= "   ".length()) {
                                        return;
                                    }
                                } else {
                                    es2.var_byte_int = (byte)var_int_arr_for[19];
                                }
                                fh.var_short_arr_if[es2.soLuong * fh.var_short_if + es2.var_int_new] = es2.var_byte_int;
                            }
                            ++n;
                            }
                        n = var_int_arr_for[0];
                        while ((n < dR.var_java_util_Vector_int.size())) {
                            es2 = (es)dR.var_java_util_Vector_int.elementAt(n);
                            if ((es2 != null) && (es2.cfr_renamed_6 != var_int_arr_for[1]) && (es2.cfr_renamed_5 < var_int_arr_for[15])) {
                                if ((es2.var_byte_for == var_int_arr_for[6])) {
                                    es2.var_byte_int = (byte)var_int_arr_for[20];
                                    if ("  ".length() > "  ".length()) {
                                        return;
                                    }
                                } else {
                                    es2.var_byte_int = (byte)var_int_arr_for[21];
                                }
                                es2.coTrangThai = var_int_arr_for[0];
                                fh.var_short_arr_if[es2.soLuong * fh.var_short_if + es2.var_int_new] = es2.var_byte_int;
                                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_for[22]);
                                if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 != null)) {
                                    TienIchGame.void_if(500L);
                                }
                            }
                            ++n;
                            }
                        GameCanvas.hienThongBaoPopup("Đã tưới nước xong!");
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                        break block123;
                    }
                    case 2: {
                        co co2 = (co)this.var_java_lang_Object_do;
                        int n = co2.cfr_renamed_2;
                        int n2 = co2.cfr_renamed_0;
                        int n3 = dR.var_int_goto;
                        Vector vector = dR.var_java_util_Vector_int;
                        int n4 = dR.var_java_util_Vector_int.size();
                        if (AutoFarm.boolean_do(n2, n4)) {
                            int n5;
                            int n6;
                            int n7;
                            if ((n2 <= 0)) {
                                n7 = var_int_arr_for[2];
                                if ((7 + 120 - 62 + 100 ^ 118 + 120 - 217 + 140) <= "  ".length()) {
                                    return;
                                }
                            } else {
                                n7 = n6 = n2;
                            }
                            if (!AutoFarm.boolean_do(n) || (n >= n4)) {
                                n5 = n4;
                                if (-" ".length() > "   ".length()) {
                                    return;
                                }
                            } else {
                                n5 = n;
                            }
                            int n8 = n5;
                            n = n6 - var_int_arr_for[2];
                            while ((n < n8)) {
                                es es3 = (es)vector.elementAt(n);
                                if ((es3 != null)) {
                                    if ((es3.var_byte_for == var_int_arr_for[6])) {
                                        es3.var_byte_int = (byte)var_int_arr_for[23];
                                        } else {
                                        es3.var_byte_int = (byte)var_int_arr_for[24];
                                    }
                                    fh.var_short_arr_if[es3.soLuong * fh.var_short_if + es3.var_int_new] = es3.var_byte_int;
                                    if ((es3.cfr_renamed_6 != var_int_arr_for[1])) {
                                        et_0.et_0_do().cfr_renamed_0(n3, n, var_int_arr_for[1]);
                                    }
                                    es3.cfr_renamed_6 = var_int_arr_for[1];
                                }
                                ++n;
                                if (" ".length() >= 0) continue;
                                return;
                            }
                            TienIchGame.cfr_renamed_1("Đồng ý", "Đã làm đất xong! Gieo hạt luôn?", new dx_0());
                        }
                        if (" ".length() != " ".length()) {
                            return;
                        }
                        break block123;
                    }
                    case 3: {
                        AutoFarm bq_02 = this;
                        int n = var_int_arr_for[0];
                        if ((bq_02.var_java_lang_Object_do != null)) {
                            co co3 = (co)bq_02.var_java_lang_Object_do;
                            if ((co3 != null) && (co3.soLuong != var_int_arr_for[1])) {
                                AutoFarm.void_do(co3.soLuong, var_int_arr_for[6]);
                                int n9 = co3.cfr_renamed_2;
                                int n10 = co3.cfr_renamed_0;
                                int n11 = co3.soLuong;
                                int n12 = var_int_arr_for[0];
                                n = dR.var_java_util_Vector_int.size();
                                if (AutoFarm.boolean_do(n10, n)) {
                                    int n13;
                                    int n14;
                                    int n15;
                                    if ((n10 <= 0)) {
                                        n15 = var_int_arr_for[2];
                                        } else {
                                        n15 = n14 = n10;
                                    }
                                    if (!AutoFarm.boolean_do(n9) || (n9 >= n)) {
                                        n13 = n;
                                        if (("  ".length() & ("  ".length() ^ -" ".length())) == -" ".length()) {
                                            return;
                                        }
                                    } else {
                                        n13 = n9;
                                    }
                                    n = n13;
                                    --n14;
                                    while ((n14 < n)) {
                                        es es4 = (es)dR.var_java_util_Vector_int.elementAt(n14);
                                        if ((es4 != null) && (!(es4.cfr_renamed_5 < var_int_arr_for[25]) || (es4.cfr_renamed_6 == var_int_arr_for[1]))) {
                                            if ((es4.var_byte_for == var_int_arr_for[6])) {
                                                es4.var_byte_int = (byte)var_int_arr_for[23];
                                                } else {
                                                es4.var_byte_int = (byte)var_int_arr_for[24];
                                            }
                                            fh.var_short_arr_if[es4.soLuong * fh.var_short_if + es4.var_int_new] = es4.var_byte_int;
                                            if ((es4.cfr_renamed_6 != var_int_arr_for[1])) {
                                                et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n14, var_int_arr_for[1]);
                                            }
                                            es4.cfr_renamed_6 = var_int_arr_for[1];
                                            et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n14, n11);
                                            ++n12;
                                        }
                                        ++n14;
                                        if (" ".length() > 0) continue;
                                        return;
                                    }
                                }
                                n = n12;
                            }
                            } else if ((mangSoNguyen != null) && (mangSoNguyen.length >= dR.var_java_util_Vector_int.size())) {
                            int n16 = var_int_arr_for[0];
                            while ((n16 < mangSoNguyen.length)) {
                                if ((mangSoNguyen[n16] != var_int_arr_for[1])) {
                                    AutoFarm.void_do(mangSoNguyen[n16], var_int_arr_for[6]);
                                }
                                ++n16;
                                if (-" ".length() <= ((0xC1 ^ 0x8E) & ~(0x2C ^ 0x63))) continue;
                                return;
                            }
                            n16 = var_int_arr_for[0];
                            while ((n16 < dR.var_java_util_Vector_int.size())) {
                                es es5 = (es)dR.var_java_util_Vector_int.elementAt(n16);
                                if ((es5 != null) && (mangSoNguyen[n16] != var_int_arr_for[1]) && (!(es5.cfr_renamed_5 < var_int_arr_for[25]) || (es5.cfr_renamed_6 == var_int_arr_for[1]))) {
                                    if ((es5.var_byte_for == var_int_arr_for[6])) {
                                        es5.var_byte_int = (byte)var_int_arr_for[23];
                                        } else {
                                        es5.var_byte_int = (byte)var_int_arr_for[24];
                                    }
                                    fh.var_short_arr_if[es5.soLuong * fh.var_short_if + es5.var_int_new] = es5.var_byte_int;
                                    if ((es5.cfr_renamed_6 != var_int_arr_for[1])) {
                                        et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n16, var_int_arr_for[1]);
                                    }
                                    es5.cfr_renamed_6 = var_int_arr_for[1];
                                    et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n16, mangSoNguyen[n16]);
                                    ++n;
                                }
                                ++n16;
                                if ((8 ^ 0x5A ^ (0x45 ^ 0x13)) > -" ".length()) continue;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n)) {
                            if (!(TienIchGame.cfr_renamed_3(5000L))) {
                                TienIchGame.cfr_renamed_1("Có", "Có lỗi xảy ra! Chưa gieo hạt xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[16], bq_02.var_java_lang_Object_do));
                                if (-"  ".length() > 0) {
                                    return;
                                }
                                break block123;
                            } else {
                                mangSoNguyen = null;
                                GameCanvas.hienThongBaoPopup("Đã gieo hạt xong!");
                                }
                            break block123;
                        }
                        mangSoNguyen = null;
                        GameCanvas.hienThongBaoPopup("Các ô đất đã có cây!");
                        if (" ".length() == -" ".length()) {
                            return;
                        }
                        break block123;
                    }
                    case 4: {
                        AutoFarm bq_03 = this;
                        int n = var_int_arr_for[0];
                        int n17 = var_int_arr_for[0];
                        int n18 = dR.var_int_goto;
                        int n19 = dR.var_java_util_Vector_int.size();
                        short s2 = ((ee_0)bq_03.var_java_lang_Object_do).var_short_if;
                        AutoFarm.void_do((int)s2, var_int_arr_for[2]);
                        int n20 = var_int_arr_for[0];
                        while ((n20 < n19)) {
                            es es6 = (es)dR.var_java_util_Vector_int.elementAt(n20);
                            if ((es6 != null) && (es6.cfr_renamed_5 < var_int_arr_for[25]) && (es6.cfr_renamed_6 != var_int_arr_for[1]) && (!(es6.cfr_renamed_5 == var_int_arr_for[15]) || AutoFarm.boolean_do((int)es6.var_short_do, bz.fb_0_if((int)es6.cfr_renamed_6).cfr_renamed_5 * var_int_arr_for[14] + var_int_arr_for[26])) && AutoFarm.boolean_do((int)es6.var_byte_new) && (es6.var_byte_new < var_int_arr_for[22])) {
                                int n21 = var_int_arr_for[0];
                                while ((es6.var_byte_new < var_int_arr_for[22]) && (n21 < var_int_arr_for[27])) {
                                    ++n21;
                                    et_0.et_0_do().cfr_renamed_1(n18, n20, (int)s2);
                                    if (!(TienIchGame.cfr_renamed_3(5000L))) {
                                        ++n17;
                                        if (-" ".length() != "   ".length()) break;
                                        return;
                                    }
                                    TienIchGame.void_if(500L);
                                    if (-" ".length() < 0) continue;
                                    return;
                                }
                                ++n;
                            }
                            ++n20;
                            }
                        if (AutoFarm.boolean_do(n17)) {
                            TienIchGame.cfr_renamed_1("Có", "Có lỗi xảy ra! Chưa bón phân xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[28], bq_03.var_java_lang_Object_do));
                            if (" ".length() < 0) {
                                return;
                            }
                            break block123;
                        }
                        if (AutoFarm.boolean_do(n)) {
                            GameCanvas.hienThongBaoPopup("Đã bón phân xong!");
                            if ("   ".length() <= 0) {
                                return;
                            }
                            break block123;
                        } else {
                            GameCanvas.hienThongBaoPopup("Không có việc gì để làm!");
                            if ("   ".length() == 0) {
                                return;
                            }
                        }
                        break block123;
                    }
                    case 5: {
                        int n = var_int_arr_for[0];
                        int n22 = var_int_arr_for[0];
                        int n23 = var_int_arr_for[0];
                        int n24 = dR.var_int_goto;
                        Vector vector = dR.var_java_util_Vector_int;
                        AutoFarm.void_do(var_int_arr_for[20], var_int_arr_for[2]);
                        AutoFarm.void_do(var_int_arr_for[29], var_int_arr_for[2]);
                        int n25 = var_int_arr_for[0];
                        while ((n25 < vector.size())) {
                            es es7 = (es)vector.elementAt(n25);
                            if ((es7 != null) && (es7.cfr_renamed_5 < var_int_arr_for[25])) {
                                if ((es7.cfr_renamed_5 == var_int_arr_for[15])) {
                                    n = var_int_arr_for[2];
                                    if ((0xA5 ^ 0xC0 ^ (0xC4 ^ 0xA5)) < ((8 + 160 - 67 + 71 ^ 127 + 56 - 151 + 96) & (0x2A ^ 0x20 ^ (0xA5 ^ 0x83) ^ -" ".length()))) {
                                        return;
                                    }
                                } else {
                                    if ((es7.dangChayAuto ? 1 : 0 != null)) {
                                        et_0.et_0_do().cfr_renamed_1(n24, n25, var_int_arr_for[20]);
                                        if (!(TienIchGame.cfr_renamed_3(5000L))) {
                                            ++n22;
                                            } else {
                                            TienIchGame.void_if(500L);
                                        }
                                        ++n23;
                                    }
                                    if ((es7.coKichHoat ? 1 : 0 != null)) {
                                        et_0.et_0_do().cfr_renamed_1(n24, n25, var_int_arr_for[29]);
                                        if (!(TienIchGame.cfr_renamed_3(5000L))) {
                                            ++n22;
                                            if ("  ".length() != "  ".length()) {
                                                return;
                                            }
                                        } else {
                                            TienIchGame.void_if(500L);
                                        }
                                        ++n23;
                                    }
                                }
                            }
                            ++n25;
                            }
                        if ((n != null)) {
                            TienIchGame.cfr_renamed_1("Có", "Có cây đã đến giờ thu hoạch!\nThu hoạch ngay không?", new AutoFarm(var_int_arr_for[25], null));
                            break block123;
                        }
                        if (AutoFarm.boolean_do(n22)) {
                            TienIchGame.cfr_renamed_1("Có", "Có lỗi xảy ra! Chưa diệt hết sâu cỏ. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[15], null));
                            if ("  ".length() <= ((0x1C ^ 3) & ~(0x58 ^ 0x47))) {
                                return;
                            }
                            break block123;
                        }
                        if (AutoFarm.boolean_do(n23)) {
                            GameCanvas.hienThongBaoPopup("Đã diệt sâu cỏ xong!");
                            if (-" ".length() > 0) {
                                return;
                            }
                            break block123;
                        } else {
                            GameCanvas.hienThongBaoPopup("Không có việc gì để làm!");
                            if (-"  ".length() >= 0) {
                                return;
                            }
                        }
                        break block123;
                    }
                    case 6: {
                        AutoFarm.cfr_renamed_29();
                        if (-" ".length() > ((0x2F ^ 0x38) & ~(0x80 ^ 0x97))) {
                            return;
                        }
                        break block123;
                    }
                    case 7: {
                        AutoFarm.cfr_renamed_24();
                        if (-" ".length() > " ".length()) {
                            return;
                        }
                        break block123;
                    }
                    case 8: {
                        AutoFarm.cfr_renamed_3();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                        break block123;
                    }
                    case 9: {
                        int n = var_int_arr_for[0];
                        int n26 = var_int_arr_for[0];
                        AutoFarm.void_do(var_int_arr_for[18], var_int_arr_for[2]);
                        int n27 = var_int_arr_for[0];
                        while ((n27 < dR.var_java_util_Vector_byte.size())) {
                            hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n27);
                            if ((hs2 != null) && (hs2.cfr_renamed_12 < var_int_arr_for[22])) {
                                int n28 = var_int_arr_for[0];
                                while ((hs2.cfr_renamed_12 < var_int_arr_for[22]) && (n28 < var_int_arr_for[27])) {
                                    ++n28;
                                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, var_int_arr_for[18]);
                                    if (!(TienIchGame.boolean_if(5000L))) {
                                        ++n26;
                                        if (((0xFB ^ 0xA9 ^ (0xA9 ^ 0xAF)) & (181 + 52 - 232 + 251 ^ 82 + 13 - -27 + 46 ^ -" ".length())) == 0) break;
                                        return;
                                    }
                                    TienIchGame.void_if(500L);
                                    }
                                ++n;
                            }
                            ++n27;
                            }
                        if (AutoFarm.boolean_do(n26)) {
                            TienIchGame.cfr_renamed_1("Có", "Có lỗi xảy ra! Chưa bơm thuốc bổ xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[30], null));
                            if (((0xB2 ^ 0xC0 ^ (0xF8 ^ 0x85)) & (0x7D ^ 0x6E ^ (0x15 ^ 9) ^ -" ".length())) != ((47 + 133 - 66 + 42 ^ 30 + 3 - -98 + 39) & (58 + 127 - 147 + 128 ^ 16 + 37 - -57 + 34 ^ -" ".length()))) {
                                return;
                            }
                            break block123;
                        }
                        if (AutoFarm.boolean_do(n)) {
                            GameCanvas.hienThongBaoPopup("Đã bơm thuốc bổ xong!");
                            if (-" ".length() > 0) {
                                return;
                            }
                            break block123;
                        } else {
                            GameCanvas.hienThongBaoPopup("Tất cả đều khỏe không cần thuốc bổ!");
                            }
                        break block123;
                    }
                    case 10: {
                        AutoFarm.cfr_renamed_27();
                        break block123;
                    }
                    case 11: {
                        this.cfr_renamed_26();
                    }
                    default: {
                        break;
                    }
                }
            }
            catch (Exception exception) {
                break block123;
            }
            if (-"  ".length() >= 0) {
                return;
            }
        }
        AutoController.tatAuto();
        if (AutoFarm.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0)) {
            return;
        }
        TienIchGame.void_if("Đã xong việc");
    }

    private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

    protected final void cfr_renamed_7() {
        if (AutoFarm.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0)) {
            return;
        }
        if ((var_boolean_char ? 1 : 0 != null) && (dR.var_e_0_do.var_short_if < cfr_renamed_6) && (dR.var_e_0_do.var_short_if < var_int_arr_for[33]) && (dR.var_e_0_do.soLuong <= 0)) {
            this.var_int_if = var_int_arr_for[0];
            et_0.et_0_do().cfr_renamed_6(var_int_arr_for[0]);
            if ((TienIchGame.boolean_for() ? 1 : 0 != null) && AutoFarm.boolean_do(this.var_int_if) && (AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[0]] > this.var_int_if + var_int_arr_for[57])) {
                et_0.et_0_do().cfr_renamed_6(var_int_arr_for[2]);
                if ((TienIchGame.cfr_renamed_8(15000L) ? 1 : 0 != null)) {
                    TienIchGame.void_if(1000L);
                }
            }
        }
    }

    protected static int (Vector object, int n == null) {
        if (AutoFarm.cfr_renamed_0(object = ee_0.cfr_renamed_1((Vector)object, n))) {
            return ((ee_0)object).soLuong;
        }
        return var_int_arr_for[0];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void void_do(short var0) {
        block34: {
            block35: {
                if (!AutoFarm.cfr_renamed_4((int)AutoFarm.chuoiPhu.equals(""))) break block34;
                if ((AutoFarm.var_short_arr_do != null) && !(AutoFarm.var_int_arr_if == null)) break block35;
                var1_5 = "";
                var2_7 /* !! */  = TienIchGame.java_lang_String_arr_do(AutoFarm.chuoiPhu, ",");
                AutoFarm.var_short_arr_do = new short[var2_7 /* !! */ .length];
                AutoFarm.var_int_arr_if = new int[var2_7 /* !! */ .length];
                var3_8 = AutoFarm.var_int_arr_for[0];
                while ((var3_8 < var2_7 /* !! */ .length)) {
                    block33: {
                        var4_9 = var2_7 /* !! */ [var3_8].trim();
                        try {
                            if ((var4_9.indexOf(AutoFarm.var_int_arr_for[40]) != AutoFarm.var_int_arr_for[1])) {
                                var5_12 = TienIchGame.java_lang_String_arr_do(var4_9, ":");
                                var4_10 = Short.parseShort(var5_12[AutoFarm.var_int_arr_for[0]].trim());
                                var5_11 = Integer.parseInt(var5_12[AutoFarm.var_int_arr_for[2]].trim());
                                if (" ".length() == -" ".length()) {
                                    return;
                                }
                            } else {
                                var4_10 = Short.parseShort(var4_9);
                                var5_11 = AutoFarm.var_int_arr_for[1];
                            }
                            AutoFarm.var_int_arr_if[var3_8] = var5_11;
                            if ((var4_10 >= 0) && (bz.ex_do(var4_10) != null)) {
                                AutoFarm.var_short_arr_do[var3_8] = var4_10;
                                v0 = new StringBuffer().append(var1_5);
                                if (AutoFarm.cfr_renamed_4((int)var1_5.equals(""))) {
                                    v1 = ",";
                                    if (((156 + 169 - 124 + 2 ^ 10 + 49 - 6 + 78) & (80 ^ 38 ^ (165 ^ 155) ^ -" ".length())) > "  ".length()) {
                                        return;
                                    }
                                } else {
                                    v1 = "";
                                }
                                v2 = v0.append(v1).append(AutoFarm.var_short_arr_do[var3_8]);
                                if ((AutoFarm.var_int_arr_if[var3_8] >= 0)) {
                                    v3 = ":" + AutoFarm.var_int_arr_if[var3_8];
                                    if (((6 ^ 84 ^ (52 ^ 40)) & (84 ^ 99 ^ (39 ^ 94) ^ -" ".length())) != 0) {
                                        return;
                                    }
                                } else {
                                    v3 = "";
                                }
                                var1_5 = v2.append(v3).toString();
                                if ((77 ^ 73) <= "  ".length()) {
                                    return;
                                }
                                break block33;
                            }
                            AutoFarm.var_short_arr_do[var3_8] = AutoFarm.var_int_arr_for[1];
                        }
                        catch (NumberFormatException v4) {
                            AutoFarm.var_short_arr_do[var3_8] = AutoFarm.var_int_arr_for[1];
                            AutoFarm.var_int_arr_if[var3_8] = AutoFarm.var_int_arr_for[1];
                        }
                        if ("   ".length() == 0) {
                            return;
                        }
                    }
                    ++var3_8;
                    if ("  ".length() > ((188 ^ 167) & ~(142 ^ 149))) continue;
                    return;
                }
                if (AutoFarm.cfr_renamed_4((int)AutoFarm.chuoiPhu.equals(var1_5))) {
                    AutoFarm.chuoiPhu = var1_5;
                    AutoFarm.cfr_renamed_9();
                }
            }
            if (!(AutoFarm.var_short_arr_do != null) || !AutoFarm.boolean_do(AutoFarm.var_short_arr_do.length)) break block34;
            var1_6 = AutoFarm.var_int_arr_for[0];
            while ((var1_6 < AutoFarm.var_short_arr_do.length)) {
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
                                                        if (!(AutoFarm.var_short_arr_do[var1_6] >= 0) || !AutoFarm.cfr_renamed_0((int)AutoFarm.boolean_do(AutoFarm.var_short_arr_do[var1_6]))) break block36;
                                                        if (!(AutoFarm.var_int_arr_if[var1_6] >= 0)) break block37;
                                                        var0_1 = bz.ex_do(AutoFarm.var_short_arr_do[var1_6]);
                                                        if (!(var0_1 != null)) break block38;
                                                        var0_2 = var0_1.var_short_do;
                                                        if (!(var0_2 < AutoFarm.var_int_arr_for[33])) break block39;
                                                        var2_7 /* !! */  = bz.fb_0_if(var0_2);
                                                        if (!(var2_7 /* !! */ != null) || !AutoFarm.cfr_renamed_0((int)var2_7 /* !! */ .dangChayAuto)) break block40;
                                                        if (!(dR.var_java_util_Vector_new != null)) break block41;
                                                        var0_3 = dR.ee_0_do(var2_7 /* !! */ .cfr_renamed_2);
                                                        if (!(var0_3 != null)) break block42;
                                                        v5 = var0_3.soLuong;
                                                        if (" ".length() > (125 + 23 - 125 + 108 ^ 7 + 5 - -15 + 108)) {
                                                            return;
                                                        }
                                                        break block43;
                                                    }
                                                    if (" ".length() == 0) {
                                                        return;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                if (!(dR.var_java_util_Vector_do != null) || !(var0_4 = dR.ee_0_if(var0_2) != null)) break block41;
                                                v5 = var0_4.soLuong;
                                                break block43;
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        if (!(var0_2 < AutoFarm.var_int_arr_for[22])) break block44;
                                        if (!(dR.var_java_util_Vector_do != null)) ** GOTO lbl-1000
                                        var2_7 /* !! */  = dR.ee_0_if(var0_2);
                                        if (!(var2_7 /* !! */ != null)) break block45;
                                        v5 = var2_7 /* !! */ .soLuong;
                                        if (-" ".length() > 0) {
                                            return;
                                        }
                                        break block43;
                                    }
                                    if (-"   ".length() > 0) {
                                        return;
                                    }
                                    ** GOTO lbl-1000
                                }
                                if ((dR.var_java_util_Vector_new != null) && (var2_7 /* !! */  = dR.ee_0_do(var0_2) != null)) {
                                    v5 = var2_7 /* !! */ .soLuong;
                                    if (" ".length() < 0) {
                                        return;
                                    }
                                } else lbl-1000:
                                // 5 sources

                                {
                                    v5 = AutoFarm.var_int_arr_for[0];
                                    }
                                break block43;
                            }
                            v5 = AutoFarm.var_int_arr_for[0];
                        }
                        if (!(v5 < AutoFarm.var_int_arr_if[var1_6])) break block36;
                    }
                    et_0.et_0_do().cfr_renamed_2(AutoFarm.var_short_arr_do[var1_6]);
                    return;
                }
                ++var1_6;
                if ("  ".length() > 0) continue;
                return;
            }
            return;
        }
        if ((var0 != AutoFarm.var_int_arr_for[1]) && AutoFarm.cfr_renamed_0((int)AutoFarm.boolean_do(var0))) {
            et_0.et_0_do().cfr_renamed_2(var0);
            return;
        }
        TienIchGame.void_if("Thiếu nguyên liệu nấu ăn!");
    }

    private static void cfr_renamed_23() {
        var_int_arr_for = new int[65];
        AutoFarm.var_int_arr_for[0] = (0x44 ^ 0x17 ^ (0x6B ^ 0x67)) & (0xB7 ^ 0x90 ^ (0xDB ^ 0xA3) ^ -" ".length());
        AutoFarm.var_int_arr_for[1] = -" ".length();
        AutoFarm.var_int_arr_for[2] = " ".length();
        AutoFarm.var_int_arr_for[3] = 0xBB ^ 0xA2;
        AutoFarm.var_int_arr_for[4] = 158 + 77 - 213 + 155 ^ 30 + 44 - -41 + 37;
        AutoFarm.var_int_arr_for[5] = -"  ".length();
        AutoFarm.var_int_arr_for[6] = "  ".length();
        AutoFarm.var_int_arr_for[7] = 0x34 ^ 0x7C ^ (0x7B ^ 0x38);
        AutoFarm.var_int_arr_for[8] = -"   ".length();
        AutoFarm.var_int_arr_for[9] = -(0xD ^ 0x41 ^ 68 + 32 - -9 + 18);
        AutoFarm.var_int_arr_for[10] = 0x5D ^ 0x6F ^ " ".length();
        AutoFarm.var_int_arr_for[11] = -(0xE4 ^ 0x97 ^ (0xD ^ 0x49));
        AutoFarm.var_int_arr_for[12] = 0x18 ^ 0x51 ^ (0xCF ^ 0xB1);
        AutoFarm.var_int_arr_for[13] = -(122 + 138 - 158 + 57 ^ 73 + 29 - 95 + 156);
        AutoFarm.var_int_arr_for[14] = 2 ^ 0x45 ^ (0x4B ^ 0x30);
        AutoFarm.var_int_arr_for[15] = 0xBC ^ 0xA7 ^ (0x70 ^ 0x6E);
        AutoFarm.var_int_arr_for[16] = "   ".length();
        AutoFarm.var_int_arr_for[17] = 66 + 56 - 13 + 68 ^ 160 + 60 - 119 + 68;
        AutoFarm.var_int_arr_for[18] = 0x35 ^ 0x4F;
        AutoFarm.var_int_arr_for[19] = 0x50 ^ 5 ^ (0x3A ^ 0x4B);
        AutoFarm.var_int_arr_for[20] = 0xEE ^ 0x95;
        AutoFarm.var_int_arr_for[21] = 0x94 ^ 0xB1;
        AutoFarm.var_int_arr_for[22] = 159 + 96 - 205 + 204 ^ 93 + 118 - 140 + 83;
        AutoFarm.var_int_arr_for[23] = 0x4C ^ 0x34;
        AutoFarm.var_int_arr_for[24] = 0x71 ^ 3 ^ (0x5E ^ 0xE);
        AutoFarm.var_int_arr_for[25] = 0x53 ^ 0x55;
        AutoFarm.var_int_arr_for[26] = 0x9C ^ 0x93;
        AutoFarm.var_int_arr_for[27] = 0x35 ^ 0x5C ^ (0xE5 ^ 0x86);
        AutoFarm.var_int_arr_for[28] = 1 ^ 5;
        AutoFarm.var_int_arr_for[29] = 0xBC ^ 0xC0;
        AutoFarm.var_int_arr_for[30] = 1 ^ 8;
        AutoFarm.var_int_arr_for[31] = 131 + 21 - -32 + 27 ^ 132 + 4 - 7 + 59;
        AutoFarm.var_int_arr_for[32] = 0xE7 ^ 0x9E ^ (0x71 ^ 0x7C);
        AutoFarm.var_int_arr_for[33] = 0x7E ^ 0x4C;
        AutoFarm.var_int_arr_for[34] = 0xFE ^ 0xAE;
        AutoFarm.var_int_arr_for[35] = 0x4C ^ 0x13;
        AutoFarm.var_int_arr_for[36] = 0xC0 ^ 0x95;
        AutoFarm.var_int_arr_for[37] = 0xB ^ 0x15;
        AutoFarm.var_int_arr_for[38] = 0x46 ^ 0x72;
        AutoFarm.var_int_arr_for[39] = 80 + 72 - 83 + 106 ^ 140 + 122 - 211 + 102;
        AutoFarm.var_int_arr_for[40] = 104 + 86 - 94 + 38 ^ 146 + 126 - 266 + 182;
        AutoFarm.var_int_arr_for[41] = 0x31 ^ 0xA;
        AutoFarm.var_int_arr_for[42] = 0x39 ^ 0x2F ^ (0x8E ^ 0xA5);
        AutoFarm.var_int_arr_for[43] = 0xC1 ^ 0x81 ^ (0x59 ^ 0x6C);
        AutoFarm.var_int_arr_for[44] = 0 ^ 0x76;
        AutoFarm.var_int_arr_for[45] = 0x13 ^ 0x64;
        AutoFarm.var_int_arr_for[46] = 0x5E ^ 0x27;
        AutoFarm.var_int_arr_for[47] = 0 ^ 0x35;
        AutoFarm.var_int_arr_for[48] = 172 + 97 - 149 + 54 ^ 40 + 133 - 159 + 136;
        AutoFarm.var_int_arr_for[49] = -(0xB ^ 0x47 ^ (0xE ^ 0x70));
        AutoFarm.var_int_arr_for[50] = 0xFFFFBFF7 & 0xE8C8;
        AutoFarm.var_int_arr_for[51] = -(0xFFFF8DDE & 0x7A27) & (0xFFFFCBED & 0x3D7F);
        AutoFarm.var_int_arr_for[52] = 0xFFFFB8D1 & 0x7F6E;
        AutoFarm.var_int_arr_for[53] = 0xFFFF93DE & 0x6EF1;
        AutoFarm.var_int_arr_for[54] = 100 + 172 - 242 + 210;
        AutoFarm.var_int_arr_for[55] = -(0xFFFFF903 & 0x16FE) & (0xFFFFF7F3 & 0x3F6D);
        AutoFarm.var_int_arr_for[56] = 74 + 3 - 48 + 100 ^ 151 + 104 - 124 + 26;
        AutoFarm.var_int_arr_for[57] = 0xFFFFFF32 & 0x27DD;
        AutoFarm.var_int_arr_for[58] = 0xFFFFC7F9 & 0x3BEE;
        AutoFarm.var_int_arr_for[59] = 0x16 ^ 0x3A ^ (0x9D ^ 0xB6);
        AutoFarm.var_int_arr_for[60] = 0x6F ^ 0x67;
        AutoFarm.var_int_arr_for[61] = 0xDB ^ 0xB8;
        AutoFarm.var_int_arr_for[62] = 0x3E ^ 0x13;
        AutoFarm.var_int_arr_for[63] = 0xFFFFF574 & 0x7FBB;
        AutoFarm.var_int_arr_for[64] = -(126 + 38 - 160 + 248) & (0xFFFFFFFB & 0x7DFF);
    }

    protected static void cfr_renamed_8() {
        if ((AngelChip.duLieuNguoiChoi.var_short_goto != dR.var_int_goto)) {
            return;
        }
        if ((var_int_else <= 0)) {
            return;
        }
        if ((var_short_arr_if != null) && AutoFarm.boolean_do(var_short_arr_if.length)) {
            int n = var_int_arr_for[0];
            while ((n < var_short_arr_if.length)) {
                block20: {
                    ee_0 ee_02;
                    short s2 = var_short_arr_if[n];
                    int n2 = var_int_arr_for[0];
                    while ((n2 < dR.var_java_util_Vector_do.size())) {
                        ee_02 = (ee_0)dR.var_java_util_Vector_do.elementAt(n2);
                        if ((ee_02 != null) && (!(s2 != var_int_arr_for[1]) || (ee_02.var_short_if == s2)) && AutoFarm.boolean_do(ee_02.soLuong) && (ee_02.soLuong >= var_int_goto) && (!(ee_02.var_short_if < var_int_arr_for[33]) || (bz.fb_0_if(ee_02.var_short_if) != null))) {
                            et_0.et_0_do().cfr_renamed_3(ee_02.var_short_if);
                            if ((TienIchGame.cfr_renamed_6(15000L) ? 1 : 0 != null)) {
                                int n3;
                                TienIchGame.void_if(500L);
                                ft_0 ft_02 = ft_0.ft_0_do();
                                int n4 = var_int_arr_for[56];
                                byte by2 = var_int_arr_for[0];
                                if ((var_int_else > ee_02.soLuong)) {
                                    n3 = ee_02.soLuong;
                                    if ("  ".length() == 0) {
                                        return;
                                    }
                                } else {
                                    n3 = var_int_else;
                                }
                                ft_02.cfr_renamed_1(n4, by2, String.valueOf(n3));
                                if ((TienIchGame.cfr_renamed_13(5000L) ? 1 : 0 != null)) {
                                    TienIchGame.void_if(500L);
                                }
                            }
                            if (!AutoFarm.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0)) break block20;
                        }
                        ++n2;
                        if (-" ".length() <= 0) continue;
                        return;
                    }
                    n2 = var_int_arr_for[0];
                    while ((n2 < dR.var_java_util_Vector_new.size())) {
                        ee_02 = (ee_0)dR.var_java_util_Vector_new.elementAt(n2);
                        if ((ee_02 != null) && (!(s2 != var_int_arr_for[1]) || (ee_02.var_short_if == s2)) && AutoFarm.boolean_do(ee_02.soLuong) && (ee_02.soLuong >= var_int_goto) && (dR.dg_0_do(ee_02.var_short_if) != null)) {
                            et_0.et_0_do().cfr_renamed_3(ee_02.var_short_if);
                            if ((TienIchGame.cfr_renamed_6(15000L) ? 1 : 0 != null)) {
                                int n5;
                                TienIchGame.void_if(500L);
                                ft_0 ft_03 = ft_0.ft_0_do();
                                int n6 = var_int_arr_for[56];
                                byte by3 = var_int_arr_for[0];
                                if ((var_int_else > ee_02.soLuong)) {
                                    n5 = ee_02.soLuong;
                                    if ((0x59 ^ 0x5D) > (0x1D ^ 0x19)) {
                                        return;
                                    }
                                } else {
                                    n5 = var_int_else;
                                }
                                ft_03.cfr_renamed_1(n6, by3, String.valueOf(n5));
                                if ((TienIchGame.cfr_renamed_13(5000L) ? 1 : 0 != null)) {
                                    TienIchGame.void_if(500L);
                                }
                            }
                            if (!AutoFarm.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0)) break;
                        }
                        ++n2;
                        if (-(0xC6 ^ 0xC2) < 0) continue;
                        return;
                    }
                }
                ++n;
                if (((8 ^ 0x37) & ~(0x93 ^ 0xAC)) <= 0) continue;
                return;
            }
        }
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public boolean boolean_do(String string) {
        block28: {
            block26: {
                block25: {
                    String[] stringArray;
                    block27: {
                        if (!(string.startsWith("Nông trại của bạn hiện tại đang có ") ? 1 : 0 != null)) break block26;
                        stringArray = TienIchGame.java_lang_String_arr_do(string, "Nông trại của bạn hiện tại đang có ");
                        if (!(string.indexOf(" đơn vị cá") != var_int_arr_for[1])) break block27;
                        String[] stringArray2 = TienIchGame.java_lang_String_arr_do(stringArray[var_int_arr_for[2]], " đơn vị cá");
                        try {
                            this.cfr_renamed_5 = Integer.parseInt(stringArray2[var_int_arr_for[0]]);
                        }
                        catch (NumberFormatException numberFormatException) {
                            this.cfr_renamed_5 = var_int_arr_for[1];
                            if (((45 + 86 - 126 + 131 ^ 149 + 87 - 119 + 54) & (0x10 ^ 0x36 ^ (0xB2 ^ 0xB7) ^ -" ".length())) != 0) {
                                return ((0x4E ^ 8 ^ (0xF4 ^ 0x84)) & (29 + 110 - 119 + 136 ^ 149 + 120 - 194 + 95 ^ -" ".length())) != 0;
                            }
                            break block25;
                        }
                        break block25;
                    }
                    if ((string.indexOf(" đơn vị vật nuôi") != var_int_arr_for[1])) {
                        String[] stringArray3 = TienIchGame.java_lang_String_arr_do(stringArray[var_int_arr_for[2]], " đơn vị vật nuôi");
                        try {
                            this.var_int_long = Integer.parseInt(stringArray3[var_int_arr_for[0]]);
                        }
                        catch (NumberFormatException numberFormatException) {
                            this.var_int_long = var_int_arr_for[1];
                        }
                        if ("  ".length() != "  ".length()) {
                            return ((0x34 ^ 0x79 ^ (0xB4 ^ 0xC1)) & (0xF4 ^ 0xC3 ^ (0x5A ^ 0x55) ^ -" ".length())) != 0;
                        }
                    }
                }
                TienIchGame.void_int();
                return var_int_arr_for[2];
            }
            if (!(string.startsWith("Bạn có muốn nâng cấp cây khế") ? 1 : 0 != null)) break block28;
            int n = string.indexOf(" với ");
            int n2 = string.indexOf(" xu");
            string = string.substring(n + " với ".length(), n2);
            try {
                this.var_int_if = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                this.var_int_if = var_int_arr_for[0];
            }
            if (((0x4B ^ 0x43 ^ "  ".length()) & (7 + 4 - -110 + 21 ^ 124 + 68 - 156 + 96 ^ -" ".length())) != ((103 + 153 - 239 + 219 ^ 20 + 160 - 143 + 149) & (0x59 ^ 0x32 ^ (0x86 ^ 0xBB) ^ -" ".length()))) {
                return ((1 + 83 - -73 + 49 ^ 97 + 36 - 47 + 58) & (0x5D ^ 0x2A ^ (0x69 ^ 0x40) ^ -" ".length())) != 0;
            }
            TienIchGame.cfr_renamed_8();
            return var_int_arr_for[2];
        }
        if (!!(string.startsWith("Bạn chỉ có thể mua tối đa")) || (string.startsWith("Bạn đã mua vật phẩm thành công") ? 1 : 0 != null)) {
            TienIchGame.this();
            return var_int_arr_for[2];
        }
        if (!!(string.startsWith("Bạn không thể mua thêm")) || (string.equals("Hồ cá đã đầy") ? 1 : 0 != null)) {
            TienIchGame.cfr_renamed_13();
            return var_int_arr_for[2];
        }
        if ((string.startsWith("Chúc mừng bạn đã bán") ? 1 : 0 != null) && (string.indexOf("Bạn còn lại") != var_int_arr_for[1])) {
            TienIchGame.cfr_renamed_12();
            return var_int_arr_for[2];
        }
        if ((var_boolean_else ? 1 : 0 != null) && (fh.var_int_char == var_int_arr_for[3])) {
            if ((gW.dangChayAuto ? 1 : 0 != null) && (string.startsWith("Bạn cần có điểm luyện rồng để luyện rồng") ? 1 : 0 != null)) {
                gW.void_do();
                return var_int_arr_for[2];
            }
            if ((string.equals("Chúc mừng bạn đã hoàn thành nhiệm vụ này") ? 1 : 0 != null)) {
                this.dangChayAuto = var_int_arr_for[2];
                TienIchGame.void_int();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("Luyện rồng thành công") ? 1 : 0 != null)) {
                this.coKichHoat = var_int_arr_for[2];
                TienIchGame.void_int();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("Luyện rồng thất bại") ? 1 : 0 != null)) {
                this.coKichHoat = var_int_arr_for[0];
                TienIchGame.void_int();
                return var_int_arr_for[2];
            }
        }
        if ((cfr_renamed_12 ? 1 : 0 != null) && (fh.var_int_char == var_int_arr_for[3])) {
            if ((gW.dangChayAuto ? 1 : 0 != null) && (string.startsWith("Chức năng chỉ dành cho nông trại đã đủ") ? 1 : 0 != null)) {
                gW.void_do();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("Chúc mừng bạn đã giao thành công đơn hàng") ? 1 : 0 != null)) {
                TienIchGame.void_int();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("đơn hàng này đã giao xong") ? 1 : 0 != null)) {
                TienIchGame.void_int();
                return var_int_arr_for[2];
            }
            if ((string.startsWith("Bạn không đủ nguyên liệu") ? 1 : 0 != null)) {
                this.var_boolean_int = var_int_arr_for[2];
                TienIchGame.void_int();
                return var_int_arr_for[2];
            }
        }
        if (!(string.indexOf("điểm chuyên cần") == var_int_arr_for[1]) || !!(string.startsWith("Bạn đã nhận quà báo danh")) || (string.indexOf("hoàn thành") != var_int_arr_for[1])) {
            TienIchGame.void_int();
            return var_int_arr_for[2];
        }
        return super.boolean_do(string);
    }

    public AutoFarm(byte by2, Object object) {
        this.soLuong = by2;
        this.var_java_lang_Object_do = object;
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public void void_do() {
        if ((this.soLuong != null) && (AutoController.nhiemVuHienTai != null)) {
            return;
        }
        if ((this.soLuong == var_int_arr_for[5])) {
            if ((this.var_java_lang_Object_do != null)) {
                Object object = (co)this.var_java_lang_Object_do;
                if (AutoFarm.cfr_renamed_4(((co)object).cfr_renamed_0) && AutoFarm.cfr_renamed_4(((co)object).cfr_renamed_2)) {
                    object = "cuốc hết đất";
                    if ("   ".length() < 0) {
                        return;
                    }
                } else if (AutoFarm.boolean_do(((co)object).cfr_renamed_0) && AutoFarm.cfr_renamed_4(((co)object).cfr_renamed_2)) {
                    object = "làm đất từ ô " + ((co)object).cfr_renamed_0 + " đến hết";
                    } else if (AutoFarm.cfr_renamed_4(((co)object).cfr_renamed_0) && AutoFarm.boolean_do(((co)object).cfr_renamed_2)) {
                    object = "làm đất từ ô 1 đến ô " + ((co)object).cfr_renamed_2;
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                } else {
                    object = "làm đất từ ô " + ((co)object).cfr_renamed_0 + " đến ô " + ((co)object).cfr_renamed_2;
                }
                TienIchGame.cfr_renamed_1("Đồng ý", "Bạn có chắc muốn " + (String)object + "?\n(Cây cũ sẽ bị phá nếu có)", new AutoFarm(var_int_arr_for[6], this.var_java_lang_Object_do));
                return;
            }
            AutoFarm.cfr_renamed_22();
            return;
        }
        if ((this.soLuong == var_int_arr_for[7]) && (this.var_java_lang_Object_do != null)) {
            byte by2 = (Byte)this.var_java_lang_Object_do;
            if ((by2 == var_int_arr_for[8])) {
                TienIchGame.cfr_renamed_1("Đồng ý", "Bạn có chắc muốn bán hết Bò, Cừu và Dê không?", new AutoFarm(var_int_arr_for[7], new Byte(var_int_arr_for[5])));
                return;
            }
            if ((by2 == var_int_arr_for[9])) {
                TienIchGame.cfr_renamed_1("Đồng ý", "Bạn có chắc muốn bán hết Bò không?", new AutoFarm(var_int_arr_for[7], new Byte(var_int_arr_for[10])));
                return;
            }
            if ((by2 == var_int_arr_for[11])) {
                TienIchGame.cfr_renamed_1("Đồng ý", "Bạn có chắc muốn bán hết Cừu không?", new AutoFarm(var_int_arr_for[7], new Byte(var_int_arr_for[12])));
                return;
            }
            if ((by2 == var_int_arr_for[13])) {
                TienIchGame.cfr_renamed_1("Đồng ý", "Bạn có chắc muốn bán hết Dê không?", new AutoFarm(var_int_arr_for[7], new Byte(var_int_arr_for[14])));
                return;
            }
        }
        this.cfr_renamed_12();
        AutoController.cfr_renamed_1(this);
    }

    private static void cfr_renamed_24() {
        int n = var_int_arr_for[32];
        while (AutoFarm.boolean_do(n, var_int_arr_for[45])) {
            AutoFarm.void_do(n, var_int_arr_for[2]);
            ++n;
            if (((0x21 ^ 0x16 ^ (0x68 ^ 0x4A)) & (0x1D ^ 0x7A ^ (0x74 ^ 6) ^ -" ".length())) == 0) continue;
            return;
        }
        n = var_int_arr_for[0];
        int n2 = var_int_arr_for[0];
        int n3 = var_int_arr_for[0];
        while ((n3 < dR.var_java_util_Vector_byte.size())) {
            hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n3);
            if ((hs2 != null)) {
                if ((hs2.coKichHoat ? 1 : 0 != null)) {
                    int n4;
                    switch (hs2.cfr_renamed_9) {
                        case 54: 
                        case 59: {
                            n4 = var_int_arr_for[32];
                            if ((0xC1 ^ 0xC5) <= (0x5D ^ 0x59)) break;
                            return;
                        }
                        case 50: 
                        case 56: {
                            n4 = var_int_arr_for[43];
                            if (null == null) break;
                            return;
                        }
                        case 51: 
                        case 52: 
                        case 55: 
                        case 58: 
                        case 60: 
                        case 61: {
                            n4 = var_int_arr_for[44];
                            if (((0x37 ^ 0x60) & ~(0x54 ^ 3)) == 0) break;
                            return;
                        }
                        case 53: {
                            n4 = var_int_arr_for[45];
                            if ("  ".length() > -" ".length()) break;
                            return;
                        }
                        default: {
                            n4 = var_int_arr_for[1];
                        }
                    }
                    if ((n4 != var_int_arr_for[1])) {
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, n4);
                        if ((TienIchGame.boolean_if(5000L) ? 1 : 0 != null)) {
                            ++n;
                            (hs2, "No bụng" == null);
                            TienIchGame.void_if(500L);
                            } else {
                            ++n2;
                            if (((0x65 ^ 0x5C) & ~(0x4F ^ 0x76)) != 0) {
                                return;
                            }
                        }
                    } else {
                        (hs2, "Chưa hỗ trợ" == null);
                        if (-(190 + 89 - 152 + 71 ^ 24 + 144 - 152 + 178) >= 0) {
                            return;
                        }
                    }
                } else {
                    (hs2, "Không đói" == null);
                }
            }
            ++n3;
            if ("  ".length() > -" ".length()) continue;
            return;
        }
        if (AutoFarm.boolean_do(n2)) {
            TienIchGame.cfr_renamed_1("Có", "Có lỗi xảy ra! Chưa cho ăn xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[59], null));
            return;
        }
        if (AutoFarm.boolean_do(n)) {
            GameCanvas.hienThongBaoPopup("Đã cho ăn xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Không con nào đói!");
    }

            /*
     * WARNING - void declaration
     */
    protected static void (boolean bl == null) {
        while ((var_boolean_goto ? 1 : 0 != null)) {
            void fy2;
            int n;
            int n2;
            Object object;
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
            int n3 = calendar.get(var_int_arr_for[15]);
            int n4 = calendar.get(var_int_arr_for[7]);
            if (!(var_java_util_Hashtable_do.isEmpty()) && AutoFarm.cfr_renamed_0(var_java_util_Hashtable_do.containsKey(object = new Integer(AngelChip.duLieuNguoiChoi.var_short_goto)) ? 1 : 0)) {
                n2 = (Integer)var_java_util_Hashtable_do.get(object);
                } else {
                n2 = n = var_int_arr_for[1];
            }
            if (!(cfr_renamed_7 != var_int_arr_for[1]) || (n != var_int_arr_for[1]) && (!(n != n3) || !(n4 > var_int_arr_for[15]))) break;
            if (AutoFarm.cfr_renamed_0((int)fy2)) {
                TienIchGame.void_if("Nhiệm vụ ấp trứng rồng");
            }
            AutoFarm.this();
            if (!!(var_java_util_Vector_if.isEmpty())) break;
            object = AutoFarm.fy_do("Rồng Ngũ Hành");
            var_java_util_Vector_if.removeAllElements();
            if (!(object != null)) break;
            TienIchGame.void_if(100L);
            ((fy)object).cfr_renamed_1();
            if (!(gW.boolean_do() ? 1 : 0 != null)) break;
            object = AutoFarm.fy_do("Chức năng ấp rồng");
            var_java_util_Vector_if.removeAllElements();
            if (!(object != null)) break;
            TienIchGame.void_if(100L);
            ((fy)object).cfr_renamed_1();
            if (!(gW.boolean_do() ? 1 : 0 != null)) break;
            object = AutoFarm.fy_do("Nhận điểm ấp trứng");
            if ((object != null)) {
                var_java_util_Vector_if.removeAllElements();
                ((fy)object).cfr_renamed_1();
                if ((TienIchGame.cfr_renamed_8(10000L) ? 1 : 0 != null)) {
                    var_java_util_Hashtable_do.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n3));
                    }
                return;
            }
            if (AutoFarm.cfr_renamed_4((int)fy2)) {
                var_java_util_Vector_if.removeAllElements();
                return;
            }
            fy fy3 = AutoFarm.fy_do("Làm nhiệm vụ ấp trứng");
            var_java_util_Vector_if.removeAllElements();
            if ((fy3 != null)) {
                void var0_4;
                TienIchGame.void_if(100L);
                fy3.cfr_renamed_1();
                if (!(gW.boolean_do() ? 1 : 0 != null)) break;
                int n5 = var_int_arr_for[0];
                n4 = var_int_arr_for[0];
                while ((n4 < var_java_util_Vector_if.size())) {
                    fy fy4 = (fy)var_java_util_Vector_if.elementAt(n4);
                    if ((fy4 != null) && AutoFarm.cfr_renamed_4(fy4.chuoiGiaTri.toLowerCase().trim().endsWith("xong") ? 1 : 0)) {
                        fy4.cfr_renamed_1();
                        if (!(TienIchGame.cfr_renamed_8(7000L))) {
                            ++var0_4;
                        }
                    }
                    ++n4;
                    if ("  ".length() >= 0) continue;
                    return;
                }
                if (AutoFarm.cfr_renamed_4((int)var0_4)) {
                    int n6 = var_int_arr_for[0];
                    if (((0x72 ^ 0x31) & ~(0x83 ^ 0xC0)) > -" ".length()) continue;
                    return;
                }
                return;
            }
            if ((n4 > var_int_arr_for[15])) {
                var_java_util_Hashtable_do.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n3));
                return;
            }
            var_java_util_Hashtable_do.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n3 - var_int_arr_for[2]));
            break;
        }
    }

    public static void void_do(int n) {
        if (AutoFarm.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0)) {
            return;
        }
        gk_0 gk_02 = bz.gk_0_do(n);
        if ((gk_02 != null)) {
            if (AutoFarm.boolean_do(gk_02.mangSoNguyen[var_int_arr_for[0]])) {
                if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[0]] >= gk_02.mangSoNguyen[var_int_arr_for[0]])) {
                    et_0.et_0_do().cfr_renamed_1(gk_02, var_int_arr_for[2]);
                    if ((TienIchGame.boolean_if(5000L) ? 1 : 0 != null)) {
                        TienIchGame.void_if(500L);
                        return;
                    }
                }
            } else if (AutoFarm.boolean_do(gk_02.mangSoNguyen[var_int_arr_for[2]]) && !(var_boolean_long) && (!(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[6]] < gk_02.mangSoNguyen[var_int_arr_for[2]]) || (AngelChip.duLieuNguoiChoi.soLuong >= gk_02.mangSoNguyen[var_int_arr_for[2]]))) {
                et_0.et_0_do().cfr_renamed_1(gk_02, var_int_arr_for[6]);
                if ((TienIchGame.boolean_if(5000L) ? 1 : 0 != null)) {
                    TienIchGame.void_if(500L);
                }
            }
        }
    }

        public AutoFarm() {
        this.cfr_renamed_12();
        this.soLuong = var_int_arr_for[0];
        this.var_java_lang_Object_do = null;
    }

    protected static void (hs hs2, String string == null) {
        if ((hs2 != null) && (string != null) && !(string.equals(""))) {
            hs2.var_boolean_arr_do = (boolean[])new cU(var_int_arr_for[33], string, var_int_arr_for[0]);
            hs2.var_boolean_arr_do.void_do(hs2.coKichHoat ? 1 : 0, hs2.cfr_renamed_3 - var_int_arr_for[62]);
        }
    }

    protected static void cfr_renamed_13() {
        et_0.et_0_do().cfr_renamed_3(var_int_arr_for[0], var_int_arr_for[0]);
        TienIchGame.cfr_renamed_8(10000L);
        et_0.et_0_do().cfr_renamed_8(var_int_arr_for[0], var_int_arr_for[0]);
        TienIchGame.cfr_renamed_8(10000L);
        }

    public static void void_do(int n, int n2) {
        switch (n2) {
            case 1: {
                dg_0 dg_02;
                n2 = (dR.var_java_util_Vector_try, n == null);
                if (!(n2 < var_int_arr_for[61]) || !(dg_02 = dR.dg_0_do(n) != null)) break;
                n2 = var_int_arr_for[61] - n2;
                if (AutoFarm.boolean_do(dg_02.var_int_if)) {
                    if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[0]] >= dg_02.var_int_if * n2)) {
                        et_0.et_0_do().cfr_renamed_1((short)n, (byte)n2, var_int_arr_for[2]);
                        if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 != null)) {
                            TienIchGame.void_if(500L);
                            return;
                        }
                    }
                } else if (AutoFarm.boolean_do(dg_02.soLuong) && (!(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[6]] < dg_02.soLuong * n2) || (AngelChip.duLieuNguoiChoi.soLuong >= dg_02.soLuong * n2))) {
                    et_0.et_0_do().cfr_renamed_1((short)n, (byte)n2, var_int_arr_for[6]);
                    if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 != null)) {
                        TienIchGame.void_if(500L);
                    }
                }
                return;
            }
            case 2: {
                fb_0 fb_02;
                n2 = (dR.java_util_Vector_do(), n == null);
                if (!(n2 < var_int_arr_for[61]) || !(fb_02 = bz.fb_0_do(n) != null)) break;
                n2 = var_int_arr_for[61] - n2;
                if (AutoFarm.boolean_do((int)fb_02.var_short_arr_do[var_int_arr_for[0]])) {
                    if (!(AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[0]] >= fb_02.var_short_arr_do[var_int_arr_for[0]] * n2)) break;
                    et_0.et_0_do().cfr_renamed_1((short)n, (byte)n2, var_int_arr_for[2]);
                    if (!(TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 != null)) break;
                    TienIchGame.void_if(500L);
                    return;
                }
                if (!AutoFarm.boolean_do((int)fb_02.var_short_arr_do[var_int_arr_for[2]]) || !!(var_boolean_long) || (AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_for[6]] < fb_02.var_short_arr_do[var_int_arr_for[2]] * n2) && !(AngelChip.duLieuNguoiChoi.soLuong >= fb_02.var_short_arr_do[var_int_arr_for[2]] * n2)) break;
                et_0.et_0_do().cfr_renamed_1((short)n, (byte)n2, var_int_arr_for[6]);
                if (!(TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 != null)) break;
                TienIchGame.void_if(500L);
            }
        }
    }

    public static void (int n, byte by2, String[] stringArray == null) {
        if (!(var_java_util_Vector_if.isEmpty())) {
            var_java_util_Vector_if.removeAllElements();
        }
        int n2 = var_int_arr_for[0];
        while ((n2 < stringArray.length)) {
            var_java_util_Vector_if.addElement(new fy(stringArray[n2], new ej(n2, n, by2)));
            ++n2;
            if ("   ".length() != " ".length()) continue;
            return;
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public void void_do(String string) {
        if ((string.startsWith("Nông trại bạn đã được chăm sóc") ? 1 : 0 != null)) {
            this.coTrangThai = var_int_arr_for[2];
            TienIchGame.this();
            TienIchGame.cfr_renamed_13();
            if ((this.soLuong == 0) && (this.var_short_arr_do != null)) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.hienThongBao(16000L);
                return;
            }
            AutoController.tatAuto();
            TienIchGame.cfr_renamed_1("Bạn cài đặt chế độ Farm thường nhưng Lái buôn đang được kích hoạt cần phải đăng xuất để áp dụng!", new fl_0("Đăng xuất", var_int_arr_for[4], go_0.go_0_do()), GameCanvas.var_fl_0_do);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void cfr_renamed_9() {
        block12: {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeByte(var_byte_do);
                dataOutputStream.writeUTF(chuoiPhu);
                dataOutputStream.writeUTF(chuoiGiaTri);
                dataOutputStream.writeInt(var_int_char);
                dataOutputStream.writeByte(var_byte_if);
                dataOutputStream.writeByte(var_byte_for);
                dataOutputStream.writeBoolean(this);
                dataOutputStream.writeBoolean(bp_0.cfr_renamed_5);
                dataOutputStream.writeUTF(tenNhanVat);
                dataOutputStream.writeInt(var_int_goto);
                dataOutputStream.writeBoolean(var_boolean_char);
                dataOutputStream.writeInt(cfr_renamed_6);
                dataOutputStream.writeInt(var_int_else);
                dataOutputStream.writeBoolean(bp_0.var_boolean_new);
                dataOutputStream.writeBoolean(bp_0.var_boolean_int);
                dataOutputStream.writeBoolean(bp_0.coTrangThai);
                dataOutputStream.writeBoolean(var_boolean_goto);
                dataOutputStream.writeBoolean(var_boolean_else);
                dataOutputStream.writeBoolean(cfr_renamed_12);
                dataOutputStream.writeBoolean(var_boolean_long);
                dataOutputStream.flush();
                byteArrayOutputStream.flush();
                QuanLyRMS.docDuLieu("FarmSettings", byteArrayOutputStream.toByteArray());
            }
            catch (IOException iOException) {
                try {
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                    }
                catch (IOException iOException2) {
                    if ((0xA7 ^ 0xA3) == " ".length()) {
                        return;
                    }
                    break block12;
                }
                if (" ".length() <= ((0xAC ^ 0xAB ^ (7 ^ 0x51)) & (0x77 ^ 0x4D ^ (0xDC ^ 0xB7) ^ -" ".length()))) {
                    return;
                }
                break block12;
            }
            catch (Throwable throwable) {
                try {
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                    }
                catch (IOException iOException) {
                    throw throwable;
                }
                if ("  ".length() > 0) throw throwable;
                return;
            }
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                }
            catch (IOException iOException) {
                }
        }
        var_short_arr_do = null;
        var_int_arr_if = null;
        var_int_arr_int = null;
        AutoFarm.cfr_renamed_25();
    }

        private static void cfr_renamed_22() {
        GameCanvas.coKichHoat = var_int_arr_for[0];
        GameCanvas.var_fv_do = null;
        GameCanvas.cfr_renamed_7();
        ey_0[] ey_0Array = new ey_0[var_int_arr_for[6]];
        int n = var_int_arr_for[0];
        while ((n < var_int_arr_for[6])) {
            ey_0Array[n] = new ey_0();
            ey_0Array[n].void_do(var_int_arr_for[2]);
            ++n;
            if ((0xA ^ 0x31 ^ (0x1D ^ 0x23)) > 0) continue;
            return;
        }
        ey_0Array[var_int_arr_for[0]].cfr_renamed_0(var_int_arr_for[2]);
        fl_0 fl_02 = new fl_0(MenuChinhAvatar.aC, new dw_0(ey_0Array));
        el.cfr_renamed_1().cfr_renamed_1(ey_0Array, MenuChinhAvatar.y, var_java_lang_String_arr_arr_do, fl_02);
        GameCanvas.var_ez_do = el.cfr_renamed_1();
    }

        /*
     * WARNING - void declaration
     */
    protected final void (boolean bl != null) {
        block0: while ((var_boolean_else ? 1 : 0 != null)) {
            void fy2;
            int n;
            int n2;
            Integer n3;
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
            int n4 = calendar.get(var_int_arr_for[15]);
            int n5 = calendar.get(var_int_arr_for[7]);
            if (!(var_java_util_Hashtable_for.isEmpty()) && AutoFarm.cfr_renamed_0(var_java_util_Hashtable_for.containsKey(n3 = new Integer(AngelChip.duLieuNguoiChoi.var_short_goto)) ? 1 : 0)) {
                n2 = (Integer)var_java_util_Hashtable_for.get(n3);
                } else {
                n2 = n = var_int_arr_for[1];
            }
            if (!(cfr_renamed_7 != var_int_arr_for[1]) || (n != var_int_arr_for[1]) && (!(n != n4) || !(n5 > var_int_arr_for[15]))) break;
            if (AutoFarm.cfr_renamed_0((int)fy2)) {
                TienIchGame.void_if("Nhiệm vụ luyện rồng");
            }
            AutoFarm.this();
            if (!!(var_java_util_Vector_if.isEmpty())) break;
            fy fy3 = AutoFarm.fy_do("Rồng Ngũ Hành");
            var_java_util_Vector_if.removeAllElements();
            if (!(fy3 != null)) break;
            TienIchGame.void_if(100L);
            fy3.cfr_renamed_1();
            if (!(gW.boolean_do() ? 1 : 0 != null)) break;
            fy fy4 = AutoFarm.fy_do("Chức năng luyện rồng");
            var_java_util_Vector_if.removeAllElements();
            if (!(fy4 != null)) break;
            TienIchGame.void_if(100L);
            fy4.cfr_renamed_1();
            if (!(gW.boolean_do() ? 1 : 0 != null)) break;
            fy fy5 = AutoFarm.fy_do("Luyện rồng");
            var_ge_0_do = null;
            if ((fy5 != null)) {
                fy5.cfr_renamed_1();
                if ((gW.boolean_do() ? 1 : 0 != null) && (var_ge_0_do != null)) {
                    this.coKichHoat = var_int_arr_for[0];
                    var_ge_0_do.cfr_renamed_1();
                    if ((TienIchGame.cfr_renamed_8(10000L) ? 1 : 0 != null) && (this.coKichHoat ? 1 : 0 != null)) {
                        var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n4));
                        var_java_util_Vector_if.removeAllElements();
                        TienIchGame.void_if("Luyện rồng thành công");
                        return;
                    }
                }
            }
            fy fy6 = AutoFarm.fy_do("Làm nhiệm vụ luyện rồng");
            var_java_util_Vector_if.removeAllElements();
            if ((fy6 != null)) {
                void var1_10;
                void var1_8;
                TienIchGame.void_if(100L);
                fy6.cfr_renamed_1();
                if (!(gW.boolean_do() ? 1 : 0 != null)) break;
                if (!(var_java_util_Vector_int.isEmpty())) {
                    var_java_util_Vector_int.removeAllElements();
                }
                int n6 = var_int_arr_for[0];
                while (AutoFarm.cfr_renamed_4((int)var1_8, var_java_util_Vector_if.size())) {
                    fy fy7 = (fy)var_java_util_Vector_if.elementAt((int)var1_8);
                    if ((fy7 != null) && AutoFarm.cfr_renamed_4(fy7.chuoiGiaTri.toLowerCase().trim().endsWith("xong") ? 1 : 0)) {
                        var_java_util_Vector_int.addElement(fy7);
                    }
                    ++var1_8;
                    if ((115 + 137 - 210 + 101 ^ 85 + 32 - 92 + 114) >= 0) continue;
                    return;
                }
                if ((var_java_util_Vector_int.isEmpty() ? 1 : 0 != null)) {
                    if (!!(var_java_util_Vector_if.isEmpty()) || !(var_ge_0_do == null)) break;
                    if ((n5 > var_int_arr_for[15])) {
                        var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n4));
                        return;
                    }
                    var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n4 - var_int_arr_for[2]));
                    return;
                }
                int n7 = var_int_arr_for[0];
                while (AutoFarm.cfr_renamed_4((int)var1_10, var_java_util_Vector_int.size())) {
                    var_java_util_Vector_if.removeAllElements();
                    ((fy)var_java_util_Vector_int.elementAt((int)var1_10)).cfr_renamed_1();
                    if ((gW.boolean_do() ? 1 : 0 != null)) {
                        n5 = var_int_arr_for[0];
                        n4 = var_int_arr_for[0];
                        while ((n4 < var_java_util_Vector_if.size())) {
                            fy fy8 = (fy)var_java_util_Vector_if.elementAt(n4);
                            if ((fy8 != null)) {
                                if (AutoFarm.cfr_renamed_0(fy8.chuoiGiaTri.toLowerCase().trim().endsWith("xong") ? 1 : 0)) {
                                    ++n5;
                                    if ("   ".length() != "   ".length()) {
                                        return;
                                    }
                                } else {
                                    this.dangChayAuto = var_int_arr_for[0];
                                    fy8.cfr_renamed_1();
                                    if ((TienIchGame.cfr_renamed_8(7000L) ? 1 : 0 != null) && (this.dangChayAuto ? 1 : 0 != null)) {
                                        ++n5;
                                    }
                                }
                            }
                            ++n4;
                            if (((0x3D ^ 9) & ~(6 ^ 0x32)) >= -" ".length()) continue;
                            return;
                        }
                        if ((n5 >= var_int_arr_for[16])) {
                            int n8 = var_int_arr_for[0];
                            if (((132 + 8 - 53 + 80 ^ 55 + 73 - 127 + 136) & (177 + 64 - 233 + 174 ^ 114 + 88 - 91 + 41 ^ -" ".length())) == ((2 + 65 - 19 + 82 ^ 152 + 19 - 46 + 47) & (0x28 ^ 0x3C ^ (0x47 ^ 0x7D) ^ -" ".length()))) continue block0;
                            return;
                        }
                    }
                    ++var1_10;
                    if ("   ".length() != (0x14 ^ 0x10)) continue;
                    return;
                }
                return;
            }
            if ((n5 > var_int_arr_for[15])) {
                var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n4));
                return;
            }
            var_java_util_Hashtable_for.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n4 - var_int_arr_for[2]));
            break;
        }
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    protected static int[] int_arr_do() {
        int[] nArray = new int[var_int_arr_for[33]];
        int n = var_int_arr_for[0];
        while ((n < var_int_arr_for[33])) {
            Object object = bz.fb_0_if(n);
            if ((object != null) && AutoFarm.cfr_renamed_0(((fb_0)object).dangChayAuto ? 1 : 0)) {
                if ((dR.var_java_util_Vector_new != null)) {
                    object = dR.ee_0_do(((fb_0)object).cfr_renamed_2);
                    if ((object != null)) {
                        nArray[n] = ((ee_0)object).soLuong;
                    }
                    }
            } else if ((dR.var_java_util_Vector_do != null) && (object = dR.ee_0_if(n) != null)) {
                nArray[n] = ((ee_0)object).soLuong;
            }
            ++n;
            if ((0x23 ^ 0x10 ^ (0x35 ^ 3)) > 0) continue;
            return null;
        }
        return nArray;
    }

        protected static void cfr_renamed_14() {
        if (AutoFarm.boolean_do((int)dR.var_short_do)) {
            dR.dR_do().this();
            if (AutoFarm.cfr_renamed_0(TienIchGame.cfr_renamed_1(fo.fo_do()) ? 1 : 0)) {
                TienIchGame.void_if(1500L);
            }
            if ((dR.soLuongKhoa == 0)) {
                short s2 = dR.var_short_do;
                dR.dR_do().void_for(var_int_arr_for[6]);
                if ((TienIchGame.cfr_renamed_13(15000L) ? 1 : 0 != null)) {
                    AutoFarm.void_do(s2);
                    } else {
                    TienIchGame.void_if("Lỗi hoàn thành món ăn!");
                }
            }
            fo.fo_do().void_if();
            return;
        }
        if (!(chuoiPhu.equals(""))) {
            dR.dR_do().this();
            if (AutoFarm.cfr_renamed_0(TienIchGame.cfr_renamed_1(fo.fo_do()) ? 1 : 0)) {
                TienIchGame.void_if(1500L);
            }
            AutoFarm.void_do(var_int_arr_for[1]);
            fo.fo_do().void_if();
        }
    }

        private void cfr_renamed_17() {
        try {
            int n;
            int n2;
            AutoFarm.cfr_renamed_21();
            AutoFarm.void_do(var_int_arr_for[31], var_int_arr_for[2]);
            int n3 = var_int_arr_for[32];
            while (AutoFarm.boolean_do(n3, var_int_arr_for[29])) {
                AutoFarm.void_do(n3, var_int_arr_for[2]);
                ++n3;
                if (" ".length() == " ".length()) continue;
                return;
            }
            Object object = new boolean[var_int_arr_for[33]];
            int n4 = var_int_arr_for[0];
            while ((n4 < dR.var_java_util_Vector_int.size())) {
                es es2 = (es)dR.var_java_util_Vector_int.elementAt(n4);
                if ((es2 != null) && (es2.cfr_renamed_6 >= 0) && (es2.cfr_renamed_6 < var_int_arr_for[33]) && (object[es2.cfr_renamed_6] == 0)) {
                    object[es2.cfr_renamed_6] = var_int_arr_for[2];
                    AutoFarm.void_do(es2.cfr_renamed_6, var_int_arr_for[6]);
                }
                ++n4;
                if (-"   ".length() <= 0) continue;
                return;
            }
            if ((var_int_arr_int != null) && AutoFarm.boolean_do(var_int_arr_int.length)) {
                n4 = var_int_arr_for[0];
                while ((n4 < var_int_arr_int.length)) {
                    if ((var_int_arr_int[n4] >= 0) && (var_int_arr_int[n4] < var_int_arr_for[33]) && (object[var_int_arr_int[n4]] == 0)) {
                        object[AutoFarm.var_int_arr_int[n4]] = var_int_arr_for[2];
                        AutoFarm.void_do(var_int_arr_int[n4], var_int_arr_for[6]);
                    }
                    ++n4;
                    if ("   ".length() == "   ".length()) continue;
                    return;
                }
            }
            n4 = var_int_arr_for[0];
            int n5 = var_int_arr_for[0];
            while ((n5 < dR.var_java_util_Vector_int.size()) && !(this.coTrangThai)) {
                es es3 = (es)dR.var_java_util_Vector_int.elementAt(n5);
                object = es3;
                if ((es3.cfr_renamed_5 < var_int_arr_for[25]) && (object.cfr_renamed_6 != var_int_arr_for[1])) {
                    if ((n4 < var_int_arr_for[16]) && AutoFarm.boolean_do((int)object.var_byte_new) && AutoFarm.boolean_do((int)object.var_short_do, bz.fb_0_if((int)object.cfr_renamed_6).cfr_renamed_5 * var_int_arr_for[14] + var_int_arr_for[27]) && (!(object.var_byte_new > var_int_arr_for[34]) || AutoFarm.boolean_do(bz.fb_0_if((int)object.cfr_renamed_6).cfr_renamed_5 * var_int_arr_for[14] - var_int_arr_for[26], (int)object.var_short_do) && (object.var_byte_new < var_int_arr_for[35]))) {
                        n2 = var_int_arr_for[0];
                        while ((object.var_byte_new < var_int_arr_for[22]) && (n2 < var_int_arr_for[27]) && !(this.coTrangThai)) {
                            ++n2;
                            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n5, var_int_arr_for[31]);
                            if (!(TienIchGame.cfr_renamed_3(10000L))) {
                                ++n4;
                                if (!AutoFarm.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0) || !AutoFarm.cfr_renamed_3((dR.var_java_util_Vector_try, var_int_arr_for[31] == null))) break;
                                if (AutoFarm.boolean_do(n5)) {
                                    --n5;
                                }
                                AutoFarm.void_do(var_int_arr_for[31], var_int_arr_for[2]);
                                if (((0xA2 ^ 0xA9) & ~(0x55 ^ 0x5E)) != " ".length()) break;
                                return;
                            }
                            TienIchGame.void_if(500L);
                            if (((0x29 ^ 0x2F) & ~(0x6F ^ 0x69)) == 0) continue;
                            return;
                        }
                    }
                    if ((object.cfr_renamed_5 != var_int_arr_for[15])) {
                        if ((object.dangChayAuto ? 1 : 0 != null)) {
                            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n5, var_int_arr_for[20]);
                            if ((TienIchGame.cfr_renamed_3(15000L) ? 1 : 0 != null)) {
                                TienIchGame.void_if(500L);
                            }
                        }
                        if ((object.coKichHoat ? 1 : 0 != null)) {
                            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n5, var_int_arr_for[29]);
                            if ((TienIchGame.cfr_renamed_3(15000L) ? 1 : 0 != null)) {
                                TienIchGame.void_if(500L);
                            }
                        }
                    }
                }
                ++n5;
                if ("   ".length() != (0xB0 ^ 0x85 ^ (0x98 ^ 0xA9))) continue;
                return;
            }
            if ((this.coTrangThai ? 1 : 0 != null)) {
                return;
            }
            cfr_renamed_4 = var_int_arr_for[0];
            n5 = var_int_arr_for[0];
            object = new int[dR.var_java_util_Vector_int.size()];
            n2 = var_int_arr_for[0];
            while ((n2 < dR.var_java_util_Vector_int.size())) {
                es es4 = (es)dR.var_java_util_Vector_int.elementAt(n2);
                object[n2] = es4.cfr_renamed_6;
                if (!(es4.cfr_renamed_6 != var_int_arr_for[1]) || (es4.cfr_renamed_5 >= var_int_arr_for[15])) {
                    ++n5;
                    if ((es4.cfr_renamed_5 == var_int_arr_for[15])) {
                        et_0.et_0_do().cfr_renamed_5(dR.var_int_goto, n2);
                        cfr_renamed_4 += var_int_arr_for[2];
                    }
                }
                ++n2;
                if (-(0xC9 ^ 0xAE ^ (0xC1 ^ 0xA2)) <= 0) continue;
                return;
            }
            if (AutoFarm.boolean_do(n5)) {
                if (AutoFarm.boolean_do(cfr_renamed_4) && (TienIchGame.cfr_renamed_3(10000L) ? 1 : 0 != null)) {
                    AutoFarm.e_();
                }
                int[] nArray = AutoFarm.int_arr_do();
                n4 = var_int_arr_for[0];
                n5 = var_int_arr_for[0];
                while ((n5 < dR.var_java_util_Vector_int.size())) {
                    es es5 = (es)dR.var_java_util_Vector_int.elementAt(n5);
                    n = (object[n5], nArray == null);
                    if ((!(es5.cfr_renamed_5 < var_int_arr_for[25]) || (es5.cfr_renamed_6 == var_int_arr_for[1])) && (n != var_int_arr_for[1])) {
                        if ((es5.var_byte_for == var_int_arr_for[6])) {
                            es5.var_byte_int = (byte)var_int_arr_for[23];
                            if (-(0x6E ^ 0x6A) >= 0) {
                                return;
                            }
                        } else {
                            es5.var_byte_int = (byte)var_int_arr_for[24];
                        }
                        fh.var_short_arr_if[es5.soLuong * fh.var_short_if + es5.var_int_new] = es5.var_byte_int;
                        if ((es5.cfr_renamed_6 != var_int_arr_for[1])) {
                            et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n5, var_int_arr_for[1]);
                        }
                        es5.cfr_renamed_6 = var_int_arr_for[1];
                        et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n5, n);
                        ++n4;
                    }
                    ++n5;
                    if ("   ".length() > 0) continue;
                    return;
                }
                if (AutoFarm.boolean_do(n4) && (TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 != null)) {
                    TienIchGame.void_if(1000L);
                }
            }
            int n6 = var_int_arr_for[0];
            while ((n6 < dR.var_java_util_Vector_int.size())) {
                es es6 = (es)dR.var_java_util_Vector_int.elementAt(n6);
                if ((es6 != null) && (es6.cfr_renamed_6 != var_int_arr_for[1]) && (es6.cfr_renamed_5 < var_int_arr_for[15]) && (es6.var_byte_int != var_int_arr_for[21]) && (es6.var_byte_int != var_int_arr_for[20])) {
                    if ((es6.var_byte_for == var_int_arr_for[6])) {
                        es6.var_byte_int = (byte)var_int_arr_for[20];
                        if ((0x11 ^ 0x15) == " ".length()) {
                            return;
                        }
                    } else {
                        es6.var_byte_int = (byte)var_int_arr_for[21];
                    }
                    es6.coTrangThai = var_int_arr_for[0];
                    fh.var_short_arr_if[es6.soLuong * fh.var_short_if + es6.var_int_new] = es6.var_byte_int;
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n6, var_int_arr_for[22]);
                    if ((TienIchGame.cfr_renamed_3(2000L) ? 1 : 0 != null)) {
                        TienIchGame.void_if(500L);
                    }
                }
                ++n6;
                if (" ".length() == " ".length()) continue;
                return;
            }
            if ((this.coTrangThai ? 1 : 0 != null)) {
                return;
            }
            Vector<hs> vector = new Vector<hs>();
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
            while ((n14 < dR.var_java_util_Vector_byte.size()) && !(this.coTrangThai)) {
                hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n14);
                if ((hs2 != null)) {
                    if (!(hs2.cfr_renamed_12 > var_int_arr_for[36]) || AutoFarm.cfr_renamed_5(hs2.cfr_renamed_15, bz.gk_0_do((int)hs2.cfr_renamed_9).soLuong * var_int_arr_for[14] - var_int_arr_for[37]) && (hs2.cfr_renamed_12 < var_int_arr_for[35])) {
                        int n15 = var_int_arr_for[0];
                        while ((hs2.cfr_renamed_12 < var_int_arr_for[22]) && (n15 < var_int_arr_for[27]) && !(this.coTrangThai)) {
                            ++n15;
                            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, var_int_arr_for[18]);
                            if (!(TienIchGame.boolean_if(15000L))) {
                                if (!AutoFarm.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0) || !AutoFarm.cfr_renamed_3((dR.var_java_util_Vector_try, var_int_arr_for[18] == null))) break;
                                if (AutoFarm.boolean_do(n14)) {
                                    --n14;
                                }
                                AutoFarm.void_do(var_int_arr_for[18], var_int_arr_for[2]);
                                if (((76 + 138 - 123 + 111 ^ 180 + 175 - 295 + 132) & (0x7E ^ 0x4F ^ (0xB1 ^ 0x8A) ^ -" ".length())) == 0) break;
                                return;
                            }
                            TienIchGame.void_if(500L);
                            if ((0x93 ^ 0xBD ^ (0xEA ^ 0xC0)) >= 0) continue;
                            return;
                        }
                    }
                    if (!((hs2.cfr_renamed_9 != var_int_arr_for[38]) && (hs2.cfr_renamed_9 != var_int_arr_for[39]) && (hs2.cfr_renamed_9 != var_int_arr_for[40]) && (hs2.cfr_renamed_9 != var_int_arr_for[41]) && !(hs2.cfr_renamed_9 == var_int_arr_for[42]) || !AutoFarm.cfr_renamed_0(hs2.cfr_renamed_15, bz.gk_0_do((int)hs2.cfr_renamed_9).soLuong * var_int_arr_for[14]))) {
                        vector.addElement(hs2);
                        if ((hs2.cfr_renamed_9 == var_int_arr_for[38])) {
                            ++n4;
                            if (" ".length() != " ".length()) {
                                return;
                            }
                        } else if ((hs2.cfr_renamed_9 == var_int_arr_for[39])) {
                            ++n5;
                            if (-"   ".length() > 0) {
                                return;
                            }
                        } else if ((hs2.cfr_renamed_9 == var_int_arr_for[40])) {
                            ++n9;
                            if ("   ".length() != "   ".length()) {
                                return;
                            }
                        } else if ((hs2.cfr_renamed_9 == var_int_arr_for[41])) {
                            ++n8;
                            } else if ((hs2.cfr_renamed_9 == var_int_arr_for[42])) {
                            ++n13;
                        }
                    }
                    String string = "";
                    if ((hs2.coKichHoat ? 1 : 0 != null)) {
                        int n16;
                        switch (hs2.cfr_renamed_9) {
                            case 54: 
                            case 59: {
                                n16 = var_int_arr_for[32];
                                if (((0xF ^ 0x38 ^ (0xAB ^ 0x8F)) & (71 + 6 - -79 + 52 ^ 122 + 59 - 116 + 130 ^ -" ".length())) != " ".length()) break;
                                return;
                            }
                            case 50: 
                            case 56: {
                                n16 = var_int_arr_for[43];
                                if (null == null) break;
                                return;
                            }
                            case 51: 
                            case 52: 
                            case 55: 
                            case 58: 
                            case 60: 
                            case 61: {
                                n16 = var_int_arr_for[44];
                                if ("   ".length() > 0) break;
                                return;
                            }
                            case 53: {
                                n16 = var_int_arr_for[45];
                                if (((0x56 ^ 0x5D ^ (0x22 ^ 0x14)) & (91 + 117 - 77 + 1 ^ 84 + 183 - 156 + 74 ^ -" ".length())) <= " ".length()) break;
                                return;
                            }
                            default: {
                                n16 = var_int_arr_for[1];
                            }
                        }
                        if ((n16 != var_int_arr_for[1])) {
                            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, n16);
                            if ((TienIchGame.boolean_if(5000L) ? 1 : 0 != null)) {
                                string = string + "No bụng";
                                TienIchGame.void_if(500L);
                            }
                        }
                    }
                    if ((hs2.var_boolean_arr_do[var_int_arr_for[0]] != null)) {
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, var_int_arr_for[46]);
                        if ((TienIchGame.boolean_if(15000L) ? 1 : 0 != null)) {
                            if (!(string.equals(""))) {
                                string = string + ", ";
                            }
                            string = string + "khỏi tiêu chảy";
                            TienIchGame.void_if(500L);
                        }
                    }
                    if ((hs2.var_boolean_arr_do[var_int_arr_for[2]] != null)) {
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, var_int_arr_for[23]);
                        if ((TienIchGame.boolean_if(15000L) ? 1 : 0 != null)) {
                            if (!(string.equals(""))) {
                                string = string + ", ";
                            }
                            string = string + "khỏi cúm";
                            TienIchGame.void_if(500L);
                        }
                    }
                    if (!(string.equals(""))) {
                        (hs2, string == null);
                    }
                }
                ++n14;
                if ("   ".length() >= 0) continue;
                return;
            }
            if ((this.coTrangThai ? 1 : 0 != null)) {
                return;
            }
            if ((AngelChip.duLieuNguoiChoi.var_short_goto == dR.var_int_goto)) {
                n14 = var_int_arr_for[0];
                int n17 = var_int_arr_for[0];
                int n18 = var_int_arr_for[0];
                while ((n18 < dR.var_java_util_Vector_byte.size())) {
                    hs hs3 = (hs)dR.var_java_util_Vector_byte.elementAt(n18);
                    if (!(hs3.cfr_renamed_9 != var_int_arr_for[33]) || !(hs3.cfr_renamed_9 != var_int_arr_for[47]) || !(hs3.cfr_renamed_9 != var_int_arr_for[48]) || (hs3.cfr_renamed_9 == var_int_arr_for[42])) {
                        ++n14;
                        if ("  ".length() < 0) {
                            return;
                        }
                    } else if (!(hs3.cfr_renamed_9 != var_int_arr_for[38]) || !(hs3.cfr_renamed_9 != var_int_arr_for[40]) || (hs3.cfr_renamed_9 == var_int_arr_for[14])) {
                        n14 += 2;
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                    } else if (!(hs3.cfr_renamed_9 != var_int_arr_for[10]) || (hs3.cfr_renamed_9 == var_int_arr_for[12])) {
                        n14 += 3;
                        if ((" ".length() ^ (0x72 ^ 0x77)) != (0x30 ^ 0x2E ^ (0x84 ^ 0x9E))) {
                            return;
                        }
                    } else if (!(hs3.cfr_renamed_9 != var_int_arr_for[39]) || (hs3.cfr_renamed_9 == var_int_arr_for[41])) {
                        ++n17;
                    }
                    if (!(!AutoFarm.boolean_do(hs3.cfr_renamed_10) || (hs3.cfr_renamed_9 != var_int_arr_for[33]) && (hs3.cfr_renamed_9 != var_int_arr_for[10]) && (hs3.cfr_renamed_9 != var_int_arr_for[12]) && (hs3.cfr_renamed_9 != var_int_arr_for[48]) && !(hs3.cfr_renamed_9 == var_int_arr_for[14]))) {
                        hs3.cfr_renamed_10 = var_int_arr_for[0];
                        int n19 = var_int_arr_for[0];
                        if ((this.var_short_arr_do != null)) {
                            if ((this.var_short_arr_do instanceof AutoCauCa != null)) {
                                n19 = AutoCauCa.cfr_renamed_7;
                                } else if ((this.var_short_arr_do instanceof aj != null)) {
                                n19 = aj.var_int_if;
                                if ("  ".length() >= "   ".length()) {
                                    return;
                                }
                            } else if ((this.var_short_arr_do instanceof ex_0 != null)) {
                                n19 = ex_0.soLuong;
                            }
                        }
                        if (!(hs3.cfr_renamed_9 != var_int_arr_for[10]) || !(hs3.cfr_renamed_9 != var_int_arr_for[12]) || (hs3.cfr_renamed_9 == var_int_arr_for[14])) {
                            et_0.et_0_do().cfr_renamed_2(dR.var_int_goto, hs3.cfr_renamed_9);
                            dR.void_if(var_int_arr_for[49]);
                            if ((hs3.cfr_renamed_9 == var_int_arr_for[10]) && (var_int_arr_for[50] - hs3.cfr_renamed_15 < n19 + var_int_arr_for[51])) {
                                vector.addElement(hs3);
                                ++n10;
                                if ("  ".length() < " ".length()) {
                                    return;
                                }
                            } else if ((hs3.cfr_renamed_9 == var_int_arr_for[12]) && (var_int_arr_for[52] - hs3.cfr_renamed_15 < n19 + var_int_arr_for[53])) {
                                vector.addElement(hs3);
                                ++n11;
                                if (-"  ".length() > 0) {
                                    return;
                                }
                            } else if ((hs3.cfr_renamed_9 == var_int_arr_for[14]) && (var_int_arr_for[52] - hs3.cfr_renamed_15 < n19 + var_int_arr_for[54])) {
                                vector.addElement(hs3);
                                ++n12;
                            }
                        }
                        if (!(hs3.cfr_renamed_9 != var_int_arr_for[33]) || (hs3.cfr_renamed_9 == var_int_arr_for[48])) {
                            et_0.et_0_do().cfr_renamed_2(dR.var_int_goto, hs3.cfr_renamed_9);
                            dR.void_if(var_int_arr_for[9]);
                            if ((var_int_arr_for[55] - hs3.cfr_renamed_15 < n19 + var_int_arr_for[51])) {
                                vector.addElement(hs3);
                                if ((hs3.cfr_renamed_9 == var_int_arr_for[33])) {
                                    ++n7;
                                }
                                if ((hs3.cfr_renamed_9 == var_int_arr_for[48])) {
                                    ++n;
                                }
                            }
                        }
                    }
                    ++n18;
                    if ("   ".length() < (0x24 ^ 0x20)) continue;
                    return;
                }
                AutoFarm.cfr_renamed_14();
                if (AutoFarm.boolean_do((int)dR.var_e_0_do.cfr_renamed_3)) {
                    fn.fn_do().void_do();
                    TienIchGame.cfr_renamed_13(5000L);
                    }
                if ((this.var_short_arr_do != null)) {
                    if ((this.var_short_arr_do instanceof AutoCauCa != null)) {
                        AutoFarm.cfr_renamed_15();
                        if ((0x14 ^ 0xE ^ (0x7C ^ 0x62)) < 0) {
                            return;
                        }
                    } else if ((this.var_short_arr_do instanceof aj != null)) {
                        AutoFarm.cfr_renamed_6();
                        if (((" ".length() ^ (0x68 ^ 0x7F)) & (0xE ^ 0x63 ^ (0xD4 ^ 0xAF) ^ -" ".length())) != 0) {
                            return;
                        }
                    } else if ((this.var_short_arr_do instanceof ex_0 != null)) {
                        AutoFarm.cfr_renamed_10();
                    }
                }
                if (!(vector.isEmpty())) {
                    n18 = var_int_arr_for[0];
                    while ((n18 < vector.size())) {
                        hs hs4 = (hs)vector.elementAt(n18);
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, hs4.cfr_renamed_9);
                        if ((TienIchGame.boolean_if(15000L) ? 1 : 0 != null)) {
                            (hs4, "Bye bye T.T" == null);
                            TienIchGame.void_if(500L);
                        }
                        ++n18;
                        if (" ".length() > ((19 + 104 - 22 + 58 ^ 117 + 4 - 51 + 124) & (72 + 213 - 52 + 2 ^ 13 + 148 - 54 + 75 ^ -" ".length()))) continue;
                        return;
                    }
                }
                AutoFarm.cfr_renamed_8();
                this.cfr_renamed_7();
                if ((n14 < this.var_int_long)) {
                    n18 = this.var_int_long - n14;
                    switch (var_byte_for) {
                        case 0: {
                            n7 += n18;
                            if ((0x46 ^ 0x6A ^ (0x74 ^ 0x5C)) > ((94 + 65 - 8 + 35 ^ 91 + 70 - 134 + 140) & (0xC6 ^ 0x91 ^ (0xD9 ^ 0x93) ^ -" ".length()))) break;
                            return;
                        }
                        case 1: {
                            n += n18;
                            if (null == null) break;
                            return;
                        }
                        case 2: {
                            if (!(n18 >= var_int_arr_for[6])) break;
                            n4 += n18 / var_int_arr_for[6];
                        }
                    }
                }
                if ((n17 < this.cfr_renamed_5)) {
                    n18 = this.cfr_renamed_5 - n17;
                    if ((var_byte_if == 0)) {
                        n5 += n18;
                        if (-" ".length() >= "  ".length()) {
                            return;
                        }
                    } else if ((var_byte_if == var_int_arr_for[2])) {
                        n8 += n18;
                    }
                }
                if (!((n4 <= 0) && (n5 <= 0) && (n7 <= 0) && (n <= 0) && (n8 <= 0) && (n9 <= 0) && (n10 <= 0) && (n11 <= 0) && (n12 <= 0) && !AutoFarm.boolean_do(n13))) {
                    TienIchGame.void_if(1000L);
                    dR.dR_do().cfr_renamed_14();
                    TienIchGame.boolean_do(15000L);
                    if ((fh.var_int_char == var_int_arr_for[3])) {
                        if (AutoFarm.boolean_do(n4)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n4)) {
                                AutoFarm.void_do(var_int_arr_for[38]);
                                ++n18;
                                if ("  ".length() > ((0x16 ^ 0x5D) & ~(0x5A ^ 0x11))) continue;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n5)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n5)) {
                                AutoFarm.void_do(var_int_arr_for[39]);
                                ++n18;
                                if (" ".length() < "  ".length()) continue;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n7)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n7)) {
                                AutoFarm.void_do(var_int_arr_for[33]);
                                ++n18;
                                if (-" ".length() == -" ".length()) continue;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n)) {
                                AutoFarm.void_do(var_int_arr_for[48]);
                                ++n18;
                                if (-"   ".length() <= 0) continue;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n8)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n8)) {
                                AutoFarm.void_do(var_int_arr_for[41]);
                                ++n18;
                                if (" ".length() > 0) continue;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n9)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n9)) {
                                AutoFarm.void_do(var_int_arr_for[40]);
                                ++n18;
                                if (-" ".length() == -" ".length()) continue;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n10)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n10)) {
                                AutoFarm.void_do(var_int_arr_for[10]);
                                ++n18;
                                if (-((0xE9 ^ 0xA1) & ~(0xE7 ^ 0xAF) ^ (0x30 ^ 0x35)) < 0) continue;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n11)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n11)) {
                                AutoFarm.void_do(var_int_arr_for[12]);
                                ++n18;
                                if ((0x47 ^ 0 ^ (0x58 ^ 0x1B)) > " ".length()) continue;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n12)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n12)) {
                                AutoFarm.void_do(var_int_arr_for[14]);
                                ++n18;
                                return;
                            }
                        }
                        if (AutoFarm.boolean_do(n13)) {
                            n18 = var_int_arr_for[0];
                            while ((n18 < n13)) {
                                AutoFarm.void_do(var_int_arr_for[42]);
                                ++n18;
                                if ("   ".length() == "   ".length()) continue;
                                return;
                            }
                        }
                    }
                }
                if ((AngelChip.duLieuNguoiChoi.cfr_renamed_23 != var_int_arr_for[1]) && (!!(bp_0.cfr_renamed_5) || !!(bp_0.var_boolean_new) || (bp_0.coTrangThai ? 1 : 0 != null))) {
                    TienIchGame.void_if(1000L);
                    AutoController.cfr_renamed_1(new bp_0(), (NhiemVuAutoBase)this.var_short_arr_do);
                    return;
                }
            }
            }
        catch (Exception exception) {
            }
        if ((0x24 ^ 0x1E ^ (0x82 ^ 0xBD)) <= 0) {
            return;
        }
        if (AutoFarm.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0)) {
            return;
        }
        if ((this.var_short_arr_do != null)) {
            TienIchGame.void_if(1000L);
            AutoController.cfr_renamed_2();
            return;
        }
        AutoController.tatAuto();
        GameCanvas.hienThongBaoPopup("Đã chăm sóc xong!");
        TienIchGame.void_if("Đã xong việc");
    }

    private static void cfr_renamed_29() {
        int n = dR.var_int_goto;
        int n2 = var_int_arr_for[0];
        mangSoNguyen = new int[dR.var_java_util_Vector_int.size()];
        int n3 = var_int_arr_for[0];
        while ((n3 < dR.var_java_util_Vector_int.size())) {
            es es2 = (es)dR.var_java_util_Vector_int.elementAt(n3);
            if ((es2 != null)) {
                AutoFarm.mangSoNguyen[n3] = es2.cfr_renamed_6;
                if ((es2.cfr_renamed_5 == var_int_arr_for[15])) {
                    et_0.et_0_do().cfr_renamed_5(n, n3);
                    ++n2;
                }
            }
            ++n3;
            if (((0xFB ^ 0x91 ^ (0x29 ^ 0x15)) & (0x56 ^ 9 ^ (0x39 ^ 0x30) ^ -" ".length())) == 0) continue;
            return;
        }
        if (AutoFarm.boolean_do(n2)) {
            if (!(TienIchGame.cfr_renamed_3(5000L))) {
                TienIchGame.cfr_renamed_1("Có", "Có lỗi xảy ra! Chưa thu hoạch xong. Bạn có muốn thử lại không?", new AutoFarm(var_int_arr_for[25], null));
                if (" ".length() <= 0) {
                    return;
                }
            } else {
                TienIchGame.cfr_renamed_1("Đã thu hoạch xong!\nGieo hạt luôn không?", new fl_0("Gieo lại", new AutoFarm(var_int_arr_for[16], null)), new fl_0("Gieo mới", new dx_0()));
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
        } else {
            GameCanvas.hienThongBaoPopup("Không có trồng nào được thu hoạch!");
        }
        if ((AngelChip.duLieuNguoiChoi.var_short_goto == dR.var_int_goto) && AutoFarm.boolean_do((int)dR.var_e_0_do.cfr_renamed_3)) {
            fn.fn_do().void_do();
            TienIchGame.cfr_renamed_13(5000L);
            }
    }

        protected static void this() {
        fy fy2;
        int n;
        if (!(var_java_util_Vector_if.isEmpty())) {
            var_java_util_Vector_if.removeAllElements();
        }
        if (!(var_java_util_Vector_do.isEmpty())) {
            n = var_int_arr_for[0];
            while ((n < var_java_util_Vector_do.size())) {
                fy2 = (fy)var_java_util_Vector_do.elementAt(n);
                var_java_util_Vector_if.addElement(fy2);
                ++n;
                if ("   ".length() > ((0xB ^ 0x24) & ~(0x85 ^ 0xAA))) continue;
                return;
            }
        }
        if ((var_java_util_Vector_if.isEmpty() ? 1 : 0 != null)) {
            ft_0.ft_0_do().cfr_renamed_4(cfr_renamed_7);
            if ((gW.boolean_do() ? 1 : 0 != null)) {
                var_java_util_Vector_do.removeAllElements();
                n = var_int_arr_for[0];
                while ((n < var_java_util_Vector_if.size())) {
                    fy2 = (fy)var_java_util_Vector_if.elementAt(n);
                    var_java_util_Vector_do.addElement(fy2);
                    ++n;
                    if ((0x15 ^ 0x11) != -" ".length()) continue;
                    return;
                }
            }
        }
    }

    public String toString() {
        String string = "";
        switch (this.soLuong) {
            case 0: {
                string = "Auto farm";
                if (-(0x54 ^ 0x51) < 0) break;
                return null;
            }
            case 4: {
                string = "Bón phân";
                if (null == null) break;
                return null;
            }
            case 5: {
                string = "Diệt sâu cỏ";
                if (-" ".length() < 0) break;
                return null;
            }
            case 7: {
                string = "Cho vật nuôi ăn";
                if (" ".length() >= 0) break;
                return null;
            }
            case 9: {
                string = "Bơm thuốc bổ";
                if (" ".length() != -" ".length()) break;
                return null;
            }
            case 8: {
                string = "Chữa bệnh";
                if ("  ".length() >= 0) break;
                return null;
            }
            case 11: {
                string = "Bán vật nuôi";
                if (" ".length() != "  ".length()) break;
                return null;
            }
            case 1: {
                string = "Đang tưới nước";
            }
        }
        return string;
    }

    protected final void cfr_renamed_12() {
        super.cfr_renamed_16();
        this.cfr_renamed_5 = var_int_arr_for[1];
        this.var_int_long = var_int_arr_for[1];
        this.coTrangThai = var_int_arr_for[0];
        this.coKichHoat = this.var_boolean_int = var_int_arr_for[0];
        this.dangChayAuto = this.var_boolean_int;
        if (!(var_java_util_Vector_if.isEmpty())) {
            var_java_util_Vector_if.removeAllElements();
        }
    }

        static fy fy_do(String string) {
        if (!(var_java_util_Vector_if.isEmpty())) {
            int n = var_int_arr_for[0];
            while ((n < var_java_util_Vector_if.size())) {
                fy fy2 = (fy)var_java_util_Vector_if.elementAt(n);
                if ((fy2.cfr_renamed_1(string) ? 1 : 0 != null)) {
                    return fy2;
                }
                ++n;
                if ("   ".length() > -" ".length()) continue;
                return null;
            }
        }
        return null;
    }

        private void cfr_renamed_26() {
        hs hs2;
        byte by2 = (Byte)this.var_java_lang_Object_do;
        Vector<hs> vector = new Vector<hs>();
        int n = var_int_arr_for[0];
        while ((n < dR.var_java_util_Vector_byte.size())) {
            hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n);
            if (!(!(hs2 != null) || (hs2.cfr_renamed_9 != by2) && ((hs2.cfr_renamed_9 != var_int_arr_for[33]) && (hs2.cfr_renamed_9 != var_int_arr_for[38]) && (hs2.cfr_renamed_9 != var_int_arr_for[39]) && (hs2.cfr_renamed_9 != var_int_arr_for[48]) && (hs2.cfr_renamed_9 != var_int_arr_for[40]) && (hs2.cfr_renamed_9 != var_int_arr_for[41]) && !(hs2.cfr_renamed_9 == var_int_arr_for[42]) || (by2 != var_int_arr_for[1])) && ((hs2.cfr_renamed_9 != var_int_arr_for[10]) && (hs2.cfr_renamed_9 != var_int_arr_for[12]) && !(hs2.cfr_renamed_9 == var_int_arr_for[14]) || !(by2 == var_int_arr_for[5])))) {
                if (AutoFarm.boolean_do(hs2.cfr_renamed_15, bz.gk_0_do((int)hs2.cfr_renamed_9).soLuong * var_int_arr_for[14])) {
                    (hs2, "Em còn nhỏ" == null);
                    if (" ".length() == 0) {
                        return;
                    }
                } else if ((hs2.cfr_renamed_12 < var_int_arr_for[35])) {
                    (hs2, "Bơm thuốc bổ đã" == null);
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                } else {
                    vector.addElement(hs2);
                }
            }
            ++n;
            if (" ".length() > 0) continue;
            return;
        }
        if (!(vector.isEmpty())) {
            n = var_int_arr_for[0];
            while ((n < vector.size())) {
                hs2 = (hs)vector.elementAt(n);
                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, hs2.cfr_renamed_9);
                if ((TienIchGame.boolean_if(5000L) ? 1 : 0 != null)) {
                    (hs2, "Bye bye T.T" == null);
                    TienIchGame.void_if(500L);
                }
                ++n;
                if (" ".length() <= " ".length()) continue;
                return;
            }
            return;
        }
        GameCanvas.hienThongBaoPopup("Không có gì để bán!");
    }

    protected static void cfr_renamed_15() {
        if ((AutoCauCa.coKichHoat ? 1 : 0 != null)) {
            long l = AutoFarm.long_do();
            if (AutoFarm.boolean_do((l >= 0L)) && AutoFarm.cfr_renamed_5((l >= AutoCauCa.bs_0_do().soXu))) {
                AutoCauCa.bs_0_do().var_long_if = System.currentTimeMillis() + l + 60000L;
                return;
            }
            AutoCauCa.bs_0_do().var_long_if = System.currentTimeMillis() + AutoCauCa.bs_0_do().soXu;
            return;
        }
        AutoCauCa.bs_0_do().var_long_if = System.currentTimeMillis() + AutoCauCa.bs_0_do().soXu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        block12: {
            AutoFarm.cfr_renamed_23();
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
            cfr_renamed_7 = var_int_arr_for[1];
            this = var_int_arr_for[2];
            var_java_util_Hashtable_int = new Hashtable();
            chuoiGiaTri = "";
            var_int_char = var_int_arr_for[63];
            var_byte_if = (byte)var_int_arr_for[6];
            var_byte_for = (byte)var_int_arr_for[16];
            chuoiPhu = "";
            var_java_util_Vector_if = new Vector();
            var_boolean_goto = var_int_arr_for[0];
            var_java_util_Hashtable_do = new Hashtable();
            var_java_util_Vector_do = new Vector();
            var_boolean_else = var_int_arr_for[0];
            var_java_util_Hashtable_for = new Hashtable();
            var_java_util_Vector_int = new Vector();
            var_ge_0_do = null;
            cfr_renamed_12 = var_int_arr_for[0];
            var_java_util_Hashtable_if = new Hashtable();
            var_ge_0_if = null;
            var_byte_do = (byte)var_int_arr_for[0];
            var_short_arr_do = null;
            var_int_arr_if = null;
            var_int_arr_int = null;
            tenNhanVat = "";
            var_int_goto = var_int_arr_for[64];
            var_int_else = var_int_arr_for[0];
            var_boolean_char = var_int_arr_for[0];
            cfr_renamed_6 = var_int_arr_for[33];
            cfr_renamed_4 = var_int_arr_for[0];
            var_boolean_long = var_int_arr_for[0];
            Object object = QuanLyRMS.byte_arr_do("FarmSettings");
            if ((object != null)) {
                object = new ByteArrayInputStream((byte[])object);
                DataInputStream dataInputStream = new DataInputStream((InputStream)object);
                try {
                    var_byte_do = dataInputStream.readByte();
                    chuoiPhu = dataInputStream.readUTF();
                    chuoiGiaTri = dataInputStream.readUTF();
                    var_int_char = dataInputStream.readInt();
                    var_byte_if = dataInputStream.readByte();
                    var_byte_for = dataInputStream.readByte();
                    this = dataInputStream.readBoolean();
                    bp_0.cfr_renamed_5 = dataInputStream.readBoolean();
                    tenNhanVat = dataInputStream.readUTF();
                    var_int_goto = dataInputStream.readInt();
                    var_boolean_char = dataInputStream.readBoolean();
                    cfr_renamed_6 = dataInputStream.readInt();
                    var_int_else = dataInputStream.readInt();
                    bp_0.var_boolean_new = dataInputStream.readBoolean();
                    bp_0.var_boolean_int = dataInputStream.readBoolean();
                    bp_0.coTrangThai = dataInputStream.readBoolean();
                    var_boolean_goto = dataInputStream.readBoolean();
                    var_boolean_else = dataInputStream.readBoolean();
                    cfr_renamed_12 = dataInputStream.readBoolean();
                    var_boolean_long = dataInputStream.readBoolean();
                }
                catch (IOException iOException) {
                    try {
                        dataInputStream.close();
                        ((ByteArrayInputStream)object).close();
                        }
                    catch (IOException iOException2) {
                        break block12;
                    }
                    if ("   ".length() == 0) {
                        return;
                    }
                    break block12;
                }
                catch (Throwable throwable) {
                    try {
                        dataInputStream.close();
                        ((ByteArrayInputStream)object).close();
                        }
                    catch (IOException iOException) {
                        throw throwable;
                    }
                    if (" ".length() == " ".length()) throw throwable;
                    return;
                }
                try {
                    dataInputStream.close();
                    ((ByteArrayInputStream)object).close();
                    }
                catch (IOException iOException) {
                    if ("   ".length() > "  ".length()) break block12;
                    return;
                }
            }
        }
        AutoFarm.cfr_renamed_25();
    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void void_for() {
        super.void_for();
        this.cfr_renamed_5 = var_int_arr_for[1];
        this.var_int_long = var_int_arr_for[1];
        this.coTrangThai = var_int_arr_for[0];
    }

    private static void cfr_renamed_27() {
        int n = var_int_arr_for[0];
        int n2 = var_int_arr_for[0];
        while ((n2 < dR.var_java_util_Vector_byte.size())) {
            hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n2);
            if (!(!(hs2 != null) || !AutoFarm.boolean_do(hs2.cfr_renamed_10) || (hs2.cfr_renamed_9 != var_int_arr_for[33]) && (hs2.cfr_renamed_9 != var_int_arr_for[10]) && (hs2.cfr_renamed_9 != var_int_arr_for[12]) && (hs2.cfr_renamed_9 != var_int_arr_for[48]) && !(hs2.cfr_renamed_9 == var_int_arr_for[14]))) {
                hs2.cfr_renamed_10 = var_int_arr_for[0];
                if (!(hs2.cfr_renamed_9 != var_int_arr_for[10]) || !(hs2.cfr_renamed_9 != var_int_arr_for[12]) || (hs2.cfr_renamed_9 == var_int_arr_for[14])) {
                    et_0.et_0_do().cfr_renamed_2(dR.var_int_goto, hs2.cfr_renamed_9);
                    dR.void_if(var_int_arr_for[49]);
                    ++n;
                }
                if (!(hs2.cfr_renamed_9 != var_int_arr_for[33]) || (hs2.cfr_renamed_9 == var_int_arr_for[48])) {
                    et_0.et_0_do().cfr_renamed_2(dR.var_int_goto, hs2.cfr_renamed_9);
                    dR.void_if(var_int_arr_for[9]);
                    ++n;
                }
            }
            ++n2;
            if (-" ".length() <= 0) continue;
            return;
        }
        if ((n == 0)) {
            GameCanvas.hienThongBaoPopup("Không có gì để thu hoạch!");
        }
    }

    protected static void cfr_renamed_21() {
        block12: {
            if ((var_int_arr_int != null)) {
                return;
            }
            if (!!(chuoiGiaTri.equals(""))) break block12;
            String[] stringArray = TienIchGame.java_lang_String_arr_do(chuoiGiaTri, ",");
            var_int_arr_int = new int[stringArray.length];
            String string = "";
            int n = var_int_arr_for[0];
            while ((n < stringArray.length)) {
                block11: {
                    try {
                        int n2 = Integer.parseInt(stringArray[n].trim());
                        if ((n2 >= 0) && (n2 < var_int_arr_for[33]) && (bz.fb_0_do(n2) != null)) {
                            String string2;
                            AutoFarm.var_int_arr_int[n] = n2;
                            StringBuffer stringBuffer = new StringBuffer().append(string);
                            if (!(string.equals(""))) {
                                string2 = ",";
                                if (((0xB2 ^ 0x85 ^ (5 ^ 0x72)) & (0x80 ^ 0x8E ^ (0x55 ^ 0x1B) ^ -" ".length())) > 0) {
                                    return;
                                }
                            } else {
                                string2 = "";
                            }
                            string = stringBuffer.append(string2).append(var_int_arr_int[n]).toString();
                            if ("  ".length() == 0) {
                                return;
                            }
                            break block11;
                        }
                        AutoFarm.var_int_arr_int[n] = var_int_arr_for[1];
                    }
                    catch (NumberFormatException numberFormatException) {
                        AutoFarm.var_int_arr_int[n] = var_int_arr_for[1];
                    }
                    if (-" ".length() > ((0x3D ^ 0x1A) & ~(0x19 ^ 0x3E))) {
                        return;
                    }
                }
                ++n;
                if ((0x83 ^ 0x87) != " ".length()) continue;
                return;
            }
            if (!(chuoiGiaTri.equals(string))) {
                chuoiGiaTri = string;
                AutoFarm.cfr_renamed_9();
            }
        }
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean boolean_do(short s2) {
        ex ex2 = bz.ex_do(s2);
        if ((ex2 != null)) {
            int n = var_int_arr_for[0];
            while ((n < ex2.var_short_arr_if.length)) {
                ee_0 ee_02;
                if ((ex2.var_short_arr_if[n] < var_int_arr_for[22])) {
                    ee_02 = dR.ee_0_if(ex2.var_short_arr_if[n]);
                    if ("  ".length() == 0) {
                        return ((29 + 146 - 140 + 136 ^ 33 + 44 - -60 + 28) & (0x21 ^ 0x39 ^ (0x69 ^ 0x7F) ^ -" ".length())) != 0;
                    }
                } else {
                    ee_02 = dR.ee_0_do(ex2.var_short_arr_if[n]);
                }
                if (!(ee_02 != null) || (ee_02.soLuong < ex2.var_short_arr_do[n])) {
                    return var_int_arr_for[0];
                }
                ++n;
                if ("  ".length() > 0) continue;
                return ((23 + 38 - -43 + 44 ^ 78 + 76 - 85 + 65) & (0xC9 ^ 0x82 ^ (0xE3 ^ 0xBA) ^ -" ".length())) != 0;
            }
            return var_int_arr_for[2];
        }
        return var_int_arr_for[0];
    }

    protected static void cfr_renamed_10() {
        if ((ex_0.dangChayAuto ? 1 : 0 != null)) {
            long l = AutoFarm.long_do();
            if (AutoFarm.boolean_do((l, 0L == null)) && AutoFarm.cfr_renamed_5((l, ex_0.ex_0_do().var_long_if == null))) {
                ex_0.ex_0_do().soXu = System.currentTimeMillis() + l + 60000L;
                return;
            }
            ex_0.ex_0_do().soXu = System.currentTimeMillis() + ex_0.ex_0_do().var_long_if;
            return;
        }
        ex_0.ex_0_do().soXu = System.currentTimeMillis() + ex_0.ex_0_do().var_long_if;
    }

    protected final void cfr_renamed_18() {
        block8: {
            int n;
            int n2;
            block9: {
                int n3;
                int n4;
                Integer n5;
                if (!(cfr_renamed_12 ? 1 : 0 != null)) break block8;
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
                n2 = calendar.get(var_int_arr_for[15]);
                n = calendar.get(var_int_arr_for[7]);
                if (!(var_java_util_Hashtable_if.isEmpty()) && AutoFarm.cfr_renamed_0(var_java_util_Hashtable_if.containsKey(n5 = new Integer(AngelChip.duLieuNguoiChoi.var_short_goto)) ? 1 : 0)) {
                    n4 = (Integer)var_java_util_Hashtable_if.get(n5);
                    if ("  ".length() == "   ".length()) {
                        return;
                    }
                } else {
                    n4 = n3 = var_int_arr_for[1];
                }
                if (!(cfr_renamed_7 != var_int_arr_for[1]) || (n3 != var_int_arr_for[1]) && (!(n3 != n2) || !(n > var_int_arr_for[15]))) break block8;
                TienIchGame.void_if("Giao đơn hàng");
                AutoFarm.this();
                if (!!(var_java_util_Vector_if.isEmpty())) break block8;
                fy fy2 = AutoFarm.fy_do("Đơn hàng từ thành phố");
                var_java_util_Vector_if.removeAllElements();
                if (!(fy2 != null)) break block8;
                TienIchGame.void_if(100L);
                fy2.cfr_renamed_1();
                if (!(gW.boolean_do() ? 1 : 0 != null)) break block8;
                fy2 = AutoFarm.fy_do("Giao Hàng");
                var_java_util_Vector_if.removeAllElements();
                if (!(fy2 != null)) break block9;
                TienIchGame.void_if(100L);
                fy2.cfr_renamed_1();
                if (!(gW.boolean_do() ? 1 : 0 != null)) break block8;
                n = var_int_arr_for[0];
                int n6 = var_int_arr_for[0];
                while ((n6 < var_java_util_Vector_if.size())) {
                    block10: {
                        block11: {
                            block12: {
                                fy fy3 = (fy)var_java_util_Vector_if.elementAt(n6);
                                if (!(fy3 != null) || !AutoFarm.cfr_renamed_4(fy3.chuoiGiaTri.toLowerCase().trim().endsWith("xong") ? 1 : 0)) break block10;
                                var_ge_0_if = null;
                                fy3.cfr_renamed_1();
                                if (!(gW.boolean_do() ? 1 : 0 != null)) break block11;
                                if (!(var_ge_0_if != null)) break block10;
                                this.var_boolean_int = var_int_arr_for[0];
                                var_ge_0_if.cfr_renamed_1();
                                if (!(TienIchGame.cfr_renamed_8(7000L) ? 1 : 0 != null)) break block12;
                                if (!(this.var_boolean_int ? 1 : 0 != null)) break block10;
                                break block11;
                            }
                            ++n;
                            if (-" ".length() >= "   ".length()) {
                                return;
                            }
                            break block10;
                        }
                        ++n;
                    }
                    ++n6;
                    return;
                }
                if ((n == 0)) {
                    var_java_util_Hashtable_if.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n2));
                    var_java_util_Vector_if.removeAllElements();
                }
                return;
            }
            if ((n > var_int_arr_for[15])) {
                var_java_util_Hashtable_if.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n2));
                return;
            }
            var_java_util_Hashtable_if.put(new Integer(AngelChip.duLieuNguoiChoi.var_short_goto), new Integer(n2 - var_int_arr_for[2]));
            }
    }

        private static void cfr_renamed_25() {
        block5: {
            if (!!(tenNhanVat.equals(""))) break block5;
            if ((tenNhanVat.equals("-1") ? 1 : 0 != null)) {
                short[] sArray = new short[var_int_arr_for[2]];
                sArray[AutoFarm.var_int_arr_for[0]] = var_int_arr_for[1];
                var_short_arr_if = sArray;
                return;
            }
            String[] stringArray = TienIchGame.java_lang_String_arr_do(tenNhanVat, ",");
            var_short_arr_if = new short[stringArray.length];
            int n = var_int_arr_for[0];
            while ((n < stringArray.length)) {
                try {
                    AutoFarm.var_short_arr_if[n] = Short.parseShort(stringArray[n].trim());
                }
                catch (NumberFormatException numberFormatException) {
                    AutoFarm.var_short_arr_if[n] = var_int_arr_for[5];
                }
                if ("   ".length() <= " ".length()) {
                    return;
                }
                ++n;
                if ("   ".length() != 0) continue;
                return;
            }
            return;
        }
        var_short_arr_if = null;
    }
}

