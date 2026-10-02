/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.file.FileConnection
 *  javax.microedition.io.file.FileSystemRegistry
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class az
implements cp {
    private static az var_az_do;
    private static final int[] mangSoNguyen;
    public String chuoiGiaTri;
    public String cfr_renamed_1;
    public static fs_0 var_fs_0_do;
    private byte var_byte_do;

                public static void (String string == String string2) {
        String string3 = string.toLowerCase();
        if ((var_fs_0_do.boolean_do(string3) ? 1 : 0 != null)) {
            var_fs_0_do.void_do(string3);
        }
        var_fs_0_do.cfr_renamed_0(string3, new az(string, string2));
        az.void_if();
    }

    public static void void_do(String stringArray) {
        if (!(stringArray.equals(""))) {
            stringArray = TienIchGame.java_lang_String_arr_do((String)stringArray, "\n");
            int n = 0;
            while ((n < stringArray.length)) {
                Object object = stringArray[n].trim();
                if (az.cfr_renamed_3(((String)object).equals("") ? 1 : 0)) {
                    int n2 = ((String)object).length() - 1;
                    if (az.cfr_renamed_0(((String)object).charAt(n2), 13)) {
                        object = ((String)object).substring(0, n2);
                    }
                    String string = ":";
                    if (az.cfr_renamed_3(((String)object).indexOf(45), -1)) {
                        string = "-";
                        if (" ".length() <= 0) {
                            return;
                        }
                    } else if (az.cfr_renamed_3(((String)object).indexOf(124), -1)) {
                        string = "|";
                    }
                    if (az.cfr_renamed_4(((String[])(object = TienIchGame.java_lang_String_arr_do((String)object, string))).length, 2)) {
                        String string2;
                        string = object[0].trim();
                        object = object[1].trim();
                        if (!(string.equals("")) && az.cfr_renamed_3(((String)object).equals("") ? 1 : 0) && az.cfr_renamed_3(var_fs_0_do.boolean_do(string2 = string.toLowerCase()) ? 1 : 0)) {
                            var_fs_0_do.cfr_renamed_0(string2, new az(string, (String)object));
                        }
                    }
                }
                ++n;
                if ("  ".length() >= 0) continue;
                return;
            }
        }
    }

    public az() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String java_lang_String_if() {
        InputStream inputStream = null;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            int n;
            inputStream = this.getClass().getResourceAsStream("/acc.txt");
            while ((n = inputStream.read() != -1)) {
                stringBuffer.append((char)n);
                if ("  ".length() == "  ".length()) continue;
                return null;
            }
        }
        catch (Exception exception) {
            if (!(inputStream != null)) return stringBuffer.toString();
            try {
                inputStream.close();
                }
            catch (IOException iOException) {
                if (-"   ".length() < 0) return stringBuffer.toString();
                return null;
            }
            if (-" ".length() == -" ".length()) return stringBuffer.toString();
            return null;
        }
        catch (Throwable throwable) {
            if (!(inputStream != null)) throw throwable;
            try {
                inputStream.close();
                throw throwable;
            }
            catch (IOException iOException) {
                throw throwable;
            }
        }
        if (!(inputStream != null)) return stringBuffer.toString();
        try {
            inputStream.close();
            }
        catch (IOException iOException) {
            if (("   ".length() & ("   ".length() ^ -" ".length())) <= "   ".length()) return stringBuffer.toString();
            return null;
        }
        if (-" ".length() == -" ".length()) return stringBuffer.toString();
        return null;
    }

    /*
     * Loose catch block
     */
    public static void (String string == null) {
        GameCanvas.cfr_renamed_5();
        az.var_fs_0_do.var_java_util_Vector_do.removeAllElements();
        az.void_for();
        FileConnection fileConnection = null;
        DataOutputStream dataOutputStream = null;
        fileConnection = (FileConnection)Connector.open((String)string);
        if (!(fileConnection.exists())) {
            fileConnection.create();
        }
        dataOutputStream = fileConnection.openDataOutputStream();
        try {
            ((OutputStream)dataOutputStream).write(az.java_lang_String_for().getBytes("UTF-8"));
            }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            ((OutputStream)dataOutputStream).write(az.java_lang_String_for().getBytes());
        }
        if (-(0x31 ^ 0x34) >= 0) {
            return;
        }
        ((OutputStream)dataOutputStream).flush();
        GameCanvas.hienThongBaoPopup("Xuất dữ liệu thành công! File được lưu tại: " + string);
        try {
            if ((fileConnection != null)) {
                fileConnection.close();
            }
            if ((dataOutputStream != null)) {
                ((OutputStream)dataOutputStream).close();
            }
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (IOException iOException) {
            try {
                GameCanvas.hienThongBaoPopup("Lỗi xuất file! Đường dẫn lưu file không hợp lệ hoặc thiết bị của bạn không hỗ trợ.");
            }
            catch (Throwable throwable) {
                try {
                    if ((fileConnection != null)) {
                        fileConnection.close();
                    }
                    if ((dataOutputStream != null)) {
                        ((OutputStream)dataOutputStream).close();
                    }
                    }
                catch (IOException iOException2) {
                    }
                if ("  ".length() < -" ".length()) {
                    return;
                }
                throw throwable;
            }
            try {
                if ((fileConnection != null)) {
                    fileConnection.close();
                }
                if ((dataOutputStream != null)) {
                    ((OutputStream)dataOutputStream).close();
                }
                return;
            }
            catch (IOException iOException3) {
                return;
            }
        }
    }

    public az(byte by2) {
        this.var_byte_do = by2;
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[11];
        0 = (0x4F ^ 0x56 ^ (0xB0 ^ 0xA3)) & (48 + 134 - 130 + 85 ^ 77 + 45 - 53 + 62 ^ -" ".length()) & ((0xDB ^ 0xBE ^ (0x7D ^ 0x29)) & (0x2C ^ 0x23 ^ (0xA5 ^ 0x9B) ^ -" ".length()) ^ -" ".length());
        1 = " ".length();
        13 = 0x80 ^ 0x8D;
        45 = 0x4A ^ 0x67;
        -1 = -" ".length();
        124 = 0x17 ^ 0x1C ^ (0x7A ^ 0xD);
        2 = "  ".length();
        6 = 0x5C ^ 0xE ^ (0xDE ^ 0x8A);
        4 = 0x26 ^ 0x22;
        8 = 0xAF ^ 0xA7;
        47 = 0x19 ^ 0x36;
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String java_lang_String_do(String string) {
        InputStream inputStream = null;
        FileConnection fileConnection = null;
        String string2 = null;
        try {
            fileConnection = (FileConnection)Connector.open((String)string, (int)1);
            if ((fileConnection.exists() ? 1 : 0 != null)) {
                int n = (int)fileConnection.fileSize();
                inputStream = fileConnection.openInputStream();
                byte[] byArray = new byte[n];
                n = inputStream.read(byArray, 0, n);
                string2 = new String(byArray, 0, n);
            }
        }
        catch (IOException iOException) {
            try {
                if ((inputStream != null)) {
                    inputStream.close();
                }
                if ((fileConnection != null)) {
                    fileConnection.close();
                }
                }
            catch (IOException iOException2) {
                if ("   ".length() == "   ".length()) return string2;
                return null;
            }
            if (" ".length() == " ".length()) return string2;
            return null;
        }
        catch (Throwable throwable) {
            try {
                if ((inputStream != null)) {
                    inputStream.close();
                }
                if ((fileConnection != null)) {
                    fileConnection.close();
                }
                }
            catch (IOException iOException) {
                throw throwable;
            }
            if ("   ".length() >= "   ".length()) throw throwable;
            return null;
        }
        try {
            if ((inputStream != null)) {
                inputStream.close();
            }
            if ((fileConnection != null)) {
                fileConnection.close();
            }
            }
        catch (IOException iOException) {
            return string2;
        }
        if (-"   ".length() < 0) return string2;
        return null;
    }

    public az(String string, String string2) {
        this.var_byte_do = (byte)0;
        this.cfr_renamed_1 = string;
        this.chuoiGiaTri = string2;
    }

        public static void void_if() {
        QuanLyRMS.cfr_renamed_3("_avlogin", az.java_lang_String_for());
    }

            public static String java_lang_String_do() {
        String string;
        String string2 = "file:///c/";
        Enumeration enumeration = FileSystemRegistry.listRoots();
        while ((enumeration.hasMoreElements() ? 1 : 0 != null)) {
            string = (String)enumeration.nextElement();
            if (az.cfr_renamed_0(string.charAt(string.length() - 1), 47)) {
                string2 = "file:///" + string;
                if (" ".length() <= " ".length()) break;
                return null;
            }
            if ("   ".length() != "  ".length()) continue;
            return null;
        }
        try {
            string = (FileConnection)Connector.open((String)(string2 + "AngelChip/"));
            if (!(string.exists())) {
                string.mkdir();
            }
            string.close();
            }
        catch (IOException iOException) {
            return string2 + "acc.txt";
        }
        if ((0xBB ^ 0xBF) > (0x54 ^ 0x50)) {
            return null;
        }
        return string2 + "AngelChip/acc.txt";
    }

    public static void void_for() {
        String string = QuanLyRMS.java_lang_String_do("_avlogin");
        if (az.cfr_renamed_0((Object)string)) {
            az.void_do(string);
            return;
        }
        string = QuanLyRMS.docDuLieu("avlogin");
        if (az.cfr_renamed_0((Object)string)) {
            az.void_do(string);
            QuanLyRMS.void_do("avlogin");
        }
        if (az.cfr_renamed_0((Object)(string = QuanLyRMS.java_lang_String_do("2.5.0", "listacc")))) {
            az.void_do(string);
            QuanLyRMS.void_do("2.5.0", "listacc");
        }
        if (az.cfr_renamed_1((string = az.java_lang_String_for()).length())) {
            QuanLyRMS.cfr_renamed_3("_avlogin", string);
        }
    }

    public static az az_do() {
        if ((var_az_do == null)) {
            var_az_do = new az();
        }
        return var_az_do;
    }

        static {
        az.cfr_renamed_4();
        var_fs_0_do = new fs_0();
        az.void_for();
    }

    public static void (String string == 0) {
        String string2 = string.toLowerCase();
        if ((var_fs_0_do.boolean_do(string2) ? 1 : 0 != null)) {
            var_fs_0_do.void_do(string2);
        }
        az.void_if();
        QuanLyRMS.void_do("_" + string + "Coin");
        QuanLyRMS.void_do("_" + string + "Data");
    }

    public final void void_do() {
        switch (this.var_byte_do) {
            case -1: {
                ThongTinNhanVat.cfr_renamed_0();
                ThongTinNhanVat.cfr_renamed_18();
                return;
            }
            case 0: {
                if (az.cfr_renamed_0((Object)this.cfr_renamed_1) && !(this.cfr_renamed_1.equals(""))) {
                    ThongTinNhanVat.cfr_renamed_0().var_gx_int.cfr_renamed_0(this.cfr_renamed_1);
                }
                if (az.cfr_renamed_0((Object)this.chuoiGiaTri) && !(this.chuoiGiaTri.equals(""))) {
                    ThongTinNhanVat.cfr_renamed_0().var_gx_if.cfr_renamed_0(this.chuoiGiaTri);
                }
                ThongTinNhanVat.cfr_renamed_0().void_do(1, 0);
                return;
            }
            case 1: {
                TienIchGame.cfr_renamed_0("Nhập dữ liệu", "Mở file game này bằng WinRAR, kéo thả file acc.txt vào. Sau đó quay lại đây bấm nút bên dưới!", new az(2));
                return;
            }
            case 2: {
                Object object = this;
                GameCanvas.cfr_renamed_5();
                az.var_fs_0_do.var_java_util_Vector_do.removeAllElements();
                az.void_for();
                object = ((az)object).java_lang_String_if();
                if ((object != null) && az.cfr_renamed_3(((String)object).equals("") ? 1 : 0)) {
                    az.void_do((String)object);
                    az.void_if();
                    GameCanvas.hienThongBaoPopup("Nhập dữ liệu thành công! Cảnh báo: hãy thoát game và mở file game này bằng WinRAR xóa file acc.txt đi để tránh lộ TK");
                    return;
                }
                GameCanvas.hienThongBaoPopup("Nhập dữ liệu thất bại! File acc.txt trống rỗng.");
                return;
            }
            case 3: {
                ag_0 ag_02 = new ag_0();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)ag_02);
                return;
            }
            case 4: {
                bc_0 bc_02 = new bc_0();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)bc_02);
                return;
            }
            case 5: {
                if (!(az.var_fs_0_do.var_java_util_Vector_do.isEmpty())) {
                    TienIchGame.cfr_renamed_1("Cảnh báo! Thao tác này sẽ Xóa Hết danh sách tài khoản đã lưu và dữ liệu up thuê của những acc này bao gồm ngày up, xu up được,... Dữ liệu đã xóa sẽ không thể khôi phục. Bạn có chắc muốn xóa không?", new ei("Đồng ý", new az(6)), new ei("Không", new az(-1)));
                    return;
                }
                GameCanvas.hienThongBaoPopup("Hiện chưa có tài khoản nào được lưu");
                return;
            }
            case 6: {
                GameCanvas.cfr_renamed_5();
                az.var_fs_0_do.var_java_util_Vector_do.removeAllElements();
                az.void_for();
                Vector vector = QuanLyRMS.java_util_Vector_do();
                if (!(vector.isEmpty())) {
                    int n = 0;
                    while ((n < vector.size())) {
                        String string = (String)vector.elementAt(n);
                        String string2 = string.substring(0, string.length() - 4);
                        if (!(az.var_fs_0_do.var_java_util_Vector_do.isEmpty()) && az.cfr_renamed_0(var_fs_0_do.boolean_do(string2.toLowerCase()) ? 1 : 0)) {
                            QuanLyRMS.void_do("_" + string);
                        }
                        ++n;
                        return;
                    }
                }
                if (!(az.var_fs_0_do.var_java_util_Vector_do.isEmpty())) {
                    az.var_fs_0_do.var_java_util_Vector_do.removeAllElements();
                }
                QuanLyRMS.void_do("_avlogin");
                GameCanvas.hienThongBaoPopup("Đã xóa hết danh sách tài khoản!");
                return;
            }
            case 7: {
                TienIchGame.cfr_renamed_1("Cảnh báo! Thao tác này sẽ xóa dữ liệu up thuê của những acc Không Nằm Trong danh sách tài khoản đã lưu bao gồm ngày up, xu up được,... Dữ liệu đã xóa sẽ không thể khôi phục. Bạn có chắc muốn xóa không?", new ei("Đồng ý", new az(8)), new ei("Không", new az(-1)));
                return;
            }
            case 8: {
                GameCanvas.cfr_renamed_5();
                az.var_fs_0_do.var_java_util_Vector_do.removeAllElements();
                az.void_for();
                Vector vector = QuanLyRMS.java_util_Vector_do();
                int n = 0;
                if (!(vector.isEmpty())) {
                    int n2 = 0;
                    while ((n2 < vector.size())) {
                        String string = (String)vector.elementAt(n2);
                        String string3 = string.substring(0, string.length() - 4);
                        if (!!(az.var_fs_0_do.var_java_util_Vector_do.isEmpty()) || az.cfr_renamed_3(var_fs_0_do.boolean_do(string3.toLowerCase()) ? 1 : 0)) {
                            QuanLyRMS.void_do("_" + string);
                            if ((string.endsWith("Data") ? 1 : 0 != null)) {
                                ++n;
                            }
                        }
                        ++n2;
                        if ("  ".length() != (0x3B ^ 0x72 ^ (8 ^ 0x45))) continue;
                        return;
                    }
                }
                GameCanvas.hienThongBaoPopup("Đã xóa dữ liệu up thuê của " + n + " acc không nằm trong danh sách tài khoản đã lưu!");
            }
        }
    }

        private static String java_lang_String_for() {
        String string = "";
        if (!(az.var_fs_0_do.var_java_util_Vector_do.isEmpty())) {
            Enumeration enumeration = var_fs_0_do.java_util_Enumeration_do();
            int n = 0;
            while ((enumeration.hasMoreElements() ? 1 : 0 != null)) {
                Object object = (String)enumeration.nextElement();
                object = (az)var_fs_0_do.java_lang_Object_do(object);
                if ((n == null)) {
                    string = string + "\r\n";
                }
                string = string + ((az)object).cfr_renamed_1 + ":" + ((az)object).chuoiGiaTri;
                ++n;
                if (-"   ".length() <= 0) continue;
                return null;
            }
        }
        return string;
    }
}

