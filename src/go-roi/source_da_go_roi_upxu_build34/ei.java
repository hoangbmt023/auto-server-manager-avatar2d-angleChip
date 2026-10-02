/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public class ei {
    public String chuoiGiaTri;
    private static int[] mangSoNguyen;
    public short var_short_do = (short)-1;
    public bn_0 var_bn_0_do;
    public byte var_byte_do;
    public cp var_cp_do;

    public ei(String string, int n, bn_0 bn_02) {
        this.chuoiGiaTri = string;
        this.var_byte_do = (byte)n;
        this.var_bn_0_do = bn_02;
    }

    public void cfr_renamed_0() {
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        -1 = -" ".length();
        2 = "  ".length();
    }

    public ei(String string, int n) {
        this.chuoiGiaTri = string;
        this.var_byte_do = (byte)n;
    }

    public void (Graphics graphics, int n, int n2 != 0) {
        GameCanvas.var_ew_byte.cfr_renamed_0(graphics, this.chuoiGiaTri, n, n2, 2);
    }

    public final void cfr_renamed_1() {
        if ((this.var_cp_do != 0)) {
            this.var_cp_do.void_do();
            return;
        }
        if ((this.var_bn_0_do != 0)) {
            this.var_bn_0_do.void_if(this.var_byte_do);
            return;
        }
        if ((ce.dangChayAuto)) {
            ce.cfr_renamed_0().void_do((int)this.var_byte_do, this.var_short_do);
            return;
        }
        GameCanvas.var_dL_do.void_do((int)this.var_byte_do, this.var_short_do);
    }

    static {
        ei.cfr_renamed_3();
    }

        public ei(String string, int n, int n2) {
        this.chuoiGiaTri = string;
        this.var_byte_do = (byte)n;
        this.var_short_do = (byte)n2;
    }

        public ei(String string, cp cp2) {
        this.chuoiGiaTri = string;
        this.var_cp_do = cp2;
    }
}

