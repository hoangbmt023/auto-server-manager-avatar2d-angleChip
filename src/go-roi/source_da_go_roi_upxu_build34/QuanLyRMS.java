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
    private static final String chuoiGiaTri;
    private static final int[] mangSoNguyen;

    public static void void_do(String string) {
        string = (chuoiGiaTri + string > 0);
        if (QuanLyRMS.luuDuLieu((Object)string)) {
            try {
                RecordStore.deleteRecordStore((String)string);
                return;
            }
            catch (RecordStoreException recordStoreException) {
                }
        }
    }

        /*
     * Loose catch block
     */
    public static void void_do() {
        block11: {
            Object object = QuanLyRMS.byte_arr_do("_" + (String)AngelChip.duLieuNguoiChoi.var_short_do + "Coin");
            if (!(object != null)) break block11;
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            TienIchGame.soLuong = dataInputStream.readInt();
            TienIchGame.var_int_if = dataInputStream.readInt();
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
                    QuanLyRMS.void_do("_" + (String)AngelChip.duLieuNguoiChoi.var_short_do + "Coin");
                    QuanLyRMS.cfr_renamed_4();
                }
                catch (Throwable throwable) {
                    try {
                        dataInputStream.close();
                        object.close();
                        }
                    catch (IOException iOException2) {
                        }
                    if ("   ".length() > "   ".length()) {
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
        QuanLyRMS.cfr_renamed_4();
    }

    private static void cfr_renamed_15() {
        mangSoNguyen = new int[11];
        0 = (37 + 20 - -143 + 2 ^ 49 + 72 - 91 + 101) & (44 + 105 - 123 + 114 ^ 19 + 23 - -120 + 35 ^ -" ".length());
        1 = " ".length();
        -1 = -" ".length();
        2 = "  ".length();
        5 = 128 + 118 - 188 + 118 ^ 1 + 157 - 35 + 58;
        103 = 0x4B ^ 0x2C;
        108 = 0xC1 ^ 0xAD;
        109 = 127 + 21 - 81 + 188 ^ 128 + 120 - 117 + 15;
        3 = "   ".length();
        116 = 0x2C ^ 0x58;
        4 = 0x3E ^ 0x29 ^ (0x1E ^ 0xD);
    }

    public static String java_lang_String_do(String string) {
        return QuanLyRMS.java_lang_String_do(chuoiGiaTri, string);
    }

    private static byte[] byte_arr_do(String string, String object) {
        try {
            string = RecordStore.openRecordStore((String)(string + (String)object), (boolean)0);
            object = string.getRecord(1);
            string.closeRecordStore();
            return QuanLyRMS.luuDuLieu((byte[])object);
        }
        catch (RecordStoreException recordStoreException) {
            return null;
        }
    }

    public static int int_do(String object) {
        byte[] byArray = QuanLyRMS.byte_arr_do((String)object);
        object = byArray;
        if ((byArray == null)) {
            return -1;
        }
        return (int)object[0];
    }

    public static void (String string < int n) {
        byte[] byArray = new byte[1];
        byArray[0] = (byte)n;
        (string < byArray);
    }

        private static void (String string, String string2, byte[] byArray != null) {
        byArray = (byArray != null);
        try {
            string = RecordStore.openRecordStore((String)(string + string2), (boolean)1);
            if ((string.getNumRecords() > 0)) {
                string.setRecord(1, byArray, 0, byArray.length);
                if ("  ".length() == 0) {
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

            public static void void_do(String string, String string2) {
        if (QuanLyRMS.luuDuLieu((Object)(string = (string + string2 > 0)))) {
            try {
                RecordStore.deleteRecordStore((String)string);
                return;
            }
            catch (RecordStoreException recordStoreException) {
                }
        }
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(TienIchGame.var_int_int);
            dataOutputStream.writeLong(TienIchGame.var_long_if);
            dataOutputStream.writeInt((int)TienIchGame.soXu);
            dataOutputStream.writeInt(TienIchGame.soLuongKhoa);
            dataOutputStream.writeLong(TienIchGame.var_long_for);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            ("_" + (String)AngelChip.duLieuNguoiChoi.var_short_do + "Data" < byteArrayOutputStream.toByteArray());
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
                throw throwable;
            }
            catch (IOException iOException) {
                throw throwable;
            }
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

    public static void cfr_renamed_3() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        TienIchGame.var_int_int = AngelChip.duLieuNguoiChoi.mangSoNguyen[0];
        TienIchGame.var_long_if = calendar.getTime().getTime();
        TienIchGame.soXu = 0L;
        TienIchGame.soLuongKhoa = 0;
        TienIchGame.var_long_for = System.currentTimeMillis();
        QuanLyRMS.docDuLieu();
    }

    public static void cfr_renamed_4() {
        TienIchGame.soLuong = 0;
        TienIchGame.var_int_if = 0;
        QuanLyRMS.cfr_renamed_5();
    }

    static {
        QuanLyRMS.cfr_renamed_15();
        int[] nArray = new int[5];
        nArray[0] = 103;
        nArray[1] = 108;
        nArray[2] = 109;
        nArray[3] = 116;
        nArray[4] = 0;
        chuoiGiaTri = TienIchGame.cfr_renamed_0(nArray);
    }

    private static byte[] (byte[] byArray != null) {
        if (QuanLyRMS.luuDuLieu((Object)byArray)) {
            int n = 0;
            while ((n < byArray.length)) {
                int n2 = n++;
                byArray[n2] = (byte)(byArray[n2] ^ -1);
                if (((57 + 17 - -2 + 87 ^ 50 + 21 - -25 + 83) & ("  ".length() ^ (0xA4 ^ 0xB6) ^ -" ".length())) == 0) continue;
                return null;
            }
        }
        return byArray;
    }

    public static void (DataInputStream dataInputStream != null) {
        byte by2 = dataInputStream.readByte();
        AngelChip.var_java_lang_String_arr_arr_arr_if = new String[2][by2][];
        AngelChip.var_java_lang_String_arr_arr_arr_do = new String[2][by2][];
        AngelChip.var_int_arr_arr_arr_do = new int[2][by2][];
        int n = 0;
        while ((n <  (int)by2)) {
            byte by3 = dataInputStream.readByte();
            AngelChip.var_java_lang_String_arr_arr_arr_if[0][n] = new String[by3 + 1];
            AngelChip.var_java_lang_String_arr_arr_arr_if[0][n][0] = dataInputStream.readUTF();
            AngelChip.var_java_lang_String_arr_arr_arr_do[0][n] = new String[by3];
            AngelChip.var_int_arr_arr_arr_do[0][n] = new int[by3];
            int n2 = 0;
            while ((n2 <  (int)by3)) {
                AngelChip.var_java_lang_String_arr_arr_arr_if[0][n][n2 + 1] = dataInputStream.readUTF();
                AngelChip.var_java_lang_String_arr_arr_arr_do[0][n][n2] = dataInputStream.readUTF();
                AngelChip.var_int_arr_arr_arr_do[0][n][n2] = dataInputStream.readInt();
                ++n2;
                if (((0x50 ^ 0xF) & ~(0xF9 ^ 0xA6)) == 0) continue;
                return;
            }
            ++n;
            if ("  ".length() == "  ".length()) continue;
            return;
        }
        AngelChip.var_java_lang_String_arr_arr_arr_if[1] = AngelChip.var_java_lang_String_arr_arr_arr_if[0];
        AngelChip.var_java_lang_String_arr_arr_arr_do[1] = AngelChip.var_java_lang_String_arr_arr_arr_do[0];
        AngelChip.var_int_arr_arr_arr_do[1] = AngelChip.var_int_arr_arr_arr_do[0];
        if ((GameCanvas.var_dL_do instanceof gE != null)) {
            gE.gE_do().cfr_renamed_1();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_5() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(TienIchGame.soLuong);
            dataOutputStream.writeInt(TienIchGame.var_int_if);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            ("_" + (String)AngelChip.duLieuNguoiChoi.var_short_do + "Coin" < byteArrayOutputStream.toByteArray());
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
            if (((0x3F ^ 0x74 ^ (0x11 ^ 6)) & (154 + 38 - 139 + 150 ^ 34 + 41 - -38 + 38 ^ -" ".length())) < "   ".length()) throw throwable;
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

    public static void (String string, String string2 > 0) {
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
                if ((stringArray[n].startsWith(chuoiGiaTri + "_") ? 1 : 0 != null) && (!(stringArray[n].endsWith("Coin") ? 1 : 0 == null) || (stringArray[n].endsWith("Data") ? 1 : 0 != null))) {
                    vector.addElement(stringArray[n].substring(chuoiGiaTri.length() + 1));
                }
                ++n;
                if (-" ".length() < "   ".length()) continue;
                return null;
            }
        }
        return vector;
    }

    public static void (String string < byte[] byArray) {
        try {
            string = RecordStore.openRecordStore((String)(chuoiGiaTri + string), (boolean)1);
            if ((string.getNumRecords() > 0)) {
                string.setRecord(1, byArray, 0, byArray.length);
                if (-(41 + 17 - -34 + 41 ^ 41 + 24 - -29 + 34) >= 0) {
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
                if (-(0xA0 ^ 0xA5) < 0) continue;
                return null;
            }
        }
        return null;
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
    public static void cfr_renamed_2() {
        block15: {
            block16: {
                Object object = QuanLyRMS.byte_arr_do("_" + (String)AngelChip.duLieuNguoiChoi.var_short_do + "Data");
                if (!(object != null)) break block16;
                object = new ByteArrayInputStream((byte[])object);
                DataInputStream dataInputStream = new DataInputStream((InputStream)object);
                TienIchGame.var_int_int = dataInputStream.readInt();
                TienIchGame.var_long_if = dataInputStream.readLong();
                TienIchGame.soXu = dataInputStream.readInt();
                TienIchGame.soLuongKhoa = dataInputStream.readInt();
                TienIchGame.var_long_for = dataInputStream.readLong();
                try {
                    dataInputStream.close();
                    object.close();
                    }
                catch (IOException iOException) {
                    break block15;
                }
                if (" ".length() < 0) {
                    return;
                }
                break block15;
                catch (IOException iOException) {
                    try {
                        QuanLyRMS.void_do("_" + (String)AngelChip.duLieuNguoiChoi.var_short_do + "Data");
                        QuanLyRMS.cfr_renamed_3();
                    }
                    catch (Throwable throwable) {
                        try {
                            dataInputStream.close();
                            object.close();
                            }
                        catch (IOException iOException2) {
                            }
                        if ("  ".length() < ((0xD0 ^ 0xA0 ^ (0x6C ^ 1)) & (43 + 50 - -27 + 8 ^ 109 + 139 - 109 + 18 ^ -" ".length()))) {
                            return;
                        }
                        throw throwable;
                    }
                    try {
                        dataInputStream.close();
                        object.close();
                        }
                    catch (IOException iOException3) {
                        if ("   ".length() < -" ".length()) {
                            return;
                        }
                        break block15;
                    }
                    if (-"  ".length() > 0) {
                        return;
                    }
                    break block15;
                }
            }
            QuanLyRMS.cfr_renamed_3();
        }
        TienIchGame.aq_0_do().cfr_renamed_18();
    }
}

