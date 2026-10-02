/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public abstract class am {
    public String chuoiGiaTri;
    private static int[] var_int_arr_if;
    public int[] mangSoNguyen = new int[var_int_arr_if[0]];
    public short var_short_if;
    public byte var_byte_do;
    public short cfr_renamed_2;
    public byte var_byte_if;
    public short cfr_renamed_3;

    public void cfr_renamed_1(Graphics graphics, int n, int n2, int n3) {
        this.cfr_renamed_0(graphics, n, n2, n3);
    }

    public final void cfr_renamed_0(Graphics object, int n, int n2, int n3) {
        if ((this.cfr_renamed_3 != var_int_arr_if[1])) {
            if ((this.cfr_renamed_3 >= var_int_arr_if[2])) {
                int n4 = n3;
                int n5 = n2;
                n3 = n;
                n2 = this.var_short_if;
                Graphics graphics = object;
                object = this;
                d_0 d_02 = aa_0.d_0_do((short)n2);
                if (!(d_02.soLuong == var_int_arr_if[1]) || (object.cfr_renamed_3 == var_int_arr_if[1])) {
                    graphics.drawRegion(d_02.var_javax_microedition_lcdui_Image_do, var_int_arr_if[3], var_int_arr_if[3], (int)d_02.var_short_do, (int)d_02.cfr_renamed_0, var_int_arr_if[3], n3, n5, n4);
                }
                return;
            }
            aa_0.var_k_0_arr_do[this.var_short_if].cfr_renamed_1((Graphics)object, n, n2, n3);
        }
    }

            public void cfr_renamed_1(Graphics graphics, int n, int n2, int n3, int n4) {
    }

        private static void cfr_renamed_1() {
        var_int_arr_if = new int[4];
        am.var_int_arr_if[0] = "  ".length();
        am.var_int_arr_if[1] = -" ".length();
        am.var_int_arr_if[2] = -(0xAC ^ 0x80) & (0xFFFFBFFF & 0x47FB);
        am.var_int_arr_if[3] = (0x7A ^ 0x50) & ~(0x98 ^ 0xB2);
    }

    static {
        am.cfr_renamed_1();
    }
}

