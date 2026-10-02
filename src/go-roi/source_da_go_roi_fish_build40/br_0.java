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
 * Renamed from br
 */
public final class br_0 {
    private String[] var_java_lang_String_arr_do;
    private static int[] mangSoNguyen;
    private static final byte[] var_byte_arr_do;
    private int[] var_int_arr_if;
    private static final int[] var_int_arr_for;
    private int[] var_int_arr_int;
    private String chuoiGiaTri;
    private final int var_int_if = var_byte_arr_do.length;
    private byte[] var_byte_arr_if;
    public static int soLuong;
    private static br_0 gameCanvas;
    public static final Hashtable var_java_util_Hashtable_do;
    private int soLuongKhoa;
    private DataInputStream var_java_io_DataInputStream_do;
    private int var_int_int;
    public static Image var_javax_microedition_lcdui_Image_do;
    private static int[] cfr_renamed_4;

    public static DataInputStream java_io_DataInputStream_do(byte[] byArray) {
        if (br_0.cfr_renamed_1((Object)byArray) && br_0.boolean_do(byArray.length)) {
            byte[] byArray2 = new byte[byArray.length];
            int n = var_byte_arr_do.length;
            int n2 = var_int_arr_for[1];
            while ((n2 < byArray.length)) {
                byArray2[n2] = (byte)(byArray[n2] ^ var_byte_arr_do[n2 % n]);
                ++n2;
                if ((0xE3 ^ 0xB2 ^ (0xFD ^ 0xA8)) > "   ".length()) continue;
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray2);
            return new DataInputStream(byteArrayInputStream);
        }
        return null;
    }

    public br_0() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String java_lang_String_do(String string) {
        int n;
        try {
            n = var_int_arr_for[1];
        }
        catch (Exception exception) {
            return null;
        }
        while ((n < this.soLuongKhoa)) {
            if ((this.var_java_lang_String_arr_do[n].compareTo(string) == 0)) {
                return new String(this.var_byte_arr_if, this.var_int_arr_int[n], this.var_int_arr_if[n]);
            }
            ++n;
            if (-" ".length() != ((0x29 ^ 0x35) & ~(5 ^ 0x19))) continue;
            return null;
        }
        if ("   ".length() != "  ".length()) return null;
        return null;
    }

        public static String java_lang_String_do(int n) {
        String string = String.valueOf(n) + String.valueOf((char)cfr_renamed_4[var_int_arr_for[9]]);
        if ((var_java_util_Hashtable_do.containsKey(string))) {
            return (String)var_java_util_Hashtable_do.get(string);
        }
        return null;
    }

