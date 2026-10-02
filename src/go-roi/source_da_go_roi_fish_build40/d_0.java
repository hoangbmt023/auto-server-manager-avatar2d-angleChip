/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

/*
 * Renamed from d
 */
public final class d_0 {
    public short var_short_do;
    public Image var_javax_microedition_lcdui_Image_do;
    public short cfr_renamed_0;
    public int soLuong = -1;
    private static int[] mangSoNguyen;

    public d_0(Image image) {
        this.var_javax_microedition_lcdui_Image_do = image;
        this.soLuong = 0;
        this.var_short_do = (short)image.getWidth();
        this.cfr_renamed_0 = (short)image.getHeight();
    }

    static {
        d_0.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        -1 = -" ".length();
        0 = (0xAF ^ 0xAA) & ~(0x9B ^ 0x9E);
    }

    public d_0() {
    }
}

