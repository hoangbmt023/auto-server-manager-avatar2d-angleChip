/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from dP
 */
public final class dp_0
extends bE
implements bH {
    private static dp_0 var_dp_0_do;
    private static int[] mangSoNguyen;

        private static boolean boolean_do(int n) {
        return n > 0;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[6];
        2 = "  ".length();
        0 = (102 + 38 - 33 + 69 ^ 179 + 165 - 220 + 66) & (95 + 128 - 170 + 82 ^ 30 + 29 - -22 + 56 ^ -" ".length());
        8 = 0x3C ^ 0x34;
        1 = " ".length();
        4 = 0x55 ^ 0x51;
        30 = 9 + 191 - 19 + 40 ^ 191 + 4 - 167 + 167;
    }

    public static void cfr_renamed_1() {
        w_0.cfr_renamed_9 = 2;
        p_0.var_byte_if = (byte)0;
        fm_0.cfr_renamed_1(2, gI.gI_do());
        bs.var_bs_do.var_bH_do = var_dp_0_do;
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    static {
        dp_0.cfr_renamed_2();
        var_dp_0_do = new dp_0();
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do(bj var1_1) {
        try {
            var2_3 = var1_1.var_java_io_DataInputStream_do.readByte();
            var3_5 = var1_1.var_java_io_DataInputStream_do.readByte();
            if (dp_0.boolean_if((int)w_0.cfr_renamed_1((byte)var2_3, (byte)var3_5))) {
                return;
            }
            switch (var1_1.var_byte_do) {
                case 20: {
                    var2_3 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_5 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var4_8 = new byte[8][8];
                    var5_12 = 0;
                    if (" ".length() > 0) ** GOTO lbl25
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_18 = 0;
                        if ((19 ^ 23) > 0) ** GOTO lbl23
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var4_8[var5_12][var6_18] = var1_1.var_java_io_DataInputStream_do.readByte();
                            ++var6_18;
lbl23:
                            // 2 sources

                            ** while (!dp_0.cfr_renamed_1((int)var6_18, (int)8))
                        }
lbl24:
                        // 1 sources

                        ++var5_12;
lbl25:
                        // 2 sources

                        ** while (!dp_0.cfr_renamed_1((int)var5_12, (int)8))
                    }
lbl26:
                    // 1 sources

                    var5_12 = 0;
                    if (((23 ^ 3 ^ (250 ^ 172)) & (177 ^ 191 ^ (85 ^ 25) ^ -" ".length())) > -" ".length()) ** GOTO lbl42
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var7_21 = w_0.ef_do(var1_1.var_java_io_DataInputStream_do.readInt());
                        w_0.ef_do(var1_1.var_java_io_DataInputStream_do.readInt()).var_short_else = var1_1.var_java_io_DataInputStream_do.readShort();
                        v0 = 0;
                        var7_21.var_short_catch = (short)v0;
                        var7_21.var_short_short = (short)v0;
                        var7_21.var_short_goto = var7_21.var_short_const = var1_1.var_java_io_DataInputStream_do.readShort();
                        var7_21.var_short_for = var1_1.var_java_io_DataInputStream_do.readShort();
                        var7_21.var_short_byte = var1_1.var_java_io_DataInputStream_do.readShort();
                        var7_21.var_int_case <<= 1;
                        var7_21.void_new(4);
                        ++var5_12;
lbl42:
                        // 2 sources

                        ** while (!dp_0.cfr_renamed_1((int)var5_12, (int)2))
                    }
lbl43:
                    // 1 sources

                    gI.gI_do().cfr_renamed_1(var3_5, var2_3, var4_8);
                    return;
                }
                case 64: {
                    var5_13 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var6_19 = new byte[var5_13];
                    var7_22 = new fs[var5_13];
                    var2_3 = 0;
                    if (-" ".length() == -" ".length()) ** GOTO lbl59
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var7_22[var2_3] = new fs();
                        var6_19[var2_3] = var1_1.var_java_io_DataInputStream_do.readByte();
                        var7_22[var2_3].cfr_renamed_2 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var7_22[var2_3].var_short_do = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var2_3;
lbl59:
                        // 2 sources

                        ** while (!dp_0.cfr_renamed_1((int)var2_3, (int)var5_13))
                    }
lbl60:
                    // 1 sources

                    var2_3 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_5 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_9 = new Vector<String>();
                    var5_13 = 0;
                    if (-" ".length() <= "  ".length()) ** GOTO lbl71
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var8_23 = var1_1.var_java_io_DataInputStream_do.readUTF();
                        var4_9.addElement(var8_23);
                        ++var5_13;
lbl71:
                        // 2 sources

                        ** while (!dp_0.cfr_renamed_1((int)var5_13, (int)var3_5))
                    }
lbl72:
                    // 1 sources

                    var5_13 = 0;
                    if (-(119 ^ 114) < 0) ** GOTO lbl86
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_6 = w_0.ef_do(var1_1.var_java_io_DataInputStream_do.readInt());
                        w_0.ef_do(var1_1.var_java_io_DataInputStream_do.readInt()).var_byte_goto = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_6.var_short_else = var1_1.var_java_io_DataInputStream_do.readShort();
                        var3_6.var_short_short = (short)(var1_1.var_java_io_DataInputStream_do.readShort() - var3_6.var_short_goto);
                        var3_6.var_short_catch = (short)(var1_1.var_java_io_DataInputStream_do.readShort() - var3_6.var_short_for);
                        var3_6.coKichHoat = var1_1.var_java_io_DataInputStream_do.readBoolean();
                        if (dp_0.boolean_for((int)var3_6.coKichHoat)) {
                            gI.gI_do().dangChayAuto = 1;
                        }
                        ++var5_13;
lbl86:
                        // 2 sources

                        ** while (!dp_0.cfr_renamed_1((int)var5_13, (int)2))
                    }
lbl87:
                    // 1 sources

                    gI.gI_do().cfr_renamed_1(var6_19, var7_22, (byte)var2_3, var4_9);
                    return;
                }
                case 21: {
                    var5_14 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var8_24 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_5 = var1_1.var_java_io_DataInputStream_do.readByte();
                    gI.gI_do().cfr_renamed_1(var5_14, (int)var8_24, var3_5);
                    return;
                }
                case 49: {
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readInt();
                    gI.gI_do().void_try(var1_2);
                    return;
                }
                case 24: {
                    var2_3 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_7 = new byte[8][8];
                    var4_10 = 0;
                    if (-("   ".length() ^ (21 ^ 18)) <= 0) ** GOTO lbl116
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_15 = 0;
                        if (null == null) ** GOTO lbl114
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var3_7[var4_10][var5_15] = var1_1.var_java_io_DataInputStream_do.readByte();
                            ++var5_15;
lbl114:
                            // 2 sources

                            ** while (!dp_0.cfr_renamed_1((int)var5_15, (int)8))
                        }
