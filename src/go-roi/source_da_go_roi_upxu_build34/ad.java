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

public final class ad
extends cd {
    private final int var_int_if;
    private final byte var_byte_if;
    private static final int[] mangSoNguyen;
    private static final String tenNhanVat;
    public static byte var_byte_do;
    private static int soLuongKhoa;
    public static String[] var_java_lang_String_arr_do;
    private static final String chuoiPhu;
    private Image var_javax_microedition_lcdui_Image_do;

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

        private static boolean boolean_if(int n) {
        return n > 0;
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static {
        ad.cfr_renamed_5();
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
        chuoiPhu = TienIchGame.cfr_renamed_0(nArray);
        int[] nArray2 = new int[6];
        nArray2[0] = 74;
        nArray2[1] = 87;
        nArray2[2] = 87;
        nArray2[3] = 84;
        nArray2[4] = 87;
        nArray2[5] = 4;
        tenNhanVat = TienIchGame.cfr_renamed_0(nArray2);
        var_java_lang_String_arr_do = new String[3];
        var_byte_do = (byte)0;
        soLuongKhoa = 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

                    public ad(Image image, int n, byte by2) {
        this.var_javax_microedition_lcdui_Image_do = image;
        this.var_int_if = n;
        this.var_byte_if = by2;
    }

    /*
     * Loose catch block
     */
    public final void cfr_renamed_1() {
        long l;
        long l2;
        block59: {
            l2 = System.currentTimeMillis();
            if (!(this.var_javax_microedition_lcdui_Image_do != null)) break block59;
            try {
                int n;
                Object object;
                block58: {
                    FilterInputStream filterInputStream;
                    Object object2;
                    Image image;
                    block57: {
                        Object object3;
                        Object object4;
                        image = this.var_javax_microedition_lcdui_Image_do;
                        String string = "";
                        if (ad.cfr_renamed_0((Object)var_java_lang_String_arr_do[0]) && ad.cfr_renamed_0((Object)var_java_lang_String_arr_do[1]) && ad.cfr_renamed_0((Object)var_java_lang_String_arr_do[2])) {
                            object2 = "";
                            int n2 = image.getWidth();
                            int n3 = image.getHeight();
                            object = new int[n2 * n3];
                            image.getRGB((int[])object, 0, n2, 0, 0, n2, n3);
                            int n4 = 0;
                            while (ad.boolean_if(n4, n3)) {
                                n = 0;
                                while (ad.boolean_if(n, n2)) {
                                    Object object5 = object[n2 * n4 + n];
                                    int[] nArray = new int[4];
                                    object4 = nArray;
                                    nArray[0] = (int)(object5 >>> 24);
                                    object4[1] = object5 >> 16 & 255;
                                    object4[2] = object5 >> 8 & 255;
                                    object4[3] = object5 & 255;
                                    object3 = object4;
                                    if (ad.cfr_renamed_3((int)object3[0])) {
                                        object2 = (String)object2 + "1";
                                        if (((0x12 ^ 0x17 ^ (0xF8 ^ 0xBB)) & (0x4F ^ 0x74 ^ (0xC7 ^ 0xBA) ^ -" ".length())) < -" ".length()) {
                                            return;
                                        }
                                    } else if (ad.cfr_renamed_3((int)object3[1], 127) && ad.cfr_renamed_3((int)object3[2], 127) && ad.cfr_renamed_3((int)object3[3], 127)) {
                                        object2 = (String)object2 + "1";
                                        if (-"   ".length() > 0) {
                                            return;
                                        }
                                    } else {
                                        object2 = (String)object2 + "0";
                                    }
                                    ++n;
                                    if (-" ".length() < 0) continue;
                                    return;
                                }
                                ++n4;
                                if ("  ".length() > " ".length()) continue;
                                return;
                            }
                            if (ad.boolean_if(((String)object2).length())) {
                                string = var_java_lang_String_arr_do[0] + (String)object2 + var_java_lang_String_arr_do[1] + n2 + var_java_lang_String_arr_do[2] + n3;
                            }
                        }
                        this.var_javax_microedition_lcdui_Image_do = null;
                        image = null;
                        object2 = null;
                        filterInputStream = null;
                        String string2 = TienIchGame.java_lang_String_do(bl_0.java_lang_String_do(bl_0.soLuong));
                        object = "";
                        n = -1;
                        image = cd.cfr_renamed_0(string2, string);
                        object2 = image.openOutputStream();
                        ((OutputStream)object2).write(string.getBytes());
                        if (ad.cfr_renamed_4(cd.cfr_renamed_0((HttpConnection)image) ? 1 : 0)) {
                            filterInputStream = image.openDataInputStream();
                            switch (((DataInputStream)filterInputStream).readByte()) {
                                case 0: {
                                    object = tenNhanVat;
                                    object3 = ((DataInputStream)filterInputStream).readUTF();
                                    TienIchGame.aq_0_do();
                                    TienIchGame.void_if();
                                    ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)this.var_ei_do;
                                    TienIchGame.hienThongBao(1000L);
                                    TienIchGame.cfr_renamed_1((String)object3, fe_0.fe_0_do().var_ei_if, this.var_ei_if);
                                    if ("  ".length() == ((145 + 3 - 23 + 39 ^ 90 + 1 - 50 + 113) & (4 + 41 - -82 + 25 ^ 60 + 25 - -60 + 21 ^ -" ".length()))) {
                                        return;
                                    }
                                    break block57;
                                }
                                case 1: {
                                    n = ((DataInputStream)filterInputStream).readByte();
                                    object = ((DataInputStream)filterInputStream).readUTF();
                                    break block57;
                                }
                                case -1: {
                                    object = tenNhanVat;
                                    object4 = ((DataInputStream)filterInputStream).readUTF();
                                    TienIchGame.aq_0_do();
                                    TienIchGame.void_if();
                                    ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)this.var_ei_do;
                                    TienIchGame.hienThongBao(1000L);
                                    GameCanvas.hienThongBaoPopup((String)object4, this.var_ei_if);
                                    if (" ".length() == (0x52 ^ 0x56)) {
                                        return;
                                    }
                                    break block57;
                                }
                                case 3: {
                                    object = tenNhanVat;
                                    string = ((DataInputStream)filterInputStream).readUTF();
                                    string2 = ((DataInputStream)filterInputStream).readUTF();
                                    TienIchGame.aq_0_do();
                                    TienIchGame.void_if();
                                    ThongTinNhanVat.cfr_renamed_0().tenNhanVat = ((DataInputStream)filterInputStream).readUTF();
                                    p_0.var_p_0_do = null;
                                    p_0.p_0_do().cfr_renamed_0(new Hashtable(), string, string2, -1);
                                    TienIchGame.hienThongBao(1000L);
                                    GameCanvas.var_dX_do = p_0.p_0_do();
                                    p_0.p_0_do().cfr_renamed_4 = (int)this.var_ei_do;
                                    p_0.p_0_do().cfr_renamed_2 = (int)this.var_ei_if;
                                }
                                default: {
                                    if (((0x13 ^ 0x2E ^ (0xC ^ 0x3B)) & (2 + 69 - 15 + 145 ^ 96 + 115 - 123 + 107 ^ -" ".length())) >= "  ".length()) {
                                        return;
                                    }
                                    break block57;
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
                        if (((0x31 ^ 0x63) & ~(0x64 ^ 0x36)) != 0) {
                            return;
                        }
                        break block58;
                    }
                    if (((0xEF ^ 0xB2) & ~(0xC6 ^ 0x9B)) != 0) {
                        return;
                    }
                    break block58;
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
                            if ((0x28 ^ 0x2D) <= 0) {
                                return;
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
                            if (((74 + 35 - 7 + 33 ^ 87 + 53 - 135 + 123) & (120 + 59 - 60 + 38 ^ 28 + 42 - -36 + 48 ^ -" ".length())) != 0) {
                                return;
                            }
                            break block58;
                        }
                        if ("  ".length() > (0x25 ^ 0x21)) {
                            return;
                        }
                    }
                }
                System.gc();
                if (ad.cfr_renamed_3(((String)object).equals("") ? 1 : 0)) {
                    if (ad.cfr_renamed_4(((String)object).equals(tenNhanVat) ? 1 : 0)) {
                        soLuongKhoa = 0;
                        return;
                    }
                    if (ad.cfr_renamed_4(((String)object).equals(chuoiPhu) ? 1 : 0)) {
                        if (ad.boolean_do(soLuongKhoa, 3)) {
                            soLuongKhoa = 0;
                            TienIchGame.aq_0_do();
                            TienIchGame.void_if();
                            ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)this.var_ei_do;
                            TienIchGame.hienThongBao(1000L);
                            GameCanvas.hienThongBaoPopup(bl_0.java_lang_String_do(4), this.var_ei_if);
                            return;
                        }
                        soLuongKhoa += 1;
                        if ("   ".length() > "   ".length()) {
                            return;
                        }
                        break block59;
                    }
                    soLuongKhoa = 0;
                    if ((n == 2)) {
                        AutoController.tatAuto();
                        TienIchGame.dangXuatTaiKhoan();
                        TienIchGame.hienThongBao(1000L);
                        GameCanvas.hienThongBaoPopup((String)object);
                        return;
                    }
                    long l3 = System.currentTimeMillis() - l2;
                    if (ad.boolean_do((l3, 3000L != null))) {
                        TienIchGame.hienThongBao(3000L - l3);
                    }
                    eq.eq_do().cfr_renamed_0(this.var_int_if, this.var_byte_if, (String)object);
                    if ((TienIchGame.cfr_renamed_12(5000L))) {
                        return;
                    }
                }
                }
            catch (Exception exception) {
                }
            if (((0x7D ^ 7 ^ (0 ^ 0x3E)) & (121 + 23 - -46 + 47 ^ 78 + 54 - -32 + 5 ^ -" ".length())) < ((0xD3 ^ 0xA6 ^ (0x14 ^ 0x53)) & (8 ^ 0x7D ^ (0x6A ^ 0x2D) ^ -" ".length()))) {
                return;
            }
        }
        if (ad.boolean_do((l = System.currentTimeMillis() - l2, 5000L != null))) {
            TienIchGame.hienThongBao(5000L - l);
        }
    }

    private static void cfr_renamed_5() {
        mangSoNguyen = new int[25];
        0 = (0x3D ^ 0x5D) & ~(0x36 ^ 0x56);
        1 = " ".length();
        2 = "  ".length();
        4 = 0x12 ^ 0x75 ^ (0x68 ^ 0xB);
        24 = 87 + 33 - 0 + 22 ^ 44 + 93 - 88 + 101;
        16 = 0x26 ^ 0x36;
        255 = 7 + 15 - -110 + 5 + (0x1A ^ 0x58) - (4 ^ 0xD) + (4 ^ 0x39);
        8 = 0x4D ^ 0x45;
        3 = "   ".length();
        127 = 91 + 51 - 18 + 3;
        -1 = -" ".length();
        9 = 0x67 ^ 0x6E;
        92 = 0xF ^ 0x2F ^ (0x51 ^ 0x2D);
        90 = 0x1A ^ 0x40;
        97 = 0x10 ^ 0x70 ^ " ".length();
        73 = 0xC1 ^ 0xB3 ^ (0x92 ^ 0xA9);
        79 = 0xD ^ 0x42;
        5 = 0xE ^ 0xB;
        6 = 0x1D ^ 0x1B;
        81 = 147 + 115 - 27 + 10 ^ 3 + 43 - -59 + 59;
        7 = 0xD0 ^ 0xBC ^ (0xE9 ^ 0x82);
        86 = 0x54 ^ 2;
        74 = 7 ^ 0x4D;
        87 = 57 + 186 - 178 + 142 ^ 49 + 98 - 62 + 67;
        84 = 0xC1 ^ 0x95;
    }
}

