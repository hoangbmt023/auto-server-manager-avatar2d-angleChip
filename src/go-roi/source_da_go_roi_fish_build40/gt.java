/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class gt
extends fl_0 {
    private final ee_0 var_ee_0_do;
    private static final int[] mangSoNguyen;

    static {
        gt.cfr_renamed_2();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        bz.fb_0_if(this.var_ee_0_do.var_short_if).cfr_renamed_1(graphics, 7, n, n2, 3);
    }

    public gt(String string, de de2, ee_0 ee_02) {
        super(string, de2);
        this.var_ee_0_do = ee_02;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        7 = 0xB9 ^ 0xBE;
        3 = "   ".length();
    }
}

