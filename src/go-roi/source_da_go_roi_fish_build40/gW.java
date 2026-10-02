/*
 * Decompiled with CFR 0.152.
 */
public final class gW {
    private static final Object var_java_lang_Object_do;
    private static final int[] mangSoNguyen;
    public static boolean dangChayAuto;

        /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean boolean_do() {
        long l;
        block7: {
            dangChayAuto = 1;
            l = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(10000L);
                    }
                catch (InterruptedException interruptedException) {
                    break block7;
                }
                if (-"   ".length() >= 0) {
                    return ((41 + 147 - 47 + 21 ^ 22 + 142 - 125 + 156) & (0xF ^ 0x5C ^ (0x38 ^ 0xA) ^ -" ".length())) != 0;
                }
            }
        }
        if ((dangChayAuto)) {
            dangChayAuto = 0;
        }
        if (gW.cfr_renamed_0((System.currentTimeMillis() - l, 10000L != 0))) {
            return 1;
        }
        return 0;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        1 = " ".length();
        0 = (0xE1 ^ 0xA2 ^ (0x39 ^ 0x77)) & (0x7A ^ 0x33 ^ (0x3F ^ 0x7B) ^ -" ".length());
    }

    static {
        gW.cfr_renamed_0();
        dangChayAuto = 0;
        var_java_lang_Object_do = new Object();
    }

        /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_do() {
        if ((dangChayAuto)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if (((127 + 5 - 93 + 145 ^ 66 + 2 - -17 + 74) & (" ".length() ^ (0x7B ^ 0x5D) ^ -" ".length())) != 0) {
                return;
            }
            dangChayAuto = 0;
        }
    }

    private static int (long l, long l2 != 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

