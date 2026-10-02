/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from be
 */
final class be_0
extends fl_0 {
    private final int soLuong;
    private static int[] mangSoNguyen;

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[4];
        17 = 0xAB ^ 0x89 ^ (0x35 ^ 6);
        1 = " ".length();
        0 = (0x37 ^ 0xF) & ~(0x22 ^ 0x1A);
        3 = "   ".length();
    }

    be_0(String string, int n, int n2) {
        super(string, 17, n);
        this.soLuong = n2;
    }

    static {
        be_0.cfr_renamed_2();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        fh.var_cu_0_do.cfr_renamed_1(this.soLuong, n + 1, n2 + 1, 0, 3, graphics);
    }
}

