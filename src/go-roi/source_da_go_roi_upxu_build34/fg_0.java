/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from fG
 */
public final class fg_0
extends ax_0
implements ba {
    private static int[] mangSoNguyen;
    private static fg_0 var_fg_0_do;

        public static void cfr_renamed_0() {
        a_0.var_int_case = 4;
        e.var_byte_for = e.var_byte_if;
        gp_0.cfr_renamed_0(1, bm.bm_do());
        al_0.var_al_0_do.var_ba_do = var_fg_0_do;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[10];
        4 = 0x3F ^ 0x3B;
        1 = " ".length();
        0 = (0xDA ^ 0x8C ^ (0x10 ^ 0x42)) & (98 + 23 - 44 + 84 ^ 145 + 62 - 180 + 138 ^ -" ".length());
        9 = 0x10 ^ 0x19;
        -1 = -" ".length();
        12 = 0x36 ^ 0x4E ^ (0x51 ^ 0x25);
        11 = 36 + 125 - 83 + 75 ^ 22 + 107 - -3 + 14;
        3 = "   ".length();
        10 = 16 + 8 - -19 + 84 ^ (0xE1 ^ 0x94);
        -2 = -"  ".length();
    }

    private static boolean boolean_do(int n) {
        return n <= 0;
    }

        static {
        fg_0.cfr_renamed_3();
        var_fg_0_do = new fg_0();
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

            /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void void_do(ad_0 var1_1) {
        try {
            var2_6 = var1_1.var_java_io_DataInputStream_do.readByte();
            var3_8 = var1_1.var_java_io_DataInputStream_do.readByte();
            if (fg_0.boolean_for((int)a_0.cfr_renamed_0(var2_6, (byte)var3_8))) {
                return;
            }
            switch (var1_1.var_byte_do) {
                case 20: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_9 = new Vector<fb>();
                    var4_12 = 0;
                    if (((44 ^ 103 ^ (183 ^ 192)) & (144 + 77 - 166 + 99 ^ 8 + 18 - -90 + 50 ^ -" ".length())) == 0) ** GOTO lbl18
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_19 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_9.addElement(new fb(var5_19));
                        ++var4_12;
lbl18:
                        // 2 sources

                        ** while (!fg_0.cfr_renamed_4((int)var4_12, (int)9))
                    }
lbl19:
                    // 1 sources

                    var4_12 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var5_19 = var1_1.var_java_io_DataInputStream_do.readInt();
                    GameCanvas.cfr_renamed_8();
                    a_0.cfr_renamed_16();
                    bm.bm_do().cfr_renamed_0(var2_6, var3_9, var4_12, (int)var5_19);
                    return;
                }
                case 49: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readInt();
                    bm.bm_do().void_int(var2_6, var1_2);
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
                    GameCanvas.cfr_renamed_8();
                    bm.bm_do().cfr_renamed_0((int)var2_6, var3_8, (int)var4_13, var5_20);
                    return;
                }
                case 63: {
                    var1_3 = var1_1.var_java_io_DataInputStream_do.readByte();
                    GameCanvas.cfr_renamed_8();
                    bm.bm_do().void_try(var1_3);
                    return;
                }
                case 64: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_8 = (int)var1_1.var_java_io_DataInputStream_do.readBoolean();
                    var4_14 = 0;
                    if (fg_0.boolean_if(var3_8)) {
                        var4_14 = var1_1.var_java_io_DataInputStream_do.readByte();
                    }
                    var1_4 = var1_1.var_java_io_DataInputStream_do.readByte();
                    GameCanvas.cfr_renamed_8();
                    bm.bm_do().cfr_renamed_0((boolean)var3_8, var4_14, (int)var2_6, var1_4);
                    return;
                }
                case 65: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_8 = (int)var1_1.var_java_io_DataInputStream_do.readBoolean();
                    var4_15 = var1_1.var_java_io_DataInputStream_do.readBoolean();
                    var5_21 = new int[4];
                    var6_24 = new int[12];
                    if (!fg_0.boolean_if(var3_8)) ** GOTO lbl86
                    var7_28 = 0;
                    if (-" ".length() <= 0) ** GOTO lbl69
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_21[var7_28] = var1_1.var_java_io_DataInputStream_do.readInt();
                        ++var7_28;
lbl69:
                        // 2 sources

                        ** while (!fg_0.cfr_renamed_4((int)var7_28, (int)4))
                    }
lbl70:
                    // 1 sources

                    var7_28 = 0;
                    if (null == null) ** GOTO lbl77
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_24[var7_28] = -1;
                        ++var7_28;
lbl77:
                        // 2 sources

                        ** while (!fg_0.cfr_renamed_4((int)var7_28, (int)12))
                    }
