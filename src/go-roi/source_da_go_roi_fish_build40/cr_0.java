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
extends fl_0 {
    private final fx var_fx_do;
    private static int[] mangSoNguyen;

    static {
        cr_0.cfr_renamed_2();
    }

    cr_0(String string, de de2, fx fx2) {
        super(string, de2);
        this.var_fx_do = fx2;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[1];
        3 = "   ".length();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        aa_0.cfr_renamed_1(graphics, this.var_fx_do.cfr_renamed_5, n, n2, 3);
    }
}

