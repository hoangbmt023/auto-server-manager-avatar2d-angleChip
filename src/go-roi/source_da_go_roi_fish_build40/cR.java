/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Hashtable;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import main.AngelChip;

public class cR
extends dF
implements Runnable {
    private static final int[] mangSoNguyen;
    public static long soXu;
    private boolean dangChayAuto;
    public static String chuoiGiaTri;
    public static boolean coTrangThai;
    private static String tenNhanVat;
    private long var_long_if;
    public fl_0 var_fl_0_do = new fl_0(MenuChinhAvatar.cfr_renamed_34, 1, this);
    private static String cfr_renamed_2;
    public fl_0 var_fl_0_if = new fl_0(MenuChinhAvatar.b, 2, this);
    protected int var_int_if;

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[64];
        1 = " ".length();
        2 = "  ".length();
        0 = (0x6E ^ 0x1F ^ (0x60 ^ 1)) & (148 + 124 - 144 + 42 ^ 17 + 174 - 35 + 30 ^ -" ".length());
        21 = (0xD9 ^ 0xBA) & ~(0x58 ^ 0x3B) ^ (0xF ^ 0x1A);
        109 = 0x32 ^ 0x5F;
        105 = 0xD6 ^ 0xBF;
        99 = 0xC2 ^ 0xA1;
        3 = "   ".length();
        114 = 0x49 ^ 0x1E ^ (0x67 ^ 0x42);
        4 = 0x2B ^ 0x2F;
        111 = 0x3D ^ 0x52;
        5 = 0x49 ^ 0x7D ^ (0x8D ^ 0xBC);
        101 = 0x25 ^ 0x40;
        6 = 0x2B ^ 0x42 ^ (0x41 ^ 0x2E);
        100 = 0x42 ^ 0x26;
        7 = 0xF ^ 8;
        8 = 95 + 174 - 154 + 85 ^ 88 + 82 - 41 + 63;
        116 = 220 + 160 - 207 + 66 ^ 78 + 74 - 68 + 71;
        9 = 0x41 ^ 0x63 ^ (0x86 ^ 0xAD);
        10 = 88 + 74 - 140 + 140 ^ 124 + 96 - 175 + 123;
        11 = 31 + 128 - 106 + 121 ^ 117 + 4 - 72 + 116;
        110 = 34 + 58 - 71 + 192 ^ 128 + 181 - 287 + 165;
        12 = 0x1B ^ 0x17;
        46 = 0x7E ^ 0x3D ^ (0xAF ^ 0xC2);
        13 = 92 + 100 - 167 + 165 ^ 21 + 148 - 55 + 65;
        112 = 0xD5 ^ 0xA5;
        14 = 0x94 ^ 0x9A;
        108 = 0x44 ^ 0x33 ^ (0xAD ^ 0xB6);
        15 = 0x43 ^ 0x4C;
        97 = 0x81 ^ 0xA6 ^ (0xE0 ^ 0xA6);
        16 = 106 + 62 - 102 + 89 ^ 91 + 65 - 61 + 44;
        17 = 0x65 ^ 0x74;
        102 = 0x47 ^ 0x21;
        18 = 0xD9 ^ 0xA4 ^ (0xFD ^ 0x92);
        19 = 0x79 ^ 0x6A;
        20 = 0x9A ^ 0x8E;
        41 = 0x5E ^ 0x77;
        200 = 109 + 13 - 73 + 130 + (21 + 82 - 46 + 97) - (170 + 179 - 227 + 91) + (0x43 ^ 0x13);
        -1 = -" ".length();
        1024 = -(0xFFFFFDFE & 0x3B7F) & (0xFFFFFFFD & 0x3D7F);
        84 = 0xA ^ 0x5E;
        129 = (0x3B ^ 0x7E) + (0xB5 ^ 0x86) - (0x73 ^ 0x47) + (0x25 ^ 0x18);
        122 = 0xC5 ^ 0xBF;
        120 = 0x2D ^ 0x55;
        127 = 121 + 39 - 47 + 14;
        86 = 0x24 ^ 0x72;
        123 = 0xF8 ^ 0xAF ^ (0x97 ^ 0xBB);
        124 = 7 ^ 0x7B;
        131 = 92 + 84 - 103 + 58;
        66 = 0x13 ^ 0x51;
        68 = 0x27 ^ 0x7D ^ (0x1A ^ 4);
        72 = 0x1D ^ 0x37 ^ (7 ^ 0x65);
        65 = 0x47 ^ 0x31 ^ (0x36 ^ 1);
        71 = 156 + 208 - 189 + 46 ^ 95 + 149 - 218 + 128;
        67 = 0x2E ^ 0x6F ^ "  ".length();
        51 = 0x5A ^ 0x69;
        59 = 0x17 ^ 0x2C;
        42 = 0x2F ^ 0x44 ^ (0x5D ^ 0x1C);
        77 = 97 + 137 - 91 + 111 ^ 9 + 30 - -34 + 106;
        125 = 0xC0 ^ 0x80 ^ (0xAB ^ 0x96);
        126 = 90 + 85 - -20 + 0 ^ 25 + 155 - 6 + 15;
        121 = 161 + 149 - 154 + 61 ^ 96 + 50 - 26 + 40;
        119 = 0x44 ^ 0x5D ^ (0xD9 ^ 0xB7);
        57 = 0x58 ^ 0x38 ^ (0x3E ^ 0x67);
    }

    protected static boolean (HttpConnection httpConnection != null) {
        if ((httpConnection.getResponseCode() == 200)) {
            return 1;
        }
        return 0;
    }

    protected static HttpConnection (String string, String string2 != null) {
        string = (HttpConnection)Connector.open((String)string, (int)3, (boolean)0);
        string.setRequestMethod("POST");
        string.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        string.setRequestProperty("User-Agent", cR.java_lang_String_do());
        string.setRequestProperty("Content-Length", String.valueOf(string2.length()));
        string.setRequestProperty("Connection", "close");
        return string;
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public cR() {
    }

            private static String java_lang_String_do() {
        String string;
        byte[] byArray = new byte[21];
        byArray[0] = 109;
        byArray[1] = 105;
        byArray[2] = 99;
        byArray[3] = 114;
        byArray[4] = 111;
        byArray[5] = 101;
        byArray[6] = 100;
        byArray[7] = 105;
        byArray[8] = 116;
        byArray[9] = 105;
        byArray[10] = 111;
        byArray[11] = 110;
        byArray[12] = 46;
        byArray[13] = 112;
        byArray[14] = 108;
        byArray[15] = 97;
        byArray[16] = 116;
        byArray[17] = 102;
        byArray[18] = 111;
        byArray[19] = 114;
        byArray[20] = 109;
        String string2 = System.getProperty(new String(byArray));
        StringBuffer stringBuffer = new StringBuffer().append(tenNhanVat).append(string2).append(41);
        if (cR.cfr_renamed_1((Object)chuoiGiaTri)) {
            string = cfr_renamed_2 + chuoiGiaTri;
            if (((0x5F ^ 0x6A) & ~(0x68 ^ 0x5D)) != ((0x84 ^ 0xBA) & ~(0x96 ^ 0xA8))) {
                return null;
            }
        } else {
            string = "";
        }
        return stringBuffer.append(string).toString();
    }

    public cR(long l, boolean bl) {
        this.var_long_if = l;
        this.dangChayAuto = bl;
        this.var_int_if = 0;
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        int n;
        block49: {
            ByteArrayOutputStream byteArrayOutputStream;
            block52: {
                FilterInputStream filterInputStream;
                block51: {
                    HttpConnection httpConnection;
                    block46: {
                        try {
                            Thread.sleep(this.var_long_if);
                            }
                        catch (InterruptedException interruptedException) {
                            }
                        httpConnection = null;
                        byteArrayOutputStream = null;
                        filterInputStream = null;
                        n = 0;
                        try {
                            httpConnection = cR.javax_microedition_io_HttpConnection_do(br_0.java_lang_String_do(2));
                            if (((httpConnection != null) ? 1 : 0 != null)) {
                                n = 0;
                                soXu = System.currentTimeMillis();
                                int n2 = (int)httpConnection.getLength();
                                filterInputStream = httpConnection.openDataInputStream();
                                if (cR.boolean_for(n2)) {
                                    byte[] byArray = new byte[n2];
                                    ((DataInputStream)filterInputStream).readFully(byArray);
                                    this.cfr_renamed_1(br_0.java_io_DataInputStream_do(byArray));
                                    if (((132 + 158 - 217 + 163 ^ 152 + 150 - 129 + 20) & ("   ".length() ^ (0x47 ^ 0x69) ^ -" ".length())) != ((164 + 40 - 97 + 87 ^ 88 + 106 - 156 + 160) & (0x10 ^ 0x5A ^ (0x17 ^ 0x59) ^ -" ".length()))) {
                                        return;
                                    }
                                    break block46;
                                } else {
                                    int n3;
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    byte[] byArray = new byte[1024];
                                    while (cR.cfr_renamed_3(n3 = ((DataInputStream)filterInputStream).read(byArray), -1)) {
                                        byteArrayOutputStream.write(byArray, 0, n3);
                                        }
                                    byteArrayOutputStream.flush();
                                    this.cfr_renamed_1(br_0.java_io_DataInputStream_do(byteArrayOutputStream.toByteArray()));
                                    if (-"  ".length() >= 0) {
                                        return;
                                    }
                                }
                                break block46;
                            }
                            n = 1;
                        }
                        catch (Exception exception) {
                            block48: {
                                block47: {
                                    n = 1;
                                    if (cR.cfr_renamed_1((Object)httpConnection)) {
                                        try {
                                            httpConnection.close();
                                            }
                                        catch (IOException iOException) {
                                            break block47;
                                        }
                                        if (" ".length() == 0) {
                                            return;
                                        }
                                    }
                                }
                                if ((filterInputStream != null)) {
                                    try {
                                        filterInputStream.close();
                                        }
                                    catch (IOException iOException) {
                                        break block48;
                                    }
                                    if (((0x52 ^ 0xB ^ (0x39 ^ 0x47)) & (141 + 129 - 173 + 56 ^ 155 + 97 - 178 + 116 ^ -" ".length())) != 0) {
                                        return;
                                    }
                                }
                            }
                            if ((byteArrayOutputStream != null)) {
                                try {
                                    byteArrayOutputStream.close();
                                    }
                                catch (IOException iOException) {
                                    }
                            }
                            break block49;
                        }
                        catch (Throwable throwable) {
                            block50: {
                                if ((httpConnection != null)) {
                                    try {
                                        httpConnection.close();
                                        }
                                    catch (IOException iOException) {
                                        break block50;
                                    }
                                    if (" ".length() < " ".length()) {
                                        return;
                                    }
                                }
                            }
                            if ((filterInputStream != null)) {
                                try {
                                    filterInputStream.close();
                                    }
                                catch (IOException iOException) {
                                    }
                            }
                            if (!(byteArrayOutputStream != null)) throw throwable;
                            try {
                                byteArrayOutputStream.close();
                                throw throwable;
                            }
                            catch (IOException iOException) {
                                throw throwable;
                            }
                        }
                    }
                    if (cR.cfr_renamed_1((Object)httpConnection)) {
                        try {
                            httpConnection.close();
                            }
                        catch (IOException iOException) {
                            break block51;
                        }
                        if (((32 + 48 - -124 + 45 ^ 24 + 141 - 20 + 43) & (0x90 ^ 0x8E ^ (0x7B ^ 0x20) ^ -" ".length())) != 0) {
                            return;
                        }
                    }
                }
                if ((filterInputStream != null)) {
                    try {
                        filterInputStream.close();
                        }
                    catch (IOException iOException) {
                        break block52;
                    }
                    if (" ".length() < 0) {
                        return;
                    }
                }
            }
            if ((byteArrayOutputStream != null)) {
                try {
                    byteArrayOutputStream.close();
                    }
                catch (IOException iOException) {
                    if ((0x7B ^ 0x7F) >= " ".length()) break block49;
                    return;
                }
            }
        }
        coTrangThai = 0;
        if (!(n != null)) return;
        if (!cR.boolean_do(this.var_int_if, 3)) {
            this.void_do();
            return;
        }
        TienIchGame.aq_0_do();
        TienIchGame.void_for();
        ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
        if ((GameCanvas.var_en_do instanceof aU != null)) {
            if ((TienIchGame.cfr_renamed_3(10000L) ? 1 : 0 != null)) {
                TienIchGame.void_if(250L);
                }
        } else {
            TienIchGame.void_if(2000L);
        }
        GameCanvas.cfr_renamed_1(br_0.java_lang_String_do(4), this.var_fl_0_do);
    }

    public final void void_for(int n) {
        switch (n) {
            case 1: {
                AngelChip.cfr_renamed_1();
                return;
            }
            case 2: {
                if (cR.cfr_renamed_1((Object)ThongTinNhanVat.cfr_renamed_1().chuoiGiaTri)) {
                    new bc_0(ThongTinNhanVat.cfr_renamed_1().chuoiGiaTri).cfr_renamed_1();
                    return;
                }
                new bc_0(br_0.java_lang_String_do(3)).cfr_renamed_1();
            }
        }
    }

    public void void_do() {
        if ((coTrangThai ? 1 : 0 != null)) {
            return;
        }
        if (cR.cfr_renamed_0((System.currentTimeMillis() - soXu, 300000L != null))) {
            GameCanvas.cfr_renamed_7();
            return;
        }
        coTrangThai = 1;
        this.var_int_if += 1;
        new Thread(this).start();
    }

    static {
        cR.cfr_renamed_0();
        coTrangThai = 0;
        int[] nArray = new int[20];
        nArray[0] = 84;
        nArray[1] = 129;
        nArray[2] = 122;
        nArray[3] = 120;
        nArray[4] = 127;
        nArray[5] = 86;
        nArray[6] = 123;
        nArray[7] = 124;
        nArray[8] = 131;
        nArray[9] = 66;
        nArray[10] = 68;
        nArray[11] = 72;
        nArray[12] = 65;
        nArray[13] = 68;
        nArray[14] = 65;
        nArray[15] = 71;
        nArray[16] = 67;
        nArray[17] = 51;
        nArray[18] = 59;
        nArray[19] = 7;
        tenNhanVat = TienIchGame.cfr_renamed_1(nArray);
        int[] nArray2 = new int[11];
        nArray2[0] = 42;
        nArray2[1] = 77;
        nArray2[2] = 127;
        nArray2[3] = 125;
        nArray2[4] = 126;
        nArray2[5] = 121;
        nArray2[6] = 119;
        nArray2[7] = 111;
        nArray2[8] = 124;
        nArray2[9] = 57;
        nArray2[10] = 9;
        cfr_renamed_2 = TienIchGame.cfr_renamed_1(nArray2);
        soXu = 0L;
    }

    protected static HttpConnection javax_microedition_io_HttpConnection_do(String string) {
        string = (HttpConnection)Connector.open((String)string, (int)1, (boolean)0);
        string.setRequestProperty("Content-Type", "text/plain");
        string.setRequestProperty("User-Agent", cR.java_lang_String_do());
        string.setRequestProperty("Connection", "close");
        return string;
    }

    private static boolean boolean_for(int n) {
        return n > 0;
    }

            private static boolean boolean_int(int n) {
        return n == 0;
    }

    private void (DataInputStream dataInputStream != null) {
        switch (dataInputStream.readByte()) {
            case 0: {
                String string = dataInputStream.readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_for();
                ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
                if ((GameCanvas.var_en_do instanceof aU != null)) {
                    coTrangThai = 0;
                    if ((TienIchGame.cfr_renamed_3(10000L) ? 1 : 0 != null)) {
                        TienIchGame.void_if(250L);
                        if ("  ".length() < " ".length()) {
                            return;
                        }
                    }
                } else {
                    TienIchGame.void_if(2000L);
                }
                TienIchGame.cfr_renamed_1(string, go_0.go_0_do().var_fl_0_if, this.var_fl_0_do);
                return;
            }
            case 1: {
                String string = dataInputStream.readUTF();
                String string2 = dataInputStream.readUTF();
                String string3 = dataInputStream.readUTF();
                QuanLyRMS.docDuLieu(dataInputStream);
                br_0.cfr_renamed_1(dataInputStream);
                TienIchGame.chuoiGiaTri = dataInputStream.readUTF();
                AutoCauCa.mangSoNguyen[5] = dataInputStream.readByte();
                AutoCauCa.mangSoNguyen[14] = dataInputStream.readByte();
                AutoCauCa.mangSoNguyen[15] = dataInputStream.readByte();
                AutoCauCa.mangSoNguyen[16] = dataInputStream.readByte();
                int n = 0;
                while (cR.boolean_if(n, ax.var_java_lang_String_arr_do.length)) {
                    ax.var_java_lang_String_arr_do[n] = dataInputStream.readUTF();
                    ++n;
                    if (((0xCD ^ 0x89 ^ (0x14 ^ 0x76)) & (72 + 29 - -21 + 9 ^ 94 + 9 - 1 + 63 ^ -" ".length())) < (0x32 ^ 0x61 ^ (0x72 ^ 0x25))) continue;
                    return;
                }
                ax.var_byte_do = dataInputStream.readByte();
                TienIchGame.var_byte_do = dataInputStream.readByte();
                ThongTinNhanVat.var_byte_do = dataInputStream.readByte();
                af_0.soLuong = dataInputStream.readInt();
                fm_0.var_int_arr_arr_do[0] = new int[dataInputStream.readByte()];
                n = 0;
                while (cR.boolean_if(n, fm_0.var_int_arr_arr_do[0].length)) {
                    fm_0.var_int_arr_arr_do[0][n] = dataInputStream.readByte();
                    ++n;
                    if ("  ".length() > 0) continue;
                    return;
                }
                fm_0.var_int_arr_arr_do[1] = new int[dataInputStream.readByte()];
                n = 0;
                while (cR.boolean_if(n, fm_0.var_int_arr_arr_do[1].length)) {
                    fm_0.var_int_arr_arr_do[1][n] = dataInputStream.readByte();
                    ++n;
                    if (" ".length() < "   ".length()) continue;
                    return;
                }
                fm_0.var_int_arr_arr_do[2] = new int[dataInputStream.readByte()];
                n = 0;
                while (cR.boolean_if(n, fm_0.var_int_arr_arr_do[2].length)) {
                    fm_0.var_int_arr_arr_do[2][n] = dataInputStream.readByte();
                    ++n;
                    if (" ".length() > -" ".length()) continue;
                    return;
                }
                fm_0.var_int_arr_arr_do[3] = new int[dataInputStream.readByte()];
                n = 0;
                while (cR.boolean_if(n, fm_0.var_int_arr_arr_do[3].length)) {
                    fm_0.var_int_arr_arr_do[3][n] = dataInputStream.readByte();
                    ++n;
                    if (-" ".length() <= "   ".length()) continue;
                    return;
                }
                if (cR.boolean_int(al.var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
                    al.var_java_util_Vector_do.removeAllElements();
                }
                n = dataInputStream.readByte();
                int n2 = 0;
                while (cR.boolean_if(n2, n)) {
                    al.var_java_util_Vector_do.addElement(new gi_0(dataInputStream.readInt(), dataInputStream.readUTF()));
                    ++n2;
                    if (-"  ".length() <= 0) continue;
                    return;
                }
                chuoiGiaTri = string + TienIchGame.chuoiGiaTri;
                if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != null)) {
                    ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)ThongTinNhanVat.cfr_renamed_1().var_fl_0_for;
                    ThongTinNhanVat.cfr_renamed_1().var_int_int = (int)ThongTinNhanVat.cfr_renamed_1().var_fl_0_do;
                }
                if ((this.dangChayAuto ? 1 : 0 != null) && cR.boolean_for(string2.length())) {
                    if ((GameCanvas.var_en_do instanceof aU != null)) {
                        coTrangThai = 0;
                        if ((TienIchGame.cfr_renamed_3(10000L) ? 1 : 0 != null)) {
                            TienIchGame.void_if(250L);
                        }
                    }
                    GameCanvas.var_s_do.cfr_renamed_1(string2, new fl_0(string3, -1), null);
                    if (" ".length() <= ((0x46 ^ 0x1D ^ (0x6A ^ 0x1B)) & (0x3A ^ 0x46 ^ (0x5A ^ 0xC) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    GameCanvas.cfr_renamed_7();
                }
                if (!(AutoController.nhiemVuHienTai != null) || !(AutoController.nhiemVuHienTai instanceof AutoCauCa != null)) break;
                AutoCauCa.bs_0_do();
                AutoCauCa.cfr_renamed_3();
                return;
            }
            case 2: {
                String string = dataInputStream.readUTF();
                String string4 = dataInputStream.readUTF();
                String string5 = dataInputStream.readUTF();
                String string6 = dataInputStream.readUTF();
                ThongTinNhanVat.cfr_renamed_1().chuoiGiaTri = dataInputStream.readUTF();
                QuanLyRMS.docDuLieu(dataInputStream);
                br_0.cfr_renamed_1(dataInputStream);
                TienIchGame.chuoiGiaTri = dataInputStream.readUTF();
                AutoCauCa.mangSoNguyen[5] = dataInputStream.readByte();
                AutoCauCa.mangSoNguyen[14] = dataInputStream.readByte();
                AutoCauCa.mangSoNguyen[15] = dataInputStream.readByte();
                AutoCauCa.mangSoNguyen[16] = dataInputStream.readByte();
                int n = 0;
                while (cR.boolean_if(n, ax.var_java_lang_String_arr_do.length)) {
                    ax.var_java_lang_String_arr_do[n] = dataInputStream.readUTF();
                    ++n;
                    if (" ".length() >= 0) continue;
                    return;
                }
                ax.var_byte_do = dataInputStream.readByte();
                TienIchGame.var_byte_do = dataInputStream.readByte();
                ThongTinNhanVat.var_byte_do = dataInputStream.readByte();
                af_0.soLuong = dataInputStream.readInt();
                fm_0.var_int_arr_arr_do[0] = new int[dataInputStream.readByte()];
                n = 0;
                while (cR.boolean_if(n, fm_0.var_int_arr_arr_do[0].length)) {
                    fm_0.var_int_arr_arr_do[0][n] = dataInputStream.readByte();
                    ++n;
                    if (-" ".length() <= -" ".length()) continue;
                    return;
                }
                fm_0.var_int_arr_arr_do[1] = new int[dataInputStream.readByte()];
                n = 0;
                while (cR.boolean_if(n, fm_0.var_int_arr_arr_do[1].length)) {
                    fm_0.var_int_arr_arr_do[1][n] = dataInputStream.readByte();
                    ++n;
                    if (-(0x3E ^ 0x12 ^ (0xBA ^ 0x92)) < 0) continue;
                    return;
                }
                fm_0.var_int_arr_arr_do[2] = new int[dataInputStream.readByte()];
                n = 0;
                while (cR.boolean_if(n, fm_0.var_int_arr_arr_do[2].length)) {
                    fm_0.var_int_arr_arr_do[2][n] = dataInputStream.readByte();
                    ++n;
                    if ((" ".length() & (" ".length() ^ -" ".length())) == 0) continue;
                    return;
                }
                fm_0.var_int_arr_arr_do[3] = new int[dataInputStream.readByte()];
                n = 0;
                while (cR.boolean_if(n, fm_0.var_int_arr_arr_do[3].length)) {
                    fm_0.var_int_arr_arr_do[3][n] = dataInputStream.readByte();
                    ++n;
                    if (((0xFE ^ 0x94 ^ (0x31 ^ 0x6A)) & (0x58 ^ 0x21 ^ (0x58 ^ 0x10) ^ -" ".length())) <= 0) continue;
                    return;
                }
                if (cR.boolean_int(al.var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
                    al.var_java_util_Vector_do.removeAllElements();
                }
                n = dataInputStream.readByte();
                int n3 = 0;
                while (cR.boolean_if(n3, n)) {
                    al.var_java_util_Vector_do.addElement(new gi_0(dataInputStream.readInt(), dataInputStream.readUTF()));
                    ++n3;
                    if ((0 + 82 - 66 + 161 ^ 87 + 145 - 173 + 122) > 0) continue;
                    return;
                }
                chuoiGiaTri = string + TienIchGame.chuoiGiaTri;
                if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != null)) {
                    ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)ThongTinNhanVat.cfr_renamed_1().var_fl_0_for;
                    ThongTinNhanVat.cfr_renamed_1().var_int_int = (int)ThongTinNhanVat.cfr_renamed_1().var_fl_0_do;
                }
                if ((this.dangChayAuto ? 1 : 0 != null) && cR.boolean_for(string4.length())) {
                    if ((GameCanvas.var_en_do instanceof aU != null)) {
                        coTrangThai = 0;
                        if ((TienIchGame.cfr_renamed_3(10000L) ? 1 : 0 != null)) {
                            TienIchGame.void_if(250L);
                        }
                    }
                    GameCanvas.cfr_renamed_1(string4, new fl_0(string5, 2, this), new fl_0(string6, -1));
                    if ((0xC0 ^ 0xA2 ^ (0x4A ^ 0x2D)) <= 0) {
                        return;
                    }
                } else {
                    GameCanvas.cfr_renamed_7();
                }
                if (!(AutoController.nhiemVuHienTai != null) || !(AutoController.nhiemVuHienTai instanceof AutoCauCa != null)) break;
                AutoCauCa.bs_0_do();
                AutoCauCa.cfr_renamed_3();
                return;
            }
            case 3: {
                String string = dataInputStream.readUTF();
                String string7 = dataInputStream.readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_for();
                ThongTinNhanVat.cfr_renamed_1().chuoiGiaTri = dataInputStream.readUTF();
                ab_0.var_ab_0_do = null;
                ab_0.cfr_renamed_1().cfr_renamed_1(new Hashtable(), string, string7, -1);
                if ((GameCanvas.var_en_do instanceof aU != null)) {
                    coTrangThai = 0;
                    if ((TienIchGame.cfr_renamed_3(10000L) ? 1 : 0 != null)) {
                        TienIchGame.void_if(250L);
                        if ((0x57 ^ 0x53) == 0) {
                            return;
                        }
                    }
                } else {
                    TienIchGame.void_if(2000L);
                }
                GameCanvas.cfr_renamed_7();
                GameCanvas.var_ez_do = ab_0.cfr_renamed_1();
                ab_0.cfr_renamed_1().cfr_renamed_5 = (int)this.var_fl_0_if;
                ab_0.cfr_renamed_1().cfr_renamed_4 = (int)this.var_fl_0_do;
                return;
            }
            case -1: {
                String string = dataInputStream.readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_for();
                ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
                if ((GameCanvas.var_en_do instanceof aU != null)) {
                    coTrangThai = 0;
                    if ((TienIchGame.cfr_renamed_3(10000L) ? 1 : 0 != null)) {
                        TienIchGame.void_if(250L);
                        if (-" ".length() >= ((5 + 93 - 58 + 113 ^ 127 + 127 - 233 + 124) & (8 + 50 - -63 + 17 ^ 83 + 14 - -11 + 22 ^ -" ".length()))) {
                            return;
                        }
                    }
                } else {
                    TienIchGame.void_if(2000L);
                }
                GameCanvas.cfr_renamed_1(string, this.var_fl_0_do);
            }
        }
    }
}

