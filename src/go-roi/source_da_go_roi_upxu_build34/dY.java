/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class dY {
    public short var_short_do;
    public boolean dangChayAuto;
    public short[] var_short_arr_do;
    public short var_short_if;
    private static int[] mangSoNguyen;
    public short cfr_renamed_3;
    public short cfr_renamed_4;
    public short[] var_short_arr_if;
    public short cfr_renamed_5;
    public short cfr_renamed_2 = (short)-1;
    public String chuoiGiaTri;
    public byte var_byte_do;
    public String tenNhanVat;
    public byte[] var_byte_arr_do;

    public final void (Graphics object, int n, int n2, int n3, int n4 != 0) {
        if ((this.dangChayAuto)) {
            ak_0.cfr_renamed_0(object, this.var_short_arr_do[n], n2, n3, n4);
            return;
        }
        Graphics graphics = object;
        object = ak_0.var_bH_arr_do[this.var_short_arr_do[n]];
        graphics.drawRegion(ak_0.var_javax_microedition_lcdui_Image_arr_do[object.cfr_renamed_1], object.cfr_renamed_4 * bn_0.cfr_renamed_6, object.cfr_renamed_2 * bn_0.cfr_renamed_6, object.cfr_renamed_5 * bn_0.cfr_renamed_6, object.cfr_renamed_3 * bn_0.cfr_renamed_6, 0, n2, n3, n4);
    }

    static {
        dY.cfr_renamed_0();
    }

        public dY() {
        this.var_short_arr_if = new short[2];
        this.dangChayAuto = 0;
        this.var_byte_do = (byte)1;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        -1 = -" ".length();
        2 = "  ".length();
        0 = (0xDC ^ 0x81 ^ (0xE1 ^ 0xA0)) & (0xFE ^ 0xA9 ^ (0x22 ^ 0x69) ^ -" ".length());
        1 = " ".length();
    }
}

