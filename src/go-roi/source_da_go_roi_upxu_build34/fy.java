/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class fy
extends ax_0
implements ba {
    private static int[] mangSoNguyen;
    private static fy var_fy_do;

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[5];
        4 = 19 + 4 - -34 + 104 ^ 155 + 20 - 30 + 20;
        0 = (0x2A ^ 0x41 ^ (0x43 ^ 6)) & (0xE ^ 0x60 ^ (0xEC ^ 0xAC) ^ -" ".length());
        13 = 144 + 145 - 214 + 87 ^ 34 + 120 - 132 + 153;
        53 = 0x6A ^ 0x5F;
        1 = " ".length();
    }

        public static void cfr_renamed_0() {
        a_0.var_int_case = 4;
        e.var_byte_for = e.var_byte_if;
        gp_0.cfr_renamed_0(0, bB.bB_do());
        al_0.var_al_0_do.var_ba_do = var_fy_do;
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    static {
        fy.cfr_renamed_3();
        var_fy_do = new fy();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void void_do(ad_0 var1_1) {
        try {
            var2_4 = var1_1.var_java_io_DataInputStream_do.readByte();
            var3_6 = var1_1.var_java_io_DataInputStream_do.readByte();
            if (fy.boolean_do((int)a_0.cfr_renamed_0(var2_4, var3_6))) {
                return;
            }
            System.out.println("tienlen: " + var1_1.var_byte_do);
            switch (var1_1.var_byte_do) {
                case 51: {
                    var2_4 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_6 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_9 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readInt();
                    bB.bB_do();
                    bB.cfr_renamed_0(var2_4, var3_6, var4_9, var1_2);
                    return;
                }
                case 50: {
                    bB.bB_do().dangChayAuto = 0;
                    bB.bB_do();
                    bB.cfr_renamed_12();
                    if (!fy.boolean_if(var1_1.var_java_io_DataInputStream_do.available())) break;
                    var2_4 = var1_1.var_java_io_DataInputStream_do.readInt();
                    v0 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_6 = v0;
                    var4_10 = new byte[v0];
                    var5_15 = 0;
                    if (" ".length() == " ".length()) ** GOTO lbl38
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_10[var5_15] = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var5_15;
lbl38:
                        // 2 sources

                        ** while (!fy.cfr_renamed_0((int)var5_15, (int)var3_6))
                    }
lbl39:
                    // 1 sources

                    bB.bB_do().cfr_renamed_0((int)var2_4, var4_10);
                    return;
                }
                case 20: {
                    var2_4 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_7 = new Vector<fb>();
                    var4_11 = 0;
                    if (null == null) ** GOTO lbl51
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_7.addElement(new fb(var1_1.var_java_io_DataInputStream_do.readByte()));
                        ++var4_11;
lbl51:
                        // 2 sources

                        ** while (!fy.cfr_renamed_0((int)var4_11, (int)13))
                    }
lbl52:
                    // 1 sources

                    var4_11 = var1_1.var_java_io_DataInputStream_do.readInt();
                    GameCanvas.cfr_renamed_8();
                    a_0.cfr_renamed_16();
                    bB.bB_do().cfr_renamed_0(var4_11, var2_4, var3_7);
                    var1_1 = cd_0.cd_0_do();
                    try {
                        var1_1.cfr_renamed_4(53);
                        }
                    catch (Exception v1) {
                        }
                    if (-(196 ^ 192) > 0) {
                        return;
                    }
                    var1_1.cfr_renamed_1();
                    return;
                }
                case 21: {
                    var5_16 = var1_1.var_java_io_DataInputStream_do.readInt();
                    v2 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var2_4 = v2;
                    var3_8 = new byte[v2];
                    var4_12 = 0;
                    if (((227 ^ 162) & ~(12 ^ 77)) >= 0) ** GOTO lbl81
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_8[var4_12] = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var4_12;
lbl81:
                        // 2 sources

                        ** while (!fy.cfr_renamed_0((int)var4_12, (int)var2_4))
                    }
lbl82:
                    // 1 sources

                    var4_12 = var1_1.var_java_io_DataInputStream_do.readInt();
                    a_0.coTrangThai = 1;
                    bB.bB_do().cfr_renamed_0(var5_16, var3_8, var4_12);
                    bB.bB_do().cfr_renamed_1();
                    return;
                }
                case 49: {
                    var2_4 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_3 = var1_1.var_java_io_DataInputStream_do.readBoolean();
                    bB.bB_do().cfr_renamed_0((int)var2_4, (int)var3_6, var1_3);
                    return;
                }
                case 53: {
                    var3_6 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var2_5 = new byte[13];
                    try {
                        var4_13 = 0;
                        if (((36 ^ 22) & ~(23 ^ 37)) >= ((151 ^ 134) & ~(67 ^ 82))) ** GOTO lbl104
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var2_5[var4_13] = var1_1.var_java_io_DataInputStream_do.readByte();
                            ++var4_13;
lbl104:
                            // 2 sources

                            ** while (!fy.cfr_renamed_0((int)var4_13, (int)13))
                        }
lbl105:
                        // 1 sources

                        }
                    catch (Exception v3) {
                        var2_5 = null;
                    }
                    if (-"  ".length() >= 0) {
                        return;
                    }
                    GameCanvas.cfr_renamed_8();
                    bB.bB_do();
                    bB.cfr_renamed_12();
                    if ((var2_5 != null)) {
                        bB.bB_do().cfr_renamed_0((int)var3_6, var2_5);
                    }
                    a_0.cfr_renamed_0((int)var3_6, MenuChinhAvatar.bq);
                    return;
                }
                case 54: {
                    var4_14 = var1_1.var_java_io_DataInputStream_do.readUTF();
                    bB.bB_do().cfr_renamed_3(var4_14);
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
}

