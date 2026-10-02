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
extends fl_0 {
    private final int soLuong;
    private static final int[] mangSoNguyen;

    public dz_0(String string, de de2, int n) {
        super(string, de2);
        this.soLuong = n;
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        dR.var_cu_0_try.cfr_renamed_1(this.soLuong, n, n2, 0, 3, graphics);
    }

    static {
        dz_0.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        0 = (0x15 ^ 2 ^ (0x58 ^ 0x1E)) & (0x77 ^ 0x44 ^ (0x16 ^ 0x74) ^ -" ".length());
        3 = "   ".length();
    }
}

