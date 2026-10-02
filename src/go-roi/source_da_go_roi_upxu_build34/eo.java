/*
 * Decompiled with CFR 0.152.
 */
final class eo
implements cp {
    private final short var_short_do;
    private static final int[] mangSoNguyen;

    static {
        eo.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        1 = " ".length();
    }

    public eo(short s2) {
        this.var_short_do = s2;
    }

    public final void void_do() {
        GameCanvas.var_dZ_do.cfr_renamed_0("Nhập số lượng:", new at_0(this.var_short_do), 1);
    }
}

