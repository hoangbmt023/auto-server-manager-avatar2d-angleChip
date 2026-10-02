/*
 * Decompiled with CFR 0.152.
 */
public final class ab {
    private static int var_int_if;
    public static int soLuong;
    private static final String[] var_java_lang_String_arr_do;
    private static final String[] var_java_lang_String_arr_if;
    private static final int[] mangSoNguyen;

    private static int cfr_renamed_1(char c2) {
        int n = 0;
        while ((n < "aeoiyuăâêôơưAEOIYUĂÂÊÔƠƯ".length())) {
            if (("aeoiyuăâêôơưAEOIYUĂÂÊÔƠƯ".charAt(n) == c2)) {
                return n;
            }
            ++n;
            if (((9 ^ 3) & ~(0xA2 ^ 0xA8)) < " ".length()) continue;
            return (0xE ^ 0x39) & ~(0x7E ^ 0x49);
        }
        return -1;
    }

        static {
        ab.cfr_renamed_1();
        String[] stringArray = new String[2];
        stringArray[0] = "sfrxj";
        stringArray[1] = "12345";
        var_java_lang_String_arr_do = stringArray;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "waeowwdWAEOWWD";
        stringArray2[1] = "86667798666779";
        var_java_lang_String_arr_if = stringArray2;
        var_int_if = 0;
        soLuong = QuanLyRMS.int_do("Unicode");
    }

            public static void void_do(int n) {
        soLuong = n;
        QuanLyRMS.docDuLieu("Unicode", soLuong);
    }

        private static boolean boolean_do(int n) {
        return n > 0;
    }

            private static void cfr_renamed_1() {
        mangSoNguyen = new int[5];
        1 = " ".length();
        2 = "  ".length();
        32 = 0x6F ^ 4 ^ (0xDF ^ 0x94);
        0 = (112 + 80 - 33 + 55 ^ 80 + 78 - 92 + 68) & (0x2E ^ 0x34 ^ (0xC2 ^ 0x88) ^ -" ".length());
        -1 = -" ".length();
    }

