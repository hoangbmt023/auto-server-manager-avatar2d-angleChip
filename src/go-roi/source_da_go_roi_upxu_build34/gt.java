/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class gt
extends dL
implements fj_0 {
    public static byte[][] var_byte_arr_arr_do;
    private int soLuong;
    private byte var_byte_int;
    private boolean coTrangThai;
    private short var_short_if;
    private ep var_ep_do;
    public ei var_ei_do;
    private int[] mangSoNguyen;
    public static Image var_javax_microedition_lcdui_Image_do;
    private int var_int_if;
    private int soLuongKhoa;
    private byte var_byte_char;
    private int var_int_int;
    private int cfr_renamed_5;
    private int var_int_try;
    private short var_short_for;
    private int var_int_byte;
    private ei var_ei_if;
    private ep var_ep_if;
    private ei var_ei_for;
    private int var_int_case;
    public bU[] var_bU_arr_do;
    public bs var_bs_do;
    private byte var_byte_else;
    private ei var_ei_byte;
    private int var_int_char;
    private long var_long_if;
    private byte var_byte_goto;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private ei var_ei_case;
    private int var_int_else;
    private boolean coKichHoat;
    private int var_int_goto;
    public long soXu;
    private boolean var_boolean_int;
    private int var_int_long;
    private long var_long_for;
    private int cfr_renamed_14;
    private int cfr_renamed_23;
    private int cfr_renamed_24;
    private long var_long_int;
    private boolean var_boolean_try;
    public byte var_byte_do;
    private int cfr_renamed_25;
    private byte var_byte_long;
    public byte var_byte_if;
    public Vector var_java_util_Vector_do;
    public boolean dangChayAuto;
    public static Image var_javax_microedition_lcdui_Image_if;
    public byte var_byte_for = (byte)var_int_arr_if[0];
    private boolean var_boolean_byte;
    private int cfr_renamed_27;
    public static gt var_gt_do;
    private String chuoiGiaTri;
    private ep var_ep_for;
    private int cfr_renamed_26;
    private int cfr_renamed_21;
    private static int[] var_int_arr_if;
    private int cfr_renamed_29;
    public static Image[] var_javax_microedition_lcdui_Image_arr_if;
    private ei var_ei_char;
    private cf var_cf_do;
    private int cfr_renamed_9;
    private byte this;
    private short var_short_int;
    public short var_short_do;
    private ep var_ep_int;

    private void cfr_renamed_1() {
        if ((this.cfr_renamed_9 != var_int_arr_if[2])) {
            eq.eq_do().cfr_renamed_3(((bk_0)this.var_bU_arr_do[this.var_int_if]).cfr_renamed_12, this.mangSoNguyen[this.cfr_renamed_9]);
            this.cfr_renamed_9 = var_int_arr_if[2];
            this.var_int_if = var_int_arr_if[2];
            this.var_boolean_int = var_int_arr_if[0];
            this.void_if(var_int_arr_if[18]);
            return;
        }
        if ((this.this > 0)) {
            this.this = (byte)var_int_arr_if[0];
            this.var_boolean_int = var_int_arr_if[0];
            this.var_int_if = var_int_arr_if[2];
            return;
        }
        if ((this.cfr_renamed_24 != var_int_arr_if[2])) {
            eq.eq_do().cfr_renamed_15(((bk_0)this.var_bU_arr_do[this.cfr_renamed_24]).cfr_renamed_12);
            this.cfr_renamed_24 = var_int_arr_if[2];
            return;
        }
        if ((this.var_int_if != var_int_arr_if[2])) {
            this.var_boolean_int = var_int_arr_if[1];
            this.var_ei_new = this.var_ei_char;
            ((bn_0)this).cfr_renamed_4 = null;
            this.var_ei_try = this.var_ei_case;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void void_for(int n) {
        Object object;
        Object object2;
        Vector<Object> vector = new Vector<Object>();
        Vector<Object> vector2 = new Vector<Object>();
        Vector<Object> vector3 = new Vector<Object>();
        Vector<Object> vector4 = new Vector<Object>();
        Vector<Object> vector5 = new Vector<Object>();
        int n2 = var_int_arr_if[0];
        while (!(n2 >= ci_0.var_q_0_arr_do.length)) {
            object2 = ci_0.var_q_0_arr_do[n2];
            if (gt.cfr_renamed_4(((q_0)object2).cfr_renamed_3, var_int_arr_if[2]) && gt.cfr_renamed_2(((q_0)object2).var_short_do, var_int_arr_if[9]) && gt.cfr_renamed_5(((q_0)object2).var_byte_do)) {
                object = (ci)object2;
                if (!gt.cfr_renamed_5(((ci)object).cfr_renamed_3, n) || gt.cfr_renamed_4(((ci)object).cfr_renamed_3)) {
                    if (gt.cfr_renamed_4(((q_0)object).var_byte_if, var_int_arr_if[21])) {
                        vector.addElement(object);
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    } else if (gt.cfr_renamed_4(((q_0)object2).var_byte_if, var_int_arr_if[31])) {
                        vector2.addElement(object);
                        } else if (gt.cfr_renamed_4(((q_0)object2).var_byte_if, var_int_arr_if[38])) {
                        vector3.addElement(object);
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    } else if (gt.cfr_renamed_4(((q_0)object2).var_byte_if, var_int_arr_if[44])) {
                        vector4.addElement(object);
                        } else if (gt.cfr_renamed_4(((q_0)object2).var_byte_if, var_int_arr_if[45])) {
                        vector5.addElement(object);
                    }
                }
            }
            ++n2;
        }
        n2 = var_int_arr_if[0];
        while (!(n2 >= var_int_arr_if[21])) {
            object2 = new DuLieuNguoiChoi();
            new DuLieuNguoiChoi().var_byte_void = (byte)n;
            object = new ef();
            new ef().var_short_do = ((q_0)vector.elementAt((int)gc_0.int_do((int)vector.size()))).var_short_do;
            ((DuLieuNguoiChoi)object2).cfr_renamed_1((ef)object);
            object = new ef();
            new ef().var_short_do = ((q_0)vector2.elementAt((int)gc_0.int_do((int)vector2.size()))).var_short_do;
            ((DuLieuNguoiChoi)object2).cfr_renamed_1((ef)object);
            object = new ef();
            new ef().var_short_do = ((q_0)vector3.elementAt((int)gc_0.int_do((int)vector3.size()))).var_short_do;
            ((DuLieuNguoiChoi)object2).cfr_renamed_1((ef)object);
            object = new ef();
            new ef().var_short_do = ((q_0)vector4.elementAt((int)gc_0.int_do((int)vector4.size()))).var_short_do;
            ((DuLieuNguoiChoi)object2).cfr_renamed_1((ef)object);
            object = new ef();
            new ef().var_short_do = ((q_0)vector5.elementAt((int)gc_0.int_do((int)vector5.size()))).var_short_do;
            ((DuLieuNguoiChoi)object2).cfr_renamed_1((ef)object);
            ((DuLieuNguoiChoi)object2).void_if();
            this.var_java_util_Vector_do.addElement(object2);
            ++n2;
        }
    }

        public static gt cfr_renamed_0() {
        if ((var_gt_do == null)) {
            var_gt_do = new gt();
            return var_gt_do;
        }
        return var_gt_do;
    }

    public final void void_if(int n) {
        block10: while (true) {
            switch (n) {
                case 0: {
                    eq eq2 = eq.eq_do();
                    eq2.cfr_renamed_0(var_int_arr_if[18]);
                    eq2.cfr_renamed_1();
                    GameCanvas.cfr_renamed_5();
                    return;
                }
                case 1: {
                    if (!gt.boolean_for(this.var_int_if)) break block10;
                    this.var_boolean_int = var_int_arr_if[1];
                    this.var_ei_new = this.var_ei_char;
                    ((bn_0)this).cfr_renamed_4 = null;
                    this.var_ei_try = this.var_ei_case;
                    return;
                }
                case 2: {
                    au_0 au_02 = new au_0();
                    if ((this.dangChayAuto)) {
                        GameCanvas.hienThongBaoPopup(MenuChinhAvatar.am, au_02);
                        return;
                    }
                    GameCanvas.hienThongBaoPopup(MenuChinhAvatar.cy, au_02);
                    return;
                }
                case 3: {
                    byte by2 = this.var_byte_if;
                    this.var_byte_if = (byte)(by2 + var_int_arr_if[1]);
                    ek_0.ek_0_do().var_bk_0_do = this.var_bU_arr_do[by2];
                    if (!(this.var_byte_if >= var_int_arr_if[14])) break block10;
                    this.var_byte_if = (byte)var_int_arr_if[0];
                    return;
                }
                case 5: {
                    if (!!(this.dangChayAuto) || !(this.var_boolean_byte)) {
                        ((bn_0)this).cfr_renamed_4 = this.var_ei_for;
                    }
                    this.var_ei_try = null;
                    return;
                }
                case 6: {
                    eq.eq_do().cfr_renamed_3(((bk_0)this.var_bU_arr_do[this.var_int_if]).cfr_renamed_12, this.mangSoNguyen[this.cfr_renamed_9]);
                    n = var_int_arr_if[18];
                    if (((0x5D ^ 0x65) & ~(0xBF ^ 0x87)) < " ".length()) continue block10;
                    return;
                }
                case 7: {
                    Vector<ei> vector = new Vector<ei>();
                    vector.addElement(new ei(MenuChinhAvatar.var_java_lang_String_goto, var_int_arr_if[0], this));
                    vector.addElement(new ei(MenuChinhAvatar.aY, var_int_arr_if[6], this));
                    u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[0]);
                    return;
                }
                case 8: {
                    this.var_ei_new = this.var_ei_byte;
                    ((bn_0)this).cfr_renamed_4 = this.var_ei_if;
                    this.var_ei_try = null;
                    this.var_boolean_int = var_int_arr_if[0];
                }
            }
            break;
        }
    }

    static {
        gt.cfr_renamed_4();
    }

    public final void void_do(int n) {
        ce.cfr_renamed_0().cfr_renamed_0(n, this);
        super.void_do(n);
    }

    private static boolean boolean_do(int n) {
        return n <= 0;
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Unable to fully structure code
     */
    private static void (Graphics var0, int var1_1, int var2_2, int var3_3, int var4_4, ep var5_5, int var6_6 != null) {
        var5_5.cfr_renamed_0(gt.var_int_arr_if[0], var1_1, var2_2, gt.var_int_arr_if[0], var0);
        var5_5.cfr_renamed_0(gt.var_int_arr_if[6], var1_1 + var3_3 - var5_5.cfr_renamed_3, var2_2, gt.var_int_arr_if[0], var0);
        var5_5.cfr_renamed_0(gt.var_int_arr_if[12], var1_1, var2_2 + var4_4 - var5_5.soLuong, gt.var_int_arr_if[0], var0);
        var5_5.cfr_renamed_0(gt.var_int_arr_if[16], var1_1 + var3_3 - var5_5.cfr_renamed_3, var2_2 + var4_4 - var5_5.soLuong, gt.var_int_arr_if[0], var0);
        var7_7 = gt.var_int_arr_if[0];
        if (-" ".length() == -" ".length()) ** GOTO lbl13
        return;
lbl-1000:
        // 1 sources

        {
            var5_5.cfr_renamed_0(gt.var_int_arr_if[1], var1_1 + (var7_7 + gt.var_int_arr_if[1]) * var5_5.cfr_renamed_3, var2_2, gt.var_int_arr_if[0], var0);
            var5_5.cfr_renamed_0(gt.var_int_arr_if[14], var1_1 + (var7_7 + gt.var_int_arr_if[1]) * var5_5.cfr_renamed_3, var2_2 + var4_4 - var5_5.soLuong, gt.var_int_arr_if[0], var0);
            ++var7_7;
lbl13:
            // 2 sources

            ** while (!gt.cfr_renamed_3((int)var7_7, (int)((var3_3 - (var5_5.cfr_renamed_3 << gt.var_int_arr_if[1])) / var5_5.cfr_renamed_3)))
        }
lbl14:
        // 1 sources

        var5_5.cfr_renamed_0(gt.var_int_arr_if[1], var1_1 + var3_3 - (var5_5.cfr_renamed_3 << gt.var_int_arr_if[1]), var2_2, gt.var_int_arr_if[0], var0);
        var5_5.cfr_renamed_0(gt.var_int_arr_if[14], var1_1 + var3_3 - (var5_5.cfr_renamed_3 << gt.var_int_arr_if[1]), var2_2 + var4_4 - var5_5.soLuong, gt.var_int_arr_if[0], var0);
        var7_7 = gt.var_int_arr_if[0];
        if (-"  ".length() <= 0) ** GOTO lbl24
        return;
lbl-1000:
        // 1 sources

        {
            var5_5.cfr_renamed_0(gt.var_int_arr_if[8], var1_1, var2_2 + (var7_7 + gt.var_int_arr_if[1]) * var5_5.soLuong, gt.var_int_arr_if[0], var0);
            var5_5.cfr_renamed_0(gt.var_int_arr_if[10], var1_1 + var3_3 - var5_5.cfr_renamed_3, var2_2 + (var7_7 + gt.var_int_arr_if[1]) * var5_5.soLuong, gt.var_int_arr_if[0], var0);
            ++var7_7;
lbl24:
            // 2 sources

            ** while (!gt.cfr_renamed_3((int)var7_7, (int)((var4_4 - (var5_5.soLuong << gt.var_int_arr_if[1])) / var5_5.soLuong)))
        }
lbl25:
        // 1 sources

        var5_5.cfr_renamed_0(gt.var_int_arr_if[8], var1_1, var2_2 + var4_4 - (var5_5.soLuong << gt.var_int_arr_if[1]), gt.var_int_arr_if[0], var0);
        var5_5.cfr_renamed_0(gt.var_int_arr_if[10], var1_1 + var3_3 - var5_5.cfr_renamed_3, var2_2 + var4_4 - (var5_5.soLuong << gt.var_int_arr_if[1]), gt.var_int_arr_if[0], var0);
        if ((var6_6 != gt.var_int_arr_if[2])) {
            var0.setColor(var6_6);
            var0.fillRect(var1_1 + var5_5.cfr_renamed_3, var2_2 + var5_5.soLuong, var3_3 - (var5_5.cfr_renamed_3 << gt.var_int_arr_if[1]), var4_4 - (var5_5.soLuong << gt.var_int_arr_if[1]));
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

    private static boolean boolean_for(int n) {
        return n >= 0;
    }

    private static void cfr_renamed_4() {
        var_int_arr_if = new int[53];
        gt.var_int_arr_if[0] = (0xFC ^ 0xAE) & ~(0x90 ^ 0xC2);
        gt.var_int_arr_if[1] = " ".length();
        gt.var_int_arr_if[2] = -" ".length();
        gt.var_int_arr_if[3] = 0x51 ^ 0x58 ^ (5 ^ 0x5C) & ~(0x9E ^ 0xC7);
        gt.var_int_arr_if[4] = 0xFA ^ 0x9E ^ (0x24 ^ 0x15) & ~(0x27 ^ 0x16);
        gt.var_int_arr_if[5] = 0xFFFFBBFD & 0x45F6;
        gt.var_int_arr_if[6] = "  ".length();
        gt.var_int_arr_if[7] = 0xFFFFB7EA & 0x4BFD;
        gt.var_int_arr_if[8] = "   ".length();
        gt.var_int_arr_if[9] = 0xFFFFB7FE & 0x4FD1;
        gt.var_int_arr_if[10] = 0xCA ^ 0x93 ^ (0xDC ^ 0x81);
        gt.var_int_arr_if[11] = -(0xFFFF8CE9 & 0x7F77) & (0xFFFF9FFD & 0x7FEA);
        gt.var_int_arr_if[12] = 0x96 ^ 0x93;
        gt.var_int_arr_if[13] = 0xFFFFFF12 & 0x27FD;
        gt.var_int_arr_if[14] = 39 + 49 - -37 + 24 ^ 12 + 47 - -63 + 25;
        gt.var_int_arr_if[15] = 0xFFFFDE2C & 0x6FF3;
        gt.var_int_arr_if[16] = 0x4B ^ 0x4C;
        gt.var_int_arr_if[17] = -(0xFFFFE8CF & 0x1FB4) & (0xFFFFFDFB & 0x7FB7);
        gt.var_int_arr_if[18] = 0x9A ^ 0x92;
        gt.var_int_arr_if[19] = -(0xFFFFC6D7 & 0x3DAF) & (0xFFFFCFDE & 0xF7F7);
        gt.var_int_arr_if[20] = 126 + 160 - 209 + 103 ^ 41 + 37 - 76 + 182;
        gt.var_int_arr_if[21] = 0x99 ^ 0x93;
        gt.var_int_arr_if[22] = 0xCD ^ 0xC6;
        gt.var_int_arr_if[23] = (0x10 ^ 0x4A) + (34 + 132 - 85 + 54) - (0x20 ^ 0xA) + (0x8A ^ 0xAF);
        gt.var_int_arr_if[24] = (0x3F ^ 0x71) + (133 + 18 - 105 + 183) - (56 + 66 - -8 + 98) + (93 + 34 - 21 + 55);
        gt.var_int_arr_if[25] = 3 + 109 - -22 + 53 ^ 34 + 127 - 124 + 135;
        gt.var_int_arr_if[26] = 0xAB ^ 0xB1 ^ (0x67 ^ 0x14);
        gt.var_int_arr_if[27] = (0x4C ^ 0x35) + (0xEF ^ 0xBE) - (0xBD ^ 0x98) + (0x21 ^ 0xF);
        gt.var_int_arr_if[28] = 0x27 ^ 0x78;
        gt.var_int_arr_if[29] = 75 + 84 - 76 + 97;
        gt.var_int_arr_if[30] = 0x36 ^ 0x42 ^ (0xD9 ^ 0xC3);
        gt.var_int_arr_if[31] = 0x75 ^ 0x61;
        gt.var_int_arr_if[32] = 6 ^ 0x52 ^ (0xCE ^ 0x85);
        gt.var_int_arr_if[33] = 0x75 ^ 0x5E ^ (0x16 ^ 1);
        gt.var_int_arr_if[34] = 40 + 74 - 17 + 85 ^ 145 + 39 - 124 + 114;
        gt.var_int_arr_if[35] = 3 + 133 - 19 + 56 ^ 62 + 120 - 147 + 128;
        gt.var_int_arr_if[36] = 130 + 174 - 168 + 80 ^ 80 + 90 - 19 + 29;
        gt.var_int_arr_if[37] = 0x48 ^ 0x6B;
        gt.var_int_arr_if[38] = 0xBD ^ 0xA3;
        gt.var_int_arr_if[39] = 82 + 90 - 89 + 132;
        gt.var_int_arr_if[40] = (0x3D ^ 0x4A) + "   ".length() - (0x52 ^ 0x5D) + (0x51 ^ 0x1F);
        gt.var_int_arr_if[41] = 186 + 60 - 36 + 13 ^ 86 + 23 - 9 + 43;
        gt.var_int_arr_if[42] = 0x3E ^ 0x43 ^ (0x7D ^ 0x60);
        gt.var_int_arr_if[43] = 0xD8 ^ 0x88 ^ (0x78 ^ 0x18);
        gt.var_int_arr_if[44] = 0x1D ^ 0x18 ^ (0x60 ^ 0x4D);
        gt.var_int_arr_if[45] = 0xD ^ 0x58 ^ (0xA1 ^ 0xC6);
        gt.var_int_arr_if[46] = 0x4B ^ 0x28 ^ (0x19 ^ 0x67);
        gt.var_int_arr_if[47] = 0x46 ^ 0x5C;
        gt.var_int_arr_if[48] = 0xA2 ^ 0xC2 ^ (0xE6 ^ 0xA6);
        gt.var_int_arr_if[49] = 40 + 14 - 36 + 161 ^ 96 + 69 - 86 + 109;
        gt.var_int_arr_if[50] = -(-"   ".length() & (0xFFFFFFBF & 0xBC3B7F));
        gt.var_int_arr_if[51] = 0xAE ^ 0xA5 ^ (0x59 ^ 0x14);
        gt.var_int_arr_if[52] = -(0xFFFFA377 & 0x7FDF) & (0xFFFFB7FF & 0x6F7F);
    }

    private static boolean boolean_if(int n, int n2) {
        return n <= n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_15() {
        block50: {
            block51: {
                block52: {
                    super.cfr_renamed_15();
                    ++this.var_long_for;
                    if (!(GameCanvas.var_et_0_do != null) || gt.cfr_renamed_4((int)et_0.coTrangThai)) {
                        super.cfr_renamed_15();
                    }
                    if (gt.cfr_renamed_2((int)GameCanvas.boolean_do(gt.var_int_arr_if[6]))) {
                        if (gt.cfr_renamed_2((int)this.var_boolean_int)) {
                            if ((this.cfr_renamed_9 / gt.var_int_arr_if[8] > 0)) {
                                this.cfr_renamed_9 -= gt.var_int_arr_if[8];
                                if ((("   ".length() ^ (147 ^ 142)) & (79 + 69 - -3 + 8 ^ 34 + 30 - 11 + 76 ^ -" ".length())) > ((150 + 120 - 247 + 128 ^ 136 + 125 - 207 + 103) & (204 ^ 151 ^ (91 ^ 10) ^ -" ".length()))) {
                                    return;
                                }
                            }
                        } else {
                            this.var_int_if -= gt.var_int_arr_if[1];
                            if (gt.boolean_if(this.var_int_if)) {
                                this.var_int_if = gt.var_int_arr_if[0];
                                }
                        }
                    } else if (gt.cfr_renamed_2((int)GameCanvas.boolean_do(gt.var_int_arr_if[18]))) {
                        if (gt.cfr_renamed_2((int)this.var_boolean_int)) {
                            if ((this.cfr_renamed_9 / gt.var_int_arr_if[8] < gt.var_int_arr_if[6])) {
                                this.cfr_renamed_9 += gt.var_int_arr_if[8];
                                if ("  ".length() < 0) {
                                    return;
                                }
                            }
                        } else {
                            this.var_int_if += gt.var_int_arr_if[1];
                            if (gt.boolean_do(this.var_int_if, gt.var_int_arr_if[12])) {
                                this.var_int_if = gt.var_int_arr_if[12];
                                if (-"   ".length() > 0) {
                                    return;
                                }
                            }
                        }
                    } else if (gt.cfr_renamed_2((int)GameCanvas.boolean_do(gt.var_int_arr_if[10]))) {
                        if (gt.cfr_renamed_2((int)this.var_boolean_int) && (this.cfr_renamed_9 % gt.var_int_arr_if[8] > 0)) {
                            this.cfr_renamed_9 -= gt.var_int_arr_if[1];
                            if (((27 ^ 59 ^ (65 ^ 38)) & (115 + 198 - 71 + 0 ^ 165 + 22 - 89 + 83 ^ -" ".length())) != 0) {
                                return;
                            }
                        }
                    } else if (gt.cfr_renamed_2((int)GameCanvas.boolean_do(gt.var_int_arr_if[14])) && gt.cfr_renamed_2((int)this.var_boolean_int) && (this.cfr_renamed_9 % gt.var_int_arr_if[8] < gt.var_int_arr_if[6])) {
                        this.cfr_renamed_9 += gt.var_int_arr_if[1];
                    }
                    if (!gt.cfr_renamed_2((int)GameCanvas.coKichHoat) || !(this.var_bU_arr_do != null) || !gt.cfr_renamed_4((int)this.dangChayAuto) || !gt.cfr_renamed_2((int)this.var_boolean_byte)) break block50;
                    if (!gt.cfr_renamed_2((int)this.var_boolean_int)) break block51;
                    if (!gt.cfr_renamed_2((int)GameCanvas.boolean_do(this.cfr_renamed_25 + this.var_int_int - gt.var_int_arr_if[38] * bn_0.cfr_renamed_6, this.var_int_goto, gt.var_int_arr_if[38] * bn_0.cfr_renamed_6, gt.var_int_arr_if[38] * bn_0.cfr_renamed_6))) break block52;
                    GameCanvas.coKichHoat = gt.var_int_arr_if[0];
                    this.this = (byte)gt.var_int_arr_if[12];
                    this.coKichHoat = gt.var_int_arr_if[1];
                    this.var_long_int = this.var_long_for;
                    if ((0 ^ 4) > (122 ^ 126)) {
                        return;
                    }
                    break block50;
                }
                var1_1 = gt.var_int_arr_if[0];
                if (-" ".length() < "  ".length()) ** GOTO lbl78
                return;
lbl-1000:
                // 1 sources

                {
                    if (gt.cfr_renamed_2((int)GameCanvas.boolean_do(this.cfr_renamed_25 + gt.var_int_arr_if[12] * bn_0.cfr_renamed_6 + var1_1 % gt.var_int_arr_if[8] * (gt.var_int_arr_if[12] * bn_0.cfr_renamed_6 + this.var_ep_int.cfr_renamed_3), this.var_int_goto + (this.cfr_renamed_26 - gt.var_int_arr_if[46] * bn_0.cfr_renamed_6 * gt.var_int_arr_if[8]) + var1_1 / gt.var_int_arr_if[8] * gt.var_int_arr_if[46] * bn_0.cfr_renamed_6 - gt.var_int_arr_if[1] * bn_0.cfr_renamed_6, gt.var_int_arr_if[33] * bn_0.cfr_renamed_6, gt.var_int_arr_if[47] * bn_0.cfr_renamed_6))) {
                        this.cfr_renamed_9 = var1_1;
                        GameCanvas.coKichHoat = gt.var_int_arr_if[0];
                        this.coKichHoat = gt.var_int_arr_if[1];
                        this.var_long_int = this.var_long_for;
                        if (((10 ^ 12) & ~(158 ^ 152)) != 0) {
                            return;
                        }
                        break block50;
                    }
                    ++var1_1;
lbl78:
                    // 2 sources

                    ** while (!gt.cfr_renamed_3((int)var1_1, (int)gt.var_int_arr_if[3]))
                }
lbl79:
                // 1 sources

                if ((66 ^ 70) <= -" ".length()) {
                    return;
                }
                break block50;
            }
            var1_2 = gt.var_int_arr_if[0];
            if (null == null) ** GOTO lbl109
            return;
lbl-1000:
            // 1 sources

            {
                if (gt.cfr_renamed_2((int)GameCanvas.boolean_do(this.soLuongKhoa + this.var_int_byte + gt.var_int_arr_if[48] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6] - gt.var_int_arr_if[49] * bn_0.cfr_renamed_6, this.cfr_renamed_21 + this.var_int_case + gt.var_int_arr_if[8] * bn_0.cfr_renamed_6 + gt.var_int_arr_if[37] * bn_0.cfr_renamed_6 * var1_2 + gt.var_int_arr_if[32] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6] - gt.var_int_arr_if[49] * bn_0.cfr_renamed_6, gt.var_int_arr_if[32] * bn_0.cfr_renamed_6, gt.var_int_arr_if[32] * bn_0.cfr_renamed_6))) {
                    this.cfr_renamed_24 = var1_2;
                    this.coKichHoat = gt.var_int_arr_if[1];
                    GameCanvas.coKichHoat = gt.var_int_arr_if[0];
                    this.var_long_int = this.var_long_for;
                    if ((22 ^ 18) > "  ".length()) break;
                    return;
                }
                if (gt.cfr_renamed_2((int)GameCanvas.boolean_do(this.soLuongKhoa + this.var_int_byte + this.cfr_renamed_29 - gt.var_int_arr_if[1] * bn_0.cfr_renamed_6 - this.var_ep_int.cfr_renamed_3, this.cfr_renamed_21 + this.var_int_case + gt.var_int_arr_if[8] * bn_0.cfr_renamed_6 + gt.var_int_arr_if[37] * bn_0.cfr_renamed_6 * var1_2 + gt.var_int_arr_if[32] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6] - gt.var_int_arr_if[49] * bn_0.cfr_renamed_6, gt.var_int_arr_if[33] * bn_0.cfr_renamed_6, gt.var_int_arr_if[32] * bn_0.cfr_renamed_6))) {
                    this.var_int_if = var1_2;
                    this.coKichHoat = gt.var_int_arr_if[1];
                    GameCanvas.coKichHoat = gt.var_int_arr_if[0];
                    this.var_long_int = this.var_long_for;
                    if ("  ".length() != ((209 ^ 152 ^ (115 ^ 36)) & (112 ^ 109 ^ "   ".length() ^ -" ".length()))) break;
                    return;
                }
                ++var1_2;
lbl109:
                // 2 sources

                ** while (!gt.cfr_renamed_3((int)var1_2, (int)gt.var_int_arr_if[14]))
            }
        }
        if (gt.cfr_renamed_2((int)this.coKichHoat)) {
            if (gt.cfr_renamed_2((int)GameCanvas.var_boolean_try)) {
                if ((this.cfr_renamed_9 != gt.var_int_arr_if[2])) {
                    if (gt.cfr_renamed_4((int)GameCanvas.boolean_do(this.cfr_renamed_25 + gt.var_int_arr_if[12] * bn_0.cfr_renamed_6 + this.cfr_renamed_9 % gt.var_int_arr_if[8] * (gt.var_int_arr_if[12] * bn_0.cfr_renamed_6 + this.var_ep_int.cfr_renamed_3), this.var_int_goto + (this.cfr_renamed_26 - gt.var_int_arr_if[46] * bn_0.cfr_renamed_6 * gt.var_int_arr_if[8]) + this.cfr_renamed_9 / gt.var_int_arr_if[8] * gt.var_int_arr_if[46] * bn_0.cfr_renamed_6 - gt.var_int_arr_if[1] * bn_0.cfr_renamed_6, gt.var_int_arr_if[33] * bn_0.cfr_renamed_6, gt.var_int_arr_if[47] * bn_0.cfr_renamed_6))) {
                        this.cfr_renamed_9 = gt.var_int_arr_if[2];
                        if (" ".length() >= "  ".length()) {
                            return;
                        }
                    }
                } else if ((this.this != 0)) {
                    if (gt.cfr_renamed_4((int)GameCanvas.boolean_do(this.cfr_renamed_25 + this.var_int_int - gt.var_int_arr_if[38] * bn_0.cfr_renamed_6, this.var_int_goto, gt.var_int_arr_if[38] * bn_0.cfr_renamed_6, gt.var_int_arr_if[38] * bn_0.cfr_renamed_6))) {
                        this.this = (byte)gt.var_int_arr_if[0];
                        if ((97 ^ 101) != (146 ^ 150)) {
                            return;
                        }
                    }
                } else if ((this.cfr_renamed_24 != gt.var_int_arr_if[2])) {
                    if (gt.cfr_renamed_4((int)GameCanvas.boolean_do(this.soLuongKhoa + this.var_int_byte + gt.var_int_arr_if[48] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6] - gt.var_int_arr_if[49] * bn_0.cfr_renamed_6, this.cfr_renamed_21 + this.var_int_case + gt.var_int_arr_if[8] * bn_0.cfr_renamed_6 + gt.var_int_arr_if[37] * bn_0.cfr_renamed_6 * this.cfr_renamed_24 + gt.var_int_arr_if[32] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6] - gt.var_int_arr_if[49] * bn_0.cfr_renamed_6, gt.var_int_arr_if[32] * bn_0.cfr_renamed_6, gt.var_int_arr_if[32] * bn_0.cfr_renamed_6))) {
                        this.cfr_renamed_24 = gt.var_int_arr_if[2];
                        if (((242 ^ 188) & ~(192 ^ 142)) > " ".length()) {
                            return;
                        }
                    }
                } else if ((this.var_int_if != gt.var_int_arr_if[2]) && gt.cfr_renamed_4((int)this.var_boolean_int) && gt.cfr_renamed_4((int)GameCanvas.boolean_do(this.soLuongKhoa + this.var_int_byte + this.cfr_renamed_29 - gt.var_int_arr_if[1] * bn_0.cfr_renamed_6 - this.var_ep_int.cfr_renamed_3, this.cfr_renamed_21 + this.var_int_case + gt.var_int_arr_if[8] * bn_0.cfr_renamed_6 + gt.var_int_arr_if[37] * bn_0.cfr_renamed_6 * this.var_int_if + gt.var_int_arr_if[32] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6] - gt.var_int_arr_if[49] * bn_0.cfr_renamed_6, gt.var_int_arr_if[33] * bn_0.cfr_renamed_6, gt.var_int_arr_if[32] * bn_0.cfr_renamed_6))) {
                    this.var_int_if = gt.var_int_arr_if[2];
                }
            }
            if (gt.cfr_renamed_2((int)GameCanvas.var_boolean_new)) {
                if (gt.boolean_do((this.var_long_for - this.var_long_int, 4L == null))) {
                    this.var_byte_long = (byte)gt.var_int_arr_if[12];
                    if (-" ".length() < -" ".length()) {
                        return;
                    }
                } else {
                    this.cfr_renamed_1();
                }
                this.coKichHoat = gt.var_int_arr_if[0];
                GameCanvas.var_boolean_new = gt.var_int_arr_if[0];
            }
        }
        if (!gt.cfr_renamed_4((int)this.dangChayAuto) || gt.cfr_renamed_4((int)this.var_boolean_byte)) {
            GameCanvas.var_ef_0_do.cfr_renamed_0();
        }
    }

                /*
     * Unable to fully structure code
     */
    public final void void_for() {
        block30: {
            block28: {
                block29: {
                    if (gt.boolean_for(this.var_byte_long)) {
                        this.var_byte_long = (byte)(this.var_byte_long - gt.var_int_arr_if[1]);
                        if ((this.var_byte_long == 0)) {
                            this.cfr_renamed_1();
                        }
                    }
                    if ((!gt.cfr_renamed_4((int)this.dangChayAuto) || gt.cfr_renamed_4((int)this.var_boolean_byte)) && gt.boolean_for((System.currentTimeMillis() - this.soXu != 1000L))) {
                        this.soXu = System.currentTimeMillis();
                        this.var_short_do = (short)(this.var_short_do - gt.var_int_arr_if[1]);
                        if (gt.boolean_if(this.var_short_do)) {
                            this.var_short_do = (short)gt.var_int_arr_if[0];
                        }
                    }
                    AngelChip.duLieuNguoiChoi.void_do(ek_0.ek_0_do().soLuong + GameCanvas.var_int_int, ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_char - gt.var_int_arr_if[44] * bn_0.cfr_renamed_6);
                    if (gt.boolean_for((System.currentTimeMillis() - this.var_long_if != 1000L))) {
                        this.var_long_if = System.currentTimeMillis();
                        this.var_short_for = (short)(this.var_short_for - gt.var_int_arr_if[1]);
                        if (gt.boolean_if(this.var_short_for)) {
                            this.var_short_for = (short)gt.var_int_arr_if[0];
                            if (-(79 ^ 75) > 0) {
                                return;
                            }
                        } else {
                            this.soLuong += gt.var_int_arr_if[1];
                            if (gt.cfr_renamed_2((int)this.var_boolean_byte) && gt.cfr_renamed_4((int)this.dangChayAuto) && (this.soLuong > 0)) {
                                this.soLuong = gt.var_int_arr_if[0];
                                if (gt.boolean_for(this.var_int_if) && (this.var_bU_arr_do != null) && (this.var_int_if < gt.var_int_arr_if[14]) && (this.var_bU_arr_do[this.var_int_if] != null) && (this.var_bU_arr_do[this.var_int_if].cfr_renamed_12 != this.cfr_renamed_5)) {
                                    this.cfr_renamed_5 = this.var_bU_arr_do[this.var_int_if].cfr_renamed_12;
                                    eq.eq_do().cfr_renamed_15(this.cfr_renamed_5);
                                }
                            }
                        }
                    }
                    if (!(this.var_bU_arr_do != null)) break block28;
                    var1_1 = gt.var_int_arr_if[0];
                    var2_2 = gt.var_int_arr_if[0];
                    if (-(118 ^ 115) < 0) ** GOTO lbl37
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((!gt.cfr_renamed_4((int)this.dangChayAuto) || gt.cfr_renamed_4((int)this.var_boolean_byte)) && (this.var_bU_arr_do[var2_2].var_byte_do >= this.var_bU_arr_do[var2_2].var_short_arr_if.length)) {
                            ++var1_1;
                        }
                        ++var2_2;
lbl37:
                        // 2 sources

                        ** while (!gt.cfr_renamed_3((int)var2_2, (int)gt.var_int_arr_if[14]))
                    }
lbl38:
                    // 1 sources

                    if (!gt.cfr_renamed_4((int)this.var_boolean_try) || !(var1_1 == gt.var_int_arr_if[14])) break block29;
                    this.var_boolean_try = gt.var_int_arr_if[1];
                    var2_2 = gt.var_int_arr_if[0];
                    if (null == null) ** GOTO lbl47
                    return;
lbl-1000:
                    // 1 sources

                    {
                        ef_0.cfr_renamed_0(this.var_bU_arr_do[var2_2]);
                        ++var2_2;
lbl47:
                        // 2 sources

                        ** while (!gt.cfr_renamed_3((int)var2_2, (int)gt.var_int_arr_if[14]))
                    }
                }
                if (gt.cfr_renamed_2((int)this.var_boolean_try) && (this.var_bs_do != null)) {
                    this.var_boolean_try = gt.var_int_arr_if[0];
                    GameCanvas.var_dX_do = this.var_bs_do;
                    v0 = gt.var_int_arr_if[0];
                    AngelChip.duLieuNguoiChoi.mangSoNguyen[v0] = AngelChip.duLieuNguoiChoi.mangSoNguyen[v0] + this.var_bs_do.cfr_renamed_4;
                    GameCanvas.void_if(this.var_bs_do.cfr_renamed_4, GameCanvas.var_int_int, GameCanvas.var_int_char - gt.var_int_arr_if[38] * bn_0.cfr_renamed_6, gt.var_int_arr_if[2]);
                    this.var_bs_do = null;
                }
            }
            GameCanvas.var_ef_0_do.cfr_renamed_3();
            if (gt.cfr_renamed_2((int)this.dangChayAuto) && (this.var_byte_for > 0)) {
                this.var_byte_for = (byte)(this.var_byte_for - gt.var_int_arr_if[1]);
            }
            if ((this.var_cf_do != null) && gt.cfr_renamed_2((int)this.var_cf_do.boolean_do())) {
                this.var_cf_do.var_java_lang_String_arr_do = null;
            }
            if (gt.cfr_renamed_4((int)this.dangChayAuto) && !gt.cfr_renamed_4((int)this.var_boolean_byte)) break block30;
            var1_1 = gt.var_int_arr_if[0];
            if (-"  ".length() <= 0) ** GOTO lbl99
            return;
lbl-1000:
            // 1 sources

            {
                var2_3 = (bk_0)ef_0.var_java_util_Vector_do.elementAt(var1_1);
                if ((var2_3.var_byte_if == gt.var_int_arr_if[3])) {
                    var2_3 = (DuLieuNguoiChoi)var2_3;
                    if (gt.cfr_renamed_5(gt.cfr_renamed_0(System.currentTimeMillis() / 1000L - (long)var2_3.var_int_void, (long)var2_3.cfr_renamed_14))) {
                        var2_3.var_int_void = (int)(System.currentTimeMillis() / 1000L);
                        var2_3.cfr_renamed_14 = (short)(gc_0.int_do(gt.var_int_arr_if[21]) + gt.var_int_arr_if[14]);
                        var3_4 = gc_0.int_do(gt.var_int_arr_if[14]);
                        if ((var3_4 == gt.var_int_arr_if[1])) {
                            var2_3.cfr_renamed_1(gt.var_int_arr_if[0]);
                            if ((91 + 73 - 134 + 104 ^ 12 + 19 - -92 + 8) == 0) {
                                return;
                            }
                        } else if ((var3_4 == gt.var_int_arr_if[8])) {
                            var2_3.cfr_renamed_1(gt.var_int_arr_if[0]);
                            var2_3.cfr_renamed_5();
                            } else if ((var3_4 == gt.var_int_arr_if[6])) {
                            var2_3.cfr_renamed_1(gt.var_int_arr_if[16]);
                            if (" ".length() <= ((83 ^ 6) & ~(194 ^ 151))) {
                                return;
                            }
                        } else {
                            var2_3.cfr_renamed_1(gt.var_int_arr_if[6]);
                        }
                    }
                }
                ++var1_1;
lbl99:
                // 2 sources

                ** while (!gt.cfr_renamed_3((int)var1_1, (int)ef_0.var_java_util_Vector_do.size()))
            }
        }
    }

        private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void (short s2, String string, short s3, byte by2, byte by3, byte by4 != null) {
        this.coTrangThai = var_int_arr_if[1];
        this.var_short_if = s2;
        this.chuoiGiaTri = string;
        this.var_short_int = s3;
        this.var_byte_int = by2;
        this.var_byte_goto = by3;
        this.var_byte_else = by4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (String string != null) {
        Vector<bk_0> vector = new Vector<bk_0>();
        int n = ek_0.ek_0_do().var_int_if;
        if (!!(this.dangChayAuto) || !(this.var_boolean_byte)) {
            n += GameCanvas.var_int_byte / var_int_arr_if[8];
        }
        int n2 = var_int_arr_if[0];
        while (!(n2 >= ef_0.var_java_util_Vector_do.size())) {
            bk_0 bk_02 = (bk_0)ef_0.var_java_util_Vector_do.elementAt(n2);
            if ((bk_02.var_byte_if == var_int_arr_if[3]) && gt.boolean_do(((aG)bk_02).cfr_renamed_3 * bn_0.cfr_renamed_6, n) && gt.cfr_renamed_2(((aG)bk_02).cfr_renamed_3 * bn_0.cfr_renamed_6, n + GameCanvas.var_int_byte)) {
                vector.addElement(bk_02);
            }
            ++n2;
        }
        if ((vector.size() > 0)) {
            n2 = gc_0.int_do(vector.size());
            ((DuLieuNguoiChoi)vector.elementAt((int)n2)).var_cf_do = new cf(var_int_arr_if[45], string, var_int_arr_if[0]);
        }
    }

        public final void cfr_renamed_8() {
        super.cfr_renamed_8();
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_3(Graphics var1_1) {
        GameCanvas.cfr_renamed_1(var1_1);
        GameCanvas.var_gj_0_do.cfr_renamed_0(var1_1, this.cfr_renamed_25, this.var_int_goto, this.var_int_int, this.cfr_renamed_26, k.mangSoNguyen[gt.var_int_arr_if[6]], k.mangSoNguyen[gt.var_int_arr_if[8]], gt.var_int_arr_if[1]);
        var1_1.translate(this.cfr_renamed_25, this.var_int_goto);
        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, MenuChinhAvatar.Y, this.var_int_int / gt.var_int_arr_if[6], gt.var_int_arr_if[21] * bn_0.cfr_renamed_6, gt.var_int_arr_if[6]);
        var2_2 = gt.var_int_arr_if[0];
        if (" ".length() >= 0) ** GOTO lbl21
        return;
lbl-1000:
        // 1 sources

        {
            if ((this.cfr_renamed_9 == var2_2)) {
                v0 = gt.var_int_arr_if[1];
                if ("  ".length() < -" ".length()) {
                    return;
                }
            } else {
                v0 = gt.var_int_arr_if[0];
            }
            this.var_ep_int.cfr_renamed_0(v0, gt.var_int_arr_if[12] * bn_0.cfr_renamed_6 + var2_2 % gt.var_int_arr_if[8] * (gt.var_int_arr_if[12] * bn_0.cfr_renamed_6 + this.var_ep_int.cfr_renamed_3), this.cfr_renamed_26 - gt.var_int_arr_if[46] * bn_0.cfr_renamed_6 * gt.var_int_arr_if[8] + var2_2 / gt.var_int_arr_if[8] * gt.var_int_arr_if[46] * bn_0.cfr_renamed_6, gt.var_int_arr_if[0], var1_1);
            GameCanvas.var_ew_int.cfr_renamed_0(var1_1, String.valueOf(this.mangSoNguyen[var2_2]), gt.var_int_arr_if[12] * bn_0.cfr_renamed_6 + var2_2 % gt.var_int_arr_if[8] * (gt.var_int_arr_if[12] * bn_0.cfr_renamed_6 + this.var_ep_int.cfr_renamed_3) + this.var_ep_int.cfr_renamed_3 / gt.var_int_arr_if[6], this.cfr_renamed_26 - gt.var_int_arr_if[46] * bn_0.cfr_renamed_6 * gt.var_int_arr_if[8] + var2_2 / gt.var_int_arr_if[8] * gt.var_int_arr_if[46] * bn_0.cfr_renamed_6 + this.var_ep_int.soLuong / gt.var_int_arr_if[6] - bn_0.cfr_renamed_8 / gt.var_int_arr_if[6], gt.var_int_arr_if[6]);
            ++var2_2;
lbl21:
            // 2 sources

            ** while (!gt.cfr_renamed_3((int)var2_2, (int)gt.var_int_arr_if[3]))
        }
lbl22:
        // 1 sources

    }

        /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        GameCanvas.cfr_renamed_1(var1_1);
        GameCanvas.var_ef_0_do.cfr_renamed_4(var1_1);
        var2_2 = gt.var_int_arr_if[0];
        if ("  ".length() == "  ".length()) ** GOTO lbl31
        return;
lbl-1000:
        // 1 sources

        {
            if (gt.boolean_if(ek_0.ek_0_do().soLuong, gt.var_int_arr_if[10] * (ef_0.var_int_if * bn_0.cfr_renamed_6))) {
                v0 = gt.var_int_arr_if[0];
                if ((var2_2 % gt.var_int_arr_if[6] == 0)) {
                    v1 = gt.var_int_arr_if[6];
                    if (((184 ^ 161) & ~(162 ^ 187)) < -" ".length()) {
                        return;
                    }
                } else {
                    v1 = gt.var_int_arr_if[8];
                }
                ef_0.var_ep_do.cfr_renamed_1(v0, v1, gt.var_int_arr_if[8] * (ef_0.var_int_if * bn_0.cfr_renamed_6), (var2_2 + gt.var_int_arr_if[14]) * ef_0.var_int_if * bn_0.cfr_renamed_6, gt.var_int_arr_if[0], var1_1);
            }
            if (gt.cfr_renamed_3(ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte, (ef_0.var_short_if - gt.var_int_arr_if[8]) * (ef_0.var_int_if * bn_0.cfr_renamed_6))) {
                v2 = gt.var_int_arr_if[0];
                if ((var2_2 % gt.var_int_arr_if[6] == 0)) {
                    v3 = gt.var_int_arr_if[6];
                    if ((181 ^ 177) <= "   ".length()) {
                        return;
                    }
                } else {
                    v3 = gt.var_int_arr_if[8];
                }
                ef_0.var_ep_do.cfr_renamed_1(v2, v3, (ef_0.var_short_if - gt.var_int_arr_if[8]) * (ef_0.var_int_if * bn_0.cfr_renamed_6), (var2_2 + gt.var_int_arr_if[14]) * ef_0.var_int_if * bn_0.cfr_renamed_6, gt.var_int_arr_if[0], var1_1);
            }
            ++var2_2;
lbl31:
            // 2 sources

            ** while (!gt.cfr_renamed_3((int)var2_2, (int)gt.var_int_arr_if[14]))
        }
lbl32:
        // 1 sources

        GameCanvas.var_ef_0_do.cfr_renamed_1(var1_1);
        GameCanvas.cfr_renamed_1(var1_1);
    }

    public final void (String object == null) {
        if (gt.cfr_renamed_2(((String)object).equals("") ? 1 : 0)) {
            return;
        }
        this.var_cf_do = new cf(var_int_arr_if[45], (String)object, var_int_arr_if[0]);
        this.var_cf_do.soLuong = GameCanvas.var_int_int;
        this.var_cf_do.cfr_renamed_1 = GameCanvas.var_int_char - this.var_cf_do.cfr_renamed_3 - dL.cfr_renamed_19 - ce.cfr_renamed_0().var_gx_do.var_int_int;
        String string = object;
        object = eq.eq_do();
        ((ax_0)object).cfr_renamed_0(var_int_arr_if[3]);
        ((ax_0)object).cfr_renamed_0(string);
        ((ax_0)object).cfr_renamed_1();
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 != null) {
        block19: {
            block18: {
                this.cfr_renamed_1(var1_1);
                GameCanvas.cfr_renamed_1(var1_1);
                if (!gt.cfr_renamed_2((int)this.var_boolean_byte)) break block18;
                GameCanvas.var_gj_0_do.cfr_renamed_0(var1_1, this.soLuongKhoa, this.cfr_renamed_21, this.var_int_long, this.cfr_renamed_27, k.mangSoNguyen[gt.var_int_arr_if[6]], k.mangSoNguyen[gt.var_int_arr_if[8]], gt.var_int_arr_if[1]);
                var1_1.translate(this.soLuongKhoa, this.cfr_renamed_21);
                GameCanvas.var_ew_try.cfr_renamed_0(var1_1, MenuChinhAvatar.cW, this.var_int_long / gt.var_int_arr_if[6], gt.var_int_arr_if[14] * bn_0.cfr_renamed_6, gt.var_int_arr_if[6]);
                (var1_1, this.cfr_renamed_14, this.cfr_renamed_23, this.var_int_char, this.var_int_else, this.var_ep_do, gt.var_int_arr_if[2] != null);
                (var1_1, this.var_int_byte, this.var_int_case, this.cfr_renamed_29, this.var_int_try, bL.var_ep_do, gt.var_int_arr_if[50] != null);
                var2_2 = gt.var_int_arr_if[0];
                if ("  ".length() < "   ".length()) ** GOTO lbl43
                return;
lbl-1000:
                // 1 sources

                {
                    if ((this.cfr_renamed_24 == var2_2)) {
                        v0 = gt.var_int_arr_if[1];
                        if ("  ".length() >= (13 + 144 - 107 + 145 ^ 12 + 70 - -48 + 69)) {
                            return;
                        }
                    } else {
                        v0 = gt.var_int_arr_if[0];
                    }
                    this.var_ep_for.cfr_renamed_0(v0, this.var_int_byte + gt.var_int_arr_if[48] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6], this.var_int_case + gt.var_int_arr_if[8] * bn_0.cfr_renamed_6 + this.var_byte_char * var2_2 + gt.var_int_arr_if[32] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6], gt.var_int_arr_if[0], gt.var_int_arr_if[8], var1_1);
                    ci_0.cfr_renamed_0(var1_1, this.var_bU_arr_do[var2_2].var_short_do, this.var_int_byte + gt.var_int_arr_if[48] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6], this.var_int_case + gt.var_int_arr_if[8] * bn_0.cfr_renamed_6 + this.var_byte_char * var2_2 + gt.var_int_arr_if[32] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6], gt.var_int_arr_if[8]);
                    GameCanvas.var_ew_if.cfr_renamed_0(var1_1, "x" + this.var_bU_arr_do[var2_2].cfr_renamed_12, this.var_int_byte + gt.var_int_arr_if[48] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6] + this.var_ep_for.cfr_renamed_3 / gt.var_int_arr_if[6] - gt.var_int_arr_if[12] * bn_0.cfr_renamed_6, this.var_int_case + gt.var_int_arr_if[8] * bn_0.cfr_renamed_6 + this.var_byte_char * var2_2 + gt.var_int_arr_if[32] * bn_0.cfr_renamed_6 / gt.var_int_arr_if[6] + this.var_ep_for.soLuong / gt.var_int_arr_if[6] - bn_0.cfr_renamed_15, gt.var_int_arr_if[6]);
                    if ((this.var_int_if == var2_2)) {
                        v1 = gt.var_int_arr_if[1];
                        if (((84 ^ 89 ^ (44 ^ 0)) & (66 + 23 - 74 + 145 ^ 91 + 127 - 152 + 63 ^ -" ".length())) >= (170 ^ 157 ^ (242 ^ 193))) {
                            return;
                        }
                    } else {
                        v1 = gt.var_int_arr_if[0];
                    }
                    this.var_ep_int.cfr_renamed_0(v1, this.var_int_byte + this.cfr_renamed_29 - gt.var_int_arr_if[1] * bn_0.cfr_renamed_6 - this.var_ep_int.cfr_renamed_3, this.var_int_case + gt.var_int_arr_if[16] * bn_0.cfr_renamed_6 + this.var_byte_char * var2_2, gt.var_int_arr_if[0], var1_1);
                    if ((this.var_bU_arr_do[var2_2].soLuong > 0)) {
                        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, "" + this.var_bU_arr_do[var2_2].soLuong, this.var_int_byte + this.cfr_renamed_29 - gt.var_int_arr_if[1] * bn_0.cfr_renamed_6 - this.var_ep_int.cfr_renamed_3 / gt.var_int_arr_if[6], this.var_int_case + gt.var_int_arr_if[16] * bn_0.cfr_renamed_6 + this.var_byte_char * var2_2 + this.var_ep_int.soLuong / gt.var_int_arr_if[6] - bn_0.var_byte_new / gt.var_int_arr_if[6] - bn_0.cfr_renamed_6 - gt.var_int_arr_if[1], gt.var_int_arr_if[6]);
                        } else {
                        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, MenuChinhAvatar.cW, this.var_int_byte + this.cfr_renamed_29 - gt.var_int_arr_if[1] * bn_0.cfr_renamed_6 - this.var_ep_int.cfr_renamed_3 / gt.var_int_arr_if[6], this.var_int_case + gt.var_int_arr_if[16] * bn_0.cfr_renamed_6 + this.var_byte_char * var2_2 + this.var_ep_int.soLuong / gt.var_int_arr_if[6] - bn_0.var_byte_new / gt.var_int_arr_if[6] - bn_0.cfr_renamed_6 - gt.var_int_arr_if[1], gt.var_int_arr_if[6]);
                    }
                    ++var2_2;
