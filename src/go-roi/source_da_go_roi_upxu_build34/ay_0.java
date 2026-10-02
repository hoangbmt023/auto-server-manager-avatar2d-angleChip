/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aY
 */
final class ay_0
implements cp {
    private fe var_fe_do;
    private final aU var_aU_do;
    private static int[] mangSoNguyen;

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        0 = (0x62 ^ 0x78) & ~(0xD8 ^ 0xC2);
        -1 = -" ".length();
        1 = " ".length();
    }

    public final void void_do() {
        if (ay_0.cfr_renamed_0(fe.cfr_renamed_0(this.var_fe_do, ci_0.fi_0_do((int)this.var_aU_do.cfr_renamed_1)) ? 1 : 0)) {
            return;
        }
        db_0.db_0_do().cfr_renamed_0(fe.eq_0_do((fe)this.var_fe_do).cfr_renamed_3, fe.eq_0_do((fe)this.var_fe_do).var_int_if, fe.eq_0_do((fe)this.var_fe_do).soLuong, fe.int_if(this.var_fe_do), fe.int_do(this.var_fe_do), this.var_aU_do.var_byte_do);
        fe.dangChayAuto = 0;
        this.var_fe_do.soLuongKhoa = -1;
        fe.cfr_renamed_1(this.var_fe_do, -1);
        fe.coTrangThai = 0;
        this.var_fe_do.cfr_renamed_3(this.var_aU_do);
        if ((fe.boolean_do(this.var_aU_do))) {
            this.var_aU_do.var_int_if += 1;
        }
        ef_0.cfr_renamed_0(ef_0.var_java_util_Vector_new);
        fe.void_if(this.var_fe_do);
    }

    static {
        ay_0.cfr_renamed_1();
    }

    ay_0(fe fe2, aU aU2) {
        this.var_fe_do = fe2;
        this.var_aU_do = aU2;
    }

    }

