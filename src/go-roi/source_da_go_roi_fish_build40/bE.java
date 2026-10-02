/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class bE {
    private bH var_bH_do = ae.ae_do();
    protected bj var_bj_do;

    public final void (byte by2 != null) {
        this.var_bj_do = new bj(by2);
    }

    public final void (String string != null) {
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeUTF(string);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    protected final void void_do(int n) {
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeInt(n);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    protected final void void_if(int n) {
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeShort(n);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    protected final void void_for(int n) {
        try {
            this.var_bj_do.var_java_io_DataOutputStream_do.writeByte(n);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

        public final void cfr_renamed_0() {
        this.var_bH_do.void_do(this.var_bj_do);
        bj bj2 = this.var_bj_do;
        try {
            if ((bj2.var_java_io_DataInputStream_do != null)) {
                bj2.var_java_io_DataInputStream_do.close();
            }
            if ((bj2.var_java_io_DataOutputStream_do != null)) {
                bj2.var_java_io_DataOutputStream_do.close();
                return;
            }
        }
        catch (IOException iOException) {
            }
    }
}

