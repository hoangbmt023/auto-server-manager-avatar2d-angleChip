/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class dF
extends ei {
    private static int[] mangSoNguyen;
    private ff var_ff_do;

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        this.var_ff_do.cfr_renamed_0(graphics, n, n2);
    }

    public dF(String string, cp cp2, ff ff2) {
        super(string, cp2);
        this.var_ff_do = ff2;
    }

    public dF(String string, int n, ff ff2) {
        super(string, 6, n);
        this.var_ff_do = ff2;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[1];
        6 = 0x5E ^ 0x1F ^ (0xC0 ^ 0x87);
    }

    static {
        dF.cfr_renamed_3();
    }
}

