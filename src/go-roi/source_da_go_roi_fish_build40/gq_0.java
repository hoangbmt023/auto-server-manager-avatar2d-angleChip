/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from gq
 */
public final class gq_0
extends bE
implements bH {
    private static int[] mangSoNguyen;
    private static gq_0 var_gq_0_do;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void void_do(bj var1_1) {
        try {
            var2_6 = var1_1.var_java_io_DataInputStream_do.readByte();
            var3_8 = var1_1.var_java_io_DataInputStream_do.readByte();
            if (gq_0.boolean_for((int)w_0.cfr_renamed_1(var2_6, (byte)var3_8))) {
                return;
            }
            switch (var1_1.var_byte_do) {
                case 20: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_9 = new Vector<dC>();
                    var4_12 = 0;
                    if (-" ".length() < 0) ** GOTO lbl18
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_19 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_9.addElement(new dC(var5_19));
                        ++var4_12;
lbl18:
                        // 2 sources

                        ** while (!gq_0.cfr_renamed_2((int)var4_12, (int)9))
                    }
lbl19:
                    // 1 sources

                    var4_12 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var5_19 = var1_1.var_java_io_DataInputStream_do.readInt();
                    GameCanvas.cfr_renamed_7();
                    w_0.cfr_renamed_30();
                    bT.bT_do().cfr_renamed_1(var2_6, var3_9, var4_12, (int)var5_19);
                    return;
                }
                case 49: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readInt();
                    bT.bT_do().void_int(var2_6, var1_2);
                    return;
                }
                case 21: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_8 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var4_13 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var5_20 = 0;
                    if ((var4_13 != -1)) {
                        var5_20 = var1_1.var_java_io_DataInputStream_do.readByte();
                    }
                    GameCanvas.cfr_renamed_7();
                    bT.bT_do().cfr_renamed_1((int)var2_6, var3_8, (int)var4_13, var5_20);
                    return;
                }
                case 63: {
                    var1_3 = var1_1.var_java_io_DataInputStream_do.readByte();
                    GameCanvas.cfr_renamed_7();
                    bT.bT_do().void_try(var1_3);
                    return;
                }
                case 64: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_8 = (int)var1_1.var_java_io_DataInputStream_do.readBoolean();
                    var4_14 = 0;
                    if (gq_0.boolean_do(var3_8)) {
                        var4_14 = var1_1.var_java_io_DataInputStream_do.readByte();
                    }
                    var1_4 = var1_1.var_java_io_DataInputStream_do.readByte();
                    GameCanvas.cfr_renamed_7();
                    bT.bT_do().cfr_renamed_1((boolean)var3_8, var4_14, (int)var2_6, var1_4);
                    return;
                }
                case 65: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_8 = (int)var1_1.var_java_io_DataInputStream_do.readBoolean();
                    var4_15 = var1_1.var_java_io_DataInputStream_do.readBoolean();
                    var5_21 = new int[4];
                    var6_24 = new int[12];
                    if (!gq_0.boolean_do(var3_8)) ** GOTO lbl86
                    var7_28 = 0;
                    if (null == null) ** GOTO lbl69
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_21[var7_28] = var1_1.var_java_io_DataInputStream_do.readInt();
                        ++var7_28;
lbl69:
                        // 2 sources

                        ** while (!gq_0.cfr_renamed_2((int)var7_28, (int)4))
                    }
lbl70:
                    // 1 sources

                    var7_28 = 0;
                    if (" ".length() >= ((3 + 159 - 150 + 171 ^ 76 + 129 - 167 + 93) & (39 + 184 - 118 + 86 ^ 126 + 120 - 124 + 17 ^ -" ".length()))) ** GOTO lbl77
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_24[var7_28] = -1;
                        ++var7_28;
lbl77:
                        // 2 sources

                        ** while (!gq_0.cfr_renamed_2((int)var7_28, (int)12))
                    }
