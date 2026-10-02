/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Renamed from bJ
 */
final class bj_0
extends fl_0 {
    private final Image var_javax_microedition_lcdui_Image_do;
    private static final int[] mangSoNguyen;

    public bj_0(String string, String string2, de de2) {
        super(string2, de2);
        this.var_javax_microedition_lcdui_Image_do = J.cfr_renamed_1(string);
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        0 = (121 + 42 - 97 + 71 ^ 5 + 142 - 3 + 43) & (0x41 ^ 0x37 ^ (0xF9 ^ 0xBD) ^ -" ".length());
        3 = "   ".length();
    }

    static {
        bj_0.cfr_renamed_2();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, 0, 0, this.var_javax_microedition_lcdui_Image_do.getWidth(), this.var_javax_microedition_lcdui_Image_do.getHeight(), 0, n, n2, 3);
    }
}