        public static void (DataInputStream dataInputStream != null) {
        int n = dataInputStream.readInt();
        int n2 = var_int_arr_for[1];
        while ((n2 < n)) {
            String string = soLuong + n2 + String.valueOf((char)cfr_renamed_4[var_int_arr_for[9]]);
            var_java_util_Hashtable_do.put(string, dataInputStream.readUTF());
            ++n2;
            if ("  ".length() == "  ".length()) continue;
            return;
        }
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Image javax_microedition_lcdui_Image_do(String string) {
        int n;
        try {
            n = var_int_arr_for[1];
        }
        catch (Exception exception) {
            return null;
        }
        while ((n < this.soLuongKhoa)) {
            if ((this.var_java_lang_String_arr_do[n].compareTo(string) == 0)) {
                return Image.createImage((byte[])this.var_byte_arr_if, (int)this.var_int_arr_int[n], (int)this.var_int_arr_if[n]);
            }
            ++n;
            if ("   ".length() > 0) continue;
            return null;
        }
        if (((0x31 ^ 0xA) & ~(0x25 ^ 0x1E)) > -" ".length()) return null;
        return null;
    }

    private br_0(String string) {
        int n = var_int_arr_for[1];
        int n2 = var_int_arr_for[1];
        this.chuoiGiaTri = string;
        this.var_int_int = var_int_arr_for[1];
        this.var_java_io_DataInputStream_do = new DataInputStream(this.getClass().getResourceAsStream(this.chuoiGiaTri));
        try {
            this.soLuongKhoa = this.var_java_io_DataInputStream_do.readUnsignedByte();
            this.var_int_int += var_int_arr_for[3];
            this.var_java_lang_String_arr_do = new String[this.soLuongKhoa];
            this.var_int_arr_int = new int[this.soLuongKhoa];
            this.var_int_arr_if = new int[this.soLuongKhoa];
            int n3 = var_int_arr_for[1];
            while ((n3 < this.soLuongKhoa)) {
                byte by2 = this.var_java_io_DataInputStream_do.readByte();
                byte[] byArray = new byte[by2];
                this.var_java_io_DataInputStream_do.read(byArray);
                this.void_do(byArray);
                this.var_java_lang_String_arr_do[n3] = new String(byArray);
                this.var_int_arr_int[n3] = n;
                this.var_int_arr_if[n3] = this.var_java_io_DataInputStream_do.readUnsignedShort();
                n += this.var_int_arr_if[n3];
                n2 += this.var_int_arr_if[n3];
                this.var_int_int += by2 + var_int_arr_for[7];
                ++n3;
                throw null;
            }
            this.var_byte_arr_if = new byte[n2];
            this.var_java_io_DataInputStream_do.readFully(this.var_byte_arr_if);
            this.void_do(this.var_byte_arr_if);
            }
        catch (IOException iOException) {
            }
        this.cfr_renamed_0();
    }

    private static Image javax_microedition_lcdui_Image_if(String string) {
        if ((gameCanvas != null)) {
            return gameCanvas.javax_microedition_lcdui_Image_do(string + TienIchGame.cfr_renamed_1(mangSoNguyen));
        }
        return null;
    }

    static {
        br_0.cfr_renamed_2();
        byte[] byArray = new byte[var_int_arr_for[15]];
        byArray[br_0.var_int_arr_for[1]] = var_int_arr_for[16];
        byArray[br_0.var_int_arr_for[3]] = var_int_arr_for[17];
        byArray[br_0.var_int_arr_for[5]] = var_int_arr_for[12];
        byArray[br_0.var_int_arr_for[7]] = var_int_arr_for[18];
        byArray[br_0.var_int_arr_for[9]] = var_int_arr_for[19];
        byArray[br_0.var_int_arr_for[11]] = var_int_arr_for[6];
        byArray[br_0.var_int_arr_for[13]] = var_int_arr_for[20];
        byArray[br_0.var_int_arr_for[14]] = var_int_arr_for[12];
        byArray[br_0.var_int_arr_for[0]] = var_int_arr_for[12];
        byArray[br_0.var_int_arr_for[21]] = var_int_arr_for[22];
        byArray[br_0.var_int_arr_for[23]] = var_int_arr_for[12];
        byArray[br_0.var_int_arr_for[24]] = var_int_arr_for[18];
        byArray[br_0.var_int_arr_for[25]] = var_int_arr_for[19];
        byArray[br_0.var_int_arr_for[26]] = var_int_arr_for[27];
        var_byte_arr_do = byArray;
        int[] nArray = new int[var_int_arr_for[11]];
        nArray[br_0.var_int_arr_for[1]] = var_int_arr_for[28];
        nArray[br_0.var_int_arr_for[3]] = var_int_arr_for[27];
        nArray[br_0.var_int_arr_for[5]] = var_int_arr_for[29];
        nArray[br_0.var_int_arr_for[7]] = var_int_arr_for[30];
        nArray[br_0.var_int_arr_for[9]] = var_int_arr_for[7];
        mangSoNguyen = nArray;
        var_java_util_Hashtable_do = new Hashtable();
        int[] nArray2 = new int[var_int_arr_for[13]];
        nArray2[br_0.var_int_arr_for[1]] = var_int_arr_for[31];
        nArray2[br_0.var_int_arr_for[3]] = var_int_arr_for[27];
        nArray2[br_0.var_int_arr_for[5]] = var_int_arr_for[12];
        nArray2[br_0.var_int_arr_for[7]] = var_int_arr_for[32];
        nArray2[br_0.var_int_arr_for[9]] = var_int_arr_for[33];
        nArray2[br_0.var_int_arr_for[11]] = var_int_arr_for[34];
        cfr_renamed_4 = nArray2;
    }

    private void cfr_renamed_0() {
        if (br_0.cfr_renamed_1((Object)this.var_java_io_DataInputStream_do)) {
            try {
                this.var_java_io_DataInputStream_do.close();
                return;
            }
            catch (IOException iOException) {
                }
        }
    }

    private static String java_lang_String_if(String string) {
        if ((gameCanvas != null) && br_0.cfr_renamed_1(string = gameCanvas.java_lang_String_do(string + TienIchGame.cfr_renamed_1(mangSoNguyen)))) {
            try {
                return new String(eo_0.cfr_renamed_1(string), "UTF-8");
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                return new String(eo_0.cfr_renamed_1(string));
            }
        }
        return null;
    }

        private void void_do(byte[] byArray) {
        int n = byArray.length;
        int n2 = var_int_arr_for[1];
        while ((n2 < n)) {
            int n3 = n2;
            byArray[n3] = (byte)(byArray[n3] ^ var_byte_arr_do[n2 % this.var_int_if]);
            ++n2;
            if ("  ".length() != -" ".length()) continue;
            return;
        }
    }

    public static void cfr_renamed_1() {
        int[] nArray = new int[var_int_arr_for[0]];
        nArray[br_0.var_int_arr_for[1]] = var_int_arr_for[2];
        nArray[br_0.var_int_arr_for[3]] = var_int_arr_for[4];
        nArray[br_0.var_int_arr_for[5]] = var_int_arr_for[6];
        nArray[br_0.var_int_arr_for[7]] = var_int_arr_for[8];
        nArray[br_0.var_int_arr_for[9]] = var_int_arr_for[10];
        nArray[br_0.var_int_arr_for[11]] = var_int_arr_for[12];
        nArray[br_0.var_int_arr_for[13]] = var_int_arr_for[6];
        nArray[br_0.var_int_arr_for[14]] = var_int_arr_for[13];
        String[] stringArray = TienIchGame.cfr_renamed_1(nArray);
        gameCanvas = new br_0(MenuChinhAvatar.java_lang_String_for() + (String)stringArray);
        var_javax_microedition_lcdui_Image_do = br_0.javax_microedition_lcdui_Image_if(String.valueOf((char)cfr_renamed_4[var_int_arr_for[1]]));
        en.cfr_renamed_6 = br_0.javax_microedition_lcdui_Image_if(String.valueOf((char)cfr_renamed_4[var_int_arr_for[3]]));
        stringArray = TienIchGame.java_lang_String_arr_do(br_0.java_lang_String_if(String.valueOf((char)cfr_renamed_4[var_int_arr_for[5]])), String.valueOf((char)cfr_renamed_4[var_int_arr_for[7]]));
        int n = var_int_arr_for[1];
        while ((n < stringArray.length)) {
            int n2 = stringArray[n].indexOf(cfr_renamed_4[var_int_arr_for[9]]);
            String string = stringArray[n].substring(var_int_arr_for[1], n2 + var_int_arr_for[3]);
            String string2 = stringArray[n].substring(n2 + var_int_arr_for[3]);
            var_java_util_Hashtable_do.put(string, string2);
            ++n;
            if ("   ".length() >= 0) continue;
            return;
        }
        soLuong = var_java_util_Hashtable_do.size();
        aU.var_javax_microedition_lcdui_Image_do = var_javax_microedition_lcdui_Image_do;
        cR.chuoiGiaTri = br_0.java_lang_String_do(var_int_arr_for[1]);
        if ((gameCanvas != null)) {
            gameCanvas.cfr_renamed_0();
            gameCanvas = null;
        }
        System.gc();
    }

    private static void cfr_renamed_2() {
        var_int_arr_for = new int[35];
        br_0.var_int_arr_for[0] = 0x9B ^ 0x93;
        br_0.var_int_arr_for[1] = (0x66 ^ 0x43 ^ (0xAA ^ 0xB5)) & (26 + 42 - -78 + 45 ^ 21 + 55 - 0 + 57 ^ -" ".length());
        br_0.var_int_arr_for[2] = 0x13 ^ 0xD ^ (0x3C ^ 0x14);
        br_0.var_int_arr_for[3] = " ".length();
        br_0.var_int_arr_for[4] = 0xB ^ 0x33 ^ (0x20 ^ 0x6B);
        br_0.var_int_arr_for[5] = "  ".length();
        br_0.var_int_arr_for[6] = 0xAD ^ 0xC3;
        br_0.var_int_arr_for[7] = "   ".length();
        br_0.var_int_arr_for[8] = 73 + 82 - 61 + 37 ^ 8 + 30 - -15 + 129;
        br_0.var_int_arr_for[9] = 147 + 64 - 72 + 46 ^ 84 + 108 - 162 + 159;
        br_0.var_int_arr_for[10] = 0x3B ^ 0x4C;
        br_0.var_int_arr_for[11] = 0x34 ^ 0xB ^ (0x33 ^ 9);
        br_0.var_int_arr_for[12] = 0x6E ^ 0x1B;
        br_0.var_int_arr_for[13] = 132 + 28 - 66 + 89 ^ 30 + 66 - 74 + 155;
        br_0.var_int_arr_for[14] = 0xAD ^ 0xAA;
        br_0.var_int_arr_for[15] = 108 + 18 - 59 + 138 ^ 103 + 78 - 153 + 167;
        br_0.var_int_arr_for[16] = 0x41 ^ 0xF;
        br_0.var_int_arr_for[17] = 0x76 ^ 0x11;
        br_0.var_int_arr_for[18] = 0xBB ^ 0xC2;
        br_0.var_int_arr_for[19] = 0x40 ^ 0x3A ^ (0x54 ^ 0x4B);
        br_0.var_int_arr_for[20] = 0x8E ^ 0xC6;
        br_0.var_int_arr_for[21] = 0xA7 ^ 0xAE;
        br_0.var_int_arr_for[22] = 0xF9 ^ 0xA3 ^ (0x30 ^ 0x3B);
        br_0.var_int_arr_for[23] = 21 + 83 - -49 + 23 ^ 43 + 154 - 11 + 0;
        br_0.var_int_arr_for[24] = 0x20 ^ 0x6E ^ (0x4D ^ 8);
        br_0.var_int_arr_for[25] = 0xDE ^ 0x94 ^ (0xDB ^ 0x9D);
        br_0.var_int_arr_for[26] = 0x12 ^ 0x1F;
        br_0.var_int_arr_for[27] = 0x21 ^ 0x55;
        br_0.var_int_arr_for[28] = 0xFF ^ 0x99 ^ (7 ^ 0x53);
        br_0.var_int_arr_for[29] = 146 + 6 - -55 + 1 ^ 32 + 77 - 108 + 161;
        br_0.var_int_arr_for[30] = 0xB9 ^ 0x9A ^ (0x72 ^ 0x3A);
        br_0.var_int_arr_for[31] = 0x74 ^ 0x17;
        br_0.var_int_arr_for[32] = 0x23 ^ 0x6C ^ (0xAB ^ 0x98);
        br_0.var_int_arr_for[33] = 0x1E ^ 0xA ^ (0xAE ^ 0x87);
        br_0.var_int_arr_for[34] = 0x64 ^ 3 ^ (0x2C ^ 0x70);
    }
}

