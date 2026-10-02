/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class de
extends ei {
    private final int soLuong;
    private static int[] mangSoNguyen;

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[1];
        3 = "   ".length();
    }

    de(String string, int n, int n2) {
        super(string, n);
        this.soLuong = n2;
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        u_0.var_ep_do.cfr_renamed_1(this.soLuong / u_0.var_ep_do.cfr_renamed_1, this.soLuong % u_0.var_ep_do.cfr_renamed_1, n, n2, 3, graphics);
    }

    static {
        de.cfr_renamed_3();
    }
}

