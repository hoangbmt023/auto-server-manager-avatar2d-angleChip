/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class bF
extends dL {
    private int cfr_renamed_10;
    public static boolean dangChayAuto;
    public static ep var_ep_do;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private static ei var_ei_do;
    public static byte var_byte_do;
    private static int cfr_renamed_14;
    public static int soLuong;
    private long soXu;
    public eq_0[] var_eq_0_arr_do;
    private long var_long_if;
    public static Vector var_java_util_Vector_do;
    public static bF var_bF_do;
    public static Vector var_java_util_Vector_if;
    public static eq_0 var_eq_0_do;
    private boolean var_boolean_try;
    private byte[] var_byte_arr_do;
    private boolean var_boolean_byte;
    private static ei var_ei_if;
    private static Vector var_java_util_Vector_char;
    public static byte var_byte_if;
    public static ep var_ep_if;
    private static ei var_ei_for;
    private boolean var_boolean_case;
    public static int var_int_if;
    public static int soLuongKhoa;
    private String tenNhanVat;
    private static int cfr_renamed_23;
    public static byte var_byte_for;
    private long var_long_for;
    private static ei var_ei_byte;
    public static Vector var_java_util_Vector_for;
    public static by var_by_do;
    public static Vector var_java_util_Vector_int;
    public static short var_short_do;
    public static Vector var_java_util_Vector_new;
    private static int cfr_renamed_24;
    public static boolean coTrangThai;
    public static Image var_javax_microedition_lcdui_Image_do;
    private static final byte[][] var_byte_arr_arr_do;
    private byte[] var_byte_arr_if;
    private Vector var_java_util_Vector_else;
    public static ep var_ep_for;
    public static Image var_javax_microedition_lcdui_Image_if;
    public static Vector var_java_util_Vector_try;
    public static boolean coKichHoat;
    public static String chuoiGiaTri;
    private boolean var_boolean_char;
    private boolean var_boolean_else;
    public static Vector var_java_util_Vector_byte;
    private int cfr_renamed_25;
    private static ei var_ei_case;
    public static int var_int_int;
    private static final int[] mangSoNguyen;
    private static ei var_ei_char;
    private int cfr_renamed_27;
    public static int var_int_new;
    public Vector var_java_util_Vector_case;
    public static ep var_ep_int;
    public static int var_int_try;
    public static eq_0 var_eq_0_if;
    public static Image var_javax_microedition_lcdui_Image_for;
    public static byte var_byte_int;
    public static boolean var_boolean_int;
    public static byte var_byte_char;
    private eq_0 var_eq_0_new;
    public static int var_int_byte;
    public static Vector[] var_java_util_Vector_arr_do;
    ha nhiemVuHienTai;
    public static eq_0 var_eq_0_for;
    public static int var_int_case;
    public static int var_int_char;
    public static ep var_ep_new;
    public static int var_int_else;
    private int cfr_renamed_26;
    public static int var_int_goto;
    private Vector var_java_util_Vector_goto;
    public static ep var_ep_try;
    public static eq_0 var_eq_0_int;

    public static ha ha_do(int n) {
        int n2 = 0;
        while (bF.boolean_for(n2, var_java_util_Vector_if.size())) {
            ha ha2 = (ha)var_java_util_Vector_if.elementAt(n2);
            if (bF.boolean_byte(ha2.cfr_renamed_12, n)) {
                return ha2;
            }
            ++n2;
            if (((0x56 ^ 0x13) & ~(0xF5 ^ 0xB0)) == 0) continue;
            return null;
        }
        return null;
    }

    public static void (int n, String string, int n2, int n3, int n4 == null) {
        if (bF.boolean_byte(n, soLuong)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_0(n2, n3, n4);
            GameCanvas.cfr_renamed_1(string);
        }
    }

    private static void cfr_renamed_12(int n, int n2) {
        if (bF.boolean_for(GameCanvas.var_boolean_byte ? 1 : 0)) {
            et_0.cfr_renamed_5();
        }
        gd gd2 = (gd)var_java_util_Vector_char.elementAt(n);
        dh_0.dh_0_do().cfr_renamed_0(soLuong, n2, (int)gd2.var_short_do);
    }

    public static bF bF_do() {
        if (bF.cfr_renamed_0((Object)var_bF_do)) {
            var_bF_do = new bF();
        }
        return var_bF_do;
    }

    private static void cfr_renamed_6() {
        Vector<ek> vector = new Vector<ek>();
        int n = 0;
        while (bF.boolean_for(n, var_java_util_Vector_char.size())) {
            gd gd2 = (gd)var_java_util_Vector_char.elementAt(n);
            if (bF.cfr_renamed_1(ak_0.dY_do((int)gd2.var_short_do))) {
                vector.addElement(new ek(gd2.chuoiGiaTri + "(" + gd2.soLuong + ")", n, gd2));
            }
            ++n;
            if ("  ".length() != -" ".length()) continue;
            return;
        }
        (vector == null);
    }

    private int int_do(int n, int n2) {
        int n3 = 0;
        while (bF.boolean_for(n3, this.var_eq_0_arr_do.length)) {
            int n4 = 0;
            while (bF.boolean_for(n4, cfr_renamed_14)) {
                int n5 = this.var_eq_0_arr_do[n3].var_int_if + n4 / cfr_renamed_23;
                int n6 = this.var_eq_0_arr_do[n3].soLuong + n4 % cfr_renamed_23;
                if (bF.boolean_byte(n, n5) && bF.boolean_byte(n2, n6)) {
                    return n3 * cfr_renamed_14 + n4;
                }
                ++n4;
                if (-(0x2A ^ 0x2E) < 0) continue;
                return (0x81 ^ 0x89) & ~(0xBD ^ 0xB5);
            }
            ++n3;
            if (((0xCF ^ 0xC1 ^ (7 ^ 0x32)) & (0x18 ^ 0x45 ^ (0x71 ^ 0x17) ^ -" ".length())) == ((0x53 ^ 0x5F ^ (0x9C ^ 0xC4)) & (211 + 206 - 250 + 49 ^ 65 + 89 - 133 + 119 ^ -" ".length()))) continue;
            return (0x70 ^ 0x7B ^ (0x70 ^ 0x3A)) & (0x4E ^ 0x78 ^ (0x3B ^ 0x4C) ^ -" ".length());
        }
        return -1;
    }

    public static void (String string == null) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.cU, 51));
        vector.addElement(new ei(MenuChinhAvatar.dh, 52));
        vector.addElement(GameCanvas.var_ei_do);
        GameCanvas.hienThongBaoPopup(string, vector);
    }

    private void void_new(int n) {
        var_int_new = 0;
        ((dL)this).cfr_renamed_4 = new ei(MenuChinhAvatar.ck, 5);
        ((dL)this).cfr_renamed_2 = null;
        ek_0.dangChayAuto = 1;
        ((dL)this).cfr_renamed_5 = null;
        this.var_boolean_byte = 1;
        soLuongKhoa = n;
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void void_if() {
        if (bF.boolean_byte(soLuong, AngelChip.duLieuNguoiChoi.var_short_char)) {
            Object object;
            Vector<gg_0> vector = new Vector<gg_0>();
            int n = 0;
            while (bF.boolean_for(n, ak_0.var_java_util_Vector_for.size())) {
                object = (dv_0)ak_0.var_java_util_Vector_for.elementAt(n);
                vector.addElement(new gg_0(MenuChinhAvatar.bp, new gu_0((dv_0)object), (dv_0)object, n));
                ++n;
                if ((0xE7 ^ 0xB5 ^ (0x49 ^ 0x1E)) != 0) continue;
                return;
            }
            Vector<Object> vector2 = new Vector<Object>();
            if (bF.boolean_if(var_short_do)) {
                String string;
                vector2.addElement(null);
                if (bF.boolean_int(var_int_char)) {
                    string = MenuChinhAvatar.cE;
                    if (-(0x44 ^ 0x41) >= 0) {
                        return;
                    }
                } else {
                    string = MenuChinhAvatar.cK;
                }
                object = new gk_0(string, this);
                vector2.addElement(object);
            }
            em_0.em_0_do().cfr_renamed_8();
            em_0.em_0_do().coTrangThai = 1;
            if (bF.boolean_if(var_short_do)) {
                String[] stringArray = new String[2];
                stringArray[0] = MenuChinhAvatar.bp;
                stringArray[1] = MenuChinhAvatar.var_java_lang_String_catch;
                Vector[] vectorArray = new Vector[2];
                vectorArray[0] = vector;
                vectorArray[1] = null;
                em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, vector2);
                em_0.em_0_do().cfr_renamed_0(new ei(MenuChinhAvatar.cj, 0, this), 1);
                em_0.soLuongKhoa = 1;
                em_0.em_0_do().cfr_renamed_5();
                em_0.em_0_do().cfr_renamed_18();
                return;
            }
            String[] stringArray = new String[1];
            stringArray[0] = MenuChinhAvatar.bp;
            Vector[] vectorArray = new Vector[1];
            vectorArray[0] = vector;
            em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, null);
        }
    }

    static void (bF bF2, ff ff2, short s2, ha ha2 == null) {
        bF2.cfr_renamed_0(ff2, s2, ha2);
    }

    private void cfr_renamed_17() {
        this.var_java_util_Vector_case.addElement(fe_0.fe_0_do().var_ei_for);
        ei ei2 = new ei(MenuChinhAvatar.aY, 20);
        this.var_java_util_Vector_case.addElement(ei2);
    }

    public bF() {
        byte[] byArray = new byte[5];
        byArray[0] = 33;
        byArray[1] = 34;
        byArray[2] = 35;
        byArray[3] = 36;
        byArray[4] = 37;
        this.var_byte_arr_if = byArray;
        byte[] byArray2 = new byte[5];
        byArray2[0] = 33;
        byArray2[1] = 120;
        byArray2[2] = 121;
        byArray2[3] = 122;
        byArray2[4] = 123;
        this.var_byte_arr_do = byArray2;
        this.var_java_util_Vector_else = new Vector();
        this.var_java_util_Vector_case = new Vector();
        this.var_boolean_byte = 0;
        this.var_boolean_else = 0;
        this.var_long_for = -1L;
        this.var_java_util_Vector_goto = new Vector();
        this.var_boolean_try = 0;
        this.cfr_renamed_27 = 0;
        this.var_boolean_case = 1;
        this.cfr_renamed_25 = 0;
        bF.var_java_util_Vector_arr_do[0] = new Vector();
        bF.var_java_util_Vector_arr_do[1] = new Vector();
        this.a_();
        ap.void_do(MenuChinhAvatar.ar);
        var_javax_microedition_lcdui_Image_if = ap.javax_microedition_lcdui_Image_do("coin");
        var_ep_do = ep.cfr_renamed_0("iB", 9 * bn_0.cfr_renamed_6, 13 * bn_0.cfr_renamed_6);
        ap.cfr_renamed_0();
        this.cfr_renamed_17();
        bF.cfr_renamed_11();
        var_ei_if = new ei(MenuChinhAvatar.ck, 8);
        var_ei_for = new ei(MenuChinhAvatar.cfr_renamed_46, 9);
        new ei(MenuChinhAvatar.cfr_renamed_46, 16, this);
        new ei(MenuChinhAvatar.cfr_renamed_7, 18, this);
    }

    public static void (fc_0 fc_02 == null) {
        GameCanvas.hienThongBaoPopup(fc_02.mangSoNguyen[0], fc_02.mangSoNguyen[1], new dc_0(fc_02), new hb(fc_02), null);
    }

    private static void (ha ha2 == null) {
        dh_0.dh_0_do().cfr_renamed_8(soLuong, ha2.cfr_renamed_12);
    }

    private static boolean boolean_do(int n) {
        return n >= 0;
    }

    public static ff ff_do(int n) {
        int n2 = 0;
        while (bF.boolean_for(n2, ak_0.var_java_util_Vector_if.size())) {
            ff ff2 = (ff)ak_0.var_java_util_Vector_if.elementAt(n2);
            if (bF.boolean_byte(ff2.var_short_do, n)) {
                return ff2;
            }
            ++n2;
            if ("   ".length() != " ".length()) continue;
            return null;
        }
        return null;
    }

    private void (byte by2 != int n) {
        var_int_int = n;
        var_byte_for = by2;
        AngelChip.duLieuNguoiChoi.var_int_break = -1;
        AngelChip.duLieuNguoiChoi.var_int_long = -1;
        AngelChip.duLieuNguoiChoi.var_int_this = -1;
        if (bF.boolean_byte(var_byte_for, 4)) {
            this.var_eq_0_new = new eq_0(ef_0.var_aG_do.cfr_renamed_3 / ef_0.var_int_if, ef_0.var_aG_do.var_int_if / ef_0.var_int_if);
            if (((0xDC ^ 0xAD ^ (0x9D ^ 0xAF)) & (0x4E ^ 0x48 ^ (0xE6 ^ 0xA3) ^ -" ".length())) == -" ".length()) {
                return;
            }
        } else {
            this.var_eq_0_new = new eq_0(bF.var_eq_0_if.var_int_if, bF.var_eq_0_if.soLuong);
        }
        AngelChip.duLieuNguoiChoi.cfr_renamed_5 = this.var_eq_0_new.soLuong * ef_0.var_int_if + ef_0.var_int_if / 2;
        AngelChip.duLieuNguoiChoi.var_short_else = (short)(this.var_eq_0_new.var_int_if * ef_0.var_int_if);
        if (bF.boolean_byte(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, bk_0.var_byte_case)) {
            AngelChip.duLieuNguoiChoi.var_short_else = (short)(AngelChip.duLieuNguoiChoi.var_short_else + ef_0.var_int_if);
        }
    }

    private boolean boolean_do(int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        while (bF.boolean_for(n4, var_java_util_Vector_do.size())) {
            ff ff2 = bF.ff_do(((gd)bF.var_java_util_Vector_do.elementAt((int)n4)).var_short_do);
            if (bF.boolean_int(ff2.var_byte_do) && bF.boolean_byte(ff2.var_byte_if, n2)) {
                this.cfr_renamed_0(new fv(this, ff2, n));
                n3 = 1;
                if (null == null) break;
                return ((0xEC ^ 0xC6) & ~(0x41 ^ 0x6B)) != 0;
            }
            ++n4;
            if (" ".length() != 0) continue;
            return ((0x75 ^ 0x29) & ~(0x71 ^ 0x2D)) != 0;
        }
        if (bF.boolean_int(n3)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.bV);
        }
        return n3 != 0;
    }

    public static void cfr_renamed_4() {
        if (!bF.boolean_try(ef_0.soLuong, 24) || bF.boolean_byte(ef_0.soLuong, 53)) {
            GameCanvas.var_e_0_do = null;
            GameCanvas.hienThongBaoPopup(MenuChinhAvatar.cO, 54, null);
        }
    }

    public static void cfr_renamed_5() {
        Object object;
        if (bF.boolean_try(AngelChip.duLieuNguoiChoi.var_short_char, soLuong)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_final);
            return;
        }
        Vector<Object> vector = new Vector<Object>();
        int n = 0;
        while (bF.boolean_for(n, var_java_util_Vector_char.size())) {
            object = (gd)var_java_util_Vector_char.elementAt(n);
            if (bF.cfr_renamed_1(ak_0.dY_do((int)((gd)object).var_short_do))) {
                object = new ar("", n, (gd)object, n);
                vector.addElement(object);
            }
            ++n;
            if ("  ".length() < (0x45 ^ 0x41)) continue;
            return;
        }
        n = 0;
        while (bF.boolean_for(n, var_java_util_Vector_do.size())) {
            object = new do_0("", n, n);
            vector.addElement(object);
            ++n;
            if (-"   ".length() <= 0) continue;
            return;
        }
        em_0.em_0_do().cfr_renamed_8();
        String[] stringArray = new String[2];
        stringArray[0] = MenuChinhAvatar.D;
        stringArray[1] = MenuChinhAvatar.df;
        Vector[] vectorArray = new Vector[2];
        vectorArray[0] = bF.java_util_Vector_if();
        vectorArray[1] = vector;
        em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, null);
        int n2 = 0;
        while (bF.boolean_for(n2, var_java_util_Vector_for.size())) {
            var_java_util_Vector_for.elementAt(n2);
            ++n2;
            return;
        }
    }

    static void (bF bF2, byte by2, int n == null) {
        bF2.cfr_renamed_0(by2, n);
    }

    public final void void_if(int n) {
        switch (n) {
            case 0: {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.aO, 1, this);
                return;
            }
            case 1: {
                dh_0.dh_0_do().cfr_renamed_4(-1);
                em_0.em_0_do().cfr_renamed_2();
                return;
            }
            case 2: {
                em_0.em_0_do().cfr_renamed_2();
                if (bF.boolean_int(var_int_char)) {
                    dh_0 dh_02 = dh_0.dh_0_do();
                    dh_02.cfr_renamed_0(92);
                    dh_02.cfr_renamed_1();
                    return;
                }
                dh_0.dh_0_do().cfr_renamed_8(0);
                return;
            }
            case 3: {
                dh_0.dh_0_do().cfr_renamed_5(1, 0);
                return;
            }
            case 4: {
                dh_0.dh_0_do().cfr_renamed_5(1, 1);
                return;
            }
            case 5: {
                dh_0.dh_0_do().cfr_renamed_15(1, 0);
                return;
            }
            case 6: {
                dh_0.dh_0_do().cfr_renamed_15(1, 1);
                return;
            }
            case 7: {
                dh_0.dh_0_do().cfr_renamed_5(1);
                return;
            }
            case 8: {
                dh_0.dh_0_do().cfr_renamed_4(1);
                return;
            }
            case 9: {
                dh_0.dh_0_do().cfr_renamed_12(1, 1);
                return;
            }
            case 10: {
                dh_0.dh_0_do().cfr_renamed_12(1, 2);
                return;
            }
            case 11: {
                dh_0.dh_0_do().cfr_renamed_8(1);
                return;
            }
            case 12: {
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.ai, new gh_0());
                return;
            }
            case 13: {
                dh_0.dh_0_do().cfr_renamed_2(1, 1);
                return;
            }
            case 14: {
                dh_0.dh_0_do().cfr_renamed_2(1, 2);
                return;
            }
            case 15: {
                es.cfr_renamed_0().cfr_renamed_0(1);
                return;
            }
            case 16: {
                dh_0.dh_0_do().cfr_renamed_3();
                return;
            }
            case 17: {
                dh_0 dh_03 = dh_0.dh_0_do();
                dh_03.cfr_renamed_0(95);
                dh_03.cfr_renamed_1();
                return;
            }
            case 18: {
                bF.bF_do().cfr_renamed_18();
                return;
            }
            case 19: {
                dh_0 dh_04 = dh_0.dh_0_do();
                dh_04.cfr_renamed_0(98);
                dh_04.cfr_renamed_1();
                return;
            }
            case 20: {
                ((dL)this).cfr_renamed_4 = null;
                return;
            }
            case 21: {
                bF.bF_do().void_if();
                return;
            }
            case 22: {
                bF.bF_do();
                bF.cfr_renamed_16();
                return;
            }
            case 23: {
                bF.bF_do();
                bF.cfr_renamed_5();
            }
        }
    }

    public static gd gd_do(int n) {
        int n2 = 0;
        while (bF.boolean_for(n2, var_java_util_Vector_try.size())) {
            gd gd2 = (gd)var_java_util_Vector_try.elementAt(n2);
            if (bF.boolean_byte(gd2.var_short_do, n)) {
                return gd2;
            }
            ++n2;
            if ("   ".length() >= -" ".length()) continue;
            return null;
        }
        return null;
    }

    static Vector java_util_Vector_do() {
        return var_java_util_Vector_char;
    }

    public static void (byte by2 == null) {
        Vector<dF> vector = new Vector<dF>();
        int n = 0;
        while (bF.boolean_for(n, var_java_util_Vector_do.size())) {
            gd gd2 = (gd)var_java_util_Vector_do.elementAt(n);
            ff ff2 = bF.ff_do(gd2.var_short_do);
            if ((!bF.boolean_try(ff2.var_byte_do, by2) || bF.boolean_byte(ff2.var_byte_do, 101)) && bF.boolean_byte(ff2.var_byte_if, 5)) {
                vector.addElement(new dF(ff2.chuoiGiaTri + "(" + gd2.soLuong + ")", new hc(by2, gd2), ff2));
            }
            ++n;
            if ("  ".length() > 0) continue;
            return;
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, GameCanvas.var_int_int, ef_0.var_int_if * bn_0.cfr_renamed_6, ef_0.var_int_if * bn_0.cfr_renamed_6);
    }

    public static void cfr_renamed_12() {
        if (bF.boolean_byte(AngelChip.duLieuNguoiChoi.var_short_char, soLuong)) {
            String string;
            Vector<ei> vector = new Vector<ei>();
            if (bF.boolean_if(bF.var_by_do.var_short_new)) {
                vector.addElement(new gw_0(MenuChinhAvatar.cfr_renamed_42 + "(" + bF.var_by_do.var_short_new + ")"));
            }
            if (bF.boolean_if(bF.var_by_do.soLuong)) {
                string = MenuChinhAvatar.bz;
                if ((127 + 32 - 29 + 17 ^ 149 + 91 - 118 + 28) == 0) {
                    return;
                }
            } else {
                string = MenuChinhAvatar.o;
            }
            vector.addElement(new ge_0(string));
            vector.addElement(new gs_0(MenuChinhAvatar.cD));
            (vector == null);
        }
    }

    private void (ff ff2, short s2, ha ha2 == null) {
        this.cfr_renamed_0(new gK(this, ff2, s2, ha2));
    }

    private void cfr_renamed_13() {
        if (bF.boolean_if(this.var_java_util_Vector_goto.size()) && bF.boolean_try(soLuongKhoa, -1)) {
            this.var_boolean_char = 1;
            eq_0 eq_02 = (eq_0)this.var_java_util_Vector_goto.elementAt(0);
            if ((AngelChip.duLieuNguoiChoi.var_boolean_arr_arr_do == null)) {
                ef_0.var_eq_0_do = new eq_0();
                AngelChip.duLieuNguoiChoi.cfr_renamed_12();
            }
            ef_0.var_eq_0_do.var_int_if = eq_02.var_int_if * 24 - 24;
            ef_0.var_eq_0_do.soLuong = eq_02.soLuong * 24 + 12;
            AngelChip.duLieuNguoiChoi.var_int_break = -5;
            AngelChip.duLieuNguoiChoi.var_int_catch = -1;
            AngelChip.duLieuNguoiChoi.var_short_else = (short)(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0);
            AngelChip.duLieuNguoiChoi.cfr_renamed_5 = AngelChip.duLieuNguoiChoi.var_short_if;
            AngelChip.duLieuNguoiChoi.var_eq_0_do = ef_0.var_eq_0_do;
            AngelChip.duLieuNguoiChoi.cfr_renamed_3();
        }
    }

    static void (bF bF2 != dq_0 dq_02) {
        if (bF.boolean_try(dq_02.cfr_renamed_8, -1) && bF.boolean_for(dq_02.soLuong, 6)) {
            GameCanvas.void_do(MenuChinhAvatar.cfr_renamed_40, 53);
            return;
        }
        bF2.cfr_renamed_0(0, -1);
        GameCanvas.cfr_renamed_8();
    }

    public static void (byte by2 != String string) {
        GameCanvas.hienThongBaoPopup(string, new ga_0(by2));
    }

    private void cfr_renamed_30() {
        int n;
        block16: {
            n = 0;
            while (bF.boolean_for(n, ef_0.var_java_util_Vector_new.size())) {
                if (bF.boolean_byte(((ea)ef_0.var_java_util_Vector_new.elementAt((int)n)).cfr_renamed_12, -2)) {
                    ef_0.var_java_util_Vector_new.removeElementAt(n);
                    if (bF.boolean_if(n)) {
                        --n;
                    }
                }
                ++n;
                if (" ".length() == " ".length()) continue;
                return;
            }
            this.var_long_for = -1L;
            n = -1;
            if ((this.var_eq_0_new != null)) {
                int n2 = this.var_eq_0_new.soLuong;
                n = this.var_eq_0_new.var_int_if;
                int n3 = var_java_util_Vector_int.size();
                int n4 = 0;
                do {
                    if (bF.boolean_int(n4, n3)) {
                        n = -1;
                        if (-" ".length() >= 0) {
                            return;
                        }
                        break block16;
                    }
                    dq_0 dq_02 = (dq_0)var_java_util_Vector_int.elementAt(n4);
                    if (bF.boolean_byte(dq_02.cfr_renamed_2, n) && bF.boolean_byte(dq_02.var_int_new, n2)) {
                        n = n4;
                        if (((0x10 ^ 6) & ~(0x33 ^ 0x25)) < 0) {
                            return;
                        }
                        break block16;
                    }
                    ++n4;
                    } while (((0xBD ^ 0xA0 ^ (0x4F ^ 0x12)) & (0x2A ^ 0x21 ^ (0xCC ^ 0x87) ^ -" ".length())) <= "   ".length());
                return;
            }
        }
        if (bF.boolean_byte(n, -1)) {
            var_byte_for = (byte)-1;
            AngelChip.duLieuNguoiChoi.var_boolean_int = 0;
            AngelChip.duLieuNguoiChoi.var_int_break = 0;
            this.cfr_renamed_20();
            return;
        }
        if (bF.boolean_byte(var_int_int, -1)) {
            dq_0 dq_03 = (dq_0)var_java_util_Vector_int.elementAt(n);
            switch (var_byte_for) {
                case 0: {
                    this.cfr_renamed_0(dq_03, 1);
                    dq_03.soLuong = 0;
                    ef_0.var_short_arr_do[dq_03.var_int_new * ef_0.var_short_if + dq_03.cfr_renamed_2] = dq_03.var_byte_new;
                    if (bF.boolean_try(dq_03.cfr_renamed_8, -1)) {
                        dh_0.dh_0_do().cfr_renamed_0(soLuong, n, -1);
                    }
                    dq_03.cfr_renamed_8 = -1;
                    if (!bF.boolean_for(GameCanvas.var_boolean_byte ? 1 : 0)) break;
                    et_0.cfr_renamed_5();
                    if (-" ".length() < 0) break;
                    return;
                }
                case 1: {
                    this.cfr_renamed_0(dq_03, 4);
                    dq_03.coTrangThai = 0;
                    ef_0.var_short_arr_do[dq_03.var_int_new * ef_0.var_short_if + dq_03.cfr_renamed_2] = dq_03.var_byte_new;
                    dh_0.dh_0_do().cfr_renamed_1(soLuong, n, 100);
                }
            }
        }
        var_int_int = -1;
        this.var_eq_0_new = null;
        var_byte_for = (byte)-1;
        AngelChip.duLieuNguoiChoi.var_int_break = 0;
        AngelChip.duLieuNguoiChoi.var_boolean_int = 0;
        this.cfr_renamed_20();
    }

    public static void void_for(int n, int n2) {
        ha ha2 = bF.ha_do(n);
        if ((ha2 != null)) {
            int n3 = n2 - AngelChip.duLieuNguoiChoi.mangSoNguyen[0];
            ef_0.var_aG_do = null;
            Image image = ci_0.cfr_renamed_1((short)ak_0.fc_0_do((int)ha2.cfr_renamed_18).var_short_arr_do[ha2.cfr_renamed_20]).var_javax_microedition_lcdui_Image_do;
            GameCanvas.hienThongBaoPopup(n3, ha2.coKichHoat ? 1 : 0, ha2.cfr_renamed_1 - 7, gc_0.cfr_renamed_0(0, ha2.cfr_renamed_11 * ha2.cfr_renamed_4, image.getWidth(), ha2.cfr_renamed_4 ? 1 : 0, image), -1);
            var_java_util_Vector_if.removeElement(ha2);
            ef_0.var_java_util_Vector_do.removeElement(ha2);
            }
        em_0.var_boolean_int = 1;
        AngelChip.duLieuNguoiChoi.mangSoNguyen[0] = n2;
    }

    public static void cfr_renamed_11() {
        if ((var_ep_new == null)) {
            ap.void_do(MenuChinhAvatar.ar);
            var_javax_microedition_lcdui_Image_for = ap.javax_microedition_lcdui_Image_do("buyLand");
            var_ep_new = ep.cfr_renamed_0("cut", 24 * bn_0.cfr_renamed_6, 24 * bn_0.cfr_renamed_6);
            var_ep_if = ep.cfr_renamed_0("vp", 16 * bn_0.cfr_renamed_6, 16 * bn_0.cfr_renamed_6);
            Image[] imageArray = new Image[2];
            var_javax_microedition_lcdui_Image_arr_do = imageArray;
            imageArray[0] = ap.javax_microedition_lcdui_Image_do("w");
            bF.var_javax_microedition_lcdui_Image_arr_do[1] = ap.javax_microedition_lcdui_Image_do("g");
            var_ep_for = ep.cfr_renamed_0("wg", 13 * bn_0.cfr_renamed_6, 9 * bn_0.cfr_renamed_6);
            var_ep_int = ep.cfr_renamed_0("m", 27 * bn_0.cfr_renamed_6, 17 * bn_0.cfr_renamed_6);
            var_ep_try = ep.cfr_renamed_0("tc", 13 * bn_0.cfr_renamed_6, 13 * bn_0.cfr_renamed_6);
            var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("focus");
            ap.cfr_renamed_0();
        }
    }

    static {
        bF.cfr_renamed_27();
        var_java_util_Vector_char = new Vector();
        var_java_util_Vector_do = new Vector();
        var_java_util_Vector_try = new Vector();
        var_java_util_Vector_if = new Vector();
        var_java_util_Vector_arr_do = new Vector[2];
        coKichHoat = 0;
        coTrangThai = 0;
        var_byte_for = (byte)-1;
        cfr_renamed_14 = 12;
        cfr_renamed_23 = 4;
        var_int_int = -1;
        var_int_new = -1;
        cfr_renamed_24 = 0;
        byte[][] byArrayArray = new byte[5][];
        byte[] byArray = new byte[10];
        byArray[0] = 0;
        byArray[1] = 0;
        byArray[2] = 0;
        byArray[3] = 0;
        byArray[4] = 0;
        byArray[5] = 1;
        byArray[6] = 1;
        byArray[7] = 1;
        byArray[8] = 1;
        byArray[9] = 1;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[10];
        byArray2[0] = 2;
        byArray2[1] = 2;
        byArray2[2] = 2;
        byArray2[3] = 2;
        byArray2[4] = 2;
        byArray2[5] = 3;
        byArray2[6] = 3;
        byArray2[7] = 3;
        byArray2[8] = 3;
        byArray2[9] = 3;
        byArrayArray[1] = byArray2;
        byte[] byArray3 = new byte[10];
        byArray3[0] = 4;
        byArray3[1] = 4;
        byArray3[2] = 4;
        byArray3[3] = 4;
        byArray3[4] = 4;
        byArray3[5] = 5;
        byArray3[6] = 5;
        byArray3[7] = 5;
        byArray3[8] = 5;
        byArray3[9] = 5;
        byArrayArray[2] = byArray3;
        byte[] byArray4 = new byte[10];
        byArray4[0] = 6;
        byArray4[1] = 6;
        byArray4[2] = 6;
        byArray4[3] = 6;
        byArray4[4] = 6;
        byArray4[5] = 7;
        byArray4[6] = 7;
        byArray4[7] = 7;
        byArray4[8] = 7;
        byArray4[9] = 7;
        byArrayArray[3] = byArray4;
        byte[] byArray5 = new byte[10];
        byArray5[0] = 8;
        byArray5[1] = 8;
        byArray5[2] = 8;
        byArray5[3] = 8;
        byArray5[4] = 8;
        byArray5[5] = 9;
        byArray5[6] = 9;
        byArray5[7] = 9;
        byArray5[8] = 9;
        byArray5[9] = 9;
        byArrayArray[4] = byArray5;
        var_byte_arr_arr_do = byArrayArray;
        soLuongKhoa = -1;
        dangChayAuto = 0;
        var_boolean_int = 0;
        var_int_try = -1;
        var_int_else = -1;
        var_short_do = (short)0;
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    public static void (int n != String string) {
        GameCanvas.hienThongBaoPopup(MenuChinhAvatar.aN + " " + string + "?", new as_0(n));
    }

    private static void (gd gd2 == null) {
        if (bF.boolean_for(gd2.var_short_do, 50)) {
            gd2.mangSoNguyen[0] = ak_0.dY_do((int)gd2.var_short_do).var_short_if;
            gd2.chuoiGiaTri = ak_0.dY_do((int)gd2.var_short_do).chuoiGiaTri;
            return;
        }
        if (bF.boolean_for(gd2.var_short_do, 100)) {
            gd2.mangSoNguyen[0] = ak_0.fc_0_do((int)gd2.var_short_do).var_short_do;
            if (bF.boolean_byte(ak_0.fc_0_do((int)gd2.var_short_do).var_byte_if, 1)) {
                gd2.chuoiGiaTri = MenuChinhAvatar.bU + " " + ak_0.fc_0_do((int)gd2.var_short_do).tenNhanVat;
                return;
            }
            if (bF.boolean_byte(ak_0.fc_0_do((int)gd2.var_short_do).var_byte_if, 2)) {
                if (bF.boolean_byte(gd2.var_short_do, 55)) {
                    gd2.chuoiGiaTri = MenuChinhAvatar.O + " " + ak_0.fc_0_do((int)gd2.var_short_do).tenNhanVat;
                    return;
                }
                gd2.chuoiGiaTri = MenuChinhAvatar.bn + " " + ak_0.fc_0_do((int)gd2.var_short_do).tenNhanVat;
            }
        }
    }

    public final void cfr_renamed_2() {
        GameCanvas.cfr_renamed_5();
        eq.eq_do().cfr_renamed_17(8);
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

    public final void cfr_renamed_8() {
        super.cfr_renamed_8();
        AutoFarm.mangSoNguyen = null;
        TienIchGame.cfr_renamed_8();
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

        private static boolean boolean_for(int n, int n2) {
        return n < n2;
    }

    private void cfr_renamed_22() {
        int n = this.int_do(bF.var_eq_0_if.var_int_if, bF.var_eq_0_if.soLuong);
        if (bF.boolean_int(n - var_java_util_Vector_int.size())) {
            GameCanvas.cfr_renamed_5();
            dh_0.dh_0_do().cfr_renamed_2(soLuong);
            return;
        }
        if (bF.boolean_do(n) && bF.boolean_for(n, var_java_util_Vector_int.size())) {
            Object object = (dq_0)var_java_util_Vector_int.elementAt(n);
            if (bF.boolean_byte(((dq_0)object).soLuong, 5)) {
                this.cfr_renamed_24();
                return;
            }
            if (!(bF.boolean_byte(((dq_0)object).cfr_renamed_8, -1) && (bF.boolean_byte(((dq_0)object).var_byte_int, 1) && !bF.boolean_try(((dq_0)object).var_byte_new, this.var_byte_arr_if[1]) || bF.boolean_byte(((dq_0)object).var_byte_int, 2) && !bF.boolean_try(((dq_0)object).var_byte_new, this.var_byte_arr_do[1])))) {
                dq_0 dq_02 = object;
                object = this;
                int n2 = ((bF)object).int_do(bF.var_eq_0_if.var_int_if, bF.var_eq_0_if.soLuong);
                Vector<ei> vector = (dq_0)var_java_util_Vector_int.elementAt(n2);
                Object object2 = null;
                if (bF.boolean_if(n2)) {
                    object2 = (dq_0)var_java_util_Vector_int.elementAt(n2 - 1);
                }
                fj fj2 = null;
                if (bF.boolean_byte(soLuong, AngelChip.duLieuNguoiChoi.var_short_char) && (bF.boolean_byte(((dq_0)((Object)vector)).var_byte_int, 1) && !bF.boolean_for(n2) || (object2 != null) && bF.boolean_for(((dq_0)((Object)vector)).var_byte_int, ((dq_0)object2).var_byte_int))) {
                    fj2 = new fj(MenuChinhAvatar.o);
                }
                if (bF.boolean_try(dq_02.cfr_renamed_8, -1) && bF.boolean_for(dq_02.soLuong, 6) && bF.boolean_byte(dq_02.var_byte_new, 36)) {
                    super.cfr_renamed_0(new en_0((bF)object));
                }
                if (!bF.boolean_try(dq_02.cfr_renamed_8, -1) || bF.boolean_int(dq_02.soLuong, 6)) {
                    vector = new dI((bF)object, dq_02);
                    if ((fj2 != null)) {
                        Vector<ei> vector2 = new Vector<ei>();
                        vector2.addElement(new dm_0(MenuChinhAvatar.var_java_lang_String_const, (cp)((Object)vector)));
                        vector2.addElement(fj2);
                        (vector2 == null);
                        return;
                    }
                    super.cfr_renamed_0((cp)((Object)vector));
                }
                if (bF.boolean_try(dq_02.cfr_renamed_8, -1) && bF.boolean_for(dq_02.soLuong, 6) && bF.boolean_for(n2, var_java_util_Vector_int.size()) && bF.boolean_if(var_java_util_Vector_do.size())) {
                    if (bF.boolean_for(dq_02.coKichHoat ? 1 : 0)) {
                        super.boolean_do(n2, 7);
                        } else if (bF.boolean_for(dq_02.var_boolean_int ? 1 : 0)) {
                        super.boolean_do(n2, 3);
                        } else if (bF.boolean_for(dq_02.var_byte_for, 80)) {
                        super.boolean_do(n2, 2);
                        }
                }
                if (bF.boolean_byte(var_byte_for, -1)) {
                    vector = new Vector<ei>();
                    gQ gQ2 = new gQ(MenuChinhAvatar.bJ);
                    vector.addElement(gQ2);
                    if (bF.boolean_byte(soLuong, AngelChip.duLieuNguoiChoi.var_short_char)) {
                        vector.addElement(new gG(MenuChinhAvatar.var_java_lang_String_const, new gr_0((bF)object, dq_02)));
                    }
                    if ((fj2 != null)) {
                        vector.addElement(fj2);
                    }
                    int n3 = 0;
                    while (bF.boolean_for(n3, var_java_util_Vector_do.size())) {
                        object = (gd)var_java_util_Vector_do.elementAt(n3);
                        object2 = bF.ff_do(((gd)object).var_short_do);
                        if (bF.boolean_int(((ff)object2).var_byte_do) && (bF.boolean_byte(((ff)object2).var_byte_if, 3) && !bF.boolean_int(dq_02.var_boolean_int ? 1 : 0) || bF.boolean_byte(((ff)object2).var_byte_if, 7) && !bF.boolean_int(dq_02.coKichHoat ? 1 : 0) || bF.boolean_try(((ff)object2).var_byte_if, 3) && bF.boolean_try(((ff)object2).var_byte_if, 7))) {
                            object = ((ff)object2).chuoiGiaTri + "(" + ((gd)object).soLuong + ")";
                            vector.addElement(new dF((String)object, n3, (ff)object2));
                        }
                        ++n3;
                        if ("   ".length() == "   ".length()) continue;
                        return;
                    }
                    (vector == null);
                }
                return;
            }
            if (bF.boolean_for(var_java_util_Vector_char.size())) {
                if (bF.boolean_byte(var_byte_for, -1)) {
                    object = new Vector<ei>();
                    int n4 = this.int_do(bF.var_eq_0_if.var_int_if, bF.var_eq_0_if.soLuong);
                    dq_0 dq_03 = (dq_0)var_java_util_Vector_int.elementAt(n4);
                    dq_0 dq_04 = null;
                    if (bF.boolean_if(n4)) {
                        dq_04 = (dq_0)var_java_util_Vector_int.elementAt(n4 - 1);
                    }
                    int n5 = 0;
                    while (bF.boolean_for(n5, var_java_util_Vector_char.size())) {
                        gd gd2 = (gd)var_java_util_Vector_char.elementAt(n5);
                        if (bF.cfr_renamed_1(ak_0.dY_do((int)gd2.var_short_do))) {
                            ((Vector)object).addElement(new da_0(gd2.chuoiGiaTri + "(" + gd2.soLuong + ")", n5, gd2));
                        }
                        ++n5;
                        if (((0x4F ^ 0x13 ^ (0xEC ^ 0xBA)) & (0x68 ^ 0x36 ^ (0x31 ^ 0x65) ^ -" ".length())) == 0) continue;
                        return;
                    }
                    if (bF.boolean_byte(soLuong, AngelChip.duLieuNguoiChoi.var_short_char) && (bF.boolean_byte(dq_03.var_byte_int, 1) && !bF.boolean_for(n4) || (dq_04 != null) && bF.boolean_for(dq_03.var_byte_int, dq_04.var_byte_int))) {
                        ((Vector)object).addElement(new de_0(MenuChinhAvatar.o));
                    }
                    (object == null);
                }
                return;
            }
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.T);
        }
    }

    private void cfr_renamed_20() {
        if (bF.boolean_for(coKichHoat ? 1 : 0)) {
            this.void_if(10, -1);
            return;
        }
        if (bF.boolean_if(this.var_java_util_Vector_else.size())) {
            cp cp2 = (cp)this.var_java_util_Vector_else.elementAt(0);
            cp2.void_do();
            this.var_java_util_Vector_else.removeElement(cp2);
            return;
        }
        if (bF.boolean_for(this.var_boolean_else ? 1 : 0)) {
            this.cfr_renamed_13();
        }
    }

    public static boolean (short s2 != int n) {
        if (bF.cfr_renamed_0((Object)gd.cfr_renamed_0(var_java_util_Vector_do, (int)s2))) {
            return 0;
        }
        dh_0.dh_0_do().cfr_renamed_1(soLuong, n, s2);
        return 0;
    }

    private static boolean boolean_int(int n, int n2) {
        return n >= n2;
    }

    private void cfr_renamed_14() {
        int n = 0;
        while (bF.boolean_for(n, this.var_eq_0_arr_do.length)) {
            int n2 = 0;
            while (bF.boolean_for(n2, cfr_renamed_14)) {
                int n3 = this.var_eq_0_arr_do[n].var_int_if + n2 / cfr_renamed_23;
                int n4 = this.var_eq_0_arr_do[n].soLuong + n2 % cfr_renamed_23;
                if (bF.boolean_for(n * cfr_renamed_14 + n2, var_java_util_Vector_int.size())) {
                    ef_0.void_do(n3, n4);
                    dq_0 dq_02 = (dq_0)var_java_util_Vector_int.elementAt(n * cfr_renamed_14 + n2);
                    ((dq_0)var_java_util_Vector_int.elementAt(n * cfr_renamed_14 + n2)).var_short_if = (short)(n * cfr_renamed_14 + n2);
                    dq_02.cfr_renamed_2 = n3;
                    dq_02.var_int_new = n4;
                    dq_02.var_byte_for = (byte)(n3 * ef_0.var_int_if + ef_0.var_int_if / 2);
                    dq_02.var_short_if = (short)(n4 * ef_0.var_int_if + 18);
                    this.void_for(n * cfr_renamed_14 + n2);
                    ef_0.var_java_util_Vector_new.addElement(dq_02);
                    if ("   ".length() < 0) {
                        return;
                    }
                } else {
                    if (bF.boolean_byte(n * cfr_renamed_14 + n2, var_java_util_Vector_int.size())) {
                        ef_0.var_java_util_Vector_new.addElement(new ea(-3, n3 * ef_0.var_int_if + 20, n4 * ef_0.var_int_if + 20, var_javax_microedition_lcdui_Image_for.getWidth()));
                        ef_0.void_do(n3, n4);
                        ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_new);
                        }
                    if (bF.boolean_byte(ef_0.var_short_arr_do[n4 * ef_0.var_short_if + n3], this.var_byte_arr_if[0])) {
                        ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_new);
                        return;
                    }
                    if (bF.boolean_byte(n3, this.var_eq_0_arr_do[n].var_int_if) && bF.boolean_byte(n4, this.var_eq_0_arr_do[n].soLuong)) {
                        ef_0.var_short_arr_do[n4 * ef_0.var_short_if + n3] = 4;
                    }
                }
                ++n2;
                if ("   ".length() <= "   ".length()) continue;
                return;
            }
            ++n;
            return;
        }
        ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_new);
        }

    public static void (int n, int n2, dq_0 dq_02, ha ha2 == null) {
        if (bF.boolean_try(ef_0.soLuong, 25) && bF.boolean_try(n, n2)) {
            int n3;
            int n4;
            String string = "";
            if (bF.boolean_if(n2 - n)) {
                string = string + "+";
            }
            if ((dq_02 != null)) {
                n4 = dq_02.cfr_renamed_2 * ef_0.var_int_if + ef_0.var_int_if / 2;
                n3 = dq_02.var_int_new * ef_0.var_int_if - ef_0.var_int_if / 2;
                if (-" ".length() > 0) {
                    return;
                }
            } else {
                n4 = ha2.coKichHoat;
                n3 = ha2.cfr_renamed_1 - 30;
            }
            GameCanvas.hienThongBaoPopup(string + (n2 - n), n4, n3, 0, -1);
        }
    }

    public final void a_() {
        var_ei_case = new ei(MenuChinhAvatar.dg, 0);
        var_ei_do = new ei(MenuChinhAvatar.Z, 7);
        var_ei_char = new ei(null, 2);
        var_ei_byte = new ei(null, 3);
        ((dL)this).cfr_renamed_4 = var_ei_do;
    }

    public final void cfr_renamed_18() {
        ee_0.var_short_do = (short)-1;
        ea_0.var_short_do = (short)-1;
        ((dL)this).cfr_renamed_2 = null;
        el_0.el_0_do().cfr_renamed_4(25, 0);
    }

    public final void (Graphics graphics != null) {
        GameCanvas.var_ef_0_do.cfr_renamed_4(graphics);
        GameCanvas.var_ef_0_do.cfr_renamed_1(graphics);
        if (bF.boolean_do(var_int_new)) {
            if (bF.boolean_int(this.cfr_renamed_27, 8)) {
                this.cfr_renamed_27 = 0;
            }
            dq_0 dq_02 = (dq_0)var_java_util_Vector_int.elementAt(var_int_new);
            graphics.drawImage(fe_0.var_javax_microedition_lcdui_Image_if, dq_02.var_byte_for * bn_0.cfr_renamed_6, (dq_02.var_short_if - 24 + this.cfr_renamed_27 / 2) * bn_0.cfr_renamed_6, 3);
            this.cfr_renamed_27 += 1;
            if ((0x13 ^ 0x21 ^ (0x43 ^ 0x74)) == 0) {
                return;
            }
        } else if (bF.boolean_int(GameCanvas.cfr_renamed_16) && (var_eq_0_if != null) && bF.boolean_try(bF.var_eq_0_if.var_int_if, -1) && bF.boolean_try(ef_0.soLuong, 25)) {
            if (bF.boolean_int(this.cfr_renamed_27, 8)) {
                this.cfr_renamed_27 = 0;
            }
            graphics.drawImage(fe_0.var_javax_microedition_lcdui_Image_if, (bF.var_eq_0_if.var_int_if * ef_0.var_int_if + ef_0.var_int_if / 2) * bn_0.cfr_renamed_6, (bF.var_eq_0_if.soLuong * ef_0.var_int_if - 4 + this.cfr_renamed_27 / 2) * bn_0.cfr_renamed_6, 3);
            this.cfr_renamed_27 += 1;
        }
        if (bF.boolean_try(ef_0.soLuong, 25)) {
            GameCanvas.var_ew_case.cfr_renamed_0(graphics, this.tenNhanVat, (bF.var_eq_0_do.var_int_if + 26) * bn_0.cfr_renamed_6, (bF.var_eq_0_do.soLuong - 14) * bn_0.cfr_renamed_6 + (bn_0.cfr_renamed_6 - 1) * 7, 2);
        }
        GameCanvas.cfr_renamed_1(graphics);
        ef_0.cfr_renamed_3(graphics);
        TienIchGame.cfr_renamed_0(graphics);
    }

    private static boolean boolean_new(int n, int n2) {
        return n <= n2;
    }

    public static void void_int(int n, int n2) {
        Object object;
        dY dY2;
        dq_0 dq_02 = (dq_0)var_java_util_Vector_int.elementAt(n);
        if (bF.boolean_if(n2)) {
            dY2 = ak_0.dY_do(dq_02.cfr_renamed_8);
            if (bF.boolean_for(dY2.dangChayAuto ? 1 : 0)) {
                GameCanvas.void_do(n2, dq_02.cfr_renamed_2 * ef_0.var_int_if + 11, dq_02.var_int_new * ef_0.var_int_if, dY2.var_short_arr_do[dq_02.soLuong]);
                } else {
                object = ak_0.var_bH_arr_do[dY2.var_short_arr_do[dq_02.soLuong]];
                GameCanvas.hienThongBaoPopup(n2, dq_02.cfr_renamed_2 * ef_0.var_int_if + 11, dq_02.var_int_new * ef_0.var_int_if, gc_0.cfr_renamed_0(((bH)object).cfr_renamed_4 * bn_0.cfr_renamed_6, ((bH)object).cfr_renamed_2 * bn_0.cfr_renamed_6, ((bH)object).cfr_renamed_5 * bn_0.cfr_renamed_6, ((bH)object).cfr_renamed_3 * bn_0.cfr_renamed_6, ak_0.var_javax_microedition_lcdui_Image_arr_do[((bH)object).cfr_renamed_1]), -1);
            }
        }
        if (bF.boolean_byte(soLuong, AngelChip.duLieuNguoiChoi.var_short_char)) {
            dq_02.soLuong = 6;
            dq_02.var_byte_do = (byte)100;
            dq_02.var_boolean_int = 0;
            dq_02.coKichHoat = 0;
            if (bF.boolean_if(AutoFarm.var_int_else)) {
                AutoFarm.var_int_else -= 1;
            }
        }
        dY2 = ak_0.dY_do(dq_02.cfr_renamed_8);
        if (bF.boolean_for(dY2.dangChayAuto ? 1 : 0)) {
            object = bF.gd_do(dY2.cfr_renamed_3);
            if ((object != null)) {
                ((gd)object).soLuong += n2;
                return;
            }
            object = new gd();
            new gd().var_short_do = dY2.cfr_renamed_3;
            ((gd)object).soLuong = n2;
            ((gd)object).mangSoNguyen[0] = dY2.var_short_if;
            ((gd)object).chuoiGiaTri = dY2.chuoiGiaTri;
            var_java_util_Vector_try.addElement(object);
            return;
        }
        object = gd.cfr_renamed_0(var_java_util_Vector_for, (int)dY2.cfr_renamed_5);
        if ((object != null)) {
            ((gd)object).soLuong += n2;
            return;
        }
        object = new gd();
        new gd().var_short_do = dY2.cfr_renamed_5;
        ((gd)object).soLuong = n2;
        ((gd)object).mangSoNguyen[0] = ak_0.dY_do((int)dY2.cfr_renamed_5).var_short_if;
        ((gd)object).chuoiGiaTri = ak_0.dY_do((int)dY2.cfr_renamed_5).chuoiGiaTri;
        var_java_util_Vector_for.addElement(object);
    }

    public static void cfr_renamed_10() {
        es.cfr_renamed_0().cfr_renamed_0(1);
    }

    public static void (int n, int n2, short s2 == null) {
        AngelChip.duLieuNguoiChoi.mangSoNguyen[0] = n2;
        em_0.var_boolean_int = 1;
        GameCanvas.cfr_renamed_1(MenuChinhAvatar.aa + n + MenuChinhAvatar.cl);
        gd gd2 = gd.cfr_renamed_0(var_java_util_Vector_for, (int)s2);
        if (bF.cfr_renamed_0((Object)gd2)) {
            gd2 = gd.cfr_renamed_0(var_java_util_Vector_try, (int)s2);
            var_java_util_Vector_try.removeElement(gd2);
            if ("   ".length() == " ".length()) {
                return;
            }
        } else {
            var_java_util_Vector_for.removeElement(gd2);
            }
        if ((GameCanvas.var_dL_do == em_0.em_0_do())) {
            em_0.em_0_do().cfr_renamed_2();
            if (bF.boolean_byte(ef_0.soLuong, 25)) {
                bF.cfr_renamed_16();
                em_0.em_0_do().void_for(2);
                if (-(107 + 14 - -27 + 49 ^ 33 + 39 - 52 + 173) >= 0) {
                    return;
                }
            } else {
                bF.cfr_renamed_5();
            }
        }
        GameCanvas.cfr_renamed_8();
    }

    static void void_new(int n, int n2) {
        bF.cfr_renamed_12(n, n2);
    }

    private static boolean boolean_try(int n, int n2) {
        return n != n2;
    }

    private static boolean boolean_int(int n) {
        return n == 0;
    }

    public static void (short s2 != short s3) {
        int n = 0;
        while (bF.boolean_for(n, bF.var_by_do.var_byte_arr_do.length)) {
            GameCanvas.void_do(0, bF.var_by_do.cfr_renamed_3 + bF.var_by_do.var_byte_arr_do[n], bF.var_by_do.var_short_if - 45 + bF.var_by_do.var_byte_arr_if[n], bF.var_by_do.cfr_renamed_3);
            ++n;
            if ((0x41 ^ 0x44) != 0) continue;
            return;
        }
        GameCanvas.void_if(s3, AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if - AngelChip.duLieuNguoiChoi.var_boolean_int, 10);
        bF.var_by_do.var_short_new = (short)0;
        gd gd2 = bF.gd_do(s2);
        if ((gd2 != null)) {
            gd2.soLuong += s3;
            } else {
            gd2 = new gd();
            new gd().var_short_do = s2;
            gd2.soLuong = s3;
            var_java_util_Vector_try.addElement(gd2);
        }
        if (bF.boolean_int(TienIchGame.coTrangThai ? 1 : 0)) {
            GameCanvas.cfr_renamed_8();
        }
    }

    private static boolean boolean_new(int n) {
        return n <= 0;
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_15() {
        block60: {
            block62: {
                block66: {
                    block65: {
                        block64: {
                            block63: {
                                block61: {
                                    block54: {
                                        block55: {
                                            block58: {
                                                block56: {
                                                    block59: {
                                                        block57: {
                                                            if (!bF.boolean_for((int)this.var_boolean_char) || !bF.boolean_int((int)AngelChip.duLieuNguoiChoi.var_boolean_int) || !bF.boolean_int(AngelChip.duLieuNguoiChoi.var_int_break) || !bF.boolean_byte((int)AngelChip.duLieuNguoiChoi.coKichHoat, AngelChip.duLieuNguoiChoi.var_short_else) || !bF.boolean_byte(AngelChip.duLieuNguoiChoi.var_short_if, (int)AngelChip.duLieuNguoiChoi.cfr_renamed_5)) break block54;
                                                            this.var_boolean_char = 0;
                                                            AngelChip.duLieuNguoiChoi.coKichHoat = 0;
                                                            this.cfr_renamed_25();
                                                            if (!bF.boolean_byte(bF.var_byte_for, -1)) break block54;
                                                            if (!bF.boolean_try(bF.soLuongKhoa, -1)) break block55;
                                                            if (!bF.boolean_if(this.var_java_util_Vector_goto.size()) || !bF.boolean_try(bF.soLuongKhoa, -1)) break block54;
                                                            var1_1 = (eq_0)this.var_java_util_Vector_goto.elementAt(0);
                                                            var2_9 = (dq_0)bF.var_java_util_Vector_int.elementAt(var1_1.cfr_renamed_3);
                                                            ((dq_0)bF.var_java_util_Vector_int.elementAt(var1_1.cfr_renamed_3)).dangChayAuto = 0;
                                                            bF.var_eq_0_if.var_int_if = var2_9.var_byte_for / ef_0.var_int_if;
                                                            bF.var_eq_0_if.soLuong = var2_9.var_short_if / ef_0.var_int_if;
                                                            if (!bF.boolean_for((int)this.var_boolean_else)) break block56;
                                                            if (!bF.boolean_byte(var2_9.soLuong, 5)) break block57;
                                                            this.cfr_renamed_24();
                                                            this.cfr_renamed_13();
                                                            if (((94 ^ 23) & ~(97 ^ 40)) <= -" ".length()) {
                                                                return;
                                                            }
                                                            break block58;
                                                        }
                                                        var3_13 = 0;
                                                        if (bF.boolean_try(var2_9.cfr_renamed_8, -1) && bF.boolean_for(var2_9.soLuong, 6) && bF.boolean_byte(var2_9.var_byte_new, 36)) {
                                                            this.cfr_renamed_0(new dg(this, var2_9));
                                                            var3_13 = 1;
                                                        }
                                                        if (!bF.boolean_try(var2_9.cfr_renamed_8, -1) || !bF.boolean_for(var2_9.soLuong, 6)) break block59;
                                                        if (!bF.boolean_for(var1_1.cfr_renamed_3, bF.var_java_util_Vector_int.size())) break block54;
                                                        if (bF.boolean_for((int)var2_9.coKichHoat) && bF.boolean_for((int)this.boolean_do(var1_1.cfr_renamed_3, 7))) {
                                                            var3_13 = 1;
                                                        }
                                                        if (bF.boolean_for((int)var2_9.var_boolean_int) && bF.boolean_for((int)this.boolean_do(var1_1.cfr_renamed_3, 3))) {
                                                            var3_13 = 1;
                                                        }
                                                        if (bF.boolean_for(var2_9.var_byte_for, 80)) {
                                                            var4_14 = 0;
                                                            var2_10 = 0;
                                                            while (bF.boolean_for(var2_10, bF.var_java_util_Vector_do.size())) {
                                                                var5_17 = bF.ff_do(((gd)bF.var_java_util_Vector_do.elementAt((int)var2_10)).var_short_do);
                                                                if (bF.boolean_byte(var5_17.var_byte_if, 2) && (!bF.boolean_try(var5_17.var_short_do, 111) || bF.boolean_byte(var5_17.var_short_do, 112))) {
                                                                    var4_14 = 1;
                                                                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, var1_1.cfr_renamed_3, var5_17.var_short_do);
                                                                    if (((32 ^ 58 ^ (145 ^ 178)) & (63 + 48 - -1 + 28 ^ 98 + 52 - 89 + 120 ^ -" ".length())) == 0) break;
                                                                    return;
                                                                }
                                                                ++var2_10;
                                                                if ((173 ^ 156 ^ (168 ^ 157)) == (247 ^ 190 ^ (121 ^ 52))) continue;
                                                                return;
                                                            }
                                                            if (bF.boolean_int(var4_14)) {
                                                                GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_41);
                                                            }
                                                        }
                                                    }
                                                    if (bF.boolean_int(var3_13)) {
                                                        this.cfr_renamed_13();
                                                    }
                                                    if (((21 ^ 39) & ~(169 ^ 155)) > 0) {
                                                        return;
                                                    }
                                                    break block58;
                                                }
                                                if (bF.boolean_byte(var2_9.soLuong, 5)) {
                                                    this.cfr_renamed_24();
                                                    this.cfr_renamed_13();
                                                    if (" ".length() != " ".length()) {
                                                        return;
                                                    }
                                                } else {
                                                    this.cfr_renamed_0(new cl_0(this, var2_9));
                                                    this.cfr_renamed_0(new an_0(this, var1_1));
                                                }
                                            }
                                            this.var_java_util_Vector_goto.removeElement(var1_1);
                                            break block54;
                                        }
                                        bF.soLuongKhoa = -1;
                                        this.cfr_renamed_22();
                                    }
                                    if (!bF.boolean_try(bF.var_int_new, -1)) break block60;
                                    if (!bF.boolean_for((int)GameCanvas.boolean_do(2))) break block61;
                                    GameCanvas.var_boolean_arr_for[2] = 0;
                                    var1_2 = bF.var_int_new;
                                    if (bF.boolean_for(var1_2 % 12 % 4)) {
                                        --var1_2;
                                    }
                                    if (bF.boolean_do(var1_2)) {
                                        bF.var_int_new = var1_2;
                                        if (" ".length() != " ".length()) {
                                            return;
                                        }
                                    }
                                    break block62;
                                }
                                if (!bF.boolean_for((int)GameCanvas.boolean_do(4))) break block63;
                                GameCanvas.var_boolean_arr_for[4] = 0;
                                var1_3 = bF.var_int_new;
                                if (bF.boolean_do(var1_3 -= 4)) {
                                    bF.var_int_new = var1_3;
                                    if ("  ".length() < ((120 ^ 67 ^ "   ".length()) & (116 ^ 55 ^ (16 ^ 107) ^ -" ".length()))) {
                                        return;
                                    }
                                }
                                break block62;
                            }
                            if (!bF.boolean_for((int)GameCanvas.boolean_do(6))) break block64;
                            GameCanvas.var_boolean_arr_for[6] = 0;
                            var1_4 = bF.var_int_new;
                            if (bF.boolean_for(var1_4 += 4, bF.var_java_util_Vector_int.size())) {
                                bF.var_int_new = var1_4;
                                if (((22 ^ 45 ^ (184 ^ 137)) & (107 ^ 58 ^ (8 ^ 83) ^ -" ".length())) < -" ".length()) {
                                    return;
                                }
                            }
                            break block62;
                        }
                        if (!bF.boolean_for((int)GameCanvas.boolean_do(8))) break block65;
                        GameCanvas.var_boolean_arr_for[8] = 0;
                        var1_5 = bF.var_int_new;
                        if (bF.boolean_try(var1_5 % 12 % 4, 3)) {
                            ++var1_5;
                        }
                        if (bF.boolean_for(var1_5, bF.var_java_util_Vector_int.size())) {
                            bF.var_int_new = var1_5;
                            if (((153 ^ 196) & ~(205 ^ 144)) != 0) {
                                return;
                            }
                        }
                        break block62;
                    }
                    if (!bF.boolean_for((int)GameCanvas.boolean_do(5))) break block62;
                    var1_6 = ef_0.var_int_if;
                    var2_9 = (dq_0)bF.var_java_util_Vector_int.elementAt(bF.var_int_new);
                    if (!bF.boolean_try(var2_9.cfr_renamed_8, -1) || !bF.boolean_for(var2_9.soLuong, 6)) break block66;
                    if (!bF.boolean_for((int)this.var_boolean_else)) ** GOTO lbl-1000
                    if (bF.boolean_int((int)var2_9.dangChayAuto)) {
                        this.var_java_util_Vector_goto.addElement(new eq_0(var2_9.var_byte_for / var1_6, var2_9.var_short_if / var1_6, bF.var_int_new));
                    }
                    var2_9.dangChayAuto = 1;
                    this.cfr_renamed_13();
                    if (-" ".length() > 0) {
                        return;
                    }
                    break block62;
                }
                if (bF.boolean_int((int)this.var_boolean_else)) {
                    if (bF.boolean_int((int)var2_9.dangChayAuto)) {
                        this.var_java_util_Vector_goto.addElement(new eq_0(var2_9.var_byte_for / var1_6, var2_9.var_short_if / var1_6, bF.var_int_new));
                    }
                    var2_9.dangChayAuto = 1;
                    this.cfr_renamed_13();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_34);
                }
            }
            if (bF.boolean_int(GameCanvas.cfr_renamed_16)) {
                var2_9 = (dq_0)bF.var_java_util_Vector_int.elementAt(bF.var_int_new);
                ek_0.ek_0_do().void_do(var2_9.var_byte_for, var2_9.var_short_if);
            }
        }
        if (bF.boolean_for((int)GameCanvas.coKichHoat) && bF.boolean_do((var2_11 = GameCanvas.var_int_if + ek_0.ek_0_do().cfr_renamed_3) / (var3_13 = ef_0.var_int_if * bn_0.cfr_renamed_6) * ef_0.var_short_if + (var1_7 = GameCanvas.soLuongKhoa + ek_0.ek_0_do().soLuong) / var3_13) && bF.boolean_new(var2_11 / var3_13 * ef_0.var_short_if + var1_7 / var3_13, ef_0.var_short_arr_if.length) && bF.boolean_byte(ef_0.var_short_arr_if[var2_11 / var3_13 * ef_0.var_short_if + var1_7 / var3_13], 51)) {
            this.var_boolean_try = 1;
            bF.dangChayAuto = 1;
            var3_13 = this.int_do(var1_7 / var3_13, var2_11 / var3_13);
            var4_15 = (dq_0)bF.var_java_util_Vector_int.elementAt(var3_13);
            bF.var_eq_0_if.var_int_if = var4_15.var_byte_for / ef_0.var_int_if;
            bF.var_eq_0_if.soLuong = var4_15.var_short_if / ef_0.var_int_if;
        }
        if (bF.boolean_for((int)this.var_boolean_try) && bF.boolean_for((int)GameCanvas.var_boolean_new)) {
            this.var_boolean_try = 0;
            bF.dangChayAuto = 0;
            var1_8 = GameCanvas.soLuongKhoa + ek_0.ek_0_do().soLuong;
            var2_12 = GameCanvas.var_int_if + ek_0.ek_0_do().cfr_renamed_3;
            var3_13 = ef_0.var_int_if * bn_0.cfr_renamed_6;
            if (bF.boolean_int((int)this.var_boolean_byte) && (this.cfr_renamed_5 != null) && (bF.var_eq_0_if != null) && bF.boolean_byte(var1_8 / var3_13, bF.var_eq_0_if.var_int_if) && bF.boolean_byte(var2_12 / var3_13, bF.var_eq_0_if.soLuong)) {
                this.cfr_renamed_5.cfr_renamed_1();
                if ((132 ^ 128) < " ".length()) {
                    return;
                }
            } else if (bF.boolean_do(var2_12 / var3_13 * ef_0.var_short_if + var1_8 / var3_13) && bF.boolean_new(var2_12 / var3_13 * ef_0.var_short_if + var1_8 / var3_13, ef_0.var_short_arr_if.length) && bF.boolean_byte(ef_0.var_short_arr_if[var2_12 / var3_13 * ef_0.var_short_if + var1_8 / var3_13], 51)) {
                var3_13 = this.int_do(var1_8 / var3_13, var2_12 / var3_13);
                var4_16 = (dq_0)bF.var_java_util_Vector_int.elementAt(var3_13);
                bF.var_eq_0_if.var_int_if = var4_16.var_byte_for / ef_0.var_int_if;
                bF.var_eq_0_if.soLuong = var4_16.var_short_if / ef_0.var_int_if;
                if (bF.boolean_for((int)this.var_boolean_byte) && bF.boolean_do(var3_13) && bF.boolean_for(var3_13, bF.var_java_util_Vector_int.size())) {
                    bF.var_int_new = var3_13;
                    if (bF.boolean_try(var4_16.cfr_renamed_8, -1) && bF.boolean_try(var4_16.soLuong, 5) && bF.boolean_for(var4_16.soLuong, 6)) {
                        GameCanvas.var_boolean_new = 0;
                        if (bF.boolean_for((int)this.var_boolean_else)) {
                            if (bF.boolean_int((int)var4_16.dangChayAuto)) {
                                this.var_java_util_Vector_goto.addElement(new eq_0(var1_8 / ef_0.var_int_if, var2_12 / ef_0.var_int_if, var3_13));
                            }
                            var4_16.dangChayAuto = 1;
                            this.cfr_renamed_13();
                            if ("  ".length() == 0) {
                                return;
                            }
                        } else if (bF.boolean_try(var4_16.soLuong, 5)) {
                            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cV);
                            if (" ".length() != " ".length()) {
                                return;
                            }
                        }
                    } else {
                        GameCanvas.var_boolean_new = 0;
                        if (bF.boolean_for((int)this.var_boolean_else) && bF.boolean_try(var4_16.soLuong, 5)) {
                            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_23);
                            if (" ".length() < 0) {
                                return;
                            }
                        } else {
                            if (bF.boolean_int((int)var4_16.dangChayAuto)) {
                                this.var_java_util_Vector_goto.addElement(new eq_0(var1_8 / ef_0.var_int_if, var2_12 / ef_0.var_int_if, var3_13));
                            }
                            var4_16.dangChayAuto = 1;
                            this.cfr_renamed_13();
                            if ("  ".length() == 0) {
                                return;
                            }
                        }
                    }
                } else {
                    GameCanvas.var_int_case = GameCanvas.soLuongKhoa -= ef_0.var_int_if * bn_0.cfr_renamed_6;
                    this.var_boolean_char = 1;
                }
            }
        }
        if (bF.boolean_for(GameCanvas.var_boolean_arr_do[5]) && (!bF.boolean_try(ef_0.soLuong, 24) || bF.boolean_byte(ef_0.soLuong, 53)) && (this.cfr_renamed_4 != null) && (this.cfr_renamed_5 == null)) {
            this.cfr_renamed_4.cfr_renamed_1();
        }
        super.cfr_renamed_15();
        GameCanvas.var_ef_0_do.cfr_renamed_0();
        if (bF.boolean_byte(bF.var_byte_for, -1)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_8();
        }
    }

    public final void void_for(int n) {
        dq_0 dq_02 = (dq_0)var_java_util_Vector_int.elementAt(n);
        if (bF.boolean_byte(dq_02.cfr_renamed_8, -1)) {
            this.cfr_renamed_0(dq_02, 2);
            if ("  ".length() != "  ".length()) {
                return;
            }
        } else {
            dY dY2 = ak_0.dY_if(dq_02.cfr_renamed_8);
            int n2 = dY2.var_short_do * 60 / 5;
            dq_02.soLuong = dq_02.var_short_do / n2;
            if (bF.boolean_int(dq_02.soLuong, 5)) {
                dq_02.soLuong = 5;
            }
            if (!bF.boolean_do(dq_02.var_short_do) || bF.boolean_try(dY2.cfr_renamed_2, -1) && !bF.boolean_new(dq_02.var_short_do - dY2.var_short_do * 60, dY2.cfr_renamed_2 * 60) || !bF.boolean_try(dq_02.var_byte_do, 100) || (dq_02.soLuong < 0)) {
                dq_02.soLuong = 6;
            }
            if (bF.boolean_for(dq_02.coTrangThai ? 1 : 0)) {
                this.cfr_renamed_0(dq_02, 3);
                if (-" ".length() >= 0) {
                    return;
                }
            } else {
                this.cfr_renamed_0(dq_02, 4);
            }
        }
        ef_0.var_short_arr_do[dq_02.var_int_new * ef_0.var_short_if + dq_02.cfr_renamed_2] = dq_02.var_byte_new;
    }

    public static void this() {
        Vector<eq_0> vector = new Vector<eq_0>();
        int n = 0;
        while (bF.boolean_for(n, var_java_util_Vector_if.size())) {
            int n2;
            ha ha2 = (ha)var_java_util_Vector_if.elementAt(n);
            fc_0 fc_02 = ak_0.fc_0_do((int)ha2.cfr_renamed_18);
            if (bF.boolean_for(ha2 instanceof eh_0)) {
                n2 = 0;
                int n3 = 0;
                while (bF.boolean_for(n3, vector.size())) {
                    eq_0 eq_02 = (eq_0)vector.elementAt(n3);
                    if (bF.boolean_byte(eq_02.cfr_renamed_3, ha2.cfr_renamed_18)) {
                        ((eh_0)ha2).cfr_renamed_10 = eq_02.var_int_if;
                        n2 = 1;
                        if ("  ".length() != -" ".length()) break;
                        return;
                    }
                    ++n3;
                    if (-"   ".length() < 0) continue;
                    return;
                }
                if (bF.boolean_int(n2)) {
                    ((eh_0)ha2).cfr_renamed_10 = ha2.cfr_renamed_12;
                    vector.addElement(new eq_0(ha2.cfr_renamed_12, 0, ha2.cfr_renamed_18));
                }
            }
            if (bF.boolean_if(n2 = fc_02.soLuong * 60 / 3)) {
                ha2.cfr_renamed_20 = ha2.this / n2;
            }
            if (bF.boolean_if(ha2.cfr_renamed_20, 2)) {
                ha2.cfr_renamed_20 = 2;
            }
            if (!bF.boolean_try(ha2.this, -1) || bF.boolean_byte(fc_02.var_byte_if, 3)) {
                ha2.cfr_renamed_20 = 0;
            }
            ++n;
            if ("   ".length() >= "  ".length()) continue;
            return;
        }
    }

    private static boolean boolean_byte(int n, int n2) {
        return n == n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void void_for() {
        this.cfr_renamed_26 += 2;
        if (bF.boolean_int(this.cfr_renamed_26, 10)) {
            this.cfr_renamed_26 = 0;
        }
        if (bF.boolean_try(bF.var_byte_for, -1)) {
            bF.var_byte_char = bF.var_byte_arr_arr_do[bF.var_byte_for][this.cfr_renamed_26];
            this.cfr_renamed_10 += 1;
            if (bF.boolean_if(this.cfr_renamed_10, 10)) {
                this.cfr_renamed_10 = 0;
                this.cfr_renamed_30();
            }
        }
        if (bF.boolean_byte(ef_0.soLuong, 24) && bF.boolean_byte(ef_0.soLuong, 53) && bF.boolean_if(bF.cfr_renamed_0((System.currentTimeMillis() - this.var_long_if) / 1000L, 300L))) {
            this.var_long_if = System.currentTimeMillis();
            this.cfr_renamed_1(bF.soLuong, 1);
        }
        GameCanvas.var_ef_0_do.cfr_renamed_3();
        if (bF.boolean_int((int)bF.coKichHoat) && bF.boolean_int((int)bF.dangChayAuto) && bF.boolean_byte(bF.soLuongKhoa, -1)) {
            this.cfr_renamed_25();
        }
        if (!bF.boolean_try(bF.var_byte_for, -1) || !bF.boolean_int((this.var_long_for != -1L)) || !bF.boolean_int((int)AngelChip.duLieuNguoiChoi.var_boolean_int)) ** GOTO lbl56
        this.var_long_for = System.currentTimeMillis() / 100L;
        var1_1 = -1;
        if ((this.var_eq_0_new != null)) {
            var1_1 = this.int_do(this.var_eq_0_new.var_int_if, this.var_eq_0_new.soLuong);
        }
        if (bF.boolean_byte(bF.var_byte_for, 4)) {
            var1_1 = 0;
        }
        if (bF.boolean_for(this.var_eq_0_new.var_int_if * ef_0.var_int_if, (int)AngelChip.duLieuNguoiChoi.coKichHoat)) {
            AngelChip.duLieuNguoiChoi.coKichHoat = bk_0.var_byte_case;
            if ((24 + 92 - -77 + 0 ^ 127 + 147 - 251 + 174) == 0) {
                return;
            }
        } else {
            AngelChip.duLieuNguoiChoi.coKichHoat = 0;
        }
        AngelChip.duLieuNguoiChoi.var_byte_goto = (byte)AngelChip.duLieuNguoiChoi.coKichHoat;
        if ((this.nhiemVuHienTai != null)) {
            this.nhiemVuHienTai.cfr_renamed_4 = 0;
            this.nhiemVuHienTai = null;
        }
        if (bF.boolean_byte(var1_1, -1)) {
            this.cfr_renamed_30();
            if ("  ".length() == 0) {
                return;
            }
        } else {
            var1_2 = new ea(-2, (int)AngelChip.duLieuNguoiChoi.coKichHoat, AngelChip.duLieuNguoiChoi.var_short_if - 5, bF.var_ep_new.cfr_renamed_3);
            ef_0.var_java_util_Vector_new.addElement(var1_2);
            var2_6 = 0;
            if (bF.boolean_int(bF.var_byte_for)) {
                var2_6 = 5;
                var1_2.cfr_renamed_1 = AngelChip.duLieuNguoiChoi.var_short_if - 8;
            }
            if (bF.boolean_int((int)AngelChip.duLieuNguoiChoi.coKichHoat)) {
                var1_2.cfr_renamed_3 = AngelChip.duLieuNguoiChoi.coKichHoat + 10 + var2_6;
                if ("   ".length() < " ".length()) {
                    return;
                }
            } else {
                var1_2.cfr_renamed_3 = AngelChip.duLieuNguoiChoi.coKichHoat - 10 - var2_6;
            }
lbl56:
            // 3 sources

            if (bF.boolean_for((this.var_long_for != -1L)) && (!bF.boolean_try(bF.var_byte_for, 1) || !bF.boolean_for(bF.var_byte_for) || bF.boolean_byte(bF.var_byte_for, 2)) && bF.boolean_if((System.currentTimeMillis() / 100L - this.var_long_for != 2L))) {
                this.var_long_for = System.currentTimeMillis() / 100L;
                if (bF.boolean_byte((int)AngelChip.duLieuNguoiChoi.var_boolean_int, 6)) {
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(0);
                    if ((59 ^ 63) < (30 ^ 26)) {
                        return;
                    }
                } else {
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(6);
                }
            }
        }
        if ((!bF.boolean_try(ef_0.soLuong, 24) || bF.boolean_byte(ef_0.soLuong, 53)) && bF.boolean_if(bF.var_java_util_Vector_if.size()) && bF.boolean_if(bF.cfr_renamed_24 += 1, 250)) {
            bF.cfr_renamed_24 = 0;
            var1_3 = gc_0.int_do(bF.var_java_util_Vector_if.size());
            var1_4 = (ha)bF.var_java_util_Vector_if.elementAt(var1_3);
            var2_7 = "";
            if (bF.boolean_for(var1_4.var_boolean_arr_do[0])) {
                var2_7 = var2_7 + MenuChinhAvatar.az;
            }
            if (bF.boolean_for(var1_4.var_boolean_arr_do[1])) {
                if (bF.boolean_int((int)var2_7.equals(""))) {
                    var2_7 = var2_7 + ", ";
                }
                var2_7 = var2_7 + MenuChinhAvatar.bo;
            }
            if (bF.boolean_for((int)var1_4.cfr_renamed_5)) {
                if (bF.boolean_int((int)var2_7.equals(""))) {
                    var2_7 = var2_7 + ", ";
                }
                var2_7 = var2_7 + MenuChinhAvatar.aC;
            }
            if (bF.boolean_for(var1_4.cfr_renamed_6, 20)) {
                if (bF.boolean_int((int)var2_7.equals(""))) {
                    var2_7 = var2_7 + ", ";
                }
                var2_7 = var2_7 + MenuChinhAvatar.bQ;
            }
            if (bF.boolean_int((int)var2_7.equals(""))) {
                var1_4.var_boolean_arr_do = (boolean[])new cf(25, var2_7, 0);
                var1_4.var_boolean_arr_do.void_do((int)var1_4.coKichHoat, var1_4.cfr_renamed_1 - 45);
            }
        }
        if (bF.boolean_do((System.currentTimeMillis() / 1000L - this.soXu / 1000L != 1L))) {
            if (bF.boolean_if(bF.var_int_char)) {
                bF.var_int_char -= 1;
            }
            this.soXu = System.currentTimeMillis();
            var1_5 = 0;
            while (bF.boolean_for(var1_5, bF.var_java_util_Vector_int.size())) {
                var2_8 = (dq_0)bF.var_java_util_Vector_int.elementAt(var1_5);
                if (bF.boolean_try(var2_8.cfr_renamed_8, -1) && bF.boolean_for(var2_8.soLuong, 5)) {
                    ++var2_8.soXu;
                    if (bF.boolean_new(bF.cfr_renamed_0((long)(ak_0.dY_do((int)var2_8.cfr_renamed_8).var_short_do * 60 * 60) - var2_8.soXu, 0L))) {
                        var2_8.soLuong = 5;
                    }
                }
                ++var1_5;
                if (((159 ^ 176) & ~(56 ^ 23)) <= 0) continue;
                return;
            }
        }
    }

        private static void cfr_renamed_23() {
        Vector<dF> vector = new Vector<dF>();
        int n = 0;
        while (bF.boolean_for(n, var_java_util_Vector_do.size())) {
            gd gd2 = (gd)var_java_util_Vector_do.elementAt(n);
            ff ff2 = bF.ff_do(gd2.var_short_do);
            if (bF.boolean_byte(ff2.var_byte_if, 5) && (!bF.boolean_try(ff2.var_byte_do, 4) || bF.boolean_byte(ff2.var_byte_do, 101))) {
                vector.addElement(new dF(ff2.chuoiGiaTri, new fp(gd2), ff2));
            }
            ++n;
            if (-" ".length() < 0) continue;
            return;
        }
        (vector == null);
    }

        public static void cfr_renamed_16() {
        Vector<Object> vector = new Vector<Object>();
        int n = 0;
        while (bF.boolean_for(n, ak_0.var_dY_arr_do.length)) {
            cz cz2 = new cz(MenuChinhAvatar.dg, (int)ak_0.var_dY_arr_do[n].cfr_renamed_5, n);
            vector.addElement(cz2);
            ++n;
            if ("   ".length() > 0) continue;
            return;
        }
        if (bF.boolean_try(ef_0.soLuong, 24) && bF.boolean_try(ef_0.soLuong, 53)) {
            n = ak_0.var_java_util_Vector_do.size();
            int n2 = 0;
            while (bF.boolean_for(n2, n)) {
                Object object = (fc_0)ak_0.var_java_util_Vector_do.elementAt(n2);
                object = new ct(MenuChinhAvatar.dg, n2, (fc_0)object, n2);
                vector.addElement(object);
                ++n2;
                if (-"   ".length() <= 0) continue;
                return;
            }
        }
        em_0.em_0_do().cfr_renamed_8();
        String[] stringArray = new String[3];
        stringArray[0] = MenuChinhAvatar.aM;
        stringArray[1] = MenuChinhAvatar.cw;
        stringArray[2] = MenuChinhAvatar.D;
        Vector[] vectorArray = new Vector[3];
        vectorArray[0] = vector;
        vectorArray[1] = bF.java_util_Vector_for();
        vectorArray[2] = bF.java_util_Vector_if();
        em_0.em_0_do().cfr_renamed_0(stringArray, vectorArray, null);
        if (bF.boolean_for(GameCanvas.var_boolean_byte ? 1 : 0) && bF.boolean_int(et_0.dangChayAuto ? 1 : 0)) {
            GameCanvas.var_et_0_do = new et_0();
            GameCanvas.var_et_0_do.cfr_renamed_1(em_0.var_em_0_do);
        }
    }

    public static void void_try(int n, int n2) {
        if (bF.boolean_try(n2, 3) && bF.boolean_int(em_0.boolean_do() ? 1 : 0)) {
            em_0.cfr_renamed_1();
            if (bF.boolean_for(GameCanvas.var_boolean_byte ? 1 : 0)) {
                GameCanvas.var_et_0_do = new et_0();
                if (bF.boolean_if(et_0.soLuong, 2)) {
                    et_0.soLuong -= 1;
                }
                GameCanvas.var_et_0_do.cfr_renamed_1(em_0.var_em_0_do);
                return;
            }
        } else {
            ff ff2;
            int n3 = em_0.int_do();
            int n4 = 0;
            int n5 = 0;
            if (bF.boolean_int(n2)) {
                dY dY2 = ak_0.dY_if(n);
                n4 = dY2.var_short_arr_if[0];
                n5 = dY2.var_short_arr_if[1];
                if ("  ".length() < 0) {
                    return;
                }
            } else if (bF.boolean_byte(n2, 2)) {
                n4 = ak_0.gd_do((int)n).mangSoNguyen[0];
                n5 = ak_0.gd_do((int)n).mangSoNguyen[1];
                } else if (bF.boolean_byte(n2, 4) && (ff2 = bF.ff_do(n) != null)) {
                n4 = ff2.var_int_if;
                n5 = ff2.soLuong;
            }
            GameCanvas.hienThongBaoPopup(n4 * n3, n5 * n3, new df_0(n, n3), new du_0(n, n3), null);
        }
    }

    static void (bF bF2 == null) {
        bF2.cfr_renamed_13();
    }

    public static gd gd_if(int n) {
        int n2 = 0;
        while (bF.boolean_for(n2, var_java_util_Vector_for.size())) {
            gd gd2 = (gd)var_java_util_Vector_for.elementAt(n2);
            if (bF.boolean_byte(gd2.var_short_do, n)) {
                return gd2;
            }
            ++n2;
            if ("  ".length() != 0) continue;
            return null;
        }
        return null;
    }

    private void cfr_renamed_24() {
        if (bF.boolean_byte(AngelChip.duLieuNguoiChoi.var_short_char, soLuong)) {
            int n = this.int_do(bF.var_eq_0_if.var_int_if, bF.var_eq_0_if.soLuong);
            AngelChip.duLieuNguoiChoi.getClass();
            dh_0.dh_0_do().cfr_renamed_3(soLuong, n);
        }
    }

    private static eq_0 (Vector vector != int n) {
        int n2 = 0;
        while (bF.boolean_for(n2, vector.size())) {
            eq_0 eq_02 = (eq_0)vector.elementAt(n2);
            if (bF.boolean_byte(eq_02.cfr_renamed_3, n)) {
                return eq_02;
            }
            ++n2;
            if (" ".length() != 0) continue;
            return null;
        }
        return null;
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                this.cfr_renamed_0(1, var_int_int);
                return;
            }
            case 2: {
                if (!(ef_0.var_aG_do != null)) break;
                GameCanvas.cfr_renamed_8();
                dh_0.dh_0_do().cfr_renamed_1(soLuong, ((bk_0)ef_0.var_aG_do).cfr_renamed_12);
                return;
            }
            case 3: {
                if (!(ef_0.var_aG_do != null)) break;
                fc_0 fc_02 = ak_0.fc_0_do((int)bF.ha_do((int)((bk_0)ef_0.var_aG_do).cfr_renamed_12).cfr_renamed_18);
                int n3 = 0;
                while (bF.boolean_for(n3, var_java_util_Vector_do.size())) {
                    if (bF.boolean_byte(n2, n3)) {
                        int n4;
                        gd gd2 = (gd)var_java_util_Vector_do.elementAt(n3);
                        if (bF.boolean_byte(fc_02.var_byte_if, 1)) {
                            n4 = 0;
                            if (" ".length() < " ".length()) {
                                return;
                            }
                        } else {
                            n4 = 1;
                        }
                        (gd2 != n4);
                    }
                    ++n3;
                    if ("  ".length() > 0) continue;
                    return;
                }
                return;
            }
            case 4: {
                if (!(ef_0.var_aG_do != null)) break;
                n = 0;
                while (bF.boolean_for(n, var_java_util_Vector_do.size())) {
                    if (bF.boolean_byte(n2, n)) {
                        gd gd3 = (gd)var_java_util_Vector_do.elementAt(n);
                        ff ff2 = bF.ff_do(gd3.var_short_do);
                        this.cfr_renamed_0(ff2, gd3.var_short_do, (ha)ef_0.var_aG_do);
                    }
                    ++n;
                    if (((0x8C ^ 0x83) & ~(0x9C ^ 0x93)) > -" ".length()) continue;
                    return;
                }
                return;
            }
            case 5: {
                n = 0;
                while (bF.boolean_for(n, var_java_util_Vector_char.size())) {
                    if (bF.boolean_byte(n, n2)) {
                        int n5 = this.int_do(bF.var_eq_0_if.var_int_if, bF.var_eq_0_if.soLuong);
                        if (bF.boolean_int(n5, var_java_util_Vector_int.size())) {
                            return;
                        }
                        bF.cfr_renamed_12(n, n5);
                    }
                    ++n;
                    if ("   ".length() > 0) continue;
                    return;
                }
                return;
            }
            case 6: {
                n = 0;
                while (bF.boolean_for(n, var_java_util_Vector_do.size())) {
                    if (bF.boolean_byte(n, n2)) {
                        gd gd4 = (gd)var_java_util_Vector_do.elementAt(n);
                        if (bF.boolean_if(gd4.soLuong)) {
                            int n6 = this.int_do(bF.var_eq_0_if.var_int_if, bF.var_eq_0_if.soLuong);
                            if (bF.boolean_for(n6, var_java_util_Vector_int.size()) && bF.boolean_for(var_java_util_Vector_do.size())) {
                                ff ff3 = bF.ff_do(gd4.var_short_do);
                                byte by2 = ff3.var_byte_if;
                                if (bF.boolean_try(by2, 7)) {
                                    if (bF.boolean_byte(by2, 1)) {
                                        this.cfr_renamed_0(2, (int)ff3.var_short_do);
                                        if ((88 + 146 - 146 + 76 ^ 104 + 73 - 48 + 31) < (0xC7 ^ 0x9C ^ (0xDD ^ 0x82))) {
                                            return;
                                        }
                                    } else {
                                        this.cfr_renamed_0(by2, (int)ff3.var_short_do);
                                    }
                                }
                                dh_0.dh_0_do().cfr_renamed_1(soLuong, n6, ff3.var_short_do);
                            }
                            if ((0xF9 ^ 0xC2 ^ (0x66 ^ 0x59)) <= " ".length()) {
                                return;
                            }
                        } else {
                            GameCanvas.cfr_renamed_1(MenuChinhAvatar.AutoKimCuong + gd4.chuoiGiaTri);
                        }
                    }
                    ++n;
                    return;
                }
                return;
            }
            case 7: {
                this.void_new(n2);
                return;
            }
            case 8: {
                this.void_do(5, -1);
                bF.cfr_renamed_6();
                return;
            }
            case 9: {
                this.var_boolean_else = 1;
                this.void_new(0);
                return;
            }
            case 10: {
                coKichHoat = 1;
                n = this.cfr_renamed_25;
                while (bF.boolean_for(n, var_java_util_Vector_if.size())) {
                    int n7;
                    ha ha2 = (ha)var_java_util_Vector_if.elementAt(n);
                    if (bF.boolean_for(ha2.var_boolean_arr_do[1])) {
                        ef_0.var_aG_do = ha2;
                        ek_0.ek_0_do().void_do(ha2.coKichHoat * bn_0.cfr_renamed_6, ha2.cfr_renamed_1 * bn_0.cfr_renamed_6);
                        ek_0.dangChayAuto = 1;
                        ((dL)this).cfr_renamed_5 = new ei(MenuChinhAvatar.aB, new dl_0(this, ha2));
                        ((dL)this).cfr_renamed_4 = var_ei_if;
                        ((dL)this).cfr_renamed_2 = var_ei_for;
                        n7 = 1;
                        if ("   ".length() < ((0x4D ^ 0x7F ^ (0x87 ^ 0xB8)) & (0x2C ^ 2 ^ (4 ^ 0x27) ^ -" ".length()))) {
                            return;
                        }
                    } else if (bF.boolean_for(ha2.var_boolean_arr_do[0])) {
                        ef_0.var_aG_do = ha2;
                        ek_0.ek_0_do().void_do(ha2.coKichHoat * bn_0.cfr_renamed_6, ha2.cfr_renamed_1 * bn_0.cfr_renamed_6);
                        ek_0.dangChayAuto = 1;
                        ((dL)this).cfr_renamed_5 = new ei(MenuChinhAvatar.aB, new cv_0(this, ha2));
                        ((dL)this).cfr_renamed_4 = var_ei_if;
                        ((dL)this).cfr_renamed_2 = var_ei_for;
                        n7 = 1;
                        if (((0x14 ^ 0x48) & ~(0x15 ^ 0x49)) < -" ".length()) {
                            return;
                        }
                    } else if (bF.boolean_for(ha2.cfr_renamed_5 ? 1 : 0) && bF.boolean_int(ha2 instanceof ea_0) && bF.boolean_int(ha2 instanceof ee_0)) {
                        ef_0.var_aG_do = ha2;
                        ek_0.ek_0_do().void_do(ha2.coKichHoat * bn_0.cfr_renamed_6, ha2.cfr_renamed_1 * bn_0.cfr_renamed_6);
                        ek_0.dangChayAuto = 1;
                        ((dL)this).cfr_renamed_5 = new ei(MenuChinhAvatar.cfr_renamed_44, new fm_0(this, ha2));
                        ((dL)this).cfr_renamed_4 = var_ei_if;
                        ((dL)this).cfr_renamed_2 = var_ei_for;
                        n7 = 1;
                        if ((" ".length() & (" ".length() ^ -" ".length())) != 0) {
                            return;
                        }
                    } else if (bF.boolean_for(ha2.cfr_renamed_6, 50)) {
                        ef_0.var_aG_do = ha2;
                        ek_0.ek_0_do().void_do(ha2.coKichHoat * bn_0.cfr_renamed_6, ha2.cfr_renamed_1 * bn_0.cfr_renamed_6);
                        ek_0.dangChayAuto = 1;
                        ((dL)this).cfr_renamed_5 = new ei(MenuChinhAvatar.au, new cz_0(this, ha2));
                        ((dL)this).cfr_renamed_4 = var_ei_if;
                        ((dL)this).cfr_renamed_2 = var_ei_for;
                        n7 = 1;
                        if ((0xAC ^ 0xA8) <= " ".length()) {
                            return;
                        }
                    } else {
                        n7 = 0;
                    }
                    if (bF.boolean_for(n7)) {
                        return;
                    }
                    this.cfr_renamed_25 += 1;
                    ++n;
                    if (" ".length() <= (0xD6 ^ 0xBF ^ (0x2D ^ 0x40))) continue;
                    return;
                }
                this.void_do(8, -1);
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.aZ);
                return;
            }
            case 11: {
                dh_0.dh_0_do().cfr_renamed_12(0, 0);
                return;
            }
            case 12: {
                dh_0 dh_02 = dh_0.dh_0_do();
                dh_02.cfr_renamed_0(85);
                dh_02.cfr_renamed_1();
                return;
            }
            case 13: {
                if (bF.boolean_if(bF.var_by_do.soLuong)) {
                    dh_0.dh_0_do().cfr_renamed_4(0);
                    return;
                }
                dh_0.dh_0_do().cfr_renamed_5(0);
                return;
            }
            case 14: {
                dh_0 dh_03 = dh_0.dh_0_do();
                dh_03.cfr_renamed_0(87);
                dh_03.cfr_renamed_1();
                return;
            }
            default: {
                return;
            }
            case 20: {
                this.cfr_renamed_2();
            }
        }
    }

    private void cfr_renamed_25() {
        if (bF.boolean_try(ef_0.soLuong, 25)) {
            int n;
            if (bF.boolean_byte(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, bk_0.var_byte_case)) {
                n = AngelChip.duLieuNguoiChoi.coKichHoat - 23;
                } else {
                n = AngelChip.duLieuNguoiChoi.coKichHoat + 23;
            }
            int n2 = AngelChip.duLieuNguoiChoi.var_short_if / ef_0.var_int_if;
            short s2 = ef_0.var_short_arr_if[n2 * ef_0.var_short_if + (n /= ef_0.var_int_if)];
            int n3 = this.int_do(n, n2);
            if (bF.boolean_byte(s2, 51) && bF.boolean_new(n3, var_java_util_Vector_int.size())) {
                bF.var_eq_0_if.var_int_if = n;
                bF.var_eq_0_if.soLuong = n2;
                if (bF.boolean_for(var_byte_for) && bF.boolean_try(var_byte_for, 1)) {
                    ((dL)this).cfr_renamed_5 = var_ei_case;
                    return;
                }
                ((dL)this).cfr_renamed_5 = null;
                return;
            }
            if (!bF.cfr_renamed_0(((dL)this).cfr_renamed_5, var_ei_case) || bF.cfr_renamed_1(((dL)this).cfr_renamed_5, var_ei_byte)) {
                ((dL)this).cfr_renamed_5 = null;
            }
            bF.var_eq_0_if.var_int_if = -1;
            bF.var_eq_0_if.soLuong = -1;
            if ((ef_0.var_aG_do == null)) {
                n2 = ef_0.int_do(AngelChip.duLieuNguoiChoi.coKichHoat + 12, AngelChip.duLieuNguoiChoi.var_short_if);
                n = ef_0.int_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if + 12);
                if ((!bF.boolean_byte(ef_0.var_short_arr_do[n2], 100) || bF.boolean_for(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0)) && bF.boolean_try(ef_0.var_short_arr_do[n], 14)) {
                    ((dL)this).cfr_renamed_5 = null;
                    n = 0;
                    if (" ".length() < ((0xD0 ^ 0xA7 ^ (3 ^ 0x4A)) & (24 + 32 - -34 + 74 ^ 63 + 21 - -31 + 39 ^ -" ".length()))) {
                        return;
                    }
                } else {
                    ((dL)this).cfr_renamed_5 = var_ei_byte;
                    n = 1;
                }
                if (bF.boolean_for(n)) {
                    return;
                }
            }
            if ((ef_0.var_aG_do != null) && bF.cfr_renamed_0(((dL)this).cfr_renamed_5)) {
                if (bF.cfr_renamed_0(((dL)this).cfr_renamed_2)) {
                    ((dL)this).cfr_renamed_2 = ef_0.var_ei_do;
                }
                ((dL)this).cfr_renamed_5 = var_ei_char;
            }
            if ((ef_0.var_aG_do == null)) {
                ((dL)this).cfr_renamed_2 = null;
            }
            if ((ef_0.var_aG_do == null) && bF.cfr_renamed_1(((dL)this).cfr_renamed_5, var_ei_char)) {
                ((dL)this).cfr_renamed_5 = null;
            }
        }
    }

    public final void void_byte(int n, int n2) {
        gd gd2;
        if ((!bF.boolean_try(ef_0.soLuong, 24) || bF.boolean_byte(ef_0.soLuong, 53)) && (gd2 = gd.cfr_renamed_0(var_java_util_Vector_char, n2) != null)) {
            dq_0 dq_02 = (dq_0)var_java_util_Vector_int.elementAt(n);
            ((dq_0)var_java_util_Vector_int.elementAt(n)).cfr_renamed_8 = n2;
            this.cfr_renamed_0(dq_02, 4);
            ef_0.var_short_arr_do[dq_02.var_int_new * ef_0.var_short_if + dq_02.cfr_renamed_2] = dq_02.var_byte_new;
            dq_02.soLuong = 0;
            dq_02.var_boolean_int = 0;
            dq_02.coKichHoat = 0;
            dq_02.var_short_do = (short)0;
            dq_02.soXu = 0L;
            dq_02.var_byte_for = (byte)100;
            dq_02.var_byte_do = (byte)0;
            gd2.soLuong -= 1;
            if (bF.boolean_new(gd2.soLuong)) {
                var_java_util_Vector_char.removeElement(gd2);
                }
        }
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.cfr_renamed_22();
                return;
            }
            case 1: {
                if ((GameCanvas.var_et_0_do != null) && !bF.boolean_for(et_0.coTrangThai ? 1 : 0)) break;
                u_0.cfr_renamed_0().cfr_renamed_0(this.var_java_util_Vector_case, 0);
                return;
            }
            case 2: {
                ff ff2;
                gd gd2;
                bF bF2 = this;
                Vector<ei> vector = new Vector<ei>();
                ha ha2 = bF.ha_do(((bk_0)ef_0.var_aG_do).cfr_renamed_12);
                fc_0 fc_02 = ak_0.fc_0_do((int)ha2.cfr_renamed_18);
                int n3 = 0;
                while (bF.boolean_for(n3, var_java_util_Vector_do.size())) {
                    gd2 = (gd)var_java_util_Vector_do.elementAt(n3);
                    ff2 = bF.ff_do(gd2.var_short_do);
                    if (bF.boolean_byte(ff2.var_byte_do, fc_02.var_byte_if) && bF.boolean_byte(ff2.var_byte_if, 5) && (!bF.boolean_try(fc_02.var_byte_if, 4) || bF.boolean_byte(fc_02.var_byte_if, 1))) {
                        int n4 = gd2.soLuong;
                        if (bF.boolean_byte(fc_02.var_byte_if, 4)) {
                            n4 -= var_java_util_Vector_arr_do[1].size();
                            } else if (bF.boolean_byte(fc_02.var_byte_if, 1)) {
                            n4 -= var_java_util_Vector_arr_do[0].size();
                        }
                        vector.addElement(new ay(ff2.chuoiGiaTri + "(" + n4 + ")", new gn_0(gd2, fc_02), ff2));
                    }
                    ++n3;
                    if (((0x17 ^ 0x5A) & ~(0x36 ^ 0x7B)) == 0) continue;
                    return;
                }
                n3 = 0;
                while (bF.boolean_for(n3, var_java_util_Vector_do.size())) {
                    gd2 = (gd)var_java_util_Vector_do.elementAt(n3);
                    ff2 = bF.ff_do(gd2.var_short_do);
                    if (!(!bF.boolean_try(ff2.var_byte_if, 5) || !bF.boolean_for(ff2.var_byte_do) || bF.boolean_try(ff2.var_byte_do, fc_02.var_byte_if) && bF.boolean_try(ff2.var_byte_do, 101) && (!bF.boolean_byte(ff2.var_byte_do, 100) || !bF.boolean_try(fc_02.var_byte_if, 4)) || bF.boolean_byte(ff2.var_byte_if, 4) && bF.boolean_int(ha2.var_boolean_arr_do[0]) && !bF.boolean_for(ha2.var_boolean_arr_do[1]) || bF.boolean_byte(ff2.var_byte_if, 6) && !bF.boolean_for(ha2.cfr_renamed_6, 100))) {
                        vector.addElement(new cl(ff2.chuoiGiaTri + "(" + gd2.soLuong + ")", new ao_0(bF2, ff2, gd2), ff2));
                    }
                    ++n3;
                    if (-" ".length() <= 0) continue;
                    return;
                }
                if (bF.boolean_byte(soLuong, AngelChip.duLieuNguoiChoi.var_short_char)) {
                    vector.addElement(new cq(MenuChinhAvatar.aH));
                }
                (vector == null);
                return;
            }
            case 3: {
                bF.cfr_renamed_23();
                return;
            }
            case 4: {
                this.cfr_renamed_17();
                return;
            }
            case 5: {
                ((dL)this).cfr_renamed_4 = var_ei_do;
                ((dL)this).cfr_renamed_2 = null;
                this.var_boolean_byte = 0;
                ek_0.dangChayAuto = 0;
                this.var_boolean_else = 0;
                this.var_java_util_Vector_goto.removeAllElements();
                n = 0;
                while (bF.boolean_for(n, var_java_util_Vector_int.size())) {
                    ((dq_0)bF.var_java_util_Vector_int.elementAt((int)n)).dangChayAuto = 0;
                    ++n;
                    if ("  ".length() >= "  ".length()) continue;
                    return;
                }
                var_int_new = -1;
                soLuongKhoa = -1;
                dangChayAuto = 0;
                return;
            }
            case 6: {
                bF.cfr_renamed_6();
                return;
            }
            case 7: {
                if (bF.boolean_try(soLuong, AngelChip.duLieuNguoiChoi.var_short_char) && bF.boolean_byte(ef_0.soLuong, 53)) {
                    gz_0.cfr_renamed_1();
                    return;
                }
                gz_0.cfr_renamed_4();
                return;
            }
            case 8: {
                coKichHoat = 0;
                ((dL)this).cfr_renamed_2 = null;
                ((dL)this).cfr_renamed_5 = null;
                ((dL)this).cfr_renamed_4 = var_ei_do;
                this.cfr_renamed_25 = 0;
                ek_0.dangChayAuto = 0;
                return;
            }
            case 9: {
                this.cfr_renamed_25 += 1;
                this.void_if(10, -1);
                return;
            }
            case 51: {
                dh_0.dh_0_do().void_do(soLuong, 1);
                this.var_long_if = System.currentTimeMillis();
                this.cfr_renamed_1(soLuong, 1);
                return;
            }
            case 52: {
                dh_0.dh_0_do().void_do(soLuong, 2);
                this.var_long_if = System.currentTimeMillis();
                this.cfr_renamed_1(soLuong, 1);
                return;
            }
            case 53: {
                this.cfr_renamed_0(0, -1);
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 54: {
                this.cfr_renamed_18();
            }
        }
    }

    public final void (int n == boolean bl) {
        this.var_boolean_case = bl;
        dh_0.dh_0_do().cfr_renamed_15(n);
    }

    private void (dq_0 dq_02 != int n) {
        if (bF.boolean_byte(dq_02.var_byte_int, 2)) {
            dq_02.var_byte_new = this.var_byte_arr_do[n];
            return;
        }
        dq_02.var_byte_new = this.var_byte_arr_if[n];
    }

    public static void cfr_renamed_8(int n, int n2) {
        ha ha2 = bF.ha_do(n);
        if (bF.boolean_if(n2) && (ha2 != null)) {
            fc_0 fc_02 = ak_0.fc_0_do((int)ha2.cfr_renamed_18);
            Object object = fc_02;
            gd gd2 = gd.cfr_renamed_0(var_java_util_Vector_for, (int)((fc_0)object).var_byte_do);
            if ((gd2 != null)) {
                gd2.soLuong += n2;
                if ("  ".length() < "  ".length()) {
                    return;
                }
            } else {
                gd2 = new gd();
                new gd().var_short_do = ((fc_0)object).var_byte_do;
                gd2.soLuong = n2;
                gd2.chuoiGiaTri = ((fc_0)object).tenNhanVat;
                gd2.mangSoNguyen[0] = ((fc_0)object).var_short_do;
                (gd2 == null);
                var_java_util_Vector_for.addElement(gd2);
            }
            if ((ci_0.cfr_renamed_1(fc_02.cfr_renamed_4) != null)) {
                object = null;
                if (bF.boolean_byte(fc_02.var_byte_if, 1)) {
                    object = (var_java_util_Vector_new !=  (int)ha2.cfr_renamed_18);
                    if ("  ".length() == " ".length()) {
                        return;
                    }
                } else if (bF.boolean_byte(fc_02.var_byte_if, 2)) {
                    object = (var_java_util_Vector_byte !=  (int)ha2.cfr_renamed_18);
                }
                if ((object != null)) {
                    GameCanvas.hienThongBaoPopup(n2, ((eq_0)object).var_int_if, ((eq_0)object).soLuong - 25, ci_0.cfr_renamed_1((short)fc_02.cfr_renamed_4).var_javax_microedition_lcdui_Image_do, -1);
                }
            }
        }
    }

    private static void (int n, eq_0 eq_02, byte by2, int n2, Vector vector == null) {
        int n3 = 0;
        int n4 = 0;
        while (bF.boolean_for(n4, var_java_util_Vector_if.size())) {
            ha ha2 = (ha)var_java_util_Vector_if.elementAt(n4);
            fc_0 fc_02 = ak_0.fc_0_do((int)ha2.cfr_renamed_18);
            if (bF.boolean_byte(fc_02.var_byte_if, n) && bF.boolean_try(fc_02.cfr_renamed_4, -1)) {
                int n5 = 0;
                int n6 = 0;
                while (bF.boolean_for(n6, vector.size())) {
                    if (bF.boolean_byte(((eq_0)vector.elementAt((int)n6)).cfr_renamed_3, ha2.cfr_renamed_18)) {
                        n5 = 1;
                        if (null == null) break;
                        return;
                    }
                    ++n6;
                    return;
                }
                if (bF.boolean_int(n5)) {
                    n6 = eq_02.var_int_if + n3 * 24;
                    vector.addElement(new eq_0(n6, eq_02.soLuong, ha2.cfr_renamed_18));
                    int n7 = ef_0.int_do(n6, eq_02.soLuong);
                    ef_0.var_short_arr_if[n7] = by2;
                    ef_0.cfr_renamed_0(n2, n6, eq_02.soLuong);
                    ++n3;
                }
            }
            ++n4;
            if (("   ".length() & ("   ".length() ^ -" ".length())) == 0) continue;
            return;
        }
    }

    public final void (Graphics graphics == null) {
        this.cfr_renamed_1(graphics);
        if (!(GameCanvas.var_et_0_do != null) || bF.boolean_int(et_0.coTrangThai ? 1 : 0)) {
            super.cfr_renamed_0(graphics);
        }
    }

    public static void (Vector vector == null) {
        int n = ef_0.var_int_if * bn_0.cfr_renamed_6;
        if (bF.boolean_for(GameCanvas.coTrangThai ? 1 : 0)) {
            n += n / 3;
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, GameCanvas.var_int_int, n, n);
    }

    private static Vector java_util_Vector_if() {
        Object object;
        gd gd2;
        Vector<Object> vector = new Vector<Object>();
        int n = var_java_util_Vector_for.size();
        int n2 = 0;
        while (bF.boolean_for(n2, n)) {
            gd2 = (gd)var_java_util_Vector_for.elementAt(n2);
            if (!bF.cfr_renamed_0(ak_0.dY_do((int)gd2.var_short_do)) || bF.boolean_int(gd2.var_short_do, 50)) {
                object = new aO(MenuChinhAvatar.aH, new co_0(n2), n2, gd2);
                vector.addElement(object);
            }
            ++n2;
            return null;
        }
        n2 = 0;
        while (bF.boolean_for(n2, var_java_util_Vector_try.size())) {
            gd2 = (gd)var_java_util_Vector_try.elementAt(n2);
            object = bF.ff_do(gd2.var_short_do);
            vector.addElement(new cw_0("", n2, (ff)object, n2, gd2));
            ++n2;
            return null;
        }
        return vector;
    }

    public static void (Vector vector, Vector vector2, Vector vector3, Vector vector4, byte by2, boolean bl == null) {
        var_java_util_Vector_char = vector;
        coTrangThai = bl;
        var_byte_int = by2;
        int n = var_java_util_Vector_char.size();
        by2 = (byte)0;
        while (bF.boolean_for(by2, n)) {
            gd gd2 = (gd)var_java_util_Vector_char.elementAt(by2);
            dY dY2 = ak_0.dY_do((int)gd2.var_short_do);
            if ((dY2 != null)) {
                gd2.chuoiGiaTri = dY2.chuoiGiaTri;
            }
            by2 = (byte)(by2 + 1);
            if ("   ".length() == "   ".length()) continue;
            return;
        }
        var_java_util_Vector_for = vector2;
        by2 = (byte)0;
        while (bF.boolean_for(by2, var_java_util_Vector_for.size())) {
            bF.cfr_renamed_0((gd)var_java_util_Vector_for.elementAt(by2));
            by2 = (byte)(by2 + 1);
            return;
        }
        var_java_util_Vector_do = vector3;
        var_java_util_Vector_try = vector4;
    }

    public static void (gd gd2, int n, int n2, int n3 == null) {
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(n, n2, n3);
        em_0.var_boolean_int = 1;
        if (bF.boolean_int(gd2.var_short_do, 50) && bF.boolean_new(gd2.var_short_do, 100)) {
            var_java_util_Vector_int = null;
        }
        if (bF.boolean_if(gd2.soLuong)) {
            if (bF.boolean_int(gd2.var_short_do, 111)) {
                Object object = gd.cfr_renamed_0(var_java_util_Vector_do, (int)gd2.var_short_do);
                if ((object != null)) {
                    ((gd)object).soLuong += gd2.soLuong;
                    return;
                }
                object = bF.ff_do(gd2.var_short_do);
                gd2.chuoiGiaTri = ((ff)object).chuoiGiaTri;
                var_java_util_Vector_do.addElement(gd2);
                return;
            }
            if (bF.boolean_new(gd2.var_short_do, 100) && bF.boolean_for(gd2.var_short_do, 50)) {
                gd gd3 = gd.cfr_renamed_0(var_java_util_Vector_char, (int)gd2.var_short_do);
                if ((gd3 != null)) {
                    gd3.soLuong += gd2.soLuong;
                    if (((0x28 ^ 0x60 ^ (0x37 ^ 0x58)) & (115 + 81 - 98 + 61 ^ 124 + 136 - 233 + 157 ^ -" ".length())) >= "  ".length()) {
                        return;
                    }
                } else {
                    var_java_util_Vector_char.addElement(gd2);
                    gd2.chuoiGiaTri = ak_0.dY_do((int)gd2.var_short_do).chuoiGiaTri;
                }
                if (bF.boolean_int(var_java_util_Vector_char.size())) {
                    var_java_util_Vector_char.addElement(gd2);
                }
            }
        }
    }

        private static void cfr_renamed_27() {
        mangSoNguyen = new int[65];
        24 = 0xAB ^ 0xB3;
        16 = 0x2D ^ 0xA ^ (0x30 ^ 7);
        2 = "  ".length();
        0 = (0xD3 ^ 0x9A) & ~(0xE5 ^ 0xAC);
        1 = " ".length();
        13 = 0xA4 ^ 0xA9;
        9 = 49 + 134 - 38 + 19 ^ 74 + 44 - 55 + 110;
        27 = 0x67 ^ 0x7C;
        17 = 0x32 ^ 0x54 ^ (0xEC ^ 0x9B);
        7 = 0x51 ^ 0x2A ^ (0x4D ^ 0x31);
        3 = "   ".length();
        5 = 100 + 95 - 78 + 50 ^ 41 + 53 - 63 + 131;
        33 = 0x32 ^ 0x13;
        34 = 0x43 ^ 0x61;
        35 = 0x87 ^ 0xB5 ^ (0x7B ^ 0x6A);
        36 = 0xC ^ 0x28;
        4 = 0xC1 ^ 0xC5;
        37 = 0x19 ^ 0x3C;
        120 = 0x3E ^ 0x46;
        121 = 0x56 ^ 0x2F;
        122 = 0x2C ^ 0x56;
        123 = 56 + 193 - 59 + 17 ^ 49 + 97 - 84 + 118;
        8 = 0x40 ^ 0x48;
        18 = 0x7A ^ 0x6B ^ "   ".length();
        101 = 0xCB ^ 0xAE;
        20 = 3 ^ 0x17;
        -1 = -" ".length();
        6 = 0xE1 ^ 0xA6 ^ (0x87 ^ 0xC6);
        80 = 0xCC ^ 0x8A ^ (0xBA ^ 0xAC);
        51 = 0xFF ^ 0x9C ^ (0x77 ^ 0x27);
        52 = 0xF ^ 0x29 ^ (0x2E ^ 0x3C);
        92 = 0x74 ^ 0x66 ^ (0x38 ^ 0x76);
        95 = 0x37 ^ 0x3D ^ (0x26 ^ 0x73);
        98 = 0xCF ^ 0xAD;
        50 = 0x2A ^ 0x1C ^ (0x6E ^ 0x6A);
        85 = 0x54 ^ 1;
        87 = 0x13 ^ 0x17 ^ (0xC1 ^ 0x92);
        40 = 0x2D ^ 5;
        23 = 27 + 85 - 9 + 61 ^ 134 + 97 - 85 + 33;
        14 = 0xBB ^ 0xB5;
        25 = 0x73 ^ 0x6A;
        30 = 0x2E ^ 0x30;
        -3 = -"   ".length();
        10 = 0xA9 ^ 0xA3;
        53 = 0x4A ^ 0x7F;
        -2 = -"  ".length();
        250 = 186 + 240 - 354 + 178;
        45 = 0xED ^ 0x94 ^ (0x5F ^ 0xB);
        60 = 0x7F ^ 0x43;
        100 = 112 + 171 - 50 + 2 ^ 91 + 139 - 158 + 71;
        12 = 0x19 ^ 0x15;
        111 = 0xFC ^ 0x93;
        112 = 0xC0 ^ 0x8E ^ (0xE ^ 0x30);
        -5 = -(0xC7 ^ 0xC2);
        26 = 0x59 ^ 0x43;
        55 = 0xCE ^ 0x86 ^ 73 + 45 - -7 + 2;
        849 = -(0xFFFFF9FF & 0xE8F) & (0xFFFFFFFF & 0xBDF);
        -8 = -(0xB ^ 3);
        86 = 0x51 ^ 7;
        -7 = -(0x7D ^ 0x7A);
        800 = -(0xFFFFFCEE & 0x6F9F) & (0xFFFFEFFF & 0x7FAD);
        11 = 134 + 114 - 222 + 181 ^ 123 + 28 - 124 + 169;
        54 = 0x16 ^ 0x20;
        -50 = -(0x95 ^ 0xA7);
        -51 = -(0x2F ^ 0x71 ^ (0xFC ^ 0x91));
    }

        private void (cp cp2 == null) {
        if (bF.boolean_try(var_byte_for, -1)) {
            this.var_java_util_Vector_else.addElement(cp2);
            return;
        }
        cp2.void_do();
    }

    protected static void (gd gd2 != int n) {
        int n2;
        int n3;
        int n4;
        if (bF.boolean_int(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0)) {
            n4 = 1;
            if ("  ".length() < 0) {
                return;
            }
        } else {
            n4 = n3 = -1;
        }
        if (bF.boolean_new(gd2.soLuong - (n2 = var_java_util_Vector_arr_do[n].size()))) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cX);
            return;
        }
        int n5 = 0;
        while (bF.boolean_for(n5, 3) && bF.boolean_for(n5, gd2.soLuong - n2)) {
            int n6;
            fa fa2 = new fa(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if - 40);
            ff ff2 = bF.ff_do(gd2.var_short_do);
            fa2.var_short_do = gd2.var_short_do;
            fa2.cfr_renamed_12 = fa2.soLuong = 2;
            fa2.var_int_new = -(4 + gc_0.int_do(3));
            fa2.cfr_renamed_2 = n3 * (2 + gc_0.int_do(3));
            fa2.cfr_renamed_11 = AngelChip.duLieuNguoiChoi.var_short_if - 20 + gc_0.int_do(4) * 5;
            if (bF.boolean_byte(ff2.var_byte_do, 4) && bF.boolean_byte(ef_0.var_short_arr_do[n6 = ef_0.int_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if + 23)], 14)) {
                fa2.cfr_renamed_11 = 50 + gc_0.int_do(50);
                fa2.cfr_renamed_2 = n3 * gc_0.int_do(3);
            }
            fa2.var_aj_0_do = new cU(fa2);
            var_java_util_Vector_arr_do[n].addElement(fa2);
            ef_0.var_java_util_Vector_int.addElement(fa2);
            ++n5;
            if ((0x78 ^ 0x21 ^ (0x77 ^ 0x2B)) > 0) continue;
            return;
        }
    }

    public static void void_int(int n) {
        int n2 = 0;
        while (bF.boolean_for(n2, ef_0.var_java_util_Vector_new.size())) {
            ea ea2 = (ea)ef_0.var_java_util_Vector_new.elementAt(n2);
            if (bF.boolean_byte(ea2.cfr_renamed_1, 8) && bF.boolean_byte(ea2.cfr_renamed_12, n)) {
                ef_0.var_java_util_Vector_new.removeElement(ea2);
                return;
            }
            ++n2;
            if (" ".length() >= 0) continue;
            return;
        }
    }

    private static Vector java_util_Vector_for() {
        Vector<ah> vector = new Vector<ah>();
        int n = 0;
        while (bF.boolean_for(n, ak_0.var_java_util_Vector_if.size())) {
            ff ff2 = (ff)ak_0.var_java_util_Vector_if.elementAt(n);
            if (bF.boolean_for(ff2.dangChayAuto ? 1 : 0) && (!bF.boolean_new(ff2.soLuong) || bF.boolean_if(ff2.var_int_if))) {
                vector.addElement(new ah(MenuChinhAvatar.dg, n, ff2, n));
            }
            ++n;
            if ("  ".length() != 0) continue;
            return null;
        }
        return vector;
    }

    public final void (int n, Vector object, Vector vector, byte by2, byte by3, short s2, int n2 == null) {
        block31: {
            block32: {
                var_byte_if = by2;
                var_byte_do = by3;
                var_short_do = s2;
                var_int_char = n2;
                soLuong = n;
                if (bF.boolean_try(n, AngelChip.duLieuNguoiChoi.var_short_char)) {
                    DuLieuNguoiChoi dd_02 = es.dd_0_do(n);
                    if ((dd_02 == null)) {
                        GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_else);
                        return;
                    }
                    if (bF.cfr_renamed_0((Object)dd_02.tenNhanVat)) {
                        dd_02.cfr_renamed_0((String)dd_02.var_short_do);
                    }
                    this.tenNhanVat = dd_02.tenNhanVat;
                    var_java_util_Vector_arr_do[0].removeAllElements();
                    var_java_util_Vector_arr_do[1].removeAllElements();
                    if (-" ".length() == " ".length()) {
                        return;
                    }
                } else {
                    this.tenNhanVat = AngelChip.duLieuNguoiChoi.tenNhanVat;
                }
                var_java_util_Vector_int = object;
                if (bF.boolean_try(ef_0.soLuong, 24) && bF.boolean_try(ef_0.soLuong, 53) && bF.boolean_int(var_java_util_Vector_if.size())) {
                    var_java_util_Vector_if = vector;
                }
                bF.this();
                if (!bF.boolean_for(this.var_boolean_case ? 1 : 0)) break block31;
                if (bF.boolean_int(var_boolean_int ? 1 : 0) && (!bF.boolean_try(ef_0.soLuong, 24) || !bF.boolean_try(ef_0.soLuong, 53))) break block32;
                var_boolean_int = 0;
                var_eq_0_if = new eq_0();
                var_byte_for = (byte)-1;
                this.cfr_renamed_10 = 0;
                ee_0.var_short_do = (short)-1;
                ea_0.var_short_do = (short)-1;
                this.var_eq_0_arr_do = new eq_0[4];
                GameCanvas.var_ef_0_do.void_do(25);
                GameCanvas.cfr_renamed_6 = 0;
                try {
                    var_int_if = eb_0.soLuong;
                    var_int_case = ee_0.var_byte_do + 1;
                    int n3 = bF.var_eq_0_int.var_int_if / 24 + 2;
                    InputStream inputStream = ef_0.java_io_InputStream_do(25);
                    ef_0.var_short_arr_do = new short[inputStream.available()];
                    int n4 = 0;
                    while (bF.boolean_for(n4, ef_0.var_short_arr_do.length)) {
                        ef_0.var_short_arr_do[n4] = (short)inputStream.read();
                        ++n4;
                        if (((0x72 ^ 0x30 ^ (0xAD ^ 0xA2)) & (92 + 71 - 71 + 102 ^ 72 + 125 - 62 + 8 ^ -" ".length())) <= 0) continue;
                        return;
                    }
                    object = new short[ef_0.var_short_arr_do.length + ef_0.var_short_do];
                    n = 0;
                    n2 = 0;
                    while (bF.boolean_for(n2, ef_0.var_short_arr_do.length)) {
                        object[n] = ef_0.var_short_arr_do[n2];
                        ++n;
                        if (bF.boolean_byte(n2 % ef_0.var_short_if, n3)) {
                            int n5 = 0;
                            while (bF.boolean_new(n5)) {
                                object[n] = ef_0.var_short_arr_do[n2];
                                ++n;
                                ++n5;
                                if (" ".length() != 0) continue;
                                return;
                            }
                        }
                        ++n2;
                        if (" ".length() >= 0) continue;
                        return;
                    }
                    ef_0.var_short_if = (short)(ef_0.var_short_if + 1);
                    ef_0.var_short_arr_do = (short[])object;
                    ef_0.var_java_util_Vector_new.removeAllElements();
                    ef_0.cfr_renamed_0(null, ef_0.soLuong + 1, 1);
                    AngelChip.duLieuNguoiChoi.coKichHoat += 24;
                    ef_0.cfr_renamed_0(849, bF.var_eq_0_for.var_int_if + 12 + gc_0.int_do(var_int_if - 2) * 24, bF.var_eq_0_for.soLuong + 12 + gc_0.int_do(3) * 24);
                    }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                if (-" ".length() >= 0) {
                    return;
                }
                var_java_util_Vector_new = new Vector();
                var_java_util_Vector_byte = new Vector();
                (1, gC.var_eq_0_do, 87, -8, var_java_util_Vector_new == null);
                (2, ee_0.cfr_renamed_1, 86, -7, var_java_util_Vector_byte == null);
                n = var_java_util_Vector_if.size();
                int n6 = 0;
                while (bF.boolean_for(n6, n)) {
                    ha ha2 = (ha)var_java_util_Vector_if.elementAt(n6);
                    if (bF.boolean_for(ha2 instanceof eb_0)) {
                        ((eb_0)ha2).cfr_renamed_2();
                        if (-(0xC ^ 8) >= 0) {
                            return;
                        }
                    } else if (bF.boolean_for(ha2 instanceof gC)) {
                        ((gC)ha2).cfr_renamed_2();
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else if (bF.boolean_for(ha2 instanceof ea_0)) {
                        ((ea_0)ha2).cfr_renamed_2();
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    } else if (bF.boolean_for(ha2 instanceof ee_0)) {
                        ((ee_0)ha2).cfr_renamed_2();
                        if (-" ".length() > (0x28 ^ 0x2C)) {
                            return;
                        }
                    } else {
                        ha2.cfr_renamed_2();
                    }
                    ef_0.var_java_util_Vector_do.addElement(ha2);
                    ++n6;
                    if (((25 + 126 - 31 + 104 ^ 164 + 174 - 174 + 35) & (2 ^ 0x23 ^ (0x65 ^ 0x63) ^ -" ".length())) == 0) continue;
                    return;
                }
                GameCanvas.cfr_renamed_6 = 1;
                GameCanvas.cfr_renamed_8();
            }
            n = 0;
            while (bF.boolean_for(n, ef_0.var_java_util_Vector_new.size())) {
                ea ea2 = (ea)ef_0.var_java_util_Vector_new.elementAt(n);
                if (bF.boolean_for(ea2.cfr_renamed_12, 800) && !bF.boolean_for(ea2.cfr_renamed_12, 100) || !bF.boolean_try(ea2.cfr_renamed_12, -3) || bF.boolean_for(ea2 instanceof dq_0)) {
                    ef_0.var_java_util_Vector_new.removeElement(ea2);
                    --n;
                }
                ++n;
                if (((0xD8 ^ 0x90 ^ (0xF ^ 0x53)) & (4 + 122 - -60 + 29 ^ 18 + 17 - -112 + 48 ^ -" ".length())) < "   ".length()) continue;
                return;
            }
            this.cfr_renamed_14();
            this.var_long_if = System.currentTimeMillis();
            this.soXu = System.currentTimeMillis();
            if ((GameCanvas.var_dL_do != this)) {
                this.cfr_renamed_8();
            }
            if (bF.boolean_for(GameCanvas.var_boolean_byte ? 1 : 0)) {
                et_0.cfr_renamed_5();
            }
            AngelChip.duLieuNguoiChoi.var_short_else = (short)(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0);
            AngelChip.duLieuNguoiChoi.cfr_renamed_5 = AngelChip.duLieuNguoiChoi.var_short_if;
        }
        this.var_boolean_case = 1;
        if (bF.boolean_try(var_int_try, -1)) {
            int n7 = var_int_try;
            AngelChip.duLieuNguoiChoi.var_short_else = (short)n7;
            AngelChip.duLieuNguoiChoi.coKichHoat = n7;
            AngelChip.duLieuNguoiChoi.cfr_renamed_5 = var_int_else;
            AngelChip.duLieuNguoiChoi.var_short_if = (short)(AngelChip.duLieuNguoiChoi.cfr_renamed_5 ? 1 : 0);
            var_int_try = -1;
            var_int_else = -1;
        }
        ((dL)this).cfr_renamed_4 = var_ei_do;
        ((dL)this).cfr_renamed_2 = null;
        ((dL)this).cfr_renamed_5 = null;
    }

    public static void (int n, int n2, Vector vector == null) {
        if (bF.boolean_byte(AngelChip.duLieuNguoiChoi.var_short_char, soLuong) && bF.boolean_do(n2) && bF.boolean_for(n2, vector.size())) {
            eq_0 eq_02 = (eq_0)vector.elementAt(n2);
            int n3 = 0;
            while (bF.boolean_for(n3, var_java_util_Vector_if.size())) {
                ha ha2 = (ha)var_java_util_Vector_if.elementAt(n3);
                fc_0 fc_02 = ak_0.fc_0_do((int)ha2.cfr_renamed_18);
                if (bF.boolean_if(ha2.cfr_renamed_19) && bF.boolean_byte(eq_02.cfr_renamed_3, ha2.cfr_renamed_18)) {
                    ha2.cfr_renamed_19 = 0;
                    if (bF.boolean_byte(n, 1) && bF.boolean_byte(fc_02.var_byte_if, n)) {
                        (ha2 == null);
                        bF.void_int(-50);
                    }
                    if (bF.boolean_byte(n, 2) && bF.boolean_byte(fc_02.var_byte_if, n)) {
                        (ha2 == null);
                        bF.void_int(-51);
                    }
                }
                ++n3;
                return;
            }
        }
    }
}

