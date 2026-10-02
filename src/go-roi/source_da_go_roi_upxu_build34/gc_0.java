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

/*
 * Renamed from gc
 */
public final class gc_0 {
    public static String chuoiGiaTri;
    private static short[] var_short_arr_do;
    private static int[] mangSoNguyen;
    private static short[] var_short_arr_if;
    public static Random var_java_util_Random_do;
    private static int[] var_int_arr_if;

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    static {
        gc_0.cfr_renamed_4();
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
        var_short_arr_if = sArray;
    }

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    public static int int_do(int n) {
        return var_java_util_Random_do.nextInt(n);
    }

    public static int (int n, int n2, int n3, int n4 != null) {
        if (gc_0.boolean_for(n = (n - n3) * (n - n3) + (n2 - n4) * (n2 - n4))) {
            return 0;
        }
        n2 = (n + 1) / 2;
        while (!gc_0.cfr_renamed_5(Math.abs((n3 = n2) - (n2 = n2 / 2 + n / (n2 << 1))), 1)) {
        }
        return n2;
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void void_do() {
        ThongTinNhanVat.var_int_if = 1;
        int n = 0;
        while (!gc_0.boolean_do(n, bF.bF_do().var_java_util_Vector_case.size())) {
            ei ei2 = (ei)bF.bF_do().var_java_util_Vector_case.elementAt(n);
            ThongTinNhanVat.var_int_if += ei2.chuoiGiaTri.hashCode();
            ++n;
        }
        ThongTinNhanVat.cfr_renamed_0().cfr_renamed_1();
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
        if (((0x40 ^ 0x15 ^ (0x44 ^ 0x2F)) & (0x42 ^ 0x79 ^ (0x7B ^ 0x7E) ^ -" ".length())) >= "  ".length()) {
            return null;
        }
        return gc_0.byte_arr_do(byArray);
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
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
        if ("  ".length() >= "  ".length()) ** GOTO lbl13
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

            ** while (!gc_0.boolean_do((int)var0_1, (int)var4_5.length))
        }
lbl14:
        // 1 sources

        return Image.createRGBImage((int[])var4_5, (int)var2_3, (int)var3_4, (boolean)1);
    }

    public static void (String string, byte[] byArray != null) {
        byArray = gc_0.byte_arr_do(byArray);
        if (gc_0.boolean_do((string = RecordStore.openRecordStore((String)("2.5.8" + string), (boolean)1)).getNumRecords())) {
            string.setRecord(1, byArray, 0, byArray.length);
            if ("   ".length() == " ".length()) {
                return;
            }
        } else {
            string.addRecord(byArray, 0, byArray.length);
            }
        string.closeRecordStore();
    }

    private static boolean boolean_for(int n) {
        return n <= 0;
    }

    public static int int_do() {
        return var_java_util_Random_do.nextInt() % 2;
    }

    public static void cfr_renamed_1() {
        AngelChip.chuoiGiaTri = gc_0.java_lang_String_do(k.chuoiGiaTri);
        em_0.chuoiGiaTri = gc_0.java_lang_String_do(AngelChip.tenNhanVat);
        fe_0.chuoiGiaTri = gc_0.java_lang_String_do(chuoiGiaTri);
    }

    public static int int_if(int n) {
        if (gc_0.boolean_int(n)) {
            return n;
        }
        return -n;
    }

    /*
     * Unable to fully structure code
     */
    public static final int int_do(int var0, int var1_1) {
        block11: {
            block12: {
                block10: {
                    block9: {
                        if (!(var0 != 0)) break block10;
                        var2_2 = Math.abs((var1_1 << 10) / var0);
                        var3_3 = 0;
                        if ("   ".length() >= 0) ** GOTO lbl16
                        return (110 ^ 96) & ~(188 ^ 178);
lbl-1000:
                        // 1 sources

                        {
                            if (gc_0.boolean_do(gc_0.var_int_arr_if[var3_3], var2_2)) {
                                v0 = var3_3;
                                break block9;
                            }
                            ++var3_3;
lbl16:
                            // 2 sources

                            ** while (!gc_0.cfr_renamed_3((int)var3_3, (int)90))
                        }
lbl17:
                        // 1 sources

                        v0 = var2_2 = 0;
                    }
                    if (gc_0.boolean_int(var1_1) && gc_0.boolean_if(var0)) {
                        var2_2 = 180 - var2_2;
                    }
                    if (gc_0.boolean_if(var1_1) && gc_0.boolean_if(var0)) {
                        var2_2 += 180;
                    }
                    if (!gc_0.boolean_if(var1_1) || !gc_0.boolean_int(var0)) break block11;
                    v1 = 360 - var2_2;
                    if (((13 ^ 109) & ~(46 ^ 78)) > ((32 ^ 25) & ~(94 ^ 103))) {
                        return (20 ^ 50) & ~(126 ^ 88);
                    }
                    break block12;
                }
                if (gc_0.boolean_do(var1_1)) {
                    v1 = 90;
                    if (-" ".length() >= " ".length()) {
                        return (103 + 156 - 111 + 35 ^ 30 + 4 - -110 + 42) & (116 + 78 - 25 + 6 ^ 76 + 157 - 218 + 147 ^ -" ".length());
                    }
                } else {
                    v1 = 270;
                }
            }
            var2_2 = v1;
        }
        return var2_2;
    }

