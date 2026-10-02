/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class u
extends fl_0 {
    private final byte[] var_byte_arr_do;
    private static int[] mangSoNguyen;
    private final int soLuong;

    u(String string, int n, byte[] byArray, int n2) {
        super(string, 19, n);
        this.var_byte_arr_do = byArray;
        this.soLuong = n2;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[6];
        19 = 0x4B ^ 0x58;
        0 = (0x1D ^ 8) & ~(0x3D ^ 0x28);
        2 = "  ".length();
        21 = 0x76 ^ 0x6C ^ (2 ^ 0xD);
        20 = 41 + 90 - 90 + 103 ^ 73 + 54 - 11 + 16;
        1 = " ".length();
    }

    static {
        u.cfr_renamed_2();
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        cX cX2 = (cX)aa_0.am_do(0);
        cX2.cfr_renamed_0(graphics, n + 2 + cX2.var_byte_arr_if[0] * dF.cfr_renamed_12, n2 + 21 + 20 * (dF.cfr_renamed_12 - 1) + cX2.var_byte_arr_do[0] * dF.cfr_renamed_12, 0);
        cX2 = (cX)aa_0.am_do(this.var_byte_arr_do[this.soLuong]);
        cX2.cfr_renamed_0(graphics, n + 2 + cX2.var_byte_arr_if[0] * dF.cfr_renamed_12, n2 + 21 + 20 * (dF.cfr_renamed_12 - 1) + cX2.var_byte_arr_do[0] * dF.cfr_renamed_12, 0);
    }
}

