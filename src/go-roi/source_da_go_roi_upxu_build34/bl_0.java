/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;

/*
 * Renamed from bl
 */
public final class bl_0 {
    private final int var_int_if = var_byte_arr_if.length;
    private int[] mangSoNguyen;
    private int soLuongKhoa;
    private static int[] var_int_arr_if;
    private String chuoiGiaTri;
    private byte[] var_byte_arr_do;
    private String[] var_java_lang_String_arr_do;
    private static int[] var_int_arr_for;
    public static Image var_javax_microedition_lcdui_Image_do;
    private static final byte[] var_byte_arr_if;
    private static final int[] var_int_arr_int;
    private int var_int_int;
    private int[] cfr_renamed_5;
    private DataInputStream var_java_io_DataInputStream_do;
    public static final Hashtable var_java_util_Hashtable_do;
    private static bl_0 var_bl_0_do;
    public static int soLuong;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String java_lang_String_do(String string) {
        int n;
        try {
            n = var_int_arr_int[1];
        }
        catch (Exception exception) {
            return null;
        }
        while ((n < this.soLuongKhoa)) {
            if ((this.var_java_lang_String_arr_do[n].compareTo(string) == 0)) {
                return new String(this.var_byte_arr_do, this.cfr_renamed_5[n], this.mangSoNguyen[n]);
            }
            ++n;
            if (-" ".length() == -" ".length()) continue;
            return null;
        }
        if (((0 ^ 0x25 ^ (0x43 ^ 0x63)) & (0xA2 ^ 0x82 ^ (0x11 ^ 0x34) ^ -" ".length())) <= 0) return null;
        return null;
    }

