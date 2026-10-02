/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

/*
 * Renamed from fH
 */
public final class fh_0 {
    public short var_short_do;
    public byte var_byte_do;
    private static int[] mangSoNguyen;
    public boolean dangChayAuto = 0;
    public short var_short_if;
    public Image var_javax_microedition_lcdui_Image_do;
    public int soLuong;
    public String chuoiGiaTri = "";
    public byte var_byte_if = (byte)-1;
    public int var_int_if;
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    public fh_0(int n, int n2, String string, int n3, int n4) {
        this.var_short_if = (short)-1;
        this.var_short_do = (short)-1;
        this.cfr_renamed_4 = n4;
        this.var_byte_do = (byte)-1;
        this.cfr_renamed_3 = n;
        this.soLuong = n2;
        this.chuoiGiaTri = string;
        this.var_int_if = 0;
        this.dangChayAuto = 1;
        this.var_byte_if = (byte)n3;
        this.var_short_if = (short)-1;
        this.var_short_do = (short)-1;
    }

    public fh_0(int n, int n2, int n3, Image image, int n4, int n5) {
        this.var_short_if = (short)-1;
        this.var_short_do = (short)-1;
        this.cfr_renamed_4 = n4;
        this.var_byte_do = (byte)-1;
        this.cfr_renamed_3 = n;
        this.soLuong = n2;
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
        this.var_short_if = (short)n5;
        this.var_short_do = (short)-1;
    }

    static {
        fh_0.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        0 = (0x3E ^ 0x25) & ~(0x92 ^ 0x89);
        -1 = -" ".length();
        1 = " ".length();
    }

        }

