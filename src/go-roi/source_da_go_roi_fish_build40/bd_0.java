/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bD
 */
final class bd_0
implements Runnable {
    private static final int[] mangSoNguyen;
    private final aI var_aI_do;

    public final void run() {
        GameCanvas.cfr_renamed_8();
        int n = 0;
        while ((n < dy_0.cfr_renamed_0.size())) {
            aa_0.am_do((Short)dy_0.cfr_renamed_0.elementAt(n));
            ++n;
            if ("  ".length() != "   ".length()) continue;
            return;
        }
        TienIchGame.void_if(2000L);
        GameCanvas.cfr_renamed_7();
        aI.cfr_renamed_1(this.var_aI_do);
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        0 = (0xFF ^ 0xB9 ^ (4 ^ 0x4C) & ~(0xF ^ 0x47)) & (0x73 ^ 0x7D ^ (0xF4 ^ 0xBC) ^ -" ".length());
    }

    static {
        bd_0.cfr_renamed_1();
    }

    bd_0(aI aI2) {
        this.var_aI_do = aI2;
    }
}

