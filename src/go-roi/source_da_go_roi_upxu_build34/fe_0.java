/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.midlet.MIDlet
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

/*
 * Renamed from fE
 */
public final class fe_0
extends dL
implements fj_0 {
    public boolean dangChayAuto;
    public static byte var_byte_do;
    public static byte var_byte_if;
    public long soXu;
    private int var_int_byte;
    public static int soLuong;
    private long var_long_if;
    private boolean var_boolean_case;
    public static int var_int_if;
    public static Vector var_java_util_Vector_do;
    public static boolean coTrangThai;
    public static boolean coKichHoat;
    public static byte var_byte_for;
    private Vector var_java_util_Vector_try;
    public static byte var_byte_int;
    public static String chuoiGiaTri;
    public static Vector var_java_util_Vector_if;
    public static Vector var_java_util_Vector_for;
    public static int soLuongKhoa;
    public static boolean var_boolean_int;
    public static fe_0 var_fe_0_do;
    public static byte var_byte_char;
    public static short[] var_short_arr_do;
    static byte[] var_byte_arr_do;
    private byte cfr_renamed_11;
    public static Vector var_java_util_Vector_int;
    private ei var_ei_byte;
    public static int var_int_int;
    public ei var_ei_do;
    private ei var_ei_case;
    private int var_int_case;
    public static boolean var_boolean_try;
    public static int var_int_new;
    private static final int[] mangSoNguyen;
    public ei var_ei_if;
    public static Image var_javax_microedition_lcdui_Image_do;
    private byte cfr_renamed_18 = (byte)0;
    private ei var_ei_char;
    public static int var_int_try;
    public static Vector var_java_util_Vector_new;
    public static DuLieuNguoiChoi duLieuNguoiChoi;
    public ei var_ei_for;
    public static Image var_javax_microedition_lcdui_Image_if;
    public static boolean var_boolean_byte;
    public static DuLieuNguoiChoi var_dd_0_if;

    private void cfr_renamed_31() {
        String string;
        String string2;
        Vector<ei> vector = new Vector<ei>();
        if ((AutoController.nhiemVuHienTai != null)) {
            vector.addElement(new ei("Tắt Auto", 4, this));
            if ((0x41 ^ 0x45) <= "  ".length()) {
                return;
            }
        } else {
            vector.addElement(new ei("Menu Auto", 99, this));
        }
        vector.addElement(new ei("Cài đặt up thuê", 34, this));
        if (fe_0.boolean_new(TienIchGame.dangChayAuto ? 1 : 0)) {
            string2 = "Hiện thông tin";
            if (-"  ".length() >= 0) {
                return;
            }
        } else {
            string2 = "Tắt thông tin";
        }
        vector.addElement(new ei(string2, 35, this));
        if ((AutoController.nhiemVuHienTai == null)) {
            vector.addElement(new ei("Chuyển map", 24, this));
        }
        vector.addElement(new ei("Bỏ vật phẩm", 7, this));
        StringBuffer stringBuffer = new StringBuffer().append("Giữ kết nối (");
        if (fe_0.boolean_new(this.var_boolean_case ? 1 : 0)) {
            string = "ON";
            if ((0x78 ^ 0xA ^ (0x24 ^ 0x53)) <= 0) {
                return;
            }
        } else {
            string = "OFF";
        }
        vector.addElement(new ei(stringBuffer.append(string).append(")").toString(), 116, this));
        vector.addElement(new ei("Danh sách NPC", 42, this));
        vector.addElement(new ei("Kiểu gõ TV", 47, this));
        if (fe_0.boolean_for(ef_0.soLuong, 25) && fe_0.cfr_renamed_1((Object)var_java_util_Vector_for) && fe_0.boolean_do(var_java_util_Vector_for.size())) {
            int n = 0;
            while (fe_0.boolean_if(n, var_java_util_Vector_for.size())) {
                ev_0 ev_02 = (ev_0)var_java_util_Vector_for.elementAt(n);
                vector.addElement(new ei(ev_02.cfr_renamed_1, 2, n));
                ++n;
                return;
            }
        }
        vector.addElement(new ei("Đăng xuất", 41, this));
        if ((AutoController.nhiemVuHienTai == null)) {
            vector.addElement(this.var_ei_char);
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    public static void (short s2 == int n) {
        GameCanvas.cfr_renamed_8();
        em_0.var_boolean_int = 1;
        gd gd2 = gd.cfr_renamed_0(ci_0.var_java_util_Vector_do, (int)s2);
        if ((gd2 != null)) {
            if (fe_0.boolean_do((int)gd2.var_byte_do, 5)) {
                db_0.db_0_do().cfr_renamed_2(AngelChip.duLieuNguoiChoi.var_short_char);
            }
            AngelChip.duLieuNguoiChoi.void_int(n);
        }
    }

    public final void (Graphics graphics != null) {
        int n;
        GameCanvas.cfr_renamed_1(graphics);
        GameCanvas.var_ef_0_do.cfr_renamed_4(graphics);
        if (fe_0.boolean_do(var_java_util_Vector_new.size())) {
            n = 0;
            while (fe_0.boolean_if(n, var_java_util_Vector_new.size())) {
                ((gr)var_java_util_Vector_new.elementAt(n)).cfr_renamed_0(graphics);
                ++n;
                if (-" ".length() == -" ".length()) continue;
                return;
            }
        }
        GameCanvas.var_ef_0_do.cfr_renamed_1(graphics);
        GameCanvas.cfr_renamed_1(graphics);
        if (fe_0.boolean_if(this.var_java_util_Vector_try.isEmpty() ? 1 : 0)) {
            String string = (String)this.var_java_util_Vector_try.elementAt(0);
            n = this.var_int_byte - this.var_int_case;
            if (fe_0.boolean_try(n, 10)) {
                n = 10;
            }
            int n2 = GameCanvas.var_int_byte;
            int n3 = 0;
            while (fe_0.boolean_if(n3, n)) {
                n2 >>= 1;
                ++n3;
                if ((0xB8 ^ 0xBC) > ((0x54 ^ 0x47) & ~(0xE ^ 0x1D))) continue;
                return;
            }
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, string, n2 + 3, 2, 0);
        }
        GameCanvas.cfr_renamed_1(graphics);
        TienIchGame.cfr_renamed_0(graphics);
    }

        public final void (String string != null) {
        if (fe_0.boolean_if(string.trim().equals("") ? 1 : 0)) {
            if (fe_0.boolean_for(string.indexOf("dmw"), -1)) {
                if (fe_0.cfr_renamed_1((Object)duLieuNguoiChoi)) {
                    eq.eq_do().cfr_renamed_0((int)fe_0.duLieuNguoiChoi.var_short_char, string);
                    return;
                }
            } else {
                if (fe_0.boolean_if(string.indexOf("ptw")) && fe_0.cfr_renamed_1((Object)duLieuNguoiChoi) && fe_0.cfr_renamed_1((Object)fe_0.duLieuNguoiChoi.var_short_do) && (fe_0.duLieuNguoiChoi.var_short_do.var_java_lang_String_arr_do != null)) {
                    string = string + " (";
                    int n = 0;
                    while (fe_0.boolean_if(n, fe_0.duLieuNguoiChoi.var_short_do.var_java_lang_String_arr_do.length)) {
                        string = string + " " + fe_0.duLieuNguoiChoi.var_short_do.var_java_lang_String_arr_do[n];
                        ++n;
                        if (-"  ".length() < 0) continue;
                        return;
                    }
                    string = string + ").";
                    eq.eq_do().cfr_renamed_0((int)fe_0.duLieuNguoiChoi.var_short_char, string);
                    return;
                }
                el_0.el_0_do().cfr_renamed_3(string);
            }
        }
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public static void void_for(int n) {
        if (fe_0.cfr_renamed_1((Object)duLieuNguoiChoi)) {
            ci ci2 = (ci)ci_0.q_0_do((short)n);
            GameCanvas.hienThongBaoPopup((int)ci2.var_byte_arr_do[0], (int)ci2.var_byte_arr_do[1], new cs(ci2), new cu_0(ci2), null);
        }
    }

    public final void cfr_renamed_1() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei("Auto KC", 61, this));
        vector.addElement(new ei("Auto Farm", 26, this));
        vector.addElement(new ei("Auto bán đá", 29, this));
        vector.addElement(new ei("Auto dùng VP", 57, this));
        vector.addElement(new ei("Auto A-V", 50, this));
        vector.addElement(new ei("Auto TX", 5, this));
        if ((GameCanvas.var_dL_do == this)) {
            vector.addElement(new ei("Auto Hôn", 67, this));
            vector.addElement(new ei("Auto Đánh", 68, this));
        }
        vector.addElement(new ei("Auto Click", 107, this));
        vector.addElement(new ei("Cho ăn xin", 69, this));
        vector.addElement(new ei("Treo Farm", 64, this));
        vector.addElement(new ei("Biến hình Kirby", 117, this));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 0: {
                db_0.db_0_do().cfr_renamed_8(AngelChip.duLieuNguoiChoi.var_short_char);
                GameCanvas.cfr_renamed_5();
                return;
            }
            case 1: {
                fe.fe_do().cfr_renamed_1();
                return;
            }
            case 2: {
                eq.eq_do().cfr_renamed_4(n2);
                return;
            }
            case 3: {
                fe_0.fe_0_do();
                (AngelChip.duLieuNguoiChoi == 0);
                return;
            }
            case 4: {
                fe_0.fe_0_do();
                (AngelChip.duLieuNguoiChoi == 1);
            }
        }
    }

    public static void void_do(DuLieuNguoiChoi dd_02) {
        ef ef2 = ci_0.cfr_renamed_0((int)((ci)ci_0.q_0_do((short)((short)dd_02.var_int_const))).var_int_arr_if, dd_02.var_java_util_Vector_if);
        if ((ef2 == null)) {
            dd_02.cfr_renamed_1(new ef((short)dd_02.var_int_const));
            dd_02.void_if();
            return;
        }
        ef2.var_short_do = (short)dd_02.var_int_const;
    }

    public static void void_for(int n, int n2) {
        aG aG2;
        block10: {
            int n3 = 0;
            do {
                if (fe_0.boolean_int(n3, ef_0.var_java_util_Vector_do.size())) {
                    aG2 = null;
                    break block10;
                }
                aG aG3 = (aG)ef_0.var_java_util_Vector_do.elementAt(n3);
                if (fe_0.boolean_do((int)aG3.var_byte_if, 5)) {
                    aG3 = (dB)aG3;
                    if (fe_0.boolean_do(((dB)aG3).soLuong, n)) {
                        aG2 = aG3;
                        if ((0x75 ^ 0x71) < 0) {
                            return;
                        }
                        break block10;
                    }
                }
                ++n3;
                } while (-" ".length() <= 0);
            return;
        }
        if ((aG2 != null)) {
            DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n2);
            if (fe_0.cfr_renamed_1((Object)dd_02)) {
                ((dB)aG2).var_int_this = ((aG)dd_02).cfr_renamed_3;
                ((dB)aG2).var_int_long = dd_02.var_int_if;
                ((dB)aG2).cfr_renamed_12 = (byte)1;
                ((dB)aG2).cfr_renamed_1 = (short)0;
                if (" ".length() <= 0) {
                    return;
                }
            } else {
                ((dB)aG2).cfr_renamed_1 = (short)0;
                ((dB)aG2).cfr_renamed_12 = (byte)3;
            }
            ((dB)aG2).cfr_renamed_11 = (byte)6;
        }
    }

    private static void cfr_renamed_5(DuLieuNguoiChoi dd_02) {
        ci ci2 = ci_0.ci_do(dd_02.var_java_util_Vector_if, 50);
        if (fe_0.cfr_renamed_1((Object)ci2)) {
            dd_02.var_byte_void = ci2.cfr_renamed_3;
        }
    }

    public static void cfr_renamed_4() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei("ID 0: Khu mặt trời", new y(0)));
        vector.addElement(new ei("ID 1: Khu quay số cũ", new y(1)));
        vector.addElement(new ei("ID 2: Khu đấu giá cũ", new y(2)));
        vector.addElement(new ei("ID 3: Khu ăn xin trái", new y(3)));
        vector.addElement(new ei("ID 4: Khu cưới clan", new y(4)));
        vector.addElement(new ei("ID 5: Khu tài xỉu", new y(5)));
        vector.addElement(new ei("ID 6: Khu cô giáo", new y(6)));
        vector.addElement(new ei("ID 7: Dưới khu cô giáo", new y(7)));
        vector.addElement(new ei("ID 8: Khu 4 con vịt", new y(8)));
        vector.addElement(new ei("ID 9: Khu giải trí", new y(9)));
        vector.addElement(new ei("ID 10: Khu lễ đường", new y(10)));
        vector.addElement(new ei("ID 11: Khu công viên", new y(11)));
        vector.addElement(new ei("ID 12: Khu trống", new y(12)));
        vector.addElement(new ei("ID 13: Khu sinh thái", new y(13)));
        vector.addElement(new ei("ID 14: Khu cá rô", new y(14)));
        vector.addElement(new ei("ID 15: Khu cá lóc", new y(15)));
        vector.addElement(new ei("ID 16: Khu cá mập", new y(16)));
        vector.addElement(new ei("ID 17: Khu ngoại ô", new y(17)));
        vector.addElement(new ei("ID 18: Khu nhà tù", new y(18)));
        vector.addElement(new ei("ID 21: Khu nhà ở", new y(21)));
        vector.addElement(new ei("ID 23: Khu mua sắm", new y(23)));
        vector.addElement(new ei("ID 25: Nông trại", new y(25)));
        vector.addElement(new ei("ID 27: Đảo Hawai", new y(27)));
        vector.addElement(new ei("ID 28: Biển Hawai", new y(28)));
        vector.addElement(new ei("ID 29: Biển Hawai trái", new y(29)));
        vector.addElement(new ei("ID 30: Biển Hawai phải", new y(30)));
        vector.addElement(new ei("ID 33: Ai cập", new y(33)));
        vector.addElement(new ei("ID 34: Sa mạc", new y(34)));
        vector.addElement(new ei("ID 55: VĐBĐ", new y(55)));
        vector.addElement(new ei("ID 56: Map phù thủy", new y(56)));
        vector.addElement(new ei("ID 57: Trái phù thủy", new y(57)));
        vector.addElement(new ei("ID 58: Phải phù thủy", new y(58)));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 2);
    }

    public static void (int n, int n2, int n3, int n4 == null) {
        if ((!fe_0.boolean_for(AngelChip.var_int_if, 9) || fe_0.boolean_do(AngelChip.var_int_if, 11)) && fe_0.boolean_if(var_boolean_try ? 1 : 0)) {
            AngelChip.duLieuNguoiChoi.var_short_else = (short)n;
            AngelChip.duLieuNguoiChoi.cfr_renamed_5 = n2;
            el_0.el_0_do().cfr_renamed_0(n, n2, n3, n4);
        }
    }

    public static void void_int(int n) {
        AngelChip.duLieuNguoiChoi.void_do(n);
        AngelChip.duLieuNguoiChoi.var_short_break = AngelChip.duLieuNguoiChoi.var_short_final;
        AngelChip.duLieuNguoiChoi.var_short_this = (short)0;
        db_0.db_0_do().cfr_renamed_12(n + 100);
    }

    static {
        fe_0.cfr_renamed_36();
        var_byte_do = (byte)-1;
        var_byte_if = (byte)-1;
        var_java_util_Vector_new = new Vector();
        var_int_int = -1;
        var_boolean_byte = 0;
        coTrangThai = 0;
        var_boolean_try = 0;
        coKichHoat = 0;
        var_int_new = -1;
        byte[] byArray = new byte[4];
        byArray[0] = 10;
        byArray[1] = 4;
        byArray[2] = 3;
        byArray[3] = 5;
        var_byte_arr_do = byArray;
        var_boolean_int = 0;
        var_int_if = -1;
        var_int_try = -1;
    }

    public static void (DuLieuNguoiChoi dd_02 != null) {
        fe_0.cfr_renamed_5(dd_02);
        dd_02.void_if();
        dd_02.var_short_do = (short)1;
        DuLieuNguoiChoi dd_03 = ef_0.dd_0_do(dd_02.var_short_char);
        if (fe_0.cfr_renamed_1((Object)dd_03)) {
            ef_0.var_java_util_Vector_do.removeElement(dd_03);
            }
        ef_0.cfr_renamed_1(dd_02);
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public static String java_lang_String_do() {
        return MenuChinhAvatar.cfr_renamed_31 + ": " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) + MenuChinhAvatar.cl;
    }

    protected static void cfr_renamed_5() {
        if (fe_0.cfr_renamed_1((Object)duLieuNguoiChoi)) {
            GameCanvas.cfr_renamed_5(MenuChinhAvatar.cT);
            el_0.el_0_do().cfr_renamed_4(fe_0.duLieuNguoiChoi.var_short_char);
        }
    }

    public final void cfr_renamed_12() {
        GameCanvas.cfr_renamed_5();
        var_byte_do = (byte)-1;
        var_byte_if = (byte)-1;
        if (fe_0.boolean_do(AngelChip.var_int_if, 8)) {
            this.cfr_renamed_11();
            return;
        }
        eq.eq_do().cfr_renamed_17(8);
    }

    public static void void_new(int n) {
        fe.fe_do().var_byte_do = (byte)n;
        if (fe_0.boolean_for(AngelChip.duLieuNguoiChoi.var_byte_long, n) && fe_0.boolean_for(AngelChip.duLieuNguoiChoi.var_byte_long, -1)) {
            fe.fe_do().cfr_renamed_1();
            return;
        }
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.m, 0));
        vector.addElement(new ei(MenuChinhAvatar.h, 1));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 2);
    }

    public static void (int n == short s2) {
        DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
        if (fe_0.cfr_renamed_1((Object)dd_02)) {
            if (fe_0.boolean_do((int)ci_0.q_0_do((short)s2).var_byte_if, -1)) {
                if (fe_0.boolean_do((int)dd_02.var_short_short, (int)s2)) {
                    bq_0 bq_02 = ef_0.bq_0_do(dd_02.var_short_char);
                    if ((bq_02 != null)) {
                        ef_0.var_java_util_Vector_do.removeElement(bq_02);
                        dd_02.var_short_short = (short)-1;
                    }
                    } else {
                    dd_02.cfr_renamed_0(s2);
                    db_0.db_0_do().cfr_renamed_2(dd_02.var_short_char);
                    if ((9 ^ 0x17 ^ (0x89 ^ 0x92)) <= 0) {
                        return;
                    }
                }
            } else {
                ef ef2 = ci_0.ef_do(dd_02.var_java_util_Vector_if, (int)s2);
                if ((ef2 != null)) {
                    dd_02.var_java_util_Vector_if.removeElement(ef2);
                    if (" ".length() >= "  ".length()) {
                        return;
                    }
                } else {
                    dd_02.cfr_renamed_0(new ef(s2));
                    dd_02.void_if();
                }
            }
            if (fe_0.boolean_do(n, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
                if ((GameCanvas.var_dL_do == em_0.em_0_do())) {
                    em_0.em_0_do().cfr_renamed_2();
                }
                AngelChip.var_java_util_Vector_do = null;
                GameCanvas.cfr_renamed_8();
            }
            var_boolean_byte = 0;
        }
    }

    public final void cfr_renamed_11() {
        block11: {
            block10: {
                if (!fe_0.boolean_if((int)AngelChip.duLieuNguoiChoi.var_byte_void)) break block10;
                if (fe_0.boolean_if(c.dangChayAuto ? 1 : 0)) {
                    cs_0.cfr_renamed_0().cfr_renamed_8();
                    GameCanvas.cfr_renamed_8();
                    return;
                }
                break block11;
            }
            if ((GameCanvas.var_dL_do != dN.var_dN_do) && (GameCanvas.var_dL_do != ey_0.var_ey_0_do)) {
                GameCanvas.cfr_renamed_6 = 0;
            }
            if (fe_0.boolean_if(this.dangChayAuto ? 1 : 0)) {
                eq.eq_do().cfr_renamed_17(9);
                eq.eq_do().cfr_renamed_4(0);
                return;
            }
            int n = 16 * bn_0.cfr_renamed_6;
            ef_0.soLuongKhoa = -1;
            ap.void_do(MenuChinhAvatar.cfr_renamed_27);
            ep ep2 = ep.cfr_renamed_0("ct", n, n);
            ap.cfr_renamed_0();
            Vector<bv> vector = new Vector<bv>();
            byte[] byArray = new byte[884];
            int n2 = 0;
            InputStream inputStream = gc_0.java_io_InputStream_do(MenuChinhAvatar.java_lang_String_do() + "/citiMap");
            try {
                int n3 = 0;
                while (fe_0.boolean_if(n3, 26)) {
                    int n4 = 0;
                    while (fe_0.boolean_if(n4, 34)) {
                        byArray[n3 * 34 + n4] = (byte)inputStream.read();
                        if (fe_0.boolean_do((int)byArray[n3 * 34 + n4], 69)) {
                            bv bv2 = new bv();
                            new bv().var_byte_do = (byte)n4;
                            bv2.cfr_renamed_1 = (byte)n3;
                            bv2.var_short_do = (short)(n2 + 819);
                            bv2.chuoiGiaTri = MenuChinhAvatar.var_java_lang_String_arr_this[n2];
                            vector.addElement(bv2);
                            ++n2;
                        }
                        ++n4;
                        if (-" ".length() <= 0) continue;
                        return;
                    }
                    ++n3;
                    return;
                }
                inputStream.close();
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if (((0xAE ^ 0x83) & ~(0x31 ^ 0x1C)) < 0) {
                return;
            }
            ef_0.soLuong = -1;
            fw.coTrangThai = 1;
            fw.cfr_renamed_0().cfr_renamed_0(ep2, byArray, vector, 16 * bn_0.cfr_renamed_6, new ei(MenuChinhAvatar.dg, new ce_0()));
            fw.cfr_renamed_0().var_cp_do = new cb_0();
            fw.cfr_renamed_0().soLuongKhoa = 3;
            fw.cfr_renamed_0().cfr_renamed_8();
            GameCanvas.cfr_renamed_8();
            if ((fw.var_cp_if != null) && fe_0.boolean_if((int)fw.var_byte_do) && fe_0.boolean_if(GameCanvas.var_boolean_byte ? 1 : 0)) {
                fw.var_cp_if.void_do();
                fw.var_byte_do = (byte)1;
            }
        }
    }

    protected static void cfr_renamed_18() {
        if (fe_0.cfr_renamed_1((Object)duLieuNguoiChoi)) {
            fe_0.cfr_renamed_12(100);
        }
    }

    public final void (byte by2, byte by3, short s2, short s3, Vector vector, Vector vector2, Vector vector3 == null) {
        if (fe_0.boolean_do((int)by3, -1)) {
            GameCanvas.hienThongBaoPopup(MenuChinhAvatar.cF, 52, null);
            return;
        }
        if (fe_0.boolean_do(ef_0.soLuongKhoa, -1)) {
            ef_0.var_java_util_Vector_try = vector2;
            ef_0.var_java_util_Vector_byte = vector3;
        }
        GameCanvas.cfr_renamed_2();
        var_byte_int = by2;
        var_byte_for = by3;
        duLieuNguoiChoi = null;
        ef_0.var_aG_do = null;
        AngelChip.duLieuNguoiChoi.var_int_break = 0;
        if (!fe_0.boolean_if(GameCanvas.var_boolean_byte ? 1 : 0) || !fe_0.boolean_do((int)by2, ef_0.soLuong) || fe_0.boolean_do((int)by2, ef_0.soLuong) && !fe_0.boolean_for(ef_0.soLuongKhoa, -1) || fe_0.boolean_do(ef_0.soLuongKhoa, -1) && (!fe_0.boolean_for(ef_0.soLuong, 14) || !fe_0.boolean_for(ef_0.soLuong, 15) || fe_0.boolean_do(ef_0.soLuong, 16))) {
            AngelChip.duLieuNguoiChoi.var_short_do = (short)0;
            if (fe_0.boolean_for(by2, ef_0.soLuong)) {
                AngelChip.duLieuNguoiChoi.coKichHoat = s2;
                AngelChip.duLieuNguoiChoi.var_short_if = s3;
            }
            ef_0.var_java_util_Vector_new.removeAllElements();
            GameCanvas.var_ef_0_do.void_do(by2 + 1);
            if (-" ".length() > ((0x2B ^ 0x20 ^ (0x7C ^ 0x22)) & (0x70 ^ 0x67 ^ (0x31 ^ 0x73) ^ -" ".length()))) {
                return;
            }
        } else {
            var_java_util_Vector_new.removeAllElements();
            ef_0.var_java_util_Vector_do.removeAllElements();
            ef_0.var_java_util_Vector_int.removeAllElements();
            GameCanvas.var_java_util_Vector_if.removeAllElements();
            ef_0.cfr_renamed_1(AngelChip.duLieuNguoiChoi);
        }
        if (fe_0.cfr_renamed_1((Object)vector2)) {
            ef_0.cfr_renamed_4();
        }
        if (fe_0.boolean_for(ef_0.var_int_char, -1)) {
            AngelChip.duLieuNguoiChoi.void_do(ef_0.var_int_char, ef_0.var_int_new);
            ef_0.var_int_new = -1;
            ef_0.var_int_char = -1;
        }
        if (fe_0.boolean_for(ef_0.cfr_renamed_10, -1)) {
            AngelChip.duLieuNguoiChoi.coKichHoat = ef_0.cfr_renamed_10;
            AngelChip.duLieuNguoiChoi.var_short_if = (short)ef_0.var_int_int;
            ef_0.var_int_int = -1;
            ef_0.cfr_renamed_10 = -1;
            (AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, (int)AngelChip.duLieuNguoiChoi.var_short_if, AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, 0 == null);
        }
        GameCanvas.gameCanvas.void_do();
        if ((GameCanvas.var_dL_do != this)) {
            if (fe_0.boolean_if(t_0.soLuong)) {
                fe_0.fe_0_do().cfr_renamed_8();
                if (" ".length() >= "  ".length()) {
                    return;
                }
            } else {
                t_0.soLuong = 2;
                w.cfr_renamed_0().cfr_renamed_8();
            }
        }
        by2 = (byte)0;
        while (fe_0.boolean_if((int)by2, vector.size())) {
            aG aG2 = (aG)vector.elementAt(by2);
            if (fe_0.boolean_if((int)aG2.var_byte_if)) {
                aG2 = (DuLieuNguoiChoi)aG2;
                ((DuLieuNguoiChoi)aG2).var_short_else = (short)(((DuLieuNguoiChoi)aG2).coKichHoat ? 1 : 0);
                ((DuLieuNguoiChoi)aG2).cfr_renamed_5 = ((DuLieuNguoiChoi)aG2).var_short_if;
                ((DuLieuNguoiChoi)aG2).var_byte_goto = (byte)(((DuLieuNguoiChoi)aG2).coKichHoat ? 1 : 0);
                ((DuLieuNguoiChoi)aG2).void_if();
                if (fe_0.boolean_for(((DuLieuNguoiChoi)aG2).var_short_char, AngelChip.duLieuNguoiChoi.var_short_char)) {
                    fe_0.cfr_renamed_5((DuLieuNguoiChoi)aG2);
                    ef_0.cfr_renamed_1((DuLieuNguoiChoi)aG2);
                }
                if ((0x9F ^ 0x9B) == 0) {
                    return;
                }
            } else if (fe_0.boolean_do((int)aG2.var_byte_if, 5)) {
                aG2 = (dB)aG2;
                ((dB)aG2).var_int_this = ((dB)aG2).cfr_renamed_3;
                ((dB)aG2).var_int_long = ((dB)aG2).cfr_renamed_1;
                ef_0.var_java_util_Vector_do.addElement(aG2);
            }
            by2 = (byte)(by2 + 1);
            if (-" ".length() < 0) continue;
            return;
        }
        if (fe_0.boolean_new(eg.dangChayAuto ? 1 : 0)) {
            (eg.var_eq_0_do.var_int_if, eg.var_eq_0_do.soLuong, AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.cfr_renamed_5 ? 1 : 0 == null);
            } else {
            AngelChip.duLieuNguoiChoi.var_short_if = (short)(AngelChip.duLieuNguoiChoi.var_short_if + 1);
            fe_0.cfr_renamed_10();
        }
        fe_0.void_int(AngelChip.duLieuNguoiChoi.var_short_final);
        if (fe_0.boolean_if(GameCanvas.cfr_renamed_16) && (GameCanvas.var_et_0_do == null)) {
            ((dL)this).cfr_renamed_4 = this.var_ei_case;
        }
        duLieuNguoiChoi = null;
        if (fe_0.boolean_for(ef_0.soLuong, 25)) {
            GameCanvas.cfr_renamed_8();
        }
        GameCanvas.gameCanvas.sizeChanged(0, 0);
        if (fe_0.boolean_new(GameCanvas.var_boolean_byte ? 1 : 0)) {
            if (fe_0.boolean_do(ef_0.soLuong, 9) && fe_0.boolean_new(et_0.var_int_if)) {
                GameCanvas.var_et_0_do = new et_0();
                GameCanvas.var_et_0_do.cfr_renamed_8();
                if (-" ".length() < -" ".length()) {
                    return;
                }
            } else if (fe_0.boolean_if(eg.dangChayAuto ? 1 : 0) && fe_0.boolean_do(ef_0.soLuong, 23)) {
                GameCanvas.var_et_0_do = new et_0();
                GameCanvas.var_et_0_do.cfr_renamed_12();
                if ((135 + 116 - 162 + 48 ^ 83 + 61 - 19 + 16) != (0x61 ^ 6 ^ (0xE8 ^ 0x8B))) {
                    return;
                }
            } else if (fe_0.boolean_do(ef_0.soLuong, 25) && fe_0.boolean_do(et_0.soLuong)) {
                GameCanvas.var_et_0_do = new et_0();
                GameCanvas.var_et_0_do.cfr_renamed_1(var_fe_0_do);
            }
            ((dL)this).cfr_renamed_4 = null;
            ((dL)this).cfr_renamed_5 = null;
        }
        AngelChip.duLieuNguoiChoi.var_short_if = (short)0;
        AngelChip.duLieuNguoiChoi.cfr_renamed_5 = 0;
        AngelChip.duLieuNguoiChoi.var_short_goto = (short)4;
        var_boolean_byte = 0;
        var_boolean_try = 0;
        GameCanvas.var_dX_do = null;
        if (fe_0.boolean_do(ef_0.soLuong, 108)) {
            ek_0.ek_0_do().cfr_renamed_1();
            ek_0.ek_0_do().cfr_renamed_4();
        }
        if (fe_0.boolean_if(GameCanvas.cfr_renamed_6)) {
            GameCanvas.cfr_renamed_6 = 1;
        }
    }

    public static void (int n == Vector vector) {
        DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
        if (fe_0.cfr_renamed_1((Object)dd_02)) {
            dd_02.var_java_util_Vector_int = vector;
            dd_02.var_short_do = (short)0;
        }
    }

    private void (String string == null) {
        this.var_java_util_Vector_try.addElement(string);
        if (fe_0.boolean_if(this.var_int_case)) {
            this.var_int_case = this.var_int_byte;
        }
    }

    protected static void (gd gd2 == null) {
        GameCanvas.hienThongBaoPopup(MenuChinhAvatar.aI, new co(gd2));
    }

    public static void (int n != short s2) {
        DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
        if (fe_0.cfr_renamed_1((Object)dd_02)) {
            dd_02.var_short_if = s2;
        }
    }

    public static void cfr_renamed_10() {
        (AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, (int)AngelChip.duLieuNguoiChoi.var_short_if, AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.cfr_renamed_5 ? 1 : 0 == null);
    }

    public final void this() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei("Bật Auto", 36, this));
        vector.addElement(new ei("Cài đặt", 28, this));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    protected static void cfr_renamed_16() {
        dN.cfr_renamed_0().void_do(GameCanvas.var_dL_do);
    }

    public static void cfr_renamed_3(DuLieuNguoiChoi dd_02) {
        if (fe_0.cfr_renamed_1((Object)dd_02)) {
            el_0.el_0_do().cfr_renamed_5(dd_02.var_short_char);
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cT + " " + (String)dd_02.var_short_do + "  " + MenuChinhAvatar.da);
        }
    }

    public static void (byte by2, int n, short s2, int n2, short s3, short s4 == null) {
        dB dB2 = new dB(by2, s2, n2);
        short s5 = s3;
        s3 = s4;
        n2 = s5;
        s2 = (short)n;
        dB dB3 = dB2;
        if (fe_0.boolean_do((int)s2, -2)) {
            ((aG)dB3).cfr_renamed_3 = n2;
            dB3.var_int_if = s3;
            dB3.cfr_renamed_12 = (byte)2;
            if (-"   ".length() >= 0) {
                return;
            }
        } else {
            DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(s2);
            if (fe_0.cfr_renamed_1((Object)dd_02)) {
                ((aG)dB3).cfr_renamed_3 = ((aG)dd_02).cfr_renamed_3;
                dB3.var_int_if = dd_02.var_int_if;
                dB3.cfr_renamed_12 = (byte)0;
                dB3.cfr_renamed_11 = (byte)6;
                dB3.cfr_renamed_1 = (short)0;
                if (-"  ".length() >= 0) {
                    return;
                }
            } else {
                dB3.cfr_renamed_12 = (byte)4;
                ((aG)dB3).cfr_renamed_3 = n2;
                dB3.var_int_if = s3;
                dB3.cfr_renamed_1 = (short)100;
                dB3.cfr_renamed_11 = (byte)0;
            }
        }
        dB3.var_int_this = n2;
        dB3.var_int_long = s3;
        ef_0.var_java_util_Vector_do.addElement(dB2);
        ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_new);
        }

    public static void (byte by2 == null) {
        if (fe_0.boolean_do((int)var_byte_do, -1)) {
            fe_0.cfr_renamed_10();
            GameCanvas.cfr_renamed_5();
            var_byte_do = by2;
            eq.eq_do().cfr_renamed_17(8);
        }
    }

    public static void cfr_renamed_6() {
        GameCanvas.hienThongBaoPopup(MenuChinhAvatar.var_java_lang_String_class, new cq_0());
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    private static boolean boolean_for(int n) {
        return n < 0;
    }

    private static void cfr_renamed_33() {
        Z.void_do();
        Vector<ef> vector = new Vector<ef>();
        int n = 0;
        while (fe_0.boolean_if(n, Z.var_java_util_Vector_do.size())) {
            fa_0 fa_02 = (fa_0)Z.var_java_util_Vector_do.elementAt(n);
            ef ef2 = new ef();
            new ef().var_short_do = fa_02.var_short_do;
            vector.addElement(ef2);
            ++n;
            return;
        }
        em_0.em_0_do().coTrangThai = 1;
        String[] stringArray = new String[1];
        stringArray[0] = "Kirby";
        Vector[] vectorArray = new Vector[1];
        vectorArray[0] = fe_0.java_util_Vector_do(vector);
        em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, null);
        if ((GameCanvas.var_dL_do != em_0.em_0_do())) {
            em_0.em_0_do().cfr_renamed_8();
        }
    }

    public static void void_try(int n) {
        fe_0.cfr_renamed_1(ci_0.q_0_do((short)n));
    }

    public static Vector (Vector vector, int n, int n2 == null) {
        Vector<Object> vector2 = new Vector<Object>();
        int n3 = 0;
        while (fe_0.boolean_if(n3, vector.size())) {
            Object object = (ef)vector.elementAt(n3);
            q_0 q_02 = ci_0.q_0_do(((ef)object).var_short_do);
            String string = null;
            if (fe_0.boolean_do(n, (int)AngelChip.duLieuNguoiChoi.var_short_char) && (!fe_0.boolean_new(ci_0.boolean_do((int)q_02.var_byte_if) ? 1 : 0) || fe_0.boolean_new(n2))) {
                if (fe_0.boolean_do(n2, 1)) {
                    string = MenuChinhAvatar.var_java_lang_String_new;
                    if ("  ".length() < "  ".length()) {
                        return null;
                    }
                } else {
                    string = MenuChinhAvatar.R;
                }
            }
            object = new cw(string, new dv((ef)object, n, n2, n3), (ef)object, n3, n2);
            vector2.addElement(object);
            ++n3;
            if (-" ".length() != ((0x69 ^ 0x57) & ~(0xB8 ^ 0x86))) continue;
            return null;
        }
        return vector2;
    }

    public final void (int n, int n2, int n3, String string, int n4 == null) {
        if (fe_0.boolean_do(n3, -1)) {
            GameCanvas.cfr_renamed_1(string);
            return;
        }
        this.cfr_renamed_0(1, n, n2, n3, n4);
    }

    public final void cfr_renamed_17() {
        this.cfr_renamed_31();
    }

    public static void cfr_renamed_13() {
        el_0.el_0_do().cfr_renamed_4(var_byte_int, -1);
        var_byte_do = (byte)-1;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.cfr_renamed_31();
                return;
            }
            case 2: {
                eq.eq_do().cfr_renamed_4(fe_0.duLieuNguoiChoi.var_short_char);
                return;
            }
            case 52: {
                if (!(GameCanvas.var_dL_do == fw.var_fw_do) || !fe_0.boolean_do(ef_0.soLuong, -1)) break;
                GameCanvas.cfr_renamed_5();
                eq.eq_do().cfr_renamed_17(8);
            }
        }
    }

    private static void cfr_renamed_36() {
        mangSoNguyen = new int[100];
        0 = (2 ^ 0x4F) & ~(0x4F ^ 2);
        15 = 33 + 10 - 0 + 159 ^ 95 + 100 - 121 + 123;
        1 = " ".length();
        2 = "  ".length();
        43 = 0x8F ^ 0xA4;
        16 = 0xE3 ^ 0xA4 ^ (0x4F ^ 0x18);
        19 = 0x3A ^ 0x27 ^ (0x38 ^ 0x36);
        44 = 0x5A ^ 0x76;
        46 = 0x2F ^ 0x6C ^ (0x41 ^ 0x2C);
        9 = 0x49 ^ 0x40;
        18 = 0xB7 ^ 0xA5;
        38 = 0xA1 ^ 0x87;
        40 = 0x57 ^ 0x7F;
        33 = 76 + 101 - 91 + 51 ^ 27 + 46 - -37 + 58;
        -1 = -" ".length();
        45 = 0x62 ^ 0x4F;
        51 = 0xC ^ 0x3F;
        52 = 7 ^ 0x33;
        53 = 0x6C ^ 0x59;
        58 = 0x26 ^ 0x3E ^ (0x9A ^ 0xB8);
        59 = 0x60 ^ 0x78 ^ (0x43 ^ 0x60);
        60 = 0x6D ^ 0x51;
        62 = 0xA2 ^ 0x9C;
        63 = 0x3B ^ 4;
        65 = 0x1E ^ 0x5F;
        66 = 0x7F ^ 0x47 ^ (0xF2 ^ 0x88);
        2000000000 = -(28 + 209 - 2 + 0) & (0xFFFF9EEF & 0x7735F5FA);
        118 = 0xB ^ 0x7D;
        119 = 43 + 83 - -39 + 31 ^ 120 + 23 - 0 + 36;
        120 = 4 ^ 0x7C;
        4 = 0xCB ^ 0x8F ^ (0xDC ^ 0x9C);
        99 = 0xEE ^ 0x8D;
        34 = 0xA ^ 0x28;
        35 = 0xB1 ^ 0x92;
        24 = 0x11 ^ 0x6C ^ (0xA ^ 0x6F);
        7 = 1 ^ 6;
        116 = 0x1B ^ 0x6F;
        42 = "   ".length() ^ (0x60 ^ 0x49);
        47 = 0x88 ^ 0xA7;
        25 = 64 + 106 - 56 + 25 ^ 80 + 16 - 3 + 53;
        41 = 42 + 154 - -29 + 10 ^ 112 + 66 - 122 + 138;
        61 = 37 + 0 - 3 + 138 ^ 38 + 128 - 155 + 134;
        26 = 0xD ^ 0x7E ^ (0x27 ^ 0x4E);
        29 = 2 ^ 0x6E ^ (0x31 ^ 0x40);
        57 = 86 + 24 - 52 + 78 ^ 72 + 171 - 180 + 114;
        50 = 0xCD ^ 0x88 ^ (2 ^ 0x75);
        5 = 0x64 ^ 0x61;
        67 = 0x7C ^ 0x3F;
        68 = 124 + 6 - 85 + 155 ^ 47 + 15 - 21 + 99;
        107 = 0x35 ^ 0x5B ^ (0xB5 ^ 0xB0);
        69 = 0x79 ^ 0x77 ^ (0x8E ^ 0xC5);
        64 = 57 + 186 - 176 + 132 ^ 2 + 20 - -4 + 109;
        117 = 0xC5 ^ 0xB0;
        1000 = -(0xFFFFD99B & 0x7E76) & (0xFFFFDBF9 & Short.MAX_VALUE);
        15000 = 0xFFFFFAFC & 0x3F9B;
        8 = 0x10 ^ 0x72 ^ (0x26 ^ 0x4C);
        100 = 0x56 ^ 0x77 ^ (0x6B ^ 0x2E);
        11 = 66 + 20 - -74 + 2 ^ 92 + 107 - 58 + 28;
        13 = 0x30 ^ 0x14 ^ (0x2B ^ 2);
        36 = 0x1A ^ 0x3E;
        28 = 0x68 ^ 0x74;
        30 = 0xC ^ 0x12;
        31 = 0x9F ^ 0xC7 ^ (0x3B ^ 0x7C);
        32 = 38 + 34 - 9 + 125 ^ 23 + 49 - 3 + 87;
        3 = "   ".length();
        6 = 0x23 ^ 0x25;
        10 = 54 + 94 - 87 + 83 ^ 14 + 153 - 69 + 56;
        12 = 0xA ^ 6;
        14 = 0x9A ^ 0x94;
        17 = 0x12 ^ 3;
        21 = 0xB4 ^ 0xA1;
        23 = 2 ^ 0x15;
        27 = 0x18 ^ 0x11 ^ (0x4E ^ 0x5C);
        55 = 0xBB ^ 0x94 ^ (0x47 ^ 0x5F);
        56 = 94 + 59 - 22 + 19 ^ 37 + 65 - 55 + 127;
        -100 = -(102 + 74 - -19 + 24 ^ 72 + 15 - 9 + 113);
        150 = (3 ^ 0x6B) + (0x50 ^ 0x23) - (109 + 177 - 201 + 108) + (0xED ^ 0x91);
        -5 = -(106 + 120 - 193 + 128 ^ 113 + 85 - 129 + 95);
        200 = (0x57 ^ 0x45) + (0xF5 ^ 0xC4) - (0x34 ^ 0x31) + (79 + 20 - 34 + 73);
        101 = 0x77 ^ 0x50 ^ (0x30 ^ 0x72);
        20 = 0x45 ^ 0x21 ^ (0x27 ^ 0x57);
        102 = 125 + 141 - 86 + 14 ^ 112 + 149 - 197 + 100;
        108 = 0x4F ^ 0x65 ^ (0x3C ^ 0x7A);
        22 = 49 + 75 - 79 + 119 ^ 157 + 122 - 271 + 170;
        -3 = -"   ".length();
        -2 = -"  ".length();
        47084 = 0xFFFFFFEC & 0xB7FF;
        8575990 = 0xFFFFDFFE & 0x82FBF7;
        13379 = -(26 + 104 - 86 + 89) & (0xFFFFFEF7 & 0x35CF);
        70 = 0x52 ^ 0x7D ^ (0x3A ^ 0x53);
        884 = 0xFFFFABF6 & 0x577D;
        819 = -(0xFFFFB56D & 0x7ADB) & (0xFFFFF37B & 0x3FFF);
        104 = 0xF7 ^ 0x8B ^ (0x39 ^ 0x2D);
        105 = 0x58 ^ 0x1C ^ (0x90 ^ 0xBD);
        2475 = -(0xFFFFFEC7 & 0x577D) & (0xFFFFFFEF & 0x5FFF);
        2476 = 0xFFFFF9EF & 0xFBC;
        300 = 0xFFFFE3EF & 0x1D3C;
        302 = 0xFFFF9B3E & 0x65EF;
        2477 = 0xFFFF8BBD & 0x7DEF;
        2478 = 0xFFFFCDBE & 0x3BEF;
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public final boolean boolean_do() {
        if (fe_0.boolean_new(this.var_boolean_case ? 1 : 0) && (AutoController.nhiemVuHienTai == null)) {
            return 1;
        }
        return 0;
    }

    public static void (String string == int n) {
        Vector<gd> vector = new Vector<gd>();
        int n2 = 0;
        while (fe_0.boolean_if(n2, ci_0.var_java_util_Vector_do.size())) {
            gd gd2 = (gd)ci_0.var_java_util_Vector_do.elementAt(n2);
            if (fe_0.boolean_do((int)gd2.var_byte_do, n)) {
                vector.addElement(gd2);
            }
            ++n2;
            if (((0x25 ^ 0x2B) & ~(0xA7 ^ 0xA9)) == ((0xEC ^ 0xBE) & ~(0x25 ^ 0x77))) continue;
            return;
        }
        Vector<Object> vector2 = new Vector<Object>();
        int n3 = 0;
        while (fe_0.boolean_if(n3, vector.size())) {
            Object object = (gd)vector.elementAt(n3);
            object = new aw(MenuChinhAvatar.y, new cb((gd)object), (gd)object, n3);
            vector2.addElement(object);
            ++n3;
            if (((34 + 10 - -107 + 16 ^ 26 + 109 - 114 + 136) & (0xA0 ^ 0xA6 ^ (0x92 ^ 0xAE) ^ -" ".length())) < "  ".length()) continue;
            return;
        }
        em_0.em_0_do().cfr_renamed_8();
        String[] stringArray = new String[1];
        stringArray[0] = string;
        Vector[] vectorArray = new Vector[1];
        vectorArray[0] = vector2;
        em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, null);
    }

    public final void cfr_renamed_30() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei("Bật Auto", 13, this));
        vector.addElement(new ei("Cài đặt", 15, this));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    public static void cfr_renamed_15(int n) {
        DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
        if (fe_0.cfr_renamed_1((Object)dd_02)) {
            dd_02.cfr_renamed_10();
            dd_02.coKichHoat = 1;
            gr gr2 = bW.gr_do(n);
            if ((gr2 != null)) {
                var_java_util_Vector_new.removeElement(gr2);
                }
        }
    }

    public final void (Graphics graphics == null) {
        this.cfr_renamed_1(graphics);
        if (!(GameCanvas.var_et_0_do != null) || fe_0.boolean_if(et_0.coTrangThai ? 1 : 0)) {
            super.cfr_renamed_0(graphics);
        }
    }

    public static void (int n == String string) {
        DuLieuNguoiChoi dd_02;
        if (fe_0.boolean_for(ef_0.soLuong, 24) && fe_0.boolean_for(ef_0.soLuong, 53) && fe_0.cfr_renamed_1((Object)(dd_02 = ef_0.dd_0_do(n)))) {
            int n2;
            dd_02.var_short_do = (short)null;
            int n3 = 100;
            if (!fe_0.boolean_if(n, 2000000000) || fe_0.boolean_new(TienIchGame.boolean_do((String)dd_02.var_short_do) ? 1 : 0)) {
                n2 = 1;
                if (-"   ".length() > 0) {
                    return;
                }
            } else {
                n2 = 0;
            }
            dd_02.cfr_renamed_0(n3, string, (byte)n2);
            if (fe_0.boolean_if(n, 2000000000)) {
                string = (String)dd_02.var_short_do + ": " + string;
                dN.cfr_renamed_0().var_em_do.cfr_renamed_0(string);
            }
        }
    }

    public final void cfr_renamed_8() {
        this.a_();
        super.cfr_renamed_8();
    }

    protected static void cfr_renamed_22() {
        if (fe_0.cfr_renamed_1((Object)duLieuNguoiChoi) && fe_0.boolean_if(fe_0.duLieuNguoiChoi.var_int_break)) {
            el_0.el_0_do().void_if(fe_0.duLieuNguoiChoi.var_short_char, 101);
        }
    }

    private static ei ei_do(ar_0 ar_02) {
        return new as(ar_02);
    }

    public final void void_do(Vector vector) {
        AngelChip.var_java_util_Vector_do = vector;
        if (fe_0.boolean_new(ec.cfr_renamed_0().dangChayAuto ? 1 : 0)) {
            ec.cfr_renamed_0();
            ec.cfr_renamed_1();
            return;
        }
        this.cfr_renamed_24();
    }

    public static void (int n == byte by2) {
        DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
        if (fe_0.cfr_renamed_1((Object)dd_02)) {
            if (fe_0.boolean_int(by2, 100)) {
                dd_02.void_do(by2 - 100);
                dd_02.var_short_break = dd_02.var_short_final;
                dd_02.var_short_this = (short)0;
                return;
            }
            dd_02.cfr_renamed_0(by2);
        }
    }

    public final void a_() {
        String string;
        this.var_ei_case = new ei(MenuChinhAvatar.Z, 0, this);
        ((dL)this).cfr_renamed_4 = this.var_ei_case;
        ec.cfr_renamed_0();
        this.var_ei_for = ec.cfr_renamed_0(MenuChinhAvatar.ax, new cj_0(), 15);
        if (fe_0.boolean_new(GameCanvas.coTrangThai ? 1 : 0)) {
            if (fe_0.boolean_if(GameCanvas.cfr_renamed_16)) {
                string = MenuChinhAvatar.dg;
                } else {
                string = MenuChinhAvatar.Z;
                if ("   ".length() <= ((0x56 ^ 0 ^ (0x6C ^ 0x1A)) & (118 + 54 - 46 + 34 ^ 9 + 28 - 29 + 120 ^ -" ".length()))) {
                    return;
                }
            }
        } else {
            string = "";
        }
        this.var_ei_do = new ei(string, 1, this);
        if (fe_0.boolean_do(GameCanvas.cfr_renamed_16) && (GameCanvas.var_et_0_do == null)) {
            ((dL)this).cfr_renamed_4 = this.var_ei_do;
        }
        this.var_ei_char = new ei(MenuChinhAvatar.aY, 2, this);
        this.var_ei_byte = new ei(MenuChinhAvatar.cA, 2);
        this.var_ei_if = new ei(MenuChinhAvatar.bE, 43, this);
        this.soXu = System.currentTimeMillis();
    }

    public final void cfr_renamed_20() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei("Cài xu cần up", 30, this));
        vector.addElement(new ei("Cài số ngày up", 31, this));
        vector.addElement(new ei("Reset dữ liệu", 32, this));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    public final ei (Vector vector, int n, int n2, boolean bl == null) {
        ei ei2 = new ei(MenuChinhAvatar.var_java_lang_String_long, new fc(this, vector, n, n2));
        if (fe_0.boolean_new(bl ? 1 : 0)) {
            return new ei(MenuChinhAvatar.Z, new bz_0(ei2, vector));
        }
        return ei2;
    }

    private static void (DuLieuNguoiChoi dd_02 == int n) {
        byte[] byArray;
        String[] stringArray;
        Vector[] vectorArray;
        fe_0.cfr_renamed_4(dd_02);
        byte[] byArray2 = null;
        byte[] byArray3 = new byte[2];
        if (fe_0.boolean_do((int)var_byte_do, 3)) {
            byArray3[0] = 3;
            byArray3[1] = 8;
        }
        switch (var_byte_do) {
            case 1: 
            case 6: {
                byte[] byArray4 = new byte[2];
                byArray4[0] = 10;
                byArray4[1] = 20;
                byArray2 = byArray4;
                Vector[] vectorArray2 = new Vector[2];
                vectorArray = vectorArray2;
                vectorArray2[0] = new Vector();
                vectorArray[1] = new Vector();
                String[] stringArray2 = new String[2];
                stringArray = stringArray2;
                stringArray2[0] = MenuChinhAvatar.cfr_renamed_33;
                stringArray[1] = MenuChinhAvatar.dk;
                byArray3[0] = 1;
                byArray3[1] = 6;
                byArray = new byte[2];
                if (" ".length() < (30 + 18 - -2 + 128 ^ 97 + 46 - 67 + 106)) break;
                return;
            }
            case 2: 
            case 7: {
                byte[] byArray5 = new byte[2];
                byArray5[0] = 40;
                byArray5[1] = 50;
                byArray2 = byArray5;
                Vector[] vectorArray3 = new Vector[2];
                vectorArray = vectorArray3;
                vectorArray3[0] = new Vector();
                vectorArray[1] = new Vector();
                String[] stringArray3 = new String[2];
                stringArray = stringArray3;
                stringArray3[0] = MenuChinhAvatar.bv;
                stringArray[1] = MenuChinhAvatar.ci;
                byArray = new byte[2];
                byArray3[0] = 2;
                byArray3[1] = 7;
                if ("   ".length() < (0xC7 ^ 0xC3)) break;
                return;
            }
            default: {
                Vector[] vectorArray4 = new Vector[1];
                vectorArray = vectorArray4;
                vectorArray4[0] = new Vector();
                String[] stringArray4 = new String[1];
                stringArray = stringArray4;
                stringArray4[0] = MenuChinhAvatar.chuoiGiaTri;
                byArray = new byte[1];
            }
        }
        int n2 = 0;
        while (fe_0.boolean_if(n2, ci_0.var_q_0_arr_do.length)) {
            if (fe_0.boolean_for(ci_0.var_q_0_arr_do[n2].cfr_renamed_3, -2)) {
                byte by2;
                q_0 q_02 = ci_0.var_q_0_arr_do[n2];
                if (fe_0.boolean_try(q_02.cfr_renamed_3)) {
                    by2 = ((ci)ci_0.var_q_0_arr_do[q_02.cfr_renamed_3]).cfr_renamed_3;
                    if ((" ".length() & ~" ".length()) < -" ".length()) {
                        return;
                    }
                } else {
                    by2 = ((ci)q_02).cfr_renamed_3;
                }
                if (!(!fe_0.cfr_renamed_1((Object)q_02) || fe_0.boolean_int(q_02.mangSoNguyen[0]) && !fe_0.boolean_do(q_02.mangSoNguyen[1]) || fe_0.boolean_for(dd_02.var_byte_void, by2) && !fe_0.boolean_if((int)by2) || fe_0.boolean_for(byArray3[0], q_02.var_byte_do) && !fe_0.boolean_do((int)byArray3[1], (int)q_02.var_byte_do) || !fe_0.boolean_try(q_02.cfr_renamed_3, -2))) {
                    if ((byArray2 == null)) {
                        by2 = byArray[0];
                        vectorArray[0].addElement(new ct_0(MenuChinhAvatar.dg, new cn_0(q_02), q_02, by2));
                        int n3 = 0;
                        byArray[n3] = (byte)(byArray[n3] + 1);
                        } else {
                        by2 = 0;
                        while (fe_0.boolean_if((int)by2, vectorArray.length)) {
                            if (fe_0.boolean_do((int)byArray2[by2], (int)q_02.var_byte_if)) {
                                byte by3 = byArray[by2];
                                vectorArray[by2].addElement(new aj(MenuChinhAvatar.dg, new af_0(q_02), q_02, by3));
                                byte by4 = by2;
                                byArray[by4] = (byte)(byArray[by4] + 1);
                            }
                            ++by2;
                            if ("  ".length() == "  ".length()) continue;
                            return;
                        }
                    }
                }
            }
            ++n2;
            if ("  ".length() < "   ".length()) continue;
            return;
        }
        em_0.em_0_do().cfr_renamed_8();
        em_0.coKichHoat = 1;
        em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, null);
        em_0.soLuongKhoa = n;
        em_0.em_0_do().cfr_renamed_5();
        GameCanvas.cfr_renamed_8();
        if (fe_0.boolean_do(ef_0.soLuong, 57) && fe_0.boolean_new(GameCanvas.var_boolean_byte ? 1 : 0)) {
            GameCanvas.var_et_0_do = new et_0();
            GameCanvas.var_et_0_do.cfr_renamed_0(em_0.var_em_0_do);
        }
    }

    public final void void_do(int n) {
        ce.cfr_renamed_0().cfr_renamed_0(n, this);
        super.void_do(n);
    }

    public final void cfr_renamed_14() {
        if (fe_0.boolean_new(this.dangChayAuto ? 1 : 0)) {
            this.dangChayAuto = 1;
            GameCanvas.cfr_renamed_5();
            if (fe_0.boolean_do(fw.cfr_renamed_0().soLuongKhoa, 2)) {
                eq.eq_do().cfr_renamed_4(-1);
                return;
            }
            byte[] byArray = new byte[7];
            byArray[0] = 0;
            byArray[1] = 13;
            byArray[2] = 20;
            byArray[3] = 9;
            byArray[4] = 23;
            byArray[5] = 11;
            byArray[6] = 17;
            byte[] byArray2 = byArray;
            el_0.el_0_do().cfr_renamed_4(byArray2[fw.cfr_renamed_0().soLuongKhoa], -1);
        }
    }

    private static void void_try(int n, int n2) {
        if (fe_0.boolean_for(n, n2)) {
            String string;
            StringBuffer stringBuffer = new StringBuffer();
            if (fe_0.boolean_do(n2 - n)) {
                string = "+";
                if (((0xE8 ^ 0xAA ^ (0x1D ^ 3)) & (0x3A ^ 0x15 ^ (0x4F ^ 0x3C) ^ -" ".length())) > 0) {
                    return;
                }
            } else {
                string = "";
            }
            GameCanvas.hienThongBaoPopup(stringBuffer.append(string).append(n2 - n).toString(), AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if - 40, 0, -1);
        }
    }

    public final void void_for() {
        Object object;
        DuLieuNguoiChoi dd_02;
        DuLieuNguoiChoi dd_03;
        GameCanvas.var_ef_0_do.cfr_renamed_3();
        if (fe_0.boolean_if(GameCanvas.cfr_renamed_16) && (ef_0.var_aG_do != null)) {
            if (fe_0.cfr_renamed_1((Object)duLieuNguoiChoi) && fe_0.boolean_for(ef_0.var_aG_do.var_byte_if, 5) && fe_0.boolean_try(fe_0.duLieuNguoiChoi.var_short_char, 2000000000)) {
                ((dL)this).cfr_renamed_5 = this.var_ei_byte;
                if ("   ".length() != "   ".length()) {
                    return;
                }
            } else {
                ((dL)this).cfr_renamed_5 = null;
            }
            ((dL)this).cfr_renamed_2 = ef_0.var_ei_do;
            if (fe_0.boolean_if((int)ef_0.var_aG_do.var_byte_if)) {
                ((dL)this).cfr_renamed_2.chuoiGiaTri = (String)((DuLieuNguoiChoi)ef_0.var_aG_do).var_short_do;
                if (fe_0.boolean_try(((dL)this).cfr_renamed_2.chuoiGiaTri.length(), 8)) {
                    ((dL)this).cfr_renamed_2.chuoiGiaTri = ((dL)this).cfr_renamed_2.chuoiGiaTri.substring(0, 8) + "..";
                }
            }
        }
        if ((ef_0.var_aG_do == null) && fe_0.cfr_renamed_0(((dL)this).cfr_renamed_2, ef_0.var_ei_do)) {
            ((dL)this).cfr_renamed_2 = null;
            ((dL)this).cfr_renamed_5 = null;
        }
        if (fe_0.boolean_new(var_boolean_try ? 1 : 0)) {
            if (fe_0.boolean_do((int)this.cfr_renamed_18, 1) && fe_0.boolean_do(GameCanvas.cfr_renamed_6, -1)) {
                this.cfr_renamed_18 = (byte)2;
                dd_03 = ef_0.dd_0_do(-100);
                dd_02 = ef_0.dd_0_do(soLuong);
                object = ef_0.dd_0_do(soLuongKhoa);
                if (fe_0.cfr_renamed_1((Object)dd_02) && (object != null)) {
                    ek_0.ek_0_do().var_bk_0_do = dd_03;
                    dd_03.cfr_renamed_0(150, MenuChinhAvatar.var_java_lang_String_arr_short[0] + (String)dd_02.var_short_do + MenuChinhAvatar.var_java_lang_String_arr_short[1] + (String)((DuLieuNguoiChoi)object).var_short_do + MenuChinhAvatar.var_java_lang_String_arr_short[2], 1);
                    } else {
                    this.cfr_renamed_39();
                }
            }
            if (fe_0.boolean_do((int)this.cfr_renamed_18, 2) && fe_0.boolean_do(GameCanvas.var_int_try % 4, 2) && fe_0.cfr_renamed_0((Object)ef_0.dd_0_do((int)-100).var_short_do)) {
                this.cfr_renamed_18 = (byte)3;
                dd_02 = ef_0.dd_0_do(soLuong);
                object = ef_0.dd_0_do(soLuongKhoa);
                if (fe_0.cfr_renamed_1((Object)dd_02) && (object != null)) {
                    ((DuLieuNguoiChoi)object).var_short_else = (short)(26 * ef_0.var_int_if - ef_0.var_int_if);
                    ((DuLieuNguoiChoi)object).var_int_break = -5;
                    dd_02.var_short_else = (short)(26 * ef_0.var_int_if - (ef_0.var_int_if << 1));
                    dd_02.var_int_break = -5;
                    ek_0.ek_0_do().var_bk_0_do = dd_02;
                    if (-" ".length() > 0) {
                        return;
                    }
                } else {
                    this.cfr_renamed_39();
                }
            }
            if (fe_0.boolean_do((int)this.cfr_renamed_18, 3)) {
                dd_03 = ef_0.dd_0_do(soLuong);
                dd_02 = ef_0.dd_0_do(soLuongKhoa);
                if (fe_0.cfr_renamed_1((Object)dd_03) && fe_0.cfr_renamed_1((Object)dd_02) && fe_0.boolean_if(dd_03.var_int_break) && fe_0.boolean_if(dd_02.var_int_break)) {
                    this.cfr_renamed_18 = (byte)4;
                    ek_0.ek_0_do().var_bk_0_do = object = ef_0.dd_0_do(-100);
                    ((bk_0)object).cfr_renamed_0(200, MenuChinhAvatar.var_java_lang_String_arr_new[0] + (String)dd_03.var_short_do + MenuChinhAvatar.var_java_lang_String_arr_short[1] + (String)dd_02.var_short_do, 1);
                    ((bk_0)object).cfr_renamed_0(200, MenuChinhAvatar.var_java_lang_String_arr_new[1], 1);
                    ((bk_0)object).cfr_renamed_0(150, MenuChinhAvatar.var_java_lang_String_arr_new[2], 1);
                    ((bk_0)object).cfr_renamed_0(100, MenuChinhAvatar.var_java_lang_String_arr_new[3], 1);
                }
            }
            if (fe_0.boolean_do((int)this.cfr_renamed_18, 4)) {
                dd_03 = ef_0.dd_0_do(soLuong);
                dd_02 = ef_0.dd_0_do(soLuongKhoa);
                dd_03.var_short_goto = (short)4;
                dd_02.var_short_goto = (short)4;
                object = ef_0.dd_0_do(-100);
                if (fe_0.cfr_renamed_0((Object)((DuLieuNguoiChoi)object).var_short_do) && fe_0.boolean_new(((DuLieuNguoiChoi)object).var_short_do.isEmpty() ? 1 : 0)) {
                    if (fe_0.boolean_do(soLuong, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
                        el_0.el_0_do().void_if(soLuongKhoa, 101);
                    }
                    this.cfr_renamed_11 = (byte)0;
                    this.cfr_renamed_18 = (byte)5;
                }
            }
        }
        if (fe_0.boolean_do((int)this.cfr_renamed_18, 5) && fe_0.boolean_try(this.cfr_renamed_11)) {
            this.cfr_renamed_11 = (byte)(this.cfr_renamed_11 + 1);
            if (fe_0.boolean_try(this.cfr_renamed_11, 20)) {
                if (fe_0.boolean_do((int)this.cfr_renamed_11, 21)) {
                    object = new er_0(2, 0);
                    GameCanvas.var_java_util_Vector_if.addElement(object);
                    ek_0.ek_0_do().var_bk_0_do = AngelChip.duLieuNguoiChoi;
                    AngelChip.duLieuNguoiChoi.var_short_goto = (short)4;
                }
                if (fe_0.boolean_for(AngelChip.duLieuNguoiChoi.var_short_char, soLuong)) {
                    var_boolean_try = 0;
                    this.cfr_renamed_11 = (byte)-1;
                }
                if (fe_0.boolean_if(AngelChip.duLieuNguoiChoi.var_int_break) && fe_0.boolean_do((int)AngelChip.duLieuNguoiChoi.var_short_char, soLuong)) {
                    var_boolean_try = 0;
                    dd_03 = ef_0.dd_0_do(soLuong);
                    dd_02 = ef_0.dd_0_do(soLuongKhoa);
                    if (fe_0.cfr_renamed_1((Object)dd_03) && fe_0.cfr_renamed_1((Object)dd_02)) {
                        dd_03.var_short_goto = (short)4;
                        dd_02.var_short_goto = (short)4;
                    }
                    this.cfr_renamed_18 = (byte)6;
                    this.cfr_renamed_11 = (byte)-1;
                    el_0.el_0_do().void_if(soLuongKhoa, 102);
                }
            }
        }
        if (fe_0.cfr_renamed_0(((dL)this).cfr_renamed_5) && fe_0.boolean_if(GameCanvas.cfr_renamed_16) && (GameCanvas.var_et_0_do == null)) {
            ((dL)this).cfr_renamed_5 = this.var_ei_do;
            if ((0x15 ^ 0x10) == 0) {
                return;
            }
        } else if ((GameCanvas.var_et_0_do != null)) {
            ((dL)this).cfr_renamed_5 = null;
        }
        if (fe_0.boolean_do(var_java_util_Vector_new.size())) {
            int n = 0;
            while (fe_0.boolean_if(n, var_java_util_Vector_new.size())) {
                ((gr)var_java_util_Vector_new.elementAt(n)).cfr_renamed_0();
                ++n;
                return;
            }
        }
        if (fe_0.boolean_do(this.var_int_case)) {
            this.var_int_case -= 1;
            if (fe_0.boolean_if(this.var_int_case)) {
                if (fe_0.boolean_do(this.var_java_util_Vector_try.size())) {
                    this.var_java_util_Vector_try.removeElementAt(0);
                }
                if (fe_0.boolean_do(this.var_java_util_Vector_try.size())) {
                    this.var_int_case = this.var_int_byte;
                }
            }
        }
        if (fe_0.boolean_new(this.boolean_do() ? 1 : 0) && fe_0.boolean_do((System.currentTimeMillis() - this.soXu == this.var_long_if))) {
            this.var_long_if = TienIchGame.int_do(1, 45) * 1000 + 15000;
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
            el_0.el_0_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if, 2, 0);
        }
    }

        public static void (short s2, String object, int n, int n2, int n3 == null) {
        GameCanvas.cfr_renamed_1((String)object);
        AngelChip.duLieuNguoiChoi.void_int(n);
        AngelChip.duLieuNguoiChoi.void_if(n2);
        AngelChip.duLieuNguoiChoi.soLuong = n3;
        object = ci_0.q_0_do(s2);
        if (fe_0.boolean_for(((q_0)object).cfr_renamed_3, -2)) {
            ef ef2 = ci_0.cfr_renamed_0((int)((q_0)object).var_byte_if, AngelChip.duLieuNguoiChoi.var_java_util_Vector_if);
            if ((ef2 != null)) {
                ef2.var_short_do = s2;
                if (" ".length() != " ".length()) {
                    return;
                }
            } else if (fe_0.boolean_do((int)((q_0)object).var_byte_if, -1) && fe_0.boolean_for(AngelChip.duLieuNguoiChoi.var_short_short, -1)) {
                AngelChip.duLieuNguoiChoi.cfr_renamed_0(s2);
                db_0.db_0_do().cfr_renamed_2(AngelChip.duLieuNguoiChoi.var_short_char);
                if ((66 + 109 - 160 + 117 ^ 1 + 38 - 22 + 111) <= 0) {
                    return;
                }
            } else {
                AngelChip.duLieuNguoiChoi.cfr_renamed_1(new ef(s2));
                AngelChip.duLieuNguoiChoi.void_if();
            }
            AngelChip.duLieuNguoiChoi.void_do(11);
            if (fe_0.boolean_do((int)((q_0)object).var_byte_if, -1) && fe_0.boolean_do((int)AngelChip.duLieuNguoiChoi.var_short_short, -1)) {
                AngelChip.duLieuNguoiChoi.cfr_renamed_18();
                db_0.db_0_do().cfr_renamed_2(AngelChip.duLieuNguoiChoi.var_short_char);
            }
        }
        AngelChip.var_java_util_Vector_do = null;
    }

    private static boolean boolean_for(int n, int n2) {
        return n != n2;
    }

    private static boolean boolean_int(int n, int n2) {
        return n >= n2;
    }

    public static void (int n, int n2, int n3, int n4, short s2 == null) {
        DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
        if (fe_0.boolean_for(n, AngelChip.duLieuNguoiChoi.var_short_char) && fe_0.boolean_if(var_boolean_try ? 1 : 0) && fe_0.cfr_renamed_1((Object)dd_02)) {
            if (fe_0.boolean_new(dd_02.var_short_do) && fe_0.boolean_if(dd_02.var_int_break)) {
                dd_02.var_short_do = (short)0;
                dd_02.void_do(n2, n3);
                dd_02.cfr_renamed_5 = s2;
            }
            if (fe_0.boolean_do(dd_02.var_boolean_int ? 1 : 0, -3)) {
                dd_02.var_boolean_int = 0;
            }
            dd_02.var_int_catch = -1;
            if (fe_0.boolean_if(dd_02.var_int_break)) {
                eq_0 eq_02 = new eq_0(n2, n3, n4);
                new eq_0(n2, n3, n4).var_short_do = s2;
                dd_02.var_java_util_Vector_for.addElement(eq_02);
            }
        }
    }

    public static Vector java_util_Vector_do(DuLieuNguoiChoi dd_02) {
        DuLieuNguoiChoi dd_03 = new DuLieuNguoiChoi();
        new DuLieuNguoiChoi().var_short_do = dd_02.var_short_do;
        dd_03.void_int(dd_02.int_do());
        dd_03.var_short_char = dd_02.var_short_char;
        dd_03.var_short_short = dd_02.var_short_short;
        dd_03.var_short_void = dd_02.var_short_void;
        int n = 0;
        while (fe_0.boolean_if(n, dd_02.var_java_util_Vector_if.size())) {
            ef ef2 = (ef)dd_02.var_java_util_Vector_if.elementAt(n);
            q_0 q_02 = ci_0.q_0_do(ef2.var_short_do);
            if (fe_0.cfr_renamed_1((Object)q_02) && fe_0.boolean_for(q_02.var_byte_if, 30) && fe_0.boolean_for(q_02.var_byte_if, 40)) {
                dd_03.cfr_renamed_1(ef2);
            }
            ++n;
            return null;
        }
        if (fe_0.boolean_for(dd_03.var_short_short, -1)) {
            ef ef3 = new ef(dd_03.var_short_short);
            new ef(dd_03.var_short_short).var_byte_do = (byte)(100 - dd_03.var_short_void);
            dd_03.var_java_util_Vector_if.addElement(ef3);
        }
        return (dd_03.var_java_util_Vector_if, dd_03.var_short_char, 0 == null);
    }

    protected static void cfr_renamed_23() {
        Vector<ei> vector = new Vector<ei>();
        int n = 0;
        while (fe_0.boolean_if(n, 4)) {
            ec.cfr_renamed_0();
            ei ei2 = ec.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_arr_do[n], new cj(n), n + 7);
            vector.addElement(ei2);
            ++n;
            return;
        }
        ec.cfr_renamed_0();
        ec.cfr_renamed_0().cfr_renamed_0(vector);
    }

    private static boolean boolean_int(int n) {
        return n <= 0;
    }

    public static void (boolean bl == String string) {
        if (fe_0.boolean_new(bl ? 1 : 0)) {
            es.cfr_renamed_0();
            es.cfr_renamed_4();
        }
        GameCanvas.cfr_renamed_1(string);
    }

    public final void (int n, int n2, int n3, String string, int n4, int n5, int n6 == null) {
        if (fe_0.boolean_do(n3, -1)) {
            GameCanvas.cfr_renamed_1(string);
            return;
        }
        if (fe_0.boolean_do(n, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_0(n4, n5, n6);
        }
        this.cfr_renamed_0(0, n, n2, n3, 0);
    }

    public final void cfr_renamed_2() {
        this.var_ei_char.cfr_renamed_1();
    }

    protected final void cfr_renamed_24() {
        DuLieuNguoiChoi dd_02 = AngelChip.duLieuNguoiChoi;
        if ((GameCanvas.var_dL_do != ec.var_ec_do)) {
            em_0.em_0_do().coTrangThai = 1;
            String[] stringArray = new String[2];
            stringArray[0] = MenuChinhAvatar.bF;
            stringArray[1] = MenuChinhAvatar.bA;
            Vector[] vectorArray = new Vector[2];
            vectorArray[0] = (AngelChip.var_java_util_Vector_do, dd_02.var_short_char, 1 == null);
            vectorArray[1] = fe_0.java_util_Vector_do(dd_02);
            em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, null);
            em_0.em_0_do().cfr_renamed_0(this.cfr_renamed_0(dd_02.var_java_util_Vector_if, 0, 0, 0), 1);
            em_0.em_0_do().cfr_renamed_0(this.cfr_renamed_0(AngelChip.var_java_util_Vector_do, 1, 0, 1), 0);
            if ((GameCanvas.var_dL_do != em_0.em_0_do())) {
                em_0.em_0_do().cfr_renamed_8();
            }
        }
    }

    public static void (o_0 o_02 == null) {
        if (fe_0.cfr_renamed_0((Object)ef_0.var_java_util_Vector_if)) {
            ef_0.var_java_util_Vector_if = new Vector();
        }
        ef_0.var_java_util_Vector_if.addElement(o_02);
    }

    private static boolean boolean_new(int n, int n2) {
        return n <= n2;
    }

    public static void (DuLieuNguoiChoi object == String object2) {
        object = new em(MenuChinhAvatar.aX, -2, new ei(MenuChinhAvatar.da, new cg((DuLieuNguoiChoi)object)), new ei(MenuChinhAvatar.af, new fg((DuLieuNguoiChoi)object)), 0);
        ((em)object).cfr_renamed_0((String)object2);
        object2 = dN.cfr_renamed_0();
        ((em)object).dangChayAuto = 1;
        ((dN)object2).cfr_renamed_0((em)object);
        if ((GameCanvas.var_dL_do != dN.cfr_renamed_0())) {
            dL.cfr_renamed_22 += 1;
        }
    }

    public static void cfr_renamed_4(DuLieuNguoiChoi dd_02) {
        var_dd_0_if = new DuLieuNguoiChoi();
        new DuLieuNguoiChoi().var_java_util_Vector_if = new Vector();
        fe_0.var_dd_0_if.coKichHoat = 0;
        fe_0.var_dd_0_if.var_byte_void = dd_02.var_byte_void;
        fe_0.var_dd_0_if.var_short_class = dd_02.var_short_class;
        int n = 0;
        while (fe_0.boolean_if(n, dd_02.var_java_util_Vector_if.size())) {
            ef ef2 = new ef();
            new ef().var_short_do = ((ef)dd_02.var_java_util_Vector_if.elementAt((int)n)).var_short_do;
            var_dd_0_if.cfr_renamed_1(ef2);
            ++n;
            if (-" ".length() <= 0) continue;
            return;
        }
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void (byte[] objectArray, byte by2, byte by3, byte by4, Image image, short[] sArray, Vector vector, Vector vector2 == null) {
        var_short_arr_do = sArray;
        GameCanvas.cfr_renamed_6 = 0;
        var_byte_int = by2;
        ef_0.var_java_util_Vector_try = vector;
        ef_0.var_java_util_Vector_byte = vector2;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])objectArray);
        ef_0.var_short_arr_do = new short[objectArray.length];
        ef_0.var_short_if = by4;
        ef_0.var_short_do = (short)(objectArray.length / by4);
        ef_0.var_javax_microedition_lcdui_Image_do = image;
        if ((image != null)) {
            objectArray = new int[4];
            image.getRGB((int[])objectArray, 0, 2, 0, 0, 2, 2);
            ef_0.cfr_renamed_18 = objectArray[0];
        }
        try {
            int n = 0;
            while (fe_0.boolean_if(n, ef_0.var_short_arr_do.length)) {
                ef_0.var_short_arr_do[n] = (short)byteArrayInputStream.read();
                ++n;
                if (((73 + 66 - 94 + 84 ^ 130 + 91 - 74 + 2) & (0x9B ^ 0xA9 ^ (0x45 ^ 0x63) ^ -" ".length())) != (0xDD ^ 0x81 ^ (0xCA ^ 0x92))) continue;
                return;
            }
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if ("   ".length() > "   ".length()) {
            return;
        }
        if (fe_0.boolean_for(by3, ef_0.soLuongKhoa)) {
            eq.eq_do().cfr_renamed_1(by3);
            return;
        }
        ef_0.cfr_renamed_1();
    }

    protected final void cfr_renamed_25() {
        dN.cfr_renamed_0().cfr_renamed_0((int)fe_0.duLieuNguoiChoi.var_short_char, (String)fe_0.duLieuNguoiChoi.var_short_do);
        dN.cfr_renamed_0().void_do(this);
    }

    public static void (int n, int n2, String string, String[] stringArray == null) {
        Vector<ei> vector = new Vector<ei>();
        int n3 = 0;
        while (fe_0.boolean_if(n3, stringArray.length)) {
            vector.addElement(new ei(stringArray[n3], new fo_0(n, n2, n3)));
            ++n3;
            if (" ".length() < "  ".length()) continue;
            return;
        }
        GameCanvas.hienThongBaoPopup(string, vector);
    }

    public static boolean (gx[] gxArray == null) {
        int n = -1;
        int n2 = 0;
        while (fe_0.boolean_if(n2, 3)) {
            if (fe_0.boolean_new(gxArray[n2].java_lang_String_do().equals("") ? 1 : 0)) {
                n = n2;
            }
            ++n2;
            if ("  ".length() > 0) continue;
            return ((0xB0 ^ 0xB9) & ~(0x45 ^ 0x4C)) != 0;
        }
        if (fe_0.boolean_if(gxArray[1].java_lang_String_do().equals(gxArray[2].java_lang_String_do()) ? 1 : 0)) {
            n = 3;
        }
        if (fe_0.boolean_new(gxArray[0].java_lang_String_do().equals(gxArray[1].java_lang_String_do()) ? 1 : 0)) {
            n = 4;
        }
        if (fe_0.boolean_for(n, -1)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_final[n]);
            return 0;
        }
        return 1;
    }

    public static void void_do(ar_0 ar_02) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(fe_0.ei_do(ar_02));
        em_0.em_0_do().coTrangThai = 1;
        String[] stringArray = new String[1];
        stringArray[0] = MenuChinhAvatar.cY;
        em_0.em_0_do().cfr_renamed_0(stringArray, new Vector[1], vector);
        if ((GameCanvas.var_dL_do != em_0.em_0_do())) {
            em_0.em_0_do().cfr_renamed_8();
        }
    }

    public static fe_0 fe_0_do() {
        if ((var_fe_0_do == null)) {
            var_fe_0_do = new fe_0();
        }
        return var_fe_0_do;
    }

    public static void void_int(int n, int n2) {
        ef ef2;
        DuLieuNguoiChoi dd_02;
        if (fe_0.boolean_for(n, AngelChip.duLieuNguoiChoi.var_short_char) && fe_0.cfr_renamed_1((Object)(dd_02 = ef_0.dd_0_do(n))) && (ef2 = ci_0.ef_do(dd_02.var_java_util_Vector_if, n2) != null)) {
            dd_02.var_java_util_Vector_if.removeElement(ef2);
            }
    }

    public final void void_new(int n, int n2) {
        Object object;
        int n3;
        Object object2;
        if ((GameCanvas.var_dL_do == em_0.var_em_0_do)) {
            em_0.em_0_do().cfr_renamed_2();
        }
        GameCanvas.cfr_renamed_6 = 1;
        soLuong = n;
        soLuongKhoa = n2;
        var_boolean_try = 1;
        this.cfr_renamed_18 = (byte)0;
        int n4 = 0;
        while (fe_0.boolean_if(n4, var_java_util_Vector_do.size() - 1)) {
            object2 = (eq_0)var_java_util_Vector_do.elementAt(n4);
            n3 = n4 + 1;
            while (fe_0.boolean_if(n3, var_java_util_Vector_do.size())) {
                object = (eq_0)var_java_util_Vector_do.elementAt(n3);
                if (fe_0.boolean_try(((eq_0)object2).var_short_if, ((eq_0)object).var_short_if)) {
                    var_java_util_Vector_do.setElementAt(object, n4);
                    var_java_util_Vector_do.setElementAt(object2, n3);
                    object2 = object;
                }
                ++n3;
                return;
            }
            ++n4;
            if (((0x35 ^ 0x54 ^ 47 + 88 - 134 + 126) & (0x83 ^ 0x8E ^ (0x71 ^ 0x62) ^ -" ".length())) <= 0) continue;
            return;
        }
        n4 = 0;
        while (fe_0.boolean_if(n4, ef_0.var_java_util_Vector_do.size() - 1)) {
            object2 = (aG)ef_0.var_java_util_Vector_do.elementAt(n4);
            if (fe_0.boolean_if((int)((aG)object2).var_byte_if)) {
                n3 = n4 + 1;
                while (fe_0.boolean_if(n3, ef_0.var_java_util_Vector_do.size())) {
                    object = (aG)ef_0.var_java_util_Vector_do.elementAt(n3);
                    if (fe_0.boolean_if((int)((aG)object).var_byte_if) && fe_0.boolean_try(((DuLieuNguoiChoi)object2).var_short_char, ((DuLieuNguoiChoi)object).var_short_char)) {
                        ef_0.var_java_util_Vector_do.setElementAt(object, n4);
                        ef_0.var_java_util_Vector_do.setElementAt(object2, n3);
                        object2 = object;
                    }
                    ++n3;
                    if (((9 ^ 0x15) & ~(0xDC ^ 0xC0)) == 0) continue;
                    return;
                }
            }
            ++n4;
            if ("   ".length() >= 0) continue;
            return;
        }
        n4 = 0;
        while (fe_0.boolean_if(n4, ef_0.var_java_util_Vector_do.size())) {
            object2 = (aG)ef_0.var_java_util_Vector_do.elementAt(n4);
            if (fe_0.boolean_if((int)((aG)object2).var_byte_if)) {
                object = (DuLieuNguoiChoi)object2;
                ((DuLieuNguoiChoi)object).var_java_util_Vector_for.removeAllElements();
                if (fe_0.boolean_do((int)((DuLieuNguoiChoi)object).var_short_char, n2)) {
                    ((DuLieuNguoiChoi)object).var_short_else = (short)0;
                    ((DuLieuNguoiChoi)object).coKichHoat = ((DuLieuNguoiChoi)object).coKichHoat;
                    ((DuLieuNguoiChoi)object).cfr_renamed_5 = 8 * ef_0.var_int_if + ef_0.var_int_if / 2 - ef_0.var_int_if / 2;
                    ((DuLieuNguoiChoi)object).var_short_if = (short)(((DuLieuNguoiChoi)object).cfr_renamed_5 ? 1 : 0);
                    ((DuLieuNguoiChoi)object).var_short_goto = (short)2;
                    this.cfr_renamed_18 = (byte)1;
                    ((DuLieuNguoiChoi)object).void_if(2475, 20);
                    ((DuLieuNguoiChoi)object).void_if(2476, 10);
                    ((DuLieuNguoiChoi)object).void_if(300, 60);
                    ((DuLieuNguoiChoi)object).void_if(302, 70);
                    ((DuLieuNguoiChoi)object).void_if();
                    if (((6 + 123 - -11 + 37 ^ 123 + 53 - 74 + 37) & (0x86 ^ 0xBD ^ " ".length() ^ -" ".length())) > 0) {
                        return;
                    }
                } else if (fe_0.boolean_do((int)((DuLieuNguoiChoi)object).var_short_char, n)) {
                    ((DuLieuNguoiChoi)object).var_short_else = (short)0;
                    ((DuLieuNguoiChoi)object).coKichHoat = ((DuLieuNguoiChoi)object).coKichHoat;
                    ((DuLieuNguoiChoi)object).cfr_renamed_5 = 8 * ef_0.var_int_if + ef_0.var_int_if / 2 + ef_0.var_int_if / 2;
                    ((DuLieuNguoiChoi)object).var_short_if = (short)(((DuLieuNguoiChoi)object).cfr_renamed_5 ? 1 : 0);
                    ((DuLieuNguoiChoi)object).var_short_goto = (short)2;
                    this.cfr_renamed_18 = (byte)1;
                    ((DuLieuNguoiChoi)object).void_if(2477, 20);
                    ((DuLieuNguoiChoi)object).void_if(2478, 10);
                    ((DuLieuNguoiChoi)object).void_if();
                }
            }
            ++n4;
            if ((0 ^ 0x1A ^ (0x43 ^ 0x5D)) != -" ".length()) continue;
            return;
        }
        object = ef_0.dd_0_do(n);
        DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n2);
        ef_0.var_java_util_Vector_do.removeElement(object);
        ef_0.var_java_util_Vector_do.removeElement(dd_02);
        n3 = 0;
        n2 = 0;
        while (fe_0.boolean_if(n2, ef_0.var_java_util_Vector_do.size())) {
            aG aG2 = (aG)ef_0.var_java_util_Vector_do.elementAt(n2);
            if (fe_0.boolean_if((int)aG2.var_byte_if)) {
                aG2 = (DuLieuNguoiChoi)aG2;
                if (fe_0.boolean_for(((DuLieuNguoiChoi)aG2).var_short_char, -100)) {
                    object2 = (eq_0)var_java_util_Vector_do.elementAt(n3 / 2);
                    GameCanvas.soLuongKhoa = GameCanvas.var_int_case = ((eq_0)object2).var_int_if - ek_0.ek_0_do().soLuong + ef_0.var_int_if / 2;
                    GameCanvas.var_int_if = GameCanvas.var_int_goto = ((eq_0)object2).soLuong - ek_0.ek_0_do().cfr_renamed_3 + ef_0.var_int_if / 2 + n2 % 2 * (ef_0.var_int_if - 5);
                    ++n3;
                    ((bk_0)aG2).void_do(GameCanvas.soLuongKhoa + ek_0.ek_0_do().soLuong, GameCanvas.var_int_if + ek_0.ek_0_do().cfr_renamed_3);
                }
            }
            ++n2;
            if (-" ".length() != "   ".length()) continue;
            return;
        }
        ef_0.var_java_util_Vector_do.addElement(object);
        ef_0.var_java_util_Vector_do.addElement(dd_02);
        ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_do);
        GameCanvas.cfr_renamed_8();
    }

    public final void (int[] object == null) {
        int n;
        if (fe_0.boolean_new(TienIchGame.cfr_renamed_2 ? 1 : 0)) {
            TienIchGame.mangSoNguyen = object;
            TienIchGame.cfr_renamed_2();
            return;
        }
        int[] nArray = object;
        object = bR.cfr_renamed_0();
        bR.cfr_renamed_0().mangSoNguyen = nArray;
        int n2 = GameCanvas.var_int_int - (object.soLuong * object.cfr_renamed_3 + 10) / 2 + 4;
        int n3 = GameCanvas.var_int_long - object.soLuong * object.var_int_if / 2;
        int n4 = object.soLuong;
        int n5 = object.soLuong;
        int n6 = object.cfr_renamed_3 * object.soLuong;
        int n7 = object.mangSoNguyen.length / object.cfr_renamed_3 * object.soLuong;
        int n8 = object.soLuong * object.cfr_renamed_3;
        int n9 = object.soLuong * object.var_int_if;
        if (fe_0.boolean_if(GameCanvas.cfr_renamed_16)) {
            n = 30;
            if (" ".length() > (0x59 ^ 0x34 ^ (0xD6 ^ 0xBF))) {
                return;
            }
        } else {
            n = 0;
        }
        GameCanvas.var_ex_do.cfr_renamed_0(n2, n3, n4, n5, n6, n7, n8, n9 - n, nArray.length);
        bR.cfr_renamed_0().void_do(this);
    }

        public static void (int n != byte by2) {
        if (fe_0.boolean_do(n, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
            AngelChip.duLieuNguoiChoi.var_short_void = by2;
            return;
        }
        DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
        if (fe_0.cfr_renamed_1((Object)dd_02)) {
            dd_02.var_short_void = by2;
        }
    }

    protected static void cfr_renamed_27() {
        if (fe_0.cfr_renamed_1((Object)duLieuNguoiChoi)) {
            el_0.el_0_do().cfr_renamed_3(0, fe_0.duLieuNguoiChoi.var_short_char);
        }
    }

    public static void (byte by2, Vector vector, Vector vector2, Vector object == null) {
        byte[] byArray = new byte[7];
        byArray[0] = 59;
        byArray[1] = 60;
        byArray[2] = 58;
        byArray[3] = 104;
        byArray[4] = 105;
        byArray[5] = 101;
        byArray[6] = 102;
        byte[] byArray2 = byArray;
        ef_0.var_java_util_Vector_try = vector2;
        ef_0.var_java_util_Vector_byte = object;
        GameCanvas.var_ef_0_do.void_do(byArray2[by2]);
        if (fe_0.cfr_renamed_1((Object)vector2)) {
            ef_0.cfr_renamed_4();
        }
        int n = 0;
        while (fe_0.boolean_if(n, vector.size())) {
            object = (aG)vector.elementAt(n);
            if (fe_0.boolean_if((int)((aG)object).var_byte_if)) {
                object = (DuLieuNguoiChoi)object;
                ((DuLieuNguoiChoi)object).var_short_else = (short)(((DuLieuNguoiChoi)object).coKichHoat ? 1 : 0);
                ((DuLieuNguoiChoi)object).cfr_renamed_5 = ((DuLieuNguoiChoi)object).var_short_if;
                ((DuLieuNguoiChoi)object).var_byte_goto = (byte)(((DuLieuNguoiChoi)object).coKichHoat ? 1 : 0);
                ((DuLieuNguoiChoi)object).void_if();
                if (fe_0.boolean_for(((DuLieuNguoiChoi)object).var_short_char, AngelChip.duLieuNguoiChoi.var_short_char)) {
                    fe_0.cfr_renamed_5((DuLieuNguoiChoi)object);
                    ef_0.cfr_renamed_1((DuLieuNguoiChoi)object);
                }
                if (((0x10 ^ 0x38 ^ (0xB5 ^ 0x8C)) & (206 + 65 - 208 + 152 ^ 10 + 176 - 103 + 115 ^ -" ".length())) >= "  ".length()) {
                    return;
                }
            } else if (fe_0.boolean_do((int)((aG)object).var_byte_if, 5)) {
                object = (dB)object;
                ((dB)object).var_int_this = ((dB)object).cfr_renamed_3;
                ((dB)object).var_int_long = ((dB)object).cfr_renamed_1;
                ef_0.var_java_util_Vector_do.addElement(object);
            }
            ++n;
            if ((8 ^ 0xC) != "   ".length()) continue;
            return;
        }
        if (fe_0.boolean_new(eg.dangChayAuto ? 1 : 0)) {
            (eg.var_eq_0_do.var_int_if, eg.var_eq_0_do.soLuong, AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.cfr_renamed_5 ? 1 : 0 == null);
            } else {
            AngelChip.duLieuNguoiChoi.var_short_if = (short)(AngelChip.duLieuNguoiChoi.var_short_if + 1);
            fe_0.cfr_renamed_10();
        }
        fe_0.void_int(AngelChip.duLieuNguoiChoi.var_short_final);
        if (fe_0.boolean_new(GameCanvas.var_boolean_byte ? 1 : 0) && fe_0.boolean_do((int)byArray2[by2], 101)) {
            GameCanvas.var_et_0_do = new et_0();
            GameCanvas.var_et_0_do.cfr_renamed_1();
        }
    }

    public static void (Graphics graphics, String string, int n, int n2, int n3 == null) {
        graphics.drawImage(var_javax_microedition_lcdui_Image_do, n, n2 + 2, 17);
        int n4 = var_javax_microedition_lcdui_Image_do.getWidth() - 4 * bn_0.cfr_renamed_6;
        int n5 = n3 * n4 / 100;
        if (fe_0.boolean_try(n5, n4)) {
            n5 = n4;
        }
        if (fe_0.boolean_for(n5)) {
            n5 = 0;
        }
        GameCanvas.var_ew_case.cfr_renamed_0(graphics, string, n - 32 * bn_0.cfr_renamed_6, n2 + 4 * bn_0.cfr_renamed_6 - bn_0.cfr_renamed_15 / 2, 1);
        n4 = n - 27 * bn_0.cfr_renamed_6;
        k.cfr_renamed_0(n4, n2 + 4 * bn_0.cfr_renamed_6 - 1, n5, 4 * bn_0.cfr_renamed_6, 47084, graphics);
        k.cfr_renamed_0(n4, n2 + 5 * bn_0.cfr_renamed_6 - 1, n5, 1 * bn_0.cfr_renamed_6, 8575990, graphics);
        k.cfr_renamed_0(n4 + n5, n2 + 4 * bn_0.cfr_renamed_6 - 1, 1, 4 * bn_0.cfr_renamed_6, 13379, graphics);
        if (fe_0.boolean_if(string.equals("") ? 1 : 0)) {
            GameCanvas.var_ew_case.cfr_renamed_0(graphics, String.valueOf(n3), n + 29 * bn_0.cfr_renamed_6 + GameCanvas.var_ew_case.cfr_renamed_0("100"), n2 + 4 * bn_0.cfr_renamed_6 - bn_0.cfr_renamed_15 / 2, 1);
        }
    }

    protected static void cfr_renamed_26() {
        gx[] gxArray = new gx[3];
        int n = 0;
        while (fe_0.boolean_if(n, 3)) {
            gxArray[n] = new gx();
            gxArray[n].void_do(2);
            ++n;
            if ("  ".length() == "  ".length()) continue;
            return;
        }
        gxArray[0].cfr_renamed_0(1);
        ei ei2 = new ei(MenuChinhAvatar.ck, new ch_0(gxArray));
        dj_0.cfr_renamed_0().cfr_renamed_0(gxArray, MenuChinhAvatar.ca, MenuChinhAvatar.var_java_lang_String_arr_arr_do, ei2);
        GameCanvas.var_dX_do = dj_0.cfr_renamed_0();
    }

    public static void (byte by2, int n, String vectorArray, short[] objectArray, int n2, String[] stringArray == null) {
        if ((GameCanvas.var_dL_do != em_0.em_0_do())) {
            fe_0.cfr_renamed_4(AngelChip.duLieuNguoiChoi);
            if (fe_0.boolean_do(n, 26)) {
                if (fe_0.cfr_renamed_0((Object)duLieuNguoiChoi)) {
                    return;
                }
                fe_0.cfr_renamed_4(duLieuNguoiChoi);
                } else {
                fe_0.cfr_renamed_4(AngelChip.duLieuNguoiChoi);
            }
            Vector<q_0> vector = new Vector<q_0>();
            if (fe_0.boolean_if((int)by2)) {
                block89: {
                    Object object;
                    if ((objectArray != null) && fe_0.boolean_new(objectArray.length)) {
                        by2 = (byte)0;
                        while (fe_0.boolean_if((int)by2, objectArray.length)) {
                            vector.addElement(ci_0.q_0_do(objectArray[by2]));
                            by2 = (byte)(by2 + 1);
                            if (" ".length() > 0) continue;
                            return;
                        }
                    } else {
                        by2 = (byte)0;
                        while (fe_0.boolean_if((int)by2, ci_0.var_q_0_arr_do.length)) {
                            object = ci_0.var_q_0_arr_do[by2];
                            if ((object != null) && (!fe_0.boolean_int(((q_0)object).mangSoNguyen[0]) || fe_0.boolean_do(((q_0)object).mangSoNguyen[1])) && fe_0.boolean_do(n, (int)((q_0)object).var_byte_do)) {
                                vector.addElement((q_0)object);
                            }
                            by2 = (byte)(by2 + 1);
                            if ("  ".length() >= 0) continue;
                            return;
                        }
                    }
                    if (fe_0.boolean_do(n, 26)) {
                        Vector[] vectorArray2 = new Vector[6];
                        by2 = (byte)0;
                        while (fe_0.boolean_if((int)by2, 6)) {
                            vectorArray2[by2] = new Vector();
                            by2 = (byte)(by2 + 1);
                            return;
                        }
                        Object object2 = new int[6];
                        int n3 = 0;
                        while (fe_0.boolean_if(n3, vector.size())) {
                            q_0 q_02 = (q_0)vector.elementAt(n3);
                            object = "";
                            if ((stringArray != null) && fe_0.boolean_do(stringArray.length)) {
                                object = stringArray[n3];
                            }
                            vectorArray = "Tặng";
                            if (fe_0.boolean_do((int)q_02.var_byte_if, 20)) {
                                short s2;
                                short s3;
                                Vector vector2 = vectorArray2[0];
                                if ((objectArray != null)) {
                                    s3 = objectArray[n3];
                                    if ((0x3C ^ 0x77 ^ (0x19 ^ 0x56)) < "   ".length()) {
                                        return;
                                    }
                                } else {
                                    s3 = -1;
                                }
                                bw_0 bw_02 = new bw_0(q_02, s3, n, (String)object, n2, object2[0]);
                                if ((objectArray != null)) {
                                    s2 = objectArray[n3];
                                    if ((0xC4 ^ 0xC0) != (0x9E ^ 0x9A)) {
                                        return;
                                    }
                                } else {
                                    s2 = -1;
                                }
                                vector2.addElement(new z_0((String)vectorArray, bw_02, q_02, s2, object2[0], n2));
                                int n4 = 0;
                                object2[n4] = object2[n4] + 1;
                                if (-" ".length() != -" ".length()) {
                                    return;
                                }
                            } else if (fe_0.boolean_do((int)q_02.var_byte_if, 10)) {
                                short s4;
                                short s5;
                                Vector vector3 = vectorArray2[1];
                                if ((objectArray != null)) {
                                    s5 = objectArray[n3];
                                    } else {
                                    s5 = -1;
                                }
                                bw_0 bw_03 = new bw_0(q_02, s5, n, (String)object, n2, object2[1]);
                                if ((objectArray != null)) {
                                    s4 = objectArray[n3];
                                    if (" ".length() == 0) {
                                        return;
                                    }
                                } else {
                                    s4 = -1;
                                }
                                vector3.addElement(new z_0((String)vectorArray, bw_03, q_02, s4, object2[1], n2));
                                int n5 = 1;
                                object2[n5] = object2[n5] + 1;
                                if ((0xAD ^ 0xA8) <= 0) {
                                    return;
                                }
                            } else if (fe_0.boolean_for(q_02.var_byte_if, 52) && fe_0.boolean_for(q_02.var_byte_if, 53) && fe_0.boolean_for(q_02.var_byte_if, 5)) {
                                if (fe_0.boolean_do((int)q_02.var_byte_if, 60)) {
                                    short s6;
                                    short s7;
                                    Vector vector4 = vectorArray2[3];
                                    if ((objectArray != null)) {
                                        s7 = objectArray[n3];
                                        if ("   ".length() < ((0x83 ^ 0xA2 ^ (0x1C ^ 0xD)) & (0x42 ^ 0x5A ^ (0xA2 ^ 0x8A) ^ -" ".length()))) {
                                            return;
                                        }
                                    } else {
                                        s7 = -1;
                                    }
                                    bw_0 bw_04 = new bw_0(q_02, s7, n, (String)object, n2, object2[3]);
                                    if ((objectArray != null)) {
                                        s6 = objectArray[n3];
                                        } else {
                                        s6 = -1;
                                    }
                                    vector4.addElement(new z_0((String)vectorArray, bw_04, q_02, s6, object2[3], n2));
                                    int n6 = 3;
                                    object2[n6] = object2[n6] + 1;
                                    if ("  ".length() == 0) {
                                        return;
                                    }
                                } else if (fe_0.boolean_do((int)q_02.var_byte_if, 70)) {
                                    short s8;
                                    short s9;
                                    Vector vector5 = vectorArray2[4];
                                    if ((objectArray != null)) {
                                        s9 = objectArray[n3];
                                        if (-(0x4F ^ 0x4A) >= 0) {
                                            return;
                                        }
                                    } else {
                                        s9 = -1;
                                    }
                                    bw_0 bw_05 = new bw_0(q_02, s9, n, (String)object, n2, object2[4]);
                                    if ((objectArray != null)) {
                                        s8 = objectArray[n3];
                                        if ((0x9B ^ 0xA7 ^ (0x1A ^ 0x23)) == 0) {
                                            return;
                                        }
                                    } else {
                                        s8 = -1;
                                    }
                                    vector5.addElement(new z_0((String)vectorArray, bw_05, q_02, s8, object2[4], n2));
                                    int n7 = 4;
                                    object2[n7] = object2[n7] + 1;
                                    if (-" ".length() == "   ".length()) {
                                        return;
                                    }
                                } else {
                                    short s10;
                                    short s11;
                                    Vector vector6 = vectorArray2[5];
                                    if ((objectArray != null)) {
                                        s11 = objectArray[n3];
                                        if (" ".length() < -" ".length()) {
                                            return;
                                        }
                                    } else {
                                        s11 = -1;
                                    }
                                    bw_0 bw_06 = new bw_0(q_02, s11, n, (String)object, n2, object2[5]);
                                    if ((objectArray != null)) {
                                        s10 = objectArray[n3];
                                        if ("   ".length() == " ".length()) {
                                            return;
                                        }
                                    } else {
                                        s10 = -1;
                                    }
                                    vector6.addElement(new z_0((String)vectorArray, bw_06, q_02, s10, object2[5], n2));
                                    int n8 = 5;
                                    object2[n8] = object2[n8] + 1;
                                    }
                            } else {
                                short s12;
                                short s13;
                                Vector vector7 = vectorArray2[2];
                                if ((objectArray != null)) {
                                    s13 = objectArray[n3];
                                    if (-"  ".length() > 0) {
                                        return;
                                    }
                                } else {
                                    s13 = -1;
                                }
                                bw_0 bw_07 = new bw_0(q_02, s13, n, (String)object, n2, object2[2]);
                                if ((objectArray != null)) {
                                    s12 = objectArray[n3];
                                    if ((0x85 ^ 0x81) < -" ".length()) {
                                        return;
                                    }
                                } else {
                                    s12 = -1;
                                }
                                vector7.addElement(new z_0((String)vectorArray, bw_07, q_02, s12, object2[2], n2));
                                int n9 = 2;
                                object2[n9] = object2[n9] + 1;
                            }
                            ++n3;
                            return;
                        }
                        n3 = 0;
                        int n10 = 0;
                        while (fe_0.boolean_if(n10, vectorArray2.length)) {
                            if (fe_0.boolean_do(vectorArray2[n10].size())) {
                                ++n3;
                            }
                            ++n10;
                            if (-(0x93 ^ 0x97) <= 0) continue;
                            return;
                        }
                        String[] stringArray2 = new String[6];
                        stringArray2[0] = "Áo";
                        stringArray2[1] = "Quần";
                        stringArray2[2] = "Trang sức";
                        stringArray2[3] = "Nón";
                        stringArray2[4] = "Cầm tay";
                        stringArray2[5] = "Khác";
                        String[] stringArray3 = stringArray2;
                        byte[] byArray = new byte[6];
                        byArray[0] = 0;
                        byArray[1] = 1;
                        byArray[2] = 2;
                        byArray[3] = 3;
                        byArray[4] = 4;
                        byArray[5] = 5;
                        byte[] byArray2 = byArray;
                        vectorArray = new Vector[n3];
                        objectArray = new byte[n3];
                        stringArray = new String[n3];
                        n2 = 0;
                        int n11 = 0;
                        do {
                            if (fe_0.boolean_int(n11, vectorArray2.length)) {
                                em_0.em_0_do().cfr_renamed_8();
                                em_0.coKichHoat = 1;
                                em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, null);
                                if ("   ".length() > "   ".length()) {
                                    return;
                                }
                                break block89;
                            }
                            if (!fe_0.boolean_int(vectorArray2[n11].size()) || fe_0.boolean_do(n11, 5)) {
                                if (fe_0.boolean_do(n11, 5)) {
                                    int n12 = vectorArray2[5].size();
                                    by2 = (byte)0;
                                    while (fe_0.boolean_if((int)by2, var_java_util_Vector_int.size())) {
                                        object2 = (bg)var_java_util_Vector_int.elementAt(by2);
                                        vectorArray2[5].addElement(new gd_0(MenuChinhAvatar.bk, new k_0(by2, object2.var_short_do), by2, (bg)object2, n12));
                                        by2 = (byte)(by2 + 1);
                                        if ("  ".length() >= 0) continue;
                                        return;
                                    }
                                }
                                vectorArray[n2] = vectorArray2[n11];
                                objectArray[n2] = byArray2[n11];
                                stringArray[n2] = stringArray3[n11];
                                ++n2;
                            }
                            ++n11;
                            } while (-" ".length() != ((51 + 104 - 96 + 91 ^ 168 + 73 - 193 + 137) & (0xA4 ^ 0xAC ^ (0x59 ^ 0x7E) ^ -" ".length())));
                        return;
                    }
                    Vector<z_0> vector8 = new Vector<z_0>();
                    by2 = (byte)0;
                    while (fe_0.boolean_if((int)by2, vector.size())) {
                        short s14;
                        short s15;
                        q_0 q_03 = (q_0)vector.elementAt(by2);
                        String string = "";
                        if ((stringArray != null) && fe_0.boolean_do(stringArray.length)) {
                            string = stringArray[by2];
                        }
                        if (fe_0.boolean_do(n, 100)) {
                            object = MenuChinhAvatar.AutoBanDa;
                            if (((0xD ^ 0x1E) & ~(0x3A ^ 0x29)) > 0) {
                                return;
                            }
                        } else if (fe_0.boolean_do(n, 26)) {
                            object = "Tặng";
                            if ((0x81 ^ 0x85) <= 0) {
                                return;
                            }
                        } else {
                            object = MenuChinhAvatar.y;
                        }
                        if ((objectArray != null)) {
                            s15 = objectArray[by2];
                            if ("   ".length() == 0) {
                                return;
                            }
                        } else {
                            s15 = -1;
                        }
                        bw_0 bw_08 = new bw_0(q_03, s15, n, string, n2, by2);
                        if ((objectArray != null)) {
                            s14 = objectArray[by2];
                            if (((0x80 ^ 0xB4) & ~(0x7C ^ 0x48)) == (0xA3 ^ 0xA7)) {
                                return;
                            }
                        } else {
                            s14 = -1;
                        }
                        vector8.addElement(new z_0((String)object, bw_08, q_03, s14, by2, n2));
                        by2 = (byte)(by2 + 1);
                        if ("  ".length() != -" ".length()) continue;
                        return;
                    }
                    if (fe_0.boolean_do(vector8.size())) {
                        em_0.em_0_do().cfr_renamed_8();
                        em_0.coKichHoat = 1;
                        String[] stringArray4 = new String[1];
                        stringArray4[0] = vectorArray;
                        Vector[] vectorArray3 = new Vector[1];
                        vectorArray3[0] = vector8;
                        em_0.em_0_do().cfr_renamed_0(stringArray4, vectorArray3, null);
                    }
                }
                GameCanvas.cfr_renamed_8();
            }
        }
    }

    public static void cfr_renamed_8(int n) {
        var_int_if = n;
        var_int_try = ef_0.soLuong;
        fe_0.fe_0_do();
        fe_0.cfr_renamed_10();
        eq.eq_do().cfr_renamed_17(8);
        GameCanvas.cfr_renamed_5();
    }

    private static boolean boolean_try(int n, int n2) {
        return n > n2;
    }

    public static void (q_0 q_02 == null) {
        var_dd_0_if = new DuLieuNguoiChoi();
        new DuLieuNguoiChoi().coKichHoat = 0;
        fe_0.var_dd_0_if.var_java_util_Vector_if = new Vector();
        int n = 0;
        int n2 = 0;
        while (fe_0.boolean_if(n2, AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.size())) {
            ef ef2 = new ef();
            new ef().var_short_do = ((ef)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.elementAt((int)n2)).var_short_do;
            if (fe_0.boolean_do((int)ci_0.q_0_do((short)ef2.var_short_do).var_byte_if, (int)q_02.var_byte_if)) {
                ef2.var_short_do = q_02.var_short_do;
                n = 1;
            }
            var_dd_0_if.cfr_renamed_1(ef2);
            ++n2;
            if (-"  ".length() < 0) continue;
            return;
        }
        if (fe_0.boolean_if(n)) {
            ef ef3 = new ef();
            new ef().var_short_do = q_02.var_short_do;
            var_dd_0_if.cfr_renamed_1(ef3);
            var_dd_0_if.void_if();
        }
    }

    public final void cfr_renamed_21() {
        var_byte_do = (byte)-1;
        var_byte_if = (byte)-1;
        if (fe_0.boolean_do(AngelChip.var_int_if, 8)) {
            this.cfr_renamed_11();
            return;
        }
        eq.eq_do().cfr_renamed_17(8);
        if (fe_0.boolean_if(TienIchGame.cfr_renamed_2(15000L) ? 1 : 0)) {
            this.cfr_renamed_11();
        }
    }

    public final void cfr_renamed_29() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei("Lựa chọn", 118, this));
        vector.addElement(new ei("Xem trước", 119, this));
        vector.addElement(new ei("Quãng nghỉ: " + Z.soXu, 120, this));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    private static boolean boolean_new(int n) {
        return n != 0;
    }

        private static void cfr_renamed_38() {
        Vector<ei> vector = new Vector<ei>();
        if (fe_0.boolean_if(gU.dangChayAuto ? 1 : 0)) {
            vector.addElement(new ei("Bật auto", gU.gU_do()));
            if ((0x6F ^ 0x21 ^ (0x26 ^ 0x6D)) == 0) {
                return;
            }
        } else {
            vector.addElement(new ei("Tắt auto", gU.gU_do()));
        }
        vector.addElement(new ei("Cài đặt", H.H_do()));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    public static void (int n, ar_0 ar_02, DuLieuNguoiChoi dd_02, String string, short s2, byte by2, byte by3, String string2, short s3, String string3 == null) {
        if (fe_0.boolean_do(n, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
            AutoController.controllerInstance.chuoiGiaTri = AngelChip.fontRenderer.var_short_do + " + " + AngelChip.fontRenderer.cfr_renamed_1 + "%";
            fe_0.void_try(AngelChip.fontRenderer.var_short_do, ar_02.var_short_do);
            fe_0.void_try(AngelChip.fontRenderer.var_byte_do, ar_02.var_byte_do);
            fe_0.void_try(AngelChip.fontRenderer.cfr_renamed_3, ar_02.cfr_renamed_3);
            fe_0.void_try(AngelChip.fontRenderer.cfr_renamed_4, ar_02.cfr_renamed_4);
            fe_0.void_try(AngelChip.fontRenderer.cfr_renamed_2, ar_02.cfr_renamed_2);
            fe_0.void_try(AngelChip.fontRenderer.cfr_renamed_5, ar_02.cfr_renamed_5);
            AngelChip.fontRenderer = ar_02;
        }
        GameCanvas.cfr_renamed_8();
        DuLieuNguoiChoi dd_03 = ef_0.dd_0_do(n);
        if (fe_0.cfr_renamed_1((Object)dd_03) && fe_0.boolean_new(var_boolean_int ? 1 : 0)) {
            var_boolean_int = 0;
            Vector vector = new Vector();
            if (fe_0.boolean_for(dd_03.var_short_char, AngelChip.duLieuNguoiChoi.var_short_char)) {
                vector = fe_0.java_util_Vector_do(dd_03);
            }
            Vector<Object> vector2 = new Vector<Object>();
            Object object = MenuChinhAvatar.cfr_renamed_31 + ": " + GameCanvas.hienThongBaoPopup(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], AngelChip.duLieuNguoiChoi.mangSoNguyen[2], AngelChip.duLieuNguoiChoi.soLuong);
            object = new ev_0((String)object, GameCanvas.var_ew_case.cfr_renamed_0((String)object));
            bq_0 bq_02 = ef_0.bq_0_do(dd_03.var_short_char);
            object = new aq(dd_03, bq_02, (ev_0)object);
            dd_03.coKichHoat = 0;
            vector2.addElement(object);
            if (fe_0.cfr_renamed_1((Object)dd_02)) {
                dd_02.var_short_byte = dd_03.var_short_byte;
                vector2.addElement(new cX("", string, dd_03, dd_02, s2, by2, by3, string2));
            }
            if (fe_0.boolean_for(AngelChip.duLieuNguoiChoi.var_short_char, ((bk_0)dd_03).cfr_renamed_12)) {
                vector2.addElement(fe_0.ei_do(ar_02));
            }
            if ((GameCanvas.var_dL_do != ec.var_ec_do)) {
                em_0.em_0_do().coTrangThai = 1;
                if (fe_0.boolean_do((int)AngelChip.duLieuNguoiChoi.var_short_char, ((bk_0)dd_03).cfr_renamed_12)) {
                    if (fe_0.cfr_renamed_1((Object)dd_02)) {
                        String[] stringArray = new String[2];
                        stringArray[0] = MenuChinhAvatar.cY;
                        stringArray[1] = MenuChinhAvatar.bI;
                        em_0.em_0_do().cfr_renamed_0(stringArray, new Vector[2], vector2);
                        if (fe_0.boolean_for(s3, -1)) {
                            em_0.em_0_do().cfr_renamed_0(new ei(string3, new cC(s3)), 1);
                            if ("  ".length() < 0) {
                                return;
                            }
                        }
                    } else {
                        String[] stringArray = new String[1];
                        stringArray[0] = MenuChinhAvatar.cY;
                        em_0.em_0_do().cfr_renamed_0(stringArray, new Vector[1], vector2);
                        if ((" ".length() & (" ".length() ^ -" ".length())) < ((130 + 37 - -65 + 2 ^ 153 + 171 - 306 + 168) & (0xA6 ^ 0x92 ^ (0x77 ^ 0x13) ^ -" ".length()))) {
                            return;
                        }
                    }
                } else if (fe_0.cfr_renamed_1((Object)dd_02)) {
                    String[] stringArray = new String[4];
                    stringArray[0] = MenuChinhAvatar.cY;
                    stringArray[1] = MenuChinhAvatar.bI;
                    stringArray[2] = MenuChinhAvatar.ac;
                    stringArray[3] = MenuChinhAvatar.cY;
                    Vector[] vectorArray = new Vector[4];
                    vectorArray[0] = null;
                    vectorArray[1] = null;
                    vectorArray[2] = null;
                    vectorArray[3] = vector;
                    em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, vector2);
                    if (fe_0.boolean_for(s3, -1)) {
                        em_0.em_0_do().cfr_renamed_0(new ei(string3, new dd(s3)), 1);
                        }
                } else {
                    String[] stringArray = new String[3];
                    stringArray[0] = MenuChinhAvatar.cY;
                    stringArray[1] = MenuChinhAvatar.ac;
                    stringArray[2] = MenuChinhAvatar.cY;
                    Vector[] vectorArray = new Vector[3];
                    vectorArray[0] = null;
                    vectorArray[1] = null;
                    vectorArray[2] = vector;
                    em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, vector2);
                }
                if ((GameCanvas.var_dL_do != em_0.em_0_do())) {
                    em_0.em_0_do().cfr_renamed_8();
                }
            }
        }
    }

    public final void void_if(int n) {
        if (fe_0.boolean_int(n, 16) && fe_0.boolean_new(n, 19)) {
            new bI((byte)(n - 15)).cfr_renamed_0();
            return;
        }
        if (fe_0.boolean_int(n, 44) && fe_0.boolean_new(n, 46)) {
            P.void_do(n - 44);
            return;
        }
        switch (n) {
            case 0: {
                this.cfr_renamed_31();
                return;
            }
            case 1: {
                if (!fe_0.boolean_if(var_boolean_try ? 1 : 0)) break;
                ec.cfr_renamed_0();
                ec.cfr_renamed_5();
                return;
            }
            case 2: {
                this.cfr_renamed_12();
                return;
            }
            case 3: {
                fe_0.cfr_renamed_28();
                return;
            }
            case 4: {
                AutoController.tatAuto();
                TienIchGame.hienThongBao("Tắt auto");
                return;
            }
            case 5: {
                this.cfr_renamed_30();
                return;
            }
            case 6: {
                eq.eq_do().cfr_renamed_0(9, 0, 1);
                return;
            }
            case 7: {
                fe_0 fe_02 = this;
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei("Bỏ hết mồi câu", 16, fe_02));
                vector.addElement(new ei("Bỏ hết KCX", 18, fe_02));
                vector.addElement(new ei("Bỏ hết NHB", 19, fe_02));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 13: {
                AutoController.batAuto(new AutoTaiXiu());
                TienIchGame.hienThongBao("Bật auto tài xỉu");
                return;
            }
            case 15: {
                fi fi2 = new fi();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)fi2);
                return;
            }
            case 24: {
                fe_0.cfr_renamed_4();
                return;
            }
            case 26: {
                this.this();
                return;
            }
            case 28: {
                FormCaiDatFarm cn2 = new FormCaiDatFarm();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)cn2);
                return;
            }
            case 29: {
                fe_0 fe_03 = this;
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei("Bật Auto", 38, fe_03));
                vector.addElement(new ei("Cài đặt", 40, fe_03));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 30: {
                GameCanvas.var_dZ_do.cfr_renamed_0("Cài số xu cần up cho id (" + (String)AngelChip.duLieuNguoiChoi.var_short_do + "):", new cV(1), 1);
                if (!fe_0.boolean_do(TienIchGame.soLuongKhoa)) break;
                GameCanvas.var_dZ_do.cfr_renamed_0(String.valueOf(TienIchGame.soLuongKhoa));
                return;
            }
            case 31: {
                GameCanvas.var_dZ_do.cfr_renamed_0("Cài số ngày cần up cho id (" + (String)AngelChip.duLieuNguoiChoi.var_short_do + "):", new cV(2), 1);
                if (!fe_0.boolean_do((TienIchGame.soXu != 0L))) break;
                GameCanvas.var_dZ_do.cfr_renamed_0(String.valueOf(TienIchGame.soXu));
                return;
            }
            case 32: {
                GameCanvas.hienThongBaoPopup("Bạn có chắc muốn reset cài đặt cho id (" + (String)AngelChip.duLieuNguoiChoi.var_short_do + ") không?", new ei("OK", 33, this), new ei("Không", -1));
                return;
            }
            case 33: {
                QuanLyRMS.cfr_renamed_4();
                QuanLyRMS.cfr_renamed_3();
                TienIchGame.aq_0_do().cfr_renamed_18();
                return;
            }
            case 34: {
                this.cfr_renamed_20();
                return;
            }
            case 35: {
                int n2;
                if (fe_0.boolean_if(TienIchGame.dangChayAuto ? 1 : 0)) {
                    n2 = 1;
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                } else {
                    n2 = 0;
                }
                TienIchGame.dangChayAuto = n2;
                return;
            }
            case 36: {
                if (fe_0.boolean_if((int)AutoFarm.var_byte_if)) {
                    AutoController.batAuto(new AutoLaiBuon());
                    return;
                }
                AutoController.batAuto(new AutoFarm());
                return;
            }
            case 38: {
                AutoController.batAuto(new AutoBanDa());
                return;
            }
            case 40: {
                aa aa2 = new aa();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)aa2);
                return;
            }
            case 41: {
                TienIchGame.dangXuatTaiKhoan();
                return;
            }
            case 42: {
                gz_0.cfr_renamed_5();
                return;
            }
            case 43: {
                GameCanvas.cfr_renamed_5();
                cd.soXu = 0L;
                cd.chuoiGiaTri = bl_0.java_lang_String_do(0);
                new cd(20L, 1).cfr_renamed_4();
                return;
            }
            case 47: {
                String string;
                String string2;
                String string3;
                fe_0 fe_04 = this;
                Vector<ei> vector = new Vector<ei>();
                StringBuffer stringBuffer = new StringBuffer().append("Telex");
                if (fe_0.boolean_do(P.soLuong, 1)) {
                    string3 = " (ON)";
                    if ((0x28 ^ 0x2D) == 0) {
                        return;
                    }
                } else {
                    string3 = "";
                }
                vector.addElement(new ei(stringBuffer.append(string3).toString(), 45, fe_04));
                StringBuffer stringBuffer2 = new StringBuffer().append("VNI");
                if (fe_0.boolean_do(P.soLuong, 2)) {
                    string2 = " (ON)";
                    if ("   ".length() <= ((72 + 215 - 259 + 226 ^ 17 + 102 - -14 + 33) & (0xC6 ^ 0xC1 ^ (0xD8 ^ 0x87) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    string2 = "";
                }
                vector.addElement(new ei(stringBuffer2.append(string2).toString(), 46, fe_04));
                StringBuffer stringBuffer3 = new StringBuffer().append("Mặc định");
                if (fe_0.boolean_do(P.soLuong, 1)) {
                    string = " (ON)";
                    if ((0x3D ^ 0x39) < 0) {
                        return;
                    }
                } else {
                    string = "";
                }
                vector.addElement(new ei(stringBuffer3.append(string).toString(), 44, fe_04));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 2);
                return;
            }
            case 50: {
                fe_0 fe_05 = this;
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei("Tiếng Anh", 51, fe_05));
                vector.addElement(new ei("Tiếng Việt", 52, fe_05));
                vector.addElement(new ei("Reset dữ liệu", 53, fe_05));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 51: {
                AutoController.batAuto(new T(0));
                return;
            }
            case 52: {
                AutoController.batAuto(new T(1));
                return;
            }
            case 53: {
                if (fe_0.boolean_if(T.var_java_util_Vector_if.isEmpty() ? 1 : 0)) {
                    T.var_java_util_Vector_if.removeAllElements();
                }
                if (fe_0.boolean_if(T.var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
                    T.var_java_util_Vector_do.removeAllElements();
                }
                if (fe_0.boolean_if(T.var_java_util_Hashtable_do.isEmpty() ? 1 : 0)) {
                    T.var_java_util_Hashtable_do.clear();
                }
                GameCanvas.hienThongBaoPopup("Đã reset dữ liệu!");
                return;
            }
            case 57: {
                fe_0 fe_06 = this;
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei("Bật auto", 58, fe_06));
                vector.addElement(new ei("D.s tự dùng", 59, fe_06));
                vector.addElement(new ei("D.s tự bỏ", 60, fe_06));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 58: {
                AutoController.batAuto(new dy_0());
                return;
            }
            case 59: {
                new aI().cfr_renamed_0();
                return;
            }
            case 60: {
                new fu_0().cfr_renamed_0();
                return;
            }
            case 61: {
                fe_0 fe_07 = this;
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei("Bật Auto", 62, fe_07));
                vector.addElement(new ei("Cài đặt", 63, fe_07));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 62: {
                AutoKimCuong.X_do().void_do();
                AutoController.cfr_renamed_0(AutoKimCuong.X_do());
                return;
            }
            case 63: {
                FormCaiDatKimCuong gl_02 = new FormCaiDatKimCuong();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)gl_02);
                return;
            }
            case 64: {
                fe_0 fe_08 = this;
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei("Bật Auto", 65, fe_08));
                vector.addElement(new ei("Cài đặt", 66, fe_08));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 65: {
                dn_0.dn_0_do().void_do();
                return;
            }
            case 66: {
                ab ab2 = new ab();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)ab2);
                return;
            }
            case 67: {
                Vector<ei> vector = new Vector<ei>();
                if (fe_0.cfr_renamed_1((Object)duLieuNguoiChoi) && fe_0.boolean_if(fe_0.duLieuNguoiChoi.var_int_break) && fe_0.boolean_if((int)fe_0.duLieuNguoiChoi.var_short_char, 2000000000)) {
                    vector.addElement(new ei("Hôn " + (String)fe_0.duLieuNguoiChoi.var_short_do, new aF(fe_0.duLieuNguoiChoi.var_short_char)));
                }
                vector.addElement(new ei("Hôn tất cả", new aF(-1)));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 2);
                return;
            }
            case 68: {
                Vector<ei> vector = new Vector<ei>();
                if (fe_0.cfr_renamed_1((Object)duLieuNguoiChoi) && fe_0.boolean_if((int)fe_0.duLieuNguoiChoi.var_short_char, 2000000000)) {
                    vector.addElement(new ei("Đánh " + (String)fe_0.duLieuNguoiChoi.var_short_do, new B(fe_0.duLieuNguoiChoi.var_short_char)));
                }
                vector.addElement(new ei("Đánh tất cả", new B(-1)));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 2);
                return;
            }
            case 69: {
                GameCanvas.var_dZ_do.cfr_renamed_0("Nhập số lần (để trống: KGH)", new J(), 1);
                return;
            }
            case 99: {
                this.cfr_renamed_1();
                return;
            }
            case 107: {
                fe_0.cfr_renamed_38();
                return;
            }
            case 116: {
                int n3;
                if (fe_0.boolean_if(this.var_boolean_case ? 1 : 0)) {
                    n3 = 1;
                    if ("   ".length() == 0) {
                        return;
                    }
                } else {
                    n3 = 0;
                }
                this.var_boolean_case = n3;
                return;
            }
            case 117: {
                this.cfr_renamed_29();
                return;
            }
            case 118: {
                eb eb2 = new eb();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)eb2.var_javax_microedition_lcdui_List_do);
                return;
            }
            case 119: {
                fe_0.cfr_renamed_33();
                return;
            }
            case 120: {
                GameCanvas.var_dZ_do.cfr_renamed_0("Quãng nghỉ (ms):", new bu_0(), 1);
                GameCanvas.var_dZ_do.cfr_renamed_0(String.valueOf(Z.soXu));
            }
        }
    }

    public static void (q_0 q_02 != null) {
        GameCanvas.hienThongBaoPopup(q_02.mangSoNguyen[0], q_02.mangSoNguyen[1], new fw_0(q_02), new gi_0(q_02), null);
    }

    private void cfr_renamed_39() {
        var_boolean_try = 0;
        this.cfr_renamed_18 = (byte)0;
        int n = 0;
        while (fe_0.boolean_if(n, ef_0.var_java_util_Vector_do.size())) {
            aG aG2 = (aG)ef_0.var_java_util_Vector_do.elementAt(n);
            if (fe_0.boolean_if((int)aG2.var_byte_if)) {
                ((DuLieuNguoiChoi)aG2).var_short_goto = (short)4;
            }
            ++n;
            if (" ".length() >= ((0x64 ^ 0x23 ^ (0x26 ^ 0x57)) & (0xA9 ^ 0x97 ^ (0x94 ^ 0x9C) ^ -" ".length()))) continue;
            return;
        }
    }

    public static void cfr_renamed_9() {
        int n = 0;
        switch (var_byte_if) {
            case 0: {
                n = 3;
                if ("   ".length() != "  ".length()) break;
                return;
            }
            case 1: {
                n = 7;
                if (" ".length() == " ".length()) break;
                return;
            }
            case 2: {
                n = 21;
                if (" ".length() != 0) break;
                return;
            }
            case 3: {
                n = 22;
                if (" ".length() != "  ".length()) break;
                return;
            }
            case 4: {
                n = 21;
                if (-" ".length() <= 0) break;
                return;
            }
            case 5: {
                n = 22;
            }
        }
        eq.eq_do().cfr_renamed_2(n);
    }

    private static Vector java_util_Vector_do(Vector vector) {
        Vector<bm_0> vector2 = new Vector<bm_0>();
        int n = 0;
        while (fe_0.boolean_if(n, vector.size())) {
            ef ef2 = (ef)vector.elementAt(n);
            vector2.addElement(new bm_0(ef2, n, "Chọn", new gm_0(ef2.var_short_do, n)));
            ++n;
            return null;
        }
        return vector2;
    }

    public static void cfr_renamed_12(int n) {
        el_0.el_0_do().void_if(fe_0.duLieuNguoiChoi.var_short_char, n);
    }

    private static boolean boolean_try(int n) {
        return n >= 0;
    }

    public static void cfr_renamed_28() {
        if (fe_0.cfr_renamed_1((Object)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if)) {
            AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.removeAllElements();
        }
        ef_0.var_int_try = -1;
        ef_0.var_ep_do = null;
        ef_0.var_int_if = 24;
        i_0.i_0_do().void_do();
        ThongTinNhanVat.cfr_renamed_0().cfr_renamed_8();
        ThongTinNhanVat.cfr_renamed_0().cfr_renamed_4();
        t_0.dangChayAuto = 0;
        t_0.soLuong = 0;
        es.var_java_util_Vector_if = null;
        ef_0.var_java_util_Vector_do.removeAllElements();
        AngelChip.duLieuNguoiChoi = new DuLieuNguoiChoi();
        AngelChip.fontRenderer = new ar_0();
        GameCanvas.var_java_util_Vector_do.removeAllElements();
        ee.ee_do().var_ba_do = null;
    }

    public static void (Vector vector != null) {
        if (fe_0.boolean_if(vector.isEmpty() ? 1 : 0)) {
            Vector<cr_0> vector2 = new Vector<cr_0>();
            int n = 0;
            while (fe_0.boolean_if(n, vector.size())) {
                ev_0 ev_02 = (ev_0)vector.elementAt(n);
                vector2.addElement(new cr_0(ev_02.cfr_renamed_1, new fk_0(ev_02), ev_02));
                ++n;
                if (((0x9D ^ 0x83) & ~(0x6B ^ 0x75)) >= 0) continue;
                return;
            }
            ec.cfr_renamed_0().cfr_renamed_0(vector2);
        }
    }

    private void (int n, int n2, int n3, int n4, int n5 == null) {
        block24: {
            DuLieuNguoiChoi dd_02;
            DuLieuNguoiChoi dd_03;
            block26: {
                block25: {
                    dd_03 = ef_0.dd_0_do(n2);
                    dd_02 = ef_0.dd_0_do(n3);
                    if (!fe_0.cfr_renamed_1((Object)dd_03) || !fe_0.cfr_renamed_1((Object)dd_02) || !fe_0.boolean_if(dd_03.var_int_break) || !fe_0.boolean_if(dd_02.var_int_break)) break block24;
                    dd_03.var_int_this = dd_02.var_short_char;
                    dd_03.var_int_long = dd_03.var_short_char;
                    dd_02.var_int_long = dd_03.var_short_char;
                    dd_02.var_int_this = dd_02.var_short_char;
                    if (fe_0.boolean_do(n2, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
                        AngelChip.duLieuNguoiChoi.cfr_renamed_5 = dd_02.var_short_if;
                        if (fe_0.boolean_if(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, dd_02.coKichHoat ? 1 : 0)) {
                            n2 = dd_02.coKichHoat - 15;
                            if ("  ".length() == (94 + 136 - 140 + 95 ^ 56 + 38 - -8 + 87)) {
                                return;
                            }
                        } else {
                            n2 = dd_02.coKichHoat + 15;
                        }
                        AngelChip.duLieuNguoiChoi.var_short_else = (short)n2;
                        (n2, (int)dd_02.var_short_if, AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.cfr_renamed_5 ? 1 : 0 == null);
                    }
                    if (fe_0.boolean_do(n3, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
                        int n6;
                        int n7 = AngelChip.duLieuNguoiChoi.coKichHoat;
                        short s2 = AngelChip.duLieuNguoiChoi.var_short_if;
                        if (fe_0.boolean_if(dd_03.coKichHoat ? 1 : 0)) {
                            n6 = bk_0.var_byte_case;
                            if ("   ".length() > (0x2F ^ 0x2B)) {
                                return;
                            }
                        } else {
                            n6 = 0;
                        }
                        (n7, (int)s2, n6, AngelChip.duLieuNguoiChoi.cfr_renamed_5 ? 1 : 0 == null);
                    }
                    if (!fe_0.boolean_do(n, 1)) break block25;
                    dd_02.var_int_catch = -1;
                    switch (n4) {
                        case 0: {
                            dd_02.var_int_break = dd_03.var_int_break = -3;
                            this.cfr_renamed_0((String)dd_03.var_short_do + " " + MenuChinhAvatar.aP + (String)dd_02.var_short_do);
                            if (("  ".length() & ("  ".length() ^ -" ".length())) != 0) {
                                return;
                            }
                            break block26;
                        }
                        case 100: {
                            if (fe_0.boolean_if(dd_02.var_int_break)) {
                                dd_03.var_int_break = -2;
                                dd_02.var_int_break = -2;
                                dd_03.var_java_util_Vector_for.removeAllElements();
                                dd_02.var_java_util_Vector_for.removeAllElements();
                                dd_03.duLieuNguoiChoi = dd_02;
                                dd_03.void_for(dd_02.coKichHoat ? 1 : 0, dd_02.var_short_if + 5);
                                if (((0x60 ^ 0x42) & ~(0x52 ^ 0x70)) != 0) {
                                    return;
                                }
                            }
                            break block26;
                        }
                        case 101: {
                            if (fe_0.boolean_if(dd_02.var_int_break)) {
                                dd_03.var_int_break = 11;
                                dd_02.var_int_break = 11;
                                dd_03.var_java_util_Vector_for.removeAllElements();
                                dd_02.var_java_util_Vector_for.removeAllElements();
                                dd_03.duLieuNguoiChoi = dd_02;
                                if (fe_0.boolean_if(dd_03.coKichHoat ? 1 : 0, dd_02.coKichHoat ? 1 : 0)) {
                                    dd_03.void_for(dd_02.coKichHoat - 20, dd_02.var_short_if + 2);
                                    if ("   ".length() < ((136 + 162 - 263 + 169 ^ 63 + 43 - 75 + 162) & (97 + 46 - 4 + 1 ^ 113 + 9 - 33 + 40 ^ -" ".length()))) {
                                        return;
                                    }
                                } else {
                                    dd_03.void_for(dd_02.coKichHoat + 20, dd_02.var_short_if + 2);
                                    if (" ".length() > "  ".length()) {
                                        return;
                                    }
                                }
                            }
                            break block26;
                        }
                        case 102: 
                        case 103: {
                            dd_02.var_int_break = dd_03.var_int_break = 12;
                            dd_02.var_short_float = dd_03.var_short_float = (short)n5;
                            this.cfr_renamed_0((String)dd_03.var_short_do + " " + MenuChinhAvatar.bk + " " + (String)dd_02.var_short_do);
                            if ("   ".length() < 0) {
                                return;
                            }
                            break block26;
                        }
                        default: {
                            this.cfr_renamed_0((String)dd_03.var_short_do + " " + "tặng quà" + " " + (String)dd_02.var_short_do);
                            if (((73 + 96 - 120 + 83 ^ 63 + 55 - -8 + 15) & (0x73 ^ 0x2D ^ (0x28 ^ 0x7F) ^ -" ".length())) != 0) {
                                return;
                            }
                            break block26;
                        }
                    }
                }
                dd_03.var_int_break = 9;
                dd_02.var_int_break = 8;
                dd_02.var_int_catch = -1;
                dd_02.var_int_const = n4;
                q_0 q_02 = ci_0.q_0_do((short)n4);
                this.cfr_renamed_0((String)dd_03.var_short_do + " " + MenuChinhAvatar.aK + " " + q_02.chuoiGiaTri + " " + MenuChinhAvatar.bg + " " + (String)dd_02.var_short_do);
            }
            dd_02.var_short_break = dd_02.var_short_final;
            dd_02.var_short_this = (short)0;
            dd_03.var_short_break = dd_03.var_short_final;
            dd_03.var_short_this = (short)0;
        }
    }

    public fe_0() {
        this.cfr_renamed_11 = (byte)-1;
        this.var_java_util_Vector_try = new Vector();
        this.var_int_byte = 60;
        this.dangChayAuto = 1;
        this.var_boolean_case = 0;
        this.var_long_if = TienIchGame.int_do(1, 45) * 1000 + 15000;
        this.a_();
    }

    public final void cfr_renamed_34() {
        this.void_if(3, -1);
    }

    public final void cfr_renamed_15() {
        if (fe_0.boolean_new(GameCanvas.coKichHoat ? 1 : 0) && fe_0.boolean_new(GameCanvas.boolean_if(0, 0, GameCanvas.var_int_byte, 0) ? 1 : 0)) {
            GameCanvas.coKichHoat = 0;
            eq.eq_do().cfr_renamed_18(AngelChip.duLieuNguoiChoi.var_short_char);
        }
        if (!(GameCanvas.var_et_0_do != null) || fe_0.boolean_if(et_0.coTrangThai ? 1 : 0)) {
            super.cfr_renamed_15();
        }
        GameCanvas.var_ef_0_do.cfr_renamed_0();
        AngelChip.duLieuNguoiChoi.cfr_renamed_8();
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void (byte by2 == int n) {
        GameCanvas.cfr_renamed_8();
        DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
        if (fe_0.cfr_renamed_1((Object)dd_02)) {
            if (fe_0.boolean_if((int)by2)) {
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.aA + (String)dd_02.var_short_do + ". " + MenuChinhAvatar.U, new cm(n));
                return;
            }
            if (fe_0.boolean_do((int)by2, 1)) {
                var_int_new = n;
                eq.eq_do().cfr_renamed_17(11);
                GameCanvas.cfr_renamed_5();
            }
        }
    }

    public static void (byte by2 != null) {
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(by2);
        db_0.db_0_do().cfr_renamed_12(by2);
    }
}

