/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.AngelChip;

/*
 * Renamed from bS
 */
public final class AutoCauCa
extends NhiemVuAutoBase {
    public static ax var_ax_do;
    private static final int[][] var_int_arr_arr_do;
    private byte[][] var_byte_arr_arr_do;
    public static byte var_byte_do;
    private int cfr_renamed_8;
    public static boolean dangChayAuto;
    public static byte var_byte_if;
    public static boolean coTrangThai;
    public static int soLuong;
    private static final int[] var_int_arr_if;
    private static AutoCauCa var_bs_0_do;
    public static byte var_byte_for;
    public static final int[] mangSoNguyen;
    public static boolean coKichHoat;
    public static int[][][][] var_int_arr_arr_arr_arr_do;
    private int cfr_renamed_13;
    public static int var_int_if;
    public long soXu;
    public static int soLuongKhoa;
    private int cfr_renamed_9;
    public long var_long_if = 0L;
    private static Vector var_java_util_Vector_do;
    private static final int[][][] var_int_arr_arr_arr_do;
    private int cfr_renamed_14;
    private int this = var_int_arr_if[0];
    public static String chuoiGiaTri;
    public int var_int_int;
    public static int cfr_renamed_4;
    public static int cfr_renamed_5;
    private static final int[][] var_int_arr_arr_if;
    private static final int[][] var_int_arr_arr_for;
    public static int cfr_renamed_6;
    public static int cfr_renamed_7;
    private int cfr_renamed_12;
    public static boolean var_boolean_int;

    private void cfr_renamed_7() {
        GameCanvas.cfr_renamed_8();
        this.var_byte_for = (byte)null;
        ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
        if ((TienIchGame.cfr_renamed_4(15000L)) && AutoCauCa.cfr_renamed_0((Object)this.var_byte_for)) {
            int n;
            this.cfr_renamed_14 = var_int_arr_if[1];
            int n2 = var_int_arr_if[1];
            int n3 = var_int_arr_if[1];
            int n4 = var_int_arr_if[1];
            short s2 = var_int_arr_if[1];
            while ((s2 < this.var_byte_for.size())) {
                cg cg2 = (cg)this.var_byte_for.elementAt(s2);
                if ((cg2 != null)) {
                    if ((cg2.var_short_do == var_int_arr_if[10])) {
                        if ((var_boolean_int)) {
                            this.cfr_renamed_14 += var_int_arr_if[4];
                            if (" ".length() <= 0) {
                                return;
                            }
                        }
                    } else if ((cg2.var_short_do == var_int_arr_if[37])) {
                        n2 = (short)(n2 + var_int_arr_if[4]);
                        } else if ((cg2.var_short_do == var_int_arr_if[35])) {
                        n3 = (short)(n3 + var_int_arr_if[4]);
                        if (-" ".length() >= (62 + 48 - 40 + 105 ^ 87 + 47 - -24 + 13)) {
                            return;
                        }
                    } else if ((cg2.var_short_do == var_int_arr_if[33])) {
                        n4 = (short)(n4 + var_int_arr_if[4]);
                    }
                }
                ++s2;
                if ("   ".length() < (0x30 ^ 0x34)) continue;
                return;
            }
            if ((n2 != null)) {
                n = var_int_arr_if[37];
                if (((0x31 ^ 0x3E ^ (0xE6 ^ 0xB6)) & (0x8F ^ 0x84 ^ (0x49 ^ 0x1D) ^ -" ".length())) != 0) {
                    return;
                }
            } else if ((n3 != null)) {
                n = var_int_arr_if[35];
                if (((0xDF ^ 0x8E) & ~(0x7C ^ 0x2D)) != 0) {
                    return;
                }
            } else if ((n4 != null)) {
                n = var_int_arr_if[33];
                if (((125 + 98 - 157 + 137 ^ 0 + 41 - 4 + 110) & (0xD5 ^ 0xA4 ^ (0xB5 ^ 0x9C) ^ -" ".length())) < 0) {
                    return;
                }
            } else {
                n = var_int_arr_if[0];
            }
            short s3 = (short)n;
            s2 = s3;
            if ((s3 != var_int_arr_if[0])) {
                int n5;
                int n6;
                block29: {
                    n2 = var_int_arr_if[1];
                    while ((n2 < AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.size())) {
                        cg cg3 = (cg)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.elementAt(n2);
                        if ((cg3 != null) && (!(cg3.var_short_do != var_int_arr_if[37]) || !(cg3.var_short_do != var_int_arr_if[35]) || (cg3.var_short_do == var_int_arr_if[33]))) {
                            n6 = cg3.var_short_do;
                            if ("  ".length() == 0) {
                                return;
                            }
                            break block29;
                        }
                        ++n2;
                        if ((70 + 124 - 167 + 125 ^ 75 + 148 - 91 + 24) > "  ".length()) continue;
                        return;
                    }
                    n6 = n5 = var_int_arr_if[0];
                }
                if (!(n6 != var_int_arr_if[0]) || (n5 < s2)) {
                    ft_0.ft_0_do().cfr_renamed_1(s2, var_int_arr_if[4]);
                    TienIchGame.cfr_renamed_7(5000L);
                    }
            }
            if ((var_boolean_int) && (cfr_renamed_4 == 0)) {
                cfr_renamed_4 = this.cfr_renamed_14;
            }
            this.var_byte_for = (byte)null;
        }
        GameCanvas.cfr_renamed_7();
    }

    public static AutoCauCa bs_0_do() {
        if ((var_bs_0_do == null)) {
            var_bs_0_do = new AutoCauCa();
        }
        return var_bs_0_do;
    }

            public final String toString() {
        return "Auto câu cá";
    }

    private static int (float f < float f2) {
        return f == f2 ? 0 : (f > f2 ? 1 : -1);
    }

            private static boolean cfr_renamed_2(int n) {
        if (!(n != var_int_arr_if[14]) || (n >= var_int_arr_if[15]) && (n <= var_int_arr_if[16])) {
            return var_int_arr_if[4];
        }
        return var_int_arr_if[1];
    }

    public static void cfr_renamed_3() {
        ax.soLuong = var_int_arr_if[1];
        new k().void_do();
    }

    private static int (float f != float f2) {
        return f == f2 ? 0 : (f < f2 ? -1 : 1);
    }

    private static int (float f == float f2) {
        return f == f2 ? 0 : (f > f2 ? 1 : -1);
    }

            private static int[] int_arr_do(int n) {
        int n2 = n >>> var_int_arr_if[41];
        int n3 = n >> var_int_arr_if[3] & var_int_arr_if[42];
        int n4 = n >> var_int_arr_if[43] & var_int_arr_if[42];
        n &= var_int_arr_if[42];
        if ((n2 == 0)) {
            n3 = var_int_arr_if[42];
            n4 = var_int_arr_if[42];
            n = var_int_arr_if[42];
        }
        int[] nArray = new int[var_int_arr_if[8]];
        nArray[AutoCauCa.var_int_arr_if[1]] = n2;
        nArray[AutoCauCa.var_int_arr_if[4]] = n3;
        nArray[AutoCauCa.var_int_arr_if[2]] = n4;
        nArray[AutoCauCa.var_int_arr_if[9]] = n;
        return nArray;
    }

    private static float (int[][] nArray < int[][][] nArray2) {
        float f = 0.0f;
        int n = var_int_arr_if[1];
        while ((n < nArray2.length)) {
            int[][] nArray3 = nArray2[n];
            int[][] nArray4 = nArray;
            float f2 = 0.0f;
            float f3 = 0.0f;
            int n2 = var_int_arr_if[1];
            while ((n2 < nArray4.length)) {
                int n3 = var_int_arr_if[1];
                while ((n3 < nArray4[n2].length)) {
                    int n4;
                    int[] nArray5;
                    int n5 = nArray3[n2][n3];
                    int[] nArray6 = AutoCauCa.int_arr_do(nArray4[n2][n3]);
                    if (AutoCauCa.cfr_renamed_2(nArray6[var_int_arr_if[4]], (nArray5 = AutoCauCa.int_arr_do(n5))[var_int_arr_if[4]]) && (nArray6[var_int_arr_if[2]] == nArray5[var_int_arr_if[2]]) && (nArray6[var_int_arr_if[9]] == nArray5[var_int_arr_if[9]])) {
                        n4 = var_int_arr_if[4];
                        } else {
                        n4 = var_int_arr_if[1];
                    }
                    if ((n4 != 0)) {
                        f2 += 1.0f;
                    }
                    f3 += 1.0f;
                    ++n3;
                    return 0.0f;
                }
                ++n2;
                if (((0xA6 ^ 0x89 ^ (0x8E ^ 0x87)) & (27 + 119 - 14 + 15 ^ 17 + 72 - -88 + 4 ^ -" ".length())) >= 0) continue;
                return 0.0f;
            }
            float f4 = f2 / f3 * 100.0f;
            if (AutoCauCa.cfr_renamed_4((f <= f4))) {
                f = f4;
            }
            if (!AutoCauCa.cfr_renamed_4((f == 97.0f))) break;
            ++n;
            if ("   ".length() != " ".length()) continue;
            return 0.0f;
        }
        return f;
    }

    public final void cfr_renamed_4() {
        int n;
        super.cfr_renamed_16();
        if ((var_byte_if == var_int_arr_if[2])) {
            n = var_int_arr_if[3];
            if ((0x83 ^ 0xBB ^ (0x5E ^ 0x62)) != (1 + 139 - -36 + 9 ^ 185 + 143 - 213 + 74)) {
                return;
            }
        } else if ((var_byte_if == var_int_arr_if[4])) {
            n = var_int_arr_if[5];
            if (-"  ".length() >= 0) {
                return;
            }
        } else {
            n = var_int_arr_if[6];
        }
        this.cfr_renamed_13 = n;
        this.cfr_renamed_8 = var_int_arr_if[1];
        this.var_byte_arr_arr_do = null;
        this.var_int_int = var_int_arr_if[1];
        this.cfr_renamed_9 = var_int_arr_if[1];
        this.cfr_renamed_12 = var_int_arr_if[1];
        this.this = var_int_arr_if[0];
        cfr_renamed_6 = var_int_arr_if[1];
        this.soXu = cfr_renamed_7 * var_int_arr_if[7];
        AutoCauCa.cfr_renamed_3();
    }

    private static void cfr_renamed_8() {
        var_int_arr_if = new int[67];
        AutoCauCa.var_int_arr_if[0] = -" ".length();
        AutoCauCa.var_int_arr_if[1] = (0xDE ^ 0x8A) & ~(0xDF ^ 0x8B);
        AutoCauCa.var_int_arr_if[2] = "  ".length();
        AutoCauCa.var_int_arr_if[3] = 0xD1 ^ 0xC1;
        AutoCauCa.var_int_arr_if[4] = " ".length();
        AutoCauCa.var_int_arr_if[5] = 0x10 ^ 0x37 ^ (0xA8 ^ 0x80);
        AutoCauCa.var_int_arr_if[6] = 0x90 ^ 0x9E;
        AutoCauCa.var_int_arr_if[7] = 0xFFFFEF69 & 0xFAF6;
        AutoCauCa.var_int_arr_if[8] = "  ".length() ^ (0x2F ^ 0x29);
        AutoCauCa.var_int_arr_if[9] = "   ".length();
        AutoCauCa.var_int_arr_if[10] = -(0xFFFFF39D & 0xD6B) & (0xFFFF9BDF & 0x6D7F);
        AutoCauCa.var_int_arr_if[11] = 0xA6 ^ 0xAF ^ (0x40 ^ 0x4C);
        AutoCauCa.var_int_arr_if[12] = 0x2D ^ 0x2A;
        AutoCauCa.var_int_arr_if[13] = 0x3D ^ 0x3B;
        AutoCauCa.var_int_arr_if[14] = -(0xFFFFD4EE & 0x7F53) & (0xFFFFD7FF & 0x7DFD);
        AutoCauCa.var_int_arr_if[15] = -(0xFFFFEFFD & 0x3A3F) & (0xFFFFFFFF & 0x2BFD);
        AutoCauCa.var_int_arr_if[16] = -(0xFFFFFE37 & 0x7FFE) & (0xFFFFFFFF & 0x7FFD);
        AutoCauCa.var_int_arr_if[17] = 0x2E ^ 0x23;
        AutoCauCa.var_int_arr_if[18] = -(0xFFFFEB57 & 0x5EFB) & (0xFFFFDE7A & 0x7735FFD7);
        AutoCauCa.var_int_arr_if[19] = 0xFFFF898E & 0x7773;
        AutoCauCa.var_int_arr_if[20] = (0x8D ^ 0xC4) + (0x15 ^ 0x4F) - (97 + 103 - 62 + 21) + (62 + 36 - 63 + 117);
        AutoCauCa.var_int_arr_if[21] = 0x1C ^ 0x15;
        AutoCauCa.var_int_arr_if[22] = 0xFFFF95DE & 0x6BED;
        AutoCauCa.var_int_arr_if[23] = 0x6D ^ 0xC;
        AutoCauCa.var_int_arr_if[24] = 0xB4 ^ 0x90;
        AutoCauCa.var_int_arr_if[25] = -(0xFFFFF06F & 0x7FBB) & (0xFFFFFF6E & 0x71FF);
        AutoCauCa.var_int_arr_if[26] = (0x63 ^ 7) + (0x67 ^ 1) - (0x42 ^ 0x22) + (0x32 ^ 1);
        AutoCauCa.var_int_arr_if[27] = 0xFFFFF9E5 & 0x7DA;
        AutoCauCa.var_int_arr_if[28] = -(0xFFFFDFE9 & 0x6417) & (0xFFFFEFEE & 0x557D);
        AutoCauCa.var_int_arr_if[29] = 62 + 1 - -40 + 26 ^ 140 + 106 - 143 + 90;
        AutoCauCa.var_int_arr_if[30] = -(0xFFFFE16F & 0x7EB5) & (0xFFFFFBEF & 0x65FE);
        AutoCauCa.var_int_arr_if[31] = -(0xFFFFAECD & 0x597F) & (0xFFFFEF5E & 0x3FFD);
        AutoCauCa.var_int_arr_if[32] = -(0xFFFFFEBD & 0x7B57) & (0xFFFFFBDF & Short.MAX_VALUE);
        AutoCauCa.var_int_arr_if[33] = 0xFFFFC7FE & 0x39BB;
        AutoCauCa.var_int_arr_if[34] = 32 + 90 - 26 + 31 ^ (0xDD ^ 0xBB);
        AutoCauCa.var_int_arr_if[35] = 0xFFFFFDBF & 0x3FD;
        AutoCauCa.var_int_arr_if[36] = 0xE8 ^ 0x8C;
        AutoCauCa.var_int_arr_if[37] = 0xFFFF89FE & 0x77BF;
        AutoCauCa.var_int_arr_if[38] = -(0xFFFFDFFF & 0x3A45) & (0xFFFF9FFF & 0x7BFF);
        AutoCauCa.var_int_arr_if[39] = -(0xFFFFBF6D & 0x7C93) & (0xFFFFFFFF & 0x3DBF);
        AutoCauCa.var_int_arr_if[40] = -(15 + 64 - -32 + 20) & (0xFFFFC9D7 & 0x37AA);
        AutoCauCa.var_int_arr_if[41] = 0x16 ^ 0x41 ^ (0x25 ^ 0x6A);
        AutoCauCa.var_int_arr_if[42] = 211 + 156 - 261 + 115 + (93 + 109 - 178 + 132) - (2 + 111 - 83 + 101) + (0x7B ^ 0x72);
        AutoCauCa.var_int_arr_if[43] = 0x92 ^ 0xB3 ^ (0x69 ^ 0x40);
        AutoCauCa.var_int_arr_if[44] = 0xC8 ^ 0xC4;
        AutoCauCa.var_int_arr_if[45] = 27 + 81 - 45 + 69 ^ 19 + 56 - -53 + 21;
        AutoCauCa.var_int_arr_if[46] = 0x58 ^ 0x6E ^ (0x97 ^ 0x9D);
        AutoCauCa.var_int_arr_if[47] = 12 + 144 - 127 + 122 ^ 42 + 105 - 98 + 108;
        AutoCauCa.var_int_arr_if[48] = -(0xFFFFBAB5 & 0x6F7E) & (0xFFFFBBFF & 0x6FB3);
        AutoCauCa.var_int_arr_if[49] = 3 + 114 - 90 + 201 ^ 94 + 139 - 183 + 137;
        AutoCauCa.var_int_arr_if[50] = 0x59 ^ 0x2E;
        AutoCauCa.var_int_arr_if[51] = (0x7D ^ 0x40) + (0xBF ^ 0xAC) - (0x95 ^ 0x9E) + (0xE1 ^ 0xAB);
        AutoCauCa.var_int_arr_if[52] = 11 + 91 - -19 + 36 + (0x35 ^ 0x48) - (184 + 43 - 163 + 160) + (0x7B ^ 0x16);
        AutoCauCa.var_int_arr_if[53] = 0x5C ^ 0x3F ^ (0x1A ^ 0x27);
        AutoCauCa.var_int_arr_if[54] = 43 + 15 - 20 + 188 ^ 158 + 38 - 99 + 68;
        AutoCauCa.var_int_arr_if[55] = 0xFFFFB3F9 & 0x4D6E;
        AutoCauCa.var_int_arr_if[56] = -(0xFFFFF7A7 & 0x3E79) & (0xFFFFB7FE & Short.MAX_VALUE);
        AutoCauCa.var_int_arr_if[57] = 0xFFFFE3EB & 0x1EFC;
        AutoCauCa.var_int_arr_if[58] = 0x62 ^ 0x69;
        AutoCauCa.var_int_arr_if[59] = 80 + 91 - 127 + 172;
        AutoCauCa.var_int_arr_if[60] = -(0xFFFFDF43 & 0x2CBE) & (0xFFFFEFFF & 0x1DAF);
        AutoCauCa.var_int_arr_if[61] = 0xFFFFC9EF & 0x37D2;
        AutoCauCa.var_int_arr_if[62] = 0xFFFFA3CB & 0x5DF7;
        AutoCauCa.var_int_arr_if[63] = -(0xFFFF96FB & 0x7D3D) & (0xFFFFDFFC & 0x35FF);
        AutoCauCa.var_int_arr_if[64] = -(0xFFFFBA37 & 0x67EB) & (0xFFFFB7E7 & 0x6BFF);
        AutoCauCa.var_int_arr_if[65] = 0xFFFFEBE6 & 0x15DF;
        AutoCauCa.var_int_arr_if[66] = -(0xFFFFEF7D & 0x7EA3) & (0xFFFFFFEF & 0x6FF7);
    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void cfr_renamed_5() {
        cR.soXu = 0L;
        var_int_arr_arr_arr_arr_do = new int[var_int_arr_if[8]][][][];
        super.cfr_renamed_5();
    }

    public static boolean boolean_do() {
        if (!(var_int_arr_arr_arr_arr_do[var_int_arr_if[1]] != null) || !(var_int_arr_arr_arr_arr_do[var_int_arr_if[4]] != null) || !(var_int_arr_arr_arr_arr_do[var_int_arr_if[2]] != null) || (var_int_arr_arr_arr_arr_do[var_int_arr_if[9]] == null)) {
            return var_int_arr_if[4];
        }
        return var_int_arr_if[1];
    }

        private static int (float f <= float f2) {
        return f == f2 ? 0 : (f < f2 ? -1 : 1);
    }

    public final void void_do(int n) {
        this.cfr_renamed_8 = n;
    }

        public static boolean boolean_do(int n) {
        Vector<Object> vector = new Vector<Object>();
        if ((chuoiGiaTri != null) && (chuoiGiaTri.length() != null)) {
            String[] stringArray = TienIchGame.java_lang_String_arr_do(chuoiGiaTri, ",");
            int n2 = var_int_arr_if[1];
            while ((n2 < stringArray.length)) {
                Object object = stringArray[n2].trim();
                if (AutoCauCa.cfr_renamed_0(((String)object).length()) && AutoCauCa.cfr_renamed_0(object = AutoCauCa.bl_0_do((String)object))) {
                    vector.addElement(object);
                }
                ++n2;
                if ("   ".length() == "   ".length()) continue;
                return ((0xBC ^ 0x9A) & ~(0x43 ^ 0x65)) != 0;
            }
        }
        if (!(vector.isEmpty())) {
            int n3 = var_int_arr_if[1];
            while ((n3 < vector.size())) {
                if (AutoCauCa.cfr_renamed_2(((bl_0)vector.elementAt((int)n3)).soLuong, n)) {
                    return var_int_arr_if[4];
                }
                ++n3;
                if ("   ".length() != -" ".length()) continue;
                return ((5 ^ 0x19) & ~(0xC ^ 0x10)) != 0;
            }
        }
        return var_int_arr_if[1];
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static bl_0 bl_0_do(String string) {
        string = string.toLowerCase().trim();
        int n = var_int_arr_if[1];
        while ((n < var_java_util_Vector_do.size())) {
            bl_0 bl_02 = (bl_0)var_java_util_Vector_do.elementAt(n);
            if ((bl_02 != null) && (!(string.indexOf(bl_02.chuoiGiaTri) == var_int_arr_if[0]) || (bl_02.chuoiGiaTri.indexOf(string) != var_int_arr_if[0]))) {
                return bl_02;
            }
            ++n;
            if (-"   ".length() < 0) continue;
            return null;
        }
        return null;
    }

        public AutoCauCa() {
        this.cfr_renamed_14 = var_int_arr_if[1];
    }

    public final void (String string < String string2) {
        if ((string.equals("admin"))) {
            if ((string2.startsWith("Bạn nhận được một kim cương xanh"))) {
                if (!(var_boolean_int)) {
                    ft_0.ft_0_do().void_do(var_int_arr_if[10], var_int_arr_if[4]);
                    return;
                }
                cfr_renamed_4 += var_int_arr_if[4];
                this.cfr_renamed_14 += var_int_arr_if[4];
            }
            return;
        }
        if ((cfr_renamed_6 != null) && (!!(string.equals("Fish")) || (string.equals("banca"))) && (string2.startsWith("Bạn vừa bán một con cá"))) {
            cfr_renamed_6 = var_int_arr_if[1];
            TienIchGame.void_if();
        }
    }

        public final void (byte[][] byArray == null) {
        this.cfr_renamed_8 = var_int_arr_if[2];
        this.var_byte_arr_arr_do = byArray;
    }

    private static void cfr_renamed_13() {
        if (!(coKichHoat) && (AutoFarm.var_byte_do == 0)) {
            AutoController.cfr_renamed_1(new hn());
            return;
        }
        AutoController.cfr_renamed_1(new AutoFarm());
    }

            /*
     * Loose catch block
     */
    static {
        block11: {
            AutoCauCa.cfr_renamed_8();
            var_int_if = var_int_arr_if[0];
            var_int_arr_arr_arr_arr_do = new int[var_int_arr_if[8]][][][];
            cfr_renamed_5 = var_int_arr_if[1];
            cfr_renamed_6 = var_int_arr_if[1];
            soLuongKhoa = var_int_arr_if[1];
            cfr_renamed_4 = var_int_arr_if[1];
            var_int_arr_arr_if = new int[var_int_arr_if[43]][var_int_arr_if[2]];
            var_int_arr_arr_do = new int[var_int_arr_if[44]][var_int_arr_if[2]];
            var_int_arr_arr_for = new int[var_int_arr_if[13]][var_int_arr_if[2]];
            var_int_arr_arr_arr_do = new int[var_int_arr_if[45]][][];
            mangSoNguyen = new int[var_int_arr_if[45]];
            var_byte_do = (byte)var_int_arr_if[1];
            var_byte_for = (byte)var_int_arr_if[1];
            var_byte_if = (byte)var_int_arr_if[1];
            dangChayAuto = var_int_arr_if[4];
            var_boolean_int = var_int_arr_if[4];
            chuoiGiaTri = "";
            coTrangThai = var_int_arr_if[4];
            cfr_renamed_7 = var_int_arr_if[46];
            soLuong = var_int_arr_if[47];
            var_java_util_Vector_do = new Vector();
            var_ax_do = null;
            coKichHoat = var_int_arr_if[4];
            int[] nArray = new int[var_int_arr_if[2]];
            nArray[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[48];
            nArray[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[49];
            AutoCauCa.var_int_arr_arr_if[AutoCauCa.var_int_arr_if[1]] = nArray;
            int[] nArray2 = new int[var_int_arr_if[2]];
            nArray2[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[48];
            nArray2[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[50];
            AutoCauCa.var_int_arr_arr_if[AutoCauCa.var_int_arr_if[4]] = nArray2;
            int[] nArray3 = new int[var_int_arr_if[2]];
            nArray3[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[48];
            nArray3[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[51];
            AutoCauCa.var_int_arr_arr_if[AutoCauCa.var_int_arr_if[2]] = nArray3;
            int[] nArray4 = new int[var_int_arr_if[2]];
            nArray4[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[48];
            nArray4[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[52];
            AutoCauCa.var_int_arr_arr_if[AutoCauCa.var_int_arr_if[9]] = nArray4;
            int[] nArray5 = new int[var_int_arr_if[2]];
            nArray5[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[53];
            nArray5[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[49];
            AutoCauCa.var_int_arr_arr_if[AutoCauCa.var_int_arr_if[8]] = nArray5;
            int[] nArray6 = new int[var_int_arr_if[2]];
            nArray6[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[53];
            nArray6[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[50];
            AutoCauCa.var_int_arr_arr_if[AutoCauCa.var_int_arr_if[11]] = nArray6;
            int[] nArray7 = new int[var_int_arr_if[2]];
            nArray7[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[53];
            nArray7[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[51];
            AutoCauCa.var_int_arr_arr_if[AutoCauCa.var_int_arr_if[13]] = nArray7;
            int[] nArray8 = new int[var_int_arr_if[2]];
            nArray8[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[53];
            nArray8[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[52];
            AutoCauCa.var_int_arr_arr_if[AutoCauCa.var_int_arr_if[12]] = nArray8;
            int[] nArray9 = new int[var_int_arr_if[2]];
            nArray9[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[53];
            nArray9[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[54];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[1]] = nArray9;
            int[] nArray10 = new int[var_int_arr_if[2]];
            nArray10[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[53];
            nArray10[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[49];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[4]] = nArray10;
            int[] nArray11 = new int[var_int_arr_if[2]];
            nArray11[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[53];
            nArray11[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[50];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[2]] = nArray11;
            int[] nArray12 = new int[var_int_arr_if[2]];
            nArray12[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[55];
            nArray12[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[54];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[9]] = nArray12;
            int[] nArray13 = new int[var_int_arr_if[2]];
            nArray13[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[55];
            nArray13[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[49];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[8]] = nArray13;
            int[] nArray14 = new int[var_int_arr_if[2]];
            nArray14[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[55];
            nArray14[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[50];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[11]] = nArray14;
            int[] nArray15 = new int[var_int_arr_if[2]];
            nArray15[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[56];
            nArray15[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[54];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[13]] = nArray15;
            int[] nArray16 = new int[var_int_arr_if[2]];
            nArray16[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[56];
            nArray16[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[49];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[12]] = nArray16;
            int[] nArray17 = new int[var_int_arr_if[2]];
            nArray17[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[56];
            nArray17[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[50];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[43]] = nArray17;
            int[] nArray18 = new int[var_int_arr_if[2]];
            nArray18[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[57];
            nArray18[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[54];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[21]] = nArray18;
            int[] nArray19 = new int[var_int_arr_if[2]];
            nArray19[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[57];
            nArray19[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[49];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[47]] = nArray19;
            int[] nArray20 = new int[var_int_arr_if[2]];
            nArray20[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[57];
            nArray20[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[50];
            AutoCauCa.var_int_arr_arr_do[AutoCauCa.var_int_arr_if[58]] = nArray20;
            int[] nArray21 = new int[var_int_arr_if[2]];
            nArray21[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[59];
            nArray21[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[49];
            AutoCauCa.var_int_arr_arr_for[AutoCauCa.var_int_arr_if[1]] = nArray21;
            int[] nArray22 = new int[var_int_arr_if[2]];
            nArray22[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[59];
            nArray22[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[50];
            AutoCauCa.var_int_arr_arr_for[AutoCauCa.var_int_arr_if[4]] = nArray22;
            int[] nArray23 = new int[var_int_arr_if[2]];
            nArray23[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[59];
            nArray23[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[51];
            AutoCauCa.var_int_arr_arr_for[AutoCauCa.var_int_arr_if[2]] = nArray23;
            int[] nArray24 = new int[var_int_arr_if[2]];
            nArray24[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[60];
            nArray24[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[49];
            AutoCauCa.var_int_arr_arr_for[AutoCauCa.var_int_arr_if[9]] = nArray24;
            int[] nArray25 = new int[var_int_arr_if[2]];
            nArray25[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[60];
            nArray25[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[50];
            AutoCauCa.var_int_arr_arr_for[AutoCauCa.var_int_arr_if[8]] = nArray25;
            int[] nArray26 = new int[var_int_arr_if[2]];
            nArray26[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[60];
            nArray26[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[51];
            AutoCauCa.var_int_arr_arr_for[AutoCauCa.var_int_arr_if[11]] = nArray26;
            AutoCauCa.var_int_arr_arr_arr_do[AutoCauCa.var_int_arr_if[6]] = var_int_arr_arr_if;
            AutoCauCa.var_int_arr_arr_arr_do[AutoCauCa.var_int_arr_if[5]] = var_int_arr_arr_do;
            AutoCauCa.var_int_arr_arr_arr_do[AutoCauCa.var_int_arr_if[3]] = var_int_arr_arr_for;
            AutoCauCa.mangSoNguyen[AutoCauCa.var_int_arr_if[11]] = var_int_arr_if[0];
            AutoCauCa.mangSoNguyen[AutoCauCa.var_int_arr_if[6]] = var_int_arr_if[0];
            AutoCauCa.mangSoNguyen[AutoCauCa.var_int_arr_if[5]] = var_int_arr_if[0];
            AutoCauCa.mangSoNguyen[AutoCauCa.var_int_arr_if[3]] = var_int_arr_if[0];
            var_java_util_Vector_do.addElement(new bl_0(var_int_arr_if[14], "cá rô"));
            var_java_util_Vector_do.addElement(new bl_0(var_int_arr_if[15], "cá lòng tong"));
            var_java_util_Vector_do.addElement(new bl_0(var_int_arr_if[61], "cá chép vàng"));
            var_java_util_Vector_do.addElement(new bl_0(var_int_arr_if[62], "cá lóc"));
            var_java_util_Vector_do.addElement(new bl_0(var_int_arr_if[63], "cá nóc"));
            var_java_util_Vector_do.addElement(new bl_0(var_int_arr_if[64], "con cua"));
            var_java_util_Vector_do.addElement(new bl_0(var_int_arr_if[65], "cá chim"));
            var_java_util_Vector_do.addElement(new bl_0(var_int_arr_if[66], "cá đuối"));
            var_java_util_Vector_do.addElement(new bl_0(var_int_arr_if[16], "cá ngựa"));
            Object object = QuanLyRMS.byte_arr_do("_fish_settings");
            if (!(object != null)) break block11;
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            var_byte_if = dataInputStream.readByte();
            var_byte_for = dataInputStream.readByte();
            dangChayAuto = dataInputStream.readBoolean();
            var_boolean_int = dataInputStream.readBoolean();
            chuoiGiaTri = dataInputStream.readUTF();
            var_byte_do = dataInputStream.readByte();
            coTrangThai = dataInputStream.readBoolean();
            cfr_renamed_7 = dataInputStream.readInt();
            soLuong = dataInputStream.readInt();
            coKichHoat = dataInputStream.readBoolean();
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
            }
            catch (IOException iOException) {
                }
            break block11;
            catch (IOException iOException) {
                QuanLyRMS.void_do("_fish_settings");
                try {
                    dataInputStream.close();
                    ((ByteArrayInputStream)object).close();
                }
                catch (IOException iOException2) {
                    }
                catch (Throwable throwable) {
                    try {
                        dataInputStream.close();
                        ((ByteArrayInputStream)object).close();
                        }
                    catch (IOException iOException3) {
                        }
                    if ("   ".length() != "   ".length()) {
                        break block11;
                    }
                    throw throwable;
                }
            }
        }
    }

    public static int[][] (byte[] object == null) {
        Image image = hg.javax_microedition_lcdui_Image_do(object);
        object = image;
        int[] nArray = new int[image.getHeight() * object.getWidth()];
        object.getRGB(nArray, var_int_arr_if[1], object.getWidth(), var_int_arr_if[1], var_int_arr_if[1], object.getWidth(), object.getHeight());
        Object object2 = new int[var_int_arr_if[40]];
        int n = object.getHeight() / var_int_arr_if[3] * object.getWidth() - object.getWidth();
        int n2 = object.getHeight() % var_int_arr_if[3];
        int n3 = object.getWidth() / var_int_arr_if[3];
        int n4 = object.getWidth() % var_int_arr_if[3];
        int n5 = var_int_arr_if[1];
        int n6 = var_int_arr_if[1];
        int n7 = var_int_arr_if[3];
        int n8 = var_int_arr_if[1];
        while ((n7 != null)) {
            int n9 = var_int_arr_if[3];
            int n10 = var_int_arr_if[1];
            while ((n9 != null)) {
                object2[n5++] = nArray[n6];
                n6 += n3;
                if ((n10 += n4 >= var_int_arr_if[3])) {
                    n10 -= var_int_arr_if[3];
                    ++n6;
                }
                --n9;
                if ("   ".length() != (4 ^ 0x5C ^ (0x47 ^ 0x1B))) continue;
                return null;
            }
            n6 += n;
            if ((n8 += n2 >= var_int_arr_if[3])) {
                n8 -= var_int_arr_if[3];
                n6 += object.getWidth();
            }
            --n7;
            return null;
        }
        Image image2 = Image.createRGBImage((int[])object2, (int)var_int_arr_if[3], (int)var_int_arr_if[3], (boolean)var_int_arr_if[4]);
        object = image2;
        n3 = image2.getWidth();
        n4 = object.getHeight();
        nArray = new int[n3 * n4];
        object2 = new int[n4][n3];
        object.getRGB(nArray, var_int_arr_if[1], n3, var_int_arr_if[1], var_int_arr_if[1], n3, n4);
        n = var_int_arr_if[1];
        while ((n < n4)) {
            n2 = var_int_arr_if[1];
            while ((n2 < n3)) {
                object2[n][n2] = nArray[n3 * n + n2];
                ++n2;
                if (((0x86 ^ 0x8A) & ~(0xD ^ 1)) >= 0) continue;
                return null;
            }
            ++n;
            if ("   ".length() > -" ".length()) continue;
            return null;
        }
        return object2;
    }

    private short short_do() {
        this.var_byte_for = (byte)null;
        ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
        if ((TienIchGame.cfr_renamed_4(15000L)) && AutoCauCa.cfr_renamed_0((Object)this.var_byte_for)) {
            int n = var_int_arr_if[1];
            int n2 = var_int_arr_if[1];
            int n3 = var_int_arr_if[1];
            int n4 = var_int_arr_if[1];
            while ((n4 < this.var_byte_for.size())) {
                cg cg2 = (cg)this.var_byte_for.elementAt(n4);
                if ((cg2 != null)) {
                    if ((cg2.var_short_do == var_int_arr_if[37])) {
                        n = (short)(n + var_int_arr_if[4]);
                        if (-" ".length() == " ".length()) {
                            return (short)((0x12 ^ 0xD ^ (0xC ^ 0xA)) & (0x3C ^ 0x59 ^ (6 ^ 0x7A) ^ -" ".length()));
                        }
                    } else if ((cg2.var_short_do == var_int_arr_if[35])) {
                        n2 = (short)(n2 + var_int_arr_if[4]);
                        if (-" ".length() > ((0xA0 ^ 0xB3) & ~(0xAD ^ 0xBE))) {
                            return (short)((0xC8 ^ 0xA9) & ~(0x2B ^ 0x4A));
                        }
                    } else if ((cg2.var_short_do == var_int_arr_if[33])) {
                        n3 = (short)(n3 + var_int_arr_if[4]);
                    }
                }
                ++n4;
                if (-"  ".length() <= 0) continue;
                return (short)((0x5F ^ 0x48 ^ (0x3B ^ 0x7F)) & (0x9F ^ 0x8D ^ (0xFD ^ 0xBC) ^ -" ".length()));
            }
            this.var_byte_for = (byte)null;
            if ((n != null)) {
                return var_int_arr_if[37];
            }
            if ((var_byte_do == var_int_arr_if[4])) {
                return var_int_arr_if[1];
            }
            if ((n2 != null)) {
                return var_int_arr_if[35];
            }
            if ((var_byte_do == var_int_arr_if[2])) {
                return var_int_arr_if[1];
            }
            if ((n3 != null)) {
                return var_int_arr_if[33];
            }
            return var_int_arr_if[1];
        }
        return var_int_arr_if[0];
    }

    public static void cfr_renamed_6() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeByte(var_byte_if);
        dataOutputStream.writeByte(var_byte_for);
        dataOutputStream.writeBoolean(dangChayAuto);
        dataOutputStream.writeBoolean(var_boolean_int);
        dataOutputStream.writeUTF(chuoiGiaTri);
        dataOutputStream.writeByte(var_byte_do);
        dataOutputStream.writeBoolean(coTrangThai);
        dataOutputStream.writeInt(cfr_renamed_7);
        dataOutputStream.writeInt(soLuong);
        dataOutputStream.writeBoolean(coKichHoat);
        dataOutputStream.flush();
        byteArrayOutputStream.flush();
        QuanLyRMS.docDuLieu("_fish_settings", byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.close();
        dataOutputStream.close();
    }

        private void cfr_renamed_9() {
        if (AutoCauCa.cfr_renamed_5(ae.ae_do().boolean_do() ? 1 : 0)) {
            return;
        }
        switch (this.cfr_renamed_8) {
            case 1: {
                this.cfr_renamed_8 = var_int_arr_if[1];
                this.var_int_int = (int)System.currentTimeMillis();
                if ((var_boolean_int) && (this.cfr_renamed_14 >= soLuong)) {
                    this.cfr_renamed_14 = var_int_arr_if[1];
                    u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
                    TienIchGame.void_if(1000L);
                    AutoController.cfr_renamed_1(new c());
                    return;
                }
                if ((coTrangThai) && AutoCauCa.cfr_renamed_0((System.currentTimeMillis() < this.var_long_if))) {
                    this.var_long_if = System.currentTimeMillis() + this.soXu;
                    u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
                    TienIchGame.void_if(1000L);
                    AutoCauCa.cfr_renamed_13();
                    return;
                }
                u_0.cfr_renamed_1().void_do(var_int_arr_if[1], var_int_arr_if[1]);
                return;
            }
            case 2: {
                this.cfr_renamed_8 = var_int_arr_if[1];
                this.var_int_int = (int)System.currentTimeMillis();
                if ((this.var_byte_arr_arr_do != null)) {
                    int n = var_int_arr_if[1];
                    while ((n < this.var_byte_arr_arr_do.length)) {
                        long l = System.currentTimeMillis();
                        int[][] nArray = (this.var_byte_arr_arr_do[n] == null);
                        int n2 = var_int_arr_if[0];
                        int[] nArray2 = new int[var_int_arr_if[8]];
                        nArray2[AutoCauCa.var_int_arr_if[1]] = var_int_arr_if[4];
                        nArray2[AutoCauCa.var_int_arr_if[4]] = var_int_arr_if[2];
                        nArray2[AutoCauCa.var_int_arr_if[2]] = var_int_arr_if[9];
                        nArray2[AutoCauCa.var_int_arr_if[9]] = var_int_arr_if[8];
                        int[] nArray3 = nArray2;
                        float[] fArray = new float[var_int_arr_if[8]];
                        fArray[AutoCauCa.var_int_arr_if[1]] = (nArray < var_int_arr_arr_arr_arr_do[var_int_arr_if[1]]);
                        if (AutoCauCa.cfr_renamed_3((fArray[AutoCauCa.var_int_arr_if[1]] < 97.0f))) {
                            n2 = var_int_arr_if[1];
                            if (-"  ".length() >= 0) {
                                return;
                            }
                        } else {
                            fArray[AutoCauCa.var_int_arr_if[4]] = (nArray < var_int_arr_arr_arr_arr_do[var_int_arr_if[4]]);
                            if (AutoCauCa.cfr_renamed_3((fArray[AutoCauCa.var_int_arr_if[4]] < 97.0f))) {
                                n2 = var_int_arr_if[4];
                                if (((0xF4 ^ 0x93 ^ (0x6E ^ 0x27)) & (0x53 ^ 0x5C ^ (0x7A ^ 0x5B) ^ -" ".length())) != 0) {
                                    return;
                                }
                            } else {
                                fArray[AutoCauCa.var_int_arr_if[2]] = (nArray < var_int_arr_arr_arr_arr_do[var_int_arr_if[2]]);
                                if (AutoCauCa.cfr_renamed_3((fArray[AutoCauCa.var_int_arr_if[2]] < 97.0f))) {
                                    n2 = var_int_arr_if[2];
                                    if ("   ".length() < ((26 + 7 - -81 + 22 ^ 81 + 152 - 105 + 51) & (0x4C ^ 0x20 ^ (0xDA ^ 0x8D) ^ -" ".length()))) {
                                        return;
                                    }
                                } else {
                                    fArray[AutoCauCa.var_int_arr_if[9]] = (nArray < var_int_arr_arr_arr_arr_do[var_int_arr_if[9]]);
                                    if (AutoCauCa.cfr_renamed_3((fArray[AutoCauCa.var_int_arr_if[9]] < 97.0f))) {
                                        n2 = var_int_arr_if[9];
                                    }
                                }
                            }
                        }
                        if ((n2 < 0)) {
                            n2 = var_int_arr_if[1];
                            float f = fArray[var_int_arr_if[1]];
                            int n3 = var_int_arr_if[4];
                            while ((n3 < fArray.length)) {
                                if (AutoCauCa.cfr_renamed_4((f != fArray[n3]))) {
                                    f = fArray[n3];
                                    n2 = n3;
                                }
                                ++n3;
                                if (" ".length() > 0) continue;
                                return;
                            }
                        }
                        int n4 = nArray3[n2];
                        long l2 = System.currentTimeMillis() - l;
                        if (AutoCauCa.cfr_renamed_4((l2 < 100L))) {
                            TienIchGame.void_if(100L - l2);
                        }
                        int n5 = n4;
                        u_0 u_02 = u_0.cfr_renamed_1();
                        if ((u_02.var_es_0_do.coKichHoat) && !(u_02.var_es_0_do.coTrangThai)) {
                            u_02.soXu = System.currentTimeMillis();
                            if ((u_02.soLuong < u_02.var_byte_arr_do.length)) {
                                u_02.var_byte_arr_do[u_02.soLuong] = (byte)n5;
                            }
                            u_02.soLuong += var_int_arr_if[4];
                            if ((AngelChip.duLieuNguoiChoi.var_short_for != var_int_arr_if[2])) {
                                u_02.var_es_0_do.void_do(var_int_arr_if[1]);
                                u_02.var_int_if = var_int_arr_if[2];
                            }
                            if ((u_02.soLuong >= u_02.var_byte_arr_do.length)) {
                                u_02.var_es_0_do.void_do(var_int_arr_if[1]);
                                u_02.var_es_0_do.coTrangThai = var_int_arr_if[4];
                                fn.fn_do().cfr_renamed_1(u_02.var_byte_arr_do);
                                GameCanvas.cfr_renamed_8();
                            }
                        }
                        ++n;
                        if (" ".length() > 0) continue;
                        return;
                    }
                    this.var_byte_arr_arr_do = null;
                }
                return;
            }
            case 3: {
                this.cfr_renamed_8 = var_int_arr_if[1];
                this.var_int_int = (int)System.currentTimeMillis();
                fn.fn_do().void_do();
                return;
            }
        }
        if (AutoCauCa.cfr_renamed_0((System.currentTimeMillis() - this.var_int_int < 30000L))) {
            if ((GameCanvas.var_en_do instanceof u_0 != 0)) {
                u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
                TienIchGame.void_if(1000L);
            }
            this.cfr_renamed_8 = var_int_arr_if[1];
            this.var_byte_arr_arr_do = null;
            this.cfr_renamed_12 -= this.this;
            this.var_int_int = var_int_arr_if[2];
        }
    }

    public final synchronized void d_() {
        long l;
        if (AutoCauCa.cfr_renamed_0((System.currentTimeMillis() - this.var_int_int != 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if ((k.dangChayAuto)) {
            if ((GameCanvas.var_dj_0_do == null)) {
                GameCanvas.cfr_renamed_2("Đang tải dữ liệu...");
            }
            return;
        }
        if ((AutoCauCa.boolean_do())) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if (!(this.cfr_renamed_13 >= var_int_arr_if[6]) || (this.cfr_renamed_13 > var_int_arr_if[3])) {
            AutoController.tatAuto();
            GameCanvas.hienThongBaoPopup("Lỗi chọn map câu cá!");
            System.out.println("Lỗi chọn map câu cá!");
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((GameCanvas.var_en_do instanceof ep != 0) && (this.var_int_int != var_int_arr_if[9])) {
            ep.cfr_renamed_1().cfr_renamed_3();
            return;
        }
        if ((GameCanvas.var_en_do instanceof gO != 0) && AutoCauCa.cfr_renamed_4(AutoCauCa.cfr_renamed_0(l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4, 2000L))) {
            TienIchGame.void_if(2000L - l);
        }
        if ((var_byte_for == var_int_arr_if[4]) && (fh.var_int_char == var_int_arr_if[17]) && (cfr_renamed_6 != null)) {
            TienIchGame.void_if(1000L);
            var_ax_do = null;
            if ((var_int_if >= var_int_arr_if[18])) {
                new ej(var_int_arr_if[4], var_int_if, var_int_arr_if[1]).void_do();
                if ("   ".length() < 0) {
                    return;
                }
            } else {
                fn.fn_do().cfr_renamed_0("banca");
            }
            if ((TienIchGame.cfr_renamed_6(15000L))) {
                if ((var_ax_do != null)) {
                    var_ax_do.cfr_renamed_0();
                    if (-(0xD ^ 9) >= 0) {
                        return;
                    }
                } else {
                    cfr_renamed_6 = var_int_arr_if[1];
                }
                TienIchGame.void_if(1000L);
            }
            return;
        }
        switch (this.var_int_int) {
            case 1: {
                int n;
                if ((GameCanvas.var_en_do instanceof al_0 != 0)) {
                    fh.cfr_renamed_9 = var_int_arr_if[19];
                    fh.var_int_try = var_int_arr_if[20];
                    al_0.cfr_renamed_1().void_do(var_int_arr_if[4], var_int_arr_if[0]);
                    if ((TienIchGame.boolean_do(15000L))) {
                        TienIchGame.void_if(3500L);
                    }
                    return;
                }
                if ((fh.var_int_char == this.cfr_renamed_13)) {
                    this.var_int_int = var_int_arr_if[2];
                    return;
                }
                if ((fh.var_int_char != var_int_arr_if[0]) && !(TienIchGame.cfr_renamed_0(fh.var_int_char))) {
                    go_0.go_0_do().cfr_renamed_11();
                    TienIchGame.void_if(2000L);
                    return;
                }
                if ((fh.var_int_char == var_int_arr_if[0])) {
                    gO.cfr_renamed_1().soLuong = var_int_arr_if[4];
                    ft_0.ft_0_do().cfr_renamed_12(var_int_arr_if[21]);
                    if ((TienIchGame.boolean_do(15000L))) {
                        TienIchGame.void_if(3500L);
                    }
                    return;
                }
                if ((mangSoNguyen[this.cfr_renamed_13] != null)) {
                    n = TienIchGame.int_do(var_int_arr_if[1], mangSoNguyen[this.cfr_renamed_13]);
                    if (" ".length() < 0) {
                        return;
                    }
                } else {
                    n = var_int_arr_if[0];
                }
                int n2 = n;
                switch (this.cfr_renamed_13) {
                    case 14: {
                        fh.cfr_renamed_9 = var_int_arr_if[22];
                        fh.var_int_try = var_int_arr_if[23];
                        if ((133 + 132 - 123 + 50 ^ 74 + 190 - 210 + 143) != 0) break;
                        return;
                    }
                    case 15: {
                        fh.cfr_renamed_9 = var_int_arr_if[24];
                        fh.var_int_try = var_int_arr_if[23];
                        if (((7 ^ 0x69 ^ (0x17 ^ 0x4D)) & (0x52 ^ 0x68 ^ (0x4D ^ 0x43) ^ -" ".length())) <= 0) break;
                        return;
                    }
                    case 16: {
                        fh.cfr_renamed_9 = var_int_arr_if[25];
                        fh.var_int_try = var_int_arr_if[26];
                    }
                }
                fn.fn_do().cfr_renamed_3(this.cfr_renamed_13, n2);
                if ((TienIchGame.boolean_do(15000L))) {
                    if ((fh.var_int_char == this.cfr_renamed_13)) {
                        TienIchGame.void_if(1000L);
                        return;
                    }
                    TienIchGame.void_if(3500L);
                }
                return;
            }
            case 2: {
                if ((GameCanvas.var_en_do instanceof al_0 != 0)) {
                    fh.cfr_renamed_9 = var_int_arr_if[19];
                    fh.var_int_try = var_int_arr_if[20];
                    al_0.cfr_renamed_1().void_do(var_int_arr_if[4], var_int_arr_if[0]);
                    if ((TienIchGame.boolean_do(15000L))) {
                        TienIchGame.void_if(3500L);
                    }
                    return;
                }
                if ((fh.var_int_char != this.cfr_renamed_13)) {
                    this.var_int_int = var_int_arr_if[4];
                    return;
                }
                if (!(this.cfr_renamed_12 < var_int_arr_arr_arr_do[this.cfr_renamed_13].length) || (this.cfr_renamed_12 < 0)) {
                    int n;
                    int n3;
                    if ((this.cfr_renamed_12 >= var_int_arr_arr_arr_do[this.cfr_renamed_13].length)) {
                        this.cfr_renamed_12 = var_int_arr_arr_arr_do[this.cfr_renamed_13].length - var_int_arr_if[4];
                        this.this = var_int_arr_if[4];
                        if (((133 + 104 - 223 + 138 ^ 113 + 7 - -24 + 17) & (19 + 108 - 107 + 142 ^ 151 + 140 - 271 + 135 ^ -" ".length())) >= "   ".length()) {
                            return;
                        }
                    } else {
                        this.cfr_renamed_12 = var_int_arr_if[1];
                        this.this = var_int_arr_if[0];
                    }
                    if ((mangSoNguyen[this.cfr_renamed_13] != null)) {
                        n3 = TienIchGame.int_do(var_int_arr_if[1], mangSoNguyen[this.cfr_renamed_13]);
                        if (-(0x26 ^ 0x23) >= 0) {
                            return;
                        }
                    } else {
                        n3 = n = var_int_arr_if[0];
                    }
                    if ((n3 != null) && (go_0.var_byte_do == n)) {
                        return;
                    }
                    fn.fn_do().cfr_renamed_3(this.cfr_renamed_13, n);
                    if ((TienIchGame.boolean_do(15000L))) {
                        if ((fh.var_int_char == this.cfr_renamed_13)) {
                            TienIchGame.void_if(1000L);
                            return;
                        }
                        TienIchGame.void_if(3500L);
                    }
                    return;
                }
                AngelChip.duLieuNguoiChoi.void_do(var_int_arr_arr_arr_do[this.cfr_renamed_13][this.cfr_renamed_12][var_int_arr_if[1]], var_int_arr_arr_arr_do[this.cfr_renamed_13][this.cfr_renamed_12][var_int_arr_if[4]]);
                if (!(fh.boolean_if(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0))) {
                    this.cfr_renamed_12 -= this.this;
                    return;
                }
                if ((TienIchGame.boolean_if())) {
                    TienIchGame.void_if(1000L);
                    return;
                }
                this.cfr_renamed_12 -= this.this;
                return;
            }
            case 3: {
                if ((fh.var_int_char != this.cfr_renamed_13)) {
                    this.cfr_renamed_8 = var_int_arr_if[1];
                    this.var_byte_arr_arr_do = null;
                    this.var_int_int = var_int_arr_if[4];
                    return;
                }
                this.cfr_renamed_9();
                return;
            }
            case 4: {
                if ((var_boolean_int) && (this.cfr_renamed_14 >= soLuong)) {
                    this.cfr_renamed_14 = var_int_arr_if[1];
                    if ((GameCanvas.var_en_do instanceof u_0 != 0)) {
                        u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
                    }
                    TienIchGame.void_if(1000L);
                    AutoController.cfr_renamed_1(new c());
                    return;
                }
                if ((coTrangThai) && AutoCauCa.cfr_renamed_0((System.currentTimeMillis() != this.var_long_if))) {
                    this.var_long_if = System.currentTimeMillis() + this.soXu;
                    if ((GameCanvas.var_en_do instanceof u_0 != 0)) {
                        u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
                    }
                    TienIchGame.void_if(1000L);
                    AutoCauCa.cfr_renamed_13();
                    return;
                }
                if ((fh.var_int_char == var_int_arr_if[17])) {
                    ep_0.ep_0_do().void_do(var_int_arr_if[27], var_int_arr_if[4]);
                    TienIchGame.cfr_renamed_5(2000L);
                    return;
                }
                if ((TienIchGame.cfr_renamed_0(fh.var_int_char))) {
                    fh.cfr_renamed_9 = var_int_arr_if[28];
                    fh.var_int_try = var_int_arr_if[29];
                    fn.fn_do().cfr_renamed_3(var_int_arr_if[17], var_int_arr_if[0]);
                    if ((TienIchGame.boolean_do(15000L))) {
                        TienIchGame.void_if(1000L);
                    }
                    return;
                }
                if ((TienIchGame.cfr_renamed_1(var_int_arr_if[17]))) {
                    TienIchGame.void_if(1000L);
                }
                return;
            }
            case 5: {
                if ((fh.var_int_char == var_int_arr_if[17])) {
                    switch (this.cfr_renamed_13) {
                        case 14: {
                            ep_0.ep_0_do().void_do(var_int_arr_if[30], var_int_arr_if[4]);
                            if ("   ".length() >= "  ".length()) break;
                            return;
                        }
                        case 15: {
                            if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[1]] < var_int_arr_if[31])) {
                                AutoController.tatAuto();
                                TienIchGame.dangXuatTaiKhoan();
                                GameCanvas.hienThongBaoPopup("Không đủ xu mua vé câu cá lóc");
                                return;
                            }
                            ep_0.ep_0_do().void_do(var_int_arr_if[32], var_int_arr_if[4]);
                            if (null == null) break;
                            return;
                        }
                        case 16: {
                            if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[2]] < var_int_arr_if[2]) && (AngelChip.duLieuNguoiChoi.soLuong < var_int_arr_if[2])) {
                                AutoController.tatAuto();
                                TienIchGame.dangXuatTaiKhoan();
                                GameCanvas.hienThongBaoPopup("Không đủ lượng mua vé câu cá mập");
                                return;
                            }
                            ep_0.ep_0_do().void_do(var_int_arr_if[22], var_int_arr_if[2]);
                        }
                    }
                    if ((TienIchGame.cfr_renamed_5(15000L))) {
                        TienIchGame.void_if(500L);
                    }
                    if ((this.var_int_int != var_int_arr_if[13])) {
                        this.var_int_int = var_int_arr_if[4];
                    }
                    return;
                }
                if ((TienIchGame.cfr_renamed_0(fh.var_int_char))) {
                    fh.cfr_renamed_9 = var_int_arr_if[28];
                    fh.var_int_try = var_int_arr_if[29];
                    fn.fn_do().cfr_renamed_3(var_int_arr_if[17], var_int_arr_if[0]);
                    if ((TienIchGame.boolean_do(15000L))) {
                        TienIchGame.void_if(1000L);
                    }
                    return;
                }
                if ((TienIchGame.cfr_renamed_1(var_int_arr_if[17]))) {
                    TienIchGame.void_if(1000L);
                }
                return;
            }
            case 7: {
                short s2 = this.short_do();
                if ((s2 == var_int_arr_if[0])) {
                    TienIchGame.void_if("Lỗi tải dữ liệu túi đồ!");
                    TienIchGame.void_if(1000L);
                    return;
                }
                if (AutoCauCa.cfr_renamed_6s2 == null) {
                    ft_0.ft_0_do().cfr_renamed_1(s2, var_int_arr_if[4]);
                    TienIchGame.cfr_renamed_7(5000L);
                    this.var_int_int = var_int_arr_if[4];
                    return;
                }
                if ((var_byte_do == 0)) {
                    AutoController.tatAuto();
                    TienIchGame.dangXuatTaiKhoan();
                    GameCanvas.hienThongBaoPopup("Bạn không có cần câu và không bật auto mua cần câu!");
                    return;
                }
                if ((fh.var_int_char == var_int_arr_if[17])) {
                    if ((var_byte_do == var_int_arr_if[9])) {
                        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[1]] < var_int_arr_if[31])) {
                            AutoController.tatAuto();
                            TienIchGame.dangXuatTaiKhoan();
                            GameCanvas.hienThongBaoPopup("Không đủ xu mua cần câu Tre");
                            return;
                        }
                        ep_0.ep_0_do().void_do(var_int_arr_if[33], var_int_arr_if[4]);
                        if ((0x4E ^ 0x4A) <= "  ".length()) {
                            return;
                        }
                    } else if ((var_byte_do == var_int_arr_if[2])) {
                        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[2]] < var_int_arr_if[34]) && (AngelChip.duLieuNguoiChoi.soLuong < var_int_arr_if[34])) {
                            AutoController.tatAuto();
                            TienIchGame.dangXuatTaiKhoan();
                            GameCanvas.hienThongBaoPopup("Không đủ lượng mua cần câu Sắt");
                            return;
                        }
                        ep_0.ep_0_do().void_do(var_int_arr_if[35], var_int_arr_if[2]);
                        if ((4 + 86 - -5 + 35 ^ 97 + 36 - 109 + 110) == 0) {
                            return;
                        }
                    } else if ((var_byte_do == var_int_arr_if[4])) {
                        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[2]] < var_int_arr_if[36]) && (AngelChip.duLieuNguoiChoi.soLuong < var_int_arr_if[36])) {
                            AutoController.tatAuto();
                            TienIchGame.dangXuatTaiKhoan();
                            GameCanvas.hienThongBaoPopup("Không đủ lượng mua cần câu VIP");
                            return;
                        }
                        ep_0.ep_0_do().void_do(var_int_arr_if[37], var_int_arr_if[2]);
                        if ((0x28 ^ 0x4B ^ (0x4F ^ 0x28)) != (66 + 39 - 60 + 88 ^ 114 + 31 - 109 + 93)) {
                            return;
                        }
                    } else {
                        AutoController.tatAuto();
                        TienIchGame.dangXuatTaiKhoan();
                        GameCanvas.hienThongBaoPopup("Lỗi mua cần câu!");
                        return;
                    }
                    if ((TienIchGame.cfr_renamed_5(15000L))) {
                        TienIchGame.void_if(500L);
                    }
                    if ((this.var_int_int != var_int_arr_if[13])) {
                        this.var_int_int = var_int_arr_if[4];
                    }
                    return;
                }
                if ((TienIchGame.cfr_renamed_0(fh.var_int_char))) {
                    fh.cfr_renamed_9 = var_int_arr_if[28];
                    fh.var_int_try = var_int_arr_if[29];
                    fn.fn_do().cfr_renamed_3(var_int_arr_if[17], var_int_arr_if[0]);
                    if ((TienIchGame.boolean_do(15000L))) {
                        TienIchGame.void_if(1000L);
                    }
                    return;
                }
                if ((TienIchGame.cfr_renamed_1(var_int_arr_if[17]))) {
                    TienIchGame.void_if(1000L);
                }
                return;
            }
            case 6: {
                this.var_byte_for = (byte)null;
                ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
                if ((TienIchGame.cfr_renamed_4(15000L))) {
                    if (!AutoCauCa.cfr_renamed_0((Object)this.var_byte_for) || (this.var_byte_for.isEmpty())) {
                        TienIchGame.void_if("Lỗi tải dữ liệu túi đồ!");
                        System.out.println("Lỗi tải dữ liệu túi đồ!");
                        TienIchGame.void_if(1000L);
                        return;
                    }
                    this.cfr_renamed_14 = var_int_arr_if[1];
                    int n = var_int_arr_if[1];
                    int n4 = var_int_arr_if[1];
                    int n5 = var_int_arr_if[1];
                    while ((n5 < this.var_byte_for.size())) {
                        cg cg2 = (cg)this.var_byte_for.elementAt(n5);
                        if ((cg2 != null)) {
                            if (!(cg2.var_short_do != var_int_arr_if[38]) || !(cg2.var_short_do != var_int_arr_if[39]) || (cg2.var_short_do == var_int_arr_if[27])) {
                                if ((cg2.var_short_do == var_int_arr_if[27])) {
                                    ++n4;
                                    if ((27 + 58 - -55 + 27 ^ 65 + 153 - 115 + 60) <= " ".length()) {
                                        return;
                                    }
                                } else {
                                    ++n;
                                    ft_0.ft_0_do().void_do((int)cg2.var_short_do, var_int_arr_if[4]);
                                    TienIchGame.void_if(50L);
                                    if ("   ".length() < -" ".length()) {
                                        return;
                                    }
                                }
                            } else if ((cg2.var_short_do == var_int_arr_if[10])) {
                                if (!(var_boolean_int)) {
                                    ++n;
                                    ft_0.ft_0_do().void_do(var_int_arr_if[10], var_int_arr_if[4]);
                                    TienIchGame.void_if(50L);
                                    if ((0x1B ^ 0x1F) == 0) {
                                        return;
                                    }
                                } else {
                                    this.cfr_renamed_14 += var_int_arr_if[4];
                                    if (((0x7F ^ 0x3E) & ~(0x1A ^ 0x5B)) != 0) {
                                        return;
                                    }
                                }
                            } else if ((var_byte_for == var_int_arr_if[2]) && (AutoCauCa.cfr_renamed_2(cg2.var_short_do)) && AutoCauCa.cfr_renamed_5(AutoCauCa.boolean_do((int)cg2.var_short_do) ? 1 : 0)) {
                                ++n;
                                ft_0.ft_0_do().void_do((int)cg2.var_short_do, var_int_arr_if[4]);
                                TienIchGame.void_if(50L);
                            }
                        }
                        ++n5;
                        if (((0xAB ^ 0x8D ^ (0x5B ^ 0x56)) & (24 + 154 - 137 + 193 ^ 46 + 56 - -42 + 49 ^ -" ".length())) >= ((0xE2 ^ 0xA7 ^ (0x79 ^ 0x2F)) & (0x21 ^ 0x1F ^ (0x93 ^ 0xBE) ^ -" ".length()))) continue;
                        return;
                    }
                    if ((var_boolean_int) && (this.cfr_renamed_14 >= soLuong)) {
                        this.var_int_int = this.cfr_renamed_9;
                        this.var_byte_for = (byte)null;
                        this.cfr_renamed_9 = var_int_arr_if[1];
                        this.cfr_renamed_14 = var_int_arr_if[1];
                        AutoController.cfr_renamed_1(new c());
                        return;
                    }
                    if ((n <= 0) && (n4 > var_int_arr_if[4])) {
                        --n4;
                        n = var_int_arr_if[4];
                    }
                    if ((n <= 0)) {
                        AutoController.tatAuto();
                        TienIchGame.dangXuatTaiKhoan();
                        GameCanvas.hienThongBaoPopup("Rương đồ đã đầy. Không thể câu cá!");
                        return;
                    }
                    ft_0.ft_0_do().void_do(var_int_arr_if[27], var_int_arr_if[4]);
                    switch (this.cfr_renamed_9) {
                        case 4: {
                            this.var_int_int = var_int_arr_if[4];
                            if (((0x15 ^ 6 ^ (0x32 ^ 1)) & (71 + 63 - 105 + 153 ^ 21 + 35 - -51 + 43 ^ -" ".length())) <= " ".length()) break;
                            return;
                        }
                        case 3: {
                            this.var_int_int = var_int_arr_if[2];
                            if (" ".length() < "  ".length()) break;
                            return;
                        }
                        case 5: 
                        case 7: {
                            if ((n < var_int_arr_if[2]) && (n4 > var_int_arr_if[4])) {
                                ++n;
                            }
                            if ((n < var_int_arr_if[2])) {
                                AutoController.tatAuto();
                                TienIchGame.dangXuatTaiKhoan();
                                GameCanvas.hienThongBaoPopup("Rương đồ đã đầy. Không thể mua cần!");
                                return;
                            }
                            TienIchGame.void_if(50L);
                            ft_0.ft_0_do().void_do(var_int_arr_if[27], var_int_arr_if[4]);
                        }
                        default: {
                            this.var_int_int = this.cfr_renamed_9;
                        }
                    }
                    this.var_byte_for = (byte)null;
                    this.cfr_renamed_9 = var_int_arr_if[1];
                }
                return;
            }
        }
        if ((coTrangThai) && AutoCauCa.cfr_renamed_0((System.currentTimeMillis() != this.var_long_if))) {
            this.var_long_if = System.currentTimeMillis() + this.soXu;
            if ((GameCanvas.var_en_do instanceof u_0 != 0)) {
                u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
            }
            TienIchGame.void_if(1000L);
            AutoCauCa.cfr_renamed_13();
            return;
        }
        if ((fh.var_int_char != this.cfr_renamed_13)) {
            if ((fh.var_int_char == var_int_arr_if[0])) {
                if ((TienIchGame.cfr_renamed_1(var_int_arr_if[17]))) {
                    TienIchGame.void_if(3000L);
                }
                return;
            }
            this.cfr_renamed_7();
            if ((var_boolean_int) && (this.cfr_renamed_14 >= soLuong)) {
                this.cfr_renamed_14 = var_int_arr_if[1];
                this.var_int_int = var_int_arr_if[8];
                AutoController.cfr_renamed_1(new c());
                return;
            }
            this.var_int_int = var_int_arr_if[4];
            return;
        }
        if ((GameCanvas.var_en_do instanceof u_0 != 0)) {
            u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
            TienIchGame.void_if(1000L);
        }
        this.cfr_renamed_7();
        this.var_int_int = var_int_arr_if[2];
    }

    private static boolean (short s2 == null) {
        if (!(s2 != var_int_arr_if[33]) || !(s2 != var_int_arr_if[35]) || (s2 == var_int_arr_if[37])) {
            return var_int_arr_if[4];
        }
        return var_int_arr_if[1];
    }

    public final boolean boolean_do(String string) {
        if ((string.startsWith("Bạn vừa bán"))) {
            cfr_renamed_6 = var_int_arr_if[1];
            TienIchGame.void_if();
            return var_int_arr_if[4];
        }
        if ((string.startsWith("Bạn không còn cá để bán"))) {
            cfr_renamed_6 = var_int_arr_if[1];
            TienIchGame.void_if();
            return var_int_arr_if[4];
        }
        if ((string.startsWith("Mã pin"))) {
            TienIchGame.void_if();
            if ((ax.var_byte_do == 0)) {
                return var_int_arr_if[4];
            }
            return var_int_arr_if[1];
        }
        if ((string.startsWith("Bạn đã mua vật phẩm thành công"))) {
            if (!(this.var_int_int != var_int_arr_if[8]) || !(this.var_int_int != var_int_arr_if[11]) || (this.var_int_int == var_int_arr_if[12])) {
                TienIchGame.cfr_renamed_6();
                return var_int_arr_if[4];
            }
            return var_int_arr_if[1];
        }
        if ((string.startsWith("Bạn không thể ngồi ở đây"))) {
            this.var_int_int = var_int_arr_if[2];
            this.cfr_renamed_12 -= this.this;
            u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
            TienIchGame.cfr_renamed_14();
            return var_int_arr_if[4];
        }
        if (!(string.indexOf("cần sử dụng cần câu") == var_int_arr_if[0]) || (string.indexOf("phải có cần") != var_int_arr_if[0])) {
            this.var_int_int = var_int_arr_if[12];
            u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
            TienIchGame.cfr_renamed_14();
            return var_int_arr_if[4];
        }
        if (!(string.indexOf("cần vé câu") == var_int_arr_if[0]) || (string.indexOf("phải có vé") != var_int_arr_if[0])) {
            if (!(dangChayAuto)) {
                AutoController.tatAuto();
                TienIchGame.dangXuatTaiKhoan();
                GameCanvas.hienThongBaoPopup(string + "\nBạn không bật auto mua vé câu!");
                return var_int_arr_if[4];
            }
            int n = this.var_int_int;
            this.var_int_int = var_int_arr_if[11];
            if ((n == var_int_arr_if[2])) {
                u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
                TienIchGame.cfr_renamed_14();
                } else if ((n == var_int_arr_if[4])) {
                TienIchGame.cfr_renamed_7();
            }
            return var_int_arr_if[4];
        }
        if (!(string.indexOf("cần sử dụng mồi câu") == var_int_arr_if[0]) || (string.indexOf("phải có mồi") != var_int_arr_if[0])) {
            this.var_int_int = var_int_arr_if[8];
            u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
            TienIchGame.void_if("Em đi mua mồi câu");
            TienIchGame.cfr_renamed_14();
            return var_int_arr_if[4];
        }
        if ((string.startsWith("Rương đã đầy"))) {
            this.cfr_renamed_9 = this.var_int_int;
            this.var_int_int = var_int_arr_if[13];
            if (!(this.cfr_renamed_9 != var_int_arr_if[8]) || !(this.cfr_renamed_9 != var_int_arr_if[11]) || (this.cfr_renamed_9 == var_int_arr_if[12])) {
                TienIchGame.cfr_renamed_6();
            }
            return var_int_arr_if[4];
        }
        if ((!!(string.startsWith("Bạn cần ít nhất")) || (string.startsWith("Bạn phải còn dư ít nhất"))) && (string.indexOf("trong rương") != var_int_arr_if[0]) && (string.indexOf("câu cá") != var_int_arr_if[0])) {
            this.cfr_renamed_9 = this.var_int_int;
            this.var_int_int = var_int_arr_if[13];
            u_0.cfr_renamed_1().void_do(var_int_arr_if[2], var_int_arr_if[1]);
            TienIchGame.cfr_renamed_14();
            return var_int_arr_if[4];
        }
        return super.boolean_do(string);
    }

    }

