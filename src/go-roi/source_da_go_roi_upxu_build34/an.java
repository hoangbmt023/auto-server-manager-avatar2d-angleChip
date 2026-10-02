/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class an {
    public short var_short_do;
    public Image var_javax_microedition_lcdui_Image_do;
    public int soLuong = -1;
    public short cfr_renamed_1;
    private static int[] mangSoNguyen;

    static {
        an.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        -1 = -" ".length();
        0 = (0x7F ^ 0x7B) & ~(0x67 ^ 0x63);
    }

    public an() {
    }

    public an(Image image) {
        this.var_javax_microedition_lcdui_Image_do = image;
        this.soLuong = 0;
        this.cfr_renamed_1 = (short)image.getWidth();
        this.var_short_do = (short)image.getHeight();
    }
}

