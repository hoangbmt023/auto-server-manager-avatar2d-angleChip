/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

final class gz
implements Runnable {
    private static final int[] mangSoNguyen;
    final i_0 var_i_0_do;
    private final String chuoiGiaTri;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        0 = (0x27 ^ 0x1D) & ~(0x6E ^ 0x54);
        1 = " ".length();
        -27 = -(0x1B ^ 0x6F ^ (0x7E ^ 0x11));
    }

    public final void run() {
        i_0.cfr_renamed_3 = 0;
        new Thread(new bp(this)).start();
        this.var_i_0_do.cfr_renamed_4 = 1;
        this.var_i_0_do.coTrangThai = 1;
        try {
            i_0.cfr_renamed_0(this.var_i_0_do, (SocketConnection)Connector.open((String)this.chuoiGiaTri));
            i_0.cfr_renamed_0(this.var_i_0_do, i_0.javax_microedition_io_SocketConnection_do(this.var_i_0_do).openDataOutputStream());
            this.var_i_0_do.var_java_io_DataInputStream_do = i_0.javax_microedition_io_SocketConnection_do(this.var_i_0_do).openDataInputStream();
            new Thread(i_0.fy_0_do(this.var_i_0_do)).start();
            this.var_i_0_do.workerThread = new Thread(new be_0(this.var_i_0_do));
            this.var_i_0_do.workerThread.start();
            this.var_i_0_do.soXu = System.currentTimeMillis();
            i_0.cfr_renamed_0(this.var_i_0_do, new ad_0(-27));
            this.var_i_0_do.cfr_renamed_4 = 0;
            return;
        }
        catch (Exception exception) {
            try {
                Thread.sleep(500L);
                }
            catch (InterruptedException interruptedException) {
                }
            if (((172 + 73 - 240 + 171 ^ 28 + 111 - 37 + 41) & (0x7D ^ 0x65 ^ (0xBF ^ 0x98) ^ -" ".length())) != ((20 + 49 - -7 + 74 ^ 47 + 13 - 54 + 189) & (0xE5 ^ 0xAD ^ (0x3B ^ 0x26) ^ -" ".length()))) {
                return;
            }
            if ((i_0.cfr_renamed_3 ? 1 : 0 != null) && (this.var_i_0_do.var_ft_0_do != null)) {
                this.var_i_0_do.void_do();
                this.var_i_0_do.var_ft_0_do.cfr_renamed_3();
            }
            return;
        }
    }

    gz(i_0 i_02, String string) {
        this.var_i_0_do = i_02;
        this.chuoiGiaTri = string;
    }

    static {
        gz.cfr_renamed_0();
    }

        }

