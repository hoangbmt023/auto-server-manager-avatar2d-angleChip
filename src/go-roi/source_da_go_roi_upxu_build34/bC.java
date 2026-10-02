/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class bC
extends ax_0
implements ba {
    private static int[] mangSoNguyen;
    private static bC var_bC_do;

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    static {
        bC.cfr_renamed_3();
        var_bC_do = new bC();
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[6];
        2 = "  ".length();
        0 = (0x24 ^ 0x39 ^ (0x7B ^ 0x27)) & (37 + 132 - 144 + 108 ^ 172 + 122 - 108 + 10 ^ -" ".length());
        8 = 0x71 ^ 0x79;
        1 = " ".length();
        4 = 0xBB ^ 0xBF;
        30 = 0x7F ^ 0x61;
    }

    public static void cfr_renamed_0() {
        a_0.var_int_case = 2;
        e.var_byte_for = (byte)0;
        gp_0.cfr_renamed_0(2, fk.fk_do());
        al_0.var_al_0_do.var_ba_do = var_bC_do;
    }

        /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void void_do(ad_0 var1_1) {
        try {
            var2_3 = var1_1.var_java_io_DataInputStream_do.readByte();
            var3_5 = var1_1.var_java_io_DataInputStream_do.readByte();
            if (bC.boolean_if((int)a_0.cfr_renamed_0(var2_3, (byte)var3_5))) {
                return;
            }
            switch (var1_1.var_byte_do) {
                case 20: {
                    var2_3 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_5 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var4_8 = new byte[8][8];
                    var5_12 = 0;
                    if ("   ".length() == "   ".length()) ** GOTO lbl25
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var6_18 = 0;
                        if (" ".length() < "   ".length()) ** GOTO lbl23
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var4_8[var5_12][var6_18] = var1_1.var_java_io_DataInputStream_do.readByte();
                            ++var6_18;
lbl23:
                            // 2 sources

                            ** while (!bC.cfr_renamed_0((int)var6_18, (int)8))
                        }
lbl24:
                        // 1 sources

                        ++var5_12;
lbl25:
                        // 2 sources

                        ** while (!bC.cfr_renamed_0((int)var5_12, (int)8))
                    }
lbl26:
                    // 1 sources

                    var5_12 = 0;
                    if (((41 + 63 - 23 + 65 ^ 128 + 124 - 158 + 65) & (53 ^ 37 ^ (5 ^ 24) ^ -" ".length())) != "  ".length()) ** GOTO lbl42
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var7_21 = a_0.dd_0_do(var1_1.var_java_io_DataInputStream_do.readInt());
                        a_0.dd_0_do(var1_1.var_java_io_DataInputStream_do.readInt()).cfr_renamed_14 = var1_1.var_java_io_DataInputStream_do.readShort();
                        v0 = 0;
                        var7_21.var_short_else = (short)v0;
                        var7_21.var_short_try = (short)v0;
                        var7_21.var_short_const = var7_21.cfr_renamed_8 = var1_1.var_java_io_DataInputStream_do.readShort();
                        var7_21.var_short_for = var1_1.var_java_io_DataInputStream_do.readShort();
                        var7_21.var_short_char = var1_1.var_java_io_DataInputStream_do.readShort();
                        var7_21.cfr_renamed_18 <<= 1;
                        var7_21.void_do(4);
                        ++var5_12;
lbl42:
                        // 2 sources

                        ** while (!bC.cfr_renamed_0((int)var5_12, (int)2))
                    }
lbl43:
                    // 1 sources

                    fk.fk_do().cfr_renamed_0(var3_5, (int)var2_3, var4_8);
                    return;
                }
                case 64: {
                    var5_13 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var6_19 = new byte[var5_13];
                    var7_22 = new eq_0[var5_13];
                    var2_3 = 0;
                    if ("  ".length() != ((75 ^ 49 ^ (113 ^ 73)) & (187 ^ 155 ^ (107 ^ 9) ^ -" ".length()))) ** GOTO lbl59
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var7_22[var2_3] = new eq_0();
                        var6_19[var2_3] = var1_1.var_java_io_DataInputStream_do.readByte();
                        var7_22[var2_3].cfr_renamed_3 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var7_22[var2_3].var_short_do = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var2_3;
lbl59:
                        // 2 sources

                        ** while (!bC.cfr_renamed_0((int)var2_3, (int)var5_13))
                    }
lbl60:
                    // 1 sources

                    var2_3 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_5 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_9 = new Vector<String>();
                    var5_13 = 0;
                    if ((0 ^ 101 ^ (40 ^ 72)) > 0) ** GOTO lbl71
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var8_23 = var1_1.var_java_io_DataInputStream_do.readUTF();
                        var4_9.addElement(var8_23);
                        ++var5_13;
lbl71:
                        // 2 sources

                        ** while (!bC.cfr_renamed_0((int)var5_13, (int)var3_5))
                    }
