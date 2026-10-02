/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class as
extends bE
implements bH {
    private static as var_as_do;
    private static int[] mangSoNguyen;

    static {
        as.cfr_renamed_2();
        var_as_do = new as();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[3];
        0 = (0xEA ^ 0xB5) & ~(0x67 ^ 0x38);
        -1 = -" ".length();
        2 = "  ".length();
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do(bj var1_1) {
        try {
            switch (var1_1.var_byte_do) {
                case -11: {
                    var2_2 = new Vector<hr>();
                    var3_8 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_11 = 0;
                    if (-"   ".length() <= 0) ** GOTO lbl16
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_12 = new hr();
                        new hr().cfr_renamed_2 = var1_1.var_java_io_DataInputStream_do.readShort();
                        var5_12.var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                        var2_2.addElement(var5_12);
                        ++var4_11;
lbl16:
                        // 2 sources

                        ** while (!as.cfr_renamed_1((int)var4_11, (int)var3_8))
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
                    if (-" ".length() < 0) ** GOTO lbl33
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var10_18 = new hr();
                        new hr().cfr_renamed_2 = var1_1.var_java_io_DataInputStream_do.readShort();
                        var10_18.var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                        var2_2.addElement(var10_18);
                        ++var9_17;
lbl33:
                        // 2 sources

                        ** while (!as.cfr_renamed_1((int)var9_17, (int)var8_16))
                    }
lbl34:
                    // 1 sources

                    var1_1.var_java_io_DataInputStream_do.readInt();
                    aa_0.cfr_renamed_1(var2_2, var4_11, var5_13, var3_8, var6_14, var7_15);
                    return;
                }
                case -14: {
                    var10_19 = new hr();
                    new hr().cfr_renamed_2 = var1_1.var_java_io_DataInputStream_do.readShort();
                    var10_19.var_short_do = var1_1.var_java_io_DataInputStream_do.readShort();
                    var2_3 = var1_1.var_java_io_DataInputStream_do.readUnsignedShort();
                    var10_19.var_byte_arr_do = new byte[var2_3];
                    var3_9 = 0;
                    if (null == null) ** GOTO lbl53
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var10_19.var_byte_arr_do[var3_9] = var1_1.var_java_io_DataInputStream_do.readByte();
                        ++var3_9;
lbl53:
                        // 2 sources

                        ** while (!as.cfr_renamed_1((int)var3_9, (int)var2_3))
                    }
lbl54:
                    // 1 sources

                    var10_19.cfr_renamed_0 = (short)-1;
                    if ((var1_1.var_java_io_DataInputStream_do.available() >= 2)) {
                        var10_19.cfr_renamed_0 = var1_1.var_java_io_DataInputStream_do.readShort();
                    }
                    aa_0.cfr_renamed_1(var10_19);
                    return;
                }
                case -15: {
                    var3_10 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var3_10);
                    aa_0.void_do(var3_10);
                    return;
                }
                case -16: {
                    var2_4 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var2_4);
                    aa_0.cfr_renamed_2(var2_4);
                    return;
                }
                case -37: {
                    var2_5 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var2_5);
                    aa_0.cfr_renamed_0(var2_5);
                    return;
                }
                case -40: {
                    var2_6 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var2_6);
                    aa_0.cfr_renamed_3(var2_6);
                    return;
                }
                case -41: {
                    var2_7 = new byte[var1_1.var_java_io_DataInputStream_do.available()];
                    var1_1.var_java_io_DataInputStream_do.read(var2_7);
                    aa_0.cfr_renamed_4(var2_7);
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

    public static void cfr_renamed_1() {
        fh_0.fh_0_do().var_bH_do = var_as_do;
    }

    }

