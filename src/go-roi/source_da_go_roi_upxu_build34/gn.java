/*
 * Decompiled with CFR 0.152.
 */
public final class gn {
    private static final byte[] var_byte_arr_do;
    private static final int[] mangSoNguyen;

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[10];
        10 = 0x31 ^ 0x3B;
        -1 = -" ".length();
        0 = "  ".length() & ~"  ".length();
        3 = "   ".length();
        4 = 0x63 ^ 0x67;
        2 = "  ".length();
        15 = 0x2E ^ 0x21;
        6 = 0x28 ^ 8 ^ (0x6A ^ 0x4C);
        63 = 0xE9 ^ 0x80 ^ (0x2D ^ 0x7B);
        64 = 0x6F ^ 0x2F;
    }

    static {
        gn.cfr_renamed_0();
        var_byte_arr_do = new byte[64];
        int n = 0;
        while ((n < 64)) {
            byte by2;
            gn.var_byte_arr_do[n] = by2 = (byte)"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(n);
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
                if (-" ".length() < ((0x87 ^ 0x81) & ~(0xB9 ^ 0xBF) ^ (0xC2 ^ 0xC6))) continue;
                return null;
            }
            string2 = stringBuffer.toString();
            if (" ".length() == 0) {
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
            while ((n < string.length()) && gn.cfr_renamed_0(n4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".indexOf(string.charAt(n)), -1)) {
                switch (n % 4) {
                    case 0: {
                        byArray[n2] = (byte)(n4 << 2);
                        if ((69 + 63 - 106 + 123 ^ 1 + 69 - -16 + 59) != 0) break;
                        return null;
                    }
                    case 1: {
                        int n5 = n2++;
                        byArray[n5] = (byte)(byArray[n5] | (byte)(n4 >> 4 & 3));
                        byArray[n2] = (byte)(n4 << 4);
                        if ((138 + 26 - 2 + 11 ^ 125 + 123 - 229 + 150) == (50 + 170 - 177 + 147 ^ 63 + 24 - 16 + 115)) break;
                        return null;
                    }
                    case 2: {
                        int n6 = n2++;
                        byArray[n6] = (byte)(byArray[n6] | (byte)(n4 >> 2 & 15));
                        byArray[n2] = (byte)(n4 << 6);
                        if (((62 + 197 - 144 + 88 ^ 112 + 39 - 58 + 64) & (113 + 211 - 297 + 194 ^ 12 + 49 - -4 + 74 ^ -" ".length())) <= ((103 + 54 - 128 + 98 ^ (0xFA ^ 0xB5)) & (0x7F ^ 0x43 ^ (0x6F ^ 0x63) ^ -" ".length()))) break;
                        return null;
                    }
                    case 3: {
                        int n7 = n2++;
                        byArray[n7] = (byte)(byArray[n7] | (byte)(n4 & 63));
                    }
                }
                ++n;
                if (((28 + 104 - 125 + 157 ^ 91 + 164 - 120 + 56) & (0x8B ^ 0x8D ^ (0x85 ^ 0x98) ^ -" ".length())) >= 0) continue;
                return null;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            }
        if (" ".length() < 0) {
            return null;
        }
        return byArray;
    }

    }

