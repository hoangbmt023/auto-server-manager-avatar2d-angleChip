/*
 * Decompiled with CFR 0.152.
 */
public final class u
implements ba {
    public static u var_u_do;
    private static int[] mangSoNguyen;

            /*
     * Unable to fully structure code
     */
    public final void void_do(ad_0 var1_1) {
        try {
            switch (var1_1.var_byte_do) {
                case 1: {
                    if (!(var1_1.var_java_io_DataInputStream_do.readByte() == 0)) ** GOTO lbl22
                    var2_4 = new bU[6];
                    var3_9 = 0;
                    if ("  ".length() >= 0) ** GOTO lbl18
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var2_4[var3_9] = new bU();
                        var2_4[var3_9].soLuong = 0;
                        var2_4[var3_9].cfr_renamed_12 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var2_4[var3_9].cfr_renamed_12 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var2_4[var3_9].var_short_if = var1_1.var_java_io_DataInputStream_do.readShort();
                        var2_4[var3_9].var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                        ++var3_9;
lbl18:
                        // 2 sources

                        ** while (!u.cfr_renamed_1((int)var3_9, (int)6))
                    }
lbl19:
                    // 1 sources

                    var3_9 = var1_1.var_java_io_DataInputStream_do.readShort();
                    gt.cfr_renamed_0().cfr_renamed_0(var2_4, (short)var3_9, 0, 1);
                    return;
lbl22:
                    // 1 sources

                    if (!u.cfr_renamed_0((int)var1_1.var_java_io_DataInputStream_do.readBoolean())) ** GOTO lbl52
                    var3_10 = new bU[6];
                    var4_16 = 0;
                    if ("   ".length() >= "   ".length()) ** GOTO lbl46
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_10[var4_16] = new bU();
                        var3_10[var4_16].soLuong = 0;
                        var3_10[var4_16].cfr_renamed_12 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_10[var4_16].var_short_if = var1_1.var_java_io_DataInputStream_do.readShort();
                        var5_20 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_10[var4_16].var_short_arr_do = new short[var5_20];
                        var3_10[var4_16].var_short_arr_if = new short[var5_20];
                        var6_23 = 0;
                        if ((198 ^ 166 ^ (4 ^ 97)) != 0) ** GOTO lbl44
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var3_10[var4_16].var_short_arr_do[var6_23] = var1_1.var_java_io_DataInputStream_do.readShort();
                            var3_10[var4_16].var_short_arr_if[var6_23] = var1_1.var_java_io_DataInputStream_do.readShort();
                            ++var6_23;
lbl44:
                            // 2 sources

                            ** while (!u.cfr_renamed_1((int)var6_23, (int)var5_20))
                        }
lbl45:
                        // 1 sources

                        ++var4_16;
lbl46:
                        // 2 sources

                        ** while (!u.cfr_renamed_1((int)var4_16, (int)6))
                    }
lbl47:
                    // 1 sources

                    var4_16 = var1_1.var_java_io_DataInputStream_do.readShort();
                    gt.cfr_renamed_0().var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                    gt.cfr_renamed_0().soXu = System.currentTimeMillis();
                    gt.cfr_renamed_0().cfr_renamed_0(var3_10, (short)var4_16, 0, 0);
                    return;
lbl52:
                    // 1 sources

                    var3_11 = 0;
                    if (-" ".length() <= (176 ^ 180)) ** GOTO lbl74
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_17 = var1_1.var_java_io_DataInputStream_do.readByte();
                        gt.cfr_renamed_0().var_bU_arr_do[var3_11].var_short_arr_do = new short[var4_17];
                        gt.cfr_renamed_0().var_bU_arr_do[var3_11].var_short_arr_if = new short[var4_17];
                        var2_5 = 0;
                        if (-" ".length() <= 0) ** GOTO lbl72
                        return;
lbl-1000:
                        // 1 sources

                        {
                            gt.cfr_renamed_0().var_bU_arr_do[var3_11].var_short_arr_do[var2_5] = var1_1.var_java_io_DataInputStream_do.readShort();
                            gt.cfr_renamed_0().var_bU_arr_do[var3_11].var_short_arr_if[var2_5] = var1_1.var_java_io_DataInputStream_do.readShort();
                            gt.cfr_renamed_0();
                            ++var2_5;
lbl72:
                            // 2 sources

                            ** while (!u.cfr_renamed_1((int)var2_5, (int)var4_17))
                        }
lbl73:
                        // 1 sources

                        ++var3_11;
lbl74:
                        // 2 sources

                        ** while (!u.cfr_renamed_1((int)var3_11, (int)6))
                    }
lbl75:
                    // 1 sources

                    var3_11 = var1_1.var_java_io_DataInputStream_do.readShort();
                    gt.cfr_renamed_0().var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                    gt.cfr_renamed_0().soXu = System.currentTimeMillis();
                    gt.cfr_renamed_0().cfr_renamed_0(null, (short)var3_11, 1, 0);
                    return;
                }
                case 8: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_12 = new short[var2_6];
                    var4_18 = new String[var2_6];
                    var5_21 = 0;
                    if ("  ".length() == "  ".length()) ** GOTO lbl92
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_12[var5_21] = var1_1.var_java_io_DataInputStream_do.readShort();
                        var4_18[var5_21] = var1_1.var_java_io_DataInputStream_do.readUTF();
                        ++var5_21;
