/*
 * Decompiled with CFR 0.152.
 */
final class bx
implements Runnable {
    private final aI var_aI_do;
    private static final int[] mangSoNguyen;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0x2D ^ 0x62) & ~(0x57 ^ 0x18);
    }

    static {
        bx.cfr_renamed_0();
    }

    bx(aI aI2) {
        this.var_aI_do = aI2;
    }

    public final void run() {
        GameCanvas.cfr_renamed_5();
        int n = 0;
        while ((n < dy_0.cfr_renamed_1.size())) {
            ci_0.q_0_do((Short)dy_0.cfr_renamed_1.elementAt(n));
            ++n;
            if ("  ".length() == "  ".length()) continue;
            return;
        }
        TienIchGame.hienThongBao(2000L);
        GameCanvas.cfr_renamed_8();
        aI.cfr_renamed_0(this.var_aI_do);
    }

    }

