/*
 * Decompiled with CFR 0.152.
 */
public final class ch
implements de {
    private static final int[] mangSoNguyen;
    private final int soLuong;

    static {
        ch.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[10];
        1 = " ".length();
        0 = (0x4B ^ 0x40) & ~(0x82 ^ 0x89);
        2 = "  ".length();
        4 = 0x2D ^ 0x7E ^ (0xDC ^ 0x8B);
        3 = "   ".length();
        6 = 0xE ^ 0x5D ^ (0xC0 ^ 0x95);
        8 = 0xF ^ 7;
        5 = 0x43 ^ 0x33 ^ (0x32 ^ 0x47);
        12 = 0xB3 ^ 0xA2 ^ (0x36 ^ 0x2B);
        -1 = -" ".length();
    }

        public final void void_do() {
        fo.fo_do().void_if();
        int[] nArray = new int[1];
        nArray[0] = this.soLuong;
        AutoController.cfr_renamed_1(new al(nArray));
    }

                        public ch(int n) {
        this.soLuong = n;
    }

    public ch() {
    }

        /*
     * Unable to fully structure code
     */
    public static void void_do(byte[] var0) {
        var1_1 = 0;
        if (" ".length() > ((31 ^ 105 ^ (200 ^ 156)) & (54 ^ 97 ^ (15 ^ 122) ^ -" ".length()))) ** GOTO lbl18
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = var1_1 + 1;
            if ((28 ^ 64 ^ (54 ^ 110)) >= "  ".length()) ** GOTO lbl16
            return;
lbl-1000:
            // 1 sources

            {
                if ((var0[var1_1] > var0[var2_2])) {
                    var3_3 = var0[var1_1];
                    var0[var1_1] = var0[var2_2];
                    var0[var2_2] = var3_3;
                }
                ++var2_2;
lbl16:
                // 2 sources

                ** while (!ch.cfr_renamed_0((int)var2_2, (int)var0.length))
            }
lbl17:
            // 1 sources

            ++var1_1;
lbl18:
            // 2 sources

            ** while (!ch.cfr_renamed_0((int)var1_1, (int)(var0.length - 1)))
        }
lbl19:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    public static byte byte_do(byte[] var0) {
        block40: {
            block43: {
                block39: {
                    block42: {
                        block38: {
                            block41: {
                                if ((var0.length == 1)) {
                                    v0 = 1;
                                    if ("   ".length() == 0) {
                                        return (byte)((22 ^ 87 ^ (145 ^ 195)) & (21 + 72 - -87 + 4 ^ 107 + 68 - 110 + 106 ^ -" ".length()) & ((39 ^ 28 ^ (61 ^ 29)) & (53 ^ 18 ^ (128 ^ 188) ^ -" ".length()) ^ -" ".length()));
                                    }
                                } else {
                                    v0 = 0;
                                }
                                if ((v0 != 0)) {
                                    return 0;
                                }
                                var1_1 = var0;
                                if ((var0.length == 2) && (var1_1[0] / 4 == var1_1[1] / 4)) {
                                    v1 = 1;
                                    if (("   ".length() & ~"   ".length()) > (142 ^ 138)) {
                                        return (byte)((206 ^ 135) & ~(219 ^ 146));
                                    }
                                } else {
                                    v1 = 0;
                                }
                                if ((v1 != 0)) {
                                    return 2;
                                }
                                var1_1 = var0;
                                if ((var0.length == 3) && (var1_1[0] / 4 == var1_1[1] / 4) && (var1_1[1] / 4 == var1_1[2] / 4)) {
                                    v2 = 1;
                                    if (-(223 ^ 196 ^ (105 ^ 119)) >= 0) {
                                        return (byte)((127 + 126 - 107 + 42 ^ 174 + 16 - 74 + 65) & (40 + 17 - -38 + 37 ^ 82 + 139 - 123 + 43 ^ -" ".length()));
                                    }
                                } else {
                                    v2 = 0;
                                }
                                if ((v2 != 0)) {
                                    return 3;
                                }
                                var1_1 = var0;
                                if (!(var0.length != 6)) break block41;
                                v3 = 0;
                                break block38;
                            }
                            var2_2 = 1;
                            if ("  ".length() > ((253 ^ 199) & ~(21 ^ 47))) ** GOTO lbl62
                            return (byte)((18 ^ 67) & ~(114 ^ 35));
lbl-1000:
                            // 1 sources

                            {
                                if ((var2_2 % 2 == 1) && (var1_1[var2_2 - 1] / 4 != var1_1[var2_2] / 4)) {
                                    v3 = 0;
                                    if ("  ".length() < " ".length()) {
                                        return (byte)((5 ^ 9 ^ (92 ^ 22)) & (18 ^ 1 ^ (29 ^ 72) ^ -" ".length()));
                                    }
                                    break block38;
                                }
                                if ((var2_2 % 2 == 0) && (var1_1[var2_2 - 1] / 4 != var1_1[var2_2] / 4 - 1)) {
                                    v3 = 0;
                                    if (((27 ^ 34) & ~(23 ^ 46)) < 0) {
                                        return (byte)((37 ^ 126) & ~(198 ^ 157));
                                    }
                                    break block38;
                                }
                                ++var2_2;
lbl62:
                                // 2 sources

                                ** while (!ch.cfr_renamed_0((int)var2_2, (int)var1_1.length))
                            }
lbl63:
                            // 1 sources

                            v3 = 1;
                        }
                        if ((v3 != 0)) {
                            return 4;
                        }
                        var1_1 = var0;
                        if (!(var0.length != 8)) break block42;
                        v4 = 0;
                        break block39;
                    }
                    var2_2 = 1;
                    if ("   ".length() > "  ".length()) ** GOTO lbl96
                    return (byte)((194 ^ 147 ^ (197 ^ 133)) & (183 ^ 196 ^ (163 ^ 193) ^ -" ".length()));
lbl-1000:
                    // 1 sources

                    {
                        if ((var2_2 % 2 == 1) && (var1_1[var2_2 - 1] / 4 != var1_1[var2_2] / 4)) {
                            v4 = 0;
                            if ((97 + 145 - 210 + 156 ^ 52 + 63 - 2 + 71) > (79 + 100 - 75 + 32 ^ 60 + 6 - -45 + 29)) {
                                return (byte)((53 + 77 - 49 + 51 ^ 117 + 76 - 54 + 9) & (249 ^ 192 ^ (94 ^ 119) ^ -" ".length()));
                            }
                            break block39;
                        }
                        if ((var2_2 % 2 == 0) && (var1_1[var2_2 - 1] / 4 != var1_1[var2_2] / 4 - 1)) {
                            v4 = 0;
                            if ((27 ^ 31) < " ".length()) {
                                return (byte)((107 ^ 45) & ~(9 ^ 79));
                            }
                            break block39;
                        }
                        ++var2_2;
lbl96:
                        // 2 sources

                        ** while (!ch.cfr_renamed_0((int)var2_2, (int)var1_1.length))
                    }
lbl97:
                    // 1 sources

                    v4 = 1;
                }
                if ((v4 != 0)) {
                    return 5;
                }
                var1_1 = var0;
                if ((var0.length == 4) && (var1_1[0] / 4 == var1_1[1] / 4) && (var1_1[1] / 4 == var1_1[2] / 4) && (var1_1[2] / 4 == var1_1[3] / 4)) {
                    v5 = 1;
                    if ("   ".length() <= ((49 ^ 114) & ~(193 ^ 130))) {
                        return (byte)((223 ^ 129) & ~(36 ^ 122));
                    }
                } else {
                    v5 = 0;
                }
                if ((v5 != 0)) {
                    return 6;
                }
                var1_1 = var0;
                if (!(var0.length < 3)) break block43;
                v6 = 0;
                if (" ".length() >= "  ".length()) {
                    return (byte)((108 ^ 56 ^ (82 ^ 69)) & (225 ^ 181 ^ (88 ^ 79) ^ -" ".length()));
                }
                break block40;
            }
            var2_2 = 1;
            if (-(20 ^ 17) < 0) ** GOTO lbl134
            return (byte)((209 ^ 157) & ~(220 ^ 144));
lbl-1000:
            // 1 sources

            {
                if ((var1_1[var2_2 - 1] / 4 != var1_1[var2_2] / 4 - 1)) {
                    v6 = 0;
                    if (-(48 ^ 121 ^ (42 ^ 103)) > 0) {
                        return (byte)((87 ^ 78 ^ (39 ^ 22)) & (112 ^ 63 ^ (97 ^ 6) ^ -" ".length()));
                    }
                    break block40;
                }
                ++var2_2;
lbl134:
                // 2 sources

                ** while (!ch.cfr_renamed_0((int)var2_2, (int)var1_1.length))
            }
lbl135:
            // 1 sources

            if ((var1_1[var1_1.length - 1] / 4 == 12)) {
                v6 = 0;
                if (((59 ^ 39) & ~(83 ^ 79)) > 0) {
                    return (byte)((124 ^ 105) & ~(106 ^ 127));
                }
            } else {
                v6 = 1;
            }
        }
        if ((v6 != 0)) {
            return 1;
        }
        return -1;
    }
}

