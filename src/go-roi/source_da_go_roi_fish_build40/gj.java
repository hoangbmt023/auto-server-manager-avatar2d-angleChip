/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class gj {
    public int soLuong;
    private static int[] mangSoNguyen;
    public byte var_byte_do;
    public byte var_byte_if;
    public boolean dangChayAuto = 0;
    public int var_int_if;
    public int cfr_renamed_2;
    public short var_short_do;
    public int cfr_renamed_3;
    public String chuoiGiaTri = "";
    public short var_short_if;
    public Image var_javax_microedition_lcdui_Image_do;

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        0 = (46 + 113 - 137 + 178 ^ 47 + 21 - 51 + 151) & (0x8A ^ 0x91 ^ (0xDB ^ 0xA0) ^ -" ".length());
        -1 = -" ".length();
        1 = " ".length();
    }

    public gj(int n, int n2, String string, int n3, int n4) {
        this.var_byte_if = (byte)-1;
        this.var_short_do = (short)-1;
        this.var_short_if = (short)-1;
        this.cfr_renamed_2 = n4;
        this.var_byte_do = (byte)-1;
        this.cfr_renamed_3 = n;
        this.var_int_if = n2;
        this.chuoiGiaTri = string;
        this.soLuong = 0;
        this.dangChayAuto = 1;
        this.var_byte_if = (byte)n3;
        this.var_short_do = (short)-1;
        this.var_short_if = (short)-1;
    }

        public gj(int n, int n2, int n3, Image image, int n4, int n5) {
        this.var_byte_if = (byte)-1;
        this.var_short_do = (short)-1;
        this.var_short_if = (short)-1;
        this.cfr_renamed_2 = n4;
        this.var_byte_do = (byte)-1;
        this.cfr_renamed_3 = n;
        this.var_int_if = n2;
        if ((n3 > 0)) {
            this.chuoiGiaTri = "+";
        }
        this.chuoiGiaTri = String.valueOf(this.chuoiGiaTri) + n3;
        if ((n3 == 0)) {
            this.chuoiGiaTri = "";
        }
        this.var_javax_microedition_lcdui_Image_do = image;
        this.dangChayAuto = 0;
        this.var_byte_if = (byte)-1;
        this.var_short_do = (short)n5;
        this.var_short_if = (short)-1;
    }

    static {
        gj.cfr_renamed_1();
    }
}

