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
 * Renamed from cu
 */
public final class cu_0 {
    public Image var_javax_microedition_lcdui_Image_do;
    public int soLuong;
    private static int[] mangSoNguyen;
    public int cfr_renamed_0;
    public int cfr_renamed_2;

    public final void (int n, int n2, int n3, int n4, Graphics graphics >= 0) {
        if ((n >= 0) && (n < this.cfr_renamed_0)) {
            graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, n * this.soLuong, n2 * this.cfr_renamed_2, this.soLuong, this.cfr_renamed_2, 0, n3, n4, 0);
        }
    }

    static {
        cu_0.cfr_renamed_1();
    }

    public final void cfr_renamed_0(int n, int n2, int n3, int n4, Graphics graphics) {
        graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, 0, n * this.cfr_renamed_2, this.soLuong, this.cfr_renamed_2, n4, n2, n3, 0);
    }

        public final void (int n, int n2, int n3, int n4, int n5, Graphics graphics >= 0) {
        if ((n >= 0) && (n < this.cfr_renamed_0)) {
            graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, 0, n * this.cfr_renamed_2, this.soLuong, this.cfr_renamed_2, n4, n2, n3, n5);
        }
    }

        public static cu_0 (String string, int n, int n2 >= 0) {
        return new cu_0(e.javax_microedition_lcdui_Image_do(string), n, n2);
    }

    public final void cfr_renamed_0(int n, int n2, int n3, int n4, int n5, Graphics graphics) {
        if ((n >= 0) && (n < this.cfr_renamed_0)) {
            graphics.drawRegion(this.var_javax_microedition_lcdui_Image_do, n * this.soLuong, n2 * this.cfr_renamed_2, this.soLuong, this.cfr_renamed_2, 0, n3, n4, n5);
        }
    }

    public cu_0(Image image, int n, int n2) {
        this.var_javax_microedition_lcdui_Image_do = image;
        this.soLuong = n;
        this.cfr_renamed_2 = n2;
        this.cfr_renamed_0 = image.getHeight() / n2;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        0 = (0x84 ^ 0xB1 ^ (0xCA ^ 0xA3)) & (0xA2 ^ 0x9A ^ (0 ^ 0x64) ^ -" ".length());
    }
}