    public static String cfr_renamed_1(String string) {
        if ((soLuong != 1) && (soLuong != 2)) {
            return string;
        }
        int n = string.length();
        if ((var_int_if != n)) {
            var_int_if = n;
            if ((n >= 2)) {
                int n2;
                int n3 = string.lastIndexOf(32);
                if ((n3 >= 0)) {
                    n2 = n3 + 1;
                    if (((4 ^ 9) & ~(0x1A ^ 0x17)) < ((5 ^ 0x14) & ~(0x30 ^ 0x21))) {
                        return null;
                    }
                } else {
                    n2 = n3 = 0;
                }
                if ((n2 < n)) {
                    int n4 = soLuong - 1;
                    String string2 = string.substring(n3, n);
                    int n5 = string2.length();
                    if ((n5 >= 2)) {
                        char c2;
                        char c3;
                        char c4;
                        int n6;
                        int n7;
                        block27: {
                            n7 = n5 - 1;
                            n6 = n4;
                            c4 = string2.charAt(n7);
                            c3 = 0;
                            while ((c3 < var_java_lang_String_arr_do[n6].length())) {
                                if ((var_java_lang_String_arr_do[n6].charAt(c3) == c4)) {
                                    c2 = c3;
                                    if (-" ".length() == ((1 + 13 - -57 + 101 ^ 143 + 149 - 208 + 70) & (38 + 97 - 93 + 105 ^ 68 + 25 - -68 + 4 ^ -" ".length()))) {
                                        return null;
                                    }
                                    break block27;
                                }
                                ++c3;
                                return null;
                            }
                            c2 = c4 = -1;
                        }
                        if ((c2 >= 0)) {
                            if ((n7 < 2)) {
                                char c5 = string2.charAt(0);
                                c3 = c5;
                                n6 = ab.cfr_renamed_1(c5);
                                if ((n6 != -1)) {
                                    c4 = "áàảãạéèẻẽẹóòỏõọíìỉĩịýỳỷỹỵúùủũụắằẳẵặấầẩẫậếềểễệốồổỗộớờởỡợứừửữựÁÀẢÃẠÉÈẺẼẸÓÒỎÕỌÍÌỈĨỊÝỲỶỸỴÚÙỦŨỤẮẰẲẴẶẤẦẨẪẬẾỀỂỄỆỐỒỔỖỘỚỜỞỠỢỨỪỬỮỰ".charAt(n6 * var_java_lang_String_arr_do[n4].length() + c4);
                                    String string3 = string2.substring(0, n7).replace(c3, c4);
                                    if (ab.boolean_do(n3)) {
                                        return string.substring(0, n3) + string3;
                                    }
                                    return string3;
                                }
                                return string;
                            }
                            if (!ab.cfr_renamed_2(ab.cfr_renamed_1(string2.charAt(n7 - 1))) || (n7 > 2)) {
                                n = n7 - 2;
                                while ((n >= 0)) {
                                    char c6 = string2.charAt(n);
                                    c3 = c6;
                                    n6 = ab.cfr_renamed_1(c6);
                                    if ((n6 != -1)) {
                                        c4 = "áàảãạéèẻẽẹóòỏõọíìỉĩịýỳỷỹỵúùủũụắằẳẵặấầẩẫậếềểễệốồổỗộớờởỡợứừửữựÁÀẢÃẠÉÈẺẼẸÓÒỎÕỌÍÌỈĨỊÝỲỶỸỴÚÙỦŨỤẮẰẲẴẶẤẦẨẪẬẾỀỂỄỆỐỒỔỖỘỚỜỞỠỢỨỪỬỮỰ".charAt(n6 * var_java_lang_String_arr_do[n4].length() + c4);
                                        String string4 = string2.substring(0, n5 - 1).replace(c3, c4);
                                        if (ab.boolean_do(n3)) {
                                            return string.substring(0, n3) + string4;
                                        }
                                        return string4;
                                    }
                                    --n;
                                    if (-" ".length() < ((0xE0 ^ 0xBD) & ~(0xE4 ^ 0xB9))) continue;
                                    return null;
                                }
                                if (" ".length() != " ".length()) {
                                    return null;
                                }
                            } else {
                                n = 0;
                                while ((n < n7)) {
                                    char c7 = string2.charAt(n);
                                    c3 = c7;
                                    n6 = ab.cfr_renamed_1(c7);
                                    if ((n6 != -1)) {
                                        c4 = "áàảãạéèẻẽẹóòỏõọíìỉĩịýỳỷỹỵúùủũụắằẳẵặấầẩẫậếềểễệốồổỗộớờởỡợứừửữựÁÀẢÃẠÉÈẺẼẸÓÒỎÕỌÍÌỈĨỊÝỲỶỸỴÚÙỦŨỤẮẰẲẴẶẤẦẨẪẬẾỀỂỄỆỐỒỔỖỘỚỜỞỠỢỨỪỬỮỰ".charAt(n6 * var_java_lang_String_arr_do[n4].length() + c4);
                                        String string5 = string2.substring(0, n7).replace(c3, c4);
                                        if (ab.boolean_do(n3)) {
                                            return string.substring(0, n3) + string5;
                                        }
                                        return string5;
                                    }
                                    ++n;
                                    if (" ".length() != -" ".length()) continue;
                                    return null;
                                }
                            }
                            return string;
                        }
                        String string6 = string2.substring(n5 - 2, n5);
                        c4 = 0;
                        while ((c4 < "aaeooudAAEOOUD".length())) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("aaeooudAAEOOUD".charAt(c4));
                            stringBuffer.append(var_java_lang_String_arr_if[n4].charAt(c4));
                            if (ab.cfr_renamed_0(string6.equals(stringBuffer.toString()) ? 1 : 0)) {
                                String string7 = String.valueOf("ăâêôơưđĂÂÊÔƠƯĐ".charAt(c4));
                                if ((n == 2)) {
                                    return string7;
                                }
                                return string.substring(0, n - 2) + string7;
                            }
                            ++c4;
                            if (-" ".length() <= ((0x22 ^ 0x63) & ~(0xC7 ^ 0x86))) continue;
                            return null;
                        }
                    }
                }
            }
            return string;
        }
        return string;
    }

    }

