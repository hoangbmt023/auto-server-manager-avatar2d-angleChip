/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bS
 */
final class bs_0
implements Runnable {
    private static final int[] mangSoNguyen;
    private final fu_0 var_fu_0_do;

    bs_0(fu_0 fu_02) {
        this.var_fu_0_do = fu_02;
    }

    static {
        bs_0.cfr_renamed_0();
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0x7E ^ 0x53) & ~(0x62 ^ 0x4F);
    }

    public final void run() {
        GameCanvas.cfr_renamed_5();
        int n = 0;
        while ((n < dy_0.var_java_util_Vector_do.size())) {
            ci_0.q_0_do((Short)dy_0.var_java_util_Vector_do.elementAt(n));
            ++n;
            if ("   ".length() == "   ".length()) continue;
            return;
        }
        TienIchGame.hienThongBao(2000L);
        GameCanvas.cfr_renamed_8();
        fu_0.cfr_renamed_0(this.var_fu_0_do);
    }
}

