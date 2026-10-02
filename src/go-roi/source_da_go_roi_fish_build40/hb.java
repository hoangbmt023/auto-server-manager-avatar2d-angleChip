/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Vector;

public final class hb {
    final Vector var_java_util_Vector_do = new Vector();
    private static final int[] mangSoNguyen;

    public final synchronized void void_do(Object object) {
        int n = this.int_do(object);
        if ((n != -1)) {
            this.var_java_util_Vector_do.removeElementAt(n);
        }
    }

    public final synchronized void (Object object < Object object2) {
        int n = this.int_do(object);
        if ((n != -1)) {
            this.var_java_util_Vector_do.setElementAt(new cd(object, object2), n);
            return;
        }
        this.var_java_util_Vector_do.addElement(new cd(object, object2));
    }

    static {
        hb.void_do();
    }

    public final Enumeration java_util_Enumeration_do() {
        return new ah(this);
    }

    private synchronized int int_do(Object object) {
        if (!(this.var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n < this.var_java_util_Vector_do.size())) {
                if (hb.cfr_renamed_1(((cd)this.var_java_util_Vector_do.elementAt((int)n)).cfr_renamed_1.equals(object) ? 1 : 0)) {
                    return n;
                }
                ++n;
                if ((0x31 ^ 0x35) >= 0) continue;
                return (0x51 ^ 4) & ~(0x39 ^ 0x6C);
            }
        }
        return -1;
    }

        private static void void_do() {
        mangSoNguyen = new int[3];
        0 = (0x9F ^ 0xB0 ^ (0x2B ^ 0x1C)) & (0x29 ^ 0x45 ^ (0x50 ^ 0x24) ^ -" ".length());
        -1 = -" ".length();
        1 = " ".length();
    }

            public final synchronized boolean boolean_do(Object object) {
        if ((this.int_do(object) != -1)) {
            return 1;
        }
        return 0;
    }

        public final synchronized void (Object object, Object object2, Object object3 != 0) {
        int n = this.int_do(object);
        if ((n != -1)) {
            this.var_java_util_Vector_do.setElementAt(new cd(object2, object3), n);
        }
    }

    public final synchronized Object java_lang_Object_do(Object object) {
        if (!(this.var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n < this.var_java_util_Vector_do.size())) {
                cd cd2 = (cd)this.var_java_util_Vector_do.elementAt(n);
                if ((cd2.cfr_renamed_1.equals(object))) {
                    return cd2.cfr_renamed_0;
                }
                ++n;
                if (" ".length() != 0) continue;
                return null;
            }
        }
        return null;
    }
}

