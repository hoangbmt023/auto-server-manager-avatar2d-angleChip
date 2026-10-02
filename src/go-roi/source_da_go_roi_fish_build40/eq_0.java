/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQ
 */
public final class eq_0
implements bH {
    public static eq_0 var_eq_0_do;
    private static int[] mangSoNguyen;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void void_do(bj bj2) {
        try {
            byte by2 = bj2.var_java_io_DataInputStream_do.readByte();
            int n = bj2.var_java_io_DataInputStream_do.readByte();
            if (eq_0.cfr_renamed_0(w_0.cfr_renamed_1(by2, (byte)n) ? 1 : 0)) {
                return;
            }
            switch (bj2.var_byte_do) {
                case 20: {
                    z_0.var_z_0_do.var_byte_do = by2 = bj2.var_java_io_DataInputStream_do.readByte();
                    z_0.var_z_0_do.cfr_renamed_2(by2);
                    return;
                }
                case 21: {
                    by2 = bj2.var_java_io_DataInputStream_do.readByte();
                    if ((by2 == -1)) {
                        z_0.var_z_0_do.cfr_renamed_9();
                        z_0.var_z_0_do.dangChayAuto = 0;
                        return;
                    }
                    if (!(by2 != -1)) return;
                    n = 0;
                    if (" ".length() <= ((85 + 151 - 225 + 143 ^ 150 + 159 - 274 + 145) & (0xBF ^ 0x89 ^ (0x39 ^ 0x21) ^ -" ".length()))) {
                        return;
                    }
                    while (true) {
                        if ((n >= 6)) {
                            z_0.var_z_0_do.cfr_renamed_0(by2);
                            return;
                        }
                        z_0.var_z_0_do.var_byte_arr_arr_do[by2][n] = bj2.var_java_io_DataInputStream_do.readByte();
                        ++n;
                    }
                }
                case 49: {
                    return;
                }
                case 37: {
                    byte[] byArray = new byte[3];
                    by2 = 0;
                    if (-"  ".length() >= 0) {
                        return;
                    }
                    while (true) {
                        if ((by2 >= 3)) {
                            z_0.var_z_0_do.cfr_renamed_1(byArray);
                            w_0.cfr_renamed_18();
                            return;
                        }
                        byArray[by2] = bj2.var_java_io_DataInputStream_do.readByte();
                        ++by2;
                    }
                }
                case 100: {
                    by2 = bj2.var_java_io_DataInputStream_do.readByte();
                    z_0.var_z_0_do.cfr_renamed_1(by2);
                    return;
                }
                case 65: {
                    by2 = bj2.var_java_io_DataInputStream_do.readByte();
                    n = bj2.var_java_io_DataInputStream_do.readByte();
                    byte by3 = bj2.var_java_io_DataInputStream_do.readByte();
                    byte by4 = bj2.var_java_io_DataInputStream_do.readByte();
                    if (!(n != by3)) return;
                    if (!(by4 > 0)) return;
                    z_0.var_z_0_do.var_byte_arr_arr_do[by2][by3] = by4;
                    z_0.var_z_0_do.cfr_renamed_1(by2, (byte)n, by3);
                    return;
                }
                case 60: {
                    by2 = bj2.var_java_io_DataInputStream_do.readByte();
                    n = bj2.var_java_io_DataInputStream_do.readByte();
                    int n2 = bj2.var_java_io_DataInputStream_do.readInt();
                    z_0.var_z_0_do.cfr_renamed_1(by2, (byte)n, n2);
                    return;
                }
                case 51: {
                    int[] nArray = new int[w_0.var_java_util_Vector_if.size()];
                    n = 0;
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                    while (true) {
                        if ((n >= nArray.length)) {
                            z_0.var_z_0_do.cfr_renamed_1(nArray);
                            return;
                        }
                        nArray[n] = bj2.var_java_io_DataInputStream_do.readInt();
                        ++n;
                    }
                }
                case 62: {
                    z_0.var_z_0_do.var_byte_do = by2 = bj2.var_java_io_DataInputStream_do.readByte();
                    n = 0;
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                    block16: while (true) {
                        if ((n >= w_0.var_java_util_Vector_if.size())) {
                            z_0.var_z_0_do.cfr_renamed_13();
                            return;
                        }
                        by2 = 0;
                        while (true) {
                            if ((by2 >= 6)) {
                                ++n;
                                continue block16;
                            }
                            z_0.var_z_0_do.var_byte_arr_arr_do[n][by2] = bj2.var_java_io_DataInputStream_do.readByte();
                            ++by2;
                        }
                        break;
                    }
                }
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static {
        eq_0.cfr_renamed_1();
    }

                    private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        -1 = -" ".length();
        0 = (0x60 ^ 0x77 ^ (0x38 ^ 0x20)) & (55 + 45 - -79 + 8 ^ 38 + 106 - 87 + 123 ^ -" ".length());
        6 = 1 + 145 - 18 + 30 ^ 25 + 66 - 43 + 104;
        3 = "   ".length();
    }

    }

