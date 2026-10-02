/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class eh
extends fl_0 {
    private dg_0 var_dg_0_do;
    private static int[] mangSoNguyen;

    public eh(String string, int n, dg_0 dg_02) {
        super(string, 6, n);
        this.var_dg_0_do = dg_02;
    }

    static {
        eh.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[1];
        6 = 0x57 ^ 0x51;
    }

    public eh(String string, de de2, dg_0 dg_02) {
        super(string, de2);
        this.var_dg_0_do = dg_02;
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        this.var_dg_0_do.cfr_renamed_1(graphics, n, n2);
    }
}

