/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.HttpConnection
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Hashtable;
import javax.microedition.io.HttpConnection;

public final class gl
extends cd {
    private static final int[] mangSoNguyen;
    private final byte var_byte_do;
    private static boolean cfr_renamed_1;

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[8];
        0 = (0xE1 ^ 0xBB) & ~(0x2B ^ 0x71);
        1 = " ".length();
        6 = 0xAA ^ 0xAC;
        4096 = 0xFFFFDFE6 & 0x3019;
        -1 = -" ".length();
        3 = "   ".length();
        4 = 0x1C ^ 0x30 ^ (0xAB ^ 0x83);
        2 = "  ".length();
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

        static {
        gl.cfr_renamed_1();
        cfr_renamed_1 = 0;
    }

        private static boolean boolean_if(int n) {
        return n > 0;
    }

    public gl(byte by2) {
        this.mangSoNguyen = (int[])0;
        this.var_byte_do = by2;
    }

        public final void cfr_renamed_4() {
        if ((cfr_renamed_1)) {
            return;
        }
        if ((this.var_byte_do != 0) && (this.var_byte_do != 1)) {
            return;
        }
        cfr_renamed_1 = 1;
        this.mangSoNguyen = this.mangSoNguyen + 1;
        new Thread(this).start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        int n;
        block50: {
            TienIchGame.hienThongBao(50L);
            n = 0;
            if (gl.cfr_renamed_0((Object)TienIchGame.tenNhanVat) && gl.boolean_if(TienIchGame.tenNhanVat.length())) {
                ByteArrayOutputStream byteArrayOutputStream;
                block54: {
                    FilterInputStream filterInputStream;
                    block53: {
                        HttpConnection httpConnection = null;
                        byteArrayOutputStream = null;
                        filterInputStream = null;
                        try {
                            httpConnection = cd.cfr_renamed_0(TienIchGame.java_lang_String_do(bl_0.java_lang_String_do(bl_0.soLuong + 6) + this.var_byte_do));
                            if ((cd.cfr_renamed_0(httpConnection))) {
                                n = 0;
                                int n2 = (int)httpConnection.getLength();
                                filterInputStream = httpConnection.openDataInputStream();
                                if (gl.boolean_if(n2)) {
                                    byte[] byArray = new byte[n2];
                                    ((DataInputStream)filterInputStream).readFully(byArray);
                                    this.cfr_renamed_0(bl_0.java_io_DataInputStream_do(byArray));
                                    } else {
                                    int n3;
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    byte[] byArray = new byte[4096];
                                    while (gl.cfr_renamed_4(n3 = ((DataInputStream)filterInputStream).read(byArray), -1)) {
                                        byteArrayOutputStream.write(byArray, 0, n3);
                                        if ("   ".length() != -" ".length()) continue;
                                        return;
                                    }
                                    byteArrayOutputStream.flush();
                                    this.cfr_renamed_0(bl_0.java_io_DataInputStream_do(byteArrayOutputStream.toByteArray()));
                                }
                                T.void_do();
                                GameCanvas.cfr_renamed_8();
                                if (-"  ".length() > 0) {
                                    return;
                                }
                            } else {
                                n = 1;
                            }
                        }
                        catch (Exception exception) {
                            block49: {
                                block48: {
                                    n = 1;
                                    if ((httpConnection != null)) {
                                        try {
                                            httpConnection.close();
                                            }
                                        catch (IOException iOException) {
                                            break block48;
                                        }
                                        if ("  ".length() == -" ".length()) {
                                            return;
                                        }
                                    }
                                }
                                if ((filterInputStream != null)) {
                                    try {
                                        filterInputStream.close();
                                        }
                                    catch (IOException iOException) {
                                        break block49;
                                    }
                                    if (-" ".length() >= (79 + 37 - 88 + 110 ^ 0 + 20 - -89 + 33)) {
                                        return;
                                    }
                                }
                            }
                            if (!(byteArrayOutputStream != null)) break block50;
                            try {
                                byteArrayOutputStream.close();
                                }
                            catch (IOException iOException) {
                                break block50;
                            }
                            if ("  ".length() <= -" ".length()) {
                                return;
                            }
                            break block50;
                        }
                        catch (Throwable throwable) {
                            block52: {
                                block51: {
                                    if ((httpConnection != null)) {
                                        try {
                                            httpConnection.close();
                                            }
                                        catch (IOException iOException) {
                                            break block51;
                                        }
                                        if (-" ".length() > 0) {
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
                                    if ("   ".length() == 0) {
                                        return;
                                    }
                                }
                            }
                            if (!(byteArrayOutputStream != null)) throw throwable;
                            try {
                                byteArrayOutputStream.close();
                                }
                            catch (IOException iOException) {
                                throw throwable;
                            }
                            if (((16 + 95 - -2 + 15 ^ 35 + 31 - -56 + 21) & (0x50 ^ 0x23 ^ (0x60 ^ 0x1C) ^ -" ".length())) < "   ".length()) throw throwable;
                            return;
                        }
                        if (gl.cfr_renamed_0((Object)httpConnection)) {
                            try {
                                httpConnection.close();
                                }
                            catch (IOException iOException) {
                                break block53;
                            }
                            if ("   ".length() <= "  ".length()) {
                                return;
                            }
                        }
                    }
                    if ((filterInputStream != null)) {
                        try {
                            filterInputStream.close();
                            }
                        catch (IOException iOException) {
                            break block54;
                        }
                        if ((0x3E ^ 0x12 ^ (0x84 ^ 0xAC)) <= "   ".length()) {
                            return;
                        }
                    }
                }
                if ((byteArrayOutputStream != null)) {
                    try {
                        byteArrayOutputStream.close();
                        }
                    catch (IOException iOException) {
                        if ("  ".length() <= ((0x18 ^ 0x7B) & ~(0xC8 ^ 0xAB))) {
                            return;
                        }
                        break block50;
                    }
                    if ("   ".length() >= (85 + 22 - 84 + 130 ^ 123 + 94 - 77 + 17)) {
                        return;
                    }
                }
            }
        }
        cfr_renamed_1 = 0;
        if (!(n != 0)) return;
        if (gl.boolean_do((int)this.mangSoNguyen, 3)) {
            TienIchGame.aq_0_do();
            TienIchGame.void_if();
            ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)this.var_ei_do;
            TienIchGame.hienThongBao(1000L);
            GameCanvas.hienThongBaoPopup(bl_0.java_lang_String_do(4), this.var_ei_if);
            return;
        }
        this.cfr_renamed_4();
    }

        private void (DataInputStream object != null) {
        switch (((DataInputStream)object).readByte()) {
            case 0: {
                object = ((DataInputStream)object).readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_if();
                ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)this.var_ei_do;
                TienIchGame.hienThongBao(1000L);
                TienIchGame.cfr_renamed_1((String)object, fe_0.fe_0_do().var_ei_if, this.var_ei_if);
                return;
            }
            case 1: {
                int n = ((DataInputStream)object).readInt();
                if (!gl.boolean_if(n)) break;
                int n2 = 0;
                while (gl.boolean_if(n2, n)) {
                    String[] stringArray = TienIchGame.java_lang_String_arr_do(((DataInputStream)object).readUTF(), "|");
                    if ((stringArray != null)) {
                        if (gl.boolean_do(this.var_byte_do)) {
                            if ((stringArray.length == 2) && gl.boolean_do(stringArray[0].equals("") ? 1 : 0) && gl.boolean_do(stringArray[1].equals("") ? 1 : 0)) {
                                String[] stringArray2 = new String[2];
                                stringArray2[0] = stringArray[1];
                                stringArray2[1] = null;
                                T.var_java_util_Vector_if.addElement(new R(stringArray[0], stringArray2));
                                if (" ".length() != " ".length()) {
                                    return;
                                }
                            }
                        } else if ((this.var_byte_do == 1) && (stringArray.length == 3) && gl.boolean_do(stringArray[0].equals("") ? 1 : 0) && gl.boolean_do(stringArray[1].equals("") ? 1 : 0) && gl.boolean_do(stringArray[2].equals("") ? 1 : 0)) {
                            String[] stringArray3 = new String[2];
                            stringArray3[0] = stringArray[1];
                            stringArray3[1] = stringArray[2];
                            T.var_java_util_Vector_do.addElement(new R(stringArray[0], stringArray3));
                        }
                    }
                    ++n2;
                    return;
                }
                System.gc();
                return;
            }
            case -1: {
                String string = ((DataInputStream)object).readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_if();
                ThongTinNhanVat.cfr_renamed_0().var_int_int = (int)this.var_ei_do;
                TienIchGame.hienThongBao(1000L);
                GameCanvas.hienThongBaoPopup(string, this.var_ei_if);
                return;
            }
            case 3: {
                String string = ((DataInputStream)object).readUTF();
                String string2 = ((DataInputStream)object).readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_if();
                ThongTinNhanVat.cfr_renamed_0().tenNhanVat = ((DataInputStream)object).readUTF();
                p_0.var_p_0_do = null;
                p_0.p_0_do().cfr_renamed_0(new Hashtable(), string, string2, -1);
                TienIchGame.hienThongBao(1000L);
                GameCanvas.cfr_renamed_8();
                GameCanvas.var_dX_do = p_0.p_0_do();
                p_0.p_0_do().cfr_renamed_4 = (int)this.var_ei_do;
                p_0.p_0_do().cfr_renamed_2 = (int)this.var_ei_if;
            }
        }
    }
}

