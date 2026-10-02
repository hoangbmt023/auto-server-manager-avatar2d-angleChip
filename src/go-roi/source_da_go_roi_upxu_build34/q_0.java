/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from Q
 */
public abstract class q_0 {
    public short var_short_do;
    public String chuoiGiaTri;
    public byte var_byte_do;
    public short var_short_if;
    public int[] mangSoNguyen = new int[var_int_arr_if[0]];
    public short cfr_renamed_3;
    public byte var_byte_if;
    private static int[] var_int_arr_if;

    static {
        q_0.cfr_renamed_0();
    }

    public void cfr_renamed_0(Graphics graphics, int n, int n2, int n3, int n4) {
    }

    public final void cfr_renamed_0(Graphics object, int n, int n2, int n3) {
        if ((this.var_short_do != var_int_arr_if[1])) {
            if ((this.var_short_do >= var_int_arr_if[2])) {
                int n4 = n3;
                int n5 = n2;
                n3 = n;
                n2 = this.var_short_if;
                Graphics graphics = object;
                object = this;
                an an2 = ci_0.an_do((short)n2);
                if (!(an2.soLuong == var_int_arr_if[1]) || (object.var_short_do == var_int_arr_if[1])) {
                    graphics.drawRegion(an2.var_javax_microedition_lcdui_Image_do, var_int_arr_if[3], var_int_arr_if[3], (int)an2.cfr_renamed_1, (int)an2.var_short_do, var_int_arr_if[3], n3, n5, n4);
                }
                return;
            }
            ci_0.var_bH_arr_do[this.var_short_if].cfr_renamed_0((Graphics)object, n, n2, n3);
        }
    }

        public void cfr_renamed_1(Graphics graphics, int n, int n2, int n3) {
        this.cfr_renamed_0(graphics, n, n2, n3);
    }

        private static void cfr_renamed_0() {
        var_int_arr_if = new int[4];
        q_0.var_int_arr_if[0] = "  ".length();
        q_0.var_int_arr_if[1] = -" ".length();
        q_0.var_int_arr_if[2] = -(0xFFFFEB2F & 0x7CF9) & (0xFFFFFFF8 & 0x6FFF);
        q_0.var_int_arr_if[3] = (0x78 ^ 0x16 ^ (0xF4 ^ 0xA4)) & (0x39 ^ 0xE ^ (0x60 ^ 0x69) ^ -" ".length());
    }

    }

