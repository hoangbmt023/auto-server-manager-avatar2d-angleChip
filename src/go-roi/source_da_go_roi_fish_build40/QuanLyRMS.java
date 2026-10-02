/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Vector;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import main.AngelChip;

public final class QuanLyRMS {
    private static final int[] mangSoNguyen;
    private static final String chuoiGiaTri;

    public static String java_lang_String_do(String string) {
        return QuanLyRMS.java_lang_String_do(chuoiGiaTri, string);
    }

    public static void (String string < int n) {
        byte[] byArray = new byte[1];
        byArray[0] = (byte)n;
        (string < byArray);
    }

    private static byte[] (byte[] byArray != null) {
        if (QuanLyRMS.docDuLieu((Object)byArray)) {
            int n = 0;
            while ((n < byArray.length)) {
                int n2 = n++;
                byArray[n2] = (byte)(byArray[n2] ^ -1);
                if ("   ".length() > 0) continue;
                return null;
            }
        }
        return byArray;
    }

    private static void cfr_renamed_6() {
        mangSoNguyen = new int[11];
        0 = (74 + 85 - 41 + 28 ^ 69 + 60 - -7 + 34) & (0x65 ^ 0x12 ^ (0xE0 ^ 0xAF) ^ -" ".length());
        1 = " ".length();
        -1 = -" ".length();
        2 = "  ".length();
        5 = 0x53 ^ 0x56;
        103 = 0xD9 ^ 0xBE;
        108 = 0x65 ^ 0x32 ^ (6 ^ 0x3D);
        109 = 0x7C ^ 0x40 ^ (0xEE ^ 0xBF);
        3 = "   ".length();
        116 = 180 + 31 - 188 + 202 ^ 128 + 6 - 20 + 35;
        4 = 0x6A ^ 0x6E;
    }

    public static void void_do(String string, String string2) {
        String string3 = string2;
        string2 = string;
        string = chuoiGiaTri;
        try {
            (string, string2, string3.getBytes("UTF-8") != null);
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            (string, string2, string3.getBytes() != null);
            return;
        }
    }

    public static Vector java_util_Vector_do() {
        Vector<String> vector = new Vector<String>();
        String[] stringArray = RecordStore.listRecordStores();
        if ((stringArray != null)) {
            int n = 0;
            while ((n < stringArray.length)) {
                if ((stringArray[n].startsWith(chuoiGiaTri + "_") ? 1 : 0 == null) && (!(stringArray[n].endsWith("Coin") ? 1 : 0 != null) || (stringArray[n].endsWith("Data") ? 1 : 0 == null))) {
                    vector.addElement(stringArray[n].substring(chuoiGiaTri.length() + 1));
                }
                ++n;
                if (" ".length() < "   ".length()) continue;
                return null;
            }
        }
        return vector;
    }

