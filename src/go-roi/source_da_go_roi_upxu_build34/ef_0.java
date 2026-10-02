/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

/*
 * Renamed from eF
 */
public final class ef_0 {
    public static int soLuong;
    public static byte var_byte_do;
    public static int var_int_if;
    public static Vector var_java_util_Vector_do;
    private static int this;
    private static int cfr_renamed_16;
    private boolean dangChayAuto;
    public static Vector var_java_util_Vector_if;
    public static int soLuongKhoa;
    private static int cfr_renamed_6;
    public static int var_int_int;
    public static int var_int_new;
    public static short var_short_do;
    public static ei var_ei_do;
    private static int[] mangSoNguyen;
    private int cfr_renamed_17;
    private aG var_aG_if;
    private static eg var_eg_do;
    public static Image var_javax_microedition_lcdui_Image_do;
    public static short[] var_short_arr_do;
    private int cfr_renamed_13;
    public static eq_0 var_eq_0_do;
    private eq_0[] var_eq_0_arr_do;
    private static int[] var_int_arr_if;
    private aG var_aG_for;
    public static ep var_ep_do;
    private aG var_aG_int;
    public static int var_int_try;
    private static int cfr_renamed_30;
    public static Vector var_java_util_Vector_for;
    public static Vector var_java_util_Vector_int;
    public static Vector var_java_util_Vector_new;
    private int cfr_renamed_22;
    private static int cfr_renamed_19;
    public static int var_int_byte;
    public static short[] var_short_arr_if;
    public static int var_int_case;
    private static int cfr_renamed_20;
    public static int var_int_char;
    private static ep var_ep_if;
    public static aG var_aG_do;
    public static byte[] var_byte_arr_do;
    public static byte var_byte_if;
    private static int[] var_int_arr_for;
    public static Vector var_java_util_Vector_try;
    public static Vector var_java_util_Vector_byte;
    public static int var_int_else;
    public static Vector var_java_util_Vector_case;
    public static Image var_javax_microedition_lcdui_Image_if;
    public static Vector var_java_util_Vector_char;
    public static int cfr_renamed_18;
    private static byte var_byte_for;
    private static Vector var_java_util_Vector_else;
    public static int cfr_renamed_10;
    public static short var_short_if;

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[168];
        -1 = -" ".length();
        26 = 0x24 ^ 0x3E;
        0 = (0xF2 ^ 0xBF) & ~(6 ^ 0x4B);
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
        4 = 0xA0 ^ 0x84 ^ (0x2A ^ 0xA);
        5 = 0x3B ^ 0x3E;
        6 = 3 + 10 - -67 + 59 ^ 89 + 72 - 79 + 59;
        7 = 0x37 ^ 0x3D ^ (0xA1 ^ 0xAC);
        8 = 84 + 157 - 171 + 115 ^ 91 + 68 - 59 + 77;
        11 = 0xA1 ^ 0xAA;
        12 = 53 + 87 - 18 + 23 ^ 156 + 53 - 89 + 37;
        13 = 0xAC ^ 0xA1;
        14 = 42 + 146 - 116 + 112 ^ 55 + 103 - 109 + 133;
        15 = 0x8E ^ 0x94 ^ (0x2C ^ 0x39);
        16 = 0x61 ^ 7 ^ (0xB1 ^ 0xC7);
        17 = 0x6E ^ 0x10 ^ (0x11 ^ 0x7E);
        18 = 0xDE ^ 0x81 ^ (0x45 ^ 8);
        19 = 0xA8 ^ 0xBB;
        20 = 0xB9 ^ 0xAD;
        24 = 0x94 ^ 0x9D ^ (0x1C ^ 0xD);
        25 = 0x5D ^ 0x44;
        15853390 = -(0xFFFFFB15 & 0x1CFB) & (0xFFFFFFFF & 0xF1FF5E);
        15006199 = -" ".length() & (0xFFFFF9FF & 0xE4FFF7);
        8183509 = -(0xFFFFEDF3 & 0x332F) & (0xFFFFFFF7 & 0x7CFFFF);
        12254198 = 0xFFFFFBFE & 0xBAFFF7;
        6143735 = -(0xFFFFB5DB & 0x4B2D) & (0xFFFFBFFF & 0x5DFFFF);
        21 = 0x83 ^ 0x96;
        32 = 0xDA ^ 0xB7 ^ (0xE0 ^ 0xAD);
        10 = 0xD ^ 0x38 ^ (0x54 ^ 0x6B);
        100 = 0x74 ^ 0x10;
        30 = 0x6D ^ 0x73;
        50 = 0 ^ 0x32;
        -110 = -(0x56 ^ 0x38);
        360 = -(0xFFFFFCCE & 0x4FB3) & (0xFFFFDDF9 & 0x6FEF);
        -125 = -(0x3D ^ 0x40);
        108 = 0xC4 ^ 0xA8;
        109 = 0x3D ^ 0x71 ^ (4 ^ 0x25);
        57 = 0x63 ^ 0x26 ^ (0x11 ^ 0x6D);
        62 = 0x2F ^ 0x11;
        52 = 0xB ^ 0x3F;
        53 = 64 + 99 - 34 + 21 ^ 43 + 84 - 105 + 141;
        9 = 19 + 43 - -36 + 41 ^ 97 + 27 - 78 + 84;
        58 = 104 + 89 - 149 + 136 ^ 122 + 24 - 95 + 91;
        63 = 0x6C ^ 0x56 ^ (0xBB ^ 0xBE);
        59 = 5 ^ 0x12 ^ (0x56 ^ 0x7A);
        64 = 0x6E ^ 0x5D ^ (0xB4 ^ 0xC7);
        56 = 0xF9 ^ 0xC1;
        68 = 0x6D ^ 0x5A ^ (1 ^ 0x72);
        69 = 0xCB ^ 0x8E;
        70 = 151 + 157 - 203 + 118 ^ 72 + 21 - 5 + 65;
        51 = 0x65 ^ 0x56;
        71 = 0xEC ^ 0xAB;
        95 = 0xD4 ^ 0x8B;
        96 = 0x27 ^ 0xF ^ (0x21 ^ 0x69);
        107 = 182 + 17 - 35 + 53 ^ 64 + 61 - 116 + 169;
        55 = 0x87 ^ 0x8D ^ (0x2D ^ 0x10);
        93 = 144 + 83 - 36 + 31 ^ 91 + 63 - 118 + 95;
        78 = 0x54 ^ 0x1A;
        89 = 0x65 ^ 0x3C;
        27 = 0x36 ^ 0x1D ^ (0xF6 ^ 0xC6);
        28 = 58 + 87 - 56 + 88 ^ 82 + 113 - 56 + 34;
        29 = 0x1B ^ 6;
        84 = 0xEF ^ 0xA3 ^ (0xB4 ^ 0xAC);
        85 = 0x68 ^ 0x3D;
        86 = 0x1C ^ 0x4A;
        83 = 0xA2 ^ 0x99 ^ (0xF1 ^ 0x99);
        87 = 156 + 216 - 359 + 209 ^ 125 + 41 - 98 + 69;
        54 = 0xE3 ^ 0xA3 ^ (0xDE ^ 0xA8);
        67 = 0xE7 ^ 0xA4;
        81 = 0xD3 ^ 0x82;
        79 = 0x6C ^ 0x1A ^ (0x82 ^ 0xBB);
        92 = 0x1A ^ 0x46;
        94 = 8 + 28 - -62 + 54 ^ 2 + 186 - 186 + 196;
        97 = 203 + 214 - 401 + 236 ^ 88 + 120 - 201 + 150;
        98 = 0xFD ^ 0xA0 ^ (0x2B ^ 0x14);
        103 = 0x4A ^ 0x2D;
        101 = 0xB2 ^ 0xA6 ^ (0xF0 ^ 0x81);
        104 = 0x1F ^ 0x6D ^ (0x45 ^ 0x5F);
        23 = 0x6F ^ 0x7C ^ (0x39 ^ 0x3D);
        -2 = -"  ".length();
        -23 = -(0x84 ^ 0x81 ^ (0x8F ^ 0x9D));
        -105 = -(0xB6 ^ 0x94 ^ (0xB ^ 0x40));
        88 = 0x38 ^ 0x62 ^ "  ".length();
        210 = 80 + 157 - 135 + 95 + (0x49 ^ 0x56) - (151 + 138 - 213 + 105) + (39 + 139 - 147 + 132);
        41 = 0xD9 ^ 0xB3 ^ (0x62 ^ 0x21);
        33 = 0x86 ^ 0xA7;
        38 = 0x1E ^ 0x38;
        36 = 0x28 ^ 0xC;
        255 = 119 + 215 - 168 + 70 + (55 + 79 - 68 + 62) - (208 + 189 - 338 + 176) + (0x7D ^ 3);
        80 = 0x15 ^ 0x45;
        65 = 0x3A ^ 0 ^ (0x3C ^ 0x47);
        -100 = -(0xC6 ^ 0x8B ^ (0xB6 ^ 0x9F));
        2480 = -(0xFFFFFEAF & 0x575F) & (0xFFFFFFBF & 0x5FFE);
        61 = 0x6F ^ 0x52;
        1084 = -(0xFFFFBFDB & 0x73A7) & (0xFFFFB7BF & 0x7FFE);
        60 = 0x61 ^ 0x5D;
        1085 = -(0xFFFFFDB1 & 0x6B4F) & (0xFFFFEFBF & 0x7D7D);
        -4 = -(0x7D ^ 0x79);
        -5 = -(87 + 135 - 104 + 32 ^ 140 + 82 - 121 + 46);
        -3 = -"   ".length();
        -6 = -(0xB7 ^ 0xA1 ^ (0xB0 ^ 0xA0));
        120 = 0x15 ^ 0x6D;
        123 = 0x6E ^ 0x34 ^ (0x43 ^ 0x62);
        114 = 7 ^ 0x75;
        119 = 9 ^ 0x7E;
        44 = 0xB8 ^ 0xC0 ^ (0xD8 ^ 0x8C);
        111 = 0x54 ^ 0x19 ^ (0x8A ^ 0xA8);
        112 = 0x15 ^ 0x65;
        845 = 0xFFFFFB4F & 0x7FD;
        844 = 0xFFFFA3CD & 0x5F7E;
        830 = -(0xFFFF9EFB & 0x69C6) & (0xFFFFABFF & 0x5FFF);
        828 = -(0xFFFFDCEE & 0x77D3) & (0xFFFFDFFF & 0x77FD);
        836 = 0xFFFF9FCE & 0x6375;
        829 = -(0xFFFFFC71 & 0x6FCF) & (0xFFFFFFFD & 0x6F7F);
        129 = 67 + 3 - -59 + 0;
        130 = 128 + 126 - 186 + 62;
        840 = 0xFFFFF7DA & 0xB6D;
        831 = 0xFFFFFF3F & 0x3FF;
        841 = -(0xFFFFFF5D & 0x24B7) & (0xFFFFAFDD & 0x777F);
        47 = 0x83 ^ 0x96 ^ (0xFB ^ 0xC1);
        832 = -(0xFFFF9DBA & 0x7E7D) & (0xFFFFDF7F & 0x3FF7);
        147 = (0xD6 ^ 0xA0) + (0x78 ^ 0x4C) - (0x36 ^ 0x2C) + "   ".length();
        833 = -(0xFFFFA7FB & 0x7CAF) & (0xFFFFA7FB & 0x7FEF);
        48 = 0x65 ^ 0x55;
        148 = (0x3F ^ 0x7A) + (0x5F ^ 0x42) - (0x3D ^ 0x20) + (4 ^ 0x4B);
        834 = -(0xFFFFFDBF & 0x7A6E) & (0xFFFFFBFF & 0x7F6F);
        842 = 0xFFFFEF5F & 0x13EA;
        843 = -(0xFFFFA877 & 0x7F9D) & (0xFFFFBBDF & 0x6F7F);
        835 = 0xFFFFA357 & 0x5FEB;
        848 = 0xFFFFFF76 & 0x3D9;
        43 = 0x1D ^ 0x1B ^ (0x8A ^ 0xA7);
        37 = 0xBB ^ 0x9E;
        837 = 0xFFFFA3CD & 0x5F77;
        838 = 0xFFFFDF57 & 0x23EE;
        77 = 0x5E ^ 0x49 ^ (0xC1 ^ 0x9B);
        46 = 0xA3 ^ 0x8D;
        39 = 0xB6 ^ 0x9C ^ (0x6B ^ 0x66);
        975 = 0xFFFFBBEF & 0x47DF;
        974 = -(0xFFFFFC57 & 0x7FAA) & (0xFFFFFFFF & 0x7FCF);
        -10 = -(0x1E ^ 0x14);
        1029 = 0xFFFFD6B7 & 0x2D4D;
        99 = 0x98 ^ 0xAE ^ (0x14 ^ 0x41);
        1034 = -(0xFFFFFA6D & 0x47B7) & (0xFFFFC6AF & 0x7F7E);
        1032 = 0xFFFF9E3D & 0x65CA;
        106 = 0x1B ^ 0x71;
        1030 = 0xFFFF95D7 & 0x6E2E;
        102 = 0x4D ^ 0x2B;
        1037 = 0xFFFFCD9F & 0x366D;
        1035 = -(0xFFFFD3D5 & 0x3D3F) & (0xFFFF9F3F & 0x75DF);
        1033 = -(0xFFFFBDDD & 0x7AE7) & (0xFFFFBECF & 0x7DFD);
        105 = 0xF ^ 0x66;
        1036 = 0xFFFFC41F & 0x3FEC;
        1031 = -(0xFFFFB7ED & 0x5BBB) & (0xFFFFD7AF & 0x3FFF);
        1075 = -(0xFFFFE7DF & 0x796D) & (0xFFFFEF7F & 0x75FF);
        1094 = -(0xFFFFBBD3 & 0x6FBE) & (0xFFFFBFF7 & 0x6FDF);
        110 = 0x8F ^ 0xA9 ^ (0x30 ^ 0x78);
        846 = -(0xFFFFD57B & 0x7A96) & (0xFFFFF7DF & 0x5B7F);
        -20 = -(0x55 ^ 0x41);
        66 = 114 + 4 - -53 + 23 ^ 113 + 58 - 151 + 108;
        847 = 0xFFFFA35F & 0x5FEF;
        150 = (0x66 ^ 0x3F) + (0x65 ^ 0x27) - (0x64 ^ 0x3B) + (4 ^ 0x5E);
        139 = (0x52 ^ 0x1C) + (0x32 ^ 0x75) - (0xB ^ 0x48) + (0x9B ^ 0xA2);
        152 = 91 + 55 - 17 + 23;
        151 = (0xC ^ 0x46) + (19 + 103 - 85 + 91) - (120 + 116 - 129 + 40) + (0xA ^ 0x6A);
        184 = 10 + 20 - -53 + 50 + (0x74 ^ 0x5D) - (20 + 16 - 5 + 142) + (1 + 141 - 95 + 136);
        185 = 176 + 119 - 244 + 134;
    }

    private static int int_do(int n) {
        return n % var_short_if * var_int_if;
    }

    /*
     * Unable to fully structure code
     */
    private static eq_0 eq_0_do(int var0) {
        block8: {
            block7: {
                if (!(var0 + 1 < ef_0.var_short_arr_if.length) || !(ef_0.var_short_arr_if[var0] == ef_0.var_short_arr_if[var0 + 1])) break block7;
                var1_1 = var0;
                if ("   ".length() > 0) ** GOTO lbl13
                return null;
lbl-1000:
                // 1 sources

                {
                    if ((ef_0.var_short_arr_if[var1_1] != ef_0.var_short_arr_if[var1_1 + 1])) {
                        var2_3 = ef_0.var_int_if;
                        if ((var0 / ef_0.var_short_if == ef_0.var_short_do - 1)) {
                            var2_3 = -ef_0.var_int_if;
                        }
                        return new eq_0(ef_0.int_do(var0) + (var1_1 - var0 + 1) * ef_0.var_int_if / 2, ef_0.int_if(var0) + ef_0.var_int_if / 2 + var2_3);
                    }
                    ++var1_1;
lbl13:
                    // 2 sources

                    ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_short_arr_if.length))
                }
lbl14:
                // 1 sources

                if ((74 ^ 100 ^ (184 ^ 147)) <= 0) {
                    return null;
                }
                break block8;
            }
            if (!(var0 + ef_0.var_short_if < ef_0.var_short_arr_if.length) || !(ef_0.var_short_arr_if[var0] == ef_0.var_short_arr_if[var0 + ef_0.var_short_if])) break block8;
            var1_2 = var0;
            if (null == null) ** GOTO lbl32
            return null;