lbl78:
                    // 1 sources

                    var7_28 = 0;
                    if (-"   ".length() < 0) ** GOTO lbl85
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_24[var7_28] = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var7_28;
lbl85:
                        // 2 sources

                        ** while (!fg_0.boolean_do((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl86:
                    // 2 sources

                    GameCanvas.cfr_renamed_8();
                    bm.bm_do().cfr_renamed_0((boolean)var3_8, var6_24, var4_15, (int)var2_6);
                    return;
                }
                case 51: {
                    var7_29 = new int[4];
                    var2_6 = 0;
                    if ("   ".length() >= -" ".length()) ** GOTO lbl98
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var7_29[var2_6] = var1_1.var_java_io_DataInputStream_do.readInt();
                        ++var2_6;
lbl98:
                        // 2 sources

                        ** while (!fg_0.cfr_renamed_4((int)var2_6, (int)4))
                    }
lbl99:
                    // 1 sources

                    var2_7 = new int[4];
                    var3_8 = 0;
                    if (-(37 + 103 - -20 + 33 ^ 131 + 142 - 253 + 177) < 0) ** GOTO lbl107
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var2_7[var3_8] = var1_1.var_java_io_DataInputStream_do.readInt();
                        ++var3_8;
lbl107:
                        // 2 sources

                        ** while (!fg_0.cfr_renamed_4((int)var3_8, (int)4))
                    }
lbl108:
                    // 1 sources

                    var3_10 = new int[4][11];
                    var4_16 = 0;
                    if (" ".length() >= -" ".length()) ** GOTO lbl123
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_22 = 0;
                        if (-" ".length() != ((107 ^ 72) & ~(151 ^ 180))) ** GOTO lbl121
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var3_10[var4_16][var5_22] = -1;
                            ++var5_22;
lbl121:
                            // 2 sources

                            ** while (!fg_0.cfr_renamed_4((int)var5_22, (int)11))
                        }
lbl122:
                        // 1 sources

                        ++var4_16;
lbl123:
                        // 2 sources

                        ** while (!fg_0.cfr_renamed_4((int)var4_16, (int)4))
                    }
lbl124:
                    // 1 sources

                    var4_16 = 0;
                    var5_22 = 0;
                    if (-"  ".length() < 0) ** GOTO lbl142
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
                            if (((73 ^ 1) & ~(209 ^ 153)) == 0) continue;
                            return;
                        }
                        var3_10[var4_16][var5_22] = var6_25;
                        if (!(var5_22 < 10)) continue;
                        ++var5_22;
lbl142:
                        // 4 sources

                        ** while (!fg_0.boolean_do((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl143:
                    // 1 sources

                    GameCanvas.cfr_renamed_8();
                    bm.bm_do().cfr_renamed_0(var2_7, var3_10);
                    return;
                }
                case 67: {
                    var6_26 = var1_1.var_java_io_DataInputStream_do.readBoolean();
                    var2_6 = -1;
                    if (fg_0.boolean_if((int)var6_26)) {
                        var2_6 = var1_1.var_java_io_DataInputStream_do.readByte();
                    }
                    GameCanvas.cfr_renamed_8();
                    bm.bm_do().cfr_renamed_0(var6_26, var2_6);
                    return;
                }
                case 68: {
                    var1_5 = var1_1.var_java_io_DataInputStream_do.readByte();
                    GameCanvas.cfr_renamed_8();
                    bm.bm_do().cfr_renamed_0(var1_5);
                    return;
                }
                case 69: {
                    var2_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_11 = new int[4];
                    var4_17 = 0;
                    if ("  ".length() < (59 + 127 - 144 + 116 ^ 140 + 39 - 38 + 13)) ** GOTO lbl169
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_11[var4_17] = var1_1.var_java_io_DataInputStream_do.readInt();
                        ++var4_17;
lbl169:
                        // 2 sources

                        ** while (!fg_0.cfr_renamed_4((int)var4_17, (int)4))
                    }
lbl170:
                    // 1 sources

                    bm.bm_do().void_byte(var2_6);
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
                    if (" ".length() > ((188 ^ 144) & ~(69 ^ 105))) ** GOTO lbl195
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var9_32 = 0;
                        if (((62 ^ 119) & ~(22 ^ 95)) != (10 ^ 14)) ** GOTO lbl193
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

                            ** while (!fg_0.cfr_renamed_4((int)var9_32, (int)4))
                        }
lbl194:
                        // 1 sources

                        ++var8_31;
lbl195:
                        // 2 sources

                        ** while (!fg_0.cfr_renamed_4((int)var8_31, (int)4))
                    }
lbl196:
                    // 1 sources

                    var8_31 = 0;
                    var9_32 = 0;
                    var10_33 = 0;
                    if (" ".length() == " ".length()) ** GOTO lbl213
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var11_34 = 0;
                        if (null == null) ** GOTO lbl211
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

                        ** while (!fg_0.cfr_renamed_4((int)var10_33, (int)4))
                    }
lbl214:
                    // 1 sources

                    if ((156 ^ 167 ^ (13 ^ 50)) != ((183 ^ 197 ^ (108 ^ 54)) & (11 ^ 26 ^ (130 ^ 187) ^ -" ".length()))) ** GOTO lbl229
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var10_33 = var1_1.var_java_io_DataInputStream_do.readByte();
                        if ((var8_31 < 3) && (var10_33 == -1)) {
                            ++var8_31;
                            var9_32 = 0;
                            if ((139 ^ 143) == (133 ^ 129)) continue;
                            return;
                        }
                        var6_27[var8_31][var9_32] = var10_33;
                        if (!(var9_32 < 3)) continue;
                        ++var9_32;
lbl229:
                        // 4 sources

                        ** while (!fg_0.boolean_do((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl230:
                    // 1 sources

                    bm.bm_do().cfr_renamed_0(var4_18, var2_6, var3_8, var6_27, var7_30, var5_23);
                    return;
                }
                case 70: {
                    var1_1.var_java_io_DataInputStream_do.readInt();
                    bm.bm_do().cfr_renamed_12();
                }
            }
            return;
        }
        catch (Exception v0) {
            v0.printStackTrace();
            return;
        }
    }

    private static boolean boolean_for(int n) {
        return n == 0;
    }
}

