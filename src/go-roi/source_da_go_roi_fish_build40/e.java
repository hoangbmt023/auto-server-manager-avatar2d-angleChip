/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class e {
    private int soLuong;
    private byte[] var_byte_arr_do;
    private byte[] var_byte_arr_if;
    static e var_e_do;
    private String[] var_java_lang_String_arr_do;
    private int[] mangSoNguyen;
    private int var_int_if;
    private DataInputStream var_java_io_DataInputStream_do;
    private String chuoiGiaTri;
    private int[] var_int_arr_if;
    private static final int[] var_int_arr_for;
    private int soLuongKhoa;

    public static Image javax_microedition_lcdui_Image_do(String string) {
        if ((var_e_do == 0)) {
            return var_e_do.cfr_renamed_0(string + ".png");
        }
        return null;
    }

            private void (byte[] byArray == 0) {
        int n = byArray.length;
        int n2 = var_int_arr_for[1];
        while ((n2 < n)) {
            int n3 = n2;
            byArray[n3] = (byte)(byArray[n3] ^ this.var_byte_arr_if[n2 % this.var_int_if]);
            ++n2;
            if ("  ".length() == "  ".length()) continue;
            return;
        }
    }

        public static void void_do(String string) {
        var_e_do = new e(MenuChinhAvatar.java_lang_String_for() + string);
    }

    public e() {
        byte[] byArray = new byte[var_int_arr_for[0]];
        byArray[e.var_int_arr_for[1]] = var_int_arr_for[2];
        byArray[e.var_int_arr_for[3]] = var_int_arr_for[4];
        byArray[e.var_int_arr_for[5]] = var_int_arr_for[6];
        byArray[e.var_int_arr_for[7]] = var_int_arr_for[8];
        byArray[e.var_int_arr_for[9]] = var_int_arr_for[10];
        byArray[e.var_int_arr_for[11]] = var_int_arr_for[12];
        byArray[e.var_int_arr_for[13]] = var_int_arr_for[14];
        byArray[e.var_int_arr_for[15]] = var_int_arr_for[16];
        byArray[e.var_int_arr_for[17]] = var_int_arr_for[12];
        byArray[e.var_int_arr_for[18]] = var_int_arr_for[19];
        byArray[e.var_int_arr_for[20]] = var_int_arr_for[21];
        byArray[e.var_int_arr_for[22]] = var_int_arr_for[12];
        byArray[e.var_int_arr_for[23]] = var_int_arr_for[24];
        this.var_byte_arr_if = byArray;
        this.var_int_if = this.var_byte_arr_if.length;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] byte_arr_do(String object) {
        int n;
        try {
            n = var_int_arr_for[1];
        }
        catch (Exception exception) {
            return null;
        }
        while ((n < this.soLuongKhoa)) {
            if (e.cfr_renamed_1(this.var_java_lang_String_arr_do[n].compareTo((String)object))) {
                object = new byte[this.mangSoNguyen[n]];
                System.arraycopy(this.var_byte_arr_do, this.var_int_arr_if[n], object, var_int_arr_for[1], this.mangSoNguyen[n]);
                return object;
            }
            ++n;
            if ("  ".length() > " ".length()) continue;
            return null;
        }
        if ("   ".length() <= "   ".length()) return null;
        return null;
    }

    public e(String string) {
        byte[] byArray = new byte[var_int_arr_for[0]];
        byArray[e.var_int_arr_for[1]] = var_int_arr_for[2];
        byArray[e.var_int_arr_for[3]] = var_int_arr_for[4];
        byArray[e.var_int_arr_for[5]] = var_int_arr_for[6];
        byArray[e.var_int_arr_for[7]] = var_int_arr_for[8];
        byArray[e.var_int_arr_for[9]] = var_int_arr_for[10];
        byArray[e.var_int_arr_for[11]] = var_int_arr_for[12];
        byArray[e.var_int_arr_for[13]] = var_int_arr_for[14];
        byArray[e.var_int_arr_for[15]] = var_int_arr_for[16];
        byArray[e.var_int_arr_for[17]] = var_int_arr_for[12];
        byArray[e.var_int_arr_for[18]] = var_int_arr_for[19];
        byArray[e.var_int_arr_for[20]] = var_int_arr_for[21];
        byArray[e.var_int_arr_for[22]] = var_int_arr_for[12];
        byArray[e.var_int_arr_for[23]] = var_int_arr_for[24];
        this.var_byte_arr_if = byArray;
        this.var_int_if = this.var_byte_arr_if.length;
        int n = var_int_arr_for[1];
        int n2 = var_int_arr_for[1];
        this.chuoiGiaTri = string;
        this.soLuong = var_int_arr_for[1];
        this.var_java_io_DataInputStream_do = new DataInputStream(this.getClass().getResourceAsStream(this.chuoiGiaTri));
        try {
            this.soLuongKhoa = this.var_java_io_DataInputStream_do.readUnsignedByte();
            this.soLuong += var_int_arr_for[3];
            this.var_java_lang_String_arr_do = new String[this.soLuongKhoa];
            this.var_int_arr_if = new int[this.soLuongKhoa];
            this.mangSoNguyen = new int[this.soLuongKhoa];
            int n3 = var_int_arr_for[1];
            while ((n3 < this.soLuongKhoa)) {
                byte by2 = this.var_java_io_DataInputStream_do.readByte();
                byte[] byArray2 = new byte[by2];
                this.var_java_io_DataInputStream_do.read(byArray2);
                this.cfr_renamed_1(byArray2);
                this.var_java_lang_String_arr_do[n3] = new String(byArray2);
                this.var_int_arr_if[n3] = n;
                this.mangSoNguyen[n3] = this.var_java_io_DataInputStream_do.readUnsignedShort();
                n += this.mangSoNguyen[n3];
                n2 += this.mangSoNguyen[n3];
                this.soLuong += by2 + var_int_arr_for[7];
                ++n3;
                if (" ".length() == " ".length()) continue;
                throw null;
            }
            this.var_byte_arr_do = new byte[n2];
            this.var_java_io_DataInputStream_do.readFully(this.var_byte_arr_do);
            this.cfr_renamed_1(this.var_byte_arr_do);
            }
        catch (IOException iOException) {
            }
        if ((0x79 ^ 0x7D) < 0) {
            throw null;
        }
        this.cfr_renamed_0();
    }

    public static void cfr_renamed_1() {
        if ((var_e_do == 0)) {
            var_e_do.cfr_renamed_0();
            var_e_do = null;
        }
        System.gc();
    }

    static {
        e.cfr_renamed_2();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Image cfr_renamed_0(String string) {
        int n;
        try {
            n = var_int_arr_for[1];
        }
        catch (Exception exception) {
            return null;
        }
        while ((n < this.soLuongKhoa)) {
            if ((this.var_java_lang_String_arr_do[n].compareTo(string) == 0)) {
                return Image.createImage((byte[])this.var_byte_arr_do, (int)this.var_int_arr_if[n], (int)this.mangSoNguyen[n]);
            }
            ++n;
            if ("  ".length() != 0) continue;
            return null;
        }
        if ("   ".length() > "  ".length()) return null;
        return null;
    }

    private void cfr_renamed_0() {
        if ((this.var_java_io_DataInputStream_do == 0)) {
            try {
                this.var_java_io_DataInputStream_do.close();
                return;
            }
            catch (IOException iOException) {
                }
        }
    }

    private static void cfr_renamed_2() {
        var_int_arr_for = new int[25];
        e.var_int_arr_for[0] = 0x59 ^ 0x2C ^ (0x42 ^ 0x3A);
        e.var_int_arr_for[1] = (0x2A ^ 0x71) & ~(0x6C ^ 0x37);
        e.var_int_arr_for[2] = 6 ^ 0x48;
        e.var_int_arr_for[3] = " ".length();
        e.var_int_arr_for[4] = 0xE6 ^ 0x8A ^ (0x5D ^ 0x56);
        e.var_int_arr_for[5] = "  ".length();
        e.var_int_arr_for[6] = 0xAE ^ 0xC1 ^ (0xE ^ 0x14);
        e.var_int_arr_for[7] = "   ".length();
        e.var_int_arr_for[8] = 22 + 140 - 126 + 152 ^ 0 + 71 - -17 + 109;
        e.var_int_arr_for[9] = 8 ^ 0xC;
        e.var_int_arr_for[10] = 0x1E ^ 0x7B;
        e.var_int_arr_for[11] = 0x78 ^ 0x7D;
        e.var_int_arr_for[12] = 0x20 ^ 0x5E ^ (0x12 ^ 2);
        e.var_int_arr_for[13] = 0x5B ^ 0x5D;
        e.var_int_arr_for[14] = "  ".length() ^ (0x3F ^ 0x6B);
        e.var_int_arr_for[15] = 43 + 126 - 121 + 121 ^ 97 + 1 - -15 + 61;
        e.var_int_arr_for[16] = 144 + 79 - 37 + 31 ^ 121 + 157 - 127 + 33;
        e.var_int_arr_for[17] = 0x6B ^ 0x63;
        e.var_int_arr_for[18] = 0x24 ^ 0x2D;
        e.var_int_arr_for[19] = 0x76 ^ 0x3B;
        e.var_int_arr_for[20] = 104 + 110 - 166 + 107 ^ 124 + 89 - 181 + 113;
        e.var_int_arr_for[21] = 0xEA ^ 0x83;
        e.var_int_arr_for[22] = 139 + 3 - 115 + 128 ^ 86 + 15 - -3 + 40;
        e.var_int_arr_for[23] = 0x64 ^ 0x68;
        e.var_int_arr_for[24] = 0xC ^ 0x44 ^ (0xBC ^ 0x9C);
    }
}

