/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

final class fa
implements Runnable {
    private static final int[] mangSoNguyen;
    private final String chuoiGiaTri;
    final ae var_ae_do;

    fa(ae ae2, String string) {
        this.var_ae_do = ae2;
        this.chuoiGiaTri = string;
    }

        public final void run() {
        ae.cfr_renamed_3 = 0;
        new Thread(new bW(this)).start();
        this.var_ae_do.dangChayAuto = 1;
        this.var_ae_do.cfr_renamed_2 = 1;
        try {
            ae.cfr_renamed_1(this.var_ae_do, (SocketConnection)Connector.open((String)this.chuoiGiaTri));
            ae.cfr_renamed_1(this.var_ae_do, ae.javax_microedition_io_SocketConnection_do(this.var_ae_do).openDataOutputStream());
            this.var_ae_do.var_java_io_DataInputStream_do = ae.javax_microedition_io_SocketConnection_do(this.var_ae_do).openDataInputStream();
            new Thread(ae.he_do(this.var_ae_do)).start();
            this.var_ae_do.workerThread = new Thread(new bU(this.var_ae_do));
            this.var_ae_do.workerThread.start();
            this.var_ae_do.soXu = System.currentTimeMillis();
            ae.cfr_renamed_1(this.var_ae_do, new bj(-27));
            this.var_ae_do.dangChayAuto = 0;
            return;
        }
        catch (Exception exception) {
            try {
                Thread.sleep(500L);
                }
            catch (InterruptedException interruptedException) {
                }
            if ((0x96 ^ 0x92) == " ".length()) {
                return;
            }
            if ((ae.cfr_renamed_3 ? 1 : 0 != null) && (this.var_ae_do.var_gv_do != null)) {
                this.var_ae_do.void_do();
                this.var_ae_do.var_gv_do.cfr_renamed_2();
            }
            return;
        }
    }

    static {
        fa.cfr_renamed_1();
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        0 = (2 ^ 0x4A) & ~(0x1C ^ 0x54) & ~((0x92 ^ 0xA8) & ~(0xE ^ 0x34));
        1 = " ".length();
        -27 = -(6 ^ 0x1D);
    }
}

