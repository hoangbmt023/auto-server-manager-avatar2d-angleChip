/*
 * Decompiled with CFR 0.152.
 */
final class bW
implements Runnable {
    private static int[] mangSoNguyen;
    private fa var_fa_do;

    bW(fa fa2) {
        this.var_fa_do = fa2;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        1 = " ".length();
        0 = (0x81 ^ 0xA3 ^ (0x1C ^ 0x66)) & (0x74 ^ 0x26 ^ (0xB8 ^ 0xB2) ^ -" ".length());
    }

    static {
        bW.cfr_renamed_1();
    }

        public final void run() {
        block7: {
            try {
                Thread.sleep(20000L);
                }
            catch (InterruptedException interruptedException) {
                System.out.println("ERROR 1111111111");
            }
            if (-(86 + 30 - 59 + 80 ^ 66 + 25 - -49 + 0) >= 0) {
                return;
            }
            if (!(this.var_fa_do.var_ae_do.dangChayAuto)) break block7;
            try {
                ae.javax_microedition_io_SocketConnection_do(this.var_fa_do.var_ae_do).close();
                ae.he_do((ae)this.var_fa_do.var_ae_do).var_java_util_Vector_do.removeAllElements();
                }
            catch (Exception exception) {
                }
            ae.cfr_renamed_3 = 1;
            this.var_fa_do.var_ae_do.dangChayAuto = 0;
            this.var_fa_do.var_ae_do.cfr_renamed_2 = 0;
            this.var_fa_do.var_ae_do.var_gv_do.cfr_renamed_2();
        }
    }
}

