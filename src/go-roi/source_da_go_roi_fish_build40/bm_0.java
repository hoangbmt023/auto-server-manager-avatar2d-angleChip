/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bM
 */
public final class bm_0
implements Runnable {
    final int cfr_renamed_1;

            public final void run() {
        TienIchGame.mangSoNguyen = null;
        fn.fn_do().cfr_renamed_0(go_0.var_byte_for);
        if ((TienIchGame.cfr_renamed_2(15000L))) {
            int n = TienIchGame.int_do();
            if ((n > 0) && (this.cfr_renamed_1 > n)) {
                TienIchGame.void_if("Map này không có khu " + this.cfr_renamed_1 + ". Khu lớn nhất là " + n);
                TienIchGame.mangSoNguyen = null;
                return;
            }
            TienIchGame.mangSoNguyen = null;
        }
        TienIchGame.void_if("Chuyển khu nhanh: " + this.cfr_renamed_1);
        fn.fn_do().cfr_renamed_3(go_0.var_byte_for, this.cfr_renamed_1);
    }

        public bm_0(int n) {
        this.cfr_renamed_1 = n;
    }
}