lbl78:
                    // 1 sources

                    var7_28 = 0;
                    if ((148 ^ 144) == (144 ^ 148)) ** GOTO lbl85
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_24[var7_28] = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var7_28;
lbl85:
                        // 2 sources

                        ** while (!gq_0.boolean_if((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl86:
                    // 2 sources

                    GameCanvas.cfr_renamed_7();
                    bT.bT_do().cfr_renamed_1((boolean)var3_8, var6_24, var4_15, (int)var2_6);
                    return;
                }
                case 51: {
                    var7_29 = new int[4];
                    var2_6 = 0;
                    if ("  ".length() > -" ".length()) ** GOTO lbl98
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var7_29[var2_6] = var1_1.var_java_io_DataInputStream_do.readInt();
                        ++var2_6;
lbl98:
                        // 2 sources

                        ** while (!gq_0.cfr_renamed_2((int)var2_6, (int)4))
                    }
lbl99:
                    // 1 sources

                    var2_7 = new int[4];
                    var3_8 = 0;
                    if (-" ".length() < ((60 ^ 49) & ~(103 ^ 106))) ** GOTO lbl107
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var2_7[var3_8] = var1_1.var_java_io_DataInputStream_do.readInt();
                        ++var3_8;
lbl107:
                        // 2 sources

                        ** while (!gq_0.cfr_renamed_2((int)var3_8, (int)4))
                    }
lbl108:
                    // 1 sources

                    var3_10 = new int[4][11];
                    var4_16 = 0;
                    if ("  ".length() > 0) ** GOTO lbl123
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_22 = 0;
                        if ((172 ^ 168) >= -" ".length()) ** GOTO lbl121
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var3_10[var4_16][var5_22] = -1;
                            ++var5_22;
lbl121:
                            // 2 sources

                            ** while (!gq_0.cfr_renamed_2((int)var5_22, (int)11))
                        }
lbl122:
                        // 1 sources

                        ++var4_16;
lbl123:
                        // 2 sources

                        ** while (!gq_0.cfr_renamed_2((int)var4_16, (int)4))
                    }
lbl124:
                    // 1 sources

                    var4_16 = 0;
                    var5_22 = 0;
                    if ("   ".length() != 0) ** GOTO lbl142
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_25 = var1_1.var_java_io_DataInputStream_do.readByte();
                        if ((var6_25 == -1)) {
                            if ((var4_16 < 3)) {
                                ++var4_16;
                            }
                            var5_22 = 0;
                            if ("   ".length() != (30 ^ 21 ^ (178 ^ 189))) continue;
                            return;
                        }
                        var3_10[var4_16][var5_22] = var6_25;
                        if (!(var5_22 < 10)) continue;
                        ++var5_22;
lbl142:
                        // 4 sources

                        ** while (!gq_0.boolean_if((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl143:
                    // 1 sources

                    GameCanvas.cfr_renamed_7();
                    bT.bT_do().cfr_renamed_1(var2_7, var3_10);
                    return;
                }
                case 67: {
                    var6_26 = var1_1.var_java_io_DataInputStream_do.readBoolean();
                    var2_6 = -1;
                    if (gq_0.boolean_do((int)var6_26)) {
                        var2_6 = var1_1.var_java_io_DataInputStream_do.readByte();
                    }
                    GameCanvas.cfr_renamed_7();
                    bT.bT_do().cfr_renamed_1(var6_26, var2_6);
                    return;
                }
                case 68: {
                    var1_5 = var1_1.var_java_io_DataInputStream_do.readByte();
                    GameCanvas.cfr_renamed_7();
                    bT.bT_do().cfr_renamed_1(var1_5);
                    return;
                }
                case 69: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_11 = new int[4];
                    var4_17 = 0;
                    if (" ".length() > 0) ** GOTO lbl169
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_11[var4_17] = var1_1.var_java_io_DataInputStream_do.readInt();
                        ++var4_17;
lbl169:
                        // 2 sources

                        ** while (!gq_0.cfr_renamed_2((int)var4_17, (int)4))
                    }
lbl170:
                    // 1 sources

                    bT.bT_do().void_byte(var2_6);
                    return;
                }
                case 62: {
                    var4_18 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_8 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var5_23 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var6_27 = new int[4][4];
                    var7_30 = new int[4][3];
                    var8_31 = 0;
                    if (" ".length() > ((166 ^ 158) & ~(116 ^ 76))) ** GOTO lbl195
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var9_32 = 0;
                        if (-(131 + 0 - 86 + 106 ^ 82 + 112 - 56 + 9) <= 0) ** GOTO lbl193
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var6_27[var8_31][var9_32] = -1;
                            if ((var9_32 < 3)) {
                                var7_30[var8_31][var9_32] = -1;
                            }
                            ++var9_32;
lbl193:
                            // 2 sources

                            ** while (!gq_0.cfr_renamed_2((int)var9_32, (int)4))
                        }
