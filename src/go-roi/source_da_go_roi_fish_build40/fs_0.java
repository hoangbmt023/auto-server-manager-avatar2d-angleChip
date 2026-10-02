/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from fS
 */
public final class fs_0
extends bE
implements bH {
    private static final int[] mangSoNguyen;
    public static fs_0 var_fs_0_do;

    private static boolean boolean_do(int n) {
        return n != 0;
    }

        public final void void_do(bj object) {
        try {
            switch (((bj)object).var_byte_do) {
                case -69: {
                    GameCanvas.hienThongBaoPopup(MenuChinhAvatar.T, new aj_0());
                    return;
                }
                case -68: {
                    byte by2 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    int n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    go_0.go_0_do();
                    go_0.cfr_renamed_1(by2, n);
                    return;
                }
                case 51: {
                    go_0.go_0_do();
                    go_0.cfr_renamed_3(fs_0.ef_do((bj)object));
                    return;
                }
                case 53: {
                    int n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    go_0.go_0_do();
                    go_0.void_if(n);
                    return;
                }
                case 54: {
                    fh_0.void_for((bj)object);
                    return;
                }
                case 55: {
                    fh_0.void_do((bj)object);
                    return;
                }
                case 57: {
                    int n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    byte by3 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    go_0.go_0_do();
                    go_0.cfr_renamed_1(n, by3);
                    return;
                }
                case 58: {
                    int n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    int n9 = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    short n8 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    String by8 = "";
                    if ((n8 == -1)) {
                        by8 = ((bj)object).var_java_io_DataInputStream_do.readUTF();
                    }
                    ((bj)object).var_java_io_DataInputStream_do.readInt();
                    ((bj)object).var_java_io_DataInputStream_do.readByte();
                    System.out.println("AVATAR_GIFT_GIVING: " + ((bj)object).var_java_io_DataInputStream_do.available());
                    int nArray = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    int n2 = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    int n5 = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    go_0.go_0_do().cfr_renamed_1(n, n9, (int)n8, by8, nArray, n2, n5);
                    return;
                }
                case 59: {
                    n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    int s6 = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    short n12 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    String string = "";
                    int by7 = 0;
                    if ((n12 == -1)) {
                        string = ((bj)object).var_java_io_DataInputStream_do.readUTF();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    } else {
                        by7 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    }
                    if ((AutoController.nhiemVuHienTai != null) && (!fs_0.boolean_if(AutoController.nhiemVuHienTai instanceof L) || !fs_0.boolean_if(AutoController.nhiemVuHienTai instanceof bL) || fs_0.boolean_do(AutoController.nhiemVuHienTai instanceof T))) {
                        if ((n12 == -1)) {
                            AutoController.nhiemVuHienTai.boolean_do(string);
                            TienIchGame.cfr_renamed_12();
                            if (fs_0.boolean_do(AutoController.nhiemVuHienTai instanceof bL)) {
                                bL.soXu = System.currentTimeMillis();
                                return;
                            }
                            if (fs_0.boolean_do(AutoController.nhiemVuHienTai instanceof L)) {
                                L.soXu = System.currentTimeMillis();
                            }
                            return;
                        }
                        if ((n12 == 101)) {
                            if (fs_0.boolean_do(AutoController.nhiemVuHienTai instanceof bL) && (n == AngelChip.duLieuNguoiChoi.var_short_goto)) {
                                TienIchGame.cfr_renamed_12();
                                bL.soLuong += 1;
                                bL.soXu = System.currentTimeMillis();
                                if (-" ".length() >= ((165 + 20 - 149 + 212 ^ 67 + 50 - -12 + 33) & (2 ^ 0x28 ^ (0xB1 ^ 0xC1) ^ -" ".length()))) {
                                    return;
                                }
                            }
                        } else if ((n12 == 100)) {
                            if (fs_0.boolean_do(AutoController.nhiemVuHienTai instanceof T)) {
                                if ((n == AngelChip.duLieuNguoiChoi.var_short_goto)) {
                                    T.T_do().soLuong += 1;
                                    TienIchGame.void_int();
                                    if ("  ".length() == 0) {
                                        return;
                                    }
                                }
                            } else if (fs_0.boolean_do(AutoController.nhiemVuHienTai instanceof L)) {
                                if ((n == AngelChip.duLieuNguoiChoi.var_short_goto)) {
                                    TienIchGame.cfr_renamed_12();
                                    L.soLuong += 1;
                                    L.soXu = System.currentTimeMillis();
                                    if (-"   ".length() >= 0) {
                                        return;
                                    }
                                }
                            } else if (fs_0.boolean_do(AutoController.nhiemVuHienTai instanceof bL) && fs_0.boolean_if(TienIchGame.cfr_renamed_4(fh.var_int_char) ? 1 : 0)) {
                                bL.soXu = System.currentTimeMillis() + 1000L;
                            }
                        }
                    }
                    go_0.go_0_do().cfr_renamed_1(n, s6, (int)n12, string, by7);
                    return;
                }
                case 60: {
                    byte by4 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    int[] n10 = new int[by4];
                    int string = 0;
                    while ((string < by4)) {
                        n10[string] = ((bj)object).var_java_io_DataInputStream_do.readByte();
                        ++string;
                        if (-"  ".length() < 0) continue;
                        return;
                    }
                    go_0.go_0_do().cfr_renamed_1(n10);
                    GameCanvas.cfr_renamed_7();
                    return;
                }
                case 78: {
                    return;
                }
                case 82: {
                    int ef2 = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    u_0.cfr_renamed_1().void_if(ef2);
                    return;
                }
                case 84: {
                    n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    short s4 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    u_0.cfr_renamed_1().void_for(n, s4);
                    return;
                }
                case 85: {
                    n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    u_0.cfr_renamed_1().void_do(n);
                    return;
                }
                case 86: {
                    n = ((bj)object).var_java_io_DataInputStream_do.readBoolean();
                    String by6 = "";
                    if (fs_0.boolean_if(n)) {
                        by6 = ((bj)object).var_java_io_DataInputStream_do.readUTF();
                    }
                    n = n;
                    object = u_0.cfr_renamed_1();
                    if (fs_0.boolean_do(n)) {
                        TienIchGame.cfr_renamed_14();
                        ((u_0)object).var_es_0_do.cfr_renamed_0();
                        ((en)object).cfr_renamed_3 = ((u_0)object).var_fl_0_do;
                        ((en)object).cfr_renamed_4();
                        fm.void_if(GameCanvas.soLuongKhoa / 3);
                        GameCanvas.cfr_renamed_7();
                        if ((AutoController.nhiemVuHienTai != null) && fs_0.boolean_do(AutoController.nhiemVuHienTai instanceof AutoCauCa)) {
                            AutoCauCa.bs_0_do().var_int_int = 3;
                            AutoCauCa.bs_0_do().void_do(1);
                            return;
                        }
                    } else {
                        GameCanvas.hienThongBaoPopup(by6, 0, (dF)object);
                    }
                    return;
                }
                case 87: {
                    n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    byte by5 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    u_0.cfr_renamed_1();
                    byte n13 = by5;
                    DuLieuNguoiChoi s7 = fh.ef_do(n);
                    if ((s7 != null) && (!(s7.var_short_for != 2) || (s7.var_short_for == 13))) {
                        es_0 es_02 = new es_0();
                        go_0.var_java_util_Vector_new.addElement(es_02);
                        es_02.cfr_renamed_1(s7);
                        es_02.cfr_renamed_2();
                        es_02.var_fs_arr_if[es_02.var_byte_do - 1].soLuong = s7.var_short_for + 70 + (dF.cfr_renamed_12 - 1) * 35 + hg.int_new(25);
                        es_02.var_fs_arr_if[es_02.var_byte_do - 1].var_int_if = s7.var_boolean_int ? 1 : 0;
                        es_02.soLuong = 1;
                        es_02.var_int_int = -1;
                        es_02.void_do(1);
                        if ((n13 == 2)) {
                            es_02.coKichHoat = 1;
                            return;
                        }
                        if ((n13 == 3)) {
                            es_02.coKichHoat = 1;
                            es_02.coTrangThai = 1;
                            es_02.soLuongKhoa = 2;
                        }
                    }
                    return;
                }
                case 88: {
                    n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    byte by2 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    byte by3 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    int n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    short s5 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    u_0.cfr_renamed_1();
                    u_0.cfr_renamed_1(n, by2, by3, n, s5);
                    return;
                }
                case 91: {
                    int n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    short s2 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    short s3 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    byte by4 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    byte[][] byArrayArray = new byte[by4][];
                    int n3 = 0;
                    while ((n3 < by4)) {
                        short s4 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                        byArrayArray[n3] = new byte[s4];
                        ((bj)object).var_java_io_DataInputStream_do.read(byArrayArray[n3]);
                        ++n3;
                        if (((0x45 ^ 9) & ~(0xEC ^ 0xA0)) == ((0xA4 ^ 0x88) & ~(0x94 ^ 0xB8))) continue;
                        return;
                    }
                    u_0.cfr_renamed_1().cfr_renamed_1(n, s2, s3, byArrayArray);
                    return;
                }
                case 92: {
                    go_0.var_boolean_byte = ((bj)object).var_java_io_DataInputStream_do.readBoolean();
                    if (!fs_0.boolean_do(go_0.var_boolean_byte ? 1 : 0)) break;
                    AngelChip.duLieuNguoiChoi.var_short_do = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    return;
                }
                case 93: {
                    int n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    int n11 = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    go_0.go_0_do().void_int(n, n11);
                }
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

            static {
        fs_0.cfr_renamed_2();
    }

    public static DuLieuNguoiChoi ef_do(bj bj2) {
        DuLieuNguoiChoi ef2 = new DuLieuNguoiChoi();
        new DuLieuNguoiChoi().var_short_goto = (short)bj2.var_java_io_DataInputStream_do.readInt();
        ef2.cfr_renamed_1(bj2.var_java_io_DataInputStream_do.readUTF());
        byte by2 = bj2.var_java_io_DataInputStream_do.readByte();
        int n = 0;
        while ((n < by2)) {
            ef2.cfr_renamed_0(new cg(bj2.var_java_io_DataInputStream_do.readShort()));
            ++n;
            if (" ".length() >= 0) continue;
            return null;
        }
        ef2.var_short_for = ef2.var_short_char = bj2.var_java_io_DataInputStream_do.readShort();
        ef2.var_short_try = bj2.var_java_io_DataInputStream_do.readShort();
        ef2.var_boolean_int = ef2.var_short_try;
        ef2.var_byte_else = bj2.var_java_io_DataInputStream_do.readByte();
        ef2.var_short_float = (byte)(100 - bj2.var_java_io_DataInputStream_do.readByte());
        ef2.var_short_break = bj2.var_java_io_DataInputStream_do.readShort();
        ef2.cfr_renamed_23 = bj2.var_java_io_DataInputStream_do.readShort();
        return ef2;
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

        public static void cfr_renamed_1() {
        if ((var_fs_0_do == null)) {
            var_fs_0_do = new fs_0();
        }
        fh_0.fh_0_do().var_bH_do = var_fs_0_do;
    }

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[11];
        -1 = -" ".length();
        0 = (0x13 ^ 0xA ^ (0x6D ^ 0x40)) & (0xD0 ^ 0xA0 ^ (2 ^ 0x46) ^ -" ".length());
        101 = 72 + 15 - -115 + 34 ^ 12 + 105 - 7 + 27;
        1 = " ".length();
        100 = 0x7B ^ 0x1F;
        3 = "   ".length();
        2 = "  ".length();
        13 = 0x57 ^ 0x5A;
        70 = 0xDF ^ 0x99;
        35 = 79 + 16 - 4 + 40 ^ 1 + 47 - -74 + 38;
        25 = 86 + 32 - -33 + 22 ^ 118 + 126 - 87 + 23;
    }
}

