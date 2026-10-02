/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class q
extends fl_0 {
    private static int[] mangSoNguyen;
    private final fx var_fx_do;

    q(String string, int n, fx fx2) {
        super(string, 16, n);
        this.var_fx_do = fx2;
    }

    static {
        q.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        16 = 0x79 ^ 0x6C ^ (9 ^ 0xC);
        3 = "   ".length();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        aa_0.cfr_renamed_1(graphics, this.var_fx_do.cfr_renamed_5, n, n2, 3);
    }
}