lbl-1000:
            // 1 sources

            {
                if ((ef_0.var_short_arr_if[var1_2] != ef_0.var_short_arr_if[var1_2 + ef_0.var_short_if])) {
                    var2_4 = -ef_0.var_int_if;
                    if ((var0 % ef_0.var_short_if == 0)) {
                        var2_4 = ef_0.var_int_if;
                    }
                    return new eq_0(ef_0.int_do(var0) + ef_0.var_int_if / 2 + var2_4, ef_0.int_if(var0) + ((var1_2 - var0) / ef_0.var_short_if + 1) * ef_0.var_int_if / 2);
                }
                var1_2 += ef_0.var_short_if;
lbl32:
                // 2 sources

                ** while (!ef_0.cfr_renamed_3((int)var1_2, (int)ef_0.var_short_arr_if.length))
            }
        }
        return null;
    }

            private static void (int n != byte by2) {
        ef_0.var_short_arr_if[n] = by2;
        if ((n / var_short_if == 0)) {
            ef_0.var_short_arr_do[n] = 43;
            return;
        }
        ef_0.var_short_arr_do[n] = 6;
    }

    public static void (aG aG2 != null) {
        if ((var_aG_do == aG2)) {
            var_aG_do = null;
        }
        var_java_util_Vector_do.removeElement(aG2);
        }

    public static int int_do(int n, int n2) {
        if (!(n >= 0) || !(n <= var_short_if * var_int_if) || (n2 / var_int_if * var_short_if + n / var_int_if >= var_short_arr_if.length)) {
            return -1;
        }
        return n2 / var_int_if * var_short_if + n / var_int_if;
    }

            public final void cfr_renamed_0() {
        if ((em_0.em_0_do() != GameCanvas.var_dL_do) && (GameCanvas.coTrangThai)) {
            ef_0 ef_02 = this;
            if (!(GameCanvas.var_bt_0_do == null) || !(GameCanvas.var_dX_do == null) || (GameCanvas.var_e_0_do != null)) {
                return;
            }
            if ((GameCanvas.boolean_do(0, 0, GameCanvas.var_int_byte, GameCanvas.var_int_char))) {
                int n = GameCanvas.int_do();
                int n2 = GameCanvas.int_for();
                if ((GameCanvas.coKichHoat)) {
                    GameCanvas.coKichHoat = 0;
                    cfr_renamed_19 = ek_0.ek_0_do().soLuong;
                    cfr_renamed_6 = ek_0.ek_0_do().cfr_renamed_3;
                    ef_02.dangChayAuto = 1;
                }
                if ((ef_02.dangChayAuto)) {
                    if ((GameCanvas.var_boolean_try) && (!(gc_0.int_if(n) <= 20) || (gc_0.int_if(n2) > 20))) {
                        ek_0.ek_0_do().var_int_if = cfr_renamed_19 + n;
                        ek_0.ek_0_do().cfr_renamed_4 = cfr_renamed_6 + n2;
                        ek_0.ek_0_do().void_do(ek_0.ek_0_do().var_int_if + GameCanvas.var_int_int, ek_0.ek_0_do().cfr_renamed_4 + GameCanvas.var_int_long);
                        ek_0.ek_0_do().soXu = System.currentTimeMillis() / 100L;
                    }
                    if ((GameCanvas.var_boolean_new)) {
                        GameCanvas.var_boolean_new = 0;
                        ef_02.dangChayAuto = 0;
                        if ((gc_0.int_if(n) < 10) && (gc_0.int_if(n2) < 10) && !(fe_0.var_boolean_try)) {
                            ef_0.var_eq_0_do.var_int_if = GameCanvas.soLuongKhoa + ek_0.ek_0_do().soLuong;
                            ef_0.var_eq_0_do.soLuong = GameCanvas.var_int_if + ek_0.ek_0_do().cfr_renamed_3;
                            if ((ef_0.var_eq_0_do.soLuong < 0)) {
                                ef_0.var_eq_0_do.soLuong = 0;
                            }
                            AngelChip.duLieuNguoiChoi.var_eq_0_do = var_eq_0_do;
                            AngelChip.duLieuNguoiChoi.cfr_renamed_11();
                        }
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 != null) {
        block17: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block16: {
                                    var2_2 = var1_1;
                                    var3_4 = this;
                                    if (!(ef_0.var_javax_microedition_lcdui_Image_do == null)) break block16;
                                    var2_2.setColor(1);
                                    var2_2.fillRect(ek_0.ek_0_do().soLuong, ek_0.ek_0_do().cfr_renamed_3, GameCanvas.var_int_byte, GameCanvas.var_int_char);
                                    if (((148 ^ 171) & ~(171 ^ 148)) < 0) {
                                        return;
                                    }
                                    break block17;
                                }
                                var2_2.setColor(ef_0.cfr_renamed_18);
                                var2_2.fillRect(ek_0.ek_0_do().soLuong, ek_0.ek_0_do().cfr_renamed_3, GameCanvas.var_int_byte, GameCanvas.var_int_char);
                                var4_5 = ek_0.ek_0_do().soLuong * 30 / 210;
                                var5_6 = (ek_0.ek_0_do().soLuong - var4_5) / (96 * bn_0.cfr_renamed_6);
                                var6_7 = -(94 - ef_0.var_int_if + ef_0.var_int_if / 2) * bn_0.cfr_renamed_6;
                                if ((ef_0.soLuong == 107)) {
                                    var6_7 += 41 * bn_0.cfr_renamed_6;
                                }
                                var7_8 = var5_6;
                                if (((26 ^ 13 ^ (238 ^ 181)) & (191 + 222 - 251 + 63 ^ 118 + 114 - 189 + 130 ^ -" ".length())) <= 0) ** GOTO lbl26
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    var2_2.drawImage(ef_0.var_javax_microedition_lcdui_Image_do, var4_5 + var7_8 * (96 * bn_0.cfr_renamed_6), var6_7, 0);
                                    ++var7_8;
lbl26:
                                    // 2 sources

                                    ** while (!ef_0.cfr_renamed_15((int)var7_8, (int)(var5_6 + GameCanvas.var_int_byte / (96 * bn_0.cfr_renamed_6) + 1)))
                                }
lbl27:
                                // 1 sources

                                if (!ef_0.cfr_renamed_0((Object)ef_0.var_java_util_Vector_char)) break block18;
                                var8_9 = 0;
                                if (-"   ".length() < 0) ** GOTO lbl37
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    var9_10 = (eq_0)ef_0.var_java_util_Vector_char.elementAt(var8_9);
                                    var7_8 = ek_0.ek_0_do().soLuong * (30 + var9_10.var_short_do * 3) / 210;
                                    ci_0.cfr_renamed_0(var2_2, var9_10.cfr_renamed_3, var9_10.var_int_if + var7_8, var9_10.soLuong, 33);
                                    ++var8_9;
lbl37:
                                    // 2 sources

                                    ** while (!ef_0.cfr_renamed_3((int)var8_9, (int)ef_0.var_java_util_Vector_char.size()))
                                }
                            }
                            if (!(var7_8 = ef_0.var_java_util_Vector_else.size() > 0)) break block19;
                            var8_9 = 0;
                            if (-" ".length() < " ".length()) ** GOTO lbl49
                            return;
lbl-1000:
                            // 1 sources

                            {
                                var9_10 = (eq_0)ef_0.var_java_util_Vector_else.elementAt(var8_9);
                                var2_2.setColor(ef_0.var_int_arr_for[var9_10.cfr_renamed_3]);
                                var2_2.fillRect(var9_10.var_int_if + var4_5, var9_10.soLuong, 1, 1);
                                ++var8_9;
lbl49:
                                // 2 sources

                                ** while (!ef_0.cfr_renamed_3((int)var8_9, (int)var7_8))
                            }
                        }
                        if (!(var3_4.var_eq_0_arr_do != null)) break block20;
                        var8_9 = 0;
                        if ((102 ^ 38 ^ (210 ^ 151)) > 0) ** GOTO lbl59
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var2_2.drawImage(fw.var_javax_microedition_lcdui_Image_arr_do[0], var3_4.var_eq_0_arr_do[var8_9].var_int_if, var3_4.var_eq_0_arr_do[var8_9].soLuong, 0);
                            ++var8_9;
lbl59:
                            // 2 sources

                            ** while (!ef_0.cfr_renamed_3((int)var8_9, (int)var3_4.var_eq_0_arr_do.length))
                        }
                    }
                    if (!(GameCanvas.var_java_util_Vector_if.size() > 0)) break block21;
                    var8_9 = 0;
                    if (null == null) ** GOTO lbl72
                    return;
lbl-1000:
                    // 1 sources

                    {
                        GameCanvas.var_java_util_Vector_if.elementAt(var8_9);
                        ++var8_9;
lbl72:
                        // 2 sources

                        ** while (!ef_0.cfr_renamed_3((int)var8_9, (int)GameCanvas.var_java_util_Vector_if.size()))
                    }
                }
                if (!ef_0.cfr_renamed_0((Object)ef_0.var_java_util_Vector_case)) break block22;
                var8_9 = 0;
                if ("   ".length() >= 0) ** GOTO lbl82
                return;
lbl-1000:
                // 1 sources

                {
                    ((d_0)ef_0.var_java_util_Vector_case.elementAt(var8_9)).cfr_renamed_0(var2_2);
                    ++var8_9;
lbl82:
                    // 2 sources

                    ** while (!ef_0.cfr_renamed_3((int)var8_9, (int)ef_0.var_java_util_Vector_case.size()))
                }
            }
            if ((GameCanvas.var_int_byte > ef_0.var_short_if * ef_0.var_int_if)) {
                var2_2.setColor(0);
                var2_2.fillRect(ek_0.ek_0_do().soLuong, ek_0.ek_0_do().cfr_renamed_3, -ek_0.ek_0_do().soLuong, GameCanvas.var_int_char);
                var2_2.fillRect(ef_0.var_short_if * ef_0.var_int_if * bn_0.cfr_renamed_6, ek_0.ek_0_do().cfr_renamed_3, -ek_0.ek_0_do().soLuong, GameCanvas.var_int_char);
            }
        }
        var3_4 = var1_1;
        var4_5 = (ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) / ef_0.var_int_if + 1;
        if ((var4_5 > ef_0.var_short_if)) {
            var4_5 = ef_0.var_short_if;
        }
        if (ef_0.cfr_renamed_15(var5_6 = (ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_char) / ef_0.var_int_if + 1, ef_0.var_short_do)) {
            var5_6 = ef_0.var_short_do;
        }
        if (ef_0.cfr_renamed_4(var6_7 = ek_0.ek_0_do().soLuong / (ef_0.var_int_if * bn_0.cfr_renamed_6))) {
            var6_7 = 0;
        }
        var9_11 = 0;
        if (-("   ".length() ^ (198 ^ 193)) < 0) ** GOTO lbl114
        return;
lbl-1000:
        // 1 sources

        {
            var2_3 = var6_7;
            if ((43 ^ 12 ^ (155 ^ 185)) > 0) ** GOTO lbl112
            return;
lbl-1000:
            // 1 sources

            {
                var7_8 = ef_0.var_short_arr_do[var9_11 * ef_0.var_short_if + var2_3];
                if ((var7_8 != -1)) {
                    var8_9 = var7_8 / ef_0.var_ep_do.cfr_renamed_1;
                    ef_0.var_ep_do.cfr_renamed_1(var8_9, var7_8 % ef_0.var_ep_do.cfr_renamed_1, var2_3 * (ef_0.var_int_if * bn_0.cfr_renamed_6), var9_11 * ef_0.var_int_if * bn_0.cfr_renamed_6, (Graphics)var3_4);
                }
                ++var2_3;
lbl112:
                // 2 sources

                ** while (!ef_0.cfr_renamed_3((int)var2_3, (int)var4_5))
            }
lbl113:
            // 1 sources

            ++var9_11;
lbl114:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var9_11, (int)var5_6))
        }
lbl115:
        // 1 sources

        if ((ef_0.var_ep_if != null) && (ef_0.var_int_else != -1) && (AngelChip.duLieuNguoiChoi.var_int_class > 0)) {
            ef_0.var_ep_if.cfr_renamed_0(ef_0.var_eq_0_do.cfr_renamed_3 / 2, ef_0.var_eq_0_do.var_int_if, ef_0.var_eq_0_do.soLuong, ef_0.var_int_else, 3, var1_1);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static bq_0 bq_0_do(int var0) {
        var1_1 = 0;
        if ("   ".length() == "   ".length()) ** GOTO lbl10
        return null;
lbl-1000:
        // 1 sources

        {
            var2_2 = (aG)ef_0.var_java_util_Vector_do.elementAt(var1_1);
            if ((var2_2.var_byte_if == 4) && ef_0.cfr_renamed_2(((bq_0)var2_2).duLieuNguoiChoi.cfr_renamed_12, var0)) {
                return (bq_0)var2_2;
            }
            ++var1_1;
lbl10:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_java_util_Vector_do.size()))
        }
lbl11:
        // 1 sources

        return null;
    }

        /*
     * Unable to fully structure code
     */
    public static fi_0 fi_0_do(int var0) {
        var1_1 = ef_0.var_java_util_Vector_try.size();
        var2_2 = 0;
        if ("   ".length() > " ".length()) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var3_3 = (fi_0)ef_0.var_java_util_Vector_try.elementAt(var2_2);
            if ((var3_3.cfr_renamed_3 == var0)) {
                return var3_3;
            }
            ++var2_2;
lbl11:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var2_2, (int)var1_1))
        }
lbl12:
        // 1 sources

        return null;
    }

        public ef_0() {
        var_ei_do = new ei(MenuChinhAvatar.cfr_renamed_46, new ca());
        cfr_renamed_20 = gc_0.int_do(3);
        var_int_if = 24;
        ap.void_do(MenuChinhAvatar.cq);
        ap.javax_microedition_lcdui_Image_do("den");
        var_javax_microedition_lcdui_Image_if = ap.javax_microedition_lcdui_Image_do("s0");
        if ((GameCanvas.coTrangThai)) {
            if ((GameCanvas.cfr_renamed_16 == 0)) {
                var_ep_if = new ep(ap.javax_microedition_lcdui_Image_do("focus"), 21 * bn_0.cfr_renamed_6, 15 * bn_0.cfr_renamed_6);
                if (-" ".length() == "  ".length()) {
                    throw null;
                }
            } else {
                var_ep_if = new ep(ap.javax_microedition_lcdui_Image_do("focus"), 32 * bn_0.cfr_renamed_6, 11 * bn_0.cfr_renamed_6);
            }
            var_eq_0_do = new eq_0();
        }
        ap.cfr_renamed_0();
    }

        public static void (DuLieuNguoiChoi bk_02 != null) {
        if ((bk_02.var_short_short != -1)) {
            bk_02 = new bq_0((DuLieuNguoiChoi)bk_02);
            var_java_util_Vector_do.addElement(bk_02);
        }
    }

    public static boolean boolean_do(int n) {
        if ((n >= -125) && (n < 0)) {
            return 1;
        }
        if (!((n != 55) && (n != 93) && (n != 78) && (n != 89) && (n != 27) && (n != 28) && (n != 29) && (n != 84) && (n != 85) && (n != 86) && (n != 83) && (n != 87) && (n != 54) && (n != 71) && (n != 52) && (n != 94) && (n != 95) && (n != 96) && (n != 97) && (n != 98) && (n != 100) && (n != 103) && (n != 101) && (n != 104) && !(n == 23))) {
            return 1;
        }
        return 0;
    }

            /*
     * Unable to fully structure code
     */
    private static void void_if(int var0) {
        block6: {
            var1_1 = 0;
            if (-" ".length() < 0) ** GOTO lbl12
            return;
lbl-1000:
            // 1 sources

            {
                var2_2 = (aU)ci_0.var_java_util_Vector_if.elementAt(var1_1);
                if ((var2_2.cfr_renamed_12 == var0)) {
                    var3_3 = ci_0.fi_0_do((int)var2_2.cfr_renamed_1);
                    ef_0.cfr_renamed_0((aU)var2_2, var3_3);
                    ef_0.var_java_util_Vector_new.addElement(new aU(var2_2.cfr_renamed_12, var2_2.cfr_renamed_3 * ef_0.var_int_if, var2_2.var_int_if * ef_0.var_int_if, var2_2.var_short_do, var2_2.cfr_renamed_1));
                }
                ++var1_1;
lbl12:
                // 2 sources

                ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ci_0.var_java_util_Vector_if.size()))
            }
lbl13:
            // 1 sources

            if (!ef_0.cfr_renamed_0((Object)ci_0.var_java_util_Vector_new)) break block6;
            var1_1 = 0;
            if (((108 ^ 118) & ~(109 ^ 119)) < "   ".length()) ** GOTO lbl33
            return;
lbl-1000:
            // 1 sources

            {
                var2_2 = (dp_0)ci_0.var_java_util_Vector_new.elementAt(var1_1);
                var3_4 = 0;
                if (((203 ^ 182 ^ (241 ^ 177)) & (59 ^ 66 ^ (59 ^ 127) ^ -" ".length())) == 0) ** GOTO lbl31
                return;
lbl-1000:
                // 1 sources

                {
                    var4_5 = (eq_0)var2_2.var_java_util_Vector_do.elementAt(var3_4);
                    if ((var4_5.cfr_renamed_3 == var0)) {
                        if ((var4_5.soLuong * ef_0.var_short_if + var4_5.var_int_if >= 0) && (var4_5.soLuong * ef_0.var_short_if + var4_5.var_int_if < ef_0.var_short_arr_if.length)) {
                            ef_0.var_short_arr_if[var4_5.soLuong * ef_0.var_short_if + var4_5.var_int_if] = 83;
                        }
                        (var2_2.cfr_renamed_3, var4_5.var_int_if * ef_0.var_int_if + ef_0.var_int_if / 2, var4_5.soLuong * ef_0.var_int_if + ef_0.var_int_if / 2 != null);
                    }
                    ++var3_4;
lbl31:
                    // 2 sources

                    ** while (!ef_0.cfr_renamed_3((int)var3_4, (int)var2_2.var_java_util_Vector_do.size()))
                }
lbl32:
                // 1 sources

                ++var1_1;
lbl33:
                // 2 sources

                ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ci_0.var_java_util_Vector_new.size()))
            }
        }
    }

        public static void (DuLieuNguoiChoi dd_02 == null) {
        var_java_util_Vector_do.addElement(dd_02);
        dd_02.cfr_renamed_18();
    }

    public static int int_if(int n, int n2) {
        if (!(n >= 0) || !(n <= var_short_if * var_int_if) || !(n2 / var_int_if * var_short_if + n / var_int_if >= 0) || (n2 / var_int_if * var_short_if + n / var_int_if >= var_short_arr_if.length)) {
            return -2;
        }
        return var_short_arr_if[n2 / var_int_if * var_short_if + n / var_int_if];
    }

        private static void (int n, byte by2, int n2 != null) {
        ef_0.var_short_arr_if[n] = by2;
        ef_0.var_short_arr_do[n] = (short)n2;
    }

    /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_1() {
        eg.dangChayAuto = 0;
        ef_0.cfr_renamed_11();
        (AngelChip.duLieuNguoiChoi == null);
        var0 = new short[ef_0.var_short_arr_do.length];
        ef_0.var_short_arr_if = new short[ef_0.var_short_arr_do.length];
        var1_1 = new byte[100];
        var2_2 = 0;
        var3_3 = 0;
        if ((107 ^ 110) != 0) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            var0[var3_3] = ef_0.var_short_arr_do[var3_3];
            ++var3_3;
lbl15:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var3_3, (int)ef_0.var_short_arr_do.length))
        }
lbl16:
        // 1 sources

        var3_3 = 0;
        if (("  ".length() & ("  ".length() ^ -" ".length())) != "   ".length()) ** GOTO lbl97
        return;
