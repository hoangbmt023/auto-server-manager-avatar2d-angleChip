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

/*
 * Renamed from j
 */
public final class j_0
implements de {
    private static final int[] mangSoNguyen;
    public String chuoiGiaTri;
    private static j_0 var_j_0_do;
    public String cfr_renamed_0;
    private byte var_byte_do;
    public static hb var_hb_do;

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
                return string2;
            }
            if (((0x66 ^ 0x2B) & ~(4 ^ 0x49)) != -" ".length()) return string2;
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
            if (-" ".length() == -" ".length()) throw throwable;
            return null;
        }
        try {
            if ((inputStream != null)) {
                inputStream.close();
            }
            if ((fileConnection != null)) {
                fileConnection.close();
            }
            return string2;
        }
        catch (IOException iOException) {
            if (-"  ".length() <= 0) return string2;
            return null;
        }
    }

    public j_0(byte by2) {
        this.var_byte_do = by2;
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
                if (-" ".length() < 0) continue;
                return null;
            }
        }
        catch (Exception exception) {
            if (!(inputStream != null)) return stringBuffer.toString();
            try {
                inputStream.close();
                }
            catch (IOException iOException) {
                if (-" ".length() == -" ".length()) return stringBuffer.toString();
                return null;
            }
            if ((0x3D ^ 0x39) > "  ".length()) return stringBuffer.toString();
            return null;
        }
        catch (Throwable throwable) {
            if (!(inputStream != null)) throw throwable;
            try {
                inputStream.close();
                }
            catch (IOException iOException) {
                throw throwable;
            }
            if ("  ".length() == "  ".length()) throw throwable;
            return null;
        }
        if (!(inputStream != null)) return stringBuffer.toString();
        try {
            inputStream.close();
            }
        catch (IOException iOException) {
            if ("  ".length() >= 0) return stringBuffer.toString();
            return null;
        }
        if ((((0x50 ^ 8) & ~(0xC0 ^ 0x98) ^ (0xD1 ^ 0x97)) & (63 + 83 - 38 + 112 ^ 141 + 90 - 136 + 59 ^ -" ".length())) == 0) return stringBuffer.toString();
        return null;
    }

    private static String java_lang_String_for() {
        String string = "";
        if (!(j_0.var_hb_do.var_java_util_Vector_do.isEmpty())) {
            Enumeration enumeration = var_hb_do.java_util_Enumeration_do();
            int n = 0;
            while ((enumeration.hasMoreElements() ? 1 : 0 != null)) {
                Object object = (String)enumeration.nextElement();
                object = (j_0)var_hb_do.java_lang_Object_do(object);
                if ((n > 0)) {
                    string = string + "\r\n";
                }
                string = string + ((j_0)object).cfr_renamed_0 + ":" + ((j_0)object).chuoiGiaTri;
                ++n;
                return null;
            }
        }
        return string;
    }

            public static void void_do(String stringArray) {
        if (!(stringArray.equals(""))) {
            stringArray = TienIchGame.java_lang_String_arr_do((String)stringArray, "\n");
            int n = 0;
            while ((n < stringArray.length)) {
                Object object = stringArray[n].trim();
                if (j_0.cfr_renamed_1(((String)object).equals("") ? 1 : 0)) {
                    int n2 = ((String)object).length() - 1;
                    if (j_0.cfr_renamed_1(((String)object).charAt(n2), 13)) {
                        object = ((String)object).substring(0, n2);
                    }
                    String string = ":";
                    if (j_0.cfr_renamed_2(((String)object).indexOf(45), -1)) {
                        string = "-";
                        if (-"  ".length() > 0) {
                            return;
                        }
                    } else if (j_0.cfr_renamed_2(((String)object).indexOf(124), -1)) {
                        string = "|";
                    }
                    if (j_0.cfr_renamed_3(((String[])(object = TienIchGame.java_lang_String_arr_do((String)object, string))).length, 2)) {
                        String string2;
                        string = object[0].trim();
                        object = object[1].trim();
                        if (!(string.equals("")) && j_0.cfr_renamed_1(((String)object).equals("") ? 1 : 0) && j_0.cfr_renamed_1(var_hb_do.boolean_do(string2 = string.toLowerCase()) ? 1 : 0)) {
                            var_hb_do.cfr_renamed_1(string2, new j_0(string, (String)object));
                        }
                    }
                }
                ++n;
                if (-"   ".length() < 0) continue;
                return;
            }
        }
    }

    public static void void_if() {
        String string = QuanLyRMS.java_lang_String_do("_avlogin");
        if (j_0.cfr_renamed_0((Object)string)) {
            j_0.void_do(string);
            return;
        }
        string = QuanLyRMS.luuDuLieu("avlogin");
        if (j_0.cfr_renamed_0((Object)string)) {
            j_0.void_do(string);
            QuanLyRMS.void_do("avlogin");
        }
        if (j_0.cfr_renamed_0((Object)(string = QuanLyRMS.java_lang_String_do("2.5.0", "listacc")))) {
            j_0.void_do(string);
            QuanLyRMS.cfr_renamed_2("2.5.0", "listacc");
        }
        if (j_0.cfr_renamed_2((string = j_0.java_lang_String_for()).length())) {
            QuanLyRMS.void_do("_avlogin", string);
        }
    }

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[11];
        0 = (0x58 ^ 4 ^ (0x41 ^ 0x3F)) & (0x27 ^ 0x15 ^ (0x66 ^ 0x76) ^ -" ".length());
        1 = " ".length();
        13 = 119 + 51 - 36 + 9 ^ 82 + 103 - 151 + 96;
        45 = 0xC7 ^ 0xA3 ^ (0x3F ^ 0x76);
        -1 = -" ".length();
        124 = 0xCB ^ 0xB7;
        2 = "  ".length();
        6 = 0x56 ^ 0x11 ^ (0x32 ^ 0x73);
        4 = 0x36 ^ 0x32;
        8 = 0x65 ^ 0x6D;
        47 = 0xB7 ^ 0xA7 ^ (0x8D ^ 0xB2);
    }

    public final void void_do() {
        switch (this.var_byte_do) {
            case -1: {
                ThongTinNhanVat.cfr_renamed_1();
                ThongTinNhanVat.cfr_renamed_3();
                return;
            }
            case 0: {
                if (j_0.cfr_renamed_0((Object)this.cfr_renamed_0) && !(this.cfr_renamed_0.equals(""))) {
                    ThongTinNhanVat.cfr_renamed_1().var_ey_0_for.cfr_renamed_1(this.cfr_renamed_0);
                }
                if (j_0.cfr_renamed_0((Object)this.chuoiGiaTri) && !(this.chuoiGiaTri.equals(""))) {
                    ThongTinNhanVat.cfr_renamed_1().var_ey_0_int.cfr_renamed_1(this.chuoiGiaTri);
                }
                ThongTinNhanVat.cfr_renamed_1().void_do(1, 0);
                return;
            }
            case 1: {
                TienIchGame.cfr_renamed_1("Nhập dữ liệu", "Mở file game này bằng WinRAR, kéo thả file acc.txt vào. Sau đó quay lại đây bấm nút bên dưới!", new j_0(2));
                return;
            }
            case 2: {
                Object object = this;
                GameCanvas.cfr_renamed_8();
                j_0.var_hb_do.var_java_util_Vector_do.removeAllElements();
                j_0.void_if();
                object = ((j_0)object).java_lang_String_if();
                if ((object != null) && j_0.cfr_renamed_1(((String)object).equals("") ? 1 : 0)) {
                    j_0.void_do((String)object);
                    j_0.void_for();
                    GameCanvas.hienThongBaoPopup("Nhập dữ liệu thành công! Cảnh báo: hãy thoát game và mở file game này bằng WinRAR xóa file acc.txt đi để tránh lộ TK");
                    return;
                }
                GameCanvas.hienThongBaoPopup("Nhập dữ liệu thất bại! File acc.txt trống rỗng.");
                return;
            }
            case 3: {
                cf cf2 = new cf();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)cf2);
                return;
            }
            case 4: {
                bf_0 bf_02 = new bf_0();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)bf_02);
                return;
            }
            case 5: {
                if (!(j_0.var_hb_do.var_java_util_Vector_do.isEmpty())) {
                    TienIchGame.cfr_renamed_1("Cảnh báo! Thao tác này sẽ Xóa Hết danh sách tài khoản đã lưu và dữ liệu up thuê của những acc này bao gồm ngày up, xu up được,... Dữ liệu đã xóa sẽ không thể khôi phục. Bạn có chắc muốn xóa không?", new fl_0("Đồng ý", new j_0(6)), new fl_0("Không", new j_0(-1)));
                    return;
                }
                GameCanvas.hienThongBaoPopup("Hiện chưa có tài khoản nào được lưu");
                return;
            }
            case 6: {
                GameCanvas.cfr_renamed_8();
                j_0.var_hb_do.var_java_util_Vector_do.removeAllElements();
                j_0.void_if();
                Vector vector = QuanLyRMS.java_util_Vector_do();
                if (!(vector.isEmpty())) {
                    int n = 0;
                    while ((n < vector.size())) {
                        String string = (String)vector.elementAt(n);
                        String string2 = string.substring(0, string.length() - 4);
                        if (!(j_0.var_hb_do.var_java_util_Vector_do.isEmpty()) && j_0.cfr_renamed_0(var_hb_do.boolean_do(string2.toLowerCase()) ? 1 : 0)) {
                            QuanLyRMS.void_do("_" + string);
                        }
                        ++n;
                        return;
                    }
                }
                if (!(j_0.var_hb_do.var_java_util_Vector_do.isEmpty())) {
                    j_0.var_hb_do.var_java_util_Vector_do.removeAllElements();
                }
                QuanLyRMS.void_do("_avlogin");
                GameCanvas.hienThongBaoPopup("Đã xóa hết danh sách tài khoản!");
                return;
            }
            case 7: {
                TienIchGame.cfr_renamed_1("Cảnh báo! Thao tác này sẽ xóa dữ liệu up thuê của những acc Không Nằm Trong danh sách tài khoản đã lưu bao gồm ngày up, xu up được,... Dữ liệu đã xóa sẽ không thể khôi phục. Bạn có chắc muốn xóa không?", new fl_0("Đồng ý", new j_0(8)), new fl_0("Không", new j_0(-1)));
                return;
            }
            case 8: {
                GameCanvas.cfr_renamed_8();
                j_0.var_hb_do.var_java_util_Vector_do.removeAllElements();
                j_0.void_if();
                Vector vector = QuanLyRMS.java_util_Vector_do();
                int n = 0;
                if (!(vector.isEmpty())) {
                    int n2 = 0;
                    while ((n2 < vector.size())) {
                        String string = (String)vector.elementAt(n2);
                        String string3 = string.substring(0, string.length() - 4);
                        if (!!(j_0.var_hb_do.var_java_util_Vector_do.isEmpty()) || j_0.cfr_renamed_1(var_hb_do.boolean_do(string3.toLowerCase()) ? 1 : 0)) {
                            QuanLyRMS.void_do("_" + string);
                            if ((string.endsWith("Data") ? 1 : 0 != null)) {
                                ++n;
                            }
                        }
                        ++n2;
                        if ((0x68 ^ 0x6C) > ((0x7F ^ 0x47) & ~(0x1C ^ 0x24))) continue;
                        return;
                    }
                }
                GameCanvas.hienThongBaoPopup("Đã xóa dữ liệu up thuê của " + n + " acc không nằm trong danh sách tài khoản đã lưu!");
            }
        }
    }

    public j_0() {
    }

            public j_0(String string, String string2) {
        this.var_byte_do = (byte)0;
        this.cfr_renamed_0 = string;
        this.chuoiGiaTri = string2;
    }

                public static String java_lang_String_do() {
        String string;
        String string2 = "file:///c/";
        Enumeration enumeration = FileSystemRegistry.listRoots();
        while ((enumeration.hasMoreElements() ? 1 : 0 != null)) {
            string = (String)enumeration.nextElement();
            if (j_0.cfr_renamed_1(string.charAt(string.length() - 1), 47)) {
                string2 = "file:///" + string;
                if (((0x33 ^ 0x3A ^ (0x97 ^ 0xB1)) & (17 + 117 - -13 + 21 ^ 17 + 37 - -48 + 33 ^ -" ".length())) <= 0) break;
                return null;
            }
            if ("  ".length() <= (0xC5 ^ 0xC1)) continue;
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
        if (-(0x13 ^ 0x66 ^ (0x26 ^ 0x57)) >= 0) {
            return null;
        }
        return string2 + "AngelChip/acc.txt";
    }

    public static j_0 j_0_do() {
        if ((var_j_0_do == 0)) {
            var_j_0_do = new j_0();
        }
        return var_j_0_do;
    }

    public static void void_for() {
        QuanLyRMS.void_do("_avlogin", j_0.java_lang_String_for());
    }

    /*
     * Loose catch block
     */
    public static void (String string != null) {
        GameCanvas.cfr_renamed_8();
        j_0.var_hb_do.var_java_util_Vector_do.removeAllElements();
        j_0.void_if();
        FileConnection fileConnection = null;
        DataOutputStream dataOutputStream = null;
        fileConnection = (FileConnection)Connector.open((String)string);
        if (!(fileConnection.exists())) {
            fileConnection.create();
        }
        dataOutputStream = fileConnection.openDataOutputStream();
        try {
            ((OutputStream)dataOutputStream).write(j_0.java_lang_String_for().getBytes("UTF-8"));
            }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            ((OutputStream)dataOutputStream).write(j_0.java_lang_String_for().getBytes());
        }
        if ("   ".length() <= 0) {
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
                if (((0x73 ^ 0x51) & ~(0x6A ^ 0x48)) != 0) {
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

    static {
        j_0.cfr_renamed_3();
        var_hb_do = new hb();
        j_0.void_if();
    }

    public static void (String string == String string2) {
        String string3 = string.toLowerCase();
        if ((var_hb_do.boolean_do(string3) ? 1 : 0 != null)) {
            var_hb_do.void_do(string3);
        }
        var_hb_do.cfr_renamed_1(string3, new j_0(string, string2));
        j_0.void_for();
    }

    public static void (String string > 0) {
        String string2 = string.toLowerCase();
        if ((var_hb_do.boolean_do(string2) ? 1 : 0 != null)) {
            var_hb_do.void_do(string2);
        }
        j_0.void_for();
        QuanLyRMS.void_do("_" + string + "Coin");
        QuanLyRMS.void_do("_" + string + "Data");
    }
}

