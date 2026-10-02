/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class ek
extends ei {
    private static int[] mangSoNguyen;
    private final gd var_gd_do;

    ek(String string, int n, gd gd2) {
        super(string, 7, n);
        this.var_gd_do = gd2;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        7 = 0x74 ^ 0x67 ^ (0x25 ^ 0x31);
        3 = "   ".length();
    }

    static {
        ek.cfr_renamed_3();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ak_0.dY_do((int)this.var_gd_do.var_short_do).cfr_renamed_0(graphics, 7, n, n2, 3);
    }
}