lbl-1000:
        // 1 sources

        {
            if ((ef_0.var_short_arr_do[var3_3] < ef_0.var_ep_do.cfr_renamed_1)) {
                ef_0.var_short_arr_do[var3_3] = -4;
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else if ((ef_0.var_short_arr_do[var3_3] < ef_0.var_ep_do.cfr_renamed_1 << 1)) {
                ef_0.var_short_arr_do[var3_3] = -5;
                if ("  ".length() <= 0) {
                    return;
                }
            } else {
                var4_4 = ef_0.var_short_arr_do[var3_3] - (ef_0.var_ep_do.cfr_renamed_1 << 1);
                switch (var4_4) {
                    case 0: {
                        ef_0.var_short_arr_do[var3_3] = 98;
                        var5_5 = new g_0(846, ef_0.int_do(var3_3) + ef_0.var_int_if / 2, ef_0.int_if(var3_3) + ef_0.var_int_if / 2);
                        ef_0.var_java_util_Vector_new.addElement(var5_5);
                        if (-(154 ^ 158) <= 0) break;
                        return;
                    }
                    case 2: {
                        ef_0.var_short_arr_do[var3_3] = 139;
                        if ((58 ^ 62) > -" ".length()) break;
                        return;
                    }
                    case 3: {
                        ef_0.var_short_arr_do[var3_3] = 152;
                        if (((249 ^ 186) & ~(194 ^ 129)) == ((163 ^ 143) & ~(133 ^ 169))) break;
                        return;
                    }
                    case 12: {
                        ef_0.var_short_arr_do[var3_3] = 150;
                        if (-(57 ^ 61) < 0) break;
                        return;
                    }
                    case 13: {
                        ef_0.var_short_arr_do[var3_3] = 151;
                        if ((222 ^ 196 ^ (179 ^ 172)) != 0) break;
                        return;
                    }
                    case 14: {
                        (var3_3, var2_2, 0 == null);
                        var2_2 = (byte)(var2_2 + 1);
                        ef_0.var_short_arr_do[var3_3] = 184;
                        var0[var3_3] = 33;
                        if ("   ".length() >= 0) break;
                        return;
                    }
                    case 15: {
                        var0[var3_3] = 0;
                        ef_0.var_short_arr_do[var3_3] = 185;
                        if (((147 ^ 149) & ~(186 ^ 188)) == 0) break;
                        return;
                    }
                    default: {
                        (var3_3, var1_1[var4_4], 0 == null);
                        ef_0.var_short_arr_if[var3_3] = (byte)(var4_4 + -125);
                        ef_0.var_short_arr_do[var3_3] = -3;
                    }
                }
                if ((var4_4 > 0) && (var1_1[var4_4] == 0) && (var4_4 - 1 < fe_0.var_short_arr_do.length) && (fe_0.var_short_arr_do[var4_4 - 1] != -1)) {
                    var5_5 = new g_0(fe_0.var_short_arr_do[var4_4 - 1], ef_0.int_do(var3_3) + ef_0.int_do(var3_3, var0), ef_0.int_if(var3_3) + ef_0.var_int_if - 4);
                    ef_0.var_java_util_Vector_new.addElement(var5_5);
                }
                if ((var4_4 != 14)) {
                    ef_0.void_do(var3_3, var0);
                }
                v0 = var4_4;
                var1_1[v0] = (byte)(var1_1[v0] + 1);
            }
            ++var3_3;
lbl97:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var3_3, (int)ef_0.var_short_arr_do.length))
        }
