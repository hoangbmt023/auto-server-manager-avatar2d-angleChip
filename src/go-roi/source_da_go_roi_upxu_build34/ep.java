/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ep {
    public int soLuong;
    public int cfr_renamed_1;
    public Image var_javax_microedition_lcdui_Image_do;
    private static int[] mangSoNguyen;
    public int cfr_renamed_3;

        public final void (int n, int n2, int n3, int n4, Graphics graphics >= 0) {
        graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, 0, n * this.soLuong, this.cfr_renamed_3, this.soLuong, n4, n2, n3, 0);
    }

    public final void (int n, int n2, int n3, int n4, int n5, Graphics graphics >= 0) {
        if ((n >= 0) && (n < this.cfr_renamed_1)) {
            graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, 0, n * this.soLuong, this.cfr_renamed_3, this.soLuong, n4, n2, n3, n5);
        }
    }

    static {
        ep.cfr_renamed_0();
    }

    public ep(Image image, int n, int n2) {
        this.var_javax_microedition_lcdui_Image_do = image;
        this.cfr_renamed_3 = n;
        this.soLuong = n2;
        this.cfr_renamed_1 = image.getHeight() / n2;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0x2F ^ 0x31) & ~(0x41 ^ 0x5F);
    }

    public static ep (String string, int n, int n2 >= 0) {
        return new ep(ap.javax_microedition_lcdui_Image_do(string), n, n2);
    }

    public final void cfr_renamed_1(int n, int n2, int n3, int n4, int n5, Graphics graphics) {
        if ((n >= 0) && (n < this.cfr_renamed_1)) {
            graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, n * this.cfr_renamed_3, n2 * this.soLuong, this.cfr_renamed_3, this.soLuong, 0, n3, n4, n5);
        }
    }

    public final void cfr_renamed_1(int n, int n2, int n3, int n4, Graphics graphics) {
        if ((n >= 0) && (n < this.cfr_renamed_1)) {
            graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, n * this.cfr_renamed_3, n2 * this.soLuong, this.cfr_renamed_3, this.soLuong, 0, n3, n4, 0);
        }
    }

    }

