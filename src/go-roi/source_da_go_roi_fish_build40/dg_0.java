/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from dG
 */
public final class dg_0 {
    public short var_short_do;
    private static int[] mangSoNguyen;
    public int soLuong;
    public boolean dangChayAuto;
    public byte var_byte_do;
    public String chuoiGiaTri;
    public short var_short_if;
    public byte var_byte_if;
    public int var_int_if;

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        d_0 d_02 = bz.d_0_do(this.var_short_if);
        if ((d_02.soLuong != -1)) {
            graphics.drawRegion(d_02.var_javax_microedition_lcdui_Image_do, 0, 0, (int)d_02.var_short_do, (int)d_02.cfr_renamed_0, 0, n, n2, 3);
        }
    }

    static {
        dg_0.cfr_renamed_1();
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        -1 = -" ".length();
        0 = (0x4B ^ 0x10 ^ (0xD6 ^ 0xA3)) & (32 + 131 - 18 + 4 ^ 47 + 133 - 124 + 131 ^ -" ".length());
        3 = "   ".length();
    }
}

