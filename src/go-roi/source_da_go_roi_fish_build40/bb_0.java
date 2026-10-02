/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from bb
 */
final class bb_0
extends fl_0 {
    private final String cfr_renamed_0;
    private final gs_0 var_gs_0_do;
    private final int soLuong;
    private final String cfr_renamed_2;
    private static int[] mangSoNguyen;

    static {
        bb_0.cfr_renamed_2();
    }

    bb_0(String string, de de2, gs_0 gs_02, String string2, String string3) {
        super(string, de2);
        this.var_gs_0_do = gs_02;
        this.soLuong = 90;
        this.cfr_renamed_0 = string2;
        this.cfr_renamed_2 = string3;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[4];
        90 = 0xC9 ^ 0x94 ^ (0x4E ^ 0x49);
        2 = "  ".length();
        5 = 0xFC ^ 0xB1 ^ (0x7C ^ 0x34);
        33 = 0xE5 ^ 0xC4;
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        aa_0.cfr_renamed_1(graphics, this.var_gs_0_do.cfr_renamed_5, n, n2 + this.soLuong / 2 - dF.var_byte_new - dF.var_byte_try - 5, 33);
        GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, this.cfr_renamed_0, n, n2 + this.soLuong / 2 - dF.var_byte_new, 2);
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, this.cfr_renamed_2, n, n2 + this.soLuong / 2 - dF.var_byte_new - dF.var_byte_try, 2);
    }
}

