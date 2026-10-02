/*
 * Decompiled with CFR 0.152.
 */
public final class P {
    private static final String[] var_java_lang_String_arr_do;
    private static int var_int_if;
    private static final String[] var_java_lang_String_arr_if;
    private static final int[] mangSoNguyen;
    public static int soLuong;

        public static void void_do(int n) {
        soLuong = n;
        QuanLyRMS.luuDuLieu("Unicode", soLuong);
    }

        public static String cfr_renamed_0(String string) {
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
                    if (" ".length() <= 0) {
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
                            while ((c3 < var_java_lang_String_arr_if[n6].length())) {
                                if ((var_java_lang_String_arr_if[n6].charAt(c3) == c4)) {
                                    c2 = c3;
                                    if ("  ".length() < "  ".length()) {
                                        return null;
                                    }
                                    break block27;
                                }
                                ++c3;
                                if (((0x1E ^ 5) & ~(0x58 ^ 0x43)) <= 0) continue;
                                return null;
                            }
                            c2 = c4 = -1;
                        }
                        if ((c2 >= 0)) {
                            if ((n7 < 2)) {
                                char c5 = string2.charAt(0);
                                c3 = c5;
                                n6 = P.cfr_renamed_0(c5);
                                if ((n6 != -1)) {
                                    c4 = "áàảãạéèẻẽẹóòỏõọíìỉĩịýỳỷỹỵúùủũụắằẳẵặấầẩẫậếềểễệốồổỗộớờởỡợứừửữựÁÀẢÃẠÉÈẺẼẸÓÒỎÕỌÍÌỈĨỊÝỲỶỸỴÚÙỦŨỤẮẰẲẴẶẤẦẨẪẬẾỀỂỄỆỐỒỔỖỘỚỜỞỠỢỨỪỬỮỰ".charAt(n6 * var_java_lang_String_arr_if[n4].length() + c4);
                                    String string3 = string2.substring(0, n7).replace(c3, c4);
                                    if ((n3 > 0)) {
                                        return string.substring(0, n3) + string3;
                                    }
                                    return string3;
                                }
                                return string;
                            }
                            if (!P.cfr_renamed_1(P.cfr_renamed_0(string2.charAt(n7 - 1))) || (n7 > 2)) {
                                n = n7 - 2;
                                while ((n >= 0)) {
                                    char c6 = string2.charAt(n);
                                    c3 = c6;
                                    n6 = P.cfr_renamed_0(c6);
                                    if ((n6 != -1)) {
                                        c4 = "áàảãạéèẻẽẹóòỏõọíìỉĩịýỳỷỹỵúùủũụắằẳẵặấầẩẫậếềểễệốồổỗộớờởỡợứừửữựÁÀẢÃẠÉÈẺẼẸÓÒỎÕỌÍÌỈĨỊÝỲỶỸỴÚÙỦŨỤẮẰẲẴẶẤẦẨẪẬẾỀỂỄỆỐỒỔỖỘỚỜỞỠỢỨỪỬỮỰ".charAt(n6 * var_java_lang_String_arr_if[n4].length() + c4);
                                        String string4 = string2.substring(0, n5 - 1).replace(c3, c4);
                                        if ((n3 > 0)) {
                                            return string.substring(0, n3) + string4;
                                        }
                                        return string4;
                                    }
                                    --n;
                                    if (((0x55 ^ 0x66) & ~(0x83 ^ 0xB0)) <= 0) continue;
                                    return null;
                                }
                                if (-"  ".length() > 0) {
                                    return null;
                                }
                            } else {
                                n = 0;
                                while ((n < n7)) {
                                    char c7 = string2.charAt(n);
                                    c3 = c7;
                                    n6 = P.cfr_renamed_0(c7);
                                    if ((n6 != -1)) {
                                        c4 = "áàảãạéèẻẽẹóòỏõọíìỉĩịýỳỷỹỵúùủũụắằẳẵặấầẩẫậếềểễệốồổỗộớờởỡợứừửữựÁÀẢÃẠÉÈẺẼẸÓÒỎÕỌÍÌỈĨỊÝỲỶỸỴÚÙỦŨỤẮẰẲẴẶẤẦẨẪẬẾỀỂỄỆỐỒỔỖỘỚỜỞỠỢỨỪỬỮỰ".charAt(n6 * var_java_lang_String_arr_if[n4].length() + c4);
                                        String string5 = string2.substring(0, n7).replace(c3, c4);
                                        if ((n3 > 0)) {
                                            return string.substring(0, n3) + string5;
                                        }
                                        return string5;
                                    }
                                    ++n;
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
                            stringBuffer.append(var_java_lang_String_arr_do[n4].charAt(c4));
                            if (P.boolean_do(string6.equals(stringBuffer.toString()) ? 1 : 0)) {
                                String string7 = String.valueOf("ăâêôơưđĂÂÊÔƠƯĐ".charAt(c4));
                                if ((n == 2)) {
                                    return string7;
                                }
                                return string.substring(0, n - 2) + string7;
                            }
                            ++c4;
                            if (-"   ".length() < 0) continue;
                            return null;
                        }
                    }
                }
            }
            return string;
        }
        return string;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[5];
        1 = " ".length();
        2 = "  ".length();
        32 = 0x72 ^ 0x52;
        0 = (0xE3 ^ 0xBF ^ (0x19 ^ 0x1D)) & (0x12 ^ 0x6E ^ (0x37 ^ 0x13) ^ -" ".length());
        -1 = -" ".length();
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

        static {
        P.cfr_renamed_0();
        String[] stringArray = new String[2];
        stringArray[0] = "sfrxj";
        stringArray[1] = "12345";
        var_java_lang_String_arr_if = stringArray;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "waeowwdWAEOWWD";
        stringArray2[1] = "86667798666779";
        var_java_lang_String_arr_do = stringArray2;
        var_int_if = 0;
        soLuong = QuanLyRMS.int_do("Unicode");
    }

            private static int cfr_renamed_0(char c2) {
        int n = 0;
        while ((n < "aeoiyuăâêôơưAEOIYUĂÂÊÔƠƯ".length())) {
            if (("aeoiyuăâêôơưAEOIYUĂÂÊÔƠƯ".charAt(n) == c2)) {
                return n;
            }
            ++n;
            if ("  ".length() >= 0) continue;
            return (0xC ^ 0x3B) & ~(2 ^ 0x35);
        }
        return -1;
    }

        }