    private static void (String string, String string2, byte[] byArray != null) {
        byArray = (byArray != null);
        try {
            string = RecordStore.openRecordStore((String)(string + string2), (boolean)1);
            if ((string.getNumRecords() > 0)) {
                string.setRecord(1, byArray, 0, byArray.length);
                if (((0xD5 ^ 0x8B ^ (0xFB ^ 0xB0)) & (0xF4 ^ 0x97 ^ (0xC2 ^ 0xB4) ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                string.addRecord(byArray, 0, byArray.length);
                }
            string.closeRecordStore();
            return;
        }
        catch (RecordStoreException recordStoreException) {
            return;
        }
    }

    public static void (String string < byte[] byArray) {
        try {
            string = RecordStore.openRecordStore((String)(chuoiGiaTri + string), (boolean)1);
            if ((string.getNumRecords() > 0)) {
                string.setRecord(1, byArray, 0, byArray.length);
                if (" ".length() <= ((130 + 25 - 75 + 107 ^ 151 + 112 - 239 + 139) & (0x1A ^ 0x5F ^ (0xC ^ 0x51) ^ -" ".length()))) {
                    return;
                }
            } else {
                string.addRecord(byArray, 0, byArray.length);
                }
            string.closeRecordStore();
            return;
        }
        catch (RecordStoreException recordStoreException) {
            return;
        }
    }

            /*
     * Loose catch block
     */
    public static void void_do() {
        block11: {
            Object object = QuanLyRMS.byte_arr_do("_" + (String)AngelChip.duLieuNguoiChoi.soLuong + "Coin");
            if (!(object != null)) break block11;
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            TienIchGame.var_int_if = dataInputStream.readInt();
            AutoCauCa.cfr_renamed_5 = dataInputStream.readInt();
            AutoCauCa.soLuongKhoa = dataInputStream.readInt();
            AutoCauCa.cfr_renamed_4 = dataInputStream.readInt();
            TienIchGame.soLuongKhoa = dataInputStream.readInt();
            try {
                dataInputStream.close();
                object.close();
                return;
            }
            catch (IOException iOException) {
                return;
            }
            catch (IOException iOException) {
                try {
                    QuanLyRMS.void_do("_" + (String)AngelChip.duLieuNguoiChoi.soLuong + "Coin");
                    QuanLyRMS.cfr_renamed_2();
                }
                catch (Throwable throwable) {
                    try {
                        dataInputStream.close();
                        object.close();
                        }
                    catch (IOException iOException2) {
                        }
                    if ("   ".length() < ((112 + 54 - -11 + 42 ^ 124 + 6 - 103 + 170) & (52 + 142 - 65 + 39 ^ 36 + 94 - -40 + 12 ^ -" ".length()))) {
                        return;
                    }
                    throw throwable;
                }
                try {
                    dataInputStream.close();
                    object.close();
                    return;
                }
                catch (IOException iOException3) {
                    return;
                }
            }
        }
        QuanLyRMS.cfr_renamed_2();
    }

        private static byte[] byte_arr_do(String string, String object) {
        try {
            string = RecordStore.openRecordStore((String)(string + (String)object), (boolean)0);
            object = string.getRecord(1);
            string.closeRecordStore();
            return QuanLyRMS.docDuLieu((byte[])object);
        }
        catch (RecordStoreException recordStoreException) {
            return null;
        }
    }

    public static void (String string, String string2 == null) {
        try {
            (string < string2.getBytes("UTF-8"));
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            (string < string2.getBytes());
            return;
        }
    }

    static {
        QuanLyRMS.cfr_renamed_6();
        int[] nArray = new int[5];
        nArray[0] = 103;
        nArray[1] = 108;
        nArray[2] = 109;
        nArray[3] = 116;
        nArray[4] = 0;
        chuoiGiaTri = TienIchGame.cfr_renamed_1(nArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(TienIchGame.soLuong);
            dataOutputStream.writeLong(TienIchGame.var_long_int);
            dataOutputStream.writeInt((int)TienIchGame.var_long_for);
            dataOutputStream.writeInt(TienIchGame.var_int_int);
            dataOutputStream.writeLong(TienIchGame.var_long_if);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            ("_" + (String)AngelChip.duLieuNguoiChoi.soLuong + "Data" < byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                return;
            }
            catch (IOException iOException2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                }
            catch (IOException iOException) {
                throw throwable;
            }
            if (" ".length() > ((70 + 64 - 4 + 43 ^ 122 + 75 - 91 + 29) & (153 + 155 - 207 + 138 ^ 39 + 135 - 143 + 166 ^ -" ".length()))) throw throwable;
            return;
        }
        try {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static void (DataInputStream dataInputStream != null) {
        byte by2 = dataInputStream.readByte();
        AngelChip.var_java_lang_String_arr_arr_arr_do = new String[2][by2][];
        AngelChip.var_java_lang_String_arr_arr_arr_if = new String[2][by2][];
        AngelChip.var_int_arr_arr_arr_do = new int[2][by2][];
        int n = 0;
        while ((n <  (int)by2)) {
            byte by3 = dataInputStream.readByte();
            AngelChip.var_java_lang_String_arr_arr_arr_do[0][n] = new String[by3 + 1];
            AngelChip.var_java_lang_String_arr_arr_arr_do[0][n][0] = dataInputStream.readUTF();
            AngelChip.var_java_lang_String_arr_arr_arr_if[0][n] = new String[by3];
            AngelChip.var_int_arr_arr_arr_do[0][n] = new int[by3];
            int n2 = 0;
            while ((n2 <  (int)by3)) {
                AngelChip.var_java_lang_String_arr_arr_arr_do[0][n][n2 + 1] = dataInputStream.readUTF();
                AngelChip.var_java_lang_String_arr_arr_arr_if[0][n][n2] = dataInputStream.readUTF();
                AngelChip.var_int_arr_arr_arr_do[0][n][n2] = dataInputStream.readInt();
                ++n2;
                if (-" ".length() < 0) continue;
                return;
            }
            ++n;
            if ("  ".length() > " ".length()) continue;
            return;
        }
        AngelChip.var_java_lang_String_arr_arr_arr_do[1] = AngelChip.var_java_lang_String_arr_arr_arr_do[0];
        AngelChip.var_java_lang_String_arr_arr_arr_if[1] = AngelChip.var_java_lang_String_arr_arr_arr_if[0];
        AngelChip.var_int_arr_arr_arr_do[1] = AngelChip.var_int_arr_arr_arr_do[0];
        if ((GameCanvas.var_en_do instanceof gv_0 == null)) {
            gv_0.gv_0_do().cfr_renamed_2();
        }
    }

    public static byte[] byte_arr_do(String string) {
        try {
            string = RecordStore.openRecordStore((String)(chuoiGiaTri + string), (boolean)0);
            byte[] byArray = string.getRecord(1);
            string.closeRecordStore();
            return byArray;
        }
        catch (RecordStoreException recordStoreException) {
            return null;
        }
    }

    public static void cfr_renamed_2() {
        TienIchGame.var_int_if = 0;
        AutoCauCa.cfr_renamed_5 = 0;
        AutoCauCa.soLuongKhoa = 0;
        AutoCauCa.cfr_renamed_4 = 0;
        TienIchGame.soLuongKhoa = 0;
        QuanLyRMS.cfr_renamed_3();
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_3() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(TienIchGame.var_int_if);
            dataOutputStream.writeInt(AutoCauCa.cfr_renamed_5);
            dataOutputStream.writeInt(AutoCauCa.soLuongKhoa);
            dataOutputStream.writeInt(AutoCauCa.cfr_renamed_4);
            dataOutputStream.writeInt(TienIchGame.soLuongKhoa);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            ("_" + (String)AngelChip.duLieuNguoiChoi.soLuong + "Coin" < byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            try {
                dataOutputStream.close();
                byteArrayOutputStream.close();
                return;
            }
            catch (IOException iOException2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                dataOutputStream.close();
                byteArrayOutputStream.close();
                }
            catch (IOException iOException) {
                throw throwable;
            }
            if (" ".length() >= 0) throw throwable;
            return;
        }
        try {
            dataOutputStream.close();
            byteArrayOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static void (String string, String string2 > 0) {
        if (QuanLyRMS.docDuLieu((Object)(string = (string + string2 > 0)))) {
            try {
                RecordStore.deleteRecordStore((String)string);
                return;
            }
            catch (RecordStoreException recordStoreException) {
                }
        }
    }

            public static String java_lang_String_do(String object, String string) {
        byte[] byArray = QuanLyRMS.byte_arr_do((String)object, string);
        object = byArray;
        if ((byArray == null)) {
            return null;
        }
        try {
            return new String((byte[])object, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String((byte[])object);
        }
    }

    private static String (String string > 0) {
        string = string.toLowerCase();
        String[] stringArray = RecordStore.listRecordStores();
        if ((stringArray != null)) {
            int n = 0;
            while ((n < stringArray.length)) {
                if (QuanLyRMS.luuDuLieu(string.equals(stringArray[n].toLowerCase()) ? 1 : 0)) {
                    return stringArray[n];
                }
                ++n;
                if ((0xB4 ^ 0xB0) >= 0) continue;
                return null;
            }
        }
        return null;
    }

    public static int int_do(String object) {
        byte[] byArray = QuanLyRMS.byte_arr_do((String)object);
        object = byArray;
        if ((byArray == null)) {
            return -1;
        }
        return (int)object[0];
    }

    public static String (String object == null) {
        byte[] byArray = QuanLyRMS.byte_arr_do((String)object);
        object = byArray;
        if ((byArray == null)) {
            return null;
        }
        try {
            return new String((byte[])object, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String((byte[])object);
        }
    }

    /*
     * Loose catch block
     */
    public static void cfr_renamed_4() {
        block15: {
            block16: {
                Object object = QuanLyRMS.byte_arr_do("_" + (String)AngelChip.duLieuNguoiChoi.soLuong + "Data");
                if (!(object != null)) break block16;
                object = new ByteArrayInputStream((byte[])object);
                DataInputStream dataInputStream = new DataInputStream((InputStream)object);
                TienIchGame.soLuong = dataInputStream.readInt();
                TienIchGame.var_long_int = dataInputStream.readLong();
                TienIchGame.var_long_for = dataInputStream.readInt();
                TienIchGame.var_int_int = dataInputStream.readInt();
                TienIchGame.var_long_if = dataInputStream.readLong();
                try {
                    dataInputStream.close();
                    object.close();
                    }
                catch (IOException iOException) {
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                    break block15;
                }
                if ("   ".length() < "   ".length()) {
                    return;
                }
                break block15;
                catch (IOException iOException) {
                    try {
                        QuanLyRMS.void_do("_" + (String)AngelChip.duLieuNguoiChoi.soLuong + "Data");
                        QuanLyRMS.cfr_renamed_5();
                    }
                    catch (Throwable throwable) {
                        try {
                            dataInputStream.close();
                            object.close();
                            }
                        catch (IOException iOException2) {
                            }
                        if ((0x17 ^ 0x12) <= 0) {
                            return;
                        }
                        throw throwable;
                    }
                    try {
                        dataInputStream.close();
                        object.close();
                        }
                    catch (IOException iOException3) {
                        break block15;
                    }
                    if (-(0x26 ^ 0x23) >= 0) {
                        return;
                    }
                    break block15;
                }
            }
            QuanLyRMS.cfr_renamed_5();
        }
        TienIchGame.aq_0_do().cfr_renamed_5();
    }

    public static void void_do(String string) {
        string = (chuoiGiaTri + string > 0);
        if (QuanLyRMS.docDuLieu((Object)string)) {
            try {
                RecordStore.deleteRecordStore((String)string);
                return;
            }
            catch (RecordStoreException recordStoreException) {
                }
        }
    }

    public static void cfr_renamed_5() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        TienIchGame.soLuong = AngelChip.duLieuNguoiChoi.mangSoNguyen[0];
        TienIchGame.var_long_int = calendar.getTime().getTime();
        TienIchGame.var_long_for = 0L;
        TienIchGame.var_int_int = 0;
        TienIchGame.var_long_if = System.currentTimeMillis();
        QuanLyRMS.luuDuLieu();
    }
}

