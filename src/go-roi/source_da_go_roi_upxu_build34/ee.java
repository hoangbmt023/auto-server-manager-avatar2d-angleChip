/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class ee
extends ax_0
implements ft_0 {
    private static String chuoiGiaTri;
    private static final int[] mangSoNguyen;
    public ba var_ba_do;
    private static ee var_ee_do;

    private static void cfr_renamed_4() {
        String string = cd.chuoiGiaTri;
        int n = string.indexOf(45);
        if ((n != -1)) {
            string = string.substring(0, n);
        }
        if (ee.boolean_do(string.equals(bl_0.java_lang_String_do(0)) ? 1 : 0)) {
            TienIchGame.aq_0_do();
            TienIchGame.void_if();
        }
    }

    public static Vector java_util_Vector_do(ad_0 ad_02) {
        Vector<DuLieuNguoiChoi> vector = new Vector<DuLieuNguoiChoi>();
        try {
            bk_0 bk_02;
            int n;
            byte by2 = ad_02.var_java_io_DataInputStream_do.readByte();
            int n2 = 0;
            while ((n2 < by2)) {
                n = ad_02.var_java_io_DataInputStream_do.readInt();
                String string = ad_02.var_java_io_DataInputStream_do.readUTF();
                bk_02 = new DuLieuNguoiChoi();
                new DuLieuNguoiChoi().var_short_char = (short)n;
                bk_02.cfr_renamed_0(string);
                byte by3 = ad_02.var_java_io_DataInputStream_do.readByte();
                int n3 = 0;
                while ((n3 < by3)) {
                    short s2 = ad_02.var_java_io_DataInputStream_do.readShort();
                    bk_02.cfr_renamed_1(new ef(s2));
                    ++n3;
                    return null;
                }
                bk_02.coKichHoat = ad_02.var_java_io_DataInputStream_do.readShort();
                bk_02.var_short_if = ad_02.var_java_io_DataInputStream_do.readShort();
                bk_02.var_byte_break = ad_02.var_java_io_DataInputStream_do.readByte();
                vector.addElement((DuLieuNguoiChoi)bk_02);
                if ((n >= 2000000000)) {
                    if (ee.boolean_if(string.equals("than.tai.xiu") ? 1 : 0)) {
                        AutoTaiXiu.var_int_if = n;
                        if (" ".length() != " ".length()) {
                            return null;
                        }
                    } else if (ee.boolean_if(string.equals("lai.buon") ? 1 : 0)) {
                        AutoFarm.var_int_new = n;
                        if (((0xB7 ^ 0x9C) & ~(0x21 ^ 0xA)) < 0) {
                            return null;
                        }
                    } else if (ee.boolean_if(string.equals("tho.kim.hoan") ? 1 : 0)) {
                        ak.soLuong = Z.soLuongKhoa = n;
                        AutoBanDa.var_int_if = Z.soLuongKhoa;
                        boolean bl = bk_02.coKichHoat;
                        Z.soLuong = bl ? 1 : 0;
                        AutoBanDa.soLuong = bl ? 1 : 0;
                        short s3 = bk_02.var_short_if;
                        Z.var_int_if = s3;
                        AutoBanDa.var_int_new = s3;
                        if ("  ".length() != "  ".length()) {
                            return null;
                        }
                    } else if (!ee.boolean_do(string.equals("quay số") ? 1 : 0) || !ee.boolean_do(string.equals("quay.so") ? 1 : 0) || ee.boolean_if(string.equals("nguoi.bi.an") ? 1 : 0)) {
                        fl.var_int_if = n;
                    }
                    gz_0.cfr_renamed_0(string, n);
                }
                ++n2;
                if ("   ".length() >= 0) continue;
                return null;
            }
            n2 = 0;
            while ((n2 < by2)) {
                ((DuLieuNguoiChoi)vector.elementAt((int)n2)).coKichHoat = ad_02.var_java_io_DataInputStream_do.readByte();
                ++n2;
                if (((212 + 120 - 327 + 236 ^ 133 + 161 - 247 + 120) & (0x97 ^ 0xAF ^ (0x39 ^ 0x57) ^ -" ".length())) >= -" ".length()) continue;
                return null;
            }
            n2 = 0;
            while ((n2 < by2)) {
                ((DuLieuNguoiChoi)vector.elementAt((int)n2)).var_short_void = (byte)(100 - ad_02.var_java_io_DataInputStream_do.readByte());
                ++n2;
                if (((0xE6 ^ 0xB2) & ~(0x19 ^ 0x4D)) >= -" ".length()) continue;
                return null;
            }
            n2 = 0;
            while ((n2 < by2)) {
                ((DuLieuNguoiChoi)vector.elementAt((int)n2)).var_short_if = ad_02.var_java_io_DataInputStream_do.readShort();
                ++n2;
                if (((120 + 84 - 137 + 63 ^ 37 + 125 - -3 + 31) & (0xF1 ^ 0xC3 ^ (0xEF ^ 0x9B) ^ -" ".length())) == 0) continue;
                return null;
            }
            n = ad_02.var_java_io_DataInputStream_do.readByte();
            int n4 = 0;
            while ((n4 < n)) {
                bk_02 = new dB();
                new dB().var_byte_do = ad_02.var_java_io_DataInputStream_do.readByte();
                ((dB)bk_02).var_short_do = ad_02.var_java_io_DataInputStream_do.readShort();
                ((dB)bk_02).soLuong = ad_02.var_java_io_DataInputStream_do.readInt();
                ((dB)bk_02).cfr_renamed_3 = ad_02.var_java_io_DataInputStream_do.readShort();
                ((dB)bk_02).cfr_renamed_1 = ad_02.var_java_io_DataInputStream_do.readShort();
                vector.addElement((DuLieuNguoiChoi)bk_02);
                ++n4;
                if (-"  ".length() < 0) continue;
                return null;
            }
            ef_0.var_java_util_Vector_char = null;
            n4 = 0;
            if (ee.boolean_for(ad_02.var_java_io_DataInputStream_do.available())) {
                n4 = ad_02.var_java_io_DataInputStream_do.readByte();
            }
            if (ee.boolean_for(n4)) {
                ef_0.var_java_util_Vector_char = new Vector();
                int n5 = 0;
                while ((n5 < n4)) {
                    eq_0 eq_02 = new eq_0();
                    new eq_0().cfr_renamed_3 = ad_02.var_java_io_DataInputStream_do.readShort();
                    eq_02.var_int_if = ad_02.var_java_io_DataInputStream_do.readShort();
                    eq_02.soLuong = ad_02.var_java_io_DataInputStream_do.readShort();
                    eq_02.var_short_do = ad_02.var_java_io_DataInputStream_do.readByte();
                    ef_0.var_java_util_Vector_char.addElement(eq_02);
                    ++n5;
                    return null;
                }
            }
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if ((0x90 ^ 0x94) == 0) {
            return null;
        }
        return vector;
    }

    private static Vector java_util_Vector_if(ad_0 ad_02) {
        try {
            byte by2 = ad_02.var_java_io_DataInputStream_do.readByte();
            Vector<fi_0> vector = new Vector<fi_0>();
            int n = 0;
            while ((n < by2)) {
                fi_0 fi_02 = new fi_0();
                new fi_0().cfr_renamed_3 = ad_02.var_java_io_DataInputStream_do.readByte();
                fi_02.cfr_renamed_4 = ad_02.var_java_io_DataInputStream_do.readShort();
                fi_02.cfr_renamed_2 = ad_02.var_java_io_DataInputStream_do.readByte();
                fi_02.cfr_renamed_1 = ad_02.var_java_io_DataInputStream_do.readShort();
                fi_02.var_short_do = ad_02.var_java_io_DataInputStream_do.readShort();
                byte by3 = ad_02.var_java_io_DataInputStream_do.readByte();
                fi_02.var_java_util_Vector_do = new Vector();
                int n2 = 0;
                while ((n2 < by3)) {
                    eq_0 eq_02 = new eq_0();
                    new eq_0().var_int_if = ad_02.var_java_io_DataInputStream_do.readByte();
                    eq_02.soLuong = ad_02.var_java_io_DataInputStream_do.readByte();
                    fi_02.var_java_util_Vector_do.addElement(eq_02);
                    ++n2;
                    if (((0x4B ^ 0x72 ^ (0x8E ^ 0xB9)) & (114 + 12 - 94 + 155 ^ 161 + 175 - 304 + 149 ^ -" ".length())) == 0) continue;
                    return null;
                }
                vector.addElement(fi_02);
                ++n;
                if ("  ".length() <= (0x4C ^ 0xB ^ (0x79 ^ 0x3A))) continue;
                return null;
            }
            return vector;
        }
        catch (IOException iOException) {
            return null;
        }
    }

                private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static void cfr_renamed_5() {
        mangSoNguyen = new int[71];
        0 = (19 + 77 - -29 + 53 ^ 50 + 131 - 127 + 91) & (0x32 ^ 0x4E ^ (0x4C ^ 0x13) ^ -" ".length());
        8 = 0x21 ^ 0x29;
        1 = " ".length();
        110 = 0x43 ^ 0x30 ^ (0xF ^ 0x12);
        3 = "   ".length();
        100 = 0x4A ^ 0x58 ^ (0x4B ^ 0x3D);
        2000000000 = 0xFFFFBFFE & 0x7735D401;
        -1 = -" ".length();
        -108 = -(7 ^ 0x6B);
        -53 = -(123 + 172 - 185 + 63 ^ 151 + 7 - 65 + 59);
        5 = 0xB9 ^ 0xBC;
        2 = "  ".length();
        4 = 0x77 ^ 0x7B ^ (0x1B ^ 0x13);
        45 = 0x5E ^ 0x6B ^ (0x69 ^ 0x71);
        24 = 146 + 0 - 117 + 122 ^ 89 + 18 - -7 + 29;
        25 = 0x39 ^ 0x20;
        23 = 0x43 ^ 0x2D ^ (0x65 ^ 0x1C);
        -2 = -"  ".length();
        9 = 0xEC ^ 0xC0 ^ (0x48 ^ 0x6D);
        21 = 0xB0 ^ 0xA5;
        38 = 0xE7 ^ 0xC1;
        104 = 67 + 50 - -88 + 24 ^ 67 + 17 - 42 + 99;
        262 = 0xFFFFABA7 & 0x555E;
        146 = 12 + 111 - 90 + 113;
        69 = 0x1C ^ 0x2D ^ (0x29 ^ 0x5D);
        454 = -(0xFFFFF73E & 0x3ECB) & (0xFFFFFFFF & 0x37CF);
        147 = (0x40 ^ 0xC) + (0xBA ^ 0x9D) - (0x3E ^ 0x5E) + (57 + 88 - 123 + 106);
        6 = 0x2D ^ 0x2B;
        7 = 0xC3 ^ 0xC4;
        102 = 0xDB ^ 0xBD;
        140 = (0xF9 ^ 0xAC) + (35 + 25 - 25 + 94) - (72 + 172 - 228 + 172) + (0x43 ^ 0x31);
        10 = 104 + 2 - 64 + 103 ^ 68 + 143 - 162 + 106;
        138 = (0x98 ^ 0x95) + (0x38 ^ 0x28) - -(0x24 ^ 0x1E) + (0xB0 ^ 0x83);
        11 = 0x82 ^ 0x89;
        145 = 34 + 4 - -49 + 58;
        12 = 0x84 ^ 0x88;
        13 = 0x6C ^ 0x21 ^ (0x32 ^ 0x72);
        141 = 91 + 81 - 97 + 66;
        14 = 0xF7 ^ 0xA6 ^ (0x68 ^ 0x37);
        142 = 75 + 43 - 62 + 86;
        15 = 0x65 ^ 0x6A;
        149 = 111 + 97 - 83 + 24;
        16 = 0x5F ^ 0x42 ^ (0x7C ^ 0x71);
        17 = 0xD ^ 0x1C;
        310 = 0xFFFF9D7F & 0x63B6;
        18 = 125 + 74 - 69 + 7 ^ 106 + 121 - 198 + 126;
        264 = -(0xFFFFAEFB & 0x57B7) & (0xFFFF87FB & 0x7FBE);
        19 = 0x23 ^ 0x6D ^ (0 ^ 0x5D);
        20 = 0x43 ^ 0x57;
        153 = 18 + 80 - 2 + 57;
        7878 = -(0xFFFFD54B & 0x6BBD) & (0xFFFFFFEF & 0x5FDE);
        22 = 0x65 ^ 0x73;
        148 = 9 + 115 - 115 + 139;
        151 = 58 + 51 - -9 + 18 + (0 ^ 0x4F) - (0xCA ^ 0xB1) + (0x5C ^ 0x67);
        134 = 29 + 117 - 52 + 40;
        26 = 0x65 ^ 0x5E ^ (0x5F ^ 0x7E);
        27 = 0xEF ^ 0xBE ^ (0x76 ^ 0x3C);
        28 = 0x83 ^ 0x9F;
        29 = 0xB9 ^ 0xA4;
        30 = 0xB5 ^ 0xAB;
        271 = -(0xFFFFDDF9 & 0x7297) & (0xFFFFD7DF & 0x79BF);
        31 = 0x28 ^ 0x37;
        32 = 151 + 72 - 104 + 48 ^ 87 + 56 - 19 + 11;
        33 = 0xB6 ^ 0x97;
        135 = 123 + 73 - 171 + 110;
        34 = 0x1A ^ 0x3B ^ "   ".length();
        7880 = -(0xFFFFC356 & 0x7CBD) & (0xFFFFFFDF & 0x5EFB);
        35 = 210 + 54 - 209 + 170 ^ 173 + 85 - 257 + 193;
        36 = 0xB ^ 0x40 ^ (0x29 ^ 0x46);
        70 = 0x9D ^ 0xA8 ^ (0xB ^ 0x78);
        37 = "   ".length() ^ (0 ^ 0x26);
    }

            public static void void_do(ad_0 ad_02) {
        try {
            int n = ad_02.var_java_io_DataInputStream_do.readInt();
            short s2 = ad_02.var_java_io_DataInputStream_do.readShort();
            short s3 = ad_02.var_java_io_DataInputStream_do.readShort();
            byte by2 = ad_02.var_java_io_DataInputStream_do.readByte();
            short s4 = 0;
            if (ee.boolean_for(ad_02.var_java_io_DataInputStream_do.available())) {
                s4 = ad_02.var_java_io_DataInputStream_do.readShort();
            }
            fe_0.fe_0_do();
            fe_0.cfr_renamed_0(n, s2, (int)s3, (int)by2, s4);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

        /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void void_if(ad_0 var1_1) {
        try {
            switch (var1_1.var_byte_do) {
                case -107: {
                    var2_2 = var1_1.cfr_renamed_0().readByte();
                    var3_57 = null;
                    var4_102 = null;
                    var5_141 = null;
                    var6_179 = null;
                    var7_199 = null;
                    var8_220 = null;
                    var9_239 = null;
                    var10_251 = null;
                    if (ee.boolean_do(var2_2)) {
                        var3_57 = var1_1.cfr_renamed_0().readUTF();
                        var12_256 = var1_1.cfr_renamed_0().readShort();
                        var4_102 = new String[var12_256];
                        var7_199 = new short[var12_256];
                        var5_141 = new String[var12_256];
                        var6_179 = new String[var12_256];
                        var8_220 = new short[var12_256];
                        var9_239 = new short[var12_256];
                        var11_259 = 0;
                        while ((var11_259 < var12_256)) {
                            var8_220[var11_259] = var1_1.cfr_renamed_0().readShort();
                            var7_199[var11_259] = var1_1.cfr_renamed_0().readShort();
                            var9_239[var11_259] = var1_1.cfr_renamed_0().readShort();
                            var4_102[var11_259] = var1_1.cfr_renamed_0().readUTF();
                            var5_141[var11_259] = var1_1.cfr_renamed_0().readUTF();
                            var6_179[var11_259] = var1_1.cfr_renamed_0().readUTF();
                            ++var11_259;
                            if ("  ".length() != ("   ".length() & ("   ".length() ^ -" ".length()))) continue;
                            return;
                        }
                    } else if ((var2_2 == 1)) {
                        var3_57 = var1_1.cfr_renamed_0().readUTF();
                        var12_257 = var1_1.cfr_renamed_0().readShort();
                        var8_220 = new short[var12_257];
                        var4_102 = new String[var12_257];
                        var7_199 = new short[var12_257];
                        var10_251 = new int[var12_257];
                        var6_179 = new String[var12_257];
                        var9_239 = new short[var12_257];
                        var5_141 = new String[var12_257];
                        var11_260 = 0;
                        while ((var11_260 < var12_257)) {
                            var8_220[var11_260] = var1_1.cfr_renamed_0().readShort();
                            var4_102[var11_260] = var1_1.cfr_renamed_0().readUTF();
                            var5_141[var11_260] = var1_1.cfr_renamed_0().readUTF();
                            var7_199[var11_260] = var1_1.cfr_renamed_0().readShort();
                            var9_239[var11_260] = var1_1.cfr_renamed_0().readShort();
                            var10_251[var11_260] = var1_1.cfr_renamed_0().readInt();
                            var6_179[var11_260] = var1_1.cfr_renamed_0().readUTF();
                            ++var11_260;
                            if (" ".length() <= (105 ^ 109)) continue;
                            return;
                        }
                    }
                    fe.fe_do();
                    fe.cfr_renamed_0(var2_2, var3_57, var4_102, var7_199, var8_220, var5_141, var6_179, var10_251, var9_239);
                    return;
                }
                case -105: {
                    var2_3 = var1_1.cfr_renamed_0().readByte();
                    var3_58 = new Vector<fh>();
                    var4_103 = 0;
                    while ((var4_103 < var2_3)) {
                        var5_143 = var1_1.cfr_renamed_0().readShort();
                        var6_180 = var1_1.cfr_renamed_0().readUTF();
                        var5_142 = new fh(var6_180, new ft(var4_103), var5_143);
                        var3_58.addElement(var5_142);
                        ++var4_103;
                        if (-"   ".length() < 0) continue;
                        return;
                    }
                    GameCanvas.cfr_renamed_8();
                    if ((AutoController.nhiemVuHienTai != null) && ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoChamEmBe) && ee.boolean_if((int)AutoChamEmBe.cfr_renamed_2) && (ef_0.soLuong == 110)) {
                        AutoChamEmBe.cfr_renamed_0(var3_58);
                        AutoChamEmBe.cfr_renamed_4();
                        return;
                    }
                    bF.bF_do();
                    bF.cfr_renamed_0(var3_58);
                    }
                case -103: {
                    var4_104 = ef_0.dd_0_do(var1_1.cfr_renamed_0().readInt());
                    if (ee.boolean_do(var1_1.cfr_renamed_0().readByte())) {
                        var4_104.var_short_if = var1_1.cfr_renamed_0().readShort();
                        if (-"  ".length() < 0) ** GOTO lbl1395
                        return;
                    }
                    var4_104.var_short_byte = var1_1.cfr_renamed_0().readShort();
                    }
                case -102: {
                    var5_144 = var1_1.cfr_renamed_0().readInt();
                    var6_181 = var1_1.cfr_renamed_0().readInt();
                    if (ee.boolean_if((int)t_0.dangChayAuto)) {
                        var5_145 = a_0.dd_0_do(var5_144);
                        if (" ".length() > " ".length()) {
                            return;
                        }
                    } else {
                        var5_145 = ef_0.dd_0_do(var5_144);
                    }
                    if (!(var5_145 != null)) return;
                    var5_145.mangSoNguyen[3] = var6_181;
                    return;
                }
                case -101: {
                    var2_4 = var1_1.cfr_renamed_0().readByte();
                    var3_59 = var1_1.cfr_renamed_0().readShort();
                    if ((var2_4 == 1)) {
                        var4_105 = new ev_0();
                        new ev_0().soLuong = var3_59;
                        var4_105.cfr_renamed_1 = var1_1.cfr_renamed_0().readUTF();
                        var4_105.cfr_renamed_5 = var1_1.cfr_renamed_0().readShort();
                        var4_105.cfr_renamed_12 = var1_1.cfr_renamed_0().readByte();
                        fe_0.var_java_util_Vector_if.addElement(var4_105);
                        if ((GameCanvas.var_dL_do == em_0.em_0_do())) {
                            em_0.em_0_do().cfr_renamed_2();
                        }
                        if ((ef_0.var_aG_do != null)) {
                            ec.cfr_renamed_0().cfr_renamed_4();
                            }
                        ec.cfr_renamed_0();
                        ec.cfr_renamed_5();
                        if (-" ".length() == -" ".length()) ** GOTO lbl1395
                        return;
                    }
                    var4_106 = 0;
                    while ((var4_106 < fe_0.var_java_util_Vector_if.size())) {
                        if (ee.cfr_renamed_5(((ev_0)fe_0.var_java_util_Vector_if.elementAt((int)var4_106)).soLuong, var3_59)) {
                            fe_0.var_java_util_Vector_if.removeElementAt(var4_106);
                            if ((37 ^ 33) != "  ".length()) ** GOTO lbl1395
                            return;
                        }
                        ++var4_106;
                        if ("  ".length() >= ((50 ^ 6) & ~(162 ^ 150))) continue;
                        return;
                    }
                    break;
                }
                case -99: {
                    var4_107 = var1_1.cfr_renamed_0().readByte();
                    var3_60 = var1_1.cfr_renamed_0().readByte();
                    var5_146 = new Vector<Object>();
                    var6_182 = 0;
                    while ((var6_182 < var3_60)) {
                        var7_200 = new DuLieuNguoiChoi();
                        new DuLieuNguoiChoi().var_short_char = (short)var1_1.cfr_renamed_0().readInt();
                        var8_221 = var1_1.cfr_renamed_0().readUTF();
                        var7_200.cfr_renamed_0((String)var8_221);
                        var2_5 = var1_1.cfr_renamed_0().readByte();
                        var9_240 = 0;
                        while ((var9_240 < var2_5)) {
                            var7_200.cfr_renamed_1(new ef(var1_1.cfr_renamed_0().readShort()));
                            ++var9_240;
                            if (((101 + 8 - -55 + 4 ^ 82 + 125 - 78 + 0) & (168 ^ 150 ^ (83 ^ 68) ^ -" ".length())) == 0) continue;
                            return;
                        }
                        var7_200.coKichHoat = var1_1.cfr_renamed_0().readShort();
                        var7_200.var_short_if = var1_1.cfr_renamed_0().readShort();
                        var7_200.var_byte_break = var1_1.cfr_renamed_0().readByte();
                        var7_200.var_short_void = (byte)(100 - var1_1.cfr_renamed_0().readByte());
                        var7_200.var_short_if = var1_1.cfr_renamed_0().readShort();
                        var2_5 = var1_1.cfr_renamed_0().readByte();
                        var7_200.var_java_lang_String_arr_do = new String[var2_5 + 1];
                        var7_200.var_java_lang_String_arr_do[0] = ee.java_lang_String_do();
                        var9_240 = 1;
                        while ((var9_240 == var2_5)) {
                            var7_200.var_java_lang_String_arr_do[var9_240] = var1_1.cfr_renamed_0().readUTF();
                            ++var9_240;
                            if (" ".length() >= 0) continue;
                            return;
                        }
                        if ((var7_200.var_short_char >= 2000000000)) {
                            gz_0.cfr_renamed_0((String)var8_221, var7_200.var_short_char);
                        }
                        var5_146.addElement(var7_200);
                        ++var6_182;
                        if (-" ".length() < 0) continue;
                        return;
                    }
                    var6_182 = var1_1.cfr_renamed_0().readShort();
                    var7_200 = null;
                    var8_221 = null;
                    if (ee.boolean_for(var6_182)) {
                        var7_200 = ee.java_util_Vector_if(var1_1);
                        var8_221 = ee.java_util_Vector_for(var1_1);
                    }
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var4_107, var5_146, (Vector)var7_200, (Vector)var8_221);
                    if ("   ".length() < (153 ^ 182 ^ (82 ^ 121))) ** GOTO lbl1395
                    return;
                }
                case -98: {
                    var2_6 = var1_1.cfr_renamed_0().readShort();
                    var9_241 = new byte[var1_1.cfr_renamed_0().readShort()];
                    var1_1.cfr_renamed_0().read(var9_241);
                    ci_0.var_java_util_Hashtable_do.put("" + var2_6, new an(gc_0.javax_microedition_lcdui_Image_do(var9_241)));
                    return;
                }
                case -97: {
                    var2_7 /* !! */  = new byte[var1_1.cfr_renamed_0().available()];
                    var1_1.cfr_renamed_0().read(var2_7 /* !! */ );
                    var2_7 /* !! */  = (byte[])((q_0)ci_0.cfr_renamed_0(var2_7 /* !! */ , 1).elementAt(0));
                    ci_0.var_java_util_Hashtable_for.put("" + var2_7 /* !! */ .var_short_do, var2_7 /* !! */ );
                    var2_8 = 0;
                    do {
                        if (!(var2_8 < ef_0.var_java_util_Vector_do.size())) {
                            return;
                        }
                        var3_61 = (aG)ef_0.var_java_util_Vector_do.elementAt(var2_8);
                        if (ee.boolean_do(var3_61.var_byte_if)) {
                            ((DuLieuNguoiChoi)var3_61).void_if();
                        }
                        ++var2_8;
                        } while ("  ".length() < "   ".length());
                    return;
                }
                case -96: {
                    GameCanvas.cfr_renamed_8();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_10();
                    bK.cfr_renamed_0().cfr_renamed_8();
                    bK.cfr_renamed_0().soLuong = 0;
                    return;
                }
                case -94: {
                    var2_9 = var1_1.cfr_renamed_0().readByte();
                    var3_62 = new byte[var1_1.cfr_renamed_0().available()];
                    var1_1.cfr_renamed_0().read(var3_62);
                    ef_0.cfr_renamed_0(var2_9, var3_62);
                    return;
                }
                case -93: {
                    var2_10 = var1_1.cfr_renamed_0().readByte();
                    var3_63 = var1_1.cfr_renamed_0().readByte();
                    var1_1.cfr_renamed_0().readShort();
                    var4_108 = var1_1.cfr_renamed_0().readByte();
                    var5_147 = new byte[var1_1.cfr_renamed_0().readShort()];
                    var1_1.cfr_renamed_0().read(var5_147);
                    var6_183 = null;
                    var7_201 = var1_1.cfr_renamed_0().readByte();
                    if (ee.boolean_for(var7_201)) {
                        var6_183 = new short[var7_201];
                        var8_222 = 0;
                        while ((var8_222 < var7_201)) {
                            var6_183[var8_222] = var1_1.cfr_renamed_0().readShort();
                            ++var8_222;
                            if ("   ".length() >= "   ".length()) continue;
                            return;
                        }
                    }
                    var8_222 = var1_1.cfr_renamed_0().readShort();
                    var7_202 = null;
                    if (ee.boolean_for(var8_222)) {
                        var8_223 = new byte[var8_222];
                        var1_1.cfr_renamed_0().read(var8_223);
                        var7_202 = gc_0.javax_microedition_lcdui_Image_do(var8_223);
                    }
                    var8_224 = var1_1.cfr_renamed_0().readShort();
                    var9_242 = null;
                    var10_252 = null;
                    if (ee.boolean_for(var8_224)) {
                        var9_242 = ee.java_util_Vector_if(var1_1);
                        var10_252 = ee.java_util_Vector_for(var1_1);
                    }
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var5_147, var2_10, var3_63, var4_108, var7_202, var6_183, var9_242, var10_252);
                    return;
                }
                case -92: {
                    var1_1.cfr_renamed_0().readByte();
                    var2_11 = new byte[var1_1.cfr_renamed_0().readInt()];
                    var1_1.cfr_renamed_0().read(var2_11);
                    var2_12 = var1_1.cfr_renamed_0().readInt();
                    var1_1.cfr_renamed_0().readByte();
                    var3_64 = new byte[var2_12];
                    var4_109 = 0;
                    while ((var4_109 < var2_12)) {
                        var3_64[var4_109] = var1_1.cfr_renamed_0().readByte();
                        ++var4_109;
                        if (-" ".length() == -" ".length()) continue;
                        return;
                    }
                    var4_109 = var1_1.cfr_renamed_0().readByte();
                    var2_13 = new Vector<bv>();
                    var3_65 = 0;
                    do {
                        if (!(var3_65 < var4_109)) {
                            fw.coTrangThai = 0;
                            fw.cfr_renamed_0().cfr_renamed_8();
                            ef_0.soLuong = -1;
                            ef_0.var_int_case = -108;
                            ef_0.var_int_byte = -1;
                            return;
                        }
                        var5_148 = new bv();
                        var1_1.cfr_renamed_0().readByte();
                        var5_148.var_short_do = var1_1.cfr_renamed_0().readShort();
                        var5_148.chuoiGiaTri = var1_1.cfr_renamed_0().readUTF();
                        var5_148.var_byte_do = var1_1.cfr_renamed_0().readByte();
                        var5_148.cfr_renamed_1 = var1_1.cfr_renamed_0().readByte();
                        var2_13.addElement(var5_148);
                        ++var3_65;
                        } while (-" ".length() < 0);
                    return;
                }
                case -90: 
                case -53: {
                    var2_14 = var1_1.cfr_renamed_0().readByte();
                    var5_149 = var1_1.cfr_renamed_0().readUTF();
                    if ((var1_1.var_byte_do == -53)) {
                        v0 = 0;
                        if ((74 + 187 - 203 + 135 ^ 61 + 151 - 17 + 2) <= " ".length()) {
                            return;
                        }
                    } else {
                        v0 = 1;
                    }
                    c.cfr_renamed_0((byte)v0, var2_14, var5_149);
                    return;
                }
                case -89: {
                    fe.fe_do().cfr_renamed_0(var1_1.cfr_renamed_0().readBoolean(), var1_1.cfr_renamed_0().readUTF());
                    return;
                }
                case -88: {
                    fe.fe_do();
                    fe.cfr_renamed_4();
                    return;
                }
                case -87: {
                    var3_66 = var1_1.cfr_renamed_0().readShort();
                    var5_150 = new Vector<ef>();
                    var2_15 = 0;
                    while ((var2_15 < var3_66)) {
                        var4_110 = new ef();
                        new ef().var_short_do = var1_1.cfr_renamed_0().readShort();
                        var4_110.var_byte_do = var1_1.cfr_renamed_0().readByte();
                        var4_110.chuoiGiaTri = var1_1.cfr_renamed_0().readUTF();
                        var5_150.addElement(var4_110);
                        ++var2_15;
                        if (" ".length() <= " ".length()) continue;
                        return;
                    }
                    var2_15 = var1_1.cfr_renamed_0().readInt();
                    var4_111 = var1_1.cfr_renamed_0().readByte();
                    var3_66 = var1_1.cfr_renamed_0().readShort();
                    var6_184 = new Vector<ef>();
                    var7_203 = 0;
                    do {
                        if (!(var7_203 < var3_66)) {
                            fe.fe_do().cfr_renamed_0(var5_150, var6_184, var2_15, var4_111);
                            return;
                        }
                        var8_225 = new ef();
                        new ef().var_short_do = var1_1.cfr_renamed_0().readShort();
                        var8_225.var_byte_do = var1_1.cfr_renamed_0().readByte();
                        var8_225.chuoiGiaTri = var1_1.cfr_renamed_0().readUTF();
                        var6_184.addElement(var8_225);
                        ++var7_203;
                        } while (" ".length() >= 0);
                    return;
                }
                case -85: {
                    var2_16 = var1_1.cfr_renamed_0().readInt();
                    var7_204 = var1_1.cfr_renamed_0().readByte();
                    var8_226 = new Vector<ex_0>();
                    var3_67 = 0;
                    while (true) {
                        if (!(var3_67 < var7_204)) {
                            fe_0.fe_0_do();
                            fe_0.cfr_renamed_0(var2_16, var8_226);
                            return;
                        }
                        var4_112 = new ex_0();
                        var1_1.cfr_renamed_0().readByte();
                        var4_112.cfr_renamed_0 = var1_1.cfr_renamed_0().readShort();
                        var4_112.cfr_renamed_1 = var1_1.cfr_renamed_0().readShort();
                        var8_226.addElement(var4_112);
                        ++var3_67;
                        }
                }
                case -84: {
                    var5_151 = var1_1.cfr_renamed_0().readByte();
                    var4_113 = var1_1.cfr_renamed_0().readByte();
                    if (!(var4_113 != 5) || !(var4_113 != 2)) return;
                    if (ee.boolean_do(var5_151)) {
                        if (ee.cfr_renamed_1(ci_0.go_0_do((short)var4_113))) {
                            db_0.db_0_do().cfr_renamed_1((short)var4_113);
                        }
                        var7_205 = new o_0();
                        new o_0().cfr_renamed_5 = (short)var4_113;
                        var7_205.var_byte_if = var1_1.cfr_renamed_0().readByte();
                        var7_205.cfr_renamed_2 = var7_205.cfr_renamed_12 = (short)var1_1.cfr_renamed_0().readByte();
                        if ((var7_205.var_byte_if != 4)) {
                            var7_205.cfr_renamed_8 = var1_1.cfr_renamed_0().readShort();
                            var7_205.var_byte_do = var1_1.cfr_renamed_0().readByte();
                            if ((var7_205.var_byte_do == 1)) {
                                var7_205.cfr_renamed_4 = var1_1.cfr_renamed_0().readShort();
                                if (((236 ^ 140) & ~(229 ^ 133)) > " ".length()) {
                                    return;
                                }
                            } else if ((var7_205.var_byte_do == 2)) {
                                var2_17 = var1_1.cfr_renamed_0().readByte();
                                var7_205.var_short_arr_if = new short[var2_17];
                                var7_205.var_short_arr_do = new short[var2_17];
                                var3_68 = 0;
                                while ((var3_68 < var2_17)) {
                                    var7_205.var_short_arr_if[var3_68] = var1_1.cfr_renamed_0().readShort();
                                    var7_205.var_short_arr_do[var3_68] = var1_1.cfr_renamed_0().readShort();
                                    ++var3_68;
                                    }
                            }
                            if (ee.boolean_do(var7_205.var_byte_if)) {
                                var7_205.soLuong = var1_1.cfr_renamed_0().readInt();
                                if (((169 ^ 178 ^ (227 ^ 181) & ~(113 ^ 39)) & (45 + 110 - -5 + 20 ^ 134 + 41 - 0 + 0 ^ -" ".length())) != 0) {
                                    return;
                                }
                            } else {
                                var7_205.cfr_renamed_15 = var1_1.cfr_renamed_0().readShort();
                                var7_205.var_short_if = var1_1.cfr_renamed_0().readShort();
                            }
                            fe_0.fe_0_do();
                            fe_0.cfr_renamed_0(var7_205);
                            return;
                        }
                        var3_69 = var1_1.cfr_renamed_0().readShort();
                        var6_185 = var1_1.cfr_renamed_0().readByte();
                        if (ee.boolean_for(GameCanvas.var_java_util_Vector_if.size())) {
                            var5_151 = 0;
                            while ((var5_151 < GameCanvas.var_java_util_Vector_if.size())) {
                                if (ee.cfr_renamed_5(((bb_0)GameCanvas.var_java_util_Vector_if.elementAt((int)var5_151)).var_short_do, var4_113)) {
                                    return;
                                }
                                ++var5_151;
                                }
                        }
                        var2_18 = new er_0(2, var3_69);
                        new er_0(2, var3_69).soLuong = var6_185;
                        var2_18.var_ep_do = (ep)((short)var4_113);
                        var2_18.cfr_renamed_1();
                        return;
                    }
                    var7_206 = new go_0();
                    new go_0().var_short_do = (short)var4_113;
                    var2_19 = new byte[var1_1.cfr_renamed_0().readShort()];
                    var1_1.cfr_renamed_0().read(var2_19);
                    var7_206.var_javax_microedition_lcdui_Image_do = gc_0.javax_microedition_lcdui_Image_do(var2_19);
                    var6_186 = var1_1.cfr_renamed_0().readByte();
                    var7_206.var_bH_arr_do = new bH[var6_186];
                    var5_151 = 0;
                    while ((var5_151 < var6_186)) {
                        var7_206.var_bH_arr_do[var5_151] = new bH();
                        var7_206.var_bH_arr_do[var5_151].var_short_do = var1_1.cfr_renamed_0().readByte();
                        var7_206.var_bH_arr_do[var5_151].cfr_renamed_4 = var1_1.cfr_renamed_0().readByte();
                        var7_206.var_bH_arr_do[var5_151].cfr_renamed_2 = var1_1.cfr_renamed_0().readByte();
                        var7_206.var_bH_arr_do[var5_151].cfr_renamed_5 = var1_1.cfr_renamed_0().readByte();
                        var7_206.var_bH_arr_do[var5_151].cfr_renamed_3 = var1_1.cfr_renamed_0().readByte();
                        ++var5_151;
                        if ("  ".length() >= 0) continue;
                        return;
                    }
                    var3_70 = var1_1.cfr_renamed_0().readByte();
                    var7_206.var_l_0_arr_do = new l_0[var3_70];
                    var4_113 = 0;
                    while ((var4_113 < var3_70)) {
                        var7_206.var_l_0_arr_do[var4_113] = new l_0();
                        var5_151 = var1_1.cfr_renamed_0().readByte();
                        var7_206.var_l_0_arr_do[var4_113].var_short_arr_do = new short[var5_151];
                        var7_206.var_l_0_arr_do[var4_113].cfr_renamed_1 = new short[var5_151];
                        var7_206.var_l_0_arr_do[var4_113].var_byte_arr_do = new byte[var5_151];
                        var2_20 = 0;
                        while ((var2_20 < var5_151)) {
                            var7_206.var_l_0_arr_do[var4_113].var_short_arr_do[var2_20] = var1_1.cfr_renamed_0().readByte();
                            var7_206.var_l_0_arr_do[var4_113].cfr_renamed_1[var2_20] = var1_1.cfr_renamed_0().readByte();
                            var7_206.var_l_0_arr_do[var4_113].var_byte_arr_do[var2_20] = var1_1.cfr_renamed_0().readByte();
                            ++var2_20;
                            if (" ".length() >= 0) continue;
                            return;
                        }
                        ++var4_113;
                        if ("   ".length() < (137 ^ 141)) continue;
                        return;
                    }
                    var4_113 = var1_1.cfr_renamed_0().readByte();
                    var7_206.var_byte_arr_do = new byte[var4_113];
                    var5_151 = 0;
                    do {
                        if (!(var5_151 < var4_113)) {
                            ci_0.var_java_util_Vector_int.addElement(var7_206);
                            return;
                        }
                        var7_206.var_byte_arr_do[var5_151] = var1_1.cfr_renamed_0().readByte();
                        ++var5_151;
                        } while (-"  ".length() <= 0);
                    return;
                }
                case -83: {
                    var5_152 = var1_1.cfr_renamed_0().readByte();
                    var6_187 = new Vector<ev_0>();
                    var2_21 = 0;
                    do {
                        if (!(var2_21 < var5_152)) {
                            fe_0.fe_0_do();
                            fe_0.cfr_renamed_1(var6_187);
                            return;
                        }
                        var7_207 = new ev_0();
                        new ev_0().soLuong = var1_1.cfr_renamed_0().readShort();
                        var7_207.cfr_renamed_1 = var1_1.cfr_renamed_0().readUTF();
                        var7_207.cfr_renamed_5 = var1_1.cfr_renamed_0().readShort();
                        var6_187.addElement(var7_207);
                        ++var2_21;
                        } while ("   ".length() >= " ".length());
                    return;
                }
                case -82: {
                    var7_208 = var1_1.cfr_renamed_0().readInt();
                    var2_22 = var1_1.cfr_renamed_0().readShort();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_1(var7_208, var2_22);
                    return;
                }
                case -81: {
                    var3_71 = var1_1.cfr_renamed_0().readUTF();
                    var4_114 = 0;
                    var5_153 = 0;
                    while ((var5_153 < var3_71.length())) {
                        if ((var3_71.charAt(var5_153) == 45)) {
                            ++var4_114;
                        }
                        ++var5_153;
                        if ("   ".length() != -" ".length()) continue;
                        return;
                    }
                    var5_154 = new byte[var1_1.cfr_renamed_0().available()];
                    var1_1.cfr_renamed_0().read(var5_154);
                    if ((var4_114 != 2) && ee.boolean_do((int)var3_71.equals(es.chuoiGiaTri))) {
                        es.cfr_renamed_0().cfr_renamed_0(var5_154, var3_71);
                        GameCanvas.cfr_renamed_8();
                        return;
                    }
                    es.var_java_util_Hashtable_do.put(var3_71, var5_154);
                    es.cfr_renamed_0().cfr_renamed_0(var3_71);
                    return;
                }
                case -80: {
                    var2_23 = var1_1.cfr_renamed_0().readShort();
                    var3_72 = new byte[var1_1.cfr_renamed_0().readShort()];
                    var1_1.cfr_renamed_0().read(var3_72);
                    ci_0.var_java_util_Hashtable_if.put("" + var2_23, new an(gc_0.javax_microedition_lcdui_Image_do(var3_72)));
                    return;
                }
                case -78: {
                    var3_73 = var1_1.cfr_renamed_0().readByte();
                    var4_115 = var1_1.cfr_renamed_0().readInt();
                    var5_155 = var1_1.cfr_renamed_0().readByte();
                    var6_188 = var1_1.cfr_renamed_0().readUTF();
                    var7_209 = var1_1.cfr_renamed_0().readShort();
                    if (!ee.boolean_for(var7_209)) return;
                    var8_227 = new short[var7_209];
                    var9_243 = new String[var7_209];
                    var10_253 = null;
                    if ((var3_73 == 1)) {
                        var10_253 = new String[var7_209];
                    }
                    var2_24 = 0;
                    while ((var2_24 < var7_209)) {
                        var8_227[var2_24] = var1_1.cfr_renamed_0().readShort();
                        var9_243[var2_24] = var1_1.cfr_renamed_0().readUTF();
                        if ((var3_73 == 1)) {
                            var10_253[var2_24] = var1_1.cfr_renamed_0().readUTF();
                        }
                        ++var2_24;
                        }
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var3_73, (int)var5_155, var6_188, var8_227, var4_115, var9_243);
                    return;
                }
                case -77: {
                    var2_25 = var1_1.cfr_renamed_0().readInt();
                    var8_228 = var1_1.cfr_renamed_0().readByte();
                    var9_244 = var1_1.cfr_renamed_0().readUTF();
                    var10_254 = var1_1.cfr_renamed_0().readByte();
                    var3_74 = new String[var10_254];
                    var4_116 = 0;
                    while ((var4_116 < var10_254)) {
                        var3_74[var4_116] = var1_1.cfr_renamed_0().readUTF();
                        ++var4_116;
                        if (-"  ".length() <= 0) continue;
                        return;
                    }
                    if (!ee.boolean_if((int)gf_0.dangChayAuto) || !(AutoController.nhiemVuHienTai != null) || ee.boolean_do(AutoController.nhiemVuHienTai instanceof AutoFarm) && !ee.boolean_if(AutoController.nhiemVuHienTai instanceof Z)) ** GOTO lbl716
                    var4_116 = (var3_74 != null);
                    if (!ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoFarm)) ** GOTO lbl712
                    if (!ee.boolean_if((int)var9_244.startsWith("Bạn có muốn dùng")) || !(var9_244.indexOf("điểm luyện rồng để luyện rồng") != -1)) ** GOTO lbl698
                    AutoFarm.var_gY_do = new gY("Luyện rồng", new fo_0(var2_25, var8_228, var4_116));
                    if ("   ".length() >= (123 ^ 18 ^ (6 ^ 107))) {
                        return;
                    }
                    ** GOTO lbl714
lbl698:
                    // 1 sources

                    if (ee.boolean_if((int)var9_244.startsWith("Bạn có muốn giao đơn hàng"))) {
                        AutoFarm.var_gY_if = new gY("Giao hàng", new fo_0(var2_25, var8_228, var4_116));
                        if (" ".length() <= 0) {
                            return;
                        }
                    } else if (ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoLaiBuon)) {
                        AutoLaiBuon.cfr_renamed_3 = new gY("Lái buôn hỗ trợ", new fo_0(var2_25, var8_228, var4_116));
                        if ("  ".length() == 0) {
                            return;
                        }
                    }
                    ** GOTO lbl714
lbl712:
                    // 1 sources

                    if (ee.boolean_if(AutoController.nhiemVuHienTai instanceof Z)) {
                        Z.var_gY_do = new gY("Biến hình Kirby", new fo_0(var2_25, var8_228, var4_116));
                    }
lbl714:
                    // 6 sources

                    gf_0.void_do();
                    return;
lbl716:
                    // 1 sources

                    if (!(em_0.var_em_0_do != GameCanvas.var_dL_do)) return;
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var2_25, (int)var8_228, var9_244, var3_74);
                    return;
                }
                case -74: {
                    var4_117 = new aU();
                    new aU().cfr_renamed_1 = var1_1.cfr_renamed_0().readShort();
                    var4_117.cfr_renamed_3 = 24 * var1_1.cfr_renamed_0().readByte();
                    var4_117.cfr_renamed_1 = (short)(24 * var1_1.cfr_renamed_0().readByte());
                    fe.fe_do().void_do(var4_117);
                    return;
                }
                case -70: {
                    var2_26 = var1_1.cfr_renamed_0().readInt();
                    var3_75 = (byte)(100 - var1_1.cfr_renamed_0().readByte());
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_1(var2_26, var3_75);
                    return;
                }
                case -64: {
                    var3_76 = var1_1.cfr_renamed_0().readInt();
                    var4_118 = var1_1.cfr_renamed_0().readShort();
                    var5_156 = var1_1.cfr_renamed_0().readByte();
                    if ((AutoController.nhiemVuHienTai != null) && ee.boolean_if(AutoController.nhiemVuHienTai instanceof fl) && (AngelChip.duLieuNguoiChoi.var_short_char == var3_76)) {
                        v1 = 1;
                        if (" ".length() <= 0) {
                            return;
                        }
                    } else {
                        v1 = 0;
                    }
                    var6_189 = v1;
                    var7_210 = new Vector<n_0>();
                    var2_27 = 0;
                    while ((var2_27 < var5_156)) {
                        var8_229 = new n_0();
                        new n_0().var_byte_do = var1_1.cfr_renamed_0().readByte();
                        switch (var8_229.var_byte_do) {
                            case 1: {
                                var8_229.var_short_do = var1_1.cfr_renamed_0().readShort();
                                var9_245 = var1_1.cfr_renamed_0().readByte();
                                if ((var9_245 == -1)) {
                                    var8_229.chuoiGiaTri = "(" + MenuChinhAvatar.by + ")";
                                    if (!ee.boolean_if(var6_189) || !(var8_229.var_short_do == fl.var_fl_do.short_do())) break;
                                    fl.var_fl_do.dangChayAuto = 1;
                                    if ("   ".length() >= 0) break;
                                    return;
                                }
                                var8_229.chuoiGiaTri = "(" + var9_245 + " " + MenuChinhAvatar.K + ")";
                                break;
                            }
                            case 2: {
                                var8_229.cfr_renamed_4 = var1_1.cfr_renamed_0().readInt();
                                break;
                            }
                            case 3: {
                                var8_229.cfr_renamed_3 = var1_1.cfr_renamed_0().readInt();
                                if (-" ".length() <= 0) break;
                                return;
                            }
                            case 4: {
                                var8_229.cfr_renamed_5 = var1_1.cfr_renamed_0().readInt();
                                break;
                            }
                        }
                        var7_210.addElement(var8_229);
                        ++var2_27;
                        if (((105 ^ 75 ^ (165 ^ 152)) & (85 + 41 - 56 + 119 ^ 1 + 102 - 68 + 127 ^ -" ".length())) == 0) continue;
                        return;
                    }
                    ed.cfr_renamed_0().cfr_renamed_0(var3_76, var4_118, var7_210);
                    if (!ee.boolean_if(var6_189)) return;
                    if (ee.boolean_if((int)fl.var_fl_do.dangChayAuto)) {
                        GameCanvas.hienThongBaoPopup("Đã quay được " + fl.var_fl_do.chuoiGiaTri + " vĩnh viễn!\nSố lần quay: " + (fl.var_fl_do.soLuong + 1));
                    }
                    TienIchGame.cfr_renamed_11();
                    return;
                }
                case -63: {
                    ef_0.cfr_renamed_0(var1_1.cfr_renamed_0().readByte());
                    return;
                }
                case -62: {
                    ThongTinNhanVat.cfr_renamed_0().var_gx_if.cfr_renamed_0(var1_1.cfr_renamed_0().readUTF());
                    ThongTinNhanVat.cfr_renamed_0().cfr_renamed_1();
                    if (-" ".length() <= ((24 ^ 38) & ~(185 ^ 135))) ** GOTO lbl1395
                    return;
                }
                case -60: {
                    var2_28 = var1_1.cfr_renamed_0().readInt();
                    var8_230 = var1_1.cfr_renamed_0().readByte();
                    var9_246 = var1_1.cfr_renamed_0().readUTF();
                    var3_77 = var1_1.cfr_renamed_0().readByte();
                    var4_119 = null;
                    if (ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                        var4_119 = new byte[var1_1.cfr_renamed_0().readShort()];
                        var1_1.cfr_renamed_0().read(var4_119);
                        }
                    if (!(var4_119 != null) || !(AutoController.nhiemVuHienTai != null) || !ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoKimCuong) || (ad.var_byte_do == 1)) {
                        if ((AutoController.nhiemVuHienTai != null) && ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoFarm)) {
                            TienIchGame.this();
                            return;
                        }
                        GameCanvas.var_dZ_do.cfr_renamed_0(var9_246, new dC(var2_28, var8_230), (int)var3_77);
                    }
                    if (!(var4_119 != null)) return;
                    var3_78 = Image.createImage((byte[])var4_119, (int)0, (int)var4_119.length);
                    if (!(AutoController.nhiemVuHienTai != null) || !ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoKimCuong) || (ad.var_byte_do == 1)) {
                        GameCanvas.var_dZ_do.cfr_renamed_0(var3_78);
                    }
                    if (!(AutoController.nhiemVuHienTai != null) || !ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoKimCuong)) return;
                    AutoKimCuong.var_ad_do = new ad(var3_78, var2_28, var8_230);
                    TienIchGame.cfr_renamed_8();
                    return;
                }
                case -59: {
                    if ((GameCanvas.var_bt_0_do == GameCanvas.var_h_0_do)) {
                        GameCanvas.var_bt_0_do = null;
                    }
                    if ((GameCanvas.var_bt_0_do != null)) {
                        return;
                    }
                    var3_79 = var1_1.cfr_renamed_0().readInt();
                    var4_120 = var1_1.cfr_renamed_0().readByte();
                    var5_157 = var1_1.cfr_renamed_0().readByte();
                    var6_190 = new String[var5_157];
                    var2_29 = new short[var5_157];
                    var7_211 = 0;
                    while ((var7_211 < var5_157)) {
                        var6_190[var7_211] = var1_1.cfr_renamed_0().readUTF();
                        ++var7_211;
                        }
                    if (ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                        var7_211 = 0;
                        while ((var7_211 < var5_157)) {
                            var2_29[var7_211] = var1_1.cfr_renamed_0().readShort();
                            ++var7_211;
                            if (-"  ".length() < 0) continue;
                            return;
                        }
                    }
                    var7_212 = null;
                    var8_231 = null;
                    var9_247 = null;
                    if (ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                        var7_212 = var1_1.cfr_renamed_0().readUTF();
                        var8_231 = var1_1.cfr_renamed_0().readUTF();
                        var9_247 = new boolean[var5_157];
                        var2_30 = 0;
                        while ((var2_30 < var5_157)) {
                            var9_247[var2_30] = var1_1.cfr_renamed_0().readBoolean();
                            ++var2_30;
                            if (" ".length() == " ".length()) continue;
                            return;
                        }
                    }
                    if ((AutoController.nhiemVuHienTai != null) && ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoChamEmBe) && ee.boolean_if((int)AutoChamEmBe.var_boolean_int) && (ef_0.soLuong == 110)) {
                        AutoChamEmBe.cfr_renamed_0(var3_79, var4_120, var6_190);
                        AutoChamEmBe.void_do();
                        if ("  ".length() <= " ".length()) {
                            return;
                        }
                    } else if ((AutoController.nhiemVuHienTai != null) && ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoFarm) && ee.boolean_if((int)gf_0.dangChayAuto) && (ef_0.soLuong == 25)) {
                        AutoFarm.cfr_renamed_0(var3_79, var4_120, var6_190);
                        gf_0.void_do();
                        if ("   ".length() >= (73 ^ 77)) {
                            return;
                        }
                    } else if ((AutoController.nhiemVuHienTai != null) && ee.boolean_if(AutoController.nhiemVuHienTai instanceof Z) && ee.boolean_if((int)gf_0.dangChayAuto) && (ef_0.soLuong == 23)) {
                        Z.cfr_renamed_0(var3_79, var4_120, var6_190);
                        gf_0.void_do();
                        if (" ".length() < ((74 ^ 88 ^ (1 ^ 77)) & (15 + 34 - 47 + 228 ^ 151 + 106 - 153 + 80 ^ -" ".length()))) {
                            return;
                        }
                    } else {
                        c.cfr_renamed_0(var3_79, var4_120, var6_190, var7_212, var8_231, var9_247);
                    }
                    TienIchGame.cfr_renamed_8();
                    return;
                }
                case -58: {
                    var2_31 = var1_1.cfr_renamed_0().readByte();
                    var3_80 = new Hashtable<String, byte[]>();
                    var4_121 = 0;
                    while ((var4_121 < var2_31)) {
                        var6_191 = var1_1.cfr_renamed_0().readShort();
                        var5_158 /* !! */  = new byte[var1_1.cfr_renamed_0().readShort()];
                        var1_1.cfr_renamed_0().read(var5_158 /* !! */ );
                        var5_158 /* !! */  = (byte[])gc_0.javax_microedition_lcdui_Image_do(var5_158 /* !! */ );
                        var3_80.put("" + var6_191, var5_158 /* !! */ );
                        ++var4_121;
                        if ("  ".length() == "  ".length()) continue;
                        return;
                    }
                    var4_122 = var1_1.cfr_renamed_0().readUTF();
                    var2_32 = var1_1.cfr_renamed_0().readUTF();
                    var5_159 = -1;
                    if (ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                        var5_159 = var1_1.cfr_renamed_0().readByte();
                    }
                    p_0.var_p_0_do = null;
                    p_0.p_0_do().cfr_renamed_0(var3_80, var4_122, var2_32, var5_159);
                    p_0.p_0_do().cfr_renamed_1();
                    return;
                }
                case -54: {
                    var3_81 = var1_1.cfr_renamed_0().readUTF();
                    var5_160 = var1_1.cfr_renamed_0().readUTF();
                    var4_123 = var1_1.cfr_renamed_0().readUTF();
                    GameCanvas.cfr_renamed_8();
                    GameCanvas.hienThongBaoPopup(var3_81, new fz(var5_160, var4_123));
                    if (((8 ^ 25) & ~(9 ^ 24)) >= -" ".length()) ** GOTO lbl1395
                    return;
                }
                case -52: {
                    var3_82 = var1_1.cfr_renamed_0().readUTF();
                    var1_1.cfr_renamed_0().readInt();
                    ThongTinNhanVat.cfr_renamed_0().cfr_renamed_0(var3_82);
                    return;
                }
                case -51: {
                    var2_33 = var1_1.cfr_renamed_0().readByte();
                    var5_161 = new byte[var1_1.cfr_renamed_0().available()];
                    var1_1.cfr_renamed_0().read(var5_161);
                    dr_0.var_dr_0_do.cfr_renamed_0(var5_161, var2_33);
                    return;
                }
                case -50: {
                    var8_232 = var1_1.cfr_renamed_0().readUTF();
                    var2_34 = var1_1.cfr_renamed_0().readByte();
                    dr_0.var_dr_0_do.cfr_renamed_0(var8_232, var2_34);
                    return;
                }
                case -49: {
                    var2_35 = var1_1.cfr_renamed_0().readByte();
                    var5_162 = var1_1.cfr_renamed_0().readUTF();
                    var4_124 = null;
                    var6_192 = var1_1.cfr_renamed_0().readShort();
                    if (ee.boolean_for(var6_192)) {
                        var4_124 = new short[var6_192];
                        var3_83 = 0;
                        while ((var3_83 < var6_192)) {
                            var4_124[var3_83] = var1_1.cfr_renamed_0().readShort();
                            ++var3_83;
                            if (" ".length() >= 0) continue;
                            return;
                        }
                    }
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(0, (int)var2_35, var5_162, var4_124, -1, null);
                    return;
                }
                case -48: {
                    var3_84 = var1_1.cfr_renamed_0().readInt();
                    var5_163 = var1_1.cfr_renamed_0().readShort();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var3_84, var5_163);
                    if ((AutoController.nhiemVuHienTai != null)) {
                        AutoController.nhiemVuHienTai.cfr_renamed_3 = null;
                    }
                    TienIchGame.hienThongBao();
                    return;
                }
                case -47: {
                    var2_36 = new Vector<ef>();
                    var5_164 = var1_1.cfr_renamed_0().readShort();
                    var3_85 = 0;
                    while ((var3_85 < var5_164)) {
                        var4_125 = new ef();
                        new ef().var_short_do = var1_1.cfr_renamed_0().readShort();
                        var4_125.var_byte_do = var1_1.cfr_renamed_0().readByte();
                        var4_125.chuoiGiaTri = var1_1.cfr_renamed_0().readUTF();
                        var2_36.addElement(var4_125);
                        ++var3_85;
                        if ("  ".length() != 0) continue;
                        return;
                    }
                    if (ee.boolean_if((int)bI.dangChayAuto) && ee.boolean_if((int)TienIchGame.coKichHoat)) {
                        bI.var_java_util_Vector_do = var2_36;
                        if ((44 ^ 40) < " ".length()) {
                            return;
                        }
                    } else if ((AutoController.nhiemVuHienTai != null) && (!ee.boolean_do((int)TienIchGame.coKichHoat) || ee.boolean_if(AutoController.nhiemVuHienTai instanceof dy_0))) {
                        AutoController.nhiemVuHienTai.cfr_renamed_3 = var2_36;
                        } else {
                        fe_0.fe_0_do().void_do(var2_36);
                    }
                    TienIchGame.cfr_renamed_12();
                    return;
                }
                case -42: {
                    var4_126 = new Vector<dp_0>();
                    var2_37 = var1_1.cfr_renamed_0().readByte();
                    var3_86 = 0;
                    while ((var3_86 < var2_37)) {
                        var7_213 = new dp_0();
                        var1_1.cfr_renamed_0().readShort();
                        var7_213.cfr_renamed_3 = var1_1.cfr_renamed_0().readUTF();
                        var7_213.chuoiGiaTri = var1_1.cfr_renamed_0().readUTF();
                        var7_213.cfr_renamed_5 = var1_1.cfr_renamed_0().readUTF();
                        var7_213.cfr_renamed_1 = var1_1.cfr_renamed_0().readUTF();
                        var7_213.cfr_renamed_4 = var1_1.cfr_renamed_0().readUTF();
                        var7_213.var_java_util_Vector_do = new Vector<E>();
                        var6_193 = var1_1.cfr_renamed_0().readByte();
                        var5_165 = 0;
                        while ((var5_165 < var6_193)) {
                            var8_233 = new eq_0();
                            new eq_0().cfr_renamed_3 = var1_1.cfr_renamed_0().readByte();
                            var8_233.var_int_if = var1_1.cfr_renamed_0().readByte();
                            var8_233.soLuong = var1_1.cfr_renamed_0().readByte();
                            var7_213.var_java_util_Vector_do.addElement(var8_233);
                            ++var5_165;
                            if (" ".length() < "   ".length()) continue;
                            return;
                        }
                        var4_126.addElement(var7_213);
                        ++var3_86;
                        if (-" ".length() < 0) continue;
                        return;
                    }
                    var3_86 = 0;
                    while (true) {
                        if (!(var3_86 < var2_37)) {
                            ci_0.void_do(var4_126);
                            return;
                        }
                        ((dp_0)var4_126.elementAt((int)var3_86)).soLuong = var1_1.cfr_renamed_0().readByte();
                        ++var3_86;
                        }
                }
                case -38: {
                    var7_214 = var1_1.cfr_renamed_0().readShort();
                    var8_234 = 0;
                    if ((var7_214 != -1)) {
                        var8_234 = var1_1.cfr_renamed_0().readInt();
                    }
                    var2_38 = var1_1.cfr_renamed_0().readInt();
                    var3_87 = var1_1.cfr_renamed_0().readInt();
                    var4_127 = var1_1.cfr_renamed_0().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_0(var2_38, var3_87, var4_127);
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var7_214, var8_234);
                    return;
                }
                case -36: {
                    var2_39 = var1_1.cfr_renamed_0().readInt();
                    var3_88 = var1_1.cfr_renamed_0().readShort();
                    fe_0.fe_0_do();
                    fe_0.void_int(var2_39, var3_88);
                    return;
                }
                case -35: {
                    var2_40 = var1_1.cfr_renamed_0().readBoolean();
                    cs_0.cfr_renamed_0();
                    cs_0.cfr_renamed_0(var2_40);
                    return;
                }
                case -33: {
                    var3_89 = var1_1.cfr_renamed_0().readInt();
                    var4_128 = var1_1.cfr_renamed_0().readByte();
                    if (ee.boolean_if(var3_89) && (var4_128 != 1) && (var4_128 == 2) && (var4_128 == 5)) {
                        AngelChip.duLieuNguoiChoi.void_new(AngelChip.duLieuNguoiChoi.mangSoNguyen[3] + var3_89);
                        GameCanvas.hienThongBaoPopup(var3_89 + "xeng", (int)AngelChip.duLieuNguoiChoi.coKichHoat, (int)AngelChip.duLieuNguoiChoi.var_short_if, 0, -1);
                    }
                    var7_215 = var1_1.cfr_renamed_0().readInt();
                    var5_166 = var1_1.cfr_renamed_0().readInt();
                    var6_194 = var1_1.cfr_renamed_0().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_0(var7_215, var5_166, var6_194);
                    if (!ee.boolean_if((int)TienIchGame.coTrangThai) || !(AutoController.nhiemVuHienTai != null) || !ee.boolean_if(AutoController.nhiemVuHienTai instanceof gb_0)) return;
                    TienIchGame.void_int();
                    return;
                }
                case -25: {
                    var4_129 = var1_1.cfr_renamed_0().readByte();
                    var3_90 = null;
                    var5_167 = null;
                    var2_41 = null;
                    if ((var4_129 == 2)) {
                        var5_167 = var1_1.cfr_renamed_0().readUTF();
                        var2_41 = var1_1.cfr_renamed_0().readUTF();
                        if (-" ".length() > -" ".length()) {
                            return;
                        }
                    } else {
                        var3_90 = var1_1.cfr_renamed_0().readUTF();
                    }
                    fw.cfr_renamed_0();
                    fw.cfr_renamed_0(var4_129, var3_90, var5_167, var2_41);
                    if ("  ".length() > ((213 ^ 160 ^ (158 ^ 197)) & (22 ^ 63 ^ (156 ^ 155) ^ -" ".length()))) ** GOTO lbl1395
                    return;
                }
                case -24: {
                    var4_130 = var1_1.cfr_renamed_0().readShort();
                    if ((var4_130 != -1)) {
                        var1_1.cfr_renamed_0().readInt();
                        var1_1.cfr_renamed_0().readByte();
                        }
                    var3_91 = var1_1.cfr_renamed_0().readUTF();
                    var2_42 = var1_1.cfr_renamed_0().readInt();
                    var5_168 = var1_1.cfr_renamed_0().readInt();
                    var6_195 = var1_1.cfr_renamed_0().readInt();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var4_130, var3_91, var2_42, var5_168, var6_195);
                    return;
                }
                case -23: {
                    var2_43 = new Vector<bz>();
                    while (true) {
                        if (!ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                            r_0.cfr_renamed_0().cfr_renamed_0(var2_43);
                            r_0.cfr_renamed_0().void_do(GameCanvas.var_dL_do);
                            GameCanvas.cfr_renamed_8();
                            return;
                        }
                        var4_131 = new bz();
                        new bz().cfr_renamed_0 = var1_1.cfr_renamed_0().readUTF();
                        var4_131.cfr_renamed_1 = var1_1.cfr_renamed_0().readUTF();
                        var1_1.cfr_renamed_0().readUTF();
                        var4_131.cfr_renamed_3 = var1_1.cfr_renamed_0().readUTF();
                        var2_43.addElement(var4_131);
                        }
                }
                case -22: {
                    var2_44 = var1_1.cfr_renamed_0().readInt();
                    var4_132 = new ar_0();
                    new ar_0().var_short_do = var1_1.cfr_renamed_0().readByte();
                    var4_132.cfr_renamed_1 = var1_1.cfr_renamed_0().readByte();
                    var4_132.var_byte_do = var1_1.cfr_renamed_0().readByte();
                    var4_132.cfr_renamed_3 = var1_1.cfr_renamed_0().readByte();
                    var4_132.cfr_renamed_4 = var1_1.cfr_renamed_0().readByte();
                    var4_132.cfr_renamed_2 = var1_1.cfr_renamed_0().readByte();
                    var4_132.cfr_renamed_5 = var1_1.cfr_renamed_0().readByte();
                    var5_169 = null;
                    var7_216 = var1_1.cfr_renamed_0().readInt();
                    var8_235 = "";
                    var3_92 = "";
                    var6_196 = 0;
                    var9_248 = 0;
                    var10_255 = 0;
                    var11_261 = -1;
                    var12_258 = "";
                    if ((var7_216 != -1)) {
                        var5_169 = new DuLieuNguoiChoi();
                        new DuLieuNguoiChoi().var_short_char = (short)var7_216;
                        var5_169.cfr_renamed_0(var1_1.cfr_renamed_0().readUTF());
                        var6_196 = var1_1.cfr_renamed_0().readByte();
                        var3_93 = 0;
                        while ((var3_93 < var6_196)) {
                            var5_169.cfr_renamed_1(new ef(var1_1.cfr_renamed_0().readShort()));
                            ++var3_93;
                            if (-" ".length() <= (198 ^ 194)) continue;
                            return;
                        }
                        var8_235 = var1_1.cfr_renamed_0().readUTF();
                        var6_196 = var1_1.cfr_renamed_0().readShort();
                        var9_248 = var1_1.cfr_renamed_0().readByte();
                        var10_255 = var1_1.cfr_renamed_0().readByte();
                        var3_92 = var1_1.cfr_renamed_0().readUTF();
                        var11_261 = var1_1.cfr_renamed_0().readShort();
                        if ((var11_261 != -1)) {
                            var12_258 = var1_1.cfr_renamed_0().readUTF();
                        }
                    }
                    if (ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                        AngelChip.fontRenderer.var_short_do = var4_132.var_short_do = var1_1.cfr_renamed_0().readShort();
                        AngelChip.duLieuNguoiChoi.var_short_class = var4_132.var_short_do;
                    }
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var2_44, var4_132, var5_169, var8_235, var6_196, var9_248, var10_255, var3_92, var11_261, var12_258);
                    return;
                }
                case -21: {
                    var2_45 = new DuLieuNguoiChoi();
                    new DuLieuNguoiChoi().var_short_char = (short)var1_1.cfr_renamed_0().readInt();
                    var2_45.var_short_do = (short)var1_1.cfr_renamed_0().readUTF();
                    var3_94 = var1_1.cfr_renamed_0().readUTF();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var2_45, var3_94);
                    return;
                }
                case -19: {
                    var2_46 = new DuLieuNguoiChoi();
                    new DuLieuNguoiChoi().var_short_char = (short)var1_1.cfr_renamed_0().readInt();
                    var2_46.var_short_do = (short)var1_1.cfr_renamed_0().readUTF();
                    var2_47 = var1_1.cfr_renamed_0().readBoolean();
                    var5_170 = var1_1.cfr_renamed_0().readUTF();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(var2_47, var5_170);
                    return;
                }
                case -17: {
                    AngelChip.var_byte_do = var1_1.cfr_renamed_0().readByte();
                    AngelChip.cfr_renamed_3 = var1_1.cfr_renamed_0().readUTF();
                    ci_0.void_if();
                    if (" ".length() > 0) ** GOTO lbl1395
                    return;
                }
                case -12: {
                    var3_95 = var1_1.cfr_renamed_0().readUTF();
                    var5_171 = var1_1.cfr_renamed_0().readUTF();
                    ThongTinNhanVat.cfr_renamed_0().cfr_renamed_0(var3_95, var5_171);
                    if (" ".length() < "   ".length()) ** GOTO lbl1395
                    return;
                }
                case -10: {
                    var3_96 = var1_1.cfr_renamed_0().readUTF();
                    var2_48 = 0;
                    if (ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                        var2_48 = var1_1.cfr_renamed_0().readBoolean();
                    }
                    if ((AutoController.nhiemVuHienTai != null) && (!ee.boolean_do(AutoController.nhiemVuHienTai instanceof AutoFarm) || ee.boolean_if(AutoController.nhiemVuHienTai instanceof AutoLaiBuon))) {
                        AutoController.nhiemVuHienTai.boolean_do(var3_96);
                        return;
                    }
                    c.cfr_renamed_0(var3_96, var2_48);
                    return;
                }
                case -9: {
                    GameCanvas.cfr_renamed_1(var1_1.cfr_renamed_0().readUTF());
                    return;
                }
                case -8: {
                    var2_49 = var1_1.cfr_renamed_0().readUTF();
                    GameCanvas.cfr_renamed_3(var2_49);
                    if (!(AutoController.nhiemVuHienTai != null)) return;
                    AutoController.nhiemVuHienTai.void_do(var2_49);
                    return;
                }
                case -7: {
                    c.cfr_renamed_0(var1_1.cfr_renamed_0().readUTF(), var1_1.cfr_renamed_0().readUTF());
                    return;
                }
                case -6: {
                    var2_50 = var1_1.cfr_renamed_0().readInt();
                    var5_172 = var1_1.cfr_renamed_0().readUTF();
                    var4_133 = var1_1.cfr_renamed_0().readUTF();
                    if ((GameCanvas.var_dL_do != dN.cfr_renamed_0())) {
                        dL.cfr_renamed_22 += 1;
                    }
                    dN.cfr_renamed_0().cfr_renamed_0(var2_50, var5_172, var4_133);
                    return;
                }
                case -1: {
                    c.cfr_renamed_0(var1_1.cfr_renamed_0().readByte());
                    return;
                }
                case 34: {
                    if (!ee.cfr_renamed_0(var1_1.cfr_renamed_0().readInt(), -1)) return;
                    var8_236 = var1_1.cfr_renamed_0().readUTF();
                    var2_51 = var1_1.cfr_renamed_0().readInt();
                    var1_1.cfr_renamed_0().readShort();
                    var3_97 = var1_1.cfr_renamed_0().readInt();
                    var4_134 = var1_1.cfr_renamed_0().readInt();
                    var7_217 = var1_1.cfr_renamed_0().readInt();
                    var5_173 = var1_1.cfr_renamed_0().readInt();
                    var6_197 = var1_1.cfr_renamed_0().readInt();
                    var9_249 = new DuLieuNguoiChoi();
                    var9_249.void_try(var3_97);
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.bm + var8_236 + ". " + MenuChinhAvatar.aF + var2_51 + "$. Level: " + var9_249.var_short_class + "+" + var9_249.var_byte_this + "%. " + MenuChinhAvatar.bu + ": " + var4_134 + ". " + MenuChinhAvatar.dn + ": " + var7_217 + ". " + MenuChinhAvatar.cfr_renamed_38 + ": " + var5_173 + ". " + MenuChinhAvatar.cfr_renamed_39 + ": " + var6_197);
                    return;
                }
                case 50: {
                    if ((this.var_ba_do != bQ.var_bQ_do) && (this.var_ba_do != gS.var_gS_do) && !(this.var_ba_do == gj.var_gj_do)) break;
                    var2_52 = var1_1.cfr_renamed_0().readByte();
                    var3_98 = var1_1.cfr_renamed_0().readByte();
                    var5_174 = 0;
                    var6_198 = 0;
                    var4_135 = new Vector();
                    if ((var3_98 != -1) && (var3_98 != -2)) {
                        var5_174 = var1_1.cfr_renamed_0().readShort();
                        var6_198 = var1_1.cfr_renamed_0().readShort();
                        var4_135 = ee.java_util_Vector_do(var1_1);
                    }
                    var9_240 = var1_1.cfr_renamed_0().readShort();
                    var7_200 = null;
                    var8_221 = null;
                    if (ee.boolean_for(var9_240)) {
                        var7_200 = ee.java_util_Vector_if(var1_1);
                        var8_221 = ee.java_util_Vector_for(var1_1);
                    }
                    if ((AngelChip.var_int_if == 9)) {
                        var9_240 = 0;
                        while ((var9_240 < var4_135.size())) {
                            ((DuLieuNguoiChoi)var4_135.elementAt((int)var9_240)).var_short_byte = var1_1.cfr_renamed_0().readShort();
                            ++var9_240;
                            if (" ".length() > -" ".length()) continue;
                            return;
                        }
                    }
                    fe_0.fe_0_do().cfr_renamed_0(var2_52, var3_98, var5_174, var6_198, var4_135, (Vector)var7_200, (Vector)var8_221);
                    if ((ef_0.soLuong == 21)) {
                        GameCanvas.cfr_renamed_6 = 0;
                        gj.cfr_renamed_0();
                        db_0.db_0_do().cfr_renamed_15(0);
                        GameCanvas.cfr_renamed_5();
                    }
                    TienIchGame.cfr_renamed_8();
                    }
                case 89: {
                    if (ee.boolean_do(var1_1.cfr_renamed_0().readByte())) {
                        var5_175 = var1_1.cfr_renamed_0().readByte();
                        var7_218 = var1_1.cfr_renamed_0().readShort();
                        var2_53 = var1_1.cfr_renamed_0().readInt();
                        var8_237 = var1_1.cfr_renamed_0().readInt();
                        var3_99 = var1_1.cfr_renamed_0().readShort();
                        var4_136 = var1_1.cfr_renamed_0().readShort();
                        fe_0.fe_0_do();
                        fe_0.cfr_renamed_0(var5_175, var8_237, var7_218, var2_53, var3_99, var4_136);
                        return;
                    }
                    var7_219 = var1_1.cfr_renamed_0().readInt();
                    var8_238 = var1_1.cfr_renamed_0().readInt();
                    fe_0.fe_0_do();
                    fe_0.void_for(var7_219, var8_238);
                    return;
                }
                case 122: {
                    var1_1.cfr_renamed_0().readByte();
                    var9_250 = var1_1.cfr_renamed_0().readByte();
                    var2_54 = var1_1.cfr_renamed_0().readByte();
                    var3_100 = var1_1.cfr_renamed_0().readShort();
                    var4_137 = var1_1.cfr_renamed_0().readShort();
                    ef_0.cfr_renamed_0(var9_250, var2_54, var3_100, var4_137);
                    return;
                }
            }
            }
        catch (Exception v2) {
            v2.printStackTrace();
        }
