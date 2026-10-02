/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from eR
 */
final class er_0
extends fl_0 {
    private static int[] mangSoNguyen;
    private final int soLuong;

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        aq.var_cu_0_do.cfr_renamed_0(this.soLuong / aq.var_cu_0_do.cfr_renamed_0, this.soLuong % aq.var_cu_0_do.cfr_renamed_0, n, n2, 3, graphics);
    }

    er_0(String string, int n, int n2) {
        super(string, n);
        this.soLuong = n2;
    }

    static {
        er_0.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[1];
        3 = "   ".length();
    }
}

