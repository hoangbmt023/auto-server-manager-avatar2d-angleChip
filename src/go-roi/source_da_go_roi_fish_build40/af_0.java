/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from af
 */
public final class af_0
extends NhiemVuAutoBase {
    public static int soLuong;
    private final int var_int_if;
    private static boolean dangChayAuto;
    private final int soLuongKhoa;
    private static final int[][] var_int_arr_arr_do;
    public static final Hashtable var_java_util_Hashtable_do;
    private final int cfr_renamed_3;
    private int cfr_renamed_4;
    private long soXu;
    private final byte var_byte_do;
    private final String chuoiGiaTri;
    private static final Object var_java_lang_Object_do;
    private static final int[] mangSoNguyen;
    public static final Vector var_java_util_Vector_do;
    private boolean coTrangThai;
    public static final Vector var_java_util_Vector_if;
    private long var_long_if;
    private int cfr_renamed_5;
    private long var_long_for;

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static byte (af_0 af_02 != null) {
        return af_02.var_byte_do;
    }

        public final void (int n > String string) {
        if ((fh.var_int_char != 6)) {
            return;
        }
        String string2 = string.toLowerCase();
        if (af_0.cfr_renamed_3((this.soXu > 0L)) && (this.var_int_if == -1) && (string2.startsWith("chúng ta cùng đợi các bạn"))) {
            this.soXu = System.currentTimeMillis();
            return;
        }
        if ((this.var_byte_do == 0) && (string2.indexOf(" - ") != -1)) {
            if (af_0.cfr_renamed_0((string2 = TienIchGame.java_lang_String_arr_do(string2, " - ")[0].trim()).length())) {
                this.cfr_renamed_3 = (int)System.currentTimeMillis();
                this.soXu = 0L;
                new ci(this, string2).cfr_renamed_1();
            }
            return;
        }
        if ((this.var_byte_do == 1) && (string2.indexOf("...") != -1)) {
            this.cfr_renamed_3 = (int)System.currentTimeMillis();
            this.soXu = 0L;
            new ci(this, string2).cfr_renamed_1();
            return;
        }
        if ((string2.startsWith("chúc mừng bạn")) && af_0.cfr_renamed_3(string2.indexOf(" " + AngelChip.duLieuNguoiChoi.soLuong.toLowerCase() + " "), -1)) {
            var_java_util_Hashtable_do.put(this.chuoiGiaTri, new Integer(this.cfr_renamed_4 += 1));
            }
    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    protected final void d_() {
        if (af_0.cfr_renamed_0((System.currentTimeMillis() - this.cfr_renamed_3 < 300000L))) {
            this.soXu = 0L;
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if ((this.var_byte_do == 0) && !!(var_java_util_Vector_if.isEmpty()) || (this.var_byte_do == 1) && (var_java_util_Vector_do.isEmpty())) {
            if ((this.coTrangThai)) {
                AutoController.tatAuto();
                GameCanvas.hienThongBaoPopup("Lỗi tải dữ liệu!");
                return;
            }
            this.coTrangThai = 1;
            GameCanvas.cfr_renamed_2("Đang tải dữ liệu...");
            new em_0(this.var_byte_do).void_do();
            af_0.boolean_do();
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((GameCanvas.var_en_do instanceof ep != 0) && !(this.cfr_renamed_0())) {
            ep.cfr_renamed_1().cfr_renamed_3();
            return;
        }
        if ((GameCanvas.var_en_do instanceof gO != 0)) {
            long l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4;
            if (af_0.boolean_do((l < 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            gO.cfr_renamed_1().soLuong = 5;
            ft_0.ft_0_do().cfr_renamed_12(9);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(3000L);
            }
            return;
        }
        if ((fh.var_int_char != -1) && !(TienIchGame.cfr_renamed_0(fh.var_int_char))) {
            go_0.go_0_do().cfr_renamed_11();
            TienIchGame.void_if(2000L);
            return;
        }
        if (!(this.cfr_renamed_0())) {
            this.cfr_renamed_4();
            if ((TienIchGame.boolean_do(5000L))) {
                TienIchGame.void_if(1000L);
                AngelChip.duLieuNguoiChoi.void_do(this.soLuongKhoa, this.cfr_renamed_3);
                fn.fn_do().cfr_renamed_1(this.soLuongKhoa, this.cfr_renamed_3, 2, 0);
                this.var_long_for = System.currentTimeMillis();
                this.soXu = 0L;
            }
            return;
        }
        if (af_0.cfr_renamed_0((this.soXu < 0L)) && af_0.cfr_renamed_0((System.currentTimeMillis() - this.soXu < 5000L))) {
            this.cfr_renamed_4();
            if ((TienIchGame.boolean_do(5000L))) {
                TienIchGame.void_if(1000L);
                AngelChip.duLieuNguoiChoi.void_do(this.soLuongKhoa, this.cfr_renamed_3);
                fn.fn_do().cfr_renamed_1(this.soLuongKhoa, this.cfr_renamed_3, 2, 0);
                this.var_long_for = System.currentTimeMillis();
                this.soXu = 0L;
            }
            return;
        }
        if (af_0.cfr_renamed_0((System.currentTimeMillis() - this.var_long_for < this.var_long_if))) {
            this.var_long_for = System.currentTimeMillis();
            this.var_long_if = TienIchGame.int_do(1, 45) * 1000 + 15000;
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, 2, 0);
            TienIchGame.void_if(1000L);
        }
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean boolean_do() {
        long l;
        block7: {
            dangChayAuto = 1;
            l = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(180000L);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (-" ".length() == "   ".length()) {
                    return ((181 + 180 - 241 + 89 ^ 68 + 55 - 40 + 74) & (0xC5 ^ 0x83 ^ (0x95 ^ 0x9F) ^ -" ".length())) != 0;
                }
            }
        }
        if ((dangChayAuto)) {
            dangChayAuto = 0;
        }
        if (af_0.boolean_do((System.currentTimeMillis() - l == 180000L))) {
            return 1;
        }
        return 0;
    }

            public final int int_do() {
        return this.cfr_renamed_4;
    }

        private void cfr_renamed_4() {
        int n;
        block13: {
            while (true) {
                int n2;
                if ((this.var_int_if != -1) && (this.var_int_if % 2 == this.var_byte_do)) {
                    if ((fh.var_int_char == 6) && (go_0.var_byte_do == this.var_int_if)) {
                        return;
                    }
                    fh.cfr_renamed_9 = this.soLuongKhoa;
                    fh.var_int_try = this.cfr_renamed_3;
                    fn.fn_do().cfr_renamed_3(6, this.var_int_if);
                    return;
                }
                n = 60;
                int n3 = -1;
                TienIchGame.mangSoNguyen = null;
                fn.fn_do().cfr_renamed_0(9);
                if ((TienIchGame.cfr_renamed_2(5000L))) {
                    if ((TienIchGame.mangSoNguyen != null) && (TienIchGame.mangSoNguyen.length > 0)) {
                        n = TienIchGame.mangSoNguyen.length;
                        if ((this.cfr_renamed_5 >= TienIchGame.mangSoNguyen.length)) {
                            this.cfr_renamed_5 = 0;
                        }
                        while ((this.cfr_renamed_5 < TienIchGame.mangSoNguyen.length)) {
                            if ((this.cfr_renamed_5 % 2 == this.var_byte_do) && (TienIchGame.mangSoNguyen[this.cfr_renamed_5] > 0) && (!(fh.var_int_char == 6) || (go_0.var_byte_do != this.cfr_renamed_5))) {
                                n3 = this.cfr_renamed_5;
                                if (((0xDC ^ 0x94) & ~(0x76 ^ 0x3E)) <= 0) break;
                                return;
                            }
                            this.cfr_renamed_5 += 1;
                            return;
                        }
                        if ((n3 == -1)) {
                            if (((0x3D ^ 0x62 ^ (0xB6 ^ 0xB9)) & (190 + 133 - 153 + 27 ^ 147 + 24 - 61 + 39 ^ -" ".length())) == 0) continue;
                            return;
                        }
                    }
                    TienIchGame.mangSoNguyen = null;
                }
                fh.cfr_renamed_9 = this.soLuongKhoa;
                fh.var_int_try = this.cfr_renamed_3;
                if ((n3 != -1)) {
                    fn.fn_do().cfr_renamed_3(6, n3);
                    return;
                }
                if ((n = n / 2 - 1 > 29)) {
                    n2 = 29;
                    if (((0xF4 ^ 0xB3) & ~(0xD8 ^ 0x9F)) >= (0x61 ^ 0x65)) {
                        return;
                    }
                } else {
                    n2 = n;
                }
                n = n2;
                n = TienIchGame.int_do(0, n);
                if (!(fh.var_int_char == 6) || !(go_0.var_byte_do == var_int_arr_arr_do[this.var_byte_do][n])) break block13;
                if (" ".length() <= -" ".length()) break;
            }
            return;
        }
        fn.fn_do().cfr_renamed_3(6, var_int_arr_arr_do[this.var_byte_do][n]);
    }

            /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_3() {
        if ((dangChayAuto)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if (((0x6F ^ 0x54 ^ "  ".length()) & (0xE3 ^ 0x86 ^ (0x1A ^ 0x46) ^ -" ".length())) == "  ".length()) {
                return;
            }
            dangChayAuto = 0;
        }
    }

            public final String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer().append("Auto Tiếng ");
        if ((this.var_byte_do == 0)) {
            string = "Anh";
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        } else {
            string = "Việt";
        }
        return stringBuffer.append(string).toString();
    }

    static {
        af_0.cfr_renamed_6();
        var_int_arr_arr_do = new int[2][30];
        var_java_util_Vector_if = new Vector();
        var_java_util_Vector_do = new Vector();
        var_java_lang_Object_do = new Object();
        dangChayAuto = 0;
        soLuong = 250;
        var_java_util_Hashtable_do = new Hashtable();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while ((n3 < 60)) {
            if ((n3 % 2 == 0)) {
                if ((n < 30)) {
                    af_0.var_int_arr_arr_do[0][n] = n3;
                }
                ++n;
                if (" ".length() >= "   ".length()) {
                    break;
                }
            } else {
                if ((n2 < 30)) {
                    af_0.var_int_arr_arr_do[1][n2] = n3;
                }
                ++n2;
            }
            ++n3;
            if (-"   ".length() <= 0) continue;
            break;
        }
    }

    private boolean cfr_renamed_0() {
        if ((fh.var_int_char == 6) && (go_0.var_byte_do % 2 == this.var_byte_do)) {
            return 1;
        }
        return 0;
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        private static void cfr_renamed_6() {
        mangSoNguyen = new int[17];
        1 = " ".length();
        0 = (0x23 ^ 0x3A) & ~(0x79 ^ 0x60);
        45 = 0x42 ^ 0x30 ^ (0x23 ^ 0x7C);
        1000 = -(0xFFFFFEF7 & 0x391D) & (0xFFFFBFFE & 0x7BFD);
        15000 = -(0xFFFFC763 & 0x3CFD) & (0xFFFFFEFD & 0x3FFA);
        6 = 0xE ^ 8;
        2 = "  ".length();
        -1 = -" ".length();
        150 = 109 + 129 - 175 + 87;
        350 = 0xFFFFC9FF & 0x375E;
        60 = 0xFF ^ 0xC3;
        120 = 33 + 90 - 46 + 178 ^ 69 + 65 - 8 + 9;
        5 = 0x34 ^ 0x40 ^ (0x35 ^ 0x44);
        9 = 0xE1 ^ 0x9C ^ (0x74 ^ 0);
        29 = 0x28 ^ 0x35;
        30 = 0x4F ^ 0x51;
        250 = 90 + 35 - 0 + 79 + (0x11 ^ 0x5F) - (20 + 13 - -107 + 93) + (10 + 121 - 123 + 193);
    }

    public final boolean boolean_do(String string) {
        if (!!(string.startsWith("Khu vực đã đầy")) || (string.startsWith("Bạn đã ở khu vực này"))) {
            this.cfr_renamed_5 += 1;
            TienIchGame.cfr_renamed_7();
            return 1;
        }
        return super.boolean_do(string);
    }

    public af_0(int n) {
        this.var_byte_do = (byte)n;
        this.var_long_for = System.currentTimeMillis();
        this.var_long_if = TienIchGame.int_do(1, 45) * 1000 + 15000;
        this.cfr_renamed_4 = 0;
        this.soXu = 0L;
        this.cfr_renamed_5 = 0;
        if ((fh.var_int_char == 6) && (go_0.var_byte_do % 2 == this.var_byte_do)) {
            this.var_int_if = go_0.var_byte_do;
            if (" ".length() == 0) {
                throw null;
            }
        } else {
            this.var_int_if = -1;
        }
        this.chuoiGiaTri = AngelChip.duLieuNguoiChoi.var_short_goto + "-" + this.var_byte_do;
        if ((var_java_util_Hashtable_do.containsKey(this.chuoiGiaTri))) {
            this.cfr_renamed_4 = (Integer)var_java_util_Hashtable_do.get(this.chuoiGiaTri);
            if (-" ".length() > " ".length()) {
                throw null;
            }
        } else {
            this.cfr_renamed_4 = 0;
        }
        this.coTrangThai = 0;
        this.soLuongKhoa = TienIchGame.int_do(150, 350);
        this.cfr_renamed_3 = TienIchGame.int_do(60, 120);
    }
}

