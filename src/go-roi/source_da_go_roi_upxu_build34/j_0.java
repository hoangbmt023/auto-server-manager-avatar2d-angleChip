/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from j
 */
final class j_0
extends ei {
    private static int[] mangSoNguyen;
    private final int soLuong;
    private final byte[] var_byte_arr_do;

    j_0(String string, int n, byte[] byArray, int n2) {
        super(string, 19, n);
        this.var_byte_arr_do = byArray;
        this.soLuong = n2;
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ci ci2 = (ci)ci_0.q_0_do(0);
        ci2.cfr_renamed_0(graphics, n + 2 + ci2.var_byte_arr_if[0] * bn_0.cfr_renamed_6, n2 + 21 + 20 * (bn_0.cfr_renamed_6 - 1) + ci2.var_byte_arr_do[0] * bn_0.cfr_renamed_6, 0);
        ci2 = (ci)ci_0.q_0_do(this.var_byte_arr_do[this.soLuong]);
        ci2.cfr_renamed_0(graphics, n + 2 + ci2.var_byte_arr_if[0] * bn_0.cfr_renamed_6, n2 + 21 + 20 * (bn_0.cfr_renamed_6 - 1) + ci2.var_byte_arr_do[0] * bn_0.cfr_renamed_6, 0);
    }

    static {
        j_0.cfr_renamed_3();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[6];
        19 = 0x1F ^ 0x58 ^ (0x22 ^ 0x76);
        0 = (0xAB ^ 0x82 ^ (0xCE ^ 0xBD)) & ("  ".length() ^ (0x35 ^ 0x6D) ^ -" ".length());
        2 = "  ".length();
        21 = 0xF4 ^ 0x82 ^ (0xDB ^ 0xB8);
        20 = 0x92 ^ 0xAB ^ (0x4D ^ 0x60);
        1 = " ".length();
    }
}

