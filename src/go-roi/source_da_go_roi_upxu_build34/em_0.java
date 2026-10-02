/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from eM
 */
public final class em_0
extends dL {
    public static int soLuong;
    private static int cfr_renamed_12;
    private static int cfr_renamed_11;
    private static int cfr_renamed_18;
    private static int cfr_renamed_10;
    private int cfr_renamed_14;
    private static int cfr_renamed_23;
    private static int[] mangSoNguyen;
    public static int var_int_if;
    private static int cfr_renamed_24;
    public Vector[] var_java_util_Vector_arr_do;
    public static int soLuongKhoa;
    public static int var_int_int;
    private int cfr_renamed_25;
    public static int cfr_renamed_5;
    private static String tenNhanVat;
    private int cfr_renamed_27;
    public static int var_int_try;
    private int cfr_renamed_26;
    private static int cfr_renamed_21;
    private ei[] var_ei_arr_do;
    private static String[] var_java_lang_String_arr_do;
    private int cfr_renamed_29 = 0;
    private String[] var_java_lang_String_arr_if;
    private static boolean var_boolean_try;
    private static int cfr_renamed_9;
    private boolean[] var_boolean_arr_do;
    public static em_0 var_em_0_do;
    public static boolean dangChayAuto;
    private int cfr_renamed_28;
    private Vector var_java_util_Vector_do;
    private static dL var_dL_do;
    public boolean coTrangThai = 0;
    public static boolean coKichHoat;
    public static String chuoiGiaTri;
    public static int var_int_byte;
    public static int cfr_renamed_8;
    private int cfr_renamed_34;
    private boolean var_boolean_byte = 0;
    private static Vector var_java_util_Vector_if;
    public static boolean var_boolean_int;

        public final void (int n, boolean bl == null) {
        if (em_0.boolean_for(dangChayAuto ? 1 : 0)) {
            return;
        }
        if ((var_int_if == n) && (this.var_ei_new != null) && em_0.boolean_do(bl ? 1 : 0)) {
            this.var_ei_new.cfr_renamed_1();
        }
        var_int_if = n;
        this.cfr_renamed_18();
    }

    public static void (String string == null) {
        if ((string != null)) {
            var_java_util_Vector_if.addElement(new ev_0(string, GameCanvas.var_ew_try.cfr_renamed_0(string)));
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
                                em_0.var_dL_do.cfr_renamed_1(var1_1);
                                GameCanvas.cfr_renamed_1(var1_1);
                                k.k_do().cfr_renamed_0(var1_1);
                                var1_1.setColor(0);
                                var1_1.translate(em_0.cfr_renamed_21, k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_16);
                                if (em_0.boolean_for((int)em_0.coKichHoat)) {
                                    var2_2 = GameCanvas.hienThongBaoPopup(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], AngelChip.duLieuNguoiChoi.mangSoNguyen[2], AngelChip.duLieuNguoiChoi.soLuong);
                                    var3_6 = GameCanvas.var_ew_case.cfr_renamed_0(var2_2);
                                    var4_9 = this.cfr_renamed_26;
                                    if ((gc_0.int_if(var4_9) > var3_6 + 20 - (em_0.var_int_byte - 20))) {
                                        var4_9 = 0;
                                    }
                                    var1_1.setClip(0, 0, em_0.var_int_byte - 20, 20);
                                    GameCanvas.var_ew_case.cfr_renamed_0(var1_1, var2_2, var4_9, 0, 0);
                                    if ((var3_6 > em_0.var_int_byte - 20)) {
                                        if ((gc_0.int_if(this.cfr_renamed_26) > var3_6 + 50 - (em_0.var_int_byte - 20))) {
                                            this.cfr_renamed_26 = 0;
                                        }
                                        this.cfr_renamed_26 -= 1;
                                    }
                                    var1_1.translate(0, em_0.cfr_renamed_23);
                                }
                                if (!(this.var_java_util_Vector_arr_do[em_0.soLuongKhoa] != null)) break block34;
                                if (em_0.boolean_for(this.var_boolean_arr_do[em_0.soLuongKhoa])) {
                                    GameCanvas.var_ew_case.cfr_renamed_0(var1_1, this.var_java_lang_String_arr_if[em_0.soLuongKhoa], 0, 0, 0);
                                    var1_1.translate(0, em_0.cfr_renamed_23);
                                }
                                var1_1.setClip(0, 0, 5 * em_0.var_int_try, em_0.var_int_int * em_0.var_int_try - em_0.cfr_renamed_8);
                                var1_1.translate(0, -ex.cfr_renamed_18);
                                var2_3 = 0;
                                if (null == null) ** GOTO lbl32
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    k.cfr_renamed_0(var1_1, em_0.var_int_try * (var2_3 % em_0.cfr_renamed_11), em_0.var_int_try * (var2_3 / em_0.cfr_renamed_11), em_0.var_int_try, em_0.var_int_try);
                                    ++var2_3;
lbl32:
                                    // 2 sources

                                    ** while (!em_0.cfr_renamed_4((int)var2_3, (int)(em_0.cfr_renamed_12 * em_0.cfr_renamed_11)))
                                }
lbl33:
                                // 1 sources

                                if (em_0.boolean_do((int)this.var_boolean_byte) && em_0.boolean_do((int)em_0.var_boolean_try)) {
                                    k.cfr_renamed_0(3 + em_0.var_int_if % em_0.cfr_renamed_11 * em_0.var_int_try, em_0.var_int_if / em_0.cfr_renamed_11 * em_0.var_int_try + 3, em_0.var_int_try - 5, em_0.var_int_try - 5, 2293623, var1_1);
                                }
                                var2_3 = this.var_java_util_Vector_arr_do[em_0.soLuongKhoa].size();
                                var3_6 = ex.cfr_renamed_18 / em_0.var_int_try * em_0.cfr_renamed_11;
                                if (em_0.boolean_if(var3_6)) {
                                    var3_6 = 0;
                                }
                                if ((var4_9 = ex.cfr_renamed_18 / em_0.var_int_try * em_0.cfr_renamed_11 + (em_0.var_int_int + 1) * em_0.cfr_renamed_11 > this.var_java_util_Vector_arr_do[em_0.soLuongKhoa].size())) {
                                    var4_9 = this.var_java_util_Vector_arr_do[em_0.soLuongKhoa].size();
                                }
                                if (-"   ".length() < 0) ** GOTO lbl47
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    ((ei)this.var_java_util_Vector_arr_do[em_0.soLuongKhoa].elementAt(var3_6)).cfr_renamed_0(var1_1, em_0.var_int_try * (var3_6 % em_0.cfr_renamed_11), em_0.var_int_try * (var3_6 / em_0.cfr_renamed_11));
                                    ++var3_6;
lbl47:
                                    // 2 sources

                                    ** while (em_0.boolean_if((int)var3_6, (int)var4_9) && !em_0.cfr_renamed_4((int)var3_6, (int)var2_3))
                                }
