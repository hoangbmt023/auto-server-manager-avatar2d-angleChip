/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class fe
extends dL
implements fj_0 {
    private int[] mangSoNguyen;
    private Vector var_java_util_Vector_do;
    private Vector var_java_util_Vector_if;
    public static boolean dangChayAuto;
    private ei var_ei_do;
    private ei var_ei_if;
    private int cfr_renamed_4;
    private short var_short_do;
    public int soLuong;
    public int var_int_if;
    private int cfr_renamed_5;
    public byte var_byte_do;
    private int cfr_renamed_2;
    private static short var_short_if;
    private byte var_byte_if;
    private Image var_javax_microedition_lcdui_Image_do;
    private eq_0 var_eq_0_do;
    public int soLuongKhoa;
    private Vector var_java_util_Vector_for;
    private short[] var_short_arr_do;
    private int cfr_renamed_15;
    public static boolean coTrangThai;
    private int cfr_renamed_8;
    private int cfr_renamed_12;
    private static final int[] var_int_arr_if;
    private eq_0 var_eq_0_if;
    public static fe var_fe_do;
    private dR[] var_dR_arr_do;
    private int cfr_renamed_11;
    private ei var_ei_for;
    private int cfr_renamed_18 = var_int_arr_if[0];
    private gy_0 var_gy_0_do;
    private int cfr_renamed_10;
    private short var_short_for;

    public final void void_do(aU aU2) {
        if ((fe.boolean_if(aU2))) {
            aU2.cfr_renamed_1 = (short)(aU2.cfr_renamed_1 + var_int_arr_if[4]);
        }
        this.var_java_util_Vector_do.addElement(aU2);
        ef_0.var_java_util_Vector_new.addElement(aU2);
        this.cfr_renamed_3(aU2);
        ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_new);
        }

    public static fe fe_do() {
        if (fe.cfr_renamed_1((Object)var_fe_do)) {
            var_fe_do = new fe();
        }
        return var_fe_do;
    }

    public final void cfr_renamed_1() {
        if ((es.var_java_util_Vector_if == null)) {
            GameCanvas.cfr_renamed_5();
            cd_0.cd_0_do().cfr_renamed_2();
            es.var_byte_do = (byte)var_int_arr_if[1];
            return;
        }
        if ((es.dangChayAuto)) {
            es.dangChayAuto = var_int_arr_if[2];
            GameCanvas.cfr_renamed_5();
            db_0.db_0_do().cfr_renamed_15(var_int_arr_if[4]);
            return;
        }
        Vector<DuLieuNguoiChoi> vector = new Vector<DuLieuNguoiChoi>();
        int n = var_int_arr_if[2];
        while (fe.boolean_do(n, es.var_java_util_Vector_if.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)es.var_java_util_Vector_if.elementAt(n);
            if (fe.boolean_if(dd_02.var_byte_long, (int)this.var_byte_do)) {
                vector.addElement(dd_02);
            }
            ++n;
            if (" ".length() < (125 + 2 - 98 + 111 ^ 120 + 101 - 110 + 25)) continue;
            return;
        }
        if ((vector.isEmpty())) {
            if ((GameCanvas.var_dL_do == es.cfr_renamed_0())) {
                es.cfr_renamed_0().var_dL_do.cfr_renamed_8();
            }
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.de);
            return;
        }
        es.cfr_renamed_0().cfr_renamed_8();
        es.var_java_util_Vector_do = vector;
        es.cfr_renamed_0().cfr_renamed_5();
        es.cfr_renamed_0().cfr_renamed_1();
    }

    private void cfr_renamed_11() {
        this.soLuongKhoa = var_int_arr_if[0];
        this.cfr_renamed_18 = var_int_arr_if[0];
        coTrangThai = var_int_arr_if[2];
        dangChayAuto = var_int_arr_if[2];
        this.cfr_renamed_13();
        ((dL)this).cfr_renamed_2 = null;
        if ((ef_0.dd_0_do(AngelChip.duLieuNguoiChoi.var_short_char) == null)) {
            this.cfr_renamed_30();
        }
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    private void cfr_renamed_18() {
        this.cfr_renamed_10();
        if ((this.var_short_arr_do == null)) {
            this.var_short_arr_do = new short[ef_0.var_short_arr_do.length];
            int n = var_int_arr_if[2];
            while (fe.boolean_do(n, ef_0.var_short_arr_do.length)) {
                this.var_short_arr_do[n] = ef_0.var_short_arr_do[n];
                ++n;
                if (" ".length() >= 0) continue;
                return;
            }
        }
        dangChayAuto = var_int_arr_if[2];
        ((dL)this).cfr_renamed_5 = this.var_ei_if;
        ((dL)this).cfr_renamed_2 = this.var_ei_for;
        ((dL)this).cfr_renamed_4 = new ei(MenuChinhAvatar.dg, var_int_arr_if[12]);
        Vector<dp> vector = new Vector<dp>();
        int n = var_int_arr_if[2];
        while (fe.boolean_do(n, this.var_dR_arr_do.length)) {
            if (!fe.boolean_if(this.var_dR_arr_do[n].cfr_renamed_1, var_int_arr_if[0]) || (this.var_dR_arr_do[n].soLuong != var_int_arr_if[0])) {
                vector.addElement(new dp(this.var_dR_arr_do[n].chuoiGiaTri + "(" + GameCanvas.hienThongBaoPopup(this.var_dR_arr_do[n].cfr_renamed_1, this.var_dR_arr_do[n].soLuong, var_int_arr_if[4]) + ")", n, n));
            }
            ++n;
            if (-" ".length() >= -" ".length()) continue;
            return;
        }
        if ((vector.size() > 0)) {
            u_0.cfr_renamed_0().cfr_renamed_0(vector, GameCanvas.var_int_int, var_int_arr_if[13] * bn_0.cfr_renamed_6, var_int_arr_if[13] * bn_0.cfr_renamed_6);
        }
    }

    public final void (dR[] dRArray != null) {
        this.var_dR_arr_do = dRArray;
        this.cfr_renamed_18();
        GameCanvas.cfr_renamed_8();
    }

    private boolean (fi_0 fi_02 != null) {
        if ((fi_02.var_byte_do != var_int_arr_if[1]) && (fi_02.var_byte_do != var_int_arr_if[9])) {
            if ((ef_0.var_short_arr_if[this.cfr_renamed_5 * ef_0.var_short_if + this.cfr_renamed_4] != var_int_arr_if[16])) {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_case);
                return var_int_arr_if[4];
            }
            int n = var_int_arr_if[2];
            while (fe.boolean_do(n, fi_02.var_java_util_Vector_do.size())) {
                eq_0 eq_02 = (eq_0)fi_02.var_java_util_Vector_do.elementAt(n);
                if ((ef_0.var_short_arr_if[(this.cfr_renamed_5 + eq_02.soLuong) * ef_0.var_short_if + this.cfr_renamed_4 + eq_02.var_int_if] != var_int_arr_if[16])) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_case);
                    return var_int_arr_if[4];
                }
                ++n;
                if (" ".length() != (74 + 127 - 97 + 59 ^ 39 + 14 - 12 + 126)) continue;
                return ((90 + 106 - 107 + 42 ^ 45 + 3 - 46 + 138) & (18 + 71 - -2 + 47 ^ 39 + 105 - 71 + 60 ^ -" ".length())) != 0;
            }
            if (((0x41 ^ 0x6B) & ~(0x20 ^ 0xA)) != 0) {
                return ((0x35 ^ 0x6E) & ~(0x6A ^ 0x31)) != 0;
            }
        } else {
            String string = "";
            int n = var_int_arr_if[2];
            while (fe.boolean_do(n, this.var_java_util_Vector_do.size())) {
                aU aU2 = (aU)this.var_java_util_Vector_do.elementAt(n);
                if ((n != this.soLuongKhoa) && fe.boolean_if(aU2.cfr_renamed_1, (int)fi_02.cfr_renamed_3) && fe.boolean_if(this.cfr_renamed_4, aU2.cfr_renamed_3 / var_int_arr_if[10]) && fe.boolean_if(this.cfr_renamed_5, aU2.cfr_renamed_1 / var_int_arr_if[10])) {
                    string = MenuChinhAvatar.M;
                    if ((129 + 154 - 192 + 87 ^ 176 + 36 - 172 + 142) > 0) break;
                    return ((165 + 200 - 309 + 149 ^ 21 + 33 - -97 + 46) & (9 ^ 0x40 ^ (0xE8 ^ 0xA9) ^ -" ".length())) != 0;
                }
                ++n;
                if ("   ".length() != 0) continue;
                return ((0x46 ^ 0x54) & ~(0x76 ^ 0x64)) != 0;
            }
            if (fe.boolean_if(string.equals("") ? 1 : 0)) {
                GameCanvas.cfr_renamed_1(string);
                return var_int_arr_if[4];
            }
            if (!((fi_02.var_byte_do != var_int_arr_if[1]) && !fe.boolean_if(fi_02.var_byte_do, var_int_arr_if[9]) || (ef_0.var_short_arr_do[n = (this.cfr_renamed_5 - var_int_arr_if[4]) * ef_0.var_short_if + this.cfr_renamed_4] >=  (int)var_short_if) && !(ef_0.var_short_arr_do[this.cfr_renamed_5 * ef_0.var_short_if + this.cfr_renamed_4] >=  (int)var_short_if))) {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_43);
                return var_int_arr_if[4];
            }
        }
        return var_int_arr_if[2];
    }

    private void (Graphics graphics, int n, int n2, int n3, int n4 != null) {
        graphics.setColor(this.mangSoNguyen[n3]);
        graphics.drawRect(n * bn_0.cfr_renamed_6, n2 * bn_0.cfr_renamed_6, (n4 - var_int_arr_if[4]) * bn_0.cfr_renamed_6, (n4 - var_int_arr_if[4]) * bn_0.cfr_renamed_6);
    }

    static {
        fe.cfr_renamed_16();
        var_short_if = (short)var_int_arr_if[2];
        dangChayAuto = var_int_arr_if[2];
        coTrangThai = var_int_arr_if[2];
    }

    static void void_do(fe fe2) {
        fe2.cfr_renamed_10();
    }

    public final void (Vector object, Vector object2, int n, byte by2 != null) {
        this.var_java_util_Vector_for = object;
        this.var_java_util_Vector_if = object2;
        this.cfr_renamed_12 = n;
        this.var_byte_if = by2;
        fe_0.fe_0_do();
        Vector vector = fe_0.cfr_renamed_0((Vector)object, AngelChip.duLieuNguoiChoi.var_short_char, var_int_arr_if[8]);
        fe_0.fe_0_do();
        object2 = fe_0.cfr_renamed_0((Vector)object2, AngelChip.duLieuNguoiChoi.var_short_char, var_int_arr_if[1]);
        if ((GameCanvas.var_dL_do != ec.var_ec_do)) {
            em_0.em_0_do().coTrangThai = var_int_arr_if[4];
            String[] stringArray = new String[var_int_arr_if[1]];
            stringArray[fe.var_int_arr_if[2]] = MenuChinhAvatar.cY;
            stringArray[fe.var_int_arr_if[4]] = MenuChinhAvatar.bF;
            Vector[] vectorArray = new Vector[var_int_arr_if[1]];
            vectorArray[fe.var_int_arr_if[2]] = vector;
            vectorArray[fe.var_int_arr_if[4]] = object2;
            em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, null);
            object = fe_0.fe_0_do().cfr_renamed_0((Vector)object, var_int_arr_if[4], var_int_arr_if[4], var_int_arr_if[2]);
            object2 = new ei(MenuChinhAvatar.Z, new gf());
            em_0.em_0_do().cfr_renamed_0((ei)object, var_int_arr_if[2]);
            em_0.em_0_do().cfr_renamed_0((ei)object2, var_int_arr_if[4]);
            if ((GameCanvas.var_dL_do != em_0.em_0_do())) {
                em_0.em_0_do().cfr_renamed_8();
            }
        }
    }

    private void (String string != null) {
        this.cfr_renamed_11();
        Vector<dm> vector = new Vector<dm>();
        int n = var_int_arr_if[2];
        while (fe.boolean_do(n, ci_0.var_java_util_Vector_for.size())) {
            fi_0 fi_02 = (fi_0)ci_0.var_java_util_Vector_for.elementAt(n);
            int n2 = fi_02.chuoiGiaTri.indexOf(string);
            if ((fi_02.var_byte_do != 0) && (n2 != var_int_arr_if[0]) && ((this.var_byte_do != var_int_arr_if[9]) && (!(fi_02.var_byte_do != var_int_arr_if[4]) || !(fi_02.var_byte_do != var_int_arr_if[1])) || fe.boolean_if(this.var_byte_do, var_int_arr_if[9]))) {
                String string2 = fi_02.chuoiGiaTri.substring(fi_02.chuoiGiaTri.indexOf(":") + var_int_arr_if[4]);
                String string3 = GameCanvas.hienThongBaoPopup(fi_02.soLuong, (int)fi_02.cfr_renamed_5, var_int_arr_if[4]);
                vector.addElement(new dm("", new ah_0(this, n, string), fi_02, string3, string2));
            }
            ++n;
            if (((0x64 ^ 0x5B) & ~(0x34 ^ 0xB)) >= 0) continue;
            return;
        }
        if ((vector.size() > 0)) {
            u_0.cfr_renamed_0().cfr_renamed_0(vector, GameCanvas.var_int_int, var_int_arr_if[15], var_int_arr_if[15]);
            u_0.var_cp_do = new dj(this);
        }
    }

    public final void cfr_renamed_8() {
        super.cfr_renamed_8();
        this.cfr_renamed_13();
    }

        private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

    static boolean boolean_do(aU aU2) {
        return fe.boolean_if(aU2);
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    public final void (Graphics graphics != null) {
        this.cfr_renamed_1(graphics);
        super.cfr_renamed_0(graphics);
    }

    static void (fe fe2 != int n) {
        fe2.cfr_renamed_8 = n;
    }

    private void cfr_renamed_10() {
        gj.cfr_renamed_0();
        this.cfr_renamed_4 = AngelChip.duLieuNguoiChoi.coKichHoat / var_int_arr_if[10];
        this.cfr_renamed_5 = AngelChip.duLieuNguoiChoi.var_short_if / var_int_arr_if[10];
        ef_0.cfr_renamed_3(AngelChip.duLieuNguoiChoi);
    }

    /*
     * WARNING - void declaration
     */
    public final void (boolean bl != String string) {
        if (fe.boolean_if(bl ? 1 : 0)) {
            void n;
            GameCanvas.cfr_renamed_1((String)n);
            return;
        }
        int ef2 = em_0.soLuongKhoa;
        int n = em_0.var_int_if;
        if (fe.boolean_if(ef2)) {
            ef ef3 = (ef)this.var_java_util_Vector_for.elementAt(n);
            this.var_java_util_Vector_if.addElement(ef3);
            this.var_java_util_Vector_for.removeElement(ef3);
            if ((0x9C ^ 0x98) <= -" ".length()) {
                return;
            }
        } else {
            ef ef3 = (ef)this.var_java_util_Vector_if.elementAt(n);
            this.var_java_util_Vector_for.addElement(ef3);
            this.var_java_util_Vector_if.removeElement(ef3);
            }
        this.cfr_renamed_12();
        GameCanvas.cfr_renamed_8();
    }

    static eq_0 eq_0_do(fe fe2) {
        return fe2.var_eq_0_do;
    }

    private gy_0 gy_0_do() {
        DataInputStream dataInputStream = ci_0.java_io_DataInputStream_do("avatarTileMap");
        if ((dataInputStream == null)) {
            return null;
        }
        this.var_gy_0_do = new gy_0();
        try {
            this.var_gy_0_do.var_short_do = dataInputStream.readShort();
            var_short_if = dataInputStream.readShort();
            byte[] byArray = new byte[dataInputStream.available()];
            dataInputStream.read(byArray);
            this.var_gy_0_do.var_javax_microedition_lcdui_Image_do = gc_0.javax_microedition_lcdui_Image_do(byArray);
            dataInputStream.close();
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if ("  ".length() < 0) {
            return null;
        }
        return this.var_gy_0_do;
    }

    static int int_do(fe fe2) {
        return fe2.cfr_renamed_5;
    }

    public final void (short s2 != String string) {
        GameCanvas.cfr_renamed_8();
        if (fe.boolean_if(s2)) {
            Vector<ei> vector = new Vector<ei>();
            vector.addElement(new ei(MenuChinhAvatar.cfr_renamed_28, var_int_arr_if[31]));
            vector.addElement(new ei(MenuChinhAvatar.aq, var_int_arr_if[32]));
            GameCanvas.hienThongBaoPopup(string, vector);
            return;
        }
        GameCanvas.cfr_renamed_1(string);
        if (fe.boolean_if(s2, var_int_arr_if[1])) {
            ef_0.var_short_arr_do = this.var_short_arr_do;
        }
        this.var_short_arr_do = null;
        gS.cfr_renamed_0();
        AngelChip.duLieuNguoiChoi.coKichHoat = this.var_eq_0_if.var_int_if;
        AngelChip.duLieuNguoiChoi.var_short_if = (short)this.var_eq_0_if.soLuong;
        ((dL)this).cfr_renamed_5 = fe_0.fe_0_do().var_ei_do;
        ek_0.ek_0_do().void_if(var_int_arr_if[27] + this.var_byte_do);
    }

    private static void this() {
        Vector<ei> vector = new Vector<ei>();
        int n = var_int_arr_if[2];
        while (fe.boolean_do(n, ef_0.var_java_util_Vector_do.size())) {
            bk_0 bk_02 = (bk_0)ef_0.var_java_util_Vector_do.elementAt(n);
            if (fe.boolean_if(bk_02.cfr_renamed_1 ? 1 : 0) && (bk_02.cfr_renamed_12 !=  (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
                vector.addElement(new ei(bk_02.chuoiGiaTri, var_int_arr_if[11], n));
            }
            ++n;
            if (-"   ".length() < 0) continue;
            return;
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[2]);
    }

    private static void cfr_renamed_16() {
        var_int_arr_if = new int[42];
        fe.var_int_arr_if[0] = -" ".length();
        fe.var_int_arr_if[1] = "  ".length();
        fe.var_int_arr_if[2] = (0xB ^ 0x42) & ~(0xC8 ^ 0x81);
        fe.var_int_arr_if[3] = -(0xFFFF837D & 0x7DF3) & (0xFFFFD57F & 0x19EFF7);
        fe.var_int_arr_if[4] = " ".length();
        fe.var_int_arr_if[5] = 0xFFFFFE0D & 0xE0FBF3;
        fe.var_int_arr_if[6] = 0x78 ^ 0x3D;
        fe.var_int_arr_if[7] = "   ".length() ^ (0x4F ^ 8);
        fe.var_int_arr_if[8] = "   ".length();
        fe.var_int_arr_if[9] = 0x13 ^ 0x68 ^ 108 + 25 - 7 + 1;
        fe.var_int_arr_if[10] = 0x30 ^ 0x24 ^ (0x15 ^ 0x19);
        fe.var_int_arr_if[11] = 0xD4 ^ 0x9A ^ (0x4C ^ 0x12);
        fe.var_int_arr_if[12] = 0xB ^ 0xE;
        fe.var_int_arr_if[13] = 0xE6 ^ 0x8F ^ (0x57 ^ 0x25);
        fe.var_int_arr_if[14] = 114 + 43 - 99 + 74 ^ 86 + 3 - -37 + 24;
        fe.var_int_arr_if[15] = 0xE7 ^ 0xB8 ^ (0x7A ^ 0x7F);
        fe.var_int_arr_if[16] = 220 + 2 - 156 + 175 ^ 157 + 101 - 145 + 48;
        fe.var_int_arr_if[17] = 0x97 ^ 0x91;
        fe.var_int_arr_if[18] = 6 ^ 0xE;
        fe.var_int_arr_if[19] = 0x61 ^ 0x6D;
        fe.var_int_arr_if[20] = 0xEA ^ 0x8F ^ (0xF0 ^ 0x81);
        fe.var_int_arr_if[21] = 0x54 ^ 0x75;
        fe.var_int_arr_if[22] = 0xC2 ^ 0xA2 ^ (0xC7 ^ 0x8F);
        fe.var_int_arr_if[23] = 0xDF ^ 0xB0;
        fe.var_int_arr_if[24] = 51 + 177 - 146 + 126 ^ 58 + 15 - -57 + 6;
        fe.var_int_arr_if[25] = 0xD7 ^ 0xC2;
        fe.var_int_arr_if[26] = 0xB3 ^ 0xAD;
        fe.var_int_arr_if[27] = 0x29 ^ 0x27 ^ (0x5A ^ 0x12);
        fe.var_int_arr_if[28] = 0xE ^ 0x4D;
        fe.var_int_arr_if[29] = 0xB ^ 0;
        fe.var_int_arr_if[30] = 0x84 ^ 0xC6 ^ (0x66 ^ 0x29);
        fe.var_int_arr_if[31] = 3 ^ 0x31;
        fe.var_int_arr_if[32] = 0xC ^ 0x3D ^ "  ".length();
        fe.var_int_arr_if[33] = 69 + 92 - 35 + 1 ^ (0x4E ^ 0x41);
        fe.var_int_arr_if[34] = 46 + 50 - 25 + 56 ^ (5 ^ 0x35);
        fe.var_int_arr_if[35] = -(0x16 ^ 0x5F);
        fe.var_int_arr_if[36] = -(0xF6 ^ 0xA1);
        fe.var_int_arr_if[37] = 0x2B ^ 0x2C;
        fe.var_int_arr_if[38] = 0xEA ^ 0x8E;
        fe.var_int_arr_if[39] = -(0x1D ^ 0x36);
        fe.var_int_arr_if[40] = 6 + 2 - -89 + 31 ^ 30 + 96 - 17 + 72;
        fe.var_int_arr_if[41] = 0xA5 ^ 0xC0;
    }

    public static void (byte by2, String string, String[] stringArray, short[] sArray, short[] sArray2, String[] stringArray2, String[] stringArray3, int[] nArray, short[] sArray3 != null) {
        fe_0.fe_0_do();
        fe_0.cfr_renamed_4(AngelChip.duLieuNguoiChoi);
        Vector<cx_0> vector = new Vector<cx_0>();
        int n = var_int_arr_if[2];
        while (fe.boolean_do(n, stringArray.length)) {
            int n2;
            ds_0 ds_02 = new ds_0(by2, sArray2[n], stringArray3[n]);
            String string2 = stringArray[n];
            short s2 = sArray[n];
            String string3 = stringArray2[n];
            if ((nArray == null)) {
                n2 = var_int_arr_if[0];
                if (-"   ".length() >= 0) {
                    return;
                }
            } else {
                n2 = nArray[n];
            }
            vector.addElement(new cx_0(MenuChinhAvatar.dg, ds_02, n, string2, s2, string3, n2, sArray3[n]));
            ++n;
            if ("  ".length() != 0) continue;
            return;
        }
        if ((vector.size() > 0)) {
            em_0.em_0_do().cfr_renamed_8();
            em_0.coKichHoat = var_int_arr_if[4];
            String[] stringArray4 = new String[var_int_arr_if[4]];
            stringArray4[fe.var_int_arr_if[2]] = string;
            Vector[] vectorArray = new Vector[var_int_arr_if[4]];
            vectorArray[fe.var_int_arr_if[2]] = vector;
            em_0.em_0_do().cfr_renamed_0(stringArray4, vectorArray, null);
        }
    }

        static boolean (fe fe2 != fi_0 fi_02) {
        return fe2.cfr_renamed_0(fi_02);
    }

    public final void cfr_renamed_2() {
        fe_0.fe_0_do().cfr_renamed_12();
    }

    static void (fe fe2 == int n) {
        fe2.cfr_renamed_18 = n;
    }

    public static void cfr_renamed_4() {
        GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.aS, var_int_arr_if[41], var_int_arr_if[1]);
    }

    private static boolean (int n, int n2 > 0) {
        if (!(ef_0.var_short_arr_do[n2 * ef_0.var_short_if + n] != ef_0.var_ep_do.cfr_renamed_1 - var_int_arr_if[1]) || fe.boolean_if(ef_0.var_short_arr_do[n2 * ef_0.var_short_if + n], var_int_arr_if[0])) {
            return var_int_arr_if[4];
        }
        return var_int_arr_if[2];
    }

        /*
     * Unable to fully structure code
     */
    public final void (int var1_1, int var2_2, short var3_4, Vector var4_7 != null) {
        if ((var1_1 != 0)) {
            var1_1 = fe.var_int_arr_if[2];
            while (fe.boolean_do(var1_1, var4_7.size())) {
                var2_3 = (DuLieuNguoiChoi)var4_7.elementAt(var1_1);
                var3_5 = es.dd_0_do(var2_3.var_short_char);
                if ((var2_3 != null) && (var3_5 != null)) {
                    var3_5.var_byte_long = var2_3.var_byte_long;
                }
                ++var1_1;
                if ("  ".length() > ((154 ^ 186 ^ (223 ^ 193)) & (125 + 32 - 73 + 106 ^ 52 + 120 - 140 + 96 ^ -" ".length()))) continue;
                return;
            }
            GameCanvas.cfr_renamed_8();
            this.cfr_renamed_1();
            return;
        }
        AngelChip.duLieuNguoiChoi.var_byte_long = (byte)var2_2;
        fe_0.fe_0_do().cfr_renamed_8();
        if (!(this.var_gy_0_do == null)) ** GOTO lbl-1000
        this.gy_0_do();
        if (!(this.var_gy_0_do != null) || (var3_4 !=  (int)this.var_gy_0_do.var_short_do)) {
            if ((this.var_gy_0_do == null)) {
                this.var_gy_0_do = new gy_0();
                this.var_gy_0_do.var_short_do = var3_4;
            }
            var3_6 = db_0.db_0_do();
            var3_6.cfr_renamed_0(fe.var_int_arr_if[35]);
            var3_6.cfr_renamed_1();
            var2_2 = fe.var_int_arr_if[2];
            if (" ".length() <= ((162 + 39 - 40 + 8 ^ 116 + 38 - 113 + 94) & (187 + 152 - 268 + 120 ^ 126 + 36 - 72 + 55 ^ -" ".length()))) {
                return;
            }
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = fe.var_int_arr_if[4];
        }
        if ((var2_2 != 0)) {
            if ((fe_0.var_int_new != fe.var_int_arr_if[0])) {
                db_0.db_0_do().cfr_renamed_8(fe_0.var_int_new);
                fe_0.var_int_new = fe.var_int_arr_if[0];
                return;
            }
            GameCanvas.cfr_renamed_6 = fe.var_int_arr_if[4];
            GameCanvas.cfr_renamed_8();
            return;
        }
        GameCanvas.cfr_renamed_6 = fe.var_int_arr_if[4];
    }

    public final void void_if(aU aU2) {
        block5: {
            fe fe2 = this;
            int n = var_int_arr_if[2];
            do {
                if ((n >= fe2.var_java_util_Vector_do.size())) {
                    aU2 = null;
                    if (((0x60 ^ 0x5D) & ~(0x29 ^ 0x14)) != ((0x96 ^ 0xA2) & ~(0x1D ^ 0x29))) {
                        return;
                    }
                    break block5;
                }
                aU aU3 = (aU)fe2.var_java_util_Vector_do.elementAt(n);
                if (fe.boolean_if(aU3.cfr_renamed_3 / var_int_arr_if[10], aU2.cfr_renamed_3) && fe.boolean_if(aU3.cfr_renamed_1 / var_int_arr_if[10], (int)aU2.cfr_renamed_1) && fe.boolean_if(aU3.cfr_renamed_1, (int)aU2.cfr_renamed_1)) {
                    aU2 = aU3;
                    if (((0xC8 ^ 0xBF ^ (0xDC ^ 0xA7)) & (0xE ^ 0x1A ^ (0x6D ^ 0x75) ^ -" ".length())) != 0) {
                        return;
                    }
                    break block5;
                }
                ++n;
                } while (-" ".length() != (138 + 88 - 163 + 94 ^ 105 + 47 - 92 + 93));
            return;
        }
        ef_0.var_java_util_Vector_new.removeElement(aU2);
        this.var_java_util_Vector_do.removeElement(aU2);
        this.cfr_renamed_4(aU2);
        gS.cfr_renamed_0();
        GameCanvas.cfr_renamed_8();
    }

    public final void cfr_renamed_5() {
        this.var_java_util_Vector_if = null;
        this.var_java_util_Vector_for = null;
        el_0.el_0_do().cfr_renamed_4(var_int_arr_if[25], var_int_arr_if[2]);
        ef_0.var_int_try = var_int_arr_if[0];
    }

        private static boolean boolean_if(aU aU2) {
        int n;
        if (fe.cfr_renamed_5(ci_0.fi_0_do((int)aU2.cfr_renamed_1).var_byte_do, var_int_arr_if[1]) && fe.cfr_renamed_5(ci_0.fi_0_do((int)aU2.cfr_renamed_1).var_byte_do, var_int_arr_if[9]) && (ef_0.var_short_arr_do[n = (aU2.cfr_renamed_1 / var_int_arr_if[10] - var_int_arr_if[4]) * ef_0.var_short_if + aU2.cfr_renamed_3 / var_int_arr_if[10]] >=  (int)var_short_if) && fe.boolean_do(ef_0.var_short_arr_do[aU2.cfr_renamed_1 / var_int_arr_if[10] * ef_0.var_short_if + aU2.cfr_renamed_3 / var_int_arr_if[10]], (int)var_short_if)) {
            return var_int_arr_if[4];
        }
        return var_int_arr_if[2];
    }

    public final void cfr_renamed_12() {
        int n = em_0.soLuongKhoa;
        int n2 = em_0.var_int_if;
        em_0.em_0_do().cfr_renamed_2();
        this.cfr_renamed_0(this.var_java_util_Vector_for, this.var_java_util_Vector_if, this.cfr_renamed_12, this.var_byte_if);
        em_0.soLuongKhoa = n;
        em_0.em_0_do().cfr_renamed_5();
        n = em_0.em_0_do().var_java_util_Vector_arr_do[n].size();
        if ((n2 >= n)) {
            if ((n > 0)) {
                n2 = n - var_int_arr_if[4];
                if (" ".length() >= "   ".length()) {
                    return;
                }
            } else {
                n2 = var_int_arr_if[2];
            }
        }
        em_0.var_int_if = n2;
        em_0.em_0_do().cfr_renamed_18();
        GameCanvas.var_ex_do.void_do(em_0.var_int_if);
    }

    public final void void_for() {
        fe_0.fe_0_do().void_for();
        if (fe.boolean_if(coTrangThai ? 1 : 0) && fe.boolean_if(dangChayAuto ? 1 : 0) && fe.cfr_renamed_1(((dL)this).cfr_renamed_2) && (fe_0.fe_0_do().var_java_util_Vector_try != null)) {
            ((dL)this).cfr_renamed_2 = ef_0.var_ei_do;
        }
    }

    private void (aU aU2 != 0) {
        int n = var_int_arr_if[2];
        int n2 = var_int_arr_if[2];
        while (fe.boolean_do(n2, this.var_java_util_Vector_do.size())) {
            aU aU3 = (aU)this.var_java_util_Vector_do.elementAt(n2);
            if (fe.boolean_if(aU3.cfr_renamed_3 / var_int_arr_if[10], aU2.cfr_renamed_3 / var_int_arr_if[10]) && fe.boolean_if(aU3.cfr_renamed_1 / var_int_arr_if[10], aU2.cfr_renamed_1 / var_int_arr_if[10])) {
                ++n;
            }
            ++n2;
            if ((0x1F ^ 0x1B) != 0) continue;
            return;
        }
        if (fe.boolean_if(n, var_int_arr_if[4])) {
            fi_0 fi_02 = ci_0.fi_0_do((int)aU2.cfr_renamed_1);
            int n3 = var_int_arr_if[2];
            while (fe.boolean_do(n3, fi_02.var_java_util_Vector_do.size())) {
                eq_0 eq_02 = (eq_0)fi_02.var_java_util_Vector_do.elementAt(n3);
                ef_0.var_short_arr_if[(aU2.cfr_renamed_1 / fe.var_int_arr_if[10] + eq_02.soLuong) * ef_0.var_short_if + aU2.cfr_renamed_3 / fe.var_int_arr_if[10] + eq_02.var_int_if] = var_int_arr_if[16];
                ++n3;
                if ("  ".length() >= "  ".length()) continue;
                return;
            }
        }
    }

        public final void (byte[] byArray != int n) {
        var_short_if = (short)n;
        this.var_gy_0_do.var_javax_microedition_lcdui_Image_do = gc_0.javax_microedition_lcdui_Image_do(byArray);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(this.var_gy_0_do.var_short_do);
            dataOutputStream.writeShort(n);
            dataOutputStream.write(byArray);
            gc_0.cfr_renamed_0("avatarTileMap", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (" ".length() <= ((33 + 74 - 88 + 177 ^ 156 + 100 - 68 + 5) & (0xFE ^ 0x8A ^ (0x1F ^ 0x6E) ^ -" ".length()))) {
            return;
        }
        if ((fe_0.var_int_new != var_int_arr_if[0])) {
            db_0.db_0_do().cfr_renamed_8(fe_0.var_int_new);
            fe_0.var_int_new = var_int_arr_if[0];
            return;
        }
        GameCanvas.cfr_renamed_8();
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                if (fe.boolean_if(this.cfr_renamed_18, var_int_arr_if[0])) {
                    return;
                }
                n2 = this.cfr_renamed_5 * ef_0.var_short_if + this.cfr_renamed_4;
                if (fe.boolean_if(this.var_dR_arr_do[ef_0.var_short_arr_do[n2]].soLuong, var_int_arr_if[0]) && fe.boolean_if(this.var_dR_arr_do[ef_0.var_short_arr_do[n2]].cfr_renamed_1, var_int_arr_if[0])) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_case);
                    return;
                }
                if (!(fe.boolean_do(this.cfr_renamed_18, (int)var_short_if) && !fe.boolean_do(ef_0.var_short_arr_do[n2], (int)var_short_if) || (this.cfr_renamed_18 >=  (int)var_short_if) && !(ef_0.var_short_arr_do[n2] >=  (int)var_short_if))) {
                    this.cfr_renamed_8 = this.cfr_renamed_4;
                    this.cfr_renamed_11 = this.cfr_renamed_5;
                    ef_0.var_short_arr_do[this.cfr_renamed_5 * ef_0.var_short_if + this.cfr_renamed_4] = (short)this.cfr_renamed_18;
                    return;
                }
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_case);
                return;
            }
            case 1: {
                this.cfr_renamed_18 = var_int_arr_if[0];
                this.cfr_renamed_15 = var_int_arr_if[0];
                this.cfr_renamed_8 = var_int_arr_if[0];
                this.cfr_renamed_11 = var_int_arr_if[0];
                n = var_int_arr_if[2];
                n2 = var_int_arr_if[2];
                while (fe.boolean_do(n2, this.var_short_arr_do.length)) {
                    if ((this.var_short_arr_do[n2] !=  (int)ef_0.var_short_arr_do[n2])) {
                        n = var_int_arr_if[4];
                        if (-(153 + 63 - 146 + 88 ^ 53 + 28 - -49 + 24) < 0) break;
                        return;
                    }
                    ++n2;
                    return;
                }
                if ((n != 0)) {
                    db_0.db_0_do().cfr_renamed_0(ef_0.var_short_arr_do, var_int_arr_if[2]);
                    GameCanvas.cfr_renamed_5();
                }
                this.cfr_renamed_30();
                coTrangThai = var_int_arr_if[2];
                this.cfr_renamed_13();
                ((dL)this).cfr_renamed_2 = null;
                return;
            }
            case 2: {
                Vector<ei> vector = new Vector<ei>();
                if ((AutoController.nhiemVuHienTai != null)) {
                    vector.addElement(new ei("Tắt Auto", var_int_arr_if[9], fe_0.fe_0_do()));
                }
                if (fe.boolean_if(this.cfr_renamed_10, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
                    vector.addElement(new ei(MenuChinhAvatar.bF, var_int_arr_if[4]));
                    vector.addElement(new ei(MenuChinhAvatar.cfr_renamed_29, var_int_arr_if[1]));
                    n = var_int_arr_if[2];
                    n2 = var_int_arr_if[2];
                    while (fe.boolean_do(n2, ef_0.var_java_util_Vector_do.size())) {
                        if (fe.boolean_if(((aG)ef_0.var_java_util_Vector_do.elementAt((int)n2)).var_byte_if)) {
                            ++n;
                        }
                        ++n2;
                        return;
                    }
                    if ((n > var_int_arr_if[4])) {
                        vector.addElement(new ei(MenuChinhAvatar.dp, var_int_arr_if[8]));
                    }
                    vector.addElement(new ei(MenuChinhAvatar.b, var_int_arr_if[9]));
                }
                if ((AutoController.nhiemVuHienTai == null)) {
                    vector.addElement(new ei("Auto Hôn", var_int_arr_if[28], fe_0.fe_0_do()));
                    vector.addElement(new ei("Auto Đánh", var_int_arr_if[7], fe_0.fe_0_do()));
                }
                vector.addElement(new ei(MenuChinhAvatar.aY, var_int_arr_if[12]));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[2]);
                return;
            }
            case 3: {
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei(MenuChinhAvatar.a, var_int_arr_if[29]));
                vector.addElement(new ei(MenuChinhAvatar.u, var_int_arr_if[19]));
                vector.addElement(new ei(MenuChinhAvatar.aH, var_int_arr_if[30]));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[1]);
                u_0 u_02 = u_0.cfr_renamed_0();
                n2 = this.cfr_renamed_4 * var_int_arr_if[10] * bn_0.cfr_renamed_6 - ek_0.ek_0_do().soLuong - u_0.cfr_renamed_0().var_int_if / var_int_arr_if[1] + var_int_arr_if[19];
                int n3 = this.cfr_renamed_5 * var_int_arr_if[10] * bn_0.cfr_renamed_6 - ek_0.ek_0_do().cfr_renamed_3 - u_0.cfr_renamed_0().soLuong - var_int_arr_if[19];
                u_0 u_03 = u_02;
                u_02.cfr_renamed_4 = n2;
                u_03.soLuongKhoa = n3;
                if (fe.boolean_do(u_03.cfr_renamed_4)) {
                    u_03.cfr_renamed_4 = var_int_arr_if[2];
                }
                if (fe.boolean_do(u_03.soLuongKhoa)) {
                    u_03.soLuongKhoa = var_int_arr_if[2];
                }
                return;
            }
            case 4: {
                this.cfr_renamed_11();
                return;
            }
            case 5: {
                this.cfr_renamed_18();
                return;
            }
            case 8: {
                dj_0.cfr_renamed_0();
                GameCanvas.var_dX_do = null;
                return;
            }
            case 50: {
                db_0.db_0_do().cfr_renamed_0(ef_0.var_short_arr_do, var_int_arr_if[4]);
                GameCanvas.cfr_renamed_5();
                return;
            }
            case 51: {
                ef_0.var_short_arr_do = this.var_short_arr_do;
                this.var_short_arr_do = null;
                gS.cfr_renamed_0();
                return;
            }
            case 53: {
                eq.eq_do().cfr_renamed_12(var_int_arr_if[2]);
                GameCanvas.cfr_renamed_5();
                return;
            }
            case 100: {
                db_0.db_0_do().cfr_renamed_0(GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do(), var_int_arr_if[2], var_int_arr_if[2]);
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 101: {
                eq.eq_do().cfr_renamed_1(GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do());
            }
        }
    }

    public fe() {
        this.var_byte_do = (byte)var_int_arr_if[0];
        this.cfr_renamed_15 = var_int_arr_if[0];
        this.soLuongKhoa = var_int_arr_if[0];
        this.cfr_renamed_8 = var_int_arr_if[0];
        this.cfr_renamed_11 = var_int_arr_if[0];
        int[] nArray = new int[var_int_arr_if[1]];
        nArray[fe.var_int_arr_if[2]] = var_int_arr_if[3];
        nArray[fe.var_int_arr_if[4]] = var_int_arr_if[5];
        this.mangSoNguyen = nArray;
        this.var_short_do = (short)var_int_arr_if[6];
        this.var_short_for = (short)var_int_arr_if[7];
        this.cfr_renamed_2 = var_int_arr_if[2];
        this.var_ei_if = new ei(MenuChinhAvatar.bW, var_int_arr_if[2]);
        this.var_ei_for = new ei(MenuChinhAvatar.ck, var_int_arr_if[4]);
        this.var_ei_do = new ei(MenuChinhAvatar.Z, var_int_arr_if[1]);
        ap.void_do(MenuChinhAvatar.cq);
        this.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("hand");
        ap.cfr_renamed_0();
    }

    public final void (byte by2, int n, short[] sArray, byte by3, Vector vector, Vector object != null) {
        this.var_byte_do = by2;
        this.cfr_renamed_10 = n;
        this.var_java_util_Vector_do = vector;
        ef_0.var_short_if = by3;
        ef_0.var_short_do = (short)(sArray.length / by3);
        ef_0.var_short_arr_do = sArray;
        if (fe.boolean_if(this.var_byte_do, var_int_arr_if[9])) {
            GameCanvas.var_ef_0_do.void_do(var_int_arr_if[23]);
            if (((0x3D ^ 0x19 ^ (0xC4 ^ 0xC2)) & (0x80 ^ 0x88 ^ (0x2F ^ 5) ^ -" ".length())) != ((60 + 29 - 14 + 77 ^ 64 + 35 - -14 + 34) & (18 + 0 - -32 + 134 ^ 130 + 39 - 23 + 33 ^ -" ".length()))) {
                return;
            }
        } else {
            GameCanvas.var_ef_0_do.void_do(var_int_arr_if[7] + this.var_byte_do);
        }
        ef_0.var_int_try = var_int_arr_if[0];
        by2 = (byte)var_int_arr_if[0];
        n = var_int_arr_if[2];
        int n2 = var_int_arr_if[2];
        while (fe.boolean_do(n2, (int)by3)) {
            int n3 = var_int_arr_if[2];
            while (fe.boolean_do(n3, (int)ef_0.var_short_do)) {
                if (fe.boolean_do(ef_0.var_short_arr_do[n3 * by3 + n2], (int)var_short_if)) {
                    ef_0.var_short_arr_if[n3 * by3 + n2] = var_int_arr_if[16];
                    if ("   ".length() < ((0x6E ^ 0x41) & ~(0x43 ^ 0x6C))) {
                        return;
                    }
                } else {
                    ef_0.var_short_arr_if[n3 * by3 + n2] = var_int_arr_if[24];
                }
                ++n3;
                if (((0x2E ^ 0x7E) & ~(0x63 ^ 0x33)) <= 0) continue;
                return;
            }
            if (fe.boolean_if(ef_0.var_short_arr_do[(ef_0.var_short_do - var_int_arr_if[4]) * by3 + n2], this.var_gy_0_do.var_javax_microedition_lcdui_Image_do.getHeight() / (var_int_arr_if[10] * bn_0.cfr_renamed_6) - var_int_arr_if[4])) {
                ef_0.var_short_arr_do[(ef_0.var_short_do - fe.var_int_arr_if[4]) * by3 + n2] = ef_0.var_short_arr_do[(ef_0.var_short_do - var_int_arr_if[1]) * by3 + n2];
                ef_0.var_short_arr_if[(ef_0.var_short_do - fe.var_int_arr_if[4]) * by3 + n2] = var_int_arr_if[25];
                ++n;
                if (fe.boolean_if(by2, var_int_arr_if[0])) {
                    by2 = (byte)(n2 * var_int_arr_if[10]);
                }
            }
            ++n2;
            if (" ".length() >= 0) continue;
            return;
        }
        this.var_eq_0_if = new eq_0(by2 + n * var_int_arr_if[10] / var_int_arr_if[1], ef_0.var_short_do * var_int_arr_if[10] - var_int_arr_if[26]);
        AngelChip.duLieuNguoiChoi.coKichHoat = this.var_eq_0_if.var_int_if;
        AngelChip.duLieuNguoiChoi.var_short_if = (short)this.var_eq_0_if.soLuong;
        bq_0 bq_02 = ef_0.bq_0_do(AngelChip.duLieuNguoiChoi.var_short_char);
        if ((bq_02 != null)) {
            bq_02.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
            bq_02.cfr_renamed_5();
        }
        ek_0.ek_0_do().void_if(var_int_arr_if[27] + this.var_byte_do);
        ef_0.var_ep_do = new ep(this.var_gy_0_do.var_javax_microedition_lcdui_Image_do, var_int_arr_if[10] * bn_0.cfr_renamed_6, var_int_arr_if[10] * bn_0.cfr_renamed_6);
        int n4 = var_int_arr_if[2];
        while (fe.boolean_do(n4, ((Vector)object).size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)((Vector)object).elementAt(n4);
            dd_02.var_short_else = (short)(dd_02.coKichHoat ? 1 : 0);
            dd_02.cfr_renamed_5 = dd_02.var_short_if;
            if ((dd_02.var_short_char !=  (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
                ef_0.cfr_renamed_1(dd_02);
            }
            ++n4;
            if (-" ".length() < ((0x9A ^ 0x80) & ~(0xB8 ^ 0xA2))) continue;
            return;
        }
        n4 = var_int_arr_if[2];
        int n5 = var_int_arr_if[2];
        n = var_int_arr_if[2];
        while (fe.boolean_do(n, this.var_java_util_Vector_do.size())) {
            aU aU2 = (aU)this.var_java_util_Vector_do.elementAt(n);
            if (fe.boolean_if(aU2.cfr_renamed_3) && fe.boolean_if(aU2.cfr_renamed_1)) {
                int n6 = var_int_arr_if[2];
                int n7 = var_int_arr_if[2];
                while (fe.boolean_do(n7, ef_0.var_short_arr_do.length)) {
                    if (fe.boolean_if(ef_0.var_short_arr_if[n7], var_int_arr_if[16])) {
                        aU2.cfr_renamed_3 = n7 % ef_0.var_short_if * var_int_arr_if[10];
                        aU2.cfr_renamed_1 = (short)(n7 / ef_0.var_short_if * var_int_arr_if[10]);
                        n4 = aU2.cfr_renamed_3;
                        n5 = aU2.cfr_renamed_1;
                        n6 = var_int_arr_if[4];
                        this.cfr_renamed_3(aU2);
                        db_0.db_0_do().cfr_renamed_0(aU2.cfr_renamed_1, var_int_arr_if[2], var_int_arr_if[2], aU2.cfr_renamed_3 / var_int_arr_if[10], aU2.cfr_renamed_1 / var_int_arr_if[10], aU2.var_byte_do);
                        if ("  ".length() != "   ".length()) break;
                        return;
                    }
                    ++n7;
                    if (-" ".length() < " ".length()) continue;
                    return;
                }
                if (fe.boolean_if(n6)) {
                    aU2.cfr_renamed_3 = n4;
                    aU2.cfr_renamed_1 = (short)n5;
                    db_0.db_0_do().cfr_renamed_0(aU2.cfr_renamed_1, var_int_arr_if[2], var_int_arr_if[2], aU2.cfr_renamed_3 / var_int_arr_if[10], aU2.cfr_renamed_1 / var_int_arr_if[10], aU2.var_byte_do);
                }
            }
            if ((fe.boolean_if(aU2))) {
                aU2.cfr_renamed_1 = (short)(aU2.cfr_renamed_1 + var_int_arr_if[4]);
            }
            ++n;
            if (-" ".length() < 0) continue;
            return;
        }
        fe_0.fe_0_do();
        fe_0.cfr_renamed_10();
        Vector vector2 = this.var_java_util_Vector_do;
        object = this;
        n2 = var_int_arr_if[2];
        while (fe.boolean_do(n2, vector2.size())) {
            aU aU3 = (aU)vector2.elementAt(n2);
            ef_0.var_java_util_Vector_new.addElement(aU3);
            ((fe)object).cfr_renamed_3(aU3);
            ++n2;
            return;
        }
        ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_new);
        this.cfr_renamed_8();
        GameCanvas.cfr_renamed_8();
    }

    private void cfr_renamed_6() {
        ((dL)this).cfr_renamed_5 = new ei(MenuChinhAvatar.dg, var_int_arr_if[8]);
        ((dL)this).cfr_renamed_2 = new ei(MenuChinhAvatar.ck, var_int_arr_if[9]);
        ((dL)this).cfr_renamed_4 = null;
        coTrangThai = var_int_arr_if[4];
        this.cfr_renamed_4 = AngelChip.duLieuNguoiChoi.coKichHoat / var_int_arr_if[10];
        this.cfr_renamed_5 = AngelChip.duLieuNguoiChoi.var_short_if / var_int_arr_if[10];
        ef_0.cfr_renamed_3(AngelChip.duLieuNguoiChoi);
    }

    public final void (String string == null) {
        if (fe.boolean_if(string.trim().equals("") ? 1 : 0)) {
            el_0.el_0_do().cfr_renamed_3(string);
        }
    }

    public final void cfr_renamed_15() {
        super.cfr_renamed_15();
        if (fe.boolean_if(coTrangThai ? 1 : 0)) {
            GameCanvas.var_ef_0_do.cfr_renamed_0();
            AngelChip.duLieuNguoiChoi.cfr_renamed_8();
            return;
        }
        int n = var_int_arr_if[2];
        if ((GameCanvas.boolean_do(var_int_arr_if[1]))) {
            if (fe.boolean_ifthis.cfr_renamed_4, this.cfr_renamed_5 - var_int_arr_if[4] > 0) {
                this.cfr_renamed_5 -= var_int_arr_if[4];
            }
            if (fe.boolean_do(this.cfr_renamed_5)) {
                this.cfr_renamed_5 = var_int_arr_if[2];
            }
            n = var_int_arr_if[4];
            if ("   ".length() <= " ".length()) {
                return;
            }
        } else if ((GameCanvas.boolean_do(var_int_arr_if[9]))) {
            if (fe.boolean_ifthis.cfr_renamed_4 - var_int_arr_if[4], this.cfr_renamed_5 > 0) {
                this.cfr_renamed_4 -= var_int_arr_if[4];
            }
            if (fe.boolean_do(this.cfr_renamed_4)) {
                this.cfr_renamed_4 = var_int_arr_if[2];
            }
            n = var_int_arr_if[4];
            AngelChip.duLieuNguoiChoi.coKichHoat = bk_0.var_byte_case;
            if (((0xEA ^ 0xA6 ^ (0x8A ^ 0x81)) & (16 + 110 - 50 + 53 ^ 73 + 102 - -19 + 4 ^ -" ".length())) != ((0x8D ^ 0x87 ^ (0x69 ^ 0x38)) & (217 + 6 - 81 + 85 ^ 180 + 83 - 93 + 14 ^ -" ".length()))) {
                return;
            }
        } else if ((GameCanvas.boolean_do(var_int_arr_if[17]))) {
            if (fe.boolean_ifthis.cfr_renamed_4 + var_int_arr_if[4], this.cfr_renamed_5 > 0) {
                this.cfr_renamed_4 += var_int_arr_if[4];
            }
            if ((this.cfr_renamed_4 >=  (int)ef_0.var_short_if)) {
                this.cfr_renamed_4 = ef_0.var_short_if - var_int_arr_if[4];
            }
            n = var_int_arr_if[4];
            AngelChip.duLieuNguoiChoi.coKichHoat = var_int_arr_if[2];
            if ("   ".length() < "  ".length()) {
                return;
            }
        } else if ((GameCanvas.boolean_do(var_int_arr_if[18]))) {
            if (fe.boolean_ifthis.cfr_renamed_4, this.cfr_renamed_5 + var_int_arr_if[4] > 0) {
                this.cfr_renamed_5 += var_int_arr_if[4];
            }
            if ((this.cfr_renamed_5 >=  (int)ef_0.var_short_do)) {
                this.cfr_renamed_5 = ef_0.var_short_do - var_int_arr_if[4];
            }
            n = var_int_arr_if[4];
        }
        if ((GameCanvas.var_boolean_new)) {
            n = (ek_0.ek_0_do().soLuong + GameCanvas.soLuongKhoa) / (ef_0.var_int_if * bn_0.cfr_renamed_6);
            int n2 = (ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_if) / (ef_0.var_int_if * bn_0.cfr_renamed_6);
            if (fe.boolean_if(n, this.cfr_renamed_4) && fe.boolean_if(n2, this.cfr_renamed_5) && fe.cfr_renamed_0(((dL)this).cfr_renamed_5)) {
                ((dL)this).cfr_renamed_5.cfr_renamed_1();
            }
            this.cfr_renamed_4 = n;
            this.cfr_renamed_5 = n2;
            n = var_int_arr_if[4];
            GameCanvas.var_boolean_new = var_int_arr_if[2];
        }
        if ((n != 0)) {
            AngelChip.duLieuNguoiChoi.coKichHoat = this.cfr_renamed_4 * var_int_arr_if[10] + var_int_arr_if[19];
            AngelChip.duLieuNguoiChoi.var_short_if = (short)(this.cfr_renamed_5 * var_int_arr_if[10] + var_int_arr_if[19]);
            if ((this.soLuongKhoa != var_int_arr_if[0]) && (this.var_java_util_Vector_do.size() > 0)) {
                aU aU2 = (aU)this.var_java_util_Vector_do.elementAt(this.soLuongKhoa);
                ((aU)this.var_java_util_Vector_do.elementAt(this.soLuongKhoa)).cfr_renamed_3 = this.cfr_renamed_4 * var_int_arr_if[10];
                aU2.cfr_renamed_1 = (short)(this.cfr_renamed_5 * var_int_arr_if[10]);
                ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_new);
                }
        }
    }

    private void cfr_renamed_17() {
        Vector<ei> vector = new Vector<ei>();
        int n = var_int_arr_if[2];
        while (fe.boolean_do(n, ci_0.var_java_util_Vector_for.size())) {
            int n2;
            Object object = (fi_0)ci_0.var_java_util_Vector_for.elementAt(n);
            if (fe.cfr_renamed_4(((fi_0)object).var_byte_do) && ((this.var_byte_do != var_int_arr_if[9]) && (!fe.cfr_renamed_5(((fi_0)object).var_byte_do, var_int_arr_if[4]) || !fe.cfr_renamed_5(((fi_0)object).var_byte_do, var_int_arr_if[1])) || fe.boolean_if(this.var_byte_do, var_int_arr_if[9])) && fe.cfr_renamed_5(n2 = ((fi_0)object).chuoiGiaTri.indexOf(":"), var_int_arr_if[0])) {
                int n3 = var_int_arr_if[2];
                object = ((fi_0)object).chuoiGiaTri.substring(var_int_arr_if[2], n2);
                n2 = var_int_arr_if[2];
                while (fe.boolean_do(n2, vector.size())) {
                    if (fe.cfr_renamed_4(((ei)vector.elementAt((int)n2)).chuoiGiaTri.equals(object) ? 1 : 0)) {
                        n3 = var_int_arr_if[4];
                    }
                    ++n2;
                    if ((0xC2 ^ 0xC6) != 0) continue;
                    return;
                }
                if (!(n3 != 0) || (vector.isEmpty())) {
                    vector.addElement(new ei((String)object, var_int_arr_if[14], n));
                }
            }
            ++n;
            if ("  ".length() != 0) continue;
            return;
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[1]);
    }

    public final void void_if(int n, int n2) {
        aU aU2;
        int n3 = var_int_arr_if[0];
        int n4 = var_int_arr_if[2];
        while (fe.boolean_do(n4, this.var_java_util_Vector_do.size())) {
            aU2 = (aU)this.var_java_util_Vector_do.elementAt(n4);
            if (fe.boolean_if(aU2.cfr_renamed_3 / var_int_arr_if[10], this.cfr_renamed_4) && fe.boolean_if(aU2.cfr_renamed_1 / var_int_arr_if[10], this.cfr_renamed_5)) {
                n3 = n4;
                if ((0x3C ^ 0x38) >= 0) break;
                return;
            }
            ++n4;
            if (" ".length() == " ".length()) continue;
            return;
        }
        aU2 = null;
        if ((n3 != var_int_arr_if[0])) {
            aU2 = (aU)this.var_java_util_Vector_do.elementAt(n3);
        }
        switch (n) {
            case 1: {
                eq eq2 = eq.eq_do();
                eq2.cfr_renamed_0(var_int_arr_if[36]);
                eq2.cfr_renamed_1();
                return;
            }
            case 2: {
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei(MenuChinhAvatar.at, var_int_arr_if[17]));
                vector.addElement(new ei(MenuChinhAvatar.s, var_int_arr_if[37]));
                if ((this.var_java_util_Vector_do.size() > 0)) {
                    vector.addElement(new ei(MenuChinhAvatar.cH, var_int_arr_if[18]));
                }
                u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[1]);
                return;
            }
            case 3: {
                fe.this();
                return;
            }
            case 4: {
                GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.aS + ":", var_int_arr_if[38], var_int_arr_if[1]);
                return;
            }
            case 5: {
                fe_0.fe_0_do().cfr_renamed_12();
                return;
            }
            case 6: {
                this.cfr_renamed_17();
                return;
            }
            case 7: {
                coTrangThai = var_int_arr_if[4];
                if ((this.var_dR_arr_do == null)) {
                    if ((this.var_dR_arr_do == null)) {
                        gj.cfr_renamed_0();
                        db_0 db_02 = db_0.db_0_do();
                        db_02.cfr_renamed_0(var_int_arr_if[39]);
                        db_02.cfr_renamed_1();
                        GameCanvas.cfr_renamed_5();
                    }
                    return;
                }
                this.cfr_renamed_18();
                return;
            }
            case 8: {
                this.cfr_renamed_6();
                return;
            }
            default: {
                return;
            }
            case 11: {
                if (fe.boolean_if(n3, var_int_arr_if[0])) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_void);
                    return;
                }
                this.soLuongKhoa = n3;
                n = var_int_arr_if[2];
                while (fe.boolean_do(n, ci_0.var_java_util_Vector_for.size())) {
                    if (fe.boolean_if(((fi_0)ci_0.var_java_util_Vector_for.elementAt((int)n)).cfr_renamed_3, (int)aU2.cfr_renamed_1)) {
                        this.cfr_renamed_18 = n;
                        if (null == null) break;
                        return;
                    }
                    ++n;
                    if ((0x75 ^ 0x10 ^ (0x41 ^ 0x20)) >= (0x2D ^ 0x1D ^ (0x68 ^ 0x5C))) continue;
                    return;
                }
                ((dL)this).cfr_renamed_4 = null;
                ((dL)this).cfr_renamed_2 = null;
                this.cfr_renamed_4(aU2);
                this.var_eq_0_do = new eq_0(this.cfr_renamed_4, this.cfr_renamed_5, aU2.cfr_renamed_1);
                ((dL)this).cfr_renamed_5 = new ei(MenuChinhAvatar.c, new ay_0(this, aU2));
                return;
            }
            case 12: {
                if (fe.boolean_if(n3, var_int_arr_if[0])) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_void);
                    return;
                }
                if (fe.boolean_if(aU2.var_byte_do)) {
                    aU2.var_byte_do = (byte)var_int_arr_if[1];
                    } else {
                    aU2.var_byte_do = (byte)var_int_arr_if[2];
                }
                db_0.db_0_do().cfr_renamed_0(aU2.cfr_renamed_1, this.cfr_renamed_4, this.cfr_renamed_5, this.cfr_renamed_4, this.cfr_renamed_5, aU2.var_byte_do);
                return;
            }
            case 13: {
                if ((n3 != var_int_arr_if[0]) && (aU2.cfr_renamed_1 !=  (int)this.var_short_do)) {
                    GameCanvas.hienThongBaoPopup(MenuChinhAvatar.p, new cf_0(aU2));
                    return;
                }
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_void);
                return;
            }
            case 14: {
                em_0.em_0_do().cfr_renamed_2();
                GameCanvas.void_do(MenuChinhAvatar.bi, var_int_arr_if[40]);
                return;
            }
            case 15: {
                gx[] gxArray = new gx[var_int_arr_if[8]];
                n2 = var_int_arr_if[2];
                while (fe.boolean_do(n2, var_int_arr_if[8])) {
                    gxArray[n2] = new gx();
                    gxArray[n2].void_do(var_int_arr_if[1]);
                    ++n2;
                    if ((0x99 ^ 0x9C) != 0) continue;
                    return;
                }
                gxArray[var_int_arr_if[2]].cfr_renamed_0(var_int_arr_if[4]);
                ei ei2 = new ei(MenuChinhAvatar.ck, new aa_0(gxArray));
                em_0.em_0_do().cfr_renamed_2();
                dj_0.cfr_renamed_0().cfr_renamed_0(gxArray, MenuChinhAvatar.ca, MenuChinhAvatar.var_java_lang_String_arr_arr_do, ei2);
                GameCanvas.var_dX_do = dj_0.cfr_renamed_0();
                dj_0.cfr_renamed_0().cfr_renamed_4 = (int)new ei(MenuChinhAvatar.cfr_renamed_7, var_int_arr_if[18]);
                return;
            }
            case 16: {
                if (!fe.boolean_do(n2, ef_0.var_java_util_Vector_do.size())) break;
                bk_0 bk_02 = (bk_0)ef_0.var_java_util_Vector_do.elementAt(n2);
                db_0.db_0_do().cfr_renamed_5(bk_02.cfr_renamed_12);
                return;
            }
            case 17: {
                n = var_int_arr_if[2];
                while (fe.boolean_do(n, this.var_dR_arr_do.length)) {
                    if (fe.boolean_if(n, n2)) {
                        if ((this.cfr_renamed_8 != var_int_arr_if[0])) {
                            this.cfr_renamed_4 = this.cfr_renamed_8;
                            this.cfr_renamed_5 = this.cfr_renamed_11;
                            AngelChip.duLieuNguoiChoi.coKichHoat = this.cfr_renamed_8 * var_int_arr_if[10];
                            AngelChip.duLieuNguoiChoi.var_short_if = (short)(this.cfr_renamed_11 * var_int_arr_if[10]);
                            ek_0.ek_0_do().void_do(AngelChip.duLieuNguoiChoi.coKichHoat * bn_0.cfr_renamed_6, AngelChip.duLieuNguoiChoi.var_short_if * bn_0.cfr_renamed_6);
                        }
                        this.cfr_renamed_18 = n;
                        if (fe.boolean_do(this.cfr_renamed_18, (int)var_short_if)) {
                            this.cfr_renamed_15 = var_int_arr_if[4];
                            if ("  ".length() <= " ".length()) {
                                return;
                            }
                        } else {
                            this.cfr_renamed_15 = var_int_arr_if[2];
                        }
                    }
                    ++n;
                    if (" ".length() > 0) continue;
                    return;
                }
                return;
            }
            case 18: {
                n = var_int_arr_if[2];
                while (fe.boolean_do(n, ci_0.var_java_util_Vector_for.size())) {
                    if (fe.boolean_if(n, n2)) {
                        Object object = (fi_0)ci_0.var_java_util_Vector_for.elementAt(n);
                        if (fe.cfr_renamed_4(((fi_0)object).var_byte_do) && ((this.var_byte_do != var_int_arr_if[9]) && (!fe.cfr_renamed_5(((fi_0)object).var_byte_do, var_int_arr_if[4]) || !fe.cfr_renamed_5(((fi_0)object).var_byte_do, var_int_arr_if[1])) || fe.boolean_if(this.var_byte_do, var_int_arr_if[9])) && fe.cfr_renamed_5(n4 = ((fi_0)object).chuoiGiaTri.indexOf(":"), var_int_arr_if[0])) {
                            object = ((fi_0)object).chuoiGiaTri.substring(var_int_arr_if[2], n4);
                            this.cfr_renamed_0((String)object);
                        }
                    }
                    ++n;
                    if ("  ".length() < (0xDA ^ 0x84 ^ (0x37 ^ 0x6D))) continue;
                    return;
                }
                break block0;
            }
        }
    }

    static void (fe fe2 != String string) {
        fe2.cfr_renamed_0(string);
    }

    static void (fe fe2, int n > 0) {
        fe2.cfr_renamed_4 = n;
    }

    static int int_if(fe fe2) {
        return fe2.cfr_renamed_4;
    }

    private void cfr_renamed_13() {
        if (fe.boolean_if(this.cfr_renamed_10, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
            ((dL)this).cfr_renamed_5 = fe_0.fe_0_do().var_ei_do;
            ((dL)this).cfr_renamed_5.chuoiGiaTri = MenuChinhAvatar.dg;
            ((dL)this).cfr_renamed_4 = this.var_ei_do;
            return;
        }
        ((dL)this).cfr_renamed_4 = this.var_ei_do;
        if (fe.boolean_if(GameCanvas.cfr_renamed_16)) {
            ((dL)this).cfr_renamed_5 = fe_0.fe_0_do().var_ei_do;
        }
    }

        static void void_if(fe fe2) {
        fe2.cfr_renamed_6();
    }

    static void void_for(fe fe2) {
        fe2.cfr_renamed_17();
    }

    public final void (aU aU2 > 0) {
        fi_0 fi_02 = ci_0.fi_0_do((int)aU2.cfr_renamed_1);
        int n = var_int_arr_if[24];
        if (fe.boolean_if(fi_02.cfr_renamed_3, (int)this.var_short_for)) {
            n = var_int_arr_if[33];
            if (" ".length() == 0) {
                return;
            }
        } else if (fe.boolean_if(fi_02.cfr_renamed_3, (int)this.var_short_do)) {
            n = var_int_arr_if[23];
            if ((0xC2 ^ 0xB5 ^ (0xCA ^ 0xB9)) < 0) {
                return;
            }
        } else if (fe.boolean_if(fi_02.cfr_renamed_2, var_int_arr_if[4])) {
            n = var_int_arr_if[34];
            if (((105 + 40 - 32 + 34 ^ 161 + 91 - 78 + 10) & (0x22 ^ 0x73 ^ (0x60 ^ 0x1A) ^ -" ".length())) < 0) {
                return;
            }
        } else if (fe.boolean_if(fi_02.cfr_renamed_2, var_int_arr_if[1])) {
            n = var_int_arr_if[28];
        }
        int n2 = var_int_arr_if[2];
        while (fe.boolean_do(n2, fi_02.var_java_util_Vector_do.size())) {
            eq_0 eq_02 = (eq_0)fi_02.var_java_util_Vector_do.elementAt(n2);
            ef_0.var_short_arr_if[(aU2.cfr_renamed_1 / fe.var_int_arr_if[10] + eq_02.soLuong) * ef_0.var_short_if + aU2.cfr_renamed_3 / fe.var_int_arr_if[10] + eq_02.var_int_if] = (short)n;
            ++n2;
            if (-" ".length() != " ".length()) continue;
            return;
        }
    }

            public final void void_do(int n) {
        ce.cfr_renamed_0().cfr_renamed_0(n, this);
        super.void_do(n);
    }

        public final void (Graphics graphics == null) {
        Object object;
        GameCanvas.var_ef_0_do.cfr_renamed_4(graphics);
        if ((coTrangThai) && (GameCanvas.var_e_0_do == null)) {
            fe fe2;
            block20: {
                object = graphics;
                fe2 = this;
                if (fe.boolean_if(dangChayAuto ? 1 : 0) && fe.boolean_if(this.soLuongKhoa, var_int_arr_if[0])) {
                    if ((this.cfr_renamed_18 != var_int_arr_if[0])) {
                        int n = var_int_arr_if[2];
                        do {
                            if ((n >= ef_0.var_short_arr_if.length)) {
                                ef_0.var_ep_do.cfr_renamed_0(fe2.cfr_renamed_18, fe2.cfr_renamed_4 * var_int_arr_if[10] * bn_0.cfr_renamed_6, fe2.cfr_renamed_5 * var_int_arr_if[10] * bn_0.cfr_renamed_6, var_int_arr_if[2], var_int_arr_if[2], (Graphics)object);
                                if ((0 ^ 0x12 ^ (0x99 ^ 0x8E)) == 0) {
                                    return;
                                }
                                break block20;
                            }
                            if (fe.boolean_if(fe2.cfr_renamed_15) && (ef_0.var_short_arr_do[n] >=  (int)var_short_if) && fe.boolean_do(ef_0.var_short_arr_do[n], fe2.var_dR_arr_do.length) && (!fe.boolean_if(fe2.var_dR_arr_do[ef_0.var_short_arr_do[n]].soLuong, var_int_arr_if[0]) || !fe.boolean_if(fe2.var_dR_arr_do[ef_0.var_short_arr_do[n]].cfr_renamed_1, var_int_arr_if[0])) || fe.boolean_if(fe2.cfr_renamed_15, var_int_arr_if[4]) && fe.boolean_do(ef_0.var_short_arr_do[n], (int)var_short_if)) {
                                fe2.cfr_renamed_0((Graphics)object, var_int_arr_if[1] + n % ef_0.var_short_if * var_int_arr_if[10], var_int_arr_if[1] + n / ef_0.var_short_if * var_int_arr_if[10], var_int_arr_if[2], var_int_arr_if[20]);
                            }
                            ++n;
                            } while ("  ".length() > ((126 + 20 - 22 + 54 ^ 46 + 83 - 126 + 129) & (0x15 ^ 0x7C ^ (0xDB ^ 0x84) ^ -" ".length())));
                        return;
                    }
                } else if ((this.cfr_renamed_18 != var_int_arr_if[0])) {
                    fi_0 fi_02 = (fi_0)ci_0.var_java_util_Vector_for.elementAt(this.cfr_renamed_18);
                    if ((fi_02.var_byte_do != var_int_arr_if[1]) && (fi_02.var_byte_do != var_int_arr_if[9])) {
                        int n = var_int_arr_if[2];
                        while (fe.boolean_do(n, ef_0.var_short_arr_if.length)) {
                            if (fe.boolean_if(ef_0.var_short_arr_if[n], var_int_arr_if[16]) && (!fe.boolean_if(n % ef_0.var_short_if, fe2.cfr_renamed_4) || (n / ef_0.var_short_if != fe2.cfr_renamed_5))) {
                                fe2.cfr_renamed_0((Graphics)object, var_int_arr_if[1] + n % ef_0.var_short_if * var_int_arr_if[10], var_int_arr_if[1] + n / ef_0.var_short_if * var_int_arr_if[10], var_int_arr_if[2], var_int_arr_if[20]);
                            }
                            ++n;
                            if (((0xE6 ^ 0xA0) & ~(9 ^ 0x4F)) == 0) continue;
                            return;
                        }
                    } else {
                        int n = var_int_arr_if[2];
                        while (fe.boolean_do(n, ef_0.var_short_arr_do.length)) {
                            if ((n > 0) && fe.boolean_do(ef_0.var_short_arr_do[n], (int)var_short_if) && (ef_0.var_short_arr_do[n - ef_0.var_short_if] >=  (int)var_short_if)) {
                                fe2.cfr_renamed_0((Graphics)object, var_int_arr_if[1] + n % ef_0.var_short_if * var_int_arr_if[10], var_int_arr_if[1] + n / ef_0.var_short_if * var_int_arr_if[10], var_int_arr_if[2], var_int_arr_if[20]);
                            }
                            ++n;
                            if (-"  ".length() < 0) continue;
                            return;
                        }
                    }
                }
            }
            fe2.cfr_renamed_0((Graphics)object, fe2.cfr_renamed_4 * var_int_arr_if[10], fe2.cfr_renamed_5 * var_int_arr_if[10], var_int_arr_if[4], var_int_arr_if[10]);
        }
        GameCanvas.var_ef_0_do.cfr_renamed_1(graphics);
        if ((coTrangThai)) {
            if ((dangChayAuto) && (this.cfr_renamed_18 != var_int_arr_if[0])) {
                object = (fi_0)ci_0.var_java_util_Vector_for.elementAt(this.cfr_renamed_18);
                ci_0.cfr_renamed_0(graphics, object.cfr_renamed_4, (this.cfr_renamed_4 * var_int_arr_if[10] + object.cfr_renamed_1) * bn_0.cfr_renamed_6, (this.cfr_renamed_5 * var_int_arr_if[10] + object.var_short_do) * bn_0.cfr_renamed_6, var_int_arr_if[2]);
            }
            if ((GameCanvas.var_e_0_do == null)) {
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, (this.cfr_renamed_4 * var_int_arr_if[10] + var_int_arr_if[19]) * bn_0.cfr_renamed_6, (this.cfr_renamed_5 * var_int_arr_if[10] + this.cfr_renamed_2) * bn_0.cfr_renamed_6, var_int_arr_if[21]);
            }
            if ((this.cfr_renamed_15 != var_int_arr_if[0])) {
                GameCanvas.var_ew_byte.cfr_renamed_0(graphics, this.var_dR_arr_do[this.cfr_renamed_18].chuoiGiaTri + "(" + GameCanvas.hienThongBaoPopup(this.var_dR_arr_do[this.cfr_renamed_18].cfr_renamed_1, this.var_dR_arr_do[this.cfr_renamed_18].soLuong, var_int_arr_if[4]) + ")", (this.cfr_renamed_4 * var_int_arr_if[10] + var_int_arr_if[19]) * bn_0.cfr_renamed_6, (this.cfr_renamed_5 * var_int_arr_if[10] - var_int_arr_if[22]) * bn_0.cfr_renamed_6, var_int_arr_if[1]);
            }
            this.cfr_renamed_2 += var_int_arr_if[4];
            if ((this.cfr_renamed_2 > var_int_arr_if[12])) {
                this.cfr_renamed_2 = var_int_arr_if[2];
            }
        }
        GameCanvas.cfr_renamed_1(graphics);
        ef_0.cfr_renamed_3(graphics);
        TienIchGame.cfr_renamed_0(graphics);
    }

    static int int_for(fe fe2) {
        return fe2.cfr_renamed_11;
    }

    static void (fe fe2 >= int n) {
        fe2.cfr_renamed_5 = n;
    }

    static void (fe fe2, int n, String string != null) {
        fi_0 fi_02 = (fi_0)ci_0.var_java_util_Vector_for.elementAt(n);
        if (fe.boolean_if(fe2.cfr_renamed_0(fi_02) ? 1 : 0)) {
            GameCanvas.hienThongBaoPopup(fi_02.soLuong, (int)fi_02.cfr_renamed_5, new eu(fe2, fi_02, string), new ff_0(fe2, fi_02, string), new gh(fe2));
        }
    }

    private void cfr_renamed_30() {
        ef_0.cfr_renamed_1(AngelChip.duLieuNguoiChoi);
        AngelChip.duLieuNguoiChoi.coKichHoat = this.var_eq_0_if.var_int_if;
        AngelChip.duLieuNguoiChoi.var_short_if = (short)this.var_eq_0_if.soLuong;
        AngelChip.duLieuNguoiChoi.var_boolean_int = var_int_arr_if[2];
        ek_0.ek_0_do().void_do(this.var_eq_0_if.var_int_if * bn_0.cfr_renamed_6, this.var_eq_0_if.soLuong * bn_0.cfr_renamed_6);
    }

    static void (fe fe2 != int n) {
        fe2.cfr_renamed_11 = n;
    }

    static void void_int(fe fe2) {
        fe2.cfr_renamed_11();
    }

    static int int_int(fe fe2) {
        return fe2.cfr_renamed_8;
    }
}

