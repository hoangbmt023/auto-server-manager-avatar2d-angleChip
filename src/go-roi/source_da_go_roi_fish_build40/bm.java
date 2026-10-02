/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public abstract class bm {
    private static int[] cfr_renamed_1;
    public static int var_int_if;
    public int cfr_renamed_2;
    public short cfr_renamed_4;
    public byte var_byte_if = (byte)cfr_renamed_1[0];
    public int cfr_renamed_3;

    public void void_do() {
    }

    public bm() {
        this.cfr_renamed_4 = (short)cfr_renamed_1[0];
    }

    public void cfr_renamed_1(Graphics graphics) {
    }

    static {
        bm.cfr_renamed_0();
        var_int_if = dF.cfr_renamed_12;
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[1];
        bm.cfr_renamed_1[0] = (0x74 ^ 0x2A ^ (0x10 ^ 0x76)) & (0xFA ^ 0xC3 ^ " ".length() ^ -" ".length());
    }
}

