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

public final class ThongTinNhanVat
extends dL {
    public long soXu;
    private byte var_byte_if;
    private ei var_ei_byte;
    private String chuoiPhu;
    private ei var_ei_case;
    public int soLuong;
    public static int var_int_if;
    public int soLuongKhoa;
    private ei var_ei_char;
    public int var_int_int;
    public static boolean dangChayAuto;
    private String[] var_java_lang_String_arr_do;
    public static ThongTinNhanVat instance;
    private int cfr_renamed_10;
    public static boolean coTrangThai;
    public int var_int_new;
    public static String chuoiGiaTri;
    public gx var_gx_do;
    private static final int[] mangSoNguyen;
    public ei var_ei_do;
    public int var_int_try;
    public static byte var_byte_do;
    public ei var_ei_if;
    public boolean coKichHoat;
    private boolean var_boolean_try;
    public gx var_gx_if;
    public String tenNhanVat;
    public long var_long_if;
    public int var_int_byte;
    private long var_long_for;
    public int var_int_case;
    private String var_java_lang_String_int;
    public gx var_gx_for;
    public ei var_ei_for;
    public int var_int_char;
    private boolean var_boolean_byte;
    private int cfr_renamed_14;
    private String var_java_lang_String_new;
    private int cfr_renamed_23;
    private String var_java_lang_String_try = "19006610";
    public static boolean var_boolean_int;
    public int var_int_else;
    public int cfr_renamed_18;
    private ei var_ei_else;
    private long var_long_int;
    private boolean var_boolean_case;
    public gx var_gx_int = new gx();

    public final void cfr_renamed_15() {
        if (!!(cd.dangChayAuto) || (TienIchGame.tenNhanVat == null)) {
            super.cfr_renamed_15();
            return;
        }
        if (ThongTinNhanVat.boolean_do(dangChayAuto ? 1 : 0)) {
            ThongTinNhanVat gO2 = this;
            if (ThongTinNhanVat.boolean_do(GameCanvas.boolean_do(2) ? 1 : 0)) {
                this.var_byte_if = (byte)(this.var_byte_if - 1);
                if ((this.var_byte_if < 0)) {
                    this.var_byte_if = (byte)(this.var_java_lang_String_arr_do.length - 1);
                    if ((0x5C ^ 0x58) < " ".length()) {
                        return;
                    }
                }
            } else if (ThongTinNhanVat.boolean_do(GameCanvas.boolean_do(8) ? 1 : 0)) {
                this.var_byte_if = (byte)(this.var_byte_if + 1);
                if ((this.var_byte_if >= this.var_java_lang_String_arr_do.length)) {
                    this.var_byte_if = (byte)0;
                }
            }
            if (ThongTinNhanVat.boolean_do(GameCanvas.coKichHoat ? 1 : 0)) {
                int n = 0;
                while (ThongTinNhanVat.boolean_do(n, gO2.var_java_lang_String_arr_do.length)) {
                    if (ThongTinNhanVat.boolean_do(GameCanvas.boolean_do(gO2.var_int_case, gO2.var_int_int + gO2.soLuong + n * gO2.var_int_else, gO2.var_int_byte, gO2.var_int_else) ? 1 : 0)) {
                        gO2.var_byte_if = (byte)n;
                        GameCanvas.coKichHoat = 0;
                        gO2.var_boolean_byte = 1;
                        if (((0x83 ^ 0xB0) & ~(0x41 ^ 0x72)) == 0) break;
                        return;
                    }
                    ++n;
                    return;
                }
            }
            if (ThongTinNhanVat.boolean_do(gO2.var_boolean_byte ? 1 : 0)) {
                if (ThongTinNhanVat.boolean_do(GameCanvas.var_boolean_try ? 1 : 0) && !(GameCanvas.boolean_do(gO2.var_int_case, gO2.var_int_int + gO2.soLuong + gO2.var_byte_if * gO2.var_int_else, gO2.var_int_byte, gO2.var_int_else))) {
                    gO2.var_byte_if = (byte)-1;
                }
                if (ThongTinNhanVat.boolean_do(GameCanvas.var_boolean_new ? 1 : 0)) {
                    GameCanvas.var_boolean_new = 0;
                    gO2.var_boolean_byte = 0;
                    if ((gO2.var_byte_if != -1)) {
                        gO2.cfr_renamed_17();
                    }
                }
            }
            super.cfr_renamed_15();
            return;
        }
        if (ThongTinNhanVat.boolean_do(GameCanvas.var_boolean_new ? 1 : 0) && ThongTinNhanVat.boolean_do(GameCanvas.boolean_if(0, 0, GameCanvas.var_int_byte, GameCanvas.var_int_char) ? 1 : 0) && ThongTinNhanVat.boolean_do(GameCanvas.boolean_if(this.var_int_new - 10, this.cfr_renamed_18, 70, dL.cfr_renamed_13 * bn_0.cfr_renamed_6 + 10) ? 1 : 0)) {
            this.cfr_renamed_6();
        }
        if (ThongTinNhanVat.boolean_do(GameCanvas.var_boolean_arr_do[2])) {
            if ((this.cfr_renamed_14 > 0)) {
                this.cfr_renamed_14 -= 1;
                if (" ".length() == 0) {
                    return;
                }
            } else if (ThongTinNhanVat.boolean_do(this.coKichHoat ? 1 : 0)) {
                this.cfr_renamed_14 = 3;
                if ("  ".length() == 0) {
                    return;
                }
            } else {
                this.cfr_renamed_14 = 2;
            }
        }
        if (ThongTinNhanVat.boolean_do(GameCanvas.var_boolean_arr_do[8])) {
            int n;
            if (ThongTinNhanVat.boolean_do(this.coKichHoat ? 1 : 0)) {
                n = 3;
                if (((0x20 ^ 0x1E ^ (0x2E ^ 0xA)) & (0x13 ^ 0x7E ^ (0x7F ^ 8) ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                n = 2;
            }
            if (ThongTinNhanVat.boolean_do(this.cfr_renamed_14, n)) {
                this.cfr_renamed_14 += 1;
                if ((0x70 ^ 0x75) == 0) {
                    return;
                }
            } else {
                this.cfr_renamed_14 = 0;
            }
        }
        if (!(GameCanvas.var_boolean_arr_do[2] == 0) || ThongTinNhanVat.boolean_do(GameCanvas.var_boolean_arr_do[8])) {
            GameCanvas.void_if();
            if ((this.cfr_renamed_14 == 0)) {
                this.var_gx_int.cfr_renamed_0(1);
                this.var_gx_if.cfr_renamed_0(0);
                this.var_gx_for.cfr_renamed_0(0);
                this.var_gx_do.cfr_renamed_0(0);
                } else if ((this.cfr_renamed_14 == 1)) {
                this.var_gx_int.cfr_renamed_0(0);
                this.var_gx_if.cfr_renamed_0(1);
                this.var_gx_for.cfr_renamed_0(0);
                this.var_gx_do.cfr_renamed_0(0);
                if ("   ".length() > "   ".length()) {
                    return;
                }
            } else if ((this.cfr_renamed_14 == 2)) {
                this.var_gx_int.cfr_renamed_0(0);
                this.var_gx_if.cfr_renamed_0(0);
                ((dL)this).cfr_renamed_2 = null;
                if (ThongTinNhanVat.boolean_do(this.coKichHoat ? 1 : 0)) {
                    this.var_gx_for.cfr_renamed_0(1);
                    this.var_gx_do.cfr_renamed_0(0);
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                }
            } else {
                this.var_gx_int.cfr_renamed_0(0);
                this.var_gx_if.cfr_renamed_0(0);
                this.var_gx_for.cfr_renamed_0(0);
                this.var_gx_do.cfr_renamed_0(1);
            }
        }
        super.cfr_renamed_15();
    }

    public final void cfr_renamed_1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeUTF("2.5.8");
            dataOutputStream.writeByte(this.cfr_renamed_17);
            dataOutputStream.writeUTF(this.var_java_lang_String_try);
            dataOutputStream.writeUTF(this.var_java_lang_String_new);
            dataOutputStream.writeUTF(this.var_java_lang_String_int);
            if (ThongTinNhanVat.boolean_do(this.var_boolean_case ? 1 : 0)) {
                dataOutputStream.writeUTF(ThongTinNhanVat.cfr_renamed_0().var_gx_int.java_lang_String_do());
                dataOutputStream.writeUTF(ThongTinNhanVat.cfr_renamed_0().var_gx_if.java_lang_String_do());
            }
            dataOutputStream.writeInt(var_int_if);
            dataOutputStream.writeBoolean(coTrangThai);
            dataOutputStream.writeBoolean(var_boolean_int);
            gc_0.cfr_renamed_0("avlogin", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void void_for() {
        if (ThongTinNhanVat.cfr_renamed_4(ThongTinNhanVat.cfr_renamed_0((System.currentTimeMillis() - this.var_long_int) / 1000L, 300L))) {
            this.var_long_int = System.currentTimeMillis();
            String string = bl_0.java_lang_String_do(bl_0.soLuong + 3);
            if ((string != null) && (string.length() > 0)) {
                GameCanvas.cfr_renamed_3(string);
            }
        }
        if (!(cd.dangChayAuto) && (TienIchGame.tenNhanVat != null)) {
            if (!(dangChayAuto) && (this == GameCanvas.var_dL_do) && (GameCanvas.var_e_0_do == null)) {
                this.var_gx_int.cfr_renamed_1();
                this.var_gx_if.cfr_renamed_1();
                if (ThongTinNhanVat.boolean_do(this.coKichHoat ? 1 : 0)) {
                    this.var_gx_for.cfr_renamed_1();
                    this.var_gx_do.cfr_renamed_1();
                }
                if (ThongTinNhanVat.boolean_do(this.var_gx_int.boolean_do() ? 1 : 0)) {
                    ((dL)this).cfr_renamed_2 = this.var_gx_int.ei_do();
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                } else if (ThongTinNhanVat.boolean_do(this.var_gx_if.boolean_do() ? 1 : 0)) {
                    ((dL)this).cfr_renamed_2 = this.var_gx_if.ei_do();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                } else if (ThongTinNhanVat.boolean_do(this.var_gx_for.boolean_do() ? 1 : 0)) {
                    ((dL)this).cfr_renamed_2 = this.var_gx_for.ei_do();
                    if (-" ".length() > ((0x14 ^ 0x78 ^ (8 ^ 0x29)) & (71 + 1 - -98 + 27 ^ 120 + 129 - 234 + 121 ^ -" ".length()))) {
                        return;
                    }
                }
            } else {
                ((dL)this).cfr_renamed_2 = null;
            }
            if ((this.cfr_renamed_10 != this.cfr_renamed_23)) {
                this.cfr_renamed_23 += this.cfr_renamed_10 - this.cfr_renamed_23 >> 1;
            }
            if (ThongTinNhanVat.boolean_do(this.coKichHoat ? 1 : 0)) {
                ((dL)this).cfr_renamed_5 = this.var_ei_char;
                if ("  ".length() <= ((0x2F ^ 0x6F ^ (0xAB ^ 0xA5)) & (0xB7 ^ 0xC1 ^ (0x8D ^ 0xB5) ^ -" ".length()))) {
                    return;
                }
            } else if ((this.cfr_renamed_14 == 2)) {
                ((dL)this).cfr_renamed_2 = this.var_ei_byte;
            }
            if (!(this.var_boolean_try) && ThongTinNhanVat.boolean_if((System.currentTimeMillis() - this.var_long_for == 1000L))) {
                this.var_boolean_try = 1;
                TienIchGame.aq_0_do();
                TienIchGame.void_if(this.chuoiPhu);
                if ((0x33 ^ 0x36) <= 0) {
                    return;
                }
            }
        } else {
            ((dL)this).cfr_renamed_5 = null;
            ((dL)this).cfr_renamed_4 = this.var_ei_case;
            ((dL)this).cfr_renamed_2 = this.var_ei_else;
        }
        GameCanvas.var_ef_0_do.cfr_renamed_3();
    }

    public static String java_lang_String_do(int n) {
        String string;
        String string2;
        String string3;
        int n2 = n % 60;
        int n3 = n / 60 % 60;
        n = n / 3600 % 24;
        StringBuffer stringBuffer = new StringBuffer();
        if (ThongTinNhanVat.boolean_do(n, 10)) {
            string3 = "0";
            if ((82 + 158 - 105 + 39 ^ 168 + 90 - 248 + 160) < 0) {
                return null;
            }
        } else {
            string3 = "";
        }
        String string4 = stringBuffer.append(string3).append(n).toString();
        StringBuffer stringBuffer2 = new StringBuffer();
        if (ThongTinNhanVat.boolean_do(n3, 10)) {
            string2 = "0";
            if (" ".length() > (0xBA ^ 0xBE)) {
                return null;
            }
        } else {
            string2 = "";
        }
        String string5 = stringBuffer2.append(string2).append(n3).toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        if (ThongTinNhanVat.boolean_do(n2, 10)) {
            string = "0";
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
        return string6 + "s";
    }

    private void cfr_renamed_10() {
        GameCanvas.cfr_renamed_5();
        GameCanvas.cfr_renamed_4();
        eq.eq_do().cfr_renamed_0(this.var_gx_int.java_lang_String_do().toLowerCase(), this.var_gx_if.java_lang_String_do().toLowerCase(), this.var_gx_do.java_lang_String_do());
        this.coKichHoat = 0;
        ((dL)this).cfr_renamed_5 = this.var_ei_if;
        GameCanvas.var_gj_0_do.cfr_renamed_0(this);
    }

    public ThongTinNhanVat() {
        int n;
        this.var_gx_if = new gx();
        this.var_gx_for = new gx();
        this.var_gx_do = new gx();
        this.var_boolean_case = 1;
        this.coKichHoat = 0;
        String[] stringArray = new String[3];
        stringArray[0] = "Chơi mới";
        stringArray[1] = "Chơi tiếp";
        stringArray[2] = "Đổi tài khoản";
        this.var_java_lang_String_arr_do = stringArray;
        this.var_java_lang_String_new = "";
        this.var_java_lang_String_int = "";
        this.cfr_renamed_12();
        this.var_gx_int.cfr_renamed_0(1);
        this.var_gx_int.void_do(0);
        this.var_gx_if.void_do(2);
        this.var_gx_for.void_do(2);
        this.var_gx_do.void_do(0);
        this.var_gx_do.chuoiGiaTri = "Tùy chọn";
        this.cfr_renamed_14 = 0;
        this.var_long_int = 0L;
        if (!(TienIchGame.boolean_int())) {
            n = 1;
            if (((69 + 53 - 121 + 136 ^ 43 + 23 - -126 + 2) & (152 + 110 - 68 + 16 ^ 147 + 148 - 275 + 133 ^ -" ".length())) != 0) {
                throw null;
            }
        } else {
            n = 0;
        }
        this.var_boolean_try = n;
        this.var_long_for = 0L;
        this.chuoiPhu = null;
        if ((gc_0.java_lang_String_do(gc_0.chuoiGiaTri) == null)) {
            ci_0.cfr_renamed_4();
        }
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    private static void this() {
        mangSoNguyen = new int[41];
        54 = 87 + 115 - 109 + 148 ^ 77 + 164 - 199 + 157;
        -1 = -" ".length();
        1 = " ".length();
        2 = "  ".length();
        0 = (158 + 105 - 233 + 139 ^ 79 + 102 - 136 + 93) & (0x32 ^ 6 ^ (0xD5 ^ 0xC2) ^ -" ".length());
        3 = "   ".length();
        60 = 0x8D ^ 0x83 ^ (0x62 ^ 0x50);
        3600 = -(0xFFFFFDBF & 0x13ED) & (0xFFFF9FBD & 0x7FFE);
        24 = 0x94 ^ 0x8C;
        10 = 0x50 ^ 0x5A;
        -50 = -(0x26 ^ 0x51 ^ (0x6A ^ 0x2F));
        26 = 0x59 ^ 0x5E ^ (0x32 ^ 0x2F);
        30 = 0x6D ^ 0x73;
        200 = 156 + 42 - 150 + 152;
        104 = 0x5E ^ 0x16 ^ (0x69 ^ 0x49);
        105 = 0xB1 ^ 0x87 ^ (0x6D ^ 0x32);
        106 = 0x62 ^ 8;
        80 = 9 ^ 0x59;
        65 = 88 + 84 - 49 + 11 ^ 189 + 169 - 296 + 137;
        70 = 0x18 ^ 0x5E;
        99 = 0x4B ^ 0x28;
        29 = 0xA0 ^ 0xBD;
        128 = (0xF9 ^ 0xBE) + (8 ^ 0x69) - (0x2C ^ 0x5C) + (0xC2 ^ 0x8A);
        20 = 0x47 ^ 0x53;
        40 = 0xB6 ^ 0x9E;
        55 = 0xCD ^ 0xBF ^ (0xFF ^ 0xBA);
        100 = 140 + 52 - 135 + 108 ^ 130 + 91 - 33 + 5;
        5 = 0x73 ^ 0x76;
        4 = 0x72 ^ 0x55 ^ (0x7C ^ 0x5F);
        7 = 0x3F ^ 0x38;
        47 = 0x44 ^ 0x13 ^ (0x2C ^ 0x54);
        45 = 0x41 ^ 0x27 ^ (0xE7 ^ 0xAC);
        46 = 6 ^ 0x28;
        9 = 0x5C ^ 0x55;
        102 = 0x38 ^ 0x5E;
        51 = 0x11 ^ 0x22;
        52 = 109 + 147 - 209 + 104 ^ 136 + 126 - 161 + 62;
        53 = 0xA ^ 0x3F;
        8 = 5 + 137 - 60 + 91 ^ 158 + 130 - 126 + 3;
        50 = 0x9D ^ 0xAF;
        -12 = -(0x6F ^ 0x63);
    }

    private static boolean boolean_if(int n) {
        return n >= 0;
    }

        public final void a_() {
        this.var_ei_do = new ei(MenuChinhAvatar.Z, 0);
        this.var_ei_char = new ei(MenuChinhAvatar.cfr_renamed_9, 3);
        this.var_ei_if = new ei(MenuChinhAvatar.dg, 1);
        this.var_ei_byte = new ei(MenuChinhAvatar.G, 2);
        this.var_ei_for = new ei(MenuChinhAvatar.dg, 104);
        this.var_ei_else = new ei(MenuChinhAvatar.aY, 105);
        this.var_ei_case = new ei(MenuChinhAvatar.var_java_lang_String_byte, 106);
        ((dL)this).cfr_renamed_4 = this.var_ei_do;
    }

        public final void cfr_renamed_4() {
        System.currentTimeMillis();
        ap.void_do(MenuChinhAvatar.cfr_renamed_27);
        ap.cfr_renamed_0();
        this.cfr_renamed_23 = -50;
        try {
            GameCanvas.var_ef_0_do.void_do(26);
            }
        catch (Exception exception) {
            }
        if (" ".length() != " ".length()) {
            return;
        }
        int n = ef_0.var_short_if * 24 / 2 + 30;
        AngelChip.duLieuNguoiChoi.var_short_else = (short)n;
        AngelChip.duLieuNguoiChoi.coKichHoat = n;
        ek_0.ek_0_do().soLuong = ek_0.ek_0_do().var_int_if = 200;
        this.var_gx_int.cfr_renamed_0(1);
        this.var_gx_if.cfr_renamed_0(0);
        this.cfr_renamed_14 = 0;
        this.var_gx_int.cfr_renamed_0(1);
    }

    private static boolean boolean_if(int n, int n2) {
        return n <= n2;
    }

    public final void (String string == String string2) {
        this.var_java_lang_String_new = string;
        this.var_java_lang_String_int = string2;
        this.var_gx_int.cfr_renamed_0("");
        this.var_gx_if.cfr_renamed_0("");
        var_boolean_int = 1;
        dangChayAuto = 0;
        this.cfr_renamed_5();
    }

    private static void cfr_renamed_16() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.da, 51));
        vector.addElement(new ei(MenuChinhAvatar.bG, 52));
        vector.addElement(new ei(MenuChinhAvatar.bO, 53));
        GameCanvas.hienThongBaoPopup(MenuChinhAvatar.bf, vector);
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 0: {
                this.coKichHoat = 1;
                GameCanvas.var_gj_0_do.cfr_renamed_0(this);
                return;
            }
            case 1: {
                this.coKichHoat = 0;
                GameCanvas.var_gj_0_do.cfr_renamed_0(this);
                return;
            }
            case 2: {
                GameCanvas.void_do(MenuChinhAvatar.var_java_lang_String_class, 54);
                return;
            }
            case 3: {
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.db, 55, null);
                return;
            }
            case 4: {
                GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_int, 100, 3);
                return;
            }
            case 44: {
                Vector<ei> vector = new Vector<ei>();
                if (!(az.var_fs_0_do.var_java_util_Vector_do.isEmpty())) {
                    Enumeration enumeration = az.var_fs_0_do.java_util_Enumeration_do();
                    while (ThongTinNhanVat.boolean_do(enumeration.hasMoreElements() ? 1 : 0)) {
                        Object object = (String)enumeration.nextElement();
                        object = (az)az.var_fs_0_do.java_lang_Object_do(object);
                        vector.addElement(new ei(((az)object).cfr_renamed_1, new az(((az)object).cfr_renamed_1, ((az)object).chuoiGiaTri)));
                        if ("  ".length() >= " ".length()) continue;
                        return;
                    }
                }
                if (ThongTinNhanVat.boolean_do(vector.isEmpty() ? 1 : 0)) {
                    GameCanvas.hienThongBaoPopup("Hiện chưa có tài khoản nào được lưu!");
                    return;
                }
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 45: {
                String string = this.var_gx_int.java_lang_String_do();
                String string2 = this.var_gx_if.java_lang_String_do();
                String string3 = string.trim().toLowerCase();
                if (!!(string3.equals("")) || ThongTinNhanVat.boolean_do(string2.equals("") ? 1 : 0)) {
                    GameCanvas.hienThongBaoPopup("Bạn chưa nhập tài khoản hoặc mật khẩu!");
                    return;
                }
                if (!(az.var_fs_0_do.boolean_do(string3))) {
                    az.az_do();
                    az.cfr_renamed_0(string, string2);
                    GameCanvas.hienThongBaoPopup("Thêm tài khoản (" + string + ") thành công!");
                    return;
                }
                az az2 = (az)az.var_fs_0_do.java_lang_Object_do(string3);
                if ((az2 != null) && ThongTinNhanVat.boolean_do(az2.chuoiGiaTri.equals(string2) ? 1 : 0)) {
                    GameCanvas.hienThongBaoPopup("Tài khoản (" + az2.cfr_renamed_1 + ") đã tồn tại!");
                    return;
                }
                az.var_fs_0_do.cfr_renamed_0(string3, string3, new az(string, string2));
                az.az_do();
                az.void_if();
                GameCanvas.hienThongBaoPopup("Sửa tài khoản (" + string + ") thành công!");
                return;
            }
            case 46: {
                ThongTinNhanVat.cfr_renamed_18();
                return;
            }
            case 47: {
                AutoController.tatAuto();
                if (ThongTinNhanVat.boolean_do(gW.cfr_renamed_1 ? 1 : 0)) {
                    gW.cfr_renamed_3 = 1;
                }
                gW.dangChayAuto = 0;
                return;
            }
            case 5: {
                ey_0.cfr_renamed_0().cfr_renamed_8();
                return;
            }
            case 6: {
                AngelChip.cfr_renamed_0("http://wap.teamobi.com/faqs.php?provider=" + AngelChip.var_byte_do);
                return;
            }
            case 7: {
                AngelChip.cfr_renamed_0("http://wap.teamobi.com?info=checkupdate&game=8&version=2.5.8&provider=" + AngelChip.var_byte_do + "&agent=" + AngelChip.cfr_renamed_3);
                return;
            }
            case 8: {
                if (!(this.var_java_lang_String_try.equals(""))) {
                    AngelChip.cfr_renamed_0("tel:" + this.var_java_lang_String_try);
                    return;
                }
                if (!(i_0.i_0_do().coTrangThai)) {
                    GameCanvas.cfr_renamed_4(MenuChinhAvatar.cfr_renamed_26);
                    GameCanvas.cfr_renamed_4();
                    if (-" ".length() >= (0x53 ^ 0x58 ^ (0xB6 ^ 0xB9))) {
                        return;
                    }
                } else {
                    GameCanvas.cfr_renamed_5();
                }
                eq.eq_do().cfr_renamed_0(5, (String)null);
                return;
            }
            case 9: {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.cs + MenuChinhAvatar.bY);
                ci_0.void_do();
            }
        }
    }

    public final void (Graphics graphics != null) {
        this.cfr_renamed_1(graphics);
        super.cfr_renamed_0(graphics);
    }

                        private void cfr_renamed_6() {
        if (!(this.var_boolean_case)) {
            this.var_boolean_case = 1;
            this.var_ei_byte.chuoiGiaTri = MenuChinhAvatar.var_java_lang_String_long;
            return;
        }
        this.var_boolean_case = 0;
        this.var_ei_byte.chuoiGiaTri = MenuChinhAvatar.G;
    }

    private void cfr_renamed_17() {
        switch (this.var_byte_if) {
            case 0: {
                if ((this.var_java_lang_String_arr_do.length == 2)) {
                    new i().void_do();
                    return;
                }
                if (ThongTinNhanVat.boolean_do(var_boolean_int ? 1 : 0)) {
                    gE.gE_do().cfr_renamed_8();
                    return;
                }
                String string = this.var_gx_int.java_lang_String_do().toLowerCase().trim();
                String string2 = this.var_gx_if.java_lang_String_do();
                if (!(string.equals(""))) {
                    if (ThongTinNhanVat.boolean_do(string2.equals("") ? 1 : 0)) {
                        this.cfr_renamed_14 = 1;
                        this.var_gx_int.cfr_renamed_0(0);
                        this.var_gx_if.cfr_renamed_0(1);
                        return;
                    }
                    gE.gE_do().cfr_renamed_8();
                }
                return;
            }
            case 1: {
                if ((this.var_java_lang_String_arr_do.length != 2)) {
                    i i2 = new i();
                    if (!(this.var_java_lang_String_new.equals("")) && ThongTinNhanVat.boolean_do(this.var_gx_int.java_lang_String_do().equals("") ? 1 : 0)) {
                        GameCanvas.hienThongBaoPopup("Tài khoản của bạn chưa được đăng kí liên kết với một tài khoản Team. Bạn sẽ mất tài khoản đang chơi nếu tiếp tục. Bạn có muốn tiếp tục ?", i2);
                        return;
                    }
                    i2.void_do();
                    return;
                }
            }
            case 2: {
                ThongTinNhanVat gO2 = this;
                fv_0 fv_02 = new fv_0(gO2);
                if (!(gO2.var_java_lang_String_new.equals("")) && ThongTinNhanVat.boolean_do(gO2.var_gx_int.java_lang_String_do().equals("") ? 1 : 0)) {
                    GameCanvas.hienThongBaoPopup("Tài khoản của bạn chưa được đăng kí liên kết với một tài khoản Team. Bạn sẽ mất tài khoản đang chơi nếu tiếp tục. Bạn có muốn tiếp tục ?", fv_02);
                    return;
                }
                fv_02.void_do();
            }
        }
    }

    public final void cfr_renamed_8() {
        this.a_();
        super.cfr_renamed_8();
        GameCanvas.cfr_renamed_8();
        if (ThongTinNhanVat.boolean_do(GameCanvas.coTrangThai ? 1 : 0)) {
            this.var_byte_if = (byte)-1;
        }
        dangChayAuto = 1;
        ((dL)this).cfr_renamed_5 = this.var_ei_for;
        if (ThongTinNhanVat.boolean_do(this.var_java_lang_String_new.equals("") ? 1 : 0) && ThongTinNhanVat.boolean_do(this.var_gx_int.java_lang_String_do().equals("") ? 1 : 0)) {
            String[] stringArray = new String[2];
            stringArray[0] = "Chơi mới";
            stringArray[1] = "Đổi tài khoản";
            this.var_java_lang_String_arr_do = stringArray;
            } else {
            String string;
            String[] stringArray = new String[3];
            int n = 0;
            StringBuffer stringBuffer = new StringBuffer().append("Chơi tiếp");
            if (ThongTinNhanVat.cfr_renamed_5(this.var_gx_int.java_lang_String_do().equals("") ? 1 : 0)) {
                string = ", " + this.var_gx_int.java_lang_String_do();
                if (((0xDC ^ 0xC6) & ~(0x6F ^ 0x75)) != 0) {
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
        gt_0.soXu = 0L;
        if (!(this.var_boolean_try)) {
            this.chuoiPhu = TienIchGame.aq_0_do().java_lang_String_do();
            this.var_long_for = System.currentTimeMillis();
        }
        TienIchGame.void_for();
        if (ThongTinNhanVat.boolean_do(cd.dangChayAuto ? 1 : 0) && (GameCanvas.var_bt_0_do == null)) {
            GameCanvas.cfr_renamed_5();
        }
    }

    public final void void_do(int n) {
        if (!(cd.dangChayAuto) && (TienIchGame.tenNhanVat != null)) {
            if (ThongTinNhanVat.boolean_do(this.var_gx_int.boolean_do() ? 1 : 0)) {
                this.var_gx_int.boolean_do(n);
                if (" ".length() == 0) {
                    return;
                }
            } else if (ThongTinNhanVat.boolean_do(this.var_gx_if.boolean_do() ? 1 : 0)) {
                this.var_gx_if.boolean_do(n);
                if (" ".length() < 0) {
                    return;
                }
            } else if (ThongTinNhanVat.boolean_do(this.var_gx_for.boolean_do() ? 1 : 0)) {
                this.var_gx_for.boolean_do(n);
                if (-(0x93 ^ 0x97) >= 0) {
                    return;
                }
            } else if (ThongTinNhanVat.boolean_do(this.var_gx_do.boolean_do() ? 1 : 0)) {
                this.var_gx_do.boolean_do(n);
                }
        }
        super.void_do(n);
    }

    public final void (Graphics graphics == null) {
        try {
            GameCanvas.var_ef_0_do.cfr_renamed_4(graphics);
            }
        catch (Exception exception) {
            }
        if ("  ".length() != "  ".length()) {
            return;
        }
        GameCanvas.var_ef_0_do.cfr_renamed_1(graphics);
        GameCanvas.cfr_renamed_1(graphics);
        if (!(cd.dangChayAuto) && (TienIchGame.tenNhanVat != null)) {
            long l;
            int n;
            if (ThongTinNhanVat.boolean_do(dangChayAuto ? 1 : 0)) {
                Graphics graphics2 = graphics;
                ThongTinNhanVat gO2 = this;
                GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.var_int_case, this.var_int_int, this.var_int_byte, this.soLuongKhoa, 0);
                graphics.translate(this.var_int_case, this.var_int_int + this.soLuong);
                if ((this.var_byte_if != -1)) {
                    GameCanvas.var_gj_0_do.cfr_renamed_1(graphics, 5 * bn_0.cfr_renamed_6, this.var_byte_if * this.var_int_else, this.var_int_byte - 10 * bn_0.cfr_renamed_6, this.var_int_else);
                }
                n = 0;
                while (ThongTinNhanVat.boolean_do(n, gO2.var_java_lang_String_arr_do.length)) {
                    GameCanvas.var_ew_try.cfr_renamed_0(graphics2, gO2.var_java_lang_String_arr_do[n], gO2.var_int_byte / 2, n * gO2.var_int_else + gO2.var_int_else / 2 - GameCanvas.var_ew_try.int_do() / 2, 2);
                    ++n;
                    if (-" ".length() == -" ".length()) continue;
                    return;
                }
                if (-" ".length() > "  ".length()) {
                    return;
                }
            } else if ((GameCanvas.var_bt_0_do == null) && (this == GameCanvas.var_dL_do)) {
                GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.var_int_case, this.var_int_int, this.var_int_byte, this.soLuongKhoa, 0);
                graphics.setClip(this.var_int_case + 4, this.var_int_int + 4, this.var_int_byte - 8, this.soLuongKhoa - 8);
                if (!(this.var_java_lang_String_try.equals("")) && (ey_0.cfr_renamed_0().mangSoNguyen[4] == 0)) {
                    GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, "Hotline: " + this.var_java_lang_String_try, this.var_int_case + this.var_int_byte - 8, this.var_int_int + this.soLuongKhoa - bn_0.var_byte_new - 4, 1);
                }
                this.var_gx_int.cfr_renamed_0(graphics);
                graphics.setClip(this.var_int_case + 4, this.var_int_int + 4, this.var_int_byte - 8, this.soLuongKhoa - 8);
                n = GameCanvas.var_ew_try.cfr_renamed_0(MenuChinhAvatar.ab + ":");
                if (ThongTinNhanVat.boolean_do(n, this.var_gx_int.var_int_new - this.var_int_case)) {
                    n = (this.var_gx_int.var_int_new - this.var_int_case - n) / 2 + bn_0.cfr_renamed_16;
                    } else {
                    n = this.var_gx_int.var_int_new - n - 5;
                }
                GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, MenuChinhAvatar.ab, this.var_int_case + n, this.var_gx_int.soLuongKhoa + this.var_gx_int.var_int_int / 2 - bn_0.var_byte_new / 2, 0);
                GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, MenuChinhAvatar.aS + ":", this.var_int_case + n, this.var_gx_if.soLuongKhoa + this.var_gx_int.var_int_int / 2 - bn_0.var_byte_new / 2, 0);
                if (!(this.coKichHoat)) {
                    GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.var_int_new, this.cfr_renamed_18, this.cfr_renamed_14, this.var_boolean_case);
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                } else {
                    GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, MenuChinhAvatar.MenuChinhAvatar, this.var_int_case + n, this.var_gx_for.soLuongKhoa + this.var_gx_int.var_int_int / 2 - bn_0.var_byte_new, 0);
                    GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, MenuChinhAvatar.aS + ":", this.var_int_case + n, this.var_gx_for.soLuongKhoa + this.var_gx_int.var_int_int / 2, 0);
                    GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, "Số di động", this.var_int_case + n, this.var_gx_do.soLuongKhoa + this.var_gx_int.var_int_int / 2 - bn_0.var_byte_new, 0);
                    GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, "hoặc email:", this.var_int_case + n, this.var_gx_do.soLuongKhoa + this.var_gx_int.var_int_int / 2, 0);
                    this.var_gx_for.cfr_renamed_0(graphics);
                    this.var_gx_do.cfr_renamed_0(graphics);
                }
                this.var_gx_if.cfr_renamed_0(graphics);
            }
            if (ThongTinNhanVat.boolean_do(gW.dangChayAuto ? 1 : 0) && ((this.var_long_if, 0L == null) > 0) && ThongTinNhanVat.cfr_renamed_4(n = (int)((this.soXu - (l = System.currentTimeMillis() - this.var_long_if)) / 1000L))) {
                GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Đăng nhập lại sau: " + ThongTinNhanVat.java_lang_String_do(n), this.var_int_byte / 2, 3 * this.var_int_else + this.var_int_else / 2 - GameCanvas.var_ew_try.int_do() / 2 + 5, 2);
            }
            GameCanvas.cfr_renamed_1(graphics);
            graphics.drawImage(dL.cfr_renamed_5, GameCanvas.var_int_int, this.cfr_renamed_23, 3);
            return;
        }
        if ((bl_0.var_javax_microedition_lcdui_Image_do != null)) {
            graphics.drawImage(bl_0.var_javax_microedition_lcdui_Image_do, GameCanvas.var_int_int, GameCanvas.var_int_long - 50, 3);
        }
    }

        public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                Vector<ei> vector = new Vector<ei>();
                ei ei2 = new ei(MenuChinhAvatar.aY, 2);
                if (!!(gW.dangChayAuto) || ThongTinNhanVat.boolean_do(gW.cfr_renamed_1 ? 1 : 0)) {
                    vector.addElement(new ei("Tắt Auto", 47));
                    if ("   ".length() < 0) {
                        return;
                    }
                } else {
                    if (ThongTinNhanVat.cfr_renamed_5(this.var_gx_int.java_lang_String_do().equals("") ? 1 : 0) && ThongTinNhanVat.cfr_renamed_5(this.var_gx_if.java_lang_String_do().equals("") ? 1 : 0)) {
                        vector.addElement(new ei("Lưu TK hiện tại", 45));
                    }
                    vector.addElement(new ei("Chuyển TK", new cy_0()));
                    vector.addElement(new ei("Quản lý TK", 46));
                }
                vector.addElement(new ei("Kiểu gõ TV", 47, fe_0.fe_0_do()));
                vector.addElement(new ei(MenuChinhAvatar.aG, 4));
                vector.addElement(new ei(MenuChinhAvatar.bN, 5));
                vector.addElement(new ei(MenuChinhAvatar.bY, 9));
                vector.addElement(ei2);
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 1: {
                String string;
                dangChayAuto = 1;
                ((dL)this).cfr_renamed_4 = this.var_ei_do;
                ((dL)this).cfr_renamed_5 = this.var_ei_for;
                this.var_byte_if = (byte)0;
                String[] stringArray = new String[3];
                int n3 = 0;
                StringBuffer stringBuffer = new StringBuffer().append("Chơi tiếp");
                if (ThongTinNhanVat.cfr_renamed_5(this.var_gx_int.java_lang_String_do().equals("") ? 1 : 0)) {
                    string = ", " + this.var_gx_int.java_lang_String_do();
                    if (-" ".length() > (15 + 92 - 78 + 111 ^ 120 + 70 - 131 + 77)) {
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
                this.cfr_renamed_6();
                return;
            }
            case 3: {
                if (ThongTinNhanVat.boolean_do(this.var_gx_int.java_lang_String_do().equals("") ? 1 : 0)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_class[0]);
                    return;
                }
                if (ThongTinNhanVat.boolean_do(this.var_gx_if.java_lang_String_do().equals("") ? 1 : 0)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_class[1]);
                    return;
                }
                if (ThongTinNhanVat.boolean_do(this.var_gx_for.java_lang_String_do().equals("") ? 1 : 0)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_class[2]);
                    return;
                }
                if (ThongTinNhanVat.cfr_renamed_5(this.var_gx_if.java_lang_String_do().equals(this.var_gx_for.java_lang_String_do()) ? 1 : 0)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_class[3]);
                    return;
                }
                GameCanvas.cfr_renamed_8();
                System.currentTimeMillis();
                if (ThongTinNhanVat.boolean_do(this.var_gx_do.java_lang_String_do().equals("") ? 1 : 0)) {
                    ThongTinNhanVat.cfr_renamed_16();
                    return;
                }
                GameCanvas.void_do("Bạn nên điền chính xác số di động hoặc email. Khi quên mật khẩu, bạn sẽ dùng nó để lấy lại. Bạn có chắc chắn đã điền số di động / email đúng chưa?", 102);
                return;
            }
            case 50: {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.x);
                return;
            }
            case 51: {
                this.cfr_renamed_10();
                return;
            }
            case 52: {
                return;
            }
            case 53: {
                AngelChip.cfr_renamed_0("http://teamobi.com/dieukhoan.htm");
                return;
            }
            case 54: {
                AngelChip.cfr_renamed_0();
                return;
            }
            case 55: {
                coTrangThai = 0;
                this.cfr_renamed_1();
                ci_0.void_do("avatarSV");
                AngelChip.cfr_renamed_0();
                return;
            }
            case 100: {
                String string = GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do();
                if (ThongTinNhanVat.boolean_do(string.equals("") ? 1 : 0)) {
                    return;
                }
                new ck_0(string).void_do();
                return;
            }
            case 101: {
                this.cfr_renamed_10();
                return;
            }
            case 102: {
                ThongTinNhanVat.cfr_renamed_16();
                return;
            }
            case 103: {
                return;
            }
            case 104: {
                this.cfr_renamed_17();
                return;
            }
            case 105: {
                TienIchGame.aq_0_do();
                TienIchGame.void_if();
                AngelChip.cfr_renamed_0();
                return;
            }
            case 106: {
                TienIchGame.aq_0_do();
                TienIchGame.void_if();
                if ((this.tenNhanVat != null)) {
                    new az_0(this.tenNhanVat).cfr_renamed_0();
                    return;
                }
                new az_0(bl_0.java_lang_String_do(3)).cfr_renamed_0();
            }
        }
    }

    public static ThongTinNhanVat cfr_renamed_0() {
        if ((instance == null)) {
            instance = new ThongTinNhanVat();
        }
        return instance;
    }

    public final void cfr_renamed_2() {
        GameCanvas.void_do(MenuChinhAvatar.var_java_lang_String_class, 54);
    }

    public final void cfr_renamed_5() {
        GameCanvas.cfr_renamed_4();
        eq.eq_do().cfr_renamed_16(ThongTinNhanVat.cfr_renamed_0().var_java_lang_String_try.hashCode());
        if (!(ThongTinNhanVat.boolean_do(dangChayAuto ? 1 : 0) && ((this.var_byte_if == 0) && !(this.var_java_lang_String_arr_do.length != 2) || (this.var_byte_if == 1) && !(this.var_java_lang_String_arr_do.length != 3)))) {
            if (ThongTinNhanVat.boolean_do(this.var_gx_int.java_lang_String_do().equals("") ? 1 : 0)) {
                eq.eq_do().cfr_renamed_1(this.var_java_lang_String_new, this.var_java_lang_String_int, "2.5.8");
                var_boolean_int = 1;
                return;
            }
            var_boolean_int = 0;
            this.var_java_lang_String_new = "";
            this.var_java_lang_String_int = "";
            eq.eq_do().cfr_renamed_1(this.var_gx_int.java_lang_String_do().toLowerCase(), this.var_gx_if.java_lang_String_do(), "2.5.8");
            return;
        }
        eq eq2 = eq.eq_do();
        eq2.cfr_renamed_0(-12);
        eq2.cfr_renamed_1();
    }

    static {
        ThongTinNhanVat.this();
        var_int_if = 0;
        coTrangThai = 0;
        var_byte_do = (byte)0;
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void cfr_renamed_12() {
        if ((GameCanvas.var_int_char > 200)) {
            this.cfr_renamed_10 = GameCanvas.var_int_long - 80;
            if (-" ".length() >= 0) {
                return;
            }
        } else {
            this.cfr_renamed_10 = GameCanvas.var_int_long - 65;
        }
        this.cfr_renamed_23 = -50;
        this.var_int_char = GameCanvas.var_int_byte - 30;
        if (ThongTinNhanVat.boolean_do(this.var_int_char, 70)) {
            this.var_int_char = 70;
        }
        if ((this.var_int_char > 99)) {
            this.var_int_char = 99;
        }
        this.var_int_try = (GameCanvas.var_int_byte - this.var_int_char >> 1) + 29;
        if (ThongTinNhanVat.boolean_if(GameCanvas.var_int_byte, 128)) {
            this.var_int_char = 80;
            this.var_int_try = (GameCanvas.var_int_byte - this.var_int_char >> 1) + 20;
        }
        this.var_int_try -= (bn_0.cfr_renamed_6 - 1) * 40;
        GameCanvas.var_gj_0_do.cfr_renamed_0(this);
        this.cfr_renamed_23 = this.cfr_renamed_10 = this.var_int_int / 2;
        ek_0.ek_0_do().var_bk_0_do = AngelChip.duLieuNguoiChoi;
        ek_0.ek_0_do().cfr_renamed_1();
    }

    public final void (String string != null) {
        this.var_java_lang_String_try = string;
    }

    public final void cfr_renamed_11() {
        block6: {
            DataInputStream dataInputStream = ci_0.java_io_DataInputStream_do("avlogin");
            if (!(dataInputStream != null)) break block6;
            String string = "";
            try {
                string = dataInputStream.readUTF();
                this.cfr_renamed_17 = dataInputStream.readByte();
                this.var_java_lang_String_try = dataInputStream.readUTF();
                this.var_java_lang_String_new = dataInputStream.readUTF();
                this.var_java_lang_String_int = dataInputStream.readUTF();
                if (ThongTinNhanVat.boolean_do(this.var_boolean_case ? 1 : 0)) {
                    this.var_gx_int.cfr_renamed_0(dataInputStream.readUTF());
                    this.var_gx_if.cfr_renamed_0(dataInputStream.readUTF());
                }
                var_int_if = dataInputStream.readInt();
                coTrangThai = dataInputStream.readBoolean();
                var_boolean_int = dataInputStream.readBoolean();
                dataInputStream.close();
                }
            catch (Exception exception) {
                ci_0.void_do("avlogin");
            }
            if (-" ".length() >= 0) {
                return;
            }
            if (!(coTrangThai)) {
                ci_0.void_do("avatarSV");
            }
            if (!("2.5.8".equals(string))) {
                ci_0.void_do();
            }
        }
    }

            public static void cfr_renamed_18() {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei("Thêm hoặc sửa TK", new ax()));
        vector.addElement(new ei("Nhập từ file nội bộ", new az(1)));
        vector.addElement(new ei("Nhập từ file trên máy", new az(3)));
        if ((var_byte_do == 1)) {
            vector.addElement(new ei("Xuất ra file text", new az(4)));
        }
        vector.addElement(new ei("Xóa hết TK đã lưu", new az(5)));
        vector.addElement(new ei("Xóa rác dữ liệu TK", new az(7)));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }
}

