/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eW
 */
final class ew_0 {
    final dH var_dH_do;
    final String chuoiGiaTri;

    public final void cfr_renamed_0() {
        new Thread(new s_0(this)).start();
    }

    public ew_0(String string, dH dH2) {
        this.chuoiGiaTri = string;
        this.var_dH_do = dH2;
    }

    public final boolean cfr_renamed_0(String string) {
        return this.chuoiGiaTri.toLowerCase().trim().startsWith(string.toLowerCase().trim());
    }
}

