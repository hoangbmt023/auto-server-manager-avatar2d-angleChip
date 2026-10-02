/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 *  javax.microedition.rms.RecordStore
 */
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import main.AngelChip;

public final class hg {
    public static String chuoiGiaTri;
    public static Random var_java_util_Random_do;
    private static int[] mangSoNguyen;
    private static int[] var_int_arr_if;
    private static short[] var_short_arr_do;
    private static short[] var_short_arr_if;

    public static InputStream java_io_InputStream_do(String string) {
        return "".getClass().getResourceAsStream(string);
    }

    /*
     * Unable to fully structure code
     */
    public static void void_do() {
        ThongTinNhanVat.soLuongKhoa = 1;
        var0 = 0;
        if (-" ".length() <= 0) ** GOTO lbl10
        return;
lbl-1000:
        // 1 sources

        {
            var1_1 = (fl_0)dR.dR_do().var_java_util_Vector_if.elementAt(var0);
            ThongTinNhanVat.soLuongKhoa += var1_1.chuoiGiaTri.hashCode();
            ++var0;
lbl10:
            // 2 sources

            ** while (!hg.boolean_if((int)var0, (int)dR.dR_do().var_java_util_Vector_if.size()))
        }
lbl11:
        // 1 sources

        ThongTinNhanVat.cfr_renamed_1().cfr_renamed_13();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static byte[] byte_arr_do(byte[] byArray) {
        if (hg.cfr_renamed_1((Object)byArray)) {
            int n = 0;
            while (!hg.boolean_if(n, byArray.length)) {
                byArray[n] = (byte)(byArray[n] ^ -1);
                ++n;
            }
        }
        return byArray;
    }

    public static int int_do(int n) {
        if ((n >= 0)) {
            return n;
        }
        return -n;
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    static {
        hg.cfr_renamed_3();
        var_java_util_Random_do = new Random();
        short[] sArray = new short[91];
        sArray[1] = 18;
        sArray[2] = 36;
        sArray[3] = 54;
        sArray[4] = 71;
        sArray[5] = 89;
        sArray[6] = 107;
        sArray[7] = 125;
        sArray[8] = 143;
        sArray[9] = 160;
        sArray[10] = 178;
        sArray[11] = 195;
        sArray[12] = 213;
        sArray[13] = 230;
        sArray[14] = 248;
        sArray[15] = 265;
        sArray[16] = 282;
        sArray[17] = 299;
        sArray[18] = 316;
        sArray[19] = 333;
        sArray[20] = 350;
        sArray[21] = 367;
        sArray[22] = 384;
        sArray[23] = 400;
        sArray[24] = 416;
        sArray[25] = 433;
        sArray[26] = 449;
        sArray[27] = 465;
        sArray[28] = 481;
        sArray[29] = 496;
        sArray[30] = 512;
        sArray[31] = 527;
        sArray[32] = 543;
        sArray[33] = 558;
        sArray[34] = 573;
        sArray[35] = 587;
        sArray[36] = 602;
        sArray[37] = 616;
        sArray[38] = 630;
        sArray[39] = 644;
        sArray[40] = 658;
        sArray[41] = 672;
        sArray[42] = 685;
        sArray[43] = 698;
        sArray[44] = 711;
        sArray[45] = 724;
        sArray[46] = 737;
        sArray[47] = 749;
        sArray[48] = 761;
        sArray[49] = 773;
        sArray[50] = 784;
        sArray[51] = 796;
        sArray[52] = 807;
        sArray[53] = 818;
        sArray[54] = 828;
        sArray[55] = 839;
        sArray[56] = 849;
        sArray[57] = 859;
        sArray[58] = 868;
        sArray[59] = 878;
        sArray[60] = 887;
        sArray[61] = 896;
        sArray[62] = 904;
        sArray[63] = 912;
        sArray[64] = 920;
        sArray[65] = 928;
        sArray[66] = 935;
        sArray[67] = 943;
        sArray[68] = 949;
        sArray[69] = 956;
        sArray[70] = 962;
        sArray[71] = 968;
        sArray[72] = 974;
        sArray[73] = 979;
        sArray[74] = 984;
        sArray[75] = 989;
        sArray[76] = 994;
        sArray[77] = 998;
        sArray[78] = 1002;
        sArray[79] = 1005;
        sArray[80] = 1008;
        sArray[81] = 1011;
        sArray[82] = 1014;
        sArray[83] = 1016;
        sArray[84] = 1018;
        sArray[85] = 1020;
        sArray[86] = 1022;
        sArray[87] = 1023;
        sArray[88] = 1023;
        sArray[89] = 1024;
        sArray[90] = 1024;
        var_short_arr_do = sArray;
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

    public static Image (int n, int n2, int n3, int n4, Image image != null) {
        int[] nArray = new int[n3 * n4];
        image.getRGB(nArray, 0, n3, n, n2, n3, n4);
        return Image.createRGBImage((int[])nArray, (int)n3, (int)n4, (boolean)1);
    }

    public static byte[] byte_arr_do(String string) {
        byte[] byArray;
        try {
            string = RecordStore.openRecordStore((String)("2.5.8" + string), (boolean)0);
            byArray = string.getRecord(1);
            string.closeRecordStore();
            }
        catch (Exception exception) {
            return null;
        }
        return hg.byte_arr_do(byArray);
    }

    /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_0() {
        hg.var_short_arr_if = new short[91];
        hg.var_int_arr_if = new int[91];
        var0 = 0;
        if (-"  ".length() <= 0) ** GOTO lbl18
        return;
lbl-1000:
        // 1 sources

        {
            hg.var_short_arr_if[var0] = hg.var_short_arr_do[90 - var0];
            if (hg.boolean_new(hg.var_short_arr_if[var0])) {
                hg.var_int_arr_if[var0] = 2147483647;
                if (" ".length() == "  ".length()) {
                    return;
                }
            } else {
                hg.var_int_arr_if[var0] = (hg.var_short_arr_do[var0] << 10) / hg.var_short_arr_if[var0];
            }
            ++var0;
lbl18:
            // 2 sources

            ** while (!hg.cfr_renamed_3((int)var0, (int)90))
        }
lbl19:
        // 1 sources

    }

    public static Image (byte[] byArray, byte[] byArray2 != null) {
        byte[] byArray3 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        byArray = byArray3;
        return Image.createImage((byte[])byArray3, (int)0, (int)byArray.length);
    }

    public static void (String string, byte[] byArray != null) {
        byArray = hg.byte_arr_do(byArray);
        if (hg.boolean_do((string = RecordStore.openRecordStore((String)("2.5.8" + string), (boolean)1)).getNumRecords())) {
            string.setRecord(1, byArray, 0, byArray.length);
            } else {
            string.addRecord(byArray, 0, byArray.length);
            }
        string.closeRecordStore();
    }

    private static boolean boolean_for(int n) {
        return n < 0;
    }

    public static int int_do() {
        return var_java_util_Random_do.nextInt() % 2;
    }

    private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

        public static final int int_if(int n) {
        if ((n = hg.int_for(n) >= 0) && (n < 90)) {
            return var_short_arr_do[n];
        }
        if (hg.boolean_if(n, 90) && (n < 180)) {
            return var_short_arr_do[180 - n];
        }
        if (hg.boolean_if(n, 180) && (n < 270)) {
            return -var_short_arr_do[n - 180];
        }
        return -var_short_arr_do[360 - n];
    }

    private static boolean boolean_int(int n) {
        return n <= 0;
    }

    public static final int int_for(int n) {
        if (hg.boolean_if(n, 360)) {
            n -= 360;
        }
        if (hg.boolean_for(n)) {
            n += 360;
        }
        return n;
    }

        private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

        public static void cfr_renamed_2() {
        AngelChip.tenNhanVat = hg.java_lang_String_do(v_0.chuoiGiaTri);
        fo.chuoiGiaTri = hg.java_lang_String_do(AngelChip.chuoiGiaTri);
        go_0.chuoiGiaTri = hg.java_lang_String_do(chuoiGiaTri);
    }

    private static boolean boolean_new(int n) {
        return n == 0;
    }

    public static final int int_int(int n) {
        if ((n = hg.int_for(n) >= 0) && (n < 90)) {
            return var_short_arr_if[n];
        }
        if (hg.boolean_if(n, 90) && (n < 180)) {
            return -var_short_arr_if[180 - n];
        }
        if (hg.boolean_if(n, 180) && (n < 270)) {
            return -var_short_arr_if[n - 180];
        }
        return var_short_arr_if[360 - n];
    }

    /*
     * Unable to fully structure code
     */
    public static final int int_do(int var0, int var1_1) {
        block11: {
            block12: {
                block10: {
                    block9: {
                        if (!hg.boolean_if(var0)) break block10;
                        var2_2 = Math.abs((var1_1 << 10) / var0);
                        var3_3 = 0;
                        if ("  ".length() > 0) ** GOTO lbl16
                        return (138 ^ 156) & ~(83 ^ 69);
lbl-1000:
                        // 1 sources

                        {
                            if (hg.boolean_if(hg.var_int_arr_if[var3_3], var2_2)) {
                                v0 = var3_3;
                                if ((31 ^ 121 ^ (215 ^ 181)) > (108 ^ 33 ^ (245 ^ 188))) {
                                    return (79 ^ 50 ^ (48 ^ 112)) & (113 ^ 82 ^ (12 ^ 18) ^ -" ".length());
                                }
                                break block9;
                            }
                            ++var3_3;
lbl16:
                            // 2 sources

                            ** while (!hg.cfr_renamed_3((int)var3_3, (int)90))
                        }
lbl17:
                        // 1 sources

                        v0 = var2_2 = 0;
                    }
                    if ((var1_1 >= 0) && hg.boolean_for(var0)) {
                        var2_2 = 180 - var2_2;
                    }
                    if (hg.boolean_for(var1_1) && hg.boolean_for(var0)) {
                        var2_2 += 180;
                    }
                    if (!hg.boolean_for(var1_1) || !(var0 >= 0)) break block11;
                    v1 = 360 - var2_2;
                    if (-(51 ^ 55) >= 0) {
                        return (82 ^ 85) & ~(71 ^ 64);
                    }
                    break block12;
                }
                if (hg.boolean_do(var1_1)) {
                    v1 = 90;
                    } else {
                    v1 = 270;
                }
            }
            var2_2 = v1;
        }
        return var2_2;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[181];
        91 = 0xE2 ^ 0xB9;
        1 = " ".length();
        18 = 0xDC ^ 0xAA ^ (0x5D ^ 0x39);
        2 = "  ".length();
        36 = " ".length() ^ (0x86 ^ 0xA3);
        3 = "   ".length();
        54 = 0 ^ 0x36;
        4 = 0x82 ^ 0x92 ^ (0x51 ^ 0x45);
        71 = 162 + 210 - 235 + 93 ^ 81 + 134 - 88 + 34;
        5 = 0x4A ^ 0x4F;
        89 = 0x2B ^ 0x72;
        6 = 122 + 155 - 217 + 103 ^ 49 + 117 - 153 + 152;
        107 = 51 + 71 - -93 + 15 ^ 62 + 84 - 49 + 44;
        7 = 0x2F ^ 5 ^ (0x52 ^ 0x7F);
        125 = 0x4F ^ 0x32;
        8 = 0x6E ^ 0x66;
        143 = 73 + 109 - 135 + 96;
        9 = 0xA ^ 3;
        160 = (0x27 ^ 0x61) + (0xBE ^ 0xB6) - -(0x1C ^ 0x20) + (0x15 ^ 3);
        10 = 0xB5 ^ 0xBF;
        178 = 30 + 91 - 86 + 143;
        11 = 0x27 ^ 0x2C;
        195 = (0x77 ^ 0x4B) + (10 + 105 - 1 + 44) - (135 + 39 - 147 + 111) + (0xE2 ^ 0x91);
        12 = 0x74 ^ 0x78;
        213 = (0x90 ^ 0x9E) + (8 ^ 0x42) - -(5 ^ 0x69) + (0x59 ^ 0x48);
        13 = 66 + 20 - 54 + 103 ^ 136 + 72 - 142 + 72;
        230 = 193 + 200 - 203 + 40;
        14 = 0x41 ^ 0x29 ^ (0xC5 ^ 0xA3);
        248 = 168 + 89 - 100 + 91;
        15 = 0x28 ^ 0xF ^ (0x12 ^ 0x3A);
        265 = 0xFFFF879B & 0x796D;
        16 = 0x23 ^ 0x33;
        282 = 0xFFFF9F1A & 0x61FF;
        17 = 0x4F ^ 0x5E;
        299 = -(0xFFFFFA1D & 0x57F7) & (0xFFFFD3BF & 0x7F7F);
        316 = -(0xFFFFEFDF & 0x3664) & (0xFFFFB7FF & 0x6F7F);
        19 = 0x14 ^ 7;
        333 = 0xFFFFD35F & 0x2DED;
        20 = 0x49 ^ 0xA ^ (0x72 ^ 0x25);
        350 = -(0xFFFFFDCB & 0x7635) & (0xFFFFF77E & 0x7DDF);
        21 = 0x2B ^ 0x44 ^ (0x49 ^ 0x33);
        367 = 0xFFFFC36F & 0x3DFF;
        22 = 0x17 ^ 0x39 ^ (0x2C ^ 0x14);
        384 = 0xFFFFC9B6 & 0x37C9;
        23 = 0x2F ^ 0x51 ^ (0xC3 ^ 0xAA);
        400 = -(0xFFFFEF4C & 0x7CF7) & (0xFFFFEDD3 & Short.MAX_VALUE);
        24 = 0xAF ^ 0xB7;
        416 = -(0xFFFFDDDA & 0x2E67) & (0xFFFFBDF9 & 0x4FE7);
        25 = 0x45 ^ 0x5C;
        433 = 0xFFFFEFB1 & 0x11FF;
        26 = 0xA6 ^ 0xBC;
        449 = -(0xFFFFE95F & 0x76BF) & (0xFFFFEBFF & 0x75DF);
        27 = 0x98 ^ 0x83;
        465 = 0xFFFFE1D3 & 0x1FFD;
        28 = 0x98 ^ 0x84;
        481 = 0xFFFFABFB & 0x55E5;
        29 = 0xA8 ^ 0xB5;
        496 = -(0xFFFF9E4F & 0x6FBC) & (0xFFFFEFFB & 0x1FFF);
        30 = 8 ^ 0x34 ^ (0x97 ^ 0xB5);
        512 = 0xFFFFD751 & 0x2AAE;
        31 = 0xBC ^ 0xA3;
        527 = -(0xFFFFEDFF & 0x73F1) & (0xFFFFEFFF & 0x73FF);
        32 = 0x50 ^ 0x70;
        543 = 0xFFFF83DF & 0x7E3F;
        33 = 0x62 ^ 0x76 ^ (0x85 ^ 0xB0);
        558 = -(0xFFFFFFBF & 0x3551) & (0xFFFFBFBF & 0x777E);
        34 = 0x65 ^ 0x47;
        573 = 0xFFFFF2FD & 0xF3F;
        35 = 0xBD ^ 0x9E;
        587 = 0xFFFFBF6B & 0x42DF;
        602 = -(0xFFFFF89D & 0x3FE7) & (0xFFFFFFDE & 0x3AFF);
        37 = 0xE ^ 0x2B;
        616 = 0xFFFFB6E8 & 0x4B7F;
        38 = 0x16 ^ 0x30;
        630 = 0xFFFFB2FE & 0x4F77;
        39 = 23 + 42 - -67 + 5 ^ 63 + 140 - 80 + 51;
        644 = 0xFFFFF697 & 0xBEC;
        40 = 0x5C ^ 0x47 ^ (0x81 ^ 0xB2);
        658 = 0xFFFFCA92 & 0x37FF;
        41 = 151 + 210 - 233 + 106 ^ 167 + 109 - 98 + 17;
        672 = 0xFFFF9BF3 & 0x66AC;
        42 = 0x68 ^ 0x42;
        685 = -(0xFFFFEFB9 & 0x5C57) & (0xFFFFFFFD & 0x4EBF);
        43 = 0x2F ^ 0x6F ^ (0x12 ^ 0x79);
        698 = 0xFFFFBFFB & 0x42BE;
        44 = 0x74 ^ 0x58;
        711 = 0xFFFF9BC7 & 0x66FF;
        45 = 59 + 0 - -36 + 62 ^ 40 + 12 - -76 + 48;
        724 = 0xFFFFCFF5 & 0x32DE;
        46 = 2 ^ 0x4A ^ (0x6E ^ 8);
        737 = -(0xFFFFDE35 & 0x7DDF) & (0xFFFFFEFF & 0x5FF5);
        47 = 0x52 ^ 3 ^ (0x5F ^ 0x21);
        749 = -(0xFFFFF9F7 & 0x7F0B) & (0xFFFFFBFF & 0x7FEF);
        48 = 0x6C ^ 0x5C;
        761 = -(0xFFFFDE07 & 0x79FD) & (0xFFFFFBFD & 0x5EFF);
        49 = 117 + 99 - 92 + 4 ^ 67 + 148 - 86 + 48;
        773 = -(0xFFFFF9EB & 0x76F7) & (0xFFFFF3F7 & 0x7FEF);
        50 = 0xF ^ 0x3D;
        784 = 0xFFFFBB35 & 0x47DA;
        51 = 0x57 ^ 0x20 ^ (0x6C ^ 0x28);
        796 = -(0xFFFFA57D & 0x7EA3) & (0xFFFFEF3C & 0x37FF);
        52 = 68 + 36 - 59 + 136 ^ 22 + 22 - -24 + 61;
        807 = -(0xFFFFFF55 & 0x1CEB) & (0xFFFFFFFF & 0x1F67);
        53 = 113 + 32 - 91 + 74 ^ 10 + 10 - -36 + 125;
        818 = -(0xFFFFB7FF & 0x6C06) & (0xFFFFAFFF & 0x7737);
        828 = -(0xFFFFEC0F & 0x53F3) & (0xFFFFDB7F & 0x67BE);
        55 = 0x87 ^ 0xB0;
        839 = -(0xFFFFB8CD & 0x7FB3) & (0xFFFFBBC7 & Short.MAX_VALUE);
        56 = 0xEF ^ 0x96 ^ (0xF5 ^ 0xB4);
        849 = -(0xFFFFECA9 & 0x7B5F) & (0xFFFFFBDB & 0x6F7D);
        57 = 0x9E ^ 0xA7;
        859 = 0xFFFFE35B & 0x1FFF;
        58 = 156 + 32 - 65 + 60 ^ 58 + 98 - 146 + 131;
        868 = -(0xFFFFCCF7 & 0x7F89) & (0xFFFFDFF4 & 0x6FEF);
        59 = 0xDB ^ 0xAA ^ (0x75 ^ 0x3F);
        878 = -(0xFFFFDDF7 & 0x6A99) & (0xFFFFEFFE & 0x5BFF);
        60 = 154 + 70 - 177 + 114 ^ 7 + 150 - 10 + 10;
        887 = -(0xFFFF8F93 & 0x7CED) & (0xFFFFBFF7 & 0x4FFF);
        61 = 0x87 ^ 0xBA;
        896 = -(0xFFFFFE7F & 0x5DC6) & (0xFFFFFFE7 & 0x5FDD);
        62 = 0xF5 ^ 0xA6 ^ (0x41 ^ 0x2C);
        904 = 0xFFFFFBDA & 0x7AD;
        63 = 0xE3 ^ 0xB4 ^ (0x71 ^ 0x19);
        912 = 0xFFFFF7DC & 0xBB3;
        64 = 0x6A ^ 0x2A;
        920 = -(0xFFFFCB7F & 0x7CC5) & (0xFFFFDBFC & 0x6FDF);
        65 = 0x5B ^ 0x1A;
        928 = -(0xFFFFFDF6 & 0x765F) & (0xFFFFF7F5 & Short.MAX_VALUE);
        66 = 0x33 ^ 0x71;
        935 = -(0xFFFFFE7B & 0x75DD) & (0xFFFFFFFF & 0x77FF);
        67 = 0xD4 ^ 0x97;
        943 = 0xFFFF83EF & 0x7FBF;
        68 = 0xD2 ^ 0xB3 ^ (7 ^ 0x22);
        949 = 0xFFFF9FF5 & 0x63BF;
        69 = 0x7E ^ 0x6A ^ (0xC1 ^ 0x90);
        956 = -(0xFFFFFE79 & 0x7DC7) & (0xFFFFFFFC & Short.MAX_VALUE);
        70 = 2 ^ 0x44;
        962 = -(0xFFFFFF96 & 0x3C7F) & (0xFFFFFFFF & 0x3FD7);
        968 = 0xFFFF93EE & 0x6FD9;
        72 = 0x3E ^ 0x76;
        974 = 0xFFFFA7FF & 0x5BCE;
        73 = 130 + 118 - 221 + 166 ^ 37 + 98 - -1 + 0;
        979 = -(0xFFFFF5B7 & 0xE6D) & (0xFFFFBFF7 & 0x47FF);
        74 = 0xE0 ^ 0x96 ^ (9 ^ 0x35);
        984 = -(0xFFFFEE87 & 0x517C) & (0xFFFFF7FB & 0x4BDF);
        75 = 0 + 135 - -55 + 34 ^ 0 + 81 - -64 + 26;
        989 = 0xFFFFE3DD & 0x1FFF;
        76 = 78 + 120 - 197 + 192 ^ 112 + 56 - 77 + 50;
        994 = 0xFFFFCBE7 & 0x37FA;
        77 = 100 + 60 - 47 + 79 ^ 19 + 108 - 116 + 130;
        998 = 0xFFFF93FF & 0x6FE6;
        78 = "   ".length() ^ (0xFD ^ 0xB0);
        1002 = 0xFFFFB7EF & 0x4BFA;
        79 = 33 + 108 - 40 + 38 ^ 194 + 41 - 220 + 181;
        1005 = -(0xFFFFC57B & 0x7E97) & (0xFFFFD7FF & 0x6FFF);
        80 = 0x28 ^ 0x44 ^ (0x1C ^ 0x20);
        1008 = -(0xFFFFDA8B & 0x7D7F) & (0xFFFFDFFF & 0x7BFA);
        81 = 103 + 42 - 63 + 135 ^ 126 + 130 - 172 + 52;
        1011 = 0xFFFF8FFF & 0x73F3;
        82 = 0x99 ^ 0xA8 ^ (0x7D ^ 0x1E);
        1014 = 0xFFFFEBF6 & 0x17FF;
        83 = 85 + 117 - 63 + 98 ^ 33 + 140 - 21 + 38;
        1016 = -(0xFFFFFF4D & 0x6CBA) & (0xFFFFEFFF & Short.MAX_VALUE);
        84 = 0xDB ^ 0xB0 ^ (0x1E ^ 0x21);
        1018 = 0xFFFFC7FA & 0x3BFF;
        85 = 4 ^ 0x51;
        1020 = -(0xFFFFF0F3 & 0x7F0F) & (0xFFFFFFFF & 0x73FE);
        86 = 0xFB ^ 0xAD;
        1022 = -(0xFFFF9B0F & 0x7CF1) & (0xFFFFBFFE & 0x5BFF);
        87 = 0xA4 ^ 0xBC ^ (0x28 ^ 0x67);
        1023 = 0xFFFFA3FF & 0x5FFF;
        88 = 104 + 2 - 97 + 118 ^ (0xB0 ^ 0x97);
        1024 = -(0xFFFFFFFB & 0x199D) & (0xFFFFBFFE & 0x5D99);
        90 = 0x5C ^ 6;
        0 = (0x1F ^ 0x58) & ~(0xB ^ 0x4C);
        2147483647 = 0xFFFFFFFF & Integer.MAX_VALUE;
        180 = 88 + 35 - 52 + 109;
        270 = -(0xFFFFEFF5 & 0x7EBB) & (0xFFFFEFBF & 0x7FFE);
        360 = -(0xFFFFE8DF & 0x5FB2) & (0xFFFFFBFF & 0x4DF9);
        -1 = -" ".length();
        16777215 = 0xFFFFFFFF & 0xFFFFFF;
    }

        public static void (String string, String string2 != null) {
        try {
            (string, string2.getBytes("UTF-8") != null);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public static int int_if(int n, int n2) {
        if (hg.boolean_new(var_java_util_Random_do.nextInt(2))) {
            return n;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    public static Image (Image var0, int var1_2 != null) {
        var2_3 = var0.getWidth();
        var3_4 = var0.getHeight();
        var4_5 = new int[var2_3 * var3_4];
        var0.getRGB(var4_5, 0, var2_3, 0, 0, var2_3, var3_4);
        var0_1 = 0;
        if ("  ".length() > " ".length()) ** GOTO lbl13
        return null;
lbl-1000:
        // 1 sources

        {
            if ((var4_5[var0_1] == var1_2)) {
                var4_5[var0_1] = 16777215;
            }
            ++var0_1;
lbl13:
            // 2 sources

            ** while (!hg.boolean_if((int)var0_1, (int)var4_5.length))
        }
lbl14:
        // 1 sources

        return Image.createRGBImage((int[])var4_5, (int)var2_3, (int)var3_4, (boolean)1);
    }

            public static String java_lang_String_do(String object) {
        byte[] byArray = hg.byte_arr_do((String)object);
        object = byArray;
        if ((byArray == null)) {
            return null;
        }
        try {
            return new String((byte[])object, "UTF-8");
        }
        catch (Exception exception) {
            return new String((byte[])object);
        }
    }

    public static Image javax_microedition_lcdui_Image_do(byte[] byArray) {
        return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
    }

    public static int int_new(int n) {
        return var_java_util_Random_do.nextInt(n);
    }

    public static int (int n, int n2, int n3, int n4 != null) {
        if (hg.boolean_int(n = (n - n3) * (n - n3) + (n2 - n4) * (n2 - n4))) {
            return 0;
        }
        n2 = (n + 1) / 2;
        while (!hg.boolean_do(Math.abs((n3 = n2) - (n2 = n2 / 2 + n / (n2 << 1))), 1)) {
        }
        return n2;
    }
}

