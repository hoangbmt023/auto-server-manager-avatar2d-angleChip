/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;
import java.util.Vector;
import main.AngelChip;

public final class c {
    private static int[] mangSoNguyen;
    public static boolean dangChayAuto;

        static {
        c.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[12];
        -1 = -" ".length();
        0 = (0x63 ^ 0x28) & ~(0xEE ^ 0xA5);
        1 = " ".length();
        9 = 27 + 139 - 136 + 141 ^ 21 + 74 - 82 + 149;
        57 = 73 + 52 - 30 + 53 ^ 59 + 142 - 86 + 58;
        4 = 0x73 ^ 0x77;
        12 = 0x13 ^ 9 ^ (0x7E ^ 0x68);
        24 = 0x78 ^ 1 ^ (7 ^ 0x66);
        3 = "   ".length();
        51 = 0x4D ^ 0x7E;
        25 = 36 + 70 - 26 + 79 ^ 13 + 54 - -29 + 38;
        21 = 76 + 110 - 97 + 61 ^ 48 + 69 - 27 + 41;
    }

    public static void (String string >= String object) {
        object = new ei_0((String)object);
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.c, (cp)object));
        vector.addElement(new ei(MenuChinhAvatar.cfr_renamed_7, new gv()));
        GameCanvas.var_h_0_do.cfr_renamed_0(0);
        GameCanvas.hienThongBaoPopup(string, vector);
        dangChayAuto = 1;
    }

        public static void (String string != null) {
        GameCanvas.cfr_renamed_1(string);
    }

                    /*
     * Enabled aggressive block sorting
     */
    public static void (int n, byte by2, String[] stringArray, String string, String string2, boolean[] blArray != null) {
        if ((GameCanvas.var_e_0_do != null)) {
            GameCanvas.var_e_0_do = null;
        }
        GameCanvas.cfr_renamed_8();
        Vector<ei> vector = new Vector<ei>();
        int n2 = 0;
        while (!(n2 >= stringArray.length)) {
            int n3 = n2;
            vector.addElement(new ei(stringArray[n2], new dH(n3, n, by2)));
            ++n2;
        }
        if (c.cfr_renamed_0((Object)string)) {
            bL.cfr_renamed_0().cfr_renamed_0(vector, n, string, string2, blArray);
            return;
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    public static void (byte by2 != null) {
        if ((AngelChip.var_int_if == 9)) {
            dangChayAuto = 0;
        }
        System.out.println("doGetHandler: " + by2 + "    " + fe_0.var_byte_do);
        if ((ee.ee_do().var_ba_do != null)) {
            switch (by2) {
                case 3: {
                    al_0.cfr_renamed_0();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_9();
                    if (((0x56 ^ 0x1F) & ~(0xC ^ 0x45)) == 0) break;
                    return;
                }
                case 8: {
                    fe_0.fe_0_do().dangChayAuto = 1;
                    w_0.cfr_renamed_0();
                    if ((fe_0.var_int_if != -1)) {
                        eq.eq_do().cfr_renamed_10(fe_0.var_int_if);
                        fe_0.var_int_if = -1;
                        if (null == null) break;
                        return;
                    }
                    if ((fe_0.var_byte_do != -1)) {
                        GameCanvas.var_ef_0_do.void_do(57 + fe_0.var_byte_do);
                        if ((GameCanvas.var_boolean_byte ? 1 : 0 == null) && (ef_0.soLuong == 57)) {
                            GameCanvas.var_et_0_do = new et_0();
                            GameCanvas.var_et_0_do.cfr_renamed_0(fe_0.var_fe_0_do);
                        }
                        AngelChip.duLieuNguoiChoi.void_do(4);
                        GameCanvas.cfr_renamed_8();
                        if (((0xE ^ 0x17) & ~(0x97 ^ 0x8E)) <= "  ".length()) break;
                        return;
                    }
                    fe_0.fe_0_do().cfr_renamed_11();
                    GameCanvas.cfr_renamed_8();
                    if (-"  ".length() <= 0) break;
                    return;
                }
                case 9: {
                    gS.cfr_renamed_0();
                    if ((ef_0.cfr_renamed_10 == -1)) {
                        if ((t_0.dangChayAuto ? 1 : 0 != null)) {
                            if ((AngelChip.var_int_if == 12)) {
                                ef_0.var_int_if = 24;
                                ef_0.var_int_try = -1;
                                el_0.el_0_do().cfr_renamed_4(fe_0.var_int_int, -1);
                                if (null == null) break;
                                return;
                            }
                            if ((AngelChip.var_int_if == 3)) {
                                GameCanvas.var_gj_0_do.cfr_renamed_12();
                                el_0.el_0_do().cfr_renamed_4(fe_0.var_int_int, -1);
                                if (((0x7A ^ 0x5D) & ~(0x23 ^ 4)) == ((0xE1 ^ 0xB3) & ~(0xDF ^ 0x8D))) break;
                                return;
                            }
                            if ((fe_0.var_byte_do != -1)) {
                                fe_0.fe_0_do();
                                fe_0.cfr_renamed_13();
                                if ((0x70 ^ 0x74) >= 0) break;
                                return;
                            }
                            if ((fe_0.var_int_try != -1)) {
                                GameCanvas.cfr_renamed_5();
                                el_0.el_0_do().cfr_renamed_4(fe_0.var_int_try, -1);
                                fe_0.var_int_try = -1;
                                if ("  ".length() > 0) break;
                                return;
                            }
                            fe_0.fe_0_do().cfr_renamed_14();
                            if (" ".length() <= (0xC4 ^ 0xAB ^ (5 ^ 0x6E))) break;
                            return;
                        }
                        GameCanvas.var_gj_0_do.cfr_renamed_12();
                        t_0.cfr_renamed_0().cfr_renamed_8();
                        GameCanvas.cfr_renamed_8();
                        if ((0xC ^ 8) >= "   ".length()) break;
                        return;
                    }
                    ef_0.soLuongKhoa = -1;
                    if (" ".length() >= 0) break;
                    return;
                }
                case 10: {
                    if ((bQ.var_bQ_do == null)) {
                        bQ.var_bQ_do = new bQ();
                    }
                    ee.ee_do().var_ba_do = bQ.var_bQ_do;
                    if ((ak_0.soLuong == -1)) {
                        dh_0 dh_02 = dh_0.dh_0_do();
                        dh_02.cfr_renamed_0(51);
                        dh_02.cfr_renamed_0(ci_0.chuoiGiaTri);
                        dh_02.cfr_renamed_1();
                        if (-"  ".length() < 0) break;
                        return;
                    }
                    if ((bF.var_java_util_Vector_for == null)) {
                        dh_0.dh_0_do().cfr_renamed_5();
                        if ((0xBE ^ 0xBB) > 0) break;
                        return;
                    }
                    el_0.el_0_do().cfr_renamed_4(25, 0);
                    bF.cfr_renamed_11();
                    bF.bF_do().cfr_renamed_1(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12, 0);
                    if (-" ".length() < ((0xC9 ^ 0xB4 ^ (0x74 ^ 0x38)) & (0xB8 ^ 0xAB ^ (0xA6 ^ 0x84) ^ -" ".length()))) break;
                    return;
                }
                case 11: {
                    gj.cfr_renamed_0();
                    ef_0.soLuong = -1;
                    el_0.el_0_do().cfr_renamed_4(21, 0);
                    if (!(fe_0.var_int_new != -1)) break;
                    GameCanvas.cfr_renamed_5();
                    db_0.db_0_do().cfr_renamed_15(0);
                    if (((0xF2 ^ 0xB4) & ~(0xEB ^ 0xAD)) >= -" ".length()) break;
                    return;
                }
                case 12: {
                    if ((u.var_u_do == null)) {
                        u.var_u_do = new u();
                    }
                    ee.ee_do().var_ba_do = u.var_u_do;
                    eq eq2 = eq.eq_do();
                    GameCanvas.cfr_renamed_5();
                    eq2.cfr_renamed_0(1);
                    eq2.cfr_renamed_1();
                }
            }
        }
        AngelChip.var_int_if = by2;
    }

    public static void (byte by2, byte by3, String string != null) {
        if (c.cfr_renamed_0((int)by3)) {
            GameCanvas.hienThongBaoPopup(string, new ec_0(by2));
            return;
        }
        GameCanvas.cfr_renamed_1(string);
    }

    public static void cfr_renamed_0() {
        w_0.cfr_renamed_0();
        if ((ci_0.soLuong == -1)) {
            db_0.db_0_do().cfr_renamed_15();
            if (-" ".length() > 0) {
                return;
            }
        } else {
            fe_0.fe_0_do().cfr_renamed_11();
        }
        db_0.db_0_do().cfr_renamed_2(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12);
        ci_0.var_java_util_Hashtable_if = new Hashtable();
        ci_0.var_java_util_Hashtable_do = new Hashtable();
    }

        public static void (String string >= boolean bl) {
        if ((bl ? 1 : 0 == null)) {
            GameCanvas.cfr_renamed_1(string, new eo_0());
            return;
        }
        GameCanvas.cfr_renamed_1(string);
    }
}