lbl98:
        // 1 sources

        ek_0.coTrangThai = 0;
        AngelChip.duLieuNguoiChoi.cfr_renamed_4 = (byte)0;
        (null, fe_0.var_byte_int + 1, 0 != null);
        ef_0.soLuong = fe_0.var_byte_int;
        ef_0.var_short_arr_do = var0;
        ek_0.ek_0_do().void_if(fe_0.var_byte_int + 1);
        GameCanvas.cfr_renamed_8();
        ef_0.cfr_renamed_16 = -1;
        ef_0.var_int_try = -1;
        ef_0.cfr_renamed_4();
        el_0.el_0_do().cfr_renamed_4(fe_0.var_byte_int, -1);
    }

    public static void (int n, int n2, int n3 != null) {
        ea ea2;
        if ((soLuongKhoa != -1)) {
            return;
        }
        if ((n > 0)) {
            ea2 = new g_0(n, n2, n3);
            if ("   ".length() <= ((0x68 ^ 0x4E) & ~(0x49 ^ 0x6F))) {
                return;
            }
        } else {
            ea2 = new ea(n, n2, n3, 0);
        }
        var_java_util_Vector_new.addElement(ea2);
    }

        public static InputStream java_io_InputStream_do(int n) {
        ap.var_ap_do = new ap("/a.clazz");
        Object object = "" + n;
        object = ap.var_ap_do.byte_arr_do((String)object);
        ByteArrayInputStream byteArrayInputStream = null;
        if ((object != null)) {
            try {
                byteArrayInputStream = new ByteArrayInputStream((byte[])object);
                }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if ((" ".length() & (" ".length() ^ -" ".length())) == "   ".length()) {
                return null;
            }
        }
        return byteArrayInputStream;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean boolean_do(int var0, int var1_4) {
        var2_6 = ef_0.int_if(var0, var1_4);
        if ((GameCanvas.var_et_0_do != null) && !ef_0.cfr_renamed_15((int)et_0.boolean_do(var2_6)) || (var2_6 == -2)) {
            return 0;
        }
        block0 : switch (var2_6) {
            case -1: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                if ((ef_0.soLuong == 25)) {
                    bF.bF_do();
                    }
                if ((ef_0.var_javax_microedition_lcdui_Image_do != null)) {
                    ef_0.var_eg_do.cfr_renamed_0(-1);
                    if (" ".length() == " ".length()) break;
                    return (boolean)((166 ^ 139 ^ (117 ^ 113)) & (88 + 22 - 105 + 161 ^ 78 + 142 - 91 + 14 ^ -" ".length()));
                }
                fe_0.fe_0_do().cfr_renamed_12();
                if ((61 ^ 56) > 0) break;
                return (boolean)((74 ^ 86) & ~(99 ^ 127));
            }
            case 55: {
                GameCanvas.cfr_renamed_5();
                var0_1 = eq.eq_do();
                var0_1.cfr_renamed_0(-23);
                var0_1.cfr_renamed_1();
                if (" ".length() > -" ".length()) break;
                return (boolean)((26 ^ 89) & ~(225 ^ 162));
            }
            case 108: 
            case 109: {
                ef_0.var_int_char = AngelChip.duLieuNguoiChoi.cfr_renamed_3;
                ef_0.var_int_new = AngelChip.duLieuNguoiChoi.var_int_if;
                GameCanvas.cfr_renamed_5();
                fe_0.var_byte_char = (byte)1;
                eq.eq_do().cfr_renamed_1(4);
                if ("  ".length() >= " ".length()) break;
                return (boolean)((215 ^ 156 ^ (160 ^ 164)) & (184 + 45 - 66 + 84 ^ 44 + 17 - 14 + 137 ^ -" ".length()));
            }
            case 57: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0(1);
                if (-"   ".length() <= 0) break;
                return (boolean)((102 ^ 8 ^ (67 ^ 24)) & (21 + 3 - -46 + 64 ^ 51 + 35 - -85 + 8 ^ -" ".length()));
            }
            case 62: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0(6);
                if (" ".length() != 0) break;
                return (boolean)((175 ^ 130) & ~(61 ^ 16));
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                el_0.el_0_do().cfr_renamed_4(var2_6, -1);
                if ("  ".length() != 0) break;
                return (boolean)((251 ^ 158 ^ (97 ^ 49)) & (85 + 90 - 27 + 30 ^ 129 + 122 - 122 + 6 ^ -" ".length()));
            }
            case 17: {
                ef_0.cfr_renamed_15();
                if (null == null) break;
                return (boolean)((10 ^ 95 ^ "  ".length()) & (129 ^ 195 ^ (42 ^ 63) ^ -" ".length()));
            }
            case 12: {
                ef_0.cfr_renamed_15();
                if (-" ".length() < (30 ^ 26)) break;
                return (boolean)((46 ^ 43) & ~(157 ^ 152));
            }
            case 25: {
                bF.bF_do().cfr_renamed_18();
                if ((61 ^ 57) > 0) break;
                return (boolean)((32 ^ 0) & ~(150 ^ 182));
            }
            case 24: {
                if (!ef_0.cfr_renamed_0((Object)bF.var_java_util_Vector_int) || (bF.soLuong != AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                    GameCanvas.cfr_renamed_5();
                    bF.bF_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.cfr_renamed_12, 1);
                    if (((130 ^ 158 ^ (131 ^ 132)) & (94 + 83 - 124 + 75 ^ 124 + 76 - 127 + 82 ^ -" ".length())) == 0) break;
                    return (boolean)((234 ^ 187 ^ (34 ^ 66)) & (89 ^ 43 ^ (56 ^ 123) ^ -" ".length()));
                }
                bF.bF_do().cfr_renamed_0(bF.soLuong, bF.var_java_util_Vector_int, bF.var_java_util_Vector_if, bF.var_byte_if, bF.var_byte_do, bF.var_short_do, bF.var_int_char);
                if (-" ".length() == -" ".length()) break;
                return (boolean)((3 ^ 94) & ~(85 ^ 8));
            }
            case 52: {
                bF.bF_do();
                bF.cfr_renamed_16();
                if (" ".length() != 0) break;
                return (boolean)((195 + 8 - 198 + 194 ^ 145 + 101 - 204 + 124) & (33 ^ 50 ^ (61 ^ 79) ^ -" ".length()));
            }
            case 53: {
                bF.bF_do();
                bF.cfr_renamed_10();
                if ((183 ^ 179) >= 0) break;
                return (boolean)((5 ^ 35) & ~(20 ^ 50));
            }
            case 9: {
                ef_0.cfr_renamed_15();
                if (-" ".length() != "  ".length()) break;
                return (boolean)("  ".length() & ~"  ".length());
            }
            case 58: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0(2);
                if (-(66 ^ 71) < 0) break;
                return (boolean)((35 ^ 111) & ~(72 ^ 4));
            }
            case 63: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0(7);
                if (-" ".length() < "   ".length()) break;
                return (boolean)((229 ^ 164) & ~(206 ^ 143));
            }
            case 59: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0(3);
                if (-" ".length() != "   ".length()) break;
                return (boolean)((198 ^ 135) & ~(99 ^ 34));
            }
            case 64: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0(8);
                if ((189 ^ 185) != 0) break;
                return (boolean)((89 ^ 94) & ~(125 ^ 122));
            }
            case 27: 
            case 56: {
                if (!(ef_0.soLuong != 18) || !(ef_0.soLuong != 109) || !(ef_0.soLuong != 108)) break;
                fe_0.fe_0_do().cfr_renamed_34();
                if ((111 ^ 107) > "   ".length()) break;
                return (boolean)((147 ^ 132) & ~(10 ^ 29));
            }
            case 28: {
                bF.bF_do();
                bF.cfr_renamed_5();
                if (" ".length() != "   ".length()) break;
                return (boolean)((152 + 168 - 245 + 149 ^ 153 + 165 - 193 + 44) & (80 + 122 - 106 + 112 ^ 61 + 57 - 14 + 49 ^ -" ".length()));
            }
            case 29: {
                GameCanvas.cfr_renamed_5();
                el_0.el_0_do().cfr_renamed_1(fe_0.var_byte_int);
                if (-" ".length() <= "  ".length()) break;
                return (boolean)((3 ^ 52) & ~(94 ^ 105));
            }
            case 93: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0(MenuChinhAvatar.an, 4);
                if (-"   ".length() < 0) break;
                return (boolean)((32 ^ 105 ^ (241 ^ 179)) & (6 + 138 - 60 + 84 ^ 95 + 156 - 101 + 13 ^ -" ".length()));
            }
            case 78: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0(MenuChinhAvatar.an, 5);
                if (" ".length() > 0) break;
                return (boolean)((180 ^ 138) & ~(83 ^ 109));
            }
            case 83: {
                var2_6 = var1_4 / ef_0.var_int_if;
                var1_4 = var0 / ef_0.var_int_if;
                if (!ef_0.cfr_renamed_0((Object)ci_0.var_java_util_Vector_new)) ** GOTO lbl257
                var0 = 0;
                if ((161 ^ 165) >= 0) ** GOTO lbl256
                return (boolean)((62 ^ 124) & ~(21 ^ 87));
lbl-1000:
                // 1 sources

                {
                    var3_7 = (dp_0)ci_0.var_java_util_Vector_new.elementAt(var0);
                    var4_8 = 0;
                    if ("   ".length() >= -" ".length()) ** GOTO lbl254
                    return (boolean)((90 + 69 - 138 + 140 ^ 114 + 138 - 235 + 129) & (121 + 69 - 85 + 37 ^ 121 + 183 - 152 + 37 ^ -" ".length()));
lbl-1000:
                    // 1 sources

                    {
                        var5_9 = (eq_0)var3_7.var_java_util_Vector_do.elementAt(var4_8);
                        if ((var5_9.var_int_if == var1_4) && (var5_9.soLuong == var2_6) && (ef_0.soLuong + 1 == var5_9.cfr_renamed_3)) {
                            var1_5 = new Vector<ei>();
                            var1_5.addElement(new ei(MenuChinhAvatar.c, new er(var3_7)));
                            var1_5.addElement(new ei(MenuChinhAvatar.cfr_renamed_7, new et()));
                            GameCanvas.hienThongBaoPopup(var3_7.chuoiGiaTri, var1_5);
                            if ("  ".length() >= 0) break block0;
                            return (boolean)((38 ^ 23) & ~(153 ^ 168));
                        }
                        ++var4_8;
lbl254:
                        // 2 sources

                        ** while (!ef_0.cfr_renamed_3((int)var4_8, (int)var3_7.var_java_util_Vector_do.size()))
                    }
lbl255:
                    // 1 sources

                    ++var0;
lbl256:
                    // 2 sources

                    ** while (!ef_0.cfr_renamed_3((int)var0, (int)ci_0.var_java_util_Vector_new.size()))
                }
lbl257:
                // 2 sources

                if ("   ".length() > ((124 ^ 50 ^ (248 ^ 139)) & (159 ^ 133 ^ (122 ^ 93) ^ -" ".length()))) break;
                return (boolean)((52 ^ 0 ^ (223 ^ 137)) & (75 ^ 9 ^ (18 ^ 50) ^ -" ".length()));
            }
            case 84: {
                bF.bF_do();
                bF.cfr_renamed_0(2);
                if (((156 ^ 140) & ~(168 ^ 184)) == 0) break;
                return (boolean)((125 ^ 102) & ~(145 ^ 138));
            }
            case 85: {
                bF.bF_do();
                bF.cfr_renamed_0(3);
                if (((227 ^ 154 ^ (11 ^ 64)) & (73 ^ 14 ^ (120 ^ 13) ^ -" ".length())) == 0) break;
                return (boolean)((19 + 64 - -73 + 8 ^ 99 + 41 - 101 + 158) & (36 ^ 124 ^ (71 ^ 126) ^ -" ".length()));
            }
            case 86: {
                var0 = ef_0.int_do(var0, var1_4);
                var1_4 = ef_0.int_do(ee_0.cfr_renamed_1.var_int_if, ee_0.cfr_renamed_1.soLuong);
                bF.bF_do();
                bF.cfr_renamed_0(2, var0 - var1_4, bF.var_java_util_Vector_byte);
                if (((48 ^ 58) & ~(90 ^ 80)) == 0) break;
                return (boolean)((77 ^ 127) & ~(64 ^ 114));
            }
            case 87: {
                var0 = ef_0.int_do(var0, var1_4);
                var1_4 = ef_0.int_do(gC.var_eq_0_do.var_int_if, gC.var_eq_0_do.soLuong);
                bF.bF_do();
                bF.cfr_renamed_0(1, var0 - var1_4, bF.var_java_util_Vector_new);
                if ("  ".length() != "   ".length()) break;
                return (boolean)((42 ^ 100 ^ (246 ^ 132)) & (121 ^ 29 ^ (228 ^ 188) ^ -" ".length()));
            }
            case 89: {
                if (!(ef_0.soLuong != 108) || (ef_0.soLuong == 109)) {
                    var0 = 1;
                    if (-" ".length() > " ".length()) {
                        return (boolean)((93 ^ 63) & ~(50 ^ 80));
                    }
                } else if ((ef_0.soLuong == 13)) {
                    var0 = 2;
                    if (" ".length() > (196 ^ 162 ^ (75 ^ 41))) {
                        return (boolean)((42 ^ 100 ^ (55 ^ 65)) & (9 ^ 104 ^ (196 ^ 157) ^ -" ".length()));
                    }
                } else {
                    var0 = 3;
                }
                eq.eq_do().cfr_renamed_4(var0);
                GameCanvas.cfr_renamed_5();
                if ("  ".length() > 0) break;
                return (boolean)((147 ^ 181) & ~(130 ^ 164));
            }
            case 54: {
                return bW.cfr_renamed_0().boolean_do(var0, var1_4);
            }
            case 21: {
                fe.fe_do().cfr_renamed_5();
                if ("  ".length() == "  ".length()) break;
                return (boolean)((82 ^ 78) & ~(92 ^ 64));
            }
            case 68: 
            case 69: 
            case 70: {
                fe_0.fe_0_do();
                fe_0.void_new(var2_6 - 67);
                if (((59 ^ 31 ^ (133 ^ 149)) & (105 + 147 - 166 + 75 ^ 80 + 19 - -2 + 48 ^ -" ".length())) == 0) break;
                return (boolean)((179 + 56 - 56 + 11 ^ 67 + 109 - 56 + 11) & (168 ^ 179 ^ (59 ^ 29) ^ -" ".length()));
            }
            case 110: {
                GameCanvas.cfr_renamed_5();
                db_0.db_0_do().cfr_renamed_4(AngelChip.duLieuNguoiChoi.cfr_renamed_12);
                if ((107 + 13 - -8 + 3 ^ 118 + 133 - 170 + 54) >= ((45 + 24 - 37 + 97 ^ 21 + 150 - 91 + 84) & (55 ^ 13 ^ (26 ^ 5) ^ -" ".length()))) break;
                return (boolean)((12 + 89 - 88 + 117 ^ 127 + 28 - 68 + 74) & (213 ^ 178 ^ (44 ^ 104) ^ -" ".length()));
            }
            case 20: {
                eq.eq_do().cfr_renamed_1(0);
                GameCanvas.cfr_renamed_5();
                if (null == null) break;
                return (boolean)((53 ^ 20 ^ "   ".length()) & (29 ^ 17 ^ (14 ^ 32) ^ -" ".length()));
            }
            case 71: {
                GameCanvas.cfr_renamed_5();
                eq.eq_do().cfr_renamed_4(-1);
                if (((64 ^ 31 ^ (91 ^ 54)) & (31 + 42 - -49 + 8 ^ 98 + 163 - 92 + 7 ^ -" ".length())) > -" ".length()) break;
                return (boolean)((139 ^ 153 ^ (25 ^ 33)) & (210 ^ 154 ^ (209 ^ 179) ^ -" ".length()));
            }
            case 94: {
                eq.eq_do().cfr_renamed_4(4);
                GameCanvas.cfr_renamed_5();
                if ((91 + 173 - 159 + 77 ^ 108 + 67 - 35 + 39) != 0) break;
                return (boolean)((67 ^ 9 ^ (159 ^ 195)) & (41 + 92 - 31 + 39 ^ 62 + 54 - 78 + 117 ^ -" ".length()));
            }
            case 95: {
                GameCanvas.cfr_renamed_5();
                bF.var_int_try = AngelChip.duLieuNguoiChoi.cfr_renamed_3;
                bF.var_int_else = AngelChip.duLieuNguoiChoi.var_int_if;
                dh_0.dh_0_do().cfr_renamed_5(0, 0);
                if (((45 ^ 20 ^ (145 ^ 128)) & (37 ^ 101 ^ (217 ^ 177) ^ -" ".length())) == 0) break;
                return (boolean)((35 ^ 19 ^ (182 ^ 138)) & (105 ^ 81 ^ (187 ^ 143) ^ -" ".length()));
            }
            case 96: {
                GameCanvas.cfr_renamed_5();
                bF.var_int_try = AngelChip.duLieuNguoiChoi.cfr_renamed_3;
                bF.var_int_else = AngelChip.duLieuNguoiChoi.var_int_if;
                dh_0.dh_0_do().cfr_renamed_15(0, 0);
                if (null == null) break;
                return (boolean)((25 ^ 59) & ~(69 ^ 103));
            }
            case 97: {
                bF.bF_do();
                bF.cfr_renamed_12();
                if ("  ".length() == "  ".length()) break;
                return (boolean)((179 ^ 159 ^ (28 ^ 32)) & (38 + 76 - 71 + 96 ^ 140 + 40 - 108 + 83 ^ -" ".length()));
            }
            case 98: {
                bF.bF_do().void_if();
                if ("  ".length() != 0) break;
                return (boolean)((186 ^ 172 ^ (20 ^ 77)) & (181 + 23 - 95 + 124 ^ 103 + 136 - 117 + 44 ^ -" ".length()));
            }
            case 103: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_8(3);
                if (((" ".length() ^ (168 ^ 174)) & (41 + 23 - 7 + 113 ^ 83 + 107 - 81 + 64 ^ -" ".length())) >= 0) break;
                return (boolean)((55 ^ 61 ^ (102 ^ 117)) & (157 + 76 - 194 + 135 ^ 117 + 181 - 283 + 168 ^ -" ".length()));
            }
            case 23: {
                eq.eq_do().cfr_renamed_17(9);
                GameCanvas.cfr_renamed_5();
                if ("  ".length() != 0) break;
                return (boolean)((253 ^ 174 ^ (229 ^ 150)) & (8 + 149 - 88 + 111 ^ 87 + 8 - -41 + 12 ^ -" ".length()));
            }
            case 104: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_8(4);
                if ((47 ^ 43) != 0) break;
                return (boolean)((180 ^ 156) & ~(17 ^ 57));
            }
            case 100: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_8(5);
                if ("  ".length() >= "  ".length()) break;
                return (boolean)((188 + 141 - 265 + 165 ^ 102 + 108 - 90 + 13) & (97 ^ 0 ^ " ".length() ^ -" ".length()));
            }
            case 101: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_8(6);
                if ("   ".length() > 0) break;
                return (boolean)("   ".length() & ("   ".length() ^ -" ".length()) & ((168 ^ 163 ^ (82 ^ 107)) & (33 ^ 100 ^ (207 ^ 184) ^ -" ".length()) ^ -" ".length()));
            }
            case 107: {
                GameCanvas.cfr_renamed_5();
                fe_0.var_int_int = ef_0.soLuong;
                eq.eq_do().cfr_renamed_17(12);
                if (-(89 + 13 - 35 + 73 ^ 130 + 101 - 216 + 121) < 0) break;
                return (boolean)((152 + 52 - 57 + 6 ^ 86 + 106 - 65 + 8) & (18 + 186 - 181 + 197 ^ 149 + 179 - 149 + 15 ^ -" ".length()));
            }
            case 19: {
                GameCanvas.cfr_renamed_5();
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                ef_0.var_int_try = -1;
                el_0.el_0_do().cfr_renamed_4(19, -1);
                if ("   ".length() > 0) break;
                return (boolean)((132 ^ 154 ^ "  ".length()) & (6 ^ 8 ^ (80 ^ 66) ^ -" ".length()));
            }
            case 10: {
                GameCanvas.cfr_renamed_5();
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                ef_0.var_int_try = -1;
                el_0.el_0_do().cfr_renamed_4(10, -1);
                if (null == null) break;
                return (boolean)((141 + 145 - 265 + 162 ^ 15 + 72 - 63 + 152) & (30 ^ 6 ^ (167 ^ 184) ^ -" ".length()));
            }
            case 111: {
                GameCanvas.cfr_renamed_5();
                var0_2 = eq.eq_do();
                var0_2.cfr_renamed_0(-105);
                var0_2.cfr_renamed_1();
                if (" ".length() != 0) break;
                return (boolean)((189 ^ 151 ^ (145 ^ 178)) & (212 ^ 182 ^ (64 ^ 43) ^ -" ".length()));
            }
            case 112: {
                if (!(AngelChip.duLieuNguoiChoi.cfr_renamed_4 != 14)) break;
                fe.fe_do().soLuong = AngelChip.duLieuNguoiChoi.var_int_if;
                if ((var0 = var0 / ef_0.var_int_if * ef_0.var_int_if + ef_0.var_int_if / 2 + 1 < AngelChip.duLieuNguoiChoi.cfr_renamed_3)) {
                    fe.fe_do().var_int_if = var0 + ef_0.var_int_if;
                    } else {
                    fe.fe_do().var_int_if = var0 - ef_0.var_int_if;
                }
                AngelChip.duLieuNguoiChoi.void_do(var0, var1_4 / ef_0.var_int_if * ef_0.var_int_if + 5);
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0(AngelChip.duLieuNguoiChoi.cfr_renamed_3, AngelChip.duLieuNguoiChoi.var_int_if, AngelChip.duLieuNguoiChoi.cfr_renamed_3, AngelChip.duLieuNguoiChoi.var_short_goto);
                AngelChip.duLieuNguoiChoi.cfr_renamed_0(14);
                db_0.db_0_do().cfr_renamed_12(14);
                if (" ".length() <= "   ".length()) break;
                return (boolean)((15 ^ 56 ^ (185 ^ 162)) & (125 ^ 75 ^ (169 ^ 179) ^ -" ".length()));
            }
            default: {
                if ((var2_6 >= -125) && (var2_6 < 0)) {
                    GameCanvas.cfr_renamed_5();
                    ef_0.var_int_byte = var2_6;
                    eq.eq_do().cfr_renamed_1((short)(var2_6 - -125));
                    if (-" ".length() <= 0) break;
                    return (boolean)((48 ^ 15) & ~(27 ^ 36));
                }
                if (ef_0.cfr_renamed_2((int)AngelChip.duLieuNguoiChoi.cfr_renamed_1) && (var1_4 / ef_0.var_int_if == 0) && (var2_6 == 88)) {
                    if (ef_0.cfr_renamed_15((int)fe_0.coTrangThai)) {
                        AngelChip.duLieuNguoiChoi.cfr_renamed_1 = 1;
                        if (-" ".length() > 0) {
                            return (boolean)((224 ^ 164) & ~(60 ^ 120));
                        }
                    } else {
                        var0_3 = el_0.el_0_do();
                        if (ef_0.cfr_renamed_2((int)fe_0.var_boolean_byte)) {
                            fe_0.var_boolean_byte = 1;
                            var0_3.cfr_renamed_0(92);
                            var0_3.cfr_renamed_1();
                        }
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    private static void void_if(int n, int n2) {
        if ((soLuongKhoa != -1)) {
            return;
        }
        g_0 g_02 = new g_0(n, ef_0.int_do(n2) + ef_0.int_do(n2, var_short_arr_do), ef_0.int_if(n2) + var_int_if - 4);
        var_java_util_Vector_new.addElement(g_02);
    }

    public final void void_do(int n) {
        InputStream inputStream;
        block42: {
            block44: {
                Object object;
                Object object2;
                block43: {
                    if (ef_0.cfr_renamed_15(i_0.i_0_do().boolean_do() ? 1 : 0)) {
                        GameCanvas.cfr_renamed_6 = 0;
                        GameCanvas.cfr_renamed_8();
                    }
                    if ((GameCanvas.var_et_0_do != null)) {
                        GameCanvas.var_et_0_do = null;
                    }
                    GameCanvas.gameCanvas.void_do();
                    AngelChip.duLieuNguoiChoi.var_int_class = 0;
                    soLuongKhoa = -1;
                    ef_0.var_ei_do.chuoiGiaTri = MenuChinhAvatar.cfr_renamed_46;
                    GameCanvas.var_java_util_Vector_if.removeAllElements();
                    AngelChip.duLieuNguoiChoi.dangChayAuto = 0;
                    eg.dangChayAuto = 0;
                    ek_0.coTrangThai = 0;
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(0);
                    ef_0.cfr_renamed_11();
                    fe_0.var_java_util_Vector_new.removeAllElements();
                    var_aG_do = null;
                    fe_0.duLieuNguoiChoi = null;
                    int n2 = Calendar.getInstance().get(11);
                    if (!(n2 < 18) || (n2 < 6)) {
                        var_byte_if = (byte)1;
                        if ("  ".length() > "   ".length()) {
                            return;
                        }
                    } else {
                        var_byte_if = (byte)0;
                    }
                    cfr_renamed_18 = var_int_arr_if[var_byte_if];
                    n2 = n - 1;
                    if ((n2 != 107) && (!(n2 >= 0) || !(n2 < var_byte_arr_do.length) || (var_byte_arr_do[n2] == -1))) {
                        cfr_renamed_16 = -1;
                        var_javax_microedition_lcdui_Image_do = null;
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                    } else if (!(n2 != 107) || !(cfr_renamed_16 == var_byte_arr_do[n2]) || (var_int_try != var_byte_if)) {
                        int n3;
                        if ((n2 == 107)) {
                            n3 = 0;
                            if (" ".length() >= (114 + 133 - 217 + 121 ^ 118 + 45 - 106 + 90)) {
                                return;
                            }
                        } else {
                            n3 = var_byte_arr_do[n2];
                        }
                        cfr_renamed_16 = n3;
                        ap.void_do(MenuChinhAvatar.cu);
                        object2 = ap.javax_microedition_lcdui_Image_do(String.valueOf(n3) + var_byte_if);
                        Image image = ap.javax_microedition_lcdui_Image_do(String.valueOf(var_byte_if));
                        var_javax_microedition_lcdui_Image_do = Image.createImage((int)(96 * bn_0.cfr_renamed_6), (int)(96 * bn_0.cfr_renamed_6));
                        object = var_javax_microedition_lcdui_Image_do.getGraphics();
                        k.cfr_renamed_0(0, 0, 96 * bn_0.cfr_renamed_6, 10 * bn_0.cfr_renamed_6, var_int_arr_if[var_byte_if], (Graphics)object);
                        object.drawImage(image, 0, 69 * bn_0.cfr_renamed_6, 36);
                        object.drawImage(object2, 0, 96 * bn_0.cfr_renamed_6, 36);
                        ap.cfr_renamed_0();
                    }
                    if ((var_int_try == var_byte_if) && !(var_ep_do == null)) break block42;
                    if (!(n - 1 == 19)) break block43;
                    try {
                        var_int_try = -1;
                        var_ep_do = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/wedding.png")), var_int_if * bn_0.cfr_renamed_6, var_int_if * bn_0.cfr_renamed_6);
                        }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                        if (((37 + 109 - 8 + 12 ^ 52 + 67 - 88 + 128) & (0x4D ^ 0x30 ^ (0xDA ^ 0xAE) ^ -" ".length())) > "   ".length()) {
                            return;
                        }
                        break block42;
                    }
                    break block42;
                }
                if (!(n - 1 != 107)) break block44;
                var_int_if = 24;
                var_int_try = var_byte_if;
                Object object3 = gc_0.java_io_InputStream_do(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/data/h" + var_byte_if);
                object = gc_0.java_io_InputStream_do(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/data/data");
                try {
                    object2 = new byte[((InputStream)object3).available()];
                    ((InputStream)object3).read((byte[])object2);
                    object3 = new byte[((InputStream)object).available()];
                    ((InputStream)object).read((byte[])object3);
                    var_ep_do = new ep(gc_0.cfr_renamed_0((byte[])object2, (byte[])object3), var_int_if * bn_0.cfr_renamed_6, var_int_if * bn_0.cfr_renamed_6);
                    }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    break block42;
                }
                if (" ".length() == (0x2C ^ 0x5A ^ (0x29 ^ 0x5B))) {
                    return;
                }
                break block42;
            }
            try {
                var_int_if = 12;
                var_int_try = -1;
                var_ep_do = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/tileDuaXe.png")), var_int_if * bn_0.cfr_renamed_6, var_int_if * bn_0.cfr_renamed_6);
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if ((0x99 ^ 0xC0 ^ (0xEE ^ 0xB3)) > (123 + 7 - 77 + 127 ^ 110 + 102 - 199 + 163)) {
                return;
            }
        }
        if ((inputStream = ef_0.java_io_InputStream_do(n) != null)) {
            var_short_do = (short)8;
            switch (n - 1) {
                case 107: {
                    var_short_do = (short)16;
                    if (((0x93 ^ 0xB4 ^ (2 ^ 0x2C)) & (0x57 ^ 0x79 ^ (0x6E ^ 0x49) ^ -" ".length())) <= " ".length()) break;
                    return;
                }
                case 25: {
                    var_short_do = (short)7;
                    if ("  ".length() == "  ".length()) break;
                    return;
                }
                case 21: {
                    var_short_do = (short)7;
                    if ("  ".length() == "  ".length()) break;
                    return;
                }
                case 9: {
                    var_short_do = (short)8;
                    if (" ".length() > 0) break;
                    return;
                }
                case 20: 
                case 57: 
                case 58: 
                case 59: 
                case 62: 
                case 63: 
                case 64: 
                case 100: 
                case 101: 
                case 103: 
                case 104: 
                case 109: {
                    var_short_do = (short)11;
                    if (((0x64 ^ 6 ^ (0x42 ^ 0x1A) & ~(0x26 ^ 0x7E)) & (83 + 63 - 91 + 188 ^ 123 + 7 - 23 + 38 ^ -" ".length())) < " ".length()) break;
                    return;
                }
                case 60: 
                case 61: 
                case 65: {
                    var_short_do = (short)5;
                    if ("   ".length() <= (0xB ^ 0xF)) break;
                    return;
                }
                case 18: {
                    var_short_do = (short)10;
                    if (null == null) break;
                    return;
                }
                case 17: {
                    var_short_do = (short)6;
                    if (" ".length() < "   ".length()) break;
                    return;
                }
                case 24: {
                    if (-"   ".length() < 0) break;
                    return;
                }
                case 11: 
                case 13: {
                    if (" ".length() != 0) break;
                    return;
                }
                case 108: {
                    var_short_do = (short)8;
                    if (-" ".length() <= 0) break;
                    return;
                }
                case 19: {
                    var_short_do = (short)13;
                    if ("   ".length() > 0) break;
                    return;
                }
                case 10: {
                    var_short_do = (short)9;
                }
            }
        }
        (inputStream, n, 1 != null);
        soLuong = n - 1;
        System.out.println("index: " + soLuong);
        if ((var_byte_do != -1) && (soLuong < var_byte_arr_do.length) && (var_byte_arr_do[soLuong] != -1)) {
            er_0 er_02 = new er_0(var_byte_do, 0);
            GameCanvas.var_java_util_Vector_if.addElement(er_02);
        }
        this.cfr_renamed_12();
        ef_0.cfr_renamed_8();
        if (ef_0.cfr_renamed_15(i_0.i_0_do().boolean_do() ? 1 : 0) && ef_0.cfr_renamed_0((Object)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if)) {
            (AngelChip.duLieuNguoiChoi == null);
        }
        if ((GameCanvas.cfr_renamed_6 == 0)) {
            GameCanvas.cfr_renamed_6 = 1;
        }
        System.gc();
    }

    static {
        ef_0.cfr_renamed_2();
        soLuong = -1;
        byte[] byArray = new byte[26];
        byArray[0] = 1;
        byArray[1] = 1;
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 1;
        byArray[5] = 1;
        byArray[6] = 1;
        byArray[7] = 1;
        byArray[8] = 1;
        byArray[11] = 1;
        byArray[12] = 3;
        byArray[13] = 3;
        byArray[14] = 3;
        byArray[15] = 3;
        byArray[16] = 3;
        byArray[17] = 2;
        byArray[18] = -1;
        byArray[19] = -1;
        byArray[20] = -1;
        byArray[24] = 2;
        byArray[25] = 2;
        var_byte_arr_do = byArray;
        var_int_if = 24;
        var_byte_if = (byte)0;
        var_byte_do = (byte)-1;
        var_java_util_Vector_new = new Vector();
        var_java_util_Vector_do = new Vector();
        var_java_util_Vector_int = new Vector();
        cfr_renamed_20 = 0;
        var_java_util_Vector_else = new Vector();
        int[] nArray = new int[4];
        nArray[0] = 15853390;
        nArray[1] = 15006199;
        nArray[2] = 8183509;
        nArray[3] = 12254198;
        var_int_arr_for = nArray;
        int[] nArray2 = new int[2];
        nArray2[0] = 6143735;
        nArray2[1] = 21;
        var_int_arr_if = nArray2;
        var_int_try = -1;
        cfr_renamed_16 = -1;
        soLuongKhoa = -1;
        var_eg_do = new eg();
        var_int_else = -1;
        this = 3;
        var_int_char = -1;
        var_int_new = -1;
        cfr_renamed_30 = 0;
        var_int_case = 0;
        var_int_byte = -1;
        cfr_renamed_10 = -1;
        var_int_int = -1;
    }

        /*
     * Unable to fully structure code
     */
    private static int int_do(int var0, short[] var1_1) {
        var2_2 = var0;
        if (-" ".length() <= "  ".length()) ** GOTO lbl9
        return (144 ^ 136 ^ (176 ^ 172)) & (190 ^ 192 ^ (127 ^ 5) ^ -" ".length());
lbl-1000:
        // 1 sources

        {
            if ((var1_1[var2_2] != var1_1[var2_2 + 1])) {
                return (var2_2 - var0 + 1) * ef_0.var_int_if / 2;
            }
            ++var2_2;
lbl9:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var2_2, (int)var1_1.length))
        }
lbl10:
        // 1 sources

        return 0;
    }

    private static void (String string, int n, int n2 != null) {
        if ((i_0.i_0_do().coTrangThai)) {
            var_java_util_Vector_new.addElement(new ej(string, n, n2));
        }
    }

    public static void (byte by2 != byte[] byArray) {
        soLuongKhoa = by2;
        var_ep_do = new ep(gc_0.javax_microedition_lcdui_Image_do(byArray), var_int_if * bn_0.cfr_renamed_6, bn_0.cfr_renamed_6 * var_int_if);
        ef_0.cfr_renamed_1();
        GameCanvas.cfr_renamed_6 = 0;
    }

    /*
     * Unable to fully structure code
     */
    public static DuLieuNguoiChoi dd_0_do(int var0) {
        var1_1 = 0;
        if (" ".length() != 0) ** GOTO lbl10
        return null;
lbl-1000:
        // 1 sources

        {
            var2_2 = (aG)ef_0.var_java_util_Vector_do.elementAt(var1_1);
            if ((var2_2.var_byte_if == 0) && ef_0.cfr_renamed_2(((bk_0)var2_2).cfr_renamed_12, var0)) {
                return (DuLieuNguoiChoi)var2_2;
            }
            ++var1_1;
lbl10:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_java_util_Vector_do.size()))
        }
lbl11:
        // 1 sources

        return null;
    }

    public static void void_do(int n, int n2) {
        ef_0.var_short_arr_if[n2 * ef_0.var_short_if + n] = 51;
    }

    private static int int_if(int n) {
        return n / var_short_if * var_int_if;
    }

    public static boolean boolean_if(int n) {
        if ((n >= -125) && (n < 0)) {
            return 1;
        }
        if (!((n != -1) && (n != 108) && (n != 109) && (n != 57) && (n != 62) && (n != 0) && (n != 1) && (n != 2) && (n != 3) && (n != 4) && (n != 5) && (n != 6) && (n != 7) && (n != 8) && (n != 12) && (n != 11) && (n != 14) && (n != 15) && (n != 16) && (n != 13) && (n != 25) && (n != 24) && (n != 52) && (n != 53) && (n != 9) && (n != 58) && (n != 63) && (n != 59) && (n != 64) && (n != 56) && (n != 21) && (n != 68) && (n != 69) && (n != 70) && (n != 17) && (n != 18) && (n != 51) && (n != 71) && (n != 95) && (n != 96) && (n != 107) && (n != 10) && !(n == 19))) {
            return 1;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_3() {
        try {
            block58: {
                block57: {
                    block55: {
                        block47: {
                            block54: {
                                block53: {
                                    block52: {
                                        block51: {
                                            block50: {
                                                block49: {
                                                    block48: {
                                                        ek_0.ek_0_do().cfr_renamed_1();
                                                        if ((GameCanvas.cfr_renamed_16 != 0) && !(GameCanvas.var_dL_do != ec.cfr_renamed_0()) || !(ef_0.var_java_util_Vector_do.size() > 0)) break block48;
                                                        var1_1 = 0;
                                                        if ("  ".length() >= "  ".length()) ** GOTO lbl11
                                                        return;
lbl-1000:
                                                        // 1 sources

                                                        {
                                                            ((aG)ef_0.var_java_util_Vector_do.elementAt(var1_1)).void_do();
                                                            ++var1_1;
lbl11:
                                                            // 2 sources

                                                            ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_java_util_Vector_do.size()))
                                                        }
lbl12:
                                                        // 1 sources

                                                        (ef_0.var_java_util_Vector_do != null);
                                                        }
                                                    if (!(ef_0.var_java_util_Vector_int.size() > 0)) break block49;
                                                    (ef_0.var_java_util_Vector_int != null);
                                                    var1_1 = 0;
                                                    if (-" ".length() <= 0) ** GOTO lbl29
                                                    return;
lbl-1000:
                                                    // 1 sources

                                                    {
                                                        ((aG)ef_0.var_java_util_Vector_int.elementAt(var1_1)).void_do();
                                                        ++var1_1;
lbl29:
                                                        // 2 sources

                                                        ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_java_util_Vector_int.size()))
                                                    }
                                                }
                                                if (!(ef_0.var_java_util_Vector_new.size() > 0)) break block50;
                                                var1_1 = 0;
                                                if (null == null) ** GOTO lbl39
                                                return;
lbl-1000:
                                                // 1 sources

                                                {
                                                    ((aG)ef_0.var_java_util_Vector_new.elementAt(var1_1)).void_do();
                                                    ++var1_1;
lbl39:
                                                    // 2 sources

                                                    ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_java_util_Vector_new.size()))
                                                }
                                            }
                                            var2_2 = this;
                                            if (!(var2_2.var_eq_0_arr_do != null)) break block51;
                                            var3_4 = 0;
                                            if ("  ".length() != 0) ** GOTO lbl53
                                            return;
lbl-1000:
                                            // 1 sources

                                            {
                                                var2_2.var_eq_0_arr_do[var3_4].var_int_if -= 1;
                                                if ((var2_2.var_eq_0_arr_do[var3_4].var_int_if < ek_0.ek_0_do().soLuong - 100)) {
                                                    var2_2.var_eq_0_arr_do[var3_4].var_int_if = ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte + 30 + gc_0.int_do(10) * 50;
                                                    var2_2.var_eq_0_arr_do[var3_4].soLuong = -110 - gc_0.int_do(6) * 10;
                                                }
                                                ++var3_4;
lbl53:
                                                // 2 sources

                                                ** while (!ef_0.cfr_renamed_3((int)var3_4, (int)var2_2.var_eq_0_arr_do.length))
                                            }
                                        }
                                        if (!(GameCanvas.var_int_try % 4 == 2) || !ef_0.cfr_renamed_2((int)bF.dangChayAuto) || (ef_0.soLuong == 24) && !(GameCanvas.cfr_renamed_16 == 0) || !(bF.var_byte_for == -1) || !ef_0.cfr_renamed_2((int)bF.coKichHoat) || !(gt.var_gt_do != GameCanvas.var_dL_do)) break block47;
                                        if ((ef_0.soLuong != -1) && (GameCanvas.var_dL_do != ec.var_ec_do) && !(GameCanvas.var_e_0_do != null)) break block52;
                                        if (((143 ^ 133) & ~(45 ^ 39)) > 0) {
                                            return;
                                        }
                                        break block47;
                                    }
                                    if (!(ef_0.var_aG_do == null)) break block53;
                                    var2_3 = 0;
                                    if (((89 ^ 1 ^ (226 ^ 172)) & (99 + 35 - 50 + 46 ^ 53 + 65 - 10 + 40 ^ -" ".length())) <= " ".length()) ** GOTO lbl71
                                    return;
                                    while (ef_0.cfr_renamed_2((int)ef_0.cfr_renamed_12(var2_3))) {
                                        ++var2_3;
lbl71:
                                        // 2 sources

                                        if (!(var2_3 >= ef_0.var_java_util_Vector_do.size())) continue;
                                        break block47;
                                    }
                                    break block47;
                                }
                                v0 = gc_0.int_if(ef_0.var_aG_do.cfr_renamed_3 - AngelChip.duLieuNguoiChoi.cfr_renamed_3) / ef_0.var_int_if;
                                if ((ef_0.var_aG_do.var_byte_if == 7)) {
                                    v1 = ef_0.this << 1;
                                    if (((195 ^ 170 ^ (113 ^ 73)) & (16 ^ 39 ^ (165 ^ 195) ^ -" ".length())) != 0) {
                                        return;
                                    }
                                } else {
                                    v1 = ef_0.this;
                                }
                                if (!(v0 < v1)) break block54;
                                v2 = gc_0.int_if(ef_0.var_aG_do.var_int_if - AngelChip.duLieuNguoiChoi.var_int_if) / ef_0.var_int_if;
                                if ((ef_0.var_aG_do.var_byte_if == 7)) {
                                    v3 = ef_0.this << 1;
                                    if ((65 ^ 84 ^ (120 ^ 104)) <= 0) {
                                        return;
                                    }
                                } else {
                                    v3 = ef_0.this;
                                }
                                if (!(v2 >= v3)) break block47;
                            }
                            ef_0.var_aG_do = null;
                            fe_0.duLieuNguoiChoi = null;
                        }
                        if (ef_0.cfr_renamed_15((int)eg.dangChayAuto)) {
                            ef_0.var_eg_do.cfr_renamed_0();
                        }
                        if (!ef_0.cfr_renamed_0((Object)ef_0.var_java_util_Vector_if)) break block55;
                        var1_1 = 0;
                        if (((150 ^ 144) & ~(151 ^ 145)) < (46 ^ 42)) ** GOTO lbl205
                        return;
lbl-1000:
                        // 1 sources

                        {
                            block56: {
                                var2_2 = (o_0)ef_0.var_java_util_Vector_if.elementAt(var1_1);
                                if (!(ci_0.go_0_do(var2_2.cfr_renamed_5) != null)) break block56;
                                if (!(var2_2.var_byte_if == 0)) ** GOTO lbl127
                                var3_5 = ef_0.dd_0_do(var2_2.soLuong);
                                if (ef_0.cfr_renamed_1((Object)var3_5)) {
                                    ef_0.var_java_util_Vector_if.removeElement(var2_2);
                                    if (" ".length() < 0) {
                                        return;
                                    }
                                } else {
                                    var2_2.cfr_renamed_15 = (short)var3_5.cfr_renamed_3;
                                    var2_2.var_short_if = (short)var3_5.var_int_if;
lbl127:
                                    // 2 sources

                                    if ((var2_2.cfr_renamed_12 == var2_2.cfr_renamed_2)) {
                                        var2_2.cfr_renamed_12 = (short)0;
                                        var3_6 = new d_0();
                                        new d_0().cfr_renamed_1 = var2_2.cfr_renamed_5;
                                        var3_6.soLuong = var2_2.soLuong;
                                        var3_6.var_byte_do = var2_2.var_byte_if;
                                        switch (var2_2.var_byte_do) {
                                            case 0: {
                                                var3_6.cfr_renamed_3 = var2_2.cfr_renamed_15;
                                                var3_6.var_int_if = var2_2.var_short_if;
                                                if (((37 ^ 107) & ~(79 ^ 1)) == 0) break;
                                                return;
                                            }
                                            case 1: {
                                                var4_7 = gc_0.int_do(var2_2.cfr_renamed_4);
                                                var5_8 = gc_0.int_do(360);
                                                var6_9 = var4_7 * gc_0.int_new(gc_0.int_int(var5_8)) >> 10;
                                                var4_7 = -(var4_7 * gc_0.int_for(gc_0.int_int(var5_8))) >> 10;
                                                var3_6.cfr_renamed_3 = var2_2.cfr_renamed_15;
                                                var3_6.var_int_if = var2_2.var_short_if;
                                                var3_6.var_short_do = (short)var6_9;
                                                var3_6.cfr_renamed_3 = (short)var4_7;
                                                if (((58 ^ 111) & ~(103 ^ 50)) < (150 ^ 146)) break;
                                                return;
                                            }
                                            case 2: {
                                                var3_6.cfr_renamed_3 = var2_2.cfr_renamed_15;
                                                var3_6.var_int_if = var2_2.var_short_if;
                                                if ((var2_2.var_byte_if == 0)) {
                                                    var3_6.var_short_do = var2_2.var_short_arr_if[var2_2.var_short_do];
                                                    var3_6.cfr_renamed_3 = var2_2.var_short_arr_do[var2_2.var_short_do];
                                                    if (null == null) break;
                                                    return;
                                                }
                                                var3_6.cfr_renamed_3 += var2_2.var_short_arr_if[var2_2.var_short_do];
                                                var3_6.var_int_if += var2_2.var_short_arr_do[var2_2.var_short_do];
                                            }
                                        }
                                        var2_2.cfr_renamed_3 = (short)(var2_2.cfr_renamed_3 + 1);
                                        var2_2.var_short_do = (short)(var2_2.var_short_do + 1);
                                        if ((var2_2.var_short_arr_if != null) && (var2_2.var_short_do >= var2_2.var_short_arr_if.length)) {
                                            var2_2.var_short_do = (short)0;
                                        }
                                        if ((var2_2.cfr_renamed_8 != -1) && (var2_2.cfr_renamed_3 >= var2_2.cfr_renamed_8)) {
                                            ef_0.var_java_util_Vector_if.removeElement(var2_2);
                                            }
                                        switch (var2_2.var_byte_if) {
                                            case 0: {
                                                ef_0.var_java_util_Vector_do.addElement(var3_6);
                                                ef_0.var_java_util_Vector_do = (ef_0.var_java_util_Vector_do != null);
                                                if (" ".length() > 0) break;
                                                return;
                                            }
                                            case 1: {
                                                ef_0.var_java_util_Vector_new.addElement(var3_6);
                                                ef_0.var_java_util_Vector_new = (ef_0.var_java_util_Vector_new != null);
                                                if (null == null) break;
                                                return;
                                            }
                                            case 2: {
                                                if ((ef_0.var_java_util_Vector_case == null)) {
                                                    ef_0.var_java_util_Vector_case = new Vector<E>();
                                                }
                                                ef_0.var_java_util_Vector_case.addElement(var3_6);
                                                if (" ".length() >= ((148 ^ 139) & ~(4 ^ 27))) break;
                                                return;
                                            }
                                            case 3: {
                                                if ((ef_0.var_java_util_Vector_for == null)) {
                                                    ef_0.var_java_util_Vector_for = new Vector<E>();
                                                }
                                                ef_0.var_java_util_Vector_for.addElement(var3_6);
                                            }
                                        }
                                    }
                                    var2_2.cfr_renamed_12 = (short)(var2_2.cfr_renamed_12 + 1);
                                }
                            }
                            ++var1_1;
lbl205:
                            // 2 sources

                            ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_java_util_Vector_if.size()))
                        }
                    }
                    if (!ef_0.cfr_renamed_0((Object)ef_0.var_java_util_Vector_case)) break block57;
                    var1_1 = 0;
                    if (((21 + 10 - -105 + 0 ^ 72 + 71 - 53 + 109) & (88 ^ 103 ^ (20 ^ 100) ^ -" ".length())) == 0) ** GOTO lbl215
                    return;
