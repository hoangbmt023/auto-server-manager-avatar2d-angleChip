/*
 * Decompiled with CFR 0.152.
 */
public final class aO
implements bH {
    private static int[] mangSoNguyen;
    public static aO var_aO_do;

        static {
        aO.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        6 = 0xB0 ^ 0xAE ^ (0x93 ^ 0x8B);
        0 = (0xE1 ^ 0xBD) & ~(0x6A ^ 0x36);
        1 = " ".length();
    }

        /*
     * Unable to fully structure code
     */
    public final void void_do(bj var1_1) {
        try {
            switch (var1_1.var_byte_do) {
                case 1: {
                    if (!(var1_1.var_java_io_DataInputStream_do.readByte() == 0)) ** GOTO lbl22
                    var2_4 = new eb[6];
                    var3_9 = 0;
                    if (-(61 + 112 - 17 + 11 ^ 62 + 141 - 191 + 151) <= 0) ** GOTO lbl18
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var2_4[var3_9] = new eb();
                        var2_4[var3_9].soLuong = 0;
                        var2_4[var3_9].cfr_renamed_9 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var2_4[var3_9].var_byte_do = var1_1.var_java_io_DataInputStream_do.readByte();
                        var2_4[var3_9].var_short_if = var1_1.var_java_io_DataInputStream_do.readShort();
                        var2_4[var3_9].var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                        ++var3_9;
lbl18:
                        // 2 sources

                        ** while (!aO.cfr_renamed_0((int)var3_9, (int)6))
                    }
lbl19:
                    // 1 sources

                    var3_9 = var1_1.var_java_io_DataInputStream_do.readShort();
                    eu_0.cfr_renamed_1().cfr_renamed_1(var2_4, (short)var3_9, 0, 1);
                    return;
lbl22:
                    // 1 sources

                    if (!aO.cfr_renamed_0((int)var1_1.var_java_io_DataInputStream_do.readBoolean())) ** GOTO lbl52
                    var3_10 = new eb[6];
                    var4_16 = 0;
                    if ("   ".length() < (96 + 67 - 81 + 70 ^ 83 + 133 - 121 + 61)) ** GOTO lbl46
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_10[var4_16] = new eb();
                        var3_10[var4_16].soLuong = 0;
                        var3_10[var4_16].cfr_renamed_9 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_10[var4_16].var_short_if = var1_1.var_java_io_DataInputStream_do.readShort();
                        var5_20 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_10[var4_16].var_short_arr_if = new short[var5_20];
                        var3_10[var4_16].var_short_arr_do = new short[var5_20];
                        var6_23 = 0;
                        if ("   ".length() >= 0) ** GOTO lbl44
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var3_10[var4_16].var_short_arr_if[var6_23] = var1_1.var_java_io_DataInputStream_do.readShort();
                            var3_10[var4_16].var_short_arr_do[var6_23] = var1_1.var_java_io_DataInputStream_do.readShort();
                            ++var6_23;
lbl44:
                            // 2 sources

                            ** while (!aO.cfr_renamed_0((int)var6_23, (int)var5_20))
                        }
lbl45:
                        // 1 sources

                        ++var4_16;
lbl46:
                        // 2 sources

                        ** while (!aO.cfr_renamed_0((int)var4_16, (int)6))
                    }
lbl47:
                    // 1 sources

                    var4_16 = var1_1.var_java_io_DataInputStream_do.readShort();
                    eu_0.cfr_renamed_1().var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                    eu_0.cfr_renamed_1().soXu = System.currentTimeMillis();
                    eu_0.cfr_renamed_1().cfr_renamed_1(var3_10, (short)var4_16, 0, 0);
                    return;
lbl52:
                    // 1 sources

                    var3_11 = 0;
                    if (((237 ^ 190 ^ (208 ^ 193)) & (35 + 173 - 185 + 221 ^ 57 + 127 - 124 + 122 ^ -" ".length())) == ((59 + 82 - 97 + 101 ^ 21 + 128 - 77 + 79) & (46 ^ 73 ^ (2 ^ 99) ^ -" ".length()))) ** GOTO lbl74
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_17 = var1_1.var_java_io_DataInputStream_do.readByte();
                        eu_0.cfr_renamed_1().var_eb_arr_do[var3_11].var_short_arr_if = new short[var4_17];
                        eu_0.cfr_renamed_1().var_eb_arr_do[var3_11].var_short_arr_do = new short[var4_17];
                        var2_5 = 0;
                        if ("   ".length() != 0) ** GOTO lbl72
                        return;
lbl-1000:
                        // 1 sources

                        {
                            eu_0.cfr_renamed_1().var_eb_arr_do[var3_11].var_short_arr_if[var2_5] = var1_1.var_java_io_DataInputStream_do.readShort();
                            eu_0.cfr_renamed_1().var_eb_arr_do[var3_11].var_short_arr_do[var2_5] = var1_1.var_java_io_DataInputStream_do.readShort();
                            eu_0.cfr_renamed_1();
                            ++var2_5;
lbl72:
                            // 2 sources

                            ** while (!aO.cfr_renamed_0((int)var2_5, (int)var4_17))
                        }
lbl73:
                        // 1 sources

                        ++var3_11;
lbl74:
                        // 2 sources

                        ** while (!aO.cfr_renamed_0((int)var3_11, (int)6))
                    }
lbl75:
                    // 1 sources

                    var3_11 = var1_1.var_java_io_DataInputStream_do.readShort();
                    eu_0.cfr_renamed_1().var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                    eu_0.cfr_renamed_1().soXu = System.currentTimeMillis();
                    eu_0.cfr_renamed_1().cfr_renamed_1(null, (short)var3_11, 1, 0);
                    return;
                }
                case 8: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_12 = new short[var2_6];
                    var4_18 = new String[var2_6];
                    var5_21 = 0;
                    if ("  ".length() <= "   ".length()) ** GOTO lbl92
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_12[var5_21] = var1_1.var_java_io_DataInputStream_do.readShort();
                        var4_18[var5_21] = var1_1.var_java_io_DataInputStream_do.readUTF();
                        ++var5_21;
