/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Vector;

final class he
implements Runnable {
    private ae var_ae_do;
    final Vector var_java_util_Vector_do;
    private static int[] mangSoNguyen;

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        0 = (0x1B ^ 0x1C ^ (0x5C ^ 0x50)) & (0x67 ^ 0x3D ^ (0x35 ^ 0x64) ^ -" ".length());
    }

            public he(ae ae2) {
        this.var_ae_do = ae2;
        this.var_java_util_Vector_do = new Vector();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        try {
            if ("   ".length() == "  ".length()) {
                return;
            }
            while (true) {
                if (!(this.var_ae_do.cfr_renamed_2)) {
                    return;
                }
                if ((this.var_ae_do.coTrangThai)) {
                    if (((0x23 ^ 0x35 ^ (0x24 ^ 0x28)) & (0xDB ^ 0x9D ^ (0x11 ^ 0x4D) ^ -" ".length())) >= " ".length()) {
                        return;
                    }
                    while (!(this.var_java_util_Vector_do.size() <= 0)) {
                        bj bj2 = (bj)this.var_java_util_Vector_do.elementAt(0);
                        this.var_java_util_Vector_do.removeElementAt(0);
                        ae.cfr_renamed_1(this.var_ae_do, bj2);
                    }
                }
                try {
                    Thread.sleep(10L);
                    }
                catch (InterruptedException interruptedException) {
                    continue;
                }
                if ("   ".length() != "   ".length()) break;
            }
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    static {
        he.cfr_renamed_1();
    }
}

