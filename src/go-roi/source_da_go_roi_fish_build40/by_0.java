/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bY
 */
final class by_0
implements Runnable {
    private final hc var_hc_do;
    private static final int[] mangSoNguyen;

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        0 = (226 + 5 - 94 + 103 ^ 89 + 51 - -14 + 11) & (0xE2 ^ 0x9B ^ (0x91 ^ 0xBD) ^ -" ".length());
    }

    public final void run() {
        GameCanvas.cfr_renamed_8();
        int n = 0;
        while ((n < dy_0.var_java_util_Vector_do.size())) {
            aa_0.am_do((Short)dy_0.var_java_util_Vector_do.elementAt(n));
            ++n;
            if (((0xF2 ^ 0xAE ^ (0x26 ^ 0x43)) & (0x62 ^ 0x5A ^ " ".length() ^ -" ".length())) == ("  ".length() & ("  ".length() ^ -" ".length()))) continue;
            return;
        }
        TienIchGame.void_if(2000L);
        GameCanvas.cfr_renamed_7();
        hc.cfr_renamed_1(this.var_hc_do);
    }

    by_0(hc hc2) {
        this.var_hc_do = hc2;
    }

    static {
        by_0.cfr_renamed_1();
    }

    }