    public static final int int_for(int n) {
        if (gc_0.boolean_int(n = gc_0.int_int(n)) && gc_0.boolean_if(n, 90)) {
            return var_short_arr_if[n];
        }
        if (gc_0.boolean_do(n, 90) && gc_0.boolean_if(n, 180)) {
            return var_short_arr_if[180 - n];
        }
        if (gc_0.boolean_do(n, 180) && gc_0.boolean_if(n, 270)) {
            return -var_short_arr_if[n - 180];
        }
        return -var_short_arr_if[360 - n];
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

    public static Image (int n, int n2, int n3, int n4, Image image != null) {
        int[] nArray = new int[n3 * n4];
        image.getRGB(nArray, 0, n3, n, n2, n3, n4);
        return Image.createRGBImage((int[])nArray, (int)n3, (int)n4, (boolean)1);
    }

    private static boolean boolean_int(int n) {
        return n >= 0;
    }

    public static Image (byte[] byArray, byte[] byArray2 != null) {
        byte[] byArray3 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        byArray = byArray3;
        return Image.createImage((byte[])byArray3, (int)0, (int)byArray.length);
    }

    public static final int int_int(int n) {
        if (gc_0.boolean_do(n, 360)) {
            n -= 360;
        }
        if (gc_0.boolean_if(n)) {
            n += 360;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static byte[] byte_arr_do(byte[] byArray) {
        if (gc_0.cfr_renamed_0((Object)byArray)) {
            int n = 0;
            while (!gc_0.boolean_do(n, byArray.length)) {
                byArray[n] = (byte)(byArray[n] ^ -1);
                ++n;
            }
        }
        return byArray;
    }

    public static Image javax_microedition_lcdui_Image_do(byte[] byArray) {
        return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
    }

    private static boolean boolean_new(int n) {
        return n == 0;
    }

    public static int int_if(int n, int n2) {
        if (gc_0.boolean_new(var_java_util_Random_do.nextInt(2))) {
            return n;
        }
        return n2;
    }

        public static InputStream java_io_InputStream_do(String string) {
        return "".getClass().getResourceAsStream(string);
    }

            public static final int int_new(int n) {
        if (gc_0.boolean_int(n = gc_0.int_int(n)) && gc_0.boolean_if(n, 90)) {
            return var_short_arr_do[n];
        }
        if (gc_0.boolean_do(n, 90) && gc_0.boolean_if(n, 180)) {
            return -var_short_arr_do[180 - n];
        }
        if (gc_0.boolean_do(n, 180) && gc_0.boolean_if(n, 270)) {
            return -var_short_arr_do[n - 180];
        }
        return var_short_arr_do[360 - n];
    }

    /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_3() {
        gc_0.var_short_arr_do = new short[91];
        gc_0.var_int_arr_if = new int[91];
        var0 = 0;
        if (((143 ^ 180 ^ (75 ^ 93)) & (26 ^ 67 ^ (9 ^ 125) ^ -" ".length())) == 0) ** GOTO lbl18
        return;
lbl-1000:
        // 1 sources

        {
            gc_0.var_short_arr_do[var0] = gc_0.var_short_arr_if[90 - var0];
            if (gc_0.boolean_new(gc_0.var_short_arr_do[var0])) {
                gc_0.var_int_arr_if[var0] = 2147483647;
                } else {
                gc_0.var_int_arr_if[var0] = (gc_0.var_short_arr_if[var0] << 10) / gc_0.var_short_arr_do[var0];
            }
            ++var0;
lbl18:
            // 2 sources

            ** while (!gc_0.cfr_renamed_3((int)var0, (int)90))
        }
lbl19:
        // 1 sources

    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[181];
        91 = 0 ^ 0x5B;
        1 = " ".length();
        18 = 1 ^ 0x13;
        2 = "  ".length();
        36 = 0x2D ^ 0x2A ^ (2 ^ 0x21);
        3 = "   ".length();
        54 = 0xBC ^ 0x8A;
        4 = 0x42 ^ 0x27 ^ (0x2D ^ 0x4C);
        71 = 0x26 ^ 0x3C ^ (0xFE ^ 0xA3);
        5 = 0x4C ^ 0x49;
        89 = 89 + 206 - 127 + 65 ^ 1 + 154 - -12 + 9;
        6 = 162 + 36 - 84 + 55 ^ 147 + 162 - 272 + 138;
        107 = 0xFD ^ 0x96;
        7 = 0xA6 ^ 0xA1;
        125 = 0x44 ^ 0x39;
        8 = 0xA0 ^ 0xA8;
        143 = 73 + 6 - 30 + 94;
        9 = 0x84 ^ 0x8D;
        160 = (1 ^ 0x54) + (95 + 91 - 101 + 45) - (22 + 30 - -107 + 26) + (118 + 126 - 124 + 10);
        10 = 0xB4 ^ 0xBE;
        178 = (0x6E ^ 0x6A) + (22 + 31 - 41 + 158) - (0x30 ^ 0x64) + (0x11 ^ 0x49);
        11 = 0x29 ^ 0x22;
        195 = 183 + 100 - 177 + 89;
        12 = 0x7E ^ 0x72;
        213 = 10 + 1 - -100 + 21 + (30 + 151 - 37 + 26) - (0xFFFFDDBF & 0x235B) + (180 + 137 - 201 + 78);
        13 = 0xAD ^ 0x89 ^ (0x33 ^ 0x1A);
        230 = 84 + 93 - -22 + 31;
        14 = 0x43 ^ 0x4D;
        248 = (0x5B ^ 0x6C) + (58 + 46 - -41 + 7) - (54 + 120 - 76 + 85) + (27 + 195 - 80 + 82);
        15 = 0x6E ^ 0x61;
        265 = 0xFFFFB95F & 0x47A9;
        16 = 9 ^ 0x19;
        282 = -(0xFFFFFEF7 & 0x71CD) & (0xFFFFF9FE & 0x77DF);
        17 = 5 ^ 0x14;
        299 = 0xFFFFEDEB & 0x133F;
        316 = -(0xFFFFFFAD & 0x1ED3) & (0xFFFF9FBE & 0x7FFD);
        19 = 0x9F ^ 0x8C;
        333 = 0xFFFFAB7D & 0x55CF;
        20 = 96 + 64 - 28 + 27 ^ 34 + 69 - 47 + 83;
        350 = 0xFFFFE95F & 0x17FE;
        21 = 0x4E ^ 0x5B;
        367 = 0xFFFFAB7F & 0x55EF;
        22 = "   ".length() ^ (0x80 ^ 0x95);
        384 = 0xFFFF9787 & 0x69F8;
        23 = 0x7A ^ 0x6D;
        400 = -(0xFFFFCFAF & 0x7E7B) & (0xFFFFCFFB & 0x7FBE);
        24 = 0xDC ^ 0xC4;
        416 = 0xFFFFD1B3 & 0x2FEC;
        25 = 0x61 ^ 0x56 ^ (0x6E ^ 0x40);
        433 = 0xFFFF83B1 & 0x7DFF;
        26 = 0x2C ^ 0x36;
        449 = -(0xFFFFFF37 & 0x5ADF) & (0xFFFFFFD7 & 0x5BFF);
        27 = 44 + 154 - 136 + 107 ^ 21 + 56 - -94 + 7;
        465 = -(0xFFFFBF2D & 0x4ED7) & (0xFFFFCFF5 & 0x3FDF);
        28 = 139 + 35 - 111 + 120 ^ 23 + 147 - -1 + 0;
        481 = -(0xFFFFF63F & 0x3FD7) & (0xFFFFB7F7 & Short.MAX_VALUE);
        29 = 0x1A ^ 0x67 ^ (0xA6 ^ 0xC6);
        496 = -(0xFFFFDE1B & 0x3FE7) & (0xFFFFBFF3 & 0x5FFE);
        30 = 0x35 ^ 0x2B;
        512 = 0xFFFF87EC & 0x7A13;
        31 = 0x13 ^ 0xC;
        527 = 0xFFFF835F & 0x7EAF;
        32 = 60 + 84 - 38 + 52 ^ 135 + 93 - 40 + 2;
        543 = 0xFFFF9A7F & 0x679F;
        33 = 0x64 ^ 0x45;
        558 = 0xFFFFAFFF & 0x522E;
        34 = 0xC4 ^ 0x8B ^ (0x56 ^ 0x3B);
        573 = -(0xFFFFBFFF & 0x6943) & (0xFFFFBFFF & 0x6B7F);
        35 = 0x86 ^ 0xA5;
        587 = 0xFFFFF25F & 0xFEB;
        602 = 0xFFFF8A5A & 0x77FF;
        37 = 0xCE ^ 0xA9 ^ (0xEE ^ 0xAC);
        616 = -(0xFFFF9DF9 & 0x7E97) & (0xFFFFBFF9 & 0x5EFE);
        38 = 0xA3 ^ 0x85;
        630 = -(0xFFFFFD9A & 0x7AEF) & (0xFFFFFAFF & Short.MAX_VALUE);
        39 = 0x89 ^ 0xAE;
        644 = -(0xFFFFAF7F & 0x709B) & (0xFFFFF2FE & 0x2F9F);
        40 = 135 + 117 - 139 + 32 ^ 112 + 30 - 87 + 130;
        658 = -(0xFFFFFF67 & 0x31DE) & (0xFFFFFBF7 & 0x37DF);
        41 = 0x6B ^ 0x42;
        672 = 0xFFFFBBFF & 0x46A0;
        42 = 0xA6 ^ 0x8C;
        685 = 0xFFFFA6ED & 0x5BBF;
        43 = 0x9B ^ 0xB0;
        698 = 0xFFFF8BFB & 0x76BE;
        44 = 0x28 ^ 4;
        711 = -(0xFFFFC559 & 0x7FBF) & (0xFFFFEFDF & 0x57FF);
        45 = 0x68 ^ 0x45;
        724 = -(0xFFFFB51B & 0x7FE6) & (0xFFFFFFF5 & 0x37DF);
        46 = 0xEB ^ 0xC5;
        737 = -(0xFFFFF9AF & 0x2F5F) & (0xFFFFBFFF & 0x6BEF);
        47 = 0xA8 ^ 0x87;
        749 = 0xFFFFF6EF & 0xBFD;
        48 = 0x3E ^ 0xE;
        761 = 0xFFFFEAFD & 0x17FB;
        49 = 0x9A ^ 0xAB;
        773 = 0xFFFFCFFF & 0x3305;
        50 = 0xA0 ^ 0x92;
        784 = -(0xFFFFEC5E & 0x7BE7) & (0xFFFFFF57 & 0x6BFD);
        51 = 0x79 ^ 0x4A;
        796 = 0xFFFF9F9C & 0x637F;
        52 = 0xAE ^ 0x9A;
        807 = 0xFFFFF777 & 0xBAF;
        53 = 0x6E ^ 0x5B;
        818 = -(0xFFFFBC3E & 0x73CF) & (0xFFFFB7BF & 0x7B7F);
        828 = 0xFFFFFBBE & 0x77D;
        55 = 0xA3 ^ 0x94;
        839 = 0xFFFFE77F & 0x1BC7;
        56 = 7 + 62 - -41 + 27 ^ 165 + 101 - 255 + 166;
        849 = 0xFFFFFFFF & 0x351;
        57 = 0x87 ^ 0xAF ^ (0xB7 ^ 0xA6);
        859 = -(0xFFFFFBC7 & 0x1CBD) & (0xFFFFBBFF & 0x5FDF);
        58 = 0xE ^ 0x34;
        868 = 0xFFFFAB65 & 0x57FE;
        59 = 5 + 64 - -74 + 20 ^ 66 + 84 - 30 + 32;
        878 = 0xFFFF9B7E & 0x67EF;
        60 = 19 + 81 - 19 + 60 ^ 80 + 81 - 131 + 147;
        887 = -(0xFFFFFDD1 & 0x7E2F) & (0xFFFFFFF7 & 0x7F7F);
        61 = 0x6F ^ 0x52;
        896 = -(0xFFFFFCEB & 0x2F57) & (0xFFFFBFD3 & 0x6FEE);
        62 = 0x49 ^ 1 ^ (0xB0 ^ 0xC6);
        904 = 0xFFFFE3DD & 0x1FAA;
        63 = 132 + 107 - 106 + 47 ^ 42 + 84 - 20 + 33;
        912 = 0xFFFFD7B0 & 0x2BDF;
        64 = 152 + 129 - 232 + 151 ^ 68 + 80 - 140 + 128;
        920 = -(0xFFFFDB97 & 0x3C6B) & (0xFFFFDBBB & 0x3FDE);
        65 = 0x12 ^ 0x53;
        928 = 0xFFFFC7EF & 0x3BB0;
        66 = 0x10 ^ 0x63 ^ (0x1C ^ 0x2D);
        935 = 0xFFFFFBBF & 0x7E7;
        67 = 0x5F ^ 0x69 ^ (0xCB ^ 0xBE);
        943 = -(0xFFFF881F & 0x7FF1) & (0xFFFFDFFF & 0x2BBF);
        68 = 0xC9 ^ 0x8D;
        949 = 0xFFFFBBFF & 0x47B5;
        69 = 0xB1 ^ 0xC6 ^ (0x44 ^ 0x76);
        956 = 0xFFFFDBFE & 0x27BD;
        70 = 0xDF ^ 0x99;
        962 = 0xFFFFCBC2 & 0x37FF;
        968 = -(0xFFFFBCFF & 0x6727) & (0xFFFFAFEE & 0x77FF);
        72 = 190 + 181 - 370 + 216 ^ 19 + 106 - 108 + 128;
        974 = 0xFFFFFFEF & 0x3DE;
        73 = 0xEB ^ 0xA2;
        979 = -(0xFFFFCEAF & 0x7571) & (0xFFFFDFF7 & 0x67FB);
        74 = 0xFB ^ 0xB1;
        984 = -(0xFFFFD75E & 0x3CA9) & (0xFFFFFFFF & 0x17DF);
        75 = 0xFD ^ 0xB6;
        989 = 0xFFFFB3DD & 0x4FFF;
        76 = 0xE5 ^ 0x91 ^ (0xA1 ^ 0x99);
        994 = 0xFFFF8BEB & 0x77F6;
        77 = 139 + 154 - 92 + 14 ^ 147 + 12 - 38 + 33;
        998 = -(0xFFFFFE99 & 0x796F) & (0xFFFFFFEF & 0x7BFE);
        78 = 0x20 ^ 0x39 ^ (0xDF ^ 0x88);
        1002 = -(0xFFFFEF91 & 0x7C7F) & (0xFFFFFFFE & 0x6FFB);
        79 = 0x17 ^ 0x5E ^ (0x82 ^ 0x84);
        1005 = -(0xFFFFAE3F & 0x75D3) & (0xFFFFF7FF & 0x2FFF);
        80 = 0x95 ^ 0x88 ^ (0x53 ^ 0x1E);
        1008 = -(0xFFFFFFFB & 0x2C0C) & (0xFFFFEFFF & 0x3FF7);
        81 = 31 + 7 - -99 + 108 ^ 10 + 91 - 81 + 144;
        1011 = -(0xFFFFA5C5 & 0x7A3B) & (0xFFFFFBFB & 0x27F7);
        82 = 0x3C ^ 0x6E;
        1014 = -(0x63 ^ 0x69) & (0xFFFFD7FF & 0x2BFF);
        83 = 0xCB ^ 0x98;
        1016 = -(0xFFFFBEAF & 0x6557) & (0xFFFFB7FE & 0x6FFF);
        84 = 0x2E ^ 0x7A;
        1018 = -(0xFFFF9CD5 & 0x772B) & (0xFFFFDFFE & 0x37FB);
        85 = 73 + 126 - -53 + 1 ^ 165 + 127 - 217 + 93;
        1020 = -(0xFFFFFF13 & 0x74ED) & (0xFFFFFFFE & 0x77FD);
        86 = 0x51 ^ 5 ^ "  ".length();
        1022 = -(0xFFFFEE55 & 0x79AB) & (0xFFFFEBFF & 0x7FFE);
        87 = 0xD1 ^ 0x86;
        1023 = 0xFFFFCBFF & 0x37FF;
        88 = 0xE4 ^ 0xBC;
        1024 = -(0xFFFFD3FE & 0x6CAB) & (0xFFFFDCEF & 0x67B9);
        90 = 39 + 14 - 46 + 216 ^ 93 + 132 - 198 + 106;
        0 = (0xB8 ^ 0x92) & ~(0x1C ^ 0x36);
        2147483647 = 0xFFFFFFFF & Integer.MAX_VALUE;
        180 = 73 + 78 - 45 + 74;
        270 = -(0xFFFFE903 & 0x7EFE) & (0xFFFFF9BF & 0x6F4F);
        360 = 0xFFFF9BE8 & 0x657F;
        -1 = -" ".length();
        16777215 = 0xFFFFFFFF & 0xFFFFFF;
    }

    public static String java_lang_String_do(String object) {
        byte[] byArray = gc_0.byte_arr_do((String)object);
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

        }