lbl48:
                                // 1 sources

                                var1_1.translate(0, ex.cfr_renamed_18 - em_0.cfr_renamed_8);
                                var1_1.setClip(0, 0, em_0.var_int_byte - 9, em_0.cfr_renamed_5);
                                if (!(em_0.var_int_int == 2)) break block35;
                                if (em_0.boolean_for((int)em_0.coKichHoat) && (fe_0.var_dd_0_if != null)) {
                                    var1_1.translate(0, em_0.cfr_renamed_23);
                                    var1_1.setColor(10674392);
                                    v0 = 30 * bn_0.cfr_renamed_6;
                                    if ((bn_0.cfr_renamed_6 == 2)) {
                                        v1 = 10;
                                        } else {
                                        v1 = 0;
                                    }
                                    var1_1.fillTriangle(v0, em_0.var_int_int * em_0.var_int_try - v1, 8 * bn_0.cfr_renamed_6, em_0.var_int_int * em_0.var_int_try + 40 * bn_0.cfr_renamed_6, 30 * bn_0.cfr_renamed_6 + 22 * bn_0.cfr_renamed_6, em_0.var_int_int * em_0.var_int_try + 40 * bn_0.cfr_renamed_6);
                                    var1_1.setColor(13364969);
                                    var1_1.fillArc(8 * bn_0.cfr_renamed_6, em_0.var_int_int * em_0.var_int_try + 40 * bn_0.cfr_renamed_6 - 10 * bn_0.cfr_renamed_6, 44 * bn_0.cfr_renamed_6, 20 * bn_0.cfr_renamed_6, 0, 360);
                                    fe_0.var_dd_0_if.cfr_renamed_0(var1_1, 30 * bn_0.cfr_renamed_6, em_0.var_int_int * em_0.var_int_try + 45 * bn_0.cfr_renamed_6, 0);
                                    var1_1.translate(60 * bn_0.cfr_renamed_6, 0);
                                }
                                var3_7 = var1_1;
                                var2_4 = this;
                                if (!(em_0.var_java_util_Vector_if != null) || !em_0.boolean_if(em_0.var_int_if, var2_4.var_java_util_Vector_arr_do[em_0.soLuongKhoa].size())) break block36;
                                if (em_0.boolean_for((int)em_0.coKichHoat)) {
                                    v2 = 80;
                                    if ("  ".length() <= 0) {
                                        return;
                                    }
                                } else {
                                    v2 = 0;
                                }
                                var4_9 = v2;
                                var3_7.setClip(0, em_0.var_int_int * em_0.var_int_try, em_0.var_int_byte - var4_9 + 5, em_0.cfr_renamed_5);
                                var5_10 = 0;
                                if (-" ".length() < " ".length()) ** GOTO lbl94
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    var6_12 = (ev_0)em_0.var_java_util_Vector_if.elementAt(var5_10);
                                    var7_15 = 0;
                                    if ((var6_12.cfr_renamed_2 > em_0.var_int_byte + 5 - var4_9)) {
                                        var6_12.cfr_renamed_0(em_0.var_int_byte + 5 - var4_9);
                                        if (em_0.boolean_int(var6_12.cfr_renamed_5)) {
                                            var7_15 = var6_12.cfr_renamed_5;
                                        }
                                    }
                                    GameCanvas.var_ew_case.cfr_renamed_0(var3_7, var6_12.cfr_renamed_1, 2 - var7_15, em_0.var_int_int * em_0.var_int_try + var5_10 * em_0.cfr_renamed_9, 0);
                                    ++var5_10;
