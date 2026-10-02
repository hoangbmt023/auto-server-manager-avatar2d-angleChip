/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import main.AngelChip;

public final class at
extends NhiemVuAutoBase {
    private static final int[] mangSoNguyen;
    private boolean cfr_renamed_0 = 0;
    public static int soLuong;
    public static long soXu;
    private static final int[][] var_int_arr_arr_do;
    public static boolean dangChayAuto;

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[60];
        0 = "   ".length() & ~"   ".length();
        1 = " ".length();
        -1 = -" ".length();
        44 = 0x47 ^ 0x6B ^ (0xF2 ^ 0xB0) & ~(0xE9 ^ 0xAB);
        50 = 0x3C ^ 0x48 ^ (0xD6 ^ 0x90);
        47 = 0x82 ^ 0xAD;
        54 = 0xB7 ^ 0x9F ^ (0x2F ^ 0x31);
        43 = 23 + 28 - -54 + 58 ^ 0 + 30 - -38 + 68;
        42 = 0xAA ^ 0x80;
        41 = 0x99 ^ 0xB0;
        40 = 0x40 ^ 0x68;
        36 = 0x6B ^ 0x4F;
        35 = 0xBA ^ 0x99;
        34 = 0xA5 ^ 0x87;
        33 = 0x86 ^ 0xA7;
        6 = 0x78 ^ 0x7E;
        2102 = 0xFFFFE8BF & 0x1F76;
        2103 = 0xFFFF9D77 & 0x6ABF;
        2 = "  ".length();
        2104 = 0xFFFF8938 & 0x7EFF;
        3 = "   ".length();
        2105 = -(0xFFFFFAD7 & 0x77E9) & (0xFFFFFAFB & 0x7FFD);
        4 = 31 + 24 - -76 + 7 ^ 115 + 7 - 36 + 56;
        2106 = 0xFFFF897F & 0x7EBA;
        5 = 0xA6 ^ 0x86 ^ (0x30 ^ 0x15);
        2107 = -(0xFFFFF7CF & 0x4DF5) & (0xFFFFDFFF & 0x6DFF);
        100 = 0x70 ^ 0x14;
        2000 = 0xFFFFC7F5 & 0x3FDA;
        480 = 0xFFFF8FFB & 0x71E4;
        49 = 74 + 236 - 146 + 80 ^ 116 + 43 - 110 + 148;
        8 = 18 + 68 - -33 + 21 ^ 23 + 67 - 22 + 64;
        7 = 0x45 ^ 0x6B ^ (0x16 ^ 0x3F);
        2000000000 = -(0xFFFFAE93 & 0x796F) & (0xFFFFBD1A & 0x7735FEE7);
        3000 = 0xFFFFDFFA & 0x2BBD;
        59 = 0 ^ 0x10 ^ (0x3F ^ 0x14);
        193 = 111 + 178 - 186 + 90;
        444 = -(0xFFFFBC13 & 0x5FEE) & (0xFFFFBDFF & 0x5FBD);
        37 = 0x4A ^ 0x6F;
        492 = 0xFFFFD5ED & 0x2BFE;
        265 = 0xFFFFDFC9 & 0x213F;
        38 = 0x99 ^ 0xBF;
        264 = 0xFFFFE1EC & 0x1F1B;
        85 = 0x15 ^ 0x40;
        39 = 70 + 85 - 69 + 104 ^ 28 + 0 - -67 + 58;
        216 = 98 + 122 - 163 + 121 + (0x29 ^ 0x4D) - (7 + 80 - -102 + 26) + (34 + 30 - -63 + 26);
        240 = 138 + 89 - 39 + 26 + (0xF9 ^ 0x92) - (0xFFFFBD0F & 0x43FB) + (52 + 52 - 99 + 181);
        277 = -(0xFFFFB22F & 0x6DF3) & (0xFFFFA37F & 0x7DB7);
        420 = -(0xFFFFC77B & 0x7A8F) & (0xFFFFFFAE & 0x43FF);
        205 = 176 + 77 - 186 + 120 + (0xE3 ^ 0xAF) - (0x2A ^ 0x70) + (0x8A ^ 0xAA);
        228 = (0x47 ^ 0x49) + (0x2D ^ 0x66) - -(0x45 ^ 0x6E) + (0x19 ^ 0x79);
        256 = -(0xFFFFEE2A & 0x5BF7) & (0xFFFFEF3F & 0x5BE1);
        73 = 0x1D ^ 0x66 ^ (0x36 ^ 4);
        120 = 0x7D ^ 5;
        81 = 0xCB ^ 0x9A;
        508 = 0xFFFF9DFF & 0x63FC;
        86 = 11 + 39 - -80 + 69 ^ 72 + 111 - 134 + 96;
        276 = -(0xFFFFBCE7 & 0x6B5B) & (0xFFFFED57 & 0x3BFE);
        421 = -(0xFFFFD677 & 0x3B9B) & (0xFFFFF3BF & 0x1FF7);
        303 = 0xFFFFD3FF & 0x2D2F;
        313 = -(0xFFFFFCB7 & 0x6F4F) & (0xFFFFFDFF & 0x6F3F);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_3() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt((int)soXu);
            dataOutputStream.writeBoolean(dangChayAuto);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.docDuLieu("AicapSettings", byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                return;
            }
            catch (IOException iOException2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                }
            catch (IOException iOException) {
                throw throwable;
            }
            if ("   ".length() > " ".length()) throw throwable;
            return;
        }
        try {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final boolean boolean_do(String string) {
        if ((string.startsWith("Bạn đã ăn"))) {
            TienIchGame.void_int();
            return 1;
        }
        if (!at.boolean_do(string.startsWith("Bạn phải có") ? 1 : 0) || (string.indexOf("Bạn không thể") != -1)) {
            this.cfr_renamed_0 = 1;
            TienIchGame.cfr_renamed_7();
            return 0;
        }
        if ((string.startsWith("Ngươi đã có 1 tấm vé"))) {
            TienIchGame.cfr_renamed_6();
            return 1;
        }
        return super.boolean_do(string);
    }

        private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            private static boolean boolean_do(int n) {
        return n == 0;
    }

        public final void void_for() {
        super.void_for();
        this.cfr_renamed_0 = 0;
    }

        /*
     * Loose catch block
     */
    static {
        block11: {
            at.cfr_renamed_4();
            soLuong = -1;
            soXu = 0L;
            dangChayAuto = 0;
            int[][] nArray = new int[59][2];
            var_int_arr_arr_do = nArray;
            int[] nArray2 = new int[2];
            nArray2[0] = 36;
            nArray2[1] = 193;
            nArray[35] = nArray2;
            int[] nArray3 = new int[2];
            nArray3[0] = 444;
            nArray3[1] = 193;
            at.var_int_arr_arr_do[36] = nArray3;
            int[] nArray4 = new int[2];
            nArray4[0] = 492;
            nArray4[1] = 265;
            at.var_int_arr_arr_do[37] = nArray4;
            int[] nArray5 = new int[2];
            nArray5[0] = 264;
            nArray5[1] = 85;
            at.var_int_arr_arr_do[38] = nArray5;
            int[] nArray6 = new int[2];
            nArray6[0] = 216;
            nArray6[1] = 85;
            at.var_int_arr_arr_do[39] = nArray6;
            int[] nArray7 = new int[2];
            nArray7[0] = 240;
            nArray7[1] = 277;
            at.var_int_arr_arr_do[40] = nArray7;
            int[] nArray8 = new int[2];
            nArray8[0] = 420;
            nArray8[1] = 205;
            at.var_int_arr_arr_do[41] = nArray8;
            int[] nArray9 = new int[2];
            nArray9[0] = 228;
            nArray9[1] = 85;
            at.var_int_arr_arr_do[42] = nArray9;
            int[] nArray10 = new int[2];
            nArray10[0] = 256;
            nArray10[1] = 73;
            at.var_int_arr_arr_do[43] = nArray10;
            int[] nArray11 = new int[2];
            nArray11[0] = 120;
            nArray11[1] = 81;
            at.var_int_arr_arr_do[54] = nArray11;
            int[] nArray12 = new int[2];
            nArray12[0] = 508;
            nArray12[1] = 86;
            at.var_int_arr_arr_do[47] = nArray12;
            int[] nArray13 = new int[2];
            nArray13[0] = 276;
            nArray13[1] = 421;
            at.var_int_arr_arr_do[50] = nArray13;
            int[] nArray14 = new int[2];
            nArray14[0] = 303;
            nArray14[1] = 313;
            at.var_int_arr_arr_do[44] = nArray14;
            Object object = QuanLyRMS.byte_arr_do("AicapSettings");
            if (!(object != null)) break block11;
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            soXu = dataInputStream.readInt();
            dangChayAuto = dataInputStream.readBoolean();
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
            }
            catch (IOException iOException) {
                }
            break block11;
            catch (IOException iOException) {
                QuanLyRMS.void_do("AicapSettings");
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
                    if (-" ".length() > 0) {
                        break block11;
                    }
                    throw throwable;
                }
            }
        }
    }

            public final String toString() {
        return "Auto Ai Cập";
    }

    protected final void d_() {
        long l;
        if (at.cfr_renamed_0((System.currentTimeMillis() - this.cfr_renamed_3 == 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((this.cfr_renamed_0)) {
            this.cfr_renamed_0 = 0;
            TienIchGame.void_if(2000L);
            go_0.go_0_do().cfr_renamed_11();
            TienIchGame.void_if(2000L);
            return;
        }
        if ((fh.var_int_char == 44)) {
            dd_0 dd_02 = TienIchGame.dd_0_do("nu.hoang");
            if ((dd_02 != null)) {
                fn.fn_do().cfr_renamed_0(dd_02.cfr_renamed_9, 0, 0);
                if ((TienIchGame.boolean_do(15000L))) {
                    this.cfr_renamed_3 = System.currentTimeMillis();
                    TienIchGame.void_if(2000L);
                }
            }
            return;
        }
        if ((fh.var_int_char == 50)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[44][0];
            fh.var_int_try = var_int_arr_arr_do[44][1];
            fn.fn_do().cfr_renamed_3(44, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(1000L);
            }
            return;
        }
        if ((fh.var_int_char == 47)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[50][0];
            fh.var_int_try = var_int_arr_arr_do[50][1];
            fn.fn_do().cfr_renamed_3(50, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((fh.var_int_char == 54)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[47][0];
            fh.var_int_try = var_int_arr_arr_do[47][1];
            fn.fn_do().cfr_renamed_3(47, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((fh.var_int_char == 43)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[54][0];
            fh.var_int_try = var_int_arr_arr_do[54][1];
            fn.fn_do().cfr_renamed_3(54, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((fh.var_int_char == 42)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[43][0];
            fh.var_int_try = var_int_arr_arr_do[43][1];
            fn.fn_do().cfr_renamed_3(43, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((fh.var_int_char == 41)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[42][0];
            fh.var_int_try = var_int_arr_arr_do[42][1];
            fn.fn_do().cfr_renamed_3(42, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((fh.var_int_char == 40)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[41][0];
            fh.var_int_try = var_int_arr_arr_do[41][1];
            fn.fn_do().cfr_renamed_3(41, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((fh.var_int_char == 36)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[40][0];
            fh.var_int_try = var_int_arr_arr_do[40][1];
            fn.fn_do().cfr_renamed_3(40, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((fh.var_int_char == 35)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[36][0];
            fh.var_int_try = var_int_arr_arr_do[36][1];
            fn.fn_do().cfr_renamed_3(36, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((fh.var_int_char == 34)) {
            fh.cfr_renamed_9 = var_int_arr_arr_do[35][0];
            fh.var_int_try = var_int_arr_arr_do[35][1];
            fn.fn_do().cfr_renamed_3(35, -1);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(soXu);
            }
            return;
        }
        if ((fh.var_int_char == 33)) {
            if ((dangChayAuto)) {
                int[] nArray = new int[6];
                nArray[0] = 2102;
                nArray[1] = 2103;
                nArray[2] = 2104;
                nArray[3] = 2105;
                nArray[4] = 2106;
                nArray[5] = 2107;
                int[] nArray2 = nArray;
                at at2 = this;
                this.cfr_renamed_2 = null;
                ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
                if ((TienIchGame.cfr_renamed_4(15000L)) && (at2.cfr_renamed_2 != null)) {
                    int n = 0;
                    while ((n < at2.cfr_renamed_2.size())) {
                        cg cg2 = (cg)at2.cfr_renamed_2.elementAt(n);
                        if ((cg2 != null)) {
                            int n2;
                            block48: {
                                short s2 = cg2.var_short_do;
                                int[] nArray3 = nArray2;
                                int n3 = 0;
                                while ((n3 < nArray3.length)) {
                                    if ((nArray3[n3] == s2)) {
                                        n2 = 1;
                                        break block48;
                                    }
                                    ++n3;
                                    if ((0xBA ^ 0xBE) > "  ".length()) continue;
                                    return;
                                }
                                n2 = 0;
                            }
                            if ((n2 != 0)) {
                                ft_0.ft_0_do().void_do((int)cg2.var_short_do, 1);
                                TienIchGame.void_if(50L);
                            }
                        }
                        ++n;
                        if ((0x4E ^ 0x4A) >= " ".length()) continue;
                        return;
                    }
                }
                at2.cfr_renamed_2 = null;
            }
            if ((AngelChip.var_by_do.cfr_renamed_4 < 100)) {
                int n;
                if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] < 2000)) {
                    AutoController.tatAuto();
                    GameCanvas.hienThongBaoPopup("Không đủ xu mua bánh mỳ");
                    return;
                }
                if ((AngelChip.duLieuNguoiChoi.var_short_for != 480) && (AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0 != 49)) {
                    AngelChip.duLieuNguoiChoi.void_do(480, 49);
                    fn.fn_do().cfr_renamed_1(480, 49, 2, 0);
                    TienIchGame.void_if(500L);
                }
                fn fn2 = fn.fn_do();
                if ((AngelChip.var_by_do.cfr_renamed_4 < 50)) {
                    n = 8;
                    } else {
                    n = 7;
                }
                fn2.cfr_renamed_1((short)n);
                if ((TienIchGame.cfr_renamed_8(15000L))) {
                    TienIchGame.void_if(500L);
                }
                return;
            }
            if ((soLuong < 2000000000)) {
                AutoController.tatAuto();
                GameCanvas.hienThongBaoPopup("Không tìm thấy npc: pharaoh");
                return;
            }
            if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] < 3000)) {
                AutoController.tatAuto();
                GameCanvas.hienThongBaoPopup("Không đủ xu mua vé");
                return;
            }
            fn.fn_do().cfr_renamed_1(soLuong, 0, 0);
            if (at.boolean_do(TienIchGame.cfr_renamed_5(15000L) ? 1 : 0)) {
                return;
            }
            TienIchGame.void_if(500L);
            if ((TienIchGame.cfr_renamed_1(34))) {
                TienIchGame.void_if(1000L);
            }
            return;
        }
        if ((!at.boolean_do(GameCanvas.var_en_do instanceof gO) || (fh.var_int_char == -1)) && at.cfr_renamed_2((l = System.currentTimeMillis() - this.cfr_renamed_4 == 2000L))) {
            TienIchGame.void_if(2000L - l);
        }
        if ((TienIchGame.cfr_renamed_1(33))) {
            TienIchGame.void_if(2500L);
        }
    }
}

