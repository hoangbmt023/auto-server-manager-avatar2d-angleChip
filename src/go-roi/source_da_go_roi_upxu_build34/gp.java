/*
 * Decompiled with CFR 0.152.
 */
public final class gp
implements ba {
    public static gp var_gp_do;
    private static int[] mangSoNguyen;

                private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        -1 = -" ".length();
        0 = (0x54 ^ 0x38 ^ (6 ^ 0x2D)) & (0x3E ^ 3 ^ (0xD7 ^ 0xAD) ^ -" ".length());
        6 = 0xD8 ^ 0xB6 ^ (0x40 ^ 0x28);
        3 = "   ".length();
    }

            /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void void_do(ad_0 ad_02) {
        try {
            int n = ad_02.var_java_io_DataInputStream_do.readByte();
            int n2 = ad_02.var_java_io_DataInputStream_do.readByte();
            if (gp.cfr_renamed_0(a_0.cfr_renamed_0((byte)n, (byte)n2) ? 1 : 0)) {
                return;
            }
            switch (ad_02.var_byte_do) {
                case 20: {
                    o.var_o_do.var_byte_do = n = ad_02.var_java_io_DataInputStream_do.readByte();
                    o.var_o_do.cfr_renamed_3((byte)n);
                    return;
                }
                case 21: {
                    n = ad_02.var_java_io_DataInputStream_do.readByte();
                    if ((n == -1)) {
                        o.var_o_do.cfr_renamed_11();
                        o.var_o_do.dangChayAuto = 0;
                        return;
                    }
                    if (!(n != -1)) return;
                    n2 = 0;
                    while (true) {
                        if ((n2 >= 6)) {
                            o.var_o_do.cfr_renamed_1((byte)n);
                            return;
                        }
                        o.var_o_do.var_byte_arr_arr_do[n][n2] = ad_02.var_java_io_DataInputStream_do.readByte();
                        ++n2;
                    }
                }
                case 49: {
                    return;
                }
                case 37: {
                    byte[] byArray = new byte[3];
                    n = 0;
                    if (" ".length() <= 0) {
                        return;
                    }
                    while (true) {
                        if ((n >= 3)) {
                            o.var_o_do.cfr_renamed_0(byArray);
                            a_0.cfr_renamed_13();
                            return;
                        }
                        byArray[n] = ad_02.var_java_io_DataInputStream_do.readByte();
                        ++n;
                    }
                }
                case 100: {
                    n = ad_02.var_java_io_DataInputStream_do.readByte();
                    o.var_o_do.cfr_renamed_0((byte)n);
                    return;
                }
                case 65: {
                    n = ad_02.var_java_io_DataInputStream_do.readByte();
                    n2 = ad_02.var_java_io_DataInputStream_do.readByte();
                    byte by2 = ad_02.var_java_io_DataInputStream_do.readByte();
                    byte by3 = ad_02.var_java_io_DataInputStream_do.readByte();
                    if (!(n2 != by2)) return;
                    if (!(by3 > 0)) return;
                    o.var_o_do.var_byte_arr_arr_do[n][by2] = by3;
                    o.var_o_do.cfr_renamed_0((byte)n, (byte)n2, by2);
                    return;
                }
                case 60: {
                    n = ad_02.var_java_io_DataInputStream_do.readByte();
                    n2 = ad_02.var_java_io_DataInputStream_do.readByte();
                    int n3 = ad_02.var_java_io_DataInputStream_do.readInt();
                    o.var_o_do.cfr_renamed_0((byte)n, (byte)n2, n3);
                    return;
                }
                case 51: {
                    int[] nArray = new int[a_0.var_java_util_Vector_do.size()];
                    n2 = 0;
                    while (true) {
                        if ((n2 >= nArray.length)) {
                            o.var_o_do.cfr_renamed_0(nArray);
                            return;
                        }
                        nArray[n2] = ad_02.var_java_io_DataInputStream_do.readInt();
                        ++n2;
                    }
                }
                case 62: {
                    o.var_o_do.var_byte_do = n = ad_02.var_java_io_DataInputStream_do.readByte();
                    n2 = 0;
                    if (-" ".length() > 0) {
                        return;
                    }
                    block16: while (true) {
                        if ((n2 >= a_0.var_java_util_Vector_do.size())) {
                            o.var_o_do.cfr_renamed_12();
                            return;
                        }
                        n = 0;
                        if (" ".length() != " ".length()) {
                            return;
                        }
                        while (true) {
                            if ((n >= 6)) {
                                ++n2;
                                continue block16;
                            }
                            o.var_o_do.var_byte_arr_arr_do[n2][n] = ad_02.var_java_io_DataInputStream_do.readByte();
                            ++n;
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
        gp.cfr_renamed_0();
    }
}