lbl94:
                                    // 2 sources

                                    ** while (!em_0.cfr_renamed_4((int)var5_10, (int)em_0.var_java_util_Vector_if.size()))
                                }
                            }
                            if (((102 ^ 61) & ~(23 ^ 76)) >= " ".length()) {
                                return;
                            }
                            break block37;
                        }
                        var3_8 = var1_1;
                        var2_5 = this;
                        if ((GameCanvas.int_if() - var2_5.cfr_renamed_29 > 0) && !em_0.boolean_for((int)em_0.dangChayAuto)) break block38;
                        if (-"   ".length() > 0) {
                            return;
                        }
                        break block37;
                    }
                    if (!(em_0.var_java_util_Vector_if != null) || !em_0.boolean_if(em_0.var_int_if, var2_5.var_java_util_Vector_arr_do[em_0.soLuongKhoa].size())) break block37;
                    var4_9 = em_0.var_int_if % em_0.cfr_renamed_11 * em_0.var_int_try - var2_5.cfr_renamed_34 / 2 + em_0.var_int_try / 2;
                    var5_11 = (em_0.var_int_if / em_0.cfr_renamed_11 + 1) * em_0.var_int_try - ex.cfr_renamed_18 + 5;
                    var6_13 = em_0.var_java_util_Vector_if.size() * bn_0.cfr_renamed_15 + (bn_0.cfr_renamed_16 << 1) + 8;
                    if ((var5_11 + var6_13 + em_0.soLuong + 12 > GameCanvas.var_int_char)) {
                        var5_11 -= var6_13 + em_0.var_int_try + 10;
                    }
                    if (em_0.boolean_if(var5_11 + em_0.soLuong)) {
                        var5_11 = -em_0.soLuong;
                    }
                    if ((var4_9 + em_0.cfr_renamed_21 + 5 + var2_5.cfr_renamed_34 > GameCanvas.var_int_byte)) {
                        var4_9 = GameCanvas.var_int_byte - (em_0.cfr_renamed_21 + 5 + var2_5.cfr_renamed_34);
                        if (-" ".length() > "  ".length()) {
                            return;
                        }
                    } else if (em_0.boolean_if(var4_9 + em_0.cfr_renamed_21)) {
                        var4_9 = -em_0.cfr_renamed_21;
                    }
                    var3_8.setClip(var4_9, var5_11, var2_5.cfr_renamed_34, var6_13 * bn_0.cfr_renamed_6);
                    GameCanvas.var_gj_0_do.cfr_renamed_0(var3_8, var4_9, var5_11, var2_5.cfr_renamed_34, var6_13, k.mangSoNguyen[2], k.mangSoNguyen[3], 1);
                    var4_9 += bn_0.cfr_renamed_16;
                    var5_11 += bn_0.cfr_renamed_16 - bn_0.cfr_renamed_15 / 2;
                    var7_16 = 0;
                    if (null == null) ** GOTO lbl145
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_14 = (ev_0)em_0.var_java_util_Vector_if.elementAt(var7_16);
                        var8_17 = 0;
                        if ((var6_14.cfr_renamed_2 > var2_5.cfr_renamed_34 + 5)) {
                            var6_14.cfr_renamed_0(var2_5.cfr_renamed_34);
                            if (em_0.boolean_int(var6_14.cfr_renamed_5)) {
                                var8_17 = var6_14.cfr_renamed_5;
                            }
                        }
                        GameCanvas.var_ew_case.cfr_renamed_0(var3_8, var6_14.cfr_renamed_1, var4_9 - var8_17, var5_11 + 5 + var7_16 * em_0.cfr_renamed_9, 0);
                        ++var7_16;
