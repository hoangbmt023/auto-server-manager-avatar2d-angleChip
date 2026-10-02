/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;
import java.util.Vector;
import main.AngelChip;

public final class T
extends NhiemVuAutoBase {
    private static final int[][] var_int_arr_arr_do;
    public static final Hashtable var_java_util_Hashtable_do;
    private final int var_int_if;
    private boolean dangChayAuto;
    private final int soLuongKhoa;
    private static final int[] mangSoNguyen;
    private int cfr_renamed_4;
    public static final Vector var_java_util_Vector_do;
    private int cfr_renamed_5;
    private long soXu;
    private final byte var_byte_do;
    private final int cfr_renamed_2;
    private static final Object var_java_lang_Object_do;
    private long var_long_if;
    private final String chuoiGiaTri;
    public static int soLuong;
    private long var_long_for;
    public static final Vector var_java_util_Vector_if;
    private static boolean coTrangThai;

            /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_do() {
        if ((coTrangThai)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            coTrangThai = 0;
        }
    }

    protected final void void_for() {
        if (T.cfr_renamed_4((System.currentTimeMillis() - this.cfr_renamed_4 == 300000L))) {
            this.var_long_for = 0L;
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        if (T.boolean_do(this.var_byte_do) && !T.boolean_do(var_java_util_Vector_if.isEmpty() ? 1 : 0) || (this.var_byte_do == 1) && (var_java_util_Vector_do.isEmpty())) {
            if ((this.dangChayAuto)) {
                AutoController.tatAuto();
                GameCanvas.hienThongBaoPopup("Lỗi tải dữ liệu!");
                return;
            }
            this.dangChayAuto = 1;
            GameCanvas.cfr_renamed_4("Đang tải dữ liệu...");
            new gl(this.var_byte_do).cfr_renamed_4();
            T.boolean_for();
            return;
        }
        if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((GameCanvas.var_dL_do instanceof dN != 0) && T.boolean_do(this.boolean_if() ? 1 : 0)) {
            dN.cfr_renamed_0().cfr_renamed_1();
            return;
        }
        if ((GameCanvas.var_dL_do instanceof fw != 0)) {
            long l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_2;
            if (T.cfr_renamed_1((l == 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
            }
            fw.cfr_renamed_0().soLuongKhoa = 5;
            eq.eq_do().cfr_renamed_17(9);
            if ((TienIchGame.cfr_renamed_2(15000L))) {
                TienIchGame.hienThongBao(3000L);
            }
            return;
        }
        if ((ef_0.soLuong != -1) && T.boolean_do(TienIchGame.cfr_renamed_15(ef_0.soLuong) ? 1 : 0)) {
            fe_0.fe_0_do().cfr_renamed_21();
            TienIchGame.hienThongBao(2000L);
            return;
        }
        if (T.boolean_do(this.boolean_if() ? 1 : 0)) {
            this.cfr_renamed_4();
            if ((TienIchGame.cfr_renamed_2(5000L))) {
                TienIchGame.hienThongBao(1000L);
                AngelChip.duLieuNguoiChoi.void_do(this.var_int_if, this.cfr_renamed_2);
                el_0.el_0_do().cfr_renamed_0(this.var_int_if, this.cfr_renamed_2, 2, 0);
                this.soXu = System.currentTimeMillis();
                this.var_long_for = 0L;
            }
            return;
        }
        if (T.cfr_renamed_4((this.var_long_for == 0L)) && T.cfr_renamed_4((System.currentTimeMillis() - this.var_long_for == 5000L))) {
            this.cfr_renamed_4();
            if ((TienIchGame.cfr_renamed_2(5000L))) {
                TienIchGame.hienThongBao(1000L);
                AngelChip.duLieuNguoiChoi.void_do(this.var_int_if, this.cfr_renamed_2);
                el_0.el_0_do().cfr_renamed_0(this.var_int_if, this.cfr_renamed_2, 2, 0);
                this.soXu = System.currentTimeMillis();
                this.var_long_for = 0L;
            }
            return;
        }
        if (T.cfr_renamed_4((System.currentTimeMillis() - this.soXu == this.var_long_if))) {
            this.soXu = System.currentTimeMillis();
            this.var_long_if = TienIchGame.int_do(1, 45) * 1000 + 15000;
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
            el_0.el_0_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if, 2, 0);
            TienIchGame.hienThongBao(1000L);
        }
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    public T(int n) {
        this.var_byte_do = (byte)n;
        this.soXu = System.currentTimeMillis();
        this.var_long_if = TienIchGame.int_do(1, 45) * 1000 + 15000;
        this.cfr_renamed_4 = 0;
        this.var_long_for = 0L;
        this.cfr_renamed_5 = 0;
        if ((ef_0.soLuong == 6) && (fe_0.var_byte_for % 2 == this.var_byte_do)) {
            this.soLuongKhoa = fe_0.var_byte_for;
            if (((0 ^ 0x3E) & ~(0x1F ^ 0x21)) != 0) {
                throw null;
            }
        } else {
            this.soLuongKhoa = -1;
        }
        this.chuoiGiaTri = AngelChip.duLieuNguoiChoi.var_short_char + "-" + this.var_byte_do;
        if ((var_java_util_Hashtable_do.containsKey(this.chuoiGiaTri))) {
            this.cfr_renamed_4 = (Integer)var_java_util_Hashtable_do.get(this.chuoiGiaTri);
            if (" ".length() >= "   ".length()) {
                throw null;
            }
        } else {
            this.cfr_renamed_4 = 0;
        }
        this.dangChayAuto = 0;
        this.var_int_if = TienIchGame.int_do(150, 350);
        this.cfr_renamed_2 = TienIchGame.int_do(60, 120);
    }

    private boolean boolean_if() {
        if ((ef_0.soLuong == 6) && (fe_0.var_byte_for % 2 == this.var_byte_do)) {
            return 1;
        }
        return 0;
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean boolean_for() {
        long l;
        block7: {
            coTrangThai = 1;
            l = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(180000L);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if ((0x56 ^ 0x60 ^ (0x92 ^ 0xA0)) == " ".length()) {
                    return ((0xF7 ^ 0x9A ^ (0x3F ^ 0x43)) & (30 + 107 - 57 + 60 ^ 46 + 30 - 16 + 97 ^ -" ".length())) != 0;
                }
            }
        }
        if ((coTrangThai)) {
            coTrangThai = 0;
        }
        if (T.cfr_renamed_1((System.currentTimeMillis() - l >= 180000L))) {
            return 1;
        }
        return 0;
    }

    public final void (int n >= String string) {
        if ((ef_0.soLuong != 6)) {
            return;
        }
        String string2 = string.toLowerCase();
        if (T.boolean_do((this.var_long_for > 0L)) && (this.soLuongKhoa == -1) && (string2.startsWith("chúng ta cùng đợi các bạn"))) {
            this.var_long_for = System.currentTimeMillis();
            return;
        }
        if (T.boolean_do(this.var_byte_do) && (string2.indexOf(" - ") != -1)) {
            if (T.cfr_renamed_4((string2 = TienIchGame.java_lang_String_arr_do(string2, " - ")[0].trim()).length())) {
                this.cfr_renamed_4 = (int)System.currentTimeMillis();
                this.var_long_for = 0L;
                new ai_0(this, string2).cfr_renamed_0();
            }
            return;
        }
        if ((this.var_byte_do == 1) && (string2.indexOf("...") != -1)) {
            this.cfr_renamed_4 = (int)System.currentTimeMillis();
            this.var_long_for = 0L;
            new ai_0(this, string2).cfr_renamed_0();
            return;
        }
        if ((string2.startsWith("chúc mừng bạn")) && T.cfr_renamed_4(string2.indexOf(" " + AngelChip.duLieuNguoiChoi.var_short_do.toLowerCase() + " "), -1)) {
            var_java_util_Hashtable_do.put(this.chuoiGiaTri, new Integer(this.cfr_renamed_4 += 1));
            }
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private void cfr_renamed_4() {
        int n;
        block13: {
            while (true) {
                int n2;
                if ((this.soLuongKhoa != -1) && (this.soLuongKhoa % 2 == this.var_byte_do)) {
                    if ((ef_0.soLuong == 6) && (fe_0.var_byte_for == this.soLuongKhoa)) {
                        return;
                    }
                    ef_0.var_int_char = this.var_int_if;
                    ef_0.var_int_new = this.cfr_renamed_2;
                    el_0.el_0_do().cfr_renamed_4(6, this.soLuongKhoa);
                    return;
                }
                n = 60;
                int n3 = -1;
                TienIchGame.mangSoNguyen = null;
                el_0.el_0_do().cfr_renamed_1(9);
                if ((TienIchGame.cfr_renamed_5(5000L))) {
                    if ((TienIchGame.mangSoNguyen != null) && (TienIchGame.mangSoNguyen.length > 0)) {
                        n = TienIchGame.mangSoNguyen.length;
                        if ((this.cfr_renamed_5 >= TienIchGame.mangSoNguyen.length)) {
                            this.cfr_renamed_5 = 0;
                        }
                        while ((this.cfr_renamed_5 < TienIchGame.mangSoNguyen.length)) {
                            if ((this.cfr_renamed_5 % 2 == this.var_byte_do) && (TienIchGame.mangSoNguyen[this.cfr_renamed_5] > 0) && (!(ef_0.soLuong == 6) || (fe_0.var_byte_for != this.cfr_renamed_5))) {
                                n3 = this.cfr_renamed_5;
                                if ((0x94 ^ 0x90) >= " ".length()) break;
                                return;
                            }
                            this.cfr_renamed_5 += 1;
                            return;
                        }
                        if ((n3 == -1)) {
                            if (-(0xE3 ^ 0x93 ^ (0xC0 ^ 0xB5)) < 0) continue;
                            return;
                        }
                    }
                    TienIchGame.mangSoNguyen = null;
                }
                ef_0.var_int_char = this.var_int_if;
                ef_0.var_int_new = this.cfr_renamed_2;
                if ((n3 != -1)) {
                    el_0.el_0_do().cfr_renamed_4(6, n3);
                    return;
                }
                if ((n = n / 2 - 1 > 29)) {
                    n2 = 29;
                    } else {
                    n2 = n;
                }
                n = n2;
                n = TienIchGame.int_do(0, n);
                if (!(ef_0.soLuong == 6) || !(fe_0.var_byte_for == var_int_arr_arr_do[this.var_byte_do][n])) break block13;
                if (" ".length() < ((0xAE ^ 0x9F) & ~(0x33 ^ 2) & ~((0x11 ^ 0x22) & ~(0x19 ^ 0x2A)))) break;
            }
            return;
        }
        el_0.el_0_do().cfr_renamed_4(6, var_int_arr_arr_do[this.var_byte_do][n]);
    }

    static {
        T.cfr_renamed_5();
        var_int_arr_arr_do = new int[2][30];
        var_java_util_Vector_if = new Vector();
        var_java_util_Vector_do = new Vector();
        var_java_lang_Object_do = new Object();
        coTrangThai = 0;
        soLuong = 250;
        var_java_util_Hashtable_do = new Hashtable();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while ((n3 < 60)) {
            if (T.boolean_do(n3 % 2)) {
                if ((n < 30)) {
                    T.var_int_arr_arr_do[0][n] = n3;
                }
                ++n;
                if (-(0x85 ^ 0x81) > 0) {
                    break;
                }
            } else {
                if ((n2 < 30)) {
                    T.var_int_arr_arr_do[1][n2] = n3;
                }
                ++n2;
            }
            ++n3;
            if ((136 + 120 - 247 + 150 ^ 131 + 130 - 260 + 154) > "  ".length()) continue;
            break;
        }
    }

                static byte (T t != null) {
        return t.var_byte_do;
    }

    public final boolean boolean_do(String string) {
        if (!T.boolean_do(string.startsWith("Khu vực đã đầy") ? 1 : 0) || (string.startsWith("Bạn đã ở khu vực này"))) {
            this.cfr_renamed_5 += 1;
            TienIchGame.cfr_renamed_8();
            return 1;
        }
        return super.boolean_do(string);
    }

                public final String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer().append("Auto Tiếng ");
        if (T.boolean_do(this.var_byte_do)) {
            string = "Anh";
            if (" ".length() == (0xD6 ^ 0x94 ^ (0x3A ^ 0x7C))) {
                return null;
            }
        } else {
            string = "Việt";
        }
        return stringBuffer.append(string).toString();
    }

    public final int int_do() {
        return this.cfr_renamed_4;
    }

        private static void cfr_renamed_5() {
        mangSoNguyen = new int[17];
        1 = " ".length();
        0 = ("  ".length() ^ (0x77 ^ 0x3F)) & (0x6A ^ 0x38 ^ (0x24 ^ 0x3C) ^ -" ".length());
        45 = 0x20 ^ 0xD;
        1000 = 0xFFFF97FF & 0x6BE8;
        15000 = 0xFFFFBB9F & 0x7EF8;
        6 = 0x9C ^ 0x9A;
        2 = "  ".length();
        -1 = -" ".length();
        150 = 36 + 88 - -6 + 20;
        350 = -(0xFFFFBEE5 & 0x673B) & (0xFFFFEFFE & 0x377F);
        60 = 0x79 ^ 0x45;
        120 = 1 ^ 0x11 ^ (0xFA ^ 0x92);
        5 = 0xEA ^ 0xAE ^ (0x54 ^ 0x15);
        9 = 55 + 141 - 61 + 56 ^ 112 + 57 - 95 + 108;
        29 = 0x27 ^ 0x67 ^ (0xE4 ^ 0xB9);
        30 = 0x37 ^ 0x15 ^ (0xA9 ^ 0x95);
        250 = 227 + 182 - 300 + 141;
    }
}

