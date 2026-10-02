/*
 * Decompiled with CFR 0.152.
 */
public final class y
implements cp,
Runnable {
    private static final int[] mangSoNguyen;
    public static int[][] var_int_arr_arr_do;
    private final int soLuong;

                    private static void cfr_renamed_1() {
        mangSoNguyen = new int[64];
        58 = 0x12 ^ 0x28;
        0 = (2 + 69 - -45 + 87 ^ 53 + 48 - 23 + 70) & (0x9C ^ 0xA4 ^ (0xDE ^ 0xB9) ^ -" ".length());
        1 = " ".length();
        59 = 0x4D ^ 0x76;
        2 = "  ".length();
        36 = 103 + 55 - 100 + 71 ^ 63 + 57 - 68 + 113;
        97 = 26 + 212 - 136 + 147 ^ 57 + 66 - 51 + 80;
        300 = 0xFFFFA33D & 0x5DEE;
        168 = (0x5A ^ 0x69) + (18 + 21 - -83 + 14) - (0x16 ^ 0x46) + (0xBD ^ 0x80);
        157 = 51 + 39 - -1 + 66;
        3 = "   ".length();
        192 = (0x6C ^ 0x31) + (0x32 ^ 0x1C) - (0xC1 ^ 0xB2) + (7 + 75 - -2 + 84);
        153 = 93 + 91 - 109 + 78;
        4 = 0x78 ^ 0x7C;
        336 = -(0xFFFFFE6D & 0x61BF) & (0xFFFFEF7C & 0x71FF);
        5 = 0xB7 ^ 0xB2;
        360 = -(0xFFFFCFD7 & 0x7CBB) & (0xFFFFCFFF & 0x7DFA);
        6 = 0x75 ^ 0x73;
        264 = 0xFFFFE3CF & 0x1D38;
        7 = 0x5E ^ 0x59;
        8 = 0x56 ^ 0x5E;
        9 = 0x94 ^ 0x9D;
        258 = 0xFFFFCFB7 & 0x314A;
        156 = 20 + 101 - -18 + 17;
        10 = 0x9B ^ 0x9C ^ (0xBD ^ 0xB0);
        181 = 175 + 44 - 154 + 116;
        11 = 0x22 ^ 0x29;
        474 = -(0xFFFFE9EB & 0x7E15) & (0xFFFFEDDB & 0x7BFE);
        12 = 0xFA ^ 0x96 ^ (0x2C ^ 0x4C);
        594 = -(0xFFFFFD9B & 0x3FED) & (0xFFFFBFDF & 0x7FFA);
        13 = 0xBD ^ 0xB0;
        114 = 0x75 ^ 7;
        14 = 0x5A ^ 0x6D ^ (0xA8 ^ 0x91);
        468 = 0xFFFFB9F5 & 0x47DE;
        15 = 3 + 106 - 22 + 51 ^ 127 + 17 - 92 + 81;
        16 = 0x7F ^ 0x6F;
        324 = -(0xFFFFBEB9 & 0x77EF) & (0xFFFFFFED & 0x37FE);
        17 = 0 + 93 - 32 + 125 ^ 134 + 101 - 107 + 43;
        282 = 0xFFFFDB1B & 0x25FE;
        108 = 3 ^ 0x6F;
        18 = 31 + 1 - -95 + 37 ^ 76 + 177 - 117 + 46;
        205 = (0x9A ^ 0x84) + (0x65 ^ 0x70) - -(0x17 ^ 0x4E) + (0x4C ^ 0xD);
        21 = 0x5D ^ 0x48;
        546 = -(0xFFFFB4ED & 0x7B5F) & (0xFFFFFEEF & 0x337E);
        132 = 26 + 123 - 84 + 67;
        23 = 40 + 98 - 38 + 57 ^ 13 + 119 - 130 + 136;
        25 = 0x32 ^ 0x1F ^ (0x5E ^ 0x6A);
        186 = 24 + 39 - 10 + 133;
        27 = 0x98 ^ 0x83;
        354 = 0xFFFF89F6 & 0x776B;
        28 = " ".length() ^ (0x34 ^ 0x29);
        29 = 0x32 ^ 0x2F;
        348 = 0xFFFFEDFD & 0x135E;
        133 = 115 + 71 - 102 + 49;
        30 = 0x21 ^ 0x38 ^ (0xA7 ^ 0xA0);
        33 = 28 + 46 - -50 + 52 ^ 71 + 47 - 1 + 28;
        34 = 0x6B ^ 0x49;
        276 = -(0xFFFFFEE7 & 0x2FB9) & (0xFFFFEFFC & 0x3FB7);
        55 = 6 ^ 0x31;
        56 = 0x5C ^ 0x33 ^ (0x26 ^ 0x71);
        325 = 0xFFFFF3FF & 0xD45;
        57 = 0x7F ^ 0x6A ^ (0xB7 ^ 0x9B);
        169 = (0xE6 ^ 0x93) + (0x7B ^ 1) - (1 ^ 0x7A) + (0x8E ^ 0xBB);
        217 = 143 + 14 - 68 + 128;
    }

        public final void run() {
        if (!(TienIchGame.cfr_renamed_4(this.soLuong))) {
            TienIchGame.hienThongBao("Không thể chuyển map!");
        }
        GameCanvas.cfr_renamed_8();
    }

    public y(int n) {
        this.soLuong = n;
    }

    public final void void_do() {
        if ((AutoController.nhiemVuHienTai >= 0)) {
            TienIchGame.hienThongBao("Không thể chuyển map khi đang bật: " + AutoController.nhiemVuHienTai.toString());
            return;
        }
        if ((ef_0.soLuong == this.soLuong)) {
            TienIchGame.hienThongBao("Bạn đang ở map này rồi!");
            return;
        }
        if (!(this.soLuong >= 0) || !(this.soLuong <= 58) || !(var_int_arr_arr_do >= 0) || (var_int_arr_arr_do[this.soLuong][0] == 0) && (var_int_arr_arr_do[this.soLuong][1] == 0)) {
            TienIchGame.hienThongBao("Map id " + this.soLuong + " chưa được hỗ trợ di chuyển nhanh!");
            return;
        }
        GameCanvas.cfr_renamed_5();
        new Thread(this).start();
    }

    static {
        y.cfr_renamed_1();
        int[][] nArray = new int[59][2];
        var_int_arr_arr_do = nArray;
        int[] nArray2 = new int[2];
        nArray2[0] = 36;
        nArray2[1] = 97;
        nArray[0] = nArray2;
        int[] nArray3 = new int[2];
        nArray3[0] = 300;
        nArray3[1] = 97;
        y.var_int_arr_arr_do[1] = nArray3;
        int[] nArray4 = new int[2];
        nArray4[0] = 168;
        nArray4[1] = 157;
        y.var_int_arr_arr_do[2] = nArray4;
        int[] nArray5 = new int[2];
        nArray5[0] = 192;
        nArray5[1] = 153;
        y.var_int_arr_arr_do[3] = nArray5;
        int[] nArray6 = new int[2];
        nArray6[0] = 336;
        nArray6[1] = 157;
        y.var_int_arr_arr_do[4] = nArray6;
        int[] nArray7 = new int[2];
        nArray7[0] = 360;
        nArray7[1] = 157;
        y.var_int_arr_arr_do[5] = nArray7;
        int[] nArray8 = new int[2];
        nArray8[0] = 264;
        nArray8[1] = 157;
        y.var_int_arr_arr_do[6] = nArray8;
        int[] nArray9 = new int[2];
        nArray9[0] = 36;
        nArray9[1] = 97;
        y.var_int_arr_arr_do[7] = nArray9;
        int[] nArray10 = new int[2];
        nArray10[0] = 264;
        nArray10[1] = 157;
        y.var_int_arr_arr_do[8] = nArray10;
        int[] nArray11 = new int[2];
        nArray11[0] = 258;
        nArray11[1] = 156;
        y.var_int_arr_arr_do[9] = nArray11;
        int[] nArray12 = new int[2];
        nArray12[0] = 336;
        nArray12[1] = 181;
        y.var_int_arr_arr_do[10] = nArray12;
        int[] nArray13 = new int[2];
        nArray13[0] = 474;
        nArray13[1] = 156;
        y.var_int_arr_arr_do[11] = nArray13;
        int[] nArray14 = new int[2];
        nArray14[0] = 594;
        nArray14[1] = 156;
        y.var_int_arr_arr_do[12] = nArray14;
        int[] nArray15 = new int[2];
        nArray15[0] = 114;
        nArray15[1] = 156;
        y.var_int_arr_arr_do[13] = nArray15;
        int[] nArray16 = new int[2];
        nArray16[0] = 468;
        nArray16[1] = 97;
        y.var_int_arr_arr_do[14] = nArray16;
        int[] nArray17 = new int[2];
        nArray17[0] = 36;
        nArray17[1] = 97;
        y.var_int_arr_arr_do[15] = nArray17;
        int[] nArray18 = new int[2];
        nArray18[0] = 324;
        nArray18[1] = 157;
        y.var_int_arr_arr_do[16] = nArray18;
        int[] nArray19 = new int[2];
        nArray19[0] = 282;
        nArray19[1] = 108;
        y.var_int_arr_arr_do[17] = nArray19;
        int[] nArray20 = new int[2];
        nArray20[0] = 108;
        nArray20[1] = 205;
        y.var_int_arr_arr_do[18] = nArray20;
        int[] nArray21 = new int[2];
        nArray21[0] = 546;
        nArray21[1] = 132;
        y.var_int_arr_arr_do[21] = nArray21;
        int[] nArray22 = new int[2];
        nArray22[0] = 594;
        nArray22[1] = 156;
        y.var_int_arr_arr_do[23] = nArray22;
        int[] nArray23 = new int[2];
        nArray23[0] = 186;
        nArray23[1] = 108;
        y.var_int_arr_arr_do[25] = nArray23;
        int[] nArray24 = new int[2];
        nArray24[0] = 354;
        nArray24[1] = 132;
        y.var_int_arr_arr_do[27] = nArray24;
        int[] nArray25 = new int[2];
        nArray25[0] = 360;
        nArray25[1] = 157;
        y.var_int_arr_arr_do[28] = nArray25;
        int[] nArray26 = new int[2];
        nArray26[0] = 348;
        nArray26[1] = 133;
        y.var_int_arr_arr_do[29] = nArray26;
        int[] nArray27 = new int[2];
        nArray27[0] = 36;
        nArray27[1] = 133;
        y.var_int_arr_arr_do[30] = nArray27;
        int[] nArray28 = new int[2];
        nArray28[0] = 282;
        nArray28[1] = 156;
        y.var_int_arr_arr_do[33] = nArray28;
        int[] nArray29 = new int[2];
        nArray29[0] = 276;
        nArray29[1] = 133;
        y.var_int_arr_arr_do[34] = nArray29;
        int[] nArray30 = new int[2];
        nArray30[0] = 282;
        nArray30[1] = 108;
        y.var_int_arr_arr_do[55] = nArray30;
        int[] nArray31 = new int[2];
        nArray31[0] = 348;
        nArray31[1] = 325;
        y.var_int_arr_arr_do[56] = nArray31;
        int[] nArray32 = new int[2];
        nArray32[0] = 468;
        nArray32[1] = 169;
        y.var_int_arr_arr_do[57] = nArray32;
        int[] nArray33 = new int[2];
        nArray33[0] = 36;
        nArray33[1] = 217;
        y.var_int_arr_arr_do[58] = nArray33;
    }
}

