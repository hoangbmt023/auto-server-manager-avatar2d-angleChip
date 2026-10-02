/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gF
 */
public final class gf_0 {
    private static final int[] mangSoNguyen;
    private static final Object var_java_lang_Object_do;
    public static boolean dangChayAuto;

        private static int (long l, long l2 != 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        1 = " ".length();
        0 = (0x4C ^ 0x39 ^ (0x46 ^ 0x17)) & (99 + 114 - 169 + 98 ^ 102 + 168 - 200 + 100 ^ -" ".length());
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
            if ("   ".length() == 0) {
                return;
            }
            dangChayAuto = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean boolean_do() {
        long l;
        block8: {
            dangChayAuto = 1;
            l = System.currentTimeMillis();
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                try {
                    var_java_lang_Object_do.wait(10000L);
                    }
                catch (InterruptedException interruptedException) {
                    break block8;
                }
                if (" ".length() < 0) {
                    return ((0x45 ^ 0x32 ^ (0xDC ^ 0xB2)) & (106 + 73 - 84 + 53 ^ 21 + 134 - 73 + 59 ^ -" ".length())) != 0;
                }
            }
        }
        if (-" ".length() >= 0) {
            return ((0xDA ^ 0x87 ^ (0x28 ^ 0x58)) & (0x92 ^ 0x8B ^ (0x66 ^ 0x52) ^ -" ".length())) != 0;
        }
        if ((dangChayAuto)) {
            dangChayAuto = 0;
        }
        if (gf_0.cfr_renamed_1((System.currentTimeMillis() - l, 10000L != 0))) {
            return 1;
        }
        return 0;
    }

        static {
        gf_0.cfr_renamed_1();
        dangChayAuto = 0;
        var_java_lang_Object_do = new Object();
    }
}

