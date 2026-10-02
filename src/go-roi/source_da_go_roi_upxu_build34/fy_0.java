/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Vector;

/*
 * Renamed from fY
 */
final class fy_0
implements Runnable {
    private static int[] mangSoNguyen;
    private i_0 var_i_0_do;
    final Vector var_java_util_Vector_do;

    public fy_0(i_0 i_02) {
        this.var_i_0_do = i_02;
        this.var_java_util_Vector_do = new Vector();
    }

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0xDA ^ 0x86) & ~(0xC0 ^ 0x9C);
    }

    static {
        fy_0.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        try {
            if ("  ".length() == "   ".length()) {
                return;
            }
            while (true) {
                if (!(this.var_i_0_do.coTrangThai)) {
                    return;
                }
                if ((this.var_i_0_do.dangChayAuto)) {
                    if (" ".length() > "  ".length()) {
                        return;
                    }
                    while (!(this.var_java_util_Vector_do.size() <= 0)) {
                        ad_0 ad_02 = (ad_0)this.var_java_util_Vector_do.elementAt(0);
                        this.var_java_util_Vector_do.removeElementAt(0);
                        i_0.cfr_renamed_0(this.var_i_0_do, ad_02);
                    }
                }
                try {
                    Thread.sleep(10L);
                    }
                catch (InterruptedException interruptedException) {
                    continue;
                }
                if (((5 + 72 - -39 + 66 ^ 64 + 156 - 185 + 135) & (0xDC ^ 0xC6 ^ (0x13 ^ 0x15) ^ -" ".length())) < 0) break;
            }
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    }