lbl194:
                        // 1 sources

                        ++var8_31;
lbl195:
                        // 2 sources

                        ** while (!gq_0.cfr_renamed_2((int)var8_31, (int)4))
                    }
lbl196:
                    // 1 sources

                    var8_31 = 0;
                    var9_32 = 0;
                    var10_33 = 0;
                    if (-"   ".length() <= 0) ** GOTO lbl213
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var11_34 = 0;
                        if ((101 + 110 - 186 + 104 ^ 121 + 100 - 146 + 58) == (47 + 2 - -64 + 33 ^ 134 + 30 - 82 + 68)) ** GOTO lbl211
                        return;
                        while ((var12_35 = var1_1.var_java_io_DataInputStream_do.readByte() != -2) && (var12_35 != -1)) {
                            var7_30[var10_33][var11_34] = var12_35;
                            ++var11_34;
lbl211:
                            // 2 sources

                            if (!(var11_34 >= 3)) continue;
                        }
                        ++var10_33;
lbl213:
                        // 2 sources

                        ** while (!gq_0.cfr_renamed_2((int)var10_33, (int)4))
                    }
lbl214:
                    // 1 sources

                    if ("   ".length() < (93 + 67 - 17 + 47 ^ 119 + 74 - 12 + 5)) ** GOTO lbl229
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var10_33 = var1_1.var_java_io_DataInputStream_do.readByte();
                        if ((var8_31 < 3) && (var10_33 == -1)) {
                            ++var8_31;
                            var9_32 = 0;
                            if ("  ".length() != " ".length()) continue;
                            return;
                        }
                        var6_27[var8_31][var9_32] = var10_33;
                        if (!(var9_32 < 3)) continue;
                        ++var9_32;
lbl229:
                        // 4 sources

                        ** while (!gq_0.boolean_if((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl230:
                    // 1 sources

                    bT.bT_do().cfr_renamed_1(var4_18, var2_6, var3_8, var6_27, var7_30, var5_23);
                    return;
                }
                case 70: {
                    var1_1.var_java_io_DataInputStream_do.readInt();
                    bT.bT_do().cfr_renamed_9();
                }
            }
            return;
        }
        catch (Exception v0) {
            v0.printStackTrace();
            return;
        }
    }

            public static void cfr_renamed_1() {
        w_0.cfr_renamed_9 = 4;
        p_0.var_byte_if = p_0.var_byte_int;
        fm_0.cfr_renamed_1(1, bT.bT_do());
        bs.var_bs_do.var_bH_do = var_gq_0_do;
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    static {
        gq_0.cfr_renamed_2();
        var_gq_0_do = new gq_0();
    }

        private static boolean boolean_if(int n) {
        return n <= 0;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[10];
        4 = 0xF6 ^ 0x95 ^ (7 ^ 0x60);
        1 = " ".length();
        0 = (0x58 ^ 9) & ~(0xED ^ 0xBC);
        9 = 0x53 ^ 0x45 ^ (0x53 ^ 0x4C);
        -1 = -" ".length();
        12 = 0xA1 ^ 0xAD;
        11 = 64 + 72 - -8 + 6 ^ 76 + 10 - -23 + 48;
        3 = "   ".length();
        10 = 0x35 ^ 0x3F;
        -2 = -"  ".length();
    }

        private static boolean boolean_for(int n) {
        return n == 0;
    }
}