lbl145:
                        // 2 sources

                        ** while (!em_0.cfr_renamed_4((int)var7_16, (int)em_0.var_java_util_Vector_if.size()))
                    }
                }
                if (em_0.boolean_for((int)em_0.dangChayAuto)) {
                    GameCanvas.cfr_renamed_1(var1_1);
                    var1_1.translate(em_0.cfr_renamed_21, GameCanvas.var_ex_do.soLuongKhoa);
                    GameCanvas.var_gj_0_do.cfr_renamed_0(var1_1, em_0.var_int_if, em_0.cfr_renamed_11, em_0.var_int_try, em_0.cfr_renamed_24, em_0.cfr_renamed_18, em_0.soLuongKhoa, em_0.cfr_renamed_10, em_0.tenNhanVat, this.cfr_renamed_25, this.cfr_renamed_27);
                    }
                break block39;
            }
            var1_1.setClip(-5, 0, em_0.var_int_byte - 10, em_0.cfr_renamed_5);
            ((ei)this.var_java_util_Vector_do.elementAt(em_0.soLuongKhoa)).cfr_renamed_0(var1_1, 0, 0);
        }
        if (!(GameCanvas.var_et_0_do != null) || !em_0.boolean_do((int)et_0.dangChayAuto) || em_0.boolean_do((int)et_0.coTrangThai)) {
            super.cfr_renamed_0(var1_1);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_15() {
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
                                                if (!em_0.boolean_for((int)em_0.dangChayAuto)) break block37;
                                                var1_1 = this;
                                                if (em_0.boolean_for((int)GameCanvas.boolean_do(4))) {
                                                    var1_1.void_int(-1);
                                                    var1_1.cfr_renamed_25 = 5;
                                                    if (-"   ".length() > 0) {
                                                        return;
                                                    }
                                                } else if (em_0.boolean_for((int)GameCanvas.boolean_do(6))) {
                                                    var1_1.void_int(1);
                                                    var1_1.cfr_renamed_27 = 5;
                                                }
                                                if (em_0.boolean_for((int)GameCanvas.boolean_if(0, 0, GameCanvas.var_int_byte, GameCanvas.var_int_char - GameCanvas.var_int_else))) {
                                                    GameCanvas.coKichHoat = 0;
                                                }
                                                if (em_0.boolean_for((int)GameCanvas.var_boolean_new)) {
                                                    var2_3 = em_0.var_int_if % em_0.cfr_renamed_11 * em_0.var_int_try;
                                                    var3_5 = (em_0.var_int_if / em_0.cfr_renamed_11 + 1) * em_0.var_int_try;
                                                    if (em_0.boolean_if(var2_3 + em_0.var_int_try / 2 - em_0.cfr_renamed_24 / 2 + em_0.cfr_renamed_21 + 5)) {
                                                        var2_3 = -em_0.var_int_try / 2 + em_0.cfr_renamed_24 / 2 - em_0.cfr_renamed_21 - 5;
                                                        if (((69 ^ 64) & ~(162 ^ 167)) != 0) {
                                                            return;
                                                        }
                                                    } else if ((var2_3 + em_0.var_int_try / 2 - em_0.cfr_renamed_24 / 2 + em_0.cfr_renamed_24 > GameCanvas.var_int_byte)) {
                                                        var2_3 = GameCanvas.var_int_byte - em_0.cfr_renamed_24 - em_0.var_int_try / 2 + em_0.cfr_renamed_24 / 2;
                                                    }
                                                    var2_3 += em_0.cfr_renamed_21;
                                                    var3_5 += em_0.soLuong + k.var_byte_do + bn_0.cfr_renamed_16;
                                                    var4_6 = (em_0.cfr_renamed_18 - (bn_0.cfr_renamed_16 << 1)) / 4;
                                                    var3_5 += bn_0.cfr_renamed_16 + 8;
                                                    if (em_0.boolean_for((int)GameCanvas.boolean_if(var2_3 = var2_3 + em_0.var_int_try / 2 - 35 * (GameCanvas.cfr_renamed_16 + 1) / 2 - 2 - 10 - 10 * bn_0.cfr_renamed_6, (var3_5 = var3_5 + var4_6 / 2 + var4_6 + bn_0.var_byte_new / 2) - 15 * bn_0.cfr_renamed_6 - 5, 20 + 20 * bn_0.cfr_renamed_6, 30 * bn_0.cfr_renamed_6))) {
                                                        var1_1.void_int(-1);
                                                        var1_1.cfr_renamed_25 = 5;
                                                        if (((59 ^ 109) & ~(17 ^ 71)) != 0) {
                                                            return;
                                                        }
                                                    } else if (em_0.boolean_for((int)GameCanvas.boolean_if(var2_3 + 35 * (GameCanvas.cfr_renamed_16 + 1), var3_5 - 15 * bn_0.cfr_renamed_6 - 5, 20 + 20 * bn_0.cfr_renamed_6, 30 * bn_0.cfr_renamed_6))) {
                                                        var1_1.void_int(1);
                                                        var1_1.cfr_renamed_27 = 5;
                                                        if (-"   ".length() >= 0) {
                                                            return;
                                                        }
                                                    } else if (em_0.boolean_for((int)GameCanvas.boolean_if(var2_3 + 20 + 20 * bn_0.cfr_renamed_6, var3_5 - 15 * bn_0.cfr_renamed_6 - 5, var2_3 + 35 * (GameCanvas.cfr_renamed_16 + 1) - (var2_3 + 20 + 20 * bn_0.cfr_renamed_6), 30 * bn_0.cfr_renamed_6))) {
                                                        var1_1.var_ei_new.cfr_renamed_1();
                                                    }
                                                }
                                                if ((var1_1.cfr_renamed_25 > 0)) {
                                                    var1_1.cfr_renamed_25 -= 1;
                                                }
                                                if ((var1_1.cfr_renamed_27 > 0)) {
                                                    var1_1.cfr_renamed_27 -= 1;
                                                }
                                                if (" ".length() == (14 ^ 10)) {
                                                    return;
                                                }
                                                break block38;
                                            }
                                            var1_2 = this;
                                            if (!em_0.boolean_for((int)GameCanvas.boolean_do(6))) break block39;
                                            if ((em_0.var_int_if % em_0.cfr_renamed_11 != em_0.cfr_renamed_11 - 1) && (em_0.cfr_renamed_11 != 1) && em_0.boolean_do((int)em_0.var_boolean_try)) {
                                                em_0.var_int_if += 1;
                                                if (" ".length() >= "  ".length()) {
                                                    return;
                                                }
                                            } else {
                                                var1_2.void_for(1);
                                            }
                                            GameCanvas.var_ex_do.void_do(em_0.var_int_if);
                                            var1_2.cfr_renamed_18();
                                            if ((17 ^ 34 ^ (39 ^ 16)) == 0) {
                                                return;
                                            }
                                            break block40;
                                        }
                                        if (!em_0.boolean_for((int)GameCanvas.boolean_do(4))) break block41;
                                        if (em_0.boolean_for(em_0.var_int_if % em_0.cfr_renamed_11) && (em_0.cfr_renamed_11 != 1) && em_0.boolean_do((int)em_0.var_boolean_try)) {
                                            em_0.var_int_if -= 1;
                                            if ("  ".length() < 0) {
                                                return;
                                            }
                                        } else {
                                            var1_2.void_for(-1);
                                        }
                                        GameCanvas.var_ex_do.void_do(em_0.var_int_if);
                                        var1_2.cfr_renamed_18();
                                        if (-"  ".length() > 0) {
                                            return;
                                        }
                                        break block40;
                                    }
                                    if (!em_0.boolean_for((int)GameCanvas.boolean_do(2))) break block42;
                                    if (!(var1_2.var_java_util_Vector_arr_do[em_0.soLuongKhoa] != null) || !(var1_2.var_java_util_Vector_arr_do[em_0.soLuongKhoa].size() > 0) || !em_0.boolean_do((int)em_0.var_boolean_try)) break block43;
                                    if (!(em_0.var_int_if / em_0.cfr_renamed_11 > 0)) break block44;
                                    em_0.var_int_if -= em_0.cfr_renamed_11;
                                    if (-"  ".length() >= 0) {
                                        return;
                                    }
                                    break block43;
                                }
                                var2_4 = 0;
                                if (" ".length() == " ".length()) ** GOTO lbl113
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    if ((var2_4 != em_0.soLuongKhoa)) {
                                        k.k_do().void_do(4, var2_4);
                                    }
                                    ++var2_4;
