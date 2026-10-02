/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class cU
extends aj_0 {
    private static int[] mangSoNguyen;
    private final fa var_fa_do;

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        5921542 = 0xFFFFFF2E & 0x5A5BD7;
        1 = " ".length();
        0 = (0x6E ^ 0x36) & ~(9 ^ 0x51);
    }

    public final void cfr_renamed_0(Graphics graphics) {
        k.cfr_renamed_0(((aG)this.var_fa_do).cfr_renamed_3 * bn_0.cfr_renamed_6, this.var_fa_do.var_int_if * bn_0.cfr_renamed_6, this.var_fa_do.cfr_renamed_12, this.var_fa_do.soLuong, 5921542, graphics);
    }

        public final void cfr_renamed_0() {
        if ((this.var_fa_do.var_int_if < this.var_fa_do.cfr_renamed_11)) {
            ((aG)this.var_fa_do).cfr_renamed_3 += this.var_fa_do.cfr_renamed_2;
            this.var_fa_do.var_int_if += this.var_fa_do.var_int_new;
            this.var_fa_do.var_int_new += 1;
            return;
        }
        this.var_fa_do.cfr_renamed_2 = 0;
        this.var_fa_do.var_int_new = 0;
    }

    static {
        cU.cfr_renamed_1();
    }

    cU(fa fa2) {
        this.var_fa_do = fa2;
    }
}