lbl-1000:
                    // 1 sources

                    {
                        ((d_0)ef_0.var_java_util_Vector_case.elementAt(var1_1)).void_do();
                        ++var1_1;
lbl215:
                        // 2 sources

                        ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_java_util_Vector_case.size()))
                    }
                }
                if (!ef_0.cfr_renamed_0((Object)ef_0.var_java_util_Vector_for)) break block58;
                var1_1 = 0;
                if ("  ".length() >= ((219 ^ 136 ^ (87 ^ 56)) & (144 + 30 - 124 + 139 ^ 45 + 121 - 53 + 16 ^ -" ".length()))) ** GOTO lbl225
                return;
lbl-1000:
                // 1 sources

                {
                    ((d_0)ef_0.var_java_util_Vector_for.elementAt(var1_1)).void_do();
                    ++var1_1;
lbl225:
                    // 2 sources

                    ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_java_util_Vector_for.size()))
                }
            }
            if ((ef_0.var_ep_if != null) && (ef_0.var_int_else != -1) && (AngelChip.duLieuNguoiChoi.var_int_class > 0)) {
                ef_0.var_eq_0_do.cfr_renamed_3 += 1;
                if ((ef_0.var_eq_0_do.cfr_renamed_3 >= 10)) {
                    ef_0.var_eq_0_do.cfr_renamed_3 = 0;
                }
            }
            if ((ef_0.cfr_renamed_30 += 1 >= 6)) {
                ef_0.cfr_renamed_30 = 0;
                return;
            }
        }
        catch (Exception v4) {
            }
    }

    public final void (Graphics graphics == null) {
        Graphics graphics2 = graphics;
        ef_0 ef_02 = this;
        this.cfr_renamed_17 = 0;
        ef_02.cfr_renamed_13 = 0;
        ef_02.cfr_renamed_22 = 0;
        while (!(ef_02.cfr_renamed_17 >= var_java_util_Vector_do.size()) || !(ef_02.cfr_renamed_13 >= var_java_util_Vector_new.size()) || (ef_02.cfr_renamed_22 < var_java_util_Vector_int.size())) {
            ef_02.var_aG_int = null;
            ef_02.var_aG_if = null;
            ef_02.var_aG_for = null;
            if ((ef_02.cfr_renamed_17 < var_java_util_Vector_do.size())) {
                ef_02.var_aG_for = (aG)var_java_util_Vector_do.elementAt(ef_02.cfr_renamed_17);
            }
            if ((ef_02.cfr_renamed_13 < var_java_util_Vector_new.size())) {
                ef_02.var_aG_if = (aG)var_java_util_Vector_new.elementAt(ef_02.cfr_renamed_13);
            }
            if ((ef_02.cfr_renamed_22 < var_java_util_Vector_int.size())) {
                ef_02.var_aG_int = (fa)var_java_util_Vector_int.elementAt(ef_02.cfr_renamed_22);
            }
            if (!(!ef_0.cfr_renamed_0((Object)ef_02.var_aG_for) || ef_0.cfr_renamed_0((Object)ef_02.var_aG_if) && !(ef_02.var_aG_for.var_int_if < ef_02.var_aG_if.var_int_if) || ef_0.cfr_renamed_0((Object)ef_02.var_aG_int) && !(ef_02.var_aG_for.var_int_if < ef_02.var_aG_int.var_int_if))) {
                ef_02.var_aG_for.cfr_renamed_0(graphics2);
                ef_02.cfr_renamed_17 += 1;
                if (" ".length() != 0) continue;
                return;
            }
            if (ef_0.cfr_renamed_0((Object)ef_02.var_aG_if) && (!ef_0.cfr_renamed_0((Object)ef_02.var_aG_int) || (ef_02.var_aG_if.var_int_if < ef_02.var_aG_int.var_int_if))) {
                ef_02.var_aG_if.cfr_renamed_0(graphics2);
                ef_02.cfr_renamed_13 += 1;
                if ("   ".length() != 0) continue;
                return;
            }
            if (!ef_0.cfr_renamed_0((Object)ef_02.var_aG_int)) continue;
            ef_02.var_aG_int.cfr_renamed_0(graphics2);
            ef_02.cfr_renamed_22 += 1;
            if (-" ".length() >= -" ".length()) continue;
            return;
        }
        ef_02 = graphics;
        if (!(GameCanvas.cfr_renamed_16 == 0) || (var_aG_do == null)) {
            if ("   ".length() <= " ".length()) {
                return;
            }
        } else {
            int n;
            int n2 = ef_0.var_aG_do.cfr_renamed_3 * bn_0.cfr_renamed_6;
            int n3 = ef_0.var_aG_do.var_int_if;
            if ((ef_0.var_aG_do.var_byte_if == 7)) {
                n = 10;
                if (-" ".length() == " ".length()) {
                    return;
                }
            } else {
                n = ef_0.var_aG_do.var_short_int;
            }
            ef_02.drawImage(fe_0.var_javax_microedition_lcdui_Image_if, n2, (n3 - n) * bn_0.cfr_renamed_6 - cfr_renamed_30 / 2, 3);
        }
        if ((eg.dangChayAuto)) {
            var_eg_do.cfr_renamed_0(graphics);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_4() {
        if (!ef_0.cfr_renamed_0((Object)ef_0.var_java_util_Vector_byte) || (ef_0.var_java_util_Vector_try == null)) {
            return;
        }
        var0 = 0;
        if (" ".length() != 0) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            var1_1 = (aU)ef_0.var_java_util_Vector_byte.elementAt(var0);
            var2_2 = ef_0.fi_0_do(var1_1.cfr_renamed_1);
            (var1_1 !=  (fi_0)var2_2);
            var2_2 = new aU(var1_1.cfr_renamed_12, var1_1.cfr_renamed_3 * ef_0.var_int_if, var1_1.var_int_if * ef_0.var_int_if, var1_1.var_short_do, var1_1.cfr_renamed_1);
            new aU(var1_1.cfr_renamed_12, var1_1.cfr_renamed_3 * ef_0.var_int_if, var1_1.var_int_if * ef_0.var_int_if, var1_1.var_short_do, var1_1.cfr_renamed_1).dangChayAuto = var1_1.dangChayAuto;
            ef_0.var_java_util_Vector_new.addElement(var2_2);
            ++var0;
lbl15:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var0, (int)ef_0.var_java_util_Vector_byte.size()))
        }
