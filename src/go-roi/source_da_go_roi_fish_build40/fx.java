/*
 * Decompiled with CFR 0.152.
 */
public final class fx
extends fd_0 {
    private static int[] mangSoNguyen;
    public int soLuong;
    public String chuoiGiaTri;
    public int cfr_renamed_4;
    private int cfr_renamed_6 = 1;
    public int cfr_renamed_5 = 0;
    public String cfr_renamed_0;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        1 = " ".length();
        0 = (0xCA ^ 0x9C) & ~(0xC8 ^ 0x9E);
        -20 = -(0x7A ^ 0x6E);
    }

    public fx() {
        this.cfr_renamed_4 = 0;
    }

    public fx(int n, int n2, String string) {
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_2 = n;
        this.cfr_renamed_3 = n2;
        this.chuoiGiaTri = string;
    }

    public final void cfr_renamed_1(int n) {
        this.cfr_renamed_5 += this.cfr_renamed_6;
        if ((this.cfr_renamed_5 > this.soLuong - n)) {
            this.cfr_renamed_5 = -20;
        }
    }

    public fx(String string, int n) {
        this.cfr_renamed_4 = 0;
        this.chuoiGiaTri = string;
        this.soLuong = n;
    }

    static {
        fx.cfr_renamed_0();
    }

    }

