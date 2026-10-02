/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from gP
 */
public final class gp_0
extends bE
implements bH {
    private static gp_0 var_gp_0_do;
    private static int[] mangSoNguyen;

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[5];
        4 = 0xE9 ^ 0xB4 ^ (0x39 ^ 0x60);
        0 = (19 + 88 - -1 + 99 ^ 130 + 100 - 157 + 65) & (155 + 111 - 252 + 218 ^ 20 + 115 - 56 + 94 ^ -" ".length());
        13 = 0xBE ^ 0xB3;
        53 = 133 + 97 - 152 + 88 ^ 86 + 127 - 178 + 112;
        1 = " ".length();
    }

        /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void void_do(bj var1_1) {
        try {
            var2_4 = var1_1.var_java_io_DataInputStream_do.readByte();
            var3_6 = var1_1.var_java_io_DataInputStream_do.readByte();
            if (gp_0.boolean_if((int)w_0.cfr_renamed_1(var2_4, var3_6))) {
                return;
            }
            System.out.println("tienlen: " + var1_1.var_byte_do);
            switch (var1_1.var_byte_do) {
                case 51: {
                    var2_4 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_6 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_9 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readInt();
                    g_0.g_0_do();
                    g_0.cfr_renamed_1(var2_4, var3_6, var4_9, var1_2);
                    return;
                }
                case 50: {
                    g_0.g_0_do().dangChayAuto = 0;
                    g_0.g_0_do();
                    g_0.cfr_renamed_9();
                    if (!gp_0.boolean_do(var1_1.var_java_io_DataInputStream_do.available())) break;
                    var2_4 = var1_1.var_java_io_DataInputStream_do.readInt();
                    v0 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_6 = v0;
                    var4_10 = new byte[v0];
                    var5_15 = 0;
                    if (" ".length() != 0) ** GOTO lbl38
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_10[var5_15] = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var5_15;
lbl38:
                        // 2 sources

                        ** while (!gp_0.cfr_renamed_1((int)var5_15, (int)var3_6))
                    }
lbl39:
                    // 1 sources

                    g_0.g_0_do().cfr_renamed_1((int)var2_4, var4_10);
                    return;
                }
                case 20: {
                    var2_4 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_7 = new Vector<dC>();
                    var4_11 = 0;
                    if (-" ".length() < " ".length()) ** GOTO lbl51
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_7.addElement(new dC(var1_1.var_java_io_DataInputStream_do.readByte()));
                        ++var4_11;
lbl51:
                        // 2 sources

                        ** while (!gp_0.cfr_renamed_1((int)var4_11, (int)13))
                    }
lbl52:
                    // 1 sources

                    var4_11 = var1_1.var_java_io_DataInputStream_do.readInt();
                    GameCanvas.cfr_renamed_7();
                    w_0.cfr_renamed_30();
                    g_0.g_0_do().cfr_renamed_1(var4_11, var2_4, var3_7);
                    var1_1 = dt_0.dt_0_do();
                    try {
                        var1_1.cfr_renamed_2(53);
                        }
                    catch (Exception v1) {
                        }
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                    var1_1.cfr_renamed_0();
                    return;
                }
                case 21: {
                    var5_16 = var1_1.var_java_io_DataInputStream_do.readInt();
                    v2 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var2_4 = v2;
                    var3_8 = new byte[v2];
                    var4_12 = 0;
                    if (-(171 ^ 175) <= 0) ** GOTO lbl81
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_8[var4_12] = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var4_12;
lbl81:
                        // 2 sources

                        ** while (!gp_0.cfr_renamed_1((int)var4_12, (int)var2_4))
                    }
lbl82:
                    // 1 sources

                    var4_12 = var1_1.var_java_io_DataInputStream_do.readInt();
                    w_0.var_boolean_int = 1;
                    g_0.g_0_do().cfr_renamed_1(var5_16, var3_8, var4_12);
                    g_0.g_0_do().cfr_renamed_2();
                    return;
                }
                case 49: {
                    var2_4 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_3 = var1_1.var_java_io_DataInputStream_do.readBoolean();
                    g_0.g_0_do().cfr_renamed_1((int)var2_4, (int)var3_6, var1_3);
                    return;
                }
                case 53: {
                    var3_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var2_5 = new byte[13];
                    try {
                        var4_13 = 0;
                        if (" ".length() != "  ".length()) ** GOTO lbl104
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var2_5[var4_13] = var1_1.var_java_io_DataInputStream_do.readByte();
                            ++var4_13;
lbl104:
                            // 2 sources

                            ** while (!gp_0.cfr_renamed_1((int)var4_13, (int)13))
                        }
lbl105:
                        // 1 sources

                        }
                    catch (Exception v3) {
                        var2_5 = null;
                    }
                    if ((155 + 105 - 166 + 76 ^ 88 + 106 - 74 + 55) <= 0) {
                        return;
                    }
                    GameCanvas.cfr_renamed_7();
                    g_0.g_0_do();
                    g_0.cfr_renamed_9();
                    if ((var2_5 != null)) {
                        g_0.g_0_do().cfr_renamed_1((int)var3_6, var2_5);
                    }
                    w_0.cfr_renamed_1((int)var3_6, MenuChinhAvatar.bn);
                    return;
                }
                case 54: {
                    var4_14 = var1_1.var_java_io_DataInputStream_do.readUTF();
                    g_0.g_0_do().cfr_renamed_1(var4_14);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception v4) {
            v4.printStackTrace();
        }
    }

    static {
        gp_0.cfr_renamed_2();
        var_gp_0_do = new gp_0();
    }

    public static void cfr_renamed_1() {
        w_0.cfr_renamed_9 = 4;
        p_0.var_byte_if = p_0.var_byte_int;
        fm_0.cfr_renamed_1(0, g_0.g_0_do());
        bs.var_bs_do.var_bH_do = var_gp_0_do;
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    }

