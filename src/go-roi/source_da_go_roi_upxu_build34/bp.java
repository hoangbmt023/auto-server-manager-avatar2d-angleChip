/*
 * Decompiled with CFR 0.152.
 */
final class bp
implements Runnable {
    private gz var_gz_do;
    private static int[] mangSoNguyen;

    bp(gz gz2) {
        this.var_gz_do = gz2;
    }

    static {
        bp.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        1 = " ".length();
        0 = (0x3B ^ 0x71) & ~(0x5D ^ 0x17);
    }

        public final void run() {
        block7: {
            try {
                Thread.sleep(20000L);
                }
            catch (InterruptedException interruptedException) {
                System.out.println("ERROR 1111111111");
            }
            if ("  ".length() < 0) {
                return;
            }
            if (!(this.var_gz_do.var_i_0_do.cfr_renamed_4)) break block7;
            try {
                i_0.javax_microedition_io_SocketConnection_do(this.var_gz_do.var_i_0_do).close();
                i_0.fy_0_do((i_0)this.var_gz_do.var_i_0_do).var_java_util_Vector_do.removeAllElements();
                }
            catch (Exception exception) {
                }
            if (" ".length() <= 0) {
                return;
            }
            i_0.cfr_renamed_3 = 1;
            this.var_gz_do.var_i_0_do.cfr_renamed_4 = 0;
            this.var_gz_do.var_i_0_do.coTrangThai = 0;
            this.var_gz_do.var_i_0_do.var_ft_0_do.cfr_renamed_3();
        }
    }
}

