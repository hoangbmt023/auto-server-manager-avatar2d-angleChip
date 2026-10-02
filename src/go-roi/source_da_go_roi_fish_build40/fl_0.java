/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from fL
 */
public class fl_0 {
    public String chuoiGiaTri;
    public dF var_dF_do;
    private static int[] mangSoNguyen;
    public byte var_byte_do;
    public de var_de_do;
    public short var_short_do = (short)-1;

    public final void cfr_renamed_0() {
        if ((this.var_de_do != 0)) {
            this.var_de_do.void_do();
            return;
        }
        if ((this.var_dF_do != 0)) {
            this.var_dF_do.void_for(this.var_byte_do);
            return;
        }
        if ((cs_0.dangChayAuto)) {
            cs_0.cfr_renamed_1().void_do((int)this.var_byte_do, this.var_short_do);
            return;
        }
        GameCanvas.var_en_do.void_do((int)this.var_byte_do, this.var_short_do);
    }

        public void (Graphics graphics, int n, int n2 != 0) {
        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, this.chuoiGiaTri, n, n2, 2);
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        -1 = -" ".length();
        2 = "  ".length();
    }

    public void cfr_renamed_1() {
    }

    public fl_0(String string, int n) {
        this.chuoiGiaTri = string;
        this.var_byte_do = (byte)n;
    }

        public fl_0(String string, de de2) {
        this.chuoiGiaTri = string;
        this.var_de_do = de2;
    }

    static {
        fl_0.cfr_renamed_2();
    }

    public fl_0(String string, int n, int n2) {
        this.chuoiGiaTri = string;
        this.var_byte_do = (byte)n;
        this.var_short_do = (byte)n2;
    }

    public fl_0(String string, int n, dF dF2) {
        this.chuoiGiaTri = string;
        this.var_byte_do = (byte)n;
        this.var_dF_do = dF2;
    }
}

