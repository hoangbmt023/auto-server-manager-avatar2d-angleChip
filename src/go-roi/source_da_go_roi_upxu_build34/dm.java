/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class dm
extends ei {
    private static int[] mangSoNguyen;
    private final String cfr_renamed_1;
    private final int soLuong;
    private final String cfr_renamed_3;
    private final fi_0 var_fi_0_do;

    dm(String string, cp cp2, fi_0 fi_02, String string2, String string3) {
        super(string, cp2);
        this.var_fi_0_do = fi_02;
        this.soLuong = 90;
        this.cfr_renamed_1 = string2;
        this.cfr_renamed_3 = string3;
    }

    static {
        dm.cfr_renamed_3();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[4];
        90 = 0x10 ^ 0x4A;
        2 = "  ".length();
        5 = 0x1C ^ 0x4A ^ (0xE0 ^ 0xB3);
        33 = 0xCB ^ 0xBD ^ (0xD8 ^ 0x8F);
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        ci_0.cfr_renamed_0(graphics, this.var_fi_0_do.cfr_renamed_4, n, n2 + this.soLuong / 2 - bn_0.cfr_renamed_15 - bn_0.var_byte_new - 5, 33);
        GameCanvas.var_ew_case.cfr_renamed_0(graphics, this.cfr_renamed_1, n, n2 + this.soLuong / 2 - bn_0.cfr_renamed_15, 2);
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, this.cfr_renamed_3, n, n2 + this.soLuong / 2 - bn_0.cfr_renamed_15 - bn_0.var_byte_new, 2);
    }
}

