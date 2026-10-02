/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from dz
 */
public final class dz_0
extends ei {
    private static final int[] mangSoNguyen;
    private final int soLuong;

    public dz_0(String string, cp cp2, int n) {
        super(string, cp2);
        this.soLuong = n;
    }

    static {
        dz_0.cfr_renamed_3();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        bF.var_ep_if.cfr_renamed_0(this.soLuong, n, n2, 0, 3, graphics);
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        0 = (0x40 ^ 0x66 ^ (1 ^ 0x77)) & (0x2F ^ 0x68 ^ (0x87 ^ 0x90) ^ -" ".length());
        3 = "   ".length();
    }
}