lbl113:
                                    // 2 sources

                                    ** while (!em_0.cfr_renamed_4((int)var2_4, (int)var1_2.var_java_util_Vector_arr_do.length))
                                }
lbl114:
                                // 1 sources

                                em_0.var_boolean_try = 1;
                            }
                            GameCanvas.var_ex_do.void_do(em_0.var_int_if);
                            var1_2.cfr_renamed_18();
                            if ("  ".length() == 0) {
                                return;
                            }
                            break block40;
                        }
                        if (!em_0.boolean_for((int)GameCanvas.boolean_do(8))) break block40;
                        if (!em_0.boolean_for((int)em_0.var_boolean_try)) break block45;
                        em_0.var_boolean_try = 0;
                        var2_4 = 0;
                        if (((31 + 86 - 93 + 133 ^ 21 + 8 - -89 + 45) & (175 ^ 191 ^ (87 ^ 121) ^ -" ".length())) > -" ".length()) ** GOTO lbl135
                        return;
lbl-1000:
                        // 1 sources

                        {
                            if ((var2_4 != em_0.soLuongKhoa)) {
                                k.k_do().void_do(0, var2_4);
                            }
                            ++var2_4;
lbl135:
                            // 2 sources

                            ** while (!em_0.cfr_renamed_4((int)var2_4, (int)var1_2.var_java_util_Vector_arr_do.length))
                        }