lbl43:
                    // 2 sources

                    ** while (!gt.cfr_renamed_3((int)var2_2, (int)gt.var_int_arr_if[14]))
                }
lbl44:
                // 1 sources

                if (gt.cfr_renamed_2((int)this.coTrangThai) && (this.var_bU_arr_do != null)) {
                    var3_5 = var1_1;
                    var2_3 = this;
                    GameCanvas.var_ew_try.cfr_renamed_0(var3_5, var2_3.chuoiGiaTri, var2_3.cfr_renamed_14 + var2_3.var_int_char / gt.var_int_arr_if[6], var2_3.cfr_renamed_23 + gt.var_int_arr_if[14] * bn_0.cfr_renamed_6, gt.var_int_arr_if[6]);
                    ci_0.cfr_renamed_0(var3_5, var2_3.var_short_if, var2_3.cfr_renamed_14 + var2_3.var_int_char / gt.var_int_arr_if[6], var2_3.cfr_renamed_23 + gt.var_int_arr_if[44] * bn_0.cfr_renamed_6, gt.var_int_arr_if[8]);
                    var4_7 = var2_3.cfr_renamed_23 + gt.var_int_arr_if[51] * bn_0.cfr_renamed_6;
                    GameCanvas.var_ew_try.cfr_renamed_0(var3_5, MenuChinhAvatar.bu, var2_3.cfr_renamed_14 + gt.var_int_arr_if[12] * bn_0.cfr_renamed_6, var4_7, gt.var_int_arr_if[0]);
                    GameCanvas.var_ew_case.cfr_renamed_0(var3_5, var2_3.var_short_int + "%", var2_3.cfr_renamed_14 + var2_3.var_int_char - gt.var_int_arr_if[18] * bn_0.cfr_renamed_6, var4_7 + bn_0.var_byte_new / gt.var_int_arr_if[6] - bn_0.cfr_renamed_15 / gt.var_int_arr_if[6], gt.var_int_arr_if[1]);
                    GameCanvas.var_ew_try.cfr_renamed_0(var3_5, MenuChinhAvatar.aL, var2_3.cfr_renamed_14 + gt.var_int_arr_if[12] * bn_0.cfr_renamed_6, var4_7 += bn_0.var_byte_new, gt.var_int_arr_if[0]);
                    GameCanvas.var_ew_case.cfr_renamed_0(var3_5, "AutoKimCuong" + var2_3.var_byte_int, var2_3.cfr_renamed_14 + var2_3.var_int_char - gt.var_int_arr_if[18] * bn_0.cfr_renamed_6, var4_7 + bn_0.var_byte_new / gt.var_int_arr_if[6] - bn_0.cfr_renamed_15 / gt.var_int_arr_if[6], gt.var_int_arr_if[1]);
                    GameCanvas.var_ew_try.cfr_renamed_0(var3_5, MenuChinhAvatar.dm, var2_3.cfr_renamed_14 + gt.var_int_arr_if[12] * bn_0.cfr_renamed_6, var4_7 += bn_0.var_byte_new, gt.var_int_arr_if[0]);
                    GameCanvas.var_ew_case.cfr_renamed_0(var3_5, MenuChinhAvatar.var_java_lang_String_arr_case[var2_3.var_byte_goto], var2_3.cfr_renamed_14 + var2_3.var_int_char - gt.var_int_arr_if[18] * bn_0.cfr_renamed_6, var4_7 + bn_0.var_byte_new / gt.var_int_arr_if[6] - bn_0.cfr_renamed_15 / gt.var_int_arr_if[6], gt.var_int_arr_if[1]);
                    GameCanvas.var_ew_try.cfr_renamed_0(var3_5, MenuChinhAvatar.var_java_lang_String_super, var2_3.cfr_renamed_14 + gt.var_int_arr_if[12] * bn_0.cfr_renamed_6, var4_7 += bn_0.var_byte_new, gt.var_int_arr_if[0]);
                    GameCanvas.var_ew_case.cfr_renamed_0(var3_5, MenuChinhAvatar.var_java_lang_String_arr_case[var2_3.var_byte_else], var2_3.cfr_renamed_14 + var2_3.var_int_char - gt.var_int_arr_if[18] * bn_0.cfr_renamed_6, var4_7 + bn_0.var_byte_new / gt.var_int_arr_if[6] - bn_0.cfr_renamed_15 / gt.var_int_arr_if[6], gt.var_int_arr_if[1]);
                    var2_3.var_ep_if.cfr_renamed_0(gt.var_int_arr_if[0], var2_3.cfr_renamed_14 + var2_3.var_ep_if.cfr_renamed_3 / gt.var_int_arr_if[6] + gt.var_int_arr_if[18] * bn_0.cfr_renamed_6, var2_3.cfr_renamed_23 + var2_3.var_int_else - bn_0.var_byte_try - var2_3.var_ep_if.soLuong - gt.var_int_arr_if[18] * bn_0.cfr_renamed_6, gt.var_int_arr_if[0], gt.var_int_arr_if[8], var3_5);
                    GameCanvas.var_ew_try.cfr_renamed_0(var3_5, String.valueOf(var2_3.var_short_for), var2_3.cfr_renamed_14 + gt.var_int_arr_if[18] * bn_0.cfr_renamed_6 + var2_3.var_ep_if.cfr_renamed_3 + gt.var_int_arr_if[6] * bn_0.cfr_renamed_6, var2_3.cfr_renamed_23 + var2_3.var_int_else - bn_0.var_byte_try - var2_3.var_ep_if.soLuong - gt.var_int_arr_if[18] * bn_0.cfr_renamed_6 - GameCanvas.var_ew_try.int_do() / gt.var_int_arr_if[6], gt.var_int_arr_if[0]);
                    var2_3.var_ep_if.cfr_renamed_0(gt.var_int_arr_if[1], var2_3.cfr_renamed_14 + var2_3.var_ep_if.cfr_renamed_3 / gt.var_int_arr_if[6] + gt.var_int_arr_if[18] * bn_0.cfr_renamed_6, var2_3.cfr_renamed_23 + var2_3.var_int_else - bn_0.var_byte_try - bn_0.cfr_renamed_6, gt.var_int_arr_if[0], gt.var_int_arr_if[8], var3_5);
                    GameCanvas.var_ew_try.cfr_renamed_0(var3_5, String.valueOf(AngelChip.duLieuNguoiChoi.mangSoNguyen[gt.var_int_arr_if[0]]), var2_3.cfr_renamed_14 + gt.var_int_arr_if[18] * bn_0.cfr_renamed_6 + var2_3.var_ep_if.cfr_renamed_3 + gt.var_int_arr_if[6] * bn_0.cfr_renamed_6, var2_3.cfr_renamed_23 + var2_3.var_int_else - bn_0.var_byte_try - bn_0.cfr_renamed_6 - bn_0.var_byte_new / gt.var_int_arr_if[6], gt.var_int_arr_if[0]);
                }
                if (gt.cfr_renamed_2((int)this.var_boolean_int)) {
                    this.cfr_renamed_3(var1_1);
                    if (((109 ^ 103 ^ (112 ^ 79)) & (67 ^ 19 ^ (97 ^ 4) ^ -" ".length()) & ((0 + 99 - -35 + 8 ^ 50 + 92 - 114 + 160) & (22 ^ 44 ^ (207 ^ 199) ^ -" ".length()) ^ -" ".length())) != 0) {
                        return;
                    }
                }
                break block19;
            }
            if (gt.cfr_renamed_2((int)this.dangChayAuto) && (this.var_byte_for > 0)) {
                var2_4 = ci_0.cfr_renamed_1(gt.var_int_arr_if[52]);
                if ((var2_4.soLuong != gt.var_int_arr_if[2])) {
                    var3_6 = var2_4.var_short_do / gt.var_int_arr_if[10];
                    var1_1.drawRegion(var2_4.var_javax_microedition_lcdui_Image_do, gt.var_int_arr_if[0], (gt.var_int_arr_if[8] - this.var_byte_for / gt.var_int_arr_if[20]) * var3_6, (int)var2_4.cfr_renamed_1, var3_6, gt.var_int_arr_if[0], GameCanvas.var_int_byte / gt.var_int_arr_if[6], GameCanvas.var_int_char / gt.var_int_arr_if[6], gt.var_int_arr_if[8]);
                }
            }
        }
        GameCanvas.cfr_renamed_1(var1_1);
        if ((this.var_cf_do != null) && (this.var_cf_do.var_java_lang_String_arr_do != null)) {
            this.var_cf_do.cfr_renamed_0(var1_1);
        }
        if (!(GameCanvas.var_et_0_do != null) || gt.cfr_renamed_4((int)et_0.coTrangThai)) {
            super.cfr_renamed_0(var1_1);
        }
        if ((!gt.cfr_renamed_4((int)this.dangChayAuto) || gt.cfr_renamed_4((int)this.var_boolean_byte)) && (GameCanvas.var_bt_0_do == null) && gt.cfr_renamed_2((int)this.var_boolean_try)) {
            GameCanvas.var_ew_byte.cfr_renamed_0(var1_1, String.valueOf(this.var_short_do), GameCanvas.var_int_int, gt.var_int_arr_if[12], gt.var_int_arr_if[6]);
        }
    }

        public gt() {
        this.var_byte_do = (byte)var_int_arr_if[1];
        this.var_boolean_int = var_int_arr_if[0];
        this.this = (byte)var_int_arr_if[0];
        this.var_short_do = (short)var_int_arr_if[0];
        this.var_java_util_Vector_do = new Vector();
        this.cfr_renamed_24 = var_int_arr_if[2];
        this.var_int_if = var_int_arr_if[0];
        this.cfr_renamed_9 = var_int_arr_if[0];
        this.coKichHoat = var_int_arr_if[0];
        int[] nArray = new int[var_int_arr_if[3]];
        nArray[gt.var_int_arr_if[0]] = var_int_arr_if[4];
        nArray[gt.var_int_arr_if[1]] = var_int_arr_if[5];
        nArray[gt.var_int_arr_if[6]] = var_int_arr_if[7];
        nArray[gt.var_int_arr_if[8]] = var_int_arr_if[9];
        nArray[gt.var_int_arr_if[10]] = var_int_arr_if[11];
        nArray[gt.var_int_arr_if[12]] = var_int_arr_if[13];
        nArray[gt.var_int_arr_if[14]] = var_int_arr_if[15];
        nArray[gt.var_int_arr_if[16]] = var_int_arr_if[17];
        nArray[gt.var_int_arr_if[18]] = var_int_arr_if[19];
        this.mangSoNguyen = nArray;
        this.coTrangThai = var_int_arr_if[0];
        byte[][] byArrayArray = new byte[var_int_arr_if[8]][];
        var_byte_arr_arr_do = byArrayArray;
        byte[] byArray = new byte[var_int_arr_if[20]];
        byArray[gt.var_int_arr_if[8]] = var_int_arr_if[1];
        byArray[gt.var_int_arr_if[10]] = var_int_arr_if[1];
        byArray[gt.var_int_arr_if[12]] = var_int_arr_if[1];
        byArray[gt.var_int_arr_if[3]] = var_int_arr_if[1];
        byArray[gt.var_int_arr_if[21]] = var_int_arr_if[1];
        byArray[gt.var_int_arr_if[22]] = var_int_arr_if[1];
        byArrayArray[gt.var_int_arr_if[0]] = byArray;
        byte[] byArray2 = new byte[var_int_arr_if[20]];
        byArray2[gt.var_int_arr_if[0]] = var_int_arr_if[6];
        byArray2[gt.var_int_arr_if[1]] = var_int_arr_if[6];
        byArray2[gt.var_int_arr_if[6]] = var_int_arr_if[6];
        byArray2[gt.var_int_arr_if[8]] = var_int_arr_if[8];
        byArray2[gt.var_int_arr_if[10]] = var_int_arr_if[8];
        byArray2[gt.var_int_arr_if[12]] = var_int_arr_if[8];
        byArray2[gt.var_int_arr_if[14]] = var_int_arr_if[6];
        byArray2[gt.var_int_arr_if[16]] = var_int_arr_if[6];
        byArray2[gt.var_int_arr_if[18]] = var_int_arr_if[6];
        byArray2[gt.var_int_arr_if[3]] = var_int_arr_if[8];
        byArray2[gt.var_int_arr_if[21]] = var_int_arr_if[8];
        byArray2[gt.var_int_arr_if[22]] = var_int_arr_if[8];
        gt.var_byte_arr_arr_do[gt.var_int_arr_if[1]] = byArray2;
        byte[] byArray3 = new byte[var_int_arr_if[20]];
        byArray3[gt.var_int_arr_if[0]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[1]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[6]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[8]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[10]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[12]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[14]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[16]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[18]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[3]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[21]] = var_int_arr_if[10];
        byArray3[gt.var_int_arr_if[22]] = var_int_arr_if[10];
        gt.var_byte_arr_arr_do[gt.var_int_arr_if[6]] = byArray3;
        this.var_ei_for = new ei(MenuChinhAvatar.cfr_renamed_46, var_int_arr_if[8], this);
        this.var_ei_byte = new ei(MenuChinhAvatar.cW, var_int_arr_if[1], this);
        this.var_ei_if = new ei(MenuChinhAvatar.Z, var_int_arr_if[16], this);
        this.var_ei_char = new ei(MenuChinhAvatar.c, var_int_arr_if[14], this);
        this.var_ei_case = new ei(MenuChinhAvatar.cfr_renamed_7, var_int_arr_if[18], this);
        this.var_ei_do = new ei(MenuChinhAvatar.aY, var_int_arr_if[6], this);
        this.var_int_long = var_int_arr_if[23] * bn_0.cfr_renamed_6;
        this.cfr_renamed_27 = var_int_arr_if[24] * bn_0.cfr_renamed_6;
        this.cfr_renamed_14 = var_int_arr_if[18] * bn_0.cfr_renamed_6;
        this.cfr_renamed_23 = this.var_int_case = var_int_arr_if[25] * bn_0.cfr_renamed_6;
        this.var_int_char = var_int_arr_if[26] * bn_0.cfr_renamed_6;
        this.var_int_else = this.var_int_try = var_int_arr_if[27] * bn_0.cfr_renamed_6;
        this.cfr_renamed_29 = var_int_arr_if[28] * bn_0.cfr_renamed_6;
        this.var_int_byte = this.var_int_long - this.cfr_renamed_29 - var_int_arr_if[18] * bn_0.cfr_renamed_6;
        this.var_int_int = var_int_arr_if[29] * bn_0.cfr_renamed_6 + var_int_arr_if[21] * bn_0.cfr_renamed_6 + var_int_arr_if[21] * bn_0.cfr_renamed_6;
        this.cfr_renamed_26 = var_int_arr_if[30] * bn_0.cfr_renamed_6;
        this.cfr_renamed_25 = (GameCanvas.var_int_byte - this.var_int_int) / var_int_arr_if[6];
        this.var_int_goto = (GameCanvas.var_int_char - this.cfr_renamed_26) / var_int_arr_if[6];
    }

    /*
     * Unable to fully structure code
     */
    public final void (bU[] var1_1, short var2_3, boolean var3_4, boolean var4_5 != null) {
        block19: {
            block20: {
                block18: {
                    block15: {
                        block17: {
                            block16: {
                                block14: {
                                    this.var_boolean_try = gt.var_int_arr_if[0];
                                    this.var_byte_do = (byte)gt.var_int_arr_if[1];
                                    this.cfr_renamed_5 = gt.var_int_arr_if[2];
                                    GameCanvas.var_bt_0_do = null;
                                    GameCanvas.var_dX_do = null;
                                    this.var_boolean_int = gt.var_int_arr_if[0];
                                    if (!(gt.var_javax_microedition_lcdui_Image_do == null)) break block14;
                                    try {
                                        this.var_ep_do = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/race/popup/tile1.png")), gt.var_int_arr_if[31] * bn_0.cfr_renamed_6, gt.var_int_arr_if[31] * bn_0.cfr_renamed_6);
                                        this.var_ep_for = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/race/popup/bt1.png")), gt.var_int_arr_if[32] * bn_0.cfr_renamed_6, gt.var_int_arr_if[32] * bn_0.cfr_renamed_6);
                                        this.var_ep_int = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/race/popup/bt0.png")), gt.var_int_arr_if[33] * bn_0.cfr_renamed_6, gt.var_int_arr_if[34] * bn_0.cfr_renamed_6);
                                        this.var_ep_if = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/race/popup/time.png")), gt.var_int_arr_if[35] * bn_0.cfr_renamed_6, gt.var_int_arr_if[35] * bn_0.cfr_renamed_6);
                                        gt.var_javax_microedition_lcdui_Image_do = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/race/28.png"));
                                        gt.var_javax_microedition_lcdui_Image_if = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/race/29.png"));
                                        gt.var_javax_microedition_lcdui_Image_arr_if = new Image[gt.var_int_arr_if[12]];
                                        var5_6 = gt.var_int_arr_if[0];
                                        if (" ".length() == " ".length()) ** GOTO lbl23
                                        return;
lbl-1000:
                                        // 1 sources

                                        {
                                            gt.var_javax_microedition_lcdui_Image_arr_if[var5_6] = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/race/bui/d0" + var5_6 + ".png"));
                                            ++var5_6;
lbl23:
                                            // 2 sources

                                            ** while (!gt.cfr_renamed_3((int)var5_6, (int)gt.var_int_arr_if[12]))
                                        }
lbl24:
                                        // 1 sources

                                        gt.var_javax_microedition_lcdui_Image_arr_do = new Image[gt.var_int_arr_if[8]];
                                        var5_6 = gt.var_int_arr_if[0];
                                        if ("   ".length() < (0 ^ 7 ^ "   ".length())) ** GOTO lbl32
                                        return;
lbl-1000:
                                        // 1 sources

                                        {
                                            gt.var_javax_microedition_lcdui_Image_arr_do[var5_6] = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/race/bui/w" + var5_6 + ".png"));
                                            ++var5_6;
lbl32:
                                            // 2 sources

                                            ** while (!gt.cfr_renamed_3((int)var5_6, (int)gt.var_int_arr_if[8]))
                                        }
lbl33:
                                        // 1 sources

                                        }
                                    catch (Exception v0) {
                                        v0.printStackTrace();
                                    }
                                    if (((61 + 10 - -6 + 50 ^ (229 ^ 146)) & (144 ^ 184 ^ (129 ^ 161) ^ -" ".length())) != 0) {
                                        return;
                                    }
                                }
                                if (!gt.cfr_renamed_4((int)var3_4)) break block15;
                                if (!gt.cfr_renamed_2((int)var4_5)) break block16;
                                var5_6 = gt.var_int_arr_if[0];
                                if (((133 ^ 191) & ~(125 ^ 71)) < " ".length()) ** GOTO lbl52
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    var6_10 = (aG)ef_0.var_java_util_Vector_do.elementAt(var5_6);
                                    if ((var6_10.var_byte_if == gt.var_int_arr_if[21])) {
                                        ef_0.cfr_renamed_0(var6_10);
                                    }
                                    ++var5_6;
lbl52:
                                    // 2 sources

                                    ** while (!gt.cfr_renamed_3((int)var5_6, (int)ef_0.var_java_util_Vector_do.size()))
                                }
                            }
                            if ((gt.var_gt_do != GameCanvas.var_dL_do)) {
                                ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_do);
                                gt.cfr_renamed_0().cfr_renamed_8();
                                ef_0.var_int_try = gt.var_int_arr_if[2];
                                this.void_for(gt.var_int_arr_if[1]);
                                this.void_for(gt.var_int_arr_if[6]);
                                GameCanvas.var_ef_0_do.void_do(gt.var_int_arr_if[36]);
                                ef_0.cfr_renamed_3(AngelChip.duLieuNguoiChoi);
                                var5_7 = gt.cfr_renamed_0();
                                ek_0.ek_0_do().void_if(ef_0.soLuong);
                                var5_7.soLuongKhoa = (GameCanvas.var_int_byte - var5_7.var_int_long) / gt.var_int_arr_if[6];
                                var5_7.cfr_renamed_21 = (GameCanvas.var_int_char - var5_7.cfr_renamed_27) / gt.var_int_arr_if[6];
                                var5_7.var_byte_char = (byte)(gt.var_int_arr_if[37] * bn_0.cfr_renamed_6);
                                if (gt.boolean_if(GameCanvas.gameCanvas.getHeight(), gt.var_int_arr_if[24])) {
                                    var5_7.var_byte_char = (byte)gt.var_int_arr_if[38];
                                    var5_7.cfr_renamed_27 = gt.var_int_arr_if[39];
                                    var5_7.var_int_else = var5_7.var_int_try = gt.var_int_arr_if[40];
                                }
                                ek_0.dangChayAuto = gt.var_int_arr_if[0];
                            }
                            this.var_bU_arr_do = null;
                            this.var_bU_arr_do = var1_1;
                            if (!(var1_1 != null)) break block17;
                            var5_8 = gt.var_int_arr_if[0];
                            if ("   ".length() > 0) ** GOTO lbl87
                            return;
lbl-1000:
                            // 1 sources

                            {
                                this.var_bU_arr_do[var5_8].cfr_renamed_3 = gt.var_int_arr_if[31];
                                this.var_bU_arr_do[var5_8].var_int_if = gt.var_int_arr_if[41] + var5_8 * gt.var_int_arr_if[20];
                                ef_0.var_java_util_Vector_do.addElement(this.var_bU_arr_do[var5_8]);
                                ++var5_8;
lbl87:
                                // 2 sources

                                ** while (!gt.cfr_renamed_3((int)var5_8, (int)gt.var_int_arr_if[14]))
                            }
lbl88:
                            // 1 sources

                            ek_0.ek_0_do().var_bk_0_do = this.var_bU_arr_do[gt.var_int_arr_if[6]];
                            this.var_byte_if = (byte)gt.var_int_arr_if[8];
                        }
                        AngelChip.duLieuNguoiChoi.cfr_renamed_3 = AngelChip.duLieuNguoiChoi.cfr_renamed_11 = gt.var_int_arr_if[0];
                    }
                    AngelChip.duLieuNguoiChoi.var_int_if = AngelChip.duLieuNguoiChoi.var_int_new = gt.var_int_arr_if[42] * bn_0.cfr_renamed_6;
                    this.dangChayAuto = var3_4;
                    this.var_boolean_byte = var4_5;
                    this.var_short_for = var2_3;
                    this.var_long_if = System.currentTimeMillis();
                    if (!gt.cfr_renamed_2((int)var3_4)) break block18;
                    this.var_byte_for = (byte)gt.var_int_arr_if[43];
                    this.var_ei_new = null;
                    this.var_ei_try = this.var_ei_for;
                    this.cfr_renamed_4 = this.var_ei_if;
                    if (((4 + 94 - -49 + 99 ^ 7 + 132 - -4 + 35) & (81 ^ 16 ^ (46 ^ 43) ^ -" ".length())) != 0) {
                        return;
                    }
                    break block19;
                }
                this.cfr_renamed_4 = this.var_ei_if;
                this.var_ei_try = null;
                this.var_ei_new = null;
                if (!gt.cfr_renamed_4((int)var4_5)) break block20;
                this.var_ei_try = this.var_ei_for;
                var5_9 = gt.var_int_arr_if[0];
                if (-"  ".length() <= 0) ** GOTO lbl131
                return;
lbl-1000:
                // 1 sources

                {
                    var6_11 = gt.var_int_arr_if[0];
                    var1_2 = gt.var_int_arr_if[0];
                    if ("  ".length() != 0) ** GOTO lbl129
                    return;
lbl-1000:
                    // 1 sources

                    {
                        this.var_bU_arr_do[var5_9].cfr_renamed_3 += this.var_bU_arr_do[var5_9].var_short_arr_if[var1_2] * this.var_bU_arr_do[var5_9].var_short_arr_do[var1_2];
                        this.var_bU_arr_do[var5_9].var_byte_do = (byte)(this.var_bU_arr_do[var5_9].var_byte_do + gt.var_int_arr_if[1]);
                        if (!(var6_11 += this.var_bU_arr_do[var5_9].var_short_arr_do[var1_2] <  (var2_3 - gt.var_int_arr_if[10]) * gt.var_int_arr_if[31])) break;
                        ++var1_2;
lbl129:
                        // 2 sources

                        ** while (!gt.cfr_renamed_3((int)var1_2, (int)this.var_bU_arr_do[var5_9].var_short_arr_do.length))
                    }
lbl130:
                    // 2 sources

                    ++var5_9;
lbl131:
                    // 2 sources

                    ** while (!gt.cfr_renamed_3((int)var5_9, (int)gt.var_int_arr_if[14]))
                }
lbl132:
                // 1 sources

                if (((90 ^ 19 ^ (102 ^ 24)) & (85 + 136 - 128 + 45 ^ 151 + 78 - 104 + 64 ^ -" ".length())) != 0) {
                    return;
                }
                break block19;
            }
            eq.eq_do().cfr_renamed_15(this.var_bU_arr_do[gt.var_int_arr_if[0]].cfr_renamed_12);
            this.var_ei_new = this.var_ei_byte;
        }
        this.var_cf_do = new cf();
    }

        }

