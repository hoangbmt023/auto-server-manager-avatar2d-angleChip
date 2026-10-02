/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class dq
extends ei {
    private static int[] mangSoNguyen;
    private final int soLuong;

    dq(String string, cp cp2, int n) {
        super(string, cp2);
        this.soLuong = n;
    }

    static {
        dq.cfr_renamed_3();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        0 = (39 + 117 - 104 + 95 ^ 67 + 90 - 89 + 105) & (0x91 ^ 0x95 ^ (0x2E ^ 0x14) ^ -" ".length());
        3 = "   ".length();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        u_0.var_ep_do.cfr_renamed_0(this.soLuong, n, n2, 0, 3, graphics);
    }
}