lbl1395:
        // 15 sources

        if ((this.var_ba_do != null)) {
            this.var_ba_do.void_do(var1_1);
            return;
        }
        try {
            switch (var1_1.var_byte_do) {
                case -5: {
                    c.cfr_renamed_0(var1_1.cfr_renamed_0().readUTF());
                    return;
                }
                case -4: {
                    ThongTinNhanVat.cfr_renamed_0().cfr_renamed_1();
                    AngelChip.duLieuNguoiChoi = new DuLieuNguoiChoi();
                    new DuLieuNguoiChoi().var_short_char = (short)var1_1.cfr_renamed_0().readInt();
                    var2_55 = var1_1.cfr_renamed_0().readByte();
                    AngelChip.duLieuNguoiChoi.var_java_util_Vector_if = new Vector<E>();
                    var3_101 = 0;
                    while ((var3_101 < var2_55)) {
                        var4_138 = new ef();
                        new ef().var_short_do = var1_1.cfr_renamed_0().readShort();
                        AngelChip.duLieuNguoiChoi.cfr_renamed_1(var4_138);
                        ++var3_101;
                        }
                    AngelChip.duLieuNguoiChoi.var_byte_void = var1_1.cfr_renamed_0().readByte();
                    AngelChip.fontRenderer.var_short_do = var1_1.cfr_renamed_0().readByte();
                    AngelChip.fontRenderer.cfr_renamed_1 = var1_1.cfr_renamed_0().readByte();
                    AngelChip.duLieuNguoiChoi.void_int(var1_1.cfr_renamed_0().readInt());
                    AngelChip.fontRenderer.var_byte_do = var1_1.cfr_renamed_0().readByte();
                    AngelChip.fontRenderer.cfr_renamed_3 = var1_1.cfr_renamed_0().readByte();
                    AngelChip.fontRenderer.cfr_renamed_4 = var1_1.cfr_renamed_0().readByte();
                    AngelChip.fontRenderer.cfr_renamed_2 = var1_1.cfr_renamed_0().readByte();
                    AngelChip.fontRenderer.cfr_renamed_5 = var1_1.cfr_renamed_0().readByte();
                    AngelChip.duLieuNguoiChoi.mangSoNguyen[2] = var1_1.cfr_renamed_0().readInt();
                    AngelChip.duLieuNguoiChoi.var_byte_break = var1_1.cfr_renamed_0().readByte();
                    var3_101 = 0;
                    while ((var3_101 < AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.size())) {
                        var4_139 = (ef)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.elementAt(var3_101);
                        ((ef)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.elementAt(var3_101)).var_byte_do = var1_1.cfr_renamed_0().readByte();
                        var4_139.chuoiGiaTri = var1_1.cfr_renamed_0().readUTF();
                        ++var3_101;
                        if (-"  ".length() < 0) continue;
                        return;
                    }
                    AngelChip.duLieuNguoiChoi.var_short_if = var1_1.cfr_renamed_0().readShort();
                    fe_0.var_java_util_Vector_for = new Vector<E>();
                    var3_101 = var1_1.cfr_renamed_0().readByte();
                    var4_140 = 0;
                    while ((var4_140 < var3_101)) {
                        var5_176 = new ev_0();
                        new ev_0().cfr_renamed_1 = var1_1.cfr_renamed_0().readUTF();
                        var5_176.cfr_renamed_5 = var1_1.cfr_renamed_0().readShort();
                        fe_0.var_java_util_Vector_for.addElement(var5_176);
                        ++var4_140;
                        if (" ".length() > 0) continue;
                        return;
                    }
                    fe_0.var_java_util_Vector_if = new Vector<E>();
                    var4_140 = var1_1.cfr_renamed_0().readByte();
                    var2_55 = 0;
                    while ((var2_55 < var4_140)) {
                        var5_177 = new ev_0();
                        new ev_0().soLuong = var1_1.cfr_renamed_0().readShort();
                        var5_177.cfr_renamed_1 = var1_1.cfr_renamed_0().readUTF();
                        var5_177.cfr_renamed_5 = var1_1.cfr_renamed_0().readShort();
                        fe_0.var_java_util_Vector_if.addElement(var5_177);
                        ++var2_55;
                        if (" ".length() >= 0) continue;
                        return;
                    }
                    fe_0.fe_0_do().dangChayAuto = var1_1.cfr_renamed_0().readBoolean();
                    if (ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                        var2_55 = 0;
                        while ((var2_55 < var4_140)) {
                            ((ev_0)fe_0.var_java_util_Vector_if.elementAt((int)var2_55)).cfr_renamed_12 = var1_1.cfr_renamed_0().readByte();
                            ++var2_55;
                            }
                    }
                    if (ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                        GameCanvas.soLuong = var1_1.cfr_renamed_0().readByte();
                    }
                    AngelChip.duLieuNguoiChoi.var_short_class = AngelChip.fontRenderer.var_short_do = var1_1.cfr_renamed_0().readShort();
                    if (!(GameCanvas.soLuong != 1) || (GameCanvas.soLuong == 2)) {
                        MenuChinhAvatar.var_java_lang_String_arr_try = MenuChinhAvatar.var_java_lang_String_arr_char;
                    }
                    AngelChip.duLieuNguoiChoi.var_short_byte = var1_1.cfr_renamed_0().readShort();
                    if (ee.boolean_for(var1_1.cfr_renamed_0().available())) {
                        fe_0.coKichHoat = var1_1.cfr_renamed_0().readBoolean();
                    }
                    if (ee.boolean_if((int)fe_0.coKichHoat)) {
                        AngelChip.duLieuNguoiChoi.mangSoNguyen[3] = var1_1.cfr_renamed_0().readInt();
                    }
                    fe_0.var_java_util_Vector_int = new Vector<E>();
                    var2_55 = var1_1.cfr_renamed_0().readByte();
                    var3_101 = 0;
                    while ((var3_101 < var2_55)) {
                        var5_178 = new bg();
                        new bg().var_short_do = var1_1.cfr_renamed_0().readShort();
                        var5_178.chuoiGiaTri = var1_1.cfr_renamed_0().readUTF();
                        var5_178.cfr_renamed_1 = var1_1.cfr_renamed_0().readShort();
                        var5_178.soLuong = var1_1.cfr_renamed_0().readInt();
                        var5_178.var_byte_do = var1_1.cfr_renamed_0().readByte();
                        fe_0.var_java_util_Vector_int.addElement(var5_178);
                        ++var3_101;
                        }
                    AngelChip.duLieuNguoiChoi.void_if(var1_1.cfr_renamed_0().readInt());
                    AngelChip.duLieuNguoiChoi.soLuong = var1_1.cfr_renamed_0().readInt();
                    var1_1.cfr_renamed_0().readByte();
                    var2_56 = var1_1.cfr_renamed_0().readUTF();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_0(var2_56);
                    c.cfr_renamed_0();
                    if (ee.boolean_if((int)gW.cfr_renamed_1)) {
                        gW.cfr_renamed_3 = 1;
                    }
                    AutoController.controllerInstance.cfr_renamed_0();
                    ee.cfr_renamed_4();
                    return;
                }
            }
            return;
        }
        catch (Exception v3) {
            v3.printStackTrace();
            return;
        }
    }

    public final void void_do() {
        GameCanvas.cfr_renamed_8();
        AngelChip.var_int_if = 8;
        if ((GameCanvas.var_dL_do != ThongTinNhanVat.instance)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.aW, new eg_0());
            if (-"  ".length() > 0) {
                return;
            }
        } else {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.aW);
        }
        GameCanvas.var_e_0_do = null;
        fe.var_fe_do = null;
        dN.var_dN_do = null;
        dr_0.var_dr_0_do.cfr_renamed_0();
        if ((ce.cfr_renamed_0().cfr_renamed_4.var_cp_do != null)) {
            ce.cfr_renamed_0().cfr_renamed_4.var_cp_do.void_do();
        }
        ak_0.void_do();
        TienIchGame.void_if(16000L);
    }

    private static Vector java_util_Vector_for(ad_0 ad_02) {
        try {
            byte by2 = ad_02.var_java_io_DataInputStream_do.readByte();
            Vector<aU> vector = new Vector<aU>();
            int n = 0;
            while ((n < by2)) {
                aU aU2 = new aU();
                new aU().cfr_renamed_12 = ad_02.var_java_io_DataInputStream_do.readByte();
                aU2.cfr_renamed_1 = ad_02.var_java_io_DataInputStream_do.readByte();
                aU2.cfr_renamed_3 = ad_02.var_java_io_DataInputStream_do.readByte();
                aU2.cfr_renamed_1 = ad_02.var_java_io_DataInputStream_do.readByte();
                aU2.dangChayAuto = 1;
                vector.addElement(aU2);
                ++n;
                if (" ".length() > 0) continue;
                return null;
            }
            return vector;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public final void cfr_renamed_3() {
        GameCanvas.cfr_renamed_1(MenuChinhAvatar.L);
        TienIchGame.void_if(16000L);
    }

        private static String java_lang_String_do() {
        if ((chuoiGiaTri == null)) {
            int[] nArray = new int[38];
            nArray[0] = 104;
            nArray[1] = 262;
            nArray[2] = 146;
            nArray[3] = 69;
            nArray[4] = 454;
            nArray[5] = 147;
            nArray[6] = 69;
            nArray[7] = 102;
            nArray[8] = 147;
            nArray[9] = 140;
            nArray[10] = 138;
            nArray[11] = 145;
            nArray[12] = 104;
            nArray[13] = 141;
            nArray[14] = 142;
            nArray[15] = 149;
            nArray[16] = 69;
            nArray[17] = 310;
            nArray[18] = 264;
            nArray[19] = 69;
            nArray[20] = 153;
            nArray[21] = 7878;
            nArray[22] = 148;
            nArray[23] = 69;
            nArray[24] = 151;
            nArray[25] = 134;
            nArray[26] = 69;
            nArray[27] = 149;
            nArray[28] = 141;
            nArray[29] = 142;
            nArray[30] = 271;
            nArray[31] = 147;
            nArray[32] = 69;
            nArray[33] = 135;
            nArray[34] = 7880;
            nArray[35] = 147;
            nArray[36] = 70;
            nArray[37] = 19;
            chuoiGiaTri = TienIchGame.cfr_renamed_0(nArray);
        }
        return chuoiGiaTri;
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

    public static void void_for(ad_0 object) {
        try {
            int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
            object = ((ad_0)object).var_java_io_DataInputStream_do.readUTF();
            fe_0.fe_0_do();
            fe_0.cfr_renamed_0(n, (String)object);
            if ((AutoController.nhiemVuHienTai != null) && (n >= 2000000000)) {
                AutoController.nhiemVuHienTai.cfr_renamed_0(n, (String)object);
            }
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    private static int (String[] stringArray != null) {
        if (ee.cfr_renamed_0((Object)stringArray) && ee.boolean_for(stringArray.length)) {
            int n = 0;
            while ((n < stringArray.length)) {
                String string = stringArray[n].toLowerCase().trim();
                if (!ee.boolean_do(string.equals("có") ? 1 : 0) || !ee.boolean_do(string.equals("đồng ý") ? 1 : 0) || ee.boolean_if(string.equals("ok") ? 1 : 0)) {
                    return n;
                }
                ++n;
                if (-"   ".length() < 0) continue;
                return (0xC1 ^ 0x81) & ~(0xF0 ^ 0xB0);
            }
        }
        return 0;
    }

        private static boolean boolean_for(int n) {
        return n > 0;
    }

    public static ee ee_do() {
        if ((var_ee_do == null)) {
            var_ee_do = new ee();
        }
        return var_ee_do;
    }

        public ee() {
        new c();
    }

    static {
        ee.cfr_renamed_5();
    }
}

