/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from cr
 */
final class cr_0
extends ei {
    private static int[] mangSoNguyen;
    private final ev_0 var_ev_0_do;

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[1];
        3 = "   ".length();
    }

    cr_0(String string, cp cp2, ev_0 ev_02) {
        super(string, cp2);
        this.var_ev_0_do = ev_02;
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ci_0.cfr_renamed_0(graphics, this.var_ev_0_do.cfr_renamed_5, n, n2, 3);
    }

    static {
        cr_0.cfr_renamed_3();
    }
}

