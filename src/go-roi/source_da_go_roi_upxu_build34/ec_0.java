/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eC
 */
final class ec_0
implements cp {
    private static int[] mangSoNguyen;
    private final byte var_byte_do;

        ec_0(byte by2) {
        this.var_byte_do = by2;
    }

    static {
        ec_0.cfr_renamed_1();
    }

    public final void void_do() {
        if ((this.var_byte_do == 0)) {
            eq.eq_do().this(1);
            if (((0x40 ^ 0x74) & ~(0xF0 ^ 0xC4)) != 0) {
                return;
            }
        } else {
            eq.eq_do().cfr_renamed_12(1);
        }
        GameCanvas.cfr_renamed_5();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        1 = " ".length();
    }
}