lbl72:
                    // 1 sources

                    var5_13 = 0;
                    if (((110 ^ 52) & ~(215 ^ 141)) <= ((227 ^ 167) & ~(192 ^ 132))) ** GOTO lbl86
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_6 = a_0.dd_0_do(var1_1.var_java_io_DataInputStream_do.readInt());
                        a_0.dd_0_do(var1_1.var_java_io_DataInputStream_do.readInt()).var_byte_char = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_6.cfr_renamed_14 = var1_1.var_java_io_DataInputStream_do.readShort();
                        var3_6.var_short_try = (short)(var1_1.var_java_io_DataInputStream_do.readShort() - var3_6.var_short_const);
                        var3_6.var_short_else = (short)(var1_1.var_java_io_DataInputStream_do.readShort() - var3_6.var_short_for);
                        var3_6.cfr_renamed_5 = var1_1.var_java_io_DataInputStream_do.readBoolean();
                        if (bC.boolean_for((int)var3_6.cfr_renamed_5)) {
                            fk.fk_do().dangChayAuto = 1;
                        }
                        ++var5_13;
lbl86:
                        // 2 sources

                        ** while (!bC.cfr_renamed_0((int)var5_13, (int)2))
                    }
lbl87:
                    // 1 sources

                    fk.fk_do().cfr_renamed_0(var6_19, var7_22, var2_3, var4_9);
                    return;
                }
                case 21: {
                    var5_14 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var8_24 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_5 = var1_1.var_java_io_DataInputStream_do.readByte();
                    fk.fk_do().cfr_renamed_0(var5_14, (int)var8_24, var3_5);
                    return;
                }
                case 49: {
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readInt();
                    fk.fk_do().void_try(var1_2);
                    return;
                }
                case 24: {
                    var2_3 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_7 = new byte[8][8];
                    var4_10 = 0;
                    if (((247 ^ 170 ^ (15 ^ 111)) & (112 + 37 - 77 + 55 ^ (32 ^ 98) ^ -" ".length())) == 0) ** GOTO lbl116
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_15 = 0;
                        if (" ".length() <= "   ".length()) ** GOTO lbl114
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var3_7[var4_10][var5_15] = var1_1.var_java_io_DataInputStream_do.readByte();
                            ++var5_15;
lbl114:
                            // 2 sources

                            ** while (!bC.cfr_renamed_0((int)var5_15, (int)8))
                        }
lbl115:
                        // 1 sources

                        ++var4_10;
lbl116:
                        // 2 sources

                        ** while (!bC.cfr_renamed_0((int)var4_10, (int)8))
                    }
lbl117:
                    // 1 sources

                    fk.fk_do().cfr_renamed_0((int)var2_3, var3_7);
                    return;
                }
                case 51: {
                    var4_11 = new Vector<String>();
                    var5_16 = 0;
                    if ((160 ^ 164) <= (106 ^ 110)) ** GOTO lbl147
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var2_3 = var1_1.var_java_io_DataInputStream_do.readInt();
                        var3_5 = var1_1.var_java_io_DataInputStream_do.readInt();
                        var2_4 = a_0.dd_0_do(var2_3);
                        var2_4.cfr_renamed_18 /= 2;
                        var2_4.cfr_renamed_4 = (byte)0;
                        var2_4.void_new(var2_4.int_if() + var3_5);
                        if (bC.boolean_for(var3_5)) {
                            GameCanvas.void_if(var3_5, var2_4.cfr_renamed_3, var2_4.var_int_if, 30);
                            var6_20 = String.valueOf(var2_4.chuoiGiaTri) + ": ";
                            if (bC.boolean_do(var3_5)) {
                                fk.fk_do().cfr_renamed_14 = var2_4.cfr_renamed_12;
                                var6_20 = String.valueOf(var6_20) + MenuChinhAvatar.bu + "   +" + var3_5 + MenuChinhAvatar.cU;
                                if (-(227 ^ 130 ^ (81 ^ 53)) >= 0) {
                                    return;
                                }
                            } else {
                                var6_20 = String.valueOf(var6_20) + MenuChinhAvatar.dn + "  " + var3_5 + MenuChinhAvatar.cU;
                            }
                            var4_11.addElement("  ");
                            var4_11.addElement(var6_20);
                        }
                        ++var5_16;
lbl147:
                        // 2 sources

                        ** while (!bC.cfr_renamed_0((int)var5_16, (int)2))
                    }
lbl148:
                    // 1 sources

                    fk.fk_do().cfr_renamed_0(var4_11);
                    return;
                }
                case 71: {
                    var5_17 = new byte[8][];
                    var2_3 = 0;
                    if (((17 ^ 56) & ~(155 ^ 178)) >= ((74 ^ 10) & ~(235 ^ 171))) ** GOTO lbl159
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_17[var2_3] = new byte[8];
                        ++var2_3;
lbl159:
                        // 2 sources

                        ** while (!bC.cfr_renamed_0((int)var2_3, (int)8))
                    }
lbl160:
                    // 1 sources

                    var2_3 = 0;
                    if (" ".length() > 0) ** GOTO lbl174
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_5 = 0;
                        if (null == null) ** GOTO lbl172
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var5_17[var2_3][var3_5] = var1_1.var_java_io_DataInputStream_do.readByte();
                            ++var3_5;
lbl172:
                            // 2 sources

                            ** while (!bC.cfr_renamed_0((int)var3_5, (int)8))
                        }
lbl173:
                        // 1 sources

                        ++var2_3;
lbl174:
                        // 2 sources

                        ** while (!bC.cfr_renamed_0((int)var2_3, (int)8))
                    }
lbl175:
                    // 1 sources

                    fk.fk_do().cfr_renamed_0(var5_17);
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