lbl115:
                        // 1 sources

                        ++var4_10;
lbl116:
                        // 2 sources

                        ** while (!dp_0.cfr_renamed_1((int)var4_10, (int)8))
                    }
lbl117:
                    // 1 sources

                    gI.gI_do().cfr_renamed_1(var2_3, var3_7);
                    return;
                }
                case 51: {
                    var4_11 = new Vector<String>();
                    var5_16 = 0;
                    if (null == null) ** GOTO lbl147
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var2_3 = var1_1.var_java_io_DataInputStream_do.readInt();
                        var3_5 = var1_1.var_java_io_DataInputStream_do.readInt();
                        var2_4 = w_0.ef_do(var2_3);
                        var2_4.var_int_case /= 2;
                        var2_4.cfr_renamed_2 = (byte)0;
                        var2_4.void_int(var2_4.int_if() + var3_5);
                        if (dp_0.boolean_for(var3_5)) {
                            GameCanvas.void_do(var3_5, var2_4.cfr_renamed_2, var2_4.cfr_renamed_3, 30);
                            var6_20 = String.valueOf(var2_4.chuoiGiaTri) + ": ";
                            if (dp_0.boolean_do(var3_5)) {
                                gI.gI_do().cfr_renamed_23 = var2_4.cfr_renamed_9;
                                var6_20 = String.valueOf(var6_20) + MenuChinhAvatar.aL + "   +" + var3_5 + MenuChinhAvatar.da;
                                if (-" ".length() != -" ".length()) {
                                    return;
                                }
                            } else {
                                var6_20 = String.valueOf(var6_20) + MenuChinhAvatar.be + "  " + var3_5 + MenuChinhAvatar.da;
                            }
                            var4_11.addElement("  ");
                            var4_11.addElement(var6_20);
                        }
                        ++var5_16;
lbl147:
                        // 2 sources

                        ** while (!dp_0.cfr_renamed_1((int)var5_16, (int)2))
                    }
lbl148:
                    // 1 sources

                    gI.gI_do().cfr_renamed_1(var4_11);
                    return;
                }
                case 71: {
                    var5_17 = new byte[8][];
                    var2_3 = 0;
                    if ((102 ^ 112 ^ (17 ^ 2)) > 0) ** GOTO lbl159
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_17[var2_3] = new byte[8];
                        ++var2_3;
lbl159:
                        // 2 sources

                        ** while (!dp_0.cfr_renamed_1((int)var2_3, (int)8))
                    }
lbl160:
                    // 1 sources

                    var2_3 = 0;
                    if (-(120 + 48 - 146 + 156 ^ 178 + 113 - 112 + 3) < 0) ** GOTO lbl174
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_5 = 0;
                        if (((55 + 129 - 143 + 104 ^ 70 + 44 - -17 + 61) & (73 + 141 - 124 + 134 ^ 28 + 21 - -17 + 111 ^ -" ".length())) == ((104 + 95 - 172 + 162 ^ 89 + 17 - 59 + 111) & (140 ^ 134 ^ (0 ^ 41) ^ -" ".length()))) ** GOTO lbl172
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var5_17[var2_3][var3_5] = var1_1.var_java_io_DataInputStream_do.readByte();
                            ++var3_5;
lbl172:
                            // 2 sources

                            ** while (!dp_0.cfr_renamed_1((int)var3_5, (int)8))
                        }
lbl173:
                        // 1 sources

                        ++var2_3;
lbl174:
                        // 2 sources

                        ** while (!dp_0.cfr_renamed_1((int)var2_3, (int)8))
                    }
lbl175:
                    // 1 sources

                    gI.gI_do().cfr_renamed_1(var5_17);
                    return;
                }
            }
            return;
        }
        catch (Exception v1) {
            v1.printStackTrace();
            return;
        }
    }
}

