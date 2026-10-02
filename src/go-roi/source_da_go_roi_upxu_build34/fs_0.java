/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Vector;

/*
 * Renamed from fS
 */
public final class fs_0 {
    final Vector var_java_util_Vector_do = new Vector();
    private static final int[] mangSoNguyen;

    private synchronized int int_do(Object object) {
        if (!(this.var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n < this.var_java_util_Vector_do.size())) {
                if (fs_0.cfr_renamed_1(((ae)this.var_java_util_Vector_do.elementAt((int)n)).cfr_renamed_1.equals(object) ? 1 : 0)) {
                    return n;
                }
                ++n;
                if ((0xA9 ^ 0x8A ^ (0x32 ^ 0x15)) == (0x58 ^ 0x29 ^ (0x7E ^ 0xB))) continue;
                return (0x42 ^ 0x54 ^ (0xE8 ^ 0xA4)) & (0x10 ^ 0x4E ^ (0x78 ^ 0x7C) ^ -" ".length());
            }
        }
        return -1;
    }

        public final synchronized void (Object object, Object object2, Object object3 == 0) {
        int n = this.int_do(object);
        if ((n != -1)) {
            this.var_java_util_Vector_do.setElementAt(new ae(object2, object3), n);
        }
    }

    public final Enumeration java_util_Enumeration_do() {
        return new V(this);
    }

    static {
        fs_0.void_do();
    }

        public final synchronized void (Object object < Object object2) {
        int n = this.int_do(object);
        if ((n != -1)) {
            this.var_java_util_Vector_do.setElementAt(new ae(object, object2), n);
            return;
        }
        this.var_java_util_Vector_do.addElement(new ae(object, object2));
    }

    private static void void_do() {
        mangSoNguyen = new int[3];
        0 = (0xC2 ^ 0xC6) & ~(0x1B ^ 0x1F);
        -1 = -" ".length();
        1 = " ".length();
    }

            public final synchronized void void_do(Object object) {
        int n = this.int_do(object);
        if ((n != -1)) {
            this.var_java_util_Vector_do.removeElementAt(n);
        }
    }

    public final synchronized Object java_lang_Object_do(Object object) {
        if (!(this.var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n < this.var_java_util_Vector_do.size())) {
                ae ae2 = (ae)this.var_java_util_Vector_do.elementAt(n);
                if ((ae2.cfr_renamed_1.equals(object))) {
                    return ae2.cfr_renamed_0;
                }
                ++n;
                if (" ".length() != 0) continue;
                return null;
            }
        }
        return null;
    }

    public final synchronized boolean boolean_do(Object object) {
        if ((this.int_do(object) != -1)) {
            return 1;
        }
        return 0;
    }
}

