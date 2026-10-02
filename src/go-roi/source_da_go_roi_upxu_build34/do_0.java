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
extends ei {
    private final int soLuong;
    private gd var_gd_do;
    private static int[] mangSoNguyen;

        public final void cfr_renamed_0() {
        if ((em_0.var_boolean_int) && do_0.cfr_renamed_0(this.soLuong, em_0.var_int_if - bF.java_util_Vector_do().size())) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0(bF.ff_do((int)this.var_gd_do.var_short_do).chuoiGiaTri);
            ff ff2 = bF.ff_do(this.var_gd_do.var_short_do);
            int n = this.var_gd_do.soLuong;
            if ((ff2.var_byte_do == 4)) {
                n -= bF.var_java_util_Vector_arr_do[1].size();
                if (-" ".length() > (0x16 ^ 0x12)) {
                    return;
                }
            } else if ((ff2.var_byte_do == 1)) {
                n -= bF.var_java_util_Vector_arr_do[0].size();
            }
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.bH) + n);
        }
    }

    public final void (Graphics graphics, int n, int n2 != 0) {
        bF.ff_do(this.var_gd_do.var_short_do).cfr_renamed_0(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2);
    }

    static {
        do_0.cfr_renamed_3();
    }

        do_0(String string, int n, int n2) {
        super(string, 13, n);
        this.soLuong = n2;
        this.var_gd_do = (gd)bF.var_java_util_Vector_do.elementAt(n2);
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[5];
        13 = 0xB0 ^ 0xC7 ^ (0x72 ^ 8);
        2 = "  ".length();
        4 = 0x1A ^ 0x1E;
        1 = " ".length();
        0 = (38 + 206 - 81 + 45 ^ 84 + 106 - 176 + 163) & (0x6D ^ 0x51 ^ (0xF8 ^ 0xA5) ^ -" ".length());
    }
}

