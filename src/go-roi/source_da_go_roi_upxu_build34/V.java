/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;

final class V
implements Enumeration {
    private int soLuong;
    private static final int[] mangSoNguyen;
    private final fs_0 var_fs_0_do;

    public final boolean hasMoreElements() {
        if ((this.soLuong < this.var_fs_0_do.var_java_util_Vector_do.size())) {
            return 1;
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final Object nextElement() {
        fs_0 fs_02 = this.var_fs_0_do;
        synchronized (fs_02) {
            if ((this.soLuong < this.var_fs_0_do.var_java_util_Vector_do.size())) {
                ae ae2 = (ae)this.var_fs_0_do.var_java_util_Vector_do.elementAt(this.soLuong);
                this.soLuong += 1;
                return ae2.cfr_renamed_1;
            }
            return null;
        }
    }

    static {
        V.cfr_renamed_0();
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        0 = (0x73 ^ 0x5D) & ~(0x1A ^ 0x34);
        1 = " ".length();
    }

    V(fs_0 fs_02) {
        this.var_fs_0_do = fs_02;
        this.soLuong = 0;
    }
}

