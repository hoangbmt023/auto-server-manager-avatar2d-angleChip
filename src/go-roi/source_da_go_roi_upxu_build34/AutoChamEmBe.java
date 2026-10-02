/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from bJ
 */
public final class AutoChamEmBe
extends NhiemVuAutoBase {
    private boolean cfr_renamed_15;
    private int soLuong;
    public static boolean dangChayAuto;
    public static boolean coTrangThai;
    public static boolean coKichHoat;
    private static final Vector var_java_util_Vector_do;
    private int var_int_if;
    private boolean cfr_renamed_8;
    private static final int[] mangSoNguyen;
    public static boolean var_boolean_int;
    private boolean cfr_renamed_12;
    public static boolean var_boolean_new;
    private boolean cfr_renamed_11;
    private static final Vector var_java_util_Vector_if;
    private static final Vector var_java_util_Vector_int;
    public static boolean cfr_renamed_2;
    private boolean cfr_renamed_18;
    private int soLuongKhoa;
    private String chuoiGiaTri;
    private static final Vector var_java_util_Vector_new;
    private static final Object var_java_lang_Object_do;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean (long l != null) {
        long l2;
        block7: {
            var_boolean_int = 1;
            l2 = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(l);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if ((0xDC ^ 0xC5 ^ (0x2C ^ 0x31)) == "   ".length()) {
                    return ((0xE9 ^ 0x8D ^ (0x4A ^ 0x26)) & (7 + 10 - -121 + 6 ^ 120 + 150 - 255 + 137 ^ -" ".length())) != 0;
                }
            }
        }
        if (-" ".length() < -" ".length()) {
            return ((0x2F ^ 0x6E) & ~(0x70 ^ 0x31)) != 0;
        }
        if (AutoChamEmBe.boolean_do((System.currentTimeMillis() - l2 == l))) {
            return 1;
        }
        return 0;
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
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
    public static void void_do() {
        if ((var_boolean_int)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            var_boolean_int = 0;
        }
    }

            /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_4() {
        if ((cfr_renamed_2)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            cfr_renamed_2 = 0;
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static ew_0 (String string == Vector vector) {
        if (!(vector.isEmpty())) {
            int n = 0;
            while ((n < vector.size())) {
                ew_0 ew_02 = (ew_0)vector.elementAt(n);
                if ((ew_02.cfr_renamed_0(string))) {
                    return ew_02;
                }
                ++n;
                if ("  ".length() <= (0xC ^ 0x7D ^ (0xB3 ^ 0xC6))) continue;
                return null;
            }
        }
        return null;
    }

    private static gY gY_do(String string) {
        if (!(var_java_util_Vector_if.isEmpty())) {
            int n = 0;
            while ((n < var_java_util_Vector_if.size())) {
                gY gY2 = (gY)var_java_util_Vector_if.elementAt(n);
                String string2 = string;
                if (AutoChamEmBe.cfr_renamed_4(gY2.chuoiGiaTri.toLowerCase().trim().startsWith(string2.toLowerCase().trim()) ? 1 : 0)) {
                    return gY2;
                }
                ++n;
                if (((0xEF ^ 0xA6) & ~(0x3C ^ 0x75)) >= 0) continue;
                return null;
            }
        }
        return null;
    }

    public static void (int n, byte by2, String[] stringArray != null) {
        if (!(var_java_util_Vector_new.isEmpty())) {
            var_java_util_Vector_new.removeAllElements();
        }
        int n2 = 0;
        while ((n2 < stringArray.length)) {
            var_java_util_Vector_new.addElement(new ew_0(stringArray[n2], new dH(n2, n, by2)));
            ++n2;
            if ((108 + 69 - 129 + 149 ^ 11 + 71 - -12 + 99) != (("  ".length() ^ (0x79 ^ 0x38)) & (85 + 118 - -8 + 3 ^ 62 + 31 - 48 + 104 ^ -" ".length()))) continue;
            return;
        }
    }

    public final boolean boolean_do(String object) {
        block22: {
            block23: {
                if (!(TienIchGame.var_boolean_new)) break block22;
                if (!(this.soLuong == 3)) break block23;
                if (AutoChamEmBe.cfr_renamed_3(((String)object).indexOf("sữa"), -1) && AutoChamEmBe.cfr_renamed_3(((String)object).indexOf("thành công"), -1)) {
                    this.cfr_renamed_18 = 0;
                    TienIchGame.cfr_renamed_11();
                    return 1;
                }
                if (!AutoChamEmBe.cfr_renamed_3(((String)object).startsWith("Bạn không đủ") ? 1 : 0) || AutoChamEmBe.cfr_renamed_4(((String)object).startsWith("Chức năng chỉ dành cho") ? 1 : 0)) {
                    this.cfr_renamed_18 = 1;
                    TienIchGame.cfr_renamed_11();
                    return 1;
                }
                break block22;
            }
            if (AutoChamEmBe.cfr_renamed_4(((String)object).startsWith("Cây tình yêu đã hết tim") ? 1 : 0)) {
                TienIchGame.cfr_renamed_11();
                return 1;
            }
            if (!AutoChamEmBe.cfr_renamed_4(((String)object).startsWith("Bạn thu hoạch được ") ? 1 : 0) || !AutoChamEmBe.cfr_renamed_3(((String)object).indexOf(" tim từ cây tình yêu"), -1)) break block22;
            object = TienIchGame.java_lang_String_arr_do(TienIchGame.java_lang_String_arr_do((String)object, "Bạn thu hoạch được ")[1], " tim từ cây tình yêu");
            try {
                TienIchGame.var_int_if += Integer.parseInt(object[0]);
            }
            catch (NumberFormatException numberFormatException) {
                }
            if ("   ".length() <= 0) {
                return ((0x27 ^ 0x1D) & ~(0x8C ^ 0xB6)) != 0;
            }
            TienIchGame.cfr_renamed_11();
            return 1;
        }
        if ((var_boolean_int)) {
            if (AutoChamEmBe.cfr_renamed_4(((String)object).startsWith("Chức năng quản lý em bé chỉ được") ? 1 : 0)) {
                this.cfr_renamed_11 = 1;
                AutoChamEmBe.void_do();
                return 1;
            }
            if (AutoChamEmBe.cfr_renamed_4(((String)object).startsWith("Bạn cần có sữa") ? 1 : 0)) {
                this.cfr_renamed_12 = 1;
                AutoChamEmBe.void_do();
                return 1;
            }
        }
        if ((TienIchGame.var_boolean_int)) {
            if (AutoChamEmBe.cfr_renamed_4(((String)object).startsWith("Bạn đã hết sữa") ? 1 : 0)) {
                this.cfr_renamed_12 = 1;
                this.cfr_renamed_15 = 0;
                TienIchGame.hienThongBao();
                return 1;
            }
            if (AutoChamEmBe.cfr_renamed_4(((String)object).startsWith("Em bé đã ăn no") ? 1 : 0)) {
                this.cfr_renamed_15 = 1;
                TienIchGame.hienThongBao();
                return 1;
            }
            if (AutoChamEmBe.cfr_renamed_4(((String)object).startsWith("Yummi! Em bé đã được ăn ngon") ? 1 : 0)) {
                int n;
                this.var_int_if = 0;
                int n2 = ((String)object).lastIndexOf(58);
                if ((n2 != -1)) {
                    object = ((String)object).substring(n2 + 1);
                    try {
                        this.var_int_if = Integer.parseInt(TienIchGame.java_lang_String_if(((String)object).trim()));
                    }
                    catch (NumberFormatException numberFormatException) {
                        }
                    if (-" ".length() == (0x52 ^ 0x56)) {
                        return ((0x71 ^ 0x4D) & ~(0xBB ^ 0x87)) != 0;
                    }
                }
                if ((this.var_int_if >= 10)) {
                    n = 1;
                    if ("   ".length() != "   ".length()) {
                        return ((136 + 114 - 114 + 8 ^ 106 + 131 - 212 + 107) & (0x6F ^ 5 ^ (0x3B ^ 0x45) ^ -" ".length())) != 0;
                    }
                } else {
                    n = 0;
                }
                this.cfr_renamed_15 = n;
                TienIchGame.hienThongBao();
                return 1;
            }
        }
        if (!(!(TienIchGame.coTrangThai) || AutoChamEmBe.cfr_renamed_3(((String)object).startsWith("Nâng cấp thành công") ? 1 : 0) && AutoChamEmBe.cfr_renamed_3(((String)object).startsWith("Bạn cần cho bé ăn no") ? 1 : 0) && AutoChamEmBe.cfr_renamed_3(((String)object).startsWith("Chưa đến thời gian nâng cấp") ? 1 : 0) && AutoChamEmBe.cfr_renamed_3(((String)object).startsWith("Bạn cần đạt cấp độ hẹn hò") ? 1 : 0) && !AutoChamEmBe.cfr_renamed_4(((String)object).trim().endsWith("Không thể nâng cấp") ? 1 : 0))) {
            TienIchGame.void_int();
            return 1;
        }
        return super.boolean_do((String)object);
    }

        public final String toString() {
        return "Chăm em bé";
    }

    public static void (Vector vector != null) {
        if (!(var_java_util_Vector_if.isEmpty())) {
            var_java_util_Vector_if.removeAllElements();
        }
        int n = 0;
        while ((n < vector.size())) {
            ei ei2 = (ei)vector.elementAt(n);
            var_java_util_Vector_if.addElement(new gY(ei2.chuoiGiaTri, ei2.var_cp_do));
            ++n;
            if (((16 + 62 - -5 + 87 ^ 109 + 77 - 75 + 27) & (115 + 103 - 95 + 11 ^ 163 + 126 - 243 + 120 ^ -" ".length())) == 0) continue;
            return;
        }
    }

            static {
        AutoChamEmBe.cfr_renamed_5();
        var_java_util_Vector_if = new Vector();
        var_java_util_Vector_new = new Vector();
        var_java_util_Vector_do = new Vector();
        var_java_util_Vector_int = new Vector();
        cfr_renamed_2 = 0;
        var_boolean_int = 0;
        var_java_lang_Object_do = new Object();
        var_boolean_new = 1;
        coKichHoat = 1;
        dangChayAuto = 0;
        coTrangThai = 1;
    }

    public AutoChamEmBe() {
        int n;
        if ((var_boolean_new)) {
            n = 0;
            } else {
            n = 1;
        }
        this.soLuong = n;
        this.soLuongKhoa = 0;
        this.cfr_renamed_8 = 0;
        this.cfr_renamed_11 = 0;
        this.cfr_renamed_15 = 0;
        this.cfr_renamed_12 = 0;
        this.cfr_renamed_18 = 0;
        this.chuoiGiaTri = "Sữa dinh dưỡng";
        this.var_int_if = 0;
        if (!(var_java_util_Vector_if.isEmpty())) {
            var_java_util_Vector_if.removeAllElements();
        }
        if (!(var_java_util_Vector_new.isEmpty())) {
            var_java_util_Vector_new.removeAllElements();
        }
        if (!(var_java_util_Vector_do.isEmpty())) {
            var_java_util_Vector_do.removeAllElements();
        }
        if (!(var_java_util_Vector_int.isEmpty())) {
            var_java_util_Vector_int.removeAllElements();
        }
        AutoChamEmBe.cfr_renamed_4();
        AutoChamEmBe.void_do();
    }

        private static void cfr_renamed_5() {
        mangSoNguyen = new int[12];
        0 = (0x36 ^ 0x1D) & ~(0x3D ^ 0x16);
        1 = " ".length();
        3 = "   ".length();
        -1 = -" ".length();
        58 = 133 + 19 - -67 + 30 ^ 93 + 15 - 98 + 185;
        10 = 3 ^ 9;
        25 = 0x38 ^ 0x21;
        2 = "  ".length();
        17 = 0xBD ^ 0xAC;
        110 = 0xA3 ^ 0xA5 ^ (0x7A ^ 0x12);
        -105 = -(0x12 ^ 0x7B);
        21 = 0x3F ^ 0x49 ^ (0 ^ 0x63);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean boolean_if() {
        long l;
        block7: {
            cfr_renamed_2 = 1;
            l = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(15000L);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (" ".length() < 0) {
                    return ((7 ^ 0x33 ^ (0x50 ^ 0x2B)) & (84 + 69 - 31 + 105 ^ 108 + 122 - 88 + 30 ^ -" ".length())) != 0;
                }
            }
        }
        if ("   ".length() <= "  ".length()) {
            return ((0x69 ^ 0x61) & ~(0x37 ^ 0x3F)) != 0;
        }
        if (AutoChamEmBe.boolean_do((System.currentTimeMillis() - l < 15000L))) {
            return 1;
        }
        return 0;
    }

            public final synchronized void void_for() {
        block55: {
            if (!(AngelChip.duLieuNguoiChoi.var_short_byte != -1) || !(var_boolean_new) && !(coKichHoat) && !(coTrangThai)) {
                if ((this.nhiemVuHienTai != null)) {
                    TienIchGame.hienThongBao(1000L);
                    AutoController.cfr_renamed_2();
                    return;
                }
                AutoController.tatAuto();
                return;
            }
            if (AutoChamEmBe.cfr_renamed_1((System.currentTimeMillis() - this.var_boolean_int != 180000L))) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.void_if(16000L);
                return;
            }
            if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
                return;
            }
            if ((this.soLuong == 3)) {
                AutoChamEmBe bj_02 = this;
                if ((ef_0.soLuong != 25)) {
                    long l;
                    if ((GameCanvas.var_dL_do instanceof fw != 0) && AutoChamEmBe.boolean_do((l = System.currentTimeMillis() - bj_02.cfr_renamed_2 != 2000L))) {
                        TienIchGame.hienThongBao(2000L - l);
                    }
                    if ((TienIchGame.cfr_renamed_3(25))) {
                        TienIchGame.hienThongBao(3000L);
                    }
                    return;
                }
                int n = 0;
                int n2 = 0;
                int n3 = 0;
                while ((n2 < 10) && (!(n3 == 1) || !(AngelChip.duLieuNguoiChoi.mangSoNguyen[2] < 2) || (AngelChip.duLieuNguoiChoi.soLuong >= 2))) {
                    bj_02.cfr_renamed_18 = 0;
                    el_0.el_0_do().cfr_renamed_0(17, 10, n3);
                    if ((TienIchGame.cfr_renamed_4(5000L))) {
                        if ((bj_02.cfr_renamed_18)) {
                            if (!(dangChayAuto) || !(n3 == 0)) break;
                            n3 = 1;
                            TienIchGame.hienThongBao(100L);
                            if (-"  ".length() <= 0) continue;
                            return;
                        }
                        ++n;
                        TienIchGame.hienThongBao(100L);
                    }
                    ++n2;
                    if (-(129 + 111 - 99 + 24 ^ 38 + 49 - 10 + 84) <= 0) continue;
                    return;
                }
                if ((n > 0)) {
                    bj_02.soLuong = 1;
                    return;
                }
                AutoController.cfr_renamed_2();
                return;
            }
            if (!(ef_0.soLuong == 110)) break block55;
            if (!(this.cfr_renamed_8)) {
                eq.eq_do().cfr_renamed_0(-105);
                eq.eq_do().cfr_renamed_1();
                if ((AutoChamEmBe.boolean_if())) {
                    this.cfr_renamed_8 = 1;
                }
            }
            if ((var_java_util_Vector_if.isEmpty())) {
                this.cfr_renamed_8 = 0;
                AutoController.cfr_renamed_2();
                return;
            }
            switch (this.soLuong) {
                case 0: {
                    gY gY2;
                    if (!!(coKichHoat) || (coTrangThai)) {
                        this.soLuong = 1;
                        if (((0x5A ^ 0x17) & ~(0x8B ^ 0xC6)) != 0) {
                            return;
                        }
                    } else {
                        this.soLuong = -1;
                    }
                    if (!(gY2 = AutoChamEmBe.gY_do("Thu hoạch") != null)) break;
                    int n = TienIchGame.var_int_if;
                    gY2.cfr_renamed_0();
                    if ((TienIchGame.cfr_renamed_4(5000L))) {
                        if ((n != TienIchGame.var_int_if)) {
                            QuanLyRMS.cfr_renamed_5();
                        }
                        TienIchGame.hienThongBao(500L);
                    }
                    return;
                }
                case 1: {
                    this.soLuong = -1;
                    var_java_util_Vector_new.removeAllElements();
                    gY gY3 = AutoChamEmBe.gY_do("Baby");
                    if (!(gY3 != null)) break;
                    gY3.cfr_renamed_0();
                    if (((5000L != null))) {
                        TienIchGame.hienThongBao(500L);
                    }
                    if (!!(var_java_util_Vector_new.isEmpty())) break;
                    ew_0 ew_02 = ("Quản Lý Em Bé" == var_java_util_Vector_new);
                    if ((ew_02 != null)) {
                        this.cfr_renamed_11 = 0;
                        var_java_util_Vector_new.removeAllElements();
                        ew_02.cfr_renamed_0();
                        if (((5000L != null))) {
                            if ((this.cfr_renamed_11)) {
                                AutoController.cfr_renamed_2();
                                return;
                            }
                            if (!(var_java_util_Vector_new.isEmpty())) {
                                var_java_util_Vector_do.removeAllElements();
                                if (!(var_java_util_Vector_new.isEmpty())) {
                                    int n = 0;
                                    while ((n < var_java_util_Vector_new.size())) {
                                        ew_0 ew_03 = (ew_0)var_java_util_Vector_new.elementAt(n);
                                        var_java_util_Vector_do.addElement(ew_03);
                                        ++n;
                                        if (-"  ".length() <= 0) continue;
                                        return;
                                    }
                                }
                                var_java_util_Vector_new.removeAllElements();
                                this.chuoiGiaTri = "Sữa dinh dưỡng";
                                this.soLuong = 2;
                                TienIchGame.hienThongBao(500L);
                            }
                        }
                    }
                    return;
                }
                case 2: {
                    if ((var_java_util_Vector_do.isEmpty())) {
                        AutoController.cfr_renamed_2();
                        return;
                    }
                    if ((this.soLuongKhoa >= var_java_util_Vector_do.size())) {
                        this.soLuongKhoa = 0;
                        AutoController.cfr_renamed_2();
                        return;
                    }
                    try {
                        ew_0 ew_04 = (ew_0)var_java_util_Vector_do.elementAt(this.soLuongKhoa);
                        if ((ew_04 != null)) {
                            var_java_util_Vector_new.removeAllElements();
                            ew_04.cfr_renamed_0();
                            if (((15000L != null))) {
                                TienIchGame.hienThongBao(500L);
                            }
                            if (!(var_java_util_Vector_new.isEmpty()) && (ew_04 = ("Cho ăn" == var_java_util_Vector_new) != null)) {
                                var_java_util_Vector_int.removeAllElements();
                                if (!(var_java_util_Vector_new.isEmpty())) {
                                    int n = 0;
                                    while ((n < var_java_util_Vector_new.size())) {
                                        ew_0 ew_05 = (ew_0)var_java_util_Vector_new.elementAt(n);
                                        var_java_util_Vector_int.addElement(ew_05);
                                        ++n;
                                        if ((0x73 ^ 0x76) != 0) continue;
                                        return;
                                    }
                                }
                                var_java_util_Vector_new.removeAllElements();
                                this.cfr_renamed_12 = 0;
                                ew_04.cfr_renamed_0();
                                if (((15000L != null))) {
                                    if ((this.cfr_renamed_12)) {
                                        this.soLuong = 3;
                                        return;
                                    }
                                    TienIchGame.hienThongBao(500L);
                                }
                                if (!(var_java_util_Vector_new.isEmpty()) && (ew_04 = (this.chuoiGiaTri == var_java_util_Vector_new) != null)) {
                                    this.cfr_renamed_12 = 0;
                                    this.cfr_renamed_15 = 0;
                                    ew_04.cfr_renamed_0();
                                    if ((TienIchGame.cfr_renamed_3(15000L))) {
                                        if ((this.cfr_renamed_12)) {
                                            if ((this.chuoiGiaTri.equals("Sữa dinh dưỡng"))) {
                                                this.chuoiGiaTri = "Sữa nhập khẩu";
                                                return;
                                            }
                                            this.soLuong = 3;
                                            return;
                                        }
                                        if ((this.cfr_renamed_15)) {
                                            if ((coTrangThai) && (ew_04 = ("Nâng Cấp" == var_java_util_Vector_int) != null)) {
                                                ew_04.cfr_renamed_0();
                                                if ((TienIchGame.boolean_if(5000L))) {
                                                    TienIchGame.hienThongBao(500L);
                                                }
                                            }
                                            this.soLuongKhoa += 1;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                        }
                    catch (Exception exception) {
                        }
                    this.soLuongKhoa += 1;
                    return;
                }
                default: {
                    AutoController.cfr_renamed_2();
                }
            }
            return;
        }
        if ((ef_0.soLuong != 21)) {
            long l;
            if ((GameCanvas.var_dL_do instanceof fw != 0) && AutoChamEmBe.boolean_do(AutoChamEmBe.cfr_renamed_3(l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_2, 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
            }
            if ((TienIchGame.cfr_renamed_3(21))) {
                TienIchGame.hienThongBao(3500L);
            }
            return;
        }
        if ((TienIchGame.cfr_renamed_3(110))) {
            TienIchGame.hienThongBao(1000L);
        }
    }
}

