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

public class cd
extends bn_0
implements Runnable {
    private static String tenNhanVat;
    protected int soLuong;
    private long var_long_if;
    public static long soXu;
    public static boolean dangChayAuto;
    private static final int[] mangSoNguyen;
    public ei var_ei_do;
    public static String chuoiGiaTri;
    public ei var_ei_if = new ei(MenuChinhAvatar.aY, 1, this);
    private boolean coTrangThai;
    private static String cfr_renamed_3;

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void void_if(int n) {
        switch (n) {
            case 1: {
                AngelChip.cfr_renamed_0();
                return;
            }
            case 2: {
                if (cd.cfr_renamed_0((Object)ThongTinNhanVat.cfr_renamed_0().tenNhanVat)) {
                    new az_0(ThongTinNhanVat.cfr_renamed_0().tenNhanVat).cfr_renamed_0();
                    return;
                }
                new az_0(bl_0.java_lang_String_do(3)).cfr_renamed_0();
            }
        }
    }

    public cd(long l, boolean bl) {
        this.var_ei_do = new ei(MenuChinhAvatar.var_java_lang_String_byte, 2, this);
        this.var_long_if = l;
        this.coTrangThai = bl;
        this.soLuong = 0;
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    public cd() {
        this.var_ei_do = new ei(MenuChinhAvatar.var_java_lang_String_byte, 2, this);
    }

    public void cfr_renamed_4() {
        if (cd.boolean_if(dangChayAuto ? 1 : 0)) {
            return;
        }
        if (cd.cfr_renamed_4((System.currentTimeMillis() - soXu, 300000L != null))) {
            GameCanvas.cfr_renamed_8();
            return;
        }
        dangChayAuto = 1;
        this.soLuong += 1;
        new Thread(this).start();
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[65];
        1 = " ".length();
        2 = "  ".length();
        0 = (0x52 ^ 0x18 ^ (0x3D ^ 0x59)) & (0xF ^ 0x15 ^ (0x5B ^ 0x6F) ^ -" ".length());
        21 = 0x1E ^ 0xB;
        109 = 0x64 ^ 9;
        105 = 0x7F ^ 0x16;
        99 = 74 + 149 - 15 + 17 ^ 83 + 94 - 67 + 20;
        3 = "   ".length();
        114 = 0x92 ^ 0xC4 ^ (0x10 ^ 0x34);
        4 = 0x22 ^ 0x74 ^ (0x28 ^ 0x7A);
        111 = 0xF6 ^ 0x99;
        5 = 0x41 ^ 2 ^ (0xFD ^ 0xBB);
        101 = 214 + 128 - 292 + 203 ^ 36 + 79 - 95 + 132;
        6 = 0x14 ^ 0x30 ^ (0 ^ 0x22);
        100 = 0x76 ^ 0x6A ^ (0xB9 ^ 0xC1);
        7 = 0x6A ^ 0x6D;
        8 = 0xBF ^ 0xB7;
        116 = 58 + 207 - 135 + 81 ^ 59 + 78 - 67 + 97;
        9 = 0x1B ^ 0x3B ^ (0x6F ^ 0x46);
        10 = 0x12 ^ 0x4A ^ (0x4F ^ 0x1D);
        11 = 97 + 124 - 160 + 84 ^ 12 + 46 - -11 + 85;
        110 = "  ".length() ^ (0xDA ^ 0xB6);
        12 = 0x10 ^ 0xD ^ (0xB6 ^ 0xA7);
        46 = 0xA0 ^ 0x8E;
        13 = 3 ^ 0xE;
        112 = 0xD3 ^ 0xA3;
        14 = 133 + 158 - 214 + 82 ^ 142 + 81 - 161 + 83;
        108 = 0xD6 ^ 0xBA;
        15 = 0x5F ^ 0x71 ^ (0xE0 ^ 0xC1);
        97 = 0xE7 ^ 0x86;
        16 = 81 + 116 - 183 + 121 ^ 80 + 31 - 99 + 139;
        17 = 0x92 ^ 0x83;
        102 = 0x3D ^ 0x5B;
        18 = 0x45 ^ 0x7B ^ (0xA0 ^ 0x8C);
        19 = 0x8F ^ 0x9C;
        20 = 0xD7 ^ 0xBB ^ (0x60 ^ 0x18);
        41 = 130 + 118 - 124 + 8 ^ 87 + 150 - 163 + 99;
        200 = 46 + 183 - 68 + 39;
        -1 = -" ".length();
        1024 = 0xFFFFA5FE & 0x5E01;
        84 = 0xE2 ^ 0xC7 ^ (0x7E ^ 0xF);
        129 = 88 + 65 - 123 + 99;
        122 = 0x60 ^ 0x1A;
        120 = 153 + 93 - 39 + 37 ^ 20 + 45 - -75 + 0;
        127 = (0x4C ^ 0x5E) + (0xF0 ^ 0xAD) - (0x16 ^ 0x52) + (0xF7 ^ 0xA3);
        86 = 0xC4 ^ 0x92;
        123 = 212 + 110 - 301 + 211 ^ 68 + 131 - 73 + 21;
        124 = 0x77 ^ 0xB;
        131 = (0x7E ^ 0x10) + (0x4A ^ 0x37) - (96 + 18 - 91 + 196) + (0xD7 ^ 0xA4);
        66 = 79 + 76 - 132 + 190 ^ 7 + 76 - -47 + 21;
        68 = 0x4C ^ 0x28 ^ (4 ^ 0x24);
        69 = 0x3E ^ 0x7B;
        65 = 0x5B ^ 0x1A;
        67 = 0x84 ^ 0xC7;
        70 = 0x23 ^ 0x65;
        71 = 0x5B ^ 0x1C;
        51 = 10 + 25 - -106 + 22 ^ 31 + 62 - -30 + 21;
        59 = 0x2D ^ 0x16;
        42 = 3 + 157 - -26 + 3 ^ 137 + 94 - 224 + 144;
        77 = 0x33 ^ 0x3F ^ (0x76 ^ 0x37);
        125 = 0xE3 ^ 0xA9 ^ (0xBC ^ 0x8B);
        126 = 0x95 ^ 0xA0 ^ (0x2D ^ 0x66);
        121 = 120 + 6 - 71 + 135 ^ 121 + 52 - 98 + 124;
        119 = 162 + 17 - 136 + 176 ^ 104 + 116 - 126 + 78;
        57 = 0xA ^ 0x4D ^ (0x61 ^ 0x1F);
    }

    protected static HttpConnection (String string, String string2 != null) {
        string = (HttpConnection)Connector.open((String)string, (int)3, (boolean)0);
        string.setRequestMethod("POST");
        string.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        string.setRequestProperty("User-Agent", cd.cfr_renamed_0());
        string.setRequestProperty("Content-Length", String.valueOf(string2.length()));
        string.setRequestProperty("Connection", "close");
        return string;
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

        protected static HttpConnection (String string != null) {
        string = (HttpConnection)Connector.open((String)string, (int)1, (boolean)0);
        string.setRequestProperty("Content-Type", "text/plain");
        string.setRequestProperty("User-Agent", cd.cfr_renamed_0());
        string.setRequestProperty("Connection", "close");
        return string;
    }

        private void (DataInputStream dataInputStream != null) {
        switch (dataInputStream.readByte()) {
            case 0: {
                String string = dataInputStream.readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_if();
                ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)this.var_ei_do;
                if (cd.boolean_if(GameCanvas.var_dL_do instanceof w)) {
                    dangChayAuto = 0;
                    if (cd.boolean_if(TienIchGame.cfr_renamed_8(10000L) ? 1 : 0)) {
                        TienIchGame.hienThongBao(250L);
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                    }
                } else {
                    TienIchGame.hienThongBao(2000L);
                }
                TienIchGame.cfr_renamed_1(string, fe_0.fe_0_do().var_ei_if, this.var_ei_if);
                return;
            }
            case 1: {
                String string = dataInputStream.readUTF();
                String string2 = dataInputStream.readUTF();
                String string3 = dataInputStream.readUTF();
                QuanLyRMS.luuDuLieu(dataInputStream);
                bl_0.cfr_renamed_0(dataInputStream);
                TienIchGame.tenNhanVat = dataInputStream.readUTF();
                int n = 0;
                while (cd.boolean_do(n, ad.var_java_lang_String_arr_do.length)) {
                    ad.var_java_lang_String_arr_do[n] = dataInputStream.readUTF();
                    ++n;
                    if (((36 + 134 - 106 + 135 ^ 38 + 45 - -22 + 23) & (168 + 43 - 138 + 126 ^ 4 + 100 - 66 + 90 ^ -" ".length())) == 0) continue;
                    return;
                }
                ad.var_byte_do = dataInputStream.readByte();
                AutoTaiXiu.soLuong = dataInputStream.readByte();
                gp_0.var_int_arr_arr_do[0] = new int[dataInputStream.readByte()];
                n = 0;
                while (cd.boolean_do(n, gp_0.var_int_arr_arr_do[0].length)) {
                    gp_0.var_int_arr_arr_do[0][n] = dataInputStream.readByte();
                    ++n;
                    if (((0x54 ^ 0x12) & ~(0x7E ^ 0x38)) >= 0) continue;
                    return;
                }
                gp_0.var_int_arr_arr_do[1] = new int[dataInputStream.readByte()];
                n = 0;
                while (cd.boolean_do(n, gp_0.var_int_arr_arr_do[1].length)) {
                    gp_0.var_int_arr_arr_do[1][n] = dataInputStream.readByte();
                    ++n;
                    return;
                }
                gp_0.var_int_arr_arr_do[2] = new int[dataInputStream.readByte()];
                n = 0;
                while (cd.boolean_do(n, gp_0.var_int_arr_arr_do[2].length)) {
                    gp_0.var_int_arr_arr_do[2][n] = dataInputStream.readByte();
                    ++n;
                    if (-" ".length() <= 0) continue;
                    return;
                }
                gp_0.var_int_arr_arr_do[3] = new int[dataInputStream.readByte()];
                n = 0;
                while (cd.boolean_do(n, gp_0.var_int_arr_arr_do[3].length)) {
                    gp_0.var_int_arr_arr_do[3][n] = dataInputStream.readByte();
                    ++n;
                    if ("  ".length() < "   ".length()) continue;
                    return;
                }
                ThongTinNhanVat.var_byte_do = dataInputStream.readByte();
                T.soLuong = dataInputStream.readInt();
                if (!(Z.var_java_util_Vector_do.isEmpty())) {
                    Z.var_java_util_Vector_do.removeAllElements();
                }
                n = dataInputStream.readByte();
                int n2 = 0;
                while (cd.boolean_do(n2, n)) {
                    Z.var_java_util_Vector_do.addElement(new fa_0(dataInputStream.readInt(), dataInputStream.readUTF()));
                    ++n2;
                    return;
                }
                chuoiGiaTri = string + TienIchGame.tenNhanVat;
                if (cd.boolean_if(GameCanvas.var_dL_do instanceof ThongTinNhanVat)) {
                    ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)ThongTinNhanVat.cfr_renamed_0().var_ei_do;
                    ThongTinNhanVat.cfr_renamed_0().var_int_new = (int)ThongTinNhanVat.cfr_renamed_0().var_ei_for;
                }
                if (cd.boolean_if(this.coTrangThai ? 1 : 0) && cd.boolean_do(string2.length())) {
                    if (cd.boolean_if(GameCanvas.var_dL_do instanceof w)) {
                        dangChayAuto = 0;
                        if (cd.boolean_if(TienIchGame.cfr_renamed_8(10000L) ? 1 : 0)) {
                            TienIchGame.hienThongBao(250L);
                        }
                    }
                    GameCanvas.var_h_0_do.cfr_renamed_1(string2, new ei(string3, -1), null);
                    return;
                }
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 2: {
                String string = dataInputStream.readUTF();
                String string4 = dataInputStream.readUTF();
                String string5 = dataInputStream.readUTF();
                String string6 = dataInputStream.readUTF();
                ThongTinNhanVat.cfr_renamed_0().tenNhanVat = dataInputStream.readUTF();
                QuanLyRMS.luuDuLieu(dataInputStream);
                bl_0.cfr_renamed_0(dataInputStream);
                TienIchGame.tenNhanVat = dataInputStream.readUTF();
                int n = 0;
                while (cd.boolean_do(n, ad.var_java_lang_String_arr_do.length)) {
                    ad.var_java_lang_String_arr_do[n] = dataInputStream.readUTF();
                    ++n;
                    if ((122 + 152 - 157 + 74 ^ 78 + 119 - 149 + 139) > "  ".length()) continue;
                    return;
                }
                ad.var_byte_do = dataInputStream.readByte();
                AutoTaiXiu.soLuong = dataInputStream.readByte();
                gp_0.var_int_arr_arr_do[0] = new int[dataInputStream.readByte()];
                n = 0;
                while (cd.boolean_do(n, gp_0.var_int_arr_arr_do[0].length)) {
                    gp_0.var_int_arr_arr_do[0][n] = dataInputStream.readByte();
                    ++n;
                    if ("  ".length() > -" ".length()) continue;
                    return;
                }
                gp_0.var_int_arr_arr_do[1] = new int[dataInputStream.readByte()];
                n = 0;
                while (cd.boolean_do(n, gp_0.var_int_arr_arr_do[1].length)) {
                    gp_0.var_int_arr_arr_do[1][n] = dataInputStream.readByte();
                    ++n;
                    if ((0x49 ^ 0x31 ^ (0x66 ^ 0x1A)) > 0) continue;
                    return;
                }
                gp_0.var_int_arr_arr_do[2] = new int[dataInputStream.readByte()];
                n = 0;
                while (cd.boolean_do(n, gp_0.var_int_arr_arr_do[2].length)) {
                    gp_0.var_int_arr_arr_do[2][n] = dataInputStream.readByte();
                    ++n;
                    if ("   ".length() >= "  ".length()) continue;
                    return;
                }
                gp_0.var_int_arr_arr_do[3] = new int[dataInputStream.readByte()];
                n = 0;
                while (cd.boolean_do(n, gp_0.var_int_arr_arr_do[3].length)) {
                    gp_0.var_int_arr_arr_do[3][n] = dataInputStream.readByte();
                    ++n;
                    if ("   ".length() >= -" ".length()) continue;
                    return;
                }
                ThongTinNhanVat.var_byte_do = dataInputStream.readByte();
                T.soLuong = dataInputStream.readInt();
                if (!(Z.var_java_util_Vector_do.isEmpty())) {
                    Z.var_java_util_Vector_do.removeAllElements();
                }
                n = dataInputStream.readByte();
                int n3 = 0;
                while (cd.boolean_do(n3, n)) {
                    Z.var_java_util_Vector_do.addElement(new fa_0(dataInputStream.readInt(), dataInputStream.readUTF()));
                    ++n3;
                    return;
                }
                chuoiGiaTri = string + TienIchGame.tenNhanVat;
                if (cd.boolean_if(GameCanvas.var_dL_do instanceof ThongTinNhanVat)) {
                    ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)ThongTinNhanVat.cfr_renamed_0().var_ei_do;
                    ThongTinNhanVat.cfr_renamed_0().var_int_new = (int)ThongTinNhanVat.cfr_renamed_0().var_ei_for;
                }
                if (cd.boolean_if(this.coTrangThai ? 1 : 0) && cd.boolean_do(string4.length())) {
                    if (cd.boolean_if(GameCanvas.var_dL_do instanceof w)) {
                        dangChayAuto = 0;
                        if (cd.boolean_if(TienIchGame.cfr_renamed_8(10000L) ? 1 : 0)) {
                            TienIchGame.hienThongBao(250L);
                        }
                    }
                    GameCanvas.hienThongBaoPopup(string4, new ei(string5, 2, this), new ei(string6, -1));
                    return;
                }
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 3: {
                String string = dataInputStream.readUTF();
                String string7 = dataInputStream.readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_if();
                ThongTinNhanVat.cfr_renamed_0().tenNhanVat = dataInputStream.readUTF();
                p_0.var_p_0_do = null;
                p_0.p_0_do().cfr_renamed_0(new Hashtable(), string, string7, -1);
                if (cd.boolean_if(GameCanvas.var_dL_do instanceof w)) {
                    dangChayAuto = 0;
                    if (cd.boolean_if(TienIchGame.cfr_renamed_8(10000L) ? 1 : 0)) {
                        TienIchGame.hienThongBao(250L);
                        if ("   ".length() > (0x79 ^ 0x23 ^ (0xC1 ^ 0x9F))) {
                            return;
                        }
                    }
                } else {
                    TienIchGame.hienThongBao(2000L);
                }
                GameCanvas.cfr_renamed_8();
                GameCanvas.var_dX_do = p_0.p_0_do();
                p_0.p_0_do().cfr_renamed_4 = (int)this.var_ei_do;
                p_0.p_0_do().cfr_renamed_2 = (int)this.var_ei_if;
                return;
            }
            case -1: {
                String string = dataInputStream.readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_if();
                ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)this.var_ei_do;
                if (cd.boolean_if(GameCanvas.var_dL_do instanceof w)) {
                    dangChayAuto = 0;
                    if (cd.boolean_if(TienIchGame.cfr_renamed_8(10000L) ? 1 : 0)) {
                        TienIchGame.hienThongBao(250L);
                        if ((0x28 ^ 0x2C) < "  ".length()) {
                            return;
                        }
                    }
                } else {
                    TienIchGame.hienThongBao(2000L);
                }
                GameCanvas.hienThongBaoPopup(string, this.var_ei_if);
            }
        }
    }

            /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        int n;
        block53: {
            ByteArrayOutputStream byteArrayOutputStream;
            block55: {
                FilterInputStream filterInputStream;
                HttpConnection httpConnection;
                block50: {
                    block49: {
                        try {
                            Thread.sleep(this.var_long_if);
                            }
                        catch (InterruptedException interruptedException) {
                            break block49;
                        }
                        if (" ".length() <= ((0xC ^ 0x3E) & ~(0x4D ^ 0x7F))) {
                            return;
                        }
                    }
                    httpConnection = null;
                    filterInputStream = null;
                    byteArrayOutputStream = null;
                    n = 0;
                    try {
                        httpConnection = (bl_0.java_lang_String_do(2) != null);
                        if (cd.boolean_ifhttpConnection != null) {
                            n = 0;
                            soXu = System.currentTimeMillis();
                            int n2 = (int)httpConnection.getLength();
                            filterInputStream = httpConnection.openDataInputStream();
                            if (cd.boolean_do(n2)) {
                                byte[] byArray = new byte[n2];
                                ((DataInputStream)filterInputStream).readFully(byArray);
                                this.cfr_renamed_0(bl_0.java_io_DataInputStream_do(byArray));
                                if ("   ".length() != "   ".length()) {
                                    return;
                                }
                                break block50;
                            } else {
                                int n3;
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] byArray = new byte[1024];
                                while (cd.cfr_renamed_3(n3 = ((DataInputStream)filterInputStream).read(byArray), -1)) {
                                    byteArrayOutputStream.write(byArray, 0, n3);
                                    if (-"   ".length() <= 0) continue;
                                    return;
                                }
                                byteArrayOutputStream.flush();
                                this.cfr_renamed_0(bl_0.java_io_DataInputStream_do(byteArrayOutputStream.toByteArray()));
                                }
                            break block50;
                        }
                        n = 1;
                    }
                    catch (Exception exception) {
                        block52: {
                            block51: {
                                n = 1;
                                if (cd.cfr_renamed_0((Object)httpConnection)) {
                                    try {
                                        httpConnection.close();
                                        }
                                    catch (IOException iOException) {
                                        break block51;
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
                                    break block52;
                                }
                                if (-"   ".length() > 0) {
                                    return;
                                }
                            }
                        }
                        if (!(byteArrayOutputStream != null)) break block53;
                        try {
                            byteArrayOutputStream.close();
                            }
                        catch (IOException iOException) {
                            if (" ".length() < " ".length()) {
                                return;
                            }
                            break block53;
                        }
                        if (" ".length() >= (43 + 104 - 79 + 69 ^ 122 + 46 - 69 + 42)) {
                            return;
                        }
                        break block53;
                    }
                    catch (Throwable throwable) {
                        block54: {
                            if ((httpConnection != null)) {
                                try {
                                    httpConnection.close();
                                    }
                                catch (IOException iOException) {
                                    break block54;
                                }
                                if ("   ".length() <= 0) {
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
                            }
                        catch (IOException iOException) {
                            throw throwable;
                        }
                        if (((0x1A ^ 0x77 ^ (0xEA ^ 0x99)) & (0xFD ^ 0x99 ^ (0x5F ^ 0x25) ^ -" ".length())) == 0) throw throwable;
                        return;
                    }
                }
                if (cd.cfr_renamed_0((Object)httpConnection)) {
                    try {
                        httpConnection.close();
                        }
                    catch (IOException iOException) {
                        }
                }
                if ((filterInputStream != null)) {
                    try {
                        filterInputStream.close();
                        }
                    catch (IOException iOException) {
                        break block55;
                    }
                    if (" ".length() <= 0) {
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
        }
        dangChayAuto = 0;
        if (!cd.boolean_if(n)) return;
        if (cd.boolean_if(this.soLuong, 3)) {
            TienIchGame.aq_0_do();
            TienIchGame.void_if();
            ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)this.var_ei_do;
            if (cd.boolean_if(GameCanvas.var_dL_do instanceof w)) {
                if (cd.boolean_if(TienIchGame.cfr_renamed_8(10000L) ? 1 : 0)) {
                    TienIchGame.hienThongBao(250L);
                    if (" ".length() <= 0) {
                        return;
                    }
                }
            } else {
                TienIchGame.hienThongBao(2000L);
            }
            GameCanvas.hienThongBaoPopup(bl_0.java_lang_String_do(4), this.var_ei_if);
            return;
        }
        this.cfr_renamed_4();
    }

    private static String cfr_renamed_0() {
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
        if (cd.cfr_renamed_0((Object)chuoiGiaTri)) {
            string = cfr_renamed_3 + chuoiGiaTri;
            if ((0x29 ^ 0x2D) < (0xB0 ^ 0xB4)) {
                return null;
            }
        } else {
            string = "";
        }
        return stringBuffer.append(string).toString();
    }

    protected static boolean (HttpConnection httpConnection != null) {
        if ((httpConnection.getResponseCode() == 200)) {
            return 1;
        }
        return 0;
    }

    static {
        cd.cfr_renamed_1();
        dangChayAuto = 0;
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
        nArray[11] = 69;
        nArray[12] = 65;
        nArray[13] = 67;
        nArray[14] = 65;
        nArray[15] = 70;
        nArray[16] = 71;
        nArray[17] = 51;
        nArray[18] = 59;
        nArray[19] = 6;
        tenNhanVat = TienIchGame.cfr_renamed_0(nArray);
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
        cfr_renamed_3 = TienIchGame.cfr_renamed_0(nArray2);
        soXu = 0L;
    }

    }

