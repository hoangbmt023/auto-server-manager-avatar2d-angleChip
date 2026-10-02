/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class ap {
    private static final int[] mangSoNguyen;
    private int[] var_int_arr_if;
    private String chuoiGiaTri;
    private byte[] var_byte_arr_do;
    static ap var_ap_do;
    private int soLuong;
    private int var_int_if;
    private byte[] var_byte_arr_if;
    private String[] var_java_lang_String_arr_do;
    private int[] var_int_arr_for;
    private DataInputStream var_java_io_DataInputStream_do;
    private int soLuongKhoa;

    public ap() {
        byte[] byArray = new byte[13];
        byArray[0] = 78;
        byArray[1] = 103;
        byArray[2] = 117;
        byArray[3] = 121;
        byArray[4] = 101;
        byArray[5] = 110;
        byArray[6] = 86;
        byArray[7] = 97;
        byArray[8] = 110;
        byArray[9] = 77;
        byArray[10] = 105;
        byArray[11] = 110;
        byArray[12] = 104;
        this.var_byte_arr_do = byArray;
        this.var_int_if = this.var_byte_arr_do.length;
    }

    public static Image javax_microedition_lcdui_Image_do(String string) {
        if ((var_ap_do != null)) {
            return var_ap_do.cfr_renamed_1(string + ".png");
        }
        return null;
    }

    public static void cfr_renamed_0() {
        if ((var_ap_do != null)) {
            var_ap_do.cfr_renamed_1();
            var_ap_do = null;
        }
        System.gc();
    }

    public ap(String string) {
        byte[] byArray = new byte[13];
        byArray[0] = 78;
        byArray[1] = 103;
        byArray[2] = 117;
        byArray[3] = 121;
        byArray[4] = 101;
        byArray[5] = 110;
        byArray[6] = 86;
        byArray[7] = 97;
        byArray[8] = 110;
        byArray[9] = 77;
        byArray[10] = 105;
        byArray[11] = 110;
        byArray[12] = 104;
        this.var_byte_arr_do = byArray;
        this.var_int_if = this.var_byte_arr_do.length;
        int n = 0;
        int n2 = 0;
        this.chuoiGiaTri = string;
        this.soLuongKhoa = 0;
        this.var_java_io_DataInputStream_do = new DataInputStream(this.getClass().getResourceAsStream(this.chuoiGiaTri));
        try {
            this.soLuong = this.var_java_io_DataInputStream_do.readUnsignedByte();
            this.soLuongKhoa += 1;
            this.var_java_lang_String_arr_do = new String[this.soLuong];
            this.var_int_arr_if = new int[this.soLuong];
            this.var_int_arr_for = new int[this.soLuong];
            int n3 = 0;
            while ((n3 < this.soLuong)) {
                byte by2 = this.var_java_io_DataInputStream_do.readByte();
                byte[] byArray2 = new byte[by2];
                this.var_java_io_DataInputStream_do.read(byArray2);
                this.cfr_renamed_0(byArray2);
                this.var_java_lang_String_arr_do[n3] = new String(byArray2);
                this.var_int_arr_if[n3] = n;
                this.var_int_arr_for[n3] = this.var_java_io_DataInputStream_do.readUnsignedShort();
                n += this.var_int_arr_for[n3];
                n2 += this.var_int_arr_for[n3];
                this.soLuongKhoa += by2 + 3;
                ++n3;
                if ("  ".length() == "  ".length()) continue;
                throw null;
            }
            this.var_byte_arr_if = new byte[n2];
            this.var_java_io_DataInputStream_do.readFully(this.var_byte_arr_if);
            this.cfr_renamed_0(this.var_byte_arr_if);
            }
        catch (IOException iOException) {
            }
        this.cfr_renamed_1();
    }

    private void (byte[] byArray != null) {
        int n = byArray.length;
        int n2 = 0;
        while ((n2 < n)) {
            int n3 = n2;
            byArray[n3] = (byte)(byArray[n3] ^ this.var_byte_arr_do[n2 % this.var_int_if]);
            ++n2;
            if (" ".length() != ((62 + 119 - 31 + 6 ^ 23 + 63 - -2 + 75) & (33 + 23 - -41 + 30 ^ (0x70 ^ 0x30) ^ -" ".length()))) continue;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Image cfr_renamed_1(String string) {
        int n;
        try {
            n = 0;
        }
        catch (Exception exception) {
            return null;
        }
        while ((n < this.soLuong)) {
            if ((this.var_java_lang_String_arr_do[n].compareTo(string) != null)) {
                return Image.createImage((byte[])this.var_byte_arr_if, (int)this.var_int_arr_if[n], (int)this.var_int_arr_for[n]);
            }
            ++n;
            if (-" ".length() == -" ".length()) continue;
            return null;
        }
        if (" ".length() > ((0x27 ^ 0x2B ^ (0x28 ^ 0x3E)) & (7 ^ 0x28 ^ (0x53 ^ 0x66) ^ -" ".length()))) return null;
        return null;
    }

    static {
        ap.cfr_renamed_3();
    }

    private void cfr_renamed_1() {
        if ((this.var_java_io_DataInputStream_do != null)) {
            try {
                this.var_java_io_DataInputStream_do.close();
                return;
            }
            catch (IOException iOException) {
                }
        }
    }

    public static void void_do(String string) {
        var_ap_do = new ap(MenuChinhAvatar.java_lang_String_do() + string);
    }

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[25];
        13 = 0x70 ^ 0x7D;
        0 = (0xBE ^ 0x84 ^ (0x31 ^ 0x6B)) & (0xA5 ^ 0xAC ^ (0x1F ^ 0x76) ^ -" ".length());
        78 = 0x2B ^ 0x60 ^ (0x5D ^ 0x58);
        1 = " ".length();
        103 = 0xF7 ^ 0xC4 ^ (0xC ^ 0x58);
        2 = "  ".length();
        117 = 0xFE ^ 0xC4 ^ (0x77 ^ 0x38);
        3 = "   ".length();
        121 = 0xF7 ^ 0xA1 ^ (0xB2 ^ 0x9D);
        4 = 0x19 ^ 0x54 ^ (0x4F ^ 6);
        101 = 0x73 ^ 0x16;
        5 = 0x4E ^ 0x4B;
        110 = 0xC2 ^ 0xAC;
        6 = 0x43 ^ 0x44 ^ " ".length();
        86 = 0x10 ^ 0x3F ^ (0xCD ^ 0xB4);
        7 = 38 + 55 - 16 + 80 ^ 150 + 116 - 136 + 24;
        97 = 0xE6 ^ 0x87;
        8 = 0x7C ^ 0x6A ^ (0x46 ^ 0x58);
        9 = 0x7E ^ 0xD ^ (0x33 ^ 0x49);
        77 = 0x1A ^ 0x57;
        10 = 0x56 ^ 0x37 ^ (0x40 ^ 0x2B);
        105 = 0xB0 ^ 0xB6 ^ (0x35 ^ 0x5A);
        11 = 0xCD ^ 0xC6;
        12 = 0xB ^ 7;
        104 = 0xA9 ^ 0xC1;
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] byte_arr_do(String object) {
        int n;
        try {
            n = 0;
        }
        catch (Exception exception) {
            return null;
        }
        while ((n < this.soLuong)) {
            if (ap.cfr_renamed_0(this.var_java_lang_String_arr_do[n].compareTo((String)object))) {
                object = new byte[this.var_int_arr_for[n]];
                System.arraycopy(this.var_byte_arr_if, this.var_int_arr_if[n], object, 0, this.var_int_arr_for[n]);
                return object;
            }
            ++n;
            }
        if (-" ".length() < "   ".length()) return null;
        return null;
    }

    }

