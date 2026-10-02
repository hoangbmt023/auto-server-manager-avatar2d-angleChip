/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eV
 */
public final class ev_0
extends ea {
    private static int[] mangSoNguyen;
    public String chuoiGiaTri;
    public int soLuong;
    public int cfr_renamed_5;
    public int cfr_renamed_2;
    private int cfr_renamed_15 = 1;
    public String cfr_renamed_1;

    public final void cfr_renamed_0(int n) {
        this.cfr_renamed_5 += this.cfr_renamed_15;
        if ((this.cfr_renamed_5 > this.cfr_renamed_2 - n)) {
            this.cfr_renamed_5 = -20;
        }
    }

    public ev_0() {
        this.cfr_renamed_5 = 0;
        this.soLuong = 0;
    }

    static {
        ev_0.cfr_renamed_1();
    }

    public ev_0(int n, int n2, String string) {
        this.cfr_renamed_5 = 0;
        this.soLuong = 0;
        this.cfr_renamed_3 = n;
        this.var_int_if = n2;
        this.cfr_renamed_1 = string;
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        1 = " ".length();
        0 = (0xE ^ 0x39 ^ (0x4F ^ 0x39)) & (0x23 ^ 0x59 ^ (0xA7 ^ 0x9C) ^ -" ".length());
        -20 = -(0x6F ^ 0x1C ^ (0x79 ^ 0x1E));
    }

    public ev_0(String string, int n) {
        this.cfr_renamed_5 = 0;
        this.soLuong = 0;
        this.cfr_renamed_1 = string;
        this.cfr_renamed_2 = n;
    }
}

