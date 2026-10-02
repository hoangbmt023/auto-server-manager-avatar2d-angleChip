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

/*
 * Renamed from eM
 */
public final class em_0
extends cR {
    private static boolean dangChayAuto;
    private final byte var_byte_do;
    private static final int[] mangSoNguyen;

    private void (DataInputStream object != null) {
        switch (((DataInputStream)object).readByte()) {
            case 0: {
                object = ((DataInputStream)object).readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_for();
                ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
                TienIchGame.void_if(1000L);
                TienIchGame.cfr_renamed_1((String)object, go_0.go_0_do().var_fl_0_if, this.var_fl_0_do);
                return;
            }
            case 1: {
                int n = ((DataInputStream)object).readInt();
                if (!(n > 0)) break;
                int n2 = 0;
                while (em_0.boolean_do(n2, n)) {
                    String[] stringArray = TienIchGame.java_lang_String_arr_do(((DataInputStream)object).readUTF(), "|");
                    if ((stringArray != null)) {
                        if ((this.var_byte_do != null)) {
                            if (em_0.boolean_if(stringArray.length, 2) && (stringArray[0].equals("") ? 1 : 0 != null) && (stringArray[1].equals("") ? 1 : 0 != null)) {
                                String[] stringArray2 = new String[2];
                                stringArray2[0] = stringArray[1];
                                stringArray2[1] = null;
                                af_0.var_java_util_Vector_if.addElement(new ad(stringArray[0], stringArray2));
                                if ("  ".length() == -" ".length()) {
                                    return;
                                }
                            }
                        } else if (em_0.boolean_if(this.var_byte_do, 1) && em_0.boolean_if(stringArray.length, 3) && (stringArray[0].equals("") ? 1 : 0 != null) && (stringArray[1].equals("") ? 1 : 0 != null) && (stringArray[2].equals("") ? 1 : 0 != null)) {
                            String[] stringArray3 = new String[2];
                            stringArray3[0] = stringArray[1];
                            stringArray3[1] = stringArray[2];
                            af_0.var_java_util_Vector_do.addElement(new ad(stringArray[0], stringArray3));
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
                TienIchGame.void_for();
                ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
                TienIchGame.void_if(1000L);
                GameCanvas.cfr_renamed_1(string, this.var_fl_0_do);
                return;
            }
            case 3: {
                String string = ((DataInputStream)object).readUTF();
                String string2 = ((DataInputStream)object).readUTF();
                TienIchGame.aq_0_do();
                TienIchGame.void_for();
                ThongTinNhanVat.cfr_renamed_1().chuoiGiaTri = ((DataInputStream)object).readUTF();
                ab_0.var_ab_0_do = null;
                ab_0.cfr_renamed_1().cfr_renamed_1(new Hashtable(), string, string2, -1);
                TienIchGame.void_if(1000L);
                GameCanvas.cfr_renamed_7();
                GameCanvas.var_ez_do = ab_0.cfr_renamed_1();
                ab_0.cfr_renamed_1().cfr_renamed_5 = (int)this.var_fl_0_if;
                ab_0.cfr_renamed_1().cfr_renamed_4 = (int)this.var_fl_0_do;
            }
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    public em_0(byte by2) {
        this.cfr_renamed_0 = 0;
        this.var_byte_do = by2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

                private static void cfr_renamed_0() {
        mangSoNguyen = new int[8];
        0 = (0x62 ^ 0x2B) & ~(0xF0 ^ 0xB9);
        1 = " ".length();
        12 = 0xDF ^ 0xB3 ^ (0xE9 ^ 0x89);
        4096 = 0xFFFFBD70 & 0x528F;
        -1 = -" ".length();
        3 = "   ".length();
        4 = 38 + 54 - 45 + 102 ^ 62 + 122 - 183 + 144;
        2 = "  ".length();
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    public final void void_do() {
        if (em_0.boolean_for(dangChayAuto ? 1 : 0)) {
            return;
        }
        if (em_0.boolean_for(this.var_byte_do) && (this.var_byte_do != 1)) {
            return;
        }
        dangChayAuto = 1;
        this.cfr_renamed_0 += 1;
        new Thread(this).start();
    }

    static {
        em_0.cfr_renamed_0();
        dangChayAuto = 0;
    }

            /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        int n;
        block44: {
            TienIchGame.void_if(50L);
            n = 0;
            if (em_0.cfr_renamed_1((Object)TienIchGame.chuoiGiaTri) && (TienIchGame.chuoiGiaTri.length() > 0)) {
                FilterInputStream filterInputStream;
                ByteArrayOutputStream byteArrayOutputStream;
                block46: {
                    HttpConnection httpConnection = null;
                    byteArrayOutputStream = null;
                    filterInputStream = null;
                    try {
                        httpConnection = cR.javax_microedition_io_HttpConnection_do(TienIchGame.java_lang_String_if(br_0.java_lang_String_do(br_0.soLuong + 12) + this.var_byte_do));
                        if (em_0.boolean_for(cR.cfr_renamed_1(httpConnection) ? 1 : 0)) {
                            n = 0;
                            int n2 = (int)httpConnection.getLength();
                            filterInputStream = httpConnection.openDataInputStream();
                            if ((n2 > 0)) {
                                byte[] byArray = new byte[n2];
                                ((DataInputStream)filterInputStream).readFully(byArray);
                                this.cfr_renamed_1(br_0.java_io_DataInputStream_do(byArray));
                                } else {
                                int n3;
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] byArray = new byte[4096];
                                while (em_0.cfr_renamed_3(n3 = ((DataInputStream)filterInputStream).read(byArray), -1)) {
                                    byteArrayOutputStream.write(byArray, 0, n3);
                                    if (("   ".length() & ~"   ".length()) == 0) continue;
                                    return;
                                }
                                byteArrayOutputStream.flush();
                                this.cfr_renamed_1(br_0.java_io_DataInputStream_do(byteArrayOutputStream.toByteArray()));
                            }
                            af_0.cfr_renamed_3();
                            GameCanvas.cfr_renamed_7();
                            } else {
                            n = 1;
                        }
                    }
                    catch (Exception exception) {
                        block43: {
                            n = 1;
                            if ((httpConnection != null)) {
                                try {
                                    httpConnection.close();
                                    }
                                catch (IOException iOException) {
                                    break block43;
                                }
                                if (-" ".length() != -" ".length()) {
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
                        if (!(byteArrayOutputStream != null)) break block44;
                        try {
                            byteArrayOutputStream.close();
                            }
                        catch (IOException iOException) {
                            if (((0xFC ^ 0x8F ^ (0x2A ^ 0x11)) & (0x4E ^ 0x1B ^ (0x7E ^ 0x63) ^ -" ".length())) != 0) {
                                return;
                            }
                            break block44;
                        }
                        if (((0xA7 ^ 0x9F ^ (0x8E ^ 0xB9)) & (0x61 ^ 0x57 ^ (0x81 ^ 0xB8) ^ -" ".length())) == -" ".length()) {
                            return;
                        }
                        break block44;
                    }
                    catch (Throwable throwable) {
                        block45: {
                            if ((httpConnection != null)) {
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
                                    break block45;
                                }
                                if (((71 + 125 - 137 + 153 ^ 57 + 53 - 9 + 36) & (0x16 ^ 0x65 ^ (0x93 ^ 0xBD) ^ -" ".length())) != 0) {
                                    return;
                                }
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
                    if (em_0.cfr_renamed_1((Object)httpConnection)) {
                        try {
                            httpConnection.close();
                            }
                        catch (IOException iOException) {
                            break block46;
                        }
                        if (((0x14 ^ 0x1E ^ (0x3B ^ 0x62)) & (0x29 ^ 0x3B ^ (0xF5 ^ 0xB4) ^ -" ".length())) != 0) {
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
                if ((byteArrayOutputStream != null)) {
                    try {
                        byteArrayOutputStream.close();
                        }
                    catch (IOException iOException) {
                        if (" ".length() != " ".length()) {
                            return;
                        }
                        break block44;
                    }
                    if ((0x3F ^ 0x3B) < "  ".length()) {
                        return;
                    }
                }
            }
        }
        dangChayAuto = 0;
        if (!em_0.boolean_for(n)) return;
        if ((this.cfr_renamed_0 >= 3)) {
            TienIchGame.aq_0_do();
            TienIchGame.void_for();
            ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
            TienIchGame.void_if(1000L);
            GameCanvas.cfr_renamed_1(br_0.java_lang_String_do(4), this.var_fl_0_do);
            return;
        }
        this.void_do();
    }
}

