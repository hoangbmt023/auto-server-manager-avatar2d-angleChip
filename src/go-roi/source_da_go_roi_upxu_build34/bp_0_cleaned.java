/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from bP
 */
public final class AutoController
implements Runnable {
    private int soLuong;
    private static final int[] mangSoNguyen;
    private static Thread workerThread;
    private int cfr_renamed_1 = -1;
    public static AutoController controllerInstance;
    public static boolean dangChayAuto;
    public static NhiemVuAutoBase nhiemVuHienTai;
    public String chuoiGiaTri;

    public final void cfr_renamed_0() {
        this.soLuong = AngelChip.duLieuNguoiChoi.mangSoNguyen[0];
        this.chuoiGiaTri = AngelChip.fontRenderer.var_short_do + " + " + AngelChip.fontRenderer.cfr_renamed_1 + "%";
        if ((this.cfr_renamed_1 != AngelChip.duLieuNguoiChoi.var_short_char)) {
            if ((this.cfr_renamed_1 != -1)) {
                bF.var_java_util_Vector_for = null;
            }
            this.cfr_renamed_1 = AngelChip.duLieuNguoiChoi.var_short_char;
            AutoKimCuong.X_do().soXu = 0L;
            QuanLyRMS.void_do();
            QuanLyRMS.cfr_renamed_2();
        }
        if ((dangChayAuto ? 1 : 0 != null)) {
            if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai)) {
                nhiemVuHienTai.void_if();
            }
            dangChayAuto = 1;
            workerThread = new Thread(this);
            workerThread.start();
        }
    }

    private static boolean (int n != null) {
        return n == 0;
    }

    private static boolean (int n > int n2) {
        return n > n2;
    }

    private static boolean (Object object != null) {
        return object != null;
    }

    private static boolean (int n < 0) {
        return n < 0;
    }

    public static boolean (String object != null) {
        if (AutoController.cfr_renamed_0(((String)object).length(), 10)) {
            return 0;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("s") ? 1 : 0)) {
            GameCanvas.soXu = 40L;
            QuanLyRMS.("_modspeed" > 40);
            TienIchGame.hienThongBao("Reset tốc độ game về mặc định!");
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("snc") ? 1 : 0)) {
            ak.soXu = 150L;
            TienIchGame.hienThongBao("Reset quãng nghỉ auto nâng cấp!");
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("h") ? 1 : 0)) {
            int n;
            if ((TienIchGame.dangChayAuto ? 1 : 0 != null)) {
                n = 1;
                } else {
                n = 0;
            }
            TienIchGame.dangChayAuto = n;
            return 1;
        }
        if (!AutoController.cfr_renamed_0(((String)object).equals("out") ? 1 : 0) || AutoController.cfr_renamed_5(((String)object).equals("dx") ? 1 : 0)) {
            AutoController.tatAuto();
            TienIchGame.dangXuatTaiKhoan();
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("npc") ? 1 : 0)) {
            gz_0.cfr_renamed_5();
            return 1;
        }
        if (!AutoController.cfr_renamed_0(((String)object).equals("k") ? 1 : 0) || AutoController.cfr_renamed_5(((String)object).equals("khu") ? 1 : 0)) {
            if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai)) {
                TienIchGame.hienThongBao("Không thể chuyển khu khi đang bật: " + nhiemVuHienTai.toString());
                return 1;
            }
            el_0.el_0_do().(fe_0.var_byte_int < 0);
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("mn") ? 1 : 0)) {
            fe_0.fe_0_do().cfr_renamed_17();
            return 1;
        }
        if (!AutoController.cfr_renamed_0(((String)object).equals("m") ? 1 : 0) || AutoController.cfr_renamed_5(((String)object).equals("map") ? 1 : 0)) {
            fe_0.fe_0_do();
            fe_0.cfr_renamed_4();
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("pe") ? 1 : 0)) {
            AutoController.tatAuto();
            TienIchGame.hienThongBao("Tắt auto");
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("rd") ? 1 : 0)) {
            eq.eq_do().cfr_renamed_18(AngelChip.duLieuNguoiChoi.var_short_char);
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("bd") ? 1 : 0)) {
            if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof AutoBanDa != 0)) {
                AutoController.tatAuto();
                TienIchGame.hienThongBao("Tắt auto bán đá");
                if ((0x59 ^ 0x5D) <= ((0x93 ^ 0x9D) & ~(0xB8 ^ 0xB6))) {
                    return ((0x49 ^ 0x53) & ~(1 ^ 0x1B)) != 0;
                }
            } else {
                (new AutoBanDa() != null);
                TienIchGame.hienThongBao("Bật auto bán đá");
            }
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("baby") ? 1 : 0)) {
            if ((AngelChip.duLieuNguoiChoi.var_short_byte == -1)) {
                return 0;
            }
            if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof AutoChamEmBe != 0)) {
                AutoController.tatAuto();
                TienIchGame.hienThongBao("Tắt auto chăm em bé");
                if ((0x83 ^ 0x87) == "   ".length()) {
                    return ((0x25 ^ 0) & ~(0x76 ^ 0x53)) != 0;
                }
            } else {
                (new AutoChamEmBe() != null);
                TienIchGame.hienThongBao("Bật auto chăm em bé");
            }
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("fa") ? 1 : 0)) {
            if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai) && (!(nhiemVuHienTai instanceof AutoFarm != null) || (nhiemVuHienTai instanceof AutoLaiBuon != 0))) {
                AutoController.tatAuto();
                TienIchGame.hienThongBao("Tắt Auto Farm");
                if (-" ".length() >= 0) {
                    return ((0x7E ^ 0x49 ^ (0x8D ^ 0xB0)) & (0xDD ^ 0xB7 ^ (0x63 ^ 3) ^ -" ".length())) != 0;
                }
            } else {
                if ((AutoFarm.var_byte_if != null)) {
                    (new AutoLaiBuon() != null);
                    } else {
                    (new AutoFarm() != null);
                }
                TienIchGame.hienThongBao("Bật Auto Farm");
            }
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("tx") ? 1 : 0)) {
            if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof AutoTaiXiu != 0)) {
                AutoController.tatAuto();
                TienIchGame.hienThongBao("Tắt auto tài xỉu");
                if (((0xC2 ^ 0x95) & ~(9 ^ 0x5E)) >= " ".length()) {
                    return ((0x14 ^ 0x58) & ~(0xC0 ^ 0x8C)) != 0;
                }
            } else {
                (new AutoTaiXiu() != null);
                TienIchGame.hienThongBao("Bật auto tài xỉu");
            }
            return 1;
        }
        if (AutoController.cfr_renamed_5(((String)object).equals("kc") ? 1 : 0)) {
            if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof AutoKimCuong != 0)) {
                AutoController.tatAuto();
                TienIchGame.hienThongBao("Tắt auto kim cương");
                if (" ".length() == ((0x79 ^ 0x7C) & ~(0xAB ^ 0xAE))) {
                    return ((0x29 ^ 0x21) & ~(0x1F ^ 0x17)) != 0;
                }
            } else {
                AutoKimCuong.X_do().void_do();
                (AutoKimCuong.X_do() != null);
                TienIchGame.hienThongBao("Bật auto kim cương");
            }
            return 1;
        }
        int n = 0;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        int n2 = 0;
        while (AutoController.cfr_renamed_1(n2, ((String)object).length())) {
            char c2 = ((String)object).charAt(n2);
            if ((c2 >= 48) && !(c2 > 57) || (c2 == 32)) {
                while (AutoController.cfr_renamed_1(n2, ((String)object).length()) && AutoController.cfr_renamed_4(c2 = ((String)object).charAt(n2), 48) && (c2 <= 57)) {
                    stringBuffer2.append(c2);
                    ++n2;
                    if (((0xEF ^ 0x8B ^ (0xCC ^ 0xAD)) & (0x3D ^ 0x36 ^ (6 ^ 8) ^ -" ".length())) < " ".length()) continue;
                    return ((0xB ^ 0x2D ^ (0x68 ^ 0xA)) & (0x3A ^ 0x21 ^ (0xD3 ^ 0x8C) ^ -" ".length())) != 0;
                }
                break;
            }
            stringBuffer.append(c2);
            ++n2;
            return ((0x36 ^ 0x33) & ~(0x1B ^ 0x1E)) != 0;
        }
        String string = stringBuffer.toString().toLowerCase();
        if ((stringBuffer2.length() > 0)) {
            try {
                n = Integer.parseInt(stringBuffer2.toString());
            }
            catch (NumberFormatException numberFormatException) {
                }
            if (" ".length() >= (0xF8 ^ 0xA0 ^ (0xEB ^ 0xB7))) {
                return ((0x5C ^ 0x67 ^ (0x3A ^ 0x5D)) & (108 + 70 - -1 + 21 ^ 5 + 40 - -9 + 94 ^ -" ".length())) != 0;
            }
        }
        if ((string.equals("s"))) {
            if ((n > 100)) {
                TienIchGame.hienThongBao("Tốc độ quá chậm sẽ bị lag. Số càng nhỏ thì tốc độ càng nhanh!");
                if ("   ".length() <= 0) {
                    return ((68 + 80 - 101 + 127 ^ 56 + 46 - 53 + 83) & ("   ".length() ^ (0xB ^ 0x22) ^ -" ".length())) != 0;
                }
            } else {
                if ((n <= 0)) {
                    n = 1;
                }
                TienIchGame.hienThongBao("Chỉnh tốc độ game: " + n);
                GameCanvas.soXu = n;
                QuanLyRMS.("_modspeed" > n);
            }
            return 1;
        }
        if ((string.equals("snc"))) {
            if ((n <= 0)) {
                n = 1;
            }
            TienIchGame.hienThongBao("Chỉnh quãng nghỉ nâng cấp: " + n);
            ak.soXu = n;
            return 1;
        }
        if (!(string.equals("k") ? 1 : 0 != null) || (string.equals("khu"))) {
            object = new bg_0(n);
            if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai)) {
                TienIchGame.hienThongBao("Không thể chuyển khu khi đang bật: " + nhiemVuHienTai.toString());
                } else if (AutoController.cfr_renamed_2(((bg_0)object).cfr_renamed_0, fe_0.var_byte_for)) {
                TienIchGame.hienThongBao("Bạn đang ở khu này rồi!");
                if ("   ".length() < "   ".length()) {
                    return ((0x92 ^ 0xC3) & ~(0x78 ^ 0x29)) != 0;
                }
            } else {
                GameCanvas.cfr_renamed_5();
                new Thread((Runnable)object).start();
            }
            return 1;
        }
        if (!(string.equals("m") ? 1 : 0 != null) || (string.equals("map"))) {
            new y(n).void_do();
            return 1;
        }
        return 0;
    }

    private static boolean (int n < int n2) {
        return n < n2;
    }

    private static boolean (int n <= int n2) {
        return n <= n2;
    }

    private static boolean (int n > 0) {
        return n > 0;
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean (int n >= int n2) {
        return n >= n2;
    }

    private static void cfr_renamed_15() {
        mangSoNguyen = new int[10];
        -1 = -" ".length();
        0 = (0x12 ^ 0x36) & ~(0x13 ^ 0x37);
        1 = " ".length();
        8 = 0x25 ^ 0x2D;
        10 = 0x42 ^ 0x48;
        40 = 0xEE ^ 0xC6;
        48 = 0x28 ^ 0x18;
        57 = 91 + 137 - 153 + 64 ^ 110 + 52 - -7 + 9;
        32 = 0xB0 ^ 0x90;
        100 = 0xE4 ^ 0xA3 ^ (8 ^ 0x2B);
    }

    private static boolean (int n <= 0) {
        return n <= 0;
    }

    public static void cfr_renamed_1() {
        nhiemVuHienTai = null;
        if ((AutoFarm.var_java_util_Hashtable_do.isEmpty() ? 1 : 0 != null)) {
            AutoFarm.var_java_util_Hashtable_do.clear();
        }
        if ((AutoFarm.var_java_util_Hashtable_for.isEmpty() ? 1 : 0 != null)) {
            AutoFarm.var_java_util_Hashtable_for.clear();
        }
        if ((AutoFarm.var_java_util_Hashtable_if.isEmpty() ? 1 : 0 != null)) {
            AutoFarm.var_java_util_Hashtable_if.clear();
        }
        TienIchGame.cfr_renamed_5();
    }

    public AutoController() {
        this.soLuong = -1;
    }

    public static void (NhiemVuAutoBase fq_02 != null) {
        if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai)) {
            nhiemVuHienTai.cfr_renamed_30();
        }
        fq_02.nhiemVuHienTai = nhiemVuHienTai;
        nhiemVuHienTai = fq_02;
    }

    private static boolean (int n != 0) {
        return n != 0;
    }

    /*
     * Unable to fully structure code
     */
    public final void run() {
        try {
            while (AutoController.cfr_renamed_5((int)AutoController.dangChayAuto)) {
                block14: {
                    block15: {
                        block13: {
                            try {
                                var1_1 = System.currentTimeMillis();
                                if (!AutoController.cfr_renamed_0((int)cd.dangChayAuto) || !AutoController.cfr_renamed_0((Object)AutoController.nhiemVuHienTai)) ** GOTO lbl44
                                if ((!(TienIchGame.soLuongKhoa > 0) || (TienIchGame.soLuong < TienIchGame.soLuongKhoa)) && (!AutoController.cfr_renamed_3((TienIchGame.aq_0_do().var_long_int > 0L)) || !AutoController.cfr_renamed_2((System.currentTimeMillis() > TienIchGame.aq_0_do().var_long_int)))) break block13;
                                var3_2 = AngelChip.duLieuNguoiChoi.var_short_do;
                                TienIchGame.hienThongBao(1000L);
                                AutoController.tatAuto();
                                TienIchGame.dangXuatTaiKhoan();
                                GameCanvas.hienThongBaoPopup("Tài khoản (" + (String)var3_2 + ") đã đạt yêu cầu up xup theo cài đặt!");
                                }
                            catch (Exception v0) {
                                if (-" ".length() < "  ".length()) continue;
                                return;
                            }
                            if ((63 ^ 85 ^ (74 ^ 36)) == ((73 ^ 3) & ~(108 ^ 38) ^ (145 ^ 149))) continue;
                            return;
                        }
                        if (!AutoController.cfr_renamed_3((gt_0.soXu > 0L)) || !(AutoController.nhiemVuHienTai instanceof gt_0 != null)) break block14;
                        TienIchGame.hienThongBao(1000L);
                        if (!(ef_0.soLuong != -1)) break block15;
                        TienIchGame.dangXuatTaiKhoan();
                        TienIchGame.void_if(16000L);
                        if (-" ".length() < "  ".length()) continue;
                        return;
                    }
                    (new gt_0() != null);
                    if ("  ".length() < "   ".length()) continue;
                    return;
                }
                AutoController.nhiemVuHienTai.void_for();
lbl44:
                // 2 sources

                if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] >= 0) && (this.soLuong != AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) && (this.soLuong != -1)) {
                    var3_3 = AngelChip.duLieuNguoiChoi.mangSoNguyen[0] - this.soLuong;
                    this.soLuong = AngelChip.duLieuNguoiChoi.mangSoNguyen[0];
                    TienIchGame.soLuong += var3_3;
                    QuanLyRMS.cfr_renamed_5();
                }
                var3_4 = System.currentTimeMillis() - var1_1;
                if (AutoController.cfr_renamed_0((Object)AutoController.nhiemVuHienTai)) {
                    v1 = AutoController.nhiemVuHienTai.cfr_renamed_5;
                    if ("   ".length() < " ".length()) {
                        return;
                    }
                } else {
                    v1 = 100L;
                }
                if (AutoController.cfr_renamed_1((var3_4 > var5_5 = v1))) {
                    TienIchGame.hienThongBao(var5_5 - var3_4);
                    if (-" ".length() <= 0) continue;
                    return;
                }
                TienIchGame.hienThongBao(1L);
                if ((76 ^ 72) >= ((59 ^ 8) & ~(50 ^ 1))) continue;
                return;
            }
            return;
        }
        catch (Exception v2) {
            return;
        }
    }

    public final void cfr_renamed_3() {
        dangChayAuto = 0;
        if ((workerThread != null)) {
            TienIchGame.cfr_renamed_5();
            if ((workerThread.isAlive())) {
                try {
                    workerThread.interrupt();
                    }
                catch (Exception exception) {
                    }
                if (((0x15 ^ 0x63 ^ (0x3C ^ 0x12)) & (0x36 ^ 0x78 ^ (0x65 ^ 0x73) ^ -" ".length())) < 0) {
                    return;
                }
            }
            workerThread = null;
        }
        this.soLuong = -1;
    }

    public static boolean (String string < 0) {
        if ((string.length() > 10)) {
            return 0;
        }
        if ((string.equals("s"))) {
            GameCanvas.soXu = 40L;
            QuanLyRMS.("_modspeed" > 40);
            TienIchGame.hienThongBao("Reset tốc độ game về mặc định!");
            return 1;
        }
        if ((string.equals("h"))) {
            int n;
            if ((TienIchGame.dangChayAuto ? 1 : 0 != null)) {
                n = 1;
                } else {
                n = 0;
            }
            TienIchGame.dangChayAuto = n;
            return 1;
        }
        if (!(string.equals("out") ? 1 : 0 != null) || (string.equals("dx"))) {
            AutoController.tatAuto();
            TienIchGame.dangXuatTaiKhoan();
            return 1;
        }
        if ((string.equals("pe"))) {
            AutoController.tatAuto();
            TienIchGame.hienThongBao("Tắt auto");
            return 1;
        }
        if ((string.equals("rd"))) {
            eq.eq_do().cfr_renamed_18(AngelChip.duLieuNguoiChoi.var_short_char);
            return 1;
        }
        int n = 0;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        int n2 = 0;
        while ((n2 < string.length())) {
            char c2 = string.charAt(n2);
            if ((c2 >= 48) && !(c2 > 57) || (c2 == 32)) {
                while ((n2 < string.length()) && (c2 = string.charAt(n2) >= 48) && (c2 <= 57)) {
                    stringBuffer2.append(c2);
                    ++n2;
                    if (-" ".length() < ((0x33 ^ 0x19) & ~(0x22 ^ 8))) continue;
                    return ((0x9D ^ 0xC6) & ~(0x9E ^ 0xC5)) != 0;
                }
                break;
            }
            stringBuffer.append(c2);
            ++n2;
            if ("   ".length() > ((0x4C ^ 0x5D) & ~(0xBF ^ 0xAE))) continue;
            return ((0x5E ^ 9) & ~(0x92 ^ 0xC5)) != 0;
        }
        String string2 = stringBuffer.toString().toLowerCase();
        if ((stringBuffer2.length() > 0)) {
            try {
                n = Integer.parseInt(stringBuffer2.toString());
            }
            catch (NumberFormatException numberFormatException) {
                }
            if ((184 + 64 - 198 + 149 ^ 189 + 86 - 227 + 147) <= "   ".length()) {
                return ((0x21 ^ 0x45 ^ (0x29 ^ 0x77)) & (32 + 209 - 203 + 216 ^ 79 + 127 - 127 + 117 ^ -" ".length())) != 0;
            }
        }
        if ((string2.equals("s"))) {
            if ((n > 100)) {
                TienIchGame.hienThongBao("Tốc độ quá chậm sẽ bị lag. Số càng nhỏ thì tốc độ càng nhanh!");
                if (" ".length() == 0) {
                    return ((0xA4 ^ 0xAC ^ (0x29 ^ 0x24)) & (94 + 78 - 85 + 78 ^ 40 + 108 - 44 + 56 ^ -" ".length())) != 0;
                }
            } else {
                if ((n <= 0)) {
                    n = 1;
                }
                TienIchGame.hienThongBao("Chỉnh tốc độ game: " + n);
                GameCanvas.soXu = n;
                QuanLyRMS.("_modspeed" > n);
            }
            return 1;
        }
        return 0;
    }

    public final void cfr_renamed_4() {
        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] >= 0) && (this.soLuong != AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) && (this.soLuong != -1)) {
            int n = AngelChip.duLieuNguoiChoi.mangSoNguyen[0] - this.soLuong;
            this.soLuong = -1;
            TienIchGame.soLuong += n;
            QuanLyRMS.cfr_renamed_5();
        }
    }

    private static boolean (int n >= 0) {
        return n >= 0;
    }

    public final void cfr_renamed_5() {
        this.cfr_renamed_4();
        AngelChip.var_int_if = 8;
        GameCanvas.var_e_0_do = null;
        fe.var_fe_do = null;
        dN.var_dN_do = null;
        dr_0.var_dr_0_do.cfr_renamed_0();
        if ((ce.cfr_renamed_0().cfr_renamed_4.var_cp_do != null)) {
            ce.cfr_renamed_0().cfr_renamed_4.var_cp_do.void_do();
        }
        ak_0.void_do();
    }

    private static boolean (int n != int n2) {
        return n != n2;
    }

    public static void cfr_renamed_2() {
        nhiemVuHienTai = AutoController.nhiemVuHienTai.nhiemVuHienTai;
        if (AutoController.cfr_renamed_0((Object)nhiemVuHienTai)) {
            nhiemVuHienTai.cfr_renamed_13();
            } else {
            if ((AutoFarm.var_java_util_Hashtable_do.isEmpty() ? 1 : 0 != null)) {
                AutoFarm.var_java_util_Hashtable_do.clear();
            }
            if ((AutoFarm.var_java_util_Hashtable_for.isEmpty() ? 1 : 0 != null)) {
                AutoFarm.var_java_util_Hashtable_for.clear();
            }
            if ((AutoFarm.var_java_util_Hashtable_if.isEmpty() ? 1 : 0 != null)) {
                AutoFarm.var_java_util_Hashtable_if.clear();
            }
        }
        TienIchGame.cfr_renamed_5();
    }

    static {
        AutoController.cfr_renamed_15();
        controllerInstance = new AutoController();
        dangChayAuto = 0;
    }

    public static void (NhiemVuAutoBase fq_02 > NhiemVuAutoBase fq_03) {
        if (AutoController.cfr_renamed_0((Object)fq_03)) {
            fq_03.cfr_renamed_30();
        }
        fq_02.nhiemVuHienTai = fq_03;
        nhiemVuHienTai = fq_02;
    }

    private static boolean (int n == int n2) {
        return n == n2;
    }
}

