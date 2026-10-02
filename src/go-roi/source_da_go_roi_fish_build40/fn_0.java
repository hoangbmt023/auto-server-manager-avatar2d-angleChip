/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from fN
 */
final class fn_0
extends fl_0 {
    private static int[] mangSoNguyen;
    private final ee_0 var_ee_0_do;

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        bz.fb_0_if(this.var_ee_0_do.var_short_if).cfr_renamed_1(graphics, 7, n, n2, 3);
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        7 = 0xE2 ^ 0xC7 ^ (0x35 ^ 0x17);
        3 = "   ".length();
    }

    fn_0(String string, int n, ee_0 ee_02) {
        super(string, 7, n);
        this.var_ee_0_do = ee_02;
    }

    static {
        fn_0.cfr_renamed_2();
    }
}

