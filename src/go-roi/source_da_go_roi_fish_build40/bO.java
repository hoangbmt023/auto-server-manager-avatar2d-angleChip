/*
 * Decompiled with CFR 0.152.
 */
final class bO
implements de {
    private gd_0 var_gd_0_do;
    private final bB var_bB_do;
    private static int[] mangSoNguyen;

    static {
        bO.cfr_renamed_0();
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        0 = (0xF2 ^ 0xAF) & ~(0x1E ^ 0x43);
        -1 = -" ".length();
        1 = " ".length();
    }

    bO(gd_0 gd_02, bB bB2) {
        this.var_gd_0_do = gd_02;
        this.var_bB_do = bB2;
    }

    public final void void_do() {
        if (bO.cfr_renamed_1(gd_0.cfr_renamed_1(this.var_gd_0_do, aa_0.gs_0_do((int)this.var_bB_do.cfr_renamed_0)) ? 1 : 0)) {
            return;
        }
        ep_0.ep_0_do().cfr_renamed_1(gd_0.fs_do((gd_0)this.var_gd_0_do).cfr_renamed_2, gd_0.fs_do((gd_0)this.var_gd_0_do).soLuong, gd_0.fs_do((gd_0)this.var_gd_0_do).var_int_if, gd_0.int_if(this.var_gd_0_do), gd_0.int_int(this.var_gd_0_do), this.var_bB_do.var_byte_do);
        gd_0.coTrangThai = 0;
        this.var_gd_0_do.soLuong = -1;
        gd_0.cfr_renamed_0(this.var_gd_0_do, -1);
        gd_0.dangChayAuto = 0;
        this.var_gd_0_do.cfr_renamed_2(this.var_bB_do);
        if ((gd_0.boolean_do(this.var_bB_do))) {
            this.var_bB_do.cfr_renamed_3 += 1;
        }
        fh.cfr_renamed_1(fh.var_java_util_Vector_char);
        gd_0.void_for(this.var_gd_0_do);
    }
}

