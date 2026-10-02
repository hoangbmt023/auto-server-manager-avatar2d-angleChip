/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from aX
 */
public class ax_0 {
    private ba var_ba_do = i_0.i_0_do();
    protected ad_0 var_ad_0_do;

    protected final void void_do(int n) {
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeInt(n);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

        protected final void void_if(int n) {
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeShort(n);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    protected final void void_for(int n) {
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeByte(n);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public final void (byte by2 != null) {
        this.var_ad_0_do = new ad_0(by2);
    }

    public final void (String string != null) {
        try {
            this.var_ad_0_do.var_java_io_DataOutputStream_do.writeUTF(string);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public final void cfr_renamed_1() {
        this.var_ba_do.void_do(this.var_ad_0_do);
        ad_0 ad_02 = this.var_ad_0_do;
        try {
            if ((ad_02.var_java_io_DataInputStream_do != null)) {
                ad_02.var_java_io_DataInputStream_do.close();
            }
            if ((ad_02.var_java_io_DataOutputStream_do != null)) {
                ad_02.var_java_io_DataOutputStream_do.close();
                return;
            }
        }
        catch (IOException iOException) {
            }
    }
}