lbl16:
        // 1 sources

        (ef_0.var_java_util_Vector_new != null);
        }

    /*
     * Enabled aggressive block sorting
     */
    public static void (byte by2 != null) {
        int n = 0;
        while (!(n >= GameCanvas.var_java_util_Vector_if.size())) {
            ((bb_0)GameCanvas.var_java_util_Vector_if.elementAt((int)n)).dangChayAuto = 1;
            ++n;
        }
        if ((by2 != -1)) {
            er_0 er_02 = new er_0(by2, 0);
            GameCanvas.var_java_util_Vector_if.addElement(er_02);
        }
        var_byte_do = by2;
    }

    private static void void_do(int n, short[] sArray) {
        if ((n % var_short_if == 0)) {
            sArray[n] = sArray[n + 1];
            return;
        }
        sArray[n] = sArray[n - 1];
    }

    private static void cfr_renamed_15() {
        GameCanvas.hienThongBaoPopup(MenuChinhAvatar.var_java_lang_String_class, new en());
    }

        public static boolean cfr_renamed_3(int n) {
        if ((n >= -125) && (n < 0)) {
            return 1;
        }
        if (!((n != 55) && (n != 93) && (n != 78) && (n != 89) && (n != 27) && (n != 28) && (n != 29) && (n != 84) && (n != 85) && (n != 86) && (n != 83) && (n != 87) && (n != 54) && (n != 67) && (n != 81) && (n != 71) && (n != 79) && (n != 92) && (n != 52) && (n != 94) && (n != 95) && (n != 96) && (n != 97) && (n != 98) && (n != 100) && (n != 103) && (n != 101) && (n != 104) && !(n == 23))) {
            return 1;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    private static void cfr_renamed_8() {
        block3: {
            ef_0.var_java_util_Vector_else.removeAllElements();
            if (!(ef_0.var_byte_if != 0) || !(ef_0.cfr_renamed_20 != 0) || (ef_0.var_byte_do != -1)) {
                return;
            }
            if ((ef_0.soLuong != 9) && !(ef_0.soLuong == 12)) break block3;
            var0 = gc_0.int_do(GameCanvas.var_int_byte / 10);
            var1_2 = 0;
            if (" ".length() <= "  ".length()) ** GOTO lbl13
            return;
lbl-1000:
            // 1 sources

            {
                ef_0.var_java_util_Vector_else.addElement(new eq_0(gc_0.int_do(ef_0.var_short_if * ef_0.var_int_if), -(98 + gc_0.int_do(GameCanvas.var_int_long)), gc_0.int_do(4)));
                ++var1_2;
lbl13:
                // 2 sources

                ** while (!ef_0.cfr_renamed_3((int)var1_2, (int)var0))
            }
lbl14:
            // 1 sources

            return;
        }
        var0_1 = gc_0.int_do(GameCanvas.var_int_byte / 10);
        var1_3 = 0;
        if ((37 ^ 33) != "   ".length()) ** GOTO lbl24
        return;
lbl-1000:
        // 1 sources

        {
            ef_0.var_java_util_Vector_else.addElement(new eq_0(gc_0.int_do(ef_0.var_short_if * ef_0.var_int_if), -(38 + gc_0.int_do(GameCanvas.var_int_long)), gc_0.int_do(4)));
            ++var1_3;
lbl24:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var1_3, (int)var0_1))
        }
lbl25:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    private static void (aU var0 != fi_0 var1_1) {
        var2_2 = 88;
        if ((var1_1.cfr_renamed_2 == 1)) {
            var2_2 = 79;
            if (-" ".length() > ((74 ^ 94 ^ (38 ^ 4)) & (230 ^ 130 ^ (232 ^ 186) ^ -" ".length()))) {
                return;
            }
        } else if ((var1_1.cfr_renamed_2 == 2)) {
            var2_2 = 67;
        }
        var3_3 = 0;
        if (" ".length() >= ((69 ^ 18) & ~(200 ^ 159))) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            var4_4 = (eq_0)var1_1.var_java_util_Vector_do.elementAt(var3_3);
            ef_0.var_short_arr_if[(var0.var_int_if + var4_4.soLuong) * ef_0.var_short_if + (var0.cfr_renamed_3 + var4_4.var_int_if)] = var2_2;
            ++var3_3;
lbl19:
            // 2 sources

            ** while (!ef_0.cfr_renamed_3((int)var3_3, (int)var1_1.var_java_util_Vector_do.size()))
        }
lbl20:
        // 1 sources

    }

    /*
     * Enabled aggressive block sorting
     */
    private void cfr_renamed_12() {
        this.var_eq_0_arr_do = null;
        if ((var_byte_if == 1)) {
            return;
        }
        this.var_eq_0_arr_do = new eq_0[4];
        int n = 0;
        while (!(n >= this.var_eq_0_arr_do.length)) {
            int n2 = ek_0.ek_0_do().soLuong + gc_0.int_do(GameCanvas.var_int_byte / 20 + 5) * 20;
            int n3 = -110 - gc_0.int_do(3) * 10;
            this.var_eq_0_arr_do[n] = new eq_0(n2, n3);
            ++n;
        }
        gc_0.void_do();
    }

    /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_5() {
        block5: {
            if ((ef_0.var_aG_do == null)) {
                return;
            }
            var0 = 0;
            var1_1 = ef_0.var_java_util_Vector_do.size();
            var2_2 = 0;
            if (((28 ^ 9) & ~(60 ^ 41)) <= 0) ** GOTO lbl18
            return;
lbl-1000:
            // 1 sources

            {
                var3_3 = (aG)ef_0.var_java_util_Vector_do.elementAt(var2_2);
                if ((var3_3.var_byte_if != 4) && (var3_3 == ef_0.var_aG_do)) {
                    var0 = var2_2;
                    if (" ".length() >= 0) break;
                    return;
                }
                ++var2_2;
lbl18:
                // 2 sources

                ** while (!ef_0.cfr_renamed_3((int)var2_2, (int)var1_1))
            }
lbl19:
            // 2 sources

            ef_0.var_aG_do = null;
            var2_2 = var0 + 1;
            if (-" ".length() < " ".length()) ** GOTO lbl27
            return;
            while (ef_0.cfr_renamed_2((int)ef_0.cfr_renamed_12(var2_2))) {
                ++var2_2;
lbl27:
                // 2 sources

                if (!(var2_2 >= var1_1)) continue;
            }
            if (!(ef_0.var_aG_do == null)) break block5;
            var2_2 = 0;
            if (-"   ".length() < 0) ** GOTO lbl36
            return;
            while (ef_0.cfr_renamed_2((int)ef_0.cfr_renamed_12(var2_2))) {
                ++var2_2;
lbl36:
                // 2 sources

                if (!(var2_2 > var0)) continue;
            }
        }
    }

    public static void (byte by2, byte by3, int n, int n2 != null) {
        cfr_renamed_10 = n;
        var_int_int = n2;
        soLuongKhoa = -1;
        GameCanvas.cfr_renamed_5();
        if ((AngelChip.var_int_if != 9)) {
            eq.eq_do().cfr_renamed_17(9);
        }
        el_0.el_0_do().cfr_renamed_4(by2, by3);
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Vector (Vector vector != null) {
        try {
            int n = vector.size();
            int n2 = 0;
            block2: while (true) {
                if ((n2 >= n - 1)) {
                    break;
                }
                aG aG2 = (aG)vector.elementAt(n2);
                int n3 = n2 + 1;
                if ("  ".length() <= " ".length()) {
                    return null;
                }
                while (true) {
                    if ((n3 >= n)) {
                        ++n2;
                        continue block2;
                    }
                    aG aG3 = (aG)vector.elementAt(n3);
                    if ((aG2.var_int_if > aG3.var_int_if)) {
                        vector.setElementAt(aG2, n3);
                        vector.setElementAt(aG3, n2);
                        aG2 = aG3;
                    }
                    ++n3;
                }
                break;
            }
        }
        catch (Exception exception) {
            return vector;
        }
        if ("   ".length() >= 0) return vector;
        return null;
    }

    private static boolean cfr_renamed_12(int n) {
        aG aG2 = (aG)var_java_util_Vector_do.elementAt(n);
        if ((aG2.var_byte_if != 4) && (aG2 != AngelChip.duLieuNguoiChoi) && (aG2.var_byte_if != 6)) {
            int n2;
            int n3 = Math.abs(aG2.cfr_renamed_3 - ((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3) / var_int_if;
            if ((aG2.var_byte_if == 7)) {
                n2 = this << 1;
                if (-" ".length() > 0) {
                    return ((0x23 ^ 0x1B) & ~(0x38 ^ 0)) != 0;
                }
            } else {
                n2 = this;
            }
            if ((n3 < n2)) {
                int n4;
                int n5 = Math.abs(aG2.var_int_if - AngelChip.duLieuNguoiChoi.var_int_if) / var_int_if;
                if ((aG2.var_byte_if == 7)) {
                    n4 = this << 1;
                    if (-"  ".length() >= 0) {
                        return ((0xD6 ^ 0xBF ^ (7 ^ 0x7A)) & (0xFE ^ 0xB3 ^ (0xF6 ^ 0xAF) ^ -" ".length())) != 0;
                    }
                } else {
                    n4 = this;
                }
                if ((n5 < n4)) {
                    if (!(aG2.var_byte_if == 0) || ef_0.cfr_renamed_2(((DuLieuNguoiChoi)aG2).dangChayAuto ? 1 : 0)) {
                        var_aG_do = aG2;
                    }
                    if ((aG2.var_byte_if == 0) && ef_0.cfr_renamed_2(((DuLieuNguoiChoi)aG2).dangChayAuto ? 1 : 0)) {
                        fe_0.duLieuNguoiChoi = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n);
                    }
                    return 1;
                }
            }
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    private static void (int var0, byte var1_1, int var2_2 == null) {
        block18: {
            block17: {
                if ((var1_1 != 0)) {
                    return;
                }
                if (!(var0 + 1 < ef_0.var_short_arr_do.length) || !(ef_0.var_short_arr_do[var0] == ef_0.var_short_arr_do[var0 + 1])) break block17;
                var1_1 = (byte)var0;
                if (((158 ^ 198) & ~(119 ^ 47)) >= 0) ** GOTO lbl40
                return;
lbl-1000:
                // 1 sources

                {
                    if ((ef_0.var_short_arr_do[var1_1] != ef_0.var_short_arr_do[var1_1 + 1])) {
                        if ((var2_2 != 1)) {
                            v0 = MenuChinhAvatar.var_java_lang_String_short;
                            if (-(105 ^ 108) >= 0) {
                                return;
                            }
                        } else {
                            v0 = "thoat";
                        }
                        v1 = ef_0.int_do(var0) + (var1_1 - var0 + 1) * ef_0.var_int_if / 2;
                        v2 = ef_0.int_if(var0);
                        if ((ef_0.soLuongKhoa == -1)) {
                            v3 = ef_0.var_int_if / 2;
                            if (" ".length() < 0) {
                                return;
                            }
                        } else {
                            v3 = ef_0.var_int_if;
                        }
                        v4 = v2 + v3;
                        if ((var2_2 == 2)) {
                            v5 = ef_0.var_int_if / 2;
                            if (((208 ^ 134 ^ (93 ^ 67)) & (124 ^ 37 ^ (11 ^ 26) ^ -" ".length())) != 0) {
                                return;
                            }
                        } else {
                            v5 = 0;
                        }
                        (v0, v1, v4 + v5 != null);
                        return;
                    }
                    var1_1 = (byte)(var1_1 + 1);
lbl40:
                    // 2 sources

                    ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_short_arr_do.length))
                }
lbl41:
                // 1 sources

                return;
            }
            if (!(var0 + ef_0.var_short_if < ef_0.var_short_arr_do.length) || !(ef_0.var_short_arr_do[var0] == ef_0.var_short_arr_do[var0 + ef_0.var_short_if])) break block18;
            var1_1 = (byte)var0;
            if ("   ".length() > " ".length()) ** GOTO lbl61
            return;
lbl-1000:
            // 1 sources

            {
                if ((ef_0.var_short_arr_do[var1_1] != ef_0.var_short_arr_do[var1_1 + ef_0.var_short_if])) {
                    if ((var2_2 != 1)) {
                        v6 = MenuChinhAvatar.var_java_lang_String_short;
                        if (((145 ^ 172) & ~(252 ^ 193)) != 0) {
                            return;
                        }
                    } else {
                        v6 = "thoat";
                    }
                    ef_0.cfr_renamed_0(v6, ef_0.int_do(var0) + 3, ef_0.int_if(var0) + ((var1_1 - var0) / ef_0.var_short_if + 1) * ef_0.var_int_if / 2);
                    return;
                }
                var1_1 = (byte)(var1_1 + ef_0.var_short_if);
lbl61:
                // 2 sources

                ** while (!ef_0.cfr_renamed_3((int)var1_1, (int)ef_0.var_short_arr_do.length))
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void (InputStream inputStream, int n, boolean bl != null) {
        int n2;
        byte by2;
        block221: {
            by2 = 0;
            byte by3 = 0;
            byte by4 = 0;
            byte by5 = 0;
            byte by6 = 0;
            byte by7 = 0;
            byte by8 = 0;
            byte by9 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            byte by10 = 0;
            byte by11 = 0;
            byte by12 = 0;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            int n12 = 0;
            byte by13 = 0;
            byte by14 = 0;
            byte by15 = 0;
            int n13 = 0;
            byte by16 = 0;
            int n14 = 0;
            int n15 = 0;
            int n16 = 0;
            int n17 = 0;
            byte by17 = 0;
            int n18 = 0;
            byte by18 = 0;
            byte by19 = 0;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            int n23 = 0;
            int n24 = 0;
            int n25 = 0;
            var_byte_for = (byte)0;
            byte[] byArray = new byte[13];
            try {
                int n26;
                block220: {
                    if ((inputStream != null)) {
                        var_short_if = (short)(inputStream.available() / var_short_do);
                        var_short_arr_do = new short[var_short_do * var_short_if];
                    }
                    if ((bl)) {
                        var_short_arr_if = new short[var_short_do * var_short_if];
                    }
                    n26 = 0;
                    if ("   ".length() <= 0) {
                        return;
                    }
                    while (true) {
                        if ((n26 >= var_short_do * var_short_if)) {
                            if ((n - 1 == 19)) {
                                break;
                            }
                            break block220;
                        }
                        if ((inputStream != null)) {
                            ef_0.var_short_arr_do[n26] = (short)inputStream.read();
                            if ((var_short_arr_do[n26] == 255)) {
                                ef_0.var_short_arr_do[n26] = -1;
                            }
                        }
                        ++n26;
                    }
                    fe_0.var_java_util_Vector_do = new Vector();
                    n26 = 0;
                    while (true) {
                        if ((n26 >= var_short_arr_do.length)) {
                            DuLieuNguoiChoi dd_02 = new DuLieuNguoiChoi();
                            ((aG)new DuLieuNguoiChoi()).cfr_renamed_3 = ((bk_0)new DuLieuNguoiChoi()).cfr_renamed_11 = 26 * var_int_if;
                            dd_02.var_int_if = dd_02.var_int_new = 8 * var_int_if + var_int_if / 2;
                            dd_02.chuoiGiaTri = "chu hon";
                            ((bk_0)dd_02).cfr_renamed_12 = -100;
                            dd_02.cfr_renamed_1(new ef(2480));
                            ((bk_0)dd_02).cfr_renamed_3 = dd_02.var_byte_goto = bk_0.var_byte_case;
                            var_java_util_Vector_do.addElement(dd_02);
                            if (" ".length() <= -" ".length()) {
                                return;
                            }
                            break block221;
                        }
                        if ((var_short_arr_do[n26] < 32)) {
                            ef_0.var_short_arr_if[n26] = 80;
                            } else {
                            ef_0.var_short_arr_if[n26] = 88;
                        }
                        if ((var_short_arr_do[n26] == 65)) {
                            ef_0.var_short_arr_if[n26] = 10;
                            ef_0.var_short_arr_do[n26] = 1;
                            if ((n24 == 1)) {
                                ef_0.var_short_arr_do[n26] = 16;
                                ((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_11 = ef_0.int_do(n26) + var_int_if;
                                AngelChip.duLieuNguoiChoi.var_int_if = AngelChip.duLieuNguoiChoi.var_int_new = ef_0.int_if(n26) + 12;
                                ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + 12);
                            }
                            n24 = (byte)(n24 + 1);
                            if (" ".length() <= -" ".length()) {
                                return;
                            }
                        } else if ((var_short_arr_do[n26] == 27)) {
                            eq_0 eq_02 = new eq_0();
                            new eq_0().var_int_if = ef_0.int_do(n26);
                            eq_02.soLuong = ef_0.int_if(n26);
                            eq_02.var_short_if = (short)((5 - fe_0.var_java_util_Vector_do.size() % 6 << 1) + fe_0.var_java_util_Vector_do.size() / 6);
                            fe_0.var_java_util_Vector_do.addElement(eq_02);
                        }
                        ++n26;
                    }
                }
                if ((n - 1 == 107)) {
                    n26 = 0;
                    while (true) {
                        if ((n26 >= var_short_do * var_short_if)) {
                            break block221;
                        }
                        if ((var_short_arr_do[n26] == 61) && (gc_0.int_do(2) == 1)) {
                            DuLieuNguoiChoi dd_03 = new DuLieuNguoiChoi();
                            DuLieuNguoiChoi dd_04 = (DuLieuNguoiChoi)gt.cfr_renamed_0().var_java_util_Vector_do.elementAt(gc_0.int_do(gt.cfr_renamed_0().var_java_util_Vector_do.size()));
                            dd_03.var_java_util_Vector_if = dd_04.var_java_util_Vector_if;
                            ((aG)dd_03).cfr_renamed_3 = ((bk_0)dd_03).cfr_renamed_11 = ef_0.int_do(n26) + 12;
                            dd_03.var_int_if = dd_03.var_int_new = ef_0.int_if(n26) + 12;
                            ((bk_0)dd_03).cfr_renamed_4 = (byte)2;
                            dd_03.var_byte_if = (byte)9;
                            var_java_util_Vector_do.addElement(dd_03);
                        }
                        if ((var_short_arr_do[n26] == 59)) {
                            g_0 g_02 = new g_0(1084, ef_0.int_do(n26) + var_int_if, ef_0.int_if(n26));
                            var_java_util_Vector_new.addElement(g_02);
                            if ("   ".length() < 0) {
                                return;
                            }
                        } else if ((var_short_arr_do[n26] == 60)) {
                            g_0 g_03 = new g_0(1085, ef_0.int_do(n26) + var_int_if, ef_0.int_if(n26));
                            var_java_util_Vector_new.addElement(g_03);
                        }
                        ++n26;
                    }
                }
                n26 = 0;
                if (((85 + 197 - 260 + 206 ^ 19 + 85 - -36 + 52) & (0x77 ^ 0x39 ^ (0 ^ 0x6A) ^ -" ".length())) != 0) {
                    return;
                }
                while (true) {
                    block224: {
                        block222: {
                            block223: {
                                if ((n26 >= var_short_do * var_short_if)) {
                                    break;
                                }
                                if (!(var_short_arr_do[n26] != -4)) break block222;
                                if (!(var_short_arr_do[n26] == -5)) break block223;
                                ef_0.var_short_arr_if[n26] = 88;
                                break block224;
                            }
                            if (!(var_short_arr_do[n26] != -3) || !(var_short_arr_do[n26] != -6)) break block224;
                            if ((var_short_arr_do[n26] >= 120) && (var_short_arr_do[n26] <= 123)) {
                                ef_0.var_short_arr_if[n26] = 80;
                                } else if ((var_short_arr_do[n26] >= 114) && (var_short_arr_do[n26] <= 119)) {
                                ef_0.var_short_arr_if[n26] = 80;
                                } else if (!(var_short_arr_do[n26] != 67) || (var_short_arr_do[n26] == 85)) {
                                ef_0.var_short_arr_if[n26] = 92;
                                } else if ((var_short_arr_do[n26] >= 20) && (var_short_arr_do[n26] <= 23)) {
                                ef_0.var_short_arr_if[n26] = 79;
                                if (((0x4A ^ 0x62 ^ (0x17 ^ 0x25)) & (141 + 89 - 199 + 156 ^ 41 + 1 - 27 + 146 ^ -" ".length())) != 0) {
                                    return;
                                }
                            } else if ((var_short_arr_do[n26] < 7)) {
                                ef_0.var_short_arr_if[n26] = 80;
                                } else {
                                ef_0.var_short_arr_if[n26] = 88;
                            }
                            if ((var_short_arr_do[n26] >= 44) && (var_short_arr_do[n26] <= 55)) {
                                ef_0.var_short_arr_if[n26] = 80;
                            }
                            if ((var_short_arr_do[n26] == 62) && (n - 1 != 62) && (n - 1 != 101) && (n - 1 != 104) && (n - 1 != 103) && (n - 1 != 100) && (n - 1 != 101)) {
                                ef_0.var_short_arr_if[n26] = 56;
                            }
                            if ((var_short_arr_do[n26] != 111) && !(var_short_arr_do[n26] == 112)) break block224;
                        }
                        ef_0.var_short_arr_if[n26] = 80;
                    }
                    if (!(inputStream == null) || (AngelChip.var_int_if != 11)) {
                        switch (var_short_arr_do[n26]) {
                            case -1: {
                                ef_0.var_short_arr_if[n26] = 88;
                                if (-" ".length() <= 0) break;
                                return;
                            }
                            case 24: 
                            case 25: 
                            case 26: {
                                if (!(bl)) break;
                                ef_0.cfr_renamed_0(845, ef_0.int_do(n26) + 11, ef_0.int_if(n26));
                                break;
                            }
                            case 27: {
                                if (!(bl)) break;
                                ef_0.cfr_renamed_0(844, ef_0.int_do(n26) + 11, ef_0.int_if(n26) + 1);
                                if ("  ".length() != ((0xB3 ^ 0x84) & ~(0xF6 ^ 0xC1))) break;
                                return;
                            }
                            case 28: {
                                if (!(bl)) break;
                                if (ef_0.cfr_renamed_2(i_0.i_0_do().boolean_do() ? 1 : 0)) {
                                    ef_0.var_short_arr_do[n26] = 4;
                                    break;
                                }
                                ef_0.cfr_renamed_0(0, ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + var_int_if - 2);
                                if (-"  ".length() <= 0) break;
                                return;
                            }
                            case 127: {
                                if ((by17 == 0)) {
                                    ef_0.cfr_renamed_0(830, ef_0.int_do(n26) + 36, ef_0.int_if(n26) + var_int_if - 2);
                                    byte by20 = by17;
                                    by17 = (byte)(by20 + 1);
                                    (n26, by20, 2 == null);
                                }
                                (n26, 108, 96 != null);
                                break;
                            }
                            case 128: {
                                if ((by2 == 0)) {
                                    ef_0.void_if(828, n26);
                                    byte by21 = by2;
                                    by2 = (byte)(by21 + 1);
                                    (n26, by21, 2 == null);
                                }
                                (n26, 55, 5 != null);
                                ef_0.var_short_arr_do[n26] = var_short_arr_do[n26 + var_short_if];
                                if (-" ".length() != "  ".length()) break;
                                return;
                            }
                            case 129: 
                            case 160: {
                                byte by22;
                                if ((by3 == 0)) {
                                    if ((n - 1 == 17)) {
                                        ef_0.void_if(836, n26);
                                        } else {
                                        ef_0.void_if(829, n26);
                                    }
                                    byte by23 = by3;
                                    by3 = (byte)(by23 + 1);
                                    (n26, by23, 2 == null);
                                }
                                if ((var_short_arr_do[n26] == 129)) {
                                    by22 = 57;
                                    if (("   ".length() & ("   ".length() ^ -" ".length())) != 0) {
                                        return;
                                    }
                                } else {
                                    by22 = 62;
                                }
                                (n26, by22, 96 != null);
                                break;
                            }
                            case 130: 
                            case 131: 
                            case 132: 
                            case 133: 
                            case 134: 
                            case 135: 
                            case 136: 
                            case 137: 
                            case 138: {
                                int n27;
                                int n28 = n27 = var_short_arr_do[n26] - 130;
                                byte by24 = byArray[n28];
                                byArray[n28] = (byte)(by24 + 1);
                                (n26, by24, 0 == null);
                                (n26 !=  (byte)n27);
                                break;
                            }
                            case 153: {
                                if ((by16 == 0)) {
                                    byte by25 = by16;
                                    by16 = (byte)(by25 + 1);
                                    (n26, by25, 0 == null);
                                }
                                (n26 != 11);
                                break;
                            }
                            case 139: {
                                ef_0.var_short_arr_if[n26] = -1;
                                byte by26 = by15;
                                by15 = (byte)(by26 + 1);
                                (n26, by26, 0 == null);
                                if ((soLuong == -1) && (n != 21) && (var_javax_microedition_lcdui_Image_do != null)) {
                                    eg.var_eq_0_do = new eq_0(ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) - var_int_if / 2);
                                    var_eg_do.cfr_renamed_0(1);
                                }
                                ef_0.void_do(n26, var_short_arr_do);
                                if (((0xB8 ^ 0x97) & ~(0x25 ^ 0xA)) < "   ".length()) break;
                                return;
                            }
                            case 140: {
                                byte by27 = by14;
                                by14 = (byte)(by27 + 1);
                                (n26, by27, 0 == null);
                                (n26, 25, 55 != null);
                                by14 = (byte)(by14 + 1);
                                if (" ".length() > 0) break;
                                return;
                            }
                            case 141: {
                                if ((by5 == 0)) {
                                    ef_0.void_if(840, n26);
                                    byte by28 = by5;
                                    by5 = (byte)(by28 + 1);
                                    (n26, by28, 0 == null);
                                }
                                (n26, 24, 5 != null);
                                ef_0.var_short_arr_do[n26] = var_short_arr_do[n26 + var_short_if];
                                break;
                            }
                            case 142: {
                                (n26, 80, 7 != null);
                                bF.bF_do().var_eq_0_arr_do[n5] = new eq_0(n26 % var_short_if, n26 / var_short_if, 0);
                                n5 = (byte)(n5 + 1);
                                break;
                            }
                            case 143: {
                                if ((by4 == 0)) {
                                    ef_0.void_if(831, n26);
                                    byte by29 = by4;
                                    by4 = (byte)(by29 + 1);
                                    (n26, by29, 2 == null);
                                }
                                (n26, 52, 51 != null);
                                ef_0.var_short_arr_do[n26] = var_short_arr_do[n26 + var_short_if];
                                if (-"   ".length() <= 0) break;
                                return;
                            }
                            case 144: {
                                if ((by6 == 0)) {
                                    ef_0.void_if(841, n26);
                                    byte by30 = by6;
                                    by6 = (byte)(by30 + 1);
                                    (n26, by30, 2 == null);
                                }
                                (n26, 53, 5 != null);
                                if (" ".length() == " ".length()) break;
                                return;
                            }
                            case 145: {
                                byte by31 = var_byte_for;
                                var_byte_for = (byte)(by31 + 1);
                                (n26, by31, 0 == null);
                                if (!(n - 1 != 109) || (n - 1 == 57) && (soLuong == 17)) {
                                    (n26, 17, -1 != null);
                                    if (" ".length() > ((0xA9 ^ 0x8B ^ (0x42 ^ 0x65)) & (0xCB ^ 0xB1 ^ 55 + 31 - -6 + 35 ^ -" ".length()))) break;
                                    return;
                                }
                                if ((soLuong == 23)) {
                                    (n26, 23, -1 != null);
                                    break;
                                }
                                (n26, 9, -1 != null);
                                if (!(n - 1 == 100)) break;
                                ef_0.var_short_arr_do[n26] = 47;
                                if (" ".length() > 0) break;
                                return;
                            }
                            case 147: 
                            case 161: {
                                byte by32;
                                if ((by7 == 0)) {
                                    ef_0.void_if(832, n26);
                                    byte by33 = by7;
                                    by7 = (byte)(by33 + 1);
                                    (n26, by33, 2 == null);
                                }
                                if ((var_short_arr_do[n26] == 147)) {
                                    by32 = 58;
                                    if ("   ".length() >= (0x31 ^ 0x35)) {
                                        return;
                                    }
                                } else {
                                    by32 = 63;
                                }
                                (n26, by32, 96 != null);
                                break;
                            }
                            case 148: 
                            case 162: {
                                byte by34;
                                if ((by8 == 0)) {
                                    if ((n == 18)) {
                                        ef_0.cfr_renamed_0(836, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + var_int_if - 2);
                                        } else {
                                        ef_0.cfr_renamed_0(833, ef_0.int_do(n26) + 48, ef_0.int_if(n26) + var_int_if - 2);
                                    }
                                    byte by35 = by8;
                                    by8 = (byte)(by35 + 1);
                                    (n26, by35, 2 == null);
                                }
                                if ((var_short_arr_do[n26] == 148)) {
                                    by34 = 59;
                                    } else {
                                    by34 = 64;
                                }
                                (n26, by34, 96 != null);
                                break;
                            }
                            case 149: {
                                if ((by9 == 0)) {
                                    ef_0.void_if(834, n26);
                                    if (ef_0.cfr_renamed_2(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12, bF.soLuong)) {
                                        (n26, by9, 2 == null);
                                    }
                                    by9 = (byte)(by9 + 1);
                                }
                                (n26, 28, 4 != null);
                                if (-" ".length() <= 0) break;
                                return;
                            }
                            case 150: {
                                if ((n17 == 0)) {
                                    ef_0.void_if(842, n26);
                                }
                                (n26, 93, 0 != null);
                                if ((n == 26)) {
                                    ef_0.var_short_arr_do[n26] = 4;
                                }
                                n17 = (byte)(n17 + 1);
                                break;
                            }
                            case 151: {
                                if ((n18 == 0)) {
                                    ef_0.void_if(843, n26);
                                }
                                (n26, 78, 0 != null);
                                n18 = (byte)(n18 + 1);
                                if (((0x94 ^ 0x9E ^ (0xDB ^ 0x82)) & (0xA0 ^ 0xB3 ^ (0x6A ^ 0x2A) ^ -" ".length())) > -" ".length()) break;
                                return;
                            }
                            case 152: {
                                int n29;
                                if ((n3 == 0)) {
                                    ef_0.void_if(835, n26);
                                }
                                byte by36 = 81;
                                if ((n - 1 == 25)) {
                                    n29 = 55;
                                    } else {
                                    n29 = 0;
                                }
                                (n26, by36, n29 != null);
                                n3 = (byte)(n3 + 1);
                                if (((2 + 87 - -32 + 79 ^ 107 + 89 - 143 + 85) & (79 + 67 - -34 + 71 ^ 56 + 168 - 44 + 5 ^ -" ".length())) == 0) break;
                                return;
                            }
                            case 155: {
                                (n26, 80, 55 != null);
                                if (!(ee_0.cfr_renamed_12 > 0)) break;
                                (n26, 84, 112 != null);
                                ef_0.cfr_renamed_0(-5, ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + var_int_if / 2);
                                ee_0.var_eq_0_do = new eq_0(ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + var_int_if / 2);
                                if ((0xC3 ^ 0xC7) > "  ".length()) break;
                                return;
                            }
                            case 156: {
                                (n26, 80, 5 != null);
                                if (!(ea_0.var_byte_do > 0)) break;
                                (n26, 85, 5 != null);
                                ef_0.cfr_renamed_0(-6, ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + var_int_if / 2);
                                ea_0.var_eq_0_do = new eq_0(ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + var_int_if / 2);
                                break;
                            }
                            case 157: {
                                (n26, 80, 111 != null);
                                ee_0.cfr_renamed_1 = new eq_0(ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + var_int_if / 2);
                                if ("  ".length() != 0) break;
                                return;
                            }
                            case 158: {
                                (n26, 80, 5 != null);
                                if (!(gC.soLuong > 0)) break;
                                gC.var_eq_0_do = new eq_0(ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + var_int_if / 2);
                                if (" ".length() != 0) break;
                                return;
                            }
                            case 159: {
                                int n30 = 4;
                                if ((n - 1 == 25)) {
                                    n30 = 5;
                                    if ("   ".length() == 0) {
                                        return;
                                    }
                                } else if (!(n - 1 != 108) || (n - 1 == 109)) {
                                    n30 = 47;
                                    if (-" ".length() != -" ".length()) {
                                        return;
                                    }
                                } else if ((n - 1 == 13)) {
                                    n30 = 0;
                                }
                                (n26, 89, n30 != null);
                                ef_0.void_if(848, n26);
                                if (-"   ".length() <= 0) break;
                                return;
                            }
                            case 163: {
                                byte by37 = var_byte_for;
                                var_byte_for = (byte)(by37 + 1);
                                (n26, by37, 0 == null);
                                (n26, 12, -1 != null);
                                if (" ".length() > -" ".length()) break;
                                return;
                            }
                            case 164: {
                                (n26, byArray[9], 0 == null);
                                int n31 = 9;
                                byArray[n31] = (byte)(byArray[n31] + 1);
                                (n26, 13, 6 != null);
                                if (-" ".length() <= " ".length()) break;
                                return;
                            }
                            case 165: {
                                (n26, byArray[10], 0 == null);
                                (n26, 14, 0 != null);
                                int n32 = 10;
                                byArray[n32] = (byte)(byArray[n32] + 1);
                                if ("  ".length() > ((0xFC ^ 0xC2) & ~(0x11 ^ 0x2F))) break;
                                return;
                            }
                            case 166: {
                                (n26, byArray[11], 0 == null);
                                (n26, 15, 0 != null);
                                int n33 = 11;
                                byArray[n33] = (byte)(byArray[n33] + 1);
                                if (((6 ^ 0x1C ^ (0xFF ^ 0xC4)) & (0x39 ^ 0x47 ^ (0xC3 ^ 0x9C) ^ -" ".length())) == 0) break;
                                return;
                            }
                            case 167: {
                                (n26, byArray[12], 0 == null);
                                int n34 = 12;
                                byArray[n34] = (byte)(byArray[n34] + 1);
                                (n26, 16, 43 != null);
                                break;
                            }
                            case 172: {
                                (n26, 88, 96 != null);
                                if ((n14 % 3 == 0)) {
                                    ef_0.cfr_renamed_0(836, ef_0.int_do(n26) + 37, ef_0.int_if(n26) + var_int_if);
                                }
                                n14 = (byte)(n14 + 1);
                                if ("  ".length() > 0) break;
                                return;
                            }
                            case 173: {
                                (n26, 88, 96 != null);
                                if ((n15 % 4 == 0)) {
                                    ef_0.cfr_renamed_0(837, ef_0.int_do(n26) + 48, ef_0.int_if(n26) + var_int_if);
                                }
                                n15 = (byte)(n15 + 1);
                                break;
                            }
                            case 174: {
                                (n26, 88, 96 != null);
                                if ((n16 % 4 == 0)) {
                                    ef_0.cfr_renamed_0(838, ef_0.int_do(n26) + 48, ef_0.int_if(n26) + var_int_if);
                                }
                                n16 = (byte)(n16 + 1);
                                break;
                            }
                            case 175: {
                                byte by38 = by10;
                                by10 = (byte)(by38 + 1);
                                (n26, by38, 0 == null);
                                (n26, 68, 96 != null);
                                if (-" ".length() <= 0) break;
                                return;
                            }
                            case 176: {
                                byte by39 = by11;
                                by11 = (byte)(by39 + 1);
                                (n26, by39, 0 == null);
                                (n26, 69, 96 != null);
                                break;
                            }
                            case 177: {
                                byte by40 = by12;
                                by12 = (byte)(by40 + 1);
                                (n26, by40, 0 == null);
                                (n26, 70, 96 != null);
                                if ("   ".length() >= "   ".length()) break;
                                return;
                            }
                            case 178: {
                                if ((by17 == 0)) {
                                    ef_0.cfr_renamed_0(830, ef_0.int_do(n26) + var_int_if, ef_0.int_if(n26) + var_int_if - 2);
                                    byte by41 = by17;
                                    by17 = (byte)(by41 + 1);
                                    (n26, by41, 2 == null);
                                }
                                (n26, 109, 96 != null);
                                if ("  ".length() >= 0) break;
                                return;
                            }
                            case 179: {
                                if ((by12 == 0)) {
                                    byte by42 = by12;
                                    by12 = (byte)(by42 + 1);
                                    (n26, by42, 2 == null);
                                    ef_0.void_if(837, n26);
                                }
                                (n26, 18, 96 != null);
                                break;
                            }
                            case 180: {
                                byte by43 = by12;
                                by12 = (byte)(by43 + 1);
                                (n26, by43, 0 == null);
                                (n26, 17, 77 != null);
                                if (!(n - 1 == 101)) break;
                                ef_0.var_short_arr_do[n26] = 0;
                                if ("  ".length() == "  ".length()) break;
                                return;
                            }
                            case 181: {
                                if (!(n - 1 != 101) || !(n - 1 != 104) || !(n - 1 != 103) || !(n - 1 != 100) || !(n - 1 != 101)) break;
                                if ((by18 == 0)) {
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + var_int_if / 2);
                                }
                                by18 = (byte)(by18 + 1);
                                (n26, 56, 46 != null);
                                break;
                            }
                            case 182: {
                                bF.var_eq_0_int = new eq_0(ef_0.int_do(n26), ef_0.int_if(n26));
                                (n26, 80, 39 != null);
                                break;
                            }
                            case 183: {
                                bF.var_eq_0_for = new eq_0(ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 24);
                                (n26, 88, 13 != null);
                                break;
                            }
                            case 184: {
                                if ("  ".length() >= 0) break;
                                return;
                            }
                            case 185: {
                                if ((by19 == 1) && (n == 18)) {
                                    ef_0.cfr_renamed_0(975, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 24);
                                }
                                if ((n == 18)) {
                                    (n26, 71, 43 != null);
                                    if ((by19 == 2)) {
                                        ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26), ef_0.int_if(n26) + 25);
                                        if (-" ".length() >= " ".length()) {
                                            return;
                                        }
                                    }
                                } else {
                                    byte by44 = by19;
                                    by19 = (byte)(by44 + 1);
                                    (n26, by44, 0 == null);
                                    (n26, 71, 47 != null);
                                }
                                by19 = (byte)(by19 + 1);
                                break;
                            }
                            case 186: {
                                byte by45 = (byte)(n19 + 1);
                                n19 = by45;
                                if ((by45 == 3)) {
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26), ef_0.int_if(n26) + 24);
                                }
                                (n26, 94, 17 != null);
                                if (!(n19 == 2)) break;
                                ef_0.cfr_renamed_0(974, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 24);
                                break;
                            }
                            case 187: {
                                byte by46;
                                if ((n20 == 0) && ef_0.cfr_renamed_2(bF.soLuong, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
                                    var_java_util_Vector_new.addElement(new ea(-10, ef_0.int_do(n26) + 20, ef_0.int_if(n26) + 20, bF.var_javax_microedition_lcdui_Image_for.getWidth()));
                                }
                                n20 = (byte)(n20 + 1);
                                if (ef_0.cfr_renamed_2(bF.soLuong, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
                                    by46 = 95;
                                    if ("   ".length() <= ((0xFF ^ 0xA0) & ~(0x47 ^ 0x18))) {
                                        return;
                                    }
                                } else {
                                    by46 = 80;
                                }
                                (n26, by46, 4 != null);
                                break;
                            }
                            case 188: {
                                byte by47;
                                if (ef_0.cfr_renamed_2(bF.soLuong, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
                                    var_java_util_Vector_new.addElement(new ea(-10, ef_0.int_do(n26) + 20, ef_0.int_if(n26) + 20, bF.var_javax_microedition_lcdui_Image_for.getWidth()));
                                }
                                if (ef_0.cfr_renamed_2(bF.soLuong, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
                                    by47 = 96;
                                    if (-"   ".length() >= 0) {
                                        return;
                                    }
                                } else {
                                    by47 = 80;
                                }
                                (n26, by47, 4 != null);
                                if ("  ".length() <= (0x89 ^ 0x8D)) break;
                                return;
                            }
                            case 189: {
                                ((aG)bF.var_by_do).cfr_renamed_3 = ef_0.int_do(n26) + 12;
                                bF.var_by_do.var_int_if = ef_0.int_if(n26) + 12;
                                if (ef_0.cfr_renamed_2(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12, bF.soLuong)) {
                                    ef_0.var_short_arr_if[n26] = 97;
                                }
                                ef_0.var_short_arr_do[n26] = 4;
                                var_java_util_Vector_new.addElement(bF.var_by_do);
                                if (!ef_0.cfr_renamed_5(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12, bF.soLuong)) break;
                                break;
                            }
                            case 190: {
                                ef_0.var_short_arr_if[n26] = 98;
                                ef_0.var_short_arr_do[n26] = 4;
                                if ((n21 == 0)) {
                                    ef_0.cfr_renamed_0(1029, ef_0.int_do(n26) + 36, ef_0.int_if(n26) + 20);
                                    bF.var_int_goto = ef_0.int_do(n26) + 26;
                                    bF.var_int_byte = ef_0.int_if(n26) + 10;
                                    if (ef_0.cfr_renamed_2(bF.soLuong, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
                                        ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 36, ef_0.int_if(n26) + 24);
                                    }
                                }
                                n21 = (byte)(n21 + 1);
                                break;
                            }
                            case 191: {
                                ef_0.var_short_arr_if[n26] = 23;
                                if ((n - 1 == 104)) {
                                    ef_0.var_short_arr_do[n26] = 0;
                                    if ((n6 == 1)) {
                                        ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 12, ef_0.int_if(n26) + 12);
                                        if ((0xC5 ^ 0xC0 ^ " ".length()) <= 0) {
                                            return;
                                        }
                                    }
                                } else {
                                    if ((n6 % 2 == 0)) {
                                        ef_0.var_short_arr_do[n26] = 46;
                                        if (((0x4E ^ 0x74 ^ (0xA5 ^ 0xAD)) & (0x2F ^ 0x5E ^ (0x66 ^ 0x25) ^ -" ".length())) > 0) {
                                            return;
                                        }
                                    } else {
                                        ef_0.var_short_arr_do[n26] = 44;
                                    }
                                    if ((n6 == 1)) {
                                        ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 12);
                                    }
                                }
                                n6 = (byte)(n6 + 1);
                                if ("  ".length() >= 0) break;
                                return;
                            }
                            case 192: {
                                ef_0.var_short_arr_if[n26] = 99;
                                ef_0.var_short_arr_do[n26] = 4;
                                if ((n11 == 0)) {
                                    ef_0.cfr_renamed_0(1034, ef_0.int_do(n26) + 36, ef_0.int_if(n26) + 24);
                                }
                                n11 = (byte)(n11 + 1);
                                break;
                            }
                            case 193: {
                                ef_0.var_short_arr_if[n26] = 100;
                                ef_0.var_short_arr_do[n26] = 4;
                                if ((n10 == 1)) {
                                    ef_0.cfr_renamed_0(1032, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 24);
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 30);
                                }
                                n10 = (byte)(n10 + 1);
                                break;
                            }
                            case 194: {
                                ef_0.var_short_arr_if[n26] = 106;
                                ef_0.var_short_arr_do[n26] = 4;
                                if ((n12 == 0)) {
                                    ef_0.cfr_renamed_0(1030, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 24);
                                }
                                n12 = (byte)(n12 + 1);
                                if ("   ".length() > 0) break;
                                return;
                            }
                            case 195: {
                                ef_0.var_short_arr_if[n26] = 102;
                                ef_0.var_short_arr_do[n26] = 4;
                                if ((n8 == 1)) {
                                    ef_0.cfr_renamed_0(1037, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 24);
                                }
                                n8 = (byte)(n8 + 1);
                                break;
                            }
                            case 196: {
                                ef_0.var_short_arr_if[n26] = 103;
                                ef_0.var_short_arr_do[n26] = 4;
                                if ((n7 == 1)) {
                                    ef_0.cfr_renamed_0(1035, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 24);
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 30);
                                }
                                n7 = (byte)(n7 + 1);
                                if (" ".length() < "  ".length()) break;
                                return;
                            }
                            case 197: {
                                ef_0.var_short_arr_if[n26] = 104;
                                ef_0.var_short_arr_do[n26] = 4;
                                if ((n9 == 1)) {
                                    ef_0.cfr_renamed_0(1033, ef_0.int_do(n26) + 12, ef_0.int_if(n26) + 24);
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 30);
                                }
                                n9 = (byte)(n9 + 1);
                                if (-"   ".length() <= 0) break;
                                return;
                            }
                            case 198: {
                                ef_0.var_short_arr_if[n26] = 105;
                                ef_0.var_short_arr_do[n26] = 4;
                                ef_0.cfr_renamed_0(1036, ef_0.int_do(n26) + 12, ef_0.int_if(n26) + 20);
                                if (-" ".length() <= ((0xA3 ^ 0xBC) & ~(0x23 ^ 0x3C))) break;
                                return;
                            }
                            case 199: {
                                ef_0.var_short_arr_if[n26] = 101;
                                ef_0.var_short_arr_do[n26] = 4;
                                if ((n4 == 1)) {
                                    ef_0.cfr_renamed_0(1031, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 24);
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 30);
                                }
                                n4 = (byte)(n4 + 1);
                                break;
                            }
                            case 200: {
                                ef_0.var_short_arr_if[n26] = 107;
                                if ((n22 == 1)) {
                                    ef_0.cfr_renamed_0(1075, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 24);
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 30);
                                }
                                n22 = (byte)(n22 + 1);
                                ef_0.var_short_arr_do[n26] = 5;
                                if (" ".length() < "   ".length()) break;
                                return;
                            }
                            case 201: {
                                ef_0.var_short_arr_if[n26] = 19;
                                ef_0.var_short_arr_do[n26] = 5;
                                if ((n23 == 1)) {
                                    ef_0.cfr_renamed_0(1094, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 20);
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 24, ef_0.int_if(n26) + 30);
                                }
                                n23 = (byte)(n23 + 1);
                                if ("   ".length() > "  ".length()) break;
                                return;
                            }
                            case 202: {
                                (n26, 88, 96 != null);
                                if ((n25 % 4 == 0)) {
                                    ef_0.cfr_renamed_0(4, ef_0.int_do(n26) + (var_int_if << 1), ef_0.int_if(n26) + var_int_if);
                                }
                                n25 = (byte)(n25 + 1);
                                if ("   ".length() == "   ".length()) break;
                                return;
                            }
                            case 203: {
                                byte by48 = by18;
                                by18 = (byte)(by48 + 1);
                                (n26, by48, 0 == null);
                                (n26, 110, 96 != null);
                                if (" ".length() < "   ".length()) break;
                                return;
                            }
                            case 204: {
                                ef_0.var_short_arr_do[n26] = 43;
                                ef_0.var_short_arr_if[n26] = 10;
                                if ((n23 == 1)) {
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26), ef_0.int_if(n26) + 30);
                                }
                                n23 = (byte)(n23 + 1);
                                if ("  ".length() >= " ".length()) break;
                                return;
                            }
                            case 63: 
                            case 65: {
                                if (!(n - 1 != 101) || !(n - 1 != 104) || !(n - 1 != 103) || !(n - 1 != 100) || !(n - 1 != 101)) break;
                                ef_0.var_short_arr_if[n26] = 56;
                                byte by49 = by13;
                                by13 = (byte)(by49 + 1);
                                (n26, by49, 0 == null);
                                if (!(n - 1 != 57) || (n - 1 == 62)) {
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) - 12, ef_0.int_if(n26) + 12);
                                    if ("  ".length() > 0) break;
                                    return;
                                }
                                if (!(n - 1 != 58) || (n - 1 == 63)) {
                                    ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) + 12, ef_0.int_if(n26) + 36);
                                    if (-"  ".length() < 0) break;
                                    return;
                                }
                                ef_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_short, ef_0.int_do(n26) - 12, ef_0.int_if(n26) + 12);
                                if (" ".length() >= " ".length()) break;
                                return;
                            }
                            case 97: {
                                ef_0.var_short_arr_if[n26] = 54;
                                if (((8 ^ 0x1E ^ (0x6B ^ 0x23)) & (4 ^ 0x68 ^ (0x90 ^ 0xA2) ^ -" ".length())) <= " ".length()) break;
                                return;
                            }
                            case 98: {
                                ef_0.var_short_arr_if[n26] = 29;
                                ef_0.void_if(846, n26);
                                if ((n - 1 != 108) && !(n - 1 == 109)) break;
                                ef_0.var_short_arr_do[n26] = 56;
                                if (" ".length() >= 0) break;
                                return;
                            }
                            case 102: {
                                int n35;
                                ef_0.var_short_arr_if[n26] = 92;
                                a_0.var_java_util_Vector_if.addElement(new eq_0(ef_0.int_do(n26) + var_int_if / 2, ef_0.int_if(n26) + var_int_if));
                                eq_0 eq_03 = new eq_0(-20, ef_0.int_if(n26) + var_int_if);
                                int n36 = n13 % 2;
                                if ((n == 66)) {
                                    n35 = 0;
                                    } else {
                                    n35 = 1;
                                }
                                if ((n36 == n35)) {
                                    eq_03.var_int_if = (GameCanvas.var_int_byte + 20) / bn_0.cfr_renamed_6;
                                }
                                a_0.var_java_util_Vector_for.addElement(eq_03);
                                n13 = (byte)(n13 + 1);
                                if (-" ".length() == -" ".length()) break;
                                return;
                            }
                            case 110: {
                                bF.var_eq_0_do = new eq_0(ef_0.int_do(n26) - var_int_if + 8, ef_0.int_if(n26) - 2);
                                ef_0.cfr_renamed_0(847, ef_0.int_do(n26) + 11, ef_0.int_if(n26));
                                if ("   ".length() < (0x44 ^ 0x40)) break;
                                return;
                            }
                            default: {
                                by19 = 0;
                                by15 = 0;
                            }
                        }
                    }
                    ++n26;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        ef_0.void_if(n);
        (var_java_util_Vector_new != null);
        if ((soLuong == 24) && ef_0.cfr_renamed_5(bF.soLuong, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
            soLuong = 53;
        }
        if ((n2 = soLuong != -1) && (soLuongKhoa != -1)) {
            n2 = var_int_case;
        }
        if ((n - 1 != 19)) {
            void var46_61;
            int n37 = 0;
            while (!ef_0.cfr_renamed_3((int)var46_61, var_short_arr_if.length)) {
                int n38;
                void var2_4 = var46_61 / var_short_if;
                void var0_1 = var46_61 % var_short_if;
                by2 = (byte)n2;
                if ((var_short_arr_if[var2_4 * var_short_if + var0_1] == by2)) {
                    n38 = 1;
                    if ("  ".length() <= -" ".length()) {
                        return;
                    }
                } else {
                    n38 = 0;
                }
                if ((n38 != 0)) {
                    eq_0 eq_04 = ef_0.eq_0_do((int)var46_61);
                    if (!(eq_04 != null)) break;
                    ((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = eq_04.var_int_if;
                    AngelChip.duLieuNguoiChoi.var_int_if = eq_04.soLuong;
                    if (-"   ".length() <= 0) break;
                    return;
                }
                ++var46_61;
            }
        }
        if ((n == 60)) {
            ((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = 150;
            AngelChip.duLieuNguoiChoi.var_int_if = var_short_do * var_int_if - var_int_if;
        }
        if ((var_int_byte != -1)) {
            var_int_case = var_int_byte;
        }
        ek_0.ek_0_do().var_bk_0_do = AngelChip.duLieuNguoiChoi;
        ek_0.ek_0_do().void_if(n);
        if ((GameCanvas.coTrangThai)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_12();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void cfr_renamed_3(Graphics graphics) {
        if (ef_0.cfr_renamed_0((Object)var_java_util_Vector_for)) {
            int n = 0;
            while (!(n >= var_java_util_Vector_for.size())) {
                ((d_0)var_java_util_Vector_for.elementAt(n)).cfr_renamed_0(graphics);
                ++n;
            }
        }
    }

    public static boolean boolean_if(int n, int n2) {
        if (!(n = ef_0.int_if(n, n2) != 80) || (n == 51)) {
            return 1;
        }
        if (!(!(AngelChip.duLieuNguoiChoi.var_int_break == -5) || (n != 79) && (n != 81) && (n != 92) && !(n == 67))) {
            return 1;
        }
        return 0;
    }

    private static void cfr_renamed_11() {
        GameCanvas.var_java_util_Vector_if.removeAllElements();
        var_java_util_Vector_new.removeAllElements();
        var_java_util_Vector_do.removeAllElements();
        var_java_util_Vector_int.removeAllElements();
        var_java_util_Vector_case = null;
        var_java_util_Vector_for = null;
        var_java_util_Vector_if = null;
        System.gc();
    }

    public final void (Graphics graphics < 0) {
        GameCanvas.cfr_renamed_1(graphics);
        GameCanvas.cfr_renamed_1(graphics);
        graphics.translate(-ek_0.ek_0_do().soLuong, -ek_0.ek_0_do().cfr_renamed_3);
        this.cfr_renamed_0(graphics);
    }

    public static void cfr_renamed_3(DuLieuNguoiChoi bk_02) {
        var_java_util_Vector_do.removeElement(bk_02);
        bk_02 = ef_0.bq_0_do(((bk_0)bk_02).cfr_renamed_12);
        if (ef_0.cfr_renamed_0((Object)bk_02)) {
            var_java_util_Vector_do.removeElement(bk_02);
            }
    }
}

