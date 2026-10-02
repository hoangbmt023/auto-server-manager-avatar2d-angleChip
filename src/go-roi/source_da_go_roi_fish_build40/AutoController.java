/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from bX
 */
public final class AutoController
implements Runnable {
    private int soLuong;
    private static final int[] mangSoNguyen;
    private static Thread workerThread;
    private int cfr_renamed_0 = -1;
    public String chuoiGiaTri;
    public static AutoController controllerInstance;
    public static NhiemVuAutoBase nhiemVuHienTai;
    public static boolean dangChayAuto;

    /*
     * Unable to fully structure code
     */
    public final void run() {
        try {
            while (AutoController.cfr_renamed_4((int)AutoController.dangChayAuto)) {
                block14: {
                    block15: {
                        block13: {
                            try {
                                var1_1 = System.currentTimeMillis();
                                if (!AutoController.cfr_renamed_2((int)cR.coTrangThai) || !AutoController.cfr_renamed_1((Object)AutoController.nhiemVuHienTai)) ** GOTO lbl44
                                if ((!(TienIchGame.var_int_int > 0) || (TienIchGame.var_int_if < TienIchGame.var_int_int)) && (!AutoController.cfr_renamed_3((TienIchGame.aq_0_do().soXu >= 0L)) || !AutoController.cfr_renamed_0((System.currentTimeMillis() >= TienIchGame.aq_0_do().soXu)))) break block13;
                                var3_2 = AngelChip.duLieuNguoiChoi.soLuong;
                                TienIchGame.void_if(1000L);
                                AutoController.tatAuto();
                                TienIchGame.dangXuatTaiKhoan();
                                GameCanvas.hienThongBaoPopup("Tài khoản (" + (String)var3_2 + ") đã đạt yêu cầu up xup theo cài đặt!");
                                }
                            catch (Exception v0) {
                                if ((21 ^ 17) >= 0) continue;
                                return;
                            }
                            if ((28 ^ 51 ^ (40 ^ 3)) != -" ".length()) continue;
                            return;
                        }
                        if (!AutoController.cfr_renamed_3((fu_0.soXu >= 0L)) || !(AutoController.nhiemVuHienTai instanceof fu_0 == 0)) break block14;
                        TienIchGame.void_if(1000L);
                        if (!(fh.var_int_char != -1)) break block15;
                        TienIchGame.dangXuatTaiKhoan();
                        TienIchGame.hienThongBao(15000L);
                        return;
                    }
                    (new fu_0() != null);
                    if (-" ".length() != ((29 ^ 108 ^ (62 ^ 122)) & (173 ^ 168 ^ (8 ^ 56) ^ -" ".length()))) continue;
                    return;
                }
                AutoController.nhiemVuHienTai.d_();
lbl44:
                // 2 sources

                if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] >= 0) && (this.soLuong != AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) && (this.soLuong != -1)) {
                    var3_3 = AngelChip.duLieuNguoiChoi.mangSoNguyen[0] - this.soLuong;
                    this.soLuong = AngelChip.duLieuNguoiChoi.mangSoNguyen[0];
                    TienIchGame.var_int_if += var3_3;
                    QuanLyRMS.cfr_renamed_3();
                }
                var3_4 = System.currentTimeMillis() - var1_1;
                if (AutoController.cfr_renamed_1((Object)AutoController.nhiemVuHienTai)) {
                    v1 = AutoController.nhiemVuHienTai.cfr_renamed_5;
                    if (-"   ".length() > 0) {
                        return;
                    }
                } else {
                    v1 = 100L;
                }
                if (AutoController.cfr_renamed_5((var3_4 >= var5_5 = v1))) {
                    TienIchGame.void_if(var5_5 - var3_4);
                    if (((82 ^ 3) & ~(106 ^ 59)) >= 0) continue;
                    return;
                }
                TienIchGame.void_if(1L);
                if (-"   ".length() < 0) continue;
                return;
            }
            return;
        }
        catch (Exception v2) {
            return;
        }
    }

        public final void cfr_renamed_1() {
        dangChayAuto = 0;
        if ((workerThread != null)) {
            TienIchGame.cfr_renamed_9();
            if ((workerThread.isAlive())) {
                try {
                    workerThread.interrupt();
                    }
                catch (Exception exception) {
                    }
                if ((0xA5 ^ 0xA1) <= " ".length()) {
                    return;
                }
            }
            workerThread = null;
        }
        if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai)) {
            nhiemVuHienTai.cfr_renamed_5();
        }
        this.soLuong = -1;
    }

                public AutoController() {
        this.soLuong = -1;
    }

            static {
        AutoController.cfr_renamed_6();
        controllerInstance = new AutoController();
        dangChayAuto = 0;
    }

        private static void cfr_renamed_6() {
        mangSoNguyen = new int[10];
        -1 = -" ".length();
        0 = (0xCB ^ 0x84 ^ (0x30 ^ 0x5F)) & (0x31 ^ 0x1C ^ (2 ^ 0xF) ^ -" ".length());
        1 = " ".length();
        8 = 6 ^ 0x5B ^ (0xD ^ 0x58);
        10 = 0x47 ^ 0x4D;
        40 = 0xDD ^ 0xA1 ^ (0x42 ^ 0x16);
        48 = 0xD9 ^ 0x98 ^ (0xC7 ^ 0xB6);
        57 = 0x33 ^ 0xA;
        32 = 0x2F ^ 0xF;
        100 = 0x76 ^ 0 ^ (0x57 ^ 0x45);
    }

    public final void cfr_renamed_0() {
        this.cfr_renamed_3();
        AngelChip.soLuong = 8;
        GameCanvas.var_aa_do = null;
        gd_0.var_gd_0_do = null;
        ep.var_ep_do = null;
        dr_0.var_dr_0_do.cfr_renamed_1();
        if ((cs_0.cfr_renamed_1().cfr_renamed_5.var_de_do != null)) {
            cs_0.cfr_renamed_1().cfr_renamed_5.var_de_do.void_do();
        }
        bz.void_do();
    }

    public static void cfr_renamed_2() {
        nhiemVuHienTai = AutoController.nhiemVuHienTai.nhiemVuHienTai;
        if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai)) {
            nhiemVuHienTai.cfr_renamed_16();
            if (" ".length() > "  ".length()) {
                return;
            }
        } else {
            if (!(AutoFarm.var_java_util_Hashtable_do.isEmpty())) {
                AutoFarm.var_java_util_Hashtable_do.clear();
            }
            if (!(AutoFarm.var_java_util_Hashtable_for.isEmpty())) {
                AutoFarm.var_java_util_Hashtable_for.clear();
            }
            if (!(AutoFarm.var_java_util_Hashtable_if.isEmpty())) {
                AutoFarm.var_java_util_Hashtable_if.clear();
            }
        }
        TienIchGame.cfr_renamed_9();
    }

    public static void (NhiemVuAutoBase ha2 != null) {
        if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai)) {
            nhiemVuHienTai.cfr_renamed_30();
        }
        ha2.nhiemVuHienTai = nhiemVuHienTai;
        nhiemVuHienTai = ha2;
    }

    public final void cfr_renamed_3() {
        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] >= 0) && (this.soLuong != AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) && (this.soLuong != -1)) {
            int n = AngelChip.duLieuNguoiChoi.mangSoNguyen[0] - this.soLuong;
            this.soLuong = -1;
            TienIchGame.var_int_if += n;
            QuanLyRMS.cfr_renamed_3();
        }
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public static void cfr_renamed_4() {
        if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai)) {
            nhiemVuHienTai.void_a_();
            nhiemVuHienTai = null;
        }
        if (!(AutoFarm.var_java_util_Hashtable_do.isEmpty())) {
            AutoFarm.var_java_util_Hashtable_do.clear();
        }
        if (!(AutoFarm.var_java_util_Hashtable_for.isEmpty())) {
            AutoFarm.var_java_util_Hashtable_for.clear();
        }
        if (!(AutoFarm.var_java_util_Hashtable_if.isEmpty())) {
            AutoFarm.var_java_util_Hashtable_if.clear();
        }
        TienIchGame.cfr_renamed_9();
    }

                public final void cfr_renamed_5() {
        this.soLuong = AngelChip.duLieuNguoiChoi.mangSoNguyen[0];
        this.chuoiGiaTri = AngelChip.var_by_do.var_short_do + " + " + AngelChip.var_by_do.cfr_renamed_5 + "%";
        if ((this.cfr_renamed_0 != AngelChip.duLieuNguoiChoi.var_short_goto)) {
            if ((this.cfr_renamed_0 != -1)) {
                dR.var_java_util_Vector_do = null;
            }
            fv_0.var_java_util_Vector_do = null;
            this.cfr_renamed_0 = AngelChip.duLieuNguoiChoi.var_short_goto;
            AutoCauCa.bs_0_do().var_long_if = 0L;
            aj.aj_do().soXu = 0L;
            QuanLyRMS.void_do();
            QuanLyRMS.cfr_renamed_4();
        }
        if (!(dangChayAuto)) {
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai)) {
                nhiemVuHienTai.void_for();
            }
            dangChayAuto = 1;
            workerThread = new Thread(this);
            workerThread.start();
        }
    }

    public static boolean (String object != null) {
        if (AutoController.cfr_renamed_4(((String)object).length(), 10)) {
            return 0;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("s") ? 1 : 0)) {
            GameCanvas.soXu = 40L;
            QuanLyRMS.docDuLieu("_modspeed", 40);
            TienIchGame.void_if("Reset tốc độ game về mặc định!");
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("snc") ? 1 : 0)) {
            cl.soXu = 150L;
            TienIchGame.void_if("Reset quãng nghỉ auto nâng cấp!");
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("h") ? 1 : 0)) {
            int n;
            if (!(TienIchGame.cfr_renamed_7)) {
                n = 1;
                if (-"  ".length() >= 0) {
                    return ((190 + 17 - -2 + 39 ^ 134 + 135 - 257 + 159) & (0x3A ^ 0x6E ^ (0x14 ^ 0x13) ^ -" ".length())) != 0;
                }
            } else {
                n = 0;
            }
            TienIchGame.cfr_renamed_7 = n;
            return 1;
        }
        if (!AutoController.cfr_renamed_2(((String)object).equals("out") ? 1 : 0) || AutoController.cfr_renamed_4(((String)object).equals("dx") ? 1 : 0)) {
            AutoController.tatAuto();
            TienIchGame.dangXuatTaiKhoan();
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("npc") ? 1 : 0)) {
            gg_0.cfr_renamed_2();
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("fvc") ? 1 : 0)) {
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof gh_0 != 0)) {
                AutoController.tatAuto();
                TienIchGame.void_if("Tắt auto");
                if (-" ".length() >= 0) {
                    return ((215 + 154 - 367 + 232 ^ 139 + 37 - 116 + 137) & (177 + 154 - 277 + 134 ^ 91 + 4 - 26 + 78 ^ -" ".length())) != 0;
                }
            } else if ((AngelChip.duLieuNguoiChoi.cfr_renamed_23 != -1)) {
                if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai)) {
                    AutoController.tatAuto();
                }
                GameCanvas.var_ca_do.cfr_renamed_1("Nhập số lần (để trống: KGH)", new av(), 1);
                GameCanvas.var_ca_do.cfr_renamed_1(String.valueOf(gh_0.cfr_renamed_1));
                if ("  ".length() == 0) {
                    return ((79 + 112 - 167 + 128 ^ 36 + 182 - 101 + 74) & (0x34 ^ 0x6A ^ (0x78 ^ 1) ^ -" ".length())) != 0;
                }
            } else {
                GameCanvas.hienThongBaoPopup("Bạn chưa kết hôn!");
            }
            return 1;
        }
        if (!AutoController.cfr_renamed_2(((String)object).equals("k") ? 1 : 0) || AutoController.cfr_renamed_4(((String)object).equals("khu") ? 1 : 0)) {
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai)) {
                TienIchGame.void_if("Không thể chuyển khu khi đang bật: " + nhiemVuHienTai.toString());
                return 1;
            }
            fn.fn_do().cfr_renamed_0(go_0.var_byte_for);
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("mn") ? 1 : 0)) {
            go_0.go_0_do().cfr_renamed_21();
            return 1;
        }
        if (!AutoController.cfr_renamed_2(((String)object).equals("m") ? 1 : 0) || AutoController.cfr_renamed_4(((String)object).equals("map") ? 1 : 0)) {
            go_0.go_0_do();
            go_0.cfr_renamed_32();
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("pe") ? 1 : 0)) {
            AutoController.tatAuto();
            TienIchGame.void_if("Tắt auto");
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("rd") ? 1 : 0)) {
            ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("bd") ? 1 : 0)) {
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof c != 0)) {
                AutoController.tatAuto();
                TienIchGame.void_if("Tắt auto bán đá");
                if ((0x11 ^ 0x15) <= "  ".length()) {
                    return ((0x67 ^ 0x2C) & ~(0x6D ^ 0x26)) != 0;
                }
            } else {
                (new c() != null);
                TienIchGame.void_if("Bật auto bán đá");
            }
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("baby") ? 1 : 0)) {
            if ((AngelChip.duLieuNguoiChoi.cfr_renamed_23 == -1)) {
                return 0;
            }
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof bp_0 != 0)) {
                AutoController.tatAuto();
                TienIchGame.void_if("Tắt auto chăm em bé");
                } else {
                (new bp_0() != null);
                TienIchGame.void_if("Bật auto chăm em bé");
            }
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("fa") ? 1 : 0)) {
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai) && (!(nhiemVuHienTai instanceof AutoFarm == 0) || (nhiemVuHienTai instanceof hn != 0))) {
                AutoController.tatAuto();
                TienIchGame.void_if("Tắt Auto Farm");
                if ("   ".length() < 0) {
                    return ((43 + 50 - 30 + 66 ^ 24 + 52 - -27 + 62) & (0x45 ^ 0x62 ^ "   ".length() ^ -" ".length())) != 0;
                }
            } else {
                if ((AutoFarm.var_byte_do == 0)) {
                    (new hn() != null);
                    } else {
                    (new AutoFarm() != null);
                }
                TienIchGame.void_if("Bật Auto Farm");
            }
            return 1;
        }
        if (!AutoController.cfr_renamed_2(((String)object).equals("af") ? 1 : 0) || AutoController.cfr_renamed_4(((String)object).equals("cc") ? 1 : 0)) {
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof AutoCauCa != 0)) {
                AutoController.tatAuto();
                TienIchGame.void_if("Tắt auto câu cá");
                if ((0xA7 ^ 0xA3) == 0) {
                    return ((0xE ^ 4) & ~(0x10 ^ 0x1A)) != 0;
                }
            } else {
                go_0.go_0_do().cfr_renamed_25();
            }
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("tx") ? 1 : 0)) {
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof da_0 != 0)) {
                AutoController.tatAuto();
                TienIchGame.void_if("Tắt auto tài xỉu");
                if ("  ".length() == 0) {
                    return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                }
            } else {
                (new da_0() != null);
                TienIchGame.void_if("Bật auto tài xỉu");
            }
            return 1;
        }
        if (AutoController.cfr_renamed_4(((String)object).equals("kc") ? 1 : 0)) {
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai) && (nhiemVuHienTai instanceof aj != 0)) {
                AutoController.tatAuto();
                TienIchGame.void_if("Tắt auto kim cương");
                if ((0x60 ^ 0x64) != (0x8E ^ 0x8A)) {
                    return ((0x25 ^ 0xF) & ~(0x39 ^ 0x13)) != 0;
                }
            } else {
                aj.aj_do().cfr_renamed_4();
                (aj.aj_do() != null);
                TienIchGame.void_if("Bật auto kim cương");
            }
            return 1;
        }
        int n = 0;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        int n2 = 0;
        while (AutoController.cfr_renamed_5(n2, ((String)object).length())) {
            char c2 = ((String)object).charAt(n2);
            if ((c2 >= 48) && !(c2 > 57) || (c2 == 32)) {
                while (AutoController.cfr_renamed_5(n2, ((String)object).length()) && AutoController.cfr_renamed_1(c2 = ((String)object).charAt(n2), 48) && (c2 <= 57)) {
                    stringBuffer2.append(c2);
                    ++n2;
                    if ("  ".length() == "  ".length()) continue;
                    return ((0x2E ^ 0x67) & ~(0x15 ^ 0x5C)) != 0;
                }
                break;
            }
            stringBuffer.append(c2);
            ++n2;
            if ("   ".length() > ((5 ^ 0x7D ^ (0xEC ^ 0x87)) & (50 + 39 - 78 + 155 ^ 158 + 124 - 123 + 22 ^ -" ".length()))) continue;
            return (((0xE7 ^ 0xB3) & ~(0x11 ^ 0x45) ^ (0x81 ^ 0xAF)) & (0x32 ^ 0x49 ^ (4 ^ 0x51) ^ -" ".length())) != 0;
        }
        String string = stringBuffer.toString().toLowerCase();
        if ((stringBuffer2.length() > 0)) {
            try {
                n = Integer.parseInt(stringBuffer2.toString());
            }
            catch (NumberFormatException numberFormatException) {
                }
            if (" ".length() <= ((0x53 ^ 0xC) & ~(0x17 ^ 0x48))) {
                return ((0x70 ^ 0x3C) & ~(0xF0 ^ 0xBC)) != 0;
            }
        }
        if ((string.equals("s"))) {
            if ((n > 100)) {
                TienIchGame.void_if("Tốc độ quá chậm sẽ bị lag. Số càng nhỏ thì tốc độ càng nhanh!");
                if ("   ".length() == "  ".length()) {
                    return ((0xBD ^ 0xC7 ^ (6 ^ 0x2D)) & (111 + 158 - 110 + 68 ^ 86 + 142 - 91 + 41 ^ -" ".length())) != 0;
                }
            } else {
                if ((n != null)) {
                    n = 1;
                }
                TienIchGame.void_if("Chỉnh tốc độ game: " + n);
                GameCanvas.soXu = n;
                QuanLyRMS.docDuLieu("_modspeed", n);
            }
            return 1;
        }
        if ((string.equals("snc"))) {
            if ((n != null)) {
                n = 1;
            }
            TienIchGame.void_if("Chỉnh quãng nghỉ nâng cấp: " + n);
            cl.soXu = n;
            return 1;
        }
        if (!!(string.equals("k")) || (string.equals("khu"))) {
            object = new bm_0(n);
            if (AutoController.cfr_renamed_1((Object)nhiemVuHienTai)) {
                TienIchGame.void_if("Không thể chuyển khu khi đang bật: " + nhiemVuHienTai.toString());
                if ("  ".length() < 0) {
                    return ((0x65 ^ 0x39 ^ (0xF5 ^ 0xBD)) & (0xF0 ^ 0xB2 ^ (0xED ^ 0xBB) ^ -" ".length())) != 0;
                }
            } else if (AutoController.cfr_renamed_3(((bm_0)object).cfr_renamed_1, go_0.var_byte_do)) {
                TienIchGame.void_if("Bạn đang ở khu này rồi!");
                } else {
                GameCanvas.cfr_renamed_8();
                new Thread((Runnable)object).start();
            }
            return 1;
        }
        if (!!(string.equals("m")) || (string.equals("map"))) {
            new ba(n).void_do();
            return 1;
        }
        return 0;
    }

        public static boolean (String string >= 0) {
        if ((string.length() > 10)) {
            return 0;
        }
        if ((string.equals("s"))) {
            GameCanvas.soXu = 40L;
            QuanLyRMS.docDuLieu("_modspeed", 40);
            TienIchGame.void_if("Reset tốc độ game về mặc định!");
            return 1;
        }
        if ((string.equals("h"))) {
            int n;
            if (!(TienIchGame.cfr_renamed_7)) {
                n = 1;
                if (-"  ".length() >= 0) {
                    return ((0xE0 ^ 0xC4 ^ (0x8C ^ 0x9C)) & (0x2A ^ 0x7E ^ (0x33 ^ 0x53) ^ -" ".length())) != 0;
                }
            } else {
                n = 0;
            }
            TienIchGame.cfr_renamed_7 = n;
            return 1;
        }
        if (!!(string.equals("out")) || (string.equals("dx"))) {
            AutoController.tatAuto();
            TienIchGame.dangXuatTaiKhoan();
            return 1;
        }
        if ((string.equals("pe"))) {
            AutoController.tatAuto();
            TienIchGame.void_if("Tắt auto");
            return 1;
        }
        if ((string.equals("rd"))) {
            ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
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
                    if (((" ".length() ^ (0xC1 ^ 0x85)) & (0x34 ^ 0x42 ^ (0x85 ^ 0xB6) ^ -" ".length())) > -" ".length()) continue;
                    return ((75 + 2 - -28 + 42 ^ 118 + 124 - 217 + 148) & (0x2C ^ 5 ^ (0x24 ^ 0x33) ^ -" ".length())) != 0;
                }
                break;
            }
            stringBuffer.append(c2);
            ++n2;
            if (((126 + 95 - 31 + 19 ^ 152 + 55 - 37 + 7) & (117 + 118 - 118 + 48 ^ 112 + 87 - 187 + 185 ^ -" ".length())) == ((0x58 ^ 0x2F ^ (0x6E ^ 0x59)) & (0xB2 ^ 0xBF ^ (0xF8 ^ 0xB5) ^ -" ".length()))) continue;
            return ((0xBD ^ 0xA7 ^ (0x21 ^ 0x64)) & (189 + 178 - 321 + 174 ^ 46 + 83 - 16 + 18 ^ -" ".length())) != 0;
        }
        String string2 = stringBuffer.toString().toLowerCase();
        if ((stringBuffer2.length() > 0)) {
            try {
                n = Integer.parseInt(stringBuffer2.toString());
            }
            catch (NumberFormatException numberFormatException) {
                }
            if (((0x1D ^ 0x42) & ~(0x26 ^ 0x79)) != 0) {
                return ((0xD0 ^ 0xB1) & ~(0 ^ 0x61)) != 0;
            }
        }
        if ((string2.equals("s"))) {
            if ((n > 100)) {
                TienIchGame.void_if("Tốc độ quá chậm sẽ bị lag. Số càng nhỏ thì tốc độ càng nhanh!");
                if (-(0x7D ^ 9 ^ (0xC5 ^ 0xB4)) >= 0) {
                    return ((58 + 69 - 79 + 110 ^ 3 + 61 - 57 + 177) & (53 + 46 - 86 + 150 ^ 8 + 103 - 13 + 35 ^ -" ".length())) != 0;
                }
            } else {
                if ((n != null)) {
                    n = 1;
                }
                TienIchGame.void_if("Chỉnh tốc độ game: " + n);
                GameCanvas.soXu = n;
                QuanLyRMS.docDuLieu("_modspeed", n);
            }
            return 1;
        }
        return 0;
    }

        public static void (NhiemVuAutoBase ha2 >= NhiemVuAutoBase ha3) {
        if (AutoController.cfr_renamed_1((Object)ha3)) {
            ha3.cfr_renamed_30();
        }
        ha2.nhiemVuHienTai = ha3;
        nhiemVuHienTai = ha2;
    }
}

