/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from do
 */
final class do_0
extends fl_0 {
    private static int[] mangSoNguyen;
    private final int soLuong;
    private ee_0 var_ee_0_do;

    public final void cfr_renamed_1() {
        if ((fo.var_boolean_int) && do_0.cfr_renamed_1(this.soLuong, fo.var_int_try - dR.java_util_Vector_do().size())) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1(dR.dg_0_do((int)this.var_ee_0_do.var_short_if).chuoiGiaTri);
            dg_0 dg_02 = dR.dg_0_do(this.var_ee_0_do.var_short_if);
            int n = this.var_ee_0_do.soLuong;
            if ((dg_02.var_byte_do == 4)) {
                n -= dR.var_java_util_Vector_arr_do[1].size();
                } else if ((dg_02.var_byte_do == 1)) {
                n -= dR.var_java_util_Vector_arr_do[0].size();
            }
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.bJ) + n);
        }
    }

    do_0(String string, int n, int n2) {
        super(string, 13, n);
        this.soLuong = n2;
        this.var_ee_0_do = (ee_0)dR.var_java_util_Vector_try.elementAt(n2);
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[5];
        13 = 100 + 36 - 110 + 143 ^ 100 + 35 - 109 + 138;
        2 = "  ".length();
        4 = 0x9F ^ 0x9B;
        1 = " ".length();
        0 = (0x2F ^ 0x38) & ~(0x37 ^ 0x20);
    }

    public final void (Graphics graphics, int n, int n2 != 0) {
        dR.dg_0_do(this.var_ee_0_do.var_short_if).cfr_renamed_1(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2);
    }

    static {
        do_0.cfr_renamed_2();
    }

        }

