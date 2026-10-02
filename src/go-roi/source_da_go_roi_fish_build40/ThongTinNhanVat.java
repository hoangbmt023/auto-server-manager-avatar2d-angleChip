/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from fK
 */
public final class ThongTinNhanVat
extends en {
    public static boolean dangChayAuto;
    public int soLuong;
    public ey_0 var_ey_0_do;
    public int var_int_if;
    public String chuoiGiaTri;
    private long var_long_for;
    private int cfr_renamed_14;
    public static boolean coTrangThai;
    private fl_0 var_fl_0_byte;
    public static ThongTinNhanVat instance;
    private fl_0 var_fl_0_case;
    public static int soLuongKhoa;
    private static final int[] mangSoNguyen;
    public static boolean coKichHoat;
    public int var_int_int;
    private String chuoiPhu;
    private String var_java_lang_String_int;
    private String var_java_lang_String_new;
    public int var_int_new;
    public fl_0 var_fl_0_do;
    private byte var_byte_if;
    private fl_0 var_fl_0_char;
    public int var_int_try;
    public ey_0 var_ey_0_if;
    public int var_int_byte;
    private boolean var_boolean_try;
    public int var_int_case;
    public int var_int_char;
    public ey_0 var_ey_0_for = new ey_0();
    public int var_int_else;
    private long var_long_int;
    public fl_0 var_fl_0_if;
    public static String tenNhanVat;
    public long soXu;
    public int cfr_renamed_9;
    private String[] var_java_lang_String_arr_do;
    public fl_0 var_fl_0_for;
    public boolean var_boolean_int;
    private boolean var_boolean_byte;
    public static byte var_byte_do;
    private String var_java_lang_String_try = "19006610";
    public ey_0 var_ey_0_int = new ey_0();
    private boolean var_boolean_case;
    private fl_0 var_fl_0_else;
    private int cfr_renamed_23;
    private int cfr_renamed_24;
    public long var_long_if;

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    public final void cfr_renamed_2() {
        System.currentTimeMillis();
        e.void_do(MenuChinhAvatar.bo);
        e.cfr_renamed_1();
        this.cfr_renamed_14 = -50;
        try {
            GameCanvas.var_fh_do.void_do(26);
            }
        catch (Exception exception) {
            }
        if ("  ".length() == 0) {
            return;
        }
        int n = fh.var_short_if * 24 / 2 + 30;
        AngelChip.duLieuNguoiChoi.var_short_char = (short)n;
        AngelChip.duLieuNguoiChoi.var_short_for = (short)n;
        fm.fm_do().cfr_renamed_3 = fm.fm_do().var_int_if = 200;
        this.var_ey_0_for.cfr_renamed_0(1);
        this.var_ey_0_int.cfr_renamed_0(0);
        this.cfr_renamed_24 = 0;
        this.var_ey_0_for.cfr_renamed_0(1);
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

                private static boolean boolean_for(int n) {
        return n >= 0;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                Vector<fl_0> vector = new Vector<fl_0>();
                fl_0 fl_02 = new fl_0(MenuChinhAvatar.cfr_renamed_34, 2);
                if (!(ga_0.cfr_renamed_2 ? 1 : 0 == null) || ThongTinNhanVat.boolean_int(ga_0.dangChayAuto ? 1 : 0)) {
                    vector.addElement(new fl_0("Tắt Auto", 47));
                    if ("   ".length() == ((0xEC ^ 0xA2 ^ (0xCC ^ 0xC3)) & (0x1E ^ 0x18 ^ (0xCE ^ 0x89) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    if (ThongTinNhanVat.cfr_renamed_0(this.var_ey_0_for.java_lang_String_do().equals("") ? 1 : 0) && ThongTinNhanVat.cfr_renamed_0(this.var_ey_0_int.java_lang_String_do().equals("") ? 1 : 0)) {
                        vector.addElement(new fl_0("Lưu TK hiện tại", 45));
                    }
                    vector.addElement(new fl_0("Chuyển TK", new cy_0()));
                    vector.addElement(new fl_0("Quản lý TK", 46));
                }
                vector.addElement(new fl_0("Kiểu gõ TV", 47, go_0.go_0_do()));
                vector.addElement(new fl_0(MenuChinhAvatar.cG, 4));
                vector.addElement(new fl_0(MenuChinhAvatar.bu, 5));
                vector.addElement(new fl_0(MenuChinhAvatar.cfr_renamed_33, 9));
                vector.addElement(fl_02);
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 1: {
                String string;
                coTrangThai = 1;
                ((en)this).cfr_renamed_5 = this.var_fl_0_for;
                ((en)this).cfr_renamed_3 = this.var_fl_0_do;
                this.var_byte_if = (byte)0;
                String[] stringArray = new String[3];
                int n3 = 0;
                StringBuffer stringBuffer = new StringBuffer().append("Chơi tiếp");
                if (ThongTinNhanVat.cfr_renamed_0(this.var_ey_0_for.java_lang_String_do().equals("") ? 1 : 0)) {
                    string = ", " + this.var_ey_0_for.java_lang_String_do();
                    if (" ".length() >= "  ".length()) {
                        return;
                    }
                } else {
                    string = "";
                }
                stringArray[n3] = stringBuffer.append(string).toString();
                stringArray[1] = "Chơi mới";
                stringArray[2] = "Đổi tài khoản";
                this.var_java_lang_String_arr_do = stringArray;
                return;
            }
            case 2: {
                this.cfr_renamed_14();
                return;
            }
            case 3: {
                if (ThongTinNhanVat.boolean_int(this.var_ey_0_for.java_lang_String_do().equals("") ? 1 : 0)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_class[0]);
                    return;
                }
                if (ThongTinNhanVat.boolean_int(this.var_ey_0_int.java_lang_String_do().equals("") ? 1 : 0)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_class[1]);
                    return;
                }
                if (ThongTinNhanVat.boolean_int(this.var_ey_0_do.java_lang_String_do().equals("") ? 1 : 0)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_class[2]);
                    return;
                }
                if (ThongTinNhanVat.cfr_renamed_0(this.var_ey_0_int.java_lang_String_do().equals(this.var_ey_0_do.java_lang_String_do()) ? 1 : 0)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_class[3]);
                    return;
                }
                GameCanvas.cfr_renamed_7();
                System.currentTimeMillis();
                if (ThongTinNhanVat.boolean_int(this.var_ey_0_if.java_lang_String_do().equals("") ? 1 : 0)) {
                    ThongTinNhanVat.cfr_renamed_21();
                    return;
                }
                GameCanvas.void_do("Bạn nên điền chính xác số di động hoặc email. Khi quên mật khẩu, bạn sẽ dùng nó để lấy lại. Bạn có chắc chắn đã điền số di động / email đúng chưa?", 102);
                return;
            }
            case 50: {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.bF);
                return;
            }
            case 51: {
                this.this();
                return;
            }
            case 52: {
                return;
            }
            case 53: {
                AngelChip.cfr_renamed_1("http://teamobi.com/dieukhoan.htm");
                return;
            }
            case 54: {
                AngelChip.cfr_renamed_1();
                return;
            }
            case 55: {
                dangChayAuto = 0;
                this.cfr_renamed_13();
                aa_0.void_do("avatarSV");
                AngelChip.cfr_renamed_1();
                return;
            }
            case 100: {
                String string = GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do();
                if (ThongTinNhanVat.boolean_int(string.equals("") ? 1 : 0)) {
                    return;
                }
                new ck_0(string).void_do();
                return;
            }
            case 101: {
                this.this();
                return;
            }
            case 102: {
                ThongTinNhanVat.cfr_renamed_21();
                return;
            }
            case 103: {
                return;
            }
            case 104: {
                this.cfr_renamed_15();
                return;
            }
            case 105: {
                TienIchGame.aq_0_do();
                TienIchGame.void_for();
                AngelChip.cfr_renamed_1();
                return;
            }
            case 106: {
                TienIchGame.aq_0_do();
                TienIchGame.void_for();
                if ((this.chuoiGiaTri != null)) {
                    new bc_0(this.chuoiGiaTri).cfr_renamed_1();
                    return;
                }
                new bc_0(br_0.java_lang_String_do(3)).cfr_renamed_1();
            }
        }
    }

    public static void cfr_renamed_3() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Thêm hoặc sửa TK", new i()));
        vector.addElement(new fl_0("Nhập từ file nội bộ", new j_0(1)));
        vector.addElement(new fl_0("Nhập từ file trên máy", new j_0(3)));
        if ((var_byte_do == 1)) {
            vector.addElement(new fl_0("Xuất ra file text", new j_0(4)));
        }
        vector.addElement(new fl_0("Xóa hết TK đã lưu", new j_0(5)));
        vector.addElement(new fl_0("Xóa rác dữ liệu TK", new j_0(7)));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public final void (String string == String string2) {
        this.var_java_lang_String_new = string;
        this.chuoiPhu = string2;
        this.var_ey_0_for.cfr_renamed_1("");
        this.var_ey_0_int.cfr_renamed_1("");
        coKichHoat = 1;
        coTrangThai = 0;
        this.cfr_renamed_8();
    }

        public final void cfr_renamed_5() {
        if ((GameCanvas.var_int_case > 200)) {
            this.cfr_renamed_23 = GameCanvas.var_int_char - 80;
            if (((0x3A ^ 0x5B ^ (0x4B ^ 0x6B)) & (149 + 222 - 117 + 0 ^ 64 + 187 - 80 + 20 ^ -" ".length())) != 0) {
                return;
            }
        } else {
            this.cfr_renamed_23 = GameCanvas.var_int_char - 65;
        }
        this.cfr_renamed_14 = -50;
        this.soLuong = GameCanvas.soLuongKhoa - 30;
        if ((this.soLuong < 70)) {
            this.soLuong = 70;
        }
        if ((this.soLuong > 99)) {
            this.soLuong = 99;
        }
        this.var_int_int = (GameCanvas.soLuongKhoa - this.soLuong >> 1) + 29;
        if ((GameCanvas.soLuongKhoa <= 128)) {
            this.soLuong = 80;
            this.var_int_int = (GameCanvas.soLuongKhoa - this.soLuong >> 1) + 20;
        }
        this.var_int_int -= (dF.cfr_renamed_12 - 1) * 40;
        GameCanvas.var_fa_0_do.cfr_renamed_1(this);
        this.cfr_renamed_14 = this.cfr_renamed_23 = this.var_int_byte / 2;
        fm.fm_do().duLieuNguoiChoi = AngelChip.duLieuNguoiChoi;
        fm.fm_do().cfr_renamed_3();
    }

    public final void cfr_renamed_8() {
        GameCanvas.void_do();
        ft_0.ft_0_do().cfr_renamed_3(ThongTinNhanVat.cfr_renamed_1().var_java_lang_String_try.hashCode());
        if (!(ThongTinNhanVat.boolean_int(coTrangThai ? 1 : 0) && ((this.var_byte_if == null) && !ThongTinNhanVat.boolean_if(this.var_java_lang_String_arr_do.length, 2) || (this.var_byte_if == 1) && !ThongTinNhanVat.boolean_if(this.var_java_lang_String_arr_do.length, 3)))) {
            if (ThongTinNhanVat.boolean_int(this.var_ey_0_for.java_lang_String_do().equals("") ? 1 : 0)) {
                ft_0.ft_0_do().cfr_renamed_1(this.var_java_lang_String_new, this.chuoiPhu, "2.5.8");
                coKichHoat = 1;
                return;
            }
            coKichHoat = 0;
            this.var_java_lang_String_new = "";
            this.chuoiPhu = "";
            ft_0.ft_0_do().cfr_renamed_1(this.var_ey_0_for.java_lang_String_do().toLowerCase(), this.var_ey_0_int.java_lang_String_do(), "2.5.8");
            return;
        }
        ft_0 ft_02 = ft_0.ft_0_do();
        ft_02.cfr_renamed_1(-12);
        ft_02.cfr_renamed_0();
    }

        public final void cfr_renamed_4() {
        this.b_();
        super.cfr_renamed_4();
        GameCanvas.cfr_renamed_7();
        if (ThongTinNhanVat.boolean_int(GameCanvas.var_boolean_try ? 1 : 0)) {
            this.var_byte_if = (byte)-1;
        }
        coTrangThai = 1;
        ((en)this).cfr_renamed_3 = this.var_fl_0_do;
        if (ThongTinNhanVat.boolean_int(this.var_java_lang_String_new.equals("") ? 1 : 0) && ThongTinNhanVat.boolean_int(this.var_ey_0_for.java_lang_String_do().equals("") ? 1 : 0)) {
            String[] stringArray = new String[2];
            stringArray[0] = "Chơi mới";
            stringArray[1] = "Đổi tài khoản";
            this.var_java_lang_String_arr_do = stringArray;
            if ((0x81 ^ 0x85) <= 0) {
                return;
            }
        } else {
            String string;
            String[] stringArray = new String[3];
            int n = 0;
            StringBuffer stringBuffer = new StringBuffer().append("Chơi tiếp");
            if (ThongTinNhanVat.cfr_renamed_0(this.var_ey_0_for.java_lang_String_do().equals("") ? 1 : 0)) {
                string = ", " + this.var_ey_0_for.java_lang_String_do();
                if (((0x1D ^ 0xD ^ (0xF0 ^ 0x82)) & (0x43 ^ 0x4E ^ (0xAF ^ 0xC0) ^ -" ".length())) == " ".length()) {
                    return;
                }
            } else {
                string = "";
            }
            stringArray[n] = stringBuffer.append(string).toString();
            stringArray[1] = "Chơi mới";
            stringArray[2] = "Đổi tài khoản";
            this.var_java_lang_String_arr_do = stringArray;
        }
        if ((this.var_boolean_try ? 1 : 0 == null)) {
            this.var_java_lang_String_int = TienIchGame.aq_0_do().java_lang_String_if();
            this.var_long_int = System.currentTimeMillis();
        }
        TienIchGame.this();
        if (ThongTinNhanVat.boolean_int(cR.coTrangThai ? 1 : 0) && (GameCanvas.var_dj_0_do == null)) {
            GameCanvas.cfr_renamed_8();
        }
    }

    static {
        ThongTinNhanVat.cfr_renamed_12();
        soLuongKhoa = 0;
        dangChayAuto = 0;
        var_byte_do = (byte)0;
    }

        public static String java_lang_String_do(int n) {
        String string;
        String string2;
        String string3;
        int n2 = n % 60;
        int n3 = n / 60 % 60;
        n = n / 3600 % 24;
        StringBuffer stringBuffer = new StringBuffer();
        if ((n < 10)) {
            string3 = "0";
            if ((187 + 81 - 118 + 48 ^ 145 + 187 - 212 + 74) == 0) {
                return null;
            }
        } else {
            string3 = "";
        }
        String string4 = stringBuffer.append(string3).append(n).toString();
        StringBuffer stringBuffer2 = new StringBuffer();
        if ((n3 < 10)) {
            string2 = "0";
            if ("   ".length() >= (0xF6 ^ 0x94 ^ (0x4F ^ 0x29))) {
                return null;
            }
        } else {
            string2 = "";
        }
        String string5 = stringBuffer2.append(string2).append(n3).toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        if ((n2 < 10)) {
            string = "0";
            if (((0x20 ^ 0xD) & ~(0x71 ^ 0x5C)) != 0) {
                return null;
            }
        } else {
            string = "";
        }
        String string6 = stringBuffer3.append(string).append(n2).toString();
        if ((n > 0)) {
            return string4 + ":" + string5 + ":" + string6;
        }
        if ((n3 > 0)) {
            return string5 + ":" + string6;
        }
        return string6;
    }

    public final void (Graphics graphics == null) {
        try {
            GameCanvas.var_fh_do.cfr_renamed_2(graphics);
            }
        catch (Exception exception) {
            }
        if ("  ".length() > (0x44 ^ 0x40)) {
            return;
        }
        GameCanvas.var_fh_do.cfr_renamed_3(graphics);
        GameCanvas.hienThongBaoPopup(graphics);
        if ((cR.coTrangThai ? 1 : 0 == null) && (TienIchGame.chuoiGiaTri != null)) {
            long l;
            int n;
            if (ThongTinNhanVat.boolean_int(coTrangThai ? 1 : 0)) {
                Graphics graphics2 = graphics;
                ThongTinNhanVat fk_02 = this;
                GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this.var_int_else, this.var_int_byte, this.cfr_renamed_9, this.var_int_if, 0);
                graphics.translate(this.var_int_else, this.var_int_byte + this.var_int_try);
                if (ThongTinNhanVat.boolean_if(this.var_byte_if, -1)) {
                    GameCanvas.var_fa_0_do.cfr_renamed_3(graphics, 5 * dF.cfr_renamed_12, this.var_byte_if * this.var_int_new, this.cfr_renamed_9 - 10 * dF.cfr_renamed_12, this.var_int_new);
                }
                n = 0;
                while ((n < fk_02.var_java_lang_String_arr_do.length)) {
                    GameCanvas.var_fz_0_try.cfr_renamed_1(graphics2, fk_02.var_java_lang_String_arr_do[n], fk_02.cfr_renamed_9 / 2, n * fk_02.var_int_new + fk_02.var_int_new / 2 - GameCanvas.var_fz_0_try.int_do() / 2, 2);
                    ++n;
                    return;
                }
                if ("  ".length() < ((0xF2 ^ 0xB6) & ~(0x40 ^ 4))) {
                    return;
                }
            } else if ((GameCanvas.var_dj_0_do == null) && (this == GameCanvas.var_en_do)) {
                GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this.var_int_else, this.var_int_byte, this.cfr_renamed_9, this.var_int_if, 0);
                graphics.setClip(this.var_int_else + 4, this.var_int_byte + 4, this.cfr_renamed_9 - 8, this.var_int_if - 8);
                if ((this.var_java_lang_String_try.equals("") ? 1 : 0 == null) && (gA.cfr_renamed_1().mangSoNguyen[4] == null)) {
                    GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, "Hotline: " + this.var_java_lang_String_try, this.var_int_else + this.cfr_renamed_9 - 8, this.var_int_byte + this.var_int_if - dF.var_byte_try - 4, 1);
                }
                this.var_ey_0_for.cfr_renamed_1(graphics);
                graphics.setClip(this.var_int_else + 4, this.var_int_byte + 4, this.cfr_renamed_9 - 8, this.var_int_if - 8);
                n = GameCanvas.var_fz_0_try.cfr_renamed_1(MenuChinhAvatar.cQ + ":");
                if ((n < this.var_ey_0_for.var_int_if - this.var_int_else)) {
                    n = (this.var_ey_0_for.var_int_if - this.var_int_else - n) / 2 + dF.cfr_renamed_15;
                    if ((0xAF ^ 0xB5 ^ (5 ^ 0x1B)) <= ((0x51 ^ 0x4F ^ (0xA4 ^ 0xAE)) & (0x1A ^ 0x6D ^ (0xD ^ 0x6E) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    n = this.var_ey_0_for.var_int_if - n - 5;
                }
                GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, MenuChinhAvatar.cQ, this.var_int_else + n, this.var_ey_0_for.cfr_renamed_14 + this.var_ey_0_for.var_int_new / 2 - dF.var_byte_try / 2, 0);
                GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, MenuChinhAvatar.aA + ":", this.var_int_else + n, this.var_ey_0_int.cfr_renamed_14 + this.var_ey_0_for.var_int_new / 2 - dF.var_byte_try / 2, 0);
                if ((this.var_boolean_int ? 1 : 0 == null)) {
                    GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this.var_int_case, this.var_int_char, this.cfr_renamed_24, this.var_boolean_case);
                    if (((0xC7 ^ 0x84) & ~(0x32 ^ 0x71)) > 0) {
                        return;
                    }
                } else {
                    GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_final, this.var_int_else + n, this.var_ey_0_do.cfr_renamed_14 + this.var_ey_0_for.var_int_new / 2 - dF.var_byte_try, 0);
                    GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, MenuChinhAvatar.aA + ":", this.var_int_else + n, this.var_ey_0_do.cfr_renamed_14 + this.var_ey_0_for.var_int_new / 2, 0);
                    GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, "Số di động", this.var_int_else + n, this.var_ey_0_if.cfr_renamed_14 + this.var_ey_0_for.var_int_new / 2 - dF.var_byte_try, 0);
                    GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, "hoặc email:", this.var_int_else + n, this.var_ey_0_if.cfr_renamed_14 + this.var_ey_0_for.var_int_new / 2, 0);
                    this.var_ey_0_do.cfr_renamed_1(graphics);
                    this.var_ey_0_if.cfr_renamed_1(graphics);
                }
                this.var_ey_0_int.cfr_renamed_1(graphics);
            }
            if (ThongTinNhanVat.boolean_int(ga_0.cfr_renamed_2 ? 1 : 0) && ThongTinNhanVat.cfr_renamed_4((this.var_long_if == 0L)) && ThongTinNhanVat.cfr_renamed_4(n = (int)((this.soXu - (l = System.currentTimeMillis() - this.var_long_if)) / 1000L))) {
                GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "Đăng nhập lại sau: " + ThongTinNhanVat.java_lang_String_do(n), this.cfr_renamed_9 / 2, 3 * this.var_int_new + this.var_int_new / 2 - GameCanvas.var_fz_0_try.int_do() / 2 + 5, 2);
            }
            GameCanvas.hienThongBaoPopup(graphics);
            graphics.drawImage(en.cfr_renamed_6, GameCanvas.cfr_renamed_15, this.cfr_renamed_14, 3);
            return;
        }
        if ((br_0.var_javax_microedition_lcdui_Image_do != null)) {
            graphics.drawImage(br_0.var_javax_microedition_lcdui_Image_do, GameCanvas.cfr_renamed_15, GameCanvas.var_int_char - 50, 3);
        }
    }

    public final void cfr_renamed_13() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeUTF("2.5.8");
            dataOutputStream.writeByte(this.cfr_renamed_18);
            dataOutputStream.writeUTF(this.var_java_lang_String_try);
            dataOutputStream.writeUTF(this.var_java_lang_String_new);
            dataOutputStream.writeUTF(this.chuoiPhu);
            if (ThongTinNhanVat.boolean_int(this.var_boolean_case ? 1 : 0)) {
                dataOutputStream.writeUTF(ThongTinNhanVat.cfr_renamed_1().var_ey_0_for.java_lang_String_do());
                dataOutputStream.writeUTF(ThongTinNhanVat.cfr_renamed_1().var_ey_0_int.java_lang_String_do());
            }
            dataOutputStream.writeInt(soLuongKhoa);
            dataOutputStream.writeBoolean(dangChayAuto);
            dataOutputStream.writeBoolean(coKichHoat);
            hg.cfr_renamed_1("avlogin", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private void cfr_renamed_14() {
        if ((this.var_boolean_case ? 1 : 0 == null)) {
            this.var_boolean_case = 1;
            this.var_fl_0_case.chuoiGiaTri = MenuChinhAvatar.al;
            return;
        }
        this.var_boolean_case = 0;
        this.var_fl_0_case.chuoiGiaTri = MenuChinhAvatar.var_java_lang_String_super;
    }

    public final void void_int(int n) {
        if ((cR.coTrangThai ? 1 : 0 == null) && (TienIchGame.chuoiGiaTri != null)) {
            if (ThongTinNhanVat.boolean_int(this.var_ey_0_for.boolean_do() ? 1 : 0)) {
                this.var_ey_0_for.boolean_do(n);
                } else if (ThongTinNhanVat.boolean_int(this.var_ey_0_int.boolean_do() ? 1 : 0)) {
                this.var_ey_0_int.boolean_do(n);
                if (-" ".length() >= 0) {
                    return;
                }
            } else if (ThongTinNhanVat.boolean_int(this.var_ey_0_do.boolean_do() ? 1 : 0)) {
                this.var_ey_0_do.boolean_do(n);
                if (" ".length() == -" ".length()) {
                    return;
                }
            } else if (ThongTinNhanVat.boolean_int(this.var_ey_0_if.boolean_do() ? 1 : 0)) {
                this.var_ey_0_if.boolean_do(n);
                }
        }
        super.void_int(n);
    }

    private void this() {
        GameCanvas.cfr_renamed_8();
        GameCanvas.void_do();
        ft_0.ft_0_do().cfr_renamed_2(this.var_ey_0_for.java_lang_String_do().toLowerCase(), this.var_ey_0_int.java_lang_String_do().toLowerCase(), this.var_ey_0_if.java_lang_String_do());
        this.var_boolean_int = 0;
        ((en)this).cfr_renamed_3 = this.var_fl_0_if;
        GameCanvas.var_fa_0_do.cfr_renamed_1(this);
    }

    public static ThongTinNhanVat cfr_renamed_1() {
        if ((instance == null)) {
            instance = new ThongTinNhanVat();
        }
        return instance;
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        private static void cfr_renamed_12() {
        mangSoNguyen = new int[42];
        54 = "   ".length() ^ (0x6E ^ 0x5B);
        -1 = -" ".length();
        1 = " ".length();
        2 = "  ".length();
        0 = (60 + 51 - 22 + 95 ^ 61 + 92 - 121 + 104) & (0x10 ^ 0x41 ^ (0x14 ^ 0x75) ^ -" ".length());
        3 = "   ".length();
        60 = 0x27 ^ 0x7A ^ (0x7F ^ 0x1E);
        3600 = 0xFFFF8F91 & 0x7E7E;
        24 = 93 + 130 - 144 + 55 ^ 29 + 6 - -41 + 82;
        10 = 0x76 ^ 0x33 ^ (0xFF ^ 0xB0);
        -50 = -(0xAD ^ 0x9F);
        26 = 0x9F ^ 0x85;
        30 = 0xB1 ^ 0xAF;
        200 = (0x18 ^ 0x2F) + (0xC ^ 0x46) - (0xD6 ^ 0x8A) + (27 + 37 - -21 + 78);
        104 = 0x1C ^ 0x74;
        105 = 107 + 182 - 121 + 61 ^ 19 + 56 - 8 + 73;
        106 = 0x3A ^ 0x25 ^ (0xD5 ^ 0xA0);
        80 = 0x66 ^ 0x36;
        65 = 0x2F ^ 0x43 ^ (0x14 ^ 0x39);
        70 = 0xC1 ^ 0x87;
        99 = 0x3B ^ 0x55 ^ (0x81 ^ 0x8C);
        29 = 0x1C ^ 0x5D ^ (0xC6 ^ 0x9A);
        128 = (0x48 ^ 0x41) + (0xF9 ^ 0x89) - (0x69 ^ 0x41) + (0xA7 ^ 0x88);
        20 = 0xF9 ^ 0x8E ^ (0x66 ^ 5);
        40 = 0xD ^ 0x4D ^ (0xE2 ^ 0x8A);
        55 = 14 + 31 - -30 + 55 ^ 27 + 87 - 99 + 166;
        100 = 0xC3 ^ 0xA7;
        5 = 0x8D ^ 0x84 ^ (0x69 ^ 0x65);
        4 = 0x12 ^ 0x16;
        7 = 0xDA ^ 0xB6 ^ (7 ^ 0x6C);
        47 = 0xAC ^ 0xA0 ^ (0x56 ^ 0x75);
        45 = 6 ^ 0x7C ^ (0xEE ^ 0xB9);
        46 = 0x36 ^ 0x18;
        9 = 9 ^ 0;
        102 = 0xE5 ^ 0x83;
        51 = 0xB5 ^ 0x86;
        52 = 168 + 11 - -43 + 19 ^ 131 + 72 - 164 + 158;
        53 = 0x50 ^ 0x28 ^ (0xE5 ^ 0xA8);
        6 = 0x5F ^ 0x59;
        8 = 0x57 ^ 0x5F;
        50 = 7 ^ 0x35;
        -12 = -(0x7E ^ 0x72);
    }

    public final void cfr_renamed_6() {
        if (!(cR.coTrangThai ? 1 : 0 == null) || (TienIchGame.chuoiGiaTri == null)) {
            super.cfr_renamed_6();
            return;
        }
        if (ThongTinNhanVat.boolean_int(coTrangThai ? 1 : 0)) {
            ThongTinNhanVat fk_02 = this;
            if (ThongTinNhanVat.boolean_int(GameCanvas.boolean_do(2) ? 1 : 0)) {
                this.var_byte_if = (byte)(this.var_byte_if - 1);
                if (ThongTinNhanVat.boolean_do(this.var_byte_if)) {
                    this.var_byte_if = (byte)(this.var_java_lang_String_arr_do.length - 1);
                    if ("  ".length() <= -" ".length()) {
                        return;
                    }
                }
            } else if (ThongTinNhanVat.boolean_int(GameCanvas.boolean_do(8) ? 1 : 0)) {
                this.var_byte_if = (byte)(this.var_byte_if + 1);
                if (ThongTinNhanVat.boolean_do(this.var_byte_if, this.var_java_lang_String_arr_do.length)) {
                    this.var_byte_if = (byte)0;
                }
            }
            if (ThongTinNhanVat.boolean_int(GameCanvas.coTrangThai ? 1 : 0)) {
                int n = 0;
                while ((n < fk_02.var_java_lang_String_arr_do.length)) {
                    if (ThongTinNhanVat.boolean_int(GameCanvas.boolean_if(fk_02.var_int_else, fk_02.var_int_byte + fk_02.var_int_try + n * fk_02.var_int_new, fk_02.cfr_renamed_9, fk_02.var_int_new) ? 1 : 0)) {
                        fk_02.var_byte_if = (byte)n;
                        GameCanvas.coTrangThai = 0;
                        fk_02.var_boolean_byte = 1;
                        if (" ".length() <= (0x98 ^ 0x9C)) break;
                        return;
                    }
                    ++n;
                    if ("  ".length() > 0) continue;
                    return;
                }
            }
            if (ThongTinNhanVat.boolean_int(fk_02.var_boolean_byte ? 1 : 0)) {
                if (ThongTinNhanVat.boolean_int(GameCanvas.var_boolean_case ? 1 : 0) && (GameCanvas.boolean_if(fk_02.var_int_else, fk_02.var_int_byte + fk_02.var_int_try + fk_02.var_byte_if * fk_02.var_int_new, fk_02.cfr_renamed_9, fk_02.var_int_new) ? 1 : 0 == null)) {
                    fk_02.var_byte_if = (byte)-1;
                }
                if (ThongTinNhanVat.boolean_int(GameCanvas.var_boolean_new ? 1 : 0)) {
                    GameCanvas.var_boolean_new = 0;
                    fk_02.var_boolean_byte = 0;
                    if (ThongTinNhanVat.boolean_if(fk_02.var_byte_if, -1)) {
                        fk_02.cfr_renamed_15();
                    }
                }
            }
            super.cfr_renamed_6();
            return;
        }
        if (ThongTinNhanVat.boolean_int(GameCanvas.var_boolean_new ? 1 : 0) && ThongTinNhanVat.boolean_int(GameCanvas.boolean_do(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_case) ? 1 : 0) && ThongTinNhanVat.boolean_int(GameCanvas.boolean_do(this.var_int_case - 10, this.var_int_char, 70, en.cfr_renamed_16 * dF.cfr_renamed_12 + 10) ? 1 : 0)) {
            this.cfr_renamed_14();
        }
        if (ThongTinNhanVat.boolean_int(GameCanvas.var_boolean_arr_do[2])) {
            if ((this.cfr_renamed_24 > 0)) {
                this.cfr_renamed_24 -= 1;
                if (-"  ".length() > 0) {
                    return;
                }
            } else if (ThongTinNhanVat.boolean_int(this.var_boolean_int ? 1 : 0)) {
                this.cfr_renamed_24 = 3;
                if ("   ".length() == (0xB4 ^ 0x90 ^ (0x8A ^ 0xAA))) {
                    return;
                }
            } else {
                this.cfr_renamed_24 = 2;
            }
        }
        if (ThongTinNhanVat.boolean_int(GameCanvas.var_boolean_arr_do[8])) {
            int n;
            if (ThongTinNhanVat.boolean_int(this.var_boolean_int ? 1 : 0)) {
                n = 3;
                if (((0x59 ^ 0x47) & ~(0x63 ^ 0x7D)) == (0xA ^ 0xE)) {
                    return;
                }
            } else {
                n = 2;
            }
            if ((this.cfr_renamed_24 < n)) {
                this.cfr_renamed_24 += 1;
                if ("   ".length() <= 0) {
                    return;
                }
            } else {
                this.cfr_renamed_24 = 0;
            }
        }
        if (!(GameCanvas.var_boolean_arr_do[2] == null) || ThongTinNhanVat.boolean_int(GameCanvas.var_boolean_arr_do[8])) {
            GameCanvas.cfr_renamed_6();
            if ((this.cfr_renamed_24 == null)) {
                this.var_ey_0_for.cfr_renamed_0(1);
                this.var_ey_0_int.cfr_renamed_0(0);
                this.var_ey_0_do.cfr_renamed_0(0);
                this.var_ey_0_if.cfr_renamed_0(0);
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            } else if ((this.cfr_renamed_24 == 1)) {
                this.var_ey_0_for.cfr_renamed_0(0);
                this.var_ey_0_int.cfr_renamed_0(1);
                this.var_ey_0_do.cfr_renamed_0(0);
                this.var_ey_0_if.cfr_renamed_0(0);
                if ((0xA8 ^ 0xC2 ^ (0xCA ^ 0xA4)) <= " ".length()) {
                    return;
                }
            } else if ((this.cfr_renamed_24 == 2)) {
                this.var_ey_0_for.cfr_renamed_0(0);
                this.var_ey_0_int.cfr_renamed_0(0);
                ((en)this).cfr_renamed_4 = null;
                if (ThongTinNhanVat.boolean_int(this.var_boolean_int ? 1 : 0)) {
                    this.var_ey_0_do.cfr_renamed_0(1);
                    this.var_ey_0_if.cfr_renamed_0(0);
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
            } else {
                this.var_ey_0_for.cfr_renamed_0(0);
                this.var_ey_0_int.cfr_renamed_0(0);
                this.var_ey_0_do.cfr_renamed_0(0);
                this.var_ey_0_if.cfr_renamed_0(1);
            }
        }
        super.cfr_renamed_6();
    }

    public final void (Graphics graphics != null) {
        this.cfr_renamed_0(graphics);
        super.cfr_renamed_1(graphics);
    }

    public final void cfr_renamed_9() {
        block6: {
            DataInputStream dataInputStream = aa_0.java_io_DataInputStream_do("avlogin");
            if (!(dataInputStream != null)) break block6;
            String string = "";
            try {
                string = dataInputStream.readUTF();
                this.cfr_renamed_18 = dataInputStream.readByte();
                this.var_java_lang_String_try = dataInputStream.readUTF();
                this.var_java_lang_String_new = dataInputStream.readUTF();
                this.chuoiPhu = dataInputStream.readUTF();
                if (ThongTinNhanVat.boolean_int(this.var_boolean_case ? 1 : 0)) {
                    this.var_ey_0_for.cfr_renamed_1(dataInputStream.readUTF());
                    this.var_ey_0_int.cfr_renamed_1(dataInputStream.readUTF());
                }
                soLuongKhoa = dataInputStream.readInt();
                dangChayAuto = dataInputStream.readBoolean();
                coKichHoat = dataInputStream.readBoolean();
                dataInputStream.close();
                }
            catch (Exception exception) {
                aa_0.void_do("avlogin");
            }
            if ((88 + 25 - 102 + 130 ^ 59 + 19 - -41 + 18) != (0x1B ^ 0x3A ^ (3 ^ 0x26))) {
                return;
            }
            if ((dangChayAuto ? 1 : 0 == null)) {
                aa_0.void_do("avatarSV");
            }
            if (("2.5.8".equals(string) ? 1 : 0 == null)) {
                aa_0.cfr_renamed_2();
            }
        }
    }

    public ThongTinNhanVat() {
        int n;
        this.var_ey_0_do = new ey_0();
        this.var_ey_0_if = new ey_0();
        this.var_boolean_case = 1;
        this.var_boolean_int = 0;
        String[] stringArray = new String[3];
        stringArray[0] = "Chơi mới";
        stringArray[1] = "Chơi tiếp";
        stringArray[2] = "Đổi tài khoản";
        this.var_java_lang_String_arr_do = stringArray;
        this.var_java_lang_String_new = "";
        this.chuoiPhu = "";
        this.cfr_renamed_5();
        this.var_ey_0_for.cfr_renamed_0(1);
        this.var_ey_0_for.void_do(0);
        this.var_ey_0_int.void_do(2);
        this.var_ey_0_do.void_do(2);
        this.var_ey_0_if.void_do(0);
        this.var_ey_0_if.chuoiGiaTri = "Tùy chọn";
        this.cfr_renamed_24 = 0;
        this.var_long_for = 0L;
        if ((TienIchGame.boolean_int() ? 1 : 0 == null)) {
            n = 1;
            if (((50 + 164 - 99 + 118 ^ 74 + 118 - 181 + 127) & (10 + 176 - 85 + 93 ^ 8 + 142 - 132 + 143 ^ -" ".length())) != 0) {
                throw null;
            }
        } else {
            n = 0;
        }
        this.var_boolean_try = n;
        this.var_long_int = 0L;
        this.var_java_lang_String_int = null;
        if ((hg.java_lang_String_do(hg.chuoiGiaTri) == null)) {
            aa_0.cfr_renamed_4();
        }
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 0: {
                this.var_boolean_int = 1;
                GameCanvas.var_fa_0_do.cfr_renamed_1(this);
                return;
            }
            case 1: {
                this.var_boolean_int = 0;
                GameCanvas.var_fa_0_do.cfr_renamed_1(this);
                return;
            }
            case 2: {
                GameCanvas.void_do(MenuChinhAvatar.bg, 54);
                return;
            }
            case 3: {
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.f, 55, null);
                return;
            }
            case 4: {
                GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.cJ, 100, 3);
                return;
            }
            case 44: {
                Vector<fl_0> vector = new Vector<fl_0>();
                if ((j_0.var_hb_do.var_java_util_Vector_do.isEmpty() ? 1 : 0 == null)) {
                    Enumeration enumeration = j_0.var_hb_do.java_util_Enumeration_do();
                    while (ThongTinNhanVat.boolean_int(enumeration.hasMoreElements() ? 1 : 0)) {
                        Object object = (String)enumeration.nextElement();
                        object = (j_0)j_0.var_hb_do.java_lang_Object_do(object);
                        vector.addElement(new fl_0(((j_0)object).cfr_renamed_0, new j_0(((j_0)object).cfr_renamed_0, ((j_0)object).chuoiGiaTri)));
                        if ("   ".length() <= (0x9A ^ 0x86 ^ (0x5D ^ 0x45))) continue;
                        return;
                    }
                }
                if (ThongTinNhanVat.boolean_int(vector.isEmpty() ? 1 : 0)) {
                    GameCanvas.hienThongBaoPopup("Hiện chưa có tài khoản nào được lưu!");
                    return;
                }
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 45: {
                String string = this.var_ey_0_for.java_lang_String_do();
                String string2 = this.var_ey_0_int.java_lang_String_do();
                String string3 = string.trim().toLowerCase();
                if (!(string3.equals("") ? 1 : 0 == null) || ThongTinNhanVat.boolean_int(string2.equals("") ? 1 : 0)) {
                    GameCanvas.hienThongBaoPopup("Bạn chưa nhập tài khoản hoặc mật khẩu!");
                    return;
                }
                if ((j_0.var_hb_do.boolean_do(string3) ? 1 : 0 == null)) {
                    j_0.j_0_do();
                    j_0.cfr_renamed_1(string, string2);
                    GameCanvas.hienThongBaoPopup("Thêm tài khoản (" + string + ") thành công!");
                    return;
                }
                j_0 j_02 = (j_0)j_0.var_hb_do.java_lang_Object_do(string3);
                if ((j_02 != null) && ThongTinNhanVat.boolean_int(j_02.chuoiGiaTri.equals(string2) ? 1 : 0)) {
                    GameCanvas.hienThongBaoPopup("Tài khoản (" + j_02.cfr_renamed_0 + ") đã tồn tại!");
                    return;
                }
                j_0.var_hb_do.cfr_renamed_1(string3, string3, new j_0(string, string2));
                j_0.j_0_do();
                j_0.void_for();
                GameCanvas.hienThongBaoPopup("Sửa tài khoản (" + string + ") thành công!");
                return;
            }
            case 46: {
                ThongTinNhanVat.cfr_renamed_3();
                return;
            }
            case 47: {
                AutoController.tatAuto();
                if (ThongTinNhanVat.boolean_int(ga_0.dangChayAuto ? 1 : 0)) {
                    ga_0.cfr_renamed_0 = 1;
                }
                ga_0.cfr_renamed_2 = 0;
                return;
            }
            case 5: {
                gA.cfr_renamed_1().cfr_renamed_4();
                return;
            }
            case 6: {
                AngelChip.cfr_renamed_1("http://wap.teamobi.com/faqs.php?provider=" + AngelChip.var_byte_do);
                return;
            }
            case 7: {
                AngelChip.cfr_renamed_1("http://wap.teamobi.com?info=checkupdate&game=8&version=2.5.8&provider=" + AngelChip.var_byte_do + "&agent=" + AngelChip.cfr_renamed_2);
                return;
            }
            case 8: {
                if ((this.var_java_lang_String_try.equals("") ? 1 : 0 == null)) {
                    AngelChip.cfr_renamed_1("tel:" + this.var_java_lang_String_try);
                    return;
                }
                if ((ae.ae_do().cfr_renamed_2 ? 1 : 0 == null)) {
                    GameCanvas.cfr_renamed_2(MenuChinhAvatar.bS);
                    GameCanvas.void_do();
                    } else {
                    GameCanvas.cfr_renamed_8();
                }
                ft_0.ft_0_do().cfr_renamed_1(5, (String)null);
                return;
            }
            case 9: {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_32 + MenuChinhAvatar.cfr_renamed_33);
                aa_0.cfr_renamed_2();
            }
        }
    }

    public final void cfr_renamed_7() {
        if (ThongTinNhanVat.cfr_renamed_4(ThongTinNhanVat.cfr_renamed_0((System.currentTimeMillis() - this.var_long_for) / 1000L, 300L))) {
            this.var_long_for = System.currentTimeMillis();
            String string = br_0.java_lang_String_do(br_0.soLuong + 6);
            if ((string != null) && (string.length() > 0)) {
                GameCanvas.cfr_renamed_3(string);
            }
        }
        if ((cR.coTrangThai ? 1 : 0 == null) && (TienIchGame.chuoiGiaTri != null)) {
            if ((coTrangThai ? 1 : 0 == null) && (this == GameCanvas.var_en_do) && (GameCanvas.var_aa_do == null)) {
                this.var_ey_0_for.cfr_renamed_2();
                this.var_ey_0_int.cfr_renamed_2();
                if (ThongTinNhanVat.boolean_int(this.var_boolean_int ? 1 : 0)) {
                    this.var_ey_0_do.cfr_renamed_2();
                    this.var_ey_0_if.cfr_renamed_2();
                }
                if (ThongTinNhanVat.boolean_int(this.var_ey_0_for.boolean_do() ? 1 : 0)) {
                    ((en)this).cfr_renamed_4 = this.var_ey_0_for.fl_0_do();
                    if (" ".length() < 0) {
                        return;
                    }
                } else if (ThongTinNhanVat.boolean_int(this.var_ey_0_int.boolean_do() ? 1 : 0)) {
                    ((en)this).cfr_renamed_4 = this.var_ey_0_int.fl_0_do();
                    if ((0xA8 ^ 0xAD) <= 0) {
                        return;
                    }
                } else if (ThongTinNhanVat.boolean_int(this.var_ey_0_do.boolean_do() ? 1 : 0)) {
                    ((en)this).cfr_renamed_4 = this.var_ey_0_do.fl_0_do();
                    if ((0x50 ^ 0x38 ^ (0x3A ^ 0x56)) <= -" ".length()) {
                        return;
                    }
                }
            } else {
                ((en)this).cfr_renamed_4 = null;
            }
            if (ThongTinNhanVat.boolean_if(this.cfr_renamed_23, this.cfr_renamed_14)) {
                this.cfr_renamed_14 += this.cfr_renamed_23 - this.cfr_renamed_14 >> 1;
            }
            if (ThongTinNhanVat.boolean_int(this.var_boolean_int ? 1 : 0)) {
                ((en)this).cfr_renamed_3 = this.var_fl_0_char;
                } else if ((this.cfr_renamed_24 == 2)) {
                ((en)this).cfr_renamed_4 = this.var_fl_0_case;
            }
            if ((this.var_boolean_try ? 1 : 0 == null) && ThongTinNhanVat.boolean_for((System.currentTimeMillis() - this.var_long_int, 1000L == null))) {
                this.var_boolean_try = 1;
                TienIchGame.aq_0_do();
                TienIchGame.hienThongBao(this.var_java_lang_String_int);
                if (" ".length() != " ".length()) {
                    return;
                }
            }
        } else {
            ((en)this).cfr_renamed_3 = null;
            ((en)this).cfr_renamed_5 = this.var_fl_0_else;
            ((en)this).cfr_renamed_4 = this.var_fl_0_byte;
        }
        GameCanvas.var_fh_do.cfr_renamed_2();
    }

    private static boolean boolean_int(int n) {
        return n != 0;
    }

    private void cfr_renamed_15() {
        switch (this.var_byte_if) {
            case 0: {
                if ((this.var_java_lang_String_arr_do.length == 2)) {
                    new t_0().void_do();
                    return;
                }
                if (ThongTinNhanVat.boolean_int(coKichHoat ? 1 : 0)) {
                    gv_0.gv_0_do().cfr_renamed_4();
                    return;
                }
                String string = this.var_ey_0_for.java_lang_String_do().toLowerCase().trim();
                String string2 = this.var_ey_0_int.java_lang_String_do();
                if ((string.equals("") ? 1 : 0 == null)) {
                    if (ThongTinNhanVat.boolean_int(string2.equals("") ? 1 : 0)) {
                        this.cfr_renamed_24 = 1;
                        this.var_ey_0_for.cfr_renamed_0(0);
                        this.var_ey_0_int.cfr_renamed_0(1);
                        return;
                    }
                    gv_0.gv_0_do().cfr_renamed_4();
                }
                return;
            }
            case 1: {
                if (ThongTinNhanVat.boolean_if(this.var_java_lang_String_arr_do.length, 2)) {
                    t_0 t_02 = new t_0();
                    if ((this.var_java_lang_String_new.equals("") ? 1 : 0 == null) && ThongTinNhanVat.boolean_int(this.var_ey_0_for.java_lang_String_do().equals("") ? 1 : 0)) {
                        GameCanvas.cfr_renamed_1("Tài khoản của bạn chưa được đăng kí liên kết với một tài khoản Team. Bạn sẽ mất tài khoản đang chơi nếu tiếp tục. Bạn có muốn tiếp tục ?", t_02);
                        return;
                    }
                    t_02.void_do();
                    return;
                }
            }
            case 2: {
                ThongTinNhanVat fk_02 = this;
                gx gx2 = new gx(fk_02);
                if ((fk_02.var_java_lang_String_new.equals("") ? 1 : 0 == null) && ThongTinNhanVat.boolean_int(fk_02.var_ey_0_for.java_lang_String_do().equals("") ? 1 : 0)) {
                    GameCanvas.cfr_renamed_1("Tài khoản của bạn chưa được đăng kí liên kết với một tài khoản Team. Bạn sẽ mất tài khoản đang chơi nếu tiếp tục. Bạn có muốn tiếp tục ?", gx2);
                    return;
                }
                gx2.void_do();
            }
        }
    }

        private static void cfr_renamed_21() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(MenuChinhAvatar.I, 51));
        vector.addElement(new fl_0(MenuChinhAvatar.n, 52));
        vector.addElement(new fl_0(MenuChinhAvatar.aS, 53));
        GameCanvas.hienThongBaoPopup(MenuChinhAvatar.aw, vector);
    }

    public final void void_if() {
        GameCanvas.void_do(MenuChinhAvatar.bg, 54);
    }

        public final void (String string != null) {
        this.var_java_lang_String_try = string;
    }

    public final void b_() {
        this.var_fl_0_for = new fl_0(MenuChinhAvatar.bR, 0);
        this.var_fl_0_char = new fl_0(MenuChinhAvatar.h, 3);
        this.var_fl_0_if = new fl_0(MenuChinhAvatar.cT, 1);
        this.var_fl_0_case = new fl_0(MenuChinhAvatar.var_java_lang_String_super, 2);
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.cT, 104);
        this.var_fl_0_byte = new fl_0(MenuChinhAvatar.cfr_renamed_34, 105);
        this.var_fl_0_else = new fl_0(MenuChinhAvatar.b, 106);
        ((en)this).cfr_renamed_5 = this.var_fl_0_for;
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

