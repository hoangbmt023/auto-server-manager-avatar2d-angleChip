/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.HttpConnection
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Image;

public final class ax
extends cR {
    private static final String tenNhanVat;
    private static final int[] mangSoNguyen;
    private final int soLuongKhoa;
    private Image var_javax_microedition_lcdui_Image_do;
    private static final String chuoiPhu;
    public static String[] var_java_lang_String_arr_do;
    public static byte var_byte_do;
    public static int soLuong;
    private final byte var_byte_if;

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[26];
        0 = (0xCC ^ 0x8B) & ~(0xDB ^ 0x9C);
        1 = " ".length();
        2 = "  ".length();
        4 = 0xA3 ^ 0xAF ^ (0x90 ^ 0x98);
        24 = 0xC ^ 0x14;
        16 = 0x39 ^ 0x79 ^ (0xDA ^ 0x8A);
        255 = (0x9E ^ 0xAC) + (0x90 ^ 0xB7) - (0xF8 ^ 0xB9) + (175 + 34 - -19 + 3);
        8 = 0x73 ^ 0x7B;
        3 = "   ".length();
        127 = (0x80 ^ 0xA7) + (0x20 ^ 0x4F) - (0x26 ^ 0x4A) + (0xE6 ^ 0xB3);
        11 = 0xB3 ^ 0xB8;
        -1 = -" ".length();
        9 = 0x64 ^ 0x55 ^ (0xA ^ 0x32);
        92 = 0x21 ^ 0x7D;
        90 = 0xBC ^ 0x8A ^ (0x44 ^ 0x28);
        97 = 193 + 16 - 38 + 83 ^ 95 + 113 - 97 + 48;
        73 = 0x1D ^ 0x75 ^ (0x9B ^ 0xBA);
        79 = 0x59 ^ 0x16;
        5 = 0xB0 ^ 0xB5;
        6 = 0xF0 ^ 0xC7 ^ (0x6D ^ 0x5C);
        81 = 1 ^ 0x1D ^ (0x17 ^ 0x5A);
        7 = 171 + 142 - 307 + 176 ^ 100 + 82 - 162 + 157;
        86 = 87 + 109 - 34 + 84 ^ 12 + 71 - -3 + 74;
        74 = 0xF2 ^ 0xB3 ^ (0xB5 ^ 0xBE);
        87 = 0xEC ^ 0xBB;
        84 = 0x6B ^ 0x6E ^ (0x3C ^ 0x6D);
    }

    public ax(Image image, int n, byte by2) {
        this.var_javax_microedition_lcdui_Image_do = image;
        this.soLuongKhoa = n;
        this.var_byte_if = by2;
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

        private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

            static {
        ax.cfr_renamed_2();
        int[] nArray = new int[9];
        nArray[0] = 92;
        nArray[1] = 90;
        nArray[2] = 97;
        nArray[3] = 73;
        nArray[4] = 79;
        nArray[5] = 73;
        nArray[6] = 81;
        nArray[7] = 86;
        nArray[8] = 7;
        chuoiPhu = TienIchGame.cfr_renamed_1(nArray);
        int[] nArray2 = new int[6];
        nArray2[0] = 74;
        nArray2[1] = 87;
        nArray2[2] = 87;
        nArray2[3] = 84;
        nArray2[4] = 87;
        nArray2[5] = 4;
        tenNhanVat = TienIchGame.cfr_renamed_1(nArray2);
        var_java_lang_String_arr_do = new String[3];
        var_byte_do = (byte)0;
        soLuong = 0;
    }

    private static boolean boolean_for(int n) {
        return n > 0;
    }

    private static boolean boolean_int(int n) {
        return n < 0;
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Loose catch block
     */
    public final void cfr_renamed_0() {
        long l;
        long l2;
        block61: {
            l2 = System.currentTimeMillis();
            if (!(this.var_javax_microedition_lcdui_Image_do != null)) break block61;
            try {
                Object object;
                block60: {
                    FilterInputStream filterInputStream;
                    Object object2;
                    Image image;
                    block59: {
                        int n;
                        Object object3;
                        image = this.var_javax_microedition_lcdui_Image_do;
                        String string = "";
                        if (ax.cfr_renamed_1((Object)var_java_lang_String_arr_do[0]) && ax.cfr_renamed_1((Object)var_java_lang_String_arr_do[1]) && ax.cfr_renamed_1((Object)var_java_lang_String_arr_do[2])) {
                            object2 = "";
                            int n2 = image.getWidth();
                            int n3 = image.getHeight();
                            object = new int[n2 * n3];
                            image.getRGB((int[])object, 0, n2, 0, 0, n2, n3);
                            int n4 = 0;
                            while (ax.boolean_if(n4, n3)) {
                                int n5 = 0;
                                while (ax.boolean_if(n5, n2)) {
                                    Object object4 = object[n2 * n4 + n5];
                                    int[] nArray = new int[4];
                                    int[] nArray2 = nArray;
                                    nArray[0] = (int)(object4 >>> 24);
                                    nArray2[1] = object4 >> 16 & 255;
                                    nArray2[2] = object4 >> 8 & 255;
                                    nArray2[3] = object4 & 255;
                                    object3 = nArray2;
                                    if ((nArray2[0] == 0)) {
                                        object2 = (String)object2 + "1";
                                        } else if (ax.boolean_do((int)object3[1], 127) && ax.boolean_do((int)object3[2], 127) && ax.boolean_do((int)object3[3], 127)) {
                                        object2 = (String)object2 + "1";
                                        if ((0x98 ^ 0x9C) < 0) {
                                            return;
                                        }
                                    } else {
                                        object2 = (String)object2 + "0";
                                    }
                                    ++n5;
                                    if ("   ".length() >= 0) continue;
                                    return;
                                }
                                ++n4;
                                if (((0x67 ^ 0x33) & ~(0xE8 ^ 0xBC) & ~((0x1A ^ 0x54) & ~(0x21 ^ 0x6F))) != " ".length()) continue;
                                return;
                            }
                            if (ax.boolean_for(((String)object2).length())) {
                                string = var_java_lang_String_arr_do[0] + (String)object2 + var_java_lang_String_arr_do[1] + n2 + var_java_lang_String_arr_do[2] + n3;
                            }
                        }
                        this.var_javax_microedition_lcdui_Image_do = null;
                        image = null;
                        object2 = null;
                        filterInputStream = null;
                        if ((var_byte_do == 0)) {
                            n = 1;
                            if ("  ".length() >= (0x69 ^ 0x1E ^ (0xCB ^ 0xB8))) {
                                return;
                            }
                        } else {
                            n = 11;
                        }
                        String string2 = TienIchGame.java_lang_String_if(br_0.java_lang_String_do(br_0.soLuong + n));
                        object = "";
                        image = cR.cfr_renamed_1(string2, string);
                        object2 = image.openOutputStream();
                        ((OutputStream)object2).write(string.getBytes());
                        if (ax.cfr_renamed_1(cR.cfr_renamed_1((HttpConnection)image) ? 1 : 0)) {
                            filterInputStream = image.openDataInputStream();
                            switch (((DataInputStream)filterInputStream).readByte()) {
                                case 0: {
                                    object = tenNhanVat;
                                    String string3 = ((DataInputStream)filterInputStream).readUTF();
                                    TienIchGame.aq_0_do();
                                    TienIchGame.void_for();
                                    ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
                                    TienIchGame.void_if(1000L);
                                    TienIchGame.cfr_renamed_1(string3, go_0.go_0_do().var_fl_0_if, this.var_fl_0_do);
                                    if ("   ".length() < -" ".length()) {
                                        return;
                                    }
                                    break block59;
                                }
                                case 1: {
                                    object = ((DataInputStream)filterInputStream).readUTF();
                                    break block59;
                                }
                                case -1: {
                                    object = tenNhanVat;
                                    object3 = ((DataInputStream)filterInputStream).readUTF();
                                    TienIchGame.aq_0_do();
                                    TienIchGame.void_for();
                                    ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
                                    TienIchGame.void_if(1000L);
                                    GameCanvas.cfr_renamed_1((String)object3, this.var_fl_0_do);
                                    if ("   ".length() <= -" ".length()) {
                                        return;
                                    }
                                    break block59;
                                }
                                case 3: {
                                    object = tenNhanVat;
                                    string = ((DataInputStream)filterInputStream).readUTF();
                                    string2 = ((DataInputStream)filterInputStream).readUTF();
                                    TienIchGame.aq_0_do();
                                    TienIchGame.void_for();
                                    ThongTinNhanVat.cfr_renamed_1().chuoiGiaTri = ((DataInputStream)filterInputStream).readUTF();
                                    ab_0.var_ab_0_do = null;
                                    ab_0.cfr_renamed_1().cfr_renamed_1(new Hashtable(), string, string2, -1);
                                    TienIchGame.void_if(1000L);
                                    GameCanvas.var_ez_do = ab_0.cfr_renamed_1();
                                    ab_0.cfr_renamed_1().cfr_renamed_5 = (int)this.var_fl_0_if;
                                    ab_0.cfr_renamed_1().cfr_renamed_4 = (int)this.var_fl_0_do;
                                }
                                default: {
                                    if (((0x49 ^ 0x5D) & ~(0x3C ^ 0x28)) != ((0x28 ^ 0x6F) & ~(0xE8 ^ 0xAF))) {
                                        return;
                                    }
                                    break block59;
                                }
                            }
                        }
                        object = chuoiPhu;
                    }
                    try {
                        if ((image != null)) {
                            image.close();
                        }
                        if ((object2 != null)) {
                            ((OutputStream)object2).close();
                        }
                        if ((filterInputStream != null)) {
                            filterInputStream.close();
                        }
                        }
                    catch (IOException iOException) {
                        if ((0xBE ^ 0xBA) < " ".length()) {
                            return;
                        }
                        break block60;
                    }
                    if (" ".length() <= 0) {
                        return;
                    }
                    break block60;
                    catch (Exception exception) {
                        try {
                            object = chuoiPhu;
                        }
                        catch (Throwable throwable) {
                            try {
                                if ((image != null)) {
                                    image.close();
                                }
                                if ((object2 != null)) {
                                    ((OutputStream)object2).close();
                                }
                                if ((filterInputStream != null)) {
                                    filterInputStream.close();
                                }
                                }
                            catch (IOException iOException) {
                                }
                            throw throwable;
                        }
                        try {
                            if ((image != null)) {
                                image.close();
                            }
                            if ((object2 != null)) {
                                ((OutputStream)object2).close();
                            }
                            if ((filterInputStream != null)) {
                                filterInputStream.close();
                            }
                            }
                        catch (IOException iOException) {
                            if ((0x5D ^ 0x59) < "   ".length()) {
                                return;
                            }
                            break block60;
                        }
                        if (-(0xA1 ^ 0xA5) > 0) {
                            return;
                        }
                    }
                }
                System.gc();
                if (ax.cfr_renamed_0(((String)object).equals("") ? 1 : 0)) {
                    if (ax.cfr_renamed_1(((String)object).equals(tenNhanVat) ? 1 : 0)) {
                        soLuong = 0;
                        return;
                    }
                    if (ax.cfr_renamed_1(((String)object).equals(chuoiPhu) ? 1 : 0)) {
                        if ((soLuong >= 3)) {
                            soLuong = 0;
                            TienIchGame.aq_0_do();
                            TienIchGame.void_for();
                            ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
                            TienIchGame.void_if(1000L);
                            GameCanvas.cfr_renamed_1(br_0.java_lang_String_do(4), this.var_fl_0_do);
                            return;
                        }
                        soLuong += 1;
                        if (" ".length() < 0) {
                            return;
                        }
                        break block61;
                    }
                    soLuong = 0;
                    long l3 = System.currentTimeMillis() - l2;
                    if (ax.boolean_int((l3, 3000L != null))) {
                        TienIchGame.void_if(3000L - l3);
                    }
                    ft_0.ft_0_do().cfr_renamed_1(this.soLuongKhoa, this.var_byte_if, (String)object);
                    if ((TienIchGame.cfr_renamed_6(5000L) ? 1 : 0 != null)) {
                        return;
                    }
                }
                }
            catch (Exception exception) {
                }
            if ("  ".length() >= (0x2F ^ 0x2B)) {
                return;
            }
        }
        if (ax.boolean_int((l = System.currentTimeMillis() - l2, 5000L != null))) {
            TienIchGame.void_if(5000L - l);
        }
    }
}

