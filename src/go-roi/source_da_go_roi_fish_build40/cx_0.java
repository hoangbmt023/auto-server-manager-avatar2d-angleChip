/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

/*
 * Renamed from cx
 */
final class cx_0
implements de {
    private static int[] mangSoNguyen;
    private final er var_er_do;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        -1 = -" ".length();
    }

        cx_0(er er2) {
        this.var_er_do = er2;
    }

        public final void void_do() {
        if ((this.var_er_do.soLuong != -1)) {
            ft_0.ft_0_do().cfr_renamed_6(this.var_er_do.soLuong);
            GameCanvas.cfr_renamed_8();
            return;
        }
        if ((this.var_er_do.cfr_renamed_4 != null) && (this.var_er_do.cfr_renamed_4.equals("") ? 1 : 0 != null)) {
            AngelChip.cfr_renamed_1(this.var_er_do.cfr_renamed_4);
            return;
        }
        AngelChip.cfr_renamed_1(this.var_er_do.cfr_renamed_0, this.var_er_do.cfr_renamed_2);
    }

        static {
        cx_0.cfr_renamed_0();
    }
}

