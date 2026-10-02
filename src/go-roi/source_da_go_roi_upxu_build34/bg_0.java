/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bG
 */
public final class bg_0
implements Runnable {
    final int cfr_renamed_0;

    public final void run() {
        TienIchGame.mangSoNguyen = null;
        el_0.el_0_do().cfr_renamed_1(fe_0.var_byte_int);
        if ((TienIchGame.cfr_renamed_5(15000L))) {
            int n = TienIchGame.int_do();
            if ((n > 0) && (this.cfr_renamed_0 > n)) {
                TienIchGame.hienThongBao("Map này không có khu " + this.cfr_renamed_0 + ". Khu lớn nhất là " + n);
                TienIchGame.mangSoNguyen = null;
                return;
            }
            TienIchGame.mangSoNguyen = null;
        }
        TienIchGame.hienThongBao("Chuyển khu nhanh: " + this.cfr_renamed_0);
        el_0.el_0_do().cfr_renamed_4(fe_0.var_byte_int, this.cfr_renamed_0);
    }

                public bg_0(int n) {
        this.cfr_renamed_0 = n;
    }
}

