/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from aK
 */
final class ak_0
extends bp {
    private static int[] mangSoNguyen;
    private final gb_0 var_gb_0_do;

    public final void cfr_renamed_1() {
        if (ak_0.cfr_renamed_1(((bm)this.var_gb_0_do).cfr_renamed_3, this.var_gb_0_do.cfr_renamed_8)) {
            ((bm)this.var_gb_0_do).cfr_renamed_2 += this.var_gb_0_do.cfr_renamed_5;
            ((bm)this.var_gb_0_do).cfr_renamed_3 += this.var_gb_0_do.cfr_renamed_13;
            this.var_gb_0_do.cfr_renamed_13 += 1;
            return;
        }
        this.var_gb_0_do.cfr_renamed_5 = 0;
        this.var_gb_0_do.cfr_renamed_13 = 0;
    }

    public final void cfr_renamed_1(Graphics graphics) {
        v_0.cfr_renamed_1(((bm)this.var_gb_0_do).cfr_renamed_2 * dF.cfr_renamed_12, ((bm)this.var_gb_0_do).cfr_renamed_3 * dF.cfr_renamed_12, this.var_gb_0_do.cfr_renamed_4, this.var_gb_0_do.cfr_renamed_6, 5921542, graphics);
    }

    ak_0(gb_0 gb_02) {
        this.var_gb_0_do = gb_02;
    }

    static {
        ak_0.cfr_renamed_0();
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        5921542 = -(0xFFFFA439 & 0x7FDF) & (0xFFFFFF7E & 0x5A7F9F);
        1 = " ".length();
        0 = (0x9B ^ 0xB3) & ~(0x15 ^ 0x3D);
    }
}

