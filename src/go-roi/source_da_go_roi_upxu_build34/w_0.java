/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from W
 */
public final class w_0
extends ax_0
implements ba {
    private static w_0 var_w_0_do;
    private static int[] mangSoNguyen;

    static {
        w_0.cfr_renamed_3();
        var_w_0_do = new w_0();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[3];
        0 = (149 + 113 - 121 + 79 ^ 31 + 29 - -77 + 6) & (0xF2 ^ 0xB6 ^ (6 ^ 0x11) ^ -" ".length());
        -1 = -" ".length();
        2 = "  ".length();
    }

    public static void cfr_renamed_0() {
        ee.ee_do().var_ba_do = var_w_0_do;
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do(ad_0 var1_1) {
        try {
            switch (var1_1.var_byte_do) {
                case -11: {
                    var2_2 = new Vector<gy_0>();
                    var3_8 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_11 = 0;
                    if (((9 ^ 44 ^ (152 ^ 134)) & ("   ".length() ^ (53 ^ 13) ^ -" ".length())) < "   ".length()) ** GOTO lbl16
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_12 = new gy_0();
                        new gy_0().cfr_renamed_1 = var1_1.var_java_io_DataInputStream_do.readShort();
                        var5_12.var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                        var2_2.addElement(var5_12);
                        ++var4_11;
lbl16:
                        // 2 sources

                        ** while (!w_0.cfr_renamed_0((int)var4_11, (int)var3_8))
                    }
lbl17:
                    // 1 sources

                    var4_11 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var5_13 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var3_8 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var6_14 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var7_15 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var8_16 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var9_17 = 0;
                    if (((72 ^ 122 ^ (143 ^ 185)) & (57 + 79 - 102 + 107 ^ 110 + 132 - 147 + 42 ^ -" ".length())) <= ((131 ^ 199 ^ (75 ^ 46)) & (125 ^ 75 ^ (133 ^ 146) ^ -" ".length()))) ** GOTO lbl33
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var10_18 = new gy_0();
                        new gy_0().cfr_renamed_1 = var1_1.var_java_io_DataInputStream_do.readShort();
                        var10_18.var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                        var2_2.addElement(var10_18);
                        ++var9_17;
lbl33:
                        // 2 sources

                        ** while (!w_0.cfr_renamed_0((int)var9_17, (int)var8_16))
                    }
lbl34:
                    // 1 sources

                    var1_1.var_java_io_DataInputStream_do.readInt();
                    ci_0.cfr_renamed_0(var2_2, var4_11, var5_13, var3_8, var6_14, var7_15);
                    return;
                }
                case -14: {
                    var10_19 = new gy_0();
                    new gy_0().cfr_renamed_1 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var10_19.var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                    var2_3 = var1_1.var_java_io_DataInputStream_do.readUnsignedShort();
                    var10_19.var_byte_arr_do = new byte[var2_3];
                    var3_9 = 0;
                    if ((118 + 78 - 53 + 10 ^ 46 + 105 - 88 + 94) > 0) ** GOTO lbl53
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var10_19.var_byte_arr_do[var3_9] = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var3_9;
lbl53:
                        // 2 sources

                        ** while (!w_0.cfr_renamed_0((int)var3_9, (int)var2_3))
                    }
lbl54:
                    // 1 sources

                    var10_19.cfr_renamed_3 = (short)-1;
                    if ((var1_1.var_java_io_DataInputStream_do.available() >= 2)) {
                        var10_19.cfr_renamed_3 = var1_1.var_java_io_DataInputStream_do.readShort();
                    }
                    ci_0.cfr_renamed_0(var10_19);
                    return;
                }
                case -15: {
                    var3_10 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var3_10);
                    ci_0.cfr_renamed_4(var3_10);
                    return;
                }
                case -16: {
                    var2_4 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var2_4);
                    ci_0.cfr_renamed_1(var2_4);
                    return;
                }
                case -37: {
                    var2_5 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var2_5);
                    ci_0.cfr_renamed_5(var2_5);
                    return;
                }
                case -40: {
                    var2_6 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var2_6);
                    ci_0.void_do(var2_6);
                    return;
                }
                case -41: {
                    var2_7 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var2_7);
                    ci_0.cfr_renamed_3(var2_7);
                    return;
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

