/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;

final class ah
implements Enumeration {
    private final hb var_hb_do;
    private static final int[] mangSoNguyen;
    private int soLuong;

    public final boolean hasMoreElements() {
        if ((this.soLuong < this.var_hb_do.var_java_util_Vector_do.size())) {
            return 1;
        }
        return 0;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        0 = (0x5D ^ 0x68 ^ (0x8F ^ 0x9D)) & (0x54 ^ 0xF ^ (0xC8 ^ 0xB4) ^ -" ".length());
        1 = " ".length();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final Object nextElement() {
        hb hb2 = this.var_hb_do;
        synchronized (hb2) {
            if ((this.soLuong < this.var_hb_do.var_java_util_Vector_do.size())) {
                cd cd2 = (cd)this.var_hb_do.var_java_util_Vector_do.elementAt(this.soLuong);
                this.soLuong += 1;
                return cd2.cfr_renamed_1;
            }
            return null;
        }
    }

        ah(hb hb2) {
        this.var_hb_do = hb2;
        this.soLuong = 0;
    }

    static {
        ah.cfr_renamed_1();
    }
}

