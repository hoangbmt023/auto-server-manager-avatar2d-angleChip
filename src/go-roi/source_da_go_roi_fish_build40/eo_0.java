/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eO
 */
public final class eo_0 {
    private static final byte[] var_byte_arr_do;
    private static final int[] mangSoNguyen;

        static {
        eo_0.cfr_renamed_1();
        var_byte_arr_do = new byte[64];
        int n = 0;
        while ((n < 64)) {
            byte by2;
            eo_0.var_byte_arr_do[n] = by2 = (byte)"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(n);
            ++n;
            break;
        }
    }

    public static byte[] (String string != 0) {
        String string2;
        int n;
        int n2;
        if ((string.indexOf(10) != -1)) {
            StringBuffer stringBuffer = new StringBuffer();
            n2 = 0;
            while ((n2 < string.length())) {
                n = string.charAt(n2);
                if ((n != 10)) {
                    stringBuffer.append((char)n);
                    }
                ++n2;
                if (-"  ".length() <= 0) continue;
                return null;
            }
            string2 = stringBuffer.toString();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        } else {
            string2 = string;
        }
        string = string2;
        int n3 = 0;
        if ((string.endsWith("="))) {
            ++n3;
        }
        if ((string.endsWith("=="))) {
            ++n3;
        }
        byte[] byArray = new byte[(string.length() + 3) / 4 * 3 - n3];
        n2 = 0;
        try {
            int n4;
            n = 0;
            while ((n < string.length()) && eo_0.cfr_renamed_0(n4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".indexOf(string.charAt(n)), -1)) {
                switch (n % 4) {
                    case 0: {
                        byArray[n2] = (byte)(n4 << 2);
                        if (((0xAF ^ 0x99) & ~(0x96 ^ 0xA0)) <= "   ".length()) break;
                        return null;
                    }
                    case 1: {
                        int n5 = n2++;
                        byArray[n5] = (byte)(byArray[n5] | (byte)(n4 >> 4 & 3));
                        byArray[n2] = (byte)(n4 << 4);
                        if (((0xAA ^ 0x9C ^ (0x71 ^ 0x52)) & (51 + 19 - -35 + 44 ^ 28 + 0 - -56 + 44 ^ -" ".length())) == 0) break;
                        return null;
                    }
                    case 2: {
                        int n6 = n2++;
                        byArray[n6] = (byte)(byArray[n6] | (byte)(n4 >> 2 & 15));
                        byArray[n2] = (byte)(n4 << 6);
                        if ("  ".length() >= 0) break;
                        return null;
                    }
                    case 3: {
                        int n7 = n2++;
                        byArray[n7] = (byte)(byArray[n7] | (byte)(n4 & 63));
                    }
                }
                ++n;
                if (-"   ".length() <= 0) continue;
                return null;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            }
        if ((0xBB ^ 0xBF) <= 0) {
            return null;
        }
        return byArray;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[10];
        10 = 0x17 ^ 0x1D;
        -1 = -" ".length();
        0 = (152 + 88 - 152 + 75 ^ 54 + 43 - 40 + 72) & (147 + 169 - 277 + 138 ^ 83 + 97 - 91 + 58 ^ -" ".length());
        3 = "   ".length();
        4 = 0x6C ^ 0x54 ^ (6 ^ 0x3A);
        2 = "  ".length();
        15 = 0x48 ^ 0x6A ^ (0x90 ^ 0xBD);
        6 = 0x42 ^ 0x32 ^ (0xD7 ^ 0xA1);
        63 = 0xA0 ^ 0x90 ^ (0x8F ^ 0x80);
        64 = 0x3A ^ 0x7A;
    }

        }

