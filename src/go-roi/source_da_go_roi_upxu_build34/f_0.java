/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from f
 */
final class f_0
extends ei {
    private static int[] mangSoNguyen;
    private final ev_0 var_ev_0_do;

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ci_0.cfr_renamed_0(graphics, this.var_ev_0_do.cfr_renamed_5, n, n2, 3);
    }

    static {
        f_0.cfr_renamed_3();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        16 = 0x2B ^ 0x3B;
        3 = "   ".length();
    }

    f_0(String string, int n, ev_0 ev_02) {
        super(string, 16, n);
        this.var_ev_0_do = ev_02;
    }
}

