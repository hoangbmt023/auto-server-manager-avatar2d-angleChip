/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from eZ
 */
final class ez_0
extends fl_0 {
    private static int[] mangSoNguyen;
    private final int soLuong;

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        0 = (5 + 126 - 93 + 130 ^ 107 + 9 - 16 + 73) & (29 + 20 - 11 + 89 ^ (0x27 ^ 0x5D) ^ -" ".length());
        3 = "   ".length();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        aq.var_cu_0_do.cfr_renamed_1(this.soLuong, n, n2, 0, 3, graphics);
    }

    static {
        ez_0.cfr_renamed_2();
    }

    ez_0(String string, de de2, int n) {
        super(string, de2);
        this.soLuong = n;
    }
}