lbl92:
                        // 2 sources

                        ** while (!u.cfr_renamed_1((int)var5_21, (int)var2_6))
                    }
lbl93:
                    // 1 sources

                    if ((var2_6 > 0)) {
                        GameCanvas.var_bt_0_do = new cg_0(var3_12, var4_18);
                        return;
                    }
                    GameCanvas.cfr_renamed_8();
                    return;
                }
                case 2: {
                    var5_22 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var2_7 = var1_1.var_java_io_DataInputStream_do.readUTF();
                    var6_24 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var3_13 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_19 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readByte();
                    gt.cfr_renamed_0().cfr_renamed_0(var5_22, var2_7, var6_24, var3_13, var4_19, var1_2);
                    return;
                }
                case 5: {
                    var2_8 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var1_3 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_14 = 0;
                    if ("  ".length() != " ".length()) ** GOTO lbl123
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((var2_8 == gt.cfr_renamed_0().var_bU_arr_do[var3_14].cfr_renamed_12)) {
                            gt.cfr_renamed_0().var_bU_arr_do[var3_14].soLuong = var1_3;
                            gt.cfr_renamed_0().var_byte_if = (byte)var3_14;
                            if ("  ".length() > ((181 + 165 - 207 + 95 ^ 14 + 151 - 133 + 157) & (53 ^ 79 ^ (103 ^ 74) ^ -" ".length()))) break;
                            return;
                        }
                        ++var3_14;
lbl123:
                        // 2 sources

                        ** while (!u.cfr_renamed_1((int)var3_14, (int)gt.cfr_renamed_0().var_bU_arr_do.length))
                    }
lbl124:
                    // 2 sources

                    GameCanvas.cfr_renamed_8();
                    return;
                }
                case 9: {
                    var3_15 = var1_1.var_java_io_DataInputStream_do.readUTF();
                    gt.cfr_renamed_0().cfr_renamed_0(var3_15);
                    return;
                }
                case 10: {
                    gt.cfr_renamed_0().var_bs_do = new bs();
                    gt.cfr_renamed_0().var_bs_do.var_byte_do = var1_1.var_java_io_DataInputStream_do.readByte();
                    gt.cfr_renamed_0().var_bs_do.chuoiGiaTri = var1_1.var_java_io_DataInputStream_do.readUTF();
                    gt.cfr_renamed_0();
                    var1_1.var_java_io_DataInputStream_do.readByte();
                    gt.cfr_renamed_0().var_bs_do.soLuong = var1_1.var_java_io_DataInputStream_do.readInt();
                    gt.cfr_renamed_0().var_bs_do.cfr_renamed_3 = var1_1.var_java_io_DataInputStream_do.readInt();
                    gt.cfr_renamed_0().var_bs_do.cfr_renamed_1 = var1_1.var_java_io_DataInputStream_do.readInt();
                    gt.cfr_renamed_0().var_bs_do.cfr_renamed_4 = var1_1.var_java_io_DataInputStream_do.readInt();
                }
            }
            return;
        }
        catch (Exception v0) {
            v0.printStackTrace();
            return;
        }
    }

    static {
        u.cfr_renamed_0();
    }

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        6 = 0xB6 ^ 0xB0;
        0 = (0x63 ^ 0x48) & ~(0xB ^ 0x20);
        1 = " ".length();
    }
}

