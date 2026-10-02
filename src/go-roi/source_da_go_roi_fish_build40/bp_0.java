/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from bP
 */
public final class bp_0
extends NhiemVuAutoBase {
    private String chuoiGiaTri;
    private boolean cfr_renamed_6;
    private static final Vector var_java_util_Vector_do;
    public static boolean dangChayAuto;
    private int soLuong;
    private static final Vector var_java_util_Vector_if;
    private int var_int_if;
    private boolean cfr_renamed_7;
    public static boolean coTrangThai;
    private boolean cfr_renamed_8;
    public static boolean coKichHoat;
    public static boolean var_boolean_int;
    private static final Object var_java_lang_Object_do;
    private int soLuongKhoa;
    private static final Vector var_java_util_Vector_int;
    public static boolean var_boolean_new;
    private static final Vector var_java_util_Vector_new;
    private boolean cfr_renamed_13;
    private static final int[] mangSoNguyen;
    private boolean cfr_renamed_9;
    public static boolean cfr_renamed_5;

        public bp_0() {
        int n;
        if (bp_0.boolean_do(cfr_renamed_5 ? 1 : 0)) {
            n = 0;
            if (((104 + 11 - 8 + 57 ^ 122 + 135 - 122 + 45) & (0xF4 ^ 0x9B ^ 42 + 6 - -34 + 45 ^ -" ".length())) != 0) {
                throw null;
            }
        } else {
            n = 1;
        }
        this.var_int_if = n;
        this.soLuong = 0;
        this.cfr_renamed_8 = 0;
        this.cfr_renamed_6 = 0;
        this.cfr_renamed_9 = 0;
        this.cfr_renamed_13 = 0;
        this.cfr_renamed_7 = 0;
        this.chuoiGiaTri = "Sữa dinh dưỡng";
        this.soLuongKhoa = 0;
        if (!(var_java_util_Vector_do.isEmpty())) {
            var_java_util_Vector_do.removeAllElements();
        }
        if (!(var_java_util_Vector_new.isEmpty())) {
            var_java_util_Vector_new.removeAllElements();
        }
        if (!(var_java_util_Vector_if.isEmpty())) {
            var_java_util_Vector_if.removeAllElements();
        }
        if (!(var_java_util_Vector_int.isEmpty())) {
            var_java_util_Vector_int.removeAllElements();
        }
        bp_0.cfr_renamed_3();
        bp_0.cfr_renamed_4();
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
            coKichHoat = 1;
            l = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(15000L);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (" ".length() < ((0xB1 ^ 0xA7) & ~(0 ^ 0x16))) {
                    return ((0xB8 ^ 0x8A) & ~(0x80 ^ 0xB2)) != 0;
                }
            }
        }
        if ("   ".length() <= -" ".length()) {
            return ((0xF9 ^ 0x99 ^ (0x76 ^ 0x18)) & (0xF3 ^ 0xAD ^ (0x13 ^ 0x43) ^ -" ".length())) != 0;
        }
        if (bp_0.cfr_renamed_3((System.currentTimeMillis() - l == 15000L))) {
            return 1;
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean (long l != null) {
        dangChayAuto = 1;
        long l2 = System.currentTimeMillis();
        Object object = var_java_lang_Object_do;
        synchronized (object) {
            try {
                var_java_lang_Object_do.wait(l);
                }
            catch (InterruptedException interruptedException) {
                }
        }
        if (((0x39 ^ 0x2C ^ (0x38 ^ 0x24)) & (0xFA ^ 0xBB ^ (9 ^ 0x41) ^ -" ".length())) < 0) {
            return ((0xCE ^ 0x8E ^ (0x52 ^ 0xF)) & (115 + 179 - 158 + 44 ^ 47 + 153 - 140 + 109 ^ -" ".length())) != 0;
        }
        if (bp_0.cfr_renamed_3((System.currentTimeMillis() - l2 >= l))) {
            return 1;
        }
        return 0;
    }

    public static void (int n, byte by2, String[] stringArray != null) {
        if (!(var_java_util_Vector_new.isEmpty())) {
            var_java_util_Vector_new.removeAllElements();
        }
        int n2 = 0;
        while ((n2 < stringArray.length)) {
            var_java_util_Vector_new.addElement(new fy(stringArray[n2], new ej(n2, n, by2)));
            ++n2;
            if ("  ".length() <= "   ".length()) continue;
            return;
        }
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

        private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        private static ge_0 ge_0_do(String string) {
        if (!(var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n < var_java_util_Vector_do.size())) {
                ge_0 ge_02 = (ge_0)var_java_util_Vector_do.elementAt(n);
                String string2 = string;
                if (bp_0.boolean_do(ge_02.chuoiGiaTri.toLowerCase().trim().startsWith(string2.toLowerCase().trim()) ? 1 : 0)) {
                    return ge_02;
                }
                ++n;
                if (" ".length() != 0) continue;
                return null;
            }
        }
        return null;
    }

    public final boolean boolean_do(String object) {
        block22: {
            block23: {
                if (!bp_0.boolean_do(TienIchGame.var_boolean_int ? 1 : 0)) break block22;
                if (!(this.var_int_if == 3)) break block23;
                if (bp_0.cfr_renamed_3(((String)object).indexOf("sữa"), -1) && bp_0.cfr_renamed_3(((String)object).indexOf("thành công"), -1)) {
                    this.cfr_renamed_7 = 0;
                    TienIchGame.void_int();
                    return 1;
                }
                if (!bp_0.cfr_renamed_2(((String)object).startsWith("Bạn không đủ") ? 1 : 0) || bp_0.boolean_do(((String)object).startsWith("Chức năng chỉ dành cho") ? 1 : 0)) {
                    this.cfr_renamed_7 = 1;
                    TienIchGame.void_int();
                    return 1;
                }
                break block22;
            }
            if (bp_0.boolean_do(((String)object).startsWith("Cây tình yêu đã hết tim") ? 1 : 0)) {
                TienIchGame.void_int();
                return 1;
            }
            if (!bp_0.boolean_do(((String)object).startsWith("Bạn thu hoạch được ") ? 1 : 0) || !bp_0.cfr_renamed_3(((String)object).indexOf(" tim từ cây tình yêu"), -1)) break block22;
            object = TienIchGame.java_lang_String_arr_do(TienIchGame.java_lang_String_arr_do((String)object, "Bạn thu hoạch được ")[1], " tim từ cây tình yêu");
            try {
                TienIchGame.soLuongKhoa += Integer.parseInt(object[0]);
            }
            catch (NumberFormatException numberFormatException) {
                }
            TienIchGame.void_int();
            return 1;
        }
        if (bp_0.boolean_do(dangChayAuto ? 1 : 0)) {
            if (bp_0.boolean_do(((String)object).startsWith("Chức năng quản lý em bé chỉ được") ? 1 : 0)) {
                this.cfr_renamed_6 = 1;
                bp_0.cfr_renamed_4();
                return 1;
            }
            if (bp_0.boolean_do(((String)object).startsWith("Bạn cần có sữa") ? 1 : 0)) {
                this.cfr_renamed_13 = 1;
                bp_0.cfr_renamed_4();
                return 1;
            }
        }
        if (bp_0.boolean_do(TienIchGame.coKichHoat ? 1 : 0)) {
            if (bp_0.boolean_do(((String)object).startsWith("Bạn đã hết sữa") ? 1 : 0)) {
                this.cfr_renamed_13 = 1;
                this.cfr_renamed_9 = 0;
                TienIchGame.cfr_renamed_21();
                return 1;
            }
            if (bp_0.boolean_do(((String)object).startsWith("Em bé đã ăn no") ? 1 : 0)) {
                this.cfr_renamed_9 = 1;
                TienIchGame.cfr_renamed_21();
                return 1;
            }
            if (bp_0.boolean_do(((String)object).startsWith("Yummi! Em bé đã được ăn ngon") ? 1 : 0)) {
                int n;
                this.soLuongKhoa = 0;
                int n2 = ((String)object).lastIndexOf(58);
                if ((n2 != -1)) {
                    object = ((String)object).substring(n2 + 1);
                    try {
                        this.soLuongKhoa = Integer.parseInt(TienIchGame.java_lang_String_do(((String)object).trim()));
                    }
                    catch (NumberFormatException numberFormatException) {
                        }
                    if (((4 ^ 0) & ~(0x11 ^ 0x15)) != 0) {
                        return ((0x3A ^ 0x66) & ~(0xE5 ^ 0xB9)) != 0;
                    }
                }
                if ((this.soLuongKhoa >= 10)) {
                    n = 1;
                    if (-" ".length() >= "  ".length()) {
                        return ((0x30 ^ 7 ^ (0x55 ^ 0x76)) & (0xD4 ^ 0xBB ^ (0x78 ^ 3) ^ -" ".length())) != 0;
                    }
                } else {
                    n = 0;
                }
                this.cfr_renamed_9 = n;
                TienIchGame.cfr_renamed_21();
                return 1;
            }
        }
        if (!(!bp_0.boolean_do(TienIchGame.var_boolean_new ? 1 : 0) || bp_0.cfr_renamed_2(((String)object).startsWith("Nâng cấp thành công") ? 1 : 0) && bp_0.cfr_renamed_2(((String)object).startsWith("Bạn cần cho bé ăn no") ? 1 : 0) && bp_0.cfr_renamed_2(((String)object).startsWith("Chưa đến thời gian nâng cấp") ? 1 : 0) && bp_0.cfr_renamed_2(((String)object).startsWith("Bạn cần đạt cấp độ hẹn hò") ? 1 : 0) && !bp_0.boolean_do(((String)object).trim().endsWith("Không thể nâng cấp") ? 1 : 0))) {
            TienIchGame.cfr_renamed_12();
            return 1;
        }
        return super.boolean_do((String)object);
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static void cfr_renamed_6() {
        mangSoNguyen = new int[12];
        0 = (0xD3 ^ 0x81) & ~(0x6D ^ 0x3F);
        1 = " ".length();
        3 = "   ".length();
        -1 = -" ".length();
        58 = 0x1A ^ 0x20;
        10 = 0x83 ^ 0x89;
        25 = 0x2E ^ 0x37;
        2 = "  ".length();
        17 = 0xB1 ^ 0xA0;
        110 = 0x2D ^ 0x43;
        -105 = -(2 + 52 - 19 + 134 ^ 121 + 41 - 64 + 94);
        21 = 0x39 ^ 0x2C;
    }

        public final synchronized void d_() {
        block55: {
            if (!(AngelChip.duLieuNguoiChoi.cfr_renamed_23 != -1) || !(cfr_renamed_5) && !(var_boolean_new) && !(coTrangThai)) {
                if ((this.nhiemVuHienTai != null)) {
                    TienIchGame.void_if(1000L);
                    AutoController.cfr_renamed_2();
                    return;
                }
                AutoController.tatAuto();
                return;
            }
            if (bp_0.cfr_renamed_0((System.currentTimeMillis() - this.var_boolean_int < 180000L))) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.hienThongBao(16000L);
                return;
            }
            if (bp_0.boolean_do(GameCanvas.var_en_do instanceof ThongTinNhanVat)) {
                return;
            }
            if ((this.var_int_if == 3)) {
                bp_0 bp_02 = this;
                if ((fh.var_int_char != 25)) {
                    long l;
                    if (bp_0.boolean_do(GameCanvas.var_en_do instanceof gO) && bp_0.cfr_renamed_3((l = System.currentTimeMillis() - bp_02.var_boolean_new < 2000L))) {
                        TienIchGame.void_if(2000L - l);
                    }
                    if (bp_0.boolean_do(TienIchGame.cfr_renamed_1(25) ? 1 : 0)) {
                        TienIchGame.void_if(3000L);
                    }
                    return;
                }
                int n = 0;
                int n2 = 0;
                int n3 = 0;
                while ((n2 < 10) && (!(n3 == 1) || !(AngelChip.duLieuNguoiChoi.mangSoNguyen[2] < 2) || (AngelChip.duLieuNguoiChoi.soLuong >= 2))) {
                    bp_02.cfr_renamed_7 = 0;
                    fn.fn_do().cfr_renamed_1(17, 10, n3);
                    if (bp_0.boolean_do(TienIchGame.cfr_renamed_8(5000L) ? 1 : 0)) {
                        if (bp_0.boolean_do(bp_02.cfr_renamed_7 ? 1 : 0)) {
                            if (!bp_0.boolean_do(var_boolean_int ? 1 : 0) || !(n3 == 0)) break;
                            n3 = 1;
                            TienIchGame.void_if(100L);
                            return;
                        }
                        ++n;
                        TienIchGame.void_if(100L);
                    }
                    ++n2;
                    if ("  ".length() >= "  ".length()) continue;
                    return;
                }
                if ((n > 0)) {
                    bp_02.var_int_if = 1;
                    return;
                }
                AutoController.cfr_renamed_2();
                return;
            }
            if (!(fh.var_int_char == 110)) break block55;
            if (!(this.cfr_renamed_8)) {
                ft_0.ft_0_do().cfr_renamed_1(-105);
                ft_0.ft_0_do().cfr_renamed_0();
                if (bp_0.boolean_do(bp_0.boolean_do() ? 1 : 0)) {
                    this.cfr_renamed_8 = 1;
                }
            }
            if (bp_0.boolean_do(var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
                this.cfr_renamed_8 = 0;
                AutoController.cfr_renamed_2();
                return;
            }
            switch (this.var_int_if) {
                case 0: {
                    ge_0 ge_02;
                    if (!!(var_boolean_new) || bp_0.boolean_do(coTrangThai ? 1 : 0)) {
                        this.var_int_if = 1;
                        if ((0xB2 ^ 0xB6) < 0) {
                            return;
                        }
                    } else {
                        this.var_int_if = -1;
                    }
                    if (!(ge_02 = bp_0.ge_0_do("Thu hoạch") != null)) break;
                    int n = TienIchGame.soLuongKhoa;
                    ge_02.cfr_renamed_1();
                    if (bp_0.boolean_do(TienIchGame.cfr_renamed_8(5000L) ? 1 : 0)) {
                        if ((n != TienIchGame.soLuongKhoa)) {
                            QuanLyRMS.cfr_renamed_3();
                        }
                        TienIchGame.void_if(500L);
                    }
                    return;
                }
                case 1: {
                    this.var_int_if = -1;
                    var_java_util_Vector_new.removeAllElements();
                    ge_0 ge_03 = bp_0.ge_0_do("Baby");
                    if (!(ge_03 != null)) break;
                    ge_03.cfr_renamed_1();
                    if (bp_0.boolean_do5000L != null) {
                        TienIchGame.void_if(500L);
                    }
                    if (!!(var_java_util_Vector_new.isEmpty())) break;
                    fy fy2 = ("Quản Lý Em Bé" < var_java_util_Vector_new);
                    if ((fy2 != null)) {
                        this.cfr_renamed_6 = 0;
                        var_java_util_Vector_new.removeAllElements();
                        fy2.cfr_renamed_1();
                        if (bp_0.boolean_do5000L != null) {
                            if (bp_0.boolean_do(this.cfr_renamed_6 ? 1 : 0)) {
                                AutoController.cfr_renamed_2();
                                return;
                            }
                            if (!(var_java_util_Vector_new.isEmpty())) {
                                var_java_util_Vector_if.removeAllElements();
                                if (!(var_java_util_Vector_new.isEmpty())) {
                                    int n = 0;
                                    while ((n < var_java_util_Vector_new.size())) {
                                        fy fy3 = (fy)var_java_util_Vector_new.elementAt(n);
                                        var_java_util_Vector_if.addElement(fy3);
                                        ++n;
                                        if (-" ".length() >= -" ".length()) continue;
                                        return;
                                    }
                                }
                                var_java_util_Vector_new.removeAllElements();
                                this.chuoiGiaTri = "Sữa dinh dưỡng";
                                this.var_int_if = 2;
                                TienIchGame.void_if(500L);
                            }
                        }
                    }
                    return;
                }
                case 2: {
                    if (bp_0.boolean_do(var_java_util_Vector_if.isEmpty() ? 1 : 0)) {
                        AutoController.cfr_renamed_2();
                        return;
                    }
                    if ((this.soLuong >= var_java_util_Vector_if.size())) {
                        this.soLuong = 0;
                        AutoController.cfr_renamed_2();
                        return;
                    }
                    try {
                        fy fy4 = (fy)var_java_util_Vector_if.elementAt(this.soLuong);
                        if ((fy4 != null)) {
                            var_java_util_Vector_new.removeAllElements();
                            fy4.cfr_renamed_1();
                            if (bp_0.boolean_do15000L != null) {
                                TienIchGame.void_if(500L);
                            }
                            if (!(var_java_util_Vector_new.isEmpty()) && (fy4 = ("Cho ăn" < var_java_util_Vector_new) != null)) {
                                var_java_util_Vector_int.removeAllElements();
                                if (!(var_java_util_Vector_new.isEmpty())) {
                                    int n = 0;
                                    while ((n < var_java_util_Vector_new.size())) {
                                        fy fy5 = (fy)var_java_util_Vector_new.elementAt(n);
                                        var_java_util_Vector_int.addElement(fy5);
                                        ++n;
                                        if (-"  ".length() <= 0) continue;
                                        return;
                                    }
                                }
                                var_java_util_Vector_new.removeAllElements();
                                this.cfr_renamed_13 = 0;
                                fy4.cfr_renamed_1();
                                if (bp_0.boolean_do15000L != null) {
                                    if (bp_0.boolean_do(this.cfr_renamed_13 ? 1 : 0)) {
                                        this.var_int_if = 3;
                                        return;
                                    }
                                    TienIchGame.void_if(500L);
                                }
                                if (!(var_java_util_Vector_new.isEmpty()) && (fy4 = (this.chuoiGiaTri < var_java_util_Vector_new) != null)) {
                                    this.cfr_renamed_13 = 0;
                                    this.cfr_renamed_9 = 0;
                                    fy4.cfr_renamed_1();
                                    if (bp_0.boolean_do(TienIchGame.cfr_renamed_7(15000L) ? 1 : 0)) {
                                        if (bp_0.boolean_do(this.cfr_renamed_13 ? 1 : 0)) {
                                            if (bp_0.boolean_do(this.chuoiGiaTri.equals("Sữa dinh dưỡng") ? 1 : 0)) {
                                                this.chuoiGiaTri = "Sữa nhập khẩu";
                                                return;
                                            }
                                            this.var_int_if = 3;
                                            return;
                                        }
                                        if (bp_0.boolean_do(this.cfr_renamed_9 ? 1 : 0)) {
                                            if (bp_0.boolean_do(coTrangThai ? 1 : 0) && (fy4 = ("Nâng Cấp" < var_java_util_Vector_int) != null)) {
                                                fy4.cfr_renamed_1();
                                                if (bp_0.boolean_do(TienIchGame.cfr_renamed_13(5000L) ? 1 : 0)) {
                                                    TienIchGame.void_if(500L);
                                                }
                                            }
                                            this.soLuong += 1;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                        }
                    catch (Exception exception) {
                        }
                    if ("   ".length() <= 0) {
                        return;
                    }
                    this.soLuong += 1;
                    return;
                }
                default: {
                    AutoController.cfr_renamed_2();
                }
            }
            return;
        }
        if ((fh.var_int_char != 21)) {
            long l;
            if (bp_0.boolean_do(GameCanvas.var_en_do instanceof gO) && bp_0.cfr_renamed_3(bp_0.cfr_renamed_1(l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4, 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            if (bp_0.boolean_do(TienIchGame.cfr_renamed_1(21) ? 1 : 0)) {
                TienIchGame.void_if(3500L);
            }
            return;
        }
        if (bp_0.boolean_do(TienIchGame.cfr_renamed_1(110) ? 1 : 0)) {
            TienIchGame.void_if(1000L);
        }
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final String toString() {
        return "Chăm em bé";
    }

        /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_3() {
        if (bp_0.boolean_do(coKichHoat ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            coKichHoat = 0;
        }
    }

    static {
        bp_0.cfr_renamed_6();
        var_java_util_Vector_do = new Vector();
        var_java_util_Vector_new = new Vector();
        var_java_util_Vector_if = new Vector();
        var_java_util_Vector_int = new Vector();
        coKichHoat = 0;
        dangChayAuto = 0;
        var_java_lang_Object_do = new Object();
        cfr_renamed_5 = 1;
        var_boolean_new = 1;
        var_boolean_int = 0;
        coTrangThai = 1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_4() {
        if (bp_0.boolean_do(dangChayAuto ? 1 : 0)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if ("  ".length() == -" ".length()) {
                return;
            }
            dangChayAuto = 0;
        }
    }

    private static fy (String string < Vector vector) {
        if (!(vector.isEmpty())) {
            int n = 0;
            while ((n < vector.size())) {
                fy fy2 = (fy)vector.elementAt(n);
                if (bp_0.boolean_do(fy2.cfr_renamed_1(string) ? 1 : 0)) {
                    return fy2;
                }
                ++n;
                if (-(0xFF ^ 0xBF ^ (0x7B ^ 0x3F)) <= 0) continue;
                return null;
            }
        }
        return null;
    }

            public static void (Vector vector != null) {
        if (!(var_java_util_Vector_do.isEmpty())) {
            var_java_util_Vector_do.removeAllElements();
        }
        int n = 0;
        while ((n < vector.size())) {
            fl_0 fl_02 = (fl_0)vector.elementAt(n);
            var_java_util_Vector_do.addElement(new ge_0(fl_02.chuoiGiaTri, fl_02.var_de_do));
            ++n;
            if (-" ".length() < " ".length()) continue;
            return;
        }
    }

    }

