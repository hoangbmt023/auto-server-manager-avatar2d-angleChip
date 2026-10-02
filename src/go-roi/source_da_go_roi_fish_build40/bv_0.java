/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from bV
 */
public final class bv_0
extends fl_0 {
    private static final int[] mangSoNguyen;
    private final cg var_cg_do;
    private final int soLuong;

    bv_0(cg cg2, int n, String string, de de2) {
        super(string, de2);
        this.var_cg_do = cg2;
        this.soLuong = n;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        2 = "  ".length();
        3 = "   ".length();
    }

        public final void (Graphics graphics, int n, int n2 != 0) {
        aa_0.am_do(this.var_cg_do.var_short_do).cfr_renamed_0(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
    }

        static {
        bv_0.cfr_renamed_2();
    }

    public final void cfr_renamed_1() {
        if ((fo.var_boolean_int) && (this.soLuong == fo.var_int_try)) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1("ID: " + this.var_cg_do.var_short_do);
            fo.cfr_renamed_1(al.cfr_renamed_1(this.var_cg_do.var_short_do));
        }
    }
}

