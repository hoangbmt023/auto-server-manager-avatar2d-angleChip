/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from fR
 */
final class fr_0
extends ei {
    private final gd var_gd_do;
    private static final int[] mangSoNguyen;

    public fr_0(String string, cp cp2, gd gd2) {
        super(string, cp2);
        this.var_gd_do = gd2;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        7 = 0x8A ^ 0x8D;
        3 = "   ".length();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ak_0.dY_do((int)this.var_gd_do.var_short_do).cfr_renamed_0(graphics, 7, n, n2, 3);
    }

    static {
        fr_0.cfr_renamed_3();
    }
}