lbl136:
                        // 1 sources

                        if (-(28 ^ 106 ^ (50 ^ 64)) >= 0) {
                            return;
                        }
                        break block46;
                    }
                    if ((em_0.cfr_renamed_11 > 1) && em_0.boolean_if(em_0.var_int_if / em_0.cfr_renamed_11 + 1, em_0.cfr_renamed_12)) {
                        em_0.var_int_if += em_0.cfr_renamed_11;
                    }
                }
                GameCanvas.var_ex_do.void_do(em_0.var_int_if);
                var1_2.cfr_renamed_18();
            }
            if (em_0.boolean_for((int)GameCanvas.coKichHoat) && em_0.boolean_for(var2_4 = k.k_do().int_do())) {
                var1_2.void_for(var2_4);
                GameCanvas.coKichHoat = 0;
            }
        }
        super.cfr_renamed_15();
    }

    public static boolean boolean_do() {
        return dangChayAuto;
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    public static int int_do() {
        return cfr_renamed_10;
    }

    private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

    private static boolean boolean_int(int n) {
        return n >= 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

        public static void cfr_renamed_1() {
        dangChayAuto = 1;
        em_0.cfr_renamed_10();
    }

    public final void (ei ei2, int n == null) {
        this.var_ei_arr_do[n] = ei2;
    }

    private static void cfr_renamed_10() {
        if ((soLuongKhoa == 1)) {
            ff ff2 = (ff)ak_0.var_java_util_Vector_if.elementAt(var_int_if);
            tenNhanVat = GameCanvas.hienThongBaoPopup(ff2.var_int_if * cfr_renamed_10, ff2.soLuong * cfr_renamed_10, 1);
            if (-"   ".length() > 0) {
                return;
            }
        } else {
            tenNhanVat = GameCanvas.hienThongBaoPopup(ak_0.var_dY_arr_do[em_0.var_int_if].var_short_arr_if[0] * cfr_renamed_10, ak_0.var_dY_arr_do[em_0.var_int_if].var_short_arr_if[1] * cfr_renamed_10, 1);
        }
        if (em_0.boolean_if(cfr_renamed_24 = GameCanvas.var_ew_try.cfr_renamed_0(tenNhanVat) + 16 + 30 * GameCanvas.cfr_renamed_16, 86 * bn_0.cfr_renamed_6)) {
            cfr_renamed_24 = 86 * bn_0.cfr_renamed_6;
        }
        if (em_0.boolean_for(GameCanvas.cfr_renamed_16)) {
            cfr_renamed_24 = 86 + 40 * GameCanvas.cfr_renamed_16;
        }
    }

    public static void cfr_renamed_4() {
        var_boolean_int = 0;
        var_java_util_Vector_if.removeAllElements();
        if (em_0.boolean_for(dangChayAuto ? 1 : 0)) {
            em_0.cfr_renamed_10();
        }
    }

    private void void_int(int n) {
        if (em_0.boolean_if(cfr_renamed_10 += n)) {
            cfr_renamed_10 = 99;
        }
        if ((cfr_renamed_10 > 99)) {
            cfr_renamed_10 = 0;
        }
        this.cfr_renamed_18();
        em_0.cfr_renamed_10();
    }

    public final void cfr_renamed_5() {
        int n;
        var_int_if = 0;
        cfr_renamed_23 = 0;
        if (!em_0.boolean_do(coKichHoat ? 1 : 0) || em_0.boolean_for(this.var_boolean_arr_do[soLuongKhoa])) {
            cfr_renamed_23 = bn_0.cfr_renamed_15;
        }
        if ((this.var_java_util_Vector_arr_do[soLuongKhoa] != null)) {
            cfr_renamed_12 = this.var_java_util_Vector_arr_do[soLuongKhoa].size() / 5;
            if (!(cfr_renamed_12 >= 3) || !em_0.boolean_do(this.coTrangThai ? 1 : 0) || !em_0.boolean_do(coKichHoat ? 1 : 0) || em_0.boolean_for(this.var_boolean_arr_do[soLuongKhoa])) {
                var_int_int = 2;
                if ((0x14 ^ 0x10) <= 0) {
                    return;
                }
            } else {
                var_int_int = 5;
            }
            if (em_0.boolean_for(this.var_java_util_Vector_arr_do[soLuongKhoa].size() % 5)) {
                cfr_renamed_12 += 1;
            }
            if (em_0.boolean_if(cfr_renamed_12, var_int_int)) {
                cfr_renamed_12 = var_int_int;
            }
        }
        int n2 = 1;
        if ((this.var_java_util_Vector_arr_do[soLuongKhoa] == null)) {
            cfr_renamed_11 = 1;
            if (" ".length() <= -" ".length()) {
                return;
            }
        } else {
            n2 = this.var_java_util_Vector_arr_do[soLuongKhoa].size();
            cfr_renamed_11 = 5;
        }
        cfr_renamed_8 = -var_int_try / 2;
        if (!em_0.boolean_do(var_int_int, 2) || !em_0.boolean_do(coKichHoat ? 1 : 0) || em_0.boolean_for(this.var_boolean_arr_do[soLuongKhoa])) {
            cfr_renamed_8 = 0;
        }
        int n3 = k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_16;
        if (!em_0.boolean_do(coKichHoat ? 1 : 0) || em_0.boolean_for(this.var_boolean_arr_do[soLuongKhoa])) {
            n = cfr_renamed_23;
            if (-" ".length() == "  ".length()) {
                return;
            }
        } else {
            n = 0;
        }
        GameCanvas.var_ex_do.cfr_renamed_0(cfr_renamed_21, n3 + n, var_int_try, var_int_try, var_int_try * cfr_renamed_11, var_int_try * cfr_renamed_12, var_int_try * 5, var_int_int * var_int_try - cfr_renamed_8, n2);
        this.cfr_renamed_18();
        k.k_do().cfr_renamed_0(var_java_lang_String_arr_do[soLuongKhoa], soLuongKhoa);
    }

    public final void void_for(int n) {
        if ((soLuongKhoa += n == this.cfr_renamed_14)) {
            soLuongKhoa = 0;
        }
        if (em_0.boolean_if(soLuongKhoa)) {
            soLuongKhoa = this.cfr_renamed_14 - 1;
        }
        this.cfr_renamed_5();
    }

            public static em_0 em_0_do() {
        if ((var_em_0_do == null)) {
            var_em_0_do = new em_0();
        }
        return var_em_0_do;
    }

    public final void a_() {
        this.var_ei_try = new ei(MenuChinhAvatar.cfr_renamed_7, 0);
        this.var_ei_new = new ei(MenuChinhAvatar.dg, 1);
    }

    public static void cfr_renamed_12() {
        var_int_byte = var_int_try * 5 + 11 + bn_0.cfr_renamed_16 + 2;
        cfr_renamed_5 = var_int_try * 6 + 10 + bn_0.cfr_renamed_16;
        cfr_renamed_21 = GameCanvas.var_int_int - var_int_try * 5 / 2;
        soLuong = (GameCanvas.var_int_char - dL.cfr_renamed_19) / 2 - cfr_renamed_5 / 2;
    }

    static {
        em_0.this();
        cfr_renamed_11 = 5;
        var_int_int = 5;
        var_int_if = 0;
        dangChayAuto = 0;
        cfr_renamed_10 = 0;
        cfr_renamed_8 = 0;
        var_java_util_Vector_if = new Vector();
        var_boolean_int = 0;
        coKichHoat = 0;
        var_boolean_try = 0;
        cfr_renamed_24 = 0;
        tenNhanVat = "";
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.cfr_renamed_2();
                return;
            }
            case 1: {
                em_0 em_02 = this;
                if (em_0.boolean_if(var_int_if, em_02.var_java_util_Vector_arr_do[soLuongKhoa].size())) {
                    ((ei)em_02.var_java_util_Vector_arr_do[em_0.soLuongKhoa].elementAt((int)em_0.var_int_if)).var_cp_do.void_do();
                    em_02.cfr_renamed_18();
                }
                return;
            }
            case 7: {
                bF.bF_do();
                bF.void_try(n2, 0);
                return;
            }
            case 8: {
                if (!em_0.boolean_if(n2, ak_0.var_java_util_Vector_do.size())) break;
                fc_0 fc_02 = (fc_0)ak_0.var_java_util_Vector_do.elementAt(n2);
                bF.bF_do();
                bF.cfr_renamed_0(fc_02);
                return;
            }
            case 9: {
                if (!em_0.boolean_if(n2, ak_0.var_java_util_Vector_if.size())) break;
                ff ff2 = (ff)ak_0.var_java_util_Vector_if.elementAt(n2);
                bF.bF_do();
                bF.void_try(ff2.var_short_do, 4);
                return;
            }
            case 10: {
                if (!em_0.boolean_if(n2, bF.var_java_util_Vector_for.size())) break;
                gd gd2 = (gd)bF.var_java_util_Vector_for.elementAt(n2);
                bF.bF_do();
                bF.cfr_renamed_0((int)gd2.var_short_do, gd2.chuoiGiaTri);
                return;
            }
            case 11: {
                if (!em_0.boolean_if(n2, bF.var_java_util_Vector_try.size())) break;
                ff ff3 = bF.ff_do(((gd)bF.var_java_util_Vector_try.elementAt((int)n2)).var_short_do);
                bF.bF_do();
                bF.cfr_renamed_0((int)ff3.var_short_do, ff3.chuoiGiaTri);
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
                if (!em_0.boolean_do(n2) || (ef_0.var_byte_do == -1)) {
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_12(byArray2[n2]);
                }
                em_0.em_0_do().cfr_renamed_2();
            }
        }
    }

    public final void (String[] stringArray, Vector[] vectorArray, Vector vector == null) {
        soLuongKhoa = 0;
        this.var_java_util_Vector_arr_do = vectorArray;
        this.var_ei_arr_do = new ei[vectorArray.length];
        this.var_boolean_arr_do = new boolean[vectorArray.length];
        this.var_java_lang_String_arr_if = new String[vectorArray.length];
        this.var_java_util_Vector_do = vector;
        var_java_lang_String_arr_do = stringArray;
        System.out.println("addElement: " + this.var_java_util_Vector_arr_do.length);
        this.cfr_renamed_14 = this.var_java_util_Vector_arr_do.length;
        dangChayAuto = 0;
        k.k_do().cfr_renamed_0(var_java_lang_String_arr_do[soLuongKhoa], var_int_byte, cfr_renamed_5, this.cfr_renamed_14);
        this.cfr_renamed_5();
    }

    public final void cfr_renamed_8() {
        var_dL_do = GameCanvas.var_dL_do;
        this.cfr_renamed_28 = GameCanvas.var_int_char + 50;
        this.cfr_renamed_29 = GameCanvas.int_if();
        var_boolean_int = 1;
        cfr_renamed_24 = 86;
        if (em_0.boolean_for(GameCanvas.cfr_renamed_16)) {
            cfr_renamed_24 = 86 + 40 * GameCanvas.cfr_renamed_16;
        }
        coKichHoat = 0;
        super.cfr_renamed_8();
    }

        public static void cfr_renamed_11() {
        AngelChip.tenNhanVat = "frp1qr";
        gc_0.chuoiGiaTri = "frp2qr";
        k.chuoiGiaTri = GameCanvas.java_lang_String_do(AngelChip.tenNhanVat, -2);
    }

    public final void void_if(int n, int n2) {
        var_dL_do.void_if(n, n2);
    }

    public em_0() {
        this.cfr_renamed_26 = 0;
        this.cfr_renamed_34 = 80 * bn_0.cfr_renamed_6;
        cfr_renamed_9 = bn_0.cfr_renamed_15;
        var_int_try = 30 * bn_0.cfr_renamed_6;
        if (em_0.boolean_if(GameCanvas.var_int_byte, 150)) {
            var_int_try = 24;
        }
        if ((GameCanvas.cfr_renamed_16 == 1)) {
            var_int_try = 35;
        }
        em_0.cfr_renamed_12();
        this.a_();
        cfr_renamed_18 = 25 * (2 - bn_0.cfr_renamed_6) + 40 * (GameCanvas.cfr_renamed_16 + 1) + 10 * (bn_0.cfr_renamed_6 - 1);
    }

    public final void cfr_renamed_2() {
        if (em_0.boolean_for(dangChayAuto ? 1 : 0)) {
            dangChayAuto = 0;
            return;
        }
        GameCanvas.var_ex_do.coTrangThai = 0;
        this.coTrangThai = 0;
        var_dL_do.cfr_renamed_8();
        if (em_0.boolean_for(GameCanvas.var_boolean_byte ? 1 : 0)) {
            if ((ef_0.soLuong == 25) && em_0.boolean_for(et_0.soLuong)) {
                GameCanvas.var_et_0_do = new et_0();
                if ((et_0.soLuong == 2)) {
                    et_0.soLuong = 3;
                }
                GameCanvas.var_et_0_do.cfr_renamed_1(fe_0.var_fe_0_do);
                ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = bk_0.var_byte_case;
                return;
            }
            if ((ef_0.soLuong == 57)) {
                GameCanvas.var_et_0_do = new et_0();
                GameCanvas.var_et_0_do.cfr_renamed_0(fe_0.var_fe_0_do);
            }
        }
    }

    public final void cfr_renamed_18() {
        if ((this.var_java_util_Vector_arr_do[soLuongKhoa] != null) && em_0.boolean_if(var_int_if, this.var_java_util_Vector_arr_do[soLuongKhoa].size())) {
            this.var_ei_new = (ei)this.var_java_util_Vector_arr_do[soLuongKhoa].elementAt(var_int_if);
            if ("  ".length() == (0x18 ^ 0x1C)) {
                return;
            }
        } else if ((this.var_java_util_Vector_do != null) && em_0.boolean_if(soLuongKhoa, this.var_java_util_Vector_do.size())) {
            ei ei2 = (ei)this.var_java_util_Vector_do.elementAt(soLuongKhoa);
            if ((ei2 != null)) {
                this.var_ei_new = ei2;
                if (((0xE4 ^ 0xB3) & ~(0x44 ^ 0x13)) != 0) {
                    return;
                }
            }
        } else {
            this.var_ei_new = null;
        }
        var_boolean_int = 1;
        this.cfr_renamed_29 = GameCanvas.int_if();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void void_for() {
        var_dL_do.void_for();
        if (em_0.boolean_for(this.cfr_renamed_28)) {
            this.cfr_renamed_28 += -this.cfr_renamed_28 >> 1;
        }
        if ((this.cfr_renamed_28 == -1)) {
            this.cfr_renamed_28 = 0;
        }
        if ((this.var_java_util_Vector_arr_do[soLuongKhoa] != null)) {
            int n = this.var_java_util_Vector_arr_do[soLuongKhoa].size();
            int n2 = 0;
            while (!(n2 >= n)) {
                if (em_0.boolean_for(var_boolean_int ? 1 : 0)) {
                    ((ei)this.var_java_util_Vector_arr_do[soLuongKhoa].elementAt(n2)).cfr_renamed_0();
                }
                ++n2;
            }
        }
        if ((this.var_ei_arr_do[soLuongKhoa] != null)) {
            ((bn_0)this).cfr_renamed_4 = this.var_ei_arr_do[soLuongKhoa];
            return;
        }
        ((bn_0)this).cfr_renamed_4 = null;
    }

    public final void (boolean bl != null) {
        this.var_boolean_byte = bl;
    }

            private static void this() {
        mangSoNguyen = new int[38];
        5 = 0x5B ^ 0x33 ^ (0xE3 ^ 0x8E);
        0 = (0x1C ^ 0x7E ^ 99 + 34 - 106 + 100) & (80 + 60 - -57 + 21 ^ 49 + 71 - 104 + 183 ^ -" ".length());
        50 = 0x65 ^ 0x57;
        1 = " ".length();
        86 = 0x56 ^ 0;
        40 = 75 + 117 - 90 + 44 ^ 162 + 157 - 296 + 163;
        4 = 0x6C ^ 0x68;
        2 = "  ".length();
        102 = 0x22 ^ 0x4C ^ (0x9D ^ 0x95);
        -1 = -" ".length();
        25 = 0x24 ^ 0x3D;
        3 = "   ".length();
        57 = 0x26 ^ 0x1F;
        80 = 0xD9 ^ 0xA2 ^ (0x75 ^ 0x5E);
        30 = 0x1B ^ 5;
        150 = 62 + 89 - 136 + 135;
        24 = 0xA7 ^ 0xBF;
        35 = 0x60 ^ 0x2F ^ (0x65 ^ 9);
        10 = 0x14 ^ 0x1E;
        11 = 0xD7 ^ 0xB5 ^ (0x21 ^ 0x48);
        6 = 0x6A ^ 0x6C;
        -2 = -"  ".length();
        8 = 0x71 ^ 0x79;
        15 = 0x38 ^ 0x22 ^ (0xB5 ^ 0xA0);
        20 = 0xE3 ^ 0x99 ^ (0xAD ^ 0xC3);
        99 = 184 + 226 - 243 + 87 ^ 99 + 103 - 60 + 15;
        16 = 0x7E ^ 0x28 ^ (0x53 ^ 0x15);
        2293623 = 0xFFFFFFFF & 0x22FF77;
        9 = 0x53 ^ 0x5A;
        10674392 = 0xFFFFE2DD & 0xA2FDFA;
        22 = 0x4C ^ 0x5A;
        13364969 = 0xFFFFFEED & 0xCBEFFB;
        44 = 0xAF ^ 0x83;
        360 = -(0xFFFF9695 & 0x6D7E) & (0xFFFFFFFF & 0x57B);
        45 = 0x65 ^ 0x48;
        60 = 0x84 ^ 0xBF ^ (1 ^ 6);
        12 = 0xA0 ^ 0xAC;
        -5 = -(0xAE ^ 0xAB);
    }
}

