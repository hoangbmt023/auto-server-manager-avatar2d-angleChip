/*
 * Decompiled with CFR 0.152.
 */
final class fy {
    final String chuoiGiaTri;
    final ej var_ej_do;

    public fy(String string, ej ej2) {
        this.chuoiGiaTri = string;
        this.var_ej_do = ej2;
    }

    public final boolean cfr_renamed_1(String string) {
        return this.chuoiGiaTri.toLowerCase().trim().startsWith(string.toLowerCase().trim());
    }

    public final void cfr_renamed_1() {
        new Thread(new ao_0(this)).start();
    }
}

