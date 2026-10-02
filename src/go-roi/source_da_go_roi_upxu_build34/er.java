/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

final class er
implements cp {
    private final dp_0 var_dp_0_do;
    private static int[] mangSoNguyen;

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        -1 = -" ".length();
    }

    static {
        er.cfr_renamed_1();
    }

    er(dp_0 dp_02) {
        this.var_dp_0_do = dp_02;
    }

        public final void void_do() {
        if ((this.var_dp_0_do.soLuong != -1)) {
            eq.eq_do().cfr_renamed_8(this.var_dp_0_do.soLuong);
            GameCanvas.cfr_renamed_5();
            return;
        }
        if ((this.var_dp_0_do.cfr_renamed_5 == 0) && !(this.var_dp_0_do.cfr_renamed_5.equals(""))) {
            AngelChip.cfr_renamed_0(this.var_dp_0_do.cfr_renamed_5);
            return;
        }
        AngelChip.cfr_renamed_0(this.var_dp_0_do.cfr_renamed_1, this.var_dp_0_do.cfr_renamed_4);
    }

        }

