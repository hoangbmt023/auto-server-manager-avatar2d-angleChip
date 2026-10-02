/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

public final class fo
extends en {
    public static int soLuong;
    private static int cfr_renamed_8;
    public static fo var_fo_do;
    public static int var_int_if;
    private static int cfr_renamed_13;
    private boolean var_boolean_try;
    public Vector[] var_java_util_Vector_arr_do;
    private static en var_en_do;
    private static int cfr_renamed_9;
    public static boolean dangChayAuto;
    private static int cfr_renamed_14;
    private int cfr_renamed_23;
    private static int cfr_renamed_24;
    private int cfr_renamed_22;
    public static int soLuongKhoa;
    private static String tenNhanVat;
    public static boolean coTrangThai;
    private int cfr_renamed_17;
    private int cfr_renamed_29 = 0;
    private String[] var_java_lang_String_arr_do;
    public boolean coKichHoat = 0;
    private static int cfr_renamed_26;
    public static int var_int_int;
    private Vector var_java_util_Vector_do;
    private int cfr_renamed_27;
    private static boolean var_boolean_byte;
    private static String[] var_java_lang_String_arr_if;
    private static int[] mangSoNguyen;
    public static int cfr_renamed_4;
    private static Vector var_java_util_Vector_if;
    public static boolean var_boolean_int;
    public static String chuoiGiaTri;
    private int cfr_renamed_25;
    private static int cfr_renamed_28;
    public static int var_int_try;
    private fl_0[] var_fl_0_arr_do;
    private boolean[] var_boolean_arr_do;
    public static int var_int_byte;
    private static int cfr_renamed_31;
    public static int cfr_renamed_7;
    private int cfr_renamed_11;

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.void_if();
                return;
            }
            case 1: {
                fo fo2 = this;
                if (fo.boolean_if(var_int_try, fo2.var_java_util_Vector_arr_do[var_int_if].size())) {
                    ((fl_0)fo2.var_java_util_Vector_arr_do[fo.var_int_if].elementAt((int)fo.var_int_try)).var_de_do.void_do();
                    fo2.cfr_renamed_8();
                }
                return;
            }
            case 7: {
                dR.dR_do();
                dR.void_for(n2, 0);
                return;
            }
            case 8: {
                if (!fo.boolean_if(n2, bz.var_java_util_Vector_if.size())) break;
                gk_0 gk_02 = (gk_0)bz.var_java_util_Vector_if.elementAt(n2);
                dR.dR_do();
                dR.cfr_renamed_1(gk_02);
                return;
            }
            case 9: {
                if (!fo.boolean_if(n2, bz.var_java_util_Vector_for.size())) break;
                dg_0 dg_02 = (dg_0)bz.var_java_util_Vector_for.elementAt(n2);
                dR.dR_do();
                dR.void_for(dg_02.var_short_do, 4);
                return;
            }
            case 10: {
                if (!fo.boolean_if(n2, dR.var_java_util_Vector_do.size())) break;
                ee_0 ee_02 = (ee_0)dR.var_java_util_Vector_do.elementAt(n2);
                dR.dR_do();
                dR.cfr_renamed_1((int)ee_02.var_short_if, ee_02.chuoiGiaTri);
                return;
            }
            case 11: {
                if (!fo.boolean_if(n2, dR.var_java_util_Vector_new.size())) break;
                dg_0 dg_03 = dR.dg_0_do(((ee_0)dR.var_java_util_Vector_new.elementAt((int)n2)).var_short_if);
                dR.dR_do();
                dR.cfr_renamed_1((int)dg_03.var_short_do, dg_03.chuoiGiaTri);
                return;
            }
            case 12: 
            case 13: {
                return;
            }
            case 15: {
                byte[] byArray = new byte[2];
                byArray[1] = 102;
                byte[] byArray2 = byArray;
                if (!(n2 == 0) || (fh.var_byte_do == -1)) {
                    go_0.go_0_do();
                    go_0.cfr_renamed_8(byArray2[n2]);
                }
                fo.fo_do().void_if();
            }
        }
    }

    public final void void_if(int n, int n2) {
        var_en_do.void_if(n, n2);
    }

    private static void cfr_renamed_14() {
        if ((var_int_if == 1)) {
            dg_0 dg_02 = (dg_0)bz.var_java_util_Vector_for.elementAt(var_int_try);
            tenNhanVat = GameCanvas.cfr_renamed_1(dg_02.var_int_if * cfr_renamed_13, dg_02.soLuong * cfr_renamed_13, 1);
            if (" ".length() <= ((21 + 93 - -12 + 74 ^ 117 + 132 - 206 + 103) & (0x36 ^ 0x48 ^ (0x32 ^ 0x16) ^ -" ".length()))) {
                return;
            }
        } else {
            tenNhanVat = GameCanvas.cfr_renamed_1(bz.var_fb_0_arr_do[fo.var_int_try].var_short_arr_do[0] * cfr_renamed_13, bz.var_fb_0_arr_do[fo.var_int_try].var_short_arr_do[1] * cfr_renamed_13, 1);
        }
        if (fo.boolean_if(cfr_renamed_31 = GameCanvas.var_fz_0_try.cfr_renamed_1(tenNhanVat) + 16 + 30 * GameCanvas.cfr_renamed_12, 86 * dF.cfr_renamed_12)) {
            cfr_renamed_31 = 86 * dF.cfr_renamed_12;
        }
        if (fo.boolean_int(GameCanvas.cfr_renamed_12)) {
            cfr_renamed_31 = 86 + 40 * GameCanvas.cfr_renamed_12;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        block39: {
            block34: {
                block37: {
                    block38: {
                        block35: {
                            block36: {
                                fo.var_en_do.cfr_renamed_0(var1_1);
                                GameCanvas.hienThongBaoPopup(var1_1);
                                v_0.v_0_do().cfr_renamed_1(var1_1);
                                var1_1.setColor(0);
                                var1_1.translate(fo.cfr_renamed_8, v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.cfr_renamed_15);
                                if (fo.boolean_int((int)fo.coTrangThai)) {
                                    var2_2 = GameCanvas.cfr_renamed_1(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], AngelChip.duLieuNguoiChoi.mangSoNguyen[2], AngelChip.duLieuNguoiChoi.soLuong);
                                    var3_6 = GameCanvas.var_fz_0_case.cfr_renamed_1(var2_2);
                                    var4_9 = this.cfr_renamed_17;
                                    if ((hg.int_do(var4_9) > var3_6 + 20 - (fo.cfr_renamed_7 - 20))) {
                                        var4_9 = 0;
                                    }
                                    var1_1.setClip(0, 0, fo.cfr_renamed_7 - 20, 20);
                                    GameCanvas.var_fz_0_case.cfr_renamed_1(var1_1, var2_2, var4_9, 0, 0);
                                    if ((var3_6 > fo.cfr_renamed_7 - 20)) {
                                        if ((hg.int_do(this.cfr_renamed_17) > var3_6 + 50 - (fo.cfr_renamed_7 - 20))) {
                                            this.cfr_renamed_17 = 0;
                                        }
                                        this.cfr_renamed_17 -= 1;
                                    }
                                    var1_1.translate(0, fo.cfr_renamed_28);
                                }
                                if (!(this.var_java_util_Vector_arr_do[fo.var_int_if] != null)) break block34;
                                if (fo.boolean_int(this.var_boolean_arr_do[fo.var_int_if])) {
                                    GameCanvas.var_fz_0_case.cfr_renamed_1(var1_1, this.var_java_lang_String_arr_do[fo.var_int_if], 0, 0, 0);
                                    var1_1.translate(0, fo.cfr_renamed_28);
                                }
                                var1_1.setClip(0, 0, 5 * fo.soLuongKhoa, fo.cfr_renamed_4 * fo.soLuongKhoa - fo.var_int_byte);
                                var1_1.translate(0, -cg_0.cfr_renamed_9);
                                var2_3 = 0;
                                if (null == null) ** GOTO lbl32
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    v_0.cfr_renamed_1(var1_1, fo.soLuongKhoa * (var2_3 % fo.cfr_renamed_14), fo.soLuongKhoa * (var2_3 / fo.cfr_renamed_14), fo.soLuongKhoa, fo.soLuongKhoa);
                                    ++var2_3;
lbl32:
                                    // 2 sources

                                    ** while (!fo.boolean_do((int)var2_3, (int)(fo.cfr_renamed_9 * fo.cfr_renamed_14)))
                                }
lbl33:
                                // 1 sources

                                if (fo.cfr_renamed_4((int)this.var_boolean_try) && fo.cfr_renamed_4((int)fo.var_boolean_byte)) {
                                    v_0.cfr_renamed_1(3 + fo.var_int_try % fo.cfr_renamed_14 * fo.soLuongKhoa, fo.var_int_try / fo.cfr_renamed_14 * fo.soLuongKhoa + 3, fo.soLuongKhoa - 5, fo.soLuongKhoa - 5, 2293623, var1_1);
                                }
                                var2_3 = this.var_java_util_Vector_arr_do[fo.var_int_if].size();
                                var3_6 = cg_0.cfr_renamed_9 / fo.soLuongKhoa * fo.cfr_renamed_14;
                                if (fo.boolean_for(var3_6)) {
                                    var3_6 = 0;
                                }
                                if ((var4_9 = cg_0.cfr_renamed_9 / fo.soLuongKhoa * fo.cfr_renamed_14 + (fo.cfr_renamed_4 + 1) * fo.cfr_renamed_14 > this.var_java_util_Vector_arr_do[fo.var_int_if].size())) {
                                    var4_9 = this.var_java_util_Vector_arr_do[fo.var_int_if].size();
                                }
                                if (((69 ^ 15 ^ (193 ^ 191)) & (37 + 100 - 115 + 111 ^ 11 + 134 - -24 + 8 ^ -" ".length())) == 0) ** GOTO lbl47
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    ((fl_0)this.var_java_util_Vector_arr_do[fo.var_int_if].elementAt(var3_6)).cfr_renamed_1(var1_1, fo.soLuongKhoa * (var3_6 % fo.cfr_renamed_14), fo.soLuongKhoa * (var3_6 / fo.cfr_renamed_14));
                                    ++var3_6;
lbl47:
                                    // 2 sources

                                    ** while (fo.boolean_if((int)var3_6, (int)var4_9) && !fo.boolean_do((int)var3_6, (int)var2_3))
                                }
lbl48:
                                // 1 sources

                                var1_1.translate(0, cg_0.cfr_renamed_9 - fo.var_int_byte);
                                var1_1.setClip(0, 0, fo.cfr_renamed_7 - 9, fo.soLuong);
                                if (!(fo.cfr_renamed_4 == 2)) break block35;
                                if (fo.boolean_int((int)fo.coTrangThai) && (go_0.duLieuNguoiChoi != null)) {
                                    var1_1.translate(0, fo.cfr_renamed_28);
                                    var1_1.setColor(10674392);
                                    v0 = 30 * dF.cfr_renamed_12;
                                    if ((dF.cfr_renamed_12 == 2)) {
                                        v1 = 10;
                                        if ((44 ^ 42 ^ "  ".length()) < 0) {
                                            return;
                                        }
                                    } else {
                                        v1 = 0;
                                    }
                                    var1_1.fillTriangle(v0, fo.cfr_renamed_4 * fo.soLuongKhoa - v1, 8 * dF.cfr_renamed_12, fo.cfr_renamed_4 * fo.soLuongKhoa + 40 * dF.cfr_renamed_12, 30 * dF.cfr_renamed_12 + 22 * dF.cfr_renamed_12, fo.cfr_renamed_4 * fo.soLuongKhoa + 40 * dF.cfr_renamed_12);
                                    var1_1.setColor(13364969);
                                    var1_1.fillArc(8 * dF.cfr_renamed_12, fo.cfr_renamed_4 * fo.soLuongKhoa + 40 * dF.cfr_renamed_12 - 10 * dF.cfr_renamed_12, 44 * dF.cfr_renamed_12, 20 * dF.cfr_renamed_12, 0, 360);
                                    go_0.duLieuNguoiChoi.cfr_renamed_1(var1_1, 30 * dF.cfr_renamed_12, fo.cfr_renamed_4 * fo.soLuongKhoa + 45 * dF.cfr_renamed_12, 0);
                                    var1_1.translate(60 * dF.cfr_renamed_12, 0);
                                }
                                var3_7 = var1_1;
                                var2_4 = this;
                                if (!(fo.var_java_util_Vector_if != null) || !fo.boolean_if(fo.var_int_try, var2_4.var_java_util_Vector_arr_do[fo.var_int_if].size())) break block36;
                                if (fo.boolean_int((int)fo.coTrangThai)) {
                                    v2 = 80;
                                    } else {
                                    v2 = 0;
                                }
                                var4_9 = v2;
                                var3_7.setClip(0, fo.cfr_renamed_4 * fo.soLuongKhoa, fo.cfr_renamed_7 - var4_9 + 5, fo.soLuong);
                                var5_10 = 0;
                                if ("  ".length() > ((242 ^ 146 ^ (25 ^ 51)) & (34 ^ 97 ^ (110 ^ 103) ^ -" ".length()))) ** GOTO lbl94
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    var6_12 = (fx)fo.var_java_util_Vector_if.elementAt(var5_10);
                                    var7_15 = 0;
                                    if ((var6_12.soLuong > fo.cfr_renamed_7 + 5 - var4_9)) {
                                        var6_12.cfr_renamed_1(fo.cfr_renamed_7 + 5 - var4_9);
                                        if (fo.boolean_do(var6_12.cfr_renamed_5)) {
                                            var7_15 = var6_12.cfr_renamed_5;
                                        }
                                    }
                                    GameCanvas.var_fz_0_case.cfr_renamed_1(var3_7, var6_12.chuoiGiaTri, 2 - var7_15, fo.cfr_renamed_4 * fo.soLuongKhoa + var5_10 * fo.cfr_renamed_26, 0);
                                    ++var5_10;
lbl94:
                                    // 2 sources

                                    ** while (!fo.boolean_do((int)var5_10, (int)fo.var_java_util_Vector_if.size()))
                                }
                            }
                            if (((247 ^ 194 ^ (47 ^ 82)) & (207 ^ 182 ^ (127 ^ 78) ^ -" ".length())) >= "  ".length()) {
                                return;
                            }
                            break block37;
                        }
                        var3_8 = var1_1;
                        var2_5 = this;
                        if (fo.boolean_if(GameCanvas.int_do() - var2_5.cfr_renamed_29) && !fo.boolean_int((int)fo.dangChayAuto)) break block38;
                        if (((99 ^ 44 ^ (228 ^ 172)) & (77 + 132 - 189 + 134 ^ 3 + 59 - 15 + 110 ^ -" ".length())) != 0) {
                            return;
                        }
                        break block37;
                    }
                    if (!(fo.var_java_util_Vector_if != null) || !fo.boolean_if(fo.var_int_try, var2_5.var_java_util_Vector_arr_do[fo.var_int_if].size())) break block37;
                    var4_9 = fo.var_int_try % fo.cfr_renamed_14 * fo.soLuongKhoa - var2_5.cfr_renamed_25 / 2 + fo.soLuongKhoa / 2;
                    var5_11 = (fo.var_int_try / fo.cfr_renamed_14 + 1) * fo.soLuongKhoa - cg_0.cfr_renamed_9 + 5;
                    var6_13 = fo.var_java_util_Vector_if.size() * dF.var_byte_new + (dF.cfr_renamed_15 << 1) + 8;
                    if ((var5_11 + var6_13 + fo.var_int_int + 12 > GameCanvas.var_int_case)) {
                        var5_11 -= var6_13 + fo.soLuongKhoa + 10;
                    }
                    if (fo.boolean_for(var5_11 + fo.var_int_int)) {
                        var5_11 = -fo.var_int_int;
                    }
                    if ((var4_9 + fo.cfr_renamed_8 + 5 + var2_5.cfr_renamed_25 > GameCanvas.soLuongKhoa)) {
                        var4_9 = GameCanvas.soLuongKhoa - (fo.cfr_renamed_8 + 5 + var2_5.cfr_renamed_25);
                        if ((23 ^ 19) <= "  ".length()) {
                            return;
                        }
                    } else if (fo.boolean_for(var4_9 + fo.cfr_renamed_8)) {
                        var4_9 = -fo.cfr_renamed_8;
                    }
                    var3_8.setClip(var4_9, var5_11, var2_5.cfr_renamed_25, var6_13 * dF.cfr_renamed_12);
                    GameCanvas.var_fa_0_do.cfr_renamed_1(var3_8, var4_9, var5_11, var2_5.cfr_renamed_25, var6_13, v_0.var_int_arr_for[2], v_0.var_int_arr_for[3], 1);
                    var4_9 += dF.cfr_renamed_15;
                    var5_11 += dF.cfr_renamed_15 - dF.var_byte_new / 2;
                    var7_16 = 0;
                    if ("  ".length() != ((63 ^ 40) & ~(130 ^ 149))) ** GOTO lbl145
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_14 = (fx)fo.var_java_util_Vector_if.elementAt(var7_16);
                        var8_17 = 0;
                        if ((var6_14.soLuong > var2_5.cfr_renamed_25 + 5)) {
                            var6_14.cfr_renamed_1(var2_5.cfr_renamed_25);
                            if (fo.boolean_do(var6_14.cfr_renamed_5)) {
                                var8_17 = var6_14.cfr_renamed_5;
                            }
                        }
                        GameCanvas.var_fz_0_case.cfr_renamed_1(var3_8, var6_14.chuoiGiaTri, var4_9 - var8_17, var5_11 + 5 + var7_16 * fo.cfr_renamed_26, 0);
                        ++var7_16;
lbl145:
                        // 2 sources

                        ** while (!fo.boolean_do((int)var7_16, (int)fo.var_java_util_Vector_if.size()))
                    }
                }
                if (fo.boolean_int((int)fo.dangChayAuto)) {
                    GameCanvas.hienThongBaoPopup(var1_1);
                    var1_1.translate(fo.cfr_renamed_8, GameCanvas.var_cg_0_do.cfr_renamed_8);
                    GameCanvas.var_fa_0_do.cfr_renamed_1(var1_1, fo.var_int_try, fo.cfr_renamed_14, fo.soLuongKhoa, fo.cfr_renamed_31, fo.cfr_renamed_24, fo.var_int_if, fo.cfr_renamed_13, fo.tenNhanVat, this.cfr_renamed_23, this.cfr_renamed_27);
                    }
                break block39;
            }
            var1_1.setClip(-5, 0, fo.cfr_renamed_7 - 10, fo.soLuong);
            ((fl_0)this.var_java_util_Vector_do.elementAt(fo.var_int_if)).cfr_renamed_1(var1_1, 0, 0);
        }
        if (!(GameCanvas.var_fv_do != null) || !fo.cfr_renamed_4((int)fv.coTrangThai) || fo.cfr_renamed_4((int)fv.dangChayAuto)) {
            super.cfr_renamed_1(var1_1);
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_do(int n) {
        return n >= 0;
    }

    public final void cfr_renamed_4() {
        var_en_do = GameCanvas.var_en_do;
        this.cfr_renamed_22 = GameCanvas.var_int_case + 50;
        this.cfr_renamed_29 = GameCanvas.int_do();
        var_boolean_int = 1;
        cfr_renamed_31 = 86;
        if (fo.boolean_int(GameCanvas.cfr_renamed_12)) {
            cfr_renamed_31 = 86 + 40 * GameCanvas.cfr_renamed_12;
        }
        coTrangThai = 0;
        super.cfr_renamed_4();
    }

    public static void cfr_renamed_2() {
        cfr_renamed_7 = soLuongKhoa * 5 + 11 + dF.cfr_renamed_15 + 2;
        soLuong = soLuongKhoa * 6 + 10 + dF.cfr_renamed_15;
        cfr_renamed_8 = GameCanvas.cfr_renamed_15 - soLuongKhoa * 5 / 2;
        var_int_int = (GameCanvas.var_int_case - en.cfr_renamed_10) / 2 - soLuong / 2;
    }

    public final void (fl_0 fl_02, int n == null) {
        this.var_fl_0_arr_do[n] = fl_02;
    }

    public static void cfr_renamed_3() {
        dangChayAuto = 1;
        fo.cfr_renamed_14();
    }

    public static fo fo_do() {
        if ((var_fo_do == null)) {
            var_fo_do = new fo();
        }
        return var_fo_do;
    }

    public static void cfr_renamed_5() {
        var_boolean_int = 0;
        var_java_util_Vector_if.removeAllElements();
        if (fo.boolean_int(dangChayAuto ? 1 : 0)) {
            fo.cfr_renamed_14();
        }
    }

        public final void cfr_renamed_8() {
        if ((this.var_java_util_Vector_arr_do[var_int_if] != null) && fo.boolean_if(var_int_try, this.var_java_util_Vector_arr_do[var_int_if].size())) {
            ((dF)this).cfr_renamed_3 = (fl_0)this.var_java_util_Vector_arr_do[var_int_if].elementAt(var_int_try);
            if ("   ".length() < 0) {
                return;
            }
        } else if ((this.var_java_util_Vector_do != null) && fo.boolean_if(var_int_if, this.var_java_util_Vector_do.size())) {
            fl_0 fl_02 = (fl_0)this.var_java_util_Vector_do.elementAt(var_int_if);
            if ((fl_02 != null)) {
                ((dF)this).cfr_renamed_3 = fl_02;
                if (((0x69 ^ 0x6D ^ (0x60 ^ 0x3A)) & (53 + 20 - 31 + 212 ^ 37 + 21 - 40 + 142 ^ -" ".length())) != 0) {
                    return;
                }
            }
        } else {
            ((dF)this).cfr_renamed_3 = null;
        }
        var_boolean_int = 1;
        this.cfr_renamed_29 = GameCanvas.int_do();
    }

    public final void (int n, boolean bl == null) {
        if (fo.boolean_int(dangChayAuto ? 1 : 0)) {
            return;
        }
        if ((var_int_try == n) && fo.cfr_renamed_0(((dF)this).cfr_renamed_3) && !(bl)) {
            ((dF)this).cfr_renamed_3.cfr_renamed_0();
        }
        var_int_try = n;
        this.cfr_renamed_8();
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    public static int int_do() {
        return cfr_renamed_13;
    }

    static {
        fo.this();
        cfr_renamed_14 = 5;
        cfr_renamed_4 = 5;
        var_int_try = 0;
        dangChayAuto = 0;
        cfr_renamed_13 = 0;
        var_int_byte = 0;
        var_java_util_Vector_if = new Vector();
        var_boolean_int = 0;
        coTrangThai = 0;
        var_boolean_byte = 0;
        cfr_renamed_31 = 0;
        tenNhanVat = "";
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_7() {
        block5: {
            fo.var_en_do.cfr_renamed_7();
            if (fo.boolean_int(this.cfr_renamed_22)) {
                this.cfr_renamed_22 += -this.cfr_renamed_22 >> 1;
            }
            if ((this.cfr_renamed_22 == -1)) {
                this.cfr_renamed_22 = 0;
            }
            if (!(this.var_java_util_Vector_arr_do[fo.var_int_if] != null)) break block5;
            var1_1 = this.var_java_util_Vector_arr_do[fo.var_int_if].size();
            var2_2 = 0;
            if ("   ".length() > -" ".length()) ** GOTO lbl16
            return;
lbl-1000:
            // 1 sources

            {
                if (fo.boolean_int((int)fo.var_boolean_int)) {
                    ((fl_0)this.var_java_util_Vector_arr_do[fo.var_int_if].elementAt(var2_2)).cfr_renamed_1();
                }
                ++var2_2;
lbl16:
                // 2 sources

                ** while (!fo.boolean_do((int)var2_2, (int)var1_1))
            }
        }
        if ((this.var_fl_0_arr_do[fo.var_int_if] != null)) {
            this.var_fl_0_try = this.var_fl_0_arr_do[fo.var_int_if];
            return;
        }
        this.var_fl_0_try = null;
    }

    public static void (String string == null) {
        if ((string != null)) {
            var_java_util_Vector_if.addElement(new fx(string, GameCanvas.var_fz_0_try.cfr_renamed_1(string)));
        }
    }

    public final void void_if() {
        if (fo.boolean_int(dangChayAuto ? 1 : 0)) {
            dangChayAuto = 0;
            return;
        }
        GameCanvas.var_cg_0_do.coTrangThai = 0;
        this.coKichHoat = 0;
        var_en_do.cfr_renamed_4();
        if (fo.boolean_int(GameCanvas.coKichHoat ? 1 : 0)) {
            if ((fh.var_int_char == 25) && fo.boolean_int(fv.soLuong)) {
                GameCanvas.var_fv_do = new fv();
                if ((fv.soLuong == 2)) {
                    fv.soLuong = 3;
                }
                GameCanvas.var_fv_do.cfr_renamed_0(go_0.var_go_0_do);
                AngelChip.duLieuNguoiChoi.var_byte_new = dd_0.var_byte_try;
                return;
            }
            if ((fh.var_int_char == 57)) {
                GameCanvas.var_fv_do = new fv();
                GameCanvas.var_fv_do.cfr_renamed_1(go_0.var_go_0_do);
            }
        }
    }

        private static boolean boolean_for(int n) {
        return n < 0;
    }

    private static boolean boolean_int(int n) {
        return n != 0;
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_6() {
        block38: {
            block40: {
                block46: {
                    block45: {
                        block42: {
                            block43: {
                                block44: {
                                    block41: {
                                        block39: {
                                            block37: {
                                                if (!fo.boolean_int((int)fo.dangChayAuto)) break block37;
                                                var1_1 = this;
                                                if (fo.boolean_int((int)GameCanvas.boolean_do(4))) {
                                                    var1_1.void_if(-1);
                                                    var1_1.cfr_renamed_23 = 5;
                                                    if (((45 ^ 86 ^ (186 ^ 133)) & (113 ^ 60 ^ (36 ^ 45) ^ -" ".length())) > 0) {
                                                        return;
                                                    }
                                                } else if (fo.boolean_int((int)GameCanvas.boolean_do(6))) {
                                                    var1_1.void_if(1);
                                                    var1_1.cfr_renamed_27 = 5;
                                                }
                                                if (fo.boolean_int((int)GameCanvas.boolean_do(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_case - GameCanvas.this))) {
                                                    GameCanvas.coTrangThai = 0;
                                                }
                                                if (fo.boolean_int((int)GameCanvas.var_boolean_new)) {
                                                    var2_3 = fo.var_int_try % fo.cfr_renamed_14 * fo.soLuongKhoa;
                                                    var3_5 = (fo.var_int_try / fo.cfr_renamed_14 + 1) * fo.soLuongKhoa;
                                                    if (fo.boolean_for(var2_3 + fo.soLuongKhoa / 2 - fo.cfr_renamed_31 / 2 + fo.cfr_renamed_8 + 5)) {
                                                        var2_3 = -fo.soLuongKhoa / 2 + fo.cfr_renamed_31 / 2 - fo.cfr_renamed_8 - 5;
                                                        if ((108 ^ 99 ^ (96 ^ 107)) != (122 ^ 76 ^ (160 ^ 146))) {
                                                            return;
                                                        }
                                                    } else if ((var2_3 + fo.soLuongKhoa / 2 - fo.cfr_renamed_31 / 2 + fo.cfr_renamed_31 > GameCanvas.soLuongKhoa)) {
                                                        var2_3 = GameCanvas.soLuongKhoa - fo.cfr_renamed_31 - fo.soLuongKhoa / 2 + fo.cfr_renamed_31 / 2;
                                                    }
                                                    var2_3 += fo.cfr_renamed_8;
                                                    var3_5 += fo.var_int_int + v_0.var_byte_do + dF.cfr_renamed_15;
                                                    var4_6 = (fo.cfr_renamed_24 - (dF.cfr_renamed_15 << 1)) / 4;
                                                    var3_5 += dF.cfr_renamed_15 + 8;
                                                    if (fo.boolean_int((int)GameCanvas.boolean_do(var2_3 = var2_3 + fo.soLuongKhoa / 2 - 35 * (GameCanvas.cfr_renamed_12 + 1) / 2 - 2 - 10 - 10 * dF.cfr_renamed_12, (var3_5 = var3_5 + var4_6 / 2 + var4_6 + dF.var_byte_try / 2) - 15 * dF.cfr_renamed_12 - 5, 20 + 20 * dF.cfr_renamed_12, 30 * dF.cfr_renamed_12))) {
                                                        var1_1.void_if(-1);
                                                        var1_1.cfr_renamed_23 = 5;
                                                        if ((97 ^ 101) <= "  ".length()) {
                                                            return;
                                                        }
                                                    } else if (fo.boolean_int((int)GameCanvas.boolean_do(var2_3 + 35 * (GameCanvas.cfr_renamed_12 + 1), var3_5 - 15 * dF.cfr_renamed_12 - 5, 20 + 20 * dF.cfr_renamed_12, 30 * dF.cfr_renamed_12))) {
                                                        var1_1.void_if(1);
                                                        var1_1.cfr_renamed_27 = 5;
                                                        if ("   ".length() != "   ".length()) {
                                                            return;
                                                        }
                                                    } else if (fo.boolean_int((int)GameCanvas.boolean_do(var2_3 + 20 + 20 * dF.cfr_renamed_12, var3_5 - 15 * dF.cfr_renamed_12 - 5, var2_3 + 35 * (GameCanvas.cfr_renamed_12 + 1) - (var2_3 + 20 + 20 * dF.cfr_renamed_12), 30 * dF.cfr_renamed_12))) {
                                                        var1_1.cfr_renamed_3.cfr_renamed_0();
                                                    }
                                                }
                                                if (fo.boolean_if(var1_1.cfr_renamed_23)) {
                                                    var1_1.cfr_renamed_23 -= 1;
                                                }
                                                if (fo.boolean_if(var1_1.cfr_renamed_27)) {
                                                    var1_1.cfr_renamed_27 -= 1;
                                                }
                                                if (-(43 ^ 101 ^ (241 ^ 187)) >= 0) {
                                                    return;
                                                }
                                                break block38;
                                            }
                                            var1_2 = this;
                                            if (!fo.boolean_int((int)GameCanvas.boolean_do(6))) break block39;
                                            if ((fo.var_int_try % fo.cfr_renamed_14 != fo.cfr_renamed_14 - 1) && (fo.cfr_renamed_14 != 1) && fo.cfr_renamed_4((int)fo.var_boolean_byte)) {
                                                fo.var_int_try += 1;
                                                if (-" ".length() >= 0) {
                                                    return;
                                                }
                                            } else {
                                                var1_2.void_do(1);
                                            }
                                            GameCanvas.var_cg_0_do.void_do(fo.var_int_try);
                                            var1_2.cfr_renamed_8();
                                            if ((("  ".length() ^ (38 ^ 112)) & (73 ^ 26 ^ (61 ^ 58) ^ -" ".length())) < ((81 ^ 43 ^ (12 ^ 109)) & (53 + 30 - -17 + 123 ^ 53 + 165 - 192 + 170 ^ -" ".length()))) {
                                                return;
                                            }
                                            break block40;
                                        }
                                        if (!fo.boolean_int((int)GameCanvas.boolean_do(4))) break block41;
                                        if (fo.boolean_int(fo.var_int_try % fo.cfr_renamed_14) && (fo.cfr_renamed_14 != 1) && fo.cfr_renamed_4((int)fo.var_boolean_byte)) {
                                            fo.var_int_try -= 1;
                                            if ((84 ^ 122 ^ (78 ^ 100)) < -" ".length()) {
                                                return;
                                            }
                                        } else {
                                            var1_2.void_do(-1);
                                        }
                                        GameCanvas.var_cg_0_do.void_do(fo.var_int_try);
                                        var1_2.cfr_renamed_8();
                                        if ((18 ^ 29 ^ (37 ^ 47)) <= 0) {
                                            return;
                                        }
                                        break block40;
                                    }
                                    if (!fo.boolean_int((int)GameCanvas.boolean_do(2))) break block42;
                                    if (!(var1_2.var_java_util_Vector_arr_do[fo.var_int_if] != null) || !fo.boolean_if(var1_2.var_java_util_Vector_arr_do[fo.var_int_if].size()) || !fo.cfr_renamed_4((int)fo.var_boolean_byte)) break block43;
                                    if (!fo.boolean_if(fo.var_int_try / fo.cfr_renamed_14)) break block44;
                                    fo.var_int_try -= fo.cfr_renamed_14;
                                    if (((60 ^ 17 ^ (16 ^ 93)) & (125 ^ 23 ^ (161 ^ 171) ^ -" ".length())) < -" ".length()) {
                                        return;
                                    }
                                    break block43;
                                }
                                var2_4 = 0;
                                if (((115 ^ 92) & ~(186 ^ 149)) == 0) ** GOTO lbl113
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    if ((var2_4 != fo.var_int_if)) {
                                        v_0.v_0_do().void_do(4, var2_4);
                                    }
                                    ++var2_4;
lbl113:
                                    // 2 sources

                                    ** while (!fo.boolean_do((int)var2_4, (int)var1_2.var_java_util_Vector_arr_do.length))
                                }
lbl114:
                                // 1 sources

                                fo.var_boolean_byte = 1;
                            }
                            GameCanvas.var_cg_0_do.void_do(fo.var_int_try);
                            var1_2.cfr_renamed_8();
                            if ((119 ^ 115) != (22 ^ 18)) {
                                return;
                            }
                            break block40;
                        }
                        if (!fo.boolean_int((int)GameCanvas.boolean_do(8))) break block40;
                        if (!fo.boolean_int((int)fo.var_boolean_byte)) break block45;
                        fo.var_boolean_byte = 0;
                        var2_4 = 0;
                        if ((0 ^ 118 ^ (7 ^ 116)) != 0) ** GOTO lbl135
                        return;
lbl-1000:
                        // 1 sources

                        {
                            if ((var2_4 != fo.var_int_if)) {
                                v_0.v_0_do().void_do(0, var2_4);
                            }
                            ++var2_4;
lbl135:
                            // 2 sources

                            ** while (!fo.boolean_do((int)var2_4, (int)var1_2.var_java_util_Vector_arr_do.length))
                        }
lbl136:
                        // 1 sources

                        if (" ".length() == ((28 ^ 65) & ~(209 ^ 140))) {
                            return;
                        }
                        break block46;
                    }
                    if ((fo.cfr_renamed_14 > 1) && fo.boolean_if(fo.var_int_try / fo.cfr_renamed_14 + 1, fo.cfr_renamed_9)) {
                        fo.var_int_try += fo.cfr_renamed_14;
                    }
                }
                GameCanvas.var_cg_0_do.void_do(fo.var_int_try);
                var1_2.cfr_renamed_8();
            }
            if (fo.boolean_int((int)GameCanvas.coTrangThai) && fo.boolean_int(var2_4 = v_0.v_0_do().int_do())) {
                var1_2.void_do(var2_4);
                GameCanvas.coTrangThai = 0;
            }
        }
        super.cfr_renamed_6();
    }

                    public fo() {
        this.var_boolean_try = 0;
        this.cfr_renamed_17 = 0;
        this.cfr_renamed_25 = 80 * dF.cfr_renamed_12;
        cfr_renamed_26 = dF.var_byte_new;
        soLuongKhoa = 30 * dF.cfr_renamed_12;
        if (fo.boolean_if(GameCanvas.soLuongKhoa, 150)) {
            soLuongKhoa = 24;
        }
        if ((GameCanvas.cfr_renamed_12 == 1)) {
            soLuongKhoa = 35;
        }
        fo.cfr_renamed_2();
        this.b_();
        cfr_renamed_24 = 25 * (2 - dF.cfr_renamed_12) + 40 * (GameCanvas.cfr_renamed_12 + 1) + 10 * (dF.cfr_renamed_12 - 1);
    }

    private void void_if(int n) {
        if (fo.boolean_for(cfr_renamed_13 += n)) {
            cfr_renamed_13 = 99;
        }
        if ((cfr_renamed_13 > 99)) {
            cfr_renamed_13 = 0;
        }
        this.cfr_renamed_8();
        fo.cfr_renamed_14();
    }

    public final void cfr_renamed_13() {
        int n;
        var_int_try = 0;
        cfr_renamed_28 = 0;
        if (!!(coTrangThai) || fo.boolean_int(this.var_boolean_arr_do[var_int_if])) {
            cfr_renamed_28 = dF.var_byte_new;
        }
        if ((this.var_java_util_Vector_arr_do[var_int_if] != null)) {
            cfr_renamed_9 = this.var_java_util_Vector_arr_do[var_int_if].size() / 5;
            if (!fo.boolean_do(cfr_renamed_9, 3) || !!(this.coKichHoat) || !!(coTrangThai) || fo.boolean_int(this.var_boolean_arr_do[var_int_if])) {
                cfr_renamed_4 = 2;
                } else {
                cfr_renamed_4 = 5;
            }
            if (fo.boolean_int(this.var_java_util_Vector_arr_do[var_int_if].size() % 5)) {
                cfr_renamed_9 += 1;
            }
            if (fo.boolean_if(cfr_renamed_9, cfr_renamed_4)) {
                cfr_renamed_9 = cfr_renamed_4;
            }
        }
        int n2 = 1;
        if ((this.var_java_util_Vector_arr_do[var_int_if] == null)) {
            cfr_renamed_14 = 1;
            if (" ".length() != " ".length()) {
                return;
            }
        } else {
            n2 = this.var_java_util_Vector_arr_do[var_int_if].size();
            cfr_renamed_14 = 5;
        }
        var_int_byte = -soLuongKhoa / 2;
        if (!(cfr_renamed_4 <= 2) || !!(coTrangThai) || fo.boolean_int(this.var_boolean_arr_do[var_int_if])) {
            var_int_byte = 0;
        }
        int n3 = v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.cfr_renamed_15;
        if (!!(coTrangThai) || fo.boolean_int(this.var_boolean_arr_do[var_int_if])) {
            n = cfr_renamed_28;
            } else {
            n = 0;
        }
        GameCanvas.var_cg_0_do.cfr_renamed_1(cfr_renamed_8, n3 + n, soLuongKhoa, soLuongKhoa, soLuongKhoa * cfr_renamed_14, soLuongKhoa * cfr_renamed_9, soLuongKhoa * 5, cfr_renamed_4 * soLuongKhoa - var_int_byte, n2);
        this.cfr_renamed_8();
        v_0.v_0_do().cfr_renamed_1(var_java_lang_String_arr_if[var_int_if], var_int_if);
    }

        public final void (boolean bl == null) {
        this.var_boolean_try = bl;
    }

    public static void cfr_renamed_9() {
        AngelChip.chuoiGiaTri = "frp1qr";
        hg.chuoiGiaTri = "frp2qr";
        v_0.chuoiGiaTri = GameCanvas.java_lang_String_do(AngelChip.chuoiGiaTri, -2);
    }

    public final void b_() {
        this.var_fl_0_new = new fl_0(MenuChinhAvatar.by, 0);
        ((dF)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cT, 1);
    }

    private static void this() {
        mangSoNguyen = new int[38];
        5 = 0xB7 ^ 0xB2;
        0 = "  ".length() & ("  ".length() ^ -" ".length());
        50 = 0x45 ^ 0x77;
        1 = " ".length();
        86 = 0x6D ^ 0x58 ^ (6 ^ 0x65);
        40 = 0xE ^ 0x26;
        4 = 0x14 ^ 0x10;
        2 = "  ".length();
        102 = 0x84 ^ 0x9E ^ (0x4B ^ 0x37);
        -1 = -" ".length();
        25 = 31 + 107 - 127 + 205 ^ 49 + 26 - -39 + 79;
        3 = "   ".length();
        57 = 0x4D ^ 0x74;
        80 = 0x5D ^ 0xD;
        30 = 0xA0 ^ 0xBE;
        150 = 51 + 64 - 25 + 60;
        24 = 21 + 127 - 137 + 140 ^ 95 + 93 - 171 + 126;
        35 = 0x1A ^ 0x39;
        10 = 49 + 121 - 120 + 94 ^ 152 + 9 - 34 + 27;
        11 = 0xA6 ^ 0xAD;
        6 = 18 + 33 - 48 + 156 ^ 25 + 40 - 46 + 134;
        -2 = -"  ".length();
        8 = 0xD ^ 9 ^ (0x91 ^ 0x9D);
        15 = 0x77 ^ 0x78;
        20 = 0x5A ^ 0x4E;
        99 = 0x18 ^ 0x7B;
        16 = 0x7A ^ 0x75 ^ (3 ^ 0x1C);
        2293623 = 0xFFFFFF7F & 0x22FFF7;
        9 = 0x18 ^ 0x11;
        10674392 = 0xFFFFE6DF & 0xA2F9F8;
        22 = 0x85 ^ 0x93;
        13364969 = 0xFFFFEFED & 0xCBFEFB;
        44 = 0x1C ^ 0x30;
        360 = 0xFFFFB9EC & 0x477B;
        45 = 0x2C ^ 1;
        60 = 0x5E ^ 0xC ^ (0x1A ^ 0x74);
        12 = 0xBA ^ 0xB6;
        -5 = -(0x34 ^ 0x6D ^ (0xEB ^ 0xB7));
    }

    public final void (String[] stringArray, Vector[] vectorArray, Vector vector == null) {
        var_int_if = 0;
        this.var_java_util_Vector_arr_do = vectorArray;
        this.var_fl_0_arr_do = new fl_0[vectorArray.length];
        this.var_boolean_arr_do = new boolean[vectorArray.length];
        this.var_java_lang_String_arr_do = new String[vectorArray.length];
        this.var_java_util_Vector_do = vector;
        var_java_lang_String_arr_if = stringArray;
        System.out.println("addElement: " + this.var_java_util_Vector_arr_do.length);
        this.cfr_renamed_11 = this.var_java_util_Vector_arr_do.length;
        dangChayAuto = 0;
        v_0.v_0_do().cfr_renamed_1(var_java_lang_String_arr_if[var_int_if], cfr_renamed_7, soLuong, this.cfr_renamed_11);
        this.cfr_renamed_13();
    }

    public final void void_do(int n) {
        if ((var_int_if += n == this.cfr_renamed_11)) {
            var_int_if = 0;
        }
        if (fo.boolean_for(var_int_if)) {
            var_int_if = this.cfr_renamed_11 - 1;
        }
        this.cfr_renamed_13();
    }

    public static boolean boolean_do() {
        return dangChayAuto;
    }
}