    private void cfr_renamed_1() {
        if (bl_0.cfr_renamed_0((Object)this.var_java_io_DataInputStream_do)) {
            try {
                this.var_java_io_DataInputStream_do.close();
                return;
            }
            catch (IOException iOException) {
                }
        }
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

        public bl_0() {
    }

    private static void cfr_renamed_3() {
        var_int_arr_int = new int[35];
        bl_0.var_int_arr_int[0] = 0x6E ^ 0x66;
        bl_0.var_int_arr_int[1] = (0xF ^ 1 ^ (0x3E ^ 0x1B)) & (0x18 ^ 0x61 ^ (0x27 ^ 0x75) ^ -" ".length());
        bl_0.var_int_arr_int[2] = 0x15 ^ 0x23;
        bl_0.var_int_arr_int[3] = " ".length();
        bl_0.var_int_arr_int[4] = 0x21 ^ 0x52;
        bl_0.var_int_arr_int[5] = "  ".length();
        bl_0.var_int_arr_int[6] = 0x58 ^ 0x2B ^ (0x98 ^ 0x85);
        bl_0.var_int_arr_int[7] = "   ".length();
        bl_0.var_int_arr_int[8] = 0x5F ^ 0x6A;
        bl_0.var_int_arr_int[9] = 0xBD ^ 0xB9;
        bl_0.var_int_arr_int[10] = 0x6D ^ 0x1A;
        bl_0.var_int_arr_int[11] = 0xE8 ^ 0xC0 ^ (0x11 ^ 0x3C);
        bl_0.var_int_arr_int[12] = 0x57 ^ 0x58 ^ (0x1C ^ 0x66);
        bl_0.var_int_arr_int[13] = 0x60 ^ 0x66;
        bl_0.var_int_arr_int[14] = 184 + 191 - 323 + 147 ^ 139 + 42 - 89 + 100;
        bl_0.var_int_arr_int[15] = 0xA0 ^ 0xAE;
        bl_0.var_int_arr_int[16] = 132 + 61 - 43 + 53 ^ 57 + 99 - 140 + 117;
        bl_0.var_int_arr_int[17] = 234 + 86 - 161 + 87 ^ 47 + 134 - 101 + 65;
        bl_0.var_int_arr_int[18] = 0xD7 ^ 0xAE;
        bl_0.var_int_arr_int[19] = 0x79 ^ 0x6A ^ (0xF8 ^ 0x8E);
        bl_0.var_int_arr_int[20] = 0xF ^ 0x47;
        bl_0.var_int_arr_int[21] = 0x26 ^ 0x2F;
        bl_0.var_int_arr_int[22] = 69 + 59 - 108 + 131 ^ 97 + 109 - 97 + 89;
        bl_0.var_int_arr_int[23] = 156 + 107 - 221 + 120 ^ 69 + 80 - 72 + 91;
        bl_0.var_int_arr_int[24] = 0x2C ^ 0x3F ^ (0x75 ^ 0x6D);
        bl_0.var_int_arr_int[25] = 0x23 ^ 0x69 ^ (0x85 ^ 0xC3);
        bl_0.var_int_arr_int[26] = 0x1B ^ 0x16;
        bl_0.var_int_arr_int[27] = 0x4D ^ 4 ^ (0x62 ^ 0x5F);
        bl_0.var_int_arr_int[28] = 0xB0 ^ 0x91 ^ (5 ^ 0x16);
        bl_0.var_int_arr_int[29] = 0x2D ^ 0x5F;
        bl_0.var_int_arr_int[30] = 157 + 162 - 229 + 102 ^ 119 + 98 - 194 + 148;
        bl_0.var_int_arr_int[31] = 0x73 ^ 0x21 ^ (0x10 ^ 0x21);
        bl_0.var_int_arr_int[32] = 0x7E ^ 0x42 ^ (0x4F ^ 0xF);
        bl_0.var_int_arr_int[33] = 45 + 119 - 157 + 133 ^ 150 + 169 - 199 + 57;
        bl_0.var_int_arr_int[34] = 0xA2 ^ 0x99;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Image javax_microedition_lcdui_Image_do(String string) {
        int n;
        try {
            n = var_int_arr_int[1];
        }
        catch (Exception exception) {
            return null;
        }
        while ((n < this.soLuongKhoa)) {
            if ((this.var_java_lang_String_arr_do[n].compareTo(string) == 0)) {
                return Image.createImage((byte[])this.var_byte_arr_do, (int)this.cfr_renamed_5[n], (int)this.mangSoNguyen[n]);
            }
            ++n;
            }
        if ("  ".length() <= (0xC ^ 8)) return null;
        return null;
    }

    static {
        bl_0.cfr_renamed_3();
        byte[] byArray = new byte[var_int_arr_int[15]];
        byArray[bl_0.var_int_arr_int[1]] = var_int_arr_int[16];
        byArray[bl_0.var_int_arr_int[3]] = var_int_arr_int[17];
        byArray[bl_0.var_int_arr_int[5]] = var_int_arr_int[12];
        byArray[bl_0.var_int_arr_int[7]] = var_int_arr_int[18];
        byArray[bl_0.var_int_arr_int[9]] = var_int_arr_int[19];
        byArray[bl_0.var_int_arr_int[11]] = var_int_arr_int[6];
        byArray[bl_0.var_int_arr_int[13]] = var_int_arr_int[20];
        byArray[bl_0.var_int_arr_int[14]] = var_int_arr_int[12];
        byArray[bl_0.var_int_arr_int[0]] = var_int_arr_int[12];
        byArray[bl_0.var_int_arr_int[21]] = var_int_arr_int[22];
        byArray[bl_0.var_int_arr_int[23]] = var_int_arr_int[12];
        byArray[bl_0.var_int_arr_int[24]] = var_int_arr_int[18];
        byArray[bl_0.var_int_arr_int[25]] = var_int_arr_int[19];
        byArray[bl_0.var_int_arr_int[26]] = var_int_arr_int[27];
        var_byte_arr_if = byArray;
        int[] nArray = new int[var_int_arr_int[11]];
        nArray[bl_0.var_int_arr_int[1]] = var_int_arr_int[28];
        nArray[bl_0.var_int_arr_int[3]] = var_int_arr_int[27];
        nArray[bl_0.var_int_arr_int[5]] = var_int_arr_int[29];
        nArray[bl_0.var_int_arr_int[7]] = var_int_arr_int[30];
        nArray[bl_0.var_int_arr_int[9]] = var_int_arr_int[7];
        var_int_arr_if = nArray;
        var_java_util_Hashtable_do = new Hashtable();
        int[] nArray2 = new int[var_int_arr_int[13]];
        nArray2[bl_0.var_int_arr_int[1]] = var_int_arr_int[31];
        nArray2[bl_0.var_int_arr_int[3]] = var_int_arr_int[27];
        nArray2[bl_0.var_int_arr_int[5]] = var_int_arr_int[12];
        nArray2[bl_0.var_int_arr_int[7]] = var_int_arr_int[32];
        nArray2[bl_0.var_int_arr_int[9]] = var_int_arr_int[33];
        nArray2[bl_0.var_int_arr_int[11]] = var_int_arr_int[34];
        var_int_arr_for = nArray2;
    }

        private static String java_lang_String_if(String string) {
        if ((var_bl_0_do != null) && bl_0.cfr_renamed_0(string = var_bl_0_do.java_lang_String_do(string + TienIchGame.cfr_renamed_0(var_int_arr_if)))) {
            try {
                return new String(gn.cfr_renamed_0(string), "UTF-8");
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                return new String(gn.cfr_renamed_0(string));
            }
        }
        return null;
    }

    private void void_do(byte[] byArray) {
        int n = byArray.length;
        int n2 = var_int_arr_int[1];
        while ((n2 < n)) {
            int n3 = n2;
            byArray[n3] = (byte)(byArray[n3] ^ var_byte_arr_if[n2 % this.var_int_if]);
            ++n2;
            if ("   ".length() != "  ".length()) continue;
            return;
        }
    }

    public static void (DataInputStream dataInputStream != null) {
        byte by2 = dataInputStream.readByte();
        int n = var_int_arr_int[1];
        while ((n < by2)) {
            String string = soLuong + n + String.valueOf((char)var_int_arr_for[var_int_arr_int[9]]);
            var_java_util_Hashtable_do.put(string, dataInputStream.readUTF());
            ++n;
            if ((0x3A ^ 0x3E) > -" ".length()) continue;
            return;
        }
    }

    public static String java_lang_String_do(int n) {
        String string = String.valueOf(n) + String.valueOf((char)var_int_arr_for[var_int_arr_int[9]]);
        if ((var_java_util_Hashtable_do.containsKey(string))) {
            return (String)var_java_util_Hashtable_do.get(string);
        }
        return null;
    }

    private bl_0(String string) {
        int n = var_int_arr_int[1];
        int n2 = var_int_arr_int[1];
        this.chuoiGiaTri = string;
        this.var_int_int = var_int_arr_int[1];
        this.var_java_io_DataInputStream_do = new DataInputStream(this.getClass().getResourceAsStream(this.chuoiGiaTri));
        try {
            this.soLuongKhoa = this.var_java_io_DataInputStream_do.readUnsignedByte();
            this.var_int_int += var_int_arr_int[3];
            this.var_java_lang_String_arr_do = new String[this.soLuongKhoa];
            this.cfr_renamed_5 = new int[this.soLuongKhoa];
            this.mangSoNguyen = new int[this.soLuongKhoa];
            int n3 = var_int_arr_int[1];
            while ((n3 < this.soLuongKhoa)) {
                byte by2 = this.var_java_io_DataInputStream_do.readByte();
                byte[] byArray = new byte[by2];
                this.var_java_io_DataInputStream_do.read(byArray);
                this.void_do(byArray);
                this.var_java_lang_String_arr_do[n3] = new String(byArray);
                this.cfr_renamed_5[n3] = n;
                this.mangSoNguyen[n3] = this.var_java_io_DataInputStream_do.readUnsignedShort();
                n += this.mangSoNguyen[n3];
                n2 += this.mangSoNguyen[n3];
                this.var_int_int += by2 + var_int_arr_int[7];
                ++n3;
                if ((56 + 20 - 27 + 115 ^ 58 + 23 - 21 + 100) > "   ".length()) continue;
                throw null;
            }
            this.var_byte_arr_do = new byte[n2];
            this.var_java_io_DataInputStream_do.readFully(this.var_byte_arr_do);
            this.void_do(this.var_byte_arr_do);
            }
        catch (IOException iOException) {
            }
        if ("   ".length() < "   ".length()) {
            throw null;
        }
        this.cfr_renamed_1();
    }

        public static DataInputStream java_io_DataInputStream_do(byte[] byArray) {
        if (bl_0.cfr_renamed_0((Object)byArray) && bl_0.boolean_do(byArray.length)) {
            byte[] byArray2 = new byte[byArray.length];
            int n = var_byte_arr_if.length;
            int n2 = var_int_arr_int[1];
            while ((n2 < byArray.length)) {
                byArray2[n2] = (byte)(byArray[n2] ^ var_byte_arr_if[n2 % n]);
                ++n2;
                if (-" ".length() < 0) continue;
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray2);
            return new DataInputStream(byteArrayInputStream);
        }
        return null;
    }

    public static void cfr_renamed_0() {
        int[] nArray = new int[var_int_arr_int[0]];
        nArray[bl_0.var_int_arr_int[1]] = var_int_arr_int[2];
        nArray[bl_0.var_int_arr_int[3]] = var_int_arr_int[4];
        nArray[bl_0.var_int_arr_int[5]] = var_int_arr_int[6];
        nArray[bl_0.var_int_arr_int[7]] = var_int_arr_int[8];
        nArray[bl_0.var_int_arr_int[9]] = var_int_arr_int[10];
        nArray[bl_0.var_int_arr_int[11]] = var_int_arr_int[12];
        nArray[bl_0.var_int_arr_int[13]] = var_int_arr_int[6];
        nArray[bl_0.var_int_arr_int[14]] = var_int_arr_int[13];
        String[] stringArray = TienIchGame.cfr_renamed_0(nArray);
        var_bl_0_do = new bl_0(MenuChinhAvatar.java_lang_String_do() + (String)stringArray);
        var_javax_microedition_lcdui_Image_do = bl_0.javax_microedition_lcdui_Image_if(String.valueOf((char)var_int_arr_for[var_int_arr_int[1]]));
        dL.cfr_renamed_5 = bl_0.javax_microedition_lcdui_Image_if(String.valueOf((char)var_int_arr_for[var_int_arr_int[3]]));
        stringArray = TienIchGame.java_lang_String_arr_do(bl_0.java_lang_String_if(String.valueOf((char)var_int_arr_for[var_int_arr_int[5]])), String.valueOf((char)var_int_arr_for[var_int_arr_int[7]]));
        int n = var_int_arr_int[1];
        while ((n < stringArray.length)) {
            int n2 = stringArray[n].indexOf(var_int_arr_for[var_int_arr_int[9]]);
            String string = stringArray[n].substring(var_int_arr_int[1], n2 + var_int_arr_int[3]);
            String string2 = stringArray[n].substring(n2 + var_int_arr_int[3]);
            var_java_util_Hashtable_do.put(string, string2);
            ++n;
            if (-" ".length() != "  ".length()) continue;
            return;
        }
        soLuong = var_java_util_Hashtable_do.size();
        w.var_javax_microedition_lcdui_Image_do = var_javax_microedition_lcdui_Image_do;
        cd.chuoiGiaTri = bl_0.java_lang_String_do(var_int_arr_int[1]);
        if ((var_bl_0_do != null)) {
            var_bl_0_do.cfr_renamed_1();
            var_bl_0_do = null;
        }
        System.gc();
    }

    private static Image javax_microedition_lcdui_Image_if(String string) {
        if ((var_bl_0_do != null)) {
            return var_bl_0_do.javax_microedition_lcdui_Image_do(string + TienIchGame.cfr_renamed_0(var_int_arr_if));
        }
        return null;
    }

    }

