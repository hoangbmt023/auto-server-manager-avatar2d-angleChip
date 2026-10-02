/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class ff {
    public byte var_byte_do;
    private static int[] mangSoNguyen;
    public short var_short_do;
    public short var_short_if;
    public boolean dangChayAuto;
    public String chuoiGiaTri;
    public int soLuong;
    public int var_int_if;
    public byte var_byte_if;

        static {
        ff.cfr_renamed_0();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        an an2 = ak_0.an_do(this.var_short_if);
        if ((an2.soLuong != -1)) {
            graphics.drawRegion(an2.var_javax_microedition_lcdui_Image_do, 0, 0, (int)an2.cfr_renamed_1, (int)an2.var_short_do, 0, n, n2, 3);
        }
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        -1 = -" ".length();
        0 = (36 + 132 - 96 + 174 ^ 59 + 15 - 33 + 109) & (0x48 ^ 0x42 ^ (0x2F ^ 0x45) ^ -" ".length());
        3 = "   ".length();
    }
}

