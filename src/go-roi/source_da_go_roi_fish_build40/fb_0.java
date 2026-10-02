/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from fB
 */
public final class fb_0 {
    public short var_short_do;
    public short var_short_if = (short)-1;
    public boolean dangChayAuto;
    public short cfr_renamed_2;
    public short[] var_short_arr_do = new short[2];
    public byte var_byte_do;
    public String chuoiGiaTri;
    public short[] var_short_arr_if;
    public short cfr_renamed_3;
    public short cfr_renamed_4;
    public short cfr_renamed_5;
    public byte[] var_byte_arr_do;
    private static int[] mangSoNguyen;
    public String tenNhanVat;

        static {
        fb_0.cfr_renamed_1();
    }

    public final void (Graphics object, int n, int n2, int n3, int n4 != 0) {
        if ((this.dangChayAuto)) {
            bz.cfr_renamed_1(object, this.var_short_arr_if[n], n2, n3, n4);
            return;
        }
        Graphics graphics = object;
        object = bz.var_k_0_arr_do[this.var_short_arr_if[n]];
        graphics.drawRegion(bz.var_javax_microedition_lcdui_Image_arr_do[object.cfr_renamed_3], object.var_short_do * dF.cfr_renamed_12, object.cfr_renamed_0 * dF.cfr_renamed_12, object.cfr_renamed_4 * dF.cfr_renamed_12, object.cfr_renamed_5 * dF.cfr_renamed_12, 0, n2, n3, n4);
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        -1 = -" ".length();
        2 = "  ".length();
        0 = (75 + 90 - 91 + 61 ^ 58 + 20 - -16 + 78) & (0x7A ^ 0x19 ^ (0xE4 ^ 0xAC) ^ -" ".length());
        1 = " ".length();
    }

    public fb_0() {
        this.dangChayAuto = 0;
        this.var_byte_do = (byte)1;
    }
}