lbl92:
                        // 2 sources

                        ** while (!aO.cfr_renamed_0((int)var5_21, (int)var2_6))
                    }
lbl93:
                    // 1 sources

                    if ((var2_6 > 0)) {
                        GameCanvas.var_dj_0_do = new eb_0(var3_12, var4_18);
                        return;
                    }
                    GameCanvas.cfr_renamed_7();
                    return;
                }
                case 2: {
                    var5_22 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var2_7 = var1_1.var_java_io_DataInputStream_do.readUTF();
                    var6_24 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var3_13 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_19 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readByte();
                    eu_0.cfr_renamed_1().cfr_renamed_1(var5_22, var2_7, var6_24, var3_13, var4_19, var1_2);
                    return;
                }
                case 5: {
                    var2_8 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var1_3 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_14 = 0;
                    if ("   ".length() != -" ".length()) ** GOTO lbl123
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((var2_8 == eu_0.cfr_renamed_1().var_eb_arr_do[var3_14].cfr_renamed_9)) {
                            eu_0.cfr_renamed_1().var_eb_arr_do[var3_14].soLuong = var1_3;
                            eu_0.cfr_renamed_1().var_byte_for = (byte)var3_14;
                            if (((173 ^ 152 ^ (41 ^ 79)) & (67 ^ 108 ^ (204 ^ 176) ^ -" ".length())) < " ".length()) break;
                            return;
                        }
                        ++var3_14;
lbl123:
                        // 2 sources

                        ** while (!aO.cfr_renamed_0((int)var3_14, (int)eu_0.cfr_renamed_1().var_eb_arr_do.length))
                    }
lbl124:
                    // 2 sources

                    GameCanvas.cfr_renamed_7();
                    return;
                }
                case 9: {
                    var3_15 = var1_1.var_java_io_DataInputStream_do.readUTF();
                    eu_0.cfr_renamed_1().cfr_renamed_1(var3_15);
                    return;
                }
                case 10: {
                    eu_0.cfr_renamed_1().var_a_0_do = new a_0();
                    eu_0.cfr_renamed_1().var_a_0_do.var_byte_do = var1_1.var_java_io_DataInputStream_do.readByte();
                    eu_0.cfr_renamed_1().var_a_0_do.chuoiGiaTri = var1_1.var_java_io_DataInputStream_do.readUTF();
                    eu_0.cfr_renamed_1();
                    var1_1.var_java_io_DataInputStream_do.readByte();
                    eu_0.cfr_renamed_1().var_a_0_do.cfr_renamed_2 = var1_1.var_java_io_DataInputStream_do.readInt();
                    eu_0.cfr_renamed_1().var_a_0_do.soLuong = var1_1.var_java_io_DataInputStream_do.readInt();
                    eu_0.cfr_renamed_1().var_a_0_do.cfr_renamed_0 = var1_1.var_java_io_DataInputStream_do.readInt();
                    eu_0.cfr_renamed_1().var_a_0_do.cfr_renamed_3 = var1_1.var_java_io_DataInputStream_do.readInt();
                }
            }
            return;
        }
        catch (Exception v0) {
            v0.printStackTrace();
            return;
        }
    }

        }

