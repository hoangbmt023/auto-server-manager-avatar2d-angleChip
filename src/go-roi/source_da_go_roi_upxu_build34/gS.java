/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

public final class gS
extends ax_0
implements ba {
    private static final int[] mangSoNguyen;
    public static gS var_gS_do;

    private static boolean boolean_do(int n) {
        return n == 0;
    }

            public final void void_do(ad_0 object) {
        try {
            switch (((ad_0)object).var_byte_do) {
                case -69: {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.z, new s());
                    return;
                }
                case -68: {
                    byte by2 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(by2, n);
                    return;
                }
                case 51: {
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_1(gS.dd_0_do((ad_0)object));
                    return;
                }
                case 53: {
                    int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_15(n);
                    return;
                }
                case 54: {
                    ee.void_do((ad_0)object);
                    return;
                }
                case 55: {
                    ee.void_for((ad_0)object);
                    return;
                }
                case 57: {
                    int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    byte by3 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(n, by3);
                    return;
                }
                case 58: {
                    int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    int n9 = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    short n8 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    String by8 = "";
                    if ((n8 == -1)) {
                        by8 = ((ad_0)object).var_java_io_DataInputStream_do.readUTF();
                    }
                    ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    System.out.println("AVATAR_GIFT_GIVING: " + ((ad_0)object).var_java_io_DataInputStream_do.available());
                    int nArray = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    int n2 = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    int n5 = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    fe_0.fe_0_do().cfr_renamed_0(n, n9, (int)n8, by8, nArray, n2, n5);
                    return;
                }
                case 59: {
                    n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    int s6 = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    short n12 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    String string = "";
                    int by7 = 0;
                    if ((n12 == -1)) {
                        string = ((ad_0)object).var_java_io_DataInputStream_do.readUTF();
                        if (((0x1F ^ 0x36) & ~(0xE ^ 0x27)) != 0) {
                            return;
                        }
                    } else {
                        by7 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    }
                    if ((AutoController.nhiemVuHienTai != null) && (!gS.boolean_do(AutoController.nhiemVuHienTai instanceof F) || gS.boolean_if(AutoController.nhiemVuHienTai instanceof av_0))) {
                        if ((n12 == -1)) {
                            AutoController.nhiemVuHienTai.boolean_do(string);
                            TienIchGame.void_int();
                            if (gS.boolean_if(AutoController.nhiemVuHienTai instanceof av_0)) {
                                av_0.soXu = System.currentTimeMillis();
                                return;
                            }
                            if (gS.boolean_if(AutoController.nhiemVuHienTai instanceof F)) {
                                F.soXu = System.currentTimeMillis();
                            }
                            return;
                        }
                        if ((n12 == 101)) {
                            if (gS.boolean_if(AutoController.nhiemVuHienTai instanceof av_0) && (n == AngelChip.duLieuNguoiChoi.var_short_char)) {
                                TienIchGame.void_int();
                                av_0.soLuong += 1;
                                av_0.soXu = System.currentTimeMillis();
                                if ("  ".length() <= " ".length()) {
                                    return;
                                }
                            }
                        } else if ((n12 == 100)) {
                            if (gS.boolean_if(AutoController.nhiemVuHienTai instanceof F)) {
                                if ((n == AngelChip.duLieuNguoiChoi.var_short_char)) {
                                    TienIchGame.void_int();
                                    F.soLuong += 1;
                                    F.soXu = System.currentTimeMillis();
                                    if ("   ".length() <= -" ".length()) {
                                        return;
                                    }
                                }
                            } else if (gS.boolean_if(AutoController.nhiemVuHienTai instanceof av_0) && gS.boolean_do(TienIchGame.cfr_renamed_5(ef_0.soLuong) ? 1 : 0)) {
                                av_0.soXu = System.currentTimeMillis() + 1000L;
                            }
                        }
                    }
                    fe_0.fe_0_do().cfr_renamed_0(n, s6, (int)n12, string, by7);
                    return;
                }
                case 60: {
                    byte by4 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    int[] n10 = new int[by4];
                    int string = 0;
                    while ((string < by4)) {
                        n10[string] = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                        ++string;
                        if (-(0x94 ^ 0x90) < 0) continue;
                        return;
                    }
                    fe_0.fe_0_do().cfr_renamed_0(n10);
                    GameCanvas.cfr_renamed_8();
                    return;
                }
                case 78: {
                    return;
                }
                case 82: {
                    int gr2 = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    bW.cfr_renamed_0().void_for(gr2);
                    return;
                }
                case 84: {
                    n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    short s4 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    bW.cfr_renamed_0().void_for(n, s4);
                    return;
                }
                case 85: {
                    n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    bW.cfr_renamed_0().void_int(n);
                    return;
                }
                case 86: {
                    n = ((ad_0)object).var_java_io_DataInputStream_do.readBoolean();
                    String by6 = "";
                    if (gS.boolean_do(n)) {
                        by6 = ((ad_0)object).var_java_io_DataInputStream_do.readUTF();
                    }
                    n = n;
                    object = bW.cfr_renamed_0();
                    if (gS.boolean_if(n)) {
                        ((bW)object).var_gr_do.cfr_renamed_3();
                        ((bn_0)object).var_ei_new = ((bW)object).var_ei_do;
                        ((dL)object).cfr_renamed_8();
                        ek_0.void_do(GameCanvas.var_int_byte / 3);
                        GameCanvas.cfr_renamed_8();
                        return;
                    }
                    GameCanvas.hienThongBaoPopup(by6, 0, (bn_0)object);
                    return;
                }
                case 87: {
                    n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    byte by5 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    bW.cfr_renamed_0();
                    byte n13 = by5;
                    DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
                    if ((dd_02 != null) && (!gS.cfr_renamed_3(((bk_0)dd_02).cfr_renamed_4, 2) || gS.cfr_renamed_0(((bk_0)dd_02).cfr_renamed_4, 13))) {
                        gr s7 = new gr();
                        fe_0.var_java_util_Vector_new.addElement(s7);
                        s7.cfr_renamed_0(dd_02);
                        s7.cfr_renamed_1();
                        s7.var_eq_0_arr_do[s7.var_byte_do - 1].var_int_if = ((aG)dd_02).cfr_renamed_3 + 70 + (bn_0.cfr_renamed_6 - 1) * 35 + gc_0.int_do(25);
                        s7.var_eq_0_arr_do[s7.var_byte_do - 1].soLuong = dd_02.var_int_if;
                        s7.var_int_int = 1;
                        s7.var_int_if = -1;
                        s7.void_do(1);
                        if ((n13 == 2)) {
                            s7.coKichHoat = 1;
                            return;
                        }
                        if ((n13 == 3)) {
                            s7.coKichHoat = 1;
                            s7.coTrangThai = 1;
                            s7.soLuong = 2;
                        }
                    }
                    return;
                }
                case 88: {
                    n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    byte by2 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    byte by3 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    short s5 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    bW.cfr_renamed_0();
                    bW.cfr_renamed_0(n, by2, by3, n, s5);
                    return;
                }
                case 91: {
                    int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    short s2 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    short s3 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    byte by4 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    byte[][] byArrayArray = new byte[by4][];
                    int n3 = 0;
                    while ((n3 < by4)) {
                        short s4 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                        byArrayArray[n3] = new byte[s4];
                        ((ad_0)object).var_java_io_DataInputStream_do.read(byArrayArray[n3]);
                        ++n3;
                        if ("   ".length() != 0) continue;
                        return;
                    }
                    bW.cfr_renamed_0().cfr_renamed_0(n, s2, s3, byArrayArray);
                    return;
                }
                case 92: {
                    fe_0.coTrangThai = ((ad_0)object).var_java_io_DataInputStream_do.readBoolean();
                    if (!gS.boolean_if(fe_0.coTrangThai ? 1 : 0)) break;
                    AngelChip.duLieuNguoiChoi.var_short_goto = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    return;
                }
                case 93: {
                    int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    int n11 = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    fe_0.fe_0_do().void_new(n, n11);
                }
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

        public static DuLieuNguoiChoi dd_0_do(ad_0 ad_02) {
        DuLieuNguoiChoi dd_02 = new DuLieuNguoiChoi();
        new DuLieuNguoiChoi().var_short_char = (short)ad_02.var_java_io_DataInputStream_do.readInt();
        dd_02.cfr_renamed_0(ad_02.var_java_io_DataInputStream_do.readUTF());
        byte by2 = ad_02.var_java_io_DataInputStream_do.readByte();
        int n = 0;
        while ((n < by2)) {
            dd_02.cfr_renamed_1(new ef(ad_02.var_java_io_DataInputStream_do.readShort()));
            ++n;
            if (" ".length() >= 0) continue;
            return null;
        }
        dd_02.var_short_else = ad_02.var_java_io_DataInputStream_do.readShort();
        dd_02.coKichHoat = dd_02.var_short_else;
        dd_02.cfr_renamed_5 = ad_02.var_java_io_DataInputStream_do.readShort();
        dd_02.var_short_if = dd_02.cfr_renamed_5;
        dd_02.var_byte_break = ad_02.var_java_io_DataInputStream_do.readByte();
        dd_02.var_short_void = (byte)(100 - ad_02.var_java_io_DataInputStream_do.readByte());
        dd_02.var_short_if = ad_02.var_java_io_DataInputStream_do.readShort();
        dd_02.var_short_byte = ad_02.var_java_io_DataInputStream_do.readShort();
        return dd_02;
    }

    static {
        gS.cfr_renamed_3();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[11];
        -1 = -" ".length();
        0 = (0x5B ^ 0x11) & ~(0x71 ^ 0x3B);
        101 = 0x21 ^ 0xE ^ (0x65 ^ 0x2F);
        1 = " ".length();
        100 = 0x22 ^ 0x6D ^ (0xE9 ^ 0xC2);
        3 = "   ".length();
        2 = "  ".length();
        13 = 0x77 ^ 0x37 ^ (0xF0 ^ 0xBD);
        70 = 0xDD ^ 0x9B;
        35 = 0x7D ^ 0x5E;
        25 = 0x9F ^ 0x86;
    }

    public static void cfr_renamed_0() {
        if ((var_gS_do == null)) {
            var_gS_do = new gS();
        }
        ee.ee_do().var_ba_do = var_gS_do;
    }

        }

