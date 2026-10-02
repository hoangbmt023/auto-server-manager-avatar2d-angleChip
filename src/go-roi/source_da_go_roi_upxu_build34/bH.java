/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bH {
    public short var_short_do;
    public short cfr_renamed_1;
    public short cfr_renamed_3;
    public short cfr_renamed_4;
    public short cfr_renamed_5;
    private static int[] mangSoNguyen;
    public short cfr_renamed_2;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0x13 ^ 0xE) & ~(0x85 ^ 0x98);
    }

    static {
        bH.cfr_renamed_0();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2, int n3) {
        graphics.drawRegion(ci_0.gy_0_do((int)this.cfr_renamed_1).var_javax_microedition_lcdui_Image_do, this.cfr_renamed_4 * bn_0.cfr_renamed_6, this.cfr_renamed_2 * bn_0.cfr_renamed_6, this.cfr_renamed_5 * bn_0.cfr_renamed_6, this.cfr_renamed_3 * bn_0.cfr_renamed_6, 0, n, n2, n3);
    }
}

