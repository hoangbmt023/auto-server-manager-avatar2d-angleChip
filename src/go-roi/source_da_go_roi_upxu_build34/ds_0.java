/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dS
 */
final class ds_0
implements cp {
    short var_short_do;
    byte var_byte_do;
    private String chuoiGiaTri;

    public ds_0(byte by2, short s2, String string) {
        this.var_byte_do = by2;
        this.var_short_do = s2;
        this.chuoiGiaTri = string;
    }

    public final void void_do() {
        GameCanvas.hienThongBaoPopup(this.chuoiGiaTri, new ds(this));
    }
}

