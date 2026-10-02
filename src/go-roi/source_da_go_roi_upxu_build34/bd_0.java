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
 * Renamed from bD
 */
final class bd_0
extends ei {
    private final Image var_javax_microedition_lcdui_Image_do;
    private static final int[] mangSoNguyen;

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        0 = (0xE3 ^ 0xC6 ^ (0x67 ^ 0x6D)) & (36 + 4 - -92 + 59 ^ 104 + 88 - 107 + 59 ^ -" ".length());
        3 = "   ".length();
    }

    static {
        bd_0.cfr_renamed_3();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, 0, 0, this.var_javax_microedition_lcdui_Image_do.getWidth(), this.var_javax_microedition_lcdui_Image_do.getHeight(), 0, n, n2, 3);
    }

    public bd_0(String string, String string2, cp cp2) {
        super(string2, cp2);
        this.var_javax_microedition_lcdui_Image_do = D.cfr_renamed_0(string);
    }
}

